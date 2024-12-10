package X;

import com.whatsapp.util.Log;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.6pY  reason: invalid class name and case insensitive filesystem */
public abstract class C133826pY {
    public final AnonymousClass11P A00;
    public final C27301Vn A01;
    public final C19830z4 A02;
    public final C133946pl A03;
    public final String A04 = C108985cd.A0f();

    public AnonymousClass1BI A00(C136546tz r4) {
        AnonymousClass1BI r2;
        Collection collection;
        Map map;
        if (this instanceof AnonymousClass680) {
            Map map2 = r4.A08;
            r2 = null;
            if (map2 == null || map2.size() != 1 || (map = r4.A08) == null) {
                return null;
            }
            collection = map.keySet();
        } else if (this instanceof C1194067z) {
            Log.e("ReplyReminderPSAPushNotification/getChatJidForLogging/should be handled internally");
            return null;
        } else {
            List list = r4.A04;
            r2 = null;
            if (list == null || list.size() != 1) {
                return null;
            }
            collection = r4.A04;
        }
        if (collection != null) {
            return (AnonymousClass1BI) AnonymousClass4Z0.A00(collection);
        }
        return r2;
    }

    public Long A01(C136546tz r2) {
        Set keySet;
        if (this instanceof AnonymousClass680) {
            Map map = r2.A08;
            if (map == null || (keySet = map.keySet()) == null) {
                return null;
            }
            return C17880vN.A0n(keySet.size());
        } else if (this instanceof C1194067z) {
            Log.e("ReplyReminderPSAPushNotification/getThreadCountForLogging/should be handled internally");
            return null;
        } else {
            List list = r2.A04;
            if (list != null) {
                return C108975cc.A0Y(list);
            }
            return null;
        }
    }

    public C133826pY(AnonymousClass11P r2, C27301Vn r3, C19830z4 r4, C133946pl r5) {
        this.A00 = r2;
        this.A02 = r4;
        this.A01 = r3;
        this.A03 = r5;
    }
}
