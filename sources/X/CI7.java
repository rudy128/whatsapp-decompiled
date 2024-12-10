package X;

import com.facebook.msys.mci.DefaultCrypto;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public abstract class CI7 {
    public static final CQ6 A00;
    public static final ByteBuffer A01;
    public static final Charset A02 = Charset.forName("US-ASCII");
    public static final Charset A03 = Charset.forName(DefaultCrypto.UTF_8);
    public static final Charset A04 = Charset.forName("ISO-8859-1");
    public static final byte[] A05;

    static {
        byte[] bArr = new byte[0];
        A05 = bArr;
        A01 = ByteBuffer.wrap(bArr);
        CQ6 cq6 = new CQ6(bArr);
        try {
            int i = cq6.A00 + cq6.A01;
            cq6.A00 = i;
            if (i > 0) {
                cq6.A01 = i;
                cq6.A00 = i - i;
            } else {
                cq6.A01 = 0;
            }
            A00 = cq6;
        } catch (C24209BxL e) {
            throw new IllegalArgumentException(e);
        }
    }
}
