package X;

import java.util.List;

/* renamed from: X.20d  reason: invalid class name and case insensitive filesystem */
public final class C435920d {
    public final String A00;
    public final String A01;
    public final List A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C435920d) {
                C435920d r5 = (C435920d) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((this.A00.hashCode() * 31) + this.A01.hashCode()) * 31) + this.A02.hashCode()) * 31) + 1346661443;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Section(name=");
        sb.append(this.A00);
        sb.append(", type=");
        sb.append(this.A01);
        sb.append(", bots=");
        sb.append(this.A02);
        sb.append(", displayType=");
        sb.append("listview");
        sb.append(')');
        return sb.toString();
    }

    public C435920d(String str, String str2, List list) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = list;
    }
}
