package X;

/* renamed from: X.Cm6  reason: case insensitive filesystem */
public final class C25794Cm6 {
    public Integer A00;
    public Integer A01;
    public Long A02;
    public Long A03;

    public final synchronized Long A01() {
        return this.A02;
    }

    public final synchronized Long A02() {
        Long A002;
        synchronized (this) {
            A002 = A00(this.A00);
        }
        return A002;
    }

    public final synchronized Long A03() {
        Long A002;
        synchronized (this) {
            A002 = A00(this.A01);
        }
        return A002;
    }

    public static final Long A00(Integer num) {
        long j;
        if (num == null) {
            return null;
        }
        int intValue = num.intValue();
        if (intValue == 0) {
            j = 0;
        } else {
            j = 1;
            if (!(intValue == 5 || intValue == 4)) {
                if (intValue == 3) {
                    j = 3;
                } else if (intValue == 2) {
                    j = 4;
                } else if (intValue != 1) {
                    return null;
                } else {
                    j = 5;
                }
            }
        }
        return Long.valueOf(j);
    }
}
