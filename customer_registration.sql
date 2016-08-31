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
-- Table structure for table `customer_registration`
--

CREATE TABLE IF NOT EXISTS `customer_registration` (
  `NAME` varchar(30) NOT NULL,
  `ADDRESS` varchar(50) NOT NULL,
  `OCCUPATION` varchar(30) NOT NULL,
  `CUSTOMER_ID` varchar(30) NOT NULL,
  `USER_NAME` varchar(30) NOT NULL,
  `PASSWORD` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `customer_registration`
--

INSERT INTO `customer_registration` (`NAME`, `ADDRESS`, `OCCUPATION`, `CUSTOMER_ID`, `USER_NAME`, `PASSWORD`) VALUES
(' nisa', 'tezgao ', ' student', ' 13245132', ' nishatsabila', '234567'),
('Nisa', ' Kaowranbazer', ' student', '13244912 ', ' nishat.sabila', '123456'),
('papiya', '', ' student', '132449123', 'sabila.nishat', '654321'),
('papiya', '', ' student', '132449124', 'sabila.nishat', '654321');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `customer_registration`
--
ALTER TABLE `customer_registration`
 ADD PRIMARY KEY (`CUSTOMER_ID`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
