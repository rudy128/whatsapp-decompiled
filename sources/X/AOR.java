package X;

import android.app.Activity;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.lang.ref.WeakReference;

public class AOR implements C107105Yk {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public AOR(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.A00 = i;
        this.A01 = obj3;
        this.A02 = obj;
        this.A03 = obj2;
        this.A04 = obj4;
    }

    public final void CQ7() {
        switch (this.A00) {
            case 0:
                Activity activity = (Activity) this.A02;
                Object obj = this.A03;
                WeakReference A0z = AnonymousClass3MW.A0z(activity);
                AnonymousClass3MW.A0V(((AnonymousClass4Q5) this.A01).A00).A0F(activity, new AOI(A0z, obj, 1), (UserJid) this.A04);
                return;
            case 1:
                C37551pj A0V = AnonymousClass3MW.A0V(((C191339mR) this.A01).A02);
                UserJid A002 = C22941Dw.A00((Jid) this.A04);
                C17960vV.A07(A002);
                A0V.A0F((Activity) this.A02, (C72073Kn) this.A03, A002);
                return;
            default:
                C191339mR r3 = (C191339mR) this.A01;
                Object obj2 = this.A04;
                r3.A01.A06().BPW().A01((Activity) this.A02, new AXB(obj2, 2), r3.A00, (String) AnonymousClass8BT.A0q((C1418477e) this.A03), false);
                return;
        }
    }
}
