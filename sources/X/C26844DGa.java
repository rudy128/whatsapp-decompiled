package X;

/* renamed from: X.DGa  reason: case insensitive filesystem */
public class C26844DGa implements C28560E7m {
    public Integer A00;

    public boolean BIP() {
        return true;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return obj != null && getClass() == obj.getClass() && this.A00 == ((C26844DGa) obj).A00;
        }
        return true;
    }

    public C0O Bap() {
        return C0O.INPUT_FACING;
    }

    public int hashCode() {
        String str;
        int intValue = this.A00.intValue();
        if (intValue != 0) {
            str = "BACK";
        } else {
            str = "FRONT";
        }
        return str.hashCode() + intValue;
    }
}
