package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.7vr  reason: invalid class name and case insensitive filesystem */
public final class C157137vr extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ AnonymousClass77S $accessTokenWrapped;
    public final /* synthetic */ C137866w9 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C157137vr(AnonymousClass77S r2, C137866w9 r3) {
        super(0);
        this.$accessTokenWrapped = r2;
        this.this$0 = r3;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [java.lang.Object, X.87L] */
    /* JADX WARNING: type inference failed for: r2v2, types: [java.lang.Object, X.87L] */
    /* JADX WARNING: type inference failed for: r2v3, types: [java.lang.Object, X.87L] */
    public /* bridge */ /* synthetic */ Object invoke() {
        JSONObject optJSONObject;
        Object A00 = this.$accessTokenWrapped.A00("XFAM_CROSSPOSTING_NATIVE_AUTH_PROFILE_DATA_FETCH_GQL");
        if (A00 != null) {
            String str = (String) A00;
            String[] strArr = new String[2];
            strArr[0] = PublicKeyCredentialControllerUtility.JSON_KEY_NAME;
            C129716iF A01 = ((C139046y7) this.this$0.A00.get()).A01(str, C18070vi.A0O("picture.type(large)", strArr, 1));
            C137866w9.A00(A01);
            String str2 = null;
            try {
                JSONObject jSONObject = A01.A04;
                if (jSONObject != null) {
                    String string = jSONObject.getString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
                    JSONObject optJSONObject2 = jSONObject.optJSONObject("picture");
                    if (!(optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject("data")) == null)) {
                        str2 = optJSONObject.optString("url");
                    }
                    if (string != null) {
                        C18070vi.A0d(str, 0);
                        Class<String> cls = String.class;
                        return new AnonymousClass779(new AnonymousClass77S(new C1418477e(new Object(), cls, str, "XFamilyFbAccessToken"), 2), new AnonymousClass77S(new C1418477e(new Object(), cls, string, "XFamilyFbFullName"), 2), new AnonymousClass77S(new C1418477e(new Object(), cls, str2, "XFamilyProfilePicUrl"), 2));
                    }
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
