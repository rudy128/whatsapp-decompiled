package X;

import com.whatsapp.jid.UserJid;

public class AN9 implements BAI {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public AN9(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    public void BuD(C195149ss r3, int i) {
        if (this.A00 != 0) {
            ((BAI) this.A01).BuD(r3, i);
            return;
        }
        if (406 == i) {
            ((AnonymousClass8F8) this.A02).A0N.A03(r3.A02);
        }
        ((AnonymousClass8F8) this.A02).A0B.A0E(AnonymousClass000.A13());
    }

    public void BuE(C195149ss r5, AN7 an7) {
        if (this.A00 != 0) {
            ((C192569oc) this.A02).A03.A02(an7, r5.A02, r5.A04.isEmpty());
            ((BAI) this.A01).BuE(r5, an7);
            return;
        }
        AnonymousClass8F8 r3 = (AnonymousClass8F8) this.A02;
        C19988A2a a2a = r3.A0N;
        UserJid userJid = (UserJid) this.A01;
        a2a.A02(an7, userJid, true);
        r3.A0B.A0E(a2a.A01(userJid, "catalog_category_dummy_root_id"));
    }
}
