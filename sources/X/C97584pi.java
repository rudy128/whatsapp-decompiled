package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;

/* renamed from: X.4pi  reason: invalid class name and case insensitive filesystem */
public final class C97584pi implements AnonymousClass1O5 {
    public final AnonymousClass1OZ A00;
    public final WeakReference A01;

    public C97584pi(AnonymousClass1OZ r2, WeakReference weakReference) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
        this.A01 = weakReference;
    }

    public final void A00(boolean z, String str) {
        String str2 = str;
        C18070vi.A0d(str2, 1);
        AnonymousClass1OZ r8 = this.A00;
        String A0B = r8.A0B();
        AnonymousClass1MD[] r4 = new AnonymousClass1MD[2];
        r4[0] = new AnonymousClass1MD("approve", String.valueOf(z));
        C17880vN.A1Q(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str2, r4, 1);
        C29621ca r5 = new C29621ca("device_logout", r4);
        AnonymousClass1MD[] r42 = new AnonymousClass1MD[5];
        C17880vN.A1Q("xmlns", "w:account_defence", r42, 0);
        C17880vN.A1Q(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A0B, r42, 1);
        C17880vN.A1Q(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set", r42, 2);
        r42[3] = new AnonymousClass1MD("smax_id", 87);
        r42[4] = new AnonymousClass1MD((Jid) C173438v4.A00, "to");
        r8.A0I(this, new C29621ca(r5, "iq", r42), A0B, 354, 20000);
    }

    public void Bt9(C29621ca r4, String str) {
        C18070vi.A0d(r4, 1);
        C29621ca A0K = r4.A0K("error");
        int i = -2;
        if (A0K != null) {
            i = A0K.A0A("code", -2);
        }
        C107035Yd r0 = (C107035Yd) this.A01.get();
        if (r0 != null) {
            r0.onError(i);
        }
    }

    public void C7Z(C29621ca r4, String str) {
        boolean z;
        String A0Q;
        C18070vi.A0d(r4, 1);
        C29621ca A0K = r4.A0K("device_logout");
        if (A0K == null || (A0Q = A0K.A0Q("success", "true")) == null) {
            z = false;
        } else {
            z = A0Q.equals("true");
        }
        C107035Yd r1 = (C107035Yd) this.A01.get();
        if (z) {
            if (r1 != null && ((C92264h1) r1).A00 == 0) {
                Log.i("DeviceConfirmationRegAlertDialogFragment/ Successfully sent Do Not Allow IQ");
            }
        } else if (r1 != null) {
            r1.onError(-2);
        }
    }

    public void BrD(String str) {
        C107035Yd r1 = (C107035Yd) this.A01.get();
        if (r1 != null) {
            r1.onError(-1);
        }
    }

    public /* synthetic */ C22384B5n CM9(String str) {
        return C20958AcC.A00;
    }
}
