package X;

import android.app.Application;
import com.whatsapp.jid.UserJid;

public final class AH8 implements C24051Ir {
    public final C182519Ur A00;
    public final C192829p3 A01;
    public final UserJid A02;
    public final AnonymousClass2UJ A03;
    public final AER A04;

    public AH8(C182519Ur r2, C192829p3 r3, UserJid userJid, AnonymousClass2UJ r5, AER aer) {
        C72473Md.A1M(userJid, r5, r2, 1);
        this.A02 = userJid;
        this.A04 = aer;
        this.A01 = r3;
        this.A03 = r5;
        this.A00 = r2;
    }

    public /* synthetic */ AnonymousClass1J2 BGl(C24091Iv r2, Class cls) {
        return C60282nh.A00(this, cls);
    }

    public AnonymousClass1J2 BG9(Class cls) {
        C182519Ur r0 = this.A00;
        UserJid userJid = this.A02;
        AER aer = this.A04;
        C192829p3 r4 = this.A01;
        AnonymousClass2UJ r10 = this.A03;
        AnonymousClass1K2 r2 = r0.A00;
        AnonymousClass10E r1 = r2.A01;
        Application A002 = AnonymousClass0YX.A00(r1.Ao9);
        AnonymousClass10I AL1 = AnonymousClass10E.AL1(r1);
        AnonymousClass11E A0d = AnonymousClass3MZ.A0d(r1);
        return new AnonymousClass8F5(A002, r4, (C196469v7) r2.A00.A0V.get(), (C192789oz) r1.A8n.get(), (C192559ob) r1.A1y.get(), A0d, userJid, r10, aer, AL1, C000200d.A00(r1.A00.A0n));
    }
}
