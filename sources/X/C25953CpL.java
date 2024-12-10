package X;

import com.facebook.videolite.transcoder.base.composition.MediaEffect;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.CpL  reason: case insensitive filesystem */
public class C25953CpL {
    public static final int A05 = ((int) Math.pow(2.0d, 15.0d));
    public static final int A06 = ((int) Math.pow(2.0d, 16.0d));
    public int A00;
    public ByteBuffer A01;
    public List[] A02 = new List[0];
    public boolean[] A03 = new boolean[0];
    public final List A04 = AnonymousClass000.A13();

    public static ByteBuffer A00(ByteBuffer byteBuffer, List list) {
        float f;
        CAI cai = CAI.$redex_init_class;
        float f2 = 1.0f;
        if (list != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            float f3 = 1.0f;
            while (it.hasNext()) {
                MediaEffect mediaEffect = (MediaEffect) it.next();
                if (mediaEffect instanceof BW5) {
                    f = ((BW5) mediaEffect).A00;
                } else {
                    f = 1.0f;
                }
                f3 *= f;
            }
            if (f3 <= 1.0f) {
                f2 = f3;
            }
        }
        if (C24550C8v.A00(f2)) {
            return byteBuffer;
        }
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.clear();
        while (byteBuffer.hasRemaining()) {
            duplicate.putShort((short) ((int) (((float) byteBuffer.getShort()) * f2)));
        }
        duplicate.flip();
        return duplicate;
    }
}
