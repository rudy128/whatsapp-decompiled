package com.whatsapp.product.newsletterenforcements.newsletterguidelines;

import X.AnonymousClass00H;
import X.AnonymousClass1DF;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3Ma;
import X.AnonymousClass45R;
import X.AnonymousClass45S;
import X.AnonymousClass45T;
import X.AnonymousClass45U;
import X.AnonymousClass5K7;
import X.C17880vN;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C18100vl;
import X.C21448AkF;
import X.C28931bI;
import X.C36401np;
import X.C72453Mb;
import X.C88414Zp;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public final class NewsletterGuidelinesFragment extends Hilt_NewsletterGuidelinesFragment {
    public C18030ve A00;
    public C36401np A01;
    public AnonymousClass00H A02;
    public final C18100vl A03 = C88414Zp.A00(this, "show-what-this-means-section");
    public final C18100vl A04 = C88414Zp.A00(this, "show-what-you-can-do-section");
    public final C18100vl A05 = C88414Zp.A00(this, "show-what-you-need-to-know-section");
    public final C18100vl A06 = AnonymousClass1DF.A01(new AnonymousClass5K7(this));

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        return layoutInflater.inflate(2131626195, viewGroup, false);
    }

    public void A21(Bundle bundle, View view) {
        String str;
        int i;
        int i2;
        C18070vi.A0d(view, 0);
        View A0C = AnonymousClass3MX.A0C(view, 2131433019);
        C18100vl r5 = this.A03;
        int i3 = 0;
        A0C.setVisibility(C72453Mb.A07(C72453Mb.A1a(r5) ? 1 : 0));
        View A0C2 = AnonymousClass3MX.A0C(view, 2131433021);
        C18100vl r4 = this.A04;
        A0C2.setVisibility(C72453Mb.A07(C72453Mb.A1a(r4) ? 1 : 0));
        View A0C3 = AnonymousClass3MX.A0C(view, 2131433023);
        C18100vl r3 = this.A05;
        if (!C72453Mb.A1a(r3)) {
            i3 = 8;
        }
        A0C3.setVisibility(i3);
        if (C72453Mb.A1a(r5)) {
            TextView A0E = C17880vN.A0E(view, 2131433020);
            Object value = this.A06.getValue();
            if (value instanceof AnonymousClass45R) {
                i2 = 2131892661;
            } else if (value instanceof AnonymousClass45U) {
                i2 = 2131890758;
            } else if (value instanceof AnonymousClass45T) {
                i2 = 2131892662;
            } else if (!(value instanceof AnonymousClass45S)) {
                throw AnonymousClass3MW.A14();
            }
            Integer valueOf = Integer.valueOf(i2);
            if (valueOf != null) {
                A0E.setText(valueOf.intValue());
            }
        }
        if (C72453Mb.A1a(r4)) {
            TextView A0E2 = C17880vN.A0E(view, 2131433022);
            Object value2 = this.A06.getValue();
            if (value2 instanceof AnonymousClass45R) {
                i = 2131892665;
            } else if ((value2 instanceof AnonymousClass45U) || (value2 instanceof AnonymousClass45T)) {
                i = 2131892667;
            } else if (value2 instanceof AnonymousClass45S) {
                i = 2131892666;
            }
            A0E2.setText(i);
        }
        if (C72453Mb.A1a(r3)) {
            TextView A0E3 = C17880vN.A0E(view, 2131433081);
            C36401np r42 = this.A01;
            if (r42 != null) {
                A0E3.setText(r42.A05(A1B(), new C21448AkF(this, 46), AnonymousClass3MX.A16(this, "bottom-sheet-span", new Object[1], 0, 2131892658), "bottom-sheet-span"));
                C18030ve r0 = this.A00;
                if (r0 != null) {
                    AnonymousClass3Ma.A1I(A0E3, r0);
                    TextView A0E4 = C17880vN.A0E(view, 2131432995);
                    C36401np r43 = this.A01;
                    if (r43 != null) {
                        A0E4.setText(r43.A05(A1B(), new C21448AkF(this, 47), AnonymousClass3MY.A0o(this, "bottom-sheet-span", 0, 2131892656), "bottom-sheet-span"));
                        C18030ve r02 = this.A00;
                        if (r02 != null) {
                            AnonymousClass3Ma.A1I(A0E4, r02);
                            C18030ve r2 = this.A00;
                            if (r2 != null) {
                                if (C18020vd.A05(C18040vf.A02, r2, 7592)) {
                                    TextView A0E5 = C17880vN.A0E(AnonymousClass3MY.A0I(C28931bI.A00(view, 2131433008), 0), 2131433009);
                                    C36401np r44 = this.A01;
                                    if (r44 != null) {
                                        A0E5.setText(r44.A05(A1B(), new C21448AkF(this, 48), AnonymousClass3MY.A0o(this, "bottom-sheet-span", 0, 2131892657), "bottom-sheet-span"));
                                        C18030ve r03 = this.A00;
                                        if (r03 != null) {
                                            AnonymousClass3Ma.A1I(A0E5, r03);
                                            return;
                                        }
                                    }
                                } else {
                                    return;
                                }
                            }
                        }
                    }
                }
                str = "abProps";
                C18070vi.A11(str);
                throw null;
            }
            str = "linkifier";
            C18070vi.A11(str);
            throw null;
        }
    }
}
