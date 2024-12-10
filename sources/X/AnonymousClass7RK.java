package X;

/* renamed from: X.7RK  reason: invalid class name */
public class AnonymousClass7RK implements Runnable {
    public boolean A00;
    public final int A01;
    public final Object A02;

    public AnonymousClass7RK(C20075A6b a6b, int i, boolean z) {
        this.A01 = i;
        if (14 - i != 0) {
            this.A02 = a6b;
            this.A00 = z;
            return;
        }
        this.A02 = a6b;
        this.A00 = z;
    }

    /* JADX WARNING: type inference failed for: r4v4, types: [X.6jd, java.lang.Object] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x024d, code lost:
        r1.A0E(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0250, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x037b, code lost:
        if (X.C88504Zz.A02(r2, r9, X.AnonymousClass000.A1O(r2.A02.A00() ? 1 : 0)) == false) goto L_0x037d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x03db, code lost:
        if (X.C18020vd.A05(r3, r8.A01.A00, 976) != false) goto L_0x03dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x0490, code lost:
        if (X.C61142pC.A04.contains(r2) != false) goto L_0x0492;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x06b0, code lost:
        com.whatsapp.util.Log.i(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x06b3, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:349:0x07da, code lost:
        X.AnonymousClass4Yv.A01(r1, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:350:0x07de, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:391:0x08be, code lost:
        com.whatsapp.util.Log.e(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:392:0x08c1, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:431:0x093b, code lost:
        throw null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r14 = this;
            int r0 = r14.A01
            switch(r0) {
                case 0: goto L_0x005b;
                case 1: goto L_0x0077;
                case 2: goto L_0x0093;
                case 3: goto L_0x0562;
                case 4: goto L_0x0583;
                case 5: goto L_0x015d;
                case 6: goto L_0x058d;
                case 7: goto L_0x009d;
                case 8: goto L_0x05a8;
                case 9: goto L_0x05db;
                case 10: goto L_0x0606;
                case 11: goto L_0x001f;
                case 12: goto L_0x0643;
                case 13: goto L_0x0673;
                case 14: goto L_0x069c;
                case 15: goto L_0x06a6;
                case 16: goto L_0x06c5;
                case 17: goto L_0x06cf;
                case 18: goto L_0x06dc;
                case 19: goto L_0x06fb;
                case 20: goto L_0x0713;
                case 21: goto L_0x0180;
                case 22: goto L_0x0192;
                case 23: goto L_0x0725;
                case 24: goto L_0x0731;
                case 25: goto L_0x092a;
                case 26: goto L_0x0231;
                case 27: goto L_0x0251;
                case 28: goto L_0x073b;
                case 29: goto L_0x07ad;
                case 30: goto L_0x07cc;
                case 31: goto L_0x029c;
                case 32: goto L_0x07e4;
                case 33: goto L_0x081a;
                case 34: goto L_0x02ba;
                case 35: goto L_0x02c9;
                case 36: goto L_0x082a;
                case 37: goto L_0x0850;
                case 38: goto L_0x086a;
                case 39: goto L_0x0874;
                case 40: goto L_0x0326;
                case 41: goto L_0x03f7;
                case 42: goto L_0x042b;
                case 43: goto L_0x0888;
                case 44: goto L_0x0892;
                case 45: goto L_0x045a;
                case 46: goto L_0x0532;
                case 47: goto L_0x053e;
                case 48: goto L_0x089b;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r14.A02
            X.6HA r0 = (X.AnonymousClass6HA) r0
            boolean r4 = r14.A00
            X.6q9 r3 = r0.A00
            X.6ka r0 = r3.A06
            X.0z4 r0 = r0.A04
            r2 = 1
            android.content.SharedPreferences$Editor r1 = X.C19830z4.A00(r0)
            java.lang.String r0 = "sticker_picker_initial_download"
            X.C17880vN.A1F(r1, r0, r2)
            r3.A00(r4)
        L_0x001e:
            return
        L_0x001f:
            boolean r0 = r14.A00
            java.lang.Object r5 = r14.A02
            X.9yn r5 = (X.C198719yn) r5
            if (r0 == 0) goto L_0x055d
            X.A1i r6 = r5.A08
            X.1Ty r0 = r5.A03
            com.whatsapp.jid.UserJid r4 = r5.A09
            X.AEW r3 = r0.A08(r4)
            X.0ve r2 = r6.A00
            r1 = 5996(0x176c, float:8.402E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r1 = X.C18020vd.A05(r0, r2, r1)
            java.lang.String r0 = "promotions"
            boolean r0 = X.C19973A1i.A00(r6, r3, r0, r1)
            if (r0 == 0) goto L_0x004f
            com.whatsapp.biz.catalog.manager.CatalogManager r2 = r5.A07
            r1 = 1
            X.ANH r0 = new X.ANH
            r0.<init>(r5, r1)
            r2.A0A(r0, r4)
            return
        L_0x004f:
            X.1DT r1 = r5.A02
            r0 = 0
            r1.A0E(r0)
            X.1wy r1 = r5.A0B
            X.8i4 r0 = X.C167968i4.A00
            goto L_0x024d
        L_0x005b:
            java.lang.Object r0 = r14.A02
            X.DGH r0 = (X.DGH) r0
            java.util.concurrent.CopyOnWriteArraySet r0 = r0.A00
            java.util.Iterator r2 = r0.iterator()
        L_0x0065:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x001e
            java.lang.Object r1 = r2.next()
            X.EAh r1 = (X.C28613EAh) r1
            boolean r0 = r14.A00
            r1.C7A(r0)
            goto L_0x0065
        L_0x0077:
            java.lang.Object r0 = r14.A02
            X.DGH r0 = (X.DGH) r0
            java.util.concurrent.CopyOnWriteArraySet r0 = r0.A00
            java.util.Iterator r2 = r0.iterator()
        L_0x0081:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x001e
            java.lang.Object r1 = r2.next()
            X.EAh r1 = (X.C28613EAh) r1
            boolean r0 = r14.A00
            r1.Bwm(r0)
            goto L_0x0081
        L_0x0093:
            boolean r0 = r14.A00
            if (r0 != 0) goto L_0x001e
            java.lang.Object r0 = r14.A02
            X.C108945cZ.A1P(r0)
            return
        L_0x009d:
            java.lang.Object r5 = r14.A02
            com.whatsapp.avatar.home.AvatarHomeActivity r5 = (com.whatsapp.avatar.home.AvatarHomeActivity) r5
            boolean r6 = r14.A00
            com.whatsapp.components.MainChildCoordinatorLayout r0 = r5.A0H
            if (r0 == 0) goto L_0x08e0
            int r3 = r0.getHeight()
            float r1 = (float) r3
            r0 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 * r0
            int r4 = (int) r1
            android.widget.LinearLayout r2 = r5.A05
            if (r2 != 0) goto L_0x00b8
            java.lang.String r0 = "containerNewUser"
            goto L_0x0937
        L_0x00b8:
            r1 = 0
            int r0 = r2.getMeasuredHeight()
            if (r0 != 0) goto L_0x00c6
            r2.measure(r1, r1)
            int r0 = r2.getMeasuredHeight()
        L_0x00c6:
            if (r6 == 0) goto L_0x00cb
            if (r0 <= 0) goto L_0x00cb
            r4 = r0
        L_0x00cb:
            int r1 = r3 - r4
            com.whatsapp.bottomsheet.LockableBottomSheetBehavior r0 = r5.A0G
            if (r0 == 0) goto L_0x00d4
            r0.A0V(r1)
        L_0x00d4:
            android.widget.LinearLayout r0 = r5.A04
            if (r0 == 0) goto L_0x08dd
            int r0 = r0.getHeight()
            int r3 = r3 - r0
            android.view.View r0 = r5.A02
            java.lang.String r8 = "sheetPaddingView"
            if (r0 == 0) goto L_0x08d9
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            if (r0 == 0) goto L_0x015b
            int r6 = r0.height
        L_0x00eb:
            android.util.TypedValue r7 = new android.util.TypedValue
            r7.<init>()
            android.content.res.Resources$Theme r2 = r5.getTheme()
            r1 = 16843499(0x10102eb, float:2.3695652E-38)
            r0 = 1
            boolean r0 = r2.resolveAttribute(r1, r7, r0)
            if (r0 == 0) goto L_0x011b
            int r1 = r7.data
            android.util.DisplayMetrics r0 = X.C108965cb.A08(r5)
            int r2 = android.util.TypedValue.complexToDimensionPixelSize(r1, r0)
            android.widget.LinearLayout r0 = r5.A04
            if (r0 == 0) goto L_0x08dd
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            com.whatsapp.components.MainChildCoordinatorLayout r0 = r5.A0H
            if (r0 == 0) goto L_0x08e0
            int r0 = r0.getHeight()
            int r0 = r0 - r2
            r1.height = r0
        L_0x011b:
            if (r3 <= r6) goto L_0x0129
            android.view.View r0 = r5.A02
            if (r0 == 0) goto L_0x08d9
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            if (r0 == 0) goto L_0x0129
            r0.height = r3
        L_0x0129:
            com.whatsapp.CircularProgressBar r0 = r5.A08
            java.lang.String r3 = "avatarLoadingProgressBar"
            if (r0 == 0) goto L_0x08d5
            int r0 = r0.getMeasuredHeight()
            if (r0 != 0) goto L_0x013d
            com.whatsapp.CircularProgressBar r1 = r5.A08
            if (r1 == 0) goto L_0x08d5
            r0 = 0
            r1.measure(r0, r0)
        L_0x013d:
            com.whatsapp.CircularProgressBar r0 = r5.A08
            if (r0 == 0) goto L_0x08d5
            int r2 = r0.getMeasuredHeight()
            com.whatsapp.CircularProgressBar r0 = r5.A08
            if (r0 == 0) goto L_0x08d5
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            boolean r0 = r1 instanceof android.widget.FrameLayout.LayoutParams
            if (r0 == 0) goto L_0x001e
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            if (r1 == 0) goto L_0x001e
            int r0 = r4 / 2
            int r0 = r0 - r2
            r1.topMargin = r0
            return
        L_0x015b:
            r6 = 0
            goto L_0x00eb
        L_0x015d:
            java.lang.Object r3 = r14.A02
            com.whatsapp.authentication.VerifyTwoFactorAuthCodeDialogFragment r3 = (com.whatsapp.authentication.VerifyTwoFactorAuthCodeDialogFragment) r3
            boolean r1 = r14.A00
            X.1FL r0 = r3.A1B()
            if (r0 == 0) goto L_0x001e
            boolean r0 = X.AnonymousClass4Yv.A02(r0)
            if (r0 != 0) goto L_0x001e
            r2 = 1
            if (r1 == 0) goto L_0x08e3
            r0 = 2
            r3.A00 = r0
            X.1eh r0 = r3.A05
            if (r0 == 0) goto L_0x090f
            r0.A06(r2)
            com.whatsapp.authentication.VerifyTwoFactorAuthCodeDialogFragment.A00(r3)
            return
        L_0x0180:
            java.lang.Object r2 = r14.A02
            X.4R3 r2 = (X.AnonymousClass4R3) r2
            boolean r1 = r14.A00
            r0 = 0
            X.C18070vi.A0d(r2, r0)
            X.5Yv r0 = r2.A00
            if (r0 == 0) goto L_0x001e
            r0.C2A(r1)
            return
        L_0x0192:
            java.lang.Object r3 = r14.A02
            X.7DY r3 = (X.AnonymousClass7DY) r3
            boolean r1 = r14.A00
            java.io.File r0 = r3.A0Z
            r4 = 0
            if (r0 == 0) goto L_0x022e
            java.lang.String r0 = r0.getAbsolutePath()
            java.io.File r2 = X.C108945cZ.A17(r0)
        L_0x01a5:
            if (r1 == 0) goto L_0x01f7
            if (r2 == 0) goto L_0x0224
            X.73m r7 = r3.A19
            r6 = 554249147(0x21092bbb, float:4.647528E-19)
            java.lang.String r5 = "show_media_preview"
            X.C1408973m.A03(r7, r5, r6)
            X.3ho r0 = r3.A0O
            if (r0 == 0) goto L_0x01ec
            X.77X r8 = r0.A0l()
        L_0x01bb:
            X.6u4 r0 = r3.A15
            int r1 = r0.A00
            r0 = 3
            if (r1 != r0) goto L_0x01e6
            X.65R r0 = new X.65R
            r0.<init>(r8, r2)
        L_0x01c7:
            X.1KB r4 = r3.A0y
            r2 = 16
            X.7RL r1 = new X.7RL
            r1.<init>(r3, r0, r2)
            r4.CGP(r1)
            X.C1408973m.A02(r7, r5, r6)
        L_0x01d6:
            X.73m r1 = r3.A19
            boolean r0 = r1.A08
            if (r0 == 0) goto L_0x001e
            X.19T r2 = r1.A07
            r1 = 554249147(0x21092bbb, float:4.647528E-19)
            r0 = 2
            r2.markerEnd(r1, r0)
            return
        L_0x01e6:
            X.65i r0 = new X.65i
            r0.<init>(r8, r2)
            goto L_0x01c7
        L_0x01ec:
            r9 = 0
            r11 = r9
            r12 = r9
            r13 = r9
            X.77X r8 = new X.77X
            r10 = r9
            r8.<init>(r9, r10, r11, r12, r13)
            goto L_0x01bb
        L_0x01f7:
            if (r2 == 0) goto L_0x0224
            boolean r0 = r2.exists()
            if (r0 == 0) goto L_0x0224
            boolean r0 = r2.delete()
            if (r0 != 0) goto L_0x0215
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "CameraUi/cleanUpAfterStopVideoCapture/Failed to delete video "
            r1.append(r0)
            java.lang.String r0 = r2.getAbsolutePath()
            X.C17890vO.A19(r1, r0)
        L_0x0215:
            r3.A0Z = r4
            X.1KB r2 = r3.A0y
            r1 = 17
            X.7R9 r0 = new X.7R9
            r0.<init>((java.lang.Object) r3, (int) r1)
            r2.CGP(r0)
            goto L_0x01d6
        L_0x0224:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "CameraUi/cleanUpAfterStopVideoCapture/Video file doesn't exist: "
            X.C17900vP.A0X(r2, r0, r1)
            goto L_0x0215
        L_0x022e:
            r2 = r4
            goto L_0x01a5
        L_0x0231:
            java.lang.Object r1 = r14.A02
            X.49f r1 = (X.C826549f) r1
            boolean r2 = r14.A00
            boolean r0 = X.C108945cZ.A1T(r1)
            if (r0 != 0) goto L_0x001e
            java.lang.ref.WeakReference r0 = r1.A0C
            java.lang.Object r0 = r0.get()
            X.3Ua r0 = (X.AnonymousClass3Ua) r0
            if (r0 == 0) goto L_0x001e
            X.1DT r1 = r0.A09
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
        L_0x024d:
            r1.A0E(r0)
            return
        L_0x0251:
            java.lang.Object r2 = r14.A02
            X.11w r2 = (X.C203711w) r2
            boolean r1 = r14.A00
            X.2Ko r0 = r2.A0L
            r0.A04(r1)
            X.118 r0 = r2.A0V
            android.content.Context r5 = r0.A00
            X.11C r0 = r2.A0T
            android.app.ActivityManager r0 = r0.A04()
            java.util.List r0 = r0.getRunningAppProcesses()
            if (r0 == 0) goto L_0x001e
            java.lang.String r4 = r5.getPackageName()
            java.util.Iterator r3 = r0.iterator()
        L_0x0274:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0912
            java.lang.Object r2 = r3.next()
            android.app.ActivityManager$RunningAppProcessInfo r2 = (android.app.ActivityManager.RunningAppProcessInfo) r2
            int r1 = r2.importance
            r0 = 100
            if (r1 != r0) goto L_0x0274
            java.lang.String r0 = r2.processName
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x0274
            android.content.Intent r1 = X.AnonymousClass1LU.A0A(r5)
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            android.content.Intent r0 = r1.setFlags(r0)
            r5.startActivity(r0)
            goto L_0x0274
        L_0x029c:
            java.lang.Object r3 = r14.A02
            X.3d2 r3 = (X.C74863d2) r3
            boolean r2 = r14.A00
            com.whatsapp.WaEditText r1 = r3.A05
            android.view.View r0 = r3.getContentView()
            android.graphics.Rect r1 = X.C74863d2.A02(r1)
            android.graphics.Rect r0 = X.C74863d2.A02(r0)
            boolean r0 = r1.intersect(r0)
            if (r0 == 0) goto L_0x001e
            X.C74863d2.A03(r3, r2)
            return
        L_0x02ba:
            java.lang.Object r2 = r14.A02
            X.4dw r2 = (X.C90354dw) r2
            boolean r1 = r14.A00
            r0 = 0
            r2.A00 = r0
            if (r1 != 0) goto L_0x001e
            X.C90354dw.A00(r2)
            return
        L_0x02c9:
            java.lang.Object r2 = r14.A02
            X.4d3 r2 = (X.C89804d3) r2
            boolean r12 = r14.A00
            X.1FU r1 = r2.A00
            boolean r0 = r1 instanceof X.C106675Wt
            if (r0 == 0) goto L_0x001e
            X.1BI r3 = r2.A04
            boolean r0 = X.C22971Dz.A0d(r3)
            if (r0 == 0) goto L_0x001e
            X.5Wt r1 = (X.C106675Wt) r1
            boolean r6 = r2.A06
            r7 = r6 ^ 1
            com.whatsapp.jid.UserJid r3 = (com.whatsapp.jid.UserJid) r3
            java.lang.String r4 = r2.A05
            com.whatsapp.Conversation r1 = (com.whatsapp.Conversation) r1
            X.4aY r0 = r1.A03
            X.AnonymousClass4aY.A0j(r0)
            X.00H r0 = r0.A4u
            java.lang.Object r0 = r0.get()
            X.2hA r0 = (X.C56252hA) r0
            X.00H r0 = r0.A0A
            java.lang.Object r8 = r0.get()
            X.73Z r8 = (X.AnonymousClass73Z) r8
            r5 = 0
            X.3lq r2 = new X.3lq
            r2.<init>(r3, r4, r5, r6, r7)
            r11 = 814(0x32e, float:1.14E-42)
            X.00H r0 = r8.A03
            X.1UD r0 = X.AnonymousClass3MW.A0X(r0)
            boolean r0 = r0.A08()
            if (r0 != 0) goto L_0x0917
            android.app.Activity r1 = r8.A01
            boolean r0 = r1 instanceof X.AnonymousClass1FU
            if (r0 == 0) goto L_0x001e
            X.1FU r1 = (X.AnonymousClass1FU) r1
            X.C18070vi.A0d(r1, r5)
            com.whatsapp.bot.onboarding.AiNotAvailableBottomSheet r0 = new com.whatsapp.bot.onboarding.AiNotAvailableBottomSheet
            r0.<init>()
            r1.CMl(r0)
            return
        L_0x0326:
            java.lang.Object r7 = r14.A02
            X.4aY r7 = (X.AnonymousClass4aY) r7
            boolean r4 = r14.A00
            X.1E7 r0 = r7.A35
            java.lang.Class<com.whatsapp.jid.UserJid> r5 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r9 = r0.A06(r5)
            com.whatsapp.jid.UserJid r9 = (com.whatsapp.jid.UserJid) r9
            java.lang.Boolean r2 = X.AnonymousClass000.A0h()
            if (r9 == 0) goto L_0x001e
            X.0ve r1 = r7.A3F
            r0 = 10369(0x2881, float:1.453E-41)
            X.0vf r3 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r3, r1, r0)
            if (r0 == 0) goto L_0x0387
            X.00H r0 = r7.A5H
            java.lang.Object r0 = r0.get()
            X.1eS r0 = (X.C30751eS) r0
            X.8oR r0 = r0.A02(r9)
            if (r0 == 0) goto L_0x0387
            boolean r6 = r0.A0A
            X.4Zz r2 = X.AnonymousClass4aY.A06(r7)
            X.4Xd r1 = r7.A2p
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            X.4Xd r0 = X.C87814Xd.A0e
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x037d
            if (r6 == 0) goto L_0x037d
            X.4QB r0 = r2.A02
            boolean r0 = r0.A00()
            boolean r0 = X.AnonymousClass000.A1O(r0)
            boolean r1 = X.C88504Zz.A02(r2, r9, r0)
            r0 = 1
            if (r1 != 0) goto L_0x037e
        L_0x037d:
            r0 = 0
        L_0x037e:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            if (r0 == 0) goto L_0x0387
            X.AnonymousClass4aY.A0c(r7)
        L_0x0387:
            boolean r0 = r2.booleanValue()
            if (r0 != 0) goto L_0x001e
            X.4QB r0 = r7.A2r
            if (r4 != 0) goto L_0x039d
            X.4Lg r0 = r0.A00
            X.0ve r1 = r0.A00
            r0 = 976(0x3d0, float:1.368E-42)
            boolean r0 = X.C18020vd.A05(r3, r1, r0)
            if (r0 == 0) goto L_0x03ca
        L_0x039d:
            X.4aI r2 = X.C88444Zs.A01(r7)
            X.1E7 r0 = r7.A35
            com.whatsapp.jid.Jid r1 = r0.A06(r5)
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            if (r1 == 0) goto L_0x03ca
            X.1eS r0 = r2.A01
            X.8oR r0 = r0.A02(r1)
            if (r0 == 0) goto L_0x03ca
            X.00H r0 = r7.A5Y
            java.lang.Object r0 = r0.get()
            X.4PK r0 = (X.AnonymousClass4PK) r0
            X.00H r0 = r0.A06
            java.lang.Object r2 = r0.get()
            X.4Qj r2 = (X.C86144Qj) r2
            X.1BI r1 = r7.A3R
            r0 = 9
            r2.A00(r1, r0)
        L_0x03ca:
            X.4Zz r8 = X.AnonymousClass4aY.A06(r7)
            if (r4 != 0) goto L_0x03dd
            X.4Lg r0 = r8.A01
            X.0ve r1 = r0.A00
            r0 = 976(0x3d0, float:1.368E-42)
            boolean r1 = X.C18020vd.A05(r3, r1, r0)
            r0 = 0
            if (r1 == 0) goto L_0x03de
        L_0x03dd:
            r0 = 1
        L_0x03de:
            r0 = r0 ^ 1
            boolean r11 = X.C88504Zz.A02(r8, r9, r0)
            boolean r0 = r8.A04(r9)
            r7.A6z = r0
            X.1KB r0 = r7.A1L
            r10 = 21
            X.7RT r6 = new X.7RT
            r6.<init>(r7, r8, r9, r10, r11)
            r0.A0J(r6)
            return
        L_0x03f7:
            java.lang.Object r4 = r14.A02
            X.4aY r4 = (X.AnonymousClass4aY) r4
            boolean r1 = r14.A00
            r0 = 1
            X.5tO r2 = r4.A24
            if (r1 == 0) goto L_0x0427
            android.view.View r1 = r4.A0F
            r0 = 3
            r2.A0E(r1, r0)
        L_0x0408:
            X.0ve r2 = r4.A3F
            r0 = 0
            X.C18070vi.A0d(r2, r0)
            r1 = 8304(0x2070, float:1.1636E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 != 0) goto L_0x001e
            com.whatsapp.KeyboardPopupLayout r3 = r4.A1M
            r0 = 35
            X.4rn r2 = new X.4rn
            r2.<init>((java.lang.Object) r4, (int) r0)
            r0 = 300(0x12c, double:1.48E-321)
            r3.postDelayed(r2, r0)
            return
        L_0x0427:
            r2.A0J(r0)
            goto L_0x0408
        L_0x042b:
            java.lang.Object r3 = r14.A02
            X.4aY r3 = (X.AnonymousClass4aY) r3
            boolean r2 = r14.A00
            com.whatsapp.conversation.ConversationListView r1 = r3.A2B
            r0 = 1
            r1.A0Q = r0
            boolean r0 = X.AnonymousClass4aY.A26(r3)
            r1 = 0
            if (r0 != 0) goto L_0x0452
            X.3xv r0 = r3.A3L
            if (r0 == 0) goto L_0x0452
            r0.A00(r1)
        L_0x0444:
            X.7MX r0 = r3.A3v
            r0.A04(r1)
            if (r2 == 0) goto L_0x001e
            X.AnonymousClass4aY.A0m(r3)
            X.AnonymousClass4aY.A0d(r3)
            return
        L_0x0452:
            com.whatsapp.emoji.search.EmojiSearchKeyboardContainer r0 = r3.A39
            if (r0 == 0) goto L_0x0444
            r0.A03()
            goto L_0x0444
        L_0x045a:
            java.lang.Object r8 = r14.A02
            X.3VQ r8 = (X.AnonymousClass3VQ) r8
            boolean r0 = r14.A00
            java.util.ArrayList r6 = X.AnonymousClass000.A13()
            r10 = 0
            r7 = 1
            if (r0 == 0) goto L_0x052f
            X.122 r1 = r8.A0m
            X.1BI r2 = r8.A0u
            boolean r0 = r2 instanceof X.AnonymousClass1E2
            if (r0 == 0) goto L_0x052f
            X.1RL r1 = r1.A0m
            r0 = r2
            X.1E2 r0 = (X.AnonymousClass1E2) r0
            r1.A07(r0)
            java.lang.Boolean r0 = r1.A06(r0)
            if (r0 == 0) goto L_0x0484
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x052f
        L_0x0484:
            r11 = 1
            X.2pC r0 = X.C61142pC.A01
            X.C18070vi.A0d(r2, r10)
            java.util.Set r0 = X.C61142pC.A04
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L_0x0493
        L_0x0492:
            r10 = 1
        L_0x0493:
            X.122 r4 = r8.A0m
            X.1BI r9 = r8.A0u
            X.1M9 r0 = r4.A08
            X.1E7 r1 = r0.A0E(r9)
            if (r1 == 0) goto L_0x04d4
            X.00H r0 = r4.A1I
            java.lang.Object r0 = r0.get()
            X.9l9 r0 = (X.C190559l9) r0
            X.5Zc r0 = r0.A00(r1)
            if (r0 == 0) goto L_0x04d4
            boolean r0 = r0.Bfv()
            if (r0 == 0) goto L_0x04d4
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Creating initial biz info system message for chat: "
            X.C17900vP.A0Y(r9, r0, r1)
            X.1PQ r2 = r4.A11
            X.11P r0 = r4.A0A
            long r0 = X.AnonymousClass11P.A01(r0)
            X.1PP r2 = r2.A02
            X.205 r5 = r2.A01(r9, r7)
            r3 = 129(0x81, float:1.81E-43)
            X.97c r2 = new X.97c
            r2.<init>(r5, r3, r0)
            r6.add(r2)
        L_0x04d4:
            if (r11 == 0) goto L_0x04ee
            X.1PQ r1 = r4.A11
            X.11P r0 = r4.A0A
            long r2 = X.AnonymousClass11P.A01(r0)
            X.1PP r0 = r1.A02
            X.205 r5 = r0.A01(r9, r7)
            r1 = 96
            X.97i r0 = new X.97i
            r0.<init>(r5, r1, r2)
            r6.add(r0)
        L_0x04ee:
            if (r10 == 0) goto L_0x051f
            X.1PS r0 = r8.A0s
            X.2M9 r1 = r0.A04(r9)
            if (r1 == 0) goto L_0x0500
            X.1wy r0 = r8.A1A
            X.AnonymousClass3MY.A1M(r0, r7)
            r6.add(r1)
        L_0x0500:
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x001e
            java.util.Iterator r3 = r6.iterator()
        L_0x050a:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x001e
            X.206 r2 = X.C17880vN.A0Y(r3)
            boolean r1 = r2.A19
            r0 = -1
            if (r1 == 0) goto L_0x051b
            r0 = 22
        L_0x051b:
            r4.BBN(r2, r0)
            goto L_0x050a
        L_0x051f:
            X.2pC r2 = X.C61142pC.A01
            X.1Di r1 = r8.A1J
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            monitor-enter(r2)
            java.util.List r0 = X.C61142pC.A02     // Catch:{ all -> 0x0927 }
            r0.add(r1)     // Catch:{ all -> 0x0927 }
            monitor-exit(r2)
            goto L_0x0500
        L_0x052f:
            r11 = 0
            goto L_0x0492
        L_0x0532:
            java.lang.Object r1 = r14.A02
            com.whatsapp.conversationslist.ConversationsFragment r1 = (com.whatsapp.conversationslist.ConversationsFragment) r1
            boolean r0 = r14.A00
            if (r0 == 0) goto L_0x001e
            com.whatsapp.conversationslist.ConversationsFragment.A0o(r1, r0)
            return
        L_0x053e:
            java.lang.Object r1 = r14.A02
            com.whatsapp.conversationslist.ConversationsFragment r1 = (com.whatsapp.conversationslist.ConversationsFragment) r1
            boolean r0 = r14.A00
            if (r0 == 0) goto L_0x001e
            X.1FL r0 = r1.A1B()
            boolean r0 = X.AnonymousClass11E.A02(r0)
            r2 = 2131892439(0x7f1218d7, float:1.9419626E38)
            if (r0 == 0) goto L_0x0556
            r2 = 2131892440(0x7f1218d8, float:1.9419628E38)
        L_0x0556:
            X.1KB r1 = r1.A0r
            r0 = 0
            r1.A08(r2, r0)
            return
        L_0x055d:
            r0 = 0
            X.C198719yn.A00(r5, r0)
            return
        L_0x0562:
            java.lang.Object r0 = r14.A02
            X.1iW r0 = (X.C33251iW) r0
            boolean r3 = r14.A00
            X.1KB r2 = r0.A03
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Failed to "
            r1.append(r0)
            if (r3 == 0) goto L_0x0580
            java.lang.String r0 = "Keep"
        L_0x0577:
            java.lang.String r1 = X.AnonymousClass000.A0y(r0, r1)
            r0 = 0
            r2.A0G(r1, r0)
            return
        L_0x0580:
            java.lang.String r0 = "undo Keep"
            goto L_0x0577
        L_0x0583:
            java.lang.Object r1 = r14.A02
            com.whatsapp.accountswitching.secondaryprocess.AccountSwitchingActivity r1 = (com.whatsapp.accountswitching.secondaryprocess.AccountSwitchingActivity) r1
            boolean r0 = r14.A00
            com.whatsapp.accountswitching.secondaryprocess.AccountSwitchingActivity.A00(r1, r0)
            return
        L_0x058d:
            java.lang.Object r2 = r14.A02
            android.app.Activity r2 = (android.app.Activity) r2
            boolean r1 = r14.A00
            android.view.Window r0 = r2.getWindow()
            X.C28281Zt.A0A(r0, r1)
            r1 = 2130969366(0x7f040316, float:1.7547412E38)
            r0 = 2131100370(0x7f0602d2, float:1.781312E38)
            int r0 = X.AnonymousClass1YL.A00(r2, r1, r0)
            X.C28281Zt.A05(r2, r0)
            return
        L_0x05a8:
            java.lang.Object r2 = r14.A02
            X.AbC r2 = (X.C20896AbC) r2
            boolean r10 = r14.A00
            X.00H r0 = r2.A05
            java.lang.Object r4 = r0.get()
            X.9hw r4 = (X.C188759hw) r4
            if (r10 == 0) goto L_0x05d8
            java.lang.String r5 = "avatar_creation"
        L_0x05ba:
            X.C18070vi.A0b(r4)
            X.B1v r6 = X.C22292B1v.A00
            r7 = 6
            r8 = 1
            java.util.concurrent.atomic.AtomicBoolean r1 = r4.A0I
            r0 = 0
            r1.set(r0)
            X.10I r0 = r4.A08
            X.7QH r3 = new X.7QH
            r9 = r8
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r0.CGF(r3)
            X.6uS r0 = r2.A02
            r0.A03()
            return
        L_0x05d8:
            java.lang.String r5 = "avatar_update"
            goto L_0x05ba
        L_0x05db:
            java.lang.Object r0 = r14.A02
            X.8gV r0 = (X.C167518gV) r0
            boolean r3 = r14.A00
            com.whatsapp.backup.google.RestoreFromBackupActivity r2 = r0.A01
            boolean r0 = com.whatsapp.backup.google.RestoreFromBackupActivity.A19(r2)
            if (r0 != 0) goto L_0x0602
            android.widget.ProgressBar r1 = r2.A01
            r0 = 100
            r1.setProgress(r0)
            android.widget.ProgressBar r1 = r2.A01
            r0 = 1
            r1.setIndeterminate(r0)
            android.widget.TextView r1 = r2.A03
            r0 = 2131895869(0x7f12263d, float:1.9426583E38)
            r1.setText(r0)
            com.whatsapp.backup.google.RestoreFromBackupActivity.A10(r2, r3)
            return
        L_0x0602:
            java.lang.String r0 = "restore>RestoreFromBackupActivity/observer/activity exited during finishing msgstore download"
            goto L_0x06b0
        L_0x0606:
            java.lang.Object r3 = r14.A02
            X.A2k r3 = (X.A2k) r3
            boolean r2 = r14.A00
            java.util.List r0 = r3.A08
            java.util.Iterator r1 = r0.iterator()
        L_0x0612:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0622
            java.lang.Object r0 = r1.next()
            java.lang.Thread r0 = (java.lang.Thread) r0
            r0.interrupt()
            goto L_0x0612
        L_0x0622:
            java.util.List r0 = r3.A07
            java.util.Iterator r1 = r0.iterator()
        L_0x0628:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0638
            java.lang.Object r0 = r1.next()
            java.lang.Thread r0 = (java.lang.Thread) r0
            r0.interrupt()
            goto L_0x0628
        L_0x0638:
            X.A5O r0 = r3.A03
            r0.A05(r2)
            r0 = 0
            r3.A01 = r0
            r3.A00 = r0
            return
        L_0x0643:
            java.lang.Object r4 = r14.A02
            X.6jo r4 = (X.C130666jo) r4
            boolean r3 = r14.A00
            boolean r0 = r4.A08
            if (r0 == 0) goto L_0x065a
            X.1KB r2 = r4.A01
            android.app.Activity r1 = r4.A00
            boolean r0 = r1 instanceof X.AnonymousClass1FR
            if (r0 == 0) goto L_0x0671
            X.1FR r1 = (X.AnonymousClass1FR) r1
        L_0x0657:
            r2.A0B(r1)
        L_0x065a:
            if (r3 == 0) goto L_0x066b
            X.1Lf r2 = r4.A05
            X.9hX r0 = r4.A04
            com.whatsapp.jid.UserJid r0 = r0.A03
            java.util.List r1 = X.C18070vi.A0M(r0)
            r0 = 12
            X.AnonymousClass35V.A00(r2, r1, r0)
        L_0x066b:
            X.3Kn r0 = r4.A02
            r0.C3p(r3)
            return
        L_0x0671:
            r1 = 0
            goto L_0x0657
        L_0x0673:
            boolean r1 = r14.A00
            java.lang.Object r3 = r14.A02
            androidx.fragment.app.DialogFragment r3 = (androidx.fragment.app.DialogFragment) r3
            r0 = 1
            if (r1 == 0) goto L_0x0698
            X.1D6[] r2 = new X.AnonymousClass1D6[r0]
            java.lang.String r1 = "CUSTOM_TOS_UI_ACCEPT_RESULT_KEY"
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            X.C72463Mc.A1H(r1, r0, r2)
            android.os.Bundle r2 = X.AnonymousClass9O6.A00(r2)
            java.lang.String r1 = "CUSTOM_TOS_UI_REQUEST_KEY"
            X.1GP r0 = r3.A1F()
            r0.A0w(r1, r2)
            r3.A29()
            return
        L_0x0698:
            java.lang.String r0 = "CustomBotTosBottomSheet/onAcceptTosClicked tos accept failed"
            goto L_0x08be
        L_0x069c:
            java.lang.Object r1 = r14.A02
            X.A6b r1 = (X.C20075A6b) r1
            boolean r0 = r14.A00
            r1.A07(r0)
            return
        L_0x06a6:
            java.lang.Object r2 = r14.A02
            X.A6b r2 = (X.C20075A6b) r2
            android.net.ConnectivityManager$NetworkCallback r1 = r2.A00
            if (r1 != 0) goto L_0x06b4
            java.lang.String r0 = "voip/weak-wifi/onUnavailable: network callback is already unregistered"
        L_0x06b0:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x06b4:
            android.net.ConnectivityManager r0 = r2.A04
            r0.unregisterNetworkCallback(r1)
            r0 = 0
            r2.A00 = null
            r2.A01 = r0
            boolean r0 = r14.A00
            com.whatsapp.voipcalling.Voip.notifyFailureToCreateAlternativeSocket(r0)
            return
        L_0x06c5:
            java.lang.Object r1 = r14.A02
            X.Adx r1 = (X.C21067Adx) r1
            boolean r0 = r14.A00
            r1.A0D(r0)
            return
        L_0x06cf:
            java.lang.Object r2 = r14.A02
            X.3RH r2 = (X.AnonymousClass3RH) r2
            boolean r1 = r14.A00
            r0 = 0
            r2.A04 = r0
            X.AnonymousClass3RH.A03(r2, r1)
            return
        L_0x06dc:
            java.lang.Object r3 = r14.A02
            X.A99 r3 = (X.A99) r3
            boolean r2 = r14.A00
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "VoiceService/actionCreateCallLink isVideoCallLink:"
            X.C17900vP.A0n(r0, r1, r2)
            X.1VF r1 = r3.A2C
            X.1VH r0 = X.AnonymousClass1VH.CALL_LINK
            r1.A00(r0)
            r0 = 0
            com.whatsapp.voipcalling.Voip.createCallLink(r2, r0)
            r3.A0V()
            return
        L_0x06fb:
            java.lang.Object r2 = r14.A02
            X.A99 r2 = (X.A99) r2
            boolean r0 = r14.A00
            com.whatsapp.voipcalling.Voip.toggleToHammerheadDev(r0)
            java.util.concurrent.atomic.AtomicInteger r0 = X.A99.A4B
            android.os.Handler r0 = r2.A0H
            r1 = 60
            r0.removeMessages(r1)
            android.os.Handler r0 = r2.A0H
            r0.sendEmptyMessage(r1)
            return
        L_0x0713:
            boolean r2 = r14.A00
            java.lang.Object r1 = r14.A02
            com.whatsapp.jid.DeviceJid r1 = (com.whatsapp.jid.DeviceJid) r1
            java.util.concurrent.atomic.AtomicInteger r0 = X.A99.A4B
            if (r2 == 0) goto L_0x0721
            com.whatsapp.voipcalling.Voip.notifyDeviceIdentityDeleted(r1)
            return
        L_0x0721:
            com.whatsapp.voipcalling.Voip.notifyDeviceIdentityChanged(r1)
            return
        L_0x0725:
            boolean r3 = r14.A00
            java.lang.Object r2 = r14.A02
            X.7DY r2 = (X.AnonymousClass7DY) r2
            r1 = 0
            r0 = 1
            X.AnonymousClass7DY.A0b(r2, r3, r0, r1)
            return
        L_0x0731:
            java.lang.Object r1 = r14.A02
            X.7DY r1 = (X.AnonymousClass7DY) r1
            boolean r0 = r14.A00
            X.AnonymousClass7DY.A0V(r1, r0)
            return
        L_0x073b:
            java.lang.Object r3 = r14.A02
            X.70L r3 = (X.AnonymousClass70L) r3
            boolean r2 = r14.A00
            X.6jd r4 = new X.6jd
            r4.<init>()
            X.6oP r0 = r3.A0E
            android.accounts.Account r1 = r0.A00
            java.lang.Long r5 = r3.A0Q
            if (r5 == 0) goto L_0x0758
            long r8 = r5.longValue()
            r6 = -5
            int r0 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x0762
        L_0x0758:
            if (r1 == 0) goto L_0x0762
            java.lang.String r0 = r1.name
            r4.A01 = r0
            java.lang.String r0 = r1.type
            r4.A02 = r0
        L_0x0762:
            X.71l r1 = r3.A0F
            android.widget.EditText r0 = r1.A04
            java.lang.String r0 = X.C1404471l.A00(r0)
            r4.A04 = r0
            android.widget.EditText r0 = r1.A05
            java.lang.String r0 = X.C1404471l.A00(r0)
            r4.A05 = r0
            X.5xr r0 = r3.A0G
            java.lang.String r0 = r0.A05()
            r4.A06 = r0
            r4.A00 = r5
            boolean r0 = r3.A04
            r4.A07 = r0
            android.widget.EditText r0 = r1.A00
            if (r0 == 0) goto L_0x07aa
            java.lang.String r11 = X.C1404471l.A00(r0)
        L_0x078a:
            r4.A03 = r11
            X.6yv r1 = r3.A0B
            java.lang.String r6 = r4.A01
            java.lang.String r7 = r4.A02
            java.lang.String r8 = r4.A04
            java.lang.String r9 = r4.A05
            java.lang.Long r5 = r4.A00
            java.lang.String r10 = r4.A06
            boolean r12 = r4.A07
            X.6tn r4 = new X.6tn
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            X.7E3 r0 = new X.7E3
            r0.<init>(r3, r2)
            r1.A01(r4, r0)
            return
        L_0x07aa:
            java.lang.String r11 = ""
            goto L_0x078a
        L_0x07ad:
            java.lang.Object r3 = r14.A02
            com.whatsapp.contact.picker.ContactPickerFragment r3 = (com.whatsapp.contact.picker.ContactPickerFragment) r3
            boolean r0 = r14.A00
            if (r0 == 0) goto L_0x07ba
            X.1FL r1 = r3.A1B()
            goto L_0x07da
        L_0x07ba:
            X.4Xm r2 = r3.A1X
            r0 = 0
            X.4fN r1 = new X.4fN
            r1.<init>(r0)
            r0 = 107(0x6b, float:1.5E-43)
            r2.A01(r1, r0)
            r0 = 0
            com.whatsapp.contact.picker.ContactPickerFragment.A0h(r3, r0)
            return
        L_0x07cc:
            java.lang.Object r1 = r14.A02
            X.79i r1 = (X.C1424079i) r1
            boolean r0 = r14.A00
            com.whatsapp.contact.picker.ContactPickerFragment r1 = r1.A00
            if (r0 == 0) goto L_0x07df
            X.1FL r1 = r1.A1B()
        L_0x07da:
            r0 = 1
            X.AnonymousClass4Yv.A01(r1, r0)
            return
        L_0x07df:
            r0 = 0
            com.whatsapp.contact.picker.ContactPickerFragment.A0h(r1, r0)
            return
        L_0x07e4:
            java.lang.Object r4 = r14.A02
            X.3d2 r4 = (X.C74863d2) r4
            boolean r3 = r14.A00
            com.whatsapp.WaEditText r1 = r4.A05
            android.view.View r0 = r4.getContentView()
            android.graphics.Rect r1 = X.C74863d2.A02(r1)
            android.graphics.Rect r0 = X.C74863d2.A02(r0)
            boolean r0 = r1.intersect(r0)
            if (r0 == 0) goto L_0x0816
            X.5YX r2 = r4.A04
            r1 = r2
            com.whatsapp.KeyboardPopupLayout r1 = (com.whatsapp.KeyboardPopupLayout) r1
            r0 = 0
            r1.A09 = r0
            android.view.View r2 = (android.view.View) r2
            r2.requestLayout()
            r1 = 31
            X.7RK r0 = new X.7RK
            r0.<init>((int) r1, (java.lang.Object) r4, (boolean) r3)
            r2.post(r0)
            return
        L_0x0816:
            X.C74863d2.A03(r4, r3)
            return
        L_0x081a:
            java.lang.Object r1 = r14.A02
            X.3rW r1 = (X.AnonymousClass3rW) r1
            boolean r0 = r14.A00
            X.1bI r1 = r1.A04
            int r0 = X.C72453Mb.A07(r0)
            r1.A04(r0)
            return
        L_0x082a:
            java.lang.Object r4 = r14.A02
            X.3uI r4 = (X.C79063uI) r4
            boolean r3 = r14.A00
            X.0ve r2 = r4.A05
            X.C18070vi.A0W(r2)
            X.1Oh r1 = r4.A0H
            X.C18070vi.A0W(r1)
            X.206 r0 = r4.getFMessage()
            java.lang.String r0 = r0.A0P()
            boolean r0 = X.C26180Cu0.A01(r2, r1, r0)
            if (r0 == 0) goto L_0x084c
            r4.setLottieAnimationView(r3)
            return
        L_0x084c:
            r4.A2i()
            return
        L_0x0850:
            java.lang.Object r3 = r14.A02
            X.3uK r3 = (X.AnonymousClass3uK) r3
            boolean r0 = r14.A00
            android.widget.FrameLayout r2 = r3.A0G
            if (r0 == 0) goto L_0x0860
            r0 = 8
            r2.setVisibility(r0)
            return
        L_0x0860:
            r1 = 0
            r2.setVisibility(r1)
            android.widget.ImageView r0 = r3.A0H
            r0.setVisibility(r1)
            return
        L_0x086a:
            java.lang.Object r1 = r14.A02
            X.BqW r1 = (X.C23819BqW) r1
            boolean r0 = r14.A00
            X.C23819BqW.A02(r1, r0)
            return
        L_0x0874:
            java.lang.Object r1 = r14.A02
            X.4aY r1 = (X.AnonymousClass4aY) r1
            boolean r0 = r14.A00
            if (r0 == 0) goto L_0x0883
            X.AnonymousClass4aY.A0i(r1)
        L_0x087f:
            r0 = 0
            r1.A06 = r0
            return
        L_0x0883:
            r0 = 1
            X.AnonymousClass4aY.A1h(r1, r0)
            goto L_0x087f
        L_0x0888:
            java.lang.Object r1 = r14.A02
            com.whatsapp.conversation.selection.SingleSelectedMessageActivity r1 = (com.whatsapp.conversation.selection.SingleSelectedMessageActivity) r1
            boolean r0 = r14.A00
            com.whatsapp.conversation.selection.SingleSelectedMessageActivity.A03(r1, r0)
            return
        L_0x0892:
            java.lang.Object r1 = r14.A02
            X.AVl r1 = (X.C20705AVl) r1
            r0 = 1
            X.C20705AVl.A03(r1, r0)
            return
        L_0x089b:
            java.lang.Object r0 = r14.A02
            X.2Bu r0 = (X.C45822Bu) r0
            boolean r1 = r14.A00
            com.whatsapp.conversationslist.ConversationsFragment r0 = r0.A04
            android.widget.ImageView r0 = r0.A0I
            android.view.animation.Animation r2 = r0.getAnimation()
            boolean r0 = r2 instanceof X.C110065es
            if (r0 != 0) goto L_0x08c7
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "conversations-gdrive-observer/set-message/unexpected-animation-class: "
            r1.append(r0)
            if (r2 != 0) goto L_0x08c2
            java.lang.String r0 = "null"
        L_0x08ba:
            java.lang.String r0 = X.C17890vO.A0V(r0, r1)
        L_0x08be:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x08c2:
            java.lang.Class r0 = r2.getClass()
            goto L_0x08ba
        L_0x08c7:
            X.5es r2 = (X.C110065es) r2
            if (r1 == 0) goto L_0x08cf
            r0 = 0
        L_0x08cc:
            r2.A01 = r0
            return
        L_0x08cf:
            r0 = 0
            r2.A00 = r0
            r0 = 1
            goto L_0x08cc
        L_0x08d5:
            X.C18070vi.A11(r3)
            goto L_0x093a
        L_0x08d9:
            X.C18070vi.A11(r8)
            goto L_0x093a
        L_0x08dd:
            java.lang.String r0 = "containerAvatarSheet"
            goto L_0x0937
        L_0x08e0:
            java.lang.String r0 = "coordinatorLayout"
            goto L_0x0937
        L_0x08e3:
            X.1eh r1 = r3.A05
            if (r1 == 0) goto L_0x090f
            r0 = 0
            r1.A06(r0)
            android.widget.TextView r1 = r3.A01
            if (r1 == 0) goto L_0x08f5
            r0 = 2131897207(0x7f122b77, float:1.9429297E38)
            r1.setText(r0)
        L_0x08f5:
            com.whatsapp.CodeInputField r1 = r3.A02
            if (r1 == 0) goto L_0x08fe
            java.lang.String r0 = ""
            r1.setCode(r0)
        L_0x08fe:
            com.whatsapp.authentication.VerifyTwoFactorAuthCodeDialogFragment.A01(r3, r2)
            X.1KB r2 = r3.A2H()
            r1 = 0
            X.AkO r0 = new X.AkO
            r0.<init>((java.lang.Object) r3, (int) r1)
            r2.A0J(r0)
            return
        L_0x090f:
            java.lang.String r0 = "twoFactorAuthManager"
            goto L_0x0937
        L_0x0912:
            r0 = 0
            java.lang.System.exit(r0)
            return
        L_0x0917:
            java.lang.Integer r10 = X.C17880vN.A0l()
            if (r12 == 0) goto L_0x0924
            X.6RD r9 = X.AnonymousClass6RD.META_AI_SHORTCUT_TOS
        L_0x091f:
            r7 = r2
            X.AnonymousClass73Z.A00(r7, r8, r9, r10, r11, r12)
            return
        L_0x0924:
            X.6RD r9 = X.AnonymousClass6RD.AI_STUDIO_TOS
            goto L_0x091f
        L_0x0927:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x092a:
            java.lang.Object r0 = r14.A02
            X.7DY r0 = (X.AnonymousClass7DY) r0
            boolean r2 = r14.A00
            r1 = 0
            X.6pV r0 = r0.A0S
            if (r0 != 0) goto L_0x093c
            java.lang.String r0 = "overlaysController"
        L_0x0937:
            X.C18070vi.A11(r0)
        L_0x093a:
            r0 = 0
            throw r0
        L_0x093c:
            r0.A01(r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7RK.run():void");
    }

    public AnonymousClass7RK(int i, Object obj, boolean z) {
        this.A01 = i;
        this.A02 = obj;
        this.A00 = z;
    }

    public AnonymousClass7RK(Runnable runnable) {
        this.A01 = 2;
        this.A02 = runnable;
    }

    public AnonymousClass7RK(C20705AVl aVl) {
        this.A01 = 44;
        this.A02 = aVl;
        this.A00 = true;
    }
}
