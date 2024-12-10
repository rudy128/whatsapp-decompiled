package com.google.android.material.appbar;

import X.AnonymousClass000;
import X.AnonymousClass1HF;
import X.AnonymousClass1HO;
import X.AnonymousClass1XU;
import X.AnonymousClass1YO;
import X.AnonymousClass1YW;
import X.AnonymousClass3MW;
import X.BE6;
import X.BE7;
import X.BL3;
import X.BiQ;
import X.C108945cZ;
import X.C22659BIk;
import X.C22667BJi;
import X.C23511BiR;
import X.C24879CNx;
import X.C25409CfC;
import X.C26137Ct0;
import X.C26317Cxa;
import X.C26610D6a;
import X.C26611D6b;
import X.C27741Xj;
import X.C27781Xn;
import X.C27801Xq;
import X.C27811Xs;
import X.C28517E5h;
import X.C28664EDb;
import X.C37891qK;
import X.C37901qL;
import X.C41501wV;
import X.C72453Mb;
import X.C72473Md;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.List;

public class AppBarLayout extends LinearLayout implements AnonymousClass1YO {
    public int A00;
    public int A01;
    public ValueAnimator.AnimatorUpdateListener A02;
    public ValueAnimator A03;
    public Drawable A04;
    public AnonymousClass1HO A05;
    public WeakReference A06;
    public List A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public Behavior A0G;
    public boolean A0H;
    public int[] A0I;
    public final float A0J;
    public final long A0K;
    public final TimeInterpolator A0L;
    public final ColorStateList A0M;
    public final List A0N;

    public class BaseBehavior extends C23511BiR {
        public int A00;
        public int A01;
        public ValueAnimator A02;
        public BL3 A03;
        public WeakReference A04;
        public boolean A05;

        private void A04(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i) {
            int A042;
            int A052 = C108945cZ.A05(A0Q(), i);
            float abs = Math.abs(0.0f);
            float f = (float) A052;
            if (abs > 0.0f) {
                A042 = BE6.A04(f / abs, 1000.0f) * 3;
            } else {
                A042 = (int) (((f / C108945cZ.A04(appBarLayout)) + 1.0f) * 150.0f);
            }
            int A0Q = A0Q();
            ValueAnimator valueAnimator = this.A02;
            if (A0Q != i) {
                if (valueAnimator == null) {
                    ValueAnimator valueAnimator2 = new ValueAnimator();
                    this.A02 = valueAnimator2;
                    valueAnimator2.setInterpolator(AnonymousClass1YW.A00);
                    this.A02.addUpdateListener(new C26317Cxa(appBarLayout, coordinatorLayout, this, 1));
                } else {
                    valueAnimator.cancel();
                }
                this.A02.setDuration((long) Math.min(A042, 600));
                ValueAnimator valueAnimator3 = this.A02;
                int[] A1W = C108945cZ.A1W();
                A1W[0] = A0Q;
                A1W[1] = i;
                valueAnimator3.setIntValues(A1W);
                this.A02.start();
            } else if (valueAnimator != null && valueAnimator.isRunning()) {
                this.A02.cancel();
            }
        }

        public /* bridge */ /* synthetic */ void A0H(View view, View view2, CoordinatorLayout coordinatorLayout, int[] iArr, int i, int i2, int i3) {
            A0U(view2, coordinatorLayout, (AppBarLayout) view, iArr, i2);
        }

        public /* bridge */ /* synthetic */ void A0I(View view, CoordinatorLayout coordinatorLayout, int[] iArr, int i, int i2, int i3) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            CoordinatorLayout coordinatorLayout2 = coordinatorLayout;
            if (i3 < 0) {
                iArr[1] = A0R(appBarLayout, coordinatorLayout2, A0Q() - i3, -appBarLayout.getDownNestedScrollRange(), 0);
            } else if (i3 == 0) {
                A03(coordinatorLayout, this, appBarLayout);
            }
        }

        public /* bridge */ /* synthetic */ boolean A0P(View view, CoordinatorLayout coordinatorLayout, int i, int i2, int i3) {
            if (view.getLayoutParams().height != -2) {
                return false;
            }
            coordinatorLayout.A0G(view, i, i2, View.MeasureSpec.makeMeasureSpec(0, 0));
            return true;
        }

        public void A0U(View view, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int[] iArr, int i) {
            int i2;
            AppBarLayout appBarLayout2 = appBarLayout;
            if (i != 0) {
                int i3 = -appBarLayout.getTotalScrollRange();
                if (i < 0) {
                    i2 = appBarLayout.getDownNestedPreScrollRange() + i3;
                } else {
                    i2 = 0;
                }
                if (i3 != i2) {
                    iArr[1] = A0R(appBarLayout2, coordinatorLayout, A0Q() - i, i3, i2);
                }
            }
            if (appBarLayout.A09) {
                appBarLayout.A05(appBarLayout.A04(view));
            }
        }

        public static void A03(CoordinatorLayout coordinatorLayout, BaseBehavior baseBehavior, AppBarLayout appBarLayout) {
            C26137Ct0 ct0 = C26137Ct0.A0Z;
            CoordinatorLayout coordinatorLayout2 = coordinatorLayout;
            AnonymousClass1HF.A0b(coordinatorLayout, ((AccessibilityNodeInfo.AccessibilityAction) ct0.A03).getId());
            C26137Ct0 ct02 = C26137Ct0.A0X;
            AnonymousClass1HF.A0b(coordinatorLayout, ((AccessibilityNodeInfo.AccessibilityAction) ct02.A03).getId());
            AppBarLayout appBarLayout2 = appBarLayout;
            if (appBarLayout.getTotalScrollRange() != 0) {
                int childCount = coordinatorLayout2.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = coordinatorLayout2.getChildAt(i);
                    if (((C37891qK) childAt.getLayoutParams()).A0A instanceof ScrollingViewBehavior) {
                        int childCount2 = appBarLayout.getChildCount();
                        for (int i2 = 0; i2 < childCount2; i2++) {
                            if (((C22659BIk) appBarLayout.getChildAt(i2).getLayoutParams()).A00 != 0) {
                                BaseBehavior baseBehavior2 = baseBehavior;
                                if (AnonymousClass1HF.A05(coordinatorLayout2) == null) {
                                    AnonymousClass1HF.A0f(coordinatorLayout2, new C22667BJi(baseBehavior, 1));
                                }
                                boolean z = true;
                                boolean z2 = false;
                                if (baseBehavior.A0Q() != (-appBarLayout.getTotalScrollRange())) {
                                    AnonymousClass1HF.A0m(coordinatorLayout2, ct0, new C26610D6a(baseBehavior, appBarLayout, false), (CharSequence) null);
                                    z2 = true;
                                }
                                if (baseBehavior.A0Q() != 0) {
                                    if (childAt.canScrollVertically(-1)) {
                                        int i3 = -appBarLayout.getDownNestedPreScrollRange();
                                        if (i3 != 0) {
                                            AnonymousClass1HF.A0m(coordinatorLayout2, ct02, new C26611D6b(childAt, coordinatorLayout2, baseBehavior2, appBarLayout2, i3), (CharSequence) null);
                                        }
                                    } else {
                                        AnonymousClass1HF.A0m(coordinatorLayout2, ct02, new C26610D6a(baseBehavior, appBarLayout, true), (CharSequence) null);
                                    }
                                    baseBehavior2.A05 = z;
                                    return;
                                }
                                z = z2;
                                baseBehavior2.A05 = z;
                                return;
                            }
                        }
                        return;
                    }
                }
            }
        }

        public /* bridge */ /* synthetic */ Parcelable A0D(View view) {
            AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
            BL3 A0T = A0T(absSavedState, (AppBarLayout) view);
            if (A0T != null) {
                return A0T;
            }
            return absSavedState;
        }

        public /* bridge */ /* synthetic */ void A0F(Parcelable parcelable) {
            if (parcelable instanceof BL3) {
                this.A03 = (BL3) parcelable;
            } else {
                this.A03 = null;
            }
        }

        public /* bridge */ /* synthetic */ void A0G(View view, View view2, CoordinatorLayout coordinatorLayout, int i) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (this.A00 == 0 || i == 1) {
                A02(coordinatorLayout, this, appBarLayout);
                if (appBarLayout.A09) {
                    appBarLayout.A05(appBarLayout.A04(view2));
                }
            }
            this.A04 = AnonymousClass3MW.A0z(view2);
        }

        public /* bridge */ /* synthetic */ boolean A0M(View view, View view2, View view3, CoordinatorLayout coordinatorLayout, int i, int i2) {
            boolean z;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if ((i & 2) == 0 || (!appBarLayout.A09 && (appBarLayout.getTotalScrollRange() == 0 || coordinatorLayout.getHeight() - view2.getHeight() > appBarLayout.getHeight()))) {
                z = false;
            } else {
                z = true;
                ValueAnimator valueAnimator = this.A02;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
            }
            this.A04 = null;
            this.A00 = i2;
            return z;
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x0026  */
        /* JADX WARNING: Removed duplicated region for block: B:13:0x002f  */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x0034  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0041  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x004b  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0059  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x0068  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x006a  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x006c  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x006f  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x0073  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* bridge */ /* synthetic */ boolean A0O(android.view.View r6, androidx.coordinatorlayout.widget.CoordinatorLayout r7, int r8) {
            /*
                r5 = this;
                com.google.android.material.appbar.AppBarLayout r6 = (com.google.android.material.appbar.AppBarLayout) r6
                boolean r4 = super.A0O(r6, r7, r8)
                int r2 = r6.A01
                X.BL3 r1 = r5.A03
                r3 = 0
                if (r1 == 0) goto L_0x00a5
                r0 = r2 & 8
                if (r0 != 0) goto L_0x00a5
                boolean r0 = r1.A04
                if (r0 == 0) goto L_0x0075
                int r0 = r6.getTotalScrollRange()
                int r0 = -r0
            L_0x001a:
                r5.A0S(r6, r7, r0)
            L_0x001d:
                r6.A01 = r3
                r0 = 0
                r5.A03 = r0
                X.CWd r0 = r5.A01
                if (r0 == 0) goto L_0x0073
                int r2 = r0.A02
            L_0x0028:
                int r0 = r6.getTotalScrollRange()
                int r0 = -r0
                if (r2 >= r0) goto L_0x006f
                r2 = r0
            L_0x0030:
                X.CWd r1 = r5.A01
                if (r1 == 0) goto L_0x006c
                int r0 = r1.A02
                if (r0 == r2) goto L_0x003d
                r1.A02 = r2
                r1.A00()
            L_0x003d:
                X.CWd r0 = r5.A01
                if (r0 == 0) goto L_0x006a
                int r1 = r0.A02
            L_0x0043:
                r0 = 1
                A05(r7, r6, r1, r3, r0)
                X.CWd r0 = r5.A01
                if (r0 == 0) goto L_0x0068
                int r0 = r0.A02
            L_0x004d:
                r6.A02(r0)
                A03(r7, r5, r6)
                android.view.View r2 = A00(r7)
                if (r2 == 0) goto L_0x0067
                int r1 = android.os.Build.VERSION.SDK_INT
                r0 = 28
                if (r1 < r0) goto L_0x00cd
                X.D57 r0 = new X.D57
                r0.<init>(r2, r5, r6)
                r2.addOnUnhandledKeyEventListener(r0)
            L_0x0067:
                return r4
            L_0x0068:
                r0 = 0
                goto L_0x004d
            L_0x006a:
                r1 = 0
                goto L_0x0043
            L_0x006c:
                r5.A00 = r2
                goto L_0x003d
            L_0x006f:
                if (r2 <= r3) goto L_0x0030
                r2 = 0
                goto L_0x0030
            L_0x0073:
                r2 = 0
                goto L_0x0028
            L_0x0075:
                boolean r0 = r1.A03
                if (r0 != 0) goto L_0x00c8
                int r0 = r1.A01
                android.view.View r1 = r6.getChildAt(r0)
                int r0 = r1.getBottom()
                int r2 = -r0
                X.BL3 r0 = r5.A03
                boolean r0 = r0.A02
                if (r0 == 0) goto L_0x0098
                int r1 = r1.getMinimumHeight()
                int r0 = r6.getTopInset()
                int r1 = r1 + r0
            L_0x0093:
                int r2 = r2 + r1
                r5.A0S(r6, r7, r2)
                goto L_0x001d
            L_0x0098:
                float r1 = X.C108945cZ.A04(r1)
                X.BL3 r0 = r5.A03
                float r0 = r0.A00
                int r1 = X.BE6.A04(r1, r0)
                goto L_0x0093
            L_0x00a5:
                if (r2 == 0) goto L_0x001d
                r0 = r2 & 4
                boolean r1 = X.AnonymousClass000.A1O(r0)
                r0 = r2 & 2
                if (r0 == 0) goto L_0x00bd
                int r0 = r6.getTotalScrollRange()
                int r0 = -r0
                if (r1 == 0) goto L_0x001a
                r5.A04(r7, r6, r0)
                goto L_0x001d
            L_0x00bd:
                r0 = r2 & 1
                if (r0 == 0) goto L_0x001d
                if (r1 == 0) goto L_0x00c8
                r5.A04(r7, r6, r3)
                goto L_0x001d
            L_0x00c8:
                r5.A0S(r6, r7, r3)
                goto L_0x001d
            L_0x00cd:
                X.D4s r0 = new X.D4s
                r0.<init>(r2, r5, r6)
                r2.setOnKeyListener(r0)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.A0O(android.view.View, androidx.coordinatorlayout.widget.CoordinatorLayout, int):boolean");
        }

        /* JADX WARNING: type inference failed for: r3v0, types: [X.1Xj, X.BL3] */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0039, code lost:
            if ((-r2) < r10.getTotalScrollRange()) goto L_0x003b;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public X.BL3 A0T(android.os.Parcelable r9, com.google.android.material.appbar.AppBarLayout r10) {
            /*
                r8 = this;
                X.CWd r0 = r8.A01
                if (r0 == 0) goto L_0x005a
                int r2 = r0.A02
            L_0x0006:
                int r1 = r10.getChildCount()
                r7 = 0
                r6 = 0
            L_0x000c:
                if (r6 >= r1) goto L_0x005c
                android.view.View r5 = r10.getChildAt(r6)
                int r4 = r5.getBottom()
                int r4 = r4 + r2
                int r0 = r5.getTop()
                int r0 = r0 + r2
                if (r0 > 0) goto L_0x0057
                if (r4 < 0) goto L_0x0057
                android.os.Parcelable$Creator r0 = X.BL3.CREATOR
                if (r9 != 0) goto L_0x0026
                X.1Xj r9 = X.C27741Xj.A01
            L_0x0026:
                X.BL3 r3 = new X.BL3
                r3.<init>(r9)
                boolean r0 = X.AnonymousClass000.A1P(r2)
                r3.A03 = r0
                if (r0 != 0) goto L_0x003b
                int r2 = -r2
                int r1 = r10.getTotalScrollRange()
                r0 = 1
                if (r2 >= r1) goto L_0x003c
            L_0x003b:
                r0 = 0
            L_0x003c:
                r3.A04 = r0
                r3.A01 = r6
                int r1 = r5.getMinimumHeight()
                int r0 = r10.getTopInset()
                int r1 = r1 + r0
                if (r4 != r1) goto L_0x004c
                r7 = 1
            L_0x004c:
                r3.A02 = r7
                float r1 = (float) r4
                float r0 = X.C108945cZ.A04(r5)
                float r1 = r1 / r0
                r3.A00 = r1
                return r3
            L_0x0057:
                int r6 = r6 + 1
                goto L_0x000c
            L_0x005a:
                r2 = 0
                goto L_0x0006
            L_0x005c:
                r0 = 0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.A0T(android.os.Parcelable, com.google.android.material.appbar.AppBarLayout):X.BL3");
        }

        public static View A00(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if ((childAt instanceof C37901qL) || (childAt instanceof ListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        public static void A01(KeyEvent keyEvent, View view, AppBarLayout appBarLayout) {
            if (keyEvent.getAction() == 0 || keyEvent.getAction() == 1) {
                int keyCode = keyEvent.getKeyCode();
                if (keyCode == 19 || keyCode == 280 || keyCode == 92) {
                    if (((double) view.getScrollY()) < ((double) view.getMeasuredHeight()) * 0.1d) {
                        appBarLayout.setExpanded(true);
                    }
                } else if ((keyCode == 20 || keyCode == 281 || keyCode == 93) && view.getScrollY() > 0) {
                    appBarLayout.setExpanded(false);
                }
            }
        }

        public static void A02(CoordinatorLayout coordinatorLayout, BaseBehavior baseBehavior, AppBarLayout appBarLayout) {
            int topInset = appBarLayout.getTopInset() + appBarLayout.getPaddingTop();
            int A0Q = baseBehavior.A0Q() - topInset;
            int childCount = appBarLayout.getChildCount();
            int i = 0;
            while (i < childCount) {
                View childAt = appBarLayout.getChildAt(i);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                C22659BIk bIk = (C22659BIk) childAt.getLayoutParams();
                if ((bIk.A00 & 32) == 32) {
                    top -= bIk.topMargin;
                    bottom += bIk.bottomMargin;
                }
                int i2 = -A0Q;
                if (top > i2 || bottom < i2) {
                    i++;
                } else if (i >= 0) {
                    View childAt2 = appBarLayout.getChildAt(i);
                    C22659BIk bIk2 = (C22659BIk) childAt2.getLayoutParams();
                    int i3 = bIk2.A00;
                    if ((i3 & 17) == 17) {
                        int i4 = -childAt2.getTop();
                        int i5 = -childAt2.getBottom();
                        if (i == 0 && appBarLayout.getFitsSystemWindows() && childAt2.getFitsSystemWindows()) {
                            i4 -= appBarLayout.getTopInset();
                        }
                        if ((i3 & 2) == 2) {
                            i5 += childAt2.getMinimumHeight();
                        } else if ((i3 & 5) == 5) {
                            int minimumHeight = childAt2.getMinimumHeight() + i5;
                            if (A0Q < minimumHeight) {
                                i4 = minimumHeight;
                            } else {
                                i5 = minimumHeight;
                            }
                        }
                        if ((i3 & 32) == 32) {
                            i4 += bIk2.topMargin;
                            i5 -= bIk2.bottomMargin;
                        }
                        if (A0Q >= (i5 + i4) / 2) {
                            i5 = i4;
                        }
                        int i6 = i5 + topInset;
                        int i7 = -appBarLayout.getTotalScrollRange();
                        if (i6 >= i7) {
                            i7 = i6;
                            if (i6 > 0) {
                                i7 = 0;
                            }
                        }
                        baseBehavior.A04(coordinatorLayout, appBarLayout, i7);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            }
        }

        public static void A05(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int i2, boolean z) {
            View view;
            int abs = Math.abs(i);
            int childCount = appBarLayout.getChildCount();
            int i3 = 0;
            while (true) {
                if (i3 >= childCount) {
                    view = null;
                    break;
                }
                view = appBarLayout.getChildAt(i3);
                if (abs >= view.getTop() && abs <= view.getBottom()) {
                    break;
                }
                i3++;
            }
            boolean z2 = false;
            if (view != null) {
                int i4 = ((C22659BIk) view.getLayoutParams()).A00;
                if ((i4 & 1) != 0) {
                    int minimumHeight = view.getMinimumHeight();
                    if (((i2 > 0 && (i4 & 12) != 0) || (i4 & 2) != 0) && (-i) >= (view.getBottom() - minimumHeight) - appBarLayout.getTopInset()) {
                        z2 = true;
                    }
                }
            }
            if (appBarLayout.A09) {
                z2 = appBarLayout.A04(A00(coordinatorLayout));
            }
            boolean A052 = appBarLayout.A05(z2);
            if (!z) {
                if (A052) {
                    Collection collection = (Collection) coordinatorLayout.A0C.A00.get(appBarLayout);
                    List list = coordinatorLayout.A0D;
                    list.clear();
                    if (collection != null) {
                        list.addAll(collection);
                    }
                    int size = list.size();
                    int i5 = 0;
                    while (i5 < size) {
                        C41501wV r1 = ((C37891qK) ((View) list.get(i5)).getLayoutParams()).A0A;
                        if (!(r1 instanceof ScrollingViewBehavior)) {
                            i5++;
                        } else if (((BiQ) r1).A00 == 0) {
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            appBarLayout.jumpDrawablesToCurrentState();
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public BaseBehavior() {
        }
    }

    public class ScrollingViewBehavior extends BiQ {
        public void A09(View view, CoordinatorLayout coordinatorLayout) {
            if (view instanceof AppBarLayout) {
                AnonymousClass1HF.A0b(coordinatorLayout, ((AccessibilityNodeInfo.AccessibilityAction) C26137Ct0.A0Z.A03).getId());
                AnonymousClass1HF.A0b(coordinatorLayout, ((AccessibilityNodeInfo.AccessibilityAction) C26137Ct0.A0X.A03).getId());
                AnonymousClass1HF.A0f(coordinatorLayout, (AnonymousClass1XU) null);
            }
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C27781Xn.A0b);
            this.A00 = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            obtainStyledAttributes.recycle();
        }

        public boolean A0A(Rect rect, View view, CoordinatorLayout coordinatorLayout, boolean z) {
            AppBarLayout appBarLayout;
            List A0C = coordinatorLayout.A0C(view);
            int size = A0C.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    appBarLayout = null;
                    break;
                }
                View view2 = (View) A0C.get(i);
                if (view2 instanceof AppBarLayout) {
                    appBarLayout = (AppBarLayout) view2;
                    break;
                }
                i++;
            }
            boolean z2 = false;
            if (appBarLayout != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = this.A02;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    z2 = true;
                    int i2 = 0;
                    if (!z) {
                        i2 = 4;
                    }
                    appBarLayout.A01 = 2 | i2 | 8;
                    appBarLayout.requestLayout();
                }
            }
            return z2;
        }

        public boolean A0B(View view, View view2, CoordinatorLayout coordinatorLayout) {
            C41501wV r2 = ((C37891qK) view2.getLayoutParams()).A0A;
            if (r2 instanceof BaseBehavior) {
                AnonymousClass1HF.A0a(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) r2).A01) + this.A01) - A0Q(view2));
            }
            if (!(view2 instanceof AppBarLayout)) {
                return false;
            }
            AppBarLayout appBarLayout = (AppBarLayout) view2;
            if (!appBarLayout.A09) {
                return false;
            }
            appBarLayout.A05(appBarLayout.A04(view));
            return false;
        }

        public boolean A0C(View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        public ScrollingViewBehavior() {
        }
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    public void setLiftOnScrollTargetView(View view) {
        WeakReference A0z;
        this.A00 = -1;
        if (view == null) {
            WeakReference weakReference = this.A06;
            if (weakReference != null) {
                weakReference.clear();
            }
            A0z = null;
        } else {
            A0z = AnonymousClass3MW.A0z(view);
        }
        this.A06 = A0z;
    }

    public void setOrientation(int i) {
        if (i == 1) {
            super.setOrientation(i);
            return;
        }
        throw AnonymousClass000.A0k("AppBarLayout is always vertical and does not support horizontal orientation");
    }

    private void A00() {
        BL3 bl3;
        Behavior behavior = this.A0G;
        if (behavior == null || this.A0F == -1 || this.A01 != 0) {
            bl3 = null;
        } else {
            bl3 = behavior.A0T(C27741Xj.A01, this);
        }
        this.A0F = -1;
        this.A0D = -1;
        this.A0E = -1;
        if (bl3 != null) {
            Behavior behavior2 = this.A0G;
            if (behavior2.A03 == null) {
                behavior2.A03 = bl3;
            }
        }
    }

    public void A02(int i) {
        this.A0C = i;
        if (!willNotDraw()) {
            postInvalidateOnAnimation();
        }
        List list = this.A07;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                C28517E5h e5h = (C28517E5h) this.A07.get(i2);
                if (e5h != null) {
                    e5h.BzS(this, i);
                }
            }
        }
    }

    public void A03(C28664EDb eDb) {
        List list = this.A07;
        if (list == null) {
            list = AnonymousClass000.A13();
            this.A07 = list;
        }
        if (!list.contains(eDb)) {
            this.A07.add(eDb);
        }
    }

    public boolean A04(View view) {
        View A0O;
        int i;
        View view2;
        if (this.A06 == null && (i = this.A00) != -1 && (!(view == null || (view2 = view.findViewById(i)) == null) || ((getParent() instanceof ViewGroup) && (view2 = ((View) getParent()).findViewById(this.A00)) != null))) {
            this.A06 = AnonymousClass3MW.A0z(view2);
        }
        WeakReference weakReference = this.A06;
        if (weakReference != null && (A0O = C108945cZ.A0O(weakReference)) != null) {
            view = A0O;
        } else if (view == null) {
            return false;
        }
        if (view.canScrollVertically(-1) || view.getScrollY() > 0) {
            return true;
        }
        return false;
    }

    public boolean A05(boolean z) {
        float f;
        if (!(!this.A0H) || this.A0B == z) {
            return false;
        }
        this.A0B = z;
        refreshDrawableState();
        if (!this.A09 || !(getBackground() instanceof C27801Xq)) {
            return true;
        }
        float f2 = 0.0f;
        if (this.A0M != null) {
            f = 255.0f;
            if (z) {
                f = 0.0f;
                f2 = 255.0f;
            }
        } else if (z) {
            f = 0.0f;
            f2 = this.A0J;
        } else {
            f = this.A0J;
        }
        ValueAnimator valueAnimator = this.A03;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(C72473Md.A1a(f, f2));
        this.A03 = ofFloat;
        ofFloat.setDuration(this.A0K);
        this.A03.setInterpolator(this.A0L);
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.A02;
        if (animatorUpdateListener != null) {
            this.A03.addUpdateListener(animatorUpdateListener);
        }
        this.A03.start();
        return true;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.1wV, com.google.android.material.appbar.AppBarLayout$Behavior, X.BiR] */
    public C41501wV getBehavior() {
        ? biR = new C23511BiR();
        this.A0G = biR;
        return biR;
    }

    public int getDownNestedPreScrollRange() {
        int i;
        int minimumHeight;
        int i2 = this.A0D;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt.getVisibility() != 8) {
                C22659BIk bIk = (C22659BIk) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i4 = bIk.A00;
                if ((i4 & 5) == 5) {
                    int i5 = bIk.topMargin + bIk.bottomMargin;
                    if ((i4 & 8) != 0) {
                        minimumHeight = childAt.getMinimumHeight();
                    } else if ((i4 & 2) != 0) {
                        minimumHeight = measuredHeight - childAt.getMinimumHeight();
                    } else {
                        i = i5 + measuredHeight;
                        if (childCount == 0 && childAt.getFitsSystemWindows()) {
                            i = BE6.A09(measuredHeight, getTopInset(), i);
                        }
                        i3 += i;
                    }
                    i = i5 + minimumHeight;
                    i = BE6.A09(measuredHeight, getTopInset(), i);
                    i3 += i;
                } else if (i3 > 0) {
                    break;
                }
            }
        }
        int max = Math.max(0, i3);
        this.A0D = max;
        return max;
    }

    public int getDownNestedScrollRange() {
        int i = this.A0E;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                C22659BIk bIk = (C22659BIk) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight() + bIk.topMargin + bIk.bottomMargin;
                int i4 = bIk.A00;
                if ((i4 & 1) == 0) {
                    break;
                }
                i3 += measuredHeight;
                if ((i4 & 2) != 0) {
                    i3 -= childAt.getMinimumHeight();
                    break;
                }
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.A0E = max;
        return max;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.A00;
    }

    public int getPendingAction() {
        return this.A01;
    }

    public Drawable getStatusBarForeground() {
        return this.A04;
    }

    public final int getTopInset() {
        AnonymousClass1HO r0 = this.A05;
        if (r0 != null) {
            return r0.A05();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i = this.A0F;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                C22659BIk bIk = (C22659BIk) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i4 = bIk.A00;
                if ((i4 & 1) == 0) {
                    break;
                }
                i3 += measuredHeight + bIk.topMargin + bIk.bottomMargin;
                if (i2 == 0 && childAt.getFitsSystemWindows()) {
                    i3 -= getTopInset();
                }
                if ((i4 & 2) != 0) {
                    i3 -= childAt.getMinimumHeight();
                    break;
                }
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.A0F = max;
        return max;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003d, code lost:
        if (r5.A0B == false) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0023, code lost:
        if (r5.A0B == false) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int[] onCreateDrawableState(int r6) {
        /*
            r5 = this;
            int[] r4 = r5.A0I
            if (r4 != 0) goto L_0x0009
            r0 = 4
            int[] r4 = new int[r0]
            r5.A0I = r4
        L_0x0009:
            int r0 = r4.length
            int r6 = r6 + r0
            int[] r3 = super.onCreateDrawableState(r6)
            boolean r2 = r5.A0A
            r1 = 2130971363(0x7f040ae3, float:1.7551462E38)
            if (r2 != 0) goto L_0x0019
            r1 = -2130971363(0xffffffff80fbf51d, float:-2.313864E-38)
        L_0x0019:
            r0 = 0
            r4[r0] = r1
            if (r2 == 0) goto L_0x0025
            boolean r0 = r5.A0B
            r1 = 2130971364(0x7f040ae4, float:1.7551464E38)
            if (r0 != 0) goto L_0x0028
        L_0x0025:
            r1 = -2130971364(0xffffffff80fbf51c, float:-2.3138638E-38)
        L_0x0028:
            r0 = 1
            r4[r0] = r1
            r1 = 2130971359(0x7f040adf, float:1.7551454E38)
            if (r2 != 0) goto L_0x0033
            r1 = -2130971359(0xffffffff80fbf521, float:-2.3138645E-38)
        L_0x0033:
            r0 = 2
            r4[r0] = r1
            if (r2 == 0) goto L_0x003f
            boolean r0 = r5.A0B
            r1 = 2130971358(0x7f040ade, float:1.7551452E38)
            if (r0 != 0) goto L_0x0042
        L_0x003f:
            r1 = -2130971358(0xffffffff80fbf522, float:-2.3138647E-38)
        L_0x0042:
            r0 = 3
            r4[r0] = r1
            int[] r0 = android.view.View.mergeDrawableStates(r3, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.onCreateDrawableState(int):int[]");
    }

    public void setLiftOnScrollTargetViewId(int i) {
        this.A00 = i;
        WeakReference weakReference = this.A06;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.A06 = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0044, code lost:
        if (getTopInset() <= 0) goto L_0x0046;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setStatusBarForeground(android.graphics.drawable.Drawable r4) {
        /*
            r3 = this;
            android.graphics.drawable.Drawable r1 = r3.A04
            if (r1 == r4) goto L_0x004f
            r0 = 0
            if (r1 == 0) goto L_0x000a
            r1.setCallback(r0)
        L_0x000a:
            if (r4 == 0) goto L_0x0010
            android.graphics.drawable.Drawable r0 = r4.mutate()
        L_0x0010:
            r3.A04 = r0
            if (r0 == 0) goto L_0x003b
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x001f
            android.graphics.drawable.Drawable r0 = r3.A04
            X.AnonymousClass000.A17(r0, r3)
        L_0x001f:
            android.graphics.drawable.Drawable r1 = r3.A04
            int r0 = r3.getLayoutDirection()
            X.C27831Xu.A0G(r0, r1)
            android.graphics.drawable.Drawable r2 = r3.A04
            int r0 = r3.getVisibility()
            r1 = 0
            boolean r0 = X.AnonymousClass000.A1P(r0)
            r2.setVisible(r0, r1)
            android.graphics.drawable.Drawable r0 = r3.A04
            r0.setCallback(r3)
        L_0x003b:
            android.graphics.drawable.Drawable r0 = r3.A04
            if (r0 == 0) goto L_0x0046
            int r1 = r3.getTopInset()
            r0 = 1
            if (r1 > 0) goto L_0x0047
        L_0x0046:
            r0 = 0
        L_0x0047:
            r0 = r0 ^ 1
            r3.setWillNotDraw(r0)
            r3.postInvalidateOnAnimation()
        L_0x004f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.setStatusBarForeground(android.graphics.drawable.Drawable):void");
    }

    public void setStatusBarForegroundColor(int i) {
        setStatusBarForeground(new ColorDrawable(i));
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AppBarLayout(android.content.Context r18, android.util.AttributeSet r19, int r20) {
        /*
            r17 = this;
            r10 = 2132084540(0x7f15073c, float:1.9809253E38)
            r0 = r18
            r6 = r19
            r9 = r20
            android.content.Context r0 = X.C27771Xm.A00(r0, r6, r9, r10)
            r2 = r17
            r2.<init>(r0, r6, r9)
            r1 = -1
            r2.A0F = r1
            r2.A0D = r1
            r2.A0E = r1
            r4 = 0
            r2.A01 = r4
            java.util.ArrayList r0 = X.AnonymousClass000.A13()
            r2.A0N = r0
            android.content.Context r11 = r2.getContext()
            r0 = 1
            r2.setOrientation(r0)
            android.view.ViewOutlineProvider r3 = r2.getOutlineProvider()
            android.view.ViewOutlineProvider r0 = android.view.ViewOutlineProvider.BACKGROUND
            if (r3 != r0) goto L_0x0037
            android.view.ViewOutlineProvider r0 = android.view.ViewOutlineProvider.BOUNDS
            r2.setOutlineProvider(r0)
        L_0x0037:
            android.content.Context r5 = r2.getContext()
            int[] r7 = X.C25409CfC.A00
            int[] r8 = new int[r4]
            android.content.res.TypedArray r3 = X.C27791Xo.A00(r5, r6, r7, r8, r9, r10)
            boolean r0 = r3.hasValue(r4)     // Catch:{ all -> 0x0147 }
            if (r0 == 0) goto L_0x0054
            int r0 = r3.getResourceId(r4, r4)     // Catch:{ all -> 0x0147 }
            android.animation.StateListAnimator r0 = android.animation.AnimatorInflater.loadStateListAnimator(r5, r0)     // Catch:{ all -> 0x0147 }
            r2.setStateListAnimator(r0)     // Catch:{ all -> 0x0147 }
        L_0x0054:
            r3.recycle()
            int[] r13 = X.C27781Xn.A00
            int[] r14 = new int[r4]
            r12 = r6
            r15 = r9
            r16 = r10
            android.content.res.TypedArray r5 = X.C27791Xo.A00(r11, r12, r13, r14, r15, r16)
            android.graphics.drawable.Drawable r0 = r5.getDrawable(r4)
            r2.setBackground(r0)
            r0 = 6
            android.content.res.ColorStateList r3 = X.AnonymousClass1YT.A01(r11, r5, r0)
            r2.A0M = r3
            android.graphics.drawable.Drawable r0 = r2.getBackground()
            boolean r0 = r0 instanceof android.graphics.drawable.ColorDrawable
            if (r0 == 0) goto L_0x00a7
            android.graphics.drawable.Drawable r0 = r2.getBackground()
            android.graphics.drawable.ColorDrawable r0 = (android.graphics.drawable.ColorDrawable) r0
            X.1Xq r6 = new X.1Xq
            r6.<init>()
            int r0 = r0.getColor()
            X.BE7.A1C(r6, r0)
            if (r3 == 0) goto L_0x0141
            boolean r3 = r2.A0B
            r0 = 0
            if (r3 == 0) goto L_0x0094
            r0 = 255(0xff, float:3.57E-43)
        L_0x0094:
            r6.setAlpha(r0)
            android.content.res.ColorStateList r0 = r2.A0M
            r6.A0F(r0)
            r3 = 5
        L_0x009d:
            X.CxY r0 = new X.CxY
            r0.<init>(r6, r2, r3)
            r2.A02 = r0
            r2.setBackground(r6)
        L_0x00a7:
            android.content.res.Resources r3 = r2.getResources()
            r0 = 2131492867(0x7f0c0003, float:1.8609198E38)
            int r3 = r3.getInteger(r0)
            r0 = 2130970536(0x7f0407a8, float:1.7549785E38)
            int r0 = X.AnonymousClass1Z9.A00(r11, r0, r3)
            long r6 = (long) r0
            r2.A0K = r6
            r3 = 2130970554(0x7f0407ba, float:1.7549821E38)
            android.animation.TimeInterpolator r0 = X.AnonymousClass1YW.A03
            android.animation.TimeInterpolator r0 = X.C29101bc.A01(r0, r11, r3)
            r2.A0L = r0
            r0 = 4
            r3 = 4
            boolean r0 = r5.hasValue(r0)
            if (r0 == 0) goto L_0x00dc
            boolean r0 = r5.getBoolean(r3, r4)
            int r0 = X.C72453Mb.A04(r0)
            r2.A01 = r0
            r2.requestLayout()
        L_0x00dc:
            r0 = 3
            r3 = 3
            boolean r0 = r5.hasValue(r0)
            if (r0 == 0) goto L_0x00ec
            int r0 = r5.getDimensionPixelSize(r3, r4)
            float r0 = (float) r0
            X.C25409CfC.A00(r2, r0)
        L_0x00ec:
            int r3 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r3 < r0) goto L_0x0110
            r0 = 2
            r3 = 2
            boolean r0 = r5.hasValue(r0)
            if (r0 == 0) goto L_0x0101
            boolean r0 = r5.getBoolean(r3, r4)
            r2.setKeyboardNavigationCluster(r0)
        L_0x0101:
            r0 = 1
            r3 = 1
            boolean r0 = r5.hasValue(r0)
            if (r0 == 0) goto L_0x0110
            boolean r0 = r5.getBoolean(r3, r4)
            r2.setTouchscreenBlocksFocus(r0)
        L_0x0110:
            android.content.res.Resources r3 = r2.getResources()
            r0 = 2131166399(0x7f0704bf, float:1.7947042E38)
            float r0 = r3.getDimension(r0)
            r2.A0J = r0
            r0 = 5
            boolean r0 = r5.getBoolean(r0, r4)
            r2.A09 = r0
            r0 = 7
            int r0 = r5.getResourceId(r0, r1)
            r2.A00 = r0
            r0 = 8
            android.graphics.drawable.Drawable r0 = r5.getDrawable(r0)
            r2.setStatusBarForeground(r0)
            r5.recycle()
            r1 = 1
            X.D6T r0 = new X.D6T
            r0.<init>(r2, r1)
            X.AnonymousClass1HF.A0g(r2, r0)
            return
        L_0x0141:
            r6.A0E(r11)
            r3 = 4
            goto L_0x009d
        L_0x0147:
            r0 = move-exception
            r3.recycle()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.BIk, android.widget.LinearLayout$LayoutParams] */
    /* renamed from: A01 */
    public C22659BIk generateLayoutParams(AttributeSet attributeSet) {
        C24879CNx cNx;
        Context context = getContext();
        ? layoutParams = new LinearLayout.LayoutParams(context, attributeSet);
        layoutParams.A00 = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C27781Xn.A01);
        layoutParams.A00 = obtainStyledAttributes.getInt(1, 0);
        if (obtainStyledAttributes.getInt(0, 0) != 1) {
            cNx = null;
        } else {
            cNx = new C24879CNx();
        }
        layoutParams.A02 = cNx;
        if (obtainStyledAttributes.hasValue(2)) {
            layoutParams.A01 = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(2, 0));
        }
        obtainStyledAttributes.recycle();
        return layoutParams;
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.A04 != null && getTopInset() > 0) {
            int save = canvas.save();
            canvas.translate(0.0f, (float) (-this.A0C));
            this.A04.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.A04;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int childCount;
        int topInset = getTopInset();
        int minimumHeight = getMinimumHeight();
        if (minimumHeight != 0 || ((childCount = getChildCount()) >= 1 && (minimumHeight = getChildAt(childCount - 1).getMinimumHeight()) != 0)) {
            return (minimumHeight * 2) + topInset;
        }
        return getHeight() / 3;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C27811Xs.A01(this);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WeakReference weakReference = this.A06;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.A06 = null;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        boolean z2 = true;
        if (getFitsSystemWindows() && getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt.getVisibility() != 8 && !childAt.getFitsSystemWindows()) {
                int topInset = getTopInset();
                for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                    AnonymousClass1HF.A0a(getChildAt(childCount), topInset);
                }
            }
        }
        A00();
        this.A08 = false;
        int childCount2 = getChildCount();
        int i5 = 0;
        while (true) {
            if (i5 >= childCount2) {
                break;
            } else if (((C22659BIk) getChildAt(i5).getLayoutParams()).A01 != null) {
                this.A08 = true;
                break;
            } else {
                i5++;
            }
        }
        Drawable drawable = this.A04;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (!this.A0H) {
            if (!this.A09) {
                int childCount3 = getChildCount();
                int i6 = 0;
                while (true) {
                    if (i6 >= childCount3) {
                        z2 = false;
                        break;
                    }
                    int i7 = ((C22659BIk) getChildAt(i6).getLayoutParams()).A00;
                    if ((i7 & 1) == 1 && (i7 & 10) != 0) {
                        break;
                    }
                    i6++;
                }
            }
            if (this.A0A != z2) {
                this.A0A = z2;
                refreshDrawableState();
            }
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != 1073741824 && getFitsSystemWindows() && getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt.getVisibility() != 8 && !childAt.getFitsSystemWindows()) {
                int measuredHeight = getMeasuredHeight();
                if (mode == Integer.MIN_VALUE) {
                    int measuredHeight2 = getMeasuredHeight() + getTopInset();
                    measuredHeight = View.MeasureSpec.getSize(i2);
                    if (measuredHeight2 < 0) {
                        measuredHeight = 0;
                    } else if (measuredHeight2 <= measuredHeight) {
                        measuredHeight = measuredHeight2;
                    }
                } else if (mode == 0) {
                    measuredHeight += getTopInset();
                }
                setMeasuredDimension(getMeasuredWidth(), measuredHeight);
            }
        }
        A00();
    }

    public void setElevation(float f) {
        super.setElevation(f);
        C27811Xs.A02(this, f);
    }

    public void setExpanded(boolean z) {
        boolean isLaidOut = isLaidOut();
        int A042 = C72453Mb.A04(z ? 1 : 0);
        int i = 0;
        if (isLaidOut) {
            i = 4;
        }
        this.A01 = A042 | i | 8;
        requestLayout();
    }

    public void setStatusBarForegroundResource(int i) {
        setStatusBarForeground(BE7.A0F(this, i));
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean A1P = AnonymousClass000.A1P(i);
        Drawable drawable = this.A04;
        if (drawable != null) {
            drawable.setVisible(A1P, false);
        }
    }

    public boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable) || drawable == this.A04) {
            return true;
        }
        return false;
    }

    public class Behavior extends BaseBehavior {
        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public Behavior() {
        }
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C22659BIk;
    }

    public void setLiftOnScroll(boolean z) {
        this.A09 = z;
    }

    public void setLiftableOverrideEnabled(boolean z) {
        this.A0H = z;
    }

    @Deprecated
    public void setTargetElevation(float f) {
        C25409CfC.A00(this, f);
    }

    public AppBarLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130968675);
    }
}
