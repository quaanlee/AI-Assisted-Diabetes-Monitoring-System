
    const roleSelect = document.getElementById('role');
    const patientFields = document.getElementById('patientFields');
    const doctorFields = document.getElementById('doctorFields');
    const phoneInput = document.getElementById('phoneNumber');
    const passwordInput = document.getElementById('password');
    const confirmInput = document.getElementById('confirmPassword');
    const phoneHint = document.getElementById('phoneHint');
    const passwordHint = document.getElementById('passwordHint');
    const confirmHint = document.getElementById('confirmHint');

    // Hiển thị form theo role
    roleSelect.addEventListener('change', function() {
    if (this.value === 'DOC') {
    patientFields.style.display = 'none';
    doctorFields.style.display = 'block';
} else {
    patientFields.style.display = 'block';
    doctorFields.style.display = 'none';
}
});

    // Validate phone
    phoneInput.addEventListener('input', function() {
    this.value = this.value.replace(/[^0-9]/g, '').slice(0, 11);
    if (this.value.length > 0 && (this.value.length < 10 || this.value.length > 11)) {
    phoneHint.style.display = 'block';
    this.classList.add('error');
} else {
    phoneHint.style.display = 'none';
    this.classList.remove('error');
}
});

    // Validate password
    passwordInput.addEventListener('input', function() {
    if (this.value.length > 0 && this.value.length < 6) {
    passwordHint.style.display = 'block';
    this.classList.add('error');
} else {
    passwordHint.style.display = 'none';
    this.classList.remove('error');
}
    if (confirmInput.value.length > 0 && confirmInput.value !== this.value) {
    confirmHint.style.display = 'block';
    confirmInput.classList.add('error');
} else {
    confirmHint.style.display = 'none';
    confirmInput.classList.remove('error');
}
});

    confirmInput.addEventListener('input', function() {
    if (this.value !== passwordInput.value) {
    confirmHint.style.display = 'block';
    this.classList.add('error');
} else {
    confirmHint.style.display = 'none';
    this.classList.remove('error');
}
});

    // Submit
    document.getElementById('registerForm').addEventListener('submit', async (e) => {
    e.preventDefault();

    const roleId = document.getElementById('role').value;
    const fullName = document.getElementById('fullName').value.trim();
    const phoneNumber = phoneInput.value.trim();
    const password = passwordInput.value;
    const confirmPassword = confirmInput.value;
    const terms = document.getElementById('terms').checked;

    const errorDiv = document.getElementById('errorMsg');
    const successDiv = document.getElementById('successMsg');

    errorDiv.style.display = 'none';
    successDiv.style.display = 'none';

    if (!fullName) {
    errorDiv.style.display = 'block';
    errorDiv.textContent = 'Vui lòng nhập họ và tên!';
    return;
}
    if (!phoneNumber || phoneNumber.length < 10) {
    errorDiv.style.display = 'block';
    errorDiv.textContent = 'Số điện thoại không hợp lệ!';
    return;
}
    if (!password || password.length < 6) {
    errorDiv.style.display = 'block';
    errorDiv.textContent = 'Mật khẩu phải có ít nhất 6 ký tự!';
    return;
}
    if (password !== confirmPassword) {
    errorDiv.style.display = 'block';
    errorDiv.textContent = 'Mật khẩu xác nhận không khớp!';
    return;
}
    if (!terms) {
    errorDiv.style.display = 'block';
    errorDiv.textContent = 'Vui lòng đồng ý với Điều khoản sử dụng!';
    return;
}

    const userData = {
    roleId: roleId,
    fullName: fullName,
    phoneNumber: phoneNumber,
    password: password
};

    if (roleId === 'PAT') {
    userData.dob = document.getElementById('dob').value;
    userData.gender = document.getElementById('gender').value;
    userData.bloodGroup = document.getElementById('bloodGroup').value;
    userData.height = document.getElementById('height').value;
    userData.weight = document.getElementById('weight').value;
    userData.address = document.getElementById('address').value;
    userData.medicalHistory = document.getElementById('medicalHistory').value;
    userData.allergyNotes = document.getElementById('allergyNotes').value;
} else {
    userData.specialty = document.getElementById('specialty').value;
    userData.licenseNumber = document.getElementById('licenseNumber').value;
}

    try {
    const response = await fetch('/api/register', {
    method: 'POST',
    headers: { 'Content-Type': 'application/json' },
    body: JSON.stringify(userData)
});
    const data = await response.json();

    if (data.success) {
    successDiv.style.display = 'block';
    successDiv.textContent = 'Đăng ký thành công! Chuyển hướng đến trang đăng nhập...';
    setTimeout(() => {
    window.location.href = '/login.html';
}, 2000);
} else {
    errorDiv.style.display = 'block';
    errorDiv.textContent = data.message || 'Đăng ký thất bại!';
}
} catch (error) {
    errorDiv.style.display = 'block';
    errorDiv.textContent = 'Lỗi kết nối server!';
}
});