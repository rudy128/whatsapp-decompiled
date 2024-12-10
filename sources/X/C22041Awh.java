package X;

import java.util.Map;

/* renamed from: X.Awh  reason: case insensitive filesystem */
public final class C22041Awh extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ B9G $flowReadyCallback = null;
    public final /* synthetic */ C22521BBe $flowTerminationCallback;
    public final /* synthetic */ A2N $flowsContextParams;
    public final /* synthetic */ C193199ph $phoenixSessionConfig;
    public final /* synthetic */ String $pslData;
    public final /* synthetic */ Map $stateMachineInputParams;
    public final /* synthetic */ C20119A8c this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22041Awh(C20119A8c a8c, A2N a2n, C22521BBe bBe, C193199ph r5, String str, Map map) {
        super(0);
        this.this$0 = a8c;
        this.$phoenixSessionConfig = r5;
        this.$flowsContextParams = a2n;
        this.$pslData = str;
        this.$stateMachineInputParams = map;
        this.$flowTerminationCallback = bBe;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        ((C192089nm) this.this$0.A0N.get()).A01(this.$phoenixSessionConfig.A00);
        C20119A8c a8c = this.this$0;
        C193199ph r4 = this.$phoenixSessionConfig;
        C20119A8c.A03(a8c, this.$flowsContextParams, this.$flowReadyCallback, this.$flowTerminationCallback, r4, this.$pslData, this.$stateMachineInputParams, true);
        return C27621Wu.A00;
    }
}
