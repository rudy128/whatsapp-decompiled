package X;

import android.os.Bundle;
import com.whatsapp.biz.catalog.view.variants.v2.TextVariantsBottomSheetV2;

/* renamed from: X.7hG  reason: invalid class name and case insensitive filesystem */
public final class C148327hG extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ TextVariantsBottomSheetV2 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C148327hG(TextVariantsBottomSheetV2 textVariantsBottomSheetV2) {
        super(0);
        this.this$0 = textVariantsBottomSheetV2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        int i;
        Bundle bundle = this.this$0.A06;
        if (bundle != null) {
            i = bundle.getInt("VARIANTS_LIST_LOCATION_ARG");
        } else {
            i = 0;
        }
        return Integer.valueOf(i);
    }
}
