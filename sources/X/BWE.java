package X;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.UUID;

public final class BWE extends C24496C6o {
    public final E57 A00;
    public final E57 A01;
    public final C24276ByZ A02;
    public final InputStream A03;
    public final OutputStream A04;
    public final Integer A05;
    public final UUID A06;
    public final UUID A07;

    public BWE(C24496C6o c6o, E57 e57, E57 e572, UUID uuid, UUID uuid2) {
        this.A07 = uuid;
        this.A06 = uuid2;
        this.A02 = c6o.A02();
        this.A03 = c6o.A03();
        this.A04 = c6o.A04();
        this.A05 = c6o.A05();
        this.A00 = e57;
        this.A01 = e572;
    }
}
