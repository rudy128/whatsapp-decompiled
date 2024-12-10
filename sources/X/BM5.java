package X;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Handler;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class BM5 extends C40611uz implements AnonymousClass3LW {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public int A06 = 0;
    public int A07 = -1;
    public int A08;
    public int A09;
    public long A0A;
    public Rect A0B;
    public VelocityTracker A0C;
    public View A0D = null;
    public CIZ A0E;
    public C25848Cn6 A0F;
    public BH2 A0G;
    public C42011xT A0H = null;
    public RecyclerView A0I;
    public List A0J;
    public List A0K = AnonymousClass000.A13();
    public List A0L;
    public float A0M;
    public float A0N;
    public final C72343Lo A0O = new D71(this);
    public final Runnable A0P = new C21466AkX((Object) this, 14);
    public final List A0Q = AnonymousClass000.A13();
    public final float[] A0R = C108945cZ.A1V();

    public void Boc(View view) {
    }

    private int A00(int i) {
        if ((i & 12) == 0) {
            return 0;
        }
        int i2 = 8;
        int i3 = 4;
        if (this.A00 > 0.0f) {
            i3 = 8;
        }
        VelocityTracker velocityTracker = this.A0C;
        if (velocityTracker != null && this.A07 > -1) {
            velocityTracker.computeCurrentVelocity(1000, this.A0M);
            float xVelocity = this.A0C.getXVelocity(this.A07);
            float yVelocity = this.A0C.getYVelocity(this.A07);
            if (xVelocity <= 0.0f) {
                i2 = 4;
            }
            float abs = Math.abs(xVelocity);
            if ((i2 & i) != 0 && i3 == i2 && abs >= this.A0N && abs > Math.abs(yVelocity)) {
                return i2;
            }
        }
        float A032 = C108945cZ.A03(this.A0I) * 0.5f;
        if ((i & i3) == 0 || Math.abs(this.A00) <= A032) {
            return 0;
        }
        return i3;
    }

    private int A01(int i) {
        if ((i & 3) == 0) {
            return 0;
        }
        int i2 = 2;
        int i3 = 1;
        if (this.A01 > 0.0f) {
            i3 = 2;
        }
        VelocityTracker velocityTracker = this.A0C;
        if (velocityTracker != null && this.A07 > -1) {
            velocityTracker.computeCurrentVelocity(1000, this.A0M);
            float xVelocity = this.A0C.getXVelocity(this.A07);
            float yVelocity = this.A0C.getYVelocity(this.A07);
            if (yVelocity <= 0.0f) {
                i2 = 1;
            }
            float abs = Math.abs(yVelocity);
            if ((i2 & i) != 0 && i2 == i3 && abs >= this.A0N && abs > Math.abs(xVelocity)) {
                return i2;
            }
        }
        float A042 = C108945cZ.A04(this.A0I) * 0.5f;
        if ((i & i3) == 0 || Math.abs(this.A01) <= A042) {
            return 0;
        }
        return i3;
    }

    private void A02(float[] fArr) {
        float translationX;
        float translationY;
        if ((this.A08 & 12) != 0) {
            translationX = (this.A04 + this.A00) - ((float) this.A0H.A0H.getLeft());
        } else {
            translationX = this.A0H.A0H.getTranslationX();
        }
        fArr[0] = translationX;
        if ((this.A08 & 3) != 0) {
            translationY = (this.A05 + this.A01) - ((float) this.A0H.A0H.getTop());
        } else {
            translationY = this.A0H.A0H.getTranslationY();
        }
        fArr[1] = translationY;
    }

    public void A03(Canvas canvas, C38021qZ r8, RecyclerView recyclerView) {
        if (this.A0H != null) {
            A02(this.A0R);
        }
        C42011xT r5 = this.A0H;
        List list = this.A0K;
        int size = list.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            list.get(i);
            canvas.restoreToCount(canvas.save());
        }
        if (r5 != null) {
            canvas.restoreToCount(canvas.save());
        }
        for (int i2 = size - 1; i2 >= 0; i2--) {
            C26309CxS cxS = (C26309CxS) list.get(i2);
            if (cxS.A05 && !cxS.A03) {
                list.remove(i2);
            } else if (!cxS.A05) {
                z = true;
            }
        }
        if (z) {
            recyclerView.invalidate();
        }
    }

    public void A04(Canvas canvas, RecyclerView recyclerView) {
        float f;
        float f2;
        float A002;
        float A003;
        if (this.A0H != null) {
            float[] fArr = this.A0R;
            A02(fArr);
            f = fArr[0];
            f2 = fArr[1];
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        C42011xT r6 = this.A0H;
        List list = this.A0K;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C26309CxS cxS = (C26309CxS) list.get(i);
            float f3 = cxS.A06;
            float f4 = cxS.A08;
            if (f3 == f4) {
                A002 = cxS.A0C.A0H.getTranslationX();
            } else {
                A002 = C17880vN.A00(f4, f3, cxS.A00);
            }
            cxS.A01 = A002;
            float f5 = cxS.A07;
            float f6 = cxS.A09;
            if (f5 == f6) {
                A003 = cxS.A0C.A0H.getTranslationY();
            } else {
                A003 = C17880vN.A00(f6, f5, cxS.A00);
            }
            cxS.A02 = A003;
            int save = canvas.save();
            C42011xT r0 = cxS.A0C;
            float f7 = cxS.A01;
            float f8 = cxS.A02;
            View view = r0.A0H;
            view.setTranslationX(f7);
            view.setTranslationY(f8);
            canvas.restoreToCount(save);
        }
        if (r6 != null) {
            int save2 = canvas.save();
            View view2 = r6.A0H;
            if (view2.getTag(2131431852) == null) {
                Float valueOf = Float.valueOf(AnonymousClass1Xr.A00(view2));
                int childCount = recyclerView.getChildCount();
                float f9 = 0.0f;
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = recyclerView.getChildAt(i2);
                    if (childAt != view2) {
                        float A004 = AnonymousClass1Xr.A00(childAt);
                        if (A004 > f9) {
                            f9 = A004;
                        }
                    }
                }
                AnonymousClass1HF.A0W(view2, f9 + 1.0f);
                view2.setTag(2131431852, valueOf);
            }
            view2.setTranslationX(f);
            view2.setTranslationY(f2);
            canvas.restoreToCount(save2);
        }
    }

    public void A07(MotionEvent motionEvent, int i, int i2) {
        View A062;
        C42011xT A0Q2;
        int A002;
        int i3;
        if (this.A0H == null && i == 2 && this.A06 != 2) {
            C25848Cn6 cn6 = this.A0F;
            if (cn6.A05()) {
                RecyclerView recyclerView = this.A0I;
                if (recyclerView.getScrollState() != 1) {
                    C38251qy layoutManager = recyclerView.getLayoutManager();
                    int i4 = this.A07;
                    if (i4 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i4);
                        float abs = Math.abs(motionEvent.getX(findPointerIndex) - this.A02);
                        float abs2 = Math.abs(motionEvent.getY(findPointerIndex) - this.A03);
                        float f = (float) this.A09;
                        if (abs < f && abs2 < f) {
                            return;
                        }
                        if (abs > abs2 && layoutManager.A1I()) {
                            return;
                        }
                        if ((abs2 <= abs || !layoutManager.A1J()) && (A062 = A06(motionEvent)) != null && (A0Q2 = this.A0I.A0Q(A062)) != null && (A002 = (cn6.A00(A0Q2, this.A0I) & 65280) >> 8) != 0) {
                            float x = motionEvent.getX(i2);
                            float y = motionEvent.getY(i2);
                            float f2 = x - this.A02;
                            float f3 = y - this.A03;
                            float abs3 = Math.abs(f2);
                            float abs4 = Math.abs(f3);
                            float f4 = (float) this.A09;
                            if (abs3 >= f4 || abs4 >= f4) {
                                if (abs3 > abs4) {
                                    if (f2 >= 0.0f || (A002 & 4) != 0) {
                                        if (f2 > 0.0f) {
                                            i3 = A002 & 8;
                                        }
                                        this.A01 = 0.0f;
                                        this.A00 = 0.0f;
                                        this.A07 = motionEvent.getPointerId(0);
                                        A0B(A0Q2, 1);
                                    }
                                    return;
                                } else if (f3 >= 0.0f || (A002 & 1) != 0) {
                                    if (f3 > 0.0f) {
                                        i3 = A002 & 2;
                                    }
                                    this.A01 = 0.0f;
                                    this.A00 = 0.0f;
                                    this.A07 = motionEvent.getPointerId(0);
                                    A0B(A0Q2, 1);
                                } else {
                                    return;
                                }
                                if (i3 == 0) {
                                    return;
                                }
                                this.A01 = 0.0f;
                                this.A00 = 0.0f;
                                this.A07 = motionEvent.getPointerId(0);
                                A0B(A0Q2, 1);
                            }
                        }
                    }
                }
            }
        }
    }

    public void A09(C42011xT r21) {
        int i;
        int i2;
        int i3;
        int left;
        int bottom;
        if (!this.A0I.isLayoutRequested() && this.A06 == 2) {
            int i4 = (int) (this.A04 + this.A00);
            int i5 = (int) (this.A05 + this.A01);
            C42011xT r19 = r21;
            View view = r19.A0H;
            if (((float) C108945cZ.A05(i5, view.getTop())) >= C108945cZ.A04(view) * 0.5f || ((float) C108945cZ.A05(i4, view.getLeft())) >= C108945cZ.A03(view) * 0.5f) {
                List list = this.A0L;
                if (list == null) {
                    this.A0L = AnonymousClass000.A13();
                    this.A0J = AnonymousClass000.A13();
                } else {
                    list.clear();
                    this.A0J.clear();
                }
                int round = Math.round(this.A04 + this.A00);
                int round2 = Math.round(this.A05 + this.A01);
                int width = view.getWidth() + round;
                int height = view.getHeight() + round2;
                int i6 = (round + width) / 2;
                int i7 = (round2 + height) / 2;
                C38251qy layoutManager = this.A0I.getLayoutManager();
                int A0J2 = layoutManager.A0J();
                for (int i8 = 0; i8 < A0J2; i8++) {
                    View A0P2 = layoutManager.A0P(i8);
                    if (A0P2 != view && A0P2.getBottom() >= round2 && A0P2.getTop() <= height && A0P2.getRight() >= round && A0P2.getLeft() <= width) {
                        C42011xT A0Q2 = this.A0I.A0Q(A0P2);
                        if (this.A0F.A07(this.A0H, A0Q2, this.A0I)) {
                            int A052 = C108945cZ.A05(i6, (A0P2.getLeft() + A0P2.getRight()) / 2);
                            int A053 = C108945cZ.A05(i7, (A0P2.getTop() + A0P2.getBottom()) / 2);
                            int i9 = (A052 * A052) + (A053 * A053);
                            int size = this.A0L.size();
                            int i10 = 0;
                            int i11 = 0;
                            while (i10 < size && i9 > AnonymousClass001.A0n(this.A0J, i10)) {
                                i11++;
                                i10++;
                            }
                            this.A0L.add(i11, A0Q2);
                            this.A0J.add(i11, Integer.valueOf(i9));
                        }
                    }
                }
                List list2 = this.A0L;
                if (list2.size() != 0) {
                    int width2 = i4 + view.getWidth();
                    int A022 = AnonymousClass3MW.A02(view, i5);
                    int left2 = i4 - view.getLeft();
                    int top = i5 - view.getTop();
                    int size2 = list2.size();
                    C42011xT r6 = null;
                    int i12 = -1;
                    for (int i13 = 0; i13 < size2; i13++) {
                        C42011xT r7 = (C42011xT) list2.get(i13);
                        if (left2 <= 0 ? !(left2 >= 0 || (left = r7.A0H.getLeft() - i4) <= 0 || r7.A0H.getLeft() >= view.getLeft()) : !((left = r7.A0H.getRight() - width2) >= 0 || r7.A0H.getRight() <= view.getRight())) {
                            int abs = Math.abs(left);
                            if (abs > i12) {
                                r6 = r7;
                                i12 = abs;
                            }
                        }
                        if (top >= 0 ? !(top <= 0 || (bottom = r7.A0H.getBottom() - A022) >= 0 || r7.A0H.getBottom() <= view.getBottom()) : !((bottom = r7.A0H.getTop() - i5) <= 0 || r7.A0H.getTop() >= view.getTop())) {
                            int abs2 = Math.abs(bottom);
                            if (abs2 > i12) {
                                r6 = r7;
                                i12 = abs2;
                            }
                        }
                    }
                    if (r6 == null) {
                        this.A0L.clear();
                        this.A0J.clear();
                        return;
                    }
                    int A054 = r6.A05();
                    r19.A05();
                    if (this.A0F.A08(r19, r6, this.A0I)) {
                        RecyclerView recyclerView = this.A0I;
                        C38251qy layoutManager2 = recyclerView.getLayoutManager();
                        if (layoutManager2 instanceof C38271r0) {
                            View view2 = r6.A0H;
                            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) ((C38271r0) layoutManager2);
                            linearLayoutManager.A1H("Cannot drop a view during a scroll or layout calculation");
                            linearLayoutManager.A1Y();
                            LinearLayoutManager.A0C(linearLayoutManager);
                            int A023 = C38251qy.A02(view);
                            int A024 = C38251qy.A02(view2);
                            char c = 65535;
                            if (A023 < A024) {
                                c = 1;
                            }
                            boolean z = linearLayoutManager.A0A;
                            C38331r7 r0 = linearLayoutManager.A06;
                            if (z) {
                                if (c == 1) {
                                    linearLayoutManager.A1a(A024, r0.A02() - (linearLayoutManager.A06.A09(view2) + linearLayoutManager.A06.A07(view)));
                                    return;
                                } else {
                                    i2 = r0.A02();
                                    i3 = linearLayoutManager.A06.A06(view2);
                                }
                            } else if (c == 65535) {
                                i = r0.A09(view2);
                                linearLayoutManager.A1a(A024, i);
                                return;
                            } else {
                                i2 = r0.A06(view2);
                                i3 = linearLayoutManager.A06.A07(view);
                            }
                            i = i2 - i3;
                            linearLayoutManager.A1a(A024, i);
                            return;
                        }
                        if (layoutManager2.A1I()) {
                            View view3 = r6.A0H;
                            if (view3.getLeft() - BE7.A0D(view3).left <= recyclerView.getPaddingLeft()) {
                                recyclerView.A0f(A054);
                            }
                            if (view3.getRight() + BE7.A0D(view3).right >= C72463Mc.A09(recyclerView)) {
                                recyclerView.A0f(A054);
                            }
                        }
                        if (layoutManager2.A1J()) {
                            View view4 = r6.A0H;
                            if (view4.getTop() - BE7.A0D(view4).top <= recyclerView.getPaddingTop()) {
                                recyclerView.A0f(A054);
                            }
                            if (view4.getBottom() + BE7.A0D(view4).bottom >= C108985cd.A05(recyclerView)) {
                                recyclerView.A0f(A054);
                            }
                        }
                    }
                }
            }
        }
    }

    public void A0A(C42011xT r4) {
        String str;
        if (!AnonymousClass000.A1O(this.A0F.A00(r4, this.A0I) & 16711680)) {
            str = "Start drag has been called but dragging is not enabled";
        } else if (r4.A0H.getParent() != this.A0I) {
            str = "Start drag has been called with a view holder which is not a child of the RecyclerView which is controlled by this ItemTouchHelper.";
        } else {
            VelocityTracker velocityTracker = this.A0C;
            if (velocityTracker != null) {
                velocityTracker.recycle();
            }
            this.A0C = VelocityTracker.obtain();
            this.A01 = 0.0f;
            this.A00 = 0.0f;
            A0B(r4, 2);
            return;
        }
        Log.e("ItemTouchHelper", str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x008d, code lost:
        if (r1 > 0) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0181, code lost:
        if (r1 > 0) goto L_0x0183;
     */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x009c A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x014f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0B(X.C42011xT r27, int r28) {
        /*
            r26 = this;
            r5 = r26
            X.1xT r0 = r5.A0H
            r7 = r27
            r6 = r28
            if (r7 != r0) goto L_0x000f
            int r0 = r5.A06
            if (r6 != r0) goto L_0x000f
            return
        L_0x000f:
            r0 = -9223372036854775808
            r5.A0A = r0
            int r11 = r5.A06
            r4 = 1
            r5.A0C(r7, r4)
            r5.A06 = r6
            r3 = 2
            if (r6 != r3) goto L_0x0024
            if (r27 == 0) goto L_0x01ba
            android.view.View r0 = r7.A0H
            r5.A0D = r0
        L_0x0024:
            int r0 = r28 * 8
            r10 = 8
            int r0 = r0 + 8
            int r0 = r4 << r0
            int r15 = r0 + -1
            X.1xT r8 = r5.A0H
            r2 = 0
            if (r8 == 0) goto L_0x00ec
            android.view.View r0 = r8.A0H
            android.view.ViewParent r0 = r0.getParent()
            if (r0 == 0) goto L_0x01a8
            if (r11 == r3) goto L_0x01a5
            int r0 = r5.A06
            if (r0 == r3) goto L_0x01a5
            X.Cn6 r1 = r5.A0F
            androidx.recyclerview.widget.RecyclerView r0 = r5.A0I
            int r14 = r1.A01(r8, r0)
            androidx.recyclerview.widget.RecyclerView r0 = r5.A0I
            int r13 = r0.getLayoutDirection()
            r12 = r14
            r9 = 3158064(0x303030, float:4.42539E-39)
            r1 = r14 & r9
            if (r1 == 0) goto L_0x0068
            r0 = r1 ^ -1
            r12 = r14 & r0
            if (r13 == 0) goto L_0x0065
            int r1 = r1 >> 1
            r0 = -3158065(0xffffffffffcfcfcf, float:NaN)
            r0 = r0 & r1
            r12 = r12 | r0
            r1 = r1 & r9
        L_0x0065:
            int r0 = r1 >> 2
            r12 = r12 | r0
        L_0x0068:
            r0 = 65280(0xff00, float:9.1477E-41)
            r12 = r12 & r0
            int r9 = r12 >> 8
            if (r9 == 0) goto L_0x01a5
            r14 = r14 & r0
            int r12 = r14 >> 8
            float r0 = r5.A00
            float r1 = java.lang.Math.abs(r0)
            float r0 = r5.A01
            float r0 = java.lang.Math.abs(r0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0177
            int r1 = r5.A00(r9)
            if (r1 > 0) goto L_0x0183
            int r1 = r5.A01(r9)
            if (r1 <= 0) goto L_0x01a5
        L_0x008f:
            android.view.VelocityTracker r0 = r5.A0C
            if (r0 == 0) goto L_0x0099
            r0.recycle()
            r0 = 0
            r5.A0C = r0
        L_0x0099:
            r0 = 4
            if (r1 == r4) goto L_0x0165
            if (r1 == r3) goto L_0x0165
            if (r1 == r0) goto L_0x0155
            if (r1 == r10) goto L_0x0155
            r0 = 16
            if (r1 == r0) goto L_0x0155
            r0 = 32
            if (r1 == r0) goto L_0x0155
            r22 = 0
        L_0x00ac:
            r23 = 0
        L_0x00ae:
            if (r11 != r3) goto L_0x014f
            r0 = 8
        L_0x00b2:
            float[] r9 = r5.A0R
            r5.A02(r9)
            r20 = r9[r2]
            r21 = r9[r4]
            X.CxS r9 = new X.CxS
            r18 = r8
            r24 = r11
            r25 = r1
            r19 = r8
            r17 = r5
            r16 = r9
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25)
            androidx.recyclerview.widget.RecyclerView r1 = r5.A0I
            X.1qT r1 = r1.A0C
            if (r1 != 0) goto L_0x0143
            if (r0 != r10) goto L_0x0140
            r0 = 200(0xc8, double:9.9E-322)
        L_0x00d6:
            android.animation.ValueAnimator r8 = r9.A0B
            r8.setDuration(r0)
            java.util.List r0 = r5.A0K
            r0.add(r9)
            X.1xT r0 = r9.A0C
            r0.A09(r2)
            r8.start()
            r2 = 1
        L_0x00e9:
            r0 = 0
            r5.A0H = r0
        L_0x00ec:
            if (r27 == 0) goto L_0x0116
            X.Cn6 r1 = r5.A0F
            androidx.recyclerview.widget.RecyclerView r0 = r5.A0I
            int r1 = r1.A00(r7, r0)
            r1 = r1 & r15
            int r0 = r5.A06
            int r0 = r0 * 8
            int r1 = r1 >> r0
            r5.A08 = r1
            android.view.View r1 = r7.A0H
            int r0 = r1.getLeft()
            float r0 = (float) r0
            r5.A04 = r0
            int r0 = r1.getTop()
            float r0 = (float) r0
            r5.A05 = r0
            r5.A0H = r7
            if (r6 != r3) goto L_0x0116
            r0 = 0
            r1.performHapticFeedback(r0)
        L_0x0116:
            androidx.recyclerview.widget.RecyclerView r0 = r5.A0I
            android.view.ViewParent r1 = r0.getParent()
            if (r1 == 0) goto L_0x0127
            X.1xT r0 = r5.A0H
            boolean r0 = X.AnonymousClass000.A1W(r0)
            r1.requestDisallowInterceptTouchEvent(r0)
        L_0x0127:
            if (r2 != 0) goto L_0x0131
            androidx.recyclerview.widget.RecyclerView r0 = r5.A0I
            X.1qy r0 = r0.getLayoutManager()
            r0.A0C = r4
        L_0x0131:
            X.Cn6 r2 = r5.A0F
            X.1xT r1 = r5.A0H
            int r0 = r5.A06
            r2.A03(r1, r0)
            androidx.recyclerview.widget.RecyclerView r0 = r5.A0I
            r0.invalidate()
            return
        L_0x0140:
            r0 = 250(0xfa, double:1.235E-321)
            goto L_0x00d6
        L_0x0143:
            if (r0 != r10) goto L_0x014a
            long r0 = r1.A0A()
            goto L_0x00d6
        L_0x014a:
            long r0 = r1.A0B()
            goto L_0x00d6
        L_0x014f:
            r0 = 4
            if (r1 <= 0) goto L_0x00b2
            r0 = 2
            goto L_0x00b2
        L_0x0155:
            float r0 = r5.A00
            float r22 = java.lang.Math.signum(r0)
            androidx.recyclerview.widget.RecyclerView r0 = r5.A0I
            float r0 = X.C108945cZ.A03(r0)
            float r22 = r22 * r0
            goto L_0x00ac
        L_0x0165:
            float r0 = r5.A01
            float r23 = java.lang.Math.signum(r0)
            androidx.recyclerview.widget.RecyclerView r0 = r5.A0I
            float r0 = X.C108945cZ.A04(r0)
            float r23 = r23 * r0
            r22 = 0
            goto L_0x00ae
        L_0x0177:
            int r1 = r5.A01(r9)
            if (r1 > 0) goto L_0x008f
            int r1 = r5.A00(r9)
            if (r1 <= 0) goto L_0x01a5
        L_0x0183:
            r12 = r12 & r1
            if (r12 != 0) goto L_0x008f
            androidx.recyclerview.widget.RecyclerView r0 = r5.A0I
            int r13 = r0.getLayoutDirection()
            r12 = 789516(0xc0c0c, float:1.106348E-39)
            r9 = r1 & r12
            if (r9 == 0) goto L_0x008f
            r0 = r9 ^ -1
            r1 = r1 & r0
            if (r13 == 0) goto L_0x01a0
            int r9 = r9 << 1
            r0 = -789517(0xfffffffffff3f3f3, float:NaN)
            r0 = r0 & r9
            r1 = r1 | r0
            r9 = r9 & r12
        L_0x01a0:
            int r0 = r9 << 2
            r1 = r1 | r0
            goto L_0x008f
        L_0x01a5:
            r1 = 0
            goto L_0x008f
        L_0x01a8:
            android.view.View r1 = r8.A0H
            android.view.View r0 = r5.A0D
            if (r1 != r0) goto L_0x01b1
            r0 = 0
            r5.A0D = r0
        L_0x01b1:
            X.Cn6 r1 = r5.A0F
            androidx.recyclerview.widget.RecyclerView r0 = r5.A0I
            r1.A04(r8, r0)
            goto L_0x00e9
        L_0x01ba:
            java.lang.String r0 = "Must pass a ViewHolder when dragging"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BM5.A0B(X.1xT, int):void");
    }

    public void A0C(C42011xT r5, boolean z) {
        C26309CxS cxS;
        List list = this.A0K;
        int size = list.size();
        do {
            size--;
            if (size >= 0) {
                cxS = (C26309CxS) list.get(size);
            } else {
                return;
            }
        } while (cxS.A0C != r5);
        cxS.A04 |= z;
        if (!cxS.A05) {
            cxS.A0B.cancel();
        }
        list.remove(size);
    }

    public void A0D(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.A0I;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                recyclerView2.A0s(this);
                RecyclerView recyclerView3 = this.A0I;
                C72343Lo r1 = this.A0O;
                recyclerView3.A12.remove(r1);
                if (recyclerView3.A0F == r1) {
                    recyclerView3.A0F = null;
                }
                List list = this.A0I.A0K;
                if (list != null) {
                    list.remove(this);
                }
                List list2 = this.A0K;
                int size = list2.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    this.A0F.A04(((C26309CxS) C108955ca.A0p(list2)).A0C, this.A0I);
                }
                list2.clear();
                this.A0D = null;
                VelocityTracker velocityTracker = this.A0C;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.A0C = null;
                }
                BH2 bh2 = this.A0G;
                if (bh2 != null) {
                    bh2.A00 = false;
                    this.A0G = null;
                }
                if (this.A0E != null) {
                    this.A0E = null;
                }
            }
            this.A0I = recyclerView;
            if (recyclerView != null) {
                Resources resources = recyclerView.getResources();
                this.A0N = resources.getDimension(2131167192);
                this.A0M = resources.getDimension(2131167191);
                this.A09 = ViewConfiguration.get(this.A0I.getContext()).getScaledTouchSlop();
                this.A0I.A0r(this);
                RecyclerView recyclerView4 = this.A0I;
                recyclerView4.A12.add(this.A0O);
                List list3 = recyclerView4.A0K;
                if (list3 == null) {
                    list3 = AnonymousClass000.A13();
                    recyclerView4.A0K = list3;
                }
                list3.add(this);
                this.A0G = new BH2(this);
                this.A0E = new CIZ(this.A0I.getContext(), this.A0G, (Handler) null);
            }
        }
    }

    public void Bod(View view) {
        if (view == this.A0D) {
            this.A0D = null;
        }
        C42011xT A0Q2 = this.A0I.A0Q(view);
        if (A0Q2 != null) {
            C42011xT r0 = this.A0H;
            if (r0 == null || A0Q2 != r0) {
                A0C(A0Q2, false);
                if (this.A0Q.remove(A0Q2.A0H)) {
                    this.A0F.A04(A0Q2, this.A0I);
                    return;
                }
                return;
            }
            A0B((C42011xT) null, 0);
        }
    }

    public BM5(C25848Cn6 cn6) {
        this.A0F = cn6;
    }

    public View A06(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        C42011xT r0 = this.A0H;
        if (r0 != null) {
            View view = r0.A0H;
            float f = this.A04 + this.A00;
            float f2 = this.A05 + this.A01;
            if (x >= f && x <= f + C108945cZ.A03(view) && y >= f2 && y <= f2 + C108945cZ.A04(view)) {
                return view;
            }
        }
        List list = this.A0K;
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return this.A0I.A0M(x, y);
            }
            C26309CxS cxS = (C26309CxS) list.get(size);
            View view2 = cxS.A0C.A0H;
            float f3 = cxS.A01;
            float f4 = cxS.A02;
            if (x >= f3 && x <= f3 + C108945cZ.A03(view2) && y >= f4 && y <= f4 + C108945cZ.A04(view2)) {
                return view2;
            }
        }
    }

    public void A08(MotionEvent motionEvent, int i, int i2) {
        float x = motionEvent.getX(i2);
        float y = motionEvent.getY(i2);
        float f = x - this.A02;
        this.A00 = f;
        float f2 = y - this.A03;
        this.A01 = f2;
        if ((i & 4) == 0) {
            f = Math.max(0.0f, f);
            this.A00 = f;
        }
        if ((i & 8) == 0) {
            this.A00 = Math.min(0.0f, f);
        }
        if ((i & 1) == 0) {
            f2 = Math.max(0.0f, f2);
            this.A01 = f2;
        }
        if ((i & 2) == 0) {
            this.A01 = Math.min(0.0f, f2);
        }
    }

    public void A05(Rect rect, View view, C38021qZ r3, RecyclerView recyclerView) {
        rect.setEmpty();
    }
}
