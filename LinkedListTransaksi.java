public class LinkedListTransaksi {
    NodeTransaksi head;

    public void tambah(TransaksiPengisian Transaksi){
        NodeTransaksi node = new NodeTransaksi(Transaksi);
        if (head == null) {
            head = node;
        } else {
            NodeTransaksi temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
    }
    public void tampilkan(){
        if (head == null) {
            System.out.println("Belum ada transaksi.");
        } else {
            NodeTransaksi temp = head;
            while (temp != null) {
                temp.data.tampilkanTransaksi();
                temp = temp.next;
                
                
            }
        }
    }
}
