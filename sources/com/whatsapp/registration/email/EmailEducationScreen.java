package com.whatsapp.registration.email;

import X.A9B;
import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1FB;
import X.AnonymousClass1K1;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3Ma;
import X.AnonymousClass48o;
import X.AnonymousClass4CF;
import X.C000200d;
import X.C166908eI;
import X.C17880vN;
import X.C18020vd;
import X.C18040vf;
import X.C18070vi;
import X.C190059kJ;
import X.C21428Ajv;
import X.C24261Jm;
import X.C36401np;
import X.C57352iw;
import X.C72453Mb;
import X.C72463Mc;
import X.C72473Md;
import X.C72483Me;
import X.C88494Zy;
import X.C91034f2;
import android.os.Bundle;
import com.whatsapp.wds.components.textlayout.WDSTextLayout;
import java.util.ArrayList;

public final class EmailEducationScreen extends C166908eI {
    public int A00;
    public C57352iw A01;
    public WDSTextLayout A02;
    public AnonymousClass00H A03;
    public AnonymousClass00H A04;
    public AnonymousClass00H A05;
    public AnonymousClass00H A06;
    public AnonymousClass00H A07;
    public String A08;
    public boolean A09;

    public EmailEducationScreen() {
        this(0);
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
            this.A03 = C000200d.A00(r2.A02);
            this.A04 = AnonymousClass3MX.A10(r2);
            this.A05 = C000200d.A00(r1.A9X);
            this.A01 = C72463Mc.A0i(r1);
            this.A06 = C000200d.A00(r1.A30);
            this.A07 = AnonymousClass3MW.A0s(r2);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C72463Mc.A0t(this);
        setContentView(2131625169);
        C57352iw r0 = this.A01;
        if (r0 != null) {
            r0.A00(this);
            A9B.A0Q(this.A00, this, 2131430286, false, false, false);
            this.A00 = getIntent().getIntExtra("entrypoint", 0);
            this.A08 = C72453Mb.A0v(this);
            this.A02 = (WDSTextLayout) C18070vi.A05(this.A00, 2131430285);
            AnonymousClass00H r02 = this.A05;
            if (r02 != null) {
                ((C190059kJ) r02.get()).A00(this.A08, (String) null, this.A00, 5, 8, 3);
                WDSTextLayout wDSTextLayout = this.A02;
                if (wDSTextLayout != null) {
                    AnonymousClass00H r03 = this.A03;
                    if (r03 != null) {
                        if (C18020vd.A05(C18040vf.A02, C17880vN.A0P(r03), 10503)) {
                            AnonymousClass3MY.A10(this, wDSTextLayout, 2131889681);
                            ArrayList A13 = AnonymousClass000.A13();
                            A13.add(new C88494Zy(C18070vi.A0F(this, 2131889675), (CharSequence) null, 2131233476));
                            A13.add(new C88494Zy(C18070vi.A0F(this, 2131889676), (CharSequence) null, 2131233238));
                            A13.add(new C88494Zy(C18070vi.A0F(this, 2131889677), (CharSequence) null, 2131232075));
                            AnonymousClass4CF.A00(wDSTextLayout, A13);
                            AnonymousClass3Ma.A1I(AnonymousClass3Ma.A0E(wDSTextLayout, 2131430969), this.A0E);
                            AnonymousClass00H r04 = this.A06;
                            if (r04 != null) {
                                wDSTextLayout.setFootnoteText(AnonymousClass3MY.A0A(this, (C36401np) r04.get(), new C21428Ajv(this, 2), getString(2131889679), "learn-more"));
                            } else {
                                AnonymousClass3MW.A1E();
                                throw null;
                            }
                        } else {
                            WDSTextLayout wDSTextLayout2 = this.A02;
                            if (wDSTextLayout2 != null) {
                                wDSTextLayout.setHeaderImage(C24261Jm.A00(wDSTextLayout2.getContext(), 2131233648));
                                AnonymousClass3MY.A10(this, wDSTextLayout, 2131889680);
                                wDSTextLayout.setDescriptionText(getString(2131889678));
                            }
                        }
                        WDSTextLayout wDSTextLayout3 = this.A02;
                        if (wDSTextLayout3 != null) {
                            AnonymousClass3MY.A0z(this, wDSTextLayout3, 2131889654);
                            WDSTextLayout wDSTextLayout4 = this.A02;
                            if (wDSTextLayout4 != null) {
                                AnonymousClass48o.A02(wDSTextLayout4, this, 5);
                                WDSTextLayout wDSTextLayout5 = this.A02;
                                if (wDSTextLayout5 != null) {
                                    wDSTextLayout5.setSecondaryButtonText(getString(2131899432));
                                    WDSTextLayout wDSTextLayout6 = this.A02;
                                    if (wDSTextLayout6 != null) {
                                        wDSTextLayout6.setSecondaryButtonClickListener(new AnonymousClass48o(this, 6));
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
                    C18070vi.A11("abPreChatdProps");
                    throw null;
                }
                C18070vi.A11("textLayout");
                throw null;
            }
            C18070vi.A11("emailVerificationLogger");
            throw null;
        }
        C18070vi.A11("landscapeModeBacktest");
        throw null;
    }

    public EmailEducationScreen(int i) {
        this.A09 = false;
        C91034f2.A00(this, 1);
    }
}
