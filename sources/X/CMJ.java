package X;

import android.util.LruCache;

public class CMJ {
    public static CMJ A01;
    public final LruCache A00;

    public CMJ(int i) {
        this.A00 = new LruCache(i <= 0 ? 5 : i);
    }
}
