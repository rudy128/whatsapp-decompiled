package X;

/* renamed from: X.6lX  reason: invalid class name and case insensitive filesystem */
public abstract class C131706lX {
    public final Integer A00;

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0115  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00() {
        /*
            r11 = this;
            boolean r0 = r11 instanceof X.C121226Iq
            if (r0 == 0) goto L_0x002c
            r0 = r11
            X.6Iq r0 = (X.C121226Iq) r0
            X.7J1 r0 = r0.A00
            X.72I r3 = r0.A08
            X.1zP r2 = r3.A02
            java.util.concurrent.CopyOnWriteArraySet r0 = r2.A04
            r0.clear()
            r0 = 0
            r2.A01(r0)
            android.widget.ImageButton r0 = r3.A00
            X.C108975cc.A0s(r0)
            r2 = 0
            X.AnonymousClass72I.A01(r3, r2)
            android.widget.ImageButton r1 = r3.A00
            r0 = 1
            X.AnonymousClass71W.A00(r1, r0, r2)
            android.widget.ImageButton r0 = r3.A01
            X.AnonymousClass71W.A00(r0, r2, r2)
            return
        L_0x002c:
            boolean r0 = r11 instanceof X.C121216Ip
            if (r0 == 0) goto L_0x0080
            r0 = r11
            X.6Ip r0 = (X.C121216Ip) r0
            X.7J1 r0 = r0.A00
        L_0x0035:
            X.8AJ r10 = r0.A0J
            int r9 = r0.A03
            java.lang.String r8 = r0.A09
            com.whatsapp.textstatuscomposer.bottombar.CreationModeBottomBar r10 = (com.whatsapp.textstatuscomposer.bottombar.CreationModeBottomBar) r10
            r7 = 1
            X.C18070vi.A0d(r8, r7)
            android.widget.ImageButton r6 = r10.A04
            java.lang.String r5 = "sendButton"
            if (r6 == 0) goto L_0x007c
            X.C108975cc.A0s(r6)
            r6.setEnabled(r7)
            X.0vb r4 = r10.getWhatsAppLocale()
            android.content.Context r3 = r6.getContext()
            android.content.Context r2 = r6.getContext()
            r1 = 2130970097(0x7f0405f1, float:1.7548894E38)
            r0 = 2131103410(0x7f060eb2, float:1.7819285E38)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass4aX.A04(r2, r3, r1, r0, r9)
            X.C74743cP.A03(r0, r6, r4)
            r6.setContentDescription(r8)
            android.widget.ImageButton r0 = r10.A04
            if (r0 == 0) goto L_0x007c
            r3 = 0
            X.AnonymousClass71W.A00(r0, r7, r3)
            android.widget.ImageButton r0 = r10.A03
        L_0x0073:
            if (r0 != 0) goto L_0x0115
            java.lang.String r0 = "micButton"
            X.C18070vi.A11(r0)
        L_0x007a:
            r0 = 0
            throw r0
        L_0x007c:
            X.C18070vi.A11(r5)
            goto L_0x007a
        L_0x0080:
            boolean r0 = r11 instanceof X.AnonymousClass6Io
            if (r0 == 0) goto L_0x008a
            r0 = r11
            X.6Io r0 = (X.AnonymousClass6Io) r0
            X.7J1 r0 = r0.A00
            goto L_0x0035
        L_0x008a:
            boolean r0 = r11 instanceof X.AnonymousClass6In
            if (r0 == 0) goto L_0x00f2
            r0 = r11
            X.6In r0 = (X.AnonymousClass6In) r0
            X.7J1 r1 = r0.A00
            boolean r0 = r1.A0D
            X.72I r4 = r1.A08
            if (r0 == 0) goto L_0x00e8
            float r3 = r1.A00
        L_0x009b:
            android.widget.ImageButton r0 = r4.A00
            float r5 = X.C108945cZ.A03(r0)
            r0 = 1085276160(0x40b00000, float:5.5)
            float r5 = r5 / r0
            X.0vb r0 = r4.A05
            if (r0 == 0) goto L_0x00ee
            boolean r1 = X.AnonymousClass3MW.A1Z(r0)
            X.8AJ r2 = r4.A08
            com.whatsapp.textstatuscomposer.bottombar.CreationModeBottomBar r2 = (com.whatsapp.textstatuscomposer.bottombar.CreationModeBottomBar) r2
            float r0 = r2.A01
            if (r1 == 0) goto L_0x00e5
            float r0 = r0 - r5
        L_0x00b5:
            float r3 = r3 + r0
            X.0vb r0 = r4.A05
            if (r0 == 0) goto L_0x00ee
            boolean r1 = X.AnonymousClass3MY.A1b(r0)
            r0 = 0
            if (r1 == 0) goto L_0x00e0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x00c6
        L_0x00c5:
            r3 = 0
        L_0x00c6:
            X.0vb r0 = r4.A05
            if (r0 == 0) goto L_0x00ea
            boolean r0 = X.AnonymousClass3MY.A1b(r0)
            float r1 = r2.A00
            if (r0 == 0) goto L_0x00db
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x00d7
        L_0x00d6:
            r3 = r1
        L_0x00d7:
            X.AnonymousClass72I.A00(r4, r3)
            return
        L_0x00db:
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x00d7
            goto L_0x00d6
        L_0x00e0:
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x00c6
            goto L_0x00c5
        L_0x00e5:
            float r0 = -r0
            float r0 = r0 + r5
            goto L_0x00b5
        L_0x00e8:
            r3 = 0
            goto L_0x009b
        L_0x00ea:
            X.AnonymousClass3MW.A1M()
            goto L_0x007a
        L_0x00ee:
            X.AnonymousClass3MW.A1M()
            goto L_0x007a
        L_0x00f2:
            r0 = r11
            X.6Im r0 = (X.AnonymousClass6Im) r0
            X.7J1 r0 = r0.A00
            X.8AJ r2 = r0.A0J
            com.whatsapp.textstatuscomposer.bottombar.CreationModeBottomBar r2 = (com.whatsapp.textstatuscomposer.bottombar.CreationModeBottomBar) r2
            android.widget.ImageButton r0 = r2.A04
            java.lang.String r1 = "sendButton"
            if (r0 == 0) goto L_0x0110
            r3 = 0
            r0.setEnabled(r3)
            android.widget.ImageButton r0 = r2.A04
            if (r0 == 0) goto L_0x0110
            X.AnonymousClass71W.A00(r0, r3, r3)
            android.widget.ImageButton r0 = r2.A03
            goto L_0x0073
        L_0x0110:
            X.C18070vi.A11(r1)
            goto L_0x007a
        L_0x0115:
            X.AnonymousClass71W.A00(r0, r3, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C131706lX.A00():void");
    }

    public C131706lX(Integer num) {
        this.A00 = num;
    }
}
