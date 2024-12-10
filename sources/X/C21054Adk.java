package X;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.WaTextView;

/* renamed from: X.Adk  reason: case insensitive filesystem */
public final /* synthetic */ class C21054Adk implements C28538E6m {
    public final /* synthetic */ RecyclerView A00;
    public final /* synthetic */ WaTextView A01;
    public final /* synthetic */ C161748Hp A02;

    public final void CQX() {
        String A0U;
        RecyclerView recyclerView = this.A00;
        C161748Hp r2 = this.A02;
        WaTextView waTextView = this.A01;
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
        if (linearLayoutManager != null && (A0U = r2.A0U(linearLayoutManager.A1O())) != null) {
            waTextView.setText(A0U);
        }
    }

    public /* synthetic */ C21054Adk(RecyclerView recyclerView, WaTextView waTextView, C161748Hp r3) {
        this.A00 = recyclerView;
        this.A02 = r3;
        this.A01 = waTextView;
    }
}
