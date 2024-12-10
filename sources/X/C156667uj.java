package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Message;
import android.webkit.WebMessage;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.security.NoSuchAlgorithmException;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.7uj  reason: invalid class name and case insensitive filesystem */
public final class C156667uj extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ Message $msg;
    public final /* synthetic */ C1412875a this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C156667uj(Message message, C1412875a r3) {
        super(0);
        this.$msg = message;
        this.this$0 = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        String str;
        C1412875a r3;
        Object obj;
        C139456ys r0;
        Object obj2 = this.$msg.obj;
        C18070vi.A0z(obj2, "null cannot be cast to non-null type android.webkit.WebMessage");
        String data = ((WebMessage) obj2).getData();
        if (data.length() <= 1024) {
            try {
                JSONObject A16 = C17880vN.A16(data);
                Object obj3 = A16.get("method");
                if (C18070vi.A18(obj3, "isSupported")) {
                    r3 = this.this$0;
                    Object obj4 = A16.get("data");
                    C18070vi.A0z(obj4, "null cannot be cast to non-null type org.json.JSONObject");
                    Object obj5 = ((JSONObject) obj4).get("feature");
                    C18070vi.A0z(obj5, "null cannot be cast to non-null type kotlin.String");
                    if (!C18070vi.A18(obj5, "UPI_PAY") || r3.A05.A05("UPI") == null) {
                        obj = AnonymousClass000.A0h();
                    } else {
                        C1412875a.A03(new C156677uk(r3, C17880vN.A15().put("responseData", C17880vN.A15().put("result", true).put("webview_token", A16.get("webview_token"))).put("method", A16.get("method")).put("callbackID", A16.get("callbackID"))));
                    }
                } else if (C18070vi.A18(obj3, "startUpiPayment")) {
                    r3 = this.this$0;
                    C110125ey r02 = r3.A00;
                    if (r02 == null) {
                        C18070vi.A11("secureWebView");
                        throw null;
                    }
                    String string = A16.getString("webview_token");
                    C129556hz r4 = r02.A06;
                    String url = r02.getUrl();
                    if (r4.A02) {
                        String A00 = C139456ys.A00(url);
                        HashMap hashMap = r4.A04;
                        if (!hashMap.containsKey(A00) || (r0 = (C139456ys) hashMap.get(A00)) == null || !string.equals(r0.A01)) {
                            obj = "FAILURE";
                        }
                    }
                    Object obj6 = A16.get("data");
                    C18070vi.A0z(obj6, "null cannot be cast to non-null type org.json.JSONObject");
                    JSONObject jSONObject = (JSONObject) obj6;
                    Object obj7 = jSONObject.get("reference_id");
                    C18070vi.A0z(obj7, "null cannot be cast to non-null type kotlin.String");
                    String str2 = (String) obj7;
                    String A0f = C108975cc.A0f("payment_config", jSONObject);
                    String A0f2 = C108975cc.A0f("amount", jSONObject);
                    String A0f3 = C108975cc.A0f(PublicKeyCredentialControllerUtility.JSON_KEY_SIGNATURE, jSONObject);
                    String A0f4 = C108975cc.A0f("signature_type", jSONObject);
                    String[] strArr = new String[3];
                    AnonymousClass001.A1Q(PublicKeyCredentialControllerUtility.JSON_KEY_SIGNATURE, "signature_type", strArr);
                    strArr[2] = "webview_token";
                    Set A0S = C200410p.A0S(strArr);
                    JSONObject A15 = C17880vN.A15();
                    Iterator<String> keys = jSONObject.keys();
                    C18070vi.A0X(keys);
                    C147047Rp r2 = new C147047Rp(AnonymousClass1b2.A09(new C1583280g(A0S), new C99434so(AnonymousClass1b2.A0C(C1592083q.A00, AnonymousClass1JO.A01(keys)), 7)));
                    while (r2.hasNext()) {
                        String str3 = (String) r2.next();
                        A15.put(str3, jSONObject.get(str3));
                    }
                    C20262ADu aDu = new C20262ADu(A0f3, A0f4, C18070vi.A0H(A15));
                    Context context = r3.A02;
                    UserJid userJid = r3.A04;
                    C18070vi.A0p(str2, A0f, A0f2);
                    Intent A0A = C17880vN.A0A();
                    A0A.setClassName(context.getPackageName(), "com.whatsapp.payments.ui.IndiaWebViewUpiP2mHybridActivity");
                    AnonymousClass3MY.A12(A0A, userJid, "extra_receiver_jid");
                    A0A.putExtra("extra_order_id", str2);
                    A0A.putExtra("extra_payment_config_id", A0f);
                    A0A.putExtra("extra_p2m_amount", A0f2);
                    A0A.putExtra("method", C108975cc.A0f("method", A16));
                    A0A.putExtra("callbackID", C108975cc.A0f("callbackID", A16));
                    A0A.putExtra("extra_merchant_signature_data", aDu);
                    A0A.putExtra("referral_screen", "webview");
                    A0A.putExtra("extra_payment_config_id", A0f);
                    A0A.putExtra("extra_transaction_type", "p2m");
                    ((Activity) context).startActivityForResult(A0A, 1000);
                }
                C1412875a.A02(r3, obj, A16);
            } catch (JSONException unused) {
                str = "Exception while parsing data from JS";
            } catch (NoSuchAlgorithmException unused2) {
                str = "Key algorithm not supported";
            } catch (InvalidKeySpecException unused3) {
                str = "Invalid public key";
            } catch (SignatureException unused4) {
                str = "Invalid signature";
            }
        } else {
            str = "Payload size exceeds limit";
            Log.e(str);
        }
        return C27621Wu.A00;
    }
}
