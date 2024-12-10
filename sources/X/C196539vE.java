package X;

import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.9vE  reason: invalid class name and case insensitive filesystem */
public abstract class C196539vE {
    public static int A00(String str) {
        if (!(str == null || str.length() == 0)) {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException e) {
                Log.d("Whatsapp", AnonymousClass001.A1H("NumberUtil/Invalid int value:", str, AnonymousClass000.A10()), e);
            }
        }
        return -1;
    }

    public static HashMap A01(Map map) {
        HashMap A11 = C17880vN.A11();
        Iterator A15 = AnonymousClass000.A15(map);
        while (A15.hasNext()) {
            C108985cd.A1R(A11, AnonymousClass000.A16(A15));
        }
        return A11;
    }
}
