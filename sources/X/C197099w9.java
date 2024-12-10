package X;

import java.io.Closeable;

/* renamed from: X.9w9  reason: invalid class name and case insensitive filesystem */
public abstract class C197099w9 {
    public static final char[] A00 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static void A00(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception e) {
                C26294Cx6.A09("AssetFileUtil", "unable to close stream", e);
            }
        }
    }
}
