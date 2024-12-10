package X;

import com.whatsapp.data.ConversationDeleteWorker;
import java.util.Map;

/* renamed from: X.1RQ  reason: invalid class name */
public class AnonymousClass1RQ {
    public final AnonymousClass1CJ A00;
    public final C25991Qk A01;
    public final AnonymousClass19K A02;

    public void A00(C56192h3 r7, String str) {
        C196269uj r5 = new C196269uj(ConversationDeleteWorker.class);
        C192939pH r4 = new C192939pH();
        Map map = r4.A00;
        map.put("delete_action", str);
        map.put("job_id", Long.valueOf(r7.A06));
        r5.A04(r4.A00());
        r5.A07(String.valueOf(r7.A07.hashCode()));
        r5.A05(AnonymousClass00R.A00);
        ((A7W) this.A02.get()).A08(r5.A00());
    }

    public AnonymousClass1RQ(AnonymousClass1CJ r1, C25991Qk r2, AnonymousClass19K r3) {
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
    }
}
