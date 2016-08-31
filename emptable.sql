-- phpMyAdmin SQL Dump
-- version 4.2.11
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Apr 24, 2015 at 04:47 PM
-- Server version: 5.6.21
-- PHP Version: 5.5.19

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `ssdb`
--

-- --------------------------------------------------------

--
-- Table structure for table `emptable`
--

CREATE TABLE IF NOT EXISTS `emptable` (
  `EmpName` varchar(30) NOT NULL,
  `EmpID` varchar(50) NOT NULL,
  `EmpAddress` varchar(30) NOT NULL,
  `EmpPhnNo` varchar(30) NOT NULL,
  `EmpNID` varchar(30) NOT NULL,
  `EmpBG` varchar(50) NOT NULL,
  `EmpDOB` varchar(50) NOT NULL,
  `EmpUserName` varchar(50) NOT NULL,
  `EmpPassword` varchar(50) NOT NULL  
  ) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `emptable`
--

INSERT INTO `emptable` (`EmpName`, `EmpID`, `EmpAddress`, `EmpPhnNo`, `EmpNID`, `EmpBG`, `EmpDOB`, `EmpUserName`, `EmpPassword`) VALUES
('Rezwan', 'E12', 'Banani,Dhaka', '01676210885', '121231231241414', 'O+ Ve', '19 June,1980', 'rezwan1', '123456');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `emptable`
--
ALTER TABLE `emptable`
 ADD PRIMARY KEY (`EmpID`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
