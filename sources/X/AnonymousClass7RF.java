package X;

import android.widget.FrameLayout;

/* renamed from: X.7RF  reason: invalid class name */
public class AnonymousClass7RF implements Runnable {
    public boolean A00;
    public final int A01;
    public final Object A02;
    public final Object A03;

    public AnonymousClass7RF(FrameLayout frameLayout, C25591CiW ciW) {
        this.A01 = 1;
        this.A03 = ciW;
        this.A02 = frameLayout;
        this.A00 = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:207:0x05c6, code lost:
        if (r9.contains(java.lang.Long.valueOf(r0.A00.A01)) == false) goto L_0x05c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x065b, code lost:
        if (r5 == false) goto L_0x065d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:0x0a50, code lost:
        if (r2 != false) goto L_0x0a52;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:432:0x0cb1, code lost:
        X.ALS.A0D(r3, r4, X.C18070vi.A0M(X.C108975cc.A0h("result", X.C108975cc.A0h(r2, r0))));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:433:0x0cc2, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:466:0x0d7f, code lost:
        if (r11 <= r0) goto L_0x0d81;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:486:0x0dc0, code lost:
        if (r5 == 11) goto L_0x0dc2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:561:0x0efc, code lost:
        if (X.C72463Mc.A1Z(r29) == false) goto L_0x0efe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:570:0x0f1b, code lost:
        if (r16 == false) goto L_0x0f1d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:631:0x1041, code lost:
        if (r19 != false) goto L_0x1043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:715:0x122c, code lost:
        r0 = r4.edit().putString(r3, r2.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:716:0x1238, code lost:
        r0.apply();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:717:0x123b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:772:0x13de, code lost:
        if (r1.A0F != false) goto L_0x13e0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:569:0x0f19  */
    /* JADX WARNING: Removed duplicated region for block: B:574:0x0f2b  */
    /* JADX WARNING: Removed duplicated region for block: B:579:0x0f4c  */
    /* JADX WARNING: Removed duplicated region for block: B:586:0x0f6a  */
    /* JADX WARNING: Removed duplicated region for block: B:595:0x0f83  */
    /* JADX WARNING: Removed duplicated region for block: B:597:0x0f86  */
    /* JADX WARNING: Removed duplicated region for block: B:601:0x0fbb  */
    /* JADX WARNING: Removed duplicated region for block: B:604:0x0fd6  */
    /* JADX WARNING: Removed duplicated region for block: B:605:0x0fd8  */
    /* JADX WARNING: Removed duplicated region for block: B:622:0x102a  */
    /* JADX WARNING: Removed duplicated region for block: B:624:0x102f  */
    /* JADX WARNING: Removed duplicated region for block: B:627:0x1036  */
    /* JADX WARNING: Removed duplicated region for block: B:630:0x1040  */
    /* JADX WARNING: Removed duplicated region for block: B:641:0x1061  */
    /* JADX WARNING: Removed duplicated region for block: B:670:0x10cb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r40 = this;
            r6 = r40
            int r0 = r6.A01
            switch(r0) {
                case 0: goto L_0x0047;
                case 1: goto L_0x09f3;
                case 2: goto L_0x005a;
                case 3: goto L_0x00bc;
                case 4: goto L_0x0108;
                case 5: goto L_0x0a01;
                case 6: goto L_0x0a0f;
                case 7: goto L_0x0c5d;
                case 8: goto L_0x012e;
                case 9: goto L_0x0172;
                case 10: goto L_0x0c88;
                case 11: goto L_0x0ca1;
                case 12: goto L_0x0cc3;
                case 13: goto L_0x0192;
                case 14: goto L_0x0cdc;
                case 15: goto L_0x0cea;
                case 16: goto L_0x0cf8;
                case 17: goto L_0x0d0c;
                case 18: goto L_0x0d2c;
                case 19: goto L_0x10ef;
                case 20: goto L_0x1108;
                case 21: goto L_0x114e;
                case 22: goto L_0x1177;
                case 23: goto L_0x01ae;
                case 24: goto L_0x01c7;
                case 25: goto L_0x023a;
                case 26: goto L_0x027d;
                case 27: goto L_0x11e5;
                case 28: goto L_0x1209;
                case 29: goto L_0x02a1;
                case 30: goto L_0x02fc;
                case 31: goto L_0x03d1;
                case 32: goto L_0x123c;
                case 33: goto L_0x127a;
                case 34: goto L_0x128d;
                case 35: goto L_0x12a8;
                case 36: goto L_0x08d3;
                case 37: goto L_0x092a;
                case 38: goto L_0x0965;
                case 39: goto L_0x12c0;
                case 40: goto L_0x12ce;
                case 41: goto L_0x135e;
                case 42: goto L_0x1381;
                case 43: goto L_0x1393;
                case 44: goto L_0x13a1;
                case 45: goto L_0x09d1;
                case 46: goto L_0x13b8;
                case 47: goto L_0x13cf;
                case 48: goto L_0x13e6;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r7 = r6.A02
            X.87B r7 = (X.AnonymousClass87B) r7
            java.lang.Object r2 = r6.A03
            com.whatsapp.gallery.MediaGalleryFragmentBase r2 = (com.whatsapp.gallery.MediaGalleryFragmentBase) r2
            boolean r5 = r6.A00
            if (r7 == 0) goto L_0x09ee
            X.1FL r0 = r2.A1B()
            if (r0 == 0) goto L_0x0021
            boolean r1 = r0.isFinishing()
            r0 = 1
            if (r1 != r0) goto L_0x0021
        L_0x0020:
            return
        L_0x0021:
            android.view.View r0 = r2.A0B
            if (r0 == 0) goto L_0x0020
            X.0vl r0 = r2.A0i
            java.lang.Object r4 = r0.getValue()
            com.whatsapp.gallery.viewmodel.MediaGalleryFragmentViewModel r4 = (com.whatsapp.gallery.viewmodel.MediaGalleryFragmentViewModel) r4
            X.1OB r0 = r4.A02
            X.1dr r0 = X.C108975cc.A0j(r0)
            X.1OX r3 = X.C41561wd.A00(r4)
            X.0wl r2 = r4.A08
            com.whatsapp.gallery.viewmodel.MediaGalleryFragmentViewModel$loadMedia$1 r1 = new com.whatsapp.gallery.viewmodel.MediaGalleryFragmentViewModel$loadMedia$1
            r1.<init>(r7, r4, r0, r5)
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            X.1e4 r0 = X.C30451dy.A02(r0, r2, r1, r3)
            r4.A02 = r0
            return
        L_0x0047:
            boolean r0 = r6.A00
            if (r0 != 0) goto L_0x0020
            java.lang.Object r1 = r6.A03
            X.1Fw r1 = (X.C23391Fw) r1
            java.lang.Object r0 = r6.A02
            X.1Wq r0 = (X.C27581Wq) r0
            r1.A07(r0)
            r0 = 1
            r6.A00 = r0
            return
        L_0x005a:
            boolean r2 = r6.A00
            java.lang.Object r1 = r6.A03
            X.A05 r1 = (X.A05) r1
            X.9kr r0 = r1.A03
            if (r2 == 0) goto L_0x0099
            X.AEq r3 = r1.A04
            X.A8i r2 = r0.A00
            X.9lh r0 = r0.A01
            java.util.List r1 = X.C20123A8i.A04(r2, r0)
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0020
            X.A23 r2 = r2.A03
            java.lang.Object r0 = X.C108955ca.A0p(r1)
            X.9p5 r0 = (X.C192849p5) r0
            X.A4D r1 = r0.A07
            r0 = 1
            X.C18070vi.A0d(r1, r0)
            boolean r0 = X.A23.A00(r1, r2)
            if (r0 != 0) goto L_0x0020
            X.8fT r2 = r2.A00
            java.lang.String r0 = r1.A01
            X.C18070vi.A0X(r0)
            int r1 = X.C167138fT.A01(r3, r0)
            java.lang.String r0 = "download_resume"
            r2.A02(r1, r0)
            return
        L_0x0099:
            X.AEq r4 = r1.A04
            X.A8i r3 = r0.A00
            X.9lh r0 = r0.A01
            java.util.List r1 = X.C20123A8i.A04(r3, r0)
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0020
            java.lang.Object r0 = X.C108955ca.A0p(r1)
            X.9p5 r0 = (X.C192849p5) r0
            X.A4D r0 = r0.A07
            java.util.List r2 = java.util.Collections.singletonList(r0)
            java.lang.Integer r1 = X.AnonymousClass00R.A0C
            r0 = 1
            X.C20123A8i.A08(r3, r4, r1, r2, r0)
            return
        L_0x00bc:
            java.lang.Object r5 = r6.A02
            X.DEn r5 = (X.C26805DEn) r5
            java.lang.Object r4 = r6.A03
            X.BzI r4 = (X.C24321BzI) r4
            boolean r8 = r6.A00
            java.lang.ref.WeakReference r0 = r5.A0C
            java.lang.Object r3 = r0.get()
            X.E7h r3 = (X.C28556E7h) r3
            if (r3 == 0) goto L_0x0020
            com.facebook.smartcapture.view.IdCaptureActivity r3 = (com.facebook.smartcapture.view.IdCaptureActivity) r3
            float r2 = X.C72463Mc.A00(r3)
            android.widget.FrameLayout r0 = r3.A01
            X.C18070vi.A0b(r0)
            int r1 = r0.getWidth()
            android.widget.FrameLayout r0 = r3.A01
            X.C18070vi.A0b(r0)
            int r0 = r0.getHeight()
            android.graphics.Rect r6 = X.C24570C9r.A00(r4, r2, r1, r0)
            java.lang.Integer r5 = r5.A04
            r0 = 0
            X.C18070vi.A0d(r5, r0)
            com.facebook.smartcapture.ui.CaptureOverlayFragment r0 = r3.A04
            X.C18070vi.A0b(r0)
            com.facebook.smartcapture.ui.DefaultCaptureOverlayFragment r0 = (com.facebook.smartcapture.ui.DefaultCaptureOverlayFragment) r0
            com.facebook.smartcapture.components.ContourView r4 = r0.A06
            X.C18070vi.A0b(r4)
            r7 = 2
            X.7RT r3 = new X.7RT
            r3.<init>(r4, r5, r6, r7, r8)
            r4.post(r3)
            return
        L_0x0108:
            java.lang.Object r1 = r6.A02
            com.google.android.material.behavior.SwipeDismissBehavior r1 = (com.google.android.material.behavior.SwipeDismissBehavior) r1
            X.Cwc r0 = r1.A03
            if (r0 == 0) goto L_0x011e
            boolean r0 = r0.A0F()
            if (r0 == 0) goto L_0x011e
            java.lang.Object r0 = r6.A03
            android.view.View r0 = (android.view.View) r0
            r0.postOnAnimation(r6)
            return
        L_0x011e:
            boolean r0 = r6.A00
            if (r0 == 0) goto L_0x0020
            X.E5i r1 = r1.A04
            if (r1 == 0) goto L_0x0020
            java.lang.Object r0 = r6.A03
            android.view.View r0 = (android.view.View) r0
            r1.Brq(r0)
            return
        L_0x012e:
            java.lang.Object r5 = r6.A02
            X.1Ty r5 = (X.C26911Ty) r5
            java.lang.Object r4 = r6.A03
            com.whatsapp.jid.UserJid r4 = (com.whatsapp.jid.UserJid) r4
            boolean r2 = r6.A00
            X.AEW r1 = r5.A08(r4)
            if (r1 == 0) goto L_0x0020
            boolean r0 = r1.A0X
            if (r0 == r2) goto L_0x0020
            X.A4n r0 = new X.A4n
            r0.<init>(r1)
            r0.A0Z = r2
            X.AEW r3 = r0.A01()
            X.0vl r0 = r5.A04
            java.lang.Object r1 = r0.getValue()
            X.9CB r1 = (X.AnonymousClass9CB) r1
            java.util.HashMap r0 = X.C17880vN.A11()
            r0.put(r4, r3)
            r1.A0L(r0)
            X.0vl r0 = r5.A09
            java.lang.Object r2 = r0.getValue()
            X.1KB r2 = (X.AnonymousClass1KB) r2
            r1 = 45
            X.AkK r0 = new X.AkK
            r0.<init>(r5, r3, r1)
            r2.CGP(r0)
            return
        L_0x0172:
            java.lang.Object r0 = r6.A02
            com.whatsapp.biz.catalog.manager.CatalogManager r0 = (com.whatsapp.biz.catalog.manager.CatalogManager) r0
            java.lang.Object r3 = r6.A03
            X.9gB r3 = (X.C187669gB) r3
            boolean r2 = r6.A00
            java.util.List r0 = r0.A09
            java.util.Iterator r1 = r0.iterator()
        L_0x0182:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0020
            java.lang.Object r0 = r1.next()
            X.B7C r0 = (X.B7C) r0
            r0.C1u(r3, r2)
            goto L_0x0182
        L_0x0192:
            java.lang.Object r0 = r6.A02
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r2 = r6.A00
            java.lang.Object r1 = r6.A03
            X.9nK r1 = (X.C191869nK) r1
            boolean r0 = r0.isFinishing()
            if (r0 != 0) goto L_0x0020
            if (r2 != 0) goto L_0x0020
            X.1KB r2 = r1.A04
            r1 = 0
            r0 = 2131898558(0x7f1230be, float:1.9432037E38)
            r2.A08(r0, r1)
            return
        L_0x01ae:
            java.lang.Object r0 = r6.A02
            com.whatsapp.community.CommunitySpamReportDialogFragment r0 = (com.whatsapp.community.CommunitySpamReportDialogFragment) r0
            boolean r4 = r6.A00
            java.lang.Object r3 = r6.A03
            X.8GM r3 = (X.AnonymousClass8GM) r3
            X.1KB r2 = r0.A00
            r1 = 2131888854(0x7f120ad6, float:1.9412355E38)
            r0 = 1
            r2.A08(r1, r0)
            if (r4 == 0) goto L_0x0020
            r3.A0T()
            return
        L_0x01c7:
            java.lang.Object r0 = r6.A02
            java.util.List r0 = (java.util.List) r0
            boolean r7 = r6.A00
            java.lang.Object r6 = r6.A03
            X.9fV r6 = (X.C187249fV) r6
            r5 = 0
            X.C18070vi.A0d(r0, r5)
            java.util.Iterator r9 = r0.iterator()
        L_0x01d9:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0020
            java.lang.Object r8 = r9.next()
            X.1EC r8 = (X.AnonymousClass1EC) r8
            if (r7 == 0) goto L_0x0237
            X.00H r0 = r6.A01
            X.1kb r0 = X.AnonymousClass3MW.A0Z(r0)
            X.C18070vi.A0d(r8, r5)
            X.1MG r0 = r0.A08
            java.util.HashSet r3 = r0.A03(r8)
        L_0x01f6:
            java.util.Collection r3 = (java.util.Collection) r3
            X.1M9 r2 = r6.A00
            X.1E7 r1 = r2.A0G(r8)
            r4 = 1
            if (r1 == 0) goto L_0x0210
            X.1E7[] r0 = new X.AnonymousClass1E7[r4]
            r0[r5] = r1
            java.util.ArrayList r1 = X.AnonymousClass1ZU.A06(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            X.AnonymousClass1M9.A00(r2, r0, r1)
        L_0x0210:
            X.00H r0 = r6.A01
            X.1kb r0 = X.AnonymousClass3MW.A0Z(r0)
            r0.A0M(r8)
            java.util.Iterator r3 = r3.iterator()
        L_0x021d:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x01d9
            java.lang.Object r2 = r3.next()
            X.A2B r2 = (X.A2B) r2
            X.00H r0 = r6.A04
            java.lang.Object r1 = r0.get()
            X.1iW r1 = (X.C33251iW) r1
            com.whatsapp.jid.GroupJid r0 = r2.A02
            r1.A0X(r0, r4, r5)
            goto L_0x021d
        L_0x0237:
            X.0wS r3 = X.C18460wS.A00
            goto L_0x01f6
        L_0x023a:
            java.lang.Object r0 = r6.A02
            X.4mN r0 = (X.C95524mN) r0
            java.lang.Object r1 = r6.A03
            boolean r4 = r6.A00
            java.lang.Object r3 = r0.A01
            com.whatsapp.companiondevice.LinkedDevicesEnterCodeActivity r3 = (com.whatsapp.companiondevice.LinkedDevicesEnterCodeActivity) r3
            boolean r0 = r3.Bed()
            if (r0 != 0) goto L_0x0020
            X.4Q4 r0 = r3.A07
            X.2m6 r0 = r0.A00()
            if (r0 == 0) goto L_0x0277
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0277
            com.whatsapp.companiondevice.LinkedDevicesEnterCodeActivity.A0Q(r3)
            r0 = 0
            com.whatsapp.companiondevice.LinkedDevicesEnterCodeActivity.A0c(r3, r0)
            X.BCS r2 = com.whatsapp.companiondevice.LinkedDevicesEnterCodeActivity.A03(r3)
            if (r2 == 0) goto L_0x0277
            X.00H r0 = r3.A0E
            r0.get()
            r1 = -16
            if (r4 == 0) goto L_0x0272
            r1 = -15
        L_0x0272:
            r0 = 8
            r2.BiF(r0, r1)
        L_0x0277:
            X.00H r0 = r3.A0G
            r0.get()
            return
        L_0x027d:
            java.lang.Object r4 = r6.A02
            X.6zB r4 = (X.C139626zB) r4
            java.lang.Object r0 = r6.A03
            boolean r3 = r6.A00
            boolean r2 = X.C72453Mb.A1Z(r0)
            X.1M9 r1 = r4.A02
            java.util.List r0 = X.C18070vi.A0M(r0)
            r1.A0s(r0, r2)
            if (r3 != 0) goto L_0x0020
            X.1KB r2 = r4.A00
            r1 = 48
            X.7Pc r0 = new X.7Pc
            r0.<init>(r4, r1)
            r2.A0J(r0)
            return
        L_0x02a1:
            java.lang.Object r5 = r6.A02
            X.3u2 r5 = (X.C78983u2) r5
            boolean r0 = r6.A00
            java.lang.Object r4 = r6.A03
            X.206 r4 = (X.AnonymousClass206) r4
            if (r0 != 0) goto L_0x02b1
            X.C78983u2.A04(r5)
            return
        L_0x02b1:
            r0 = 2131432381(0x7f0b13bd, float:1.8486518E38)
            android.view.View r3 = r5.findViewById(r0)
            X.5c7 r0 = r5.A0l
            boolean r19 = r0.CLq()
            android.content.Context r6 = r5.getContext()
            r7 = 0
            X.205 r9 = r4.A0v
            X.1BI r8 = r9.A00
            X.C17960vV.A07(r8)
            r10 = 0
            r11 = 1
            r12 = -1
            r15 = 5
            r16 = r10
            r17 = r10
            r18 = r10
            r20 = r10
            r13 = r10
            r14 = r12
            android.content.Intent r6 = X.AnonymousClass6WZ.A00(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            if (r3 == 0) goto L_0x0020
            X.0ve r1 = r5.A0F
            android.content.Context r0 = r5.getContext()
            X.AnonymousClass745.A09(r0, r6, r3, r1)
            android.content.Context r2 = r5.getContext()
            android.content.Context r0 = r5.getContext()
            X.4ZR r1 = new X.4ZR
            r1.<init>(r0)
            java.lang.String r0 = X.AnonymousClass4W0.A01(r4)
            X.AnonymousClass745.A08(r2, r6, r3, r1, r0)
            return
        L_0x02fc:
            java.lang.Object r4 = r6.A02
            X.3u5 r4 = (X.AnonymousClass3u5) r4
            java.lang.Object r3 = r6.A03
            X.247 r3 = (X.AnonymousClass247) r3
            boolean r5 = r6.A00
            r4.getFMessage()
            r4.getFMessage()
            X.1gt r1 = r4.getAlbumNotificationManager()
            X.205 r0 = r3.A0v
            X.1BI r0 = r0.A00
            if (r0 == 0) goto L_0x032a
            java.util.HashMap r2 = r1.A00
            monitor-enter(r2)
            java.lang.Object r1 = r2.get(r0)     // Catch:{ all -> 0x1433 }
            java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch:{ all -> 0x1433 }
            if (r1 == 0) goto L_0x0329
            X.7xU r0 = new X.7xU     // Catch:{ all -> 0x1433 }
            r0.<init>(r3)     // Catch:{ all -> 0x1433 }
            X.C29401cD.A0N(r1, r0)     // Catch:{ all -> 0x1433 }
        L_0x0329:
            monitor-exit(r2)
        L_0x032a:
            X.2bi r1 = r4.getAlbumUnreadMessagesManager()
            X.247 r0 = r4.getFMessage()
            X.205 r7 = X.C108965cb.A0U(r0)
            X.1BI r0 = r7.A00
            r2 = 0
            if (r0 == 0) goto L_0x0379
            java.util.HashMap r6 = r1.A01
            monitor-enter(r6)
            java.lang.Object r0 = r6.get(r0)     // Catch:{ all -> 0x1436 }
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch:{ all -> 0x1436 }
            if (r0 == 0) goto L_0x0378
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x1436 }
        L_0x034a:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x1436 }
            if (r0 == 0) goto L_0x0376
            java.lang.Object r3 = r1.next()     // Catch:{ all -> 0x1436 }
            r0 = r3
            X.2m1 r0 = (X.C59262m1) r0     // Catch:{ all -> 0x1436 }
            X.206 r0 = r0.A02     // Catch:{ all -> 0x1436 }
            X.205 r0 = r0.A0v     // Catch:{ all -> 0x1436 }
            boolean r0 = X.C18070vi.A18(r0, r7)     // Catch:{ all -> 0x1436 }
            if (r0 == 0) goto L_0x034a
        L_0x0361:
            X.2m1 r3 = (X.C59262m1) r3     // Catch:{ all -> 0x1436 }
            if (r3 == 0) goto L_0x0378
            long r0 = r3.A00     // Catch:{ all -> 0x1436 }
            java.lang.Long r2 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x1436 }
            long r0 = r3.A01     // Catch:{ all -> 0x1436 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x1436 }
            X.1D6 r2 = X.AnonymousClass1D6.A01(r2, r0)     // Catch:{ all -> 0x1436 }
            goto L_0x0378
        L_0x0376:
            r3 = r2
            goto L_0x0361
        L_0x0378:
            monitor-exit(r6)
        L_0x0379:
            r4.A02 = r2
            r4.A2l(r5)
            X.247 r1 = r4.getFMessage()
            r0 = -1
            r4.A2S(r1, r0)
            r4.A1z()
            X.1D6 r0 = r4.A02
            if (r0 == 0) goto L_0x0020
            X.2bi r2 = r4.getAlbumUnreadMessagesManager()
            X.247 r0 = r4.getFMessage()
            X.205 r0 = r0.A0v
            X.1BI r1 = r0.A00
            X.1D6 r0 = r2.A00
            if (r0 == 0) goto L_0x0020
            java.lang.Object r0 = r0.first
            boolean r0 = X.C18070vi.A18(r0, r1)
            if (r0 == 0) goto L_0x0020
            X.1D6 r0 = r2.A00
            if (r0 == 0) goto L_0x0020
            java.lang.Object r0 = r0.second
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x0020
            int r3 = r0.intValue()
            X.2bi r1 = r4.getAlbumUnreadMessagesManager()
            r0 = 0
            r1.A00 = r0
            r0 = 1
            if (r3 < r0) goto L_0x0020
            X.0ve r2 = r4.A0F
            r1 = 11666(0x2d92, float:1.6348E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0020
            X.5cR r0 = r4.A03
            if (r0 == 0) goto L_0x0020
            r0.CNF(r3)
            return
        L_0x03d1:
            java.lang.Object r4 = r6.A02
            X.3sm r4 = (X.C78423sm) r4
            java.lang.Object r3 = r6.A03
            X.22H r3 = (X.AnonymousClass22H) r3
            boolean r0 = r6.A00
            r39 = r0
            android.widget.LinearLayout r0 = r4.A07
            r38 = r0
            java.lang.Object r0 = r38.getTag()
            if (r0 == 0) goto L_0x1439
            X.205 r0 = r3.A0v
            r37 = r0
            java.lang.Object r1 = r38.getTag()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x1439
            java.util.List r6 = r3.A17()
            r10 = 0
            if (r6 == 0) goto L_0x0424
            java.util.Iterator r9 = r6.iterator()
            r7 = 0
        L_0x0402:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0424
            java.lang.Object r5 = r9.next()
            X.212 r5 = (X.AnonymousClass212) r5
            X.205 r0 = r5.A0v
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x0402
            boolean r0 = r5 instanceof X.AnonymousClass22E
            if (r0 == 0) goto L_0x0402
            X.22E r5 = (X.AnonymousClass22E) r5
            long r1 = r5.A00
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 <= 0) goto L_0x0402
            java.util.List r10 = r5.A06
            r7 = r1
            goto L_0x0402
        L_0x0424:
            r4.A02 = r10
            X.1bI r1 = r4.A0C
            int r0 = r3.A00
            int r0 = X.C72453Mb.A02(r0)
            r1.A04(r0)
            java.util.List r0 = r3.A07
            r36 = r0
            java.util.Iterator r2 = r36.iterator()
            r18 = 0
        L_0x043b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0450
            java.lang.Object r0 = r2.next()
            X.A18 r0 = (X.A18) r0
            int r1 = r0.A00
            r0 = r18
            int r18 = java.lang.Math.max(r0, r1)
            goto L_0x043b
        L_0x0450:
            java.util.HashMap r17 = X.C17880vN.A11()
            if (r6 == 0) goto L_0x04a0
            int r8 = r6.size()
        L_0x045a:
            int r8 = r8 + -1
            if (r8 < 0) goto L_0x04a0
            java.lang.Object r7 = r6.get(r8)
            X.212 r7 = (X.AnonymousClass212) r7
            boolean r0 = r7 instanceof X.AnonymousClass22E
            if (r0 == 0) goto L_0x045a
            X.205 r0 = r7.A0v
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x045a
            X.22E r7 = (X.AnonymousClass22E) r7
            java.util.List r0 = r7.A06
            java.util.Iterator r5 = r0.iterator()
        L_0x0476:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x045a
            java.lang.Object r2 = r5.next()
            r0 = r17
            java.lang.Object r1 = r0.get(r2)
            android.util.Pair r1 = (android.util.Pair) r1
            if (r1 != 0) goto L_0x0495
            r0 = 0
            android.util.Pair r1 = X.C108945cZ.A0N(r7, r0)
        L_0x048f:
            r0 = r17
            r0.put(r2, r1)
            goto L_0x0476
        L_0x0495:
            java.lang.Object r0 = r1.second
            if (r0 != 0) goto L_0x0476
            java.lang.Object r0 = r1.first
            android.util.Pair r1 = X.C108945cZ.A0N(r0, r7)
            goto L_0x048f
        L_0x04a0:
            com.whatsapp.WaTextView r1 = r4.A0A
            boolean r0 = X.AnonymousClass000.A1R(r18)
            r1.setEnabled(r0)
            java.util.List r16 = r4.getHighlightTerms()
            r2 = 0
        L_0x04ae:
            int r0 = r36.size()
            java.util.List r1 = r4.A0D
            if (r2 >= r0) goto L_0x06ff
            int r0 = X.AnonymousClass3MX.A01(r1)
            if (r0 >= r2) goto L_0x06f7
            android.view.LayoutInflater r5 = X.AnonymousClass3MZ.A0D(r4)
            r0 = 2131626484(0x7f0e09f4, float:1.8880205E38)
            android.view.View r7 = X.AnonymousClass3MY.A0D(r5, r0)
            X.6b4 r0 = r4.A01
            X.1pZ r9 = r4.A0B
            boolean r8 = r4.A0E
            X.1Xd r0 = r0.A00
            X.10E r6 = r0.A00
            X.0ve r28 = X.AnonymousClass10E.A8r(r6)
            X.00S r0 = r6.AAv
            X.00H r31 = X.C000200d.A00(r0)
            X.0vb r26 = X.AnonymousClass10E.A6Q(r6)
            X.11S r21 = X.AnonymousClass10E.A17(r6)
            X.1KW r27 = X.AnonymousClass3Ma.A0f(r6)
            X.1iW r22 = X.AnonymousClass3MZ.A0U(r6)
            X.1M9 r23 = X.AnonymousClass10E.A4z(r6)
            X.11C r25 = X.AnonymousClass3Ma.A0a(r6)
            X.00S r0 = r6.A2H
            X.00H r32 = X.C000200d.A00(r0)
            X.10G r0 = r6.A00
            X.00S r5 = r0.A3q
            java.lang.Object r5 = r5.get()
            X.72e r5 = (X.C1406072e) r5
            X.0vc r30 = X.AnonymousClass3Ma.A0r(r6)
            X.00S r0 = r0.A3O
            X.00H r33 = X.C000200d.A00(r0)
            X.6Ct r0 = new X.6Ct
            r19 = r0
            r20 = r7
            r24 = r9
            r29 = r5
            r34 = r1
            r35 = r8
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            r5 = r38
            r5.addView(r7)
            r1.add(r0)
        L_0x0526:
            X.0zA r5 = r4.A00
            boolean r1 = r5.A07()
            if (r1 == 0) goto L_0x0538
            r5.A03()
            java.lang.String r0 = "canHandleOptionVotes"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x0538:
            android.content.Context r12 = r4.getContext()
            java.util.List r9 = r4.A02
            int r1 = r3.A00
            boolean r13 = X.AnonymousClass000.A1P(r1)
            r0.A01 = r3
            r1 = r36
            java.lang.Object r1 = r1.get(r2)
            X.A18 r1 = (X.A18) r1
            r0.A00 = r1
            java.lang.String r5 = r1.A04
            r1 = r16
            r0.A03(r5, r1)
            X.1bI r8 = r0.A0B
            r5 = 8
            r8.A04(r5)
            X.1bI r7 = r0.A0C
            r7.A04(r5)
            X.1bI r1 = r0.A0A
            r1.A04(r5)
            X.A18 r5 = r0.A00
            int r6 = r5.A00
            X.22H r5 = r0.A01
            if (r5 == 0) goto L_0x06ea
            boolean r5 = r5.A0w()
            if (r5 == 0) goto L_0x06ea
            X.00H r5 = r0.A0D
            java.lang.Object r5 = r5.get()
            X.4XM r5 = (X.AnonymousClass4XM) r5
            java.lang.String r6 = r5.A01(r6)
        L_0x0582:
            android.widget.TextView r5 = r0.A01
            r5.setText(r6)
            android.widget.CheckBox r11 = r0.A03
            r11.setEnabled(r13)
            r5 = r37
            boolean r13 = r5.A02
            r5 = 2131102490(0x7f060b1a, float:1.781742E38)
            if (r13 == 0) goto L_0x0598
            r5 = 2131102491(0x7f060b1b, float:1.7817421E38)
        L_0x0598:
            android.content.res.ColorStateList r5 = X.C19740yt.A03(r12, r5)
            X.C26173Ctq.A01(r5, r11)
            X.A18 r5 = r0.A00
            int r10 = r5.A00
            r6 = r18
            r5 = r39
            r0.A02(r10, r6, r13, r5)
            android.view.View r10 = r0.A02
            r6 = 21
            X.AkF r5 = new X.AkF
            r5.<init>(r0, r6)
            r10.post(r5)
            r10 = 0
            if (r9 == 0) goto L_0x05c8
            X.A18 r5 = r0.A00
            long r5 = r5.A01
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            boolean r6 = r9.contains(r5)
            r5 = 1
            if (r6 != 0) goto L_0x05c9
        L_0x05c8:
            r5 = 0
        L_0x05c9:
            r11.setChecked(r5)
            boolean r5 = r0.A0E
            if (r5 == 0) goto L_0x060f
            X.0vb r5 = r0.A08
            r21 = r5
            boolean r5 = r11.isChecked()
            r13 = 2131755010(0x7f100002, float:1.9140887E38)
            if (r5 == 0) goto L_0x05e0
            r13 = 2131755009(0x7f100001, float:1.9140885E38)
        L_0x05e0:
            X.A18 r15 = r0.A00
            int r12 = r15.A00
            long r5 = (long) r12
            r19 = r5
            java.lang.Object[] r14 = X.AnonymousClass3MW.A1b()
            java.lang.String r5 = r15.A04
            r14[r10] = r5
            r5 = 1
            X.C17880vN.A1T(r14, r12, r5)
            r12 = r21
            r5 = r19
            java.lang.String r5 = r12.A0K(r14, r13, r5)
            androidx.constraintlayout.widget.ConstraintLayout r12 = r0.A04
            r12.setContentDescription(r5)
            boolean r6 = r11.isChecked()
            r5 = 2131886260(0x7f1200b4, float:1.9407094E38)
            if (r6 == 0) goto L_0x060c
            r5 = 2131886259(0x7f1200b3, float:1.9407092E38)
        L_0x060c:
            X.AnonymousClass1Y5.A02(r12, r5)
        L_0x060f:
            X.A18 r5 = r0.A00
            if (r5 == 0) goto L_0x0627
            long r5 = r5.A01
            r11 = r17
            java.lang.Object r11 = X.C108965cb.A0n(r11, r5)
            android.util.Pair r11 = (android.util.Pair) r11
            X.22H r5 = r0.A01
            if (r5 == 0) goto L_0x062b
            boolean r5 = X.C120196Ct.A01(r0, r5)
            if (r5 == 0) goto L_0x062b
        L_0x0627:
            int r2 = r2 + 1
            goto L_0x04ae
        L_0x062b:
            if (r9 == 0) goto L_0x069c
            X.A18 r5 = r0.A00
            long r5 = r5.A01
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            boolean r5 = r9.contains(r5)
            if (r5 == 0) goto L_0x069c
            if (r11 == 0) goto L_0x06d3
            java.lang.Object r5 = r11.first
            if (r5 == 0) goto L_0x06d3
            r8.A04(r10)
            android.view.View r9 = X.AnonymousClass3MY.A0I(r1, r10)
            android.view.View r1 = r1.A02()
            android.content.Context r6 = r1.getContext()
            X.22H r1 = r0.A01
            if (r1 == 0) goto L_0x065d
            X.205 r1 = r1.A0v
            boolean r5 = r1.A02
            r1 = 2131232830(0x7f08083e, float:1.808178E38)
            if (r5 != 0) goto L_0x0660
        L_0x065d:
            r1 = 2131232850(0x7f080852, float:1.808182E38)
        L_0x0660:
            X.AnonymousClass3MY.A0v(r6, r9, r1)
            X.1pZ r6 = r0.A07
            X.11S r1 = r0.A05
            r1.A0I()
            X.1E8 r5 = r1.A0D
            android.view.View r1 = r8.A02()
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r6.A07(r1, r5)
            java.lang.Object r9 = r11.first
        L_0x0677:
            X.206 r9 = (X.AnonymousClass206) r9
            android.view.View r6 = X.AnonymousClass3MY.A0I(r7, r10)
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            X.205 r1 = r9.A0v
            X.1BI r5 = r1.A00
            boolean r1 = X.C22971Dz.A0e(r5)
            if (r1 == 0) goto L_0x068d
            X.1BI r5 = r9.A0H()
        L_0x068d:
            X.C17960vV.A07(r5)
            X.1pZ r1 = r0.A07
            X.1M9 r0 = r0.A06
            X.1E7 r0 = r0.A0H(r5)
            r1.A07(r6, r0)
            goto L_0x0627
        L_0x069c:
            if (r11 == 0) goto L_0x0627
            java.lang.Object r9 = r11.first
            if (r9 == 0) goto L_0x0627
            java.lang.Object r5 = r11.second
            if (r5 == 0) goto L_0x0677
            X.206 r9 = (X.AnonymousClass206) r9
            r8.A04(r10)
            r1.A04(r10)
            android.view.View r8 = r8.A02()
            android.widget.ImageView r8 = (android.widget.ImageView) r8
            X.205 r1 = r9.A0v
            X.1BI r6 = r1.A00
            boolean r1 = X.C22971Dz.A0e(r6)
            if (r1 == 0) goto L_0x06c2
            X.1BI r6 = r9.A0H()
        L_0x06c2:
            X.C17960vV.A07(r6)
            X.1pZ r5 = r0.A07
            X.1M9 r1 = r0.A06
            X.1E7 r1 = r1.A0H(r6)
            r5.A07(r8, r1)
            java.lang.Object r9 = r11.second
            goto L_0x0677
        L_0x06d3:
            r7.A04(r10)
            X.1pZ r5 = r0.A07
            X.11S r0 = r0.A05
            r0.A0I()
            X.1E8 r1 = r0.A0D
            android.view.View r0 = r7.A02()
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r5.A07(r0, r1)
            goto L_0x0627
        L_0x06ea:
            X.0vb r5 = r0.A08
            java.text.NumberFormat r10 = r5.A0L()
            long r5 = (long) r6
            java.lang.String r6 = r10.format(r5)
            goto L_0x0582
        L_0x06f7:
            java.lang.Object r0 = r1.get(r2)
            X.6Ct r0 = (X.C120196Ct) r0
            goto L_0x0526
        L_0x06ff:
            int r5 = r1.size()
        L_0x0703:
            int r5 = r5 + -1
            int r0 = r36.size()
            if (r5 < r0) goto L_0x071c
            java.lang.Object r0 = r1.get(r5)
            X.6px r0 = (X.C134066px) r0
            android.view.View r2 = r0.A00
            r0 = r38
            r0.removeView(r2)
            r1.remove(r5)
            goto L_0x0703
        L_0x071c:
            android.widget.LinearLayout r5 = r4.A06
            boolean r0 = r4.A0E
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            if (r0 != 0) goto L_0x078b
            android.content.res.Resources r9 = r4.getResources()
            r8 = 2131894673(0x7f122191, float:1.9424157E38)
            r0 = 3
            java.lang.Object[] r7 = new java.lang.Object[r0]
            android.content.Context r10 = r4.getContext()
            X.0ve r6 = r4.A0F
            X.1M9 r1 = r4.A0j
            X.1Me r0 = r4.A0l
            java.lang.String r1 = X.AnonymousClass6X9.A00(r10, r1, r0, r6, r3)
            r0 = 0
            r7[r0] = r1
            X.0vb r10 = r4.A0D
            X.11P r6 = r4.A0u
            long r0 = r3.A0I
            long r0 = r6.A09(r0)
            java.lang.String r1 = X.A8I.A00(r10, r0)
            r0 = 1
            r7[r0] = r1
            r1 = 2
            java.lang.String r0 = r3.A05
            java.lang.String r0 = X.AnonymousClass3MW.A0x(r9, r0, r7, r1, r8)
            r2.append(r0)
            java.util.ArrayList r7 = X.C17880vN.A10(r36)
            X.7Rk r0 = new X.7Rk
            r0.<init>((java.lang.Object) r4, (int) r1)
            java.util.Collections.sort(r7, r0)
            java.util.Iterator r6 = r7.iterator()
        L_0x076c:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0893
            java.lang.Object r3 = r6.next()
            X.A18 r3 = (X.A18) r3
            java.lang.String r0 = r3.A04
            r2.append(r0)
            java.lang.String r1 = " "
            r2.append(r1)
            int r0 = r3.A00
            r2.append(r0)
            r2.append(r1)
            goto L_0x076c
        L_0x078b:
            r0 = r37
            boolean r0 = r0.A02
            r10 = 2
            r9 = 0
            r8 = 1
            android.content.res.Resources r13 = r4.getResources()
            if (r0 == 0) goto L_0x07e8
            r12 = 2131894675(0x7f122193, float:1.9424161E38)
            java.lang.Object[] r11 = new java.lang.Object[r8]
            java.lang.String r0 = r3.A05
            r11[r9] = r0
        L_0x07a1:
            java.lang.String r0 = r13.getString(r12, r11)
            r2.append(r0)
            java.lang.String r0 = "\n"
            r2.append(r0)
            int r6 = r3.A02
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131894694(0x7f1221a6, float:1.94242E38)
            if (r6 != 0) goto L_0x07bb
            r0 = 2131894695(0x7f1221a7, float:1.9424202E38)
        L_0x07bb:
            java.lang.String r0 = r1.getString(r0)
            r2.append(r0)
            r0 = 10
            r2.append(r0)
            java.util.Iterator r11 = r36.iterator()
            r7 = 0
            r6 = 0
            r13 = 0
        L_0x07ce:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0802
            java.lang.Object r1 = r11.next()
            X.A18 r1 = (X.A18) r1
            int r0 = r1.A00
            if (r0 <= r6) goto L_0x07e3
            r6 = r0
            java.lang.String r7 = r1.A04
            r13 = 1
            goto L_0x07ce
        L_0x07e3:
            if (r0 != r6) goto L_0x07ce
            int r13 = r13 + 1
            goto L_0x07ce
        L_0x07e8:
            r12 = 2131894676(0x7f122194, float:1.9424163E38)
            java.lang.Object[] r11 = new java.lang.Object[r10]
            android.content.Context r7 = r4.getContext()
            X.0ve r6 = r4.A0F
            X.1M9 r1 = r4.A0j
            X.1Me r0 = r4.A0l
            java.lang.String r0 = X.AnonymousClass6X9.A00(r7, r1, r0, r6, r3)
            r11[r9] = r0
            java.lang.String r0 = r3.A05
            r11[r8] = r0
            goto L_0x07a1
        L_0x0802:
            X.0vb r12 = r4.A0D
            X.11P r11 = r4.A0u
            long r0 = r3.A0I
            long r0 = r11.A09(r0)
            java.lang.String r12 = X.A8I.A00(r12, r0)
            if (r6 > 0) goto L_0x08af
            android.content.res.Resources r6 = r4.getResources()
            r1 = 2131894674(0x7f122192, float:1.942416E38)
            java.lang.Object[] r0 = new java.lang.Object[r8]
            java.lang.String r0 = X.AnonymousClass3MW.A0x(r6, r12, r0, r9, r1)
        L_0x081f:
            r2.append(r0)
            boolean r0 = r3.A0w()
            if (r0 == 0) goto L_0x08aa
            X.1CJ r1 = r4.A0E
            r0 = r37
            X.1BI r0 = r0.A00
            X.1ci r8 = r1.A0A(r0)
            X.2Dk r8 = (X.C46162Dk) r8
            java.lang.String r7 = r2.toString()
            X.0vb r6 = r4.A0D
            X.00H r0 = r4.A2B
            X.1c4 r2 = X.C108955ca.A0W(r0)
            X.00H r0 = r4.A2E
            java.lang.Object r1 = r0.get()
            X.4XM r1 = (X.AnonymousClass4XM) r1
            if (r8 == 0) goto L_0x087e
            boolean r0 = r3.A0w()
            if (r0 == 0) goto L_0x087e
            boolean r0 = X.AnonymousClass4aS.A0A(r8, r2)
            if (r0 == 0) goto L_0x087e
            int r0 = r7.indexOf(r12)
            java.lang.String r6 = X.AnonymousClass4aS.A03(r6, r1, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r7)
            int r2 = r0 + -1
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = " "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = "."
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
            r3.insert(r2, r0)
            java.lang.String r7 = r3.toString()
        L_0x087e:
            r5.setContentDescription(r7)
            X.0zA r1 = r4.A00
            boolean r0 = r1.A07()
            if (r0 == 0) goto L_0x0020
            r1.A03()
            java.lang.String r0 = "maybeInitPollViewDetails"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x0893:
            r1 = 3
            X.7Rk r0 = new X.7Rk
            r0.<init>((java.lang.Object) r4, (int) r1)
            java.util.Collections.sort(r7, r0)
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131894677(0x7f122195, float:1.9424166E38)
            java.lang.String r0 = r1.getString(r0)
            r2.append(r0)
        L_0x08aa:
            java.lang.String r7 = r2.toString()
            goto L_0x087e
        L_0x08af:
            android.content.res.Resources r11 = r4.getResources()
            if (r13 <= r8) goto L_0x08c5
            r1 = 2131755339(0x7f10014b, float:1.9141554E38)
            java.lang.Object[] r0 = new java.lang.Object[r10]
            X.C17880vN.A1T(r0, r6, r9)
            r0[r8] = r12
        L_0x08bf:
            java.lang.String r0 = r11.getQuantityString(r1, r6, r0)
            goto L_0x081f
        L_0x08c5:
            r1 = 2131755340(0x7f10014c, float:1.9141557E38)
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r9] = r7
            X.C17880vN.A1T(r0, r6, r8)
            r0[r10] = r12
            goto L_0x08bf
        L_0x08d3:
            java.lang.Object r3 = r6.A02
            X.3TA r3 = (X.AnonymousClass3TA) r3
            java.lang.Object r5 = r6.A03
            X.7Fe r5 = (X.C143887Fe) r5
            boolean r2 = r6.A00
            boolean r0 = r3.A0D
            if (r0 == 0) goto L_0x1456
            if (r5 == 0) goto L_0x08ee
            java.lang.String r1 = r3.A0A
            java.lang.String r0 = r5.A0S
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 != 0) goto L_0x08ee
            return
        L_0x08ee:
            if (r2 == 0) goto L_0x0916
            if (r5 == 0) goto L_0x143d
            boolean r0 = r5.A0K()
            if (r0 == 0) goto L_0x143d
            X.1DT r3 = r3.A0M
            java.lang.Object r0 = r3.A06()
            X.4UK r0 = (X.AnonymousClass4UK) r0
            if (r0 == 0) goto L_0x0020
            X.4DX r0 = r0.A01
            int r1 = r0.value
            X.4DX r2 = X.AnonymousClass4DX.SMALL_THUMBNAIL_LOADED
            int r0 = r2.value
            if (r1 >= r0) goto L_0x0020
            r1 = 0
        L_0x090d:
            X.4UK r0 = new X.4UK
            r0.<init>(r5, r2, r1)
            r3.A0F(r0)
            return
        L_0x0916:
            if (r5 == 0) goto L_0x0020
            boolean r0 = r5.A0K()
            if (r0 == 0) goto L_0x0020
            X.1DT r3 = r3.A0M
            X.4DX r2 = X.AnonymousClass4DX.WEB_PAGE_LOADED
            java.lang.String r1 = r5.A0D()     // Catch:{ MalformedURLException -> 0x0927 }
            goto L_0x090d
        L_0x0927:
            java.lang.String r1 = r5.A0S
            goto L_0x090d
        L_0x092a:
            java.lang.Object r7 = r6.A02
            X.1py r7 = (X.C37691py) r7
            boolean r1 = r6.A00
            java.lang.Object r4 = r6.A03
            r5 = 0
            java.lang.ref.WeakReference r0 = r7.A06
            android.content.Context r0 = X.C108945cZ.A0F(r0)
            if (r0 == 0) goto L_0x0020
            if (r1 == 0) goto L_0x145c
            X.3Rj r3 = X.AnonymousClass4a6.A00(r0)
            r0 = 2131897336(0x7f122bf8, float:1.9429559E38)
            r3.A0E(r0)
            r0 = 2131897334(0x7f122bf6, float:1.9429555E38)
            r3.A0D(r0)
            r1 = 2131897333(0x7f122bf5, float:1.9429553E38)
            r0 = 0
            r3.A0X(r0, r1)
            r2 = 2131897335(0x7f122bf7, float:1.9429557E38)
            r1 = 16
            X.4bC r0 = new X.4bC
            r0.<init>((java.lang.Object) r7, (java.lang.Object) r4, (int) r1)
            r3.A0Z(r0, r2)
            r3.A0C()
            return
        L_0x0965:
            java.lang.Object r2 = r6.A02
            X.30Z r2 = (X.AnonymousClass30Z) r2
            java.lang.Object r4 = r6.A03
            X.1BI r4 = (X.AnonymousClass1BI) r4
            boolean r3 = r6.A00
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "conversations/group/toggleGroupProgressbar/:"
            X.C17900vP.A0Y(r4, r0, r1)
            java.lang.Object r2 = r2.A01
            com.whatsapp.conversationslist.ConversationsFragment r2 = (com.whatsapp.conversationslist.ConversationsFragment) r2
            android.view.View r1 = com.whatsapp.conversationslist.ConversationsFragment.A03(r2, r4)
            if (r1 == 0) goto L_0x0991
            r0 = 2131434205(0x7f0b1add, float:1.8490217E38)
            X.1bI r1 = X.C72453Mb.A0s(r1, r0)
            int r0 = X.C72453Mb.A07(r3)
            r1.A04(r0)
            return
        L_0x0991:
            X.1qw r0 = r2.A1m
            if (r0 == 0) goto L_0x0020
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "conversations/refresh: no view for "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = " "
            r1.append(r0)
            X.1qw r0 = r2.A1m
            int r0 = r0.BRo()
            r1.append(r0)
            java.lang.String r0 = "-"
            r1.append(r0)
            X.1qw r0 = r2.A1m
            int r0 = r0.BTt()
            r1.append(r0)
            java.lang.String r0 = " ("
            r1.append(r0)
            X.1qw r0 = r2.A1m
            int r0 = r0.getCount()
            r1.append(r0)
            java.lang.String r0 = ")"
            X.C17890vO.A1B(r1, r0)
            return
        L_0x09d1:
            java.lang.Object r1 = r6.A02
            X.1TH r1 = (X.AnonymousClass1TH) r1
            java.lang.Object r3 = r6.A03
            boolean r0 = r6.A00
            X.1TJ r2 = r1.A00
            java.lang.Object r1 = r2.A00()
            java.util.Map r1 = (java.util.Map) r1
            if (r1 == 0) goto L_0x0020
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.put(r3, r0)
            r2.A04(r1)
            return
        L_0x09ee:
            r0 = 0
            r2.A2E(r0)
            return
        L_0x09f3:
            java.lang.Object r2 = r6.A03
            X.CiW r2 = (X.C25591CiW) r2
            java.lang.Object r1 = r6.A02
            android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1
            X.CIn r0 = r2.A04
            X.C25591CiW.A00(r1, r0, r2)
            return
        L_0x0a01:
            java.lang.Object r2 = r6.A02
            android.content.Context r2 = (android.content.Context) r2
            boolean r1 = r6.A00
            java.lang.Object r0 = r6.A03
            com.google.android.gms.tasks.TaskCompletionSource r0 = (com.google.android.gms.tasks.TaskCompletionSource) r0
            X.C62752rv.A01(r2, r0, r1)
            return
        L_0x0a0f:
            java.lang.Object r5 = r6.A02
            X.1iW r5 = (X.C33251iW) r5
            java.lang.Object r0 = r6.A03
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r4 = r6.A00
            java.util.ArrayList r6 = X.C33251iW.A05(r5, r0)
            java.util.Iterator r12 = r6.iterator()
        L_0x0a21:
            boolean r0 = r12.hasNext()
            r15 = 0
            if (r0 == 0) goto L_0x0c50
            X.206 r14 = X.C17880vN.A0Y(r12)
            r0 = 1
            r14.A18 = r0
            boolean r0 = X.AnonymousClass25A.A0p(r14)
            if (r0 != 0) goto L_0x0a21
            boolean r2 = r14.A0w()
            r0 = 16777216(0x1000000, double:8.289046E-317)
            boolean r0 = r14.A11(r0)
            if (r0 == 0) goto L_0x0a50
            if (r2 != 0) goto L_0x0a52
            X.36k r1 = X.C60472o5.A00(r14)
            if (r1 != 0) goto L_0x0a87
            java.lang.String r0 = "UserActions/userActionRevokeMessages/commentInfo is null for a comment message"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x0a50:
            if (r2 == 0) goto L_0x0ac0
        L_0x0a52:
            X.11P r0 = r5.A0K
            boolean r0 = X.AnonymousClass4aS.A07(r0, r14)
            if (r0 != 0) goto L_0x0a60
            java.lang.String r0 = "UserActions/userActionRevokeMessages/outside of edit window"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x0a21
        L_0x0a60:
            long r0 = r14.A0I
            X.205 r2 = r14.A0v
            X.23Q r3 = new X.23Q
            r3.<init>(r14, r2, r0)
            X.00H r0 = r5.A1S
            java.lang.Object r2 = r0.get()
            X.2rF r2 = (X.C62342rF) r2
            X.10I r1 = r2.A02
            r19 = 34
            X.7RT r0 = new X.7RT
            r15 = r0
            r16 = r2
            r17 = r3
            r18 = r14
            r20 = r4
            r15.<init>(r16, r17, r18, r19, r20)
            r1.CGF(r0)
            goto L_0x0a21
        L_0x0a87:
            X.36k r0 = X.C60472o5.A00(r14)
            X.A51 r0 = r0.A01()
            if (r0 == 0) goto L_0x0a95
            X.1BI r0 = r0.A00
            if (r0 != 0) goto L_0x0ac0
        L_0x0a95:
            java.lang.Long r1 = r1.A02()
            if (r1 == 0) goto L_0x0ac0
            X.00H r0 = r5.A1L
            X.1W6 r2 = X.C17880vN.A0c(r0)
            long r0 = r1.longValue()
            X.1W2 r2 = r2.A01
            X.206 r2 = r2.A03(r0)
            if (r2 == 0) goto L_0x0ac0
            X.205 r7 = r2.A0v
            com.whatsapp.jid.UserJid r2 = r2.A0I()
            X.A51 r3 = new X.A51
            r3.<init>(r2, r7)
            X.2Lz r2 = new X.2Lz
            r2.<init>(r3, r0)
            X.C60472o5.A01(r2, r14)
        L_0x0ac0:
            X.205 r10 = r14.A0v
            boolean r0 = r10.A02
            if (r0 == 0) goto L_0x0b96
            boolean r0 = r14 instanceof X.AnonymousClass21V
            if (r0 == 0) goto L_0x0ad0
            X.1hs r1 = r5.A0k
            r0 = 0
            r1.A07(r14, r0)
        L_0x0ad0:
            X.1BI r2 = r10.A00
            boolean r0 = X.C22971Dz.A0a(r2)
            if (r0 == 0) goto L_0x0af0
            int r1 = r14.A0D()
            r0 = 2
            boolean r0 = X.C446824j.A03(r1, r0)
            if (r0 == 0) goto L_0x0b5e
            X.1hg r13 = r5.A16
            java.lang.String r18 = "user_deleted_unsent_message"
            r19 = 1
            r17 = r15
            r16 = r15
            r13.A0D(r14, r15, r16, r17, r18, r19)
        L_0x0af0:
            boolean r0 = r14 instanceof X.AnonymousClass23S
            if (r0 == 0) goto L_0x0b1c
            r9 = r14
            X.23S r9 = (X.AnonymousClass23S) r9
            X.11P r0 = r5.A0K
            long r10 = X.AnonymousClass11P.A01(r0)
            long r0 = r9.A01
            r7 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r7
            int r3 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r3 >= 0) goto L_0x0b1c
            boolean r0 = r9.A07
            if (r0 != 0) goto L_0x0b1c
            X.12M r3 = r5.A0f
            X.1EC r1 = r9.A02
            X.C17960vV.A07(r1)
            X.205 r0 = r9.A0v
            X.1BI r0 = r0.A00
            java.util.List r0 = java.util.Collections.singletonList(r0)
            r3.A08(r15, r1, r0)
        L_0x0b1c:
            X.1hD r9 = r5.A11
            X.11P r8 = r5.A0K
            long r0 = X.AnonymousClass11P.A01(r8)
            X.23Q r0 = r9.A00(r14, r0)
            r5.A0e(r14, r0)
            X.1hG r11 = r5.A0V
            r11.A03(r0, r4)
            boolean r0 = r14.A0l
            if (r0 == 0) goto L_0x0a21
            java.util.List r0 = r14.A0T()
            if (r0 == 0) goto L_0x0a21
            java.util.Iterator r10 = r0.iterator()
        L_0x0b3e:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0a21
            X.1BI r7 = X.C17880vN.A0Q(r10)
            long r0 = X.AnonymousClass11P.A01(r8)
            X.1PP r3 = r9.A01
            X.205 r7 = X.C17880vN.A0Z(r7, r3)
            X.23Q r3 = new X.23Q
            r3.<init>(r14, r7, r0)
            r3.A0d(r2)
            r11.A03(r3, r4)
            goto L_0x0b3e
        L_0x0b5e:
            X.00H r0 = r5.A1Q
            int r8 = X.C62242r5.A00(r14, r0)
            X.1hg r7 = r5.A16
            X.62m r3 = new X.62m
            r3.<init>()
            long r0 = X.C108995ce.A0A(r7)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3.A02 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            r3.A00 = r0
            X.11P r0 = r7.A08
            long r0 = X.AnonymousClass3MZ.A05(r0, r14)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3.A01 = r0
            X.18K r0 = r7.A0C
            r0.CC7(r3)
            X.2tc r1 = X.C108965cb.A0Y(r7)
            r0 = 4
            r1.A04(r14, r15, r15, r0)
            goto L_0x0af0
        L_0x0b96:
            X.1BI r0 = r14.A0H()
            boolean r0 = X.C42701yb.A01(r0)
            if (r0 == 0) goto L_0x0bd5
            X.00H r0 = r5.A1F
            r0.get()
            X.206 r1 = r14.A0K()
            X.1BI r0 = r14.A0H()
            boolean r0 = X.C42701yb.A01(r0)
            if (r0 == 0) goto L_0x0bd5
            if (r1 == 0) goto L_0x0bd5
            X.205 r0 = r1.A0v
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x0bd5
            X.1hD r2 = r5.A11
            X.11P r0 = r5.A0K
            long r0 = X.AnonymousClass11P.A01(r0)
            X.23Q r7 = r2.A00(r14, r0)
            X.1BI r0 = r14.A0H()
            r7.A0d(r0)
        L_0x0bce:
            X.1hG r0 = r5.A0V
            r0.A03(r7, r4)
            goto L_0x0a21
        L_0x0bd5:
            X.1hD r1 = r5.A11
            X.11P r0 = r5.A0K
            long r2 = X.AnonymousClass11P.A01(r0)
            X.1PP r1 = r1.A01
            X.1BI r0 = r10.A00
            r8 = 0
            X.205 r9 = r1.A01(r0, r8)
            long r0 = r14.A0I
            X.23O r7 = new X.23O
            r7.<init>(r9, r0)
            r7.A00 = r2
            java.lang.String r0 = r10.A01
            r7.A01 = r0
            X.1BI r0 = r14.A0H()
            r7.A0K = r0
            java.util.List r0 = r14.A0T()
            r7.A0i = r0
            java.lang.Long r0 = r14.A0U
            r7.A0U = r0
            r7.A07 = r8
            X.1BI r0 = r14.A0H()
            boolean r0 = X.C42701yb.A01(r0)
            if (r0 == 0) goto L_0x0c4c
            X.1hM r2 = r5.A0A
            long r0 = r14.A0x
            X.2mQ r0 = r2.A00(r0)
            X.36h r0 = r0.A03
            if (r0 == 0) goto L_0x0c42
            com.whatsapp.jid.UserJid r1 = r0.A00
            if (r1 == 0) goto L_0x0c42
            X.1Dv r0 = X.AnonymousClass1BI.A00
            X.1BI r1 = X.C22931Dv.A00(r1)
            X.3Bi r0 = new X.3Bi
            r0.<init>(r1, r15)
            java.util.List r0 = java.util.Collections.singletonList(r0)
            r7.A0l(r0)
        L_0x0c31:
            X.11S r1 = r5.A04
            com.whatsapp.jid.PhoneUserJid r0 = X.AnonymousClass11S.A00(r1)
            r7.A00 = r0
            com.whatsapp.jid.PhoneUserJid r0 = X.AnonymousClass11S.A00(r1)
            if (r0 == 0) goto L_0x0bce
            r7.A00 = r0
            goto L_0x0bce
        L_0x0c42:
            X.190 r2 = r5.A01
            java.lang.String r1 = "bot invoker jid not found"
            java.lang.String r0 = "AdminRevokeBotResponse"
            r2.A0G(r0, r1, r8)
            goto L_0x0c31
        L_0x0c4c:
            r5.A0e(r14, r7)
            goto L_0x0c31
        L_0x0c50:
            X.00H r0 = r5.A1D
            java.lang.Object r1 = r0.get()
            X.A5M r1 = (X.A5M) r1
            r0 = 4
            r1.A05(r15, r6, r0)
            return
        L_0x0c5d:
            java.lang.Object r2 = r6.A02
            java.lang.Object r1 = r6.A03
            X.86X r1 = (X.AnonymousClass86X) r1
            boolean r0 = r6.A00
            X.E8A r3 = r1.BM3()
            if (r0 == 0) goto L_0x0c85
            java.lang.String r1 = "accounts_not_linked_error"
        L_0x0c6d:
            X.Boh r0 = X.ALS.A06(r2)
            X.Cph r2 = new X.Cph
            r2.<init>(r0)
            X.A4p r0 = X.C108985cd.A0J(r1)
            java.util.List r1 = r0.A00
            X.9zJ r0 = new X.9zJ
            r0.<init>(r1)
            r2.A02(r0, r3)
            return
        L_0x0c85:
            java.lang.String r1 = "generic_error"
            goto L_0x0c6d
        L_0x0c88:
            java.lang.Object r2 = r6.A03
            X.A45 r2 = (X.A45) r2
            boolean r1 = r6.A00
            r0 = 1
            X.C18070vi.A0d(r2, r0)
            r0 = 5
            X.C1404371k.A00(r2, r0)
            X.Boh r4 = r2.A00
            X.E8A r3 = r2.A01
            java.lang.String r2 = "success"
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            goto L_0x0cb1
        L_0x0ca1:
            java.lang.Object r1 = r6.A02
            X.A45 r1 = (X.A45) r1
            boolean r0 = r6.A00
            X.Boh r4 = r1.A00
            X.E8A r3 = r1.A01
            java.lang.String r2 = "success"
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L_0x0cb1:
            java.util.Map r1 = X.C108975cc.A0h(r2, r0)
            java.lang.String r0 = "result"
            java.util.Map r0 = X.C108975cc.A0h(r0, r1)
            java.util.List r0 = X.C18070vi.A0M(r0)
            X.AnonymousClass8BT.A19(X.ALS.A06(r4), r3, r0)
            return
        L_0x0cc3:
            boolean r2 = r6.A00
            java.lang.Object r1 = r6.A02
            X.0vk r1 = (X.C18090vk) r1
            java.lang.Object r0 = r6.A03
            X.1Pj r0 = (X.C25721Pj) r0
            X.C18070vi.A0j(r1, r0)
            if (r2 == 0) goto L_0x0cd6
            r1.invoke()
            return
        L_0x0cd6:
            X.1KB r0 = r0.A01
            r0.A04()
            return
        L_0x0cdc:
            java.lang.Object r2 = r6.A02
            X.8CR r2 = (X.AnonymousClass8CR) r2
            java.lang.Object r1 = r6.A03
            java.util.concurrent.ScheduledFuture r1 = (java.util.concurrent.ScheduledFuture) r1
            boolean r0 = r6.A00
            r2.A02(r1, r0)
            return
        L_0x0cea:
            java.lang.Object r2 = r6.A02
            X.Adx r2 = (X.C21067Adx) r2
            java.lang.Object r1 = r6.A03
            com.whatsapp.voipcalling.CallInfo r1 = (com.whatsapp.voipcalling.CallInfo) r1
            boolean r0 = r6.A00
            r2.A0B(r1, r0)
            return
        L_0x0cf8:
            java.lang.Object r0 = r6.A02
            X.Af8 r0 = (X.C21137Af8) r0
            java.lang.Object r4 = r6.A03
            boolean r3 = r6.A00
            X.8yP r2 = r0.A00
            r1 = 0
            X.35W r0 = new X.35W
            r0.<init>((int) r1, (java.lang.Object) r4, (boolean) r3)
            r2.notifyAllObservers(r0)
            return
        L_0x0d0c:
            java.lang.Object r3 = r6.A02
            X.5wX r3 = (X.C116185wX) r3
            boolean r2 = r6.A00
            java.lang.Object r1 = r6.A03
            X.70A r1 = (X.AnonymousClass70A) r1
            if (r2 == 0) goto L_0x0d20
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r0 = r3.A04
            if (r0 == 0) goto L_0x0d20
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel.A0D(r0)
            return
        L_0x0d20:
            if (r1 == 0) goto L_0x0d2a
            if (r2 != 0) goto L_0x0d2a
            android.graphics.Bitmap r0 = r1.A08
        L_0x0d26:
            X.C116185wX.A01(r0, r3)
            return
        L_0x0d2a:
            r0 = 0
            goto L_0x0d26
        L_0x0d2c:
            java.lang.Object r13 = r6.A02
            com.whatsapp.calling.participantlist.viewmodel.ParticipantsListViewModel r13 = (com.whatsapp.calling.participantlist.viewmodel.ParticipantsListViewModel) r13
            java.lang.Object r12 = r6.A03
            X.4Sa r12 = (X.C86534Sa) r12
            boolean r0 = r6.A00
            r21 = r0
            com.whatsapp.voipcalling.CallState r0 = r12.A0B
            r22 = r0
            boolean r0 = r12.A0I
            r20 = r0
            X.10w r4 = r12.A06
            int r11 = r4.size()
            X.1TB r1 = r13.A0C
            java.lang.String r0 = r12.A0C
            java.lang.String r0 = X.C40811vJ.A0A(r0)
            X.9Bw r18 = r1.A06(r0)
            boolean r3 = r12.A0O
            r1 = 1
            if (r3 == 0) goto L_0x0d6f
            X.0ve r5 = r13.A0E
            r2 = 7635(0x1dd3, float:1.0699E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r5, r2)
            if (r0 == 0) goto L_0x0de1
            X.1MW r2 = r13.A0D
            X.1EC r0 = r12.A08
            X.2tp r0 = r2.A0B(r0)
            int r11 = r0.A06()
        L_0x0d6f:
            X.0ve r7 = r13.A0E
            r0 = 4716(0x126c, float:6.609E-42)
            X.0vf r6 = X.C18040vf.A02
            int r0 = X.C18020vd.A00(r6, r7, r0)
            boolean r10 = r12.A0G
            if (r10 == 0) goto L_0x0d81
            r19 = 1
            if (r11 > r0) goto L_0x0d83
        L_0x0d81:
            r19 = 0
        L_0x0d83:
            if (r18 != 0) goto L_0x0ddc
            r9 = 0
        L_0x0d86:
            java.util.ArrayList r8 = X.AnonymousClass000.A13()
            java.util.Collection r0 = r4.values()
            java.util.Iterator r17 = r0.iterator()
        L_0x0d92:
            r16 = 0
        L_0x0d94:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x0dee
            java.lang.Object r15 = r17.next()
            X.6qE r15 = (X.C134216qE) r15
            boolean r0 = r15.A0M
            if (r0 != 0) goto L_0x0d94
            com.whatsapp.jid.UserJid r14 = r15.A0A
            int r5 = r15.A04
            if (r5 == r1) goto L_0x0db4
            if (r19 == 0) goto L_0x0db4
            X.1M9 r0 = r13.A0A
            boolean r0 = r0.A0z(r14)
            if (r0 == 0) goto L_0x0dcd
        L_0x0db4:
            X.C18070vi.A0X(r14)
            r0 = 3
            if (r5 == r0) goto L_0x0dc2
            r0 = 2
            if (r5 == r0) goto L_0x0dc2
            r0 = 11
            r2 = 0
            if (r5 != r0) goto L_0x0dc3
        L_0x0dc2:
            r2 = 1
        L_0x0dc3:
            boolean r0 = r15.A0G
            X.6sY r15 = new X.6sY
            r15.<init>(r14, r5, r2, r0)
            r8.add(r15)
        L_0x0dcd:
            if (r16 != 0) goto L_0x0dd9
            r0 = 3
            if (r5 == r0) goto L_0x0dd9
            r0 = 2
            if (r5 == r0) goto L_0x0dd9
            r0 = 11
            if (r5 != r0) goto L_0x0d92
        L_0x0dd9:
            r16 = 1
            goto L_0x0d94
        L_0x0ddc:
            boolean r9 = r18.A0X()
            goto L_0x0d86
        L_0x0de1:
            if (r18 == 0) goto L_0x0d6f
            java.util.ArrayList r0 = r18.A0B()
            int r0 = r0.size()
            int r11 = r0 + 1
            goto L_0x0d6f
        L_0x0dee:
            X.1EC r2 = r12.A08
            if (r2 == 0) goto L_0x0e6d
            if (r10 == 0) goto L_0x0e6d
            r0 = 7635(0x1dd3, float:1.0699E-41)
            boolean r0 = X.C18020vd.A05(r6, r7, r0)
            if (r0 == 0) goto L_0x0e6d
            X.1MW r0 = r13.A0D
            X.2tp r6 = r0.A0B(r2)
            int r5 = r6.A00
            r0 = 2
            boolean r0 = X.AnonymousClass000.A1T(r0, r5)
            if (r0 == 0) goto L_0x0e68
            java.util.Map r0 = r6.A08
            java.util.Collection r0 = r0.values()
            X.10f r0 = X.C199410f.copyOf((java.util.Collection) r0)
        L_0x0e15:
            java.util.Iterator r14 = r0.iterator()
        L_0x0e19:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x0ea3
            java.lang.Object r5 = r14.next()
            X.2sr r5 = (X.C63312sr) r5
            X.11S r0 = r13.A05
            com.whatsapp.jid.UserJid r6 = r5.A04
            boolean r0 = X.C40811vJ.A0K(r0, r6)
            if (r0 != 0) goto L_0x0e19
            if (r19 == 0) goto L_0x0e39
            X.1M9 r0 = r13.A0A
            boolean r0 = r0.A0z(r6)
            if (r0 == 0) goto L_0x0e19
        L_0x0e39:
            X.00H r0 = r13.A0L
            java.lang.Object r5 = r0.get()
            X.2hy r5 = (X.C56752hy) r5
            com.whatsapp.jid.UserJid r0 = r12.A0A
            boolean r0 = X.C22971Dz.A0T(r0)
            com.whatsapp.jid.UserJid r7 = r5.A00(r6, r0)
            if (r7 != 0) goto L_0x0e56
            X.190 r6 = r13.A04
            java.lang.String r5 = "ParticipantListViewModel/updateParticipants phoneNumber_lid_mapping_missing"
            r0 = 0
            r6.A0G(r5, r0, r1)
            goto L_0x0e19
        L_0x0e56:
            boolean r0 = r4.containsKey(r7)
            if (r0 != 0) goto L_0x0e19
            r6 = 11
            r5 = 0
            X.6sY r0 = new X.6sY
            r0.<init>(r7, r6, r5, r5)
            r8.add(r0)
            goto L_0x0e19
        L_0x0e68:
            X.10f r0 = r6.A0B()
            goto L_0x0e15
        L_0x0e6d:
            if (r3 == 0) goto L_0x0ea3
            if (r18 == 0) goto L_0x0ea3
            java.util.ArrayList r0 = r18.A0B()
            java.util.Iterator r14 = r0.iterator()
        L_0x0e79:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x0ea3
            java.lang.Object r0 = r14.next()
            X.9Bv r0 = (X.C178109Bv) r0
            com.whatsapp.jid.UserJid r7 = r0.A00
            boolean r0 = r4.containsKey(r7)
            if (r0 != 0) goto L_0x0e79
            if (r19 == 0) goto L_0x0e97
            X.1M9 r0 = r13.A0A
            boolean r0 = r0.A0z(r7)
            if (r0 == 0) goto L_0x0e79
        L_0x0e97:
            r6 = 11
            r5 = 0
            X.6sY r0 = new X.6sY
            r0.<init>(r7, r6, r5, r5)
            r8.add(r0)
            goto L_0x0e79
        L_0x0ea3:
            r7 = 0
            X.7Rk r0 = new X.7Rk
            r0.<init>((java.lang.Object) r13, (int) r7)
            java.util.Collections.sort(r8, r0)
            if (r2 != 0) goto L_0x0eec
            if (r21 == 0) goto L_0x0ebc
            boolean r0 = com.whatsapp.voipcalling.Voip.A0B(r22)
            if (r0 != 0) goto L_0x0eec
            com.whatsapp.voipcalling.CallState r5 = com.whatsapp.voipcalling.CallState.ACCEPT_SENT
            r0 = r22
            if (r0 == r5) goto L_0x0eec
        L_0x0ebc:
            r18 = 1
        L_0x0ebe:
            X.0vp r0 = r13.A0O
            r29 = r0
            boolean r14 = X.C72463Mc.A1Z(r29)
            if (r14 == 0) goto L_0x0eca
            int r11 = r11 + -1
        L_0x0eca:
            X.10e r0 = r4.values()
            java.util.Iterator r5 = r0.iterator()
            r6 = 0
        L_0x0ed3:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0eef
            java.lang.Object r4 = r5.next()
            X.6qE r4 = (X.C134216qE) r4
            int r0 = r4.A04
            if (r0 != r1) goto L_0x0ed3
            if (r14 == 0) goto L_0x0ee9
            boolean r0 = r4.A0M
            if (r0 != 0) goto L_0x0ed3
        L_0x0ee9:
            int r6 = r6 + 1
            goto L_0x0ed3
        L_0x0eec:
            r18 = 0
            goto L_0x0ebe
        L_0x0eef:
            if (r21 != 0) goto L_0x1018
            r14 = 1
            if (r6 <= r1) goto L_0x1018
            boolean r0 = r12.A0L
            if (r0 == 0) goto L_0x1018
            boolean r0 = X.C72463Mc.A1Z(r29)
            if (r0 != 0) goto L_0x1018
        L_0x0efe:
            if (r10 != 0) goto L_0x0f02
            if (r3 == 0) goto L_0x0f16
        L_0x0f02:
            X.1MW r3 = r13.A0D
            int r5 = r3.A09(r2)
            int r0 = r8.size()
            int r5 = r5 - r0
            int r5 = r5 - r1
            if (r5 >= 0) goto L_0x0f17
            r3.A09(r2)
            r8.size()
        L_0x0f16:
            r5 = 0
        L_0x0f17:
            if (r20 == 0) goto L_0x0f1d
            r17 = 1
            if (r16 != 0) goto L_0x0f1f
        L_0x0f1d:
            r17 = 0
        L_0x0f1f:
            java.util.ArrayList r4 = X.AnonymousClass000.A13()
            java.util.HashSet r16 = X.C17880vN.A12()
            r3 = 1
            r2 = 0
            if (r14 == 0) goto L_0x0fd8
            X.1vp r0 = r13.A0F
            boolean r0 = X.C72463Mc.A1O(r0)
            r14 = 2131755211(0x7f1000cb, float:1.9141295E38)
            if (r0 == 0) goto L_0x0f39
            r14 = 2131755476(0x7f1001d4, float:1.9141832E38)
        L_0x0f39:
            java.lang.Object[] r0 = new java.lang.Object[r1]
            X.C17880vN.A1T(r0, r6, r7)
            X.6IS r1 = X.C1402670q.A01(r0, r14, r6)
            X.3nW r0 = new X.3nW
            r0.<init>(r1)
            r4.add(r0)
        L_0x0f4a:
            if (r17 == 0) goto L_0x0f55
            r1 = 2
            X.4Sg r0 = new X.4Sg
            r0.<init>(r1)
            r4.add(r0)
        L_0x0f55:
            java.lang.String r0 = r12.A0D
            if (r0 == 0) goto L_0x0f68
            boolean r0 = X.AnonymousClass72U.A00(r22)
            if (r0 != 0) goto L_0x0f68
            r1 = 5
            X.4Sg r0 = new X.4Sg
            r0.<init>(r1)
            r4.add(r0)
        L_0x0f68:
            if (r18 == 0) goto L_0x0f72
            X.4Sg r0 = new X.4Sg
            r0.<init>(r7)
            r4.add(r0)
        L_0x0f72:
            com.whatsapp.voipcalling.CallState r1 = com.whatsapp.voipcalling.CallState.PRECALLING
            r0 = r22
            if (r0 == r1) goto L_0x0fd6
            X.6qE r0 = r12.A07
            if (r0 == 0) goto L_0x0fd6
            int r1 = r0.A04
            if (r1 == r3) goto L_0x0f83
            r0 = 7
            if (r1 != r0) goto L_0x0fd6
        L_0x0f83:
            r1 = 1
        L_0x0f84:
            if (r9 == 0) goto L_0x0fb1
            X.8yP r15 = r13.A06
            X.4Sa r0 = r15.A07()
            X.1EC r14 = r0.A08
            X.1M9 r2 = r13.A0A
            X.4Sa r0 = r15.A07()
            X.1EC r0 = r0.A08
            X.1E7 r21 = r2.A0H(r0)
            int r0 = r12.A04
            r23 = 7
            X.3nV r2 = new X.3nV
            r28 = r7
            r20 = r2
            r22 = r14
            r24 = r0
            r25 = r7
            r26 = r1
            r27 = r3
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28)
        L_0x0fb1:
            r4.size()
            r14 = 0
        L_0x0fb5:
            int r0 = r8.size()
            if (r14 >= r0) goto L_0x101b
            java.lang.Object r15 = r8.get(r14)
            X.6sY r15 = (X.C135656sY) r15
            int r0 = r15.A00
            if (r0 != r3) goto L_0x101b
            X.3nV r0 = com.whatsapp.calling.participantlist.viewmodel.ParticipantsListViewModel.A03(r15, r13, r1, r9)
            r4.add(r0)
            com.whatsapp.jid.UserJid r15 = r15.A01
            r0 = r16
            r0.add(r15)
            int r14 = r14 + 1
            goto L_0x0fb5
        L_0x0fd6:
            r1 = 0
            goto L_0x0f84
        L_0x0fd8:
            boolean r0 = X.C72463Mc.A1Z(r29)
            if (r0 == 0) goto L_0x0f4a
            X.4PO r0 = X.AnonymousClass4XN.A04
            boolean r0 = r0.A00(r12)
            if (r0 == 0) goto L_0x0ffb
            X.4XN r0 = r13.A08
            X.4ix r1 = r0.A00(r12)
            X.3nZ r0 = new X.3nZ
            r0.<init>(r1)
            r4.add(r0)
            X.1DT r0 = r13.A03
            r0.A0E(r2)
            goto L_0x0f4a
        L_0x0ffb:
            X.1DT r15 = r13.A03
            if (r6 != 0) goto L_0x100b
            r0 = 2131898234(0x7f122f7a, float:1.943138E38)
            X.6IR r0 = X.AnonymousClass3MX.A0t(r0)
        L_0x1006:
            r15.A0E(r0)
            goto L_0x0f4a
        L_0x100b:
            r14 = 2131755211(0x7f1000cb, float:1.9141295E38)
            java.lang.Object[] r0 = new java.lang.Object[r1]
            X.C17880vN.A1T(r0, r6, r7)
            X.6IS r0 = X.C1402670q.A01(r0, r14, r6)
            goto L_0x1006
        L_0x1018:
            r14 = 0
            goto L_0x0efe
        L_0x101b:
            boolean r15 = X.C72463Mc.A1Z(r29)
            if (r10 != 0) goto L_0x1023
            if (r15 == 0) goto L_0x104c
        L_0x1023:
            if (r6 >= r11) goto L_0x104c
            r11 = 2131893534(0x7f121d1e, float:1.9421847E38)
            if (r15 == 0) goto L_0x102d
            r11 = 2131887815(0x7f1206c7, float:1.9410248E38)
        L_0x102d:
            if (r9 == 0) goto L_0x1032
            r11 = 2131898038(0x7f122eb6, float:1.9430982E38)
        L_0x1032:
            boolean r0 = r12.A0F
            if (r15 == 0) goto L_0x103e
            if (r0 == 0) goto L_0x1043
            X.1vp r0 = r13.A0F
            boolean r0 = X.C72463Mc.A1O(r0)
        L_0x103e:
            if (r0 == 0) goto L_0x1043
            r10 = 1
            if (r19 == 0) goto L_0x1044
        L_0x1043:
            r10 = 0
        L_0x1044:
            X.3nY r0 = new X.3nY
            r0.<init>(r10, r11)
            r4.add(r0)
        L_0x104c:
            if (r9 == 0) goto L_0x1058
            int r0 = r8.size()
            int r0 = r0 + r5
            if (r6 >= r0) goto L_0x1058
            r4.add(r2)
        L_0x1058:
            r4.size()
        L_0x105b:
            int r0 = r8.size()
            if (r14 >= r0) goto L_0x10c9
            java.lang.Object r10 = r8.get(r14)
            X.6sY r10 = (X.C135656sY) r10
            X.3nV r0 = com.whatsapp.calling.participantlist.viewmodel.ParticipantsListViewModel.A03(r10, r13, r1, r9)
            r4.add(r0)
            java.util.Set r2 = r13.A0N
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x10bf
            com.whatsapp.jid.UserJid r6 = r10.A01
            boolean r0 = r2.contains(r6)
            if (r0 != 0) goto L_0x10bf
            int r0 = r10.A00
            if (r0 == r3) goto L_0x10bf
            X.6lg r0 = r13.A00
            if (r0 == 0) goto L_0x10bf
            com.whatsapp.voipcalling.VoipActivityV2 r12 = r0.A00
            com.whatsapp.contact.picker.ContactPickerFragment r0 = r12.A16
            if (r0 != 0) goto L_0x10bf
            boolean r0 = r10.A02
            if (r0 == 0) goto L_0x1098
            X.11C r0 = r12.A08
            boolean r0 = X.C108965cb.A1X(r0)
            if (r0 == 0) goto L_0x10bf
        L_0x1098:
            boolean r0 = X.C108995ce.A1a(r12)
            if (r0 != 0) goto L_0x10a8
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r0 = r12.A1b
            if (r0 == 0) goto L_0x10bf
            boolean r0 = r0.A2G()
            if (r0 != 0) goto L_0x10bf
        L_0x10a8:
            com.whatsapp.voipcalling.CallInfo r11 = com.whatsapp.voipcalling.VoipActivityV2.A0Q(r12)
            if (r11 == 0) goto L_0x10bf
            com.whatsapp.voipcalling.CallState r2 = r11.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r2 != r0) goto L_0x10bf
            boolean r0 = r11.isGroupCall
            if (r0 == 0) goto L_0x10bf
            X.8Au r2 = r12.A0p
            boolean r0 = r11.videoEnabled
            r2.CN1(r6, r0)
        L_0x10bf:
            com.whatsapp.jid.UserJid r2 = r10.A01
            r0 = r16
            r0.add(r2)
            int r14 = r14 + 1
            goto L_0x105b
        L_0x10c9:
            if (r5 <= 0) goto L_0x10df
            r1 = 2131755312(0x7f100130, float:1.91415E38)
            java.lang.Object[] r0 = new java.lang.Object[r3]
            X.C17880vN.A1T(r0, r5, r7)
            X.6IS r1 = X.C1402670q.A01(r0, r1, r5)
            X.3nX r0 = new X.3nX
            r0.<init>(r1)
            r4.add(r0)
        L_0x10df:
            java.util.Set r1 = r13.A0N
            r1.clear()
            r0 = r16
            r1.addAll(r0)
            X.1DT r0 = r13.A02
            r0.A0E(r4)
            return
        L_0x10ef:
            java.lang.Object r3 = r6.A02
            android.os.Vibrator r3 = (android.os.Vibrator) r3
            java.lang.Object r2 = r6.A03
            long[] r2 = (long[]) r2
            boolean r1 = r6.A00
            if (r3 == 0) goto L_0x1102
            r0 = -1
            if (r1 == 0) goto L_0x10ff
            r0 = 0
        L_0x10ff:
            r3.vibrate(r2, r0)
        L_0x1102:
            java.lang.String r0 = "voip/vibrate/start complete"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x1108:
            java.lang.Object r4 = r6.A02
            X.A99 r4 = (X.A99) r4
            java.lang.Object r3 = r6.A03
            com.whatsapp.jid.UserJid r3 = (com.whatsapp.jid.UserJid) r3
            boolean r2 = r6.A00
            int r0 = com.whatsapp.voipcalling.Voip.sendRemoveUserRequest(r3)
            if (r0 != 0) goto L_0x1137
            if (r2 == 0) goto L_0x111f
            java.util.Set r0 = r4.A1D
            r0.add(r3)
        L_0x111f:
            android.os.Handler r1 = r4.A0H
            r0 = 46
            r1.removeMessages(r0)
            android.os.Message r1 = new android.os.Message
            r1.<init>()
            r1.what = r0
            r1.arg1 = r2
            r1.obj = r3
            android.os.Handler r0 = r4.A0H
            r0.sendMessage(r1)
            return
        L_0x1137:
            r1 = 28
            if (r2 == 0) goto L_0x113d
            r1 = 29
        L_0x113d:
            switch(r0) {
                case 670041: goto L_0x114b;
                case 670042: goto L_0x1148;
                default: goto L_0x1140;
            }
        L_0x1140:
            java.util.List r0 = java.util.Collections.singletonList(r3)
            r4.A18(r0, r1)
            return
        L_0x1148:
            r1 = 25
            goto L_0x1140
        L_0x114b:
            r1 = 27
            goto L_0x1140
        L_0x114e:
            java.lang.Object r1 = r6.A02
            X.A99 r1 = (X.A99) r1
            java.lang.Object r0 = r6.A03
            com.whatsapp.voipcalling.CallInfo r0 = (com.whatsapp.voipcalling.CallInfo) r0
            boolean r4 = r6.A00
            java.lang.String r0 = r0.callId
            boolean r0 = r1.A1G(r0)
            r3 = r0 ^ 1
            X.0ve r2 = r1.A2p
            r1 = 4204(0x106c, float:5.891E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r1 = X.C18020vd.A05(r0, r2, r1)
            boolean r0 = X.AnonymousClass112.A08()
            if (r0 == 0) goto L_0x1173
            if (r1 == 0) goto L_0x1173
            r3 = 1
        L_0x1173:
            com.whatsapp.voipcalling.Voip.onCallInterrupted(r4, r3)
            return
        L_0x1177:
            java.lang.Object r7 = r6.A02
            java.util.AbstractCollection r7 = (java.util.AbstractCollection) r7
            java.lang.Object r3 = r6.A03
            X.1fA r3 = (X.C31191fA) r3
            boolean r5 = r6.A00
            r0 = 0
            X.C18070vi.A0d(r7, r0)
            java.util.HashSet r4 = X.C17880vN.A12()
            monitor-enter(r7)
            java.util.Iterator r2 = r7.iterator()     // Catch:{ all -> 0x11e2 }
        L_0x118e:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x11e2 }
            if (r0 == 0) goto L_0x11ab
            X.1BI r1 = X.C17880vN.A0Q(r2)     // Catch:{ all -> 0x11e2 }
            X.00H r0 = r3.A0J     // Catch:{ all -> 0x11e2 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x11e2 }
            X.1To r0 = (X.C26811To) r0     // Catch:{ all -> 0x11e2 }
            X.C18070vi.A0b(r1)     // Catch:{ all -> 0x11e2 }
            java.util.Set r0 = r0.A08(r1, r5)     // Catch:{ all -> 0x11e2 }
            r4.addAll(r0)     // Catch:{ all -> 0x11e2 }
            goto L_0x118e
        L_0x11ab:
            monitor-exit(r7)
            X.00H r0 = r3.A0J
            java.lang.Object r0 = r0.get()
            X.1To r0 = (X.C26811To) r0
            r0.A0R(r4)
            X.00H r0 = r3.A0F
            java.lang.Object r0 = r0.get()
            X.1MQ r0 = (X.AnonymousClass1MQ) r0
            X.10w r0 = r0.A04()
            int r0 = r0.size()
            boolean r0 = X.AnonymousClass000.A1R(r0)
            r2 = r0 ^ 1
            X.00H r0 = r3.A0B
            java.lang.Object r0 = r0.get()
            X.1TK r0 = (X.AnonymousClass1TK) r0
            X.0vl r0 = r0.A02
            android.content.SharedPreferences$Editor r1 = X.C17890vO.A0A(r0)
            java.lang.String r0 = "should_warn_leaky_companion"
            android.content.SharedPreferences$Editor r0 = r1.putBoolean(r0, r2)
            goto L_0x1238
        L_0x11e2:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        L_0x11e5:
            java.lang.Object r2 = r6.A02
            X.1i1 r2 = (X.C32951i1) r2
            java.lang.Object r0 = r6.A03
            com.whatsapp.jid.Jid r0 = (com.whatsapp.jid.Jid) r0
            boolean r1 = r6.A00
            r2.A09()
            android.content.SharedPreferences r4 = X.C32951i1.A00(r2)
            java.lang.String r0 = r0.getRawString()
            java.lang.String r3 = X.AnonymousClass72V.A03(r0)
            X.6Uc r2 = X.AnonymousClass72V.A00(r4, r3)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r2.A00 = r0
            goto L_0x122c
        L_0x1209:
            java.lang.Object r2 = r6.A02
            X.1i1 r2 = (X.C32951i1) r2
            java.lang.Object r0 = r6.A03
            com.whatsapp.jid.Jid r0 = (com.whatsapp.jid.Jid) r0
            boolean r1 = r6.A00
            r2.A09()
            android.content.SharedPreferences r4 = X.C32951i1.A00(r2)
            java.lang.String r0 = r0.getRawString()
            java.lang.String r3 = X.AnonymousClass72V.A03(r0)
            X.6Uc r2 = X.AnonymousClass72V.A00(r4, r3)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r2.A04 = r0
        L_0x122c:
            android.content.SharedPreferences$Editor r1 = r4.edit()
            java.lang.String r0 = r2.toString()
            android.content.SharedPreferences$Editor r0 = r1.putString(r3, r0)
        L_0x1238:
            r0.apply()
            return
        L_0x123c:
            java.lang.Object r5 = r6.A02
            com.whatsapp.conversation.conversationrow.SecurityNotificationDialogFragment r5 = (com.whatsapp.conversation.conversationrow.SecurityNotificationDialogFragment) r5
            boolean r4 = r6.A00
            java.lang.Object r3 = r6.A03
            X.1FL r3 = (X.AnonymousClass1FL) r3
            X.0ve r2 = r5.A02
            r1 = 8926(0x22de, float:1.2508E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x125f
            X.1o3 r1 = r5.A04
            if (r4 == 0) goto L_0x125c
            java.lang.String r0 = "about-e2e-encryption"
        L_0x1258:
            r1.A01(r3, r0)
            return
        L_0x125c:
            java.lang.String r0 = "security-code-change-notification"
            goto L_0x1258
        L_0x125f:
            X.129 r1 = r5.A06
            if (r4 == 0) goto L_0x1277
            java.lang.String r0 = "26000361"
        L_0x1265:
            android.net.Uri r0 = r1.A04(r0)
            android.content.Intent r2 = X.AnonymousClass3MY.A07(r0)
            X.1L9 r1 = r5.A00
            android.content.Context r0 = r5.A1n()
            r1.A08(r0, r2)
            return
        L_0x1277:
            java.lang.String r0 = "28030014"
            goto L_0x1265
        L_0x127a:
            java.lang.Object r3 = r6.A02
            X.A8c r3 = (X.C20119A8c) r3
            java.lang.Object r2 = r6.A03
            X.A2N r2 = (X.A2N) r2
            boolean r1 = r6.A00
            r0 = 2
            X.C20119A8c.A00(r3, r2, r0, r1)
            r0 = 1
            X.C20119A8c.A04(r3, r2, r0)
            return
        L_0x128d:
            java.lang.Object r4 = r6.A02
            X.4aY r4 = (X.AnonymousClass4aY) r4
            boolean r2 = r6.A00
            java.lang.Object r1 = r6.A03
            r0 = 1
            X.4mU r3 = new X.4mU
            r3.<init>(r4, r1, r0, r2)
            java.lang.Integer r2 = X.AnonymousClass00R.A0C
            X.4Xd r0 = r4.A2p
            java.lang.Integer r1 = X.C87464Vr.A00(r0)
            r0 = 0
            X.AnonymousClass4aY.A1U(r4, r3, r2, r1, r0)
            return
        L_0x12a8:
            java.lang.Object r0 = r6.A02
            X.4aY r0 = (X.AnonymousClass4aY) r0
            java.lang.Object r4 = r6.A03
            X.1E7 r4 = (X.AnonymousClass1E7) r4
            boolean r3 = r6.A00
            X.1VP r2 = r0.A1k
            X.5cQ r0 = r0.A2Q
            X.1FY r1 = r0.CFa()
            r0 = 8
            r2.CNw(r1, r4, r0, r3)
            return
        L_0x12c0:
            java.lang.Object r2 = r6.A02
            X.3xO r2 = (X.C80563xO) r2
            java.lang.Object r1 = r6.A03
            X.4MX r1 = (X.AnonymousClass4MX) r1
            boolean r0 = r6.A00
            r2.A07(r1, r0)
            return
        L_0x12ce:
            java.lang.Object r7 = r6.A02
            X.1Co r7 = (X.C22621Co) r7
            java.lang.Object r0 = r6.A03
            java.util.List r0 = (java.util.List) r0
            boolean r5 = r6.A00
            java.util.HashSet r3 = X.C17880vN.A12()
            java.util.Iterator r4 = r0.iterator()
        L_0x12e0:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x1317
            java.lang.Object r1 = r4.next()
            X.1ci r1 = (X.C29691ci) r1
            X.00H r2 = r7.A01
            java.lang.Object r0 = r2.get()
            X.1as r0 = (X.C28771as) r0
            X.1To r0 = r0.A02
            X.1BI r1 = r1.A0u
            java.util.Set r0 = r0.A05(r1, r5)
            r3.addAll(r0)
            java.lang.Object r0 = r2.get()
            X.1as r0 = (X.C28771as) r0
            X.00H r0 = r0.A0N
            java.lang.Object r0 = r0.get()
            X.1Q1 r0 = (X.AnonymousClass1Q1) r0
            if (r5 == 0) goto L_0x1313
            r0.A00(r1)
            goto L_0x12e0
        L_0x1313:
            r0.A01(r1)
            goto L_0x12e0
        L_0x1317:
            X.00H r4 = r7.A01
            java.lang.Object r0 = r4.get()
            X.1as r0 = (X.C28771as) r0
            X.1LW r0 = r0.A07
            X.1Cd r0 = r0.A03
            X.1au r2 = r0.A05()
            r0 = 1
            android.content.ContentValues r6 = new android.content.ContentValues     // Catch:{ all -> 0x1354 }
            r6.<init>(r0)     // Catch:{ all -> 0x1354 }
            java.lang.String r1 = "archived"
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)     // Catch:{ all -> 0x1354 }
            r6.put(r1, r0)     // Catch:{ all -> 0x1354 }
            r0 = r2
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x1354 }
            X.1Ev r5 = r0.A02     // Catch:{ all -> 0x1354 }
            java.lang.String r7 = "chat"
            java.lang.String r8 = "chat_lock = 0"
            java.lang.String r9 = "updateAllChatsArchivedInChatList/UPDATE_CHAT"
            r10 = 0
            r5.A02(r6, r7, r8, r9, r10)     // Catch:{ all -> 0x1354 }
            r2.close()
            java.lang.Object r0 = r4.get()
            X.1as r0 = (X.C28771as) r0
            X.1To r0 = r0.A02
            r0.A0R(r3)
            return
        L_0x1354:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x1359 }
            throw r1
        L_0x1359:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
            throw r1
        L_0x135e:
            java.lang.Object r5 = r6.A02
            X.1ci r5 = (X.C29691ci) r5
            boolean r1 = r6.A00
            java.lang.Object r4 = r6.A03
            X.1as r4 = (X.C28771as) r4
            boolean r0 = r5.A0l
            boolean r3 = X.AnonymousClass000.A1S(r0, r1)
            r5.A0l = r1
            X.1To r2 = r4.A02
            X.1BI r0 = r5.A0u
            java.util.Set r1 = r2.A05(r0, r1)
            X.1LW r0 = r4.A07
            r0.A0J(r5, r3)
            r2.A0R(r1)
            return
        L_0x1381:
            java.lang.Object r4 = r6.A02
            X.10T r4 = (X.AnonymousClass10T) r4
            java.lang.Object r3 = r6.A03
            boolean r2 = r6.A00
            r1 = 3
            X.35W r0 = new X.35W
            r0.<init>((int) r1, (java.lang.Object) r3, (boolean) r2)
            r4.notifyAllObservers(r0)
            return
        L_0x1393:
            java.lang.Object r2 = r6.A02
            X.1hG r2 = (X.C32481hG) r2
            java.lang.Object r1 = r6.A03
            X.206 r1 = (X.AnonymousClass206) r1
            boolean r0 = r6.A00
            r2.A04(r1, r0)
            return
        L_0x13a1:
            java.lang.Object r0 = r6.A02
            X.1aN r0 = (X.C28521aN) r0
            java.lang.Object r5 = r6.A03
            java.util.Collection r5 = (java.util.Collection) r5
            boolean r4 = r6.A00
            X.1Lg r3 = r0.A07
            r2 = 0
            r1 = 1
            X.35T r0 = new X.35T
            r0.<init>(r2, r5, r1, r4)
            r3.notifyAllObservers(r0)
            return
        L_0x13b8:
            java.lang.Object r8 = r6.A02
            X.1Kn r8 = (X.C24491Kn) r8
            java.lang.Object r7 = r6.A03
            X.2rg r7 = (X.C62612rg) r7
            boolean r5 = r6.A00
            r3 = 987(0x3db, double:4.876E-321)
            r1 = 1
            X.1Kj r0 = new X.1Kj
            r0.<init>(r1, r3)
            X.C24491Kn.A04(r7, r8, r0, r5)
            return
        L_0x13cf:
            java.lang.Object r1 = r6.A02
            X.3d3 r1 = (X.C74873d3) r1
            java.lang.Object r2 = r6.A03
            android.view.View r2 = (android.view.View) r2
            boolean r0 = r6.A00
            if (r0 == 0) goto L_0x13e0
            boolean r1 = r1.A0F
            r0 = 0
            if (r1 == 0) goto L_0x13e2
        L_0x13e0:
            r0 = 8
        L_0x13e2:
            r2.setVisibility(r0)
            return
        L_0x13e6:
            java.lang.Object r3 = r6.A02
            com.whatsapp.flows.phoenix.webview.FcsFlowsWebViewFragment r3 = (com.whatsapp.flows.phoenix.webview.FcsFlowsWebViewFragment) r3
            java.lang.Object r4 = r6.A03
            X.1BI r4 = (X.AnonymousClass1BI) r4
            boolean r7 = r6.A00
            r2 = 0
            X.1FL r0 = r3.A1B()
            if (r0 == 0) goto L_0x1427
            android.content.Intent r0 = r0.getIntent()
            if (r0 == 0) goto L_0x1427
            android.os.Bundle r1 = r0.getExtras()
            if (r1 == 0) goto L_0x1427
            java.lang.String r0 = "message_id"
            java.lang.String r0 = r1.getString(r0)
            if (r0 == 0) goto L_0x1427
            X.205 r1 = new X.205
            r1.<init>(r4, r0, r2)
            X.00H r0 = r3.A06
            if (r0 == 0) goto L_0x1429
            X.206 r5 = X.AnonymousClass1W2.A01(r1, r0)
        L_0x1418:
            X.1KB r0 = r3.A01
            if (r0 == 0) goto L_0x142c
            r6 = 29
            X.7RT r2 = new X.7RT
            r2.<init>(r3, r4, r5, r6, r7)
            r0.A0J(r2)
            return
        L_0x1427:
            r5 = 0
            goto L_0x1418
        L_0x1429:
            java.lang.String r0 = "fMessageDatabase"
            goto L_0x142e
        L_0x142c:
            java.lang.String r0 = "globalUI"
        L_0x142e:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x1433:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x1436:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L_0x1439:
            r38.getTag()
            return
        L_0x143d:
            X.1DT r4 = r3.A0M
            X.4DX r3 = X.AnonymousClass4DX.LOADING_FAILED
            r2 = 0
            if (r5 == 0) goto L_0x144c
            java.lang.String r1 = r5.A0D()     // Catch:{ MalformedURLException -> 0x1449 }
            goto L_0x144d
        L_0x1449:
            java.lang.String r1 = r5.A0S
            goto L_0x144d
        L_0x144c:
            r1 = 0
        L_0x144d:
            X.4UK r0 = new X.4UK
            r0.<init>(r2, r3, r1)
            r4.A0F(r0)
            return
        L_0x1456:
            X.1DT r0 = r3.A0I
            r0.A0F(r5)
            return
        L_0x145c:
            X.1KB r4 = r7.A00
            android.content.res.Resources r3 = r0.getResources()
            r2 = 2131755040(0x7f100020, float:1.9140948E38)
            java.lang.Object[] r1 = X.AnonymousClass3MW.A1a()
            r0 = 3
            X.C17880vN.A1T(r1, r0, r5)
            java.lang.String r0 = r3.getQuantityString(r2, r0, r1)
            r4.A0G(r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7RF.run():void");
    }

    public AnonymousClass7RF(Object obj, Object obj2, int i, boolean z) {
        this.A01 = i;
        this.A02 = obj;
        this.A00 = z;
        this.A03 = obj2;
    }

    public AnonymousClass7RF(C27581Wq r2, C23391Fw r3) {
        this.A01 = 0;
        this.A03 = r3;
        this.A02 = r2;
    }
}
