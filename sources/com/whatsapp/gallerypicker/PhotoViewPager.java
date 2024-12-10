package com.whatsapp.gallerypicker;

import X.AnonymousClass859;
import X.C116325x2;
import X.C142767As;
import android.content.Context;
import android.util.AttributeSet;

public class PhotoViewPager extends C116325x2 {
    public AnonymousClass859 A00;
    public float A01;
    public float A02;
    public float A03;
    public int A04;

    public PhotoViewPager(Context context) {
        super(context, (AttributeSet) null);
        A0O();
        A0L(new C142767As(0), true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0034, code lost:
        if (r4 == false) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0042, code lost:
        if (r0 > 1) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004b, code lost:
        if (r0 > 1) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0102, code lost:
        if (r0.A0E(r6, r2) == true) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x010c, code lost:
        if (r0.A05 != 0) goto L_0x0033;
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0095 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r10) {
        /*
            r9 = this;
            X.859 r1 = r9.A00
            r3 = 0
            if (r1 == 0) goto L_0x0036
            float r6 = r9.A01
            float r2 = r9.A02
            X.7Hj r1 = (X.C144457Hj) r1
            int r0 = r1.A00
            if (r0 == 0) goto L_0x00bd
            java.lang.Object r0 = r1.A01
            X.65h r0 = (X.AnonymousClass65h) r0
            com.whatsapp.mediaview.MediaViewBaseFragment r1 = r0.A00
            X.1FL r0 = r1.A1D()
            boolean r0 = r0.isFinishing()
            if (r0 != 0) goto L_0x0036
            X.65h r0 = r1.A09
            int r0 = r0.getCurrentItem()
            java.lang.Object r0 = r1.A2B(r0)
            com.whatsapp.mediaview.PhotoView r0 = r1.A28(r0)
            if (r0 == 0) goto L_0x0036
            boolean r4 = r0.A0D()
        L_0x0033:
            r1 = 3
            if (r4 != 0) goto L_0x0037
        L_0x0036:
            r1 = 0
        L_0x0037:
            int r0 = r10.getPointerCount()
            r8 = 3
            r7 = 1
            if (r1 == r8) goto L_0x0044
            if (r1 == r7) goto L_0x0044
            r6 = 0
            if (r0 <= r7) goto L_0x0045
        L_0x0044:
            r6 = 1
        L_0x0045:
            r5 = 2
            if (r1 == r8) goto L_0x004d
            if (r1 == r5) goto L_0x004d
            r4 = 0
            if (r0 <= r7) goto L_0x004e
        L_0x004d:
            r4 = 1
        L_0x004e:
            int r0 = r10.getAction()
            r2 = r0 & 255(0xff, float:3.57E-43)
            r1 = -1
            if (r2 == r8) goto L_0x0078
            if (r2 == r7) goto L_0x0078
            if (r2 != 0) goto L_0x007a
            float r0 = r10.getX()
            r9.A03 = r0
            float r0 = r10.getRawX()
            r9.A01 = r0
            float r0 = r10.getRawY()
            r9.A02 = r0
        L_0x006d:
            int r0 = r10.getPointerId(r3)
            r9.A04 = r0
        L_0x0073:
            boolean r0 = super.onInterceptTouchEvent(r10)
            return r0
        L_0x0078:
            r9.A04 = r1
        L_0x007a:
            if (r2 == r5) goto L_0x0095
            r0 = 6
            if (r2 != r0) goto L_0x0073
            int r2 = r10.getActionIndex()
            int r1 = r10.getPointerId(r2)
            int r0 = r9.A04
            if (r1 != r0) goto L_0x0073
            if (r2 != 0) goto L_0x008e
            r3 = 1
        L_0x008e:
            float r0 = r10.getX(r3)
            r9.A03 = r0
            goto L_0x006d
        L_0x0095:
            if (r6 != 0) goto L_0x0099
            if (r4 == 0) goto L_0x0073
        L_0x0099:
            int r0 = r9.A04
            if (r0 == r1) goto L_0x0073
            int r0 = r10.findPointerIndex(r0)
            if (r0 == r1) goto L_0x0073
            float r1 = r10.getX(r0)
            if (r6 == 0) goto L_0x00b4
            if (r4 != 0) goto L_0x00b1
            float r0 = r9.A03
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0073
        L_0x00b1:
            r9.A03 = r1
            return r3
        L_0x00b4:
            if (r4 == 0) goto L_0x0073
            float r0 = r9.A03
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0073
            goto L_0x00b1
        L_0x00bd:
            java.lang.Object r1 = r1.A01
            com.whatsapp.mediacomposer.MediaComposerActivity r1 = (com.whatsapp.mediacomposer.MediaComposerActivity) r1
            boolean r0 = r1.isFinishing()
            if (r0 != 0) goto L_0x0036
            com.whatsapp.mediacomposer.MediaComposerFragment r5 = com.whatsapp.mediacomposer.MediaComposerActivity.A0d(r1)
            if (r5 == 0) goto L_0x0036
            android.graphics.PointF r4 = r1.A1m
            r4.x = r6
            r4.y = r2
            X.7JF r0 = r5.A0J
            if (r0 == 0) goto L_0x00e0
            com.whatsapp.mediacomposer.doodle.DoodleView r1 = r0.A0P
            if (r1 == 0) goto L_0x00e0
            int[] r0 = r5.A0q
            r1.getLocationOnScreen(r0)
        L_0x00e0:
            float r6 = r4.x
            int[] r1 = r5.A0q
            r0 = r1[r3]
            float r0 = (float) r0
            float r6 = r6 - r0
            r4.x = r6
            float r2 = r4.y
            r0 = 1
            r0 = r1[r0]
            float r0 = (float) r0
            float r2 = r2 - r0
            r4.y = r2
            boolean r0 = r5 instanceof com.whatsapp.mediacomposer.VideoComposerFragment
            if (r0 == 0) goto L_0x0110
            com.whatsapp.mediacomposer.VideoComposerFragment r5 = (com.whatsapp.mediacomposer.VideoComposerFragment) r5
            X.7JF r0 = r5.A0J
            r4 = 1
            if (r0 == 0) goto L_0x0106
            boolean r0 = r0.A0E(r6, r2)
            if (r0 != r4) goto L_0x0106
            goto L_0x0033
        L_0x0106:
            com.whatsapp.mediacomposer.VideoTimelineView r0 = r5.A0Q
            if (r0 == 0) goto L_0x0036
            int r0 = r0.A05
            if (r0 == 0) goto L_0x0036
            goto L_0x0033
        L_0x0110:
            boolean r0 = r5 instanceof com.whatsapp.mediacomposer.ImageComposerFragment
            if (r0 == 0) goto L_0x0161
            com.whatsapp.mediacomposer.ImageComposerFragment r5 = (com.whatsapp.mediacomposer.ImageComposerFragment) r5
            X.740 r0 = r5.A05
            r4 = 1
            if (r0 == 0) goto L_0x0124
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r0.A0A
            if (r0 == 0) goto L_0x0124
            int r1 = r0.A0J
            r0 = 4
            if (r1 != r0) goto L_0x0033
        L_0x0124:
            X.7JF r0 = r5.A0J
            if (r0 == 0) goto L_0x0130
            boolean r0 = r0.A0E(r6, r2)
            if (r0 != r4) goto L_0x0130
            goto L_0x0033
        L_0x0130:
            X.0vl r0 = r5.A0G
            java.lang.Object r0 = X.AnonymousClass3MX.A14(r0)
            com.whatsapp.mediacomposer.doodle.ImagePreviewContentLayout r0 = (com.whatsapp.mediacomposer.doodle.ImagePreviewContentLayout) r0
            X.77s r2 = r0.A02
            boolean r0 = r2.A0F
            if (r0 == 0) goto L_0x0036
            X.7QJ r0 = r2.A0B
            if (r0 == 0) goto L_0x0148
            boolean r0 = r0.A03
            if (r0 != r4) goto L_0x0148
            goto L_0x0033
        L_0x0148:
            float r1 = r2.A02
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0159
            float r1 = r2.A04
            float r0 = r2.A01
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0033
            goto L_0x0036
        L_0x0159:
            float r0 = r2.A04
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0036
            goto L_0x0033
        L_0x0161:
            X.7JF r0 = r5.A0J
            if (r0 == 0) goto L_0x0036
            boolean r4 = r0.A0E(r6, r2)
            goto L_0x0033
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallerypicker.PhotoViewPager.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setOnInterceptTouchListener(AnonymousClass859 r1) {
        this.A00 = r1;
    }

    public PhotoViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A0L(new C142767As(0), true);
    }
}
