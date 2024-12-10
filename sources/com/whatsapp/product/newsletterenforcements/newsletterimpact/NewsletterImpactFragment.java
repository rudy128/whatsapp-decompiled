package com.whatsapp.product.newsletterenforcements.newsletterimpact;

import X.AnonymousClass00H;
import X.AnonymousClass1DF;
import X.AnonymousClass5K8;
import X.AnonymousClass5K9;
import X.AnonymousClass5KA;
import X.AnonymousClass5KB;
import X.AnonymousClass5KC;
import X.AnonymousClass5KD;
import X.C17880vN;
import X.C18030ve;
import X.C18070vi;
import X.C18100vl;
import X.C36401np;
import X.C89494cY;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.product.newsletterenforcements.newsletterguidelines.NewsletterGuidelinesDecisionProcessBottomSheet;

public final class NewsletterImpactFragment extends Hilt_NewsletterImpactFragment {
    public C18030ve A00;
    public C36401np A01;
    public AnonymousClass00H A02;
    public final C18100vl A03 = AnonymousClass1DF.A01(new AnonymousClass5K8(this));
    public final C18100vl A04 = AnonymousClass1DF.A01(new AnonymousClass5K9(this));
    public final C18100vl A05 = AnonymousClass1DF.A01(new AnonymousClass5KA(this));
    public final C18100vl A06 = AnonymousClass1DF.A01(new AnonymousClass5KB(this));
    public final C18100vl A07 = AnonymousClass1DF.A01(new AnonymousClass5KC(this));
    public final C18100vl A08 = AnonymousClass1DF.A01(new AnonymousClass5KD(this));

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        return layoutInflater.inflate(2131626183, viewGroup, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x00fa  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A21(android.os.Bundle r10, android.view.View r11) {
        /*
            r9 = this;
            r6 = 0
            X.C18070vi.A0d(r11, r6)
            r0 = 2131433024(0x7f0b1640, float:1.8487822E38)
            android.widget.TextView r2 = X.C17880vN.A0E(r11, r0)
            android.content.Context r1 = r9.A14()
            r0 = 2132084413(0x7f1506bd, float:1.9808996E38)
            r2.setTextAppearance(r1, r0)
            r0 = 2131433081(0x7f0b1679, float:1.8487938E38)
            android.widget.TextView r8 = X.C17880vN.A0E(r11, r0)
            X.1np r4 = r9.A01
            if (r4 == 0) goto L_0x01b8
            X.1FL r3 = r9.A1B()
            r1 = 2131892658(0x7f1219b2, float:1.942007E38)
            r5 = 1
            java.lang.Object[] r0 = new java.lang.Object[r5]
            java.lang.String r7 = "bottom-sheet-span"
            java.lang.String r2 = X.AnonymousClass3MX.A16(r9, r7, r0, r6, r1)
            r1 = 49
            X.AkF r0 = new X.AkF
            r0.<init>(r9, r1)
            android.text.SpannableStringBuilder r0 = r4.A05(r3, r0, r2, r7)
            r8.setText(r0)
            X.0ve r0 = r9.A00
            if (r0 == 0) goto L_0x01b5
            X.AnonymousClass3Ma.A1I(r8, r0)
            r0 = 2131432995(0x7f0b1623, float:1.8487763E38)
            android.widget.TextView r4 = X.C17880vN.A0E(r11, r0)
            X.1np r3 = r9.A01
            if (r3 == 0) goto L_0x01b8
            X.1FL r2 = r9.A1B()
            r0 = 2131892656(0x7f1219b0, float:1.9420066E38)
            java.lang.String r1 = X.AnonymousClass3MY.A0o(r9, r7, r6, r0)
            X.7Qm r0 = new X.7Qm
            r0.<init>((java.lang.Object) r9, (int) r6)
            android.text.SpannableStringBuilder r0 = r3.A05(r2, r0, r1, r7)
            r4.setText(r0)
            X.0ve r0 = r9.A00
            if (r0 == 0) goto L_0x01b5
            X.AnonymousClass3Ma.A1I(r4, r0)
            X.0ve r2 = r9.A00
            if (r2 == 0) goto L_0x01b5
            r1 = 7592(0x1da8, float:1.0639E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x00b0
            r0 = 2131433008(0x7f0b1630, float:1.848779E38)
            X.1bI r0 = X.C28931bI.A00(r11, r0)
            android.view.View r1 = X.AnonymousClass3MY.A0I(r0, r6)
            r0 = 2131433009(0x7f0b1631, float:1.8487792E38)
            android.widget.TextView r4 = X.C17880vN.A0E(r1, r0)
            X.1np r3 = r9.A01
            if (r3 == 0) goto L_0x01b8
            X.1FL r2 = r9.A1B()
            r0 = 2131892657(0x7f1219b1, float:1.9420068E38)
            java.lang.String r1 = X.AnonymousClass3MY.A0o(r9, r7, r6, r0)
            X.7Qm r0 = new X.7Qm
            r0.<init>((java.lang.Object) r9, (int) r5)
            android.text.SpannableStringBuilder r0 = r3.A05(r2, r0, r1, r7)
            r4.setText(r0)
            X.0ve r0 = r9.A00
            if (r0 == 0) goto L_0x01b5
            X.AnonymousClass3Ma.A1I(r4, r0)
        L_0x00b0:
            X.0vl r3 = r9.A06
            java.lang.Object r1 = r3.getValue()
            boolean r0 = r1 instanceof X.AnonymousClass443
            if (r0 == 0) goto L_0x010f
            android.widget.TextView r1 = X.C72483Me.A0N(r9)
            r0 = 2131892673(0x7f1219c1, float:1.94201E38)
            r1.setText(r0)
            java.lang.Object r0 = r3.getValue()
            X.4cY r0 = (X.C89494cY) r0
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2ViolationCategory r0 = r0.A03()
            int r0 = X.AnonymousClass4HN.A00(r0)
            java.lang.String r2 = X.AnonymousClass3MY.A0n(r9, r0)
            r1 = 2131892615(0x7f121987, float:1.9419983E38)
        L_0x00d9:
            java.lang.Object[] r0 = X.AnonymousClass3MW.A1b()
            java.lang.String r7 = "link-span"
            r0[r6] = r7
            r0[r5] = r2
        L_0x00e3:
            java.lang.String r6 = r9.A1I(r1, r0)
            X.C18070vi.A0X(r6)
            X.0vl r0 = r9.A03
            java.lang.Object r1 = r0.getValue()
            com.whatsapp.WaTextView r1 = (com.whatsapp.WaTextView) r1
            android.content.Context r4 = r9.A14()
            X.1np r3 = r9.A01
            if (r3 == 0) goto L_0x01b8
            int r8 = X.C72463Mc.A02(r4)
            r0 = 2
            X.7Qm r5 = new X.7Qm
            r5.<init>((java.lang.Object) r9, (int) r0)
            android.text.SpannableStringBuilder r0 = r3.A06(r4, r5, r6, r7, r8)
            r1.setText(r0)
            X.C72473Md.A1D(r1)
        L_0x010e:
            return
        L_0x010f:
            boolean r0 = r1 instanceof X.AnonymousClass444
            if (r0 == 0) goto L_0x0151
            X.0vl r0 = r9.A04
            android.widget.ImageView r1 = X.AnonymousClass3MX.A0J(r0)
            r0 = 2131233217(0x7f0809c1, float:1.8082565E38)
            r1.setImageResource(r0)
            X.0vl r0 = r9.A07
            android.widget.ImageView r1 = X.AnonymousClass3MX.A0J(r0)
            r0 = 2131231805(0x7f08043d, float:1.8079701E38)
            r1.setImageResource(r0)
            X.0vl r0 = r9.A05
            java.lang.Object r1 = r0.getValue()
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0 = 2131892672(0x7f1219c0, float:1.9420099E38)
            r1.setText(r0)
            X.0vl r0 = r9.A08
            java.lang.Object r1 = r0.getValue()
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0 = 2131892675(0x7f1219c3, float:1.9420105E38)
            r1.setText(r0)
            r1 = 2131892641(0x7f1219a1, float:1.9420036E38)
        L_0x014a:
            java.lang.Object[] r0 = new java.lang.Object[r5]
            java.lang.String r7 = "link-span"
            r0[r6] = r7
            goto L_0x00e3
        L_0x0151:
            boolean r0 = r1 instanceof X.AnonymousClass446
            if (r0 == 0) goto L_0x0163
            android.widget.TextView r1 = X.C72483Me.A0N(r9)
            r0 = 2131892674(0x7f1219c2, float:1.9420103E38)
            r1.setText(r0)
            r1 = 2131892594(0x7f121972, float:1.941994E38)
            goto L_0x014a
        L_0x0163:
            boolean r0 = r1 instanceof X.AnonymousClass445
            if (r0 == 0) goto L_0x0180
            android.widget.TextView r1 = X.C72483Me.A0N(r9)
            r0 = 2131892673(0x7f1219c1, float:1.94201E38)
            r1.setText(r0)
            X.0vl r0 = r9.A03
            java.lang.Object r1 = r0.getValue()
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0 = 2131892543(0x7f12193f, float:1.9419837E38)
            r1.setText(r0)
            return
        L_0x0180:
            boolean r0 = r1 instanceof X.AnonymousClass442
            if (r0 == 0) goto L_0x010e
            android.view.View r1 = r9.A17()
            r0 = 2131433027(0x7f0b1643, float:1.8487828E38)
            android.view.View r0 = r1.findViewById(r0)
            r2 = 8
            r0.setVisibility(r2)
            android.view.View r1 = r9.A17()
            r0 = 2131433028(0x7f0b1644, float:1.848783E38)
            X.AnonymousClass3MY.A1B(r1, r0, r2)
            java.lang.Object r0 = r3.getValue()
            X.4cY r0 = (X.C89494cY) r0
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2ViolationCategory r0 = r0.A03()
            int r0 = X.AnonymousClass4HN.A00(r0)
            java.lang.String r2 = X.AnonymousClass3MY.A0n(r9, r0)
            r1 = 2131892754(0x7f121a12, float:1.9420265E38)
            goto L_0x00d9
        L_0x01b5:
            java.lang.String r0 = "abProps"
            goto L_0x01ba
        L_0x01b8:
            java.lang.String r0 = "linkifier"
        L_0x01ba:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.product.newsletterenforcements.newsletterimpact.NewsletterImpactFragment.A21(android.os.Bundle, android.view.View):void");
    }

    public static final void A00(NewsletterImpactFragment newsletterImpactFragment) {
        NewsletterGuidelinesDecisionProcessBottomSheet newsletterGuidelinesDecisionProcessBottomSheet = new NewsletterGuidelinesDecisionProcessBottomSheet();
        Bundle A0D = C17880vN.A0D();
        int ordinal = ((C89494cY) newsletterImpactFragment.A06.getValue()).A03().ordinal();
        boolean z = true;
        if (!(ordinal == 26 || ordinal == 24 || ordinal == 25 || ordinal == 27)) {
            z = false;
        }
        A0D.putBoolean("is-ip-violation-arg", z);
        newsletterGuidelinesDecisionProcessBottomSheet.A1R(A0D);
        newsletterGuidelinesDecisionProcessBottomSheet.A2C(newsletterImpactFragment.A1F(), "how-we-made-this-decision");
    }
}
