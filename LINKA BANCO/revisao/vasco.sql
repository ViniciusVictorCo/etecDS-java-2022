-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 03-Nov-2022 às 13:14
-- Versão do servidor: 10.4.20-MariaDB
-- versão do PHP: 8.0.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `vasco`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_jogador`
--

CREATE TABLE `tb_jogador` (
  `NomeJogador` varchar(60) NOT NULL,
  `CodJogador` int(11) NOT NULL,
  `PosicaoJogador` varchar(20) NOT NULL,
  `ApelidoJogador` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `tb_jogador`
--

INSERT INTO `tb_jogador` (`NomeJogador`, `CodJogador`, `PosicaoJogador`, `ApelidoJogador`) VALUES
('Kevin', 1, 'Centro', 'Mc Kevin'),
('Elizabeth', 2, 'Zagueira', 'Raina Elizabeth ll'),
('Marcos A.', 3, 'Goleiro', 'Ratinho Chique');

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `tb_jogador`
--
ALTER TABLE `tb_jogador`
  ADD PRIMARY KEY (`CodJogador`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `tb_jogador`
--
ALTER TABLE `tb_jogador`
  MODIFY `CodJogador` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
