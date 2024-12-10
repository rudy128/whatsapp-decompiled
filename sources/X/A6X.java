package X;

import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class A6X {
    public final AnonymousClass1PM A00;
    public final C19830z4 A01;
    public final AnonymousClass18K A02;
    public final AnonymousClass1QL A03;
    public final AnonymousClass1QO A04;
    public final C199189za A05;
    public final AnonymousClass00H A06;
    public final AnonymousClass00H A07;
    public final AnonymousClass00H A08;
    public final C19880zA A09;
    public final AnonymousClass11S A0A;
    public final C26911Ty A0B;
    public final C20136A8x A0C;
    public final C18030ve A0D;
    public final C31071ey A0E;
    public final AnonymousClass1R2 A0F;
    public final AnonymousClass10I A0G;

    public void A03(AnonymousClass1BI r15, C20285AEt aEt, Integer num, String str, String str2, List list, int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4) {
        String str3;
        String str4;
        C20275AEi aEi;
        List list2;
        C20285AEt aEt2 = aEt;
        if (aEt != null) {
            C20279AEn aEn = aEt2.A02;
            String str5 = "";
            boolean z5 = false;
            if (aEn != null) {
                String str6 = aEn.A0D.A08;
                AnonymousClass1KJ r0 = aEn.A0A;
                if (r0 != null) {
                    str5 = AnonymousClass8BS.A0j(r0);
                }
                if (C18020vd.A05(C18040vf.A02, this.A0D, 8798) && (list2 = aEn.A0D.A09) != null && !list2.isEmpty()) {
                    Iterator it = list2.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            List list3 = ((AET) it.next()).A07;
                            if (list3 != null && !list3.isEmpty()) {
                                z5 = true;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                str3 = str5;
                str5 = str6;
            } else {
                str3 = str5;
            }
            try {
                JSONObject A022 = A02(this, A00(aEt2, this), z2);
                C20279AEn aEn2 = aEt2.A02;
                C17960vV.A07(aEn2);
                String str7 = aEn2.A06;
                if ("payment_instruction".equals(str7)) {
                    str4 = "cpi";
                } else {
                    C17960vV.A07(aEn2);
                    str4 = "confirm";
                    if (!str4.equals(str7)) {
                        C17960vV.A07(aEn2);
                        str4 = "pix";
                        if (!str4.equals(str7)) {
                            if (!AnonymousClass1EG.A0H(aEn2.A08)) {
                                str4 = "native";
                            } else {
                                str4 = null;
                            }
                        }
                    }
                }
                String str8 = str2;
                String str9 = str4;
                if (!AnonymousClass1EG.A0H(str8)) {
                    str9 = str8;
                }
                if (!AnonymousClass1EG.A0H(str9)) {
                    A022.put("payment_method_choice", str9);
                }
                Integer num2 = num;
                if (num != null) {
                    A022.put("num_installments", num2);
                }
                A022.put("p2m_flow", str5);
                A022.put("currency", str3);
                A022.put("is_template", AnonymousClass8BR.A1S(aEt2.A0E));
                if (z3) {
                    JSONArray A1A = AnonymousClass8BR.A1A();
                    if (str4 != null) {
                        A1A.put(str4);
                    } else if (!C137476vW.A00(list)) {
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            AnonymousClass8BS.A1J(it2, A1A);
                        }
                    } else if (str2 != null) {
                        A1A.put(str8);
                    }
                    AnonymousClass8BS.A1C(A1A, "accepted_payment_method", A022);
                }
                if (z) {
                    C20279AEn aEn3 = aEt2.A02;
                    C17960vV.A07(aEn3);
                    AE1 ae1 = aEn3.A0F;
                    C17960vV.A07(ae1);
                    Float valueOf = Float.valueOf(aEn3.A02(ae1).A02.A00.floatValue());
                    if (valueOf != null) {
                        A022.put("order_amount", valueOf);
                    }
                }
                A022.put("order_content_variant", AnonymousClass8BX.A03(this.A0D));
                String str10 = str;
                if (!TextUtils.isEmpty(str10)) {
                    A022.put("order_funnel_id", str10);
                }
                A022.put("message_type", C20136A8x.A07(i2));
                A022.put("has_product_variants", z5);
                AEE aee = aEt2.A05;
                boolean z6 = false;
                if (!(aee == null || (aEi = aee.A00) == null)) {
                    String str11 = aEi.A07;
                    if (!TextUtils.isEmpty(str11) && TextUtils.equals(str11, "application/pdf")) {
                        z6 = true;
                    }
                }
                A022.put("has_attachment", z6);
                boolean z7 = z4;
                if (z4) {
                    A022.put("has_attachment_download", z7);
                }
                ((C190579lB) this.A08.get()).A00(r15, Integer.valueOf(A78.A00(this.A00.A02(C22941Dw.A00(r15)))), A022.toString(), (String) null, i, 4, i3, true);
            } catch (JSONException unused) {
                Log.e("OrderDetailsMessageLogging/logOrderDetailsAction failed to construct message class attributes");
            }
        }
    }

    public void A07(AnonymousClass21K r10, String str, int i) {
        A06(r10, (Integer) null, str, (List) null, i, false, false, false);
    }

    public static String A00(C20285AEt aEt, A6X a6x) {
        C20279AEn aEn = aEt.A02;
        C17960vV.A07(aEn);
        String str = aEn.A0I;
        if (str != null && a6x.A04.A0M(str)) {
            return "p2m_lite";
        }
        C17960vV.A07(aEn);
        AnonymousClass1KJ r0 = aEn.A0A;
        C17960vV.A07(r0);
        String A0j = AnonymousClass8BS.A0j(r0);
        if (AnonymousClass8BS.A0j(AnonymousClass1KL.A0A).equals(A0j)) {
            return "p2m_pro";
        }
        if (!AnonymousClass8BS.A0j(AnonymousClass1KL.A0B).equals(A0j)) {
            return "UNSET";
        }
        if (a6x.A04.A0O(aEn.A0Q)) {
            return "p2m_checkout_lite";
        }
        return "p2m_hybrid";
    }

    public A6X(C19880zA r2, AnonymousClass11S r3, C26911Ty r4, C20136A8x a8x, AnonymousClass1PM r6, C19830z4 r7, C18030ve r8, AnonymousClass18K r9, AnonymousClass1QL r10, AnonymousClass1QO r11, C31071ey r12, AnonymousClass1R2 r13, C199189za r14, AnonymousClass10I r15, AnonymousClass00H r16, AnonymousClass00H r17, AnonymousClass00H r18) {
        this.A0D = r8;
        this.A0A = r3;
        this.A0G = r15;
        this.A02 = r9;
        this.A0F = r13;
        this.A09 = r2;
        this.A03 = r10;
        this.A00 = r6;
        this.A01 = r7;
        this.A04 = r11;
        this.A0B = r4;
        this.A0C = a8x;
        this.A0E = r12;
        this.A05 = r14;
        this.A08 = r16;
        this.A06 = r17;
        this.A07 = r18;
    }

    public static String A01(AnonymousClass21K r0) {
        C20279AEn aEn;
        C20285AEt BPK = r0.BPK();
        if (BPK == null || (aEn = BPK.A02) == null) {
            return null;
        }
        return aEn.A05;
    }

    public static JSONObject A02(A6X a6x, String str, boolean z) {
        JSONObject A15 = C17880vN.A15();
        A15.put("cta", "order_details");
        A15.put("wa_pay_registered", a6x.A03.A0E());
        A15.put("p2m_type", str);
        A15.put("is_cta_available", z);
        return A15;
    }

    public void A04(AnonymousClass21K r4) {
        C20285AEt BPK = r4.BPK();
        if (BPK != null && BPK.A02 != null && (r4 instanceof AnonymousClass206)) {
            this.A0G.CGF(new C70863Cu(r4, this, 35));
        }
    }

    public void A05(AnonymousClass21K r4) {
        C20285AEt BPK = r4.BPK();
        if (BPK != null && BPK.A02 != null && (r4 instanceof AnonymousClass206)) {
            this.A0G.CGF(new C70863Cu(r4, this, 36));
        }
    }

    public void A06(AnonymousClass21K r15, Integer num, String str, List list, int i, boolean z, boolean z2, boolean z3) {
        C20285AEt BPK = r15.BPK();
        if (BPK != null && BPK.A02 != null && (r15 instanceof AnonymousClass206)) {
            String A012 = A01(r15);
            AnonymousClass206 r152 = (AnonymousClass206) r15;
            A03(r152.A0v.A00, BPK, num, A012, str, list, i, r152.A0u, C199189za.A00(r152), z, z2, z3, false);
        }
    }
}
