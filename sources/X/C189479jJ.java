package X;

import android.net.wifi.WifiManager;
import com.whatsapp.util.Log;
import java.lang.reflect.Method;

/* renamed from: X.9jJ  reason: invalid class name and case insensitive filesystem */
public final class C189479jJ {
    public final WifiManager A00;

    public final boolean A00() {
        try {
            WifiManager wifiManager = this.A00;
            Method declaredMethod = wifiManager.getClass().getDeclaredMethod("isWifiApEnabled", new Class[0]);
            C18070vi.A0X(declaredMethod);
            declaredMethod.setAccessible(true);
            Boolean bool = (Boolean) declaredMethod.invoke(wifiManager, new Object[0]);
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        } catch (Throwable th) {
            Log.w("HotspotManager/isHotspotEnabled/failed to check if hotspot is enabled", th);
            return false;
        }
    }

    public C189479jJ(WifiManager wifiManager) {
        this.A00 = wifiManager;
    }
}
