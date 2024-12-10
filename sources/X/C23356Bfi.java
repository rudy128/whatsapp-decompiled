package X;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;

/* renamed from: X.Bfi  reason: case insensitive filesystem */
public final class C23356Bfi extends C3i {
    public boolean A00;
    public final int A01;
    public final MessageDigest A02;
    public final ByteBuffer A03;

    public /* synthetic */ C23356Bfi(MessageDigest messageDigest, int i) {
        this();
        this.A02 = messageDigest;
        this.A01 = i;
    }

    public C23356Bfi() {
        this.A03 = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);
    }
}
