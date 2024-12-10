package X;

import com.whatsapp.jid.UserJid;
import java.util.List;

public final class A7D {
    public UserJid A00;
    public Boolean A01;
    public Boolean A02;
    public Boolean A03;
    public Integer A04;
    public Integer A05;
    public Integer A06;
    public Integer A07;
    public Long A08;
    public Long A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public String A0J;
    public String A0K;

    public static void A03(A7D a7d, C185549cl r2) {
        a7d.A0B = r2.A02;
        a7d.A05 = Integer.valueOf(r2.A00);
    }

    public static void A00(AnonymousClass1DS r0, A7D a7d) {
        a7d.A04(Boolean.valueOf(C196469v7.A00((List) r0.A06())));
    }

    public static void A01(A7D a7d, int i) {
        a7d.A06 = Integer.valueOf(i);
    }

    public static void A02(A7D a7d, int i) {
        a7d.A04 = Integer.valueOf(i);
    }

    public final void A04(Boolean bool) {
        Boolean A0i = AnonymousClass000.A0i();
        if (bool != A0i) {
            A0i = null;
        }
        this.A02 = A0i;
    }
}
