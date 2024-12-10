package X;

import android.view.View;
import com.whatsapp.avatar.editor.extensions.NetworkListenerControllerImpl$bind$2;
import com.whatsapp.productinfra.avatar.liveediting.network.AvatarLiveEditingConnectivityResolver$connectivityStateChanges$1;
import java.util.concurrent.CancellationException;

/* renamed from: X.CZr  reason: case insensitive filesystem */
public abstract class C25141CZr {
    public final int A00;

    public Object A00(DOZ doz) {
        return ((C23805Bpw) this).A00.getValue();
    }

    public C25141CZr(int i) {
        this.A00 = i;
    }

    public void A01(View view, DOZ doz, DFL dfl, DFL dfl2) {
        CQR cqr = (CQR) C26272CwJ.A04(doz, dfl);
        if (cqr != null) {
            C28066Dqg dqg = new C28066Dqg(doz, dfl);
            AnonymousClass1OX r1 = cqr.A00;
            if (r1 != null) {
                AnonymousClass1OW.A04((CancellationException) null, r1);
            }
            cqr.A00 = C108995ce.A0f(cqr.A02);
            C25067CVz cVz = cqr.A01;
            C27183DXs dXs = new C27183DXs((AnonymousClass1OS) new NetworkListenerControllerImpl$bind$2((C30391dr) null, dqg), (C23421Fz) new C27179DXo(C26092CsA.A02(new C27183DXs((Object) cVz, (Object) AnonymousClass4I4.A00(new AvatarLiveEditingConnectivityResolver$connectivityStateChanges$1(cVz, (C30391dr) null)), 4)), 0), 10);
            AnonymousClass1OX r0 = cqr.A00;
            if (r0 == null) {
                C18070vi.A11("scope");
                throw null;
            } else {
                C88604aC.A03(r0, dXs);
            }
        }
    }

    public void A02(View view, DOZ doz, DFL dfl, DFL dfl2) {
        AnonymousClass1OX r1;
        CQR cqr = (CQR) C26272CwJ.A04(doz, dfl);
        if (cqr != null && (r1 = cqr.A00) != null) {
            AnonymousClass1OW.A04((CancellationException) null, r1);
        }
    }
}
