package X;

import java.util.Arrays;

/* renamed from: X.0Qv  reason: invalid class name and case insensitive filesystem */
public final class C05180Qv {
    public static final C05180Qv A04 = new C05180Qv((AnonymousClass0EQ) null, new Object[0], 0, 0);
    public int A00;
    public int A01;
    public Object[] A02;
    public final AnonymousClass0EQ A03;

    private final C05180Qv A0A(C05180Qv r10, AnonymousClass0JI r11, AnonymousClass0EQ r12) {
        Object[] objArr = this.A02;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length + r10.A02.length);
        C18070vi.A0X(copyOf);
        int length = this.A02.length;
        C25391Oa A07 = C28851b7.A07(C28851b7.A08(0, r10.A02.length));
        int A002 = A07.A00();
        int A012 = A07.A01();
        int A022 = A07.A02();
        if (A022 <= 0 ? !(A022 >= 0 || A012 > A002) : A002 <= A012) {
            while (true) {
                if (!A0H(r10.A02[A002])) {
                    Object[] objArr2 = r10.A02;
                    copyOf[length] = objArr2[A002];
                    copyOf[length + 1] = objArr2[A002 + 1];
                    length += 2;
                } else {
                    r11.A00++;
                }
                if (A002 == A012) {
                    break;
                }
                A002 += A022;
            }
        }
        if (length == this.A02.length) {
            return this;
        }
        if (length == r10.A02.length) {
            return r10;
        }
        if (length == copyOf.length) {
            return new C05180Qv(r12, copyOf, 0, 0);
        }
        Object[] copyOf2 = Arrays.copyOf(copyOf, length);
        C18070vi.A0X(copyOf2);
        return new C05180Qv(r12, copyOf2, 0, 0);
    }

    private final boolean A0G(C05180Qv r8) {
        if (this != r8) {
            if (this.A01 == r8.A01 && this.A00 == r8.A00) {
                Object[] objArr = this.A02;
                int length = objArr.length;
                int i = 0;
                while (i < length) {
                    if (objArr[i] == r8.A02[i]) {
                        i++;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public static final Object[] A0J(Object obj, Object obj2, Object[] objArr, int i) {
        int length = objArr.length;
        Object[] objArr2 = new Object[(length + 2)];
        C200310o.A07(objArr, 0, objArr2, 0, i);
        C200310o.A07(objArr, i + 2, objArr2, i, length);
        objArr2[i] = obj;
        objArr2[i + 1] = obj2;
        return objArr2;
    }

    public static final Object[] A0K(Object obj, Object obj2, Object[] objArr, int i, int i2) {
        int length = objArr.length;
        Object[] copyOf = Arrays.copyOf(objArr, length + 1);
        C18070vi.A0X(copyOf);
        C200310o.A07(copyOf, i + 2, copyOf, i + 1, length);
        C200310o.A07(copyOf, i2 + 2, copyOf, i2, i);
        copyOf[i2] = obj;
        copyOf[i2 + 1] = obj2;
        return copyOf;
    }

    public static final Object[] A0L(Object[] objArr, int i) {
        int length = objArr.length;
        Object[] objArr2 = new Object[(length - 2)];
        C200310o.A07(objArr, 0, objArr2, 0, i);
        C200310o.A07(objArr, i, objArr2, i + 2, length);
        return objArr2;
    }

    public static final Object[] A0M(Object[] objArr, int i) {
        int length = objArr.length;
        Object[] objArr2 = new Object[(length - 1)];
        C200310o.A07(objArr, 0, objArr2, 0, i);
        C200310o.A07(objArr, i, objArr2, i + 1, length);
        return objArr2;
    }

    public final AnonymousClass0HQ A0P(Object obj, Object obj2, int i, int i2) {
        C05180Qv r4;
        int i3;
        AnonymousClass0HQ A0P;
        int i4 = i;
        int i5 = i2;
        int i6 = 1 << ((i >> i2) & 31);
        Object obj3 = obj;
        Object obj4 = obj2;
        if (AnonymousClass000.A1O(this.A00 & i6)) {
            int A0N = A0N(i6);
            if (C18070vi.A18(obj, this.A02[A0N])) {
                if (this.A02[A0N + 1] != obj4) {
                    r4 = A0E(obj4, A0N);
                    i3 = 0;
                }
                return null;
            }
            Object obj5 = this.A02[A0N];
            r4 = new C05180Qv((AnonymousClass0EQ) null, A0I(A0C((AnonymousClass0EQ) null, obj5, this.A02[A0N + 1], obj3, obj4, AnonymousClass001.A0l(obj5), i4, i2 + 5), this.A02, A0N, A0O(i6) + 1), this.A00 ^ i6, i6 | this.A01);
            i3 = 1;
        } else if ((this.A01 & i6) != 0) {
            int A0O = A0O(i6);
            C05180Qv A0Q = A0Q(A0O);
            if (i5 == 30) {
                A0P = A0Q.A01(obj, obj4);
            } else {
                A0P = A0Q.A0P(obj, obj4, i4, i2 + 5);
            }
            if (A0P != null) {
                A0P.A00 = A08(A0P.A00, A0O, i6);
                return A0P;
            }
            return null;
        } else {
            r4 = new C05180Qv((AnonymousClass0EQ) null, A0J(obj, obj4, this.A02, A0N(i6)), i6 | this.A00, this.A01);
            i3 = 1;
        }
        return new AnonymousClass0HQ(r4, i3);
    }

    public final C05180Qv A0S(C07370ap r9, Object obj, int i, int i2) {
        C05180Qv A0S;
        int i3 = 1 << ((i >> i2) & 31);
        if ((this.A00 & i3) != 0) {
            int A0N = A0N(i3);
            if (C18070vi.A18(obj, this.A02[A0N])) {
                return A03(r9, A0N, i3);
            }
        } else if ((this.A01 & i3) != 0) {
            int A0O = A0O(i3);
            C05180Qv A0Q = A0Q(A0O);
            if (i2 == 30) {
                A0S = A0Q.A04(r9, obj);
            } else {
                A0S = A0Q.A0S(r9, obj, i, i2 + 5);
            }
            return A09(A0Q, A0S, r9.A03(), A0O, i3);
        }
        return this;
    }

    public final C05180Qv A0U(C07370ap r16, Object obj, Object obj2, int i, int i2) {
        C05180Qv A0U;
        int i3 = i;
        int i4 = i2;
        int i5 = 1 << ((i >> i2) & 31);
        C07370ap r10 = r16;
        Object obj3 = obj;
        Object obj4 = obj2;
        if (AnonymousClass000.A1O(this.A00 & i5)) {
            int A0N = A0N(i5);
            if (C18070vi.A18(obj3, this.A02[A0N]) && C18070vi.A18(obj4, this.A02[A0N + 1])) {
                return A03(r10, A0N, i5);
            }
        } else if ((this.A01 & i5) != 0) {
            int A0O = A0O(i5);
            C05180Qv A0Q = A0Q(A0O);
            if (i4 == 30) {
                A0U = A0Q.A07(r10, obj3, obj4);
            } else {
                A0U = A0Q.A0U(r10, obj3, obj4, i3, i2 + 5);
            }
            return A09(A0Q, A0U, r10.A03(), A0O, i5);
        }
        return this;
    }

    public final C05180Qv A0V(Object obj, int i, int i2) {
        C05180Qv A0V;
        int i3 = 1 << ((i >> i2) & 31);
        if ((this.A00 & i3) != 0) {
            int A0N = A0N(i3);
            if (C18070vi.A18(obj, this.A02[A0N])) {
                Object[] objArr = this.A02;
                if (objArr.length != 2) {
                    return new C05180Qv((AnonymousClass0EQ) null, A0L(objArr, A0N), i3 ^ this.A00, this.A01);
                }
                return null;
            }
        } else if ((this.A01 & i3) != 0) {
            int A0O = A0O(i3);
            C05180Qv A0Q = A0Q(A0O);
            if (i2 == 30) {
                A0V = A0Q.A0D(obj);
            } else {
                A0V = A0Q.A0V(obj, i, i2 + 5);
            }
            if (A0V == null) {
                Object[] objArr2 = this.A02;
                if (objArr2.length != 1) {
                    return new C05180Qv((AnonymousClass0EQ) null, A0M(objArr2, A0O), this.A00, i3 ^ this.A01);
                }
                return null;
            } else if (A0Q != A0V) {
                return A08(A0V, A0O, i3);
            } else {
                return this;
            }
        }
        return this;
    }

    public final Object A0W(Object obj, int i, int i2) {
        int i3 = 1 << ((i >> i2) & 31);
        if (AnonymousClass000.A1O(this.A00 & i3)) {
            int A0N = A0N(i3);
            if (C18070vi.A18(obj, this.A02[A0N])) {
                return this.A02[A0N + 1];
            }
        } else if ((this.A01 & i3) != 0) {
            C05180Qv A0Q = A0Q(A0O(i3));
            if (i2 == 30) {
                return A0Q.A0F(obj);
            }
            return A0Q.A0W(obj, i, i2 + 5);
        }
        return null;
    }

    public final boolean A0X(Object obj, int i, int i2) {
        int i3 = 1 << ((i >> i2) & 31);
        if ((this.A00 & i3) != 0) {
            return C18070vi.A18(obj, this.A02[A0N(i3)]);
        } else if ((this.A01 & i3) == 0) {
            return false;
        } else {
            C05180Qv A0Q = A0Q(A0O(i3));
            if (i2 == 30) {
                return A0Q.A0H(obj);
            }
            return A0Q.A0X(obj, i, i2 + 5);
        }
    }

    private final int A00() {
        if (this.A01 == 0) {
            return this.A02.length / 2;
        }
        int bitCount = Integer.bitCount(this.A00);
        int length = this.A02.length;
        for (int i = bitCount * 2; i < length; i++) {
            bitCount += A0Q(i).A00();
        }
        return bitCount;
    }

    private final AnonymousClass0HQ A01(Object obj, Object obj2) {
        C25391Oa A07 = C28851b7.A07(C28851b7.A08(0, this.A02.length));
        int A002 = A07.A00();
        int A012 = A07.A01();
        int A022 = A07.A02();
        if (A022 <= 0 ? !(A022 >= 0 || A012 > A002) : A002 <= A012) {
            while (!C18070vi.A18(obj, this.A02[A002])) {
                if (A002 != A012) {
                    A002 += A022;
                }
            }
            Object[] objArr = this.A02;
            int i = A002 + 1;
            if (obj2 == objArr[i]) {
                return null;
            }
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            C18070vi.A0X(copyOf);
            copyOf[i] = obj2;
            return new AnonymousClass0HQ(new C05180Qv((AnonymousClass0EQ) null, copyOf, 0, 0), 0);
        }
        return new AnonymousClass0HQ(new C05180Qv((AnonymousClass0EQ) null, A0J(obj, obj2, this.A02, 0), 0, 0), 1);
    }

    private final C05180Qv A04(C07370ap r5, Object obj) {
        C25391Oa A07 = C28851b7.A07(C28851b7.A08(0, this.A02.length));
        int A002 = A07.A00();
        int A012 = A07.A01();
        int A022 = A07.A02();
        if (A022 <= 0 ? !(A022 >= 0 || A012 > A002) : A002 <= A012) {
            while (!C18070vi.A18(obj, this.A02[A002])) {
                if (A002 != A012) {
                    A002 += A022;
                }
            }
            return A02(r5, A002);
        }
        return this;
    }

    private final C05180Qv A05(C07370ap r6, Object obj, int i) {
        if (this.A03 == r6.A03()) {
            this.A02[i + 1] = obj;
            return this;
        }
        r6.A05(r6.A00() + 1);
        Object[] objArr = this.A02;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        C18070vi.A0X(copyOf);
        copyOf[i + 1] = obj;
        return new C05180Qv(r6.A03(), copyOf, this.A00, this.A01);
    }

    private final C05180Qv A06(C07370ap r7, Object obj, Object obj2) {
        Object[] copyOf;
        C25391Oa A07 = C28851b7.A07(C28851b7.A08(0, this.A02.length));
        int A002 = A07.A00();
        int A012 = A07.A01();
        int A022 = A07.A02();
        if (A022 <= 0 ? !(A022 >= 0 || A012 > A002) : A002 <= A012) {
            while (true) {
                if (!C18070vi.A18(obj, this.A02[A002])) {
                    if (A002 == A012) {
                        break;
                    }
                    A002 += A022;
                } else {
                    Object[] objArr = this.A02;
                    int i = A002 + 1;
                    r7.A07(objArr[i]);
                    if (this.A03 == r7.A03()) {
                        objArr[i] = obj2;
                        return this;
                    }
                    r7.A05(r7.A00() + 1);
                    copyOf = Arrays.copyOf(objArr, objArr.length);
                    C18070vi.A0X(copyOf);
                    copyOf[i] = obj2;
                }
            }
        }
        r7.A04(r7.size() + 1);
        copyOf = A0J(obj, obj2, this.A02, 0);
        return new C05180Qv(r7.A03(), copyOf, 0, 0);
    }

    private final C05180Qv A07(C07370ap r6, Object obj, Object obj2) {
        C25391Oa A07 = C28851b7.A07(C28851b7.A08(0, this.A02.length));
        int A002 = A07.A00();
        int A012 = A07.A01();
        int A022 = A07.A02();
        if (A022 <= 0 ? !(A022 >= 0 || A012 > A002) : A002 <= A012) {
            while (true) {
                if (!C18070vi.A18(obj, this.A02[A002]) || !C18070vi.A18(obj2, this.A02[A002 + 1])) {
                    if (A002 == A012) {
                        break;
                    }
                    A002 += A022;
                } else {
                    return A02(r6, A002);
                }
            }
        }
        return this;
    }

    private final C05180Qv A08(C05180Qv r7, int i, int i2) {
        Object[] objArr = r7.A02;
        if (objArr.length == 2 && r7.A01 == 0) {
            Object[] objArr2 = this.A02;
            if (objArr2.length == 1) {
                r7.A00 = this.A01;
                return r7;
            }
            return new C05180Qv((AnonymousClass0EQ) null, A0K(objArr[0], objArr[1], objArr2, i, A0N(i2)), this.A00 ^ i2, i2 ^ this.A01);
        }
        Object[] objArr3 = this.A02;
        Object[] copyOf = Arrays.copyOf(objArr3, objArr3.length);
        C18070vi.A0X(copyOf);
        copyOf[i] = r7;
        return new C05180Qv((AnonymousClass0EQ) null, copyOf, this.A00, this.A01);
    }

    private final C05180Qv A09(C05180Qv r4, C05180Qv r5, AnonymousClass0EQ r6, int i, int i2) {
        if (r5 == null) {
            Object[] objArr = this.A02;
            if (objArr.length == 1) {
                return null;
            }
            AnonymousClass0EQ r0 = this.A03;
            Object[] A0M = A0M(objArr, i);
            if (r0 != r6) {
                return new C05180Qv(r6, A0M, this.A00, i2 ^ this.A01);
            }
            this.A02 = A0M;
            this.A01 ^= i2;
        } else if (this.A03 == r6 || r4 != r5) {
            return A0B(r5, r6, i);
        }
        return this;
    }

    private final C05180Qv A0B(C05180Qv r5, AnonymousClass0EQ r6, int i) {
        Object[] objArr = this.A02;
        int length = objArr.length;
        if (length == 1 && r5.A02.length == 2 && r5.A01 == 0) {
            r5.A00 = this.A01;
            return r5;
        } else if (this.A03 == r6) {
            objArr[i] = r5;
            return this;
        } else {
            Object[] copyOf = Arrays.copyOf(objArr, length);
            C18070vi.A0X(copyOf);
            copyOf[i] = r5;
            return new C05180Qv(r6, copyOf, this.A00, this.A01);
        }
    }

    private final C05180Qv A0C(AnonymousClass0EQ r10, Object obj, Object obj2, Object obj3, Object obj4, int i, int i2, int i3) {
        if (i3 > 30) {
            return new C05180Qv(r10, new Object[]{obj, obj2, obj3, obj4}, 0, 0);
        }
        int i4 = (i >> i3) & 31;
        int i5 = (i2 >> i3) & 31;
        if (i4 != i5) {
            Object[] objArr = new Object[4];
            if (i4 < i5) {
                objArr[0] = obj;
                objArr[1] = obj2;
                objArr[2] = obj3;
                objArr[3] = obj4;
            } else {
                objArr[0] = obj3;
                objArr[1] = obj4;
                objArr[2] = obj;
                objArr[3] = obj2;
            }
            return new C05180Qv(r10, objArr, (1 << i4) | (1 << i5), 0);
        }
        return new C05180Qv(r10, new Object[]{A0C(r10, obj, obj2, obj3, obj4, i, i2, i3 + 5)}, 0, 1 << i4);
    }

    private final C05180Qv A0D(Object obj) {
        C25391Oa A07 = C28851b7.A07(C28851b7.A08(0, this.A02.length));
        int A002 = A07.A00();
        int A012 = A07.A01();
        int A022 = A07.A02();
        if (A022 <= 0 ? !(A022 >= 0 || A012 > A002) : A002 <= A012) {
            while (!C18070vi.A18(obj, this.A02[A002])) {
                if (A002 != A012) {
                    A002 += A022;
                }
            }
            Object[] objArr = this.A02;
            if (objArr.length == 2) {
                return null;
            }
            return new C05180Qv((AnonymousClass0EQ) null, A0L(objArr, A002), 0, 0);
        }
        return this;
    }

    private final C05180Qv A0E(Object obj, int i) {
        Object[] objArr = this.A02;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        C18070vi.A0X(copyOf);
        copyOf[i + 1] = obj;
        return new C05180Qv((AnonymousClass0EQ) null, copyOf, this.A00, this.A01);
    }

    private final Object A0F(Object obj) {
        C25391Oa A07 = C28851b7.A07(C28851b7.A08(0, this.A02.length));
        int A002 = A07.A00();
        int A012 = A07.A01();
        int A022 = A07.A02();
        if (A022 > 0) {
            if (A002 > A012) {
                return null;
            }
        } else if (A022 >= 0 || A012 > A002) {
            return null;
        }
        while (!C18070vi.A18(obj, this.A02[A002])) {
            if (A002 == A012) {
                return null;
            }
            A002 += A022;
        }
        return this.A02[A002 + 1];
    }

    private final boolean A0H(Object obj) {
        C25391Oa A07 = C28851b7.A07(C28851b7.A08(0, this.A02.length));
        int A002 = A07.A00();
        int A012 = A07.A01();
        int A022 = A07.A02();
        if (A022 <= 0 ? !(A022 >= 0 || A012 > A002) : A002 <= A012) {
            while (!C18070vi.A18(obj, this.A02[A002])) {
                if (A002 != A012) {
                    A002 += A022;
                }
            }
            return true;
        }
        return false;
    }

    public static final Object[] A0I(C05180Qv r4, Object[] objArr, int i, int i2) {
        int i3 = i2 - 2;
        int length = objArr.length;
        Object[] objArr2 = new Object[((length - 2) + 1)];
        C200310o.A07(objArr, 0, objArr2, 0, i);
        C200310o.A07(objArr, i, objArr2, i + 2, i2);
        objArr2[i3] = r4;
        C200310o.A07(objArr, i3 + 1, objArr2, i2, length);
        return objArr2;
    }

    public final int A0N(int i) {
        return Integer.bitCount((i - 1) & this.A00) * 2;
    }

    public final int A0O(int i) {
        return (this.A02.length - 1) - Integer.bitCount((i - 1) & this.A01);
    }

    public final C05180Qv A0Q(int i) {
        Object obj = this.A02[i];
        C18070vi.A0z(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode>");
        return (C05180Qv) obj;
    }

    public final C05180Qv A0R(C07370ap r29, C05180Qv r30, AnonymousClass0JI r31, int i) {
        C05180Qv r5;
        C05180Qv r10;
        C05180Qv r3 = r30;
        AnonymousClass0JI r6 = r31;
        if (this == r3) {
            r6.A00 += A00();
            return this;
        }
        C07370ap r9 = r29;
        if (i > 30) {
            return A0A(r3, r6, r9.A03());
        }
        int i2 = this.A01 | r3.A01;
        int i3 = this.A00;
        int i4 = r3.A00;
        int i5 = (i3 ^ i4) & (i2 ^ -1);
        int i6 = i3 & i4;
        while (i6 != 0) {
            int lowestOneBit = Integer.lowestOneBit(i6);
            if (C18070vi.A18(this.A02[A0N(lowestOneBit)], r3.A02[r3.A0N(lowestOneBit)])) {
                i5 |= lowestOneBit;
            } else {
                i2 |= lowestOneBit;
            }
            i6 ^= lowestOneBit;
        }
        if ((i2 & i5) == 0) {
            if (C18070vi.A18(this.A03, r9.A03()) && this.A00 == i5 && this.A01 == i2) {
                r5 = this;
            } else {
                r5 = new C05180Qv((AnonymousClass0EQ) null, new Object[((Integer.bitCount(i5) * 2) + Integer.bitCount(i2))], i5, i2);
            }
            int i7 = 0;
            int i8 = 0;
            while (i2 != 0) {
                int lowestOneBit2 = Integer.lowestOneBit(i2);
                Object[] objArr = r5.A02;
                int length = (objArr.length - 1) - i8;
                int i9 = 0;
                if (AnonymousClass000.A1O(this.A01 & lowestOneBit2)) {
                    r10 = A0Q(A0O(lowestOneBit2));
                    if ((r3.A01 & lowestOneBit2) != 0) {
                        r10 = r10.A0R(r9, r3.A0Q(r3.A0O(lowestOneBit2)), r6, i + 5);
                    } else if ((r3.A00 & lowestOneBit2) != 0) {
                        int A0N = r3.A0N(lowestOneBit2);
                        Object[] objArr2 = r3.A02;
                        Object obj = objArr2[A0N];
                        Object obj2 = objArr2[A0N + 1];
                        int size = r9.size();
                        if (obj != null) {
                            i9 = obj.hashCode();
                        }
                        r10 = r10.A0T(r9, obj, obj2, i9, i + 5);
                        if (r9.size() != size) {
                        }
                        r6.A00++;
                    }
                } else if ((r3.A01 & lowestOneBit2) != 0) {
                    r10 = r3.A0Q(r3.A0O(lowestOneBit2));
                    if ((this.A00 & lowestOneBit2) != 0) {
                        int A0N2 = A0N(lowestOneBit2);
                        Object obj3 = this.A02[A0N2];
                        int i10 = i + 5;
                        if (!r10.A0X(obj3, AnonymousClass001.A0l(obj3), i10)) {
                            Object obj4 = this.A02[A0N2 + 1];
                            if (obj3 != null) {
                                i9 = obj3.hashCode();
                            }
                            r10 = r10.A0T(r9, obj3, obj4, i9, i10);
                        }
                        r6.A00++;
                    }
                } else {
                    int A0N3 = A0N(lowestOneBit2);
                    Object[] objArr3 = this.A02;
                    Object obj5 = objArr3[A0N3];
                    Object obj6 = objArr3[A0N3 + 1];
                    int A0N4 = r3.A0N(lowestOneBit2);
                    Object[] objArr4 = r3.A02;
                    Object obj7 = objArr4[A0N4];
                    Object obj8 = objArr4[A0N4 + 1];
                    int A0l = AnonymousClass001.A0l(obj5);
                    if (obj7 != null) {
                        i9 = obj7.hashCode();
                    }
                    r10 = A0C(r9.A03(), obj5, obj6, obj7, obj8, A0l, i9, i + 5);
                }
                objArr[length] = r10;
                i8++;
                i2 ^= lowestOneBit2;
            }
            while (i5 != 0) {
                int lowestOneBit3 = Integer.lowestOneBit(i5);
                int i11 = i7 * 2;
                if ((r3.A00 & lowestOneBit3) != 0) {
                    int A0N5 = r3.A0N(lowestOneBit3);
                    Object[] objArr5 = r5.A02;
                    Object[] objArr6 = r3.A02;
                    objArr5[i11] = objArr6[A0N5];
                    objArr5[i11 + 1] = objArr6[A0N5 + 1];
                    if ((this.A00 & lowestOneBit3) != 0) {
                        r6.A00++;
                    }
                } else {
                    int A0N6 = A0N(lowestOneBit3);
                    Object[] objArr7 = r5.A02;
                    Object[] objArr8 = this.A02;
                    objArr7[i11] = objArr8[A0N6];
                    objArr7[i11 + 1] = objArr8[A0N6 + 1];
                }
                i7++;
                i5 ^= lowestOneBit3;
            }
            if (A0G(r5)) {
                return this;
            }
            if (r3.A0G(r5)) {
                return r3;
            }
            return r5;
        }
        throw AnonymousClass000.A0n("Check failed.");
    }

    public final C05180Qv A0T(C07370ap r16, Object obj, Object obj2, int i, int i2) {
        C05180Qv A0T;
        int i3 = i;
        int i4 = i2;
        int i5 = 1 << ((i >> i2) & 31);
        C07370ap r8 = r16;
        Object obj3 = obj;
        Object obj4 = obj2;
        if (AnonymousClass000.A1O(this.A00 & i5)) {
            int A0N = A0N(i5);
            if (C18070vi.A18(obj3, this.A02[A0N])) {
                Object obj5 = this.A02[A0N + 1];
                r8.A07(obj5);
                if (obj5 != obj4) {
                    return A05(r8, obj4, A0N);
                }
            } else {
                r8.A04(r8.size() + 1);
                AnonymousClass0EQ A032 = r8.A03();
                AnonymousClass0EQ r4 = this.A03;
                Object obj6 = this.A02[A0N];
                Object[] A0I = A0I(A0C(A032, obj6, this.A02[A0N + 1], obj3, obj4, AnonymousClass001.A0l(obj6), i3, i2 + 5), this.A02, A0N, A0O(i5) + 1);
                if (r4 != A032) {
                    return new C05180Qv(A032, A0I, this.A00 ^ i5, i5 | this.A01);
                }
                this.A02 = A0I;
                this.A00 ^= i5;
                this.A01 |= i5;
                return this;
            }
        } else if ((this.A01 & i5) != 0) {
            int A0O = A0O(i5);
            C05180Qv A0Q = A0Q(A0O);
            if (i4 == 30) {
                A0T = A0Q.A06(r8, obj3, obj4);
            } else {
                A0T = A0Q.A0T(r8, obj3, obj4, i3, i2 + 5);
            }
            if (A0Q != A0T) {
                return A0B(A0T, r8.A03(), A0O);
            }
        } else {
            r8.A04(r8.size() + 1);
            AnonymousClass0EQ A033 = r8.A03();
            int A0N2 = A0N(i5);
            AnonymousClass0EQ r1 = this.A03;
            Object[] objArr = this.A02;
            if (r1 != A033) {
                return new C05180Qv(A033, A0J(obj3, obj4, objArr, A0N2), i5 | this.A00, this.A01);
            }
            this.A02 = A0J(obj3, obj4, objArr, A0N2);
            this.A00 = i5 | this.A00;
            return this;
        }
        return this;
    }

    public C05180Qv(AnonymousClass0EQ r1, Object[] objArr, int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
        this.A03 = r1;
        this.A02 = objArr;
    }

    private final C05180Qv A02(C07370ap r5, int i) {
        r5.A04(r5.size() - 1);
        Object[] objArr = this.A02;
        r5.A07(objArr[i + 1]);
        if (objArr.length == 2) {
            return null;
        }
        if (this.A03 == r5.A03()) {
            this.A02 = A0L(objArr, i);
            return this;
        }
        return new C05180Qv(r5.A03(), A0L(objArr, i), 0, 0);
    }

    private final C05180Qv A03(C07370ap r5, int i, int i2) {
        r5.A04(r5.size() - 1);
        Object[] objArr = this.A02;
        r5.A07(objArr[i + 1]);
        if (objArr.length == 2) {
            return null;
        }
        if (this.A03 == r5.A03()) {
            this.A02 = A0L(objArr, i);
            this.A00 ^= i2;
            return this;
        }
        return new C05180Qv(r5.A03(), A0L(objArr, i), i2 ^ this.A00, this.A01);
    }
}
