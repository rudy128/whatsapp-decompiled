package X;

import java.util.Map;

/* renamed from: X.Dmg  reason: case insensitive filesystem */
public final class C27845Dmg extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C24315BzC $avatarUpdateType;
    public final /* synthetic */ Map $configMap;
    public final /* synthetic */ String $requestId;
    public final /* synthetic */ BRE this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27845Dmg(C24315BzC bzC, BRE bre, String str, Map map) {
        super(0);
        this.this$0 = bre;
        this.$avatarUpdateType = bzC;
        this.$requestId = str;
        this.$configMap = map;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        E4O e4o = (E4O) this.this$0.A01.get();
        if (e4o == null) {
            return null;
        }
        e4o.CFS(this.$avatarUpdateType, this.$requestId, this.$configMap);
        return C27621Wu.A00;
    }
}
