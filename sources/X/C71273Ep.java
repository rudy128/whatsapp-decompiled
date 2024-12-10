package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.3Ep  reason: invalid class name and case insensitive filesystem */
public class C71273Ep extends LinkedHashMap<String, String> {
    public final /* synthetic */ C220318i this$1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C71273Ep(C220318i r4) {
        super(64, 0.75f, true);
        this.this$1 = r4;
    }

    public boolean removeEldestEntry(Map.Entry entry) {
        if (size() > 64) {
            return true;
        }
        return false;
    }
}
