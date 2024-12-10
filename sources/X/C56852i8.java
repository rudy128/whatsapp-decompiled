package X;

import com.whatsapp.jid.DeviceJid;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.2i8  reason: invalid class name and case insensitive filesystem */
public final class C56852i8 {
    public final ConcurrentHashMap A00 = new ConcurrentHashMap();

    /* JADX WARNING: type inference failed for: r0v5, types: [X.2S4, java.lang.Object] */
    public final boolean A00(DeviceJid deviceJid, long j) {
        if (j <= 0) {
            return false;
        }
        ConcurrentHashMap concurrentHashMap = this.A00;
        AnonymousClass2S4 r5 = (AnonymousClass2S4) concurrentHashMap.get(deviceJid);
        if (r5 == null) {
            ? obj = new Object();
            obj.A00 = j;
            concurrentHashMap.put(deviceJid, obj);
            return true;
        }
        long j2 = r5.A00;
        if (1 <= j2 && j2 <= j) {
            return false;
        }
        r5.A00 = j;
        return true;
    }
}
