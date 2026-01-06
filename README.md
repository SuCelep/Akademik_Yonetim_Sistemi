# 🎓 Üniversite Akademik Yönetim Sistemi (Hibernate & Java)

![Java](https://img.shields.io/badge/Java-ED8B00?style=flat&logo=openjdk&logoColor=white)
![Hibernate](https://img.shields.io/badge/Hibernate-59666C?style=flat&logo=hibernate&logoColor=white)
![SQL](https://img.shields.io/badge/SQL-CC2927?style=flat&logo=microsoft-sql-server&logoColor=white)

Bu proje, üniversite akademik süreçlerini (öğrenci, ders, akademisyen takibi) yönetmek amacıyla geliştirilmiş masaüstü tabanlı bir otomasyon sistemidir. Veri kalıcılığı için **Hibernate ORM** teknolojisi kullanılmış, nesne-ilişkisel eşleme (Object-Relational Mapping) yapısı kurulmuştur.

## 🏗️ Mimari ve Teknolojiler

* **Dil:** Java
* **IDE:** NetBeans
* **ORM:** Hibernate Framework
* **Veritabanı:** SQL 
* **Arayüz:** Java Swing
* **Yapı:** DAO (Data Access Object) Tasarım Deseni kullanılmıştır.

## 🌟 Öne Çıkan Özellikler

* **ORM Yapısı:** SQL sorguları yazmak yerine Hibernate Entity'leri üzerinden veritabanı işlemleri (CRUD) gerçekleştirildi.
* **İlişkisel Veri:** Tablolar arası ilişkiler (One-to-Many, Many-to-Many) Hibernate anotasyonları ile yönetildi.
* **Akademik İşlemler:**
    * Öğrenci ve Akademisyen Kaydı
    * Ders Atama ve Not Girişi
    * Dinamik Sorgulama

## ⚙️ Kurulum ve Çalıştırma

Projeyi kendi bilgisayarınızda çalıştırmak için veritabanı bağlantı ayarlarını yapmanız gerekmektedir.

1.  **Projeyi İndirin:** Repoyu klonlayın veya indirin.
2.  **Veritabanını Oluşturun:** Kullandığınız SQL sunucusunda boş bir veritabanı oluşturun (Örn: `OkulDb`).
3.  **Hibernate Ayarı:** `src` klasörü altındaki `hibernate.cfg.xml` (veya `persistence.xml`) dosyasını açın ve kendi bilgilerinizi girin:

Developed by https://github.com/SuCelep
