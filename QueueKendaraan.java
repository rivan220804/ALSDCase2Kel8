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

    public void tambahAntrian(Kendaraan k) {
        if (isFull()) {
            System.out.println("Antrian Penuh!");
        }
        if (isEmpty()) {
            front = rear = 0;
        } else {
            rear = (rear + 1) % antrian.length;
        }
        antrian[rear] = k;
        size++;
    }

    public void tampilAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian Kosong!");
            return;
        }
        System.out.println("");
        for (int i = 0; i < size; i++) {
            System.out.println( (i + 1) + ". " + antrian[i].platNomor);
            i = (i + 1) % antrian.length;
        }
    }

    public int getSize() {
        return size;
    }
}
