package X;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;

/* renamed from: X.DbW  reason: case insensitive filesystem */
public final class C27300DbW<K, V> extends AbstractMap<K, V> implements AnonymousClass3MQ<K, V>, Serializable {
    public transient Set entrySet;
    public transient int firstInInsertionOrder;
    public transient int[] hashTableKToV;
    public transient int[] hashTableVToK;
    public transient AnonymousClass3MQ inverse;
    public transient Set keySet;
    public transient Object[] keys;
    public transient int lastInInsertionOrder;
    public transient int modCount;
    public transient int[] nextInBucketKToV;
    public transient int[] nextInBucketVToK;
    public transient int[] nextInInsertionOrder;
    public transient int[] prevInInsertionOrder;
    public transient int size;
    public transient Set valueSet;
    public transient Object[] values;

    private void deleteFromTableKToV(int i, int i2) {
        C199610h.A07(AnonymousClass000.A1S(i, -1));
        int bucket = bucket(i2);
        int[] iArr = this.hashTableKToV;
        int i3 = iArr[bucket];
        if (i3 == i) {
            int[] iArr2 = this.nextInBucketKToV;
            iArr[bucket] = iArr2[i];
            iArr2[i] = -1;
            return;
        }
        int[] iArr3 = this.nextInBucketKToV;
        int i4 = iArr3[i3];
        while (true) {
            int i5 = i3;
            i3 = i4;
            if (i4 == -1) {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("Expected to find entry with key ");
                throw AnonymousClass8BR.A0v(C17890vO.A0V(this.keys[i], A10));
            } else if (i4 == i) {
                iArr3[i5] = iArr3[i];
                iArr3[i] = -1;
                return;
            } else {
                i4 = iArr3[i4];
            }
        }
    }

    private void deleteFromTableVToK(int i, int i2) {
        C199610h.A07(AnonymousClass000.A1S(i, -1));
        int bucket = bucket(i2);
        int[] iArr = this.hashTableVToK;
        int i3 = iArr[bucket];
        if (i3 == i) {
            int[] iArr2 = this.nextInBucketVToK;
            iArr[bucket] = iArr2[i];
            iArr2[i] = -1;
            return;
        }
        int[] iArr3 = this.nextInBucketVToK;
        int i4 = iArr3[i3];
        while (true) {
            int i5 = i3;
            i3 = i4;
            if (i4 == -1) {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("Expected to find entry with value ");
                throw AnonymousClass8BR.A0v(C17890vO.A0V(this.values[i], A10));
            } else if (i4 == i) {
                iArr3[i5] = iArr3[i];
                iArr3[i] = -1;
                return;
            } else {
                i4 = iArr3[i4];
            }
        }
    }

    public static int[] expandAndFillWithAbsent(int[] iArr, int i) {
        int length = iArr.length;
        int[] copyOf = Arrays.copyOf(iArr, i);
        Arrays.fill(copyOf, length, i, -1);
        return copyOf;
    }

    private void insertIntoTableKToV(int i, int i2) {
        C199610h.A07(AnonymousClass000.A1S(i, -1));
        int bucket = bucket(i2);
        int[] iArr = this.nextInBucketKToV;
        int[] iArr2 = this.hashTableKToV;
        iArr[i] = iArr2[bucket];
        iArr2[bucket] = i;
    }

    private void insertIntoTableVToK(int i, int i2) {
        C199610h.A07(AnonymousClass000.A1S(i, -1));
        int bucket = bucket(i2);
        int[] iArr = this.nextInBucketVToK;
        int[] iArr2 = this.hashTableVToK;
        iArr[i] = iArr2[bucket];
        iArr2[bucket] = i;
    }

    private void removeEntry(int i, int i2, int i3) {
        C199610h.A07(AnonymousClass000.A1S(i, -1));
        deleteFromTableKToV(i, i2);
        deleteFromTableVToK(i, i3);
        setSucceeds(this.prevInInsertionOrder[i], this.nextInInsertionOrder[i]);
        moveEntryToIndex(this.size - 1, i);
        Object[] objArr = this.keys;
        int i4 = this.size;
        int i5 = i4 - 1;
        objArr[i5] = null;
        this.values[i5] = null;
        this.size = i4 - 1;
        this.modCount++;
    }

    /* access modifiers changed from: private */
    public void replaceKeyInEntry(int i, Object obj, boolean z) {
        C199610h.A07(AnonymousClass000.A1S(i, -1));
        int findEntryByKey = findEntryByKey(obj, AnonymousClass111.smearedHash(obj));
        int i2 = this.lastInInsertionOrder;
        if (findEntryByKey != -1) {
            throw AnonymousClass8BX.A0V(obj, "Key already present in map: ", AnonymousClass000.A10());
        }
        if (i2 == i) {
            i2 = this.prevInInsertionOrder[i];
        } else if (i2 == this.size) {
            i2 = -1;
        }
        if (-2 == i) {
            findEntryByKey = this.nextInInsertionOrder[i];
        } else if (-2 != this.size) {
            findEntryByKey = -2;
        }
        setSucceeds(this.prevInInsertionOrder[i], this.nextInInsertionOrder[i]);
        deleteFromTableKToV(i, AnonymousClass111.smearedHash(this.keys[i]));
        this.keys[i] = obj;
        insertIntoTableKToV(i, AnonymousClass111.smearedHash(obj));
        setSucceeds(i2, i);
        setSucceeds(i, findEntryByKey);
    }

    /* access modifiers changed from: private */
    public void replaceValueInEntry(int i, Object obj, boolean z) {
        C199610h.A07(AnonymousClass000.A1S(i, -1));
        int smearedHash = AnonymousClass111.smearedHash(obj);
        if (findEntryByValue(obj, smearedHash) != -1) {
            throw AnonymousClass8BX.A0V(obj, "Value already present in map: ", AnonymousClass000.A10());
        }
        deleteFromTableVToK(i, AnonymousClass111.smearedHash(this.values[i]));
        this.values[i] = obj;
        insertIntoTableVToK(i, smearedHash);
    }

    private void setSucceeds(int i, int i2) {
        if (i == -2) {
            this.firstInInsertionOrder = i2;
        } else {
            this.nextInInsertionOrder[i] = i2;
        }
        if (i2 == -2) {
            this.lastInInsertionOrder = i;
        } else {
            this.prevInInsertionOrder[i2] = i;
        }
    }

    public int findEntryByKey(Object obj, int i) {
        return findEntry(obj, i, this.hashTableKToV, this.nextInBucketKToV, this.keys);
    }

    public int findEntryByValue(Object obj, int i) {
        return findEntry(obj, i, this.hashTableVToK, this.nextInBucketVToK, this.values);
    }

    public Object put(Object obj, Object obj2, boolean z) {
        boolean z2 = false;
        int smearedHash = AnonymousClass111.smearedHash(obj);
        int findEntryByKey = findEntryByKey(obj, smearedHash);
        if (findEntryByKey != -1) {
            Object obj3 = this.values[findEntryByKey];
            if (C24604CBi.A00(obj3, obj2)) {
                return obj2;
            }
            replaceValueInEntry(findEntryByKey, obj2, false);
            return obj3;
        }
        int smearedHash2 = AnonymousClass111.smearedHash(obj2);
        if (findEntryByValue(obj2, smearedHash2) == -1) {
            z2 = true;
        }
        C199610h.A06(obj2, "Value already present: %s", z2);
        ensureCapacity(this.size + 1);
        Object[] objArr = this.keys;
        int i = this.size;
        objArr[i] = obj;
        this.values[i] = obj2;
        insertIntoTableKToV(i, smearedHash);
        insertIntoTableVToK(this.size, smearedHash2);
        int i2 = this.lastInInsertionOrder;
        int i3 = this.size;
        setSucceeds(i2, i3);
        setSucceeds(i3, -2);
        this.size = i3 + 1;
        this.modCount++;
        return null;
    }

    public Object putInverse(Object obj, Object obj2, boolean z) {
        int i;
        boolean z2 = false;
        int smearedHash = AnonymousClass111.smearedHash(obj);
        int findEntryByValue = findEntryByValue(obj, smearedHash);
        if (findEntryByValue != -1) {
            Object obj3 = this.keys[findEntryByValue];
            if (C24604CBi.A00(obj3, obj2)) {
                return obj2;
            }
            replaceKeyInEntry(findEntryByValue, obj2, false);
            return obj3;
        }
        int i2 = this.lastInInsertionOrder;
        int smearedHash2 = AnonymousClass111.smearedHash(obj2);
        if (findEntryByKey(obj2, smearedHash2) == -1) {
            z2 = true;
        }
        C199610h.A06(obj2, "Key already present: %s", z2);
        ensureCapacity(this.size + 1);
        Object[] objArr = this.keys;
        int i3 = this.size;
        objArr[i3] = obj2;
        this.values[i3] = obj;
        insertIntoTableKToV(i3, smearedHash2);
        insertIntoTableVToK(this.size, smearedHash);
        if (i2 == -2) {
            i = this.firstInInsertionOrder;
        } else {
            i = this.nextInInsertionOrder[i2];
        }
        int i4 = this.size;
        setSucceeds(i2, i4);
        setSucceeds(i4, i);
        this.size = i4 + 1;
        this.modCount++;
        return null;
    }

    private int bucket(int i) {
        return i & (this.hashTableKToV.length - 1);
    }

    public static int[] createFilledWithAbsent(int i) {
        int[] iArr = new int[i];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    private void ensureCapacity(int i) {
        int length = this.nextInBucketKToV.length;
        if (length < i) {
            int expandedCapacity = C201410z.expandedCapacity(length, i);
            this.keys = Arrays.copyOf(this.keys, expandedCapacity);
            this.values = Arrays.copyOf(this.values, expandedCapacity);
            this.nextInBucketKToV = expandAndFillWithAbsent(this.nextInBucketKToV, expandedCapacity);
            this.nextInBucketVToK = expandAndFillWithAbsent(this.nextInBucketVToK, expandedCapacity);
            this.prevInInsertionOrder = expandAndFillWithAbsent(this.prevInInsertionOrder, expandedCapacity);
            this.nextInInsertionOrder = expandAndFillWithAbsent(this.nextInInsertionOrder, expandedCapacity);
        }
        if (this.hashTableKToV.length < i) {
            int closedTableSize = AnonymousClass111.closedTableSize(i, 1.0d);
            this.hashTableKToV = createFilledWithAbsent(closedTableSize);
            this.hashTableVToK = createFilledWithAbsent(closedTableSize);
            for (int i2 = 0; i2 < this.size; i2++) {
                int bucket = bucket(AnonymousClass111.smearedHash(this.keys[i2]));
                int[] iArr = this.nextInBucketKToV;
                int[] iArr2 = this.hashTableKToV;
                iArr[i2] = iArr2[bucket];
                iArr2[bucket] = i2;
                int bucket2 = bucket(AnonymousClass111.smearedHash(this.values[i2]));
                int[] iArr3 = this.nextInBucketVToK;
                int[] iArr4 = this.hashTableVToK;
                iArr3[i2] = iArr4[bucket2];
                iArr4[bucket2] = i2;
            }
        }
    }

    private void moveEntryToIndex(int i, int i2) {
        int i3;
        int i4;
        if (i != i2) {
            int i5 = this.prevInInsertionOrder[i];
            int i6 = this.nextInInsertionOrder[i];
            setSucceeds(i5, i2);
            setSucceeds(i2, i6);
            Object[] objArr = this.keys;
            Object obj = objArr[i];
            Object[] objArr2 = this.values;
            Object obj2 = objArr2[i];
            objArr[i2] = obj;
            objArr2[i2] = obj2;
            int bucket = bucket(AnonymousClass111.smearedHash(obj));
            int[] iArr = this.hashTableKToV;
            int i7 = iArr[bucket];
            if (i7 == i) {
                iArr[bucket] = i2;
            } else {
                int[] iArr2 = this.nextInBucketKToV;
                int i8 = iArr2[i7];
                while (true) {
                    i3 = i7;
                    i7 = i8;
                    if (i8 == i) {
                        break;
                    }
                    i8 = iArr2[i8];
                }
                iArr2[i3] = i2;
            }
            int[] iArr3 = this.nextInBucketKToV;
            iArr3[i2] = iArr3[i];
            iArr3[i] = -1;
            int bucket2 = bucket(AnonymousClass111.smearedHash(obj2));
            int[] iArr4 = this.hashTableVToK;
            int i9 = iArr4[bucket2];
            if (i9 == i) {
                iArr4[bucket2] = i2;
            } else {
                int[] iArr5 = this.nextInBucketVToK;
                int i10 = iArr5[i9];
                while (true) {
                    i4 = i9;
                    i9 = i10;
                    if (i10 == i) {
                        break;
                    }
                    i10 = iArr5[i10];
                }
                iArr5[i4] = i2;
            }
            int[] iArr6 = this.nextInBucketVToK;
            iArr6[i2] = iArr6[i];
            iArr6[i] = -1;
        }
    }

    public void clear() {
        Arrays.fill(this.keys, 0, this.size, (Object) null);
        Arrays.fill(this.values, 0, this.size, (Object) null);
        Arrays.fill(this.hashTableKToV, -1);
        Arrays.fill(this.hashTableVToK, -1);
        Arrays.fill(this.nextInBucketKToV, 0, this.size, -1);
        Arrays.fill(this.nextInBucketVToK, 0, this.size, -1);
        Arrays.fill(this.prevInInsertionOrder, 0, this.size, -1);
        Arrays.fill(this.nextInInsertionOrder, 0, this.size, -1);
        this.size = 0;
        this.firstInInsertionOrder = -2;
        this.lastInInsertionOrder = -2;
        this.modCount++;
    }

    public Set entrySet() {
        Set set = this.entrySet;
        if (set != null) {
            return set;
        }
        C23549Blc blc = new C23549Blc(this);
        this.entrySet = blc;
        return blc;
    }

    public void init(int i) {
        C201310y.checkNonnegative(i, "expectedSize");
        int closedTableSize = AnonymousClass111.closedTableSize(i, 1.0d);
        this.size = 0;
        this.keys = new Object[i];
        this.values = new Object[i];
        this.hashTableKToV = createFilledWithAbsent(closedTableSize);
        this.hashTableVToK = createFilledWithAbsent(closedTableSize);
        this.nextInBucketKToV = createFilledWithAbsent(i);
        this.nextInBucketVToK = createFilledWithAbsent(i);
        this.firstInInsertionOrder = -2;
        this.lastInInsertionOrder = -2;
        this.prevInInsertionOrder = createFilledWithAbsent(i);
        this.nextInInsertionOrder = createFilledWithAbsent(i);
    }

    public AnonymousClass3MQ inverse() {
        AnonymousClass3MQ r0 = this.inverse;
        if (r0 != null) {
            return r0;
        }
        C27299DbV dbV = new C27299DbV(this);
        this.inverse = dbV;
        return dbV;
    }

    public Set keySet() {
        Set set = this.keySet;
        if (set != null) {
            return set;
        }
        C23546BlZ blZ = new C23546BlZ(this);
        this.keySet = blZ;
        return blZ;
    }

    public void removeEntryKeyHashKnown(int i, int i2) {
        removeEntry(i, i2, AnonymousClass111.smearedHash(this.values[i]));
    }

    public void removeEntryValueHashKnown(int i, int i2) {
        removeEntry(i, AnonymousClass111.smearedHash(this.keys[i]), i2);
    }

    public int size() {
        return this.size;
    }

    public Set values() {
        Set set = this.valueSet;
        if (set != null) {
            return set;
        }
        C23547Bla bla = new C23547Bla(this);
        this.valueSet = bla;
        return bla;
    }

    public C27300DbW(int i) {
        init(i);
    }

    public static C27300DbW create(Map map) {
        C27300DbW create = create(map.size());
        create.putAll(map);
        return create;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int readCount = C26230CvM.readCount(objectInputStream);
        init(16);
        C26230CvM.populateMap(this, objectInputStream, readCount);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        C26230CvM.writeMap(this, objectOutputStream);
    }

    public boolean containsKey(Object obj) {
        return AnonymousClass000.A1S(findEntryByKey(obj), -1);
    }

    public boolean containsValue(Object obj) {
        return AnonymousClass000.A1S(findEntryByValue(obj), -1);
    }

    public int findEntry(Object obj, int i, int[] iArr, int[] iArr2, Object[] objArr) {
        int i2 = iArr[bucket(i)];
        while (i2 != -1) {
            if (C24604CBi.A00(objArr[i2], obj)) {
                return i2;
            }
            i2 = iArr2[i2];
        }
        return -1;
    }

    public Object get(Object obj) {
        int findEntryByKey = findEntryByKey(obj);
        if (findEntryByKey == -1) {
            return null;
        }
        return this.values[findEntryByKey];
    }

    public Object getInverse(Object obj) {
        int findEntryByValue = findEntryByValue(obj);
        if (findEntryByValue == -1) {
            return null;
        }
        return this.keys[findEntryByValue];
    }

    public Object remove(Object obj) {
        int smearedHash = AnonymousClass111.smearedHash(obj);
        int findEntryByKey = findEntryByKey(obj, smearedHash);
        if (findEntryByKey == -1) {
            return null;
        }
        Object obj2 = this.values[findEntryByKey];
        removeEntryKeyHashKnown(findEntryByKey, smearedHash);
        return obj2;
    }

    public Object removeInverse(Object obj) {
        int smearedHash = AnonymousClass111.smearedHash(obj);
        int findEntryByValue = findEntryByValue(obj, smearedHash);
        if (findEntryByValue == -1) {
            return null;
        }
        Object obj2 = this.keys[findEntryByValue];
        removeEntryValueHashKnown(findEntryByValue, smearedHash);
        return obj2;
    }

    public static C27300DbW create(int i) {
        return new C27300DbW(i);
    }

    public int findEntryByKey(Object obj) {
        return findEntryByKey(obj, AnonymousClass111.smearedHash(obj));
    }

    public int findEntryByValue(Object obj) {
        return findEntryByValue(obj, AnonymousClass111.smearedHash(obj));
    }

    public Object put(Object obj, Object obj2) {
        return put(obj, obj2, false);
    }

    public void removeEntry(int i) {
        removeEntryKeyHashKnown(i, AnonymousClass111.smearedHash(this.keys[i]));
    }

    public static C27300DbW create() {
        return create(16);
    }
}
