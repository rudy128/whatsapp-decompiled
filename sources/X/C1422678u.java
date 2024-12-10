package X;

import android.view.View;

/* renamed from: X.78u  reason: invalid class name and case insensitive filesystem */
public class C1422678u implements View.OnTouchListener {
    public final int A00;
    public final Object A01;

    public C1422678u(C110745gz r1, int i) {
        this.A00 = i;
        if (i != 0) {
            this.A01 = r1;
        } else {
            this.A01 = r1;
        }
    }

    public static void A00(View view, Object obj, int i) {
        view.setOnTouchListener(new C1422678u(obj, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0378, code lost:
        if (r5.getAction() == 2) goto L_0x037a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00bd, code lost:
        X.C18070vi.A11(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00c1, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00c8, code lost:
        r1.A02.A00.onTouchEvent(r5);
        r1.A01.onTouchEvent(r5);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r16, android.view.MotionEvent r17) {
        /*
            r15 = this;
            int r0 = r15.A00
            r9 = r16
            r5 = r17
            switch(r0) {
                case 0: goto L_0x0023;
                case 1: goto L_0x0387;
                case 2: goto L_0x037f;
                case 3: goto L_0x035f;
                case 4: goto L_0x034f;
                case 5: goto L_0x00d6;
                case 6: goto L_0x00b3;
                case 7: goto L_0x0345;
                case 8: goto L_0x0314;
                case 9: goto L_0x02f0;
                case 10: goto L_0x009d;
                case 11: goto L_0x008a;
                case 12: goto L_0x00f5;
                case 13: goto L_0x00ec;
                case 14: goto L_0x02d7;
                case 15: goto L_0x0043;
                case 16: goto L_0x006d;
                case 17: goto L_0x0170;
                case 18: goto L_0x0025;
                case 19: goto L_0x013c;
                case 20: goto L_0x00e3;
                case 21: goto L_0x00c2;
                case 22: goto L_0x00fe;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r0 = r15.A01
            X.BwF r0 = (X.C24149BwF) r0
            com.whatsapp.text.ReadMoreTextView r2 = r0.A0q
            boolean r0 = r2.A06
            r1 = 0
            if (r0 == 0) goto L_0x038e
            int r0 = r5.getAction()
            if (r0 != 0) goto L_0x038e
            boolean r0 = r2.A0T()
            if (r0 == 0) goto L_0x038e
            r2.setExpanded(r1)
        L_0x0023:
            r0 = 1
            return r0
        L_0x0025:
            java.lang.Object r0 = r15.A01
            X.5cz r0 = (X.C109205cz) r0
            X.6z9 r4 = r0.A08
            if (r4 != 0) goto L_0x0031
            java.lang.String r0 = "penDialogController"
            goto L_0x00bd
        L_0x0031:
            X.87P r0 = r4.A08
            r0.CFU()
            X.6yX r3 = r4.A09
            int r2 = r4.A00
            int r0 = r4.A01
            float r1 = (float) r0
            boolean r0 = r4.A03
            r3.A01(r5, r1, r2, r0)
            goto L_0x0023
        L_0x0043:
            java.lang.Object r1 = r15.A01
            com.whatsapp.gallerypicker.GalleryDropdownFilterFragment r1 = (com.whatsapp.gallerypicker.GalleryDropdownFilterFragment) r1
            int r0 = r5.getAction()
            if (r0 != 0) goto L_0x038e
            X.0vl r0 = r1.A07
            java.lang.Integer r0 = com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel.A00(r0)
            if (r0 == 0) goto L_0x038e
            int r2 = r0.intValue()
            X.00H r0 = r1.A05
            if (r0 == 0) goto L_0x006a
            java.lang.Object r1 = r0.get()
            X.A4v r1 = (X.C20050A4v) r1
            r0 = 87
            X.C72463Mc.A1F(r1, r0, r2)
            goto L_0x038e
        L_0x006a:
            java.lang.String r0 = "mediaSharingUserJourneyLogger"
            goto L_0x00bd
        L_0x006d:
            java.lang.Object r2 = r15.A01
            com.whatsapp.gallerypicker.GalleryPickerBottomSheetActivity r2 = (com.whatsapp.gallerypicker.GalleryPickerBottomSheetActivity) r2
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r2.A00
            if (r0 == 0) goto L_0x0087
            int r1 = r0.A0J
            r0 = 1
            if (r1 == r0) goto L_0x038e
            int r0 = r5.getAction()
            if (r0 != 0) goto L_0x038e
            com.whatsapp.gallerypicker.GalleryPickerBottomSheetActivity.A0V(r2)
            r2.finish()
            goto L_0x0023
        L_0x0087:
            java.lang.String r0 = "contentSheetBehaviour"
            goto L_0x00bd
        L_0x008a:
            java.lang.Object r0 = r15.A01
            X.6il r0 = (X.C130026il) r0
            r9.performClick()
            android.widget.PopupWindow r1 = r0.A02
            boolean r0 = r1.isShowing()
            if (r0 == 0) goto L_0x0023
            r1.dismiss()
            goto L_0x0023
        L_0x009d:
            java.lang.Object r2 = r15.A01
            com.whatsapp.contact.picker.ContactPickerBottomSheetActivity r2 = (com.whatsapp.contact.picker.ContactPickerBottomSheetActivity) r2
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r2.A02
            int r1 = r0.A0J
            r0 = 1
            if (r1 == r0) goto L_0x038e
            int r0 = r5.getAction()
            if (r0 != 0) goto L_0x038e
            r2.finish()
            goto L_0x0023
        L_0x00b3:
            java.lang.Object r0 = r15.A01
            X.7DY r0 = (X.AnonymousClass7DY) r0
            X.77p r1 = r0.A0J
            if (r1 != 0) goto L_0x00c8
            java.lang.String r0 = "cameraGestureDetector"
        L_0x00bd:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x00c2:
            java.lang.Object r0 = r15.A01
            X.74G r0 = (X.AnonymousClass74G) r0
            X.77p r1 = r0.A03
        L_0x00c8:
            X.CIZ r0 = r1.A02
            android.view.GestureDetector r0 = r0.A00
            r0.onTouchEvent(r5)
            android.view.ScaleGestureDetector r0 = r1.A01
            r0.onTouchEvent(r5)
            goto L_0x0023
        L_0x00d6:
            java.lang.Object r1 = r15.A01
            com.whatsapp.calling.views.VoipCallControlBottomSheetDragIndicator r1 = (com.whatsapp.calling.views.VoipCallControlBottomSheetDragIndicator) r1
            int r0 = r5.getAction()
            com.whatsapp.calling.views.VoipCallControlBottomSheetDragIndicator.A01(r1, r0)
            goto L_0x0023
        L_0x00e3:
            java.lang.Object r0 = r15.A01
            com.whatsapp.notification.PopupNotification r0 = (com.whatsapp.notification.PopupNotification) r0
            boolean r0 = com.whatsapp.notification.PopupNotification.A0u(r0)
            return r0
        L_0x00ec:
            java.lang.Object r0 = r15.A01
            com.whatsapp.expressionstray.ExpressionsTrayView r0 = (com.whatsapp.expressionstray.ExpressionsTrayView) r0
            boolean r0 = com.whatsapp.expressionstray.ExpressionsTrayView.A0A(r5, r0)
            return r0
        L_0x00f5:
            java.lang.Object r0 = r15.A01
            android.view.GestureDetector r0 = (android.view.GestureDetector) r0
            boolean r0 = r0.onTouchEvent(r5)
            return r0
        L_0x00fe:
            java.lang.Object r3 = r15.A01
            com.whatsapp.status.playback.StatusPlaybackActivity r3 = (com.whatsapp.status.playback.StatusPlaybackActivity) r3
            r0 = 2
            X.C18070vi.A0d(r5, r0)
            int r0 = r5.getAction()
            r2 = r0 & 255(0xff, float:3.57E-43)
            r1 = 1
            if (r2 == r1) goto L_0x0112
            r0 = 3
            if (r2 != r0) goto L_0x038e
        L_0x0112:
            int r0 = r5.getPointerCount()
            if (r0 != r1) goto L_0x038e
            androidx.viewpager.widget.ViewPager r0 = r3.A05
            if (r0 == 0) goto L_0x013a
            int r0 = r0.getCurrentItem()
        L_0x0120:
            com.whatsapp.status.playback.fragment.StatusPlaybackFragment r2 = r3.A4c(r0)
            if (r2 == 0) goto L_0x038e
            r1 = r2
            com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment r1 = (com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment) r1
            boolean r0 = r1.A07
            if (r0 != 0) goto L_0x038e
            boolean r0 = r1.A11
            if (r0 != 0) goto L_0x038e
            boolean r0 = r1.A10
            if (r0 != 0) goto L_0x038e
            r2.A27()
            goto L_0x038e
        L_0x013a:
            r0 = -1
            goto L_0x0120
        L_0x013c:
            java.lang.Object r4 = r15.A01
            X.7K6 r4 = (X.AnonymousClass7K6) r4
            r3 = 0
            int r2 = r5.getActionMasked()
            r1 = 1
            if (r2 == 0) goto L_0x015c
            if (r2 == r1) goto L_0x014f
            r0 = 3
            if (r2 == r0) goto L_0x014f
            goto L_0x038e
        L_0x014f:
            r4.A0C = r3
            boolean r0 = r4.A0B
            if (r0 != 0) goto L_0x038e
            X.89v r0 = r4.A0K
            r0.C4e(r4)
            goto L_0x038e
        L_0x015c:
            android.view.ViewParent r0 = r9.getParent()
            r0.requestDisallowInterceptTouchEvent(r1)
            r4.A0C = r1
            boolean r0 = r4.A0B
            if (r0 != 0) goto L_0x038e
            X.89v r0 = r4.A0K
            r0.C4f(r4)
            goto L_0x038e
        L_0x0170:
            java.lang.Object r0 = r15.A01
            X.5l1 r0 = (X.C112155l1) r0
            X.87N r6 = r0.A0F
            X.7J3 r6 = (X.AnonymousClass7J3) r6
            r8 = 0
            if (r17 == 0) goto L_0x038e
            int r1 = r5.getAction()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r7 = 0
            if (r0 == 0) goto L_0x038e
            if (r1 != 0) goto L_0x0196
            float r0 = r5.getX()
            r6.A00 = r0
            float r0 = r5.getY()
        L_0x0192:
            r6.A01 = r0
            goto L_0x038e
        L_0x0196:
            r3 = 1
            if (r1 == r3) goto L_0x02cc
            r0 = 3
            if (r1 == r0) goto L_0x02cc
            r0 = 2
            if (r1 != r0) goto L_0x038e
            X.6kU r12 = r6.A08
            android.view.View r0 = r12.A06
            if (r0 != 0) goto L_0x038e
            androidx.recyclerview.widget.RecyclerView r0 = r6.A05
            X.1qy r1 = r0.getLayoutManager()
            if (r1 == 0) goto L_0x038e
            boolean r0 = r6.A0A
            if (r0 != 0) goto L_0x038e
            boolean r0 = r1 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r0 == 0) goto L_0x02c3
            androidx.recyclerview.widget.LinearLayoutManager r1 = (androidx.recyclerview.widget.LinearLayoutManager) r1
        L_0x01b7:
            float r2 = r6.A01
            float r0 = r5.getY()
            float r2 = r2 - r0
            float r10 = r6.A00
            float r0 = r5.getX()
            float r10 = r10 - r0
            r4 = 0
            int r0 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x02b5
            if (r1 == 0) goto L_0x01dd
            int r1 = r1.A1P()
            X.5l1 r0 = r6.A09
            int r0 = r0.A0Q()
            int r0 = r0 - r3
            if (r1 >= r0) goto L_0x01dd
            float r4 = java.lang.Math.abs(r10)
        L_0x01dd:
            android.content.Context r0 = r6.A04
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131165498(0x7f07013a, float:1.7945215E38)
            float r1 = r1.getDimension(r0)
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x02c6
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x038e
            boolean r0 = r9 instanceof X.AnonymousClass69G
            if (r0 == 0) goto L_0x01f9
            r8 = r9
            X.69G r8 = (X.AnonymousClass69G) r8
        L_0x01f9:
            com.whatsapp.gallerypicker.PhotoViewPager r9 = r6.A07
            float r10 = r5.getX()
            float r5 = r5.getY()
            r12.A06 = r8
            android.net.Uri r0 = r8.getUri()
            r12.A04 = r0
            android.widget.ImageView r4 = r12.A09
            android.graphics.drawable.Drawable r0 = r8.getDrawable()
            r4.setImageDrawable(r0)
            int r0 = r8.getWidth()
            r4.setMaxWidth(r0)
            int r0 = r8.getHeight()
            r4.setMaxHeight(r0)
            int r2 = r8.getWidth()
            int r1 = r8.getHeight()
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r0.<init>(r2, r1)
            r4.setLayoutParams(r0)
            r12.A00 = r10
            r12.A01 = r5
            android.view.View r0 = r12.A06
            r0.invalidate()
            android.os.Handler r4 = r12.A0C
            java.lang.Runnable r2 = r12.A0D
            r4.removeCallbacks(r2)
            r0 = 100
            r4.postDelayed(r2, r0)
            android.view.View r11 = r12.A05
            r11.setBackgroundColor(r7)
            android.widget.TextView r10 = r12.A0A
            r10.setTextColor(r7)
            android.graphics.drawable.Drawable r0 = r12.A03
            r0.setAlpha(r7)
            android.view.ViewGroup r13 = r12.A08
            r13.setVisibility(r7)
            android.view.ViewGroup r5 = r12.A07
            int[] r4 = r12.A0E
            r5.getLocationOnScreen(r4)
            r14 = r4[r7]
            r2 = r4[r3]
            android.view.View r0 = r12.A06
            r0.getLocationOnScreen(r4)
            r1 = r4[r7]
            int r1 = r1 - r14
            r0 = r4[r3]
            int r0 = r0 - r2
            r5.setPadding(r1, r0, r7, r7)
            int r1 = r13.getHeight()
            int r0 = r9.getHeight()
            int r1 = r1 - r0
            r11.setPadding(r7, r7, r7, r1)
            r10.getLocationOnScreen(r4)
            X.5m9 r0 = r8.A06
            if (r0 == 0) goto L_0x038e
            int r0 = r0.A05()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r2 = r0.intValue()
            X.85E r1 = r6.A03
            if (r1 == 0) goto L_0x038e
            com.whatsapp.mediacomposer.MediaComposerActivity r1 = (com.whatsapp.mediacomposer.MediaComposerActivity) r1
            X.6wV r0 = r1.A0h
            boolean r0 = X.C138766xe.A00(r0)
            if (r0 != 0) goto L_0x038e
            r1.A1V = r3
            X.7JS r0 = r1.A0X
            int r0 = r0.A07()
            if (r0 == r2) goto L_0x038e
            X.7JS r0 = r1.A0X
            r0.A0D(r2)
            X.AnonymousClass7JN.A01(r1)
            goto L_0x038e
        L_0x02b5:
            if (r1 == 0) goto L_0x01dd
            int r0 = r1.A1N()
            if (r0 <= 0) goto L_0x01dd
            float r4 = java.lang.Math.abs(r10)
            goto L_0x01dd
        L_0x02c3:
            r1 = r8
            goto L_0x01b7
        L_0x02c6:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r6.A00 = r0
            goto L_0x0192
        L_0x02cc:
            X.6kU r0 = r6.A08
            android.os.Handler r1 = r0.A0C
            java.lang.Runnable r0 = r0.A0D
            r1.removeCallbacks(r0)
            goto L_0x038e
        L_0x02d7:
            java.lang.Object r3 = r15.A01
            com.whatsapp.gallery.GalleryRecentsFragment r3 = (com.whatsapp.gallery.GalleryRecentsFragment) r3
            r2 = 0
            int r1 = r5.getAction()
            r0 = 1
            if (r1 != r0) goto L_0x038e
            X.0vl r0 = r3.A0F
            com.whatsapp.gallery.viewmodel.GalleryTabsViewModel r0 = X.C108945cZ.A0g(r0)
            X.1DT r0 = r0.A04
            X.AnonymousClass3MY.A1L(r0, r2)
            goto L_0x038e
        L_0x02f0:
            java.lang.Object r1 = r15.A01
            com.whatsapp.consent.common.AgeCollectionFragment r1 = (com.whatsapp.consent.common.AgeCollectionFragment) r1
            int r0 = r5.getAction()
            if (r0 != 0) goto L_0x038e
            X.0vl r0 = r1.A0E
            java.lang.Object r2 = r0.getValue()
            android.widget.ArrayAdapter r2 = (android.widget.ArrayAdapter) r2
            android.content.res.Resources r1 = X.AnonymousClass3MZ.A09(r1)
            r0 = 2131895638(0x7f122556, float:1.9426115E38)
            java.lang.String r0 = X.AnonymousClass3MY.A0m(r1, r0)
            r2.remove(r0)
            r9.performClick()
            goto L_0x038e
        L_0x0314:
            java.lang.Object r2 = r15.A01
            com.whatsapp.consent.common.AgeCollectionFragment r2 = (com.whatsapp.consent.common.AgeCollectionFragment) r2
            int r0 = r5.getAction()
            r1 = 1
            if (r0 != r1) goto L_0x038e
            android.widget.TextView r0 = r2.A06
            if (r0 == 0) goto L_0x0343
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0343
        L_0x0329:
            boolean r0 = r2 instanceof com.whatsapp.consent.DateOfBirthCollectionFragment
            if (r0 == 0) goto L_0x038e
            com.whatsapp.consent.DateOfBirthCollectionFragment r2 = (com.whatsapp.consent.DateOfBirthCollectionFragment) r2
            X.A8V r4 = r2.A27()
            if (r1 == 0) goto L_0x0340
            java.lang.String r3 = "age_collection_monthday"
        L_0x0337:
            r2 = 0
            java.lang.String r1 = "age_collection_year_input"
            java.lang.String r0 = "select"
            r4.A0L(r3, r1, r0, r2)
            goto L_0x038e
        L_0x0340:
            java.lang.String r3 = "age_collection_year"
            goto L_0x0337
        L_0x0343:
            r1 = 0
            goto L_0x0329
        L_0x0345:
            java.lang.Object r0 = r15.A01
            X.8A5 r0 = (X.AnonymousClass8A5) r0
            if (r17 == 0) goto L_0x038e
            r0.C5h(r5)
            goto L_0x038e
        L_0x034f:
            java.lang.Object r1 = r15.A01
            X.5wQ r1 = (X.C116115wQ) r1
            java.util.List r0 = X.C42011xT.A0I
            X.0vl r0 = r1.A02
            android.view.View r0 = X.C72453Mb.A0T(r0)
            r1.A0F(r5, r0)
            goto L_0x038e
        L_0x035f:
            java.lang.Object r1 = r15.A01
            X.5gz r1 = (X.C110745gz) r1
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r1.A01
            if (r0 != 0) goto L_0x036a
            X.C110745gz.A02(r1)
        L_0x036a:
            com.google.android.material.bottomsheet.BottomSheetBehavior r3 = r1.A01
            int r0 = r5.getAction()
            if (r0 == 0) goto L_0x037a
            int r2 = r5.getAction()
            r1 = 2
            r0 = 1
            if (r2 != r1) goto L_0x037b
        L_0x037a:
            r0 = 0
        L_0x037b:
            r3.A0b(r0)
            goto L_0x038e
        L_0x037f:
            java.lang.Object r0 = r15.A01
            com.whatsapp.calling.answercall.VoipCallAnswerCallView r0 = (com.whatsapp.calling.answercall.VoipCallAnswerCallView) r0
            com.whatsapp.calling.answercall.VoipCallAnswerCallView.A02(r5, r0)
            goto L_0x038e
        L_0x0387:
            java.lang.Object r0 = r15.A01
            com.whatsapp.calling.answercall.VoipCallAnswerCallView r0 = (com.whatsapp.calling.answercall.VoipCallAnswerCallView) r0
            com.whatsapp.calling.answercall.VoipCallAnswerCallView.A01(r5, r0)
        L_0x038e:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1422678u.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public C1422678u(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}
