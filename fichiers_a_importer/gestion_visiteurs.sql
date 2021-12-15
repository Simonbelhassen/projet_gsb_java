-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 15, 2021 at 06:51 AM
-- Server version: 10.4.22-MariaDB
-- PHP Version: 7.4.26

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

-- --------------------------------------------------------

--
-- Table structure for table `labo`
--

CREATE TABLE `labo` (
  `lab_code` int(2) NOT NULL,
  `lab_nom` varchar(10) DEFAULT NULL,
  `lab_chefvente` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `labo`
--

INSERT INTO `labo` (`lab_code`, `lab_nom`, `lab_chefvente`) VALUES
(21, 'LBM BIOGRO', 'MR.Jean'),
(22, 'LBM PARIS ', 'MR.Pierre'),
(23, 'LBM CTRE M', 'MR.Edouard'),
(24, 'LBM PARC M', 'MR.Jacques'),
(25, 'LBM BIOGRO', 'MR.Chris'),
(26, 'LBM DES AL', 'MR.Elie'),
(27, 'LBM DANALY', 'MR.Vincent'),
(28, 'LBM DANALY', 'MR.Neutron'),
(29, 'LBM de Chi', 'MR.Ali'),
(30, 'LBM de Chi', 'MR.Sepharin'),
(31, 'LBM de Chi', 'MR.Aliou'),
(32, 'LBM de Chi', 'MR.Jules'),
(33, 'LBM de Chi', 'MR.Mathias'),
(34, 'LBM de Par', 'MR.Kodo'),
(35, 'LBM de Pha', 'MR.Vitalie'),
(36, 'LBM de Pha', 'MR.Brison'),
(37, 'LBM de Phy', 'MR.Salomon'),
(38, 'LBM de chi', 'MR.Quentin'),
(39, 'LBM Matièr', 'MR.Francois'),
(40, 'LBM Medica', 'MR.Zitoune'),
(41, 'LBM Neuros', 'MR.Kana'),
(42, 'LBM  Neuro', 'MR.Vaz'),
(43, 'LBM Nutrit', 'MR.Santana'),
(44, 'LBM OTR3 S', 'MR.Nolan'),
(45, 'LBM Perina', 'MR.Joseph'),
(46, 'LBM Pharma', 'MR.Benjamain'),
(47, 'LBM Physic', 'MR.Brice'),
(48, 'LBM Physic', 'MR.Salizar'),
(49, 'LBM EUROFI', 'MR.Paul');

-- --------------------------------------------------------

--
-- Table structure for table `region`
--

CREATE TABLE `region` (
  `reg_code` int(10) NOT NULL,
  `reg_nom` varchar(50) DEFAULT NULL,
  `sec_code` int(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `region`
--

INSERT INTO `region` (`reg_code`, `reg_nom`, `sec_code`) VALUES
(13010, 'Auvergne-Rhône-Alpes', 13000),
(13020, 'Alpes-Cote d\'Azur', 13000),
(13030, 'Provence', 13000),
(13040, 'Midi-Pyrénées', 13000),
(13050, 'Languedoc-Rousillon', 13000),
(20100, 'Bastia', 20000),
(29160, 'Bretagne', 29000),
(29250, 'Normandie', 29000),
(29340, 'Pays de la Loire', 29000),
(29430, 'Limousin', 29000),
(29520, 'Aquitaine', 29000),
(29610, 'Poitou-Charentes', 29000),
(45100, 'Centre Val de Loire', 45000),
(59130, 'Nord-Pas-de-Calais', 59000),
(59220, 'Picardie', 59000),
(59310, 'Île-de-France', 59000),
(65240, 'Loraine', 65000),
(65250, 'Champagne-Ardennes', 65000),
(65330, 'Alsace', 65000),
(65420, 'Franche-Comté', 65000),
(65510, 'Bourgogne', 65000),
(97220, 'Guadeloupe', 97000),
(97440, 'Guyane', 97000),
(97550, 'Réunion', 97000),
(97551, 'test1', 13000),
(97552, 'test2', 13000),
(97553, 'test3', 59000),
(97554, 'test4', 20000);

-- --------------------------------------------------------

--
-- Table structure for table `secteur`
--

CREATE TABLE `secteur` (
  `sec_code` int(10) NOT NULL,
  `sec_libelle` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `secteur`
--

INSERT INTO `secteur` (`sec_code`, `sec_libelle`) VALUES
(13000, 'Paris Sud'),
(20000, 'Corse'),
(29000, 'Paris Oues'),
(45000, 'Paris Cent'),
(59000, 'Paris Nord'),
(65000, 'Paris Est'),
(97000, 'Départemen');

-- --------------------------------------------------------

--
-- Table structure for table `travailler`
--

CREATE TABLE `travailler` (
  `vis_matricule` int(10) NOT NULL,
  `reg_code` int(10) NOT NULL,
  `aaaammjj` date NOT NULL,
  `tra_role` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `travailler`
--

INSERT INTO `travailler` (`vis_matricule`, `reg_code`, `aaaammjj`, `tra_role`) VALUES
(1, 13020, '2020-01-19', 'test2'),
(1, 59130, '2021-12-18', 'médecin'),
(2, 13030, '2018-10-17', 'test3'),
(2, 65250, '2021-03-27', 'chef infir'),
(2, 97220, '2021-02-17', 'testeur'),
(3, 20100, '2021-05-08', 'chef de pe'),
(3, 29160, '2021-04-12', 'médecin'),
(4, 13010, '2021-06-14', 'testeur'),
(4, 59220, '2021-07-03', 'chef infir'),
(5, 45100, '2019-08-22', 'médecin'),
(5, 97440, '2021-09-01', 'chef de pe'),
(6, 29250, '2021-11-09', 'chef infir'),
(6, 65240, '2021-10-01', 'testeur'),
(7, 13020, '2021-01-23', 'chef de pe'),
(7, 29250, '2021-12-17', 'médecin'),
(8, 45100, '2021-03-30', 'chef infir'),
(8, 59310, '2021-02-24', 'testeur'),
(9, 65330, '2021-05-27', 'chef de pe'),
(9, 97440, '2021-04-30', 'médecin'),
(10, 20100, '2021-07-18', 'chef infir'),
(10, 29340, '2021-06-30', 'testeur'),
(11, 13030, '2021-08-16', 'médecin'),
(11, 59130, '2021-09-19', 'chef de pe'),
(12, 45100, '2021-10-11', 'testeur'),
(12, 97550, '2021-11-17', 'chef infir'),
(13, 29430, '2021-01-07', 'chef de pe'),
(13, 65420, '2021-12-12', 'médecin'),
(14, 13040, '2021-03-09', 'chef infir'),
(14, 29250, '2021-02-04', 'testeur'),
(15, 45100, '2021-05-29', 'chef de pe'),
(15, 59220, '2021-04-30', 'médecin'),
(16, 65510, '2021-07-16', 'chef infir'),
(16, 97550, '2021-06-27', 'testeur'),
(17, 20100, '2021-09-12', 'chef de pe'),
(17, 29520, '2021-08-26', 'médecin'),
(18, 13050, '2021-10-12', 'testeur'),
(18, 59310, '2021-11-16', 'chef infir'),
(19, 45100, '2021-12-25', 'médecin'),
(19, 97220, '2021-01-24', 'chef de pe'),
(20, 29610, '2021-03-22', 'chef infir'),
(20, 65250, '2021-02-23', 'testeur'),
(21, 13010, '2021-05-10', 'chef de pe'),
(21, 29250, '2021-04-21', 'médecin'),
(22, 45100, '2021-07-09', 'chef infir'),
(22, 59130, '2021-06-19', 'testeur'),
(23, 13010, '2021-08-18', 'médecin'),
(23, 65240, '2021-09-08', 'chef de pe'),
(24, 20100, '2021-11-07', 'chef infir'),
(24, 29160, '2021-10-17', 'testeur'),
(25, 13020, '2021-12-16', 'médecin'),
(25, 59220, '2021-01-06', 'chef de pe'),
(26, 45100, '2021-02-15', 'testeur'),
(26, 45100, '2021-03-05', 'chef infir'),
(27, 29430, '2021-05-04', 'chef de pe'),
(27, 65330, '2021-04-14', 'médecin'),
(28, 20100, '2021-06-13', 'testeur'),
(28, 59310, '2021-07-03', 'chef infir'),
(29, 13040, '2021-09-02', 'chef de pe'),
(29, 29520, '2021-08-12', 'médecin'),
(30, 29610, '2021-10-10', 'testeur'),
(30, 59130, '2021-11-01', 'chef infir'),
(31, 97551, '2019-07-03', 'test1');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `idUser` int(10) NOT NULL,
  `userName` varchar(10) DEFAULT NULL,
  `loginUser` varchar(10) DEFAULT NULL,
  `pwdUser` varchar(20) DEFAULT NULL,
  `statusUser` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`idUser`, `userName`, `loginUser`, `pwdUser`, `statusUser`) VALUES
(1, 'Dumitru', 'dim', 'ddd', 'admin'),
(2, 'Simon', 'sim', 'sss', 'admin'),
(3, 'Jack', 'jim', 'jjj', 'admin'),
(4, 'Mike', 'mim', 'mmm', 'user');

-- --------------------------------------------------------

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
  `lab_code` int(2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `visiteur`
--

INSERT INTO `visiteur` (`vis_matricule`, `vis_nom`, `vis_prenom`, `vis_adresse`, `vis_cp`, `vis_ville`, `vis_dateembauche`, `sec_code`, `lab_code`) VALUES
(1, 'Blocuse', 'Michel', '1 rue Victor Schoelcher', 95200, 'Sarcelles', '2019-02-05', 45000, 23),
(2, 'Coto', 'Allan', '43 rue Raspail ', 93100, 'Montreuil', '2021-01-18', 45000, 21),
(3, 'Estaban', 'Pierre', '13 rue Victor Hugo', 13001, 'Marseille', '2021-01-18', 13000, 27),
(4, 'Nackache', 'Alain', '6 rue bis Romain Gary', 59000, 'Lille', '2021-07-03', 59000, 29),
(5, 'Simon', 'Jack', '5 rue des paris', 13001, 'Marseille', '2021-01-18', 13000, 23),
(6, 'Martin', 'Julien', '28 rue des impasses', 92800, 'Fort-de-France', '2019-02-05', 97000, 30),
(7, 'Bernard ', 'Eric', '6 rue bis Romain Gary', 20900, 'Bastia', '2021-03-08', 20000, 37),
(8, 'Thomas ', 'Philippe', '38 rue de la liberté', 93100, 'Montreuil', '2021-10-15', 45000, 45),
(9, 'Petit', 'Kevin', '1 rue du père auteuil', 95200, 'Sarcelles', '2021-01-03', 45000, 23),
(10, 'Robert ', 'Luc', '2 bis avenue vienne', 13001, 'Marseille', '2020-02-05', 13000, 33),
(11, 'Richard ', 'Allan', '46 rue de paris', 75001, 'Paris', '2021-01-21', 45000, 49),
(12, 'Durand', 'Pierre', '28 rue montaigne', 75001, 'Paris', '2020-02-05', 45000, 23),
(13, 'Dubois ', 'Michel', '1 Rue de la riviere', 78110, 'Le Vesinet', '2021-06-11', 20000, 28),
(14, 'Moreau', 'Jack', '22 boulevard verdun', 59000, 'Lille', '2020-10-01', 59000, 36),
(15, 'Laurent ', 'Lucien', '18 rue de la gare', 28000, 'Chartres', '2021-12-21', 97000, 30),
(16, 'Simon', 'Arnaud', '3 rue léon gambeta', 40000, 'Mont De Marsan', '2021-11-11', 13000, 23),
(17, 'Michel ', 'Larry', '62 rue princesse', 28100, 'Dreux', '2020-01-21', 97000, 46),
(18, 'Lefebvre ', 'Aristide', '90 rue champs elysées', 67000, 'Strasbourg', '2021-12-21', 13000, 28),
(19, 'Rony ', 'Maxence', '75 rue pierre alain', 35400, 'Saint Malo', '2020-09-13', 97000, 46),
(20, 'Salomon', 'Phil', '3 rue léon gambeta', 20000, 'Mont De Marsan', '2020-03-12', 13000, 25),
(21, 'Michael ', 'Larry', '62 rue princesse', 28500, 'Vernouillet', '2020-08-11', 29000, 36),
(22, 'Lefevre ', 'Harry', '90 rue champs elysées', 67000, 'Strasbourg', '2019-01-22', 65000, 23),
(23, 'Lennie ', 'Quentin', '75 rue pierre alain', 28500, 'Vernouillet', '2020-05-24', 29000, 45),
(24, 'Biando', 'Paolo', '3 rue léon gambeta', 13800, 'Istre', '2020-03-12', 29000, 36),
(25, 'Patho ', 'Ivy', '62 rue princesse', 28000, 'Dreux', '2020-05-24', 29000, 33),
(26, 'Sainto, ', 'Dibril', '90 rue champs elysées', 92800, 'Puteaux', '2020-07-14', 45000, 22),
(27, 'Cornier ', 'Isac', '75 rue pierre alain', 13800, 'Istre', '2019-03-12', 65000, 21),
(28, 'Ricki ', 'Rubio', '62 rue du roi', 1300, 'Marseille', '2020-01-10', 13000, 31),
(29, 'Santo, ', 'Vito', '90 rue champs du moine', 92800, 'Puteaux', '2019-07-14', 45000, 41),
(30, 'Savastanos ', 'Luc', '75 rue pierre', 13800, 'Istre', '2019-05-20', 65000, 31),
(31, 'testNom', 'testPrenom', 'testAdresse', 59000, 'Lille', '2018-01-22', 45000, 29),
(32, 'testNom2', 'testPrenom2', 'testAdresse2', 40000, 'Mont De Marsan', '2014-09-04', 20000, 26),
(33, 'testNom3', 'testprenom3', 'testAdresse3', 92800, 'Fort-de-France', '2019-07-03', 59000, 49);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `labo`
--
ALTER TABLE `labo`
  ADD PRIMARY KEY (`lab_code`);

--
-- Indexes for table `region`
--
ALTER TABLE `region`
  ADD PRIMARY KEY (`reg_code`),
  ADD KEY `sec_code` (`sec_code`);

--
-- Indexes for table `secteur`
--
ALTER TABLE `secteur`
  ADD PRIMARY KEY (`sec_code`);

--
-- Indexes for table `travailler`
--
ALTER TABLE `travailler`
  ADD PRIMARY KEY (`vis_matricule`,`reg_code`,`aaaammjj`),
  ADD KEY `reg_code` (`reg_code`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`idUser`);

--
-- Indexes for table `visiteur`
--
ALTER TABLE `visiteur`
  ADD PRIMARY KEY (`vis_matricule`),
  ADD KEY `sec_code` (`sec_code`),
  ADD KEY `lab_code` (`lab_code`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `region`
--
ALTER TABLE `region`
  ADD CONSTRAINT `region_ibfk_1` FOREIGN KEY (`sec_code`) REFERENCES `secteur` (`sec_code`);

--
-- Constraints for table `travailler`
--
ALTER TABLE `travailler`
  ADD CONSTRAINT `travailler_ibfk_1` FOREIGN KEY (`vis_matricule`) REFERENCES `visiteur` (`vis_matricule`),
  ADD CONSTRAINT `travailler_ibfk_2` FOREIGN KEY (`reg_code`) REFERENCES `region` (`reg_code`);

--
-- Constraints for table `visiteur`
--
ALTER TABLE `visiteur`
  ADD CONSTRAINT `visiteur_ibfk_1` FOREIGN KEY (`sec_code`) REFERENCES `secteur` (`sec_code`),
  ADD CONSTRAINT `visiteur_ibfk_2` FOREIGN KEY (`lab_code`) REFERENCES `labo` (`lab_code`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
