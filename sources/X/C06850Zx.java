package X;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

/* renamed from: X.0Zx  reason: invalid class name and case insensitive filesystem */
public final class C06850Zx implements List<AnonymousClass0XW>, C18450wR {
    public int A00;
    public int A01 = -1;
    public long[] A02 = new long[16];
    public Object[] A03 = new Object[16];

    public final void clear() {
        this.A01 = -1;
        A04();
    }

    public Iterator iterator() {
        return new C06930a5(this, 0, 7);
    }

    public ListIterator listIterator(int i) {
        return new C06930a5(this, i, 6);
    }

    public Object[] toArray() {
        return C25916Coa.A00(this);
    }

    public Object[] toArray(Object[] objArr) {
        return C25916Coa.A01(this, objArr);
    }

    private final long A02() {
        long A0r = AnonymousClass001.A0r((long) Float.floatToIntBits(Float.POSITIVE_INFINITY));
        int i = this.A01 + 1;
        int A04 = AnonymousClass1ZU.A04(this);
        if (i <= A04) {
            while (true) {
                long j = this.A02[i];
                if (A00(j, A0r) < 0) {
                    A0r = j;
                }
                if ((AnonymousClass001.A02(A0r) < 0.0f && AnonymousClass000.A0H(A0r) != 0) || i == A04) {
                    break;
                }
                i++;
            }
        }
        return A0r;
    }

    private final void A03() {
        int i = this.A01;
        Object[] objArr = this.A03;
        int length = objArr.length;
        if (i >= length) {
            int i2 = length + 16;
            Object[] copyOf = Arrays.copyOf(objArr, i2);
            C18070vi.A0X(copyOf);
            this.A03 = copyOf;
            long[] copyOf2 = Arrays.copyOf(this.A02, i2);
            C18070vi.A0X(copyOf2);
            this.A02 = copyOf2;
        }
    }

    private final void A04() {
        int i = this.A01 + 1;
        int A04 = AnonymousClass1ZU.A04(this);
        if (i <= A04) {
            while (true) {
                this.A03[i] = null;
                if (i == A04) {
                    break;
                }
                i++;
            }
        }
        this.A00 = this.A01 + 1;
    }

    /* renamed from: A09 */
    public AnonymousClass0XW get(int i) {
        Object obj = this.A03[i];
        C18070vi.A0z(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
        return (AnonymousClass0XW) obj;
    }

    public final void A0B(AnonymousClass0XW r10, C18090vk r11, float f, boolean z) {
        long j;
        int i = this.A01;
        this.A01 = i + 1;
        A03();
        Object[] objArr = this.A03;
        int i2 = this.A01;
        objArr[i2] = r10;
        long[] jArr = this.A02;
        long floatToIntBits = (long) Float.floatToIntBits(f);
        if (z) {
            j = 1;
        } else {
            j = 0;
        }
        jArr[i2] = (j & 4294967295L) | (floatToIntBits << 32);
        A04();
        r11.invoke();
        this.A01 = i;
    }

    public final void A0C(AnonymousClass0XW r7, C18090vk r8, float f, boolean z) {
        if (this.A01 == AnonymousClass1ZU.A04(this)) {
            A0B(r7, r8, f, z);
            if (this.A01 + 1 == AnonymousClass1ZU.A04(this)) {
                A04();
                return;
            }
            return;
        }
        long A022 = A02();
        int i = this.A01;
        this.A01 = AnonymousClass1ZU.A04(this);
        A0B(r7, r8, f, z);
        if (this.A01 + 1 < AnonymousClass1ZU.A04(this) && A00(A022, A02()) > 0) {
            int i2 = this.A01 + 1;
            int i3 = i + 1;
            Object[] objArr = this.A03;
            C200310o.A07(objArr, i3, objArr, i2, size());
            long[] jArr = this.A02;
            C200310o.A05(jArr, jArr, i3, i2, size());
            this.A01 = ((size() + i) - this.A01) - 1;
        }
        A04();
        this.A01 = i;
    }

    public final void A0D(AnonymousClass0XW r2, C18090vk r3, boolean z) {
        A0B(r2, r3, -1.0f, z);
    }

    public final boolean A0F(float f, boolean z) {
        long j;
        if (this.A01 == AnonymousClass1ZU.A04(this)) {
            return true;
        }
        long floatToIntBits = (long) Float.floatToIntBits(f);
        if (z) {
            j = 1;
        } else {
            j = 0;
        }
        long j2 = j & 4294967295L;
        if (A00(A02(), j2 | (floatToIntBits << 32)) <= 0) {
            return false;
        }
        return true;
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof AnonymousClass0XW)) {
            return false;
        }
        return AnonymousClass000.A1S(indexOf(obj), -1);
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof AnonymousClass0XW)) {
            return -1;
        }
        return A07((AnonymousClass0XW) obj);
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof AnonymousClass0XW)) {
            return -1;
        }
        return A08((AnonymousClass0XW) obj);
    }

    public List subList(int i, int i2) {
        return new C06840Zw(this, i, i2);
    }

    public int A07(AnonymousClass0XW r4) {
        int A04 = AnonymousClass1ZU.A04(this);
        if (A04 < 0) {
            return -1;
        }
        int i = 0;
        while (!C18070vi.A18(this.A03[i], r4)) {
            if (i == A04) {
                return -1;
            }
            i++;
        }
        return i;
    }

    public int A08(AnonymousClass0XW r3) {
        for (int A04 = AnonymousClass1ZU.A04(this); -1 < A04; A04--) {
            if (C18070vi.A18(this.A03[A04], r3)) {
                return A04;
            }
        }
        return -1;
    }

    public final void A0A() {
        this.A01 = size() - 1;
    }

    public final boolean A0E() {
        long A022 = A02();
        if (AnonymousClass001.A02(A022) >= 0.0f || AnonymousClass000.A0H(A022) == 0) {
            return false;
        }
        return true;
    }

    public /* bridge */ /* synthetic */ void add(int i, Object obj) {
        throw AnonymousClass000.A12();
    }

    public boolean addAll(int i, Collection collection) {
        throw AnonymousClass000.A12();
    }

    public boolean containsAll(Collection collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public boolean isEmpty() {
        return AnonymousClass000.A1P(size());
    }

    public /* bridge */ /* synthetic */ Object remove(int i) {
        throw AnonymousClass000.A12();
    }

    public boolean removeAll(Collection collection) {
        throw AnonymousClass000.A12();
    }

    public void replaceAll(UnaryOperator unaryOperator) {
        throw AnonymousClass000.A12();
    }

    public boolean retainAll(Collection collection) {
        throw AnonymousClass000.A12();
    }

    public /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        throw AnonymousClass000.A12();
    }

    public final /* bridge */ int size() {
        return this.A00;
    }

    public void sort(Comparator comparator) {
        throw AnonymousClass000.A12();
    }

    public static final int A00(long j, long j2) {
        boolean A1O = AnonymousClass000.A1O((int) (j & 4294967295L));
        if (A1O == AnonymousClass000.A1O((int) (j2 & 4294967295L))) {
            return (int) Math.signum(AnonymousClass000.A03(j) - AnonymousClass000.A03(j2));
        }
        if (A1O) {
            return -1;
        }
        return 1;
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw AnonymousClass000.A12();
    }

    public boolean addAll(Collection collection) {
        throw AnonymousClass000.A12();
    }

    public ListIterator listIterator() {
        return new C06930a5(this, 0, 7);
    }

    public boolean remove(Object obj) {
        throw AnonymousClass000.A12();
    }
}
