package X;

import com.google.android.gms.common.api.Status;

public final class DL1 implements EDU {
    public final int A00;
    public final Status A01;

    public DL1(Status status, int i) {
        this.A01 = status;
        this.A00 = i;
    }

    public final Status BZg() {
        return this.A01;
    }
}
