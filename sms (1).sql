-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Generation Time: Nov 05, 2023 at 11:05 PM
-- Server version: 8.0.30
-- PHP Version: 8.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `sms`
--

-- --------------------------------------------------------

--
-- Table structure for table `jurusan`
--

CREATE TABLE `jurusan` (
  `kdjurusan` varchar(1) NOT NULL,
  `namajurusan` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `jurusan`
--

INSERT INTO `jurusan` (`kdjurusan`, `namajurusan`) VALUES
('A', 'Elektro'),
('B', 'Sipil'),
('C', 'Geologi'),
('D', 'Informatika');

-- --------------------------------------------------------

--
-- Table structure for table `mahasiswa`
--

CREATE TABLE `mahasiswa` (
  `nim` varchar(10) NOT NULL,
  `nama` varchar(30) NOT NULL,
  `lahir` varchar(10) NOT NULL,
  `jenis` varchar(4) NOT NULL,
  `alamat` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `kdjurusan` varchar(1) NOT NULL,
  `angkatan` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `mahasiswa`
--

INSERT INTO `mahasiswa` (`nim`, `nama`, `lahir`, `jenis`, `alamat`, `kdjurusan`, `angkatan`) VALUES
('H1A021042', 'Nazala Taruna Dewa Abirawa', '2003-04-25', 'L', 'Purbalingga', 'A', 21),
('H1A022002', 'Naila Putri Pradipta', '2004-12-03', 'P', 'Jakarta', 'A', 22),
('H1B021034', 'Ade Adrian', '2002-06-21', 'L', 'Bandung', 'B', 21),
('H1B022060', 'Maura Chaulia', '2004-10-30', 'P', 'Semarang', 'B', 22),
('H1D021075', 'Freya Nashifa', '2004-02-16', 'P', 'Yogyakarta', 'D', 21),
('H1D022006', 'Jehian Athaya', '2004-01-27', 'L', 'Purwokerto', 'D', 22);

-- --------------------------------------------------------

--
-- Table structure for table `otentikasi`
--

CREATE TABLE `otentikasi` (
  `id` int NOT NULL,
  `email` varchar(50) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `otentikasi`
--

INSERT INTO `otentikasi` (`id`, `email`, `username`, `password`) VALUES
(1, 'admin@gmail.com', 'admin', 'admin'),
(2, 'coba@gmail.com', 'coba', 'coba'),
(3, 'cobasenin@gmail.com', 'cobasenin', '123');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `jurusan`
--
ALTER TABLE `jurusan`
  ADD PRIMARY KEY (`kdjurusan`);

--
-- Indexes for table `mahasiswa`
--
ALTER TABLE `mahasiswa`
  ADD PRIMARY KEY (`nim`),
  ADD KEY `kdjurusan` (`kdjurusan`);

--
-- Indexes for table `otentikasi`
--
ALTER TABLE `otentikasi`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `otentikasi`
--
ALTER TABLE `otentikasi`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `mahasiswa`
--
ALTER TABLE `mahasiswa`
  ADD CONSTRAINT `mahasiswa_ibfk_1` FOREIGN KEY (`kdjurusan`) REFERENCES `jurusan` (`kdjurusan`) ON DELETE RESTRICT ON UPDATE RESTRICT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
