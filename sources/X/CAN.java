package X;

import android.media.MediaFormat;
import java.nio.ByteBuffer;

public abstract class CAN {
    public static boolean A00(MediaFormat mediaFormat, C28577E8n e8n) {
        ByteBuffer byteBuffer = mediaFormat.getByteBuffer("csd-0");
        if (byteBuffer == null) {
            return false;
        }
        e8n.CI8(byteBuffer.limit(), 0, 2);
        ByteBuffer BNu = e8n.BNu();
        C26159CtX.A01(BNu);
        BNu.position(0);
        byteBuffer.position(0);
        BNu.limit(byteBuffer.limit());
        BNu.put(byteBuffer);
        return true;
    }
}
