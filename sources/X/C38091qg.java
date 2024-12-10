package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: X.1qg  reason: invalid class name and case insensitive filesystem */
public class C38091qg implements C38081qf {
    public final /* synthetic */ RecyclerView A00;

    public C38091qg(RecyclerView recyclerView) {
        this.A00 = recyclerView;
    }

    public void A00(C38481rM r4) {
        int i = r4.A00;
        if (i == 1) {
            this.A00.A0D.A14(r4.A02, r4.A01);
        } else if (i == 2) {
            this.A00.A0D.A16(r4.A02, r4.A01);
        } else if (i == 4) {
            this.A00.A0D.A17(r4.A02, r4.A01);
        } else if (i == 8) {
            this.A00.A0D.A15(r4.A02, r4.A01);
        }
    }

    public void Bip(Object obj, int i, int i2) {
        int i3;
        int i4;
        RecyclerView recyclerView = this.A00;
        C38151qm r3 = recyclerView.A08;
        int A04 = r3.A04();
        int i5 = i + i2;
        for (int i6 = 0; i6 < A04; i6++) {
            View A07 = r3.A07(i6);
            C42011xT A02 = RecyclerView.A02(A07);
            if (A02 != null && !A02.A0A() && (i4 = A02.A04) >= i && i4 < i5) {
                int i7 = 2 | A02.A00;
                A02.A00 = i7;
                if (obj == null) {
                    A02.A00 = 1024 | i7;
                } else if ((1024 & i7) == 0) {
                    if (A02.A0D == null) {
                        ArrayList arrayList = new ArrayList();
                        A02.A0D = arrayList;
                        A02.A0E = Collections.unmodifiableList(arrayList);
                    }
                    A02.A0D.add(obj);
                }
                ((C38491rN) A07.getLayoutParams()).A01 = true;
            }
        }
        C37931qQ r5 = recyclerView.A0v;
        ArrayList arrayList2 = r5.A06;
        int size = arrayList2.size();
        while (true) {
            size--;
            if (size >= 0) {
                C42011xT r2 = (C42011xT) arrayList2.get(size);
                if (r2 != null && (i3 = r2.A04) >= i && i3 < i5) {
                    r2.A00 = 2 | r2.A00;
                    r5.A06(size);
                }
            } else {
                recyclerView.A0U = true;
                return;
            }
        }
    }

    public void Bke(int i, int i2) {
        RecyclerView recyclerView = this.A00;
        C38151qm r6 = recyclerView.A08;
        int A04 = r6.A04();
        for (int i3 = 0; i3 < A04; i3++) {
            C42011xT A02 = RecyclerView.A02(r6.A07(i3));
            if (A02 != null && !A02.A0A() && A02.A04 >= i) {
                A02.A08(i2, false);
                recyclerView.A0w.A0C = true;
            }
        }
        ArrayList arrayList = recyclerView.A0v.A06;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            C42011xT r1 = (C42011xT) arrayList.get(i4);
            if (r1 != null && r1.A04 >= i) {
                r1.A08(i2, true);
            }
        }
        recyclerView.requestLayout();
        recyclerView.A0T = true;
    }

    public void Bkf(int i, int i2) {
        int i3;
        RecyclerView recyclerView = this.A00;
        C38151qm r10 = recyclerView.A08;
        int A04 = r10.A04();
        int i4 = i;
        int i5 = i2;
        int i6 = 1;
        if (i < i2) {
            i6 = -1;
            i5 = i;
            i4 = i2;
        }
        for (int i7 = 0; i7 < A04; i7++) {
            C42011xT A02 = RecyclerView.A02(r10.A07(i7));
            if (A02 != null && (i3 = A02.A04) >= i5 && i3 <= i4) {
                if (i3 == i) {
                    A02.A08(i2 - i, false);
                } else {
                    A02.A08(i6, false);
                }
                recyclerView.A0w.A0C = true;
            }
        }
        C37931qQ r0 = recyclerView.A0v;
        int i8 = 1;
        int i9 = i;
        int i10 = i2;
        if (i < i2) {
            i8 = -1;
            i10 = i;
            i9 = i2;
        }
        ArrayList arrayList = r0.A06;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            C42011xT r1 = (C42011xT) arrayList.get(i11);
            if (r1 != null && r1.A04 >= i10 && r1.A04 <= i9) {
                if (r1.A04 == i) {
                    r1.A08(i2 - i, false);
                } else {
                    r1.A08(i8, false);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.A0T = true;
    }
}
