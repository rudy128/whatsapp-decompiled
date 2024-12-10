package X;

import java.nio.charset.Charset;

public final class DJQ implements C28455E1v {
    public static final E7z A01 = new Object();
    public final E7z A00;

    public DJQ() {
        E7z e7z;
        E7z[] e7zArr = new E7z[2];
        e7zArr[0] = DJM.A00;
        try {
            e7z = (E7z) BEB.A0V();
        } catch (Exception unused) {
            e7z = A01;
        }
        e7zArr[1] = e7z;
        DJL djl = new DJL(e7zArr);
        Charset charset = CI7.A02;
        this.A00 = djl;
    }
}
