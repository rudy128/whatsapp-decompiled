package X;

import java.util.concurrent.atomic.AtomicBoolean;

public final class BTD extends C3J {
    public AtomicBoolean A00;
    public AtomicBoolean A01;

    public BTD() {
        AtomicBoolean A16 = BE6.A16(false);
        AtomicBoolean A162 = BE6.A16(false);
        this.A00 = A16;
        this.A01 = A162;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("TrustValues(authenticated=");
        A10.append(this.A00);
        A10.append(", enabledTrust=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
