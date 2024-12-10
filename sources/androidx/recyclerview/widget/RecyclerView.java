package androidx.recyclerview.widget;

import X.AnonymousClass1CH;
import X.AnonymousClass1HF;
import X.AnonymousClass2RY;
import X.AnonymousClass2S0;
import X.AnonymousClass3KA;
import X.AnonymousClass3KB;
import X.AnonymousClass3LW;
import X.C22694BKw;
import X.C25272CcK;
import X.C27741Xj;
import X.C28111Yx;
import X.C37901qL;
import X.C37921qP;
import X.C37931qQ;
import X.C37941qR;
import X.C37951qS;
import X.C37961qT;
import X.C37991qW;
import X.C38011qY;
import X.C38021qZ;
import X.C38031qa;
import X.C38051qc;
import X.C38111qi;
import X.C38141ql;
import X.C38151qm;
import X.C38171qo;
import X.C38201qr;
import X.C38251qy;
import X.C38391rD;
import X.C38441rI;
import X.C38481rM;
import X.C38491rN;
import X.C38811rw;
import X.C39711tW;
import X.C40611uz;
import X.C42011xT;
import X.C42031xV;
import X.C57072iU;
import X.C64092uD;
import X.C72343Lo;
import android.animation.LayoutTransition;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.bloks.stdlib.components.bkcomponentscollection.StickyHeadersLinearLayoutManager;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class RecyclerView extends ViewGroup implements C37901qL {
    public static final Interpolator A1A = new C64092uD(0);
    public static final boolean A1B;
    public static final Class[] A1C;
    public static final int[] A1D = {16843830};
    public int A00;
    public int A01;
    public int A02;
    public EdgeEffect A03;
    public EdgeEffect A04;
    public EdgeEffect A05;
    public EdgeEffect A06;
    public C38111qi A07;
    public C38151qm A08;
    public C38011qY A09;
    public C38811rw A0A;
    public C38391rD A0B;
    public C37961qT A0C;
    public C38251qy A0D;
    public AnonymousClass2S0 A0E;
    public C72343Lo A0F;
    public C39711tW A0G;
    public AnonymousClass3KB A0H;
    public C38171qo A0I;
    public Runnable A0J;
    public List A0K;
    public List A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public float A0Z;
    public float A0a;
    public int A0b;
    public int A0c;
    public int A0d;
    public int A0e;
    public int A0f;
    public int A0g;
    public int A0h;
    public int A0i;
    public VelocityTracker A0j;
    public C38201qr A0k;
    public AnonymousClass3KA A0l;
    public C37951qS A0m;
    public C38031qa A0n;
    public C22694BKw A0o;
    public boolean A0p;
    public final int A0q;
    public final Rect A0r;
    public final Rect A0s;
    public final RectF A0t;
    public final AccessibilityManager A0u;
    public final C37931qQ A0v;
    public final C38021qZ A0w;
    public final C37991qW A0x;
    public final C38051qc A0y;
    public final C37941qR A0z;
    public final Runnable A10;
    public final ArrayList A11;
    public final ArrayList A12;
    public final List A13;
    public final int[] A14;
    public final int[] A15;
    public final int A16;
    public final C37921qP A17;
    public final int[] A18;
    public final int[] A19;

    static {
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 23) {
            z = true;
        }
        A1B = z;
        Class cls = Integer.TYPE;
        A1C = new Class[]{Context.class, AttributeSet.class, cls, cls};
    }

    public RecyclerView(Context context) {
        this(context, (AttributeSet) null);
    }

    private void A0A(View view, View view2) {
        View view3 = view;
        View view4 = view;
        if (view2 != null) {
            view4 = view2;
        }
        Rect rect = this.A0r;
        rect.set(0, 0, view4.getWidth(), view4.getHeight());
        ViewGroup.LayoutParams layoutParams = view4.getLayoutParams();
        if (layoutParams instanceof C38491rN) {
            C38491rN r1 = (C38491rN) layoutParams;
            if (!r1.A01) {
                Rect rect2 = r1.A03;
                rect.left -= rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        C38251qy r2 = this.A0D;
        boolean z = !this.A0Q;
        boolean z2 = false;
        if (view2 == null) {
            z2 = true;
        }
        r2.A0f(rect, view3, this, z, z2);
    }

    public void A0c() {
        C25272CcK ccK;
        setScrollState(0);
        C37991qW r1 = this.A0x;
        r1.A06.removeCallbacks(r1);
        r1.A03.abortAnimation();
        C38251qy r0 = this.A0D;
        if (r0 != null && (ccK = r0.A06) != null) {
            ccK.A02();
        }
    }

    public void A0e(int i) {
    }

    public void A0l(int i, int i2) {
        A0n(i, i2, false);
    }

    public void A0n(int i, int i2, boolean z) {
        C38251qy r1 = this.A0D;
        if (r1 == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.A0V) {
            int i3 = 0;
            if (!r1.A1I()) {
                i = 0;
            }
            if (!r1.A1J()) {
                i2 = 0;
            }
            if (i != 0 || i2 != 0) {
                if (z) {
                    if (i != 0) {
                        i3 = 1;
                    }
                    if (i2 != 0) {
                        i3 |= 2;
                    }
                    getScrollingChildHelper().A0D(i3, 1);
                }
                this.A0x.A01((Interpolator) null, i, i2, Integer.MIN_VALUE);
            }
        }
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.A0D.A0f(rect, view, this, z, false);
    }

    public void setAdapter(C38391rD r3) {
        suppressLayout(false);
        A0C(r3, this, false, true);
        A0x(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(AnonymousClass3KA r2) {
        if (r2 != null) {
            this.A0l = r2;
            setChildrenDrawingOrderEnabled(true);
        }
    }

    public static C42011xT A02(View view) {
        if (view == null) {
            return null;
        }
        return ((C38491rN) view.getLayoutParams()).A00;
    }

    public static RecyclerView A03(View view) {
        if (view instanceof ViewGroup) {
            if (view instanceof RecyclerView) {
                return (RecyclerView) view;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                RecyclerView A032 = A03(viewGroup.getChildAt(i));
                if (A032 != null) {
                    return A032;
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v17, resolved type: X.1xV} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v18, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v23, resolved type: X.1xV} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v25, resolved type: X.1xV} */
    /* JADX WARNING: type inference failed for: r2v12, types: [X.2iU, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v47, types: [X.2iU, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A04() {
        /*
            r11 = this;
            X.1qZ r5 = r11.A0w
            r4 = 1
            r5.A01(r4)
            int r1 = r11.getScrollState()
            r0 = 2
            if (r1 != r0) goto L_0x001d
            X.1qW r0 = r11.A0x
            android.widget.OverScroller r0 = r0.A03
            r0.getFinalX()
            r0.getCurrX()
            r0.getFinalY()
            r0.getCurrY()
        L_0x001d:
            r6 = 0
            r5.A09 = r6
            r11.A0b()
            X.1qR r3 = r11.A0z
            X.00O r7 = r3.A01
            r7.clear()
            X.00p r2 = r3.A00
            r2.A07()
            int r0 = r11.A01
            int r0 = r0 + 1
            r11.A01 = r0
            r11.A06()
            boolean r0 = r11.A0Y
            if (r0 == 0) goto L_0x00a1
            boolean r0 = r11.hasFocus()
            if (r0 == 0) goto L_0x00a1
            X.1rD r0 = r11.A0B
            if (r0 == 0) goto L_0x00a1
            android.view.View r0 = r11.getFocusedChild()
            if (r0 == 0) goto L_0x00a1
            android.view.View r0 = r11.A0N(r0)
            if (r0 == 0) goto L_0x00a1
            X.1xT r8 = r11.A0Q(r0)
            if (r8 == 0) goto L_0x00a1
            X.1rD r0 = r11.A0B
            boolean r0 = r0.A00
            if (r0 == 0) goto L_0x009b
            long r0 = r8.A07
        L_0x0060:
            r5.A07 = r0
            boolean r0 = r11.A0O
            if (r0 == 0) goto L_0x008d
            r0 = -1
        L_0x0067:
            r5.A01 = r0
            android.view.View r9 = r8.A0H
        L_0x006b:
            int r8 = r9.getId()
        L_0x006f:
            boolean r0 = r9.isFocused()
            if (r0 != 0) goto L_0x009e
            boolean r0 = r9 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x009e
            boolean r0 = r9.hasFocus()
            if (r0 == 0) goto L_0x009e
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
            android.view.View r9 = r9.getFocusedChild()
            int r1 = r9.getId()
            r0 = -1
            if (r1 == r0) goto L_0x006f
            goto L_0x006b
        L_0x008d:
            int r0 = r8.A00
            r0 = r0 & 8
            if (r0 == 0) goto L_0x0096
            int r0 = r8.A02
            goto L_0x0067
        L_0x0096:
            int r0 = r8.A05()
            goto L_0x0067
        L_0x009b:
            r0 = -1
            goto L_0x0060
        L_0x009e:
            r5.A02 = r8
            goto L_0x00aa
        L_0x00a1:
            r0 = -1
            r5.A07 = r0
            r0 = -1
            r5.A01 = r0
            r5.A02 = r0
        L_0x00aa:
            boolean r0 = r5.A0B
            if (r0 == 0) goto L_0x013c
            boolean r0 = r11.A0U
            if (r0 == 0) goto L_0x013c
        L_0x00b2:
            r5.A0D = r4
            r11.A0U = r6
            r11.A0T = r6
            boolean r0 = r5.A0A
            r5.A08 = r0
            X.1rD r0 = r11.A0B
            int r0 = r0.A0Q()
            r5.A03 = r0
            int[] r0 = r11.A14
            r11.A0H(r0)
            boolean r0 = r5.A0B
            if (r0 == 0) goto L_0x013f
            X.1qm r10 = r11.A08
            int r9 = r10.A03()
            r8 = 0
        L_0x00d4:
            if (r8 >= r9) goto L_0x013f
            android.view.View r0 = r10.A06(r8)
            X.1xT r4 = A02(r0)
            boolean r0 = r4.A0A()
            if (r0 != 0) goto L_0x00f0
            int r0 = r4.A00
            r0 = r0 & 4
            if (r0 == 0) goto L_0x00f3
            X.1rD r0 = r11.A0B
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x00f3
        L_0x00f0:
            int r8 = r8 + 1
            goto L_0x00d4
        L_0x00f3:
            int r0 = r4.A00
            r1 = r0 & 14
            r0 = r0 & 4
            if (r0 != 0) goto L_0x0102
            r0 = r1 & 4
            if (r0 != 0) goto L_0x0102
            r4.A05()
        L_0x0102:
            r4.A06()
            X.2iU r0 = new X.2iU
            r0.<init>()
            r0.A00(r4)
            r3.A01(r0, r4)
            boolean r0 = r5.A0D
            if (r0 == 0) goto L_0x00f0
            int r0 = r4.A00
            r0 = r0 & 2
            if (r0 == 0) goto L_0x00f0
            int r0 = r4.A00
            r0 = r0 & 8
            if (r0 != 0) goto L_0x00f0
            boolean r0 = r4.A0A()
            if (r0 != 0) goto L_0x00f0
            int r0 = r4.A00
            r0 = r0 & 4
            if (r0 != 0) goto L_0x00f0
            X.1rD r0 = r11.A0B
            boolean r0 = r0.A00
            if (r0 == 0) goto L_0x0138
            long r0 = r4.A07
        L_0x0134:
            r2.A0A(r0, r4)
            goto L_0x00f0
        L_0x0138:
            int r0 = r4.A04
            long r0 = (long) r0
            goto L_0x0134
        L_0x013c:
            r4 = 0
            goto L_0x00b2
        L_0x013f:
            boolean r0 = r5.A0A
            if (r0 == 0) goto L_0x01e5
            X.1qm r4 = r11.A08
            int r8 = r4.A04()
            r3 = 0
        L_0x014a:
            if (r3 >= r8) goto L_0x0166
            android.view.View r0 = r4.A07(r3)
            X.1xT r2 = A02(r0)
            boolean r0 = r2.A0A()
            if (r0 != 0) goto L_0x0163
            int r1 = r2.A02
            r0 = -1
            if (r1 != r0) goto L_0x0163
            int r0 = r2.A04
            r2.A02 = r0
        L_0x0163:
            int r3 = r3 + 1
            goto L_0x014a
        L_0x0166:
            boolean r2 = r5.A0C
            r5.A0C = r6
            X.1qy r1 = r11.A0D
            X.1qQ r0 = r11.A0v
            r1.A1D(r0, r5)
            r5.A0C = r2
            r3 = 0
        L_0x0174:
            int r0 = r4.A03()
            if (r3 >= r0) goto L_0x01e5
            android.view.View r0 = r4.A06(r3)
            X.1xT r8 = A02(r0)
            boolean r0 = r8.A0A()
            if (r0 != 0) goto L_0x0196
            java.lang.Object r0 = r7.get(r8)
            X.1xV r0 = (X.C42031xV) r0
            if (r0 == 0) goto L_0x0199
            int r0 = r0.A00
            r0 = r0 & 4
            if (r0 == 0) goto L_0x0199
        L_0x0196:
            int r3 = r3 + 1
            goto L_0x0174
        L_0x0199:
            int r0 = r8.A00
            r1 = r0 & 14
            r0 = r0 & 4
            if (r0 != 0) goto L_0x01a8
            r0 = r1 & 4
            if (r0 != 0) goto L_0x01a8
            r8.A05()
        L_0x01a8:
            r1 = 8192(0x2000, float:1.14794E-41)
            int r0 = r8.A00
            r1 = r1 & r0
            r0 = 0
            if (r1 == 0) goto L_0x01b1
            r0 = 1
        L_0x01b1:
            r8.A06()
            X.2iU r2 = new X.2iU
            r2.<init>()
            r2.A00(r8)
            if (r0 == 0) goto L_0x01c2
            r11.A0q(r2, r8)
            goto L_0x0196
        L_0x01c2:
            java.lang.Object r1 = r7.get(r8)
            X.1xV r1 = (X.C42031xV) r1
            if (r1 != 0) goto L_0x01dc
            X.1bR r0 = X.C42031xV.A03
            java.lang.Object r1 = r0.BAf()
            X.1xV r1 = (X.C42031xV) r1
            if (r1 != 0) goto L_0x01d9
            X.1xV r1 = new X.1xV
            r1.<init>()
        L_0x01d9:
            r7.put(r8, r1)
        L_0x01dc:
            int r0 = r1.A00
            r0 = r0 | 2
            r1.A00 = r0
            r1.A02 = r2
            goto L_0x0196
        L_0x01e5:
            X.1qm r4 = r11.A08
            int r3 = r4.A04()
            r2 = 0
        L_0x01ec:
            if (r2 >= r3) goto L_0x0204
            android.view.View r0 = r4.A07(r2)
            X.1xT r1 = A02(r0)
            boolean r0 = r1.A0A()
            if (r0 != 0) goto L_0x0201
            r0 = -1
            r1.A02 = r0
            r1.A05 = r0
        L_0x0201:
            int r2 = r2 + 1
            goto L_0x01ec
        L_0x0204:
            X.1qQ r8 = r11.A0v
            java.util.ArrayList r4 = r8.A06
            int r3 = r4.size()
            r7 = 0
            r2 = 0
        L_0x020e:
            if (r2 >= r3) goto L_0x021e
            java.lang.Object r1 = r4.get(r2)
            X.1xT r1 = (X.C42011xT) r1
            r0 = -1
            r1.A02 = r0
            r1.A05 = r0
            int r2 = r2 + 1
            goto L_0x020e
        L_0x021e:
            java.util.ArrayList r4 = r8.A05
            int r3 = r4.size()
            r2 = 0
        L_0x0225:
            if (r2 >= r3) goto L_0x0235
            java.lang.Object r1 = r4.get(r2)
            X.1xT r1 = (X.C42011xT) r1
            r0 = -1
            r1.A02 = r0
            r1.A05 = r0
            int r2 = r2 + 1
            goto L_0x0225
        L_0x0235:
            java.util.ArrayList r3 = r8.A04
            if (r3 == 0) goto L_0x024d
            int r2 = r3.size()
        L_0x023d:
            if (r7 >= r2) goto L_0x024d
            java.lang.Object r1 = r3.get(r7)
            X.1xT r1 = (X.C42011xT) r1
            r0 = -1
            r1.A02 = r0
            r1.A05 = r0
            int r7 = r7 + 1
            goto L_0x023d
        L_0x024d:
            r0 = 1
            r11.A0w(r0)
            r11.A0y(r6)
            r0 = 2
            r5.A04 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.A04():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0039, code lost:
        if (r4.A0U != false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0050, code lost:
        if (r0 != false) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0027, code lost:
        if (r4.A0D.A1L() == false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A06() {
        /*
            r4 = this;
            boolean r0 = r4.A0O
            if (r0 == 0) goto L_0x001c
            X.1qi r1 = r4.A07
            java.util.ArrayList r0 = r1.A04
            r1.A09(r0)
            java.util.ArrayList r0 = r1.A05
            r1.A09(r0)
            r0 = 0
            r1.A00 = r0
            boolean r0 = r4.A0P
            if (r0 == 0) goto L_0x001c
            X.1qy r0 = r4.A0D
            r0.A0z()
        L_0x001c:
            X.1qT r0 = r4.A0C
            if (r0 == 0) goto L_0x0029
            X.1qy r0 = r4.A0D
            boolean r0 = r0.A1L()
            r1 = 1
            if (r0 != 0) goto L_0x002a
        L_0x0029:
            r1 = 0
        L_0x002a:
            X.1qi r0 = r4.A07
            if (r1 == 0) goto L_0x0074
            r0.A07()
        L_0x0031:
            boolean r0 = r4.A0T
            r3 = 0
            if (r0 != 0) goto L_0x003b
            boolean r0 = r4.A0U
            r2 = 0
            if (r0 == 0) goto L_0x003c
        L_0x003b:
            r2 = 1
        L_0x003c:
            X.1qZ r1 = r4.A0w
            boolean r0 = r4.A0Q
            if (r0 == 0) goto L_0x0072
            X.1qT r0 = r4.A0C
            if (r0 == 0) goto L_0x0072
            boolean r0 = r4.A0O
            if (r0 != 0) goto L_0x006d
            if (r2 != 0) goto L_0x0052
            X.1qy r0 = r4.A0D
            boolean r0 = r0.A0C
        L_0x0050:
            if (r0 == 0) goto L_0x0072
        L_0x0052:
            r0 = 1
        L_0x0053:
            r1.A0B = r0
            if (r0 == 0) goto L_0x006a
            if (r2 == 0) goto L_0x006a
            boolean r0 = r4.A0O
            if (r0 != 0) goto L_0x006a
            X.1qT r0 = r4.A0C
            if (r0 == 0) goto L_0x006a
            X.1qy r0 = r4.A0D
            boolean r0 = r0.A1L()
            if (r0 == 0) goto L_0x006a
            r3 = 1
        L_0x006a:
            r1.A0A = r3
            return
        L_0x006d:
            X.1rD r0 = r4.A0B
            boolean r0 = r0.A00
            goto L_0x0050
        L_0x0072:
            r0 = 0
            goto L_0x0053
        L_0x0074:
            r0.A06()
            goto L_0x0031
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.A06():void");
    }

    private void A07() {
        boolean z;
        VelocityTracker velocityTracker = this.A0j;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        A0h(0);
        EdgeEffect edgeEffect = this.A04;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = this.A04.isFinished();
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = this.A06;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z |= this.A06.isFinished();
        }
        EdgeEffect edgeEffect3 = this.A05;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z |= this.A05.isFinished();
        }
        EdgeEffect edgeEffect4 = this.A03;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z |= this.A03.isFinished();
        }
        if (z) {
            postInvalidateOnAnimation();
        }
    }

    public static void A0C(C38391rD r5, RecyclerView recyclerView, boolean z, boolean z2) {
        C38391rD r0 = recyclerView.A0B;
        if (r0 != null) {
            r0.A01.unregisterObserver(recyclerView.A17);
            recyclerView.A0B.A0T(recyclerView);
        }
        if (!z || z2) {
            recyclerView.A0a();
        }
        C38111qi r1 = recyclerView.A07;
        r1.A09(r1.A04);
        r1.A09(r1.A05);
        r1.A00 = 0;
        C38391rD r4 = recyclerView.A0B;
        recyclerView.A0B = r5;
        if (r5 != null) {
            r5.CDq(recyclerView.A17);
            r5.A0S(recyclerView);
        }
        C38251qy r2 = recyclerView.A0D;
        if (r2 != null) {
            C38391rD r12 = recyclerView.A0B;
            if (r2 instanceof StickyHeadersLinearLayoutManager) {
                StickyHeadersLinearLayoutManager.A0E(r12, (StickyHeadersLinearLayoutManager) r2);
            }
        }
        C37931qQ r3 = recyclerView.A0v;
        C38391rD r22 = recyclerView.A0B;
        r3.A05.clear();
        r3.A04();
        C38441rI r13 = r3.A02;
        if (r13 == null) {
            r13 = new C38441rI();
            r3.A02 = r13;
        }
        if (r4 != null) {
            r13.A00--;
        }
        if (!z && r13.A00 == 0) {
            r13.A01();
        }
        if (r22 != null) {
            r13.A00++;
        }
        recyclerView.A0w.A0C = true;
    }

    public static void A0D(C42011xT r3) {
        WeakReference weakReference = r3.A0C;
        if (weakReference != null) {
            Object obj = weakReference.get();
            while (true) {
                View view = (View) obj;
                while (true) {
                    if (view == null) {
                        r3.A0C = null;
                        return;
                    } else if (view != r3.A0H) {
                        obj = view.getParent();
                        if (!(obj instanceof View)) {
                            view = null;
                        }
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public static void A0E(C42011xT r6, RecyclerView recyclerView) {
        View view = r6.A0H;
        boolean z = false;
        if (view.getParent() == recyclerView) {
            z = true;
        }
        recyclerView.A0v.A0A(recyclerView.A0Q(view));
        boolean z2 = false;
        if ((r6.A00 & 256) != 0) {
            z2 = true;
        }
        C38151qm r2 = recyclerView.A08;
        if (z2) {
            r2.A0B(view, view.getLayoutParams(), -1, true);
        } else if (!z) {
            r2.A0A(view, -1, true);
        } else {
            int indexOfChild = ((C38141ql) r2.A01).A00.indexOfChild(view);
            if (indexOfChild >= 0) {
                r2.A00.A04(indexOfChild);
                C38151qm.A01(view, r2);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("view is not a child, cannot hide ");
            sb.append(view);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    private void A0H(int[] iArr) {
        C38151qm r9 = this.A08;
        int A032 = r9.A03();
        if (A032 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < A032; i3++) {
            C42011xT A022 = A02(r9.A06(i3));
            if (!A022.A0A()) {
                int i4 = A022.A05;
                if (i4 == -1) {
                    i4 = A022.A04;
                }
                if (i4 < i) {
                    i = i4;
                }
                if (i4 > i2) {
                    i2 = i4;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    private C38201qr getScrollingChildHelper() {
        C38201qr r0 = this.A0k;
        if (r0 != null) {
            return r0;
        }
        C38201qr r02 = new C38201qr(this);
        this.A0k = r02;
        return r02;
    }

    public int A0K(C42011xT r8) {
        int i = r8.A00;
        if ((524 & i) == 0 && (i & 1) != 0) {
            C38111qi r0 = this.A07;
            int i2 = r8.A04;
            ArrayList arrayList = r0.A04;
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                C38481rM r6 = (C38481rM) arrayList.get(i3);
                int i4 = r6.A00;
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 == 8) {
                            if (r6.A02 == i2) {
                                i2 = r6.A01;
                            } else {
                                if (r6.A02 < i2) {
                                    i2--;
                                }
                                if (r6.A01 <= i2) {
                                    i2++;
                                }
                            }
                        }
                    } else if (r6.A02 > i2) {
                        continue;
                    } else if (r6.A02 + r6.A01 <= i2) {
                        i2 -= r6.A01;
                    }
                } else if (r6.A02 <= i2) {
                    i2 += r6.A01;
                }
            }
            return i2;
        }
        return -1;
    }

    public View A0M(float f, float f2) {
        C38151qm r2 = this.A08;
        int A032 = r2.A03();
        while (true) {
            A032--;
            if (A032 < 0) {
                return null;
            }
            View A062 = r2.A06(A032);
            float translationX = A062.getTranslationX();
            float translationY = A062.getTranslationY();
            if (f >= ((float) A062.getLeft()) + translationX && f <= ((float) A062.getRight()) + translationX && f2 >= ((float) A062.getTop()) + translationY && f2 <= ((float) A062.getBottom()) + translationY) {
                return A062;
            }
        }
    }

    public C42011xT A0O(int i) {
        C42011xT r1 = null;
        if (!this.A0O) {
            C38151qm r5 = this.A08;
            int A042 = r5.A04();
            for (int i2 = 0; i2 < A042; i2++) {
                C42011xT A022 = A02(r5.A07(i2));
                if (A022 != null && (A022.A00 & 8) == 0 && A0K(A022) == i) {
                    if (!r5.A02.contains(A022.A0H)) {
                        return A022;
                    }
                    r1 = A022;
                }
            }
        }
        return r1;
    }

    public C42011xT A0P(int i, boolean z) {
        int i2;
        C38151qm r6 = this.A08;
        int A042 = r6.A04();
        C42011xT r4 = null;
        for (int i3 = 0; i3 < A042; i3++) {
            C42011xT A022 = A02(r6.A07(i3));
            if (A022 != null && (A022.A00 & 8) == 0) {
                if (z || (i2 = A022.A05) == -1) {
                    i2 = A022.A04;
                }
                if (i2 == i) {
                    if (!r6.A02.contains(A022.A0H)) {
                        return A022;
                    }
                    r4 = A022;
                } else {
                    continue;
                }
            }
        }
        return r4;
    }

    public String A0R() {
        StringBuilder sb = new StringBuilder();
        sb.append(" ");
        sb.append(super.toString());
        sb.append(", adapter:");
        sb.append(this.A0B);
        sb.append(", layout:");
        sb.append(this.A0D);
        sb.append(", context:");
        sb.append(getContext());
        return sb.toString();
    }

    public void A0S() {
        if (this.A0Q && !this.A0O) {
            C38111qi r5 = this.A07;
            ArrayList arrayList = r5.A04;
            if (arrayList.size() > 0) {
                int i = r5.A00;
                if ((4 & i) != 0 && (11 & i) == 0) {
                    Method method = AnonymousClass1CH.A03;
                    Trace.beginSection("RV PartialInvalidate");
                    A0b();
                    this.A01++;
                    r5.A07();
                    if (!this.A0W) {
                        C38151qm r4 = this.A08;
                        int A032 = r4.A03();
                        int i2 = 0;
                        while (true) {
                            if (i2 < A032) {
                                C42011xT A022 = A02(r4.A06(i2));
                                if (A022 != null && !A022.A0A() && (A022.A00 & 2) != 0) {
                                    A0T();
                                    break;
                                }
                                i2++;
                            } else {
                                r5.A05();
                                break;
                            }
                        }
                    }
                    A0y(true);
                    A0w(true);
                    Trace.endSection();
                } else if (arrayList.size() <= 0) {
                    return;
                }
            } else {
                return;
            }
        }
        Method method2 = AnonymousClass1CH.A03;
        Trace.beginSection("RV FullInvalidate");
        A0T();
        Trace.endSection();
    }

    /* JADX WARNING: type inference failed for: r14v5, types: [X.2iU, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x0405, code lost:
        if (r5.A08.A02.contains(getFocusedChild()) == false) goto L_0x03e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x0444, code lost:
        if (r1 != null) goto L_0x0446;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x0454, code lost:
        if (r6.hasFocusable() != false) goto L_0x0492;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x0492, code lost:
        r3 = r4.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x0497, code lost:
        if (((long) r3) == -1) goto L_0x04a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x0499, code lost:
        r1 = r6.findViewById(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x049d, code lost:
        if (r1 == null) goto L_0x04a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x04a3, code lost:
        if (r1.isFocusable() == false) goto L_0x04a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x04a5, code lost:
        r6 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x04a6, code lost:
        r6.requestFocus();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x009b, code lost:
        if ((r0.A00 & 1) != 0) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00ab, code lost:
        if ((r0.A00 & 1) != 0) goto L_0x00ad;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x038c  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x0393  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x03f9  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x0420  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x0450  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x045e  */
    /* JADX WARNING: Removed duplicated region for block: B:250:0x0444 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0T() {
        /*
            r21 = this;
            r5 = r21
            X.1rD r0 = r5.A0B
            java.lang.String r19 = "RecyclerView"
            if (r0 != 0) goto L_0x0010
            java.lang.String r1 = "No adapter attached; skipping layout"
        L_0x000a:
            r0 = r19
            android.util.Log.e(r0, r1)
            return
        L_0x0010:
            X.1qy r2 = r5.A0D
            if (r2 != 0) goto L_0x0017
            java.lang.String r1 = "No layout manager attached; skipping layout"
            goto L_0x000a
        L_0x0017:
            X.1qZ r4 = r5.A0w
            r0 = 0
            r4.A09 = r0
            int r1 = r4.A04
            r0 = 1
            if (r1 != r0) goto L_0x01d2
            r5.A04()
        L_0x0024:
            X.1qy r3 = r5.A0D
            int r0 = r5.getWidth()
            r2 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r2)
            int r0 = r5.getHeight()
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r2)
            r3.A0R(r1, r0)
            r5.A05()
        L_0x003e:
            r0 = 4
            r4.A01(r0)
            r5.A0b()
            int r0 = r5.A01
            int r0 = r0 + 1
            r5.A01 = r0
            r6 = 1
            r4.A04 = r6
            boolean r0 = r4.A0B
            if (r0 == 0) goto L_0x0370
            X.1qm r8 = r5.A08
            int r7 = r8.A03()
            int r7 = r7 - r6
        L_0x0059:
            if (r7 < 0) goto L_0x0233
            android.view.View r0 = r8.A06(r7)
            X.1xT r9 = A02(r0)
            boolean r0 = r9.A0A()
            if (r0 != 0) goto L_0x00b4
            X.1rD r0 = r5.A0B
            boolean r0 = r0.A00
            if (r0 == 0) goto L_0x01cd
            long r2 = r9.A07
        L_0x0071:
            X.2iU r14 = new X.2iU
            r14.<init>()
            r14.A00(r9)
            X.1qR r13 = r5.A0z
            X.00p r0 = r13.A00
            java.lang.Object r10 = r0.A05(r2)
            X.1xT r10 = (X.C42011xT) r10
            if (r10 == 0) goto L_0x00b1
            boolean r0 = r10.A0A()
            if (r0 != 0) goto L_0x00b1
            X.00O r12 = r13.A01
            java.lang.Object r0 = r12.get(r10)
            X.1xV r0 = (X.C42031xV) r0
            if (r0 == 0) goto L_0x01c9
            int r0 = r0.A00
            r18 = 1
            r0 = r0 & 1
            if (r0 == 0) goto L_0x01c9
        L_0x009d:
            java.lang.Object r0 = r12.get(r9)
            X.1xV r0 = (X.C42031xV) r0
            if (r0 == 0) goto L_0x01c5
            int r0 = r0.A00
            r17 = 1
            r0 = r0 & 1
            if (r0 == 0) goto L_0x01c5
        L_0x00ad:
            if (r18 == 0) goto L_0x00b7
            if (r10 != r9) goto L_0x00b7
        L_0x00b1:
            r13.A00(r14, r9)
        L_0x00b4:
            int r7 = r7 + -1
            goto L_0x0059
        L_0x00b7:
            int r15 = r12.A02(r10)
            r11 = 0
            if (r15 < 0) goto L_0x00e6
            java.lang.Object r1 = r12.A06(r15)
            X.1xV r1 = (X.C42031xV) r1
            if (r1 == 0) goto L_0x00e6
            int r0 = r1.A00
            r16 = r0 & 4
            if (r16 == 0) goto L_0x00e6
            r0 = r0 & -5
            r1.A00 = r0
            X.2iU r11 = r1.A02
            r0 = r0 & 12
            if (r0 != 0) goto L_0x00e6
            r12.A05(r15)
            r0 = 0
            r1.A00 = r0
            r0 = 0
            r1.A02 = r0
            r1.A01 = r0
            X.1bR r0 = X.C42031xV.A03
            r0.CEF(r1)
        L_0x00e6:
            r13.A00(r14, r9)
            int r14 = r12.A02(r9)
            r13 = 0
            if (r14 < 0) goto L_0x0118
            java.lang.Object r1 = r12.A06(r14)
            X.1xV r1 = (X.C42031xV) r1
            if (r1 == 0) goto L_0x0118
            int r15 = r1.A00
            r0 = r15 & 8
            if (r0 == 0) goto L_0x0118
            r0 = r15 & -9
            r1.A00 = r0
            X.2iU r13 = r1.A01
            r0 = r0 & 12
            if (r0 != 0) goto L_0x0118
            r12.A05(r14)
            r0 = 0
            r1.A00 = r0
            r0 = 0
            r1.A02 = r0
            r1.A01 = r0
            X.1bR r0 = X.C42031xV.A03
            r0.CEF(r1)
        L_0x0118:
            if (r11 != 0) goto L_0x018d
            int r14 = r8.A03()
            r13 = 0
        L_0x011f:
            if (r13 >= r14) goto L_0x0166
            android.view.View r0 = r8.A06(r13)
            X.1xT r11 = A02(r0)
            if (r11 == r9) goto L_0x0163
            X.1rD r0 = r5.A0B
            boolean r12 = r0.A00
            if (r12 == 0) goto L_0x015f
            long r0 = r11.A07
        L_0x0133:
            int r15 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r15 != 0) goto L_0x0163
            java.lang.String r2 = " \n View Holder 2:"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            if (r12 == 0) goto L_0x0211
            r1.<init>()
            java.lang.String r0 = "Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:"
            r1.append(r0)
            r1.append(r11)
            r1.append(r2)
            r1.append(r9)
            java.lang.String r0 = r5.A0R()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x015f:
            int r0 = r11.A04
            long r0 = (long) r0
            goto L_0x0133
        L_0x0163:
            int r13 = r13 + 1
            goto L_0x011f
        L_0x0166:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Problem while matching changed view holders with the newones. The pre-layout information for the change holder "
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = " cannot be found but it is necessary for "
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = r5.A0R()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            r0 = r19
            android.util.Log.e(r0, r1)
            goto L_0x00b4
        L_0x018d:
            r1 = 0
            r10.A09(r1)
            if (r18 == 0) goto L_0x0196
            A0E(r10, r5)
        L_0x0196:
            if (r10 == r9) goto L_0x01ac
            if (r17 == 0) goto L_0x019d
            A0E(r9, r5)
        L_0x019d:
            r10.A09 = r9
            A0E(r10, r5)
            X.1qQ r0 = r5.A0v
            r0.A0A(r10)
            r9.A09(r1)
            r9.A0A = r10
        L_0x01ac:
            X.1qT r0 = r5.A0C
            boolean r0 = r0.A0H(r11, r13, r10, r9)
            if (r0 == 0) goto L_0x00b4
            boolean r0 = r5.A0X
            if (r0 != 0) goto L_0x00b4
            boolean r0 = r5.A0S
            if (r0 == 0) goto L_0x00b4
            java.lang.Runnable r0 = r5.A0J
            r5.postOnAnimation(r0)
            r5.A0X = r6
            goto L_0x00b4
        L_0x01c5:
            r17 = 0
            goto L_0x00ad
        L_0x01c9:
            r18 = 0
            goto L_0x009d
        L_0x01cd:
            int r0 = r9.A04
            long r2 = (long) r0
            goto L_0x0071
        L_0x01d2:
            X.1qi r1 = r5.A07
            java.util.ArrayList r0 = r1.A05
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x01e6
            java.util.ArrayList r0 = r1.A04
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x01e6
            goto L_0x0024
        L_0x01e6:
            int r1 = r2.A03
            int r0 = r5.getWidth()
            if (r1 != r0) goto L_0x0024
            X.1qy r0 = r5.A0D
            int r1 = r0.A00
            int r0 = r5.getHeight()
            if (r1 != r0) goto L_0x0024
            X.1qy r3 = r5.A0D
            int r0 = r5.getWidth()
            r2 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r2)
            int r0 = r5.getHeight()
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r2)
            r3.A0R(r1, r0)
            goto L_0x003e
        L_0x0211:
            r1.<init>()
            java.lang.String r0 = "Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:"
            r1.append(r0)
            r1.append(r11)
            r1.append(r2)
            r1.append(r9)
            java.lang.String r0 = r5.A0R()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0233:
            X.1qR r0 = r5.A0z
            X.1qc r10 = r5.A0y
            X.00O r9 = r0.A01
            int r8 = r9.size()
        L_0x023d:
            int r8 = r8 + -1
            if (r8 < 0) goto L_0x0370
            java.lang.Object r7 = r9.A04(r8)
            X.1xT r7 = (X.C42011xT) r7
            java.lang.Object r3 = r9.A05(r8)
            X.1xV r3 = (X.C42031xV) r3
            int r0 = r3.A00
            r1 = 3
            r0 = r0 & 3
            if (r0 == r1) goto L_0x035d
            int r0 = r3.A00
            r0 = r0 & 1
            if (r0 == 0) goto L_0x02d9
            X.2iU r0 = r3.A02
            if (r0 == 0) goto L_0x035d
            X.2iU r2 = r3.A02
            X.2iU r1 = r3.A01
        L_0x0262:
            r0 = r10
            X.1qd r0 = (X.C38061qd) r0
            androidx.recyclerview.widget.RecyclerView r12 = r0.A00
            X.1qQ r0 = r12.A0v
            r0.A0A(r7)
            A0E(r7, r12)
            r0 = 0
            r7.A09(r0)
            X.1qT r13 = r12.A0C
            X.1qU r13 = (X.C37971qU) r13
            int r0 = r2.A00
            r19 = r0
            int r14 = r2.A01
            android.view.View r11 = r7.A0H
            if (r1 != 0) goto L_0x02d4
            int r2 = r11.getLeft()
            int r1 = r11.getTop()
        L_0x0289:
            int r0 = r7.A00
            r0 = r0 & 8
            if (r0 != 0) goto L_0x02cf
            r0 = r19
            if (r0 != r2) goto L_0x0295
            if (r14 == r1) goto L_0x02cf
        L_0x0295:
            int r15 = r11.getWidth()
            int r15 = r15 + r2
            int r0 = r11.getHeight()
            int r0 = r0 + r1
            r11.layout(r2, r1, r15, r0)
            r17 = r2
            r18 = r1
            r16 = r14
            r14 = r7
            r15 = r19
            boolean r0 = r13.A0L(r14, r15, r16, r17, r18)
        L_0x02af:
            if (r0 == 0) goto L_0x02c0
            boolean r0 = r12.A0X
            if (r0 != 0) goto L_0x02c0
            boolean r0 = r12.A0S
            if (r0 == 0) goto L_0x02c0
            java.lang.Runnable r0 = r12.A0J
            r12.postOnAnimation(r0)
            r12.A0X = r6
        L_0x02c0:
            r0 = 0
            r3.A00 = r0
            r0 = 0
            r3.A02 = r0
            r3.A01 = r0
            X.1bR r0 = X.C42031xV.A03
            r0.CEF(r3)
            goto L_0x023d
        L_0x02cf:
            boolean r0 = r13.A0I(r7)
            goto L_0x02af
        L_0x02d4:
            int r2 = r1.A00
            int r1 = r1.A01
            goto L_0x0289
        L_0x02d9:
            int r0 = r3.A00
            r1 = 14
            r0 = r0 & 14
            if (r0 == r1) goto L_0x0324
            int r0 = r3.A00
            r1 = 12
            r0 = r0 & 12
            if (r0 != r1) goto L_0x0313
            X.2iU r11 = r3.A02
            X.2iU r2 = r3.A01
            r1 = r10
            X.1qd r1 = (X.C38061qd) r1
            r0 = 0
            r7.A09(r0)
            androidx.recyclerview.widget.RecyclerView r12 = r1.A00
            boolean r0 = r12.A0O
            X.1qT r15 = r12.A0C
            if (r0 == 0) goto L_0x0301
            boolean r0 = r15.A0H(r11, r2, r7, r7)
            goto L_0x02af
        L_0x0301:
            X.1qU r15 = (X.C37971qU) r15
            int r14 = r11.A00
            int r13 = r2.A00
            if (r14 != r13) goto L_0x0343
            int r1 = r11.A01
            int r0 = r2.A01
            if (r1 != r0) goto L_0x0343
            r15.A08(r7)
            goto L_0x02c0
        L_0x0313:
            int r0 = r3.A00
            r0 = r0 & 4
            if (r0 == 0) goto L_0x031e
            X.2iU r2 = r3.A02
            r1 = 0
            goto L_0x0262
        L_0x031e:
            int r0 = r3.A00
            r0 = r0 & 8
            if (r0 == 0) goto L_0x02c0
        L_0x0324:
            X.2iU r11 = r3.A02
            X.2iU r2 = r3.A01
            r0 = r10
            X.1qd r0 = (X.C38061qd) r0
            androidx.recyclerview.widget.RecyclerView r12 = r0.A00
            r0 = 0
            r7.A09(r0)
            X.1qT r15 = r12.A0C
            X.1qU r15 = (X.C37971qU) r15
            if (r11 == 0) goto L_0x0357
            int r14 = r11.A00
            int r13 = r2.A00
            if (r14 != r13) goto L_0x0343
            int r1 = r11.A01
            int r0 = r2.A01
            if (r1 == r0) goto L_0x0357
        L_0x0343:
            int r1 = r11.A01
            int r0 = r2.A01
            r19 = r13
            r20 = r0
            r18 = r1
            r16 = r7
            r17 = r14
            boolean r0 = r15.A0L(r16, r17, r18, r19, r20)
            goto L_0x02af
        L_0x0357:
            boolean r0 = r15.A0K(r7)
            goto L_0x02af
        L_0x035d:
            r0 = r10
            X.1qd r0 = (X.C38061qd) r0
            androidx.recyclerview.widget.RecyclerView r0 = r0.A00
            X.1qy r2 = r0.A0D
            android.view.View r1 = r7.A0H
            X.1qQ r0 = r0.A0v
            r2.A0V(r1)
            r0.A07(r1)
            goto L_0x02c0
        L_0x0370:
            X.1qy r0 = r5.A0D
            X.1qQ r2 = r5.A0v
            r0.A0c(r2)
            int r0 = r4.A03
            r4.A05 = r0
            r7 = 0
            r5.A0O = r7
            r5.A0P = r7
            r4.A0B = r7
            r4.A0A = r7
            X.1qy r1 = r5.A0D
            r1.A0C = r7
            java.util.ArrayList r0 = r2.A04
            if (r0 == 0) goto L_0x038f
            r0.clear()
        L_0x038f:
            boolean r0 = r1.A0B
            if (r0 == 0) goto L_0x039a
            r1.A02 = r7
            r1.A0B = r7
            r2.A05()
        L_0x039a:
            X.1qy r0 = r5.A0D
            r0.A1F(r4)
            r5.A0w(r6)
            r5.A0y(r7)
            X.1qR r1 = r5.A0z
            X.00O r0 = r1.A01
            r0.clear()
            X.00p r0 = r1.A00
            r0.A07()
            int[] r3 = r5.A14
            r2 = r3[r7]
            r1 = r3[r6]
            r5.A0H(r3)
            r0 = r3[r7]
            if (r0 != r2) goto L_0x03c2
            r0 = r3[r6]
            if (r0 == r1) goto L_0x03c5
        L_0x03c2:
            r5.A0k(r7, r7)
        L_0x03c5:
            boolean r0 = r5.A0Y
            if (r0 == 0) goto L_0x03e9
            X.1rD r0 = r5.A0B
            if (r0 == 0) goto L_0x03e9
            boolean r0 = r5.hasFocus()
            if (r0 == 0) goto L_0x03e9
            int r1 = r5.getDescendantFocusability()
            r0 = 393216(0x60000, float:5.51013E-40)
            if (r1 == r0) goto L_0x03e9
            int r1 = r5.getDescendantFocusability()
            r0 = 131072(0x20000, float:1.83671E-40)
            if (r1 != r0) goto L_0x03f3
            boolean r0 = r5.isFocused()
            if (r0 == 0) goto L_0x03f3
        L_0x03e9:
            r0 = -1
            r4.A07 = r0
            r0 = -1
            r4.A01 = r0
            r4.A02 = r0
            return
        L_0x03f3:
            boolean r0 = r5.isFocused()
            if (r0 != 0) goto L_0x0408
            android.view.View r1 = r5.getFocusedChild()
            X.1qm r0 = r5.A08
            java.util.List r0 = r0.A02
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x0408
            goto L_0x03e9
        L_0x0408:
            long r2 = r4.A07
            r12 = -1
            int r0 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r0 == 0) goto L_0x0456
            X.1rD r0 = r5.A0B
            boolean r0 = r0.A00
            if (r0 == 0) goto L_0x0456
            r1 = 0
            X.1qm r10 = r5.A08
            int r11 = r10.A04()
            r9 = 0
        L_0x041e:
            if (r9 >= r11) goto L_0x0444
            android.view.View r0 = r10.A07(r9)
            X.1xT r8 = A02(r0)
            if (r8 == 0) goto L_0x0441
            int r0 = r8.A00
            r0 = r0 & 8
            if (r0 != 0) goto L_0x0441
            long r6 = r8.A07
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x0441
            android.view.View r1 = r8.A0H
            java.util.List r0 = r10.A02
            boolean r0 = r0.contains(r1)
            r1 = r8
            if (r0 == 0) goto L_0x0446
        L_0x0441:
            int r9 = r9 + 1
            goto L_0x041e
        L_0x0444:
            if (r1 == 0) goto L_0x0456
        L_0x0446:
            android.view.View r6 = r1.A0H
            java.util.List r0 = r10.A02
            boolean r0 = r0.contains(r6)
            if (r0 != 0) goto L_0x0456
            boolean r0 = r6.hasFocusable()
            if (r0 != 0) goto L_0x0492
        L_0x0456:
            X.1qm r0 = r5.A08
            int r0 = r0.A03()
            if (r0 <= 0) goto L_0x03e9
            int r3 = r4.A01
            r0 = -1
            if (r3 != r0) goto L_0x0464
            r3 = 0
        L_0x0464:
            int r2 = r4.A00()
            r1 = r3
        L_0x0469:
            if (r1 >= r2) goto L_0x047c
            X.1xT r0 = r5.A0O(r1)
            if (r0 == 0) goto L_0x047c
            android.view.View r6 = r0.A0H
            boolean r0 = r6.hasFocusable()
            if (r0 != 0) goto L_0x0492
            int r1 = r1 + 1
            goto L_0x0469
        L_0x047c:
            int r1 = java.lang.Math.min(r2, r3)
        L_0x0480:
            int r1 = r1 + -1
            if (r1 < 0) goto L_0x03e9
            X.1xT r0 = r5.A0O(r1)
            if (r0 == 0) goto L_0x03e9
            android.view.View r6 = r0.A0H
            boolean r0 = r6.hasFocusable()
            if (r0 == 0) goto L_0x0480
        L_0x0492:
            int r3 = r4.A02
            long r1 = (long) r3
            int r0 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r0 == 0) goto L_0x04a6
            android.view.View r1 = r6.findViewById(r3)
            if (r1 == 0) goto L_0x04a6
            boolean r0 = r1.isFocusable()
            if (r0 == 0) goto L_0x04a6
            r6 = r1
        L_0x04a6:
            r6.requestFocus()
            goto L_0x03e9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.A0T():void");
    }

    public void A0U() {
        int measuredHeight;
        if (this.A03 == null) {
            EdgeEffect edgeEffect = new EdgeEffect(getContext());
            this.A03 = edgeEffect;
            boolean z = this.A0N;
            int measuredWidth = getMeasuredWidth();
            if (z) {
                measuredWidth = (measuredWidth - getPaddingLeft()) - getPaddingRight();
                measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            } else {
                measuredHeight = getMeasuredHeight();
            }
            edgeEffect.setSize(measuredWidth, measuredHeight);
        }
    }

    public void A0V() {
        int measuredWidth;
        if (this.A04 == null) {
            EdgeEffect edgeEffect = new EdgeEffect(getContext());
            this.A04 = edgeEffect;
            boolean z = this.A0N;
            int measuredHeight = getMeasuredHeight();
            if (z) {
                measuredHeight = (measuredHeight - getPaddingTop()) - getPaddingBottom();
                measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            } else {
                measuredWidth = getMeasuredWidth();
            }
            edgeEffect.setSize(measuredHeight, measuredWidth);
        }
    }

    public void A0W() {
        int measuredWidth;
        if (this.A05 == null) {
            EdgeEffect edgeEffect = new EdgeEffect(getContext());
            this.A05 = edgeEffect;
            boolean z = this.A0N;
            int measuredHeight = getMeasuredHeight();
            if (z) {
                measuredHeight = (measuredHeight - getPaddingTop()) - getPaddingBottom();
                measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            } else {
                measuredWidth = getMeasuredWidth();
            }
            edgeEffect.setSize(measuredHeight, measuredWidth);
        }
    }

    public void A0X() {
        int measuredHeight;
        if (this.A06 == null) {
            EdgeEffect edgeEffect = new EdgeEffect(getContext());
            this.A06 = edgeEffect;
            boolean z = this.A0N;
            int measuredWidth = getMeasuredWidth();
            if (z) {
                measuredWidth = (measuredWidth - getPaddingLeft()) - getPaddingRight();
                measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            } else {
                measuredHeight = getMeasuredHeight();
            }
            edgeEffect.setSize(measuredWidth, measuredHeight);
        }
    }

    public void A0Y() {
        if (this.A11.size() != 0) {
            C38251qy r1 = this.A0D;
            if (r1 != null) {
                r1.A1H("Cannot invalidate item decorations during a scroll or layout");
            }
            A0Z();
            requestLayout();
        }
    }

    public void A0Z() {
        C38151qm r4 = this.A08;
        int A042 = r4.A04();
        for (int i = 0; i < A042; i++) {
            ((C38491rN) r4.A07(i).getLayoutParams()).A01 = true;
        }
        ArrayList arrayList = this.A0v.A06;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C38491rN r1 = (C38491rN) ((C42011xT) arrayList.get(i2)).A0H.getLayoutParams();
            if (r1 != null) {
                r1.A01 = true;
            }
        }
    }

    public void A0a() {
        C37961qT r0 = this.A0C;
        if (r0 != null) {
            r0.A0C();
        }
        C38251qy r02 = this.A0D;
        if (r02 != null) {
            C37931qQ r1 = this.A0v;
            r02.A0b(r1);
            this.A0D.A0c(r1);
        }
        C37931qQ r12 = this.A0v;
        r12.A05.clear();
        r12.A04();
    }

    public void A0b() {
        int i = this.A0e + 1;
        this.A0e = i;
        if (i == 1 && !this.A0V) {
            this.A0W = false;
        }
    }

    public void A0d(int i) {
        if (this.A0D != null) {
            setScrollState(2);
            this.A0D.A13(i);
            awakenScrollBars();
        }
    }

    public void A0f(int i) {
        if (!this.A0V) {
            A0c();
            C38251qy r0 = this.A0D;
            if (r0 == null) {
                Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
                return;
            }
            r0.A13(i);
            awakenScrollBars();
        }
    }

    public void A0g(int i) {
        if (!this.A0V) {
            C38251qy r0 = this.A0D;
            if (r0 == null) {
                Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            } else {
                r0.A1G(this, i);
            }
        }
    }

    public void A0i(int i, int i2) {
        boolean z;
        EdgeEffect edgeEffect = this.A04;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            z = false;
        } else {
            this.A04.onRelease();
            z = this.A04.isFinished();
        }
        EdgeEffect edgeEffect2 = this.A05;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.A05.onRelease();
            z |= this.A05.isFinished();
        }
        EdgeEffect edgeEffect3 = this.A06;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.A06.onRelease();
            z |= this.A06.isFinished();
        }
        EdgeEffect edgeEffect4 = this.A03;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.A03.onRelease();
            z |= this.A03.isFinished();
        }
        if (z) {
            postInvalidateOnAnimation();
        }
    }

    public void A0k(int i, int i2) {
        this.A0b++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        C39711tW r0 = this.A0G;
        if (r0 != null) {
            r0.A04(this, i, i2);
        }
        List list = this.A0L;
        if (list != null) {
            int size = list.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                ((C39711tW) this.A0L.get(size)).A04(this, i, i2);
            }
        }
        this.A0b--;
    }

    public void A0m(int i, int i2, boolean z) {
        int i3 = i + i2;
        C38151qm r8 = this.A08;
        int A042 = r8.A04();
        for (int i4 = 0; i4 < A042; i4++) {
            C42011xT A022 = A02(r8.A07(i4));
            if (A022 != null && !A022.A0A()) {
                int i5 = A022.A04;
                if (i5 >= i3) {
                    A022.A08(-i2, z);
                } else if (i5 >= i) {
                    A022.A00 = 8 | A022.A00;
                    A022.A08(-i2, z);
                    A022.A04 = i - 1;
                }
                this.A0w.A0C = true;
            }
        }
        C37931qQ r5 = this.A0v;
        ArrayList arrayList = r5.A06;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                C42011xT r2 = (C42011xT) arrayList.get(size);
                if (r2 != null) {
                    if (r2.A04 >= i3) {
                        r2.A08(-i2, z);
                    } else if (r2.A04 >= i) {
                        r2.A00 = 8 | r2.A00;
                        r5.A06(size);
                    }
                }
            } else {
                requestLayout();
                return;
            }
        }
    }

    public void A0q(C57072iU r4, C42011xT r5) {
        long j;
        int i = 0 | (r5.A00 & -8193);
        r5.A00 = i;
        if (this.A0w.A0D && (i & 2) != 0 && (i & 8) == 0 && !r5.A0A()) {
            if (this.A0B.A00) {
                j = r5.A07;
            } else {
                j = (long) r5.A04;
            }
            this.A0z.A00.A0A(j, r5);
        }
        this.A0z.A01(r4, r5);
    }

    public void A0r(C40611uz r3) {
        C38251qy r1 = this.A0D;
        if (r1 != null) {
            r1.A1H("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.A11;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(r3);
        A0Z();
        requestLayout();
    }

    public void A0s(C40611uz r4) {
        C38251qy r1 = this.A0D;
        if (r1 != null) {
            r1.A1H("Cannot remove item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.A11;
        arrayList.remove(r4);
        if (arrayList.isEmpty()) {
            boolean z = false;
            if (getOverScrollMode() == 2) {
                z = true;
            }
            setWillNotDraw(z);
        }
        A0Z();
        requestLayout();
    }

    public void A0t(C39711tW r2) {
        List list = this.A0L;
        if (list == null) {
            list = new ArrayList();
            this.A0L = list;
        }
        list.add(r2);
    }

    public void A0u(C39711tW r2) {
        List list = this.A0L;
        if (list != null) {
            list.remove(r2);
        }
    }

    public void A0v(String str) {
        if (this.A01 > 0) {
            if (str == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Cannot call this method while RecyclerView is computing a layout or scrolling");
                sb.append(A0R());
                throw new IllegalStateException(sb.toString());
            }
            throw new IllegalStateException(str);
        } else if (this.A0b > 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("");
            sb2.append(A0R());
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(sb2.toString()));
        }
    }

    public void A0w(boolean z) {
        int i;
        AccessibilityManager accessibilityManager;
        int i2 = this.A01 - 1;
        this.A01 = i2;
        if (i2 < 1) {
            this.A01 = 0;
            if (z) {
                int i3 = this.A00;
                this.A00 = 0;
                if (!(i3 == 0 || (accessibilityManager = this.A0u) == null || !accessibilityManager.isEnabled())) {
                    AccessibilityEvent obtain = AccessibilityEvent.obtain();
                    obtain.setEventType(EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH);
                    obtain.setContentChangeTypes(i3);
                    sendAccessibilityEventUnchecked(obtain);
                }
                List list = this.A13;
                int size = list.size();
                while (true) {
                    size--;
                    if (size >= 0) {
                        C42011xT r3 = (C42011xT) list.get(size);
                        if (r3.A0H.getParent() == this && !r3.A0A() && (i = r3.A03) != -1) {
                            r3.A0H.setImportantForAccessibility(i);
                            r3.A03 = -1;
                        }
                    } else {
                        list.clear();
                        return;
                    }
                }
            }
        }
    }

    public void A0x(boolean z) {
        this.A0P = z | this.A0P;
        this.A0O = true;
        C38151qm r5 = this.A08;
        int A042 = r5.A04();
        for (int i = 0; i < A042; i++) {
            C42011xT A022 = A02(r5.A07(i));
            if (A022 != null && !A022.A0A()) {
                A022.A00 = 6 | A022.A00;
            }
        }
        A0Z();
        C37931qQ r6 = this.A0v;
        ArrayList arrayList = r6.A06;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C42011xT r2 = (C42011xT) arrayList.get(i2);
            if (r2 != null) {
                int i3 = 6 | r2.A00;
                r2.A00 = i3;
                r2.A00 = 1024 | i3;
            }
        }
        C38391rD r0 = r6.A08.A0B;
        if (r0 == null || !r0.A00) {
            r6.A04();
        }
    }

    public void A0y(boolean z) {
        int i = this.A0e;
        if (i < 1) {
            this.A0e = 1;
            i = 1;
        }
        if (!z && !this.A0V) {
            this.A0W = false;
        }
        if (i == 1) {
            if (z && this.A0W && !this.A0V && this.A0D != null && this.A0B != null) {
                A0T();
            }
            if (!this.A0V) {
                this.A0W = false;
            }
        }
        this.A0e--;
    }

    public boolean A10() {
        if (!this.A0Q || this.A0O || this.A07.A04.size() > 0) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0046, code lost:
        if (r7 != false) goto L_0x0048;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A11(int r15, int r16) {
        /*
            r14 = this;
            r5 = r16
            X.1qy r1 = r14.A0D
            r6 = 0
            if (r1 != 0) goto L_0x000f
            java.lang.String r1 = "RecyclerView"
            java.lang.String r0 = "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument."
            android.util.Log.e(r1, r0)
        L_0x000e:
            return r6
        L_0x000f:
            boolean r0 = r14.A0V
            if (r0 != 0) goto L_0x000e
            boolean r8 = r1.A1I()
            boolean r7 = r1.A1J()
            if (r8 == 0) goto L_0x0025
            int r1 = java.lang.Math.abs(r15)
            int r0 = r14.A0q
            if (r1 >= r0) goto L_0x0026
        L_0x0025:
            r15 = 0
        L_0x0026:
            if (r7 == 0) goto L_0x0030
            int r1 = java.lang.Math.abs(r5)
            int r0 = r14.A0q
            if (r1 >= r0) goto L_0x0031
        L_0x0030:
            r5 = 0
        L_0x0031:
            if (r15 != 0) goto L_0x0036
            if (r5 != 0) goto L_0x0036
            return r6
        L_0x0036:
            float r4 = (float) r15
            float r2 = (float) r5
            X.1qr r0 = r14.getScrollingChildHelper()
            boolean r0 = r0.A0B(r4, r2)
            if (r0 != 0) goto L_0x000e
            r3 = 1
            if (r8 != 0) goto L_0x0048
            r1 = 0
            if (r7 == 0) goto L_0x0049
        L_0x0048:
            r1 = 1
        L_0x0049:
            r14.dispatchNestedFling(r4, r2, r1)
            X.2S0 r0 = r14.A0E
            if (r0 == 0) goto L_0x0057
            boolean r0 = r0.A03(r15, r5)
            if (r0 == 0) goto L_0x0057
            return r3
        L_0x0057:
            if (r1 == 0) goto L_0x000e
            if (r8 == 0) goto L_0x005c
            r6 = 1
        L_0x005c:
            if (r7 == 0) goto L_0x0060
            r6 = r6 | 2
        L_0x0060:
            X.1qr r0 = r14.getScrollingChildHelper()
            r0.A0D(r6, r3)
            int r2 = r14.A16
            int r1 = -r2
            int r0 = java.lang.Math.min(r15, r2)
            int r8 = java.lang.Math.max(r1, r0)
            int r0 = java.lang.Math.min(r5, r2)
            int r9 = java.lang.Math.max(r1, r0)
            X.1qW r4 = r14.A0x
            androidx.recyclerview.widget.RecyclerView r1 = r4.A06
            r0 = 2
            r1.setScrollState(r0)
            r0 = 0
            r4.A01 = r0
            r4.A00 = r0
            android.view.animation.Interpolator r0 = r4.A02
            android.view.animation.Interpolator r2 = A1A
            if (r0 == r2) goto L_0x009a
            r4.A02 = r2
            android.content.Context r1 = r1.getContext()
            android.widget.OverScroller r0 = new android.widget.OverScroller
            r0.<init>(r1, r2)
            r4.A03 = r0
        L_0x009a:
            android.widget.OverScroller r5 = r4.A03
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
            r11 = 2147483647(0x7fffffff, float:NaN)
            r6 = 0
            r7 = r6
            r12 = r10
            r13 = r11
            r5.fling(r6, r7, r8, r9, r10, r11, r12, r13)
            r4.A00()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.A11(int, int):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0101, code lost:
        if (r6 == 0.0f) goto L_0x00c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x004f, code lost:
        if (r0 != 0) goto L_0x0051;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00df  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A12(android.view.MotionEvent r26, int r27, int r28) {
        /*
            r25 = this;
            r3 = r25
            r3.A0S()
            X.1rD r0 = r3.A0B
            r16 = 1
            r24 = 0
            r5 = r27
            r4 = r28
            if (r0 == 0) goto L_0x011d
            int[] r0 = r3.A15
            r0[r24] = r24
            r0[r16] = r24
            r3.A0o(r5, r0, r4)
            r2 = r0[r24]
            r1 = r0[r16]
            int r9 = r27 - r2
            int r8 = r28 - r1
        L_0x0022:
            java.util.ArrayList r0 = r3.A11
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x002d
            r3.invalidate()
        L_0x002d:
            int[] r0 = r3.A15
            r0[r24] = r24
            r0[r16] = r24
            int[] r7 = r3.A19
            r21 = r1
            r22 = r9
            r23 = r8
            r18 = r7
            r19 = r0
            r20 = r2
            r17 = r3
            r17.A0z(r18, r19, r20, r21, r22, r23, r24)
            r6 = r0[r24]
            int r9 = r9 - r6
            r0 = r0[r16]
            int r8 = r8 - r0
            if (r6 != 0) goto L_0x0051
            r15 = 0
            if (r0 == 0) goto L_0x0052
        L_0x0051:
            r15 = 1
        L_0x0052:
            int r0 = r3.A0f
            r10 = r7[r24]
            int r0 = r0 - r10
            r3.A0f = r0
            int r0 = r3.A0g
            r7 = r7[r16]
            int r0 = r0 - r7
            r3.A0g = r0
            int[] r6 = r3.A18
            r0 = r6[r24]
            int r0 = r0 + r10
            r6[r24] = r0
            r0 = r6[r16]
            int r0 = r0 + r7
            r6[r16] = r0
            int r6 = r3.getOverScrollMode()
            r0 = 2
            if (r6 == r0) goto L_0x00c6
            if (r26 == 0) goto L_0x00c3
            r6 = 8194(0x2002, float:1.1482E-41)
            int r0 = r26.getSource()
            r0 = r0 & r6
            if (r0 == r6) goto L_0x00c3
            float r7 = r26.getX()
            float r9 = (float) r9
            float r10 = r26.getY()
            float r6 = (float) r8
            r14 = 1
            r8 = 1065353216(0x3f800000, float:1.0)
            r13 = 0
            int r0 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r0 >= 0) goto L_0x0104
            r3.A0V()
            android.widget.EdgeEffect r11 = r3.A04
            float r12 = -r9
            int r0 = r3.getWidth()
            float r0 = (float) r0
            float r12 = r12 / r0
            int r0 = r3.getHeight()
            float r0 = (float) r0
            float r10 = r10 / r0
            float r10 = r8 - r10
        L_0x00a4:
            X.C7Q.A00(r11, r12, r10)
        L_0x00a7:
            int r0 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r0 >= 0) goto L_0x00df
            r3.A0X()
            android.widget.EdgeEffect r8 = r3.A06
            float r6 = -r6
            int r0 = r3.getHeight()
            float r0 = (float) r0
            float r6 = r6 / r0
            int r0 = r3.getWidth()
            float r0 = (float) r0
            float r7 = r7 / r0
            X.C7Q.A00(r8, r6, r7)
        L_0x00c0:
            r3.postInvalidateOnAnimation()
        L_0x00c3:
            r3.A0i(r5, r4)
        L_0x00c6:
            if (r2 != 0) goto L_0x00ca
            if (r1 == 0) goto L_0x00cd
        L_0x00ca:
            r3.A0k(r2, r1)
        L_0x00cd:
            boolean r0 = r3.awakenScrollBars()
            if (r0 != 0) goto L_0x00d6
            r3.invalidate()
        L_0x00d6:
            if (r15 != 0) goto L_0x00de
            if (r2 != 0) goto L_0x00de
            if (r1 != 0) goto L_0x00de
            r16 = 0
        L_0x00de:
            return r16
        L_0x00df:
            int r0 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r0 <= 0) goto L_0x00f9
            r3.A0U()
            android.widget.EdgeEffect r9 = r3.A03
            int r0 = r3.getHeight()
            float r0 = (float) r0
            float r6 = r6 / r0
            int r0 = r3.getWidth()
            float r0 = (float) r0
            float r7 = r7 / r0
            float r8 = r8 - r7
            X.C7Q.A00(r9, r6, r8)
            goto L_0x00c0
        L_0x00f9:
            if (r14 != 0) goto L_0x00c0
            int r0 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r0 != 0) goto L_0x00c0
            int r0 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r0 == 0) goto L_0x00c3
            goto L_0x00c0
        L_0x0104:
            int r0 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r0 <= 0) goto L_0x011b
            r3.A0W()
            android.widget.EdgeEffect r11 = r3.A05
            int r0 = r3.getWidth()
            float r0 = (float) r0
            float r12 = r9 / r0
            int r0 = r3.getHeight()
            float r0 = (float) r0
            float r10 = r10 / r0
            goto L_0x00a4
        L_0x011b:
            r14 = 0
            goto L_0x00a7
        L_0x011d:
            r1 = 0
            r2 = 0
            r9 = 0
            r8 = 0
            goto L_0x0022
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.A12(android.view.MotionEvent, int, int):boolean");
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (!(layoutParams instanceof C38491rN) || !this.A0D.A1M((C38491rN) layoutParams)) {
            return false;
        }
        return true;
    }

    public int computeHorizontalScrollExtent() {
        C38251qy r2 = this.A0D;
        if (r2 == null || !r2.A1I()) {
            return 0;
        }
        return r2.A0o(this.A0w);
    }

    public int computeHorizontalScrollOffset() {
        C38251qy r2 = this.A0D;
        if (r2 == null || !r2.A1I()) {
            return 0;
        }
        return r2.A0p(this.A0w);
    }

    public int computeHorizontalScrollRange() {
        C38251qy r2 = this.A0D;
        if (r2 == null || !r2.A1I()) {
            return 0;
        }
        return r2.A0q(this.A0w);
    }

    public int computeVerticalScrollExtent() {
        C38251qy r2 = this.A0D;
        if (r2 == null || !r2.A1J()) {
            return 0;
        }
        return r2.A0r(this.A0w);
    }

    public int computeVerticalScrollOffset() {
        C38251qy r2 = this.A0D;
        if (r2 == null || !r2.A1J()) {
            return 0;
        }
        return r2.A0s(this.A0w);
    }

    public int computeVerticalScrollRange() {
        C38251qy r2 = this.A0D;
        if (r2 == null || !r2.A1J()) {
            return 0;
        }
        return r2.A0t(this.A0w);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0146, code lost:
        if (r3 <= r2) goto L_0x0148;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0032, code lost:
        if (r5.findNextFocus(r11, r12, r0) == null) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0034, code lost:
        A0S();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003b, code lost:
        if (A0N(r12) == null) goto L_0x0171;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003d, code lost:
        A0b();
        r11.A0D.A0v(r12, r11.A0v, r11.A0w, r13);
        A0y(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0050, code lost:
        if (r5 != null) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0084, code lost:
        if (r5.findNextFocus(r11, r12, r0) == null) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        if (r11.A0V != false) goto L_0x0013;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0121, code lost:
        if (r10 > 0) goto L_0x0123;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View focusSearch(android.view.View r12, int r13) {
        /*
            r11 = this;
            X.1rD r0 = r11.A0B
            r6 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0013
            X.1qy r0 = r11.A0D
            if (r0 == 0) goto L_0x0013
            int r0 = r11.A01
            if (r0 > 0) goto L_0x0013
            boolean r0 = r11.A0V
            r1 = 1
            if (r0 == 0) goto L_0x0014
        L_0x0013:
            r1 = 0
        L_0x0014:
            android.view.FocusFinder r5 = android.view.FocusFinder.getInstance()
            r4 = 0
            if (r1 == 0) goto L_0x0087
            r3 = 2
            if (r13 == r3) goto L_0x0020
            if (r13 != r6) goto L_0x0087
        L_0x0020:
            X.1qy r0 = r11.A0D
            boolean r0 = r0.A1J()
            if (r0 == 0) goto L_0x0063
            r0 = 33
            if (r13 != r3) goto L_0x002e
            r0 = 130(0x82, float:1.82E-43)
        L_0x002e:
            android.view.View r0 = r5.findNextFocus(r11, r12, r0)
            if (r0 != 0) goto L_0x0063
        L_0x0034:
            r11.A0S()
            android.view.View r0 = r11.A0N(r12)
            if (r0 == 0) goto L_0x0171
            r11.A0b()
            X.1qy r3 = r11.A0D
            X.1qQ r1 = r11.A0v
            X.1qZ r0 = r11.A0w
            r3.A0v(r12, r1, r0, r13)
            r11.A0y(r2)
        L_0x004c:
            android.view.View r5 = r5.findNextFocus(r11, r12, r13)
        L_0x0050:
            if (r5 == 0) goto L_0x0172
        L_0x0052:
            boolean r0 = r5.hasFocusable()
            if (r0 != 0) goto L_0x00ad
            android.view.View r0 = r11.getFocusedChild()
            if (r0 != 0) goto L_0x00a9
            android.view.View r12 = super.focusSearch(r12, r13)
            return r12
        L_0x0063:
            X.1qy r1 = r11.A0D
            boolean r0 = r1.A1I()
            if (r0 == 0) goto L_0x004c
            androidx.recyclerview.widget.RecyclerView r0 = r1.A07
            int r0 = r0.getLayoutDirection()
            r1 = 0
            if (r0 != r6) goto L_0x0075
            r1 = 1
        L_0x0075:
            r0 = 0
            if (r13 != r3) goto L_0x0079
            r0 = 1
        L_0x0079:
            r1 = r1 ^ r0
            r0 = 17
            if (r1 == 0) goto L_0x0080
            r0 = 66
        L_0x0080:
            android.view.View r0 = r5.findNextFocus(r11, r12, r0)
            if (r0 != 0) goto L_0x004c
            goto L_0x0034
        L_0x0087:
            android.view.View r5 = r5.findNextFocus(r11, r12, r13)
            if (r5 != 0) goto L_0x0052
            if (r1 == 0) goto L_0x0172
            r11.A0S()
            android.view.View r0 = r11.A0N(r12)
            if (r0 == 0) goto L_0x0171
            r11.A0b()
            X.1qy r3 = r11.A0D
            X.1qQ r1 = r11.A0v
            X.1qZ r0 = r11.A0w
            android.view.View r5 = r3.A0v(r12, r1, r0, r13)
            r11.A0y(r2)
            goto L_0x0050
        L_0x00a9:
            r11.A0A(r5, r4)
            return r12
        L_0x00ad:
            if (r5 == r11) goto L_0x0172
            android.view.View r0 = r11.A0N(r5)
            if (r0 == 0) goto L_0x0172
            if (r12 == 0) goto L_0x0123
            android.view.View r0 = r11.A0N(r12)
            if (r0 == 0) goto L_0x0123
            android.graphics.Rect r8 = r11.A0r
            int r1 = r12.getWidth()
            int r0 = r12.getHeight()
            r8.set(r2, r2, r1, r0)
            android.graphics.Rect r7 = r11.A0s
            int r1 = r5.getWidth()
            int r0 = r5.getHeight()
            r7.set(r2, r2, r1, r0)
            r11.offsetDescendantRectToMyCoords(r12, r8)
            r11.offsetDescendantRectToMyCoords(r5, r7)
            X.1qy r0 = r11.A0D
            androidx.recyclerview.widget.RecyclerView r0 = r0.A07
            int r0 = r0.getLayoutDirection()
            r10 = -1
            r9 = 1
            if (r0 != r6) goto L_0x00ea
            r9 = -1
        L_0x00ea:
            int r3 = r8.left
            int r2 = r7.left
            if (r3 < r2) goto L_0x00f4
            int r1 = r8.right
            if (r1 > r2) goto L_0x013f
        L_0x00f4:
            int r1 = r8.right
            int r0 = r7.right
            if (r1 >= r0) goto L_0x013f
            r4 = 1
        L_0x00fb:
            int r3 = r8.top
            int r2 = r7.top
            if (r3 < r2) goto L_0x0105
            int r1 = r8.bottom
            if (r1 > r2) goto L_0x0134
        L_0x0105:
            int r1 = r8.bottom
            int r0 = r7.bottom
            if (r1 >= r0) goto L_0x0134
            r10 = 1
        L_0x010c:
            if (r13 == r6) goto L_0x012c
            r0 = 2
            if (r13 == r0) goto L_0x0124
            r0 = 17
            if (r13 == r0) goto L_0x016e
            r0 = 33
            if (r13 == r0) goto L_0x016b
            r0 = 66
            if (r13 == r0) goto L_0x0168
            r0 = 130(0x82, float:1.82E-43)
            if (r13 != r0) goto L_0x014a
            if (r10 <= 0) goto L_0x0172
        L_0x0123:
            return r5
        L_0x0124:
            if (r10 > 0) goto L_0x0123
            if (r10 != 0) goto L_0x0172
            int r4 = r4 * r9
            if (r4 < 0) goto L_0x0172
            return r5
        L_0x012c:
            if (r10 < 0) goto L_0x0123
            if (r10 != 0) goto L_0x0172
            int r4 = r4 * r9
            if (r4 > 0) goto L_0x0172
            return r5
        L_0x0134:
            int r0 = r7.bottom
            if (r1 > r0) goto L_0x013a
            if (r3 < r0) goto L_0x013d
        L_0x013a:
            if (r3 <= r2) goto L_0x013d
            goto L_0x010c
        L_0x013d:
            r10 = 0
            goto L_0x010c
        L_0x013f:
            int r0 = r7.right
            if (r1 > r0) goto L_0x0145
            if (r3 < r0) goto L_0x0148
        L_0x0145:
            r4 = -1
            if (r3 > r2) goto L_0x00fb
        L_0x0148:
            r4 = 0
            goto L_0x00fb
        L_0x014a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Invalid direction: "
            r1.append(r0)
            r1.append(r13)
            java.lang.String r0 = r11.A0R()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0168:
            if (r4 <= 0) goto L_0x0172
            return r5
        L_0x016b:
            if (r10 >= 0) goto L_0x0172
            return r5
        L_0x016e:
            if (r4 >= 0) goto L_0x0172
            return r5
        L_0x0171:
            return r4
        L_0x0172:
            android.view.View r5 = super.focusSearch(r12, r13)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        C38251qy r0 = this.A0D;
        if (r0 != null) {
            return r0.A0w();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("RecyclerView has no LayoutManager");
        sb.append(A0R());
        throw new IllegalStateException(sb.toString());
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        C38251qy r1 = this.A0D;
        if (r1 != null) {
            return r1.A0x(getContext(), attributeSet);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("RecyclerView has no LayoutManager");
        sb.append(A0R());
        throw new IllegalStateException(sb.toString());
    }

    public int getBaseline() {
        if (this.A0D != null) {
            return -1;
        }
        return super.getBaseline();
    }

    public int getItemDecorationCount() {
        return this.A11.size();
    }

    public C38441rI getRecycledViewPool() {
        C37931qQ r1 = this.A0v;
        C38441rI r0 = r1.A02;
        if (r0 != null) {
            return r0;
        }
        C38441rI r02 = new C38441rI();
        r1.A02 = r02;
        return r02;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0039, code lost:
        if (r3 == 0.0f) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003d, code lost:
        if (r2 != 0.0f) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003f, code lost:
        A12(r7, (int) (r2 * r6.A0Z), (int) (r3 * r6.A0a));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onGenericMotionEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            X.1qy r0 = r6.A0D
            r5 = 0
            if (r0 == 0) goto L_0x004a
            boolean r0 = r6.A0V
            if (r0 != 0) goto L_0x004a
            int r1 = r7.getAction()
            r0 = 8
            if (r1 != r0) goto L_0x004a
            int r0 = r7.getSource()
            r0 = r0 & 2
            r4 = 0
            if (r0 == 0) goto L_0x004d
            X.1qy r0 = r6.A0D
            boolean r0 = r0.A1J()
            if (r0 == 0) goto L_0x004b
            r0 = 9
            float r0 = r7.getAxisValue(r0)
            float r3 = -r0
        L_0x0029:
            X.1qy r0 = r6.A0D
            boolean r0 = r0.A1I()
            if (r0 == 0) goto L_0x0065
            r0 = 10
            float r2 = r7.getAxisValue(r0)
        L_0x0037:
            int r0 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x003f
        L_0x003b:
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x004a
        L_0x003f:
            float r0 = r6.A0Z
            float r2 = r2 * r0
            int r1 = (int) r2
            float r0 = r6.A0a
            float r3 = r3 * r0
            int r0 = (int) r3
            r6.A12(r7, r1, r0)
        L_0x004a:
            return r5
        L_0x004b:
            r3 = 0
            goto L_0x0029
        L_0x004d:
            int r1 = r7.getSource()
            r0 = 4194304(0x400000, float:5.877472E-39)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x004a
            r0 = 26
            float r2 = r7.getAxisValue(r0)
            X.1qy r1 = r6.A0D
            boolean r0 = r1.A1J()
            if (r0 == 0) goto L_0x0067
            float r3 = -r2
        L_0x0065:
            r2 = 0
            goto L_0x0037
        L_0x0067:
            boolean r0 = r1.A1I()
            if (r0 == 0) goto L_0x004a
            r3 = 0
            goto L_0x003b
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00d0, code lost:
        if (r4 != false) goto L_0x00cb;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r10) {
        /*
            r9 = this;
            boolean r0 = r9.A0V
            r3 = 0
            if (r0 != 0) goto L_0x0127
            r0 = 0
            r9.A0F = r0
            boolean r0 = r9.A0I(r10)
            r2 = 1
            if (r0 == 0) goto L_0x0016
            r9.A07()
            r9.setScrollState(r3)
            return r2
        L_0x0016:
            X.1qy r0 = r9.A0D
            if (r0 == 0) goto L_0x0127
            boolean r8 = r0.A1I()
            boolean r7 = r0.A1J()
            android.view.VelocityTracker r0 = r9.A0j
            if (r0 != 0) goto L_0x002c
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r9.A0j = r0
        L_0x002c:
            r0.addMovement(r10)
            int r6 = r10.getActionMasked()
            int r4 = r10.getActionIndex()
            r1 = 2
            r5 = 1056964608(0x3f000000, float:0.5)
            if (r6 == 0) goto L_0x00df
            if (r6 == r2) goto L_0x00d5
            if (r6 == r1) goto L_0x0074
            r0 = 3
            if (r6 == r0) goto L_0x006d
            r0 = 5
            if (r6 == r0) goto L_0x0052
            r0 = 6
            if (r6 != r0) goto L_0x004c
            r9.A08(r10)
        L_0x004c:
            int r0 = r9.A02
            if (r0 != r2) goto L_0x0127
            r3 = 1
            return r3
        L_0x0052:
            int r0 = r10.getPointerId(r4)
            r9.A0h = r0
            float r0 = r10.getX(r4)
            float r0 = r0 + r5
            int r0 = (int) r0
            r9.A0f = r0
            r9.A0c = r0
            float r0 = r10.getY(r4)
            float r0 = r0 + r5
            int r0 = (int) r0
            r9.A0g = r0
            r9.A0d = r0
            goto L_0x004c
        L_0x006d:
            r9.A07()
            r9.setScrollState(r3)
            goto L_0x004c
        L_0x0074:
            int r0 = r9.A0h
            int r1 = r10.findPointerIndex(r0)
            if (r1 >= 0) goto L_0x009a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Error processing scroll; pointer index for id "
            r1.append(r0)
            int r0 = r9.A0h
            r1.append(r0)
            java.lang.String r0 = " not found. Did any MotionEvents get skipped?"
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "RecyclerView"
            android.util.Log.e(r0, r1)
            return r3
        L_0x009a:
            float r0 = r10.getX(r1)
            float r0 = r0 + r5
            int r4 = (int) r0
            float r0 = r10.getY(r1)
            float r0 = r0 + r5
            int r6 = (int) r0
            int r0 = r9.A02
            if (r0 == r2) goto L_0x004c
            int r0 = r9.A0c
            int r1 = r4 - r0
            int r0 = r9.A0d
            int r5 = r6 - r0
            if (r8 == 0) goto L_0x00d3
            int r1 = java.lang.Math.abs(r1)
            int r0 = r9.A0i
            if (r1 <= r0) goto L_0x00d3
            r9.A0f = r4
            r4 = 1
        L_0x00bf:
            if (r7 == 0) goto L_0x00d0
            int r1 = java.lang.Math.abs(r5)
            int r0 = r9.A0i
            if (r1 <= r0) goto L_0x00d0
            r9.A0g = r6
        L_0x00cb:
            r9.setScrollState(r2)
            goto L_0x004c
        L_0x00d0:
            if (r4 == 0) goto L_0x004c
            goto L_0x00cb
        L_0x00d3:
            r4 = 0
            goto L_0x00bf
        L_0x00d5:
            android.view.VelocityTracker r0 = r9.A0j
            r0.clear()
            r9.A0h(r3)
            goto L_0x004c
        L_0x00df:
            boolean r0 = r9.A0p
            if (r0 == 0) goto L_0x00e5
            r9.A0p = r3
        L_0x00e5:
            int r0 = r10.getPointerId(r3)
            r9.A0h = r0
            float r0 = r10.getX()
            float r0 = r0 + r5
            int r0 = (int) r0
            r9.A0f = r0
            r9.A0c = r0
            float r0 = r10.getY()
            float r0 = r0 + r5
            int r0 = (int) r0
            r9.A0g = r0
            r9.A0d = r0
            int r0 = r9.A02
            if (r0 != r1) goto L_0x0110
            android.view.ViewParent r0 = r9.getParent()
            r0.requestDisallowInterceptTouchEvent(r2)
            r9.setScrollState(r2)
            r9.A0h(r2)
        L_0x0110:
            int[] r0 = r9.A18
            r0[r2] = r3
            r0[r3] = r3
            r1 = 0
            if (r8 == 0) goto L_0x011a
            r1 = 1
        L_0x011a:
            if (r7 == 0) goto L_0x011e
            r1 = r1 | 2
        L_0x011e:
            X.1qr r0 = r9.getScrollingChildHelper()
            r0.A0D(r1, r3)
            goto L_0x004c
        L_0x0127:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Method method = AnonymousClass1CH.A03;
        Trace.beginSection("RV OnLayout");
        A0T();
        Trace.endSection();
        this.A0Q = true;
    }

    public void onMeasure(int i, int i2) {
        C38021qZ r1;
        C38251qy r12 = this.A0D;
        if (r12 == null) {
            A0j(i, i2);
        } else if (r12.A1K()) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            C38251qy r0 = this.A0D;
            C38021qZ r5 = this.A0w;
            r0.A07.A0j(i, i2);
            if ((mode != 1073741824 || mode2 != 1073741824) && this.A0B != null) {
                if (r5.A04 == 1) {
                    A04();
                }
                this.A0D.A0R(i, i2);
                r5.A09 = true;
                A05();
                this.A0D.A0S(i, i2);
                C38251qy r7 = this.A0D;
                if ((r7 instanceof LinearLayoutManager) && r7.A01 != 1073741824 && r7.A04 != 1073741824) {
                    int A0J2 = r7.A0J();
                    int i3 = 0;
                    while (i3 < A0J2) {
                        ViewGroup.LayoutParams layoutParams = r7.A0P(i3).getLayoutParams();
                        if (layoutParams.width >= 0 || layoutParams.height >= 0) {
                            i3++;
                        } else {
                            this.A0D.A0R(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                            r5.A09 = true;
                            A05();
                            this.A0D.A0S(i, i2);
                            return;
                        }
                    }
                }
            }
        } else if (this.A0R) {
            r12.A07.A0j(i, i2);
        } else {
            if (this.A0M) {
                A0b();
                this.A01++;
                A06();
                A0w(true);
                r1 = this.A0w;
                if (r1.A0A) {
                    r1.A08 = true;
                } else {
                    this.A07.A06();
                    r1.A08 = false;
                }
                this.A0M = false;
                A0y(false);
            } else {
                r1 = this.A0w;
                if (r1.A0A) {
                    setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                    return;
                }
            }
            C38391rD r02 = this.A0B;
            if (r02 != null) {
                r1.A03 = r02.A0Q();
            } else {
                r1.A03 = 0;
            }
            A0b();
            this.A0D.A07.A0j(i, i2);
            A0y(false);
            r1.A08 = false;
        }
    }

    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (this.A01 > 0) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof C22694BKw)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C22694BKw bKw = (C22694BKw) parcelable;
        this.A0o = bKw;
        super.onRestoreInstanceState(bKw.A00);
        C38251qy r1 = this.A0D;
        if (r1 != null && (parcelable2 = this.A0o.A00) != null) {
            r1.A19(parcelable2);
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.1Xj, android.os.Parcelable, X.BKw] */
    public Parcelable onSaveInstanceState() {
        Parcelable parcelable;
        Parcelable.Creator creator = C22694BKw.CREATOR;
        ? r1 = new C27741Xj(super.onSaveInstanceState());
        C22694BKw bKw = this.A0o;
        if (bKw != null) {
            parcelable = bKw.A00;
        } else {
            C38251qy r0 = this.A0D;
            if (r0 != null) {
                parcelable = r0.A0u();
            } else {
                parcelable = null;
            }
        }
        r1.A00 = parcelable;
        return r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00f6, code lost:
        if (r7 == 0) goto L_0x00f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0104, code lost:
        if (r6 != 0) goto L_0x0106;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0106, code lost:
        setScrollState(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x018e, code lost:
        if (r9 != false) goto L_0x0106;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r20) {
        /*
            r19 = this;
            r13 = r19
            boolean r0 = r13.A0V
            r3 = 0
            if (r0 != 0) goto L_0x0206
            boolean r0 = r13.A0p
            if (r0 != 0) goto L_0x0206
            X.3Lo r0 = r13.A0F
            r5 = r20
            if (r0 != 0) goto L_0x0027
            int r0 = r5.getAction()
            if (r0 != 0) goto L_0x0022
            r0 = 0
        L_0x0018:
            r4 = 1
            if (r0 == 0) goto L_0x0039
            r13.A07()
            r13.setScrollState(r3)
            return r4
        L_0x0022:
            boolean r0 = r13.A0I(r5)
            goto L_0x0018
        L_0x0027:
            r0.C8t(r5, r13)
            int r2 = r5.getAction()
            r1 = 3
            r0 = 1
            if (r2 == r1) goto L_0x0034
            if (r2 != r0) goto L_0x0037
        L_0x0034:
            r0 = 0
            r13.A0F = r0
        L_0x0037:
            r0 = 1
            goto L_0x0018
        L_0x0039:
            X.1qy r0 = r13.A0D
            if (r0 == 0) goto L_0x0206
            boolean r12 = r0.A1I()
            boolean r11 = r0.A1J()
            android.view.VelocityTracker r0 = r13.A0j
            if (r0 != 0) goto L_0x004f
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r13.A0j = r0
        L_0x004f:
            int r7 = r5.getActionMasked()
            int r1 = r5.getActionIndex()
            if (r7 != 0) goto L_0x005f
            int[] r0 = r13.A18
            r0[r4] = r3
            r0[r3] = r3
        L_0x005f:
            android.view.MotionEvent r2 = android.view.MotionEvent.obtain(r5)
            int[] r10 = r13.A18
            r0 = r10[r3]
            float r6 = (float) r0
            r0 = r10[r4]
            float r0 = (float) r0
            r2.offsetLocation(r6, r0)
            r6 = 1056964608(0x3f000000, float:0.5)
            if (r7 == 0) goto L_0x01db
            if (r7 == r4) goto L_0x0199
            r0 = 2
            if (r7 == r0) goto L_0x00ae
            r0 = 3
            if (r7 == r0) goto L_0x00a7
            r0 = 5
            if (r7 == r0) goto L_0x008c
            r0 = 6
            if (r7 != r0) goto L_0x0083
            r13.A08(r5)
        L_0x0083:
            android.view.VelocityTracker r0 = r13.A0j
            r0.addMovement(r2)
        L_0x0088:
            r2.recycle()
            return r4
        L_0x008c:
            int r0 = r5.getPointerId(r1)
            r13.A0h = r0
            float r0 = r5.getX(r1)
            float r0 = r0 + r6
            int r0 = (int) r0
            r13.A0f = r0
            r13.A0c = r0
            float r0 = r5.getY(r1)
            float r0 = r0 + r6
            int r0 = (int) r0
            r13.A0g = r0
            r13.A0d = r0
            goto L_0x0083
        L_0x00a7:
            r13.A07()
            r13.setScrollState(r3)
            goto L_0x0083
        L_0x00ae:
            int r0 = r13.A0h
            int r1 = r5.findPointerIndex(r0)
            if (r1 >= 0) goto L_0x00d4
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Error processing scroll; pointer index for id "
            r1.append(r0)
            int r0 = r13.A0h
            r1.append(r0)
            java.lang.String r0 = " not found. Did any MotionEvents get skipped?"
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "RecyclerView"
            android.util.Log.e(r0, r1)
            return r3
        L_0x00d4:
            float r0 = r5.getX(r1)
            float r0 = r0 + r6
            int r8 = (int) r0
            float r0 = r5.getY(r1)
            float r0 = r0 + r6
            int r1 = (int) r0
            int r7 = r13.A0f
            int r7 = r7 - r8
            int r6 = r13.A0g
            int r6 = r6 - r1
            int r0 = r13.A02
            if (r0 == r4) goto L_0x0109
            if (r12 == 0) goto L_0x00f8
            int r0 = r13.A0i
            if (r7 <= 0) goto L_0x0192
            int r7 = r7 - r0
            int r7 = java.lang.Math.max(r3, r7)
        L_0x00f5:
            r9 = 1
            if (r7 != 0) goto L_0x00f9
        L_0x00f8:
            r9 = 0
        L_0x00f9:
            if (r11 == 0) goto L_0x018e
            int r0 = r13.A0i
            if (r6 <= 0) goto L_0x0187
            int r6 = r6 - r0
            int r6 = java.lang.Math.max(r3, r6)
        L_0x0104:
            if (r6 == 0) goto L_0x018e
        L_0x0106:
            r13.setScrollState(r4)
        L_0x0109:
            int r0 = r13.A02
            if (r0 != r4) goto L_0x0083
            int[] r14 = r13.A15
            r14[r3] = r3
            r14[r4] = r3
            r16 = 0
            if (r12 == 0) goto L_0x0119
            r16 = r7
        L_0x0119:
            r17 = 0
            if (r11 == 0) goto L_0x011f
            r17 = r6
        L_0x011f:
            int[] r15 = r13.A19
            r18 = r3
            boolean r0 = r13.A13(r14, r15, r16, r17, r18)
            if (r0 == 0) goto L_0x0144
            r0 = r14[r3]
            int r7 = r7 - r0
            r0 = r14[r4]
            int r6 = r6 - r0
            r9 = r10[r3]
            r0 = r15[r3]
            int r9 = r9 + r0
            r10[r3] = r9
            r9 = r10[r4]
            r0 = r15[r4]
            int r9 = r9 + r0
            r10[r4] = r9
            android.view.ViewParent r0 = r13.getParent()
            r0.requestDisallowInterceptTouchEvent(r4)
        L_0x0144:
            r0 = r15[r3]
            int r8 = r8 - r0
            r13.A0f = r8
            r0 = r15[r4]
            int r1 = r1 - r0
            r13.A0g = r1
            r0 = 0
            if (r12 == 0) goto L_0x0152
            r0 = r7
        L_0x0152:
            if (r11 == 0) goto L_0x0155
            r3 = r6
        L_0x0155:
            boolean r0 = r13.A12(r5, r0, r3)
            if (r0 == 0) goto L_0x0162
            android.view.ViewParent r0 = r13.getParent()
            r0.requestDisallowInterceptTouchEvent(r4)
        L_0x0162:
            X.1rw r5 = r13.A0A
            if (r5 == 0) goto L_0x0083
            if (r7 != 0) goto L_0x016a
            if (r6 == 0) goto L_0x0083
        L_0x016a:
            boolean r0 = r13.A0S
            if (r0 == 0) goto L_0x017f
            long r0 = r5.A01
            r8 = 0
            int r3 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r3 != 0) goto L_0x017f
            long r0 = java.lang.System.nanoTime()
            r5.A01 = r0
            r13.post(r5)
        L_0x017f:
            X.1qY r0 = r13.A09
            r0.A01 = r7
            r0.A02 = r6
            goto L_0x0083
        L_0x0187:
            int r6 = r6 + r0
            int r6 = java.lang.Math.min(r3, r6)
            goto L_0x0104
        L_0x018e:
            if (r9 == 0) goto L_0x0109
            goto L_0x0106
        L_0x0192:
            int r7 = r7 + r0
            int r7 = java.lang.Math.min(r3, r7)
            goto L_0x00f5
        L_0x0199:
            android.view.VelocityTracker r0 = r13.A0j
            r0.addMovement(r2)
            android.view.VelocityTracker r5 = r13.A0j
            int r0 = r13.A16
            float r1 = (float) r0
            r0 = 1000(0x3e8, float:1.401E-42)
            r5.computeCurrentVelocity(r0, r1)
            r7 = 0
            if (r12 == 0) goto L_0x01d9
            android.view.VelocityTracker r1 = r13.A0j
            int r0 = r13.A0h
            float r0 = r1.getXVelocity(r0)
            float r6 = -r0
        L_0x01b4:
            if (r11 == 0) goto L_0x01d7
            android.view.VelocityTracker r1 = r13.A0j
            int r0 = r13.A0h
            float r0 = r1.getYVelocity(r0)
            float r5 = -r0
        L_0x01bf:
            int r0 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x01c7
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 == 0) goto L_0x01cf
        L_0x01c7:
            int r1 = (int) r6
            int r0 = (int) r5
            boolean r0 = r13.A11(r1, r0)
            if (r0 != 0) goto L_0x01d2
        L_0x01cf:
            r13.setScrollState(r3)
        L_0x01d2:
            r13.A07()
            goto L_0x0088
        L_0x01d7:
            r5 = 0
            goto L_0x01bf
        L_0x01d9:
            r6 = 0
            goto L_0x01b4
        L_0x01db:
            int r0 = r5.getPointerId(r3)
            r13.A0h = r0
            float r0 = r5.getX()
            float r0 = r0 + r6
            int r0 = (int) r0
            r13.A0f = r0
            r13.A0c = r0
            float r0 = r5.getY()
            float r0 = r0 + r6
            int r0 = (int) r0
            r13.A0g = r0
            r13.A0d = r0
            r1 = 0
            if (r12 == 0) goto L_0x01f9
            r1 = 1
        L_0x01f9:
            if (r11 == 0) goto L_0x01fd
            r1 = r1 | 2
        L_0x01fd:
            X.1qr r0 = r13.getScrollingChildHelper()
            r0.A0D(r1, r3)
            goto L_0x0083
        L_0x0206:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void requestChildFocus(View view, View view2) {
        C25272CcK ccK = this.A0D.A06;
        if ((ccK == null || !ccK.A05) && this.A01 <= 0 && view2 != null) {
            A0A(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        ArrayList arrayList = this.A12;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C72343Lo) arrayList.get(i)).C3K(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void requestLayout() {
        if (this.A0e != 0 || this.A0V) {
            this.A0W = true;
        } else {
            super.requestLayout();
        }
    }

    public void scrollBy(int i, int i2) {
        C38251qy r2 = this.A0D;
        if (r2 == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.A0V) {
            boolean A1I = r2.A1I();
            boolean A1J = r2.A1J();
            if (!A1I) {
                if (A1J) {
                    i = 0;
                } else {
                    return;
                }
            } else if (!A1J) {
                i2 = 0;
            }
            A12((MotionEvent) null, i, i2);
        }
    }

    public void scrollTo(int i, int i2) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        int contentChangeTypes;
        if (this.A01 > 0) {
            int i = 0;
            if (!(accessibilityEvent == null || (contentChangeTypes = accessibilityEvent.getContentChangeTypes()) == 0)) {
                i = contentChangeTypes;
            }
            this.A00 |= i;
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(C38171qo r1) {
        this.A0I = r1;
        AnonymousClass1HF.A0f(this, r1);
    }

    public void setClipToPadding(boolean z) {
        if (z != this.A0N) {
            this.A03 = null;
            this.A06 = null;
            this.A05 = null;
            this.A04 = null;
        }
        this.A0N = z;
        super.setClipToPadding(z);
        if (this.A0Q) {
            requestLayout();
        }
    }

    public void setItemAnimator(C37961qT r3) {
        C37961qT r0 = this.A0C;
        if (r0 != null) {
            r0.A0C();
            this.A0C.A04 = null;
        }
        this.A0C = r3;
        if (r3 != null) {
            r3.A04 = this.A0n;
        }
    }

    public void setItemViewCacheSize(int i) {
        C37931qQ r0 = this.A0v;
        r0.A00 = i;
        r0.A05();
    }

    public void setLayoutManager(C38251qy r7) {
        C37931qQ r4;
        if (r7 != this.A0D) {
            A0c();
            if (this.A0D != null) {
                C37961qT r0 = this.A0C;
                if (r0 != null) {
                    r0.A0C();
                }
                C38251qy r02 = this.A0D;
                r4 = this.A0v;
                r02.A0b(r4);
                this.A0D.A0c(r4);
                r4.A05.clear();
                r4.A04();
                if (this.A0S) {
                    C38251qy r1 = this.A0D;
                    r1.A0A = false;
                    r1.A1E(r4, this);
                }
                C38251qy r2 = this.A0D;
                r2.A07 = null;
                r2.A05 = null;
                r2.A03 = 0;
                r2.A00 = 0;
                r2.A04 = 1073741824;
                r2.A01 = 1073741824;
                this.A0D = null;
            } else {
                r4 = this.A0v;
                r4.A05.clear();
                r4.A04();
            }
            C38151qm r5 = this.A08;
            r5.A00.A02();
            List list = r5.A02;
            int size = list.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                r5.A01.Bwc((View) list.get(size));
                list.remove(size);
            }
            RecyclerView recyclerView = ((C38141ql) r5.A01).A00;
            int childCount = recyclerView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = recyclerView.getChildAt(i);
                recyclerView.A0p(childAt);
                childAt.clearAnimation();
            }
            recyclerView.removeAllViews();
            this.A0D = r7;
            if (r7 != null) {
                if (r7.A07 == null) {
                    r7.A07 = this;
                    r7.A05 = r5;
                    r7.A03 = getWidth();
                    r7.A00 = getHeight();
                    r7.A04 = 1073741824;
                    r7.A01 = 1073741824;
                    if (this.A0S) {
                        C38251qy r12 = this.A0D;
                        r12.A0A = true;
                        r12.A0i(this);
                    }
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("LayoutManager ");
                    sb.append(r7);
                    sb.append(" is already attached to a RecyclerView:");
                    sb.append(r7.A07.A0R());
                    throw new IllegalArgumentException(sb.toString());
                }
            }
            r4.A05();
            requestLayout();
        }
    }

    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition((LayoutTransition) null);
            return;
        }
        throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
    }

    public void setRecycledViewPool(C38441rI r4) {
        C37931qQ r2 = this.A0v;
        C38441rI r1 = r2.A02;
        if (r1 != null) {
            r1.A00--;
        }
        r2.A02 = r4;
        if (r4 != null && r2.A08.A0B != null) {
            r4.A00++;
        }
    }

    public void setScrollState(int i) {
        C25272CcK ccK;
        if (i != this.A02) {
            this.A02 = i;
            if (i != 2) {
                C37991qW r1 = this.A0x;
                r1.A06.removeCallbacks(r1);
                r1.A03.abortAnimation();
                C38251qy r0 = this.A0D;
                if (!(r0 == null || (ccK = r0.A06) == null)) {
                    ccK.A02();
                }
            }
            C38251qy r02 = this.A0D;
            if (r02 != null) {
                r02.A12(i);
            }
            A0e(i);
            C39711tW r03 = this.A0G;
            if (r03 != null) {
                r03.A03(this, i);
            }
            List list = this.A0L;
            if (list != null) {
                int size = list.size();
                while (true) {
                    size--;
                    if (size >= 0) {
                        ((C39711tW) this.A0L.get(size)).A03(this, i);
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public void setViewCacheExtension(AnonymousClass2RY r2) {
        this.A0v.A03 = r2;
    }

    public final void suppressLayout(boolean z) {
        if (z != this.A0V) {
            A0v("Do not suppressLayout in layout or scroll");
            if (!z) {
                this.A0V = false;
                if (!(!this.A0W || this.A0D == null || this.A0B == null)) {
                    requestLayout();
                }
                this.A0W = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.A0V = true;
            this.A0p = true;
            A0c();
        }
    }

    public static int A00(View view) {
        C42011xT A022 = A02(view);
        if (A022 != null) {
            return A022.A05();
        }
        return -1;
    }

    public static int A01(View view) {
        C42011xT A022 = A02(view);
        if (A022 == null) {
            return -1;
        }
        int i = A022.A05;
        if (i == -1) {
            return A022.A04;
        }
        return i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0034, code lost:
        if (r4.A0C == null) goto L_0x0036;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A05() {
        /*
            r4 = this;
            r4.A0b()
            int r0 = r4.A01
            int r0 = r0 + 1
            r4.A01 = r0
            X.1qZ r3 = r4.A0w
            r0 = 6
            r3.A01(r0)
            X.1qi r0 = r4.A07
            r0.A06()
            X.1rD r0 = r4.A0B
            int r0 = r0.A0Q()
            r3.A03 = r0
            r2 = 0
            r3.A00 = r2
            r3.A08 = r2
            X.1qy r1 = r4.A0D
            X.1qQ r0 = r4.A0v
            r1.A1D(r0, r3)
            r3.A0C = r2
            r0 = 0
            r4.A0o = r0
            boolean r0 = r3.A0B
            if (r0 == 0) goto L_0x0036
            X.1qT r1 = r4.A0C
            r0 = 1
            if (r1 != 0) goto L_0x0037
        L_0x0036:
            r0 = 0
        L_0x0037:
            r3.A0B = r0
            r0 = 4
            r3.A04 = r0
            r0 = 1
            r4.A0w(r0)
            r4.A0y(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.A05():void");
    }

    private void A08(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.A0h) {
            int i = 0;
            if (actionIndex == 0) {
                i = 1;
            }
            this.A0h = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.A0f = x;
            this.A0c = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.A0g = y;
            this.A0d = y;
        }
    }

    public static void A09(View view, Rect rect) {
        C38491rN r6 = (C38491rN) view.getLayoutParams();
        Rect rect2 = r6.A03;
        rect.set((view.getLeft() - rect2.left) - r6.leftMargin, (view.getTop() - rect2.top) - r6.topMargin, view.getRight() + rect2.right + r6.rightMargin, view.getBottom() + rect2.bottom + r6.bottomMargin);
    }

    private boolean A0I(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        ArrayList arrayList = this.A12;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            C72343Lo r1 = (C72343Lo) arrayList.get(i);
            if (!r1.Bw2(motionEvent, this) || action == 3) {
                i++;
            } else {
                this.A0F = r1;
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001a, code lost:
        if ((r1 & 4) == 0) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Rect A0L(android.view.View r11) {
        /*
            r10 = this;
            android.view.ViewGroup$LayoutParams r8 = r11.getLayoutParams()
            X.1rN r8 = (X.C38491rN) r8
            boolean r0 = r8.A01
            if (r0 == 0) goto L_0x001c
            X.1qZ r7 = r10.A0w
            boolean r0 = r7.A08
            if (r0 == 0) goto L_0x001f
            X.1xT r0 = r8.A00
            int r1 = r0.A00
            r0 = r1 & 2
            if (r0 != 0) goto L_0x001c
            r0 = r1 & 4
            if (r0 == 0) goto L_0x001f
        L_0x001c:
            android.graphics.Rect r0 = r8.A03
            return r0
        L_0x001f:
            android.graphics.Rect r6 = r8.A03
            r5 = 0
            r6.set(r5, r5, r5, r5)
            java.util.ArrayList r4 = r10.A11
            int r3 = r4.size()
            r2 = 0
        L_0x002c:
            if (r2 >= r3) goto L_0x005b
            android.graphics.Rect r9 = r10.A0r
            r9.set(r5, r5, r5, r5)
            java.lang.Object r0 = r4.get(r2)
            X.1uz r0 = (X.C40611uz) r0
            r0.A05(r9, r11, r7, r10)
            int r1 = r6.left
            int r0 = r9.left
            int r1 = r1 + r0
            r6.left = r1
            int r1 = r6.top
            int r0 = r9.top
            int r1 = r1 + r0
            r6.top = r1
            int r1 = r6.right
            int r0 = r9.right
            int r1 = r1 + r0
            r6.right = r1
            int r1 = r6.bottom
            int r0 = r9.bottom
            int r1 = r1 + r0
            r6.bottom = r1
            int r2 = r2 + 1
            goto L_0x002c
        L_0x005b:
            r8.A01 = r5
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.A0L(android.view.View):android.graphics.Rect");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0012 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View A0N(android.view.View r3) {
        /*
            r2 = this;
        L_0x0000:
            android.view.ViewParent r1 = r3.getParent()
            if (r1 == 0) goto L_0x0010
            if (r1 == r2) goto L_0x0010
            boolean r0 = r1 instanceof android.view.View
            if (r0 == 0) goto L_0x0010
            r3 = r1
            android.view.View r3 = (android.view.View) r3
            goto L_0x0000
        L_0x0010:
            if (r1 == r2) goto L_0x0013
            r3 = 0
        L_0x0013:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.A0N(android.view.View):android.view.View");
    }

    public C42011xT A0Q(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return A02(view);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("View ");
        sb.append(view);
        sb.append(" is not a direct child of ");
        sb.append(this);
        throw new IllegalArgumentException(sb.toString());
    }

    public void A0h(int i) {
        getScrollingChildHelper().A09(i);
    }

    public void A0j(int i, int i2) {
        setMeasuredDimension(C38251qy.A00(i, getPaddingLeft() + getPaddingRight(), getMinimumWidth()), C38251qy.A00(i2, getPaddingTop() + getPaddingBottom(), getMinimumHeight()));
    }

    public void A0o(int i, int[] iArr, int i2) {
        int i3;
        int i4;
        C42011xT r0;
        A0b();
        this.A01++;
        Method method = AnonymousClass1CH.A03;
        Trace.beginSection("RV Scroll");
        C38021qZ r2 = this.A0w;
        if (getScrollState() == 2) {
            OverScroller overScroller = this.A0x.A03;
            overScroller.getFinalX();
            overScroller.getCurrX();
            overScroller.getFinalY();
            overScroller.getCurrY();
        }
        if (i != 0) {
            i3 = this.A0D.A0m(this.A0v, r2, i);
        } else {
            i3 = 0;
        }
        if (i2 != 0) {
            i4 = this.A0D.A0n(this.A0v, r2, i2);
        } else {
            i4 = 0;
        }
        Trace.endSection();
        C38151qm r8 = this.A08;
        int A032 = r8.A03();
        for (int i5 = 0; i5 < A032; i5++) {
            View A062 = r8.A06(i5);
            C42011xT A0Q2 = A0Q(A062);
            if (!(A0Q2 == null || (r0 = A0Q2.A0A) == null)) {
                View view = r0.A0H;
                int left = A062.getLeft();
                int top = A062.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        A0w(true);
        A0y(false);
        if (iArr != null) {
            iArr[0] = i3;
            iArr[1] = i4;
        }
    }

    public void A0p(View view) {
        C42011xT A022 = A02(view);
        C38391rD r0 = this.A0B;
        if (!(r0 == null || A022 == null)) {
            r0.A0L(A022);
        }
        List list = this.A0K;
        if (list != null) {
            int size = list.size();
            while (true) {
                size--;
                if (size >= 0) {
                    ((AnonymousClass3LW) this.A0K.get(size)).Bod(view);
                } else {
                    return;
                }
            }
        }
    }

    public final void A0z(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5) {
        C38201qr.A08(getScrollingChildHelper(), iArr, iArr2, i, i2, i3, i4, i5);
    }

    public boolean A13(int[] iArr, int[] iArr2, int i, int i2, int i3) {
        return getScrollingChildHelper().A0E(iArr, iArr2, i, i2, i3);
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return getScrollingChildHelper().A0C(f, f2, z);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().A0B(f, f2);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().A0E(iArr, iArr2, i, i2, 0);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return C38201qr.A08(getScrollingChildHelper(), iArr, (int[]) null, i, i2, i3, i4, 0);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    public void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    public void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004a, code lost:
        if (r0.draw(r8) == false) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0078, code lost:
        if (r1 == false) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ae, code lost:
        if (r1 == false) goto L_0x00b0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void draw(android.graphics.Canvas r8) {
        /*
            r7 = this;
            super.draw(r8)
            java.util.ArrayList r3 = r7.A11
            int r4 = r3.size()
            r6 = 0
            r2 = 0
        L_0x000b:
            if (r2 >= r4) goto L_0x001b
            java.lang.Object r1 = r3.get(r2)
            X.1uz r1 = (X.C40611uz) r1
            X.1qZ r0 = r7.A0w
            r1.A03(r8, r0, r7)
            int r2 = r2 + 1
            goto L_0x000b
        L_0x001b:
            android.widget.EdgeEffect r0 = r7.A04
            if (r0 == 0) goto L_0x0116
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x0116
            int r2 = r8.save()
            boolean r0 = r7.A0N
            if (r0 == 0) goto L_0x0113
            int r1 = r7.getPaddingBottom()
        L_0x0031:
            r0 = 1132920832(0x43870000, float:270.0)
            r8.rotate(r0)
            int r0 = r7.getHeight()
            int r0 = -r0
            int r0 = r0 + r1
            float r1 = (float) r0
            r0 = 0
            r8.translate(r1, r0)
            android.widget.EdgeEffect r0 = r7.A04
            if (r0 == 0) goto L_0x004c
            boolean r0 = r0.draw(r8)
            r5 = 1
            if (r0 != 0) goto L_0x004d
        L_0x004c:
            r5 = 0
        L_0x004d:
            r8.restoreToCount(r2)
        L_0x0050:
            android.widget.EdgeEffect r0 = r7.A06
            if (r0 == 0) goto L_0x007f
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x007f
            int r2 = r8.save()
            boolean r0 = r7.A0N
            if (r0 == 0) goto L_0x006f
            int r0 = r7.getPaddingLeft()
            float r1 = (float) r0
            int r0 = r7.getPaddingTop()
            float r0 = (float) r0
            r8.translate(r1, r0)
        L_0x006f:
            android.widget.EdgeEffect r0 = r7.A06
            if (r0 == 0) goto L_0x007a
            boolean r1 = r0.draw(r8)
            r0 = 1
            if (r1 != 0) goto L_0x007b
        L_0x007a:
            r0 = 0
        L_0x007b:
            r5 = r5 | r0
            r8.restoreToCount(r2)
        L_0x007f:
            android.widget.EdgeEffect r0 = r7.A05
            if (r0 == 0) goto L_0x00b5
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x00b5
            int r4 = r8.save()
            int r2 = r7.getWidth()
            boolean r0 = r7.A0N
            if (r0 == 0) goto L_0x0111
            int r1 = r7.getPaddingTop()
        L_0x0099:
            r0 = 1119092736(0x42b40000, float:90.0)
            r8.rotate(r0)
            int r0 = -r1
            float r1 = (float) r0
            int r0 = -r2
            float r0 = (float) r0
            r8.translate(r1, r0)
            android.widget.EdgeEffect r0 = r7.A05
            if (r0 == 0) goto L_0x00b0
            boolean r1 = r0.draw(r8)
            r0 = 1
            if (r1 != 0) goto L_0x00b1
        L_0x00b0:
            r0 = 0
        L_0x00b1:
            r5 = r5 | r0
            r8.restoreToCount(r4)
        L_0x00b5:
            android.widget.EdgeEffect r0 = r7.A03
            if (r0 == 0) goto L_0x00f4
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x00f4
            int r4 = r8.save()
            r0 = 1127481344(0x43340000, float:180.0)
            r8.rotate(r0)
            boolean r2 = r7.A0N
            int r0 = r7.getWidth()
            int r1 = -r0
            if (r2 == 0) goto L_0x010a
            int r0 = r7.getPaddingRight()
            int r1 = r1 + r0
            float r2 = (float) r1
            int r0 = r7.getHeight()
            int r1 = -r0
            int r0 = r7.getPaddingBottom()
            int r1 = r1 + r0
        L_0x00e1:
            float r0 = (float) r1
            r8.translate(r2, r0)
            android.widget.EdgeEffect r0 = r7.A03
            if (r0 == 0) goto L_0x00f0
            boolean r0 = r0.draw(r8)
            if (r0 == 0) goto L_0x00f0
            r6 = 1
        L_0x00f0:
            r5 = r5 | r6
            r8.restoreToCount(r4)
        L_0x00f4:
            if (r5 != 0) goto L_0x0106
            X.1qT r1 = r7.A0C
            if (r1 == 0) goto L_0x0109
            int r0 = r3.size()
            if (r0 <= 0) goto L_0x0109
            boolean r0 = r1.A0F()
            if (r0 == 0) goto L_0x0109
        L_0x0106:
            r7.postInvalidateOnAnimation()
        L_0x0109:
            return
        L_0x010a:
            float r2 = (float) r1
            int r0 = r7.getHeight()
            int r1 = -r0
            goto L_0x00e1
        L_0x0111:
            r1 = 0
            goto L_0x0099
        L_0x0113:
            r1 = 0
            goto L_0x0031
        L_0x0116:
            r5 = 0
            goto L_0x0050
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.draw(android.graphics.Canvas):void");
    }

    public boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public C38391rD getAdapter() {
        return this.A0B;
    }

    public int getChildDrawingOrder(int i, int i2) {
        return super.getChildDrawingOrder(i, i2);
    }

    public boolean getClipToPadding() {
        return this.A0N;
    }

    public C38171qo getCompatAccessibilityDelegate() {
        return this.A0I;
    }

    public C37951qS getEdgeEffectFactory() {
        return this.A0m;
    }

    public C37961qT getItemAnimator() {
        return this.A0C;
    }

    public C38251qy getLayoutManager() {
        return this.A0D;
    }

    public int getMaxFlingVelocity() {
        return this.A16;
    }

    public int getMinFlingVelocity() {
        return this.A0q;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public AnonymousClass2S0 getOnFlingListener() {
        return this.A0E;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.A0Y;
    }

    public int getScrollState() {
        return this.A02;
    }

    public boolean hasNestedScrollingParent() {
        if (getScrollingChildHelper().A01 != null) {
            return true;
        }
        return false;
    }

    public boolean isAttachedToWindow() {
        return this.A0S;
    }

    public final boolean isLayoutSuppressed() {
        return this.A0V;
    }

    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().A02;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0048, code lost:
        if (r1 >= 30.0f) goto L_0x004a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onAttachedToWindow() {
        /*
            r4 = this;
            super.onAttachedToWindow()
            r2 = 0
            r4.A01 = r2
            r1 = 1
            r4.A0S = r1
            boolean r0 = r4.A0Q
            if (r0 == 0) goto L_0x0061
            boolean r0 = r4.isLayoutRequested()
            if (r0 != 0) goto L_0x0061
        L_0x0013:
            r4.A0Q = r1
            X.1qy r1 = r4.A0D
            if (r1 == 0) goto L_0x001f
            r0 = 1
            r1.A0A = r0
            r1.A0i(r4)
        L_0x001f:
            r4.A0X = r2
            java.lang.ThreadLocal r3 = X.C38811rw.A05
            java.lang.Object r0 = r3.get()
            X.1rw r0 = (X.C38811rw) r0
            r4.A0A = r0
            if (r0 != 0) goto L_0x0056
            X.1rw r0 = new X.1rw
            r0.<init>()
            r4.A0A = r0
            android.view.Display r1 = r4.getDisplay()
            boolean r0 = r4.isInEditMode()
            if (r0 != 0) goto L_0x005e
            if (r1 == 0) goto L_0x005e
            float r1 = r1.getRefreshRate()
            r0 = 1106247680(0x41f00000, float:30.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x005e
        L_0x004a:
            X.1rw r2 = r4.A0A
            r0 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r0 = r0 / r1
            long r0 = (long) r0
            r2.A00 = r0
            r3.set(r2)
        L_0x0056:
            X.1rw r0 = r4.A0A
            java.util.ArrayList r0 = r0.A02
            r0.add(r4)
            return
        L_0x005e:
            r1 = 1114636288(0x42700000, float:60.0)
            goto L_0x004a
        L_0x0061:
            r1 = 0
            goto L_0x0013
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C37961qT r0 = this.A0C;
        if (r0 != null) {
            r0.A0C();
        }
        A0c();
        this.A0S = false;
        C38251qy r1 = this.A0D;
        if (r1 != null) {
            C37931qQ r02 = this.A0v;
            r1.A0A = false;
            r1.A1E(r02, this);
        }
        this.A13.clear();
        removeCallbacks(this.A0J);
        do {
        } while (C42031xV.A03.BAf() != null);
        C38811rw r03 = this.A0A;
        if (r03 != null) {
            r03.A02.remove(this);
            this.A0A = null;
        }
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.A11;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C40611uz) arrayList.get(i)).A04(canvas, this);
        }
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3 || i2 != i4) {
            this.A03 = null;
            this.A06 = null;
            this.A05 = null;
            this.A04 = null;
        }
    }

    public void removeDetachedView(View view, boolean z) {
        C42011xT A022 = A02(view);
        if (A022 != null) {
            int i = A022.A00;
            if ((i & 256) != 0) {
                A022.A00 = i & -257;
            } else if (!A022.A0A()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb.append(A022);
                sb.append(A0R());
                throw new IllegalArgumentException(sb.toString());
            }
        }
        view.clearAnimation();
        A0p(view);
        super.removeDetachedView(view, z);
    }

    public void setEdgeEffectFactory(C37951qS r2) {
        C28111Yx.A02(r2);
        this.A0m = r2;
        this.A03 = null;
        this.A06 = null;
        this.A05 = null;
        this.A04 = null;
    }

    public void setHasFixedSize(boolean z) {
        this.A0R = z;
    }

    @Deprecated
    public void setLayoutFrozen(boolean z) {
        suppressLayout(z);
    }

    public void setNestedScrollingEnabled(boolean z) {
        getScrollingChildHelper().A0A(z);
    }

    public void setOnFlingListener(AnonymousClass2S0 r1) {
        this.A0E = r1;
    }

    @Deprecated
    public void setOnScrollListener(C39711tW r1) {
        this.A0G = r1;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.A0Y = z;
    }

    public void setRecyclerListener(AnonymousClass3KB r1) {
        this.A0H = r1;
    }

    public void setScrollingTouchSlop(int i) {
        int i2;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 0) {
            if (i != 1) {
                StringBuilder sb = new StringBuilder();
                sb.append("setScrollingTouchSlop(): bad argument constant ");
                sb.append(i);
                sb.append("; using default value");
                Log.w("RecyclerView", sb.toString());
            } else {
                i2 = viewConfiguration.getScaledPagingTouchSlop();
                this.A0i = i2;
            }
        }
        i2 = viewConfiguration.getScaledTouchSlop();
        this.A0i = i2;
    }

    public boolean startNestedScroll(int i) {
        return getScrollingChildHelper().A0D(i, 0);
    }

    public void stopNestedScroll() {
        getScrollingChildHelper().A09(0);
    }

    public void addFocusables(ArrayList arrayList, int i, int i2) {
        super.addFocusables(arrayList, i, i2);
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C38251qy r0 = this.A0D;
        if (r0 != null) {
            return r0.A0y(layoutParams);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("RecyclerView has no LayoutManager");
        sb.append(A0R());
        throw new IllegalStateException(sb.toString());
    }

    /* JADX WARNING: type inference failed for: r0v9, types: [X.1qS, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v13, types: [java.lang.Object, X.1qY] */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0203 A[Catch:{ NoSuchMethodException -> 0x024d, ClassNotFoundException -> 0x02e7, InvocationTargetException -> 0x02ca, InstantiationException -> 0x02ad, IllegalAccessException -> 0x028e, ClassCastException -> 0x026f }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0216 A[Catch:{ NoSuchMethodException -> 0x024d, ClassNotFoundException -> 0x02e7, InvocationTargetException -> 0x02ca, InstantiationException -> 0x02ad, IllegalAccessException -> 0x028e, ClassCastException -> 0x026f }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public RecyclerView(android.content.Context r22, android.util.AttributeSet r23, int r24) {
        /*
            r21 = this;
            r5 = r21
            r8 = r22
            r7 = r23
            r6 = r24
            r5.<init>(r8, r7, r6)
            X.1qP r0 = new X.1qP
            r0.<init>(r5)
            r5.A17 = r0
            X.1qQ r0 = new X.1qQ
            r0.<init>(r5)
            r5.A0v = r0
            X.1qR r0 = new X.1qR
            r0.<init>()
            r5.A0z = r0
            r9 = 5
            X.25f r0 = new X.25f
            r0.<init>((java.lang.Object) r5, (int) r9)
            r5.A10 = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r5.A0r = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r5.A0s = r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r5.A0t = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r5.A11 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r5.A12 = r0
            r4 = 0
            r5.A0e = r4
            r5.A0O = r4
            r5.A0P = r4
            r5.A01 = r4
            r5.A0b = r4
            X.1qS r0 = new X.1qS
            r0.<init>()
            r5.A0m = r0
            X.1qV r0 = new X.1qV
            r0.<init>()
            r5.A0C = r0
            r5.A02 = r4
            r12 = -1
            r5.A0h = r12
            r0 = 1
            r5.A0Z = r0
            r5.A0a = r0
            r3 = 1
            r5.A0Y = r3
            X.1qW r0 = new X.1qW
            r0.<init>(r5)
            r5.A0x = r0
            X.1qY r0 = new X.1qY
            r0.<init>()
            r5.A09 = r0
            X.1qZ r0 = new X.1qZ
            r0.<init>()
            r5.A0w = r0
            r5.A0T = r4
            r5.A0U = r4
            X.1qb r0 = new X.1qb
            r0.<init>(r5)
            r5.A0n = r0
            r5.A0X = r4
            r2 = 2
            int[] r0 = new int[r2]
            r5.A14 = r0
            int[] r0 = new int[r2]
            r5.A19 = r0
            int[] r0 = new int[r2]
            r5.A18 = r0
            int[] r0 = new int[r2]
            r5.A15 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r5.A13 = r0
            r10 = 6
            X.25f r0 = new X.25f
            r0.<init>((java.lang.Object) r5, (int) r10)
            r5.A0J = r0
            X.1qd r0 = new X.1qd
            r0.<init>(r5)
            r5.A0y = r0
            r5.setScrollContainer(r3)
            r5.setFocusableInTouchMode(r3)
            android.view.ViewConfiguration r1 = android.view.ViewConfiguration.get(r8)
            int r0 = r1.getScaledTouchSlop()
            r5.A0i = r0
            float r0 = X.C28971bN.A00(r8, r1)
            r5.A0Z = r0
            float r0 = X.C28971bN.A01(r8, r1)
            r5.A0a = r0
            int r0 = r1.getScaledMinimumFlingVelocity()
            r5.A0q = r0
            int r0 = r1.getScaledMaximumFlingVelocity()
            r5.A16 = r0
            int r1 = r5.getOverScrollMode()
            r0 = 0
            if (r1 != r2) goto L_0x00ea
            r0 = 1
        L_0x00ea:
            r5.setWillNotDraw(r0)
            X.1qT r1 = r5.A0C
            X.1qa r0 = r5.A0n
            r1.A04 = r0
            X.1qg r1 = new X.1qg
            r1.<init>(r5)
            X.1qi r0 = new X.1qi
            r0.<init>(r1)
            r5.A07 = r0
            X.1ql r1 = new X.1ql
            r1.<init>(r5)
            X.1qm r0 = new X.1qm
            r0.<init>(r1)
            r5.A08 = r0
            int r0 = X.AnonymousClass1HF.A01(r5)
            if (r0 != 0) goto L_0x0116
            r0 = 8
            X.AnonymousClass1HF.A0c(r5, r0)
        L_0x0116:
            int r0 = r5.getImportantForAccessibility()
            if (r0 != 0) goto L_0x011f
            r5.setImportantForAccessibility(r3)
        L_0x011f:
            android.content.Context r1 = r5.getContext()
            java.lang.String r0 = "accessibility"
            java.lang.Object r0 = r1.getSystemService(r0)
            android.view.accessibility.AccessibilityManager r0 = (android.view.accessibility.AccessibilityManager) r0
            r5.A0u = r0
            X.1qo r0 = new X.1qo
            r0.<init>(r5)
            r5.setAccessibilityDelegateCompat(r0)
            int[] r11 = X.C38191qq.A00
            android.content.res.TypedArray r1 = r8.obtainStyledAttributes(r7, r11, r6, r4)
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 29
            if (r0 < r2) goto L_0x014f
            r13 = r5
            r14 = r8
            r15 = r11
            r16 = r7
            r17 = r1
            r18 = r6
            r19 = r4
            r13.saveAttributeDataForStyleable(r14, r15, r16, r17, r18, r19)
        L_0x014f:
            r0 = 8
            java.lang.String r11 = r1.getString(r0)
            r0 = 2
            int r0 = r1.getInt(r0, r12)
            if (r0 != r12) goto L_0x0161
            r0 = 262144(0x40000, float:3.67342E-40)
            r5.setDescendantFocusability(r0)
        L_0x0161:
            boolean r0 = r1.getBoolean(r3, r3)
            r5.A0N = r0
            r0 = 3
            boolean r0 = r1.getBoolean(r0, r4)
            if (r0 == 0) goto L_0x01b2
            android.graphics.drawable.Drawable r15 = r1.getDrawable(r10)
            android.graphics.drawable.StateListDrawable r15 = (android.graphics.drawable.StateListDrawable) r15
            r0 = 7
            android.graphics.drawable.Drawable r13 = r1.getDrawable(r0)
            r0 = 4
            android.graphics.drawable.Drawable r0 = r1.getDrawable(r0)
            android.graphics.drawable.StateListDrawable r0 = (android.graphics.drawable.StateListDrawable) r0
            android.graphics.drawable.Drawable r14 = r1.getDrawable(r9)
            if (r15 == 0) goto L_0x0326
            if (r13 == 0) goto L_0x0326
            if (r0 == 0) goto L_0x0326
            if (r14 == 0) goto L_0x0326
            android.content.Context r9 = r5.getContext()
            android.content.res.Resources r10 = r9.getResources()
            r9 = 2131166787(0x7f070643, float:1.794783E38)
            int r18 = r10.getDimensionPixelSize(r9)
            r9 = 2131166789(0x7f070645, float:1.7947833E38)
            int r19 = r10.getDimensionPixelSize(r9)
            r9 = 2131166788(0x7f070644, float:1.7947831E38)
            int r20 = r10.getDimensionPixelOffset(r9)
            X.BM6 r12 = new X.BM6
            r17 = r5
            r16 = r0
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20)
        L_0x01b2:
            r1.recycle()
            java.lang.String r10 = ": Could not instantiate the LayoutManager: "
            if (r11 == 0) goto L_0x0306
            java.lang.String r9 = r11.trim()
            boolean r0 = r9.isEmpty()
            if (r0 != 0) goto L_0x0306
            char r0 = r9.charAt(r4)
            r11 = 46
            if (r0 != r11) goto L_0x01df
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = r8.getPackageName()
            r1.append(r0)
        L_0x01d7:
            r1.append(r9)
            java.lang.String r9 = r1.toString()
            goto L_0x01fd
        L_0x01df:
            java.lang.String r0 = "."
            boolean r0 = r9.contains(r0)
            if (r0 != 0) goto L_0x01fd
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.Class<androidx.recyclerview.widget.RecyclerView> r0 = androidx.recyclerview.widget.RecyclerView.class
            java.lang.Package r0 = r0.getPackage()
            java.lang.String r0 = r0.getName()
            r1.append(r0)
            r1.append(r11)
            goto L_0x01d7
        L_0x01fd:
            boolean r0 = r5.isInEditMode()     // Catch:{ ClassNotFoundException -> 0x02e7, InvocationTargetException -> 0x02ca, InstantiationException -> 0x02ad, IllegalAccessException -> 0x028e, ClassCastException -> 0x026f }
            if (r0 == 0) goto L_0x0216
            java.lang.Class r0 = r5.getClass()     // Catch:{ ClassNotFoundException -> 0x02e7, InvocationTargetException -> 0x02ca, InstantiationException -> 0x02ad, IllegalAccessException -> 0x028e, ClassCastException -> 0x026f }
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x02e7, InvocationTargetException -> 0x02ca, InstantiationException -> 0x02ad, IllegalAccessException -> 0x028e, ClassCastException -> 0x026f }
        L_0x020b:
            java.lang.Class r1 = java.lang.Class.forName(r9, r4, r0)     // Catch:{ ClassNotFoundException -> 0x02e7, InvocationTargetException -> 0x02ca, InstantiationException -> 0x02ad, IllegalAccessException -> 0x028e, ClassCastException -> 0x026f }
            java.lang.Class<X.1qy> r0 = X.C38251qy.class
            java.lang.Class r11 = r1.asSubclass(r0)     // Catch:{ ClassNotFoundException -> 0x02e7, InvocationTargetException -> 0x02ca, InstantiationException -> 0x02ad, IllegalAccessException -> 0x028e, ClassCastException -> 0x026f }
            goto L_0x021b
        L_0x0216:
            java.lang.ClassLoader r0 = r8.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x02e7, InvocationTargetException -> 0x02ca, InstantiationException -> 0x02ad, IllegalAccessException -> 0x028e, ClassCastException -> 0x026f }
            goto L_0x020b
        L_0x021b:
            java.lang.Class[] r0 = A1C     // Catch:{ NoSuchMethodException -> 0x0237 }
            java.lang.reflect.Constructor r13 = r11.getConstructor(r0)     // Catch:{ NoSuchMethodException -> 0x0237 }
            r0 = 4
            java.lang.Object[] r12 = new java.lang.Object[r0]     // Catch:{ NoSuchMethodException -> 0x0237 }
            r12[r4] = r22     // Catch:{ NoSuchMethodException -> 0x0237 }
            r12[r3] = r23     // Catch:{ NoSuchMethodException -> 0x0237 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)     // Catch:{ NoSuchMethodException -> 0x0237 }
            r0 = 2
            r12[r0] = r1     // Catch:{ NoSuchMethodException -> 0x0237 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)     // Catch:{ NoSuchMethodException -> 0x0237 }
            r0 = 3
            r12[r0] = r1     // Catch:{ NoSuchMethodException -> 0x0237 }
            goto L_0x023f
        L_0x0237:
            r1 = move-exception
            java.lang.Class[] r0 = new java.lang.Class[r4]     // Catch:{ NoSuchMethodException -> 0x024d }
            java.lang.reflect.Constructor r13 = r11.getConstructor(r0)     // Catch:{ NoSuchMethodException -> 0x024d }
            r12 = 0
        L_0x023f:
            r13.setAccessible(r3)     // Catch:{ ClassNotFoundException -> 0x02e7, InvocationTargetException -> 0x02ca, InstantiationException -> 0x02ad, IllegalAccessException -> 0x028e, ClassCastException -> 0x026f }
            java.lang.Object r0 = r13.newInstance(r12)     // Catch:{ ClassNotFoundException -> 0x02e7, InvocationTargetException -> 0x02ca, InstantiationException -> 0x02ad, IllegalAccessException -> 0x028e, ClassCastException -> 0x026f }
            X.1qy r0 = (X.C38251qy) r0     // Catch:{ ClassNotFoundException -> 0x02e7, InvocationTargetException -> 0x02ca, InstantiationException -> 0x02ad, IllegalAccessException -> 0x028e, ClassCastException -> 0x026f }
            r5.setLayoutManager(r0)     // Catch:{ ClassNotFoundException -> 0x02e7, InvocationTargetException -> 0x02ca, InstantiationException -> 0x02ad, IllegalAccessException -> 0x028e, ClassCastException -> 0x026f }
            goto L_0x0306
        L_0x024d:
            r2 = move-exception
            r2.initCause(r1)     // Catch:{ ClassNotFoundException -> 0x02e7, InvocationTargetException -> 0x02ca, InstantiationException -> 0x02ad, IllegalAccessException -> 0x028e, ClassCastException -> 0x026f }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException -> 0x02e7, InvocationTargetException -> 0x02ca, InstantiationException -> 0x02ad, IllegalAccessException -> 0x028e, ClassCastException -> 0x026f }
            r1.<init>()     // Catch:{ ClassNotFoundException -> 0x02e7, InvocationTargetException -> 0x02ca, InstantiationException -> 0x02ad, IllegalAccessException -> 0x028e, ClassCastException -> 0x026f }
            java.lang.String r0 = r7.getPositionDescription()     // Catch:{ ClassNotFoundException -> 0x02e7, InvocationTargetException -> 0x02ca, InstantiationException -> 0x02ad, IllegalAccessException -> 0x028e, ClassCastException -> 0x026f }
            r1.append(r0)     // Catch:{ ClassNotFoundException -> 0x02e7, InvocationTargetException -> 0x02ca, InstantiationException -> 0x02ad, IllegalAccessException -> 0x028e, ClassCastException -> 0x026f }
            java.lang.String r0 = ": Error creating LayoutManager "
            r1.append(r0)     // Catch:{ ClassNotFoundException -> 0x02e7, InvocationTargetException -> 0x02ca, InstantiationException -> 0x02ad, IllegalAccessException -> 0x028e, ClassCastException -> 0x026f }
            r1.append(r9)     // Catch:{ ClassNotFoundException -> 0x02e7, InvocationTargetException -> 0x02ca, InstantiationException -> 0x02ad, IllegalAccessException -> 0x028e, ClassCastException -> 0x026f }
            java.lang.String r1 = r1.toString()     // Catch:{ ClassNotFoundException -> 0x02e7, InvocationTargetException -> 0x02ca, InstantiationException -> 0x02ad, IllegalAccessException -> 0x028e, ClassCastException -> 0x026f }
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ ClassNotFoundException -> 0x02e7, InvocationTargetException -> 0x02ca, InstantiationException -> 0x02ad, IllegalAccessException -> 0x028e, ClassCastException -> 0x026f }
            r0.<init>(r1, r2)     // Catch:{ ClassNotFoundException -> 0x02e7, InvocationTargetException -> 0x02ca, InstantiationException -> 0x02ad, IllegalAccessException -> 0x028e, ClassCastException -> 0x026f }
            throw r0     // Catch:{ ClassNotFoundException -> 0x02e7, InvocationTargetException -> 0x02ca, InstantiationException -> 0x02ad, IllegalAccessException -> 0x028e, ClassCastException -> 0x026f }
        L_0x026f:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = r7.getPositionDescription()
            r1.append(r0)
            java.lang.String r0 = ": Class is not a LayoutManager "
            r1.append(r0)
            r1.append(r9)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1, r2)
            throw r0
        L_0x028e:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = r7.getPositionDescription()
            r1.append(r0)
            java.lang.String r0 = ": Cannot access non-public constructor "
            r1.append(r0)
            r1.append(r9)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1, r2)
            throw r0
        L_0x02ad:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = r7.getPositionDescription()
            r1.append(r0)
            r1.append(r10)
            r1.append(r9)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1, r2)
            throw r0
        L_0x02ca:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = r7.getPositionDescription()
            r1.append(r0)
            r1.append(r10)
            r1.append(r9)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1, r2)
            throw r0
        L_0x02e7:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = r7.getPositionDescription()
            r1.append(r0)
            java.lang.String r0 = ": Unable to find LayoutManager "
            r1.append(r0)
            r1.append(r9)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1, r2)
            throw r0
        L_0x0306:
            int[] r9 = A1D
            android.content.res.TypedArray r1 = r8.obtainStyledAttributes(r7, r9, r6, r4)
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r2) goto L_0x031b
            r10 = r5
            r11 = r8
            r12 = r9
            r13 = r7
            r14 = r1
            r15 = r6
            r16 = r4
            r10.saveAttributeDataForStyleable(r11, r12, r13, r14, r15, r16)
        L_0x031b:
            boolean r0 = r1.getBoolean(r4, r3)
            r1.recycle()
            r5.setNestedScrollingEnabled(r0)
            return
        L_0x0326:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Trying to set fast scroller without both required drawables."
            r1.append(r0)
            java.lang.String r0 = r5.A0R()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130970923);
    }
}
