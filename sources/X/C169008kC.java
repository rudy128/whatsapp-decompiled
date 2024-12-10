package X;

/* renamed from: X.8kC  reason: invalid class name and case insensitive filesystem */
public class C169008kC extends C174058wA {
    public final String A00;

    public C169008kC(C22419B7b b7b, String str, int i) {
        super(b7b, 59, i);
        this.A00 = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        return this.A00.equals(((C169008kC) obj).A00);
    }

    public int hashCode() {
        return this.A00.hashCode();
    }
}
