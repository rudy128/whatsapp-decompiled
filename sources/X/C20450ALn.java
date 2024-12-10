package X;

import com.whatsapp.jid.DeviceJid;

/* renamed from: X.ALn  reason: case insensitive filesystem */
public class C20450ALn implements BCN {
    public final /* synthetic */ C20111A7t A00;

    public void BvA(DeviceJid deviceJid) {
    }

    public void Bvi(DeviceJid deviceJid) {
    }

    public C20450ALn(C20111A7t a7t) {
        this.A00 = a7t;
    }

    public void Bvj(DeviceJid deviceJid) {
        AnonymousClass9j1 r2 = this.A00.A02;
        C17900vP.A0Y(deviceJid, "VoiceService/notifyDeviceIdentityChanged ", AnonymousClass000.A10());
        A99.A0B(r2.A00, deviceJid, false);
    }

    public void Bvk(DeviceJid deviceJid) {
        AnonymousClass9j1 r2 = this.A00.A02;
        C17900vP.A0Y(deviceJid, "VoiceService/notifyDeviceIdentityDeleted ", AnonymousClass000.A10());
        A99.A0B(r2.A00, deviceJid, true);
    }
}
