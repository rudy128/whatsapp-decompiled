package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;

/* renamed from: X.37D  reason: invalid class name */
public class AnonymousClass37D implements AnonymousClass1O5 {
    public C63512tE A00;
    public final AnonymousClass1OZ A01;

    public String A00(byte[] bArr, String str) {
        if (this.A00 == null) {
            Log.e("ACSSender/requestToSign need to set iq response listener first");
            return null;
        }
        AnonymousClass1OZ r9 = this.A01;
        String A0B = r9.A0B();
        C29621ca r8 = new C29621ca("blinded_credential", bArr, (AnonymousClass1MD[]) null);
        C29621ca r4 = new C29621ca("project_name", str, (AnonymousClass1MD[]) null);
        AnonymousClass1MD[] r3 = new AnonymousClass1MD[1];
        int A1W = C17890vO.A1W("version", "2", r3);
        C29621ca[] r1 = new C29621ca[2];
        r1[A1W] = r8;
        r1[1] = r4;
        C29621ca r42 = new C29621ca("sign_credential", r3, r1);
        AnonymousClass1MD[] r32 = new AnonymousClass1MD[4];
        C17880vN.A1Q("xmlns", "privatestats", r32, A1W);
        C17880vN.A1Q(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A0B, r32, 1);
        C17880vN.A1Q(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get", r32, 2);
        if (r9.A0N(this, C29621ca.A00(C173438v4.A00, r42, r32), A0B, 278, 32000)) {
            return A0B;
        }
        Log.e("ACSSender/requestToSign failed to send iq request");
        return null;
    }

    public AnonymousClass37D(AnonymousClass1OZ r1) {
        this.A01 = r1;
    }

    public void BrD(String str) {
        C17900vP.A0e("ACSSender/onDeliveryFailure iqId = ", str, AnonymousClass000.A10());
        C63512tE r2 = this.A00;
        if (r2 == null) {
            return;
        }
        if (!str.equalsIgnoreCase(r2.A0D)) {
            Log.e("ACSToken/onSendFailure mismatched iq id, reset");
            r2.A04.A04(12);
            C63512tE.A00(r2);
            return;
        }
        C63512tE.A01(r2, 5);
    }

    public void Bt9(C29621ca r5, String str) {
        C17900vP.A0e("ACSSender/onError iqId = ", str, AnonymousClass000.A10());
        C29621ca A0L = r5.A0L("error");
        int A0B = A0L.A0B(A0L.A0P("code"), "code");
        A0L.A0Q("text", "");
        C63512tE r2 = this.A00;
        if (r2 == null) {
            return;
        }
        if (!str.equalsIgnoreCase(r2.A0D)) {
            Log.e("ACSToken/onIqResponseError mismatched iq id, reset");
            C63512tE.A00(r2);
        } else if (A0B == 500) {
            C63512tE.A01(r2, 3);
        } else {
            Log.e("ACSToken/onIqResponseError iq errors, stop attempting to send iq");
            r2.A04.A04(11);
            C63512tE.A02(r2, false);
        }
    }

    public void C7Z(C29621ca r9, String str) {
        C29621ca A0L = r9.A0L("sign_credential");
        long A0E = A0L.A0E(A0L.A0P("t"), "t");
        byte[] bArr = A0L.A0L("signed_credential").A01;
        byte[] bArr2 = A0L.A0L("acs_public_key").A01;
        C29621ca A0K = A0L.A0K("dleq_proof");
        if (A0K != null) {
            A0K.A0L("c");
            A0K.A0L("s");
        }
        C63512tE r2 = this.A00;
        if (r2 != null) {
            synchronized (r2) {
                if (!str.equalsIgnoreCase(r2.A0D)) {
                    Log.e("ACSToken/onReceiveSignedToken iq requests messed up, reset");
                    C63512tE.A00(r2);
                } else if (bArr2 == null || bArr == null) {
                    r2.A04.A04(10);
                    C63512tE.A02(r2, false);
                } else {
                    r2.A08.execute(new AnonymousClass3C8(r2, bArr2, bArr, 0, A0E));
                }
            }
        }
    }

    public /* synthetic */ C22384B5n CM9(String str) {
        return C20958AcC.A00;
    }
}
