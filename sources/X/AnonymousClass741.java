package X;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.widget.TextView;
import com.whatsapp.CircularProgressBar;
import com.whatsapp.WaImageView;
import com.whatsapp.areffects.button.ArEffectsLottieButton;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.HashMap;

/* renamed from: X.741  reason: invalid class name */
public final class AnonymousClass741 {
    public float A00;
    public int A01 = 1;
    public int A02;
    public View A03;
    public AlphaAnimation A04;
    public CircularProgressBar A05;
    public ArEffectsLottieButton A06;
    public C1407172r A07;
    public WDSButton A08;
    public WDSButton A09;
    public boolean A0A;
    public boolean A0B;
    public int A0C;
    public AlphaAnimation A0D;
    public final Context A0E;
    public final View A0F;
    public final View A0G;
    public final View A0H;
    public final ViewGroup A0I;
    public final ViewGroup A0J;
    public final WaImageView A0K;
    public final WaImageView A0L;
    public final C160978Av A0M;
    public final C128336fp A0N;
    public final C19830z4 A0O;
    public final C18030ve A0P;
    public final C28931bI A0Q;
    public final C28931bI A0R;
    public final WDSButton A0S;
    public final WDSButton A0T;
    public final WDSButton A0U;
    public final HashMap A0V = C17880vN.A11();
    public final HashMap A0W = C17880vN.A11();
    public final boolean A0X;
    public final TextView A0Y;
    public final AnonymousClass7DY A0Z;

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0166, code lost:
        if (r1 == 3) goto L_0x0168;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0097, code lost:
        if (A05(r7) == false) goto L_0x0099;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass741(android.view.View r8, X.C160978Av r9, X.AnonymousClass7DY r10, X.C128336fp r11, X.C19830z4 r12, X.C18030ve r13) {
        /*
            r7 = this;
            r3 = 1
            r7.<init>()
            r7.A0P = r13
            r7.A0F = r8
            r7.A0M = r9
            r7.A0N = r11
            r7.A0Z = r10
            r7.A0O = r12
            android.content.Context r0 = X.AnonymousClass3MY.A04(r8)
            r7.A0E = r0
            java.util.HashMap r0 = X.C17880vN.A11()
            r7.A0W = r0
            java.util.HashMap r0 = X.C17880vN.A11()
            r7.A0V = r0
            r7.A01 = r3
            r0 = 2131430788(0x7f0b0d84, float:1.8483287E38)
            android.view.View r0 = X.C18070vi.A05(r8, r0)
            r7.A0G = r0
            r0 = 2131430900(0x7f0b0df4, float:1.8483514E38)
            com.whatsapp.WaImageView r0 = X.C108965cb.A0I(r8, r0)
            r7.A0K = r0
            r0 = 2131430901(0x7f0b0df5, float:1.8483516E38)
            android.view.View r4 = X.C18070vi.A05(r8, r0)
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            r7.A0I = r4
            r0 = 2131435000(0x7f0b1df8, float:1.849183E38)
            android.view.View r0 = X.C18070vi.A05(r8, r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r7.A0J = r0
            r0 = 2131435957(0x7f0b21b5, float:1.849377E38)
            android.view.View r5 = X.C18070vi.A05(r8, r0)
            com.whatsapp.wds.components.button.WDSButton r5 = (com.whatsapp.wds.components.button.WDSButton) r5
            r7.A0U = r5
            r0 = 2131435443(0x7f0b1fb3, float:1.8492728E38)
            com.whatsapp.WaImageView r0 = X.C108965cb.A0I(r8, r0)
            r7.A0L = r0
            r0 = 2131431055(0x7f0b0e8f, float:1.8483828E38)
            android.view.View r0 = X.C18070vi.A05(r8, r0)
            com.whatsapp.wds.components.button.WDSButton r0 = (com.whatsapp.wds.components.button.WDSButton) r0
            r7.A0T = r0
            r0 = 2131429139(0x7f0b0713, float:1.8479942E38)
            android.view.View r0 = X.C18070vi.A05(r8, r0)
            com.whatsapp.wds.components.button.WDSButton r0 = (com.whatsapp.wds.components.button.WDSButton) r0
            r7.A0S = r0
            r0 = 2131435097(0x7f0b1e59, float:1.8492027E38)
            android.view.View r0 = X.C18070vi.A05(r8, r0)
            r7.A0H = r0
            r0 = 2131435106(0x7f0b1e62, float:1.8492045E38)
            android.widget.TextView r0 = X.AnonymousClass3Ma.A0E(r8, r0)
            r7.A0Y = r0
            X.0ve r0 = r7.A0P
            boolean r0 = X.C1402270m.A00(r0)
            if (r0 == 0) goto L_0x0099
            boolean r1 = A05(r7)
            r0 = 2131427835(0x7f0b01fb, float:1.8477297E38)
            if (r1 != 0) goto L_0x009c
        L_0x0099:
            r0 = 2131427834(0x7f0b01fa, float:1.8477295E38)
        L_0x009c:
            X.1bI r0 = X.C28931bI.A00(r8, r0)
            r7.A0Q = r0
            r0 = 2131437105(0x7f0b2631, float:1.84961E38)
            X.1bI r0 = X.C28931bI.A00(r8, r0)
            r7.A0R = r0
            X.C145907Nb.A00(r0, r7, r3)
            X.8Av r0 = r7.A0M
            int r0 = r0.getNumberOfCameras()
            r2 = 0
            boolean r1 = X.C108975cc.A1D(r0, r3)
            java.lang.Boolean r0 = X.C17970vW.A03
            if (r1 == 0) goto L_0x00be
            r2 = 1
        L_0x00be:
            r7.A0X = r2
            r1 = 8
            int r0 = X.C72453Mb.A07(r2)
            r5.setVisibility(r0)
            int r0 = r9.getStoredFlashModeCount()
            if (r0 <= r3) goto L_0x00d0
            r1 = 0
        L_0x00d0:
            r4.setVisibility(r1)
            java.util.HashMap r6 = r7.A0W
            r0 = 2131231915(0x7f0804ab, float:1.8079924E38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "off"
            r6.put(r1, r2)
            r0 = 2131231916(0x7f0804ac, float:1.8079927E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r5 = "on"
            r6.put(r5, r0)
            r0 = 2131231914(0x7f0804aa, float:1.8079922E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r4 = "auto"
            r6.put(r4, r0)
            java.lang.String r3 = "torch"
            r6.put(r3, r2)
            java.util.HashMap r2 = r7.A0V
            r0 = 2131890431(0x7f1210ff, float:1.9415554E38)
            java.lang.Integer r1 = X.C108955ca.A0k(r1, r2, r0)
            r0 = 2131890433(0x7f121101, float:1.9415558E38)
            X.C17890vO.A0z(r5, r2, r0)
            r0 = 2131890428(0x7f1210fc, float:1.9415548E38)
            X.C17890vO.A0z(r4, r2, r0)
            r2.put(r3, r1)
            r4 = 0
            r3 = 1065353216(0x3f800000, float:1.0)
            android.view.animation.AlphaAnimation r0 = new android.view.animation.AlphaAnimation
            r0.<init>(r4, r3)
            r1 = 200(0xc8, double:9.9E-322)
            r0.setDuration(r1)
            r7.A04 = r0
            android.view.animation.AlphaAnimation r0 = new android.view.animation.AlphaAnimation
            r0.<init>(r3, r4)
            r0.setDuration(r1)
            r7.A0D = r0
            X.8Av r2 = r7.A0M
            boolean r1 = r2.Beu()
            com.whatsapp.wds.components.button.WDSButton r0 = r7.A0U
            X.C123656Vh.A00(r0, r1)
            r7.A06()
            java.lang.String r0 = r2.getFlashMode()
            X.C18070vi.A0X(r0)
            r7.A0A(r0)
            com.whatsapp.WaImageView r2 = r7.A0L
            android.content.Context r1 = r7.A0E
            r0 = 2131232989(0x7f0808dd, float:1.8082103E38)
            X.AnonymousClass3MX.A1B(r1, r2, r0)
            r4 = 3
            X.BJf r0 = new X.BJf
            r0.<init>(r4)
            X.AnonymousClass1HF.A0f(r2, r0)
            com.whatsapp.WaImageView r3 = r7.A0L
            android.content.Context r2 = r7.A0E
            int r1 = r7.A01
            r0 = 2
            if (r1 == r0) goto L_0x0168
            r0 = 2131896142(0x7f12274e, float:1.9427137E38)
            if (r1 != r4) goto L_0x016b
        L_0x0168:
            r0 = 2131896143(0x7f12274f, float:1.9427139E38)
        L_0x016b:
            X.AnonymousClass3MY.A0w(r2, r3, r0)
            android.content.Context r0 = r7.A0E
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131168722(0x7f070dd2, float:1.7951754E38)
            int r1 = r1.getDimensionPixelSize(r0)
            com.whatsapp.WaImageView r0 = r7.A0L
            r0.setPadding(r1, r1, r1, r1)
            android.view.View r1 = r7.A0F
            r0 = 2131434413(0x7f0b1bad, float:1.849064E38)
            android.view.View r1 = X.C18070vi.A05(r1, r0)
            com.whatsapp.CircularProgressBar r1 = (com.whatsapp.CircularProgressBar) r1
            r0 = 100
            r1.setMax(r0)
            r0 = 0
            r1.setProgress(r0)
            r0 = 1036831949(0x3dcccccd, float:0.1)
            r1.A05 = r0
            r0 = 1090519040(0x41000000, float:8.0)
            r1.A06 = r0
            r7.A05 = r1
            com.whatsapp.wds.components.button.WDSButton r4 = r7.A0U
            android.content.Context r3 = r7.A0E
            r2 = 2131231917(0x7f0804ad, float:1.8079929E38)
            r1 = 2130971957(0x7f040d35, float:1.7552667E38)
            r0 = 2131103410(0x7f060eb2, float:1.7819285E38)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass4aX.A03(r3, r1, r0, r2)
            r4.setIcon((android.graphics.drawable.Drawable) r0)
            com.whatsapp.wds.components.button.WDSButton r1 = r7.A0S
            r0 = 2131231815(0x7f080447, float:1.8079722E38)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass3MX.A06(r3, r0)
            r1.setIcon((android.graphics.drawable.Drawable) r0)
            r7.A07()
            r7.A08()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass741.<init>(android.view.View, X.8Av, X.7DY, X.6fp, X.0z4, X.0ve):void");
    }

    public static final RotateAnimation A00(float f, float f2) {
        RotateAnimation rotateAnimation = new RotateAnimation(f, f2, 1, 0.5f, 1, 0.5f);
        C108985cd.A13(rotateAnimation, new LinearInterpolator());
        rotateAnimation.setFillAfter(true);
        return rotateAnimation;
    }

    public static final void A01(AnonymousClass741 r3) {
        C160978Av r2 = r3.A0M;
        if (r2.getFlashModes().size() <= 1) {
            Boolean bool = C17970vW.A03;
            r3.A0I.setVisibility(8);
            return;
        }
        r3.A0I.setVisibility(0);
        String flashMode = r2.getFlashMode();
        C18070vi.A0X(flashMode);
        r3.A0A(flashMode);
    }

    public static final void A02(AnonymousClass741 r12, float f, float f2) {
        r12.A0L.setActivated(true);
        ScaleAnimation scaleAnimation = new ScaleAnimation(f, f2, f, f2, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(220);
        scaleAnimation.setInterpolator((Interpolator) AnonymousClass6YW.A00.getValue());
        scaleAnimation.setFillAfter(true);
        CircularProgressBar circularProgressBar = r12.A05;
        circularProgressBar.A06 = 8.0f * f2;
        circularProgressBar.A08 = C19740yt.A00(r12.A0E, 2131102556);
        circularProgressBar.startAnimation(scaleAnimation);
    }

    public static final void A03(AnonymousClass741 r3, float f, float f2, boolean z) {
        r3.A0L.setActivated(z);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(C72473Md.A1a(f, f2));
        ofFloat.setDuration(220);
        ofFloat.setInterpolator((TimeInterpolator) AnonymousClass6YW.A00.getValue());
        C1411074h.A00(ofFloat, r3, 9);
        ofFloat.start();
    }

    public static final void A04(AnonymousClass741 r6, boolean z) {
        r6.A0M.CLV(0);
        C1419577p r0 = r6.A0Z.A0J;
        if (r0 == null) {
            C18070vi.A11("cameraGestureDetector");
            throw null;
        }
        r0.A00 = 1.0f;
        C1407172r r4 = r6.A07;
        if (r4 != null && r4.A03()) {
            WDSButton wDSButton = r4.A01;
            if (wDSButton != null) {
                wDSButton.removeCallbacks(r4.A02);
            }
            if (z) {
                float f = r4.A00;
                float[] A1V = C108945cZ.A1V();
                A1V[0] = f;
                A1V[1] = 1.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(A1V);
                ofFloat.setDuration(500);
                C1411074h.A00(ofFloat, r4, 10);
                ofFloat.addListener(new AnonymousClass74R(r4, 1));
                ofFloat.start();
                return;
            }
            r4.A00 = 1.0f;
            C1407172r.A02(r4, C1407172r.A00(r4, 1.0f));
            r4.A02.run();
        }
    }

    public static final boolean A05(AnonymousClass741 r2) {
        if (C17890vO.A00(C17890vO.A0B(r2.A0O), "pref_ar_pre_capture_animation_times") < 5) {
            if (!C18020vd.A05(C18040vf.A02, r2.A0P, 12253)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final void A06() {
        this.A0L.setEnabled(false);
        this.A0U.setEnabled(false);
        this.A0K.setEnabled(false);
        WDSButton wDSButton = this.A08;
        if (wDSButton != null) {
            wDSButton.setEnabled(false);
        }
    }

    public final void A07() {
        C106595Wl r2 = (C106595Wl) this.A0N.A00.invoke();
        if (C18070vi.A18(r2, C92724hn.A00)) {
            C28931bI r1 = this.A0Q;
            View view = r1.A00;
            if (view != null) {
                view.clearAnimation();
            }
            r1.A04(8);
        } else if (r2 instanceof C92734ho) {
            this.A0Q.A04(0);
            boolean z = ((C92734ho) r2).A00;
            WDSButton wDSButton = this.A08;
            if (wDSButton != null) {
                wDSButton.setSelected(z);
            }
            if (z && C1402270m.A00(this.A0P) && A05(this)) {
                C17880vN.A1C(C19830z4.A00(this.A0O), "pref_ar_pre_capture_animation_times", 5);
            }
        }
    }

    public final void A08() {
        WDSButton wDSButton = this.A0T;
        wDSButton.clearAnimation();
        C18090vk r1 = this.A0N.A01;
        wDSButton.setEnabled(AnonymousClass000.A1O(AnonymousClass000.A1Y(r1.invoke()) ? 1 : 0));
        wDSButton.setVisibility(C72453Mb.A06(AnonymousClass000.A1Y(r1.invoke()) ? 1 : 0));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001e, code lost:
        if (r2 == 3) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A09() {
        /*
            r7 = this;
            com.whatsapp.WaImageView r6 = r7.A0L
            r5 = 0
            r6.setActivated(r5)
            r6.clearAnimation()
            android.content.Context r4 = r7.A0E
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131168722(0x7f070dd2, float:1.7951754E38)
            int r3 = r1.getDimensionPixelSize(r0)
            int r2 = r7.A01
            r0 = 2
            if (r2 == r0) goto L_0x0020
            r0 = 3
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r2 != r0) goto L_0x0023
        L_0x0020:
            r1 = 1058642330(0x3f19999a, float:0.6)
        L_0x0023:
            float r0 = (float) r3
            float r0 = r0 / r1
            int r0 = (int) r0
            r6.setPadding(r0, r0, r0, r0)
            com.whatsapp.CircularProgressBar r1 = r7.A05
            r1.clearAnimation()
            r1.setProgress(r5)
            r0 = 2131102557(0x7f060b5d, float:1.7817555E38)
            int r0 = X.C19740yt.A00(r4, r0)
            r1.A08 = r0
            r1.requestLayout()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass741.A09():void");
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [X.5db, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable] */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0053, code lost:
        if (r0 == false) goto L_0x0055;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0A(java.lang.String r7) {
        /*
            r6 = this;
            java.util.HashMap r0 = r6.A0W
            java.lang.Number r0 = X.C108945cZ.A1D(r7, r0)
            if (r0 == 0) goto L_0x0097
            int r3 = r0.intValue()
            java.util.HashMap r0 = r6.A0V
            java.lang.Number r0 = X.C108945cZ.A1D(r7, r0)
            if (r0 == 0) goto L_0x0097
            int r4 = r0.intValue()
            X.8Av r0 = r6.A0M
            java.util.List r2 = r0.getFlashModes()
            X.C18070vi.A0X(r2)
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x0055
            int r0 = r2.indexOf(r7)
            int r1 = r0 + 1
            int r0 = r2.size()
            int r1 = r1 % r0
            java.lang.String r2 = X.C17880vN.A0w(r2, r1)
            if (r2 == 0) goto L_0x0055
            int r1 = r2.hashCode()
            r0 = 3551(0xddf, float:4.976E-42)
            if (r1 == r0) goto L_0x009c
            r0 = 109935(0x1ad6f, float:1.54052E-40)
            if (r1 == r0) goto L_0x0055
            r0 = 3005871(0x2dddaf, float:4.212122E-39)
            if (r1 != r0) goto L_0x0055
            java.lang.String r0 = "auto"
            boolean r0 = r2.equals(r0)
            r1 = 2131890429(0x7f1210fd, float:1.941555E38)
        L_0x0053:
            if (r0 != 0) goto L_0x0058
        L_0x0055:
            r1 = 2131890432(0x7f121100, float:1.9415556E38)
        L_0x0058:
            com.whatsapp.WaImageView r5 = r6.A0K
            X.AnonymousClass1Y5.A02(r5, r1)
            android.content.Context r1 = r6.A0E
            X.AnonymousClass3MY.A0w(r1, r5, r4)
            int r0 = r6.A0C
            if (r0 == r3) goto L_0x0098
            if (r0 == 0) goto L_0x0098
            android.graphics.drawable.Drawable r4 = X.C24261Jm.A00(r1, r0)
            android.graphics.drawable.Drawable r2 = X.C24261Jm.A00(r1, r3)
            r1 = 2
            android.graphics.drawable.Drawable[] r0 = new android.graphics.drawable.Drawable[r1]
            X.AnonymousClass001.A1Q(r4, r2, r0)
            X.5db r2 = new X.5db
            r2.<init>(r0)
            r2.A02 = r1
            int r1 = r2.getIntrinsicHeight()
            int r0 = r5.getPaddingTop()
            int r1 = r1 + r0
            r0 = 120(0x78, float:1.68E-43)
            r2.A00 = r0
            r2.A01 = r1
            r0 = 0
            r2.A02 = r0
            r2.invalidateSelf()
            r5.setImageDrawable(r2)
        L_0x0095:
            r6.A0C = r3
        L_0x0097:
            return
        L_0x0098:
            r5.setImageResource(r3)
            goto L_0x0095
        L_0x009c:
            java.lang.String r0 = "on"
            boolean r0 = r2.equals(r0)
            r1 = 2131890434(0x7f121102, float:1.941556E38)
            goto L_0x0053
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass741.A0A(java.lang.String):void");
    }

    public final void A0B(boolean z) {
        View view;
        if (!z) {
            WDSButton wDSButton = this.A0U;
            wDSButton.startAnimation(this.A0D);
            wDSButton.setVisibility(8);
        }
        ViewGroup viewGroup = this.A0I;
        AlphaAnimation alphaAnimation = this.A0D;
        viewGroup.startAnimation(alphaAnimation);
        viewGroup.setVisibility(8);
        if (AnonymousClass000.A1Y(this.A0N.A01.invoke())) {
            WDSButton wDSButton2 = this.A0T;
            wDSButton2.startAnimation(alphaAnimation);
            wDSButton2.setVisibility(8);
        }
        C28931bI r1 = this.A0Q;
        if (r1.A00 != null) {
            View A022 = r1.A02();
            A022.startAnimation(alphaAnimation);
            A022.setVisibility(8);
        }
        View view2 = this.A03;
        if (!(view2 == null || view2.getVisibility() != 0 || (view = this.A03) == null)) {
            view.startAnimation(alphaAnimation);
            view.setVisibility(8);
        }
        WDSButton wDSButton3 = this.A0S;
        wDSButton3.startAnimation(alphaAnimation);
        wDSButton3.setVisibility(8);
    }

    public final void A0C(boolean z) {
        CircularProgressBar circularProgressBar = this.A05;
        int i = 0;
        circularProgressBar.setVisibility(C72453Mb.A07(z ? 1 : 0));
        float f = 1.0f;
        circularProgressBar.setAlpha(C108975cc.A01(z));
        WaImageView waImageView = this.A0L;
        waImageView.setEnabled(z);
        if (!z) {
            i = 8;
        }
        waImageView.setVisibility(i);
        if (!z) {
            f = 0.0f;
        }
        waImageView.setAlpha(f);
    }

    public final void A0D(boolean z, int i) {
        View view = this.A0H;
        int visibility = view.getVisibility();
        if (z) {
            if (visibility != 0) {
                view.setVisibility(0);
                view.startAnimation(this.A04);
            }
            TextView textView = this.A0Y;
            textView.setText(String.valueOf(i));
            textView.setContentDescription(C72473Md.A0k(textView.getResources(), i, 2131755256));
        } else if (visibility != 8) {
            view.setVisibility(8);
            view.startAnimation(this.A0D);
        }
    }
}
