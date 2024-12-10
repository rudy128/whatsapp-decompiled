package X;

import java.util.Map;

/* renamed from: X.B0m  reason: case insensitive filesystem */
public final class C22258B0m extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ String $flowId;
    public final /* synthetic */ Map $metadataMap;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22258B0m(String str, Map map) {
        super(1);
        this.$flowId = str;
        this.$metadataMap = map;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass84T r4 = (AnonymousClass84T) obj;
        C18070vi.A0d(r4, 0);
        r4.put(AnonymousClass84U.A00(new C22257B0l(this.$flowId, this.$metadataMap)));
        return C27621Wu.A00;
    }
}
