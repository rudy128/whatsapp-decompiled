package com.google.android.material.bottomsheet;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass1HF;
import X.AnonymousClass1Xr;
import X.AnonymousClass1YT;
import X.AnonymousClass3MW;
import X.BE9;
import X.BL5;
import X.BLB;
import X.C108945cZ;
import X.C17880vN;
import X.C18070vi;
import X.C24495C6n;
import X.C25071CWe;
import X.C26137Ct0;
import X.C26281Cwc;
import X.C26323Cxg;
import X.C27781Xn;
import X.C27801Xq;
import X.C28011Ym;
import X.C37891qK;
import X.C41501wV;
import X.C6X;
import X.C72453Mb;
import X.D6Z;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.whatsapp.bottomsheet.LockableBottomSheetBehavior;
import com.whatsapp.calling.callrating.util.NonDraggableBottomSheetBehaviour;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BottomSheetBehavior extends C41501wV {
    public float A00 = -1.0f;
    public float A01 = 0.5f;
    public float A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C = -1;
    public int A0D = -1;
    public int A0E;
    public int A0F;
    public int A0G;
    public int A0H = 0;
    public int A0I;
    public int A0J = 4;
    public ValueAnimator A0K;
    public ColorStateList A0L;
    public VelocityTracker A0M;
    public C26281Cwc A0N;
    public C27801Xq A0O;
    public C28011Ym A0P;
    public WeakReference A0Q;
    public WeakReference A0R;
    public WeakReference A0S;
    public Map A0T;
    public boolean A0U = true;
    public boolean A0V = true;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public boolean A0d;
    public boolean A0e;
    public boolean A0f;
    public boolean A0g;
    public boolean A0h;
    public boolean A0i;
    public float A0j = 0.1f;
    public int A0k;
    public int A0l;
    public int A0m;
    public int A0n;
    public boolean A0o;
    public boolean A0p;
    public boolean A0q;
    public final SparseIntArray A0r = new SparseIntArray();
    public final ArrayList A0s = AnonymousClass000.A13();
    public final C24495C6n A0t = new BLB(this, 0);
    public final C25071CWe A0u = new C25071CWe(this);

    private void A04(int i, boolean z) {
        boolean z2;
        C27801Xq r5;
        ValueAnimator valueAnimator;
        if (i != 2) {
            if (this.A0J != 3 || (!this.A0g && A0Q() != 0)) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (this.A0o != z2 && (r5 = this.A0O) != null) {
                this.A0o = z2;
                float f = 0.0f;
                if (!z || (valueAnimator = this.A0K) == null) {
                    ValueAnimator valueAnimator2 = this.A0K;
                    if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                        valueAnimator2.cancel();
                    }
                    if (!this.A0o) {
                        f = 1.0f;
                    }
                    r5.A0D(f);
                } else if (valueAnimator.isRunning()) {
                    valueAnimator.reverse();
                } else {
                    if (!z2) {
                        f = 1.0f;
                    }
                    valueAnimator.setFloatValues(new float[]{1.0f - f, f});
                    valueAnimator.start();
                }
            }
        }
    }

    public static void A06(View view, BottomSheetBehavior bottomSheetBehavior, int i) {
        C26137Ct0 ct0;
        int i2;
        View view2 = view;
        if (view != null) {
            int i3 = i;
            BottomSheetBehavior bottomSheetBehavior2 = bottomSheetBehavior;
            A05(view, bottomSheetBehavior2, i3);
            int i4 = 6;
            if (!bottomSheetBehavior2.A0V && bottomSheetBehavior2.A0J != 6) {
                SparseIntArray sparseIntArray = bottomSheetBehavior2.A0r;
                String string = view.getResources().getString(2131898745);
                D6Z d6z = new D6Z(bottomSheetBehavior2, 6, 0);
                ArrayList A0I2 = AnonymousClass1HF.A0I(view);
                int i5 = 0;
                while (true) {
                    if (i5 >= A0I2.size()) {
                        int i6 = 0;
                        i2 = -1;
                        while (true) {
                            int[] iArr = AnonymousClass1HF.A08;
                            if (i6 >= 32 || i2 != -1) {
                                break;
                            }
                            int i7 = iArr[i6];
                            boolean z = true;
                            for (int i8 = 0; i8 < A0I2.size(); i8++) {
                                z &= AnonymousClass000.A1S(((AccessibilityNodeInfo.AccessibilityAction) ((C26137Ct0) A0I2.get(i8)).A03).getId(), i7);
                            }
                            if (z) {
                                i2 = i7;
                            }
                            i6++;
                        }
                    } else if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((C26137Ct0) A0I2.get(i5)).A03).getLabel())) {
                        i2 = ((AccessibilityNodeInfo.AccessibilityAction) ((C26137Ct0) A0I2.get(i5)).A03).getId();
                        break;
                    } else {
                        i5++;
                    }
                }
                if (i2 != -1) {
                    AnonymousClass1HF.A0l(view2, new C26137Ct0(d6z, string, (Class) null, (Object) null, i2));
                }
                sparseIntArray.put(i3, i2);
            }
            if (bottomSheetBehavior2.A0X && bottomSheetBehavior2.A0J != 5) {
                AnonymousClass1HF.A0m(view2, C26137Ct0.A0D, new D6Z(bottomSheetBehavior2, 5, 0), (CharSequence) null);
            }
            int i9 = bottomSheetBehavior2.A0J;
            if (i9 == 3) {
                if (bottomSheetBehavior2.A0V) {
                    i4 = 4;
                }
                ct0 = C26137Ct0.A09;
            } else if (i9 == 4) {
                if (bottomSheetBehavior2.A0V) {
                    i4 = 3;
                }
                ct0 = C26137Ct0.A0H;
            } else if (i9 == 6) {
                AnonymousClass1HF.A0m(view2, C26137Ct0.A09, new D6Z(bottomSheetBehavior2, 4, 0), (CharSequence) null);
                AnonymousClass1HF.A0m(view2, C26137Ct0.A0H, new D6Z(bottomSheetBehavior2, 3, 0), (CharSequence) null);
                return;
            } else {
                return;
            }
            AnonymousClass1HF.A0m(view2, ct0, new D6Z(bottomSheetBehavior2, i4, 0), (CharSequence) null);
        }
    }

    public static void A07(View view, BottomSheetBehavior bottomSheetBehavior, int i, boolean z) {
        int A0Q2;
        boolean A0J2;
        if (i == 3) {
            A0Q2 = bottomSheetBehavior.A0Q();
        } else if (i == 4) {
            A0Q2 = bottomSheetBehavior.A04;
        } else if (i == 5) {
            A0Q2 = bottomSheetBehavior.A0E;
        } else if (i == 6) {
            A0Q2 = bottomSheetBehavior.A08;
        } else {
            throw AnonymousClass001.A13("Invalid state to get top offset: ", AnonymousClass000.A10(), i);
        }
        C26281Cwc cwc = bottomSheetBehavior.A0N;
        if (cwc != null) {
            int left = view.getLeft();
            if (z) {
                A0J2 = cwc.A0G(left, A0Q2);
            } else {
                A0J2 = cwc.A0J(view, left, A0Q2);
            }
            if (A0J2) {
                bottomSheetBehavior.A0X(2);
                bottomSheetBehavior.A04(i, true);
                bottomSheetBehavior.A0u.A00(i);
                return;
            }
        }
        bottomSheetBehavior.A0X(i);
    }

    public void A0E() {
        this.A0S = null;
        this.A0N = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0H(android.view.View r6, android.view.View r7, androidx.coordinatorlayout.widget.CoordinatorLayout r8, int[] r9, int r10, int r11, int r12) {
        /*
            r5 = this;
            r2 = 1
            if (r12 == r2) goto L_0x0031
            java.lang.ref.WeakReference r0 = r5.A0R
            if (r0 == 0) goto L_0x005a
            java.lang.Object r0 = r0.get()
        L_0x000b:
            if (r7 != r0) goto L_0x0031
            int r4 = r6.getTop()
            int r3 = r4 - r11
            if (r11 <= 0) goto L_0x0032
            int r0 = r5.A0Q()
            if (r3 >= r0) goto L_0x004c
            int r4 = r4 - r0
            r9[r2] = r4
            int r0 = -r4
            X.AnonymousClass1HF.A0a(r6, r0)
            r0 = 3
        L_0x0023:
            r5.A0X(r0)
        L_0x0026:
            int r0 = r6.getTop()
            r5.A0U(r0)
            r5.A0B = r11
            r5.A0b = r2
        L_0x0031:
            return
        L_0x0032:
            if (r11 >= 0) goto L_0x0026
            r0 = -1
            boolean r0 = r7.canScrollVertically(r0)
            if (r0 != 0) goto L_0x0026
            int r1 = r5.A04
            if (r3 <= r1) goto L_0x004c
            boolean r0 = r5.A0X
            if (r0 != 0) goto L_0x004c
            int r4 = r4 - r1
            r9[r2] = r4
            int r0 = -r4
            X.AnonymousClass1HF.A0a(r6, r0)
            r0 = 4
            goto L_0x0023
        L_0x004c:
            boolean r0 = r5.A0U
            if (r0 == 0) goto L_0x0031
            r9[r2] = r11
            int r0 = -r11
            X.AnonymousClass1HF.A0a(r6, r0)
            r5.A0X(r2)
            goto L_0x0026
        L_0x005a:
            r0 = 0
            goto L_0x000b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.A0H(android.view.View, android.view.View, androidx.coordinatorlayout.widget.CoordinatorLayout, int[], int, int, int):void");
    }

    public void A0I(View view, CoordinatorLayout coordinatorLayout, int[] iArr, int i, int i2, int i3) {
    }

    public void A0J(C37891qK r2) {
        this.A0S = null;
        this.A0N = null;
    }

    public boolean A0N(View view, View view2, CoordinatorLayout coordinatorLayout, float f, float f2) {
        WeakReference weakReference = this.A0R;
        return (weakReference == null || view2 != weakReference.get() || this.A0J == 3) ? false : true;
    }

    public void A0T(float f) {
        if (f <= 0.0f || f >= 1.0f) {
            throw AnonymousClass000.A0k("ratio must be a float value between 0 and 1");
        }
        this.A01 = f;
        if (this.A0S != null) {
            this.A08 = (int) (((float) this.A0E) * (1.0f - f));
        }
    }

    public void A0V(int i) {
        A0Y(i, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0029, code lost:
        if (r4.A08 > r4.A06) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0W(int r5) {
        /*
            r4 = this;
            r2 = 1
            if (r5 == r2) goto L_0x005f
            r0 = 2
            if (r5 == r0) goto L_0x005f
            boolean r0 = r4.A0X
            if (r0 != 0) goto L_0x001d
            r0 = 5
            if (r5 != r0) goto L_0x001d
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Cannot set state: "
            java.lang.String r1 = X.AnonymousClass001.A1I(r0, r1, r5)
            java.lang.String r0 = "BottomSheetBehavior"
            android.util.Log.w(r0, r1)
            return
        L_0x001d:
            r0 = 6
            if (r5 != r0) goto L_0x002b
            boolean r0 = r4.A0V
            if (r0 == 0) goto L_0x002b
            int r1 = r4.A08
            int r0 = r4.A06
            r3 = 3
            if (r1 <= r0) goto L_0x002c
        L_0x002b:
            r3 = r5
        L_0x002c:
            java.lang.ref.WeakReference r1 = r4.A0S
            if (r1 == 0) goto L_0x005b
            java.lang.Object r0 = r1.get()
            if (r0 == 0) goto L_0x005b
            android.view.View r2 = X.C108945cZ.A0O(r1)
            r0 = 8
            X.Akb r1 = new X.Akb
            r1.<init>((java.lang.Object) r4, (int) r3, (int) r0, (java.lang.Object) r2)
            android.view.ViewParent r0 = r2.getParent()
            if (r0 == 0) goto L_0x0057
            boolean r0 = r0.isLayoutRequested()
            if (r0 == 0) goto L_0x0057
            boolean r0 = r2.isAttachedToWindow()
            if (r0 == 0) goto L_0x0057
            r2.post(r1)
            return
        L_0x0057:
            r1.run()
            return
        L_0x005b:
            r4.A0X(r5)
            return
        L_0x005f:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "STATE_"
            r1.append(r0)
            if (r5 != r2) goto L_0x0076
            java.lang.String r0 = "DRAGGING"
        L_0x006c:
            r1.append(r0)
            java.lang.String r0 = " should not be set externally."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A12(r0, r1)
            throw r0
        L_0x0076:
            java.lang.String r0 = "SETTLING"
            goto L_0x006c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.A0W(int):void");
    }

    public final void A0Y(int i, boolean z) {
        View A0O2;
        boolean z2 = this.A0f;
        if (i == -1) {
            if (!z2) {
                this.A0f = true;
            } else {
                return;
            }
        } else if (z2 || this.A0G != i) {
            this.A0f = false;
            this.A0G = Math.max(0, i);
        } else {
            return;
        }
        WeakReference weakReference = this.A0S;
        if (weakReference != null) {
            A08(this);
            if (this.A0J == 4 && (A0O2 = C108945cZ.A0O(weakReference)) != null) {
                if (z) {
                    A0W(4);
                } else {
                    A0O2.requestLayout();
                }
            }
        }
    }

    private int A00() {
        int i;
        int i2;
        if (this.A0f) {
            i = Math.min(Math.max(this.A0n, this.A0E - ((this.A0F * 9) / 16)), this.A0k);
        } else if (!this.A0W && !this.A0c && (i2 = this.A07) > 0) {
            return Math.max(this.A0G, i2 + this.A0m);
        } else {
            i = this.A0G;
        }
        return i + this.A09;
    }

    private void A03() {
        WeakReference weakReference = this.A0S;
        if (weakReference != null) {
            A06(C108945cZ.A0O(weakReference), this, 0);
        }
        WeakReference weakReference2 = this.A0Q;
        if (weakReference2 != null) {
            A06(C108945cZ.A0O(weakReference2), this, 1);
        }
    }

    public static void A05(View view, BottomSheetBehavior bottomSheetBehavior, int i) {
        if (view != null) {
            AnonymousClass1HF.A0b(view, 524288);
            AnonymousClass1HF.A0b(view, 262144);
            AnonymousClass1HF.A0b(view, 1048576);
            SparseIntArray sparseIntArray = bottomSheetBehavior.A0r;
            int i2 = sparseIntArray.get(i, -1);
            if (i2 != -1) {
                AnonymousClass1HF.A0b(view, i2);
                sparseIntArray.delete(i);
            }
        }
    }

    public Parcelable A0D(View view) {
        return new BL5((Parcelable) AbsSavedState.EMPTY_STATE, this);
    }

    public void A0F(Parcelable parcelable) {
        BL5 bl5 = (BL5) parcelable;
        int i = this.A0H;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.A0G = bl5.A00;
            }
            if (i == -1 || (i & 2) == 2) {
                this.A0V = bl5.A01;
            }
            if (i == -1 || (i & 4) == 4) {
                this.A0X = bl5.A02;
            }
            if (i == -1 || (i & 8) == 8) {
                this.A0h = bl5.A03;
            }
        }
        int i2 = bl5.A04;
        if (i2 == 1 || i2 == 2) {
            this.A0J = 4;
        } else {
            this.A0J = i2;
        }
    }

    public boolean A0M(View view, View view2, View view3, CoordinatorLayout coordinatorLayout, int i, int i2) {
        boolean z;
        if (this instanceof LockableBottomSheetBehavior) {
            LockableBottomSheetBehavior lockableBottomSheetBehavior = (LockableBottomSheetBehavior) this;
            if (lockableBottomSheetBehavior instanceof NonDraggableBottomSheetBehaviour) {
                C18070vi.A0o(view, view2, view3);
                if (lockableBottomSheetBehavior.A00) {
                    lockableBottomSheetBehavior.A0B = 0;
                    lockableBottomSheetBehavior.A0b = false;
                    if ((i & 2) == 0) {
                        return false;
                    }
                    return true;
                }
            } else if (lockableBottomSheetBehavior.A00) {
                z = false;
                lockableBottomSheetBehavior.A0B = 0;
                lockableBottomSheetBehavior.A0b = false;
            }
            return false;
        }
        z = false;
        this.A0B = 0;
        this.A0b = false;
        if ((i & 2) != 0) {
            return true;
        }
        return z;
    }

    public int A0Q() {
        int i;
        if (this.A0V) {
            return this.A06;
        }
        int i2 = this.A05;
        if (this.A0q) {
            i = 0;
        } else {
            i = this.A0A;
        }
        return Math.max(i2, i);
    }

    public int A0R() {
        if (this.A0f) {
            return -1;
        }
        return this.A0G;
    }

    public void A0U(int i) {
        float f;
        float f2;
        int A0Q2;
        View A0O2 = C108945cZ.A0O(this.A0S);
        if (A0O2 != null) {
            ArrayList arrayList = this.A0s;
            if (!arrayList.isEmpty()) {
                int i2 = this.A04;
                if (i > i2 || i2 == (A0Q2 = A0Q())) {
                    f = (float) (i2 - i);
                    f2 = (float) (this.A0E - i2);
                } else {
                    f = (float) (i2 - i);
                    f2 = (float) (i2 - A0Q2);
                }
                float f3 = f / f2;
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    ((C6X) arrayList.get(i3)).A02(A0O2, f3);
                }
            }
        }
    }

    public void A0X(int i) {
        View A0O2;
        WeakReference weakReference;
        if (this.A0J != i) {
            this.A0J = i;
            WeakReference weakReference2 = this.A0S;
            if (weakReference2 != null && (A0O2 = C108945cZ.A0O(weakReference2)) != null) {
                int i2 = 0;
                if (i == 3) {
                    WeakReference weakReference3 = this.A0S;
                    if (weakReference3 != null) {
                        ViewParent parent = C108945cZ.A0O(weakReference3).getParent();
                        if (parent instanceof CoordinatorLayout) {
                            ViewGroup viewGroup = (ViewGroup) parent;
                            int childCount = viewGroup.getChildCount();
                            if (this.A0T == null) {
                                this.A0T = new HashMap(childCount);
                                for (int i3 = 0; i3 < childCount; i3++) {
                                    View childAt = viewGroup.getChildAt(i3);
                                    if (childAt != this.A0S.get()) {
                                        C17880vN.A1P(childAt, this.A0T, childAt.getImportantForAccessibility());
                                    }
                                }
                            }
                        }
                    }
                } else if ((i == 6 || i == 5 || i == 4) && (weakReference = this.A0S) != null) {
                    ViewParent parent2 = C108945cZ.A0O(weakReference).getParent();
                    if (parent2 instanceof CoordinatorLayout) {
                        ViewGroup viewGroup2 = (ViewGroup) parent2;
                        int childCount2 = viewGroup2.getChildCount();
                        for (int i4 = 0; i4 < childCount2; i4++) {
                            viewGroup2.getChildAt(i4);
                            this.A0S.get();
                        }
                        this.A0T = null;
                    }
                }
                A04(i, true);
                while (true) {
                    ArrayList arrayList = this.A0s;
                    if (i2 < arrayList.size()) {
                        ((C6X) arrayList.get(i2)).A03(A0O2, i);
                        i2++;
                    } else {
                        A03();
                        return;
                    }
                }
            }
        }
    }

    public void A0Z(C6X c6x) {
        ArrayList arrayList = this.A0s;
        if (!arrayList.contains(c6x)) {
            arrayList.add(c6x);
        }
    }

    @Deprecated
    public void A0a(C6X c6x) {
        Log.w("BottomSheetBehavior", "BottomSheetBehavior now supports multiple callbacks. `setBottomSheetCallback()` removes all existing callbacks, including ones set internally by library authors, which may result in unintended behavior. This may change in the future. Please use `addBottomSheetCallback()` and `removeBottomSheetCallback()` instead to set your own callbacks.");
        ArrayList arrayList = this.A0s;
        arrayList.clear();
        if (c6x != null) {
            arrayList.add(c6x);
        }
    }

    public void A0b(boolean z) {
        if (this instanceof LockableBottomSheetBehavior) {
            ((LockableBottomSheetBehavior) this).A00 = z;
        } else {
            this.A0U = z;
        }
    }

    public void A0c(boolean z) {
        int i;
        if (this.A0V != z) {
            this.A0V = z;
            if (this.A0S != null) {
                A08(this);
            }
            if (!z || this.A0J != 6) {
                i = this.A0J;
            } else {
                i = 3;
            }
            A0X(i);
            A04(this.A0J, true);
            A03();
        }
    }

    public void A0d(boolean z) {
        if (this.A0X != z) {
            this.A0X = z;
            if (!z && this.A0J == 5) {
                A0W(4);
            }
            A03();
        }
    }

    public boolean A0e(View view, float f) {
        if (this.A0h) {
            return true;
        }
        if (view.getTop() < this.A04) {
            return false;
        }
        if (C108945cZ.A00(((float) view.getTop()) + (f * this.A0j), (float) this.A04) / ((float) A00()) <= 0.5f) {
            return false;
        }
        return true;
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int dimensionPixelOffset;
        this.A0m = context.getResources().getDimensionPixelSize(2131167880);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C27781Xn.A05);
        if (obtainStyledAttributes.hasValue(3)) {
            this.A0L = AnonymousClass1YT.A01(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(21)) {
            this.A0P = new C28011Ym(C28011Ym.A01(context, attributeSet, 2130968836, 2132084542));
        }
        C28011Ym r1 = this.A0P;
        if (r1 != null) {
            C27801Xq r0 = new C27801Xq(r1);
            this.A0O = r0;
            r0.A0E(context);
            ColorStateList colorStateList = this.A0L;
            if (colorStateList != null) {
                this.A0O.A0F(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(16842801, typedValue, true);
                this.A0O.setTint(typedValue.data);
            }
        }
        float[] A1V = C108945cZ.A1V();
        // fill-array-data instruction
        A1V[0] = 0;
        A1V[1] = 1065353216;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(A1V);
        this.A0K = ofFloat;
        ofFloat.setDuration(500);
        C26323Cxg.A00(this.A0K, this, 7);
        this.A00 = obtainStyledAttributes.getDimension(2, -1.0f);
        if (obtainStyledAttributes.hasValue(0)) {
            this.A0D = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (obtainStyledAttributes.hasValue(1)) {
            this.A0C = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(9);
        if (peekValue == null || peekValue.data != -1) {
            A0Y(obtainStyledAttributes.getDimensionPixelSize(9, -1), false);
        } else {
            A0Y(-1, false);
        }
        A0d(obtainStyledAttributes.getBoolean(8, false));
        this.A0W = obtainStyledAttributes.getBoolean(13, false);
        A0c(obtainStyledAttributes.getBoolean(6, true));
        this.A0h = obtainStyledAttributes.getBoolean(12, false);
        A0b(obtainStyledAttributes.getBoolean(4, true));
        this.A0H = obtainStyledAttributes.getInt(10, 0);
        A0T(obtainStyledAttributes.getFloat(7, 0.5f));
        TypedValue peekValue2 = obtainStyledAttributes.peekValue(5);
        if (peekValue2 == null || peekValue2.type != 16) {
            dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(5, 0);
        } else {
            dimensionPixelOffset = peekValue2.data;
        }
        if (dimensionPixelOffset >= 0) {
            this.A05 = dimensionPixelOffset;
            A04(this.A0J, true);
            this.A0I = obtainStyledAttributes.getInt(11, 500);
            this.A0c = obtainStyledAttributes.getBoolean(17, false);
            this.A0d = obtainStyledAttributes.getBoolean(18, false);
            this.A0e = obtainStyledAttributes.getBoolean(19, false);
            this.A0q = obtainStyledAttributes.getBoolean(20, true);
            this.A0Y = obtainStyledAttributes.getBoolean(14, false);
            this.A0Z = obtainStyledAttributes.getBoolean(15, false);
            this.A0a = obtainStyledAttributes.getBoolean(16, false);
            this.A0g = obtainStyledAttributes.getBoolean(23, true);
            obtainStyledAttributes.recycle();
            this.A02 = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            return;
        }
        throw AnonymousClass000.A0k("offset must be greater than or equal to 0");
    }

    public static int A01(int i, int i2, int i3, int i4) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, i2, i4);
        if (i3 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i3), 1073741824);
        }
        if (size != 0) {
            i3 = Math.min(size, i3);
        }
        return View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
    }

    public static BottomSheetBehavior A02(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof C37891qK) {
            C41501wV r1 = ((C37891qK) layoutParams).A0A;
            if (r1 instanceof BottomSheetBehavior) {
                return (BottomSheetBehavior) r1;
            }
            throw AnonymousClass000.A0k("The view is not associated with BottomSheetBehavior");
        }
        throw AnonymousClass000.A0k("The view is not a child of CoordinatorLayout");
    }

    public static void A08(BottomSheetBehavior bottomSheetBehavior) {
        int A002 = bottomSheetBehavior.A00();
        boolean z = bottomSheetBehavior.A0V;
        int i = bottomSheetBehavior.A0E - A002;
        if (z) {
            bottomSheetBehavior.A04 = Math.max(i, bottomSheetBehavior.A06);
        } else {
            bottomSheetBehavior.A04 = i;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002b, code lost:
        if (r5.getTop() > r4.A08) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x006e, code lost:
        if (X.C108945cZ.A05(r2, r4.A06) < X.C108945cZ.A05(r2, r4.A04)) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x007b, code lost:
        if (r2 < X.C108945cZ.A05(r2, r4.A04)) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0092, code lost:
        if (X.C108945cZ.A05(r2, r0) < X.C108945cZ.A05(r2, r4.A04)) goto L_0x002d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0G(android.view.View r5, android.view.View r6, androidx.coordinatorlayout.widget.CoordinatorLayout r7, int r8) {
        /*
            r4 = this;
            int r1 = r5.getTop()
            int r0 = r4.A0Q()
            r3 = 3
            if (r1 != r0) goto L_0x000f
            r4.A0X(r3)
        L_0x000e:
            return
        L_0x000f:
            java.lang.ref.WeakReference r0 = r4.A0R
            if (r0 == 0) goto L_0x000e
            java.lang.Object r0 = r0.get()
            if (r6 != r0) goto L_0x000e
            boolean r0 = r4.A0b
            if (r0 == 0) goto L_0x000e
            int r0 = r4.A0B
            if (r0 <= 0) goto L_0x0035
            boolean r0 = r4.A0V
            if (r0 != 0) goto L_0x002e
            int r1 = r5.getTop()
            int r0 = r4.A08
            if (r1 <= r0) goto L_0x002e
        L_0x002d:
            r3 = 6
        L_0x002e:
            r0 = 0
            A07(r5, r4, r3, r0)
            r4.A0b = r0
            return
        L_0x0035:
            boolean r0 = r4.A0X
            if (r0 == 0) goto L_0x0056
            android.view.VelocityTracker r2 = r4.A0M
            if (r2 != 0) goto L_0x0046
            r0 = 0
        L_0x003e:
            boolean r0 = r4.A0e(r5, r0)
            if (r0 == 0) goto L_0x0056
            r3 = 5
            goto L_0x002e
        L_0x0046:
            r1 = 1000(0x3e8, float:1.401E-42)
            float r0 = r4.A02
            r2.computeCurrentVelocity(r1, r0)
            android.view.VelocityTracker r1 = r4.A0M
            int r0 = r4.A03
            float r0 = r1.getYVelocity(r0)
            goto L_0x003e
        L_0x0056:
            int r0 = r4.A0B
            if (r0 != 0) goto L_0x007e
            int r2 = r5.getTop()
            boolean r0 = r4.A0V
            if (r0 == 0) goto L_0x0071
            int r0 = r4.A06
            int r1 = X.C108945cZ.A05(r2, r0)
            int r0 = r4.A04
            int r0 = X.C108945cZ.A05(r2, r0)
            if (r1 >= r0) goto L_0x0095
            goto L_0x002e
        L_0x0071:
            int r0 = r4.A08
            if (r2 >= r0) goto L_0x0088
            int r0 = r4.A04
            int r0 = X.C108945cZ.A05(r2, r0)
            if (r2 >= r0) goto L_0x002d
            goto L_0x002e
        L_0x007e:
            boolean r0 = r4.A0V
            if (r0 != 0) goto L_0x0095
            int r2 = r5.getTop()
            int r0 = r4.A08
        L_0x0088:
            int r1 = X.C108945cZ.A05(r2, r0)
            int r0 = r4.A04
            int r0 = X.C108945cZ.A05(r2, r0)
            if (r1 >= r0) goto L_0x0095
            goto L_0x002d
        L_0x0095:
            r3 = 4
            goto L_0x002e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.A0G(android.view.View, android.view.View, androidx.coordinatorlayout.widget.CoordinatorLayout, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0087, code lost:
        if (r12.A0H(r11, r1, r9.A0l) != false) goto L_0x0089;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0K(android.view.MotionEvent r10, android.view.View r11, androidx.coordinatorlayout.widget.CoordinatorLayout r12) {
        /*
            r9 = this;
            boolean r0 = r11.isShown()
            r2 = 0
            r4 = 1
            if (r0 == 0) goto L_0x00c1
            boolean r0 = r9.A0U
            if (r0 == 0) goto L_0x00c1
            int r6 = r10.getActionMasked()
            if (r6 != 0) goto L_0x001f
            r0 = -1
            r9.A03 = r0
            android.view.VelocityTracker r0 = r9.A0M
            if (r0 == 0) goto L_0x001f
            r0.recycle()
            r0 = 0
            r9.A0M = r0
        L_0x001f:
            android.view.VelocityTracker r0 = r9.A0M
            if (r0 != 0) goto L_0x0029
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r9.A0M = r0
        L_0x0029:
            r0.addMovement(r10)
            r3 = 0
            r7 = -1
            r5 = 2
            if (r6 == 0) goto L_0x0050
            if (r6 == r4) goto L_0x0045
            r0 = 3
            if (r6 == r0) goto L_0x0045
        L_0x0036:
            boolean r0 = r9.A0p
            if (r0 != 0) goto L_0x008d
            X.Cwc r0 = r9.A0N
            if (r0 == 0) goto L_0x008d
            boolean r0 = r0.A0H(r10)
            if (r0 == 0) goto L_0x008d
            return r4
        L_0x0045:
            r9.A0i = r2
            r9.A03 = r7
            boolean r0 = r9.A0p
            if (r0 == 0) goto L_0x0036
            r9.A0p = r2
            return r2
        L_0x0050:
            float r0 = r10.getX()
            int r1 = (int) r0
            float r0 = r10.getY()
            int r8 = (int) r0
            r9.A0l = r8
            int r0 = r9.A0J
            if (r0 == r5) goto L_0x007c
            java.lang.ref.WeakReference r0 = r9.A0R
            if (r0 == 0) goto L_0x007c
            android.view.View r0 = X.C108945cZ.A0O(r0)
            if (r0 == 0) goto L_0x007c
            boolean r0 = r12.A0H(r0, r1, r8)
            if (r0 == 0) goto L_0x007c
            int r0 = r10.getActionIndex()
            int r0 = r10.getPointerId(r0)
            r9.A03 = r0
            r9.A0i = r4
        L_0x007c:
            int r0 = r9.A03
            if (r0 != r7) goto L_0x0089
            int r0 = r9.A0l
            boolean r1 = r12.A0H(r11, r1, r0)
            r0 = 1
            if (r1 == 0) goto L_0x008a
        L_0x0089:
            r0 = 0
        L_0x008a:
            r9.A0p = r0
            goto L_0x0036
        L_0x008d:
            java.lang.ref.WeakReference r0 = r9.A0R
            if (r0 == 0) goto L_0x0095
            android.view.View r3 = X.C108945cZ.A0O(r0)
        L_0x0095:
            if (r6 != r5) goto L_0x00c3
            if (r3 == 0) goto L_0x00c3
            boolean r0 = r9.A0p
            if (r0 != 0) goto L_0x00c3
            int r0 = r9.A0J
            if (r0 == r4) goto L_0x00c3
            boolean r0 = X.BEA.A1W(r10, r3, r12)
            if (r0 != 0) goto L_0x00c3
            X.Cwc r0 = r9.A0N
            if (r0 == 0) goto L_0x00c3
            int r0 = r9.A0l
            float r1 = (float) r0
            float r0 = r10.getY()
            float r1 = X.C108945cZ.A00(r1, r0)
            X.Cwc r0 = r9.A0N
            int r0 = r0.A05
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x00c3
            r2 = 1
            return r2
        L_0x00c1:
            r9.A0p = r4
        L_0x00c3:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.A0K(android.view.MotionEvent, android.view.View, androidx.coordinatorlayout.widget.CoordinatorLayout):boolean");
    }

    public boolean A0L(MotionEvent motionEvent, View view, CoordinatorLayout coordinatorLayout) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i = this.A0J;
        if (i == 1 && actionMasked == 0) {
            return true;
        }
        C26281Cwc cwc = this.A0N;
        if (cwc != null && (this.A0U || i == 1)) {
            cwc.A0D(motionEvent);
        }
        if (actionMasked == 0) {
            this.A03 = -1;
            VelocityTracker velocityTracker = this.A0M;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.A0M = null;
            }
        }
        VelocityTracker velocityTracker2 = this.A0M;
        if (velocityTracker2 == null) {
            velocityTracker2 = VelocityTracker.obtain();
            this.A0M = velocityTracker2;
        }
        velocityTracker2.addMovement(motionEvent);
        if (this.A0N != null && ((this.A0U || this.A0J == 1) && actionMasked == 2 && !this.A0p)) {
            float A002 = C108945cZ.A00((float) this.A0l, motionEvent.getY());
            C26281Cwc cwc2 = this.A0N;
            if (A002 > ((float) cwc2.A05)) {
                cwc2.A0E(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.A0p;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002e, code lost:
        if (r7.A0f != false) goto L_0x0030;
     */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00e0 A[LOOP:0: B:49:0x00d8->B:51:0x00e0, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0125 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0O(android.view.View r8, androidx.coordinatorlayout.widget.CoordinatorLayout r9, int r10) {
        /*
            r7 = this;
            boolean r0 = r9.getFitsSystemWindows()
            r2 = 1
            if (r0 == 0) goto L_0x0010
            boolean r0 = r8.getFitsSystemWindows()
            if (r0 != 0) goto L_0x0010
            r8.setFitsSystemWindows(r2)
        L_0x0010:
            java.lang.ref.WeakReference r0 = r7.A0S
            if (r0 != 0) goto L_0x0073
            android.content.res.Resources r1 = r9.getResources()
            r0 = 2131166414(0x7f0704ce, float:1.7947073E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r7.A0n = r0
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r1 < r0) goto L_0x0030
            boolean r0 = r7.A0W
            if (r0 != 0) goto L_0x0030
            boolean r0 = r7.A0f
            r1 = 1
            if (r0 == 0) goto L_0x0031
        L_0x0030:
            r1 = 0
        L_0x0031:
            boolean r0 = r7.A0c
            if (r0 != 0) goto L_0x011b
            boolean r0 = r7.A0d
            if (r0 != 0) goto L_0x011b
            boolean r0 = r7.A0e
            if (r0 != 0) goto L_0x011b
            boolean r0 = r7.A0Y
            if (r0 != 0) goto L_0x011b
            boolean r0 = r7.A0Z
            if (r0 != 0) goto L_0x011b
            boolean r0 = r7.A0a
            if (r0 != 0) goto L_0x011b
            if (r1 != 0) goto L_0x011b
        L_0x004b:
            java.lang.ref.WeakReference r0 = X.AnonymousClass3MW.A0z(r8)
            r7.A0S = r0
            X.1Xq r3 = r7.A0O
            if (r3 == 0) goto L_0x0112
            r8.setBackground(r3)
            float r1 = r7.A00
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0064
            float r1 = X.AnonymousClass1Xr.A00(r8)
        L_0x0064:
            r3.A0C(r1)
        L_0x0067:
            r7.A03()
            int r0 = r8.getImportantForAccessibility()
            if (r0 != 0) goto L_0x0073
            r8.setImportantForAccessibility(r2)
        L_0x0073:
            X.Cwc r0 = r7.A0N
            if (r0 != 0) goto L_0x007f
            X.C6n r0 = r7.A0t
            X.Cwc r0 = X.C26281Cwc.A01(r9, r0)
            r7.A0N = r0
        L_0x007f:
            int r5 = r8.getTop()
            r9.A0F(r8, r10)
            int r0 = r9.getWidth()
            r7.A0F = r0
            int r0 = r9.getHeight()
            r7.A0E = r0
            int r3 = r8.getHeight()
            r7.A0k = r3
            int r6 = r7.A0E
            int r0 = r6 - r3
            int r1 = r7.A0A
            if (r0 >= r1) goto L_0x00a7
            boolean r0 = r7.A0q
            if (r0 == 0) goto L_0x010d
            r7.A0k = r6
            r3 = r6
        L_0x00a7:
            int r0 = r6 - r3
            r3 = 0
            int r0 = java.lang.Math.max(r3, r0)
            r7.A06 = r0
            float r4 = (float) r6
            r1 = 1065353216(0x3f800000, float:1.0)
            float r0 = r7.A01
            float r1 = r1 - r0
            float r4 = r4 * r1
            int r4 = (int) r4
            r7.A08 = r4
            A08(r7)
            int r1 = r7.A0J
            r0 = 3
            if (r1 != r0) goto L_0x00ec
            int r6 = r7.A0Q()
        L_0x00c6:
            X.AnonymousClass1HF.A0a(r8, r6)
        L_0x00c9:
            int r0 = r7.A0J
            r7.A04(r0, r3)
            android.view.View r0 = r7.A0S(r8)
            java.lang.ref.WeakReference r0 = X.AnonymousClass3MW.A0z(r0)
            r7.A0R = r0
        L_0x00d8:
            java.util.ArrayList r1 = r7.A0s
            int r0 = r1.size()
            if (r3 >= r0) goto L_0x0125
            java.lang.Object r0 = r1.get(r3)
            X.C6X r0 = (X.C6X) r0
            r0.A01(r8)
            int r3 = r3 + 1
            goto L_0x00d8
        L_0x00ec:
            r0 = 6
            if (r1 != r0) goto L_0x00f1
            r6 = r4
            goto L_0x00c6
        L_0x00f1:
            boolean r0 = r7.A0X
            if (r0 == 0) goto L_0x00f9
            r0 = 5
            if (r1 != r0) goto L_0x00f9
            goto L_0x00c6
        L_0x00f9:
            r0 = 4
            if (r1 != r0) goto L_0x00ff
            int r6 = r7.A04
            goto L_0x00c6
        L_0x00ff:
            if (r1 == r2) goto L_0x0104
            r0 = 2
            if (r1 != r0) goto L_0x00c9
        L_0x0104:
            int r0 = r8.getTop()
            int r5 = r5 - r0
            X.AnonymousClass1HF.A0a(r8, r5)
            goto L_0x00c9
        L_0x010d:
            int r3 = r6 - r1
            r7.A0k = r3
            goto L_0x00a7
        L_0x0112:
            android.content.res.ColorStateList r0 = r7.A0L
            if (r0 == 0) goto L_0x0067
            X.AnonymousClass1HF.A0L(r0, r8)
            goto L_0x0067
        L_0x011b:
            X.DLB r0 = new X.DLB
            r0.<init>(r7, r1)
            X.AnonymousClass1YU.A03(r8, r0)
            goto L_0x004b
        L_0x0125:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.A0O(android.view.View, androidx.coordinatorlayout.widget.CoordinatorLayout, int):boolean");
    }

    public boolean A0P(View view, CoordinatorLayout coordinatorLayout, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams A0B2 = AnonymousClass3MW.A0B(view);
        view.measure(A01(i, C72453Mb.A0C(coordinatorLayout) + A0B2.leftMargin + A0B2.rightMargin + i2, this.A0D, A0B2.width), A01(i3, BE9.A08(coordinatorLayout) + A0B2.topMargin + A0B2.bottomMargin, this.A0C, A0B2.height));
        return true;
    }

    public View A0S(View view) {
        if (view.getVisibility() == 0) {
            if (AnonymousClass1Xr.A06(view)) {
                return view;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View A0S2 = A0S(viewGroup.getChildAt(i));
                    if (A0S2 != null) {
                        return A0S2;
                    }
                }
            }
        }
        return null;
    }

    public BottomSheetBehavior() {
    }
}
