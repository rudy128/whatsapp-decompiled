package X;

/* renamed from: X.1bS  reason: invalid class name and case insensitive filesystem */
public class C29021bS implements C29011bR {
    public int A00;
    public final Object[] A01;

    public boolean CEF(Object obj) {
        C18070vi.A0d(obj, 0);
        int i = this.A00;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.A01[i2] == obj) {
                throw new IllegalStateException("Already in the pool!");
            }
        }
        Object[] objArr = this.A01;
        if (i >= objArr.length) {
            return false;
        }
        objArr[i] = obj;
        this.A00 = i + 1;
        return true;
    }

    public Object BAf() {
        int i = this.A00;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.A01;
        Object obj = objArr[i2];
        C18070vi.A0z(obj, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
        objArr[i2] = null;
        this.A00--;
        return obj;
    }

    public C29021bS(int i) {
        if (i > 0) {
            this.A01 = new Object[i];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }
}
