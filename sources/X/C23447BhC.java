package X;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: X.BhC  reason: case insensitive filesystem */
public final class C23447BhC extends C27294DbN<Integer> implements EE8<Integer>, E2B, RandomAccess {
    public static final C23447BhC A02;
    public int A00 = 0;
    public int[] A01 = new int[10];

    /* JADX WARNING: type inference failed for: r0v0, types: [X.DbN, X.BhC] */
    static {
        ? dbN = new C27294DbN();
        dbN.A01 = new int[0];
        dbN.A00 = 0;
        A02 = dbN;
        dbN.A00 = false;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C23447BhC)) {
                return super.equals(obj);
            }
            C23447BhC bhC = (C23447BhC) obj;
            int i = this.A00;
            if (i == bhC.A00) {
                int[] iArr = bhC.A01;
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

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.A00; i2++) {
            i = (i * 31) + this.A01[i2];
        }
        return i;
    }

    public static final void A00(C23447BhC bhC, int i) {
        if (i < 0 || i >= bhC.A00) {
            throw BE6.A0l(BEB.A0f(BE6.A0t(35), i, bhC.A00));
        }
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [X.DbN, X.BhC, X.EE8] */
    public final /* synthetic */ EE8 CSz(int i) {
        if (i >= this.A00) {
            int[] copyOf = Arrays.copyOf(this.A01, i);
            int i2 = this.A00;
            ? dbN = new C27294DbN();
            dbN.A01 = copyOf;
            dbN.A00 = i2;
            return dbN;
        }
        throw BE6.A0j();
    }

    public final int indexOf(Object obj) {
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

    public final int size() {
        return this.A00;
    }

    public final void A02(int i) {
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

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        int A0M = AnonymousClass000.A0M(obj);
        A01();
        if (i < 0 || i > (i2 = this.A00)) {
            throw BE6.A0l(BEB.A0f(BE6.A0t(35), i, this.A00));
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

    public final boolean addAll(Collection collection) {
        A01();
        Charset charset = C25462CgF.A00;
        if (collection == null) {
            throw BE6.A0m();
        } else if (!(collection instanceof C23447BhC)) {
            return super.addAll(collection);
        } else {
            C23447BhC bhC = (C23447BhC) collection;
            int i = bhC.A00;
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
                System.arraycopy(bhC.A01, 0, iArr, this.A00, bhC.A00);
                this.A00 = i3;
                this.modCount++;
                return true;
            }
            throw new OutOfMemoryError();
        }
    }

    public final boolean contains(Object obj) {
        return AnonymousClass000.A1S(indexOf(obj), -1);
    }

    public final /* synthetic */ Object get(int i) {
        A00(this, i);
        return Integer.valueOf(this.A01[i]);
    }

    public final /* synthetic */ Object remove(int i) {
        A01();
        A00(this, i);
        int[] iArr = this.A01;
        int i2 = iArr[i];
        BEA.A1D(iArr, this.A00, i);
        this.A00--;
        this.modCount++;
        return Integer.valueOf(i2);
    }

    public final void removeRange(int i, int i2) {
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

    public final /* synthetic */ Object set(int i, Object obj) {
        int A0M = AnonymousClass000.A0M(obj);
        A01();
        A00(this, i);
        int[] iArr = this.A01;
        int i2 = iArr[i];
        iArr[i] = A0M;
        return Integer.valueOf(i2);
    }

    public final /* synthetic */ boolean add(Object obj) {
        A02(AnonymousClass000.A0M(obj));
        return true;
    }
}
