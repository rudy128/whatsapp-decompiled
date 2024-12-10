package X;

import android.content.SharedPreferences;
import java.util.UUID;

/* renamed from: X.1fU  reason: invalid class name and case insensitive filesystem */
public class C31391fU implements C31381fT {
    public final AnonymousClass11P A00;
    public final C19830z4 A01;

    public synchronized C57082iV BX3() {
        C57082iV r3;
        C19830z4 r32 = this.A01;
        String string = ((SharedPreferences) r32.A00.get()).getString("phoneid_id", (String) null);
        long A0W = r32.A0W("phoneid_timestamp");
        if (string == null || A0W == -1) {
            r3 = new C57082iV(UUID.randomUUID().toString(), AnonymousClass11P.A01(this.A00));
            CJu(r3);
        } else {
            r3 = new C57082iV(string, A0W);
        }
        return r3;
    }

    public synchronized void CJu(C57082iV r7) {
        C19830z4 r5 = this.A01;
        String str = r7.A01;
        long j = r7.A00;
        C19830z4.A00(r5).putString("phoneid_id", str).apply();
        r5.A1q("phoneid_timestamp", j);
    }

    public C31391fU(AnonymousClass11P r1, C19830z4 r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
