package X;

import android.view.View;
import android.view.ViewStub;
import com.whatsapp.util.Log;
import com.whatsapp.wds.components.list.listitem.WDSListItem;
import java.util.List;

/* renamed from: X.DmM  reason: case insensitive filesystem */
public final class C27825DmM extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ View $itemView;
    public final /* synthetic */ Bq2 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27825DmM(View view, Bq2 bq2) {
        super(0);
        this.this$0 = bq2;
        this.$itemView = view;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        View view;
        Bq2 bq2 = this.this$0;
        List list = C42011xT.A0I;
        bq2.A07 = true;
        boolean z = bq2.A0T;
        View view2 = this.$itemView;
        if (z) {
            C18070vi.A0z(view2, "null cannot be cast to non-null type com.whatsapp.wds.components.list.listitem.WDSListItem");
            WDSListItem wDSListItem = (WDSListItem) view2;
            C25704CkZ ckZ = wDSListItem.A0B;
            if (ckZ != null) {
                view = wDSListItem.findViewById(2131436739);
                if (view instanceof ViewStub) {
                    view = ((ViewStub) view).inflate();
                    C18070vi.A0z(view, "null cannot be cast to non-null type com.whatsapp.WaImageView");
                    int i = ckZ.A0N;
                    if (i != 0) {
                        view.setBackground(BE7.A0F(wDSListItem, i));
                    }
                    String str = ckZ.A0t;
                    if (str != null && str.length() > 0) {
                        view.setContentDescription(str);
                    }
                } else {
                    Log.w("inflateCallVideoButtonWidget : can't find the ViewStub in the hierarchy, maybe the function is called multiple times, call it once to improve the performances");
                }
            } else {
                view = null;
            }
            C18070vi.A0z(view, "null cannot be cast to non-null type com.whatsapp.WaImageView");
            view.setOnTouchListener((C64732vF) this.this$0.A0G.getValue());
            Bq2 bq22 = this.this$0;
            if (bq22.A09 != null) {
                C89874dA.A00(view, bq22, 27);
            }
            return view;
        }
        View A06 = AnonymousClass1HF.A06(view2, 2131436739);
        C18070vi.A0b(A06);
        return A06;
    }
}
