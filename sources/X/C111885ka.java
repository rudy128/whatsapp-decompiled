package X;

import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.5ka  reason: invalid class name and case insensitive filesystem */
public final class C111885ka extends C113705na {
    public static final Integer A08 = AnonymousClass00R.A01;
    public C126516cr A00;
    public int A01;
    public C38331r7 A02;
    public RecyclerView A03;
    public final AnonymousClass89F A04;
    public final boolean A05;
    public final int A06;
    public final int A07;

    public C111885ka(Integer num, int i, int i2, boolean z) {
        Object obj;
        C18070vi.A0d(num, 1);
        this.A06 = i;
        this.A07 = i2;
        this.A05 = z;
        if (num.intValue() != 1) {
            obj = new Object();
        } else {
            obj = new Object();
        }
        this.A04 = (AnonymousClass89F) obj;
    }

    /* JADX WARNING: type inference failed for: r0v13, types: [java.lang.Object, X.7KL] */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0099, code lost:
        if (r7 == -1) goto L_0x0062;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View A05(X.C38251qy r18) {
        /*
            r17 = this;
            r0 = 0
            r12 = r18
            X.C18070vi.A0d(r12, r0)
            r11 = r17
            X.1r7 r10 = r11.A00(r12)
            int r0 = r12.A0K()
            int r9 = r0 + -1
            int r8 = r12.A0J()
            r16 = 0
            if (r8 == 0) goto L_0x0076
            r7 = 0
            r6 = -1
            r5 = 2147483647(0x7fffffff, float:NaN)
            r4 = 0
            r15 = -1
        L_0x0021:
            if (r4 >= r8) goto L_0x0077
            android.view.View r3 = r12.A0P(r4)
            java.lang.String r0 = "null cannot be cast to non-null type android.view.View"
            X.C18070vi.A0z(r3, r0)
            int r2 = X.C38251qy.A02(r3)
            X.89F r0 = r11.A04
            int r1 = r0.BaB(r3, r10)
            int r0 = r0.BNN(r10)
            int r1 = X.C108945cZ.A05(r1, r0)
            int r0 = r11.A01
            if (r0 == 0) goto L_0x0079
            if (r2 != 0) goto L_0x0079
            X.1r7 r14 = r11.A00(r12)
            X.7KM r0 = new X.7KM
            r0.<init>()
            X.C18070vi.A0d(r3, r7)
            int r13 = r14.A09(r3)
            int r0 = r14.A04()
            int r0 = X.C108945cZ.A05(r13, r0)
            if (r0 != 0) goto L_0x0079
            r16 = r3
        L_0x0060:
            r11.A01 = r7
        L_0x0062:
            X.6cr r0 = r11.A00
            if (r0 == 0) goto L_0x0076
            if (r7 == r6) goto L_0x0076
            X.6KR r1 = r0.A00
            java.util.List r0 = X.C42011xT.A0I
            int r0 = X.C140066zt.A00(r1)
            int r7 = r7 / r0
            com.google.android.material.tabs.TabLayout r0 = r1.A08
            X.C108985cd.A16(r0, r7)
        L_0x0076:
            return r16
        L_0x0077:
            r7 = r15
            goto L_0x0099
        L_0x0079:
            int r0 = r11.A01
            if (r0 == r9) goto L_0x009c
            if (r2 != r9) goto L_0x009c
            X.1r7 r14 = r11.A00(r12)
            X.7KL r0 = new X.7KL
            r0.<init>()
            int r13 = r0.BaB(r3, r14)
            int r0 = r14.A02()
            int r0 = X.C108945cZ.A05(r13, r0)
            if (r0 != 0) goto L_0x009c
            r16 = r3
            r7 = r2
        L_0x0099:
            if (r7 == r6) goto L_0x0062
            goto L_0x0060
        L_0x009c:
            int r0 = r11.A06
            int r0 = r2 % r0
            if (r0 != 0) goto L_0x00a8
            if (r1 >= r5) goto L_0x00a8
            r16 = r3
            r15 = r2
            r5 = r1
        L_0x00a8:
            int r4 = r4 + 1
            goto L_0x0021
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C111885ka.A05(X.1qy):android.view.View");
    }

    public final int[] A0B(View view, C38251qy r7, boolean z) {
        int i;
        C18070vi.A0d(r7, 0);
        C38331r7 A002 = A00(r7);
        AnonymousClass89F r0 = this.A04;
        int BaB = r0.BaB(view, A002) - r0.BNN(A002);
        if (z) {
            i = 0;
        } else {
            boolean z2 = this.A05;
            i = this.A07;
            if (z2) {
                i = -i;
            }
        }
        int[] A1W = C108945cZ.A1W();
        A1W[0] = BaB + i;
        A1W[1] = 0;
        return A1W;
    }

    private final C38331r7 A00(C38251qy r3) {
        C38331r7 r1 = this.A02;
        if (r1 != null) {
            return r1;
        }
        if (r3.A1I()) {
            AnonymousClass28F r12 = new AnonymousClass28F(r3, 0);
            this.A02 = r12;
            return r12;
        }
        throw AnonymousClass000.A0n("Only supports horizontal scroll");
    }

    public int A04(C38251qy r9, int i, int i2) {
        int A1O;
        C38261qz r2;
        PointF BFT;
        int A0K = r9.A0K();
        Integer valueOf = Integer.valueOf(A0K);
        if (A0K == 0) {
            valueOf = null;
        }
        int i3 = -1;
        if (valueOf != null) {
            int intValue = valueOf.intValue();
            boolean z = true;
            if (!r9.A1I() ? i2 <= 0 : i <= 0) {
                z = false;
            }
            if (r9.A0J() != 0 && (r9 instanceof LinearLayoutManager)) {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) r9;
                boolean z2 = this.A05;
                if (!z ? !z2 : z2) {
                    A1O = linearLayoutManager.A1Q();
                } else {
                    A1O = linearLayoutManager.A1O();
                }
                if (A1O != -1) {
                    if (r9 instanceof C38261qz) {
                        r2 = (C38261qz) r9;
                    } else {
                        r2 = null;
                    }
                    boolean z3 = false;
                    if (!(r2 == null || (BFT = r2.BFT(r9.A0K() - 1)) == null || (BFT.x >= 0.0f && BFT.y >= 0.0f))) {
                        z3 = true;
                    }
                    int i4 = this.A06;
                    int i5 = (A1O / i4) * i4;
                    i3 = i5 - i4;
                    if (i3 < 0) {
                        i3 = 0;
                    }
                    int i6 = i4 + i5;
                    Integer valueOf2 = Integer.valueOf(i6);
                    if (i6 < intValue && valueOf2 != null) {
                        i5 = i6;
                    }
                    if (!z3 ? z : !z) {
                        i3 = i5;
                    }
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("StatusGridSnapHelper/findTargetSnapPosition next pos is: ");
                    A10.append(i3);
                    A10.append("\n          reverseLayout: ");
                    A10.append(z3);
                    A10.append("\n          firstPosition: ");
                    A10.append(A1O);
                    A10.append("\n          forwardDirection: ");
                    A10.append(z);
                    A10.append("\n          itemCount ");
                    A10.append(intValue);
                    AnonymousClass1Y7.A01(AnonymousClass000.A0y("\n        ", A10));
                }
            }
        }
        return i3;
    }

    public void A08(RecyclerView recyclerView) {
        super.A08(recyclerView);
        this.A03 = recyclerView;
        this.A00 = null;
    }

    public int[] A0A(View view, C38251qy r3) {
        C18070vi.A0h(r3, view);
        return A0B(view, r3, AnonymousClass000.A1P(this.A01));
    }

    public C111885ka() {
        this(A08, 1, 0, false);
    }
}
