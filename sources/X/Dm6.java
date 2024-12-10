package X;

public final class Dm6 extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ AnonymousClass1GP $fragmentManager;
    public final /* synthetic */ C22654BId this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Dm6(AnonymousClass1GP r2, C22654BId bId) {
        super(0);
        this.this$0 = bId;
        this.$fragmentManager = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C18030ve A0N = this.this$0.getAbProps();
        C22654BId bId = this.this$0;
        C25013CTn A0E = bId.getLabelMessageDeprecationHelper();
        C19880zA A02 = this.this$0.getLabelItemRouter();
        AnonymousClass1GP r1 = this.$fragmentManager;
        C28551aQ A0Q = this.this$0.getLabelMessageDeprecationLogger();
        C18070vi.A0X(A0Q);
        C28561aR A0M = this.this$0.getLabelMessageMigrationSharedPreferences();
        C18070vi.A0X(A0M);
        return new C26979DOb(r1, A02, bId, A0E, A0M, A0N, A0Q);
    }
}
