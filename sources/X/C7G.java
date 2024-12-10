package X;

import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.ColorFilter;

public abstract class C7G {
    public static ColorFilter A00(Object obj, int i) {
        return new BlendModeColorFilter(i, (BlendMode) obj);
    }
}
