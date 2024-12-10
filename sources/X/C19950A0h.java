package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.A0h  reason: case insensitive filesystem */
public final class C19950A0h {
    public final C18000vb A00;
    public final AnonymousClass1K3 A01;

    public static final LinkedHashMap A00(AEI aei) {
        C18070vi.A0d(aei, 0);
        AnonymousClass1D6[] r4 = new AnonymousClass1D6[2];
        AnonymousClass1D6.A03(PublicKeyCredentialControllerUtility.JSON_KEY_ID, aei.A04, r4, 0);
        AnonymousClass1D6[] r3 = new AnonymousClass1D6[2];
        AnonymousClass1D6.A03("width", Integer.valueOf(aei.A03), r3, 0);
        r3[1] = AnonymousClass1D6.A01("height", Integer.valueOf(aei.A02));
        AnonymousClass1D6.A03("original_dimensions", AnonymousClass1D7.A0B(r3), r4, 1);
        LinkedHashMap A0C = AnonymousClass1D7.A0C(r4);
        String str = aei.A00;
        if (str != null) {
            A0C.put("original_image_url", str);
        }
        String str2 = aei.A01;
        if (str2 != null) {
            A0C.put("request_image_url", str2);
        }
        return A0C;
    }

    public final LinkedHashMap A01(C195139sr r5) {
        AnonymousClass1D6[] r2 = new AnonymousClass1D6[4];
        AnonymousClass1D6.A03("category_id", r5.A01, r2, 0);
        C108985cd.A1G("is_last_level", Boolean.valueOf(r5.A04), r2);
        C72463Mc.A1I(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, r5.A02, r2);
        C72463Mc.A1J("media", C108975cc.A0h("image", A00(r5.A00)), r2);
        return AnonymousClass1D7.A0B(r2);
    }

    public final LinkedHashMap A02(C20287AEv aEv) {
        String str;
        String str2;
        String str3;
        String str4;
        C18070vi.A0d(aEv, 0);
        AnonymousClass1D6[] r2 = new AnonymousClass1D6[5];
        AnonymousClass1D6.A03(PublicKeyCredentialControllerUtility.JSON_KEY_ID, aEv.A0H, r2, 0);
        r2[1] = AnonymousClass1D6.A01(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, aEv.A08);
        int i = aEv.A00;
        if (i == 0) {
            str = "IN_STOCK";
        } else if (i == 1) {
            str = "OUT_STOCK";
        } else if (i != 2) {
            str = "UNKNOWN";
        } else {
            str = "AVAILABLE_FOR_ANOTHER_POSTCODE";
        }
        C72463Mc.A1I("product_availability", str, r2);
        if (aEv.A0C) {
            str2 = "ISHIDDEN_TRUE";
        } else {
            str2 = "ISHIDDEN_FALSE";
        }
        C72463Mc.A1J("is_hidden", str2, r2);
        AnonymousClass8BW.A1L("max_available", Long.valueOf(aEv.A01), r2);
        LinkedHashMap A0C = AnonymousClass1D7.A0C(r2);
        String str5 = aEv.A0E;
        if (str5 != null) {
            A0C.put("description", str5);
        }
        BigDecimal bigDecimal = aEv.A09;
        if (bigDecimal != null) {
            A0C.put("price", String.valueOf(bigDecimal.unscaledValue()));
        }
        A6S a6s = aEv.A07;
        if (a6s != null) {
            A0C.put("currency", a6s.A00);
        }
        String str6 = aEv.A0G;
        if (str6 != null) {
            A0C.put("url", str6);
        }
        String str7 = aEv.A0J;
        if (str7 != null) {
            A0C.put("retailer_id", str7);
        }
        AEJ aej = aEv.A03;
        if (aej != null) {
            AnonymousClass1D6[] r4 = new AnonymousClass1D6[4];
            int i2 = aej.A00;
            if (i2 == 0) {
                str4 = "APPROVED";
            } else if (i2 == 1) {
                str4 = "REVIEWING";
            } else if (i2 == 2) {
                str4 = "REJECTED";
            } else if (i2 != 3) {
                str4 = "UNKNOWN";
            } else {
                str4 = "DELETED";
            }
            AnonymousClass1D6.A03("status", str4, r4, 0);
            C108985cd.A1G("can_appeal", Boolean.valueOf(aej.A03), r4);
            C72463Mc.A1I("commerce_url", aej.A01, r4);
            C72463Mc.A1J("reject_reason", aej.A02, r4);
            A0C.put("status_info", AnonymousClass1D7.A0B(r4));
        }
        AE5 ae5 = aEv.A04;
        if (ae5 != null) {
            AnonymousClass1D6[] r22 = new AnonymousClass1D6[1];
            AnonymousClass1D6.A03("price", String.valueOf(ae5.A00.unscaledValue()), r22, 0);
            LinkedHashMap A0C2 = AnonymousClass1D7.A0C(r22);
            Date date = ae5.A02;
            if (date != null) {
                A0C2.put("start_date", AnonymousClass8BU.A0m(date));
            }
            Date date2 = ae5.A01;
            if (date2 != null) {
                A0C2.put("end_date", AnonymousClass8BU.A0m(date2));
            }
            A0C.put("sale_price", A0C2);
        }
        String str8 = aEv.A0F;
        if (str8 != null) {
            A0C.put("image_fetch_status", str8);
        }
        List list = aEv.A0A;
        if (AnonymousClass000.A1a(list)) {
            ArrayList A13 = AnonymousClass000.A13();
            for (AEI A002 : C29431cG.A0q(list)) {
                A13.add(A00(A002));
            }
            A0C.put("media", C108975cc.A0h("images", A13));
        }
        C20255ADn aDn = aEv.A0D;
        if (aDn != null) {
            LinkedHashMap A132 = C17880vN.A13();
            String str9 = aDn.A01;
            A132.put("country_code_origin", str9);
            if ("N/A".equals(str9) || str9 == null) {
                str3 = null;
            } else {
                str3 = this.A01.A03(this.A00, str9);
            }
            A132.put("country_name", str3);
            A132.put("importer_name", aDn.A02);
            AEM aem = aDn.A00;
            if (aem != null) {
                AnonymousClass1D6[] r5 = new AnonymousClass1D6[6];
                AnonymousClass1D6.A03("street1", aem.A04, r5, 0);
                C108985cd.A1G("street2", aem.A05, r5);
                C72463Mc.A1I("city", aem.A00, r5);
                C72463Mc.A1J("region", aem.A03, r5);
                AnonymousClass8BW.A1L("postal_code", aem.A02, r5);
                r5[5] = AnonymousClass1D6.A01("country_code", aem.A01);
                A132.put("importer_address", AnonymousClass1D7.A0B(r5));
            }
            A0C.put("compliance_info", A132);
        }
        return A0C;
    }

    public C19950A0h(C18000vb r1, AnonymousClass1K3 r2) {
        C18070vi.A0j(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }
}
