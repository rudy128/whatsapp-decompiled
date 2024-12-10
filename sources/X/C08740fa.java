package X;

/* renamed from: X.0fa  reason: invalid class name and case insensitive filesystem */
public final class C08740fa extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C18090vk $boundsProvider;
    public final /* synthetic */ C16910tQ $childCoordinates;
    public final /* synthetic */ AnonymousClass07N this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C08740fa(AnonymousClass07N r2, C16910tQ r3, C18090vk r4) {
        super(0);
        this.this$0 = r2;
        this.$childCoordinates = r3;
        this.$boundsProvider = r4;
    }

    /* renamed from: A00 */
    public final AnonymousClass0NU invoke() {
        AnonymousClass0NU A01 = AnonymousClass07N.A00(this.this$0, this.$childCoordinates, this.$boundsProvider);
        if (A01 == null) {
            return null;
        }
        AnonymousClass092 r5 = (AnonymousClass092) this.this$0.A00;
        long j = r5.A00;
        if (j == 0) {
            throw AnonymousClass000.A0n("Expected BringIntoViewRequester to not be used before parents are placed.");
        }
        long A03 = AnonymousClass092.A03(r5, A01, j);
        return A01.A02(AnonymousClass001.A0p(-AnonymousClass0QY.A01(A03), -AnonymousClass0QY.A02(A03)));
    }
}
