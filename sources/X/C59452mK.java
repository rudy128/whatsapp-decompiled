package X;

import com.whatsapp.jid.DeviceJid;

/* renamed from: X.2mK  reason: invalid class name and case insensitive filesystem */
public final class C59452mK {
    public final long A00;
    public final DeviceJid A01;
    public final DeviceJid A02;

    public C59452mK(DeviceJid deviceJid, DeviceJid deviceJid2, long j) {
        C18070vi.A0d(deviceJid, 1);
        this.A02 = deviceJid;
        this.A00 = j;
        this.A01 = deviceJid2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C59452mK) {
                C59452mK r8 = (C59452mK) obj;
                if (!C18070vi.A18(this.A02, r8.A02) || this.A00 != r8.A00 || !C18070vi.A18(this.A01, r8.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass001.A0K(this.A00, AnonymousClass000.A0L(this.A02)) + AnonymousClass001.A0k(this.A01);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("DeviceProtocolModel(deviceJid=");
        A10.append(this.A02);
        A10.append(", keyIndex=");
        A10.append(this.A00);
        A10.append(", deviceLid=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
