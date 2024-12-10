package X;

import java.nio.charset.Charset;

/* renamed from: X.9wq  reason: invalid class name and case insensitive filesystem */
public abstract class C197529wq {
    public static final C193169pe A00;
    public static final C193149pc A01;
    public static final C193149pc A02;
    public static final C193149pc A03;
    public static final C193149pc A04;

    public static final C193129pa A00(AX0 ax0) {
        C18070vi.A0d(ax0, 0);
        return new C193129pa(new C193149pc(C200310o.A09(ax0.A00.A00(A03).A00(A02).A00(A04).A00(A01).A00(new C193149pc(C108975cc.A1O("encryptionKey"))).A00.A00, 0, 32)));
    }

    static {
        Charset charset = C26571Sq.A05;
        A00 = new C193169pe(new C193149pc(C18070vi.A1A("WhatsAppPasskeyStaticPrfInputV1", charset)));
        A03 = new C193149pc(C18070vi.A1A("ROOT_SCOPE", charset));
        A02 = new C193149pc(C18070vi.A1A("ROOT_ROTATABLE_SCOPE", charset));
        A04 = new C193149pc(C18070vi.A1A("ROOT_STORED_SCOPE", charset));
        A01 = new C193149pc(C18070vi.A1A("BACKUP_KEY_SCOPE", charset));
    }
}
