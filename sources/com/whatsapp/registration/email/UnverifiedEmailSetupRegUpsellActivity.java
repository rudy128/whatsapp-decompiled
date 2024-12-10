package com.whatsapp.registration.email;

import X.A9B;
import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass19D;
import X.AnonymousClass1EG;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1K1;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass48o;
import X.AnonymousClass4a6;
import X.AnonymousClass6VI;
import X.C000200d;
import X.C18020vd;
import X.C18040vf;
import X.C18070vi;
import X.C190059kJ;
import X.C19740yt;
import X.C21428Ajv;
import X.C36401np;
import X.C57352iw;
import X.C72453Mb;
import X.C72463Mc;
import X.C72473Md;
import X.C72483Me;
import X.C73203Rj;
import X.C91034f2;
import android.app.Dialog;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import com.whatsapp.wds.components.textlayout.WDSTextLayout;

public final class UnverifiedEmailSetupRegUpsellActivity extends AnonymousClass1FY {
    public int A00;
    public C190059kJ A01;
    public AnonymousClass19D A02;
    public C57352iw A03;
    public WDSTextLayout A04;
    public AnonymousClass00H A05;
    public AnonymousClass00H A06;
    public AnonymousClass00H A07;
    public AnonymousClass00H A08;
    public AnonymousClass00H A09;
    public AnonymousClass00H A0A;
    public String A0B;
    public String A0C;
    public boolean A0D;

    public UnverifiedEmailSetupRegUpsellActivity() {
        this(0);
    }

    public Dialog onCreateDialog(int i) {
        C73203Rj r2;
        int i2;
        if (i == 1) {
            r2 = AnonymousClass4a6.A00(this);
            i2 = 2131889674;
        } else if (i == 2) {
            r2 = C73203Rj.A02(this);
            C73203Rj.A0B(r2, this, 3, 2131899286);
            return r2.create();
        } else if (i != 3) {
            return super.onCreateDialog(i);
        } else {
            r2 = AnonymousClass4a6.A00(this);
            i2 = 2131889717;
        }
        r2.A0D(i2);
        r2.A0T(false);
        return r2.create();
    }

    public void A2y() {
        if (!this.A0D) {
            this.A0D = true;
            AnonymousClass1K1 A0K = C72473Md.A0K(this);
            AnonymousClass10E r1 = A0K.AAQ;
            C72483Me.A0q(r1, this);
            AnonymousClass10G r2 = r1.A00;
            AnonymousClass1FB.A0K(r1, r2, this, r2.A45);
            AnonymousClass1FB.A0L(r1, r2, this, r2.A5A);
            this.A02 = C72463Mc.A0e(r1);
            this.A05 = C000200d.A00(A0K.A07);
            this.A06 = AnonymousClass3MX.A10(r1);
            this.A01 = (C190059kJ) r2.A9X.get();
            this.A07 = C000200d.A00(r1.AKr);
            this.A03 = C72463Mc.A0i(r2);
            this.A08 = C000200d.A00(r2.A30);
            this.A09 = AnonymousClass3MZ.A14(r1);
            this.A0A = AnonymousClass3MW.A0s(r1);
        }
    }

    public final C190059kJ A4b() {
        C190059kJ r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("emailVerificationLogger");
        throw null;
    }

    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        setContentView(2131627252);
        C57352iw r0 = this.A03;
        if (r0 != null) {
            r0.A00(this);
            A9B.A0Q(this.A00, this, 2131436520, false, false, false);
            this.A04 = (WDSTextLayout) C18070vi.A05(this.A00, 2131436519);
            this.A00 = getIntent().getIntExtra("entrypoint", 0);
            this.A0C = C72453Mb.A0v(this);
            String A0o = this.A0A.A0o();
            if (A0o != null) {
                this.A0B = A0o;
                A4b().A00(this.A0C, (String) null, this.A00, 9, 8, 3);
                WDSTextLayout wDSTextLayout = this.A04;
                if (wDSTextLayout == null) {
                    str = "textLayout";
                } else {
                    AnonymousClass3MY.A10(this, wDSTextLayout, 2131897365);
                    Object[] A1b = AnonymousClass3MW.A1b();
                    A1b[0] = AnonymousClass1EG.A03(this, C72463Mc.A01(this));
                    SpannableStringBuilder A092 = AnonymousClass3MW.A09(AnonymousClass6VI.A00(AnonymousClass3Ma.A10(this, this.A0A.A0o(), A1b, 1, 2131897364)));
                    StyleSpan[] styleSpanArr = (StyleSpan[]) A092.getSpans(0, A092.length(), StyleSpan.class);
                    C18070vi.A0b(styleSpanArr);
                    for (StyleSpan styleSpan : styleSpanArr) {
                        if (styleSpan.getStyle() == 1) {
                            A092.setSpan(new ForegroundColorSpan(C19740yt.A00(this, 2131102246)), A092.getSpanStart(styleSpan), A092.getSpanEnd(styleSpan), 33);
                        }
                    }
                    wDSTextLayout.setDescriptionText(A092);
                    AnonymousClass19D r2 = this.A02;
                    if (r2 != null) {
                        if (C18020vd.A05(C18040vf.A02, r2, 11845)) {
                            AnonymousClass3Ma.A1I(AnonymousClass3Ma.A0E(wDSTextLayout, 2131430969), this.A0E);
                            AnonymousClass00H r02 = this.A08;
                            if (r02 != null) {
                                wDSTextLayout.setFootnoteText(AnonymousClass3MY.A0A(this, (C36401np) r02.get(), new C21428Ajv(this, 6), getString(2131889679), "learn-more"));
                            } else {
                                str = "linkifier";
                            }
                        }
                        WDSTextLayout wDSTextLayout2 = this.A04;
                        if (wDSTextLayout2 != null) {
                            AnonymousClass3MY.A0z(this, wDSTextLayout2, 2131889700);
                            WDSTextLayout wDSTextLayout3 = this.A04;
                            if (wDSTextLayout3 != null) {
                                AnonymousClass48o.A02(wDSTextLayout3, this, 8);
                                WDSTextLayout wDSTextLayout4 = this.A04;
                                if (wDSTextLayout4 != null) {
                                    wDSTextLayout4.setSecondaryButtonText(getString(2131899432));
                                    WDSTextLayout wDSTextLayout5 = this.A04;
                                    if (wDSTextLayout5 != null) {
                                        wDSTextLayout5.setSecondaryButtonClickListener(new AnonymousClass48o(this, 7));
                                        return;
                                    }
                                }
                                C18070vi.A11("textLayout");
                                throw null;
                            }
                        }
                        C18070vi.A11("textLayout");
                        throw null;
                    }
                    str = "abPreChatdProps";
                }
                C18070vi.A11(str);
                throw null;
            }
            throw AnonymousClass000.A0n("Email address cannot be null");
        }
        C18070vi.A11("landscapeModeBacktest");
        throw null;
    }

    public UnverifiedEmailSetupRegUpsellActivity(int i) {
        this.A0D = false;
        C91034f2.A00(this, 3);
    }
}
