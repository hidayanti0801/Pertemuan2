public class java
{
	public static void main(String args[])
	{
		Manusia a = new Manusia();
		Hewan b = new Hewan();
		Pesawat_telpon c = new Pesawat_telpon();
		
		System.out.println("Manusia: ");
		System.out.println("Bermain: " + a.bermain("game"));
		System.out.println("Makan: " + a.makan("nasi"));
		System.out.println("tidur " );
		System.out.println("Bekerja: " + a.bekerja("bisnis"));
		System.out.println("Memasak: " + a.memasak("true"));
		System.out.println("Mencuci: " + a.mencuci("true"));

		System.out.println("Hewan: ");
		System.out.println("Bermain: " + b.bermain("Bola Karet"));
		System.out.println("Makan: " + b.makan("Ikan giling"));
		System.out.println("tidur " );

		System.out.println("Telepon: ");
		System.out.println("Menerima Panggilan: " + c.terima_panggilan("Menerima"));
		System.out.println("Melakukan Panggilan: " + c.melakukan_panggilan("Memanggil"));

	}

}