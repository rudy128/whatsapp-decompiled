package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.BfZ  reason: case insensitive filesystem */
public final class C23347BfZ extends C23341BfT {
    public final /* synthetic */ C23346BfY zza;

    public C23347BfZ(C23346BfY bfY) {
        this.zza = bfY;
    }

    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.zza.get(entry.getKey());
            if (obj2 == null || !obj2.equals(entry.getValue())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        for (Object A0l : this.zza.entrySet()) {
            i += AnonymousClass001.A0l(A0l);
        }
        return i;
    }

    public final int size() {
        return this.zza.size();
    }

    public final /* synthetic */ Iterator iterator() {
        return A09().listIterator(0);
    }

    public C23347BfZ() {
    }
}
