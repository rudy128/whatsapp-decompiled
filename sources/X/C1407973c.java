package X;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.voipcalling.VoipCallControlBottomSheetV2;

/* renamed from: X.73c  reason: invalid class name and case insensitive filesystem */
public class C1407973c {
    public int A00;
    public int A01 = 0;
    public ValueAnimator A02;
    public ValueAnimator A03;
    public boolean A04 = true;
    public boolean A05;
    public boolean A06 = true;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public float A0C;
    public final View A0D;
    public final View A0E;
    public final C6X A0F = new C114315qV(this, 4);
    public final BottomSheetBehavior A0G;
    public final VoipCallControlBottomSheetV2 A0H;
    public final View A0I;
    public final AnonymousClass1DC A0J;
    public final C28931bI A0K;
    public final boolean A0L;

    public static void A01(C1407973c r7, int i) {
        AnonymousClass7RP r6 = new AnonymousClass7RP(r7, i, 31);
        View view = r7.A0D;
        ViewParent parent = view.getParent();
        Handler handler = view.getHandler();
        if (handler != null && handler.hasMessages(1)) {
            C17900vP.A0j("CallControlBottomSheetBehaviorController setBottomSheetState cancelling previous state change request, superseded by ", AnonymousClass000.A10(), i);
            handler.removeMessages(1);
        }
        if (parent == null || !parent.isLayoutRequested() || !view.isAttachedToWindow() || handler == null) {
            r6.run();
            return;
        }
        Message obtain = Message.obtain(handler, r6);
        obtain.what = 1;
        handler.sendMessage(obtain);
    }

    public static void A02(C1407973c r3, long j) {
        if (r3.A0G.A0R() > 0) {
            AnonymousClass1LG r2 = new AnonymousClass1LG();
            r2.A0C(j);
            r2.A0N(new C113745nf(r3, 0));
            C29191bl.A02((ViewGroup) r3.A0D, r2);
        }
    }

    public static void A03(C1407973c r4, boolean z) {
        ValueAnimator valueAnimator = r4.A02;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float A012 = C108975cc.A01(z ? 1 : 0);
        float[] A1V = C108945cZ.A1V();
        A1V[0] = r4.A0D.getAlpha();
        A1V[1] = A012;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(A1V);
        r4.A02 = ofFloat;
        ofFloat.setDuration(200);
        C1411074h.A00(r4.A02, r4, 8);
        r4.A02.addListener(new C109155cu(r4, A012, 1));
        r4.A02.start();
    }

    public void A04() {
        long j;
        C28931bI r0;
        if (this.A06) {
            Activity A052 = AnonymousClass3Ma.A05(this.A0D);
            if (Build.VERSION.SDK_INT <= 24 || !A052.isInPictureInPictureMode()) {
                int A002 = AnonymousClass4aR.A00(A052);
                float f = 0.75f;
                if (this.A0L) {
                    f = 0.6f;
                }
                this.A0C = (float) ((int) (f * ((float) A002)));
                int dimensionPixelSize = A052.getResources().getDimensionPixelSize(2131165596);
                if (this.A0B) {
                    dimensionPixelSize += this.A0I.getMeasuredHeight();
                }
                if (this.A07 && (r0 = this.A0K) != null) {
                    dimensionPixelSize += r0.A02().getMeasuredHeight();
                }
                if (this.A08) {
                    dimensionPixelSize = AnonymousClass3MX.A00(A052.getResources(), 2131165603, dimensionPixelSize);
                }
                BottomSheetBehavior bottomSheetBehavior = this.A0G;
                if (dimensionPixelSize != bottomSheetBehavior.A0R()) {
                    if (this.A0K != null) {
                        j = 100;
                    } else {
                        j = 500;
                    }
                    A02(this, j);
                    bottomSheetBehavior.A0V(dimensionPixelSize);
                }
            }
        }
    }

    public void A05() {
        if (this.A06) {
            View view = this.A0D;
            view.measure(View.MeasureSpec.makeMeasureSpec(view.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            if ((((float) view.getMeasuredHeight()) <= this.A0C && view.getHeight() != view.getMeasuredHeight()) || (((float) view.getMeasuredHeight()) > this.A0C && C108945cZ.A04(view) != this.A0C)) {
                C37891qK r2 = (C37891qK) view.getLayoutParams();
                boolean z = this.A07;
                int measuredHeight = view.getMeasuredHeight();
                if (!z) {
                    measuredHeight = Math.min(measuredHeight, (int) this.A0C);
                }
                r2.height = measuredHeight;
                r2.A02 = 0;
                view.setLayoutParams(r2);
            }
            this.A04 = !this.A0B;
        }
    }

    public void A06(TimeInterpolator timeInterpolator, int i, int i2, int i3, int i4) {
        if (this.A06) {
            if (this.A0G.A0J != 4) {
                i = 0;
                i2 = 0;
            }
            float[] A1V = C108945cZ.A1V();
            A1V[0] = (float) i3;
            A1V[1] = (float) i4;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(A1V);
            this.A03 = ofFloat;
            ofFloat.setInterpolator(timeInterpolator);
            this.A03.setDuration((long) i);
            this.A03.setStartDelay((long) i2);
            C1411074h.A00(this.A03, this, 7);
            this.A03.start();
        }
    }

    public boolean A07() {
        if (!this.A06 || this.A0G.A0J != 3) {
            return false;
        }
        return true;
    }

    public boolean A08() {
        int i;
        if (this.A06 || (i = this.A01) == 0) {
            i = this.A0G.A0J;
        }
        return AnonymousClass000.A1T(i, 5);
    }

    public C1407973c(View view, View view2, C18030ve r5, AnonymousClass1DC r6, C28931bI r7, VoipCallControlBottomSheetV2 voipCallControlBottomSheetV2) {
        this.A0L = C40811vJ.A0W(r5);
        this.A0D = view;
        this.A0I = view2;
        this.A0K = r7;
        this.A0G = BottomSheetBehavior.A02(view);
        this.A0H = voipCallControlBottomSheetV2;
        this.A0E = AnonymousClass1HF.A06(view, 2131428345);
        this.A0J = r6;
        this.A0G.A0a(this.A0F);
    }

    public static void A00(C41501wV r4, C1407973c r5) {
        int i;
        boolean A1W = AnonymousClass000.A1W(r4);
        r5.A06 = A1W;
        C17900vP.A0n("CallControlBottomSheetBehaviorController setBehavior ", AnonymousClass000.A10(), A1W);
        View view = r5.A0D;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof C37891qK) {
            C37891qK r1 = (C37891qK) layoutParams;
            if (r1.A0A != r4) {
                r1.A00(r4);
                view.setLayoutParams(layoutParams);
                C6X c6x = r5.A0F;
                if (r5.A06 || (i = r5.A01) == 0) {
                    i = r5.A0G.A0J;
                }
                c6x.A03(view, i);
                return;
            }
            return;
        }
        throw AnonymousClass000.A0k("The view is not a child of CoordinatorLayout");
    }
}
