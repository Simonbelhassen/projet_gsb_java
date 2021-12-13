-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 28, 2021 at 10:47 PM
-- Server version: 10.4.21-MariaDB
-- PHP Version: 8.0.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `gestion_visiteurs`
--

-- -----------------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `idUser` int(10) DEFAULT NULL,
  `userName` varchar(10) DEFAULT NULL,
  `loginUser` varchar(10) DEFAULT NULL,
  `pwdUser` varchar(20) DEFAULT NULL,
  `statusUser` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`idUser`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `users` (`idUser`, `userName`, `loginUser`, `pwdUser`, `statusUser`) VALUES
(1, 'Dumitru', 'dim', 'ddd', 'user'),
(2, 'Simon', 'sim', 'sss', 'user'),
(3, 'Jack', 'jim', 'jjj', 'user'),
(4, 'Mike', 'mim', 'mmm', 'user');


-- ------------------------------------------------------------------


--
-- Table structure for table `labo`
--

CREATE TABLE `labo` (
  `lab_code` int(2) NOT NULL,
  `lab_nom` varchar(10) DEFAULT NULL,
  `lab_chefvente` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`lab_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `labo` (`lab_code`, `lab_nom`, `lab_chefvente`) VALUES
(21, 'LBM BIOGROUP BPO-BIOEPINE SITE PARIS PONT NEUF', 'MR.Jean'),
(22, 'LBM PARIS CENTRE SITE HOTEL DIEU APHP', 'MR.Pierre'),
(23, 'LBM CTRE MED ENTREPRISES', 'MR.Edouard'),
(24, 'LBM PARC MONCEAU SITE DE BELLEVILLE', 'MR.Jacques'),
(25, 'LBM BIOGROUP BPO-BIOEPINE SITE PARIS PONT NEUF', 'MR.Chris'),
(26, 'LBM DES ALLEES ', 'MR.Elie'),
(27, 'LBM DANALYSE AIN', 'MR.Vincent'),
(28, 'LBM DANALYSE ', 'MR.Neutron'),
(29, 'LBM de Chimie des Biomolécules et de l ENVIRONEMENT ', 'MR.Ali'),
(30, 'LBM de Chimie des Polymères Organiques ', 'MR.Sepharin'),
(31, 'LBM de Chimie des Systèmes Fonctionnels ', 'MR.Aliou'),
(32, 'LBM de Chimie et Toxicologie Analytique et Cellulaire ', 'MR.Jules'),
(33, 'LBM de Chimie et de Biochimie Pharmacologiques et Toxicologiques ', 'MR.Mathias'),
(34, 'LBM de Parasitologie-Mycologie ', 'MR.Kodo'),
(35, 'LBM de Pharmacie Galénique', 'MR.Vitalie'),
(36, 'LBM de Pharmacologie et Toxicologie', 'MR.Brison'),
(37, 'LBM de Physico-Chimie des Surfaces', 'MR.Salomon'),
(38, 'LBM de chimie des matériaux ', 'MR.Quentin'),
(39, 'LBM Matière et Systèmes Complexes', 'MR.Francois'),
(40, 'LBM Medical Genetics', 'MR.Zitoune'),
(41, 'LBM Neurosciences Paris Seine', 'MR.Kana'),
(42, 'LBM  Neuroépidémiologie Tropicale et Comparée', 'MR.Vaz'),
(43, 'LBM Nutrition et Neurobiologie intégrée', 'MR.Santana'),
(44, 'LBM OTR3 Sarl', 'MR.Nolan'),
(45, 'LBM Perinatal HIV Research Unit ', 'MR.Joseph'),
(46, 'LBM Pharma Research Department', 'MR.Benjamain'),
(47, 'LBM Physico-Chimie-Curie', 'MR.Brice'),
(48, 'LBM Physico-chimie, pharmacotechnie, biopharmacie ', 'MR.Salizar'),
(49, 'LBM EUROFINS - CEF site Pelleport', 'MR.Paul');


-- ------------------------------------------------------------------


--
-- Table structure for table `secteur`
--

CREATE TABLE `secteur` (
  `sec_code` int(10) NOT NULL,
  `sec_libelle` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`sec_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `secteur` (`sec_code`, `sec_libelle`) VALUES
(59000 , 	'Paris Nord'),
(45000 , 	'Paris Centre'),
(97000 , 	'Département Outre-Mer'),
(65000,		'Paris Est'),
(29000,		'Paris Ouest'),
(20000,		'Corse'),
(13000,		'Paris Sud');


-- -----------------------------------------------------------------


--
-- Table structure for table `region`
--

CREATE TABLE `region` (
  `reg_code` int(10) NOT NULL,
  `reg_nom` varchar(50) DEFAULT NULL,
  `sec_code` int(10) DEFAULT NULL,
  PRIMARY KEY (`reg_code`),
  FOREIGN KEY (`sec_code`) REFERENCES secteur(`sec_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `region` (`reg_code`, `reg_nom`, `sec_code`) VALUES
(59130, 'Nord-Pas-de-Calais', 59000),
(59220, 'Picardie', 59000),
(59310, 'Île-de-France', 59000),
(45100, 'Centre Val de Loire', 45000),
(97220, 'Guadeloupe', 97000),
(97440, 'Guyane', 97000),
(97550, 'Réunion', 97000),
(65250, 'Champagne-Ardennes',	65000),
(65240, 'Loraine', 65000),
(65330, 'Alsace', 65000),
(65420, 'Franche-Comté', 65000),
(65510, 'Bourgogne', 65000),
(29160, 'Bretagne', 29000),
(29250, 'Normandie', 29000),
(29340, 'Pays de la Loire', 29000),
(29430, 'Limousin', 29000),
(29520, 'Aquitaine', 29000),
(29610, 'Poitou-Charentes', 29000),
(20100, 'Bastia', 20000),
(13010, 'Auvergne-Rhône-Alpes', 13000),
(13020, "Alpes-Cote d'Azur", 13000),
(13030, 'Provence', 13000),
(13040, 'Midi-Pyrénées', 13000),
(13050, 'Languedoc-Rousillon', 13000);


-- ----------------------------------------------------------------


--
-- Table structure for table `visiteur`
--

CREATE TABLE `visiteur` (
  `vis_matricule` int(50) NOT NULL,
  `vis_nom` varchar(25) DEFAULT NULL,
  `vis_prenom` varchar(50) DEFAULT NULL,
  `vis_adresse` varchar(50) DEFAULT NULL,
  `vis_cp` int(5) DEFAULT NULL,
  `vis_ville` varchar(30) DEFAULT NULL,
  `vis_dateembauche` date DEFAULT NULL,
  `sec_code` int(10) DEFAULT NULL,
  `lab_code` int(2) DEFAULT NULL,
  PRIMARY KEY (`vis_matricule`),
  FOREIGN KEY (`sec_code`) REFERENCES secteur(`sec_code`),
  FOREIGN KEY (`lab_code`) REFERENCES labo(`lab_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `visiteur` (`vis_matricule`, `vis_nom`, `vis_prenom`, `vis_adresse`, `vis_cp`, `vis_ville`, `vis_dateembauche`, `sec_code`, `lab_code`) VALUES
(1, 'Blocuse', 'Michel', '1 rue Victor Schoelcher', 95200, 'Sarcelles', '2019-02-05',45000 , 23),
(2, 'Coto', 'Allan', '43 rue Raspail ', 93100, 'Montreuil', '2021-01-18',45000 , 21),
(3, 'Estaban', 'Pierre', '13 rue Victor Hugo', 13001, 'Marseille', '2021-01-18',13000 , 27),
(4, 'Nackache', 'Alain', '6 rue bis Romain Gary', 59000, 'Lille', '2021-01-03', 59000, 29),
(5, 'Simon', 'Jack', '5 rue des paris', 13001, 'Marseille', '2021-01-18',13000 , 23),
(6, 'Martin', 'Julien', '28 rue des impasses', 92800 , 'Fort-de-France', '2019-02-05',97000,30 ),
(7, 'Bernard ', 'Eric', '6 rue bis Romain Gary',20900, 'Bastia', '2021-03-08', 20000,37),
(8, 'Thomas ', 'Philippe', '38 rue de la liberté', 93100, 'Montreuil','2021-10-15', 45000,45),
(9, 'Petit', 'Kevin', '1 rue du père auteuil',95200, 'Sarcelles', '2021-01-03',45000 ,23),
(10, 'Robert ', 'Luc', '2 bis avenue vienne', 13001 , 'Marseille', '2020-02-05',13000 ,33),
(11, 'Richard ', 'Allan', '46 rue de paris',75001, 'Paris', '2021-01-21',45000 ,49),
(12, 'Durand', 'Pierre', '28 rue montaigne',75001, 'Paris', '2020-02-05',45000 ,23),
(13, 'Dubois ', 'Michel', '1 Rue de la riviere',78110 , 'Le Vesinet','2021-06-11',20000 ,28),
(14, 'Moreau', 'Jack', '22 boulevard verdun',59000 , 'Lille', '2020-10-01',59000,36),
(15, 'Laurent ', 'Lucien', '18 rue de la gare',28000, 'Chartres','2021-12-21', 97000 ,30 ),
(16, 'Simon', 'Arnaud', '3 rue léon gambeta',40000 , 'Mont De Marsan', '2021-11-11',13000 ,23),
(17, 'Michel ', 'Larry', '62 rue princesse', 28100, 'Dreux', '2020-01-21', 97000,46),
(18, 'Lefebvre ','Aristide', '90 rue champs elysées',67000 , 'Strasbourg', '2021-12-21',13000 ,28 ),
(19, 'Rony ', 'Maxence', '75 rue pierre alain',35400, 'Saint Malo', '2020-09-13',97000 ,46 ),
(20, 'Salomon', 'Phil', '3 rue léon gambeta',20000 , 'Mont De Marsan', '2020-03-12',13000 ,25 ),
(21, 'Michael ', 'Larry', '62 rue princesse', 28500, 'Vernouillet', '2020-08-11', 29000,36 ),
(22, 'Lefevre ','Harry', '90 rue champs elysées',67000 , 'Strasbourg','2019-01-22' ,65000 ,23 ),
(23, 'Lennie ', 'Quentin', '75 rue pierre alain',28500, 'Vernouillet', '2020-05-24',29000 , 45 ),
(24, 'Biando', 'Paolo', '3 rue léon gambeta',13800 , 'Istre', '2020-03-12',29000 ,36),
(25, 'Patho ', 'Ivy', '62 rue princesse', 28000, 'Dreux', '2020-05-24',29000 ,33),
(26, 'Sainto, ','Dibril', '90 rue champs elysées',92800, 'Puteaux', '2020-07-14', 45000,22 ),
(27, 'Cornier ', 'Isac', '75 rue pierre alain',13800, 'Istre', '2019-03-12',65000 ,21),
(28, 'Ricki ', 'Rubio', '62 rue du roi', 1300, 'Marseille', '2020-01-10',13000 ,31),
(29, 'Santo, ','Vito', '90 rue champs du moine',92800, 'Puteaux', '2019-07-14',45000,41 ),
(30, 'Savastanos ', 'Luc', '75 rue pierre',13800, 'Istre', '2019-05-20',65000 ,31);


-- ---------------------------------------------------------------


--
-- Table structure for table `travailler`
--

CREATE TABLE `travailler` (
  `vis_matricule` int(10) DEFAULT NULL,
  `reg_code` int(10) DEFAULT NULL,
  `aaaammjj` date DEFAULT NULL,
  `tra_role` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`vis_matricule`, `reg_code`, `jjmmaa`),
  FOREIGN KEY (`vis_matricule`) REFERENCES visiteur(`vis_matricule`),
  FOREIGN KEY (`reg_code`) REFERENCES region(`reg_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `travailler` (`vis_matricule`, `reg_code`, `jjmmaa`, `tra_role`) VALUES
(1,  59130 , '2021-12-18', 'médecin'),
(2,  97220 , '2021-02-17', 'testeur'),
(2,  65250 , '2021-03-27', 'chef infirmier'),
(3,  29160 , '2021-04-12', 'médecin'),
(3,  20100 , '2021-05-08', 'chef de pediatrie'),
(4,  13010 , '2021-06-14', 'testeur'),
(4,  59220 , '2021-07-03', 'chef infirmier'),
(5,  45100 , '2019-08-22', 'médecin'),
(5,  97440 , '2021-09-01', 'chef de pediatrie'),
(6,  65240 , '2021-10-01', 'testeur'),
(6,  29250 , '2021-11-09', 'chef infirmier'),
(7,  29250 , '2021-12-17', 'médecin'),
(7,  13020 , '2021-01-23', 'chef de pediatrie'),
(8,  59310 , '2021-02-24', 'testeur'),
(8,  45100 , '2021-03-30', 'chef infirmier'),
(9,  97440 , '2021-04-30', 'médecin'),
(9,  65330 , '2021-05-27', 'chef de pediatrie'),
(10, 29340 , '2021-06-30', 'testeur'),
(10, 20100 , '2021-07-18', 'chef infirmier'),
(11, 13030 , '2021-08-16', 'médecin'),
(11, 59130 , '2021-09-19', 'chef de pediatrie'),
(12, 45100 , '2021-10-11', 'testeur'),
(12, 97550 , '2021-11-17', 'chef infirmier'),
(13, 65420 , '2021-12-12', 'médecin'),
(13, 29430 , '2021-01-07', 'chef de pediatrie'),
(14, 29250 , '2021-02-04', 'testeur'),
(14, 13040 , '2021-03-09', 'chef infirmier'),
(15, 59220 , '2021-04-30', 'médecin'),
(15, 45100 , '2021-05-29', 'chef de pediatrie'),
(16, 97550 , '2021-06-27', 'testeur'),
(16, 65510 , '2021-07-16', 'chef infirmier'),
(17, 29520 , '2021-08-26', 'médecin'),
(17, 20100 , '2021-09-12', 'chef de pediatrie'),
(18, 13050 , '2021-10-12', 'testeur'),
(18, 59310 , '2021-11-16', 'chef infirmier'),
(19, 45100 , '2021-12-25', 'médecin'),
(19, 97220 , '2021-01-24', 'chef de pediatrie'),
(20, 65250 , '2021-02-23', 'testeur'),
(20, 29610 , '2021-03-22', 'chef infirmier'),
(21, 29250 , '2021-04-21', 'médecin'),
(21, 13010 , '2021-05-10', 'chef de pediatrie'),
(22, 59130 , '2021-06-19', 'testeur'),
(22, 45100 , '2021-07-09', 'chef infirmier'),
(23, 13010 , '2021-08-18', 'médecin'),
(23, 65240 , '2021-09-08', 'chef de pediatrie'),
(24, 29160 , '2021-10-17', 'testeur'),
(24, 20100 , '2021-11-07', 'chef infirmier'),
(25, 13020 , '2021-12-16', 'médecin'),
(25, 59220 , '2021-01-06', 'chef de pediatrie'),
(26, 45100 , '2021-02-15', 'testeur'),
(26, 45100 , '2021-03-05', 'chef infirmier'),
(27, 65330 , '2021-04-14', 'médecin'),
(27, 29430 , '2021-05-04', 'chef de pediatrie'),
(28, 20100 , '2021-06-13', 'testeur'),
(28, 59310 , '2021-07-03', 'chef infirmier'),
(29, 29520 , '2021-08-12', 'médecin'),
(29, 13040 , '2021-09-02', 'chef de pediatrie'),
(30, 29610 , '2021-10-10', 'testeur'),
(30, 59130 , '2021-11-01', 'chef infirmier');


/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
