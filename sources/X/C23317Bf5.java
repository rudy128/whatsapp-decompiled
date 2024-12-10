package X;

import libcore.io.Memory;
import sun.misc.Unsafe;

/* renamed from: X.Bf5  reason: case insensitive filesystem */
public final class C23317Bf5 extends C25855CnI {
    public C23317Bf5(Unsafe unsafe) {
        super(unsafe);
    }

    public final void A07(long j, byte b) {
        Memory.pokeByte(j, b);
    }

    public final void A0E(byte[] bArr, long j, long j2, long j3) {
        Memory.pokeByteArray(j2, bArr, (int) j, (int) j3);
    }
}
