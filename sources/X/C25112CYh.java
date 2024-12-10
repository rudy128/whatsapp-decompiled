package X;

/* renamed from: X.CYh  reason: case insensitive filesystem */
public class C25112CYh {
    public static final C25112CYh A03;
    public int A00;
    public boolean A01;
    public boolean A02;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C25112CYh)) {
            return false;
        }
        C25112CYh cYh = (C25112CYh) obj;
        return this.A00 == cYh.A00 && this.A02 == cYh.A02 && this.A01 == cYh.A01;
    }

    public int hashCode() {
        int i = this.A00;
        int i2 = 0;
        int i3 = 0;
        if (this.A02) {
            i3 = 4194304;
        }
        int i4 = i ^ i3;
        if (this.A01) {
            i2 = 8388608;
        }
        return i4 ^ i2;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.CYh, java.lang.Object] */
    static {
        ? obj = new Object();
        obj.A00 = Integer.MAX_VALUE;
        obj.A02 = true;
        obj.A01 = true;
        A03 = obj;
    }
}
