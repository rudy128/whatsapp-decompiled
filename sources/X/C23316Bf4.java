package X;

import libcore.io.Memory;
import sun.misc.Unsafe;

/* renamed from: X.Bf4  reason: case insensitive filesystem */
public final class C23316Bf4 extends C25855CnI {
    public C23316Bf4(Unsafe unsafe) {
        super(unsafe);
    }

    public final void A07(long j, byte b) {
        Memory.pokeByte((int) j, b);
    }

    public final void A0E(byte[] bArr, long j, long j2, long j3) {
        Memory.pokeByteArray((int) j2, bArr, (int) j, (int) j3);
    }
}
