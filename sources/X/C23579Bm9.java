package X;

import java.util.Arrays;
import java.util.RandomAccess;

/* renamed from: X.Bm9  reason: case insensitive filesystem */
public final class C23579Bm9<E> extends C27296DbR<E> implements RandomAccess {
    public static final C23579Bm9 A02;
    public int A00 = 0;
    public Object[] A01 = new Object[10];

    /* JADX WARNING: type inference failed for: r0v0, types: [X.DbR, X.Bm9] */
    static {
        ? dbR = new C27296DbR();
        dbR.A01 = new Object[0];
        dbR.A00 = 0;
        A02 = dbR;
        dbR.A00 = false;
    }

    private void A00(int i) {
        if (i < 0 || i >= this.A00) {
            throw BE6.A0l(C17880vN.A0t(BEA.A0r(i), this.A00));
        }
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [X.DbR, X.Bm9, X.EE9] */
    public /* bridge */ /* synthetic */ EE9 Bk8(int i) {
        if (i >= this.A00) {
            Object[] copyOf = Arrays.copyOf(this.A01, i);
            int i2 = this.A00;
            ? dbR = new C27296DbR();
            dbR.A01 = copyOf;
            dbR.A00 = i2;
            return dbR;
        }
        throw BE6.A0j();
    }

    public int size() {
        return this.A00;
    }

    public void add(int i, Object obj) {
        int i2;
        A01();
        if (i < 0 || i > (i2 = this.A00)) {
            throw BE6.A0l(C17880vN.A0t(BEA.A0r(i), this.A00));
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

    public Object get(int i) {
        A00(i);
        return this.A01[i];
    }

    public Object remove(int i) {
        A01();
        A00(i);
        Object[] objArr = this.A01;
        Object obj = objArr[i];
        BEA.A1D(objArr, this.A00, i);
        this.A00--;
        this.modCount++;
        return obj;
    }

    public Object set(int i, Object obj) {
        A01();
        A00(i);
        Object[] objArr = this.A01;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        this.modCount++;
        return obj2;
    }

    public boolean add(Object obj) {
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
