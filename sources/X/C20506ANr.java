package X;

import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.ANr  reason: case insensitive filesystem */
public final class C20506ANr implements B7K {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C195139sr A01;
    public final /* synthetic */ C168818jj A02;

    public C20506ANr(C195139sr r1, C168818jj r2, int i) {
        this.A02 = r2;
        this.A01 = r1;
        this.A00 = i;
    }

    public void Bp2() {
        Object ao2;
        C168818jj r1 = this.A02;
        List list = C42011xT.A0I;
        AnonymousClass8F8 r2 = r1.A02;
        C195139sr r0 = this.A01;
        int i = this.A00;
        boolean z = r0.A04;
        UserJid userJid = r2.A0O;
        String str = r0.A01;
        if (z) {
            ao2 = new AO3(str, userJid, r0.A02);
        } else {
            ao2 = new AO2(userJid, str);
        }
        r2.A07.A0F(ao2);
        r2.A0J.A00(userJid, str, 1, 1, i, z);
    }
}
