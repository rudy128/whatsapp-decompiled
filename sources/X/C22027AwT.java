package X;

import android.view.View;
import com.whatsapp.biz.catalog.view.widgets.QuantitySelector;

/* renamed from: X.AwT  reason: case insensitive filesystem */
public final class C22027AwT extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ View $itemView;
    public final /* synthetic */ C22369B4x $quantityPickerListener;
    public final /* synthetic */ C168658jQ this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22027AwT(View view, C168658jQ r3, C22369B4x b4x) {
        super(0);
        this.$itemView = view;
        this.this$0 = r3;
        this.$quantityPickerListener = b4x;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        View findViewById = this.$itemView.findViewById(2131434117);
        C168658jQ r3 = this.this$0;
        C22369B4x b4x = this.$quantityPickerListener;
        QuantitySelector quantitySelector = (QuantitySelector) findViewById;
        quantitySelector.setCollapsible(true);
        quantitySelector.setVisibility(0);
        quantitySelector.A04 = new AO0(b4x, r3, 1);
        quantitySelector.A03 = new C20513ANy(r3, b4x, 1);
        return quantitySelector;
    }
}
