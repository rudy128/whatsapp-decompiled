package com.whatsapp.registration.phonenumberentry;

import X.A04;
import X.A29;
import X.A3H;
import X.A5R;
import X.A98;
import X.A9B;
import X.AGI;
import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass02n;
import X.AnonymousClass112;
import X.AnonymousClass129;
import X.AnonymousClass1CJ;
import X.AnonymousClass1Cd;
import X.AnonymousClass1D9;
import X.AnonymousClass1F9;
import X.AnonymousClass1K3;
import X.AnonymousClass1KB;
import X.AnonymousClass1KH;
import X.AnonymousClass1L7;
import X.AnonymousClass1LC;
import X.AnonymousClass1LU;
import X.AnonymousClass1MH;
import X.AnonymousClass1NW;
import X.AnonymousClass1Nb;
import X.AnonymousClass1QS;
import X.AnonymousClass1VJ;
import X.AnonymousClass2Df;
import X.AnonymousClass2SS;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass3NL;
import X.AnonymousClass48o;
import X.AnonymousClass4W1;
import X.AnonymousClass4Yv;
import X.AnonymousClass4a6;
import X.AnonymousClass5YK;
import X.AnonymousClass6XL;
import X.AnonymousClass74O;
import X.AnonymousClass7AQ;
import X.AnonymousClass8BR;
import X.AnonymousClass8BS;
import X.AnonymousClass8BT;
import X.AnonymousClass8BU;
import X.AnonymousClass8BV;
import X.AnonymousClass8BW;
import X.AnonymousClass8BX;
import X.AnonymousClass8nC;
import X.AnonymousClass99P;
import X.B0K;
import X.C010105w;
import X.C108945cZ;
import X.C108975cc;
import X.C108985cd;
import X.C110885hR;
import X.C136576u2;
import X.C139576z4;
import X.C1406772n;
import X.C146767Qn;
import X.C161168Cb;
import X.C166568d7;
import X.C166988f1;
import X.C17880vN;
import X.C17890vO;
import X.C17900vP;
import X.C17970vW;
import X.C18010vc;
import X.C18020vd;
import X.C18040vf;
import X.C18070vi;
import X.C181729Rp;
import X.C187799gO;
import X.C188129gv;
import X.C192319oA;
import X.C192779oy;
import X.C193299pr;
import X.C194109rB;
import X.C196059uO;
import X.C196889vo;
import X.C19740yt;
import X.C19830z4;
import X.C19880zA;
import X.C198819yx;
import X.C198979zE;
import X.C199199zb;
import X.C20056A5f;
import X.C20152A9o;
import X.C20160A9w;
import X.C20296AFe;
import X.C20319AGb;
import X.C20339AGv;
import X.C21039AdV;
import X.C21428Ajv;
import X.C21524AlX;
import X.C219017v;
import X.C22370B4z;
import X.C22524BBh;
import X.C25161Nd;
import X.C25171Ne;
import X.C27301Vn;
import X.C27361Vu;
import X.C27371Vv;
import X.C30391dr;
import X.C32291gx;
import X.C33641j9;
import X.C33841jT;
import X.C42171xk;
import X.C42771yi;
import X.C45712Be;
import X.C47942Ko;
import X.C63942tw;
import X.C64012u4;
import X.C72453Mb;
import X.C72463Mc;
import X.C73203Rj;
import X.C88364Zk;
import X.C90594eK;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.text.style.URLSpan;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaEditText;
import com.whatsapp.components.PhoneNumberEntry;
import com.whatsapp.registration.SelectPhoneNumberDialog;
import com.whatsapp.registration.phonenumberentry.viewmodel.ExistViewModel;
import com.whatsapp.registration.phonenumberentry.viewmodel.PasskeyLoginViewModel;
import com.whatsapp.registration.silentauth.VerifySilentAuthUseCase;
import com.whatsapp.registration.silentauth.VerifySilentAuthUseCase$requestSilentAuth$1;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;

public class RegisterPhone extends AnonymousClass99P implements C22524BBh, C22370B4z, AnonymousClass5YK {
    public static boolean A1D;
    public static boolean A1E;
    public int A00 = 30;
    public int A01;
    public int A02;
    public long A03 = 0;
    public long A04 = 0;
    public long A05 = 0;
    public long A06 = 0;
    public long A07 = 0;
    public long A08 = 0;
    public Dialog A09;
    public Dialog A0A;
    public Button A0B;
    public ScrollView A0C;
    public TextView A0D;
    public C19880zA A0E;
    public C19880zA A0F;
    public TextEmojiLabel A0G;
    public C47942Ko A0H;
    public AnonymousClass2Df A0I;
    public AnonymousClass1VJ A0J;
    public C25161Nd A0K;
    public AnonymousClass1L7 A0L;
    public C27301Vn A0M;
    public AnonymousClass1Cd A0N;
    public AnonymousClass1MH A0O;
    public AnonymousClass1KH A0P;
    public AnonymousClass1D9 A0Q;
    public AnonymousClass1LU A0R;
    public C219017v A0S;
    public C32291gx A0T;
    public AnonymousClass1QS A0U;
    public C18010vc A0V;
    public C192779oy A0W;
    public C33641j9 A0X;
    public C27371Vv A0Y;
    public C27361Vu A0Z;
    public RegisterPhoneViewModel A0a;
    public PasskeyLoginViewModel A0b;
    public C192319oA A0c;
    public A5R A0d;
    public AnonymousClass1Nb A0e;
    public AnonymousClass129 A0f;
    public C136576u2 A0g;
    public AnonymousClass00H A0h;
    public AnonymousClass00H A0i;
    public AnonymousClass00H A0j;
    public AnonymousClass00H A0k;
    public AnonymousClass00H A0l;
    public AnonymousClass00H A0m;
    public AnonymousClass00H A0n;
    public AnonymousClass00H A0o;
    public AnonymousClass00H A0p;
    public AnonymousClass00H A0q;
    public AnonymousClass00H A0r;
    public AnonymousClass00H A0s;
    public AnonymousClass00H A0t;
    public String A0u;
    public String A0v;
    public String A0w;
    public boolean A0x;
    public boolean A0y = false;
    public boolean A0z = false;
    public boolean A10;
    public boolean A11;
    public boolean A12 = true;
    public boolean A13 = false;
    public boolean A14;
    public boolean A15;
    public boolean A16 = false;
    public boolean A17 = false;
    public boolean A18;
    public final AnonymousClass02n A19;
    public final C193299pr A1A;
    public final C187799gO A1B = new Object();
    public final AnonymousClass02n A1C;

    private void A12() {
        String str;
        A4h(0);
        C33841jT.A03(this.A0I, 31, true);
        if (C18020vd.A05(C18040vf.A02, this.A00, 12006)) {
            str = C108945cZ.A1F(this.A0M.A0M);
        } else {
            str = null;
        }
        Intent A1b = AnonymousClass1LU.A1b(this, (String) null, str, 2, false);
        AnonymousClass8BT.A0e(this).A0I("account_transfer_eligibility_check", "pass");
        this.A1C.A02((C1406772n) null, A1b);
    }

    private void A13() {
        String A0k2 = this.A0A.A0k();
        if (A0k2 != null && A0k2.endsWith("gmail.com")) {
            if (C18020vd.A05(C18040vf.A02, this.A00, 11092)) {
                if (((AnonymousClass1NW) this.A0j.get()).A01()) {
                    C21428Ajv.A00(this.A05, this, 32);
                    return;
                }
                AnonymousClass74O.A0M(this, this.A0U, "verify_email_otp", new int[]{2131231834}, 702, 2131891993, 2131894380, 2131894307, false, true);
                return;
            }
        }
        if (this.A0M.A0a()) {
            Log.i("RegisterPhone/startEmailOtpVerificationFlow/auto_attempt_not_eligible/first dbs eligible");
            A11();
            return;
        }
        Log.i("RegisterPhone/startEmailOtpVerificationFlow/auto_attempt_not_eligible/open_email_otp_flow");
        A18(this);
    }

    public static void A1C(RegisterPhone registerPhone) {
        RegisterPhone registerPhone2 = registerPhone;
        registerPhone.A4h(0);
        registerPhone2.A3q(AnonymousClass1LU.A0H(registerPhone2, AnonymousClass8BX.A01(registerPhone.A0M.A0A), registerPhone.A06, registerPhone.A07, false, registerPhone.A0y), true);
    }

    public void A4n() {
        this.A0x = false;
        this.A00 = 30;
        if (this.A0D.getVisibility() == 0) {
            AlphaAnimation A0H2 = C108985cd.A0H();
            A0H2.setDuration(150);
            this.A0D.startAnimation(A0H2);
            A0H2.setAnimationListener(new C166568d7(this, 1));
            return;
        }
        this.A0D.setVisibility(8);
    }

    public void A4p() {
        A1D = false;
        String A082 = C17900vP.A08(this.A0L.A02.getText());
        String A083 = C17900vP.A08(this.A0L.A03.getText());
        if (A082 == null || A083 == null || A082.equals("") || A9B.A0E(this.A04, A083, A082, this.A0u) == null) {
            A4n();
        } else {
            new C161168Cb(this).start();
        }
    }

    public void COI() {
        this.A13 = true;
        A15();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 0) {
            if (i2 == -1) {
                if (this.A0E.A02(10789)) {
                    AnonymousClass8BT.A0e(this).A0I("choose_country", "continue");
                    AnonymousClass8BT.A0e(this).A0C("enter_number");
                }
                ((A29) this.A0m.get()).A02("choose_country", "continue");
                ((A29) this.A0m.get()).A01("enter_number");
                ExistViewModel existViewModel = this.A0M;
                existViewModel.A06.A0F(intent.getStringExtra("cc"));
                String stringExtra = intent.getStringExtra("iso");
                String stringExtra2 = intent.getStringExtra("country_name");
                this.A0L.A02.setText(ExistViewModel.A04(this));
                this.A0L.A04.setText(stringExtra2);
                this.A0L.A05.A03(stringExtra);
                SharedPreferences A052 = this.A0V.A05("register_phone_prefs");
                SharedPreferences.Editor edit = A052.edit();
                edit.putString("com.whatsapp.registration.RegisterPhone.input_country_code", ExistViewModel.A04(this));
                edit.putString("com.whatsapp.registration.RegisterPhone.country_code", ExistViewModel.A04(this));
                if (A052.getInt("com.whatsapp.registration.RegisterPhone.phone_number_position", -1) == -1) {
                    edit.putInt("com.whatsapp.registration.RegisterPhone.phone_number_position", Integer.MAX_VALUE);
                }
                edit.putInt("com.whatsapp.registration.RegisterPhone.country_code_position", -1);
                edit.apply();
            }
            this.A11 = false;
            return;
        }
        String str = "granted";
        if (i == 1) {
            StringBuilder A102 = AnonymousClass000.A10();
            A102.append("RegisterPhone/sms permission ");
            if (i2 != -1) {
                str = "denied";
            }
            C17890vO.A1A(A102, str);
        } else if (i == 3) {
            StringBuilder A103 = AnonymousClass000.A10();
            A103.append("RegisterPhone/sms permission, launch sms or voice activity ");
            if (i2 != -1) {
                str = "denied";
            }
            C17890vO.A1A(A103, str);
            A4h(0);
        } else if (i == 155) {
            if (i2 == -1) {
                this.A0u = C20056A5f.A01(this.A08, this.A08, this.A0A);
                A1E(this);
                return;
            }
            return;
        } else if (i == 702) {
            StringBuilder A104 = AnonymousClass000.A10();
            A104.append("RegisterPhone/activity-result/request-contact-permissions/");
            if (i2 != -1) {
                str = "denied";
            }
            C17890vO.A1A(A104, str);
            C17880vN.A1F(C72453Mb.A0M(this).edit(), "pref_has_seen_contact_primer_during_email_reg", true);
            if (i2 == -1) {
                C21428Ajv.A00(this.A05, this, 32);
                return;
            } else if (this.A0M.A0a()) {
                Log.i("RegisterPhone/activity-result/request-contact-permissions/failed/open_first_dbs");
                A11();
                return;
            } else {
                Log.i("RegisterPhone/activity-result/request-contact-permissions/failed/open_email_otp");
                A18(this);
                return;
            }
        } else {
            super.onActivityResult(i, i2, intent);
            return;
        }
        A15();
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x0079 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A10(com.whatsapp.registration.phonenumberentry.RegisterPhone r5, java.lang.String r6, java.lang.String r7, int r8) {
        /*
            X.17x r0 = r5.A0A
            boolean r0 = r0.A0I()
            if (r0 != 0) goto L_0x000b
            java.lang.String r0 = "7"
            return r0
        L_0x000b:
            X.1LA r1 = r5.A04
            java.lang.String r0 = r5.A0u
            java.lang.String r0 = X.A9B.A0E(r1, r7, r6, r0)
            r4 = 1
            boolean r3 = X.AnonymousClass000.A1W(r0)
            java.lang.String r1 = r5.A0u
            if (r1 == 0) goto L_0x002a
            boolean r0 = A1E
            if (r0 != 0) goto L_0x002d
            boolean r0 = A1D
            if (r0 != 0) goto L_0x002d
            if (r3 != 0) goto L_0x002d
            boolean r0 = r5.A14
            if (r0 != 0) goto L_0x002d
        L_0x002a:
            java.lang.String r0 = "6"
            return r0
        L_0x002d:
            java.lang.String r2 = "\\D"
            java.lang.String r0 = ""
            java.lang.String r1 = r1.replaceAll(r2, r0)
            java.lang.String r0 = r7.replaceAll(r2, r0)
            if (r3 != 0) goto L_0x0052
            int r0 = X.A9B.A00(r0, r1)
            if (r0 != 0) goto L_0x0052
        L_0x0041:
            r0 = 30
            if (r8 != r0) goto L_0x0062
            boolean r0 = r5.A10
            if (r0 == 0) goto L_0x005d
            boolean r0 = r5.A14
            if (r0 == 0) goto L_0x0054
            if (r4 == 0) goto L_0x007a
            java.lang.String r0 = "0"
            return r0
        L_0x0052:
            r4 = 0
            goto L_0x0041
        L_0x0054:
            if (r4 == 0) goto L_0x007a
            boolean r0 = A1E
            if (r0 == 0) goto L_0x007a
            java.lang.String r0 = "3"
            return r0
        L_0x005d:
            if (r3 == 0) goto L_0x0062
            java.lang.String r0 = "4"
            return r0
        L_0x0062:
            r0 = 31
            java.lang.String r2 = "2"
            java.lang.String r1 = "1"
            if (r8 != r0) goto L_0x006f
            boolean r0 = r5.A14
            if (r0 != 0) goto L_0x0079
        L_0x006e:
            return r2
        L_0x006f:
            r0 = 32
            if (r8 != r0) goto L_0x007a
            if (r4 != 0) goto L_0x007a
            boolean r0 = r5.A14
            if (r0 == 0) goto L_0x006e
        L_0x0079:
            return r1
        L_0x007a:
            java.lang.String r0 = "5"
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.phonenumberentry.RegisterPhone.A10(com.whatsapp.registration.phonenumberentry.RegisterPhone, java.lang.String, java.lang.String, int):java.lang.String");
    }

    private void A11() {
        CMl(C181729Rp.A00(Long.valueOf(this.A06), C17890vO.A0L(), Long.valueOf(this.A07), Long.valueOf(this.A08), Long.valueOf(this.A03), Long.valueOf(this.A05), C108945cZ.A1F(this.A0M.A0M), true));
        getSupportFragmentManager().A0t(new C20319AGb(this, 4), this, "REQUEST_SERVER_DRIVEN_OTP_FRAGMENT_RESULT");
    }

    private void A14() {
        C33841jT.A03(this.A0I, 23, true);
        if (C18020vd.A05(C18040vf.A02, this.A00, 9810)) {
            VerifySilentAuthUseCase verifySilentAuthUseCase = this.A0a.A04;
            AnonymousClass3MX.A1Q(new VerifySilentAuthUseCase$requestSilentAuth$1(new C194109rB(C199199zb.A00(this), "enter_number"), verifySilentAuthUseCase, (C30391dr) null), AnonymousClass2SS.A00(this));
            return;
        }
        int A012 = AnonymousClass8BX.A01(this.A0M.A0A);
        long j = this.A06;
        long j2 = this.A07;
        long j3 = this.A08;
        boolean z = this.A13;
        Boolean bool = C17970vW.A01;
        startActivity(AnonymousClass1LU.A1R(this, C108945cZ.A1F(this.A0M.A0M), A012, ExistViewModel.A00(this), AnonymousClass8BX.A01(this.A0M.A0K), j, j2, j3, -1, z, false, this.A0y));
        finish();
    }

    private void A15() {
        C33841jT.A03(this.A0I, 4, true);
        int A012 = AnonymousClass8BX.A01(this.A0M.A0A);
        long j = this.A06;
        long j2 = this.A07;
        long j3 = this.A08;
        long j4 = this.A03;
        boolean z = this.A13;
        Boolean bool = C17970vW.A01;
        startActivity(AnonymousClass1LU.A1R(this, C108945cZ.A1F(this.A0M.A0M), A012, ExistViewModel.A00(this), AnonymousClass8BX.A01(this.A0M.A0K), j, j2, j3, j4, z, false, this.A0y));
        finish();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x01f5, code lost:
        if (r10.A12 != false) goto L_0x02ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x02b8, code lost:
        if (r10.A12 != false) goto L_0x02ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x02ba, code lost:
        com.whatsapp.util.Log.i("RegisterPhone/continueToNextScreen/account_transfer");
        r10.A12();
     */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0243  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x025f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A16(com.whatsapp.registration.phonenumberentry.RegisterPhone r27) {
        /*
            java.lang.String r0 = "RegisterPhone/continueToNextScreen"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 21
            r10 = r27
            X.AnonymousClass4Yv.A00(r10, r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "RegisterPhone/continueToNextScreen/autoconf serverStartMessage is "
            r1.append(r0)
            com.whatsapp.registration.phonenumberentry.viewmodel.ExistViewModel r0 = r10.A0M
            X.1DT r0 = r0.A0I
            java.lang.Object r0 = r0.A06()
            if (r0 == 0) goto L_0x00ee
            java.lang.String r0 = "valid"
        L_0x0021:
            r1.append(r0)
            java.lang.String r0 = ", waOldEligible: "
            r1.append(r0)
            int r0 = com.whatsapp.registration.phonenumberentry.viewmodel.ExistViewModel.A00(r10)
            r1.append(r0)
            java.lang.String r0 = ", emailOtpEligible: "
            r1.append(r0)
            com.whatsapp.registration.phonenumberentry.viewmodel.ExistViewModel r0 = r10.A0M
            X.1DT r0 = r0.A09
            int r0 = X.AnonymousClass8BX.A01(r0)
            r1.append(r0)
            java.lang.String r0 = ", shouldStartBanAppealFlowForBlockedUser: "
            r1.append(r0)
            boolean r0 = r10.A18
            r1.append(r0)
            java.lang.String r0 = ", passkeyEligibility: "
            r1.append(r0)
            com.whatsapp.registration.phonenumberentry.viewmodel.PasskeyLoginViewModel r0 = r10.A0b
            X.00H r0 = r0.A03
            java.lang.Object r0 = r0.get()
            X.9on r0 = (X.C192679on) r0
            java.lang.Integer r0 = r0.A00()
            java.lang.String r0 = X.AnonymousClass9R0.A00(r0)
            r1.append(r0)
            java.lang.String r0 = ", flashType :"
            r1.append(r0)
            com.whatsapp.registration.phonenumberentry.viewmodel.ExistViewModel r0 = r10.A0M
            X.1DT r0 = r0.A0A
            int r0 = X.AnonymousClass8BX.A01(r0)
            r1.append(r0)
            java.lang.String r0 = ", AccountTransferEligible: "
            r1.append(r0)
            com.whatsapp.registration.phonenumberentry.viewmodel.ExistViewModel r0 = r10.A0M
            X.1DT r0 = r0.A03
            int r0 = X.AnonymousClass8BX.A01(r0)
            X.C17900vP.A0o(r1, r0)
            X.00H r0 = r10.A0q
            java.lang.Object r1 = r0.get()
            X.2n1 r1 = (X.C59872n1) r1
            X.2Qb r0 = X.C49332Qb.A02
            r1.A00(r0)
            r4 = 0
            r10.A4h(r4)
            com.whatsapp.registration.phonenumberentry.viewmodel.ExistViewModel r0 = r10.A0M
            X.1DT r0 = r0.A0I
            java.lang.Object r0 = r0.A06()
            if (r0 == 0) goto L_0x0131
            java.lang.String r0 = "RegisterPhone/continueToNextScreen/autoconf"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.A8V r2 = X.AnonymousClass8BT.A0e(r10)
            java.lang.String r1 = "autoconf_verification_step"
            java.lang.String r0 = "autoconf_verification_started"
            r2.A0F(r1, r0)
            com.whatsapp.registration.phonenumberentry.viewmodel.ExistViewModel r0 = r10.A0M
            X.1DT r0 = r0.A0I
            java.lang.String r11 = X.C108945cZ.A1F(r0)
            X.1jT r2 = r10.A0I
            r1 = 12
            r0 = 1
            X.C33841jT.A03(r2, r1, r0)
            X.19D r2 = r10.A00
            r1 = 9559(0x2557, float:1.3395E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x00f2
            com.whatsapp.registration.phonenumberentry.RegisterPhoneViewModel r0 = r10.A0a
            com.whatsapp.registration.autoconf.AutoconfUseCase r4 = r0.A00
            X.1pm r3 = X.AnonymousClass2SS.A00(r10)
            X.19D r1 = r10.A00
            X.0z4 r0 = r10.A0A
            X.99F r1 = X.A9B.A0B(r0, r1)
            X.99E r0 = X.C199199zb.A00(r10)
            X.9s2 r2 = new X.9s2
            r2.<init>(r1, r0, r11)
            r1 = 0
            com.whatsapp.registration.autoconf.AutoconfUseCase$requestAutoconfCode$1 r0 = new com.whatsapp.registration.autoconf.AutoconfUseCase$requestAutoconfCode$1
            r0.<init>(r2, r4, r1)
            X.AnonymousClass3MX.A1Q(r0, r3)
            return
        L_0x00ee:
            java.lang.String r0 = "null"
            goto L_0x0021
        L_0x00f2:
            com.whatsapp.registration.phonenumberentry.viewmodel.ExistViewModel r0 = r10.A0M
            X.1DT r0 = r0.A0A
            int r13 = X.AnonymousClass8BX.A01(r0)
            long r5 = r10.A06
            long r2 = r10.A07
            long r0 = r10.A08
            boolean r7 = r10.A13
            int r14 = com.whatsapp.registration.phonenumberentry.viewmodel.ExistViewModel.A00(r10)
            com.whatsapp.registration.phonenumberentry.viewmodel.ExistViewModel r8 = r10.A0M
            X.1DT r8 = r8.A0M
            java.lang.String r12 = X.C108945cZ.A1F(r8)
            com.whatsapp.registration.phonenumberentry.viewmodel.ExistViewModel r8 = r10.A0M
            X.1DT r8 = r8.A0K
            int r15 = X.AnonymousClass8BX.A01(r8)
            r22 = -1
            r26 = r4
            r27 = r4
            r18 = r2
            r20 = r0
            r24 = r7
            r25 = r4
            r16 = r5
            android.content.Intent r0 = X.AnonymousClass1LU.A1W(r10, r11, r12, r13, r14, r15, r16, r18, r20, r22, r24, r25, r26, r27)
            r10.startActivity(r0)
            r10.finish()
            return
        L_0x0131:
            X.00H r0 = r10.A0r
            r0.get()
            X.0z4 r0 = r10.A0A
            java.util.ArrayList r8 = r0.A0u()
            int r1 = com.whatsapp.registration.phonenumberentry.viewmodel.ExistViewModel.A00(r10)
            r7 = 1
            if (r1 == r7) goto L_0x0147
            r0 = 3
            if (r1 == r0) goto L_0x0147
            r7 = 0
        L_0x0147:
            com.whatsapp.registration.phonenumberentry.viewmodel.ExistViewModel r0 = r10.A0M
            X.1DT r0 = r0.A09
            int r1 = X.AnonymousClass8BX.A01(r0)
            java.lang.Boolean r0 = X.C17970vW.A01
            boolean r6 = X.C17890vO.A1R(r1)
            com.whatsapp.registration.phonenumberentry.viewmodel.ExistViewModel r0 = r10.A0M
            X.1DT r0 = r0.A0H
            int r0 = X.AnonymousClass8BX.A01(r0)
            boolean r5 = X.C17890vO.A1R(r0)
            X.11C r3 = r10.A08
            X.19D r2 = r10.A00
            X.9oA r1 = r10.A0c
            com.whatsapp.registration.phonenumberentry.viewmodel.ExistViewModel r0 = r10.A0M
            X.1DT r0 = r0.A0A
            int r0 = X.AnonymousClass8BX.A01(r0)
            boolean r0 = X.C181699Rm.A00(r3, r2, r1, r0)
            java.lang.Integer r3 = X.A04.A00(r8, r7, r6, r5, r0)
            X.9oA r0 = r10.A0c
            boolean r0 = r0.A01()
            java.lang.String r9 = "RegisterPhone/continueToNextScreen/account_transfer"
            java.lang.String r8 = "RegisterPhone/continueToNextScreen/device_switching"
            java.lang.String r7 = "RegisterPhone/continueToNextScreen/account_defence_flow"
            java.lang.String r2 = "RegisterPhone/continueToNextScreen/ban_appeal_flow"
            java.lang.String r1 = "RegisterPhone/continueToNextScreen/email_otp"
            r5 = 1
            if (r0 == 0) goto L_0x0200
            if (r3 == 0) goto L_0x0200
            int r6 = r3.intValue()
            r0 = 3
            if (r6 != r0) goto L_0x01af
            com.whatsapp.util.Log.i((java.lang.String) r1)
        L_0x0196:
            A1G(r10, r3)
        L_0x0199:
            X.0z4 r3 = r10.A0A
            X.19D r2 = r10.A00
            r1 = 11222(0x2bd6, float:1.5725E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r2 = X.C18020vd.A05(r0, r2, r1)
            android.content.SharedPreferences$Editor r1 = X.C19830z4.A00(r3)
            java.lang.String r0 = "reg_abprop_enable_topbar"
            X.C17880vN.A1F(r1, r0, r2)
            return
        L_0x01af:
            boolean r0 = r10.A18
            if (r0 != 0) goto L_0x026e
            com.whatsapp.registration.phonenumberentry.viewmodel.ExistViewModel r0 = r10.A0M
            X.1DT r0 = r0.A0J
            java.lang.Object r0 = r0.A06()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L_0x01c6
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x01c6
            goto L_0x0227
        L_0x01c6:
            com.whatsapp.registration.phonenumberentry.viewmodel.ExistViewModel r0 = r10.A0M
            boolean r0 = r0.A0a()
            if (r0 == 0) goto L_0x01d7
            java.lang.String r0 = "RegisterPhone/continueToNextScreen/open_dbs"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r10.A11()
            goto L_0x0199
        L_0x01d7:
            com.whatsapp.registration.phonenumberentry.viewmodel.ExistViewModel r0 = r10.A0M
            X.1DT r0 = r0.A03
            java.lang.Number r0 = X.C108945cZ.A1C(r0)
            if (r0 == 0) goto L_0x01f9
            int r0 = r0.intValue()
            if (r0 != r5) goto L_0x01f9
            X.19D r2 = r10.A00
            r1 = 11505(0x2cf1, float:1.6122E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x01f9
            boolean r0 = r10.A12
            if (r0 == 0) goto L_0x01f9
            goto L_0x02ba
        L_0x01f9:
            r0 = 2
            if (r6 != r0) goto L_0x0301
            com.whatsapp.util.Log.i((java.lang.String) r8)
            goto L_0x0196
        L_0x0200:
            com.whatsapp.registration.phonenumberentry.viewmodel.ExistViewModel r0 = r10.A0M
            X.1DT r0 = r0.A09
            int r0 = X.AnonymousClass8BX.A01(r0)
            if (r0 != r5) goto L_0x0211
            com.whatsapp.util.Log.i((java.lang.String) r1)
            r10.A13()
            goto L_0x0199
        L_0x0211:
            boolean r0 = r10.A18
            if (r0 != 0) goto L_0x026e
            com.whatsapp.registration.phonenumberentry.viewmodel.ExistViewModel r0 = r10.A0M
            X.1DT r0 = r0.A0J
            java.lang.Object r0 = r0.A06()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L_0x029a
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x029a
        L_0x0227:
            com.whatsapp.util.Log.i((java.lang.String) r7)
            X.0z4 r2 = r10.A0A
            java.lang.String r1 = com.whatsapp.registration.phonenumberentry.viewmodel.ExistViewModel.A04(r10)
            java.lang.String r0 = com.whatsapp.registration.phonenumberentry.viewmodel.ExistViewModel.A05(r10)
            r2.A1t(r1, r0)
            com.whatsapp.registration.phonenumberentry.viewmodel.ExistViewModel r0 = r10.A0M
            X.1DT r0 = r0.A02
            int r0 = X.AnonymousClass8BX.A01(r0)
            X.1jT r1 = r10.A0I
            if (r0 != r5) goto L_0x025f
            r0 = 14
            X.C33841jT.A03(r1, r0, r5)
            long r5 = r10.A06
            long r1 = r10.A07
            boolean r0 = r10.A13
            r11 = r5
            r13 = r1
            r15 = r4
            r16 = r0
            android.content.Intent r0 = X.AnonymousClass1LU.A0L(r10, r11, r13, r15, r16)
        L_0x0257:
            r10.startActivity(r0)
            r10.finish()
            goto L_0x0199
        L_0x025f:
            r0 = 13
            X.C33841jT.A03(r1, r0, r5)
            long r2 = r10.A06
            long r0 = r10.A07
            boolean r5 = r10.A13
            r17 = 0
            r12 = 1
            goto L_0x028e
        L_0x026e:
            com.whatsapp.util.Log.i((java.lang.String) r2)
            X.0z4 r2 = r10.A0A
            java.lang.String r1 = com.whatsapp.registration.phonenumberentry.viewmodel.ExistViewModel.A04(r10)
            java.lang.String r0 = com.whatsapp.registration.phonenumberentry.viewmodel.ExistViewModel.A05(r10)
            r2.A1t(r1, r0)
            X.1jT r1 = r10.A0I
            r0 = 9
            X.C33841jT.A03(r1, r0, r5)
            long r2 = r10.A06
            long r0 = r10.A07
            boolean r5 = r10.A13
            r12 = 3
            r17 = 0
        L_0x028e:
            r19 = r4
            r11 = r4
            r13 = r2
            r15 = r0
            r20 = r5
            android.content.Intent r0 = X.AnonymousClass1LU.A0G(r10, r11, r12, r13, r15, r17, r19, r20)
            goto L_0x0257
        L_0x029a:
            com.whatsapp.registration.phonenumberentry.viewmodel.ExistViewModel r0 = r10.A0M
            X.1DT r0 = r0.A03
            java.lang.Number r0 = X.C108945cZ.A1C(r0)
            if (r0 == 0) goto L_0x02c2
            int r0 = r0.intValue()
            if (r0 != r5) goto L_0x02c2
            X.19D r2 = r10.A00
            r1 = 11505(0x2cf1, float:1.6122E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x02c2
            boolean r0 = r10.A12
            if (r0 == 0) goto L_0x02c2
        L_0x02ba:
            com.whatsapp.util.Log.i((java.lang.String) r9)
            r10.A12()
            goto L_0x0199
        L_0x02c2:
            int r1 = com.whatsapp.registration.phonenumberentry.viewmodel.ExistViewModel.A00(r10)
            if (r1 == r5) goto L_0x0320
            r0 = 3
            if (r1 == r0) goto L_0x0320
            com.whatsapp.registration.phonenumberentry.viewmodel.ExistViewModel r0 = r10.A0M
            X.1DT r0 = r0.A0K
            int r0 = X.AnonymousClass8BX.A01(r0)
            if (r0 == r5) goto L_0x0310
            X.11C r3 = r10.A08
            X.19D r2 = r10.A00
            X.9oA r1 = r10.A0c
            com.whatsapp.registration.phonenumberentry.viewmodel.ExistViewModel r0 = r10.A0M
            X.1DT r0 = r0.A0A
            int r0 = X.AnonymousClass8BX.A01(r0)
            boolean r0 = X.C181699Rm.A00(r3, r2, r1, r0)
            if (r0 == 0) goto L_0x02f3
            java.lang.String r0 = "RegisterPhone/continueToNextScreen/flash_call"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            A1C(r10)
            goto L_0x0199
        L_0x02f3:
            java.lang.String r0 = "RegisterPhone/continueToNextScreen/sms_or_voice"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0z4 r1 = r10.A0A
            X.118 r0 = r10.A08
            X.C196889vo.A00(r0, r1, r10)
            goto L_0x0199
        L_0x0301:
            com.whatsapp.registration.phonenumberentry.viewmodel.ExistViewModel r0 = r10.A0M
            X.1DT r0 = r0.A0K
            int r0 = X.AnonymousClass8BX.A01(r0)
            if (r0 != r5) goto L_0x0315
            java.lang.String r0 = "RegisterPhone/continueToNextScreen/silent_auth"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0310:
            r10.A14()
            goto L_0x0199
        L_0x0315:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "RegisterPhone/continueToNextScreen/firstEligibleRegMethodFromList: "
            X.C17900vP.A0Y(r3, r0, r1)
            goto L_0x0196
        L_0x0320:
            com.whatsapp.util.Log.i((java.lang.String) r8)
            X.1jT r1 = r10.A0I
            r0 = 15
            X.C166988f1.A0c(r10, r1, r10, r0)
            goto L_0x0199
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.phonenumberentry.RegisterPhone.A16(com.whatsapp.registration.phonenumberentry.RegisterPhone):void");
    }

    public static void A18(RegisterPhone registerPhone) {
        C166988f1.A0c(registerPhone, registerPhone.A0I, registerPhone, 17);
    }

    public static void A1A(RegisterPhone registerPhone) {
        C21428Ajv.A00(registerPhone.A05, registerPhone, 36);
        if (ExistViewModel.A00(registerPhone) == 2) {
            Log.i("RegisterPhone/retryExistCall");
            long A0E2 = (((long) (registerPhone.A00.A0E(3186) * 1000.0f)) + registerPhone.A04) - AnonymousClass8BS.A01(registerPhone);
            C17900vP.A0m("RegisterPhone/retryExistCall/check device switching eligibility again, delay: ", AnonymousClass000.A10(), A0E2);
            ExistViewModel existViewModel = registerPhone.A0M;
            existViewModel.A0X(registerPhone.A1B, A10(registerPhone, C108945cZ.A1F(existViewModel.A06), ExistViewModel.A05(registerPhone), registerPhone.A00), A0E2, true);
            registerPhone.A4f();
            return;
        }
        if (registerPhone.A0A.A0E() == 0) {
            String string = C72453Mb.A0M(registerPhone).getString("saved_user_before_logout", (String) null);
            StringBuilder A102 = AnonymousClass000.A10();
            A102.append(registerPhone.A0A.A0l());
            String A0y2 = AnonymousClass000.A0y(registerPhone.A0A.A0n(), A102);
            if (!TextUtils.isEmpty(string) && !string.equals(A0y2)) {
                if (C18020vd.A05(C18040vf.A02, registerPhone.A00, 10370)) {
                    String string2 = registerPhone.getString(2131891822);
                    C73203Rj A002 = AnonymousClass4a6.A00(registerPhone);
                    View inflate = View.inflate(registerPhone, 2131625913, (ViewGroup) null);
                    TextView A0J2 = AnonymousClass3MW.A0J(inflate, 2131429984);
                    A0J2.setText(registerPhone.A0P.A05(registerPhone.A08.A00, new C21428Ajv(registerPhone, 35), string2, "learn-more"));
                    AnonymousClass3Ma.A1I(A0J2, registerPhone.A0E);
                    AnonymousClass3MZ.A1Q(A0J2, registerPhone.A08);
                    A002.setView(inflate);
                    A002.A0E(2131891823);
                    A002.A0T(false);
                    A002.setNegativeButton(2131886487, new C20152A9o(registerPhone, 20));
                    A002.setPositiveButton(2131898874, new C20152A9o(registerPhone, 22));
                    C010105w create = A002.create();
                    create.setOnDismissListener(C20160A9w.A00(registerPhone, 34));
                    registerPhone.A09 = create;
                    create.show();
                    return;
                }
            }
        } else {
            Log.e("RegisterPhoneNumber of inactive accounts found not 0");
        }
        A16(registerPhone);
    }

    public static void A1B(RegisterPhone registerPhone) {
        Log.i("RegisterPhone/reset-state");
        registerPhone.A18 = false;
        registerPhone.A4h(7);
        A9B.A0U(registerPhone.A0A, "");
        registerPhone.A0M.A0F.A0F(0L);
        registerPhone.A0A.A1c((String) null);
        registerPhone.A0I.A0D((String) null, (String) null, (String) null);
        C33841jT.A03(registerPhone.A0I, 0, true);
    }

    public static void A1E(RegisterPhone registerPhone) {
        AnonymousClass1KB r1;
        int i;
        Log.i("RegisterPhone/whats-my-number/permission-granted");
        C187799gO r5 = registerPhone.A1B;
        r5.A01 = C17880vN.A0h();
        TelephonyManager A0K2 = registerPhone.A08.A0K();
        boolean z = false;
        if (A0K2 != null) {
            z = C108975cc.A1B(A0K2.getSimState());
        }
        if (z) {
            Log.i("RegisterPhone/whats-my-number/no-sim");
            r5.A04 = -1;
            r1 = registerPhone.A05;
            i = 2131892965;
        } else {
            ArrayList A032 = C20056A5f.A03((C42771yi) registerPhone.A0l.get(), registerPhone.A08, registerPhone.A0A);
            int size = A032.size();
            ArrayList A052 = C63942tw.A05(registerPhone.A04, A032);
            int size2 = A052.size();
            r5.A03 = Integer.valueOf(AnonymousClass000.A1S(size, size2) ? 1 : 0);
            r5.A04 = Integer.valueOf(size2);
            if (size2 == 0) {
                Log.i("RegisterPhone/whats-my-number/unable-to-get-phone-number-from-sim");
                r1 = registerPhone.A05;
                i = 2131892955;
            } else {
                Log.i("RegisterPhone/whats-my-number/show-select-phone-number-dialog");
                registerPhone.A09.A01(registerPhone.A0L.A03);
                SelectPhoneNumberDialog selectPhoneNumberDialog = new SelectPhoneNumberDialog();
                Bundle A0D2 = C17880vN.A0D();
                A0D2.putParcelableArrayList("deviceSimInfoList", C17880vN.A10(A052));
                selectPhoneNumberDialog.A1R(A0D2);
                registerPhone.CMk(selectPhoneNumberDialog, (String) null);
                return;
            }
        }
        r1.A08(i, 1);
    }

    public static void A1F(RegisterPhone registerPhone) {
        Integer A012 = ((A04) registerPhone.A0r.get()).A01(ExistViewModel.A00(registerPhone), AnonymousClass8BX.A01(registerPhone.A0M.A0K), AnonymousClass8BX.A01(registerPhone.A0M.A0A));
        if (A012 != null && A012.intValue() == 3) {
            registerPhone.A13();
        } else if (registerPhone.A0M.A0a()) {
            Log.i("RegisterPhone/transitionToFallbackMethod/auto_attempt_not_eligible/first dbs eligible");
            registerPhone.A11();
        } else {
            A1G(registerPhone, A012);
        }
    }

    public static void A1G(RegisterPhone registerPhone, Integer num) {
        if (num != null) {
            int intValue = num.intValue();
            if (intValue == 2) {
                registerPhone.A4h(0);
                C166988f1.A0c(registerPhone, registerPhone.A0I, registerPhone, 15);
            } else if (intValue == 3) {
                registerPhone.A4h(0);
                registerPhone.A13();
            } else if (intValue == 4) {
                registerPhone.A4h(0);
                A1C(registerPhone);
            } else if (intValue == 9) {
                registerPhone.A4h(0);
                registerPhone.A14();
            } else if (intValue != 11) {
                C196889vo.A00(registerPhone.A08, registerPhone.A0A, registerPhone);
            } else {
                registerPhone.A4h(0);
                registerPhone.A0a.A03.A04(AnonymousClass2SS.A00(registerPhone), 0);
            }
        }
    }

    public void A4o() {
        int i;
        if (C18020vd.A05(C18040vf.A02, this.A00, 10278)) {
            i = 611;
        } else {
            i = 609;
        }
        AnonymousClass4Yv.A00(this, i);
    }

    public SharedPreferences getPreferences(int i) {
        return this.A0V.A05("register_phone_prefs");
    }

    public void onBackPressed() {
        if (this.A16) {
            Log.i("RegisterPhone/onBackPressed/is adding new account");
            A9B.A0S(this, this.A0Q);
        } else if (this.A0E.A02(11568)) {
            A29 a29 = (A29) this.A0m.get();
            if (C72453Mb.A1a(a29.A04)) {
                A29.A00(a29, "enter_number", "back", AnonymousClass000.A0y("_back_click", AnonymousClass000.A11("enter_number")));
            }
            AnonymousClass8BX.A0v(this, this.A0I);
        } else {
            super.onBackPressed();
        }
    }

    /* JADX WARNING: type inference failed for: r2v15, types: [java.lang.Object, X.9gv] */
    public void onCreate(Bundle bundle) {
        int i;
        Bundle bundle2 = bundle;
        super.onCreate(bundle2);
        Boolean bool = C17970vW.A01;
        this.A05.CGF(new C146767Qn(this, 0));
        setContentView(2131626707);
        AnonymousClass6XL.A00(getApplicationContext(), this.A0A, this.A05);
        this.A0u = C20056A5f.A01(this.A08, this.A08, this.A0A);
        if (bundle != null) {
            this.A18 = bundle2.getBoolean("shouldStartBanAppealForBlockedUser");
        }
        int A022 = AnonymousClass8BU.A02(this);
        if (A022 != 1) {
            if (A022 == 31) {
                Log.i("RegisterPhone/resuming account transfer flow");
            } else {
                Log.e("RegisterPhone/create/wrong-state bounce to main");
                startActivity(AnonymousClass1LU.A0A(this));
                finish();
                return;
            }
        }
        PasskeyLoginViewModel passkeyLoginViewModel = (PasskeyLoginViewModel) AnonymousClass3MW.A0N(this).A00(PasskeyLoginViewModel.class);
        this.A0b = passkeyLoginViewModel;
        C20339AGv.A00(this, passkeyLoginViewModel.A00, new B0K(new C21039AdV(this, 0)), 49);
        RegisterPhoneViewModel registerPhoneViewModel = (RegisterPhoneViewModel) AnonymousClass3MW.A0N(this).A00(RegisterPhoneViewModel.class);
        this.A0a = registerPhoneViewModel;
        C166988f1.A0d(this, registerPhoneViewModel.A02, 20);
        C166988f1.A0d(this, this.A0a.A00, 21);
        C166988f1.A0d(this, this.A0a.A04, 19);
        C166988f1.A0d(this, this.A0a.A01, 22);
        this.A0a.A03.A03(this, new AnonymousClass7AQ(this, 34));
        this.A16 = C17880vN.A0I(this.A0Q).A0J(this.A03.A02());
        A9B.A0Q(this.A00, this, 2131436246, false, this.A0E.A02(11568), this.A16);
        TextView A0L2 = AnonymousClass3MX.A0L(this, 2131434453);
        A0L2.setText(2131895001);
        if (this.A0E.A02(5920)) {
            C72463Mc.A0y(this, A0L2, 2130971949, 2131103049);
        }
        Intent intent = getIntent();
        if (intent.getExtras() != null) {
            if (intent.getBooleanExtra("com.whatsapp.registration.RegisterPhone.show_underage_account_ban_dialog", false)) {
                AnonymousClass4Yv.A01(this, 125);
            }
            if (intent.getBooleanExtra("com.whatsapp.registration.RegisterPhone.resetstate", false)) {
                A1B(this);
            }
            this.A15 = intent.getBooleanExtra("com.whatsapp.registration.RegisterPhone.clear_phone_number", false);
            if (intent.getBooleanExtra("com.whatsapp.registration.RegisterPhone.show_wfs_error_snack_bar", false)) {
                this.A05.A0J(new C21428Ajv(new C90594eK(this.A00, (AnonymousClass1F9) this, this.A08, Collections.emptyList(), 2131898564, 2000, false), 38));
            }
            if (!(intent.getStringExtra("com.whatsapp.registration.RegisterPhone.country_code") == null || intent.getStringExtra("com.whatsapp.registration.RegisterPhone.phone_number") == null)) {
                C17880vN.A1E(AnonymousClass8BU.A08(this.A0V, "register_phone_prefs").putString("com.whatsapp.registration.RegisterPhone.input_phone_number", intent.getStringExtra("com.whatsapp.registration.RegisterPhone.phone_number")), "com.whatsapp.registration.RegisterPhone.input_country_code", intent.getStringExtra("com.whatsapp.registration.RegisterPhone.country_code"));
            }
            if (intent.getBooleanExtra("com.whatsapp.registration.RegisterPhone.tapped_sms_link", false)) {
                Log.i("RegisterPhone/link/instructions/dialog");
                BhR(AnonymousClass8BV.A0q(this, new Object[1], 2131899286, 0, 2131895029));
            }
            if (intent.getBooleanExtra("should_show_dbs_on_back_pressed", false)) {
                CMl(C181729Rp.A00(Long.valueOf(intent.getLongExtra("dbs_sms_wait_time", 0)), Long.valueOf(intent.getLongExtra("dbs_flash_wait_time", 0)), Long.valueOf(intent.getLongExtra("dbs_voice_wait_time", 0)), Long.valueOf(intent.getLongExtra("dbs_wa_old_wait_time", 0)), Long.valueOf(intent.getLongExtra("dbs_email_otp_wait_time", 0)), Long.valueOf(intent.getLongExtra("dbs_send_sms_wait_time", 0)), C108945cZ.A1F(this.A0M.A0M), true));
                getSupportFragmentManager().A0t(new C20319AGb(this, 4), this, "REQUEST_SERVER_DRIVEN_OTP_FRAGMENT_RESULT");
            }
        } else {
            this.A15 = false;
        }
        ? obj = new Object();
        this.A0L = obj;
        obj.A05 = (PhoneNumberEntry) findViewById(2131434458);
        C188129gv r9 = this.A0L;
        PhoneNumberEntry phoneNumberEntry = r9.A05;
        phoneNumberEntry.A03 = new AnonymousClass8nC(this, 2);
        r9.A02 = phoneNumberEntry.A01;
        r9.A04 = AnonymousClass3MX.A0L(this, 2131434455);
        this.A0L.A04.setBackground(AnonymousClass3NL.A00(this, this.A00, 2131230962));
        C188129gv r5 = this.A0L;
        WaEditText waEditText = r5.A05.A02;
        r5.A03 = waEditText;
        waEditText.setTextDirection(3);
        if (AnonymousClass3MW.A1Z(this.A00)) {
            this.A0L.A05.setPadding(getResources().getDimensionPixelSize(2131165753), this.A0L.A05.getPaddingTop(), this.A0L.A05.getPaddingRight(), this.A0L.A05.getPaddingBottom());
        }
        this.A0C = (ScrollView) findViewById(2131434837);
        TextEmojiLabel A0H2 = AnonymousClass8BR.A0H(this, 2131434459);
        this.A0G = A0H2;
        AnonymousClass3Ma.A1L(this.A0E, A0H2);
        AnonymousClass3Ma.A1K(this.A0G, this.A08);
        TextEmojiLabel textEmojiLabel = this.A0G;
        AnonymousClass1LC r13 = this.A03;
        String string = getString(2131896959);
        C193299pr r20 = this.A1A;
        SpannableStringBuilder A092 = AnonymousClass3MW.A09(Html.fromHtml(string));
        URLSpan[] uRLSpanArr = (URLSpan[]) A092.getSpans(0, string.length(), URLSpan.class);
        if (uRLSpanArr != null) {
            for (URLSpan uRLSpan : uRLSpanArr) {
                A092.setSpan(new C45712Be(this, this, r13.A00, r13.A01, r20, r13, r13.A02, uRLSpan.getURL()), A092.getSpanStart(uRLSpan), A092.getSpanEnd(uRLSpan), A092.getSpanFlags(uRLSpan));
            }
            for (URLSpan removeSpan : uRLSpanArr) {
                A092.removeSpan(removeSpan);
            }
        }
        textEmojiLabel.setText(A092);
        this.A0G.setVisibility(8);
        TextView A0L3 = AnonymousClass3MX.A0L(this, 2131432765);
        this.A0D = A0L3;
        A0L3.setVisibility(8);
        if (this.A0V.A05("register_phone_prefs").getString("com.whatsapp.registration.RegisterPhone.input_country_code", (String) null) == null) {
            TelephonyManager A0K2 = this.A08.A0K();
            if (A0K2 == null) {
                Log.w("RegisterPhone/tm=null");
            } else {
                Charset charset = AnonymousClass1K3.A06;
                String simCountryIso = A0K2.getSimCountryIso();
                if (simCountryIso != null) {
                    try {
                        String A062 = this.A04.A06(simCountryIso);
                        if (A062 != null) {
                            SharedPreferences.Editor A082 = AnonymousClass8BU.A08(this.A0V, "register_phone_prefs");
                            A082.putString("com.whatsapp.registration.RegisterPhone.input_country_code", A062);
                            A082.apply();
                        }
                    } catch (IOException e) {
                        C108985cd.A1M(" failed to lookupCallingCode from CountryPhoneInfo", AnonymousClass8BW.A0o("RegisterPhone/iso: ", simCountryIso), e);
                    }
                }
            }
        }
        AnonymousClass48o.A00(this.A0L.A04, this, 12);
        this.A0L.A03.requestFocus();
        this.A0L.A03.setCursorVisible(true);
        if (this.A0M.A06.A06() != null) {
            this.A0L.A02.setText(ExistViewModel.A04(this));
        }
        String A182 = AnonymousClass3MZ.A18(this.A0L.A04);
        if (A182.length() > 0) {
            this.A0L.A05.A03(A182);
        }
        if (A9B.A0V(getResources())) {
            A17(this);
        }
        if (this.A05.A02()) {
            Log.w("RegisterPhone/clock-wrong");
            C88364Zk.A02(this, this.A0S, this.A0T);
        } else if (this.A05.A01()) {
            Log.w("RegisterPhone/sw-expired");
            C88364Zk.A03(this, this.A0S, this.A0T);
        }
        this.A0B = (Button) C110885hR.A0A(this, 2131434465);
        View A0A2 = C110885hR.A0A(this, 2131433221);
        View A0A3 = C110885hR.A0A(this, 2131436074);
        AnonymousClass48o.A00(this.A0B, this, 14);
        if (AnonymousClass8BX.A0J(this.A0t).A01) {
            C139576z4 r2 = this.A0E;
            C18070vi.A0d(r2, 0);
            if (r2.A02(6840)) {
                A0A3.setVisibility(0);
                A0A2.setVisibility(0);
                AnonymousClass48o.A00(A0A2, this, 13);
            }
        }
        this.A0C.getViewTreeObserver().addOnGlobalLayoutListener(new C20296AFe(this, 8));
        if (!A4q()) {
            A1H(this, (Runnable) null, true);
        }
        Log.i("RegisterPhone/whats-my-number/enabled");
        TextEmojiLabel A0H3 = AnonymousClass8BR.A0H(this, 2131429927);
        AnonymousClass3Ma.A1L(this.A0E, A0H3);
        AnonymousClass3Ma.A1K(A0H3, this.A08);
        String string2 = getString(2131894514);
        if (this.A0E.A02(5920)) {
            i = AnonymousClass3Ma.A00(this, 2130971935, 2131103036);
        } else {
            i = 0;
        }
        A0H3.setText(A3H.A00(this, (TextAppearanceSpan) null, new C21428Ajv(this, 48), string2, "whats-my-number", i, false));
        A0H3.setLinkTextColor(C19740yt.A00(this, C72463Mc.A02(this)));
        ((A29) this.A0m.get()).A01("enter_number");
        AnonymousClass8BT.A0e(this).A0D("enter_number");
        this.A05.CGN(new C21428Ajv(this, 49));
        if (A022 == 31) {
            A12();
        }
    }

    public Dialog onCreateDialog(int i) {
        C73203Rj A002;
        C010105w create;
        int i2;
        if (i != 21) {
            switch (i) {
                case 610:
                    return new C198979zE(this).A01(new C21524AlX(this, 6));
                case 611:
                    i2 = 2131893577;
                    break;
                case 612:
                    i2 = 2131891824;
                    break;
                default:
                    return super.onCreateDialog(i);
            }
            String string = getString(i2);
            ProgressDialog progressDialog = new ProgressDialog(this);
            AnonymousClass8BX.A0x(progressDialog, string);
            return progressDialog;
        }
        Log.i("RegisterPhone/dialog/num_confirm");
        Boolean bool = (Boolean) this.A0M.A0E.A06();
        if (bool == null || !bool.booleanValue()) {
            AnonymousClass8BT.A0e(this).A0C("phone_number_confirm_dialog");
            if (C18020vd.A05(C18040vf.A02, this.A00, 3847)) {
                View A0D2 = AnonymousClass3MY.A0D(LayoutInflater.from(this), 2131626712);
                AnonymousClass3MW.A0J(A0D2, 2131429354).setText(A9B.A0G(this.A00, ExistViewModel.A04(this), ExistViewModel.A05(this)));
                A002 = AnonymousClass4a6.A00(this);
                A002.A0c(A0D2);
                A002.A0T(false);
                C20152A9o.A00(A002, this, 24, 2131898593);
                A002.A0X(new C20152A9o(this, 21), 2131894986);
            } else {
                String A0q2 = C17880vN.A0q(this, A9B.A0G(this.A00, ExistViewModel.A04(this), ExistViewModel.A05(this)), AnonymousClass3MW.A1a(), 0, 2131895003);
                A002 = AnonymousClass4a6.A00(this);
                A002.A0S(Html.fromHtml(A0q2));
                A002.A0T(false);
                C20152A9o.A00(A002, this, 24, 2131898593);
                A002.A0Y(new C20152A9o(this, 21), 2131894986);
            }
            create = A002.create();
        } else {
            boolean A022 = this.A0E.A02(6367);
            int i3 = 2131896211;
            if (A022) {
                i3 = 2131896212;
            }
            String A0q3 = C17880vN.A0q(this, A9B.A0G(this.A00, ExistViewModel.A04(this), ExistViewModel.A05(this)), AnonymousClass3MW.A1a(), 0, i3);
            int i4 = 2131896213;
            int i5 = 2131894986;
            if (A022) {
                i4 = 2131896214;
                i5 = 2131896215;
            }
            C73203Rj A003 = AnonymousClass4a6.A00(this);
            A003.A0S(Html.fromHtml(A0q3));
            A003.A0T(false);
            C20152A9o.A00(A003, this, 23, i4);
            A003.A0Y(new C20152A9o(this, 21), i5);
            create = A003.create();
        }
        create.setOnDismissListener(C20160A9w.A00(this, 33));
        this.A0A = create;
        return create;
    }

    public void onDestroy() {
        AnonymousClass8BU.A1F(this.A0p);
        super.onDestroy();
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [X.9gO, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v4, types: [X.9pr, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, X.02h] */
    /* JADX WARNING: type inference failed for: r2v1, types: [java.lang.Object, X.02h] */
    public RegisterPhone() {
        ? obj = new Object();
        obj.A00 = false;
        obj.A01 = false;
        this.A1A = obj;
        this.A1C = CDw(new AGI(this, 16), new Object());
        this.A19 = CDw(new AGI(this, 15), new Object());
    }

    public static void A17(RegisterPhone registerPhone) {
        registerPhone.getWindow().setSoftInputMode(3);
        registerPhone.A09.A01(registerPhone.A0L.A03);
    }

    public static void A19(RegisterPhone registerPhone) {
        if (!A9B.A0V(registerPhone.getResources())) {
            registerPhone.getWindow().setSoftInputMode(5);
            registerPhone.A09.A02(registerPhone.A0L.A03);
        }
    }

    public static void A1D(RegisterPhone registerPhone) {
        StringBuilder A102 = AnonymousClass000.A10();
        A102.append(ExistViewModel.A04(registerPhone));
        if (C42171xk.A00(AnonymousClass000.A0y(ExistViewModel.A05(registerPhone), A102), registerPhone.A0M.A0G.A06()) || registerPhone.A0M.A0a()) {
            Boolean bool = (Boolean) registerPhone.A0M.A0E.A06();
            if (bool == null || !bool.booleanValue()) {
                A1A(registerPhone);
            } else {
                A16(registerPhone);
            }
        } else {
            AnonymousClass4Yv.A01(registerPhone, 21);
        }
    }

    /* JADX WARNING: type inference failed for: r0v9, types: [X.DHx, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003e, code lost:
        if (r0 <= r3) goto L_0x0040;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A1H(com.whatsapp.registration.phonenumberentry.RegisterPhone r6, java.lang.Runnable r7, boolean r8) {
        /*
            boolean r0 = X.C17970vW.A0C()
            if (r0 != 0) goto L_0x00ba
            boolean r0 = r6.A16
            if (r0 != 0) goto L_0x00ba
            X.6z4 r5 = r6.A0E
            X.19D r2 = r6.A00
            X.0z4 r4 = r6.A0A
            r1 = 12265(0x2fe9, float:1.7187E-41)
            X.0vf r0 = X.C18040vf.A02
            int r3 = X.C18020vd.A00(r0, r2, r1)
            r2 = 10001(0x2711, float:1.4014E-41)
            if (r3 == r2) goto L_0x0040
            r0 = 12266(0x2fea, float:1.7188E-41)
            boolean r0 = r5.A02(r0)
            if (r0 == 0) goto L_0x00ba
            android.content.SharedPreferences r0 = X.C17890vO.A0B(r4)
            java.lang.String r1 = "pref_phone_number_hint_experimentation_random_value"
            int r0 = X.AnonymousClass8BT.A01(r0, r1)
            if (r0 >= 0) goto L_0x003c
            java.util.Random r0 = new java.util.Random
            r0.<init>()
            int r0 = r0.nextInt(r2)
            X.C17900vP.A0M(r4, r1, r0)
        L_0x003c:
            if (r0 <= 0) goto L_0x00ba
            if (r0 > r3) goto L_0x00ba
        L_0x0040:
            if (r8 == 0) goto L_0x004e
            android.content.SharedPreferences r1 = X.C72453Mb.A0M(r6)
            java.lang.String r0 = "pref_phone_number_hint_during_reg_shown"
            boolean r0 = X.C17880vN.A1W(r1, r0)
            if (r0 != 0) goto L_0x00ba
        L_0x004e:
            android.content.Intent r1 = r6.getIntent()
            java.lang.String r0 = "com.whatsapp.registration.RegisterPhone.country_code"
            java.lang.String r0 = r1.getStringExtra(r0)
            if (r0 != 0) goto L_0x00ba
            android.content.Intent r1 = r6.getIntent()
            java.lang.String r0 = "com.whatsapp.registration.RegisterPhone.phone_number"
            java.lang.String r0 = r1.getStringExtra(r0)
            if (r0 != 0) goto L_0x00ba
            java.lang.String r0 = "RegisterPhone/showGooglePhoneNumberHint"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 0
            X.BbR r5 = new X.BbR
            r5.<init>(r0)
            X.DHx r0 = new X.DHx
            r0.<init>()
            X.BZ5 r4 = new X.BZ5
            r4.<init>((android.app.Activity) r6, (X.C26890DHx) r0)
            X.CWc r3 = X.C25558Chw.A00()
            r0 = 1
            X.Bcl[] r2 = new X.C23191Bcl[r0]
            r1 = 0
            X.Bcl r0 = X.CIJ.A07
            r2[r1] = r0
            r3.A03 = r2
            X.DIR r0 = new X.DIR
            r0.<init>(r5, r4)
            r3.A01 = r0
            r0 = 1653(0x675, float:2.316E-42)
            r3.A00 = r0
            X.BZS r0 = r3.A00()
            com.google.android.gms.tasks.zzw r1 = X.C26126Cso.A02(r4, r0, r1)
            X.AJJ r0 = new X.AJJ
            r0.<init>(r6, r7)
            r1.addOnSuccessListener(r0)
            r2 = 1
            X.AJF r0 = new X.AJF
            r0.<init>(r6, r7, r2)
            r1.addOnFailureListener(r0)
            android.content.SharedPreferences$Editor r1 = X.AnonymousClass8BR.A08(r6)
            java.lang.String r0 = "pref_phone_number_hint_during_reg_shown"
            X.C17880vN.A1F(r1, r0, r2)
            A17(r6)
        L_0x00b9:
            return
        L_0x00ba:
            if (r7 == 0) goto L_0x00b9
            r7.run()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.phonenumberentry.RegisterPhone.A1H(com.whatsapp.registration.phonenumberentry.RegisterPhone, java.lang.Runnable, boolean):void");
    }

    public void A3I() {
        super.A3I();
        if (this.A16) {
            boolean z = C64012u4.A01(C17880vN.A0J(this.A0h)).A04;
            this.A17 = z;
            C17900vP.A0n("RegisterPhone/onActivityStartAsync/isMultiAccountCompanionModeEnabled:", AnonymousClass000.A10(), z);
            if (this.A17) {
                this.A05.A0J(new C21428Ajv(this, 37));
            }
        }
    }

    public void A4k(String str, String str2, String str3) {
        super.A4k(str, str2, str3);
        A4h(7);
        AnonymousClass8BT.A0e(this).A0I("enter_number", "successful");
        boolean z = this.A0H.A00;
        C33841jT r2 = this.A0I;
        if (z) {
            A9B.A0P(this, this.A0M, r2, false);
        } else {
            C33841jT.A03(r2, 2, true);
            startActivity(AnonymousClass1LU.A03(this));
        }
        finish();
    }

    public boolean A4l(C198819yx r4, String str, String str2) {
        if (!str.equals(C72453Mb.A0M(this).getString("pcr_active_cc", (String) null)) || !str2.equals(C72453Mb.A0M(this).getString("pcr_active_pn", (String) null))) {
            return false;
        }
        super.A4k(str, str2, r4.A0c);
        A4h(7);
        AnonymousClass8BT.A0e(this).A0I("enter_number", "successful");
        C33841jT.A03(this.A0I, 37, true);
        Intent A0A2 = C17880vN.A0A();
        A0A2.setClassName(getPackageName(), "com.whatsapp.registration.security.PCRSuccessfulActivity");
        startActivity(A0A2);
        finish();
        return true;
    }

    public boolean A4q() {
        boolean booleanExtra = getIntent().getBooleanExtra("should_show_notif", true);
        if (!AnonymousClass112.A09() || !booleanExtra) {
            return false;
        }
        ((A29) this.A0m.get()).A01("notification_permission");
        C19830z4 r3 = this.A0A;
        String[] strArr = {"android.permission.POST_NOTIFICATIONS"};
        C18070vi.A0d(r3, 1);
        AnonymousClass74O.A0H(r3, strArr);
        C110885hR.A0B(this, strArr, 2);
        return true;
    }

    public void CCW() {
        int A002 = ExistViewModel.A00(this);
        if (!(A002 == 1 || A002 == 3)) {
            int A012 = AnonymousClass8BX.A01(this.A0M.A09);
            Boolean bool = C17970vW.A01;
            if (!(A012 == 1 || AnonymousClass8BX.A01(this.A0M.A0K) == 1 || this.A0A.A02("android.permission.RECEIVE_SMS") == 0)) {
                Log.i("RegisterPhone/proceedWithoutSmsRetriever/requesting RECEIVE_SMS permission");
                A9B.A0R(this, 1);
                return;
            }
        }
        Log.i("RegisterPhone/proceedWithoutSmsRetriever/NOT requesting RECEIVE_SMS permission");
        this.A13 = false;
        A15();
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (intent.getBooleanExtra("com.whatsapp.registration.RegisterPhone.tapped_sms_link", false)) {
            Log.i("RegisterPhone/newintent/link/instructions/dialog");
            BhR(AnonymousClass8BV.A0q(this, AnonymousClass3MW.A1a(), 2131899286, 0, 2131895029));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0137, code lost:
        X.C21428Ajv.A00(r1, r9, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x013a, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0066, code lost:
        startActivity(r2);
        finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x006c, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onOptionsItemSelected(android.view.MenuItem r10) {
        /*
            r9 = this;
            int r0 = r10.getItemId()
            java.lang.String r5 = ""
            java.lang.String r3 = "\\D"
            r4 = 1
            switch(r0) {
                case 0: goto L_0x0163;
                case 1: goto L_0x013b;
                case 2: goto L_0x0133;
                case 3: goto L_0x012e;
                case 4: goto L_0x00d5;
                case 5: goto L_0x007b;
                case 6: goto L_0x006d;
                case 7: goto L_0x003d;
                case 8: goto L_0x0017;
                case 9: goto L_0x0011;
                default: goto L_0x000c;
            }
        L_0x000c:
            boolean r0 = super.onOptionsItemSelected(r10)
            return r0
        L_0x0011:
            X.10I r1 = r9.A05
            r0 = 45
            goto L_0x0137
        L_0x0017:
            X.00H r0 = r9.A0t
            X.9nK r0 = X.AnonymousClass8BX.A0J(r0)
            r0.A00(r9)
            X.00H r0 = r9.A0t
            java.lang.Object r0 = r0.get()
            X.2iS r0 = (X.C57052iS) r0
            X.9nK r0 = r0.A00()
            X.C17960vV.A07(r0)
            android.content.Intent r2 = X.C17880vN.A0A()
            java.lang.String r1 = r9.getPackageName()
            java.lang.String r0 = "com.whatsapp.bridge.wfs.ui.LinkedUsersActivity"
            r2.setClassName(r1, r0)
            goto L_0x0066
        L_0x003d:
            X.1VJ r1 = r9.A0J
            r0 = 2
            r1.A01(r0)
            X.A8V r2 = X.AnonymousClass8BT.A0e(r9)
            java.lang.String r1 = "enter_number"
            java.lang.String r0 = "tapped"
            r2.A0I(r1, r0)
            X.118 r0 = r9.A08
            android.content.Context r0 = r0.A00
            java.lang.String r3 = "entry_phone_reg"
            android.content.Intent r2 = X.C17880vN.A0A()
            java.lang.String r1 = r0.getPackageName()
            java.lang.String r0 = "com.whatsapp.companionmode.registration.RegisterAsCompanionActivity"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "entry_point"
            r2.putExtra(r0, r3)
        L_0x0066:
            r9.startActivity(r2)
            r9.finish()
            return r4
        L_0x006d:
            android.content.Intent r1 = X.C17880vN.A0A()
            java.lang.String r0 = "com.whatsapp.debug.library.DebugToolsActivity"
            android.content.Intent r0 = r1.setClassName(r9, r0)
            r9.startActivity(r0)
            return r4
        L_0x007b:
            X.1j9 r1 = r9.A0X
            com.whatsapp.registration.phonenumberentry.viewmodel.ExistViewModel r0 = r9.A0M
            X.1DT r0 = r0.A08
            java.lang.Object r0 = r0.A06()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L_0x00d2
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00d2
            java.lang.String r0 = "validNumber"
        L_0x0091:
            r1.A03(r0)
            X.1j9 r1 = r9.A0X
            com.whatsapp.registration.phonenumberentry.viewmodel.ExistViewModel r0 = r9.A0M
            X.1DT r0 = r0.A07
            java.lang.Object r0 = r0.A06()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L_0x00cf
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00cf
            java.lang.String r0 = "emptyNumber"
        L_0x00aa:
            r1.A03(r0)
            X.1j9 r0 = r9.A0X
            java.lang.String r2 = "register-phone"
            r0.A02(r2)
            X.00H r0 = r9.A0p
            java.lang.Object r1 = r0.get()
            X.2l8 r1 = (X.C58712l8) r1
            X.1j9 r0 = r9.A0X
            r1.A01(r9, r0, r2)
            X.A8V r3 = X.AnonymousClass8BT.A0e(r9)
            java.lang.String r2 = "menu_help_tapped"
            java.lang.String r1 = "tapped"
            java.lang.String r0 = "enter_number"
            r3.A0J(r0, r2, r1)
            return r4
        L_0x00cf:
            java.lang.String r0 = "notEmptyNumber"
            goto L_0x00aa
        L_0x00d2:
            java.lang.String r0 = "notValidNumber"
            goto L_0x0091
        L_0x00d5:
            X.9gv r0 = r9.A0L
            android.widget.EditText r0 = r0.A02
            java.lang.String r0 = X.AnonymousClass3Ma.A12(r0)
            java.lang.String r1 = r0.replaceAll(r3, r5)
            X.9gv r0 = r9.A0L
            android.widget.EditText r0 = r0.A03
            java.lang.String r0 = X.AnonymousClass3Ma.A12(r0)
            java.lang.String r0 = r0.replaceAll(r3, r5)
            java.lang.String r0 = X.C17900vP.A0A(r1, r0)
            java.lang.String r0 = X.C181659Ri.A00(r0)
            byte[] r8 = X.C17970vW.A0J(r9, r0)
            java.lang.StringBuilder r7 = X.AnonymousClass000.A10()
            java.lang.String r0 = "RegisterPhone/rc="
            r7.append(r0)
            if (r8 != 0) goto L_0x010a
            java.lang.String r0 = "(null)"
        L_0x0106:
            X.C17890vO.A1A(r7, r0)
            return r4
        L_0x010a:
            java.lang.StringBuilder r6 = X.AnonymousClass000.A10()
            int r5 = r8.length
            r3 = 0
            r2 = 0
        L_0x0111:
            if (r2 >= r5) goto L_0x0129
            byte r0 = r8[r2]
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)
            r1[r3] = r0
            java.lang.String r0 = "%02X"
            java.lang.String r0 = java.lang.String.format(r0, r1)
            r6.append(r0)
            int r2 = r2 + 1
            goto L_0x0111
        L_0x0129:
            java.lang.String r0 = r6.toString()
            goto L_0x0106
        L_0x012e:
            X.10I r1 = r9.A05
            r0 = 44
            goto L_0x0137
        L_0x0133:
            X.10I r1 = r9.A05
            r0 = 43
        L_0x0137:
            X.C21428Ajv.A00(r1, r9, r0)
            return r4
        L_0x013b:
            X.9gv r0 = r9.A0L
            android.widget.EditText r0 = r0.A02
            java.lang.String r0 = X.AnonymousClass3Ma.A12(r0)
            java.lang.String r2 = r0.replaceAll(r3, r5)
            X.9gv r0 = r9.A0L
            android.widget.EditText r0 = r0.A03
            java.lang.String r0 = X.AnonymousClass3Ma.A12(r0)
            java.lang.String r0 = r0.replaceAll(r3, r5)
            byte[] r1 = X.C17970vW.A0H()
            java.lang.String r0 = X.C17900vP.A0A(r2, r0)
            java.lang.String r0 = X.C181659Ri.A00(r0)
            X.C17970vW.A0E(r9, r0, r1)
            return r4
        L_0x0163:
            X.1jT r0 = r9.A0I
            X.AnonymousClass8BX.A0v(r9, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.phonenumberentry.RegisterPhone.onOptionsItemSelected(android.view.MenuItem):boolean");
    }

    public void onPause() {
        super.onPause();
        C196059uO r1 = this.A0H;
        r1.A00 = true;
        A9B.A0U(r1.A03, A9B.A00);
        StringBuilder A102 = AnonymousClass000.A10();
        A102.append("RegisterPhone/pause ");
        C17900vP.A0o(A102, AnonymousClass8BX.A01(this.A0M.A0L));
        SharedPreferences.Editor A082 = AnonymousClass8BU.A08(this.A0V, "register_phone_prefs");
        A082.putString("com.whatsapp.registration.RegisterPhone.country_code", ExistViewModel.A04(this));
        A082.putString("com.whatsapp.registration.RegisterPhone.phone_number", ExistViewModel.A05(this));
        A082.putInt("com.whatsapp.registration.RegisterPhone.verification_state", AnonymousClass8BX.A01(this.A0M.A0L));
        A082.putString("com.whatsapp.registration.RegisterPhone.input_phone_number", AnonymousClass3Ma.A12(this.A0L.A03));
        A082.putString("com.whatsapp.registration.RegisterPhone.input_country_code", AnonymousClass3Ma.A12(this.A0L.A02));
        A082.putInt("com.whatsapp.registration.RegisterPhone.country_code_position", AnonymousClass4W1.A00(this.A0L.A02));
        A082.putInt("com.whatsapp.registration.RegisterPhone.phone_number_position", AnonymousClass4W1.A00(this.A0L.A03));
        A082.apply();
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        menu.clear();
        if (!this.A16 || this.A17) {
            menu.add(0, 7, 0, 2131891653);
        }
        menu.add(0, 5, 0, 2131895081);
        return super.onPrepareOptionsMenu(menu);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 2) {
            A1H(this, (Runnable) null, true);
        }
    }

    public void onResume() {
        super.onResume();
        this.A0H.A00();
        SharedPreferences A052 = this.A0V.A05("register_phone_prefs");
        ExistViewModel existViewModel = this.A0M;
        existViewModel.A06.A0F(A052.getString("com.whatsapp.registration.RegisterPhone.country_code", (String) null));
        ExistViewModel existViewModel2 = this.A0M;
        existViewModel2.A0D.A0F(A052.getString("com.whatsapp.registration.RegisterPhone.phone_number", (String) null));
        ExistViewModel existViewModel3 = this.A0M;
        AnonymousClass3MX.A1J(existViewModel3.A0L, A052.getInt("com.whatsapp.registration.RegisterPhone.verification_state", 7));
        if (this.A15) {
            this.A15 = false;
            AnonymousClass3MW.A1S(this.A0L.A03);
        } else {
            String string = A052.getString("com.whatsapp.registration.RegisterPhone.input_phone_number", (String) null);
            this.A0L.A03.setText(string);
            if (!TextUtils.isEmpty(string)) {
                this.A0M.A0Y(false);
                this.A0M.A0Z(true);
            }
        }
        this.A0L.A02.setText(A052.getString("com.whatsapp.registration.RegisterPhone.input_country_code", (String) null));
        if (TextUtils.isEmpty(this.A0L.A02.getText())) {
            this.A0L.A02.requestFocus();
        }
        AnonymousClass4W1.A01(this.A0L.A03, A052.getInt("com.whatsapp.registration.RegisterPhone.phone_number_position", -1));
        AnonymousClass4W1.A01(this.A0L.A02, A052.getInt("com.whatsapp.registration.RegisterPhone.country_code_position", -1));
        StringBuilder A102 = AnonymousClass000.A10();
        A102.append("RegisterPhone/resume ");
        C17900vP.A0o(A102, AnonymousClass8BX.A01(this.A0M.A0L));
        if (AnonymousClass8BX.A01(this.A0M.A0L) == 15) {
            if (this.A0M.A06.A06() == null || this.A0M.A0D.A06() == null) {
                Log.i("RegisterPhone/reset-state");
                A4h(7);
            } else {
                A1D(this);
            }
        }
        this.A0M.BEJ(1, "RegisterPhone1");
        C33841jT.A03(this.A0I, 1, true);
        C25161Nd r1 = this.A0K;
        AnonymousClass1CJ.A01(r1.A02);
        C25171Ne r12 = r1.A01;
        synchronized (r12) {
            if (r12.A00) {
                r12.A02.clear();
            }
            r12.A01.clear();
        }
        ((A98) this.A0X.get()).A0S(false);
        A4b();
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("shouldStartBanAppealForBlockedUser", this.A18);
    }
}
