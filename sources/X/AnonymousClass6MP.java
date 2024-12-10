package X;

import android.text.TextUtils;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.IndiaUpiCheckOrderDetailsActivity;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.6MP  reason: invalid class name */
public class AnonymousClass6MP extends A34 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public AnonymousClass6MP(Object obj, Object obj2, Object obj3, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
        this.A03 = obj3;
    }

    public void A0E() {
        if (this.A00 != 0) {
            super.A0E();
            return;
        }
        C139596z7 r2 = (C139596z7) this.A03;
        ((C131586lL) this.A01).A00(r2.A00);
        r2.A06.CJF(r2.A00);
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("dictionaryloader/prepare/onCancelled/dictionaryAvailable=");
        C17900vP.A0r(A10, r2.A00);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:66:0x020e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:?, code lost:
        X.CDX.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0212, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0215, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:?, code lost:
        X.CDX.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0219, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A0G(java.lang.Object[] r29) {
        /*
            r28 = this;
            r9 = r28
            int r0 = r9.A00
            switch(r0) {
                case 0: goto L_0x002a;
                case 1: goto L_0x0019;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r9.A03
            X.Aa6 r0 = (X.C20828Aa6) r0
            X.8Gd r1 = r0.A06
            java.lang.Object r0 = r9.A02
            X.205 r0 = (X.AnonymousClass205) r0
            X.C17960vV.A07(r0)
            X.21K r0 = r1.Bhj(r0)
            return r0
        L_0x0019:
            java.lang.Object r0 = r9.A01
            X.72F r0 = (X.AnonymousClass72F) r0
            X.1QQ r1 = r0.A04
            java.lang.Object r0 = r9.A02
            X.AEX r0 = (X.AEX) r0
            java.lang.String r0 = r0.A0F
            X.AEX r0 = r1.A03(r0)
            return r0
        L_0x002a:
            java.lang.Object r4 = r9.A03
            X.6z7 r4 = (X.C139596z7) r4
            java.util.ArrayList r5 = X.AnonymousClass000.A13()
            X.0vb r2 = r4.A03
            java.util.Locale r0 = r2.A0N()
            java.lang.String r1 = X.AnonymousClass1X0.A04(r0)
            java.util.Locale r0 = r2.A0N()
            java.lang.String r3 = X.AnonymousClass1X0.A02(r0)
            int r0 = r3.length()
            if (r0 != 0) goto L_0x004e
            java.lang.String r3 = r2.A04()
        L_0x004e:
            X.C18070vi.A0b(r3)
            X.A0r r0 = r4.A07
            java.util.TreeSet r0 = r0.A02()
            r0.add(r1)
            java.util.Iterator r2 = r0.iterator()
        L_0x005e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0076
            java.lang.String r0 = X.C17880vN.A0v(r2)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r0)
            r0 = 45
            java.lang.String r0 = X.C17890vO.A0Z(r3, r1, r0)
            r5.add(r0)
            goto L_0x005e
        L_0x0076:
            java.lang.String r0 = ","
            java.lang.String r7 = X.C108995ce.A0X(r0, r5)
            X.6xD r3 = r4.A01()
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "dictionaryloader/prepare/cache language: "
            r1.append(r0)
            java.lang.String r0 = r3.A03
            r1.append(r0)
            java.lang.String r0 = ", last attempted language: "
            r1.append(r0)
            java.lang.String r0 = r3.A05
            r1.append(r0)
            java.lang.String r0 = ", request languages: "
            X.C17900vP.A0f(r0, r7, r1)
            X.11P r8 = r4.A02
            long r5 = X.AnonymousClass11P.A01(r8)
            X.8AO r13 = r4.A06
            int r0 = r13.getCount()
            r12 = 1
            r2 = 0
            boolean r10 = X.AnonymousClass000.A1R(r0)
            java.lang.String r0 = r3.A03
            boolean r0 = X.C18070vi.A18(r7, r0)
            r18 = 3600000(0x36ee80, double:1.7786363E-317)
            if (r0 == 0) goto L_0x0128
            long r0 = r3.A00
            long r16 = r5 - r0
            r14 = 604800000(0x240c8400, double:2.988109026E-315)
            int r0 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            if (r0 >= 0) goto L_0x0128
        L_0x00c5:
            X.6mh r0 = new X.6mh
            r0.<init>(r4, r2, r10)
        L_0x00ca:
            boolean r15 = r0.A00
            r11 = 0
            r10 = 1
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r12)
            if (r15 == 0) goto L_0x00ec
            boolean r1 = r0.A01
            if (r1 == 0) goto L_0x00ec
            java.lang.String r1 = r3.A03
            boolean r1 = X.C18070vi.A18(r7, r1)
            if (r1 == 0) goto L_0x00ec
            java.lang.String r1 = "dictionaryloader/prepare/publish progress to show search"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            java.lang.Boolean[] r1 = new java.lang.Boolean[r12]
            r1[r2] = r14
            r9.A0C(r1)
        L_0x00ec:
            boolean r0 = r0.A01
            r4.A00 = r0
            if (r15 == 0) goto L_0x023c
            X.11E r0 = r4.A01
            boolean r0 = r0.A09()
            if (r0 == 0) goto L_0x023c
            X.63n r2 = new X.63n
            r2.<init>()
            r2.A05 = r7
            java.lang.String r0 = r3.A03
            r2.A04 = r0
            long r0 = r3.A01
            r15 = 0
            int r12 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            boolean r12 = X.AnonymousClass000.A1P(r12)
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)
            r2.A01 = r12
            java.lang.Long r0 = X.C108945cZ.A1B(r5, r0)
            r2.A03 = r0
            r2.A00 = r14
            java.lang.Object r12 = r9.A02
            java.lang.Integer r12 = (java.lang.Integer) r12
            long r17 = X.AnonymousClass11P.A01(r8)
            r0 = 30
            goto L_0x013f
        L_0x0128:
            long r0 = r3.A01
            long r14 = r5 - r0
            int r0 = (r14 > r18 ? 1 : (r14 == r18 ? 0 : -1))
            if (r0 >= 0) goto L_0x0139
            java.lang.String r0 = r3.A05
            boolean r0 = X.C18070vi.A18(r7, r0)
            if (r0 == 0) goto L_0x0139
            goto L_0x00c5
        L_0x0139:
            X.6mh r0 = new X.6mh
            r0.<init>(r4, r12, r10)
            goto L_0x00ca
        L_0x013f:
            android.net.TrafficStats.setThreadStatsTag(r0)     // Catch:{ IOException -> 0x021a }
            X.89q r9 = r4.A05     // Catch:{ IOException -> 0x021a }
            java.lang.String r0 = r3.A04     // Catch:{ IOException -> 0x021a }
            X.AUZ r5 = r9.BFc(r0, r7)     // Catch:{ IOException -> 0x021a }
            java.net.HttpURLConnection r8 = r5.A01     // Catch:{ all -> 0x0213 }
            int r1 = r8.getResponseCode()     // Catch:{ all -> 0x0213 }
            java.lang.Long r0 = X.C17880vN.A0n(r1)     // Catch:{ all -> 0x0213 }
            r2.A02 = r0     // Catch:{ all -> 0x0213 }
            r0 = 304(0x130, float:4.26E-43)
            r14 = 0
            if (r1 != r0) goto L_0x0172
            java.lang.String r0 = "dictionaryloader/prepare-from-network/not_modified"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0213 }
            java.lang.Integer r13 = X.AnonymousClass00R.A00     // Catch:{ all -> 0x0213 }
            java.lang.String r1 = r3.A04     // Catch:{ all -> 0x0213 }
            X.6xD r0 = new X.6xD     // Catch:{ all -> 0x0213 }
            r16 = r7
            r12 = r0
            r14 = r1
            r15 = r7
            r19 = r17
            r12.<init>(r13, r14, r15, r16, r17, r19)     // Catch:{ all -> 0x0213 }
            goto L_0x0208
        L_0x0172:
            r0 = 404(0x194, float:5.66E-43)
            if (r1 != r0) goto L_0x01a7
            java.lang.String r0 = "dictionaryloader/prepare-from-network/unavailable"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0213 }
            r13.BEs()     // Catch:{ Exception -> 0x018c }
            java.lang.Integer r13 = X.AnonymousClass00R.A0N     // Catch:{ Exception -> 0x018c }
            X.6xD r0 = new X.6xD     // Catch:{ Exception -> 0x018c }
            r16 = r7
            r12 = r0
            r15 = r7
            r19 = r17
            r12.<init>(r13, r14, r15, r16, r17, r19)     // Catch:{ Exception -> 0x018c }
            goto L_0x0208
        L_0x018c:
            r1 = move-exception
            java.lang.String r0 = "dictionaryloader/prepare-from-network/unavailable/clear-fail"
            com.whatsapp.util.Log.i(r0, r1)     // Catch:{ all -> 0x0213 }
            java.lang.Integer r13 = X.AnonymousClass00R.A01     // Catch:{ all -> 0x0213 }
            java.lang.String r6 = r3.A04     // Catch:{ all -> 0x0213 }
            long r8 = r3.A00     // Catch:{ all -> 0x0213 }
            java.lang.String r1 = r3.A03     // Catch:{ all -> 0x0213 }
            X.6xD r0 = new X.6xD     // Catch:{ all -> 0x0213 }
            r12 = r0
            r14 = r6
            r15 = r7
            r16 = r1
            r19 = r8
            r12.<init>(r13, r14, r15, r16, r17, r19)     // Catch:{ all -> 0x0213 }
            goto L_0x0208
        L_0x01a7:
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 == r0) goto L_0x01c9
            java.lang.StringBuilder r6 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0213 }
            java.lang.String r0 = "dictionaryloader/prepare-from-network/servererror: "
            X.C17900vP.A0i(r0, r6, r1)     // Catch:{ all -> 0x0213 }
            java.lang.Integer r13 = X.AnonymousClass00R.A01     // Catch:{ all -> 0x0213 }
            java.lang.String r6 = r3.A04     // Catch:{ all -> 0x0213 }
            long r8 = r3.A00     // Catch:{ all -> 0x0213 }
            java.lang.String r1 = r3.A03     // Catch:{ all -> 0x0213 }
            X.6xD r0 = new X.6xD     // Catch:{ all -> 0x0213 }
            r12 = r0
            r14 = r6
            r15 = r7
            r16 = r1
            r19 = r8
            r12.<init>(r13, r14, r15, r16, r17, r19)     // Catch:{ all -> 0x0213 }
            goto L_0x0208
        L_0x01c9:
            int r0 = r8.getContentLength()     // Catch:{ all -> 0x0213 }
            long r0 = (long) r0     // Catch:{ all -> 0x0213 }
            java.io.InputStream r6 = r9.BT5(r5)     // Catch:{ all -> 0x0213 }
            boolean r0 = r9.BcK(r6, r12, r0)     // Catch:{ all -> 0x020c }
            if (r0 == 0) goto L_0x01ec
            java.lang.String r0 = "ETag"
            java.lang.String r14 = r8.getHeaderField(r0)     // Catch:{ all -> 0x020c }
            java.lang.Integer r13 = X.AnonymousClass00R.A00     // Catch:{ all -> 0x020c }
            X.6xD r0 = new X.6xD     // Catch:{ all -> 0x020c }
            r16 = r7
            r12 = r0
            r15 = r7
            r19 = r17
            r12.<init>(r13, r14, r15, r16, r17, r19)     // Catch:{ all -> 0x020c }
            goto L_0x0205
        L_0x01ec:
            java.lang.Integer r20 = X.AnonymousClass00R.A01     // Catch:{ all -> 0x020c }
            java.lang.String r12 = r3.A04     // Catch:{ all -> 0x020c }
            long r8 = r3.A00     // Catch:{ all -> 0x020c }
            java.lang.String r1 = r3.A03     // Catch:{ all -> 0x020c }
            X.6xD r0 = new X.6xD     // Catch:{ all -> 0x020c }
            r19 = r0
            r21 = r12
            r22 = r7
            r23 = r1
            r26 = r8
            r24 = r17
            r19.<init>(r20, r21, r22, r23, r24, r26)     // Catch:{ all -> 0x020c }
        L_0x0205:
            r6.close()     // Catch:{ all -> 0x0213 }
        L_0x0208:
            r5.close()     // Catch:{ IOException -> 0x021a }
            goto L_0x0257
        L_0x020c:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x020e }
        L_0x020e:
            r0 = move-exception
            X.CDX.A00(r6, r1)     // Catch:{ all -> 0x0213 }
            throw r0     // Catch:{ all -> 0x0213 }
        L_0x0213:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0215 }
        L_0x0215:
            r0 = move-exception
            X.CDX.A00(r5, r1)     // Catch:{ IOException -> 0x021a }
            throw r0     // Catch:{ IOException -> 0x021a }
        L_0x021a:
            r1 = move-exception
            java.lang.String r0 = "dictionaryloader/prepare-from-network/connecterror"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0235 }
            java.lang.Integer r13 = X.AnonymousClass00R.A0C     // Catch:{ all -> 0x0235 }
            java.lang.String r8 = r3.A04     // Catch:{ all -> 0x0235 }
            long r5 = r3.A00     // Catch:{ all -> 0x0235 }
            java.lang.String r1 = r3.A03     // Catch:{ all -> 0x0235 }
            X.6xD r0 = new X.6xD     // Catch:{ all -> 0x0235 }
            r12 = r0
            r14 = r8
            r15 = r7
            r16 = r1
            r19 = r5
            r12.<init>(r13, r14, r15, r16, r17, r19)     // Catch:{ all -> 0x0235 }
            goto L_0x0257
        L_0x0235:
            r1 = move-exception
            r0 = 30
            android.net.TrafficStats.setThreadStatsTag(r0)
            throw r1
        L_0x023c:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "dictionaryloader/prepare/skip network fetch, want to fetch: "
            r1.append(r0)
            r1.append(r15)
            java.lang.String r0 = ", network available: "
            r1.append(r0)
            X.11E r0 = r4.A01
            boolean r0 = r0.A09()
            X.C17900vP.A0r(r1, r0)
            goto L_0x028c
        L_0x0257:
            r1 = 30
            android.net.TrafficStats.setThreadStatsTag(r1)
            java.lang.Integer r1 = r0.A02
            r4.A02(r0)
            java.lang.String r0 = r0.A03
            r2.A07 = r0
            if (r1 == 0) goto L_0x02a0
            int r0 = r1.intValue()
            switch(r0) {
                case 1: goto L_0x029d;
                case 2: goto L_0x029a;
                case 3: goto L_0x0297;
                default: goto L_0x026e;
            }
        L_0x026e:
            java.lang.String r0 = "UPTO_DATE"
        L_0x0270:
            r2.A06 = r0
            if (r1 == 0) goto L_0x0287
            int r1 = r1.intValue()
            switch(r1) {
                case 1: goto L_0x0295;
                case 2: goto L_0x0295;
                default: goto L_0x027b;
            }
        L_0x027b:
            r0 = 1
        L_0x027c:
            if (r0 != r10) goto L_0x0287
            switch(r1) {
                case 1: goto L_0x0293;
                case 2: goto L_0x0293;
                case 3: goto L_0x0293;
                default: goto L_0x0281;
            }
        L_0x0281:
            r0 = 1
        L_0x0282:
            if (r0 != r10) goto L_0x0285
            r11 = 1
        L_0x0285:
            r4.A00 = r11
        L_0x0287:
            X.18K r0 = r4.A04
            r0.CC7(r2)
        L_0x028c:
            boolean r0 = r4.A00
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L_0x0293:
            r0 = 0
            goto L_0x0282
        L_0x0295:
            r0 = 0
            goto L_0x027c
        L_0x0297:
            java.lang.String r0 = "LANGUAGE_UNAVAILABLE"
            goto L_0x0270
        L_0x029a:
            java.lang.String r0 = "NETWORK_ERROR"
            goto L_0x0270
        L_0x029d:
            java.lang.String r0 = "FETCH_ERROR"
            goto L_0x0270
        L_0x02a0:
            r0 = 0
            goto L_0x0270
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6MP.A0G(java.lang.Object[]):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        switch (this.A00) {
            case 0:
                boolean A1Y = AnonymousClass000.A1Y(obj);
                ((C139596z7) this.A03).A06.CJF(A1Y);
                ((C131586lL) this.A01).A00(A1Y);
                return;
            case 1:
                AEX aex = (AEX) obj;
                if (aex != null) {
                    AEX aex2 = (AEX) this.A02;
                    String str = aex2.A05;
                    if (!(str == null || str.length() == 0)) {
                        aex2.A05 = aex.A05;
                    }
                    String str2 = aex2.A06;
                    if (!(str2 == null || str2.length() == 0)) {
                        aex2.A01 = aex.A01;
                        aex2.A06 = aex.A06;
                    }
                }
                AnonymousClass72F r5 = (AnonymousClass72F) this.A01;
                AEX aex3 = (AEX) this.A02;
                C145197Ki r3 = (C145197Ki) this.A03;
                if (TextUtils.isEmpty(aex3.A05)) {
                    r5.A09.A00(new AnonymousClass7G4(aex3, r5, r3), aex3.A0F);
                    return;
                }
                r5.A0C.CGF(new C21435Ak2(r5, aex3, r3, 28));
                return;
            default:
                AnonymousClass21K r11 = (AnonymousClass21K) obj;
                C128646gS r1 = (C128646gS) this.A01;
                C18070vi.A0z(r11, "null cannot be cast to non-null type com.whatsapp.protocol.FMessage");
                AnonymousClass206 r112 = (AnonymousClass206) r11;
                IndiaUpiCheckOrderDetailsActivity indiaUpiCheckOrderDetailsActivity = r1.A00;
                Map map = r1.A02;
                String str3 = r1.A01;
                JSONObject jSONObject = new JSONObject(map);
                C33251iW r4 = indiaUpiCheckOrderDetailsActivity.A01;
                UserJid userJid = indiaUpiCheckOrderDetailsActivity.A0F;
                C22931Dv r0 = AnonymousClass1BI.A00;
                AnonymousClass1BI A002 = C22931Dv.A00(userJid);
                String obj2 = jSONObject.toString();
                C438721g r2 = new C438721g(C17880vN.A0Z(A002, r4.A0x), AnonymousClass11P.A01(r4.A0K));
                if (r112 instanceof AnonymousClass21Z) {
                    r2.A03 = C20120A8f.A02((AnonymousClass206) ((AnonymousClass21Z) r112));
                }
                if (r112 != null) {
                    r4.A10.A00(r2, r112);
                }
                AE2 ae2 = new AE2(C17880vN.A0h(), "address_message", obj2);
                C18070vi.A0d(str3, 1);
                r2.A00 = new C20268AEb((AnonymousClass9Je) null, ae2, str3);
                r4.A0U.BBM(r2);
                indiaUpiCheckOrderDetailsActivity.finish();
                return;
        }
    }

    public /* bridge */ /* synthetic */ void A0I(Object[] objArr) {
        if (this.A00 != 0) {
            super.A0I(objArr);
            return;
        }
        Boolean[] boolArr = (Boolean[]) objArr;
        C18070vi.A0d(boolArr, 0);
        Boolean bool = boolArr[0];
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            ((C139596z7) this.A03).A06.CJF(booleanValue);
            ((C131586lL) this.A01).A00(booleanValue);
            C17900vP.A0n("dictionaryloader/prepare/onProgressUpdate/hasDictionary=", AnonymousClass000.A10(), booleanValue);
        }
    }
}
