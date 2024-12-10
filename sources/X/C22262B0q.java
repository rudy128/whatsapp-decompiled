package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.B0q  reason: case insensitive filesystem */
public final class C22262B0q extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ String $name;
    public final /* synthetic */ String $value;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22262B0q(String str, String str2) {
        super(1);
        this.$name = str;
        this.$value = str2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass84U A0a = C108955ca.A0a(obj);
        A0a.A01(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, this.$name);
        A0a.A01("value", this.$value);
        return C27621Wu.A00;
    }
}
