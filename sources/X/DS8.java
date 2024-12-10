package X;

public final class DS8 implements Comparable {
    public int A00;
    public long A01;
    public Object A02;
    public final C25257Cbw A03;

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        DS8 ds8 = (DS8) obj;
        Object obj2 = this.A02;
        if (AnonymousClass000.A1X(obj2) != AnonymousClass000.A1X(ds8.A02)) {
            if (obj2 != null) {
                return -1;
            }
            return 1;
        } else if (obj2 == null) {
            return 0;
        } else {
            int i = this.A00 - ds8.A00;
            if (i != 0) {
                return i;
            }
            long j = this.A01;
            long j2 = ds8.A01;
            if (j >= j2) {
                if (j == j2) {
                    return 0;
                }
                return 1;
            }
        }
        return -1;
    }

    public DS8(C25257Cbw cbw) {
        this.A03 = cbw;
    }
}
