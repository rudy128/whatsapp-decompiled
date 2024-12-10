package X;

import com.whatsapp.jid.Jid;

/* renamed from: X.6lu  reason: invalid class name and case insensitive filesystem */
public final class C131936lu {
    public final C24751Ln A00;
    public final AnonymousClass18K A01;

    public C131936lu(C24751Ln r1, AnonymousClass18K r2) {
        C18070vi.A0j(r2, r1);
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void A00(AnonymousClass206 r4) {
        String str;
        Jid A0I = r4.A0I();
        if (A0I instanceof AnonymousClass1E2) {
            A0I = this.A00.A0D((AnonymousClass1E1) A0I);
        }
        AnonymousClass62P r1 = new AnonymousClass62P();
        r1.A00 = "HOSTED_ACCOUNT_SYSTEM_MESSAGE_OUT_OF_ORDER";
        if (A0I != null) {
            str = A0I.user;
        } else {
            str = null;
        }
        r1.A01 = String.valueOf(str);
        this.A01.CC7(r1);
    }
}
