let signup = document.getElementById("submit");
let firstName = document.getElementById("firstName");
let lastName = document.getElementById("lastName");
let email = document.getElementById("email");
let password = document.getElementById("password");
let form=document.forms[0];
let error = document.getElementById("error");


let firstNameError = document.getElementById("firstNameError");
let lastNameError = document.getElementById("LastNameError");
let emailError = document.getElementById("emailError");
let passwordError = document.getElementById("passwordError");

let firstNameValidError;
let lastNameValidError;



function  onClickingButton() {
    let firstNameValid = true;
    let lastNameValid = true;
    let emailValid = true;
    let passwordValid = true;
    if (firstName.value == "" ) {
        
        firstNameError.innerText = "First name is required";
        firstNamevalid=false;
        return;
        
    }
   else if(!firstName.value.match( /^[A-Za-z]+$/)){
         
        firstNameError.innerText = "Numbers cannot be included in name";
        firstNamevalid=false;
        return;
    }
    if (lastName.value == "" ) {
        
        lastNameError.innerText = "Last name is required";
        lastNamevalid=false;
        return;
    }
    else if(!lastName.value.match( /^[A-Za-z]+$/)){
         
        lastNameError.innerText = "Numbers and Special Charcters can not be included in Lastname";
        lastNamevalid=false;
        return;
    }
    if(email.value == ""){
        emailError.innerText = "Email is mandatory";
        emailValid = false;
    }
    else if(!email.value.match(/[a-z0-9._%+-]+@[a-z0-9.9.-]+\.[a-z]{2,}$/)){
        emailError.innerText="Enter in valid format. Example abc@mail.com";
        emailValid = false;
    }
    if(password.value == ""){
        passwordError.innerText = "Password is Mandatory";
        passwordValid = false;
    }
    if(firstNameValid == true && lastNameValid == true && emailValid == true && passwordValid == true && firstNameValidError == true && lastNameValidError == true){
        console.log("Clicked");
        addCustomer(); 
    }
}

firstName.addEventListener("keyup", function () {
    //console.log(firstName.value);
   firstNameValidError = true;
    if (firstName.value != "" && firstName.value.length > 20) {
        firstNameValidError = false;
        firstNameError.innerText = "First Name cannot exceed 20 characters";
        return;
    }
    if (firstName.value != "" && firstName.value.length <= 20) {
        
       
        firstNameError.innerText = "";
        return;
    }
    
   
});
lastName.addEventListener("keyup", function () {
    //console.log(firstName.value);
    lastNameValidError = true;
    if (lastName.value != "" && lastName.value.length > 20) {
        
        lastNameValidError = false;
        lastNameError.innerText = "Last Name cannot exceed 20 characters";
        return;
    }
    if (lastName.value != "" && lastName.value.length <= 20) {
        
        lastNameError.innerText = "";
        return;
    }
});
email.addEventListener("keyup", function () {
    
    if (email.value != "" ) {
        emailError.innerText = "";
        return;
    }
    
});

password.addEventListener("keyup", function(){
    if (password.value != "" && password.value.length <= 20) {
        console.log("called");
        passwordError.innerText = "";
        return;
    }
})


async function addCustomer() {
    let customer = {
        firstName: form.firstName.value,
        lastName: form.lastName.value,
        email: form.email.value,
        password: form.password.value
    };

    var options = {
        method: 'POST',
        headers: { "Content-Type": "application/json"},
        body: JSON.stringify(customer)
    };

    try {
        let response = await fetch("http://localhost:8080/bank-app-rest/employees", options);
        console.log("database conection");
        clearFormData();
        window.open("employeelogin.html");
    } catch (err) {
    }
}



function clearFormData(){
    form.firstName.value="";
    form.lastName.value="";
    form.email.value="";
    form.password.value="";


}
