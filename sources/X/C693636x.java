package X;

import com.whatsapp.util.Log;

/* renamed from: X.36x  reason: invalid class name and case insensitive filesystem */
public class C693636x implements AnonymousClass1O5 {
    public final int A00;

    public C693636x(int i) {
        this.A00 = i;
    }

    public void BrD(String str) {
        if (this.A00 != 0) {
            Log.i("logHoldoutExposure/delivery fail");
        } else {
            Log.e("SpamXmppMethods/failed to deliver spam report");
        }
    }

    public void Bt9(C29621ca r4, String str) {
        String str2;
        if (this.A00 != 0) {
            C18070vi.A0d(r4, 1);
            str2 = AnonymousClass001.A1I("logHoldoutExposure/Error/", AnonymousClass000.A10(), C60482o6.A00(r4));
        } else {
            str2 = "SpamXmppMethods/bad spam report";
        }
        Log.e(str2);
    }

    public void C7Z(C29621ca r2, String str) {
        String str2;
        if (this.A00 != 0) {
            str2 = "logHoldoutExposure/read/client_config_set";
        } else {
            str2 = "SpamXmppMethods/success";
        }
        Log.i(str2);
    }

    public /* synthetic */ C22384B5n CM9(String str) {
        return C20958AcC.A00;
    }
}
