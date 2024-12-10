package X;

import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

/* renamed from: X.Cof  reason: case insensitive filesystem */
public class C25921Cof {
    public static boolean A00;
    public static Boolean A01;

    public static boolean A00() {
        boolean booleanValue;
        synchronized (C25921Cof.class) {
            Boolean bool = A01;
            if (bool == null) {
                try {
                    Boolean bool2 = (Boolean) Class.forName("com.facebook.endtoend.EndToEnd").getMethod("isRunningEndToEndTest", new Class[0]).invoke((Object) null, new Object[0]);
                    if (bool2 == null || !bool2.booleanValue()) {
                        bool = false;
                    } else {
                        boolean A1M = C108975cc.A1M("/sdcard/e2e/media/fineYoungGentleman.jpg");
                        C26294Cx6.A03(bool2, "OpticE2EConfig", "is e2e test: %s");
                        bool = Boolean.valueOf(A1M);
                        C26294Cx6.A03(bool, "OpticE2EConfig", "static frame file exists: %s");
                    }
                } catch (ClassNotFoundException | IllegalAccessException | NoClassDefFoundError | NoSuchMethodError | NoSuchMethodException | InvocationTargetException e) {
                    if (!A00) {
                        Log.i("OpticE2EConfig", "Failed to access test", e);
                    }
                    bool = false;
                }
                A01 = bool;
            }
            booleanValue = bool.booleanValue();
        }
        return booleanValue;
    }

    public static byte[] A01() {
        try {
            File A17 = C108945cZ.A17("/sdcard/e2e/media/fineYoungGentleman.jpg");
            FileInputStream A18 = C108945cZ.A18(A17);
            byte[] bArr = new byte[((int) A17.length())];
            A18.read(bArr);
            return bArr;
        } catch (IOException e) {
            throw AnonymousClass8BR.A0x(e);
        }
    }
}
