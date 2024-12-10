package X;

/* renamed from: X.Ca2  reason: case insensitive filesystem */
public class C25151Ca2 {
    public Object A00;
    public Object A01;

    public boolean equals(Object obj) {
        if (!(obj instanceof C19760yx)) {
            return false;
        }
        C19760yx r4 = (C19760yx) obj;
        Object obj2 = r4.A00;
        Object obj3 = this.A00;
        if (obj2 != obj3 && (obj2 == null || !obj2.equals(obj3))) {
            return false;
        }
        Object obj4 = r4.A01;
        Object obj5 = this.A01;
        if (obj4 == obj5 || (obj4 != null && obj4.equals(obj5))) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return AnonymousClass001.A0k(this.A00) ^ C17880vN.A02(this.A01);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Pair{");
        A10.append(this.A00);
        BE6.A1J(A10);
        return AnonymousClass8BX.A0d(this.A01, A10);
    }
}
