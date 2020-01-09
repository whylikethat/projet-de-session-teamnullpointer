#### UNIVERSITÉ DU QUÉBEC À MONTRÉAL


 
## PMD VS CHECKSTYLE



#### PRÉSENTÉ À L’UNIVERSITÉ DU QUÉBEC À MONTRÉAL
#### COMME EXIGENCE DU COURS INF2050 GR.40 



#### À FRANÇOIS-XAVIER GUILLEMETTE


#### PAR SABINE CANDIO: CANS30589104
#### ALEX SOARES : SOAA01037905
#### CHERAZ MECHTI : MECC25539000
#### JOHN MALKHASSIAN : MALJ14038702
 
#### DÉPARTEMENT DE L’INFORMATIQUE
#### 28 MARS 2019

 
# Description

Réviser son code source est une étape importante dans la réalisation de projets
afin de le rendre fonctionnel et compréhensible le plus rapidement possible, surtout lorsqu'il est question de travailler en équipe. 
Les outils d'analyse statique font la révision du code de manière automatisée en examinant la qualité et le style.

Plusieurs analyseurs de code source existent, dont PMD et Checkstyle.

Tout d'abord, PMD est un outil extrêmement utile dans l'analyse du code source en différents langages comme
Java et Ecmascript. En effet, PMD est livré avec un vaste ensemble de règles qui permettent, par exemple, 
de trouver du code compliqué, du code non utilisé ou encore du code copié/collé. Chaque langage a différentes règles.
Il y a des règles pour Java notamment sur les meilleurs pratiques de codage, la détection préventive des erreurs et la performance du code. PMD s'intéresse aux erreurs de programmation qu'il y a ou pourrait avoir dans le code.
Des règles personnalisées peuvent être écrites en requête XPath ou en Java.
Les résultats sont, au final, obtenus par le biais d'un rapport (résultats transformés avec XSLT en rapport HTML).

Checkstyle, quant à lui, vérifie la qualité, le style du code Java spécifiquement. Cet outil, avec ses règles, va s'assurer que le 
code respecte les conventions et donc que le code est cohérent. Par exemple, il y a des règles pour vérifier
s'il y a des commentaires, s'il y a de l'indentation pour les commentaires, s'il y a des parenthèses non nécessaires
ou encore si les méthodes sont trop longues. Il y a bien d'autres règles qui permettent au final d'obtenir un code uniforme 
ce qui facilite le travail d'équipe. Checkstyle ne vérifie que le style et non que le code fait ce qu'il est supposé faire.


# L'offre

L’offre d’un outil d’analyse englobe les langages qu’il supporte, dans quels IDE ils peuvent être intégrés et surtout les éléments qui sont vérifiés par l’outil.  L’offre détermine sur quoi (langage) et de quelle façon l’outil peut améliorer le code. Le choix d’un outil d’analyse statique en se basant sur l’offre permet de cibler ce que l’on veut améliorer du code tout comme permettre de faire un choix parmi tous les outils d’analyse.

Ultimement, la qualité du code sera améliorée selon l’offre de l’outil d’analyse, favorisera une uniformité lorsque utilisé avec les mêmes règles dans l’équipe et facilitera du même coup la maintenabilité du code dans le temps.

Checkstyle analyse le style du code écrit en Java seulement, vérifie que le code respecte les conventions. Par exemple, cet outil vérifie le nombre de paramètres pour les méthodes ou constructeurs, la présence de commentaires, respect des règles pour nommer les variables et les méthodes, pour l’écriture des classes, etc. 

Checkstyle et PMD peuvent être intégrés dans le « build » d’Ant, de Maven et de Gradle tout comme être intégrés à différents IDE comme NetBeans, Eclipse, ce qui fait en sorte que ces éléments ne sont pas distinctifs concernant l’offre.

Comparativement, **PMD a une meilleure offre**. Cet outil supporte plus qu’un langage contrairement à Checkstyle : java, mais aussi Apex, PLSQL, ECMAScript, etc. PMD vérifie la qualité du code, identifie le code qui n’est pas utilisé (comme des variables ou des méthodes non appelées), identifie le code qui est compliqué inutilement et bien plus. Il y a un détecteur de code copié et collé qui vient avec PMD qui aide pour le « refactoring ». Il y est aussi possible d’écrire ses propres règles (en Java ou requête XPath). Bref, PMD détecte du code problématique tout en ayant une plus grande flexibilité notamment à cause des différents langages supportés et des règles que peuvent créer les développeurs.


# L'exécution

Le deuxième critère est **l'exécution**. L'exécution d'un outil d'analyse statique est le processus où l'outil analyse le code source du projet sans executer le programme et produit des rapports d'évaluation, par défaut, dans le répértoire du build.
Ce processus permet d'avoir une compréhension de la structure de code et assure que le code source adhère aux normes de l'industrie. L'exécution se passe généralement en trois étapes:

1. Analyse du code source
2. *Output* des erreurs de style ou de mauvaises pratiques à la console
3. Production des rapports en *html*

Ce critère est important parce qu'il est nécessaire au fonctionnement de l'outil. Sans l'exécution, on n'a pas de rapport donc on ne sait pas si le code est conforme et si la structure désirée est respéctée. Dépendément de la rapidité de l'execution, ses résultats et sa configuration, on va préferer un outil par rapport à un autre.

Pour ce critère, on utilise **Gradle** alors une fois l'exécution terminée, pour **PMD**, les rapports sont générés dans `/build/reports/pmd/` et pour **Checkstyle**, dans `/build/reports/checkstyle/`.
Les deux répértoires contiennent respectivement les rapports dans les fichiers `main.html` et `test.html`. Ces fichiers démontrent les erreurs de codage selon la configuration. Il est nécessaire de mentionner que **Checkstyle** s'attend à ce que le fichier de configuration soit dans le répértoire `/config/checkstyle` à la racine du projet dans un fichier *xml*. Ce fichier détérmine les critères d'évaluation du code source et ses normes de codage. Par contre, **PMD** ne requiert aucun fichier. Alors, on aura moins de confusion. (Par contre, il est déconseillé d'utiliser la configuration par défaut.)

L'exécution de **Checkstyle** vérifie la conformité du code source et le respect des bonnes conventions tandis que **PMD** vérifie plutôt les mauvaises pratiques. Les rapports *html* sont beaucoup plus clairs avec **PMD**.

**Checkstyle** requiert la spécification de la version pour ne pas faire échouer le processus du build tandis qu'avec **PMD**, ce n'est pas nécéssaire. La configuration de **PMD** est beaucoup plus simple avec gradle que la configuration de **Checkstyle**.

Pour ces raisons, **PMD** est le meilleur outil car **l'exécution** est plus rapide, la configuration de l'exécution est moins longue/complexe et les résultats de l'analyse statique après l'exécution sont plus clairs.


# Pertinence à nos besoins
 
  Il est parfois difficile de choisir un object ou un outil lorsqu'on a
l'embarras du choix. Qui n'a pas passé de longues minutes devant
l'étalage de brosse à dents à se demander laquelle choisir. Certaines
offrent plus d'options (dentelé à triple action) et d'autres sont
peut-être plus efficaces et plus simple d'utilisation comme les
brosses à dents électriques. Une façon de départager parmi les outils
serait de faire un choix selon nos besoins. En quoi un outil ou un
objet est plus pertinent qu'un autre par rapport à nos besoins? Si
on a des gencives sensibles, on devrait probablement choisir une
brosse à dents à poils souples.

Ainsi, on utilise un outil pour effectuer une tâche mais on le choisit
également par rapport à nos besoins. Plus un outil comble nos besoins,
et meilleur est le retour sur l'investissement et potentiellement moins
de problèmes rencontrés (pas de gengivite dans notre exemple sur les
brosse à dents).

Les deux outils d'analyse statique choisis,**PMD** et **Checkstyle**,
effectuent des tests que l'on peut considérer comme complémentaires.
L'outil **Checkstyle** effectue des tests sur le style du code et
l'outil **PMD** effectue des tests sur les mauvaises pratiques de codage
comme des méthodes trop complexes et du code non utilisé. Cependant, on
fait des tests pour quelles raisons? Fait-on des tests pour faire des tests?
En quoi ces tests sont pertinents à nos besoins et en quoi ces tests ont
de la valeur?

Par rapport à notre projet, la plupart du code java est fourni par le
professeur et le code fourni par notre équipe devrait normalement
être plus simple (le cours n'étant pas un cours de programmation).
Ainsi, les problèmes causés par le style devraient être plus présents
dans le projet puisque chaque membre de l'équipe peut avoir un style
de codage différent et que la présence des mauvaises pratiques peut
être faible à cause de la simplicité du code. **Checkstyle** est donc
important pour uniformiser notre code.
 
Ainsi, on peut dire que l'outil **Checkstyle** devrait être plus pertinent
pour notre équipe. Cependant, on peut très bien utiliser les deux
outils puisqu'ils sont complémentaires.

###### Sources:
- Checkstyle. (2019). Overview. Récupéré de http://checkstyle.sourceforge.net/
- PMD OpenSource Project. (2019). Documentation Index. Récupéré de https://pmd.github.io/latest/index.html
- Ebel, Nate. (2018). What are « static analysis » tools?. Récupéré de   https://proandroiddev.com/what-are-static-analysis-tools-48ccff8135d4 


