package X;

import com.whatsapp.jid.DeviceJid;
import java.util.Map;

/* renamed from: X.2kT  reason: invalid class name and case insensitive filesystem */
public final class C58302kT {
    public final Map A00;

    public C58302kT(Map map) {
        C18070vi.A0d(map, 1);
        this.A00 = map;
    }

    public final int A00(DeviceJid deviceJid) {
        int A01;
        C18070vi.A0d(deviceJid, 0);
        synchronized (this) {
            A01 = A01(deviceJid) + 1;
            this.A00.put(deviceJid.getRawString(), Integer.valueOf(A01));
        }
        return A01;
    }

    public final int A01(DeviceJid deviceJid) {
        int i;
        C18070vi.A0d(deviceJid, 0);
        synchronized (this) {
            Integer num = (Integer) this.A00.get(deviceJid.getRawString());
            if (num != null) {
                i = num.intValue();
            } else {
                i = 0;
            }
        }
        return i;
    }
}
