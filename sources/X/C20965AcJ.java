package X;

import android.util.Pair;
import com.whatsapp.util.Log;

/* renamed from: X.AcJ  reason: case insensitive filesystem */
public class C20965AcJ implements AnonymousClass1O5 {
    public final AnonymousClass1OZ A00;
    public final C190539l7 A01;

    public void BrD(String str) {
        Log.w("LinkCodePrimaryHelloProtocolHelper/sendPrimaryHelloIq onDeliveryFailure");
        C190539l7 r0 = this.A01;
        r0.A00.notifyAllObservers(new AnonymousClass7KS(r0.A02, r0.A01, 1));
    }

    public void C7Z(C29621ca r6, String str) {
        C190539l7 r0 = this.A01;
        C35871mw r4 = r0.A00;
        String str2 = r0.A02;
        String str3 = r0.A01;
        r4.notifyAllObservers(new AnonymousClass7KS(str2, str3, 3));
        ((C195219sz) r4.A06.get()).A01(4, str2, str3);
    }

    public C20965AcJ(C190539l7 r1, AnonymousClass1OZ r2) {
        this.A00 = r2;
        this.A01 = r1;
    }

    public void Bt9(C29621ca r4, String str) {
        C190539l7 r1;
        Integer num;
        Pair A012 = C60482o6.A01(r4);
        if (A012 != null) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("LinkCodePrimaryHelloProtocolHelper/sendPrimaryHelloIq error code=");
            A10.append(A012.first);
            A10.append("; text=");
            C17890vO.A19(A10, (String) A012.second);
            r1 = this.A01;
            num = (Integer) A012.first;
        } else {
            Log.e("LinkCodePrimaryHelloProtocolHelper/sendPrimaryHelloIq unknown code");
            r1 = this.A01;
            num = null;
        }
        r1.A00(num);
    }

    public /* synthetic */ C22384B5n CM9(String str) {
        return C20958AcC.A00;
    }
}
