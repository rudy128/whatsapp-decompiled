package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import java.util.Map;

/* renamed from: X.AfK  reason: case insensitive filesystem */
public final class C21149AfK implements B9Y {
    public final C18030ve A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;

    /* JADX WARNING: type inference failed for: r0v15, types: [java.lang.Object, X.B5z] */
    public void CBS(Activity activity, A45 a45, Map map) {
        Intent intent;
        Bundle extras;
        String str;
        String str2;
        Intent intent2;
        Bundle extras2;
        String string;
        if (!(activity == null || (intent2 = activity.getIntent()) == null || (extras2 = intent2.getExtras()) == null || (string = extras2.getString("fds_observer_id")) == null)) {
            C108985cd.A0c(this.A02, string).A02(new Object());
        }
        if (C18020vd.A05(C18040vf.A02, this.A00, 4510) && activity != null && (intent = activity.getIntent()) != null && (extras = intent.getExtras()) != null) {
            String string2 = extras.getString("flow_id");
            int i = 0;
            if (map == null || !map.containsKey("is_valid") || AnonymousClass8BX.A1X(map, "is_valid")) {
                C172058si A0T = AnonymousClass8BR.A0T(this.A01);
                if (string2 != null) {
                    i = string2.hashCode();
                }
                A0T.A0F(i, 2);
                return;
            }
            if (map.containsKey("error_type")) {
                str = AnonymousClass8BU.A0p("error_type", map);
            } else {
                str = "UNKNOWN";
            }
            if (map.containsKey("error_message")) {
                str2 = AnonymousClass8BU.A0p("error_message", map);
            } else {
                str2 = null;
            }
            AnonymousClass00H r2 = this.A01;
            AnonymousClass8BR.A0T(r2).A0E(AnonymousClass8BW.A02(string2), str, str2);
            C172058si A0T2 = AnonymousClass8BR.A0T(r2);
            if (string2 != null) {
                i = string2.hashCode();
            }
            A0T2.A0F(i, 3);
        }
    }

    public C21149AfK(C18030ve r1, AnonymousClass00H r2, AnonymousClass00H r3) {
        C18070vi.A0o(r1, r2, r3);
        this.A00 = r1;
        this.A02 = r2;
        this.A01 = r3;
    }
}
