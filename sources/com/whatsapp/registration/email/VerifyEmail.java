package com.whatsapp.registration.email;

import X.A9B;
import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass11A;
import X.AnonymousClass19D;
import X.AnonymousClass1DF;
import X.AnonymousClass1FB;
import X.AnonymousClass1K1;
import X.AnonymousClass1LU;
import X.AnonymousClass3MW;
import X.AnonymousClass3MZ;
import X.AnonymousClass4PW;
import X.AnonymousClass4VX;
import X.AnonymousClass4Yv;
import X.AnonymousClass4a6;
import X.AnonymousClass5LQ;
import X.C000200d;
import X.C166908eI;
import X.C17880vN;
import X.C18020vd;
import X.C18040vf;
import X.C18070vi;
import X.C18100vl;
import X.C196159uY;
import X.C19880zA;
import X.C19890zB;
import X.C21428Ajv;
import X.C28931bI;
import X.C33641j9;
import X.C57352iw;
import X.C58712l8;
import X.C64052u8;
import X.C72453Mb;
import X.C72463Mc;
import X.C72473Md;
import X.C72483Me;
import X.C73203Rj;
import X.C91034f2;
import X.C95824mr;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ProgressBar;
import com.whatsapp.CodeInputField;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaTextView;
import com.whatsapp.registration.timers.RetryCodeCountdownTimersViewModel;
import com.whatsapp.util.Log;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.concurrent.TimeUnit;

public final class VerifyEmail extends C166908eI {
    public int A00;
    public long A01;
    public ProgressBar A02;
    public C19880zA A03;
    public CodeInputField A04;
    public AnonymousClass4PW A05;
    public TextEmojiLabel A06;
    public WaTextView A07;
    public AnonymousClass19D A08;
    public AnonymousClass4VX A09;
    public C33641j9 A0A;
    public C57352iw A0B;
    public RetryCodeCountdownTimersViewModel A0C;
    public C28931bI A0D;
    public WDSButton A0E;
    public WDSButton A0F;
    public WDSButton A0G;
    public AnonymousClass00H A0H;
    public AnonymousClass00H A0I;
    public AnonymousClass00H A0J;
    public AnonymousClass00H A0K;
    public AnonymousClass00H A0L;
    public AnonymousClass00H A0M;
    public String A0N;
    public WaTextView A0O;
    public String A0P;
    public String A0Q;
    public boolean A0R;
    public boolean A0S;
    public final C18100vl A0T;

    public VerifyEmail() {
        this(0);
        this.A0T = AnonymousClass1DF.A01(new AnonymousClass5LQ(this));
    }

    public static final void A0Q(VerifyEmail verifyEmail) {
        AnonymousClass4Yv.A01(verifyEmail, 3);
        AnonymousClass00H r0 = verifyEmail.A0J;
        if (r0 != null) {
            ((C196159uY) r0.get()).A02(new C95824mr(verifyEmail, 1));
        } else {
            C18070vi.A11("emailVerificationXmppMethods");
            throw null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x009f, code lost:
        r2.A0D(r0);
        r2.A0T(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00b4, code lost:
        X.C73203Rj.A0B(r2, r4, r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00bb, code lost:
        return r2.create();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.app.Dialog onCreateDialog(int r5) {
        /*
            r4 = this;
            r3 = 0
            switch(r5) {
                case 1: goto L_0x00a6;
                case 2: goto L_0x0098;
                case 3: goto L_0x0090;
                case 4: goto L_0x0087;
                case 5: goto L_0x0009;
                case 6: goto L_0x0071;
                case 7: goto L_0x0061;
                case 8: goto L_0x0052;
                default: goto L_0x0004;
            }
        L_0x0004:
            android.app.Dialog r0 = super.onCreateDialog(r5)
            return r0
        L_0x0009:
            X.4VX r0 = r4.A09
            java.lang.String r2 = "codeInputBoxManager"
            if (r0 == 0) goto L_0x0041
            boolean r0 = r0.A06()
            if (r0 == 0) goto L_0x002e
            X.4VX r0 = r4.A09
            if (r0 == 0) goto L_0x0041
            r0.A01()
            X.4VX r0 = r4.A09
            if (r0 == 0) goto L_0x0041
            r0.A05(r3)
        L_0x0023:
            com.whatsapp.wds.components.button.WDSButton r0 = r4.A0E
            if (r0 != 0) goto L_0x0045
            java.lang.String r0 = "nextButton"
            X.C18070vi.A11(r0)
        L_0x002c:
            r0 = 0
            throw r0
        L_0x002e:
            com.whatsapp.CodeInputField r1 = r4.A04
            java.lang.String r2 = "codeInputField"
            if (r1 == 0) goto L_0x0041
            java.lang.String r0 = ""
            r1.setCode(r0)
            com.whatsapp.CodeInputField r0 = r4.A04
            if (r0 == 0) goto L_0x0041
            r0.setEnabled(r3)
            goto L_0x0023
        L_0x0041:
            X.C18070vi.A11(r2)
            goto L_0x002c
        L_0x0045:
            r0.setEnabled(r3)
            X.3Rj r2 = X.C73203Rj.A01(r4)
            r1 = 2131899286(0x7f123396, float:1.9433514E38)
            r0 = 8
            goto L_0x00b4
        L_0x0052:
            X.3Rj r2 = X.AnonymousClass4a6.A00(r4)
            r0 = 2131889668(0x7f120e04, float:1.9414006E38)
            r2.A0D(r0)
            r1 = 2131899286(0x7f123396, float:1.9433514E38)
            r0 = 5
            goto L_0x00b4
        L_0x0061:
            X.3Rj r2 = X.AnonymousClass4a6.A00(r4)
            r0 = 2131889666(0x7f120e02, float:1.9414002E38)
            r2.A0D(r0)
            r1 = 2131899286(0x7f123396, float:1.9433514E38)
            r0 = 10
            goto L_0x00b4
        L_0x0071:
            X.3Rj r2 = X.AnonymousClass4a6.A00(r4)
            r0 = 2131889698(0x7f120e22, float:1.9414067E38)
            r2.A0E(r0)
            r0 = 2131889697(0x7f120e21, float:1.9414065E38)
            r2.A0D(r0)
            r1 = 2131899286(0x7f123396, float:1.9433514E38)
            r0 = 9
            goto L_0x00b4
        L_0x0087:
            X.3Rj r2 = X.C73203Rj.A02(r4)
            r1 = 2131899286(0x7f123396, float:1.9433514E38)
            r0 = 6
            goto L_0x00b4
        L_0x0090:
            X.3Rj r2 = X.AnonymousClass4a6.A00(r4)
            r0 = 2131889714(0x7f120e32, float:1.94141E38)
            goto L_0x009f
        L_0x0098:
            X.3Rj r2 = X.AnonymousClass4a6.A00(r4)
            r0 = 2131889717(0x7f120e35, float:1.9414105E38)
        L_0x009f:
            r2.A0D(r0)
            r2.A0T(r3)
            goto L_0x00b7
        L_0x00a6:
            X.3Rj r2 = X.AnonymousClass4a6.A00(r4)
            r0 = 2131889663(0x7f120dff, float:1.9413996E38)
            r2.A0D(r0)
            r1 = 2131899286(0x7f123396, float:1.9433514E38)
            r0 = 7
        L_0x00b4:
            X.C73203Rj.A0B(r2, r4, r0, r1)
        L_0x00b7:
            X.05w r0 = r2.create()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.email.VerifyEmail.onCreateDialog(int):android.app.Dialog");
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        C18070vi.A0d(menu, 0);
        menu.add(0, 1, 0, 2131895081);
        return super.onCreateOptionsMenu(menu);
    }

    public static final void A03(VerifyEmail verifyEmail) {
        String str;
        AnonymousClass19D r2 = verifyEmail.A08;
        if (r2 == null) {
            str = "abPreChatdProps";
        } else if (C18020vd.A05(C18040vf.A02, r2, 8780)) {
            WDSButton wDSButton = verifyEmail.A0G;
            if (wDSButton == null) {
                str = "resendCodeButton";
            } else {
                wDSButton.setEnabled(true);
                return;
            }
        } else {
            WaTextView waTextView = verifyEmail.A07;
            if (waTextView == null) {
                str = "resendCodeText";
            } else {
                waTextView.setClickable(true);
                return;
            }
        }
        C18070vi.A11(str);
        throw null;
    }

    public static final void A0V(VerifyEmail verifyEmail, Integer num, Long l) {
        int i;
        int i2;
        int i3;
        if (num != null) {
            int intValue = num.intValue();
            i = 1;
            if (intValue != 536) {
                i = 5;
                if (intValue != 403) {
                    if (intValue == 535) {
                        i2 = 2131889699;
                        i3 = 6;
                    } else if (intValue == 537) {
                        i2 = 2131889667;
                        i3 = 7;
                    } else if (intValue == 534) {
                        i2 = 2131889669;
                        i3 = 8;
                    }
                    if (l != null) {
                        long longValue = l.longValue();
                        if (longValue > 0) {
                            verifyEmail.BhR(C17880vN.A0q(verifyEmail, C64052u8.A0A(verifyEmail.A00, TimeUnit.SECONDS.toMillis(longValue)), AnonymousClass3MW.A1a(), 0, i2));
                            return;
                        }
                    }
                    AnonymousClass4Yv.A01(verifyEmail, i3);
                    return;
                }
            }
            AnonymousClass4Yv.A01(verifyEmail, i);
        }
        i = 4;
        AnonymousClass4Yv.A01(verifyEmail, i);
    }

    public static final void A0c(VerifyEmail verifyEmail, Long l) {
        String str;
        if (l != null) {
            long longValue = l.longValue();
            if (longValue != 0) {
                WDSButton wDSButton = verifyEmail.A0E;
                if (wDSButton == null) {
                    str = "nextButton";
                } else {
                    wDSButton.setEnabled(false);
                    AnonymousClass00H r0 = verifyEmail.A0K;
                    if (r0 != null) {
                        AnonymousClass11A A0d = C17880vN.A0d(r0);
                        A0d.A00.postDelayed(new C21428Ajv(verifyEmail, 11), TimeUnit.SECONDS.toMillis(longValue));
                        return;
                    }
                    str = "mainThreadHandler";
                }
                C18070vi.A11(str);
                throw null;
            }
        }
    }

    public static final boolean A0d(VerifyEmail verifyEmail) {
        return C72453Mb.A1a(verifyEmail.A0T);
    }

    public void A2y() {
        if (!this.A0R) {
            this.A0R = true;
            AnonymousClass1K1 A0K2 = C72473Md.A0K(this);
            AnonymousClass10E r1 = A0K2.AAQ;
            C72483Me.A0q(r1, this);
            AnonymousClass10G r3 = r1.A00;
            AnonymousClass1FB.A0K(r1, r3, this, r3.A45);
            AnonymousClass1FB.A0L(r1, r3, this, r3.A5A);
            this.A00 = AnonymousClass1K1.A1f(A0K2);
            this.A08 = C72463Mc.A0e(r1);
            this.A0H = C000200d.A00(r1.A08);
            this.A05 = (AnonymousClass4PW) A0K2.A24.get();
            this.A0I = C000200d.A00(r3.A9X);
            this.A0J = C000200d.A00(r1.AKr);
            this.A0B = C72463Mc.A0i(r3);
            this.A0K = AnonymousClass3MZ.A14(r1);
            this.A0L = C000200d.A00(A0K2.A5g);
            this.A03 = C19890zB.A00;
            this.A0A = (C33641j9) r1.Am6.get();
            this.A0M = AnonymousClass3MW.A0s(r1);
        }
    }

    public final C19880zA A4e() {
        C19880zA r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("smbOnboardingAnalyticsManager");
        throw null;
    }

    public final AnonymousClass00H A4f() {
        AnonymousClass00H r0 = this.A0I;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("emailVerificationLogger");
        throw null;
    }

    public void onBackPressed() {
        if (this.A0S) {
            Log.i("VerifyEmail/onBackPressed/is adding new account");
            A9B.A0J(this, this.A0A, this.A0B);
            return;
        }
        AnonymousClass19D r2 = this.A08;
        if (r2 == null) {
            C18070vi.A11("abPreChatdProps");
            throw null;
        } else if (C18020vd.A05(C18040vf.A02, r2, 10206)) {
            Log.i("VerifyEmail/setupNotNowButton/skip verify email, show dialog");
            C73203Rj A002 = AnonymousClass4a6.A00(this);
            A002.A0T(false);
            A002.A0E(2131889708);
            A002.A0D(2131889707);
            C73203Rj.A0B(A002, this, 4, 2131889706);
            C73203Rj.A07(A002, 34, 2131898766);
            A002.A0C();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:108:0x026e, code lost:
        if (r5 != false) goto L_0x0270;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r18) {
        /*
            r17 = this;
            r3 = r17
            r4 = r18
            super.onCreate(r4)
            X.C72463Mc.A0t(r3)
            r0 = 2131626711(0x7f0e0ad7, float:1.8880666E38)
            r3.setContentView((int) r0)
            X.4PW r0 = r3.A05
            if (r0 == 0) goto L_0x0329
            r12 = 0
            X.4VX r0 = r0.A00(r12)
            r3.A09 = r0
            X.2iw r0 = r3.A0B
            if (r0 == 0) goto L_0x0323
            r0.A00(r3)
            X.0z4 r0 = r3.A0A
            boolean r2 = r0.A2L()
            android.view.View r1 = r3.A00
            r0 = 2131436208(0x7f0b22b0, float:1.849428E38)
            if (r2 == 0) goto L_0x0050
            r0 = 2131436252(0x7f0b22dc, float:1.849437E38)
            android.view.View r0 = X.AnonymousClass1HF.A06(r1, r0)
            X.C18070vi.A0b(r0)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
        L_0x003b:
            android.view.View r1 = r0.inflate()
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.WaTextView"
            X.C18070vi.A0z(r1, r0)
            com.whatsapp.WaTextView r1 = (com.whatsapp.WaTextView) r1
            r3.A0O = r1
            java.lang.String r11 = "title"
            if (r1 != 0) goto L_0x005a
            X.C18070vi.A11(r11)
            throw r12
        L_0x0050:
            android.view.View r0 = X.AnonymousClass1HF.A06(r1, r0)
            X.C18070vi.A0b(r0)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            goto L_0x003b
        L_0x005a:
            r0 = 2131889688(0x7f120e18, float:1.9414047E38)
            r1.setText(r0)
            android.view.View r1 = r3.A00
            r0 = 2131436718(0x7f0b24ae, float:1.8495314E38)
            android.view.View r0 = X.C18070vi.A05(r1, r0)
            com.whatsapp.wds.components.button.WDSButton r0 = (com.whatsapp.wds.components.button.WDSButton) r0
            r3.A0E = r0
            android.view.View r1 = r3.A00
            r0 = 2131434182(0x7f0b1ac6, float:1.849017E38)
            android.view.View r0 = X.C18070vi.A05(r1, r0)
            android.widget.ProgressBar r0 = (android.widget.ProgressBar) r0
            r3.A02 = r0
            android.view.View r1 = r3.A00
            r0 = 2131436717(0x7f0b24ad, float:1.8495312E38)
            android.view.View r0 = X.C18070vi.A05(r1, r0)
            com.whatsapp.wds.components.button.WDSButton r0 = (com.whatsapp.wds.components.button.WDSButton) r0
            r3.A0F = r0
            android.view.View r1 = r3.A00
            r0 = 2131436715(0x7f0b24ab, float:1.8495308E38)
            android.view.View r0 = X.C18070vi.A05(r1, r0)
            com.whatsapp.CodeInputField r0 = (com.whatsapp.CodeInputField) r0
            r3.A04 = r0
            android.view.View r1 = r3.A00
            r0 = 2131434625(0x7f0b1c81, float:1.849107E38)
            com.whatsapp.WaTextView r0 = X.AnonymousClass3Ma.A0N(r1, r0)
            r3.A07 = r0
            android.view.View r1 = r3.A00
            r0 = 2131434624(0x7f0b1c80, float:1.8491067E38)
            android.view.View r0 = X.C18070vi.A05(r1, r0)
            com.whatsapp.wds.components.button.WDSButton r0 = (com.whatsapp.wds.components.button.WDSButton) r0
            r3.A0G = r0
            android.view.View r1 = r3.A00
            r0 = 2131436716(0x7f0b24ac, float:1.849531E38)
            com.whatsapp.TextEmojiLabel r0 = X.C72453Mb.A0c(r1, r0)
            r3.A06 = r0
            android.view.View r1 = r3.A00
            r0 = 2131435435(0x7f0b1fab, float:1.8492712E38)
            X.1bI r0 = X.C28931bI.A00(r1, r0)
            r3.A0D = r0
            X.0z4 r0 = r3.A0A
            boolean r0 = r0.A2L()
            r1 = 2131436280(0x7f0b22f8, float:1.8494426E38)
            if (r0 == 0) goto L_0x00d0
            r1 = 2131436281(0x7f0b22f9, float:1.8494428E38)
        L_0x00d0:
            X.19D r0 = r3.A08
            if (r0 == 0) goto L_0x031d
            X.A9B.A0T(r3, r0, r1)
            com.whatsapp.wds.components.button.WDSButton r1 = r3.A0E
            java.lang.String r10 = "nextButton"
            if (r1 != 0) goto L_0x00e1
            X.C18070vi.A11(r10)
            throw r12
        L_0x00e1:
            r0 = 24
            X.AnonymousClass3MZ.A1L(r1, r3, r0)
            android.widget.ProgressBar r1 = r3.A02
            if (r1 != 0) goto L_0x00f0
            java.lang.String r0 = "progressBar"
            X.C18070vi.A11(r0)
            throw r12
        L_0x00f0:
            r0 = 100
            r1.setProgress(r0)
            com.whatsapp.wds.components.button.WDSButton r1 = r3.A0F
            if (r1 != 0) goto L_0x00ff
            java.lang.String r0 = "notNowButton"
            X.C18070vi.A11(r0)
            throw r12
        L_0x00ff:
            r0 = 25
            X.AnonymousClass3MZ.A1L(r1, r3, r0)
            android.view.View r1 = r3.A00
            r0 = 2131436714(0x7f0b24aa, float:1.8495306E38)
            android.view.View r9 = X.C18070vi.A05(r1, r0)
            android.widget.LinearLayout r9 = (android.widget.LinearLayout) r9
            X.4VX r0 = r3.A09
            java.lang.String r8 = "codeInputBoxManager"
            if (r0 == 0) goto L_0x0319
            boolean r0 = r0.A06()
            r7 = 6
            java.lang.String r2 = "progressBar"
            r1 = 8
            r5 = 0
            java.lang.String r6 = "codeInputField"
            if (r0 == 0) goto L_0x01ee
            com.whatsapp.CodeInputField r0 = r3.A04
            if (r0 == 0) goto L_0x0315
            r0.setVisibility(r1)
            android.widget.ProgressBar r0 = r3.A02
            if (r0 == 0) goto L_0x0311
            r0.setVisibility(r1)
            X.4VX r2 = r3.A09
            if (r2 == 0) goto L_0x0319
            r1 = 1
            X.Ad0 r0 = new X.Ad0
            r0.<init>(r3, r1)
            r2.A03(r9, r0, r7, r5)
            r9.setVisibility(r5)
            android.content.res.Resources r0 = r3.getResources()
            boolean r0 = X.A9B.A0V(r0)
            if (r0 != 0) goto L_0x0152
            X.4VX r0 = r3.A09
            if (r0 == 0) goto L_0x0319
            r0.A02()
        L_0x0152:
            X.19D r1 = r3.A08
            if (r1 == 0) goto L_0x030b
            r0 = 8780(0x224c, float:1.2303E-41)
            X.0vf r5 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r5, r1, r0)
            r7 = 8
            r1 = 0
            java.lang.String r6 = "resendCodeButton"
            java.lang.String r2 = "resendCodeText"
            if (r0 == 0) goto L_0x01d9
            com.whatsapp.wds.components.button.WDSButton r0 = r3.A0G
            if (r0 == 0) goto L_0x0303
            r0.setVisibility(r1)
            com.whatsapp.WaTextView r0 = r3.A07
            if (r0 == 0) goto L_0x0307
            r0.setVisibility(r7)
            com.whatsapp.wds.components.button.WDSButton r1 = r3.A0G
            if (r1 == 0) goto L_0x0303
            r0 = 22
        L_0x017b:
            X.AnonymousClass3MZ.A1L(r1, r3, r0)
            A03(r3)
            android.content.Intent r1 = r3.getIntent()
            java.lang.String r0 = "email"
            java.lang.String r7 = r1.getStringExtra(r0)
            com.whatsapp.TextEmojiLabel r2 = r3.A06
            java.lang.String r1 = "verifyEmailDescription"
            if (r2 == 0) goto L_0x02ff
            X.0ve r0 = r3.A0E
            X.AnonymousClass3Ma.A1L(r0, r2)
            com.whatsapp.TextEmojiLabel r6 = r3.A06
            if (r6 == 0) goto L_0x02ff
            r0 = 2131897766(0x7f122da6, float:1.943043E38)
            java.lang.String r2 = X.C72473Md.A0j(r3, r7, r0)
            X.C18070vi.A0X(r2)
            r0 = 9
            X.Ajv r1 = new X.Ajv
            r1.<init>(r3, r0)
            java.lang.String r0 = "edit-email"
            android.text.SpannableStringBuilder r0 = X.A3H.A02(r3, r1, r2, r0)
            r6.setText(r0)
            X.00H r0 = r3.A0H
            if (r0 == 0) goto L_0x02f9
            X.1cN r0 = X.C17880vN.A0I(r0)
            r2 = 0
            boolean r0 = r0.A0J(r2)
            r3.A0S = r0
            X.19D r1 = r3.A08
            if (r1 == 0) goto L_0x02f3
            r0 = 10206(0x27de, float:1.4302E-41)
            boolean r5 = X.C18020vd.A05(r5, r1, r0)
            if (r5 == 0) goto L_0x0264
            com.whatsapp.wds.components.button.WDSButton r1 = r3.A0F
            if (r1 != 0) goto L_0x0228
            java.lang.String r0 = "notNowButton"
            X.C18070vi.A11(r0)
            throw r12
        L_0x01d9:
            com.whatsapp.WaTextView r0 = r3.A07
            if (r0 == 0) goto L_0x0307
            r0.setVisibility(r1)
            com.whatsapp.wds.components.button.WDSButton r0 = r3.A0G
            if (r0 == 0) goto L_0x0303
            r0.setVisibility(r7)
            com.whatsapp.WaTextView r1 = r3.A07
            if (r1 == 0) goto L_0x0307
            r0 = 23
            goto L_0x017b
        L_0x01ee:
            r9.setVisibility(r1)
            com.whatsapp.CodeInputField r0 = r3.A04
            if (r0 == 0) goto L_0x0315
            r0.setVisibility(r5)
            android.widget.ProgressBar r0 = r3.A02
            if (r0 == 0) goto L_0x0311
            r0.setVisibility(r5)
            com.whatsapp.CodeInputField r2 = r3.A04
            if (r2 == 0) goto L_0x0315
            r1 = 2
            X.4gX r0 = new X.4gX
            r0.<init>(r3, r1)
            r2.A0L(r0, r7)
            com.whatsapp.CodeInputField r1 = r3.A04
            if (r1 == 0) goto L_0x0315
            java.lang.String r0 = ""
            r1.setCode(r0)
            android.content.res.Resources r0 = r3.getResources()
            boolean r0 = X.A9B.A0V(r0)
            if (r0 != 0) goto L_0x0152
            com.whatsapp.CodeInputField r0 = r3.A04
            if (r0 == 0) goto L_0x0315
            r0.A0I(r5)
            goto L_0x0152
        L_0x0228:
            r0 = 8
            r1.setVisibility(r0)
            X.0z4 r0 = r3.A0A
            boolean r0 = r0.A2L()
            if (r0 != 0) goto L_0x0256
            com.whatsapp.WaTextView r0 = r3.A0O
            if (r0 != 0) goto L_0x023d
            X.C18070vi.A11(r11)
            throw r12
        L_0x023d:
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            java.lang.String r0 = "null cannot be cast to non-null type androidx.appcompat.widget.Toolbar.LayoutParams"
            X.C18070vi.A0z(r1, r0)
            X.039 r1 = (X.AnonymousClass039) r1
            r0 = 3
            r1.A00 = r0
            com.whatsapp.WaTextView r0 = r3.A0O
            if (r0 != 0) goto L_0x0253
            X.C18070vi.A11(r11)
            throw r12
        L_0x0253:
            r0.setLayoutParams(r1)
        L_0x0256:
            com.whatsapp.wds.components.button.WDSButton r1 = r3.A0E
            if (r1 != 0) goto L_0x025e
            X.C18070vi.A11(r10)
            throw r12
        L_0x025e:
            r0 = 2131891240(0x7f121428, float:1.9417194E38)
            r1.setText(r0)
        L_0x0264:
            android.view.View r6 = r3.A00
            r8 = 2131436719(0x7f0b24af, float:1.8495316E38)
            boolean r0 = r3.A0S
            if (r0 != 0) goto L_0x0270
            r11 = 0
            if (r5 == 0) goto L_0x0271
        L_0x0270:
            r11 = 1
        L_0x0271:
            r9 = r2
            r10 = r2
            r7 = r3
            X.A9B.A0Q(r6, r7, r8, r9, r10, r11)
            android.content.Intent r1 = r3.getIntent()
            java.lang.String r0 = "entrypoint"
            int r0 = r1.getIntExtra(r0, r2)
            r3.A00 = r0
            java.lang.String r0 = X.C72453Mb.A0v(r3)
            r3.A0N = r0
            X.0z4 r0 = r3.A0A
            java.lang.String r0 = r0.A0l()
            X.C18070vi.A0X(r0)
            r3.A0P = r0
            X.0z4 r0 = r3.A0A
            java.lang.String r0 = r0.A0n()
            X.C18070vi.A0X(r0)
            r3.A0Q = r0
            X.1It r1 = X.AnonymousClass3MW.A0N(r3)
            java.lang.Class<com.whatsapp.registration.timers.RetryCodeCountdownTimersViewModel> r0 = com.whatsapp.registration.timers.RetryCodeCountdownTimersViewModel.class
            X.1J2 r0 = r1.A00(r0)
            com.whatsapp.registration.timers.RetryCodeCountdownTimersViewModel r0 = (com.whatsapp.registration.timers.RetryCodeCountdownTimersViewModel) r0
            r3.A0C = r0
            if (r0 != 0) goto L_0x02b5
            java.lang.String r0 = "retryCodeCountdownTimersViewModel"
            X.C18070vi.A11(r0)
            throw r12
        L_0x02b5:
            X.1DS r2 = r0.A01
            X.5U7 r1 = new X.5U7
            r1.<init>(r3)
            r0 = 25
            X.C91634g0.A00(r3, r2, r1, r0)
            X.00H r0 = r3.A4f()
            java.lang.Object r10 = r0.get()
            X.9kJ r10 = (X.C190059kJ) r10
            java.lang.String r11 = r3.A0N
            int r13 = r3.A00
            r16 = 3
            r14 = 8
            r15 = r14
            r10.A00(r11, r12, r13, r14, r15, r16)
            if (r18 != 0) goto L_0x02dc
            A0Q(r3)
        L_0x02dc:
            X.0vl r0 = r3.A0T
            boolean r0 = X.C72453Mb.A1a(r0)
            if (r0 == 0) goto L_0x02f2
            X.0zA r0 = r3.A4e()
            r0.A03()
            java.lang.String r0 = "logOnboardingViewEvent"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x02f2:
            return
        L_0x02f3:
            java.lang.String r0 = "abPreChatdProps"
            X.C18070vi.A11(r0)
            throw r12
        L_0x02f9:
            java.lang.String r0 = "accountSwitcher"
            X.C18070vi.A11(r0)
            throw r12
        L_0x02ff:
            X.C18070vi.A11(r1)
            throw r12
        L_0x0303:
            X.C18070vi.A11(r6)
            throw r12
        L_0x0307:
            X.C18070vi.A11(r2)
            throw r12
        L_0x030b:
            java.lang.String r0 = "abPreChatdProps"
            X.C18070vi.A11(r0)
            throw r12
        L_0x0311:
            X.C18070vi.A11(r2)
            throw r12
        L_0x0315:
            X.C18070vi.A11(r6)
            throw r12
        L_0x0319:
            X.C18070vi.A11(r8)
            throw r12
        L_0x031d:
            java.lang.String r0 = "abPreChatdProps"
            X.C18070vi.A11(r0)
            throw r12
        L_0x0323:
            java.lang.String r0 = "landscapeModeBacktest"
            X.C18070vi.A11(r0)
            throw r12
        L_0x0329:
            java.lang.String r0 = "codeInputBoxManagerFactory"
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.email.VerifyEmail.onCreate(android.os.Bundle):void");
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        String str;
        int A0B2 = C72453Mb.A0B(menuItem);
        if (A0B2 == 1) {
            AnonymousClass00H r0 = this.A0L;
            if (r0 != null) {
                C58712l8 r3 = (C58712l8) r0.get();
                C33641j9 r2 = this.A0A;
                if (r2 != null) {
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("verify-email +");
                    String str2 = this.A0P;
                    if (str2 == null) {
                        str = "countryCode";
                    } else {
                        A10.append(str2);
                        String str3 = this.A0Q;
                        if (str3 == null) {
                            str = "phoneNumber";
                        } else {
                            r3.A01(this, r2, AnonymousClass000.A0y(str3, A10));
                        }
                    }
                } else {
                    str = "verificationFlowState";
                }
            } else {
                str = "registrationHelper";
            }
            C18070vi.A11(str);
            throw null;
        } else if (A0B2 == 2) {
            AnonymousClass00H r02 = this.A0M;
            if (r02 != null) {
                r02.get();
                startActivity(AnonymousClass1LU.A01(this));
                finishAffinity();
                return true;
            }
            str = "waIntents";
            C18070vi.A11(str);
            throw null;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public VerifyEmail(int i) {
        this.A0R = false;
        C91034f2.A00(this, 4);
    }
}
