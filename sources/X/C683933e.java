package X;

import com.whatsapp.util.Log;

/* renamed from: X.33e  reason: invalid class name and case insensitive filesystem */
public class C683933e implements C22510BAr {
    public final AnonymousClass9X7 A00;
    public final C27001Ui A01;
    public final AnonymousClass1U8 A02;
    public final C57732jY A03;
    public final C54562eL A04;
    public final /* synthetic */ C27001Ui A05;

    public C683933e(AnonymousClass9X7 r1, C27001Ui r2, C27001Ui r3, AnonymousClass1U8 r4, C57732jY r5, C54562eL r6) {
        this.A05 = r2;
        this.A04 = r6;
        this.A02 = r4;
        this.A01 = r3;
        this.A03 = r5;
        this.A00 = r1;
    }

    public void C1x(AnonymousClass1BI r9, String str, int i, long j) {
        C54562eL r1 = this.A04;
        r1.A01.A01(r9);
        r1.A02.A01(r9);
        int i2 = i;
        this.A01.A01(r9, i);
        int i3 = 6;
        if (i == 401) {
            i3 = 7;
        }
        AnonymousClass1U8 r2 = this.A02;
        int i4 = 2;
        if ("preview".equals(str)) {
            i4 = 1;
        }
        r2.A00((Double) null, Long.valueOf(System.currentTimeMillis() - j), i3, i4, i2);
    }

    public void C1y(C55782gM r3, long j) {
        C57732jY r1 = this.A03;
        if (r1 != null) {
            r1.A00(2);
        }
        this.A05.A04(r3, j);
        AnonymousClass9X7 r12 = this.A00;
        if (r12 != null) {
            Log.i("DialerProfilePictureLoader/syncFetchProfilePhoto/onPhotoReceived");
            r12.A00.resumeWith(r3);
        }
    }
}
