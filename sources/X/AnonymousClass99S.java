package X;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.common.dextricks.StringTreeSet;
import com.whatsapp.registration.phonenumberentry.ChangeNumber;
import com.whatsapp.registration.phonenumberentry.RegisterPhone;
import com.whatsapp.registration.phonenumberentry.viewmodel.ExistViewModel;
import com.whatsapp.report.activity.banreport.BanReportViewModel;
import com.whatsapp.util.Log;

/* renamed from: X.99S  reason: invalid class name */
public abstract class AnonymousClass99S extends AnonymousClass99B {
    public C010105w A00;
    public C19880zA A01;
    public C19880zA A02;
    public C31361fR A03;
    public AnonymousClass1LA A04;
    public AnonymousClass194 A05;
    public C132216mP A06;
    public C40751vD A07;
    public AnonymousClass118 A08;
    public C27301Vn A09;
    public C219217x A0A;
    public C134036pu A0B;
    public AnonymousClass19F A0C;
    public AnonymousClass18K A0D;
    public C139576z4 A0E;
    public AnonymousClass1MB A0F;
    public AnonymousClass1LU A0G;
    public C196059uO A0H;
    public C33841jT A0I;
    public C26145Ct9 A0J;
    public C57352iw A0K;
    public C188129gv A0L;
    public ExistViewModel A0M;
    public BanReportViewModel A0N;
    public AnonymousClass1K3 A0O;
    public C36401np A0P;
    public AnonymousClass00H A0Q;
    public AnonymousClass00H A0R;
    public AnonymousClass00H A0S;
    public AnonymousClass00H A0T;
    public AnonymousClass00H A0U;
    public AnonymousClass00H A0V;
    public AnonymousClass00H A0W;
    public AnonymousClass00H A0X;

    public boolean A4l(C198819yx r2, String str, String str2) {
        return false;
    }

    public static long A1I(String str) {
        return (A9B.A02(str, 0) * 1000) + System.currentTimeMillis();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0202, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r12.A00, 4031) != false) goto L_0x0204;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A1J(X.C198819yx r18, X.AnonymousClass99S r19) {
        /*
            r12 = r19
            java.lang.String r0 = "EnterPhoneNumber/new-installation"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0z4 r1 = r12.A0A
            java.lang.String r0 = X.A9B.A00
            X.A9B.A0U(r1, r0)
            r0 = 15
            r12.A4h(r0)
            r12.A4e()
            r2 = r18
            X.C17960vV.A07(r2)
            com.whatsapp.registration.phonenumberentry.viewmodel.ExistViewModel r0 = r12.A0M
            boolean r1 = r2.A0X
            X.1DT r0 = r0.A0E
            X.AnonymousClass3MY.A1L(r0, r1)
            java.lang.String r5 = r2.A0P
            java.lang.String r9 = r2.A0Q
            java.lang.String r8 = r2.A0S
            java.lang.String r7 = r2.A0I
            java.lang.String r6 = r2.A0N
            java.util.ArrayList r4 = r2.A0V
            boolean r0 = r12 instanceof com.whatsapp.registration.phonenumberentry.RegisterPhone
            if (r0 == 0) goto L_0x0138
            com.whatsapp.registration.phonenumberentry.RegisterPhone r12 = (com.whatsapp.registration.phonenumberentry.RegisterPhone) r12
            r0 = 0
            long r0 = X.A9B.A02(r5, r0)
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r2
            long r2 = java.lang.System.currentTimeMillis()
            long r0 = r0 + r2
            r12.A06 = r0
            long r0 = A1I(r9)
            r12.A07 = r0
            long r0 = A1I(r8)
            r12.A08 = r0
            long r0 = A1I(r7)
            r12.A03 = r0
            long r0 = A1I(r6)
            r12.A05 = r0
            X.A5R r3 = r12.A0d
            java.lang.String r2 = "sms"
            long r0 = r12.A06
            r3.A07(r2, r0)
            X.A5R r3 = r12.A0d
            java.lang.String r2 = "voice"
            long r0 = r12.A07
            r3.A07(r2, r0)
            X.A5R r3 = r12.A0d
            java.lang.String r2 = "wa_old"
            long r0 = r12.A08
            r3.A07(r2, r0)
            X.A5R r3 = r12.A0d
            java.lang.String r2 = "email_otp"
            long r0 = r12.A03
            r3.A07(r2, r0)
            X.A5R r3 = r12.A0d
            java.lang.String r2 = "send_sms"
            long r0 = r12.A05
            r3.A07(r2, r0)
            X.0z4 r2 = r12.A0A
            java.lang.String r1 = com.whatsapp.registration.phonenumberentry.viewmodel.ExistViewModel.A04(r12)
            java.lang.String r0 = com.whatsapp.registration.phonenumberentry.viewmodel.ExistViewModel.A05(r12)
            r2.A1t(r1, r0)
            X.0z4 r0 = r12.A0A
            r0.A1y(r4)
            X.0zA r1 = r12.A0F
            boolean r0 = r1.A07()
            if (r0 == 0) goto L_0x00af
            r1.A03()
            java.lang.String r0 = "smbSaveBusinessNameForRegistration"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x00af:
            X.9uO r0 = r12.A0H
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x00c9
            X.00H r0 = r12.A0t
            X.9nK r0 = X.AnonymousClass8BX.A0J(r0)
            boolean r0 = r0.A01
            r4 = 0
            if (r0 == 0) goto L_0x00ca
            boolean r0 = r12.A0z
            if (r0 == 0) goto L_0x00ca
            r12.A0z = r4
            com.whatsapp.registration.phonenumberentry.RegisterPhone.A1A(r12)
        L_0x00c9:
            return
        L_0x00ca:
            com.whatsapp.registration.phonenumberentry.viewmodel.PasskeyLoginViewModel r2 = r12.A0b
            com.whatsapp.registration.phonenumberentry.viewmodel.ExistViewModel r0 = r12.A0M
            X.1DT r0 = r0.A0I
            java.lang.Object r6 = r0.A06()
            X.00H r5 = r2.A02
            X.A8V r1 = X.AnonymousClass8BR.A0q(r5)
            java.lang.String r0 = "passkey_eligibility_check"
            java.lang.String r7 = "enter_number"
            r1.A0G(r7, r0)
            X.00H r0 = r2.A03
            java.lang.Object r0 = r0.get()
            X.9on r0 = (X.C192679on) r0
            java.lang.Integer r3 = r0.A00()
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "PasskeyViewModel/isPasskeyEnabled/eligibility="
            r1.append(r0)
            java.lang.String r0 = X.AnonymousClass9R0.A00(r3)
            X.C17890vO.A1A(r1, r0)
            X.19D r2 = r2.A01
            r1 = 12438(0x3096, float:1.743E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 != 0) goto L_0x010f
            if (r6 == 0) goto L_0x010f
        L_0x010b:
            com.whatsapp.registration.phonenumberentry.RegisterPhone.A1D(r12)
            return
        L_0x010f:
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            if (r3 != r0) goto L_0x0128
            r0 = 17
            r12.A4h(r0)
            r12.A02 = r4
            com.whatsapp.registration.phonenumberentry.viewmodel.PasskeyLoginViewModel r1 = r12.A0b
            com.whatsapp.registration.phonenumberentry.viewmodel.ExistViewModel r0 = r12.A0M
            X.1DT r0 = r0.A0C
            java.lang.String r0 = X.C108945cZ.A1F(r0)
            r1.A0T(r12, r0)
            return
        L_0x0128:
            X.A8V r5 = X.AnonymousClass8BR.A0q(r5)
            java.lang.String r8 = "passkey_eligibility_check_failed"
            java.lang.String r9 = X.AnonymousClass9R0.A00(r3)
            r6 = 0
            r10 = r6
            X.A8V.A05(r5, r6, r7, r8, r9, r10)
            goto L_0x010b
        L_0x0138:
            com.whatsapp.registration.phonenumberentry.ChangeNumber r12 = (com.whatsapp.registration.phonenumberentry.ChangeNumber) r12
            X.10I r1 = r12.A05
            r0 = 17
            X.C21428Ajv.A00(r1, r12, r0)
            X.1Mn r0 = r12.A0C
            if (r0 == 0) goto L_0x026f
            r0.A00()
            X.17v r1 = r12.A0B
            if (r1 == 0) goto L_0x026c
            r0 = 14
            r2 = 0
            r1.A0F(r2, r0)
            X.11S r0 = r12.A02
            r0.A0F()
            r3 = 1
            r12.A0K = r3
            java.io.File r1 = r12.getFilesDir()
            java.lang.String r0 = "me"
            java.io.File r0 = X.C17880vN.A0e(r1, r0)
            r0.delete()
            X.1jT r11 = r12.A0I
            java.lang.String r10 = com.whatsapp.registration.phonenumberentry.viewmodel.ExistViewModel.A04(r12)
            java.lang.String r1 = com.whatsapp.registration.phonenumberentry.viewmodel.ExistViewModel.A05(r12)
            r0 = 0
            r11.A0D(r10, r1, r0)
            int r1 = com.whatsapp.registration.phonenumberentry.viewmodel.ExistViewModel.A00(r12)
            r10 = 1
            if (r1 == r3) goto L_0x0180
            r0 = 3
            if (r1 == r0) goto L_0x0180
            r10 = 0
        L_0x0180:
            X.1jT r1 = r12.A0I
            r0 = 4
            if (r10 == 0) goto L_0x0187
            r0 = 15
        L_0x0187:
            X.C33841jT.A03(r1, r0, r3)
            X.0z4 r0 = r12.A0A
            r0.A1y(r4)
            r0 = 0
            long r4 = X.A9B.A02(r5, r0)
            r0 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 * r0
            long r0 = java.lang.System.currentTimeMillis()
            long r4 = r4 + r0
            r12.A03 = r4
            long r0 = A1I(r9)
            r12.A04 = r0
            long r0 = A1I(r8)
            r12.A05 = r0
            long r0 = A1I(r7)
            r12.A01 = r0
            long r0 = A1I(r6)
            r12.A02 = r0
            X.A5R r5 = r12.A0G
            if (r5 == 0) goto L_0x0272
            java.lang.String r4 = "sms"
            long r0 = r12.A03
            r5.A07(r4, r0)
            X.A5R r5 = r12.A0G
            if (r5 == 0) goto L_0x0272
            java.lang.String r4 = "voice"
            long r0 = r12.A04
            r5.A07(r4, r0)
            X.A5R r5 = r12.A0G
            if (r5 == 0) goto L_0x0272
            java.lang.String r4 = "wa_old"
            long r0 = r12.A05
            r5.A07(r4, r0)
            X.A5R r5 = r12.A0G
            if (r5 == 0) goto L_0x0272
            java.lang.String r4 = "email_otp"
            long r0 = r12.A01
            r5.A07(r4, r0)
            X.A5R r5 = r12.A0G
            if (r5 == 0) goto L_0x0272
            java.lang.String r4 = "send_sms"
            long r0 = r12.A02
            r5.A07(r4, r0)
            com.whatsapp.registration.phonenumberentry.viewmodel.ExistViewModel r0 = r12.A0M
            X.1DT r0 = r0.A0I
            java.lang.Object r0 = r0.A06()
            if (r0 == 0) goto L_0x0208
            X.19D r4 = r12.A00
            r1 = 4031(0xfbf, float:5.649E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r4, r1)
            if (r0 == 0) goto L_0x0208
        L_0x0204:
            com.whatsapp.registration.phonenumberentry.ChangeNumber.A12(r12, r2)
            return
        L_0x0208:
            int r1 = com.whatsapp.registration.phonenumberentry.viewmodel.ExistViewModel.A00(r12)
            if (r1 == r3) goto L_0x0204
            r0 = 3
            if (r1 == r0) goto L_0x0204
            com.whatsapp.registration.phonenumberentry.viewmodel.ExistViewModel r0 = r12.A0M
            X.1DT r0 = r0.A09
            int r0 = X.AnonymousClass8BX.A01(r0)
            if (r0 == r3) goto L_0x0204
            X.11C r5 = r12.A08
            X.C18070vi.A0W(r5)
            X.19D r4 = r12.A00
            X.C18070vi.A0W(r4)
            X.9oA r1 = r12.A0F
            if (r1 == 0) goto L_0x0269
            com.whatsapp.registration.phonenumberentry.viewmodel.ExistViewModel r0 = r12.A0M
            X.1DT r0 = r0.A0A
            int r0 = X.AnonymousClass8BX.A01(r0)
            boolean r0 = X.C181699Rm.A00(r5, r4, r1, r0)
            if (r0 == 0) goto L_0x0251
            com.whatsapp.registration.phonenumberentry.viewmodel.ExistViewModel r0 = r12.A0M
            X.1DT r0 = r0.A0A
            int r13 = X.AnonymousClass8BX.A01(r0)
            long r14 = r12.A03
            long r0 = r12.A04
            r18 = r3
            r19 = r2
            r16 = r0
            android.content.Intent r0 = X.AnonymousClass1LU.A0H(r12, r13, r14, r16, r18, r19)
            r12.A3q(r0, r3)
            return
        L_0x0251:
            X.17x r1 = r12.A0A
            java.lang.String r0 = "android.permission.RECEIVE_SMS"
            int r0 = r1.A02(r0)
            if (r0 == 0) goto L_0x0204
            X.0z4 r1 = r12.A0A
            X.C18070vi.A0W(r1)
            X.118 r0 = r12.A08
            X.C18070vi.A0W(r0)
            X.C196889vo.A01(r0, r1, r12, r2)
            return
        L_0x0269:
            java.lang.String r0 = "serverDrivenOtpManager"
            goto L_0x0274
        L_0x026c:
            java.lang.String r0 = "messageHandler"
            goto L_0x0274
        L_0x026f:
            java.lang.String r0 = "sendMethods"
            goto L_0x0274
        L_0x0272:
            java.lang.String r0 = "verifyPhoneNumberPrefs"
        L_0x0274:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass99S.A1J(X.9yx, X.99S):void");
    }

    public static void A1K(AnonymousClass99S r12, int i) {
        AnonymousClass10I r8 = r12.A05;
        Context applicationContext = r12.getApplicationContext();
        AnonymousClass190 r2 = r12.A03;
        AnonymousClass11P r4 = r12.A05;
        AnonymousClass11S r3 = r12.A02;
        C19830z4 r5 = r12.A0A;
        String A0l = r5.A0l();
        String A0n = r12.A0A.A0n();
        A80.A04(applicationContext, r2, r3, r4, r5, (A98) r12.A0X.get(), r12.A0J, r8, A0l, A0n, i, false);
    }

    public void A4e() {
        if (this instanceof RegisterPhone) {
            RegisterPhone registerPhone = (RegisterPhone) this;
            registerPhone.A04 = AnonymousClass8BS.A01(registerPhone);
            return;
        }
        ((ChangeNumber) this).A0P.run();
    }

    public void A4f() {
        AnonymousClass4Yv.A01(this, 9);
    }

    public void A4h(int i) {
        if (this instanceof RegisterPhone) {
            RegisterPhone registerPhone = (RegisterPhone) this;
            AnonymousClass3MX.A1J(registerPhone.A0M.A0L, i);
            SharedPreferences.Editor A082 = AnonymousClass8BU.A08(registerPhone.A0V, "register_phone_prefs");
            A082.putInt("com.whatsapp.registration.RegisterPhone.verification_state", AnonymousClass8BX.A01(registerPhone.A0M.A0L));
            A082.apply();
        }
    }

    public void A4j(C188779hy r12, int i) {
        Log.i("EnterPhoneNumber/onRegisterEntrypointVerifiedForPasskey_Autoconf_SilentAuth");
        A1K(this, i);
        boolean z = r12.A0H;
        boolean z2 = r12.A0G;
        String A0l = this.A0A.A0l();
        String A0n = this.A0A.A0n();
        String str = r12.A08;
        boolean z3 = r12.A0F;
        C33841jT r3 = this.A0I;
        C19830z4 r1 = this.A0A;
        A80.A05(this.A01, r1, (C22881Do) this.A0V.get(), r3, (C20605ARp) null, A0l, A0n, str, z, z2, z3);
    }

    public void A4k(String str, String str2, String str3) {
        Log.i("EnterPhoneNumber/registrationHasBeenVerified");
        this.A0I.A0D(str, str2, str3);
        AnonymousClass10I r8 = this.A05;
        Context applicationContext = getApplicationContext();
        AnonymousClass190 r2 = this.A03;
        AnonymousClass11P r4 = this.A05;
        AnonymousClass11S r3 = this.A02;
        C19830z4 r5 = this.A0A;
        C26145Ct9 ct9 = this.A0J;
        A80.A04(applicationContext, r2, r3, r4, r5, (A98) this.A0X.get(), ct9, r8, str, str2, 0, false);
        C21428Ajv.A00(this.A05, this, 25);
    }

    public boolean A4m(String str, String str2, boolean z) {
        C62562rb A052;
        if (!AnonymousClass8BV.A1S(this.A0Q) || (A052 = C17880vN.A0I(this.A0Q).A05(str, str2)) == null) {
            return false;
        }
        C73203Rj A002 = AnonymousClass4a6.A00(this);
        A002.A0S(AnonymousClass1EG.A01(this, new Object[]{A9B.A0G(this.A00, str, str2)}, 2131894511));
        A002.A0g(this, new C20333AGp(A052, this, 0, z), 2131894512);
        A002.A0e(this, (C22851Dl) null, 2131898766);
        AnonymousClass3MY.A1G(A002);
        return true;
    }

    public Dialog onCreateDialog(int i) {
        ProgressDialog progressDialog;
        int i2;
        int i3 = i;
        if (i3 == 9) {
            String string = getString(2131894984);
            ProgressDialog progressDialog2 = new ProgressDialog(this);
            AnonymousClass8BX.A0x(progressDialog2, string);
            return progressDialog2;
        } else if (i3 == 22) {
            Log.w("EnterPhoneNumber/dialog/unrecoverable-error");
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("register-phone2 +");
            A10.append(ExistViewModel.A04(this));
            String A0y = AnonymousClass000.A0y(ExistViewModel.A05(this), A10);
            C73203Rj A002 = AnonymousClass4a6.A00(this);
            A002.A0D(2131895035);
            A002.A0Z(new A9U(4, A0y, this), 2131894985);
            A002.A0X(new C20152A9o(this, 19), 2131898766);
            return A002.create();
        } else if (i3 == 109) {
            AnonymousClass1LU r14 = this.A0G;
            AnonymousClass10I r1 = this.A05;
            return A9B.A07(this, this.A06, this.A07, this.A08, this.A0A, this.A0F, r14, (A98) this.A0X.get(), r1);
        } else if (i3 == 114) {
            AnonymousClass11P r142 = this.A05;
            C18030ve r2 = this.A0E;
            C40751vD r11 = this.A07;
            AnonymousClass18K r12 = this.A0D;
            AnonymousClass194 r10 = this.A05;
            return C137096uu.A00(this, this.A01, r10, r11, AnonymousClass3MW.A0a(this.A0T), this.A08, r142, this.A00, r2, r12);
        } else if (i3 != 609) {
            switch (i) {
                case 124:
                    return A9B.A08(this, this.A06, this.A00, this.A0F, (Runnable) null, ExistViewModel.A04(this), ExistViewModel.A05(this));
                case 125:
                    return A9B.A09(this, this.A06, this.A0F, ExistViewModel.A04(this), ExistViewModel.A05(this));
                case 126:
                    C132216mP r102 = this.A06;
                    C18000vb r112 = this.A00;
                    AnonymousClass1MB r122 = this.A0F;
                    String A042 = ExistViewModel.A04(this);
                    String A052 = ExistViewModel.A05(this);
                    return A9B.A06(this.A01, this, this.A05, r102, r112, r122, ExistViewModel.A03(this), (Runnable) null, A042, A052);
                case StringTreeSet.OFFSET_BASE_ENCODING:
                    progressDialog = new ProgressDialog(this);
                    i2 = 2131895038;
                    break;
                case 128:
                    return A9B.A0A(this, (Runnable) null, new C21428Ajv(this, 28), new C21428Ajv(this, 29));
                case 129:
                    progressDialog = new ProgressDialog(this);
                    i2 = 2131895059;
                    break;
                case 130:
                    C18000vb r4 = this.A00;
                    String A043 = ExistViewModel.A04(this);
                    String A053 = ExistViewModel.A05(this);
                    C21428Ajv ajv = new C21428Ajv(this, 27);
                    int A003 = C83884Ha.A00(ExistViewModel.A03(this).A04);
                    String A0G2 = A9B.A0G(r4, A043, A053);
                    StringBuilder A11 = AnonymousClass000.A11(A0G2);
                    A11.append("\n\n");
                    C17880vN.A1A(this, A11, A003);
                    SpannableString A0B2 = AnonymousClass8BY.A0B(A11, A0G2);
                    View inflate = LayoutInflater.from(this).inflate(2131626075, (ViewGroup) null);
                    C73203Rj A004 = AnonymousClass4a6.A00(this);
                    A004.A0S(A0B2);
                    A004.A0c(inflate);
                    A004.A0T(false);
                    TextView A0J2 = AnonymousClass3MW.A0J(inflate, 2131428581);
                    TextView A0J3 = AnonymousClass3MW.A0J(inflate, 2131428579);
                    TextView A0J4 = AnonymousClass3MW.A0J(inflate, 2131428580);
                    A0J2.setVisibility(0);
                    A0J2.setText(2131899286);
                    A0J3.setVisibility(0);
                    A0J3.setText(2131895062);
                    A0J4.setVisibility(0);
                    A0J4.setText(2131895060);
                    C90024dP.A00(A0J2, this, (Object) null, 29);
                    AnonymousClass3Ma.A1A(A0J3, this, 46);
                    AnonymousClass3Ma.A1F(A0J4, this, ajv, (Object) null, 38);
                    return A004.create();
                default:
                    return super.onCreateDialog(i3);
            }
            AnonymousClass8BX.A0w(progressDialog, this, i2);
            return progressDialog;
        } else {
            String string2 = getString(2131895065);
            ProgressDialog progressDialog3 = new ProgressDialog(this);
            AnonymousClass8BX.A0x(progressDialog3, string2);
            return progressDialog3;
        }
    }

    public void A4g() {
        if (!C17880vN.A1W(C72453Mb.A0M(this), "is_ita_broadcasted")) {
            if (C18020vd.A05(C18040vf.A02, this.A00, 5864)) {
                C55442fm r2 = (C55442fm) this.A0W.get();
                C21433Ak0.A00(r2.A04, r2, this, 24);
            }
        }
    }

    public void A4i(C188779hy r12, int i) {
        A1K(this, i);
        this.A0A.A1v(r12.A0E, r12.A0D, r12.A03, -1, -1, AnonymousClass8BS.A01(this));
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C72463Mc.A0t(this);
        this.A0K.A00(this);
        this.A0A.A1X((String) null);
        this.A0A.A1Y((String) null);
        this.A0A.A1b((String) null);
        this.A0A.A1e((String) null);
        this.A0A.A1j((String) null);
        this.A0A.A1g((String) null);
        this.A0A.A1h((String) null);
        this.A0A.A17(-1);
        this.A0A.A2E(false);
        C17880vN.A1F(C72453Mb.A0M(this).edit(), "pref_flash_call_education_screen_displayed", false);
        C17880vN.A1F(C72453Mb.A0M(this).edit(), "pref_prefer_sms_over_flash", false);
        this.A0H = new C196059uO(this, this.A0A);
        C24071It A0N2 = AnonymousClass3MW.A0N(this);
        this.A0M = (ExistViewModel) A0N2.A00(ExistViewModel.class);
        BanReportViewModel banReportViewModel = (BanReportViewModel) A0N2.A00(BanReportViewModel.class);
        this.A0N = banReportViewModel;
        AnonymousClass7AQ.A00(this, banReportViewModel.A01, 33);
        C20338AGu.A00(this, this.A0N.A02, 16);
        C20338AGu.A00(this, this.A0M.A01, 17);
        C20338AGu.A00(this, this.A0M.A00, 18);
    }

    public void onPause() {
        super.onPause();
        C196059uO r1 = this.A0H;
        r1.A00 = true;
        A9B.A0U(r1.A03, A9B.A00);
    }

    public void onResume() {
        super.onResume();
        this.A0H.A00();
    }
}
