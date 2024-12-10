package X;

import com.whatsapp.jid.DeviceJid;
import java.util.Iterator;
import java.util.List;

public final /* synthetic */ class AQS implements C22440B7w {
    public final /* synthetic */ C20111A7t A00;

    public final void Bm5(List list) {
        C20111A7t a7t = this.A00;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            DeviceJid deviceJid = (DeviceJid) it.next();
            if (deviceJid != null) {
                a7t.A03.A02.remove(deviceJid);
                a7t.A02.A00(deviceJid);
            }
        }
    }

    public /* synthetic */ AQS(C20111A7t a7t) {
        this.A00 = a7t;
    }
}
