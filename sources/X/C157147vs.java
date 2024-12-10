package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.7vs  reason: invalid class name and case insensitive filesystem */
public final class C157147vs extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ AnonymousClass77S $accessTokenWrapped;
    public final /* synthetic */ C137866w9 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C157147vs(AnonymousClass77S r2, C137866w9 r3) {
        super(0);
        this.$accessTokenWrapped = r2;
        this.this$0 = r3;
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [java.lang.Object, X.87L] */
    public /* bridge */ /* synthetic */ Object invoke() {
        Object A00 = this.$accessTokenWrapped.A00("XFAM_CROSSPOSTING_WEB_AUTH_PROFILE_DATA_FETCH_GQL");
        if (A00 != null) {
            C129716iF A01 = ((C139046y7) this.this$0.A00.get()).A01((String) A00, C18070vi.A0M(PublicKeyCredentialControllerUtility.JSON_KEY_NAME));
            C137866w9.A00(A01);
            String str = null;
            try {
                JSONObject jSONObject = A01.A04;
                if (jSONObject != null) {
                    str = jSONObject.getString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
                }
                ? obj = new Object();
                Class<String> cls = String.class;
                if (str != null) {
                    return new AnonymousClass77S(new C1418477e(obj, cls, str, "XFamilyFbFullName"), 2);
                }
                throw AnonymousClass000.A0n("Required value was null.");
            } catch (JSONException e) {
                throw new AnonymousClass6Q6(e);
            }
        } else {
            throw AnonymousClass000.A0n("Required value was null.");
        }
    }
}
