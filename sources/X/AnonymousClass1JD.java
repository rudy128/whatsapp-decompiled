package X;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.1JD  reason: invalid class name */
public final class AnonymousClass1JD<E> extends AnonymousClass1JC<E> {
    public static final Object[] A03 = new Object[0];
    public int A00;
    public int A01;
    public Object[] A02 = A03;

    private final void A01(int i, int i2) {
        Object[] objArr = this.A02;
        if (i < i2) {
            C200310o.A06(objArr, i, i2);
            return;
        }
        Arrays.fill(objArr, i, objArr.length, (Object) null);
        C200310o.A06(this.A02, 0, i2);
    }

    public boolean addAll(Collection collection) {
        C18070vi.A0d(collection, 0);
        if (collection.isEmpty()) {
            return false;
        }
        this.modCount++;
        A00(size() + collection.size());
        int size = this.A00 + size();
        int length = this.A02.length;
        if (size >= length) {
            size -= length;
        }
        A02(collection, size);
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r4v2 */
    /* JADX WARNING: type inference failed for: r4v3 */
    /* JADX WARNING: type inference failed for: r4v6, types: [int] */
    /* JADX WARNING: type inference failed for: r4v7 */
    /* JADX WARNING: type inference failed for: r4v9 */
    /* JADX WARNING: type inference failed for: r4v11 */
    /* JADX WARNING: type inference failed for: r4v12 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean removeAll(java.util.Collection r11) {
        /*
            r10 = this;
            r0 = 0
            X.C18070vi.A0d(r11, r0)
            boolean r0 = r10.isEmpty()
            r4 = 0
            if (r0 != 0) goto L_0x0098
            java.lang.Object[] r0 = r10.A02
            int r0 = r0.length
            if (r0 == 0) goto L_0x0098
            int r5 = r10.A00
            int r0 = r10.size()
            int r5 = r5 + r0
            java.lang.Object[] r0 = r10.A02
            int r9 = r0.length
            if (r5 < r9) goto L_0x001d
            int r5 = r5 - r9
        L_0x001d:
            int r6 = r10.A00
            r8 = 0
            r3 = r6
            if (r6 < r5) goto L_0x0068
            r7 = 0
        L_0x0024:
            java.lang.Object[] r0 = r10.A02
            if (r6 >= r9) goto L_0x0040
            r2 = r0[r6]
            r0[r6] = r8
            boolean r0 = r11.contains(r2)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x003e
            java.lang.Object[] r1 = r10.A02
            int r0 = r3 + 1
            r1[r3] = r2
            r3 = r0
        L_0x003b:
            int r6 = r6 + 1
            goto L_0x0024
        L_0x003e:
            r7 = 1
            goto L_0x003b
        L_0x0040:
            int r0 = r0.length
            if (r3 < r0) goto L_0x0044
            int r3 = r3 - r0
        L_0x0044:
            if (r4 >= r5) goto L_0x0066
            java.lang.Object[] r0 = r10.A02
            r1 = r0[r4]
            r0[r4] = r8
            boolean r0 = r11.contains(r1)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0064
            java.lang.Object[] r0 = r10.A02
            r0[r3] = r1
            int r0 = r0.length
            int r1 = r0 + -1
            r0 = r3
            int r3 = r3 + 1
            if (r0 != r1) goto L_0x0061
            r3 = 0
        L_0x0061:
            int r4 = r4 + 1
            goto L_0x0044
        L_0x0064:
            r7 = 1
            goto L_0x0061
        L_0x0066:
            r4 = r7
            goto L_0x0085
        L_0x0068:
            java.lang.Object[] r0 = r10.A02
            if (r6 >= r5) goto L_0x0082
            r2 = r0[r6]
            boolean r0 = r11.contains(r2)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0080
            java.lang.Object[] r1 = r10.A02
            int r0 = r3 + 1
            r1[r3] = r2
            r3 = r0
        L_0x007d:
            int r6 = r6 + 1
            goto L_0x0068
        L_0x0080:
            r4 = 1
            goto L_0x007d
        L_0x0082:
            X.C200310o.A06(r0, r3, r5)
        L_0x0085:
            if (r4 == 0) goto L_0x0098
            int r0 = r10.modCount
            int r0 = r0 + 1
            r10.modCount = r0
            int r0 = r10.A00
            int r3 = r3 - r0
            if (r3 >= 0) goto L_0x0096
            java.lang.Object[] r0 = r10.A02
            int r0 = r0.length
            int r3 = r3 + r0
        L_0x0096:
            r10.A01 = r3
        L_0x0098:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1JD.removeAll(java.util.Collection):boolean");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r4v2 */
    /* JADX WARNING: type inference failed for: r4v3 */
    /* JADX WARNING: type inference failed for: r4v6, types: [int] */
    /* JADX WARNING: type inference failed for: r4v7 */
    /* JADX WARNING: type inference failed for: r4v9 */
    /* JADX WARNING: type inference failed for: r4v11 */
    /* JADX WARNING: type inference failed for: r4v12 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean retainAll(java.util.Collection r11) {
        /*
            r10 = this;
            r0 = 0
            X.C18070vi.A0d(r11, r0)
            boolean r0 = r10.isEmpty()
            r4 = 0
            if (r0 != 0) goto L_0x0092
            java.lang.Object[] r0 = r10.A02
            int r0 = r0.length
            if (r0 == 0) goto L_0x0092
            int r5 = r10.A00
            int r0 = r10.size()
            int r5 = r5 + r0
            java.lang.Object[] r0 = r10.A02
            int r9 = r0.length
            if (r5 < r9) goto L_0x001d
            int r5 = r5 - r9
        L_0x001d:
            int r6 = r10.A00
            r8 = 0
            r3 = r6
            if (r6 < r5) goto L_0x0064
            r7 = 0
        L_0x0024:
            java.lang.Object[] r0 = r10.A02
            if (r6 >= r9) goto L_0x003e
            r2 = r0[r6]
            r0[r6] = r8
            boolean r0 = r11.contains(r2)
            if (r0 == 0) goto L_0x003c
            java.lang.Object[] r1 = r10.A02
            int r0 = r3 + 1
            r1[r3] = r2
            r3 = r0
        L_0x0039:
            int r6 = r6 + 1
            goto L_0x0024
        L_0x003c:
            r7 = 1
            goto L_0x0039
        L_0x003e:
            int r0 = r0.length
            if (r3 < r0) goto L_0x0042
            int r3 = r3 - r0
        L_0x0042:
            if (r4 >= r5) goto L_0x0062
            java.lang.Object[] r0 = r10.A02
            r1 = r0[r4]
            r0[r4] = r8
            boolean r0 = r11.contains(r1)
            if (r0 == 0) goto L_0x0060
            java.lang.Object[] r0 = r10.A02
            r0[r3] = r1
            int r0 = r0.length
            int r1 = r0 + -1
            r0 = r3
            int r3 = r3 + 1
            if (r0 != r1) goto L_0x005d
            r3 = 0
        L_0x005d:
            int r4 = r4 + 1
            goto L_0x0042
        L_0x0060:
            r7 = 1
            goto L_0x005d
        L_0x0062:
            r4 = r7
            goto L_0x007f
        L_0x0064:
            java.lang.Object[] r0 = r10.A02
            if (r6 >= r5) goto L_0x007c
            r2 = r0[r6]
            boolean r0 = r11.contains(r2)
            if (r0 == 0) goto L_0x007a
            java.lang.Object[] r1 = r10.A02
            int r0 = r3 + 1
            r1[r3] = r2
            r3 = r0
        L_0x0077:
            int r6 = r6 + 1
            goto L_0x0064
        L_0x007a:
            r4 = 1
            goto L_0x0077
        L_0x007c:
            X.C200310o.A06(r0, r3, r5)
        L_0x007f:
            if (r4 == 0) goto L_0x0092
            int r0 = r10.modCount
            int r0 = r0 + 1
            r10.modCount = r0
            int r0 = r10.A00
            int r3 = r3 - r0
            if (r3 >= 0) goto L_0x0090
            java.lang.Object[] r0 = r10.A02
            int r0 = r0.length
            int r3 = r3 + r0
        L_0x0090:
            r10.A01 = r3
        L_0x0092:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1JD.retainAll(java.util.Collection):boolean");
    }

    public Object[] toArray(Object[] objArr) {
        C18070vi.A0d(objArr, 0);
        if (objArr.length < size()) {
            Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), size());
            C18070vi.A0z(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            objArr = (Object[]) newInstance;
        }
        int size = this.A00 + size();
        Object[] objArr2 = this.A02;
        int length = objArr2.length;
        if (size >= length) {
            size -= length;
        }
        int i = this.A00;
        if (i < size) {
            C200310o.A07(objArr2, 0, objArr, i, size);
        } else if (!isEmpty()) {
            Object[] objArr3 = this.A02;
            C200310o.A07(objArr3, 0, objArr, this.A00, objArr3.length);
            Object[] objArr4 = this.A02;
            C200310o.A07(objArr4, objArr4.length - this.A00, objArr, 0, size);
        }
        int size2 = size();
        C18070vi.A0d(objArr, 1);
        if (size2 < objArr.length) {
            objArr[size2] = null;
        }
        return objArr;
    }

    private final void A00(int i) {
        if (i >= 0) {
            Object[] objArr = this.A02;
            int length = objArr.length;
            if (i <= length) {
                return;
            }
            if (objArr == A03) {
                if (i < 10) {
                    i = 10;
                }
                this.A02 = new Object[i];
                return;
            }
            Object[] objArr2 = new Object[C29761cp.A00(length, i)];
            C200310o.A07(objArr, 0, objArr2, this.A00, length);
            Object[] objArr3 = this.A02;
            int length2 = objArr3.length;
            int i2 = this.A00;
            C200310o.A07(objArr3, length2 - i2, objArr2, 0, i2);
            this.A00 = 0;
            this.A02 = objArr2;
            return;
        }
        throw new IllegalStateException("Deque is too big.");
    }

    public final void addFirst(Object obj) {
        this.modCount++;
        A00(size() + 1);
        int i = this.A00;
        if (i == 0) {
            Object[] objArr = this.A02;
            C18070vi.A0d(objArr, 0);
            i = objArr.length;
        }
        int i2 = i - 1;
        this.A00 = i2;
        this.A02[i2] = obj;
        this.A01 = size() + 1;
    }

    public final void addLast(Object obj) {
        this.modCount++;
        A00(size() + 1);
        Object[] objArr = this.A02;
        int size = this.A00 + size();
        int length = this.A02.length;
        if (size >= length) {
            size -= length;
        }
        objArr[size] = obj;
        this.A01 = size() + 1;
    }

    public int indexOf(Object obj) {
        int size = this.A00 + size();
        int length = this.A02.length;
        if (size >= length) {
            size -= length;
        }
        int i = this.A00;
        if (i < size) {
            while (i < size) {
                if (!C18070vi.A18(obj, this.A02[i])) {
                    i++;
                }
            }
            return -1;
        }
        while (true) {
            if (i < length) {
                if (C18070vi.A18(obj, this.A02[i])) {
                    break;
                }
                i++;
            } else {
                int i2 = 0;
                while (i2 < size) {
                    if (C18070vi.A18(obj, this.A02[i2])) {
                        i = i2 + this.A02.length;
                    } else {
                        i2++;
                    }
                }
                return -1;
            }
        }
        return i - this.A00;
    }

    public int lastIndexOf(Object obj) {
        int i;
        int size = this.A00 + size();
        int length = this.A02.length;
        if (size >= length) {
            size -= length;
        }
        int i2 = this.A00;
        if (i2 < size) {
            i = size - 1;
            if (i2 <= i) {
                while (!C18070vi.A18(obj, this.A02[i])) {
                    if (i != i2) {
                        i--;
                    }
                }
            }
            return -1;
        }
        if (i2 > size) {
            while (true) {
                size--;
                if (-1 < size) {
                    if (C18070vi.A18(obj, this.A02[size])) {
                        i = size + this.A02.length;
                        break;
                    }
                } else {
                    Object[] objArr = this.A02;
                    C18070vi.A0d(objArr, 0);
                    int length2 = objArr.length - 1;
                    int i3 = this.A00;
                    if (i3 <= length2) {
                        while (!C18070vi.A18(obj, this.A02[i])) {
                            if (i != i3) {
                                length2 = i - 1;
                            }
                        }
                    }
                }
            }
        }
        return -1;
        return i - this.A00;
    }

    private final void A02(Collection collection, int i) {
        Iterator it = collection.iterator();
        int length = this.A02.length;
        while (i < length && it.hasNext()) {
            this.A02[i] = it.next();
            i++;
        }
        int i2 = this.A00;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.A02[i3] = it.next();
        }
        this.A01 = size() + collection.size();
    }

    public Object A0S(int i) {
        C29761cp.A02(i, size());
        if (i == size() - 1) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        this.modCount++;
        int i2 = this.A00 + i;
        Object[] objArr = this.A02;
        int length = objArr.length;
        if (i2 >= length) {
            i2 -= length;
        }
        Object obj = objArr[i2];
        int size = size() >> 1;
        int i3 = this.A00;
        if (i < size) {
            if (i2 >= i3) {
                Object[] objArr2 = this.A02;
                C200310o.A07(objArr2, i3 + 1, objArr2, i3, i2);
            } else {
                Object[] objArr3 = this.A02;
                C200310o.A07(objArr3, 1, objArr3, 0, i2);
                Object[] objArr4 = this.A02;
                int length2 = objArr4.length - 1;
                objArr4[0] = objArr4[length2];
                int i4 = this.A00;
                System.arraycopy(objArr4, i4, objArr4, i4 + 1, length2 - i4);
            }
            Object[] objArr5 = this.A02;
            int i5 = this.A00;
            objArr5[i5] = null;
            int length3 = objArr5.length - 1;
            int i6 = i5 + 1;
            if (i5 == length3) {
                i6 = 0;
            }
            this.A00 = i6;
        } else {
            int size2 = i3 + (size() - 1);
            Object[] objArr6 = this.A02;
            int length4 = objArr6.length;
            if (size2 >= length4) {
                size2 -= length4;
            }
            if (i2 <= size2) {
                int i7 = i2 + 1;
                System.arraycopy(objArr6, i7, objArr6, i2, (size2 + 1) - i7);
            } else {
                int i8 = i2 + 1;
                System.arraycopy(objArr6, i8, objArr6, i2, length4 - i8);
                Object[] objArr7 = this.A02;
                objArr7[objArr7.length - 1] = objArr7[0];
                System.arraycopy(objArr7, 1, objArr7, 0, (size2 + 1) - 1);
            }
            this.A02[size2] = null;
        }
        this.A01 = size() - 1;
        return obj;
    }

    public final Object A0T() {
        if (!isEmpty()) {
            return this.A02[this.A00];
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public final Object A0U() {
        if (!isEmpty()) {
            Object[] objArr = this.A02;
            int size = this.A00 + (size() - 1);
            int length = this.A02.length;
            if (size >= length) {
                size -= length;
            }
            return objArr[size];
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public final Object A0V() {
        if (isEmpty()) {
            return null;
        }
        Object[] objArr = this.A02;
        int size = this.A00 + (size() - 1);
        int length = this.A02.length;
        if (size >= length) {
            size -= length;
        }
        return objArr[size];
    }

    public final Object A0W() {
        if (isEmpty()) {
            return null;
        }
        return removeFirst();
    }

    public boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    public void clear() {
        if (!isEmpty()) {
            this.modCount++;
            int size = this.A00 + size();
            int length = this.A02.length;
            if (size >= length) {
                size -= length;
            }
            A01(this.A00, size);
        }
        this.A00 = 0;
        this.A01 = 0;
    }

    public boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    public Object get(int i) {
        C29761cp.A02(i, size());
        Object[] objArr = this.A02;
        int i2 = this.A00 + i;
        int length = objArr.length;
        if (i2 >= length) {
            i2 -= length;
        }
        return objArr[i2];
    }

    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    public final Object removeFirst() {
        if (!isEmpty()) {
            this.modCount++;
            Object[] objArr = this.A02;
            int i = this.A00;
            Object obj = objArr[i];
            objArr[i] = null;
            int i2 = i + 1;
            if (i == objArr.length - 1) {
                i2 = 0;
            }
            this.A00 = i2;
            this.A01 = size() - 1;
            return obj;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public final Object removeLast() {
        if (!isEmpty()) {
            this.modCount++;
            int size = this.A00 + (size() - 1);
            Object[] objArr = this.A02;
            int length = objArr.length;
            if (size >= length) {
                size -= length;
            }
            Object obj = objArr[size];
            objArr[size] = null;
            this.A01 = size() - 1;
            return obj;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public void removeRange(int i, int i2) {
        int i3;
        C29761cp.A04(i, i2, size());
        int i4 = i2 - i;
        if (i4 == 0) {
            return;
        }
        if (i4 == size()) {
            clear();
        } else if (i4 == 1) {
            remove(i);
        } else {
            this.modCount++;
            int size = size() - i2;
            int i5 = this.A00;
            if (i < size) {
                int i6 = i5 + (i - 1);
                int length = this.A02.length;
                if (i6 >= length) {
                    i6 -= length;
                }
                int i7 = i5 + (i2 - 1);
                if (i7 >= length) {
                    i7 -= length;
                }
                while (i > 0) {
                    int i8 = r5 + 1;
                    int min = Math.min(i, Math.min(i8, r6 + 1));
                    Object[] objArr = this.A02;
                    int i9 = i9 - min;
                    int i10 = i10 - min;
                    C200310o.A07(objArr, i9 + 1, objArr, i10 + 1, i8);
                    if (i10 < 0) {
                        i10 += this.A02.length;
                    }
                    if (i9 < 0) {
                        i9 += this.A02.length;
                    }
                    i -= min;
                }
                int i11 = this.A00;
                int i12 = i11 + i4;
                int length2 = this.A02.length;
                if (i12 >= length2) {
                    i12 -= length2;
                }
                A01(i11, i12);
                this.A00 = i12;
            } else {
                int i13 = i5 + i2;
                int length3 = this.A02.length;
                if (i13 >= length3) {
                    i13 -= length3;
                }
                int i14 = i5 + i;
                if (i14 >= length3) {
                    i14 -= length3;
                }
                int size2 = size();
                while (true) {
                    size2 -= i2;
                    if (size2 <= 0) {
                        break;
                    }
                    Object[] objArr2 = this.A02;
                    int length4 = objArr2.length;
                    i2 = Math.min(size2, Math.min(length4 - r5, length4 - i3));
                    System.arraycopy(objArr2, r5, objArr2, i3, (r5 + i2) - r5);
                    int i15 = i15 + i2;
                    int length5 = this.A02.length;
                    if (i15 >= length5) {
                        i15 -= length5;
                    }
                    i3 += i2;
                    if (i3 >= length5) {
                        i3 -= length5;
                    }
                }
                int size3 = this.A00 + size();
                int length6 = this.A02.length;
                if (size3 >= length6) {
                    size3 -= length6;
                }
                int i16 = size3 - i4;
                if (i16 < 0) {
                    i16 += length6;
                }
                A01(i16, size3);
            }
            this.A01 = size() - i4;
        }
    }

    public Object set(int i, Object obj) {
        C29761cp.A02(i, size());
        int i2 = this.A00 + i;
        Object[] objArr = this.A02;
        int length = objArr.length;
        if (i2 >= length) {
            i2 -= length;
        }
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    public void add(int i, Object obj) {
        int i2;
        C29761cp.A03(i, size());
        if (i == size()) {
            addLast(obj);
        } else if (i == 0) {
            addFirst(obj);
        } else {
            this.modCount++;
            A00(size() + 1);
            int i3 = this.A00 + i;
            int length = this.A02.length;
            if (i3 >= length) {
                i3 -= length;
            }
            if (i < ((size() + 1) >> 1)) {
                if (i3 == 0) {
                    Object[] objArr = this.A02;
                    C18070vi.A0d(objArr, 0);
                    i2 = objArr.length - 1;
                } else {
                    i2 = i3 - 1;
                }
                int i4 = this.A00;
                if (i4 == 0) {
                    Object[] objArr2 = this.A02;
                    C18070vi.A0d(objArr2, 0);
                    i4 = objArr2.length;
                }
                int i5 = i4 - 1;
                int i6 = this.A00;
                Object[] objArr3 = this.A02;
                if (i2 >= i6) {
                    objArr3[i5] = objArr3[i6];
                    int i7 = i6 + 1;
                    System.arraycopy(objArr3, i7, objArr3, i6, (i2 + 1) - i7);
                } else {
                    System.arraycopy(objArr3, i6, objArr3, i6 - 1, objArr3.length - i6);
                    Object[] objArr4 = this.A02;
                    objArr4[objArr4.length - 1] = objArr4[0];
                    System.arraycopy(objArr4, 1, objArr4, 0, (i2 + 1) - 1);
                }
                this.A02[i2] = obj;
                this.A00 = i5;
            } else {
                int size = this.A00 + size();
                Object[] objArr5 = this.A02;
                int length2 = objArr5.length;
                if (size >= length2) {
                    size -= length2;
                }
                if (i3 < size) {
                    System.arraycopy(objArr5, i3, objArr5, i3 + 1, size - i3);
                } else {
                    System.arraycopy(objArr5, 0, objArr5, 1, size);
                    Object[] objArr6 = this.A02;
                    int length3 = objArr6.length - 1;
                    objArr6[0] = objArr6[length3];
                    System.arraycopy(objArr6, i3, objArr6, i3 + 1, length3 - i3);
                }
                this.A02[i3] = obj;
            }
            this.A01 = size() + 1;
        }
    }

    public boolean addAll(int i, Collection collection) {
        C18070vi.A0d(collection, 1);
        C29761cp.A03(i, size());
        if (collection.isEmpty()) {
            return false;
        }
        if (i == size()) {
            return addAll(collection);
        }
        this.modCount++;
        A00(size() + collection.size());
        int size = this.A00 + size();
        int length = this.A02.length;
        if (size >= length) {
            size -= length;
        }
        int i2 = this.A00 + i;
        if (i2 >= length) {
            i2 -= length;
        }
        int size2 = collection.size();
        if (i < ((size() + 1) >> 1)) {
            int i3 = this.A00;
            int i4 = i3 - size2;
            if (i2 < i3) {
                Object[] objArr = this.A02;
                System.arraycopy(objArr, i3, objArr, i4, objArr.length - i3);
                Object[] objArr2 = this.A02;
                int length2 = objArr2.length - size2;
                if (size2 >= i2) {
                    System.arraycopy(objArr2, 0, objArr2, length2, i2);
                } else {
                    System.arraycopy(objArr2, 0, objArr2, length2, size2);
                    Object[] objArr3 = this.A02;
                    C200310o.A07(objArr3, 0, objArr3, size2, i2);
                }
            } else if (i4 >= 0) {
                Object[] objArr4 = this.A02;
                C200310o.A07(objArr4, i4, objArr4, i3, i2);
            } else {
                Object[] objArr5 = this.A02;
                int length3 = objArr5.length;
                i4 += length3;
                int i5 = i2 - i3;
                int i6 = length3 - i4;
                if (i6 >= i5) {
                    System.arraycopy(objArr5, i3, objArr5, i4, i5);
                } else {
                    System.arraycopy(objArr5, i3, objArr5, i4, (i3 + i6) - i3);
                    Object[] objArr6 = this.A02;
                    C200310o.A07(objArr6, 0, objArr6, this.A00 + i6, i2);
                }
            }
            this.A00 = i4;
            i2 -= size2;
            if (i2 < 0) {
                i2 += this.A02.length;
            }
        } else {
            int i7 = i2 + size2;
            if (i2 < size) {
                int i8 = size2 + size;
                Object[] objArr7 = this.A02;
                int length4 = objArr7.length;
                if (i8 > length4) {
                    if (i7 >= length4) {
                        i7 -= length4;
                    } else {
                        int i9 = i8 - length4;
                        int i10 = size - i9;
                        System.arraycopy(objArr7, i10, objArr7, 0, size - i10);
                        Object[] objArr8 = this.A02;
                        C200310o.A07(objArr8, i7, objArr8, i2, size - i9);
                    }
                }
                System.arraycopy(objArr7, i2, objArr7, i7, size - i2);
            } else {
                Object[] objArr9 = this.A02;
                C200310o.A07(objArr9, size2, objArr9, 0, size);
                Object[] objArr10 = this.A02;
                int length5 = objArr10.length;
                if (i7 >= length5) {
                    System.arraycopy(objArr10, i2, objArr10, i7 - length5, length5 - i2);
                } else {
                    int i11 = length5 - size2;
                    System.arraycopy(objArr10, i11, objArr10, 0, length5 - i11);
                    Object[] objArr11 = this.A02;
                    System.arraycopy(objArr11, i2, objArr11, i7, (objArr11.length - size2) - i2);
                }
            }
        }
        A02(collection, i2);
        return true;
    }

    public Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
