package X;

import java.nio.charset.Charset;

/* renamed from: X.DJf  reason: case insensitive filesystem */
public final class C26924DJf implements E22 {
    public static final E80 A01 = new Object();
    public final E80 A00;

    /* JADX WARNING: type inference failed for: r1v2, types: [X.DJX, X.E80, java.lang.Object] */
    public C26924DJf() {
        E80 e80;
        E80[] e80Arr = new E80[2];
        e80Arr[0] = DJZ.A00;
        try {
            e80 = (E80) BEB.A0V();
        } catch (Exception unused) {
            e80 = A01;
        }
        e80Arr[1] = e80;
        ? obj = new Object();
        obj.A00 = e80Arr;
        Charset charset = C25461CgE.A04;
        this.A00 = obj;
    }
}
