package X;

/* renamed from: X.2PU  reason: invalid class name */
public class AnonymousClass2PU extends A34 {
    public final AnonymousClass2LK A00;
    public final AnonymousClass3LI A01;
    public final AnonymousClass1SB A02;
    public final C18030ve A03;
    public final AnonymousClass18K A04;

    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        String str = ((String[]) objArr)[0];
        C17960vV.A07(str);
        if (!this.A02.A0N(str)) {
            return null;
        }
        return str;
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        String str = (String) obj;
        AnonymousClass3LI r1 = this.A01;
        if (r1 != null) {
            r1.C6u(AnonymousClass000.A1W(str));
        }
        if (str != null) {
            this.A00.notifyAllObservers(new AnonymousClass7KZ(str, 6));
        }
    }

    public AnonymousClass2PU(C18030ve r1, AnonymousClass18K r2, AnonymousClass2LK r3, AnonymousClass3LI r4, AnonymousClass1SB r5) {
        this.A03 = r1;
        this.A04 = r2;
        this.A02 = r5;
        this.A00 = r3;
        this.A01 = r4;
    }
}
