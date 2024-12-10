package X;

import android.view.View;
import android.view.ViewStub;
import com.whatsapp.util.Log;
import com.whatsapp.wds.components.list.listitem.WDSListItem;
import java.util.List;

public final class DmK extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ View $itemView;
    public final /* synthetic */ Bq2 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DmK(View view, Bq2 bq2) {
        super(0);
        this.this$0 = bq2;
        this.$itemView = view;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        View view;
        Bq2 bq2 = this.this$0;
        List list = C42011xT.A0I;
        bq2.A05 = true;
        boolean z = bq2.A0T;
        View view2 = this.$itemView;
        if (z) {
            C18070vi.A0z(view2, "null cannot be cast to non-null type com.whatsapp.wds.components.list.listitem.WDSListItem");
            WDSListItem wDSListItem = (WDSListItem) view2;
            if (wDSListItem.A0B != null) {
                view = wDSListItem.findViewById(2131435451);
                if (view instanceof ViewStub) {
                    view = ((ViewStub) view).inflate();
                } else {
                    Log.w("inflateCallSilencedIconWidget : can't find the ViewStub in the hierarchy, maybe the function is called multiple times, call it once to improve the performances");
                }
            } else {
                view = null;
            }
            C18070vi.A0z(view, "null cannot be cast to non-null type com.whatsapp.WaImageView");
            return view;
        }
        View A06 = AnonymousClass1HF.A06(view2, 2131435451);
        C18070vi.A0b(A06);
        return A06;
    }
}
