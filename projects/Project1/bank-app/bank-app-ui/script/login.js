let email= document.getElementById("email");
let pass = document.getElementById("password");
let form = document.getElementById("frm");
let Login = document.getElementById("submit");



async function loginCustomer(){

try {
    let response = await fetch("http://localhost:8080/bank-app-rest/customers");
     if(response.status == "401"){
         alert(" login failed");
         console.log("defvr");
     }
     if(response.status == 200){

         //display
     }
     if(response.status == "500"){
        alert(" error");
         //display
     }

     

} catch (err) {

}
}
Login.addEventListener("click",function(){
    
    loginCustomer();
    window.location.href="createaccount.html";

});