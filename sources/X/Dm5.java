package X;

public final class Dm5 extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ AnonymousClass1GP $fragmentManager;
    public final /* synthetic */ C22654BId this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Dm5(AnonymousClass1GP r2, C22654BId bId) {
        super(0);
        this.this$0 = bId;
        this.$fragmentManager = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        AnonymousClass11P A0I = this.this$0.getTime();
        C18030ve A0N = this.this$0.getAbProps();
        AnonymousClass18K A0O = this.this$0.getWamRuntime();
        AnonymousClass1GP r1 = this.$fragmentManager;
        C22654BId bId = this.this$0;
        C36511o1 A0P = bId.getGroupWamEventHelper();
        C19830z4 A0K = this.this$0.getWaSharedPreferences();
        return new C20442ALf(r1, bId, this.this$0.getConversationsManager(), A0I, A0K, A0N, A0O, A0P, this.this$0.getMetaAISearchGating(), this.this$0.getReachoutTimelockUtils());
    }
}
