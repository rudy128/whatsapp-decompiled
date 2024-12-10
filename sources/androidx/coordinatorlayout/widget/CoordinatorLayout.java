package androidx.coordinatorlayout.widget;

import X.AnonymousClass00O;
import X.AnonymousClass1HE;
import X.AnonymousClass1HF;
import X.AnonymousClass1HO;
import X.AnonymousClass1YO;
import X.BL2;
import X.C24261Jm;
import X.C27741Xj;
import X.C27831Xu;
import X.C29011bR;
import X.C29031bT;
import X.C37821qB;
import X.C37831qC;
import X.C37851qF;
import X.C37861qG;
import X.C37891qK;
import X.C41501wV;
import X.C62932sE;
import X.C64772vJ;
import X.D6T;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.voipcalling.camera.VoipLiteCamera;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CoordinatorLayout extends ViewGroup implements C37821qB, C37831qC {
    public static final String A0J;
    public static final ThreadLocal A0K = new ThreadLocal();
    public static final Comparator A0L = new Object();
    public static final Class[] A0M = {Context.class, AttributeSet.class};
    public static final C29011bR A0N = new C29031bT(12);
    public ViewGroup.OnHierarchyChangeListener A00;
    public C64772vJ A01;
    public AnonymousClass1HO A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public Drawable A06;
    public View A07;
    public View A08;
    public AnonymousClass1HE A09;
    public boolean A0A;
    public int[] A0B;
    public final C37851qF A0C;
    public final List A0D;
    public final C37861qG A0E;
    public final List A0F;
    public final List A0G;
    public final int[] A0H;
    public final int[] A0I;

    @Deprecated
    public @interface DefaultBehavior {
        Class value();
    }

    public CoordinatorLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public void A0G(View view, int i, int i2, int i3) {
        measureChildWithMargins(view, i, i2, i3, 0);
    }

    public void Byz(View view, int i, int i2, int i3, int i4, int i5) {
        Bz0(view, this.A0I, i, i2, i3, i4, 0);
    }

    public boolean C6L(View view, View view2, int i, int i2) {
        boolean z;
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                C37891qK r1 = (C37891qK) childAt.getLayoutParams();
                C41501wV r5 = r1.A0A;
                int i4 = i2;
                if (r5 != null) {
                    z = r5.A0M(childAt, view, view2, this, i, i4);
                    z2 |= z;
                } else {
                    z = false;
                }
                if (i2 != 0) {
                    r1.A0C = z;
                } else {
                    r1.A0D = z;
                }
            }
        }
        return z2;
    }

    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C37891qK(-2, -2);
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        C41501wV r5;
        int childCount = getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C37891qK r1 = (C37891qK) childAt.getLayoutParams();
                if (r1.A0D && (r5 = r1.A0A) != null) {
                    z |= r5.A0N(childAt, view, this, f, f2);
                }
            }
        }
        return z;
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        Byy(view, iArr, i, i2, 0);
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        Byz(view, i, i2, i3, i4, 0);
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        Bz1(view, view2, i, 0);
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        return C6L(view, view2, i, 0);
    }

    public void onStopNestedScroll(View view) {
        C73(view, 0);
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, java.util.Comparator] */
    static {
        Package packageR = CoordinatorLayout.class.getPackage();
        String str = null;
        if (packageR != null) {
            str = packageR.getName();
        }
        A0J = str;
    }

    private int A00(int i) {
        StringBuilder sb;
        int[] iArr = this.A0B;
        if (iArr == null) {
            sb = new StringBuilder();
            sb.append("No keylines defined for ");
            sb.append(this);
            sb.append(" - attempted index lookup ");
            sb.append(i);
        } else if (i >= 0 && i < iArr.length) {
            return iArr[i];
        } else {
            sb = new StringBuilder();
            sb.append("Keyline index ");
            sb.append(i);
            sb.append(" out of range for ");
            sb.append(this);
        }
        Log.e("CoordinatorLayout", sb.toString());
        return 0;
    }

    public static Rect A01() {
        Rect rect = (Rect) A0N.BAf();
        if (rect == null) {
            return new Rect();
        }
        return rect;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0056, code lost:
        r11 = getLayoutDirection();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A03() {
        /*
            r12 = this;
            java.util.List r7 = r12.A0F
            r7.clear()
            X.1qF r6 = r12.A0C
            X.00O r5 = r6.A00
            int r3 = r5.size()
            r2 = 0
        L_0x000e:
            if (r2 >= r3) goto L_0x0023
            java.lang.Object r1 = r5.A06(r2)
            java.util.AbstractCollection r1 = (java.util.AbstractCollection) r1
            if (r1 == 0) goto L_0x0020
            r1.clear()
            X.1bR r0 = r6.A01
            r0.CEF(r1)
        L_0x0020:
            int r2 = r2 + 1
            goto L_0x000e
        L_0x0023:
            r5.clear()
            int r9 = r12.getChildCount()
            r8 = 0
        L_0x002b:
            if (r8 >= r9) goto L_0x0167
            android.view.View r3 = r12.getChildAt(r8)
            X.1qK r4 = A02(r3)
            int r1 = r4.A05
            r0 = -1
            if (r1 != r0) goto L_0x00bc
            r0 = 0
            r4.A08 = r0
            r4.A09 = r0
        L_0x003f:
            boolean r0 = r5.containsKey(r3)
            if (r0 != 0) goto L_0x0049
            r0 = 0
            r5.put(r3, r0)
        L_0x0049:
            r2 = 0
        L_0x004a:
            if (r2 >= r9) goto L_0x00b8
            if (r2 == r8) goto L_0x00aa
            android.view.View r1 = r12.getChildAt(r2)
            android.view.View r0 = r4.A08
            if (r1 == r0) goto L_0x0071
            int r11 = r12.getLayoutDirection()
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            X.1qK r0 = (X.C37891qK) r0
            int r0 = r0.A03
            int r10 = android.view.Gravity.getAbsoluteGravity(r0, r11)
            if (r10 == 0) goto L_0x00ad
            int r0 = r4.A01
            int r0 = android.view.Gravity.getAbsoluteGravity(r0, r11)
            r0 = r0 & r10
            if (r0 != r10) goto L_0x00ad
        L_0x0071:
            boolean r0 = r5.containsKey(r1)
            if (r0 != 0) goto L_0x0081
            boolean r0 = r5.containsKey(r1)
            if (r0 != 0) goto L_0x0081
            r0 = 0
            r5.put(r1, r0)
        L_0x0081:
            boolean r0 = r5.containsKey(r1)
            if (r0 == 0) goto L_0x015f
            boolean r0 = r5.containsKey(r3)
            if (r0 == 0) goto L_0x015f
            java.lang.Object r0 = r5.get(r1)
            java.util.AbstractCollection r0 = (java.util.AbstractCollection) r0
            if (r0 != 0) goto L_0x00a7
            X.1bR r0 = r6.A01
            java.lang.Object r0 = r0.BAf()
            java.util.AbstractCollection r0 = (java.util.AbstractCollection) r0
            if (r0 != 0) goto L_0x00a4
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L_0x00a4:
            r5.put(r1, r0)
        L_0x00a7:
            r0.add(r3)
        L_0x00aa:
            int r2 = r2 + 1
            goto L_0x004a
        L_0x00ad:
            X.1wV r0 = r4.A0A
            if (r0 == 0) goto L_0x00aa
            boolean r0 = r0.A0C(r3, r1)
            if (r0 == 0) goto L_0x00aa
            goto L_0x0071
        L_0x00b8:
            int r8 = r8 + 1
            goto L_0x002b
        L_0x00bc:
            android.view.View r0 = r4.A09
            if (r0 == 0) goto L_0x00e9
            int r1 = r0.getId()
            int r0 = r4.A05
            if (r1 != r0) goto L_0x00e9
            android.view.View r2 = r4.A09
            android.view.ViewParent r1 = r2.getParent()
        L_0x00ce:
            if (r1 == r12) goto L_0x00e0
            if (r1 == 0) goto L_0x00e4
            if (r1 == r3) goto L_0x00e4
            boolean r0 = r1 instanceof android.view.View
            if (r0 == 0) goto L_0x00db
            r2 = r1
            android.view.View r2 = (android.view.View) r2
        L_0x00db:
            android.view.ViewParent r1 = r1.getParent()
            goto L_0x00ce
        L_0x00e0:
            r4.A08 = r2
            goto L_0x003f
        L_0x00e4:
            r0 = 0
            r4.A08 = r0
            r4.A09 = r0
        L_0x00e9:
            int r11 = r4.A05
            android.view.View r10 = r12.findViewById(r11)
            r4.A09 = r10
            r2 = 0
            if (r10 == 0) goto L_0x012c
            if (r10 != r12) goto L_0x0104
            boolean r0 = r12.isInEditMode()
            if (r0 != 0) goto L_0x0159
            java.lang.String r1 = "View can not be anchored to the the parent CoordinatorLayout"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0104:
            android.view.ViewParent r1 = r10.getParent()
        L_0x0108:
            if (r1 == r12) goto L_0x0128
            if (r1 == 0) goto L_0x0128
            if (r1 != r3) goto L_0x011c
            boolean r0 = r12.isInEditMode()
            if (r0 != 0) goto L_0x0159
            java.lang.String r1 = "Anchor must not be a descendant of the anchored view"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x011c:
            boolean r0 = r1 instanceof android.view.View
            if (r0 == 0) goto L_0x0123
            r10 = r1
            android.view.View r10 = (android.view.View) r10
        L_0x0123:
            android.view.ViewParent r1 = r1.getParent()
            goto L_0x0108
        L_0x0128:
            r4.A08 = r10
            goto L_0x003f
        L_0x012c:
            boolean r0 = r12.isInEditMode()
            if (r0 != 0) goto L_0x0159
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Could not find CoordinatorLayout descendant view with id "
            r1.append(r0)
            android.content.res.Resources r0 = r12.getResources()
            java.lang.String r0 = r0.getResourceName(r11)
            r1.append(r0)
            java.lang.String r0 = " to anchor view "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0159:
            r4.A08 = r2
            r4.A09 = r2
            goto L_0x003f
        L_0x015f:
            java.lang.String r1 = "All nodes must be present in the graph before being added as an edge"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0167:
            java.util.ArrayList r4 = r6.A02
            r4.clear()
            java.util.HashSet r3 = r6.A03
            r3.clear()
            int r2 = r5.size()
            r1 = 0
        L_0x0176:
            if (r1 >= r2) goto L_0x0182
            java.lang.Object r0 = r5.A04(r1)
            X.C37851qF.A00(r6, r0, r4, r3)
            int r1 = r1 + 1
            goto L_0x0176
        L_0x0182:
            r7.addAll(r4)
            java.util.Collections.reverse(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.A03():void");
    }

    public static void A06(Rect rect, Rect rect2, C37891qK r11, int i, int i2, int i3) {
        int width;
        int height;
        int i4 = r11.A02;
        if (i4 == 0) {
            i4 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i4, i);
        int i5 = r11.A00;
        if ((i5 & 7) == 0) {
            i5 |= 8388611;
        }
        if ((i5 & 112) == 0) {
            i5 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i5, i);
        int i6 = absoluteGravity & 7;
        int i7 = absoluteGravity & 112;
        int i8 = absoluteGravity2 & 7;
        int i9 = absoluteGravity2 & 112;
        if (i8 == 1) {
            width = rect.left + (rect.width() / 2);
        } else if (i8 != 5) {
            width = rect.left;
        } else {
            width = rect.right;
        }
        if (i9 == 16) {
            height = rect.top + (rect.height() / 2);
        } else if (i9 != 80) {
            height = rect.top;
        } else {
            height = rect.bottom;
        }
        if (i6 == 1) {
            width -= i2 / 2;
        } else if (i6 != 5) {
            width -= i2;
        }
        if (i7 == 16) {
            height -= i3 / 2;
        } else if (i7 != 80) {
            height -= i3;
        }
        rect2.set(width, height, i2 + width, i3 + height);
    }

    private boolean A0B(MotionEvent motionEvent, int i) {
        int i2;
        MotionEvent motionEvent2 = motionEvent;
        int actionMasked = motionEvent2.getActionMasked();
        List list = this.A0G;
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i3 = childCount - 1; i3 >= 0; i3--) {
            if (isChildrenDrawingOrderEnabled) {
                i2 = getChildDrawingOrder(childCount, i3);
            } else {
                i2 = i3;
            }
            list.add(getChildAt(i2));
        }
        Collections.sort(list, A0L);
        int size = list.size();
        MotionEvent motionEvent3 = null;
        boolean z = false;
        for (int i4 = 0; i4 < size; i4++) {
            View view = (View) list.get(i4);
            C41501wV r0 = ((C37891qK) view.getLayoutParams()).A0A;
            if (!z) {
                if (r0 != null) {
                    if (i != 0) {
                        z = r0.A0L(motionEvent2, view, this);
                    } else {
                        z = r0.A0K(motionEvent2, view, this);
                    }
                    if (z) {
                        this.A07 = view;
                    }
                }
            } else if (!(actionMasked == 0 || r0 == null)) {
                if (motionEvent3 == null) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    motionEvent3 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i != 0) {
                    r0.A0L(motionEvent3, view, this);
                } else {
                    r0.A0K(motionEvent3, view, this);
                }
            }
        }
        list.clear();
        return z;
    }

    public List A0C(View view) {
        AnonymousClass00O r4 = this.A0C.A00;
        int size = r4.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            AbstractCollection abstractCollection = (AbstractCollection) r4.A06(i);
            if (abstractCollection != null && abstractCollection.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(r4.A04(i));
            }
        }
        List list = this.A0D;
        list.clear();
        if (arrayList != null) {
            list.addAll(arrayList);
        }
        return list;
    }

    /* JADX WARNING: Removed duplicated region for block: B:143:0x02a1 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0D(int r28) {
        /*
            r27 = this;
            r7 = r27
            int r20 = r7.getLayoutDirection()
            java.util.List r6 = r7.A0F
            int r19 = r6.size()
            android.graphics.Rect r5 = A01()
            android.graphics.Rect r4 = A01()
            android.graphics.Rect r18 = A01()
            r3 = 0
        L_0x0019:
            r0 = r19
            if (r3 >= r0) goto L_0x02c4
            java.lang.Object r2 = r6.get(r3)
            android.view.View r2 = (android.view.View) r2
            android.view.ViewGroup$LayoutParams r9 = r2.getLayoutParams()
            X.1qK r9 = (X.C37891qK) r9
            r8 = r28
            if (r28 != 0) goto L_0x0038
            int r1 = r2.getVisibility()
            r0 = 8
            if (r1 != r0) goto L_0x0038
        L_0x0035:
            int r3 = r3 + 1
            goto L_0x0019
        L_0x0038:
            r14 = 0
        L_0x0039:
            if (r14 >= r3) goto L_0x00db
            java.lang.Object r1 = r6.get(r14)
            android.view.View r0 = r9.A08
            if (r0 != r1) goto L_0x00d3
            android.view.ViewGroup$LayoutParams r13 = r2.getLayoutParams()
            X.1qK r13 = (X.C37891qK) r13
            android.view.View r0 = r13.A09
            if (r0 == 0) goto L_0x00d3
            android.graphics.Rect r17 = A01()
            android.graphics.Rect r12 = A01()
            android.graphics.Rect r11 = A01()
            android.view.View r1 = r13.A09
            r0 = r17
            X.C62932sE.A01(r0, r1, r7)
            r16 = 0
            boolean r0 = r2.isLayoutRequested()
            if (r0 != 0) goto L_0x00d7
            int r1 = r2.getVisibility()
            r0 = 8
            if (r1 == r0) goto L_0x00d7
            int r15 = r2.getLeft()
            int r10 = r2.getTop()
            int r1 = r2.getRight()
            int r0 = r2.getBottom()
            r12.set(r15, r10, r1, r0)
        L_0x0083:
            int r15 = r2.getMeasuredWidth()
            int r10 = r2.getMeasuredHeight()
            r21 = r17
            r22 = r11
            r23 = r13
            r24 = r20
            r25 = r15
            r26 = r10
            A06(r21, r22, r23, r24, r25, r26)
            int r1 = r11.left
            int r0 = r12.left
            if (r1 != r0) goto L_0x00a6
            int r1 = r11.top
            int r0 = r12.top
            if (r1 == r0) goto L_0x00a8
        L_0x00a6:
            r16 = 1
        L_0x00a8:
            r7.A07(r11, r13, r15, r10)
            int r10 = r11.left
            int r0 = r12.left
            int r10 = r10 - r0
            int r1 = r11.top
            int r0 = r12.top
            int r1 = r1 - r0
            if (r10 == 0) goto L_0x00ba
            X.AnonymousClass1HF.A0Z(r2, r10)
        L_0x00ba:
            if (r1 == 0) goto L_0x00bf
            X.AnonymousClass1HF.A0a(r2, r1)
        L_0x00bf:
            if (r16 == 0) goto L_0x00ca
            X.1wV r1 = r13.A0A
            if (r1 == 0) goto L_0x00ca
            android.view.View r0 = r13.A09
            r1.A0B(r2, r0, r7)
        L_0x00ca:
            A05(r17)
            A05(r12)
            A05(r11)
        L_0x00d3:
            int r14 = r14 + 1
            goto L_0x0039
        L_0x00d7:
            r12.setEmpty()
            goto L_0x0083
        L_0x00db:
            boolean r0 = r2.isLayoutRequested()
            if (r0 != 0) goto L_0x01dc
            int r1 = r2.getVisibility()
            r0 = 8
            if (r1 == r0) goto L_0x01dc
            X.C62932sE.A01(r4, r2, r7)
        L_0x00ec:
            int r0 = r9.A03
            if (r0 == 0) goto L_0x012e
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x012e
            int r1 = r9.A03
            r0 = r20
            int r11 = android.view.Gravity.getAbsoluteGravity(r1, r0)
            r1 = r11 & 112(0x70, float:1.57E-43)
            r0 = 48
            if (r1 == r0) goto L_0x01d0
            r0 = 80
            if (r1 != r0) goto L_0x0117
            int r10 = r5.bottom
            int r1 = r7.getHeight()
            int r0 = r4.top
            int r1 = r1 - r0
            int r0 = java.lang.Math.max(r10, r1)
            r5.bottom = r0
        L_0x0117:
            r1 = r11 & 7
            r0 = 3
            if (r1 == r0) goto L_0x01c4
            r0 = 5
            if (r1 != r0) goto L_0x012e
            int r10 = r5.right
            int r1 = r7.getWidth()
            int r0 = r4.left
            int r1 = r1 - r0
            int r0 = java.lang.Math.max(r10, r1)
            r5.right = r0
        L_0x012e:
            int r0 = r9.A01
            if (r0 == 0) goto L_0x025b
            int r0 = r2.getVisibility()
            if (r0 != 0) goto L_0x025b
            boolean r0 = r2.isLaidOut()
            if (r0 == 0) goto L_0x025b
            int r0 = r2.getWidth()
            if (r0 <= 0) goto L_0x025b
            int r0 = r2.getHeight()
            if (r0 <= 0) goto L_0x025b
            android.view.ViewGroup$LayoutParams r11 = r2.getLayoutParams()
            X.1qK r11 = (X.C37891qK) r11
            X.1wV r14 = r11.A0A
            android.graphics.Rect r9 = A01()
            android.graphics.Rect r10 = A01()
            int r13 = r2.getLeft()
            int r12 = r2.getTop()
            int r1 = r2.getRight()
            int r0 = r2.getBottom()
            r10.set(r13, r12, r1, r0)
            if (r14 == 0) goto L_0x01e1
            boolean r0 = r14 instanceof com.google.android.material.floatingactionbutton.FloatingActionButton$BaseBehavior
            if (r0 == 0) goto L_0x01e1
            r1 = r2
            X.1YQ r1 = (X.AnonymousClass1YQ) r1
            android.graphics.Rect r15 = r1.A0C
            int r14 = r1.getLeft()
            int r0 = r15.left
            int r14 = r14 + r0
            int r13 = r1.getTop()
            int r0 = r15.top
            int r13 = r13 + r0
            int r12 = r1.getRight()
            int r0 = r15.right
            int r12 = r12 - r0
            int r1 = r1.getBottom()
            int r0 = r15.bottom
            int r1 = r1 - r0
            r9.set(r14, r13, r12, r1)
            boolean r0 = r10.contains(r9)
            if (r0 != 0) goto L_0x01e4
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Rect should be within the child's bounds. Rect:"
            r1.append(r0)
            java.lang.String r0 = r9.toShortString()
            r1.append(r0)
            java.lang.String r0 = " | Bounds:"
            r1.append(r0)
            java.lang.String r0 = r10.toShortString()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x01c4:
            int r1 = r5.left
            int r0 = r4.right
            int r0 = java.lang.Math.max(r1, r0)
            r5.left = r0
            goto L_0x012e
        L_0x01d0:
            int r1 = r5.top
            int r0 = r4.bottom
            int r0 = java.lang.Math.max(r1, r0)
            r5.top = r0
            goto L_0x0117
        L_0x01dc:
            r4.setEmpty()
            goto L_0x00ec
        L_0x01e1:
            r9.set(r10)
        L_0x01e4:
            A05(r10)
            boolean r0 = r9.isEmpty()
            if (r0 != 0) goto L_0x0258
            int r1 = r11.A01
            r0 = r20
            int r14 = android.view.Gravity.getAbsoluteGravity(r1, r0)
            r1 = r14 & 48
            r13 = 1
            r0 = 48
            r10 = 0
            if (r1 != r0) goto L_0x02c1
            int r1 = r9.top
            int r0 = r11.topMargin
            int r1 = r1 - r0
            int r0 = r11.A07
            int r1 = r1 - r0
            int r0 = r5.top
            if (r1 >= r0) goto L_0x02c1
            int r0 = r0 - r1
            A09(r2, r0)
            r12 = 1
        L_0x020e:
            r1 = r14 & 80
            r0 = 80
            if (r1 != r0) goto L_0x02ba
            int r1 = r7.getHeight()
            int r0 = r9.bottom
            int r1 = r1 - r0
            int r0 = r11.bottomMargin
            int r1 = r1 - r0
            int r0 = r11.A07
            int r1 = r1 + r0
            int r0 = r5.bottom
            if (r1 >= r0) goto L_0x02ba
            int r1 = r1 - r0
            A09(r2, r1)
        L_0x0229:
            r1 = r14 & 3
            r0 = 3
            if (r1 != r0) goto L_0x02b8
            int r1 = r9.left
            int r0 = r11.leftMargin
            int r1 = r1 - r0
            int r0 = r11.A06
            int r1 = r1 - r0
            int r0 = r5.left
            if (r1 >= r0) goto L_0x02b8
            int r0 = r0 - r1
            A08(r2, r0)
        L_0x023e:
            r1 = 5
            r0 = r14 & 5
            if (r0 != r1) goto L_0x02b2
            int r1 = r7.getWidth()
            int r0 = r9.right
            int r1 = r1 - r0
            int r0 = r11.rightMargin
            int r1 = r1 - r0
            int r0 = r11.A06
            int r1 = r1 + r0
            int r0 = r5.right
            if (r1 >= r0) goto L_0x02b2
            int r1 = r1 - r0
            A08(r2, r1)
        L_0x0258:
            A05(r9)
        L_0x025b:
            r9 = 2
            if (r8 == r9) goto L_0x027c
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            X.1qK r0 = (X.C37891qK) r0
            android.graphics.Rect r1 = r0.A0F
            r0 = r18
            r0.set(r1)
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x0035
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            X.1qK r0 = (X.C37891qK) r0
            android.graphics.Rect r0 = r0.A0F
            r0.set(r4)
        L_0x027c:
            int r11 = r3 + 1
        L_0x027e:
            r0 = r19
            if (r11 >= r0) goto L_0x0035
            java.lang.Object r12 = r6.get(r11)
            android.view.View r12 = (android.view.View) r12
            android.view.ViewGroup$LayoutParams r10 = r12.getLayoutParams()
            X.1qK r10 = (X.C37891qK) r10
            X.1wV r1 = r10.A0A
            if (r1 == 0) goto L_0x02a1
            boolean r0 = r1.A0C(r12, r2)
            if (r0 == 0) goto L_0x02a1
            if (r28 != 0) goto L_0x02a4
            boolean r0 = r10.A0E
            if (r0 == 0) goto L_0x02aa
            r1 = 0
        L_0x029f:
            r10.A0E = r1
        L_0x02a1:
            int r11 = r11 + 1
            goto L_0x027e
        L_0x02a4:
            if (r8 != r9) goto L_0x02aa
            r1.A09(r2, r7)
            goto L_0x02a1
        L_0x02aa:
            boolean r1 = r1.A0B(r12, r2, r7)
            r0 = 1
            if (r8 != r0) goto L_0x02a1
            goto L_0x029f
        L_0x02b2:
            if (r13 != 0) goto L_0x0258
            A08(r2, r10)
            goto L_0x0258
        L_0x02b8:
            r13 = 0
            goto L_0x023e
        L_0x02ba:
            if (r12 != 0) goto L_0x0229
            A09(r2, r10)
            goto L_0x0229
        L_0x02c1:
            r12 = 0
            goto L_0x020e
        L_0x02c4:
            A05(r5)
            A05(r4)
            A05(r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.A0D(int):void");
    }

    public void A0E(View view) {
        List list = (List) this.A0C.A00.get(view);
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < list.size(); i++) {
                View view2 = (View) list.get(i);
                C41501wV r0 = ((C37891qK) view2.getLayoutParams()).A0A;
                if (r0 != null) {
                    r0.A0B(view2, view, this);
                }
            }
        }
    }

    public void Byy(View view, int[] iArr, int i, int i2, int i3) {
        boolean z;
        C41501wV r9;
        int childCount = getChildCount();
        boolean z2 = false;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                C37891qK r1 = (C37891qK) childAt.getLayoutParams();
                int i7 = i3;
                if (i3 != 0) {
                    z = r1.A0C;
                } else {
                    z = r1.A0D;
                }
                if (z && (r9 = r1.A0A) != null) {
                    int[] iArr2 = this.A0H;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    r9.A0H(childAt, view, this, iArr2, i, i2, i7);
                    int i8 = iArr2[0];
                    if (i > 0) {
                        i4 = Math.max(i4, i8);
                    } else {
                        i4 = Math.min(i4, i8);
                    }
                    int i9 = iArr2[1];
                    if (i2 > 0) {
                        i5 = Math.max(i5, i9);
                    } else {
                        i5 = Math.min(i5, i9);
                    }
                    z2 = true;
                }
            }
        }
        iArr[0] = i4;
        iArr[1] = i5;
        if (z2) {
            A0D(1);
        }
    }

    public void Bz0(View view, int[] iArr, int i, int i2, int i3, int i4, int i5) {
        boolean z;
        C41501wV r9;
        int childCount = getChildCount();
        boolean z2 = false;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                C37891qK r6 = (C37891qK) childAt.getLayoutParams();
                if (i5 != 0) {
                    z = r6.A0C;
                } else {
                    z = r6.A0D;
                }
                if (z && (r9 = r6.A0A) != null) {
                    int[] iArr2 = this.A0H;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    r9.A0I(childAt, this, iArr2, i2, i3, i4);
                    int i9 = iArr2[0];
                    if (i3 > 0) {
                        i6 = Math.max(i6, i9);
                    } else {
                        i6 = Math.min(i6, i9);
                    }
                    int i10 = iArr2[1];
                    if (i4 > 0) {
                        i7 = Math.max(i7, i10);
                    } else {
                        i7 = Math.min(i7, i10);
                    }
                    z2 = true;
                }
            }
        }
        iArr[0] = iArr[0] + i6;
        iArr[1] = iArr[1] + i7;
        if (z2) {
            A0D(1);
        }
    }

    public void Bz1(View view, View view2, int i, int i2) {
        C37861qG r1 = this.A0E;
        if (i2 == 1) {
            r1.A00 = i;
        } else {
            r1.A01 = i;
        }
        this.A08 = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            getChildAt(i3).getLayoutParams();
        }
    }

    public void C73(View view, int i) {
        boolean z;
        C37861qG r2 = this.A0E;
        if (i == 1) {
            r2.A00 = 0;
        } else {
            r2.A01 = 0;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            C37891qK r1 = (C37891qK) childAt.getLayoutParams();
            if (i != 0) {
                z = r1.A0C;
            } else {
                z = r1.A0D;
            }
            if (z) {
                C41501wV r0 = r1.A0A;
                if (r0 != null) {
                    r0.A0G(childAt, view, this, i);
                }
                if (i != 0) {
                    r1.A0C = false;
                } else {
                    r1.A0D = false;
                }
                r1.A0E = false;
            }
        }
        this.A08 = null;
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (!(layoutParams instanceof C37891qK) || !super.checkLayoutParams(layoutParams)) {
            return false;
        }
        return true;
    }

    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C37891qK) {
            return new C37891qK((C37891qK) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C37891qK((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C37891qK(layoutParams);
    }

    public int getNestedScrollAxes() {
        C37861qG r0 = this.A0E;
        return r0.A01 | r0.A00;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0091, code lost:
        if (getFitsSystemWindows() == false) goto L_0x0093;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00cf, code lost:
        if (r20 != false) goto L_0x00d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0153, code lost:
        if (r20 != false) goto L_0x0155;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0155, code lost:
        r15 = java.lang.Math.max(0, (r19 - r21) - r14);
     */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x014b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r33, int r34) {
        /*
            r32 = this;
            r3 = r32
            r3.A03()
            int r8 = r3.getChildCount()
            r7 = 0
            r6 = 0
        L_0x000b:
            if (r6 >= r8) goto L_0x002b
            android.view.View r5 = r3.getChildAt(r6)
            X.1qF r0 = r3.A0C
            X.00O r4 = r0.A00
            int r2 = r4.size()
            r1 = 0
        L_0x001a:
            if (r1 >= r2) goto L_0x0178
            java.lang.Object r0 = r4.A06(r1)
            java.util.AbstractCollection r0 = (java.util.AbstractCollection) r0
            if (r0 == 0) goto L_0x0174
            boolean r0 = r0.contains(r5)
            if (r0 == 0) goto L_0x0174
            r7 = 1
        L_0x002b:
            boolean r0 = r3.A05
            if (r7 == r0) goto L_0x004c
            boolean r0 = r3.A04
            if (r7 == 0) goto L_0x0162
            if (r0 == 0) goto L_0x0049
            X.2vJ r0 = r3.A01
            if (r0 != 0) goto L_0x0040
            X.2vJ r0 = new X.2vJ
            r0.<init>(r3)
            r3.A01 = r0
        L_0x0040:
            android.view.ViewTreeObserver r1 = r3.getViewTreeObserver()
            X.2vJ r0 = r3.A01
            r1.addOnPreDrawListener(r0)
        L_0x0049:
            r0 = 1
        L_0x004a:
            r3.A05 = r0
        L_0x004c:
            int r23 = r3.getPaddingLeft()
            int r22 = r3.getPaddingTop()
            int r21 = r3.getPaddingRight()
            int r1 = r3.getPaddingBottom()
            int r11 = r3.getLayoutDirection()
            r0 = 1
            r20 = 0
            if (r11 != r0) goto L_0x0067
            r20 = 1
        L_0x0067:
            r31 = r33
            int r10 = android.view.View.MeasureSpec.getMode(r31)
            int r19 = android.view.View.MeasureSpec.getSize(r31)
            r30 = r34
            int r9 = android.view.View.MeasureSpec.getMode(r30)
            int r18 = android.view.View.MeasureSpec.getSize(r30)
            int r17 = r23 + r21
            int r22 = r22 + r1
            int r8 = r3.getSuggestedMinimumWidth()
            int r6 = r3.getSuggestedMinimumHeight()
            X.1HO r0 = r3.A02
            if (r0 == 0) goto L_0x0093
            boolean r0 = r3.getFitsSystemWindows()
            r16 = 1
            if (r0 != 0) goto L_0x0095
        L_0x0093:
            r16 = 0
        L_0x0095:
            java.util.List r7 = r3.A0F
            int r5 = r7.size()
            r4 = 0
            r2 = 0
        L_0x009d:
            if (r2 >= r5) goto L_0x017c
            java.lang.Object r12 = r7.get(r2)
            android.view.View r12 = (android.view.View) r12
            int r1 = r12.getVisibility()
            r0 = 8
            if (r1 == r0) goto L_0x0147
            android.view.ViewGroup$LayoutParams r13 = r12.getLayoutParams()
            X.1qK r13 = (X.C37891qK) r13
            int r0 = r13.A04
            if (r0 < 0) goto L_0x015f
            if (r10 == 0) goto L_0x015f
            int r0 = r13.A04
            int r14 = r3.A00(r0)
            int r0 = r13.A02
            if (r0 != 0) goto L_0x00c6
            r0 = 8388661(0x800035, float:1.1755018E-38)
        L_0x00c6:
            int r0 = android.view.Gravity.getAbsoluteGravity(r0, r11)
            r1 = r0 & 7
            r0 = 3
            if (r1 != r0) goto L_0x0150
            if (r20 == 0) goto L_0x0155
        L_0x00d1:
            int r14 = r14 - r23
            r0 = 0
            int r15 = java.lang.Math.max(r0, r14)
        L_0x00d8:
            if (r16 == 0) goto L_0x014b
            boolean r0 = r12.getFitsSystemWindows()
            if (r0 != 0) goto L_0x014b
            X.1HO r0 = r3.A02
            int r14 = r0.A03()
            X.1HO r0 = r3.A02
            int r0 = r0.A04()
            int r14 = r14 + r0
            X.1HO r0 = r3.A02
            int r1 = r0.A05()
            X.1HO r0 = r3.A02
            int r0 = r0.A02()
            int r1 = r1 + r0
            int r0 = r19 - r14
            int r14 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r10)
            int r0 = r18 - r1
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r9)
        L_0x0106:
            X.1wV r0 = r13.A0A
            if (r0 == 0) goto L_0x011c
            r24 = r0
            r25 = r12
            r26 = r3
            r27 = r14
            r28 = r15
            r29 = r1
            boolean r0 = r24.A0P(r25, r26, r27, r28, r29)
            if (r0 != 0) goto L_0x011f
        L_0x011c:
            r3.A0G(r12, r14, r15, r1)
        L_0x011f:
            int r0 = r12.getMeasuredWidth()
            int r1 = r17 + r0
            int r0 = r13.leftMargin
            int r1 = r1 + r0
            int r0 = r13.rightMargin
            int r1 = r1 + r0
            int r8 = java.lang.Math.max(r8, r1)
            int r0 = r12.getMeasuredHeight()
            int r1 = r22 + r0
            int r0 = r13.topMargin
            int r1 = r1 + r0
            int r0 = r13.bottomMargin
            int r1 = r1 + r0
            int r6 = java.lang.Math.max(r6, r1)
            int r0 = r12.getMeasuredState()
            int r4 = android.view.View.combineMeasuredStates(r4, r0)
        L_0x0147:
            int r2 = r2 + 1
            goto L_0x009d
        L_0x014b:
            r14 = r31
            r1 = r30
            goto L_0x0106
        L_0x0150:
            r0 = 5
            if (r1 != r0) goto L_0x015f
            if (r20 == 0) goto L_0x00d1
        L_0x0155:
            int r1 = r19 - r21
            int r1 = r1 - r14
            r0 = 0
            int r15 = java.lang.Math.max(r0, r1)
            goto L_0x00d8
        L_0x015f:
            r15 = 0
            goto L_0x00d8
        L_0x0162:
            if (r0 == 0) goto L_0x0171
            X.2vJ r0 = r3.A01
            if (r0 == 0) goto L_0x0171
            android.view.ViewTreeObserver r1 = r3.getViewTreeObserver()
            X.2vJ r0 = r3.A01
            r1.removeOnPreDrawListener(r0)
        L_0x0171:
            r0 = 0
            goto L_0x004a
        L_0x0174:
            int r1 = r1 + 1
            goto L_0x001a
        L_0x0178:
            int r6 = r6 + 1
            goto L_0x000b
        L_0x017c:
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1 = r1 & r4
            r0 = r31
            int r2 = android.view.View.resolveSizeAndState(r8, r0, r1)
            int r1 = r4 << 16
            r0 = r30
            int r0 = android.view.View.resolveSizeAndState(r6, r0, r1)
            r3.setMeasuredDimension(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof BL2)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        BL2 bl2 = (BL2) parcelable;
        super.onRestoreInstanceState(bl2.A00);
        SparseArray sparseArray = bl2.A00;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            C41501wV r1 = A02(childAt).A0A;
            if (!(id == -1 || r1 == null || (parcelable2 = (Parcelable) sparseArray.get(id)) == null)) {
                r1.A0F(parcelable2);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [X.1Xj, android.os.Parcelable, X.BL2] */
    public Parcelable onSaveInstanceState() {
        Parcelable A0D2;
        Parcelable.Creator creator = BL2.CREATOR;
        ? r7 = new C27741Xj(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            C41501wV r1 = ((C37891qK) childAt.getLayoutParams()).A0A;
            if (!(id == -1 || r1 == null || (A0D2 = r1.A0D(childAt)) == null)) {
                sparseArray.append(id, A0D2);
            }
        }
        r7.A00 = sparseArray;
        return r7;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.A06;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.A06 = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.A06.setState(getDrawableState());
                }
                C27831Xu.A0G(getLayoutDirection(), this.A06);
                Drawable drawable4 = this.A06;
                boolean z = false;
                if (getVisibility() == 0) {
                    z = true;
                }
                drawable4.setVisible(z, false);
                this.A06.setCallback(this);
            }
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public void setStatusBarBackgroundResource(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = C24261Jm.A00(getContext(), i);
        } else {
            drawable = null;
        }
        setStatusBarBackground(drawable);
    }

    public static C37891qK A02(View view) {
        C37891qK r5 = (C37891qK) view.getLayoutParams();
        if (!r5.A0B) {
            if (view instanceof AnonymousClass1YO) {
                r5.A00(((AnonymousClass1YO) view).getBehavior());
            } else {
                Class cls = view.getClass();
                while (true) {
                    if (cls == null) {
                        break;
                    }
                    DefaultBehavior defaultBehavior = (DefaultBehavior) cls.getAnnotation(DefaultBehavior.class);
                    if (defaultBehavior == null) {
                        cls = cls.getSuperclass();
                    } else {
                        try {
                            r5.A00((C41501wV) defaultBehavior.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                            break;
                        } catch (Exception e) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Default behavior class ");
                            sb.append(defaultBehavior.value().getName());
                            sb.append(" could not be instantiated. Did you forget a default constructor?");
                            Log.e("CoordinatorLayout", sb.toString(), e);
                        }
                    }
                }
            }
            r5.A0B = true;
        }
        return r5;
    }

    private void A04() {
        if (getFitsSystemWindows()) {
            AnonymousClass1HE r1 = this.A09;
            if (r1 == null) {
                r1 = new D6T(this, 0);
                this.A09 = r1;
            }
            AnonymousClass1HF.A0h(this, r1);
            setSystemUiVisibility(VoipLiteCamera.DEFAULT_SUPERNOVA_WIDTH);
            return;
        }
        AnonymousClass1HF.A0h(this, (AnonymousClass1HE) null);
    }

    public static void A05(Rect rect) {
        rect.setEmpty();
        A0N.CEF(rect);
    }

    private void A07(Rect rect, C37891qK r7, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + r7.leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - r7.rightMargin));
        int max2 = Math.max(getPaddingTop() + r7.topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - r7.bottomMargin));
        rect.set(max, max2, i + max, i2 + max2);
    }

    public static void A08(View view, int i) {
        C37891qK r1 = (C37891qK) view.getLayoutParams();
        int i2 = r1.A06;
        if (i2 != i) {
            AnonymousClass1HF.A0Z(view, i - i2);
            r1.A06 = i;
        }
    }

    public static void A09(View view, int i) {
        C37891qK r1 = (C37891qK) view.getLayoutParams();
        int i2 = r1.A07;
        if (i2 != i) {
            AnonymousClass1HF.A0a(view, i - i2);
            r1.A07 = i;
        }
    }

    private void A0A(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C41501wV r1 = ((C37891qK) childAt.getLayoutParams()).A0A;
            if (r1 != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z) {
                    r1.A0K(obtain, childAt, this);
                } else {
                    r1.A0L(obtain, childAt, this);
                }
                obtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            getChildAt(i2).getLayoutParams();
        }
        this.A07 = null;
        this.A0A = false;
    }

    public void A0F(View view, int i) {
        C37891qK r2 = (C37891qK) view.getLayoutParams();
        View view2 = r2.A09;
        int i2 = i;
        if (view2 != null) {
            Rect A012 = A01();
            Rect A013 = A01();
            try {
                C62932sE.A01(A012, view2, this);
                C37891qK r8 = (C37891qK) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                A06(A012, A013, r8, i2, measuredWidth, measuredHeight);
                A07(A013, r8, measuredWidth, measuredHeight);
                view.layout(A013.left, A013.top, A013.right, A013.bottom);
            } finally {
                A05(A012);
                A05(A013);
            }
        } else if (r2.A05 != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        } else {
            int i3 = r2.A04;
            if (i3 >= 0) {
                C37891qK r6 = (C37891qK) view.getLayoutParams();
                int i4 = r6.A02;
                if (i4 == 0) {
                    i4 = 8388661;
                }
                int absoluteGravity = Gravity.getAbsoluteGravity(i4, i);
                int i5 = absoluteGravity & 7;
                int i6 = absoluteGravity & 112;
                int width = getWidth();
                int height = getHeight();
                int measuredWidth2 = view.getMeasuredWidth();
                int measuredHeight2 = view.getMeasuredHeight();
                if (i == 1) {
                    i3 = width - i3;
                }
                int A002 = A00(i3) - measuredWidth2;
                if (i5 == 1) {
                    A002 += measuredWidth2 / 2;
                } else if (i5 == 5) {
                    A002 += measuredWidth2;
                }
                int i7 = 0;
                if (i6 == 16) {
                    i7 = 0 + (measuredHeight2 / 2);
                } else if (i6 == 80) {
                    i7 = measuredHeight2;
                }
                int max = Math.max(getPaddingLeft() + r6.leftMargin, Math.min(A002, ((width - getPaddingRight()) - measuredWidth2) - r6.rightMargin));
                int max2 = Math.max(getPaddingTop() + r6.topMargin, Math.min(i7, ((height - getPaddingBottom()) - measuredHeight2) - r6.bottomMargin));
                view.layout(max, max2, measuredWidth2 + max, measuredHeight2 + max2);
                return;
            }
            C37891qK r22 = (C37891qK) view.getLayoutParams();
            Rect A014 = A01();
            A014.set(getPaddingLeft() + r22.leftMargin, getPaddingTop() + r22.topMargin, (getWidth() - getPaddingRight()) - r22.rightMargin, (getHeight() - getPaddingBottom()) - r22.bottomMargin);
            if (this.A02 != null && getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                A014.left += this.A02.A03();
                A014.top += this.A02.A05();
                A014.right -= this.A02.A04();
                A014.bottom -= this.A02.A02();
            }
            Rect A015 = A01();
            int i8 = r22.A02;
            if ((i8 & 7) == 0) {
                i8 |= 8388611;
            }
            if ((i8 & 112) == 0) {
                i8 |= 48;
            }
            Gravity.apply(i8, view.getMeasuredWidth(), view.getMeasuredHeight(), A014, A015, i2);
            view.layout(A015.left, A015.top, A015.right, A015.bottom);
            A05(A014);
            A05(A015);
        }
    }

    public boolean A0H(View view, int i, int i2) {
        Rect A012 = A01();
        C62932sE.A01(A012, view, this);
        try {
            return A012.contains(i, i2);
        } finally {
            A05(A012);
        }
    }

    public boolean drawChild(Canvas canvas, View view, long j) {
        view.getLayoutParams();
        return super.drawChild(canvas, view, j);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.A06;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidate();
        }
    }

    public final List getDependencySortedChildren() {
        A03();
        return Collections.unmodifiableList(this.A0F);
    }

    public final AnonymousClass1HO getLastWindowInsets() {
        return this.A02;
    }

    public Drawable getStatusBarBackground() {
        return this.A06;
    }

    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        A0A(false);
        if (this.A05) {
            if (this.A01 == null) {
                this.A01 = new C64772vJ(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.A01);
        }
        if (this.A02 == null && getFitsSystemWindows()) {
            AnonymousClass1HF.A0U(this);
        }
        this.A04 = true;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        A0A(false);
        if (this.A05 && this.A01 != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.A01);
        }
        View view = this.A08;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.A04 = false;
    }

    public void onDraw(Canvas canvas) {
        AnonymousClass1HO r0;
        int A052;
        super.onDraw(canvas);
        if (this.A03 && this.A06 != null && (r0 = this.A02) != null && (A052 = r0.A05()) > 0) {
            this.A06.setBounds(0, 0, getWidth(), A052);
            this.A06.draw(canvas);
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            A0A(true);
        }
        boolean A0B2 = A0B(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            A0A(true);
        }
        return A0B2;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C41501wV r0;
        int layoutDirection = getLayoutDirection();
        List list = this.A0F;
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = (View) list.get(i5);
            if (view.getVisibility() != 8 && ((r0 = ((C37891qK) view.getLayoutParams()).A0A) == null || !r0.A0O(view, this, layoutDirection))) {
                A0F(view, layoutDirection);
            }
        }
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                childAt.getLayoutParams();
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r4 != false) goto L_0x0010;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r13) {
        /*
            r12 = this;
            int r2 = r13.getActionMasked()
            android.view.View r0 = r12.A07
            r3 = 1
            r11 = 0
            if (r0 != 0) goto L_0x004d
            boolean r4 = r12.A0B(r13, r3)
            if (r4 == 0) goto L_0x004b
        L_0x0010:
            android.view.View r0 = r12.A07
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            X.1qK r0 = (X.C37891qK) r0
            X.1wV r1 = r0.A0A
            if (r1 == 0) goto L_0x004b
            android.view.View r0 = r12.A07
            boolean r1 = r1.A0L(r13, r0, r12)
        L_0x0022:
            android.view.View r0 = r12.A07
            if (r0 != 0) goto L_0x0034
            boolean r0 = super.onTouchEvent(r13)
            r1 = r1 | r0
        L_0x002b:
            if (r2 == r3) goto L_0x0030
            r0 = 3
            if (r2 != r0) goto L_0x0033
        L_0x0030:
            r12.A0A(r11)
        L_0x0033:
            return r1
        L_0x0034:
            if (r4 == 0) goto L_0x002b
            long r4 = android.os.SystemClock.uptimeMillis()
            r9 = 0
            r8 = 3
            r6 = r4
            r10 = r9
            android.view.MotionEvent r0 = android.view.MotionEvent.obtain(r4, r6, r8, r9, r10, r11)
            super.onTouchEvent(r0)
            if (r0 == 0) goto L_0x002b
            r0.recycle()
            goto L_0x002b
        L_0x004b:
            r1 = 0
            goto L_0x0022
        L_0x004d:
            r4 = 0
            goto L_0x0010
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        C41501wV r0 = ((C37891qK) view.getLayoutParams()).A0A;
        if (r0 == null || !r0.A0A(rect, view, this, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z && !this.A0A) {
            A0A(false);
            this.A0A = true;
        }
    }

    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        A04();
    }

    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.A00 = onHierarchyChangeListener;
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = false;
        if (i == 0) {
            z = true;
        }
        Drawable drawable = this.A06;
        if (drawable != null && drawable.isVisible() != z) {
            this.A06.setVisible(z, false);
        }
    }

    public boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable) || drawable == this.A06) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [java.lang.Object, X.1qG] */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public CoordinatorLayout(android.content.Context r18, android.util.AttributeSet r19, int r20) {
        /*
            r17 = this;
            r4 = r17
            r5 = r18
            r7 = r19
            r2 = r20
            r4.<init>(r5, r7, r2)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r4.A0F = r0
            X.1qF r0 = new X.1qF
            r0.<init>()
            r4.A0C = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r4.A0G = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r4.A0D = r0
            r1 = 2
            int[] r0 = new int[r1]
            r4.A0H = r0
            int[] r0 = new int[r1]
            r4.A0I = r0
            X.1qG r0 = new X.1qG
            r0.<init>()
            r4.A0E = r0
            r9 = 0
            int[] r6 = X.C37871qH.A00
            if (r20 != 0) goto L_0x0082
            r0 = 2132084849(0x7f150871, float:1.980988E38)
            android.content.res.TypedArray r8 = r5.obtainStyledAttributes(r7, r6, r9, r0)
        L_0x0043:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r1 < r0) goto L_0x0051
            if (r20 != 0) goto L_0x0076
            r10 = 2132084849(0x7f150871, float:1.980988E38)
            r4.saveAttributeDataForStyleable(r5, r6, r7, r8, r9, r10)
        L_0x0051:
            int r0 = r8.getResourceId(r9, r9)
            if (r0 == 0) goto L_0x0087
            android.content.res.Resources r1 = r5.getResources()
            int[] r0 = r1.getIntArray(r0)
            r4.A0B = r0
            android.util.DisplayMetrics r0 = r1.getDisplayMetrics()
            float r3 = r0.density
            int[] r2 = r4.A0B
            int r1 = r2.length
        L_0x006a:
            if (r9 >= r1) goto L_0x0087
            r0 = r2[r9]
            float r0 = (float) r0
            float r0 = r0 * r3
            int r0 = (int) r0
            r2[r9] = r0
            int r9 = r9 + 1
            goto L_0x006a
        L_0x0076:
            r10 = r4
            r11 = r5
            r12 = r6
            r13 = r7
            r14 = r8
            r15 = r2
            r16 = r9
            r10.saveAttributeDataForStyleable(r11, r12, r13, r14, r15, r16)
            goto L_0x0051
        L_0x0082:
            android.content.res.TypedArray r8 = r5.obtainStyledAttributes(r7, r6, r2, r9)
            goto L_0x0043
        L_0x0087:
            r0 = 1
            android.graphics.drawable.Drawable r0 = r8.getDrawable(r0)
            r4.A06 = r0
            r8.recycle()
            r4.A04()
            X.1qI r0 = new X.1qI
            r0.<init>(r4)
            super.setOnHierarchyChangeListener(r0)
            int r0 = r4.getImportantForAccessibility()
            if (r0 != 0) goto L_0x00a6
            r0 = 1
            r4.setImportantForAccessibility(r0)
        L_0x00a6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C37891qK(getContext(), attributeSet);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130969271);
    }
}
