package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.0CF  reason: invalid class name */
public final class AnonymousClass0CF extends C172198t2 {
    public final int A00;
    public final C18030ve A01;
    public final JSONArray A02;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass0CF(X.AnonymousClass190 r13, X.C22416B6y r14, X.AnonymousClass118 r15, X.C24521Kq r16, X.C18000vb r17, X.C18030ve r18, X.C22508BAp r19, X.C191659mx r20, X.C19989A2b r21, X.C183279Xq r22, X.AnonymousClass10I r23) {
        /*
            r12 = this;
            r0 = 1
            r3 = r13
            X.C18070vi.A0d(r13, r0)
            r0 = 2
            r11 = r23
            X.C18070vi.A0d(r11, r0)
            r0 = 3
            r6 = r17
            X.C18070vi.A0d(r6, r0)
            r0 = 4
            X.C18070vi.A0d(r15, r0)
            r0 = 5
            r4 = r14
            X.C18070vi.A0d(r14, r0)
            r0 = 6
            r5 = r16
            X.C18070vi.A0d(r5, r0)
            r0 = 7
            r10 = r22
            X.C18070vi.A0d(r10, r0)
            r0 = 8
            r1 = r18
            X.C18070vi.A0d(r1, r0)
            r0 = 10
            r8 = r20
            X.C18070vi.A0d(r8, r0)
            r2 = r12
            r7 = r19
            r9 = r21
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.A01 = r1
            android.content.res.Resources r0 = r15.A00()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r0 = r0.densityDpi
            r12.A00 = r0
            r0 = 4313(0x10d9, float:6.044E-42)
            org.json.JSONObject r1 = r1.A0J(r0)
            java.lang.String r0 = "featured_categories_modules"
            org.json.JSONArray r0 = r1.optJSONArray(r0)
            r12.A02 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0CF.<init>(X.190, X.B6y, X.118, X.1Kq, X.0vb, X.0ve, X.BAp, X.9mx, X.A2b, X.9Xq, X.10I):void");
    }

    public static final AnonymousClass0K7 A01(String str, JSONObject jSONObject) {
        C18070vi.A0d(str, 1);
        String string = jSONObject.getString("browsable_category");
        String string2 = jSONObject.getString("list_name");
        ArrayList A13 = AnonymousClass000.A13();
        JSONArray jSONArray = jSONObject.getJSONArray("businesses");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            A13.add(AF0.A01(jSONArray.getJSONObject(i)));
        }
        C18070vi.A0b(string);
        C18070vi.A0b(string2);
        return new AnonymousClass0K7(string, string2, str, A13);
    }

    public static final AnonymousClass0CD A00(JSONObject jSONObject) {
        String string = jSONObject.getString(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        C17960vV.A06(string);
        C18070vi.A0X(string);
        String string2 = jSONObject.getString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
        C17960vV.A06(string2);
        C18070vi.A0X(string2);
        String optString = jSONObject.optString("icon_url", "");
        int optInt = jSONObject.optInt("num_of_biz");
        C18070vi.A0b(optString);
        return new AnonymousClass0CD(Integer.valueOf(optInt), string, string2, optString);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.String[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Map A0B() {
        /*
            r9 = this;
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            java.util.ArrayList r8 = X.AnonymousClass000.A13()
            X.0ve r7 = r9.A01
            r0 = 2270(0x8de, float:3.181E-42)
            boolean r0 = r7.A0N(r0)
            if (r0 == 0) goto L_0x0033
            java.lang.String r0 = "biz_categories"
            X.9t4 r2 = new X.9t4
            r2.<init>(r0)
            int r1 = r9.A00
            r0 = 240(0xf0, float:3.36E-43)
            if (r1 > r0) goto L_0x0068
            java.lang.String r1 = "hdpi"
        L_0x0022:
            java.lang.String r0 = "icon_spec"
            r2.A02(r1, r0)
            r0 = 3111(0xc27, float:4.36E-42)
            java.lang.String r0 = r7.A0I(r0)
            r2.A01(r0)
            r8.add(r2)
        L_0x0033:
            r0 = 2948(0xb84, float:4.131E-42)
            boolean r0 = r7.A0N(r0)
            if (r0 == 0) goto L_0x004e
            java.lang.String r0 = "popular_biz"
            X.9t4 r1 = new X.9t4
            r1.<init>(r0)
            r0 = 2970(0xb9a, float:4.162E-42)
            java.lang.String r0 = r7.A0I(r0)
            r1.A01(r0)
            r8.add(r1)
        L_0x004e:
            org.json.JSONArray r5 = r9.A02
            if (r5 == 0) goto L_0x0086
            X.C18070vi.A0b(r5)
            int r4 = r5.length()
            java.lang.String[] r3 = new java.lang.String[r4]
            r2 = 0
            r1 = 0
        L_0x005d:
            if (r1 >= r4) goto L_0x006b
            java.lang.Object r0 = r5.get(r1)
            r3[r1] = r0
            int r1 = r1 + 1
            goto L_0x005d
        L_0x0068:
            java.lang.String r1 = "xxhdpi"
            goto L_0x0022
        L_0x006b:
            if (r2 >= r4) goto L_0x0086
            r0 = r3[r2]
            X.9t4 r1 = new X.9t4
            r1.<init>(r0)
            r1.A00()
            r0 = 4312(0x10d8, float:6.042E-42)
            java.lang.String r0 = r7.A0I(r0)
            r1.A01(r0)
            r8.add(r1)
            int r2 = r2 + 1
            goto L_0x006b
        L_0x0086:
            java.util.ArrayList r1 = X.C181489Qr.A00(r8)
            java.lang.String r0 = "module_config"
            r6.put(r0, r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0CF.A0B():java.util.Map");
    }

    public String A0A() {
        return "home";
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.String[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: A0I */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass0Ju A09(org.json.JSONObject r10) {
        /*
            r9 = this;
            java.util.ArrayList r7 = X.AnonymousClass000.A13()
            java.lang.String r0 = "biz_categories"
            org.json.JSONArray r3 = r10.optJSONArray(r0)
            r8 = 0
            if (r3 == 0) goto L_0x0025
            int r2 = r3.length()
            r1 = 0
        L_0x0012:
            if (r1 >= r2) goto L_0x0025
            org.json.JSONObject r0 = r3.getJSONObject(r1)
            X.C18070vi.A0X(r0)
            X.0CD r0 = A00(r0)
            r7.add(r0)
            int r1 = r1 + 1
            goto L_0x0012
        L_0x0025:
            java.util.ArrayList r6 = X.AnonymousClass000.A13()
            java.lang.String r0 = "popular_biz"
            org.json.JSONArray r3 = r10.optJSONArray(r0)
            if (r3 == 0) goto L_0x0046
            int r2 = r3.length()
            r1 = 0
        L_0x0036:
            if (r1 >= r2) goto L_0x0046
            org.json.JSONObject r0 = r3.getJSONObject(r1)
            X.AF0 r0 = X.AF0.A01(r0)
            r6.add(r0)
            int r1 = r1 + 1
            goto L_0x0036
        L_0x0046:
            java.util.ArrayList r5 = X.AnonymousClass000.A13()
            org.json.JSONArray r4 = r9.A02
            if (r4 == 0) goto L_0x0077
            int r3 = r4.length()
            java.lang.String[] r2 = new java.lang.String[r3]
            r1 = 0
        L_0x0055:
            if (r1 >= r3) goto L_0x0060
            java.lang.Object r0 = r4.get(r1)
            r2[r1] = r0
            int r1 = r1 + 1
            goto L_0x0055
        L_0x0060:
            if (r8 >= r3) goto L_0x0077
            r1 = r2[r8]
            org.json.JSONObject r0 = r10.optJSONObject(r1)
            if (r0 == 0) goto L_0x0074
            X.C18070vi.A0b(r0)
            X.0K7 r0 = A01(r1, r0)
            r5.add(r0)
        L_0x0074:
            int r8 = r8 + 1
            goto L_0x0060
        L_0x0077:
            X.0Ju r0 = new X.0Ju
            r0.<init>(r6, r7, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0CF.A09(org.json.JSONObject):X.0Ju");
    }
}
