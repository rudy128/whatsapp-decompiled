package X;

import android.content.SharedPreferences;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.2UQ  reason: invalid class name */
public abstract class AnonymousClass2UQ {
    public static void A00(SharedPreferences sharedPreferences, SharedPreferences sharedPreferences2, Map map) {
        Iterator A15 = AnonymousClass000.A15(map);
        SharedPreferences.Editor editor = null;
        SharedPreferences.Editor editor2 = null;
        while (A15.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(A15);
            String A0x = C17880vN.A0x(A16);
            if (sharedPreferences.contains(A0x)) {
                if (!sharedPreferences2.contains(A0x)) {
                    if (editor == null) {
                        editor = sharedPreferences2.edit();
                    }
                    Class<String> cls = (Class) A16.getValue();
                    if (cls == Boolean.class || cls == Boolean.TYPE) {
                        editor.putBoolean(A0x, sharedPreferences.getBoolean(A0x, false));
                    } else if (cls == Integer.class || cls == Integer.TYPE) {
                        editor.putInt(A0x, sharedPreferences.getInt(A0x, 0));
                    } else if (cls == Float.class || cls == Float.TYPE) {
                        editor.putFloat(A0x, sharedPreferences.getFloat(A0x, 0.0f));
                    } else if (cls == Long.class || cls == Long.TYPE) {
                        editor.putLong(A0x, C17890vO.A05(sharedPreferences, A0x));
                    } else if (cls == String.class) {
                        editor.putString(A0x, sharedPreferences.getString(A0x, (String) null));
                    } else if (Set.class.isAssignableFrom(cls)) {
                        editor.putStringSet(A0x, sharedPreferences.getStringSet(A0x, (Set) null));
                    } else {
                        throw AnonymousClass000.A0k(AnonymousClass001.A1E(cls, "Cannot access value of type ", AnonymousClass000.A10()));
                    }
                }
                if (editor2 == null) {
                    editor2 = sharedPreferences.edit();
                }
                editor2.remove(A0x);
            }
        }
        if (editor != null) {
            editor.commit();
        }
        if (editor2 != null) {
            editor2.commit();
        }
    }
}
