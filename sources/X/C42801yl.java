package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1yl  reason: invalid class name and case insensitive filesystem */
public class C42801yl extends LinkedHashMap<K, V> {
    public final /* synthetic */ C42791yk this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C42801yl(C42791yk r3, int i) {
        super(i, 0.75f, true);
        this.this$0 = r3;
    }

    public boolean removeEldestEntry(Map.Entry entry) {
        if (size() > this.this$0.A00) {
            return true;
        }
        return false;
    }
}
