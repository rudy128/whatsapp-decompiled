package X;

/* renamed from: X.0wd  reason: invalid class name and case insensitive filesystem */
public final class C18540wd extends C18530wc {
    public final String A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof C18530wc)) {
                return false;
            }
            C18540wd r4 = (C18540wd) ((C18530wc) obj);
            if (!this.A00.equals(r4.A00) || !this.A01.equals(r4.A01)) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LibraryVersion{libraryName=");
        sb.append(this.A00);
        sb.append(", version=");
        sb.append(this.A01);
        sb.append("}");
        return sb.toString();
    }

    public C18540wd(String str, String str2) {
        this.A00 = str;
        if (str2 != null) {
            this.A01 = str2;
            return;
        }
        throw new NullPointerException("Null version");
    }

    public int hashCode() {
        return ((1000003 ^ this.A00.hashCode()) * 1000003) ^ this.A01.hashCode();
    }
}
