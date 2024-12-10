package X;

import com.whatsapp.util.Log;

/* renamed from: X.7LS  reason: invalid class name */
public final class AnonymousClass7LS implements AnonymousClass1O5 {
    public C126286cU A00;
    public final AnonymousClass11S A01;
    public final AnonymousClass11E A02;
    public final C18000vb A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass190 A05;
    public final AnonymousClass1KB A06;

    public void Bt9(C29621ca r7, String str) {
        C18070vi.A0d(r7, 1);
        Log.e("RequestBusinessActivityReportProtocolHelper/onError");
        int A002 = C60482o6.A00(r7);
        C126286cU r3 = this.A00;
        if (r3 != null) {
            this.A06.CGP(new AnonymousClass7RM((Object) r3, A002, 37));
        }
        this.A05.A0G("RequestBusinessActivityReportProtocolHelper/get business activity error", AnonymousClass001.A1I("error_code=", AnonymousClass000.A10(), A002), true);
    }

    public void C7Z(C29621ca r6, String str) {
        AnonymousClass1KB r2;
        Runnable r1;
        C18070vi.A0d(r6, 1);
        C29621ca A0K = r6.A0K("p2b");
        if (this.A00 != null) {
            if (A0K != null) {
                r2 = this.A06;
                r1 = new C146487Ph(this, A0K.A0D("timestamp", 0) * 1000, 21);
            } else {
                r2 = this.A06;
                r1 = new C146767Qn(this, 41);
            }
            r2.CGP(r1);
        }
    }

    public void BrD(String str) {
        Log.e("RequestBusinessActivityReportProtocolHelper/delivery-error");
        C126286cU r3 = this.A00;
        if (r3 != null) {
            this.A06.CGP(new C146767Qn(r3, 42));
        }
    }

    public AnonymousClass7LS(AnonymousClass190 r2, AnonymousClass1KB r3, AnonymousClass11S r4, AnonymousClass11E r5, C18000vb r6, AnonymousClass00H r7) {
        C18070vi.A0w(r3, r2, r4, r7, r6);
        C18070vi.A0d(r5, 6);
        this.A06 = r3;
        this.A05 = r2;
        this.A01 = r4;
        this.A04 = r7;
        this.A03 = r6;
        this.A02 = r5;
    }

    public /* synthetic */ C22384B5n CM9(String str) {
        return C20958AcC.A00;
    }
}
