package X;

/* renamed from: X.5Pb  reason: invalid class name and case insensitive filesystem */
public final class C104675Pb extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C107535aB $callback;
    public final /* synthetic */ int $messageType;
    public final /* synthetic */ C29681ch $newsletterJid;
    public final /* synthetic */ long $serverMessageId;
    public final /* synthetic */ Long $similarNewslettersSessionId;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C104675Pb(C29681ch r2, C107535aB r3, Long l, int i, long j) {
        super(0);
        this.$callback = r3;
        this.$newsletterJid = r2;
        this.$serverMessageId = j;
        this.$messageType = i;
        this.$similarNewslettersSessionId = l;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C107535aB r0 = this.$callback;
        C29681ch r1 = this.$newsletterJid;
        long j = this.$serverMessageId;
        r0.C7g(r1, this.$similarNewslettersSessionId, this.$messageType, j);
        return C27621Wu.A00;
    }
}
