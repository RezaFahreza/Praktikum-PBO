// Titik.java 22/02/23
// Penulis : Rizky Akhmad Fahreza - 24060121130081
// Deskripsi : Kelas yang berisi atribut dari objek titik

class Titik{
	double absis;
	double ordinat;
	static int counterTitik;
	
	Titik(){
		absis = 0;
		ordinat = 0;
		counterTitik++;
	}
	
	Titik(double x, double y){
		absis = x;
		ordinat = y;
		counterTitik++;
	}
	
	void setAbsis(double x){
		absis = x;
	}
	
	void setOrdinat(double y){
		ordinat = y;
	}
	
	double getAbsis(){
		return absis;
	}
	
	double getOrdinat(){
		return ordinat;
	}
	
	int getCounterTitik(){
		return counterTitik;
	}
	
}
