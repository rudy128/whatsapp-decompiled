package X;

import java.nio.ByteBuffer;

public class BOS extends C26662D8l {
    public boolean A00;

    public void CDB(ByteBuffer byteBuffer) {
        int i;
        C25797Cm9 cm9;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i2 = this.A00.A00;
        ByteBuffer A02 = A02(((limit - position) / i2) * i2);
        while (position < limit) {
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            while (true) {
                i = this.A00.A01;
                if (i4 >= i) {
                    break;
                }
                i5 += byteBuffer.getShort((i4 * 2) + position);
                i4++;
            }
            short s = (short) (i5 / i);
            while (true) {
                cm9 = this.A00;
                if (i3 >= cm9.A01) {
                    break;
                }
                A02.putShort(s);
                i3++;
            }
            position += cm9.A00;
        }
        byteBuffer.position(limit);
        A02.flip();
    }
}
