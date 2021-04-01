$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("test/java/features/login.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# language: pt"
    }
  ],
  "line": 2,
  "name": ": Login",
  "description": "Como usuário\r\nEu quero fazer login\r\nPara que eu possa acessar minha aréa do cliente",
  "id": ":-login",
  "keyword": "Funcionalidade"
});
formatter.before({
  "duration": 21792307400,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "Fazer o login no site Bemol",
  "description": "",
  "id": ":-login;fazer-o-login-no-site-bemol",
  "type": "scenario",
  "keyword": "Cenario"
});
formatter.step({
  "line": 8,
  "name": "que faço o login",
  "keyword": "Dado "
});
formatter.step({
  "line": 9,
  "name": "insiro as credenciais",
  "keyword": "Quando "
});
formatter.step({
  "line": 10,
  "name": "visualizo a minha pagina de cliente",
  "keyword": "Então "
});
formatter.match({
  "location": "login_stepsTest.que_faço_o_login()"
});
formatter.result({
  "duration": 6603686900,
  "status": "passed"
});
formatter.match({
  "location": "login_stepsTest.insiro_as_credenciais()"
});
formatter.result({
  "duration": 2191961600,
  "status": "passed"
});
formatter.match({
  "location": "login_stepsTest.visualizo_a_minha_pagina_de_cliente()"
});
formatter.result({
  "duration": 8162279000,
  "status": "passed"
});
formatter.after({
  "duration": 1803391200,
  "status": "passed"
});
});