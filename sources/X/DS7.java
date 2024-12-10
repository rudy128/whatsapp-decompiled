package X;

public class DS7 implements Comparable {
    public final long A00;
    public final C26009CqQ A01;

    public int compareTo(Object obj) {
        DS7 ds7 = (DS7) obj;
        long j = this.A00 - ds7.A00;
        if (j < 0) {
            return -1;
        }
        if (j <= 0) {
            if (this.A01 == null) {
                return -1;
            }
            if (ds7.A01 == null) {
                return 1;
            }
            return 0;
        }
        return 1;
    }

    public DS7(C26009CqQ cqQ, long j) {
        this.A01 = cqQ;
        this.A00 = j;
    }
}
