package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.1ql  reason: invalid class name and case insensitive filesystem */
public class C38141ql implements C38131qk {
    public final /* synthetic */ RecyclerView A00;

    public C38141ql(RecyclerView recyclerView) {
        this.A00 = recyclerView;
    }

    public void Bwc(View view) {
        C42011xT A02 = RecyclerView.A02(view);
        if (A02 != null) {
            RecyclerView recyclerView = this.A00;
            int i = A02.A06;
            if (recyclerView.A01 > 0) {
                A02.A03 = i;
                recyclerView.A13.add(A02);
            } else {
                A02.A0H.setImportantForAccessibility(i);
            }
            A02.A06 = 0;
        }
    }
}
