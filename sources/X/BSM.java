package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

public final class BSM extends C26134Csx {
    public final C9G A00;

    public int A02(BitmapFactory.Options options, int i, int i2) {
        Bitmap.Config config = options.outConfig;
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        return C26077Crr.A01(config, i, i2);
    }

    public BSM(C29011bR r1, BSH bsh, C9G c9g) {
        super(r1, bsh);
        this.A00 = c9g;
    }
}
