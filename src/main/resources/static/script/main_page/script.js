"use strict";

const menu_icon = document.querySelector(".show-menu");
const close_icon = document.querySelector(".close-icon");
const menu = document.querySelector(".menu");
const curtain = document.getElementById("curtain");

menu_icon.addEventListener("click", () => {
  menu_icon.classList.add("elem-disappear");
  menu.classList.remove("elem-disappear");
  curtain.classList.remove("elem-disappear");
});

close_icon.addEventListener("click", () => {
  menu_icon.classList.remove("elem-disappear");
  menu.classList.add("elem-disappear");
  curtain.classList.add("elem-disappear");
});
