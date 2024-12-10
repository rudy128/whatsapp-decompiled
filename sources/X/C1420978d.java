package X;

import android.view.View;

/* renamed from: X.78d  reason: invalid class name and case insensitive filesystem */
public class C1420978d implements View.OnLayoutChangeListener {
    public final int A00;
    public final Object A01;

    public C1420978d(AnonymousClass71R r1, int i) {
        this.A00 = i;
        if (9 - i != 0) {
            this.A01 = r1;
        } else {
            this.A01 = r1;
        }
    }

    public static void A00(View view, Object obj, int i) {
        view.addOnLayoutChangeListener(new C1420978d(obj, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:142:0x02e3, code lost:
        com.whatsapp.expressionstray.expression.emoji.EmojiExpressionsFragment.A02(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x02e6, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x033f, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01ce, code lost:
        r2 = r0.A08;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onLayoutChange(android.view.View r14, int r15, int r16, int r17, int r18, int r19, int r20, int r21, int r22) {
        /*
            r13 = this;
            r11 = r21
            r8 = r18
            r7 = r17
            int r0 = r13.A00
            r5 = r15
            r6 = r16
            r9 = r19
            r10 = r20
            r12 = r22
            switch(r0) {
                case 0: goto L_0x01c8;
                case 1: goto L_0x01ac;
                case 2: goto L_0x02f2;
                case 3: goto L_0x0197;
                case 4: goto L_0x02e7;
                case 5: goto L_0x02d5;
                case 6: goto L_0x02c9;
                case 7: goto L_0x0179;
                case 8: goto L_0x00f6;
                case 9: goto L_0x00a0;
                case 10: goto L_0x02a4;
                case 11: goto L_0x0073;
                case 12: goto L_0x0295;
                case 13: goto L_0x0288;
                case 14: goto L_0x0275;
                case 15: goto L_0x0042;
                case 16: goto L_0x0264;
                case 17: goto L_0x024d;
                case 18: goto L_0x001f;
                case 19: goto L_0x0014;
                case 20: goto L_0x0014;
                case 21: goto L_0x023d;
                case 22: goto L_0x0235;
                case 23: goto L_0x0208;
                case 24: goto L_0x01f3;
                default: goto L_0x0014;
            }
        L_0x0014:
            r14.removeOnLayoutChangeListener(r13)
            java.lang.Object r0 = r13.A01
            X.6IX r0 = (X.AnonymousClass6IX) r0
            X.AnonymousClass6IX.A02(r0)
        L_0x001e:
            return
        L_0x001f:
            r0 = 0
            X.C18070vi.A0d(r14, r0)
            r14.removeOnLayoutChangeListener(r13)
            java.lang.Object r1 = r13.A01
            com.whatsapp.statuscomposer.composer.TextStatusComposerFragment r1 = (com.whatsapp.statuscomposer.composer.TextStatusComposerFragment) r1
            com.whatsapp.status.widget.StatusEditText r0 = r1.A0l
            java.lang.String r2 = "entry"
            if (r0 == 0) goto L_0x0314
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L_0x001e
            com.whatsapp.status.widget.StatusEditText r1 = r1.A0l
            if (r1 == 0) goto L_0x0314
            int r0 = r0.length()
            r1.setCursorPosition(r0)
            return
        L_0x0042:
            int r0 = r17 - r15
            int r11 = r21 - r19
            if (r0 == r11) goto L_0x001e
            java.lang.Object r4 = r13.A01
            X.6F8 r4 = (X.AnonymousClass6F8) r4
            int r0 = r4.getWidth()
            if (r0 <= 0) goto L_0x001e
            com.google.android.material.chip.ChipGroup r3 = r4.A01
            int r0 = r3.getChildCount()
            if (r0 <= 0) goto L_0x001e
            int r2 = r4.getMaxChipWidth()
            if (r2 <= 0) goto L_0x001e
            r1 = 0
        L_0x0061:
            int r0 = r3.getChildCount()
            if (r1 >= r0) goto L_0x0318
            android.view.View r0 = r3.getChildAt(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0.setMaxWidth(r2)
            int r1 = r1 + 1
            goto L_0x0061
        L_0x0073:
            java.lang.Object r0 = r13.A01
            X.6z6 r0 = (X.AnonymousClass6z6) r0
            int r11 = r21 - r19
            int r7 = r17 - r15
            if (r11 == r7) goto L_0x001e
            X.5lH r3 = r0.A07
            X.6z6 r1 = r3.A03
            boolean r2 = r1.A00
            boolean r0 = r1 instanceof X.C1196969m
            if (r0 == 0) goto L_0x009d
            androidx.recyclerview.widget.RecyclerView r0 = r1.A05
            android.content.res.Resources r1 = X.AnonymousClass000.A0Y(r0)
            r0 = 2131168708(0x7f070dc4, float:1.7951725E38)
            if (r2 == 0) goto L_0x0095
            r0 = 2131168707(0x7f070dc3, float:1.7951723E38)
        L_0x0095:
            int r0 = r1.getDimensionPixelSize(r0)
            int r7 = r7 / r0
        L_0x009a:
            r3.A01 = r7
            return
        L_0x009d:
            r7 = 8
            goto L_0x009a
        L_0x00a0:
            java.lang.Object r5 = r13.A01
            X.71R r5 = (X.AnonymousClass71R) r5
            android.widget.TextView r2 = r5.A09
            int r1 = r2.getWidth()
            android.widget.TextView r3 = r5.A08
            int r0 = r3.getWidth()
            if (r1 > r0) goto L_0x00b3
            r3 = r2
        L_0x00b3:
            int r1 = java.lang.Math.max(r1, r0)
            android.view.ViewGroup$LayoutParams r2 = r3.getLayoutParams()
            int r0 = r2.width
            if (r1 == r0) goto L_0x00ca
            r2.width = r1
            r1 = 4
            X.3By r0 = new X.3By
            r0.<init>(r3, r2, r1)
            r3.post(r0)
        L_0x00ca:
            X.1vp r0 = r5.A0F
            boolean r0 = X.C72463Mc.A1O(r0)
            if (r0 == 0) goto L_0x001e
            android.view.View r4 = r5.A03
            android.view.ViewGroup$LayoutParams r3 = r4.getLayoutParams()
            android.view.View r0 = r5.A06
            int r2 = r0.getWidth()
            r0 = 2131168695(0x7f070db7, float:1.79517E38)
            int r1 = X.AnonymousClass3Ma.A02(r4, r0)
            int r1 = r1 + r2
            int r0 = r3.width
            if (r0 == r1) goto L_0x001e
            r3.width = r1
            r1 = 5
            X.3By r0 = new X.3By
            r0.<init>(r5, r3, r1)
            r4.post(r0)
            return
        L_0x00f6:
            java.lang.Object r5 = r13.A01
            X.5cz r5 = (X.C109205cz) r5
            android.view.Window r1 = r5.getWindow()
            if (r1 == 0) goto L_0x001e
            r9 = 2
            int[] r7 = new int[r9]
            android.view.ViewGroup r0 = r5.A01
            java.lang.String r8 = "canvas"
            if (r0 == 0) goto L_0x0331
            r0.getLocationOnScreen(r7)
            android.view.ViewGroup r0 = r5.A01
            if (r0 == 0) goto L_0x0331
            android.view.ViewGroup$LayoutParams r4 = r0.getLayoutParams()
            java.lang.String r3 = "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams"
            X.C18070vi.A0z(r4, r3)
            android.view.ViewGroup$MarginLayoutParams r4 = (android.view.ViewGroup.MarginLayoutParams) r4
            android.view.WindowManager r0 = r1.getWindowManager()
            android.view.Display r0 = r0.getDefaultDisplay()
            int r1 = r0.getRotation()
            int r0 = r5.A00
            if (r0 == r1) goto L_0x001e
            r5.A00 = r1
            r2 = 0
            r4.rightMargin = r2
            r4.leftMargin = r2
            r4.topMargin = r2
            r4.bottomMargin = r2
            r6 = 1
            if (r1 == 0) goto L_0x016f
            if (r1 == r6) goto L_0x0165
            if (r1 == r9) goto L_0x015b
            r0 = 3
            if (r1 != r0) goto L_0x0149
            int[] r0 = r5.A0Q
            r1 = r0[r2]
            r0 = r7[r2]
            int r1 = r1 - r0
            r4.rightMargin = r1
        L_0x0149:
            android.view.ViewGroup r0 = r5.A01
            if (r0 == 0) goto L_0x0331
            r0.setLayoutParams(r4)
            int[] r1 = r5.A0Q
            r0 = r1[r2]
            if (r0 != 0) goto L_0x0335
            r0 = r1[r6]
            if (r0 != 0) goto L_0x0335
            return
        L_0x015b:
            int[] r0 = r5.A0Q
            r1 = r0[r6]
            r0 = r7[r6]
            int r1 = r1 - r0
            r4.bottomMargin = r1
            goto L_0x0149
        L_0x0165:
            int[] r0 = r5.A0Q
            r1 = r0[r2]
            r0 = r7[r2]
            int r1 = r1 - r0
            r4.leftMargin = r1
            goto L_0x0149
        L_0x016f:
            int[] r0 = r5.A0Q
            r1 = r0[r6]
            r0 = r7[r6]
            int r1 = r1 - r0
            r4.topMargin = r1
            goto L_0x0149
        L_0x0179:
            r14.removeOnLayoutChangeListener(r13)
            java.lang.Object r0 = r13.A01
            com.whatsapp.expressionstray.expression.stickers.StickerExpressionsFragment r0 = (com.whatsapp.expressionstray.expression.stickers.StickerExpressionsFragment) r0
            int r2 = r14.getWidth()
            androidx.recyclerview.widget.GridLayoutManager r1 = r0.A05
            if (r1 == 0) goto L_0x001e
            X.0vl r0 = r0.A0e
            int r0 = X.C72453Mb.A0I(r0)
            int r2 = r2 / r0
            r0 = 1
            if (r0 >= r2) goto L_0x0193
            r0 = r2
        L_0x0193:
            r1.A1g(r0)
            return
        L_0x0197:
            java.lang.Object r1 = r13.A01
            com.whatsapp.contact.picker.StatusMentionsContactPickerFragment r1 = (com.whatsapp.contact.picker.StatusMentionsContactPickerFragment) r1
            android.widget.RelativeLayout r0 = r1.A00
            if (r0 == 0) goto L_0x01a2
            r0.removeOnLayoutChangeListener(r13)
        L_0x01a2:
            android.widget.ScrollView r1 = r1.A00
            if (r1 == 0) goto L_0x001e
            r0 = 130(0x82, float:1.82E-43)
            r1.fullScroll(r0)
            return
        L_0x01ac:
            java.lang.Object r1 = r13.A01
            X.6x2 r1 = (X.C138416x2) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            int r7 = r17 - r15
            int r8 = r18 - r16
            int r0 = r1.A01
            if (r7 != r0) goto L_0x01c0
            int r0 = r1.A00
            if (r8 == r0) goto L_0x001e
        L_0x01c0:
            r1.A01 = r7
            r1.A00 = r8
            X.C138416x2.A00(r1)
            return
        L_0x01c8:
            java.lang.Object r0 = r13.A01
            com.whatsapp.calling.callgrid.view.CallGrid r0 = (com.whatsapp.calling.callgrid.view.CallGrid) r0
            if (r7 == r11) goto L_0x001e
            X.5wO r2 = r0.A08
            androidx.recyclerview.widget.RecyclerView r0 = r2.A01
            if (r0 == 0) goto L_0x001e
            int r0 = r0.getWidth()
            if (r0 == 0) goto L_0x01dc
            r2.A01 = r0
        L_0x01dc:
            r1 = 0
        L_0x01dd:
            java.util.List r0 = r2.A09
            int r0 = r0.size()
            if (r1 >= r0) goto L_0x0364
            androidx.recyclerview.widget.RecyclerView r0 = r2.A01
            android.view.View r0 = r0.getChildAt(r1)
            if (r0 == 0) goto L_0x01f0
            X.C116095wO.A00(r0, r2)
        L_0x01f0:
            int r1 = r1 + 1
            goto L_0x01dd
        L_0x01f3:
            java.lang.Object r1 = r13.A01
            X.5eT r1 = (X.C109955eT) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            if (r15 != r9) goto L_0x0204
            if (r6 != r10) goto L_0x0204
            if (r7 != r11) goto L_0x0204
            if (r8 != r12) goto L_0x0204
            return
        L_0x0204:
            X.C109955eT.A00(r14, r1)
            return
        L_0x0208:
            r0 = 0
            X.C18070vi.A0d(r14, r0)
            r14.removeOnLayoutChangeListener(r13)
            boolean r0 = r14.isLaidOut()
            if (r0 == 0) goto L_0x022b
            boolean r0 = r14.isLayoutRequested()
            if (r0 != 0) goto L_0x022b
            r14.addOnLayoutChangeListener(r13)
        L_0x021e:
            java.lang.Object r2 = r13.A01
            r1 = 40
            X.7RN r0 = new X.7RN
            r0.<init>(r2, r14, r1)
            r14.post(r0)
            return
        L_0x022b:
            r1 = 7
            X.78Z r0 = new X.78Z
            r0.<init>(r14, r13, r1)
            r14.addOnLayoutChangeListener(r0)
            goto L_0x021e
        L_0x0235:
            java.lang.Object r4 = r13.A01
            com.whatsapp.voipcalling.VoipActivityV2 r4 = (com.whatsapp.voipcalling.VoipActivityV2) r4
            r4.A4m(r5, r6, r7, r8, r9, r10, r11, r12)
            return
        L_0x023d:
            r14.removeOnLayoutChangeListener(r13)
            java.lang.Object r4 = r13.A01
            X.6IX r4 = (X.AnonymousClass6IX) r4
            int r3 = r4.A00
            r2 = 0
            r1 = 0
            r0 = 1
            r4.A0B(r1, r3, r2, r0)
            return
        L_0x024d:
            r14.removeOnLayoutChangeListener(r13)
            java.lang.Object r2 = r13.A01
            X.6Gp r2 = (X.AnonymousClass6Gp) r2
            X.6p9 r0 = r2.A0N
            com.whatsapp.status.playback.fragment.StatusPlaybackBaseFragment r1 = r0.A01
            X.70R r0 = r2.A0L()
            android.view.ViewGroup r0 = r0.A03()
            r1.A2E(r0)
            return
        L_0x0264:
            r0 = 0
            X.C18070vi.A0d(r14, r0)
            r14.removeOnLayoutChangeListener(r13)
            java.lang.Object r0 = r13.A01
            X.1u7 r0 = (X.C40071u7) r0
            android.animation.AnimatorSet r0 = r0.A00
            r0.start()
            return
        L_0x0275:
            r14.removeOnLayoutChangeListener(r13)
            java.lang.Object r3 = r13.A01
            com.whatsapp.search.SearchFragment r3 = (com.whatsapp.search.SearchFragment) r3
            r0 = 11
            X.7Qo r4 = new X.7Qo
            r4.<init>((java.lang.Object) r3, (int) r0)
            r9 = 1
            com.whatsapp.search.SearchFragment.A0A(r3, r4, r5, r6, r7, r8, r9)
            return
        L_0x0288:
            r0 = 0
            X.C18070vi.A0d(r14, r0)
            r14.removeOnLayoutChangeListener(r13)
            java.lang.Object r0 = r13.A01
            X.C108945cZ.A1P(r0)
            return
        L_0x0295:
            java.lang.Object r2 = r13.A01
            X.7K6 r2 = (X.AnonymousClass7K6) r2
            r1 = 0
            boolean r0 = r2.A0A
            if (r0 != 0) goto L_0x02a1
            X.AnonymousClass7K6.A01(r2)
        L_0x02a1:
            r2.A0A = r1
            return
        L_0x02a4:
            java.lang.Object r0 = r13.A01
            X.71R r0 = (X.AnonymousClass71R) r0
            android.view.View r4 = r0.A03
            android.view.ViewGroup$MarginLayoutParams r3 = X.AnonymousClass3MW.A0B(r4)
            android.view.View r0 = r0.A06
            int r2 = r0.getWidth()
            r0 = 2131168695(0x7f070db7, float:1.79517E38)
            int r1 = X.AnonymousClass3Ma.A02(r4, r0)
            int r1 = r1 + r2
            r0 = 0
            r3.setMargins(r0, r0, r0, r0)
            r3.width = r1
            r4.setLayoutParams(r3)
            r4.removeOnLayoutChangeListener(r13)
            return
        L_0x02c9:
            r14.removeOnLayoutChangeListener(r13)
            java.lang.Object r1 = r13.A01
            com.whatsapp.expressionstray.expression.emoji.EmojiExpressionsFragment r1 = (com.whatsapp.expressionstray.expression.emoji.EmojiExpressionsFragment) r1
            int r0 = com.whatsapp.expressionstray.expression.emoji.EmojiExpressionsFragment.A00(r1)
            goto L_0x02e3
        L_0x02d5:
            r14.removeOnLayoutChangeListener(r13)
            java.lang.Object r1 = r13.A01
            com.whatsapp.expressionstray.expression.emoji.EmojiExpressionsFragment r1 = (com.whatsapp.expressionstray.expression.emoji.EmojiExpressionsFragment) r1
            int r0 = com.whatsapp.expressionstray.expression.emoji.EmojiExpressionsFragment.A00(r1)
            com.whatsapp.expressionstray.expression.emoji.EmojiExpressionsFragment.A01(r1)
        L_0x02e3:
            com.whatsapp.expressionstray.expression.emoji.EmojiExpressionsFragment.A02(r1, r0)
            return
        L_0x02e7:
            r14.removeOnLayoutChangeListener(r13)
            java.lang.Object r0 = r13.A01
            com.whatsapp.expressionstray.expression.emoji.EmojiExpressionsFragment r0 = (com.whatsapp.expressionstray.expression.emoji.EmojiExpressionsFragment) r0
            com.whatsapp.expressionstray.expression.emoji.EmojiExpressionsFragment.A01(r0)
            return
        L_0x02f2:
            r14.removeOnLayoutChangeListener(r13)
            java.lang.Object r1 = r13.A01
            X.7DY r1 = (X.AnonymousClass7DY) r1
            X.1FU r0 = X.AnonymousClass7DY.A04(r1)
            X.1GP r0 = X.AnonymousClass3MX.A0O(r0)
            X.1jj r3 = new X.1jj
            r3.<init>(r0)
            r2 = 2131431056(0x7f0b0e90, float:1.848383E38)
            androidx.fragment.app.Fragment r1 = r1.A0v
            java.lang.String r0 = "media_picker_fragment_tag"
            r3.A0D(r1, r0, r2)
            r3.A02()
            return
        L_0x0314:
            X.C18070vi.A11(r2)
            goto L_0x033e
        L_0x0318:
            int r1 = r4.getWidth()
            r0 = 1073741824(0x40000000, float:2.0)
            X.C108985cd.A10(r4, r1, r0)
            r4.removeOnLayoutChangeListener(r13)
            int r0 = r4.getMeasuredHeight()
            int r0 = r0 + r16
            r4.layout(r15, r6, r7, r0)
            r4.addOnLayoutChangeListener(r13)
            return
        L_0x0331:
            X.C18070vi.A11(r8)
            goto L_0x033e
        L_0x0335:
            android.view.ViewGroup r0 = r5.A03
            if (r0 != 0) goto L_0x0340
            java.lang.String r0 = "penDoodleTopBar"
        L_0x033b:
            X.C18070vi.A11(r0)
        L_0x033e:
            r0 = 0
            throw r0
        L_0x0340:
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            X.C18070vi.A0z(r1, r3)
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            int r0 = r4.topMargin
            r1.setMargins(r2, r0, r2, r2)
            com.whatsapp.mediacomposer.doodle.ColorPickerComponent r0 = r5.A07
            if (r0 != 0) goto L_0x0355
            java.lang.String r0 = "colorPicker"
            goto L_0x033b
        L_0x0355:
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            X.C18070vi.A0z(r1, r3)
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            int r0 = r4.topMargin
            r1.setMargins(r2, r0, r2, r2)
            return
        L_0x0364:
            r2.notifyDataSetChanged()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1420978d.onLayoutChange(android.view.View, int, int, int, int, int, int, int, int):void");
    }

    public C1420978d(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}
