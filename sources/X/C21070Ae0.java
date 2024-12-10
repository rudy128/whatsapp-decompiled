package X;

import android.content.Context;
import com.whatsapp.jid.UserJid;

/* renamed from: X.Ae0  reason: case insensitive filesystem */
public class C21070Ae0 implements C107695aR {
    public final int A00;
    public final Object A01;

    public C21070Ae0(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void Bp1() {
        UserJid userJid;
        if (this.A00 != 0) {
            AVS.A00((AVS) this.A01);
            return;
        }
        C20507ANs aNs = (C20507ANs) this.A01;
        C36361nl r2 = aNs.A02;
        Context context = aNs.A04.getContext();
        AEW aew = aNs.A00;
        C17960vV.A07(aew);
        C72453Mb.A18(context, r2, aew.A0K);
        if (aNs.A06.A00()) {
            C170938qu r1 = new C170938qu();
            r1.A01 = C17880vN.A0j();
            r1.A00 = C17880vN.A0h();
            AEW aew2 = aNs.A00;
            if (!(aew2 == null || (userJid = aew2.A09) == null)) {
                r1.A02 = AnonymousClass17K.A04(userJid);
            }
            aNs.A05.CC7(r1);
        }
    }
}
