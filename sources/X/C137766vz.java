package X;

import androidx.core.view.inputmethod.EditorInfoCompat;
import java.io.EOFException;
import java.io.InputStream;

/* renamed from: X.6vz  reason: invalid class name and case insensitive filesystem */
public abstract class C137766vz {
    public static final C127416eK A00 = new C127416eK(30, 72);
    public static final byte[] A01 = {69, 120, 105, 102, 0};
    public static final byte[] A02 = {74, 70, 73, 70, 0};
    public static final byte[] A03 = {74, 70, 88, 88, 0};
    public static final int[] A04 = {0, 208, 209, 210, 211, 212, 213, 214, 215};

    public static void A00(InputStream inputStream, int i) {
        int i2 = EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH;
        byte[] bArr = new byte[EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH];
        while (i > 0) {
            int min = Math.min(Math.min(i2, i), i2);
            int i3 = 0;
            while (i3 < min) {
                int read = inputStream.read(bArr, i3, min - i3);
                if (read == -1) {
                    break;
                }
                i3 += read;
            }
            if (i3 != -1) {
                i2 = EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH;
                i -= EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH;
            } else {
                throw new EOFException(AnonymousClass001.A1I("Unexpected EOF skipping ", AnonymousClass000.A10(), i));
            }
        }
    }
}
