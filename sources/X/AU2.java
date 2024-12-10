package X;

import com.whatsapp.jid.UserJid;
import java.io.IOException;

public final class AU2 implements C1606989o {
    public final /* synthetic */ B82 A00;
    public final /* synthetic */ A5U A01;
    public final /* synthetic */ UserJid A02;
    public final /* synthetic */ Integer A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ boolean A07;

    public void BE5(C138506xC r10) {
        C18070vi.A0d(r10, 0);
        A5U a5u = this.A01;
        Integer num = this.A03;
        UserJid userJid = this.A02;
        boolean z = this.A07;
        String str = this.A05;
        String str2 = this.A06;
        A5U.A00(this.A00, a5u, r10, userJid, num, str, str2, this.A04, z);
    }

    public void BrB(IOException iOException) {
        C18070vi.A0d(iOException, 0);
        A5U.A01(this.A00, this.A01, this.A03, this.A04, iOException);
    }

    public void Bsw(Exception exc) {
        C18070vi.A0d(exc, 0);
        A5U.A01(this.A00, this.A01, this.A03, this.A04, exc);
    }

    public AU2(B82 b82, A5U a5u, UserJid userJid, Integer num, String str, String str2, String str3, boolean z) {
        this.A01 = a5u;
        this.A03 = num;
        this.A02 = userJid;
        this.A07 = z;
        this.A05 = str;
        this.A06 = str2;
        this.A00 = b82;
        this.A04 = str3;
    }
}
