package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import org.json.JSONArray;

public final class B1U extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ JSONArray $optionsJsonArray;
    public final /* synthetic */ JSONArray $preferredPaymentMethodsArray;
    public final /* synthetic */ C20936Abq this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public B1U(C20936Abq abq, JSONArray jSONArray, JSONArray jSONArray2) {
        super(1);
        this.this$0 = abq;
        this.$preferredPaymentMethodsArray = jSONArray;
        this.$optionsJsonArray = jSONArray2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass84U A0a = C108955ca.A0a(obj);
        A0a.A01(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, this.this$0.A01);
        A0a.A01("configuration_name", this.this$0.A00);
        C20936Abq abq = this.this$0;
        A0a.A01(abq.A01, abq.A04);
        if (this.this$0.A03 != null) {
            A0a.A01("preferred_payment_methods", this.$preferredPaymentMethodsArray);
        }
        if (this.this$0.A02 != null) {
            A0a.A01("enabled_payment_options", this.$optionsJsonArray);
        }
        return C27621Wu.A00;
    }
}
