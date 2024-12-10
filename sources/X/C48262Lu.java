package X;

import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.2Lu  reason: invalid class name and case insensitive filesystem */
public final class C48262Lu extends C57882jn {
    public final C40861vP A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final List A08;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !C18070vi.A14(this, obj)) {
                return false;
            }
            C48262Lu r4 = (C48262Lu) obj;
            if (!C18070vi.A18(this.A06, r4.A06) || !C18070vi.A18(this.A05, r4.A05) || !C18070vi.A18(this.A07, r4.A07) || !C18070vi.A18(this.A08, r4.A08) || !C18070vi.A18(this.A01, r4.A01) || !C18070vi.A18(this.A00, r4.A00) || !C42171xk.A00(this.A02, r4.A02) || !C42171xk.A00(this.A04, r4.A04) || !C42171xk.A00(this.A03, r4.A03) || !C42171xk.A00(this.A02, r4.A02) || !C42171xk.A00(this.A03, r4.A03)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if (r1 == 0) goto L_0x000b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A02() {
        /*
            r2 = this;
            java.lang.String r0 = r2.A03
            if (r0 == 0) goto L_0x000b
            int r1 = r0.length()
            r0 = 0
            if (r1 != 0) goto L_0x000c
        L_0x000b:
            r0 = 1
        L_0x000c:
            r0 = r0 ^ 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48262Lu.A02():boolean");
    }

    public int hashCode() {
        String str;
        String str2;
        Object[] objArr = new Object[11];
        objArr[0] = this.A06;
        objArr[1] = this.A05;
        objArr[2] = this.A07;
        objArr[3] = this.A08;
        objArr[4] = this.A01;
        objArr[5] = this.A00;
        objArr[6] = this.A02;
        objArr[7] = this.A04;
        objArr[8] = this.A03;
        AnonymousClass4DO r0 = this.A02;
        String str3 = "";
        if (r0 == null || (str = r0.id) == null) {
            str = str3;
        }
        objArr[9] = str;
        AnonymousClass4DP r02 = this.A03;
        if (!(r02 == null || (str2 = r02.id) == null)) {
            str3 = str2;
        }
        return AnonymousClass000.A0P(str3, objArr, 10);
    }

    public C48262Lu(C40861vP r1, AnonymousClass4DO r2, AnonymousClass4DP r3, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list) {
        super(r2, r3, str3);
        this.A06 = str;
        this.A05 = str2;
        this.A07 = str4;
        this.A08 = list;
        this.A01 = str5;
        this.A00 = r1;
        this.A02 = str6;
        this.A04 = str7;
        this.A03 = str8;
    }

    public final JSONObject A01() {
        JSONObject A15 = C17880vN.A15();
        A15.put("title", this.A07);
        A15.put("icon_description", this.A04);
        A15.put("agree_button_text", this.A01);
        A15.put("icon_light_url", this.A06);
        A15.put("icon_dark_url", this.A05);
        AnonymousClass4DO r0 = this.A02;
        if (r0 != null) {
            A15.put("icon_role", r0.id);
        }
        AnonymousClass4DP r02 = this.A03;
        if (r02 != null) {
            A15.put("icon_style", r02.id);
        }
        A15.put("timing", this.A00.A00());
        JSONArray jSONArray = new JSONArray();
        for (C59432mI r4 : this.A08) {
            JSONObject A152 = C17880vN.A15();
            A152.put("bullet_text_", r4.A02);
            String str = r4.A01;
            if (str != null) {
                A152.put("bullet_icon_light_url_", str);
            }
            String str2 = r4.A00;
            if (str2 != null) {
                A152.put("bullet_icon_dark_url_", str2);
            }
            jSONArray.put(A152);
        }
        A15.put("bullets", jSONArray);
        String str3 = this.A02;
        if (str3 != null) {
            A15.put("body", str3);
        }
        String str4 = this.A04;
        if (str4 != null) {
            A15.put("footer", str4);
        }
        String str5 = this.A03;
        if (str5 != null) {
            A15.put("dismiss_button_text", str5);
        }
        return A15;
    }

    public String toString() {
        String str;
        String name;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("UserNoticeModal{iconLightUrl='");
        A10.append(this.A06);
        A10.append("', iconDarkUrl='");
        A10.append(this.A05);
        A10.append("'iconRole='");
        AnonymousClass4DO r0 = this.A02;
        String str2 = "null";
        if (r0 == null || (str = r0.name()) == null) {
            str = str2;
        }
        A10.append(str);
        A10.append("', iconStyle='");
        AnonymousClass4DP r02 = this.A03;
        if (!(r02 == null || (name = r02.name()) == null)) {
            str2 = name;
        }
        A10.append(str2);
        A10.append("', iconDescription='");
        A10.append(this.A04);
        A10.append("', title='");
        A10.append(this.A07);
        A10.append("', bulletPoints=");
        A10.append(this.A08);
        A10.append(", agreeButtonText='");
        A10.append(this.A01);
        A10.append("', timing=");
        A10.append(this.A00);
        A10.append(", body='");
        A10.append(this.A02);
        A10.append("', footer='");
        A10.append(this.A04);
        A10.append("', dismissButtonText='");
        A10.append(this.A03);
        return AnonymousClass000.A0y("'}", A10);
    }
}
