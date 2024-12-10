package X;

import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class DVM<K, V> implements Map<K, V>, Serializable, C41611wl {
    public static final DVM A00;
    public C27355DcR entriesView;
    public int[] hashArray;
    public int hashShift;
    public boolean isReadOnly;
    public Object[] keysArray;
    public C27357DcT keysView;
    public int length;
    public int maxProbeDistance;
    public int modCount;
    public int[] presenceArray;
    public int size;
    public Object[] valuesArray;
    public C27351DcN valuesView;

    static {
        DVM dvm = new DVM(0);
        dvm.isReadOnly = true;
        A00 = dvm;
    }

    public final boolean A06(Map.Entry entry) {
        C18070vi.A0d(entry, 0);
        int A002 = A00(entry.getKey(), this);
        if (A002 < 0) {
            return false;
        }
        Object[] objArr = this.valuesArray;
        C18070vi.A0b(objArr);
        return C18070vi.A18(objArr[A002], entry.getValue());
    }

    public void putAll(Map map) {
        C18070vi.A0d(map, 0);
        A05();
        Set entrySet = map.entrySet();
        if (!entrySet.isEmpty()) {
            A01(entrySet.size());
            Iterator it = entrySet.iterator();
            while (it.hasNext()) {
                Map.Entry A16 = AnonymousClass000.A16(it);
                int A04 = A04(A16.getKey());
                Object[] objArr = this.valuesArray;
                if (objArr == null) {
                    objArr = new Object[this.keysArray.length];
                    this.valuesArray = objArr;
                }
                if (A04 >= 0) {
                    objArr[A04] = A16.getValue();
                } else {
                    int i = (-A04) - 1;
                    if (!C18070vi.A18(A16.getValue(), objArr[i])) {
                        objArr[i] = A16.getValue();
                    }
                }
            }
        }
    }

    public DVM(int i) {
        if (i >= 0) {
            Object[] objArr = new Object[i];
            int[] iArr = new int[i];
            int highestOneBit = Integer.highestOneBit((i < 1 ? 1 : i) * 3);
            this.keysArray = objArr;
            this.valuesArray = null;
            this.presenceArray = iArr;
            this.hashArray = new int[highestOneBit];
            this.maxProbeDistance = 2;
            this.length = 0;
            this.hashShift = Integer.numberOfLeadingZeros(highestOneBit) + 1;
            return;
        }
        throw AnonymousClass000.A0k("capacity must be non-negative.");
    }

    private final void A01(int i) {
        Object[] objArr;
        Object[] objArr2 = this.keysArray;
        int length2 = objArr2.length;
        int i2 = this.length;
        int i3 = length2 - i2;
        int size2 = i2 - size();
        if (i3 >= i || i3 + size2 < i || size2 < length2 / 4) {
            int i4 = i2 + i;
            if (i4 < 0) {
                throw new OutOfMemoryError();
            } else if (i4 > length2) {
                int A002 = C29761cp.A00(length2, i4);
                Object[] copyOf = Arrays.copyOf(objArr2, A002);
                C18070vi.A0X(copyOf);
                this.keysArray = copyOf;
                Object[] objArr3 = this.valuesArray;
                if (objArr3 != null) {
                    objArr = Arrays.copyOf(objArr3, A002);
                    C18070vi.A0X(objArr);
                } else {
                    objArr = null;
                }
                this.valuesArray = objArr;
                int[] copyOf2 = Arrays.copyOf(this.presenceArray, A002);
                C18070vi.A0X(copyOf2);
                this.presenceArray = copyOf2;
                if (A002 < 1) {
                    A002 = 1;
                }
                int highestOneBit = Integer.highestOneBit(A002 * 3);
                if (highestOneBit > this.hashArray.length) {
                    A02(highestOneBit);
                }
            }
        } else {
            A02(this.hashArray.length);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0069, code lost:
        r2[r4] = r6 + 1;
        r7.presenceArray[r6] = r4;
        r6 = r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A02(int r8) {
        /*
            r7 = this;
            int r0 = r7.modCount
            int r0 = r0 + 1
            r7.modCount = r0
            int r5 = r7.length
            int r0 = r7.size()
            if (r5 <= r0) goto L_0x0039
            java.lang.Object[] r4 = r7.valuesArray
            r3 = 0
            r2 = 0
        L_0x0012:
            if (r3 >= r5) goto L_0x002b
            int[] r0 = r7.presenceArray
            r0 = r0[r3]
            if (r0 < 0) goto L_0x0028
            java.lang.Object[] r1 = r7.keysArray
            r0 = r1[r3]
            r1[r2] = r0
            if (r4 == 0) goto L_0x0026
            r0 = r4[r3]
            r4[r2] = r0
        L_0x0026:
            int r2 = r2 + 1
        L_0x0028:
            int r3 = r3 + 1
            goto L_0x0012
        L_0x002b:
            java.lang.Object[] r0 = r7.keysArray
            X.C25360CeK.A01(r0, r2, r5)
            if (r4 == 0) goto L_0x0037
            int r0 = r7.length
            X.C25360CeK.A01(r4, r2, r0)
        L_0x0037:
            r7.length = r2
        L_0x0039:
            int[] r1 = r7.hashArray
            int r0 = r1.length
            r6 = 0
            if (r8 == r0) goto L_0x0087
            int[] r0 = new int[r8]
            r7.hashArray = r0
            int r0 = java.lang.Integer.numberOfLeadingZeros(r8)
            int r0 = r0 + 1
            r7.hashShift = r0
        L_0x004b:
            int r0 = r7.length
            if (r6 >= r0) goto L_0x008b
            int r5 = r6 + 1
            java.lang.Object[] r0 = r7.keysArray
            r0 = r0[r6]
            int r4 = X.AnonymousClass001.A0l(r0)
            r0 = -1640531527(0xffffffff9e3779b9, float:-9.713111E-21)
            int r4 = r4 * r0
            int r0 = r7.hashShift
            int r4 = r4 >>> r0
            int r3 = r7.maxProbeDistance
        L_0x0062:
            int[] r2 = r7.hashArray
            r0 = r2[r4]
            r1 = 1
            if (r0 != 0) goto L_0x0073
            int r0 = r6 + 1
            r2[r4] = r0
            int[] r0 = r7.presenceArray
            r0[r6] = r4
            r6 = r5
            goto L_0x004b
        L_0x0073:
            int r3 = r3 + -1
            if (r3 >= 0) goto L_0x007e
            java.lang.String r0 = "This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        L_0x007e:
            int r0 = r4 + -1
            if (r4 != 0) goto L_0x0085
            int r4 = r2.length
            int r4 = r4 - r1
            goto L_0x0062
        L_0x0085:
            r4 = r0
            goto L_0x0062
        L_0x0087:
            java.util.Arrays.fill(r1, r6, r0, r6)
            goto L_0x004b
        L_0x008b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DVM.A02(int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x003f A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A03(X.DVM r11, int r12) {
        /*
            java.lang.Object[] r2 = r11.keysArray
            r0 = 0
            X.C18070vi.A0d(r2, r0)
            r1 = 0
            r2[r12] = r1
            java.lang.Object[] r0 = r11.valuesArray
            if (r0 == 0) goto L_0x000f
            r0[r12] = r1
        L_0x000f:
            int[] r0 = r11.presenceArray
            r10 = r0[r12]
            int r0 = r11.maxProbeDistance
            int r4 = r0 * 2
            int[] r8 = r11.hashArray
            int r7 = r8.length
            int r0 = r7 / 2
            if (r4 <= r0) goto L_0x001f
            r4 = r0
        L_0x001f:
            r9 = 0
            r5 = 0
            r6 = r10
        L_0x0022:
            int r1 = r10 + -1
            r0 = r10
            r10 = r1
            if (r0 != 0) goto L_0x002a
            int r10 = r7 + -1
        L_0x002a:
            int r5 = r5 + 1
            int r0 = r11.maxProbeDistance
            if (r5 > r0) goto L_0x0078
            r3 = r8[r10]
            if (r3 == 0) goto L_0x0078
            r2 = -1
            if (r3 >= 0) goto L_0x0055
            r8[r6] = r2
        L_0x0039:
            r6 = r10
            r5 = 0
        L_0x003b:
            int r4 = r4 + -1
            if (r4 >= 0) goto L_0x0022
            r8[r6] = r2
        L_0x0041:
            int[] r1 = r11.presenceArray
            r0 = -1
            r1[r12] = r0
            int r0 = r11.size()
            int r0 = r0 + -1
            r11.size = r0
            int r0 = r11.modCount
            int r0 = r0 + 1
            r11.modCount = r0
            return
        L_0x0055:
            java.lang.Object[] r1 = r11.keysArray
            int r0 = r3 + -1
            r0 = r1[r0]
            int r1 = X.AnonymousClass001.A0l(r0)
            r0 = -1640531527(0xffffffff9e3779b9, float:-9.713111E-21)
            int r1 = r1 * r0
            int r0 = r11.hashShift
            int r1 = r1 >>> r0
            int r1 = r1 - r10
            int[] r8 = r11.hashArray
            int r7 = r8.length
            int r0 = r7 + -1
            r1 = r1 & r0
            if (r1 < r5) goto L_0x003b
            r8[r6] = r3
            int[] r1 = r11.presenceArray
            int r0 = r3 + -1
            r1[r0] = r6
            goto L_0x0039
        L_0x0078:
            r8[r6] = r9
            goto L_0x0041
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DVM.A03(X.DVM, int):void");
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.DRO, java.lang.Object] */
    private final Object writeReplace() {
        if (this.isReadOnly) {
            ? obj = new Object();
            obj.map = this;
            return obj;
        }
        throw new NotSerializableException("The map cannot be serialized while it is being built.");
    }

    public final void A05() {
        if (this.isReadOnly) {
            throw C17880vN.A0y();
        }
    }

    public boolean containsValue(Object obj) {
        int i = this.length;
        while (true) {
            i--;
            if (i < 0) {
                return false;
            }
            if (this.presenceArray[i] >= 0) {
                Object[] objArr = this.valuesArray;
                C18070vi.A0b(objArr);
                if (C18070vi.A18(objArr[i], obj)) {
                    return true;
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.DcR, java.util.Set] */
    /* JADX WARNING: type inference failed for: r0v1, types: [X.DcR, java.util.Set] */
    public final /* bridge */ Set entrySet() {
        ? r0 = this.entriesView;
        if (r0 != 0) {
            return r0;
        }
        ? dcR = new C27355DcR(this);
        this.entriesView = dcR;
        return dcR;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (size() != map.size()) {
            return false;
        }
        Set entrySet = map.entrySet();
        C18070vi.A0d(entrySet, 0);
        for (Object next : entrySet) {
            if (next == null) {
                return false;
            }
            try {
                if (!A06((Map.Entry) next)) {
                    return false;
                }
            } catch (ClassCastException unused) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        C25254Cbt cbt = new C25254Cbt(this);
        int i = 0;
        while (cbt.hasNext()) {
            int i2 = cbt.A00;
            DVM dvm = cbt.A03;
            if (i2 < dvm.length) {
                cbt.A00 = i2 + 1;
                cbt.A01 = i2;
                int i3 = 0;
                int A0l = AnonymousClass001.A0l(dvm.keysArray[i2]);
                Object[] objArr = dvm.valuesArray;
                C18070vi.A0b(objArr);
                Object obj = objArr[cbt.A01];
                if (obj != null) {
                    i3 = obj.hashCode();
                }
                cbt.A01();
                i += A0l ^ i3;
            } else {
                throw BE6.A14();
            }
        }
        return i;
    }

    public final /* bridge */ Set keySet() {
        C27357DcT dcT = this.keysView;
        if (dcT != null) {
            return dcT;
        }
        C27357DcT dcT2 = new C27357DcT(this);
        this.keysView = dcT2;
        return dcT2;
    }

    public final /* bridge */ int size() {
        return this.size;
    }

    public final /* bridge */ Collection values() {
        C27351DcN dcN = this.valuesView;
        if (dcN != null) {
            return dcN;
        }
        C27351DcN dcN2 = new C27351DcN(this);
        this.valuesView = dcN2;
        return dcN2;
    }

    public static final int A00(Object obj, DVM dvm) {
        int A0l = (AnonymousClass001.A0l(obj) * -1640531527) >>> dvm.hashShift;
        int i = dvm.maxProbeDistance;
        while (true) {
            int i2 = dvm.hashArray[A0l];
            if (i2 != 0) {
                if (i2 > 0) {
                    int i3 = i2 - 1;
                    if (C18070vi.A18(dvm.keysArray[i3], obj)) {
                        return i3;
                    }
                }
                i--;
                if (i < 0) {
                    break;
                }
                int i4 = A0l - 1;
                if (A0l == 0) {
                    A0l = dvm.hashArray.length - 1;
                } else {
                    A0l = i4;
                }
            } else {
                break;
            }
        }
        return -1;
    }

    public final int A04(Object obj) {
        A05();
        while (true) {
            int A0l = (AnonymousClass001.A0l(obj) * -1640531527) >>> this.hashShift;
            int i = this.maxProbeDistance * 2;
            int length2 = this.hashArray.length / 2;
            if (i > length2) {
                i = length2;
            }
            int i2 = 0;
            while (true) {
                int[] iArr = this.hashArray;
                int i3 = iArr[A0l];
                if (i3 <= 0) {
                    int i4 = this.length;
                    Object[] objArr = this.keysArray;
                    if (i4 >= objArr.length) {
                        A01(1);
                    } else {
                        this.length = i4 + 1;
                        objArr[i4] = obj;
                        this.presenceArray[i4] = A0l;
                        iArr[A0l] = i4 + 1;
                        this.size = size() + 1;
                        this.modCount++;
                        if (i2 > this.maxProbeDistance) {
                            this.maxProbeDistance = i2;
                        }
                        return i4;
                    }
                } else if (C18070vi.A18(this.keysArray[i3 - 1], obj)) {
                    return -i3;
                } else {
                    i2++;
                    if (i2 > i) {
                        A02(this.hashArray.length * 2);
                        break;
                    }
                    int i5 = A0l - 1;
                    if (A0l == 0) {
                        A0l = this.hashArray.length - 1;
                    } else {
                        A0l = i5;
                    }
                }
            }
        }
    }

    public void clear() {
        A05();
        int i = this.length;
        int i2 = i - 1;
        if (i2 >= 0) {
            int i3 = 0;
            while (true) {
                int[] iArr = this.presenceArray;
                int i4 = iArr[i3];
                if (i4 >= 0) {
                    this.hashArray[i4] = 0;
                    iArr[i3] = -1;
                }
                if (i3 == i2) {
                    break;
                }
                i3++;
            }
        }
        C25360CeK.A01(this.keysArray, 0, i);
        Object[] objArr = this.valuesArray;
        if (objArr != null) {
            C25360CeK.A01(objArr, 0, this.length);
        }
        this.size = 0;
        this.length = 0;
        this.modCount++;
    }

    public boolean containsKey(Object obj) {
        return AnonymousClass000.A1Q(A00(obj, this));
    }

    public Object get(Object obj) {
        int A002 = A00(obj, this);
        if (A002 < 0) {
            return null;
        }
        Object[] objArr = this.valuesArray;
        C18070vi.A0b(objArr);
        return objArr[A002];
    }

    public boolean isEmpty() {
        return AnonymousClass000.A1P(size());
    }

    public Object put(Object obj, Object obj2) {
        A05();
        int A04 = A04(obj);
        Object[] objArr = this.valuesArray;
        if (objArr == null) {
            objArr = new Object[this.keysArray.length];
            this.valuesArray = objArr;
        }
        if (A04 < 0) {
            int i = (-A04) - 1;
            Object obj3 = objArr[i];
            objArr[i] = obj2;
            return obj3;
        }
        objArr[A04] = obj2;
        return null;
    }

    public Object remove(Object obj) {
        A05();
        int A002 = A00(obj, this);
        if (A002 < 0) {
            return null;
        }
        Object[] objArr = this.valuesArray;
        C18070vi.A0b(objArr);
        Object obj2 = objArr[A002];
        A03(this, A002);
        return obj2;
    }

    public String toString() {
        StringBuilder A0t = BE6.A0t((size() * 3) + 2);
        A0t.append("{");
        C25254Cbt cbt = new C25254Cbt(this);
        int i = 0;
        while (cbt.hasNext()) {
            if (i > 0) {
                A0t.append(", ");
            }
            int i2 = cbt.A00;
            DVM dvm = cbt.A03;
            if (i2 < dvm.length) {
                cbt.A00 = i2 + 1;
                cbt.A01 = i2;
                Object obj = dvm.keysArray[i2];
                if (obj == dvm) {
                    A0t.append("(this Map)");
                } else {
                    A0t.append(obj);
                }
                A0t.append('=');
                Object[] objArr = dvm.valuesArray;
                C18070vi.A0b(objArr);
                Object obj2 = objArr[cbt.A01];
                if (obj2 == dvm) {
                    A0t.append("(this Map)");
                } else {
                    A0t.append(obj2);
                }
                cbt.A01();
                i++;
            } else {
                throw BE6.A14();
            }
        }
        String A0y = AnonymousClass000.A0y("}", A0t);
        C18070vi.A0X(A0y);
        return A0y;
    }

    public DVM() {
        this(8);
    }
}
