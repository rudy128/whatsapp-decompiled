package com.whatsapp.dogfood;

import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1K1;
import X.AnonymousClass3MW;
import X.AnonymousClass3Ma;
import X.AnonymousClass4SX;
import X.AnonymousClass5HK;
import X.AnonymousClass5HL;
import X.AnonymousClass5NS;
import X.C18100vl;
import X.C72473Md;
import X.C72483Me;
import X.C83694Gh;
import X.C91004ez;
import X.C99274sY;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import com.whatsapp.WaEditText;
import com.whatsapp.WaTextView;
import com.whatsapp.text.ReadMoreTextView;
import com.whatsapp.wds.components.button.WDSButton;

public final class DogfooderDiagnosticsDetailReportActivity extends AnonymousClass1FY {
    public CheckBox A00;
    public FrameLayout A01;
    public WaEditText A02;
    public WaTextView A03;
    public AnonymousClass4SX A04;
    public ReadMoreTextView A05;
    public WDSButton A06;
    public boolean A07;
    public final C18100vl A08;
    public final C18100vl A09;

    public DogfooderDiagnosticsDetailReportActivity() {
        this(0);
        this.A09 = C99274sY.A00(new AnonymousClass5HL(this), new AnonymousClass5HK(this), new AnonymousClass5NS(this), AnonymousClass3MW.A15(DogfooderDiagnosticsDetailReportViewModel.class));
        this.A08 = C83694Gh.A00(this, "report_type", 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:64:0x0184  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r15) {
        /*
            r14 = this;
            r8 = r14
            super.onCreate(r15)
            r0 = 2131625140(0x7f0e04b4, float:1.887748E38)
            r14.setContentView((int) r0)
            r0 = 2131435881(0x7f0b2169, float:1.8493617E38)
            android.view.View r0 = r14.findViewById(r0)
            com.whatsapp.wds.components.button.WDSButton r0 = (com.whatsapp.wds.components.button.WDSButton) r0
            r14.A06 = r0
            r0 = 2131429370(0x7f0b07fa, float:1.848041E38)
            android.view.View r0 = r14.findViewById(r0)
            android.widget.CheckBox r0 = (android.widget.CheckBox) r0
            r14.A00 = r0
            r0 = 2131434540(0x7f0b1c2c, float:1.8490897E38)
            android.view.View r0 = r14.findViewById(r0)
            com.whatsapp.text.ReadMoreTextView r0 = (com.whatsapp.text.ReadMoreTextView) r0
            r14.A05 = r0
            r0 = 2131429922(0x7f0b0a22, float:1.848153E38)
            android.view.View r0 = r14.findViewById(r0)
            com.whatsapp.WaEditText r0 = (com.whatsapp.WaEditText) r0
            r14.A02 = r0
            r0 = 2131429923(0x7f0b0a23, float:1.8481532E38)
            android.view.View r0 = r14.findViewById(r0)
            com.whatsapp.WaTextView r0 = (com.whatsapp.WaTextView) r0
            r14.A03 = r0
            X.0vl r1 = r14.A08
            int r2 = X.C72453Mb.A0I(r1)
            X.01n r3 = r14.getSupportActionBar()
            if (r3 == 0) goto L_0x006a
            r0 = 1
            r3.A0W(r0)
            X.0vl r0 = r14.A09
            java.lang.Object r0 = r0.getValue()
            com.whatsapp.dogfood.DogfooderDiagnosticsDetailReportViewModel r0 = (com.whatsapp.dogfood.DogfooderDiagnosticsDetailReportViewModel) r0
            X.4Wq r0 = r0.A01
            X.4S3 r2 = X.C87704Wq.A00(r0, r2)
            if (r2 == 0) goto L_0x01ca
            boolean r0 = r2 instanceof X.C80673xl
            if (r0 == 0) goto L_0x01be
            java.lang.String r0 = "Ghost View Report"
        L_0x0067:
            r3.A0S(r0)
        L_0x006a:
            int r5 = X.C72453Mb.A0I(r1)
            com.whatsapp.text.ReadMoreTextView r4 = r14.A05
            if (r4 != 0) goto L_0x0079
            java.lang.String r3 = "reportDetailField"
        L_0x0074:
            X.C18070vi.A11(r3)
        L_0x0077:
            r0 = 0
            throw r0
        L_0x0079:
            X.0vl r2 = r14.A09
            java.lang.Object r0 = r2.getValue()
            com.whatsapp.dogfood.DogfooderDiagnosticsDetailReportViewModel r0 = (com.whatsapp.dogfood.DogfooderDiagnosticsDetailReportViewModel) r0
            X.4Wq r0 = r0.A01
            X.4S3 r0 = X.C87704Wq.A00(r0, r5)
            if (r0 == 0) goto L_0x01a5
            X.5bc r0 = r0.A00
            if (r0 == 0) goto L_0x01a1
            java.lang.String r0 = r0.BQI()
        L_0x0091:
            r4.setText(r0)
            int r4 = X.C72453Mb.A0I(r1)
            r0 = 1
            java.lang.String r6 = "consentCheckbox"
            r3 = 8
            if (r4 == r0) goto L_0x0173
            r0 = 3
            if (r4 == r0) goto L_0x0173
            r5 = 4
            if (r4 == r5) goto L_0x010d
            com.whatsapp.WaEditText r3 = r14.A02
            if (r3 == 0) goto L_0x01b5
            r0 = 9
            X.AnonymousClass48E.A00(r3, r14, r0)
            java.lang.Object r0 = r2.getValue()
            com.whatsapp.dogfood.DogfooderDiagnosticsDetailReportViewModel r0 = (com.whatsapp.dogfood.DogfooderDiagnosticsDetailReportViewModel) r0
            X.1DT r4 = r0.A00
            r0 = 23
            X.4sV r3 = X.C99244sV.A00(r14, r0)
            r0 = 28
            X.C91644g1.A00(r14, r4, r3, r0)
        L_0x00c1:
            java.lang.Object r0 = r2.getValue()
            com.whatsapp.dogfood.DogfooderDiagnosticsDetailReportViewModel r0 = (com.whatsapp.dogfood.DogfooderDiagnosticsDetailReportViewModel) r0
            int r1 = X.C72453Mb.A0I(r1)
            X.4Wq r0 = r0.A01
            X.4S3 r0 = X.C87704Wq.A00(r0, r1)
            if (r0 == 0) goto L_0x010b
            X.5bc r0 = r0.A00
            if (r0 == 0) goto L_0x010b
            boolean r0 = r0.BZo()
        L_0x00db:
            java.lang.String r3 = "submitButton"
            com.whatsapp.wds.components.button.WDSButton r1 = r14.A06
            if (r0 == 0) goto L_0x0104
            if (r1 == 0) goto L_0x0074
            r0 = 0
            r1.setEnabled(r0)
        L_0x00e7:
            java.lang.Object r0 = r2.getValue()
            com.whatsapp.dogfood.DogfooderDiagnosticsDetailReportViewModel r0 = (com.whatsapp.dogfood.DogfooderDiagnosticsDetailReportViewModel) r0
            X.1Fz r3 = r0.A07
            r0 = 0
            com.whatsapp.dogfood.DogfooderDiagnosticsDetailReportActivity$observeSubmitBugViewState$1 r2 = new com.whatsapp.dogfood.DogfooderDiagnosticsDetailReportActivity$observeSubmitBugViewState$1
            r2.<init>(r14, r0)
            r0 = 10
            X.DXs r1 = new X.DXs
            r1.<init>((X.AnonymousClass1OS) r2, (X.C23421Fz) r3, (int) r0)
            X.1pm r0 = X.AnonymousClass3MZ.A0H(r14)
            X.C88604aC.A03(r0, r1)
            return
        L_0x0104:
            if (r1 == 0) goto L_0x0074
            r0 = 5
            X.C89934dG.A00(r1, r14, r0)
            goto L_0x00e7
        L_0x010b:
            r0 = 1
            goto L_0x00db
        L_0x010d:
            com.whatsapp.wds.components.button.WDSButton r4 = r14.A06
            if (r4 != 0) goto L_0x0115
            java.lang.String r3 = "submitButton"
            goto L_0x0074
        L_0x0115:
            android.widget.CheckBox r0 = r14.A00
            if (r0 == 0) goto L_0x01b9
            boolean r0 = r0.isChecked()
            r4.setEnabled(r0)
            android.widget.CheckBox r4 = r14.A00
            if (r4 == 0) goto L_0x01b9
            r0 = 9
            X.C90874em.A00(r4, r14, r0)
            r0 = 2131429830(0x7f0b09c6, float:1.8481344E38)
            android.view.View r0 = r14.findViewById(r0)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r14.A01 = r0
            java.lang.Object r0 = r2.getValue()
            com.whatsapp.dogfood.DogfooderDiagnosticsDetailReportViewModel r0 = (com.whatsapp.dogfood.DogfooderDiagnosticsDetailReportViewModel) r0
            android.widget.FrameLayout r11 = r14.A01
            if (r11 != 0) goto L_0x0142
            java.lang.String r3 = "debugViewContainer"
            goto L_0x0074
        L_0x0142:
            X.4SX r12 = r14.A04
            if (r12 == 0) goto L_0x01b1
            X.4Wq r0 = r0.A01
            X.4S3 r9 = X.C87704Wq.A00(r0, r5)
            boolean r0 = r9 instanceof X.C80663xk
            if (r0 == 0) goto L_0x017a
            X.3xk r9 = (X.C80663xk) r9
            if (r9 == 0) goto L_0x017a
            X.5ZI r7 = r9.A01
            android.content.Context r6 = r11.getContext()
            X.1GP r5 = r14.getSupportFragmentManager()
            X.10I r4 = r9.A03
            X.2Py r0 = X.AnonymousClass68H.A01(r4)
            X.4a2 r10 = r7.BGL(r6, r5, r0)
            r13 = 22
            X.AkZ r7 = new X.AkZ
            r7.<init>(r8, r9, r10, r11, r12, r13)
            r4.CGF(r7)
            goto L_0x017a
        L_0x0173:
            android.widget.CheckBox r0 = r14.A00
            if (r0 == 0) goto L_0x01b9
            r0.setVisibility(r3)
        L_0x017a:
            r0 = 2131429926(0x7f0b0a26, float:1.8481539E38)
            X.AnonymousClass3MX.A1H(r14, r0, r3)
            com.whatsapp.WaEditText r0 = r14.A02
            if (r0 == 0) goto L_0x01b5
            r0.setVisibility(r3)
            r0 = 2131433915(0x7f0b19bb, float:1.848963E38)
            X.AnonymousClass3MX.A1H(r14, r0, r3)
            r0 = 2131433914(0x7f0b19ba, float:1.8489627E38)
            X.AnonymousClass3MX.A1H(r14, r0, r3)
            r0 = 2131430102(0x7f0b0ad6, float:1.8481895E38)
            X.AnonymousClass3MX.A1H(r14, r0, r3)
            r0 = 2131427707(0x7f0b017b, float:1.8477038E38)
            X.AnonymousClass3MX.A1H(r14, r0, r3)
            goto L_0x00c1
        L_0x01a1:
            java.lang.String r0 = "not set yet"
            goto L_0x0091
        L_0x01a5:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()
            java.lang.String r0 = "not implemented yet "
            java.lang.String r0 = X.AnonymousClass001.A1I(r0, r3, r5)
            goto L_0x0091
        L_0x01b1:
            java.lang.String r3 = "conversationRowCustomizers"
            goto L_0x0074
        L_0x01b5:
            java.lang.String r3 = "describeProblemField"
            goto L_0x0074
        L_0x01b9:
            X.C18070vi.A11(r6)
            goto L_0x0077
        L_0x01be:
            boolean r0 = r2 instanceof X.C80653xj
            if (r0 == 0) goto L_0x01c6
            java.lang.String r0 = "Crash Report"
            goto L_0x0067
        L_0x01c6:
            java.lang.String r0 = "Slow Conversation Row Report"
            goto L_0x0067
        L_0x01ca:
            java.lang.String r0 = "None Report"
            goto L_0x0067
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.dogfood.DogfooderDiagnosticsDetailReportActivity.onCreate(android.os.Bundle):void");
    }

    public void A2y() {
        if (!this.A07) {
            this.A07 = true;
            AnonymousClass1K1 A0K = C72473Md.A0K(this);
            AnonymousClass10E r2 = A0K.AAQ;
            C72483Me.A0q(r2, this);
            AnonymousClass10G r1 = r2.A00;
            AnonymousClass1FB.A0K(r2, r1, this, r1.A45);
            AnonymousClass1FB.A0L(r2, r1, this, r1.A5A);
            this.A04 = AnonymousClass3Ma.A0W(A0K);
        }
    }

    public DogfooderDiagnosticsDetailReportActivity(int i) {
        this.A07 = false;
        C91004ez.A00(this, 48);
    }
}
