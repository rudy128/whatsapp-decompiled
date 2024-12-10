package X;

import android.content.Context;
import android.view.OrientationEventListener;

public class BH8 extends OrientationEventListener {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BH8(Context context, Object obj, int i) {
        super(context);
        this.A00 = i;
        this.A01 = obj;
    }

    public void onOrientationChanged(int i) {
        if (this.A00 != 0) {
            ((BHG) this.A01).A0Q.Bzj(i);
            return;
        }
        int i2 = ((((i + 45) + 360) / 90) % 4) * 90;
        DAU dau = (DAU) this.A01;
        int A002 = DAU.A00(dau);
        if (dau.A03 != i2 || dau.A04 != A002) {
            dau.A03 = i2;
            dau.A0Q.Bzj(i2);
            DAU.A03(dau, dau.A0D);
        }
    }
}
