package X;

import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.util.List;

public abstract class C89 {
    public static void A00(MediaFormat mediaFormat, List list) {
        for (int i = 0; i < list.size(); i++) {
            mediaFormat.setByteBuffer(AnonymousClass001.A1I("csd-", AnonymousClass000.A10(), i), ByteBuffer.wrap((byte[]) list.get(i)));
        }
    }
}
