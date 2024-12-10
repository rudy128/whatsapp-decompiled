package X;

/* renamed from: X.AIv  reason: case insensitive filesystem */
public class C20382AIv implements BA8 {
    public BA8 A00;

    public void CFI(String str, String str2, Throwable th) {
        BA8 ba8;
        synchronized (this) {
            ba8 = this.A00;
        }
        ba8.CFI(str, str2, th);
    }

    public void CFL() {
        BA8 ba8;
        synchronized (this) {
            ba8 = this.A00;
        }
        ba8.CFL();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.BA8] */
    public C20382AIv() {
        ? obj = new Object();
        synchronized (this) {
            this.A00 = obj;
        }
    }
}
