package X;

/* renamed from: X.8kG  reason: invalid class name and case insensitive filesystem */
public class C169038kG extends C184179aX {
    public final String A00;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C169038kG r5 = (C169038kG) obj;
            if (!this.A00.equals(r5.A00) || r5.A01 != this.A01) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C169038kG(BAV bav, String str, boolean z) {
        super(bav, z);
        this.A00 = str;
    }
}
