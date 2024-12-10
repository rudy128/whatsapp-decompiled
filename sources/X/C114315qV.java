package X;

import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: X.5qV  reason: invalid class name and case insensitive filesystem */
public class C114315qV extends C6X {
    public final int A00;
    public final Object A01;

    public C114315qV(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(BottomSheetBehavior bottomSheetBehavior, Object obj, int i) {
        bottomSheetBehavior.A0a(new C114315qV(obj, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0051, code lost:
        if (r4.A0J == 4) goto L_0x0053;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(android.view.View r10, float r11) {
        /*
            r9 = this;
            int r0 = r9.A00
            switch(r0) {
                case 4: goto L_0x00fb;
                case 5: goto L_0x0005;
                case 6: goto L_0x00e3;
                case 7: goto L_0x0200;
                case 8: goto L_0x0005;
                case 9: goto L_0x01c6;
                case 10: goto L_0x01b0;
                case 11: goto L_0x0041;
                case 12: goto L_0x0027;
                case 13: goto L_0x0006;
                case 14: goto L_0x0130;
                default: goto L_0x0005;
            }
        L_0x0005:
            return
        L_0x0006:
            r0 = 1056964608(0x3f000000, float:0.5)
            int r0 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0005
            java.lang.Object r1 = r9.A01
            com.whatsapp.status.playback.MessageReplyActivity r1 = (com.whatsapp.status.playback.MessageReplyActivity) r1
            boolean r0 = r1.Bed()
            if (r0 != 0) goto L_0x0005
            boolean r0 = r1.Bed()
            if (r0 != 0) goto L_0x0020
            r0 = 2
            r1.A4b(r0)
        L_0x0020:
            com.whatsapp.status.playback.MessageReplyActivity.A0z(r1)
            com.whatsapp.status.playback.MessageReplyActivity.A0w(r1)
            return
        L_0x0027:
            r0 = 0
            X.C18070vi.A0d(r10, r0)
            java.lang.Object r0 = r9.A01
            com.whatsapp.status.audienceselector.sharesheet.StatusAudienceSelectorShareSheetFragment r0 = (com.whatsapp.status.audienceselector.sharesheet.StatusAudienceSelectorShareSheetFragment) r0
            java.lang.ref.WeakReference r0 = r0.A0P
            java.lang.Object r1 = r0.get()
            X.8AT r1 = (X.AnonymousClass8AT) r1
            if (r1 == 0) goto L_0x0005
            int r0 = r10.getTop()
            r1.C6f(r0)
            return
        L_0x0041:
            r5 = 0
            X.C18070vi.A0d(r10, r5)
            java.lang.Object r3 = r9.A01
            X.740 r3 = (X.AnonymousClass740) r3
            com.google.android.material.bottomsheet.BottomSheetBehavior r4 = r3.A0A
            if (r4 == 0) goto L_0x0053
            int r2 = r4.A0J
            r1 = 4
            r0 = 0
            if (r2 != r1) goto L_0x0054
        L_0x0053:
            r0 = 1
        L_0x0054:
            r2 = 1
            if (r0 == 0) goto L_0x00b3
            boolean r0 = r3.A0G
            if (r0 == 0) goto L_0x00b3
            r9.A03(r10, r2)
            r3.A0G = r5
        L_0x0060:
            X.77n r0 = r3.A0W
            com.whatsapp.mediacomposer.MediaComposerFragment r0 = r0.A01
            X.8Ai r0 = r0.A29()
            if (r0 == 0) goto L_0x006d
            r0.BuZ(r11)
        L_0x006d:
            androidx.recyclerview.widget.RecyclerView r0 = r3.A0S
            X.1qy r7 = r0.getLayoutManager()
            androidx.recyclerview.widget.LinearLayoutManager r7 = (androidx.recyclerview.widget.LinearLayoutManager) r7
            if (r7 == 0) goto L_0x00c4
            r6 = 1051931443(0x3eb33333, float:0.35)
            float r6 = r6 * r11
            r0 = 1059481190(0x3f266666, float:0.65)
            float r6 = r6 + r0
            r5 = 1055286886(0x3ee66666, float:0.45)
            float r5 = r5 * r11
            r0 = 1057803469(0x3f0ccccd, float:0.55)
            float r5 = r5 + r0
            int r4 = r7.A1O()
            int r2 = r7.A1Q()
        L_0x008f:
            if (r4 > r2) goto L_0x00c4
            android.view.View r1 = r7.A0j(r4)
            if (r1 == 0) goto L_0x00b0
            r1.setScaleX(r6)
            r1.setScaleY(r6)
            int r0 = r3.A01
            if (r4 != r0) goto L_0x00b0
            r0 = 2131435130(0x7f0b1e7a, float:1.8492093E38)
            android.view.View r0 = r1.findViewById(r0)
            if (r0 == 0) goto L_0x00b0
            r0.setScaleX(r5)
            r0.setScaleY(r5)
        L_0x00b0:
            int r4 = r4 + 1
            goto L_0x008f
        L_0x00b3:
            if (r4 == 0) goto L_0x0060
            int r1 = r4.A0J
            r0 = 3
            if (r1 != r0) goto L_0x0060
            boolean r0 = r3.A0H
            if (r0 == 0) goto L_0x0060
            r9.A03(r10, r2)
            r3.A0H = r5
            goto L_0x0060
        L_0x00c4:
            float r0 = r3.A00
            float r11 = r11 * r0
            r1 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 - r11
            android.view.View r0 = r3.A08
            if (r0 != 0) goto L_0x00dc
            android.view.View r0 = r3.A0O
            r0.setScaleX(r1)
            r0.setScaleY(r1)
            X.7JF r0 = r3.A0X
            if (r0 == 0) goto L_0x0005
            com.whatsapp.mediacomposer.doodle.DoodleView r0 = r0.A0P
        L_0x00dc:
            r0.setScaleX(r1)
            r0.setScaleY(r1)
            return
        L_0x00e3:
            r0 = 0
            X.C18070vi.A0d(r10, r0)
            java.lang.Object r2 = r9.A01
            X.74J r2 = (X.AnonymousClass74J) r2
            com.whatsapp.expressionstray.ExpressionsTrayView r1 = r2.A0E
            if (r1 == 0) goto L_0x0005
            r0 = 1
            r1.A0F(r0)
            boolean r0 = r2.A0J
            if (r0 != 0) goto L_0x0005
            X.AnonymousClass74J.A03(r10, r2)
            return
        L_0x00fb:
            java.lang.Object r3 = r9.A01
            X.73c r3 = (X.C1407973c) r3
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r2 = r3.A0H
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2.A04(r2, r11)
            com.whatsapp.calling.views.VoipCallControlBottomSheetDragIndicator r0 = r2.A0S
            if (r0 == 0) goto L_0x010b
            r0.setSlideOffset(r11)
        L_0x010b:
            r0 = 0
            int r0 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0005
            int r0 = r3.A00
            if (r0 <= 0) goto L_0x0125
            int r1 = r10.getTop()
            int r0 = r3.A00
            int r1 = r1 - r0
        L_0x011b:
            r2.A2E(r1, r11)
            int r0 = r10.getTop()
            r3.A00 = r0
            return
        L_0x0125:
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r3.A0G
            int r0 = r0.A0R()
            int r0 = -r0
            float r0 = (float) r0
            float r0 = r0 * r11
            int r1 = (int) r0
            goto L_0x011b
        L_0x0130:
            java.lang.Object r5 = r9.A01
            X.6Gp r5 = (X.AnonymousClass6Gp) r5
            X.70R r6 = r5.A0L()
            android.view.View r0 = r6.A01()
            r7 = 0
            r0.setVisibility(r7)
            android.view.View r0 = r6.A01()
            r0.setAlpha(r11)
            android.view.ViewGroup r8 = r6.A08
            r4 = 1065353216(0x3f800000, float:1.0)
            if (r8 == 0) goto L_0x015a
            double r2 = (double) r11
            r0 = 4616189618054758400(0x4010000000000000, double:4.0)
            double r0 = java.lang.Math.pow(r2, r0)
            float r2 = (float) r0
            float r0 = r4 - r2
            r8.setAlpha(r0)
        L_0x015a:
            boolean r0 = r5.A0V
            if (r0 != 0) goto L_0x0173
            boolean r0 = r5 instanceof X.C120896Gl
            if (r0 == 0) goto L_0x0173
            android.view.View r8 = X.AnonymousClass70R.A00(r6)
            double r2 = (double) r11
            r0 = 4616189618054758400(0x4010000000000000, double:4.0)
            double r0 = java.lang.Math.pow(r2, r0)
            float r2 = (float) r0
            float r0 = r4 - r2
            r8.setAlpha(r0)
        L_0x0173:
            boolean r0 = r6 instanceof X.C120886Gk
            if (r0 == 0) goto L_0x018f
            X.6Gk r6 = (X.C120886Gk) r6
            X.1bI r0 = r6.A0D
            if (r0 == 0) goto L_0x018f
            android.view.View r6 = r0.A02()
            if (r6 == 0) goto L_0x018f
            double r2 = (double) r11
            r0 = 4616189618054758400(0x4010000000000000, double:4.0)
            double r0 = java.lang.Math.pow(r2, r0)
            float r2 = (float) r0
            float r4 = r4 - r2
            r6.setAlpha(r4)
        L_0x018f:
            boolean r0 = r5.A0X()
            if (r0 == 0) goto L_0x01a4
            r0 = 0
            int r1 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            boolean r0 = r5.A0C
            if (r1 != 0) goto L_0x01a8
            if (r0 != 0) goto L_0x01a4
            r0 = 1
            r5.A0C = r0
            r5.A0V(r0)
        L_0x01a4:
            X.AnonymousClass6Gp.A07(r5)
            return
        L_0x01a8:
            if (r0 == 0) goto L_0x01a4
            r5.A0C = r7
            r5.A0V(r7)
            goto L_0x01a4
        L_0x01b0:
            float r3 = X.C108945cZ.A04(r10)
            float r3 = r3 * r11
            java.lang.Object r2 = r9.A01
            X.7By r2 = (X.C143087By) r2
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r2.A0G
            int r0 = r0.A0R()
            float r1 = (float) r0
            float r1 = r1 + r3
            r0 = 0
            X.C143087By.A09(r2, r1, r0)
            return
        L_0x01c6:
            r0 = 0
            int r0 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x01ec
            int r3 = r10.getHeight()
            java.lang.Object r2 = r9.A01
            X.7By r2 = (X.C143087By) r2
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r2.A0F
            int r1 = r0.A0R()
            int r3 = r3 - r1
            float r0 = (float) r3
            float r0 = r0 * r11
            float r1 = (float) r1
        L_0x01dd:
            float r1 = r1 + r0
            r0 = 0
            X.C143087By.A08(r2, r1, r0)
        L_0x01e2:
            java.lang.Object r0 = r9.A01
            X.7By r0 = (X.C143087By) r0
            com.whatsapp.location.DragBottomSheetIndicator r0 = r0.A0J
            r0.setOffset(r11)
            return
        L_0x01ec:
            boolean r0 = java.lang.Float.isNaN(r11)
            if (r0 != 0) goto L_0x01e2
            java.lang.Object r2 = r9.A01
            X.7By r2 = (X.C143087By) r2
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r2.A0F
            int r0 = r0.A0R()
            float r1 = (float) r0
            float r0 = r1 * r11
            goto L_0x01dd
        L_0x0200:
            java.lang.Object r0 = r9.A01
            com.whatsapp.expressionstray.expression.stickers.SearchFunStickersBottomSheet r0 = (com.whatsapp.expressionstray.expression.stickers.SearchFunStickersBottomSheet) r0
            com.whatsapp.WaEditText r0 = r0.A0A
            X.C108965cb.A1B(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C114315qV.A02(android.view.View, float):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0249, code lost:
        if (r1 == 2) goto L_0x024b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x03c4, code lost:
        if (r1 != 5) goto L_0x042b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x040e, code lost:
        if (r12.A0G.A0J != 4) goto L_0x0410;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x04ab, code lost:
        r5.A0G(r2, r0, false);
        r7.A0L.notifyDataSetChanged();
     */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0248  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0251 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x0345  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03(android.view.View r19, int r20) {
        /*
            r18 = this;
            r4 = r18
            int r0 = r4.A00
            r8 = r19
            r1 = r20
            switch(r0) {
                case 0: goto L_0x0391;
                case 1: goto L_0x04c1;
                case 2: goto L_0x036d;
                case 3: goto L_0x0357;
                case 4: goto L_0x03ac;
                case 5: goto L_0x034c;
                case 6: goto L_0x02a3;
                case 7: goto L_0x0026;
                case 8: goto L_0x0298;
                case 9: goto L_0x0229;
                case 10: goto L_0x01d2;
                case 11: goto L_0x0058;
                case 12: goto L_0x003b;
                case 13: goto L_0x0027;
                case 14: goto L_0x03a4;
                default: goto L_0x000b;
            }
        L_0x000b:
            r0 = 5
            if (r1 == r0) goto L_0x039c
            r0 = 4
            if (r1 == r0) goto L_0x039c
            r0 = 3
            if (r1 != r0) goto L_0x0026
            java.lang.Object r1 = r4.A01
            com.whatsapp.stickers.store.StickerStoreActivity r1 = (com.whatsapp.stickers.store.StickerStoreActivity) r1
            com.whatsapp.stickers.store.StickerStoreFeaturedTabFragment r0 = r1.A05
            if (r0 == 0) goto L_0x001f
            r0.A26()
        L_0x001f:
            com.whatsapp.stickers.store.StickerStoreMyTabFragment r0 = r1.A06
            if (r0 == 0) goto L_0x0026
            r0.A26()
        L_0x0026:
            return
        L_0x0027:
            r0 = 4
            if (r1 != r0) goto L_0x0026
            java.lang.Object r1 = r4.A01
            com.whatsapp.status.playback.MessageReplyActivity r1 = (com.whatsapp.status.playback.MessageReplyActivity) r1
            boolean r0 = r1.Bed()
            if (r0 != 0) goto L_0x0026
            com.whatsapp.status.playback.MessageReplyActivity.A0z(r1)
            com.whatsapp.status.playback.MessageReplyActivity.A0w(r1)
            return
        L_0x003b:
            r0 = 0
            X.C18070vi.A0d(r8, r0)
            r0 = 3
            if (r1 != r0) goto L_0x0026
            java.lang.Object r0 = r4.A01
            com.whatsapp.status.audienceselector.sharesheet.StatusAudienceSelectorShareSheetFragment r0 = (com.whatsapp.status.audienceselector.sharesheet.StatusAudienceSelectorShareSheetFragment) r0
            java.lang.ref.WeakReference r0 = r0.A0P
            java.lang.Object r1 = r0.get()
            X.8AT r1 = (X.AnonymousClass8AT) r1
            if (r1 == 0) goto L_0x0026
            int r0 = r8.getTop()
            r1.C6d(r0)
            return
        L_0x0058:
            r5 = 0
            X.C18070vi.A0d(r8, r5)
            r6 = 4
            r2 = 1
            if (r1 == r2) goto L_0x018e
            r0 = 3
            if (r1 == r0) goto L_0x00e8
            if (r1 != r6) goto L_0x00ca
            java.lang.Object r3 = r4.A01
            X.740 r3 = (X.AnonymousClass740) r3
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r3.A0A
            if (r0 == 0) goto L_0x00e6
            int r1 = r0.A0R()
        L_0x0071:
            int r0 = r8.getTop()
            int r1 = r1 + r0
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = r3.A0P
            int r0 = r0.getHeight()
            if (r1 != r0) goto L_0x00ca
            X.77n r9 = r3.A0W
            com.whatsapp.mediacomposer.MediaComposerFragment r8 = r9.A01
            X.8Ai r7 = r8.A29()
            if (r7 == 0) goto L_0x00a2
            com.whatsapp.mediacomposer.MediaComposerActivity r7 = (com.whatsapp.mediacomposer.MediaComposerActivity) r7
            r0 = 0
            r7.BuZ(r0)
            X.7JN r0 = r7.A0a
            r0.A09(r2)
            boolean r0 = r7.A1R
            if (r0 != 0) goto L_0x00e3
            X.7JN r1 = r7.A0a
            X.7JS r0 = r7.A0X
            boolean r0 = r0.A0G()
            r1.A0A(r0)
        L_0x00a2:
            X.7JF r0 = r8.A0J
            if (r0 == 0) goto L_0x00ad
            com.whatsapp.mediacomposer.doodle.DoodleView r0 = r0.A0P
            if (r0 == 0) goto L_0x00ad
            r0.setEnabled(r2)
        L_0x00ad:
            com.whatsapp.mediacomposer.ImageComposerFragment r1 = r9.A00
            boolean r0 = r1.A2W()
            if (r0 != 0) goto L_0x00c1
            X.0vl r0 = r1.A0G
            java.lang.Object r0 = X.AnonymousClass3MX.A14(r0)
            com.whatsapp.mediacomposer.doodle.ImagePreviewContentLayout r0 = (com.whatsapp.mediacomposer.doodle.ImagePreviewContentLayout) r0
            X.77s r0 = r0.A02
            r0.A0F = r2
        L_0x00c1:
            androidx.recyclerview.widget.RecyclerView r0 = r3.A0S
            r0.setVisibility(r6)
            r3.A0G = r2
            r3.A0I = r5
        L_0x00ca:
            java.lang.Object r2 = r4.A01
            X.740 r2 = (X.AnonymousClass740) r2
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r2.A0A
            if (r0 == 0) goto L_0x00d9
            int r1 = r0.A0J
            if (r1 == r6) goto L_0x00d9
            r0 = 3
            if (r1 != r0) goto L_0x0026
        L_0x00d9:
            boolean r0 = r2.A0F
            if (r0 == 0) goto L_0x01c6
            r2.A06()
            r2.A0F = r5
            return
        L_0x00e3:
            r7.A1R = r5
            goto L_0x00a2
        L_0x00e6:
            r1 = 0
            goto L_0x0071
        L_0x00e8:
            java.lang.Object r7 = r4.A01
            X.740 r7 = (X.AnonymousClass740) r7
            X.5kz r0 = r7.A0B
            if (r0 == 0) goto L_0x00f3
            r0.A0U(r2)
        L_0x00f3:
            int r1 = r8.getTop()
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = r7.A0P
            int r0 = r0.getTop()
            if (r1 != r0) goto L_0x018b
            X.77n r3 = r7.A0W
            com.whatsapp.mediacomposer.MediaComposerFragment r8 = r3.A01
            X.8Ai r2 = r8.A29()
            if (r2 == 0) goto L_0x012c
            com.whatsapp.mediacomposer.MediaComposerActivity r2 = (com.whatsapp.mediacomposer.MediaComposerActivity) r2
            r0 = 1065353216(0x3f800000, float:1.0)
            r2.BuZ(r0)
            X.7JN r1 = r2.A0a
            X.7JS r0 = r2.A0X
            boolean r2 = r0.A0G()
            r1.A09(r5)
            com.whatsapp.mediacomposer.bottombar.BottomBarView r0 = r1.A07
            r0.setVisibility(r6)
            X.7J3 r0 = r1.A0B
            r1 = 8
            if (r2 == 0) goto L_0x0127
            r1 = 4
        L_0x0127:
            androidx.recyclerview.widget.RecyclerView r0 = r0.A05
            r0.setVisibility(r1)
        L_0x012c:
            X.7JF r0 = r8.A0J
            if (r0 == 0) goto L_0x0137
            com.whatsapp.mediacomposer.doodle.DoodleView r0 = r0.A0P
            if (r0 == 0) goto L_0x0137
            r0.setEnabled(r5)
        L_0x0137:
            com.whatsapp.mediacomposer.ImageComposerFragment r1 = r3.A00
            boolean r0 = r1.A2W()
            if (r0 != 0) goto L_0x015b
            X.0vl r0 = r1.A0G
            java.lang.Object r0 = X.AnonymousClass3MX.A14(r0)
            com.whatsapp.mediacomposer.doodle.ImagePreviewContentLayout r0 = (com.whatsapp.mediacomposer.doodle.ImagePreviewContentLayout) r0
            X.77s r2 = r0.A02
            r2.A0F = r5
            android.graphics.Matrix r1 = r2.A0I
            android.graphics.Matrix r0 = r2.A0J
            r1.set(r0)
            float r0 = r2.A03
            r2.A04 = r0
            X.6of r0 = r2.A0N
            r0.A00(r1)
        L_0x015b:
            X.0z4 r3 = r7.A0U
            android.content.SharedPreferences r0 = X.C17890vO.A0B(r3)
            java.lang.String r2 = "filter_dismissal_amount"
            int r1 = r0.getInt(r2, r5)
            r0 = 5
            if (r1 > r0) goto L_0x016f
            int r0 = r1 + 1
            X.C17900vP.A0M(r3, r2, r0)
        L_0x016f:
            r7.A0H = r5
        L_0x0171:
            androidx.recyclerview.widget.RecyclerView r0 = r7.A0S
            r0.setVisibility(r5)
            X.1qy r1 = r0.getLayoutManager()
            if (r1 == 0) goto L_0x00ca
            int r0 = r7.A01
            android.view.View r1 = r1.A0j(r0)
            if (r1 == 0) goto L_0x00ca
            r0 = 8
            r1.sendAccessibilityEvent(r0)
            goto L_0x00ca
        L_0x018b:
            r7.A0H = r2
            goto L_0x0171
        L_0x018e:
            java.lang.Object r3 = r4.A01
            X.740 r3 = (X.AnonymousClass740) r3
            androidx.recyclerview.widget.RecyclerView r2 = r3.A0S
            r2.getVisibility()
            X.77n r0 = r3.A0W
            com.whatsapp.mediacomposer.MediaComposerFragment r0 = r0.A01
            X.8Ai r0 = r0.A29()
            if (r0 == 0) goto L_0x01b1
            com.whatsapp.mediacomposer.MediaComposerActivity r0 = (com.whatsapp.mediacomposer.MediaComposerActivity) r0
            X.7JN r1 = r0.A0a
            X.7JS r0 = r0.A0X
            boolean r0 = r0.A0G()
            r1.A09(r5)
            r1.A0A(r0)
        L_0x01b1:
            r3.A0I = r5
            X.5kz r0 = r3.A0B
            if (r0 != 0) goto L_0x01c1
            android.os.Handler r1 = r3.A0L
            java.lang.Runnable r0 = r3.A0Z
            r1.removeCallbacks(r0)
            r0.run()
        L_0x01c1:
            r2.setVisibility(r5)
            goto L_0x00ca
        L_0x01c6:
            boolean r0 = r2.A0D
            if (r0 == 0) goto L_0x0026
            boolean r0 = r2.A0E
            r2.A09(r0)
            r2.A0D = r5
            return
        L_0x01d2:
            r6 = 0
            r3 = 1
            r5 = 5
            if (r1 != r5) goto L_0x01fd
            java.lang.Object r5 = r4.A01
            X.7By r5 = (X.C143087By) r5
            androidx.recyclerview.widget.RecyclerView r2 = r5.A0E
            r1 = -1
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r0.<init>(r1, r6)
            r2.setLayoutParams(r0)
            r0 = 0
            X.C143087By.A09(r5, r0, r3)
            X.C143087By.A05(r5)
        L_0x01ed:
            java.lang.Object r1 = r4.A01
            X.7By r1 = (X.C143087By) r1
            java.util.List r0 = r1.A1C
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0026
            X.C143087By.A05(r1)
            return
        L_0x01fd:
            r0 = 3
            if (r1 != r0) goto L_0x01ed
            java.lang.Object r2 = r4.A01
            X.7By r2 = (X.C143087By) r2
            com.google.android.material.bottomsheet.BottomSheetBehavior r1 = r2.A0F
            int r0 = r1.A0J
            if (r0 == r5) goto L_0x0224
            r1.A0d(r3)
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r2.A0F
            r0.A0W(r5)
        L_0x0212:
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r2.A0G
            int r0 = r0.A0R()
            int r0 = X.AnonymousClass3MW.A02(r8, r0)
            float r0 = (float) r0
            X.C143087By.A09(r2, r0, r3)
            r2.A0S()
            goto L_0x01ed
        L_0x0224:
            r0 = 0
            X.C143087By.A08(r2, r0, r6)
            goto L_0x0212
        L_0x0229:
            r10 = 5
            r6 = 4
            r5 = 0
            r3 = 1
            r9 = 3
            if (r1 != r9) goto L_0x0277
            java.lang.Object r7 = r4.A01
            X.7By r7 = (X.C143087By) r7
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r7.A0G
            int r0 = r0.A0J
            if (r0 != r9) goto L_0x025b
            com.google.android.material.bottomsheet.BottomSheetBehavior r7 = r7.A0F
        L_0x023c:
            r7.A0W(r10)
        L_0x023f:
            java.lang.Object r7 = r4.A01
            X.7By r7 = (X.C143087By) r7
            com.whatsapp.location.DragBottomSheetIndicator r4 = r7.A0J
            r2 = 2
            if (r1 == r3) goto L_0x024b
            r0 = 0
            if (r1 != r2) goto L_0x024c
        L_0x024b:
            r0 = 1
        L_0x024c:
            r4.setUpdating(r0)
            if (r1 == r2) goto L_0x0255
            if (r1 == r3) goto L_0x0255
            if (r1 != r6) goto L_0x0026
        L_0x0255:
            androidx.recyclerview.widget.RecyclerView r0 = r7.A0D
            r0.A0f(r5)
            return
        L_0x025b:
            int r2 = r8.getHeight()
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r7.A0F
            int r0 = r0.A0R()
            int r2 = r2 - r0
            float r2 = (float) r2
            float r0 = (float) r0
            float r0 = r0 + r2
            X.C143087By.A08(r7, r0, r3)
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r7.A0F
            r0.A0d(r5)
            com.whatsapp.location.DragBottomSheetIndicator r0 = r7.A0J
            r0.setExpanded(r3)
            goto L_0x023f
        L_0x0277:
            if (r1 != r6) goto L_0x023f
            java.lang.Object r2 = r4.A01
            X.7By r2 = (X.C143087By) r2
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r2.A0G
            int r0 = r0.A0J
            com.google.android.material.bottomsheet.BottomSheetBehavior r7 = r2.A0F
            if (r0 == r9) goto L_0x023c
            r7.A0d(r5)
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r2.A0F
            int r0 = r0.A0R()
            float r0 = (float) r0
            X.C143087By.A08(r2, r0, r3)
            com.whatsapp.location.DragBottomSheetIndicator r0 = r2.A0J
            r0.setExpanded(r5)
            goto L_0x023f
        L_0x0298:
            r0 = 5
            if (r1 != r0) goto L_0x0026
            java.lang.Object r0 = r4.A01
            com.whatsapp.gallerypicker.GalleryPickerBottomSheetActivity r0 = (com.whatsapp.gallerypicker.GalleryPickerBottomSheetActivity) r0
            com.whatsapp.gallerypicker.GalleryPickerBottomSheetActivity.A0V(r0)
            return
        L_0x02a3:
            r3 = 0
            X.C18070vi.A0d(r8, r3)
            r9 = 1
            r6 = 3
            if (r1 == r6) goto L_0x0331
            r5 = 4
            if (r1 == r5) goto L_0x0313
            r0 = 5
            if (r1 == r0) goto L_0x02bf
            if (r1 == r9) goto L_0x0026
        L_0x02b3:
            java.lang.Object r0 = r4.A01
            X.74J r0 = (X.AnonymousClass74J) r0
            com.whatsapp.expressionstray.ExpressionsTrayView r0 = r0.A0E
            if (r0 == 0) goto L_0x0026
            r0.A0F(r1)
            return
        L_0x02bf:
            java.lang.Object r7 = r4.A01
            X.74J r7 = (X.AnonymousClass74J) r7
            com.whatsapp.expressionstray.ExpressionsTrayView r0 = r7.A0E
            if (r0 == 0) goto L_0x02ca
            r0.A0E()
        L_0x02ca:
            X.AnonymousClass74J.A09(r7, r3)
            android.content.res.Resources r2 = r8.getResources()
            r0 = 2131890250(0x7f12104a, float:1.9415187E38)
            java.lang.String r3 = r2.getString(r0)
            r2 = 2131232116(0x7f080574, float:1.8080332E38)
            android.widget.ImageButton r0 = r7.A04
            if (r0 == 0) goto L_0x02e2
            r0.setImageResource(r2)
        L_0x02e2:
            android.widget.ImageButton r0 = r7.A04
            if (r0 == 0) goto L_0x02e9
            r0.setContentDescription(r3)
        L_0x02e9:
            com.whatsapp.KeyboardPopupLayout r0 = r7.A08
            if (r0 == 0) goto L_0x02f6
            android.view.ViewGroup$LayoutParams r2 = r0.getLayoutParams()
            if (r2 == 0) goto L_0x02f6
            r0 = -1
            r2.height = r0
        L_0x02f6:
            com.whatsapp.KeyboardPopupLayout r0 = r7.A08
            if (r0 == 0) goto L_0x02fd
            r0.requestLayout()
        L_0x02fd:
            r7.A0J = r9
            boolean r2 = r7.A0T()
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r7.A06
            if (r2 != 0) goto L_0x030d
            if (r0 == 0) goto L_0x02b3
            r0.A0W(r5)
            goto L_0x02b3
        L_0x030d:
            if (r0 == 0) goto L_0x02b3
            r0.A0W(r6)
            goto L_0x02b3
        L_0x0313:
            java.lang.Object r2 = r4.A01
            X.74J r2 = (X.AnonymousClass74J) r2
            boolean r0 = r2.A0J
            if (r0 == 0) goto L_0x031d
            r2.A0J = r3
        L_0x031d:
            boolean r0 = r2.A0M
            if (r0 == 0) goto L_0x0327
            r2.A0M = r3
            r2.A0F()
            return
        L_0x0327:
            boolean r0 = r2.A0L
            if (r0 == 0) goto L_0x033a
            r2.A0L = r3
            X.AnonymousClass74J.A06(r2)
            return
        L_0x0331:
            java.lang.Object r2 = r4.A01
            X.74J r2 = (X.AnonymousClass74J) r2
            boolean r0 = r2.A0J
            if (r0 == 0) goto L_0x0341
            return
        L_0x033a:
            com.whatsapp.expressionstray.ExpressionsTrayView r0 = r2.A0E
            if (r0 == 0) goto L_0x0341
            r0.A0C()
        L_0x0341:
            com.whatsapp.KeyboardPopupLayout r0 = r2.A08
            if (r0 == 0) goto L_0x02b3
            r0.A09 = r3
            r0.requestLayout()
            goto L_0x02b3
        L_0x034c:
            r0 = 5
            if (r1 != r0) goto L_0x0026
            java.lang.Object r0 = r4.A01
            androidx.fragment.app.DialogFragment r0 = (androidx.fragment.app.DialogFragment) r0
            r0.A29()
            return
        L_0x0357:
            java.lang.Object r0 = r4.A01
            com.whatsapp.bot.metaai.imagine.AiImagineBottomSheet r0 = (com.whatsapp.bot.metaai.imagine.AiImagineBottomSheet) r0
            X.5jD r2 = r0.A0J
            if (r2 != 0) goto L_0x0364
            X.AnonymousClass3MW.A1H()
            r0 = 0
            throw r0
        L_0x0364:
            r0 = 5
            if (r1 != r0) goto L_0x0026
            X.6RH r0 = X.AnonymousClass6RH.CLOSING
            r2.A0V(r0)
            return
        L_0x036d:
            r0 = 5
            java.lang.Object r2 = r4.A01
            com.whatsapp.avatar.home.AvatarHomeActivity r2 = (com.whatsapp.avatar.home.AvatarHomeActivity) r2
            if (r1 != r0) goto L_0x0378
            com.whatsapp.avatar.home.AvatarHomeActivity.A0Q(r2)
            return
        L_0x0378:
            android.view.Window r1 = r2.getWindow()
            r0 = 0
            X.C28281Zt.A0A(r1, r0)
            int r0 = X.AnonymousClass4Z9.A01(r2, r0)
            X.C28281Zt.A05(r2, r0)
            X.01n r0 = r2.getSupportActionBar()
            if (r0 == 0) goto L_0x0026
            r0.A0I()
            return
        L_0x0391:
            r0 = 5
            if (r1 != r0) goto L_0x0026
            java.lang.Object r0 = r4.A01
            android.app.Dialog r0 = (android.app.Dialog) r0
            r0.cancel()
            return
        L_0x039c:
            java.lang.Object r0 = r4.A01
            android.app.Activity r0 = (android.app.Activity) r0
            X.C108965cb.A0y(r0)
            return
        L_0x03a4:
            java.lang.Object r0 = r4.A01
            X.6Gp r0 = (X.AnonymousClass6Gp) r0
            r0.A0R(r1)
            return
        L_0x03ac:
            java.lang.Object r12 = r4.A01
            X.73c r12 = (X.C1407973c) r12
            boolean r0 = r12.A0B
            r4 = 4
            if (r0 == 0) goto L_0x03bd
            if (r1 == r4) goto L_0x03bd
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r12.A0G
            r0.A0W(r4)
            return
        L_0x03bd:
            r3 = 5
            r15 = 0
            r6 = 3
            if (r1 == r6) goto L_0x0451
            if (r1 == r4) goto L_0x03c6
            if (r1 != r3) goto L_0x042b
        L_0x03c6:
            boolean r0 = r12.A05
            if (r0 != 0) goto L_0x044e
            if (r1 == r6) goto L_0x044e
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != r4) goto L_0x03d1
            r6 = 0
        L_0x03d1:
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r5 = r12.A0H
            int r2 = r8.getTop()
            int r0 = r12.A00
            int r2 = r2 - r0
            r5.A2E(r2, r6)
            int r0 = r8.getTop()
            r12.A00 = r0
        L_0x03e3:
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r0 = r12.A0H
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2.A04(r0, r6)
            com.whatsapp.calling.views.VoipCallControlBottomSheetDragIndicator r0 = r0.A0S
            if (r0 == 0) goto L_0x03ef
            r0.setSlideOffset(r6)
        L_0x03ef:
            r12.A04()
            r12.A05()
            boolean r0 = r12.A06
            if (r0 == 0) goto L_0x042b
            android.view.View r5 = r12.A0D
            float r2 = r5.getTranslationY()
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x042b
            boolean r0 = r12.A0A
            if (r0 != 0) goto L_0x0410
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r12.A0G
            int r0 = r0.A0J
            r14 = 500(0x1f4, float:7.0E-43)
            if (r0 == r4) goto L_0x0411
        L_0x0410:
            r14 = 0
        L_0x0411:
            float r0 = r5.getTranslationY()
            int r7 = (int) r0
            r6 = 1056964608(0x3f000000, float:0.5)
            r5 = 1068289229(0x3faccccd, float:1.35)
            r2 = 1053609165(0x3ecccccd, float:0.4)
            r0 = 1065353216(0x3f800000, float:1.0)
            android.view.animation.Interpolator r13 = X.C29111bd.A00(r6, r5, r2, r0)
            r17 = r15
            r16 = r7
            r12.A06(r13, r14, r15, r16, r17)
        L_0x042b:
            if (r1 != r4) goto L_0x043a
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r0 = r12.A0H
            com.whatsapp.calling.views.VoipCallFooter r0 = r0.A0T
            if (r0 == 0) goto L_0x043a
            android.widget.ImageButton r0 = r0.A0J
            if (r0 == 0) goto L_0x043a
            r0.setSelected(r15)
        L_0x043a:
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r2 = r12.A0H
            if (r1 == r3) goto L_0x043f
            r15 = 1
        L_0x043f:
            X.6lg r0 = r2.A0b
            if (r0 == 0) goto L_0x0446
            r0.A00(r15)
        L_0x0446:
            float r0 = X.C108975cc.A01(r15)
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2.A05(r2, r0)
            return
        L_0x044e:
            r6 = 1065353216(0x3f800000, float:1.0)
            goto L_0x03e3
        L_0x0451:
            r12.A05 = r15
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r7 = r12.A0H
            androidx.recyclerview.widget.RecyclerView r11 = r7.A0E
            if (r11 == 0) goto L_0x04b3
            X.3WN r0 = r7.A0L
            if (r0 == 0) goto L_0x04b3
            com.whatsapp.calling.participantlist.viewmodel.ParticipantsListViewModel r10 = r7.A0Q
            java.util.Set r0 = r10.A0N
            java.util.HashSet r9 = new java.util.HashSet
            r9.<init>(r0)
            r2 = 0
        L_0x0467:
            int r0 = r11.getChildCount()
            if (r2 >= r0) goto L_0x049d
            android.view.View r5 = r11.getChildAt(r2)
            if (r5 == 0) goto L_0x048b
            java.lang.Object r0 = r5.getTag()
            boolean r0 = r0 instanceof com.whatsapp.jid.UserJid
            if (r0 == 0) goto L_0x048b
            java.lang.Object r5 = r5.getTag()
            X.C17960vV.A07(r5)
            boolean r0 = r9.contains(r5)
            if (r0 == 0) goto L_0x048e
            r9.remove(r5)
        L_0x048b:
            int r2 = r2 + 1
            goto L_0x0467
        L_0x048e:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r0 = "VoipCallControlBottomSheet/hasDuplicateParticipant/duplicate participant = "
            X.C17900vP.A0Z(r5, r0, r2)
            X.190 r5 = r10.A04
            java.lang.String r2 = "VoipCallControlBottomSheet/hasDuplicateParticipant/duplicate participant"
            r0 = 0
            goto L_0x04ab
        L_0x049d:
            boolean r0 = r9.isEmpty()
            if (r0 != 0) goto L_0x04b3
            X.190 r5 = r10.A04
            java.lang.String r2 = "VoipCallControlBottomSheet/hasDuplicateParticipant/missing participants"
            java.lang.String r0 = r9.toString()
        L_0x04ab:
            r5.A0G(r2, r0, r15)
            X.3WN r0 = r7.A0L
            r0.notifyDataSetChanged()
        L_0x04b3:
            com.whatsapp.calling.views.VoipCallFooter r0 = r7.A0T
            if (r0 == 0) goto L_0x03c6
            android.widget.ImageButton r2 = r0.A0J
            if (r2 == 0) goto L_0x03c6
            r0 = 1
            r2.setSelected(r0)
            goto L_0x03c6
        L_0x04c1:
            java.lang.Object r0 = r4.A01
            com.google.android.material.bottomsheet.BottomSheetDragHandleView r0 = (com.google.android.material.bottomsheet.BottomSheetDragHandleView) r0
            com.google.android.material.bottomsheet.BottomSheetDragHandleView.A01(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C114315qV.A03(android.view.View, int):void");
    }
}
