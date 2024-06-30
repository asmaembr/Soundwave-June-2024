# Soundwave - Backend

Bienvenue sur Soundwave ! 
Ceci est le dépôt backend pour le projet de fin d'année Soundwave, 
une plateforme de streaming musical construite avec Spring Boot.

## Fonctionnalités

- Authentification et autorisation avec OAuth2 en utilisant Auth0
- Fonctionnalité d'upload de musique
- Streaming audio pour les utilisateurs
- Fonction de recherche pour trouver des morceaux facilement
- Favoris utilisateur pour sauvegarder et gérer les morceaux préférés
- Interface utilisateur responsive avec Bootstrap

## Technologies Utilisées

- **Spring Boot 3** : Framework backend pour construire des applications basées sur Java.
- **PostgreSQL** : Système de gestion de base de données relationnelle utilisé pour stocker les données de l'application.
- **Auth0** : Fournit l'authentification et l'autorisation en tant que service, intégrant OAuth2 pour une connexion sécurisée.
- **Bootstrap 5** : Framework frontend pour développer des sites web réactifs et adaptés aux mobiles.
- **Java Development Kit (JDK) 21** : Kit de développement requis pour compiler et exécuter le code Java.

## Pour Commencer

Pour commencer avec Soundwave, suivez les étapes ci-dessous :

### Prérequis

- JDK 21 : [Téléchargement](https://adoptium.net/temurin/releases/)
- IDE (par exemple, IntelliJ IDEA, Eclipse)
- PostgreSQL : [Téléchargement](https://www.postgresql.org/download/)

### Cloner le Dépôt

```bash
git clone https://github.com/asmaembr/soundwave-back.git
```

### Configuration des Variables d'Environnement

Créez un fichier `.env` à la racine du projet et ajoutez les variables d'environnement suivantes :

POSTGRES_USERNAME=
POSTGRES_PASSWORD=
POSTGRES_URL=
POSTGRES_DB=

AUTH0_CLIENT_ID=
AUTH0_CLIENT_SECRET=


### Récupération des Dépendances

```bash
./mvnw install -Dmaven.test.skip=true
```

### Lancement de l'Application

1. Ajoutez le fichier `.env` aux variables d'environnement de votre IDE.
2. Lancez l'application depuis votre IDE.
