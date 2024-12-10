package X;

/* renamed from: X.0x1  reason: invalid class name and case insensitive filesystem */
public class C18700x1 {
    public final boolean A00;
    public final C18350wG A01;

    public boolean equals(Object obj) {
        if (!(obj instanceof C18700x1)) {
            return false;
        }
        C18700x1 r4 = (C18700x1) obj;
        if (!r4.A01.equals(this.A01) || r4.A00 != this.A00) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.A01.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.A00).hashCode();
    }

    public C18700x1(C18350wG r1, boolean z) {
        this.A01 = r1;
        this.A00 = z;
    }
}
