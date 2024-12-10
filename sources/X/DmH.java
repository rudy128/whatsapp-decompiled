package X;

import android.view.View;
import android.view.ViewStub;
import com.whatsapp.util.Log;
import com.whatsapp.wds.components.list.listitem.WDSListItem;
import java.util.List;

public final class DmH extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ View $itemView;
    public final /* synthetic */ Bq2 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DmH(View view, Bq2 bq2) {
        super(0);
        this.this$0 = bq2;
        this.$itemView = view;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        Bq2 bq2 = this.this$0;
        List list = C42011xT.A0I;
        bq2.A02 = true;
        boolean z = bq2.A0T;
        View view = this.$itemView;
        if (z) {
            C18070vi.A0z(view, "null cannot be cast to non-null type com.whatsapp.wds.components.list.listitem.WDSListItem");
            WDSListItem wDSListItem = (WDSListItem) view;
            C25704CkZ ckZ = wDSListItem.A0B;
            View view2 = null;
            if (!(ckZ == null || ckZ.A0Q == 0)) {
                view2 = wDSListItem.findViewById(2131429433);
                if (view2 instanceof ViewStub) {
                    ViewStub viewStub = (ViewStub) view2;
                    viewStub.setLayoutResource(ckZ.A0Q);
                    view2 = viewStub.inflate();
                } else {
                    Log.w("inflateCallContactWidget : can't find the ViewStub in the hierarchy, maybe the function is called multiple times, call it once to improve the performances");
                }
            }
            C18070vi.A0z(view2, "null cannot be cast to non-null type com.whatsapp.components.button.ThumbnailButton");
            Bq2 bq22 = this.this$0;
            if (bq22.A09 != null) {
                AnonymousClass48l.A00(view2, bq22, 14);
                view2.setOnLongClickListener(new C26585D4z(this.this$0, 2));
            }
            return view2;
        }
        View A06 = AnonymousClass1HF.A06(view, 2131429433);
        C18070vi.A0b(A06);
        return A06;
    }
}
