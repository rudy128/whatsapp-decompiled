package X;

import com.whatsapp.jid.UserJid;

public final /* synthetic */ class AXV implements B8a {
    public final /* synthetic */ AnonymousClass8pF A00;
    public final /* synthetic */ BCC A01;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.9O3] */
    public final void C3q(UserJid userJid, C1418477e r5, C1418477e r6, C1418477e r7, A7B a7b, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        BCC bcc = this.A01;
        AnonymousClass8pF r1 = this.A00;
        if (a7b != null) {
            if (bcc != null) {
                bcc.Bpz(r1);
            }
        } else if (z) {
            r1.A01 = r6;
            r1.A00 = r5;
            r1.A02 = str;
            if (bcc != null) {
                ? obj = new Object();
                obj.A01 = r1;
                obj.A03 = z4;
                obj.A04 = z2;
                obj.A02 = str2;
                obj.A00 = r7;
                bcc.BzI(obj);
            }
        }
    }

    public /* synthetic */ AXV(AnonymousClass8pF r1, BCC bcc) {
        this.A01 = bcc;
        this.A00 = r1;
    }
}
