package X;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.businessdirectory.view.fragment.BusinessDirectoryContextualSearchFragment;

/* renamed from: X.8I1  reason: invalid class name */
public class AnonymousClass8I1 extends C37911qO {
    public final /* synthetic */ RecyclerView A00;
    public final /* synthetic */ BusinessDirectoryContextualSearchFragment A01;

    public AnonymousClass8I1(RecyclerView recyclerView, BusinessDirectoryContextualSearchFragment businessDirectoryContextualSearchFragment) {
        this.A01 = businessDirectoryContextualSearchFragment;
        this.A00 = recyclerView;
    }

    public void A03(int i, int i2) {
        C38251qy layoutManager;
        if (i == 0 && (layoutManager = this.A00.getLayoutManager()) != null) {
            ((LinearLayoutManager) layoutManager).A1a(0, 0);
        }
    }
}
