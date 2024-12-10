package X;

import com.whatsapp.jid.UserJid;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.2i9  reason: invalid class name and case insensitive filesystem */
public final class C56862i9 {
    public final ConcurrentHashMap A00 = new ConcurrentHashMap();

    public final boolean A00(UserJid userJid, int i, long j) {
        UserJid userJid2 = userJid;
        C18070vi.A0d(userJid2, 0);
        long j2 = j;
        if (j > 0) {
            ConcurrentHashMap concurrentHashMap = this.A00;
            C62452rQ r8 = (C62452rQ) concurrentHashMap.get(userJid2);
            if (r8 == null) {
                r8 = C62452rQ.A03;
            }
            int i2 = i;
            if (i2 == 5) {
                long j3 = r8.A00;
                if (j3 > 0 && j3 <= j) {
                    return false;
                }
                r8 = new C62452rQ(j2, r8.A02, r8.A01);
            } else if (i2 == 8) {
                long j4 = r8.A01;
                if (j4 > 0 && j4 <= j) {
                    return false;
                }
                r8 = new C62452rQ(r8.A00, r8.A02, j2);
            } else if (i2 == 13) {
                long j5 = r8.A02;
                if (j5 <= 0 || j5 > j) {
                    r8 = new C62452rQ(r8.A00, j2, r8.A01);
                }
            }
            concurrentHashMap.put(userJid2, r8);
            return true;
        }
        return false;
    }
}
