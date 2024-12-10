package X;

import com.whatsapp.util.Log;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.ATu  reason: case insensitive filesystem */
public abstract class C20662ATu implements B86 {
    public static final C27354DcQ A00(B86 b86, JSONArray jSONArray, long j) {
        C18070vi.A0d(jSONArray, 1);
        C27354DcQ A01 = AnonymousClass1ZT.A01();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                AnonymousClass8BW.A1A(b86, A01, optJSONObject, j);
            }
        }
        return AnonymousClass1ZT.A02(A01);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001d, code lost:
        if (r2.length() == 0) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C193429q5 A01(org.json.JSONObject r4) {
        /*
            r3 = this;
            java.lang.String r0 = "paging"
            java.lang.String r1 = "after"
            r2 = 0
            org.json.JSONObject r0 = r4.optJSONObject(r0)
            if (r0 != 0) goto L_0x0012
            r0 = 0
            X.9q5 r1 = new X.9q5
            r1.<init>(r2, r0)
            return r1
        L_0x0012:
            java.lang.String r2 = X.A3Q.A00(r1, r0)
            if (r2 == 0) goto L_0x001f
            int r1 = r2.length()
            r0 = 0
            if (r1 != 0) goto L_0x0020
        L_0x001f:
            r0 = 1
        L_0x0020:
            r0 = r0 ^ 1
            X.9q5 r1 = new X.9q5
            r1.<init>(r0, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20662ATu.A01(org.json.JSONObject):X.9q5");
    }

    /* JADX WARNING: type inference failed for: r9v2, types: [java.lang.Object, X.9O2] */
    /* JADX WARNING: type inference failed for: r0v20, types: [java.lang.Object, X.9O2] */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x02bb, code lost:
        if (r5 > 1) goto L_0x029b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0018, code lost:
        r2 = X.A3Q.A00("price", r1);
     */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x020c  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0212  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object A02(org.json.JSONObject r20, long r21) {
        /*
            r19 = this;
            r0 = r19
            boolean r2 = r0 instanceof X.C168278ib
            r1 = r20
            if (r2 == 0) goto L_0x005f
            X.8ib r0 = (X.C168278ib) r0
            r4 = 0
            java.lang.String[] r2 = X.C17880vN.A1Y()
            java.lang.String r3 = "price"
            boolean r2 = X.A3Q.A01(r3, r1, r2, r4)
            r7 = 0
            if (r2 == 0) goto L_0x06e7
            java.lang.String r2 = X.A3Q.A00(r3, r1)
            X.A6S r6 = r0.A00
            java.math.BigDecimal r5 = r0.A03(r6, r2)
            if (r5 == 0) goto L_0x06e7
            java.lang.String r3 = "start_date"
            boolean r2 = r1.has(r3)
            if (r2 == 0) goto L_0x003a
            java.lang.String r3 = X.A3Q.A00(r3, r1)
            r4 = 0
            if (r3 == 0) goto L_0x0040
            java.text.DateFormat r2 = r0.A01     // Catch:{ Exception -> 0x003c }
            java.util.Date r4 = r2.parse(r3)     // Catch:{ Exception -> 0x003c }
            goto L_0x0040
        L_0x003a:
            r4 = r7
            goto L_0x0040
        L_0x003c:
            r2 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r2)
        L_0x0040:
            java.lang.String r3 = "end_date"
            boolean r2 = r1.has(r3)
            if (r2 == 0) goto L_0x0059
            java.lang.String r1 = X.A3Q.A00(r3, r1)
            if (r1 == 0) goto L_0x0059
            java.text.DateFormat r0 = r0.A01     // Catch:{ Exception -> 0x0055 }
            java.util.Date r7 = r0.parse(r1)     // Catch:{ Exception -> 0x0055 }
            goto L_0x0059
        L_0x0055:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
        L_0x0059:
            X.AE5 r0 = new X.AE5
            r0.<init>(r6, r5, r4, r7)
            return r0
        L_0x005f:
            boolean r4 = r0 instanceof X.C168288ic
            r2 = r21
            if (r4 == 0) goto L_0x0102
            X.8ic r0 = (X.C168288ic) r0
            r4 = 0
            java.lang.String[] r8 = X.AnonymousClass8BR.A1b()
            java.lang.String r7 = "promotion_id"
            r8[r4] = r7
            r4 = 1
            java.lang.String r6 = "name"
            r8[r4] = r6
            r4 = 2
            java.lang.String r5 = "discount"
            boolean r4 = X.A3Q.A01(r5, r1, r8, r4)
            r8 = 0
            if (r4 == 0) goto L_0x0678
            java.lang.String r5 = r1.getString(r5)
            X.00H r4 = r0.A01
            java.lang.Object r4 = r4.get()
            X.9iP r4 = (X.C189039iP) r4
            X.C18070vi.A0b(r5)
            X.1D6 r4 = r4.A00(r5)
            java.lang.Object r11 = r4.first
            java.lang.String r11 = (java.lang.String) r11
            int r16 = X.C108955ca.A09(r4)
            java.lang.String r9 = X.C18070vi.A0J(r7, r1)
            java.lang.String r10 = X.C18070vi.A0J(r6, r1)
            java.lang.String r4 = "minimum_cart_price"
            long r17 = r1.optLong(r4)
            java.lang.String r4 = "start_date"
            java.lang.String r5 = X.A3Q.A00(r4, r1)
            r14 = 0
            if (r5 == 0) goto L_0x00bc
            java.text.DateFormat r4 = r0.A02     // Catch:{ ParseException -> 0x00b8 }
            java.util.Date r14 = r4.parse(r5)     // Catch:{ ParseException -> 0x00b8 }
            goto L_0x00bc
        L_0x00b8:
            r4 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r4)
        L_0x00bc:
            java.lang.String r4 = "end_date"
            java.lang.String r5 = X.A3Q.A00(r4, r1)
            r15 = 0
            if (r5 == 0) goto L_0x00d0
            java.text.DateFormat r4 = r0.A02     // Catch:{ ParseException -> 0x00cc }
            java.util.Date r15 = r4.parse(r5)     // Catch:{ ParseException -> 0x00cc }
            goto L_0x00d0
        L_0x00cc:
            r4 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r4)
        L_0x00d0:
            java.lang.String r4 = "description"
            java.lang.String r12 = X.A3Q.A00(r4, r1)
            java.lang.String r13 = ""
            if (r12 != 0) goto L_0x00db
            r12 = r13
        L_0x00db:
            java.lang.String r4 = "more_info"
            java.lang.String r4 = X.A3Q.A00(r4, r1)
            if (r4 == 0) goto L_0x00e4
            r13 = r4
        L_0x00e4:
            java.lang.String r4 = "media"
            org.json.JSONObject r4 = r1.optJSONObject(r4)
            if (r4 == 0) goto L_0x00fc
            java.lang.String r1 = "image"
            org.json.JSONObject r1 = r4.optJSONObject(r1)
            if (r1 == 0) goto L_0x00fc
            X.B86 r0 = r0.A00
            java.lang.Object r8 = r0.BFs(r1, r2)
            X.AEI r8 = (X.AEI) r8
        L_0x00fc:
            X.9tj r7 = new X.9tj
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return r7
        L_0x0102:
            boolean r4 = r0 instanceof X.AnonymousClass2C7
            if (r4 == 0) goto L_0x0130
            r3 = 0
            java.lang.String[] r0 = X.C17880vN.A1Y()
            java.lang.String r2 = "id"
            boolean r0 = X.A3Q.A01(r2, r1, r0, r3)
            if (r0 == 0) goto L_0x03b6
            java.lang.String r3 = X.A3Q.A00(r2, r1)
            if (r3 == 0) goto L_0x012b
            java.lang.String r0 = "thumbnail_url"
            java.lang.String r2 = X.A3Q.A00(r0, r1)
            java.lang.String r0 = "original_video_url"
            java.lang.String r1 = X.A3Q.A00(r0, r1)
            X.773 r0 = new X.773
            r0.<init>(r3, r2, r1)
            return r0
        L_0x012b:
            java.lang.IllegalStateException r0 = X.C17880vN.A0g()
            throw r0
        L_0x0130:
            boolean r4 = r0 instanceof X.C168238iX
            if (r4 == 0) goto L_0x0226
            X.8iX r0 = (X.C168238iX) r0
            r4 = 0
            java.lang.String[] r6 = X.C17880vN.A1Z()
            java.lang.String r5 = "name"
            r6[r4] = r5
            r4 = 1
            java.lang.String r7 = "options"
            boolean r4 = X.A3Q.A01(r7, r1, r6, r4)
            if (r4 == 0) goto L_0x03b6
            java.lang.String r5 = X.A3Q.A00(r5, r1)
            if (r5 == 0) goto L_0x0221
            java.util.ArrayList r6 = X.AnonymousClass000.A13()
            java.util.ArrayList r4 = X.AnonymousClass000.A13()
            org.json.JSONArray r10 = r1.optJSONArray(r7)
            if (r10 == 0) goto L_0x0200
            int r9 = r10.length()
            r8 = 0
        L_0x0161:
            if (r8 >= r9) goto L_0x01e1
            org.json.JSONObject r7 = r10.optJSONObject(r8)
            if (r7 == 0) goto L_0x019b
            java.lang.String r1 = "value"
            java.lang.String r11 = X.A3Q.A00(r1, r7)
            if (r11 == 0) goto L_0x01dc
            java.lang.String r1 = "thumbnail_media"
            org.json.JSONObject r7 = r7.optJSONObject(r1)
            if (r7 == 0) goto L_0x01cf
            X.B86 r1 = r0.A00
            java.lang.Object r1 = r1.BFs(r7, r2)
            X.AEI r1 = (X.AEI) r1
            if (r1 == 0) goto L_0x01cf
            X.8iR r7 = new X.8iR
            r7.<init>(r1, r11)
        L_0x0188:
            boolean r1 = r6.isEmpty()
            if (r1 == 0) goto L_0x019e
            boolean r1 = r4.isEmpty()
            if (r1 == 0) goto L_0x019e
            boolean r1 = r7 instanceof X.C168178iR
            if (r1 == 0) goto L_0x019e
        L_0x0198:
            r6.add(r7)
        L_0x019b:
            int r8 = r8 + 1
            goto L_0x0161
        L_0x019e:
            boolean r1 = r6.isEmpty()
            if (r1 == 0) goto L_0x01b2
            boolean r1 = r4.isEmpty()
            if (r1 == 0) goto L_0x01b2
            boolean r1 = r7 instanceof X.C168168iQ
            if (r1 == 0) goto L_0x01b2
        L_0x01ae:
            r4.add(r7)
            goto L_0x019b
        L_0x01b2:
            boolean r1 = X.C17880vN.A1X(r6)
            if (r1 == 0) goto L_0x01bc
            boolean r1 = r7 instanceof X.C168168iQ
            if (r1 != 0) goto L_0x01d5
        L_0x01bc:
            boolean r1 = X.C17880vN.A1X(r4)
            if (r1 == 0) goto L_0x01c6
            boolean r1 = r7 instanceof X.C168178iR
            if (r1 != 0) goto L_0x01d5
        L_0x01c6:
            boolean r1 = r7 instanceof X.C168178iR
            if (r1 != 0) goto L_0x0198
            boolean r1 = r7 instanceof X.C168168iQ
            if (r1 == 0) goto L_0x019b
            goto L_0x01ae
        L_0x01cf:
            X.8iQ r7 = new X.8iQ
            r7.<init>(r11)
            goto L_0x0188
        L_0x01d5:
            java.lang.String r0 = "Either all options should contain ProductImage or none of them should contain it"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        L_0x01dc:
            java.lang.IllegalStateException r0 = X.C17880vN.A0g()
            throw r0
        L_0x01e1:
            boolean r0 = X.C17880vN.A1X(r6)
            if (r0 == 0) goto L_0x01f2
            boolean r0 = X.C17880vN.A1X(r4)
            if (r0 == 0) goto L_0x01f2
            java.lang.String r0 = "getOptions: both result candidates or not empty. Preceding logic should prevent such cases!"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x01f2:
            boolean r0 = X.C17880vN.A1X(r6)
            if (r0 != 0) goto L_0x0204
            boolean r0 = X.C17880vN.A1X(r4)
            if (r0 == 0) goto L_0x0200
            r6 = r4
            goto L_0x0204
        L_0x0200:
            java.util.ArrayList r6 = X.AnonymousClass000.A13()
        L_0x0204:
            java.lang.Object r1 = X.C29431cG.A0b(r6)
            boolean r0 = r1 instanceof X.C168168iQ
            if (r0 == 0) goto L_0x0212
            X.8iO r0 = new X.8iO
            r0.<init>(r5, r6)
            return r0
        L_0x0212:
            boolean r0 = r1 instanceof X.C168178iR
            if (r0 == 0) goto L_0x021c
            X.8iP r0 = new X.8iP
            r0.<init>(r5, r6)
            return r0
        L_0x021c:
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        L_0x0221:
            java.lang.IllegalStateException r0 = X.C17880vN.A0g()
            throw r0
        L_0x0226:
            boolean r4 = r0 instanceof X.C168228iW
            if (r4 == 0) goto L_0x024b
            X.8iW r0 = (X.C168228iW) r0
            r3 = 0
            java.lang.String r2 = "description"
            java.lang.String r4 = X.A3Q.A00(r2, r1)
            java.lang.String r2 = "multi_price"
            boolean r3 = r1.optBoolean(r2, r3)
            java.lang.String r2 = "lowest_price"
            java.lang.String r2 = X.A3Q.A00(r2, r1)
            X.A6S r1 = r0.A00
            java.math.BigDecimal r1 = r0.A03(r1, r2)
            X.ADp r0 = new X.ADp
            r0.<init>(r4, r1, r3)
            return r0
        L_0x024b:
            boolean r4 = r0 instanceof X.C168298id
            if (r4 == 0) goto L_0x0335
            X.8id r0 = (X.C168298id) r0
            r5 = 0
            r9 = 1
            java.lang.String[] r4 = new java.lang.String[r9]
            java.lang.String r8 = "variant_properties"
            boolean r4 = X.A3Q.A01(r8, r1, r4, r5)
            r12 = 0
            if (r4 == 0) goto L_0x0572
            java.util.ArrayList r11 = X.AnonymousClass000.A13()
            java.lang.String r4 = "types"
            org.json.JSONArray r10 = r1.optJSONArray(r4)
            if (r10 == 0) goto L_0x027f
            int r7 = r10.length()
            r6 = 0
        L_0x026f:
            if (r6 >= r7) goto L_0x027f
            org.json.JSONObject r5 = r10.optJSONObject(r6)
            if (r5 == 0) goto L_0x027c
            X.B86 r4 = r0.A03
            X.AnonymousClass8BW.A1A(r4, r11, r5, r2)
        L_0x027c:
            int r6 = r6 + 1
            goto L_0x026f
        L_0x027f:
            X.0ve r6 = r0.A00
            r5 = 8798(0x225e, float:1.2329E-41)
            X.0vf r4 = X.C18040vf.A02
            boolean r7 = X.C18020vd.A05(r4, r6, r5)
            int r5 = r11.size()
            r4 = 2
            if (r5 > r4) goto L_0x029b
            boolean r4 = r11 instanceof java.util.Collection
            if (r4 == 0) goto L_0x02a0
            boolean r4 = r11.isEmpty()
            if (r4 == 0) goto L_0x02a0
        L_0x029a:
            r9 = 0
        L_0x029b:
            if (r7 != 0) goto L_0x02be
            if (r9 == 0) goto L_0x02be
            return r12
        L_0x02a0:
            java.util.Iterator r6 = r11.iterator()
            r5 = 0
        L_0x02a5:
            boolean r4 = r6.hasNext()
            if (r4 == 0) goto L_0x02bb
            java.lang.Object r4 = r6.next()
            boolean r4 = r4 instanceof X.C168158iP
            if (r4 == 0) goto L_0x02a5
            int r5 = r5 + 1
            if (r5 >= 0) goto L_0x02a5
            X.AnonymousClass1ZU.A0A()
            throw r12
        L_0x02bb:
            if (r5 <= r9) goto L_0x029a
            goto L_0x029b
        L_0x02be:
            java.util.ArrayList r10 = X.AnonymousClass000.A13()
            org.json.JSONArray r12 = r1.optJSONArray(r8)
            if (r12 == 0) goto L_0x02f7
            int r9 = r12.length()
            r8 = 0
        L_0x02cd:
            if (r8 >= r9) goto L_0x02f7
            org.json.JSONObject r7 = r12.optJSONObject(r8)
            if (r7 == 0) goto L_0x02ea
            java.lang.String r4 = "name"
            java.lang.String r6 = X.A3Q.A00(r4, r7)
            java.lang.String r5 = "Required value was null."
            if (r6 == 0) goto L_0x02f2
            java.lang.String r4 = "value"
            java.lang.String r4 = X.A3Q.A00(r4, r7)
            if (r4 == 0) goto L_0x02ed
            X.AnonymousClass8BT.A1Q(r6, r4, r10)
        L_0x02ea:
            int r8 = r8 + 1
            goto L_0x02cd
        L_0x02ed:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r5)
            throw r0
        L_0x02f2:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r5)
            throw r0
        L_0x02f7:
            java.lang.String[] r5 = X.C17880vN.A1Y()
            r4 = 0
            java.lang.String r6 = "listing_details"
            boolean r5 = X.A3Q.A01(r6, r1, r5, r4)
            r4 = 0
            if (r5 == 0) goto L_0x0313
            org.json.JSONObject r5 = r1.optJSONObject(r6)
            if (r5 == 0) goto L_0x0313
            X.B86 r4 = r0.A02
            java.lang.Object r4 = r4.BFs(r5, r2)
            X.ADp r4 = (X.C20257ADp) r4
        L_0x0313:
            java.lang.String[] r6 = X.C17880vN.A1Y()
            r5 = 0
            java.lang.String r7 = "availability"
            boolean r6 = X.A3Q.A01(r7, r1, r6, r5)
            r5 = 0
            if (r6 == 0) goto L_0x032f
            org.json.JSONObject r1 = r1.optJSONObject(r7)
            if (r1 == 0) goto L_0x032f
            X.B86 r0 = r0.A01
            java.lang.Object r5 = r0.BFs(r1, r2)
            X.ADW r5 = (X.ADW) r5
        L_0x032f:
            X.AE6 r12 = new X.AE6
            r12.<init>(r5, r4, r11, r10)
            return r12
        L_0x0335:
            boolean r4 = r0 instanceof X.C168188iS
            if (r4 == 0) goto L_0x03b8
            r3 = 0
            java.lang.String[] r0 = X.C17880vN.A1Y()
            java.lang.String r2 = "listing"
            boolean r0 = X.A3Q.A01(r2, r1, r0, r3)
            if (r0 == 0) goto L_0x03b6
            java.util.ArrayList r11 = X.AnonymousClass000.A13()
            org.json.JSONArray r12 = r1.optJSONArray(r2)
            if (r12 == 0) goto L_0x03b0
            int r10 = r12.length()
            r9 = 0
        L_0x0355:
            if (r9 >= r10) goto L_0x03b0
            org.json.JSONObject r1 = r12.optJSONObject(r9)
            java.lang.String r0 = "is_available"
            boolean r8 = r1.optBoolean(r0)
            java.lang.String r0 = "product_id"
            java.lang.String r7 = r1.optString(r0)
            java.util.ArrayList r6 = X.AnonymousClass000.A13()
            java.lang.String r0 = "options"
            org.json.JSONArray r13 = r1.optJSONArray(r0)
            if (r13 == 0) goto L_0x0398
            int r5 = r13.length()
            r4 = 0
        L_0x0378:
            if (r4 >= r5) goto L_0x0398
            org.json.JSONObject r3 = r13.optJSONObject(r4)
            if (r3 == 0) goto L_0x0395
            java.lang.String r0 = "name"
            java.lang.String r2 = X.A3Q.A00(r0, r3)
            java.lang.String r1 = "Required value was null."
            if (r2 == 0) goto L_0x03ab
            java.lang.String r0 = "value"
            java.lang.String r0 = X.A3Q.A00(r0, r3)
            if (r0 == 0) goto L_0x03a6
            X.AnonymousClass8BT.A1Q(r2, r0, r6)
        L_0x0395:
            int r4 = r4 + 1
            goto L_0x0378
        L_0x0398:
            X.C18070vi.A0b(r7)
            X.ADo r0 = new X.ADo
            r0.<init>(r7, r6, r8)
            r11.add(r0)
            int r9 = r9 + 1
            goto L_0x0355
        L_0x03a6:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r1)
            throw r0
        L_0x03ab:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r1)
            throw r0
        L_0x03b0:
            X.ADW r0 = new X.ADW
            r0.<init>(r11)
            return r0
        L_0x03b6:
            r0 = 0
            return r0
        L_0x03b8:
            boolean r4 = r0 instanceof X.C168218iV
            if (r4 == 0) goto L_0x03f5
            X.8iV r0 = (X.C168218iV) r0
            r2 = 0
            java.lang.String[] r5 = X.C17880vN.A1Z()
            java.lang.String r4 = "status"
            r5[r2] = r4
            r2 = 1
            java.lang.String r3 = "can_appeal"
            boolean r2 = X.A3Q.A01(r3, r1, r5, r2)
            if (r2 == 0) goto L_0x06a6
            X.00H r0 = r0.A00
            r0.get()
            java.lang.String r0 = X.A3Q.A00(r4, r1)
            int r6 = X.AnonymousClass9PL.A00(r0)
            boolean r7 = r1.optBoolean(r3)
            X.0wS r5 = X.C18460wS.A00
            java.lang.String r0 = "reject_reason"
            java.lang.String r3 = X.A3Q.A00(r0, r1)
            java.lang.String r0 = "commerce_url"
            java.lang.String r4 = X.A3Q.A00(r0, r1)
            X.AEJ r2 = new X.AEJ
            r2.<init>(r3, r4, r5, r6, r7)
        L_0x03f4:
            return r2
        L_0x03f5:
            boolean r4 = r0 instanceof X.AnonymousClass2C6
            if (r4 == 0) goto L_0x043e
            r2 = 0
            r6 = 1
            java.lang.String[] r0 = new java.lang.String[r6]
            java.lang.String r5 = "id"
            boolean r0 = X.A3Q.A01(r5, r1, r0, r2)
            r12 = 0
            if (r0 == 0) goto L_0x0572
            java.lang.String r0 = "original_dimensions"
            org.json.JSONObject r4 = r1.optJSONObject(r0)
            if (r4 == 0) goto L_0x0572
            java.lang.String[] r0 = X.C17880vN.A1Z()
            java.lang.String r3 = "height"
            r0[r2] = r3
            java.lang.String r2 = "width"
            boolean r0 = X.A3Q.A01(r2, r4, r0, r6)
            if (r0 == 0) goto L_0x0572
            java.lang.String r13 = X.A3Q.A00(r5, r1)
            if (r13 == 0) goto L_0x056d
            java.lang.String r0 = "original_image_url"
            java.lang.String r14 = X.A3Q.A00(r0, r1)
            java.lang.String r0 = "request_image_url"
            java.lang.String r15 = X.A3Q.A00(r0, r1)
            int r17 = r4.optInt(r3)
            int r16 = r4.optInt(r2)
            X.AEI r12 = new X.AEI
            r12.<init>(r13, r14, r15, r16, r17)
            return r12
        L_0x043e:
            boolean r4 = r0 instanceof X.AnonymousClass2CA
            if (r4 == 0) goto L_0x04bc
            X.2CA r0 = (X.AnonymousClass2CA) r0
            r3 = 0
            java.lang.String r2 = "xwa_product_catalog_get_verify_postcode"
            org.json.JSONObject r2 = r1.getJSONObject(r2)
            java.lang.String r1 = "postcode_verification_result"
            org.json.JSONObject r4 = r2.getJSONObject(r1)
            X.C18070vi.A0b(r4)
            java.lang.String r2 = "encrypted_location_name"
            boolean r1 = X.C18070vi.A15(r4, r2)
            java.lang.String r2 = X.A6n.A03(r2, r4, r1)
            if (r2 == 0) goto L_0x04b8
            X.00H r0 = r0.A00
            java.lang.Object r1 = r0.get()
            X.A4Q r1 = (X.A4Q) r1
            byte[] r0 = android.util.Base64.decode(r2, r3)
            X.C18070vi.A0X(r0)
            java.lang.String r3 = r1.A02(r0)
            if (r3 == 0) goto L_0x04b9
            java.lang.String r0 = "result_code"
            java.lang.String r0 = r4.getString(r0)
            java.lang.String r2 = X.C108975cc.A0e(r0)
            int r1 = r2.hashCode()
            r0 = -1608431259(0xffffffffa0214965, float:-1.3661515E-19)
            if (r1 == r0) goto L_0x04ad
            r0 = -396894706(0xffffffffe857de0e, float:-4.07762E24)
            if (r1 == r0) goto L_0x04a2
            r0 = 1292230771(0x4d05e073, float:1.40379952E8)
            if (r1 != r0) goto L_0x0573
            java.lang.String r0 = "RESULT_CODE_SUCCESS"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0573
            java.lang.String r1 = "success"
        L_0x049c:
            X.9a0 r0 = new X.9a0
            r0.<init>(r1, r3)
            return r0
        L_0x04a2:
            java.lang.String r0 = "RESULT_CODE_UNSERVICEABLE_LOCATION"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0573
            java.lang.String r1 = "unserviceable_location"
            goto L_0x049c
        L_0x04ad:
            java.lang.String r0 = "RESULT_CODE_INVALID_POSTCODE"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0573
            java.lang.String r1 = "invalid_postcode"
            goto L_0x049c
        L_0x04b8:
            r3 = 0
        L_0x04b9:
            java.lang.String r1 = "error"
            goto L_0x049c
        L_0x04bc:
            boolean r4 = r0 instanceof X.C168268ia
            if (r4 == 0) goto L_0x04fe
            X.8ia r0 = (X.C168268ia) r0
            r5 = 8771524179553647(0x1f29a79edc6d6f, double:4.333708758783283E-308)
            int r4 = (r21 > r5 ? 1 : (r21 == r5 ? 0 : -1))
            if (r4 != 0) goto L_0x04fb
            java.lang.String r4 = "xfb_whatsapp_catalog_collection"
        L_0x04cd:
            org.json.JSONObject r6 = r1.optJSONObject(r4)
            r5 = 0
            if (r6 == 0) goto L_0x04fa
            java.lang.String r1 = "collection"
            org.json.JSONObject r4 = r6.optJSONObject(r1)
            if (r4 == 0) goto L_0x04fa
            X.B86 r1 = r0.A00
            java.lang.Object r2 = r1.BFs(r4, r2)
            X.9sq r2 = (X.C195129sq) r2
            if (r2 == 0) goto L_0x04fa
            X.9q5 r1 = r0.A01(r6)
            X.AN4 r5 = new X.AN4
            r5.<init>(r1, r2)
            X.00H r0 = r0.A01
            java.lang.Object r0 = r0.get()
            X.9k3 r0 = (X.C189909k3) r0
            r0.A00(r5, r4)
        L_0x04fa:
            return r5
        L_0x04fb:
            java.lang.String r4 = "xwa_product_catalog_get_single_collection"
            goto L_0x04cd
        L_0x04fe:
            boolean r4 = r0 instanceof X.AnonymousClass2C9
            if (r4 == 0) goto L_0x053b
            X.2C9 r0 = (X.AnonymousClass2C9) r0
            r5 = 8364482943632913(0x1db773f295c611, double:4.132603667674086E-308)
            int r4 = (r21 > r5 ? 1 : (r21 == r5 ? 0 : -1))
            if (r4 == 0) goto L_0x0538
            java.lang.String r4 = "xwa_product_catalog_get_collections"
        L_0x050f:
            org.json.JSONObject r7 = r1.optJSONObject(r4)
            r6 = 0
            if (r7 == 0) goto L_0x0537
            java.lang.String r1 = "catalog_type"
            java.lang.String r1 = r7.optString(r1)
            X.9Hv r5 = X.AnonymousClass9PK.A00(r1)
            java.lang.String r1 = "collections"
            org.json.JSONArray r4 = r7.optJSONArray(r1)
            if (r4 == 0) goto L_0x0537
            X.B86 r1 = r0.A00
            X.DcQ r1 = A00(r1, r4, r2)
            X.9q5 r0 = r0.A01(r7)
            X.9rN r6 = new X.9rN
            r6.<init>(r0, r5, r1)
        L_0x0537:
            return r6
        L_0x0538:
            java.lang.String r4 = "xfb_whatsapp_catalog_collections"
            goto L_0x050f
        L_0x053b:
            boolean r4 = r0 instanceof X.C168258iZ
            if (r4 == 0) goto L_0x057a
            X.8iZ r0 = (X.C168258iZ) r0
            java.lang.String r4 = "xwa_product_catalog_get_categories"
            org.json.JSONObject r5 = r1.optJSONObject(r4)
            if (r5 == 0) goto L_0x056a
            java.lang.String r1 = "categories"
            org.json.JSONArray r4 = r5.optJSONArray(r1)
            if (r4 == 0) goto L_0x056a
            X.ATu r1 = r0.A00
            X.DcQ r1 = A00(r1, r4, r2)
        L_0x0557:
            X.AN7 r2 = new X.AN7
            r2.<init>(r1)
            if (r5 == 0) goto L_0x03f4
            X.00H r0 = r0.A01
            java.lang.Object r0 = r0.get()
            X.9k3 r0 = (X.C189909k3) r0
            r0.A00(r2, r5)
            return r2
        L_0x056a:
            X.0wS r1 = X.C18460wS.A00
            goto L_0x0557
        L_0x056d:
            java.lang.IllegalStateException r0 = X.C17880vN.A0g()
            throw r0
        L_0x0572:
            return r12
        L_0x0573:
            java.lang.String r0 = "Unknown result code value"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        L_0x057a:
            boolean r4 = r0 instanceof X.AnonymousClass2C8
            if (r4 == 0) goto L_0x05a6
            X.2C8 r0 = (X.AnonymousClass2C8) r0
            r6 = 0
            java.lang.String[] r4 = X.C17880vN.A1Y()
            java.lang.String r5 = "xwa_product_catalog_get_promotions"
            boolean r4 = X.A3Q.A01(r5, r1, r4, r6)
            if (r4 == 0) goto L_0x06a6
            org.json.JSONObject r4 = r1.getJSONObject(r5)
            java.lang.String r1 = "promotions"
            org.json.JSONArray r1 = r4.getJSONArray(r1)
            X.B86 r0 = r0.A00
            X.C18070vi.A0b(r1)
            X.DcQ r0 = A00(r0, r1, r2)
            X.9pN r2 = new X.9pN
            r2.<init>(r0)
            return r2
        L_0x05a6:
            boolean r4 = r0 instanceof X.AnonymousClass2C5
            if (r4 == 0) goto L_0x05fc
            java.lang.String r0 = "status"
            java.lang.String r2 = X.A3Q.A00(r0, r1)
            if (r2 == 0) goto L_0x05fa
            boolean r0 = X.AnonymousClass1YF.A0T(r2)
            if (r0 != 0) goto L_0x05fa
            java.lang.String r0 = "approved"
            r4 = 1
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 != 0) goto L_0x05fa
            java.lang.String r0 = "status_approved"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 != 0) goto L_0x05fa
            java.lang.String r0 = "rejected"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 != 0) goto L_0x05d9
            java.lang.String r0 = "status_rejected"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L_0x05da
        L_0x05d9:
            r4 = 2
        L_0x05da:
            java.lang.String r0 = "can_appeal"
            boolean r3 = r1.optBoolean(r0)
            java.lang.String r0 = "reject_reason"
            java.lang.String r2 = X.A3Q.A00(r0, r1)
            java.lang.String r0 = "commerce_url"
            java.lang.String r1 = X.A3Q.A00(r0, r1)
            X.9O2 r0 = new X.9O2
            r0.<init>()
            r0.A00 = r4
            r0.A03 = r3
            r0.A02 = r2
            r0.A01 = r1
            return r0
        L_0x05fa:
            r4 = 0
            goto L_0x05da
        L_0x05fc:
            boolean r4 = r0 instanceof X.C168248iY
            if (r4 == 0) goto L_0x0679
            X.8iY r0 = (X.C168248iY) r0
            r4 = 0
            java.lang.String[] r7 = X.C17880vN.A1Z()
            java.lang.String r6 = "id"
            r7[r4] = r6
            r4 = 1
            java.lang.String r5 = "name"
            boolean r4 = X.A3Q.A01(r5, r1, r7, r4)
            r8 = 0
            if (r4 == 0) goto L_0x0678
            java.lang.String r11 = X.A3Q.A00(r6, r1)
            if (r11 == 0) goto L_0x0678
            java.lang.String r7 = X.A3Q.A00(r5, r1)
            if (r7 == 0) goto L_0x0678
            java.lang.String[] r5 = X.C17880vN.A1Y()
            r4 = 0
            java.lang.String r6 = " "
            r5[r4] = r6
            java.util.List r5 = X.AnonymousClass1YF.A0S(r7, r5, r4)
            X.B1x r4 = X.C22294B1x.A00
            java.lang.String r12 = X.C29431cG.A0h(r6, r5, r4)
            java.lang.String r4 = "status_info"
            org.json.JSONObject r5 = r1.optJSONObject(r4)
            if (r5 == 0) goto L_0x0647
            X.B86 r4 = r0.A01
            java.lang.Object r9 = r4.BFs(r5, r2)
            X.9O2 r9 = (X.AnonymousClass9O2) r9
            if (r9 != 0) goto L_0x0655
            return r8
        L_0x0647:
            r4 = 0
            X.9O2 r9 = new X.9O2
            r9.<init>()
            r9.A00 = r4
            r9.A03 = r4
            r9.A02 = r8
            r9.A01 = r8
        L_0x0655:
            java.lang.String r4 = "products"
            org.json.JSONArray r1 = r1.optJSONArray(r4)
            if (r1 == 0) goto L_0x0675
            X.B86 r0 = r0.A00
            X.DcQ r0 = A00(r0, r1, r2)
        L_0x0663:
            java.util.ArrayList r13 = X.C29431cG.A0m(r0)
            int r0 = r13.size()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)
            X.9sq r8 = new X.9sq
            r8.<init>(r9, r10, r11, r12, r13)
            return r8
        L_0x0675:
            X.0wS r0 = X.C18460wS.A00
            goto L_0x0663
        L_0x0678:
            return r8
        L_0x0679:
            boolean r4 = r0 instanceof X.C168208iU
            if (r4 == 0) goto L_0x06a8
            X.8iU r0 = (X.C168208iU) r0
            java.lang.String r4 = "category"
            org.json.JSONObject r4 = r1.optJSONObject(r4)
            if (r4 == 0) goto L_0x06a6
            X.ATu r5 = r0.A00
            java.lang.Object r4 = r5.BFs(r4, r2)
            X.9sr r4 = (X.C195139sr) r4
            if (r4 == 0) goto L_0x06a6
            java.lang.String r0 = "sub_categories"
            org.json.JSONArray r0 = r1.optJSONArray(r0)
            if (r0 == 0) goto L_0x06a3
            X.DcQ r0 = A00(r5, r0, r2)
        L_0x069d:
            X.9qE r2 = new X.9qE
            r2.<init>(r4, r0)
            return r2
        L_0x06a3:
            X.0wS r0 = X.C18460wS.A00
            goto L_0x069d
        L_0x06a6:
            r2 = 0
            return r2
        L_0x06a8:
            X.8iT r0 = (X.C168198iT) r0
            java.lang.String r4 = "category_id"
            java.lang.String r9 = X.A3Q.A00(r4, r1)
            java.lang.String r4 = "name"
            java.lang.String r10 = X.A3Q.A00(r4, r1)
            java.lang.String r4 = "media"
            org.json.JSONObject r5 = r1.optJSONObject(r4)
            r7 = 0
            if (r5 == 0) goto L_0x06e5
            java.lang.String r4 = "image"
            org.json.JSONObject r4 = r5.optJSONObject(r4)
            if (r4 == 0) goto L_0x06e5
            X.B86 r0 = r0.A00
            java.lang.Object r8 = r0.BFs(r4, r2)
            X.AEI r8 = (X.AEI) r8
        L_0x06cf:
            if (r9 == 0) goto L_0x06e7
            if (r10 == 0) goto L_0x06e7
            if (r8 == 0) goto L_0x06e7
            java.lang.String r0 = "is_last_level"
            boolean r12 = r1.optBoolean(r0)
            java.util.ArrayList r11 = X.AnonymousClass000.A13()
            X.9sr r7 = new X.9sr
            r7.<init>(r8, r9, r10, r11, r12)
            return r7
        L_0x06e5:
            r8 = r7
            goto L_0x06cf
        L_0x06e7:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20662ATu.A02(org.json.JSONObject, long):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0012, code lost:
        if (r1 != 0) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.math.BigDecimal A03(X.A6S r3, java.lang.String r4) {
        /*
            r2 = this;
            if (r4 == 0) goto L_0x0024
            if (r3 == 0) goto L_0x0024
            r1 = 1
            java.lang.Float r0 = X.C20099A7c.A05(r4, r1)     // Catch:{ NumberFormatException -> 0x0018 }
            if (r0 == 0) goto L_0x0014
            float r0 = r0.floatValue()     // Catch:{ NumberFormatException -> 0x0018 }
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r0 = 1
            if (r1 == 0) goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            r0 = r0 ^ 1
            goto L_0x0019
        L_0x0018:
            r0 = 0
        L_0x0019:
            if (r0 == 0) goto L_0x0024
            long r0 = java.lang.Long.parseLong(r4)
            java.math.BigDecimal r0 = X.C197309wU.A00(r3, r0)
            return r0
        L_0x0024:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20662ATu.A03(X.A6S, java.lang.String):java.math.BigDecimal");
    }

    public Object BFs(JSONObject jSONObject, long j) {
        try {
            return A02(jSONObject, j);
        } catch (Exception e) {
            Log.e("BaseGraphQLResponseConverter/convert/Could not convert GraphQL response", e);
            return null;
        }
    }
}
