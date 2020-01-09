# Minischeme Web [![GitHub license](https://img.shields.io/badge/license-MIT-blue.svg)](https://github.com/fxg42/minischeme-parser/blob/master/LICENSE)

Créé dans le cadre du projet de session pour INF2050 à l'hiver 2019.


## Prérequis

- JDK 11


## Compilation et exécution avec Gradle

    ./gradlew bootRun

ou, en windows:

    gradlew.bat bootRun

L'application sera alors accessible à l'adresse [http://localhost:8080](http://localhost:8080).


## Compilation et exécution avec Maven

    ./mvnw spring-boot:run

ou, en windows:

    mvnw.cmd spring-boot:run

L'application sera alors accessible à l'adresse [http://localhost:8080](http://localhost:8080).

---

## Tests UI

Pour rouler les tests il faut faut d'abord Google Chrome ou Mozilla Firefox avec l'extension Selenium IDE:

**Chrome**:  https://chrome.google.com/webstore/detail/selenium-ide/mooikfkahbdckldjjndioackbalphokd?hl=en

**Fifrefox**:  https://addons.mozilla.org/en-US/firefox/addon/selenium-ide/?src=search

Une fois que vous avez lancer le serveur localhost, ouvrez l'extension **Selenium IDE** de Firefox ou Chrome et ouvrez le projet `web.side` qui se trouve à la racine du projet.
