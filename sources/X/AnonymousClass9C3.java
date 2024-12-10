package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.9C3  reason: invalid class name */
public final class AnonymousClass9C3 extends C180639Ni {
    public final C20051A4x A00;
    public final AnonymousClass118 A01;
    public final AnonymousClass10I A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass00H A05;

    public void A00(C22526BBj bBj, Map map) {
        Map map2;
        List list;
        String str;
        String str2;
        AbstractMap abstractMap;
        Object obj;
        HashMap A11 = C17880vN.A11();
        Map map3 = map;
        Object obj2 = map3.get("action_payload");
        C18070vi.A0z(obj2, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
        LinkedHashMap A08 = AnonymousClass1D7.A08((Map) obj2);
        Object obj3 = A08.get("next");
        C18070vi.A0z(obj3, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
        Object obj4 = ((Map) obj3).get(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
        Object obj5 = A08.get("next");
        C18070vi.A0z(obj5, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
        boolean A18 = C18070vi.A18(((Map) obj5).get(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE), "plugin");
        Object obj6 = A08.get("next");
        C18070vi.A0z(obj6, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
        boolean A182 = C18070vi.A18(((Map) obj6).get(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE), "screen");
        String A0g = AnonymousClass8BW.A0g("extension_id", map3);
        boolean A19 = C18070vi.A19(map3.get("is_draft"), true);
        String A0e = AnonymousClass8BX.A0e("message_id", map3);
        String A0e2 = AnonymousClass8BX.A0e("session_id", map3);
        String A0e3 = AnonymousClass8BX.A0e("business_jid", map3);
        if (A18) {
            String valueOf = String.valueOf(obj4);
            C18070vi.A0d(valueOf, 0);
            ((A2M) C18070vi.A0E(((AnonymousClass9XT) this.A03.get()).A00)).A02((Boolean) null, C17890vO.A0L(), "plugin", "plugin_start", valueOf, (String) null);
        }
        Object obj7 = A08.get("data");
        if (!(!(obj7 instanceof HashMap) || (abstractMap = (AbstractMap) obj7) == null || (obj = abstractMap.get("external_data")) == null)) {
            A11.put("external_data", obj);
        }
        if (A182) {
            Object obj8 = A08.get("data");
            if (!(obj8 instanceof HashMap)) {
                obj8 = null;
            }
            A11.put("data", obj8);
        } else {
            A11.put("action_payload", A08);
        }
        A11.put("screen", obj4);
        A11.put("action_name", map3.get("action"));
        Object obj9 = map3.get("current_screen");
        if (obj9 != null) {
            A11.put("prev_screen_name", obj9);
        }
        C22526BBj bBj2 = bBj;
        if (A182) {
            AnonymousClass00H r14 = this.A04;
            C20081A6h A0V = AnonymousClass8BR.A0V(r14);
            int hashCode = A0g.hashCode();
            A0V.A07(hashCode, "data_channel_navigation", false);
            Object obj10 = A08.get("data");
            if (!(obj10 instanceof HashMap) || obj10 == null) {
                obj10 = AnonymousClass1D7.A0I();
            }
            AnonymousClass1D6[] r8 = new AnonymousClass1D6[2];
            AnonymousClass1D6.A03("screen", obj4, r8, 0);
            AnonymousClass1D6.A03("data", obj10, r8, 1);
            LinkedHashMap A0B = AnonymousClass1D7.A0B(r8);
            if (!(A0e == null || A0e2 == null)) {
                this.A02.CGF(new C21381AjA(this, A0B, A0e, A0e2, A0g, A0e3, 0));
            }
            Object obj11 = map3.get("routing_model");
            if (obj11 instanceof Map) {
                map2 = (Map) obj11;
            } else {
                map2 = null;
            }
            String A0e4 = AnonymousClass8BX.A0e("current_screen", map3);
            Object obj12 = map3.get("entry_screens");
            if (obj12 instanceof List) {
                list = (List) obj12;
            } else {
                list = null;
            }
            C189409jC r7 = (C189409jC) this.A05.get();
            if (obj4 != null) {
                str = obj4.toString();
            } else {
                str = null;
            }
            Integer A002 = r7.A00(A0e4, str, A0g, list, map2);
            if (A002 != AnonymousClass00R.A00) {
                AnonymousClass118 r9 = this.A01;
                String A0G = C18070vi.A0G(r9, 2131890453);
                if (A19 && A002 == AnonymousClass00R.A0C) {
                    Object[] objArr = new Object[2];
                    if (obj4 == null || (str2 = obj4.toString()) == null) {
                        str2 = "";
                    }
                    objArr[0] = str2;
                    if (list == null) {
                        list = "";
                    }
                    A0G = AnonymousClass8BS.A0f(r9, list, objArr, 1, 2131890443);
                    C18070vi.A0X(A0G);
                }
                bBj2.BAh("extensions-invalid-screen-transition-error", (String) null, C108975cc.A0h("error", new C19976A1m(A0G, (Map) null, -1)));
                return;
            }
            C20081A6h A0V2 = AnonymousClass8BR.A0V(r14);
            if (A0e4 == null) {
                A0e4 = "UNKNOWN";
            }
            A0V2.A06(hashCode, "source_screen_id", A0e4);
            C20081A6h A0V3 = AnonymousClass8BR.A0V(r14);
            String str3 = (String) obj4;
            if (str3 == null) {
                str3 = "UNKNOWN";
            }
            A0V3.A06(hashCode, "destination_screen_id", str3);
        }
        bBj2.BAi(A11);
    }

    public AnonymousClass9C3(AnonymousClass118 r2, C20051A4x a4x, AnonymousClass10I r4, AnonymousClass00H r5, AnonymousClass00H r6, AnonymousClass00H r7) {
        C18070vi.A0w(r4, r2, r5, r6, a4x);
        C18070vi.A0d(r7, 6);
        this.A02 = r4;
        this.A01 = r2;
        this.A04 = r5;
        this.A05 = r6;
        this.A00 = a4x;
        this.A03 = r7;
    }
}
