package X;

import android.view.View;
import com.whatsapp.biz.catalog.view.variants.VariantsCarouselFragment;

public final class B0V extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ View $view;
    public final /* synthetic */ VariantsCarouselFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public B0V(View view, VariantsCarouselFragment variantsCarouselFragment) {
        super(1);
        this.this$0 = variantsCarouselFragment;
        this.$view = view;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Number number = (Number) obj;
        VariantsCarouselFragment variantsCarouselFragment = this.this$0;
        if (number != null) {
            View view = this.$view;
            C131466l9 r1 = variantsCarouselFragment.A00;
            if (r1 != null) {
                r1.A00(view, number.intValue());
            }
            C18070vi.A11("snackbar");
            throw null;
        }
        C131466l9 r0 = variantsCarouselFragment.A00;
        if (r0 != null) {
            C23520Bik bik = r0.A00;
            if (bik != null) {
                bik.A09(3);
            }
        }
        C18070vi.A11("snackbar");
        throw null;
        return C27621Wu.A00;
    }
}
