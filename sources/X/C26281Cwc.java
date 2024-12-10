package X;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.Cwc  reason: case insensitive filesystem */
public class C26281Cwc {
    public static final Interpolator A0L = new C26312CxV(0);
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public View A06;
    public boolean A07;
    public float[] A08;
    public float[] A09;
    public float[] A0A;
    public float[] A0B;
    public int[] A0C;
    public int[] A0D;
    public int[] A0E;
    public int A0F = -1;
    public VelocityTracker A0G;
    public OverScroller A0H;
    public final ViewGroup A0I;
    public final C24495C6n A0J;
    public final Runnable A0K = new C21466AkX((Object) this, 4);

    private boolean A08(View view, float f, float f2) {
        float f3;
        int i;
        if (view == null) {
            return false;
        }
        C24495C6n c6n = this.A0J;
        boolean A1R = AnonymousClass000.A1R(c6n.A00(view));
        boolean A1R2 = AnonymousClass000.A1R(c6n.A01(view));
        if (A1R) {
            if (A1R2) {
                int i2 = this.A05;
                i = (((f * f) + (f2 * f2)) > ((float) (i2 * i2)) ? 1 : (((f * f) + (f2 * f2)) == ((float) (i2 * i2)) ? 0 : -1));
            } else {
                f3 = Math.abs(f);
                i = (f3 > ((float) this.A05) ? 1 : (f3 == ((float) this.A05) ? 0 : -1));
            }
        } else if (!A1R2) {
            return false;
        } else {
            f3 = Math.abs(f2);
            i = (f3 > ((float) this.A05) ? 1 : (f3 == ((float) this.A05) ? 0 : -1));
        }
        return i > 0;
    }

    public void A0B() {
        this.A0F = -1;
        float[] fArr = this.A08;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.A09, 0.0f);
            Arrays.fill(this.A0A, 0.0f);
            Arrays.fill(this.A0B, 0.0f);
            Arrays.fill(this.A0E, 0);
            Arrays.fill(this.A0C, 0);
            Arrays.fill(this.A0D, 0);
            this.A04 = 0;
        }
        VelocityTracker velocityTracker = this.A0G;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.A0G = null;
        }
    }

    private int A00(int i, int i2, int i3) {
        int i4;
        if (i == 0) {
            return 0;
        }
        int width = this.A0I.getWidth();
        float abs = (float) Math.abs(i);
        float f = (float) (width / 2);
        float sin = f + (((float) Math.sin((double) ((Math.min(1.0f, abs / ((float) width)) - 0.5f) * 0.47123894f))) * f);
        int abs2 = Math.abs(i2);
        if (abs2 > 0) {
            i4 = BE6.A04(Math.abs(sin / ((float) abs2)), 1000.0f) * 4;
        } else {
            i4 = (int) (((abs / ((float) i3)) + 1.0f) * 256.0f);
        }
        return Math.min(i4, 600);
    }

    private void A02() {
        VelocityTracker velocityTracker = this.A0G;
        float f = this.A00;
        velocityTracker.computeCurrentVelocity(1000, f);
        float xVelocity = this.A0G.getXVelocity(this.A0F);
        float f2 = this.A01;
        float f3 = f;
        float abs = Math.abs(xVelocity);
        if (abs < f2) {
            xVelocity = 0.0f;
        } else if (abs > f) {
            if (xVelocity <= 0.0f) {
                f3 = -f;
            }
            xVelocity = f3;
        }
        float yVelocity = this.A0G.getYVelocity(this.A0F);
        float f4 = this.A01;
        float abs2 = Math.abs(yVelocity);
        if (abs2 < f4) {
            yVelocity = 0.0f;
        } else if (abs2 > f) {
            if (yVelocity <= 0.0f) {
                f = -f;
            }
            yVelocity = f;
        }
        this.A07 = true;
        this.A0J.A04(this.A06, xVelocity, yVelocity);
        this.A07 = false;
        if (this.A02 == 1) {
            A0C(0);
        }
    }

    private void A03(int i) {
        float[] fArr = this.A08;
        if (fArr != null) {
            int i2 = this.A04;
            int i3 = 1 << i;
            if ((i3 & i2) != 0) {
                fArr[i] = 0.0f;
                this.A09[i] = 0.0f;
                this.A0A[i] = 0.0f;
                this.A0B[i] = 0.0f;
                this.A0E[i] = 0;
                this.A0C[i] = 0;
                this.A0D[i] = 0;
                this.A04 = (i3 ^ -1) & i2;
            }
        }
    }

    private void A04(int i, float f, float f2) {
        float[] fArr = this.A08;
        if (fArr == null || fArr.length <= i) {
            int i2 = i + 1;
            float[] fArr2 = new float[i2];
            float[] fArr3 = new float[i2];
            float[] fArr4 = new float[i2];
            float[] fArr5 = new float[i2];
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int[] iArr3 = new int[i2];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.A09;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.A0A;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.A0B;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.A0E;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.A0C;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.A0D;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.A08 = fArr2;
            fArr = fArr2;
            this.A09 = fArr3;
            this.A0A = fArr4;
            this.A0B = fArr5;
            this.A0E = iArr;
            this.A0C = iArr2;
            this.A0D = iArr3;
        }
        this.A0A[i] = f;
        fArr[i] = f;
        float[] fArr9 = this.A09;
        this.A0B[i] = f2;
        fArr9[i] = f2;
        int[] iArr7 = this.A0E;
        int i3 = (int) f;
        int i4 = (int) f2;
        ViewGroup viewGroup = this.A0I;
        int left = viewGroup.getLeft();
        int i5 = this.A03;
        int A1U = AnonymousClass000.A1U(i3, left + i5);
        if (i4 < viewGroup.getTop() + i5) {
            A1U |= 4;
        }
        if (i3 > viewGroup.getRight() - i5) {
            A1U |= 2;
        }
        if (i4 > viewGroup.getBottom() - i5) {
            A1U |= 8;
        }
        iArr7[i] = A1U;
        this.A04 |= 1 << i;
    }

    private boolean A06(int i) {
        if (((1 << i) & this.A04) != 0) {
            return true;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Ignoring pointerId=");
        A10.append(i);
        Log.e("ViewDragHelper", AnonymousClass000.A0y(" because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.", A10));
        return false;
    }

    private boolean A07(int i, int i2, int i3, int i4) {
        float f;
        float f2;
        int i5 = i3;
        int i6 = i4;
        int left = this.A06.getLeft();
        int top = this.A06.getTop();
        int i7 = i - left;
        int i8 = i2 - top;
        if (i7 == 0 && i8 == 0) {
            this.A0H.abortAnimation();
            A0C(0);
            return false;
        }
        View view = this.A06;
        int i9 = (int) this.A01;
        int i10 = (int) this.A00;
        int i11 = i10;
        int abs = Math.abs(i5);
        if (abs < i9) {
            i5 = 0;
        } else if (abs > i10) {
            if (i3 <= 0) {
                i11 = -i10;
            }
            i5 = i11;
        }
        int abs2 = Math.abs(i6);
        if (abs2 < i9) {
            i6 = 0;
        } else if (abs2 > i10) {
            if (i4 <= 0) {
                i10 = -i10;
            }
            i6 = i10;
        }
        int abs3 = Math.abs(i7);
        int abs4 = Math.abs(i8);
        int abs5 = Math.abs(i5);
        int abs6 = Math.abs(i6);
        int i12 = abs5 + abs6;
        int i13 = abs3 + abs4;
        if (i5 != 0) {
            f = (float) abs5;
            f2 = (float) i12;
        } else {
            f = (float) abs3;
            f2 = (float) i13;
        }
        float f3 = f / f2;
        float f4 = (float) abs6;
        float f5 = (float) i12;
        if (i6 == 0) {
            f4 = (float) abs4;
            f5 = (float) i13;
        }
        C24495C6n c6n = this.A0J;
        int A002 = A00(i7, i5, c6n.A00(view));
        OverScroller overScroller = this.A0H;
        overScroller.startScroll(left, top, i7, i8, (int) ((((float) A002) * f3) + (((float) A00(i8, i6, c6n.A01(view))) * (f4 / f5))));
        A0C(2);
        return true;
    }

    public View A09(int i, int i2) {
        int i3;
        ViewGroup viewGroup = this.A0I;
        int childCount = viewGroup.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                return null;
            }
            C24495C6n c6n = this.A0J;
            if (c6n instanceof BLD) {
                BLD bld = (BLD) c6n;
                ViewGroup viewGroup2 = bld.A02;
                int childCount2 = viewGroup2.getChildCount();
                List list = bld.A03;
                if (list.size() != childCount2) {
                    list.clear();
                    ArrayList A0z = C17880vN.A0z(childCount2);
                    for (int i4 = 0; i4 < childCount2; i4++) {
                        if (bld.A04.A04.BeX(viewGroup2.getChildAt(i4))) {
                            C17890vO.A1D(A0z, i4);
                        } else {
                            BE7.A11(i4, list);
                        }
                    }
                    list.addAll(A0z);
                }
                i3 = AnonymousClass001.A0n(list, childCount);
            } else {
                i3 = childCount;
            }
            View childAt = viewGroup.getChildAt(i3);
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
    }

    public void A0C(int i) {
        this.A0I.removeCallbacks(this.A0K);
        if (this.A02 != i) {
            this.A02 = i;
            C24495C6n c6n = this.A0J;
            if (c6n instanceof BLD) {
                E9X e9x = ((BLD) c6n).A04.A04;
                if (e9x != null) {
                    e9x.BsL(i);
                }
            } else if (c6n instanceof BLC) {
                C28518E5i e5i = ((BLC) c6n).A02.A04;
                if (e5i != null) {
                    C26218Cv5 A002 = C26218Cv5.A00();
                    E2U e2u = ((DL6) e5i).A00.A07;
                    if (i != 0) {
                        A002.A05(e2u);
                    } else {
                        A002.A06(e2u);
                    }
                }
            } else if (c6n instanceof BLB) {
                BLB blb = (BLB) c6n;
                if (blb.A00 != 0) {
                    if (i == 1) {
                        SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) blb.A01;
                        if (sideSheetBehavior.A0E) {
                            sideSheetBehavior.A0Q(1);
                        }
                    }
                } else if (i == 1) {
                    BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) blb.A01;
                    if (bottomSheetBehavior.A0U) {
                        bottomSheetBehavior.A0X(1);
                    }
                }
            }
            if (this.A02 == 0) {
                this.A06 = null;
            }
        }
    }

    public boolean A0F() {
        if (this.A02 == 2) {
            OverScroller overScroller = this.A0H;
            boolean computeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.A06.getLeft();
            int top = currY - this.A06.getTop();
            if (left != 0) {
                AnonymousClass1HF.A0Z(this.A06, left);
            }
            if (top != 0) {
                AnonymousClass1HF.A0a(this.A06, top);
            }
            if (!(left == 0 && top == 0)) {
                this.A0J.A06(this.A06, currX, currY);
            }
            if (computeScrollOffset) {
                if (currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                    overScroller.abortAnimation();
                }
            }
            this.A0I.post(this.A0K);
        }
        if (this.A02 == 2) {
            return true;
        }
        return false;
    }

    public boolean A0G(int i, int i2) {
        if (this.A07) {
            return A07(i, i2, (int) this.A0G.getXVelocity(this.A0F), (int) this.A0G.getYVelocity(this.A0F));
        }
        throw AnonymousClass000.A0n("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    public boolean A0I(View view, int i) {
        if (view == this.A06 && this.A0F == i) {
            return true;
        }
        if (view == null || !this.A0J.A07(view, i)) {
            return false;
        }
        this.A0F = i;
        A0E(view, i);
        return true;
    }

    public boolean A0J(View view, int i, int i2) {
        this.A06 = view;
        this.A0F = -1;
        boolean A072 = A07(i, i2, 0, 0);
        if (!A072 && this.A02 == 0 && this.A06 != null) {
            this.A06 = null;
        }
        return A072;
    }

    public C26281Cwc(Context context, ViewGroup viewGroup, C24495C6n c6n) {
        if (c6n != null) {
            this.A0I = viewGroup;
            this.A0J = c6n;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            this.A03 = (int) ((C72463Mc.A00(context) * 20.0f) + 0.5f);
            this.A05 = viewConfiguration.getScaledTouchSlop();
            this.A00 = (float) viewConfiguration.getScaledMaximumFlingVelocity();
            this.A01 = (float) viewConfiguration.getScaledMinimumFlingVelocity();
            this.A0H = new OverScroller(context, A0L);
            return;
        }
        throw AnonymousClass000.A0k("Callback may not be null");
    }

    public static C26281Cwc A01(ViewGroup viewGroup, C24495C6n c6n) {
        return new C26281Cwc(viewGroup.getContext(), viewGroup, c6n);
    }

    private void A05(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (A06(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.A0A[pointerId] = x;
                this.A0B[pointerId] = y;
            }
        }
    }

    public void A0A() {
        A0B();
        if (this.A02 == 2) {
            OverScroller overScroller = this.A0H;
            overScroller.getCurrX();
            overScroller.getCurrY();
            overScroller.abortAnimation();
            this.A0J.A06(this.A06, overScroller.getCurrX(), overScroller.getCurrY());
        }
        A0C(0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0061, code lost:
        if (r9.A0F == -1) goto L_0x0063;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0063, code lost:
        A02();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0D(android.view.MotionEvent r10) {
        /*
            r9 = this;
            int r2 = r10.getActionMasked()
            int r1 = r10.getActionIndex()
            if (r2 != 0) goto L_0x000d
            r9.A0B()
        L_0x000d:
            android.view.VelocityTracker r0 = r9.A0G
            if (r0 != 0) goto L_0x0017
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r9.A0G = r0
        L_0x0017:
            r0.addMovement(r10)
            r5 = 0
            if (r2 == 0) goto L_0x017d
            r4 = 1
            if (r2 == r4) goto L_0x015a
            r0 = 2
            if (r2 == r0) goto L_0x00a9
            r0 = 3
            if (r2 == r0) goto L_0x0162
            r0 = 5
            if (r2 == r0) goto L_0x006d
            r0 = 6
            if (r2 != r0) goto L_0x0069
            int r3 = r10.getPointerId(r1)
            int r0 = r9.A02
            if (r0 != r4) goto L_0x0066
            int r0 = r9.A0F
            if (r3 != r0) goto L_0x0066
            int r4 = r10.getPointerCount()
        L_0x003c:
            if (r5 >= r4) goto L_0x0063
            int r2 = r10.getPointerId(r5)
            int r0 = r9.A0F
            if (r2 == r0) goto L_0x006a
            float r1 = r10.getX(r5)
            float r0 = r10.getY(r5)
            int r1 = (int) r1
            int r0 = (int) r0
            android.view.View r1 = r9.A09(r1, r0)
            android.view.View r0 = r9.A06
            if (r1 != r0) goto L_0x006a
            boolean r0 = r9.A0I(r0, r2)
            if (r0 == 0) goto L_0x006a
            int r1 = r9.A0F
            r0 = -1
            if (r1 != r0) goto L_0x0066
        L_0x0063:
            r9.A02()
        L_0x0066:
            r9.A03(r3)
        L_0x0069:
            return
        L_0x006a:
            int r5 = r5 + 1
            goto L_0x003c
        L_0x006d:
            int r4 = r10.getPointerId(r1)
            float r2 = r10.getX(r1)
            float r1 = r10.getY(r1)
            r9.A04(r4, r2, r1)
            int r0 = r9.A02
            int r3 = (int) r2
            int r2 = (int) r1
            if (r0 != 0) goto L_0x008a
            android.view.View r0 = r9.A09(r3, r2)
        L_0x0086:
            r9.A0I(r0, r4)
            return
        L_0x008a:
            android.view.View r1 = r9.A06
            if (r1 == 0) goto L_0x0069
            int r0 = r1.getLeft()
            if (r3 < r0) goto L_0x0069
            int r0 = r1.getRight()
            if (r3 >= r0) goto L_0x0069
            int r0 = r1.getTop()
            if (r2 < r0) goto L_0x0069
            int r0 = r1.getBottom()
            if (r2 >= r0) goto L_0x0069
            android.view.View r0 = r9.A06
            goto L_0x0086
        L_0x00a9:
            int r0 = r9.A02
            if (r0 != r4) goto L_0x011c
            int r0 = r9.A0F
            boolean r0 = r9.A06(r0)
            if (r0 == 0) goto L_0x0069
            int r0 = r9.A0F
            int r0 = r10.findPointerIndex(r0)
            float r3 = r10.getX(r0)
            float r2 = r10.getY(r0)
            float[] r0 = r9.A0A
            int r1 = r9.A0F
            r0 = r0[r1]
            float r3 = r3 - r0
            int r6 = (int) r3
            float[] r0 = r9.A0B
            r0 = r0[r1]
            float r2 = r2 - r0
            int r5 = (int) r2
            android.view.View r0 = r9.A06
            int r4 = r0.getLeft()
            int r4 = r4 + r6
            android.view.View r0 = r9.A06
            int r3 = r0.getTop()
            int r3 = r3 + r5
            android.view.View r0 = r9.A06
            int r7 = r0.getLeft()
            android.view.View r0 = r9.A06
            int r2 = r0.getTop()
            if (r6 == 0) goto L_0x00fc
            X.C6n r1 = r9.A0J
            android.view.View r0 = r9.A06
            int r4 = r1.A02(r0, r4)
            android.view.View r1 = r9.A06
            int r0 = r4 - r7
            X.AnonymousClass1HF.A0Z(r1, r0)
        L_0x00fc:
            if (r5 == 0) goto L_0x010d
            X.C6n r1 = r9.A0J
            android.view.View r0 = r9.A06
            int r3 = r1.A03(r0, r3)
            android.view.View r1 = r9.A06
            int r0 = r3 - r2
            X.AnonymousClass1HF.A0a(r1, r0)
        L_0x010d:
            if (r6 != 0) goto L_0x0111
            if (r5 == 0) goto L_0x0118
        L_0x0111:
            X.C6n r1 = r9.A0J
            android.view.View r0 = r9.A06
            r1.A06(r0, r4, r3)
        L_0x0118:
            r9.A05(r10)
            return
        L_0x011c:
            int r6 = r10.getPointerCount()
        L_0x0120:
            if (r5 >= r6) goto L_0x0118
            int r7 = r10.getPointerId(r5)
            boolean r0 = r9.A06(r7)
            if (r0 == 0) goto L_0x0157
            float r1 = r10.getX(r5)
            float r8 = r10.getY(r5)
            float[] r0 = r9.A08
            r0 = r0[r7]
            float r3 = r1 - r0
            float[] r0 = r9.A09
            r0 = r0[r7]
            float r2 = r8 - r0
            int r0 = r9.A02
            if (r0 == r4) goto L_0x0118
            int r1 = (int) r1
            int r0 = (int) r8
            android.view.View r1 = r9.A09(r1, r0)
            boolean r0 = r9.A08(r1, r3, r2)
            if (r0 == 0) goto L_0x0157
            boolean r0 = r9.A0I(r1, r7)
            if (r0 == 0) goto L_0x0157
            goto L_0x0118
        L_0x0157:
            int r5 = r5 + 1
            goto L_0x0120
        L_0x015a:
            int r0 = r9.A02
            if (r0 != r4) goto L_0x0179
            r9.A02()
            goto L_0x0179
        L_0x0162:
            int r0 = r9.A02
            if (r0 != r4) goto L_0x0179
            r2 = 0
            r9.A07 = r4
            X.C6n r1 = r9.A0J
            android.view.View r0 = r9.A06
            r1.A04(r0, r2, r2)
            r9.A07 = r5
            int r0 = r9.A02
            if (r0 != r4) goto L_0x0179
            r9.A0C(r5)
        L_0x0179:
            r9.A0B()
            return
        L_0x017d:
            float r4 = r10.getX()
            float r3 = r10.getY()
            int r2 = r10.getPointerId(r5)
            int r1 = (int) r4
            int r0 = (int) r3
            android.view.View r0 = r9.A09(r1, r0)
            r9.A04(r2, r4, r3)
            r9.A0I(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26281Cwc.A0D(android.view.MotionEvent):void");
    }

    public void A0E(View view, int i) {
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = this.A0I;
        if (parent == viewGroup) {
            this.A06 = view;
            this.A0F = i;
            this.A0J.A05(view, i);
            A0C(1);
            return;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (");
        A10.append(viewGroup);
        throw AnonymousClass001.A12(")", A10);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00ba, code lost:
        if (r5 != r11) goto L_0x00c8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0H(android.view.MotionEvent r14) {
        /*
            r13 = this;
            int r1 = r14.getActionMasked()
            int r2 = r14.getActionIndex()
            if (r1 != 0) goto L_0x000d
            r13.A0B()
        L_0x000d:
            android.view.VelocityTracker r0 = r13.A0G
            if (r0 != 0) goto L_0x0017
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r13.A0G = r0
        L_0x0017:
            r0.addMovement(r14)
            r5 = 2
            r3 = 1
            if (r1 == 0) goto L_0x00dd
            if (r1 == r3) goto L_0x00d8
            if (r1 == r5) goto L_0x005c
            r0 = 3
            if (r1 == r0) goto L_0x00d8
            r0 = 5
            if (r1 == r0) goto L_0x0039
            r0 = 6
            if (r1 != r0) goto L_0x0032
            int r0 = r14.getPointerId(r2)
            r13.A03(r0)
        L_0x0032:
            r4 = 0
        L_0x0033:
            int r0 = r13.A02
            if (r0 != r3) goto L_0x0038
            r4 = 1
        L_0x0038:
            return r4
        L_0x0039:
            int r4 = r14.getPointerId(r2)
            float r1 = r14.getX(r2)
            float r2 = r14.getY(r2)
            r13.A04(r4, r1, r2)
            int r0 = r13.A02
            if (r0 == 0) goto L_0x0032
            if (r0 != r5) goto L_0x0032
            int r1 = (int) r1
            int r0 = (int) r2
            android.view.View r1 = r13.A09(r1, r0)
            android.view.View r0 = r13.A06
            if (r1 != r0) goto L_0x0032
            r13.A0I(r1, r4)
            goto L_0x0032
        L_0x005c:
            float[] r0 = r13.A08
            if (r0 == 0) goto L_0x0032
            float[] r0 = r13.A09
            if (r0 == 0) goto L_0x0032
            int r9 = r14.getPointerCount()
            r8 = 0
        L_0x0069:
            if (r8 >= r9) goto L_0x00c2
            int r10 = r14.getPointerId(r8)
            boolean r0 = r13.A06(r10)
            if (r0 == 0) goto L_0x00d5
            float r2 = r14.getX(r8)
            float r5 = r14.getY(r8)
            float[] r0 = r13.A08
            r0 = r0[r10]
            float r4 = r2 - r0
            float[] r0 = r13.A09
            r0 = r0[r10]
            float r1 = r5 - r0
            int r2 = (int) r2
            int r0 = (int) r5
            android.view.View r7 = r13.A09(r2, r0)
            if (r7 == 0) goto L_0x00c7
            boolean r0 = r13.A08(r7, r4, r1)
            if (r0 == 0) goto L_0x00c7
            r12 = 1
            int r11 = r7.getLeft()
            int r0 = (int) r4
            int r0 = r0 + r11
            X.C6n r6 = r13.A0J
            int r5 = r6.A02(r7, r0)
            int r4 = r7.getTop()
            int r0 = (int) r1
            int r0 = r0 + r4
            int r2 = r6.A03(r7, r0)
            int r1 = r6.A00(r7)
            int r0 = r6.A01(r7)
            if (r1 == 0) goto L_0x00bc
            if (r1 <= 0) goto L_0x00c8
            if (r5 != r11) goto L_0x00c8
        L_0x00bc:
            if (r0 == 0) goto L_0x00c2
            if (r0 <= 0) goto L_0x00c8
            if (r2 != r4) goto L_0x00c8
        L_0x00c2:
            r13.A05(r14)
            goto L_0x0032
        L_0x00c7:
            r12 = 0
        L_0x00c8:
            int r0 = r13.A02
            if (r0 == r3) goto L_0x00c2
            if (r12 == 0) goto L_0x00d5
            boolean r0 = r13.A0I(r7, r10)
            if (r0 == 0) goto L_0x00d5
            goto L_0x00c2
        L_0x00d5:
            int r8 = r8 + 1
            goto L_0x0069
        L_0x00d8:
            r13.A0B()
            goto L_0x0032
        L_0x00dd:
            float r1 = r14.getX()
            float r0 = r14.getY()
            r4 = 0
            int r2 = r14.getPointerId(r4)
            r13.A04(r2, r1, r0)
            int r1 = (int) r1
            int r0 = (int) r0
            android.view.View r1 = r13.A09(r1, r0)
            android.view.View r0 = r13.A06
            if (r1 != r0) goto L_0x0033
            int r0 = r13.A02
            if (r0 != r5) goto L_0x0033
            r13.A0I(r1, r2)
            goto L_0x0033
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26281Cwc.A0H(android.view.MotionEvent):boolean");
    }
}
