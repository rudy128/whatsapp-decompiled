package X;

import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class A6T {
    public final int A00;
    public final AnonymousClass00H A01;

    public static final C193429q5 A00(C29621ca r3) {
        C29621ca A0K;
        String str = null;
        boolean z = false;
        if (!(r3 == null || (A0K = r3.A0K("after")) == null || (str = A0K.A0M()) == null)) {
            if (str.length() == 0) {
                z = true;
            }
            z = !z;
        }
        return new C193429q5(z, str);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: X.AEM} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: X.AEM} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: X.AEM} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: X.AEM} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: X.AEM} */
    /* JADX WARNING: type inference failed for: r4v4, types: [java.lang.String] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C20255ADn A01(X.C29621ca r10) {
        /*
            r4 = 0
            if (r10 != 0) goto L_0x0004
            return r4
        L_0x0004:
            java.lang.String r0 = "country_code_origin"
            X.1ca r2 = r10.A0K(r0)
            java.lang.String r0 = "importer_name"
            X.1ca r1 = r10.A0K(r0)
            java.lang.String r0 = "importer_address"
            X.1ca r3 = r10.A0K(r0)
            java.lang.String r2 = X.AnonymousClass8BU.A0o(r2)
            java.lang.String r1 = X.AnonymousClass8BU.A0o(r1)
            if (r3 == 0) goto L_0x0050
            java.lang.String r0 = "street1"
            java.lang.String r5 = X.AnonymousClass8BW.A0e(r3, r0)
            java.lang.String r0 = "street2"
            java.lang.String r6 = X.AnonymousClass8BW.A0e(r3, r0)
            java.lang.String r0 = "postal_code"
            java.lang.String r7 = X.AnonymousClass8BW.A0e(r3, r0)
            java.lang.String r0 = "city"
            java.lang.String r8 = X.AnonymousClass8BW.A0e(r3, r0)
            java.lang.String r0 = "region"
            java.lang.String r9 = X.AnonymousClass8BW.A0e(r3, r0)
            java.lang.String r0 = "country_code"
            X.1ca r0 = r3.A0K(r0)
            if (r0 == 0) goto L_0x004a
            java.lang.String r4 = r0.A0M()
        L_0x004a:
            r10 = r4
            X.AEM r4 = new X.AEM
            r4.<init>(r5, r6, r7, r8, r9, r10)
        L_0x0050:
            X.ADn r0 = new X.ADn
            r0.<init>(r4, r2, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A6T.A01(X.1ca):X.ADn");
    }

    public final AN5 A02(C29621ca r6) {
        C18070vi.A0d(r6, 0);
        String str = "product_catalog";
        if (this.A00 != 0) {
            str = "product_list";
        }
        C29621ca A0K = r6.A0K(str);
        if (A0K == null) {
            return null;
        }
        C179409Hv A002 = AnonymousClass9PK.A00(C29621ca.A02(A0K, "catalog_type"));
        List A0R = A0K.A0R("product");
        ArrayList A0t = C108965cb.A0t(A0R);
        Iterator it = A0R.iterator();
        while (it.hasNext()) {
            C29621ca A0a = C17880vN.A0a(it);
            C18070vi.A0b(A0a);
            C20287AEv A03 = A03(A0a);
            if (A03 != null) {
                A0t.add(A03);
            }
        }
        AN5 an5 = new AN5(A00(A0K.A0K("paging")), A0t);
        an5.A00 = A002;
        return an5;
    }

    /* JADX WARNING: type inference failed for: r18v2, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v8, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01d1, code lost:
        if (java.lang.Boolean.parseBoolean(r11.A0M()) == false) goto L_0x01d3;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C20287AEv A03(X.C29621ca r38) {
        /*
            r37 = this;
            r0 = 0
            r4 = r38
            X.C18070vi.A0d(r4, r0)
            java.lang.String r0 = "id"
            X.1ca r19 = r4.A0K(r0)
            java.lang.String r0 = "name"
            X.1ca r18 = r4.A0K(r0)
            java.lang.String r0 = "description"
            X.1ca r11 = r4.A0K(r0)
            java.lang.String r0 = "url"
            X.1ca r17 = r4.A0K(r0)
            java.lang.String r0 = "shimmed_url"
            X.1ca r16 = r4.A0K(r0)
            java.lang.String r9 = "price"
            X.1ca r7 = r4.A0K(r9)
            java.lang.String r0 = "currency"
            X.1ca r6 = r4.A0K(r0)
            java.lang.String r0 = "retailer_id"
            X.1ca r15 = r4.A0K(r0)
            java.lang.String r0 = "media"
            X.1ca r3 = r4.A0K(r0)
            java.lang.String r0 = "image_fetch_status"
            X.1ca r1 = r4.A0K(r0)
            java.lang.String r0 = "status_info"
            X.1ca r2 = r4.A0K(r0)
            java.lang.String r0 = "sale_price"
            X.1ca r8 = r4.A0K(r0)
            java.lang.String r0 = "belongs_to"
            X.1ca r14 = r4.A0K(r0)
            java.lang.String r0 = "compliance_info"
            X.1ca r13 = r4.A0K(r0)
            java.lang.String r0 = "max_available"
            X.1ca r12 = r4.A0K(r0)
            java.lang.String r0 = "variant_info"
            X.1ca r10 = r4.A0K(r0)
            java.lang.String r5 = ""
            if (r1 == 0) goto L_0x0070
            java.lang.String r28 = r1.A0M()
            if (r28 != 0) goto L_0x0072
        L_0x0070:
            r28 = r5
        L_0x0072:
            r0 = 0
            java.lang.String r22 = X.AnonymousClass8BU.A0o(r19)
            java.lang.String r23 = X.AnonymousClass8BU.A0o(r18)
            java.lang.String r24 = X.AnonymousClass8BU.A0o(r11)
            if (r6 == 0) goto L_0x00a0
            java.lang.String r1 = r6.A0M()
            boolean r1 = X.AnonymousClass1EG.A0H(r1)
            if (r1 != 0) goto L_0x00a0
            java.lang.String r1 = r6.A0M()
            if (r1 == 0) goto L_0x0092
            r5 = r1
        L_0x0092:
            X.A6S r1 = new X.A6S
            r1.<init>(r5)
        L_0x0097:
            java.lang.String r5 = X.AnonymousClass8BU.A0o(r7)
            if (r1 == 0) goto L_0x00af
            if (r5 == 0) goto L_0x00af
            goto L_0x00a2
        L_0x00a0:
            r1 = r0
            goto L_0x0097
        L_0x00a2:
            long r5 = java.lang.Long.parseLong(r5)     // Catch:{ Exception -> 0x00ab }
            java.math.BigDecimal r29 = X.C197309wU.A00(r1, r5)     // Catch:{ Exception -> 0x00ab }
            goto L_0x00b1
        L_0x00ab:
            r1 = r0
            r29 = r0
            goto L_0x00b1
        L_0x00af:
            r29 = r0
        L_0x00b1:
            r7 = 0
            if (r8 != 0) goto L_0x0104
            r9 = r0
        L_0x00b5:
            java.lang.String r27 = X.AnonymousClass8BU.A0o(r15)
            java.lang.String r25 = X.AnonymousClass8BU.A0o(r17)
            java.lang.String r26 = X.AnonymousClass8BU.A0o(r16)
            java.lang.String r5 = "is_hidden"
            java.lang.String r5 = r4.A0Q(r5, r0)
            boolean r36 = java.lang.Boolean.parseBoolean(r5)
            java.lang.String r5 = "availability"
            java.lang.String r6 = r4.A0Q(r5, r0)
            java.lang.String r5 = "out of stock"
            boolean r32 = r5.equalsIgnoreCase(r6)
            java.lang.String r5 = "compliance_category"
            java.lang.String r7 = r4.A0Q(r5, r0)
            if (r22 == 0) goto L_0x0248
            if (r23 == 0) goto L_0x0248
            if (r3 == 0) goto L_0x0248
            java.lang.String r4 = "image"
            java.util.List r4 = r3.A0R(r4)
            java.util.ArrayList r8 = X.C108965cb.A0t(r4)
            int r6 = r4.size()
            r5 = 0
        L_0x00f2:
            if (r5 >= r6) goto L_0x015e
            X.1ca r4 = r3.A0J(r5)
            X.AEI r4 = X.C196519vC.A00(r4)
            if (r4 == 0) goto L_0x0101
            r8.add(r4)
        L_0x0101:
            int r5 = r5 + 1
            goto L_0x00f2
        L_0x0104:
            X.1ca r6 = r8.A0K(r9)
            java.lang.String r5 = "start_date"
            X.1ca r11 = r8.A0K(r5)
            java.lang.String r5 = "end_date"
            X.1ca r9 = r8.A0K(r5)
            java.lang.String r5 = X.AnonymousClass8BU.A0o(r6)
            if (r1 == 0) goto L_0x015b
            if (r5 == 0) goto L_0x015b
            long r5 = java.lang.Long.parseLong(r5)
            java.math.BigDecimal r6 = X.C197309wU.A00(r1, r5)     // Catch:{ IllegalArgumentException -> 0x015b }
            X.C18070vi.A0b(r6)
            if (r11 == 0) goto L_0x014b
            if (r9 == 0) goto L_0x014b
            java.lang.String r8 = r11.A0M()
            java.lang.String r9 = r9.A0M()
            if (r8 == 0) goto L_0x014b
            if (r9 == 0) goto L_0x014b
            java.lang.String r5 = "yyyy-MM-dd'T'HH:mmZ"
            java.text.SimpleDateFormat r5 = X.AnonymousClass8BS.A0q(r5)     // Catch:{ ParseException -> 0x014d }
            X.AnonymousClass8BV.A1P(r5)     // Catch:{ ParseException -> 0x014d }
            java.util.Date r8 = r5.parse(r8)     // Catch:{ ParseException -> 0x014d }
            java.util.Date r7 = r5.parse(r9)     // Catch:{ ParseException -> 0x0149 }
            goto L_0x0152
        L_0x0149:
            r5 = move-exception
            goto L_0x014f
        L_0x014b:
            r5 = r0
            goto L_0x0154
        L_0x014d:
            r5 = move-exception
            r8 = r0
        L_0x014f:
            com.whatsapp.util.Log.e((java.lang.Throwable) r5)
        L_0x0152:
            r5 = r7
            r7 = r8
        L_0x0154:
            X.AE5 r9 = new X.AE5
            r9.<init>(r1, r6, r7, r5)
            goto L_0x00b5
        L_0x015b:
            r9 = r0
            goto L_0x00b5
        L_0x015e:
            java.util.ArrayList r6 = X.AnonymousClass000.A13()
            java.lang.String r4 = "video"
            java.util.Iterator r4 = X.AnonymousClass8BW.A0r(r3, r4)
        L_0x0168:
            boolean r3 = r4.hasNext()
            if (r3 == 0) goto L_0x017f
            X.1ca r3 = X.C17880vN.A0a(r4)
            X.C18070vi.A0b(r3)
            X.773 r3 = X.AnonymousClass9PT.A00(r3)
            if (r3 == 0) goto L_0x0168
            r6.add(r3)
            goto L_0x0168
        L_0x017f:
            X.ADn r4 = A01(r13)
            java.lang.String r3 = "COUNTRY_ORIGIN_EXEMPT"
            boolean r3 = r3.equals(r7)
            if (r3 == 0) goto L_0x0192
            java.lang.String r3 = "N/A"
            X.ADn r4 = new X.ADn
            r4.<init>(r0, r3, r0)
        L_0x0192:
            if (r12 == 0) goto L_0x0208
            java.lang.String r0 = r12.A0M()
            if (r0 == 0) goto L_0x0208
            long r33 = java.lang.Long.parseLong(r0)
        L_0x019e:
            r5 = 0
            if (r2 == 0) goto L_0x021b
            java.lang.String r0 = "status"
            X.1ca r0 = r2.A0K(r0)
            java.lang.String r3 = "can_appeal"
            X.1ca r11 = r2.A0K(r3)
            java.lang.String r3 = "reject_reason"
            X.1ca r7 = r2.A0K(r3)
            java.lang.String r3 = "commerce_url"
            X.1ca r2 = r2.A0K(r3)
            java.lang.String r3 = X.AnonymousClass8BU.A0o(r0)
            java.lang.String r16 = X.AnonymousClass8BU.A0o(r7)
            java.lang.String r17 = X.AnonymousClass8BU.A0o(r2)
            if (r11 == 0) goto L_0x01d3
            java.lang.String r2 = r11.A0M()
            boolean r2 = java.lang.Boolean.parseBoolean(r2)
            r20 = 1
            if (r2 != 0) goto L_0x01d5
        L_0x01d3:
            r20 = 0
        L_0x01d5:
            int r19 = X.AnonymousClass9PL.A00(r3)
            if (r0 == 0) goto L_0x0213
            java.lang.String r2 = "reasons"
            X.1ca r0 = r0.A0K(r2)
            r11 = 0
            if (r0 == 0) goto L_0x0212
            java.lang.String r2 = "product"
            java.util.List r0 = r0.A0R(r2)
            java.util.ArrayList r3 = X.C108965cb.A0t(r0)
            java.util.Iterator r7 = r0.iterator()
        L_0x01f2:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x020b
            X.1ca r2 = X.C17880vN.A0a(r7)
            java.lang.String r0 = "reason"
            java.lang.String r0 = r2.A0Q(r0, r5)
            if (r0 == 0) goto L_0x01f2
            r3.add(r0)
            goto L_0x01f2
        L_0x0208:
            r33 = 99
            goto L_0x019e
        L_0x020b:
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x0212
            r11 = r3
        L_0x0212:
            r5 = r11
        L_0x0213:
            X.AEJ r15 = new X.AEJ
            r18 = r5
            r15.<init>(r16, r17, r18, r19, r20)
            r5 = r15
        L_0x021b:
            r0 = r37
            X.AE6 r20 = r0.A04(r1, r10)
            r16 = 0
            r35 = 1
            X.AEv r0 = new X.AEv
            r15 = r0
            r17 = r4
            r18 = r5
            r19 = r9
            r21 = r1
            r30 = r8
            r31 = r6
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r35, r36)
            if (r14 == 0) goto L_0x0247
            java.lang.String r1 = r14.A0M()
            boolean r2 = java.lang.Boolean.parseBoolean(r1)
            X.8iN r1 = new X.8iN
            r1.<init>(r0, r2)
            return r1
        L_0x0247:
            return r0
        L_0x0248:
            java.lang.String r1 = "Connection/Product/missing required fields."
            com.whatsapp.util.Log.e((java.lang.String) r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A6T.A03(X.1ca):X.AEv");
    }

    /* JADX WARNING: type inference failed for: r8v9, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AE6 A04(X.A6S r14, X.C29621ca r15) {
        /*
            r13 = this;
            X.00H r0 = r13.A01
            java.lang.Object r6 = r0.get()
            X.9eJ r6 = (X.C186509eJ) r6
            if (r15 != 0) goto L_0x000c
            r0 = 0
            return r0
        L_0x000c:
            java.lang.String r0 = "properties"
            X.1ca r3 = r15.A0K(r0)
            java.lang.String r0 = "listing_details"
            X.1ca r1 = r15.A0K(r0)
            java.lang.String r0 = "types"
            X.1ca r2 = r15.A0K(r0)
            java.lang.String r0 = "availability"
            X.1ca r7 = r15.A0K(r0)
            X.00H r0 = r6.A03
            java.lang.Object r9 = r0.get()
            X.9wx r9 = (X.C197599wx) r9
            r5 = 0
            if (r2 == 0) goto L_0x00a7
            java.lang.String r0 = "type"
            java.util.List r0 = r2.A0R(r0)
            if (r0 == 0) goto L_0x00a7
            java.util.ArrayList r5 = X.AnonymousClass000.A13()
            java.util.Iterator r12 = r0.iterator()
        L_0x003f:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x00a7
            X.1ca r2 = X.C17880vN.A0a(r12)
            java.lang.String r0 = "name"
            java.lang.String r10 = X.AnonymousClass8BW.A0e(r2, r0)
            java.lang.String r0 = "options"
            X.1ca r2 = r2.A0K(r0)
            if (r2 == 0) goto L_0x009b
            java.lang.String r0 = "option"
            java.util.List r0 = r2.A0R(r0)
            if (r0 == 0) goto L_0x009b
            java.util.ArrayList r8 = X.AnonymousClass000.A13()
            java.util.Iterator r11 = r0.iterator()
        L_0x0067:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x009d
            X.1ca r2 = X.C17880vN.A0a(r11)
            java.lang.String r0 = "value"
            java.lang.String r4 = X.AnonymousClass8BW.A0e(r2, r0)
            java.lang.String r0 = "thumbnail_media"
            X.1ca r2 = r2.A0K(r0)
            if (r4 == 0) goto L_0x0067
            if (r2 != 0) goto L_0x008a
            X.8iQ r2 = new X.8iQ
            r2.<init>(r4)
        L_0x0086:
            r8.add(r2)
            goto L_0x0067
        L_0x008a:
            X.00H r0 = r9.A00
            r0.get()
            X.AEI r0 = X.C196519vC.A00(r2)
            if (r0 == 0) goto L_0x0067
            X.8iR r2 = new X.8iR
            r2.<init>(r0, r4)
            goto L_0x0086
        L_0x009b:
            X.0wS r8 = X.C18460wS.A00
        L_0x009d:
            X.ADA r0 = X.C197599wx.A00(r10, r8)
            if (r0 == 0) goto L_0x003f
            r5.add(r0)
            goto L_0x003f
        L_0x00a7:
            X.00H r0 = r6.A02
            r0.get()
            r4 = 0
            if (r3 == 0) goto L_0x00de
            java.lang.String r0 = "property"
            java.util.List r0 = r3.A0R(r0)
            if (r0 == 0) goto L_0x00de
            java.util.ArrayList r9 = X.AnonymousClass000.A13()
            java.util.Iterator r8 = r0.iterator()
        L_0x00bf:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x00dd
            X.1ca r3 = X.C17880vN.A0a(r8)
            java.lang.String r0 = "name"
            java.lang.String r2 = r3.A0Q(r0, r4)
            java.lang.String r0 = "value"
            java.lang.String r0 = r3.A0Q(r0, r4)
            if (r2 == 0) goto L_0x00bf
            if (r0 == 0) goto L_0x00bf
            X.AnonymousClass8BT.A1Q(r2, r0, r9)
            goto L_0x00bf
        L_0x00dd:
            r4 = r9
        L_0x00de:
            X.00H r0 = r6.A01
            r0.get()
            if (r1 != 0) goto L_0x0161
            r9 = 0
        L_0x00e6:
            X.00H r0 = r6.A00
            r0.get()
            r8 = 0
            if (r7 == 0) goto L_0x01c0
            java.lang.String r0 = "listing"
            X.1ca r1 = r7.A0K(r0)
            if (r1 == 0) goto L_0x01c0
            java.lang.String r0 = "options"
            java.util.List r0 = r1.A0R(r0)
            if (r0 == 0) goto L_0x01c0
            java.util.ArrayList r7 = X.AnonymousClass000.A13()
            java.util.Iterator r12 = r0.iterator()
        L_0x0106:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x01b5
            X.1ca r1 = X.C17880vN.A0a(r12)
            java.lang.String r0 = "is_available"
            X.1ca r0 = r1.A0K(r0)
            if (r0 == 0) goto L_0x015f
            java.lang.String r0 = r0.A0M()
            if (r0 == 0) goto L_0x015f
            boolean r10 = java.lang.Boolean.parseBoolean(r0)
        L_0x0122:
            java.lang.String r0 = "product_id"
            java.lang.String r6 = X.AnonymousClass8BW.A0e(r1, r0)
            java.lang.String r0 = "option"
            java.util.List r0 = r1.A0R(r0)
            java.util.ArrayList r3 = X.C108965cb.A0t(r0)
            java.util.Iterator r11 = r0.iterator()
        L_0x0136:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0154
            X.1ca r2 = X.C17880vN.A0a(r11)
            java.lang.String r0 = "name"
            java.lang.String r1 = r2.A0Q(r0, r8)
            java.lang.String r0 = "value"
            java.lang.String r0 = r2.A0Q(r0, r8)
            if (r1 == 0) goto L_0x0136
            if (r0 == 0) goto L_0x0136
            X.AnonymousClass8BT.A1Q(r1, r0, r3)
            goto L_0x0136
        L_0x0154:
            if (r6 == 0) goto L_0x0106
            X.ADo r0 = new X.ADo
            r0.<init>(r6, r3, r10)
            r7.add(r0)
            goto L_0x0106
        L_0x015f:
            r10 = 0
            goto L_0x0122
        L_0x0161:
            java.lang.String r0 = "description"
            X.1ca r0 = r1.A0K(r0)
            if (r0 == 0) goto L_0x0195
            java.lang.String r3 = r0.A0M()
        L_0x016d:
            java.lang.String r0 = "multi_price"
            X.1ca r0 = r1.A0K(r0)
            if (r0 == 0) goto L_0x0193
            java.lang.String r0 = r0.A0M()
            if (r0 == 0) goto L_0x0193
            java.lang.Boolean r0 = X.AnonymousClass8BU.A0g(r0)
        L_0x017f:
            boolean r2 = X.C72463Mc.A1Y(r0)
            r8 = 0
            java.lang.String r0 = "lowest_price"
            X.1ca r0 = r1.A0K(r0)
            if (r0 == 0) goto L_0x01ae
            java.lang.String r1 = r0.A0M()
            if (r1 == 0) goto L_0x01ae
            goto L_0x0197
        L_0x0193:
            r0 = 0
            goto L_0x017f
        L_0x0195:
            r3 = 0
            goto L_0x016d
        L_0x0197:
            X.1wr r0 = X.C182189Tk.A00     // Catch:{ NumberFormatException -> 0x01ae }
            boolean r0 = r0.A03(r1)     // Catch:{ NumberFormatException -> 0x01ae }
            if (r0 == 0) goto L_0x01ae
            java.math.BigDecimal r0 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x01ae }
            r0.<init>(r1)     // Catch:{ NumberFormatException -> 0x01ae }
            if (r14 == 0) goto L_0x01ae
            long r0 = r0.longValue()
            java.math.BigDecimal r8 = X.C197309wU.A00(r14, r0)
        L_0x01ae:
            X.ADp r9 = new X.ADp
            r9.<init>(r3, r8, r2)
            goto L_0x00e6
        L_0x01b5:
            boolean r0 = X.AnonymousClass000.A1a(r7)
            if (r0 == 0) goto L_0x01c0
            X.ADW r8 = new X.ADW
            r8.<init>(r7)
        L_0x01c0:
            X.AE6 r0 = new X.AE6
            r0.<init>(r8, r9, r5, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A6T.A04(X.A6S, X.1ca):X.AE6");
    }

    public A6T(AnonymousClass00H r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }

    public final void A05(C26911Ty r3, UserJid userJid, C29621ca r5) {
        String A02;
        C18070vi.A0i(r5, r3);
        String str = "product_catalog";
        if (this.A00 != 0) {
            str = "product_list";
        }
        C29621ca A0K = r5.A0K(str);
        if (A0K != null && (A02 = C29621ca.A02(A0K, "cart_enabled")) != null) {
            r3.A0I(userJid, Boolean.parseBoolean(A02));
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public A6T(AnonymousClass00H r2) {
        this(r2, 0);
        C18070vi.A0d(r2, 1);
    }
}
