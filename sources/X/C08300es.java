package X;

/* renamed from: X.0es  reason: invalid class name and case insensitive filesystem */
public final class C08300es extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ AnonymousClass0IV this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C08300es(AnonymousClass0IV r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C04170Mc r0 = this.this$0.A00;
        if (r0 != null) {
            return r0;
        }
        throw AnonymousClass000.A0n("Trying to access the LayoutCache from outside a layout call");
    }
}
