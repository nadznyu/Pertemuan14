***Pertanyaan 1***
1. Apakah fungsi tanpa parameter selalu harus bertipe void?
2. Apakah daftar menu pada program kafe dapat ditampilkan tanpa menggunakan fungsi Menu()?  
   Modifikasi kode program tersebut untuk dapat menampilkan daftar menu tanpa menggunakan fungsi!
3. Jelaskan keuntungan menggunakan fungsi Menu() dibandingkan menulis semua perintah penampilan 
   menu langsung di dalam fungsi main.
4. Uraikan secara singkat alur eksekusi program ketika fungsi Menu() dipanggil dari main 
   (mulai dari program dijalankan sampai daftar menu tampil di layar).

***Jawaban Pertanyaan 1***
1. Tidak, fungsi tanpa parameter tidak harus bertipe void, yang menentukan tipe fungsi adalah jika
   nilai tersebut bisa dikembalikan atau tidak. Jika bisa dikembalikan, meskipun tidak memakai parameter harus tetap memakai tipe data.
2. Bisa ditampilkan tanpa menggunakan fungsi main().
3. Menggunakan fungsi main() akan menjadi lebih ringkas karena hanya memanggil Menu(). Selain itu 
   bisa dipanggil kapan saja tanpa copy paste.
4. - Masuk ke dalam fungsi Menu() : eksekusi memasuki blok kode yang ada di dalam {...}
   - Setiap baris System.out.println() di dalam Menu() dijalankan, sehingga muncul seperti dibawah ini (contoh):
   ===== MENU RESTO KAFE =====
   1. Kopi Hitam - Rp 15,000
   2. Cappuccino - Rp 20,000
   - Fungsi Menu() selesai dan kembali ke main().
   - Program melanjutkan instruksi berikutnya di dalam main().

***Pertanyaan 2***
1. Apakah kegunaan parameter di dalam fungsi?
2. Jelaskan mengapa pada percobaan ini fungsi Menu() menggunakan parameter namaPelanggan dan 
   isMember?
3. Apakah parameter sama dengan variabel? Jelaskan.
4. Jelaskan bagaimana cara kerja parameter isMember pada fungsi Menu(). Apa perbedaan output ketika 
   isMember bernilai true dan ketika false?
5. Apa yang akan terjadi jika memanggil fungsi Menu() tanpa menyertakan parameter namaPelanggan dan
   isMember?
6. Modifikasi kode di atas dengan menambahkan parameter baru kodePromo (String). Jika kodePromo 
   adalah "DISKON50", tampilkan berikan diskon 50%. Jika kodePromo adalah "DISKON30", tampilkan berikan diskon 30%. Jika tidak ada kode promo yang berlaku, tampilkan kode invalid.
7. Berdasarkan fungsi Menu() di atas, jika nama pelanggan adalah "Budi", pelanggan tersebut member, 
   dan menggunakan kode promo "DISKON30", tuliskan satu baris perintah pemanggilan fungsi menu yang benar.
8. Menurut Anda, apakah penggunaan parameter namaPelanggan dan isMember pada fungsi Menu() membuat 
   program lebih mudah dibaca dan dikembangkan dibandingkan jika nilai-nilai tersebut ditulis langsung di dalam fungsi tanpa parameter? Jelaskan alasan Anda.

***Jawaban Pertanyaan 2***
1. Paramater berperan sebagai tempat untuk data masukan yang akan diolah dalam fungsi.
2. Parameter namaPelanggan digunakan agar fungsi dapat menampilkan sapaan, dan parameter isMember  
   (bertipe boolean) digunakan untuk menentukan apakah pelanggan mendapatkan pesan tambahan untuk pemberian diskon. 
3. Tidak sama, Parameter memang mirip dengan variabel karena sama-sama mempunyai tipe data, punya
   nama, dan menyimpan nilai. Tetapi parameter itu khusus menerima nilai dari pemanggilan fungsi, 
   kalau variabel untuk menyimpan data secara umum di dalam program.
4. - Nilai isMember dikirim dari fungsi main()
   - Parameter isMember masuk ke dalam fungsi Menu()
   - Digunakan dalam kondisi if, yang artinya:
   -> jika isMember bernilai true, maka pesan akan ditampilkan.
      Selamat datang, Andi!
      Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!
   -> jika isMember bernilai false, maka pesan akan dilewati dan tidak ditampilkan (setelah
      menampilkan namaPelanggan, program akan langsung mengeluarkan daftar Menu).
      Selamat datang, Sinta!
5. Program akan error, karena tipe dan jumlah parameter harus cocok, pemanggilan tanpa parameter
   dianggap tidak valid.
6. Sudah gabung dengan no.7
7. Sudah di commit.
8. Iya, menurut saya lebih mudah menggunakan parameter namaPelanggan dan isMember karena membuat
   program jauh lebih mudah dibaca, dan dapat dikembangkan. Dibandingkan jika nilai-nilai tersebut ditulis langsung di dalam fungsi.

***Pertanyaan 3***
1. Jelaskan secara singkat kapan suatu fungsi membutuhkan nilai kembalian (return value) dan kapan 
   fungsi tidak perlu mengembalikan nilai. Berikan minimal satu contoh dari program kafe pada Percobaan 3 untuk masing-masing kasus.
2. Fungsi hitungTotalHargaNoAbsen saat ini mengembalikan total harga berdasarkan pilihanMenu dan 
   jumlahPesanan. Sebutkan tipe data nilai kembalian dan dua buah parameter yang digunakan fungsi tersebut. Jelaskan arti masing-masing parameter dalam konteks program kafe.
3. Modifikasi kode di atas sehingga fungsi hitungTotalHargaNoAbsen dapat menerima kodePromo. Jika 
   kodePromo adalah "DISKON50", maka mendapat diskon 50% dari totalHarga dan tampilkan diskon. Jika kodePromo adalah "DISKON30", maka mendapat diskon 30% dari totalHarga dan tampilkan diskon. Jika tidak ada kode promo yang berlaku, tampilkan kode invalid dan tidak ada pengurangan total harga totalHarga.
4. Modifikasi kode di atas sehingga bisa memilih beberapa jenis menu berbeda serta menampilkan total 
   keseluruhan pesanan. Bagaimana memodifikasi program sehingga pengguna dapat: memesan lebih dari satu jenis menu (misalnya menu 1 dan 3 sekaligus), dan menampilkan total keseluruhan pesanan (gabungan dari semua jenis menu).

***Jawaban Pertanyaan 3***
1. Fungsi yang memiliki tipe data selain void yang memerlukan return, contoh: 
   Contoh fungsi return value : fungsi hitungTotalHarga()
   Contoh fungsi no return value : fungsi Menu()
2. Masing-masing menggunakan tipe data int : int pilihanMenu, int banyakItem
   - pilihanMenu : nomor menu yang dipilih oleh pelanggan.
   - banyakItem : jumlah menu yang dipesan
3. Sudah di commit.
4. Sudah di commit.