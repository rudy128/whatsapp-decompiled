package X;

/* renamed from: X.DGd  reason: case insensitive filesystem */
public class C26847DGd implements C28560E7m {
    public float A00;
    public int A01;
    public int A02;

    public boolean BIP() {
        return true;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C26847DGd dGd = (C26847DGd) obj;
            if (!(this.A02 == dGd.A02 && this.A01 == dGd.A01 && this.A00 == dGd.A00)) {
                return false;
            }
        }
        return true;
    }

    public C0O Bap() {
        return C0O.PREVIEW_VIEW_SIZE;
    }

    public int hashCode() {
        return (((this.A02 * 31) + this.A01) * 31) + ((int) this.A00);
    }
}
