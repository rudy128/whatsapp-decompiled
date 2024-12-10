package X;

import com.facebook.android.exoplayer2.util.Util;
import java.nio.ByteBuffer;

public final class BOV extends C26662D8l {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public boolean A05;
    public byte[] A06 = Util.A08;

    public ByteBuffer BVr() {
        int i;
        if (super.Bed() && (i = this.A00) > 0) {
            ByteBuffer A022 = A02(i);
            A022.put(this.A06, 0, this.A00);
            A022.flip();
            this.A00 = 0;
        }
        ByteBuffer byteBuffer = this.A01;
        this.A01 = C28627EBa.A00;
        return byteBuffer;
    }

    public boolean Bed() {
        if (!super.Bed() || this.A00 != 0) {
            return false;
        }
        return true;
    }

    public void CDB(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        if (i != 0) {
            int i2 = this.A01;
            int min = Math.min(i, i2);
            this.A04 += (long) (min / this.A00.A00);
            this.A01 = i2 - min;
            byteBuffer.position(position + min);
            if (this.A01 <= 0) {
                int i3 = i - min;
                int length = (this.A00 + i3) - this.A06.length;
                ByteBuffer A022 = A02(length);
                int A07 = BE8.A07(length, this.A00, 0);
                A022.put(this.A06, 0, A07);
                int A072 = BE8.A07(length - A07, i3, 0);
                byteBuffer.limit(byteBuffer.position() + A072);
                A022.put(byteBuffer);
                byteBuffer.limit(limit);
                int i4 = i3 - A072;
                int i5 = this.A00 - A07;
                this.A00 = i5;
                byte[] bArr = this.A06;
                System.arraycopy(bArr, A07, bArr, 0, i5);
                byteBuffer.get(this.A06, this.A00, i4);
                this.A00 += i4;
                A022.flip();
            }
        }
    }
}
