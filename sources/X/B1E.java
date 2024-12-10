package X;

import com.whatsapp.biz.catalog.view.AvailabilityStateImageView;
import java.util.List;

public final class B1E extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C168178iR $displayItem;
    public final /* synthetic */ boolean $isAvailable;
    public final /* synthetic */ C161998Io this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public B1E(C168178iR r2, C161998Io r3, boolean z) {
        super(1);
        this.this$0 = r3;
        this.$isAvailable = z;
        this.$displayItem = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AvailabilityStateImageView availabilityStateImageView = (AvailabilityStateImageView) obj;
        C18070vi.A0d(availabilityStateImageView, 0);
        C161998Io r1 = this.this$0;
        List list = C42011xT.A0I;
        C183889Zz r6 = new C183889Zz(new C182919Wf(897459302), r1.A02);
        availabilityStateImageView.setAvailable(this.$isAvailable);
        C161998Io r12 = this.this$0;
        r12.A00.A03(availabilityStateImageView, this.$displayItem.A00, (B7F) null, r6, (B7G) null, r12.A01, 2);
        return C27621Wu.A00;
    }
}
