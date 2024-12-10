package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.7S7  reason: invalid class name */
public class AnonymousClass7S7 implements C18080vj, C22821Di {
    public final int A00;
    public final String A01;

    public AnonymousClass7S7(String str, int i) {
        this.A00 = i;
        this.A01 = str;
    }

    public final Object invoke(Object obj) {
        int i = this.A00;
        String str = this.A01;
        if (i != 0) {
            AnonymousClass84U r3 = (AnonymousClass84U) obj;
            C18070vi.A0d(r3, 1);
            r3.A01(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str);
            r3.A01(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "ARTIST");
        } else {
            C16520sO r32 = (C16520sO) obj;
            C18070vi.A0d(r32, 1);
            C05150Qq.A04(r32, str);
        }
        return C27621Wu.A00;
    }
}
