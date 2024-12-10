package X;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: X.DbX  reason: case insensitive filesystem */
public class C27301DbX<K, V> extends AbstractMap<K, V> implements Serializable {
    public static final Object NOT_FOUND = C17880vN.A0p();
    public transient int[] entries;
    public transient Set entrySetView;
    public transient Set keySetView;
    public transient Object[] keys;
    public transient int metadata;
    public transient int size;
    public transient Object table;
    public transient Object[] values;
    public transient Collection valuesView;

    public int adjustAfterRemove(int i, int i2) {
        return i - 1;
    }

    public void init(int i) {
        this.metadata = BE8.A06(i, 1, 1073741823);
    }

    public void insertEntry(int i, Object obj, Object obj2, int i2, int i3) {
        setEntry(i, C26271CwI.maskCombine(i2, 0, i3));
        setKey(i, obj);
        setValue(i, obj2);
    }

    public Object put(Object obj, Object obj2) {
        int i;
        int i2;
        if (needsAllocArrays()) {
            allocArrays();
        }
        Map delegateOrNull = delegateOrNull();
        Object obj3 = obj;
        Object obj4 = obj2;
        if (delegateOrNull == null) {
            int[] requireEntries = requireEntries();
            Object[] requireKeys = requireKeys();
            Object[] requireValues = requireValues();
            int i3 = this.size;
            int i4 = i3 + 1;
            int smearedHash = AnonymousClass111.smearedHash(obj3);
            int hashTableMask = hashTableMask();
            int i5 = smearedHash & hashTableMask;
            int tableGet = C26271CwI.tableGet(requireTable(), i5);
            if (tableGet == 0) {
                if (i4 <= hashTableMask) {
                    C26271CwI.tableSet(requireTable(), i5, i3 + 1);
                }
                hashTableMask = resizeTable(hashTableMask, C26271CwI.newCapacity(hashTableMask), smearedHash, i3);
            } else {
                int hashPrefix = C26271CwI.getHashPrefix(smearedHash, hashTableMask);
                int i6 = 0;
                do {
                    i = tableGet - 1;
                    i2 = requireEntries[i];
                    if (C26271CwI.getHashPrefix(i2, hashTableMask) != hashPrefix || !C24604CBi.A00(obj3, requireKeys[i])) {
                        tableGet = C26271CwI.getNext(i2, hashTableMask);
                        i6++;
                    } else {
                        Object obj5 = requireValues[i];
                        requireValues[i] = obj2;
                        return obj5;
                    }
                } while (tableGet != 0);
                if (i6 >= 9) {
                    delegateOrNull = convertToHashFloodingResistantImplementation();
                } else {
                    if (i4 <= hashTableMask) {
                        requireEntries[i] = C26271CwI.maskCombine(i2, i3 + 1, hashTableMask);
                    }
                    hashTableMask = resizeTable(hashTableMask, C26271CwI.newCapacity(hashTableMask), smearedHash, i3);
                }
            }
            resizeMeMaybe(i4);
            insertEntry(i3, obj3, obj4, smearedHash, hashTableMask);
            this.size = i4;
            incrementModCount();
            return null;
        }
        return delegateOrNull.put(obj3, obj4);
    }

    public static /* synthetic */ int access$1210(C27301DbX dbX) {
        int i = dbX.size;
        dbX.size = i - 1;
        return i;
    }

    public static C27301DbX create() {
        return new C27301DbX();
    }

    /* access modifiers changed from: private */
    public int hashTableMask() {
        return (1 << (this.metadata & 31)) - 1;
    }

    /* access modifiers changed from: private */
    public int[] requireEntries() {
        int[] iArr = this.entries;
        iArr.getClass();
        return iArr;
    }

    /* access modifiers changed from: private */
    public Object[] requireKeys() {
        Object[] objArr = this.keys;
        objArr.getClass();
        return objArr;
    }

    /* access modifiers changed from: private */
    public Object requireTable() {
        Object obj = this.table;
        obj.getClass();
        return obj;
    }

    /* access modifiers changed from: private */
    public Object[] requireValues() {
        Object[] objArr = this.values;
        objArr.getClass();
        return objArr;
    }

    public Set createEntrySet() {
        return new C27305Dbb(this);
    }

    public Map createHashFloodingResistantDelegate(int i) {
        return new LinkedHashMap(i, 1.0f);
    }

    public Set createKeySet() {
        return new C27306Dbc(this);
    }

    public Collection createValues() {
        return new C27284DbD(this);
    }

    public Map delegateOrNull() {
        Object obj = this.table;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public Set entrySet() {
        Set set = this.entrySetView;
        if (set != null) {
            return set;
        }
        Set createEntrySet = createEntrySet();
        this.entrySetView = createEntrySet;
        return createEntrySet;
    }

    public int getSuccessor(int i) {
        int i2 = i + 1;
        if (i2 < this.size) {
            return i2;
        }
        return -1;
    }

    public void incrementModCount() {
        this.metadata += 32;
    }

    public Set keySet() {
        Set set = this.keySetView;
        if (set != null) {
            return set;
        }
        Set createKeySet = createKeySet();
        this.keySetView = createKeySet;
        return createKeySet;
    }

    public boolean needsAllocArrays() {
        return AnonymousClass000.A1X(this.table);
    }

    public Collection values() {
        Collection collection = this.valuesView;
        if (collection != null) {
            return collection;
        }
        Collection createValues = createValues();
        this.valuesView = createValues;
        return createValues;
    }

    public C27301DbX() {
        init(3);
    }

    private int entry(int i) {
        return requireEntries()[i];
    }

    /* access modifiers changed from: private */
    public int indexOf(Object obj) {
        if (!needsAllocArrays()) {
            int smearedHash = AnonymousClass111.smearedHash(obj);
            int hashTableMask = hashTableMask();
            int tableGet = C26271CwI.tableGet(requireTable(), smearedHash & hashTableMask);
            if (tableGet != 0) {
                int hashPrefix = C26271CwI.getHashPrefix(smearedHash, hashTableMask);
                do {
                    int i = tableGet - 1;
                    int entry = entry(i);
                    if (C26271CwI.getHashPrefix(entry, hashTableMask) == hashPrefix && C24604CBi.A00(obj, key(i))) {
                        return i;
                    }
                    tableGet = C26271CwI.getNext(entry, hashTableMask);
                } while (tableGet != 0);
            }
        }
        return -1;
    }

    /* access modifiers changed from: private */
    public Object key(int i) {
        return requireKeys()[i];
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        if (readInt >= 0) {
            init(readInt);
            for (int i = 0; i < readInt; i++) {
                put(objectInputStream.readObject(), objectInputStream.readObject());
            }
            return;
        }
        throw new InvalidObjectException(AnonymousClass001.A1I("Invalid size: ", AnonymousClass000.A10(), readInt));
    }

    /* access modifiers changed from: private */
    public Object removeHelper(Object obj) {
        int hashTableMask;
        int remove;
        if (needsAllocArrays() || (remove = C26271CwI.remove(obj, (Object) null, hashTableMask, requireTable(), requireEntries(), requireKeys(), (Object[]) null)) == -1) {
            return NOT_FOUND;
        }
        Object value = value(remove);
        moveLastEntry(remove, (hashTableMask = hashTableMask()));
        this.size--;
        incrementModCount();
        return value;
    }

    private void resizeMeMaybe(int i) {
        int min;
        int length = requireEntries().length;
        if (i > length && (min = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            resizeEntries(min);
        }
    }

    private int resizeTable(int i, int i2, int i3, int i4) {
        Object createTable = C26271CwI.createTable(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            C26271CwI.tableSet(createTable, i3 & i5, i4 + 1);
        }
        Object requireTable = requireTable();
        int[] requireEntries = requireEntries();
        for (int i6 = 0; i6 <= i; i6++) {
            int tableGet = C26271CwI.tableGet(requireTable, i6);
            while (tableGet != 0) {
                int i7 = tableGet - 1;
                int i8 = requireEntries[i7];
                int hashPrefix = C26271CwI.getHashPrefix(i8, i) | i6;
                int i9 = hashPrefix & i5;
                int tableGet2 = C26271CwI.tableGet(createTable, i9);
                C26271CwI.tableSet(createTable, i9, tableGet);
                requireEntries[i7] = C26271CwI.maskCombine(hashPrefix, tableGet2, i5);
                tableGet = C26271CwI.getNext(i8, i);
            }
        }
        this.table = createTable;
        setHashTableMask(i5);
        return i5;
    }

    private void setEntry(int i, int i2) {
        requireEntries()[i] = i2;
    }

    private void setHashTableMask(int i) {
        this.metadata = C26271CwI.maskCombine(this.metadata, 32 - Integer.numberOfLeadingZeros(i), 31);
    }

    private void setKey(int i, Object obj) {
        requireKeys()[i] = obj;
    }

    /* access modifiers changed from: private */
    public void setValue(int i, Object obj) {
        requireValues()[i] = obj;
    }

    /* access modifiers changed from: private */
    public Object value(int i) {
        return requireValues()[i];
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Iterator entrySetIterator = entrySetIterator();
        while (entrySetIterator.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(entrySetIterator);
            objectOutputStream.writeObject(A16.getKey());
            objectOutputStream.writeObject(A16.getValue());
        }
    }

    public int allocArrays() {
        C199610h.A08(needsAllocArrays(), "Arrays already allocated");
        int i = this.metadata;
        int tableSize = C26271CwI.tableSize(i);
        this.table = C26271CwI.createTable(tableSize);
        setHashTableMask(tableSize - 1);
        this.entries = new int[i];
        this.keys = new Object[i];
        this.values = new Object[i];
        return i;
    }

    public void clear() {
        if (!needsAllocArrays()) {
            incrementModCount();
            Map delegateOrNull = delegateOrNull();
            if (delegateOrNull != null) {
                this.metadata = BE8.A06(size(), 3, 1073741823);
                delegateOrNull.clear();
                this.table = null;
            } else {
                Arrays.fill(requireKeys(), 0, this.size, (Object) null);
                Arrays.fill(requireValues(), 0, this.size, (Object) null);
                C26271CwI.tableClear(requireTable());
                Arrays.fill(requireEntries(), 0, this.size, 0);
            }
            this.size = 0;
        }
    }

    public boolean containsKey(Object obj) {
        Map delegateOrNull = delegateOrNull();
        if (delegateOrNull != null) {
            return delegateOrNull.containsKey(obj);
        }
        return AnonymousClass000.A1S(indexOf(obj), -1);
    }

    public boolean containsValue(Object obj) {
        Map delegateOrNull = delegateOrNull();
        if (delegateOrNull != null) {
            return delegateOrNull.containsValue(obj);
        }
        for (int i = 0; i < this.size; i++) {
            if (C24604CBi.A00(obj, value(i))) {
                return true;
            }
        }
        return false;
    }

    public Map convertToHashFloodingResistantImplementation() {
        Map createHashFloodingResistantDelegate = createHashFloodingResistantDelegate(hashTableMask() + 1);
        int firstEntryIndex = firstEntryIndex();
        while (firstEntryIndex >= 0) {
            createHashFloodingResistantDelegate.put(key(firstEntryIndex), value(firstEntryIndex));
            firstEntryIndex = getSuccessor(firstEntryIndex);
        }
        this.table = createHashFloodingResistantDelegate;
        this.entries = null;
        this.keys = null;
        this.values = null;
        incrementModCount();
        return createHashFloodingResistantDelegate;
    }

    public Iterator entrySetIterator() {
        Map delegateOrNull = delegateOrNull();
        if (delegateOrNull != null) {
            return AnonymousClass000.A15(delegateOrNull);
        }
        return new C23544BlX(this, 1);
    }

    public int firstEntryIndex() {
        if (isEmpty()) {
            return -1;
        }
        return 0;
    }

    public Object get(Object obj) {
        Map delegateOrNull = delegateOrNull();
        if (delegateOrNull != null) {
            return delegateOrNull.get(obj);
        }
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return null;
        }
        return value(indexOf);
    }

    public boolean isEmpty() {
        return AnonymousClass000.A1P(size());
    }

    public Iterator keySetIterator() {
        Map delegateOrNull = delegateOrNull();
        if (delegateOrNull != null) {
            return AnonymousClass8BU.A0x(delegateOrNull);
        }
        return new C23544BlX(this, 0);
    }

    public void moveLastEntry(int i, int i2) {
        int i3;
        int i4;
        Object requireTable = requireTable();
        int[] requireEntries = requireEntries();
        Object[] requireKeys = requireKeys();
        Object[] requireValues = requireValues();
        int size2 = size() - 1;
        if (i < size2) {
            Object obj = requireKeys[size2];
            requireKeys[i] = obj;
            requireValues[i] = requireValues[size2];
            requireKeys[size2] = null;
            requireValues[size2] = null;
            requireEntries[i] = requireEntries[size2];
            requireEntries[size2] = 0;
            int smearedHash = AnonymousClass111.smearedHash(obj) & i2;
            int tableGet = C26271CwI.tableGet(requireTable, smearedHash);
            int i5 = size2 + 1;
            if (tableGet == i5) {
                C26271CwI.tableSet(requireTable, smearedHash, i + 1);
                return;
            }
            do {
                i3 = tableGet - 1;
                i4 = requireEntries[i3];
                tableGet = C26271CwI.getNext(i4, i2);
            } while (tableGet != i5);
            requireEntries[i3] = C26271CwI.maskCombine(i4, i + 1, i2);
            return;
        }
        requireKeys[i] = null;
        requireValues[i] = null;
        requireEntries[i] = 0;
    }

    public Object remove(Object obj) {
        Map delegateOrNull = delegateOrNull();
        if (delegateOrNull != null) {
            return delegateOrNull.remove(obj);
        }
        Object removeHelper = removeHelper(obj);
        if (removeHelper == NOT_FOUND) {
            return null;
        }
        return removeHelper;
    }

    public void resizeEntries(int i) {
        this.entries = Arrays.copyOf(requireEntries(), i);
        this.keys = Arrays.copyOf(requireKeys(), i);
        this.values = Arrays.copyOf(requireValues(), i);
    }

    public int size() {
        Map delegateOrNull = delegateOrNull();
        if (delegateOrNull != null) {
            return delegateOrNull.size();
        }
        return this.size;
    }

    public Iterator valuesIterator() {
        Map delegateOrNull = delegateOrNull();
        if (delegateOrNull != null) {
            return C17890vO.A0l(delegateOrNull);
        }
        return new C23544BlX(this, 2);
    }
}
