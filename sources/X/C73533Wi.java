package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.List;

/* renamed from: X.3Wi  reason: invalid class name and case insensitive filesystem */
public final class C73533Wi extends C38391rD {
    public List A00 = C18460wS.A00;
    public final C18000vb A01;
    public final AnonymousClass1CJ A02;
    public final C22821Di A03;

    public /* bridge */ /* synthetic */ C42011xT BqY(ViewGroup viewGroup, int i) {
        View inflate = C72463Mc.A0K(viewGroup, 0).inflate(2131626251, viewGroup, false);
        ImageView A0H = AnonymousClass3MW.A0H(inflate, 2131434711);
        AnonymousClass3NL.A01(A0H.getContext(), A0H, this.A01, 2131231900);
        return new AnonymousClass3ZO(inflate);
    }

    public int A0Q() {
        return this.A00.size();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x005d, code lost:
        if (r2.A0H().A0D(com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2AppealState.A06, "state") == com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2AppealState.A03) goto L_0x005f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void Bmc(X.C42011xT r11, int r12) {
        /*
            r10 = this;
            X.3ZO r11 = (X.AnonymousClass3ZO) r11
            r3 = 0
            X.C18070vi.A0d(r11, r3)
            java.util.List r0 = r10.A00
            java.lang.Object r2 = r0.get(r12)
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterReportAppealStateResponseImpl r2 = (com.whatsapp.infra.graphql.generated.newsletter.NewsletterReportAppealStateResponseImpl) r2
            android.view.View r0 = r11.A0H
            android.content.Context r4 = r0.getContext()
            X.0vb r5 = r10.A01
            java.lang.String r6 = "creation_time"
            java.lang.String r0 = X.C72453Mb.A0z(r2, r6)
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS
            long r0 = java.lang.Long.parseLong(r0)
            long r0 = r7.toMillis(r0)
            X.11Y r7 = X.AnonymousClass11X.A00
            java.lang.String r9 = r7.A07(r5, r0)
            X.1CJ r0 = r10.A02
            java.lang.String r1 = X.AnonymousClass4HK.A00(r0, r2)
            if (r1 == 0) goto L_0x00c3
            int r0 = r1.length()
            if (r0 == 0) goto L_0x00c3
            com.whatsapp.WaTextView r0 = r11.A03
            r0.setVisibility(r3)
            r0.setText(r1)
        L_0x0042:
            java.lang.String r1 = "status"
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2ReportStatus r0 = com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2ReportStatus.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.Enum r1 = r2.A0D(r0, r1)
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2ReportStatus r0 = com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2ReportStatus.PENDING
            if (r1 == r0) goto L_0x005f
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterReportAppealStateResponseImpl$Appeal r8 = r2.A0H()
            java.lang.String r1 = "state"
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2AppealState r0 = com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2AppealState.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.Enum r8 = r8.A0D(r0, r1)
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2AppealState r1 = com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2AppealState.PENDING
            r0 = 0
            if (r8 != r1) goto L_0x0060
        L_0x005f:
            r0 = 1
        L_0x0060:
            com.whatsapp.WaImageView r1 = r11.A01
            if (r0 == 0) goto L_0x00b7
            r0 = 2131233422(0x7f080a8e, float:1.8082981E38)
            r1.setImageResource(r0)
            com.whatsapp.WaTextView r1 = r11.A04
            r0 = 2131892850(0x7f121a72, float:1.942046E38)
        L_0x006f:
            r1.setText(r0)
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterReportAppealStateResponseImpl$Appeal r0 = r2.A0H()
            java.lang.String r0 = r0.A0F(r6)
            boolean r0 = X.AnonymousClass000.A1W(r0)
            r8 = 1
            if (r0 == 0) goto L_0x00b1
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterReportAppealStateResponseImpl$Appeal r0 = r2.A0H()
            java.lang.String r0 = r0.A0F(r6)
            X.C17960vV.A07(r0)
            X.C18070vi.A0X(r0)
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS
            long r0 = java.lang.Long.parseLong(r0)
            long r0 = r6.toMillis(r0)
            java.lang.String r9 = r7.A07(r5, r0)
            com.whatsapp.WaTextView r5 = r11.A02
            r1 = 2131892853(0x7f121a75, float:1.9420466E38)
        L_0x00a2:
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r3] = r9
            X.AnonymousClass3MY.A0y(r4, r5, r0, r1)
            android.view.ViewGroup r1 = r11.A00
            r0 = 12
            X.C90024dP.A00(r1, r10, r2, r0)
            return
        L_0x00b1:
            com.whatsapp.WaTextView r5 = r11.A02
            r1 = 2131892852(0x7f121a74, float:1.9420464E38)
            goto L_0x00a2
        L_0x00b7:
            r0 = 2131233274(0x7f0809fa, float:1.808268E38)
            r1.setImageResource(r0)
            com.whatsapp.WaTextView r1 = r11.A04
            r0 = 2131892851(0x7f121a73, float:1.9420462E38)
            goto L_0x006f
        L_0x00c3:
            com.whatsapp.WaTextView r1 = r11.A03
            r0 = 8
            r1.setVisibility(r0)
            goto L_0x0042
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73533Wi.Bmc(X.1xT, int):void");
    }

    public C73533Wi(C18000vb r2, AnonymousClass1CJ r3, C22821Di r4) {
        C18070vi.A0j(r3, r2);
        this.A02 = r3;
        this.A01 = r2;
        this.A03 = r4;
    }
}
