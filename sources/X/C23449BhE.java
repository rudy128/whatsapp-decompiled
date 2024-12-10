package X;

import java.util.Arrays;
import java.util.RandomAccess;

/* renamed from: X.BhE  reason: case insensitive filesystem */
public final class C23449BhE<E> extends C27294DbN<E> implements RandomAccess {
    public static final C23449BhE A02;
    public int A00 = 0;
    public Object[] A01 = new Object[10];

    /* JADX WARNING: type inference failed for: r0v0, types: [X.DbN, X.BhE] */
    static {
        ? dbN = new C27294DbN();
        dbN.A01 = new Object[0];
        dbN.A00 = 0;
        A02 = dbN;
        dbN.A00 = false;
    }

    private final void A00(int i) {
        if (i < 0 || i >= this.A00) {
            throw BE6.A0l(BEB.A0f(BE6.A0t(35), i, this.A00));
        }
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [X.DbN, X.BhE, X.EE8] */
    public final /* synthetic */ EE8 CSz(int i) {
        if (i >= this.A00) {
            Object[] copyOf = Arrays.copyOf(this.A01, i);
            int i2 = this.A00;
            ? dbN = new C27294DbN();
            dbN.A01 = copyOf;
            dbN.A00 = i2;
            return dbN;
        }
        throw BE6.A0j();
    }

    public final int size() {
        return this.A00;
    }

    public final void add(int i, Object obj) {
        int i2;
        A01();
        if (i < 0 || i > (i2 = this.A00)) {
            throw BE6.A0l(BEB.A0f(BE6.A0t(35), i, this.A00));
        }
        Object[] objArr = this.A01;
        if (i2 < objArr.length) {
            System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
        } else {
            Object[] objArr2 = new Object[(((i2 * 3) / 2) + 1)];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            System.arraycopy(this.A01, i, objArr2, i + 1, this.A00 - i);
            this.A01 = objArr2;
        }
        this.A01[i] = obj;
        this.A00++;
        this.modCount++;
    }

    public final Object get(int i) {
        A00(i);
        return this.A01[i];
    }

    public final Object remove(int i) {
        A01();
        A00(i);
        Object[] objArr = this.A01;
        Object obj = objArr[i];
        BEA.A1D(objArr, this.A00, i);
        this.A00--;
        this.modCount++;
        return obj;
    }

    public final Object set(int i, Object obj) {
        A01();
        A00(i);
        Object[] objArr = this.A01;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        this.modCount++;
        return obj2;
    }

    public final boolean add(Object obj) {
        A01();
        int i = this.A00;
        Object[] objArr = this.A01;
        if (i == objArr.length) {
            objArr = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
            this.A01 = objArr;
        }
        int i2 = this.A00;
        this.A00 = i2 + 1;
        objArr[i2] = obj;
        this.modCount++;
        return true;
    }
}
