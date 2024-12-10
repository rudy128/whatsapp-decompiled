package X;

import java.util.AbstractSet;
import java.util.Iterator;

/* renamed from: X.Dba  reason: case insensitive filesystem */
public abstract class C27304Dba<K, V, T> extends AbstractSet<T> {
    public final C27300DbW biMap;

    public abstract Object forEntry(int i);

    public void clear() {
        this.biMap.clear();
    }

    public Iterator iterator() {
        return new DV2(this);
    }

    public int size() {
        return this.biMap.size;
    }

    public C27304Dba(C27300DbW dbW) {
        this.biMap = dbW;
    }
}
