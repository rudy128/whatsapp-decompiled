package X;

import android.util.Base64;
import com.whatsapp.util.Log;

/* renamed from: X.37E  reason: invalid class name */
public class AnonymousClass37E implements AnonymousClass1O5 {
    public C63832tl A00;
    public final AnonymousClass00H A01;

    public String A00(byte[] bArr) {
        String str;
        if (this.A00 == null) {
            str = "PrivateStatsSender/requestToSign need to set iq response listener first";
        } else {
            AnonymousClass00H r2 = this.A01;
            String A0T = C17890vO.A0T(r2);
            if (C17880vN.A0U(r2).A0N(this, (C29621ca) new AnonymousClass9F7(A0T, bArr, 12).A00, A0T, 239, 32000)) {
                return A0T;
            }
            str = "PrivateStatsSender/requestToSign failed to send iq request";
        }
        Log.e(str);
        return null;
    }

    public AnonymousClass37E(AnonymousClass00H r1) {
        this.A01 = r1;
    }

    public void BrD(String str) {
        C17900vP.A0e("PrivateStatsSender/onDeliveryFailure iqId = ", str, AnonymousClass000.A10());
        C63832tl r2 = this.A00;
        if (r2 != null) {
            synchronized (r2) {
                if (!str.equalsIgnoreCase(r2.A0D)) {
                    Log.e("PrivateStats/onSendFailure mismatched iq id, reset");
                    r2.A05.A05(12);
                    C63832tl.A00(r2);
                } else {
                    C63832tl.A01(r2, 5);
                }
            }
        }
    }

    public void Bt9(C29621ca r5, String str) {
        C17900vP.A0e("PrivateStatsSender/onError iqId = ", str, AnonymousClass000.A10());
        C29621ca A0L = r5.A0L("error");
        int A0B = A0L.A0B(A0L.A0P("code"), "code");
        A0L.A0Q("text", "");
        C63832tl r2 = this.A00;
        if (r2 != null) {
            synchronized (r2) {
                if (!str.equalsIgnoreCase(r2.A0D)) {
                    Log.e("PrivateStats/onIqResponseError mismatched iq id, reset");
                    C63832tl.A00(r2);
                } else if (A0B == 500) {
                    C63832tl.A01(r2, 3);
                } else {
                    Log.e("PrivateStats/onIqResponseError iq errors, stop attempting to send iq");
                    r2.A05.A05(11);
                    C63832tl.A03(r2, 2, false);
                }
            }
        }
    }

    public void C7Z(C29621ca r12, String str) {
        C29621ca A0L = r12.A0L("sign_credential");
        long A0E = A0L.A0E(A0L.A0P("t"), "t");
        byte[] bArr = A0L.A0L("signed_credential").A01;
        byte[] bArr2 = A0L.A0L("acs_public_key").A01;
        C29621ca A0K = A0L.A0K("dleq_proof");
        if (A0K != null) {
            C29621ca A0L2 = A0K.A0L("c");
            C29621ca A0L3 = A0K.A0L("s");
            C63832tl r5 = this.A00;
            if (r5 != null) {
                byte[] bArr3 = A0L2.A01;
                byte[] bArr4 = A0L3.A01;
                synchronized (r5) {
                    if (bArr3 != null) {
                        C63582tM.A02(r5.A05, "dleq_proof_c", Base64.encodeToString(bArr3, 10));
                    }
                    if (bArr4 != null) {
                        C63582tM.A02(r5.A05, "dleq_proof_s", Base64.encodeToString(bArr4, 10));
                    }
                }
            }
        }
        C63832tl r52 = this.A00;
        if (r52 != null) {
            synchronized (r52) {
                if (!str.equalsIgnoreCase(r52.A0D)) {
                    Log.e("PrivateStatsToken/onReceiveSignedToken iq requests messed up, reset");
                    C63832tl.A00(r52);
                } else if (bArr2 == null || bArr == null) {
                    r52.A05.A05(10);
                    C63832tl.A03(r52, 3, false);
                } else {
                    r52.A07.CGF(new AnonymousClass3C8(r52, bArr2, bArr, 6, A0E));
                }
            }
        }
    }

    public /* synthetic */ C22384B5n CM9(String str) {
        return C20958AcC.A00;
    }
}
