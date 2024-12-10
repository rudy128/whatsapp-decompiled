package X;

import com.whatsapp.jid.UserJid;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.9oj  reason: invalid class name and case insensitive filesystem */
public class C192639oj {
    public final C18030ve A00;
    public final AnonymousClass18K A01;
    public final C189399jB A02;
    public final AnonymousClass10I A03;
    public final AtomicInteger A04;

    public C192639oj(C18030ve r3, AnonymousClass18K r4, C189399jB r5, AnonymousClass10I r6) {
        AtomicInteger atomicInteger = new AtomicInteger();
        this.A04 = atomicInteger;
        this.A00 = r3;
        this.A03 = r6;
        this.A01 = r4;
        this.A02 = r5;
        atomicInteger.set(1);
    }

    public void A00(UserJid userJid, Integer num, Integer num2) {
        Integer A0k = C17880vN.A0k();
        if (C18020vd.A05(C18040vf.A02, this.A00, 1669)) {
            Integer num3 = num2;
            this.A03.CGF(new C21468AkZ(num3, this, num, userJid, A0k, 20));
        }
    }

    public void A01(UserJid userJid, Integer num, Integer num2) {
        Integer A0l = C17880vN.A0l();
        if (C18020vd.A05(C18040vf.A02, this.A00, 1669)) {
            Integer num3 = num2;
            this.A03.CGF(new C21468AkZ(num3, this, num, userJid, A0l, 20));
        }
    }
}
