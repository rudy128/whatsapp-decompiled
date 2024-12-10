package X;

import com.whatsapp.mediacomposer.ui.bottomsheet.ImageQualitySettingsBottomSheetFragment;

/* renamed from: X.7Qu  reason: invalid class name and case insensitive filesystem */
public class C146837Qu implements Runnable {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final boolean A03;

    public C146837Qu(ImageQualitySettingsBottomSheetFragment imageQualitySettingsBottomSheetFragment, boolean z) {
        this.A00 = 4;
        this.A02 = imageQualitySettingsBottomSheetFragment;
        this.A03 = z;
        this.A01 = 2131891938;
    }

    /* JADX WARNING: type inference failed for: r8v2, types: [boolean] */
    /* JADX WARNING: Removed duplicated region for block: B:152:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x005d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r16 = this;
            r5 = r16
            int r0 = r5.A00
            switch(r0) {
                case 0: goto L_0x007d;
                case 1: goto L_0x009a;
                case 2: goto L_0x0172;
                case 3: goto L_0x017e;
                case 4: goto L_0x01f3;
                case 5: goto L_0x01ab;
                case 6: goto L_0x01d0;
                case 7: goto L_0x00b7;
                case 8: goto L_0x00e7;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r1 = r5.A02
            X.7BC r1 = (X.AnonymousClass7BC) r1
            int r6 = r5.A01
            boolean r7 = r5.A03
            r4 = 0
            r5 = 1
            if (r6 != r5) goto L_0x0019
            X.6Mr r0 = r1.A00
            r0.A0Q = r4
            r0.A0E = r4
        L_0x0019:
            X.6Mr r3 = r1.A00
            boolean r0 = r3.A0Q
            if (r0 != 0) goto L_0x0069
            X.88S r0 = r3.A0B
            if (r0 == 0) goto L_0x0026
            r0.C0q(r7, r6)
        L_0x0026:
            r2 = 3
            if (r6 != r2) goto L_0x003a
            if (r7 == 0) goto L_0x003a
            boolean r0 = r3.A0R
            if (r0 == 0) goto L_0x003a
            r3.A0R = r4
            X.6Mj r1 = r3.A0C
            if (r1 == 0) goto L_0x003a
            r0 = 500(0x1f4, float:7.0E-43)
            r1.A0A(r0)
        L_0x003a:
            X.6ra r0 = r3.A09
            if (r0 == 0) goto L_0x0041
            r0.A02(r7, r6)
        L_0x0041:
            if (r6 != r2) goto L_0x006a
            if (r7 == 0) goto L_0x006a
            boolean r0 = r3.A0P
            if (r0 != 0) goto L_0x0052
            r3.A0P = r5
            X.88R r0 = r3.A0A
            if (r0 == 0) goto L_0x0052
            r0.C6F()
        L_0x0052:
            r3.A0O = r4
        L_0x0054:
            boolean r2 = r3.A0E
            r1 = 2
            boolean r0 = X.AnonymousClass000.A1T(r6, r1)
            if (r2 == r0) goto L_0x0069
            if (r6 != r1) goto L_0x0060
            r4 = 1
        L_0x0060:
            r3.A0E = r4
            X.88O r0 = r3.A07
            if (r0 == 0) goto L_0x0069
            r0.Bmq(r3, r4)
        L_0x0069:
            return
        L_0x006a:
            r3.A0E = r4
            r0 = 4
            if (r6 != r0) goto L_0x0052
            boolean r0 = r3.A0O
            if (r0 != 0) goto L_0x0054
            r3.A0O = r5
            X.88P r0 = r3.A08
            if (r0 == 0) goto L_0x0054
            r0.BpQ(r3)
            goto L_0x0054
        L_0x007d:
            java.lang.Object r1 = r5.A02
            X.31p r1 = (X.C679831p) r1
            boolean r4 = r5.A03
            int r3 = r5.A01
            boolean r0 = X.C679831p.A0D(r1)
            if (r0 == 0) goto L_0x0069
            X.00H r0 = r1.A09
            java.lang.Object r2 = r0.get()
            X.88z r2 = (X.C1605688z) r2
            X.Cn3 r1 = r1.A03
            r0 = 0
            r2.CHK(r1, r3, r4, r0)
            return
        L_0x009a:
            java.lang.Object r2 = r5.A02
            com.whatsapp.gallery.MediaGalleryFragmentBase r2 = (com.whatsapp.gallery.MediaGalleryFragmentBase) r2
            boolean r6 = r5.A03
            int r4 = r5.A01
            X.87B r3 = r2.A28()
            if (r3 == 0) goto L_0x0069
            X.1KB r0 = r2.A26()
            r5 = 8
            X.7RR r1 = new X.7RR
            r1.<init>(r2, r3, r4, r5, r6)
            r0.CGP(r1)
            return
        L_0x00b7:
            java.lang.Object r4 = r5.A02
            com.whatsapp.settings.SettingsContactsActivity r4 = (com.whatsapp.settings.SettingsContactsActivity) r4
            int r3 = r5.A01
            boolean r1 = r5.A03
            r2 = 0
            X.C18070vi.A0d(r4, r2)
            com.whatsapp.settings.SettingsContactsActivity.A0c(r4, r2)
            androidx.appcompat.widget.SwitchCompat r0 = r4.A06
            if (r0 != 0) goto L_0x00ce
            java.lang.String r0 = "contactBackupSwitch"
            goto L_0x02b5
        L_0x00ce:
            r0.toggle()
            com.whatsapp.settings.SettingsContactsActivity.A0V(r4, r3)
            if (r1 == 0) goto L_0x0069
            boolean r0 = r4.A0b
            if (r0 != 0) goto L_0x0069
            r0 = 1
            r4.A0b = r0
            X.1jR r1 = r4.A0F
            if (r1 == 0) goto L_0x01e3
            java.lang.String r0 = "backup-settings"
            r1.A00(r4, r0, r2)
            return
        L_0x00e7:
            java.lang.Object r0 = r5.A02
            X.7BD r0 = (X.AnonymousClass7BD) r0
            int r3 = r5.A01
            X.6Mw r2 = r0.A00
            r2.A00 = r3
            r0 = 3
            if (r3 != r0) goto L_0x00fc
            X.6ph r0 = r2.A01
            if (r0 == 0) goto L_0x0069
            r0.A00()
            return
        L_0x00fc:
            X.6Mj r0 = r2.A02
            if (r0 == 0) goto L_0x015b
            r5 = 4
            if (r3 != r5) goto L_0x015b
            android.widget.FrameLayout r0 = r0.A0F
            boolean r0 = X.C108995ce.A1U(r0)
            if (r0 != 0) goto L_0x0110
            X.6Mj r0 = r2.A02
            r0.A05()
        L_0x0110:
            X.6ph r0 = r2.A01
            if (r0 == 0) goto L_0x0117
            r0.A00()
        L_0x0117:
            X.Cye r0 = r2.A00
            if (r0 == 0) goto L_0x0069
            r0.A0B()
            X.Cye r6 = r2.A00
            r0 = 0
            r4 = 2
            java.lang.Object[] r1 = new java.lang.Object[r4]
            boolean r8 = X.C72453Mb.A1b(r1, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r8)
            r7 = 1
            r1[r7] = r0
            java.lang.String r0 = "seekTo: seekTimeMsWithPreview: %d, jumpSeek: %s"
            X.C26378Cye.A06(r6, r0, r1)
            r0 = 0
            r6.A0O = r0
            java.util.concurrent.atomic.AtomicLong r0 = X.C26378Cye.A0U
            long r0 = r0.incrementAndGet()
            r6.A0P = r0
            long r0 = android.os.SystemClock.elapsedRealtime()
            r6.A0Q = r0
            android.os.Handler r3 = r6.A0C
            r0 = 3
            long[] r2 = new long[r0]
            long r0 = r6.A0O
            r2[r8] = r0
            long r0 = r6.A0P
            r2[r7] = r0
            r0 = 0
            r2[r4] = r0
            X.C108955ca.A1F(r3, r2, r5)
            return
        L_0x015b:
            r0 = 2
            X.6ph r1 = r2.A01
            if (r3 != r0) goto L_0x016c
            if (r1 == 0) goto L_0x0069
            boolean r0 = r2.A04
            if (r0 == 0) goto L_0x01e7
            java.lang.String r0 = r2.A03
            r1.A01(r0)
            return
        L_0x016c:
            if (r1 == 0) goto L_0x0069
            r1.A00()
            return
        L_0x0172:
            java.lang.Object r2 = r5.A02
            X.1h9 r2 = (X.C32411h9) r2
            int r1 = r5.A01
            boolean r0 = r5.A03
            X.C32411h9.A01(r2, r1, r0)
            return
        L_0x017e:
            boolean r1 = r5.A03
            java.lang.Object r0 = r5.A02
            X.6yZ r0 = (X.C139276yZ) r0
            int r8 = r5.A01
            X.00H r0 = r0.A03
            java.lang.Object r0 = r0.get()
            X.6zi r0 = (X.C139956zi) r0
            if (r1 == 0) goto L_0x0194
            r0.A02(r8)
            return
        L_0x0194:
            X.1KB r7 = r0.A00
            X.0vb r6 = r0.A01
            r5 = 2131755488(0x7f1001e0, float:1.9141857E38)
            long r3 = (long) r8
            r2 = 1
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r0 = 0
            X.C17880vN.A1T(r1, r8, r0)
            java.lang.String r0 = r6.A0K(r1, r5, r3)
            r7.A0G(r0, r2)
            return
        L_0x01ab:
            java.lang.Object r4 = r5.A02
            X.1Ku r4 = (X.C24561Ku) r4
            boolean r3 = r5.A03
            int r2 = r5.A01
            X.00H r1 = r4.A03
            java.lang.Object r0 = r1.get()
            X.193 r0 = (X.AnonymousClass193) r0
            r0.A00()
            X.7KU r0 = new X.7KU
            r0.<init>(r4, r2, r3)
            r4.notifyAllObservers(r0)
            java.lang.Object r0 = r1.get()
            X.193 r0 = (X.AnonymousClass193) r0
            r0.A00()
            return
        L_0x01d0:
            java.lang.Object r1 = r5.A02
            X.2iv r1 = (X.C57342iv) r1
            boolean r0 = r5.A03
            int r3 = r5.A01
            X.1jH r2 = r1.A01
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            r0 = 0
            X.C33721jH.A00(r2, r1, r0, r3)
            return
        L_0x01e3:
            java.lang.String r0 = "clientIplsSecretKeyProvider"
            goto L_0x02b5
        L_0x01e7:
            com.whatsapp.videoplayback.ExoPlayerErrorFrame r1 = r1.A02
            r0 = 0
            r1.setLoadingViewVisibility(r0)
            android.widget.FrameLayout r0 = r1.A02
            X.C72453Mb.A1D(r0)
            return
        L_0x01f3:
            java.lang.Object r6 = r5.A02
            com.whatsapp.mediacomposer.ui.bottomsheet.ImageQualitySettingsBottomSheetFragment r6 = (com.whatsapp.mediacomposer.ui.bottomsheet.ImageQualitySettingsBottomSheetFragment) r6
            boolean r2 = r5.A03
            X.00H r0 = r6.A06
            if (r0 == 0) goto L_0x02b0
            X.6ub r8 = X.C108945cZ.A0j(r0)
            X.72S r0 = r6.A02
            android.net.Uri r9 = r0.A0X
            android.graphics.Rect r3 = r0.A05()
            r7 = 2
            int[] r5 = new int[r7]
            r5 = {3, 0} // fill-array
            X.11C r0 = r8.A00
            X.11B r0 = r0.A0O()
            int r1 = X.C26511Sk.A00(r9, r0)
            r4 = 0
            if (r2 != 0) goto L_0x02ad
            r0 = 6
            if (r1 == r0) goto L_0x0223
            r0 = 8
            if (r1 != r0) goto L_0x02ad
        L_0x0223:
            r2 = 1
        L_0x0224:
            if (r3 == 0) goto L_0x029a
            int r10 = r3.width()
            int r11 = r3.height()
        L_0x022e:
            java.util.HashMap r9 = X.C17880vN.A11()
        L_0x0232:
            r3 = r5[r4]
            r1 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r13 = 1
            X.6nF r0 = r8.A00(r0, r13, r1)
            if (r0 == 0) goto L_0x027f
            int r2 = r0.A00
            android.graphics.BitmapFactory$Options r15 = new android.graphics.BitmapFactory$Options
            r15.<init>()
            r14 = 1
            r15.inSampleSize = r13
            int r12 = java.lang.Math.max(r10, r11)
        L_0x024e:
            int r1 = r12 / 2
            int r0 = r2 * 8
            int r0 = r0 / 10
            if (r1 <= r0) goto L_0x025d
            int r12 = r12 / 2
            int r14 = r14 * 2
            r15.inSampleSize = r14
            goto L_0x024e
        L_0x025d:
            int r1 = r10 / r14
            int r0 = r11 / r14
            int r0 = java.lang.Math.max(r1, r0)
            int r2 = java.lang.Math.min(r2, r0)
            if (r10 > r11) goto L_0x026c
            r13 = 0
        L_0x026c:
            r12 = 1065353216(0x3f800000, float:1.0)
            if (r13 == 0) goto L_0x0290
            float r1 = (float) r10
            float r0 = (float) r11
            float r0 = r0 * r12
            float r1 = r1 / r0
            float r0 = (float) r2
            float r0 = r0 / r1
            int r1 = (int) r0
        L_0x0277:
            X.6r6 r0 = new X.6r6
            r0.<init>(r2, r1)
            X.C108955ca.A1V(r0, r9, r3)
        L_0x027f:
            int r4 = r4 + 1
            if (r4 < r7) goto L_0x0232
            X.1KB r1 = r6.A02
            if (r1 == 0) goto L_0x02b3
            X.3Cu r0 = new X.3Cu
            r0.<init>((com.whatsapp.mediacomposer.ui.bottomsheet.ImageQualitySettingsBottomSheetFragment) r6, (java.util.Map) r9)
            r1.A0J(r0)
            return
        L_0x0290:
            float r1 = (float) r11
            float r0 = (float) r10
            float r0 = r0 * r12
            float r1 = r1 / r0
            float r0 = (float) r2
            float r0 = r0 / r1
            int r0 = (int) r0
            r1 = r2
            r2 = r0
            goto L_0x0277
        L_0x029a:
            X.1Nq r1 = r8.A03
            r0 = 1
            android.graphics.BitmapFactory$Options r0 = r1.A09(r9, r4, r0, r0)
            if (r2 == 0) goto L_0x02a8
            int r10 = r0.outHeight
            int r11 = r0.outWidth
            goto L_0x022e
        L_0x02a8:
            int r10 = r0.outWidth
            int r11 = r0.outHeight
            goto L_0x022e
        L_0x02ad:
            r2 = 0
            goto L_0x0224
        L_0x02b0:
            java.lang.String r0 = "imageQuality"
            goto L_0x02b5
        L_0x02b3:
            java.lang.String r0 = "globalUi"
        L_0x02b5:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C146837Qu.run():void");
    }

    public C146837Qu(Object obj, int i, int i2, boolean z) {
        this.A00 = i2;
        this.A02 = obj;
        this.A03 = z;
        this.A01 = i;
    }
}
