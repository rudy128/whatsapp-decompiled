package X;

public class DT9 implements Runnable {
    public final int A00;
    public final long A01;
    public final Object A02;
    public final String A03;

    public DT9(Object obj, String str, int i, long j) {
        this.A00 = i;
        this.A02 = obj;
        this.A03 = str;
        this.A01 = j;
    }

    public final void run() {
        String str;
        long j;
        DGM dgm;
        boolean z;
        int i = this.A00;
        Object obj = this.A02;
        if (i != 0) {
            str = this.A03;
            j = this.A01;
            dgm = ((C24847CMq) obj).A01.A01.A0o;
            z = true;
        } else {
            str = this.A03;
            j = this.A01;
            dgm = ((C25047CVb) obj).A01.A01.A0o;
            z = false;
        }
        dgm.Br2(str, z, j);
    }
}
