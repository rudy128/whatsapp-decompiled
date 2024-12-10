package X;

import com.whatsapp.conversationslist.LockedConversationsFragment;

/* renamed from: X.5SF  reason: invalid class name */
public final class AnonymousClass5SF extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ LockedConversationsFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5SF(LockedConversationsFragment lockedConversationsFragment) {
        super(1);
        this.this$0 = lockedConversationsFragment;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00f3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r10) {
        /*
            r9 = this;
            X.2Qi r10 = (X.C49402Qi) r10
            r0 = 0
            X.C18070vi.A0d(r10, r0)
            int r1 = r10.ordinal()
            r0 = 1
            if (r1 == r0) goto L_0x00ea
            r0 = 2
            if (r1 == r0) goto L_0x00e4
            r0 = 3
            com.whatsapp.conversationslist.LockedConversationsFragment r2 = r9.this$0
            if (r1 == r0) goto L_0x0025
            android.view.View r0 = r2.A00
            int r1 = X.C72453Mb.A0D(r0)
            android.view.View r0 = r2.A01
            if (r0 == 0) goto L_0x0022
            r0.setVisibility(r1)
        L_0x0022:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0025:
            android.view.View r1 = r2.A01
            if (r1 != 0) goto L_0x00de
            X.0ve r0 = r2.A25
            boolean r0 = X.AnonymousClass1J8.A02(r0)
            if (r0 == 0) goto L_0x00ba
            r0 = 2131624532(0x7f0e0254, float:1.8876246E38)
            android.view.View r3 = r2.A2L(r0)
            r0 = 2131428058(0x7f0b02da, float:1.847775E38)
            android.view.View r6 = r3.findViewById(r0)
            com.whatsapp.wds.components.banners.WDSBanner r6 = (com.whatsapp.wds.components.banners.WDSBanner) r6
            if (r6 == 0) goto L_0x00b2
            r0 = 2131428064(0x7f0b02e0, float:1.8477762E38)
            android.widget.TextView r1 = X.C17880vN.A0E(r6, r0)
            r0 = 2
            r1.setMaxLines(r0)
            r0 = 2131428063(0x7f0b02df, float:1.847776E38)
            android.view.View r4 = r6.findViewById(r0)
            X.C18070vi.A0b(r4)
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131165855(0x7f07029f, float:1.7945939E38)
            int r1 = r1.getDimensionPixelSize(r0)
            r8 = 0
            X.1sv r0 = new X.1sv
            r0.<init>(r8, r1, r8, r8)
            X.C43531zx.A03(r4, r0)
            X.4XT r7 = new X.4XT
            r7.<init>()
            r0 = 2131233277(0x7f0809fd, float:1.8082687E38)
            X.AnonymousClass4AC.A00(r7, r0)
            r0 = 2131890535(0x7f121167, float:1.9415765E38)
            r7.A01 = r0
            android.content.Context r5 = X.AnonymousClass3MY.A04(r6)
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r1 = 2131890534(0x7f121166, float:1.9415763E38)
            r4 = 2131890533(0x7f121165, float:1.941576E38)
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r8)
            java.lang.String r1 = r5.getString(r1, r0)
            X.C18070vi.A0b(r1)
            java.lang.String r0 = X.C18070vi.A0F(r5, r4)
            android.text.Spanned r0 = X.AnonymousClass4W6.A01(r5, r1, r0)
            X.AnonymousClass4XT.A00(r6, r7, r0)
            X.5HD r0 = new X.5HD
            r0.<init>(r2)
            r6.setOnDismissListener((X.C18090vk) r0)
            r0 = 25
            X.C89924dF.A00(r6, r2, r0)
            boolean r0 = X.C22891Dp.A02
            if (r0 != 0) goto L_0x00b6
            r6.A08()
        L_0x00b2:
            r2.A01 = r3
            goto L_0x0022
        L_0x00b6:
            r6.A07()
            goto L_0x00b2
        L_0x00ba:
            r0 = 2131624531(0x7f0e0253, float:1.8876244E38)
            android.view.View r3 = r2.A2L(r0)
            r0 = 2131431023(0x7f0b0e6f, float:1.8483763E38)
            android.view.View r1 = r3.findViewById(r0)
            if (r1 == 0) goto L_0x00cf
            r0 = 22
            X.C89924dF.A00(r1, r2, r0)
        L_0x00cf:
            r0 = 2131431024(0x7f0b0e70, float:1.8483766E38)
            android.view.View r1 = r3.findViewById(r0)
            if (r1 == 0) goto L_0x00b2
            r0 = 23
            X.C89924dF.A00(r1, r2, r0)
            goto L_0x00b2
        L_0x00de:
            r0 = 0
            r1.setVisibility(r0)
            goto L_0x0022
        L_0x00e4:
            com.whatsapp.conversationslist.LockedConversationsFragment r4 = r9.this$0
            r8 = 2131888637(0x7f1209fd, float:1.9411915E38)
            goto L_0x00ef
        L_0x00ea:
            com.whatsapp.conversationslist.LockedConversationsFragment r4 = r9.this$0
            r8 = 2131888636(0x7f1209fc, float:1.9411913E38)
        L_0x00ef:
            android.view.View r0 = r4.A00
            if (r0 != 0) goto L_0x0022
            X.0ve r0 = r4.A25
            boolean r1 = X.AnonymousClass1J8.A02(r0)
            r0 = 2131624534(0x7f0e0256, float:1.887625E38)
            if (r1 != 0) goto L_0x012f
            r0 = 2131624533(0x7f0e0255, float:1.8876248E38)
            android.view.View r6 = r4.A2L(r0)
            r0 = 2131431385(0x7f0b0fd9, float:1.8484498E38)
            android.widget.TextView r0 = X.C17880vN.A0E(r6, r0)
            r0.setText(r8)
            r0 = 2131429145(0x7f0b0719, float:1.8479954E38)
            android.view.View r1 = r6.findViewById(r0)
            if (r1 == 0) goto L_0x011d
            r0 = 26
            X.C89924dF.A00(r1, r4, r0)
        L_0x011d:
            r0 = 2131431962(0x7f0b121a, float:1.8485668E38)
            android.view.View r1 = r6.findViewById(r0)
            if (r1 == 0) goto L_0x012b
            r0 = 27
            X.C89924dF.A00(r1, r4, r0)
        L_0x012b:
            r4.A00 = r6
            goto L_0x0022
        L_0x012f:
            android.view.View r6 = r4.A2L(r0)     // Catch:{ IllegalStateException -> 0x0180 }
            r0 = 2131428058(0x7f0b02da, float:1.847775E38)
            android.view.View r5 = r6.findViewById(r0)     // Catch:{ IllegalStateException -> 0x0180 }
            com.whatsapp.wds.components.banners.WDSBanner r5 = (com.whatsapp.wds.components.banners.WDSBanner) r5     // Catch:{ IllegalStateException -> 0x0180 }
            if (r5 == 0) goto L_0x012b
            X.4XT r7 = new X.4XT     // Catch:{ IllegalStateException -> 0x0180 }
            r7.<init>()     // Catch:{ IllegalStateException -> 0x0180 }
            X.4A9 r0 = X.AnonymousClass4A9.A00     // Catch:{ IllegalStateException -> 0x0180 }
            r7.A02 = r0     // Catch:{ IllegalStateException -> 0x0180 }
            android.content.Context r3 = X.AnonymousClass3MY.A04(r5)     // Catch:{ IllegalStateException -> 0x0180 }
            r1 = 0
            java.lang.Object[] r0 = new java.lang.Object[r1]     // Catch:{ IllegalStateException -> 0x0180 }
            r2 = 2131888635(0x7f1209fb, float:1.941191E38)
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)     // Catch:{ IllegalStateException -> 0x0180 }
            java.lang.String r1 = r3.getString(r8, r0)     // Catch:{ IllegalStateException -> 0x0180 }
            X.C18070vi.A0b(r1)     // Catch:{ IllegalStateException -> 0x0180 }
            java.lang.String r0 = X.C18070vi.A0F(r3, r2)     // Catch:{ IllegalStateException -> 0x0180 }
            android.text.Spanned r0 = X.AnonymousClass4W6.A01(r3, r1, r0)     // Catch:{ IllegalStateException -> 0x0180 }
            X.AnonymousClass4XT.A00(r5, r7, r0)     // Catch:{ IllegalStateException -> 0x0180 }
            X.5HE r0 = new X.5HE     // Catch:{ IllegalStateException -> 0x0180 }
            r0.<init>(r4)     // Catch:{ IllegalStateException -> 0x0180 }
            r5.setOnDismissListener((X.C18090vk) r0)     // Catch:{ IllegalStateException -> 0x0180 }
            r0 = 24
            X.C89924dF.A00(r5, r4, r0)     // Catch:{ IllegalStateException -> 0x0180 }
            boolean r0 = X.C22891Dp.A02     // Catch:{ IllegalStateException -> 0x0180 }
            if (r0 != 0) goto L_0x017c
            r5.A08()     // Catch:{ IllegalStateException -> 0x0180 }
            goto L_0x012b
        L_0x017c:
            r5.A07()     // Catch:{ IllegalStateException -> 0x0180 }
            goto L_0x012b
        L_0x0180:
            r1 = move-exception
            java.lang.String r0 = "LockedConversationsFragment/Failed to inflate banner"
            com.whatsapp.util.Log.e(r0, r1)
            r6 = 0
            goto L_0x012b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5SF.invoke(java.lang.Object):java.lang.Object");
    }
}
