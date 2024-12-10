package X;

import android.animation.ValueAnimator;
import android.graphics.Point;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import com.whatsapp.calling.callgrid.view.PipViewContainer;
import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.78v  reason: invalid class name and case insensitive filesystem */
public class C1422778v implements View.OnTouchListener {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public long A0D;
    public AnonymousClass6UO A0E;
    public Runnable A0F;
    public boolean A0G;
    public final double A0H;
    public final int A0I = ViewConfiguration.getLongPressTimeout();
    public final /* synthetic */ PipViewContainer A0J;

    public C1422778v(PipViewContainer pipViewContainer) {
        this.A0J = pipViewContainer;
        int i = C108965cb.A07().widthPixels;
        int i2 = C108965cb.A07().heightPixels;
        this.A0H = Math.sqrt((double) ((i * i) + (i2 * i2)));
        this.A0F = new C146427Pb(this, 4);
    }

    public static boolean A01(C1422778v r7) {
        PipViewContainer pipViewContainer = r7.A0J;
        C113615nN r0 = pipViewContainer.A09;
        if (r0 == null || r0.A05 == null || ((double) r7.A08) >= r7.A0H / 60.0d) {
            return false;
        }
        if (!C72463Mc.A1Z(pipViewContainer.A0H) || pipViewContainer.A0K || pipViewContainer.A0Q) {
            return true;
        }
        return false;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        int i;
        String str;
        int i2;
        int i3;
        int i4;
        float f;
        float rawX;
        int i5;
        View view2 = view;
        ViewGroup.MarginLayoutParams A0B2 = AnonymousClass3MW.A0B(view2);
        PipViewContainer pipViewContainer = this.A0J;
        C113615nN r5 = pipViewContainer.A09;
        if (r5 != null && (r5 instanceof C116185wX)) {
            C116185wX r52 = (C116185wX) r5;
            int action = motionEvent.getAction();
            if (action == 0) {
                Iterator A15 = AnonymousClass000.A15(r52.A0Z);
                while (true) {
                    if (!A15.hasNext()) {
                        break;
                    }
                    Map.Entry A16 = AnonymousClass000.A16(A15);
                    if (C116185wX.A03(r52, A16, motionEvent.getRawX(), motionEvent.getRawY())) {
                        ((C28931bI) A16.getKey()).A02().setPressed(true);
                        break;
                    }
                }
            } else if (action == 1 || action == 3) {
                for (C28931bI A022 : r52.A0Z.keySet()) {
                    A022.A02().setPressed(false);
                }
            }
        }
        int action2 = motionEvent.getAction();
        boolean z = true;
        if (action2 != 0) {
            if (action2 == 1) {
                if (!C72463Mc.A1Z(pipViewContainer.A0H)) {
                    A00(view2.animate(), 1.0f);
                    this.A0G = false;
                }
                if (this.A0E == null) {
                    str = "PipViewContainer/onTouch ACTION_UP dispatched before ACTION_DOWN, ignore";
                } else {
                    view2.removeCallbacks(this.A0F);
                    if (A01(this)) {
                        C113615nN r2 = pipViewContainer.A09;
                        if (r2 != null) {
                            r2.A0C(motionEvent.getRawX(), motionEvent.getRawY());
                        }
                        PipViewContainer.A05(pipViewContainer, false);
                        PipViewContainer.A01(pipViewContainer);
                        return true;
                    }
                    float f2 = this.A04;
                    float f3 = this.A05;
                    float sqrt = (float) Math.sqrt((double) ((f2 * f2) + (f3 * f3)));
                    double d = this.A0H;
                    boolean A1R = AnonymousClass000.A1R((((double) sqrt) > (d / 1.0d) ? 1 : (((double) sqrt) == (d / 1.0d) ? 0 : -1)));
                    float rawX2 = motionEvent.getRawX();
                    float rawY = motionEvent.getRawY();
                    if (A1R) {
                        double d2 = (double) ((this.A04 / sqrt) * 64.0f);
                        double d3 = (double) ((this.A05 / sqrt) * 64.0f);
                        while (rawX2 >= 0.0f && rawX2 <= ((float) this.A07) && rawY >= 0.0f && rawY <= ((float) this.A06)) {
                            rawX2 = (float) (((double) rawX2) + d2);
                            rawY = (float) (((double) rawY) + d3);
                        }
                    }
                    C18000vb r3 = pipViewContainer.A0C;
                    boolean A1b = AnonymousClass3MY.A1b(r3);
                    float f4 = (float) (this.A07 / 2);
                    if (!A1b ? rawX2 > f4 : rawX2 < f4) {
                        z = false;
                    }
                    boolean A1Q = AnonymousClass000.A1Q((rawY > ((float) (this.A06 / 2)) ? 1 : (rawY == ((float) (this.A06 / 2)) ? 0 : -1)));
                    pipViewContainer.A06 = C108945cZ.A0N(Boolean.valueOf(z), Boolean.valueOf(A1Q));
                    C130786k0 r13 = pipViewContainer.A0B;
                    C17960vV.A07(r13);
                    Point point = pipViewContainer.A05;
                    C17960vV.A07(point);
                    AnonymousClass6UO A002 = PipViewContainer.A00(point, new Point(this.A0C, this.A0B), pipViewContainer, r13);
                    if (z) {
                        i2 = A002.A00;
                    } else {
                        i2 = A002.A02;
                    }
                    if (A1Q) {
                        i3 = A002.A01;
                    } else {
                        i3 = A002.A03;
                    }
                    Point point2 = new Point(i2, i3);
                    int i6 = point2.x;
                    if (AnonymousClass3MY.A1b(r3)) {
                        i4 = A0B2.leftMargin;
                    } else {
                        i4 = A0B2.rightMargin;
                    }
                    int i7 = i6 - i4;
                    int i8 = point2.y - A0B2.topMargin;
                    double sqrt2 = Math.sqrt((double) ((i7 * i7) + (i8 * i8)));
                    long max = (long) Math.max(200, (int) ((500.0d * sqrt2) / d));
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("PipViewContainer/onTouch ACTION_UP xVelocity: ");
                    A10.append(this.A04);
                    A10.append(", yVelocity: ");
                    A10.append(this.A05);
                    A10.append(", velocity: ");
                    A10.append(sqrt);
                    A10.append(", fling: ");
                    A10.append(A1R);
                    A10.append(", finalRawX: ");
                    A10.append(rawX2);
                    A10.append(", finalRawY: ");
                    A10.append(rawY);
                    A10.append(", screen length: (");
                    A10.append(d);
                    A10.append("), container size: ");
                    A10.append(this.A07);
                    A10.append("x");
                    A10.append(this.A06);
                    A10.append(", pipAtRight: ");
                    A10.append(z);
                    A10.append(", pipAtBottom: ");
                    A10.append(A1Q);
                    A10.append(", moving distance: ");
                    A10.append(sqrt2);
                    C17900vP.A0m(", duration: ", A10, max);
                    StringBuilder A102 = AnonymousClass000.A10();
                    A102.append("PipViewContainer/animatePiPView with duration: ");
                    A102.append(max);
                    A102.append(", xOffset: ");
                    A102.append(i7);
                    C17900vP.A0j(", yOffset: ", A102, i8);
                    if (max <= 0 || !pipViewContainer.A0R) {
                        PipViewContainer.A02(pipViewContainer);
                        return true;
                    }
                    float[] A1V = C108945cZ.A1V();
                    // fill-array-data instruction
                    A1V[0] = 0;
                    A1V[1] = 1065353216;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(A1V);
                    pipViewContainer.A03 = ofFloat;
                    ofFloat.setDuration(max);
                    pipViewContainer.A03.addUpdateListener(new C1411174i(view2, pipViewContainer, i7, i8));
                    C109195cy.A02(pipViewContainer.A03, pipViewContainer, 4);
                    pipViewContainer.A03.start();
                    return true;
                }
            } else if (action2 != 2) {
                if (action2 != 3) {
                    return true;
                }
                if (!C72463Mc.A1Z(pipViewContainer.A0H)) {
                    A00(view2.animate(), 1.0f);
                    this.A0G = false;
                }
                view2.removeCallbacks(this.A0F);
                return true;
            } else if (this.A0E == null) {
                str = "PipViewContainer/onTouch ACTION_MOVE dispatched before ACTION_DOWN, ignore";
            } else {
                int i9 = this.A09;
                C18000vb r10 = pipViewContainer.A0C;
                if (AnonymousClass3MY.A1b(r10)) {
                    f = motionEvent.getRawX();
                    rawX = this.A00;
                } else {
                    f = this.A00;
                    rawX = motionEvent.getRawX();
                }
                int rawY2 = this.A0A + ((int) (motionEvent.getRawY() - this.A01));
                AnonymousClass6UO r22 = this.A0E;
                int max2 = Math.max(r22.A02, Math.min(r22.A00, i9 + ((int) (f - rawX))));
                int max3 = Math.max(r22.A03, Math.min(r22.A01, rawY2));
                motionEvent.getEventTime();
                motionEvent.getRawX();
                motionEvent.getRawY();
                if (AnonymousClass3MY.A1b(r10)) {
                    i5 = A0B2.rightMargin;
                } else {
                    i5 = A0B2.leftMargin;
                }
                int i10 = A0B2.bottomMargin;
                View view3 = view2;
                C27641Ww.A06(view3, r10, max2, max3, i5, i10);
                this.A08 = Math.max(Math.max(C108945cZ.A05(max2, this.A09), C108945cZ.A05(max3, this.A0A)), this.A08);
                if (!A01(this) && !this.A0G && !C72463Mc.A1Z(pipViewContainer.A0H)) {
                    this.A0G = true;
                    A00(view2.animate(), 1.1f);
                    view3.removeCallbacks(this.A0F);
                }
                long eventTime = motionEvent.getEventTime() - this.A0D;
                if (eventTime > 0) {
                    float f5 = (float) eventTime;
                    this.A04 = ((motionEvent.getRawX() - this.A02) * 1000.0f) / f5;
                    this.A05 = ((motionEvent.getRawY() - this.A03) * 1000.0f) / f5;
                }
                this.A02 = motionEvent.getRawX();
                this.A03 = motionEvent.getRawY();
                this.A0D = motionEvent.getEventTime();
                return true;
            }
            Log.i(str);
            return true;
        }
        view2.postDelayed(this.A0F, (long) this.A0I);
        Point point3 = pipViewContainer.A05;
        C17960vV.A07(point3);
        this.A07 = point3.x;
        C17960vV.A07(point3);
        this.A06 = point3.y;
        this.A00 = motionEvent.getRawX();
        this.A01 = motionEvent.getRawY();
        if (AnonymousClass3MY.A1b(pipViewContainer.A0C)) {
            i = A0B2.leftMargin;
        } else {
            i = A0B2.rightMargin;
        }
        this.A09 = i;
        this.A0A = A0B2.topMargin;
        this.A0C = view2.getWidth();
        this.A0B = view2.getHeight();
        PipViewContainer.A05(pipViewContainer, true);
        this.A08 = 0;
        ViewGroup.LayoutParams layoutParams = pipViewContainer.getLayoutParams();
        Point point4 = new Point(layoutParams.width, layoutParams.height);
        C130786k0 r1 = pipViewContainer.A0B;
        C17960vV.A07(r1);
        Point point5 = pipViewContainer.A05;
        C17960vV.A07(point5);
        this.A0E = PipViewContainer.A00(point5, point4, pipViewContainer, r1);
        this.A05 = 0.0f;
        this.A04 = 0.0f;
        this.A03 = 0.0f;
        this.A02 = 0.0f;
        this.A0D = 0;
        StringBuilder A103 = AnonymousClass000.A10();
        A103.append("PipViewContainer/onTouch ACTION_DOWN downX: ");
        A103.append(this.A00);
        A103.append(", downY: ");
        A103.append(this.A01);
        A103.append(", leftMargin: ");
        A103.append(this.A09);
        A103.append(", topMargin: ");
        C17900vP.A0o(A103, this.A0A);
        return true;
    }

    public static void A00(ViewPropertyAnimator viewPropertyAnimator, float f) {
        viewPropertyAnimator.scaleX(f).scaleY(f).setDuration(100).start();
    }
}
