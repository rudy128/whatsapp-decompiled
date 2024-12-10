package X;

import java.math.BigInteger;
import java.nio.ByteBuffer;

/* renamed from: X.CiI  reason: case insensitive filesystem */
public class C25578CiI {
    public static final int A04 = new BigInteger("2").pow(15).intValue();
    public static final int A05 = new BigInteger("2").pow(16).intValue();
    public ByteBuffer A00;
    public ByteBuffer A01;
    public ByteBuffer A02;
    public final int A03;

    public C25578CiI(int i) {
        ByteBuffer A0u = BEA.A0u(0);
        this.A00 = A0u;
        this.A01 = A0u;
        this.A02 = A0u;
        this.A03 = i;
    }
}
