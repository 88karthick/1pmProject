$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/FeatureFile/LoginFacebook.feature");
formatter.feature({
  "name": "To validate Login funcationality of Facebook application",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@feature2"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User have to enter facebook login through chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_have_to_enter_facebook_login_through_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "",
  "description": "    To validate login by using valid email and invalid password",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@feature2"
    },
    {
      "name": "@value2"
    }
  ]
});
formatter.step({
  "name": "User have to enter Valid email and invalid password",
  "rows": [
    {
      "cells": [
        "username",
        "Gowri"
      ]
    },
    {
      "cells": [
        "password",
        "45678"
      ]
    },
    {
      "cells": [
        "email",
        "greens@gmail.com"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_have_to_enter_Valid_email_and_invalid_password(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user have to click login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_have_to_click_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user have to show credentials page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_have_to_show_credentials_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User have to enter facebook login through chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_have_to_enter_facebook_login_through_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "",
  "description": "      To validate login by using invalid email and invalid password",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@feature2"
    },
    {
      "name": "@value3"
    }
  ]
});
formatter.step({
  "name": "User have to enter INVALID email and invalid password",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "mail",
        "course"
      ]
    },
    {
      "cells": [
        "automation1",
        "manual",
        "framework",
        "tags"
      ]
    },
    {
      "cells": [
        "testng",
        "pom",
        "junit",
        "array"
      ]
    },
    {
      "cells": [
        "exception",
        "action",
        "robot",
        "testing"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_have_to_enter_INVALID_email_and_invalid_password(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user have to click login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_have_to_click_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user have to show credentials page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_have_to_show_credentials_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/FeatureFile/forgotPassword.feature");
formatter.feature({
  "name": "",
  "description": "To validate forgot password of Facebook Application",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@feature1"
    }
  ]
});
formatter.scenario({
  "name": "",
  "description": "To validate forgot password",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@feature1"
    },
    {
      "name": "@value1"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User have to enter facebook through chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition2.user_have_to_enter_facebook_through_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User have to click forgot password",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition2.user_have_to_click_forgot_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User have to enter phone number",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition2.user_have_to_enter_phone_number()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User have to click search button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition2.user_have_to_click_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});