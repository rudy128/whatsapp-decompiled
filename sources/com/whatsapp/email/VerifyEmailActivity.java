package com.whatsapp.email;

import X.A3H;
import X.A9B;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass11A;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1HF;
import X.AnonymousClass1LU;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass4Yv;
import X.C000200d;
import X.C17880vN;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C190059kJ;
import X.C196159uY;
import X.C19740yt;
import X.C28931bI;
import X.C64052u8;
import X.C72453Mb;
import X.C72473Md;
import X.C72483Me;
import X.C89934dG;
import X.C91014f0;
import X.C91644g1;
import X.C91964gX;
import X.C95824mr;
import X.C95854mu;
import X.C98564rM;
import X.C99244sV;
import android.content.Intent;
import android.os.Bundle;
import android.text.style.TextAppearanceSpan;
import android.view.MenuItem;
import android.widget.ProgressBar;
import com.whatsapp.CodeInputField;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaTextView;
import com.whatsapp.registration.timers.RetryCodeCountdownTimersViewModel;
import com.whatsapp.util.Log;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.concurrent.TimeUnit;

public final class VerifyEmailActivity extends AnonymousClass1FY {
    public int A00;
    public long A01;
    public CodeInputField A02;
    public TextEmojiLabel A03;
    public WaTextView A04;
    public RetryCodeCountdownTimersViewModel A05;
    public C28931bI A06;
    public WDSButton A07;
    public AnonymousClass00H A08;
    public AnonymousClass00H A09;
    public AnonymousClass00H A0A;
    public AnonymousClass00H A0B;
    public String A0C;
    public ProgressBar A0D;
    public boolean A0E;

    public VerifyEmailActivity() {
        this(0);
    }

    public static final void A03(VerifyEmailActivity verifyEmailActivity) {
        AnonymousClass4Yv.A01(verifyEmailActivity, 3);
        AnonymousClass00H r0 = verifyEmailActivity.A09;
        if (r0 != null) {
            ((C196159uY) r0.get()).A02(new C95824mr(verifyEmailActivity, 0));
        } else {
            C18070vi.A11("emailVerificationXmppMethods");
            throw null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0086, code lost:
        r2.A0D(r0);
        r2.A0T(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x009c, code lost:
        X.C73203Rj.A08(r2, r4, r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00a3, code lost:
        return r2.create();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.app.Dialog onCreateDialog(int r5) {
        /*
            r4 = this;
            r3 = 0
            switch(r5) {
                case 1: goto L_0x008d;
                case 2: goto L_0x007f;
                case 3: goto L_0x0077;
                case 4: goto L_0x006d;
                case 5: goto L_0x0009;
                case 6: goto L_0x0057;
                case 7: goto L_0x0047;
                case 8: goto L_0x0037;
                default: goto L_0x0004;
            }
        L_0x0004:
            android.app.Dialog r0 = super.onCreateDialog(r5)
            return r0
        L_0x0009:
            com.whatsapp.CodeInputField r2 = r4.A02
            java.lang.String r1 = "codeInputField"
            if (r2 == 0) goto L_0x0026
            java.lang.String r0 = ""
            r2.setCode(r0)
            com.whatsapp.CodeInputField r0 = r4.A02
            if (r0 == 0) goto L_0x0026
            r0.setEnabled(r3)
            com.whatsapp.wds.components.button.WDSButton r0 = r4.A07
            if (r0 != 0) goto L_0x002a
            java.lang.String r0 = "verifyBtn"
            X.C18070vi.A11(r0)
        L_0x0024:
            r0 = 0
            throw r0
        L_0x0026:
            X.C18070vi.A11(r1)
            goto L_0x0024
        L_0x002a:
            r0.setEnabled(r3)
            X.3Rj r2 = X.C73203Rj.A01(r4)
            r1 = 2131899286(0x7f123396, float:1.9433514E38)
            r0 = 45
            goto L_0x009c
        L_0x0037:
            X.3Rj r2 = X.AnonymousClass4a6.A00(r4)
            r0 = 2131889668(0x7f120e04, float:1.9414006E38)
            r2.A0D(r0)
            r1 = 2131899286(0x7f123396, float:1.9433514E38)
            r0 = 48
            goto L_0x009c
        L_0x0047:
            X.3Rj r2 = X.AnonymousClass4a6.A00(r4)
            r0 = 2131889666(0x7f120e02, float:1.9414002E38)
            r2.A0D(r0)
            r1 = 2131899286(0x7f123396, float:1.9433514E38)
            r0 = 47
            goto L_0x009c
        L_0x0057:
            X.3Rj r2 = X.AnonymousClass4a6.A00(r4)
            r0 = 2131889698(0x7f120e22, float:1.9414067E38)
            r2.A0E(r0)
            r0 = 2131889697(0x7f120e21, float:1.9414065E38)
            r2.A0D(r0)
            r1 = 2131899286(0x7f123396, float:1.9433514E38)
            r0 = 46
            goto L_0x009c
        L_0x006d:
            X.3Rj r2 = X.C73203Rj.A02(r4)
            r1 = 2131899286(0x7f123396, float:1.9433514E38)
            r0 = 43
            goto L_0x009c
        L_0x0077:
            X.3Rj r2 = X.AnonymousClass4a6.A00(r4)
            r0 = 2131889714(0x7f120e32, float:1.94141E38)
            goto L_0x0086
        L_0x007f:
            X.3Rj r2 = X.AnonymousClass4a6.A00(r4)
            r0 = 2131889717(0x7f120e35, float:1.9414105E38)
        L_0x0086:
            r2.A0D(r0)
            r2.A0T(r3)
            goto L_0x009f
        L_0x008d:
            X.3Rj r2 = X.AnonymousClass4a6.A00(r4)
            r0 = 2131889663(0x7f120dff, float:1.9413996E38)
            r2.A0D(r0)
            r1 = 2131899286(0x7f123396, float:1.9433514E38)
            r0 = 44
        L_0x009c:
            X.C73203Rj.A08(r2, r4, r0, r1)
        L_0x009f:
            X.05w r0 = r2.create()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.email.VerifyEmailActivity.onCreateDialog(int):android.app.Dialog");
    }

    public static final void A0Q(VerifyEmailActivity verifyEmailActivity, Integer num, Long l) {
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
                            verifyEmailActivity.BhR(C17880vN.A0q(verifyEmailActivity, C64052u8.A0A(verifyEmailActivity.A00, TimeUnit.SECONDS.toMillis(longValue)), AnonymousClass3MW.A1a(), 0, i2));
                            return;
                        }
                    }
                    AnonymousClass4Yv.A01(verifyEmailActivity, i3);
                    return;
                }
            }
            AnonymousClass4Yv.A01(verifyEmailActivity, i);
        }
        i = 4;
        AnonymousClass4Yv.A01(verifyEmailActivity, i);
    }

    public static final void A0V(VerifyEmailActivity verifyEmailActivity, Long l) {
        String str;
        if (l != null) {
            long longValue = l.longValue();
            if (longValue != 0) {
                WDSButton wDSButton = verifyEmailActivity.A07;
                if (wDSButton == null) {
                    str = "verifyBtn";
                } else {
                    wDSButton.setEnabled(false);
                    AnonymousClass00H r0 = verifyEmailActivity.A0A;
                    if (r0 != null) {
                        AnonymousClass11A A0d = C17880vN.A0d(r0);
                        A0d.A00.postDelayed(new C98564rM(verifyEmailActivity, 40), TimeUnit.SECONDS.toMillis(longValue));
                        return;
                    }
                    str = "mainThreadHandler";
                }
                C18070vi.A11(str);
                throw null;
            }
        }
    }

    public static final void A0d(VerifyEmailActivity verifyEmailActivity, boolean z) {
        Intent intent;
        int i = verifyEmailActivity.A00;
        if (i != 3) {
            AnonymousClass00H r0 = verifyEmailActivity.A0B;
            if (i != 5) {
                if (r0 != null) {
                    r0.get();
                    intent = AnonymousClass1LU.A1O(verifyEmailActivity, verifyEmailActivity.A0C, verifyEmailActivity.A00);
                }
                AnonymousClass3MW.A1F();
                throw null;
            }
            if (r0 != null) {
                r0.get();
                intent = C17880vN.A0A();
                String packageName = verifyEmailActivity.getPackageName();
                if (!z) {
                    intent.setClassName(packageName, "com.whatsapp.email.EmailVerifiedSecurityCheckActivity");
                } else {
                    intent.setClassName(packageName, "com.whatsapp.settings.securitycheckup.SettingsSecurityCheckupActivity");
                    intent = intent.addFlags(67108864);
                }
            }
            AnonymousClass3MW.A1F();
            throw null;
        }
        AnonymousClass00H r02 = verifyEmailActivity.A0B;
        if (r02 != null) {
            r02.get();
            intent = AnonymousClass1LU.A1m(verifyEmailActivity, false);
            intent = intent.addFlags(67108864);
        }
        AnonymousClass3MW.A1F();
        throw null;
        C18070vi.A0b(intent);
        verifyEmailActivity.A01.A08(verifyEmailActivity, intent);
        verifyEmailActivity.finish();
    }

    public void A2y() {
        if (!this.A0E) {
            this.A0E = true;
            AnonymousClass10E A0L = C72473Md.A0L(this);
            C72483Me.A0q(A0L, this);
            AnonymousClass10G r1 = A0L.A00;
            AnonymousClass1FB.A0K(A0L, r1, this, r1.A45);
            AnonymousClass1FB.A0L(A0L, r1, this, r1.A5A);
            this.A08 = C000200d.A00(r1.A9X);
            this.A09 = C000200d.A00(A0L.AKr);
            this.A0A = AnonymousClass3MZ.A14(A0L);
            this.A0B = AnonymousClass3MW.A0s(A0L);
        }
    }

    public final AnonymousClass00H A4b() {
        AnonymousClass00H r0 = this.A08;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("emailVerificationLogger");
        throw null;
    }

    public void onCreate(Bundle bundle) {
        boolean z;
        String str;
        super.onCreate(bundle);
        setContentView(2131627340);
        C72473Md.A18(this);
        this.A07 = AnonymousClass3MW.A0q(this.A00, 2131430282);
        this.A02 = (CodeInputField) AnonymousClass1HF.A06(this.A00, 2131436715);
        this.A04 = AnonymousClass3MW.A0T(this.A00, 2131434625);
        this.A03 = AnonymousClass3MX.A0V(this.A00, 2131436716);
        this.A06 = C28931bI.A00(this.A00, 2131435435);
        WDSButton wDSButton = this.A07;
        if (wDSButton == null) {
            str = "verifyBtn";
        } else {
            C89934dG.A00(wDSButton, this, 9);
            this.A0D = (ProgressBar) AnonymousClass1HF.A06(this.A00, 2131434182);
            C18030ve r2 = this.A0E;
            if (r2 != null) {
                z = C18020vd.A05(C18040vf.A01, r2, 11695);
            } else {
                z = false;
            }
            if (!z) {
                ProgressBar progressBar = this.A0D;
                str = "progressBar";
                if (progressBar != null) {
                    progressBar.setVisibility(0);
                    ProgressBar progressBar2 = this.A0D;
                    if (progressBar2 != null) {
                        progressBar2.setProgress(100);
                    }
                }
            }
            this.A00 = getIntent().getIntExtra("entrypoint", 0);
            this.A0C = C72453Mb.A0v(this);
            ((C190059kJ) A4b().get()).A00(this.A0C, (String) null, this.A00, 8, 8, 3);
            setTitle(2131889701);
            CodeInputField codeInputField = this.A02;
            if (codeInputField != null) {
                codeInputField.A0L(new C91964gX(this, 1), 6);
                CodeInputField codeInputField2 = this.A02;
                if (codeInputField2 != null) {
                    codeInputField2.setCode("");
                    if (!A9B.A0V(getResources())) {
                        CodeInputField codeInputField3 = this.A02;
                        if (codeInputField3 != null) {
                            codeInputField3.A0I(false);
                        }
                    }
                    WaTextView waTextView = this.A04;
                    if (waTextView != null) {
                        waTextView.setClickable(true);
                        WaTextView waTextView2 = this.A04;
                        if (waTextView2 != null) {
                            C89934dG.A00(waTextView2, this, 10);
                            String stringExtra = getIntent().getStringExtra("email");
                            TextEmojiLabel textEmojiLabel = this.A03;
                            if (textEmojiLabel != null) {
                                AnonymousClass3Ma.A1L(this.A0E, textEmojiLabel);
                                TextEmojiLabel textEmojiLabel2 = this.A03;
                                if (textEmojiLabel2 != null) {
                                    textEmojiLabel2.setText(A3H.A00(this, (TextAppearanceSpan) null, new C98564rM(this, 37), AnonymousClass3Ma.A10(this, stringExtra, new Object[1], 0, 2131897766), "edit-email", C19740yt.A00(this, 2131103150), false));
                                    RetryCodeCountdownTimersViewModel retryCodeCountdownTimersViewModel = (RetryCodeCountdownTimersViewModel) AnonymousClass3MW.A0N(this).A00(RetryCodeCountdownTimersViewModel.class);
                                    this.A05 = retryCodeCountdownTimersViewModel;
                                    if (retryCodeCountdownTimersViewModel == null) {
                                        C18070vi.A11("retryCodeCountdownTimersViewModel");
                                        throw null;
                                    }
                                    C91644g1.A00(this, retryCodeCountdownTimersViewModel.A01, C99244sV.A00(this, 26), 30);
                                    String stringExtra2 = getIntent().getStringExtra("email_otp");
                                    if (stringExtra2 == null || stringExtra2.length() == 0) {
                                        A03(this);
                                        return;
                                    }
                                    Log.i("VerifyEmailActivity/onCreate/verify email deeplink");
                                    A0c(this, stringExtra2);
                                    return;
                                }
                            }
                            C18070vi.A11("verifyEmailDescription");
                            throw null;
                        }
                    }
                    C18070vi.A11("resendCodeText");
                    throw null;
                }
            }
            C18070vi.A11("codeInputField");
            throw null;
        }
        C18070vi.A11(str);
        throw null;
    }

    public static final void A0c(VerifyEmailActivity verifyEmailActivity, String str) {
        if (str.length() != 6) {
            Log.e("VerifyEmailActivity/executeVerifyEmailOtpRequest/invalid otp length");
            verifyEmailActivity.BhQ(2131889664);
        }
        AnonymousClass4Yv.A01(verifyEmailActivity, 2);
        AnonymousClass00H r0 = verifyEmailActivity.A09;
        if (r0 != null) {
            ((C196159uY) r0.get()).A04(new C95854mu(verifyEmailActivity, 0), str);
        } else {
            C18070vi.A11("emailVerificationXmppMethods");
            throw null;
        }
    }

    public void onBackPressed() {
        ((C190059kJ) A4b().get()).A00(this.A0C, (String) null, this.A00, 8, 7, 3);
        A0d(this, true);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (C72453Mb.A0B(menuItem) != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    public VerifyEmailActivity(int i) {
        this.A0E = false;
        C91014f0.A00(this, 2);
    }
}
