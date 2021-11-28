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

-- --------------------------------------------------------

--
-- Table structure for table `connection`
--

CREATE TABLE `connection` (
  `idUser` int(10) DEFAULT NULL,
  `userName` varchar(10) DEFAULT NULL,
  `loginUser` varchar(10) DEFAULT NULL,
  `pwdUser` varchar(20) DEFAULT NULL,
  `statusUser` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `connection`
--

INSERT INTO `connection` (`idUser`, `userName`, `loginUser`, `pwdUser`, `statusUser`) VALUES
(1, 'Dumitru', 'dim', 'ddd', 'admin'),
(2, 'Simon', 'sim', 'sss', 'admin'),
(3, 'Jack', 'jim', 'jjj', 'admin'),
(4, 'Mike', 'mim', 'mmm', 'user');

-- --------------------------------------------------------

--
-- Table structure for table `labo`
--

CREATE TABLE `labo` (
  `lab_code` int(2) NOT NULL,
  `lab_nom` varchar(10) DEFAULT NULL,
  `lab_chefvente` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `region`
--

CREATE TABLE `region` (
  `reg_code` int(10) NOT NULL,
  `reg_nom` varchar(50) DEFAULT NULL,
  `sec_code` int(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `secteur`
--

CREATE TABLE `secteur` (
  `sec_code` int(10) NOT NULL,
  `sec_libelle` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `travailler`
--

CREATE TABLE `travailler` (
  `vis_matricule` int(10) DEFAULT NULL,
  `jjmmaa` date DEFAULT NULL,
  `reg_code` int(10) DEFAULT NULL,
  `tra_role` varchar(10) DEFAULT NULL,
  `tra_id` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

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

-- --------------------------------------------------------

--
-- Table structure for table `visiteur_regions`
--

CREATE TABLE `visiteur_regions` (
  `vis_reg_id` int(50) NOT NULL,
  `vis_matricule` int(10) DEFAULT NULL,
  `reg_code_1` int(11) DEFAULT NULL,
  `reg_code_2` int(11) DEFAULT NULL,
  `reg_code_3` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

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
  ADD PRIMARY KEY (`tra_id`),
  ADD KEY `reg_code` (`reg_code`),
  ADD KEY `vis_matricule` (`vis_matricule`);

--
-- Indexes for table `visiteur`
--
ALTER TABLE `visiteur`
  ADD PRIMARY KEY (`vis_matricule`),
  ADD KEY `sec_code` (`sec_code`),
  ADD KEY `lab_code` (`lab_code`);

--
-- Indexes for table `visiteur_regions`
--
ALTER TABLE `visiteur_regions`
  ADD PRIMARY KEY (`vis_reg_id`),
  ADD KEY `vis_matricule` (`vis_matricule`),
  ADD KEY `reg_code_1` (`reg_code_1`),
  ADD KEY `reg_code_2` (`reg_code_2`),
  ADD KEY `reg_code_3` (`reg_code_3`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `travailler`
--
ALTER TABLE `travailler`
  MODIFY `tra_id` int(20) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `visiteur_regions`
--
ALTER TABLE `visiteur_regions`
  MODIFY `vis_reg_id` int(50) NOT NULL AUTO_INCREMENT;

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
  ADD CONSTRAINT `travailler_ibfk_1` FOREIGN KEY (`reg_code`) REFERENCES `region` (`reg_code`),
  ADD CONSTRAINT `travailler_ibfk_2` FOREIGN KEY (`vis_matricule`) REFERENCES `visiteur` (`vis_matricule`);

--
-- Constraints for table `visiteur`
--
ALTER TABLE `visiteur`
  ADD CONSTRAINT `visiteur_ibfk_1` FOREIGN KEY (`sec_code`) REFERENCES `secteur` (`sec_code`),
  ADD CONSTRAINT `visiteur_ibfk_2` FOREIGN KEY (`lab_code`) REFERENCES `labo` (`lab_code`);

--
-- Constraints for table `visiteur_regions`
--
ALTER TABLE `visiteur_regions`
  ADD CONSTRAINT `visiteur_regions_ibfk_1` FOREIGN KEY (`vis_matricule`) REFERENCES `visiteur` (`vis_matricule`),
  ADD CONSTRAINT `visiteur_regions_ibfk_2` FOREIGN KEY (`reg_code_1`) REFERENCES `region` (`reg_code`),
  ADD CONSTRAINT `visiteur_regions_ibfk_3` FOREIGN KEY (`reg_code_2`) REFERENCES `region` (`reg_code`),
  ADD CONSTRAINT `visiteur_regions_ibfk_4` FOREIGN KEY (`reg_code_3`) REFERENCES `region` (`reg_code`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
