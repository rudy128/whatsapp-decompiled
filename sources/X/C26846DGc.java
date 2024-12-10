package X;

/* renamed from: X.DGc  reason: case insensitive filesystem */
public class C26846DGc implements C28560E7m {
    public int A00;
    public int A01;

    public boolean BIP() {
        return true;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C26846DGc dGc = (C26846DGc) obj;
            if (!(this.A00 == dGc.A00 && this.A01 == dGc.A01)) {
                return false;
            }
        }
        return true;
    }

    public C0O Bap() {
        return C0O.INPUT_ROTATION;
    }

    public int hashCode() {
        return (this.A00 * 31) + this.A01;
    }
}
