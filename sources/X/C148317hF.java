package X;

import android.os.Bundle;
import com.whatsapp.biz.catalog.view.variants.v2.TextVariantsBottomSheetV2;

/* renamed from: X.7hF  reason: invalid class name and case insensitive filesystem */
public final class C148317hF extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ TextVariantsBottomSheetV2 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C148317hF(TextVariantsBottomSheetV2 textVariantsBottomSheetV2) {
        super(0);
        this.this$0 = textVariantsBottomSheetV2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        int i;
        Bundle bundle = this.this$0.A06;
        if (bundle != null) {
            i = bundle.getInt("START_WITH_SELECTION_ARG");
        } else {
            i = 0;
        }
        return Integer.valueOf(i);
    }
}
