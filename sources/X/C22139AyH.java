package X;

import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.businessdirectory.view.activity.BusinessDirectorySERPMapViewActivity;
import java.util.List;

/* renamed from: X.AyH  reason: case insensitive filesystem */
public final class C22139AyH extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ BusinessDirectorySERPMapViewActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22139AyH(BusinessDirectorySERPMapViewActivity businessDirectorySERPMapViewActivity) {
        super(1);
        this.this$0 = businessDirectorySERPMapViewActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        List list = (List) obj;
        RecyclerView recyclerView = this.this$0.A02;
        if (recyclerView != null) {
            if (recyclerView.getVisibility() != 0) {
                RecyclerView recyclerView2 = this.this$0.A02;
                if (recyclerView2 != null) {
                    recyclerView2.setVisibility(4);
                }
            }
            C173768vh r0 = this.this$0.A06;
            if (r0 != null) {
                r0.A0W(list);
                BusinessDirectorySERPMapViewActivity businessDirectorySERPMapViewActivity = this.this$0;
                RecyclerView recyclerView3 = businessDirectorySERPMapViewActivity.A02;
                if (recyclerView3 != null) {
                    recyclerView3.post(new C21451AkI(businessDirectorySERPMapViewActivity, list, 43));
                    return C27621Wu.A00;
                }
            } else {
                C18070vi.A11("horizontalBusinessListAdapter");
                throw null;
            }
        }
        C18070vi.A11("horizontalBusinessListView");
        throw null;
    }
}
