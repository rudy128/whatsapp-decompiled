package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.Scroller;
import com.bloks.foa.components.bottomsheet.ViewDragHelper$Callback;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Cvl  reason: case insensitive filesystem */
public class C26247Cvl {
    public float A00;
    public float A01;
    public int A02 = -1;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public VelocityTracker A07;
    public View A08;
    public Scroller A09;
    public boolean A0A;
    public float[] A0B;
    public float[] A0C;
    public float[] A0D;
    public float[] A0E;
    public Scroller A0F;
    public final ViewGroup A0G;
    public final ViewDragHelper$Callback A0H;
    public final Runnable A0I = new C21466AkX((Object) this, 35);

    public static void A01(C26247Cvl cvl, float f) {
        cvl.A0A = true;
        cvl.A0H.A01(cvl.A08, f);
        cvl.A0A = false;
        if (cvl.A03 == 1) {
            cvl.A09(0);
        }
    }

    public void A07() {
        this.A02 = -1;
        float[] fArr = this.A0B;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.A0C, 0.0f);
            Arrays.fill(this.A0D, 0.0f);
            Arrays.fill(this.A0E, 0.0f);
            this.A05 = 0;
        }
        VelocityTracker velocityTracker = this.A07;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.A07 = null;
        }
    }

    public static void A02(C26247Cvl cvl, float f, float f2, int i) {
        float[] fArr = cvl.A0B;
        if (fArr == null || fArr.length <= i) {
            int i2 = i + 1;
            float[] fArr2 = new float[i2];
            float[] fArr3 = new float[i2];
            float[] fArr4 = new float[i2];
            float[] fArr5 = new float[i2];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = cvl.A0C;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = cvl.A0D;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = cvl.A0E;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
            }
            cvl.A0B = fArr2;
            fArr = fArr2;
            cvl.A0C = fArr3;
            cvl.A0D = fArr4;
            cvl.A0E = fArr5;
        }
        cvl.A0D[i] = f;
        fArr[i] = f;
        float[] fArr9 = cvl.A0C;
        cvl.A0E[i] = f2;
        fArr9[i] = f2;
        cvl.A05 |= 1 << i;
    }

    public static void A03(C26247Cvl cvl, int i) {
        float[] fArr = cvl.A0B;
        if (fArr != null && fArr.length > i) {
            fArr[i] = 0.0f;
            cvl.A0C[i] = 0.0f;
            cvl.A0D[i] = 0.0f;
            cvl.A0E[i] = 0.0f;
            cvl.A05 = ((1 << i) ^ -1) & cvl.A05;
        }
    }

    public static void A04(C26247Cvl cvl, int i, int i2) {
        int BXI;
        int BXI2;
        int left = cvl.A08.getLeft();
        int top = cvl.A08.getTop();
        ViewDragHelper$Callback viewDragHelper$Callback = cvl.A0H;
        View view = cvl.A08;
        C22646BHi bHi = ((BNC) viewDragHelper$Callback).A00;
        if (bHi.A02 != null) {
            i2 = (int) (((float) i2) * 0.15f);
        }
        int i3 = top + i2;
        if (i != 0) {
            view.offsetLeftAndRight(-left);
        }
        if (i2 != 0) {
            View view2 = cvl.A08;
            if (bHi.A0C != null) {
                int height = bHi.getHeight();
                C28483E3n e3n = null;
                C28483E3n e3n2 = null;
                for (C28483E3n e3n3 : bHi.A0C) {
                    if (e3n == null) {
                        e3n = e3n3;
                    } else {
                        int BXI3 = e3n3.BXI(view2, height);
                        if (BXI3 >= e3n2.BXI(view2, height)) {
                            if (BXI3 > e3n.BXI(view2, height)) {
                                e3n = e3n3;
                            }
                        }
                    }
                    e3n2 = e3n3;
                }
                if (e3n == null) {
                    BXI = i3;
                } else {
                    BXI = e3n.BXI(view2, height);
                }
                if (e3n2 == null) {
                    BXI2 = i3;
                } else {
                    BXI2 = e3n2.BXI(view2, height);
                }
                i3 = height - BE8.A07(BXI, height - i3, BXI2);
            }
            cvl.A08.offsetTopAndBottom(i3 - top);
        }
        if (i != 0 || i2 != 0) {
            viewDragHelper$Callback.A00(cvl.A08);
        }
    }

    public static boolean A05(C26247Cvl cvl, int i, int i2, int i3) {
        int i4;
        int min;
        int i5 = i3;
        int left = cvl.A08.getLeft();
        int top = cvl.A08.getTop();
        int i6 = -left;
        int i7 = i - top;
        if (i6 == 0 && i7 == 0) {
            cvl.A09.abortAnimation();
            cvl.A09(0);
            return false;
        }
        if (i3 < 0) {
            int i8 = (int) cvl.A01;
            int i9 = (int) cvl.A00;
            int abs = Math.abs(i2);
            if (abs < i8) {
                i2 = 0;
            } else if (abs > i9) {
                if (i2 <= 0) {
                    i9 = -i9;
                }
                i2 = i9;
            }
            int abs2 = Math.abs(i6);
            int abs3 = Math.abs(i7);
            int i10 = abs2 + abs3;
            float f = 1.0f;
            if (i2 == 0) {
                f = ((float) abs3) / ((float) i10);
            }
            int height = ((BNC) cvl.A0H).A00.getHeight();
            int width = cvl.A0G.getWidth();
            if (i7 == 0) {
                min = 0;
            } else {
                float f2 = (float) abs3;
                float f3 = (float) (width / 2);
                float sin = f3 + (f3 * ((float) Math.sin((double) ((float) (((double) (Math.min(1.0f, f2 / ((float) width)) - 0.5f)) * 0.4712389167638204d)))));
                int abs4 = Math.abs(i2);
                if (abs4 > 0) {
                    i4 = BE6.A04(Math.abs(sin / ((float) abs4)), 1000.0f) * 4;
                } else {
                    i4 = (int) (((f2 / ((float) height)) + 1.0f) * 256.0f);
                }
                min = Math.min(i4, 600);
            }
            i5 = (int) (((float) min) * f);
        }
        cvl.A09.startScroll(left, top, i6, i7, i5);
        cvl.A04 = top + i7;
        cvl.A09(2);
        return true;
    }

    public View A06(int i, int i2) {
        ViewGroup viewGroup = this.A0G;
        int childCount = viewGroup.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                return null;
            }
            View childAt = viewGroup.getChildAt(childCount);
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
    }

    public void A08() {
        Scroller scroller = this.A09;
        Scroller scroller2 = this.A0F;
        if (scroller != scroller2) {
            A07();
            if (this.A03 == 2) {
                this.A09.getCurrX();
                this.A09.getCurrY();
                this.A09.abortAnimation();
                this.A09.getCurrX();
                this.A09.getCurrY();
                this.A0H.A00(this.A08);
            }
            A09(0);
            this.A09 = scroller2;
        }
    }

    public void A09(int i) {
        C28483E3n e3n;
        if (this.A03 != i) {
            this.A03 = i;
            C22646BHi bHi = ((BNC) this.A0H).A00;
            View view = bHi.A01;
            if (view != null && view.isLaidOut()) {
                List<E7I> list = bHi.A0H;
                if (!list.isEmpty()) {
                    if (i == 0) {
                        List emptyList = Collections.emptyList();
                        View view2 = bHi.A01;
                        if (view2 == null || !view2.isLaidOut()) {
                            e3n = null;
                        } else {
                            int height = bHi.getHeight();
                            e3n = C22646BHi.A00(view2, bHi, emptyList, height - view2.getTop(), height);
                        }
                        bHi.A04 = e3n;
                        for (E7I C10 : list) {
                            C10.C10(view, e3n);
                        }
                        bHi.requestLayout();
                    }
                    if (!list.isEmpty()) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            it.next();
                        }
                    }
                }
            }
            if (i == 0) {
                this.A08 = null;
            }
        }
    }

    public boolean A0A(View view, int i) {
        if (view == this.A08 && this.A02 == i) {
            return true;
        }
        if (view == null) {
            return false;
        }
        this.A02 = i;
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = this.A0G;
        if (parent == viewGroup) {
            this.A08 = view;
            this.A02 = i;
            A09(1);
            return true;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (");
        A10.append(viewGroup);
        throw AnonymousClass001.A12(")", A10);
    }

    public C26247Cvl(Context context, ViewGroup viewGroup, ViewDragHelper$Callback viewDragHelper$Callback) {
        this.A0G = viewGroup;
        this.A0H = viewDragHelper$Callback;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        context.getResources().getDisplayMetrics();
        this.A06 = viewConfiguration.getScaledTouchSlop();
        this.A00 = (float) viewConfiguration.getScaledMaximumFlingVelocity();
        this.A01 = (float) viewConfiguration.getScaledMinimumFlingVelocity();
        Scroller scroller = new Scroller(context);
        this.A09 = scroller;
        this.A0F = scroller;
    }

    public static void A00(MotionEvent motionEvent, C26247Cvl cvl) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (((1 << pointerId) & cvl.A05) != 0) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                cvl.A0D[pointerId] = x;
                cvl.A0E[pointerId] = y;
            }
        }
    }
}
