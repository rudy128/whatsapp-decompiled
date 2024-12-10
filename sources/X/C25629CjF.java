package X;

import android.content.Context;
import android.os.SystemClock;
import java.util.Map;

/* renamed from: X.CjF  reason: case insensitive filesystem */
public final class C25629CjF {
    public static final C25629CjF A00 = new Object();

    public final DDT A00(Context context, C25511Ch9 ch9, C28552E7c... e7cArr) {
        boolean z;
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        C25313CdJ cdJ = EDF.A00;
        Map map = ch9.A00;
        Boolean bool = (Boolean) map.get(cdJ);
        C25481Cgc cgc = new C25481Cgc(ch9);
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = true;
        }
        cgc.A00.put(cdJ, Boolean.valueOf(z));
        DEJ dej = new DEJ(context, new C25511Ch9(cgc), e7cArr);
        DDT ddt = new DDT(dej);
        long elapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos() - elapsedRealtimeNanos;
        Object obj = map.get(C25511Ch9.A01);
        if (obj != null) {
            CZ2 cz2 = dej.A03;
            C26294Cx6.A03(Float.valueOf(((float) elapsedRealtimeNanos2) / 1000000.0f), "FbCameraLogger", "OC creation %f [ms]");
            Map map2 = cz2.A03;
            map2.clear();
            map2.put("plugin_list_name", obj);
            ((EDJ) cz2.A00(EDJ.A00)).BtQ(map2, elapsedRealtimeNanos2);
            return ddt;
        }
        throw C17880vN.A0g();
    }
}
