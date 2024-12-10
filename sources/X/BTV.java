package X;

import java.util.UUID;

public final class BTV extends C3J {
    public final C4F A00;
    public final UUID A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BTV) {
                BTV btv = (BTV) obj;
                if (!C18070vi.A18(this.A01, btv.A01) || !C18070vi.A18(this.A00, btv.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A00, AnonymousClass000.A0L(this.A01));
    }

    public BTV(C4F c4f, UUID uuid) {
        this.A01 = uuid;
        this.A00 = c4f;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("LinkedDeviceConnectionStatus(uuid=");
        A10.append(this.A01);
        A10.append(", connectionStatus=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
