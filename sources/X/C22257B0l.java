package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.B0l  reason: case insensitive filesystem */
public final class C22257B0l extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ String $flowId;
    public final /* synthetic */ Map $metadataMap;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22257B0l(String str, Map map) {
        super(1);
        this.$flowId = str;
        this.$metadataMap = map;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass84U A0a = C108955ca.A0a(obj);
        A0a.A01("flow_id", this.$flowId);
        Iterator A15 = AnonymousClass000.A15(this.$metadataMap);
        while (A15.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(A15);
            A0a.A01(C17880vN.A0x(A16), A16.getValue());
        }
        return C27621Wu.A00;
    }
}
