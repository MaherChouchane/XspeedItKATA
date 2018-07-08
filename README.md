XspeedIt
========

XspeedIt est une société d'import / export ayant robotisé toute sa chaîne d'emballage de colis.  
Elle souhaite trouver un algorithme permettant à ses robots d'optimiser le nombre de cartons d'emballage utilisés.

Les articles à emballer sont de taille variable, représentée par un entier compris entre 1 et 9.  
Chaque carton a une capacité de contenance de 10.  
Ainsi, un carton peut par exemple contenir un article de taille 3, un article de taille 1, et un article de taille 6.

La chaîne d'articles à emballer est représentée par une suite de chiffres, chacun représentant un article par sa taille.  
Après traitement par le robot d'emballage, la chaîne est séparée par des "/" pour représenter les articles contenus dans un carton.

*Exemple*  
```python
Chaîne d'articles en entrée : 163841689525773  
Chaîne d'articles emballés  : 163/8/41/6/8/9/52/5/7/73
```

L'algorithme actuel du robot d'emballage est très basique.  
Il prend les articles les uns après les autres, et les mets dans un carton.  
Si la taille totale dépasse la contenance du carton, le robot met l'article dans le carton suivant.

Solution
--------
build the project : mvn clean install

run test : maven test

Resultat :

######### INPUT               -> [1, 6, 3, 8, 4, 1, 6, 8, 9, 5, 2, 5, 7, 7, 3]

######### OUTPUT (OPTIMIZED)  -> [19, 64, 37, 82, 163, 8, 55, 7]```
