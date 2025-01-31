USE [master]
GO
/****** Object:  Database [QLCHDTAndroid]    Script Date: 1/23/2024 12:15:54 PM ******/
CREATE DATABASE [QLCHDTAndroid]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'QLCHDTAndroid', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL16.SQLEXPRESS\MSSQL\DATA\QLCHDTAndroid.mdf' , SIZE = 8192KB , MAXSIZE = UNLIMITED, FILEGROWTH = 65536KB )
 LOG ON 
( NAME = N'QLCHDTAndroid_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL16.SQLEXPRESS\MSSQL\DATA\QLCHDTAndroid_log.ldf' , SIZE = 8192KB , MAXSIZE = 2048GB , FILEGROWTH = 65536KB )
 WITH CATALOG_COLLATION = DATABASE_DEFAULT, LEDGER = OFF
GO
ALTER DATABASE [QLCHDTAndroid] SET COMPATIBILITY_LEVEL = 160
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [QLCHDTAndroid].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [QLCHDTAndroid] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [QLCHDTAndroid] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [QLCHDTAndroid] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [QLCHDTAndroid] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [QLCHDTAndroid] SET ARITHABORT OFF 
GO
ALTER DATABASE [QLCHDTAndroid] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [QLCHDTAndroid] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [QLCHDTAndroid] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [QLCHDTAndroid] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [QLCHDTAndroid] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [QLCHDTAndroid] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [QLCHDTAndroid] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [QLCHDTAndroid] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [QLCHDTAndroid] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [QLCHDTAndroid] SET  DISABLE_BROKER 
GO
ALTER DATABASE [QLCHDTAndroid] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [QLCHDTAndroid] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [QLCHDTAndroid] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [QLCHDTAndroid] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [QLCHDTAndroid] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [QLCHDTAndroid] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [QLCHDTAndroid] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [QLCHDTAndroid] SET RECOVERY SIMPLE 
GO
ALTER DATABASE [QLCHDTAndroid] SET  MULTI_USER 
GO
ALTER DATABASE [QLCHDTAndroid] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [QLCHDTAndroid] SET DB_CHAINING OFF 
GO
ALTER DATABASE [QLCHDTAndroid] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [QLCHDTAndroid] SET TARGET_RECOVERY_TIME = 60 SECONDS 
GO
ALTER DATABASE [QLCHDTAndroid] SET DELAYED_DURABILITY = DISABLED 
GO
ALTER DATABASE [QLCHDTAndroid] SET ACCELERATED_DATABASE_RECOVERY = OFF  
GO
ALTER DATABASE [QLCHDTAndroid] SET QUERY_STORE = ON
GO
ALTER DATABASE [QLCHDTAndroid] SET QUERY_STORE (OPERATION_MODE = READ_WRITE, CLEANUP_POLICY = (STALE_QUERY_THRESHOLD_DAYS = 30), DATA_FLUSH_INTERVAL_SECONDS = 900, INTERVAL_LENGTH_MINUTES = 60, MAX_STORAGE_SIZE_MB = 1000, QUERY_CAPTURE_MODE = AUTO, SIZE_BASED_CLEANUP_MODE = AUTO, MAX_PLANS_PER_QUERY = 200, WAIT_STATS_CAPTURE_MODE = ON)
GO
USE [QLCHDTAndroid]
GO
/****** Object:  Table [dbo].[DienThoai]    Script Date: 1/23/2024 12:15:54 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[DienThoai](
	[DienThoai_ID] [nvarchar](255) NOT NULL,
	[Hang_ID] [nvarchar](255) NULL,
	[TenDienThoai] [nvarchar](255) NOT NULL,
	[GiaBan] [decimal](18, 2) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[DienThoai_ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[DonHang]    Script Date: 1/23/2024 12:15:54 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[DonHang](
	[DonHang_ID] [nvarchar](255) NOT NULL,
	[DienThoai_ID] [nvarchar](255) NULL,
	[Hang_ID] [nvarchar](255) NULL,
	[User_ID] [nvarchar](255) NULL,
	[TenDienThoai] [nvarchar](255) NOT NULL,
	[Ngay] [date] NOT NULL,
	[so_luong] [int] NULL,
	[tong_tien] [decimal](10, 2) NULL,
PRIMARY KEY CLUSTERED 
(
	[DonHang_ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[HangDienThoai]    Script Date: 1/23/2024 12:15:54 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[HangDienThoai](
	[Hang_ID] [nvarchar](255) NOT NULL,
	[TenHang] [nvarchar](255) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[Hang_ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[USERR]    Script Date: 1/23/2024 12:15:54 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[USERR](
	[User_ID] [nvarchar](255) NOT NULL,
	[Ten] [nvarchar](255) NOT NULL,
	[ChucVu] [nvarchar](255) NOT NULL,
	[CaLamViec] [nvarchar](255) NOT NULL,
	[TaiKhoan] [nvarchar](255) NOT NULL,
	[MatKhau] [nvarchar](255) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[User_ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
INSERT [dbo].[DienThoai] ([DienThoai_ID], [Hang_ID], [TenDienThoai], [GiaBan]) VALUES (N'OP1', N'2', N'OPPO1', CAST(2500000.00 AS Decimal(18, 2)))
INSERT [dbo].[DienThoai] ([DienThoai_ID], [Hang_ID], [TenDienThoai], [GiaBan]) VALUES (N'OP2', N'2', N'OPPO2', CAST(2999999.00 AS Decimal(18, 2)))
INSERT [dbo].[DienThoai] ([DienThoai_ID], [Hang_ID], [TenDienThoai], [GiaBan]) VALUES (N'OP3', N'2', N'OPPO3', CAST(35000000.00 AS Decimal(18, 2)))
INSERT [dbo].[DienThoai] ([DienThoai_ID], [Hang_ID], [TenDienThoai], [GiaBan]) VALUES (N'OP4', N'2', N'OPPO4', CAST(35000000.00 AS Decimal(18, 2)))
INSERT [dbo].[DienThoai] ([DienThoai_ID], [Hang_ID], [TenDienThoai], [GiaBan]) VALUES (N'OP5', N'2', N'OPPO5', CAST(36000000.00 AS Decimal(18, 2)))
INSERT [dbo].[DienThoai] ([DienThoai_ID], [Hang_ID], [TenDienThoai], [GiaBan]) VALUES (N'SN1', N'3', N'SONY 1 ', CAST(4500000.00 AS Decimal(18, 2)))
INSERT [dbo].[DienThoai] ([DienThoai_ID], [Hang_ID], [TenDienThoai], [GiaBan]) VALUES (N'SN2', N'3', N'SONY 2', CAST(4900000.00 AS Decimal(18, 2)))
INSERT [dbo].[DienThoai] ([DienThoai_ID], [Hang_ID], [TenDienThoai], [GiaBan]) VALUES (N'SN3', N'3', N'SONY 3', CAST(4100000.00 AS Decimal(18, 2)))
INSERT [dbo].[DienThoai] ([DienThoai_ID], [Hang_ID], [TenDienThoai], [GiaBan]) VALUES (N'SN4', N'3', N'SONY 4', CAST(2100000.00 AS Decimal(18, 2)))
INSERT [dbo].[DienThoai] ([DienThoai_ID], [Hang_ID], [TenDienThoai], [GiaBan]) VALUES (N'SN5', N'3', N'SONY 5', CAST(3400000.00 AS Decimal(18, 2)))
INSERT [dbo].[DienThoai] ([DienThoai_ID], [Hang_ID], [TenDienThoai], [GiaBan]) VALUES (N'SS1', N'1', N'SAMSUNG 1', CAST(9300000.00 AS Decimal(18, 2)))
INSERT [dbo].[DienThoai] ([DienThoai_ID], [Hang_ID], [TenDienThoai], [GiaBan]) VALUES (N'SS2', N'1', N'SAMSUNG 2 ', CAST(9550000.00 AS Decimal(18, 2)))
INSERT [dbo].[DienThoai] ([DienThoai_ID], [Hang_ID], [TenDienThoai], [GiaBan]) VALUES (N'SS3', N'1', N'SAMSUNG 3 ', CAST(11000000.00 AS Decimal(18, 2)))
INSERT [dbo].[DienThoai] ([DienThoai_ID], [Hang_ID], [TenDienThoai], [GiaBan]) VALUES (N'SS4', N'1', N'SAMSUNG 4', CAST(13000000.00 AS Decimal(18, 2)))
INSERT [dbo].[DienThoai] ([DienThoai_ID], [Hang_ID], [TenDienThoai], [GiaBan]) VALUES (N'SS5', N'1', N'SAMSUNG 5', CAST(18000000.00 AS Decimal(18, 2)))
INSERT [dbo].[DienThoai] ([DienThoai_ID], [Hang_ID], [TenDienThoai], [GiaBan]) VALUES (N'VV1', N'5', N'VIVO V1', CAST(15000000.00 AS Decimal(18, 2)))
INSERT [dbo].[DienThoai] ([DienThoai_ID], [Hang_ID], [TenDienThoai], [GiaBan]) VALUES (N'VV2', N'5', N'VIVO V2', CAST(16000000.00 AS Decimal(18, 2)))
INSERT [dbo].[DienThoai] ([DienThoai_ID], [Hang_ID], [TenDienThoai], [GiaBan]) VALUES (N'VV3', N'5', N'VIVO V3', CAST(19000000.00 AS Decimal(18, 2)))
INSERT [dbo].[DienThoai] ([DienThoai_ID], [Hang_ID], [TenDienThoai], [GiaBan]) VALUES (N'VV4', N'5', N'VIVO V4', CAST(21000000.00 AS Decimal(18, 2)))
INSERT [dbo].[DienThoai] ([DienThoai_ID], [Hang_ID], [TenDienThoai], [GiaBan]) VALUES (N'VV5', N'5', N'VIVO V5', CAST(29000000.00 AS Decimal(18, 2)))
INSERT [dbo].[DienThoai] ([DienThoai_ID], [Hang_ID], [TenDienThoai], [GiaBan]) VALUES (N'XAM1', N'4', N'XIAOMI 1', CAST(41000000.00 AS Decimal(18, 2)))
INSERT [dbo].[DienThoai] ([DienThoai_ID], [Hang_ID], [TenDienThoai], [GiaBan]) VALUES (N'XAM2', N'4', N'XIAOMI 2', CAST(42000000.00 AS Decimal(18, 2)))
INSERT [dbo].[DienThoai] ([DienThoai_ID], [Hang_ID], [TenDienThoai], [GiaBan]) VALUES (N'XAM3', N'4', N'XIAOMI 3', CAST(43000000.00 AS Decimal(18, 2)))
INSERT [dbo].[DienThoai] ([DienThoai_ID], [Hang_ID], [TenDienThoai], [GiaBan]) VALUES (N'XAM4', N'4', N'XIAOMI 4', CAST(47000000.00 AS Decimal(18, 2)))
INSERT [dbo].[DienThoai] ([DienThoai_ID], [Hang_ID], [TenDienThoai], [GiaBan]) VALUES (N'XAM5', N'4', N'XIAOMI 5', CAST(45000000.00 AS Decimal(18, 2)))
GO
INSERT [dbo].[DonHang] ([DonHang_ID], [DienThoai_ID], [Hang_ID], [User_ID], [TenDienThoai], [Ngay], [so_luong], [tong_tien]) VALUES (N'OP1X1', N'OP1', N'2', N'NV2', N'OPPO1', CAST(N'2024-02-12' AS Date), 1, CAST(2500000.00 AS Decimal(10, 2)))
INSERT [dbo].[DonHang] ([DonHang_ID], [DienThoai_ID], [Hang_ID], [User_ID], [TenDienThoai], [Ngay], [so_luong], [tong_tien]) VALUES (N'OP1X7', N'OP1', N'2', N'NV2', N'OPPO1', CAST(N'2024-02-12' AS Date), 7, CAST(17500000.00 AS Decimal(10, 2)))
INSERT [dbo].[DonHang] ([DonHang_ID], [DienThoai_ID], [Hang_ID], [User_ID], [TenDienThoai], [Ngay], [so_luong], [tong_tien]) VALUES (N'OPX2', N'OP1', N'2', N'NV2', N'OPPO1', CAST(N'2024-01-22' AS Date), 2, CAST(5000000.00 AS Decimal(10, 2)))
INSERT [dbo].[DonHang] ([DonHang_ID], [DienThoai_ID], [Hang_ID], [User_ID], [TenDienThoai], [Ngay], [so_luong], [tong_tien]) VALUES (N'SN1X6', N'SN1', N'3', N'NV2', N'SONY 1 ', CAST(N'2024-01-22' AS Date), 6, CAST(27000000.00 AS Decimal(10, 2)))
INSERT [dbo].[DonHang] ([DonHang_ID], [DienThoai_ID], [Hang_ID], [User_ID], [TenDienThoai], [Ngay], [so_luong], [tong_tien]) VALUES (N'SN4X2', N'SN4', N'3', N'NV2', N'SONY 4', CAST(N'2024-01-22' AS Date), 2, CAST(4200000.00 AS Decimal(10, 2)))
INSERT [dbo].[DonHang] ([DonHang_ID], [DienThoai_ID], [Hang_ID], [User_ID], [TenDienThoai], [Ngay], [so_luong], [tong_tien]) VALUES (N'SN5X1', N'SN5', N'3', N'NV2', N'SONY 5', CAST(N'2024-01-22' AS Date), 1, CAST(3400000.00 AS Decimal(10, 2)))
INSERT [dbo].[DonHang] ([DonHang_ID], [DienThoai_ID], [Hang_ID], [User_ID], [TenDienThoai], [Ngay], [so_luong], [tong_tien]) VALUES (N'SS1X3', N'SS1', N'1', N'NV4', N'SAMSUNG 1', CAST(N'2024-03-22' AS Date), 3, CAST(27900000.00 AS Decimal(10, 2)))
INSERT [dbo].[DonHang] ([DonHang_ID], [DienThoai_ID], [Hang_ID], [User_ID], [TenDienThoai], [Ngay], [so_luong], [tong_tien]) VALUES (N'SS1X4', N'SS1', N'1', N'NV2', N'SAMSUNG 1', CAST(N'2024-01-22' AS Date), 4, CAST(37200000.00 AS Decimal(10, 2)))
INSERT [dbo].[DonHang] ([DonHang_ID], [DienThoai_ID], [Hang_ID], [User_ID], [TenDienThoai], [Ngay], [so_luong], [tong_tien]) VALUES (N'SS2X2', N'SS2', N'1', N'NV4', N'SAMSUNG 2 ', CAST(N'2024-03-25' AS Date), 2, CAST(19100000.00 AS Decimal(10, 2)))
INSERT [dbo].[DonHang] ([DonHang_ID], [DienThoai_ID], [Hang_ID], [User_ID], [TenDienThoai], [Ngay], [so_luong], [tong_tien]) VALUES (N'SS2X3', N'SS2', N'1', N'NV2', N'SAMSUNG 2 ', CAST(N'2024-01-22' AS Date), 3, CAST(28650000.00 AS Decimal(10, 2)))
INSERT [dbo].[DonHang] ([DonHang_ID], [DienThoai_ID], [Hang_ID], [User_ID], [TenDienThoai], [Ngay], [so_luong], [tong_tien]) VALUES (N'SS3X1', N'SS3', N'1', N'NV4', N'SAMSUNG 3 ', CAST(N'2024-03-27' AS Date), 1, CAST(11000000.00 AS Decimal(10, 2)))
INSERT [dbo].[DonHang] ([DonHang_ID], [DienThoai_ID], [Hang_ID], [User_ID], [TenDienThoai], [Ngay], [so_luong], [tong_tien]) VALUES (N'SS4X3', N'SS4', N'1', N'NV2', N'SAMSUNG 4', CAST(N'2024-01-22' AS Date), 3, CAST(39000000.00 AS Decimal(10, 2)))
INSERT [dbo].[DonHang] ([DonHang_ID], [DienThoai_ID], [Hang_ID], [User_ID], [TenDienThoai], [Ngay], [so_luong], [tong_tien]) VALUES (N'SS5X2', N'SS5', N'1', N'NV2', N'SAMSUNG 5', CAST(N'2024-01-22' AS Date), 2, CAST(36000000.00 AS Decimal(10, 2)))
INSERT [dbo].[DonHang] ([DonHang_ID], [DienThoai_ID], [Hang_ID], [User_ID], [TenDienThoai], [Ngay], [so_luong], [tong_tien]) VALUES (N'SS5X3', N'SS5', N'1', N'NV2', N'SAMSUNG 5', CAST(N'2024-01-22' AS Date), 3, CAST(54000000.00 AS Decimal(10, 2)))
INSERT [dbo].[DonHang] ([DonHang_ID], [DienThoai_ID], [Hang_ID], [User_ID], [TenDienThoai], [Ngay], [so_luong], [tong_tien]) VALUES (N'VV1X5', N'VV1', N'5', N'NV7', N'VIVO V1', CAST(N'2024-02-25' AS Date), 5, CAST(75000000.00 AS Decimal(10, 2)))
INSERT [dbo].[DonHang] ([DonHang_ID], [DienThoai_ID], [Hang_ID], [User_ID], [TenDienThoai], [Ngay], [so_luong], [tong_tien]) VALUES (N'VV2X1', N'VV2', N'5', N'NV2', N'VIVO V2', CAST(N'2024-02-12' AS Date), 1, CAST(16000000.00 AS Decimal(10, 2)))
INSERT [dbo].[DonHang] ([DonHang_ID], [DienThoai_ID], [Hang_ID], [User_ID], [TenDienThoai], [Ngay], [so_luong], [tong_tien]) VALUES (N'VV2X4', N'VV2', N'5', N'NV7', N'VIVO V2', CAST(N'2024-02-25' AS Date), 4, CAST(64000000.00 AS Decimal(10, 2)))
INSERT [dbo].[DonHang] ([DonHang_ID], [DienThoai_ID], [Hang_ID], [User_ID], [TenDienThoai], [Ngay], [so_luong], [tong_tien]) VALUES (N'VV3X3', N'VV3', N'5', N'NV8', N'VIVO V3', CAST(N'2024-01-22' AS Date), 3, CAST(57000000.00 AS Decimal(10, 2)))
INSERT [dbo].[DonHang] ([DonHang_ID], [DienThoai_ID], [Hang_ID], [User_ID], [TenDienThoai], [Ngay], [so_luong], [tong_tien]) VALUES (N'VV4X2', N'VV4', N'5', N'NV8', N'VIVO V4', CAST(N'2024-01-22' AS Date), 2, CAST(42000000.00 AS Decimal(10, 2)))
INSERT [dbo].[DonHang] ([DonHang_ID], [DienThoai_ID], [Hang_ID], [User_ID], [TenDienThoai], [Ngay], [so_luong], [tong_tien]) VALUES (N'VV5X1', N'VV5', N'5', N'NV8', N'VIVO V5', CAST(N'2024-01-22' AS Date), 1, CAST(29000000.00 AS Decimal(10, 2)))
INSERT [dbo].[DonHang] ([DonHang_ID], [DienThoai_ID], [Hang_ID], [User_ID], [TenDienThoai], [Ngay], [so_luong], [tong_tien]) VALUES (N'VVX1X2', N'VV1', N'5', N'NV2', N'VIVO V1', CAST(N'2024-01-23' AS Date), 2, CAST(30000000.00 AS Decimal(10, 2)))
INSERT [dbo].[DonHang] ([DonHang_ID], [DienThoai_ID], [Hang_ID], [User_ID], [TenDienThoai], [Ngay], [so_luong], [tong_tien]) VALUES (N'XAM1X2', N'XAM1', N'4', N'NV2', N'XIAOMI 1', CAST(N'2024-04-15' AS Date), 2, CAST(82000000.00 AS Decimal(10, 2)))
INSERT [dbo].[DonHang] ([DonHang_ID], [DienThoai_ID], [Hang_ID], [User_ID], [TenDienThoai], [Ngay], [so_luong], [tong_tien]) VALUES (N'XAMX2', N'XAM5', N'4', N'NV7', N'XIAOMI 5', CAST(N'2024-02-25' AS Date), 2, CAST(90000000.00 AS Decimal(10, 2)))
GO
INSERT [dbo].[HangDienThoai] ([Hang_ID], [TenHang]) VALUES (N'1', N'SAMSUNG')
INSERT [dbo].[HangDienThoai] ([Hang_ID], [TenHang]) VALUES (N'2', N'OPPO')
INSERT [dbo].[HangDienThoai] ([Hang_ID], [TenHang]) VALUES (N'3', N'SONY')
INSERT [dbo].[HangDienThoai] ([Hang_ID], [TenHang]) VALUES (N'4', N'XIAOMI')
INSERT [dbo].[HangDienThoai] ([Hang_ID], [TenHang]) VALUES (N'5', N'VIVO')
GO
INSERT [dbo].[USERR] ([User_ID], [Ten], [ChucVu], [CaLamViec], [TaiKhoan], [MatKhau]) VALUES (N'AD', N'Vi Hữu Thành', N'Admin', N'null', N'VIHUUTHANH', N'vihuuthanh')
INSERT [dbo].[USERR] ([User_ID], [Ten], [ChucVu], [CaLamViec], [TaiKhoan], [MatKhau]) VALUES (N'NV1', N'Trần Hoàng Nhật', N'Nhân viên', N'Sáng', N'TRANHOANGNHAT', N'tranhoangnhat')
INSERT [dbo].[USERR] ([User_ID], [Ten], [ChucVu], [CaLamViec], [TaiKhoan], [MatKhau]) VALUES (N'NV10', N'Trịnh Trần Phương Tuấn', N'Nhân viên', N'Chiều', N'TRINHTRANPHUONGTUAN', N'trinhtranphuongtuan')
INSERT [dbo].[USERR] ([User_ID], [Ten], [ChucVu], [CaLamViec], [TaiKhoan], [MatKhau]) VALUES (N'NV2', N'Nguyễn Hữu Nhân', N'Nhân viên', N'Sáng', N'NGUYENHUUNHAN', N'nguyenhuunhan')
INSERT [dbo].[USERR] ([User_ID], [Ten], [ChucVu], [CaLamViec], [TaiKhoan], [MatKhau]) VALUES (N'NV3', N'Huỳnh Quốc Khánh', N'Nhân viên', N'Sáng', N'HUYNHQUOCKHANH', N'huynhquockhanh')
INSERT [dbo].[USERR] ([User_ID], [Ten], [ChucVu], [CaLamViec], [TaiKhoan], [MatKhau]) VALUES (N'NV4', N'Ngô Anh Khôi', N'Nhân viên', N'Sáng', N'NGOANHKHOI', N'ngoanhkhoi')
INSERT [dbo].[USERR] ([User_ID], [Ten], [ChucVu], [CaLamViec], [TaiKhoan], [MatKhau]) VALUES (N'NV5', N'Trịnh Duy Hiếu', N'Nhân viên', N'Sáng', N'TRINHDUYHIEU', N'trinhduyhieu')
INSERT [dbo].[USERR] ([User_ID], [Ten], [ChucVu], [CaLamViec], [TaiKhoan], [MatKhau]) VALUES (N'NV7', N'Đặng Thanh Vũ', N'Nhân viên', N'Chiều', N'DANGTHANHVU', N'dangthanhvu')
INSERT [dbo].[USERR] ([User_ID], [Ten], [ChucVu], [CaLamViec], [TaiKhoan], [MatKhau]) VALUES (N'NV8', N'Trần Bảo Linh', N'Nhân viên', N'Chiều', N'TRANBAOLINH', N'tranbaolinh')
INSERT [dbo].[USERR] ([User_ID], [Ten], [ChucVu], [CaLamViec], [TaiKhoan], [MatKhau]) VALUES (N'NV9', N'Trần Đần Linh', N'Nhân viên', N'Chiều', N'TRANDANLINH', N'trandanlinh')
GO
ALTER TABLE [dbo].[DonHang] ADD  DEFAULT ((0)) FOR [so_luong]
GO
ALTER TABLE [dbo].[DonHang] ADD  DEFAULT ((0.00)) FOR [tong_tien]
GO
ALTER TABLE [dbo].[DienThoai]  WITH CHECK ADD FOREIGN KEY([Hang_ID])
REFERENCES [dbo].[HangDienThoai] ([Hang_ID])
GO
ALTER TABLE [dbo].[DonHang]  WITH CHECK ADD FOREIGN KEY([DienThoai_ID])
REFERENCES [dbo].[DienThoai] ([DienThoai_ID])
GO
ALTER TABLE [dbo].[DonHang]  WITH CHECK ADD FOREIGN KEY([Hang_ID])
REFERENCES [dbo].[HangDienThoai] ([Hang_ID])
GO
ALTER TABLE [dbo].[DonHang]  WITH CHECK ADD FOREIGN KEY([User_ID])
REFERENCES [dbo].[USERR] ([User_ID])
GO
USE [master]
GO
ALTER DATABASE [QLCHDTAndroid] SET  READ_WRITE 
GO
