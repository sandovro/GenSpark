const emailreg = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;

// Password must have 7 to 15 characters and at least 1 numeric digit and 1 special character
const passwordreg = /^(?=.*[0-9])(?=.*[!@#$%^&*])[a-zA-Z0-9!@#$%^&*]{7,15}$/;

function validateEmail(email) {
    return emailreg.test(email);
}

function validatePassword(password) {
    return passwordreg.test(password);
}

function validateLogin(){
    if(validateEmail(document.getElementById("email").value)&&validatePassword(document.getElementById("password").value)) {
        console.log("Valid log in");
    } else {
        console.log("Invalid log in. Please check email or password");
    }
}