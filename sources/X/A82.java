package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class A82 {
    public static final A82 A00 = new Object();

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: X.ADg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: X.AEB} */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: type inference failed for: r8v3 */
    /* JADX WARNING: type inference failed for: r3v6, types: [java.util.Collection] */
    /* JADX WARNING: type inference failed for: r6v9, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r0v73, types: [X.ADD, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v27, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r8v9 */
    /* JADX WARNING: type inference failed for: r10v14, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r8v14 */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0212, code lost:
        if (r6.equals("specific_hours") == false) goto L_0x021e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x021b, code lost:
        if (r6.equals("open_24h") == false) goto L_0x021e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x021e, code lost:
        r0 = X.AnonymousClass1UI.A01(X.AnonymousClass001.A1H("Unrecognized open mode: ", r6, X.AnonymousClass000.A10()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x022e, code lost:
        r6 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0230, code lost:
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0232, code lost:
        r6 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0233, code lost:
        r12.add(new X.AE8(r14, r10, r9, r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x026b, code lost:
        if ("catalog_exists".equals(r6.A0Q("status", (java.lang.String) null)) == false) goto L_0x026d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x029f, code lost:
        if (r10 == false) goto L_0x02a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x019c, code lost:
        r0 = X.AnonymousClass1UI.A01(X.AnonymousClass001.A1H("Unrecognized week day: ", r9, X.AnonymousClass000.A10()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01aa, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01f0, code lost:
        r15 = r6.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01f7, code lost:
        if (r15 == -504372495) goto L_0x0215;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01fc, code lost:
        if (r15 == 1800267202) goto L_0x020c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0201, code lost:
        if (r15 != 2060249164) goto L_0x021e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0209, code lost:
        if (r6.equals("appointment_only") == false) goto L_0x021e;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x025e  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0278  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x030e  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x0349  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x03a6  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x044d  */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x0532  */
    /* JADX WARNING: Removed duplicated region for block: B:263:0x05c5  */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.AEW A01(com.whatsapp.jid.UserJid r24, X.C29621ca r25) {
        /*
            r17 = 0
            X.A82 r7 = A00
            r6 = 0
            r2 = r25
            if (r25 != 0) goto L_0x000b
            r0 = 0
            return r0
        L_0x000b:
            X.A4n r1 = new X.A4n
            r1.<init>()
            r0 = r24
            r1.A09 = r0
            java.lang.String r0 = "tag"
            java.lang.String r0 = r2.A0Q(r0, r6)
            r1.A0M = r0
            java.lang.String r0 = "structured_address"
            X.1ca r3 = r2.A0K(r0)
            if (r3 == 0) goto L_0x003d
            java.lang.String r0 = "street_address"
            java.lang.String r12 = A03(r3, r0)
            java.lang.String r0 = "zip_code"
            java.lang.String r11 = A03(r3, r0)
            java.lang.String r0 = "city_id"
            java.lang.String r10 = A03(r3, r0)
            java.lang.String r0 = "localized_city_name"
            java.lang.String r14 = A03(r3, r0)
            goto L_0x0046
        L_0x003d:
            java.lang.String r0 = "address"
            java.lang.String r12 = A03(r2, r0)
            r14 = r6
            r11 = r6
            r10 = r6
        L_0x0046:
            java.lang.String r5 = "latitude"
            X.1ca r3 = r2.A0K(r5)     // Catch:{ NumberFormatException -> 0x05e3 }
            r13 = 0
            if (r3 == 0) goto L_0x0063
            java.lang.String r0 = r3.A0M()     // Catch:{ NumberFormatException -> 0x05e3 }
            if (r0 == 0) goto L_0x0063
            java.lang.String r0 = r3.A0M()     // Catch:{ NumberFormatException -> 0x05e3 }
            if (r0 == 0) goto L_0x0063
            double r3 = java.lang.Double.parseDouble(r0)     // Catch:{ NumberFormatException -> 0x05e3 }
            java.lang.Double r13 = java.lang.Double.valueOf(r3)     // Catch:{ NumberFormatException -> 0x05e3 }
        L_0x0063:
            java.lang.String r4 = "longitude"
            X.1ca r3 = r2.A0K(r4)     // Catch:{ NumberFormatException -> 0x05e3 }
            r8 = 0
            if (r3 == 0) goto L_0x0080
            java.lang.String r0 = r3.A0M()     // Catch:{ NumberFormatException -> 0x05e3 }
            if (r0 == 0) goto L_0x0080
            java.lang.String r0 = r3.A0M()     // Catch:{ NumberFormatException -> 0x05e3 }
            if (r0 == 0) goto L_0x0080
            double r8 = java.lang.Double.parseDouble(r0)     // Catch:{ NumberFormatException -> 0x05e3 }
            java.lang.Double r8 = java.lang.Double.valueOf(r8)     // Catch:{ NumberFormatException -> 0x05e3 }
        L_0x0080:
            java.lang.String r0 = ""
            if (r10 != 0) goto L_0x0085
            r10 = r0
        L_0x0085:
            if (r14 == 0) goto L_0x0088
            r0 = r14
        L_0x0088:
            X.AEG r3 = new X.AEG
            r3.<init>(r13, r8, r10, r0)
            X.AEH r0 = new X.AEH
            r0.<init>(r3, r6, r12, r11)
            r1.A08 = r0
            java.lang.String r0 = "description"
            java.lang.String r0 = A03(r2, r0)
            r1.A0H = r0
            boolean r18 = r7.A04(r1, r2)
            java.lang.String r0 = "email"
            java.lang.String r0 = A03(r2, r0)
            r1.A0I = r0
            java.lang.String r0 = "vertical"
            X.1ca r3 = r2.A0K(r0)
            if (r3 == 0) goto L_0x00ff
            java.lang.String r0 = "canonical"
            java.lang.String r0 = r3.A0Q(r0, r6)
        L_0x00b6:
            r1.A0N = r0
            X.0wS r10 = X.C18460wS.A00
            r3 = r10
            r25 = r10
            java.lang.String r0 = "categories"
            java.util.List r6 = r2.A0R(r0)
            X.C18070vi.A0X(r6)
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x0101
            r0 = r17
            java.lang.Object r6 = r6.get(r0)
            X.1ca r6 = (X.C29621ca) r6
            java.util.ArrayList r10 = X.AnonymousClass000.A13()
            java.lang.String r0 = "category"
            java.util.Iterator r9 = X.AnonymousClass8BW.A0r(r6, r0)
        L_0x00de:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0101
            X.1ca r6 = X.C17880vN.A0a(r9)
            java.lang.String r0 = "id"
            java.lang.String r8 = X.C29621ca.A02(r6, r0)
            java.lang.String r6 = r6.A0M()
            if (r8 == 0) goto L_0x00de
            if (r6 == 0) goto L_0x00de
            X.AEQ r0 = new X.AEQ
            r0.<init>(r8, r6)
            r10.add(r0)
            goto L_0x00de
        L_0x00ff:
            r0 = 0
            goto L_0x00b6
        L_0x0101:
            java.util.List r0 = r1.A0P
            r0.clear()
            r0.addAll(r10)
            java.lang.String r0 = "website"
            java.util.List r0 = r2.A0R(r0)
            java.util.ArrayList r8 = X.C108965cb.A0t(r0)
            java.util.Iterator r6 = r0.iterator()
        L_0x0117:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0129
            X.1ca r0 = X.C17880vN.A0a(r6)
            java.lang.String r0 = r0.A0M()
            r8.add(r0)
            goto L_0x0117
        L_0x0129:
            java.util.List r0 = r1.A0V
            r0.clear()
            r0.addAll(r8)
            java.lang.String r0 = "business_hours"
            X.1ca r9 = r2.A0K(r0)
            r8 = 0
            if (r9 == 0) goto L_0x0253
            java.lang.String r0 = "timezone"
            java.lang.String r13 = r9.A0Q(r0, r8)     // Catch:{ NumberFormatException -> 0x024c }
            java.util.ArrayList r12 = X.AnonymousClass000.A13()     // Catch:{ NumberFormatException -> 0x024c }
            java.lang.String r0 = "business_hours_note"
            X.1ca r6 = r9.A0K(r0)     // Catch:{ NumberFormatException -> 0x024c }
            if (r6 == 0) goto L_0x023d
            java.lang.String r0 = r6.A0M()     // Catch:{ NumberFormatException -> 0x024c }
            if (r0 == 0) goto L_0x023d
            java.lang.String r11 = r6.A0M()     // Catch:{ NumberFormatException -> 0x024c }
        L_0x0156:
            java.lang.String r0 = "business_hours_config"
            java.util.Iterator r16 = X.C29621ca.A03(r9, r0)     // Catch:{ NumberFormatException -> 0x024c }
        L_0x015c:
            boolean r0 = r16.hasNext()     // Catch:{ NumberFormatException -> 0x024c }
            if (r0 == 0) goto L_0x0240
            X.1ca r14 = X.C17880vN.A0a(r16)     // Catch:{ NumberFormatException -> 0x024c }
            java.lang.String r0 = "day_of_week"
            java.lang.String r9 = X.AnonymousClass8BT.A0u(r14, r0, r8)     // Catch:{ NumberFormatException -> 0x024c }
            X.C18070vi.A0X(r9)     // Catch:{ NumberFormatException -> 0x024c }
            java.lang.String r0 = "mode"
            java.lang.String r6 = X.AnonymousClass8BT.A0u(r14, r0, r8)     // Catch:{ NumberFormatException -> 0x024c }
            X.C18070vi.A0X(r6)     // Catch:{ NumberFormatException -> 0x024c }
            java.lang.String r0 = "open_time"
            java.lang.String r10 = r14.A0Q(r0, r8)     // Catch:{ NumberFormatException -> 0x024c }
            java.lang.String r0 = "close_time"
            java.lang.String r0 = r14.A0Q(r0, r8)     // Catch:{ NumberFormatException -> 0x024c }
            if (r10 == 0) goto L_0x018b
            java.lang.Integer r14 = java.lang.Integer.valueOf(r10)     // Catch:{ NumberFormatException -> 0x024c }
            goto L_0x018c
        L_0x018b:
            r14 = r8
        L_0x018c:
            if (r0 == 0) goto L_0x018f
            goto L_0x0191
        L_0x018f:
            r10 = r8
            goto L_0x0195
        L_0x0191:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)     // Catch:{ NumberFormatException -> 0x024c }
        L_0x0195:
            int r0 = r9.hashCode()     // Catch:{ NumberFormatException -> 0x024c }
            switch(r0) {
                case 101661: goto L_0x01ab;
                case 108300: goto L_0x01b5;
                case 113638: goto L_0x01bf;
                case 114252: goto L_0x01c9;
                case 114817: goto L_0x01d3;
                case 115204: goto L_0x01dd;
                case 117590: goto L_0x01e7;
                default: goto L_0x019c;
            }     // Catch:{ NumberFormatException -> 0x024c }
        L_0x019c:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ NumberFormatException -> 0x024c }
            java.lang.String r0 = "Unrecognized week day: "
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r9, r1)     // Catch:{ NumberFormatException -> 0x024c }
            X.1UI r0 = X.AnonymousClass1UI.A01(r0)     // Catch:{ NumberFormatException -> 0x024c }
        L_0x01aa:
            throw r0     // Catch:{ NumberFormatException -> 0x024c }
        L_0x01ab:
            java.lang.String r0 = "fri"
            boolean r0 = r9.equals(r0)     // Catch:{ NumberFormatException -> 0x024c }
            if (r0 == 0) goto L_0x019c
            r9 = 6
            goto L_0x01f0
        L_0x01b5:
            java.lang.String r0 = "mon"
            boolean r0 = r9.equals(r0)     // Catch:{ NumberFormatException -> 0x024c }
            if (r0 == 0) goto L_0x019c
            r9 = 2
            goto L_0x01f0
        L_0x01bf:
            java.lang.String r0 = "sat"
            boolean r0 = r9.equals(r0)     // Catch:{ NumberFormatException -> 0x024c }
            if (r0 == 0) goto L_0x019c
            r9 = 7
            goto L_0x01f0
        L_0x01c9:
            java.lang.String r0 = "sun"
            boolean r0 = r9.equals(r0)     // Catch:{ NumberFormatException -> 0x024c }
            if (r0 == 0) goto L_0x019c
            r9 = 1
            goto L_0x01f0
        L_0x01d3:
            java.lang.String r0 = "thu"
            boolean r0 = r9.equals(r0)     // Catch:{ NumberFormatException -> 0x024c }
            if (r0 == 0) goto L_0x019c
            r9 = 5
            goto L_0x01f0
        L_0x01dd:
            java.lang.String r0 = "tue"
            boolean r0 = r9.equals(r0)     // Catch:{ NumberFormatException -> 0x024c }
            if (r0 == 0) goto L_0x019c
            r9 = 3
            goto L_0x01f0
        L_0x01e7:
            java.lang.String r0 = "wed"
            boolean r0 = r9.equals(r0)     // Catch:{ NumberFormatException -> 0x024c }
            if (r0 == 0) goto L_0x019c
            r9 = 4
        L_0x01f0:
            int r15 = r6.hashCode()     // Catch:{ NumberFormatException -> 0x024c }
            r0 = -504372495(0xffffffffe1efe2f1, float:-5.531406E20)
            if (r15 == r0) goto L_0x0215
            r0 = 1800267202(0x6b4de5c2, float:2.489148E26)
            if (r15 == r0) goto L_0x020c
            r0 = 2060249164(0x7acce84c, float:5.3197005E35)
            if (r15 != r0) goto L_0x021e
            java.lang.String r0 = "appointment_only"
            boolean r0 = r6.equals(r0)     // Catch:{ NumberFormatException -> 0x024c }
            if (r0 == 0) goto L_0x021e
            goto L_0x022e
        L_0x020c:
            java.lang.String r0 = "specific_hours"
            boolean r0 = r6.equals(r0)     // Catch:{ NumberFormatException -> 0x024c }
            if (r0 == 0) goto L_0x021e
            goto L_0x0230
        L_0x0215:
            java.lang.String r0 = "open_24h"
            boolean r0 = r6.equals(r0)     // Catch:{ NumberFormatException -> 0x024c }
            if (r0 == 0) goto L_0x021e
            goto L_0x0232
        L_0x021e:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ NumberFormatException -> 0x024c }
            java.lang.String r0 = "Unrecognized open mode: "
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r6, r1)     // Catch:{ NumberFormatException -> 0x024c }
            X.1UI r0 = X.AnonymousClass1UI.A01(r0)     // Catch:{ NumberFormatException -> 0x024c }
            goto L_0x01aa
        L_0x022e:
            r6 = 2
            goto L_0x0233
        L_0x0230:
            r6 = 0
            goto L_0x0233
        L_0x0232:
            r6 = 1
        L_0x0233:
            X.AE8 r0 = new X.AE8     // Catch:{ NumberFormatException -> 0x024c }
            r0.<init>(r14, r10, r9, r6)     // Catch:{ NumberFormatException -> 0x024c }
            r12.add(r0)     // Catch:{ NumberFormatException -> 0x024c }
            goto L_0x015c
        L_0x023d:
            r11 = r8
            goto L_0x0156
        L_0x0240:
            int r0 = r12.size()     // Catch:{ NumberFormatException -> 0x024c }
            if (r0 <= 0) goto L_0x0253
            X.ADs r0 = new X.ADs     // Catch:{ NumberFormatException -> 0x024c }
            r0.<init>(r13, r11, r12)     // Catch:{ NumberFormatException -> 0x024c }
            goto L_0x0254
        L_0x024c:
            java.lang.String r0 = "Business hours open/close time failed to parse."
            X.1UI r0 = X.AnonymousClass1UI.A01(r0)
            throw r0
        L_0x0253:
            r0 = r8
        L_0x0254:
            r1.A04 = r0
            java.lang.String r0 = "catalog_status"
            X.1ca r6 = r2.A0K(r0)
            if (r6 == 0) goto L_0x026d
            java.lang.String r0 = "status"
            java.lang.String r6 = r6.A0Q(r0, r8)
            java.lang.String r0 = "catalog_exists"
            boolean r6 = r0.equals(r6)
            r0 = 1
            if (r6 != 0) goto L_0x026e
        L_0x026d:
            r0 = 0
        L_0x026e:
            r1.A0W = r0
            java.lang.String r0 = "profile_options"
            X.1ca r6 = r2.A0K(r0)
            if (r6 == 0) goto L_0x02fe
            java.lang.String r0 = "commerce_experience"
            java.lang.String r10 = A03(r6, r0)
            r1.A0E = r10
            java.lang.String r0 = "shop"
            r9 = 1
            boolean r0 = r0.equalsIgnoreCase(r10)
            if (r0 == 0) goto L_0x041d
            java.lang.String r0 = "shop_url"
            java.lang.String r0 = A03(r6, r0)
            r1.A0K = r0
        L_0x0291:
            java.lang.String r0 = "cart_enabled"
            java.lang.Boolean r0 = A02(r6, r0)
            r11 = 0
            if (r0 == 0) goto L_0x02a1
            boolean r10 = r0.booleanValue()
            r0 = 1
            if (r10 != 0) goto L_0x02a2
        L_0x02a1:
            r0 = 0
        L_0x02a2:
            r1.A0Z = r0
            java.lang.String r0 = "has_galaxy_flows"
            java.lang.Boolean r0 = A02(r6, r0)
            if (r0 == 0) goto L_0x02b3
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x02b3
            r11 = 1
        L_0x02b3:
            r1.A0b = r11
            java.lang.String r0 = "calling_enabled"
            java.lang.Boolean r0 = A02(r6, r0)
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            boolean r0 = r9.equals(r0)
            r1.A0Y = r0
            java.lang.String r0 = "calling_hidden_entrypoints"
            int r0 = A00(r6, r0)
            r1.A01 = r0
            java.lang.String r0 = "is_responsive"
            java.lang.Boolean r0 = A02(r6, r0)
            boolean r0 = r9.equals(r0)
            r1.A0d = r0
            java.lang.String r0 = "is_offerings_eligible"
            java.lang.Boolean r0 = A02(r6, r0)
            boolean r0 = r9.equals(r0)
            r1.A0c = r0
            if (r18 != 0) goto L_0x02ea
            r7.A04(r1, r6)
        L_0x02ea:
            java.lang.String r0 = "bot_fields"
            X.1ca r6 = r6.A0K(r0)
            if (r6 == 0) goto L_0x02fe
            java.lang.String r0 = "is_typing_indicator_enabled"
            java.lang.Boolean r0 = A02(r6, r0)
            boolean r0 = r9.equals(r0)
            r1.A0f = r0
        L_0x02fe:
            java.lang.String r0 = "custom_url"
            java.lang.String r0 = A03(r2, r0)
            r1.A0G = r0
            java.lang.String r0 = "linked_accounts"
            X.1ca r10 = r2.A0K(r0)
            if (r10 == 0) goto L_0x0373
            java.lang.String r0 = "fb_page"
            X.1ca r11 = r10.A0K(r0)
            r12 = 0
            java.lang.String r13 = "has_published_media_posts"
            java.lang.String r9 = "id"
            r15 = 1
            if (r11 == 0) goto L_0x041a
            java.lang.String r14 = r11.A0Q(r9, r8)
            java.lang.String r0 = "display_name"
            java.lang.String r7 = A03(r11, r0)
            java.lang.String r0 = "likes"
            int r6 = A00(r11, r0)
            java.lang.Boolean r11 = A02(r11, r13)
            if (r14 == 0) goto L_0x041a
            if (r7 == 0) goto L_0x041a
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r15)
            boolean r0 = X.AnonymousClass000.A1Z(r11, r0)
            X.AEB r11 = new X.AEB
            r11.<init>(r14, r7, r6, r0)
        L_0x0341:
            java.lang.String r0 = "ig_professional"
            X.1ca r6 = r10.A0K(r0)
            if (r6 == 0) goto L_0x036d
            java.lang.String r10 = r6.A0Q(r9, r8)
            java.lang.String r0 = "ig_handle"
            java.lang.String r9 = A03(r6, r0)
            java.lang.String r0 = "followers"
            int r7 = A00(r6, r0)
            java.lang.Boolean r6 = A02(r6, r13)
            if (r10 == 0) goto L_0x036d
            if (r9 == 0) goto L_0x036d
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r15)
            if (r6 != r0) goto L_0x0368
            r12 = 1
        L_0x0368:
            X.AEB r8 = new X.AEB
            r8.<init>(r10, r9, r7, r12)
        L_0x036d:
            X.ADg r0 = new X.ADg
            r0.<init>(r11, r8)
            r8 = r0
        L_0x0373:
            r1.A06 = r8
            java.lang.String r0 = "cover_photo"
            X.1ca r6 = r2.A0K(r0)
            java.lang.String r8 = A03(r2, r0)
            if (r6 == 0) goto L_0x0397
            java.lang.String r0 = "id"
            java.lang.String r7 = X.C29621ca.A02(r6, r0)
            if (r7 == 0) goto L_0x0397
            int r0 = r7.length()
            if (r0 == 0) goto L_0x0397
            r6 = 0
            X.AEA r0 = new X.AEA
            r0.<init>(r7, r6, r6, r8)
            r1.A05 = r0
        L_0x0397:
            java.lang.String r0 = "service_areas"
            java.util.List r6 = r2.A0R(r0)
            X.C18070vi.A0X(r6)
            boolean r0 = X.AnonymousClass000.A1a(r6)
            if (r0 == 0) goto L_0x043d
            r0 = r17
            java.lang.Object r6 = r6.get(r0)
            X.1ca r6 = (X.C29621ca) r6
            java.util.ArrayList r3 = X.AnonymousClass000.A13()
            java.lang.String r0 = "service_area"
            java.util.Iterator r10 = X.AnonymousClass8BW.A0r(r6, r0)
        L_0x03b8:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x043d
            X.1ca r6 = X.C17880vN.A0a(r10)
            java.lang.String r0 = "area_description"
            X.1ca r0 = r6.A0K(r0)
            r9 = 0
            java.lang.String r19 = X.AnonymousClass8BU.A0o(r0)
            java.lang.String r0 = "area_radius_meters"
            java.lang.String r8 = X.AnonymousClass8BW.A0e(r6, r0)
            java.lang.String r0 = "area_center"
            X.1ca r0 = r6.A0K(r0)
            if (r0 == 0) goto L_0x03b8
            java.lang.String r6 = X.AnonymousClass8BW.A0e(r0, r5)
            X.1ca r0 = r0.A0K(r4)
            if (r0 == 0) goto L_0x03e9
            java.lang.String r9 = r0.A0M()
        L_0x03e9:
            if (r6 == 0) goto L_0x03b8
            if (r9 == 0) goto L_0x03b8
            if (r8 == 0) goto L_0x03b8
            java.lang.Double r7 = java.lang.Double.valueOf(r6)
            java.lang.Double r6 = java.lang.Double.valueOf(r9)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            if (r0 == 0) goto L_0x03b8
            if (r7 == 0) goto L_0x03b8
            if (r6 == 0) goto L_0x03b8
            if (r19 == 0) goto L_0x03b8
            int r24 = r0.intValue()
            double r20 = r7.doubleValue()
            double r22 = r6.doubleValue()
            X.AE9 r0 = new X.AE9
            r18 = r0
            r18.<init>(r19, r20, r22, r24)
            r3.add(r0)
            goto L_0x03b8
        L_0x041a:
            r11 = r8
            goto L_0x0341
        L_0x041d:
            java.lang.String r0 = "catalog"
            boolean r0 = r0.equals(r10)
            if (r0 != 0) goto L_0x0439
            java.lang.String r0 = "smb_meta_catalog"
            boolean r0 = r0.equals(r10)
            if (r0 != 0) goto L_0x0439
            java.lang.String r0 = "flow"
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L_0x0291
            r1.A0X = r9
            goto L_0x0291
        L_0x0439:
            r1.A0W = r9
            goto L_0x0291
        L_0x043d:
            java.util.List r0 = r1.A0U
            r0.clear()
            r0.addAll(r3)
            java.lang.String r0 = "direct_connection"
            X.1ca r6 = r2.A0K(r0)
            if (r6 == 0) goto L_0x04fc
            java.lang.String r3 = "enabled"
            java.lang.String r0 = "false"
            java.lang.String r0 = r6.A0Q(r3, r0)
            if (r0 == 0) goto L_0x045d
            boolean r0 = java.lang.Boolean.parseBoolean(r0)
            r1.A0a = r0
        L_0x045d:
            java.lang.String r0 = "default_postcode"
            X.1ca r7 = r6.A0K(r0)
            if (r7 == 0) goto L_0x0485
            java.lang.String r0 = "code"
            r3 = 0
            java.lang.String r5 = r7.A0Q(r0, r3)
            java.lang.String r0 = "location_name"
            java.lang.String r4 = r7.A0Q(r0, r3)
            java.lang.String r3 = "postcode_type"
            java.lang.String r0 = "pincode"
            java.lang.String r3 = r7.A0Q(r3, r0)
            if (r5 == 0) goto L_0x0485
            if (r4 == 0) goto L_0x0485
            X.ADr r0 = new X.ADr
            r0.<init>(r5, r4, r3)
            r1.A03 = r0
        L_0x0485:
            java.lang.String r3 = "allowed_country_codes"
            X.1ca r0 = r6.A0K(r3)
            if (r0 == 0) goto L_0x04bb
            java.util.List r0 = r6.A0R(r3)
            X.C18070vi.A0X(r0)
            java.util.HashSet r4 = X.C17880vN.A12()
            java.util.Iterator r3 = r0.iterator()
        L_0x049c:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x04ae
            X.1ca r0 = X.C17880vN.A0a(r3)
            java.lang.String r0 = r0.A0M()
            r4.add(r0)
            goto L_0x049c
        L_0x04ae:
            java.util.ArrayList r3 = X.C17880vN.A10(r4)
            r0 = 0
            r1.A0S = r0
            java.util.ArrayList r0 = X.C17880vN.A10(r3)
            r1.A0S = r0
        L_0x04bb:
            java.lang.String r0 = "features"
            java.util.List r0 = r6.A0R(r0)
            java.util.ArrayList r5 = X.C108965cb.A0t(r0)
            java.util.Iterator r4 = r0.iterator()
        L_0x04c9:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x04e6
            X.1ca r3 = X.C17880vN.A0a(r4)
            java.lang.String r0 = "name"
            java.lang.String r3 = X.C29621ca.A02(r3, r0)
            if (r3 == 0) goto L_0x04c9
            X.ADD r0 = new X.ADD
            r0.<init>()
            r0.A00 = r3
            r5.add(r0)
            goto L_0x04c9
        L_0x04e6:
            java.util.List r0 = r1.A0R
            r0.clear()
            r0.addAll(r5)
            java.lang.String r0 = "blocked_status"
            java.lang.String r0 = X.C29621ca.A02(r6, r0)
            if (r0 == 0) goto L_0x04fc
            java.lang.String r0 = X.C108975cc.A0e(r0)
            r1.A0C = r0
        L_0x04fc:
            java.lang.String r0 = "member_since_text"
            java.lang.String r0 = A03(r2, r0)
            r1.A0J = r0
            java.lang.String r0 = "price_tier"
            X.1ca r6 = r2.A0K(r0)
            r5 = 0
            if (r6 == 0) goto L_0x0524
            java.lang.String r0 = "id"
            java.lang.String r4 = r6.A0Q(r0, r5)
            if (r4 == 0) goto L_0x0524
            java.lang.String r3 = r6.A0M()
            java.lang.String r0 = "symbol"
            java.lang.String r0 = r6.A0Q(r0, r5)
            X.ADt r5 = new X.ADt
            r5.<init>(r4, r3, r0)
        L_0x0524:
            r1.A07 = r5
            java.util.ArrayList r6 = X.AnonymousClass000.A13()
            java.lang.String r0 = "offerings"
            X.1ca r3 = r2.A0K(r0)
            if (r3 == 0) goto L_0x05b9
            java.lang.String r0 = "category"
            java.util.Iterator r10 = X.AnonymousClass8BW.A0r(r3, r0)
        L_0x0538:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x05b7
            X.1ca r4 = X.C17880vN.A0a(r10)
            java.lang.String r5 = "id"
            r3 = 0
            java.lang.String r13 = r4.A0Q(r5, r3)
            java.lang.String r0 = "name"
            java.lang.String r12 = r4.A0Q(r0, r3)
            boolean r0 = X.AnonymousClass1EG.A0H(r13)
            if (r0 != 0) goto L_0x0538
            boolean r0 = X.AnonymousClass1EG.A0H(r12)
            if (r0 != 0) goto L_0x0538
            java.lang.String r0 = "offering"
            java.util.Iterator r9 = X.AnonymousClass8BW.A0r(r4, r0)
        L_0x0561:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0538
            X.1ca r4 = X.C17880vN.A0a(r9)
            r3 = 0
            java.lang.String r14 = r4.A0Q(r5, r3)
            java.lang.String r15 = r4.A0M()
            java.lang.String r0 = "is_offered"
            java.lang.String r8 = r4.A0Q(r0, r3)
            if (r14 == 0) goto L_0x0561
            if (r15 == 0) goto L_0x0561
            if (r8 == 0) goto L_0x0561
            if (r12 == 0) goto L_0x0561
            if (r13 == 0) goto L_0x0561
            int r7 = r8.length()
            r0 = 1
            int r7 = r7 - r0
            r4 = 0
            r3 = 0
        L_0x058c:
            if (r4 > r7) goto L_0x05a4
            r0 = r7
            if (r3 != 0) goto L_0x0592
            r0 = r4
        L_0x0592:
            boolean r0 = X.C109005cf.A0u(r8, r0)
            if (r3 != 0) goto L_0x059f
            if (r0 != 0) goto L_0x059c
            r3 = 1
            goto L_0x058c
        L_0x059c:
            int r4 = r4 + 1
            goto L_0x058c
        L_0x059f:
            if (r0 == 0) goto L_0x05a4
            int r7 = r7 + -1
            goto L_0x058c
        L_0x05a4:
            java.lang.String r3 = X.C108985cd.A0g(r7, r4, r8)
            java.lang.String r0 = "true"
            boolean r16 = r0.equalsIgnoreCase(r3)
            X.AEL r11 = new X.AEL
            r11.<init>(r12, r13, r14, r15, r16)
            r6.add(r11)
            goto L_0x0561
        L_0x05b7:
            r25 = r6
        L_0x05b9:
            r0 = r25
            r1.A0O = r0
            java.lang.String r3 = "survey_sampling_rate"
            X.1ca r0 = r2.A0K(r3)
            if (r0 == 0) goto L_0x05d2
            int r3 = A00(r2, r3)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            if (r2 != 0) goto L_0x05d7
            r2 = 0
        L_0x05d0:
            r1.A0A = r2
        L_0x05d2:
            X.AEW r0 = r1.A01()
            return r0
        L_0x05d7:
            if (r3 < 0) goto L_0x05de
            r0 = 100
            if (r3 > r0) goto L_0x05de
            goto L_0x05d0
        L_0x05de:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r17)
            goto L_0x05d0
        L_0x05e3:
            java.lang.String r0 = "business latitude/longitude failed to parse"
            X.1UI r0 = X.AnonymousClass1UI.A01(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A82.A01(com.whatsapp.jid.UserJid, X.1ca):X.AEW");
    }

    private final boolean A04(C20044A4n a4n, C29621ca r10) {
        String A0M;
        String str;
        String str2;
        String A0M2;
        String str3;
        String A03 = A03(r10, "automated_type");
        int i = 0;
        if (A03 != null) {
            if (A03.equals("3p_full")) {
                i = 2;
            } else if (A03.equals("1p_partial")) {
                i = 1;
            }
        }
        a4n.A00 = i;
        boolean z = false;
        boolean A1W = AnonymousClass000.A1W(A03);
        a4n.A0B = A03(r10, "bot_description");
        String A032 = A03(r10, "bot_sub_description");
        a4n.A0L = A032;
        if (A032 != null) {
            z = true;
        }
        boolean z2 = A1W | z;
        C29621ca A0K = r10.A0K("commands");
        if (A0K != null) {
            C29621ca A0K2 = A0K.A0K("description");
            if (A0K2 != null) {
                str2 = A0K2.A0M();
            } else {
                str2 = null;
            }
            a4n.A0D = str2;
            ArrayList A13 = AnonymousClass000.A13();
            Iterator A0r = AnonymousClass8BW.A0r(A0K, "command");
            while (A0r.hasNext()) {
                C29621ca A0a = C17880vN.A0a(A0r);
                C29621ca A0K3 = A0a.A0K(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
                if (!(A0K3 == null || (A0M2 = A0K3.A0M()) == null || AnonymousClass1EG.A0H(A0M2))) {
                    C29621ca A0K4 = A0a.A0K("description");
                    if (A0K4 == null || (str3 = A0K4.A0M()) == null) {
                        str3 = "";
                    }
                    A13.add(new C446124c((C20271AEe) null, A0M2, str3));
                }
            }
            List list = a4n.A0Q;
            list.clear();
            list.addAll(A13);
            z2 = true;
        }
        C29621ca A0K5 = r10.A0K("prompts");
        if (A0K5 == null) {
            return z2;
        }
        ArrayList A132 = AnonymousClass000.A13();
        Iterator A0r2 = AnonymousClass8BW.A0r(A0K5, "prompt");
        while (A0r2.hasNext()) {
            C29621ca A0a2 = C17880vN.A0a(A0r2);
            C29621ca A0K6 = A0a2.A0K("text");
            if (!(A0K6 == null || (A0M = A0K6.A0M()) == null || AnonymousClass1EG.A0H(A0M))) {
                C29621ca A0K7 = A0a2.A0K("emoji");
                if (A0K7 == null || (str = A0K7.A0M()) == null) {
                    str = "";
                }
                A132.add(new AnonymousClass24Z(A0M, str));
            }
        }
        List list2 = a4n.A0T;
        list2.clear();
        list2.addAll(A132);
        return true;
    }

    public static final int A00(C29621ca r1, String str) {
        C29621ca A0K = r1.A0K(str);
        if (A0K == null || A0K.A0M() == null) {
            return 0;
        }
        try {
            String A0M = A0K.A0M();
            if (A0M != null) {
                return Integer.parseInt(A0M);
            }
            return 0;
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public static final Boolean A02(C29621ca r3, String str) {
        boolean equalsIgnoreCase;
        C29621ca A0K = r3.A0K(str);
        String str2 = null;
        if (A0K == null || A0K.A0M() == null) {
            return null;
        }
        String A0M = A0K.A0M();
        if (A0M != null) {
            int length = A0M.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                int i2 = length;
                if (!z) {
                    i2 = i;
                }
                boolean A0u = C109005cf.A0u(A0M, i2);
                if (z) {
                    if (!A0u) {
                        break;
                    }
                    length--;
                } else if (!A0u) {
                    z = true;
                } else {
                    i++;
                }
            }
            str2 = C108985cd.A0g(length, i, A0M);
        }
        if (str2 == null) {
            equalsIgnoreCase = false;
        } else {
            equalsIgnoreCase = str2.equalsIgnoreCase("true");
        }
        return Boolean.valueOf(equalsIgnoreCase);
    }

    public static final String A03(C29621ca r0, String str) {
        C29621ca A0K = r0.A0K(str);
        if (A0K != null) {
            return A0K.A0M();
        }
        return null;
    }
}
