package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import java.util.Map;

/* renamed from: X.AfJ  reason: case insensitive filesystem */
public final class C21148AfJ implements B9Y {
    public final AnonymousClass1KB A00;
    public final C189949k7 A01;
    public final AnonymousClass00H A02;

    public void CBS(Activity activity, A45 a45, Map map) {
        Object obj;
        String str;
        Intent intent;
        Bundle extras;
        Map map2;
        if (map == null) {
            map = AnonymousClass1D7.A0I();
        }
        Object obj2 = map.get("values");
        String str2 = null;
        if (!(obj2 instanceof Map) || (map2 = (Map) obj2) == null) {
            obj = null;
        } else {
            obj = map2.get("in_pin_code");
        }
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = null;
        }
        if (!(activity == null || (intent = activity.getIntent()) == null || (extras = intent.getExtras()) == null)) {
            str2 = extras.getString("chat_id");
        }
        ((C199409zx) this.A02.get()).A01(new AM3(a45, this), str, str2);
    }

    public C21148AfJ(AnonymousClass1KB r1, C189949k7 r2, AnonymousClass00H r3) {
        C18070vi.A0o(r2, r3, r1);
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }
}
