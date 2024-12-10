package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.4oX  reason: invalid class name and case insensitive filesystem */
public class C96864oX implements C22515BAy {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C96864oX(UserJid userJid, C108125bA r2, C86164Qm r3, int i) {
        this.A00 = i;
        this.A03 = r3;
        if (i != 0) {
            this.A01 = userJid;
            this.A02 = r2;
        } else {
            this.A02 = r2;
            this.A01 = userJid;
        }
    }

    public void BzD(C29681ch r7) {
        if (this.A00 != 0) {
            C18070vi.A0d(r7, 0);
            C86164Qm r4 = (C86164Qm) this.A03;
            ((C190649lI) r4.A03.get()).A00(r7, (UserJid) this.A01);
            r4.A01.A0J(new C21458AkP(r4, this.A02, 29));
            return;
        }
        C86164Qm r5 = (C86164Qm) this.A03;
        r5.A01.A0J(new C21435Ak2(r5, this.A02, this.A01, 15));
    }

    public void onError(Throwable th) {
        int i;
        int i2 = this.A00;
        C86164Qm r2 = (C86164Qm) this.A03;
        AnonymousClass1KB r1 = r2.A01;
        if (i2 != 0) {
            i = 37;
        } else {
            i = 36;
        }
        AnonymousClass3Ma.A1J(r1, r2, i);
        ((C108125bA) this.A02).Bt4(C18070vi.A0M(new C821743o((UserJid) this.A01)));
    }
}
