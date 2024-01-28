
class Tabungan {
    private int saldo;

    public Tabungan(int saldoAwal) {
        saldo = saldoAwal;
    }

    public int getSaldo() {
        return saldo;
    }

    public void simpanUang(int jumlah) {
        if (jumlah > 0) {
            saldo += jumlah;
        } else {
            System.out.println("Jumlah yang disimpan harus lebih dari 0");
        }
    }

    public boolean ambilUang(int jumlah) {
        if (saldo >= jumlah && jumlah > 0) {
            saldo -= jumlah;
            return true;
        } else {
            System.out.println("Saldo tidak mencukupi atau jumlah yang diambil tidak valid");
            return false;
        }
    }
}




