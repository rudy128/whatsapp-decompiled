package X;

import com.whatsapp.jid.DeviceJid;
import java.util.Iterator;

/* renamed from: X.2oA  reason: invalid class name and case insensitive filesystem */
public abstract class C60522oA {
    public static long A00(C29621ca r3) {
        String A02 = C29621ca.A02(r3, "last");
        if (A02 == null) {
            return System.currentTimeMillis();
        }
        if ("deny".equals(A02) || "error".equals(A02) || "none".equals(A02)) {
            return 0;
        }
        return Long.parseLong(A02) * 1000;
    }

    public static C201110w A01(C29621ca r9) {
        C201210x r8 = new C201210x();
        if (r9 != null) {
            Iterator A03 = C29621ca.A03(r9, "device");
            while (A03.hasNext()) {
                C29621ca A0a = C17880vN.A0a(A03);
                Class<DeviceJid> cls = DeviceJid.class;
                DeviceJid deviceJid = (DeviceJid) A0a.A0G(cls, "jid");
                r8.put(deviceJid, new C59452mK(deviceJid, (DeviceJid) A0a.A0F(cls, "lid"), A0a.A0D("key-index", 0)));
            }
        }
        return r8.build();
    }
}
