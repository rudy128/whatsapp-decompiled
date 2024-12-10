package X;

import android.graphics.Paint;

public class BEs extends Paint {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BEs(BN5 bn5, int i) {
        super(1);
        Paint.Style style;
        this.A00 = i;
        this.A01 = bn5;
        if (i != 0) {
            style = Paint.Style.STROKE;
        } else {
            super(1);
            style = Paint.Style.FILL;
        }
        setStyle(style);
    }
}
