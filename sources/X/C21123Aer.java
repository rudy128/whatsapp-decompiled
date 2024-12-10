package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.Aer  reason: case insensitive filesystem */
public final /* synthetic */ class C21123Aer implements AnonymousClass1TI {
    public final /* synthetic */ C170018ny A00;
    public final /* synthetic */ C185899dK A01;
    public final /* synthetic */ UserJid A02;
    public final /* synthetic */ C193199ph A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;

    public final void accept(Object obj) {
        C170018ny r10 = this.A00;
        String str = this.A04;
        C193199ph r12 = this.A03;
        UserJid userJid = this.A02;
        String str2 = this.A05;
        C185899dK r1 = this.A01;
        AnonymousClass1D6 r3 = (AnonymousClass1D6) obj;
        C18070vi.A0d(r3, 6);
        if (AnonymousClass000.A1Y(r3.first)) {
            AnonymousClass8BR.A0V(r10.A0F).A08(str.hashCode(), 2);
            C170018ny.A02(r10, userJid, r12, str, str2);
            return;
        }
        C195709tm r13 = (C195709tm) C29431cG.A0c(r1.A02);
        if (r13 != null) {
            ((C170638qQ) r10.A08.get()).A0C(new C20610ARu(r10, userJid, r12, str, str2), str, String.valueOf(r13.A07), r13.A08, C18070vi.A18(r13.A00, "DRAFT"), true);
        }
    }

    public /* synthetic */ C21123Aer(C170018ny r1, C185899dK r2, UserJid userJid, C193199ph r4, String str, String str2) {
        this.A00 = r1;
        this.A04 = str;
        this.A03 = r4;
        this.A02 = userJid;
        this.A05 = str2;
        this.A01 = r2;
    }
}
