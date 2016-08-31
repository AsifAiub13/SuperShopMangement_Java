CREATE TABLE IF NOT EXISTS `product_list` (
  `P_NO` varchar(30) NOT NULL,
  `P_ID` varchar(30) NOT NULL,
  `P_CATEGORY` varchar(30) NOT NULL,
  `P_NAME` varchar(30) NOT NULL,
  `P_AVAILABILITY` varchar(30) NOT NULL,
  `P_PRICE` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `product_list`
--

INSERT INTO `product_list` (`P_NO`, `P_ID`, `P_CATEGORY`, `P_NAME`, `P_AVAILABILITY`, `P_PRICE`) VALUES
('1', '13', 'Grocery', 'Rice', '10', '60'),
('2', '24', 'Baby product', 'Milk', '20', '90'),
('3', '49', 'Toy', 'Barbie', '30', '150'),
('4', '50', 'Stationary', 'Paper', '100', '2.5'),
('5', '51', 'Food & Beverage', 'Sandwich', '20', '60'),
('6', '52', 'Grocery', 'Egg', '200', '32');
