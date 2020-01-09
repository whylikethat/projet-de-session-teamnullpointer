#### UNIVERSITÉ DU QUÉBEC À MONTRÉAL



## MAVEN VS GRADLE



#### PRÉSENTÉ À L’UNIVERSITÉ DU QUÉBEC À MONTRÉAL
#### COMME EXIGENCE DU COURS INF2050 GR.40



#### À FRANÇOIS-XAVIER GUILLEMETTE


#### PAR SABINE CANDIO: CANS30589104 
#### ALEX SOARES : SOAA01037905 
#### CHERAZ MECHTI : MECC25539000
#### JOHN MALKHASSIAN : MALJ14038702

#### DÉPARTEMENT DE L’INFORMATIQUE
#### 21 FÉVRIER 2019


# Maven:
**Apache Maven** est un outil de gestion et de construction de projet développé
par *apache Software Foundation*, qui permet d'automatiser certaines tâches d'un projet java (compilation,
tests unitaires, production de livrable). Ce dernier utilise des fichiers XML.
Maven nous permet de nous concentrer sur ce que notre construction devrait faire et
nous donne le cadre pour le faire.
Un autre aspect positif de Maven est qu’il fournit un support intégré pour la gestion
de la dépendance.
Le fichier de configuration de Maven, contenant les instructions de construction et de gestion des dépendances, 
est appelé par convention pom.xml (Project Object Model).
**Maven** définit un cycle de vie de construction qui consiste en une séquence de phases.
Voici, par exemple, différentes phases du cycle de vie de Maven:
compile - compiler le code source du projet (création des fichiers .class à partir des fichiers .java)
test - exécuter les tests automatisés du projet
package - exemple: placer tous les fichiers .class dans un fichier JAR
install, deploy etc...

# Gradle:
**Gradle** est un outil de gestion des dépendances et d’automatisation de construction de projets
(java, scala, groovy et C++) qui a été développé par *Gradleware et la communauté Gradle*. Sa première version a été déployée en 2007. 
Il a été construit sur les mêmes concepts de Maven et Ant (il combine la flexibilité de Ant,
la gestion des dépendances et la simplicité d'utilisation de Maven)
Ce dernier utilise un langage spécifique (DSL :Domain Specific Language),
basé sur le langage de programmation Groovy, le différenciant d'Apache Maven (qui utilise le XML). 
Le fichier de configuration de Gradle est, par convention, appelé build.gradle. Ce fichier se trouve dans le dossier racine du projet.
**Gradle** est composé de deux concepts : projets et tâches. Chaque projet comprend des tâches et chaque tâche représente un travail effectué.
Le système de construction Gradle utilise des plugins ajoutant généralement certaines tâches préconfigurées.

---

# La flexibilité

La flexibilité d'un outil de build est déterminée par sa capacité de subvenir facilement aux besoins de l'usager. Le nombre de fonctionnalités, les commandes du terminal, son adaptabilité aux situations différentes, le temps que prend l'outil pour construire un build et la capacité de modifier les tâches automatisées sont tous des façons d'évaluer sa flexibilité. Un outil qui est capable de gérer plusieurs tâches avancées est considéré flexible.

Ce critère est l'un des plus importants chez les développeurs dans leurs choix d'outil car dépendamment des besoins, certains outils sont préférables à d'autres.
Par exemple, Google a choisi **Gradle** comme outil de build officiel pour **Android** parce que Gradle est modelé d'une façon qui est extensible.

Le modèle Gradle peut être utilisé pour du développement de C/C++ et peut être étendu à n'importe quel écosystème. C'est pour celà que ce critère est important pour bien choisir l'outil de build.

## Gradle vs Maven
L'outil qui a une meilleure flexibilité entre Maven et Gradle est:  **Gradle**
Voici Pourquoi:

1.  Gradle a une meilleure capacité d'automatisation des tâches
2.  Gradle est conçu pour les usagers responsables
3.  Flexible car il est basé sur un script.
4.  Plus facile à utiliser les builds sur mesure
5.  Les scripts de Gradle sont plus propres que les scripts de Maven
6.  Permet de structurer les builds
7.  Supporte les builds multi-projets
8.  Choix de deux langages: Groovy ou Kotlin
9.  Logiciel libre qui se concentre sur la flexibilité et la performance
10. Aucun XML
11. Code court et simple à écrire. Par exemple: `plugins { id 'java'}`.Ce petit bout de code ajoute plus de 20 tâches à utiliser
12. Syntaxe courte et facile à comprendre
13. Seul Gradle offre la convention et la création de commandes simultanément
14. fichier de build `build.gradle` très facile à comprendre et modifier
15. Utilise un style/design minimaliste
16. Favorable aux plugins
17. Le langage Kotlin permet d'adapter l'outil aux besoins de l'usager et est plus flexible que le XML

Toutes ces raisons indiquent la raison pour laquelle **Gradle** est le meilleur outil au niveau de la **flexibilité**.

---
# L'apprentissage

Le deuxième critère pris en considération est **l’apprentissage**. Il s’agit d’évaluer des difficultés, des différences qui peuvent être rencontrées lors de la familiarisation avec Gradle et Maven.

Ce critère est important parce que la construction de logiciels passe par plusieurs étapes comme la compilation du code source et les tests. Apprendre un outil de « build » comme Gradle ou Maven permet d’éviter la répétition des étapes à suivre, donc permet une automatisation. Avec les tests dans le « build », il y a des vérifications qui sont faites sur le champ et avec le rapport d’erreurs il est possible d’aller arranger ce qui a été détecté et fournir un logiciel plus efficace en moins de temps.

Le processus d’installation est le même pour les deux outils avec l’installation de Java, du « build » et la configuration de son environnement.

Les « build » de Gradle peuvent être en Groovy ou en Kotlin. Donc, il faut apprendre (ou maitriser) un nouveau langage de programmation pour pouvoir l’utiliser. Directement dans le « build », il y a différents types de tâches auxquelles il faut attitrer un comportement, avec des méthodes et propriétés à maitriser. Il est aussi possible de déterminer son propre type de tâche. Par exemple, il y a des méthodes permettant d’indiquer ce qui est à faire en premier ou en dernier lors de l’exécution de la tâche. Comprendre ce qui est effectué par la déclaration d’un « plugin » est la clé pour comprendre les propriétés qu’il est possible de contrôler, les dépendances qu’il faut déclarer.

Avec Maven, le « build » est déjà établit avec le fichier POM.xml parent. C’est le fichier de configuration principale. Comprendre et connaitre la séquence des phases de Maven, les « goals » qui sont liés à chaque phase ainsi que le rôle des plugins (exécute les actions comme la création de dossier .jar, compiler, créer la documentation) liés au « goals » est une grande partie de l’apprentissage. Ensuite, il faut construire de son propre POM.xml spécifique au projet en développement, en respectant une structure de répertoire, des dépendances et des plugins.

Le fait qu’il n’y ait pas de nouveau langage de programmation à apprendre et qu'il n'y ait pas de configuration de tâches à faire, que la syntaxe du document `POM.xml` soit standardisée et que la gestion des dépendances soit simple, fait de Maven l'outil le plus facile à apprendre.

Toutes ces raisons indiquent la raison pour laquelle **Maven** est le meilleur outil en ce qui concerne **l'apprentissage**.

---

# La stabilité

Lorsqu'on utilise un nouvel outil quelconque, on espère souvent, pour ne pas dire toujours, pouvoir l'utiliser pour
longtemps sans que celui-ci ne se brise. On souhaite également ne pas avoir à réapprendre son fonctionnement et de
pouvoir l'utiliser avec tous les accessoires qui s'y rattachent dans divers projets. La notion de stabilité fait
référence à tout cela. En bref, on désire utiliser un outil pour longtemps sans trop de problèmes.
Maintenent, comparons les outils **Maven** et **Gradle** à travers la notion de stabilité.

La configuration de **Maven** repose essentiellement sur des fichiers pom. Ces poms, sont des fichiers *xml*,
ayant une structure plutôt rigide. De plus, on doit suivre un cycle de vie qui se compose de *goals* dans un ordre
bien défini pour construire et déployer un projet **Maven**. Par contre, cette rigidité procure un certain
standard. Après avoir appris le langage de balisage *xml*, on peut facilement passer d'un projet **Maven** à
un autre. Les notions apprises pour faire fonctionner un projet **Maven** restent les mêmes.

De plus, pour créer un projet **Maven** ou **Gradle**, il est préférable de télécharger des librairies et des
plugins. Il y a pour **Maven** un large éventail de librairies et de plugins sur internet, en nombre bien
supérieur à **Gradle**. Nous avons parlé d'accessoires qui se rattachent à un outil, plus haut, dans notre
définition de stabilité. Avoir un plus grand nombre de plugins amène nécessairement plus de stabilité puisqu'on
a plus de chances de trouver ce que l'on recherche pour notre projet et ainsi maintenir son utilisation.
Par ailleurs, **Maven** existe depuis plus longtemps que **Gradle**. Cette longévité apporte avec elle l'expérience
d'une communauté d'utilisateurs. L'élaboration d'un projet **Maven** ou **Gradle** peut être difficile pour un novice
et donc un support face aux difficultés rencontrées est primodial pour celui-ci. La communauté d'utilisateurs
**Maven** ayant plus d'expérience que celle de **Gradle**, un nouvel utilisateur aura plus de chances de trouver
les solutions à ses problèmes auprès de celle-ci.

Pour **Gradle**, la configuration est plus flexible puisque celle-ci repose sur un langage de programmation ainsi
que sur des *tasks* pour fonctionner. On peut également utiliser différents langages de programmation sur **Gradle**.
Ainsi, on peut très bien utiliser le langage de programmation **Groovy** pour la configuration d'un projet **Gradle**
et **Kotlin** pour un autre projet. Non seulement il est plus difficile de passer d'un projet **Gradle** à un autre,
il est également plus facile de rencontrer des erreurs de configuration sur des projets **Gradle** puisqu'ils sont basés
sur la programmation d'un utilisateur.

Ainsi, le choix de l'outil **Maven** s'impose sur celui de **Gradle** au niveau de la **stabilité**.

---
Sources:
- Berglund, T & McCullough, M. (2011). Building and testing with Gradle. Sebastopol: O’Reilly
Media Inc.
- Guillemette, F-X. (2019). Build : Maven et autres outils. Université du Québec à Montréal,
Département de l’informatique.
- Gradle Inc. (2019). Gradle vs Maven Comparison. Récupéré de https://gradle.org/maven-vs-gradle/

