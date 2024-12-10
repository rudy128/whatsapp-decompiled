package X;

import android.os.Message;

/* renamed from: X.7tT  reason: invalid class name and case insensitive filesystem */
public final class C155887tT extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ Message $msg;
    public final /* synthetic */ AnonymousClass75Z this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C155887tT(Message message, AnonymousClass75Z r3) {
        super(0);
        this.$msg = message;
        this.this$0 = r3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0047  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r5 = this;
            android.os.Message r0 = r5.$msg
            java.lang.Object r1 = r0.obj
            java.lang.String r0 = "null cannot be cast to non-null type android.webkit.WebMessage"
            X.C18070vi.A0z(r1, r0)
            android.webkit.WebMessage r1 = (android.webkit.WebMessage) r1
            java.lang.String r4 = r1.getData()
            X.75Z r0 = r5.this$0     // Catch:{ JSONException -> 0x002d, NoSuchAlgorithmException -> 0x002a, InvalidKeySpecException -> 0x0030 }
            X.890 r2 = r0.A04     // Catch:{ JSONException -> 0x002d, NoSuchAlgorithmException -> 0x002a, InvalidKeySpecException -> 0x0030 }
            if (r2 == 0) goto L_0x0035
            android.webkit.WebMessagePort r1 = r0.A01     // Catch:{ JSONException -> 0x002d, NoSuchAlgorithmException -> 0x002a, InvalidKeySpecException -> 0x0030 }
            if (r1 != 0) goto L_0x0022
            java.lang.String r0 = "sendPort"
            X.C18070vi.A11(r0)     // Catch:{ JSONException -> 0x002d, NoSuchAlgorithmException -> 0x002a, InvalidKeySpecException -> 0x0030 }
            r0 = 0
            throw r0     // Catch:{ JSONException -> 0x002d, NoSuchAlgorithmException -> 0x002a, InvalidKeySpecException -> 0x0030 }
        L_0x0022:
            org.json.JSONObject r0 = X.C17880vN.A16(r4)     // Catch:{ JSONException -> 0x002d, NoSuchAlgorithmException -> 0x002a, InvalidKeySpecException -> 0x0030 }
            r2.CAU(r1, r0)     // Catch:{ JSONException -> 0x002d, NoSuchAlgorithmException -> 0x002a, InvalidKeySpecException -> 0x0030 }
            goto L_0x0035
        L_0x002a:
            java.lang.String r0 = "Key algorithm not supported"
            goto L_0x0032
        L_0x002d:
            java.lang.String r0 = "Exception while parsing data from JS"
            goto L_0x0032
        L_0x0030:
            java.lang.String r0 = "Invalid public key"
        L_0x0032:
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0035:
            X.75Z r0 = r5.this$0
            X.0ve r2 = r0.A03
            r1 = 8635(0x21bb, float:1.21E-41)
            X.0vf r0 = X.C18040vf.A02
            int r3 = X.C18020vd.A00(r0, r2, r1)
            int r2 = r4.length()
            if (r2 <= r3) goto L_0x0058
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Payload size exceeds limit: size="
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ", limit="
            X.C17900vP.A0i(r0, r1, r3)
        L_0x0058:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C155887tT.invoke():java.lang.Object");
    }
}
