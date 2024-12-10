package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.Bxq  reason: case insensitive filesystem */
public enum C24236Bxq {
    ;

    /* access modifiers changed from: public */
    static {
        C24236Bxq[] bxqArr;
        A00 = C19780yz.A00(bxqArr);
    }

    public String A00() {
        if (this instanceof BR0) {
            return PublicKeyCredentialControllerUtility.JSON_KEY_TIMEOUT;
        }
        if (this instanceof C22821BQz) {
            return "unSupportedNetworkInitial";
        }
        if (this instanceof C22820BQy) {
            return "unSupportedNetwork";
        }
        if (this instanceof C22819BQx) {
            return "lowMemory";
        }
        if (this instanceof C22818BQw) {
            return "initialCheckFailed";
        }
        if (this instanceof C22817BQv) {
            return "effectLoadFailed";
        }
        return "avatarLoadFailed";
    }
}
