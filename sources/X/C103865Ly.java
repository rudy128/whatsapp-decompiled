package X;

import com.whatsapp.biz.catalog.view.AvailabilityStateImageView;

/* renamed from: X.5Ly  reason: invalid class name and case insensitive filesystem */
public final class C103865Ly extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ boolean $value;
    public final /* synthetic */ AvailabilityStateImageView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C103865Ly(AvailabilityStateImageView availabilityStateImageView, boolean z) {
        super(0);
        this.this$0 = availabilityStateImageView;
        this.$value = z;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        AnonymousClass3N8 r2 = this.this$0.A00;
        if (r2 == null) {
            C18070vi.A11("frameDrawable");
            throw null;
        }
        boolean z = this.$value;
        if (r2.A00 != z) {
            r2.A00 = z;
            AnonymousClass3N8.A00(r2, r2.getBounds().width());
            r2.invalidateSelf();
        }
        return C27621Wu.A00;
    }
}
