package com.whatsapp.datasharingdisclosure.ui;

import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass1BI;
import X.AnonymousClass1DF;
import X.AnonymousClass1L9;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass4X2;
import X.AnonymousClass5NP;
import X.AnonymousClass706;
import X.AnonymousClass73F;
import X.C107315Zf;
import X.C133736pP;
import X.C17880vN;
import X.C18070vi;
import X.C18100vl;
import X.C72463Mc;
import X.C86364Ri;
import X.C89924dF;
import X.C99154sM;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ConsumerMarketingDisclosureFragment extends Hilt_ConsumerMarketingDisclosureFragment implements C107315Zf {
    public AnonymousClass1L9 A00;
    public AnonymousClass00H A01;
    public AnonymousClass00H A02;
    public AnonymousClass00H A03;
    public boolean A04;
    public final C18100vl A05 = AnonymousClass1DF.A00(AnonymousClass00R.A0C, new AnonymousClass5NP(this));
    public final C18100vl A06 = C99154sM.A01(this, 5);
    public final C18100vl A07 = C99154sM.A01(this, 4);

    public void A1x(Context context) {
        C18070vi.A0d(context, 0);
        super.A1x(context);
        C18100vl r1 = this.A07;
        this.A02 = ((AnonymousClass4X2) r1.getValue()).A06;
        this.A09 = ((AnonymousClass4X2) r1.getValue()).A08;
        this.A0B = ((AnonymousClass4X2) r1.getValue()).A0B;
        this.A01 = ((AnonymousClass4X2) r1.getValue()).A04;
        this.A00 = ((AnonymousClass4X2) r1.getValue()).A03;
        this.A0A = ((AnonymousClass4X2) r1.getValue()).A0A;
    }

    public void A21(Bundle bundle, View view) {
        String str;
        View view2 = view;
        C18070vi.A0d(view2, 0);
        super.A21(bundle, view2);
        Integer A2K = A2K();
        Integer num = AnonymousClass00R.A0Y;
        if (A2K != num) {
            AnonymousClass00H r0 = this.A01;
            if (r0 != null) {
                ((C133736pP) ((AnonymousClass73F) r0.get()).A06.get()).A00(AnonymousClass00R.A01);
            }
            str = "consumerMarketingDisclosureManager";
            C18070vi.A11(str);
            throw null;
        }
        if (A2K() == AnonymousClass00R.A00) {
            if (!this.A04) {
                AnonymousClass00H r02 = this.A01;
                if (r02 != null) {
                    ((AnonymousClass73F) r02.get()).A03(AnonymousClass3MX.A0m(this.A05));
                    this.A04 = true;
                }
                str = "consumerMarketingDisclosureManager";
                C18070vi.A11(str);
                throw null;
            }
            AnonymousClass00H r03 = this.A02;
            if (r03 != null) {
                ((C86364Ri) r03.get()).A01();
            } else {
                str = "consumerMarketingDisclosurePresentationHelper";
                C18070vi.A11(str);
                throw null;
            }
        }
        if (A2K() == num) {
            TextView A0E = C17880vN.A0E(view2, 2131427466);
            view2.findViewById(2131428811).setVisibility(8);
            A0E.setVisibility(0);
            C89924dF.A00(A0E, this, 33);
            A0E.setText(2131899101);
        }
        int intValue = A2K().intValue();
        int i = 1;
        if (intValue != 0) {
            i = 2;
            if (intValue == 1) {
                i = 0;
            } else if (intValue != 4) {
                i = 4;
                if (intValue == 2) {
                    i = 3;
                } else if (intValue != 3) {
                    throw AnonymousClass3MW.A14();
                }
            }
        }
        AnonymousClass00H r04 = this.A03;
        if (r04 != null) {
            AnonymousClass1BI A0m = AnonymousClass3MX.A0m(this.A05);
            AnonymousClass706.A00(A0m, (AnonymousClass706) r04.get(), (Boolean) null, (Boolean) null, (Integer) null, (Integer) null, C72463Mc.A0k(A0m, i), (Integer) null, (Integer) null, (Integer) null, (String) null, 3);
            return;
        }
        str = "disclosureLoggingUtil";
        C18070vi.A11(str);
        throw null;
    }

    public void A1s() {
        AnonymousClass00H r0 = this.A03;
        if (r0 != null) {
            AnonymousClass1BI A0m = AnonymousClass3MX.A0m(this.A05);
            C18070vi.A0d(A0m, 0);
            AnonymousClass706.A00(A0m, (AnonymousClass706) r0.get(), (Boolean) null, (Boolean) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (String) null, 4);
            super.A1s();
            return;
        }
        C18070vi.A11("disclosureLoggingUtil");
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0020, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r2, 10379) == false) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1z(android.os.Bundle r4) {
        /*
            r3 = this;
            super.A1z(r4)
            java.lang.Integer r1 = r3.A2K()
            java.lang.Integer r0 = X.AnonymousClass00R.A0Y
            if (r1 != r0) goto L_0x0022
            X.00H r0 = r3.A01
            if (r0 == 0) goto L_0x0026
            java.lang.Object r0 = r0.get()
            X.73F r0 = (X.AnonymousClass73F) r0
            X.0ve r2 = r0.A03
            r1 = 10379(0x288b, float:1.4544E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r1 = X.C18020vd.A05(r0, r2, r1)
            r0 = 0
            if (r1 != 0) goto L_0x0023
        L_0x0022:
            r0 = 1
        L_0x0023:
            r3.A0E = r0
            return
        L_0x0026:
            java.lang.String r0 = "consumerMarketingDisclosureManager"
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.datasharingdisclosure.ui.ConsumerMarketingDisclosureFragment.A1z(android.os.Bundle):void");
    }
}
