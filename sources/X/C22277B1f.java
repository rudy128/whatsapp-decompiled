package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import org.json.JSONArray;

/* renamed from: X.B1f  reason: case insensitive filesystem */
public final class C22277B1f extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ List $cartItems;
    public final /* synthetic */ C20287AEv $product;
    public final /* synthetic */ long $quantity;
    public final /* synthetic */ AnonymousClass9XU this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22277B1f(C20287AEv aEv, AnonymousClass9XU r3, List list, long j) {
        super(1);
        this.$product = aEv;
        this.this$0 = r3;
        this.$quantity = j;
        this.$cartItems = list;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Long l;
        String str;
        String str2;
        String str3;
        Long l2;
        String str4;
        List list;
        Date date;
        Date date2;
        AnonymousClass84U A0a = C108955ca.A0a(obj);
        A0a.A01(PublicKeyCredentialControllerUtility.JSON_KEY_ID, this.$product.A0H);
        A0a.A01("title", this.$product.A08);
        BigDecimal bigDecimal = this.$product.A09;
        String str5 = null;
        if (bigDecimal != null) {
            l = AnonymousClass8BT.A0o(bigDecimal.multiply(C197309wU.A00));
        } else {
            l = null;
        }
        A0a.A01("price_1000", l);
        A6S a6s = this.$product.A07;
        if (a6s != null) {
            str = a6s.A00;
        } else {
            str = null;
        }
        A0a.A01("currency_code", str);
        AEI aei = (AEI) C29431cG.A0c(this.$product.A0A);
        if (aei != null) {
            str2 = aei.A04;
        } else {
            str2 = "";
        }
        A0a.A01("image_id", str2);
        if (aei != null) {
            str3 = aei.A01;
        } else {
            str3 = null;
        }
        A0a.A01("scaled_image_url", str3);
        A0a.A01("quantity", Long.valueOf(this.$quantity));
        AE5 ae5 = this.$product.A04;
        if (ae5 != null) {
            l2 = AnonymousClass8BT.A0o(ae5.A00.multiply(C197309wU.A00));
        } else {
            l2 = null;
        }
        A0a.A01("sale_price_1000", l2);
        AE5 ae52 = this.$product.A04;
        if (ae52 == null || (date2 = ae52.A02) == null) {
            str4 = null;
        } else {
            str4 = this.this$0.A00.format(date2);
        }
        A0a.A01("sale_start_date", str4);
        AE5 ae53 = this.$product.A04;
        if (!(ae53 == null || (date = ae53.A01) == null)) {
            str5 = this.this$0.A00.format(date);
        }
        A0a.A01("sale_end_date", str5);
        A0a.A01("max_available", Long.valueOf(this.$product.A01));
        AE6 ae6 = this.$product.A05;
        if (!(ae6 == null || (list = ae6.A02) == null)) {
            C22190Az6 az6 = new C22190Az6(list);
            JSONArray jSONArray = new JSONArray();
            az6.invoke(jSONArray);
            A0a.A01("variant_props", jSONArray);
        }
        A0a.A01("total_variant_quantity", Long.valueOf(C196479v8.A00(this.$product, this.$cartItems)));
        return C27621Wu.A00;
    }
}
