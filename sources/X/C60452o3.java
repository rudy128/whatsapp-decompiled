package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.2o3  reason: invalid class name and case insensitive filesystem */
public final class C60452o3 {
    public static final AnonymousClass1MD[] A00(String str, String str2) {
        String str3;
        AnonymousClass1MD r6 = new AnonymousClass1MD(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str);
        if ("stickers".equals(str)) {
            str3 = "contact_allowlist";
        } else {
            str3 = "contact_blacklist";
        }
        AnonymousClass1MD r5 = new AnonymousClass1MD("value", str3);
        if (str2 == null) {
            return new AnonymousClass1MD[]{r6, r5};
        }
        AnonymousClass1MD[] r1 = new AnonymousClass1MD[3];
        r1[0] = r6;
        r1[1] = r5;
        C17880vN.A1Q("dhash", str2, r1, 2);
        return r1;
    }
}
