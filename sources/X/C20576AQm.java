package X;

/* renamed from: X.AQm  reason: case insensitive filesystem */
public class C20576AQm implements C72113Kr {
    public final AnonymousClass118 A00;
    public final C19830z4 A01;
    public final C18030ve A02;
    public final AnonymousClass18K A03;
    public final AnonymousClass1Nb A04;

    public void Bqf() {
        if (new C27311Vp(this.A00.A00).A01()) {
            C171278rS r3 = new C171278rS();
            AnonymousClass1Nb r0 = this.A04;
            C42551yM A0W = r0.A0W();
            C42551yM A0V = r0.A0V();
            r3.A01 = Boolean.valueOf(A0V.A0B());
            r3.A00 = C108945cZ.A1A(A0V.A02().A0R);
            int i = 2;
            r3.A05 = Integer.valueOf(C72453Mb.A04(AnonymousClass026.A00(A0V.A02().A0K, A0V.A0K) ? 1 : 0));
            r3.A03 = Boolean.valueOf(A0W.A0B());
            r3.A02 = C108945cZ.A1A(A0W.A02().A0R);
            if (AnonymousClass026.A00(A0W.A02().A0K, A0W.A0K)) {
                i = 1;
            }
            r3.A06 = Integer.valueOf(i);
            if (C18020vd.A05(C18040vf.A02, this.A02, 10760)) {
                r3.A04 = C108945cZ.A1A(C17880vN.A1W(C17890vO.A0B(this.A01), "status_reminder_notifications_muted"));
            }
            this.A03.CC4(r3);
        }
    }

    public C20576AQm(AnonymousClass118 r1, C19830z4 r2, C18030ve r3, AnonymousClass18K r4, AnonymousClass1Nb r5) {
        this.A02 = r3;
        this.A00 = r1;
        this.A03 = r4;
        this.A04 = r5;
        this.A01 = r2;
    }
}
