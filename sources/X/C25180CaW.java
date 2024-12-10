package X;

import com.whatsapp.voipcalling.camera.VoipPhysicalCamera;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.CaW  reason: case insensitive filesystem */
public final class C25180CaW {
    public final CopyOnWriteArraySet A00 = new CopyOnWriteArraySet();
    public final /* synthetic */ VoipPhysicalCamera A01;

    public C25180CaW(VoipPhysicalCamera voipPhysicalCamera) {
        this.A01 = voipPhysicalCamera;
    }

    public void A00() {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((C28608E9z) it.next()).Bp6(this.A01);
        }
    }

    public void A01() {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((C28608E9z) it.next()).BzX();
        }
    }

    public void A02() {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((C28608E9z) it.next()).C9W();
        }
    }
}
