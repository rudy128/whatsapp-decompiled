package X;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

public final class Bm7 extends C27296DbR<Integer> implements C28667EDj, RandomAccess, C28460E2b {
    public static final Bm7 A02;
    public int A00 = 0;
    public int[] A01 = new int[10];

    /* JADX WARNING: type inference failed for: r0v0, types: [X.DbR, X.Bm7] */
    static {
        ? dbR = new C27296DbR();
        dbR.A01 = new int[0];
        dbR.A00 = 0;
        A02 = dbR;
        dbR.A00 = false;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Bm7)) {
                return super.equals(obj);
            }
            Bm7 bm7 = (Bm7) obj;
            int i = this.A00;
            if (i == bm7.A00) {
                int[] iArr = bm7.A01;
                int i2 = 0;
                while (i2 < i) {
                    if (this.A01[i2] == iArr[i2]) {
                        i2++;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.A00; i2++) {
            i = (i * 31) + this.A01[i2];
        }
        return i;
    }

    public static void A00(Bm7 bm7, int i) {
        if (i < 0 || i >= bm7.A00) {
            throw BE6.A0l(C17880vN.A0t(BEA.A0r(i), bm7.A00));
        }
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [X.DbR, X.Bm7, X.EE9] */
    public /* bridge */ /* synthetic */ EE9 Bk8(int i) {
        if (i >= this.A00) {
            int[] copyOf = Arrays.copyOf(this.A01, i);
            int i2 = this.A00;
            ? dbR = new C27296DbR();
            dbR.A01 = copyOf;
            dbR.A00 = i2;
            return dbR;
        }
        throw BE6.A0j();
    }

    public int indexOf(Object obj) {
        if (obj instanceof Integer) {
            int A0M = AnonymousClass000.A0M(obj);
            int size = size();
            for (int i = 0; i < size; i++) {
                if (this.A01[i] == A0M) {
                    return i;
                }
            }
        }
        return -1;
    }

    public int size() {
        return this.A00;
    }

    public void BBE(int i) {
        A01();
        int i2 = this.A00;
        int[] iArr = this.A01;
        if (i2 == iArr.length) {
            iArr = BE9.A1b(iArr, i2 * 3, i2);
            this.A01 = iArr;
        }
        int i3 = this.A00;
        this.A00 = i3 + 1;
        iArr[i3] = i;
    }

    public /* bridge */ /* synthetic */ void add(int i, Object obj) {
        int i2;
        int A0M = AnonymousClass000.A0M(obj);
        A01();
        if (i < 0 || i > (i2 = this.A00)) {
            throw BE6.A0l(C17880vN.A0t(BEA.A0r(i), this.A00));
        }
        int[] iArr = this.A01;
        if (i2 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
        } else {
            int[] A1b = BE9.A1b(iArr, i2 * 3, i);
            System.arraycopy(this.A01, i, A1b, i + 1, this.A00 - i);
            this.A01 = A1b;
        }
        this.A01[i] = A0M;
        this.A00++;
        this.modCount++;
    }

    public boolean addAll(Collection collection) {
        A01();
        Charset charset = CIC.A04;
        if (collection == null) {
            throw BE6.A0m();
        } else if (!(collection instanceof Bm7)) {
            return super.addAll(collection);
        } else {
            Bm7 bm7 = (Bm7) collection;
            int i = bm7.A00;
            if (i == 0) {
                return false;
            }
            int i2 = this.A00;
            if (Integer.MAX_VALUE - i2 >= i) {
                int i3 = i2 + i;
                int[] iArr = this.A01;
                if (i3 > iArr.length) {
                    iArr = Arrays.copyOf(iArr, i3);
                    this.A01 = iArr;
                }
                System.arraycopy(bm7.A01, 0, iArr, this.A00, bm7.A00);
                this.A00 = i3;
                this.modCount++;
                return true;
            }
            throw new OutOfMemoryError();
        }
    }

    public boolean contains(Object obj) {
        return AnonymousClass000.A1S(indexOf(obj), -1);
    }

    public /* bridge */ /* synthetic */ Object get(int i) {
        A00(this, i);
        return Integer.valueOf(this.A01[i]);
    }

    public /* bridge */ /* synthetic */ Object remove(int i) {
        A01();
        A00(this, i);
        int[] iArr = this.A01;
        int i2 = iArr[i];
        BEA.A1D(iArr, this.A00, i);
        this.A00--;
        this.modCount++;
        return Integer.valueOf(i2);
    }

    public void removeRange(int i, int i2) {
        A01();
        if (i2 >= i) {
            int[] iArr = this.A01;
            System.arraycopy(iArr, i2, iArr, i, this.A00 - i2);
            this.A00 -= i2 - i;
            this.modCount++;
            return;
        }
        throw BE6.A0l("toIndex < fromIndex");
    }

    public /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int A0M = AnonymousClass000.A0M(obj);
        A01();
        A00(this, i);
        int[] iArr = this.A01;
        int i2 = iArr[i];
        iArr[i] = A0M;
        return Integer.valueOf(i2);
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        BBE(AnonymousClass000.A0M(obj));
        return true;
    }
}
