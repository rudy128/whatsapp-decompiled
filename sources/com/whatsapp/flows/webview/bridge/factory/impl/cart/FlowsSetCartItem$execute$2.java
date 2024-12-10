package com.whatsapp.flows.webview.bridge.factory.impl.cart;

import X.A6S;
import X.ADH;
import X.ADW;
import X.AE5;
import X.AE6;
import X.AEI;
import X.AEJ;
import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass1ZT;
import X.AnonymousClass3MW;
import X.AnonymousClass8BR;
import X.AnonymousClass8BT;
import X.AnonymousClass9XU;
import X.C108955ca;
import X.C18070vi;
import X.C18460wS;
import X.C194209rM;
import X.C197309wU;
import X.C20255ADn;
import X.C20256ADo;
import X.C20257ADp;
import X.C20287AEv;
import X.C25511Om;
import X.C27354DcQ;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C98494rF;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.json.JSONArray;
import org.json.JSONObject;

@DebugMetadata(c = "com.whatsapp.flows.webview.bridge.factory.impl.cart.FlowsSetCartItem$execute$2", f = "FlowsSetCartItem.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class FlowsSetCartItem$execute$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C98494rF $errorCode;
    public int label;
    public final /* synthetic */ FlowsSetCartItem this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowsSetCartItem$execute$2(FlowsSetCartItem flowsSetCartItem, C30391dr r3, C98494rF r4) {
        super(2, r3);
        this.this$0 = flowsSetCartItem;
        this.$errorCode = r4;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new FlowsSetCartItem$execute$2(this.this$0, r5, this.$errorCode);
    }

    public final Object invokeSuspend(Object obj) {
        C98494rF r1;
        int i;
        A6S a6s;
        BigDecimal bigDecimal;
        C27354DcQ dcQ;
        C27354DcQ dcQ2;
        if (this.label == 0) {
            C30691eM.A01(obj);
            try {
                JSONObject jSONObject = this.this$0.A00.getJSONObject("data");
                AnonymousClass9XU r5 = this.this$0.A01;
                C18070vi.A0d(jSONObject, 0);
                String optString = jSONObject.optString("currency_code");
                AE5 ae5 = null;
                if (C108955ca.A05(optString) > 0) {
                    a6s = new A6S(optString);
                } else {
                    a6s = null;
                }
                String A0J = C18070vi.A0J(PublicKeyCredentialControllerUtility.JSON_KEY_ID, jSONObject);
                String A0J2 = C18070vi.A0J("title", jSONObject);
                if (a6s != null) {
                    long optLong = jSONObject.optLong("price_1000");
                    Long valueOf = Long.valueOf(optLong);
                    bigDecimal = null;
                    if (optLong >= 0 && valueOf != null) {
                        bigDecimal = C197309wU.A00(a6s, optLong);
                    }
                } else {
                    bigDecimal = null;
                }
                ArrayList A11 = AnonymousClass8BR.A11(new AEI(C18070vi.A0J("image_id", jSONObject), jSONObject.getString("scaled_image_url"), jSONObject.getString("scaled_image_url"), 0, 0), new AEI[1], 0);
                ArrayList A13 = AnonymousClass000.A13();
                if (a6s != null) {
                    long optLong2 = jSONObject.optLong("sale_price_1000");
                    Long valueOf2 = Long.valueOf(optLong2);
                    if (optLong2 >= 0 && valueOf2 != null) {
                        BigDecimal A00 = C197309wU.A00(a6s, optLong2);
                        String optString2 = jSONObject.optString("sale_start_date");
                        Date date = null;
                        if (C108955ca.A05(optString2) > 0) {
                            date = r5.A00.parse(optString2);
                        }
                        String optString3 = jSONObject.optString("sale_end_date");
                        Date date2 = null;
                        if (C108955ca.A05(optString3) > 0) {
                            date2 = r5.A00.parse(optString3);
                        }
                        ae5 = new AE5(a6s, A00, date, date2);
                    }
                }
                AE6 ae6 = null;
                if (jSONObject.has("variant_props") || jSONObject.has("variants_ids")) {
                    JSONArray optJSONArray = jSONObject.optJSONArray("variant_props");
                    if (optJSONArray != null) {
                        C27354DcQ A01 = AnonymousClass1ZT.A01();
                        int length = optJSONArray.length();
                        for (int i2 = 0; i2 < length; i2++) {
                            JSONObject jSONObject2 = optJSONArray.getJSONObject(i2);
                            if (jSONObject2 != null) {
                                AnonymousClass8BT.A1Q(C18070vi.A0J(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, jSONObject2), C18070vi.A0J("value", jSONObject2), A01);
                            }
                        }
                        dcQ = AnonymousClass1ZT.A02(A01);
                    } else {
                        dcQ = null;
                    }
                    JSONArray optJSONArray2 = jSONObject.optJSONArray("variants_ids");
                    if (optJSONArray2 != null) {
                        C27354DcQ A012 = AnonymousClass1ZT.A01();
                        int length2 = optJSONArray2.length();
                        for (int i3 = 0; i3 < length2; i3++) {
                            String string = optJSONArray2.getString(i3);
                            if (string != null) {
                                A012.add(new C20256ADo(string, C18460wS.A00, true));
                            }
                        }
                        dcQ2 = AnonymousClass1ZT.A02(A012);
                    } else {
                        dcQ2 = null;
                    }
                    ae6 = new AE6(new ADW(dcQ2), (C20257ADp) null, (List) null, dcQ);
                }
                C194209rM r4 = new C194209rM(new C20287AEv((ADH) null, (C20255ADn) null, (AEJ) null, ae5, ae6, a6s, A0J, A0J2, (String) null, (String) null, (String) null, (String) null, (String) null, bigDecimal, A11, A13, 0, 99, true, false), C25511Om.A00, jSONObject.getLong("quantity"));
                try {
                    if (r4.A00 > 0) {
                        FlowsSetCartItem flowsSetCartItem = this.this$0;
                        flowsSetCartItem.A00.A0A(r4, flowsSetCartItem.A02);
                    } else {
                        FlowsSetCartItem flowsSetCartItem2 = this.this$0;
                        flowsSetCartItem2.A00.A0D(flowsSetCartItem2.A02, r4.A01.A0H);
                    }
                    FlowsSetCartItem flowsSetCartItem3 = this.this$0;
                    flowsSetCartItem3.A00.A0B(r4.A01, flowsSetCartItem3.A02);
                } catch (Exception e) {
                    Log.e("FlowsSetCartItem/execute: cannot store data to DB", e);
                    r1 = this.$errorCode;
                    i = 5;
                    r1.element = AnonymousClass3MW.A0v(i);
                    return C27621Wu.A00;
                }
            } catch (Exception e2) {
                Log.e("FlowsSetCartItem/execute: cannot parse input json", e2);
                r1 = this.$errorCode;
                i = 22;
                r1.element = AnonymousClass3MW.A0v(i);
                return C27621Wu.A00;
            }
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((FlowsSetCartItem$execute$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
