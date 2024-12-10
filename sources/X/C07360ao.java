package X;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* renamed from: X.0ao  reason: invalid class name and case insensitive filesystem */
public final class C07360ao<E> extends AnonymousClass1JC<E> implements PersistentList.Builder<E>, Collection, C23161Ex, AnonymousClass1JB {
    public AnonymousClass0EQ A00 = new Object();
    public int A01;
    public int A02;
    public C17800vF A03;
    public Object[] A04;
    public Object[] A05;
    public Object[] A06;
    public Object[] A07;

    private final int A01(C02040Ck r6, List list, List list2, C22821Di r9, Object[] objArr, int i, int i2) {
        if (objArr.length == 33 && objArr[32] == this.A00) {
            list.add(objArr);
        }
        Object obj = r6.A00;
        C18070vi.A0z(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr2 = (Object[]) obj;
        Object[] objArr3 = objArr2;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj2 = objArr[i3];
            if (!AnonymousClass000.A1Y(r9.invoke(obj2))) {
                if (i2 == 32) {
                    if (AnonymousClass000.A1a(list)) {
                        objArr3 = (Object[]) list.remove(list.size() - 1);
                    } else {
                        objArr3 = A0D();
                    }
                    i2 = 0;
                }
                objArr3[i2] = obj2;
                i2++;
            }
        }
        r6.A00 = objArr3;
        if (objArr2 != objArr3) {
            list2.add(objArr2);
        }
        return i2;
    }

    private final int A03(C02040Ck r7, C22821Di r8, Object[] objArr, int i) {
        Object[] objArr2 = objArr;
        int i2 = i;
        boolean z = false;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (AnonymousClass000.A1Y(r8.invoke(obj))) {
                if (!z) {
                    objArr2 = A0K(objArr);
                    z = true;
                    i2 = i3;
                }
            } else if (z) {
                objArr2[i2] = obj;
                i2++;
            }
        }
        r7.A00 = objArr2;
        return i2;
    }

    private final void A07(Collection collection, Object[] objArr, Object[] objArr2, Object[][] objArr3, int i, int i2, int i3) {
        Object[] A0D;
        if (i3 >= 1) {
            Object[] A0K = A0K(objArr);
            objArr3[0] = A0K;
            int i4 = i & 31;
            int size = ((i + collection.size()) - 1) & 31;
            int i5 = size + (i2 - i4);
            if (i5 < 32) {
                C200310o.A07(A0K, size + 1, objArr2, i4, i2);
            } else {
                int i6 = (i5 - 32) + 1;
                if (i3 == 1) {
                    A0D = A0K;
                } else {
                    A0D = A0D();
                    i3--;
                    objArr3[i3] = A0D;
                }
                int i7 = i2 - i6;
                C200310o.A07(A0K, 0, objArr2, i7, i2);
                C200310o.A07(A0K, size + 1, A0D, i4, i7);
                objArr2 = A0D;
            }
            Iterator it = collection.iterator();
            A09(it, A0K, i4);
            for (int i8 = 1; i8 < i3; i8++) {
                Object[] A0D2 = A0D();
                A09(it, A0D2, 0);
                objArr3[i8] = A0D2;
            }
            A09(it, objArr2, 0);
            return;
        }
        throw AnonymousClass000.A0k("requires at least one nullBuffer");
    }

    private final void A08(Collection collection, Object[] objArr, Object[][] objArr2, int i, int i2, int i3) {
        Object[] objArr3 = objArr;
        if (this.A04 != null) {
            int i4 = i;
            int i5 = i >> 5;
            Object[][] objArr4 = objArr2;
            int i6 = i3;
            Object[] A0Q = A0Q(objArr, objArr4, i5, i2, i6);
            int A002 = i3 - (((A00() >> 5) - 1) - i5);
            if (A002 < i6) {
                objArr3 = objArr2[A002];
                C18070vi.A0b(objArr3);
            }
            A07(collection, A0Q, objArr3, objArr4, i4, 32, A002);
            return;
        }
        throw AnonymousClass000.A0n("root is null");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.0Ck] */
    private final void A0A(Object[] objArr, int i, int i2) {
        if (i2 == 0) {
            this.A04 = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.A05 = objArr;
            this.A02 = i;
        } else {
            ? obj = new Object();
            obj.A00 = null;
            C18070vi.A0b(objArr);
            Object[] A0H = A0H(obj, objArr, i2, i);
            C18070vi.A0b(A0H);
            Object obj2 = obj.A00;
            C18070vi.A0z(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            this.A05 = (Object[]) obj2;
            this.A02 = i;
            if (A0H[1] == null) {
                this.A04 = (Object[]) A0H[0];
                i2 -= 5;
            } else {
                this.A04 = A0H;
            }
        }
        this.A01 = i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        if (r4[32] != r3.A00) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Object[] A0L(java.lang.Object[] r4, int r5) {
        /*
            r3 = this;
            int r1 = r4.length
            r0 = 33
            if (r1 != r0) goto L_0x000e
            r0 = 32
            r2 = r4[r0]
            X.0EQ r1 = r3.A00
            r0 = 1
            if (r2 == r1) goto L_0x000f
        L_0x000e:
            r0 = 0
        L_0x000f:
            r2 = 0
            if (r0 == 0) goto L_0x0018
            int r0 = 32 - r5
            X.C200310o.A07(r4, r5, r4, r2, r0)
            return r4
        L_0x0018:
            java.lang.Object[] r1 = r3.A0D()
            int r0 = 32 - r5
            X.C200310o.A07(r4, r5, r1, r2, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C07360ao.A0L(java.lang.Object[], int):java.lang.Object[]");
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [java.lang.Object, X.0Ck] */
    public void add(int i, Object obj) {
        int i2 = i;
        AnonymousClass0LB.A01(i, size());
        Object obj2 = obj;
        if (i == size()) {
            add(obj);
            return;
        }
        this.modCount++;
        int A002 = A00();
        if (i >= A002) {
            A06(obj, this.A04, i - A002);
            return;
        }
        ? obj3 = new Object();
        obj3.A00 = null;
        Object[] objArr = this.A04;
        C18070vi.A0b(objArr);
        A06(obj3.A00, A0F(obj3, obj2, objArr, this.A01, i2), 0);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [java.lang.Object, X.0Ck] */
    public Object set(int i, Object obj) {
        int i2 = i;
        AnonymousClass0LB.A00(i, size());
        Object obj2 = obj;
        if (A00() <= i) {
            Object[] A0K = A0K(this.A05);
            if (A0K != this.A05) {
                this.modCount++;
            }
            int i3 = i & 31;
            Object obj3 = A0K[i3];
            A0K[i3] = obj;
            this.A05 = A0K;
            return obj3;
        }
        ? obj4 = new Object();
        obj4.A00 = null;
        Object[] objArr = this.A04;
        C18070vi.A0b(objArr);
        this.A04 = A0G(obj4, obj2, objArr, this.A01, i2);
        return obj4.A00;
    }

    private final int A02(C02040Ck r4, C22821Di r5, int i) {
        int A032 = A03(r4, r5, this.A05, i);
        if (A032 == i) {
            return i;
        }
        Object obj = r4.A00;
        C18070vi.A0z(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) obj;
        C200310o.A06(objArr, A032, i);
        this.A05 = objArr;
        this.A02 = size() - (i - A032);
        return A032;
    }

    private final C06910a3 A04(int i) {
        Object[] objArr = this.A04;
        if (objArr != null) {
            int A002 = A00() >> 5;
            AnonymousClass0LB.A01(i, A002);
            int i2 = this.A01;
            if (i2 == 0) {
                return new C012907x(objArr, i);
            }
            return new C013107z(objArr, i, A002, i2 / 5);
        }
        throw AnonymousClass000.A0n("Invalid root");
    }

    public static final void A09(Iterator it, Object[] objArr, int i) {
        while (i < 32 && it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [java.lang.Object, X.0Ck] */
    private final boolean A0C(C22821Di r23) {
        int A022;
        int size = size();
        if (size > 32) {
            size -= (size - 1) & -32;
        }
        ? obj = new Object();
        obj.A00 = null;
        C22821Di r10 = r23;
        if (this.A04 == null) {
            A022 = A02(obj, r10, size);
        } else {
            C06910a3 A042 = A04(0);
            while (A042.hasNext()) {
                int A032 = A03(obj, r10, (Object[]) A042.next(), 32);
                if (A032 != 32) {
                    int previousIndex = A042.previousIndex() << 5;
                    ArrayList A13 = AnonymousClass000.A13();
                    ArrayList A132 = AnonymousClass000.A13();
                    while (A042.hasNext()) {
                        A032 = A01(obj, A132, A13, r10, (Object[]) A042.next(), 32, A032);
                    }
                    int A012 = A01(obj, A132, A13, r10, this.A05, size, A032);
                    Object obj2 = obj.A00;
                    C18070vi.A0z(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                    Object[] objArr = (Object[]) obj2;
                    C200310o.A06(objArr, A012, 32);
                    boolean isEmpty = A13.isEmpty();
                    Object[] objArr2 = this.A04;
                    if (isEmpty) {
                        C18070vi.A0b(objArr2);
                    } else {
                        objArr2 = A0J(A13.iterator(), objArr2, previousIndex, this.A01);
                    }
                    int size2 = previousIndex + (A13.size() << 5);
                    this.A04 = A0M(objArr2, size2);
                    this.A05 = objArr;
                    this.A02 = size2 + A012;
                    return true;
                }
            }
            A022 = A02(obj, r10, size);
            if (A022 == 0) {
                A0A(this.A04, size(), this.A01);
            }
        }
        if (A022 != size) {
            return true;
        }
        return false;
    }

    private final Object[] A0D() {
        Object[] objArr = new Object[33];
        objArr[32] = this.A00;
        return objArr;
    }

    private final Object[] A0F(C02040Ck r5, Object obj, Object[] objArr, int i, int i2) {
        Object obj2;
        int i3 = (i2 >> i) & 31;
        if (i == 0) {
            r5.A00 = objArr[31];
            Object[] A0K = A0K(objArr);
            C200310o.A07(objArr, i3 + 1, A0K, i3, 31);
            A0K[i3] = obj;
            return A0K;
        }
        Object[] A0K2 = A0K(objArr);
        int i4 = i - 5;
        Object obj3 = A0K2[i3];
        C18070vi.A0z(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr2 = (Object[]) obj3;
        while (true) {
            A0K2[i3] = A0F(r5, obj, objArr2, i4, i2);
            i3++;
            if (i3 >= 32 || (obj2 = A0K2[i3]) == null) {
                return A0K2;
            }
            C18070vi.A0z(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr2 = (Object[]) obj2;
            i2 = 0;
            obj = r5.A00;
        }
    }

    private final Object[] A0G(C02040Ck r4, Object obj, Object[] objArr, int i, int i2) {
        int i3 = (i2 >> i) & 31;
        Object[] A0K = A0K(objArr);
        if (i == 0) {
            if (A0K != objArr) {
                this.modCount++;
            }
            r4.A00 = A0K[i3];
            A0K[i3] = obj;
            return A0K;
        }
        Object obj2 = A0K[i3];
        C18070vi.A0z(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        A0K[i3] = A0G(r4, obj, (Object[]) obj2, i - 5, i2);
        return A0K;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001f, code lost:
        if (r1 == null) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Object[] A0H(X.C02040Ck r6, java.lang.Object[] r7, int r8, int r9) {
        /*
            r5 = this;
            int r0 = r9 + -1
            int r0 = r0 >> r8
            r4 = r0 & 31
            r3 = 0
            r2 = 5
            if (r8 != r2) goto L_0x0011
            r0 = r7[r4]
            r6.A00 = r0
            r1 = r3
        L_0x000e:
            if (r4 != 0) goto L_0x0022
            return r3
        L_0x0011:
            r1 = r7[r4]
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>"
            X.C18070vi.A0z(r1, r0)
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            int r8 = r8 - r2
            java.lang.Object[] r1 = r5.A0H(r6, r1, r8, r9)
            if (r1 != 0) goto L_0x0022
            goto L_0x000e
        L_0x0022:
            java.lang.Object[] r0 = r5.A0K(r7)
            r0[r4] = r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C07360ao.A0H(X.0Ck, java.lang.Object[], int, int):java.lang.Object[]");
    }

    private final Object[] A0I(C02040Ck r9, Object[] objArr, int i, int i2) {
        int i3 = (i2 >> i) & 31;
        int i4 = 31;
        if (i == 0) {
            Object obj = objArr[i3];
            Object[] A0K = A0K(objArr);
            C200310o.A07(objArr, i3, A0K, i3 + 1, 32);
            A0K[31] = r9.A00;
            r9.A00 = obj;
            return A0K;
        }
        if (objArr[31] == null) {
            i4 = ((A00() - 1) >> i) & 31;
        }
        Object[] A0K2 = A0K(objArr);
        int i5 = i - 5;
        int i6 = i3 + 1;
        if (i6 <= i4) {
            while (true) {
                Object obj2 = A0K2[i4];
                C18070vi.A0z(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                A0K2[i4] = A0I(r9, (Object[]) obj2, i5, 0);
                if (i4 == i6) {
                    break;
                }
                i4--;
            }
        }
        Object obj3 = A0K2[i3];
        C18070vi.A0z(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        A0K2[i3] = A0I(r9, (Object[]) obj3, i5, i2);
        return A0K2;
    }

    private final Object[] A0K(Object[] objArr) {
        if (objArr == null) {
            return A0D();
        }
        int length = objArr.length;
        if (length == 33 && objArr[32] == this.A00) {
            return objArr;
        }
        Object[] A0D = A0D();
        if (length > 32) {
            length = 32;
        }
        C200310o.A07(objArr, 0, A0D, 0, length);
        return A0D;
    }

    private final Object[] A0M(Object[] objArr, int i) {
        if ((i & 31) != 0) {
            throw AnonymousClass000.A0k("invalid size");
        } else if (i == 0) {
            this.A01 = 0;
            return null;
        } else {
            int i2 = i - 1;
            while (true) {
                int i3 = this.A01;
                if ((i2 >> i3) != 0) {
                    return A0N(objArr, i2, i3);
                }
                this.A01 = i3 - 5;
                Object[] objArr2 = objArr[0];
                C18070vi.A0z(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArr = objArr2;
            }
        }
    }

    private final Object[] A0N(Object[] objArr, int i, int i2) {
        if (i2 < 0) {
            throw AnonymousClass000.A0k("shift should be positive");
        } else if (i2 == 0) {
            return objArr;
        } else {
            int i3 = (i >> i2) & 31;
            Object[] objArr2 = objArr[i3];
            C18070vi.A0z(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            Object A0N = A0N(objArr2, i, i2 - 5);
            if (i3 < 31) {
                int i4 = i3 + 1;
                if (objArr[i4] != null) {
                    if (objArr.length == 33 && objArr[32] == this.A00) {
                        C200310o.A06(objArr, i4, 32);
                    }
                    Object[] A0D = A0D();
                    C200310o.A07(objArr, 0, A0D, 0, i4);
                    objArr = A0D;
                }
            }
            if (A0N == objArr[i3]) {
                return objArr;
            }
            Object[] A0K = A0K(objArr);
            A0K[i3] = A0N;
            return A0K;
        }
    }

    private final Object[] A0Q(Object[] objArr, Object[][] objArr2, int i, int i2, int i3) {
        if (this.A04 != null) {
            C06910a3 A042 = A04(A00() >> 5);
            while (A042.previousIndex() != i) {
                Object[] objArr3 = (Object[]) A042.previous();
                C200310o.A07(objArr3, 0, objArr, 32 - i2, 32);
                objArr = A0L(objArr3, i2);
                i3--;
                objArr2[i3] = objArr;
            }
            return (Object[]) A042.previous();
        }
        throw AnonymousClass000.A0n("root is null");
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, X.0EQ] */
    public C17800vF A0V() {
        C17800vF r1;
        C17800vF r12;
        Object[] objArr = this.A04;
        if (objArr == this.A06 && this.A05 == this.A07) {
            r12 = this.A03;
        } else {
            this.A00 = new Object();
            this.A06 = objArr;
            Object[] objArr2 = this.A05;
            this.A07 = objArr2;
            if (objArr != null) {
                C18070vi.A0b(objArr);
                r1 = new AnonymousClass082(objArr, this.A05, size(), this.A01);
            } else if (objArr2.length == 0) {
                r12 = AnonymousClass0EO.A00();
            } else {
                Object[] copyOf = Arrays.copyOf(objArr2, size());
                C18070vi.A0X(copyOf);
                r1 = new AnonymousClass081(copyOf);
            }
            r12 = r1;
        }
        this.A03 = r12;
        return r12;
    }

    public boolean addAll(int i, Collection collection) {
        Object[] A0D;
        int i2;
        Object[] A0L;
        int i3 = i;
        AnonymousClass0LB.A01(i3, size());
        Collection collection2 = collection;
        if (i3 == size()) {
            return addAll(collection2);
        }
        if (collection2.isEmpty()) {
            return false;
        }
        this.modCount++;
        int i4 = (i >> 5) << 5;
        int size = (((size() - i4) + collection2.size()) - 1) / 32;
        if (size == 0) {
            A00();
            int i5 = i & 31;
            Object[] objArr = this.A05;
            Object[] A0K = A0K(objArr);
            int size2 = (((i + collection2.size()) - 1) & 31) + 1;
            int size3 = size();
            if (size3 > 32) {
                size3 -= (size3 - 1) & -32;
            }
            C200310o.A07(objArr, size2, A0K, i5, size3);
            A09(collection2.iterator(), A0K, i5);
            this.A05 = A0K;
        } else {
            Object[][] objArr2 = new Object[size][];
            int size4 = size();
            if (size4 > 32) {
                size4 -= (size4 - 1) & -32;
            }
            int size5 = size() + collection2.size();
            if (size5 > 32) {
                size5 -= (size5 - 1) & -32;
            }
            if (i3 >= A00()) {
                A0D = A0D();
                A07(collection2, this.A05, A0D, objArr2, i3, size4, size);
            } else {
                if (size5 > size4) {
                    i2 = size5 - size4;
                    A0D = A0L(this.A05, i2);
                    A0L = A0D;
                } else {
                    Object[] objArr3 = this.A05;
                    A0D = A0D();
                    int i6 = size4 - size5;
                    C200310o.A07(objArr3, 0, A0D, i6, size4);
                    i2 = 32 - i6;
                    A0L = A0L(this.A05, i2);
                    size--;
                    objArr2[size] = A0L;
                }
                A08(collection2, A0L, objArr2, i3, i2, size);
            }
            this.A04 = A0P(this.A04, objArr2, i4);
            this.A05 = A0D;
        }
        this.A02 = size() + collection2.size();
        return true;
    }

    public boolean removeAll(Collection collection) {
        return A0W(new C09870hQ(collection));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.0EQ] */
    public C07360ao(C17800vF r2, Object[] objArr, Object[] objArr2, int i) {
        this.A03 = r2;
        this.A06 = objArr;
        this.A07 = objArr2;
        this.A01 = i;
        this.A04 = objArr;
        this.A05 = objArr2;
        this.A02 = r2.size();
    }

    private final int A00() {
        if (size() <= 32) {
            return 0;
        }
        return AnonymousClass000.A0Q(this) & -32;
    }

    private final Object A05(Object[] objArr, int i, int i2, int i3) {
        int size = size() - i;
        if (size == 1) {
            Object obj = this.A05[0];
            A0A(objArr, i, i2);
            return obj;
        }
        Object[] objArr2 = this.A05;
        Object obj2 = objArr2[i3];
        Object[] A0K = A0K(objArr2);
        C200310o.A07(objArr2, i3, A0K, i3 + 1, size);
        A0K[size - 1] = null;
        this.A04 = objArr;
        this.A05 = A0K;
        this.A02 = (i + size) - 1;
        this.A01 = i2;
        return obj2;
    }

    private final void A06(Object obj, Object[] objArr, int i) {
        int size = size();
        if (size > 32) {
            size -= (size - 1) & -32;
        }
        Object[] A0K = A0K(this.A05);
        if (size < 32) {
            C200310o.A07(this.A05, i + 1, A0K, i, size);
            A0K[i] = obj;
            this.A04 = objArr;
            this.A05 = A0K;
            this.A02 = size() + 1;
            return;
        }
        Object[] objArr2 = this.A05;
        Object obj2 = objArr2[31];
        C200310o.A07(objArr2, i + 1, A0K, i, 31);
        A0K[i] = obj;
        Object[] A1b = AnonymousClass000.A1b(obj2, 33);
        A1b[32] = this.A00;
        A0B(objArr, A0K, A1b);
    }

    private final void A0B(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int size = size() >> 5;
        int i = this.A01;
        if (size > (1 << i)) {
            Object[] A1b = AnonymousClass000.A1b(objArr, 33);
            A1b[32] = this.A00;
            this.A04 = A0O(A1b, objArr2, i + 5);
            this.A05 = objArr3;
            this.A01 += 5;
        } else {
            if (objArr == null) {
                this.A04 = objArr2;
            } else {
                this.A04 = A0O(objArr, objArr2, i);
            }
            this.A05 = objArr3;
        }
        this.A02 = size() + 1;
    }

    private final Object[] A0E(int i) {
        if (A00() <= i) {
            return this.A05;
        }
        Object[] objArr = this.A04;
        C18070vi.A0b(objArr);
        for (int i2 = this.A01; i2 > 0; i2 -= 5) {
            Object[] objArr2 = objArr[(i >> i2) & 31];
            C18070vi.A0z(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr = objArr2;
        }
        return objArr;
    }

    private final Object[] A0J(Iterator it, Object[] objArr, int i, int i2) {
        if (!it.hasNext()) {
            throw AnonymousClass000.A0k("invalid buffersIterator");
        } else if (i2 < 0) {
            throw AnonymousClass000.A0k("negative shift");
        } else if (i2 == 0) {
            return (Object[]) it.next();
        } else {
            Object[] A0K = A0K(objArr);
            int i3 = (i >> i2) & 31;
            int i4 = i2 - 5;
            Object[] A0J = A0J(it, (Object[]) A0K[i3], i, i4);
            while (true) {
                A0K[i3] = A0J;
                i3++;
                if (i3 >= 32 || !it.hasNext()) {
                    return A0K;
                }
                A0J = A0J(it, (Object[]) A0K[i3], 0, i4);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Object[] A0O(java.lang.Object[] r5, java.lang.Object[] r6, int r7) {
        /*
            r4 = this;
            int r0 = X.AnonymousClass000.A0Q(r4)
            int r0 = r0 >> r7
            r3 = r0 & 31
            java.lang.Object[] r2 = r4.A0K(r5)
            r1 = 5
            if (r7 == r1) goto L_0x0017
            r0 = r2[r3]
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            int r7 = r7 - r1
            java.lang.Object[] r6 = r4.A0O(r0, r6, r7)
        L_0x0017:
            r2[r3] = r6
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C07360ao.A0O(java.lang.Object[], java.lang.Object[], int):java.lang.Object[]");
    }

    private final Object[] A0P(Object[] objArr, Object[][] objArr2, int i) {
        Object[] objArr3;
        C99014s7 A002 = AnonymousClass4I0.A00(objArr2);
        int i2 = i >> 5;
        int i3 = this.A01;
        if (i2 < (1 << i3)) {
            objArr3 = A0J(A002, objArr, i, i3);
        } else {
            objArr3 = A0K(objArr);
        }
        while (A002.hasNext()) {
            int i4 = this.A01 + 5;
            this.A01 = i4;
            objArr3 = AnonymousClass000.A1b(objArr3, 33);
            objArr3[32] = this.A00;
            A0J(A002, objArr3, 1 << i4, i4);
        }
        return objArr3;
    }

    public int A0R() {
        return this.A02;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, X.0Ck] */
    public Object A0S(int i) {
        AnonymousClass0LB.A00(i, size());
        this.modCount++;
        int A002 = A00();
        if (i >= A002) {
            return A05(this.A04, A002, this.A01, i - A002);
        }
        Object obj = this.A05[0];
        ? obj2 = new Object();
        obj2.A00 = obj;
        Object[] objArr = this.A04;
        C18070vi.A0b(objArr);
        A05(A0I(obj2, objArr, this.A01, i), A002, this.A01, 0);
        return obj2.A00;
    }

    public final int A0T() {
        return this.modCount;
    }

    public final int A0U() {
        return this.A01;
    }

    public final boolean A0W(C22821Di r3) {
        boolean A0C = A0C(r3);
        if (A0C) {
            this.modCount++;
        }
        return A0C;
    }

    public final Object[] A0X() {
        return this.A04;
    }

    public final Object[] A0Y() {
        return this.A05;
    }

    public Object get(int i) {
        AnonymousClass0LB.A00(i, size());
        return A0E(i)[i & 31];
    }

    public Iterator iterator() {
        return listIterator();
    }

    public ListIterator listIterator(int i) {
        AnonymousClass0LB.A01(i, size());
        return new AnonymousClass080(this, i);
    }

    public boolean add(Object obj) {
        this.modCount++;
        int size = size();
        if (size > 32) {
            size -= (size - 1) & -32;
        }
        if (size < 32) {
            Object[] A0K = A0K(this.A05);
            A0K[size] = obj;
            this.A05 = A0K;
            this.A02 = size() + 1;
            return true;
        }
        Object[] A1b = AnonymousClass000.A1b(obj, 33);
        A1b[32] = this.A00;
        A0B(this.A04, this.A05, A1b);
        return true;
    }

    public ListIterator listIterator() {
        return listIterator(0);
    }

    public boolean addAll(Collection collection) {
        Object[] A0D;
        if (collection.isEmpty()) {
            return false;
        }
        this.modCount++;
        int size = size();
        if (size > 32) {
            size -= (size - 1) & -32;
        }
        Iterator it = collection.iterator();
        if (32 - size >= collection.size()) {
            A0D = A0K(this.A05);
            A09(it, A0D, size);
        } else {
            int size2 = ((collection.size() + size) - 1) / 32;
            Object[][] objArr = new Object[size2][];
            Object[] A0K = A0K(this.A05);
            A09(it, A0K, size);
            objArr[0] = A0K;
            for (int i = 1; i < size2; i++) {
                Object[] A0D2 = A0D();
                A09(it, A0D2, 0);
                objArr[i] = A0D2;
            }
            this.A04 = A0P(this.A04, objArr, A00());
            A0D = A0D();
            A09(it, A0D, 0);
        }
        this.A05 = A0D;
        this.A02 = size() + collection.size();
        return true;
    }
}
