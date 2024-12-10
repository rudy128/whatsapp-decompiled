package X;

import android.content.Context;
import android.text.Editable;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaEditText;
import com.whatsapp.WaImageView;

/* renamed from: X.6oT  reason: invalid class name and case insensitive filesystem */
public class C133266oT {
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public AnonymousClass1L2 A03;
    public final Context A04;
    public final ViewGroup A05;
    public final ViewGroup A06;
    public final FrameLayout A07;
    public final FrameLayout A08;
    public final AnonymousClass1KB A09;
    public final TextEmojiLabel A0A;
    public final TextEmojiLabel A0B;
    public final WaEditText A0C;
    public final WaImageView A0D;
    public final C18000vb A0E;
    public final C32091gc A0F;
    public final AnonymousClass1W6 A0G;
    public final AnonymousClass3TD A0H = new AnonymousClass1DS();
    public final AnonymousClass3TD A0I;
    public final C32021gV A0J;
    public final C41111vp A0K;
    public final AnonymousClass10I A0L;
    public final boolean A0M;
    public final boolean A0N;
    public final boolean A0O;

    public String A00() {
        Editable text;
        if ((!C72463Mc.A1O(this.A0K) || this.A0N || this.A02) && (text = this.A0C.getText()) != null) {
            return C26302CxJ.A0G(text.toString(), false);
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.3TD, X.1DS] */
    /* JADX WARNING: type inference failed for: r0v1, types: [X.3TD, X.1DS] */
    /* JADX WARNING: type inference failed for: r0v7, types: [java.lang.Object, X.1L2] */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x00c1, code lost:
        if (X.C36301nf.A02(r10.A02, X.C18040vf.A02, 12347) == false) goto L_0x00c3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C133266oT(android.view.ViewGroup r28, X.AnonymousClass1F9 r29, X.AnonymousClass1KB r30, X.AnonymousClass11C r31, X.C18000vb r32, X.AnonymousClass1KW r33, X.C18030ve r34, X.C32091gc r35, X.AnonymousClass1c4 r36, X.C18010vc r37, X.AnonymousClass1W6 r38, X.C32021gV r39, X.AnonymousClass10I r40, boolean r41) {
        /*
            r27 = this;
            r5 = r27
            r5.<init>()
            X.3TD r1 = new X.3TD
            r1.<init>()
            r5.A0I = r1
            r2 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            X.1vp r9 = X.AnonymousClass3MW.A0n(r0)
            r5.A0K = r9
            X.3TD r0 = new X.3TD
            r0.<init>()
            r5.A0H = r0
            r0 = r30
            r5.A09 = r0
            r0 = r35
            r5.A0F = r0
            r0 = r40
            r5.A0L = r0
            r0 = r38
            r5.A0G = r0
            r0 = r39
            r5.A0J = r0
            r6 = r28
            android.content.Context r10 = r6.getContext()
            r5.A04 = r10
            r5.A06 = r6
            r11 = r32
            r5.A0E = r11
            X.1L3 r0 = new X.1L3
            r0.<init>()
            r5.A03 = r0
            r0 = 2131436137(0x7f0b2269, float:1.8494136E38)
            android.widget.FrameLayout r8 = X.C108945cZ.A0P(r6, r0)
            r5.A08 = r8
            r0 = 2131428832(0x7f0b05e0, float:1.847932E38)
            android.widget.FrameLayout r7 = X.C108945cZ.A0P(r6, r0)
            r5.A07 = r7
            r0 = 2131436208(0x7f0b22b0, float:1.849428E38)
            com.whatsapp.TextEmojiLabel r0 = X.AnonymousClass3MX.A0V(r6, r0)
            r5.A0B = r0
            r0 = 2131435885(0x7f0b216d, float:1.8493625E38)
            com.whatsapp.TextEmojiLabel r0 = X.AnonymousClass3MX.A0V(r6, r0)
            r5.A0A = r0
            r0 = 2131436135(0x7f0b2267, float:1.8494132E38)
            com.whatsapp.WaImageView r0 = X.AnonymousClass3MW.A0R(r8, r0)
            r5.A0D = r0
            r3 = r41
            r5.A0M = r3
            r0 = 2131427821(0x7f0b01ed, float:1.847727E38)
            android.view.ViewGroup r4 = X.AnonymousClass3MW.A0C(r6, r0)
            r5.A05 = r4
            r0 = 2131427820(0x7f0b01ec, float:1.8477267E38)
            android.view.View r14 = X.AnonymousClass1HF.A06(r4, r0)
            com.whatsapp.WaEditText r14 = (com.whatsapp.WaEditText) r14
            r5.A0C = r14
            r4 = 2131231514(0x7f08031a, float:1.8079111E38)
            android.graphics.drawable.Drawable r0 = X.C24261Jm.A00(r10, r4)
            r7.setForeground(r0)
            android.graphics.drawable.Drawable r0 = X.C24261Jm.A00(r10, r4)
            r8.setForeground(r0)
            r4 = 1
            r6.setClickable(r4)
            r0 = 2
            r6.setImportantForAccessibility(r0)
            r7.setClickable(r4)
            r7.setImportantForAccessibility(r0)
            r0 = 10
            r12 = r29
            X.AnonymousClass7AO.A01(r12, r1, r5, r0)
            r10 = r36
            if (r41 == 0) goto L_0x00c3
            X.0ve r13 = r10.A02
            r1 = 12347(0x303b, float:1.7302E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r1 = X.C36301nf.A02(r13, r0, r1)
            r0 = 1
            if (r1 != 0) goto L_0x00c4
        L_0x00c3:
            r0 = 0
        L_0x00c4:
            r5.A0N = r0
            X.0ve r10 = r10.A02
            r1 = 12348(0x303c, float:1.7303E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C36301nf.A02(r10, r0, r1)
            r5.A0O = r0
            r0 = 2131428811(0x7f0b05cb, float:1.8479277E38)
            android.view.View r1 = X.AnonymousClass1HF.A06(r6, r0)
            if (r41 == 0) goto L_0x00dd
            r2 = 8
        L_0x00dd:
            r0 = 37
            X.AnonymousClass3Ma.A1B(r1, r5, r0)
            r0 = r41 ^ 1
            r1.setEnabled(r0)
            r1.setVisibility(r2)
            android.animation.LayoutTransition r10 = r6.getLayoutTransition()
            android.animation.Animator r3 = r10.getAnimator(r4)
            boolean r0 = r3 instanceof android.animation.ObjectAnimator
            if (r0 == 0) goto L_0x010c
            android.animation.AnimatorSet r2 = X.C108945cZ.A0B()
            long r0 = r3.getStartDelay()
            r2.setStartDelay(r0)
            r0 = 0
            r3.setStartDelay(r0)
            r2.play(r3)
            r10.setAnimator(r4, r2)
        L_0x010c:
            r1 = 3
            r2 = 100
            r10.setDuration(r1, r2)
            android.view.animation.AccelerateDecelerateInterpolator r0 = new android.view.animation.AccelerateDecelerateInterpolator
            r0.<init>()
            r10.setInterpolator(r1, r0)
            r0 = 200(0xc8, double:9.9E-322)
            r10.setDuration(r4, r0)
            r10.setStartDelay(r4, r2)
            android.view.animation.AccelerateDecelerateInterpolator r0 = new android.view.animation.AccelerateDecelerateInterpolator
            r0.<init>()
            r10.setInterpolator(r4, r0)
            X.1L2 r0 = r5.A03
            r15 = 0
            r22 = 1024(0x400, float:1.435E-42)
            r23 = 30
            r25 = 0
            X.48A r13 = new X.48A
            r26 = r4
            r16 = r31
            r19 = r33
            r20 = r34
            r21 = r37
            r24 = r4
            r17 = r11
            r18 = r0
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r14.addTextChangedListener(r13)
            X.48C r0 = new X.48C
            r0.<init>(r14, r11)
            r14.addTextChangedListener(r0)
            X.6Ib r0 = new X.6Ib
            r0.<init>(r8, r14)
            r14.addTextChangedListener(r0)
            r0 = 11
            X.AnonymousClass7AO.A01(r12, r9, r5, r0)
            android.view.ViewTreeObserver r1 = r7.getViewTreeObserver()
            r0 = 2
            X.AnonymousClass795.A00(r1, r5, r6, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C133266oT.<init>(android.view.ViewGroup, X.1F9, X.1KB, X.11C, X.0vb, X.1KW, X.0ve, X.1gc, X.1c4, X.0vc, X.1W6, X.1gV, X.10I, boolean):void");
    }
}
