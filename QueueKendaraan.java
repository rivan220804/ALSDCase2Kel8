public class QueueKendaraan {
    Kendaraan[] antrian;
    int front, rear, size;

    public QueueKendaraan(int kapasitas) {
        antrian = new Kendaraan[kapasitas];
        front = rear = -1;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == antrian.length;
    }

    public Kendaraan cariKendaraan(String platNomor) {
        if (isEmpty()) {
            return null;
        }
        int i = front;
        int count = 0;
        while (count < size) {
            if (antrian[i].platNomor.equalsIgnoreCase(platNomor)) {
                return antrian[i];
            }
            i = (i + 1) % antrian.length;
            count++;
        }
        return null;
    }

    public void tambahAntrian(Kendaraan k) {
        if (isFull()) {
            System.out.println("Antrian Penuh!");
            return;
        }
        if (isEmpty()) {
            front = rear = 0;
        } else {
            rear = (rear + 1) % antrian.length;
        }
        antrian[rear] = k;
        size++;
    }

    public Kendaraan dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return null;
        }
        Kendaraan keluar = antrian[front];
        front = (front + 1) % antrian.length;
        size--;
        if (size == 0) {
            front = rear = -1;
        }
        return keluar;
    }

    public void tampilAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian Kosong!");
            return;
        }
        int i = front;
        System.out.println("");
        for (int count = 0; count < size; count++) {
            System.out.println( (count + 1) + ". Plat Nomor: " + antrian[i].platNomor);
            System.out.println(" Tipe: " + antrian[i].tipe);
            System.out.println(" Merk : " + antrian[i].merk);
            i = (i + 1) % antrian.length;
        }
    }

    public int getSize() {
        return size;
    }
}
