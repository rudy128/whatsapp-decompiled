package X;

import java.util.Arrays;
import java.util.ListIterator;

/* renamed from: X.082  reason: invalid class name */
public final class AnonymousClass082<E> extends C07330al<E> implements C17800vF<E> {
    public final int A00;
    public final Object[] A01;
    public final Object[] A02;
    public final int A03;

    /* JADX WARNING: type inference failed for: r4v0, types: [java.lang.Object, X.0Ck] */
    public C17800vF BAp(Object obj, int i) {
        int i2 = i;
        AnonymousClass0LB.A01(i, size());
        Object obj2 = obj;
        if (i == size()) {
            return BAl(obj);
        }
        int A002 = A00();
        if (i >= A002) {
            return A03(obj, this.A01, i - A002);
        }
        ? obj3 = new Object();
        obj3.A00 = null;
        return A03(obj3.A00, A06(obj3, obj2, this.A01, this.A00, i2), 0);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.0Ck] */
    private final C17800vF A01(Object[] objArr, int i, int i2) {
        if (i2 == 0) {
            if (objArr.length == 33) {
                objArr = Arrays.copyOf(objArr, 32);
                C18070vi.A0X(objArr);
            }
            return new AnonymousClass081(objArr);
        }
        ? obj = new Object();
        obj.A00 = null;
        Object[] A07 = A07(obj, objArr, i2, i - 1);
        C18070vi.A0b(A07);
        Object obj2 = obj.A00;
        C18070vi.A0z(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr2 = (Object[]) obj2;
        if (A07[1] == null) {
            Object obj3 = A07[0];
            C18070vi.A0z(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            A07 = (Object[]) obj3;
            i2 -= 5;
        }
        return new AnonymousClass082(A07, objArr2, i, i2);
    }

    private final Object[] A06(C02040Ck r13, Object obj, Object[] objArr, int i, int i2) {
        Object[] copyOf;
        int i3 = i2;
        int i4 = (i2 >> i) & 31;
        C02040Ck r7 = r13;
        Object obj2 = obj;
        if (i == 0) {
            if (i4 == 0) {
                copyOf = new Object[32];
            } else {
                copyOf = Arrays.copyOf(objArr, 32);
                C18070vi.A0X(copyOf);
            }
            C200310o.A07(objArr, i4 + 1, copyOf, i4, 31);
            r13.A00 = objArr[31];
            copyOf[i4] = obj;
            return copyOf;
        }
        Object[] copyOf2 = Arrays.copyOf(objArr, 32);
        C18070vi.A0X(copyOf2);
        int i5 = i - 5;
        Object[] objArr2 = objArr[i4];
        C18070vi.A0z(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        copyOf2[i4] = A06(r7, obj2, objArr2, i5, i3);
        int i6 = i4 + 1;
        while (i6 < 32 && copyOf2[i6] != null) {
            Object[] objArr3 = objArr[i6];
            C18070vi.A0z(objArr3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            copyOf2[i6] = A06(r7, r13.A00, objArr3, i5, 0);
            i6++;
        }
        return copyOf2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        if (r1 == null) goto L_0x000d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Object[] A07(X.C02040Ck r6, java.lang.Object[] r7, int r8, int r9) {
        /*
            r5 = this;
            int r0 = r9 >> r8
            r4 = r0 & 31
            r3 = 0
            r2 = 5
            if (r8 != r2) goto L_0x0010
            r0 = r7[r4]
            r6.A00 = r0
            r1 = r3
        L_0x000d:
            if (r4 != 0) goto L_0x0021
            return r3
        L_0x0010:
            r1 = r7[r4]
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>"
            X.C18070vi.A0z(r1, r0)
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            int r8 = r8 - r2
            java.lang.Object[] r1 = r5.A07(r6, r1, r8, r9)
            if (r1 != 0) goto L_0x0021
            goto L_0x000d
        L_0x0021:
            r0 = 32
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r7, r0)
            X.C18070vi.A0X(r0)
            r0[r4] = r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass082.A07(X.0Ck, java.lang.Object[], int, int):java.lang.Object[]");
    }

    private final Object[] A08(C02040Ck r9, Object[] objArr, int i, int i2) {
        Object[] copyOf;
        int i3 = (i2 >> i) & 31;
        int i4 = 31;
        if (i == 0) {
            if (i3 == 0) {
                copyOf = new Object[32];
            } else {
                copyOf = Arrays.copyOf(objArr, 32);
                C18070vi.A0X(copyOf);
            }
            C200310o.A07(objArr, i3, copyOf, i3 + 1, 32);
            copyOf[31] = r9.A00;
            r9.A00 = objArr[i3];
            return copyOf;
        }
        if (objArr[31] == null) {
            i4 = ((A00() - 1) >> i) & 31;
        }
        Object[] copyOf2 = Arrays.copyOf(objArr, 32);
        C18070vi.A0X(copyOf2);
        int i5 = i - 5;
        int i6 = i3 + 1;
        if (i6 <= i4) {
            while (true) {
                Object obj = copyOf2[i4];
                C18070vi.A0z(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                copyOf2[i4] = A08(r9, (Object[]) obj, i5, 0);
                if (i4 == i6) {
                    break;
                }
                i4--;
            }
        }
        Object obj2 = copyOf2[i3];
        C18070vi.A0z(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        copyOf2[i3] = A08(r9, (Object[]) obj2, i5, i2);
        return copyOf2;
    }

    private final Object[] A09(Object obj, Object[] objArr, int i, int i2) {
        int i3 = (i2 >> i) & 31;
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        C18070vi.A0X(copyOf);
        if (i == 0) {
            copyOf[i3] = obj;
            return copyOf;
        }
        Object obj2 = copyOf[i3];
        C18070vi.A0z(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        copyOf[i3] = A09(obj, (Object[]) obj2, i - 5, i2);
        return copyOf;
    }

    public /* bridge */ /* synthetic */ C07360ao BDf() {
        return new C07360ao(this, this.A01, this.A02, this.A00);
    }

    public C17800vF CEZ(C22821Di r5) {
        C07360ao r0 = new C07360ao(this, this.A01, this.A02, this.A00);
        r0.A0W(r5);
        return r0.A0V();
    }

    public AnonymousClass082(Object[] objArr, Object[] objArr2, int i, int i2) {
        this.A01 = objArr;
        this.A02 = objArr2;
        this.A03 = i;
        this.A00 = i2;
        if (size() > 32) {
            size();
            size();
            return;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Trie-based persistent vector should have at least 33 elements, got ");
        A10.append(size());
        throw AnonymousClass000.A0j(A10);
    }

    private final int A00() {
        return (size() - 1) & -32;
    }

    private final C17800vF A02(Object[] objArr, int i, int i2, int i3) {
        int size = size() - i;
        if (size == 1) {
            return A01(objArr, i, i2);
        }
        Object[] objArr2 = this.A02;
        Object[] copyOf = Arrays.copyOf(objArr2, 32);
        C18070vi.A0X(copyOf);
        int i4 = size - 1;
        if (i3 < i4) {
            C200310o.A07(objArr2, i3, copyOf, i3 + 1, size);
        }
        copyOf[i4] = null;
        return new AnonymousClass082(objArr, copyOf, (i + size) - 1, i2);
    }

    private final AnonymousClass082 A03(Object obj, Object[] objArr, int i) {
        int size = size() - A00();
        Object[] objArr2 = this.A02;
        Object[] copyOf = Arrays.copyOf(objArr2, 32);
        C18070vi.A0X(copyOf);
        if (size < 32) {
            C200310o.A07(objArr2, i + 1, copyOf, i, size);
            copyOf[i] = obj;
            return new AnonymousClass082(objArr, copyOf, size() + 1, this.A00);
        }
        Object obj2 = objArr2[31];
        C200310o.A07(objArr2, i + 1, copyOf, i, size - 1);
        copyOf[i] = obj;
        return A04(objArr, copyOf, AnonymousClass000.A1b(obj2, 32));
    }

    private final AnonymousClass082 A04(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        Object[] A0A;
        int size = size() >> 5;
        int i = this.A00;
        if (size > (1 << i)) {
            i += 5;
            A0A = A0A(AnonymousClass000.A1b(objArr, 32), objArr2, i);
        } else {
            A0A = A0A(objArr, objArr2, i);
        }
        return new AnonymousClass082(A0A, objArr3, size() + 1, i);
    }

    private final Object[] A05(int i) {
        if (A00() <= i) {
            return this.A02;
        }
        Object[] objArr = this.A01;
        for (int i2 = this.A00; i2 > 0; i2 -= 5) {
            Object[] objArr2 = objArr[(i >> i2) & 31];
            C18070vi.A0z(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr = objArr2;
        }
        return objArr;
    }

    private final Object[] A0A(Object[] objArr, Object[] objArr2, int i) {
        Object[] objArr3;
        int size = ((size() - 1) >> i) & 31;
        if (objArr != null) {
            objArr3 = Arrays.copyOf(objArr, 32);
            C18070vi.A0X(objArr3);
        } else {
            objArr3 = new Object[32];
        }
        if (i == 5) {
            objArr3[size] = objArr2;
            return objArr3;
        }
        objArr3[size] = A0A((Object[]) objArr3[size], objArr2, i - 5);
        return objArr3;
    }

    public int A0B() {
        return this.A03;
    }

    public C17800vF BAl(Object obj) {
        int size = size() - A00();
        if (size < 32) {
            Object[] copyOf = Arrays.copyOf(this.A02, 32);
            C18070vi.A0X(copyOf);
            copyOf[size] = obj;
            return new AnonymousClass082(this.A01, copyOf, size() + 1, this.A00);
        }
        return A04(this.A01, this.A02, AnonymousClass000.A1b(obj, 32));
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, X.0Ck] */
    public C17800vF CEb(int i) {
        AnonymousClass0LB.A00(i, size());
        int A002 = A00();
        Object[] objArr = this.A01;
        int i2 = this.A00;
        if (i >= A002) {
            return A02(objArr, A002, i2, i - A002);
        }
        Object obj = this.A02[0];
        ? obj2 = new Object();
        obj2.A00 = obj;
        return A02(A08(obj2, objArr, i2, i), A002, i2, 0);
    }

    public C17800vF CHk(Object obj, int i) {
        AnonymousClass0LB.A00(i, size());
        if (A00() <= i) {
            Object[] copyOf = Arrays.copyOf(this.A02, 32);
            C18070vi.A0X(copyOf);
            copyOf[i & 31] = obj;
            return new AnonymousClass082(this.A01, copyOf, size(), this.A00);
        }
        Object[] objArr = this.A01;
        int i2 = this.A00;
        return new AnonymousClass082(A09(obj, objArr, i2, i), this.A02, size(), i2);
    }

    public Object get(int i) {
        AnonymousClass0LB.A00(i, size());
        return A05(i)[i & 31];
    }

    public ListIterator listIterator(int i) {
        AnonymousClass0LB.A01(i, size());
        return new C013007y(this.A01, i, this.A02, size(), (this.A00 / 5) + 1);
    }
}
