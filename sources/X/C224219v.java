package X;

import android.os.Build;
import com.whatsapp.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.19v  reason: invalid class name and case insensitive filesystem */
public class C224219v implements C224119u {
    public static volatile C224219v A02;
    public String A00 = null;
    public Method A01 = null;

    public synchronized void A01(boolean z, String str) {
        Method method = null;
        if (Build.VERSION.SDK_INT < 23 && z) {
            try {
                Class<String> cls = String.class;
                Method declaredMethod = Runtime.class.getDeclaredMethod("nativeLoad", new Class[]{cls, ClassLoader.class, cls});
                declaredMethod.setAccessible(true);
                method = declaredMethod;
            } catch (NoSuchMethodException | SecurityException e) {
                Log.w("robustsofileloader/get-native-load-runtime-method: Could not get nativeLoad method", e);
            }
        }
        this.A01 = method;
        this.A00 = str;
    }

    public synchronized void Bhe(String str, int i) {
        Method method = this.A01;
        if (method == null) {
            System.load(str);
        } else {
            try {
                boolean z = false;
                if (this.A00 != null) {
                    z = true;
                }
                C17960vV.A0D(z);
                String str2 = (String) method.invoke(Runtime.getRuntime(), new Object[]{str, C224219v.class.getClassLoader(), this.A00});
                if (str2 != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("robustsofileloader/load: nativeLoad returned error ");
                    sb.append(str2);
                    throw new UnsatisfiedLinkError(sb.toString());
                }
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("robustsofileloader/load: Cannot load ");
                sb2.append(str);
                String obj = sb2.toString();
                StringBuilder sb3 = new StringBuilder();
                sb3.append("robustsofileloader/load: Error when loading lib: ");
                sb3.append(obj);
                Log.e(sb3.toString(), e);
                throw new UnsatisfiedLinkError(obj);
            }
        }
    }

    public void Bhi() {
    }

    public static C224219v A00() {
        if (A02 == null) {
            synchronized (C224119u.class) {
                if (A02 == null) {
                    A02 = new C224219v();
                }
            }
        }
        return A02;
    }
}
