package X;

import java.util.List;

/* renamed from: X.2AQ  reason: invalid class name */
public final class AnonymousClass2AQ extends C49602Rd {
    public final String A00;
    public final List A01;

    public boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof C49602Rd)) {
                return false;
            }
            AnonymousClass2AQ r4 = (AnonymousClass2AQ) ((C49602Rd) obj);
            if (!this.A00.equals(r4.A00) || !this.A01.equals(r4.A01)) {
                return false;
            }
        }
        return true;
    }

    public AnonymousClass2AQ(String str, List list) {
        if (str != null) {
            this.A00 = str;
            this.A01 = list;
            return;
        }
        throw AnonymousClass000.A0s("Null userAgent");
    }

    public int hashCode() {
        return ((1000003 ^ this.A00.hashCode()) * 1000003) ^ this.A01.hashCode();
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("HeartBeatResult{userAgent=");
        A10.append(this.A00);
        A10.append(", usedDates=");
        A10.append(this.A01);
        return AnonymousClass000.A0y("}", A10);
    }
}
