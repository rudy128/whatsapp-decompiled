package X;

import android.content.Context;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* renamed from: X.6AS  reason: invalid class name */
public final class AnonymousClass6AS extends C136786uO {
    public RecyclerView A00;
    public C111955kh A01;
    public final C36361nl A02;
    public final C33251iW A03;
    public final AnonymousClass118 A04;
    public final C18000vb A05;
    public final AnonymousClass6AR A06;
    public final AnonymousClass00H A07;
    public final AnonymousClass1LU A08;

    public void A02(Context context, AnonymousClass02n r5, C140016zo r6) {
        NestedScrollView nestedScrollView;
        int i;
        C18070vi.A0d(r5, 2);
        super.A02(context, r5, r6);
        C134396qW r0 = r6.A03;
        if (r0 != null) {
            List list = r0.A00;
            if (!list.isEmpty()) {
                this.A06.A02(context, r5, r6);
                C111955kh r1 = this.A01;
                if (r1 != null) {
                    List list2 = r1.A00;
                    list2.clear();
                    list2.addAll(list);
                    r1.notifyDataSetChanged();
                }
                nestedScrollView = this.A01;
                if (nestedScrollView != null) {
                    i = 0;
                    nestedScrollView.setVisibility(i);
                }
                return;
            }
        }
        nestedScrollView = this.A01;
        if (nestedScrollView != null) {
            i = 8;
            nestedScrollView.setVisibility(i);
        }
    }

    public AnonymousClass6AS(C36361nl r1, C33251iW r2, AnonymousClass118 r3, C18000vb r4, AnonymousClass1LU r5, AnonymousClass6AR r6, AnonymousClass00H r7) {
        C18070vi.A0w(r3, r5, r2, r1, r4);
        C18070vi.A0l(r6, r7);
        this.A04 = r3;
        this.A08 = r5;
        this.A03 = r2;
        this.A02 = r1;
        this.A05 = r4;
        this.A06 = r6;
        this.A07 = r7;
    }

    public void A01() {
        super.A01();
        this.A00 = null;
        this.A06.A01();
    }
}
