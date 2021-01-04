-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 04 Jan 2021 pada 11.33
-- Versi server: 10.1.37-MariaDB
-- Versi PHP: 7.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `buku`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `daftarbuku`
--

CREATE TABLE `daftarbuku` (
  `id_buku` varchar(11) NOT NULL,
  `judul_buku` varchar(50) DEFAULT NULL,
  `deskripsi` text,
  `jenis_buku` varchar(15) DEFAULT NULL,
  `nama_pengarang` varchar(50) DEFAULT NULL,
  `tahun_terbit` varchar(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `daftarbuku`
--

INSERT INTO `daftarbuku` (`id_buku`, `judul_buku`, `deskripsi`, `jenis_buku`, `nama_pengarang`, `tahun_terbit`) VALUES
('1', 'Dilan 1991', 'Alur cerita yang terdapat dalam novel ini adalah alur mundur. Buku ini dibuka dengan perkenalan nama dan wajah para tokoh. Baik utama maupun tokoh sampingan. Pada bab awal, Miela akan memperkenalkan segala sesuatu tentang dirinya, kisah cintanya dan keluarganya.', 'Novel', 'Pidi Baiq', '2014'),
('2', 'Gus Dur', 'Buku ini lebih menfokuskan hasil penelitian penulis pada era\n kepemimpinan Abdurrahman Wahid yang berlangsung tidak lebih dari 20 bulan, \ndari bulan November 1999 hingga Juli 2001. Persoalan hubungan sipil-militer \nselama masa reformasi menjadi fokus kajian yang penting, \napalagi pada masa Presiden Abdurrahman Wahid', 'Biografi', 'Greg Barton', '2002'),
('3', 'Naruto Shippuden', 'Naruto Shippuden adalah sebuah seri anime yang diadaptasi dari bagian II manga Naruto. Serial ini disutradarai oleh Hayato Date dan diproduksi oleh Studio Pierrot dan TV Tokyo. Pada bagian ini, pergerakan organisasi Akatsuki semakin terlihat. Naruto Shippuden juga telah dibuat versi movie-nya dengan judul Naruto Shippuden The Movie yang dirilis di Jepang pada Agustus 2007.', 'Komik', 'Masashi Kishimoto', '2007'),
('4', 'Habibie & Ainun', 'buku karya Bacharuddin Jusuf Habibie yang diterbitkan tahun 2010. Buku ini berisi tentang kehidupan Habibie dan istrinya, Ainun', 'Biografi', 'B. J Habibie', '2010');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `daftarbuku`
--
ALTER TABLE `daftarbuku`
  ADD PRIMARY KEY (`id_buku`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
