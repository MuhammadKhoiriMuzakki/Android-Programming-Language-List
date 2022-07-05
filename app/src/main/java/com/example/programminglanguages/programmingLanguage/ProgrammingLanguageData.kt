package com.example.programminglanguages.programmingLanguage

object ProgramingLanguageData {
    private var data = arrayOf(
        arrayOf(
            "Kotlin",
            "2011 (22 July)",
            "data:image/jpeg;base64,/9j/4AAQSkZJRgABAQAAAQABAAD/2wCEAAkGBw4PDg4ODRAQDQ0PEg0PDQ0PDQ8PDQ0NFREWFhURExMYHSggGBolGxMVITMiKCkrLi8uFx8zODMuPSguOisBCgoKDg0OGhAQGTUmHyIvLzgtNy4tKysrKy0tLTctNTc1NS0tLS0tNS0tLS0tLy0rLS0tLS0tLS0tLS03LS0tLf/AABEIAOEA4QMBEQACEQEDEQH/xAAbAAEBAAIDAQAAAAAAAAAAAAAAAQIGBAUHA//" +
                    "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",
            "Kotlin adalah sebuah bahasa pemrograman dengan pengetikan statis yang berjalan pada Mesin Virtual Java ataupun menggunakan kompiler LLVM yang dapat pula dikompilasikan kedalam bentuk kode sumber JavaScript. Pengembang utamanya berasal dari tim programer dari JetBrains yang bermarkas di Rusia.\n " +
                    "\n" + "Meskipun sintaksisnya tidak kompatibel dengan bahasa Java, Kotlin didesain untuk dapat bekerja sama dengan kode bahasa Java dan bergantung kepada kode bahasa Java dari Kelas Pustaka Java yang ada, seperti berbagai framework Java yang ada. Tim Pengembang memutuskan menamakannya Kotlin dengan mengambil nama dari sebuah pulau di Rusia, sebagaimana Java yang mengambil nama dari pulau Jawa di Indonesia.\n" +
                    "\n" + "Setelah Google mengumumkan bahwa Kotlin menjadi bahasa kelas satu bagi Android, maka bersama Java dan C++, Kotlin menjadi bahasa resmi untuk pengembangan aplikasi-aplikasi Android.",
            "JetBrain\n"+
                    "Multi-paradigm: object-oriented, functional, imperative, block structured, declarative, generic, reflective, concurrent\n" +
                    "JetBrains dan kontributor sistem terbuka\n\n" +
                    "1.4.31 / February 26, 2021\n"+
                    "https://kotlinlang.org/\n" +
                    ".kt, .kts, .ktm\n"
        ),
        arrayOf(
            "Java",
            "1990",
            "data:image/png;base64,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",
            "Java adalah bahasa pemrograman yang dapat dijalankan di berbagai komputer termasuk telepon genggam. Bahasa ini awalnya dibuat oleh James Gosling saat masih bergabung di Sun Microsystems, yang saat ini merupakan bagian dari Oracle dan dirilis tahun 1995. Bahasa ini banyak mengadopsi sintaksis yang terdapat pada C dan C++ namun dengan sintaksis model objek yang lebih sederhana serta dukungan rutin-rutin aras bawah yang minimal. Aplikasi-aplikasi berbasis java umumnya dikompilasi ke dalam p-code (bytecode) dan dapat dijalankan pada berbagai Mesin Virtual Java (JVM).\n " +
                    "\n" + "Java merupakan bahasa pemrograman yang bersifat umum/non-spesifik (general purpose), dan secara khusus didesain untuk memanfaatkan dependensi implementasi seminimal mungkin. Karena fungsionalitasnya yang memungkinkan aplikasi java mampu berjalan di beberapa platform sistem operasi yang berbeda, java dikenal pula dengan slogannya, \"Tulis sekali, jalankan di mana pun\".\n" +
                    "\n" + "Saat ini java merupakan bahasa pemrograman yang paling populer digunakan, dan secara luas dimanfaatkan dalam pengembangan berbagai jenis perangkat lunak aplikasi ataupun aplikasi.",
            "James Gosling\n" +
                    "Multi-paradigm: generic, object-oriented (class-based), imperative, reflective\n\n" +
                    "Oracle Corporation\n\n" +
                    "Java SE 15 / September 15, 2020\n"+
                    "https://www.oracle.com/java/\n" +
                    ".java, .jar, .class\n"
        ),
        arrayOf(
            "Python",
            "1991",
            "https://camo.githubusercontent.com/888e388801f947dec7c3d843942c277af25fe2b1aed1821542c4e711f210312a/68747470733a2f2f75706c6f61642e77696b696d656469612e6f72672f77696b6970656469612f636f6d6d6f6e732f7468756d622f632f63332f507974686f6e2d6c6f676f2d6e6f746578742e7376672f37363870782d507974686f6e2d6c6f676f2d6e6f746578742e7376672e706e67",
            "Python adalah bahasa pemrograman tujuan umum yang ditafsirkan, tingkat tinggi. Dibuat oleh Guido van Rossum dan pertama kali dirilis pada tahun 1991, filosofi desain Python menekankan keterbacaan kode dengan penggunaan spasi putih yang signifikan. Konstruksi bahasanya dan pendekatan berorientasi objek bertujuan untuk membantu pemrogram menulis kode yang jelas dan logis untuk proyek skala kecil dan besar.\n " +
                    "\n" + "Python diketik secara dinamis dan pengumpulan sampah. Ini mendukung beberapa paradigma pemrograman, termasuk pemrograman terstruktur (terutama, prosedural), berorientasi objek, dan fungsional. Python sering dideskripsikan sebagai bahasa \"termasuk baterai\" karena perpustakaan standarnya yang komprehensif.\n" +
                    "\n" + "Python dibuat pada akhir 1980-an sebagai penerus bahasa ABC. Python 2.0, dirilis pada tahun 2000, memperkenalkan fitur-fitur seperti pemahaman daftar dan sistem pengumpulan sampah dengan penghitungan referensi.\n" +
                    "\n" +
                    "Python 3.0, dirilis pada tahun 2008, adalah revisi utama dari bahasa yang tidak sepenuhnya kompatibel dengan versi sebelumnya, dan banyak kode Python 2 yang tidak berjalan tanpa modifikasi pada Python 3.\n" +
                    "\n" +
                    "Penerjemah Python tersedia untuk banyak sistem operasi. Komunitas pemrogram global mengembangkan dan memelihara CPython, implementasi referensi yang bebas dan sumber terbuka. Sebuah organisasi nirlaba, Python Software Foundation, mengelola dan mengarahkan sumber daya untuk pengembangan Python dan CPython.",
            "Guido van Rossum\n" +
                    "Multi-paradigm: functional, imperative, object-oriented, structured, reflective\n\n" +
                    "Python Software Foundation (PSF)\n\n" +
                    "3.9.2 / 19 February 2021\n" +
                    "https://www.python.org/\n" +
                    ".py, .pyi, .pyc, .pyd, .pyo, .pyw, .pyz\n"

        ),
        arrayOf(
            "PHP",
            "1995",
            "https://firmanweb.net/wp-content/uploads/2020/04/php-image.png",
            "Pada awalnya PHP merupakan kependekan dari Personal Home Page (Situs personal). PHP pertama kali dibuat oleh Rasmus Lerdorf pada tahun 1995. Pada waktu itu PHP masih bernama Form Interpreted (FI), yang wujudnya berupa sekumpulan skrip yang digunakan untuk mengolah data formulir dari web.\n" +
                    "\n" +
                    "Selanjutnya Rasmus merilis kode sumber tersebut untuk umum dan menamakannya PHP/FI. Dengan perilisan kode sumber ini menjadi sumber terbuka, maka banyak pemrogram yang tertarik untuk ikut mengembangkan PHP.\n" +
                    "\n" +
                    "Pada November 1997, dirilis PHP/FI 2.0. Pada rilis ini, interpreter PHP sudah diimplementasikan dalam program C. Dalam rilis ini disertakan juga modul-modul ekstensi yang meningkatkan kemampuan PHP/FI secara signifikan.\n" +
                    "\n" +
                    "Pada tahun 1997, sebuah perusahaan bernama Zend menulis ulang interpreter PHP menjadi lebih bersih, lebih baik, dan lebih cepat. Kemudian pada Juni 1998, perusahaan tersebut merilis interpreter baru untuk PHP dan meresmikan rilis tersebut sebagai PHP 3.0 dan singkatan PHP diubah menjadi akronim berulang PHP: Hypertext Preprocessor.\n" +
                    "\n" +
                    "Pada pertengahan tahun 1999, Zend merilis interpreter PHP baru dan rilis tersebut dikenal dengan PHP 4.0. PHP 4.0 adalah versi PHP yang paling banyak dipakai pada awal abad ke-21. Versi ini banyak dipakai disebabkan kemampuannya untuk membangun aplikasi web kompleks tetapi tetap memiliki kecepatan dan stabilitas yang tinggi.\n" +
                    "\n" +
                    "Pada Juni 2004, Zend merilis PHP 5.0. Dalam versi ini, inti dari interpreter PHP mengalami perubahan besar. Versi ini juga memasukkan model pemrograman berorientasi objek ke dalam PHP untuk menjawab perkembangan bahasa pemrograman ke arah paradigma berorientasi objek. Peladen web bawaan ditambahkan pada versi 5.4 untuk mempermudah pengembang menjalankan kode PHP tanpa menginstal peladen perangkat lunak.",
            "Rasmus Lerdorf\n" +
                    "Imperative, functional, object-oriented, procedural, reflective\n\n" +
                    "The PHP Development Team, Zend Technologies\n" +
                    "8.0.2 / 4 Februari 2021\n" +
                    "https://www.php.net/\n" +
                    ".php,.phtml,.php3,.php4,.php5,.php7,.phps,.php-s,.pht\n"
        ),
        arrayOf(
            "Swift",
            "2014",
            "https://developer.apple.com/swift/images/swift-og.png",
            "Swift adalah bahasa pemrograman objek fungsional untuk pengembangan iOS dan OS X yang dibuat oleh Apple. Didesain untuk berdampingan dengan Objective-C dan menghindari program dari kode yang salah. Swift diperkenalkan oleh Apple pada acara tahunan WWDC 2014.[3] Ini dibangun dengan compiler LLVM yang termasuk dalam Xcode 6 beta. Sebuah buku berisi 500 halaman petunjuk, The Swift Programming Language, dirilis bersamaan dengan WWDC, dan tersedia secara gratis di iBooks.",
            "Apple Inc\n" +
                    "Multi-paradigm: protocol-oriented, object-oriented, functional, imperative, block structured, declarative\n" +
                    "Apple Inc. and open-source contributors\n\n" +
                    "5.3.3 / 25 Januari 2021\n"+
                    "http://developer.apple.com/swift\n" +
                    ".swift\n"
        ),
        arrayOf(
            "C",
            "1972",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/3/35/The_C_Programming_Language_logo.svg/1200px-The_C_Programming_Language_logo.svg.png",
            "Bahasa pemrograman C merupakan salah satu bahasa pemrograman komputer. Dibuat pada tahun 1972 oleh Dennis Ritchie untuk Sistem Operasi Unix di Bell Telephone Laboratories.\n" +
                    "\n" +
                    "Meskipun C dibuat untuk memprogram sistem dan jaringan komputer namun bahasa ini juga sering digunakan dalam mengembangkan software aplikasi. C juga banyak dipakai oleh berbagai jenis platform sistem operasi dan arsitektur komputer, bahkan terdapat beberepa compiler yang sangat populer telah tersedia. C secara luar biasa memengaruhi bahasa populer lainnya, terutama C++ yang merupakan extensi dari C.",
            "Dennis Ritchie\n" +
                    "Imperative (procedural), structured\n\n\n" +
                    "Dennis Ritchie & Bell Laboratories (creators); ANSI C\n" +
                    "C17 / Juni 2018\n"+
                    "https://www.iso.org/standard/74528.html\n" +
                    ".c,.h\n"
        ),
        arrayOf(
            "C# (C Sharp)",
            "2000",
            "https://img2.pngdownload.id/20180831/iua/kisspng-c-programming-language-logo-microsoft-visual-stud-atlas-portfolio-5b89919299aab1.1956912415357423546294.jpg",
            "C# (dibaca: C Sharp) merupakan sebuah bahasa pemrograman yang berorientasi objek yang dikembangkan oleh Microsoft sebagai bagian dari inisiatif kerangka .NET Framework. Bahasa pemrograman ini dibuat berbasiskan bahasa C++ yang telah dipengaruhi oleh aspek-aspek ataupun fitur bahasa yang terdapat pada bahasa-bahasa pemrograman lainnya seperti Java, Delphi, Visual Basic, dan lain-lain) dengan beberapa penyederhanaan. Menurut standar ECMA-334 C# Language Specification, nama C# terdiri atas sebuah huruf Latin C (U+0043) yang diikuti oleh tanda pagar yang menandakan angka # (U+0023). Tanda pagar # yang digunakan memang bukan tanda kres dalam seni musik (U+266F), dan tanda pagar # (U+0023) tersebut digunakan karena karakter kres dalam seni musik tidak terdapat di dalam papan tombol standar.",
            "Microsoft\n" +
                    "Structured, imperative, object-oriented, event-driven, task-driven, functional, generic, reflective, concurrent\n" +
                    "Microsoft\n\n" +
                    "9.0 / November 10, 2020\n"+
                    "http://csharp.net/\n" +
                    ".cs, .csx\n"
        ),
        arrayOf(
            "Dart",
            "2011 (10 October)",
            "https://pbs.twimg.com/profile_images/993555605078994945/Yr-pWI4G.jpg",
            "Dart adalah bahasa pemrograman yang dioptimalkan untuk klien untuk aplikasi di berbagai platform. Ini dikembangkan oleh Google dan digunakan untuk membangun aplikasi seluler, desktop, server, dan web. Dart adalah bahasa berorientasi objek, berbasis kelas, dan dikumpulkan dari sampah dengan sintaks gaya C.",
            "Lars Bak and Kasper Lund\n" +
                    "Multi-paradigm: functional, imperative, object-oriented, reflective\n\n" +
                    "Google\n\n" +
                    "2.12.0 3 March 2021\n" +
                    "https://dart.dev/\n" +
                    ".dart\n"
        ),
        arrayOf(
            "JavaScript",
            "1996",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/9/99/Unofficial_JavaScript_logo_2.svg/768px-Unofficial_JavaScript_logo_2.svg.png",
            "JavaScript (/ˈdʒɑːvəˌskrɪpt/) (disingkat JS) adalah bahasa pemrograman tingkat tinggi dan dinamis. JavaScript populer di internet dan dapat bekerja di sebagian besar penjelajah web populer seperti Google Chrome, Internet Explorer (IE), Mozilla Firefox, Netscape dan Opera. Kode JavaScript dapat disisipkan dalam halaman web menggunakan tag SCRIPT. JavaScript merupakan salah satu teknologi inti World Wide Web selain HTML dan CSS. JavaScript membantu membuat halaman web interaktif dan merupakan bagian aplikasi web yang esensial.\n" +
                    "\n" +
                    "Awalnya hanya diimplementasi sebagai client-side dalam penjelajah web, kini engine JavaScript disisipkan ke dalam perangkat lunak lain seperti dalam server-side dalam server web dan basis data, dalam program non web seperti perangkat lunak pengolah kata dan pembaca PDF, dan sebagai runtime environment yang memungkinkan penggunaan JavaScript untuk membuat aplikasi desktop maupun mobile.",
            "Brendan Eich, contributors ECMAScript\n" +
                    "event-driven, functional, imperative\n\n\n" +
                    "Netscape Communications Corporation, Mozilla Foundation\n"+
                    "ECMAScript 2020 / June 2020\n" +
                    "developer.mozilla.org/en/JavaScript\n" +
                    ".js, .cjs, .mjs\n"
        ),
        arrayOf(
            "TypeScript",
            "2012 (1 October)",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/4/4c/Typescript_logo_2020.svg/1200px-Typescript_logo_2020.svg.png",
            "TypeScript adalah bahasa pemrograman yang dikembangkan dan dikelola oleh Microsoft . Ini adalah superset sintaksis ketat dari JavaScript dan menambahkan pengetikan statis opsional ke bahasa. TypeScript dirancang untuk pengembangan aplikasi besar dan ditranskompilasi ke JavaScript. Karena TypeScript adalah superset dari JavaScript, program JavaScript yang ada juga merupakan program TypeScript yang valid.\n" +
                    "\n" +
                    "TypeScript dapat digunakan untuk mengembangkan aplikasi JavaScript untuk eksekusi sisi klien dan sisi server (seperti pada Node.js atau Deno ). Ada beberapa opsi yang tersedia untuk transkompilasi. Baik Pemeriksa TypeScript default dapat digunakan, atau kompiler Babel dapat dipanggil untuk mengubah TypeScript ke JavaScript.\n" +
                    "\n" +
                    "TypeScript mendukung file definisi yang dapat berisi informasi jenis pustaka JavaScript yang ada, seperti file header C ++ yang dapat menggambarkan struktur file objek yang ada . Ini memungkinkan program lain untuk menggunakan nilai yang ditentukan dalam file seolah-olah mereka adalah entitas TypeScript yang diketik secara statis." +
                    "Kompiler TypeScript sendiri ditulis dalam TypeScript dan dikompilasi ke JavaScript. Ini dilisensikan di bawah Lisensi Apache 2.0 . TypeScript disertakan sebagai bahasa pemrograman kelas satu di Microsoft Visual Studio 2013 Update 2 dan yang lebih baru, di samping C # dan bahasa Microsoft lainnya. Ekstensi resmi memungkinkan Visual Studio 2012 untuk mendukung TypeScript juga.",
            "Microsoft\n" +
                    "Multi-paradigm: functional, generic, imperative, object-oriented\n\n" +
                    "Microsoft\n\n" +
                    "4.2.3 / 5 March 2021\n" +
                    "https://www.typescriptlang.org/\n" +
                    ".ts, .tsx\n"
        ),
        arrayOf(
            "R",
            "1993 (August)",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/1/1b/R_logo.svg/1200px-R_logo.svg.png",
            "R[3] (juga dikenal sebagai GNU S) adalah bahasa pemrograman dan perangkat lunak untuk analisis statistika dan grafik. R dibuat oleh Ross Ihaka dan Robert Gentleman di Universitas Auckland, Selandia Baru, dan kini dikembangkan oleh R Development Core Team, di mana Chambers merupakan anggotanya. R dinamakan sebagian setelah nama dua pembuatnya (Robert Gentleman dan Ross Ihaka), dan sebagian sebagian dari permainan nama dari S.[8]\n" +
                    "\n" +
                    "Bahasa R kini menjadi standar de facto di antara statistikawan untuk pengembangan perangkat lunak statistika, serta digunakan secara luas untuk pengembangan perangkat lunak statistika dan analisis data.\n" +
                    "\n" +
                    "R merupakan bagian dari proyek GNU. Kode sumbernya tersedia secara bebas di bawah Lisensi Publik Umum GNU, dan versi biner prekompilasinya tersedia untuk berbagai sistem operasi. R menggunakan antarmuka baris perintah, meski beberapa antarmuka pengguna grafik juga tersedia.\n" +
                    "\n" +
                    "R menyediakan berbagai teknik statistika (permodelan linier dan nonlinier, uji statistik klasik, analisis deret waktu, klasifikasi, klasterisasi, dan sebagainya) serta grafik. R, sebagaimana S, dirancang sebagai bahasa komputer sebenarnya, dan mengizinkan penggunanya untuk menambah fungsi tambahan dengan mendefinisikan fungsi baru. Kekuatan besar dari R yang lain adalah fasilitas grafiknya, yang menghasilkan grafik dengan kualitas publikasi yang dapat memuat simbol matematika. R memiliki format dokumentasi seperti LaTeX, yang digunakan untuk menyediakan dokumentasi yang lengkap, baik secara daring (dalam berbagai format) maupun secara cetakan.",
            "Ross Ihaka and Robert Gentleman\n" +
                    "Multi-paradigm: Array, object-oriented, imperative, functional, procedural, reflective\n" +
                    "R Core Team\n\n" +
                    "4.0.4 / 15 February 2021\n" +
                    "https://www.r-project.org/\n" +
                    ".r, .rdata, .rds, .rda\n"
        )

    )

    val listData: ArrayList<ProgrammingLanguage>
        get() {
            val list = ArrayList<ProgrammingLanguage>()
            for (aData in data) {
                val language = ProgrammingLanguage()
                language.name = aData[0]
                language.first_appeared = aData[1]
                language.photo = aData[2]
                language.overview = aData[3]
                language.detail = aData[4]

                list.add(language)
            }
            return list
        }
}