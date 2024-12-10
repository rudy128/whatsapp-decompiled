package X;

import com.facebook.msys.mci.DefaultCrypto;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: X.CgE  reason: case insensitive filesystem */
public abstract class C25461CgE {
    public static final Charset A00 = Charset.forName(DefaultCrypto.UTF_8);
    public static final byte[] A01;
    public static final C25560Chy A02;
    public static final ByteBuffer A03;
    public static final Charset A04 = Charset.forName("ISO-8859-1");

    static {
        byte[] bArr = new byte[0];
        A01 = bArr;
        A03 = ByteBuffer.wrap(bArr);
        C25560Chy chy = new C25560Chy(bArr);
        try {
            int i = chy.A00 + chy.A01;
            chy.A00 = i;
            if (i > 0) {
                chy.A01 = i;
                chy.A00 = i - i;
            } else {
                chy.A01 = 0;
            }
            A02 = chy;
        } catch (C24203BxF e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static C23293Beh A00(Object obj, Object obj2) {
        C23293Beh beh = (C23293Beh) ((EDY) obj);
        C23294Bei bei = (C23294Bei) beh.A04(5);
        bei.A01();
        C23293Beh beh2 = bei.A00;
        BE9.A0R(beh2).CTS(beh2, beh);
        EDY edy = (EDY) obj2;
        if (bei.A02.getClass().isInstance(edy)) {
            bei.A01();
            C23293Beh beh3 = bei.A00;
            BE9.A0R(beh3).CTS(beh3, (C23293Beh) ((C26919DJa) edy));
            return bei.A00();
        }
        throw AnonymousClass000.A0k("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
