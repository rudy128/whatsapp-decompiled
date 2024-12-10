package X;

import com.whatsapp.jid.DeviceJid;

/* renamed from: X.2ly  reason: invalid class name and case insensitive filesystem */
public final class C59232ly {
    public boolean A00;
    public boolean A01;
    public final DeviceJid A02;

    public C59232ly(DeviceJid deviceJid, boolean z, boolean z2) {
        C18070vi.A0d(deviceJid, 1);
        this.A02 = deviceJid;
        this.A01 = z;
        this.A00 = z2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C18070vi.A14(this, obj)) {
            return false;
        }
        C59232ly r4 = (C59232ly) obj;
        if (this.A01 == r4.A01 && this.A00 == r4.A00) {
            return C18070vi.A18(this.A02, r4.A02);
        }
        return false;
    }

    public int hashCode() {
        return ((AnonymousClass000.A0L(this.A02) + (this.A01 ? 1 : 0)) * 31) + (this.A00 ? 1 : 0);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ParticipantDevice{deviceJid=");
        A10.append(this.A02);
        A10.append(", sentSenderKey=");
        A10.append(this.A01);
        A10.append(", sentAddOnSenderKey=");
        A10.append(this.A00);
        return C17890vO.A0b(A10);
    }
}
