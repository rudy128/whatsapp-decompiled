package X;

import android.net.Uri;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* renamed from: X.2oo  reason: invalid class name and case insensitive filesystem */
public abstract class C60912oo {
    public static final List A00;

    static {
        String[] A1Z = C17880vN.A1Z();
        A1Z[0] = "directory";
        A1Z[1] = "guia";
        A00 = Arrays.asList(A1Z);
    }

    public static boolean A00(Uri uri) {
        if (uri.getPathSegments().size() != 1) {
            return false;
        }
        return A00.contains(new File(uri.getPath()).getName().toLowerCase(Locale.US));
    }
}
