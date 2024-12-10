package X;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: X.Dbf  reason: case insensitive filesystem */
public class C27308Dbf<E> extends AbstractSet<E> implements Serializable {
    public transient Object[] elements;
    public transient int[] entries;
    public transient int metadata;
    public transient int size;
    public transient Object table;

    public int adjustAfterRemove(int i, int i2) {
        return i - 1;
    }

    public void init(int i) {
        this.metadata = BE8.A06(i, 1, 1073741823);
    }

    public void insertEntry(int i, Object obj, int i2, int i3) {
        setEntry(i, C26271CwI.maskCombine(i2, 0, i3));
        setElement(i, obj);
    }

    public static C27308Dbf create() {
        return new C27308Dbf();
    }

    private Set createHashFloodingResistantDelegate(int i) {
        return new LinkedHashSet(i, 1.0f);
    }

    private int hashTableMask() {
        return (1 << (this.metadata & 31)) - 1;
    }

    private Object[] requireElements() {
        Object[] objArr = this.elements;
        objArr.getClass();
        return objArr;
    }

    private int[] requireEntries() {
        int[] iArr = this.entries;
        iArr.getClass();
        return iArr;
    }

    private Object requireTable() {
        Object obj = this.table;
        obj.getClass();
        return obj;
    }

    public Set delegateOrNull() {
        Object obj = this.table;
        if (obj instanceof Set) {
            return (Set) obj;
        }
        return null;
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

    public boolean needsAllocArrays() {
        return AnonymousClass000.A1X(this.table);
    }

    public C27308Dbf() {
        init(3);
    }

    /* access modifiers changed from: private */
    public Object element(int i) {
        return requireElements()[i];
    }

    private int entry(int i) {
        return requireEntries()[i];
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        if (readInt >= 0) {
            init(readInt);
            for (int i = 0; i < readInt; i++) {
                add(objectInputStream.readObject());
            }
            return;
        }
        throw new InvalidObjectException(AnonymousClass001.A1I("Invalid size: ", AnonymousClass000.A10(), readInt));
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

    private void setElement(int i, Object obj) {
        requireElements()[i] = obj;
    }

    private void setEntry(int i, int i2) {
        requireEntries()[i] = i2;
    }

    private void setHashTableMask(int i) {
        this.metadata = C26271CwI.maskCombine(this.metadata, 32 - Integer.numberOfLeadingZeros(i), 31);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Iterator it = iterator();
        while (it.hasNext()) {
            objectOutputStream.writeObject(it.next());
        }
    }

    public boolean add(Object obj) {
        if (needsAllocArrays()) {
            allocArrays();
        }
        Set delegateOrNull = delegateOrNull();
        if (delegateOrNull == null) {
            int[] requireEntries = requireEntries();
            Object[] requireElements = requireElements();
            int i = this.size;
            int i2 = i + 1;
            int smearedHash = AnonymousClass111.smearedHash(obj);
            int hashTableMask = hashTableMask();
            int i3 = smearedHash & hashTableMask;
            int tableGet = C26271CwI.tableGet(requireTable(), i3);
            if (tableGet == 0) {
                if (i2 <= hashTableMask) {
                    C26271CwI.tableSet(requireTable(), i3, i + 1);
                }
                hashTableMask = resizeTable(hashTableMask, C26271CwI.newCapacity(hashTableMask), smearedHash, i);
            } else {
                int hashPrefix = C26271CwI.getHashPrefix(smearedHash, hashTableMask);
                int i4 = 0;
                while (true) {
                    int i5 = tableGet - 1;
                    int i6 = requireEntries[i5];
                    if (C26271CwI.getHashPrefix(i6, hashTableMask) == hashPrefix && C24604CBi.A00(obj, requireElements[i5])) {
                        return false;
                    }
                    int next = C26271CwI.getNext(i6, hashTableMask);
                    i4++;
                    if (next != 0) {
                        tableGet = next;
                    } else if (i4 >= 9) {
                        delegateOrNull = convertToHashFloodingResistantImplementation();
                    } else if (i2 <= hashTableMask) {
                        requireEntries[i5] = C26271CwI.maskCombine(i6, i + 1, hashTableMask);
                    }
                }
                hashTableMask = resizeTable(hashTableMask, C26271CwI.newCapacity(hashTableMask), smearedHash, i);
            }
            resizeMeMaybe(i2);
            insertEntry(i, obj, smearedHash, hashTableMask);
            this.size = i2;
            incrementModCount();
            return true;
        }
        return delegateOrNull.add(obj);
    }

    public int allocArrays() {
        C199610h.A08(needsAllocArrays(), "Arrays already allocated");
        int i = this.metadata;
        int tableSize = C26271CwI.tableSize(i);
        this.table = C26271CwI.createTable(tableSize);
        setHashTableMask(tableSize - 1);
        this.entries = new int[i];
        this.elements = new Object[i];
        return i;
    }

    public void clear() {
        if (!needsAllocArrays()) {
            incrementModCount();
            Set delegateOrNull = delegateOrNull();
            if (delegateOrNull != null) {
                this.metadata = BE8.A06(size(), 3, 1073741823);
                delegateOrNull.clear();
                this.table = null;
            } else {
                Arrays.fill(requireElements(), 0, this.size, (Object) null);
                C26271CwI.tableClear(requireTable());
                Arrays.fill(requireEntries(), 0, this.size, 0);
            }
            this.size = 0;
        }
    }

    public boolean contains(Object obj) {
        if (!needsAllocArrays()) {
            Set delegateOrNull = delegateOrNull();
            if (delegateOrNull != null) {
                return delegateOrNull.contains(obj);
            }
            int smearedHash = AnonymousClass111.smearedHash(obj);
            int hashTableMask = hashTableMask();
            int tableGet = C26271CwI.tableGet(requireTable(), smearedHash & hashTableMask);
            if (tableGet != 0) {
                int hashPrefix = C26271CwI.getHashPrefix(smearedHash, hashTableMask);
                do {
                    int i = tableGet - 1;
                    int entry = entry(i);
                    if (C26271CwI.getHashPrefix(entry, hashTableMask) == hashPrefix && C24604CBi.A00(obj, element(i))) {
                        return true;
                    }
                    tableGet = C26271CwI.getNext(entry, hashTableMask);
                } while (tableGet != 0);
            }
        }
        return false;
    }

    public Set convertToHashFloodingResistantImplementation() {
        Set createHashFloodingResistantDelegate = createHashFloodingResistantDelegate(hashTableMask() + 1);
        int firstEntryIndex = firstEntryIndex();
        while (firstEntryIndex >= 0) {
            createHashFloodingResistantDelegate.add(element(firstEntryIndex));
            firstEntryIndex = getSuccessor(firstEntryIndex);
        }
        this.table = createHashFloodingResistantDelegate;
        this.entries = null;
        this.elements = null;
        incrementModCount();
        return createHashFloodingResistantDelegate;
    }

    public int firstEntryIndex() {
        if (isEmpty()) {
            return -1;
        }
        return 0;
    }

    public boolean isEmpty() {
        return AnonymousClass000.A1P(size());
    }

    public Iterator iterator() {
        Set delegateOrNull = delegateOrNull();
        if (delegateOrNull != null) {
            return delegateOrNull.iterator();
        }
        return new DV4(this);
    }

    public void moveLastEntry(int i, int i2) {
        int i3;
        int i4;
        Object requireTable = requireTable();
        int[] requireEntries = requireEntries();
        Object[] requireElements = requireElements();
        int A0Q = AnonymousClass000.A0Q(this);
        if (i < A0Q) {
            Object obj = requireElements[A0Q];
            requireElements[i] = obj;
            requireElements[A0Q] = null;
            requireEntries[i] = requireEntries[A0Q];
            requireEntries[A0Q] = 0;
            int smearedHash = AnonymousClass111.smearedHash(obj) & i2;
            int tableGet = C26271CwI.tableGet(requireTable, smearedHash);
            int i5 = A0Q + 1;
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
        requireElements[i] = null;
        requireEntries[i] = 0;
    }

    public boolean remove(Object obj) {
        if (!needsAllocArrays()) {
            Set delegateOrNull = delegateOrNull();
            Object obj2 = obj;
            if (delegateOrNull != null) {
                return delegateOrNull.remove(obj);
            }
            int hashTableMask = hashTableMask();
            int remove = C26271CwI.remove(obj2, (Object) null, hashTableMask, requireTable(), requireEntries(), requireElements(), (Object[]) null);
            if (remove != -1) {
                moveLastEntry(remove, hashTableMask);
                this.size--;
                incrementModCount();
                return true;
            }
        }
        return false;
    }

    public void resizeEntries(int i) {
        this.entries = Arrays.copyOf(requireEntries(), i);
        this.elements = Arrays.copyOf(requireElements(), i);
    }

    public int size() {
        Set delegateOrNull = delegateOrNull();
        if (delegateOrNull != null) {
            return delegateOrNull.size();
        }
        return this.size;
    }

    public Object[] toArray(Object[] objArr) {
        if (needsAllocArrays()) {
            if (objArr.length > 0) {
                objArr[0] = null;
            }
            return objArr;
        }
        Set delegateOrNull = delegateOrNull();
        if (delegateOrNull != null) {
            return delegateOrNull.toArray(objArr);
        }
        return AnonymousClass1HW.toArrayImpl(requireElements(), 0, this.size, objArr);
    }

    public Object[] toArray() {
        if (needsAllocArrays()) {
            return BE6.A1Z();
        }
        Set delegateOrNull = delegateOrNull();
        if (delegateOrNull != null) {
            return delegateOrNull.toArray();
        }
        return Arrays.copyOf(requireElements(), this.size);
    }
}
