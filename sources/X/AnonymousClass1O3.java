package X;

import com.whatsapp.util.Log;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1O3  reason: invalid class name */
public class AnonymousClass1O3 {
    public C63222si A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;
    public final Map A03 = new HashMap();
    public final Map A04 = new HashMap();
    public final AnonymousClass190 A05;

    public void A00(C60132nR r6, C26971Uf r7) {
        Map map = this.A03;
        synchronized (map) {
            if (map.containsKey(r6)) {
                StringBuilder sb = new StringBuilder();
                sb.append("MessageCallbacksManager/added duplicate ackable stanza: ");
                sb.append(r6);
                Log.e(sb.toString());
                this.A05.A0G("MessageCallbacksManager/addAckCallback", "duplicate_ackable_stanza", true);
            }
            map.put(r6, new AnonymousClass3AN(this, ((C31251fG) this.A01.get()).A02(), r7));
            String str = r6.A06;
            if ("message".equals(str) || "receipt".equals(str)) {
                ((C29971dB) this.A02.get()).A0A(false);
            }
        }
    }

    public void A01(Exception exc) {
        Map map = this.A04;
        synchronized (map) {
            for (Map.Entry value : map.entrySet()) {
                ((C26971Uf) value.getValue()).BrC(exc);
            }
            map.clear();
        }
    }

    public AnonymousClass1O3(AnonymousClass190 r2, AnonymousClass00H r3, AnonymousClass00H r4) {
        this.A05 = r2;
        this.A01 = r3;
        this.A02 = r4;
    }
}
