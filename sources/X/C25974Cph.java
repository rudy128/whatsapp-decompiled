package X;

import java.util.List;

/* renamed from: X.Cph  reason: case insensitive filesystem */
public class C25974Cph {
    public final C23736Boh A00;

    public void A02(C199029zJ r2, E8A e8a) {
        A00(this.A00, r2, e8a);
    }

    public C25974Cph(C23736Boh boh) {
        this.A00 = boh;
    }

    public static Object A00(C23736Boh boh, C199029zJ r2, E8A e8a) {
        try {
            return A01(boh, r2, e8a);
        } catch (C27230Da9 e) {
            C25913CoX.A00(boh.A00, "BloksInterpreter", "Exception while evaluating Lispy Script", e);
            return null;
        }
    }

    public static Object A01(C23736Boh boh, C199029zJ r4, E8A e8a) {
        C26962DNk A01;
        C23736Boh A002 = C23736Boh.A00(e8a.BZU(), boh, (List) null);
        AnonymousClass0O7.A01("LispyEvaluation");
        CIG.A05.incrementAndGet();
        DOZ doz = A002.A00;
        if (!(doz == null || (A01 = C26272CwJ.A01(doz)) == null || !C26176Ctu.A03())) {
            A01.A00++;
        }
        try {
            return CCJ.A00(r4, e8a, A002);
        } finally {
            AnonymousClass0O7.A00();
            if (doz != null) {
                C26272CwJ.A06(doz);
            }
        }
    }
}
