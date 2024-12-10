package X;

import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.whatsapp.util.Log;
import com.whatsapp.wds.components.list.listitem.WDSListItem;
import java.util.List;

/* renamed from: X.DmL  reason: case insensitive filesystem */
public final class C27824DmL extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ View $itemView;
    public final /* synthetic */ Bq2 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27824DmL(View view, Bq2 bq2) {
        super(0);
        this.this$0 = bq2;
        this.$itemView = view;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        TextView textView;
        Bq2 bq2 = this.this$0;
        List list = C42011xT.A0I;
        bq2.A06 = true;
        boolean z = bq2.A0T;
        View view = this.$itemView;
        if (z) {
            C18070vi.A0z(view, "null cannot be cast to non-null type com.whatsapp.wds.components.list.listitem.WDSListItem");
            WDSListItem wDSListItem = (WDSListItem) view;
            if (wDSListItem.A0B != null) {
                View findViewById = wDSListItem.findViewById(2131435452);
                if (findViewById instanceof ViewStub) {
                    View inflate = ((ViewStub) findViewById).inflate();
                    C18070vi.A0z(inflate, "null cannot be cast to non-null type com.whatsapp.WaTextView");
                    TextView textView2 = (TextView) inflate;
                    C25704CkZ ckZ = wDSListItem.A0B;
                    textView = textView2;
                    if (ckZ != null) {
                        C24363Bzy bzy = ckZ.A0i;
                        int A00 = AnonymousClass1YL.A00(wDSListItem.getContext(), bzy.subTextColorAttrb, 2131103225);
                        C29261bv.A08(textView2, bzy.styleRes);
                        AnonymousClass3MX.A1C(wDSListItem.getContext(), textView2, A00);
                        textView = textView2;
                    }
                } else {
                    Log.w("inflateCallSilencedLabelWidget : can't find the ViewStub in the hierarchy, maybe the function is called multiple times, call it once to improve the performances");
                    textView = findViewById;
                }
            } else {
                textView = null;
            }
            C18070vi.A0z(textView, "null cannot be cast to non-null type com.whatsapp.WaTextView");
            return textView;
        }
        View A06 = AnonymousClass1HF.A06(view, 2131435452);
        C18070vi.A0b(A06);
        return A06;
    }
}
