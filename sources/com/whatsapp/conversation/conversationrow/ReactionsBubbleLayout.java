package com.whatsapp.conversation.conversationrow;

import X.AnonymousClass00H;
import X.AnonymousClass3MW;
import X.AnonymousClass3Ma;
import X.AnonymousClass8BG;
import X.C110615gM;
import X.C18000vb;
import X.C18030ve;
import X.C72463Mc;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import java.util.List;

public class ReactionsBubbleLayout extends C110615gM {
    public int A00;
    public int A01;
    public int A02;
    public C18000vb A03;
    public C18030ve A04;
    public AnonymousClass00H A05;
    public List A06;
    public List A07;
    public boolean A08 = true;
    public boolean A09 = false;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public AnonymousClass8BG A0F;

    /* JADX WARNING: type inference failed for: r9v1, types: [com.whatsapp.RollingCounterView, X.5rh, android.view.View] */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        if (r7.BXt() == 0) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(X.AnonymousClass8BG r19, boolean r20, boolean r21) {
        /*
            r18 = this;
            r5 = r18
            r0 = r20
            r5.A0C = r0
            r0 = r21
            r5.A0E = r0
            X.8BG r7 = r5.A0F
            if (r7 == 0) goto L_0x0015
            int r1 = r7.BXt()
            r0 = 0
            if (r1 != 0) goto L_0x0016
        L_0x0015:
            r0 = 1
        L_0x0016:
            r5.A0D = r0
            X.0ve r2 = r5.A04
            java.lang.String[] r0 = X.C1409073n.A04
            r0 = 0
            X.C18070vi.A0d(r2, r0)
            r1 = 2378(0x94a, float:3.332E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            r4 = 3
            if (r0 == 0) goto L_0x002c
            r4 = 4
        L_0x002c:
            r8 = r19
            if (r19 != 0) goto L_0x0096
            r6 = 0
            r0 = 0
        L_0x0032:
            r5.A0F = r0
            java.util.List r9 = r5.A07
            if (r9 == 0) goto L_0x00e2
            boolean r0 = r9.isEmpty()
            if (r0 != 0) goto L_0x00e2
            java.util.ArrayList r4 = X.AnonymousClass000.A13()
            if (r6 == 0) goto L_0x00e3
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x00e3
            java.util.Iterator r10 = r6.iterator()
        L_0x004e:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x00e3
            java.lang.String r3 = X.C17880vN.A0v(r10)
            r2 = 0
            if (r19 == 0) goto L_0x0063
            X.7PW r0 = r8.BMg(r3)
            if (r0 == 0) goto L_0x0063
            int r2 = r0.A00
        L_0x0063:
            r1 = 0
            if (r7 == 0) goto L_0x006e
            X.7PW r0 = r7.BMg(r3)
            if (r0 == 0) goto L_0x006e
            int r1 = r0.A00
        L_0x006e:
            if (r2 > r1) goto L_0x0092
            r2 = 0
            if (r19 == 0) goto L_0x007d
            X.7PW r0 = r8.BMg(r3)
            if (r0 == 0) goto L_0x007d
            int r2 = r0.A00()
        L_0x007d:
            r1 = 0
            if (r7 == 0) goto L_0x008a
            X.7PW r0 = r7.BMg(r3)
            if (r0 == 0) goto L_0x008a
            int r1 = r0.A00()
        L_0x008a:
            if (r2 <= r1) goto L_0x004e
            boolean r0 = r9.contains(r3)
            if (r0 != 0) goto L_0x004e
        L_0x0092:
            r4.add(r3)
            goto L_0x004e
        L_0x0096:
            boolean r0 = r8 instanceof X.AnonymousClass7C9
            if (r0 == 0) goto L_0x00a6
            X.73n r1 = X.C1409073n.A03
            r0 = 1
            java.util.ArrayList r6 = r1.A05(r8, r4, r0)
        L_0x00a1:
            X.8BG r0 = r8.BHF()
            goto L_0x0032
        L_0x00a6:
            int r0 = r8.BMi()
            int r0 = java.lang.Math.min(r0, r4)
            java.util.ArrayList r6 = X.C17880vN.A0z(r0)
            java.util.Iterator r3 = r8.BMh()
        L_0x00b6:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00a1
            if (r4 <= 0) goto L_0x00a1
            java.lang.Object r2 = r3.next()
            X.7PW r2 = (X.AnonymousClass7PW) r2
            java.lang.String r1 = X.C43271zX.A00
            java.lang.String r0 = r2.A02
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 != 0) goto L_0x00dc
            java.util.TreeSet r0 = r2.A04
            java.util.Iterator r0 = r0.descendingIterator()
            java.lang.Object r0 = r0.next()
            X.7PX r0 = (X.AnonymousClass7PX) r0
            java.lang.String r1 = r0.A05
        L_0x00dc:
            r6.add(r1)
            int r4 = r4 + -1
            goto L_0x00b6
        L_0x00e2:
            r4 = r6
        L_0x00e3:
            r5.A06 = r4
            if (r19 == 0) goto L_0x0194
            int r8 = r8.BXt()
        L_0x00eb:
            if (r6 != 0) goto L_0x018e
            r7 = 0
        L_0x00ee:
            int r1 = r5.A01
            r11 = 0
            r10 = 1
            r0 = 2
            boolean r1 = X.C108975cc.A1C(r1, r0)
            r4 = 2
            boolean r0 = X.C108975cc.A1C(r8, r0)
            if (r1 == 0) goto L_0x011e
            if (r0 != 0) goto L_0x0108
            int r0 = r5.getChildCount()
            int r0 = r0 - r10
            r5.removeViewAt(r0)
        L_0x0108:
            java.util.List r0 = r5.A07
            int r3 = X.C72463Mc.A0C(r0)
            if (r3 == r7) goto L_0x0111
            r11 = 1
        L_0x0111:
            r5.A09 = r11
            if (r3 <= r7) goto L_0x0197
            int r3 = r3 - r10
        L_0x0116:
            if (r3 < r7) goto L_0x01ad
            r5.removeViewAt(r3)
            int r3 = r3 + -1
            goto L_0x0116
        L_0x011e:
            if (r0 == 0) goto L_0x0108
            android.app.Activity r0 = X.AnonymousClass3Ma.A05(r5)
            X.5rh r9 = new X.5rh
            r9.<init>(r0)
            boolean r0 = r9.A02
            if (r0 != 0) goto L_0x013b
            r9.A02 = r10
            java.lang.Object r0 = r9.generatedComponent()
            X.033 r0 = (X.AnonymousClass033) r0
            X.0vb r0 = X.C72473Md.A0S(r0)
            r9.A00 = r0
        L_0x013b:
            r1 = -2
            android.view.ViewGroup$MarginLayoutParams r0 = new android.view.ViewGroup$MarginLayoutParams
            r0.<init>(r1, r1)
            r9.setLayoutParams(r0)
            int r0 = r5.A02
            r9.A01 = r0
            r9.A02 = r0
            android.content.res.Resources r3 = r5.getResources()
            boolean r0 = r5.A0A
            if (r0 == 0) goto L_0x017f
            r0 = 2131103410(0x7f060eb2, float:1.7819285E38)
        L_0x0155:
            int r0 = r3.getColor(r0)
            r9.setTextColor(r0)
            int r1 = r5.A00
            android.graphics.Rect r0 = r9.A0A
            r0.setEmpty()
            com.whatsapp.TextEmojiLabel r0 = r9.A07
            float r1 = (float) r1
            r0.setTextSize(r11, r1)
            com.whatsapp.TextEmojiLabel r0 = r9.A08
            r0.setTextSize(r11, r1)
            r2 = 200(0xc8, double:9.9E-322)
            r0 = 300(0x12c, double:1.48E-321)
            r9.A04 = r2
            r9.A03 = r0
            android.view.animation.Interpolator r0 = X.C1409073n.A01
            r9.setAnimationInterpolator(r0)
            r5.addView(r9)
            goto L_0x0108
        L_0x017f:
            android.content.Context r2 = r9.getContext()
            r1 = 2130971113(0x7f0409e9, float:1.7550955E38)
            r0 = 2131102439(0x7f060ae7, float:1.7817316E38)
            int r0 = X.AnonymousClass1YL.A00(r2, r1, r0)
            goto L_0x0155
        L_0x018e:
            int r7 = r6.size()
            goto L_0x00ee
        L_0x0194:
            r8 = 0
            goto L_0x00eb
        L_0x0197:
            if (r7 <= r3) goto L_0x01ad
        L_0x0199:
            if (r3 >= r7) goto L_0x01ad
            android.content.Context r2 = r5.getContext()
            r1 = 2131626670(0x7f0e0aae, float:1.8880583E38)
            r0 = 0
            android.view.View r0 = android.view.View.inflate(r2, r1, r0)
            r5.addView(r0, r3)
            int r3 = r3 + 1
            goto L_0x0199
        L_0x01ad:
            r5.A07 = r6
            r5.A01 = r8
            if (r6 == 0) goto L_0x044c
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x044c
            r6 = 0
            r5.setVisibility(r6)
            r9 = 0
        L_0x01be:
            java.util.List r0 = r5.A07
            int r0 = r0.size()
            r3 = 1
            if (r9 >= r0) goto L_0x0351
            int r0 = r5.getChildCount()
            if (r9 >= r0) goto L_0x0351
            android.view.View r8 = r5.getChildAt(r9)
            com.whatsapp.TextEmojiLabel r8 = (com.whatsapp.TextEmojiLabel) r8
            java.util.List r0 = r5.A07
            java.lang.String r7 = X.C17880vN.A0w(r0, r9)
            boolean r0 = r5.A08
            if (r0 == 0) goto L_0x034d
            boolean r0 = r5.A0B
            if (r0 != 0) goto L_0x034d
            boolean r0 = r5.A0C
            if (r0 != 0) goto L_0x034d
            java.util.List r0 = r5.A06
            if (r0 == 0) goto L_0x034d
            boolean r0 = r0.contains(r7)
            if (r0 == 0) goto L_0x034d
            r5.A0B = r3
            boolean r0 = r5.A0D
            if (r0 == 0) goto L_0x024e
            android.animation.AnimatorSet r12 = X.C108945cZ.A0B()
            android.animation.AnimatorSet r13 = X.C108945cZ.A0B()
            float[] r0 = new float[r4]
            r0 = {0, 1066192077} // fill-array
            java.lang.String r14 = "scaleX"
            android.animation.ObjectAnimator r16 = android.animation.ObjectAnimator.ofFloat(r5, r14, r0)
            float[] r0 = new float[r4]
            r0 = {0, 1066192077} // fill-array
            java.lang.String r15 = "scaleY"
            android.animation.ObjectAnimator r10 = android.animation.ObjectAnimator.ofFloat(r5, r15, r0)
            r0 = 130(0x82, double:6.4E-322)
            r13.setDuration(r0)
            android.view.animation.Interpolator r11 = X.C1409073n.A01
            r13.setInterpolator(r11)
            android.animation.Animator[] r2 = new android.animation.Animator[r4]
            r2[r6] = r16
            android.animation.AnimatorSet r10 = X.C108985cd.A0A(r13, r10, r2, r3)
            float[] r2 = new float[r4]
            r2 = {1066192077, 1065353216} // fill-array
            android.animation.ObjectAnimator r14 = android.animation.ObjectAnimator.ofFloat(r5, r14, r2)
            float[] r2 = new float[r4]
            r2 = {1066192077, 1065353216} // fill-array
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofFloat(r5, r15, r2)
            android.animation.Animator[] r2 = X.C108945cZ.A1Z(r14, r2, r4, r6)
            r10.playTogether(r2)
            r13.setDuration(r0)
            r13.setInterpolator(r11)
            android.animation.Animator[] r0 = X.C108945cZ.A1Z(r13, r10, r4, r6)
            r12.playSequentially(r0)
            r12.start()
        L_0x024e:
            java.lang.CharSequence r17 = r8.getText()
            android.animation.AnimatorSet r15 = X.C108945cZ.A0B()
            float[] r0 = new float[r4]
            r0 = {0, 1067030938} // fill-array
            java.lang.String r13 = "scaleX"
            android.animation.ObjectAnimator r14 = android.animation.ObjectAnimator.ofFloat(r8, r13, r0)
            float[] r0 = new float[r4]
            r0 = {0, 1067030938} // fill-array
            java.lang.String r2 = "scaleY"
            android.animation.ObjectAnimator r11 = android.animation.ObjectAnimator.ofFloat(r8, r2, r0)
            r0 = 100
            r15.setDuration(r0)
            android.view.animation.Interpolator r12 = X.C1409073n.A00
            r15.setInterpolator(r12)
            android.animation.Animator[] r10 = new android.animation.Animator[r4]
            r10[r6] = r14
            android.animation.AnimatorSet r14 = X.C108985cd.A0A(r15, r11, r10, r3)
            float[] r10 = new float[r4]
            r10 = {1067030938, 1064346583} // fill-array
            android.animation.ObjectAnimator r16 = android.animation.ObjectAnimator.ofFloat(r8, r13, r10)
            float[] r10 = new float[r4]
            r10 = {1067030938, 1064346583} // fill-array
            android.animation.ObjectAnimator r11 = android.animation.ObjectAnimator.ofFloat(r8, r2, r10)
            r14.setDuration(r0)
            r14.setStartDelay(r0)
            r14.setInterpolator(r12)
            android.animation.Animator[] r10 = new android.animation.Animator[r4]
            r10[r6] = r16
            android.animation.AnimatorSet r10 = X.C108985cd.A0A(r14, r11, r10, r3)
            float[] r11 = new float[r4]
            r11 = {1064346583, 1065353216} // fill-array
            android.animation.ObjectAnimator r16 = android.animation.ObjectAnimator.ofFloat(r8, r13, r11)
            float[] r11 = new float[r4]
            r11 = {1064346583, 1065353216} // fill-array
            android.animation.ObjectAnimator r11 = android.animation.ObjectAnimator.ofFloat(r8, r2, r11)
            r10.setDuration(r0)
            r10.setStartDelay(r0)
            r10.setInterpolator(r12)
            android.animation.Animator[] r0 = new android.animation.Animator[r4]
            r0[r6] = r16
            android.animation.AnimatorSet r11 = X.C108985cd.A0A(r10, r11, r0, r3)
            r0 = 3
            android.animation.Animator[] r0 = X.C108945cZ.A1Z(r15, r14, r0, r6)
            r0[r4] = r10
            r11.playSequentially(r0)
            X.5cq r0 = new X.5cq
            r0.<init>(r8, r5, r7)
            r11.addListener(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r17)
            if (r0 != 0) goto L_0x0349
            boolean r0 = r5.A09
            if (r0 != 0) goto L_0x0349
            android.animation.AnimatorSet r10 = X.C108945cZ.A0B()
            float[] r0 = new float[r4]
            r0 = {1065353216, 0} // fill-array
            android.animation.ObjectAnimator r13 = android.animation.ObjectAnimator.ofFloat(r8, r13, r0)
            float[] r0 = new float[r4]
            r0 = {1065353216, 0} // fill-array
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofFloat(r8, r2, r0)
            r0 = 100
            r10.setDuration(r0)
            r10.setInterpolator(r12)
            android.animation.Animator[] r0 = new android.animation.Animator[r4]
            r0[r6] = r13
            android.animation.AnimatorSet r1 = X.C108985cd.A0A(r10, r2, r0, r3)
            android.animation.Animator[] r0 = X.C108945cZ.A1Z(r10, r11, r4, r6)
            r1.playSequentially(r0)
            r1.start()
        L_0x0310:
            X.C18070vi.A0d(r7, r6)
            X.737 r0 = new X.737
            r0.<init>((java.lang.String) r7)
            int[] r0 = r0.A00
            int[] r0 = X.AnonymousClass74I.A08(r0)
            java.lang.String r1 = X.C137176v2.A01(r0)
            java.lang.String[] r0 = X.C1409073n.A04
            boolean r0 = X.C200410p.A0U(r1, r0)
            if (r0 == 0) goto L_0x0342
            android.content.res.Resources r1 = r5.getResources()
            r0 = 2131168415(0x7f070c9f, float:1.7951131E38)
            int r1 = r1.getDimensionPixelSize(r0)
            android.view.ViewGroup$MarginLayoutParams r0 = X.AnonymousClass3MW.A0B(r8)
            r0.bottomMargin = r1
        L_0x033b:
            r8.setLayoutParams(r0)
            int r9 = r9 + 1
            goto L_0x01be
        L_0x0342:
            android.view.ViewGroup$MarginLayoutParams r0 = X.AnonymousClass3MW.A0B(r8)
            r0.bottomMargin = r6
            goto L_0x033b
        L_0x0349:
            r11.start()
            goto L_0x0310
        L_0x034d:
            r8.A0R(r7)
            goto L_0x0310
        L_0x0351:
            int r0 = r5.A01
            if (r0 < r4) goto L_0x03b2
            int r0 = r5.getChildCount()
            int r0 = r0 - r3
            android.view.View r1 = r5.getChildAt(r0)
            boolean r0 = r1 instanceof com.whatsapp.RollingCounterView
            if (r0 == 0) goto L_0x0433
            int r7 = r5.A01
            boolean r0 = r5.A0E
            if (r0 == 0) goto L_0x0430
            X.00H r0 = r5.A05
            java.lang.Object r2 = r0.get()
            X.4XM r2 = (X.AnonymousClass4XM) r2
            int r0 = r5.A01
            int r7 = X.AnonymousClass4XM.A00(r2, r0)
            java.lang.String r2 = r2.A01(r7)
            X.C18070vi.A0d(r2, r3)
        L_0x037d:
            com.whatsapp.RollingCounterView r1 = (com.whatsapp.RollingCounterView) r1
            boolean r0 = r5.A0C
            if (r0 != 0) goto L_0x0388
            boolean r0 = r5.A08
            if (r0 == 0) goto L_0x0388
            r6 = 1
        L_0x0388:
            r1.A09 = r2
            if (r6 == 0) goto L_0x042a
            long r9 = r1.A04
            long r11 = r1.A03
        L_0x0390:
            if (r2 == 0) goto L_0x039e
            java.lang.String r0 = r1.getPrimaryText()
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x039e
            r11 = 0
        L_0x039e:
            X.6gw r0 = r1.A05
            if (r0 != 0) goto L_0x041a
            int r0 = r1.A00
            if (r7 == r0) goto L_0x03b2
            r8 = -1
            if (r0 >= r7) goto L_0x03aa
            r8 = 1
        L_0x03aa:
            X.6gw r6 = new X.6gw
            r6.<init>(r7, r8, r9, r11)
            com.whatsapp.RollingCounterView.A01(r6, r1)
        L_0x03b2:
            java.util.List r0 = r5.A07
            if (r0 == 0) goto L_0x0456
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0456
            java.util.List r1 = r5.A07
            r7 = 0
            java.lang.CharSequence[] r0 = new java.lang.CharSequence[r7]
            java.lang.Object[] r1 = r1.toArray(r0)
            java.lang.CharSequence[] r1 = (java.lang.CharSequence[]) r1
            java.lang.String r0 = ", "
            java.lang.String r6 = X.AnonymousClass1EG.A08(r0, r1)
            java.util.List r0 = r5.A07
            int r0 = r0.size()
            if (r0 != r3) goto L_0x03e8
            android.content.Context r2 = r5.getContext()
            r1 = 2131894917(0x7f122285, float:1.9424652E38)
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r0[r7] = r6
        L_0x03e0:
            java.lang.String r0 = r2.getString(r1, r0)
            r5.setContentDescription(r0)
            return
        L_0x03e8:
            boolean r0 = r5.A0E
            if (r0 == 0) goto L_0x040d
            X.00H r0 = r5.A05
            java.lang.Object r1 = r0.get()
            X.4XM r1 = (X.AnonymousClass4XM) r1
            int r0 = r5.A01
            int r0 = X.AnonymousClass4XM.A00(r1, r0)
            java.lang.String r0 = r1.A01(r0)
            X.C18070vi.A0d(r0, r3)
        L_0x0401:
            android.content.Context r2 = r5.getContext()
            r1 = 2131894916(0x7f122284, float:1.942465E38)
            java.lang.Object[] r0 = X.C108945cZ.A1a(r6, r0, r4, r3)
            goto L_0x03e0
        L_0x040d:
            X.0vb r2 = r5.A03
            android.content.Context r1 = r5.getContext()
            int r0 = r5.A01
            java.lang.String r0 = X.C1409073n.A01(r1, r2, r0)
            goto L_0x0401
        L_0x041a:
            int r0 = r0.A00
            if (r7 == r0) goto L_0x03b2
            r8 = -1
            if (r0 >= r7) goto L_0x0422
            r8 = 1
        L_0x0422:
            X.6gw r6 = new X.6gw
            r6.<init>(r7, r8, r9, r11)
            r1.A06 = r6
            goto L_0x03b2
        L_0x042a:
            r9 = 0
            r11 = 0
            goto L_0x0390
        L_0x0430:
            r2 = 0
            goto L_0x037d
        L_0x0433:
            java.lang.StringBuilder r1 = X.C17890vO.A0f(r1)
            java.lang.String r0 = " is not of type RollingCounterView! Something has gone wrong inside ensureViews(). childCount="
            r1.append(r0)
            int r0 = r5.getChildCount()
            r1.append(r0)
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0m(r1)
            X.C17960vV.A0B(r0)
            goto L_0x03b2
        L_0x044c:
            java.util.List r1 = r5.A07
            r0 = 8
            if (r1 != 0) goto L_0x0453
            r0 = 4
        L_0x0453:
            r5.setVisibility(r0)
        L_0x0456:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversation.conversationrow.ReactionsBubbleLayout.A02(X.8BG, boolean, boolean):void");
    }

    public ReactionsBubbleLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A01();
        A00(false);
    }

    private void A00(boolean z) {
        LinearLayout.LayoutParams A0D2 = AnonymousClass3Ma.A0D();
        setGravity(17);
        setMinimumHeight(getResources().getDimensionPixelSize(2131168416));
        setLayoutParams(A0D2);
        setOrientation(0);
        int i = 2131232857;
        if (z) {
            i = 2131232858;
        }
        setBackgroundResource(i);
        this.A02 = C72463Mc.A06(this);
        int dimensionPixelSize = getResources().getDimensionPixelSize(2131168783);
        int i2 = this.A02;
        setPadding(i2, dimensionPixelSize, i2, dimensionPixelSize);
        this.A00 = getResources().getDimensionPixelSize(2131168414);
        setVisibility(8);
        setId(2131434359);
        setClipToPadding(false);
        setClipChildren(false);
        ViewParent parent = getParent();
        if (parent != null && (parent instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) parent;
            viewGroup.setClipToPadding(false);
            viewGroup.setClipChildren(false);
        }
        setFocusable(true);
        AnonymousClass3MW.A1Q(this);
    }

    public void setAreAnimationsEnabled(boolean z) {
        this.A08 = z;
    }

    public ReactionsBubbleLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        A01();
        A00(false);
    }

    public ReactionsBubbleLayout(Context context, boolean z) {
        super(context);
        A01();
        this.A0A = z;
        A00(z);
    }

    public ReactionsBubbleLayout(Context context) {
        super(context);
        A01();
        A00(false);
    }

    public ReactionsBubbleLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00(false);
    }
}
