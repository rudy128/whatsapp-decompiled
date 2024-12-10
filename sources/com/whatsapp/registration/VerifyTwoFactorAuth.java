package com.whatsapp.registration;

import X.A3H;
import X.A98;
import X.A9B;
import X.AGE;
import X.AQ5;
import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass10I;
import X.AnonymousClass118;
import X.AnonymousClass11J;
import X.AnonymousClass19D;
import X.AnonymousClass1FL;
import X.AnonymousClass1FY;
import X.AnonymousClass1HF;
import X.AnonymousClass1K1;
import X.AnonymousClass1LU;
import X.AnonymousClass1MB;
import X.AnonymousClass3CA;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass4PW;
import X.AnonymousClass4VX;
import X.AnonymousClass4a6;
import X.AnonymousClass8BA;
import X.AnonymousClass8BR;
import X.AnonymousClass8BS;
import X.AnonymousClass8BT;
import X.AnonymousClass8BU;
import X.AnonymousClass8BW;
import X.AnonymousClass8BX;
import X.AnonymousClass9BG;
import X.AnonymousClass9BX;
import X.B9P;
import X.C000200d;
import X.C010105w;
import X.C108975cc;
import X.C132216mP;
import X.C137116uw;
import X.C139576z4;
import X.C161178Cc;
import X.C166908eI;
import X.C17880vN;
import X.C17890vO;
import X.C17900vP;
import X.C17960vV;
import X.C17970vW;
import X.C18000vb;
import X.C18020vd;
import X.C18040vf;
import X.C180559Na;
import X.C196059uO;
import X.C19830z4;
import X.C19880zA;
import X.C20152A9o;
import X.C20444ALh;
import X.C21008Ad0;
import X.C21449AkG;
import X.C219217x;
import X.C22524BBh;
import X.C27301Vn;
import X.C30901eh;
import X.C31361fR;
import X.C33641j9;
import X.C33841jT;
import X.C57352iw;
import X.C58592kw;
import X.C58712l8;
import X.C63662tU;
import X.C63932tv;
import X.C64052u8;
import X.C72453Mb;
import X.C72463Mc;
import X.C73203Rj;
import X.C83894Hb;
import X.C91974gY;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewStub;
import android.view.inputmethod.InputMethodManager;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.facebook.msys.mci.DefaultCrypto;
import com.whatsapp.CodeInputField;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.util.Log;
import java.util.concurrent.TimeUnit;

public class VerifyTwoFactorAuth extends C166908eI implements C22524BBh, B9P {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public CountDownTimer A06;
    public ProgressBar A07;
    public TextView A08;
    public C010105w A09;
    public C19880zA A0A;
    public C31361fR A0B;
    public CodeInputField A0C;
    public AnonymousClass4PW A0D;
    public C132216mP A0E;
    public AnonymousClass118 A0F;
    public C27301Vn A0G;
    public C219217x A0H;
    public AnonymousClass8BA A0I;
    public AnonymousClass19D A0J;
    public C139576z4 A0K;
    public AnonymousClass1MB A0L;
    public AnonymousClass1LU A0M;
    public AnonymousClass4VX A0N;
    public C196059uO A0O;
    public A98 A0P;
    public C33841jT A0Q;
    public C33641j9 A0R;
    public AnonymousClass9BG A0S;
    public C57352iw A0T;
    public AnonymousClass9BX A0U;
    public C30901eh A0V;
    public C58592kw A0W;
    public AnonymousClass00H A0X;
    public AnonymousClass00H A0Y;
    public AnonymousClass00H A0Z;
    public AnonymousClass00H A0a;
    public AnonymousClass00H A0b;
    public String A0c;
    public String A0d;
    public String A0e;
    public String A0f;
    public String A0g;
    public boolean A0h;
    public boolean A0i;
    public boolean A0j;
    public boolean A0k;
    public boolean A0l;
    public boolean A0m;
    public final Handler A0n;
    public final AnonymousClass11J A0o;
    public final Runnable A0p;

    public class forgotPinDialog extends Hilt_VerifyTwoFactorAuth_forgotPinDialog {
        public Dialog A27(Bundle bundle) {
            int millis;
            C18000vb r1;
            int i;
            Bundle bundle2 = this.A06;
            int i2 = bundle2.getInt("wipeStatus");
            long j = bundle2.getLong("timeToWaitInMillis");
            C73203Rj A00 = AnonymousClass4a6.A00(A1n());
            AnonymousClass1FY r2 = (AnonymousClass1FY) A1B();
            if (r2 != null) {
                Log.i("VerifyTwoFactorAuth/forgotPinDialog/onCreateDialog");
                View A0D = AnonymousClass3MY.A0D(LayoutInflater.from(A1n()), 2131627241);
                TextView A0J = AnonymousClass3MW.A0J(A0D, 2131436469);
                TextView A0J2 = AnonymousClass3MW.A0J(A0D, 2131433997);
                View A06 = AnonymousClass1HF.A06(A0D, 2131428815);
                View A062 = AnonymousClass1HF.A06(A0D, 2131434626);
                int i3 = 2131897196;
                if (AnonymousClass8BU.A02(r2) == 18) {
                    i3 = 2131895674;
                }
                A0J2.setText(i3);
                AnonymousClass3MZ.A1L(A0J2, r2, 7);
                AnonymousClass3MZ.A1L(A06, this, 8);
                if (i2 == 0) {
                    A0J.setText(2131898583);
                } else if (i2 == 1) {
                    long millis2 = TimeUnit.DAYS.toMillis(1);
                    if (j > millis2) {
                        millis = (int) (j / millis2);
                        r1 = this.A01;
                        i = 3;
                    } else {
                        long millis3 = TimeUnit.HOURS.toMillis(1);
                        if (j > millis3) {
                            millis = (int) (j / millis3);
                            r1 = this.A01;
                            i = 2;
                        } else {
                            long millis4 = TimeUnit.MINUTES.toMillis(1);
                            if (j > millis4) {
                                millis = (int) (j / millis4);
                                r1 = this.A01;
                                i = 1;
                            } else {
                                millis = (int) (j / TimeUnit.SECONDS.toMillis(1));
                                r1 = this.A01;
                                i = 0;
                            }
                        }
                    }
                    A0J.setText(AnonymousClass3MY.A0o(this, C64052u8.A02(r1, millis, i), 0, 2131897183));
                } else if (i2 == 2 || i2 == 3) {
                    A0J.setText(2131897185);
                    AnonymousClass3MZ.A1L(A062, r2, 9);
                    A062.setVisibility(0);
                    AnonymousClass3MY.A1B(A0D, 2131435525, 0);
                }
                A00.setView(A0D);
            }
            return A00.create();
        }
    }

    public class resetAccountDialog extends Hilt_VerifyTwoFactorAuth_resetAccountDialog {
        public Dialog A27(Bundle bundle) {
            int i;
            int i2 = this.A06.getInt("wipeStatus");
            AnonymousClass1FL A1B = A1B();
            C73203Rj A00 = AnonymousClass4a6.A00(A1B);
            C20152A9o.A00(A00, A1B, 8, 2131897184);
            AnonymousClass8BU.A1A(A00);
            if (i2 == 1 || i2 == 2) {
                i = 2131897189;
            } else {
                if (i2 == 3) {
                    i = 2131897188;
                }
                return A00.create();
            }
            A00.A0D(i);
            return A00.create();
        }
    }

    public static void A0c(VerifyTwoFactorAuth verifyTwoFactorAuth, String str, int i, boolean z) {
        VerifyTwoFactorAuth verifyTwoFactorAuth2 = verifyTwoFactorAuth;
        verifyTwoFactorAuth.A01 = i;
        verifyTwoFactorAuth.A0e = str;
        verifyTwoFactorAuth.A0h = z;
        int i2 = 33;
        if (i != 1) {
            i2 = 34;
            if (i != 2) {
                i2 = 31;
            }
        }
        verifyTwoFactorAuth.A00 = i2;
        if (str != null) {
            C17880vN.A1E(C19830z4.A00(verifyTwoFactorAuth.A0A), "2fa", str);
        }
        AnonymousClass10I r2 = verifyTwoFactorAuth.A05;
        String str2 = verifyTwoFactorAuth.A0f;
        String str3 = verifyTwoFactorAuth.A0c;
        String str4 = verifyTwoFactorAuth.A0d;
        AnonymousClass00H r8 = verifyTwoFactorAuth2.A0b;
        C19830z4 r4 = verifyTwoFactorAuth2.A0A;
        A98 a98 = verifyTwoFactorAuth2.A0P;
        C19880zA r1 = verifyTwoFactorAuth2.A0A;
        if (r1.A07()) {
            r1.A03();
            throw AnonymousClass000.A0s("getVNameCertForVerifyTwoFactorAuth");
        }
        AnonymousClass9BX r3 = new AnonymousClass9BX(r4, a98, verifyTwoFactorAuth2, verifyTwoFactorAuth2.A0W, r8, str2, str3, str4, str, i);
        verifyTwoFactorAuth2.A0U = r3;
        r2.CGD(r3, new String[0]);
    }

    public void COI() {
        A0q(true);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        String str;
        if (i == 1) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("VerifyTwoFactorAuth/onActivityResult/REQUEST_CODE_SMS_PERMISSIONS/");
            if (i2 == -1) {
                str = "granted";
            } else {
                str = "denied";
            }
            C17890vO.A1A(A10, str);
            A0q(false);
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    public static void A0V(VerifyTwoFactorAuth verifyTwoFactorAuth, long j) {
        CountDownTimer start;
        long j2 = j;
        VerifyTwoFactorAuth verifyTwoFactorAuth2 = verifyTwoFactorAuth;
        if (j < 1000) {
            C17880vN.A1B(verifyTwoFactorAuth.getPreferences(0).edit(), "code_retry_time");
            CountDownTimer countDownTimer = verifyTwoFactorAuth.A06;
            if (countDownTimer != null) {
                countDownTimer.cancel();
                start = null;
            } else {
                return;
            }
        } else {
            C17880vN.A1D(verifyTwoFactorAuth.getPreferences(0).edit(), "code_retry_time", AnonymousClass8BS.A01(verifyTwoFactorAuth) + j);
            verifyTwoFactorAuth.A09.A01(verifyTwoFactorAuth.A0C);
            verifyTwoFactorAuth.CIM(false);
            verifyTwoFactorAuth.A08.setText(2131897166);
            verifyTwoFactorAuth.A08.setVisibility(0);
            start = new C161178Cc(verifyTwoFactorAuth2, 1, j2, j).start();
        }
        verifyTwoFactorAuth2.A06 = start;
    }

    public static void A0d(VerifyTwoFactorAuth verifyTwoFactorAuth, boolean z) {
        C17890vO.A0t(verifyTwoFactorAuth.A0S);
        if (z) {
            verifyTwoFactorAuth.A02 = -1;
            verifyTwoFactorAuth.A0A.A1v(verifyTwoFactorAuth.A0g, verifyTwoFactorAuth.A0f, verifyTwoFactorAuth.A05, -1, verifyTwoFactorAuth.A04, verifyTwoFactorAuth.A03);
        }
        verifyTwoFactorAuth.A0n.removeCallbacks(verifyTwoFactorAuth.A0p);
    }

    private void A0q(boolean z) {
        Log.i("VerifyTwoFactorAuth/startOtpVerification");
        this.A07.A01(19);
        this.A0A.A1I(-1);
        Boolean bool = C17970vW.A01;
        A3q(AnonymousClass1LU.A1W(this, (String) null, (String) null, -1, 0, 0, -1, -1, -1, -1, z, true, this.A0B.A02(), false), false);
        finish();
    }

    public void A2y() {
        if (!this.A0k) {
            this.A0k = true;
            AnonymousClass1K1 A002 = C137116uw.A00(this);
            AnonymousClass10E r3 = A002.AAQ;
            C63932tv.A02(r3, this);
            AnonymousClass10G r1 = r3.A00;
            C63932tv.A01(r3, r1, this);
            C63662tU.A00(r3, r1, this, r1.A5A);
            this.A00 = AnonymousClass1K1.A1f(A002);
            this.A0F = AnonymousClass3MZ.A0l(r3);
            this.A0M = AnonymousClass3MY.A0Z(r3);
            this.A0Z = C000200d.A00(r3.A5t);
            this.A0Y = C000200d.A00(r3.A4U);
            this.A0E = AnonymousClass8BT.A0A(r1);
            this.A0K = (C139576z4) r3.A01.get();
            this.A0J = C72463Mc.A0e(r3);
            this.A0L = AnonymousClass3Ma.A0k(r3);
            this.A0a = C000200d.A00(A002.A5g);
            this.A0B = (C31361fR) r3.A1z.get();
            this.A0Q = AnonymousClass8BU.A0c(r3);
            this.A0I = (AnonymousClass8BA) r1.AJ5.get();
            this.A0H = AnonymousClass3Ma.A0b(r3);
            this.A0V = (C30901eh) r3.AB1.get();
            this.A0R = AnonymousClass8BW.A0T(r3);
            this.A0T = C72463Mc.A0i(r1);
            this.A0G = (C27301Vn) r3.A9A.get();
            this.A0A = (C19880zA) r3.A7j.get();
            this.A0P = (A98) r3.Ag7.get();
            this.A0X = AnonymousClass8BT.A0g(r3);
            this.A0b = C000200d.A00(r1.A5E);
            this.A0D = (AnonymousClass4PW) A002.A24.get();
            this.A0W = (C58592kw) r1.AJ8.get();
        }
    }

    public void A4e(C180559Na r12) {
        this.A0g = r12.A0D;
        this.A0f = r12.A0C;
        this.A05 = r12.A02;
        this.A02 = r12.A01;
        this.A04 = r12.A00;
        long A012 = AnonymousClass8BS.A01(this);
        this.A03 = A012;
        this.A0A.A1v(this.A0g, this.A0f, this.A05, this.A02, this.A04, A012);
    }

    public void A4f(String str, String str2) {
        C19880zA r1 = this.A0A;
        if (r1.A07()) {
            r1.A03();
            throw AnonymousClass000.A0s("setVNameCertSetInRegistration");
        }
        this.A0Q.A0D(this.A0c, this.A0d, str2);
        C30901eh r2 = this.A0V;
        r2.A08.CGN(new AnonymousClass3CA(r2, str, (String) null, 5, 3));
        AnonymousClass8BR.A0q(this.A0Y).A0I("screen_type_2fa", "successful");
        AnonymousClass8BR.A0q(this.A0Y).A08();
        this.A05.CGF(new C21449AkG(this, 27));
        if (this.A0O.A00) {
            A9B.A0P(this, this.A0G, this.A0Q, false);
        } else if (!this.A0j) {
            Log.i("VerifyTwoFactorAuth/removeProgressDialog/");
            C33841jT.A03(this.A0Q, 2, true);
            if (this.A0l) {
                setResult(-1);
            } else {
                A3q(AnonymousClass1LU.A03(this), true);
                return;
            }
        } else {
            this.A05.CGF(new C21449AkG(this, 28));
        }
        finish();
    }

    public void BkF(String str) {
        if (str.equals("smsMistake")) {
            A0Q(this);
        }
    }

    public void CCW() {
        if (this.A0H.A02("android.permission.RECEIVE_SMS") == 0) {
            Log.i("VerifyTwoFactorAuth/proceedWithoutSmsRetriever/NOT requesting RECEIVE_SMS permission");
            A0q(false);
            return;
        }
        Log.i("VerifyTwoFactorAuth/proceedWithoutSmsRetriever/requesting RECEIVE_SMS permission");
        A9B.A0R(this, 1);
    }

    public void CIM(boolean z) {
        if (this.A0N.A07()) {
            this.A0N.A05(z);
            return;
        }
        this.A0C.setEnabled(z);
        ProgressBar progressBar = this.A07;
        int i = 0;
        if (z) {
            i = 100;
        }
        progressBar.setProgress(i);
    }

    public void onBackPressed() {
        if (C17880vN.A0I(this.A0X).A0J(this.A0j)) {
            Log.i("VerifyTwoFactorAuth/onBackPressed/is adding new account");
            A9B.A0S(this, this.A0X);
        } else if (!this.A0K.A02(11568) || this.A0j) {
            Log.i("VerifyTwoFactorAuth/onBackPressed/change number flow or default");
            super.onBackPressed();
        } else {
            Log.i("VerifyTwoFactorAuth/onBackPressed/reg flow");
            AnonymousClass8BR.A0q(this.A0Y).A0B("screen_type_2fa");
            C33841jT.A03(this.A0Q, 1, true);
            startActivity(AnonymousClass1LU.A04(this));
            finish();
        }
    }

    public void onCreate(Bundle bundle) {
        Bundle bundle2 = bundle;
        super.onCreate(bundle2);
        getWindow().addFlags(DefaultCrypto.BUFFER_SIZE);
        setTitle(2131897206);
        this.A0T.A00(this);
        this.A0O = new C196059uO(this, this.A0A);
        Intent intent = getIntent();
        if (intent.getExtras() != null) {
            if (intent.getBooleanExtra("changenumber", false)) {
                this.A0j = true;
            }
            if (intent.getBooleanExtra("isaccounttransfer", false)) {
                this.A0l = true;
            }
        }
        this.A0m = C17880vN.A0I(this.A0X).A0J(this.A0j);
        this.A0N = this.A0D.A00((C83894Hb) null);
        setContentView(2131624120);
        AnonymousClass8BR.A0q(this.A0Y).A0C("screen_type_2fa");
        this.A07.A00(false);
        A9B.A0Q(this.A00, this, 2131436246, false, this.A0K.A02(11568), this.A0m);
        boolean A2L = this.A0A.A2L();
        View view = this.A00;
        int i = 2131436208;
        if (A2L) {
            i = 2131436252;
        }
        ((TextView) ((ViewStub) AnonymousClass1HF.A06(view, i)).inflate()).setText(2131897206);
        int i2 = 2131436280;
        if (this.A0A.A2L()) {
            i2 = 2131436281;
        }
        A9B.A0T(this, this.A0J, i2);
        this.A0C = (CodeInputField) AnonymousClass1HF.A06(this.A00, 2131429150);
        this.A07 = (ProgressBar) AnonymousClass1HF.A06(this.A00, 2131434182);
        this.A08 = AnonymousClass3MW.A0J(this.A00, 2131429931);
        View findViewById = findViewById(2131433850);
        View findViewById2 = findViewById(2131430973);
        View findViewById3 = findViewById(2131430972);
        View findViewById4 = findViewById(2131436470);
        AnonymousClass19D r2 = this.A0J;
        C18040vf r4 = C18040vf.A02;
        if (C18020vd.A05(r4, r2, 5732)) {
            findViewById4.setVisibility(8);
            findViewById.setVisibility(0);
            if (C18020vd.A05(r4, this.A0J, 8780)) {
                findViewById2.setVisibility(8);
                findViewById3.setVisibility(0);
                AnonymousClass3MZ.A1L(findViewById3, this, 5);
            } else {
                findViewById3.setVisibility(8);
                findViewById2.setVisibility(0);
                AnonymousClass3MZ.A1L(findViewById2, this, 6);
            }
        } else {
            findViewById3.setVisibility(8);
            findViewById4.setVisibility(0);
            findViewById.setVisibility(8);
            findViewById2.setVisibility(8);
        }
        Object[] objArr = new Object[1];
        C17880vN.A1T(objArr, 6, 0);
        String string = getString(2131886292, objArr);
        LinearLayout A0K2 = AnonymousClass3MX.A0K(this.A00, 2131436712);
        boolean A072 = this.A0N.A07();
        CodeInputField codeInputField = this.A0C;
        if (A072) {
            codeInputField.setVisibility(8);
            this.A07.setVisibility(8);
            this.A0N.A03(A0K2, new C21008Ad0(this, 0), 6, true);
            A0K2.setVisibility(0);
        } else {
            codeInputField.setVisibility(0);
            this.A07.setVisibility(0);
            A0K2.setVisibility(8);
            this.A0C.A0N(new C20444ALh(this, 2), new C91974gY(this, 1), (String) null, string, '*', '*', 6);
            this.A0C.setPasswordTransformationEnabled(true);
        }
        CIM(true);
        this.A0c = this.A0A.A0l();
        this.A0d = this.A0A.A0n();
        this.A0g = C72453Mb.A0M(this).getString("registration_wipe_type", (String) null);
        this.A0f = C72453Mb.A0M(this).getString("registration_wipe_token", (String) null);
        this.A05 = C72453Mb.A0M(this).getLong("registration_wipe_wait", -1);
        this.A02 = C72453Mb.A0M(this).getLong("registration_wipe_expiry", -1);
        this.A04 = C72453Mb.A0M(this).getLong("registration_wipe_server_time", -1);
        this.A03 = this.A0A.A0W("registration_wipe_info_timestamp");
        if (this.A02 > 0) {
            A0d(this, false);
            this.A0n.postDelayed(this.A0p, 0);
        }
        if (bundle != null && !bundle2.getBoolean("shouldShowTheForgetPinDialog", false)) {
            A41("forgotPinDialogTag");
        }
    }

    public Dialog onCreateDialog(int i) {
        if (i == 109) {
            AnonymousClass1LU r10 = this.A0M;
            AnonymousClass10I r12 = this.A05;
            return A9B.A07(this, this.A0E, this.A07, this.A08, this.A0H, this.A0L, r10, this.A0P, r12);
        } else if (i == 124) {
            return A9B.A08(this, this.A0E, this.A00, this.A0L, new C21449AkG(this, 29), this.A0c, this.A0d);
        } else if (i == 125) {
            return A9B.A09(this, this.A0E, this.A0L, this.A0c, this.A0d);
        } else {
            switch (i) {
                case 31:
                    ProgressDialog progressDialog = new ProgressDialog(this);
                    AnonymousClass8BX.A0x(progressDialog, getString(2131895065));
                    return progressDialog;
                case 32:
                    C73203Rj A002 = AnonymousClass4a6.A00(this);
                    A002.A0S(C108975cc.A0b(this, getString(2131888733), AnonymousClass3MW.A1a(), 2131894981));
                    C20152A9o.A00(A002, this, 6, 2131899286);
                    return A002.create();
                case 33:
                    ProgressDialog progressDialog2 = new ProgressDialog(this);
                    AnonymousClass8BX.A0x(progressDialog2, getString(2131897197));
                    return progressDialog2;
                case 34:
                    ProgressDialog progressDialog3 = new ProgressDialog(this);
                    AnonymousClass8BX.A0x(progressDialog3, getString(2131897191));
                    return progressDialog3;
                default:
                    return super.onCreateDialog(i);
            }
        }
    }

    public void onDestroy() {
        C17890vO.A0t(this.A0U);
        A0d(this, false);
        CountDownTimer countDownTimer = this.A06;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.A06 = null;
        }
        this.A0i = false;
        this.A07.unregisterObserver(this.A0o);
        AnonymousClass8BU.A1F(this.A0a);
        C010105w r0 = this.A09;
        if (r0 != null) {
            r0.dismiss();
            this.A09 = null;
        }
        super.onDestroy();
    }

    public VerifyTwoFactorAuth(int i) {
        this.A0k = false;
        AGE.A00(this, 25);
    }

    public static int A03(VerifyTwoFactorAuth verifyTwoFactorAuth) {
        if (AnonymousClass8BU.A02(verifyTwoFactorAuth) == 18) {
            return 0;
        }
        if ((verifyTwoFactorAuth.A03 + (verifyTwoFactorAuth.A05 * 1000)) - AnonymousClass8BS.A01(verifyTwoFactorAuth) <= 0) {
            String str = verifyTwoFactorAuth.A0g;
            if ("offline".equals(str)) {
                return 2;
            }
            if ("full".equals(str)) {
                return 3;
            }
        }
        return 1;
    }

    public static void A0Q(VerifyTwoFactorAuth verifyTwoFactorAuth) {
        int A032 = A03(verifyTwoFactorAuth);
        long A012 = (verifyTwoFactorAuth.A03 + (verifyTwoFactorAuth.A05 * 1000)) - AnonymousClass8BS.A01(verifyTwoFactorAuth);
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("VerifyTwoFactorAuth/clickForgotPin/resetMode=");
        A10.append(verifyTwoFactorAuth.A01);
        A10.append("/wipeStatus=");
        A10.append(A032);
        C17900vP.A0m("/timeToWaitInMillis=", A10, A012);
        Hilt_VerifyTwoFactorAuth_forgotPinDialog hilt_VerifyTwoFactorAuth_forgotPinDialog = new Hilt_VerifyTwoFactorAuth_forgotPinDialog();
        Bundle A0D2 = C17880vN.A0D();
        A0D2.putInt("wipeStatus", A032);
        A0D2.putLong("timeToWaitInMillis", A012);
        hilt_VerifyTwoFactorAuth_forgotPinDialog.A1R(A0D2);
        verifyTwoFactorAuth.CMk(hilt_VerifyTwoFactorAuth_forgotPinDialog, "forgotPinDialogTag");
    }

    public void A3h(int i) {
        if (i == 2131897207) {
            if (this.A0C.isEnabled()) {
                InputMethodManager A0N2 = this.A08.A0N();
                C17960vV.A07(A0N2);
                A0N2.toggleSoftInput(1, 0);
            }
        } else if (i == 2131895028 || i == 2131895064 || i == 2131897200) {
            this.A0Q.A0A();
            startActivity(AnonymousClass1LU.A04(this));
            finish();
        }
    }

    public String A4b() {
        return "2sv";
    }

    public String A4c() {
        return "screen_type_2fa";
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, 0, 0, 2131895081);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("register-2fa +");
        A10.append(this.A0c);
        String A0y = AnonymousClass000.A0y(this.A0d, A10);
        int itemId = menuItem.getItemId();
        if (itemId == 0) {
            this.A0R.A02("verify-2fa");
            ((C58712l8) this.A0a.get()).A01(this, this.A0R, A0y);
            return true;
        } else if (itemId != 1) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            AnonymousClass8BX.A0v(this, this.A0Q);
            return true;
        }
    }

    public void onResume() {
        super.onResume();
        if (this.A06 == null) {
            long j = getPreferences(0).getLong("code_retry_time", -1);
            if (j != -1) {
                A0V(this, j - AnonymousClass8BS.A01(this));
            }
        }
        if (this.A0N.A07()) {
            this.A0N.A02();
        } else {
            this.A0C.requestFocus();
        }
        TextEmojiLabel A0H2 = AnonymousClass8BR.A0H(this, 2131429927);
        AnonymousClass3Ma.A1L(this.A0E, A0H2);
        AnonymousClass3Ma.A1K(A0H2, this.A08);
        if (C18020vd.A05(C18040vf.A02, this.A0J, 5732)) {
            A0H2.setText(2131897201);
            return;
        }
        int i = 2131897203;
        if (AnonymousClass8BU.A02(this) == 18) {
            i = 2131897204;
        }
        A0H2.setText(A3H.A02(this, new C21449AkG(this, 30), getString(i), "forgot-pin"));
    }

    public void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean("shouldShowTheForgetPinDialog", AnonymousClass000.A1W(getSupportFragmentManager().A0Q("forgotPinDialogTag")));
        super.onSaveInstanceState(bundle);
    }

    public void onStart() {
        super.onStart();
        if (this.A0i) {
            this.A0i = true;
            try {
                this.A07.registerObserver(this.A0o);
            } catch (IllegalStateException unused) {
            }
        }
    }

    public void onStop() {
        super.onStop();
        Log.i("VerifyTwoFactorAuth/removeProgressDialog/");
        this.A0i = true;
        this.A07.unregisterObserver(this.A0o);
    }

    public VerifyTwoFactorAuth() {
        this(0);
        this.A0m = false;
        this.A0n = C17890vO.A0D();
        this.A0p = new C21449AkG(this, 31);
        this.A0o = new AQ5(this, 1);
    }
}
