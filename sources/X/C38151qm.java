package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1qm  reason: invalid class name and case insensitive filesystem */
public class C38151qm {
    public final C38161qn A00 = new C38161qn();
    public final C38131qk A01;
    public final List A02 = new ArrayList();

    private int A00(int i) {
        if (i >= 0) {
            int childCount = ((C38141ql) this.A01).A00.getChildCount();
            int i2 = i;
            while (i2 < childCount) {
                C38161qn r1 = this.A00;
                int A012 = i - (i2 - r1.A01(i2));
                if (A012 != 0) {
                    i2 += A012;
                } else {
                    while (r1.A06(i2)) {
                        i2++;
                    }
                    return i2;
                }
            }
        }
        return -1;
    }

    public static void A01(View view, C38151qm r3) {
        r3.A02.add(view);
        C38141ql r0 = (C38141ql) r3.A01;
        C42011xT A022 = RecyclerView.A02(view);
        if (A022 != null) {
            RecyclerView recyclerView = r0.A00;
            int i = A022.A03;
            if (i == -1) {
                i = A022.A0H.getImportantForAccessibility();
            }
            A022.A06 = i;
            if (recyclerView.A01 > 0) {
                A022.A03 = 4;
                recyclerView.A13.add(A022);
                return;
            }
            A022.A0H.setImportantForAccessibility(4);
        }
    }

    public static void A02(View view, C38151qm r2) {
        if (r2.A02.remove(view)) {
            r2.A01.Bwc(view);
        }
    }

    public int A03() {
        return ((C38141ql) this.A01).A00.getChildCount() - this.A02.size();
    }

    public int A04() {
        return ((C38141ql) this.A01).A00.getChildCount();
    }

    public int A05(View view) {
        int indexOfChild = ((C38141ql) this.A01).A00.indexOfChild(view);
        if (indexOfChild != -1) {
            C38161qn r1 = this.A00;
            if (!r1.A06(indexOfChild)) {
                return indexOfChild - r1.A01(indexOfChild);
            }
        }
        return -1;
    }

    public View A07(int i) {
        return ((C38141ql) this.A01).A00.getChildAt(i);
    }

    public void A0A(View view, int i, boolean z) {
        int A002;
        if (i < 0) {
            A002 = ((C38141ql) this.A01).A00.getChildCount();
        } else {
            A002 = A00(i);
        }
        this.A00.A05(A002, z);
        if (z) {
            A01(view, this);
        }
        RecyclerView recyclerView = ((C38141ql) this.A01).A00;
        recyclerView.addView(view, A002);
        C42011xT A022 = RecyclerView.A02(view);
        C38391rD r0 = recyclerView.A0B;
        if (!(r0 == null || A022 == null)) {
            r0.A0N(A022);
        }
        List list = recyclerView.A0K;
        if (list != null) {
            int size = list.size();
            while (true) {
                size--;
                if (size >= 0) {
                    ((AnonymousClass3LW) recyclerView.A0K.get(size)).Boc(view);
                } else {
                    return;
                }
            }
        }
    }

    public void A0B(View view, ViewGroup.LayoutParams layoutParams, int i, boolean z) {
        int A002;
        if (i < 0) {
            A002 = ((C38141ql) this.A01).A00.getChildCount();
        } else {
            A002 = A00(i);
        }
        this.A00.A05(A002, z);
        if (z) {
            A01(view, this);
        }
        C38141ql r3 = (C38141ql) this.A01;
        C42011xT A022 = RecyclerView.A02(view);
        if (A022 != null) {
            int i2 = A022.A00;
            if ((i2 & 256) != 0 || A022.A0A()) {
                A022.A00 = i2 & -257;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Called attach on a child which is not detached: ");
                sb.append(A022);
                sb.append(r3.A00.A0R());
                throw new IllegalArgumentException(sb.toString());
            }
        }
        r3.A00.attachViewToParent(view, A002, layoutParams);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.A00.toString());
        sb.append(", hidden list:");
        sb.append(this.A02.size());
        return sb.toString();
    }

    public C38151qm(C38131qk r2) {
        this.A01 = r2;
    }

    public View A06(int i) {
        return ((C38141ql) this.A01).A00.getChildAt(A00(i));
    }

    public void A08(int i) {
        C42011xT A022;
        int A002 = A00(i);
        this.A00.A07(A002);
        RecyclerView recyclerView = ((C38141ql) this.A01).A00;
        View childAt = recyclerView.getChildAt(A002);
        if (!(childAt == null || (A022 = RecyclerView.A02(childAt)) == null)) {
            int i2 = A022.A00;
            if ((i2 & 256) == 0 || A022.A0A()) {
                A022.A00 = 256 | i2;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("called detach on an already detached child ");
                sb.append(A022);
                sb.append(recyclerView.A0R());
                throw new IllegalArgumentException(sb.toString());
            }
        }
        recyclerView.detachViewFromParent(A002);
    }

    public void A09(int i) {
        int A002 = A00(i);
        RecyclerView recyclerView = ((C38141ql) this.A01).A00;
        View childAt = recyclerView.getChildAt(A002);
        if (childAt != null) {
            if (this.A00.A07(A002)) {
                A02(childAt, this);
            }
            View childAt2 = recyclerView.getChildAt(A002);
            if (childAt2 != null) {
                recyclerView.A0p(childAt2);
                childAt2.clearAnimation();
            }
            recyclerView.removeViewAt(A002);
        }
    }
}
