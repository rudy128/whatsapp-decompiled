package X;

import java.util.Map;

/* renamed from: X.Awe  reason: case insensitive filesystem */
public final class C22038Awe extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ Map $effectiveInput;
    public final /* synthetic */ Map $extraParams;
    public final /* synthetic */ String $fdsManagerId;
    public final /* synthetic */ int $instanceKey;
    public final /* synthetic */ String $stateName;
    public final /* synthetic */ C199269zi this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22038Awe(C199269zi r2, String str, String str2, Map map, Map map2, int i) {
        super(0);
        this.this$0 = r2;
        this.$stateName = str;
        this.$instanceKey = i;
        this.$effectiveInput = map;
        this.$fdsManagerId = str2;
        this.$extraParams = map2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C199269zi r0 = this.this$0;
        C22545BCc bCc = r0.A00;
        String str = this.$stateName;
        int i = this.$instanceKey;
        this.this$0.A01.A02(new AnonymousClass7NU(bCc.BV2(str, r0.A02, this.$fdsManagerId, this.$effectiveInput, this.$extraParams, i), this.$stateName));
        return C27621Wu.A00;
    }
}
