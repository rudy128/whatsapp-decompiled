package X;

import java.util.AbstractMap;
import java.util.Map;

/* renamed from: X.Bld  reason: case insensitive filesystem */
public class C23550Bld extends AnonymousClass1IX<Map.Entry<K, V>> {
    public final /* synthetic */ C23554Blh this$0;

    public boolean isPartialView() {
        return true;
    }

    public C23550Bld(C23554Blh blh) {
        this.this$0 = blh;
    }

    public Map.Entry get(int i) {
        C199610h.A01(i, this.this$0.size);
        int i2 = i * 2;
        Object obj = this.this$0.alternatingKeysAndValues[i2];
        obj.getClass();
        Object obj2 = this.this$0.alternatingKeysAndValues[i2 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    public int size() {
        return this.this$0.size;
    }

    public Object writeReplace() {
        return super.writeReplace();
    }
}
