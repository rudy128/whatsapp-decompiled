package X;

import com.whatsapp.jid.DeviceJid;

/* renamed from: X.2RT  reason: invalid class name */
public final class AnonymousClass2RT extends Exception {
    public final int encryptionRetryCount;
    public final DeviceJid jid;

    public AnonymousClass2RT(DeviceJid deviceJid, int i) {
        super(AnonymousClass001.A1E(deviceJid, "Unable to encrypt message for ", AnonymousClass000.A10()));
        this.jid = deviceJid;
        this.encryptionRetryCount = i;
    }
}
