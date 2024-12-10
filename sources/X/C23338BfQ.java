package X;

import java.util.AbstractMap;
import java.util.Comparator;

/* renamed from: X.BfQ  reason: case insensitive filesystem */
public final class C23338BfQ extends C23345BfX {
    public final /* synthetic */ C23347BfZ zza;

    public C23338BfQ(C23347BfZ bfZ) {
        this.zza = bfZ;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        C23346BfY bfY = this.zza.zza;
        Comparator comparator = C23346BfY.A03;
        return new AbstractMap.SimpleImmutableEntry(bfY.A01.A01.get(i), this.zza.zza.A00.get(i));
    }

    public final int size() {
        return this.zza.zza.size();
    }
}
