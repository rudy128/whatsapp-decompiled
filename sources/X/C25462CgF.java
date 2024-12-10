package X;

import com.facebook.msys.mci.DefaultCrypto;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: X.CgF  reason: case insensitive filesystem */
public abstract class C25462CgF {
    public static final Charset A00 = Charset.forName(DefaultCrypto.UTF_8);
    public static final byte[] A01;
    public static final C25561Chz A02;
    public static final ByteBuffer A03;
    public static final Charset A04 = Charset.forName("ISO-8859-1");

    static {
        byte[] bArr = new byte[0];
        A01 = bArr;
        A03 = ByteBuffer.wrap(bArr);
        C25561Chz chz = new C25561Chz(bArr);
        try {
            int i = chz.A00 + chz.A01;
            chz.A00 = i;
            if (i > 0) {
                chz.A01 = i;
                chz.A00 = i - i;
            } else {
                chz.A01 = 0;
            }
            A02 = chz;
        } catch (C24204BxG e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static C23484Bho A00(Object obj, Object obj2) {
        C23484Bho bho = (C23484Bho) ((C28663EDa) obj);
        C23469BhY bhY = (C23469BhY) bho.A06(5);
        bhY.A03(bho);
        C28663EDa eDa = (C28663EDa) obj2;
        if (bhY.A02.getClass().isInstance(eDa)) {
            bhY.A03((C23484Bho) ((DK6) eDa));
            return bhY.A02();
        }
        throw AnonymousClass000.A0k("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
