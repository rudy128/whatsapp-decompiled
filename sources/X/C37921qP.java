package X;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* renamed from: X.1qP  reason: invalid class name and case insensitive filesystem */
public class C37921qP extends C37911qO {
    public final /* synthetic */ RecyclerView A00;

    public C37921qP(RecyclerView recyclerView) {
        this.A00 = recyclerView;
    }

    public void A01() {
        RecyclerView recyclerView = this.A00;
        recyclerView.A0v((String) null);
        recyclerView.A0w.A0C = true;
        recyclerView.A0x(true);
        if (recyclerView.A07.A04.size() <= 0) {
            recyclerView.requestLayout();
        }
    }

    public void A03(int i, int i2) {
        RecyclerView recyclerView = this.A00;
        recyclerView.A0v((String) null);
        C38111qi r3 = recyclerView.A07;
        if (i2 >= 1) {
            ArrayList arrayList = r3.A04;
            arrayList.add(r3.Bkc((Object) null, 1, i, i2));
            r3.A00 |= 1;
            if (arrayList.size() == 1) {
                A07();
            }
        }
    }

    public void A04(int i, int i2) {
        RecyclerView recyclerView = this.A00;
        recyclerView.A0v((String) null);
        C38111qi r3 = recyclerView.A07;
        if (i2 >= 1) {
            ArrayList arrayList = r3.A04;
            arrayList.add(r3.Bkc((Object) null, 2, i, i2));
            r3.A00 |= 2;
            if (arrayList.size() == 1) {
                A07();
            }
        }
    }

    public void A05(int i, int i2, int i3) {
        RecyclerView recyclerView = this.A00;
        recyclerView.A0v((String) null);
        C38111qi r3 = recyclerView.A07;
        if (i == i2) {
            return;
        }
        if (i3 == 1) {
            ArrayList arrayList = r3.A04;
            arrayList.add(r3.Bkc((Object) null, 8, i, i2));
            r3.A00 |= 8;
            if (arrayList.size() == 1) {
                A07();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
    }

    public void A06(Object obj, int i, int i2) {
        RecyclerView recyclerView = this.A00;
        recyclerView.A0v((String) null);
        C38111qi r3 = recyclerView.A07;
        if (i2 >= 1) {
            ArrayList arrayList = r3.A04;
            arrayList.add(r3.Bkc(obj, 4, i, i2));
            r3.A00 |= 4;
            if (arrayList.size() == 1) {
                A07();
            }
        }
    }

    public void A07() {
        RecyclerView recyclerView = this.A00;
        if (!recyclerView.A0R || !recyclerView.A0S) {
            recyclerView.A0M = true;
            recyclerView.requestLayout();
            return;
        }
        recyclerView.postOnAnimation(recyclerView.A10);
    }
}
