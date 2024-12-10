package X;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: X.2sH  reason: invalid class name and case insensitive filesystem */
public class C62962sH {
    public static final Map A00 = Collections.synchronizedMap(C17880vN.A11());
    public static final Set A01;
    public static final Logger A02 = Logger.getLogger(C62962sH.class.getName());

    static {
        HashSet hashSet = new HashSet(8);
        C17890vO.A1D(hashSet, 43);
        C17890vO.A1D(hashSet, 44);
        C17890vO.A1D(hashSet, 49);
        C17890vO.A1D(hashSet, 55);
        C17890vO.A1D(hashSet, 61);
        C17890vO.A1D(hashSet, 81);
        A01 = hashSet;
    }

    public static void A00(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e) {
                A02.log(Level.WARNING, e.toString());
            }
        }
    }
}
