package X;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class AZO implements BBN {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C20130A8q A01;
    public final /* synthetic */ B9G A02;
    public final /* synthetic */ C22521BBe A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ Map A06;

    public AZO(C20130A8q a8q, B9G b9g, C22521BBe bBe, String str, String str2, Map map, int i) {
        this.A01 = a8q;
        this.A00 = i;
        this.A04 = str;
        this.A02 = b9g;
        this.A03 = bBe;
        this.A06 = map;
        this.A05 = str2;
    }

    public void Bu4(C19976A1m a1m) {
        C20130A8q a8q = this.A01;
        int i = this.A00;
        Long valueOf = Long.valueOf(a1m.A00);
        C176178zu r2 = a8q.A09;
        C20130A8q.A03(r2, a8q, valueOf, "iqResponse", "error_code", i);
        r2.A01.A04(i, 467);
        C189549jQ r22 = a8q.A0C;
        String str = a8q.A0H;
        synchronized (r22) {
            C18070vi.A0d(str, 0);
            r22.A00.remove(str);
        }
        C22521BBe bBe = this.A03;
        if (bBe != null) {
            bBe.C7V(C108975cc.A0h("error", a1m));
        }
    }

    public void Bu5(AnonymousClass9DP r18) {
        C20130A8q a8q = this.A01;
        int i = this.A00;
        C176178zu r4 = a8q.A09;
        C222119a r1 = r4.A01;
        r1.A03(i, "iqResponse");
        String str = this.A04;
        B9G b9g = this.A02;
        C22521BBe bBe = this.A03;
        Map map = this.A06;
        AnonymousClass9DE r0 = (AnonymousClass9DE) r18.A00;
        String str2 = this.A05;
        C20129A8p A002 = a8q.A02.A00(a8q.A0A, str, a8q.A0D.A00(), a8q.A0H, (String) null, (String) null);
        a8q.A00 = A002;
        if (b9g != null) {
            b9g.Bul(A002.A0N);
        }
        AnonymousClass9DO r8 = (AnonymousClass9DO) r0.A05;
        if (r8 != null) {
            AnonymousClass9DH r82 = (AnonymousClass9DH) r8.A00;
            C20130A8q.A09(a8q, C20130A8q.A01(a8q, r82, str));
            String str3 = r82.A02;
            Map A0h = C108975cc.A0h(C179599Ip.REFERRAL.key, str2);
            if (map == null) {
                map = AnonymousClass1D7.A0I();
            }
            A002.A0B(new AZI(a8q, bBe, 0), str3, AnonymousClass1D7.A09(A0h, map), (Map) null, false);
            C20130A8q.A03(r4, a8q, C17880vN.A0n(((List) r82.A01).size()), "initializeStateMachine", "num_states", i);
            AnonymousClass9DO r42 = (AnonymousClass9DO) r0.A01;
            if (r42 != null) {
                Iterator A13 = AnonymousClass8BR.A13(((AnonymousClass9DN) r42.A00).A01);
                while (A13.hasNext()) {
                    a8q.A0D((C178369Cv) A13.next());
                }
            }
            r1.A04(i, 467);
        }
        AnonymousClass9DO r02 = (AnonymousClass9DO) r0.A03;
        if (r02 != null) {
            Iterator A132 = AnonymousClass8BR.A13(((AnonymousClass9DO) r02.A00).A00);
            while (A132.hasNext()) {
                C20130A8q.A08(a8q, (AnonymousClass9DH) A132.next());
            }
        }
    }
}
