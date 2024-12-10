package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.Az0  reason: case insensitive filesystem */
public final class C22184Az0 extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C20280AEo this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22184Az0(C20280AEo aEo) {
        super(1);
        this.this$0 = aEo;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass84U A0a = C108955ca.A0a(obj);
        A0a.A01(PublicKeyCredentialControllerUtility.JSON_KEY_ID, this.this$0.A01);
        A0a.A01("message_id", this.this$0.A02);
        A0a.A01("expiry_ts", Long.valueOf(this.this$0.A00));
        return C27621Wu.A00;
    }
}
