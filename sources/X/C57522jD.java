package X;

import android.app.Application;
import android.os.Build;
import com.whatsapp.util.Log;
import java.lang.reflect.Field;

/* renamed from: X.2jD  reason: invalid class name and case insensitive filesystem */
public class C57522jD {
    public boolean A00 = false;
    public final Application A01;
    public final AnonymousClass190 A02;

    public void A00() {
        if (!this.A00 && "samsung".equalsIgnoreCase(Build.MANUFACTURER) && Build.VERSION.SDK_INT == 24) {
            try {
                Class<?> cls = Class.forName("com.samsung.android.emergencymode.SemEmergencyManager");
                Field declaredField = cls.getDeclaredField("sInstance");
                declaredField.setAccessible(true);
                Object obj = declaredField.get((Object) null);
                Field declaredField2 = cls.getDeclaredField("mContext");
                declaredField2.setAccessible(true);
                declaredField2.set(obj, this.A01);
            } catch (Exception e) {
                this.A00 = true;
                Log.e("SemEmergencyManagerLeakFix/apply", e);
                this.A02.A0E("leak-fix-v2", "SemEmergencyManagerLeakFix", e);
            }
        }
    }

    public C57522jD(Application application, AnonymousClass190 r3) {
        this.A02 = r3;
        this.A01 = application;
    }
}
