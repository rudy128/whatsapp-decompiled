package X;

import java.util.List;

/* renamed from: X.CWm  reason: case insensitive filesystem */
public class C25077CWm {
    public final double A00;
    public final List A01;
    public final char A02;
    public final String A03;
    public final String A04;

    public int hashCode() {
        char c = this.A02;
        return C108945cZ.A09(this.A04, C17890vO.A02(this.A03, c * 31));
    }

    public C25077CWm(String str, String str2, List list, char c, double d) {
        this.A01 = list;
        this.A02 = c;
        this.A00 = d;
        this.A04 = str;
        this.A03 = str2;
    }
}
