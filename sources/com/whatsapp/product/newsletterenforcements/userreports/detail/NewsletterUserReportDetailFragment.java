package com.whatsapp.product.newsletterenforcements.userreports.detail;

import X.AnonymousClass00H;
import X.AnonymousClass1CJ;
import X.AnonymousClass3MW;
import X.AnonymousClass3Ma;
import X.C17880vN;
import X.C18000vb;
import X.C18030ve;
import X.C18070vi;
import X.C28931bI;
import X.C36401np;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.product.newsletterenforcements.newsletterguidelines.NewsletterGuidelinesDecisionProcessBottomSheet;
import com.whatsapp.product.newsletterenforcements.userreports.NewsletterUserReportsViewModel;

public final class NewsletterUserReportDetailFragment extends Hilt_NewsletterUserReportDetailFragment {
    public C18000vb A00;
    public AnonymousClass1CJ A01;
    public C18030ve A02;
    public NewsletterUserReportsViewModel A03;
    public C36401np A04;
    public C28931bI A05;
    public C28931bI A06;
    public AnonymousClass00H A07;

    public static final void A00(TextView textView, C18030ve r6, C36401np r7, Runnable runnable, int i) {
        C18070vi.A0d(textView, 0);
        textView.setText(r7.A05(textView.getContext(), runnable, C17880vN.A0q(textView.getContext(), "clickable-span", AnonymousClass3MW.A1a(), 0, i), "clickable-span"));
        AnonymousClass3Ma.A1I(textView, r6);
    }

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        return layoutInflater.inflate(2131625381, viewGroup, false);
    }

    public void A1x(Context context) {
        C18070vi.A0d(context, 0);
        super.A1x(context);
        this.A03 = (NewsletterUserReportsViewModel) AnonymousClass3Ma.A0I(this).A00(NewsletterUserReportsViewModel.class);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0146, code lost:
        if (r1 == com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2AppealState.REJECT) goto L_0x0148;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x01ca, code lost:
        if (r5.A0H().A0D(r8, "state") != com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2AppealState.NOT_APPEALED) goto L_0x01cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x022f, code lost:
        if (r3 != 4) goto L_0x00b6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0225  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A21(android.os.Bundle r14, android.view.View r15) {
        /*
            r13 = this;
            r0 = 0
            X.C18070vi.A0d(r15, r0)
            android.os.Bundle r1 = r13.A15()
            java.lang.String r0 = "arg-report-id"
            java.lang.String r2 = r1.getString(r0)
            java.lang.String r0 = "NewsletterUserReportDetailFragment: reportID is null"
            X.C17960vV.A08(r2, r0)
            X.C18070vi.A0X(r2)
            r0 = 2131435075(0x7f0b1e43, float:1.8491982E38)
            X.1bI r0 = X.C72453Mb.A0s(r15, r0)
            r13.A06 = r0
            r0 = 2131433018(0x7f0b163a, float:1.848781E38)
            X.1bI r0 = X.C72453Mb.A0s(r15, r0)
            r13.A05 = r0
            com.whatsapp.product.newsletterenforcements.userreports.NewsletterUserReportsViewModel r0 = r13.A03
            if (r0 != 0) goto L_0x0033
            java.lang.String r0 = "viewModel"
        L_0x002e:
            X.C18070vi.A11(r0)
        L_0x0031:
            r0 = 0
            throw r0
        L_0x0033:
            X.00H r0 = r0.A04
            java.lang.Object r0 = r0.get()
            X.4Lx r0 = (X.C85054Lx) r0
            java.util.concurrent.ConcurrentHashMap r0 = r0.A00
            java.lang.Object r5 = r0.get(r2)
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterReportAppealStateResponseImpl r5 = (com.whatsapp.infra.graphql.generated.newsletter.NewsletterReportAppealStateResponseImpl) r5
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "getReportDataFromCache reportId: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ", report in cache?: "
            r1.append(r0)
            boolean r0 = X.AnonymousClass000.A1W(r5)
            X.C17900vP.A0r(r1, r0)
            X.C17960vV.A07(r5)
            X.C18070vi.A0X(r5)
            r0 = 2131431388(0x7f0b0fdc, float:1.8484504E38)
            android.widget.TextView r4 = X.C72453Mb.A0W(r15, r0)
            X.1CJ r0 = r13.A01
            if (r0 == 0) goto L_0x02ca
            java.lang.String r3 = X.AnonymousClass4HK.A00(r0, r5)
            java.lang.String r1 = "server_msg_id"
            java.lang.String r0 = r5.A0F(r1)
            boolean r0 = X.AnonymousClass000.A1W(r0)
            r2 = 0
            if (r0 == 0) goto L_0x0295
            if (r3 != 0) goto L_0x02a0
            r0 = 2131892859(0x7f121a7b, float:1.9420478E38)
        L_0x0082:
            r4.setText(r0)
        L_0x0085:
            r0 = 2131433007(0x7f0b162f, float:1.8487788E38)
            android.view.View r2 = X.AnonymousClass3MX.A0C(r15, r0)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r0 = 2131431368(0x7f0b0fc8, float:1.8484463E38)
            android.widget.TextView r7 = X.C72453Mb.A0W(r15, r0)
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterReportAppealStateResponseImpl$Appeal r0 = r5.A0H()
            java.lang.String r6 = "creation_time"
            java.lang.String r0 = r0.A0F(r6)
            if (r0 == 0) goto L_0x0214
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterReportAppealStateResponseImpl$Appeal r4 = r5.A0H()
            java.lang.String r3 = "state"
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2AppealState r0 = com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2AppealState.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.Enum r0 = r4.A0D(r0, r3)
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2AppealState r0 = (com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2AppealState) r0
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L_0x0214;
                case 1: goto L_0x0233;
                case 2: goto L_0x0274;
                case 3: goto L_0x024f;
                case 4: goto L_0x027e;
                case 5: goto L_0x0214;
                case 6: goto L_0x0214;
                default: goto L_0x00b6;
            }
        L_0x00b6:
            r0 = 2131429796(0x7f0b09a4, float:1.8481275E38)
            android.widget.TextView r3 = X.C17880vN.A0E(r15, r0)
            r8 = 2131892852(0x7f121a74, float:1.9420464E38)
            java.lang.Object[] r2 = X.AnonymousClass3MW.A1a()
            X.0vb r9 = r13.A00
            if (r9 == 0) goto L_0x02be
            java.lang.String r0 = X.C72453Mb.A0z(r5, r6)
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS
            long r0 = java.lang.Long.parseLong(r0)
            long r0 = r7.toMillis(r0)
            X.11Y r4 = X.AnonymousClass11X.A00
            java.lang.String r1 = r4.A07(r9, r0)
            r0 = 0
            java.lang.String r0 = X.AnonymousClass3MX.A16(r13, r1, r2, r0, r8)
            r3.setText(r0)
            r0 = 2131429797(0x7f0b09a5, float:1.8481277E38)
            android.widget.TextView r3 = X.C17880vN.A0E(r15, r0)
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterReportAppealStateResponseImpl$Appeal r0 = r5.A0H()
            java.lang.String r0 = r0.A0F(r6)
            if (r0 == 0) goto L_0x020d
            r2 = 0
            r3.setVisibility(r2)
            X.0vb r8 = r13.A00
            if (r8 == 0) goto L_0x02be
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterReportAppealStateResponseImpl$Appeal r0 = r5.A0H()
            java.lang.String r0 = r0.A0F(r6)
            X.C17960vV.A07(r0)
            X.C18070vi.A0X(r0)
            long r0 = java.lang.Long.parseLong(r0)
            long r0 = r7.toMillis(r0)
            java.lang.String r1 = r4.A07(r8, r0)
            r0 = 2131892853(0x7f121a75, float:1.9420466E38)
            java.lang.String r0 = X.AnonymousClass3MY.A0o(r13, r1, r2, r0)
            r3.setText(r0)
        L_0x0121:
            java.lang.String r11 = "status"
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2ReportStatus r10 = com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2ReportStatus.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.Enum r2 = r5.A0D(r10, r11)
            X.C18070vi.A0X(r2)
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterReportAppealStateResponseImpl$Appeal r0 = r5.A0H()
            java.lang.String r9 = "state"
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2AppealState r8 = com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2AppealState.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.Enum r1 = r0.A0D(r8, r9)
            X.C18070vi.A0X(r1)
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2ReportStatus r7 = com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2ReportStatus.FAIL
            if (r2 != r7) goto L_0x0143
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2AppealState r0 = com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2AppealState.NOT_APPEALED
            if (r1 == r0) goto L_0x0148
        L_0x0143:
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2AppealState r0 = com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2AppealState.REJECT
            r3 = 0
            if (r1 != r0) goto L_0x0149
        L_0x0148:
            r3 = 1
        L_0x0149:
            java.lang.String r2 = "guidelinesViewStubHolder"
            r1 = 8
            X.1bI r0 = r13.A05
            if (r3 == 0) goto L_0x0207
            if (r0 == 0) goto L_0x02b9
            r3 = 0
            r0.A04(r3)
            r0 = 2131433080(0x7f0b1678, float:1.8487936E38)
            X.AnonymousClass3MY.A1B(r15, r0, r1)
            r0 = 2131432995(0x7f0b1623, float:1.8487763E38)
            android.widget.TextView r12 = X.C17880vN.A0E(r15, r0)
            X.C18070vi.A0b(r12)
            r6 = 2131892656(0x7f1219b0, float:1.9420066E38)
            X.1np r4 = r13.A04
            if (r4 == 0) goto L_0x02c6
            X.0ve r2 = r13.A02
            if (r2 == 0) goto L_0x02c2
            r1 = 4
            X.7Qm r0 = new X.7Qm
            r0.<init>((java.lang.Object) r13, (int) r1)
            A00(r12, r2, r4, r0, r6)
            X.0ve r2 = r13.A02
            if (r2 == 0) goto L_0x02c2
            r1 = 7592(0x1da8, float:1.0639E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x01b2
            r0 = 2131433008(0x7f0b1630, float:1.848779E38)
            X.1bI r0 = X.C28931bI.A00(r15, r0)
            android.view.View r1 = X.AnonymousClass3MY.A0I(r0, r3)
            r0 = 2131433009(0x7f0b1631, float:1.8487792E38)
            android.widget.TextView r6 = X.C17880vN.A0E(r1, r0)
            X.C18070vi.A0b(r6)
            r4 = 2131892657(0x7f1219b1, float:1.9420068E38)
            X.1np r3 = r13.A04
            if (r3 == 0) goto L_0x02c6
            X.0ve r2 = r13.A02
            if (r2 == 0) goto L_0x02c2
            r1 = 5
            X.7Qm r0 = new X.7Qm
            r0.<init>((java.lang.Object) r13, (int) r1)
            A00(r6, r2, r3, r0, r4)
        L_0x01b2:
            r0 = 2131434689(0x7f0b1cc1, float:1.84912E38)
            android.view.View r3 = r15.findViewById(r0)
            java.lang.Enum r0 = r5.A0D(r10, r11)
            if (r0 != r7) goto L_0x01cc
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterReportAppealStateResponseImpl$Appeal r0 = r5.A0H()
            java.lang.Enum r2 = r0.A0D(r8, r9)
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2AppealState r1 = com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2AppealState.NOT_APPEALED
            r0 = 1
            if (r2 == r1) goto L_0x01cd
        L_0x01cc:
            r0 = 0
        L_0x01cd:
            java.lang.String r2 = "reviewButtonViewStubHolder"
            if (r0 == 0) goto L_0x02ac
            r1 = 0
            r3.setVisibility(r1)
            X.1bI r0 = r13.A06
            if (r0 == 0) goto L_0x02b9
            r0.A04(r1)
            X.1bI r0 = r13.A06
            if (r0 == 0) goto L_0x02b9
            android.widget.TextView r1 = X.AnonymousClass3MX.A0M(r0)
            r0 = 2131895286(0x7f1223f6, float:1.94254E38)
            r1.setText(r0)
            X.1bI r0 = r13.A06
            if (r0 == 0) goto L_0x02b9
            android.view.View r1 = r0.A02()
            com.whatsapp.wds.components.button.WDSButton r1 = (com.whatsapp.wds.components.button.WDSButton) r1
            X.1Xz r0 = X.C27881Xz.TONAL
            r1.setVariant(r0)
            X.1bI r0 = r13.A06
            if (r0 == 0) goto L_0x02b9
            android.view.View r1 = r0.A02()
            r0 = 11
            X.C90024dP.A00(r1, r13, r5, r0)
            return
        L_0x0207:
            if (r0 == 0) goto L_0x02b9
            r0.A04(r1)
            goto L_0x01b2
        L_0x020d:
            r0 = 8
            r3.setVisibility(r0)
            goto L_0x0121
        L_0x0214:
            java.lang.String r3 = "status"
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2ReportStatus r0 = com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2ReportStatus.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.Enum r0 = r5.A0D(r0, r3)
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2ReportStatus r0 = (com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2ReportStatus) r0
            int r3 = r0.ordinal()
            r0 = 1
            if (r3 == r0) goto L_0x0274
            r0 = 2
            if (r3 == r0) goto L_0x0233
            r0 = 3
            if (r3 == r0) goto L_0x024f
            r0 = 0
            if (r3 == r0) goto L_0x027e
            r0 = 4
            if (r3 == r0) goto L_0x027e
            goto L_0x00b6
        L_0x0233:
            r0 = 2131233655(0x7f080b77, float:1.8083454E38)
            r2.setImageResource(r0)
            java.lang.String r0 = r5.A0F(r1)
            r4 = 2131892843(0x7f121a6b, float:1.9420446E38)
            if (r0 == 0) goto L_0x0245
            r4 = 2131892857(0x7f121a79, float:1.9420474E38)
        L_0x0245:
            X.1np r3 = r13.A04
            if (r3 == 0) goto L_0x02c6
            X.0ve r2 = r13.A02
            if (r2 == 0) goto L_0x02c2
            r1 = 7
            goto L_0x026a
        L_0x024f:
            r0 = 2131233654(0x7f080b76, float:1.8083452E38)
            r2.setImageResource(r0)
            java.lang.String r0 = r5.A0F(r1)
            r4 = 2131892836(0x7f121a64, float:1.9420432E38)
            if (r0 == 0) goto L_0x0261
            r4 = 2131892856(0x7f121a78, float:1.9420472E38)
        L_0x0261:
            X.1np r3 = r13.A04
            if (r3 == 0) goto L_0x02c6
            X.0ve r2 = r13.A02
            if (r2 == 0) goto L_0x02c2
            r1 = 6
        L_0x026a:
            X.7Qm r0 = new X.7Qm
            r0.<init>((java.lang.Object) r13, (int) r1)
            X.AnonymousClass4HM.A00(r7, r2, r3, r0, r4)
            goto L_0x00b6
        L_0x0274:
            r0 = 2131233656(0x7f080b78, float:1.8083456E38)
            r2.setImageResource(r0)
            r0 = 2131892834(0x7f121a62, float:1.9420427E38)
            goto L_0x0290
        L_0x027e:
            r0 = 2131233657(0x7f080b79, float:1.8083458E38)
            r2.setImageResource(r0)
            java.lang.String r1 = r5.A0F(r1)
            r0 = 2131892837(0x7f121a65, float:1.9420434E38)
            if (r1 == 0) goto L_0x0290
            r0 = 2131892855(0x7f121a77, float:1.942047E38)
        L_0x0290:
            r7.setText(r0)
            goto L_0x00b6
        L_0x0295:
            if (r3 != 0) goto L_0x029c
            r0 = 2131892846(0x7f121a6e, float:1.9420452E38)
            goto L_0x0082
        L_0x029c:
            r0 = 2131892845(0x7f121a6d, float:1.942045E38)
            goto L_0x02a3
        L_0x02a0:
            r0 = 2131892858(0x7f121a7a, float:1.9420476E38)
        L_0x02a3:
            java.lang.String r0 = X.AnonymousClass3MY.A0o(r13, r3, r2, r0)
            r4.setText(r0)
            goto L_0x0085
        L_0x02ac:
            r1 = 8
            r3.setVisibility(r1)
            X.1bI r0 = r13.A06
            if (r0 == 0) goto L_0x02b9
            r0.A04(r1)
            return
        L_0x02b9:
            X.C18070vi.A11(r2)
            goto L_0x0031
        L_0x02be:
            java.lang.String r0 = "whatsAppLocale"
            goto L_0x002e
        L_0x02c2:
            java.lang.String r0 = "abProps"
            goto L_0x002e
        L_0x02c6:
            java.lang.String r0 = "linkifier"
            goto L_0x002e
        L_0x02ca:
            java.lang.String r0 = "chatsCache"
            goto L_0x002e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.product.newsletterenforcements.userreports.detail.NewsletterUserReportDetailFragment.A21(android.os.Bundle, android.view.View):void");
    }

    public static final void A01(NewsletterUserReportDetailFragment newsletterUserReportDetailFragment) {
        NewsletterGuidelinesDecisionProcessBottomSheet newsletterGuidelinesDecisionProcessBottomSheet = new NewsletterGuidelinesDecisionProcessBottomSheet();
        Bundle A0D = C17880vN.A0D();
        A0D.putBoolean("user-report-content-arg", true);
        newsletterGuidelinesDecisionProcessBottomSheet.A1R(A0D);
        newsletterGuidelinesDecisionProcessBottomSheet.A2C(newsletterUserReportDetailFragment.A1F(), "how-we-made-this-decision");
    }

    public void A1u() {
        super.A1u();
        A1D().setTitle(2131892854);
    }
}
