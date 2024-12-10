package X;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bloks.stdlib.components.bkcomponentscollection.StickyHeadersLinearLayoutManager;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import com.facebook.msys.mci.DefaultCrypto;
import com.whatsapp.accountswitching.secondaryprocess.AccountSwitchingActivity$showShimmerTransition$layoutManager$1;
import java.util.ArrayList;

/* renamed from: X.1qy  reason: invalid class name and case insensitive filesystem */
public abstract class C38251qy {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public C38151qm A05;
    public C25272CcK A06;
    public RecyclerView A07;
    public C38291r3 A08;
    public C38291r3 A09;
    public boolean A0A = false;
    public boolean A0B;
    public boolean A0C = false;
    public final C38281r2 A0D;
    public final C38281r2 A0E;

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0029, code lost:
        if (r0 == 1073741824) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0016, code lost:
        if (r5 == 1073741824) goto L_0x002d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A01(int r4, int r5, int r6, int r7, boolean r8) {
        /*
            int r4 = r4 - r6
            r0 = 0
            int r4 = java.lang.Math.max(r0, r4)
            r3 = -2
            r2 = -1
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = 1073741824(0x40000000, float:2.0)
            if (r8 == 0) goto L_0x001f
            if (r7 >= 0) goto L_0x002f
            if (r7 != r2) goto L_0x0018
            if (r5 == r0) goto L_0x002d
            if (r5 == 0) goto L_0x0018
            if (r5 == r1) goto L_0x002d
        L_0x0018:
            r5 = 0
            r7 = 0
        L_0x001a:
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
            return r0
        L_0x001f:
            if (r7 >= 0) goto L_0x002f
            if (r7 == r2) goto L_0x002d
            if (r7 != r3) goto L_0x0018
            if (r5 == r0) goto L_0x002b
            r0 = r5
            r5 = 0
            if (r0 != r1) goto L_0x002d
        L_0x002b:
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x002d:
            r7 = r4
            goto L_0x001a
        L_0x002f:
            r5 = 1073741824(0x40000000, float:2.0)
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38251qy.A01(int, int, int, int, boolean):int");
    }

    public void A0U(View view) {
        C38491rN r6 = (C38491rN) view.getLayoutParams();
        Rect A0L = this.A07.A0L(view);
        int i = 0 + A0L.left + A0L.right;
        int i2 = 0 + A0L.top + A0L.bottom;
        int A012 = A01(this.A03, this.A04, A0M() + A0N() + r6.leftMargin + r6.rightMargin + i, r6.width, A1I());
        int A013 = A01(this.A00, this.A01, A0O() + A0L() + r6.topMargin + r6.bottomMargin + i2, r6.height, A1J());
        if (A0h(view, r6, A012, A013)) {
            view.measure(A012, A013);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00a4, code lost:
        if ((r1.bottom - r5) > r6) goto L_0x00a7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0f(android.graphics.Rect r12, android.view.View r13, androidx.recyclerview.widget.RecyclerView r14, boolean r15, boolean r16) {
        /*
            r11 = this;
            r0 = 2
            int[] r8 = new int[r0]
            int r4 = r11.A0M()
            int r3 = r11.A0O()
            int r2 = r11.A03
            int r0 = r11.A0N()
            int r2 = r2 - r0
            int r1 = r11.A00
            int r0 = r11.A0L()
            int r1 = r1 - r0
            int r9 = r13.getLeft()
            int r0 = r12.left
            int r9 = r9 + r0
            int r0 = r13.getScrollX()
            int r9 = r9 - r0
            int r7 = r13.getTop()
            int r0 = r12.top
            int r7 = r7 + r0
            int r0 = r13.getScrollY()
            int r7 = r7 - r0
            int r6 = r12.width()
            int r6 = r6 + r9
            int r0 = r12.height()
            int r0 = r0 + r7
            int r9 = r9 - r4
            r4 = 0
            int r10 = java.lang.Math.min(r4, r9)
            int r7 = r7 - r3
            int r5 = java.lang.Math.min(r4, r7)
            int r6 = r6 - r2
            int r3 = java.lang.Math.max(r4, r6)
            int r0 = r0 - r1
            int r2 = java.lang.Math.max(r4, r0)
            androidx.recyclerview.widget.RecyclerView r0 = r11.A07
            int r1 = r0.getLayoutDirection()
            r0 = 1
            if (r1 != r0) goto L_0x00b1
            if (r3 != 0) goto L_0x005f
            int r3 = java.lang.Math.max(r10, r6)
        L_0x005f:
            if (r5 != 0) goto L_0x0065
            int r5 = java.lang.Math.min(r7, r2)
        L_0x0065:
            r8[r4] = r3
            r8[r0] = r5
            r10 = 0
            r4 = r8[r4]
            r9 = 1
            if (r16 == 0) goto L_0x00a7
            android.view.View r8 = r14.getFocusedChild()
            if (r8 == 0) goto L_0x00a6
            int r7 = r11.A0M()
            int r6 = r11.A0O()
            int r3 = r11.A03
            int r0 = r11.A0N()
            int r3 = r3 - r0
            int r2 = r11.A00
            int r0 = r11.A0L()
            int r2 = r2 - r0
            androidx.recyclerview.widget.RecyclerView r0 = r11.A07
            android.graphics.Rect r1 = r0.A0r
            androidx.recyclerview.widget.RecyclerView.A09(r8, r1)
            int r0 = r1.left
            int r0 = r0 - r4
            if (r0 >= r3) goto L_0x00a6
            int r0 = r1.right
            int r0 = r0 - r4
            if (r0 <= r7) goto L_0x00a6
            int r0 = r1.top
            int r0 = r0 - r5
            if (r0 >= r2) goto L_0x00a6
            int r0 = r1.bottom
            int r0 = r0 - r5
            if (r0 > r6) goto L_0x00a7
        L_0x00a6:
            return r10
        L_0x00a7:
            if (r4 != 0) goto L_0x00ab
            if (r5 == 0) goto L_0x00a6
        L_0x00ab:
            if (r15 == 0) goto L_0x00b9
            r14.scrollBy(r4, r5)
            return r9
        L_0x00b1:
            if (r10 != 0) goto L_0x00b7
            int r10 = java.lang.Math.min(r9, r3)
        L_0x00b7:
            r3 = r10
            goto L_0x005f
        L_0x00b9:
            r14.A0l(r4, r5)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38251qy.A0f(android.graphics.Rect, android.view.View, androidx.recyclerview.widget.RecyclerView, boolean, boolean):boolean");
    }

    public abstract int A0m(C37931qQ r1, C38021qZ r2, int i);

    public abstract int A0n(C37931qQ r1, C38021qZ r2, int i);

    public int A0o(C38021qZ r3) {
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this;
        if (!(linearLayoutManager instanceof StickyHeadersLinearLayoutManager)) {
            return LinearLayoutManager.A06(linearLayoutManager, r3);
        }
        StickyHeadersLinearLayoutManager stickyHeadersLinearLayoutManager = (StickyHeadersLinearLayoutManager) linearLayoutManager;
        C18070vi.A0d(r3, 0);
        StickyHeadersLinearLayoutManager.A0I(stickyHeadersLinearLayoutManager);
        int A062 = LinearLayoutManager.A06(stickyHeadersLinearLayoutManager, r3);
        StickyHeadersLinearLayoutManager.A0H(stickyHeadersLinearLayoutManager);
        return A062;
    }

    public int A0p(C38021qZ r3) {
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this;
        if (!(linearLayoutManager instanceof StickyHeadersLinearLayoutManager)) {
            return LinearLayoutManager.A07(linearLayoutManager, r3);
        }
        StickyHeadersLinearLayoutManager stickyHeadersLinearLayoutManager = (StickyHeadersLinearLayoutManager) linearLayoutManager;
        C18070vi.A0d(r3, 0);
        StickyHeadersLinearLayoutManager.A0I(stickyHeadersLinearLayoutManager);
        int A072 = LinearLayoutManager.A07(stickyHeadersLinearLayoutManager, r3);
        StickyHeadersLinearLayoutManager.A0H(stickyHeadersLinearLayoutManager);
        return A072;
    }

    public int A0q(C38021qZ r3) {
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this;
        if (!(linearLayoutManager instanceof StickyHeadersLinearLayoutManager)) {
            return LinearLayoutManager.A08(linearLayoutManager, r3);
        }
        StickyHeadersLinearLayoutManager stickyHeadersLinearLayoutManager = (StickyHeadersLinearLayoutManager) linearLayoutManager;
        C18070vi.A0d(r3, 0);
        StickyHeadersLinearLayoutManager.A0I(stickyHeadersLinearLayoutManager);
        int A082 = LinearLayoutManager.A08(stickyHeadersLinearLayoutManager, r3);
        StickyHeadersLinearLayoutManager.A0H(stickyHeadersLinearLayoutManager);
        return A082;
    }

    public int A0r(C38021qZ r3) {
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this;
        if (!(linearLayoutManager instanceof StickyHeadersLinearLayoutManager)) {
            return LinearLayoutManager.A06(linearLayoutManager, r3);
        }
        StickyHeadersLinearLayoutManager stickyHeadersLinearLayoutManager = (StickyHeadersLinearLayoutManager) linearLayoutManager;
        C18070vi.A0d(r3, 0);
        StickyHeadersLinearLayoutManager.A0I(stickyHeadersLinearLayoutManager);
        int A062 = LinearLayoutManager.A06(stickyHeadersLinearLayoutManager, r3);
        StickyHeadersLinearLayoutManager.A0H(stickyHeadersLinearLayoutManager);
        return A062;
    }

    public int A0s(C38021qZ r3) {
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this;
        if (!(linearLayoutManager instanceof StickyHeadersLinearLayoutManager)) {
            return LinearLayoutManager.A07(linearLayoutManager, r3);
        }
        StickyHeadersLinearLayoutManager stickyHeadersLinearLayoutManager = (StickyHeadersLinearLayoutManager) linearLayoutManager;
        C18070vi.A0d(r3, 0);
        StickyHeadersLinearLayoutManager.A0I(stickyHeadersLinearLayoutManager);
        int A072 = LinearLayoutManager.A07(stickyHeadersLinearLayoutManager, r3);
        StickyHeadersLinearLayoutManager.A0H(stickyHeadersLinearLayoutManager);
        return A072;
    }

    public int A0t(C38021qZ r3) {
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this;
        if (!(linearLayoutManager instanceof StickyHeadersLinearLayoutManager)) {
            return LinearLayoutManager.A08(linearLayoutManager, r3);
        }
        StickyHeadersLinearLayoutManager stickyHeadersLinearLayoutManager = (StickyHeadersLinearLayoutManager) linearLayoutManager;
        C18070vi.A0d(r3, 0);
        StickyHeadersLinearLayoutManager.A0I(stickyHeadersLinearLayoutManager);
        int A082 = LinearLayoutManager.A08(stickyHeadersLinearLayoutManager, r3);
        StickyHeadersLinearLayoutManager.A0H(stickyHeadersLinearLayoutManager);
        return A082;
    }

    public abstract Parcelable A0u();

    public abstract View A0v(View view, C37931qQ r2, C38021qZ r3, int i);

    /* JADX WARNING: type inference failed for: r2v1, types: [X.1rN, X.28N] */
    /* JADX WARNING: type inference failed for: r2v3, types: [X.1rN, X.28N] */
    public C38491rN A0w() {
        AnonymousClass28N r2;
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this;
        if (!(linearLayoutManager instanceof GridLayoutManager)) {
            return new C38491rN(-2, -2);
        }
        if (linearLayoutManager.A01 == 0) {
            ? r22 = new C38491rN(-2, -1);
            r22.A00 = -1;
            r2 = r22;
        } else {
            ? r23 = new C38491rN(-1, -2);
            r23.A00 = -1;
            r2 = r23;
        }
        r2.A01 = 0;
        return r2;
    }

    public void A12(int i) {
    }

    public void A13(int i) {
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this;
        if (linearLayoutManager instanceof StickyHeadersLinearLayoutManager) {
            linearLayoutManager.A1a(i, Integer.MIN_VALUE);
            return;
        }
        linearLayoutManager.A02 = i;
        linearLayoutManager.A03 = Integer.MIN_VALUE;
        C64522uu r1 = linearLayoutManager.A05;
        if (r1 != null) {
            r1.A01 = -1;
        }
        linearLayoutManager.A0Q();
    }

    public abstract void A19(Parcelable parcelable);

    public void A1C(C38001qX r8, C38021qZ r9, int i, int i2) {
        int i3;
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this;
        if (linearLayoutManager.A01 != 0) {
            i = i2;
        }
        if (linearLayoutManager.A0J() != 0 && i != 0) {
            linearLayoutManager.A1Y();
            int i4 = -1;
            if (i > 0) {
                i4 = 1;
            }
            LinearLayoutManager.A0D(linearLayoutManager, r9, i4, Math.abs(i), true);
            C41991xR r3 = linearLayoutManager.A04;
            if (linearLayoutManager instanceof GridLayoutManager) {
                GridLayoutManager gridLayoutManager = (GridLayoutManager) linearLayoutManager;
                int i5 = gridLayoutManager.A00;
                for (int i6 = 0; i6 < gridLayoutManager.A00 && (i3 = r3.A01) >= 0 && i3 < r9.A00() && i5 > 0; i6++) {
                    r8.BBe(i3, Math.max(0, r3.A08));
                    i5 -= gridLayoutManager.A01.A00(i3);
                    r3.A01 += r3.A03;
                }
                return;
            }
            int i7 = r3.A01;
            if (i7 >= 0 && i7 < r9.A00()) {
                r8.BBe(i7, Math.max(0, r3.A08));
            }
        }
    }

    public abstract void A1D(C37931qQ r1, C38021qZ r2);

    public void A1E(C37931qQ r3, RecyclerView recyclerView) {
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this;
        if (linearLayoutManager.A08) {
            linearLayoutManager.A0b(r3);
            r3.A05.clear();
            r3.A04();
        }
    }

    public abstract void A1F(C38021qZ r1);

    public boolean A1I() {
        if (((LinearLayoutManager) this).A01 == 0) {
            return true;
        }
        return false;
    }

    public boolean A1J() {
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this;
        if ((linearLayoutManager instanceof AccountSwitchingActivity$showShimmerTransition$layoutManager$1) || linearLayoutManager.A01 != 1) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0012 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A1L() {
        /*
            r3 = this;
            r2 = r3
            androidx.recyclerview.widget.LinearLayoutManager r2 = (androidx.recyclerview.widget.LinearLayoutManager) r2
            boolean r0 = r2 instanceof androidx.recyclerview.widget.GridLayoutManager
            if (r0 == 0) goto L_0x0014
            androidx.recyclerview.widget.GridLayoutManager r2 = (androidx.recyclerview.widget.GridLayoutManager) r2
            X.2uu r0 = r2.A05
            if (r0 != 0) goto L_0x0012
            boolean r0 = r2.A02
            r2 = 1
            if (r0 == 0) goto L_0x0013
        L_0x0012:
            r2 = 0
        L_0x0013:
            return r2
        L_0x0014:
            X.2uu r0 = r2.A05
            if (r0 != 0) goto L_0x0012
            boolean r1 = r2.A07
            boolean r0 = r2.A0B
            r2 = 1
            if (r1 == r0) goto L_0x0013
            goto L_0x0012
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38251qy.A1L():boolean");
    }

    public int A0J() {
        C38151qm r0 = this.A05;
        if (r0 != null) {
            return r0.A03();
        }
        return 0;
    }

    public int A0K() {
        C38391rD r0;
        RecyclerView recyclerView = this.A07;
        if (recyclerView == null || (r0 = recyclerView.A0B) == null) {
            return 0;
        }
        return r0.A0Q();
    }

    public int A0L() {
        RecyclerView recyclerView = this.A07;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public int A0M() {
        RecyclerView recyclerView = this.A07;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public int A0N() {
        RecyclerView recyclerView = this.A07;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public int A0O() {
        RecyclerView recyclerView = this.A07;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public View A0P(int i) {
        C38151qm r0 = this.A05;
        if (r0 != null) {
            return r0.A06(i);
        }
        return null;
    }

    public void A0Q() {
        RecyclerView recyclerView = this.A07;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public void A0V(View view) {
        C38151qm r3 = this.A05;
        RecyclerView recyclerView = ((C38141ql) r3.A01).A00;
        int indexOfChild = recyclerView.indexOfChild(view);
        if (indexOfChild >= 0) {
            if (r3.A00.A07(indexOfChild)) {
                C38151qm.A02(view, r3);
            }
            View childAt = recyclerView.getChildAt(indexOfChild);
            if (childAt != null) {
                recyclerView.A0p(childAt);
                childAt.clearAnimation();
            }
            recyclerView.removeViewAt(indexOfChild);
        }
    }

    public void A0X(View view, Rect rect) {
        RecyclerView recyclerView = this.A07;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.A0L(view));
        }
    }

    public void A0Z(C26228CvK cvK, C37931qQ r5, C38021qZ r6) {
        if (this.A07.canScrollVertically(-1) || this.A07.canScrollHorizontally(-1)) {
            cvK.A0A(DefaultCrypto.BUFFER_SIZE);
            cvK.A0p(true);
        }
        if (this.A07.canScrollVertically(1) || this.A07.canScrollHorizontally(1)) {
            cvK.A0A(ZipDecompressor.UNZIP_BUFFER_SIZE);
            cvK.A0p(true);
        }
        cvK.A0Z(C25475CgU.A00(A0l(r5, r6), A0k(r5, r6), 0, false));
    }

    public void A0c(C37931qQ r8) {
        ArrayList arrayList = r8.A05;
        int size = arrayList.size();
        for (int i = size - 1; i >= 0; i--) {
            View view = ((C42011xT) arrayList.get(i)).A0H;
            C42011xT A022 = RecyclerView.A02(view);
            if (!A022.A0A()) {
                A022.A09(false);
                if ((A022.A00 & 256) != 0) {
                    this.A07.removeDetachedView(view, false);
                }
                C37961qT r0 = this.A07.A0C;
                if (r0 != null) {
                    r0.A0E(A022);
                }
                A022.A09(true);
                C42011xT A023 = RecyclerView.A02(view);
                A023.A08 = null;
                A023.A0F = false;
                A023.A00 &= -33;
                r8.A09(A023);
            }
        }
        arrayList.clear();
        ArrayList arrayList2 = r8.A04;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.A07.invalidate();
        }
    }

    public void A0e(C25272CcK ccK) {
        C25272CcK ccK2 = this.A06;
        if (!(ccK2 == null || ccK == ccK2 || !ccK2.A05)) {
            ccK2.A02();
        }
        this.A06 = ccK;
        RecyclerView recyclerView = this.A07;
        C37991qW r1 = recyclerView.A0x;
        r1.A06.removeCallbacks(r1);
        r1.A03.abortAnimation();
        if (ccK.A06) {
            StringBuilder sb = new StringBuilder();
            sb.append("An instance of ");
            String simpleName = ccK.getClass().getSimpleName();
            sb.append(simpleName);
            sb.append(" was started more than once. Each instance of");
            sb.append(simpleName);
            sb.append(" is intended to only be used once. You should create a new instance for each use.");
            Log.w("RecyclerView", sb.toString());
        }
        ccK.A03 = recyclerView;
        ccK.A02 = this;
        int i = ccK.A00;
        if (i != -1) {
            recyclerView.A0w.A06 = i;
            ccK.A05 = true;
            ccK.A04 = true;
            ccK.A01 = recyclerView.A0D.A0j(i);
            ccK.A01();
            ccK.A03.A0x.A00();
            ccK.A06 = true;
            return;
        }
        throw new IllegalArgumentException("Invalid target position");
    }

    public boolean A0g(Bundle bundle, C37931qQ r8, C38021qZ r9, int i) {
        int i2;
        int i3;
        int i4;
        RecyclerView recyclerView = this.A07;
        if (recyclerView != null) {
            if (i == 4096) {
                if (recyclerView.canScrollVertically(1)) {
                    i4 = (this.A00 - A0O()) - A0L();
                } else {
                    i4 = 0;
                }
                if (this.A07.canScrollHorizontally(1)) {
                    i3 = (this.A03 - A0M()) - A0N();
                }
                i3 = 0;
            } else if (i == 8192) {
                if (recyclerView.canScrollVertically(-1)) {
                    i2 = -((this.A00 - A0O()) - A0L());
                } else {
                    i2 = 0;
                }
                if (this.A07.canScrollHorizontally(-1)) {
                    i3 = -((this.A03 - A0M()) - A0N());
                }
                i3 = 0;
            }
            if (!(i2 == 0 && i3 == 0)) {
                this.A07.A0n(i3, i2, true);
                return true;
            }
        }
        return false;
    }

    public void A0i(RecyclerView recyclerView) {
        if (this instanceof StickyHeadersLinearLayoutManager) {
            StickyHeadersLinearLayoutManager.A0E(recyclerView.A0B, (StickyHeadersLinearLayoutManager) this);
        }
    }

    public int A0k(C37931qQ r4, C38021qZ r5) {
        C38391rD r1;
        RecyclerView recyclerView = this.A07;
        if (recyclerView == null || (r1 = recyclerView.A0B) == null || !A1I()) {
            return 1;
        }
        return r1.A0Q();
    }

    public int A0l(C37931qQ r4, C38021qZ r5) {
        C38391rD r1;
        RecyclerView recyclerView = this.A07;
        if (recyclerView == null || (r1 = recyclerView.A0B) == null || !A1J()) {
            return 1;
        }
        return r1.A0Q();
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.1rN, X.28N] */
    public C38491rN A0x(Context context, AttributeSet attributeSet) {
        if (!(this instanceof GridLayoutManager)) {
            return new C38491rN(context, attributeSet);
        }
        ? r1 = new C38491rN(context, attributeSet);
        r1.A00 = -1;
        r1.A01 = 0;
        return r1;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: X.1rN} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: X.28N} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: X.1rN} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: X.28N} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: X.28N} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C38491rN A0y(android.view.ViewGroup.LayoutParams r3) {
        /*
            r2 = this;
            boolean r0 = r2 instanceof androidx.recyclerview.widget.GridLayoutManager
            if (r0 == 0) goto L_0x001c
            boolean r0 = r3 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L_0x0016
            android.view.ViewGroup$MarginLayoutParams r3 = (android.view.ViewGroup.MarginLayoutParams) r3
            X.28N r1 = new X.28N
            r1.<init>((android.view.ViewGroup.MarginLayoutParams) r3)
        L_0x000f:
            r0 = -1
            r1.A00 = r0
            r0 = 0
            r1.A01 = r0
            return r1
        L_0x0016:
            X.28N r1 = new X.28N
            r1.<init>((android.view.ViewGroup.LayoutParams) r3)
            goto L_0x000f
        L_0x001c:
            boolean r0 = r3 instanceof X.C38491rN
            if (r0 == 0) goto L_0x0028
            X.1rN r3 = (X.C38491rN) r3
            X.1rN r0 = new X.1rN
            r0.<init>((X.C38491rN) r3)
            return r0
        L_0x0028:
            boolean r0 = r3 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L_0x0034
            android.view.ViewGroup$MarginLayoutParams r3 = (android.view.ViewGroup.MarginLayoutParams) r3
            X.1rN r0 = new X.1rN
            r0.<init>((android.view.ViewGroup.MarginLayoutParams) r3)
            return r0
        L_0x0034:
            X.1rN r0 = new X.1rN
            r0.<init>((android.view.ViewGroup.LayoutParams) r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38251qy.A0y(android.view.ViewGroup$LayoutParams):X.1rN");
    }

    public void A0z() {
        if (this instanceof GridLayoutManager) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) this;
            gridLayoutManager.A01.A01.clear();
            gridLayoutManager.A01.A00.clear();
        }
    }

    public void A10(int i) {
        RecyclerView recyclerView = this.A07;
        if (recyclerView != null) {
            int A032 = recyclerView.A08.A03();
            for (int i2 = 0; i2 < A032; i2++) {
                recyclerView.A08.A06(i2).offsetLeftAndRight(i);
            }
        }
    }

    public void A11(int i) {
        RecyclerView recyclerView = this.A07;
        if (recyclerView != null) {
            int A032 = recyclerView.A08.A03();
            for (int i2 = 0; i2 < A032; i2++) {
                recyclerView.A08.A06(i2).offsetTopAndBottom(i);
            }
        }
    }

    public void A14(int i, int i2) {
        if (this instanceof GridLayoutManager) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) this;
            gridLayoutManager.A01.A01.clear();
            gridLayoutManager.A01.A00.clear();
        }
    }

    public void A15(int i, int i2) {
        if (this instanceof GridLayoutManager) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) this;
            gridLayoutManager.A01.A01.clear();
            gridLayoutManager.A01.A00.clear();
        }
    }

    public void A16(int i, int i2) {
        if (this instanceof GridLayoutManager) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) this;
            gridLayoutManager.A01.A01.clear();
            gridLayoutManager.A01.A00.clear();
        }
    }

    public void A17(int i, int i2) {
        if (this instanceof GridLayoutManager) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) this;
            gridLayoutManager.A01.A01.clear();
            gridLayoutManager.A01.A00.clear();
        }
    }

    public void A1B(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.A07;
        if (recyclerView != null && accessibilityEvent != null) {
            boolean z = true;
            if (!recyclerView.canScrollVertically(1) && !this.A07.canScrollVertically(-1) && !this.A07.canScrollHorizontally(-1) && !this.A07.canScrollHorizontally(1)) {
                z = false;
            }
            accessibilityEvent.setScrollable(z);
            C38391rD r0 = this.A07.A0B;
            if (r0 != null) {
                accessibilityEvent.setItemCount(r0.A0Q());
            }
        }
    }

    public void A1H(String str) {
        RecyclerView recyclerView = this.A07;
        if (recyclerView != null) {
            recyclerView.A0v(str);
        }
    }

    public boolean A1M(C38491rN r2) {
        if (this instanceof GridLayoutManager) {
            return r2 instanceof AnonymousClass28N;
        }
        if (r2 != null) {
            return true;
        }
        return false;
    }

    public C38251qy() {
        C65102vq r2 = new C65102vq(this, 0);
        this.A0D = r2;
        C65102vq r1 = new C65102vq(this, 1);
        this.A0E = r1;
        this.A08 = new C38291r3(r2);
        this.A09 = new C38291r3(r1);
    }

    public static int A00(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            return Math.min(size, Math.max(i2, i3));
        }
        if (mode != 1073741824) {
            return Math.max(i2, i3);
        }
        return size;
    }

    public static int A02(View view) {
        return ((C38491rN) view.getLayoutParams()).A00();
    }

    public static void A03(View view, int i, int i2, int i3, int i4) {
        C38491rN r2 = (C38491rN) view.getLayoutParams();
        Rect rect = r2.A03;
        view.layout(i + rect.left + r2.leftMargin, i2 + rect.top + r2.topMargin, (i3 - rect.right) - r2.rightMargin, (i4 - rect.bottom) - r2.bottomMargin);
    }

    public static void A04(View view, C38251qy r8, int i, boolean z) {
        C42011xT A022 = RecyclerView.A02(view);
        if (z || (A022.A00 & 8) != 0) {
            r8.A07.A0z.A02(A022);
        } else {
            r8.A07.A0z.A03(A022);
        }
        C38491rN r5 = (C38491rN) view.getLayoutParams();
        int i2 = A022.A00;
        boolean z2 = false;
        if ((i2 & 32) != 0) {
            z2 = true;
        }
        if (z2 || A022.A08 != null) {
            C37931qQ r0 = A022.A08;
            if (r0 != null) {
                r0.A0A(A022);
            } else {
                A022.A00 = i2 & -33;
            }
            r8.A05.A0B(view, view.getLayoutParams(), i, false);
        } else {
            ViewParent parent = view.getParent();
            RecyclerView recyclerView = r8.A07;
            C38151qm r02 = r8.A05;
            if (parent == recyclerView) {
                int A052 = r02.A05(view);
                if (i == -1) {
                    i = r8.A05.A03();
                }
                if (A052 == -1) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
                    sb.append(r8.A07.indexOfChild(view));
                    sb.append(r8.A07.A0R());
                    throw new IllegalStateException(sb.toString());
                } else if (A052 != i) {
                    C38251qy r2 = r8.A07.A0D;
                    View A0P = r2.A0P(A052);
                    if (A0P != null) {
                        r2.A0P(A052);
                        r2.A05.A08(A052);
                        r2.A0W(A0P, i);
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Cannot move a child from non-existing index:");
                        sb2.append(A052);
                        sb2.append(r2.A07.toString());
                        throw new IllegalArgumentException(sb2.toString());
                    }
                }
            } else {
                r02.A0A(view, i, false);
                r5.A01 = true;
                C25272CcK ccK = r8.A06;
                if (ccK != null && ccK.A05 && RecyclerView.A01(view) == ccK.A00) {
                    ccK.A01 = view;
                }
            }
        }
        if (r5.A02) {
            A022.A0H.invalidate();
            r5.A02 = false;
        }
    }

    public static boolean A05(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 <= 0 || i == i3) {
            if (mode != Integer.MIN_VALUE) {
                if (mode == 0) {
                    return true;
                }
                if (mode == 1073741824 && size == i) {
                    return true;
                }
                return false;
            } else if (size >= i) {
                return true;
            }
        }
        return false;
    }

    public void A0R(int i, int i2) {
        this.A03 = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        this.A04 = mode;
        if (mode == 0 && !RecyclerView.A1B) {
            this.A03 = 0;
        }
        this.A00 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.A01 = mode2;
        if (mode2 == 0 && !RecyclerView.A1B) {
            this.A00 = 0;
        }
    }

    public void A0S(int i, int i2) {
        int A0J = A0J();
        if (A0J == 0) {
            this.A07.A0j(i, i2);
            return;
        }
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MIN_VALUE;
        int i5 = Integer.MAX_VALUE;
        int i6 = Integer.MAX_VALUE;
        for (int i7 = 0; i7 < A0J; i7++) {
            View A0P = A0P(i7);
            Rect rect = this.A07.A0r;
            RecyclerView.A09(A0P, rect);
            int i8 = rect.left;
            if (i8 < i5) {
                i5 = i8;
            }
            int i9 = rect.right;
            if (i9 > i3) {
                i3 = i9;
            }
            int i10 = rect.top;
            if (i10 < i6) {
                i6 = i10;
            }
            int i11 = rect.bottom;
            if (i11 > i4) {
                i4 = i11;
            }
        }
        this.A07.A0r.set(i5, i6, i3, i4);
        A18(this.A07.A0r, i, i2);
    }

    public void A0T(Rect rect, View view) {
        Matrix matrix;
        Rect rect2 = ((C38491rN) view.getLayoutParams()).A03;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (!(this.A07 == null || (matrix = view.getMatrix()) == null || matrix.isIdentity())) {
            RectF rectF = this.A07.A0t;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor((double) rectF.left), (int) Math.floor((double) rectF.top), (int) Math.ceil((double) rectF.right), (int) Math.ceil((double) rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public void A0W(View view, int i) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        C42011xT A022 = RecyclerView.A02(view);
        boolean z = false;
        if ((A022.A00 & 8) != 0) {
            z = true;
        }
        C37941qR r0 = this.A07.A0z;
        if (z) {
            r0.A02(A022);
        } else {
            r0.A03(A022);
        }
        C38151qm r2 = this.A05;
        boolean z2 = false;
        if ((A022.A00 & 8) != 0) {
            z2 = true;
        }
        r2.A0B(view, layoutParams, i, z2);
    }

    public void A0Y(View view, C26228CvK cvK) {
        C42011xT A022 = RecyclerView.A02(view);
        if (A022 != null && (A022.A00 & 8) == 0) {
            C38151qm r0 = this.A05;
            if (!r0.A02.contains(A022.A0H)) {
                RecyclerView recyclerView = this.A07;
                A1A(view, cvK, recyclerView.A0v, recyclerView.A0w);
            }
        }
    }

    public void A0a(C37931qQ r5) {
        int A0J = A0J();
        while (true) {
            A0J--;
            if (A0J >= 0) {
                View A0P = A0P(A0J);
                C42011xT A022 = RecyclerView.A02(A0P);
                if (!A022.A0A()) {
                    if ((A022.A00 & 4) == 0 || (A022.A00 & 8) != 0 || this.A07.A0B.A00) {
                        A0P(A0J);
                        this.A05.A08(A0J);
                        r5.A08(A0P);
                        this.A07.A0z.A03(A022);
                    } else {
                        if (A0P(A0J) != null) {
                            this.A05.A09(A0J);
                        }
                        r5.A09(A022);
                    }
                }
            } else {
                return;
            }
        }
    }

    public void A0b(C37931qQ r3) {
        int A0J = A0J();
        while (true) {
            A0J--;
            if (A0J < 0) {
                return;
            }
            if (!RecyclerView.A02(A0P(A0J)).A0A()) {
                A0d(r3, A0J);
            }
        }
    }

    public void A0d(C37931qQ r3, int i) {
        View A0P = A0P(i);
        if (A0P(i) != null) {
            this.A05.A09(i);
        }
        r3.A07(A0P);
    }

    public boolean A0h(View view, C38491rN r4, int i, int i2) {
        if (view.isLayoutRequested() || !A05(view.getWidth(), i, r4.width) || !A05(view.getHeight(), i2, r4.height)) {
            return true;
        }
        return false;
    }

    public View A0j(int i) {
        int A0J = A0J();
        for (int i2 = 0; i2 < A0J; i2++) {
            View A0P = A0P(i2);
            C42011xT A022 = RecyclerView.A02(A0P);
            if (A022 != null) {
                int i3 = A022.A05;
                if (i3 == -1) {
                    i3 = A022.A04;
                }
                if (i3 == i && !A022.A0A() && (this.A07.A0w.A08 || (A022.A00 & 8) == 0)) {
                    return A0P;
                }
            }
        }
        return null;
    }

    public void A18(Rect rect, int i, int i2) {
        int width = rect.width() + A0M() + A0N();
        int height = rect.height() + A0O() + A0L();
        this.A07.setMeasuredDimension(A00(i, width, this.A07.getMinimumWidth()), A00(i2, height, this.A07.getMinimumHeight()));
    }

    public void A1A(View view, C26228CvK cvK, C37931qQ r10, C38021qZ r11) {
        int i;
        int i2;
        if (A1J()) {
            i = A02(view);
        } else {
            i = 0;
        }
        if (A1I()) {
            i2 = A02(view);
        } else {
            i2 = 0;
        }
        cvK.A0a(C25476CgV.A00(i, 1, i2, 1, false, false));
    }

    public void A1G(RecyclerView recyclerView, int i) {
        BMI bmi = new BMI(recyclerView.getContext());
        bmi.A00 = i;
        A0e(bmi);
    }

    public boolean A1K() {
        return true;
    }
}
