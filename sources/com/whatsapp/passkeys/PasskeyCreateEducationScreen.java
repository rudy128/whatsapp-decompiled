package com.whatsapp.passkeys;

import X.A9B;
import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass11C;
import X.AnonymousClass19D;
import X.AnonymousClass1FB;
import X.AnonymousClass1HF;
import X.AnonymousClass1K1;
import X.AnonymousClass1KB;
import X.AnonymousClass1L9;
import X.AnonymousClass1OB;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass4CF;
import X.AnonymousClass4CG;
import X.AnonymousClass4Yv;
import X.B8U;
import X.B8V;
import X.C000200d;
import X.C166908eI;
import X.C177659Ab;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C18100vl;
import X.C191519mj;
import X.C19880zA;
import X.C19890zB;
import X.C26302CxJ;
import X.C30391dr;
import X.C57352iw;
import X.C72453Mb;
import X.C72463Mc;
import X.C72473Md;
import X.C72483Me;
import X.C88494Zy;
import X.C91024f1;
import X.C99164sN;
import X.C99434so;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.wds.components.textlayout.WDSTextLayout;
import java.util.Iterator;
import java.util.List;

public final class PasskeyCreateEducationScreen extends C166908eI {
    public C19880zA A00;
    public AnonymousClass19D A01;
    public B8U A02;
    public C191519mj A03;
    public B8V A04;
    public C57352iw A05;
    public WDSTextLayout A06;
    public AnonymousClass00H A07;
    public AnonymousClass1OB A08;
    public boolean A09;
    public final C18100vl A0A;

    public PasskeyCreateEducationScreen() {
        this(0);
        this.A0A = C99164sN.A01(this, 15);
    }

    public Dialog onCreateDialog(int i) {
        if (i == 1) {
            ProgressDialog A032 = A9B.A03(this, getString(2131894984));
            C18070vi.A0b(A032);
            return A032;
        }
        Dialog onCreateDialog = super.onCreateDialog(i);
        C18070vi.A0X(onCreateDialog);
        return onCreateDialog;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A03(com.whatsapp.passkeys.PasskeyCreateEducationScreen r6, com.whatsapp.passkeys.PasskeyFacade r7, X.C30391dr r8) {
        /*
            boolean r0 = r8 instanceof X.C100474uZ
            if (r0 == 0) goto L_0x0057
            r5 = r8
            X.4uZ r5 = (X.C100474uZ) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0057
            int r2 = r2 - r1
            r5.label = r2
        L_0x0012:
            java.lang.Object r4 = r5.result
            X.1g4 r3 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r5.label
            r2 = 1
            if (r0 == 0) goto L_0x0041
            if (r0 != r2) goto L_0x0062
            java.lang.Object r6 = r5.L$0
            android.app.Activity r6 = (android.app.Activity) r6
            X.C30691eM.A01(r4)
        L_0x0024:
            boolean r0 = r4 instanceof X.C175348yZ
            if (r0 == 0) goto L_0x0035
            r0 = 22
            X.Ajs r1 = new X.Ajs
            r1.<init>((java.lang.Object) r6, (int) r0)
        L_0x002f:
            r6.runOnUiThread(r1)
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0035:
            boolean r0 = r4 instanceof X.C175338yY
            if (r0 == 0) goto L_0x005d
            r0 = 24
            X.3Bz r1 = new X.3Bz
            r1.<init>(r6, r4, r0)
            goto L_0x002f
        L_0x0041:
            X.C30691eM.A01(r4)
            r0 = 14
            X.4sN r1 = new X.4sN
            r1.<init>(r6, r0)
            r5.L$0 = r6
            r5.label = r2
            r0 = 0
            java.lang.Object r4 = r7.A01(r6, r0, r5, r1)
            if (r4 != r3) goto L_0x0024
            return r3
        L_0x0057:
            X.4uZ r5 = new X.4uZ
            r5.<init>(r6, r8)
            goto L_0x0012
        L_0x005d:
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        L_0x0062:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.passkeys.PasskeyCreateEducationScreen.A03(com.whatsapp.passkeys.PasskeyCreateEducationScreen, com.whatsapp.passkeys.PasskeyFacade, X.1dr):java.lang.Object");
    }

    public static final void A0Q(PasskeyCreateEducationScreen passkeyCreateEducationScreen) {
        AnonymousClass1OB r0 = passkeyCreateEducationScreen.A08;
        if (r0 == null || !r0.Be2()) {
            B8U b8u = passkeyCreateEducationScreen.A02;
            if (b8u != null) {
                C191519mj r02 = passkeyCreateEducationScreen.A03;
                if (r02 == null) {
                    C18070vi.A11("passkeyLogger");
                    throw null;
                }
                PasskeyFacade BGb = b8u.BGb(r02);
                AnonymousClass4Yv.A01(passkeyCreateEducationScreen, 1);
                passkeyCreateEducationScreen.A08 = AnonymousClass3MY.A0s(new PasskeyCreateEducationScreen$onCreateClicked$1(passkeyCreateEducationScreen, BGb, (C30391dr) null), AnonymousClass3MZ.A0H(passkeyCreateEducationScreen));
                return;
            }
            C18070vi.A11("passkeyFacadeFactory");
            throw null;
        }
    }

    public void A2y() {
        if (!this.A09) {
            this.A09 = true;
            AnonymousClass1K1 A0K = C72473Md.A0K(this);
            AnonymousClass10E r2 = A0K.AAQ;
            C72483Me.A0q(r2, this);
            AnonymousClass10G r1 = r2.A00;
            AnonymousClass1FB.A0K(r2, r1, this, r1.A45);
            AnonymousClass1FB.A0L(r2, r1, this, r1.A5A);
            this.A00 = AnonymousClass1K1.A1f(A0K);
            this.A01 = C72463Mc.A0e(r2);
            this.A05 = C72463Mc.A0i(r1);
            this.A02 = (B8U) A0K.A5M.get();
            this.A04 = (B8V) A0K.A5N.get();
            this.A07 = C000200d.A00(A0K.A5O);
            this.A00 = C19890zB.A00;
        }
    }

    public void onCreate(Bundle bundle) {
        String str;
        String str2;
        int i;
        List A002;
        super.onCreate(bundle);
        setContentView(2131624094);
        C57352iw r0 = this.A05;
        if (r0 != null) {
            r0.A00(this);
            A9B.A0Q(this.A00, this, 2131433455, false, false, false);
            this.A06 = (WDSTextLayout) AnonymousClass1HF.A06(this.A00, 2131433454);
            AnonymousClass19D r1 = this.A01;
            if (r1 != null) {
                C18040vf r2 = C18040vf.A02;
                if (C18020vd.A05(r2, r1, 9203)) {
                    AnonymousClass19D r12 = this.A01;
                    if (r12 != null) {
                        int A003 = C18020vd.A00(r2, r12, 10643);
                        str2 = "textLayout";
                        if (A003 != 1) {
                            WDSTextLayout wDSTextLayout = this.A06;
                            if (A003 != 2) {
                                if (wDSTextLayout != null) {
                                    AnonymousClass3MY.A10(this, wDSTextLayout, 2131893558);
                                    C88494Zy[] r4 = new C88494Zy[3];
                                    C88494Zy.A01(C18070vi.A0F(this, 2131893552), (CharSequence) null, r4, 2131232392, 0);
                                    C88494Zy.A02(getString(2131893554), r4, 2131231910);
                                    A002 = C88494Zy.A00(getString(2131893557), r4, 2131233277);
                                }
                                C18070vi.A11(str2);
                                throw null;
                            }
                            if (wDSTextLayout != null) {
                                AnonymousClass3MY.A10(this, wDSTextLayout, 2131893560);
                                C88494Zy[] r42 = new C88494Zy[3];
                                C88494Zy.A01(C18070vi.A0F(this, 2131893553), (CharSequence) null, r42, 2131232392, 0);
                                C88494Zy.A02(getString(2131893556), r42, 2131231910);
                                A002 = C88494Zy.A00(getString(2131893557), r42, 2131233277);
                            }
                            C18070vi.A11(str2);
                            throw null;
                        }
                        WDSTextLayout wDSTextLayout2 = this.A06;
                        if (wDSTextLayout2 != null) {
                            AnonymousClass3MY.A10(this, wDSTextLayout2, 2131893559);
                            C88494Zy[] r43 = new C88494Zy[3];
                            C88494Zy.A01(C18070vi.A0F(this, 2131893553), (CharSequence) null, r43, 2131232392, 0);
                            C88494Zy.A02(getString(2131893555), r43, 2131231910);
                            A002 = C88494Zy.A00(getString(2131893557), r43, 2131233277);
                        }
                        C18070vi.A11(str2);
                        throw null;
                        WDSTextLayout wDSTextLayout3 = this.A06;
                        if (wDSTextLayout3 != null) {
                            AnonymousClass4CF.A00(wDSTextLayout3, A002);
                            WDSTextLayout wDSTextLayout4 = this.A06;
                            if (wDSTextLayout4 != null) {
                                View A062 = AnonymousClass1HF.A06(wDSTextLayout4, 2131429513);
                                C18070vi.A0z(A062, "null cannot be cast to non-null type android.view.ViewGroup");
                                Iterator A004 = C99434so.A00(A062, 1);
                                while (A004.hasNext()) {
                                    View A063 = AnonymousClass1HF.A06(AnonymousClass3MX.A0E(A004), 2131428481);
                                    C18070vi.A0z(A063, "null cannot be cast to non-null type com.whatsapp.WaImageView");
                                    ImageView imageView = (ImageView) A063;
                                    imageView.setColorFilter(AnonymousClass3MZ.A02(imageView.getContext(), imageView.getContext(), 2130971950, 2131103050));
                                }
                            }
                        }
                        C18070vi.A11(str2);
                        throw null;
                    }
                } else {
                    WDSTextLayout wDSTextLayout5 = this.A06;
                    str2 = "textLayout";
                    if (wDSTextLayout5 == null) {
                        C18070vi.A11(str2);
                        throw null;
                    }
                    AnonymousClass3MY.A10(this, wDSTextLayout5, 2131893541);
                    View inflate = View.inflate(this, 2131626310, (ViewGroup) null);
                    C18030ve r14 = this.A0E;
                    AnonymousClass1KB r11 = this.A05;
                    AnonymousClass1L9 r10 = this.A01;
                    AnonymousClass11C r13 = this.A08;
                    String string = getString(2131893551);
                    C26302CxJ.A0K(this, Uri.parse("https://faq.whatsapp.com/5064231857013976"), r10, r11, (TextEmojiLabel) AnonymousClass3MX.A0C(inflate, 2131433456), r13, r14, string, "passkeys_learn_more_uri");
                    WDSTextLayout wDSTextLayout6 = this.A06;
                    if (wDSTextLayout6 == null) {
                        C18070vi.A11(str2);
                        throw null;
                    }
                    AnonymousClass4CG.A00(inflate, wDSTextLayout6);
                }
                AnonymousClass19D r15 = this.A01;
                if (r15 != null) {
                    boolean A052 = C18020vd.A05(r2, r15, 9203);
                    WDSTextLayout wDSTextLayout7 = this.A06;
                    if (A052) {
                        if (wDSTextLayout7 != null) {
                            i = 2131887451;
                        }
                        C18070vi.A11(str2);
                        throw null;
                    }
                    if (wDSTextLayout7 != null) {
                        i = 2131895958;
                    }
                    C18070vi.A11(str2);
                    throw null;
                    AnonymousClass3MY.A0z(this, wDSTextLayout7, i);
                    WDSTextLayout wDSTextLayout8 = this.A06;
                    if (wDSTextLayout8 != null) {
                        wDSTextLayout8.setPrimaryButtonClickListener(new C177659Ab(this, 23));
                        WDSTextLayout wDSTextLayout9 = this.A06;
                        if (wDSTextLayout9 != null) {
                            wDSTextLayout9.setSecondaryButtonText(getString(2131899432));
                            WDSTextLayout wDSTextLayout10 = this.A06;
                            if (wDSTextLayout10 != null) {
                                wDSTextLayout10.setSecondaryButtonClickListener(new C177659Ab(this, 24));
                                B8V b8v = this.A04;
                                if (b8v != null) {
                                    C191519mj BGc = b8v.BGc(1);
                                    this.A03 = BGc;
                                    BGc.A00((String) null, (Throwable) null, 20);
                                    AnonymousClass19D r16 = this.A01;
                                    if (r16 != null) {
                                        if (C18020vd.A05(r2, r16, 10374)) {
                                            A0Q(this);
                                        }
                                        if (C72453Mb.A1a(this.A0A)) {
                                            C19880zA r02 = this.A00;
                                            if (r02 != null) {
                                                r02.A03();
                                                throw AnonymousClass000.A0s("logOnboardingViewEvent");
                                            }
                                            str = "smbOnboardingAnalyticsManager";
                                        } else {
                                            return;
                                        }
                                    } else {
                                        C18070vi.A11("abPreChatdProps");
                                        throw null;
                                    }
                                } else {
                                    str = "passkeyLoggerFactory";
                                }
                            }
                        }
                    }
                    C18070vi.A11(str2);
                    throw null;
                }
            }
            str = "abPreChatdProps";
        } else {
            str = "landscapeModeBacktest";
        }
        C18070vi.A11(str);
        throw null;
    }

    public PasskeyCreateEducationScreen(int i) {
        this.A09 = false;
        C91024f1.A00(this, 5);
    }
}
