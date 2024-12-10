package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.BHi  reason: case insensitive filesystem */
public final class C22646BHi extends ViewGroup {
    public int A00;
    public View A01;
    public C25370CeV A02;
    public CIo A03;
    public C28483E3n A04;
    public C26247Cvl A05;
    public List A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A = true;
    public boolean A0B;
    public C28483E3n[] A0C;
    public int A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G = true;
    public final List A0H;
    public final Set A0I = C17880vN.A12();
    public final C37861qG A0J = new Object();
    public final boolean A0K;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.1qG] */
    public C22646BHi(Context context) {
        super(context);
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.A0H = copyOnWriteArrayList;
        this.A07 = true;
        this.A08 = true;
        this.A00 = -1;
        this.A0B = false;
        this.A0K = true;
        BNC bnc = new BNC(this);
        if (this.A05 == null) {
            this.A05 = new C26247Cvl(getContext(), this, bnc);
        }
        copyOnWriteArrayList.add(new D89(this));
    }

    public void A02(C28483E3n e3n, int i, boolean z) {
        View view = this.A01;
        if (view != null) {
            this.A04 = e3n;
            AnonymousClass7RR r3 = new AnonymousClass7RR(this, view, i, 1, z);
            if (isLaidOut()) {
                r3.run();
                return;
            }
            ViewTreeObserver viewTreeObserver = getViewTreeObserver();
            viewTreeObserver.addOnGlobalLayoutListener(new AnonymousClass790(this, viewTreeObserver, r3, 0));
        }
    }

    public void A03(C28483E3n[] e3nArr, boolean z) {
        this.A0C = (C28483E3n[]) Arrays.copyOf(e3nArr, e3nArr.length);
        C28483E3n e3n = this.A04;
        if (e3n != null) {
            if (this.A01 == null) {
                this.A04 = null;
                e3n = null;
            } else {
                int height = getHeight();
                List emptyList = Collections.emptyList();
                View view = this.A01;
                e3n = A00(view, this, emptyList, this.A04.BXI(view, height), height);
                this.A04 = e3n;
            }
        }
        if (z) {
            if (e3n == null) {
                List emptyList2 = Collections.emptyList();
                View view2 = this.A01;
                if (view2 != null && view2.isLaidOut()) {
                    int height2 = getHeight();
                    e3n = A00(view2, this, emptyList2, height2 - view2.getTop(), height2);
                    if (e3n == null) {
                        return;
                    }
                } else {
                    return;
                }
            }
            A02(e3n, this.A00, false);
        }
    }

    public static C28483E3n A00(View view, C22646BHi bHi, List list, int i, int i2) {
        int A052;
        C28483E3n e3n = null;
        if (!(bHi.A0C == null || view == null || !view.isLaidOut())) {
            HashSet A12 = AnonymousClass8BR.A12(list);
            A12.addAll(bHi.A0I);
            int i3 = Integer.MAX_VALUE;
            for (C28483E3n e3n2 : bHi.A0C) {
                if (!A12.contains(e3n2) && (A052 = C108945cZ.A05(e3n2.BXI(view, i2), i)) < i3) {
                    e3n = e3n2;
                    i3 = A052;
                }
            }
        }
        return e3n;
    }

    private boolean A01(int i, int i2) {
        int i3;
        View view = this.A01;
        if (getNestedScrollAxes() == 1) {
            if (i2 == 0 || ((float) (Math.abs(i) / Math.abs(i2))) > 0.7f) {
                return false;
            }
        } else if (view == null) {
            return false;
        } else {
            int height = getHeight();
            C28483E3n[] e3nArr = this.A0C;
            if (e3nArr == null || e3nArr.length <= 0) {
                i3 = 0;
            } else {
                i3 = height - e3nArr[0].BXI(view, height);
                int length = this.A0C.length;
                for (int i4 = 1; i4 < length; i4++) {
                    i3 = BE6.A09(height, this.A0C[i4].BXI(view, height), i3);
                }
            }
            if (view.getBottom() <= height || view.getTop() <= i3) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004e, code lost:
        if (r3.A09.isFinished() == false) goto L_0x0050;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void computeScroll() {
        /*
            r6 = this;
            X.Cvl r3 = r6.A05
            int r0 = r3.A03
            r2 = 2
            if (r0 != r2) goto L_0x0057
            android.view.View r0 = r3.A08
            if (r0 == 0) goto L_0x005e
            android.widget.Scroller r0 = r3.A09
            boolean r5 = r0.computeScrollOffset()
            android.widget.Scroller r0 = r3.A09
            int r4 = r0.getCurrY()
            android.view.View r0 = r3.A08
            int r0 = r0.getTop()
            int r0 = r4 - r0
            if (r0 <= 0) goto L_0x005f
            int r0 = r3.A04
            int r4 = java.lang.Math.min(r4, r0)
        L_0x0027:
            android.view.View r0 = r3.A08
            int r0 = r0.getTop()
            int r1 = r4 - r0
            if (r1 == 0) goto L_0x003d
            android.view.View r0 = r3.A08
            r0.offsetTopAndBottom(r1)
            com.bloks.foa.components.bottomsheet.ViewDragHelper$Callback r1 = r3.A0H
            android.view.View r0 = r3.A08
            r1.A00(r0)
        L_0x003d:
            if (r5 == 0) goto L_0x0050
            int r0 = r3.A04
            if (r4 != r0) goto L_0x0057
            android.widget.Scroller r0 = r3.A09
            r0.abortAnimation()
            android.widget.Scroller r0 = r3.A09
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x0057
        L_0x0050:
            android.view.ViewGroup r1 = r3.A0G
            java.lang.Runnable r0 = r3.A0I
            r1.post(r0)
        L_0x0057:
            int r0 = r3.A03
            if (r0 != r2) goto L_0x005e
            r6.postInvalidateOnAnimation()
        L_0x005e:
            return
        L_0x005f:
            if (r0 >= 0) goto L_0x0027
            int r0 = r3.A04
            int r4 = java.lang.Math.max(r4, r0)
            goto L_0x0027
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22646BHi.computeScroll():void");
    }

    public int getNestedScrollAxes() {
        C37861qG r0 = this.A0J;
        return r0.A01 | r0.A00;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        View A062;
        if (this.A0A) {
            if (this.A0F || !this.A07) {
                return false;
            }
            C26247Cvl cvl = this.A05;
            int actionMasked = motionEvent.getActionMasked();
            int actionIndex = motionEvent.getActionIndex();
            if (actionMasked == 0) {
                cvl.A07();
            }
            VelocityTracker velocityTracker = cvl.A07;
            if (velocityTracker == null) {
                velocityTracker = VelocityTracker.obtain();
                cvl.A07 = velocityTracker;
            }
            velocityTracker.addMovement(motionEvent);
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked == 2) {
                        if (cvl.A0B == null || cvl.A0C == null) {
                            C26247Cvl.A02(cvl, motionEvent.getX(), motionEvent.getY(), motionEvent.getPointerId(0));
                        }
                        int pointerCount = motionEvent.getPointerCount();
                        for (int i = 0; i < pointerCount; i++) {
                            int pointerId = motionEvent.getPointerId(i);
                            if (((1 << pointerId) & cvl.A05) != 0) {
                                motionEvent.getX(i);
                                float y = motionEvent.getY(i);
                                float f = cvl.A0B[pointerId];
                                float f2 = cvl.A0C[pointerId];
                                float f3 = y - f2;
                                if (cvl.A03 != 1) {
                                    View A063 = cvl.A06((int) f, (int) f2);
                                    if (A063 != null && ((BNC) cvl.A0H).A00.getHeight() > 0 && Math.abs(f3) > ((float) cvl.A06) && cvl.A0A(A063, pointerId)) {
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                        }
                        C26247Cvl.A00(motionEvent, cvl);
                    } else if (actionMasked != 3) {
                        if (actionMasked == 5) {
                            int pointerId2 = motionEvent.getPointerId(actionIndex);
                            float x = motionEvent.getX(actionIndex);
                            float y2 = motionEvent.getY(actionIndex);
                            C26247Cvl.A02(cvl, x, y2, pointerId2);
                            if (cvl.A03 == 2 && (A062 = cvl.A06((int) x, (int) y2)) == cvl.A08) {
                                cvl.A0A(A062, pointerId2);
                            }
                        } else if (actionMasked == 6) {
                            C26247Cvl.A03(cvl, motionEvent.getPointerId(actionIndex));
                        }
                    }
                }
                cvl.A07();
            } else {
                float x2 = motionEvent.getX();
                float y3 = motionEvent.getY();
                int pointerId3 = motionEvent.getPointerId(0);
                C26247Cvl.A02(cvl, x2, y3, pointerId3);
                View A064 = cvl.A06((int) x2, (int) y3);
                if (A064 == cvl.A08 && cvl.A03 == 2) {
                    cvl.A0A(A064, pointerId3);
                }
            }
            if (cvl.A03 == 1) {
                return true;
            }
            return false;
        }
        return true;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int height;
        C28483E3n e3n;
        View view = this.A01;
        if (view != null) {
            if (!this.A0G) {
                height = view.getTop();
            } else {
                height = getHeight();
            }
            int measuredHeight = view.getMeasuredHeight() + height;
            if (this.A0K) {
                measuredHeight = Math.max(getHeight(), measuredHeight);
            }
            view.layout(0, height, getWidth(), measuredHeight);
            boolean A1S = AnonymousClass000.A1S(view.getMeasuredHeight(), this.A0D);
            this.A0D = view.getMeasuredHeight();
            if ((z || A1S) && (e3n = this.A04) != null) {
                A02(e3n, this.A00, this.A0B);
            }
            List<E7I> list = this.A0H;
            if (!list.isEmpty()) {
                for (E7I C0x : list) {
                    C0x.C0x(view, getHeight());
                }
            }
            this.A0G = false;
        }
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.A07 || z) {
            return false;
        }
        C26247Cvl cvl = this.A05;
        View view2 = this.A01;
        cvl.A08 = view2;
        cvl.A0A = true;
        cvl.A0H.A01(view2, -f2);
        cvl.A0A = false;
        if (cvl.A03 != 1) {
            return true;
        }
        cvl.A09(0);
        return true;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        if (!this.A07 || !A01((int) f, (int) f2)) {
            return false;
        }
        C26247Cvl cvl = this.A05;
        View view2 = this.A01;
        cvl.A08 = view2;
        cvl.A0A = true;
        cvl.A0H.A01(view2, -f2);
        cvl.A0A = false;
        if (cvl.A03 != 1) {
            return true;
        }
        cvl.A09(0);
        return true;
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        if (this.A07 && A01(i, i2)) {
            C26247Cvl cvl = this.A05;
            int i3 = -i;
            int i4 = -i2;
            View view2 = cvl.A08;
            if (view2 != null) {
                int left = view2.getLeft() + i3;
                int top = cvl.A08.getTop() + i4;
                C26247Cvl.A04(cvl, i3, i4);
                View view3 = cvl.A08;
                if (!(view3 == null || iArr == null)) {
                    iArr[0] = (left - view3.getLeft()) - i3;
                    iArr[1] = (top - cvl.A08.getTop()) - i4;
                }
            }
            if (getNestedScrollAxes() == 1 && iArr[1] != 0) {
                iArr[0] = i;
            }
        }
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        if (this.A07) {
            C26247Cvl cvl = this.A05;
            int i5 = -i3;
            int i6 = -i4;
            View view2 = cvl.A08;
            if (view2 != null) {
                view2.getLeft();
                cvl.A08.getTop();
                C26247Cvl.A04(cvl, i5, i6);
            }
        }
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.A0J.A01 = i;
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        boolean z = false;
        if (!this.A0F) {
            z = true;
            this.A0F = true;
            C26247Cvl cvl = this.A05;
            View view3 = this.A01;
            if (cvl.A07 == null) {
                cvl.A07 = VelocityTracker.obtain();
            }
            cvl.A09(1);
            cvl.A08 = view3;
        }
        return z;
    }

    public void onStopNestedScroll(View view) {
        this.A0J.A01 = 0;
        this.A0F = false;
        C26247Cvl cvl = this.A05;
        cvl.A08 = this.A01;
        if (cvl.A03 != 2) {
            C26247Cvl.A01(cvl, 0.0f);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0224, code lost:
        if (r5.A03 == 1) goto L_0x0226;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0074, code lost:
        if (r5.A02 == -1) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0076, code lost:
        r0 = r5.A07;
        r9 = r5.A00;
        r0.computeCurrentVelocity(1000, r9);
        r5.A07.getXVelocity(r5.A02);
        r4 = r5.A01;
        r3 = r5.A07.getYVelocity(r5.A02);
        r2 = java.lang.Math.abs(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0095, code lost:
        if (r2 >= r4) goto L_0x010b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0097, code lost:
        r3 = 0.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0098, code lost:
        X.C26247Cvl.A01(r5, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00d7, code lost:
        if (r2 > ((float) r6.getBottom())) goto L_0x00d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00e0, code lost:
        if (r1 != 3) goto L_0x00e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x010d, code lost:
        if (r2 <= r9) goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0111, code lost:
        if (r3 > 0.0f) goto L_0x0114;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0113, code lost:
        r9 = -r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0114, code lost:
        r3 = r9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r12) {
        /*
            r11 = this;
            boolean r0 = r11.A0A
            r7 = 1
            if (r0 == 0) goto L_0x0242
            android.view.View r6 = r11.A01
            if (r6 != 0) goto L_0x000c
            boolean r0 = r11.A08
            return r0
        L_0x000c:
            boolean r0 = r11.A07
            if (r0 == 0) goto L_0x009e
            X.Cvl r5 = r11.A05
            int r4 = r12.getActionMasked()
            int r8 = r12.getActionIndex()
            if (r4 != 0) goto L_0x001f
            r5.A07()
        L_0x001f:
            android.view.VelocityTracker r0 = r5.A07
            if (r0 != 0) goto L_0x0029
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r5.A07 = r0
        L_0x0029:
            r0.addMovement(r12)
            r2 = 0
            if (r4 == 0) goto L_0x0228
            r1 = 1000(0x3e8, float:1.401E-42)
            if (r4 == r7) goto L_0x01eb
            r0 = 2
            r3 = -1
            if (r4 == r0) goto L_0x0157
            r0 = 3
            if (r4 == r0) goto L_0x0222
            r0 = 5
            if (r4 == r0) goto L_0x011a
            r0 = 6
            if (r4 != r0) goto L_0x009e
            int r8 = r12.getPointerId(r8)
            int r0 = r5.A03
            if (r0 != r7) goto L_0x009b
            int r0 = r5.A02
            if (r8 != r0) goto L_0x009b
            int r9 = r12.getPointerCount()
        L_0x0050:
            if (r2 >= r9) goto L_0x0076
            int r10 = r12.getPointerId(r2)
            int r0 = r5.A02
            if (r10 == r0) goto L_0x0116
            float r4 = r12.getX(r2)
            float r0 = r12.getY(r2)
            int r4 = (int) r4
            int r0 = (int) r0
            android.view.View r4 = r5.A06(r4, r0)
            android.view.View r0 = r5.A08
            if (r4 != r0) goto L_0x0116
            boolean r0 = r5.A0A(r0, r10)
            if (r0 == 0) goto L_0x0116
            int r0 = r5.A02
            if (r0 != r3) goto L_0x009b
        L_0x0076:
            android.view.VelocityTracker r0 = r5.A07
            float r9 = r5.A00
            r0.computeCurrentVelocity(r1, r9)
            android.view.VelocityTracker r1 = r5.A07
            int r0 = r5.A02
            r1.getXVelocity(r0)
            float r4 = r5.A01
            android.view.VelocityTracker r1 = r5.A07
            int r0 = r5.A02
            float r3 = r1.getYVelocity(r0)
            float r2 = java.lang.Math.abs(r3)
            r1 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x010b
            r3 = 0
        L_0x0098:
            X.C26247Cvl.A01(r5, r3)
        L_0x009b:
            X.C26247Cvl.A03(r5, r8)
        L_0x009e:
            float r0 = r12.getX()
            int r2 = java.lang.Math.round(r0)
            float r0 = r12.getY()
            int r0 = java.lang.Math.round(r0)
            int r1 = r12.getActionMasked()
            float r3 = (float) r2
            float r2 = (float) r0
            int r0 = r6.getLeft()
            float r0 = (float) r0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x00d9
            int r0 = r6.getRight()
            float r0 = (float) r0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x00d9
            int r0 = r6.getTop()
            float r0 = (float) r0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x00d9
            int r0 = r6.getBottom()
            float r0 = (float) r0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            r3 = 1
            if (r0 <= 0) goto L_0x00da
        L_0x00d9:
            r3 = 0
        L_0x00da:
            r2 = 0
            if (r1 == 0) goto L_0x0106
            if (r1 == r7) goto L_0x00ea
            r0 = 3
            if (r1 == r0) goto L_0x0103
        L_0x00e2:
            if (r3 != 0) goto L_0x0242
            boolean r0 = r11.A08
            if (r0 != 0) goto L_0x0242
            r7 = 0
            return r7
        L_0x00ea:
            boolean r0 = r11.A0E
            if (r0 == 0) goto L_0x0103
            if (r3 != 0) goto L_0x0103
            X.CIo r0 = r11.A03
            if (r0 == 0) goto L_0x0103
            X.BEZ r1 = r0.A00
            boolean r0 = r1.A0C
            if (r0 == 0) goto L_0x0103
            boolean r0 = r1.A0B
            if (r0 == 0) goto L_0x0103
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            r1.A04(r0)
        L_0x0103:
            r11.A0E = r2
            goto L_0x00e2
        L_0x0106:
            r0 = r3 ^ 1
            r11.A0E = r0
            goto L_0x00e2
        L_0x010b:
            int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x0098
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0114
            float r9 = -r9
        L_0x0114:
            r3 = r9
            goto L_0x0098
        L_0x0116:
            int r2 = r2 + 1
            goto L_0x0050
        L_0x011a:
            int r4 = r12.getPointerId(r8)
            float r2 = r12.getX(r8)
            float r1 = r12.getY(r8)
            X.C26247Cvl.A02(r5, r2, r1, r4)
            int r0 = r5.A03
            int r3 = (int) r2
            int r2 = (int) r1
            if (r0 != 0) goto L_0x0138
            android.view.View r0 = r5.A06(r3, r2)
        L_0x0133:
            r5.A0A(r0, r4)
            goto L_0x009e
        L_0x0138:
            android.view.View r1 = r5.A08
            if (r1 == 0) goto L_0x009e
            int r0 = r1.getLeft()
            if (r3 < r0) goto L_0x009e
            int r0 = r1.getRight()
            if (r3 >= r0) goto L_0x009e
            int r0 = r1.getTop()
            if (r2 < r0) goto L_0x009e
            int r0 = r1.getBottom()
            if (r2 >= r0) goto L_0x009e
            android.view.View r0 = r5.A08
            goto L_0x0133
        L_0x0157:
            int r0 = r5.A03
            if (r0 != r7) goto L_0x0188
            int r2 = r5.A02
            int r1 = r5.A05
            int r0 = r7 << r2
            r0 = r0 & r1
            if (r0 == 0) goto L_0x009e
            int r0 = r12.findPointerIndex(r2)
            if (r0 == r3) goto L_0x009e
            float r1 = r12.getX(r0)
            float r3 = r12.getY(r0)
            float[] r0 = r5.A0D
            int r2 = r5.A02
            r0 = r0[r2]
            float r1 = r1 - r0
            int r1 = (int) r1
            float[] r0 = r5.A0E
            r0 = r0[r2]
            float r3 = r3 - r0
            int r0 = (int) r3
            X.C26247Cvl.A04(r5, r1, r0)
        L_0x0183:
            X.C26247Cvl.A00(r12, r5)
            goto L_0x009e
        L_0x0188:
            float[] r0 = r5.A0B
            if (r0 == 0) goto L_0x0190
            float[] r0 = r5.A0C
            if (r0 != 0) goto L_0x019f
        L_0x0190:
            float r3 = r12.getX()
            float r1 = r12.getY()
            int r0 = r12.getPointerId(r2)
            X.C26247Cvl.A02(r5, r3, r1, r0)
        L_0x019f:
            int r4 = r12.getPointerCount()
        L_0x01a3:
            if (r2 >= r4) goto L_0x0183
            int r8 = r12.getPointerId(r2)
            int r1 = r5.A05
            int r0 = r7 << r8
            r0 = r0 & r1
            if (r0 == 0) goto L_0x01e8
            float r1 = r12.getX(r2)
            float r3 = r12.getY(r2)
            float[] r0 = r5.A0C
            r0 = r0[r8]
            float r9 = r3 - r0
            int r0 = r5.A03
            if (r0 == r7) goto L_0x0183
            int r1 = (int) r1
            int r0 = (int) r3
            android.view.View r3 = r5.A06(r1, r0)
            if (r3 == 0) goto L_0x01e8
            com.bloks.foa.components.bottomsheet.ViewDragHelper$Callback r0 = r5.A0H
            X.BNC r0 = (X.BNC) r0
            X.BHi r0 = r0.A00
            int r0 = r0.getHeight()
            if (r0 <= 0) goto L_0x01e8
            float r1 = java.lang.Math.abs(r9)
            int r0 = r5.A06
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x01e8
            boolean r0 = r5.A0A(r3, r8)
            if (r0 == 0) goto L_0x01e8
            goto L_0x0183
        L_0x01e8:
            int r2 = r2 + 1
            goto L_0x01a3
        L_0x01eb:
            int r0 = r5.A03
            if (r0 != r7) goto L_0x021d
            android.view.VelocityTracker r0 = r5.A07
            float r8 = r5.A00
            r0.computeCurrentVelocity(r1, r8)
            android.view.VelocityTracker r1 = r5.A07
            int r0 = r5.A02
            r1.getXVelocity(r0)
            float r4 = r5.A01
            android.view.VelocityTracker r1 = r5.A07
            int r0 = r5.A02
            float r3 = r1.getYVelocity(r0)
            float r2 = java.lang.Math.abs(r3)
            r1 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x0226
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x021a
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0219
            float r8 = -r8
        L_0x0219:
            r3 = r8
        L_0x021a:
            X.C26247Cvl.A01(r5, r3)
        L_0x021d:
            r5.A07()
            goto L_0x009e
        L_0x0222:
            int r0 = r5.A03
            if (r0 != r7) goto L_0x021d
        L_0x0226:
            r3 = 0
            goto L_0x021a
        L_0x0228:
            float r4 = r12.getX()
            float r3 = r12.getY()
            int r2 = r12.getPointerId(r2)
            int r1 = (int) r4
            int r0 = (int) r3
            android.view.View r0 = r5.A06(r1, r0)
            X.C26247Cvl.A02(r5, r4, r3, r2)
            r5.A0A(r0, r2)
            goto L_0x009e
        L_0x0242:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22646BHi.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setInteractable(boolean z) {
        this.A0A = z;
        if (!z) {
            this.A05.A07();
        }
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            if (this.A0D > 0) {
                view.setTop(getHeight() - this.A0D);
            }
            this.A0D = 0;
            super.addView(view, i, layoutParams);
            this.A01 = view;
            return;
        }
        throw AnonymousClass000.A0n("BloksSlidingViewGroup only supports a single child");
    }

    public void onMeasure(int i, int i2) {
        int i3;
        super.onMeasure(i, i2);
        measureChildren(i, i2);
        if (this.A09) {
            View view = this.A01;
            if (this.A0C == null || view == null) {
                i3 = 0;
            } else {
                int measuredHeight = getMeasuredHeight();
                i3 = 0;
                for (C28483E3n BXI : this.A0C) {
                    i3 = Math.max(i3, BXI.BXI(view, measuredHeight));
                }
            }
            measureChildren(i, View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE));
        }
    }

    public void setSlideToAnchorImmediately(boolean z) {
        this.A0B = z;
    }
}
