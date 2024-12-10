package X;

import android.app.Activity;
import com.whatsapp.jid.UserJid;

/* renamed from: X.4i9  reason: invalid class name and case insensitive filesystem */
public class C92924i9 implements C107105Yk {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C92924i9(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public final void CQ7() {
        if (this.A00 != 0) {
            C78413sl r4 = (C78413sl) this.A01;
            C37551pj A0V = AnonymousClass3MW.A0V(r4.A1g);
            C72073Kn r1 = r4.A02;
            UserJid A002 = C22941Dw.A00(r4.A04);
            C17960vV.A07(A002);
            A0V.A0F((Activity) this.A02, r1, A002);
            return;
        }
        AnonymousClass3uP r12 = (AnonymousClass3uP) this.A01;
        C37551pj A0V2 = AnonymousClass3MW.A0V(r12.A1g);
        Activity A05 = AnonymousClass3Ma.A05(r12);
        UserJid userJid = ((AW0) this.A02).A0D;
        C17960vV.A07(userJid);
        A0V2.A0I(A05, C22941Dw.A00(userJid));
    }
}
