package X;

import android.view.View;
import com.whatsapp.biz.catalog.view.variants.TextVariantsBottomSheet;

/* renamed from: X.824  reason: invalid class name */
public final class AnonymousClass824 extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ View $view;
    public final /* synthetic */ TextVariantsBottomSheet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass824(View view, TextVariantsBottomSheet textVariantsBottomSheet) {
        super(1);
        this.this$0 = textVariantsBottomSheet;
        this.$view = view;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C23520Bik bik;
        boolean A1a = AnonymousClass3MX.A1a((Boolean) obj);
        C131466l9 r2 = this.this$0.A02;
        if (A1a) {
            if (r2 != null) {
                r2.A00(this.$view, 1);
            }
        } else if (!(r2 == null || (bik = r2.A00) == null)) {
            bik.A09(3);
        }
        return C27621Wu.A00;
    }
}
