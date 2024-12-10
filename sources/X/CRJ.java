package X;

import android.graphics.Bitmap;

public class CRJ {
    public int A00 = Integer.MAX_VALUE;
    public Bitmap.Config A01;
    public Bitmap.Config A02;
    public boolean A03;

    public CRJ() {
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        this.A02 = config;
        this.A01 = config;
    }
}
