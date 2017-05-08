$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("demo.feature");
formatter.feature({
  "line": 1,
  "name": "Open baidu",
  "description": "",
  "id": "open-baidu",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3839220780,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Open Baidu home page",
  "description": "",
  "id": "open-baidu;open-baidu-home-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "Open baidu from safari",
  "keyword": "Given "
});
formatter.match({
  "location": "Demo.Open_baidu_from_safari()"
});
formatter.result({
  "duration": 13410736614,
  "status": "passed"
});
});