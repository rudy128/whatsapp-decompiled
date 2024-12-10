package X;

import android.content.Context;
import com.whatsapp.jid.UserJid;

/* renamed from: X.Ae1  reason: case insensitive filesystem */
public final /* synthetic */ class C21071Ae1 implements C107695aR {
    public final /* synthetic */ C20508ANt A00;
    public final /* synthetic */ UserJid A01;

    public final void Bp1() {
        C20508ANt aNt = this.A00;
        UserJid userJid = this.A01;
        C22364B4s b4s = aNt.A01.A04;
        if (b4s != null) {
            C92884i4 r5 = (C92884i4) b4s;
            C92874i3.A05(r5.A00, new C95594mU(r5, userJid, 0, aNt.A04), AnonymousClass00R.A0D);
            return;
        }
        String A002 = aNt.A0A.A00(aNt.A02);
        if ("UNBLOCKED".equals(A002)) {
            aNt.A0F.A00();
            AnonymousClass1L9 r3 = aNt.A07;
            Context context = aNt.A00;
            int i = 9;
            if (aNt.A04) {
                i = 13;
            }
            r3.A08(context, AnonymousClass1LU.A0z(context, userJid, (Integer) null, i));
            return;
        }
        aNt.A0E.A02(aNt.A00, A002);
    }

    public /* synthetic */ C21071Ae1(C20508ANt aNt, UserJid userJid) {
        this.A00 = aNt;
        this.A01 = userJid;
    }
}
