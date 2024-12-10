package X;

import java.util.Arrays;
import java.util.Set;

/* renamed from: X.BfT  reason: case insensitive filesystem */
public abstract class C23341BfT extends C27288DbH implements Set {
    public transient C23345BfX A00;

    public static int A02(int i) {
        int i2;
        int max = Math.max(i, 2);
        if (max < 751619276) {
            i2 = Integer.highestOneBit(max - 1);
            do {
                i2 += i2;
            } while (((double) i2) * 0.7d < ((double) max));
        } else {
            i2 = 1073741824;
            if (max >= 1073741824) {
                throw AnonymousClass000.A0k("collection too large");
            }
        }
        return i2;
    }

    public static C23341BfT A03(Object[] objArr, int i) {
        int i2 = i;
        Object[] objArr2 = objArr;
        if (i == 0) {
            return C23348Bfa.A05;
        }
        if (i != 1) {
            int A02 = A02(i);
            Object[] objArr3 = new Object[A02];
            int i3 = A02 - 1;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            while (i4 < i2) {
                Object obj = objArr2[i4];
                if (obj != null) {
                    int hashCode = obj.hashCode();
                    int rotateLeft = (int) (((long) Integer.rotateLeft((int) (((long) hashCode) * -862048943), 15)) * 461845907);
                    while (true) {
                        int i7 = rotateLeft & i3;
                        Object obj2 = objArr3[i7];
                        if (obj2 != null) {
                            if (obj2.equals(obj)) {
                                break;
                            }
                            rotateLeft++;
                        } else {
                            objArr2[i6] = obj;
                            objArr3[i7] = obj;
                            i5 += hashCode;
                            i6++;
                            break;
                        }
                    }
                    i4++;
                } else {
                    throw AnonymousClass000.A0s(AnonymousClass001.A1I("at index ", AnonymousClass000.A10(), i4));
                }
            }
            Arrays.fill(objArr2, i6, i2, (Object) null);
            if (i6 != 1) {
                if (A02(i6) < A02 / 2) {
                    return A03(objArr2, i6);
                }
                if (i6 <= 0) {
                    objArr2 = Arrays.copyOf(objArr2, i6);
                }
                return new C23348Bfa(objArr2, i5, objArr3, i3, i6);
            }
        }
        Object obj3 = objArr2[0];
        obj3.getClass();
        return new C23339BfR(obj3);
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if ((!(obj instanceof C23341BfT) || !(this instanceof C23348Bfa) || !(((C23341BfT) obj) instanceof C23348Bfa) || hashCode() == obj.hashCode()) && (obj instanceof Set)) {
                Set set = (Set) obj;
                try {
                    if (size() != set.size() || !containsAll(set)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return false;
        }
        return true;
    }

    public C23345BfX A09() {
        Object[] array;
        int length;
        C23345BfX bfQ;
        if (this instanceof C23339BfR) {
            return C23345BfX.A01(((C23339BfR) this).A00);
        }
        if (this instanceof C23340BfS) {
            return ((C23340BfS) this).A01;
        }
        C23345BfX bfX = this.A00;
        if (bfX != null) {
            return bfX;
        }
        if (this instanceof C23348Bfa) {
            C23348Bfa bfa = (C23348Bfa) this;
            array = bfa.A01;
            length = bfa.A00;
        } else if (this instanceof C23347BfZ) {
            bfQ = new C23338BfQ((C23347BfZ) this);
            this.A00 = bfQ;
            return bfQ;
        } else {
            array = toArray();
            length = array.length;
        }
        C23355Bfh bfh = C23345BfX.A00;
        if (length == 0) {
            bfQ = C23344BfW.A02;
        } else {
            bfQ = new C23344BfW(array, length);
        }
        this.A00 = bfQ;
        return bfQ;
    }

    public int hashCode() {
        int i = 0;
        for (Object A0l : this) {
            i += AnonymousClass001.A0l(A0l);
        }
        return i;
    }
}
