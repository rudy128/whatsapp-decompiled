package X;

import android.media.MediaDrmResetException;

public abstract class C83 {
    public static boolean A00(Throwable th) {
        return th instanceof MediaDrmResetException;
    }
}
