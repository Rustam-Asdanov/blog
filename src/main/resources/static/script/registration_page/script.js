"use strict";

const form = document.getElementById("registration");

const full_name = document.getElementById("full-name-reg");

const password = document.getElementById("password-reg");

const mail_reg = document.getElementById("email-reg");
let isClear = true;
function check(){

  const fullNameValue = full_name.value.trim();
  checkInputs(full_name, fullNameValue);
  const passwordValue = password.value.trim();
  checkInputs(password, passwordValue);
  const mailValue = mail_reg.value.trim();
  checkInputs(mail_reg, mailValue);
  if(checkNum==false) return false;
  return true;
};

function checkInputs(input, content) {
  // get values from the inputs

  if (content === "") {
    isClear = false;
    // show error
    // add error class
    input.classList.add("error");
    setErrorFor(input.nextElementSibling, "Username cannot be blank");
  } else {
    // add success class
    input.className = "success";
    input.nextElementSibling.children[0].classList.remove("hidden-suc");
    input.nextElementSibling.children[1].classList.add("hidden-err");
    input.nextElementSibling.children[2].classList.add("hidden-err");
  }
}

function setErrorFor(input, message) {
  //   formControl.className = "validation";

  console.log(input.children);

  input.children[1].classList.remove("hidden-err");
  input.children[2].classList.remove("hidden-err");

  input.querySelector("small").textContent = message;
}
