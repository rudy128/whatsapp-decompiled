package X;

import java.util.concurrent.ConcurrentHashMap;

public abstract class C8N {
    public static final void A00(D3R d3r, float f) {
        Float valueOf = Float.valueOf(f);
        ConcurrentHashMap concurrentHashMap = d3r.A01.A03;
        if (valueOf == null) {
            concurrentHashMap.remove("strength");
        } else {
            concurrentHashMap.put("strength", valueOf);
        }
    }
}
