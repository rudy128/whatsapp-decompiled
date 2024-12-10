package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.1Ok  reason: invalid class name and case insensitive filesystem */
public final class C25491Ok {
    public final AnonymousClass11S A00;
    public final AnonymousClass18K A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;

    public C25491Ok(AnonymousClass11S r2, AnonymousClass18K r3, AnonymousClass00H r4, AnonymousClass00H r5) {
        C18070vi.A0d(r2, 1);
        C18070vi.A0d(r3, 2);
        C18070vi.A0d(r4, 3);
        C18070vi.A0d(r5, 4);
        this.A00 = r2;
        this.A01 = r3;
        this.A03 = r4;
        this.A02 = r5;
        Boolean bool = C17960vV.A01;
    }

    public final boolean A00(UserJid userJid) {
        if (userJid != null) {
            return ((AnonymousClass12B) this.A03.get()).A01(userJid);
        }
        return false;
    }
}
