package X;

import com.whatsapp.newsletter.NewsletterInfoActivity;

/* renamed from: X.5TS  reason: invalid class name */
public final class AnonymousClass5TS extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ NewsletterInfoActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5TS(NewsletterInfoActivity newsletterInfoActivity) {
        super(1);
        this.this$0 = newsletterInfoActivity;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r18) {
        /*
            r17 = this;
            r2 = r18
            X.4VD r2 = (X.AnonymousClass4VD) r2
            if (r2 == 0) goto L_0x014c
            r0 = r17
            com.whatsapp.newsletter.NewsletterInfoActivity r4 = r0.this$0
            r3 = 0
            r4.A2v(r3)
            X.1E7 r0 = r2.A02
            r4.A0c = r0
            com.whatsapp.chatinfo.view.custom.NewsletterInfoLayout r0 = r4.A0U
            java.lang.String r8 = "rootLayout"
            r7 = 0
            if (r0 == 0) goto L_0x0122
            java.lang.String r5 = r2.A04
            r0.setTitleText(r5)
            com.whatsapp.chatinfo.view.custom.NewsletterInfoLayout r1 = r4.A0U
            if (r1 == 0) goto L_0x0122
            boolean r0 = r2.A07
            r1.setTitleVerified(r0)
            X.4Xk r9 = r4.A0T
            if (r9 != 0) goto L_0x0080
            com.whatsapp.chatinfo.view.custom.NewsletterInfoLayout r0 = r4.A0U
            if (r0 != 0) goto L_0x0034
            r0 = r8
        L_0x0030:
            X.C18070vi.A11(r0)
            throw r7
        L_0x0034:
            android.view.View r1 = r0.A0F
            r0 = 2131433001(0x7f0b1629, float:1.8487775E38)
            android.view.ViewStub r0 = X.AnonymousClass3MW.A0F(r1, r0)
            if (r0 == 0) goto L_0x00b1
            android.view.View r11 = r0.inflate()
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.chatinfo.view.custom.NewsletterDetailsCard"
            X.C18070vi.A0z(r11, r0)
            com.whatsapp.chatinfo.view.custom.NewsletterDetailsCard r11 = (com.whatsapp.chatinfo.view.custom.NewsletterDetailsCard) r11
            if (r11 == 0) goto L_0x00b1
            r11.setVisibility(r3)
            X.4Jg r0 = r4.A0I
            if (r0 == 0) goto L_0x0087
            X.3zj r14 = r4.A0e
            X.1K2 r0 = r0.A00
            X.10E r0 = r0.A01
            X.1KB r10 = X.AnonymousClass10E.A12(r0)
            X.11C r12 = X.AnonymousClass3Ma.A0a(r0)
            X.0vb r13 = X.AnonymousClass10E.A6Q(r0)
            X.10G r1 = r0.A00
            X.00S r0 = r1.A3T
            java.lang.Object r15 = r0.get()
            X.4mD r15 = (X.C95424mD) r15
            X.00S r0 = r1.A3Q
            java.lang.Object r0 = r0.get()
            X.4Rr r0 = (X.C86454Rr) r0
            X.4Xk r9 = new X.4Xk
            r16 = r0
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            r4.A0T = r9
        L_0x0080:
            X.1E7 r0 = r4.A0c
            if (r0 != 0) goto L_0x008a
            java.lang.String r0 = "contact"
            goto L_0x0030
        L_0x0087:
            java.lang.String r0 = "newsletterDetailsCardControllerFactory"
            goto L_0x0030
        L_0x008a:
            r9.A02(r0)
            X.4Xk r6 = r4.A0T
            if (r6 == 0) goto L_0x00b1
            r1 = 38
            X.4dS r0 = new X.4dS
            r0.<init>(r4, r1)
            com.whatsapp.chatinfo.view.custom.NewsletterDetailsCard r6 = r6.A02
            r6.setFollowUnfollowButton(r0)
            r1 = 39
            X.4dS r0 = new X.4dS
            r0.<init>(r4, r1)
            r6.setForwardClickListener(r0)
            r1 = 40
            X.4dS r0 = new X.4dS
            r0.<init>(r4, r1)
            r6.setShareClickListener(r0)
        L_0x00b1:
            com.whatsapp.newsletter.NewsletterInfoActivity.A1F(r4)
            com.whatsapp.chatinfo.view.custom.NewsletterInfoLayout r0 = r4.A0U
            if (r0 == 0) goto L_0x0122
            r0.setPushName(r5)
            X.4Xk r0 = r4.A0T
            if (r0 == 0) goto L_0x00e4
            com.whatsapp.chatinfo.view.custom.NewsletterDetailsCard r5 = r0.A02
            boolean r0 = r2.A06
            if (r0 != 0) goto L_0x00e4
            r5.getWamoSubIntegrationInterface()
            java.lang.String r0 = "wamoSubStatusButton"
            com.whatsapp.wds.components.actiontile.WDSActionTile r1 = r5.A04
            if (r1 == 0) goto L_0x0030
            r0 = 8
            r1.setVisibility(r0)
            X.9Ig r0 = r2.A01
            int r1 = r0.ordinal()
            if (r1 == r3) goto L_0x0118
            r0 = 1
            if (r1 == r0) goto L_0x0114
            r0 = 2
            if (r1 == r0) goto L_0x0106
            r0 = 3
            if (r1 == r0) goto L_0x0106
        L_0x00e4:
            X.9Ig r0 = r2.A01
            X.9Ig r2 = X.C179509Ig.SUBSCRIBED
            if (r0 != r2) goto L_0x00f3
            X.3Ow r1 = r4.A0h
            if (r1 == 0) goto L_0x00f3
            X.0wS r0 = X.C18460wS.A00
            r1.A01(r2, r0)
        L_0x00f3:
            X.3Ow r0 = r4.A0h
            if (r0 == 0) goto L_0x00fa
            r0.notifyDataSetChanged()
        L_0x00fa:
            com.whatsapp.chatinfo.view.custom.NewsletterInfoLayout r5 = r4.A0U
            if (r5 == 0) goto L_0x0122
            android.view.View r2 = r4.A03
            if (r2 != 0) goto L_0x011c
            java.lang.String r0 = "footerViews"
            goto L_0x0030
        L_0x0106:
            android.view.View r1 = r5.A00
            if (r1 != 0) goto L_0x010e
            java.lang.String r0 = "followUnfollowButton"
            goto L_0x0030
        L_0x010e:
            r0 = 8
            r1.setVisibility(r0)
            goto L_0x00e4
        L_0x0114:
            r5.A05()
            goto L_0x00e4
        L_0x0118:
            r5.A06()
            goto L_0x00e4
        L_0x011c:
            android.widget.LinearLayout r1 = r4.A08
            if (r1 != 0) goto L_0x0126
            java.lang.String r8 = "footerPadding"
        L_0x0122:
            X.C18070vi.A11(r8)
            throw r7
        L_0x0126:
            X.3Ow r0 = r4.A0h
            r5.A0H(r2, r1, r0)
            X.2Dk r0 = com.whatsapp.newsletter.NewsletterInfoActivity.A0y(r4)
            if (r0 == 0) goto L_0x0143
            boolean r2 = r0.A0A
            r0 = 2131429911(0x7f0b0a17, float:1.8481508E38)
            android.view.View r1 = r4.findViewById(r0)
            if (r1 == 0) goto L_0x0143
            int r0 = X.C72453Mb.A07(r2)
            r1.setVisibility(r0)
        L_0x0143:
            com.whatsapp.newsletter.NewsletterInfoActivity.A1P(r4, r3, r3)
            com.whatsapp.newsletter.NewsletterInfoActivity.A1E(r4)
            com.whatsapp.newsletter.NewsletterInfoActivity.A1G(r4)
        L_0x014c:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5TS.invoke(java.lang.Object):java.lang.Object");
    }
}
