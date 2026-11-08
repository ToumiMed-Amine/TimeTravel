# ⏳ TimeTravel – Application de voyage temporel

## 📌 Présentation du projet

**TimeTravel** est une application mobile Android développée en Java avec Android Studio. Elle permet à un voyageur de saisir ses informations personnelles, de choisir une année de destination et un motif de voyage, puis de passer par une vérification avant d'obtenir une décision concernant son voyage temporel.

Ce projet a pour objectif de mettre en pratique le développement Android, la navigation entre les activités et la transmission des données à l'aide des objets `Intent`.

## 🎯 Objectifs

- Créer une interface d'inscription pour les voyageurs.
- Récupérer les informations saisies par l'utilisateur.
- Vérifier les informations du voyageur avant son départ.
- Appliquer une règle de sécurité temporelle basée sur les nombres premiers.
- Afficher le résultat de la vérification.

## ⚙️ Fonctionnalités principales

### 1. Inscription du voyageur – MainActivity
- Saisie du nom du voyageur.
- Saisie de l'année de naissance.
- Choix de l'année de destination.
- Sélection du motif du voyage :
  - Tourisme
  - Modification du passé
  - Fuite
- Accès à l'activité de vérification.

### 2. Vérification du voyage – VerificationActivity
- Affichage des informations du voyageur.
- Calcul de la différence entre l'année de destination et l'année de naissance.
- Affichage du motif du voyage.
- Possibilité d'approuver ou de refuser le voyage.

**Règle de sécurité temporelle :**

Si le motif est « Modification du passé » et que la différence entre l'année de destination et l'année de naissance est un nombre premier, le bouton « Approuver » est automatiquement désactivé.

### 3. Résultat du voyage – ResultActivity
- Affichage de la décision finale.
- Fond vert en cas d'acceptation.
- Fond rouge en cas de refus.
- Affichage d'un message personnalisé.
- Possibilité de commencer un nouveau voyageur.

## 🛠️ Technologies utilisées

- **Langage :** Java
- **Environnement de développement :** Android Studio
- **Interface utilisateur :** XML
- **Navigation :** Android Intents
- **Gestion du code source :** Git et GitHub

## 📂 Structure du projet

```text
TimeTravel/
│
├── app/
│   └── src/
│       └── main/
│           ├── java/
│           │   └── com/example/timetravel/
│           │       ├── MainActivity.java
│           │       ├── VerificationActivity.java
│           │       ├── ResultActivity.java
│           │       └── IntentKeys.java
│           │
│           ├── res/
│           │   ├── layout/
│           │   ├── drawable/
│           │   ├── mipmap/
│           │   └── values/
│           │
│           └── AndroidManifest.xml
│
└── README.md
```

## 👥 Membres du groupe

- Islem Ajbouni
- Elyess Jridi
- Mohamed Amine Toumi

## 🚀 Installation et exécution

1. Cloner le dépôt GitHub.
2. Ouvrir le projet dans Android Studio.
3. Attendre la synchronisation Gradle.
4. Lancer l'application sur un émulateur ou un appareil Android.

## 📌 Conclusion

Le projet **TimeTravel** permet de découvrir et de mettre en pratique plusieurs concepts fondamentaux du développement Android, notamment la création d'interfaces XML, la programmation Java, les activités, les Intents et les conditions logiques.

**Projet académique réalisé dans le cadre d'un travail pratique de développement mobile.**
