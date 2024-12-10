package X;

import com.whatsapp.util.Log;

/* renamed from: X.7LR  reason: invalid class name */
public final class AnonymousClass7LR implements AnonymousClass1O5 {
    public C126296cV A00;
    public final AnonymousClass11S A01;
    public final AnonymousClass11E A02;
    public final AnonymousClass11P A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass190 A05;
    public final AnonymousClass1KB A06;

    public void Bt9(C29621ca r7, String str) {
        C18070vi.A0d(r7, 1);
        Log.e("GetBusinessActivityReportProtocolHelper/onError");
        int A002 = C60482o6.A00(r7);
        C126296cV r3 = this.A00;
        if (r3 != null) {
            this.A06.CGP(new AnonymousClass7RM((Object) r3, A002, 36));
        }
        this.A05.A0G("GetBusinessActivityReportProtocolHelper/get business activity error", AnonymousClass001.A1I("error_code=", AnonymousClass000.A10(), A002), true);
    }

    public void BrD(String str) {
        Log.e("GetBusinessActivityReportProtocolHelper/delivery-error");
    }

    public void C7Z(C29621ca r28, String str) {
        AnonymousClass1KB r5;
        Runnable r4;
        C29621ca r1 = r28;
        C18070vi.A0h(str, r1);
        C29621ca A0K = r1.A0K("p2b");
        if (A0K != null) {
            C29621ca A0K2 = A0K.A0K("report");
            if (A0K2 != null && this.A00 != null) {
                C29621ca A0K3 = A0K2.A0K("url");
                C29621ca A0K4 = A0K2.A0K("direct_path");
                C29621ca A0K5 = A0K2.A0K("file_name");
                C29621ca A0K6 = A0K2.A0K("file_length");
                C29621ca A0K7 = A0K2.A0K("media_key");
                C29621ca A0K8 = A0K2.A0K("file_sha256");
                C29621ca A0K9 = A0K2.A0K("file_enc_sha256");
                if (A0K3 == null || A0K5 == null || A0K6 == null || A0K8 == null || A0K9 == null || A0K7 == null || A0K4 == null) {
                    r5 = this.A06;
                    r4 = new C146767Qn(this, 39);
                } else {
                    long A042 = C20099A7c.A04(A0K6.A0M(), 0);
                    String A0M = A0K3.A0M();
                    String A0M2 = A0K4.A0M();
                    C17960vV.A07(A0M2);
                    String A0M3 = A0K5.A0M();
                    C17960vV.A07(A0M3);
                    String A0M4 = A0K7.A0M();
                    C17960vV.A07(A0M4);
                    String A0M5 = A0K8.A0M();
                    C17960vV.A07(A0M5);
                    String A0M6 = A0K9.A0M();
                    C17960vV.A07(A0M6);
                    C1417276s r14 = new C1417276s(A0M, A0M2, A0M3, A0M4, A0M5, A0M6, A042, A0K2.A0D("creation", 0) * 1000, A0K2.A0D("expiration", (AnonymousClass11P.A01(this.A03) + 2592000000L) / 1000) * 1000);
                    r5 = this.A06;
                    r4 = new C146527Pl(this, r14, 7);
                }
            } else if (this.A00 != null) {
                r5 = this.A06;
                r4 = new C146487Ph(this, A0K.A0D("timestamp", 0) * 1000, 20);
            } else {
                return;
            }
            r5.CGP(r4);
            return;
        }
        C126296cV r3 = this.A00;
        if (r3 != null) {
            this.A06.CGP(new C146767Qn(r3, 40));
        }
    }

    public AnonymousClass7LR(AnonymousClass190 r2, AnonymousClass1KB r3, AnonymousClass11S r4, AnonymousClass11E r5, AnonymousClass11P r6, AnonymousClass00H r7) {
        C18070vi.A0w(r6, r3, r2, r4, r7);
        C18070vi.A0d(r5, 6);
        this.A03 = r6;
        this.A06 = r3;
        this.A05 = r2;
        this.A01 = r4;
        this.A04 = r7;
        this.A02 = r5;
    }

    public /* synthetic */ C22384B5n CM9(String str) {
        return C20958AcC.A00;
    }
}
