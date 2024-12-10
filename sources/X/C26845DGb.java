package X;

/* renamed from: X.DGb  reason: case insensitive filesystem */
public class C26845DGb implements C28560E7m {
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
            C26845DGb dGb = (C26845DGb) obj;
            if (!(this.A01 == dGb.A01 && this.A00 == dGb.A00)) {
                return false;
            }
        }
        return true;
    }

    public C0O Bap() {
        return C0O.INPUT_PREVIEW_SIZE;
    }

    public int hashCode() {
        return (this.A01 * 31) + this.A00;
    }
}
