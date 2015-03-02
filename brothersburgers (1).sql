-- phpMyAdmin SQL Dump
-- version 4.0.9
-- http://www.phpmyadmin.net
--
-- Máquina: localhost
-- Data de Criação: 31-Jan-2015 às 01:06
-- Versão do servidor: 5.5.34
-- versão do PHP: 5.3.27

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de Dados: `brothersburgers`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `cliente`
--

CREATE TABLE IF NOT EXISTS `cliente` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nome` text NOT NULL,
  `telefone` varchar(20) NOT NULL,
  `endereco` varchar(100) NOT NULL,
  `numero` varchar(15) NOT NULL,
  `complemento` varchar(40) DEFAULT NULL,
  `bairro` varchar(40) NOT NULL,
  `cep` int(11) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `obs` varchar(140) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=15 ;

--
-- Extraindo dados da tabela `cliente`
--

INSERT INTO `cliente` (`id`, `nome`, `telefone`, `endereco`, `numero`, `complemento`, `bairro`, `cep`, `email`, `obs`) VALUES
(1, 'Rafael Breus Ribeiro', '(42)-9805-6149', 'Rua Athanagildo Martins de Almeida ', '220', '', 'Contorno', 84052160, 'rafaelsktcod@gmail.com', 'próx ao motel aquarius'),
(2, 'Arnaldo Jabor', '(44)-9854-7744', 'Rua Jarará', '333', '', 'Iguaçú', 84011010, 'arnaldao@gmail.com', ''),
(3, 'Rogerio Ribeiro', '(42)-9980-8182', 'Rua Athanagildo Martins de Almeida ', '220', '', 'Contorno', 84052160, 'ribeirogerio@gmail.com', 'próximo ao society'),
(4, 'Tércio', '(44)-9745-6122', 'Rua Jabotão', '456', '', 'Vila das Cove', 84055489, 'tercinhovidaloka@gmail.com', 'próximo ao mercado municipal'),
(5, 'Valderes', '(42)-3028-0348', 'Rua XV de Novembro', '18', '', 'Centro', 84010020, 'valderesvendrami@hotmail.com', 'próx ao parque amb.'),
(6, 'Ivette Ribeiro', '(42)-3027-6834', 'Rua XV de Novembro', '18', 'ap 42', 'Centro', 84010020, '', '		'),
(7, 'Carmen Lucélia', '(42)-9919-9269', 'Rua Athanagildo M de Almeida ', '220', '', 'Contorno', 84052160, 'carmenbreus@gmail.com', '	'),
(8, 'Mário Vendrami', '(42)-9932-8015', 'Rua XV de Novembro ', '18', 'ap42', 'Centro', 84010020, 'mariovrendrami@gmail.com', ''),
(9, 'Arnaldinho de José', '(45)-8897-9259', 'Rua Barro Novo', '3910', 'ap 32', 'Suburbio', 87452126, 'lelekinhodejesus@bol.com', ''),
(10, 'Dalesio', '(85)-4949-4219', 'Rua Jaboratiruba', '3911', '', 'Santa Candida', 84053666, 'dalesinho2009@hotmail.com', 'cu'),
(11, 'Polliana Marcondes', '(42)-8827-7893', 'Rua Rio Grande do Sul', '2250', 'ap 14', 'Vila Liane', 84015020, 'pollipmarcondes@gmail.com', '	'),
(12, 'dasd', '(23)-1231-2312', 'ewqewqeq', '2312', 'rwr', 'rwerw', 342342, 'fdsfsd', ''),
(13, 'Maiquisso', '(45)-9988-7766', 'rua jabotapes', '928', 'ap 6262', 'Triangulo', 49876, 'rafafa', ''),
(14, 'Astolfinho cuti cuti', '(09)-3820-9320', 'dsaçdlskd~çakld', '~dsalçdkaãsdl', 'dkslçakdçla', 'dçlsakdl', 321321132, 'dsaad', '');

-- --------------------------------------------------------

--
-- Estrutura da tabela `itenspedido`
--

CREATE TABLE IF NOT EXISTS `itenspedido` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `idped` int(11) NOT NULL,
  `idprod` int(11) NOT NULL,
  `obs` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `idped` (`idped`),
  KEY `idprod` (`idprod`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=9 ;

--
-- Extraindo dados da tabela `itenspedido`
--

INSERT INTO `itenspedido` (`id`, `idped`, `idprod`, `obs`) VALUES
(5, 1, 5, NULL),
(8, 1, 4, 'SEM PICLES');

-- --------------------------------------------------------

--
-- Estrutura da tabela `pedido`
--

CREATE TABLE IF NOT EXISTS `pedido` (
  `idped` int(11) NOT NULL AUTO_INCREMENT,
  `idcliente` int(11) DEFAULT NULL,
  PRIMARY KEY (`idped`),
  KEY `idcliente` (`idcliente`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=7 ;

--
-- Extraindo dados da tabela `pedido`
--

INSERT INTO `pedido` (`idped`, `idcliente`) VALUES
(1, NULL),
(2, NULL),
(3, NULL),
(4, NULL),
(5, NULL),
(6, NULL);

-- --------------------------------------------------------

--
-- Estrutura da tabela `produto`
--

CREATE TABLE IF NOT EXISTS `produto` (
  `idprod` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(80) NOT NULL,
  `preco` double(10,2) NOT NULL,
  PRIMARY KEY (`idprod`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=34 ;

--
-- Extraindo dados da tabela `produto`
--

INSERT INTO `produto` (`idprod`, `nome`, `preco`) VALUES
(1, 'Cheese Brother', 6.22),
(3, 'pizza', 1.00),
(4, 'bacon brother', 1.00),
(5, 'Hamburger Gourmet', 1.00),
(6, 'Pizza muito grande', 1.00),
(7, 'lanche lazarento de grande', 1.00),
(8, 'Hamburgao', 1.00),
(9, 'pizzalok', 25.30),
(10, 'Torasjoasi', 99.00),
(11, 'cocozao', 25.68),
(12, 'bunda', 25.90),
(13, 'X virus', 15.90),
(14, 'dadssadsadsad', 10.22),
(15, 'merda enlatada', 10.22),
(16, 'bosta', 14.66),
(17, 'pacote de papelao', 0.00),
(18, 'bostale', 12.66),
(19, 'dsddsd', 21.00),
(20, 'sdsdss', 32.00),
(21, 'a', 21.00),
(22, 'aa', 32.00),
(23, 'ddasda', 32.00),
(24, 'dsd', 32.00),
(25, 'dffg', 2.00),
(26, 'dsdsds', 32.00),
(27, 'dasdsa', 32.00),
(28, 'bosta extreme', 11.90),
(29, 'Merdadsad', 22.50),
(30, 'cu anal', 20.00),
(31, 'Egg brother', 1228.33),
(32, 'Kids Bacon', 32.20),
(33, 'Pizza Calabresa', 19.90);

--
-- Constraints for dumped tables
--

--
-- Limitadores para a tabela `itenspedido`
--
ALTER TABLE `itenspedido`
  ADD CONSTRAINT `idped` FOREIGN KEY (`idped`) REFERENCES `pedido` (`idped`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `idprod` FOREIGN KEY (`idprod`) REFERENCES `produto` (`idprod`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Limitadores para a tabela `pedido`
--
ALTER TABLE `pedido`
  ADD CONSTRAINT `pedido_ibfk_1` FOREIGN KEY (`idcliente`) REFERENCES `cliente` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
