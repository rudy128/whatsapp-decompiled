package X;

import android.content.Intent;
import android.os.Build;
import com.whatsapp.registration.verifyphone.RequestServerDrivenOtpCodeFullScreenFragment;
import com.whatsapp.util.Log;

/* renamed from: X.Ad6  reason: case insensitive filesystem */
public final class C21014Ad6 implements C22524BBh {
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public boolean A04;
    public long A05;
    public String A06;
    public final int A07;
    public final AnonymousClass190 A08;
    public final AnonymousClass1FY A09;
    public final C219217x A0A;
    public final C19830z4 A0B;
    public final C33841jT A0C;
    public final AnonymousClass1CM A0D;
    public final C120626Eo A0E;
    public final C192319oA A0F;
    public final String A0G;
    public final boolean A0H;
    public final AnonymousClass118 A0I;
    public final AnonymousClass1LU A0J;
    public final A5R A0K;

    public C21014Ad6(AnonymousClass190 r3, AnonymousClass1FY r4, AnonymousClass118 r5, C219217x r6, C19830z4 r7, AnonymousClass1LU r8, C33841jT r9, AnonymousClass1CM r10, C120626Eo r11, C192319oA r12, A5R a5r, int i, boolean z) {
        C18070vi.A0d(r5, 1);
        C18070vi.A0d(r8, 2);
        C72473Md.A1M(r9, r6, r7, 3);
        C108965cb.A1P(r10, 6, a5r);
        C18070vi.A0d(r3, 10);
        this.A0I = r5;
        this.A0J = r8;
        this.A0C = r9;
        this.A0A = r6;
        this.A0B = r7;
        this.A0D = r10;
        this.A0F = r12;
        this.A0K = a5r;
        this.A0E = r11;
        this.A08 = r3;
        this.A09 = r4;
        this.A07 = i;
        this.A0H = z;
        this.A01 = A5R.A00(a5r, "sms");
        this.A02 = A5R.A00(a5r, "voice");
        this.A03 = A5R.A00(a5r, "wa_old");
        this.A00 = A5R.A00(a5r, "email_otp");
        this.A05 = A5R.A00(a5r, "send_sms");
        this.A0G = C17880vN.A0r(C17890vO.A0B(r7), "pref_wa_old_device_name");
        r11.A03(r4, new AnonymousClass7AQ(this, 32));
    }

    public final void A05(String str) {
        C18070vi.A0d(str, 0);
        this.A06 = str;
        if (AnonymousClass8BR.A1U(str)) {
            C19830z4 r1 = this.A0B;
            r1.A1b("primary_eligible");
            C17880vN.A1F(AnonymousClass8BV.A06(r1.A00), "pref_prefer_sms_over_flash", true);
            A01(this);
        }
        C196889vo.A00(this.A0I, this.A0B, this);
    }

    public void CCW() {
        this.A04 = false;
        A00();
    }

    public void COI() {
        this.A04 = true;
        A00();
    }

    private final void A00() {
        AnonymousClass1FY r2;
        Intent intent;
        boolean z;
        long j;
        long j2;
        long j3;
        long j4;
        int i;
        int i2;
        String str;
        boolean z2;
        String str2 = this.A06;
        if (str2 != null) {
            switch (str2.hashCode()) {
                case -795576526:
                    if (AnonymousClass8BR.A1W(str2)) {
                        Log.i("DynamicBottomSheetNavigator/startDeviceSwitchingVerificationFlow");
                        i = 1;
                        C33841jT.A03(this.A0C, 15, true);
                        r2 = this.A09;
                        i2 = this.A07;
                        j4 = this.A01;
                        j3 = this.A02;
                        j2 = this.A03;
                        j = this.A00;
                        z = this.A04;
                        Boolean bool = C17970vW.A01;
                        z2 = this.A0H;
                        str = this.A0G;
                        break;
                    } else {
                        return;
                    }
                case 114009:
                    if (!AnonymousClass8BR.A1U(str2)) {
                        return;
                    }
                    if (this.A04 || this.A0A.A02("android.permission.RECEIVE_SMS") == 0) {
                        A03(this);
                        return;
                    }
                    AnonymousClass1FY r1 = this.A09;
                    C18070vi.A0z(r1, "null cannot be cast to non-null type com.whatsapp.DialogActivity");
                    A9B.A0R(r1, 1);
                    return;
                case 97513456:
                    if (AnonymousClass8BR.A1V(str2)) {
                        C219217x r3 = this.A0A;
                        if (!r3.A0C()) {
                            Log.i("DynamicBottomSheetNavigator/request-flash-call-permissions");
                            AnonymousClass74O.A0E(this.A09, r3, 2, true);
                            return;
                        }
                        A01(this);
                        A02(this);
                        return;
                    }
                    return;
                case 112386354:
                    if (str2.equals("voice")) {
                        Log.i("DynamicBottomSheetNavigator/verifyWithCall");
                        C33841jT.A03(this.A0C, 5, true);
                        r2 = this.A09;
                        intent = AnonymousClass1LU.A0M(r2, this.A01, this.A02, this.A04, this.A0H);
                        break;
                    } else {
                        return;
                    }
                case 1247787042:
                    if (str2.equals("send_sms")) {
                        Log.i("DynamicBottomSheetNavigator/startSendSmsToWaFlow");
                        this.A0E.A04(AnonymousClass2SS.A00(this.A09), 0);
                        return;
                    }
                    return;
                case 2120743944:
                    if (AnonymousClass8BR.A1X(str2)) {
                        Log.i("DynamicBottomSheetNavigator/startEmailOtpVerificationFlow");
                        C33841jT.A03(this.A0C, 17, true);
                        r2 = this.A09;
                        i2 = this.A07;
                        j4 = this.A01;
                        j3 = this.A02;
                        j2 = this.A03;
                        j = this.A00;
                        z = this.A04;
                        Boolean bool2 = C17970vW.A01;
                        z2 = this.A0H;
                        str = this.A0G;
                        i = 0;
                        break;
                    } else {
                        return;
                    }
                default:
                    return;
            }
            intent = AnonymousClass1LU.A1R(r2, str, i2, i, 0, j4, j3, j2, j, z, z2, false);
            r2.startActivity(intent);
            r2.finish();
        }
    }

    public static final void A01(C21014Ad6 ad6) {
        if (Build.VERSION.SDK_INT >= 28) {
            C19830z4 r0 = ad6.A0B;
            C219217x r4 = ad6.A0A;
            boolean A0B2 = r4.A0B();
            AnonymousClass00H r3 = r0.A00;
            C17880vN.A1C(AnonymousClass8BV.A06(r3), "pref_flash_call_manage_call_permission_granted", A0B2 ? 1 : 0);
            C17880vN.A1C(AnonymousClass8BV.A06(r3), "pref_flash_call_call_log_permission_granted", r4.A0A() ? 1 : 0);
        }
    }

    public static final void A02(C21014Ad6 ad6) {
        Log.i("DynamicBottomSheetNavigator/attempt-flash-call");
        C21014Ad6 ad62 = ad6;
        C33841jT.A03(ad62.A0C, 8, true);
        AnonymousClass1FY r4 = ad62.A09;
        int i = ad62.A07;
        long j = ad62.A01;
        long j2 = ad62.A02;
        boolean z = ad62.A04;
        boolean z2 = z;
        r4.startActivity(AnonymousClass1LU.A1W(r4, (String) null, ad62.A0G, i, 0, 0, j, j2, 0, 0, z2, false, ad62.A0H, true));
        r4.finish();
    }

    public final void A04() {
        RequestServerDrivenOtpCodeFullScreenFragment A002 = C181729Rp.A00(Long.valueOf(this.A01), C17890vO.A0L(), Long.valueOf(this.A02), Long.valueOf(this.A03), Long.valueOf(this.A00), Long.valueOf(this.A05), this.A0G, false);
        AnonymousClass1FY r3 = this.A09;
        r3.CMl(A002);
        r3.getSupportFragmentManager().A0t(new C20319AGb(this, 1), r3, "REQUEST_SERVER_DRIVEN_OTP_FRAGMENT_RESULT");
    }

    public static final void A03(C21014Ad6 ad6) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("DynamicBottomSheetNavigator/startverifysms/usesmsretriever=");
        C21014Ad6 ad62 = ad6;
        C17900vP.A0r(A10, ad62.A04);
        C33841jT.A03(ad62.A0C, 4, true);
        AnonymousClass1FY r12 = ad62.A09;
        long j = ad62.A01;
        long j2 = ad62.A02;
        long j3 = ad62.A03;
        long j4 = ad62.A00;
        boolean z = ad62.A04;
        boolean z2 = z;
        long j5 = j4;
        long j6 = j3;
        long j7 = j2;
        long j8 = j;
        r12.startActivity(AnonymousClass1LU.A1W(r12, (String) null, ad62.A0G, -1, 0, 0, j8, j7, j6, j5, z2, true, ad62.A0H, false));
        r12.finish();
    }
}
