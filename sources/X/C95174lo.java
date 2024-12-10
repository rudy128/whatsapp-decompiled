package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.4lo  reason: invalid class name and case insensitive filesystem */
public final class C95174lo implements C22540BBx {
    public AnonymousClass4N0 A00;
    public final AnonymousClass11E A01;
    public final AnonymousClass9BS A02;
    public final AnonymousClass10I A03;

    public void C2M() {
        A00(this, (C62602rf) null);
    }

    public /* synthetic */ void C8D() {
    }

    public static final void A00(C95174lo r2, C62602rf r3) {
        AnonymousClass4N0 r0 = r2.A00;
        if (r0 != null) {
            C88454Zt.A00(r0.A00, r0.A01, r3, r0.A02);
        }
    }

    public void C8C(C62602rf r4) {
        if (r4 == null) {
            r4 = null;
        } else {
            switch (r4.A00) {
                case 1:
                case 2:
                case 3:
                    AnonymousClass4N0 r0 = this.A00;
                    if (r0 != null) {
                        C88454Zt r2 = r0.A01;
                        C88454Zt.A02(r2);
                        C88454Zt.A01(r0.A00, r2, r0.A02);
                        return;
                    }
                    return;
            }
        }
        A00(this, r4);
    }

    public C95174lo(AnonymousClass4N0 r2, AnonymousClass11E r3, C678831f r4, UserJid userJid, AnonymousClass1OZ r6, AnonymousClass10I r7) {
        C72473Md.A1I(r7, r6);
        C18070vi.A0d(r4, 4);
        C18070vi.A0d(r3, 6);
        this.A03 = r7;
        this.A00 = r2;
        this.A01 = r3;
        this.A02 = new AnonymousClass9BS(r4, this, userJid, r6);
    }
}
