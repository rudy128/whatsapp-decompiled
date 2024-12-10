package com.whatsapp.registration.verifyphone;

import X.A04;
import X.A0K;
import X.A10;
import X.A3H;
import X.A5R;
import X.A80;
import X.A98;
import X.A9B;
import X.ADM;
import X.ADN;
import X.AGE;
import X.AQ5;
import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass0QH;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass10I;
import X.AnonymousClass118;
import X.AnonymousClass11C;
import X.AnonymousClass11J;
import X.AnonymousClass11P;
import X.AnonymousClass11S;
import X.AnonymousClass18K;
import X.AnonymousClass190;
import X.AnonymousClass194;
import X.AnonymousClass19D;
import X.AnonymousClass1DT;
import X.AnonymousClass1K1;
import X.AnonymousClass1K3;
import X.AnonymousClass1KB;
import X.AnonymousClass1LA;
import X.AnonymousClass1LR;
import X.AnonymousClass1LU;
import X.AnonymousClass1MB;
import X.AnonymousClass1OS;
import X.AnonymousClass1YF;
import X.AnonymousClass1YL;
import X.AnonymousClass2SS;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass4PW;
import X.AnonymousClass4VX;
import X.AnonymousClass4Yv;
import X.AnonymousClass74O;
import X.AnonymousClass8BR;
import X.AnonymousClass8BS;
import X.AnonymousClass8BT;
import X.AnonymousClass8BU;
import X.AnonymousClass8BW;
import X.AnonymousClass8BX;
import X.AnonymousClass8C5;
import X.AnonymousClass8C9;
import X.AnonymousClass99E;
import X.AnonymousClass99F;
import X.AnonymousClass99H;
import X.AnonymousClass99I;
import X.AnonymousClass99J;
import X.AnonymousClass99K;
import X.AnonymousClass9VE;
import X.B9O;
import X.C000200d;
import X.C010105w;
import X.C108945cZ;
import X.C108955ca;
import X.C108975cc;
import X.C132216mP;
import X.C134036pu;
import X.C134076py;
import X.C136576u2;
import X.C137116uw;
import X.C139576z4;
import X.C146517Pk;
import X.C146767Qn;
import X.C161248Ck;
import X.C165038aU;
import X.C166638dH;
import X.C166988f1;
import X.C17880vN;
import X.C17890vO;
import X.C17900vP;
import X.C17960vV;
import X.C17970vW;
import X.C18000vb;
import X.C18010vc;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C181679Rk;
import X.C188779hy;
import X.C192309o9;
import X.C192319oA;
import X.C193229pk;
import X.C194099rA;
import X.C194649s4;
import X.C194659s5;
import X.C195429tK;
import X.C196059uO;
import X.C196889vo;
import X.C19740yt;
import X.C19830z4;
import X.C19880zA;
import X.C19890zB;
import X.C19963A0w;
import X.C20329AGl;
import X.C20605ARp;
import X.C21013Ad5;
import X.C21359Aio;
import X.C21364Ait;
import X.C219217x;
import X.C22881Do;
import X.C26145Ct9;
import X.C27301Vn;
import X.C28931bI;
import X.C29781cr;
import X.C29831cw;
import X.C30391dr;
import X.C33641j9;
import X.C33841jT;
import X.C36401np;
import X.C37581pm;
import X.C40751vD;
import X.C57352iw;
import X.C58712l8;
import X.C59772mr;
import X.C63662tU;
import X.C63932tv;
import X.C64052u8;
import X.C72453Mb;
import X.C72463Mc;
import X.C72473Md;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.telephony.TelephonyManager;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.whatsapp.CodeInputField;
import com.whatsapp.SecondaryProcessAbstractAppShellDelegate;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaTextView;
import com.whatsapp.registration.deviceswitching.DeviceSwitchingUseCase$requestWaOldCode$1;
import com.whatsapp.registration.deviceswitching.DeviceSwitchingUseCase$verifyDeviceSwitching$1;
import com.whatsapp.registration.email.EmailOtpUseCase$requestEmailOtp$1;
import com.whatsapp.registration.email.EmailOtpUseCase$verifyEmailOtp$1;
import com.whatsapp.registration.entercode.EnterCodeViewModel;
import com.whatsapp.registration.flashcall.FlashCallViewModel;
import com.whatsapp.registration.phonenumberentry.viewmodel.PasskeyLoginViewModel;
import com.whatsapp.registration.timers.RetryCodeCountdownTimersViewModel;
import com.whatsapp.registration.verifyphone.usecase.RequestCodeUseCase$requestCode$1;
import com.whatsapp.registration.verifyphone.usecase.VerifyCodeUseCase$verifyCode$1;
import com.whatsapp.report.activity.banreport.BanReportViewModel;
import com.whatsapp.util.Log;
import com.whatsapp.wds.components.button.WDSButton;

public class VerifyPhoneNumber extends C166988f1 implements B9O {
    public static int A1m = 6;
    public static int A1n = 6;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public long A0A;
    public long A0B;
    public ProgressDialog A0C;
    public ViewStub A0D;
    public ImageButton A0E;
    public ProgressBar A0F;
    public RelativeLayout A0G;
    public TextView A0H;
    public C010105w A0I;
    public C19880zA A0J;
    public C19880zA A0K;
    public CodeInputField A0L;
    public AnonymousClass1LA A0M;
    public AnonymousClass4PW A0N;
    public AnonymousClass9VE A0O;
    public AnonymousClass194 A0P;
    public C132216mP A0Q;
    public TextEmojiLabel A0R;
    public C40751vD A0S;
    public WaTextView A0T;
    public WaTextView A0U;
    public C29781cr A0V;
    public AnonymousClass118 A0W;
    public C27301Vn A0X;
    public C219217x A0Y;
    public C134036pu A0Z;
    public AnonymousClass18K A0a;
    public C139576z4 A0b;
    public AnonymousClass1MB A0c;
    public AnonymousClass1LU A0d;
    public C18010vc A0e;
    public C19963A0w A0f;
    public AnonymousClass4VX A0g;
    public C196059uO A0h;
    public A98 A0i;
    public C33841jT A0j;
    public C33641j9 A0k;
    public C26145Ct9 A0l;
    public AnonymousClass99E A0m;
    public EnterCodeViewModel A0n;
    public FlashCallViewModel A0o;
    public C57352iw A0p;
    public PasskeyLoginViewModel A0q;
    public C192319oA A0r;
    public RetryCodeCountdownTimersViewModel A0s;
    public C161248Ck A0t;
    public A10 A0u;
    public A5R A0v;
    public VerifyPhoneNumberViewModel A0w;
    public BanReportViewModel A0x;
    public C136576u2 A0y;
    public C36401np A0z;
    public C28931bI A10;
    public WDSButton A11;
    public AnonymousClass00H A12;
    public AnonymousClass00H A13;
    public AnonymousClass00H A14;
    public AnonymousClass00H A15;
    public AnonymousClass00H A16;
    public AnonymousClass00H A17;
    public AnonymousClass00H A18;
    public AnonymousClass00H A19;
    public AnonymousClass00H A1A;
    public AnonymousClass00H A1B;
    public AnonymousClass00H A1C;
    public AnonymousClass00H A1D;
    public AnonymousClass00H A1E;
    public AnonymousClass00H A1F;
    public AnonymousClass00H A1G;
    public String A1H;
    public String A1I;
    public String A1J;
    public String A1K;
    public String A1L;
    public String A1M;
    public boolean A1N;
    public boolean A1O;
    public boolean A1P;
    public boolean A1Q;
    public boolean A1R;
    public boolean A1S;
    public boolean A1T;
    public boolean A1U;
    public boolean A1V;
    public boolean A1W;
    public boolean A1X;
    public boolean A1Y;
    public boolean A1Z;
    public int A1a;
    public WaTextView A1b;
    public WaTextView A1c;
    public AnonymousClass8C9 A1d;
    public AnonymousClass8C5 A1e;
    public String A1f;
    public String A1g;
    public boolean A1h;
    public boolean A1i;
    public boolean A1j;
    public boolean A1k;
    public final AnonymousClass11J A1l;

    private SpannableStringBuilder A10(Runnable runnable, String str, boolean z) {
        int i;
        if (C18020vd.A05(C18040vf.A02, this.A00, 6290)) {
            i = AnonymousClass3Ma.A00(this, 2130971935, 2131103036);
        } else {
            i = 0;
        }
        return A3H.A00(this, (TextAppearanceSpan) null, new C146517Pk(this, runnable, 49), str, "edit-number", i, z);
    }

    public static final String A13(Intent intent) {
        String str;
        Uri data;
        String path;
        C18070vi.A0d(intent, 0);
        if (SecondaryProcessAbstractAppShellDelegate.COMPRESSED_WHATSAPP_LIB_NAME.equals(intent.getScheme())) {
            Uri data2 = intent.getData();
            if (data2 != null && "r".equals(data2.getHost())) {
                str = data2.getQueryParameter("c");
            }
            str = null;
        } else {
            if (("http".equals(intent.getScheme()) || "https".equals(intent.getScheme())) && (data = intent.getData()) != null && "v.whatsapp.com".equals(data.getHost()) && (path = data.getPath()) != null) {
                str = C108955ca.A0z(path, AnonymousClass1YF.A0E(path, "/", path.length() - 1) + 1);
            }
            str = null;
        }
        C17900vP.A0f("VerifyPhoneNumberUtils/getCodeFromVerificationLink/code/", str, AnonymousClass000.A10());
        return str;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x005a, code lost:
        r0 = X.AnonymousClass3MW.A0x(r10, r15, new java.lang.Object[r3], 0, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0087, code lost:
        r15 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x003d, code lost:
        if (r0 == -1) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x003f, code lost:
        r0 = r0 - java.lang.System.currentTimeMillis();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0048, code lost:
        if (r0 <= 0) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x004a, code lost:
        r2 = new java.lang.Object[2];
        r2[0] = r15;
        r0 = X.AnonymousClass3MW.A0x(r10, X.C64052u8.A0A(r12, r0), r2, r3, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0056, code lost:
        X.C18070vi.A0b(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0059, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String A15(android.content.res.Resources r10, X.AnonymousClass11P r11, X.C18000vb r12, X.A5R r13, java.lang.String r14, java.lang.String r15) {
        /*
            r4 = 0
            boolean r3 = X.C18070vi.A17(r10, r12)
            r5 = 2
            X.C72473Md.A1M(r13, r15, r11, r5)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "VerifyPhoneNumberUtils/getRequestCodeTooManyTriesErrorMsg/method="
            X.C17900vP.A0f(r0, r14, r1)
            r0 = 2131897802(0x7f122dca, float:1.9430504E38)
            java.lang.String r7 = X.AnonymousClass3MY.A0m(r10, r0)
            java.lang.String r0 = "sms"
            long r0 = X.A5R.A00(r13, r0)
            int r2 = r14.hashCode()
            java.lang.String r6 = "voice"
            switch(r2) {
                case -795576526: goto L_0x007b;
                case 112386354: goto L_0x006e;
                case 2120743944: goto L_0x0061;
                default: goto L_0x0028;
            }
        L_0x0028:
            long r0 = X.A5R.A00(r13, r6)
            r2 = 2131897815(0x7f122dd7, float:1.943053E38)
            java.lang.String r15 = X.AnonymousClass3MY.A0m(r10, r2)
            r9 = 2131895011(0x7f1222e3, float:1.9424843E38)
            r8 = 2131895012(0x7f1222e4, float:1.9424845E38)
        L_0x0039:
            r6 = -1
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 == 0) goto L_0x005a
            long r6 = java.lang.System.currentTimeMillis()
            long r0 = r0 - r6
            r6 = 0
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 <= 0) goto L_0x005a
            java.lang.Object[] r2 = new java.lang.Object[r5]
            r2[r4] = r15
            java.lang.String r0 = X.C64052u8.A0A(r12, r0)
            java.lang.String r0 = X.AnonymousClass3MW.A0x(r10, r0, r2, r3, r8)
        L_0x0056:
            X.C18070vi.A0b(r0)
            return r0
        L_0x005a:
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.String r0 = X.AnonymousClass3MW.A0x(r10, r15, r0, r4, r9)
            goto L_0x0056
        L_0x0061:
            boolean r2 = X.AnonymousClass8BR.A1X(r14)
            if (r2 == 0) goto L_0x0028
            r9 = 2131895270(0x7f1223e6, float:1.9425368E38)
            r8 = 2131895271(0x7f1223e7, float:1.942537E38)
            goto L_0x0087
        L_0x006e:
            boolean r2 = r14.equals(r6)
            if (r2 == 0) goto L_0x0028
            r9 = 2131895015(0x7f1222e7, float:1.9424851E38)
            r8 = 2131895016(0x7f1222e8, float:1.9424853E38)
            goto L_0x0039
        L_0x007b:
            boolean r2 = X.AnonymousClass8BR.A1W(r14)
            if (r2 == 0) goto L_0x0028
            r9 = 2131895019(0x7f1222eb, float:1.942486E38)
            r8 = 2131895020(0x7f1222ec, float:1.9424861E38)
        L_0x0087:
            r15 = r7
            goto L_0x0039
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.verifyphone.VerifyPhoneNumber.A15(android.content.res.Resources, X.11P, X.0vb, X.A5R, java.lang.String, java.lang.String):java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a5 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A19() {
        /*
            r13 = this;
            r6 = r13
            X.11C r2 = r13.A08
            X.17x r1 = r13.A0Y
            X.00H r0 = r13.A1C
            java.lang.Object r0 = r0.get()
            X.1yi r0 = (X.C42771yi) r0
            java.util.ArrayList r1 = X.C20056A5f.A03(r0, r2, r1)
            X.1LA r0 = r13.A0M
            java.util.ArrayList r2 = X.C63942tw.A05(r0, r1)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = r13.A1H
            r1.append(r0)
            java.lang.String r0 = r13.A1J
            java.lang.String r5 = X.AnonymousClass000.A0y(r0, r1)
            X.00H r0 = r13.A1C
            java.lang.Object r4 = r0.get()
            X.1yi r4 = (X.C42771yi) r4
            int r0 = r2.size()
            if (r0 != 0) goto L_0x0074
            r2 = -1
        L_0x0035:
            X.19D r1 = r13.A00
            X.0z4 r0 = r13.A0A
            X.99F r7 = X.A9B.A0B(r0, r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r7.A03 = r0
            X.0z4 r0 = r13.A0A
            boolean r0 = r0.A2O()
            r12 = 1
            if (r0 == 0) goto L_0x0052
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r12)
            r7.A02 = r0
        L_0x0052:
            boolean r0 = X.AnonymousClass8BR.A1M(r13)
            if (r0 != 0) goto L_0x00a7
            android.content.SharedPreferences r2 = X.C72453Mb.A0M(r13)
            java.lang.String r0 = "flash_call_eligible"
            r1 = 0
            int r0 = r2.getInt(r0, r1)
            if (r0 >= r12) goto L_0x00a7
            java.lang.String r0 = "VerifyPhoneNumber/maybeAttemptFlashCall/should not request flash call"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r12)
            r7.A00 = r0
            r13.A1b(r7, r1)
            return
        L_0x0074:
            java.util.Iterator r3 = r2.iterator()
        L_0x0078:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00a5
            java.lang.Object r2 = r3.next()
            X.4cN r2 = (X.C89384cN) r2
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = r2.A00
            r1.append(r0)
            java.lang.String r0 = r2.A02
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
            X.2Qh r1 = r4.A0D(r5, r0)
            X.2Qh r0 = X.C49392Qh.EXACT_MATCH
            if (r1 == r0) goto L_0x00a3
            X.2Qh r0 = X.C49392Qh.SHORT_NSN_MATCH
            if (r1 == r0) goto L_0x00a3
            X.2Qh r0 = X.C49392Qh.NSN_MATCH
            if (r1 != r0) goto L_0x0078
        L_0x00a3:
            r2 = 1
            goto L_0x0035
        L_0x00a5:
            r2 = 0
            goto L_0x0035
        L_0x00a7:
            java.lang.String r0 = "VerifyPhoneNumber/maybeAttemptFlashCall/should request flash call"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r8 = r13.A1H
            java.lang.String r9 = r13.A1J
            X.C17960vV.A07(r9)
            r11 = 0
            java.lang.String r10 = "flash"
            r6.A1a(r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.verifyphone.VerifyPhoneNumber.A19():void");
    }

    private void A1a(AnonymousClass99F r19, String str, String str2, String str3, String str4, boolean z) {
        String str5;
        int i;
        if (!C19963A0w.A00(this) || (i = this.A00) == 2 || i == 3) {
            if (C18020vd.A05(C18040vf.A02, this.A00, 7694)) {
                A1f(this);
            }
            AnonymousClass99H r5 = this.A0w.A06;
            C37581pm A002 = AnonymousClass2SS.A00(this);
            int i2 = this.A02;
            if (this.A07.A06()) {
                str5 = "twofac_reset";
            } else {
                int i3 = this.A02;
                if (i3 == 2 || i3 == 1) {
                    str5 = "account_defence";
                } else if (i3 == 3) {
                    str5 = "ban_appeal";
                } else {
                    str5 = null;
                }
            }
            int A0A2 = this.A0A.A0A();
            int A0B2 = this.A0A.A0B();
            int A092 = this.A0A.A09();
            String str6 = str;
            String str7 = str2;
            C72473Md.A1J(str6, str7);
            AnonymousClass3MX.A1Q(new RequestCodeUseCase$requestCode$1(r19, r5, str3, (String) null, str6, str7, str4, str5, (C30391dr) null, i2, A0A2, A0B2, A092, z), A002);
            return;
        }
        Log.w("VerifyPhoneNumber/executeRequestCodeTask should not request code yet, returning");
    }

    private void A1b(AnonymousClass99F r13, boolean z) {
        AnonymousClass19D r1 = this.A00;
        C18040vf r2 = C18040vf.A02;
        if (C18020vd.A05(r2, r1, 7694) && C18020vd.A05(r2, this.A00, 7475)) {
            Object[] A1b2 = AnonymousClass3MW.A1b();
            this.A0R.setText(A9B.A04(A10((Runnable) null, C17880vN.A0q(this, A12(), A1b2, 1, 2131897816), C72453Mb.A1b(A1b2, A1m)), AnonymousClass3Ma.A00(this, 2130971979, 2131103154), C19740yt.A00(this, AnonymousClass1YL.A00(this, 2130971935, 2131103036))));
        }
        A1a(r13, this.A1H, this.A1J, "voice", (String) null, z);
    }

    private void A1c(C195429tK r11) {
        this.A0j.A0A();
        this.A0u.A01();
        if (!AnonymousClass4Yv.A02(this)) {
            AnonymousClass11P r4 = this.A05;
            AnonymousClass11C r3 = this.A08;
            C18000vb r5 = this.A00;
            C18030ve r6 = this.A0E;
            C36401np r9 = this.A0z;
            new C166638dH(this, this.A01, r3, r4, r5, r6, this.A0d, r11, r9).show();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0030, code lost:
        if (r1 == 5) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x03ca, code lost:
        if (r14.A0Y.A02("android.permission.RECEIVE_SMS") == 0) goto L_0x03cc;
     */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0469  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x00e8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A1f(com.whatsapp.registration.verifyphone.VerifyPhoneNumber r14) {
        /*
            r3 = 0
            r14.A1z(r3)
            com.whatsapp.TextEmojiLabel r0 = r14.A0R
            r0.setVisibility(r3)
            android.widget.RelativeLayout r0 = r14.A0G
            r0.setVisibility(r3)
            android.view.ViewStub r0 = r14.A0D
            r5 = 8
            r0.setVisibility(r5)
            android.widget.TextView r4 = r14.A0H
            r2 = 2131897764(0x7f122da4, float:1.9430427E38)
            r6 = 1
            java.lang.Object[] r1 = new java.lang.Object[r6]
            int r0 = A1m
            X.C17880vN.A1T(r1, r0, r3)
            X.AnonymousClass3MY.A0y(r14, r4, r1, r2)
            com.whatsapp.WaTextView r4 = r14.A0T
            int r1 = r14.A02
            r9 = 5
            r2 = 4
            if (r1 == r2) goto L_0x0032
            r0 = 2131897811(0x7f122dd3, float:1.9430522E38)
            if (r1 != r9) goto L_0x0035
        L_0x0032:
            r0 = 2131897798(0x7f122dc6, float:1.9430496E38)
        L_0x0035:
            r4.setText(r0)
            java.lang.String r4 = r14.A12()
            X.1CM r0 = r14.A07
            boolean r0 = r0.A03()
            r8 = 0
            if (r0 == 0) goto L_0x0140
            android.widget.RelativeLayout r0 = r14.A0G
            r0.setVisibility(r5)
            android.widget.TextView r0 = r14.A0H
            r0.setVisibility(r5)
            com.whatsapp.WaTextView r1 = r14.A0T
            r0 = 2131893576(0x7f121d48, float:1.9421932E38)
            r1.setText(r0)
            r1 = 2131893575(0x7f121d47, float:1.942193E38)
            java.lang.String r0 = X.C17890vO.A0R(r14, r4, r6, r3, r1)
            android.text.SpannableString r7 = new android.text.SpannableString
            r7.<init>(r0)
            java.lang.String r1 = r14.getString(r1)
            java.lang.String r0 = "%s"
            int r5 = r1.indexOf(r0)
            int r3 = r4.length()
            int r3 = r3 + r5
            android.text.style.StyleSpan r0 = new android.text.style.StyleSpan
            r0.<init>(r6)
            r2 = 33
            r7.setSpan(r0, r5, r3, r2)
            r1 = 2130971979(0x7f040d4b, float:1.7552712E38)
            r0 = 2131103154(0x7f060db2, float:1.7818766E38)
            int r1 = X.AnonymousClass3Ma.A00(r14, r1, r0)
            android.text.style.ForegroundColorSpan r0 = new android.text.style.ForegroundColorSpan
            r0.<init>(r1)
            r7.setSpan(r0, r5, r3, r2)
            com.whatsapp.TextEmojiLabel r0 = r14.A0R
            r0.setText(r7)
        L_0x0093:
            r14.A1K = r8
        L_0x0095:
            java.lang.String r0 = "VerifyPhoneNumber/refreshAudioGuidance"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0vl r0 = r14.A01
            java.lang.Object r1 = r0.getValue()
            com.whatsapp.registration.audioguidance.RegistrationAudioGuidanceViewModel r1 = (com.whatsapp.registration.audioguidance.RegistrationAudioGuidanceViewModel) r1
            r0 = 0
            r1.A0U(r0)
            r14.invalidateOptionsMenu()
            r14.A4d()
            java.lang.String r0 = "VerifyPhoneNumber/initializeBottomSheetEntryText/hide request code buttons in bottom sheet"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 2131430792(0x7f0b0d88, float:1.8483295E38)
            android.view.View r0 = X.C110885hR.A0A(r14, r0)
            com.whatsapp.WaTextView r0 = (com.whatsapp.WaTextView) r0
            r14.A0U = r0
            r0 = 2131430791(0x7f0b0d87, float:1.8483293E38)
            android.view.View r0 = X.C110885hR.A0A(r14, r0)
            com.whatsapp.wds.components.button.WDSButton r0 = (com.whatsapp.wds.components.button.WDSButton) r0
            r14.A11 = r0
            X.1GP r2 = r14.getSupportFragmentManager()
            r0 = 5
            X.AGb r1 = new X.AGb
            r1.<init>(r14, r0)
            java.lang.String r0 = "REQUEST_SERVER_DRIVEN_OTP_FRAGMENT_RESULT"
            r2.A0t(r1, r14, r0)
            X.1CM r0 = r14.A07
            boolean r0 = r0.A03()
            r4 = 8
            if (r0 != 0) goto L_0x0469
            X.1CM r0 = r14.A07
            boolean r0 = r0.A05()
            if (r0 != 0) goto L_0x0469
            boolean r0 = X.AnonymousClass8BR.A1N(r14)
            if (r0 == 0) goto L_0x00fb
            com.whatsapp.WaTextView r0 = r14.A0U
            r1 = 2131898303(0x7f122fbf, float:1.943152E38)
            r0.setText(r1)
            com.whatsapp.wds.components.button.WDSButton r0 = r14.A11
            r0.setText(r1)
        L_0x00fb:
            java.lang.Boolean r0 = A11(r14)
            boolean r0 = r0.booleanValue()
            r3 = 0
            if (r0 == 0) goto L_0x0118
            com.whatsapp.WaTextView r0 = r14.A0U
            r0.setVisibility(r4)
            com.whatsapp.wds.components.button.WDSButton r0 = r14.A11
            r0.setVisibility(r3)
            com.whatsapp.wds.components.button.WDSButton r1 = r14.A11
            r0 = 40
        L_0x0114:
            X.AnonymousClass3MZ.A1L(r1, r14, r0)
            return
        L_0x0118:
            X.19D r2 = r14.A00
            r1 = 8780(0x224c, float:1.2303E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r1 = X.C18020vd.A05(r0, r2, r1)
            com.whatsapp.WaTextView r0 = r14.A0U
            if (r1 == 0) goto L_0x0133
            r0.setVisibility(r4)
            com.whatsapp.wds.components.button.WDSButton r0 = r14.A11
            r0.setVisibility(r3)
            com.whatsapp.wds.components.button.WDSButton r1 = r14.A11
            r0 = 41
            goto L_0x0114
        L_0x0133:
            r0.setVisibility(r3)
            com.whatsapp.wds.components.button.WDSButton r0 = r14.A11
            r0.setVisibility(r4)
            com.whatsapp.WaTextView r1 = r14.A0U
            r0 = 42
            goto L_0x0114
        L_0x0140:
            X.1CM r0 = r14.A07
            boolean r0 = r0.A05()
            if (r0 == 0) goto L_0x015c
            android.widget.RelativeLayout r0 = r14.A0G
            r0.setVisibility(r5)
            android.widget.TextView r0 = r14.A0H
            r0.setVisibility(r5)
            com.whatsapp.TextEmojiLabel r1 = r14.A0R
            r0 = 2131896147(0x7f122753, float:1.9427147E38)
            r1.setText(r0)
            goto L_0x0093
        L_0x015c:
            boolean r0 = X.AnonymousClass8BR.A1M(r14)
            if (r0 == 0) goto L_0x019e
            r0 = 2131897771(0x7f122dab, float:1.943044E38)
            java.lang.String r0 = X.C17890vO.A0R(r14, r4, r6, r3, r0)
            android.text.SpannableStringBuilder r3 = r14.A10(r8, r0, r3)
            r1 = 2130971979(0x7f040d4b, float:1.7552712E38)
            r0 = 2131103154(0x7f060db2, float:1.7818766E38)
            int r2 = X.AnonymousClass3Ma.A00(r14, r1, r0)
            r1 = 2130971935(0x7f040d1f, float:1.7552622E38)
            r0 = 2131103036(0x7f060d3c, float:1.7818527E38)
            int r0 = X.AnonymousClass1YL.A00(r14, r1, r0)
            int r0 = X.C19740yt.A00(r14, r0)
            android.text.SpannableStringBuilder r1 = X.A9B.A04(r3, r2, r0)
            com.whatsapp.TextEmojiLabel r0 = r14.A0R
            r0.setText(r1)
            android.widget.RelativeLayout r0 = r14.A0G
            r0.setVisibility(r5)
            android.widget.TextView r0 = r14.A0H
            r0.setVisibility(r5)
            java.lang.String r0 = "verify_pn_flash_call"
        L_0x019a:
            r14.A1K = r0
            goto L_0x0095
        L_0x019e:
            boolean r0 = X.AnonymousClass8BR.A1O(r14)
            if (r0 == 0) goto L_0x01d0
            com.whatsapp.WaTextView r1 = r14.A0T
            r0 = 2131888274(0x7f120892, float:1.9411179E38)
            r1.setText(r0)
            java.lang.String r4 = r14.A1g
            if (r4 == 0) goto L_0x01c7
            com.whatsapp.TextEmojiLabel r2 = r14.A0R
            r1 = 2131888336(0x7f1208d0, float:1.9411304E38)
            java.lang.Object[] r0 = new java.lang.Object[r6]
            r0[r3] = r4
            X.AnonymousClass3MY.A0y(r14, r2, r0, r1)
        L_0x01bc:
            com.whatsapp.TextEmojiLabel r1 = r14.A0R
            r0 = 2131888337(0x7f1208d1, float:1.9411306E38)
            X.AnonymousClass3MY.A0w(r14, r1, r0)
            java.lang.String r0 = "verify_pn_email"
            goto L_0x019a
        L_0x01c7:
            com.whatsapp.TextEmojiLabel r1 = r14.A0R
            r0 = 2131888337(0x7f1208d1, float:1.9411306E38)
            r1.setText(r0)
            goto L_0x01bc
        L_0x01d0:
            boolean r0 = X.AnonymousClass8BR.A1N(r14)
            r7 = 2
            if (r0 == 0) goto L_0x02ba
            java.lang.String r0 = "verify_pn_device_switching"
            r14.A1K = r0
            com.whatsapp.WaTextView r0 = r14.A1b
            if (r0 != 0) goto L_0x0228
            android.view.ViewStub r0 = r14.A0D
            android.view.View r1 = r0.inflate()
            r0 = 2131436731(0x7f0b24bb, float:1.849534E38)
            com.whatsapp.WaTextView r0 = X.AnonymousClass3MW.A0T(r1, r0)
            r14.A1c = r0
            r0 = 2131436730(0x7f0b24ba, float:1.8495339E38)
            com.whatsapp.WaTextView r0 = X.AnonymousClass3MW.A0T(r1, r0)
            r14.A1b = r0
            X.19D r2 = r14.A00
            r1 = 4250(0x109a, float:5.956E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r2 = X.C18020vd.A05(r0, r2, r1)
            android.content.SharedPreferences r1 = X.C72453Mb.A0M(r14)
            java.lang.String r0 = "pref_wa_old_for_uc"
            boolean r0 = r1.getBoolean(r0, r3)
            if (r0 == 0) goto L_0x0240
            com.whatsapp.WaTextView r1 = r14.A1c
            r0 = 2131897824(0x7f122de0, float:1.9430548E38)
            r1.setText(r0)
            com.whatsapp.WaTextView r8 = r14.A1b
            r9 = 2131897823(0x7f122ddf, float:1.9430546E38)
        L_0x021a:
            java.lang.Object[] r1 = new java.lang.Object[r6]
            int r0 = A1m
            X.C17880vN.A1T(r1, r0, r3)
            java.lang.String r0 = r14.getString(r9, r1)
        L_0x0225:
            r8.setText(r0)
        L_0x0228:
            android.view.ViewStub r0 = r14.A0D
            r0.setVisibility(r3)
            com.whatsapp.WaTextView r2 = r14.A0T
            r1 = 2131897822(0x7f122dde, float:1.9430544E38)
            java.lang.Object[] r0 = new java.lang.Object[r6]
            r0[r3] = r4
            X.AnonymousClass3MY.A0y(r14, r2, r0, r1)
            com.whatsapp.TextEmojiLabel r0 = r14.A0R
            r0.setVisibility(r5)
            goto L_0x0095
        L_0x0240:
            boolean r0 = r14.A1i
            if (r0 == 0) goto L_0x027d
            java.lang.String r0 = "VerifyPhoneNumber/isAddingNewAccount"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r14.A1K = r8
            com.whatsapp.WaTextView r1 = r14.A1c
            r0 = 2131886397(0x7f12013d, float:1.9407372E38)
            r1.setText(r0)
            if (r2 == 0) goto L_0x025b
            com.whatsapp.WaTextView r8 = r14.A1b
            r9 = 2131886395(0x7f12013b, float:1.9407368E38)
            goto L_0x021a
        L_0x025b:
            java.lang.String r0 = r14.A1M
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0277
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "VerifyPhoneNumber/isAddingNewAccount/waOldDeviceName: "
            r1.append(r0)
            java.lang.String r0 = r14.A1M
            X.C17890vO.A1A(r1, r0)
            com.whatsapp.WaTextView r8 = r14.A1b
            r2 = 2131886396(0x7f12013c, float:1.940737E38)
            goto L_0x02a5
        L_0x0277:
            com.whatsapp.WaTextView r8 = r14.A1b
            r9 = 2131886394(0x7f12013a, float:1.9407366E38)
            goto L_0x021a
        L_0x027d:
            if (r2 == 0) goto L_0x028d
            com.whatsapp.WaTextView r1 = r14.A1c
            r0 = 2131897821(0x7f122ddd, float:1.9430542E38)
            r1.setText(r0)
            com.whatsapp.WaTextView r8 = r14.A1b
            r9 = 2131897818(0x7f122dda, float:1.9430536E38)
            goto L_0x021a
        L_0x028d:
            java.lang.String r0 = r14.A1M
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            com.whatsapp.WaTextView r1 = r14.A1c
            r0 = 2131897820(0x7f122ddc, float:1.943054E38)
            r1.setText(r0)
            com.whatsapp.WaTextView r8 = r14.A1b
            r9 = 2131897817(0x7f122dd9, float:1.9430534E38)
            if (r2 != 0) goto L_0x021a
            r2 = 2131897819(0x7f122ddb, float:1.9430538E38)
        L_0x02a5:
            java.lang.Object[] r1 = new java.lang.Object[r7]
            java.lang.String r0 = r14.A1M
            r1[r3] = r0
            int r0 = A1m
            X.C17880vN.A1T(r1, r0, r6)
            java.lang.String r0 = r14.getString(r2, r1)
            android.text.Spanned r0 = android.text.Html.fromHtml(r0)
            goto L_0x0225
        L_0x02ba:
            boolean r0 = X.C19963A0w.A00(r14)
            if (r0 == 0) goto L_0x030b
            X.A0w r0 = r14.A0f
            X.6py r0 = r0.A01
            X.9o9 r1 = r0.A05
            long r6 = r1.A00()
            long r4 = r1.A01()
            java.lang.String r0 = "AccountDefenceLocalDataRepository/clear-original-wait-time-diffs"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0vc r1 = r1.A00
            java.lang.String r0 = "AccountDefenceLocalDataRepository_prefs"
            android.content.SharedPreferences$Editor r3 = X.AnonymousClass8BU.A08(r1, r0)
            r1 = 0
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x02e6
            java.lang.String r0 = "com.whatsapp.registration.accountdefence.AccountDefenceLocalDataRepository.account_defence_original_sms_wait_time"
            r3.remove(r0)
        L_0x02e6:
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x02ef
            java.lang.String r0 = "com.whatsapp.registration.accountdefence.AccountDefenceLocalDataRepository.account_defence_original_voice_wait_time"
            r3.remove(r0)
        L_0x02ef:
            r3.apply()
            com.whatsapp.TextEmojiLabel r5 = r14.A0R
            X.A0w r4 = r14.A0f
            int r3 = r14.A00
            X.0vb r2 = r14.A00
            java.lang.String r1 = r14.A1H
            java.lang.String r0 = r14.A1J
            java.lang.String r0 = X.A9B.A0G(r2, r1, r0)
            android.text.SpannableStringBuilder r0 = r4.A01(r14, r0, r3)
            r5.setText(r0)
            goto L_0x0093
        L_0x030b:
            X.1CM r0 = r14.A07
            int r0 = r0.A00(r3)
            if (r0 != r9) goto L_0x035c
            com.whatsapp.TextEmojiLabel r1 = r14.A0R
            X.0ve r0 = r14.A0E
            X.AnonymousClass3Ma.A1L(r0, r1)
            com.whatsapp.TextEmojiLabel r1 = r14.A0R
            X.11C r0 = r14.A08
            X.AnonymousClass3Ma.A1K(r1, r0)
            r2 = 2131897816(0x7f122dd8, float:1.9430532E38)
            java.lang.Object[] r1 = new java.lang.Object[r7]
            int r0 = A1m
            X.C17880vN.A1T(r1, r0, r3)
            java.lang.String r0 = r14.A12()
            java.lang.String r0 = X.C17880vN.A0q(r14, r0, r1, r6, r2)
            android.text.SpannableStringBuilder r3 = r14.A10(r8, r0, r3)
            r1 = 2130971979(0x7f040d4b, float:1.7552712E38)
            r0 = 2131103154(0x7f060db2, float:1.7818766E38)
            int r2 = X.AnonymousClass3Ma.A00(r14, r1, r0)
            r1 = 2130971935(0x7f040d1f, float:1.7552622E38)
            r0 = 2131103036(0x7f060d3c, float:1.7818527E38)
            int r0 = X.AnonymousClass1YL.A00(r14, r1, r0)
            int r0 = X.C19740yt.A00(r14, r0)
            android.text.SpannableStringBuilder r1 = X.A9B.A04(r3, r2, r0)
            com.whatsapp.TextEmojiLabel r0 = r14.A0R
            r0.setText(r1)
            java.lang.String r0 = "verify_pn_voice_call"
            goto L_0x019a
        L_0x035c:
            long r12 = java.lang.System.currentTimeMillis()
            com.whatsapp.TextEmojiLabel r1 = r14.A0R
            X.0ve r0 = r14.A0E
            X.AnonymousClass3Ma.A1L(r0, r1)
            com.whatsapp.TextEmojiLabel r1 = r14.A0R
            X.11C r0 = r14.A08
            X.AnonymousClass3Ma.A1K(r1, r0)
            X.A5R r1 = r14.A0v
            java.lang.String r0 = "sms"
            long r10 = X.A5R.A00(r1, r0)
            int r0 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r0 <= 0) goto L_0x03bd
            X.A5R r1 = r14.A0v
            java.lang.String r0 = "voice"
            long r9 = X.A5R.A00(r1, r0)
            long r9 = r9 - r12
            r7 = 5000(0x1388, double:2.4703E-320)
            int r1 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            r0 = 2131897810(0x7f122dd2, float:1.943052E38)
            if (r1 >= 0) goto L_0x038f
            r0 = 2131897804(0x7f122dcc, float:1.9430508E38)
        L_0x038f:
            java.lang.String r1 = X.C17890vO.A0R(r14, r4, r6, r3, r0)
            r0 = 0
            android.text.SpannableStringBuilder r3 = r14.A10(r0, r1, r3)
            r1 = 2130971979(0x7f040d4b, float:1.7552712E38)
            r0 = 2131103154(0x7f060db2, float:1.7818766E38)
            int r2 = X.AnonymousClass3Ma.A00(r14, r1, r0)
            r1 = 2130971935(0x7f040d1f, float:1.7552622E38)
            r0 = 2131103036(0x7f060d3c, float:1.7818527E38)
            int r0 = X.AnonymousClass1YL.A00(r14, r1, r0)
            int r0 = X.C19740yt.A00(r14, r0)
            android.text.SpannableStringBuilder r1 = X.A9B.A04(r3, r2, r0)
            com.whatsapp.TextEmojiLabel r0 = r14.A0R
            r0.setText(r1)
            java.lang.String r0 = "verify_pn_cannot_send_sms"
            goto L_0x019a
        L_0x03bd:
            boolean r0 = r14.A1Z
            if (r0 != 0) goto L_0x03cc
            X.17x r1 = r14.A0Y
            java.lang.String r0 = "android.permission.RECEIVE_SMS"
            int r0 = r1.A02(r0)
            r8 = 0
            if (r0 != 0) goto L_0x03cd
        L_0x03cc:
            r8 = 1
        L_0x03cd:
            int r0 = r14.A02
            if (r0 == r2) goto L_0x0449
            if (r0 == r9) goto L_0x0449
            X.1CM r0 = r14.A07
            boolean r0 = r0.A06()
            if (r0 == 0) goto L_0x0413
            r0 = 2131897806(0x7f122dce, float:1.9430512E38)
            if (r8 == 0) goto L_0x03e3
            r0 = 2131897808(0x7f122dd0, float:1.9430516E38)
        L_0x03e3:
            java.lang.String r1 = X.C17890vO.A0R(r14, r4, r6, r3, r0)
        L_0x03e7:
            r0 = 0
            android.text.SpannableStringBuilder r3 = r14.A10(r0, r1, r3)
            r1 = 2130971979(0x7f040d4b, float:1.7552712E38)
            r0 = 2131103154(0x7f060db2, float:1.7818766E38)
            int r2 = X.AnonymousClass3Ma.A00(r14, r1, r0)
            r1 = 2130971935(0x7f040d1f, float:1.7552622E38)
            r0 = 2131103036(0x7f060d3c, float:1.7818527E38)
            int r0 = X.AnonymousClass1YL.A00(r14, r1, r0)
            int r0 = X.C19740yt.A00(r14, r0)
            android.text.SpannableStringBuilder r1 = X.A9B.A04(r3, r2, r0)
            com.whatsapp.TextEmojiLabel r0 = r14.A0R
            r0.setText(r1)
            if (r8 == 0) goto L_0x0465
            java.lang.String r0 = "verify_pn_auto_sms"
            goto L_0x019a
        L_0x0413:
            boolean r0 = r14.A1i
            if (r0 == 0) goto L_0x041b
            r0 = 2131886393(0x7f120139, float:1.9407364E38)
            goto L_0x03e3
        L_0x041b:
            X.19D r2 = r14.A00
            r1 = 7475(0x1d33, float:1.0475E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0440
            r2 = 2131897807(0x7f122dcf, float:1.9430514E38)
            if (r8 == 0) goto L_0x042f
            r2 = 2131897809(0x7f122dd1, float:1.9430518E38)
        L_0x042f:
            java.lang.Object[] r1 = new java.lang.Object[r7]
            int r0 = A1m
            X.C17880vN.A1T(r1, r0, r3)
            java.lang.String r1 = X.C17880vN.A0q(r14, r4, r1, r6, r2)
            android.widget.TextView r0 = r14.A0H
            r0.setVisibility(r5)
            goto L_0x03e7
        L_0x0440:
            r0 = 2131897805(0x7f122dcd, float:1.943051E38)
            if (r8 == 0) goto L_0x03e3
            r0 = 2131897803(0x7f122dcb, float:1.9430506E38)
            goto L_0x03e3
        L_0x0449:
            android.widget.TextView r0 = r14.A0H
            r0.setVisibility(r5)
            int r1 = r14.A02
            r0 = 4
            r2 = 2131897768(0x7f122da8, float:1.9430435E38)
            if (r1 != r0) goto L_0x0459
            r2 = 2131897767(0x7f122da7, float:1.9430433E38)
        L_0x0459:
            java.lang.Object[] r1 = new java.lang.Object[r7]
            int r0 = A1m
            X.C17880vN.A1T(r1, r0, r3)
            java.lang.String r1 = X.C17880vN.A0q(r14, r4, r1, r6, r2)
            goto L_0x03e7
        L_0x0465:
            java.lang.String r0 = "verify_pn_manual_sms"
            goto L_0x019a
        L_0x0469:
            com.whatsapp.WaTextView r0 = r14.A0U
            r0.setVisibility(r4)
            com.whatsapp.wds.components.button.WDSButton r0 = r14.A11
            r0.setVisibility(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.verifyphone.VerifyPhoneNumber.A1f(com.whatsapp.registration.verifyphone.VerifyPhoneNumber):void");
    }

    public static void A1g(VerifyPhoneNumber verifyPhoneNumber) {
        VerifyPhoneNumber verifyPhoneNumber2 = verifyPhoneNumber;
        if (verifyPhoneNumber.A1Z) {
            verifyPhoneNumber.A1k = true;
            ((C29831cw) verifyPhoneNumber.A1F.get()).A00(verifyPhoneNumber2, verifyPhoneNumber.A1e, new IntentFilter("com.google.android.gms.auth.api.phone.SMS_RETRIEVED"), "com.google.android.gms.auth.api.phone.permission.SEND", (Handler) null, true);
            return;
        }
        IntentFilter intentFilter = new IntentFilter("android.provider.Telephony.SMS_RECEIVED");
        intentFilter.setPriority(Integer.MAX_VALUE);
        ((C29831cw) verifyPhoneNumber.A1F.get()).A01(verifyPhoneNumber, verifyPhoneNumber.A1d, intentFilter, true);
        verifyPhoneNumber.A1j = true;
    }

    public static void A1j(VerifyPhoneNumber verifyPhoneNumber) {
        VerifyPhoneNumber verifyPhoneNumber2 = verifyPhoneNumber;
        View view = verifyPhoneNumber.A00;
        boolean z = true;
        boolean A1T2 = AnonymousClass000.A1T(verifyPhoneNumber.A02, 2);
        if (!AnonymousClass8BR.A1N(verifyPhoneNumber) && !AnonymousClass8BR.A1O(verifyPhoneNumber) && !verifyPhoneNumber.A07.A06() && !verifyPhoneNumber.A0b.A02(11568)) {
            z = false;
        }
        A9B.A0Q(view, verifyPhoneNumber2, 2131436246, A1T2, z, verifyPhoneNumber.A1i);
    }

    public static void A1l(VerifyPhoneNumber verifyPhoneNumber) {
        VerifyPhoneNumber verifyPhoneNumber2 = verifyPhoneNumber;
        if (verifyPhoneNumber.A1N) {
            Log.i("VerifyPhoneNumber/onVerificationCompleteDialogEndedChangeNumberFlow/change number");
            verifyPhoneNumber.A05.CGF(new C146767Qn(verifyPhoneNumber, 22));
            return;
        }
        Log.i("VerifyPhoneNumber/onVerificationCompleteDialogEnded/");
        A1e(verifyPhoneNumber);
        int i = verifyPhoneNumber.A02;
        if (i == 5) {
            C72453Mb.A14(verifyPhoneNumber);
            return;
        }
        C196059uO r6 = verifyPhoneNumber.A0h;
        A80.A02(verifyPhoneNumber2, verifyPhoneNumber.A0X, verifyPhoneNumber.A0d, r6, verifyPhoneNumber.A0j, AnonymousClass000.A1T(i, 4));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        r0 = X.AnonymousClass1YD.A04(r6);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A20(java.lang.String r6) {
        /*
            r5 = 0
            if (r6 == 0) goto L_0x0014
            java.lang.Long r0 = X.AnonymousClass1YD.A04(r6)
            if (r0 == 0) goto L_0x0014
            long r3 = r0.longValue()
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0014
            r5 = 1
        L_0x0014:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.verifyphone.VerifyPhoneNumber.A20(java.lang.String):boolean");
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [boolean] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00e0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A4g() {
        /*
            r13 = this;
            r6 = r13
            boolean r0 = X.AnonymousClass8BR.A1O(r13)
            if (r0 == 0) goto L_0x0043
            X.0z4 r1 = r13.A0A
            java.lang.String r0 = "email_otp_choose_flash_or_voice_instead"
            r1.A1Y(r0)
            java.lang.String r0 = "VerifyPhoneNumber/requestSecondaryFlashOrVoiceCall/opt out of email verification"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r0 = "VerifyPhoneNumber/restartActivityWithVoiceVerification"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.A10.A00(r13)
            X.1jT r2 = r13.A0j
            r1 = 5
            r0 = 1
            X.C33841jT.A03(r2, r1, r0)
            X.A5R r1 = r13.A0v
            java.lang.String r0 = "sms"
            r2 = -1
            long r7 = r1.A02(r0, r2)
            X.A5R r1 = r13.A0v
            java.lang.String r0 = "voice"
            long r9 = r1.A02(r0, r2)
            boolean r11 = r13.A1Z
            boolean r12 = r13.A1N
            android.content.Intent r0 = X.AnonymousClass1LU.A0M(r6, r7, r9, r11, r12)
            r13.finish()
            r13.startActivity(r0)
            return
        L_0x0043:
            boolean r0 = X.C19963A0w.A00(r13)
            if (r0 == 0) goto L_0x004d
            r0 = 2
            r13.A4h(r0)
        L_0x004d:
            X.0z4 r4 = r13.A0A
            X.11C r1 = r13.A08
            boolean r3 = X.C18070vi.A16(r4, r1)
            int r2 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            r5 = 0
            if (r2 >= r0) goto L_0x00a4
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "FlashCallManager/isEligibleForSecondaryFlashCall/api="
            java.lang.String r0 = X.AnonymousClass001.A1I(r0, r1, r2)
        L_0x0066:
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0069:
            java.lang.String r2 = "/phoneNumber="
            if (r5 == 0) goto L_0x00e0
            X.9oA r0 = r13.A0r
            boolean r0 = r0.A01()
            if (r0 != 0) goto L_0x00e0
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "VerifyPhoneNumber/requestSecondaryFlashOrVoiceCall/flash/cc="
            r1.append(r0)
            java.lang.String r0 = r13.A1H
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r13.A1J
            X.C17890vO.A1A(r1, r0)
            X.0z4 r1 = r13.A0A
            java.lang.String r0 = "secondary_eligible"
            r1.A1e(r0)
            X.0z4 r0 = r13.A0A
            r2 = 0
            X.00H r0 = r0.A00
            android.content.SharedPreferences$Editor r1 = X.AnonymousClass8BV.A06(r0)
            java.lang.String r0 = "is_first_flash_call_request"
            X.C17880vN.A1F(r1, r0, r2)
            A1r(r13, r2)
            return
        L_0x00a4:
            android.telephony.TelephonyManager r0 = r1.A0K()
            if (r0 == 0) goto L_0x00b3
            int r0 = r0.getSimState()
            if (r0 != r3) goto L_0x00b3
            java.lang.String r0 = "FlashCallManager/isEligibleForSecondaryFlashCall/sim absent"
            goto L_0x0066
        L_0x00b3:
            X.00H r2 = r4.A00
            android.content.SharedPreferences r1 = X.C17880vN.A0B(r2)
            java.lang.String r0 = "is_first_flash_call_request"
            boolean r4 = r1.getBoolean(r0, r3)
            android.content.SharedPreferences r1 = X.C17880vN.A0B(r2)
            java.lang.String r0 = "flash_call_eligible"
            int r2 = r1.getInt(r0, r5)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "FlashCallManager/isEligibleForSecondaryFlashCall/isFirstSecondaryFlashCallRequest="
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = "/flashCallEligible="
            X.C17900vP.A0j(r0, r1, r2)
            if (r4 == 0) goto L_0x0069
            if (r2 < r3) goto L_0x0069
            r5 = 1
            goto L_0x0069
        L_0x00e0:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "VerifyPhoneNumber/requestSecondaryFlashOrVoiceCall/voice/cc="
            r1.append(r0)
            java.lang.String r0 = r13.A1H
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r13.A1J
            X.C17890vO.A1A(r1, r0)
            X.1jT r1 = r13.A0j
            r0 = 5
            X.C33841jT.A03(r1, r0, r3)
            X.19D r1 = r13.A00
            X.0z4 r0 = r13.A0A
            X.99F r2 = X.A9B.A0B(r0, r1)
            X.11C r0 = r13.A08
            android.telephony.TelephonyManager r0 = r0.A0K()
            r1 = 0
            if (r0 == 0) goto L_0x0114
            int r0 = r0.getSimState()
            if (r0 != r3) goto L_0x0114
            r1 = 1
        L_0x0114:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r2.A01 = r0
            X.0z4 r0 = r13.A0A
            boolean r0 = r0.A2O()
            if (r0 == 0) goto L_0x0128
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            r2.A02 = r0
        L_0x0128:
            r13.A1b(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.verifyphone.VerifyPhoneNumber.A4g():void");
    }

    public void A4k(AnonymousClass99E r17, String str, String str2, String str3, String str4, int i) {
        String str5;
        AnonymousClass99I r6 = this.A0w.A07;
        C37581pm A002 = AnonymousClass2SS.A00(this);
        int i2 = this.A02;
        if (this.A07.A06()) {
            str5 = "twofac_reset";
        } else {
            int i3 = this.A02;
            if (i3 == 2 || i3 == 1) {
                str5 = "account_defence";
            } else if (i3 == 3) {
                str5 = "ban_appeal";
            } else {
                str5 = null;
            }
        }
        String str6 = str;
        C18070vi.A0d(str6, 1);
        String str7 = str2;
        String str8 = str3;
        C72473Md.A1J(str7, str8);
        AnonymousClass99E r5 = r17;
        C18070vi.A0d(r5, 9);
        AnonymousClass3MX.A1Q(new VerifyCodeUseCase$verifyCode$1((C165038aU) null, r5, r6, str6, str4, str7, str8, str5, (String) null, (C30391dr) null, i2, i), A002);
    }

    public void A4l(String str) {
        this.A1T = true;
        A5R a5r = this.A0v;
        String str2 = this.A1H;
        String str3 = this.A1J;
        C18070vi.A0n(str, str2, str3);
        SharedPreferences.Editor edit = A5R.A01(a5r).edit();
        edit.putString("com.whatsapp.registration.VerifyPhoneNumber.sms_code", str);
        edit.putString("com.whatsapp.registration.VerifyPhoneNumber.sms_cc", str2);
        edit.putString("com.whatsapp.registration.VerifyPhoneNumber.sms_phone_number", str3);
        edit.apply();
        this.A01 = 0;
        String A0l2 = this.A0A.A0l();
        String A0n2 = this.A0A.A0n();
        A80.A00(this.A0J);
        A4k(this.A0m, str, A0l2, A0n2, "sms", 2);
    }

    public void A4m(String str) {
        int length;
        String str2;
        C37581pm A002;
        AnonymousClass1OS deviceSwitchingUseCase$verifyDeviceSwitching$1;
        String str3 = str;
        if (str != null && (length = str.length()) == A1n) {
            int i = 0;
            while (true) {
                if (i >= length) {
                    if (AnonymousClass8BR.A1O(this)) {
                        AnonymousClass99K r2 = this.A0w.A02;
                        A002 = AnonymousClass2SS.A00(this);
                        deviceSwitchingUseCase$verifyDeviceSwitching$1 = new EmailOtpUseCase$verifyEmailOtp$1(r2, new C194659s5(str, "email_otp", 1), (C30391dr) null);
                    } else if (AnonymousClass8BR.A1N(this)) {
                        AnonymousClass99J r22 = this.A0w.A01;
                        A002 = AnonymousClass2SS.A00(this);
                        deviceSwitchingUseCase$verifyDeviceSwitching$1 = new DeviceSwitchingUseCase$verifyDeviceSwitching$1(r22, new C193229pk(str), (C30391dr) null);
                    } else {
                        String str4 = this.A1H;
                        String str5 = this.A1J;
                        C17960vV.A07(str5);
                        if (AnonymousClass8BR.A1N(this)) {
                            str2 = "wa_old";
                        } else if (AnonymousClass8BR.A1O(this)) {
                            str2 = "email_otp";
                        } else {
                            str2 = "voice";
                        }
                        A80.A00(this.A0J);
                        A4k(this.A0m, str3, str4, str5, str2, 1);
                        return;
                    }
                    AnonymousClass3MX.A1Q(deviceSwitchingUseCase$verifyDeviceSwitching$1, A002);
                    return;
                } else if (!AnonymousClass8BU.A1Y(str, i)) {
                    AnonymousClass4Yv.A01(this, 29);
                    return;
                } else {
                    i++;
                }
            }
        }
    }

    public void C2d(String str) {
        this.A1T = true;
        A1h(this);
        A1n(this, 2131897770);
        A4k(this.A0m, str, this.A1H, this.A1J, "flash", 2);
        ((C20605ARp) this.A17.get()).A00();
        this.A0o.A0T();
    }

    public static Boolean A11(VerifyPhoneNumber verifyPhoneNumber) {
        boolean z;
        if (!verifyPhoneNumber.A0r.A01() || !(AnonymousClass8BU.A02(verifyPhoneNumber) == 4 || AnonymousClass8BU.A02(verifyPhoneNumber) == 5 || verifyPhoneNumber.A0r.A01())) {
            z = false;
        } else {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    private String A12() {
        String str;
        String str2 = this.A1J;
        if (str2 == null || (str = this.A1H) == null) {
            return null;
        }
        return this.A00.A0G(A9B.A0H(str, str2).replace(' ', 160));
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x0038  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String A14(android.content.res.Resources r12, X.AnonymousClass11P r13, X.C18000vb r14, X.A5R r15, java.lang.String r16, java.lang.String r17) {
        /*
            r7 = r17
            r6 = 0
            boolean r5 = X.C18070vi.A17(r12, r14)
            r8 = 2
            X.C72473Md.A1M(r15, r7, r13, r8)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "VerifyPhoneNumberUtils/getRequestCodeNextMethodErrorMsg/method="
            r9 = r16
            X.C17900vP.A0f(r0, r9, r1)
            r0 = 2131897802(0x7f122dca, float:1.9430504E38)
            java.lang.String r11 = X.AnonymousClass3MY.A0m(r12, r0)
            java.lang.String r4 = "sms"
            long r1 = X.A5R.A00(r15, r4)
            int r0 = r9.hashCode()
            java.lang.String r3 = "voice"
            switch(r0) {
                case -795576526: goto L_0x007d;
                case 114009: goto L_0x0065;
                case 2120743944: goto L_0x005a;
                default: goto L_0x002c;
            }
        L_0x002c:
            r10 = 2131895013(0x7f1222e5, float:1.9424847E38)
            r9 = 2131895014(0x7f1222e6, float:1.942485E38)
        L_0x0032:
            r3 = -1
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x0053
            long r3 = java.lang.System.currentTimeMillis()
            long r1 = r1 - r3
            r3 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x0053
            java.lang.Object[] r3 = new java.lang.Object[r8]
            r3[r6] = r7
            java.lang.String r0 = X.C64052u8.A0A(r14, r1)
            java.lang.String r0 = X.AnonymousClass3MW.A0x(r12, r0, r3, r5, r9)
        L_0x004f:
            X.C18070vi.A0b(r0)
            return r0
        L_0x0053:
            java.lang.Object[] r0 = new java.lang.Object[r5]
            java.lang.String r0 = X.AnonymousClass3MW.A0x(r12, r7, r0, r6, r10)
            goto L_0x004f
        L_0x005a:
            boolean r0 = X.AnonymousClass8BR.A1X(r9)
            r10 = 2131895262(0x7f1223de, float:1.9425352E38)
            r9 = 2131895263(0x7f1223df, float:1.9425354E38)
            goto L_0x0087
        L_0x0065:
            boolean r0 = r9.equals(r4)
            if (r0 == 0) goto L_0x002c
            long r1 = X.A5R.A00(r15, r3)
            r10 = 2131895009(0x7f1222e1, float:1.9424839E38)
            r9 = 2131895010(0x7f1222e2, float:1.942484E38)
            r0 = 2131897815(0x7f122dd7, float:1.943053E38)
            java.lang.String r7 = X.AnonymousClass3MY.A0m(r12, r0)
            goto L_0x0032
        L_0x007d:
            boolean r0 = X.AnonymousClass8BR.A1W(r9)
            r10 = 2131895017(0x7f1222e9, float:1.9424855E38)
            r9 = 2131895018(0x7f1222ea, float:1.9424857E38)
        L_0x0087:
            if (r0 == 0) goto L_0x002c
            r7 = r11
            goto L_0x0032
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.verifyphone.VerifyPhoneNumber.A14(android.content.res.Resources, X.11P, X.0vb, X.A5R, java.lang.String, java.lang.String):java.lang.String");
    }

    public static String A16(VerifyPhoneNumber verifyPhoneNumber) {
        if (verifyPhoneNumber.A07.A03()) {
            return "verify_passkey";
        }
        if (AnonymousClass8BR.A1O(verifyPhoneNumber)) {
            return "verify_email_otp";
        }
        if (AnonymousClass8BR.A1N(verifyPhoneNumber)) {
            return "verify_wa_old";
        }
        if (verifyPhoneNumber.A07.A05()) {
            return "verify_silent_auth";
        }
        if (AnonymousClass8BU.A02(verifyPhoneNumber) == 5) {
            return "verify_voice_otp";
        }
        if (AnonymousClass8BR.A1M(verifyPhoneNumber)) {
            return "verify_flash";
        }
        if (C19963A0w.A00(verifyPhoneNumber)) {
            return "verify_second_sms";
        }
        return "verify_sms";
    }

    private void A18() {
        if (this.A0g.A06()) {
            this.A0g.A01();
        } else {
            AnonymousClass3MW.A1S(this.A0L);
        }
    }

    private void A1A() {
        if (this.A0h.A00 || Bed()) {
            A9B.A0O(this, this.A0X, -1);
        }
    }

    private void A1B() {
        Log.w("VerifyPhoneNumber/onFormatWrongError");
        A9B.A0U(this.A0A, "format-wrong");
        String A032 = ((AnonymousClass1K3) this.A16.get()).A03(this.A00, AnonymousClass1K3.A01(this.A1H, this.A1J));
        C196059uO r3 = this.A0h;
        Object[] A1b2 = AnonymousClass3MW.A1b();
        AnonymousClass8BS.A1B(A12(), A032, A1b2);
        r3.A03(getString(2131894975, A1b2));
        A1A();
    }

    private void A1D() {
        if (this.A1Z) {
            if (this.A1k) {
                ((C29831cw) this.A1F.get()).A02(this.A1e, this);
                this.A1k = false;
            }
        } else if (this.A1j) {
            ((C29831cw) this.A1F.get()).A02(this.A1d, this);
            this.A1j = false;
        }
    }

    private void A1F() {
        long A002 = A5R.A00(this.A0v, "voice");
        if (A002 != -1) {
            long currentTimeMillis = A002 - System.currentTimeMillis();
            if (currentTimeMillis > 0) {
                A1J(currentTimeMillis, "voice");
            } else {
                this.A0v.A06("voice");
            }
        }
    }

    private void A1G(int i) {
        if (this.A0h.A00 || Bed()) {
            A9B.A0O(this, this.A0X, i);
        } else {
            AnonymousClass4Yv.A01(this, i);
        }
    }

    private void A1H(int i) {
        if (!this.A07.A02() && !this.A07.A03() && !AnonymousClass8BR.A1M(this)) {
            this.A0h.A01(i);
        }
    }

    private void A1I(long j) {
        if (!this.A07.A02() && !this.A07.A03() && !AnonymousClass8BR.A1M(this)) {
            this.A0j.A0C(j);
        }
    }

    private void A1J(long j, String str) {
        AnonymousClass1DT A0T2 = this.A0s.A0T(str, j);
        if (A0T2 != null) {
            A0T2.A0A(this, new C20329AGl(this, str));
        }
    }

    private void A1L(long j, String str, boolean z, long j2) {
        StringBuilder A102 = AnonymousClass000.A10();
        A102.append("VerifyPhoneNumber/");
        A102.append(str);
        A102.append("/launchAccountDefenceFlow deviceConfirmationFlow: ");
        boolean z2 = z;
        A102.append(z2);
        A102.append(", smsWait: ");
        A102.append(j);
        C17900vP.A0m(", voiceWait: ", A102, j2);
        AnonymousClass8BU.A0d(this).A0I(A16(this), "successful");
        C33841jT r4 = this.A0j;
        int i = 13;
        if (z) {
            i = 14;
        }
        C33841jT.A03(r4, i, true);
        A10.A00(this);
        long currentTimeMillis = System.currentTimeMillis();
        long j3 = j * 1000;
        long j4 = j2 * 1000;
        long j5 = j3 + currentTimeMillis;
        long j6 = j4 + currentTimeMillis;
        A5R a5r = this.A0v;
        C17880vN.A1D(A5R.A01(a5r).edit(), "com.whatsapp.registration.VerifyPhoneNumber.code_verification_retry_time", Math.min(j5, j6));
        this.A0f.A02(j3, j4);
        A1C();
        AnonymousClass4Yv.A01(this, 44);
        this.A05.A0K(new C21364Ait(this, j5, j6, z2), 1500);
    }

    private void A1N(ADM adm) {
        Log.i("VerifyPhoneNumber/userIsBlocked");
        if (this.A0y.A02(adm, true)) {
            Log.i("VerifyPhoneNumber/launching-ban-appeals-flow");
            C17960vV.A07(adm);
            C33841jT.A03(this.A0j, 10, true);
            startActivity(this.A0y.A00(this, adm));
            finish();
            return;
        }
        Log.i("VerifyPhoneNumber/userIsBlocked skipping ban appeals flow and showing blocked dialog");
        this.A0H.setVisibility(0);
        this.A0H.setText(2131895036);
        this.A0R.setVisibility(8);
        this.A0G.setVisibility(8);
        AnonymousClass4Yv.A01(this, 124);
    }

    private void A1O(ADM adm, C59772mr r3) {
        if (r3 == null) {
            A1N(adm);
            return;
        }
        this.A0j.A0A();
        this.A0u.A01();
        startActivity(AnonymousClass1LU.A1G(this, r3));
        finish();
    }

    public static void A1P(ADM adm, VerifyPhoneNumber verifyPhoneNumber, String str, String str2, String str3, int i, boolean z, boolean z2, boolean z3) {
        Log.i("VerifyPhoneNumber/updateStateOnVerificationComplete");
        AnonymousClass10I r9 = verifyPhoneNumber.A05;
        Context applicationContext = verifyPhoneNumber.getApplicationContext();
        AnonymousClass190 r3 = verifyPhoneNumber.A03;
        AnonymousClass11P r5 = verifyPhoneNumber.A05;
        AnonymousClass11S r4 = verifyPhoneNumber.A02;
        C19830z4 r6 = verifyPhoneNumber.A0A;
        boolean z4 = verifyPhoneNumber.A1T;
        String str4 = str;
        String str5 = str2;
        A80.A04(applicationContext, r3, r4, r5, r6, verifyPhoneNumber.A0i, verifyPhoneNumber.A0l, r9, str4, str5, i, z4);
        A10.A00(verifyPhoneNumber);
        verifyPhoneNumber.A0t.removeMessages(1);
        verifyPhoneNumber.A0v.A05();
        A1M(verifyPhoneNumber.A0A, verifyPhoneNumber.A0v);
        AnonymousClass8BU.A0d(verifyPhoneNumber).A0I(A16(verifyPhoneNumber), "successful");
        AnonymousClass8BU.A0d(verifyPhoneNumber).A08();
        if (verifyPhoneNumber.A02 != 3 || !verifyPhoneNumber.A0y.A02(adm, true)) {
            C33841jT r8 = verifyPhoneNumber.A0j;
            C19830z4 r62 = verifyPhoneNumber.A0A;
            A80.A05(verifyPhoneNumber.A0J, r62, (C22881Do) verifyPhoneNumber.A1A.get(), r8, (C20605ARp) verifyPhoneNumber.A17.get(), str4, str5, str3, z, z2, z3);
            return;
        }
        Log.i("VerifyPhoneNumber/updateStateOnVerificationComplete/launching ban appeals");
        C17960vV.A07(adm);
        C33841jT.A03(verifyPhoneNumber.A0j, 10, true);
        verifyPhoneNumber.startActivity(verifyPhoneNumber.A0y.A00(verifyPhoneNumber, adm));
        verifyPhoneNumber.finish();
    }

    public static void A1d(VerifyPhoneNumber verifyPhoneNumber) {
        int i;
        verifyPhoneNumber.A0V.A00();
        AnonymousClass1LR A042 = verifyPhoneNumber.A07.A04();
        C17900vP.A0Y(A042, "VerifyPhoneNumber/network/active ", AnonymousClass000.A10());
        if (A042 == null) {
            i = -1;
        } else if (A042.A04) {
            i = 0;
        } else {
            i = 99;
            if (A042.A06) {
                i = 1;
            }
        }
        int i2 = verifyPhoneNumber.A1a;
        if (i != i2) {
            StringBuilder A102 = AnonymousClass000.A10();
            A102.append("VerifyPhoneNumber/network/switch old=");
            A102.append(i2);
            C17900vP.A0j(" new=", A102, i);
            verifyPhoneNumber.A1a = i;
            if (i != -1 && verifyPhoneNumber.A0t.hasMessages(1)) {
                Log.i("VerifyPhoneNumber/network/switch/has-retry-pending");
                verifyPhoneNumber.A0t.removeMessages(1);
                verifyPhoneNumber.A01 = 0;
                String A032 = verifyPhoneNumber.A0v.A03(verifyPhoneNumber.A1H, verifyPhoneNumber.A1J);
                if (A032 != null) {
                    verifyPhoneNumber.A0t.sendMessage(verifyPhoneNumber.A0t.obtainMessage(1, A032));
                    return;
                }
                Log.e("VerifyPhoneNumber/network/switch/no-saved-code");
            }
        }
    }

    public static void A1i(VerifyPhoneNumber verifyPhoneNumber) {
        Intent A042;
        verifyPhoneNumber.A0u.A01();
        if (verifyPhoneNumber.A1N) {
            Log.i("VerifyPhoneNumber/returnToEnterPhoneNumber/change number flow");
            C33841jT.A03(verifyPhoneNumber.A0j, 3, true);
            if (!verifyPhoneNumber.A0j.A0F()) {
                verifyPhoneNumber.finish();
            }
            A042 = AnonymousClass8BX.A0A(verifyPhoneNumber);
        } else {
            Log.i("VerifyPhoneNumber/returnToEnterPhoneNumber/reg flow");
            C33841jT.A03(verifyPhoneNumber.A0j, 1, true);
            A042 = AnonymousClass1LU.A04(verifyPhoneNumber);
            A042.putExtra("com.whatsapp.registration.RegisterPhone.clear_phone_number", true);
        }
        verifyPhoneNumber.startActivity(A042);
        verifyPhoneNumber.finish();
    }

    public static void A1k(VerifyPhoneNumber verifyPhoneNumber) {
        Log.i("VerifyPhoneNumber/updateUiOn2FARequired");
        verifyPhoneNumber.A3q(AnonymousClass1LU.A1o(verifyPhoneNumber, verifyPhoneNumber.A1N, false), false);
        verifyPhoneNumber.finish();
    }

    public static void A1m(VerifyPhoneNumber verifyPhoneNumber, int i) {
        Intent A1W2;
        VerifyPhoneNumber verifyPhoneNumber2 = verifyPhoneNumber;
        A1h(verifyPhoneNumber2);
        verifyPhoneNumber2.A4f();
        int i2 = i;
        Integer A012 = ((A04) verifyPhoneNumber2.A1G.get()).A01(verifyPhoneNumber2.A09, verifyPhoneNumber2.A08, i2);
        if (A012 != null) {
            int intValue = A012.intValue();
            if (intValue == 2) {
                Log.i("VerifyPhoneNumber/maybeTransitionToRelevantRegMethod/fall back to device switching");
                A10.A00(verifyPhoneNumber2);
                C33841jT.A03(verifyPhoneNumber2.A0j, 15, true);
                long A022 = verifyPhoneNumber2.A0v.A02("sms", -1);
                long A023 = verifyPhoneNumber2.A0v.A02("voice", -1);
                long A024 = verifyPhoneNumber2.A0v.A02("wa_old", -1);
                long A025 = verifyPhoneNumber2.A0v.A02("email_otp", -1);
                boolean z = verifyPhoneNumber2.A1Z;
                boolean z2 = verifyPhoneNumber2.A1N;
                A1W2 = AnonymousClass1LU.A1W(verifyPhoneNumber2, (String) null, verifyPhoneNumber2.A1M, -1, verifyPhoneNumber2.A09, 0, A022, A023, A024, A025, z, false, z2, false);
            } else if (intValue == 3) {
                Log.i("VerifyPhoneNumber/maybeTransitionToRelevantRegMethod/fall back to email otp");
                Log.i("VerifyPhoneNumber/restartActivityWithEmailVerification");
                A10.A00(verifyPhoneNumber2);
                C33841jT.A03(verifyPhoneNumber2.A0j, 17, true);
                int i3 = verifyPhoneNumber2.A03;
                long A026 = verifyPhoneNumber2.A0v.A02("sms", -1);
                long A027 = verifyPhoneNumber2.A0v.A02("voice", -1);
                long A028 = verifyPhoneNumber2.A0v.A02("wa_old", -1);
                long A029 = verifyPhoneNumber2.A0v.A02("email_otp", -1);
                boolean z3 = verifyPhoneNumber2.A1Z;
                Boolean bool = C17970vW.A01;
                A1W2 = AnonymousClass1LU.A1W(verifyPhoneNumber2, (String) null, (String) null, i3, 0, 0, A026, A027, A028, A029, z3, true, verifyPhoneNumber2.A1N, false);
            } else if (intValue == 4) {
                Log.i("VerifyPhoneNumber/maybeTransitionToRelevantRegMethod/fall back to flash call");
                verifyPhoneNumber2.A3q(AnonymousClass1LU.A0H(verifyPhoneNumber2, i2, verifyPhoneNumber2.A0v.A02("sms", -1), verifyPhoneNumber2.A0v.A02("voice", -1), verifyPhoneNumber2.A1N, false), true);
                return;
            } else if (intValue == 5 || intValue == 7) {
                Log.i("VerifyPhoneNumber/maybeTransitionToRelevantRegMethod/fall back to sms/voice");
                A1o(verifyPhoneNumber2, verifyPhoneNumber2.A0v.A02("sms", -1), verifyPhoneNumber2.A0v.A02("voice", -1));
                return;
            } else if (intValue == 9) {
                Log.i("VerifyPhoneNumber/maybeTransitionToRelevantRegMethod/fall back to silent auth");
                C33841jT.A03(verifyPhoneNumber2.A0j, 23, true);
                long A0210 = verifyPhoneNumber2.A0v.A02("sms", -1);
                long A0211 = verifyPhoneNumber2.A0v.A02("voice", -1);
                long A0212 = verifyPhoneNumber2.A0v.A02("wa_old", -1);
                long A0213 = verifyPhoneNumber2.A0v.A02("email_otp", -1);
                boolean z4 = verifyPhoneNumber2.A1Z;
                Boolean bool2 = C17970vW.A01;
                A1W2 = AnonymousClass1LU.A1W(verifyPhoneNumber2, (String) null, (String) null, i2, 0, verifyPhoneNumber2.A08, A0210, A0211, A0212, A0213, z4, true, verifyPhoneNumber2.A1N, false);
            } else {
                return;
            }
            verifyPhoneNumber2.finish();
            verifyPhoneNumber2.startActivity(A1W2);
        }
    }

    public static void A1o(VerifyPhoneNumber verifyPhoneNumber, long j, long j2) {
        if (verifyPhoneNumber.A1Z) {
            Log.i("VerifyPhoneNumber/maybeUseSmsRetriever/useSmsRetriever already set");
            A1p(verifyPhoneNumber, j, j2);
            return;
        }
        Log.i("VerifyPhoneNumber/maybeUseSmsRetriever");
        C21013Ad5 ad5 = new C21013Ad5(verifyPhoneNumber, j, j2);
        C196889vo.A00(verifyPhoneNumber.A0W, verifyPhoneNumber.A0A, ad5);
    }

    public static void A1p(VerifyPhoneNumber verifyPhoneNumber, long j, long j2) {
        long j3;
        Log.i("VerifyPhoneNumber/restartActivityWithSmsVerification");
        VerifyPhoneNumber verifyPhoneNumber2 = verifyPhoneNumber;
        A10.A00(verifyPhoneNumber);
        if (AnonymousClass8BR.A1M(verifyPhoneNumber)) {
            verifyPhoneNumber.A0A.A1b("primary_failed");
        }
        if (!AnonymousClass8BR.A1O(verifyPhoneNumber)) {
            AnonymousClass4Yv.A01(verifyPhoneNumber, 43);
        }
        AnonymousClass1KB r2 = verifyPhoneNumber.A05;
        C21359Aio aio = new C21359Aio(verifyPhoneNumber2, 2, j, j2);
        if (AnonymousClass8BR.A1O(verifyPhoneNumber2)) {
            j3 = 0;
        } else {
            j3 = 1500;
        }
        r2.A0K(aio, j3);
    }

    public static void A1q(VerifyPhoneNumber verifyPhoneNumber, String str, String str2, String str3, int i, long j, boolean z, boolean z2) {
        C33841jT r3;
        int i2;
        Log.i("VerifyPhoneNumber/updateStateOn2FARequired");
        VerifyPhoneNumber verifyPhoneNumber2 = verifyPhoneNumber;
        if (z) {
            AnonymousClass10I r8 = verifyPhoneNumber.A05;
            Context applicationContext = verifyPhoneNumber.getApplicationContext();
            AnonymousClass190 r2 = verifyPhoneNumber.A03;
            AnonymousClass11P r4 = verifyPhoneNumber.A05;
            AnonymousClass11S r32 = verifyPhoneNumber.A02;
            C19830z4 r5 = verifyPhoneNumber.A0A;
            boolean z3 = verifyPhoneNumber.A1T;
            String str4 = verifyPhoneNumber2.A1H;
            String str5 = verifyPhoneNumber2.A1J;
            A80.A04(applicationContext, r2, r32, r4, r5, verifyPhoneNumber2.A0i, verifyPhoneNumber2.A0l, r8, str4, str5, i, z3);
        }
        long j2 = j;
        if (z2) {
            verifyPhoneNumber2.A0A.A1v(str2, str3, j2, -1, -1, AnonymousClass8BS.A01(verifyPhoneNumber2));
        }
        AnonymousClass8BU.A0d(verifyPhoneNumber2).A0I(A16(verifyPhoneNumber2), "successful");
        if (!"sms".equals(str) || j != -1) {
            r3 = verifyPhoneNumber2.A0j;
            i2 = 7;
        } else {
            r3 = verifyPhoneNumber2.A0j;
            i2 = 18;
        }
        C33841jT.A03(r3, i2, true);
        A1M(verifyPhoneNumber2.A0A, verifyPhoneNumber2.A0v);
    }

    public static void A1r(VerifyPhoneNumber verifyPhoneNumber, boolean z) {
        Log.i("VerifyPhoneNumber/request-flash");
        if (!verifyPhoneNumber.A0Y.A0C()) {
            Log.i("VerifyPhoneNumber/request-flash/request-permission");
            AnonymousClass74O.A0E(verifyPhoneNumber, verifyPhoneNumber.A0Y, 700, z);
            return;
        }
        Log.i("VerifyPhoneNumber/request-flash/has-permission");
        verifyPhoneNumber.A19();
    }

    private void A1s(Runnable runnable) {
        if (this.A0I == null) {
            this.A0I = ((A0K) this.A13.get()).A01(this, this, runnable, new C146767Qn(this, 18));
            if (!isFinishing()) {
                this.A0I.show();
            }
        }
    }

    private void A1w(String str) {
        if (!this.A07.A02() && !this.A07.A03() && !AnonymousClass8BR.A1M(this)) {
            this.A0h.A03(str);
        }
    }

    private void A1x(String str) {
        if (A10.A03 == 12) {
            this.A0G.setVisibility(8);
            return;
        }
        if (!AnonymousClass8BR.A1V(str)) {
            this.A0G.setVisibility(0);
        }
        A1F();
    }

    private void A1z(boolean z) {
        int i;
        int i2;
        ImageButton imageButton = this.A0E;
        int i3 = 4;
        if (z) {
            i3 = 0;
        }
        imageButton.setVisibility(i3);
        if (this.A0g.A06()) {
            RelativeLayout relativeLayout = this.A0G;
            int i4 = 16;
            if (z) {
                i4 = 1;
            }
            relativeLayout.setGravity(i4);
            AnonymousClass4VX r4 = this.A0g;
            boolean z2 = !z;
            for (TextView textView : r4.A0B) {
                if (!z2) {
                    i = r4.A09;
                } else {
                    i = r4.A08;
                }
                textView.setWidth(i);
                if (!z2) {
                    i2 = r4.A06;
                } else {
                    i2 = r4.A05;
                }
                textView.setHeight(i2);
            }
            if (z) {
                ViewGroup.MarginLayoutParams A0B2 = AnonymousClass3MW.A0B(this.A0E);
                A0B2.setMargins(this.A04, this.A06, this.A05, 0);
                int i5 = this.A07;
                A0B2.width = i5;
                A0B2.height = i5;
                this.A0E.setLayoutParams(A0B2);
            }
        }
    }

    public void A2y() {
        if (!this.A1h) {
            this.A1h = true;
            AnonymousClass1K1 A002 = C137116uw.A00(this);
            AnonymousClass10E r2 = A002.AAQ;
            C63932tv.A02(r2, this);
            AnonymousClass10G r1 = r2.A00;
            C63932tv.A01(r2, r1, this);
            C63662tU.A00(r2, r1, this, r1.A5A);
            this.A00 = C72463Mc.A0e(r2);
            this.A00 = AnonymousClass1K1.A1f(A002);
            this.A0S = C72453Mb.A0d(r2);
            this.A0W = AnonymousClass3MZ.A0l(r2);
            this.A0z = AnonymousClass3MY.A0e(r1);
            this.A0d = AnonymousClass3MY.A0Z(r2);
            this.A0y = (C136576u2) r2.AEP.get();
            this.A0a = AnonymousClass3Ma.A0g(r2);
            this.A0P = (AnonymousClass194) r2.A9Z.get();
            this.A0K = C19890zB.A00;
            this.A18 = C000200d.A00(r2.A4U);
            this.A1A = C000200d.A00(r2.A5t);
            this.A0Q = AnonymousClass8BT.A0A(r1);
            this.A12 = AnonymousClass8BT.A0g(r2);
            this.A0b = (C139576z4) r2.A01.get();
            this.A0l = (C26145Ct9) r1.A6G.get();
            this.A0M = (AnonymousClass1LA) r2.AeS.get();
            this.A17 = C000200d.A00(r1.ABK);
            this.A0V = (C29781cr) r2.AAq.get();
            this.A1C = C000200d.A00(r2.Aer);
            this.A0c = AnonymousClass3Ma.A0k(r2);
            this.A1E = C000200d.A00(A002.A5g);
            this.A0Z = (C134036pu) r1.AB8.get();
            this.A0j = AnonymousClass8BU.A0c(r2);
            this.A0Y = AnonymousClass3Ma.A0b(r2);
            this.A14 = C000200d.A00(r2.A0h);
            this.A1B = C000200d.A00(r1.AJ5);
            this.A19 = C000200d.A00(r2.AUf);
            this.A1G = C000200d.A00(A002.A5z);
            this.A0p = C72463Mc.A0i(r1);
            this.A1F = C000200d.A00(r2.A9c);
            this.A0k = AnonymousClass8BW.A0T(r2);
            this.A0X = (C27301Vn) r2.A9A.get();
            this.A0r = AnonymousClass1K1.A1j(A002);
            this.A15 = AnonymousClass8BT.A0f(r2);
            this.A1D = C000200d.A00(r2.Afu);
            this.A0i = (A98) r2.Ag7.get();
            this.A0e = AnonymousClass3Ma.A0r(r2);
            this.A0N = (AnonymousClass4PW) A002.A24.get();
            this.A0J = (C19880zA) r2.A7j.get();
            this.A0O = (AnonymousClass9VE) A002.A60.get();
            this.A0f = AnonymousClass1K1.A1c(A002);
            this.A13 = C000200d.A00(A002.A07);
            this.A16 = C000200d.A00(r2.A30);
            this.A0v = (A5R) r1.AIb.get();
        }
    }

    public int A4e() {
        int i = this.A02;
        if (i == 3) {
            return 9;
        }
        if (i == 2) {
            return 14;
        }
        if (i == 1) {
            return 13;
        }
        if (i == 4) {
            return 24;
        }
        if (i == 5) {
            return 38;
        }
        return 4;
    }

    public void A4h(int i) {
        this.A00 = i;
        C192309o9 r2 = this.A0f.A01.A05;
        C17900vP.A0j("AccountDefenceLocalDataRepository/save-acct-defence-state/", AnonymousClass000.A10(), i);
        SharedPreferences.Editor A082 = AnonymousClass8BU.A08(r2.A00, "AccountDefenceLocalDataRepository_prefs");
        A082.putInt("com.whatsapp.registration.accountdefence.AccountDefenceLocalDataRepository.account_defence_verification_state", i);
        A082.apply();
        this.A0R.setText(this.A0f.A01(this, A9B.A0G(this.A00, this.A1H, this.A1J), this.A00));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x02b5, code lost:
        if (r2 != X.AnonymousClass00R.A0E) goto L_0x03f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x02b7, code lost:
        X.C17960vV.A07(r10);
        A1U(r10, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x02bf, code lost:
        r1 = X.C166988f1.A0Q(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x02c5, code lost:
        if (r2 != r4) goto L_0x02d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x02c7, code lost:
        r0 = "/bad-token";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x02c9, code lost:
        X.C17890vO.A19(r1, r0);
        X.A9B.A0U(r9.A0A, "voice-bad-token");
        r0 = 41;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x02d5, code lost:
        r0 = "/invalid-skey";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:?, code lost:
        r1 = X.AnonymousClass8BW.A08(r10.A0L);
        A1I(r1);
        A1w(getString(2131895033, new java.lang.Object[]{X.C64052u8.A0A(r9.A00, r1)}));
        X.C166988f1.A0x(r9.A0v, "voice", r1);
        A1J(r1, "voice");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0301, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0043, code lost:
        if (r2 == X.AnonymousClass00R.A0G) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0302, code lost:
        X.C17890vO.A13("/too-recent/time-not-int", X.C166988f1.A0V(r11), r2);
        r0 = 2131895034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:?, code lost:
        r1 = X.AnonymousClass8BW.A08(r10.A0L);
        A1I(r1);
        A1w(getString(2131895068, new java.lang.Object[]{X.C64052u8.A0A(r9.A00, r1)}));
        X.C166988f1.A0x(r9.A0v, "voice", r1);
        A1J(r1, "voice");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0339, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x033a, code lost:
        X.C17890vO.A13("/too-recent/time-not-int", X.AnonymousClass8BW.A0o("VerifyPhoneNumber/verifyvoice/request/", r11), r2);
        r0 = 2131895069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:?, code lost:
        r0 = X.AnonymousClass8BW.A08(r10.A0L);
        r9.A0B = r0;
        A1I(r0);
        A1w(X.C108975cc.A0b(r9, X.C64052u8.A0A(r9.A00, r9.A0B), X.AnonymousClass3MW.A1a(), 2131896243));
        r9.A0v.A07("voice", java.lang.System.currentTimeMillis() + r9.A0B);
        A1J(r9.A0B, "voice");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x037c, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x037d, code lost:
        X.C17890vO.A13("/triedtoomanytimesallmethods/time-not-int", X.C166988f1.A0V(r11), r2);
        A1H(26);
        A1C();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0045, code lost:
        A1W(r10, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:?, code lost:
        r0 = X.AnonymousClass8BW.A08(r10.A0L);
        r9.A0B = r0;
        A1I(r0);
        A1H(31);
        r9.A0v.A07("voice", java.lang.System.currentTimeMillis() + r9.A0B);
        A1J(r9.A0B, "voice");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x03b1, code lost:
        A1G(22);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:?, code lost:
        r0 = X.AnonymousClass8BW.A08(r10.A0L);
        r9.A0B = r0;
        A1I(r0);
        A1H(32);
        r9.A0v.A07("voice", java.lang.System.currentTimeMillis() + r9.A0B);
        A1J(r9.A0B, "voice");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x03db, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x03dc, code lost:
        r1 = X.C166988f1.A0V(r11);
        r0 = "/too-many-guesses/time-not-int";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x03e3, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x03e4, code lost:
        r1 = X.C166988f1.A0V(r11);
        r0 = "/triedtoomanytimesallmethods/time-not-int";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x03ea, code lost:
        X.C17890vO.A13(r0, r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x03ed, code lost:
        A1H(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x03f2, code lost:
        r4 = X.AnonymousClass00R.A0H;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x03f4, code lost:
        if (r2 == r4) goto L_0x0451;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x03f8, code lost:
        if (r2 == X.AnonymousClass00R.A0I) goto L_0x0451;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x03fa, code lost:
        if (r8 == false) goto L_0x0427;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x03fe, code lost:
        if (r2 != X.AnonymousClass00R.A0G) goto L_0x0427;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0400, code lost:
        com.whatsapp.util.Log.i("VerifyPhoneNumber/onRequestFlashErrorDisabled/fall back to voice");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0409, code lost:
        if (X.AnonymousClass8BR.A1M(r9) != false) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x040b, code lost:
        r1 = X.A9B.A0B(r9.A0A, r9.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004a, code lost:
        if (r2 != X.AnonymousClass00R.A0C) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0419, code lost:
        if (r9.A0A.A2O() == false) goto L_0x0421;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x041b, code lost:
        r1.A02 = X.AnonymousClass000.A0i();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0421, code lost:
        A1b(r1, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0429, code lost:
        if (r2 != X.AnonymousClass00R.A0J) goto L_0x0430;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x042b, code lost:
        A1v(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0432, code lost:
        if (r2 != X.AnonymousClass00R.A0O) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0434, code lost:
        com.whatsapp.util.Log.i("VerifyPhoneNumber/launchEmailChallengeFlow");
        r9.A07.A01(39);
        startActivity(X.AnonymousClass1LU.A1P(r9, X.C17890vO.A0Q(), 6));
        finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0451, code lost:
        X.C17960vV.A07(r10);
        r12 = r9;
        r15 = r11;
        A1L(X.A9B.A02(r10.A0O, 0), r15, X.AnonymousClass000.A1Z(r2, r4), X.A9B.A02(r10.A0Q, 0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004c, code lost:
        X.C17960vV.A07(r10);
        A1V(r10, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x046d, code lost:
        X.C17960vV.A07(r10);
        r1 = X.AnonymousClass000.A10();
        r1.append("VerifyPhoneNumber/verifyvoice/request/");
        r1.append(r11);
        X.C17890vO.A1A(r1, "/requested");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0483, code lost:
        if (r8 == false) goto L_0x04cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0485, code lost:
        r0 = r10.A0F;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0487, code lost:
        if (r0 == null) goto L_0x0490;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0489, code lost:
        r9.A0A = java.lang.Long.parseLong(r0) * 1000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0490, code lost:
        r13 = r9.A0o;
        r0 = r9.A0A;
        r13.A0T();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0499, code lost:
        if (r0 >= 1000) goto L_0x0544;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x049b, code lost:
        r14 = X.C20113A7w.A0L;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x049d, code lost:
        r0 = r0 / 2;
        r13.A03.A0E("running");
        X.AnonymousClass3MY.A1M(r13.A01, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x04b7, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r13.A04, 8940) == false) goto L_0x04bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x04b9, code lost:
        X.AnonymousClass3MX.A1K(r13.A02, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x04bf, code lost:
        r13.A00 = new X.AnonymousClass8CZ(r13, r14, r0).start();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x04cc, code lost:
        r0 = r10.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x04ce, code lost:
        if (r0 <= 0) goto L_0x04f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x04d0, code lost:
        if (r8 != false) goto L_0x04f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x04d2, code lost:
        A1n = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x04da, code lost:
        if (r9.A0g.A06() != false) goto L_0x04e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x04dc, code lost:
        r1 = r9.A0L;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x04de, code lost:
        if (r1 == null) goto L_0x04e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x04e0, code lost:
        r1.A02 = r10.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x04e4, code lost:
        r0 = r9.A0A;
        X.C17880vN.A1C(X.C19830z4.A00(r0), "registration_voice_code_length", r10.A02);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x04f7, code lost:
        if (android.text.TextUtils.isEmpty(r10.A0I) != false) goto L_0x0505;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x04f9, code lost:
        r9.A0j.A0C(java.lang.Long.parseLong(r10.A0I) * 1000);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x0505, code lost:
        if (r8 == false) goto L_0x0580;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x0507, code lost:
        r0 = (X.C20605ARp) r9.A17.get();
        r10 = r10.A0B;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x0511, code lost:
        if (r10 != null) goto L_0x0515;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x0513, code lost:
        r10 = "(.*)xyz(.*)";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x0515, code lost:
        r8 = r9.A0m;
        X.C18070vi.A0d(r8, 2);
        r12 = r0.A02;
        r13 = X.C108945cZ.A0E(r0.A05);
        r14 = r0.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x0527, code lost:
        if (r14 != null) goto L_0x0535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x0529, code lost:
        r5 = new X.AnonymousClass8C6(r0.A03, r0.A06, r8, r9, r10);
        r0.A01 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x0535, code lost:
        r12.A00(r13, r14, new android.content.IntentFilter("android.intent.action.PHONE_STATE"), X.C19620yd.A0B, (android.os.Handler) null, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x0544, code lost:
        r14 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:?, code lost:
        r4 = r0.A04;
        r5 = r0.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x054b, code lost:
        if (r5 != null) goto L_0x0560;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x054d, code lost:
        r12 = new X.AnonymousClass8CE(r0.A03, r4, r9, r0.A08, r10);
        r0.A00 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x056a, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r0.A07, 8856) == false) goto L_0x0580;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x056c, code lost:
        r1 = r0.A03.A0O();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0058, code lost:
        if (r2 == X.AnonymousClass00R.A00) goto L_0x046d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x0572, code lost:
        if (r1 == null) goto L_0x0580;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x0574, code lost:
        r1.A09(android.provider.CallLog.Calls.CONTENT_URI, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x057a, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x057b, code lost:
        com.whatsapp.util.Log.e("FlashCallManager/registerCallLogContentObserver/exception/", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005a, code lost:
        r1 = X.AnonymousClass000.A10();
        X.C17890vO.A10("VerifyPhoneNumber/onVoiceOrFlashCodeRequestError/method=", r11, "/status=", r1);
        X.C17890vO.A1A(r1, X.C181669Rj.A00(r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x05bb, code lost:
        if (r11.equals(r0) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x05c1, code lost:
        if (isFinishing() != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006c, code lost:
        if (r2 != X.AnonymousClass00R.A0N) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x05c3, code lost:
        r1 = X.AnonymousClass000.A10();
        r1.append("VerifyPhoneNumber/onRequestGenericCodeResponse/method=");
        r1.append(r11);
        r1.append("/status=");
        X.C17890vO.A1A(r1, X.C181669Rj.A00(r2));
        X.A9B.A00 = "";
        A1W(r10, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x05e4, code lost:
        if (r2 != X.AnonymousClass00R.A0C) goto L_0x05ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x05e6, code lost:
        X.C17960vV.A07(r10);
        A1V(r10, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x05ec, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x05ef, code lost:
        if (r2 != X.AnonymousClass00R.A00) goto L_0x0672;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x05f1, code lost:
        X.C17960vV.A07(r10);
        com.whatsapp.util.Log.i("VerifyPhoneNumber/onGenericCodeSent");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x05fd, code lost:
        if (X.AnonymousClass8BR.A1O(r9) == false) goto L_0x0606;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x05ff, code lost:
        r9.A0A.A1Y("email_sent");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x0606, code lost:
        r1 = X.AnonymousClass8BU.A02(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006e, code lost:
        X.AnonymousClass4Yv.A00(r9, 52);
        X.C181689Rl.A00(r9.A05);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x060c, code lost:
        if (r1 == 13) goto L_0x0612;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x0610, code lost:
        if (r1 != 14) goto L_0x063c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x0612, code lost:
        A4h(3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x0618, code lost:
        if (r9.A1Q != false) goto L_0x063c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x061a, code lost:
        r2 = r9.A0f.A01.A05;
        X.C17900vP.A0n("AccountDefenceLocalDataRepository/saveSecondSmsRequestedOnce/", X.AnonymousClass000.A10(), true);
        r1 = X.AnonymousClass8BU.A08(r2.A00, "AccountDefenceLocalDataRepository_prefs");
        r1.putBoolean("com.whatsapp.registration.accountdefence.AccountDefenceLocalDataRepository.account_defence_sms_requested_once", true);
        r1.apply();
        r9.A1Q = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x063c, code lost:
        r2 = r10.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x063e, code lost:
        if (r2 <= 0) goto L_0x064b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x0640, code lost:
        A1m = r2;
        X.C17880vN.A1C(X.AnonymousClass8BR.A08(r9), "registration_sms_code_length", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0078, code lost:
        if (r8 == false) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x0651, code lost:
        if (android.text.TextUtils.isEmpty(r10.A0I) != false) goto L_0x065e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x0653, code lost:
        r9.A0j.A0C(X.AnonymousClass8BW.A08(r10.A0I));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x065e, code lost:
        r0 = r9.A0n;
        r0.A0T();
        r0 = r0.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x0665, code lost:
        if (r0 == null) goto L_0x09d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x0667, code lost:
        r0.A04();
        r9.A0A.A1I(r9.A03);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x0671, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x0672, code lost:
        A1D();
        r1 = X.AnonymousClass000.A10();
        X.C17890vO.A10("VerifyPhoneNumber/onRequestGenericCodeError/method=", r11, "/status=", r1);
        X.C17890vO.A1A(r1, X.C181669Rj.A00(r2));
        r4 = X.AnonymousClass8BR.A1X(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x0689, code lost:
        if (r4 == false) goto L_0x069a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x0691, code lost:
        if (r2.equals(X.AnonymousClass00R.A0E) != false) goto L_0x069a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x0693, code lost:
        r9.A0A.A1Y("email_otp_request_failed");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x069c, code lost:
        if (r2 != X.AnonymousClass00R.A0N) goto L_0x06a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x069e, code lost:
        X.AnonymousClass4Yv.A00(r9, 52);
        X.C181689Rl.A00(r9.A05);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x06a8, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x06ab, code lost:
        if (r2 != X.AnonymousClass00R.A19) goto L_0x06fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x06ad, code lost:
        X.C17960vV.A07(r10);
        com.whatsapp.util.Log.w("VerifyPhoneNumber/onRequestGenericCodeErrorTempUnavailable");
        X.A9B.A0U(r9.A0A, "server-send-request-temp-unavailable");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x06c2, code lost:
        if (A20(r10.A0L) != false) goto L_0x06d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x06c4, code lost:
        r1 = r9.A0h;
        r0 = 2131895030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007e, code lost:
        if (X.AnonymousClass8BR.A1M(r9) != false) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x06c9, code lost:
        r1.A02(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x06cc, code lost:
        A1A();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x06cf, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:?, code lost:
        r3 = X.AnonymousClass8BW.A08(r10.A0L);
        r9.A0j.A0C(r3);
        r9.A0h.A03(X.C108975cc.A0b(r9, X.C64052u8.A0A(r9.A00, r3), X.AnonymousClass3MW.A1a(), 2131895031));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x06f2, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x06f3, code lost:
        com.whatsapp.util.Log.w("VerifyPhoneNumber/request/sms/temporarily-unavailable/unable-to-parse-retryAfter", r1);
        r1 = r9.A0h;
        r0 = 2131895030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x0700, code lost:
        if (r2 != X.AnonymousClass00R.A0Y) goto L_0x0718;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x0702, code lost:
        X.C17890vO.A1B(X.C166988f1.A0Q(r11), "/unspecified");
        X.A9B.A0U(r9.A0A, "server-send-request-error-unspecified");
        r0 = 109;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0080, code lost:
        r9.A0A.A1e("secondary_failed");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x0714, code lost:
        A1H(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x071a, code lost:
        if (r2 != X.AnonymousClass00R.A15) goto L_0x074e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x071c, code lost:
        X.C17960vV.A07(r10);
        X.C17900vP.A0g("VerifyPhoneNumber/onRequestGenericCodeErrorTooMany/method=", r11, X.AnonymousClass000.A10());
        r3 = r11.equals("wa_old");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x0730, code lost:
        if (r3 == false) goto L_0x0747;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x0732, code lost:
        r5 = 40;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x073c, code lost:
        if (X.C166988f1.A0z(r9.A0A, r10, r9, "server-send-request-too-many-tries") != false) goto L_0x09da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x073e, code lost:
        r9.A0h.A01(r5);
        A1C();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x0746, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0087, code lost:
        A1m(r9, -1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x0747, code lost:
        r5 = 39;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x0749, code lost:
        if (r4 == false) goto L_0x0734;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x074b, code lost:
        r5 = 48;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x0750, code lost:
        if (r2 != X.AnonymousClass00R.A0A) goto L_0x0768;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x0752, code lost:
        X.C17960vV.A07(r10);
        com.whatsapp.util.Log.w("VerifyPhoneNumber/onRequestGenericCodeErrorTooManyAllMethods");
        r3 = 27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x0764, code lost:
        if (X.C166988f1.A0z(r9.A0A, r10, r9, "server-send-request-too-many-tries-all-methods") == false) goto L_0x08fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x076a, code lost:
        if (r2 != X.AnonymousClass00R.A0j) goto L_0x078a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x076c, code lost:
        X.A9B.A0U(r9.A0A, "server-send-request-error-connectivity");
        r0 = X.C108975cc.A0b(r9, getString(2131888733), X.AnonymousClass3MW.A1a(), 2131894981);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x0785, code lost:
        A1w(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x078c, code lost:
        if (r2 != X.AnonymousClass00R.A05) goto L_0x0797;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x078e, code lost:
        X.C17960vV.A07(r10);
        A1X(r10, r11, "server-send-request-bad-param");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x0796, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x0799, code lost:
        if (r2 != X.AnonymousClass00R.A06) goto L_0x07af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x079b, code lost:
        X.C17890vO.A19(X.C166988f1.A0Q(r11), "/missing-parameter");
        X.A9B.A0U(r9.A0A, "server-send-request-missing-param");
        r0 = 25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x07b1, code lost:
        if (r2 != X.AnonymousClass00R.A18) goto L_0x07c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x008e, code lost:
        if (r2 != X.AnonymousClass00R.A19) goto L_0x00f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x07b3, code lost:
        X.C17960vV.A07(r10);
        r1 = r10.A08;
        com.whatsapp.util.Log.w("VerifyPhoneNumber/onRequestGenericCodeErrorTooOld");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x07bd, code lost:
        if (r1 == null) goto L_0x0a4a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x07bf, code lost:
        A1c(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x07c2, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x07c5, code lost:
        if (r2 != X.AnonymousClass00R.A0u) goto L_0x07f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x07c7, code lost:
        X.C17960vV.A07(r10);
        r1 = X.AnonymousClass000.A10();
        r1.append("VerifyPhoneNumber/onRequestGenericCodeErrorTooRecent/retryAfter=");
        r1.append(r10.A0L);
        X.C17890vO.A1B(r1, " seconds");
        X.A9B.A0U(r9.A0A, "server-send-request-too-recent");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:0x07ea, code lost:
        if (A20(r10.A0L) != false) goto L_0x08a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x07ec, code lost:
        r1 = r9.A0h;
        r0 = 2131895034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0090, code lost:
        X.C17960vV.A07(r10);
        r1 = X.AnonymousClass000.A10();
        X.C166988f1.A0y("VerifyPhoneNumber/onRequestVoiceOrFlashErrorTempUnavailable/method=", r11, r1);
        X.C17890vO.A1A(r1, r10.A0L);
        X.A9B.A0U(r9.A0A, "voice-temp-unavail");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x07f5, code lost:
        if (r2 != X.AnonymousClass00R.A0M) goto L_0x07fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x07f7, code lost:
        A1B();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x07fa, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x07fd, code lost:
        if (r2 != X.AnonymousClass00R.A04) goto L_0x081f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:305:0x07ff, code lost:
        r4 = r10.A06;
        r3 = r10.A07;
        X.C17890vO.A19(X.C166988f1.A0Q(r11), "/blocked");
        r9.A0u.A02(12);
        X.A9B.A0U(r9.A0A, "server-send-request-user-blocked");
        A1O(r4, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x0821, code lost:
        if (r2 != X.AnonymousClass00R.A02) goto L_0x082c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x0823, code lost:
        X.C17960vV.A07(r10);
        A1y(r11, "server-send-request-next-method");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:0x082b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b0, code lost:
        if (A20(r10.A0L) != false) goto L_0x00bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:0x082e, code lost:
        if (r2 != X.AnonymousClass00R.A03) goto L_0x084e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x0830, code lost:
        X.C17960vV.A07(r10);
        com.whatsapp.util.Log.w("VerifyPhoneNumber/onRequestGenericCodeErrorTooManyGuesses");
        X.A9B.A0U(r9.A0A, "server-send-request-too-many-guesses");
        X.C166988f1.A0w(r9);
        r3 = 28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:313:0x084a, code lost:
        if (A20(r10.A0L) == false) goto L_0x08fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:315:0x0850, code lost:
        if (r2 != X.AnonymousClass00R.A07) goto L_0x0948;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x0852, code lost:
        X.C17960vV.A07(r10);
        r3 = X.AnonymousClass8BR.A1W(r11);
        com.whatsapp.util.Log.e("VerifyPhoneNumber/onRequestGenericCodeErrorProviderTimeout");
        X.A9B.A0U(r9.A0A, "server-send-request-provider-timeout");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:317:0x0867, code lost:
        if (r3 == false) goto L_0x087a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:318:0x0869, code lost:
        r6 = 2131895075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b2, code lost:
        r0 = 2131895030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x0872, code lost:
        if (A20(r10.A0L) != false) goto L_0x0903;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:321:0x0874, code lost:
        r0 = getString(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:322:0x087a, code lost:
        r6 = 2131895024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:0x087d, code lost:
        if (r4 == false) goto L_0x086c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x087f, code lost:
        r6 = 2131895264;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:?, code lost:
        r1 = X.AnonymousClass8BW.A08(r10.A0L);
        r9.A0B = r1;
        r9.A0j.A0C(r1);
        r9.A1W = true;
        r9.A0h.A01(31);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x089c, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:328:0x089d, code lost:
        r0 = "VerifyPhoneNumber/request/sms/triedtoomanytimesallmethods/time-not-int";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b5, code lost:
        r0 = getString(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:330:?, code lost:
        r3 = X.AnonymousClass8BW.A08(r10.A0L);
        r9.A0j.A0C(r3);
        r9.A0h.A03(X.C108975cc.A0b(r9, X.C64052u8.A0A(r9.A00, r3), X.AnonymousClass3MW.A1a(), 2131895033));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:331:0x08c3, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:332:0x08c4, code lost:
        com.whatsapp.util.Log.w("VerifyPhoneNumber/request/sms/too-recent/time-not-int", r1);
        r1 = r9.A0h;
        r0 = 2131895034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:334:?, code lost:
        r1 = X.AnonymousClass8BW.A08(r10.A0L);
        r9.A0B = r1;
        r9.A0j.A0C(r1);
        r9.A1W = true;
        r1 = r9.A0h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:335:0x08e6, code lost:
        if (X.AnonymousClass8BR.A1W(r11) == false) goto L_0x08eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:0x08e8, code lost:
        r0 = 33;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:337:0x08eb, code lost:
        r0 = 32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:338:0x08ed, code lost:
        if (r4 == false) goto L_0x08f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:339:0x08ef, code lost:
        r0 = 50;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00b9, code lost:
        A1w(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:340:0x08f1, code lost:
        r1.A01(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:341:0x08f6, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:342:0x08f7, code lost:
        r0 = "VerifyPhoneNumber/request/sms/too-many-guesses/time-not-int";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:343:0x08f9, code lost:
        com.whatsapp.util.Log.w(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:0x08fc, code lost:
        r9.A0h.A01(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:346:?, code lost:
        r1 = X.AnonymousClass8BW.A08(r10.A0L);
        r9.A0j.A0C(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:347:0x090e, code lost:
        if (r3 == false) goto L_0x0914;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:348:0x0910, code lost:
        r5 = 2131895074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:349:0x0914, code lost:
        r5 = 2131895023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:350:0x0917, code lost:
        if (r4 == false) goto L_0x091c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:351:0x0919, code lost:
        r5 = 2131895265;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:352:0x091c, code lost:
        A1w(getString(r5, new java.lang.Object[]{X.C64052u8.A0A(r9.A00, r1)}));
        X.C166988f1.A0x(r9.A0v, "sms", r1);
        A1J(r1, "sms");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:353:0x0939, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:354:0x093a, code lost:
        com.whatsapp.util.Log.w("VerifyPhoneNumber/request/sms/too-recent/time-not-int", r1);
        A1w(getString(r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:356:0x094a, code lost:
        if (r2 != X.AnonymousClass00R.A08) goto L_0x0967;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:357:0x094c, code lost:
        r0 = X.AnonymousClass8BR.A1O(r9);
        X.C17960vV.A07(r10);
        r13 = 2131895026;
        r14 = 2131895025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:358:0x0959, code lost:
        if (r0 == false) goto L_0x0961;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:0x095b, code lost:
        r13 = 2131895266;
        r14 = 2131895267;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        r1 = X.AnonymousClass8BW.A08(r10.A0L);
        A1I(r1);
        A1w(getString(2131895031, new java.lang.Object[]{X.C64052u8.A0A(r9.A00, r1)}));
        X.C166988f1.A0x(r9.A0v, "voice", r1);
        A1J(r1, "voice");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:360:0x0961, code lost:
        A1Y(r10, r11, "server-send-request-provider-unroutable", r13, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:0x0966, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:363:0x0969, code lost:
        if (r2 != X.AnonymousClass00R.A0B) goto L_0x0988;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:364:0x096b, code lost:
        r0 = X.AnonymousClass8BR.A1O(r9);
        X.C17960vV.A07(r10);
        r14 = 2131895026;
        r15 = 2131895025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:365:0x0978, code lost:
        if (r0 == false) goto L_0x0980;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:366:0x097a, code lost:
        r14 = 2131895266;
        r15 = 2131895267;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:367:0x0980, code lost:
        A1Z(r10, r11, "server-send-request-no-routes", "noRouteSms", r14, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:368:0x0987, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:369:0x0988, code lost:
        r4 = X.AnonymousClass00R.A09;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00e5, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:370:0x098a, code lost:
        if (r2 == r4) goto L_0x0a99;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:372:0x098e, code lost:
        if (r2 == X.AnonymousClass00R.A0D) goto L_0x0a99;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:374:0x0992, code lost:
        if (r2 != X.AnonymousClass00R.A0E) goto L_0x099b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:375:0x0994, code lost:
        X.C17960vV.A07(r10);
        A1U(r10, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:376:0x099a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:377:0x099b, code lost:
        r4 = X.AnonymousClass00R.A0H;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:378:0x099d, code lost:
        if (r2 == r4) goto L_0x0a7d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00e6, code lost:
        X.C17890vO.A13("/temporarily-unavailable/unable-to-parse-retryAfter", X.C166988f1.A0V(r11), r2);
        r0 = 2131895030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:380:0x09a1, code lost:
        if (r2 == X.AnonymousClass00R.A0I) goto L_0x0a7d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:382:0x09a5, code lost:
        if (r2 != X.AnonymousClass00R.A0J) goto L_0x09ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:383:0x09a7, code lost:
        A1v(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:384:0x09aa, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:386:0x09ad, code lost:
        if (r2 == X.AnonymousClass00R.A0K) goto L_0x0a5c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:388:0x09b1, code lost:
        if (r2 == X.AnonymousClass00R.A0L) goto L_0x0a5c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:390:0x09b5, code lost:
        if (r2 != X.AnonymousClass00R.A0O) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:391:0x09b7, code lost:
        com.whatsapp.util.Log.i("VerifyPhoneNumber/launchEmailChallengeFlow");
        r9.A07.A01(39);
        startActivity(X.AnonymousClass1LU.A1P(r9, X.C17890vO.A0Q(), 6));
        finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:392:0x09d2, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:396:?, code lost:
        r0 = X.AnonymousClass8BW.A08(r10.A0L);
        r9.A0B = r0;
        r9.A0j.A0C(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:397:0x09e9, code lost:
        if (r3 == false) goto L_0x0a13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:398:0x09eb, code lost:
        r9.A0h.A03(X.C17880vN.A0q(r9, X.C64052u8.A0A(r9.A00, r9.A0B), new java.lang.Object[1], 0, 2131895073));
        r9.A0v.A07("wa_old", java.lang.System.currentTimeMillis() + r9.A0B);
        A1J(r9.A0B, "wa_old");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:399:0x0a12, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00f5, code lost:
        if (r2 != X.AnonymousClass00R.A0Y) goto L_0x010e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:400:0x0a13, code lost:
        r9.A0h.A03(X.C17880vN.A0q(r9, X.C64052u8.A0A(r9.A00, r9.A0B), new java.lang.Object[1], 0, 2131896243));
        r9.A0v.A07("sms", java.lang.System.currentTimeMillis() + r9.A0B);
        A1J(r9.A0B, "sms");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:401:0x0a3a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:402:0x0a3b, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:403:0x0a3c, code lost:
        com.whatsapp.util.Log.w("VerifyPhoneNumber/request/sms/triedtoomanytimesallmethods/time-not-int", r1);
        r9.A0h.A01(r5);
        A1C();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:404:0x0a49, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:405:0x0a4a, code lost:
        r9.A0P.A01 = true;
        r9.A0u.A02(8);
        A1G(22);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:406:0x0a5b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:408:0x0a62, code lost:
        if (android.text.TextUtils.isEmpty(r10.A0M) != false) goto L_0x0a77;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:409:0x0a64, code lost:
        r3 = r10.A0M;
        com.whatsapp.util.Log.i("VerifyPhoneNumber/transitionToSendSmsToWa");
        A3q(X.AnonymousClass1LU.A1Z(r9, r3, (java.lang.String) null, 1, r9.A1N), true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00f7, code lost:
        X.C17890vO.A1B(X.C166988f1.A0Q(r11), "/unspecified");
        X.A9B.A0U(r9.A0A, "voice-error");
        r0 = 109;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:410:0x0a76, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:411:0x0a77, code lost:
        com.whatsapp.util.Log.e("VerifyPhoneNumber/send sms number is empty");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:412:0x0a7c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:413:0x0a7d, code lost:
        X.C17960vV.A07(r10);
        r11 = X.A9B.A02(r10.A0O, 0);
        r15 = X.A9B.A02(r10.A0Q, 0);
        A1L(r11, "sms", X.AnonymousClass000.A1Z(r2, r4), r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:414:0x0a98, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:415:0x0a99, code lost:
        r1 = X.C166988f1.A0Q(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:416:0x0a9f, code lost:
        if (r2 != r4) goto L_0x0ab1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:417:0x0aa1, code lost:
        r0 = "/bad-token";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:418:0x0aa3, code lost:
        X.C17890vO.A19(r1, r0);
        X.A9B.A0U(r9.A0A, "server-send-request-bad-token");
        A1H(41);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:419:0x0ab0, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0109, code lost:
        A1H(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:420:0x0ab1, code lost:
        r0 = "/invalid-skey";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:422:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:423:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:424:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:425:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0110, code lost:
        if (r2 != X.AnonymousClass00R.A15) goto L_0x0134;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0112, code lost:
        X.C17960vV.A07(r10);
        X.C17900vP.A0f("VerifyPhoneNumber/onRequestVoiceOrFlashErrorTooMany/method=", r11, X.AnonymousClass000.A10());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x012a, code lost:
        if (X.C166988f1.A0z(r9.A0A, r10, r9, "voice-error-too-many-tries") != false) goto L_0x0348;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x012c, code lost:
        A1H(26);
        A1C();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0136, code lost:
        if (r2 != X.AnonymousClass00R.A0A) goto L_0x0159;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0138, code lost:
        X.C17960vV.A07(r10);
        r1 = X.AnonymousClass000.A10();
        X.C166988f1.A0y("VerifyPhoneNumber/onRequestVoiceOrFlashErrorTooManyAllMethods/method=", r11, r1);
        X.C17890vO.A1A(r1, r10.A0L);
        r6 = 27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0155, code lost:
        if (X.C166988f1.A0z(r9.A0A, r10, r9, "voice-error-too-many-tries-all-methods") == false) goto L_0x03ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x015b, code lost:
        if (r2 != X.AnonymousClass00R.A0j) goto L_0x0171;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x015d, code lost:
        r0 = X.C108975cc.A0b(r9, getString(2131888733), X.AnonymousClass3MW.A1a(), 2131894981);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0173, code lost:
        if (r2 != X.AnonymousClass00R.A05) goto L_0x017f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0175, code lost:
        X.C17960vV.A07(r10);
        A1X(r10, r11, "voice-bad-param");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0181, code lost:
        if (r2 != X.AnonymousClass00R.A06) goto L_0x0197;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0183, code lost:
        X.C17890vO.A19(X.C166988f1.A0Q(r11), "/missing-parameter");
        X.A9B.A0U(r9.A0A, "voice-missing-param");
        r0 = 25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0199, code lost:
        if (r2 != X.AnonymousClass00R.A18) goto L_0x01bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x019b, code lost:
        X.C17960vV.A07(r10);
        r2 = r10.A08;
        X.C17900vP.A0f("VerifyPhoneNumber/onRequestVoiceOrFlashErrorTooOld/method=", r11, X.AnonymousClass000.A10());
        X.A9B.A0U(r9.A0A, "voice-version-too-old");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01b4, code lost:
        if (X.AnonymousClass8BR.A1M(r9) != false) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01b6, code lost:
        if (r2 == null) goto L_0x03b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01b8, code lost:
        A1c(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01bf, code lost:
        if (r2 != X.AnonymousClass00R.A0u) goto L_0x01e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01c1, code lost:
        X.C17960vV.A07(r10);
        r1 = X.AnonymousClass000.A10();
        X.C166988f1.A0y("VerifyPhoneNumber/onRequestVoiceOrFlashErrorTooRecent/method=", r11, r1);
        X.C17890vO.A1A(r1, r10.A0L);
        X.A9B.A0U(r9.A0A, "voice-too-recent");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01e1, code lost:
        if (A20(r10.A0L) != false) goto L_0x02d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001d, code lost:
        if (r11.equals(r0) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01e3, code lost:
        r0 = 2131895034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01ea, code lost:
        if (r2 != X.AnonymousClass00R.A0M) goto L_0x01f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01ec, code lost:
        A1B();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01f3, code lost:
        if (r2 != X.AnonymousClass00R.A04) goto L_0x0218;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01f5, code lost:
        X.C17960vV.A07(r10);
        r4 = r10.A06;
        r3 = r10.A07;
        X.C17890vO.A19(X.C166988f1.A0Q(r11), "/blocked");
        r9.A0u.A02(12);
        X.A9B.A0U(r9.A0A, "voice-blocked");
        A1O(r4, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x021a, code lost:
        if (r2 != X.AnonymousClass00R.A02) goto L_0x0226;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x021c, code lost:
        X.C17960vV.A07(r10);
        A1y(r11, "voice-next-method");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001f, code lost:
        r1 = X.AnonymousClass000.A10();
        r1.append("VerifyPhoneNumber/onRequestVoiceOrFlashCodeResponse/method=");
        r1.append(r11);
        r1.append("/status=");
        X.C17890vO.A1A(r1, X.C181669Rj.A00(r2));
        X.A9B.A00 = "";
        r8 = X.AnonymousClass8BR.A1V(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0228, code lost:
        if (r2 != X.AnonymousClass00R.A03) goto L_0x0253;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x022a, code lost:
        X.C17960vV.A07(r10);
        r1 = X.AnonymousClass000.A10();
        X.C166988f1.A0y("VerifyPhoneNumber/onRequestVoiceOrFlashErrorTooManyGuesses/method=", r11, r1);
        X.C17890vO.A1A(r1, r10.A0L);
        X.A9B.A0U(r9.A0A, "voice-too-many-guesses");
        X.C166988f1.A0w(r9);
        r6 = 28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x024f, code lost:
        if (A20(r10.A0L) == false) goto L_0x03ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0255, code lost:
        if (r2 != X.AnonymousClass00R.A07) goto L_0x0281;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0257, code lost:
        X.C17960vV.A07(r10);
        r1 = X.AnonymousClass000.A10();
        r1.append("VerifyPhoneNumber/verifyvoice/request/");
        r1.append(r11);
        X.C17890vO.A19(r1, "/provider-timeout");
        X.A9B.A0U(r9.A0A, "voice-provider-timeout");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x027a, code lost:
        if (A20(r10.A0L) != false) goto L_0x0310;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x027c, code lost:
        r0 = 2131895069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003f, code lost:
        if (r8 == false) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0283, code lost:
        if (r2 != X.AnonymousClass00R.A08) goto L_0x0295;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0285, code lost:
        X.C17960vV.A07(r10);
        A1Y(r10, r11, "voice-provider-unroutable", 2131895071, 2131895070);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0297, code lost:
        if (r2 != X.AnonymousClass00R.A0B) goto L_0x02ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0299, code lost:
        X.C17960vV.A07(r10);
        A1Z(r10, r11, "voice-no-routes", "noRouteVoice", 2131895071, 2131895070);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x02ab, code lost:
        r4 = X.AnonymousClass00R.A09;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x02ad, code lost:
        if (r2 == r4) goto L_0x02bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x02b1, code lost:
        if (r2 == X.AnonymousClass00R.A0D) goto L_0x02bf;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A4j(X.ADN r20, java.lang.String r21) {
        /*
            r19 = this;
            r10 = r20
            java.lang.Integer r2 = r10.A09
            r11 = r21
            int r0 = r11.hashCode()
            r9 = r19
            switch(r0) {
                case -795576526: goto L_0x05b5;
                case 114009: goto L_0x05b2;
                case 97513456: goto L_0x0017;
                case 112386354: goto L_0x0014;
                case 2120743944: goto L_0x0010;
                default: goto L_0x000f;
            }
        L_0x000f:
            return
        L_0x0010:
            java.lang.String r0 = "email_otp"
            goto L_0x05b7
        L_0x0014:
            java.lang.String r0 = "voice"
            goto L_0x0019
        L_0x0017:
            java.lang.String r0 = "flash"
        L_0x0019:
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x000f
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "VerifyPhoneNumber/onRequestVoiceOrFlashCodeResponse/method="
            r1.append(r0)
            r1.append(r11)
            java.lang.String r3 = "/status="
            r1.append(r3)
            java.lang.String r0 = X.C181669Rj.A00(r2)
            X.C17890vO.A1A(r1, r0)
            java.lang.String r0 = ""
            X.A9B.A00 = r0
            boolean r8 = X.AnonymousClass8BR.A1V(r11)
            if (r8 == 0) goto L_0x0045
            java.lang.Integer r0 = X.AnonymousClass00R.A0G
            if (r2 == r0) goto L_0x0048
        L_0x0045:
            r9.A1W(r10, r11)
        L_0x0048:
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            if (r2 != r0) goto L_0x0056
            X.C17960vV.A07(r10)
            r9.A1V(r10, r11)
        L_0x0052:
            r9.A1x(r11)
            return
        L_0x0056:
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            if (r2 == r0) goto L_0x046d
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "VerifyPhoneNumber/onVoiceOrFlashCodeRequestError/method="
            X.C17890vO.A10(r0, r11, r3, r1)
            java.lang.String r0 = X.C181669Rj.A00(r2)
            X.C17890vO.A1A(r1, r0)
            java.lang.Integer r0 = X.AnonymousClass00R.A0N
            if (r2 != r0) goto L_0x008c
            r0 = 52
            X.AnonymousClass4Yv.A00(r9, r0)
            X.1KB r0 = r9.A05
            X.C181689Rl.A00(r0)
        L_0x0078:
            if (r8 == 0) goto L_0x0087
        L_0x007a:
            boolean r0 = X.AnonymousClass8BR.A1M(r9)
            if (r0 != 0) goto L_0x0087
            X.0z4 r1 = r9.A0A
            java.lang.String r0 = "secondary_failed"
            r1.A1e(r0)
        L_0x0087:
            r0 = -1
            A1m(r9, r0)
            goto L_0x0052
        L_0x008c:
            java.lang.Integer r0 = X.AnonymousClass00R.A19
            if (r2 != r0) goto L_0x00f3
            X.C17960vV.A07(r10)
            java.lang.String r6 = "voice"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "VerifyPhoneNumber/onRequestVoiceOrFlashErrorTempUnavailable/method="
            X.C166988f1.A0y(r0, r11, r1)
            java.lang.String r0 = r10.A0L
            X.C17890vO.A1A(r1, r0)
            X.0z4 r1 = r9.A0A
            java.lang.String r0 = "voice-temp-unavail"
            X.A9B.A0U(r1, r0)
            java.lang.String r0 = r10.A0L
            boolean r0 = A20(r0)
            if (r0 != 0) goto L_0x00bd
            r0 = 2131895030(0x7f1222f6, float:1.9424881E38)
        L_0x00b5:
            java.lang.String r0 = r9.getString(r0)
        L_0x00b9:
            r9.A1w(r0)
            goto L_0x0078
        L_0x00bd:
            java.lang.String r0 = r10.A0L     // Catch:{ NumberFormatException -> 0x00e5 }
            long r1 = X.AnonymousClass8BW.A08(r0)     // Catch:{ NumberFormatException -> 0x00e5 }
            r9.A1I(r1)     // Catch:{ NumberFormatException -> 0x00e5 }
            r5 = 2131895031(0x7f1222f7, float:1.9424884E38)
            r0 = 1
            java.lang.Object[] r4 = new java.lang.Object[r0]     // Catch:{ NumberFormatException -> 0x00e5 }
            X.0vb r0 = r9.A00     // Catch:{ NumberFormatException -> 0x00e5 }
            java.lang.String r3 = X.C64052u8.A0A(r0, r1)     // Catch:{ NumberFormatException -> 0x00e5 }
            r0 = 0
            r4[r0] = r3     // Catch:{ NumberFormatException -> 0x00e5 }
            java.lang.String r0 = r9.getString(r5, r4)     // Catch:{ NumberFormatException -> 0x00e5 }
            r9.A1w(r0)     // Catch:{ NumberFormatException -> 0x00e5 }
            X.A5R r0 = r9.A0v     // Catch:{ NumberFormatException -> 0x00e5 }
            X.C166988f1.A0x(r0, r6, r1)     // Catch:{ NumberFormatException -> 0x00e5 }
            r9.A1J(r1, r6)     // Catch:{ NumberFormatException -> 0x00e5 }
            goto L_0x0078
        L_0x00e5:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.C166988f1.A0V(r11)
            java.lang.String r0 = "/temporarily-unavailable/unable-to-parse-retryAfter"
            X.C17890vO.A13(r0, r1, r2)
            r0 = 2131895030(0x7f1222f6, float:1.9424881E38)
            goto L_0x00b5
        L_0x00f3:
            java.lang.Integer r0 = X.AnonymousClass00R.A0Y
            if (r2 != r0) goto L_0x010e
            java.lang.String r2 = "voice-error"
            java.lang.StringBuilder r1 = X.C166988f1.A0Q(r11)
            java.lang.String r0 = "/unspecified"
            X.C17890vO.A1B(r1, r0)
            X.0z4 r0 = r9.A0A
            X.A9B.A0U(r0, r2)
            r0 = 109(0x6d, float:1.53E-43)
        L_0x0109:
            r9.A1H(r0)
            goto L_0x0078
        L_0x010e:
            java.lang.Integer r0 = X.AnonymousClass00R.A15
            if (r2 != r0) goto L_0x0134
            X.C17960vV.A07(r10)
            java.lang.String r6 = "voice"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "VerifyPhoneNumber/onRequestVoiceOrFlashErrorTooMany/method="
            X.C17900vP.A0f(r0, r11, r1)
            X.0z4 r1 = r9.A0A
            java.lang.String r0 = "voice-error-too-many-tries"
            boolean r0 = X.C166988f1.A0z(r1, r10, r9, r0)
            r5 = 26
            if (r0 != 0) goto L_0x0348
            r9.A1H(r5)
            r9.A1C()
            goto L_0x0078
        L_0x0134:
            java.lang.Integer r0 = X.AnonymousClass00R.A0A
            if (r2 != r0) goto L_0x0159
            X.C17960vV.A07(r10)
            java.lang.String r5 = "voice"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "VerifyPhoneNumber/onRequestVoiceOrFlashErrorTooManyAllMethods/method="
            X.C166988f1.A0y(r0, r11, r1)
            java.lang.String r0 = r10.A0L
            X.C17890vO.A1A(r1, r0)
            X.0z4 r1 = r9.A0A
            java.lang.String r0 = "voice-error-too-many-tries-all-methods"
            boolean r0 = X.C166988f1.A0z(r1, r10, r9, r0)
            r6 = 27
            if (r0 == 0) goto L_0x03ed
            goto L_0x038e
        L_0x0159:
            java.lang.Integer r0 = X.AnonymousClass00R.A0j
            if (r2 != r0) goto L_0x0171
            r2 = 2131894981(0x7f1222c5, float:1.9424782E38)
            java.lang.Object[] r1 = X.AnonymousClass3MW.A1a()
            r0 = 2131888733(0x7f120a5d, float:1.941211E38)
            java.lang.String r0 = r9.getString(r0)
            java.lang.String r0 = X.C108975cc.A0b(r9, r0, r1, r2)
            goto L_0x00b9
        L_0x0171:
            java.lang.Integer r0 = X.AnonymousClass00R.A05
            if (r2 != r0) goto L_0x017f
            X.C17960vV.A07(r10)
            java.lang.String r0 = "voice-bad-param"
            r9.A1X(r10, r11, r0)
            goto L_0x0078
        L_0x017f:
            java.lang.Integer r0 = X.AnonymousClass00R.A06
            if (r2 != r0) goto L_0x0197
            java.lang.String r2 = "voice-missing-param"
            java.lang.StringBuilder r1 = X.C166988f1.A0Q(r11)
            java.lang.String r0 = "/missing-parameter"
            X.C17890vO.A19(r1, r0)
            X.0z4 r0 = r9.A0A
            X.A9B.A0U(r0, r2)
            r0 = 25
            goto L_0x0109
        L_0x0197:
            java.lang.Integer r0 = X.AnonymousClass00R.A18
            if (r2 != r0) goto L_0x01bd
            X.C17960vV.A07(r10)
            X.9tK r2 = r10.A08
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "VerifyPhoneNumber/onRequestVoiceOrFlashErrorTooOld/method="
            X.C17900vP.A0f(r0, r11, r1)
            X.0z4 r1 = r9.A0A
            java.lang.String r0 = "voice-version-too-old"
            X.A9B.A0U(r1, r0)
            boolean r0 = X.AnonymousClass8BR.A1M(r9)
            if (r0 != 0) goto L_0x0078
            if (r2 == 0) goto L_0x03b1
            r9.A1c(r2)
            goto L_0x0078
        L_0x01bd:
            java.lang.Integer r0 = X.AnonymousClass00R.A0u
            if (r2 != r0) goto L_0x01e8
            X.C17960vV.A07(r10)
            java.lang.String r6 = "voice"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "VerifyPhoneNumber/onRequestVoiceOrFlashErrorTooRecent/method="
            X.C166988f1.A0y(r0, r11, r1)
            java.lang.String r0 = r10.A0L
            X.C17890vO.A1A(r1, r0)
            X.0z4 r1 = r9.A0A
            java.lang.String r0 = "voice-too-recent"
            X.A9B.A0U(r1, r0)
            java.lang.String r0 = r10.A0L
            boolean r0 = A20(r0)
            if (r0 != 0) goto L_0x02d8
            r0 = 2131895034(0x7f1222fa, float:1.942489E38)
            goto L_0x00b5
        L_0x01e8:
            java.lang.Integer r0 = X.AnonymousClass00R.A0M
            if (r2 != r0) goto L_0x01f1
            r9.A1B()
            goto L_0x0078
        L_0x01f1:
            java.lang.Integer r0 = X.AnonymousClass00R.A04
            if (r2 != r0) goto L_0x0218
            X.C17960vV.A07(r10)
            X.ADM r4 = r10.A06
            X.2mr r3 = r10.A07
            java.lang.String r2 = "voice-blocked"
            java.lang.StringBuilder r1 = X.C166988f1.A0Q(r11)
            java.lang.String r0 = "/blocked"
            X.C17890vO.A19(r1, r0)
            X.A10 r1 = r9.A0u
            r0 = 12
            r1.A02(r0)
            X.0z4 r0 = r9.A0A
            X.A9B.A0U(r0, r2)
            r9.A1O(r4, r3)
            goto L_0x0078
        L_0x0218:
            java.lang.Integer r0 = X.AnonymousClass00R.A02
            if (r2 != r0) goto L_0x0226
            X.C17960vV.A07(r10)
            java.lang.String r0 = "voice-next-method"
            r9.A1y(r11, r0)
            goto L_0x0078
        L_0x0226:
            java.lang.Integer r0 = X.AnonymousClass00R.A03
            if (r2 != r0) goto L_0x0253
            X.C17960vV.A07(r10)
            java.lang.String r5 = "voice"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "VerifyPhoneNumber/onRequestVoiceOrFlashErrorTooManyGuesses/method="
            X.C166988f1.A0y(r0, r11, r1)
            java.lang.String r0 = r10.A0L
            X.C17890vO.A1A(r1, r0)
            X.0z4 r1 = r9.A0A
            java.lang.String r0 = "voice-too-many-guesses"
            X.A9B.A0U(r1, r0)
            X.C166988f1.A0w(r9)
            java.lang.String r0 = r10.A0L
            boolean r0 = A20(r0)
            r6 = 28
            if (r0 == 0) goto L_0x03ed
            goto L_0x03b8
        L_0x0253:
            java.lang.Integer r0 = X.AnonymousClass00R.A07
            if (r2 != r0) goto L_0x0281
            X.C17960vV.A07(r10)
            java.lang.String r7 = "voice"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r6 = "VerifyPhoneNumber/verifyvoice/request/"
            r1.append(r6)
            r1.append(r11)
            java.lang.String r0 = "/provider-timeout"
            X.C17890vO.A19(r1, r0)
            X.0z4 r1 = r9.A0A
            java.lang.String r0 = "voice-provider-timeout"
            X.A9B.A0U(r1, r0)
            java.lang.String r0 = r10.A0L
            boolean r0 = A20(r0)
            if (r0 != 0) goto L_0x0310
            r0 = 2131895069(0x7f12231d, float:1.942496E38)
            goto L_0x00b5
        L_0x0281:
            java.lang.Integer r0 = X.AnonymousClass00R.A08
            if (r2 != r0) goto L_0x0295
            X.C17960vV.A07(r10)
            r13 = 2131895071(0x7f12231f, float:1.9424965E38)
            r14 = 2131895070(0x7f12231e, float:1.9424963E38)
            java.lang.String r12 = "voice-provider-unroutable"
            r9.A1Y(r10, r11, r12, r13, r14)
            goto L_0x0078
        L_0x0295:
            java.lang.Integer r0 = X.AnonymousClass00R.A0B
            if (r2 != r0) goto L_0x02ab
            X.C17960vV.A07(r10)
            r14 = 2131895071(0x7f12231f, float:1.9424965E38)
            r15 = 2131895070(0x7f12231e, float:1.9424963E38)
            java.lang.String r13 = "noRouteVoice"
            java.lang.String r12 = "voice-no-routes"
            r9.A1Z(r10, r11, r12, r13, r14, r15)
            goto L_0x0078
        L_0x02ab:
            java.lang.Integer r4 = X.AnonymousClass00R.A09
            if (r2 == r4) goto L_0x02bf
            java.lang.Integer r0 = X.AnonymousClass00R.A0D
            if (r2 == r0) goto L_0x02bf
            java.lang.Integer r0 = X.AnonymousClass00R.A0E
            if (r2 != r0) goto L_0x03f2
            X.C17960vV.A07(r10)
            r9.A1U(r10, r11)
            goto L_0x0078
        L_0x02bf:
            java.lang.String r3 = "voice-bad-token"
            java.lang.StringBuilder r1 = X.C166988f1.A0Q(r11)
            if (r2 != r4) goto L_0x02d5
            java.lang.String r0 = "/bad-token"
        L_0x02c9:
            X.C17890vO.A19(r1, r0)
            X.0z4 r0 = r9.A0A
            X.A9B.A0U(r0, r3)
            r0 = 41
            goto L_0x0109
        L_0x02d5:
            java.lang.String r0 = "/invalid-skey"
            goto L_0x02c9
        L_0x02d8:
            java.lang.String r0 = r10.A0L     // Catch:{ NumberFormatException -> 0x0301 }
            long r1 = X.AnonymousClass8BW.A08(r0)     // Catch:{ NumberFormatException -> 0x0301 }
            r9.A1I(r1)     // Catch:{ NumberFormatException -> 0x0301 }
            r5 = 2131895033(0x7f1222f9, float:1.9424888E38)
            r0 = 1
            java.lang.Object[] r4 = new java.lang.Object[r0]     // Catch:{ NumberFormatException -> 0x0301 }
            X.0vb r0 = r9.A00     // Catch:{ NumberFormatException -> 0x0301 }
            java.lang.String r3 = X.C64052u8.A0A(r0, r1)     // Catch:{ NumberFormatException -> 0x0301 }
            r0 = 0
            r4[r0] = r3     // Catch:{ NumberFormatException -> 0x0301 }
            java.lang.String r0 = r9.getString(r5, r4)     // Catch:{ NumberFormatException -> 0x0301 }
            r9.A1w(r0)     // Catch:{ NumberFormatException -> 0x0301 }
            X.A5R r0 = r9.A0v     // Catch:{ NumberFormatException -> 0x0301 }
            X.C166988f1.A0x(r0, r6, r1)     // Catch:{ NumberFormatException -> 0x0301 }
            r9.A1J(r1, r6)     // Catch:{ NumberFormatException -> 0x0301 }
            goto L_0x0078
        L_0x0301:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.C166988f1.A0V(r11)
            java.lang.String r0 = "/too-recent/time-not-int"
            X.C17890vO.A13(r0, r1, r2)
            r0 = 2131895034(0x7f1222fa, float:1.942489E38)
            goto L_0x00b5
        L_0x0310:
            java.lang.String r0 = r10.A0L     // Catch:{ NumberFormatException -> 0x0339 }
            long r1 = X.AnonymousClass8BW.A08(r0)     // Catch:{ NumberFormatException -> 0x0339 }
            r9.A1I(r1)     // Catch:{ NumberFormatException -> 0x0339 }
            r5 = 2131895068(0x7f12231c, float:1.9424959E38)
            r0 = 1
            java.lang.Object[] r4 = new java.lang.Object[r0]     // Catch:{ NumberFormatException -> 0x0339 }
            X.0vb r0 = r9.A00     // Catch:{ NumberFormatException -> 0x0339 }
            java.lang.String r3 = X.C64052u8.A0A(r0, r1)     // Catch:{ NumberFormatException -> 0x0339 }
            r0 = 0
            r4[r0] = r3     // Catch:{ NumberFormatException -> 0x0339 }
            java.lang.String r0 = r9.getString(r5, r4)     // Catch:{ NumberFormatException -> 0x0339 }
            r9.A1w(r0)     // Catch:{ NumberFormatException -> 0x0339 }
            X.A5R r0 = r9.A0v     // Catch:{ NumberFormatException -> 0x0339 }
            X.C166988f1.A0x(r0, r7, r1)     // Catch:{ NumberFormatException -> 0x0339 }
            r9.A1J(r1, r7)     // Catch:{ NumberFormatException -> 0x0339 }
            goto L_0x0078
        L_0x0339:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass8BW.A0o(r6, r11)
            java.lang.String r0 = "/too-recent/time-not-int"
            X.C17890vO.A13(r0, r1, r2)
            r0 = 2131895069(0x7f12231d, float:1.942496E38)
            goto L_0x00b5
        L_0x0348:
            java.lang.String r0 = r10.A0L     // Catch:{ NumberFormatException -> 0x037c }
            long r0 = X.AnonymousClass8BW.A08(r0)     // Catch:{ NumberFormatException -> 0x037c }
            r9.A0B = r0     // Catch:{ NumberFormatException -> 0x037c }
            r9.A1I(r0)     // Catch:{ NumberFormatException -> 0x037c }
            r4 = 2131896243(0x7f1227b3, float:1.9427342E38)
            java.lang.Object[] r3 = X.AnonymousClass3MW.A1a()     // Catch:{ NumberFormatException -> 0x037c }
            X.0vb r2 = r9.A00     // Catch:{ NumberFormatException -> 0x037c }
            long r0 = r9.A0B     // Catch:{ NumberFormatException -> 0x037c }
            java.lang.String r0 = X.C64052u8.A0A(r2, r0)     // Catch:{ NumberFormatException -> 0x037c }
            java.lang.String r0 = X.C108975cc.A0b(r9, r0, r3, r4)     // Catch:{ NumberFormatException -> 0x037c }
            r9.A1w(r0)     // Catch:{ NumberFormatException -> 0x037c }
            X.A5R r4 = r9.A0v     // Catch:{ NumberFormatException -> 0x037c }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ NumberFormatException -> 0x037c }
            long r0 = r9.A0B     // Catch:{ NumberFormatException -> 0x037c }
            long r2 = r2 + r0
            r4.A07(r6, r2)     // Catch:{ NumberFormatException -> 0x037c }
            long r0 = r9.A0B     // Catch:{ NumberFormatException -> 0x037c }
            r9.A1J(r0, r6)     // Catch:{ NumberFormatException -> 0x037c }
            goto L_0x0078
        L_0x037c:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.C166988f1.A0V(r11)
            java.lang.String r0 = "/triedtoomanytimesallmethods/time-not-int"
            X.C17890vO.A13(r0, r1, r2)
            r9.A1H(r5)
            r9.A1C()
            goto L_0x0078
        L_0x038e:
            java.lang.String r0 = r10.A0L     // Catch:{ NumberFormatException -> 0x03e3 }
            long r0 = X.AnonymousClass8BW.A08(r0)     // Catch:{ NumberFormatException -> 0x03e3 }
            r9.A0B = r0     // Catch:{ NumberFormatException -> 0x03e3 }
            r9.A1I(r0)     // Catch:{ NumberFormatException -> 0x03e3 }
            r0 = 31
            r9.A1H(r0)     // Catch:{ NumberFormatException -> 0x03e3 }
            X.A5R r4 = r9.A0v     // Catch:{ NumberFormatException -> 0x03e3 }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ NumberFormatException -> 0x03e3 }
            long r0 = r9.A0B     // Catch:{ NumberFormatException -> 0x03e3 }
            long r2 = r2 + r0
            r4.A07(r5, r2)     // Catch:{ NumberFormatException -> 0x03e3 }
            long r0 = r9.A0B     // Catch:{ NumberFormatException -> 0x03e3 }
            r9.A1J(r0, r5)     // Catch:{ NumberFormatException -> 0x03e3 }
            goto L_0x0078
        L_0x03b1:
            r0 = 22
            r9.A1G(r0)
            goto L_0x0078
        L_0x03b8:
            java.lang.String r0 = r10.A0L     // Catch:{ NumberFormatException -> 0x03db }
            long r0 = X.AnonymousClass8BW.A08(r0)     // Catch:{ NumberFormatException -> 0x03db }
            r9.A0B = r0     // Catch:{ NumberFormatException -> 0x03db }
            r9.A1I(r0)     // Catch:{ NumberFormatException -> 0x03db }
            r0 = 32
            r9.A1H(r0)     // Catch:{ NumberFormatException -> 0x03db }
            X.A5R r4 = r9.A0v     // Catch:{ NumberFormatException -> 0x03db }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ NumberFormatException -> 0x03db }
            long r0 = r9.A0B     // Catch:{ NumberFormatException -> 0x03db }
            long r2 = r2 + r0
            r4.A07(r5, r2)     // Catch:{ NumberFormatException -> 0x03db }
            long r0 = r9.A0B     // Catch:{ NumberFormatException -> 0x03db }
            r9.A1J(r0, r5)     // Catch:{ NumberFormatException -> 0x03db }
            goto L_0x0078
        L_0x03db:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.C166988f1.A0V(r11)
            java.lang.String r0 = "/too-many-guesses/time-not-int"
            goto L_0x03ea
        L_0x03e3:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.C166988f1.A0V(r11)
            java.lang.String r0 = "/triedtoomanytimesallmethods/time-not-int"
        L_0x03ea:
            X.C17890vO.A13(r0, r1, r2)
        L_0x03ed:
            r9.A1H(r6)
            goto L_0x0078
        L_0x03f2:
            java.lang.Integer r4 = X.AnonymousClass00R.A0H
            if (r2 == r4) goto L_0x0451
            java.lang.Integer r0 = X.AnonymousClass00R.A0I
            if (r2 == r0) goto L_0x0451
            if (r8 == 0) goto L_0x0427
            java.lang.Integer r0 = X.AnonymousClass00R.A0G
            if (r2 != r0) goto L_0x0427
            java.lang.String r0 = "VerifyPhoneNumber/onRequestFlashErrorDisabled/fall back to voice"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            boolean r0 = X.AnonymousClass8BR.A1M(r9)
            if (r0 != 0) goto L_0x007a
            X.19D r1 = r9.A00
            X.0z4 r0 = r9.A0A
            X.99F r1 = X.A9B.A0B(r0, r1)
            X.0z4 r0 = r9.A0A
            boolean r0 = r0.A2O()
            if (r0 == 0) goto L_0x0421
            java.lang.Boolean r0 = X.AnonymousClass000.A0i()
            r1.A02 = r0
        L_0x0421:
            r0 = 0
            r9.A1b(r1, r0)
            goto L_0x007a
        L_0x0427:
            java.lang.Integer r0 = X.AnonymousClass00R.A0J
            if (r2 != r0) goto L_0x0430
            r9.A1v(r11)
            goto L_0x0078
        L_0x0430:
            java.lang.Integer r0 = X.AnonymousClass00R.A0O
            if (r2 != r0) goto L_0x0078
            java.lang.String r0 = "VerifyPhoneNumber/launchEmailChallengeFlow"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1CM r1 = r9.A07
            r0 = 39
            r1.A01(r0)
            java.lang.String r1 = X.C17890vO.A0Q()
            r0 = 6
            android.content.Intent r0 = X.AnonymousClass1LU.A1P(r9, r1, r0)
            r9.startActivity(r0)
            r9.finish()
            goto L_0x0078
        L_0x0451:
            X.C17960vV.A07(r10)
            java.lang.String r3 = r10.A0O
            r0 = 0
            long r13 = X.A9B.A02(r3, r0)
            java.lang.String r3 = r10.A0Q
            long r17 = X.A9B.A02(r3, r0)
            boolean r16 = X.AnonymousClass000.A1Z(r2, r4)
            r12 = r9
            r15 = r11
            r12.A1L(r13, r15, r16, r17)
            goto L_0x0078
        L_0x046d:
            X.C17960vV.A07(r10)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r2 = "VerifyPhoneNumber/verifyvoice/request/"
            r1.append(r2)
            r1.append(r11)
            java.lang.String r0 = "/requested"
            X.C17890vO.A1A(r1, r0)
            r6 = 1000(0x3e8, double:4.94E-321)
            if (r8 == 0) goto L_0x04cc
            java.lang.String r0 = r10.A0F
            if (r0 == 0) goto L_0x0490
            long r0 = java.lang.Long.parseLong(r0)
            long r0 = r0 * r6
            r9.A0A = r0
        L_0x0490:
            com.whatsapp.registration.flashcall.FlashCallViewModel r13 = r9.A0o
            long r0 = r9.A0A
            r13.A0T()
            int r3 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r3 >= 0) goto L_0x0544
            r14 = 30000(0x7530, double:1.4822E-319)
        L_0x049d:
            r3 = 2
            long r0 = r0 / r3
            X.1DT r4 = r13.A03
            java.lang.String r3 = "running"
            r4.A0E(r3)
            X.1DT r4 = r13.A01
            r3 = 0
            X.AnonymousClass3MY.A1M(r4, r3)
            X.19D r5 = r13.A04
            r4 = 8940(0x22ec, float:1.2528E-41)
            X.0vf r3 = X.C18040vf.A02
            boolean r3 = X.C18020vd.A05(r3, r5, r4)
            if (r3 == 0) goto L_0x04bf
            X.1DT r4 = r13.A02
            r3 = 1
            X.AnonymousClass3MX.A1K(r4, r3)
        L_0x04bf:
            X.8CZ r12 = new X.8CZ
            r16 = r0
            r12.<init>(r13, r14, r16)
            android.os.CountDownTimer r0 = r12.start()
            r13.A00 = r0
        L_0x04cc:
            int r0 = r10.A02
            if (r0 <= 0) goto L_0x04f1
            if (r8 != 0) goto L_0x04f1
            A1n = r0
            X.4VX r0 = r9.A0g
            boolean r0 = r0.A06()
            if (r0 != 0) goto L_0x04e4
            com.whatsapp.CodeInputField r1 = r9.A0L
            if (r1 == 0) goto L_0x04e4
            int r0 = r10.A02
            r1.A02 = r0
        L_0x04e4:
            X.0z4 r0 = r9.A0A
            int r3 = r10.A02
            android.content.SharedPreferences$Editor r1 = X.C19830z4.A00(r0)
            java.lang.String r0 = "registration_voice_code_length"
            X.C17880vN.A1C(r1, r0, r3)
        L_0x04f1:
            java.lang.String r0 = r10.A0I
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0505
            java.lang.String r0 = r10.A0I
            long r0 = java.lang.Long.parseLong(r0)
            long r0 = r0 * r6
            X.1jT r3 = r9.A0j
            r3.A0C(r0)
        L_0x0505:
            if (r8 == 0) goto L_0x0580
            X.00H r0 = r9.A17
            java.lang.Object r0 = r0.get()
            X.ARp r0 = (X.C20605ARp) r0
            java.lang.String r10 = r10.A0B
            if (r10 != 0) goto L_0x0515
            java.lang.String r10 = "(.*)xyz(.*)"
        L_0x0515:
            X.99E r8 = r9.A0m
            r17 = 0
            r1 = 2
            X.C18070vi.A0d(r8, r1)
            X.1cw r12 = r0.A02
            X.118 r1 = r0.A05
            android.content.Context r13 = X.C108945cZ.A0E(r1)
            X.8C6 r14 = r0.A01
            if (r14 != 0) goto L_0x0535
            X.11C r6 = r0.A03
            X.17x r7 = r0.A06
            X.8C6 r14 = new X.8C6
            r5 = r14
            r5.<init>(r6, r7, r8, r9, r10)
            r0.A01 = r14
        L_0x0535:
            java.lang.String r1 = "android.intent.action.PHONE_STATE"
            android.content.IntentFilter r15 = new android.content.IntentFilter
            r15.<init>(r1)
            java.lang.String r16 = X.C19620yd.A0B
            r18 = 1
            r12.A00(r13, r14, r15, r16, r17, r18)
            goto L_0x0547
        L_0x0544:
            r14 = r0
            goto L_0x049d
        L_0x0547:
            X.11P r4 = r0.A04     // Catch:{ Exception -> 0x057a }
            X.8CE r5 = r0.A00     // Catch:{ Exception -> 0x057a }
            if (r5 != 0) goto L_0x0560
            X.10I r3 = r0.A08     // Catch:{ Exception -> 0x057a }
            X.11C r1 = r0.A03     // Catch:{ Exception -> 0x057a }
            X.8CE r5 = new X.8CE     // Catch:{ Exception -> 0x057a }
            r12 = r5
            r13 = r1
            r14 = r4
            r15 = r9
            r16 = r3
            r17 = r10
            r12.<init>(r13, r14, r15, r16, r17)     // Catch:{ Exception -> 0x057a }
            r0.A00 = r5     // Catch:{ Exception -> 0x057a }
        L_0x0560:
            X.19D r4 = r0.A07     // Catch:{ Exception -> 0x057a }
            r3 = 8856(0x2298, float:1.241E-41)
            X.0vf r1 = X.C18040vf.A02     // Catch:{ Exception -> 0x057a }
            boolean r1 = X.C18020vd.A05(r1, r4, r3)     // Catch:{ Exception -> 0x057a }
            if (r1 == 0) goto L_0x0580
            X.11C r0 = r0.A03     // Catch:{ Exception -> 0x057a }
            X.11B r1 = r0.A0O()     // Catch:{ Exception -> 0x057a }
            if (r1 == 0) goto L_0x0580
            android.net.Uri r0 = android.provider.CallLog.Calls.CONTENT_URI     // Catch:{ Exception -> 0x057a }
            r1.A09(r0, r5)     // Catch:{ Exception -> 0x057a }
            goto L_0x0580
        L_0x057a:
            r1 = move-exception
            java.lang.String r0 = "FlashCallManager/registerCallLogContentObserver/exception/"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0580:
            int r1 = X.AnonymousClass8BU.A02(r9)
            r0 = 13
            if (r1 == r0) goto L_0x058c
            r0 = 14
            if (r1 != r0) goto L_0x05a4
        L_0x058c:
            java.lang.String r0 = "voice"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x05a4
            java.lang.StringBuilder r1 = X.AnonymousClass8BW.A0o(r2, r11)
            java.lang.String r0 = "/update acct defence stat:"
            r1.append(r0)
            r0 = 3
            X.C17900vP.A0o(r1, r0)
            r9.A4h(r0)
        L_0x05a4:
            com.whatsapp.registration.entercode.EnterCodeViewModel r0 = r9.A0n
            r0.A0T()
            X.A5R r0 = r0.A01
            if (r0 == 0) goto L_0x09d3
            r0.A04()
            goto L_0x0052
        L_0x05b2:
            java.lang.String r0 = "sms"
            goto L_0x05b7
        L_0x05b5:
            java.lang.String r0 = "wa_old"
        L_0x05b7:
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x000f
            boolean r0 = r9.isFinishing()
            if (r0 != 0) goto L_0x000f
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "VerifyPhoneNumber/onRequestGenericCodeResponse/method="
            r1.append(r0)
            r1.append(r11)
            java.lang.String r3 = "/status="
            r1.append(r3)
            java.lang.String r0 = X.C181669Rj.A00(r2)
            X.C17890vO.A1A(r1, r0)
            java.lang.String r0 = ""
            X.A9B.A00 = r0
            r9.A1W(r10, r11)
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            if (r2 != r0) goto L_0x05ed
            X.C17960vV.A07(r10)
            r9.A1V(r10, r11)
            return
        L_0x05ed:
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            if (r2 != r0) goto L_0x0672
            X.C17960vV.A07(r10)
            java.lang.String r0 = "VerifyPhoneNumber/onGenericCodeSent"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            boolean r0 = X.AnonymousClass8BR.A1O(r9)
            if (r0 == 0) goto L_0x0606
            X.0z4 r1 = r9.A0A
            java.lang.String r0 = "email_sent"
            r1.A1Y(r0)
        L_0x0606:
            int r1 = X.AnonymousClass8BU.A02(r9)
            r0 = 13
            if (r1 == r0) goto L_0x0612
            r0 = 14
            if (r1 != r0) goto L_0x063c
        L_0x0612:
            r0 = 3
            r9.A4h(r0)
            boolean r0 = r9.A1Q
            if (r0 != 0) goto L_0x063c
            X.A0w r0 = r9.A0f
            r3 = 1
            X.6py r0 = r0.A01
            X.9o9 r2 = r0.A05
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "AccountDefenceLocalDataRepository/saveSecondSmsRequestedOnce/"
            X.C17900vP.A0n(r0, r1, r3)
            X.0vc r1 = r2.A00
            java.lang.String r0 = "AccountDefenceLocalDataRepository_prefs"
            android.content.SharedPreferences$Editor r1 = X.AnonymousClass8BU.A08(r1, r0)
            java.lang.String r0 = "com.whatsapp.registration.accountdefence.AccountDefenceLocalDataRepository.account_defence_sms_requested_once"
            r1.putBoolean(r0, r3)
            r1.apply()
            r9.A1Q = r3
        L_0x063c:
            int r2 = r10.A02
            if (r2 <= 0) goto L_0x064b
            A1m = r2
            android.content.SharedPreferences$Editor r1 = X.AnonymousClass8BR.A08(r9)
            java.lang.String r0 = "registration_sms_code_length"
            X.C17880vN.A1C(r1, r0, r2)
        L_0x064b:
            java.lang.String r0 = r10.A0I
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x065e
            java.lang.String r0 = r10.A0I
            long r1 = X.AnonymousClass8BW.A08(r0)
            X.1jT r0 = r9.A0j
            r0.A0C(r1)
        L_0x065e:
            com.whatsapp.registration.entercode.EnterCodeViewModel r0 = r9.A0n
            r0.A0T()
            X.A5R r0 = r0.A01
            if (r0 == 0) goto L_0x09d3
            r0.A04()
            X.0z4 r1 = r9.A0A
            int r0 = r9.A03
            r1.A1I(r0)
            return
        L_0x0672:
            r9.A1D()
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "VerifyPhoneNumber/onRequestGenericCodeError/method="
            X.C17890vO.A10(r0, r11, r3, r1)
            java.lang.String r0 = X.C181669Rj.A00(r2)
            X.C17890vO.A1A(r1, r0)
            boolean r4 = X.AnonymousClass8BR.A1X(r11)
            if (r4 == 0) goto L_0x069a
            java.lang.Integer r0 = X.AnonymousClass00R.A0E
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x069a
            X.0z4 r1 = r9.A0A
            java.lang.String r0 = "email_otp_request_failed"
            r1.A1Y(r0)
        L_0x069a:
            java.lang.Integer r0 = X.AnonymousClass00R.A0N
            if (r2 != r0) goto L_0x06a9
            r0 = 52
            X.AnonymousClass4Yv.A00(r9, r0)
            X.1KB r0 = r9.A05
            X.C181689Rl.A00(r0)
            return
        L_0x06a9:
            java.lang.Integer r0 = X.AnonymousClass00R.A19
            if (r2 != r0) goto L_0x06fe
            X.C17960vV.A07(r10)
            java.lang.String r0 = "VerifyPhoneNumber/onRequestGenericCodeErrorTempUnavailable"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.0z4 r1 = r9.A0A
            java.lang.String r0 = "server-send-request-temp-unavailable"
            X.A9B.A0U(r1, r0)
            java.lang.String r0 = r10.A0L
            boolean r0 = A20(r0)
            if (r0 != 0) goto L_0x06d0
            X.9uO r1 = r9.A0h
            r0 = 2131895030(0x7f1222f6, float:1.9424881E38)
        L_0x06c9:
            r1.A02(r0)
        L_0x06cc:
            r9.A1A()
            return
        L_0x06d0:
            java.lang.String r0 = r10.A0L     // Catch:{ NumberFormatException -> 0x06f2 }
            long r3 = X.AnonymousClass8BW.A08(r0)     // Catch:{ NumberFormatException -> 0x06f2 }
            X.1jT r0 = r9.A0j     // Catch:{ NumberFormatException -> 0x06f2 }
            r0.A0C(r3)     // Catch:{ NumberFormatException -> 0x06f2 }
            X.9uO r5 = r9.A0h     // Catch:{ NumberFormatException -> 0x06f2 }
            r2 = 2131895031(0x7f1222f7, float:1.9424884E38)
            java.lang.Object[] r1 = X.AnonymousClass3MW.A1a()     // Catch:{ NumberFormatException -> 0x06f2 }
            X.0vb r0 = r9.A00     // Catch:{ NumberFormatException -> 0x06f2 }
            java.lang.String r0 = X.C64052u8.A0A(r0, r3)     // Catch:{ NumberFormatException -> 0x06f2 }
            java.lang.String r0 = X.C108975cc.A0b(r9, r0, r1, r2)     // Catch:{ NumberFormatException -> 0x06f2 }
            r5.A03(r0)     // Catch:{ NumberFormatException -> 0x06f2 }
            goto L_0x06cc
        L_0x06f2:
            r1 = move-exception
            java.lang.String r0 = "VerifyPhoneNumber/request/sms/temporarily-unavailable/unable-to-parse-retryAfter"
            com.whatsapp.util.Log.w(r0, r1)
            X.9uO r1 = r9.A0h
            r0 = 2131895030(0x7f1222f6, float:1.9424881E38)
            goto L_0x06c9
        L_0x06fe:
            java.lang.Integer r0 = X.AnonymousClass00R.A0Y
            if (r2 != r0) goto L_0x0718
            java.lang.String r2 = "server-send-request-error-unspecified"
            java.lang.StringBuilder r1 = X.C166988f1.A0Q(r11)
            java.lang.String r0 = "/unspecified"
            X.C17890vO.A1B(r1, r0)
            X.0z4 r0 = r9.A0A
            X.A9B.A0U(r0, r2)
            r0 = 109(0x6d, float:1.53E-43)
        L_0x0714:
            r9.A1H(r0)
            goto L_0x06cc
        L_0x0718:
            java.lang.Integer r0 = X.AnonymousClass00R.A15
            if (r2 != r0) goto L_0x074e
            X.C17960vV.A07(r10)
            java.lang.String r6 = "sms"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "VerifyPhoneNumber/onRequestGenericCodeErrorTooMany/method="
            X.C17900vP.A0g(r0, r11, r1)
            java.lang.String r7 = "wa_old"
            boolean r3 = r11.equals(r7)
            if (r3 == 0) goto L_0x0747
            r5 = 40
        L_0x0734:
            X.0z4 r1 = r9.A0A
            java.lang.String r0 = "server-send-request-too-many-tries"
            boolean r0 = X.C166988f1.A0z(r1, r10, r9, r0)
            if (r0 != 0) goto L_0x09da
            X.9uO r0 = r9.A0h
            r0.A01(r5)
            r9.A1C()
            return
        L_0x0747:
            r5 = 39
            if (r4 == 0) goto L_0x0734
            r5 = 48
            goto L_0x0734
        L_0x074e:
            java.lang.Integer r0 = X.AnonymousClass00R.A0A
            if (r2 != r0) goto L_0x0768
            X.C17960vV.A07(r10)
            java.lang.String r0 = "VerifyPhoneNumber/onRequestGenericCodeErrorTooManyAllMethods"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.0z4 r1 = r9.A0A
            java.lang.String r0 = "server-send-request-too-many-tries-all-methods"
            boolean r0 = X.C166988f1.A0z(r1, r10, r9, r0)
            r3 = 27
            if (r0 == 0) goto L_0x08fc
            goto L_0x0883
        L_0x0768:
            java.lang.Integer r0 = X.AnonymousClass00R.A0j
            if (r2 != r0) goto L_0x078a
            X.0z4 r1 = r9.A0A
            java.lang.String r0 = "server-send-request-error-connectivity"
            X.A9B.A0U(r1, r0)
            r2 = 2131894981(0x7f1222c5, float:1.9424782E38)
            java.lang.Object[] r1 = X.AnonymousClass3MW.A1a()
            r0 = 2131888733(0x7f120a5d, float:1.941211E38)
            java.lang.String r0 = r9.getString(r0)
            java.lang.String r0 = X.C108975cc.A0b(r9, r0, r1, r2)
        L_0x0785:
            r9.A1w(r0)
            goto L_0x06cc
        L_0x078a:
            java.lang.Integer r0 = X.AnonymousClass00R.A05
            if (r2 != r0) goto L_0x0797
            X.C17960vV.A07(r10)
            java.lang.String r0 = "server-send-request-bad-param"
            r9.A1X(r10, r11, r0)
            return
        L_0x0797:
            java.lang.Integer r0 = X.AnonymousClass00R.A06
            if (r2 != r0) goto L_0x07af
            java.lang.String r2 = "server-send-request-missing-param"
            java.lang.StringBuilder r1 = X.C166988f1.A0Q(r11)
            java.lang.String r0 = "/missing-parameter"
            X.C17890vO.A19(r1, r0)
            X.0z4 r0 = r9.A0A
            X.A9B.A0U(r0, r2)
            r0 = 25
            goto L_0x0714
        L_0x07af:
            java.lang.Integer r0 = X.AnonymousClass00R.A18
            if (r2 != r0) goto L_0x07c3
            X.C17960vV.A07(r10)
            X.9tK r1 = r10.A08
            java.lang.String r0 = "VerifyPhoneNumber/onRequestGenericCodeErrorTooOld"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            if (r1 == 0) goto L_0x0a4a
            r9.A1c(r1)
            return
        L_0x07c3:
            java.lang.Integer r0 = X.AnonymousClass00R.A0u
            if (r2 != r0) goto L_0x07f3
            X.C17960vV.A07(r10)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "VerifyPhoneNumber/onRequestGenericCodeErrorTooRecent/retryAfter="
            r1.append(r0)
            java.lang.String r0 = r10.A0L
            r1.append(r0)
            java.lang.String r0 = " seconds"
            X.C17890vO.A1B(r1, r0)
            X.0z4 r1 = r9.A0A
            java.lang.String r0 = "server-send-request-too-recent"
            X.A9B.A0U(r1, r0)
            java.lang.String r0 = r10.A0L
            boolean r0 = A20(r0)
            if (r0 != 0) goto L_0x08a0
            X.9uO r1 = r9.A0h
            r0 = 2131895034(0x7f1222fa, float:1.942489E38)
            goto L_0x06c9
        L_0x07f3:
            java.lang.Integer r0 = X.AnonymousClass00R.A0M
            if (r2 != r0) goto L_0x07fb
            r9.A1B()
            return
        L_0x07fb:
            java.lang.Integer r0 = X.AnonymousClass00R.A04
            if (r2 != r0) goto L_0x081f
            X.ADM r4 = r10.A06
            X.2mr r3 = r10.A07
            java.lang.String r2 = "server-send-request-user-blocked"
            java.lang.StringBuilder r1 = X.C166988f1.A0Q(r11)
            java.lang.String r0 = "/blocked"
            X.C17890vO.A19(r1, r0)
            X.A10 r1 = r9.A0u
            r0 = 12
            r1.A02(r0)
            X.0z4 r0 = r9.A0A
            X.A9B.A0U(r0, r2)
            r9.A1O(r4, r3)
            goto L_0x06cc
        L_0x081f:
            java.lang.Integer r0 = X.AnonymousClass00R.A02
            if (r2 != r0) goto L_0x082c
            X.C17960vV.A07(r10)
            java.lang.String r0 = "server-send-request-next-method"
            r9.A1y(r11, r0)
            return
        L_0x082c:
            java.lang.Integer r0 = X.AnonymousClass00R.A03
            if (r2 != r0) goto L_0x084e
            X.C17960vV.A07(r10)
            java.lang.String r0 = "VerifyPhoneNumber/onRequestGenericCodeErrorTooManyGuesses"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.0z4 r1 = r9.A0A
            java.lang.String r0 = "server-send-request-too-many-guesses"
            X.A9B.A0U(r1, r0)
            X.C166988f1.A0w(r9)
            java.lang.String r0 = r10.A0L
            boolean r0 = A20(r0)
            r3 = 28
            if (r0 == 0) goto L_0x08fc
            goto L_0x08d0
        L_0x084e:
            java.lang.Integer r0 = X.AnonymousClass00R.A07
            if (r2 != r0) goto L_0x0948
            X.C17960vV.A07(r10)
            java.lang.String r7 = "sms"
            boolean r3 = X.AnonymousClass8BR.A1W(r11)
            java.lang.String r0 = "VerifyPhoneNumber/onRequestGenericCodeErrorProviderTimeout"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.0z4 r1 = r9.A0A
            java.lang.String r0 = "server-send-request-provider-timeout"
            X.A9B.A0U(r1, r0)
            if (r3 == 0) goto L_0x087a
            r6 = 2131895075(0x7f122323, float:1.9424973E38)
        L_0x086c:
            java.lang.String r0 = r10.A0L
            boolean r0 = A20(r0)
            if (r0 != 0) goto L_0x0903
            java.lang.String r0 = r9.getString(r6)
            goto L_0x0785
        L_0x087a:
            r6 = 2131895024(0x7f1222f0, float:1.942487E38)
            if (r4 == 0) goto L_0x086c
            r6 = 2131895264(0x7f1223e0, float:1.9425356E38)
            goto L_0x086c
        L_0x0883:
            java.lang.String r0 = r10.A0L     // Catch:{ NumberFormatException -> 0x089c }
            long r1 = X.AnonymousClass8BW.A08(r0)     // Catch:{ NumberFormatException -> 0x089c }
            r9.A0B = r1     // Catch:{ NumberFormatException -> 0x089c }
            X.1jT r0 = r9.A0j     // Catch:{ NumberFormatException -> 0x089c }
            r0.A0C(r1)     // Catch:{ NumberFormatException -> 0x089c }
            r0 = 1
            r9.A1W = r0     // Catch:{ NumberFormatException -> 0x089c }
            X.9uO r1 = r9.A0h     // Catch:{ NumberFormatException -> 0x089c }
            r0 = 31
            r1.A01(r0)     // Catch:{ NumberFormatException -> 0x089c }
            goto L_0x06cc
        L_0x089c:
            r1 = move-exception
            java.lang.String r0 = "VerifyPhoneNumber/request/sms/triedtoomanytimesallmethods/time-not-int"
            goto L_0x08f9
        L_0x08a0:
            java.lang.String r0 = r10.A0L     // Catch:{ NumberFormatException -> 0x08c3 }
            long r3 = X.AnonymousClass8BW.A08(r0)     // Catch:{ NumberFormatException -> 0x08c3 }
            X.1jT r0 = r9.A0j     // Catch:{ NumberFormatException -> 0x08c3 }
            r0.A0C(r3)     // Catch:{ NumberFormatException -> 0x08c3 }
            X.9uO r5 = r9.A0h     // Catch:{ NumberFormatException -> 0x08c3 }
            r2 = 2131895033(0x7f1222f9, float:1.9424888E38)
            java.lang.Object[] r1 = X.AnonymousClass3MW.A1a()     // Catch:{ NumberFormatException -> 0x08c3 }
            X.0vb r0 = r9.A00     // Catch:{ NumberFormatException -> 0x08c3 }
            java.lang.String r0 = X.C64052u8.A0A(r0, r3)     // Catch:{ NumberFormatException -> 0x08c3 }
            java.lang.String r0 = X.C108975cc.A0b(r9, r0, r1, r2)     // Catch:{ NumberFormatException -> 0x08c3 }
            r5.A03(r0)     // Catch:{ NumberFormatException -> 0x08c3 }
            goto L_0x06cc
        L_0x08c3:
            r1 = move-exception
            java.lang.String r0 = "VerifyPhoneNumber/request/sms/too-recent/time-not-int"
            com.whatsapp.util.Log.w(r0, r1)
            X.9uO r1 = r9.A0h
            r0 = 2131895034(0x7f1222fa, float:1.942489E38)
            goto L_0x06c9
        L_0x08d0:
            java.lang.String r0 = r10.A0L     // Catch:{ NumberFormatException -> 0x08f6 }
            long r1 = X.AnonymousClass8BW.A08(r0)     // Catch:{ NumberFormatException -> 0x08f6 }
            r9.A0B = r1     // Catch:{ NumberFormatException -> 0x08f6 }
            X.1jT r0 = r9.A0j     // Catch:{ NumberFormatException -> 0x08f6 }
            r0.A0C(r1)     // Catch:{ NumberFormatException -> 0x08f6 }
            r0 = 1
            r9.A1W = r0     // Catch:{ NumberFormatException -> 0x08f6 }
            X.9uO r1 = r9.A0h     // Catch:{ NumberFormatException -> 0x08f6 }
            boolean r0 = X.AnonymousClass8BR.A1W(r11)     // Catch:{ NumberFormatException -> 0x08f6 }
            if (r0 == 0) goto L_0x08eb
            r0 = 33
            goto L_0x08f1
        L_0x08eb:
            r0 = 32
            if (r4 == 0) goto L_0x08f1
            r0 = 50
        L_0x08f1:
            r1.A01(r0)     // Catch:{ NumberFormatException -> 0x08f6 }
            goto L_0x06cc
        L_0x08f6:
            r1 = move-exception
            java.lang.String r0 = "VerifyPhoneNumber/request/sms/too-many-guesses/time-not-int"
        L_0x08f9:
            com.whatsapp.util.Log.w(r0, r1)
        L_0x08fc:
            X.9uO r0 = r9.A0h
            r0.A01(r3)
            goto L_0x06cc
        L_0x0903:
            java.lang.String r0 = r10.A0L     // Catch:{ NumberFormatException -> 0x0939 }
            long r1 = X.AnonymousClass8BW.A08(r0)     // Catch:{ NumberFormatException -> 0x0939 }
            X.1jT r0 = r9.A0j     // Catch:{ NumberFormatException -> 0x0939 }
            r0.A0C(r1)     // Catch:{ NumberFormatException -> 0x0939 }
            if (r3 == 0) goto L_0x0914
            r5 = 2131895074(0x7f122322, float:1.942497E38)
            goto L_0x091c
        L_0x0914:
            r5 = 2131895023(0x7f1222ef, float:1.9424867E38)
            if (r4 == 0) goto L_0x091c
            r5 = 2131895265(0x7f1223e1, float:1.9425358E38)
        L_0x091c:
            r0 = 1
            java.lang.Object[] r4 = new java.lang.Object[r0]     // Catch:{ NumberFormatException -> 0x0939 }
            X.0vb r0 = r9.A00     // Catch:{ NumberFormatException -> 0x0939 }
            java.lang.String r3 = X.C64052u8.A0A(r0, r1)     // Catch:{ NumberFormatException -> 0x0939 }
            r0 = 0
            r4[r0] = r3     // Catch:{ NumberFormatException -> 0x0939 }
            java.lang.String r0 = r9.getString(r5, r4)     // Catch:{ NumberFormatException -> 0x0939 }
            r9.A1w(r0)     // Catch:{ NumberFormatException -> 0x0939 }
            X.A5R r0 = r9.A0v     // Catch:{ NumberFormatException -> 0x0939 }
            X.C166988f1.A0x(r0, r7, r1)     // Catch:{ NumberFormatException -> 0x0939 }
            r9.A1J(r1, r7)     // Catch:{ NumberFormatException -> 0x0939 }
            goto L_0x06cc
        L_0x0939:
            r1 = move-exception
            java.lang.String r0 = "VerifyPhoneNumber/request/sms/too-recent/time-not-int"
            com.whatsapp.util.Log.w(r0, r1)
            java.lang.String r0 = r9.getString(r6)
            r9.A1w(r0)
            goto L_0x06cc
        L_0x0948:
            java.lang.Integer r0 = X.AnonymousClass00R.A08
            if (r2 != r0) goto L_0x0967
            boolean r0 = X.AnonymousClass8BR.A1O(r9)
            X.C17960vV.A07(r10)
            r13 = 2131895026(0x7f1222f2, float:1.9424873E38)
            r14 = 2131895025(0x7f1222f1, float:1.9424871E38)
            if (r0 == 0) goto L_0x0961
            r13 = 2131895266(0x7f1223e2, float:1.942536E38)
            r14 = 2131895267(0x7f1223e3, float:1.9425362E38)
        L_0x0961:
            java.lang.String r12 = "server-send-request-provider-unroutable"
            r9.A1Y(r10, r11, r12, r13, r14)
            return
        L_0x0967:
            java.lang.Integer r0 = X.AnonymousClass00R.A0B
            if (r2 != r0) goto L_0x0988
            boolean r0 = X.AnonymousClass8BR.A1O(r9)
            X.C17960vV.A07(r10)
            r14 = 2131895026(0x7f1222f2, float:1.9424873E38)
            r15 = 2131895025(0x7f1222f1, float:1.9424871E38)
            if (r0 == 0) goto L_0x0980
            r14 = 2131895266(0x7f1223e2, float:1.942536E38)
            r15 = 2131895267(0x7f1223e3, float:1.9425362E38)
        L_0x0980:
            java.lang.String r13 = "noRouteSms"
            java.lang.String r12 = "server-send-request-no-routes"
            r9.A1Z(r10, r11, r12, r13, r14, r15)
            return
        L_0x0988:
            java.lang.Integer r4 = X.AnonymousClass00R.A09
            if (r2 == r4) goto L_0x0a99
            java.lang.Integer r0 = X.AnonymousClass00R.A0D
            if (r2 == r0) goto L_0x0a99
            java.lang.Integer r0 = X.AnonymousClass00R.A0E
            if (r2 != r0) goto L_0x099b
            X.C17960vV.A07(r10)
            r9.A1U(r10, r11)
            return
        L_0x099b:
            java.lang.Integer r4 = X.AnonymousClass00R.A0H
            if (r2 == r4) goto L_0x0a7d
            java.lang.Integer r0 = X.AnonymousClass00R.A0I
            if (r2 == r0) goto L_0x0a7d
            java.lang.Integer r0 = X.AnonymousClass00R.A0J
            if (r2 != r0) goto L_0x09ab
            r9.A1v(r11)
            return
        L_0x09ab:
            java.lang.Integer r0 = X.AnonymousClass00R.A0K
            if (r2 == r0) goto L_0x0a5c
            java.lang.Integer r0 = X.AnonymousClass00R.A0L
            if (r2 == r0) goto L_0x0a5c
            java.lang.Integer r0 = X.AnonymousClass00R.A0O
            if (r2 != r0) goto L_0x000f
            java.lang.String r0 = "VerifyPhoneNumber/launchEmailChallengeFlow"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1CM r1 = r9.A07
            r0 = 39
            r1.A01(r0)
            java.lang.String r1 = X.C17890vO.A0Q()
            r0 = 6
            android.content.Intent r0 = X.AnonymousClass1LU.A1P(r9, r1, r0)
            r9.startActivity(r0)
            r9.finish()
            return
        L_0x09d3:
            java.lang.String r0 = "verifyPhoneNumberPrefs"
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x09da:
            java.lang.String r0 = r10.A0L     // Catch:{ NumberFormatException -> 0x0a3b }
            long r0 = X.AnonymousClass8BW.A08(r0)     // Catch:{ NumberFormatException -> 0x0a3b }
            r9.A0B = r0     // Catch:{ NumberFormatException -> 0x0a3b }
            X.1jT r2 = r9.A0j     // Catch:{ NumberFormatException -> 0x0a3b }
            r2.A0C(r0)     // Catch:{ NumberFormatException -> 0x0a3b }
            r8 = 0
            r0 = 1
            if (r3 == 0) goto L_0x0a13
            X.9uO r6 = r9.A0h     // Catch:{ NumberFormatException -> 0x0a3b }
            r4 = 2131895073(0x7f122321, float:1.9424969E38)
            java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch:{ NumberFormatException -> 0x0a3b }
            X.0vb r2 = r9.A00     // Catch:{ NumberFormatException -> 0x0a3b }
            long r0 = r9.A0B     // Catch:{ NumberFormatException -> 0x0a3b }
            java.lang.String r0 = X.C64052u8.A0A(r2, r0)     // Catch:{ NumberFormatException -> 0x0a3b }
            java.lang.String r0 = X.C17880vN.A0q(r9, r0, r3, r8, r4)     // Catch:{ NumberFormatException -> 0x0a3b }
            r6.A03(r0)     // Catch:{ NumberFormatException -> 0x0a3b }
            X.A5R r4 = r9.A0v     // Catch:{ NumberFormatException -> 0x0a3b }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ NumberFormatException -> 0x0a3b }
            long r0 = r9.A0B     // Catch:{ NumberFormatException -> 0x0a3b }
            long r2 = r2 + r0
            r4.A07(r7, r2)     // Catch:{ NumberFormatException -> 0x0a3b }
            long r0 = r9.A0B     // Catch:{ NumberFormatException -> 0x0a3b }
            r9.A1J(r0, r7)     // Catch:{ NumberFormatException -> 0x0a3b }
            return
        L_0x0a13:
            X.9uO r7 = r9.A0h     // Catch:{ NumberFormatException -> 0x0a3b }
            r4 = 2131896243(0x7f1227b3, float:1.9427342E38)
            java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch:{ NumberFormatException -> 0x0a3b }
            X.0vb r2 = r9.A00     // Catch:{ NumberFormatException -> 0x0a3b }
            long r0 = r9.A0B     // Catch:{ NumberFormatException -> 0x0a3b }
            java.lang.String r0 = X.C64052u8.A0A(r2, r0)     // Catch:{ NumberFormatException -> 0x0a3b }
            java.lang.String r0 = X.C17880vN.A0q(r9, r0, r3, r8, r4)     // Catch:{ NumberFormatException -> 0x0a3b }
            r7.A03(r0)     // Catch:{ NumberFormatException -> 0x0a3b }
            X.A5R r4 = r9.A0v     // Catch:{ NumberFormatException -> 0x0a3b }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ NumberFormatException -> 0x0a3b }
            long r0 = r9.A0B     // Catch:{ NumberFormatException -> 0x0a3b }
            long r2 = r2 + r0
            r4.A07(r6, r2)     // Catch:{ NumberFormatException -> 0x0a3b }
            long r0 = r9.A0B     // Catch:{ NumberFormatException -> 0x0a3b }
            r9.A1J(r0, r6)     // Catch:{ NumberFormatException -> 0x0a3b }
            return
        L_0x0a3b:
            r1 = move-exception
            java.lang.String r0 = "VerifyPhoneNumber/request/sms/triedtoomanytimesallmethods/time-not-int"
            com.whatsapp.util.Log.w(r0, r1)
            X.9uO r0 = r9.A0h
            r0.A01(r5)
            r9.A1C()
            return
        L_0x0a4a:
            X.194 r1 = r9.A0P
            r0 = 1
            r1.A01 = r0
            X.A10 r1 = r9.A0u
            r0 = 8
            r1.A02(r0)
            r0 = 22
            r9.A1G(r0)
            return
        L_0x0a5c:
            java.lang.String r0 = r10.A0M
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0a77
            java.lang.String r3 = r10.A0M
            java.lang.String r0 = "VerifyPhoneNumber/transitionToSendSmsToWa"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            boolean r2 = r9.A1N
            r1 = 1
            r0 = 0
            android.content.Intent r0 = X.AnonymousClass1LU.A1Z(r9, r3, r0, r1, r2)
            r9.A3q(r0, r1)
            return
        L_0x0a77:
            java.lang.String r0 = "VerifyPhoneNumber/send sms number is empty"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x0a7d:
            X.C17960vV.A07(r10)
            java.lang.String r3 = r10.A0O
            r0 = 0
            long r11 = X.A9B.A02(r3, r0)
            java.lang.String r3 = r10.A0Q
            long r15 = X.A9B.A02(r3, r0)
            boolean r14 = X.AnonymousClass000.A1Z(r2, r4)
            java.lang.String r13 = "sms"
            r10 = r9
            r10.A1L(r11, r13, r14, r15)
            return
        L_0x0a99:
            java.lang.String r3 = "server-send-request-bad-token"
            java.lang.StringBuilder r1 = X.C166988f1.A0Q(r11)
            if (r2 != r4) goto L_0x0ab1
            java.lang.String r0 = "/bad-token"
        L_0x0aa3:
            X.C17890vO.A19(r1, r0)
            X.0z4 r0 = r9.A0A
            X.A9B.A0U(r0, r3)
            r0 = 41
            r9.A1H(r0)
            return
        L_0x0ab1:
            java.lang.String r0 = "/invalid-skey"
            goto L_0x0aa3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.verifyphone.VerifyPhoneNumber.A4j(X.ADN, java.lang.String):void");
    }

    public void A4o(boolean z) {
        Log.i("VerifyPhoneNumber/requestSmsCode");
        if (AnonymousClass8BR.A1O(this)) {
            this.A0A.A1Y("email_otp_choose_sms_instead");
        }
        TelephonyManager A0K2 = this.A08.A0K();
        if (A0K2 != null) {
            A0K2.getNetworkOperator();
            A0K2.getNetworkOperatorName();
            A0K2.getSimOperator();
            A0K2.getSimOperatorName();
        }
        this.A0A.A1c((String) null);
        if (AnonymousClass8BR.A1N(this) || AnonymousClass8BR.A1O(this)) {
            Log.i("VerifyPhoneNumber/requestSmsCode/maybeUseSmsRetriever");
            A1o(this, C17900vP.A01(C108945cZ.A1E("sms", this.A0s.A04)), C17900vP.A01(C108945cZ.A1E("voice", this.A0s.A04)));
            return;
        }
        AnonymousClass99F A0B2 = A9B.A0B(this.A0A, this.A00);
        if (this.A0A.A2O()) {
            A0B2.A02 = AnonymousClass000.A0i();
        }
        String str = this.A1H;
        C17960vV.A07(str);
        String str2 = this.A1J;
        C17960vV.A07(str2);
        A1a(A0B2, str, str2, "sms", C166988f1.A03(this), z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006d, code lost:
        if (r3.A07.A06() != false) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006f, code lost:
        r0 = 2131895749;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0072, code lost:
        A1n(r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0075, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0076, code lost:
        r0 = 2131895072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a6, code lost:
        X.AnonymousClass4Yv.A01(r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a9, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A4q(boolean r4, java.lang.String r5) {
        /*
            r3 = this;
            X.00H r0 = r3.A17
            java.lang.Object r0 = r0.get()
            X.ARp r0 = (X.C20605ARp) r0
            r0.A00()
            int r0 = r5.hashCode()
            r1 = 0
            switch(r0) {
                case -795576526: goto L_0x0092;
                case 114009: goto L_0x007a;
                case 97513456: goto L_0x0029;
                case 112386354: goto L_0x005d;
                case 2120743944: goto L_0x0014;
                default: goto L_0x0013;
            }
        L_0x0013:
            return
        L_0x0014:
            boolean r0 = X.AnonymousClass8BR.A1X(r5)
            if (r0 == 0) goto L_0x0013
            X.A10 r0 = r3.A0u
            r0.A02(r1)
            X.1jT r0 = r3.A0j
            r0.A05()
            if (r4 == 0) goto L_0x0013
            r0 = 51
            goto L_0x00a6
        L_0x0029:
            boolean r0 = X.AnonymousClass8BR.A1V(r5)
            if (r0 == 0) goto L_0x0013
            X.A10 r1 = r3.A0u
            r0 = 16
            r1.A02(r0)
            if (r4 == 0) goto L_0x0013
            X.1CM r0 = r3.A07
            boolean r0 = r0.A06()
            if (r0 != 0) goto L_0x006f
            com.whatsapp.registration.flashcall.FlashCallViewModel r0 = r3.A0o
            X.19D r2 = r0.A04
            r1 = 8940(0x22ec, float:1.2528E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0076
            r1 = 2131895072(0x7f122320, float:1.9424967E38)
            boolean r0 = X.AnonymousClass4Yv.A02(r3)
            if (r0 == 0) goto L_0x00aa
            java.lang.String r0 = "VerifyPhoneNumber/showDeterminateProgressDialog/isEnded"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x005d:
            java.lang.String r0 = "voice"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0013
            if (r4 == 0) goto L_0x0013
            X.1CM r0 = r3.A07
            boolean r0 = r0.A06()
            if (r0 == 0) goto L_0x0076
        L_0x006f:
            r0 = 2131895749(0x7f1225c5, float:1.942634E38)
        L_0x0072:
            A1n(r3, r0)
            return
        L_0x0076:
            r0 = 2131895072(0x7f122320, float:1.9424967E38)
            goto L_0x0072
        L_0x007a:
            boolean r0 = X.AnonymousClass8BR.A1U(r5)
            if (r0 == 0) goto L_0x0013
            X.A10 r0 = r3.A0u
            r0.A02(r1)
            A1g(r3)
            X.1jT r0 = r3.A0j
            r0.A05()
            if (r4 == 0) goto L_0x0013
            r0 = 52
            goto L_0x00a6
        L_0x0092:
            boolean r0 = X.AnonymousClass8BR.A1W(r5)
            if (r0 == 0) goto L_0x0013
            X.A10 r0 = r3.A0u
            r0.A02(r1)
            X.1jT r0 = r3.A0j
            r0.A05()
            if (r4 == 0) goto L_0x0013
            r0 = 46
        L_0x00a6:
            X.AnonymousClass4Yv.A01(r3, r0)
            return
        L_0x00aa:
            java.lang.String r2 = r3.getString(r1)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "VerifyPhoneNumber/showDeterminateProgressDialog/"
            X.C17900vP.A0f(r0, r2, r1)
            android.app.ProgressDialog r1 = new android.app.ProgressDialog
            r1.<init>(r3)
            r1.setMessage(r2)
            r0 = 0
            r1.setCancelable(r0)
            r1.setIndeterminate(r0)
            r0 = 1
            r1.setProgressStyle(r0)
            r0 = 0
            r1.setProgressNumberFormat(r0)
            r1.setProgressPercentFormat(r0)
            r1.show()
            r3.A0C = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.verifyphone.VerifyPhoneNumber.A4q(boolean, java.lang.String):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x0427  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x04e5  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0576  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x05fc  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0651  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x065b  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x06b6  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x0715  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x0746  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x0759  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0769  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x077a  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0307  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x031c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r26) {
        /*
            r25 = this;
            r8 = r25
            r10 = r26
            super.onCreate(r10)
            X.10I r2 = r8.A05
            r1 = 16
            X.7Qn r0 = new X.7Qn
            r0.<init>(r8, r1)
            r2.CGF(r0)
            X.2iw r0 = r8.A0p
            r0.A00(r8)
            int r9 = X.AnonymousClass8BU.A02(r8)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "VerifyPhoneNumber/onCreate/registrationState="
            X.C17900vP.A0j(r0, r1, r9)
            r3 = 1
            r2 = 0
            boolean r0 = X.AnonymousClass000.A1W(r10)
            r8.A1O = r0
            android.os.Bundle r0 = X.AnonymousClass3MY.A09(r8)
            if (r0 == 0) goto L_0x00f3
            android.content.Intent r1 = r8.getIntent()
            java.lang.String r0 = "code_verification_mode"
            int r4 = r1.getIntExtra(r0, r2)
            r8.A02 = r4
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "VerifyPhoneNumber/onCreate/codeVerificationMode is "
            X.C17900vP.A0j(r0, r1, r4)
            android.content.Intent r1 = r8.getIntent()
            java.lang.String r0 = "EXTRA_IS_APP_RESTARTED"
            boolean r0 = r1.getBooleanExtra(r0, r2)
            r8.A1R = r0
            android.content.Intent r1 = r8.getIntent()
            java.lang.String r0 = "changenumber"
            boolean r0 = r1.getBooleanExtra(r0, r2)
            r8.A1N = r0
            java.lang.String r0 = "VerifyPhoneNumber/onCreate/changenumber"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            android.content.Intent r1 = r8.getIntent()
            java.lang.String r0 = "passkey_challenge_response"
            java.lang.String r0 = r1.getStringExtra(r0)
            r8.A1I = r0
            android.content.Intent r1 = r8.getIntent()
            java.lang.String r0 = "EXTRA_SHOULD_REQUEST_VOICE_CALL"
            boolean r0 = r1.getBooleanExtra(r0, r2)
            r8.A1X = r0
            android.content.Intent r1 = r8.getIntent()
            java.lang.String r0 = "server_start_message"
            java.lang.String r0 = r1.getStringExtra(r0)
            r8.A1L = r0
            android.content.Intent r4 = r8.getIntent()
            java.lang.String r1 = "flash_type"
            r0 = -1
            int r0 = r4.getIntExtra(r1, r0)
            r8.A03 = r0
            android.content.Intent r1 = r8.getIntent()
            java.lang.String r0 = "wa_old_eligible"
            int r4 = r1.getIntExtra(r0, r2)
            r8.A09 = r4
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "VerifyPhoneNumber/onCreate/waOldEligible : "
            X.C17900vP.A0j(r0, r1, r4)
            android.content.Intent r1 = r8.getIntent()
            java.lang.String r0 = "wa_old_device_name"
            java.lang.String r0 = r1.getStringExtra(r0)
            r8.A1M = r0
            android.content.Intent r1 = r8.getIntent()
            java.lang.String r0 = "silent_auth_eligible"
            int r0 = r1.getIntExtra(r0, r2)
            r8.A08 = r0
            android.content.Intent r1 = r8.getIntent()
            java.lang.String r0 = "show_request_code_progress_dialog"
            boolean r0 = r1.getBooleanExtra(r0, r2)
            r8.A1Y = r0
            android.content.Intent r1 = r8.getIntent()
            java.lang.String r0 = "has_retried_flash_call"
            boolean r0 = r1.getBooleanExtra(r0, r2)
            r8.A1P = r0
            android.content.Intent r1 = r8.getIntent()
            java.lang.String r0 = "should_show_dbs_on_back_pressed"
            boolean r0 = r1.getBooleanExtra(r0, r2)
            r8.A1U = r0
            android.content.Intent r1 = r8.getIntent()
            java.lang.String r0 = "is_direct_code_entry"
            boolean r0 = r1.getBooleanExtra(r0, r2)
            r8.A1S = r0
        L_0x00f3:
            X.0z4 r0 = r8.A0A
            java.lang.String r0 = r0.A0k()
            r8.A1g = r0
            X.0z4 r1 = r8.A0A
            X.9uO r0 = new X.9uO
            r0.<init>(r8, r1)
            r8.A0h = r0
            boolean r0 = X.AnonymousClass8BR.A1N(r8)
            if (r0 == 0) goto L_0x0111
            X.0z4 r1 = r8.A0A
            java.lang.String r0 = "wa_old_entered"
            r1.A1j(r0)
        L_0x0111:
            X.00H r0 = r8.A12
            X.1cN r1 = X.C17880vN.A0I(r0)
            boolean r0 = r8.A1N
            boolean r0 = r1.A0J(r0)
            r8.A1i = r0
            android.content.Intent r5 = r8.getIntent()
            java.lang.String r1 = "whatsapp"
            java.lang.String r0 = r5.getScheme()
            boolean r0 = r1.equals(r0)
            r4 = 0
            if (r0 != 0) goto L_0x07a7
            java.lang.String r1 = "http"
            java.lang.String r0 = r5.getScheme()
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x07a7
            java.lang.String r1 = "https"
            java.lang.String r0 = r5.getScheme()
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x07a7
            r8.A1f = r4
        L_0x014a:
            int r0 = r8.A4e()
            if (r9 == r0) goto L_0x019f
            boolean r0 = X.AnonymousClass8BR.A1O(r8)
            if (r0 != 0) goto L_0x019f
            X.1CM r0 = r8.A07
            boolean r0 = r0.A06()
            if (r0 != 0) goto L_0x019f
            boolean r0 = X.AnonymousClass8BR.A1M(r8)
            if (r0 != 0) goto L_0x019f
            X.1CM r0 = r8.A07
            boolean r0 = r0.A02()
            if (r0 != 0) goto L_0x019f
            X.1CM r0 = r8.A07
            boolean r0 = r0.A03()
            if (r0 != 0) goto L_0x019f
            boolean r0 = X.AnonymousClass8BR.A1N(r8)
            if (r0 != 0) goto L_0x019f
            X.1CM r0 = r8.A07
            int r1 = r0.A00(r2)
            r0 = 5
            if (r1 == r0) goto L_0x019f
            X.1CM r0 = r8.A07
            boolean r0 = r0.A05()
            if (r0 != 0) goto L_0x019f
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "VerifyPhoneNumber/onCreate/wrong-state bounce to main "
            X.C17900vP.A0i(r0, r1, r9)
            android.content.Intent r2 = X.AnonymousClass1LU.A0A(r8)
        L_0x0198:
            r8.startActivity(r2)
            r8.finish()
        L_0x019e:
            return
        L_0x019f:
            X.0z4 r0 = r8.A0A
            java.lang.String r0 = r0.A0l()
            r8.A1H = r0
            X.0z4 r0 = r8.A0A
            java.lang.String r0 = r0.A0n()
            r8.A1J = r0
            X.99E r0 = X.C199199zb.A00(r8)
            r8.A0m = r0
            X.4PW r0 = r8.A0N
            X.4VX r0 = r0.A00(r4)
            r8.A0g = r0
            java.lang.String r4 = r8.A1H
            java.lang.String r1 = r8.A1J
            android.os.Looper r12 = android.os.Looper.getMainLooper()
            X.0zA r13 = r8.A0J
            X.99E r0 = r8.A0m
            X.8Ck r11 = new X.8Ck
            r14 = r0
            r15 = r8
            r16 = r4
            r17 = r1
            r11.<init>(r12, r13, r14, r15, r16, r17)
            r8.A0t = r11
            X.9VE r0 = r8.A0O
            X.A5R r4 = r8.A0v
            X.1K2 r0 = r0.A00
            X.1K1 r0 = r0.A00
            X.A0w r1 = X.AnonymousClass1K1.A1c(r0)
            X.A10 r0 = new X.A10
            r0.<init>(r1, r11, r4)
            r8.A0u = r0
            android.os.Bundle r0 = X.AnonymousClass3MY.A09(r8)
            java.lang.String r11 = "voice"
            java.lang.String r12 = "sms"
            if (r0 == 0) goto L_0x035b
            android.content.Intent r1 = r8.getIntent()
            java.lang.String r0 = "should_request_flash_call"
            boolean r24 = r1.getBooleanExtra(r0, r2)
            boolean r0 = X.AnonymousClass8BR.A1N(r8)
            if (r0 != 0) goto L_0x0219
            boolean r0 = X.AnonymousClass8BR.A1O(r8)
            if (r0 != 0) goto L_0x0219
            X.1CM r0 = r8.A07
            boolean r0 = r0.A03()
            if (r0 != 0) goto L_0x0219
            X.1CM r0 = r8.A07
            boolean r0 = r0.A05()
            if (r0 == 0) goto L_0x0220
        L_0x0219:
            X.0z4 r1 = r8.A0A
            int r0 = r8.A03
            r1.A1I(r0)
        L_0x0220:
            java.lang.String r0 = "VerifyPhoneNumber/onCreate/ssend"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            if (r26 != 0) goto L_0x0351
            android.content.Intent r1 = r8.getIntent()
            java.lang.String r0 = "use_sms_retriever"
            boolean r0 = r1.getBooleanExtra(r0, r2)
            if (r0 == 0) goto L_0x0235
            r8.A1Z = r3
        L_0x0235:
            android.content.Intent r3 = r8.getIntent()
            X.A5R r0 = r8.A0v
            r6 = 0
            long r0 = r0.A02(r12, r6)
            java.lang.String r23 = "sms_retry_time"
            r2 = r23
            long r4 = r3.getLongExtra(r2, r0)
            X.A5R r1 = r8.A0v
            java.lang.String r22 = "flash"
            r0 = r22
            long r20 = r1.A02(r0, r6)
            android.content.Intent r3 = r8.getIntent()
            X.A5R r0 = r8.A0v
            long r0 = r0.A02(r11, r6)
            java.lang.String r19 = "voice_retry_time"
            r2 = r19
            long r2 = r3.getLongExtra(r2, r0)
            android.content.Intent r14 = r8.getIntent()
            X.A5R r1 = r8.A0v
            java.lang.String r18 = "wa_old"
            r0 = r18
            long r0 = r1.A02(r0, r6)
            java.lang.String r13 = "wa_old_retry_time"
            long r16 = r14.getLongExtra(r13, r0)
            android.content.Intent r15 = r8.getIntent()
            X.A5R r0 = r8.A0v
            java.lang.String r13 = "email_otp"
            long r0 = r0.A02(r13, r6)
            java.lang.String r14 = "email_otp_retry_time"
            long r0 = r15.getLongExtra(r14, r0)
            X.A5R r14 = r8.A0v
            r15 = r14
            java.lang.String r14 = "send_sms"
            r15.A02(r14, r6)
            r6 = 13
            if (r9 == r6) goto L_0x032d
            r6 = 14
            if (r9 == r6) goto L_0x032d
            X.A5R r6 = r8.A0v
            r6.A07(r12, r4)
            X.A5R r7 = r8.A0v
            r6 = r22
            r4 = r20
            r7.A07(r6, r4)
            X.A5R r4 = r8.A0v
            r4.A07(r11, r2)
            X.A5R r5 = r8.A0v
            r4 = r18
            r2 = r16
            r5.A07(r4, r2)
            X.A5R r2 = r8.A0v
            r2.A07(r13, r0)
        L_0x02bc:
            android.content.SharedPreferences r0 = X.C72453Mb.A0M(r8)
            java.lang.String r1 = "registration_use_sms_retriever"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x02d2
            android.content.SharedPreferences r0 = X.C72453Mb.A0M(r8)
            boolean r0 = X.C17880vN.A1W(r0, r1)
            r8.A1Z = r0
        L_0x02d2:
            X.1CM r0 = r8.A07
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x0322
            java.lang.String r0 = r8.A1L
            if (r0 != 0) goto L_0x0322
            java.lang.String r0 = "VerifyPhoneNumber/onCreate/app got killed during autoconf authentication during changeNumber"
        L_0x02e0:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1jT r2 = r8.A0j
            int r1 = r8.A4e()
            r0 = 1
            X.C33841jT.A03(r2, r1, r0)
            X.A10.A00(r8)
        L_0x02f0:
            X.11E r1 = r8.A07
            X.11J r0 = r8.A1l
            r1.registerObserver(r0)
            java.lang.String r0 = r8.A1H
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x031c
            java.lang.String r0 = r8.A1J
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x031c
            android.content.Intent r1 = r8.getIntent()
            java.lang.String r0 = "return_to_phone_number"
            boolean r0 = X.AnonymousClass3MY.A1a(r1, r0)
            if (r0 == 0) goto L_0x035f
            java.lang.String r0 = "VerifyPhoneNumber/return to enter phone number based on intent extra"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0318:
            A1i(r8)
            return
        L_0x031c:
            java.lang.String r0 = "VerifyPhoneNumber/create/cc or num is missing, bounce to regphone"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            goto L_0x0318
        L_0x0322:
            boolean r0 = X.AnonymousClass8BR.A1M(r8)
            if (r0 == 0) goto L_0x02f0
            if (r24 != 0) goto L_0x02f0
            java.lang.String r0 = "VerifyPhoneNumber/onCreate/app got killed during flash call verification, reset reg state to SMS"
            goto L_0x02e0
        L_0x032d:
            android.content.Intent r1 = r8.getIntent()
            r0 = r23
            boolean r6 = r1.hasExtra(r0)
            android.content.Intent r1 = r8.getIntent()
            r0 = r19
            boolean r1 = r1.hasExtra(r0)
            if (r6 == 0) goto L_0x0348
            X.A5R r0 = r8.A0v
            r0.A07(r12, r4)
        L_0x0348:
            if (r1 == 0) goto L_0x02bc
            X.A5R r0 = r8.A0v
            r0.A07(r11, r2)
            goto L_0x02bc
        L_0x0351:
            java.lang.String r0 = "has_retried_flash_call"
            boolean r0 = r10.getBoolean(r0, r2)
            r8.A1P = r0
            goto L_0x02bc
        L_0x035b:
            r24 = 0
            goto L_0x02bc
        L_0x035f:
            X.0z4 r1 = r8.A0A
            X.8C9 r0 = new X.8C9
            r0.<init>(r1, r8)
            r8.A1d = r0
            X.19D r2 = r8.A00
            X.0z4 r1 = r8.A0A
            X.8C5 r0 = new X.8C5
            r0.<init>(r1, r2, r8)
            r8.A1e = r0
            X.A0w r6 = r8.A0f
            X.A5R r0 = r8.A0v
            r2 = -1
            long r0 = r0.A02(r12, r2)
            X.A5R r4 = r8.A0v
            long r2 = r4.A02(r11, r2)
            java.lang.StringBuilder r5 = X.AnonymousClass000.A10()
            java.lang.String r4 = "AccountDefenceSecondCodeViewPresenter/determine-current-account-defence-verification-state "
            r5.append(r4)
            r5.append(r0)
            java.lang.String r4 = ", "
            X.C17900vP.A0m(r4, r5, r2)
            X.6py r4 = r6.A01
            X.9o9 r9 = r4.A05
            X.0vc r5 = r9.A00
            java.lang.String r4 = "AccountDefenceLocalDataRepository_prefs"
            android.content.SharedPreferences r6 = r5.A05(r4)
            java.lang.String r5 = "com.whatsapp.registration.accountdefence.AccountDefenceLocalDataRepository.account_defence_verification_state"
            int r6 = X.C17890vO.A00(r6, r5)
            java.lang.StringBuilder r7 = X.AnonymousClass000.A10()
            java.lang.String r5 = "AccountDefenceLocalDataRepository/getSecondCodeVerificationState/"
            X.C17900vP.A0j(r5, r7, r6)
            if (r6 != 0) goto L_0x076f
            long r19 = java.lang.System.currentTimeMillis()
            long r17 = r9.A00()
            long r15 = r9.A01()
            r13 = 0
            int r5 = (r17 > r13 ? 1 : (r17 == r13 ? 0 : -1))
            if (r5 == 0) goto L_0x03d7
            int r5 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r5 == 0) goto L_0x03d7
            int r5 = (r17 > r13 ? 1 : (r17 == r13 ? 0 : -1))
            if (r5 <= 0) goto L_0x03cf
            int r5 = (r0 > r19 ? 1 : (r0 == r19 ? 0 : -1))
            if (r5 < 0) goto L_0x03d7
        L_0x03cf:
            int r0 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r0 <= 0) goto L_0x076f
            int r0 = (r2 > r19 ? 1 : (r2 == r19 ? 0 : -1))
            if (r0 >= 0) goto L_0x076f
        L_0x03d7:
            java.lang.String r0 = "AccountDefenceSecondCodeViewPresenter/determine-current-account-defence-verification-state return enabled"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r6 = 1
        L_0x03dd:
            r8.A00 = r6
            X.A0w r0 = r8.A0f
            X.6py r0 = r0.A01
            X.9o9 r0 = r0.A05
            X.0vc r0 = r0.A00
            android.content.SharedPreferences r1 = r0.A05(r4)
            java.lang.String r0 = "com.whatsapp.registration.accountdefence.AccountDefenceLocalDataRepository.account_defence_sms_requested_once"
            boolean r2 = X.C17880vN.A1W(r1, r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "AccountDefenceLocalDataRepository/isSecondSmsRequestedOnce/"
            X.C17900vP.A0n(r0, r1, r2)
            r8.A1Q = r2
            A1d(r8)
            X.C72463Mc.A0t(r8)
            X.118 r0 = r8.A0W
            android.content.res.Resources r1 = X.AnonymousClass3MW.A05(r0)
            r0 = 2131168475(0x7f070cdb, float:1.7951253E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r8.A07 = r0
            X.118 r0 = r8.A0W
            android.content.res.Resources r1 = X.AnonymousClass3MW.A05(r0)
            r0 = 2131168472(0x7f070cd8, float:1.7951247E38)
            int r1 = r1.getDimensionPixelSize(r0)
            X.0vb r0 = r8.A00
            boolean r0 = X.AnonymousClass3MY.A1b(r0)
            r4 = 0
            if (r0 == 0) goto L_0x0769
            r8.A04 = r1
            r8.A05 = r4
        L_0x042b:
            X.118 r0 = r8.A0W
            android.content.res.Resources r1 = X.AnonymousClass3MW.A05(r0)
            r0 = 2131168473(0x7f070cd9, float:1.7951249E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r8.A06 = r0
            r0 = 2131899347(0x7f1233d3, float:1.9433637E38)
            r8.setTitle(r0)
            r0 = 2131627341(0x7f0e0d4d, float:1.8881944E38)
            r8.setContentView((int) r0)
            X.1It r1 = X.AnonymousClass3MW.A0N(r8)
            java.lang.Class<com.whatsapp.registration.verifyphone.VerifyPhoneNumberViewModel> r0 = com.whatsapp.registration.verifyphone.VerifyPhoneNumberViewModel.class
            X.1J2 r0 = r1.A00(r0)
            com.whatsapp.registration.verifyphone.VerifyPhoneNumberViewModel r0 = (com.whatsapp.registration.verifyphone.VerifyPhoneNumberViewModel) r0
            r8.A0w = r0
            X.99I r1 = r0.A07
            r0 = 23
            X.C166988f1.A0d(r8, r1, r0)
            com.whatsapp.registration.verifyphone.VerifyPhoneNumberViewModel r0 = r8.A0w
            X.99H r1 = r0.A06
            r0 = 24
            X.C166988f1.A0d(r8, r1, r0)
            X.1It r1 = X.AnonymousClass3MW.A0N(r8)
            java.lang.Class<com.whatsapp.registration.phonenumberentry.viewmodel.PasskeyLoginViewModel> r0 = com.whatsapp.registration.phonenumberentry.viewmodel.PasskeyLoginViewModel.class
            X.1J2 r1 = r1.A00(r0)
            com.whatsapp.registration.phonenumberentry.viewmodel.PasskeyLoginViewModel r1 = (com.whatsapp.registration.phonenumberentry.viewmodel.PasskeyLoginViewModel) r1
            r8.A0q = r1
            r3 = 1
            X.AdV r0 = new X.AdV
            r0.<init>(r8, r3)
            X.1DT r2 = r1.A00
            X.B0K r1 = new X.B0K
            r1.<init>(r0)
            r0 = 49
            X.C20339AGv.A00(r8, r2, r1, r0)
            com.whatsapp.registration.verifyphone.VerifyPhoneNumberViewModel r0 = r8.A0w
            com.whatsapp.registration.silentauth.VerifySilentAuthUseCase r1 = r0.A05
            r0 = 25
            X.C166988f1.A0d(r8, r1, r0)
            com.whatsapp.registration.verifyphone.VerifyPhoneNumberViewModel r0 = r8.A0w
            com.whatsapp.registration.passkey.PasskeyUseCase r1 = r0.A03
            r0 = 26
            X.C166988f1.A0d(r8, r1, r0)
            com.whatsapp.registration.verifyphone.VerifyPhoneNumberViewModel r0 = r8.A0w
            X.99K r1 = r0.A02
            r0 = 35
            X.C166988f1.A0d(r8, r1, r0)
            com.whatsapp.registration.verifyphone.VerifyPhoneNumberViewModel r0 = r8.A0w
            X.99J r0 = r0.A01
            r2 = 37
            X.C166988f1.A0d(r8, r0, r2)
            com.whatsapp.registration.verifyphone.VerifyPhoneNumberViewModel r0 = r8.A0w
            com.whatsapp.registration.autoconf.AutoconfUseCase r1 = r0.A00
            r0 = 27
            X.C166988f1.A0d(r8, r1, r0)
            com.whatsapp.registration.verifyphone.VerifyPhoneNumberViewModel r0 = r8.A0w
            X.6Eo r1 = r0.A04
            r5 = 36
            X.7AQ r0 = new X.7AQ
            r0.<init>(r8, r5)
            r1.A03(r8, r0)
            X.1It r1 = X.AnonymousClass3MW.A0N(r8)
            java.lang.Class<com.whatsapp.registration.entercode.EnterCodeViewModel> r0 = com.whatsapp.registration.entercode.EnterCodeViewModel.class
            X.1J2 r1 = r1.A00(r0)
            com.whatsapp.registration.entercode.EnterCodeViewModel r1 = (com.whatsapp.registration.entercode.EnterCodeViewModel) r1
            r8.A0n = r1
            X.A5R r0 = r8.A0v
            X.C18070vi.A0d(r0, r4)
            r1.A01 = r0
            com.whatsapp.registration.entercode.EnterCodeViewModel r0 = r8.A0n
            X.1DT r1 = r0.A02
            r0 = 28
            X.C20338AGu.A00(r8, r1, r0)
            X.4VX r0 = r8.A0g
            boolean r0 = r0.A06()
            if (r0 != 0) goto L_0x04ee
            com.whatsapp.registration.entercode.EnterCodeViewModel r0 = r8.A0n
            X.1DT r1 = r0.A03
            r0 = 34
            X.C20338AGu.A00(r8, r1, r0)
        L_0x04ee:
            com.whatsapp.registration.entercode.EnterCodeViewModel r0 = r8.A0n
            X.1wy r0 = r0.A04
            X.C20338AGu.A00(r8, r0, r5)
            X.1It r1 = X.AnonymousClass3MW.A0N(r8)
            java.lang.Class<com.whatsapp.registration.flashcall.FlashCallViewModel> r0 = com.whatsapp.registration.flashcall.FlashCallViewModel.class
            X.1J2 r0 = r1.A00(r0)
            com.whatsapp.registration.flashcall.FlashCallViewModel r0 = (com.whatsapp.registration.flashcall.FlashCallViewModel) r0
            r8.A0o = r0
            X.1DT r1 = r0.A03
            r0 = 29
            X.C20338AGu.A00(r8, r1, r0)
            com.whatsapp.registration.flashcall.FlashCallViewModel r0 = r8.A0o
            X.1DT r1 = r0.A01
            r0 = 30
            X.C20338AGu.A00(r8, r1, r0)
            com.whatsapp.registration.flashcall.FlashCallViewModel r0 = r8.A0o
            X.1DT r0 = r0.A02
            r5 = 31
            X.C20338AGu.A00(r8, r0, r5)
            X.1It r1 = X.AnonymousClass3MW.A0N(r8)
            java.lang.Class<com.whatsapp.report.activity.banreport.BanReportViewModel> r0 = com.whatsapp.report.activity.banreport.BanReportViewModel.class
            X.1J2 r0 = r1.A00(r0)
            com.whatsapp.report.activity.banreport.BanReportViewModel r0 = (com.whatsapp.report.activity.banreport.BanReportViewModel) r0
            r8.A0x = r0
            X.1DT r0 = r0.A01
            X.AnonymousClass7AQ.A00(r8, r0, r2)
            com.whatsapp.report.activity.banreport.BanReportViewModel r0 = r8.A0x
            X.1DT r1 = r0.A02
            r0 = 32
            X.C20338AGu.A00(r8, r1, r0)
            X.1It r1 = X.AnonymousClass3MW.A0N(r8)
            java.lang.Class<com.whatsapp.registration.timers.RetryCodeCountdownTimersViewModel> r0 = com.whatsapp.registration.timers.RetryCodeCountdownTimersViewModel.class
            X.1J2 r0 = r1.A00(r0)
            com.whatsapp.registration.timers.RetryCodeCountdownTimersViewModel r0 = (com.whatsapp.registration.timers.RetryCodeCountdownTimersViewModel) r0
            r8.A0s = r0
            r0 = 2131430791(0x7f0b0d87, float:1.8483293E38)
            android.view.View r0 = X.C110885hR.A0A(r8, r0)
            com.whatsapp.wds.components.button.WDSButton r0 = (com.whatsapp.wds.components.button.WDSButton) r0
            r8.A11 = r0
            r0 = 2131430792(0x7f0b0d88, float:1.8483295E38)
            android.view.View r0 = X.C110885hR.A0A(r8, r0)
            com.whatsapp.WaTextView r0 = (com.whatsapp.WaTextView) r0
            r8.A0U = r0
            r0 = 2131435435(0x7f0b1fab, float:1.8492712E38)
            X.1bI r0 = X.AnonymousClass3Ma.A0x(r8, r0)
            r8.A10 = r0
            com.whatsapp.registration.timers.RetryCodeCountdownTimersViewModel r0 = r8.A0s
            X.1DS r1 = r0.A01
            r0 = 33
            X.C20338AGu.A00(r8, r1, r0)
            X.0z4 r0 = r8.A0A
            boolean r0 = r0.A2L()
            if (r0 == 0) goto L_0x0759
            r0 = 2131436249(0x7f0b22d9, float:1.8494363E38)
            android.view.View r0 = X.AnonymousClass8BV.A07(r8, r0)
            com.whatsapp.WaTextView r0 = (com.whatsapp.WaTextView) r0
            r8.A0T = r0
            r1 = 2131436281(0x7f0b22f9, float:1.8494428E38)
        L_0x0584:
            X.19D r0 = r8.A00
            X.A9B.A0T(r8, r0, r1)
            r0 = 2131429161(0x7f0b0729, float:1.8479987E38)
            android.view.View r0 = r8.findViewById(r0)
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            r8.A0G = r0
            r0 = 2131430479(0x7f0b0c4f, float:1.848266E38)
            android.widget.TextView r0 = X.AnonymousClass3MX.A0L(r8, r0)
            r8.A0H = r0
            r0 = 2131435159(0x7f0b1e97, float:1.8492152E38)
            com.whatsapp.TextEmojiLabel r0 = X.AnonymousClass8BR.A0H(r8, r0)
            r8.A0R = r0
            r0 = 2131436729(0x7f0b24b9, float:1.8495337E38)
            android.view.View r0 = r8.findViewById(r0)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            r8.A0D = r0
            A1j(r8)
            X.11E r0 = r8.A07
            X.2mn r0 = r0.A05()
            if (r0 == 0) goto L_0x05d9
            boolean r0 = r0.A04
            if (r0 == 0) goto L_0x05d9
            boolean r0 = X.AnonymousClass8BR.A1N(r8)
            if (r0 != 0) goto L_0x05d9
            X.1CM r0 = r8.A07
            boolean r0 = r0.A03()
            if (r0 != 0) goto L_0x05d9
            java.lang.String r0 = "VerifyPhoneNumber/onCreate/display-roaming"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 2131434736(0x7f0b1cf0, float:1.8491294E38)
            X.AnonymousClass3MX.A1H(r8, r0, r4)
        L_0x05d9:
            r0 = 2131434182(0x7f0b1ac6, float:1.849017E38)
            android.view.View r1 = r8.findViewById(r0)
            android.widget.ProgressBar r1 = (android.widget.ProgressBar) r1
            r8.A0F = r1
            r0 = 100
            r1.setProgress(r0)
            r0 = 2131436727(0x7f0b24b7, float:1.8495333E38)
            android.view.View r0 = r8.findViewById(r0)
            com.whatsapp.CodeInputField r0 = (com.whatsapp.CodeInputField) r0
            r8.A0L = r0
            X.4VX r0 = r8.A0g
            boolean r0 = r0.A06()
            if (r0 == 0) goto L_0x0746
            android.view.View r1 = r8.A00
            r0 = 2131436726(0x7f0b24b6, float:1.849533E38)
            android.widget.LinearLayout r6 = X.AnonymousClass3MX.A0K(r1, r0)
            X.4VX r2 = r8.A0g
            r0 = 2
            X.Ad0 r1 = new X.Ad0
            r1.<init>(r8, r0)
            int r0 = A1m
            r2.A03(r6, r1, r0, r4)
            com.whatsapp.CodeInputField r0 = r8.A0L
            r1 = 8
            r0.setVisibility(r1)
            android.widget.ProgressBar r0 = r8.A0F
            r0.setVisibility(r1)
            r6.setVisibility(r4)
        L_0x0621:
            r0 = 2131436728(0x7f0b24b8, float:1.8495335E38)
            android.view.View r2 = r8.findViewById(r0)
            android.widget.ImageButton r2 = (android.widget.ImageButton) r2
            r8.A0E = r2
            X.0vb r1 = r8.A00
            r0 = 2131231682(0x7f0803c2, float:1.8079452E38)
            X.AnonymousClass3NL.A01(r8, r2, r1, r0)
            android.widget.ImageButton r1 = r8.A0E
            r0 = 39
            X.AnonymousClass3MZ.A1L(r1, r8, r0)
            A1f(r8)
            r0 = 2131435435(0x7f0b1fab, float:1.8492712E38)
            X.1bI r0 = X.AnonymousClass3Ma.A0x(r8, r0)
            r8.A10 = r0
            android.content.res.Resources r0 = r8.getResources()
            boolean r0 = X.A9B.A0V(r0)
            if (r0 == 0) goto L_0x0659
            android.view.Window r1 = r8.getWindow()
            r0 = 2
            r1.setSoftInputMode(r0)
        L_0x0659:
            if (r26 == 0) goto L_0x0674
            java.lang.String r0 = "saved_otp_input"
            java.lang.String r1 = r10.getString(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0674
            X.4VX r0 = r8.A0g
            boolean r0 = r0.A06()
            if (r0 == 0) goto L_0x073f
            X.4VX r0 = r8.A0g
            r0.A04(r1)
        L_0x0674:
            X.A5R r2 = r8.A0v
            java.lang.String r1 = r8.A1H
            java.lang.String r0 = r8.A1J
            java.lang.String r6 = r2.A03(r1, r0)
            if (r6 == 0) goto L_0x06a8
            boolean r0 = X.AnonymousClass8BR.A1M(r8)
            if (r0 != 0) goto L_0x06a8
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "VerifyPhoneNumber/create/savedcode "
            X.C17900vP.A0f(r0, r6, r1)
            java.lang.String r2 = r8.A1H
            java.lang.String r1 = r8.A1J
            X.0zA r0 = r8.A0J
            X.A80.A00(r0)
            X.99E r0 = r8.A0m
            r19 = 4
            r13 = r8
            r14 = r0
            r15 = r6
            r16 = r2
            r17 = r1
            r18 = r12
            r13.A4k(r14, r15, r16, r17, r18, r19)
        L_0x06a8:
            boolean r0 = X.AnonymousClass8BR.A1M(r8)
            if (r0 != 0) goto L_0x0706
            android.os.Bundle r0 = X.AnonymousClass3MY.A09(r8)
            if (r0 == 0) goto L_0x0706
            if (r26 != 0) goto L_0x06f5
            android.content.Intent r1 = r8.getIntent()
            java.lang.String r0 = "request_code_method"
            java.lang.String r7 = r1.getStringExtra(r0)
            android.content.Intent r0 = r8.getIntent()
            java.lang.String r6 = "request_code_status"
            r2 = -1
            int r0 = r0.getIntExtra(r6, r2)
            if (r0 < 0) goto L_0x073d
            java.lang.Integer[] r1 = X.AnonymousClass00R.A00(r5)
            android.content.Intent r0 = r8.getIntent()
            int r0 = r0.getIntExtra(r6, r2)
            r2 = r1[r0]
        L_0x06db:
            android.content.Intent r1 = r8.getIntent()
            java.lang.String r0 = "request_code_result"
            android.os.Parcelable r0 = r1.getParcelableExtra(r0)
            X.ADN r0 = (X.ADN) r0
            if (r7 == 0) goto L_0x06f5
            if (r2 == 0) goto L_0x06f5
            if (r0 != 0) goto L_0x06f2
            X.ADN r0 = new X.ADN
            r0.<init>(r2)
        L_0x06f2:
            r8.A4j(r0, r7)
        L_0x06f5:
            r11 = 0
            r10 = r4
            r15 = r11
            r17 = r4
            r18 = r4
            r9 = r4
            r13 = r11
            android.content.Intent r0 = X.AnonymousClass1LU.A0G(r8, r9, r10, r11, r13, r15, r17, r18)
            r8.setIntent(r0)
        L_0x0706:
            X.A8V r1 = X.AnonymousClass8BU.A0d(r8)
            java.lang.String r0 = A16(r8)
            r1.A0C(r0)
            java.lang.String r0 = r8.A1L
            if (r0 == 0) goto L_0x077a
            java.lang.String r0 = "VerifyPhoneNumber/onCreate/attempt autoconf verification"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            com.whatsapp.registration.verifyphone.VerifyPhoneNumberViewModel r0 = r8.A0w
            com.whatsapp.registration.autoconf.AutoconfUseCase r5 = r0.A00
            X.1pm r4 = X.AnonymousClass2SS.A00(r8)
            java.lang.String r3 = r8.A1L
            X.19D r1 = r8.A00
            X.0z4 r0 = r8.A0A
            X.99F r1 = X.A9B.A0B(r0, r1)
            X.99E r0 = r8.A0m
            X.9s2 r2 = new X.9s2
            r2.<init>(r1, r0, r3)
            r1 = 0
            com.whatsapp.registration.autoconf.AutoconfUseCase$requestAutoconfCode$1 r0 = new com.whatsapp.registration.autoconf.AutoconfUseCase$requestAutoconfCode$1
            r0.<init>(r2, r5, r1)
            X.AnonymousClass3MX.A1Q(r0, r4)
            return
        L_0x073d:
            r2 = 0
            goto L_0x06db
        L_0x073f:
            com.whatsapp.CodeInputField r0 = r8.A0L
            r0.setText(r1)
            goto L_0x0674
        L_0x0746:
            com.whatsapp.CodeInputField r0 = r8.A0L
            r0.setVisibility(r4)
            com.whatsapp.CodeInputField r2 = r8.A0L
            r0 = 3
            X.ALh r1 = new X.ALh
            r1.<init>(r8, r0)
            r0 = 6
            r2.A0L(r1, r0)
            goto L_0x0621
        L_0x0759:
            r0 = 2131436248(0x7f0b22d8, float:1.8494361E38)
            android.view.View r0 = X.AnonymousClass8BV.A07(r8, r0)
            com.whatsapp.WaTextView r0 = (com.whatsapp.WaTextView) r0
            r8.A0T = r0
            r1 = 2131436280(0x7f0b22f8, float:1.8494426E38)
            goto L_0x0584
        L_0x0769:
            r8.A04 = r4
            r8.A05 = r1
            goto L_0x042b
        L_0x076f:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "AccountDefenceSecondCodeViewPresenter/determine-current-account-defence-verification-state return code:"
            X.C17900vP.A0j(r0, r1, r6)
            goto L_0x03dd
        L_0x077a:
            X.1CM r0 = r8.A07
            boolean r0 = r0.A03()
            if (r0 == 0) goto L_0x019e
            java.lang.String r0 = r8.A1I
            if (r0 == 0) goto L_0x019e
            r8.A1V = r3
            com.whatsapp.registration.verifyphone.VerifyPhoneNumberViewModel r0 = r8.A0w
            com.whatsapp.registration.passkey.PasskeyUseCase r5 = r0.A03
            X.1pm r4 = X.AnonymousClass2SS.A00(r8)
            java.lang.String r3 = A16(r8)
            X.99E r1 = r8.A0m
            java.lang.String r0 = r8.A1I
            X.9s6 r2 = new X.9s6
            r2.<init>(r1, r3, r0)
            r1 = 0
            com.whatsapp.registration.passkey.PasskeyUseCase$executePasskeyVerifyCodeRequest$2 r0 = new com.whatsapp.registration.passkey.PasskeyUseCase$executePasskeyVerifyCodeRequest$2
            r0.<init>(r5, r2, r1)
            X.AnonymousClass3MX.A1Q(r0, r4)
            return
        L_0x07a7:
            if (r9 != r3) goto L_0x07bd
            android.content.Intent r2 = X.C17880vN.A0A()
            java.lang.String r1 = r8.getPackageName()
            java.lang.String r0 = "com.whatsapp.registration.phonenumberentry.RegisterPhone"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "com.whatsapp.registration.RegisterPhone.tapped_sms_link"
            r2.putExtra(r0, r3)
            goto L_0x0198
        L_0x07bd:
            java.lang.String r5 = A13(r5)
            r8.A1f = r5
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "VerifyPhoneNumber/onCreate/code "
            X.C17900vP.A0f(r0, r5, r1)
            goto L_0x014a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.verifyphone.VerifyPhoneNumber.onCreate(android.os.Bundle):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00af, code lost:
        X.AnonymousClass8BX.A0w(r1, r9, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b2, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0263, code lost:
        return X.A9B.A08(r9, r9.A0Q, r9.A00, r9.A0c, new X.C146767Qn(r9, 11), r9.A1H, r9.A1J);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0366, code lost:
        r2 = new X.C20152A9o(r9, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x037c, code lost:
        r0 = X.AnonymousClass4a6.A00(r9);
        X.AnonymousClass8BT.A15(r9, r0, new java.lang.Object[]{X.C64052u8.A0A(r9.A00, r9.A0B)}, r7);
        r0.A0T(false);
        r0.A0Z(new X.A9V(r9, r6, 7), 2131899101);
        r3 = 2131898766;
        r1 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x03a3, code lost:
        r2 = new X.A9V(r9, r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x03a8, code lost:
        r0.A0X(r2, r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.app.Dialog onCreateDialog(int r20) {
        /*
            r19 = this;
            r0 = 21
            r4 = 1
            r5 = 0
            r9 = r19
            r6 = r20
            if (r6 == r0) goto L_0x0461
            r0 = 22
            if (r6 == r0) goto L_0x0436
            r0 = 109(0x6d, float:1.53E-43)
            if (r6 == r0) goto L_0x041d
            r0 = 500(0x1f4, float:7.0E-43)
            if (r6 == r0) goto L_0x003b
            r0 = 604(0x25c, float:8.46E-43)
            if (r6 == r0) goto L_0x03e9
            r0 = 613(0x265, float:8.59E-43)
            r1 = 2131894984(0x7f1222c8, float:1.9424788E38)
            if (r6 == r0) goto L_0x03dc
            r0 = 609(0x261, float:8.53E-43)
            r1 = 2131895065(0x7f122319, float:1.9424952E38)
            if (r6 == r0) goto L_0x03dc
            r0 = 610(0x262, float:8.55E-43)
            if (r6 == r0) goto L_0x03c9
            switch(r20) {
                case 24: goto L_0x0288;
                case 25: goto L_0x0288;
                case 26: goto L_0x02a9;
                case 27: goto L_0x02cb;
                case 28: goto L_0x02ef;
                case 29: goto L_0x030a;
                case 30: goto L_0x0329;
                case 31: goto L_0x033a;
                case 32: goto L_0x0283;
                case 33: goto L_0x0379;
                case 34: goto L_0x03ad;
                default: goto L_0x002f;
            }
        L_0x002f:
            r14 = 0
            switch(r20) {
                case 36: goto L_0x00d7;
                case 37: goto L_0x00f9;
                case 38: goto L_0x011b;
                case 39: goto L_0x013d;
                case 40: goto L_0x015f;
                case 41: goto L_0x047a;
                case 42: goto L_0x024e;
                case 43: goto L_0x00d2;
                case 44: goto L_0x0181;
                case 45: goto L_0x00b8;
                case 46: goto L_0x01a3;
                case 47: goto L_0x01a8;
                case 48: goto L_0x0227;
                case 49: goto L_0x0264;
                case 50: goto L_0x00b3;
                case 51: goto L_0x0249;
                case 52: goto L_0x03d9;
                default: goto L_0x0033;
            }
        L_0x0033:
            switch(r20) {
                case 124: goto L_0x024e;
                case 125: goto L_0x0059;
                case 126: goto L_0x0066;
                case 127: goto L_0x0084;
                case 128: goto L_0x008d;
                case 129: goto L_0x00a7;
                case 130: goto L_0x0052;
                default: goto L_0x0036;
            }
        L_0x0036:
            android.app.Dialog r1 = super.onCreateDialog(r6)
        L_0x003a:
            return r1
        L_0x003b:
            android.app.Dialog r1 = super.onCreateDialog(r6)
            if (r1 == 0) goto L_0x003a
            boolean r0 = r9.A1W
            if (r0 == 0) goto L_0x003a
            r1.setCancelable(r5)
            r0 = 35
            X.A9w r0 = X.C20160A9w.A00(r9, r0)
            r1.setOnDismissListener(r0)
            return r1
        L_0x0052:
            java.lang.String r0 = "violationType"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x0059:
            X.6mP r3 = r9.A0Q
            X.1MB r2 = r9.A0c
            java.lang.String r1 = r9.A1H
            java.lang.String r0 = r9.A1J
            X.05w r1 = X.A9B.A09(r9, r3, r2, r1, r0)
            return r1
        L_0x0066:
            X.6mP r11 = r9.A0Q
            X.0vb r12 = r9.A00
            X.1MB r13 = r9.A0c
            java.lang.String r2 = r9.A1H
            java.lang.String r1 = r9.A1J
            r0 = 11
            X.7Qn r15 = new X.7Qn
            r15.<init>(r9, r0)
            X.1L9 r8 = r9.A01
            X.1KB r10 = r9.A05
            r16 = r2
            r17 = r1
            X.05w r1 = X.A9B.A06(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return r1
        L_0x0084:
            android.app.ProgressDialog r1 = new android.app.ProgressDialog
            r1.<init>(r9)
            r0 = 2131895038(0x7f1222fe, float:1.9424898E38)
            goto L_0x00af
        L_0x008d:
            r0 = 11
            X.7Qn r3 = new X.7Qn
            r3.<init>(r9, r0)
            r0 = 14
            X.7Qn r2 = new X.7Qn
            r2.<init>(r9, r0)
            r1 = 15
            X.7Qn r0 = new X.7Qn
            r0.<init>(r9, r1)
            X.05w r1 = X.A9B.A0A(r9, r3, r2, r0)
            return r1
        L_0x00a7:
            android.app.ProgressDialog r1 = new android.app.ProgressDialog
            r1.<init>(r9)
            r0 = 2131895059(0x7f122313, float:1.942494E38)
        L_0x00af:
            X.AnonymousClass8BX.A0w(r1, r9, r0)
            return r1
        L_0x00b3:
            r7 = 2131889682(0x7f120e12, float:1.9414034E38)
            goto L_0x037c
        L_0x00b8:
            X.3Rj r0 = X.AnonymousClass4a6.A00(r9)
            r1 = 2131895083(0x7f12232b, float:1.942499E38)
            r0.A0E(r1)
            r1 = 2131895082(0x7f12232a, float:1.9424987E38)
            r0.A0D(r1)
            r0.A0T(r5)
            r2 = 2131893145(0x7f121b99, float:1.9421058E38)
            r1 = 42
            goto L_0x049b
        L_0x00d2:
            r1 = 2131895288(0x7f1223f8, float:1.9425405E38)
            goto L_0x03dc
        L_0x00d7:
            X.3Rj r0 = X.AnonymousClass4a6.A00(r9)
            android.content.res.Resources r1 = r9.getResources()
            X.0vb r3 = r9.A00
            X.A5R r4 = r9.A0v
            java.lang.String r6 = A17(r9)
            X.11P r2 = r9.A05
            java.lang.String r5 = "sms"
            java.lang.String r1 = A14(r1, r2, r3, r4, r5, r6)
            r0.A0S(r1)
            r2 = 2131899286(0x7f123396, float:1.9433514E38)
            r1 = 30
            goto L_0x049b
        L_0x00f9:
            X.3Rj r0 = X.AnonymousClass4a6.A00(r9)
            android.content.res.Resources r1 = r9.getResources()
            X.0vb r3 = r9.A00
            X.A5R r4 = r9.A0v
            java.lang.String r6 = A17(r9)
            X.11P r2 = r9.A05
            java.lang.String r5 = "voice"
            java.lang.String r1 = A14(r1, r2, r3, r4, r5, r6)
            r0.A0S(r1)
            r2 = 2131899286(0x7f123396, float:1.9433514E38)
            r1 = 29
            goto L_0x049b
        L_0x011b:
            X.3Rj r0 = X.AnonymousClass4a6.A00(r9)
            android.content.res.Resources r1 = r9.getResources()
            X.0vb r3 = r9.A00
            X.A5R r4 = r9.A0v
            java.lang.String r6 = A17(r9)
            X.11P r2 = r9.A05
            java.lang.String r5 = "wa_old"
            java.lang.String r1 = A14(r1, r2, r3, r4, r5, r6)
            r0.A0S(r1)
            r2 = 2131899286(0x7f123396, float:1.9433514E38)
            r1 = 31
            goto L_0x049b
        L_0x013d:
            X.3Rj r0 = X.AnonymousClass4a6.A00(r9)
            android.content.res.Resources r1 = r9.getResources()
            X.0vb r3 = r9.A00
            X.A5R r4 = r9.A0v
            java.lang.String r6 = A17(r9)
            X.11P r2 = r9.A05
            java.lang.String r5 = "sms"
            java.lang.String r1 = A15(r1, r2, r3, r4, r5, r6)
            r0.A0S(r1)
            r2 = 2131899286(0x7f123396, float:1.9433514E38)
            r1 = 26
            goto L_0x049b
        L_0x015f:
            X.3Rj r0 = X.AnonymousClass4a6.A00(r9)
            android.content.res.Resources r1 = r9.getResources()
            X.0vb r3 = r9.A00
            X.A5R r4 = r9.A0v
            java.lang.String r6 = A17(r9)
            X.11P r2 = r9.A05
            java.lang.String r5 = "wa_old"
            java.lang.String r1 = A15(r1, r2, r3, r4, r5, r6)
            r0.A0S(r1)
            r2 = 2131899286(0x7f123396, float:1.9433514E38)
            r1 = 27
            goto L_0x049b
        L_0x0181:
            r0 = 2131625101(0x7f0e048d, float:1.88774E38)
            android.view.View r3 = android.view.View.inflate(r9, r0, r14)
            X.3Rj r2 = X.AnonymousClass4a6.A00(r9)
            r0 = 2131436698(0x7f0b249a, float:1.8495274E38)
            android.widget.TextView r1 = X.C17880vN.A0E(r3, r0)
            if (r1 == 0) goto L_0x019b
            r0 = 2131886316(0x7f1200ec, float:1.9407207E38)
            r1.setText(r0)
        L_0x019b:
            r2.setView(r3)
            X.05w r1 = r2.create()
            return r1
        L_0x01a3:
            r1 = 2131895260(0x7f1223dc, float:1.9425348E38)
            goto L_0x03dc
        L_0x01a8:
            r0 = 12
            X.7Qn r7 = new X.7Qn
            r7.<init>(r9, r0)
            r0 = 2131625330(0x7f0e0572, float:1.8877865E38)
            android.view.View r3 = android.view.View.inflate(r9, r0, r14)
            r0 = 2131429980(0x7f0b0a5c, float:1.8481648E38)
            android.widget.TextView r6 = X.AnonymousClass3MW.A0J(r3, r0)
            android.text.method.MovementMethod r0 = android.text.method.LinkMovementMethod.getInstance()
            r6.setMovementMethod(r0)
            r2 = 2131895272(0x7f1223e8, float:1.9425372E38)
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.String r0 = r9.A12()
            java.lang.String r0 = X.C17880vN.A0q(r9, r0, r1, r5, r2)
            android.text.SpannableStringBuilder r0 = r9.A10(r7, r0, r4)
            r6.setText(r0)
            X.5hW r0 = new X.5hW
            r0.<init>(r7, r9, r4)
            X.AnonymousClass1HF.A0f(r6, r0)
            r0 = 2131436452(0x7f0b23a4, float:1.8494775E38)
            android.widget.TextView r4 = X.AnonymousClass3MW.A0J(r3, r0)
            r0 = 2131436732(0x7f0b24bc, float:1.8495343E38)
            android.view.View r2 = X.AnonymousClass1HF.A06(r3, r0)
            X.9oA r0 = r9.A0r
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x0212
            r0 = 2131897757(0x7f122d9d, float:1.9430413E38)
            r4.setText(r0)
            r0 = 38
            X.AnonymousClass3MZ.A1L(r4, r9, r0)
            r0 = 8
            r2.setVisibility(r0)
        L_0x0206:
            X.3Rj r0 = X.AnonymousClass4a6.A00(r9)
            r0.A0c(r3)
            r0.A0T(r5)
            goto L_0x049e
        L_0x0212:
            r1 = 26
            X.4dX r0 = new X.4dX
            r0.<init>(r9, r1)
            r4.setOnClickListener(r0)
            r1 = 27
            X.4dX r0 = new X.4dX
            r0.<init>(r9, r1)
            r2.setOnClickListener(r0)
            goto L_0x0206
        L_0x0227:
            X.3Rj r0 = X.AnonymousClass4a6.A00(r9)
            android.content.res.Resources r1 = r9.getResources()
            X.0vb r3 = r9.A00
            X.A5R r4 = r9.A0v
            java.lang.String r6 = A17(r9)
            X.11P r2 = r9.A05
            java.lang.String r5 = "email_otp"
            java.lang.String r1 = A15(r1, r2, r3, r4, r5, r6)
            r0.A0S(r1)
            r2 = 2131899286(0x7f123396, float:1.9433514E38)
            r1 = 28
            goto L_0x049b
        L_0x0249:
            r1 = 2131895747(0x7f1225c3, float:1.9426336E38)
            goto L_0x03dc
        L_0x024e:
            X.6mP r10 = r9.A0Q
            X.0vb r11 = r9.A00
            X.1MB r12 = r9.A0c
            java.lang.String r14 = r9.A1H
            java.lang.String r15 = r9.A1J
            r0 = 11
            X.7Qn r13 = new X.7Qn
            r13.<init>(r9, r0)
            X.05w r1 = X.A9B.A08(r9, r10, r11, r12, r13, r14, r15)
            return r1
        L_0x0264:
            X.3Rj r0 = X.AnonymousClass4a6.A00(r9)
            android.content.res.Resources r1 = r9.getResources()
            X.0vb r3 = r9.A00
            X.A5R r4 = r9.A0v
            X.11P r2 = r9.A05
            java.lang.String r5 = "email_otp"
            r6 = r14
            java.lang.String r1 = A14(r1, r2, r3, r4, r5, r6)
            r0.A0S(r1)
            r2 = 2131899286(0x7f123396, float:1.9433514E38)
            r1 = 32
            goto L_0x049b
        L_0x0283:
            r7 = 2131896243(0x7f1227b3, float:1.9427342E38)
            goto L_0x037c
        L_0x0288:
            X.3Rj r0 = X.AnonymousClass4a6.A00(r9)
            r1 = 2131895035(0x7f1222fb, float:1.9424892E38)
            r0.A0D(r1)
            r0.A0T(r5)
            r3 = 2131894985(0x7f1222c9, float:1.942479E38)
            r2 = 9
            X.A9V r1 = new X.A9V
            r1.<init>(r9, r6, r2)
            r0.A0Z(r1, r3)
            r3 = 2131898766(0x7f12318e, float:1.943246E38)
            r1 = 10
            goto L_0x03a3
        L_0x02a9:
            X.3Rj r0 = X.AnonymousClass4a6.A00(r9)
            android.content.res.Resources r1 = r9.getResources()
            X.0vb r3 = r9.A00
            X.A5R r4 = r9.A0v
            java.lang.String r6 = A17(r9)
            X.11P r2 = r9.A05
            java.lang.String r5 = "voice"
            java.lang.String r1 = A15(r1, r2, r3, r4, r5, r6)
            r0.A0S(r1)
            r2 = 2131899286(0x7f123396, float:1.9433514E38)
            r1 = 44
            goto L_0x049b
        L_0x02cb:
            X.3Rj r0 = X.AnonymousClass4a6.A00(r9)
            boolean r2 = X.AnonymousClass8BR.A1O(r9)
            r1 = 2131895008(0x7f1222e0, float:1.9424837E38)
            if (r2 == 0) goto L_0x02db
            r1 = 2131895268(0x7f1223e4, float:1.9425364E38)
        L_0x02db:
            r0.A0D(r1)
            r0.A0T(r5)
            r2 = 2131894985(0x7f1222c9, float:1.942479E38)
            r1 = 33
            X.C20152A9o.A00(r0, r9, r1, r2)
            r3 = 2131898766(0x7f12318e, float:1.943246E38)
            r1 = 34
            goto L_0x0366
        L_0x02ef:
            X.3Rj r0 = X.AnonymousClass4a6.A00(r9)
            r1 = 2131896242(0x7f1227b2, float:1.942734E38)
            r0.A0D(r1)
            r0.A0T(r5)
            r2 = 2131894985(0x7f1222c9, float:1.942479E38)
            r1 = 38
            X.C20152A9o.A00(r0, r9, r1, r2)
            r3 = 2131898766(0x7f12318e, float:1.943246E38)
            r1 = 39
            goto L_0x0366
        L_0x030a:
            X.3Rj r0 = X.AnonymousClass4a6.A00(r9)
            X.0vb r8 = r9.A00
            r7 = 2131755354(0x7f10015a, float:1.9141585E38)
            int r6 = A1n
            long r1 = (long) r6
            java.lang.Object[] r3 = new java.lang.Object[r4]
            X.C17880vN.A1T(r3, r6, r5)
            java.lang.String r1 = r8.A0K(r3, r7, r1)
            r0.A0S(r1)
            r2 = 2131899286(0x7f123396, float:1.9433514E38)
            r1 = 40
            goto L_0x049b
        L_0x0329:
            X.3Rj r0 = X.AnonymousClass4a6.A00(r9)
            r1 = 2131895064(0x7f122318, float:1.942495E38)
            r0.A0D(r1)
            r2 = 2131899286(0x7f123396, float:1.9433514E38)
            r1 = 36
            goto L_0x049b
        L_0x033a:
            X.3Rj r0 = X.AnonymousClass4a6.A00(r9)
            boolean r1 = X.AnonymousClass8BR.A1N(r9)
            if (r1 == 0) goto L_0x036c
            r6 = 2131895076(0x7f122324, float:1.9424975E38)
        L_0x0347:
            java.lang.Object[] r4 = new java.lang.Object[r4]
            X.0vb r3 = r9.A00
            long r1 = r9.A0B
            java.lang.String r1 = X.C64052u8.A0A(r3, r1)
            r4[r5] = r1
            X.AnonymousClass8BT.A15(r9, r0, r4, r6)
            r0.A0T(r5)
            r2 = 2131899101(0x7f1232dd, float:1.9433138E38)
            r1 = 35
            X.C20152A9o.A00(r0, r9, r1, r2)
            r3 = 2131898766(0x7f12318e, float:1.943246E38)
            r1 = 37
        L_0x0366:
            X.A9o r2 = new X.A9o
            r2.<init>(r9, r1)
            goto L_0x03a8
        L_0x036c:
            boolean r1 = X.AnonymousClass8BR.A1O(r9)
            r6 = 2131895006(0x7f1222de, float:1.9424833E38)
            if (r1 == 0) goto L_0x0347
            r6 = 2131895269(0x7f1223e5, float:1.9425366E38)
            goto L_0x0347
        L_0x0379:
            r7 = 2131895073(0x7f122321, float:1.9424969E38)
        L_0x037c:
            X.3Rj r0 = X.AnonymousClass4a6.A00(r9)
            java.lang.Object[] r4 = new java.lang.Object[r4]
            X.0vb r3 = r9.A00
            long r1 = r9.A0B
            java.lang.String r1 = X.C64052u8.A0A(r3, r1)
            r4[r5] = r1
            X.AnonymousClass8BT.A15(r9, r0, r4, r7)
            r0.A0T(r5)
            r3 = 2131899101(0x7f1232dd, float:1.9433138E38)
            r2 = 7
            X.A9V r1 = new X.A9V
            r1.<init>(r9, r6, r2)
            r0.A0Z(r1, r3)
            r3 = 2131898766(0x7f12318e, float:1.943246E38)
            r1 = 8
        L_0x03a3:
            X.A9V r2 = new X.A9V
            r2.<init>(r9, r6, r1)
        L_0x03a8:
            r0.A0X(r2, r3)
            goto L_0x049e
        L_0x03ad:
            X.3Rj r0 = X.AnonymousClass4a6.A00(r9)
            r1 = 2131894976(0x7f1222c0, float:1.9424772E38)
            r0.A0D(r1)
            r0.A0T(r5)
            r3 = 2131893145(0x7f121b99, float:1.9421058E38)
            r2 = 43
            X.A9o r1 = new X.A9o
            r1.<init>(r9, r2)
            r0.A0Y(r1, r3)
            goto L_0x049e
        L_0x03c9:
            X.9zE r2 = new X.9zE
            r2.<init>(r9)
            r1 = 7
            X.AlX r0 = new X.AlX
            r0.<init>(r9, r1)
            X.05w r1 = r2.A01(r0)
            return r1
        L_0x03d9:
            r1 = 2131895749(0x7f1225c5, float:1.942634E38)
        L_0x03dc:
            java.lang.String r0 = r9.getString(r1)
            android.app.ProgressDialog r1 = new android.app.ProgressDialog
            r1.<init>(r9)
            X.AnonymousClass8BX.A0x(r1, r0)
            return r1
        L_0x03e9:
            X.0vb r2 = r9.A00
            java.lang.String r1 = r9.A1H
            java.lang.String r0 = r9.A1J
            java.lang.String r2 = X.A9B.A0G(r2, r1, r0)
            X.3Rj r3 = X.AnonymousClass4a6.A00(r9)
            r1 = 2131886308(0x7f1200e4, float:1.9407191E38)
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r0[r5] = r2
            android.text.Spanned r0 = X.AnonymousClass1EG.A01(r9, r0, r1)
            r3.A0S(r0)
            r3.A0T(r4)
            r0 = 2131893145(0x7f121b99, float:1.9421058E38)
            java.lang.String r2 = r9.getString(r0)
            r1 = 3
            X.A9o r0 = new X.A9o
            r0.<init>(r9, r1)
            r3.A0L(r0, r2)
            X.05w r1 = r3.create()
            return r1
        L_0x041d:
            X.1LU r15 = r9.A0d
            X.10I r1 = r9.A05
            X.6mP r10 = r9.A0Q
            X.11C r12 = r9.A08
            X.1MB r14 = r9.A0c
            X.11E r11 = r9.A07
            X.17x r13 = r9.A0Y
            X.A98 r0 = r9.A0i
            r16 = r0
            r17 = r1
            X.05w r1 = X.A9B.A07(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return r1
        L_0x0436:
            X.A10 r0 = r9.A0u
            r0.A02(r5)
            X.1jT r0 = r9.A0j
            X.C33841jT.A03(r0, r4, r4)
            X.11P r15 = r9.A05
            X.0ve r3 = r9.A0E
            X.1vD r12 = r9.A0S
            X.18K r2 = r9.A0a
            X.194 r11 = r9.A0P
            X.1L9 r10 = r9.A01
            X.11C r14 = r9.A08
            X.0vb r1 = r9.A00
            X.00H r0 = r9.A15
            X.1o3 r13 = X.AnonymousClass3MW.A0a(r0)
            r16 = r1
            r17 = r3
            r18 = r2
            X.3cQ r1 = X.C137096uu.A00(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return r1
        L_0x0461:
            X.3Rj r0 = X.AnonymousClass4a6.A00(r9)
            r3 = 2131894982(0x7f1222c6, float:1.9424784E38)
            java.lang.Object[] r2 = new java.lang.Object[r4]
            r1 = 2131888733(0x7f120a5d, float:1.941211E38)
            java.lang.String r1 = X.AnonymousClass8BV.A0q(r9, r2, r1, r5, r3)
            r0.A0S(r1)
            r2 = 2131899286(0x7f123396, float:1.9433514E38)
            r1 = 25
            goto L_0x049b
        L_0x047a:
            r2 = 2131895022(0x7f1222ee, float:1.9424865E38)
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.String r0 = "https://whatsapp.com/android"
            java.lang.String r2 = X.C17880vN.A0q(r9, r0, r1, r5, r2)
            X.3Rj r0 = X.AnonymousClass4a6.A00(r9)
            r1 = 2131894980(0x7f1222c4, float:1.942478E38)
            java.lang.String r1 = X.C17890vO.A0R(r9, r2, r4, r5, r1)
            r0.A0S(r1)
            r0.A0T(r5)
            r2 = 2131899286(0x7f123396, float:1.9433514E38)
            r1 = 41
        L_0x049b:
            X.C20152A9o.A00(r0, r9, r1, r2)
        L_0x049e:
            X.05w r1 = r0.create()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.verifyphone.VerifyPhoneNumber.onCreateDialog(int):android.app.Dialog");
    }

    public void onDestroy() {
        Log.i("VerifyPhoneNumber/ondestroy");
        A1D();
        ((C20605ARp) this.A17.get()).A00();
        EnterCodeViewModel enterCodeViewModel = this.A0n;
        if (enterCodeViewModel != null) {
            enterCodeViewModel.A0T();
        }
        RetryCodeCountdownTimersViewModel retryCodeCountdownTimersViewModel = this.A0s;
        if (retryCodeCountdownTimersViewModel != null) {
            retryCodeCountdownTimersViewModel.A0U();
        }
        FlashCallViewModel flashCallViewModel = this.A0o;
        if (flashCallViewModel != null) {
            flashCallViewModel.A0T();
        }
        this.A07.unregisterObserver(this.A1l);
        AnonymousClass8BU.A1F(this.A1E);
        A1e(this);
        super.onDestroy();
    }

    public void onNewIntent(Intent intent) {
        Log.i("VerifyPhoneNumber/intent");
        super.onNewIntent(intent);
        String A132 = A13(intent);
        if (A132 == null) {
            int intExtra = intent.getIntExtra("com.whatsapp.verifynumber.dialog", 0);
            int i = 21;
            if (intExtra != 21) {
                i = 22;
                if (intExtra != 22) {
                    C17900vP.A0j("VerifyPhoneNumber/intent/unknown ", AnonymousClass000.A10(), intExtra);
                    return;
                }
            }
            AnonymousClass4Yv.A01(this, i);
        } else if (this.A1O) {
            A1u(A132);
        } else {
            C17900vP.A0f("VerifyPhoneNumber/intent/defer-code/", A132, AnonymousClass000.A10());
            this.A1f = A132;
        }
    }

    public void onPrepareDialog(int i, Dialog dialog) {
        C010105w r8;
        String str;
        String str2;
        A5R a5r;
        C18000vb r2;
        AnonymousClass11P r1;
        Resources resources;
        String A152;
        C010105w r82;
        Resources resources2;
        C18000vb r22;
        A5R a5r2;
        String A172;
        AnonymousClass11P r12;
        String str3;
        if (i == 26) {
            r82 = (C010105w) dialog;
            resources = getResources();
            r2 = this.A00;
            a5r = this.A0v;
            str = A17(this);
            r1 = this.A05;
            str2 = "voice";
            A152 = A15(resources, r1, r2, a5r, str2, str);
        } else if (i != 39) {
            if (i == 36) {
                r8 = (C010105w) dialog;
                resources2 = getResources();
                r22 = this.A00;
                a5r2 = this.A0v;
                A172 = A17(this);
                r12 = this.A05;
                str3 = "sms";
            } else if (i == 37) {
                r8 = (C010105w) dialog;
                resources2 = getResources();
                r22 = this.A00;
                a5r2 = this.A0v;
                A172 = A17(this);
                r12 = this.A05;
                str3 = "voice";
            } else {
                return;
            }
            A152 = A14(resources2, r12, r22, a5r2, str3, A172);
        } else {
            r82 = (C010105w) dialog;
            resources = getResources();
            r2 = this.A00;
            a5r = this.A0v;
            str = A17(this);
            r1 = this.A05;
            str2 = "sms";
            A152 = A15(resources, r1, r2, a5r, str2, str);
        }
        AnonymousClass0QH r0 = r8.A00;
        r0.A0R = A152;
        TextView textView = r0.A0L;
        if (textView != null) {
            textView.setText(A152);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:138:0x0333  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x034b  */
    /* JADX WARNING: Removed duplicated region for block: B:148:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onResume() {
        /*
            r19 = this;
            r2 = r19
            super.onResume()
            X.9uO r0 = r2.A0h
            r0.A00()
            java.lang.String r0 = r2.A1H
            if (r0 == 0) goto L_0x034f
            java.lang.String r0 = r2.A1J
            if (r0 == 0) goto L_0x034f
            X.1CM r0 = r2.A07
            boolean r0 = r0.A02()
            if (r0 != 0) goto L_0x0057
            X.1CM r0 = r2.A07
            boolean r0 = r0.A03()
            if (r0 != 0) goto L_0x0057
            android.content.SharedPreferences r1 = X.C72453Mb.A0M(r2)
            java.lang.String r0 = "pref_autoconf_verification_status"
            int r0 = X.AnonymousClass8BT.A01(r1, r0)
            r8 = 1
            if (r0 == r8) goto L_0x003b
            android.content.SharedPreferences r1 = X.C72453Mb.A0M(r2)
            java.lang.String r0 = "silent_auth_verification_status"
            boolean r0 = X.C17880vN.A1W(r1, r0)
            if (r0 == 0) goto L_0x0069
        L_0x003b:
            int r1 = X.AnonymousClass8BU.A02(r2)
            r0 = 2
            java.lang.String r4 = "successful"
            java.lang.String r3 = "verification_complete_dialog"
            if (r1 != r0) goto L_0x0058
            X.A8V r0 = X.AnonymousClass8BU.A0d(r2)
            r0.A0H(r3, r4)
            r1 = 10
        L_0x004f:
            X.7Qn r0 = new X.7Qn
            r0.<init>(r2, r1)
            r2.A1s(r0)
        L_0x0057:
            return
        L_0x0058:
            int r1 = X.AnonymousClass8BU.A02(r2)
            r0 = 7
            if (r1 != r0) goto L_0x0069
            X.A8V r0 = X.AnonymousClass8BU.A0d(r2)
            r0.A0H(r3, r4)
            r1 = 17
            goto L_0x004f
        L_0x0069:
            android.content.SharedPreferences r1 = X.C72453Mb.A0M(r2)
            java.lang.String r0 = "registration_sms_code_length"
            r3 = 6
            int r0 = r1.getInt(r0, r3)
            A1m = r0
            android.content.SharedPreferences r1 = X.C72453Mb.A0M(r2)
            java.lang.String r0 = "registration_voice_code_length"
            int r0 = r1.getInt(r0, r3)
            A1n = r0
            X.4VX r0 = r2.A0g
            boolean r0 = r0.A06()
            if (r0 != 0) goto L_0x0090
            com.whatsapp.CodeInputField r1 = r2.A0L
            int r0 = A1n
            r1.A02 = r0
        L_0x0090:
            boolean r0 = X.C19963A0w.A00(r2)
            if (r0 == 0) goto L_0x0261
            java.lang.String r1 = "verify-second-sms"
        L_0x0098:
            X.1j9 r0 = r2.A0k
            r0.A02(r1)
            int r3 = X.A10.A03
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "VerifyPhoneNumber/resume verification_state="
            X.C17900vP.A0j(r0, r1, r3)
            r7 = 0
            r11 = 4
            r1 = 21
            if (r3 == r11) goto L_0x02d3
            r0 = 8
            r1 = 22
            if (r3 == r0) goto L_0x02d3
            r0 = 12
            X.A5R r4 = r2.A0v
            if (r3 == r0) goto L_0x0265
            java.lang.String r10 = "sms"
            long r3 = X.A5R.A00(r4, r10)
            long r0 = java.lang.System.currentTimeMillis()
            long r3 = r3 - r0
            X.A5R r0 = r2.A0v
            java.lang.String r9 = "voice"
            long r17 = X.A5R.A00(r0, r9)
            long r0 = java.lang.System.currentTimeMillis()
            long r17 = r17 - r0
            X.A5R r0 = r2.A0v
            java.lang.String r13 = "wa_old"
            long r5 = X.A5R.A00(r0, r13)
            long r0 = java.lang.System.currentTimeMillis()
            long r5 = r5 - r0
            X.A5R r0 = r2.A0v
            java.lang.String r12 = "email_otp"
            long r0 = X.A5R.A00(r0, r12)
            long r14 = java.lang.System.currentTimeMillis()
            long r0 = r0 - r14
            boolean r16 = X.AnonymousClass8BR.A1N(r2)
            r14 = 0
            if (r16 == 0) goto L_0x0204
            int r0 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r0 <= 0) goto L_0x00fc
            r2.A1J(r5, r13)
        L_0x00fc:
            X.A5R r0 = r2.A0v
            r0.A06(r13)
            boolean r0 = r2.A1O
            if (r0 != 0) goto L_0x0112
            boolean r0 = r2.A1R
            if (r0 != 0) goto L_0x0112
            boolean r0 = r2.A1S
            if (r0 != 0) goto L_0x0112
            boolean r0 = r2.A1Y
            r2.A4p(r0)
        L_0x0112:
            boolean r0 = r2.A1O
            if (r0 != 0) goto L_0x0170
            boolean r0 = r2.A1R
            if (r0 == 0) goto L_0x0170
            int r0 = X.AnonymousClass8BU.A02(r2)
            if (r0 != r11) goto L_0x0170
            X.19D r1 = r2.A00
            r0 = 11186(0x2bb2, float:1.5675E-41)
            X.0vf r6 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r6, r1, r0)
            if (r0 == 0) goto L_0x0156
            android.content.SharedPreferences r1 = X.C72453Mb.A0M(r2)
            java.lang.String r0 = "pref_sms_otp_code_when_app_killed"
            java.lang.String r1 = r1.getString(r0, r7)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0156
            java.lang.String r0 = "VerifyPhoneNumber/resume attempting verify code with sms code received when app was killed"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r2.A4l(r1)
            X.0z4 r0 = r2.A0A
            r0.A1h(r7)
            X.A8V r5 = X.AnonymousClass8BU.A0d(r2)
            java.lang.String r1 = A16(r2)
            java.lang.String r0 = "code_retrieved_from_sms_retriever_after_app_killed"
            r5.A0F(r1, r0)
        L_0x0156:
            X.19D r1 = r2.A00
            r0 = 11185(0x2bb1, float:1.5674E-41)
            boolean r0 = X.C18020vd.A05(r6, r1, r0)
            if (r0 == 0) goto L_0x0170
            boolean r0 = r2.A1Z
            if (r0 == 0) goto L_0x0170
            X.Ad4 r5 = new X.Ad4
            r5.<init>(r2)
            X.0z4 r1 = r2.A0A
            X.118 r0 = r2.A0W
            X.C196889vo.A00(r0, r1, r5)
        L_0x0170:
            int r0 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r0 <= 0) goto L_0x01a1
            r2.A1J(r3, r10)
            boolean r0 = r2.A1O
            if (r0 != 0) goto L_0x0184
            boolean r0 = X.AnonymousClass8BR.A1M(r2)
            if (r0 == 0) goto L_0x0184
            A1r(r2, r8)
        L_0x0184:
            r2.A1F()
            com.whatsapp.registration.entercode.EnterCodeViewModel r5 = r2.A0n
            X.1wy r0 = r5.A04
            java.lang.Object r1 = r0.A06()
            java.lang.String r0 = "idle"
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x02ec
            X.A5R r0 = r5.A01
            if (r0 != 0) goto L_0x02d7
            java.lang.String r0 = "verifyPhoneNumberPrefs"
            X.C18070vi.A11(r0)
            throw r7
        L_0x01a1:
            X.A5R r0 = r2.A0v
            r0.A06(r10)
            boolean r0 = X.C19963A0w.A00(r2)
            if (r0 == 0) goto L_0x01cc
            X.A0w r0 = r2.A0f
            X.6py r0 = r0.A01
            X.9o9 r0 = r0.A05
            long r11 = r0.A00()
            r13 = r10
            r14 = r3
            r10 = r2
            r10.A1K(r11, r13, r14)
            X.A0w r0 = r2.A0f
            X.6py r0 = r0.A01
            X.9o9 r0 = r0.A05
            long r14 = r0.A01()
            r16 = r9
            r13 = r2
            r13.A1K(r14, r16, r17)
        L_0x01cc:
            boolean r0 = r2.A1O
            if (r0 != 0) goto L_0x0184
            boolean r0 = r2.A1R
            if (r0 != 0) goto L_0x0184
            boolean r0 = X.AnonymousClass8BR.A1M(r2)
            if (r0 == 0) goto L_0x01de
            A1r(r2, r8)
            goto L_0x0184
        L_0x01de:
            boolean r0 = X.AnonymousClass8BR.A1N(r2)
            if (r0 != 0) goto L_0x0184
            boolean r0 = X.AnonymousClass8BR.A1O(r2)
            if (r0 != 0) goto L_0x0184
            X.1CM r0 = r2.A07
            boolean r0 = r0.A05()
            if (r0 != 0) goto L_0x0184
            boolean r0 = r2.A1S
            if (r0 != 0) goto L_0x0184
            boolean r0 = r2.A1X
            if (r0 == 0) goto L_0x01fe
            r2.A4g()
            goto L_0x0184
        L_0x01fe:
            boolean r0 = r2.A1Y
            r2.A4o(r0)
            goto L_0x0184
        L_0x0204:
            boolean r5 = X.AnonymousClass8BR.A1O(r2)
            if (r5 == 0) goto L_0x0229
            int r5 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r5 <= 0) goto L_0x0211
            r2.A1J(r0, r12)
        L_0x0211:
            X.A5R r0 = r2.A0v
            r0.A06(r12)
            boolean r0 = r2.A1O
            if (r0 != 0) goto L_0x0112
            boolean r0 = r2.A1R
            if (r0 != 0) goto L_0x0112
            boolean r0 = r2.A1S
            if (r0 != 0) goto L_0x0112
            boolean r0 = r2.A1Y
            r2.A4n(r0)
            goto L_0x0112
        L_0x0229:
            X.1CM r0 = r2.A07
            boolean r0 = r0.A05()
            if (r0 == 0) goto L_0x0112
            boolean r0 = r2.A1O
            if (r0 != 0) goto L_0x0112
            boolean r0 = r2.A1R
            if (r0 != 0) goto L_0x0112
            boolean r0 = r2.A1S
            if (r0 != 0) goto L_0x0112
            X.0z4 r1 = r2.A0A
            java.lang.String r0 = "silent_auth_entered"
            r1.A1g(r0)
            com.whatsapp.registration.verifyphone.VerifyPhoneNumberViewModel r0 = r2.A0w
            com.whatsapp.registration.silentauth.VerifySilentAuthUseCase r12 = r0.A05
            X.1pm r6 = X.AnonymousClass2SS.A00(r2)
            java.lang.String r5 = A16(r2)
            X.99E r0 = r2.A0m
            X.9rB r1 = new X.9rB
            r1.<init>(r0, r5)
            com.whatsapp.registration.silentauth.VerifySilentAuthUseCase$requestSilentAuth$1 r0 = new com.whatsapp.registration.silentauth.VerifySilentAuthUseCase$requestSilentAuth$1
            r0.<init>(r1, r12, r7)
            X.AnonymousClass3MX.A1Q(r0, r6)
            goto L_0x0112
        L_0x0261:
            java.lang.String r1 = "verify-sms"
            goto L_0x0098
        L_0x0265:
            android.content.SharedPreferences r0 = X.A5R.A01(r4)
            java.lang.String r3 = "com.whatsapp.registration.VerifyPhoneNumber.appeal_token"
            boolean r0 = r0.contains(r3)
            r9 = 0
            if (r0 == 0) goto L_0x02cf
            android.content.SharedPreferences r0 = X.A5R.A01(r4)
            java.lang.String r6 = "com.whatsapp.registration.VerifyPhoneNumber.violated_policy"
            boolean r0 = r0.contains(r6)
            if (r0 == 0) goto L_0x02cf
            android.content.SharedPreferences r0 = X.A5R.A01(r4)
            java.lang.String r1 = "com.whatsapp.registration.VerifyPhoneNumber.violation_type"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x02cf
            android.content.SharedPreferences r0 = X.A5R.A01(r4)
            java.lang.String r5 = "com.whatsapp.registration.VerifyPhoneNumber.is_eu_smb"
            boolean r0 = r0.contains(r5)
            if (r0 == 0) goto L_0x02cf
            android.content.SharedPreferences r0 = X.A5R.A01(r4)
            java.lang.String r10 = r0.getString(r1, r7)
            android.content.SharedPreferences r0 = X.A5R.A01(r4)
            java.lang.String r11 = r0.getString(r6, r7)
            android.content.SharedPreferences r1 = X.A5R.A01(r4)
            java.lang.String r0 = "com.whatsapp.registration.VerifyPhoneNumber.violation_reason"
            java.lang.String r12 = r1.getString(r0, r7)
            android.content.SharedPreferences r1 = X.A5R.A01(r4)
            java.lang.String r0 = "com.whatsapp.registration.VerifyPhoneNumber.violation_source"
            int r14 = X.AnonymousClass8BT.A01(r1, r0)
            android.content.SharedPreferences r0 = X.A5R.A01(r4)
            boolean r15 = X.C17880vN.A1W(r0, r5)
            android.content.SharedPreferences r0 = X.A5R.A01(r4)
            java.lang.String r13 = r0.getString(r3, r7)
            X.ADM r9 = new X.ADM
            r9.<init>(r10, r11, r12, r13, r14, r15)
        L_0x02cf:
            r2.A1N(r9)
            goto L_0x0328
        L_0x02d3:
            X.AnonymousClass4Yv.A01(r2, r1)
            goto L_0x0328
        L_0x02d7:
            android.content.SharedPreferences r1 = X.A5R.A01(r0)
            java.lang.String r0 = "com.whatsapp.registration.VerifyPhoneNumber.code_verification_retry_time"
            long r3 = X.C17890vO.A04(r1, r0)
            java.lang.System.currentTimeMillis()
            long r0 = java.lang.System.currentTimeMillis()
            long r3 = r3 - r0
            r5.A0U(r3)
        L_0x02ec:
            int r1 = r2.A4e()
            r0 = 14
            if (r1 != r0) goto L_0x0310
            X.A0w r6 = r2.A0f
            java.lang.String r5 = r2.A1H
            X.C17960vV.A07(r5)
            java.lang.String r4 = r2.A1J
            X.C17960vV.A07(r4)
            r0 = 2
            X.Ad7 r3 = new X.Ad7
            r3.<init>(r2, r0)
            X.6py r1 = r6.A01
            X.Ad8 r0 = new X.Ad8
            r0.<init>(r6, r3)
            r1.A01(r0, r5, r4)
        L_0x0310:
            android.content.res.Resources r0 = r2.getResources()
            boolean r0 = X.A9B.A0V(r0)
            if (r0 != 0) goto L_0x0328
            com.whatsapp.CodeInputField r0 = r2.A0L
            boolean r0 = r0.isEnabled()
            if (r0 == 0) goto L_0x0328
            com.whatsapp.CodeInputField r1 = r2.A0L
            r0 = 0
            r1.A0I(r0)
        L_0x0328:
            X.1Vn r1 = r2.A0X
            java.lang.String r0 = "VerifySms1"
            r1.BEJ(r8, r0)
            java.lang.String r3 = r2.A1f
            if (r3 == 0) goto L_0x0343
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "VerifyPhoneNumber/resume/scheme/code "
            X.C17900vP.A0f(r0, r3, r1)
            java.lang.String r0 = r2.A1f
            r2.A1u(r0)
            r2.A1f = r7
        L_0x0343:
            r2.A1O = r8
            com.whatsapp.CodeInputField r1 = r2.A0L
            boolean r0 = r2.A01
            if (r0 == 0) goto L_0x0057
            r1.clearFocus()
            return
        L_0x034f:
            java.lang.String r0 = "VerifyPhoneNumber/resume/cc or num is missing, bounce to regphone"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            A1i(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.verifyphone.VerifyPhoneNumber.onResume():void");
    }

    public void onSaveInstanceState(Bundle bundle) {
        String code;
        bundle.putBoolean("use_sms_retriever", this.A1Z);
        bundle.putBoolean("has_retried_flash_call", this.A1P);
        if (this.A0g.A06()) {
            code = this.A0g.A00();
        } else {
            code = this.A0L.getCode();
        }
        if (!TextUtils.isEmpty(code)) {
            bundle.putString("saved_otp_input", code);
        }
        super.onSaveInstanceState(bundle);
    }

    public VerifyPhoneNumber(int i) {
        this.A1h = false;
        AGE.A00(this, 33);
    }

    public static String A17(VerifyPhoneNumber verifyPhoneNumber) {
        int i;
        int A022;
        if (AnonymousClass8BR.A1N(verifyPhoneNumber) || AnonymousClass8BR.A1O(verifyPhoneNumber) || (((A022 = AnonymousClass8BU.A02(verifyPhoneNumber)) == 13 || A022 == 14) && !verifyPhoneNumber.A1Q)) {
            i = 2131897802;
        } else {
            i = 2131897800;
        }
        return verifyPhoneNumber.getString(i);
    }

    private void A1C() {
        String str;
        if (!AnonymousClass8BR.A1M(this)) {
            boolean A1N2 = AnonymousClass8BR.A1N(this);
            A5R a5r = this.A0v;
            if (A1N2) {
                str = "wa_old";
            } else {
                str = "sms";
            }
            long A002 = A5R.A00(a5r, str);
            long currentTimeMillis = System.currentTimeMillis();
            long j = -1;
            if (A002 != -1) {
                j = A002 - currentTimeMillis;
            }
            if (A002 > currentTimeMillis) {
                this.A0j.A0C(j);
            }
        }
    }

    private void A1E() {
        boolean A1M2 = AnonymousClass8BR.A1M(this);
        C19830z4 r1 = this.A0A;
        if (A1M2) {
            r1.A1b("primary_successful");
        } else {
            r1.A1e("secondary_successful");
        }
    }

    private void A1K(long j, String str, long j2) {
        StringBuilder A102 = AnonymousClass000.A10();
        A102.append("VerifyPhoneNumber/updateRequestCodeTimerPerMethod/method=");
        A102.append(str);
        A102.append("/serverWaitTime=");
        A102.append(j);
        C17900vP.A0m("/remainingWaitTime=", A102, j2);
        if (j2 > 0) {
            A1J(j2, str);
            C166988f1.A0x(this.A0v, str, j2);
        } else if (j < 0) {
            RetryCodeCountdownTimersViewModel retryCodeCountdownTimersViewModel = this.A0s;
            retryCodeCountdownTimersViewModel.A04.put(str, Long.valueOf(j));
        } else if (j == 0) {
            if (C18020vd.A05(C18040vf.A02, this.A00, 8780)) {
                this.A11.setEnabled(true);
            } else {
                this.A0U.setClickable(true);
            }
            this.A10.A04(8);
            this.A0v.A06(str);
            if ((AnonymousClass8BR.A1U(str) || str.equals("voice")) && C19963A0w.A00(this) && this.A00 == 0) {
                A4h(1);
            }
        }
    }

    public static final void A1M(C19830z4 r1, A5R a5r) {
        C18070vi.A0h(a5r, r1);
        a5r.A06("voice");
        a5r.A06("sms");
        a5r.A06("wa_old");
        a5r.A06("email_otp");
        a5r.A06("flash");
        a5r.A04();
        C17880vN.A1B(C19830z4.A00(r1), "pref_reg_methods_order");
    }

    public static void A1Q(C188779hy r10, VerifyPhoneNumber verifyPhoneNumber, String str) {
        StringBuilder A102 = AnonymousClass000.A10();
        A102.append("VerifyPhoneNumber/method=");
        A102.append(str);
        C17890vO.A1A(A102, "/onRegisterEntrypoint2FARequired");
        VerifyPhoneNumber verifyPhoneNumber2 = verifyPhoneNumber;
        AnonymousClass8BU.A0d(verifyPhoneNumber).A0F(A16(verifyPhoneNumber), "account_verification_complete");
        if (AnonymousClass8BR.A1X(str)) {
            verifyPhoneNumber.A0A.A1Y("email_otp_verified");
        }
        if (AnonymousClass8BR.A1V(str)) {
            verifyPhoneNumber.A1E();
        }
        A1q(verifyPhoneNumber2, r10.A0B, r10.A0E, r10.A0D, A9B.A01(str, verifyPhoneNumber.A1T), r10.A03, true, true);
        verifyPhoneNumber2.A1t(new C146767Qn(verifyPhoneNumber2, 17), str, true);
    }

    public static void A1R(C188779hy r11, VerifyPhoneNumber verifyPhoneNumber, String str) {
        StringBuilder A102 = AnonymousClass000.A10();
        A102.append("VerifyPhoneNumber/method=");
        A102.append(str);
        C17890vO.A1A(A102, "/onRegisterEntrypointVerified");
        AnonymousClass8BU.A0d(verifyPhoneNumber).A0F(A16(verifyPhoneNumber), "account_verification_complete");
        AnonymousClass8BU.A0d(verifyPhoneNumber).A08();
        String str2 = verifyPhoneNumber.A1H;
        String str3 = verifyPhoneNumber.A1J;
        String str4 = r11.A08;
        boolean z = r11.A0H;
        boolean z2 = r11.A0G;
        boolean z3 = r11.A0F;
        A1P(r11.A04, verifyPhoneNumber, str2, str3, str4, A9B.A01(str, verifyPhoneNumber.A1T), z, z2, z3);
        if (AnonymousClass8BR.A1V(str)) {
            verifyPhoneNumber.A1E();
        }
        verifyPhoneNumber.A1t(new C146767Qn(verifyPhoneNumber, 10), str, false);
    }

    private void A1S(C188779hy r10, String str) {
        StringBuilder A102 = AnonymousClass000.A10();
        A102.append("VerifyPhoneNumber/");
        String str2 = str;
        A102.append(str);
        A102.append("/onAccountDefenceChecksRequired status ");
        C17890vO.A1A(A102, C181679Rk.A00(r10.A07));
        if (AnonymousClass8BR.A1V(str)) {
            A1E();
        }
        A1L(r10.A01, str2, AnonymousClass000.A1Z(r10.A07, AnonymousClass00R.A06), r10.A02);
    }

    private void A1T(C188779hy r6, String str) {
        String str2;
        StringBuilder A102 = AnonymousClass000.A10();
        C166988f1.A0y("VerifyPhoneNumber/onVerifyCodeErrorMismatch/method=", str, A102);
        C17890vO.A1A(A102, r6.A0C);
        A18();
        if (AnonymousClass8BR.A1U(str) || AnonymousClass8BR.A1W(str) || AnonymousClass8BR.A1X(str)) {
            A9B.A0U(this.A0A, "server-send-mismatch");
            this.A0v.A05();
        }
        String str3 = r6.A0C;
        long j = 60000;
        if (str3 != null) {
            try {
                j = 1000 * Long.parseLong(str3);
                if (j <= 0) {
                    str2 = getString(2131895066);
                    A1w(str2);
                    this.A0n.A0U(j);
                }
            } catch (NumberFormatException e) {
                Log.w(C17890vO.A0a("VerifyPhoneNumber/onVerifyCodeErrorMismatch/fail to parse retryAfter/use default wait time ", AnonymousClass000.A10(), 60000), e);
            }
        }
        str2 = C108975cc.A0b(this, C64052u8.A0A(this.A00, j), AnonymousClass3MW.A1a(), 2131895067);
        A1w(str2);
        this.A0n.A0U(j);
    }

    private void A1U(ADN adn, String str) {
        StringBuilder A102 = AnonymousClass000.A10();
        A102.append("VerifyPhoneNumber/method=");
        A102.append(str);
        C17890vO.A1A(A102, "/onCodeEntrypoint2FARequired/go to 2FA screen");
        AnonymousClass8BU.A0d(this).A0F(A16(this), "account_verification_complete");
        if (AnonymousClass8BR.A1X(str)) {
            this.A0A.A1Y("email_otp_verified");
        }
        A1q(this, adn.A0K, adn.A0T, adn.A0S, A9B.A01(str, this.A1T), adn.A05, true, true);
        A1k(this);
    }

    private void A1V(ADN adn, String str) {
        StringBuilder A102 = AnonymousClass000.A10();
        A102.append("VerifyPhoneNumber/method=");
        A102.append(str);
        C17890vO.A1A(A102, "/onCodeEntrypointVerified");
        this.A0A.A23(adn.A0X);
        this.A0A.A22(adn.A0W);
        AnonymousClass8BU.A0d(this).A08();
        A1P((ADM) null, this, this.A1H, this.A1J, adn.A0H, A9B.A01(str, this.A1T), adn.A0X, adn.A0W, false);
        A1l(this);
    }

    private void A1W(ADN adn, String str) {
        String str2;
        String str3 = str;
        C17900vP.A0f("VerifyPhoneNumber/updateRequestCodeTimers/method=", str3, AnonymousClass000.A10());
        ADN adn2 = adn;
        long A022 = A9B.A02(adn2.A0O, -1) * 1000;
        long A023 = A9B.A02(adn2.A0G, -1) * 1000;
        long A024 = A9B.A02(adn2.A0Q, -1) * 1000;
        long A025 = A9B.A02(adn2.A0R, -1) * 1000;
        long A026 = A9B.A02(adn2.A0E, -1) * 1000;
        long A027 = A9B.A02(adn2.A0N, -1) * 1000;
        switch (str3.hashCode()) {
            case -795576526:
                if (AnonymousClass8BR.A1W(str3)) {
                    String str4 = adn2.A0R;
                    if (str4 == null) {
                        str4 = adn2.A0L;
                    }
                    A025 = A9B.A02(str4, -1) * 1000;
                    break;
                }
                break;
            case 114009:
                if (AnonymousClass8BR.A1U(str3)) {
                    String str5 = adn2.A0O;
                    if (str5 == null) {
                        str5 = adn2.A0L;
                    }
                    A022 = A9B.A02(str5, -1) * 1000;
                    break;
                }
                break;
            case 97513456:
                str2 = "flash";
                break;
            case 112386354:
                str2 = "voice";
                break;
            case 1247787042:
                if (str3.equals("send_sms")) {
                    String str6 = adn2.A0N;
                    if (str6 == null) {
                        str6 = adn2.A0L;
                    }
                    A027 = A9B.A02(str6, -1) * 1000;
                    break;
                }
                break;
            case 2120743944:
                if (AnonymousClass8BR.A1X(str3)) {
                    String str7 = adn2.A0E;
                    if (str7 == null) {
                        str7 = adn2.A0L;
                    }
                    A026 = A9B.A02(str7, -1) * 1000;
                    break;
                }
                break;
        }
        if (str3.equals(str2)) {
            String str8 = adn2.A0Q;
            if (str8 == null) {
                str8 = adn2.A0L;
            }
            A024 = A9B.A02(str8, -1) * 1000;
            if (A022 < 0 && A024 < 0 && A027 < 0 && ((!AnonymousClass8BR.A1N(this) || A025 < 0) && (!AnonymousClass8BR.A1O(this) || A026 < 0))) {
                Log.i("VerifyPhoneNumber/updateRequestCodeTimers/all attempts exhausted");
                if (C18020vd.A05(C18040vf.A02, this.A00, 8780)) {
                    this.A11.setEnabled(false);
                } else {
                    this.A0U.setClickable(false);
                    AnonymousClass8BW.A0z(this, getResources(), this.A0U, 2130968818, 2131099900);
                }
                this.A10.A04(8);
            }
            if (C19963A0w.A00(this)) {
                this.A0f.A02(A022, A024);
            }
            A1K(A022, "sms", A022);
            A1K(A024, "voice", A024);
            A1K(A023, "flash", A023);
            if (AnonymousClass8BR.A1N(this)) {
                A1K(A025, "wa_old", A025);
                return;
            } else if (AnonymousClass8BR.A1O(this)) {
                A1K(A026, "email_otp", A026);
                return;
            } else {
                return;
            }
        }
        StringBuilder A102 = AnonymousClass000.A10();
        A102.append("VerifyPhoneNumber/updateRequestCodeTimers/Invalid method: ");
        throw AnonymousClass001.A12(str3, A102);
    }

    private void A1X(ADN adn, String str, String str2) {
        StringBuilder A0Q2 = C166988f1.A0Q(str);
        A0Q2.append("/bad-parameter/");
        C17890vO.A19(A0Q2, adn.A0J);
        A9B.A0U(this.A0A, str2);
        if ("number".equals(adn.A0J)) {
            A1H(34);
            return;
        }
        A1H(24);
        if (AnonymousClass8BR.A1U(str) || AnonymousClass8BR.A1W(str) || AnonymousClass8BR.A1X(str)) {
            A1A();
        }
    }

    private void A1Y(ADN adn, String str, String str2, int i, int i2) {
        StringBuilder A102 = AnonymousClass000.A10();
        A102.append("VerifyPhoneNumber/verify");
        A102.append(str);
        A102.append("/request/");
        A102.append(str);
        C17890vO.A19(A102, "/provider-unroutable");
        A9B.A0U(this.A0A, str2);
        if (!A20(adn.A0L)) {
            A1w(getString(i));
            return;
        }
        try {
            long A082 = AnonymousClass8BW.A08(adn.A0L);
            A1I(A082);
            A1w(getString(i2, new Object[]{C64052u8.A0A(this.A00, A082)}));
            C166988f1.A0x(this.A0v, "voice", A082);
            A1J(A082, str);
        } catch (NumberFormatException e) {
            StringBuilder A0H2 = C17900vP.A0H("VerifyPhoneNumber/verify", str, "/request/");
            A0H2.append(str);
            C17890vO.A13("/unroutable/time-not-int", A0H2, e);
            A1w(getString(i));
        }
    }

    private void A1Z(ADN adn, String str, String str2, String str3, int i, int i2) {
        StringBuilder A102 = AnonymousClass000.A10();
        A102.append("VerifyPhoneNumber/verify");
        A102.append(str);
        A102.append("/request/");
        A102.append(str);
        C17890vO.A1B(A102, "/no-routes");
        A9B.A0U(this.A0A, str2);
        if (!A20(adn.A0L)) {
            A1w(getString(i));
            this.A0k.A03(str3);
            return;
        }
        try {
            long A082 = AnonymousClass8BW.A08(adn.A0L);
            A1I(A082);
            A1w(getString(i2, new Object[]{C64052u8.A0A(this.A00, A082)}));
            C166988f1.A0x(this.A0v, "voice", A082);
            A1J(A082, str);
            this.A0k.A03(str3);
        } catch (NumberFormatException e) {
            StringBuilder A0H2 = C17900vP.A0H("VerifyPhoneNumber/verify", str, "/request/");
            A0H2.append(str);
            C17890vO.A13("/no-routes/time-not-int", A0H2, e);
            A1w(getString(i));
        }
    }

    public static void A1e(VerifyPhoneNumber verifyPhoneNumber) {
        if (!verifyPhoneNumber.Bed()) {
            C010105w r0 = verifyPhoneNumber.A0I;
            if (r0 != null && r0.isShowing()) {
                verifyPhoneNumber.A0I.dismiss();
            }
            verifyPhoneNumber.A0I = null;
        }
    }

    public static void A1h(VerifyPhoneNumber verifyPhoneNumber) {
        if (AnonymousClass4Yv.A02(verifyPhoneNumber)) {
            Log.i("VerifyPhoneNumber/removeProgressDialog/isEnded");
            return;
        }
        Log.i("VerifyPhoneNumber/removeProgressDialog");
        ProgressDialog progressDialog = verifyPhoneNumber.A0C;
        if (progressDialog != null && progressDialog.isShowing()) {
            progressDialog.dismiss();
        }
        verifyPhoneNumber.A0C = null;
    }

    public static void A1n(VerifyPhoneNumber verifyPhoneNumber, int i) {
        if (AnonymousClass4Yv.A02(verifyPhoneNumber)) {
            Log.i("VerifyPhoneNumber/showInDeterminateProgressDialog/isEnded");
            return;
        }
        String string = verifyPhoneNumber.getString(i);
        C17900vP.A0f("VerifyPhoneNumber/showInDeterminateProgressDialog/", string, AnonymousClass000.A10());
        ProgressDialog progressDialog = new ProgressDialog(verifyPhoneNumber);
        AnonymousClass8BX.A0x(progressDialog, string);
        progressDialog.show();
        verifyPhoneNumber.A0C = progressDialog;
    }

    private void A1t(Runnable runnable, String str, boolean z) {
        A4f();
        if (str.equals("autoconf") || str.equals("silent_auth")) {
            Log.i("VerifyPhoneNumber/showVerifiedCompleteDialog/show new verification complete dialog");
            AnonymousClass8BU.A0d(this).A0H("verification_complete_dialog", "successful");
            A1s(runnable);
            return;
        }
        if (z) {
            Log.i("VerifyPhoneNumber/showVerifiedCompleteDialog/go to 2FA screen");
        } else {
            Log.i("VerifyPhoneNumber/showVerifiedCompleteDialog/show old verification complete dialog");
            C010105w A052 = A9B.A05(this);
            this.A0I = A052;
            if (A052 != null) {
                if (!isFinishing()) {
                    this.A0I.show();
                }
                this.A05.A0K(runnable, 1000);
                return;
            }
        }
        runnable.run();
    }

    private void A1u(String str) {
        if (AnonymousClass8BR.A1O(this)) {
            AnonymousClass8BU.A0d(this).A0I(A16(this), "click_email_otp_deep_link");
            AnonymousClass8BU.A0d(this).A0C(A16(this));
        }
        if (AnonymousClass000.A1Y(this.A0n.A02.A06())) {
            Log.i("VerifyPhoneNumber/verificationlink/voice/code-entry-blocked-retry-later");
            A5R a5r = this.A0v;
            String str2 = this.A1H;
            String str3 = this.A1J;
            C18070vi.A0n(str, str2, str3);
            SharedPreferences.Editor edit = A5R.A01(a5r).edit();
            edit.putString("com.whatsapp.registration.VerifyPhoneNumber.sms_code", str);
            edit.putString("com.whatsapp.registration.VerifyPhoneNumber.sms_cc", str2);
            edit.putString("com.whatsapp.registration.VerifyPhoneNumber.sms_phone_number", str3);
            edit.apply();
            return;
        }
        StringBuilder A102 = AnonymousClass000.A10();
        A102.append("VerifyPhoneNumber/verificationlink/voice/state ");
        C17900vP.A0o(A102, A10.A03);
        if (this.A0g.A06()) {
            this.A0g.A04(str);
        } else {
            this.A0L.setText(str);
        }
    }

    private void A1v(String str) {
        StringBuilder A102 = AnonymousClass000.A10();
        A102.append("VerifyPhoneNumber/verify/");
        A102.append(str);
        C17890vO.A19(A102, "/registration-not-allowed-error");
        A9B.A0U(this.A0A, "not-allowed");
        this.A0h.A01(45);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0017, code lost:
        A1H(r1);
        A1C();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0034, code lost:
        if (r0 == false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A1y(java.lang.String r3, java.lang.String r4) {
        /*
            r2 = this;
            java.lang.StringBuilder r1 = X.C166988f1.A0Q(r3)
            java.lang.String r0 = "/next-method"
            X.C17890vO.A1B(r1, r0)
            X.0z4 r0 = r2.A0A
            X.A9B.A0U(r0, r4)
            int r0 = r3.hashCode()
            switch(r0) {
                case 114009: goto L_0x0027;
                case 112386354: goto L_0x001e;
                case 2120743944: goto L_0x002e;
                default: goto L_0x0015;
            }
        L_0x0015:
            r1 = 38
        L_0x0017:
            r2.A1H(r1)
            r2.A1C()
            return
        L_0x001e:
            java.lang.String r0 = "voice"
            boolean r0 = r3.equals(r0)
            r1 = 37
            goto L_0x0034
        L_0x0027:
            boolean r0 = X.AnonymousClass8BR.A1U(r3)
            r1 = 36
            goto L_0x0034
        L_0x002e:
            boolean r0 = X.AnonymousClass8BR.A1X(r3)
            r1 = 49
        L_0x0034:
            if (r0 != 0) goto L_0x0017
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.verifyphone.VerifyPhoneNumber.A1y(java.lang.String, java.lang.String):void");
    }

    public void A4f() {
        if (AnonymousClass8BR.A1M(this)) {
            Log.i("VerifyPhoneNumber/hide-automatically-verifying-progress-dialog");
            A1h(this);
            return;
        }
        Log.i("VerifyPhoneNumber/hide-verifying-progress-dialog");
        AnonymousClass4Yv.A00(this, 609);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x029b, code lost:
        if (r8 == X.AnonymousClass00R.A01) goto L_0x0470;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x029f, code lost:
        if (r8 != X.AnonymousClass00R.A0C) goto L_0x02c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x02a1, code lost:
        A4f();
        X.C181689Rl.A00(r11.A05);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x02ad, code lost:
        if (X.AnonymousClass8BR.A1W(r7) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x02af, code lost:
        if (r8 == r6) goto L_0x02c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x02b3, code lost:
        if (r8 == X.AnonymousClass00R.A01) goto L_0x02c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x02b7, code lost:
        if (r8 == X.AnonymousClass00R.A04) goto L_0x02c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x02b9, code lost:
        r1 = r11.A0A;
        r0 = "wa_old_failed";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x02bd, code lost:
        r1.A1j(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x02c0, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x02c1, code lost:
        r1 = r11.A0A;
        r0 = "wa_old_successful";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x02c8, code lost:
        if (r8 != X.AnonymousClass00R.A0j) goto L_0x02ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x02ca, code lost:
        A1T(r15, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x02ce, code lost:
        r9 = r11.A0v.A03(r11.A1H, r11.A1J);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0059, code lost:
        if (r7.equals(r0) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x02da, code lost:
        if (r8 != X.AnonymousClass00R.A0Y) goto L_0x0301;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x02dc, code lost:
        X.C17900vP.A0f("VerifyPhoneNumber/onVerifyGenericCodeErrorConnectivity/method=", r7, X.AnonymousClass000.A10());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x02e9, code lost:
        if (X.AnonymousClass8BR.A1W(r7) == false) goto L_0x0421;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x02eb, code lost:
        r0 = X.C108975cc.A0b(r11, getString(2131888733), X.AnonymousClass3MW.A1a(), 2131894981);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x02fd, code lost:
        A1w(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0303, code lost:
        if (r8 != X.AnonymousClass00R.A15) goto L_0x0338;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0305, code lost:
        X.C17900vP.A0f("VerifyPhoneNumber/onVerifyGenericCodeErrorGuessedTooFast/method=", r7, X.AnonymousClass000.A10());
        X.A9B.A0U(r11.A0A, "server-send-guessed-too-fast");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0319, code lost:
        if (X.AnonymousClass8BR.A1W(r7) != false) goto L_0x0415;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x031b, code lost:
        if (r3 != false) goto L_0x0415;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x005b, code lost:
        r1 = X.AnonymousClass000.A10();
        r1.append("VerifyPhoneNumber/onVerifyVoiceOrFlashResponse/method=");
        r1.append(r7);
        r1.append("/status=");
        X.C17890vO.A1A(r1, X.C181679Rk.A00(r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x031d, code lost:
        if (r9 != null) goto L_0x0435;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x031f, code lost:
        r0 = "VerifyPhoneNumber/verifysms/error/too-fast/saved-code-is-null";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0321, code lost:
        com.whatsapp.util.Log.e(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0328, code lost:
        if (r11.A0h.A00 != false) goto L_0x0330;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x032e, code lost:
        if (Bed() == false) goto L_0x02a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0330, code lost:
        X.A9B.A0O(r11, r11.A0X, -1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x033a, code lost:
        if (r8 != X.AnonymousClass00R.A02) goto L_0x035c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0075, code lost:
        if (r8 == X.AnonymousClass00R.A00) goto L_0x025c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x033c, code lost:
        X.C17900vP.A0f("VerifyPhoneNumber/onVerifyGenericCodeErrorTemporarilyUnavailable/method=", r7, X.AnonymousClass000.A10());
        X.A9B.A0U(r11.A0A, "server-send-error-temporarily-unavailable");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0350, code lost:
        if (X.AnonymousClass8BR.A1W(r7) == false) goto L_0x0357;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0352, code lost:
        r0 = 2131895030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0357, code lost:
        if (r9 != null) goto L_0x0435;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0359, code lost:
        r0 = "VerifyPhoneNumber/verifysms/error/temp-unavail/saved-code-is-null";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x035e, code lost:
        if (r8 != X.AnonymousClass00R.A0A) goto L_0x0365;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0360, code lost:
        A1B();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0367, code lost:
        if (r8 != X.AnonymousClass00R.A04) goto L_0x036e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0369, code lost:
        A1Q(r15, r11, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0370, code lost:
        if (r8 == X.AnonymousClass00R.A06) goto L_0x0469;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0374, code lost:
        if (r8 == X.AnonymousClass00R.A07) goto L_0x0469;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0378, code lost:
        if (r8 != X.AnonymousClass00R.A08) goto L_0x037f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x037a, code lost:
        A1v(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x037f, code lost:
        r11.A0v.A05();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0386, code lost:
        if (r8 != X.AnonymousClass00R.A18) goto L_0x03ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0079, code lost:
        if (r8 == X.AnonymousClass00R.A01) goto L_0x025c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0388, code lost:
        com.whatsapp.util.Log.i("VerifyPhoneNumber/onVerifyGenericCodeErrorMissing");
        X.A9B.A0U(r11.A0A, "server-send-missing");
        A18();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0399, code lost:
        if (r8 != X.AnonymousClass00R.A03) goto L_0x0324;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x039b, code lost:
        r3 = r15.A04;
        r2 = r15.A05;
        com.whatsapp.util.Log.i("VerifyPhoneNumber/onVerifyGenericCodeErrorBlocked");
        r11.A0u.A02(12);
        X.A9B.A0U(r11.A0A, "server-send-blocked");
        A1O(r3, r2);
        A1A();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x03bc, code lost:
        if (r8 != X.AnonymousClass00R.A0u) goto L_0x03ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x03be, code lost:
        com.whatsapp.util.Log.i("VerifyPhoneNumber/onVerifyGenericCodeErrorTooManyGuesses");
        X.A9B.A0U(r11.A0A, "server-send-too-many-guesses");
        X.C166988f1.A0w(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x03d0, code lost:
        if (r8 != X.AnonymousClass00R.A0N) goto L_0x03e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x03d2, code lost:
        com.whatsapp.util.Log.i("VerifyPhoneNumber/onVerifyGenericCodeErrorUnspecified");
        X.A9B.A0U(r11.A0A, "server-send-error-unspecified");
        A1z(true);
        A1H(109);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x03ea, code lost:
        if (r8 != X.AnonymousClass00R.A19) goto L_0x0397;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x03ec, code lost:
        X.C17900vP.A0f("VerifyPhoneNumber/onVerifyGenericCodeErrorStale/method=", r7, X.AnonymousClass000.A10());
        X.A9B.A0U(r11.A0A, "server-send-error-stale");
        A18();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0403, code lost:
        if (X.AnonymousClass8BR.A1W(r7) != false) goto L_0x040a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x0405, code lost:
        r0 = 2131895028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x0408, code lost:
        if (r3 == false) goto L_0x040d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x040a, code lost:
        r0 = 2131897762;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x040d, code lost:
        A1w(getString(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x0415, code lost:
        A18();
        r0 = 2131894990;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x041b, code lost:
        r0 = getString(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x007d, code lost:
        if (r8 != X.AnonymousClass00R.A04) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x0421, code lost:
        if (r9 != null) goto L_0x0435;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x0423, code lost:
        com.whatsapp.util.Log.e("VerifyPhoneNumber/verifysms/error/connectivity/saved-code-is-null");
        r11.A0u.A02(4);
        A1G(21);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x0435, code lost:
        r4 = java.lang.Math.random();
        r1 = r11.A01;
        r11.A01 = r1 + 1;
        r10 = (int) (r4 * ((java.lang.Math.pow(2.0d, (double) r1) - 1.0d) * 4000.0d));
        X.C17900vP.A0j("VerifyPhoneNumber/verifysms/schedule-retry/", X.AnonymousClass000.A10(), r10);
        r11.A0t.sendMessageDelayed(r11.A0t.obtainMessage(1, r9), (long) r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x0469, code lost:
        A1S(r15, "sms");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x0470, code lost:
        A1R(r15, r11, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x007f, code lost:
        A1Q(r15, r11, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0082, code lost:
        A1x(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0085, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0088, code lost:
        if (r8 == X.AnonymousClass00R.A06) goto L_0x0257;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x008c, code lost:
        if (r8 == X.AnonymousClass00R.A07) goto L_0x0257;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x008e, code lost:
        r1 = X.AnonymousClass000.A10();
        X.C17890vO.A10("VerifyPhoneNumber/onVerifyVoiceOrFlashError/method=", r7, "/status=", r1);
        X.C17890vO.A1A(r1, X.C181679Rk.A00(r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a0, code lost:
        if (r8 != X.AnonymousClass00R.A0C) goto L_0x00c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a2, code lost:
        A4f();
        X.C181689Rl.A00(r11.A05);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b6, code lost:
        r11.A0A.A1e("secondary_failed");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00bd, code lost:
        A1m(r11, -1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c4, code lost:
        if (r8 != X.AnonymousClass00R.A0j) goto L_0x00ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00c6, code lost:
        A1T(r15, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00cc, code lost:
        if (r8 != X.AnonymousClass00R.A0N) goto L_0x00dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ce, code lost:
        com.whatsapp.util.Log.i("VerifyPhoneNumber/onVerifyVoiceOrFlashErrorUnspecified");
        A1z(true);
        A1H(109);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00df, code lost:
        if (r8 != X.AnonymousClass00R.A18) goto L_0x0107;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00e1, code lost:
        com.whatsapp.util.Log.i("VerifyPhoneNumber/onVerifyVoiceOrFlashErrorMissing");
        A18();
        r3 = 2131897763;
        r2 = X.AnonymousClass3MW.A1b();
        r2[0] = A17(r11);
        r1 = getString(2131897815);
        r0 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ff, code lost:
        r0 = X.C17880vN.A0q(r11, r1, r2, r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0103, code lost:
        A1w(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0109, code lost:
        if (r8 != X.AnonymousClass00R.A0u) goto L_0x012a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x010b, code lost:
        r1 = X.AnonymousClass000.A10();
        r1.append("VerifyPhoneNumber/onVerifyVoiceOrFlashErrorTooManyGuesses/retryAfter=");
        X.C17890vO.A1A(r1, r15.A0C);
        X.C166988f1.A0w(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0124, code lost:
        if (A20(r15.A0C) != false) goto L_0x021f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0126, code lost:
        A1H(28);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x012c, code lost:
        if (r8 != X.AnonymousClass00R.A15) goto L_0x0181;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x012e, code lost:
        r1 = X.AnonymousClass000.A10();
        r1.append("VerifyPhoneNumber/onVerifyVoiceOrFlashErrorGuessedTooFast/retryAfter=");
        X.C17890vO.A19(r1, r15.A0C);
        A18();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0145, code lost:
        if (A20(r15.A0C) != false) goto L_0x014f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0147, code lost:
        r0 = 2131894990;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x014a, code lost:
        r0 = getString(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:?, code lost:
        r1 = X.AnonymousClass8BW.A08(r15.A0C);
        r11.A0j.A0C(r1);
        A1w(getString(2131894991, new java.lang.Object[]{X.C64052u8.A0A(r11.A00, r1)}));
        r11.A0n.A0U(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0177, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0178, code lost:
        com.whatsapp.util.Log.w("VerifyPhoneNumber/verifyvoice/verifyvoice/guessed-too-fast/unable-to-parse-retryAfter", r1);
        r0 = 2131894990;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0183, code lost:
        if (r8 != X.AnonymousClass00R.A0Y) goto L_0x019d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0185, code lost:
        com.whatsapp.util.Log.i("VerifyPhoneNumber/onVerifyVoiceOrFlashErrorConnectivity");
        A1z(true);
        r3 = 2131894981;
        r2 = new java.lang.Object[1];
        r1 = getString(2131888733);
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x019f, code lost:
        if (r8 != X.AnonymousClass00R.A03) goto L_0x01b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01a1, code lost:
        r3 = r15.A04;
        r2 = r15.A05;
        com.whatsapp.util.Log.i("VerifyPhoneNumber/onVerifyVoiceOrFlashErrorBlocked");
        r11.A0u.A02(12);
        A1O(r3, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01b8, code lost:
        if (r8 != X.AnonymousClass00R.A19) goto L_0x01c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01ba, code lost:
        com.whatsapp.util.Log.i("VerifyPhoneNumber/onVerifyVoiceOrFlashErrorStale");
        A18();
        r0 = 2131895028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01c8, code lost:
        if (r8 != X.AnonymousClass00R.A02) goto L_0x0245;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01ca, code lost:
        r1 = X.AnonymousClass000.A10();
        r1.append("VerifyPhoneNumber/onVerifyVoiceOrFlashErrorTemporarilyUnavailable/retryAfter=");
        X.C17890vO.A1A(r1, r15.A0C);
        X.A9B.A0U(r11.A0A, "voice-temporarily-unavailable");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01e5, code lost:
        if (A20(r15.A0C) != false) goto L_0x01ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01e7, code lost:
        r0 = 2131895030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:?, code lost:
        r1 = X.AnonymousClass8BW.A08(r15.A0C);
        r11.A0j.A0C(r1);
        A1w(getString(2131895031, new java.lang.Object[]{X.C64052u8.A0A(r11.A00, r1)}));
        r11.A0n.A0U(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0214, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0215, code lost:
        com.whatsapp.util.Log.w("VerifyPhoneNumber/verifyvoice/verifyvoice/unable-to-parse-retryAfter", r1);
        r0 = 2131895030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:?, code lost:
        r1 = X.AnonymousClass8BW.A08(r15.A0C);
        r11.A0B = r1;
        r11.A0j.A0C(r1);
        A1H(32);
        r11.A0n.A0U(r11.A0B);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x023a, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x023b, code lost:
        com.whatsapp.util.Log.w("VerifyPhoneNumber/verifyvoice/verifyvoice/too-many-guesses/unable-to-parse-retryAfter", r1);
        A1H(28);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0247, code lost:
        if (r8 != X.AnonymousClass00R.A0A) goto L_0x024e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0249, code lost:
        A1B();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0250, code lost:
        if (r8 != X.AnonymousClass00R.A08) goto L_0x00aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0252, code lost:
        A1v(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0257, code lost:
        A1S(r15, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x025c, code lost:
        A1R(r15, r11, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0267, code lost:
        if (r7.equals(r0) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0269, code lost:
        r1 = X.AnonymousClass000.A10();
        r1.append("VerifyPhoneNumber/onVerifyGenericCodeResponse/method=");
        r1.append(r7);
        r1.append("/status=");
        X.C17890vO.A1A(r1, X.C181679Rk.A00(r8));
        A4f();
        r3 = X.AnonymousClass8BR.A1X(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0288, code lost:
        if (r3 == false) goto L_0x0295;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x028c, code lost:
        if (r8 == X.AnonymousClass00R.A04) goto L_0x0295;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x028e, code lost:
        r11.A0A.A1Y("email_otp_verification_failed");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0295, code lost:
        r6 = X.AnonymousClass00R.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0297, code lost:
        if (r8 == r6) goto L_0x0470;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A4i(X.C188779hy r20, java.lang.Integer r21, java.lang.String r22) {
        /*
            r19 = this;
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "VerifyPhoneNumber/onRegisterEntrypointResponse method= "
            r1.append(r0)
            r7 = r22
            r1.append(r7)
            java.lang.String r0 = " status= "
            r1.append(r0)
            r8 = r21
            java.lang.String r0 = X.C181679Rk.A00(r8)
            X.C17890vO.A1A(r1, r0)
            java.lang.Integer r0 = X.AnonymousClass00R.A09
            r11 = r19
            r15 = r20
            if (r8 != r0) goto L_0x0040
            X.1CM r2 = r11.A07
            X.00H r0 = r11.A1B
            java.lang.Object r13 = r0.get()
            X.8BA r13 = (X.AnonymousClass8BA) r13
            X.1LU r14 = r11.A0d
            X.00H r1 = r11.A18
            X.0z4 r12 = r11.A0A
            X.10I r0 = r11.A05
            r18 = r1
            r16 = r2
            r17 = r0
            X.A80.A03(r11, r12, r13, r14, r15, r16, r17, r18)
        L_0x003f:
            return
        L_0x0040:
            int r0 = r7.hashCode()
            switch(r0) {
                case -795576526: goto L_0x0048;
                case 114009: goto L_0x004c;
                case 97513456: goto L_0x0050;
                case 112386354: goto L_0x0053;
                case 2120743944: goto L_0x0261;
                default: goto L_0x0047;
            }
        L_0x0047:
            return
        L_0x0048:
            java.lang.String r0 = "wa_old"
            goto L_0x0263
        L_0x004c:
            java.lang.String r0 = "sms"
            goto L_0x0263
        L_0x0050:
            java.lang.String r0 = "flash"
            goto L_0x0055
        L_0x0053:
            java.lang.String r0 = "voice"
        L_0x0055:
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x003f
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "VerifyPhoneNumber/onVerifyVoiceOrFlashResponse/method="
            r1.append(r0)
            r1.append(r7)
            java.lang.String r2 = "/status="
            r1.append(r2)
            java.lang.String r0 = X.C181679Rk.A00(r8)
            X.C17890vO.A1A(r1, r0)
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            if (r8 == r0) goto L_0x025c
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            if (r8 == r0) goto L_0x025c
            java.lang.Integer r0 = X.AnonymousClass00R.A04
            if (r8 != r0) goto L_0x0086
            A1Q(r15, r11, r7)
        L_0x0082:
            r11.A1x(r7)
            return
        L_0x0086:
            java.lang.Integer r0 = X.AnonymousClass00R.A06
            if (r8 == r0) goto L_0x0257
            java.lang.Integer r0 = X.AnonymousClass00R.A07
            if (r8 == r0) goto L_0x0257
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "VerifyPhoneNumber/onVerifyVoiceOrFlashError/method="
            X.C17890vO.A10(r0, r7, r2, r1)
            java.lang.String r0 = X.C181679Rk.A00(r8)
            X.C17890vO.A1A(r1, r0)
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            if (r8 != r0) goto L_0x00c2
            r11.A4f()
            X.1KB r0 = r11.A05
            X.C181689Rl.A00(r0)
        L_0x00aa:
            boolean r0 = X.AnonymousClass8BR.A1V(r7)
            if (r0 == 0) goto L_0x00bd
            boolean r0 = X.AnonymousClass8BR.A1M(r11)
            if (r0 != 0) goto L_0x00bd
            X.0z4 r1 = r11.A0A
            java.lang.String r0 = "secondary_failed"
            r1.A1e(r0)
        L_0x00bd:
            r0 = -1
            A1m(r11, r0)
            goto L_0x0082
        L_0x00c2:
            java.lang.Integer r0 = X.AnonymousClass00R.A0j
            if (r8 != r0) goto L_0x00ca
            r11.A1T(r15, r7)
            goto L_0x00aa
        L_0x00ca:
            java.lang.Integer r0 = X.AnonymousClass00R.A0N
            if (r8 != r0) goto L_0x00dd
            java.lang.String r0 = "VerifyPhoneNumber/onVerifyVoiceOrFlashErrorUnspecified"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 1
            r11.A1z(r0)
            r0 = 109(0x6d, float:1.53E-43)
            r11.A1H(r0)
            goto L_0x00aa
        L_0x00dd:
            java.lang.Integer r0 = X.AnonymousClass00R.A18
            if (r8 != r0) goto L_0x0107
            java.lang.String r0 = "VerifyPhoneNumber/onVerifyVoiceOrFlashErrorMissing"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r11.A18()
            r3 = 2131897763(0x7f122da3, float:1.9430425E38)
            java.lang.Object[] r2 = X.AnonymousClass3MW.A1b()
            r1 = 0
            java.lang.String r0 = A17(r11)
            r2[r1] = r0
            r0 = 2131897815(0x7f122dd7, float:1.943053E38)
            java.lang.String r1 = r11.getString(r0)
            r0 = 1
        L_0x00ff:
            java.lang.String r0 = X.C17880vN.A0q(r11, r1, r2, r0, r3)
        L_0x0103:
            r11.A1w(r0)
            goto L_0x00aa
        L_0x0107:
            java.lang.Integer r0 = X.AnonymousClass00R.A0u
            if (r8 != r0) goto L_0x012a
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "VerifyPhoneNumber/onVerifyVoiceOrFlashErrorTooManyGuesses/retryAfter="
            r1.append(r0)
            java.lang.String r0 = r15.A0C
            X.C17890vO.A1A(r1, r0)
            X.C166988f1.A0w(r11)
            java.lang.String r0 = r15.A0C
            boolean r0 = A20(r0)
            r3 = 28
            if (r0 != 0) goto L_0x021f
            r11.A1H(r3)
            goto L_0x00aa
        L_0x012a:
            java.lang.Integer r0 = X.AnonymousClass00R.A15
            if (r8 != r0) goto L_0x0181
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "VerifyPhoneNumber/onVerifyVoiceOrFlashErrorGuessedTooFast/retryAfter="
            r1.append(r0)
            java.lang.String r0 = r15.A0C
            X.C17890vO.A19(r1, r0)
            r11.A18()
            java.lang.String r0 = r15.A0C
            boolean r0 = A20(r0)
            if (r0 != 0) goto L_0x014f
            r0 = 2131894990(0x7f1222ce, float:1.94248E38)
        L_0x014a:
            java.lang.String r0 = r11.getString(r0)
            goto L_0x0103
        L_0x014f:
            java.lang.String r0 = r15.A0C     // Catch:{ NumberFormatException -> 0x0177 }
            long r1 = X.AnonymousClass8BW.A08(r0)     // Catch:{ NumberFormatException -> 0x0177 }
            X.1jT r0 = r11.A0j     // Catch:{ NumberFormatException -> 0x0177 }
            r0.A0C(r1)     // Catch:{ NumberFormatException -> 0x0177 }
            r5 = 2131894991(0x7f1222cf, float:1.9424802E38)
            r0 = 1
            java.lang.Object[] r4 = new java.lang.Object[r0]     // Catch:{ NumberFormatException -> 0x0177 }
            X.0vb r0 = r11.A00     // Catch:{ NumberFormatException -> 0x0177 }
            java.lang.String r3 = X.C64052u8.A0A(r0, r1)     // Catch:{ NumberFormatException -> 0x0177 }
            r0 = 0
            r4[r0] = r3     // Catch:{ NumberFormatException -> 0x0177 }
            java.lang.String r0 = r11.getString(r5, r4)     // Catch:{ NumberFormatException -> 0x0177 }
            r11.A1w(r0)     // Catch:{ NumberFormatException -> 0x0177 }
            com.whatsapp.registration.entercode.EnterCodeViewModel r0 = r11.A0n     // Catch:{ NumberFormatException -> 0x0177 }
            r0.A0U(r1)     // Catch:{ NumberFormatException -> 0x0177 }
            goto L_0x00aa
        L_0x0177:
            r1 = move-exception
            java.lang.String r0 = "VerifyPhoneNumber/verifyvoice/verifyvoice/guessed-too-fast/unable-to-parse-retryAfter"
            com.whatsapp.util.Log.w(r0, r1)
            r0 = 2131894990(0x7f1222ce, float:1.94248E38)
            goto L_0x014a
        L_0x0181:
            java.lang.Integer r0 = X.AnonymousClass00R.A0Y
            if (r8 != r0) goto L_0x019d
            java.lang.String r0 = "VerifyPhoneNumber/onVerifyVoiceOrFlashErrorConnectivity"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 1
            r11.A1z(r0)
            r3 = 2131894981(0x7f1222c5, float:1.9424782E38)
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r0 = 2131888733(0x7f120a5d, float:1.941211E38)
            java.lang.String r1 = r11.getString(r0)
            r0 = 0
            goto L_0x00ff
        L_0x019d:
            java.lang.Integer r0 = X.AnonymousClass00R.A03
            if (r8 != r0) goto L_0x01b6
            X.ADM r3 = r15.A04
            X.2mr r2 = r15.A05
            java.lang.String r0 = "VerifyPhoneNumber/onVerifyVoiceOrFlashErrorBlocked"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.A10 r1 = r11.A0u
            r0 = 12
            r1.A02(r0)
            r11.A1O(r3, r2)
            goto L_0x00aa
        L_0x01b6:
            java.lang.Integer r0 = X.AnonymousClass00R.A19
            if (r8 != r0) goto L_0x01c6
            java.lang.String r0 = "VerifyPhoneNumber/onVerifyVoiceOrFlashErrorStale"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r11.A18()
            r0 = 2131895028(0x7f1222f4, float:1.9424877E38)
            goto L_0x014a
        L_0x01c6:
            java.lang.Integer r0 = X.AnonymousClass00R.A02
            if (r8 != r0) goto L_0x0245
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "VerifyPhoneNumber/onVerifyVoiceOrFlashErrorTemporarilyUnavailable/retryAfter="
            r1.append(r0)
            java.lang.String r0 = r15.A0C
            X.C17890vO.A1A(r1, r0)
            X.0z4 r1 = r11.A0A
            java.lang.String r0 = "voice-temporarily-unavailable"
            X.A9B.A0U(r1, r0)
            java.lang.String r0 = r15.A0C
            boolean r0 = A20(r0)
            if (r0 != 0) goto L_0x01ec
            r0 = 2131895030(0x7f1222f6, float:1.9424881E38)
            goto L_0x014a
        L_0x01ec:
            java.lang.String r0 = r15.A0C     // Catch:{ NumberFormatException -> 0x0214 }
            long r1 = X.AnonymousClass8BW.A08(r0)     // Catch:{ NumberFormatException -> 0x0214 }
            X.1jT r0 = r11.A0j     // Catch:{ NumberFormatException -> 0x0214 }
            r0.A0C(r1)     // Catch:{ NumberFormatException -> 0x0214 }
            r5 = 2131895031(0x7f1222f7, float:1.9424884E38)
            r0 = 1
            java.lang.Object[] r4 = new java.lang.Object[r0]     // Catch:{ NumberFormatException -> 0x0214 }
            X.0vb r0 = r11.A00     // Catch:{ NumberFormatException -> 0x0214 }
            java.lang.String r3 = X.C64052u8.A0A(r0, r1)     // Catch:{ NumberFormatException -> 0x0214 }
            r0 = 0
            r4[r0] = r3     // Catch:{ NumberFormatException -> 0x0214 }
            java.lang.String r0 = r11.getString(r5, r4)     // Catch:{ NumberFormatException -> 0x0214 }
            r11.A1w(r0)     // Catch:{ NumberFormatException -> 0x0214 }
            com.whatsapp.registration.entercode.EnterCodeViewModel r0 = r11.A0n     // Catch:{ NumberFormatException -> 0x0214 }
            r0.A0U(r1)     // Catch:{ NumberFormatException -> 0x0214 }
            goto L_0x00aa
        L_0x0214:
            r1 = move-exception
            java.lang.String r0 = "VerifyPhoneNumber/verifyvoice/verifyvoice/unable-to-parse-retryAfter"
            com.whatsapp.util.Log.w(r0, r1)
            r0 = 2131895030(0x7f1222f6, float:1.9424881E38)
            goto L_0x014a
        L_0x021f:
            java.lang.String r0 = r15.A0C     // Catch:{ NumberFormatException -> 0x023a }
            long r1 = X.AnonymousClass8BW.A08(r0)     // Catch:{ NumberFormatException -> 0x023a }
            r11.A0B = r1     // Catch:{ NumberFormatException -> 0x023a }
            X.1jT r0 = r11.A0j     // Catch:{ NumberFormatException -> 0x023a }
            r0.A0C(r1)     // Catch:{ NumberFormatException -> 0x023a }
            r0 = 32
            r11.A1H(r0)     // Catch:{ NumberFormatException -> 0x023a }
            com.whatsapp.registration.entercode.EnterCodeViewModel r2 = r11.A0n     // Catch:{ NumberFormatException -> 0x023a }
            long r0 = r11.A0B     // Catch:{ NumberFormatException -> 0x023a }
            r2.A0U(r0)     // Catch:{ NumberFormatException -> 0x023a }
            goto L_0x00aa
        L_0x023a:
            r1 = move-exception
            java.lang.String r0 = "VerifyPhoneNumber/verifyvoice/verifyvoice/too-many-guesses/unable-to-parse-retryAfter"
            com.whatsapp.util.Log.w(r0, r1)
            r11.A1H(r3)
            goto L_0x00aa
        L_0x0245:
            java.lang.Integer r0 = X.AnonymousClass00R.A0A
            if (r8 != r0) goto L_0x024e
            r11.A1B()
            goto L_0x00aa
        L_0x024e:
            java.lang.Integer r0 = X.AnonymousClass00R.A08
            if (r8 != r0) goto L_0x00aa
            r11.A1v(r7)
            goto L_0x00aa
        L_0x0257:
            r11.A1S(r15, r7)
            goto L_0x0082
        L_0x025c:
            A1R(r15, r11, r7)
            goto L_0x0082
        L_0x0261:
            java.lang.String r0 = "email_otp"
        L_0x0263:
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x003f
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "VerifyPhoneNumber/onVerifyGenericCodeResponse/method="
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = "/status="
            r1.append(r0)
            java.lang.String r0 = X.C181679Rk.A00(r8)
            X.C17890vO.A1A(r1, r0)
            r11.A4f()
            boolean r3 = X.AnonymousClass8BR.A1X(r7)
            if (r3 == 0) goto L_0x0295
            java.lang.Integer r0 = X.AnonymousClass00R.A04
            if (r8 == r0) goto L_0x0295
            X.0z4 r1 = r11.A0A
            java.lang.String r0 = "email_otp_verification_failed"
            r1.A1Y(r0)
        L_0x0295:
            java.lang.Integer r6 = X.AnonymousClass00R.A00
            if (r8 == r6) goto L_0x0470
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            if (r8 == r0) goto L_0x0470
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            if (r8 != r0) goto L_0x02c6
            r11.A4f()
            X.1KB r0 = r11.A05
            X.C181689Rl.A00(r0)
        L_0x02a9:
            boolean r0 = X.AnonymousClass8BR.A1W(r7)
            if (r0 == 0) goto L_0x003f
            if (r8 == r6) goto L_0x02c1
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            if (r8 == r0) goto L_0x02c1
            java.lang.Integer r0 = X.AnonymousClass00R.A04
            if (r8 == r0) goto L_0x02c1
            X.0z4 r1 = r11.A0A
            java.lang.String r0 = "wa_old_failed"
        L_0x02bd:
            r1.A1j(r0)
            return
        L_0x02c1:
            X.0z4 r1 = r11.A0A
            java.lang.String r0 = "wa_old_successful"
            goto L_0x02bd
        L_0x02c6:
            java.lang.Integer r0 = X.AnonymousClass00R.A0j
            if (r8 != r0) goto L_0x02ce
            r11.A1T(r15, r7)
            goto L_0x02a9
        L_0x02ce:
            X.A5R r2 = r11.A0v
            java.lang.String r1 = r11.A1H
            java.lang.String r0 = r11.A1J
            java.lang.String r9 = r2.A03(r1, r0)
            java.lang.Integer r0 = X.AnonymousClass00R.A0Y
            if (r8 != r0) goto L_0x0301
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "VerifyPhoneNumber/onVerifyGenericCodeErrorConnectivity/method="
            X.C17900vP.A0f(r0, r7, r1)
            boolean r0 = X.AnonymousClass8BR.A1W(r7)
            if (r0 == 0) goto L_0x0421
            r2 = 2131894981(0x7f1222c5, float:1.9424782E38)
            java.lang.Object[] r1 = X.AnonymousClass3MW.A1a()
            r0 = 2131888733(0x7f120a5d, float:1.941211E38)
            java.lang.String r0 = r11.getString(r0)
            java.lang.String r0 = X.C108975cc.A0b(r11, r0, r1, r2)
        L_0x02fd:
            r11.A1w(r0)
            goto L_0x02a9
        L_0x0301:
            java.lang.Integer r0 = X.AnonymousClass00R.A15
            if (r8 != r0) goto L_0x0338
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "VerifyPhoneNumber/onVerifyGenericCodeErrorGuessedTooFast/method="
            X.C17900vP.A0f(r0, r7, r1)
            X.0z4 r1 = r11.A0A
            java.lang.String r0 = "server-send-guessed-too-fast"
            X.A9B.A0U(r1, r0)
            boolean r0 = X.AnonymousClass8BR.A1W(r7)
            if (r0 != 0) goto L_0x0415
            if (r3 != 0) goto L_0x0415
            if (r9 != 0) goto L_0x0435
            java.lang.String r0 = "VerifyPhoneNumber/verifysms/error/too-fast/saved-code-is-null"
        L_0x0321:
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0324:
            X.9uO r0 = r11.A0h
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x0330
            boolean r0 = r11.Bed()
            if (r0 == 0) goto L_0x02a9
        L_0x0330:
            X.1Vn r1 = r11.A0X
            r0 = -1
            X.A9B.A0O(r11, r1, r0)
            goto L_0x02a9
        L_0x0338:
            java.lang.Integer r0 = X.AnonymousClass00R.A02
            if (r8 != r0) goto L_0x035c
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "VerifyPhoneNumber/onVerifyGenericCodeErrorTemporarilyUnavailable/method="
            X.C17900vP.A0f(r0, r7, r1)
            X.0z4 r1 = r11.A0A
            java.lang.String r0 = "server-send-error-temporarily-unavailable"
            X.A9B.A0U(r1, r0)
            boolean r0 = X.AnonymousClass8BR.A1W(r7)
            if (r0 == 0) goto L_0x0357
            r0 = 2131895030(0x7f1222f6, float:1.9424881E38)
            goto L_0x041b
        L_0x0357:
            if (r9 != 0) goto L_0x0435
            java.lang.String r0 = "VerifyPhoneNumber/verifysms/error/temp-unavail/saved-code-is-null"
            goto L_0x0321
        L_0x035c:
            java.lang.Integer r0 = X.AnonymousClass00R.A0A
            if (r8 != r0) goto L_0x0365
            r11.A1B()
            goto L_0x02a9
        L_0x0365:
            java.lang.Integer r0 = X.AnonymousClass00R.A04
            if (r8 != r0) goto L_0x036e
            A1Q(r15, r11, r7)
            goto L_0x02a9
        L_0x036e:
            java.lang.Integer r0 = X.AnonymousClass00R.A06
            if (r8 == r0) goto L_0x0469
            java.lang.Integer r0 = X.AnonymousClass00R.A07
            if (r8 == r0) goto L_0x0469
            java.lang.Integer r0 = X.AnonymousClass00R.A08
            if (r8 != r0) goto L_0x037f
            r11.A1v(r7)
            goto L_0x02a9
        L_0x037f:
            X.A5R r0 = r11.A0v
            r0.A05()
            java.lang.Integer r0 = X.AnonymousClass00R.A18
            if (r8 != r0) goto L_0x03ba
            java.lang.String r0 = "VerifyPhoneNumber/onVerifyGenericCodeErrorMissing"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0z4 r1 = r11.A0A
            java.lang.String r0 = "server-send-missing"
            X.A9B.A0U(r1, r0)
            r11.A18()
        L_0x0397:
            java.lang.Integer r0 = X.AnonymousClass00R.A03
            if (r8 != r0) goto L_0x0324
            X.ADM r3 = r15.A04
            X.2mr r2 = r15.A05
            java.lang.String r0 = "VerifyPhoneNumber/onVerifyGenericCodeErrorBlocked"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.A10 r1 = r11.A0u
            r0 = 12
            r1.A02(r0)
            X.0z4 r1 = r11.A0A
            java.lang.String r0 = "server-send-blocked"
            X.A9B.A0U(r1, r0)
            r11.A1O(r3, r2)
            r11.A1A()
            goto L_0x02a9
        L_0x03ba:
            java.lang.Integer r0 = X.AnonymousClass00R.A0u
            if (r8 != r0) goto L_0x03ce
            java.lang.String r0 = "VerifyPhoneNumber/onVerifyGenericCodeErrorTooManyGuesses"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0z4 r1 = r11.A0A
            java.lang.String r0 = "server-send-too-many-guesses"
            X.A9B.A0U(r1, r0)
            X.C166988f1.A0w(r11)
            goto L_0x0397
        L_0x03ce:
            java.lang.Integer r0 = X.AnonymousClass00R.A0N
            if (r8 != r0) goto L_0x03e8
            java.lang.String r0 = "VerifyPhoneNumber/onVerifyGenericCodeErrorUnspecified"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0z4 r1 = r11.A0A
            java.lang.String r0 = "server-send-error-unspecified"
            X.A9B.A0U(r1, r0)
            r0 = 1
            r11.A1z(r0)
            r0 = 109(0x6d, float:1.53E-43)
            r11.A1H(r0)
            goto L_0x0397
        L_0x03e8:
            java.lang.Integer r0 = X.AnonymousClass00R.A19
            if (r8 != r0) goto L_0x0397
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "VerifyPhoneNumber/onVerifyGenericCodeErrorStale/method="
            X.C17900vP.A0f(r0, r7, r1)
            X.0z4 r1 = r11.A0A
            java.lang.String r0 = "server-send-error-stale"
            X.A9B.A0U(r1, r0)
            r11.A18()
            boolean r0 = X.AnonymousClass8BR.A1W(r7)
            if (r0 != 0) goto L_0x040a
            r0 = 2131895028(0x7f1222f4, float:1.9424877E38)
            if (r3 == 0) goto L_0x040d
        L_0x040a:
            r0 = 2131897762(0x7f122da2, float:1.9430423E38)
        L_0x040d:
            java.lang.String r0 = r11.getString(r0)
            r11.A1w(r0)
            goto L_0x0397
        L_0x0415:
            r11.A18()
            r0 = 2131894990(0x7f1222ce, float:1.94248E38)
        L_0x041b:
            java.lang.String r0 = r11.getString(r0)
            goto L_0x02fd
        L_0x0421:
            if (r9 != 0) goto L_0x0435
            java.lang.String r0 = "VerifyPhoneNumber/verifysms/error/connectivity/saved-code-is-null"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.A10 r1 = r11.A0u
            r0 = 4
            r1.A02(r0)
            r0 = 21
            r11.A1G(r0)
            goto L_0x02a9
        L_0x0435:
            double r4 = java.lang.Math.random()
            int r1 = r11.A01
            int r0 = r1 + 1
            r11.A01 = r0
            double r2 = (double) r1
            r0 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r2 = java.lang.Math.pow(r0, r2)
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r2 = r2 - r0
            r0 = 4661014508095930368(0x40af400000000000, double:4000.0)
            double r2 = r2 * r0
            double r4 = r4 * r2
            int r10 = (int) r4
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "VerifyPhoneNumber/verifysms/schedule-retry/"
            X.C17900vP.A0j(r0, r1, r10)
            X.8Ck r1 = r11.A0t
            r0 = 1
            android.os.Message r3 = r1.obtainMessage(r0, r9)
            X.8Ck r2 = r11.A0t
            long r0 = (long) r10
            r2.sendMessageDelayed(r3, r0)
            goto L_0x02a9
        L_0x0469:
            java.lang.String r0 = "sms"
            r11.A1S(r15, r0)
            goto L_0x02a9
        L_0x0470:
            A1R(r15, r11, r7)
            goto L_0x02a9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.verifyphone.VerifyPhoneNumber.A4i(X.9hy, java.lang.Integer, java.lang.String):void");
    }

    public void A4n(boolean z) {
        int i;
        if (!C19963A0w.A00(this) || (i = this.A00) == 2 || i == 3) {
            AnonymousClass99K r4 = this.A0w.A02;
            AnonymousClass3MX.A1Q(new EmailOtpUseCase$requestEmailOtp$1(r4, new C194099rA(z, C166988f1.A03(this)), (C30391dr) null), AnonymousClass2SS.A00(this));
            return;
        }
        Log.w("VerifyPhoneNumber/executeRequestCodeTask should not request code yet, returning");
    }

    public void A4p(boolean z) {
        int i;
        if (!C19963A0w.A00(this) || (i = this.A00) == 2 || i == 3) {
            AnonymousClass99J r5 = this.A0w.A01;
            AnonymousClass3MX.A1Q(new DeviceSwitchingUseCase$requestWaOldCode$1(r5, new C194649s4(A9B.A0B(this.A0A, this.A00), C166988f1.A03(this), z), (C30391dr) null), AnonymousClass2SS.A00(this));
            return;
        }
        Log.w("VerifyPhoneNumber/executeRequestCodeTask should not request code yet, returning");
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        String str;
        super.onActivityResult(i, i2, intent);
        if (i == 700) {
            if (i2 == -1) {
                Log.i("VerifyPhoneNumber/activity-result/permission-accepted/request-flash");
                A19();
                return;
            }
            Log.i("VerifyPhoneNumber/activity-result/permission-declined/request-voice");
            this.A0r.A00("flash");
            AnonymousClass99F A0B2 = A9B.A0B(this.A0A, this.A00);
            if (this.A0A.A2O()) {
                A0B2.A02 = true;
            }
            A0B2.A00 = false;
            A1b(A0B2, true);
        } else if (i == 701) {
            StringBuilder A102 = AnonymousClass000.A10();
            A102.append("VerifyPhoneNumber/activity-result/request-sms-permissions/");
            if (i2 == -1) {
                str = "granted";
            } else {
                str = "denied";
            }
            C17890vO.A1A(A102, str);
            this.A1Z = false;
            A1p(this, C17900vP.A01(C108945cZ.A1E("sms", this.A0s.A04)), C17900vP.A01(C108945cZ.A1E("voice", this.A0s.A04)));
        }
    }

    public void onBackPressed() {
        Intent A042;
        AnonymousClass8BU.A0d(this).A0I(A16(this), "back");
        if (this.A1i) {
            Log.i("VerifyPhoneNumber/onBackPressed/is adding new account");
            A9B.A0S(this, this.A12);
        } else if (this.A0b.A02(11568) || (!AnonymousClass8BR.A1N(this) && !AnonymousClass8BR.A1O(this))) {
            if (this.A07.A06()) {
                Log.i("VerifyPhoneNumber/returnTo2Fac");
                this.A07.A01(18);
                A3q(AnonymousClass1LU.A1o(this, this.A1N, false), false);
            } else {
                int i = this.A02;
                if (i == 2 || i == 4 || i == 5) {
                    super.onBackPressed();
                    return;
                } else if (this.A0b.A02(11568)) {
                    AnonymousClass8BU.A0d(this).A0B(A16(this));
                    Log.i("VerifyPhoneNumber/returnToEnterPhoneNumberWithoutReset");
                    if (this.A1N) {
                        Log.i("VerifyPhoneNumber/returnToEnterPhoneNumberWithoutReset/change number flow");
                        C33841jT.A03(this.A0j, 3, true);
                        if (this.A0j.A0F()) {
                            A042 = AnonymousClass8BX.A0A(this);
                        }
                    } else {
                        Log.i("VerifyPhoneNumber/returnToEnterPhoneNumberWithoutReset/back nav flow");
                        C33841jT.A03(this.A0j, 1, true);
                        A042 = AnonymousClass1LU.A04(this);
                        A042.putExtra("com.whatsapp.registration.RegisterPhone.phone_number", this.A0A.A0n());
                        A042.putExtra("com.whatsapp.registration.RegisterPhone.country_code", this.A0A.A0l());
                        A042.putExtra("should_show_dbs_on_back_pressed", this.A1U);
                        if (this.A1U) {
                            A042.putExtra("dbs_sms_wait_time", this.A0v.A02("sms", 0));
                            A042.putExtra("dbs_flash_wait_time", this.A0v.A02("flash", 0));
                            A042.putExtra("dbs_voice_wait_time", this.A0v.A02("voice", 0));
                            A042.putExtra("dbs_wa_old_wait_time", this.A0v.A02("wa_old", 0));
                            A042.putExtra("dbs_email_otp_wait_time", this.A0v.A02("email_otp", 0));
                            A042.putExtra("dbs_send_sms_wait_time", this.A0v.A02("send_sms", 0));
                        }
                    }
                    this.A0u.A01();
                    startActivity(A042);
                } else {
                    Log.i("VerifyPhoneNumber/onBackPressed/wrong registration state, do not allow go back");
                    return;
                }
            }
            finish();
        } else {
            A1i(this);
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, 0, 0, 2131895081);
        if (!this.A1N && C19963A0w.A00(this)) {
            menu.add(0, 2, 0, 2131894970);
        }
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return super.onKeyDown(i, keyEvent);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Intent intent;
        int itemId = menuItem.getItemId();
        if (itemId != 0) {
            if (itemId == 1) {
                this.A0j.A0A();
                this.A0u.A01();
                intent = AnonymousClass1LU.A01(this);
            } else if (itemId == 2) {
                this.A0j.A0A();
                this.A0u.A01();
                intent = AnonymousClass1LU.A05(this);
            } else if (itemId != 16908332) {
                return super.onOptionsItemSelected(menuItem);
            } else {
                if (this.A02 == 2) {
                    AnonymousClass8BU.A0d(this).A0I(A16(this), "back");
                }
                finish();
                return true;
            }
            startActivity(intent);
            finishAffinity();
            return true;
        } else if (AnonymousClass8BR.A1N(this)) {
            AnonymousClass3MW.A0a(this.A15).A01(this, "verify-number-about-changing-phones");
            return true;
        } else {
            C33641j9 r2 = this.A0k;
            StringBuilder A102 = AnonymousClass000.A10();
            A102.append("verify-sms +");
            A102.append(this.A1H);
            ((C58712l8) this.A1E.get()).A01(this, r2, AnonymousClass000.A0y(this.A1J, A102));
            return true;
        }
    }

    public void onPause() {
        String code;
        StringBuilder A102 = AnonymousClass000.A10();
        A102.append("VerifyPhoneNumber/pause ");
        C17900vP.A0o(A102, A10.A03);
        super.onPause();
        C196059uO r1 = this.A0h;
        r1.A00 = true;
        A9B.A0U(r1.A03, A9B.A00);
        if (this.A0g.A06()) {
            code = this.A0g.A00();
        } else {
            code = this.A0L.getCode();
        }
        if (!TextUtils.isEmpty(code)) {
            this.A0A.A1c(code);
        }
        if (A4e() == 14) {
            C134076py r12 = this.A0f.A01;
            Log.i("AccountDefenceDataManager/stopFetchingDeviceConfirmation");
            r12.A04.A01();
        }
    }

    public VerifyPhoneNumber() {
        this(0);
        this.A00 = 0;
        this.A1a = -2;
        this.A1i = false;
        this.A0B = 0;
        this.A0A = -1;
        this.A1K = null;
        this.A1l = new AQ5(this, 2);
    }
}
