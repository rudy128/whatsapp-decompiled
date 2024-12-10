package X;

import android.util.Base64;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.A8h  reason: case insensitive filesystem */
public final class C20122A8h {
    public static final C20122A8h A00 = new Object();

    public static final JSONObject A05(C20279AEn aEn, boolean z) {
        JSONArray A1A;
        AnonymousClass84U r1;
        JSONArray A1A2;
        byte[] A002;
        JSONObject jSONObject = null;
        if (aEn == null) {
            return null;
        }
        JSONObject A15 = C17880vN.A15();
        byte[] bArr = aEn.A0U;
        if (!(bArr == null || (A002 = AnonymousClass9QV.A00(bArr, z)) == null)) {
            A15.put("thumb", Base64.encodeToString(A002, 0));
        }
        A07(A00, aEn, A15, z, false);
        String str = aEn.A0H;
        if (str != null) {
            A15.put("order_request_id", str);
        }
        ADZ adz = aEn.A0E;
        if (adz != null) {
            JSONObject A152 = C17880vN.A15();
            A152.put("max_installment_count", adz.A00);
            A15.put("installment", A152);
        }
        String A04 = aEn.A04();
        if (A04 != null) {
            A15.put("payment_configuration", A04);
        }
        String str2 = aEn.A08;
        if (str2 != null) {
            A15.put("transaction_id", str2);
        }
        Integer valueOf = Integer.valueOf(aEn.A00);
        if (valueOf != null) {
            A15.put("transaction_status", valueOf);
        }
        String str3 = aEn.A06;
        if (str3 != null) {
            A15.put("payment_method", str3);
        }
        String str4 = aEn.A07;
        if (str4 != null) {
            A15.put("payment_status", str4);
        }
        long j = aEn.A02;
        if (j > 0) {
            A15.put("payment_timestamp", j);
        }
        JSONArray A003 = A00(aEn.A0O);
        if (A003 != null) {
            A15.put("external_payment_configurations", A003);
        }
        A15.put("is_interactive", aEn.A0S);
        A15.put("maybe_paid_externally", aEn.A09);
        A15.put("order_updated_time", aEn.A01);
        JSONArray A01 = A01(aEn.A0Q);
        if (A01 != null) {
            A15.put("payment_settings", A01);
        }
        String str5 = aEn.A0G;
        if (str5 != null) {
            A15.put("additional_note", str5);
        }
        C22565BDa bDa = aEn.A03;
        if (bDa != null) {
            jSONObject = bDa.CPM();
        }
        if (jSONObject != null) {
            A15.put("paid_amount", jSONObject);
        }
        List list = aEn.A0P;
        if (list == null) {
            A1A = null;
        } else {
            A1A = AnonymousClass8BR.A1A();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AnonymousClass8BS.A1J(it, A1A);
            }
        }
        if (A1A != null) {
            A15.put("native_payment_methods", A1A);
        }
        String str6 = aEn.A05;
        if (str6 != null) {
            A15.put("logging_id", str6);
        }
        AE0 ae0 = aEn.A0C;
        if (ae0 != null) {
            r1 = AnonymousClass84U.A00(new B00(ae0));
        } else {
            r1 = null;
        }
        if (r1 != null) {
            A15.put("flow_configuration", r1);
        }
        Boolean valueOf2 = Boolean.valueOf(aEn.A0T);
        if (valueOf2 != null) {
            A15.put("share_payment_status", valueOf2);
        }
        List list2 = aEn.A0R;
        if (list2 == null) {
            A1A2 = null;
        } else {
            A1A2 = AnonymousClass8BR.A1A();
            int size = list2.size();
            for (int i = 0; i < size; i++) {
                A1A2.put(((C20928Abi) list2.get(i)).CPM());
            }
        }
        if (A1A2 != null) {
            A15.put("preferred_payment_methods", A1A2);
        }
        String str7 = aEn.A0J;
        if (!(str7 == null || str7.length() == 0)) {
            A15.put("preferred_payment_setting_type", str7);
        }
        return A15;
    }

    public static final JSONObject A06(C20279AEn aEn, boolean z) {
        JSONArray A1A;
        AnonymousClass84U r1;
        JSONArray A1A2;
        JSONObject jSONObject = null;
        JSONObject A15 = C17880vN.A15();
        AnonymousClass1KJ r0 = aEn.A0A;
        if (r0 != null) {
            A15.put("currency", AnonymousClass8BS.A0j(r0));
        }
        ADZ adz = aEn.A0E;
        if (adz != null) {
            JSONObject A152 = C17880vN.A15();
            A152.put("max_installment_count", adz.A00);
            A15.put("installment", A152);
        }
        C20122A8h a8h = A00;
        JSONArray A002 = A00(aEn.A0O);
        if (A002 != null) {
            A15.put("external_payment_configurations", A002);
        }
        JSONArray A02 = A02(aEn.A0N);
        if (A02 != null) {
            A15.put("beneficiaries", A02);
        }
        String A04 = aEn.A04();
        if (A04 != null) {
            A15.put("payment_configuration", A04);
        }
        String str = aEn.A0I;
        if (str != null) {
            A15.put("payment_type", str);
        }
        String str2 = aEn.A08;
        if (str2 != null) {
            A15.put("transaction_id", str2);
        }
        if (!z) {
            AE1 ae1 = aEn.A0F;
            if (ae1 != null) {
                A15.put("total_amount", A04(ae1));
            }
            A15.put("reference_id", aEn.A0K);
            String str3 = aEn.A0H;
            if (str3 != null) {
                A15.put("order_request_id", str3);
            }
        }
        String str4 = aEn.A0M;
        if (str4 != null) {
            A15.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str4);
        }
        String str5 = aEn.A06;
        if (str5 != null) {
            A15.put("payment_method", str5);
        }
        String str6 = aEn.A07;
        if (str6 != null) {
            A15.put("payment_status", str6);
        }
        long j = aEn.A02;
        if (j > 0) {
            A15.put("payment_timestamp", j);
        }
        A15.put("order", a8h.A08(aEn.A0D, false, false));
        JSONArray A01 = A01(aEn.A0Q);
        if (A01 != null) {
            A15.put("payment_settings", A01);
        }
        String str7 = aEn.A0G;
        if (str7 != null) {
            A15.put("additional_note", str7);
        }
        C22565BDa bDa = aEn.A03;
        if (bDa != null) {
            jSONObject = bDa.CPM();
        }
        if (jSONObject != null) {
            A15.put("paid_amount", jSONObject);
        }
        List list = aEn.A0P;
        if (list == null) {
            A1A = null;
        } else {
            A1A = AnonymousClass8BR.A1A();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AnonymousClass8BS.A1J(it, A1A);
            }
        }
        if (A1A != null) {
            A15.put("native_payment_methods", A1A);
        }
        JSONObject A03 = A03(aEn.A0B, false);
        if (A03 != null) {
            A15.put("shipping_info", A03);
        }
        AE0 ae0 = aEn.A0C;
        if (ae0 != null) {
            r1 = AnonymousClass84U.A00(new B00(ae0));
        } else {
            r1 = null;
        }
        if (r1 != null) {
            A15.put("flow_configuration", r1);
        }
        Boolean valueOf = Boolean.valueOf(aEn.A0T);
        if (valueOf != null) {
            A15.put("share_payment_status", valueOf);
        }
        List list2 = aEn.A0R;
        if (list2 == null) {
            A1A2 = null;
        } else {
            A1A2 = AnonymousClass8BR.A1A();
            int size = list2.size();
            for (int i = 0; i < size; i++) {
                A1A2.put(((C20928Abi) list2.get(i)).CPM());
            }
        }
        if (A1A2 != null) {
            A15.put("preferred_payment_methods", A1A2);
        }
        return A15;
    }

    public static final JSONObject A03(AES aes, boolean z) {
        JSONArray jSONArray;
        if (aes == null) {
            return null;
        }
        JSONObject A15 = C17880vN.A15();
        A15.put("country", "IN");
        if (!z) {
            A15.put("selected_id", aes.A00);
        }
        AEV aev = aes.A02;
        if (aev != null) {
            A15.put("selected_address", aev.A00());
        }
        List<AEV> list = aes.A04;
        if (C137476vW.A00(list) || list == null) {
            jSONArray = null;
        } else {
            jSONArray = AnonymousClass8BR.A1A();
            for (AEV aev2 : list) {
                JSONObject A152 = C17880vN.A15();
                A152.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, aev2.A07);
                A152.put("phone_number", aev2.A08);
                A152.put("in_pin_code", aev2.A05);
                A152.put("address", aev2.A00);
                A152.put("city", aev2.A02);
                A152.put("state", aev2.A09);
                A152.put("is_default", aev2.A0B);
                A152.put("house_number", aev2.A04);
                A152.put("tower_number", aev2.A0A);
                A152.put("building_name", aev2.A01);
                A152.put("floor_number", aev2.A03);
                A152.put("landmark_area", aev2.A06);
                jSONArray.put(A152);
            }
        }
        A15.put("addresses", jSONArray);
        return A15;
    }

    public static final void A07(C20122A8h a8h, C20279AEn aEn, JSONObject jSONObject, boolean z, boolean z2) {
        String str = aEn.A0L;
        if (str != null) {
            jSONObject.put("title", str);
        }
        AE1 ae1 = aEn.A0F;
        if (ae1 != null) {
            jSONObject.put("total_amount", A04(ae1));
        }
        jSONObject.put("reference_id", aEn.A0K);
        AnonymousClass1KJ r0 = aEn.A0A;
        if (r0 != null) {
            jSONObject.put("currency", AnonymousClass8BS.A0j(r0));
        }
        String str2 = aEn.A0I;
        if (str2 != null) {
            jSONObject.put("payment_type", str2);
        }
        String str3 = aEn.A0M;
        if (str3 != null) {
            jSONObject.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str3);
        }
        JSONArray A02 = A02(aEn.A0N);
        if (A02 != null) {
            jSONObject.put("beneficiaries", A02);
        }
        C20266ADy aDy = aEn.A04;
        JSONObject jSONObject2 = null;
        if (aDy != null) {
            JSONObject A15 = C17880vN.A15();
            A15.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, aDy.A02);
            A15.put("code", aDy.A01);
            AE1 ae12 = aDy.A00;
            if (ae12 != null) {
                jSONObject2 = C17880vN.A15();
                jSONObject2.put("value", ae12.A01);
                jSONObject2.put("offset", ae12.A00);
            }
            A15.put("discount", jSONObject2);
            jSONObject2 = A15;
        }
        if (jSONObject2 != null) {
            jSONObject.put("coupon", jSONObject2);
        }
        JSONObject A03 = A03(aEn.A0B, z2);
        if (A03 != null) {
            jSONObject.put("shipping_info", A03);
        }
        jSONObject.put("order", a8h.A08(aEn.A0D, z, z2));
    }

    public static final JSONArray A00(List<C20267ADz> list) {
        if (C137476vW.A00(list)) {
            return null;
        }
        JSONArray A1A = AnonymousClass8BR.A1A();
        if (list == null) {
            list = C18460wS.A00;
        }
        for (C20267ADz aDz : list) {
            if (aDz != null) {
                JSONObject A15 = C17880vN.A15();
                A15.put("uri", aDz.A02);
                A15.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, aDz.A01);
                A15.put("payment_instruction", aDz.A00);
                A1A.put(A15);
            }
        }
        return A1A;
    }

    public static final JSONArray A01(List<C20251ADj> list) {
        String str;
        if (C137476vW.A00(list)) {
            return null;
        }
        JSONArray A1A = AnonymousClass8BR.A1A();
        if (list == null) {
            list = C18460wS.A00;
        }
        for (C20251ADj aDj : list) {
            if (aDj != null) {
                JSONObject A15 = C17880vN.A15();
                String str2 = aDj.A01;
                A15.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str2);
                BDZ bdz = aDj.A00;
                if (bdz != null) {
                    switch (str2.hashCode()) {
                        case -1383481471:
                            str = "boleto";
                            break;
                        case -1287348895:
                            str = "upi_merchant_vpa";
                            break;
                        case -787544450:
                            str = "pix_static_code";
                            break;
                        case -721782544:
                            str = "upi_merchant_configuration";
                            break;
                        case -497186157:
                            str = "payment_link";
                            break;
                        case 94431075:
                            str = "cards";
                            break;
                        case 268888205:
                            str = "pix_dynamic_code";
                            break;
                        case 1266401836:
                            str = "upi_intent_link";
                            break;
                        case 1303296267:
                            str = "payment_gateway";
                            break;
                    }
                    if (str2.equals(str)) {
                        A15.put(str, bdz.CPM());
                    }
                }
                A1A.put(A15);
                continue;
            }
        }
        return A1A;
    }

    public static final JSONArray A02(List<ADC> list) {
        if (C137476vW.A00(list)) {
            return null;
        }
        JSONArray A1A = AnonymousClass8BR.A1A();
        if (list == null) {
            list = C18460wS.A00;
        }
        for (ADC adc : list) {
            if (adc != null) {
                AnonymousClass8BY.A0x(adc, A1A, C17880vN.A15());
            }
        }
        return A1A;
    }

    public static final JSONObject A04(AE1 ae1) {
        JSONObject A15 = C17880vN.A15();
        A15.put("value", ae1.A01);
        A15.put("offset", ae1.A00);
        String str = ae1.A02;
        if (!(str == null || str.length() == 0)) {
            A15.put("description", str);
        }
        return A15;
    }

    public final JSONObject A08(AEU aeu, boolean z, boolean z2) {
        byte[] bArr;
        JSONObject A15 = C17880vN.A15();
        A15.put("status", aeu.A01);
        String str = aeu.A00;
        if (str != null) {
            A15.put("description", str);
        }
        AE1 ae1 = aeu.A05;
        if (ae1 != null) {
            A15.put("subtotal", A04(ae1));
        }
        AE1 ae12 = aeu.A06;
        if (ae12 != null) {
            A15.put("tax", A04(ae12));
        }
        AE1 ae13 = aeu.A03;
        if (ae13 != null) {
            String str2 = aeu.A07;
            JSONObject A04 = A04(ae13);
            if (!(str2 == null || str2.length() == 0)) {
                A04.put("discount_program_name", str2);
            }
            A15.put("discount", A04);
        }
        AE1 ae14 = aeu.A04;
        if (ae14 != null) {
            A15.put("shipping", A04(ae14));
        }
        C20250ADi aDi = aeu.A02;
        if (aDi != null) {
            JSONObject A152 = C17880vN.A15();
            A152.put("timestamp", aDi.A00);
            String str3 = aDi.A01;
            if (!(str3 == null || str3.length() == 0)) {
                A152.put("description", str3);
            }
            A15.put("expiration", A152);
        }
        String str4 = aeu.A08;
        if (str4 != null && !z2) {
            A15.put("order_type", str4);
        }
        List<AET> list = aeu.A09;
        if (list != null) {
            JSONArray A1A = AnonymousClass8BR.A1A();
            for (AET aet : list) {
                JSONObject A153 = C17880vN.A15();
                String str5 = aet.A06;
                if (!(str5 == null || str5.length() == 0)) {
                    A153.put("retailer_id", str5);
                }
                String str6 = aet.A00;
                if (str6 != null && !z2) {
                    JSONObject A154 = C17880vN.A15();
                    int length = str6.length();
                    if (length != 0 && z) {
                        if (length > 0) {
                            try {
                                bArr = Base64.decode(str6, 0);
                            } catch (IllegalArgumentException e) {
                                Log.w("ThumbnailConverter: Failed to decode base64 thumbnail", e);
                            }
                        } else {
                            bArr = null;
                        }
                        if (AnonymousClass9QV.A00(bArr, true) == null) {
                            str6 = null;
                        }
                    }
                    if (str6 != null) {
                        A154.put("base64Thumbnail", str6);
                        A153.put("image", A154);
                    }
                }
                String str7 = aet.A05;
                if (!(str7 == null || str7.length() == 0)) {
                    A153.put("product_id", str7);
                }
                A153.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, aet.A04);
                A153.put("amount", A04(aet.A02));
                A153.put("quantity", aet.A01);
                AE1 ae15 = aet.A03;
                if (ae15 != null) {
                    A153.put("sale_amount", A04(ae15));
                }
                List<C20252ADk> list2 = aet.A07;
                if (list2 != null) {
                    JSONArray A1A2 = AnonymousClass8BR.A1A();
                    for (C20252ADk aDk : list2) {
                        String str8 = aDk.A00;
                        String str9 = aDk.A01;
                        JSONObject A12 = AnonymousClass8BU.A12(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str8);
                        A12.put("value", str9);
                        A1A2.put(A12);
                    }
                    A153.put("variant_info_list", A1A2);
                }
                A1A.put(A153);
            }
            A15.put("items", A1A);
        }
        return A15;
    }
}
