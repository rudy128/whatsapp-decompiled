package X;

/* renamed from: X.BjM  reason: case insensitive filesystem */
public final class C23532BjM extends C24439C3v {
    public final int A00;
    public final long A01;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof C24439C3v) {
                C23532BjM bjM = (C23532BjM) ((C24439C3v) obj);
                if (!(this.A00 == bjM.A00 && this.A01 == bjM.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.A01;
        return ((this.A00 ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public C23532BjM(int i, long j) {
        this.A00 = i;
        this.A01 = j;
    }

    public final String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("EventRecord{eventType=");
        A10.append(this.A00);
        A10.append(", eventTimestamp=");
        A10.append(this.A01);
        return AnonymousClass000.A0y("}", A10);
    }
}
