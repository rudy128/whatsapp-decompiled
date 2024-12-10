package X;

/* renamed from: X.7Sp  reason: invalid class name and case insensitive filesystem */
public class C147297Sp implements C1604388m {
    public long A00;
    public final C1604388m A01;

    public C147297Sp(C1604388m r1) {
        this.A01 = r1;
    }

    public String readLine() {
        long currentTimeMillis = System.currentTimeMillis();
        String readLine = this.A01.readLine();
        this.A00 += System.currentTimeMillis() - currentTimeMillis;
        return readLine;
    }
}
