package X;

import android.content.Context;
import java.io.File;

public abstract class C7V {
    public static File A00(Context context) {
        return context.createDeviceProtectedStorageContext().getCodeCacheDir();
    }
}
