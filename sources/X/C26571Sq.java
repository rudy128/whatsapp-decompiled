package X;

import com.facebook.msys.mci.DefaultCrypto;
import java.nio.charset.Charset;

/* renamed from: X.1Sq  reason: invalid class name and case insensitive filesystem */
public abstract class C26571Sq {
    public static final Charset A00;
    public static final Charset A01;
    public static final Charset A02;
    public static final Charset A03;
    public static final Charset A04;
    public static final Charset A05;

    static {
        Charset forName = Charset.forName(DefaultCrypto.UTF_8);
        C18070vi.A0X(forName);
        A05 = forName;
        Charset forName2 = Charset.forName("UTF-16");
        C18070vi.A0X(forName2);
        A02 = forName2;
        Charset forName3 = Charset.forName("UTF-16BE");
        C18070vi.A0X(forName3);
        A03 = forName3;
        Charset forName4 = Charset.forName("UTF-16LE");
        C18070vi.A0X(forName4);
        A04 = forName4;
        Charset forName5 = Charset.forName("US-ASCII");
        C18070vi.A0X(forName5);
        A01 = forName5;
        Charset forName6 = Charset.forName("ISO-8859-1");
        C18070vi.A0X(forName6);
        A00 = forName6;
    }
}
