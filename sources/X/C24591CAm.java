package X;

import java.nio.ByteBuffer;
import java.util.UUID;

/* renamed from: X.CAm  reason: case insensitive filesystem */
public abstract class C24591CAm {
    public static final byte[] A00(UUID uuid) {
        C18070vi.A0d(uuid, 0);
        byte[] bArr = new byte[16];
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        BEA.A1T(wrap, uuid);
        wrap.flip();
        return bArr;
    }
}
