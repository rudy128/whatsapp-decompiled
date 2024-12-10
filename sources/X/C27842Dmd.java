package X;

import java.util.Map;

/* renamed from: X.Dmd  reason: case insensitive filesystem */
public final class C27842Dmd extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C24315BzC $avatarUpdateType;
    public final /* synthetic */ Map $configMapWithFloatRanges;
    public final /* synthetic */ BRE this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27842Dmd(C24315BzC bzC, BRE bre, Map map) {
        super(0);
        this.this$0 = bre;
        this.$avatarUpdateType = bzC;
        this.$configMapWithFloatRanges = map;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        E4O e4o = (E4O) this.this$0.A01.get();
        if (e4o == null) {
            return null;
        }
        e4o.CFS(this.$avatarUpdateType, C18070vi.A0H(C8y.A00()), this.$configMapWithFloatRanges);
        return C27621Wu.A00;
    }
}
