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