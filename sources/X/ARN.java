package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import java.util.Iterator;
import java.util.Set;

public class ARN implements C107295Zd {
    public final /* synthetic */ C20111A7t A00;

    public ARN(C20111A7t a7t) {
        this.A00 = a7t;
    }

    public void C9k(UserJid userJid, Set set, Set set2) {
        Iterator it = set2.iterator();
        while (it.hasNext()) {
            DeviceJid deviceJid = (DeviceJid) it.next();
            AnonymousClass9j1 r2 = this.A00.A02;
            C17900vP.A0Y(deviceJid, "VoiceService/notifyDeviceRemoved ", AnonymousClass000.A10());
            boolean z = false;
            if (deviceJid.getDevice() == 0) {
                z = true;
            }
            C17960vV.A0F(!z, "primary device should never be removed");
            A99.A0B(r2.A00, deviceJid, true);
        }
    }
}
