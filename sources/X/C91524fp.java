package X;

/* renamed from: X.4fp  reason: invalid class name and case insensitive filesystem */
public class C91524fp implements C22851Dl {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final boolean A03;

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005f, code lost:
        if (r1 == false) goto L_0x0061;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Bo9(java.lang.Object r13) {
        /*
            r12 = this;
            r9 = r13
            int r0 = r12.A00
            switch(r0) {
                case 0: goto L_0x007f;
                case 1: goto L_0x0048;
                default: goto L_0x0006;
            }
        L_0x0006:
            java.lang.Object r4 = r12.A01
            com.whatsapp.settings.chat.wallpaper.downloadable.picker.DownloadableWallpaperPickerActivity r4 = (com.whatsapp.settings.chat.wallpaper.downloadable.picker.DownloadableWallpaperPickerActivity) r4
            boolean r7 = r12.A03
            java.lang.Object r5 = r12.A02
            android.view.View r5 = (android.view.View) r5
            X.4Mu r9 = (X.C85284Mu) r9
            int r6 = r9.A00
            r0 = 2
            r3 = 1
            r2 = 0
            r1 = 8
            if (r6 != r0) goto L_0x00e0
            X.4Mt r0 = r9.A01
            X.C17960vV.A07(r0)
            if (r7 == 0) goto L_0x0045
            java.util.List r0 = r0.A01
        L_0x0024:
            r4.A08 = r0
            android.view.View r0 = r4.A01
            r0.setVisibility(r1)
            android.view.View r0 = r4.A00
            r0.setVisibility(r1)
            androidx.recyclerview.widget.RecyclerView r0 = r4.A03
            r0.setVisibility(r2)
            r5.setEnabled(r2)
            X.0yx r2 = r4.A02
            if (r2 != 0) goto L_0x003d
            r3 = 0
        L_0x003d:
            X.3XG r1 = r4.A07
            java.util.List r0 = r4.A08
            r1.A0U(r2, r0, r3)
        L_0x0044:
            return
        L_0x0045:
            java.util.List r0 = r0.A00
            goto L_0x0024
        L_0x0048:
            java.lang.Object r4 = r12.A01
            com.whatsapp.newsletter.multiadmin.DismissNewsletterAdminDialogFragment r4 = (com.whatsapp.newsletter.multiadmin.DismissNewsletterAdminDialogFragment) r4
            java.lang.Object r2 = r12.A02
            android.widget.CompoundButton r2 = (android.widget.CompoundButton) r2
            boolean r1 = r12.A03
            boolean r0 = r4.A1b()
            if (r0 == 0) goto L_0x0044
            boolean r0 = r2.isChecked()
            if (r0 == 0) goto L_0x0061
            r3 = 1
            if (r1 != 0) goto L_0x0062
        L_0x0061:
            r3 = 0
        L_0x0062:
            X.0vl r0 = r4.A02
            java.lang.Object r2 = r0.getValue()
            com.whatsapp.jid.UserJid r2 = (com.whatsapp.jid.UserJid) r2
            if (r2 == 0) goto L_0x007b
            X.1FL r1 = r4.A1B()
            boolean r0 = r1 instanceof X.C107575aF
            if (r0 == 0) goto L_0x007b
            X.5aF r1 = (X.C107575aF) r1
            if (r1 == 0) goto L_0x007b
            r1.Bru(r2, r3)
        L_0x007b:
            r4.A28()
            return
        L_0x007f:
            java.lang.Object r7 = r12.A01
            com.whatsapp.community.CommunityMembersActivity r7 = (com.whatsapp.community.CommunityMembersActivity) r7
            java.lang.Object r8 = r12.A02
            X.3XL r8 = (X.AnonymousClass3XL) r8
            boolean r11 = r12.A03
            java.util.List r9 = (java.util.List) r9
            java.lang.String r0 = "load_community_member"
            r7.A3C(r0)
            java.util.List r1 = r8.A0B
            int r0 = r1.size()
            r4 = 0
            if (r0 == 0) goto L_0x00aa
            int r1 = r1.size()
            r0 = 1
            if (r1 != r0) goto L_0x0108
            long r5 = r8.A0M(r4)
            r1 = 0
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0108
        L_0x00aa:
            java.lang.String r3 = "render_community_member"
            r7.A3D(r3)
            if (r11 == 0) goto L_0x00d3
            r8.A0U(r9)
        L_0x00b4:
            r7.A3C(r3)
            int r0 = r9.size()
            if (r0 <= 0) goto L_0x0044
            X.1HB r3 = r7.A00
            int r0 = r9.size()
            java.lang.String r2 = java.lang.Integer.toString(r0)
            java.lang.String r1 = "member_count"
            X.19a r0 = r3.A01
            r0.A0A(r1, r2, r4)
            r0 = 2
            r7.Biu(r0)
            return
        L_0x00d3:
            X.10I r2 = r7.A05
            r1 = 42
            X.Ak1 r0 = new X.Ak1
            r0.<init>(r7, r8, r9, r1)
            r2.CGF(r0)
            goto L_0x00b4
        L_0x00e0:
            if (r6 != r3) goto L_0x00f5
            r5.setEnabled(r2)
            android.view.View r0 = r4.A01
            r0.setVisibility(r2)
            android.view.View r0 = r4.A00
            r0.setVisibility(r1)
            androidx.recyclerview.widget.RecyclerView r0 = r4.A03
            r0.setVisibility(r1)
            return
        L_0x00f5:
            android.view.View r0 = r4.A01
            r0.setVisibility(r1)
            android.view.View r0 = r4.A00
            r0.setVisibility(r2)
            androidx.recyclerview.widget.RecyclerView r0 = r4.A03
            r0.setVisibility(r1)
            r5.setEnabled(r3)
            return
        L_0x0108:
            X.1KB r1 = r7.A05
            java.lang.Runnable r0 = r7.A0G
            r1.A0I(r0)
            r10 = 12
            X.7RT r6 = new X.7RT
            r6.<init>(r7, r8, r9, r10, r11)
            r7.A0G = r6
            X.1KB r2 = r7.A05
            r0 = 500(0x1f4, double:2.47E-321)
            r2.A0K(r6, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C91524fp.Bo9(java.lang.Object):void");
    }

    public C91524fp(Object obj, Object obj2, int i, boolean z) {
        this.A00 = i;
        this.A01 = obj2;
        this.A03 = z;
        this.A02 = obj;
    }
}
