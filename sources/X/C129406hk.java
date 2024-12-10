package X;

import java.util.List;

/* renamed from: X.6hk  reason: invalid class name and case insensitive filesystem */
public class C129406hk {
    public E8A A00;
    public String A01;
    public List A02;
    public final String A03;

    public C129406hk(DFL dfl) {
        List<DFL> A0G;
        String A0D;
        String str = "";
        if (!(dfl == null || (A0D = dfl.A0D(38)) == null)) {
            str = A0D;
        }
        this.A03 = str;
        if (dfl != null) {
            dfl.A0D(45);
            dfl.A0D(46);
        }
        E8A e8a = null;
        this.A01 = dfl != null ? dfl.A0D(42) : null;
        this.A00 = dfl != null ? dfl.A0A(43) : e8a;
        if (dfl != null && (A0G = dfl.A0G(44)) != null) {
            this.A02 = AnonymousClass000.A13();
            for (DFL r2 : A0G) {
                this.A02.add(new C128836gl(r2));
            }
        }
    }
}
