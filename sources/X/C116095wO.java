package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* renamed from: X.5wO  reason: invalid class name and case insensitive filesystem */
public class C116095wO extends C112285lE {
    public int A00 = 0;
    public int A01 = 0;
    public int A02 = 0;

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000d, code lost:
        if (r5 == 13) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C113615nN A0V(android.view.View r4, int r5) {
        /*
            r3 = this;
            r2 = 1
            if (r5 == 0) goto L_0x000f
            r0 = 3
            if (r5 == r0) goto L_0x000f
            r0 = 9
            if (r5 == r0) goto L_0x000f
            r0 = 13
            r1 = 0
            if (r5 != r0) goto L_0x0010
        L_0x000f:
            r1 = 1
        L_0x0010:
            java.lang.String r0 = "Unknown view holder type in HScroll"
            X.C17960vV.A0F(r1, r0)
            X.5nN r0 = super.A0W(r4, r5, r2)
            r0.A07 = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C116095wO.A0V(android.view.View, int):X.5nN");
    }

    public static void A00(View view, C116095wO r7) {
        RecyclerView recyclerView;
        int i;
        if (r7.A02 == 0 && (recyclerView = r7.A01) != null) {
            recyclerView.getContext();
            int size = r7.A09.size();
            int i2 = r7.A01;
            int i3 = r7.A00;
            if (size == 3) {
                i = (i2 + i3) / 3;
            } else {
                i = (int) (((double) i2) / (3.0d + 0.25d));
            }
            r7.A02 = i;
        }
        if (r7.A01 != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            int i4 = r7.A02;
            if (i4 != layoutParams.height) {
                layoutParams.height = i4;
                layoutParams.width = i4 - r7.A00;
                view.setLayoutParams(layoutParams);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000c, code lost:
        if (r3 == 13) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View A0U(int r3, android.view.ViewGroup r4) {
        /*
            r2 = this;
            if (r3 == 0) goto L_0x000e
            r0 = 3
            if (r3 == r0) goto L_0x000e
            r0 = 9
            if (r3 == r0) goto L_0x000e
            r0 = 13
            r1 = 0
            if (r3 != r0) goto L_0x000f
        L_0x000e:
            r1 = 1
        L_0x000f:
            java.lang.String r0 = "Unknown view holder type in HScroll"
            X.C17960vV.A0F(r1, r0)
            android.view.View r0 = super.A0U(r3, r4)
            A00(r0, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C116095wO.A0U(int, android.view.ViewGroup):android.view.View");
    }

    public C116095wO(C124706Zj r2, C124716Zk r3, C124726Zl r4, C124736Zm r5, C124746Zn r6, C124756Zo r7, C124766Zp r8, C124776Zq r9, C124786Zr r10, C143867Fc r11, C18030ve r12, AnonymousClass1DC r13, C18140vp r14) {
        super(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14);
        this.A00 = 2132084305;
    }

    public void A0X(C113615nN r2, int i) {
        super.Bmc(r2, i);
        A00(r2.A0H, this);
        r2.A0E(3);
    }

    public void A0Y(C113615nN r2, List list, int i) {
        super.A0P(r2, list, i);
        A00(r2.A0H, this);
        r2.A0E(3);
    }

    public void A0a(List list) {
        RecyclerView recyclerView;
        int i;
        if (!list.isEmpty() && (recyclerView = this.A01) != null) {
            int i2 = this.A02;
            int width = recyclerView.getWidth();
            if (width != 0) {
                this.A01 = width;
            }
            this.A01.getContext();
            int size = list.size();
            int i3 = this.A01;
            int i4 = this.A00;
            if (size == 3) {
                i = (i3 + i4) / 3;
            } else {
                i = (int) (((double) i3) / (3.0d + 0.25d));
            }
            this.A02 = i;
            if (!(i2 == 0 || i == 0 || i2 == i)) {
                notifyDataSetChanged();
            }
        }
        super.A0a(list);
    }
}
