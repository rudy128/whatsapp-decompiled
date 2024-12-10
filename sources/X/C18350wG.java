package X;

import com.google.firebase.components.Qualified$Unqualified;

/* renamed from: X.0wG  reason: invalid class name and case insensitive filesystem */
public final class C18350wG {
    public final Class A00;
    public final Class A01;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C18350wG r4 = (C18350wG) obj;
            if (this.A01.equals(r4.A01)) {
                return this.A00.equals(r4.A00);
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.A01.hashCode() * 31) + this.A00.hashCode();
    }

    public String toString() {
        Class<Qualified$Unqualified> cls = this.A00;
        if (cls == Qualified$Unqualified.class) {
            return this.A01.getName();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("@");
        sb.append(cls.getName());
        sb.append(" ");
        sb.append(this.A01.getName());
        return sb.toString();
    }

    public C18350wG(Class cls, Class cls2) {
        this.A00 = cls;
        this.A01 = cls2;
    }
}
