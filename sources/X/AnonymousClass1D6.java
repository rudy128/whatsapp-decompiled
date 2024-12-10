package X;

import java.io.Serializable;
import java.util.AbstractCollection;

/* renamed from: X.1D6  reason: invalid class name */
public final class AnonymousClass1D6 implements Serializable {
    public final Object first;
    public final Object second;

    public final Object A04() {
        return this.first;
    }

    public final Object A05() {
        return this.second;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass1D6) {
                AnonymousClass1D6 r5 = (AnonymousClass1D6) obj;
                if (!C18070vi.A18(this.first, r5.first) || !C18070vi.A18(this.second, r5.second)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Object obj = this.first;
        int i = 0;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.second;
        if (obj2 != null) {
            i = obj2.hashCode();
        }
        return hashCode + i;
    }

    public static AnonymousClass1D6 A01(Object obj, Object obj2) {
        return new AnonymousClass1D6(obj, obj2);
    }

    public static void A02(Object obj, Object obj2, AbstractCollection abstractCollection) {
        abstractCollection.add(new AnonymousClass1D6(obj, obj2));
    }

    public static void A03(Object obj, Object obj2, Object[] objArr, int i) {
        objArr[i] = new AnonymousClass1D6(obj, obj2);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('(');
        sb.append(this.first);
        sb.append(", ");
        sb.append(this.second);
        sb.append(')');
        return sb.toString();
    }

    public AnonymousClass1D6(Object obj, Object obj2) {
        this.first = obj;
        this.second = obj2;
    }

    public static AnonymousClass1D6 A00(Object obj, int i) {
        return new AnonymousClass1D6(obj, Integer.valueOf(i));
    }

    public final Object A06() {
        return this.first;
    }

    public final Object A07() {
        return this.second;
    }
}
