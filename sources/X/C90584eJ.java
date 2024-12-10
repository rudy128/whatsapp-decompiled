package X;

import android.view.ViewTreeObserver;

/* renamed from: X.4eJ  reason: invalid class name and case insensitive filesystem */
public class C90584eJ implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int A00;
    public final Object A01;

    public C90584eJ(AnonymousClass4aY r1, int i) {
        this.A00 = i;
        if (20 - i != 0) {
            this.A01 = r1;
        } else {
            this.A01 = r1;
        }
    }

    public static void A00(ViewTreeObserver viewTreeObserver, Object obj, int i) {
        viewTreeObserver.addOnGlobalLayoutListener(new C90584eJ(obj, i));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v96, resolved type: X.3Zj} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v145, resolved type: X.3rm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v167, resolved type: X.3Zj} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v168, resolved type: X.3Zj} */
    /* JADX WARNING: type inference failed for: r5v10, types: [X.BCQ, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0289, code lost:
        r0.removeOnGlobalLayoutListener(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x028c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x03ef, code lost:
        if (r0 != false) goto L_0x03f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x046d, code lost:
        X.C18070vi.A11(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x0471, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        if (r1.A03.isShowing() != false) goto L_0x001d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x020b, code lost:
        if (X.C72473Md.A08(r2) == 2) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0227, code lost:
        r5.post(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x022a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0242, code lost:
        r0 = r0.getViewTreeObserver();
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onGlobalLayout() {
        /*
            r18 = this;
            r4 = r18
            int r0 = r4.A00
            switch(r0) {
                case 0: goto L_0x00ad;
                case 1: goto L_0x00c5;
                case 2: goto L_0x00f3;
                case 3: goto L_0x0123;
                case 4: goto L_0x028d;
                case 5: goto L_0x02bd;
                case 6: goto L_0x02f2;
                case 7: goto L_0x02fa;
                case 8: goto L_0x0311;
                case 9: goto L_0x0049;
                case 10: goto L_0x01a0;
                case 11: goto L_0x0319;
                case 12: goto L_0x035e;
                case 13: goto L_0x0397;
                case 14: goto L_0x03d5;
                case 15: goto L_0x01c8;
                case 16: goto L_0x03fb;
                case 17: goto L_0x00a1;
                case 18: goto L_0x0430;
                case 19: goto L_0x0446;
                case 20: goto L_0x01f0;
                case 21: goto L_0x0213;
                case 22: goto L_0x022b;
                case 23: goto L_0x0463;
                case 24: goto L_0x0479;
                case 25: goto L_0x0489;
                case 26: goto L_0x0247;
                case 27: goto L_0x049d;
                case 28: goto L_0x04a8;
                case 29: goto L_0x0262;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r1 = r4.A01
            X.4P4 r1 = (X.AnonymousClass4P4) r1
            android.view.View r4 = r1.A00
            boolean r0 = X.AnonymousClass1L4.A00(r4)
            r3 = 0
            if (r0 != 0) goto L_0x001d
            X.3d3 r0 = r1.A03
            boolean r0 = r0.isShowing()
            r2 = 0
            if (r0 == 0) goto L_0x001e
        L_0x001d:
            r2 = 1
        L_0x001e:
            r0 = 2131431972(0x7f0b1224, float:1.8485688E38)
            android.view.View r1 = r4.findViewById(r0)
            int r0 = X.C72453Mb.A0J(r2)
            r1.setVisibility(r0)
            r0 = 2131430328(0x7f0b0bb8, float:1.8482354E38)
            android.view.View r1 = r4.findViewById(r0)
            int r0 = X.C72453Mb.A0J(r2)
            r1.setVisibility(r0)
            r0 = 2131431973(0x7f0b1225, float:1.848569E38)
            android.view.View r0 = r4.findViewById(r0)
            if (r2 == 0) goto L_0x0045
            r3 = 8
        L_0x0045:
            r0.setVisibility(r3)
        L_0x0048:
            return
        L_0x0049:
            java.lang.Object r3 = r4.A01
            X.3oH r3 = (X.C76783oH) r3
            r3.A0B()
            android.widget.ListView r0 = r3.A0J
            X.AnonymousClass3MY.A1D(r0, r4)
            int r1 = r3.getWidth()
            int r0 = r3.getHeight()
            if (r1 <= r0) goto L_0x0078
            boolean r0 = r3.A0Z
            if (r0 != 0) goto L_0x0078
            android.app.Activity r0 = X.AnonymousClass3Ma.A05(r3)
            X.1FL r0 = (X.AnonymousClass1FL) r0
            r0.A2Z()
            android.widget.ListView r2 = r3.A0J
            r1 = 3
            X.2vK r0 = new X.2vK
            r0.<init>(r3, r1)
            r2.setOnScrollListener(r0)
            return
        L_0x0078:
            int r0 = r3.getMeasuredWidth()
            int r2 = r3.A08(r0)
            int r0 = r3.getMeasuredWidth()
            int r0 = r3.A07(r0)
            int r2 = r2 - r0
            r3.A08 = r2
            android.widget.ListView r1 = r3.A0J
            r0 = 0
            r1.setSelectionFromTop(r0, r2)
            int r0 = r3.A08
            r3.setScrollPos(r0)
            android.widget.ListView r5 = r3.A0J
            r0 = 42
            X.7R9 r1 = new X.7R9
            r1.<init>((X.C76783oH) r3, (int) r0)
            goto L_0x0227
        L_0x00a1:
            java.lang.Object r0 = r4.A01
            X.3rm r0 = (X.C77913rm) r0
            X.C77913rm.A03(r0)
            r0.A06()
            goto L_0x0242
        L_0x00ad:
            java.lang.Object r1 = r4.A01
            com.whatsapp.ConversationFragment r1 = (com.whatsapp.ConversationFragment) r1
            X.3tk r0 = r1.A02
            X.AnonymousClass3MY.A1D(r0, r4)
            X.3tk r2 = r1.A02
            r1 = 1
            X.1FY r0 = r2.getWaBaseActivity()
            if (r0 == 0) goto L_0x0048
            X.4aY r0 = r2.A04
            r0.A3E(r1)
            return
        L_0x00c5:
            java.lang.Object r3 = r4.A01
            X.4aN r3 = (X.AnonymousClass4aN) r3
            int r0 = X.AnonymousClass4aN.A0X
            androidx.viewpager.widget.ViewPager r0 = r3.A0J
            int r2 = r0.getWidth()
            android.content.res.Resources r1 = X.AnonymousClass000.A0Y(r0)
            r0 = 2131166635(0x7f0705ab, float:1.794752E38)
            int r0 = r1.getDimensionPixelSize(r0)
            int r2 = r2 / r0
            int r0 = r3.A01
            if (r0 == r2) goto L_0x0048
            r3.A01 = r2
            X.3Oo[] r3 = r3.A0O
            int r2 = r3.length
            r1 = 0
        L_0x00e7:
            if (r1 >= r2) goto L_0x0048
            r0 = r3[r1]
            if (r0 == 0) goto L_0x00f0
            r0.notifyDataSetChanged()
        L_0x00f0:
            int r1 = r1 + 1
            goto L_0x00e7
        L_0x00f3:
            java.lang.Object r5 = r4.A01
            X.1Fh r5 = (X.C23251Fh) r5
            X.17T r4 = r5.A06
            if (r4 == 0) goto L_0x0048
            boolean r0 = r5.A09
            r3 = 1
            if (r0 == 0) goto L_0x010d
            r2 = 1
        L_0x0101:
            X.17U r4 = (X.AnonymousClass17U) r4
            r4.A03 = r2
            X.3M7 r0 = r4.A00
            if (r0 == 0) goto L_0x0048
            r0.setShouldHideCallDuration(r2)
            return
        L_0x010d:
            android.view.View r1 = r5.A04
            r2 = 0
            if (r1 == 0) goto L_0x0101
            int r0 = r5.A00
            android.view.View r0 = r1.findViewById(r0)
            if (r0 == 0) goto L_0x0101
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L_0x0121
            r3 = 0
        L_0x0121:
            r2 = r3
            goto L_0x0101
        L_0x0123:
            java.lang.Object r6 = r4.A01
            X.4i3 r6 = (X.C92874i3) r6
            X.3oH r5 = r6.A0m
            X.AnonymousClass3MY.A1D(r5, r4)
            X.AEW r0 = r6.A0G
            int r4 = r5.getMeasuredWidth()
            if (r0 == 0) goto L_0x04c4
            X.AEA r3 = r0.A05
            if (r3 == 0) goto L_0x04c4
            X.4hw r0 = r6.A0I
            if (r0 == 0) goto L_0x0153
            X.AEA r0 = r0.A01
            java.lang.String r1 = r0.A00
            java.lang.String r0 = r3.A00
            boolean r0 = X.C42171xk.A00(r1, r0)
            if (r0 != 0) goto L_0x0048
            X.4PD r0 = r6.A13
            X.4hw r1 = r6.A0I
            X.5vC r0 = r0.A00
            if (r0 == 0) goto L_0x0153
            r0.A02(r1)
        L_0x0153:
            X.4Kg r2 = new X.4Kg
            r2.<init>(r6)
            int r0 = r5.A08(r4)
            X.4hw r1 = new X.4hw
            r1.<init>(r2, r3, r4, r0)
            r6.A0I = r1
            X.4PD r0 = r6.A13
            X.5vC r2 = r0.A00
            if (r2 != 0) goto L_0x019b
            X.118 r2 = r0.A04
            android.content.Context r2 = r2.A00
            java.io.File r3 = r2.getCacheDir()
            java.lang.String r2 = "cover_photos"
            java.io.File r13 = X.C17880vN.A0e(r3, r2)
            X.4hs r5 = new X.4hs
            r5.<init>()
            X.11P r6 = r0.A03
            X.0ve r7 = r0.A05
            X.1KB r3 = r0.A01
            X.10I r11 = r0.A09
            X.181 r4 = r0.A02
            X.18K r8 = r0.A06
            com.whatsapp.wamsys.JniBridge r12 = r0.A0A
            X.1Kg r10 = r0.A08
            X.1Kb r9 = r0.A07
            java.lang.String r14 = "cover-photo-loader"
            r16 = 16777216(0x1000000, double:8.289046E-317)
            r15 = 1
            X.5vC r2 = new X.5vC
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r0.A00 = r2
        L_0x019b:
            r0 = 1
            r2.A03(r1, r0)
            return
        L_0x01a0:
            java.lang.Object r3 = r4.A01
            X.3oH r3 = (X.C76783oH) r3
            android.widget.ListView r0 = r3.A0J
            X.AnonymousClass3MY.A1D(r0, r4)
            boolean r0 = r3.A0a
            if (r0 != 0) goto L_0x0048
            int r0 = r3.getMeasuredWidth()
            int r2 = r3.A08(r0)
            int r0 = r3.getMeasuredWidth()
            int r0 = r3.A07(r0)
            int r2 = r2 - r0
            android.widget.ListView r1 = r3.A0J
            r0 = 0
            r1.setSelectionFromTop(r0, r2)
            r3.setScrollPos(r2)
            return
        L_0x01c8:
            r0 = 2
            int[] r3 = new int[r0]
            java.lang.Object r2 = r4.A01
            X.3RS r2 = (X.AnonymousClass3RS) r2
            android.view.View r5 = r2.A04
            r5.getLocationOnScreen(r3)
            boolean r0 = r2.isShowing()
            if (r0 != 0) goto L_0x01de
            X.AnonymousClass3RS.A03(r2)
            return
        L_0x01de:
            int r1 = r2.A01
            r0 = 0
            r0 = r3[r0]
            if (r1 == r0) goto L_0x0048
            X.AnonymousClass3RS.A03(r2)
            r0 = 41
            X.3Bp r1 = new X.3Bp
            r1.<init>(r4, r0)
            goto L_0x0227
        L_0x01f0:
            java.lang.Object r2 = r4.A01
            X.4aY r2 = (X.AnonymousClass4aY) r2
            X.5cQ r1 = r2.A2Q
            r0 = 2131434265(0x7f0b1b19, float:1.849034E38)
            android.view.View r3 = r1.findViewById(r0)
            if (r3 == 0) goto L_0x0048
            boolean r0 = X.C72463Mc.A1R(r2)
            if (r0 != 0) goto L_0x020d
            int r2 = X.C72473Md.A08(r2)
            r1 = 2
            r0 = 0
            if (r2 != r1) goto L_0x020f
        L_0x020d:
            r0 = 8
        L_0x020f:
            r3.setVisibility(r0)
            return
        L_0x0213:
            java.lang.Object r1 = r4.A01
            X.4aY r1 = (X.AnonymousClass4aY) r1
            android.view.View r0 = r1.A0G
            X.AnonymousClass3MY.A1D(r0, r4)
            com.whatsapp.expressionstray.ExpressionsTrayView r5 = r1.A3D
            if (r5 == 0) goto L_0x0048
            r0 = 42
            X.4rj r1 = new X.4rj
            r1.<init>((java.lang.Object) r4, (int) r0)
        L_0x0227:
            r5.post(r1)
            return
        L_0x022b:
            java.lang.Object r3 = r4.A01
            X.4VR r3 = (X.AnonymousClass4VR) r3
            X.4TX r2 = r3.A0S
            if (r2 == 0) goto L_0x0048
            X.3Zj r0 = r3.A0A
            if (r0 == 0) goto L_0x0048
            java.lang.String r1 = "ice_breaker_recycler_view_render_complete"
            r2.A00(r1)
            r0 = 2
            r2.A02(r1, r0)
            X.3Zj r0 = r3.A0A
        L_0x0242:
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            goto L_0x0289
        L_0x0247:
            java.lang.Object r5 = r4.A01
            X.3RR r5 = (X.AnonymousClass3RR) r5
            X.5YX r3 = r5.A04
            android.view.View r3 = (android.view.View) r3
            X.AnonymousClass3MY.A1D(r3, r4)
            boolean r0 = r5.isShowing()
            if (r0 != 0) goto L_0x0048
            r2 = 0
            r1 = 1000000(0xf4240, float:1.401298E-39)
            r0 = 48
            r5.showAtLocation(r3, r0, r2, r1)
            return
        L_0x0262:
            java.lang.Object r2 = r4.A01
            X.05w r2 = (X.C010105w) r2
            X.0QH r0 = r2.A00
            android.widget.Button r1 = r0.A0H
            if (r1 == 0) goto L_0x0048
            boolean r0 = r1 instanceof com.whatsapp.wds.components.button.WDSButton
            if (r0 == 0) goto L_0x0277
            com.whatsapp.wds.components.button.WDSButton r1 = (com.whatsapp.wds.components.button.WDSButton) r1
            X.4DG r0 = X.AnonymousClass4DG.DESTRUCTIVE
            r1.setAction(r0)
        L_0x0277:
            android.view.Window r0 = r2.getWindow()
            if (r0 == 0) goto L_0x0048
            android.view.View r0 = r0.getDecorView()
            if (r0 == 0) goto L_0x0048
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            if (r0 == 0) goto L_0x0048
        L_0x0289:
            r0.removeOnGlobalLayoutListener(r4)
            return
        L_0x028d:
            java.lang.Object r5 = r4.A01
            X.4Qv r5 = (X.C86234Qv) r5
            android.view.View r2 = r5.A01
            X.AnonymousClass3MY.A1D(r2, r4)
            android.widget.LinearLayout r4 = r5.A02
            int r1 = r4.getHeight()
            int r0 = r4.getWidth()
            r3 = 0
            if (r1 <= r0) goto L_0x02a4
            r3 = 1
        L_0x02a4:
            int r2 = r2.getHeight()
            androidx.recyclerview.widget.RecyclerView r0 = r5.A03
            int r1 = r0.getHeight()
            int r0 = r4.getHeight()
            if (r3 != 0) goto L_0x02b5
            int r0 = r0 - r1
        L_0x02b5:
            int r2 = r2 - r0
            int r0 = r2 / 2
            float r0 = (float) r0
            r4.setTranslationY(r0)
            return
        L_0x02bd:
            java.lang.Object r1 = r4.A01
            com.whatsapp.bot.metaai.imagineme.ImagineMeRetakePhotoNuxBottomSheet r1 = (com.whatsapp.bot.metaai.imagineme.ImagineMeRetakePhotoNuxBottomSheet) r1
            androidx.appcompat.widget.LinearLayoutCompat r0 = r1.A00
            if (r0 == 0) goto L_0x02ce
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            if (r0 == 0) goto L_0x02ce
            r0.removeOnGlobalLayoutListener(r4)
        L_0x02ce:
            X.00H r0 = r1.A01
            if (r0 == 0) goto L_0x02ee
            java.lang.Object r0 = r0.get()
            X.1rn r0 = (X.C38731rn) r0
            X.0vl r0 = r0.A01
            android.content.SharedPreferences$Editor r2 = X.C17890vO.A0A(r0)
            android.content.SharedPreferences r0 = X.C17880vN.A0C(r0)
            java.lang.String r1 = "imagine_me_retake_nux_seen"
            int r0 = X.C17890vO.A00(r0, r1)
            int r0 = r0 + 1
            X.C17880vN.A1C(r2, r1, r0)
            return
        L_0x02ee:
            java.lang.String r0 = "metaAiSharedPreferences"
            goto L_0x046d
        L_0x02f2:
            java.lang.Object r0 = r4.A01
            com.whatsapp.calling.callhistory.CallLogActivity r0 = (com.whatsapp.calling.callhistory.CallLogActivity) r0
            com.whatsapp.calling.callhistory.CallLogActivity.A0V(r0)
            return
        L_0x02fa:
            java.lang.Object r2 = r4.A01
            com.whatsapp.calling.callhistory.group.GroupCallParticipantPickerSheet r2 = (com.whatsapp.calling.callhistory.group.GroupCallParticipantPickerSheet) r2
            android.view.View r0 = r2.A03
            X.AnonymousClass3MY.A1D(r0, r4)
            boolean r0 = r2.A06
            if (r0 != 0) goto L_0x030d
            com.google.android.material.bottomsheet.BottomSheetBehavior r1 = r2.A05
            r0 = 4
            r1.A0W(r0)
        L_0x030d:
            r0 = 0
            r2.A06 = r0
            return
        L_0x0311:
            java.lang.Object r0 = r4.A01
            com.whatsapp.chatinfo.ListChatInfoActivity r0 = (com.whatsapp.chatinfo.ListChatInfoActivity) r0
            com.whatsapp.chatinfo.ListChatInfoActivity.A0z(r0)
            return
        L_0x0319:
            java.lang.Object r3 = r4.A01
            com.whatsapp.chatinfo.view.custom.CollapsingProfilePhotoView r3 = (com.whatsapp.chatinfo.view.custom.CollapsingProfilePhotoView) r3
            com.whatsapp.wds.components.profilephoto.WDSProfilePhoto r0 = r3.A09
            X.AnonymousClass3MY.A1D(r0, r4)
            r0 = 0
            r3.A0B = r0
            int r0 = r3.getWidth()
            r3.A02 = r0
            com.whatsapp.wds.components.profilephoto.WDSProfilePhoto r0 = r3.A09
            int r1 = r0.getLeft()
            r3.A05 = r1
            int r0 = r3.A0E
            int r1 = r1 - r0
            r3.A03 = r1
            int r1 = r3.A06
            int r0 = r3.A01
            r3.A02(r1, r0)
            com.whatsapp.wds.components.profilephoto.WDSProfilePhoto r0 = r3.A09
            int r2 = r0.getWidth()
            com.whatsapp.wds.components.profilephoto.WDSProfilePhoto r0 = r3.A09
            int r0 = r0.getHeight()
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            r1.<init>(r2, r0)
            r0 = 17
            r1.gravity = r0
            android.widget.ImageView r0 = r3.A07
            r0.setLayoutParams(r1)
            r0 = 0
            r3.setAnimationValue(r0)
            return
        L_0x035e:
            java.lang.Object r2 = r4.A01
            com.whatsapp.community.CommunityHomeActivity r2 = (com.whatsapp.community.CommunityHomeActivity) r2
            com.whatsapp.TextEmojiLabel r0 = r2.A0M
            X.AnonymousClass3MY.A1D(r0, r4)
            X.01n r1 = r2.getSupportActionBar()
            com.google.android.material.appbar.AppBarLayout r0 = r2.A0F
            X.0vb r10 = r2.A00
            android.widget.ImageView r5 = r2.A08
            com.whatsapp.TextEmojiLabel r8 = r2.A0M
            com.whatsapp.TextEmojiLabel r9 = r2.A0L
            android.widget.TextView r6 = r2.A0B
            android.widget.TextView r7 = r2.A0A
            X.C72483Me.A0e(r2, r1)
            r1.A0G()
            android.view.View r4 = r1.A0B()
            X.C17960vV.A05(r4)
            X.Bq9 r3 = new X.Bq9
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r0.A03(r3)
            r2.A0N = r3
            X.1DT r1 = r3.A08
            r0 = 7
            X.C91584fv.A00(r2, r1, r0)
            return
        L_0x0397:
            java.lang.Object r4 = r4.A01
            X.3pI r4 = (X.C77063pI) r4
            android.view.View r0 = r4.A02
            boolean r3 = X.AnonymousClass1L4.A00(r0)
            int r1 = X.C72453Mb.A08(r4)
            r2 = 1
            r0 = 2
            boolean r0 = X.AnonymousClass000.A1T(r1, r0)
            X.01n r1 = r4.getSupportActionBar()
            if (r3 == 0) goto L_0x03ca
            if (r0 == 0) goto L_0x03ca
            X.1YQ r0 = r4.A05
            r0.A04(r2)
            if (r1 == 0) goto L_0x03bd
            r1.A0E()
        L_0x03bd:
            int r0 = r4.A00
            if (r0 != 0) goto L_0x03c7
            com.whatsapp.WaEditText r0 = r4.A07
        L_0x03c3:
            r0.requestFocus()
            return
        L_0x03c7:
            com.whatsapp.WaEditText r0 = r4.A08
            goto L_0x03c3
        L_0x03ca:
            X.1YQ r0 = r4.A05
            r0.A05(r2)
            if (r1 == 0) goto L_0x03bd
            r1.A0I()
            goto L_0x03bd
        L_0x03d5:
            java.lang.Object r3 = r4.A01
            com.whatsapp.companiondevice.optin.ui.ForcedOptInActivity r3 = (com.whatsapp.companiondevice.optin.ui.ForcedOptInActivity) r3
            android.widget.ScrollView r0 = r3.A02
            boolean r0 = X.AnonymousClass4W3.A01(r0)
            r2 = 0
            if (r0 == 0) goto L_0x03f1
            android.widget.ScrollView r1 = r3.A02
            X.C18070vi.A0d(r1, r2)
            r0 = 1
            boolean r0 = r1.canScrollVertically(r0)
            r0 = r0 ^ 1
            r1 = 1
            if (r0 == 0) goto L_0x03f2
        L_0x03f1:
            r1 = 0
        L_0x03f2:
            android.view.View r0 = r3.A01
            if (r1 != 0) goto L_0x03f7
            r2 = 4
        L_0x03f7:
            r0.setVisibility(r2)
            return
        L_0x03fb:
            java.lang.Object r0 = r4.A01
            X.3RS r0 = (X.AnonymousClass3RS) r0
            com.whatsapp.components.CircularRevealView r5 = r0.A07
            X.AnonymousClass3MY.A1D(r5, r4)
            X.AnonymousClass3RS.A04(r0)
            r0 = 0
            r5.setVisibility(r0)
            int r1 = r5.getWidth()
            int r0 = r5.getHeight()
            int r0 = java.lang.Math.max(r1, r0)
            int r3 = r5.A00
            int r2 = r5.A01
            r1 = 0
            float r0 = (float) r0
            android.animation.Animator r2 = android.view.ViewAnimationUtils.createCircularReveal(r5, r3, r2, r1, r0)
            int r0 = r5.A02
            long r0 = (long) r0
            r2.setDuration(r0)
            android.animation.Animator$AnimatorListener r0 = r5.A06
            r2.addListener(r0)
            r2.start()
            return
        L_0x0430:
            java.lang.Object r1 = r4.A01
            X.3c1 r1 = (X.C74603c1) r1
            java.lang.Object r0 = r1.A01
            android.view.View r0 = (android.view.View) r0
            X.AnonymousClass3MY.A1D(r0, r4)
            java.lang.Object r1 = r1.A02
            X.3NI r1 = (X.AnonymousClass3NI) r1
            r0 = -1
            r1.A00 = r0
            r1.invalidateSelf()
            return
        L_0x0446:
            java.lang.Object r1 = r4.A01
            com.whatsapp.conversation.conversationrow.message.MessageDetailsActivity r1 = (com.whatsapp.conversation.conversationrow.message.MessageDetailsActivity) r1
            android.widget.ListView r0 = r1.A02
            X.AnonymousClass3MY.A1D(r0, r4)
            android.widget.ListView r2 = r1.A02
            android.content.res.Resources r1 = r1.getResources()
            r0 = 2131165186(0x7f070002, float:1.7944582E38)
            int r0 = r1.getDimensionPixelSize(r0)
            int r1 = r0 * 3
            r0 = 1
            r2.setSelectionFromTop(r0, r1)
            return
        L_0x0463:
            java.lang.Object r1 = r4.A01
            com.whatsapp.greenalert.GreenAlertActivity r1 = (com.whatsapp.greenalert.GreenAlertActivity) r1
            com.whatsapp.WaViewPager r0 = r1.A02
            if (r0 != 0) goto L_0x0472
            java.lang.String r0 = "viewPager"
        L_0x046d:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x0472:
            X.AnonymousClass3MY.A1D(r0, r4)
            com.whatsapp.greenalert.GreenAlertActivity.A0Q(r1)
            return
        L_0x0479:
            java.lang.Object r1 = r4.A01
            com.whatsapp.group.GroupAdminPickerActivity r1 = (com.whatsapp.group.GroupAdminPickerActivity) r1
            android.view.View r0 = r1.A01
            X.AnonymousClass3MY.A1D(r0, r4)
            com.google.android.material.bottomsheet.BottomSheetBehavior r1 = r1.A03
            r0 = 3
            r1.A0W(r0)
            return
        L_0x0489:
            java.lang.Object r1 = r4.A01
            com.whatsapp.group.GroupProfileEmojiEditor r1 = (com.whatsapp.group.GroupProfileEmojiEditor) r1
            com.whatsapp.KeyboardPopupLayout r0 = r1.A06
            X.AnonymousClass3MY.A1D(r0, r4)
            X.4n1 r0 = r1.A0B
            X.5z4 r0 = r0.A05
            X.C17960vV.A07(r0)
            r0.A0D()
            return
        L_0x049d:
            java.lang.Object r0 = r4.A01
            android.view.View r0 = (android.view.View) r0
            X.AnonymousClass3MY.A1D(r0, r4)
            r0.requestLayout()
            return
        L_0x04a8:
            java.lang.Object r2 = r4.A01
            com.whatsapp.privacy.usernotice.UserNoticeBottomSheetDialogFragment r2 = (com.whatsapp.privacy.usernotice.UserNoticeBottomSheetDialogFragment) r2
            androidx.core.widget.NestedScrollView r0 = r2.A03
            if (r0 == 0) goto L_0x04b9
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            if (r0 == 0) goto L_0x04b9
            r0.removeOnGlobalLayoutListener(r4)
        L_0x04b9:
            boolean r0 = com.whatsapp.privacy.usernotice.UserNoticeBottomSheetDialogFragment.A03(r2)
            r1 = r0 ^ 1
            r0 = 0
            com.whatsapp.privacy.usernotice.UserNoticeBottomSheetDialogFragment.A02(r2, r1, r0)
            return
        L_0x04c4:
            r0 = 0
            r5.A0G(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90584eJ.onGlobalLayout():void");
    }

    public C90584eJ(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}
