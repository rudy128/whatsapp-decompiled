package X;

import android.app.Application;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;

/* renamed from: X.8F5  reason: invalid class name */
public final class AnonymousClass8F5 extends AnonymousClass8FK {
    public final AnonymousClass1DS A00;
    public final C22801Dg A01;
    public final C22801Dg A02;
    public final AnonymousClass1DT A03;
    public final C192829p3 A04;
    public final C192789oz A05;
    public final A20 A06;
    public final C192559ob A07;
    public final AnonymousClass11E A08;
    public final UserJid A09;
    public final AnonymousClass10I A0A;
    public final AnonymousClass00H A0B;
    public final C196469v7 A0C;
    public final AnonymousClass2UJ A0D;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8F5(Application application, C192829p3 r12, C196469v7 r13, C192789oz r14, C192559ob r15, AnonymousClass11E r16, UserJid userJid, AnonymousClass2UJ r18, AER aer, AnonymousClass10I r20, AnonymousClass00H r21) {
        super(application);
        C18070vi.A0g(r12, 3, application);
        AnonymousClass10I r2 = r20;
        AnonymousClass11E r3 = r16;
        C18070vi.A0x(r2, r14, r3, r13, r15);
        AnonymousClass00H r1 = r21;
        C18070vi.A0d(r1, 11);
        UserJid userJid2 = userJid;
        this.A09 = userJid2;
        this.A04 = r12;
        this.A0D = r18;
        this.A0A = r2;
        this.A05 = r14;
        this.A08 = r3;
        this.A0C = r13;
        this.A07 = r15;
        this.A0B = r1;
        C22801Dg A0R = C108945cZ.A0R();
        this.A02 = A0R;
        C22801Dg A0R2 = C108945cZ.A0R();
        this.A01 = A0R2;
        AnonymousClass1DT A0L = AnonymousClass3MW.A0L();
        this.A03 = A0L;
        Application application2 = this.A00;
        C18070vi.A0z(application2, "null cannot be cast to non-null type T of androidx.lifecycle.AndroidViewModel.getApplication");
        String valueOf = String.valueOf(AnonymousClass3MW.A01(application2.getResources(), 2131167707));
        ArrayList A13 = AnonymousClass000.A13();
        AER aer2 = aer;
        for (C20254ADm aDm : aer2.A02) {
            for (C20243ADb aDb : aDm.A01) {
                A13.add(aDb.A00);
            }
        }
        A20 a20 = new A20(userJid2, valueOf, valueOf, A13);
        this.A06 = a20;
        C20339AGv.A01(A0L, A0R2, new C22130Ay8(this), 11);
        C20339AGv.A01(A0L, A0R, new B0Y(this, aer2), 11);
        r14.A00(A0L, a20);
        this.A00 = A0R;
    }

    public final void A0T() {
        this.A07.A01(this.A09, AnonymousClass9QG.A00(), new C22131Ay9(this));
    }
}
