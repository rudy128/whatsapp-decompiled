package X;

import java.util.Map;

/* renamed from: X.Dmb  reason: case insensitive filesystem */
public final class C27840Dmb extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ Map $config;
    public final /* synthetic */ String $requestId;
    public final /* synthetic */ BRE this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27840Dmb(BRE bre, String str, Map map) {
        super(0);
        this.this$0 = bre;
        this.$requestId = str;
        this.$config = map;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        E4O e4o = (E4O) this.this$0.A01.get();
        if (e4o == null) {
            return null;
        }
        String str = this.$requestId;
        Map map = this.$config;
        C18070vi.A0h(str, map);
        EAU eau = ((DBR) e4o).A00;
        if (eau == null) {
            C18070vi.A11("aleBridge");
            throw null;
        }
        eau.CQT(str, map);
        return C27621Wu.A00;
    }
}
