package X;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.tabs.TabLayout;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5lt  reason: invalid class name and case insensitive filesystem */
public final class C112695lt extends C39711tW {
    public int A00;
    public final /* synthetic */ AnonymousClass6KR A01;

    public void A04(RecyclerView recyclerView, int i, int i2) {
        View A05;
        int A02;
        C18070vi.A0d(recyclerView, 0);
        AnonymousClass6KR r2 = this.A01;
        List list = C42011xT.A0I;
        if (AnonymousClass3MW.A1Z((C18000vb) r2.A0F.get()) && i == 0 && this.A00 == 0) {
            TabLayout tabLayout = r2.A08;
            ArrayList arrayList = tabLayout.A0h;
            int size = arrayList.size();
            int i3 = 0;
            while (true) {
                if (i3 < size) {
                    C136836uU A08 = tabLayout.A08(i3);
                    if (A08 != null && A08.A03()) {
                        break;
                    }
                    i3++;
                } else {
                    i3 = -1;
                    break;
                }
            }
            r2.A00 = i3;
            if (!(i3 == 0 || i3 == AnonymousClass000.A0Q(arrayList))) {
                recyclerView.setVisibility(4);
                recyclerView.getViewTreeObserver().addOnDrawListener(r2.A06);
            }
        }
        BM9 bm9 = (BM9) r2.A0J.getValue();
        C38251qy layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null && (A05 = bm9.A05(layoutManager)) != null && -1 != (A02 = C38251qy.A02(A05))) {
            C108985cd.A16(r2.A08, A02 / C140066zt.A00(r2));
        }
    }

    public C112695lt(AnonymousClass6KR r1) {
        this.A01 = r1;
    }

    public void A03(RecyclerView recyclerView, int i) {
        C17900vP.A0j("StatusGridOptimizedViewHolder/onScrollStateChanged: ", C18070vi.A0K(recyclerView), i);
        if (i == 0) {
            AnonymousClass6KR r2 = this.A01;
            List list = C42011xT.A0I;
            C17880vN.A0V(r2.A0D).notifyAllObservers(new AnonymousClass7KP(AnonymousClass000.A1P(((LinearLayoutManager) r2.A0H.getValue()).A1N()), 3));
        }
        this.A00 = i;
    }
}
