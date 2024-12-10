package X;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.util.Map;
import java.util.Set;

/* renamed from: X.Ck2  reason: case insensitive filesystem */
public class C25671Ck2 {
    public static final byte[] A04 = {87, 65, 77, 5, 1, 0, 0, 2};
    public int A00 = 0;
    public byte[] A01 = new byte[0];
    public final Map A02 = C17880vN.A11();
    public final Set A03 = C17880vN.A14();

    public void A00(String str, byte[] bArr, int i) {
        Map map = this.A02;
        OutputStream outputStream = (OutputStream) map.get(str);
        if (outputStream == null) {
            outputStream = new ByteArrayOutputStream(16384);
            byte[] bArr2 = A04;
            bArr2[5] = -25;
            bArr2[6] = 3;
            outputStream.write(bArr2, 0, 8);
            int i2 = this.A00;
            if (i2 > 0) {
                outputStream.write(this.A01, 0, i2);
            }
            map.put(str, outputStream);
            this.A03.add(str);
        }
        outputStream.write(bArr, 0, i);
    }
}
