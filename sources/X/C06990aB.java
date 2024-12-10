package X;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.0aB  reason: invalid class name and case insensitive filesystem */
public final class C06990aB<T> implements Set<T>, C18450wR {
    public int A00;
    public Object[] A01 = new Object[16];

    public boolean contains(Object obj) {
        return obj != null && A00(obj) >= 0;
    }

    public boolean containsAll(Collection collection) {
        if (collection == null || !collection.isEmpty()) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean remove(Object obj) {
        if (obj != null) {
            int A002 = A00(obj);
            Object[] objArr = this.A01;
            int size = size();
            if (A002 >= 0) {
                if (A002 < size - 1) {
                    C200310o.A07(objArr, A002, objArr, A002 + 1, size);
                }
                objArr[size - 1] = null;
                this.A00 = size() - 1;
                return true;
            }
        }
        return false;
    }

    public Object[] toArray() {
        return C25916Coa.A00(this);
    }

    public Object[] toArray(Object[] objArr) {
        return C25916Coa.A01(this, objArr);
    }

    public final void clear() {
        Object[] objArr = this.A01;
        Arrays.fill(objArr, 0, objArr.length, (Object) null);
        this.A00 = 0;
    }

    public Iterator iterator() {
        return new C06750Zn(this);
    }

    public String toString() {
        return C29431cG.A0g(", ", "[", "]", this, C12020l5.A00);
    }

    private final int A00(Object obj) {
        int i;
        int size = size();
        int i2 = size - 1;
        int identityHashCode = System.identityHashCode(obj);
        Object[] objArr = this.A01;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            Object obj2 = objArr[i4];
            int identityHashCode2 = System.identityHashCode(obj2);
            if (identityHashCode2 < identityHashCode) {
                i3 = i4 + 1;
            } else if (identityHashCode2 > identityHashCode) {
                i2 = i4 - 1;
            } else if (obj2 == obj) {
                return i4;
            } else {
                int i5 = i4 - 1;
                while (-1 < i5) {
                    Object obj3 = objArr[i5];
                    if (obj3 != obj) {
                        if (System.identityHashCode(obj3) != identityHashCode) {
                            break;
                        }
                        i5--;
                    } else {
                        return i5;
                    }
                }
                while (true) {
                    i4++;
                    if (i4 >= size) {
                        i = size + 1;
                        break;
                    }
                    Object obj4 = objArr[i4];
                    if (obj4 != obj) {
                        if (System.identityHashCode(obj4) != identityHashCode) {
                            i = i4 + 1;
                            break;
                        }
                    } else {
                        return i4;
                    }
                }
                return -i;
            }
        }
        return -(i3 + 1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0044, code lost:
        if (java.lang.System.identityHashCode(r10[r8 - 1]) < java.lang.System.identityHashCode(r9[0])) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x008c, code lost:
        r2 = r11;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0073 A[LOOP:2: B:28:0x0073->B:42:0x00a7, LOOP_START, PHI: r11 
      PHI: (r11v3 int) = (r11v2 int), (r11v5 int) binds: [B:24:0x0064, B:42:0x00a7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00b2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(java.util.Collection r14) {
        /*
            r13 = this;
            boolean r0 = r14.isEmpty()
            if (r0 != 0) goto L_0x00c1
            boolean r0 = r14 instanceof X.C06990aB
            if (r0 != 0) goto L_0x001c
            java.util.Iterator r1 = r14.iterator()
        L_0x000e:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00c1
            java.lang.Object r0 = r1.next()
            r13.add(r0)
            goto L_0x000e
        L_0x001c:
            java.lang.Object[] r10 = r13.A01
            X.0aB r14 = (X.C06990aB) r14
            java.lang.Object[] r9 = r14.A01
            int r8 = r13.size()
            int r11 = r14.size()
            int r7 = r8 + r11
            int r0 = r10.length
            r6 = 0
            r4 = 1
            boolean r3 = X.AnonymousClass000.A1U(r0, r7)
            if (r8 == 0) goto L_0x0046
            int r0 = r8 + -1
            r0 = r10[r0]
            int r2 = java.lang.System.identityHashCode(r0)
            r0 = r9[r6]
            int r1 = java.lang.System.identityHashCode(r0)
            r0 = 0
            if (r2 >= r1) goto L_0x0047
        L_0x0046:
            r0 = 1
        L_0x0047:
            if (r3 != 0) goto L_0x0056
            if (r0 == 0) goto L_0x005f
            X.C200310o.A07(r9, r8, r10, r6, r11)
            int r0 = r13.size()
            int r0 = r0 + r11
        L_0x0053:
            r13.A00 = r0
            return
        L_0x0056:
            int r0 = r11 * 2
            if (r8 <= r11) goto L_0x005c
            int r0 = r8 * 2
        L_0x005c:
            java.lang.Object[] r5 = new java.lang.Object[r0]
            goto L_0x0060
        L_0x005f:
            r5 = r10
        L_0x0060:
            int r8 = r8 - r4
            int r11 = r11 - r4
            int r12 = r7 + -1
        L_0x0064:
            if (r8 >= 0) goto L_0x0073
            if (r11 < 0) goto L_0x00b0
            int r2 = r11 + -1
            r1 = r9[r11]
        L_0x006c:
            int r0 = r12 + -1
            r5[r12] = r1
            r11 = r2
            r12 = r0
            goto L_0x0064
        L_0x0073:
            if (r11 >= 0) goto L_0x007c
            int r0 = r8 + -1
            r1 = r10[r8]
            r2 = r11
            r8 = r0
            goto L_0x006c
        L_0x007c:
            r1 = r10[r8]
            r4 = r9[r11]
            int r0 = java.lang.System.identityHashCode(r1)
            int r3 = java.lang.System.identityHashCode(r4)
            if (r0 <= r3) goto L_0x008e
            int r8 = r8 + -1
        L_0x008c:
            r2 = r11
            goto L_0x006c
        L_0x008e:
            if (r0 < r3) goto L_0x00ac
            if (r1 != r4) goto L_0x0097
            int r8 = r8 + -1
            int r11 = r11 + -1
            goto L_0x008c
        L_0x0097:
            int r0 = r8 + -1
        L_0x0099:
            if (r0 < 0) goto L_0x00ac
            int r2 = r0 + -1
            r1 = r10[r0]
            int r0 = java.lang.System.identityHashCode(r1)
            if (r0 != r3) goto L_0x00ac
            if (r4 != r1) goto L_0x00aa
            int r11 = r11 + -1
            goto L_0x0073
        L_0x00aa:
            r0 = r2
            goto L_0x0099
        L_0x00ac:
            int r2 = r11 + -1
            r1 = r4
            goto L_0x006c
        L_0x00b0:
            if (r12 < 0) goto L_0x00b7
            int r0 = r12 + 1
            X.C200310o.A07(r5, r6, r5, r0, r7)
        L_0x00b7:
            int r0 = r12 + 1
            int r0 = r7 - r0
            X.C200310o.A06(r5, r0, r7)
            r13.A01 = r5
            goto L_0x0053
        L_0x00c1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06990aB.A02(java.util.Collection):void");
    }

    public final boolean A03() {
        return AnonymousClass000.A1R(size());
    }

    public final Object[] A04() {
        return this.A01;
    }

    public final boolean add(Object obj) {
        int i;
        int size = size();
        Object[] objArr = this.A01;
        if (size > 0) {
            i = A00(obj);
            if (i >= 0) {
                return false;
            }
        } else {
            i = -1;
        }
        int i2 = -(i + 1);
        int length = objArr.length;
        if (size == length) {
            Object[] objArr2 = new Object[(length * 2)];
            C200310o.A07(objArr, i2 + 1, objArr2, i2, size);
            C200310o.A07(objArr, 0, objArr2, 0, i2);
            this.A01 = objArr2;
        } else {
            C200310o.A07(objArr, i2 + 1, objArr, i2, size);
        }
        this.A01[i2] = obj;
        this.A00 = size() + 1;
        return true;
    }

    public boolean addAll(Collection collection) {
        throw AnonymousClass000.A12();
    }

    public boolean isEmpty() {
        return AnonymousClass000.A1P(size());
    }

    public boolean removeAll(Collection collection) {
        throw AnonymousClass000.A12();
    }

    public boolean retainAll(Collection collection) {
        throw AnonymousClass000.A12();
    }

    public final /* bridge */ int size() {
        return this.A00;
    }
}
