package X;

import java.util.Collections;
import java.util.List;

/* renamed from: X.CkC  reason: case insensitive filesystem */
public abstract class C25681CkC {
    public C9N A00;
    public C22415B6x A01;
    public final E9O A02;
    public final CBv A03;
    public final C26968DNq A04 = new C26968DNq();
    public final C199029zJ A05;
    public final List A06;

    public static Object A03(DOZ doz, DFL dfl, C199029zJ r3, E8A e8a) {
        return C25974Cph.A00(C23736Boh.A01(doz, e8a, dfl.A0A), r3, e8a);
    }

    public Object A04(C199029zJ r2, String str) {
        return this.A01.BKe(r2, this, str);
    }

    public C25681CkC(E9O e9o, C9N c9n, CBv cBv, C199029zJ r5, C22415B6x b6x, List list) {
        if (b6x instanceof C26969DNr) {
            this.A01 = b6x;
        } else {
            this.A01 = new C26969DNr(b6x);
        }
        this.A00 = c9n;
        if (list == null) {
            this.A06 = Collections.emptyList();
        } else {
            this.A06 = list;
        }
        this.A02 = e9o;
        this.A03 = cBv;
        this.A05 = r5;
    }
}
