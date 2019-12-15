package fixxx;

public class ressto 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//deklarasi
		String[] menu = 
		{
			"",
			"Nasi Jamblang",
			"Nasi Lengko",
			"Nasi Goreng",
			"Pecel",
			"Sop Senerek",
			"Mie Ayam",
			"Tahu Gejrot",
			"Jenang",
			"Es Teh",
			"Es Jeruk"
		};
		//kode pesanan, 1 - 10
		double[] harga = 
		{
			0,
			12000,
			15000,
			10000,
			8000,
			12000,
			10000,
			5000,
			6000,
			2000,
			3000
		};
		//kode pesanan, 1 - 10
		String[] order_menu = new String[11];
		//awal kode = 0
		double[][] order_harga = new double[11][2];
		//awal kode = 0 X
		//array 2 dimensi ini hanya memiliki 2 baris
		//baris 1 untuk harga barang, baris 2 untuk jumlah barang
		//kode barisan 0 & 1
		//penggambaran
		// 0 || 2000 | 3000 | 1000 |
		// 1 ||   2  |   1  |  12  |
		double total = 0;
		
		/*note
		 * - menu dan harga memiliki array terpisah dikarenakan 
		 *   kedua data yang ada memiliki bentuk yang berbeda.
		 * - kode menu dan harga saling berkorelasi.
		 * - menu/harga dan order_menu/order_harga saling berkorelasi.
		 * - data yang dimasukan kedalam array order akan dimasukan kedalam
		 *   array tersebut dengan kode array yang sama dengan menu/harga
		 */
		
		//first screen
		//loop
		//-menu
		//-/kembali ke layar awal(first screen)
		//---if(telah memesan)"semua pesanan anda akan hangus"
		//-/code invalid
		//---"kode yang anda masukan tidak termasuk dalam opsi yang ada."
		//-/memesan 1 jenis pesanan
		//---menentukan jumlah
		//---"dimasukan ke keranjang(cart)?
		//---yes(tampilkan keranjang & return menu)/no(return menu)
		//-/mengurangi pesanan
		///---"pilihlah pesanan yang ingin dihilangkan"
		//-/pilihan selesai memesan
		//---yes(break)/no(return menu)
		
		//check
		//-harga x banyak
		//-jumlah barang dipesan
		//-if(jumlah lebih dari 30.000)jumlah - 5000
		//-tampilan cek
		//--"apakah anda bersedia membayar?"
		//---yes(continue)/no(return menu)
		//-makan sini/bawa pulang(g tau potongan harganya brp)
		//terima kasih telah bla bla bla (return first screen)
	}

}
