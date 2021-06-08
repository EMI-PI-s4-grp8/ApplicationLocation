# LocationApp
![](536e0f3a-c899-11eb-a980-0cc47a792c0a_id_536e0f3a-c899-11eb-a980-0cc47a792c0a_files/background01.jpg)
Université Mohammed V - Rabat
Ecole Mohammadia d’Ingénieurs
Département Génie Informatique
Rapport Final du Projet Intégré (S4)
Sujet
Application Web (sous JEE) pour la Réservation des
Logements en ligne.
Réalisé par :
Encadré par :
• Fatima Zohra BENICHOU
Mme. Asmaâ RETBI
• Zakaria BOUAOUDA
• Reda EL OUAHABI
• Marouane EL OUAFI
ANNÉE UNIVERSITAIRE 2020-2021
![](536e0f3a-c899-11eb-a980-0cc47a792c0a_id_536e0f3a-c899-11eb-a980-0cc47a792c0a_files/background02.jpg)
Table des Matières :
1-Introduction
2-Contexte & Problématique
3-Objectifs de l'application
4-Besoin du projet :
4.1-Besoins Fonctionnels
4.2- Besoins non Fonctionnels
5- Analyse et Conception :
5.1-Diagramme de Use Case
5.2-Description Des UCs
5.3-Diagramme de séquence système
5.4-Diagramme de séquence détaillé
5.5-Diagramme de classes
6-Architecture et Framework utilises :
6.1-Choix de technologie
6.2-Architecture technique
Les différentes couches de l’application MVC
6.3-UI/UX
6.4-Déploiement sur Heroku
7-User Stories :
7.1-Pour les visiteurs du site Web
7.2-Pour les locataires/client
7.3-Pour les administrateurs
7.4-Pour les propriétaires des Logements
8-Déroulement et simulation :
8.1-L’application Principale
8.2-Vers Une Architecture Client/ Serveur ?
9-Les Livrables :
9.1-Liens des Site web déployés
9.2-Liens Codes Sources
10-Conclusion
![](536e0f3a-c899-11eb-a980-0cc47a792c0a_id_536e0f3a-c899-11eb-a980-0cc47a792c0a_files/background03.jpg)
I. Introduction :
Rechercher un appartement ou une maison à louer n’est pas toujours
simple. On se retrouve souvent confronté à la réalité du marché
immobilier par rapport à nos souhaits et projets et par rapport à notre
budget.
Mais avec l’avancé technologique, de nouvelles solutions ont vu le jour
donc on passe de la recherche à travers des agences immobiliers ou des
agences de voyage vers la recherche sur internet, avec un simple clic tu
peux choisir, réserver et payer un logement qui vous plait.
II. Contexte & Problématique :
Dans le cadre de la formation universitaire à l’École Mohammedia des
Ingénieurs, pour obtenir un diplôme d’ingénieur d’état en génie
informatique, il nous a été demander de réaliser une application web de
location de logement qui permettrait de mettre en relation des chercheurs
de logements avec des entreprises hôtelières et des particuliers qui louent
tout ou une partie de leur propre habitation comme logement
d’appoint. Le site doit offrir une plateforme de recherche et de
réservations entre la personne qui met à disposition son logement et un
locataire
Donc on peut formuler la problématique comme suit :
Souvent, les gens gaspillent beaucoup de temps avant de trouver le loyer
qu’ils cherchent, et parfois, ils ne trouvent pas ce qu’ils cherchent, et le
même problème se pose pour le locataire.
III.
Objectifs de l’application :
L’objectif du projet est de faciliter la tkche aux personnes futurs
locataires ou propriétaires, cette plateforme va minimiser le temps
![](536e0f3a-c899-11eb-a980-0cc47a792c0a_id_536e0f3a-c899-11eb-a980-0cc47a792c0a_files/background04.jpg)
gaspillé pour trouver un hébergement et de réserver un logement
convenable, ainsi qu’elle va aider les hôtes d’avoir plus de chance de
louer leurs logements en publiant des annonces.
Plus précisément le but de cette plateforme est :
• Proposer une liste d'annonces que l’utilisateur peut trier dans une
recherche simplifiée ou détaillée. A cette fin, les critères de
recherches doivent permettre d’affiner de différentes façons, au
clic que l’une des annonces, le visiteur consulte le détail du bien,
et fait en ligne une demande de disponibilité selon des
présélections qu’il convient de préciser
• Permettre au propriétaire de faire une annonce de son logement,
de détailler l’annonce et d’avoir plus de chance de louer
• Automatiser les opérations de location et réservation de logement
et les rendre plus facile et efficace
• Permettre au locataire de choisir un logement convenable selon
des critères précis et réserver avec un payement en ligne.
• Permettre à un utilisateur d’avoir plus d’information sur le locataire
ou le propriétaire et d’obtenir toutes ses publications
IV. Besoins du projet :
1. Besoins fonctionnels :
La plateforme comportera une page d’accueil qui permettra à l’utilisateur
de s’authentifier en tant qu’hôte ou locataire, pour profiter des différents
services offerts par l’application.
Le site web permet de :
Pour visiteur :
• S’inscrire en tant que locataire ou propriétaire
• Voir les annonces disponibles
• Consulter les offres et prix
![](536e0f3a-c899-11eb-a980-0cc47a792c0a_id_536e0f3a-c899-11eb-a980-0cc47a792c0a_files/background05.jpg)
• Noter les services de la plateforme
Pour locataire :
• Se connecter
• Chercher une liste d’annonces simple ou détaillé, avec possibilité
de trier selon le prix
• Afficher les détails après sélection d’une annonce
• Faire en ligne une demande de disponibilité selon les
présélections qu’il convient de préciser
• Voir géo localisation du logement
• Réserver un logement
• Effectuer un règlement de réservation avec payement en ligne
• Contacter depuis la fiche le propriétaire par messagerie interne ou
par téléphone
• Chatter en ligne avec l’annonceur
• Donner son avis du logement (après réservation)
Pour propriétaire :
• Se connecter
• Créer une annonce de logement (studio, appartement, hôtel, villa,
chambre ...)
• Préciser les informations relatives du logement et les détails
(chauffage, climatisation, wifi, parking…)
• Confirmer la réservation d’un client
• Répondre aux demandes par messagerie interne
• Possibilité de cliquer sur locataire et de voir ses informations
• Gérer son interface
• Recevoir un mail de demande de disponibilité pour confirmer
Pour administrateur :
• Se connecter en tant qu’administrateur
• Gérer les comptes des utilisateurs (valider, supprimer..)
• Gérer les annonces et réservations
2. Besoins non fonctionnels :
![](536e0f3a-c899-11eb-a980-0cc47a792c0a_id_536e0f3a-c899-11eb-a980-0cc47a792c0a_files/background06.jpg)
Les besoins non fonctionnels concernent les contraintes à prendre en
considération pour mettre en place une solution adéquate aux attentes
des concepteurs des architectures dynamiques.
Notre application doit nécessairement assurer ces besoins :
•
Sécurité : l’application comporte des informations personnelles et
sensibles, donc doit être hautement sécurisée, les informations ne
devront être accessibles à tout le monde, c’est-à-dire que le site
web est accessible par un identifiant et un mot de passe attribué à
une personne physique
•
Performance : l’application devra rtre performante, c’est-à-dire
que le système doit réagir dans un délai précis, quel que soit
l’action de l’utilisateur.
•
La simplicité : l’application doit rtre simple et facile à manipuler
même par des non experts.
•
La fiabilité : Les informations apportées par l’application doivent
être fiables et sûr
•
Disponibilité : l’application doit rtre disponible à tout instant pour
être utilisée par n’importe quel utilisateur
•
Ergonomie de l’interface: L’application respecte les interfaces
Homme/Machine et doit être facile à utiliser, les interfaces
utilisateurs doivent être simples, ergonomiques et adaptées
à l’utilisateur.
V.
nalyse et Conception :
1. Diagramme de Use Case :
![](536e0f3a-c899-11eb-a980-0cc47a792c0a_id_536e0f3a-c899-11eb-a980-0cc47a792c0a_files/background07.jpg)
2. Description des UCs :
fin d’éclaircir le diagramme de cas d’utilisation, on représente ci-dessous la
fiche descriptive qui explique chaque cas d’utilisation ă part, avec les scénarios
possibles.
UC : S’inscrire
Objectif : l’utilisateur crée un compte en tant que locataire ou propriétaire
Acteur : visiteur
Scénarios nominaux :
• Remplir le formulaire
• Vérifier le formulaire
• Choisir un mot de passe
• Préciser le type d’utilisateur
![](536e0f3a-c899-11eb-a980-0cc47a792c0a_id_536e0f3a-c899-11eb-a980-0cc47a792c0a_files/background08.jpg)
• Enregistrer le compte
Scénarios alternatifs :
• Remplir le formulaire ă nouveaux s’il est mal rempli
Exception :
• nnuler l’inscription
• Utilisateur déjă inscrit
UC : se connecter
Objectif : l’utilisateur doit être authentifié en tant que locataire ou propriétaire
Acteurs : locataire, propriétaire ou administrateur
Scénarios nominaux :
• Le système affiche le formulaire d’authentification (pseudo/email, mot de
passe)
• Entrer le nom d’utilisateur et mot de passe
• Le système vérifie les données
• Vérifier le type d’utilisateur connecté
Exception :
• nnuler l’authentification
• Identificateur ou mot de passe incorrect
UC : Réserver un logement
Acteur : Locataire
Description : La réservation est une phase indispensable dans le site, il doit
être bien gérer ; notamment par le locataire.
Préconditions : S’authentifier
Les scénarios nominaux :
![](536e0f3a-c899-11eb-a980-0cc47a792c0a_id_536e0f3a-c899-11eb-a980-0cc47a792c0a_files/background09.jpg)
• Parcourir le catalogue des Logements
• Sélectionner un Logement
• Déterminer la date d’arrivée, de sortie, les nombre des adultes ͘͘͘
• Ajouter la réservation dans sa liste pour le locataire.
Les scénarios alternatifs :
• Retourner au catalogue et choisir d’autre logement
• Annuler les réservations
• Modifier les informations de la réservation.
Diagramme de séquence système :
Diagramme de séquence détaillé :
![](536e0f3a-c899-11eb-a980-0cc47a792c0a_id_536e0f3a-c899-11eb-a980-0cc47a792c0a_files/background10.jpg)
UC : Gérer les annonces du logement
Acteurs : propriétaire -administrateur
Préconditions : authentification
Scénarios nominaux :
• Le système vérifie le type d’utilisateur connecté
• Le système affiche une page d’accueil
• Le propriétaire choisit l’option ajouter un logement
• Entrer les informations et les caractéristiques du logement
• Ajouter des photos du logement et son type
• Préciser le nombre des adultes maximum
• Valider
• Le système met à jour la liste des logements du propriétaire
Scénarios alternatifs :
• Modification d’un logement
• Supprimer un logement
• Ajouter des promotions
![](536e0f3a-c899-11eb-a980-0cc47a792c0a_id_536e0f3a-c899-11eb-a980-0cc47a792c0a_files/background11.jpg)
Exceptions :
• Fermer la session
UC : Visualiser les annonces [consulter catalogue des logements]
Acteurs : Locataire ou visiteur
Préconditions : Accès à la plateforme
Scénarios nominaux :
• fficher la liste des Logements
• fficher une description et une photo pour chaque Logement
• Afficher des informations du Logement
• Sélectionner des catégories du logement -chambre simple -chambre double
-appartement
• Chercher un logement dans le catalogue
Scénarios alternatifs :
• Quitter la consultation du Logement choisie
• Quitter la consultation du catalogue
Exception :
• Pas de logement du catalogue
UC : gérer les réclamations
Objectif : l'utilisateur peut réclamer l'administrateur des problèmes technique
au niveau du site web.
Acteurs : Locataire -administrateur
Préconditions : s’authentifier
![](536e0f3a-c899-11eb-a980-0cc47a792c0a_id_536e0f3a-c899-11eb-a980-0cc47a792c0a_files/background12.jpg)
Scénarios nominaux :
• Réclamer
• L’administrateur traite la réclamation
Postconditions : le formulaire doit contenir des informations sur l'utilisateur afin
d'éviter les fausses réclamations
UC : Gérer les comptes
Acteurs : admin
Préconditions : authentification
Scénarios nominaux :
• Supprimer un compte qui porte un seul des réclamation négative.
• Aider un utilisateur à régler ces problèmes techniques au niveau des
comptes
• vertir un utilisateur avant qu’il attendre le seul de la procédure de
suppression provisionnée
Scénarios alternatifs :
• Quitter l’espace de gestion des comptes
Exceptions :
-Fermer la session
3. Diagramme de classes :
![](536e0f3a-c899-11eb-a980-0cc47a792c0a_id_536e0f3a-c899-11eb-a980-0cc47a792c0a_files/background13.jpg)
VI. Architecture et Framework utilises :
1. Choix de technologie :
Java EE est une spécification pour la plate-forme Java d'Oracle,
destinée aux applications d'entreprise. La plate-forme étend
Java Platform, Standard Edition (Java SE) en fournissant une API
de mapping objet-relationnel, des architectures distribuées et multitiers, et des
services web. La plate-forme se fonde principalement sur des composants
modulaires exécutés sur un serveur d’applications.
Spring est un framework libre très riche, parmi les plus réputés au
monde. Il permet de construire l’infrastructure d’une application
Java et d’en faciliter le développement .Il est considéré comme un
projet OpenSource, créé et développé par Rod Johnson en juin 2003,
qui est par ailleurs le cofondateur de SpringSource. Il offre plusieurs
![](536e0f3a-c899-11eb-a980-0cc47a792c0a_id_536e0f3a-c899-11eb-a980-0cc47a792c0a_files/background14.jpg)
fonctionnalités, à savoir la gestion transactionnelle, celle des
exceptions Java DataBase Connectivity et un framework MVC .
Hibernate est un Framework open source gérant la persistance des
objets en base de données relationnelle. Hibernate est adaptable en
termes d'architecture, il peut donc être utilisé aussi bien dans un
développement client lourd, que dans un environnement web léger de type
Apache Tomcat ou dans un environnement Java EE complet.
JPA est une spécification intégrée au JEE qui vise à standardiser la
couche d'association entre une base relationnelle et une application
Java construite sur des objets
MySQL est un système de gestion de bases de données relationnelles.
XAMPP est un ensemble de [logiciels p](https://fr.wikipedia.org/wiki/Logiciel)ermettant de mettre en place
un serveur web local, un [serveur FTP e](https://fr.wikipedia.org/wiki/Serveur_FTP)t un [serveur de messagerie](https://fr.wikipedia.org/wiki/Serveur_de_messagerie_%C3%A9lectronique)
[électronique](https://fr.wikipedia.org/wiki/Serveur_de_messagerie_%C3%A9lectronique)
phpMyAdmin est une application Web de gestion pour les systèmes
de gestion de base de données MySQL.
React est une [bibliothèque J](https://fr.wikipedia.org/wiki/Biblioth%C3%A8que_Logicielle)avaScript [libre d](https://fr.wikipedia.org/wiki/Logiciel_libre)éveloppée par Facebook depuis
[2013.](https://fr.wikipedia.org/wiki/2013_en_informatique) Le but principal de cette bibliothèque est de faciliter la création
d['application web monopage, vi](https://fr.wikipedia.org/wiki/Application_web_monopage)a la création de composants dépendant
d'un état et générant une page (ou portion) [HTML à](https://fr.wikipedia.org/wiki/HTML) chaque changement d'état.
On a utilise ReactJs pour la deuxième architecture client/serveur .
![](536e0f3a-c899-11eb-a980-0cc47a792c0a_id_536e0f3a-c899-11eb-a980-0cc47a792c0a_files/background15.jpg)
JavaScrip est un langage de programmation de scripts principalement
employé dans les pages web interactives et à ce titre est une partie
essentielle des applications web.
Bootstrap est une [collection d'outils u](https://fr.wikipedia.org/wiki/Framework)tiles à la création du design (graphisme,
animation et interactions avec la page dans le navigateur, etc.) de [sites e](https://fr.wikipedia.org/wiki/Site_web)t
[d'applications web.](https://fr.wikipedia.org/wiki/Application_web) C'est un ensemble qui contient des codes [HTML e](https://fr.wikipedia.org/wiki/HTML)t CSS,
des formulaires, boutons, outils de navigation et autres éléments interactifs,
ainsi que des extensions [JavaScript](https://fr.wikipedia.org/wiki/JavaScript) en option.
CSS (Cascading Style Sheets) un langage qui permet de gérer la
présentation d'une page Web HTML5 (HyperText Markup Language 5)
est la dernière révision majeure du [HTML,](https://fr.wikipedia.org/wiki/Hypertext_Markup_Language) qui permet de décrire le
contenu et l'apparence des pages Web .
StarUML est un logiciel de modélisation UML, qui a été « cédé comme open
source » par son éditeur, à la fin de son exploitation commerciale, sous une
licence modifiée de GNU GPL. Aujourd'hui la version StarUML V3 n'existe qu'en
licence propriétaire.
Git est un logiciel de gestion de versions décentralisé. C'est un logiciel
libre créé par Linus Torvalds, auteur du noyau Linux, et distribué selon les
termes de la licence publique générale GNU version 2.
Postman est un logiciel qui va vous permettre d’appeler / tester une
API,permet
de construire et d’exécuter des requêtes HTTP, de
les stocker dans un historique
afin de pouvoir les rejouer,mais
surtout de les organiser en Collections.
Axios est une bibliothèque qui nous aide à faire des requêtes http à des
ressources externes. Dans nos applications React, nous avons souvent
besoin de récupérer des données d'API externes afin qu'elles puissent
être affichées dans nos pages Web.
![](536e0f3a-c899-11eb-a980-0cc47a792c0a_id_536e0f3a-c899-11eb-a980-0cc47a792c0a_files/background16.jpg)
2. Architecture technique :
Nous allons utiliser Spring comme framework pour faire l’inversion du
contrôle ,celui qui va démarrer en premier et qui gère les différentes couches
de l’application͘
Les différentes couches de l’application
• Couche dao
On crée dans cette couche les entités et les interfaces repository basées sur
Spring data. Spring data est une implémentation générique qui permet de gérer
les entités JPA . Il est le moyen le plus simple pour faire le mapping objet
relationnel͘ Spring data va s’appuyer sur JP qui est une api donc nous avons
besoin d’une implémentation de cette PI alors dans notre cas on utilise
Hibernate qui est basé sur API JDBC qui fait partie de java .
• Couche métier
On crée ici les interfaces dans lesquelles on déclare les spécifications
fonctionnelles et l’implémentation de ces interfaces.
• Couche web
Dans cette couche il y aura le contrôleur et les vues.
Spring Boot Containner
React
Html 5 ,JS
HTTP
La couche
La couche
La couche
CSS
web
metier
DAO
Boot strap
Les Dépendances qu’‘on aura besoin pour notre proje
![](536e0f3a-c899-11eb-a980-0cc47a792c0a_id_536e0f3a-c899-11eb-a980-0cc47a792c0a_files/background17.jpg)
Spring boot
devtools
Spring web
Mysql Driver
Spring security
Spring web
Spring Data JPA
3. UI/UX :
1- Choix du logiciel :
On va utiliser Figma pour la conception des maquettes et les wireframes
UI/UX :
Enfaite ; Figma est un éditeur de graphiques vectoriels et un outil de
prototypage.
Il est principalement basé sur le web, avec des fonctionnalités hors ligne
supplémentaires activées par des applications de bureau pour macOS et
Windows.
Les Figma Mirror companion apps pour Android et iOS permettent de visualiser
des prototypes Figma sur des appareils mobiles.
L'ensemble des fonctionnalités de Figma est axé sur l'utilisation dans la
conception de l'interface utilisateur et de l'expérience utilisateur, en mettant
l'accent sur la collaboration en temps réel .
D’ailleurs notre choix de Figma au lieu d’ dobe XD est basé sur plusieurs
recherche, par exemple :
![](536e0f3a-c899-11eb-a980-0cc47a792c0a_id_536e0f3a-c899-11eb-a980-0cc47a792c0a_files/background18.jpg)
[https://webdesign.tutsplus.com/articles/figma-vs-adobe-xd-in-2020--cms-](https://webdesign.tutsplus.com/articles/figma-vs-adobe-xd-in-2020--cms-34224%23:~:text=Winner%3A%20Figma,-Why%20Figma%20Wins&text=If%20you%20want%20to%20create,second%20piece%20of%20software%20instead.)
[34224\#:\~:text=Winner%3A%20Figma,-](https://webdesign.tutsplus.com/articles/figma-vs-adobe-xd-in-2020--cms-34224%23:~:text=Winner%3A%20Figma,-Why%20Figma%20Wins&text=If%20you%20want%20to%20create,second%20piece%20of%20software%20instead.)
[Why%20Figma%20Wins&text=If%20you%20want%20to%20create,second%20](https://webdesign.tutsplus.com/articles/figma-vs-adobe-xd-in-2020--cms-34224%23:~:text=Winner%3A%20Figma,-Why%20Figma%20Wins&text=If%20you%20want%20to%20create,second%20piece%20of%20software%20instead.)
[piece%20of%20software%20instead.](https://webdesign.tutsplus.com/articles/figma-vs-adobe-xd-in-2020--cms-34224%23:~:text=Winner%3A%20Figma,-Why%20Figma%20Wins&text=If%20you%20want%20to%20create,second%20piece%20of%20software%20instead.)
2- Lien des Livrables (Les Maquettes) :
-
Lien de visualisation des maquettes dynamiquement :
[https://www.figma.com/file/L1a7wlLu4YAsIrLdKB4cUj/Maquettes?node-id=5%3A2](https://www.figma.com/file/l1a7wllu4yasirldkb4cuj/maquettes?node-id=5%3a2/)
3- Logo du Projet :
On a conçu un logo pour le site web, en utilisant Photoshop comme utile de conception graphique :
-
Aperçu du Logo :
4. Déploiement sur Heroku :
Heroku est une PaaS (plateforme en tant que service) permettant de déployer
des applications sur le Cloud. A la façon dont un hébergeur web propose
d’héberger un site web sur ses propres serveurs, cette solution vous permet de
déployer votre application sur le Cloud pour permettre aux internautes de
l’utiliser
• La démarche du déploiement de notre application sur Heroku
![](536e0f3a-c899-11eb-a980-0cc47a792c0a_id_536e0f3a-c899-11eb-a980-0cc47a792c0a_files/background19.jpg)
Tout d’abord on a lié notre application qu’on a mis sur GitHub avec heroku pour
qu’elle soit accessible en public͘ En ce qui concerne la partie base de données
on a utilisé la SGBD clearDB pour importer notre base de données sur Heroku
d’oƶ le déploiement de notre application de logements.
Accéder à notre site via le lien suivant :
[https://fin-tbat.herokuapp.com/](https://fin-tbat.herokuapp.com/)
Pour Le SGBD ClearDB :
![](536e0f3a-c899-11eb-a980-0cc47a792c0a_id_536e0f3a-c899-11eb-a980-0cc47a792c0a_files/background20.jpg)
VII. User Stories
• Pour les visiteurs du site Web :
-En tant que visiteur, je veux visiter ce site Web pour accéder aux
informations relatives aux logement, prix, offres et types des logements
disponibles (chambre simple, double ou appartement).
-En tant que visiteur, je veux chercher les logements soit par recherche
simple ou avancée.
• Pour les locataires/client :
-En tant que locataire, je veux réserver un logement de mon choix dans
la destination correspondante et qui vérifie les critères des places
disponibles, le prix ...
-En tant que locataire, je veux cliquer sur bouton pour m’inscrire et saisir
mes coordonnées.
-En tant que locataire, je veux me connecter à mon compte pour pouvoir
réserver un / ou plusieurs logements ou accéder à mes informations
personnelles.
![](536e0f3a-c899-11eb-a980-0cc47a792c0a_id_536e0f3a-c899-11eb-a980-0cc47a792c0a_files/background21.jpg)
-En tant que locataire, je souhaite avoir une validation de la réservation
effectuée sur mon compte bancaire ou mon compte PayPal.
-En tant que locataire, je veux faire la mise à jour des données de mon
compte.
-En tant que locataire, je souhaite recevoir un message après la fin de
chaque réservation pour le confirmer.
-En tant que locataire, je souhaite recevoir un reçu de paiement pour
suivre mes dépenses concernant le logement.
-En tant que locataire, je veux avoir un historique de réservation pour
suivre mes dépenses mensuelles et annuelles concernant le logement.
-En tant que locataire, je souhaite pouvoir naviguer la plateforme afin de
connaitre les offres des logements, les prix, les dates disponibles, les
informations relatives à la personne propriétaire de logement.
-En tant que locataire, je veux soumettre mes complaintes concernant
l’application ă tout moment afin de se bénéficier de son bon
fonctionnement.
-En tant que locataire, je souhaite partager mon avis sur un logement
spécifique que j’ai déjă réserver afin qu’il soit visible par les autres
utilisateurs, et visualiser les avis des autres locataires, pour améliorer
l’expérience des utilisateurs de cette plateforme͘
• Pour les administrateurs :
-En tant qu'administrateur, je souhaite entrer mes informations afin de
me connecter sur la plateforme.
-En tant qu'administrateur, je veux consulter les listes des logements,
leurs propriétaires, la capacite, les offres et toute les détails relatifs à
chaque logement afin de les gérer.
-En tant qu'administrateur, je veux être capable de les supprimer un
logement qui créer des problèmes dans la plateforme et bloquer son
![](536e0f3a-c899-11eb-a980-0cc47a792c0a_id_536e0f3a-c899-11eb-a980-0cc47a792c0a_files/background22.jpg)
propriétaire en se basant sur le grand nombre des signales et
réclamations.
-En tant qu'administrateur, je souhaite avoir l'accès aux différentes
demandes des utilisateurs pour pouvoir les valider.
• Pour les propriétaires des logements :
-En tant que propriétaire de logement, je souhaite ajouter mon
logement dans la base de données du site web avec sa photo afin d’être
affiché aux voyageurs probables.
-En tant que propriétaire de logement, je souhaite me connecter pour
pouvoir utiliser mon interface, visualiser les réservations effectuées, et
pouvoir les gérer.
-En tant que propriétaire de logement qui visite la plateforme sans
compte, je souhaite entrer mes données personnelles afin de me faire
inscrire.
VIII. Déroulement et simulation :
L’application Principale :
1. La page d’accueil
La page d’accueil est l’une des pages les plus consultées sur notre
application web. Il est donc important que ses contenus, sa navigation et
son design soient soignés pour donner envie au visiteur de rester sur
notre site et découvrir les différents services qu’on offre donc on doit
donner une bonne première impression à travers notre page d’accueil.
Notre page d’accueil est composé d’un menu, une barre de recherche et
les différents logements publies par les propriétaires (Ces logements
![](536e0f3a-c899-11eb-a980-0cc47a792c0a_id_536e0f3a-c899-11eb-a980-0cc47a792c0a_files/background23.jpg)
sont pris de la base de données) et aussi elle contient un footer tout en
respectant la charte graphique
Voici un aperçu de la page d’accueil :
• Rechercher un logement
Le visiteur ou bien le client peux faire une recherche à travers la barre de
recherche qui est dans la page d’accueil il suffit de remplir les
![](536e0f3a-c899-11eb-a980-0cc47a792c0a_id_536e0f3a-c899-11eb-a980-0cc47a792c0a_files/background24.jpg)
informations suivantes la destination, la date arrivée, la date de départ
et le nombre de personnes.
Le résultat de cette recherche est comme suit :
2. Authentification
• L’authentification selon les rôles des utilisateurs :
Pour notre application on a deux rôles a savoir le client et le propriétaire
En effet pour publier un logement il faut avoir un compte, donc tout
d’abord le propriétaire crée son compte à travers la page d’inscription
Page d’inscription
![](536e0f3a-c899-11eb-a980-0cc47a792c0a_id_536e0f3a-c899-11eb-a980-0cc47a792c0a_files/background25.jpg)
Validation des formulaires :
Tous nos formulaires sont valides comme le montre l’image suivante, si
on remplit pas tout ou par exemple on écrit une adresse mail n’est pas
correcte l’action sera refusé et des messages d’erreurs apparaissent
pour indiquer ă l’utilisateur ce qu’ il doit remplir pour que le formulaire
soit valide .
![](536e0f3a-c899-11eb-a980-0cc47a792c0a_id_536e0f3a-c899-11eb-a980-0cc47a792c0a_files/background26.jpg)
Après il accède à la page \<\< login \>\> pour s’authentifier
![](536e0f3a-c899-11eb-a980-0cc47a792c0a_id_536e0f3a-c899-11eb-a980-0cc47a792c0a_files/background27.jpg)
• Récupération de mot de passe
Si l’utilisateur oublie son mot de passe il peut le récupérer ă tout
moment il suffit qu’il soit authentifié avec une adresse mail valide pour
le récupérer.
Par la suite il va recevoir un mail pour récupérer son mot de passe.
![](536e0f3a-c899-11eb-a980-0cc47a792c0a_id_536e0f3a-c899-11eb-a980-0cc47a792c0a_files/background28.jpg)
3. La page propriétaire
Une fois le propriétaire est authentifié son interface s’affiche tout en
illustrons son nom sur la page pour indiquer que cette interface est
propre à ce propriétaire connecté, d’ailleurs personne ne peut accéder à
cette page à part ce propriétaire d’oƶ l’aspect de sécurité de notre
application.
Une fois qu’il clique sur \<\< Consulter votre espace\>\>, une autre interface
est affichée ou il y a les détails des logements qu’ il a publié, les actions
de Crud qu’ il peut faire (ajouter une annonce de logement
,chercher,supprimer,modifier)
![](536e0f3a-c899-11eb-a980-0cc47a792c0a_id_536e0f3a-c899-11eb-a980-0cc47a792c0a_files/background29.jpg)
Pour Ajouter un logement :
près l’enregistrement de l’annonce du logement, le propriétaire reçoit une
confirmation sous forme de l’interface suivante et aussi une confirmation par
mail.
![](536e0f3a-c899-11eb-a980-0cc47a792c0a_id_536e0f3a-c899-11eb-a980-0cc47a792c0a_files/background30.jpg)
Par exemple si le propriétaire souhaite supprimer un logement il suffit
de cliquer sur le bouton supprimer et une barre de confirmation est
affiché pour confirmer cette action critique.
![](536e0f3a-c899-11eb-a980-0cc47a792c0a_id_536e0f3a-c899-11eb-a980-0cc47a792c0a_files/background31.jpg)
Voici le résultat de la suppression, le 3ème logement n’est plus dans la
liste des logements.
Pour modifier un logement, il suffit de cliquer sur \<\<modifier\>\> pour
qu’un formulaire de modification ,spécifique à ce logement sélectionné,
est affiché pour faire les modifications nécessaires (Au niveau du code
on a pris ID de ce logement pour afficher ce formulaire).
![](536e0f3a-c899-11eb-a980-0cc47a792c0a_id_536e0f3a-c899-11eb-a980-0cc47a792c0a_files/background32.jpg)
![](536e0f3a-c899-11eb-a980-0cc47a792c0a_id_536e0f3a-c899-11eb-a980-0cc47a792c0a_files/background33.jpg)
4. Les avis :
On a créé une section des avis \<\<Experience \>\> ou les gens peuvent exprimer
leurs avis à propos de leurs expériences
Le but de cette section est aider les gens à prendre leurs décision
![](536e0f3a-c899-11eb-a980-0cc47a792c0a_id_536e0f3a-c899-11eb-a980-0cc47a792c0a_files/background34.jpg)
5. La réservation
Quand le visiteur/client visite notre site pour consulter nos offres de
logements (les logements publiés par nos clients propriétaires) donc selon
ses besoin il va parcourir les logements qu’ ils lui intéressent ,ainsi il peut
voir les détails de ces logements et de séjours comme on a déjà montrer
précédemment ,après il peut faire une réservation en ligne donc une fois
qu’ il clique sur réserver le formulaire de réservation est affiché.
Voici un aperçu de la page de réservation
![](536e0f3a-c899-11eb-a980-0cc47a792c0a_id_536e0f3a-c899-11eb-a980-0cc47a792c0a_files/background35.jpg)
6. Le paiement
Après on dirige l’utilisateur vers une page pour décrire sa méthode de
payement et confirmation de prix avant de l’envoyer au site de PayPal lă
où le paiement est effectué.
Aperçu de la page de Le paiement
![](536e0f3a-c899-11eb-a980-0cc47a792c0a_id_536e0f3a-c899-11eb-a980-0cc47a792c0a_files/background36.jpg)
Envoi vers le site PayPal :
![](536e0f3a-c899-11eb-a980-0cc47a792c0a_id_536e0f3a-c899-11eb-a980-0cc47a792c0a_files/background37.jpg)
![](536e0f3a-c899-11eb-a980-0cc47a792c0a_id_536e0f3a-c899-11eb-a980-0cc47a792c0a_files/background38.jpg)
![](536e0f3a-c899-11eb-a980-0cc47a792c0a_id_536e0f3a-c899-11eb-a980-0cc47a792c0a_files/background39.jpg)
Une fois que la réservation est terminée sans aucun problème le client va
recevoir un mail pour la confirmation du succès de ses opérations comme le
montre l’image suivante͘
![](536e0f3a-c899-11eb-a980-0cc47a792c0a_id_536e0f3a-c899-11eb-a980-0cc47a792c0a_files/background40.jpg)
Réclamations :
L’utilisateur de FinTbat peut contacter l’administrateur de FinTbat, et ceci
grâce ă l’interface de réclamation
Ainsi , ce message va être enregistre et affiché ă l’administrateur, dans
l’interface de gestion des réclamations et qui sera accédé que par
l’administrateur :
![](536e0f3a-c899-11eb-a980-0cc47a792c0a_id_536e0f3a-c899-11eb-a980-0cc47a792c0a_files/background41.jpg)
L’admin peut soit supprimer la réclamation s’il trouve qu’elle n’est pas
pertinente, soit répondre à la réclamation par mail, et ceci par le biais de
l’interface suivante :
Ensuite, l’émetteur de la réclamation va recevoir immédiatement la réponse
dans sa boite mail personnelle :
près que l’administrateur répond ă une réclamation, cette dernière va être
supprimé automatiquement de la liste des réclamations non traité d’une part,
et elle va s’incrémenter ă la liste des réclamation traite
Vers Une Architecture Client/ Serveur ?
Comme vous savez, l’architecture c/s a introduit des solutions importantes,
puisqu’en générale l'architecture client-serveur est particulièrement utile
![](536e0f3a-c899-11eb-a980-0cc47a792c0a_id_536e0f3a-c899-11eb-a980-0cc47a792c0a_files/background42.jpg)
pour les applications qui nécessitent une séparation ou une abstraction des
préoccupations entre le client et le serveur ; il est destiné aux systèmes à
haute interopérabilité. Le style architectural client-serveur aide les
applications à améliorer les performances d'évolutivité.
Alors on a essayé de transformer le projet vers une architecture c/s :
On a commencé par la partie essentielle : gestion des Logements (CRUD)
En effet, On a utilisé SpringBoot pour la partie Backend , et ReactJS pour la
partie frontend.
Vous pouvez visualiser le déploiement sur Heroku de :
La partie frontend [Client] :
[https://logement-app-front-end.herokuapp.com/](https://logement-app-front-end.herokuapp.com/)
Code Source : [https://github.com/EMI-PI-s4-grp8/LocationApp-front-end](https://github.com/EMI-PI-s4-grp8/LocationApp-front-end)
L’ PI de Spring Boot [Server]:
Pour GET les logements :
[https://logeement-app-api.herokuapp.com/logements](https://logeement-app-api.herokuapp.com/logements)
Code Source sur GitHub :
[https://github.com/EMI-PI-s4-grp8/Location-App-Backend](https://github.com/EMI-PI-s4-grp8/Location-App-Backend)
Affichage des logements à partir de l’api fournit par Spring Boot :
![](536e0f3a-c899-11eb-a980-0cc47a792c0a_id_536e0f3a-c899-11eb-a980-0cc47a792c0a_files/background43.jpg)
jout d’un Logement :
![](536e0f3a-c899-11eb-a980-0cc47a792c0a_id_536e0f3a-c899-11eb-a980-0cc47a792c0a_files/background44.jpg)
Détection de l’évaluation sur 5 Etoiles :
Page de connexion :
![](536e0f3a-c899-11eb-a980-0cc47a792c0a_id_536e0f3a-c899-11eb-a980-0cc47a792c0a_files/background45.jpg)
Page d’inscription :
L’ PI des Logements :
![](536e0f3a-c899-11eb-a980-0cc47a792c0a_id_536e0f3a-c899-11eb-a980-0cc47a792c0a_files/background46.jpg)
Les Livrables :
Déploiement :
L’application Principale :
[https://fin-tbat.herokuapp.com/](https://fin-tbat.herokuapp.com/)
L’application Client de l’architecture Client/Server :
[https://logement-app-front-end.herokuapp.com/](https://logement-app-front-end.herokuapp.com/)
Codes Sources :
[https://github.com/EMI-PI-s4-grp8](https://github.com/EMI-PI-s4-grp8)
On a créé une organisation sur GitHub qui contient le différentes
architectures/projets, pour que nos travaux soient accessible a large
échelle pour aider la communauté
![](536e0f3a-c899-11eb-a980-0cc47a792c0a_id_536e0f3a-c899-11eb-a980-0cc47a792c0a_files/background47.jpg)
![](536e0f3a-c899-11eb-a980-0cc47a792c0a_id_536e0f3a-c899-11eb-a980-0cc47a792c0a_files/background48.jpg)
Conclusion :
Le projet Site web de location de logement intitulé : « FinTbat », réalisé sous
forme de projet intégré, a été très enrichissant pour nous comme étant des
futurs ingénieurs Informatique.
La réalisation du projet a été supporté par la cohérence de notre groupe, le
respect des délais, et la bonne répartition des tâches entre tous les membres de
l’équipe, et ceci n’a pas empêché qu’on s’entre aide entre nous lors de
l’avancement des travaux͘
Ce projet nous a offert l’opportunité de nous intégrer et de découvrir le travail
en groupe grâce à la méthode agile Scrum, améliorer nos capacités du
développement web, maitriser la programmation orienté objet en architecture
MVC ͘ En plus, Ce projet nous a permis de comprendre l’importance de la
planification tout au long de la réalisation du projet, ainsi que d’évoluer nos
connaissances.
Finalement, nous voudrions remercier la professeur encadrante Mme Retbi
pour son encadrement et sa surveillance le long de notre travail et nous
espérons que ce travail soit à la hauteur de ses attentes.
