package X;

/* renamed from: X.3I3  reason: invalid class name */
public final class AnonymousClass3I3 extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ String $code;
    public final /* synthetic */ boolean $forceFetchViewerMetadata;
    public final /* synthetic */ C96874oY $newsletterCallback;
    public final /* synthetic */ C29681ch $newsletterJid;
    public final /* synthetic */ C36341nj this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3I3(C29681ch r2, C96874oY r3, C36341nj r4, String str, boolean z) {
        super(0);
        this.this$0 = r4;
        this.$code = str;
        this.$newsletterJid = r2;
        this.$forceFetchViewerMetadata = z;
        this.$newsletterCallback = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C36341nj r1 = this.this$0;
        String str = this.$code;
        r1.A00 = ((C35681md) r1.A0B.get()).A01(this.$newsletterJid, this.$newsletterCallback, str, false, this.$forceFetchViewerMetadata);
        return C27621Wu.A00;
    }
}
