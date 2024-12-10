package X;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.10x  reason: invalid class name and case insensitive filesystem */
public class C201210x {
    public Object[] alternatingKeysAndValues;
    public C57412j2 duplicateKey;
    public boolean entriesUsed;
    public int size;

    public C201110w buildOrThrow() {
        return build(true);
    }

    private C201110w build(boolean z) {
        C57412j2 r1 = this.duplicateKey;
        if (r1 == null) {
            int i = this.size;
            Object[] objArr = this.alternatingKeysAndValues;
            this.entriesUsed = true;
            AnonymousClass110 create = AnonymousClass110.create(i, objArr, this);
            r1 = this.duplicateKey;
            if (r1 == null) {
                return create;
            }
        }
        throw r1.exception();
    }

    private void ensureCapacity(int i) {
        int i2 = i * 2;
        Object[] objArr = this.alternatingKeysAndValues;
        int length = objArr.length;
        if (i2 > length) {
            this.alternatingKeysAndValues = Arrays.copyOf(objArr, C201410z.expandedCapacity(length, i2));
            this.entriesUsed = false;
        }
    }

    public C201210x putAll(Iterable iterable) {
        if (iterable instanceof Collection) {
            ensureCapacity(this.size + ((Collection) iterable).size());
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            put((Map.Entry) it.next());
        }
        return this;
    }

    public C201210x(int i) {
        this.alternatingKeysAndValues = new Object[(i * 2)];
        this.size = 0;
        this.entriesUsed = false;
    }

    public C201210x put(Map.Entry entry) {
        put(entry.getKey(), entry.getValue());
        return this;
    }

    public C201210x() {
        this(4);
    }

    public C201110w build() {
        return buildOrThrow();
    }

    public C201210x put(Object obj, Object obj2) {
        ensureCapacity(this.size + 1);
        C201310y.checkEntryNotNull(obj, obj2);
        Object[] objArr = this.alternatingKeysAndValues;
        int i = this.size;
        int i2 = i * 2;
        objArr[i2] = obj;
        objArr[i2 + 1] = obj2;
        this.size = i + 1;
        return this;
    }

    public C201210x putAll(Map map) {
        putAll((Iterable) map.entrySet());
        return this;
    }
}
