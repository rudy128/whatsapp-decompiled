package X;

import java.nio.ByteBuffer;

public final class BOU extends C26662D8l {
    public int[] A00;
    public int[] A01;

    public void CDB(ByteBuffer byteBuffer) {
        int[] iArr = this.A00;
        C26056CrS.A01(iArr);
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer A02 = A02(((limit - position) / this.A00.A00) * this.A06.A00);
        while (position < limit) {
            for (int i : iArr) {
                A02.putShort(byteBuffer.getShort((i * 2) + position));
            }
            position += this.A00.A00;
        }
        byteBuffer.position(limit);
        A02.flip();
    }
}
