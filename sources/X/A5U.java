package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.SecretKey;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class A5U {
    public final C189269io A00;
    public final C18030ve A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass00H A05;
    public final C18600wl A06;
    public final AnonymousClass190 A07;
    public final AnonymousClass11P A08;
    public final C196109uT A09;
    public final C170638qQ A0A;
    public final AnonymousClass10I A0B;
    public final AnonymousClass00H A0C;

    public final A1Y A02(String str, long j) {
        C19979A1p a1p;
        C18070vi.A0d(str, 0);
        String string = C17880vN.A0C(this.A09.A01).getString(AnonymousClass001.A1H("extensions_metadata_v2_", str, AnonymousClass000.A10()), (String) null);
        if (string == null || string.length() == 0) {
            return new A1Y((C185899dK) null, AnonymousClass00R.A01);
        }
        try {
            JSONObject A16 = C17880vN.A16(string);
            ArrayList A13 = AnonymousClass000.A13();
            JSONArray optJSONArray = A16.optJSONArray("extensionIdLinks");
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                    if (optJSONObject != null) {
                        A13.add(AnonymousClass9QZ.A00(optJSONObject));
                    }
                }
            }
            JSONObject optJSONObject2 = A16.optJSONObject("compatibility");
            if (optJSONObject2 != null) {
                a1p = C19979A1p.A03.A02(optJSONObject2);
            } else {
                a1p = null;
            }
            C185899dK r6 = new C185899dK(a1p, A13, A16.optLong("timeStampInMillis"));
            if (System.currentTimeMillis() > r6.A00 + j) {
                return new A1Y((C185899dK) null, AnonymousClass00R.A00);
            }
            return new A1Y(r6, AnonymousClass00R.A0C);
        } catch (JSONException e) {
            Log.w("FlowsLogger/FlowsMetadataManager/canReadFromSharedPref() - Json parsing exception", e);
            return new A1Y((C185899dK) null, AnonymousClass00R.A0N);
        }
    }

    public final C185899dK A03(Integer num, String str) {
        int i;
        C172048sh A0U;
        String str2;
        if (num != null) {
            i = num.intValue();
        } else {
            i = -1;
        }
        AnonymousClass00H r5 = this.A04;
        C20081A6h A0V = AnonymousClass8BR.A0V(r5);
        Integer valueOf = Integer.valueOf(i);
        A0V.A0B(valueOf, "metadata_cache_start");
        A1Y A022 = A02(str, AnonymousClass8BW.A07(this.A01, 2891));
        int intValue = A022.A01.intValue();
        if (intValue != 2) {
            if (intValue == 1) {
                A0U = AnonymousClass8BR.A0U(r5);
                str2 = "no_cache";
            } else if (intValue != 0) {
                if (intValue == 3) {
                    A0U = AnonymousClass8BR.A0U(r5);
                    str2 = "cache_parse_error";
                }
                AnonymousClass8BR.A0V(r5).A07(i, "fetch_cache_hit", false);
                AnonymousClass8BR.A0V(r5).A0B(valueOf, "metadata_cache_end");
                return null;
            } else {
                A0U = AnonymousClass8BR.A0U(r5);
                str2 = "cache_expired";
            }
            A0U.A0F(i, str2);
            AnonymousClass8BR.A0V(r5).A07(i, "fetch_cache_hit", false);
            AnonymousClass8BR.A0V(r5).A0B(valueOf, "metadata_cache_end");
            return null;
        }
        AnonymousClass8BR.A0V(r5).A07(i, "fetch_cache_hit", true);
        AnonymousClass8BR.A0V(r5).A0B(valueOf, "metadata_cache_end");
        return A022.A00;
    }

    public final void A04(B82 b82, UserJid userJid, Integer num, String str, String str2, String str3, boolean z) {
        String str4 = str3;
        C18070vi.A0d(str4, 5);
        this.A0B.CGF(new C21396AjP(b82, this, userJid, num, str4, str, str2, z));
    }

    public final void A06(UserJid userJid, String str, String str2, String str3, AnonymousClass1OS r14) {
        this.A0B.CGF(new C21380Aj9(this, userJid, r14, str, str2, str3, 1));
    }

    public static final C194949sY A00(B82 b82, A5U a5u, C138506xC r24, UserJid userJid, Integer num, String str, String str2, String str3, boolean z) {
        List list;
        C193799qg r0;
        int i;
        C19979A1p a1p;
        JSONObject jSONObject;
        String str4;
        String str5;
        A5U a5u2 = a5u;
        AnonymousClass00H r12 = a5u2.A04;
        Integer num2 = num;
        AnonymousClass8BR.A0V(r12).A0B(num2, "metadata_network_end");
        String str6 = str3;
        C20081A6h.A02(AnonymousClass8BR.A0V(a5u2.A03), "metadata_network_end", str6.hashCode());
        C138506xC r1 = r24;
        B82 b822 = b82;
        if (r1.A00 == 0) {
            AnonymousClass161 r02 = r1.A03;
            C18070vi.A0X(r02);
            C194429ri r11 = (C194429ri) r02.A00;
            if (r11 != null) {
                list = r11.A02;
                r0 = r11.A01;
            } else {
                list = null;
                r0 = null;
            }
            a5u2.A05(r1, num2);
            UserJid userJid2 = userJid;
            C18070vi.A0d(userJid2, 1);
            if (num != null) {
                i = num2.intValue();
            } else {
                i = -1;
            }
            if (r0 == null || (str4 = r0.A00) == null || str4.length() == 0 || (str5 = r0.A01) == null || str5.length() == 0) {
                AnonymousClass8BR.A0V(r12).A07(i, "endpoint_public_key_received", false);
            } else {
                AnonymousClass8BR.A0V(r12).A07(i, "endpoint_public_key_received", true);
                ((A5A) a5u2.A02.get()).A02(new AS2(a5u2, i), userJid2, str4, str5, (String) null, (SecretKey) null, (byte[]) null, -1, false);
            }
            if (list == null || list.isEmpty()) {
                ((C172048sh) C18070vi.A0E(r12)).A0H(num2, "extensions-metadata-empty-response", (String) null);
                if (b822 != null) {
                    b822.Bju(new C185899dK((C19979A1p) null, C18460wS.A00, System.currentTimeMillis()), 3, "extensions-metadata-empty-response", false);
                }
                Log.w("FlowsLogger/FlowsMetadataManager/makeFlowsMetaDataRequest()/callbackResponse() - Flows metadata response received is empty (potentially expected).");
                return new C194949sY((C185899dK) null, 3, "extensions-metadata-empty-response", false);
            }
            if (r11 != null) {
                a1p = r11.A00;
            } else {
                a1p = null;
            }
            C185899dK r2 = new C185899dK(a1p, list, System.currentTimeMillis());
            C196109uT r122 = a5u2.A09;
            JSONArray A1A = AnonymousClass8BR.A1A();
            for (C195709tm r13 : r2.A02) {
                C18070vi.A0d(r13, 0);
                A1A.put(AnonymousClass84U.A00(new C22186Az2(r13)));
            }
            C19979A1p a1p2 = r2.A01;
            if (a1p2 != null) {
                jSONObject = C17880vN.A15();
                jSONObject.put("welj", A4N.A01(a1p2.A02));
                jSONObject.put("data_channel", A4N.A01(a1p2.A00));
                jSONObject.put("flow_message", A4N.A01(a1p2.A01));
            } else {
                jSONObject = null;
            }
            JSONObject A15 = C17880vN.A15();
            A15.put("extensionIdLinks", A1A);
            A15.put("compatibility", jSONObject);
            A15.put("timeStampInMillis", r2.A00);
            AnonymousClass8BX.A0z(C17890vO.A0A(r122.A01), "extensions_metadata_v2_", str6, C18070vi.A0H(A15), AnonymousClass000.A10());
            if (z) {
                ArrayList<C195709tm> A13 = AnonymousClass000.A13();
                for (Object next : list) {
                    AnonymousClass3MZ.A1V(next, A13, C18070vi.A18(((C195709tm) next).A00, "DRAFT") ? 1 : 0);
                }
                for (C195709tm r14 : A13) {
                    String str7 = r14.A07;
                    if (str7 != null) {
                        String str8 = r14.A04;
                        String str9 = str8;
                        ((C172038sg) a5u2.A0C.get()).A0F(userJid2, false, AnonymousClass00R.A00, str9, str, str2, str8.hashCode());
                        a5u2.A0A.A05.add(new C195389tG((BCV) null, str9, str7, r14.A08, false, true));
                    }
                }
                a5u2.A0A.A0B();
            }
            if (b822 != null) {
                b822.Bju(r2, 2, (String) null, false);
            }
            return new C194949sY(r2, 2, (String) null, false);
        }
        boolean A18 = C18070vi.A18(r1.A04.A00(), 2498098);
        Object obj = r12.get();
        if (A18) {
            ((C20081A6h) obj).A0A(num2);
            if (b82 != null) {
                b822.Bju((C185899dK) null, 3, "extensions-metadata-response-error", true);
            }
            return new C194949sY((C185899dK) null, 3, "extensions-metadata-response-error", true);
        }
        C18070vi.A0X(obj);
        ((C172048sh) obj).A0H(num2, "extensions-metadata-response-error", (String) null);
        if (b82 != null) {
            b822.Bju((C185899dK) null, 3, "extensions-metadata-response-error", false);
        }
        a5u2.A07.A0G("extensions-metadata-response-error", "", true);
        Log.w("FlowsLogger/FlowsMetadataManager/makeFlowsMetaDataRequest()/callbackResponse() - Response is not success");
        return new C194949sY((C185899dK) null, 3, "extensions-metadata-response-error", false);
    }

    public static final C194949sY A01(B82 b82, A5U a5u, Integer num, String str, Throwable th) {
        Integer num2;
        AnonymousClass00H r3 = a5u.A04;
        AnonymousClass8BR.A0V(r3).A0B(num, "metadata_network_end");
        C20081A6h A0V = AnonymousClass8BR.A0V(a5u.A03);
        if (str != null) {
            num2 = Integer.valueOf(str.hashCode());
        } else {
            num2 = null;
        }
        A0V.A0B(num2, "metadata_network_end");
        AnonymousClass8BR.A0U(r3).A0H(num, "extensions-metadata-graphql-response-error", th.getMessage());
        if (b82 != null) {
            b82.Bju((C185899dK) null, 3, "extensions-metadata-graphql-response-error", false);
        }
        a5u.A07.A0G("extensions-metadata-graphql-response-error", "", true);
        Log.w("FlowsLogger/FlowsMetadataManager/handleMetadataErrorResponse()", th);
        return new C194949sY((C185899dK) null, 3, "extensions-metadata-graphql-response-error", false);
    }

    public final void A05(C138506xC r6, Integer num) {
        int i;
        int length = C108975cc.A1O(C18070vi.A0H(r6.A05)).length;
        C20081A6h A0V = AnonymousClass8BR.A0V(this.A04);
        if (num != null) {
            i = num.intValue();
        } else {
            i = -1;
        }
        A0V.A05(i, "metadata_response_size", (long) length);
    }

    public final boolean A07(Integer num) {
        C18030ve r2 = this.A01;
        if (!C18020vd.A05(C18040vf.A02, r2, 5333) || !AnonymousClass8BS.A1N(r2)) {
            return false;
        }
        ((C172048sh) C18070vi.A0E(this.A04)).A0H(num, "extensions-metadata-response-error", (String) null);
        Log.w("FlowsLogger/FlowsMetadataManager/makeFlowsMetaDataRequest() - request sanctioned.");
        return true;
    }

    public A5U(AnonymousClass190 r1, C189269io r2, AnonymousClass11P r3, C196109uT r4, C18030ve r5, C170638qQ r6, AnonymousClass10I r7, AnonymousClass00H r8, AnonymousClass00H r9, AnonymousClass00H r10, AnonymousClass00H r11, AnonymousClass00H r12, C18600wl r13) {
        C18070vi.A0w(r4, r1, r2, r6, r5);
        C18070vi.A0x(r7, r3, r8, r9, r10);
        C18070vi.A0r(r13, r11, r12);
        this.A09 = r4;
        this.A07 = r1;
        this.A00 = r2;
        this.A0A = r6;
        this.A01 = r5;
        this.A0B = r7;
        this.A08 = r3;
        this.A04 = r8;
        this.A0C = r9;
        this.A03 = r10;
        this.A06 = r13;
        this.A02 = r11;
        this.A05 = r12;
    }
}
