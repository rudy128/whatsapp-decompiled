package X;

/* renamed from: X.2kK  reason: invalid class name and case insensitive filesystem */
public class C58212kK {
    public final Class A00;

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C58212kK)) {
            return false;
        }
        String canonicalName = this.A00.getCanonicalName();
        return canonicalName != null && canonicalName.equals(((C58212kK) obj).A00.getCanonicalName());
    }

    public int hashCode() {
        Class cls = this.A00;
        if (cls.getCanonicalName() == null) {
            return 0;
        }
        return cls.getCanonicalName().hashCode();
    }

    public C58212kK(Class cls) {
        this.A00 = cls;
    }
}
