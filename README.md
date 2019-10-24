# Integration_Tools
This repo will contain some CI tools added on a project

# To contribute
- Fork the repo;
- clone it;
- make the changes wanted, ie add your favourite CI tool;
- Make a pull request.

Its an IntelliJ IDEA project...


# Devops Principles: 


Pour les principes Devops qu'on peut resumer en l'acronyme CAMS: 

#### 1- Culture represented by human communication, technical processes, and tools :
assuré par l'outil Jira dans ce cas, qui permet le mapping des taches et des stories et la planification du projet

#### 2- Automation of process : 
L'automatisation dans notre cas est assurée par plusieurs outils : 
- Jenkins/hudson permet d'automatiser les builds et les tests et deploiment 
- Emma et Junit définissent les tests qui vont être automatisés par Jenkins/hudson
        
  
#### 3- Measurements of Key Performance Indicators  :

Cette aspect est géré par sonarqube ou xradar qui permettent de vérifier la qualité logiciele en continue pour sonar ou vers la fin pour xradar qui donne aussi une note sur la qualité du code
        
#### 4- Sharing feedback, best practices, and knowledge 
Best practices: S.O.L.I.D

  
En plus, l'intégration continue est assurée par jenkins ou hudson qui assurent que tout code qui a été envoyé passe par le pipeline d'intégration avant d'être approuvé comme release

L'outil Docker assure le déploiment dans ce cas pour éviter les problèmes d'intégration et des dépendences. 
