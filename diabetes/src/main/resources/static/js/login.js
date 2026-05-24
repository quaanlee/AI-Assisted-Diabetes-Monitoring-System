
    document.getElementById('loginForm').addEventListener('submit', async (e) => {
    e.preventDefault();
    const phoneNumber = document.getElementById('phoneNumber').value;
    const password = document.getElementById('password').value;
    const errorDiv = document.getElementById('errorMsg');

    errorDiv.style.display = 'none';

    if (!phoneNumber || !password) {
    errorDiv.style.display = 'block';
    errorDiv.textContent = 'Vui lòng nhập số điện thoại và mật khẩu!';
    return;
}

    try {
    const response = await fetch('/api/login', {
    method: 'POST',
    headers: { 'Content-Type': 'application/json' },
    body: JSON.stringify({ phoneNumber, password })
});
    const data = await response.json();

    if (data.success) {
    localStorage.setItem('user', JSON.stringify(data.user));
    if (data.user.roleId === 'DOC') {
    window.location.href = '/doctor-dashboard.html';
} else if (data.user.roleId === 'PAT') {
    window.location.href = '/patient-dashboard.html';
} else {
    window.location.href = '/dashboard.html';
}
} else {
    errorDiv.style.display = 'block';
    errorDiv.textContent = data.message || 'Sai số điện thoại hoặc mật khẩu!';
}
} catch (error) {
    errorDiv.style.display = 'block';
    errorDiv.textContent = 'Lỗi kết nối đến server!';
}
});