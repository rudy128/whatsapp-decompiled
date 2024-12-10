package X;

/* renamed from: X.Awk  reason: case insensitive filesystem */
public final class C22044Awk extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ AnonymousClass19Y $epdJurisdictionAwareLogger;
    public final /* synthetic */ AnonymousClass19V $profilohelperFactory;
    public final /* synthetic */ AnonymousClass118 $waContext;
    public final /* synthetic */ AnonymousClass10I $waWorkers;
    public final /* synthetic */ AnonymousClass18K $wamRunTime;
    public final /* synthetic */ AnonymousClass198 $whatsAppSoLoader;
    public final /* synthetic */ C20081A6h this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22044Awk(AnonymousClass118 r2, AnonymousClass18K r3, C20081A6h a6h, AnonymousClass19V r5, AnonymousClass19Y r6, AnonymousClass198 r7, AnonymousClass10I r8) {
        super(0);
        this.this$0 = a6h;
        this.$waContext = r2;
        this.$waWorkers = r8;
        this.$wamRunTime = r3;
        this.$whatsAppSoLoader = r7;
        this.$profilohelperFactory = r5;
        this.$epdJurisdictionAwareLogger = r6;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        String str;
        C20081A6h a6h = this.this$0;
        AnonymousClass11P r3 = a6h.A01;
        AnonymousClass118 r4 = this.$waContext;
        AnonymousClass10I r11 = this.$waWorkers;
        AnonymousClass18K r6 = this.$wamRunTime;
        AnonymousClass198 r10 = this.$whatsAppSoLoader;
        AnonymousClass19T r9 = a6h.A04;
        AnonymousClass19V r7 = this.$profilohelperFactory;
        AnonymousClass19Y r8 = this.$epdJurisdictionAwareLogger;
        if (a6h instanceof C172038sg) {
            str = "PslPrefetchPerfTracker";
        } else if (a6h instanceof C172048sh) {
            str = "PhoenixFlowsMetadataPerfTracker";
        } else if (a6h instanceof C172028sf) {
            str = "PhoenixFlowsInitLogger";
        } else {
            str = "PhoenixExtensionInitLogger";
        }
        C222119a r2 = new C222119a(r3, r4, a6h.A02, r6, r7, r8, r9, r10, r11, str, a6h.A00);
        r2.A05.A04 = true;
        return r2;
    }
}
