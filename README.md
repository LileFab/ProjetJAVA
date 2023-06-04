# ProjetJAVA
Java Project DE2 - Morel Jérémy - Fleisch Fabien

Documentation technique du projet JAVA

Ce batch permet de récupérer les donénes de différents CSV pour ensuite les stockées dans une base de données après traitements.

Nous avons choisi d'utiliser une base MariaDB qui tourne dans un contenair Docker pour une installation rapide sur les machines

Nous avons un package "MySQL" qui va gérer tout cce qui est lié à la base de données :
- Un classe "Account" qui contient l'objet de transport des informations des CSV qui va permettre de récupérer les données du CSV 
pour ensuite les enregistrer dans la table en base de données.
- Une classe "CreateTable" qui elle contient le code SQL pour la création de la table et qui va l'éxécuter.
- Une classe "MyConnection" qui elle va gérer la connection avec la base en l'initialisant avec les données renseigné dans la classe

Le second package "ReadFiles" qui lui va s'occuper de la lecture des fichiers CSV avec les différentes vérifications :
- La classe "FindFiles" va scruter le répertoire et stockées les paths des différents fichier CSV ayant un nom dans le bon format pour les traitements.
- La classe "CSVFileReader" va lire dans les différents fichier CSV retourner par la classe au dessus, pour récupérer les différents champs de ces CSV.
