package X;

import java.nio.FloatBuffer;

/* renamed from: X.ChL  reason: case insensitive filesystem */
public class C25523ChL {
    public final int A00;
    public final FloatBuffer A01;

    public C25523ChL(float[] fArr) {
        int length = fArr.length;
        if (length % 2 == 0) {
            FloatBuffer asFloatBuffer = BEA.A0u(length * 4).asFloatBuffer();
            asFloatBuffer.put(fArr);
            this.A01 = (FloatBuffer) asFloatBuffer.position(0);
            this.A00 = 2;
            return;
        }
        throw BE6.A0j();
    }

    public static CPT A00(C25555Cht cht, float[] fArr) {
        cht.A02.put("aTextureCoord", new C25523ChL(fArr));
        cht.A01.add("aTextureCoord");
        return new CPT(cht);
    }
}
