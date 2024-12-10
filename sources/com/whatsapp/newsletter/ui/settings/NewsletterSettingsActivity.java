package com.whatsapp.newsletter.ui.settings;

import X.AGC;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1CJ;
import X.AnonymousClass1FY;
import X.AnonymousClass3Ma;
import X.C000200d;
import X.C137116uw;
import X.C29681ch;
import X.C63662tU;
import X.C63932tv;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import com.whatsapp.WaTextView;

public final class NewsletterSettingsActivity extends AnonymousClass1FY {
    public RadioButton A00;
    public RadioButton A01;
    public RadioButton A02;
    public RadioGroup A03;
    public WaTextView A04;
    public AnonymousClass1CJ A05;
    public C29681ch A06;
    public AnonymousClass00H A07;
    public AnonymousClass00H A08;
    public AnonymousClass00H A09;
    public boolean A0A;

    public void A2y() {
        if (!this.A0A) {
            this.A0A = true;
            AnonymousClass10E r2 = C137116uw.A00(this).AAQ;
            C63932tv.A02(r2, this);
            AnonymousClass10G r1 = r2.A00;
            C63932tv.A00(r2, r1, r1, this);
            C63662tU.A00(r2, r1, this, r1.A5A);
            this.A05 = AnonymousClass3Ma.A0d(r2);
            this.A07 = C000200d.A00(r2.A7C);
            this.A08 = C000200d.A00(r2.A7M);
            this.A09 = C000200d.A00(r1.AE0);
        }
    }

    public NewsletterSettingsActivity(int i) {
        this.A0A = false;
        AGC.A00(this, 6);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0135, code lost:
        if (r0 == null) goto L_0x0137;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x014b, code lost:
        if (r0 == null) goto L_0x014d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0153, code lost:
        if (r0 == null) goto L_0x0155;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r10) {
        /*
            r9 = this;
            super.onCreate(r10)
            X.25J r1 = X.C29681ch.A03
            android.content.Intent r0 = r9.getIntent()
            java.lang.String r2 = "jid"
            java.lang.String r0 = r0.getStringExtra(r2)
            X.1ch r0 = r1.A01(r0)
            if (r0 != 0) goto L_0x0019
            r9.finish()
            return
        L_0x0019:
            r9.A06 = r0
            r0 = 2131624090(0x7f0e009a, float:1.887535E38)
            r9.setContentView((int) r0)
            X.01n r1 = r9.getSupportActionBar()
            if (r1 == 0) goto L_0x0031
            r0 = 1
            r1.A0W(r0)
            r0 = 2131892811(0x7f121a4b, float:1.942038E38)
            r1.A0M(r0)
        L_0x0031:
            r0 = 2131433074(0x7f0b1672, float:1.8487923E38)
            android.view.View r0 = X.AnonymousClass3MY.A0H(r9, r0)
            com.whatsapp.WaTextView r0 = (com.whatsapp.WaTextView) r0
            r9.A04 = r0
            r0 = 2131433075(0x7f0b1673, float:1.8487925E38)
            android.view.View r0 = X.AnonymousClass3MY.A0H(r9, r0)
            android.widget.RadioGroup r0 = (android.widget.RadioGroup) r0
            r9.A03 = r0
            r0 = 2131434338(0x7f0b1b62, float:1.8490487E38)
            android.view.View r0 = X.AnonymousClass3MY.A0H(r9, r0)
            android.widget.RadioButton r0 = (android.widget.RadioButton) r0
            r9.A00 = r0
            r0 = 2131434363(0x7f0b1b7b, float:1.8490538E38)
            android.view.View r0 = X.AnonymousClass3MY.A0H(r9, r0)
            android.widget.RadioButton r0 = (android.widget.RadioButton) r0
            r9.A01 = r0
            r0 = 2131434365(0x7f0b1b7d, float:1.8490542E38)
            android.view.View r0 = X.AnonymousClass3MY.A0H(r9, r0)
            android.widget.RadioButton r0 = (android.widget.RadioButton) r0
            r9.A02 = r0
            r0 = 2131433074(0x7f0b1672, float:1.8487923E38)
            android.widget.TextView r1 = X.AnonymousClass3MX.A0L(r9, r0)
            if (r1 == 0) goto L_0x0077
            r0 = 2131892759(0x7f121a17, float:1.9420275E38)
            r1.setText(r0)
        L_0x0077:
            android.widget.RadioButton r1 = r9.A00
            if (r1 != 0) goto L_0x0082
            java.lang.String r0 = "anyButton"
        L_0x007d:
            X.C18070vi.A11(r0)
        L_0x0080:
            r0 = 0
            throw r0
        L_0x0082:
            r0 = 2131892760(0x7f121a18, float:1.9420277E38)
            r1.setText(r0)
            android.widget.RadioButton r1 = r9.A02
            if (r1 != 0) goto L_0x008f
            java.lang.String r0 = "noneButton"
            goto L_0x007d
        L_0x008f:
            r0 = 2131892763(0x7f121a1b, float:1.9420283E38)
            r1.setText(r0)
            android.widget.RadioButton r6 = r9.A01
            java.lang.String r8 = "defaultButton"
            if (r6 == 0) goto L_0x013e
            r7 = 2131892762(0x7f121a1a, float:1.9420281E38)
            java.lang.Object[] r4 = X.AnonymousClass3MW.A1a()
            r3 = 0
            java.util.List r1 = X.C25452Cg4.A00
            java.lang.String r0 = " "
            r5 = 0
            java.lang.String r0 = X.C29431cG.A0h(r0, r1, r5)
            java.lang.String r0 = X.AnonymousClass1YF.A0I(r0)
            java.lang.String r4 = X.C17880vN.A0q(r9, r0, r4, r3, r7)
            android.widget.RadioButton r0 = r9.A01
            if (r0 == 0) goto L_0x013e
            android.text.TextPaint r3 = r0.getPaint()
            X.C18070vi.A0X(r3)
            X.1KW r1 = r9.A0D
            X.C18070vi.A0W(r1)
            r0 = 1065353216(0x3f800000, float:1.0)
            java.lang.CharSequence r0 = X.C43251zV.A04(r9, r3, r1, r4, r0)
            r6.setText(r0)
            android.widget.RadioButton r1 = r9.A00
            if (r1 != 0) goto L_0x00d7
            java.lang.String r8 = "anyButton"
        L_0x00d3:
            X.C18070vi.A11(r8)
            throw r5
        L_0x00d7:
            r0 = 22
            X.AnonymousClass3Ma.A19(r1, r9, r0)
            android.widget.RadioButton r1 = r9.A02
            if (r1 != 0) goto L_0x00e3
            java.lang.String r8 = "noneButton"
            goto L_0x00d3
        L_0x00e3:
            r0 = 23
            X.AnonymousClass3Ma.A19(r1, r9, r0)
            android.widget.RadioButton r1 = r9.A01
            if (r1 == 0) goto L_0x00d3
            r0 = 24
            X.AnonymousClass3Ma.A19(r1, r9, r0)
            android.widget.RadioButton r0 = r9.A01
            if (r0 == 0) goto L_0x0155
            r1 = 0
            r0.setChecked(r1)
            android.widget.RadioButton r0 = r9.A02
            java.lang.String r4 = "noneButton"
            if (r0 == 0) goto L_0x0137
            r0.setChecked(r1)
            android.widget.RadioButton r0 = r9.A00
            java.lang.String r3 = "anyButton"
            if (r0 == 0) goto L_0x014d
            r0.setChecked(r1)
            X.00H r0 = r9.A09
            if (r0 == 0) goto L_0x0143
            java.lang.Object r0 = r0.get()
            X.9er r0 = (X.C186849er) r0
            X.1ch r1 = r9.A06
            if (r1 == 0) goto L_0x0145
            X.1CJ r0 = r0.A01
            X.1ci r1 = X.AnonymousClass1CJ.A00(r0, r1)
            boolean r0 = r1 instanceof X.C46162Dk
            if (r0 == 0) goto L_0x013b
            X.2Dk r1 = (X.C46162Dk) r1
            if (r1 == 0) goto L_0x013b
            X.9Ih r0 = r1.A03
        L_0x0129:
            int r2 = r0.ordinal()
            r1 = 1
            if (r2 == r1) goto L_0x0149
            r0 = 0
            if (r2 == r0) goto L_0x0151
            android.widget.RadioButton r0 = r9.A02
            if (r0 != 0) goto L_0x0159
        L_0x0137:
            X.C18070vi.A11(r4)
            throw r5
        L_0x013b:
            X.9Ih r0 = X.C179519Ih.DEFAULT
            goto L_0x0129
        L_0x013e:
            X.C18070vi.A11(r8)
            goto L_0x0080
        L_0x0143:
            java.lang.String r2 = "settingsManager"
        L_0x0145:
            X.C18070vi.A11(r2)
            throw r5
        L_0x0149:
            android.widget.RadioButton r0 = r9.A00
            if (r0 != 0) goto L_0x0159
        L_0x014d:
            X.C18070vi.A11(r3)
            throw r5
        L_0x0151:
            android.widget.RadioButton r0 = r9.A01
            if (r0 != 0) goto L_0x0159
        L_0x0155:
            X.C18070vi.A11(r8)
            throw r5
        L_0x0159:
            r0.setChecked(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.newsletter.ui.settings.NewsletterSettingsActivity.onCreate(android.os.Bundle):void");
    }

    public NewsletterSettingsActivity() {
        this(0);
    }
}
