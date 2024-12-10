package X;

import android.os.Handler;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;

/* renamed from: X.7LJ  reason: invalid class name */
public final class AnonymousClass7LJ implements AnonymousClass1O5 {
    public final AnonymousClass1OZ A00;
    public final Handler A01 = C17890vO.A0D();
    public final WeakReference A02;

    public AnonymousClass7LJ(AnonymousClass871 r2, AnonymousClass1OZ r3) {
        C18070vi.A0d(r3, 2);
        this.A00 = r3;
        this.A02 = AnonymousClass3MW.A0z(r2);
    }

    public void Bt9(C29621ca r6, String str) {
        C18070vi.A0d(r6, 1);
        int A002 = C60482o6.A00(r6);
        C17900vP.A0k("sendVerifyLinkRequest/response-error ", AnonymousClass000.A10(), A002);
        Object obj = this.A02.get();
        if (obj != null) {
            this.A01.post(new AnonymousClass7RM(obj, A002, 1));
        }
    }

    public void C7Z(C29621ca r8, String str) {
        Handler handler;
        int i;
        int i2;
        String str2;
        C18070vi.A0d(r8, 1);
        C29621ca A0K = r8.A0K(PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE);
        Object obj = this.A02.get();
        if (A0K == null) {
            int A002 = C60482o6.A00(r8);
            if (obj != null) {
                this.A01.post(new AnonymousClass7RM(obj, A002, 2));
            }
            C17900vP.A0k("sendVerifyLinkRequest/response-error ", AnonymousClass000.A10(), A002);
            return;
        }
        C29621ca A0K2 = A0K.A0K("status");
        if (A0K2 == null) {
            if (obj != null) {
                handler = this.A01;
                i = 20;
            }
            Log.w("sendVerifyLinkRequest/response-error -1");
        }
        try {
            String A0M = A0K2.A0M();
            if (A0M != null) {
                i2 = Integer.parseInt(A0M);
                if (i2 == 200) {
                    C29621ca A0K3 = A0K.A0K("url");
                    if (A0K3 != null) {
                        str2 = A0K3.A0M();
                    } else {
                        str2 = null;
                    }
                    if (obj != null) {
                        this.A01.post(new C146817Qs(16, str2, obj));
                        return;
                    }
                    return;
                }
            } else {
                i2 = 0;
            }
            if (obj != null) {
                this.A01.post(new AnonymousClass7RM(obj, i2, 3));
            }
            C17900vP.A0k("sendVerifyLinkRequest/response-error ", AnonymousClass000.A10(), i2);
            return;
        } catch (NumberFormatException unused) {
            if (obj != null) {
                handler = this.A01;
                i = 21;
            }
        }
        handler.post(new C98564rM(obj, i));
        Log.w("sendVerifyLinkRequest/response-error -1");
    }

    public void BrD(String str) {
        Log.e("sendVerifyLinkRequest/delivery failure ");
        Object obj = this.A02.get();
        if (obj != null) {
            this.A01.post(new C98564rM(obj, 19));
        }
    }

    public /* synthetic */ C22384B5n CM9(String str) {
        return C20958AcC.A00;
    }
}
