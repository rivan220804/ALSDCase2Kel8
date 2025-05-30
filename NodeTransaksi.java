public class NodeTransaksi {
    TransaksiPengisian data;
    NodeTransaksi next;

    public NodeTransaksi(TransaksiPengisian data) {
        this.data = data;
        this.next = null;
    }
}