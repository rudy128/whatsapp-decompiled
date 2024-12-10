package X;

import android.content.Context;
import android.view.OrientationEventListener;

public class BH9 extends OrientationEventListener {
    public int A00;
    public final /* synthetic */ Bq6 A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BH9(Context context, Bq6 bq6) {
        super(context);
        this.A01 = bq6;
        this.A00 = bq6.A0W.getRotation();
    }

    public void onOrientationChanged(int i) {
        int i2;
        Bq6 bq6 = this.A01;
        int rotation = bq6.A0W.getRotation();
        if (!(rotation == -1 || rotation == (i2 = this.A00) || C108945cZ.A05(i2, rotation) % 2 != 0)) {
            bq6.surfaceChanged(bq6.A0X, 0, 0, 0);
        }
        this.A00 = rotation;
    }

    public void enable() {
        super.enable();
        this.A00 = this.A01.A0W.getRotation();
    }
}
