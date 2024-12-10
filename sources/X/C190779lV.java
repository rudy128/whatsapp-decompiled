package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.9lV  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C190779lV {
    public final /* synthetic */ AnonymousClass1E8 A00;
    public final /* synthetic */ AW0 A01;
    public final /* synthetic */ AnonymousClass8GL A02;

    public final void A00(A7B a7b, String str, String str2) {
        C1418477e r0;
        AnonymousClass8GL r4 = this.A02;
        AW0 aw0 = this.A01;
        AnonymousClass1E8 r2 = this.A00;
        if (a7b != null) {
            A46.A01(r4.A01);
            AnonymousClass8GL.A00(a7b, r4);
            return;
        }
        aw0.A0K = str2;
        C170318pf r02 = (C170318pf) aw0.A0A;
        C17960vV.A07(r02);
        C196219ue r1 = r02.A0H;
        C17960vV.A07(r1);
        if (str != null) {
            r0 = C20061A5k.A00(str, "mandateNo");
        } else {
            r0 = null;
        }
        r1.A08 = r0;
        aw0.A02 = 417;
        aw0.A0E = (UserJid) r2.A0J;
        C21432Ajz.A00(r4.A0M, r4, aw0, 44);
    }

    public /* synthetic */ C190779lV(AnonymousClass1E8 r1, AW0 aw0, AnonymousClass8GL r3) {
        this.A02 = r3;
        this.A01 = aw0;
        this.A00 = r1;
    }
}
