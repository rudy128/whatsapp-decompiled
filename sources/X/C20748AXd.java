package X;

import android.content.Context;
import android.content.Intent;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.AXd  reason: case insensitive filesystem */
public class C20748AXd implements C22555BCo {
    public final AnonymousClass1KH A00;
    public final C20074A6a A01;
    public final C184659bJ A02;
    public final C191389mW A03;

    public /* synthetic */ void BcP(Context context, Intent intent, String str) {
    }

    public boolean Bgh() {
        return true;
    }

    public AnonymousClass1MD BLu(String str) {
        C170278pb r2;
        AnonymousClass8pK r0 = (AnonymousClass8pK) this.A00.A08(str);
        if (!(r0 == null || (r2 = r0.A08) == null)) {
            AnonymousClass8pT r22 = (AnonymousClass8pT) r2;
            String A002 = this.A03.A00(r0.A01);
            if ("VISA".equals(r22.A02)) {
                C20074A6a a6a = this.A01;
                String str2 = r22.A05;
                try {
                    JSONObject A15 = C17880vN.A15();
                    A15.put(PublicKeyCredentialControllerUtility.JSON_KEY_ALG, "PS256");
                    A15.put("typ", "JOSE");
                    A15.put("kid", A002);
                    A15.put("iat", AnonymousClass11P.A00(a6a.A00));
                    String A012 = C20074A6a.A01(a6a, A15.toString(), C20074A6a.A02(A002, (String) null, str2));
                    if (A012 != null) {
                        return AnonymousClass8BR.A0h("trusted-device-info", A012);
                    }
                } catch (JSONException e) {
                    Log.w("PAY: generateTrustedDeviceInfoJwsToken threw creating json string: ", e);
                }
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003b, code lost:
        if (r2 != 20923) goto L_0x003d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0066 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String Bai(android.content.res.Resources r5, X.AW0 r6, java.lang.String r7) {
        /*
            r4 = this;
            java.lang.String r1 = r6.A0J
            r3 = 0
            if (r1 == 0) goto L_0x0078
            r0 = -1
            int r2 = X.C20099A7c.A01(r1, r0)
            int r1 = r6.A02
            r0 = 406(0x196, float:5.69E-43)
            if (r1 == r0) goto L_0x001c
            r0 = 407(0x197, float:5.7E-43)
            if (r1 == r0) goto L_0x001c
            r0 = 13
            if (r1 == r0) goto L_0x001c
            r0 = 14
            if (r1 != r0) goto L_0x0078
        L_0x001c:
            X.9bJ r1 = r4.A02
            X.9m0 r0 = r1.A01
            java.lang.String r0 = r0.A00(r2)
            if (r0 != 0) goto L_0x0048
            r0 = 2001(0x7d1, float:2.804E-42)
            if (r2 == r0) goto L_0x0055
            r0 = 4002(0xfa2, float:5.608E-42)
            if (r2 == r0) goto L_0x004f
            r0 = 10242(0x2802, float:1.4352E-41)
            if (r2 == r0) goto L_0x0049
            r0 = 20884(0x5194, float:2.9265E-41)
            if (r2 == r0) goto L_0x005b
            r1 = 20923(0x51bb, float:2.932E-41)
            r0 = 2131893630(0x7f121d7e, float:1.9422042E38)
            if (r2 == r1) goto L_0x0044
        L_0x003d:
            r0 = 2001(0x7d1, float:2.804E-42)
            if (r2 != r0) goto L_0x0067
            r0 = 2131893629(0x7f121d7d, float:1.942204E38)
        L_0x0044:
            java.lang.String r0 = r5.getString(r0)
        L_0x0048:
            return r0
        L_0x0049:
            X.118 r1 = r1.A00
            r0 = 2131892989(0x7f121afd, float:1.9420742E38)
            goto L_0x0060
        L_0x004f:
            X.118 r1 = r1.A00
            r0 = 2131886343(0x7f120107, float:1.9407262E38)
            goto L_0x0060
        L_0x0055:
            X.118 r1 = r1.A00
            r0 = 2131891415(0x7f1214d7, float:1.941755E38)
            goto L_0x0060
        L_0x005b:
            X.118 r1 = r1.A00
            r0 = 2131887943(0x7f120747, float:1.9410507E38)
        L_0x0060:
            java.lang.String r0 = r1.A01(r0)
            if (r0 == 0) goto L_0x003d
            return r0
        L_0x0067:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "BrazilTransactionHelper/getTransactionStatusDetail : unhandled error code ("
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ")"
            X.C17890vO.A1A(r1, r0)
        L_0x0078:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20748AXd.Bai(android.content.res.Resources, X.AW0, java.lang.String):java.lang.String");
    }

    public C20748AXd(AnonymousClass1KH r1, C20074A6a a6a, C184659bJ r3, C191389mW r4) {
        this.A00 = r1;
        this.A03 = r4;
        this.A01 = a6a;
        this.A02 = r3;
    }

    public /* synthetic */ boolean CMA(String str) {
        return false;
    }
}
