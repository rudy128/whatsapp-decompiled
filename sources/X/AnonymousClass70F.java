package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.BitmapFactory;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.70F  reason: invalid class name */
public class AnonymousClass70F {
    public float A00;
    public float A01;
    public long A02;
    public AnimatorSet A03;
    public C160858Af A04;
    public C109945eR A05;
    public boolean A06;
    public boolean A07;
    public boolean A08 = false;
    public boolean A09 = false;
    public boolean A0A = false;
    public boolean A0B;
    public final float A0C;
    public final float A0D;
    public final int A0E;
    public final Activity A0F;
    public final Handler A0G = C17890vO.A0D();
    public final View A0H;
    public final View A0I;
    public final View A0J;
    public final View A0K;
    public final View A0L;
    public final View A0M;
    public final ViewGroup A0N;
    public final ImageView A0O;
    public final C43191zP A0P;
    public final C19830z4 A0Q;
    public final C18000vb A0R;
    public final C1596285g A0S;
    public final Runnable A0T = new AnonymousClass7RB(this, 18);
    public final boolean A0U;
    public final float A0V;
    public final float A0W;
    public final TextView A0X;
    public final AnonymousClass11P A0Y;

    public void A01() {
        TranslateAnimation translateAnimation = new TranslateAnimation(0, 0.0f, 0, 0.0f, 0, 0.0f, 0, 0.0f);
        translateAnimation.setDuration(0);
        translateAnimation.setFillBefore(true);
        translateAnimation.setFillAfter(true);
        this.A0X.startAnimation(translateAnimation);
    }

    /* JADX WARNING: type inference failed for: r2v5, types: [X.5eR, android.view.View] */
    public static void A00(AnonymousClass70F r16) {
        AnonymousClass70F r5 = r16;
        if (r5.A09) {
            long j = r5.A02;
            r5.A09 = false;
            ImageView imageView = r5.A0O;
            imageView.setVisibility(0);
            float f = r5.A0C;
            C18000vb r6 = r5.A0R;
            imageView.setTranslationX(f * ((float) C108975cc.A0m(AnonymousClass3MW.A1Z(r6) ? 1 : 0)));
            imageView.setTranslationY(r5.A0D);
            imageView.setScaleX(0.5f);
            imageView.setScaleY(0.5f);
            imageView.requestFocus();
            C43191zP r7 = r5.A0P;
            CopyOnWriteArraySet copyOnWriteArraySet = r7.A04;
            copyOnWriteArraySet.clear();
            copyOnWriteArraySet.add(new C114095q9(r5, 0));
            r7.A01(1.0d);
            View view = r5.A0J;
            view.clearAnimation();
            view.setVisibility(8);
            View view2 = r5.A0I;
            view2.clearAnimation();
            view2.setVisibility(8);
            View view3 = r5.A0K;
            view3.clearAnimation();
            view3.setVisibility(8);
            r5.A0H.setVisibility(0);
            View view4 = r5.A0M;
            view4.setVisibility(0);
            view4.post(new AnonymousClass7RB(r5, 14));
            View view5 = r5.A0L;
            view5.setVisibility(0);
            view5.setClickable(true);
            view5.setImportantForAccessibility(2);
            float f2 = -1.0f;
            if (AnonymousClass3MY.A1b(r6)) {
                f2 = 1.0f;
            }
            TranslateAnimation translateAnimation = new TranslateAnimation(1, f2, 1, 0.0f, 1, 0.0f, 1, 0.0f);
            translateAnimation.setDuration(160);
            view5.startAnimation(translateAnimation);
            r5.A06 = false;
            r5.A02 = j;
            if (r5.A0U) {
                ViewGroup viewGroup = r5.A0N;
                viewGroup.setVisibility(0);
                viewGroup.bringToFront();
                if (r5.A05 == null) {
                    Activity activity = r5.A0F;
                    int i = r5.A0E;
                    ? view6 = new View(activity, (AttributeSet) null, 0);
                    if (!view6.A0b) {
                        view6.A0b = true;
                        view6.generatedComponent();
                    }
                    view6.A0c = false;
                    view6.A0L = i;
                    view6.A0Z = r6;
                    view6.A0I = view6.getResources().getDimensionPixelSize(2131165522);
                    view6.A0M = view6.getResources().getDimensionPixelSize(2131165521);
                    view6.A0G = view6.getResources().getDimensionPixelSize(2131165519);
                    view6.A0H = view6.getResources().getDimensionPixelSize(2131168385);
                    view6.A0E = view6.getResources().getDimensionPixelSize(2131165517);
                    view6.A0J = view6.A0I / 2;
                    view6.A0O = AnonymousClass3MZ.A02(view6.getContext(), view6.getContext(), 2130968854, 2131099934);
                    view6.A0N = AnonymousClass3MZ.A02(view6.getContext(), view6.getContext(), 2130968853, 2131099933);
                    view6.A0F = AnonymousClass3MZ.A02(view6.getContext(), view6.getContext(), 2130968850, 2131099930);
                    view6.A0X = AnonymousClass3MW.A08();
                    int A022 = AnonymousClass3MZ.A02(view6.getContext(), view6.getContext(), 2130968851, 2131099931);
                    Paint A0K2 = C108945cZ.A0K(1);
                    view6.A0U = A0K2;
                    C108945cZ.A1L(A0K2);
                    view6.A0U.setColor(A022);
                    view6.A0Y = AnonymousClass3MW.A08();
                    int A023 = AnonymousClass3MZ.A02(view6.getContext(), view6.getContext(), 2130968852, 2131099932);
                    Paint A0K3 = C108945cZ.A0K(1);
                    view6.A0V = A0K3;
                    A0K3.setColor(A023);
                    AnonymousClass3MW.A1P(view6.A0V);
                    view6.A0V.setStrokeWidth((float) view6.A0G);
                    Paint A0K4 = C108945cZ.A0K(1);
                    view6.A0W = A0K4;
                    A0K4.setFilterBitmap(true);
                    Paint A0K5 = C108945cZ.A0K(1);
                    view6.A0T = A0K5;
                    A0K5.setFilterBitmap(true);
                    view6.A0T.setColorFilter(new PorterDuffColorFilter(view6.A0F, PorterDuff.Mode.SRC_IN));
                    view6.A0R = BitmapFactory.decodeResource(view6.getResources(), 2131232227);
                    view6.A0Q = BitmapFactory.decodeResource(view6.getResources(), 2131232226);
                    view6.A0P = BitmapFactory.decodeResource(view6.getResources(), 2131232032);
                    float height = ((float) view6.A0R.getHeight()) * 0.39f;
                    view6.A05 = height;
                    view6.A0B = height;
                    float height2 = (float) ((view6.A0I / 2) - (view6.A0R.getHeight() / 2));
                    view6.A0D = height2;
                    float height3 = height2 + (((float) view6.A0R.getHeight()) * 0.9f);
                    view6.A0C = height3;
                    view6.A0A = height3 + ((float) view6.A0Q.getHeight()) + AnonymousClass3MW.A00(view6.getResources(), 2131165518);
                    view6.A01 = view6.A0B;
                    view6.A03 = -2.5f;
                    view6.A06 = (float) (view6.A0M + view6.A0P.getHeight());
                    float height4 = (float) (view6.A0M + view6.A0R.getHeight());
                    view6.A08 = height4;
                    view6.A07 = height4 + (((float) view6.A0R.getHeight()) * 0.9f);
                    view6.A0S = C108945cZ.A0J();
                    C109945eR.A00(view6);
                    view6.setElevation(AnonymousClass3MW.A00(view6.getResources(), 2131165520));
                    view6.setClipToOutline(false);
                    view6.setOutlineProvider(new C109975ej(view6));
                    r5.A05 = view6;
                    view6.setVisibility(4);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                    int i2 = 83;
                    if (AnonymousClass3MY.A1b(r6)) {
                        i2 = 85;
                    }
                    layoutParams.gravity = i2;
                    viewGroup.addView(r5.A05, layoutParams);
                }
                r5.A07 = false;
                r5.A0B = false;
                r5.A0G.post(r5.A0T);
            }
        }
        if (r5.A08) {
            boolean z = r5.A0A;
            r5.A08 = false;
            r5.A0B = true;
            r5.A0H.animate().setDuration(200).alpha(0.0f).setListener(new C109195cy(r5, 26)).start();
            C109945eR r12 = r5.A05;
            if (r12 != null) {
                if (z) {
                    AnonymousClass7RB r11 = new AnonymousClass7RB(r5, 15);
                    r12.setPivotX((float) (r12.getWidth() / 2));
                    r12.setPivotY((float) (r12.A0I / 2));
                    AnimatorSet A0B2 = C108945cZ.A0B();
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{1.0f, 1.3f});
                    ofFloat.setDuration(250);
                    ofFloat.setRepeatMode(2);
                    ofFloat.setRepeatCount(2);
                    C108955ca.A19(ofFloat);
                    C1411074h.A00(ofFloat, r12, 37);
                    ArgbEvaluator argbEvaluator = new ArgbEvaluator();
                    Object[] objArr = new Object[2];
                    boolean A1b = C72453Mb.A1b(objArr, r12.A0O);
                    objArr[1] = Integer.valueOf(r12.A0N);
                    ValueAnimator ofObject = ValueAnimator.ofObject(argbEvaluator, objArr);
                    ofObject.setDuration(250);
                    C108955ca.A19(ofObject);
                    C1411074h.A00(ofObject, r12, 38);
                    A0B2.addListener(new C109105cp(r12, r11, 7));
                    A0B2.playTogether(C108945cZ.A1Z(ofFloat, ofObject, 2, A1b ? 1 : 0));
                    A0B2.start();
                } else {
                    r5.A0N.setVisibility(8);
                }
            }
            r5.A0O.setVisibility(8);
            r5.A02();
        }
    }

    public void A02() {
        View view = this.A0M;
        view.post(new AnonymousClass7RB(this, 16));
        view.setVisibility(8);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0040, code lost:
        if (r9 >= 0.0f) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0023, code lost:
        if (java.lang.Math.abs(r11) <= r3.A0W) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03(android.view.MotionEvent r19, int r20, boolean r21) {
        /*
            r18 = this;
            r3 = r18
            boolean r0 = r3.A0B
            if (r0 != 0) goto L_0x0174
            float r9 = r19.getY()
            float r0 = r3.A01
            float r9 = r9 - r0
            float r11 = r19.getX()
            float r0 = r3.A00
            float r11 = r11 - r0
            boolean r0 = r3.A07
            r6 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0025
            float r1 = java.lang.Math.abs(r11)
            float r0 = r3.A0W
            int r1 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            r0 = 1
            if (r1 > 0) goto L_0x0026
        L_0x0025:
            r0 = 0
        L_0x0026:
            r3.A06 = r0
            boolean r5 = r3.A0U
            r4 = 1065353216(0x3f800000, float:1.0)
            r15 = 0
            r7 = r21
            if (r5 == 0) goto L_0x00a8
            if (r0 != 0) goto L_0x0042
            float r1 = java.lang.Math.abs(r9)
            float r0 = r3.A0W
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0042
            int r1 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            r0 = 1
            if (r1 < 0) goto L_0x0043
        L_0x0042:
            r0 = 0
        L_0x0043:
            r3.A07 = r0
            if (r0 == 0) goto L_0x01d6
            X.5eR r0 = r3.A05
            if (r0 == 0) goto L_0x01d6
            boolean r0 = r0.A0d
            if (r0 != 0) goto L_0x005e
            android.os.Handler r1 = r3.A0G
            java.lang.Runnable r0 = r3.A0T
            r1.removeCallbacks(r0)
            X.5eR r10 = r3.A05
            r0 = 0
            r8 = 0
            X.C109945eR.A02(r10, r8, r0)
        L_0x005e:
            float r0 = r3.A0W
            float r9 = r9 + r0
            X.5eR r10 = r3.A05
            int r1 = r10.A0M
            int r0 = r10.A0I
            int r1 = r1 - r0
            float r8 = (float) r1
            int r0 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r0 < 0) goto L_0x01cb
            r1 = 0
        L_0x006e:
            r10.setPercentageLocked(r1)
            float r0 = r3.A0D
            float r9 = r9 + r0
            float r0 = r0 - r8
            float r0 = java.lang.Math.max(r9, r0)
            android.widget.ImageView r8 = r3.A0O
            r8.setTranslationY(r0)
            X.1zP r0 = r3.A0P
            java.util.concurrent.CopyOnWriteArraySet r0 = r0.A04
            r0.clear()
            float r0 = r4 - r1
            float r0 = java.lang.Math.max(r15, r0)
            r8.setScaleX(r0)
            r8.setScaleY(r0)
            r0 = 1041865114(0x3e19999a, float:0.15)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x00a8
            X.8Af r0 = r3.A04
            if (r0 == 0) goto L_0x009f
            r0.Bve()
        L_0x009f:
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x00a8
            X.8Af r0 = r3.A04
            r0.BxN(r7)
        L_0x00a8:
            boolean r0 = r3.A06
            if (r0 == 0) goto L_0x01b0
            r0 = r20
            float r1 = (float) r0
            float r0 = r3.A0V
            r9 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 * r9
            float r0 = java.lang.Math.min(r1, r0)
            float r0 = r11 / r0
            float r8 = java.lang.Math.abs(r0)
            r0 = 1059481190(0x3f266666, float:0.65)
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0189
            X.8Af r0 = r3.A04
            if (r0 == 0) goto L_0x00cc
            r0.C75(r6, r7, r2, r2)
        L_0x00cc:
            X.85g r1 = r3.A0S
            X.7Le r1 = (X.C145417Le) r1
            int r0 = r1.A00
            if (r0 == 0) goto L_0x017f
            java.lang.Object r1 = r1.A01
            X.74M r1 = (X.AnonymousClass74M) r1
            X.72K r0 = r1.A0J
            if (r0 == 0) goto L_0x0174
            boolean r0 = r1.A0P
            if (r0 != 0) goto L_0x0174
        L_0x00e0:
            long r0 = r3.A02
            r6 = 160(0xa0, double:7.9E-322)
            long r0 = r0 + r6
            long r7 = android.os.SystemClock.elapsedRealtime()
            int r6 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r6 >= 0) goto L_0x0174
            X.0vb r6 = r3.A0R
            boolean r1 = X.AnonymousClass3MY.A1b(r6)
            boolean r0 = X.AnonymousClass3MY.A1b(r6)
            if (r0 == 0) goto L_0x0175
            int r0 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r0 >= 0) goto L_0x017d
            float r0 = r3.A0W
            float r11 = r11 + r0
        L_0x0100:
            X.8Af r0 = r3.A04
            if (r0 == 0) goto L_0x0107
            r0.CAI(r11, r1)
        L_0x0107:
            if (r5 == 0) goto L_0x0142
            X.5eR r8 = r3.A05
            if (r8 == 0) goto L_0x0142
            boolean r0 = r8.A0d
            if (r0 == 0) goto L_0x0142
            float r7 = X.C108945cZ.A04(r8)
            float r5 = java.lang.Math.abs(r11)
            X.5eR r0 = r3.A05
            float r0 = X.C108945cZ.A03(r0)
            float r1 = r5 / r0
            X.5eR r0 = r3.A05
            float r0 = X.C108945cZ.A04(r0)
            float r1 = r1 * r0
            r0 = 1066611507(0x3f933333, float:1.15)
            float r1 = r1 * r0
            float r0 = java.lang.Math.min(r7, r1)
            r8.setTranslationY(r0)
            X.5eR r1 = r3.A05
            float r0 = X.C108945cZ.A03(r1)
            float r5 = r5 / r0
            float r4 = r4 - r5
            float r0 = java.lang.Math.max(r15, r4)
            r1.setAlpha(r0)
        L_0x0142:
            android.widget.ImageView r4 = r3.A0O
            float r1 = r3.A0C
            boolean r0 = X.AnonymousClass3MW.A1Z(r6)
            short r0 = X.C108975cc.A0m(r0)
            float r0 = (float) r0
            float r1 = r1 * r0
            float r1 = r1 + r11
            r4.setTranslationX(r1)
            r10 = 0
            android.view.animation.TranslateAnimation r9 = new android.view.animation.TranslateAnimation
            r14 = r10
            r16 = r10
            r12 = r10
            r13 = r11
            r17 = r15
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
            r0 = 0
            r9.setDuration(r0)
            r9.setFillBefore(r2)
            r9.setFillAfter(r2)
            android.widget.TextView r0 = r3.A0X
            r0.clearAnimation()
            r0.startAnimation(r9)
        L_0x0174:
            return
        L_0x0175:
            int r0 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r0 <= 0) goto L_0x017d
            float r0 = r3.A0W
            float r11 = r11 - r0
            goto L_0x0100
        L_0x017d:
            r11 = 0
            goto L_0x0100
        L_0x017f:
            java.lang.Object r0 = r1.A01
            X.74G r0 = (X.AnonymousClass74G) r0
            com.whatsapp.camera.litecamera.LiteCameraView r0 = r0.A04
            if (r0 == 0) goto L_0x0174
            goto L_0x00e0
        L_0x0189:
            r0 = 1036831949(0x3dcccccd, float:0.1)
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            X.8Af r1 = r3.A04
            if (r0 <= 0) goto L_0x01a9
            if (r1 == 0) goto L_0x01a0
            r0 = 1066192077(0x3f8ccccd, float:1.1)
            float r8 = r8 * r9
            float r0 = r0 - r8
            float r0 = java.lang.Math.max(r15, r0)
            r1.C5o(r0)
        L_0x01a0:
            X.8Af r0 = r3.A04
            if (r0 == 0) goto L_0x00cc
            r0.Bve()
            goto L_0x00cc
        L_0x01a9:
            if (r1 == 0) goto L_0x00cc
            r1.C5o(r4)
            goto L_0x00cc
        L_0x01b0:
            android.widget.ImageView r2 = r3.A0O
            float r1 = r3.A0C
            X.0vb r0 = r3.A0R
            boolean r0 = X.AnonymousClass3MW.A1Z(r0)
            short r0 = X.C108975cc.A0m(r0)
            float r0 = (float) r0
            float r1 = r1 * r0
            r2.setTranslationX(r1)
            X.8Af r0 = r3.A04
            if (r0 == 0) goto L_0x0174
            r0.C3Z()
            return
        L_0x01cb:
            float r1 = java.lang.Math.abs(r9)
            r0 = 1062836634(0x3f59999a, float:0.85)
            float r0 = r0 * r8
            float r1 = r1 / r0
            goto L_0x006e
        L_0x01d6:
            X.5eR r0 = r3.A05
            if (r0 == 0) goto L_0x01dd
            r0.setPercentageLocked(r15)
        L_0x01dd:
            android.widget.ImageView r1 = r3.A0O
            float r0 = r3.A0D
            r1.setTranslationY(r0)
            r1.setScaleX(r4)
            r1.setScaleY(r4)
            goto L_0x00a8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass70F.A03(android.view.MotionEvent, int, boolean):void");
    }

    public void A04(boolean z) {
        if (this.A0U) {
            C109945eR r0 = this.A05;
            if (r0 != null) {
                r0.A03();
            }
            this.A0N.setVisibility(8);
        }
        C43191zP r8 = this.A0P;
        CopyOnWriteArraySet copyOnWriteArraySet = r8.A04;
        copyOnWriteArraySet.clear();
        if (r8.A07.A00 == 0.0d || !z) {
            r8.A01(0.0d);
            ImageView imageView = this.A0O;
            imageView.setVisibility(4);
            imageView.setScaleX(0.0f);
            imageView.setScaleY(0.0f);
            C160858Af r02 = this.A04;
            if (r02 != null) {
                r02.C5a();
            }
        } else {
            copyOnWriteArraySet.add(new C120596Ei(this, (int) this.A0O.getTranslationX()));
            r8.A01(0.0d);
        }
        View view = this.A0L;
        view.setVisibility(8);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(160);
        view.startAnimation(alphaAnimation);
    }

    public boolean A05(boolean z, boolean z2, boolean z3) {
        if (!this.A0B) {
            if (this.A07) {
                ImageView imageView = this.A0O;
                imageView.animate().setListener((Animator.AnimatorListener) null).cancel();
                imageView.animate().setDuration(200).scaleX(0.5f).scaleY(0.5f).translationY(this.A0D).setListener(new C109125cr(this, z, z2));
            } else {
                C160858Af r0 = this.A04;
                if (r0 == null) {
                    return true;
                }
                r0.C75(z, z2, z3, false);
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v31, types: [java.lang.Object, X.1zR] */
    public AnonymousClass70F(Activity activity, View view, View view2, View view3, View view4, View view5, View view6, View view7, ViewGroup viewGroup, ImageView imageView, TextView textView, AnonymousClass11P r23, AnonymousClass118 r24, C19830z4 r25, C18000vb r26, C1596285g r27, float f, int i, boolean z) {
        float f2;
        int paddingLeft;
        float f3;
        int i2 = i;
        this.A0E = i2;
        this.A0F = activity;
        this.A0Y = r23;
        C18000vb r5 = r26;
        this.A0R = r5;
        this.A0Q = r25;
        this.A0N = viewGroup;
        ImageView imageView2 = imageView;
        this.A0O = imageView2;
        TextView textView2 = textView;
        this.A0X = textView2;
        boolean z2 = true;
        if (i2 == 1 || i2 == 2) {
            f2 = 88.0f;
        } else {
            z2 = false;
            f2 = 32.0f;
        }
        Context context = r24.A00;
        int applyDimension = (int) TypedValue.applyDimension(1, f2, C108965cb.A08(context));
        if (AnonymousClass3MW.A1Z(r5)) {
            paddingLeft = applyDimension;
        } else {
            paddingLeft = textView2.getPaddingLeft();
        }
        textView2.setPadding(paddingLeft, textView2.getPaddingTop(), !AnonymousClass3MY.A1b(r5) ? textView2.getPaddingRight() : applyDimension, textView2.getPaddingBottom());
        C29261bv.A02(ColorStateList.valueOf(C108985cd.A03(textView2)), textView2);
        this.A0H = view2;
        this.A0M = view3;
        this.A0J = view4;
        this.A0I = view5;
        this.A0K = view6;
        this.A0L = view7;
        this.A0U = z;
        this.A0V = f;
        this.A0S = r27;
        imageView2.setPadding(0, 0, 0, 0);
        if (z2) {
            ViewGroup.MarginLayoutParams A0B2 = AnonymousClass3MW.A0B(imageView2);
            A0B2.setMargins(0, A0B2.topMargin, 0, A0B2.bottomMargin);
            imageView2.setLayoutParams(A0B2);
            f3 = -36.15f;
        } else {
            f3 = 17.09f;
        }
        this.A0C = TypedValue.applyDimension(1, f3, C108965cb.A08(context));
        this.A0D = TypedValue.applyDimension(1, 23.5f, C108965cb.A08(context));
        view.getViewTreeObserver().addOnPreDrawListener(new C90634eO(view, textView2, this, 2));
        if (AnonymousClass3MY.A1b(r5)) {
            textView2.setCompoundDrawablesWithIntrinsicBounds(2131231674, 0, 0, 0);
        } else {
            textView2.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, AnonymousClass3NL.A00(activity, r5, 2131231674), (Drawable) null);
        }
        this.A0W = ((float) ViewConfiguration.get(activity).getScaledTouchSlop()) * 1.5f;
        C43191zP A012 = C43171zN.A00().A01();
        this.A0P = A012;
        ? obj = new Object();
        obj.A01 = 440.0d;
        obj.A00 = 21.0d;
        A012.A03 = obj;
        imageView2.setBackgroundResource(2131232500);
    }
}
