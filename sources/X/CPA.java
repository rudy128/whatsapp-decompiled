package X;

import java.util.UUID;

public class CPA {
    public final int A00;
    public final UUID A01;
    public final byte[] A02;

    public CPA(UUID uuid, byte[] bArr, int i) {
        this.A01 = uuid;
        this.A00 = i;
        this.A02 = bArr;
    }
}
