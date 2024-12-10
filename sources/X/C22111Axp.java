package X;

import com.google.android.material.textfield.TextInputLayout;
import com.whatsapp.biz.cart.view.fragment.PromotionApplicationFragment;

/* renamed from: X.Axp  reason: case insensitive filesystem */
public final class C22111Axp extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ PromotionApplicationFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22111Axp(PromotionApplicationFragment promotionApplicationFragment) {
        super(1);
        this.this$0 = promotionApplicationFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        TextInputLayout textInputLayout;
        AnonymousClass9M0 r3 = (AnonymousClass9M0) obj;
        ((AnonymousClass1FU) C72453Mb.A0Z(this.this$0)).CEx();
        if (r3 instanceof C167988i6) {
            this.this$0.A28();
        } else if (r3 instanceof C167978i5) {
            PromotionApplicationFragment promotionApplicationFragment = this.this$0;
            AnonymousClass11C r1 = promotionApplicationFragment.A02;
            if (!(r1 == null || (textInputLayout = promotionApplicationFragment.A00) == null)) {
                AnonymousClass4a5.A02(textInputLayout, r1);
            }
            PromotionApplicationFragment.A00((C167978i5) r3, this.this$0);
        }
        return C27621Wu.A00;
    }
}
