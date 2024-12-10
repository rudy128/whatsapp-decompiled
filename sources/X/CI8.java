package X;

import com.facebook.msys.mci.DefaultCrypto;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public abstract class CI8 {
    public static final CQB A00;
    public static final ByteBuffer A01;
    public static final Charset A02 = Charset.forName("US-ASCII");
    public static final Charset A03 = Charset.forName(DefaultCrypto.UTF_8);
    public static final Charset A04 = Charset.forName("ISO-8859-1");
    public static final byte[] A05;

    static {
        byte[] bArr = new byte[0];
        A05 = bArr;
        A01 = ByteBuffer.wrap(bArr);
        CQB cqb = new CQB(bArr);
        try {
            int i = cqb.A00 + cqb.A01;
            cqb.A00 = i;
            if (i > 0) {
                cqb.A01 = i;
                cqb.A00 = i - i;
            } else {
                cqb.A01 = 0;
            }
            A00 = cqb;
        } catch (C24183Bwt e) {
            throw new IllegalArgumentException(e);
        }
    }
}
