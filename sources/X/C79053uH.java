package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.TextView;
import com.whatsapp.WaImageView;
import com.whatsapp.conversation.conversationrow.PushToVideoInlineVideoPlayer;
import com.whatsapp.pushtorecordmedia.MediaProgressRing;
import com.whatsapp.pushtorecordmedia.MediaTimeDisplay;
import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.3uH  reason: invalid class name and case insensitive filesystem */
public class C79053uH extends C78673tK {
    public static final Interpolator A0d = C29111bd.A00(0.85f, 0.0f, 0.15f, 1.0f);
    public int A00 = -1;
    public int A01 = -1;
    public AnimatorSet A02;
    public C223819r A03;
    public AnonymousClass00H A04;
    public AnonymousClass00H A05 = C221618v.A00(C216616x.class);
    public AnonymousClass00H A06;
    public boolean A07 = false;
    public boolean A08 = false;
    public boolean A09 = false;
    public int A0A;
    public int A0B;
    public AnonymousClass205 A0C = null;
    public AnonymousClass205 A0D = null;
    public AnonymousClass1A3 A0E = AnonymousClass1A3.A01;
    public boolean A0F = false;
    public final int A0G;
    public final Animator.AnimatorListener A0H = new C88664aa(this, 4);
    public final View A0I = AnonymousClass1HF.A06(this, 2131436583);
    public final ViewGroup A0J = AnonymousClass3MW.A0C(this, 2131432381);
    public final ViewGroup A0K = AnonymousClass3MW.A0C(this, 2131433365);
    public final ViewGroup A0L = AnonymousClass3MW.A0C(this, 2131434183);
    public final ViewGroup A0M;
    public final TextView A0N = AnonymousClass3MW.A0J(this, 2131432425);
    public final AnonymousClass1DT A0O = AnonymousClass3MW.A0M((Object) null);
    public final WaImageView A0P = AnonymousClass3MW.A0R(this, 2131433885);
    public final PushToVideoInlineVideoPlayer A0Q = ((PushToVideoInlineVideoPlayer) AnonymousClass1HF.A06(this, 2131431643));
    public final C41111vp A0R = AnonymousClass3MW.A0n(false);
    public final C38471rL A0S = new C825048f(this, 14);
    public final C28931bI A0T = C28931bI.A00(this, 2131428820);
    public final C28931bI A0U = C28931bI.A00(this, 2131434181);
    public final AnonymousClass88S A0V = new AnonymousClass4r0(this, 0);
    public final View.OnClickListener A0W = new C89904dD(this, 48);
    public final View.OnTouchListener A0X = new C90334du((Object) this, 16);
    public final View A0Y;
    public final C22851Dl A0Z = new C91624fz(this, 36);
    public final MediaProgressRing A0a;
    public final MediaTimeDisplay A0b;
    public final C38471rL A0c = new C825048f(this, 15);

    public void A1u() {
        AnonymousClass3uP.A0h(this, false);
        A03(this);
    }

    private void A01() {
        AnonymousClass205 r1;
        AnonymousClass205 r2 = this.A0C;
        if (this.A0F) {
            r1 = this.A0I.A0v;
        } else {
            r1 = null;
        }
        this.A0C = r1;
        if (!C42171xk.A00(r1, r2)) {
            MediaTimeDisplay mediaTimeDisplay = this.A0b;
            Runnable runnable = mediaTimeDisplay.A04;
            if (runnable != null) {
                runnable.run();
            }
            if (r1 != null) {
                AnonymousClass206 r22 = this.A0I;
                AnonymousClass1F9 A002 = AnonymousClass1ZG.A00(getRootView());
                if (A002 != null) {
                    mediaTimeDisplay.A03(A002, new C97624pm(this, r22));
                }
            }
        }
    }

    private void A02() {
        AnonymousClass205 r1;
        AnonymousClass1F9 A002;
        AnonymousClass205 r2 = this.A0D;
        if (this.A0F) {
            r1 = this.A0I.A0v;
        } else {
            r1 = null;
        }
        this.A0D = r1;
        if (!C42171xk.A00(r1, r2)) {
            MediaProgressRing mediaProgressRing = this.A0a;
            mediaProgressRing.A01();
            if (r1 != null && (A002 = AnonymousClass1ZG.A00(getRootView())) != null) {
                mediaProgressRing.A02(A002, new C97614pl(this, 1));
            }
        }
    }

    public static void A03(C79053uH r3) {
        AnonymousClass00H r2 = r3.A05;
        if (C72473Md.A0g(r2) != r3.A0I.A0v || !AnonymousClass3MX.A0d(r2).A02) {
            r3.A04(false);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0064, code lost:
        if (r15.getPlaybackState() != 3) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007c, code lost:
        if (r7.A09 != false) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x008f, code lost:
        if (r7.A08 != false) goto L_0x0091;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x014f, code lost:
        if (r1.A01() == 0) goto L_0x0151;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x004e, code lost:
        if (r15.getPlaybackState() != 3) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x021b, code lost:
        if (r11 == r7.A00) goto L_0x01b4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0221  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0224  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x022e  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0232  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0242  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0161  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0170  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x017f  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0185  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0219  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A04(boolean r29) {
        /*
            r28 = this;
            r7 = r28
            X.206 r6 = r7.A0I
            X.21V r6 = (X.AnonymousClass21V) r6
            X.21X r6 = (X.AnonymousClass21X) r6
            if (r29 == 0) goto L_0x001c
            X.1A3 r0 = X.AnonymousClass1A3.A01
            r7.A0E = r0
            X.205 r1 = r6.A0v
            X.00H r0 = r7.A05
            java.lang.Object r0 = X.C72473Md.A0g(r0)
            boolean r0 = r1.equals(r0)
            r7.A07 = r0
        L_0x001c:
            X.206 r0 = r7.A0I
            X.205 r0 = r0.A0v
            boolean r1 = r0.A02
            X.205 r0 = r6.A0v
            r27 = r0
            r7.hashCode()
            X.21V r0 = r7.getFMessage()
            X.AnonymousClass25A.A11(r0)
            X.21V r0 = r7.getFMessage()
            X.AnonymousClass25A.A12(r0)
            X.21V r0 = r7.getFMessage()
            X.AnonymousClass4H3.A00(r0)
            com.whatsapp.conversation.conversationrow.PushToVideoInlineVideoPlayer r15 = r7.A0Q
            X.49n r4 = r15.A09
            X.4a0 r0 = r4.A00
            boolean r0 = r0.A07
            if (r0 == 0) goto L_0x0050
            int r2 = r15.getPlaybackState()
            r0 = 3
            r3 = 1
            if (r2 == r0) goto L_0x0051
        L_0x0050:
            r3 = 0
        L_0x0051:
            boolean r0 = r7.A07
            r13 = 2
            r2 = 3
            r5 = 0
            r12 = 1
            if (r0 == 0) goto L_0x0248
            X.4a0 r0 = r4.A00
            boolean r0 = r0.A07
            if (r0 != 0) goto L_0x0066
            int r0 = r15.getPlaybackState()
            r1 = 1
            if (r0 == r2) goto L_0x0067
        L_0x0066:
            r1 = 0
        L_0x0067:
            int r0 = r15.getPlaybackState()
            boolean r0 = X.AnonymousClass000.A1S(r0, r12)
            if (r1 != 0) goto L_0x0073
            if (r0 != 0) goto L_0x007e
        L_0x0073:
            if (r3 != 0) goto L_0x007e
            boolean r0 = r7.A08
            if (r0 != 0) goto L_0x007e
            boolean r0 = r7.A09
            r11 = 3
            if (r0 == 0) goto L_0x007f
        L_0x007e:
            r11 = 0
        L_0x007f:
            r1 = 2
            r10 = 0
        L_0x0081:
            r9 = 1
            r20 = 0
        L_0x0084:
            com.whatsapp.pushtorecordmedia.MediaProgressRing r8 = r7.A0a
            boolean r0 = r7.A07
            r4 = 8
            if (r0 == 0) goto L_0x0091
            boolean r3 = r7.A08
            r0 = 0
            if (r3 == 0) goto L_0x0093
        L_0x0091:
            r0 = 8
        L_0x0093:
            r8.setVisibility(r0)
            com.whatsapp.pushtorecordmedia.MediaTimeDisplay r3 = r7.A0b
            int r0 = X.C72453Mb.A0J(r9)
            r3.setVisibility(r0)
            android.view.View r0 = r7.A0Y
            if (r10 == 0) goto L_0x00a4
            r4 = 0
        L_0x00a4:
            r0.setVisibility(r4)
            if (r1 == r12) goto L_0x0242
            r14 = 0
            if (r1 == r13) goto L_0x023e
            if (r1 == r2) goto L_0x023a
            r4 = r14
        L_0x00af:
            r7.A1y()
            boolean r0 = r7.A07
            if (r0 == 0) goto L_0x0232
            r10 = 1
        L_0x00b7:
            if (r29 != 0) goto L_0x022e
            int r0 = r7.A01
            if (r10 == r0) goto L_0x012a
            r2 = 100
            if (r10 == 0) goto L_0x0228
            if (r10 == r12) goto L_0x022a
        L_0x00c3:
            android.view.ViewGroup r0 = r7.A0M
            r16 = r0
            int r8 = r16.getWidth()
            if (r10 != r12) goto L_0x0224
            int r1 = r7.getActiveBubbleSize()
        L_0x00d1:
            int[] r0 = new int[r13]
            r0[r5] = r8
            r0[r12] = r1
            android.animation.ValueAnimator r9 = android.animation.ValueAnimator.ofInt(r0)
            android.view.animation.Interpolator r1 = A0d
            r9.setInterpolator(r1)
            r8 = 4
            X.4ae r0 = new X.4ae
            r0.<init>(r9, r7, r8)
            r9.addUpdateListener(r0)
            float r16 = r16.getScaleX()
            r8 = 1065353216(0x3f800000, float:1.0)
            if (r10 != r13) goto L_0x00f4
            r8 = 1064514355(0x3f733333, float:0.95)
        L_0x00f4:
            float[] r0 = new float[r13]
            r0[r5] = r16
            r0[r12] = r8
            android.animation.ValueAnimator r8 = android.animation.ValueAnimator.ofFloat(r0)
            r8.setInterpolator(r1)
            r0 = 14
            X.C88754aj.A00(r8, r7, r0)
            android.animation.AnimatorSet r1 = new android.animation.AnimatorSet
            r1.<init>()
            android.animation.Animator[] r0 = new android.animation.Animator[r13]
            r0[r5] = r9
            r0[r12] = r8
            r1.playTogether(r0)
            r1.setDuration(r2)
            android.animation.Animator$AnimatorListener r0 = r7.A0H
            r1.addListener(r0)
            r7.A01 = r10
            android.animation.AnimatorSet r0 = r7.A02
            if (r0 == 0) goto L_0x0125
            r0.cancel()
        L_0x0125:
            r7.A02 = r1
            r1.start()
        L_0x012a:
            android.view.View r3 = r7.A0I
            X.1bI r0 = r7.A0U
            X.1bI r1 = r7.A0T
            android.widget.TextView r2 = r7.A0N
            r16 = r3
            r17 = r2
            r18 = r0
            r19 = r1
            r21 = r5
            X.AnonymousClass3uL.A0P(r16, r17, r18, r19, r20, r21)
            android.view.ViewGroup r8 = r7.A0L
            int r0 = r0.A01()
            r3 = 8
            if (r0 == 0) goto L_0x0151
            int r1 = r1.A01()
            r0 = 8
            if (r1 != 0) goto L_0x0152
        L_0x0151:
            r0 = 0
        L_0x0152:
            r8.setVisibility(r0)
            if (r11 == 0) goto L_0x0221
            if (r11 == r12) goto L_0x021e
            if (r11 == r13) goto L_0x021e
            com.whatsapp.WaImageView r1 = r7.A0P
        L_0x015d:
            r0 = 8
            if (r1 != r2) goto L_0x0162
            r0 = 0
        L_0x0162:
            r2.setVisibility(r0)
            android.view.ViewGroup r8 = r7.A0K
            int r0 = X.C72453Mb.A0F(r1)
            r8.setVisibility(r0)
            if (r29 == 0) goto L_0x0219
            X.206 r0 = r7.A0I
            java.util.List r0 = java.util.Collections.singletonList(r0)
            r2.setTag(r0)
        L_0x0179:
            r7.A00 = r11
            com.whatsapp.WaImageView r0 = r7.A0P
            if (r1 != r0) goto L_0x0180
            r3 = 0
        L_0x0180:
            r0.setVisibility(r3)
            if (r1 != r2) goto L_0x01b4
            if (r11 == r12) goto L_0x0210
            if (r11 != r13) goto L_0x0285
            r9 = 2131887592(0x7f1205e8, float:1.9409795E38)
            r8 = 2131231868(0x7f08047c, float:1.807983E38)
            X.1rL r3 = r7.A0S
            X.206 r0 = r7.A0I
            X.21V r0 = (X.AnonymousClass21V) r0
            java.util.List r19 = java.util.Collections.singletonList(r0)
            long r0 = r0.A01
            r18 = 0
            r16 = r7
            r20 = r0
            r16.A2E(r17, r18, r19, r20)
        L_0x01a4:
            r2.setText(r9)
            android.content.Context r0 = r7.getContext()
            X.AnonymousClass3MY.A0w(r0, r2, r9)
            r2.setCompoundDrawablesWithIntrinsicBounds(r8, r5, r5, r5)
            r2.setOnClickListener(r3)
        L_0x01b4:
            boolean r8 = r7.A07
            boolean r24 = X.C79103uS.A1L(r7)
            boolean r25 = r7.A05()
            boolean r0 = r7.A09
            if (r0 != 0) goto L_0x01c6
            boolean r0 = r7.A08
            if (r0 == 0) goto L_0x01c7
        L_0x01c6:
            r5 = 1
        L_0x01c7:
            X.1gV r3 = r7.A1S
            r0 = 21
            X.4ri r2 = new X.4ri
            r2.<init>((X.C79053uH) r7, (int) r0)
            android.view.View$OnLongClickListener r1 = r7.A2t
            X.88S r0 = r7.A0V
            r19 = r6
            r20 = r3
            r21 = r0
            r22 = r2
            r23 = r8
            r26 = r5
            r16 = r4
            r17 = r1
            r18 = r14
            r15.A04(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r7.A02()
            r7.A01()
            X.00H r2 = r7.A05
            X.16x r0 = X.AnonymousClass3MX.A0d(r2)
            X.205 r1 = r0.A01
            r0 = r27
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x020c
            boolean r0 = X.C79103uS.A1L(r7)
            if (r0 == 0) goto L_0x020c
            X.16x r0 = X.AnonymousClass3MX.A0d(r2)
            r0.A00(r1)
        L_0x020c:
            r7.hashCode()
            return
        L_0x0210:
            r9 = 2131895332(0x7f122424, float:1.9425494E38)
            r8 = 2131232382(0x7f08067e, float:1.8080872E38)
            X.1rL r3 = r7.A0E
            goto L_0x01a4
        L_0x0219:
            int r0 = r7.A00
            if (r11 != r0) goto L_0x0179
            goto L_0x01b4
        L_0x021e:
            r1 = r2
            goto L_0x015d
        L_0x0221:
            r1 = 0
            goto L_0x015d
        L_0x0224:
            int r1 = r7.A0G
            goto L_0x00d1
        L_0x0228:
            if (r0 != r12) goto L_0x00c3
        L_0x022a:
            r2 = 250(0xfa, double:1.235E-321)
            goto L_0x00c3
        L_0x022e:
            r2 = 0
            goto L_0x00c3
        L_0x0232:
            boolean r0 = r7.A09
            r10 = 0
            if (r0 == 0) goto L_0x00b7
            r10 = 2
            goto L_0x00b7
        L_0x023a:
            X.1rL r4 = r7.A0S
            goto L_0x00af
        L_0x023e:
            android.view.View$OnClickListener r4 = r7.A0W
            goto L_0x00af
        L_0x0242:
            X.1rL r4 = r7.A0c
            android.view.View$OnTouchListener r14 = r7.A0X
            goto L_0x00af
        L_0x0248:
            X.21V r0 = r7.getFMessage()
            boolean r0 = X.AnonymousClass25A.A11(r0)
            if (r0 == 0) goto L_0x0259
            r11 = 0
            r10 = 0
            r9 = 0
            r20 = 1
            goto L_0x0084
        L_0x0259:
            boolean r0 = X.C79103uS.A1L(r7)
            if (r0 == 0) goto L_0x0274
            int r1 = r15.getPlaybackState()
            r0 = 4
            boolean r0 = X.AnonymousClass000.A1T(r1, r0)
            r10 = r0 ^ 1
            r11 = 0
            if (r0 == 0) goto L_0x026e
            r11 = 3
        L_0x026e:
            r9 = 1
            r20 = 0
            r1 = 1
            goto L_0x0084
        L_0x0274:
            X.21V r0 = r7.getFMessage()
            boolean r0 = X.AnonymousClass4H3.A00(r0)
            r1 = 1
            r11 = 1
            if (r0 == 0) goto L_0x0282
            r1 = 3
            r11 = 2
        L_0x0282:
            r10 = 1
            goto L_0x0081
        L_0x0285:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Unexpected overlayButtonAction: "
            java.lang.String r1 = X.AnonymousClass001.A1I(r0, r1, r11)
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C79053uH.A04(boolean):void");
    }

    private boolean A05() {
        File file;
        Uri fromFile;
        AnonymousClass1A3 r1 = this.A0E;
        if (r1.A00 == null) {
            boolean z = false;
            if (!C79103uS.A1L(this)) {
                return false;
            }
            C62572rc r0 = ((AnonymousClass21V) this.A0I).A02;
            if (!(r0 == null || (file = r0.A0G) == null || (fromFile = Uri.fromFile(file)) == null || !C72473Md.A1Q(fromFile))) {
                z = true;
            }
            r1 = new AnonymousClass1A3(Boolean.valueOf(z));
            this.A0E = r1;
        }
        return AnonymousClass000.A1Y(r1.A00());
    }

    /* access modifiers changed from: private */
    public int getVideoDuration() {
        int A062 = this.A0Q.A09.A06();
        if (A062 == 0) {
            return ((AnonymousClass21V) this.A0I).A0D * 1000;
        }
        return A062;
    }

    public boolean A1V() {
        if (!((C32911hx) this.A1y.get()).A01(this.A0I) || !this.A0l.CMI()) {
            return false;
        }
        return true;
    }

    public boolean A1X() {
        return C79103uS.A1K(this, this.A0I, this.A1h);
    }

    public boolean A1h() {
        if (!this.A0I.A0v.A02 && !this.A07) {
            if (!C18020vd.A05(C18040vf.A02, this.A0F, 7778)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public void A1v() {
        this.A0Q.A02();
    }

    public void A1y() {
        C28931bI r2 = this.A0U;
        C32861hs r0 = this.A05;
        C17960vV.A07(r0);
        A2j(r2, C88564a8.A01(r0, (AnonymousClass21V) this.A0I, r2));
    }

    public void A20() {
        ((C85714Ol) this.A06.get()).A05 = false;
        if (A2t()) {
            AnonymousClass3MX.A0d(this.A05).A00(this.A0I.A0v);
        }
    }

    public void A2V(AnonymousClass206 r5, boolean z) {
        boolean A1Z = AnonymousClass3Ma.A1Z(r5, this.A0I);
        super.A2V(r5, z);
        if (z || A1Z) {
            AnonymousClass00H r2 = this.A05;
            if (C72473Md.A0g(r2) != this.A0I.A0v || !AnonymousClass3MX.A0d(r2).A02) {
                A04(A1Z);
            }
        }
    }

    public boolean A2t() {
        String str;
        Log.i("conversation/row/ptv/viewMessage");
        if (this.A03 == null || AnonymousClass74O.A0O(getContext(), this.A03)) {
            AnonymousClass21V r0 = (AnonymousClass21V) this.A0I;
            C62572rc A002 = AnonymousClass206.A00(r0);
            if (!r0.A0v.A02 && !A002.A0V) {
                str = "conversation/row/ptv/viewMessage/mediaDataTransferred";
            } else if (A002.A07 == 1) {
                Log.i("conversation/row/ptv/viewMessage/suspiciousContent");
                this.A0S.A06(2131890637, 1);
                return false;
            } else if (A05()) {
                return true;
            } else {
                str = "conversation/row/ptv/viewMessage/cantPlayPtv";
            }
        } else {
            str = "conversation/row/ptv/viewMessage/noMediaViewPermission";
        }
        Log.i(str);
        return false;
    }

    public C440922c getFMessage() {
        return (C440922c) ((AnonymousClass21V) this.A0I);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int i;
        int i2;
        C108875cR r0;
        if (C18020vd.A05(C18040vf.A02, this.A0F, 9405)) {
            if (motionEvent.getAction() == 0) {
                this.A0A = (int) motionEvent.getRawX();
                this.A0B = (int) motionEvent.getRawY();
            }
            if (motionEvent.getAction() == 1) {
                int[] iArr = new int[2];
                View findViewById = findViewById(2131434230);
                if (findViewById != null) {
                    findViewById.getLocationOnScreen(iArr);
                    int width = findViewById.getWidth() / 2;
                    int i3 = iArr[0];
                    int i4 = this.A0A;
                    if (Math.pow((double) (i4 - (i3 + width)), 2.0d) + Math.pow((double) (this.A0B - (iArr[1] + width)), 2.0d) > Math.pow((double) width, 2.0d) && i4 >= i3 && i4 < i3 + findViewById.getWidth() && (i = this.A0B) >= (i2 = iArr[1]) && i < AnonymousClass3MW.A02(findViewById, i2) && (r0 = this.A0k) != null) {
                        r0.BId();
                        return true;
                    }
                }
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void setFMessage(AnonymousClass206 r2) {
        C17960vV.A0D(r2 instanceof C440922c);
        super.setFMessage(r2);
    }

    public C79053uH(Context context, C108875cR r6, C440922c r7) {
        super(context, r6, r7);
        A1M();
        ViewGroup A0C2 = AnonymousClass3MW.A0C(this, 2131434230);
        this.A0M = A0C2;
        this.A0Y = AnonymousClass1HF.A06(this, 2131432875);
        this.A0b = (MediaTimeDisplay) AnonymousClass1HF.A06(this, 2131432436);
        this.A0a = (MediaProgressRing) AnonymousClass1HF.A06(this, 2131433894);
        this.A0G = Math.min(AnonymousClass000.A0Y(A0C2).getDimensionPixelSize(2131166287), C88264Yz.A01(A0C2.getContext(), 65));
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("conversation/row/ptv/init/messageId=");
        C17890vO.A1A(A10, this.A0I.A0v.A01);
        ViewGroup viewGroup = this.A0J;
        AnonymousClass4aO.A02(viewGroup);
        C28931bI r1 = this.A0U;
        C98254qp.A00(r1, this, 24);
        r1.A05(this.A0C);
        AnonymousClass3MX.A1D(getResources(), this.A0M, 2131897848);
        AnonymousClass3MX.A1D(getResources(), viewGroup, 2131897848);
        this.A06.setBackground(this.A09.BZi(C72453Mb.A05(this.A0I.A0v.A02 ? 1 : 0)));
        A04(true);
    }

    private int getActiveBubbleSize() {
        int A002 = C88264Yz.A00(getContext());
        C108675c7 r1 = this.A0l;
        return C72473Md.A07(this, (A002 - r1.BNi()) - r1.BNk(this.A0I)) - getResources().getDimensionPixelSize(2131166197);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A0F = true;
        AnonymousClass1F9 A002 = AnonymousClass1ZG.A00(getRootView());
        if (A002 != null) {
            AnonymousClass3MX.A0d(this.A05).A03.A0A(A002, this.A0Z);
        }
        AnonymousClass00H r1 = this.A05;
        Object A0g = C72473Md.A0g(r1);
        AnonymousClass21X r7 = (AnonymousClass21X) ((AnonymousClass21V) this.A0I);
        if (A0g == r7.A0v) {
            PushToVideoInlineVideoPlayer pushToVideoInlineVideoPlayer = this.A0Q;
            boolean A1L = C79103uS.A1L(this);
            boolean A052 = A05();
            pushToVideoInlineVideoPlayer.A04((View.OnClickListener) null, this.A2t, (View.OnTouchListener) null, r7, this.A1S, this.A0V, new C98784ri(this, 21), true, A1L, A052, false);
            A02();
            A01();
            boolean z = AnonymousClass3MX.A0d(r1).A02;
            C216616x A0d2 = AnonymousClass3MX.A0d(r1);
            AnonymousClass205 r12 = this.A0I.A0v;
            if (z) {
                C18070vi.A0d(r12, 0);
                A0d2.A00 = null;
                A0d2.A02 = true;
                A0d2.A03.A0F(r12);
                return;
            }
            A0d2.A00(r12);
            return;
        }
        A03(this);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnonymousClass205 r3 = this.A0I.A0v;
        hashCode();
        this.A0F = false;
        AnonymousClass00H r2 = this.A05;
        AnonymousClass3MX.A0d(r2).A03.A0D(this.A0Z);
        C216616x A0d2 = AnonymousClass3MX.A0d(r2);
        if (r3.equals(A0d2.A01)) {
            A0d2.A01 = null;
        }
        A02();
        A01();
    }

    public int getCenteredLayoutId() {
        return 2131624910;
    }

    public int getIncomingLayoutId() {
        return 2131624910;
    }

    public int getOutgoingLayoutId() {
        return 2131624911;
    }
}
