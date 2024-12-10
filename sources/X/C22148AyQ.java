package X;

/* renamed from: X.AyQ  reason: case insensitive filesystem */
public final class C22148AyQ extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C20135A8w this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22148AyQ(C20135A8w a8w) {
        super(1);
        this.this$0 = a8w;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass00H r3;
        Number A1C;
        int A0M = AnonymousClass000.A0M(obj);
        C20135A8w a8w = this.this$0;
        C34141jz r1 = a8w.A0F;
        int i = r1.A02;
        r1.A02 = A0M;
        a8w.A08.A0F(r1);
        C20135A8w a8w2 = this.this$0;
        if (i != 98 ? i == 0 && A0M == 98 : A0M == 0) {
            AnonymousClass8BR.A0L(AnonymousClass8BT.A0G(a8w2).A02).A00();
        }
        if (A0M != 98) {
            r3 = a8w2.A0I;
            ((A2R) r3.get()).A03();
            C195369tE A0L = AnonymousClass8BR.A0L(AnonymousClass8BT.A0G(a8w2).A02);
            synchronized (A0L) {
                A0L.A01 = null;
                A0L.A03 = null;
                A0L.A00 = null;
                A0L.A02 = null;
            }
        } else {
            C22801Dg r2 = a8w2.A08;
            r3 = a8w2.A0I;
            r2.A0H(((A2R) r3.get()).A04.A02.A02, a8w2.A0A);
            C196069uP r22 = ((A2R) r3.get()).A04.A02;
            if (r22.A00 == null) {
                C21446AkD.A01(r22.A05, r22, 27);
            }
        }
        if (C20135A8w.A06(a8w2) || ((A1C = C108945cZ.A1C(a8w2.A06)) != null && A1C.intValue() == 98)) {
            ((A2R) r3.get()).A03.A0A();
        }
        return C27621Wu.A00;
    }
}
