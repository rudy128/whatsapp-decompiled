package X;

import android.os.Build;
import java.util.Map;

/* renamed from: X.6mf  reason: invalid class name and case insensitive filesystem */
public class C132366mf {
    public boolean A00;
    public final AnonymousClass00H A01;
    public final Map A02 = C17880vN.A11();

    public synchronized Object A00(String str) {
        Object obj;
        if (!this.A00) {
            String A0j = C17880vN.A0K(this.A01).A0j();
            Map map = this.A02;
            map.put("device_id", A0j);
            map.put("app_build", "release");
            map.put("release_channel", "release");
            map.put("app_version", "2.24.24.78");
            map.put("os_version", Build.VERSION.RELEASE);
            map.put("platform", "android");
            this.A00 = true;
        }
        Map map2 = this.A02;
        if (map2.containsKey(str)) {
            obj = map2.get(str);
            obj.getClass();
        } else {
            throw AnonymousClass001.A12(" has not been set on UserInfo", AnonymousClass000.A11(str));
        }
        return obj;
    }

    public C132366mf(AnonymousClass00H r2) {
        this.A01 = r2;
    }
}
