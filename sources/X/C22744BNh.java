package X;

import android.graphics.Matrix;
import java.util.List;

/* renamed from: X.BNh  reason: case insensitive filesystem */
public abstract class C22744BNh extends C22761BNy implements E7L {
    public Matrix A00;
    public Boolean A01;
    public Integer A02;
    public String A03;
    public List A04 = AnonymousClass000.A13();

    public void BB4(C24482C5y c5y) {
        if (c5y instanceof C22743BNg) {
            this.A04.add(c5y);
            return;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Gradient elements cannot contain ");
        A10.append(c5y);
        throw E05.A00(AnonymousClass000.A0y(" elements.", A10));
    }

    public List BOi() {
        return this.A04;
    }
}
