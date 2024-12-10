package X;

import java.util.HashMap;

public final class CRN {
    public HashMap A00;
    public final int A01;
    public final int A02;
    public final EAW A03;

    public CRN(EAW eaw, int i, int i2) {
        this.A02 = i;
        this.A01 = i2;
        this.A03 = eaw;
    }
}
