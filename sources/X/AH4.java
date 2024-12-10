package X;

import android.app.Application;
import com.whatsapp.biz.catalog.manager.CatalogManager;
import com.whatsapp.jid.UserJid;

public final class AH4 implements C24051Ir {
    public final C182479Un A00;
    public final C192829p3 A01;
    public final UserJid A02;

    public /* synthetic */ AnonymousClass1J2 BGl(C24091Iv r2, Class cls) {
        return C60282nh.A00(this, cls);
    }

    public AnonymousClass1J2 BG9(Class cls) {
        C182479Un r0 = this.A00;
        UserJid userJid = this.A02;
        C192829p3 r11 = this.A01;
        AnonymousClass1K2 r02 = r0.A00;
        AnonymousClass10E r7 = r02.A01;
        AnonymousClass11P A6O = AnonymousClass10E.A6O(r7);
        AnonymousClass11S A17 = AnonymousClass10E.A17(r7);
        Application A002 = AnonymousClass0YX.A00(r7.Ao9);
        C20004A2u A0W = AnonymousClass8BT.A0W(r7);
        C20114A7x A0C = AnonymousClass8BU.A0C(r7);
        AnonymousClass10G r6 = r7.A00;
        A8Q A0D = AnonymousClass8BU.A0D(r7);
        C26911Ty A0D2 = AnonymousClass8BT.A0D(r7);
        AnonymousClass1K1 r03 = r02.A00;
        CatalogManager catalogManager = (CatalogManager) r7.A1s.get();
        C19973A1i a1i = (C19973A1i) r7.A1r.get();
        C19988A2a a2a = (C19988A2a) r6.A0s.get();
        UserJid userJid2 = userJid;
        AnonymousClass2UJ r31 = (AnonymousClass2UJ) r6.A3d.get();
        C192179nw r20 = (C192179nw) r7.A1L.get();
        C196469v7 r21 = (C196469v7) r03.A0V.get();
        C185479ce r22 = (C185479ce) r03.A0W.get();
        C190919lj r24 = (C190919lj) r6.A0r.get();
        return new AnonymousClass8F8(A002, (C19880zA) r03.A5J.get(), A17, r11, (C196149uX) r7.A1I.get(), A0D2, r20, r21, r22, A0C, r24, A0D, catalogManager, a1i, a2a, A6O, userJid2, r31, A0W, AnonymousClass10E.AL1(r7), C000200d.A00(r6.A0n));
    }

    public AH4(C182479Un r1, C192829p3 r2, UserJid userJid) {
        this.A02 = userJid;
        this.A01 = r2;
        this.A00 = r1;
    }
}
