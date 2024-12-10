package X;

import com.whatsapp.biz.catalog.view.AvailabilityStateTextView;

/* renamed from: X.825  reason: invalid class name */
public final class AnonymousClass825 extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C168168iQ $displayItem;
    public final /* synthetic */ boolean $isAvailable;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass825(C168168iQ r2, boolean z) {
        super(1);
        this.$displayItem = r2;
        this.$isAvailable = z;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AvailabilityStateTextView availabilityStateTextView = (AvailabilityStateTextView) obj;
        C18070vi.A0d(availabilityStateTextView, 0);
        availabilityStateTextView.setText(this.$displayItem.A00);
        availabilityStateTextView.setAvailable(this.$isAvailable);
        return C27621Wu.A00;
    }
}
