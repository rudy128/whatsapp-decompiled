package X;

import java.util.Map;

/* renamed from: X.B3f  reason: case insensitive filesystem */
public final class C22328B3f extends AnonymousClass11G implements AnonymousClass1OS {
    public final /* synthetic */ B9G $flowReadyCallback = null;
    public final /* synthetic */ C22521BBe $flowTerminationCallback;
    public final /* synthetic */ A2N $flowsContextParams;
    public final /* synthetic */ boolean $isDraft;
    public final /* synthetic */ C193199ph $phoenixSessionConfig;
    public final /* synthetic */ String $pslData;
    public final /* synthetic */ Map $stateMachineInputParams;
    public final /* synthetic */ C20119A8c this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22328B3f(C20119A8c a8c, A2N a2n, C22521BBe bBe, C193199ph r5, String str, Map map, boolean z) {
        super(2);
        this.this$0 = a8c;
        this.$phoenixSessionConfig = r5;
        this.$flowsContextParams = a2n;
        this.$pslData = str;
        this.$isDraft = z;
        this.$stateMachineInputParams = map;
        this.$flowTerminationCallback = bBe;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        String str = (String) obj2;
        if (AnonymousClass000.A1Y(obj)) {
            C20119A8c a8c = this.this$0;
            C193199ph r4 = this.$phoenixSessionConfig;
            A2N a2n = this.$flowsContextParams;
            String str2 = this.$pslData;
            boolean z = this.$isDraft;
            C20119A8c.A03(a8c, a2n, this.$flowReadyCallback, this.$flowTerminationCallback, r4, str2, this.$stateMachineInputParams, z);
        } else {
            C20119A8c a8c2 = this.this$0;
            C22521BBe bBe = this.$flowTerminationCallback;
            if (str == null) {
                str = "UNKNOWN";
            }
            C20119A8c.A05(a8c2, bBe, str, this.$flowsContextParams.A05);
        }
        return C27621Wu.A00;
    }
}
