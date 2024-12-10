package X;

/* renamed from: X.1wb  reason: invalid class name and case insensitive filesystem */
public final class C41541wb extends C41531wa {
    public final int A00;
    public final String A01;
    public final String A02;

    public C41541wb(String str, String str2, int i) {
        C18070vi.A0d(str2, 2);
        this.A02 = str;
        this.A01 = str2;
        this.A00 = i;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C41541wb) {
                C41541wb r5 = (C41541wb) obj;
                if (!C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A01, r5.A01) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((this.A02.hashCode() * 31) + this.A01.hashCode()) * 31) + this.A00;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("StaticFilter(filterType=");
        sb.append(this.A02);
        sb.append(", filterName=");
        sb.append(this.A01);
        sb.append(", unreadCount=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }
}
