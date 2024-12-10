package X;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.Dqi  reason: case insensitive filesystem */
public final class C28068Dqi extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ EAA $manager;
    public final /* synthetic */ ConcurrentHashMap $updaterMap;
    public final /* synthetic */ CZ1 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28068Dqi(EAA eaa, CZ1 cz1, ConcurrentHashMap concurrentHashMap) {
        super(1);
        this.$updaterMap = concurrentHashMap;
        this.this$0 = cz1;
        this.$manager = eaa;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Map.Entry A0p = BE8.A0p(obj);
        Object key = A0p.getKey();
        Object value = A0p.getValue();
        CZ1 cz1 = (CZ1) this.$updaterMap.get(key);
        if (cz1 != null && C18070vi.A18(cz1.A01, value)) {
            return C27621Wu.A00;
        }
        throw C17880vN.A0g();
    }
}
