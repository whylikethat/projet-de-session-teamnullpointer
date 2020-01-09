# Minischeme

Le langage minischeme a été conçu par Francois-Xavier Guillemette et permet de coder des fonctions avec des opérateurs simples ainsi que des opérateurs de portes logiques.

*L'application web contient son propre README dans le répertoire* `minischeme-web`

## Dépendances

- JDK 11

## Instructions:

*Si vous n'avez pas Gradle sur votre machine, remplacez `gradle` par `./gradlew` et le wrapper fera le reste.*

Par exemple, au lieu de `gradle build` vous devez entrer `./gradlew build`.

Afin d'avoir une copie du projet, il suffit d'entrer la commande:

`git clone https://github.com/INF2050-40-H2019/projet-de-session-teamnullpointer.git` dans votre terminal.

Si vous avez déjà une copie de ce projet, il suffit de faire `git pull` pour avoir la version courante.

Les fichiers sources sont dans le répertoire `src`.

#### Pour comprendre le format qu'utilise l'application
[CLICK ICI](00_projet-session.pdf) *PAGE 29* où vous pouvez voir les exemples dans le répértoire `examples`

Une fois que vous avez une copie de la version courante du projet, dans la racine du projet, vous pouvez rouler le build avec `gradle build` et explorez le projet comme vous désirez.
Si vous souhaitez uniquement compiler, il faut entrer `gradle compileJava` pour compiler les fichers du programme ou `gradle compileTestJava` pour compiler les fichiers de tests.

**Pour faire rouler les tests:** `gradle test`.

**Pour générer la documentation du code source:** `gradle javadoc`

La documentation sera dans le répértoire `build/docs/javadoc`

Pour générer un fichier JAR exécutable: `gradle uberJar`. Le JAR qui contient toutes les dépendances nécéssaires se nomme: `minischeme.jar` et se trouve dans le répértoire `build/libs/`

Une fois que le fichier JAR est généré avec toutes les dépendances, pour rouler l'application, il faut entrer la commande java avec l'option JAR suivi par le répertoire du fichier JAR et par le fichier minischeme que vous voulez passer en paramètre. Les fichiers minischeme se trouvent dans le répertoire `examples`.

Par exemple: `java -jar build/libs/minischeme.jar examples/facto.minischeme`

Durant la phase test, des rapports de calcul de couverture de tests sont générés par le plugin **Jacoco**. Ces rapports se trouvent dans le répertoire créé: `build/reports/jacoco/`
Durant la phase compilation, des rapports d'analyse statique sont générés par les plugins **PMD** et **Checkstyle**. Ces rapports *html* se trouvent dans les répertoires crées: `build/reports/pmd/` et `build/reports/checkstyle`.

Une fois que vous avez terminé avec le projet, vous pouvez entrer la commande `gradle clean` pour effacer le répertoire `build`. D'ailleurs, vous pouvez entrer cette commande en tout temps suivi d'autres commandes.

Par exemple: `gradle clean build`

---

## Compilation et exécution des tests avec Gradle

`./gradlew junitConsole`

ou, en windows:

`gradlew.bat junitConsole`


L'application sera alors accessible à l'adresse [http://localhost:8080](http://localhost:8080).

---

#### Pour exécuter le programme minischeme qui montre comment construire les portes logiques NAND, NOR, OR , XOR:

Premièrement, il faut créer le fichier *JAR* avec toutes les dépendances nécessaires afin d'exécuter le programme avec la commande:
`gradle uberJar`

Ensuite, pour exécuter le programme:
`java -jar build/libs/minischeme.jar examples/lesPortes.minischeme`

### Pour lancer le serveur d'intégration continu:

D'abord, il faut entrer la commande suivante dans le terminal: `java -jar jenkins.war`

L'application sera alors accessible à l'adresse http://localhost:8080.

## Contact

Nom:    John Malkhassian

E-mail: ad591085@ens.uqam.ca

## Droits d'auteur

SABINE CANDIO : CANS30589104

ALEX SOARES : SOAA01037905

CHERAZ MECHTI : MECC25539000

JOHN MALKHASSIAN : MALJ14038702

