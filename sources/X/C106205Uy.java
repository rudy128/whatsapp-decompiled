package X;

import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.ml.v2.storageusage.MLModelStorageUsageActivity;
import java.util.List;

/* renamed from: X.5Uy  reason: invalid class name and case insensitive filesystem */
public final class C106205Uy extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ RecyclerView $recyclerView;
    public final /* synthetic */ MLModelStorageUsageActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C106205Uy(RecyclerView recyclerView, MLModelStorageUsageActivity mLModelStorageUsageActivity) {
        super(1);
        this.this$0 = mLModelStorageUsageActivity;
        this.$recyclerView = recyclerView;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        List list = (List) obj;
        boolean isEmpty = list.isEmpty();
        C18100vl r0 = this.this$0.A02;
        if (isEmpty) {
            C72453Mb.A1U(r0, 0);
            this.$recyclerView.setVisibility(8);
        } else {
            C72453Mb.A1U(r0, 8);
            this.$recyclerView.setVisibility(0);
            ((C73653Wu) this.this$0.A01.getValue()).A01 = list;
            ((C38391rD) this.this$0.A01.getValue()).notifyDataSetChanged();
        }
        return C27621Wu.A00;
    }
}
