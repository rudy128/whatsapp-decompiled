package X;

import com.google.firebase.components.Qualified$Unqualified;

/* renamed from: X.0wW  reason: invalid class name and case insensitive filesystem */
public final class C18490wW {
    public final int A00;
    public final int A01;
    public final C18350wG A02;

    public C18490wW(Class cls, int i, int i2) {
        this(new C18350wG(Qualified$Unqualified.class, cls), i, i2);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C18490wW)) {
            return false;
        }
        C18490wW r4 = (C18490wW) obj;
        if (this.A02.equals(r4.A02) && this.A01 == r4.A01 && this.A00 == r4.A00) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((this.A02.hashCode() ^ 1000003) * 1000003) ^ this.A01) * 1000003) ^ this.A00;
    }

    public String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.A02);
        sb.append(", type=");
        int i = this.A01;
        if (i == 1) {
            str = "required";
        } else if (i == 0) {
            str = "optional";
        } else {
            str = "set";
        }
        sb.append(str);
        sb.append(", injection=");
        if (this.A00 != 0) {
            str2 = "provider";
        } else {
            str2 = "direct";
        }
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }

    public C18490wW(C18350wG r1, int i, int i2) {
        this.A02 = r1;
        this.A01 = i;
        this.A00 = i2;
    }
}
