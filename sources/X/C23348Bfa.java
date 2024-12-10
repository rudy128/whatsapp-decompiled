package X;

import java.util.Iterator;

/* renamed from: X.Bfa  reason: case insensitive filesystem */
public final class C23348Bfa extends C23341BfT {
    public static final C23348Bfa A05;
    public static final Object[] A06;
    public final transient int A00;
    public final transient Object[] A01;
    public final transient Object[] A02;
    public final transient int A03;
    public final transient int A04;

    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.A02;
            if (objArr.length != 0) {
                int rotateLeft = (int) (((long) Integer.rotateLeft((int) (BE6.A0O(obj) * -862048943), 15)) * 461845907);
                while (true) {
                    int i = rotateLeft & this.A04;
                    Object obj2 = objArr[i];
                    if (obj2 == null) {
                        break;
                    } else if (obj2.equals(obj)) {
                        return true;
                    } else {
                        rotateLeft = i + 1;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.A03;
    }

    public final int size() {
        return this.A00;
    }

    static {
        Object[] A1Z = BE6.A1Z();
        A06 = A1Z;
        A05 = new C23348Bfa(A1Z, 0, A1Z, 0, 0);
    }

    public C23348Bfa(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.A01 = objArr;
        this.A03 = i;
        this.A02 = objArr2;
        this.A04 = i2;
        this.A00 = i3;
    }

    public final /* synthetic */ Iterator iterator() {
        return A09().listIterator(0);
    }
}
