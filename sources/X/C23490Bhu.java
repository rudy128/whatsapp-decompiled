package X;

import sun.misc.Unsafe;

/* renamed from: X.Bhu  reason: case insensitive filesystem */
public final class C23490Bhu extends C25851CnD {
    public final byte A01(Object obj, long j) {
        return this.A00.getByte(obj, j);
    }

    public final double A02(Object obj, long j) {
        return this.A00.getDouble(obj, j);
    }

    public final float A03(Object obj, long j) {
        return this.A00.getFloat(obj, j);
    }

    public final void A06(Object obj, long j, byte b) {
        this.A00.putByte(obj, j, b);
    }

    public final void A07(Object obj, long j, double d) {
        this.A00.putDouble(obj, j, d);
    }

    public final void A08(Object obj, long j, float f) {
        this.A00.putFloat(obj, j, f);
    }

    public final void A0B(Object obj, long j, boolean z) {
        this.A00.putBoolean(obj, j, z);
    }

    public final boolean A0C(Object obj, long j) {
        return this.A00.getBoolean(obj, j);
    }

    public C23490Bhu(Unsafe unsafe) {
        super(unsafe);
    }
}
