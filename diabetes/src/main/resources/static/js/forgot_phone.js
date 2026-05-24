
    const phoneInput = document.getElementById('phoneNumber');
    const phoneHint = document.getElementById('phoneHint');

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

    document.getElementById('forgotPhoneForm').addEventListener('submit', (e) => {
    // e.preventDefault();
    // Validation logic can be added here
    // The form will naturally navigate to forgot-otp.html for demonstration
});