package X;

import java.net.InetAddress;

/* renamed from: X.CVw  reason: case insensitive filesystem */
public final class C25064CVw {
    public final long A00;
    public final InetAddress A01;

    public C25064CVw(InetAddress inetAddress, long j) {
        this.A01 = inetAddress;
        this.A00 = j;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("InetAddressWithExpiry{address=");
        A10.append(this.A01);
        A10.append(", expireTimeMillis=");
        A10.append(this.A00);
        return C17890vO.A0b(A10);
    }
}
