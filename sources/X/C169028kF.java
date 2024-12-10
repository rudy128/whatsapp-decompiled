package X;

/* renamed from: X.8kF  reason: invalid class name and case insensitive filesystem */
public class C169028kF extends C184179aX {
    public final C194259rR A00;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C169028kF r5 = (C169028kF) obj;
            if (!this.A00.equals(r5.A00) || r5.A01 != this.A01) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C169028kF(BAV bav, C194259rR r2, boolean z) {
        super(bav, z);
        this.A00 = r2;
    }
}
