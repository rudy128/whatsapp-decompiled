package X;

import android.view.View;
import java.util.Arrays;

public class CZN {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;

    public boolean equals(Object obj) {
        if (!(obj instanceof CZN)) {
            return false;
        }
        CZN czn = (CZN) obj;
        if (czn.A02 == this.A02 && czn.A03 == this.A03 && czn.A00 == this.A00 && czn.A01 == this.A01 && czn.A07 == this.A07 && czn.A04 == this.A04 && czn.A08 == this.A08 && czn.A09 == this.A09 && czn.A06 == this.A06 && czn.A05 == this.A05) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        Object[] objArr = new Object[8];
        objArr[0] = Float.valueOf(this.A02);
        BE8.A1J(objArr, this.A03);
        BE8.A1K(objArr, this.A00);
        objArr[3] = Float.valueOf(this.A01);
        AnonymousClass3Ma.A1T(objArr, this.A07);
        AnonymousClass3Ma.A1U(objArr, this.A04);
        C17890vO.A1H(objArr, this.A08);
        C17890vO.A1I(objArr, this.A09);
        return Arrays.hashCode(objArr);
    }

    public CZN(View view) {
        int[] A1W = C108945cZ.A1W();
        view.getLocationInWindow(A1W);
        this.A08 = BE6.A0I(A1W);
        this.A09 = A1W[1];
        this.A02 = view.getTranslationX();
        this.A03 = view.getTranslationY();
        this.A00 = view.getScaleX();
        this.A01 = view.getScaleY();
        this.A07 = view.getWidth();
        this.A04 = view.getHeight();
        this.A06 = view.getMeasuredWidth();
        this.A05 = view.getMeasuredHeight();
    }
}
