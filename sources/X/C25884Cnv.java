package X;

import java.util.AbstractCollection;

/* renamed from: X.Cnv  reason: case insensitive filesystem */
public abstract class C25884Cnv {
    public static String A01(E9W e9w) {
        if (e9w.CBP().Bfe()) {
            return null;
        }
        return e9w.CBP().COi();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v8, resolved type: X.COF} */
    /* JADX WARNING: type inference failed for: r17v0, types: [X.ChR, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r7v0, types: [java.lang.Object, X.CLb] */
    /* JADX WARNING: type inference failed for: r5v0, types: [java.lang.Object, X.CUK] */
    /* JADX WARNING: type inference failed for: r13v0 */
    /* JADX WARNING: type inference failed for: r13v1, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r4v0, types: [X.CQM, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r13v3, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r1v15, types: [java.lang.Object, X.COG] */
    /* JADX WARNING: type inference failed for: r13v5, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r12v2 */
    /* JADX WARNING: type inference failed for: r12v3, types: [java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r12v4 */
    /* JADX WARNING: type inference failed for: r12v5, types: [java.util.Set] */
    /* JADX WARNING: type inference failed for: r1v18, types: [java.lang.Object, X.COF] */
    /* JADX WARNING: type inference failed for: r13v7 */
    /* JADX WARNING: type inference failed for: r13v9, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r1v21, types: [java.lang.Object, X.COD] */
    /* JADX WARNING: type inference failed for: r13v11, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r13v13, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r13v15, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r13v17, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r13v19, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r1v32, types: [java.lang.Object, X.DNb] */
    /* JADX WARNING: type inference failed for: r13v21 */
    /* JADX WARNING: type inference failed for: r13v22 */
    /* JADX WARNING: type inference failed for: r13v23 */
    /* JADX WARNING: type inference failed for: r12v7 */
    /* JADX WARNING: type inference failed for: r13v24 */
    /* JADX WARNING: type inference failed for: r13v25 */
    /* JADX WARNING: type inference failed for: r13v26 */
    /* JADX WARNING: type inference failed for: r13v27 */
    /* JADX WARNING: type inference failed for: r13v28 */
    /* JADX WARNING: type inference failed for: r13v29 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C25529ChR A00(X.C24948CQy r21, X.E9W r22) {
        /*
            X.ChR r17 = new X.ChR
            r17.<init>()
            r9 = r22
            java.lang.Integer r0 = r9.CBO()
            java.lang.Integer r8 = X.AnonymousClass00R.A0C
            if (r0 == r8) goto L_0x0014
            r9.CNS()
            r0 = 0
            return r0
        L_0x0014:
            java.lang.Integer r0 = r9.BkN()
            java.lang.Integer r11 = X.AnonymousClass00R.A0N
            if (r0 == r11) goto L_0x05ef
            java.lang.String r1 = r9.CBN()
            int r0 = X.CCB.A00(r1)
            r10 = 32
            boolean r0 = X.C108975cc.A1C(r0, r10)
            r9.BkN()
            if (r0 != 0) goto L_0x0043
            java.lang.String r18 = "payload"
            r0 = r18
            boolean r0 = r0.equals(r1)
            r19 = 1
            if (r0 == 0) goto L_0x0047
            java.lang.String r1 = X.BEB.A0c(r9)
            r0 = r17
            r0.A01 = r1
        L_0x0043:
            r9.CNS()
            goto L_0x0014
        L_0x0047:
            java.lang.String r0 = "layout"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0043
            X.CLb r7 = new X.CLb
            r7.<init>()
            java.lang.Integer r0 = r9.CBO()
            if (r0 == r8) goto L_0x0063
            r9.CNS()
            r7 = 0
        L_0x005e:
            r0 = r17
            r0.A00 = r7
            goto L_0x0043
        L_0x0063:
            java.lang.Integer r0 = r9.BkN()
            if (r0 == r11) goto L_0x005e
            java.lang.String r1 = r9.CBN()
            int r0 = X.CCB.A00(r1)
            boolean r0 = X.C108975cc.A1C(r0, r10)
            r9.BkN()
            if (r0 != 0) goto L_0x00aa
            java.lang.String r0 = "bloks_payload"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00aa
            X.CQy r6 = new X.CQy
            r0 = r21
            r6.<init>(r0)
            X.CUK r5 = new X.CUK
            r5.<init>()
            java.lang.Integer r0 = r9.CBO()
            if (r0 == r8) goto L_0x00ae
            r9.CNS()
            r5 = 0
        L_0x0098:
            X.COF r1 = r5.A01
            if (r1 == 0) goto L_0x00a8
            java.lang.String r0 = r1.A01
            if (r0 == 0) goto L_0x00a2
            r6.A01 = r0
        L_0x00a2:
            java.lang.String r0 = r1.A00
            if (r0 == 0) goto L_0x00a8
            r6.A00 = r0
        L_0x00a8:
            r7.A00 = r5
        L_0x00aa:
            r9.CNS()
            goto L_0x0063
        L_0x00ae:
            java.lang.Integer r0 = r9.BkN()
            if (r0 == r11) goto L_0x0098
            java.lang.String r1 = r9.CBN()
            int r0 = X.CCB.A00(r1)
            boolean r0 = X.C108975cc.A1C(r0, r10)
            r9.BkN()
            if (r0 != 0) goto L_0x00fc
            java.lang.String r2 = "action"
            boolean r0 = r2.equals(r1)
            if (r0 == 0) goto L_0x0100
            X.E9m r4 = r9.CBP()
            X.CQy r3 = new X.CQy
            r3.<init>(r6)
            r0 = r19
            java.lang.String[] r1 = new java.lang.String[r0]
            r0 = 0
            r1[r0] = r2
            java.util.List r0 = r3.A03
            X.C29401cD.A0L(r0, r1)
            r1 = 0
            X.CMY r0 = new X.CMY
            r0.<init>(r1)
            X.E9O r2 = r0.A01
            java.util.List r0 = r0.A00
            X.D8I r1 = new X.D8I
            r1.<init>(r2, r0)
            X.D8J r0 = new X.D8J
            r0.<init>(r3, r1)
            X.E8A r0 = X.CCI.A00(r0, r4)
            r5.A03 = r0
        L_0x00fc:
            r9.CNS()
            goto L_0x00ae
        L_0x0100:
            java.lang.String r3 = "tree"
            boolean r0 = r3.equals(r1)
            if (r0 == 0) goto L_0x0120
            X.CQy r2 = new X.CQy
            r2.<init>(r6)
            r0 = r19
            java.lang.String[] r1 = new java.lang.String[r0]
            r0 = 0
            r1[r0] = r3
            java.util.List r0 = r2.A03
            X.C29401cD.A0L(r0, r1)
            X.DFL r0 = X.C25338Cdx.A01(r2, r9)
            r5.A00 = r0
            goto L_0x00fc
        L_0x0120:
            java.lang.String r2 = "data"
            boolean r0 = r2.equals(r1)
            r13 = 0
            if (r0 == 0) goto L_0x0199
            java.lang.Integer r1 = r9.CBO()
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            if (r1 != r0) goto L_0x0195
            java.util.ArrayList r13 = X.AnonymousClass000.A13()
        L_0x0135:
            java.lang.Integer r1 = r9.BkN()
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            if (r1 == r0) goto L_0x0195
            X.DNb r1 = new X.DNb
            r1.<init>()
            java.lang.Integer r0 = r9.CBO()
            if (r0 == r8) goto L_0x014c
            r9.CNS()
            goto L_0x0135
        L_0x014c:
            java.lang.Integer r0 = r9.BkN()
            if (r0 == r11) goto L_0x0191
            java.lang.String r3 = r9.CBN()
            int r0 = X.CCB.A00(r3)
            boolean r0 = X.C108975cc.A1C(r0, r10)
            r9.BkN()
            if (r0 != 0) goto L_0x0171
            java.lang.String r0 = "id"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0175
            java.lang.String r0 = A01(r9)
            r1.A00 = r0
        L_0x0171:
            r9.CNS()
            goto L_0x014c
        L_0x0175:
            java.lang.String r0 = "type"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0184
            java.lang.String r0 = A01(r9)
            r1.A01 = r0
            goto L_0x0171
        L_0x0184:
            boolean r0 = r2.equals(r3)
            if (r0 == 0) goto L_0x0171
            java.util.HashMap r0 = X.C25341Ce0.A01(r9)
            r1.A02 = r0
            goto L_0x0171
        L_0x0191:
            r13.add(r1)
            goto L_0x0135
        L_0x0195:
            r5.A07 = r13
            goto L_0x00fc
        L_0x0199:
            java.lang.String r2 = "embedded_payloads"
            boolean r0 = r2.equals(r1)
            if (r0 == 0) goto L_0x01c3
            java.lang.Integer r1 = r9.CBO()
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            if (r1 != r0) goto L_0x01bf
            java.util.ArrayList r13 = X.AnonymousClass000.A13()
        L_0x01ad:
            java.lang.Integer r1 = r9.BkN()
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            if (r1 == r0) goto L_0x01bf
            X.COE r0 = X.CCD.A00(r6, r9, r2)
            if (r0 == 0) goto L_0x01ad
            r13.add(r0)
            goto L_0x01ad
        L_0x01bf:
            r5.A08 = r13
            goto L_0x00fc
        L_0x01c3:
            java.lang.String r0 = "referenced"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x01e7
            java.lang.Integer r1 = r9.CBO()
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            if (r1 != r0) goto L_0x01e3
            java.util.ArrayList r13 = X.AnonymousClass000.A13()
        L_0x01d7:
            java.lang.Integer r1 = r9.BkN()
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            if (r1 == r0) goto L_0x01e3
            A02(r9, r13)
            goto L_0x01d7
        L_0x01e3:
            r5.A0D = r13
            goto L_0x00fc
        L_0x01e7:
            java.lang.String r0 = "referenced_external"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x020b
            java.lang.Integer r1 = r9.CBO()
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            if (r1 != r0) goto L_0x0207
            java.util.ArrayList r13 = X.AnonymousClass000.A13()
        L_0x01fb:
            java.lang.Integer r1 = r9.BkN()
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            if (r1 == r0) goto L_0x0207
            A02(r9, r13)
            goto L_0x01fb
        L_0x0207:
            r5.A0C = r13
            goto L_0x00fc
        L_0x020b:
            java.lang.String r0 = "referenced_embedded_payloads"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x022f
            java.lang.Integer r1 = r9.CBO()
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            if (r1 != r0) goto L_0x022b
            java.util.ArrayList r13 = X.AnonymousClass000.A13()
        L_0x021f:
            java.lang.Integer r1 = r9.BkN()
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            if (r1 == r0) goto L_0x022b
            A02(r9, r13)
            goto L_0x021f
        L_0x022b:
            r5.A0B = r13
            goto L_0x00fc
        L_0x022f:
            java.lang.String r0 = "props"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x029a
            java.lang.Integer r1 = r9.CBO()
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            if (r1 != r0) goto L_0x0296
            java.util.ArrayList r13 = X.AnonymousClass000.A13()
        L_0x0243:
            java.lang.Integer r1 = r9.BkN()
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            if (r1 == r0) goto L_0x0296
            X.COD r1 = new X.COD
            r1.<init>()
            java.lang.Integer r0 = r9.CBO()
            if (r0 == r8) goto L_0x025a
            r9.CNS()
            goto L_0x0243
        L_0x025a:
            java.lang.Integer r0 = r9.BkN()
            if (r0 == r11) goto L_0x0292
            java.lang.String r2 = r9.CBN()
            int r0 = X.CCB.A00(r2)
            boolean r0 = X.C108975cc.A1C(r0, r10)
            r9.BkN()
            if (r0 != 0) goto L_0x027f
            java.lang.String r0 = "id"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0283
            java.lang.String r0 = A01(r9)
            r1.A00 = r0
        L_0x027f:
            r9.CNS()
            goto L_0x025a
        L_0x0283:
            java.lang.String r0 = "name"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x027f
            java.lang.String r0 = A01(r9)
            r1.A01 = r0
            goto L_0x027f
        L_0x0292:
            r13.add(r1)
            goto L_0x0243
        L_0x0296:
            r5.A0A = r13
            goto L_0x00fc
        L_0x029a:
            java.lang.String r0 = "error_attribution"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x02ee
            X.COF r1 = new X.COF
            r1.<init>()
            java.lang.Integer r0 = r9.CBO()
            if (r0 == r8) goto L_0x02b4
            r9.CNS()
        L_0x02b0:
            r5.A01 = r13
            goto L_0x00fc
        L_0x02b4:
            java.lang.Integer r0 = r9.BkN()
            if (r0 == r11) goto L_0x02ec
            java.lang.String r2 = r9.CBN()
            int r0 = X.CCB.A00(r2)
            boolean r0 = X.C108975cc.A1C(r0, r10)
            r9.BkN()
            if (r0 != 0) goto L_0x02d9
            java.lang.String r0 = "logging_id"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x02dd
            java.lang.String r0 = A01(r9)
            r1.A00 = r0
        L_0x02d9:
            r9.CNS()
            goto L_0x02b4
        L_0x02dd:
            java.lang.String r0 = "source_map_id"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x02d9
            java.lang.String r0 = A01(r9)
            r1.A01 = r0
            goto L_0x02d9
        L_0x02ec:
            r13 = r1
            goto L_0x02b0
        L_0x02ee:
            java.lang.String r0 = "component_queries"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0430
            java.lang.Integer r0 = r9.CBO()
            java.lang.Integer r4 = X.AnonymousClass00R.A00
            if (r0 != r4) goto L_0x042c
            java.util.ArrayList r13 = X.AnonymousClass000.A13()
        L_0x0302:
            java.lang.Integer r0 = r9.BkN()
            java.lang.Integer r3 = X.AnonymousClass00R.A01
            if (r0 == r3) goto L_0x042c
            X.CTm r2 = new X.CTm
            r2.<init>()
            java.lang.Integer r0 = r9.CBO()
            if (r0 == r8) goto L_0x0319
            r9.CNS()
            goto L_0x0302
        L_0x0319:
            java.lang.Integer r0 = r9.BkN()
            if (r0 == r11) goto L_0x0427
            java.lang.String r1 = r9.CBN()
            int r0 = X.CCB.A00(r1)
            boolean r0 = X.C108975cc.A1C(r0, r10)
            r9.BkN()
            if (r0 != 0) goto L_0x033f
            java.lang.String r0 = "id"
            boolean r0 = r0.equals(r1)
            r12 = 0
            if (r0 == 0) goto L_0x0343
            java.lang.String r0 = A01(r9)
            r2.A06 = r0
        L_0x033f:
            r9.CNS()
            goto L_0x0319
        L_0x0343:
            java.lang.String r0 = "app_id_expr"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0356
            X.E9m r0 = r9.CBP()
            X.E8A r0 = X.CCI.A00(r12, r0)
            r2.A00 = r0
            goto L_0x033f
        L_0x0356:
            java.lang.String r0 = "params"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0369
            X.E9m r0 = r9.CBP()
            X.E8A r0 = X.CCI.A00(r12, r0)
            r2.A03 = r0
            goto L_0x033f
        L_0x0369:
            java.lang.String r0 = "client_params"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x037c
            X.E9m r0 = r9.CBP()
            X.E8A r0 = X.CCI.A00(r12, r0)
            r2.A02 = r0
            goto L_0x033f
        L_0x037c:
            java.lang.String r0 = "deps"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x039b
            java.lang.Integer r0 = r9.CBO()
            if (r0 != r4) goto L_0x0398
            java.util.HashSet r12 = X.C17880vN.A12()
        L_0x038e:
            java.lang.Integer r0 = r9.BkN()
            if (r0 == r3) goto L_0x0398
            A02(r9, r12)
            goto L_0x038e
        L_0x0398:
            r2.A08 = r12
            goto L_0x033f
        L_0x039b:
            java.lang.String r0 = "targets"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x03e3
            java.lang.Integer r0 = r9.CBO()
            if (r0 != r8) goto L_0x03df
            java.util.HashMap r15 = X.C17880vN.A11()
        L_0x03ad:
            java.lang.Integer r0 = r9.BkN()
            if (r0 == r11) goto L_0x03de
            java.lang.String r14 = r9.CBN()
            r9.BkN()
            java.lang.Integer r1 = r9.CBO()
            java.lang.Integer r0 = X.AnonymousClass00R.A19
            if (r1 != r0) goto L_0x03c6
            r15.put(r14, r12)
            goto L_0x03ad
        L_0x03c6:
            X.E9m r0 = r9.CBP()
            boolean r0 = r0.Bfe()
            if (r0 != 0) goto L_0x03ad
            X.E9m r0 = r9.CBP()
            java.lang.String r0 = r0.COi()
            if (r0 == 0) goto L_0x03ad
            r15.put(r14, r0)
            goto L_0x03ad
        L_0x03de:
            r12 = r15
        L_0x03df:
            r2.A07 = r12
            goto L_0x033f
        L_0x03e3:
            java.lang.String r0 = "cache_ttl_expr"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x03f7
            X.E9m r0 = r9.CBP()
            X.E8A r0 = X.CCI.A00(r12, r0)
            r2.A01 = r0
            goto L_0x033f
        L_0x03f7:
            java.lang.String r0 = "disk_cache_enabled"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x040f
            X.E9m r0 = r9.CBP()
            boolean r0 = r0.BDH()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A04 = r0
            goto L_0x033f
        L_0x040f:
            java.lang.String r0 = "is_scoped"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x033f
            X.E9m r0 = r9.CBP()
            boolean r0 = r0.BDH()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A05 = r0
            goto L_0x033f
        L_0x0427:
            r13.add(r2)
            goto L_0x0302
        L_0x042c:
            r5.A06 = r13
            goto L_0x00fc
        L_0x0430:
            java.lang.String r0 = "hoisted_async_components"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x049b
            java.lang.Integer r1 = r9.CBO()
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            if (r1 != r0) goto L_0x0497
            java.util.ArrayList r13 = X.AnonymousClass000.A13()
        L_0x0444:
            java.lang.Integer r1 = r9.BkN()
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            if (r1 == r0) goto L_0x0497
            X.COG r1 = new X.COG
            r1.<init>()
            java.lang.Integer r0 = r9.CBO()
            if (r0 == r8) goto L_0x045b
            r9.CNS()
            goto L_0x0444
        L_0x045b:
            java.lang.Integer r0 = r9.BkN()
            if (r0 == r11) goto L_0x0493
            java.lang.String r2 = r9.CBN()
            int r0 = X.CCB.A00(r2)
            boolean r0 = X.C108975cc.A1C(r0, r10)
            r9.BkN()
            if (r0 != 0) goto L_0x0480
            java.lang.String r0 = "id"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0484
            java.lang.String r0 = X.BEB.A0c(r9)
            r1.A01 = r0
        L_0x0480:
            r9.CNS()
            goto L_0x045b
        L_0x0484:
            r0 = r18
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0480
            android.util.Pair r0 = X.C25487Cgi.A00(r9)
            r1.A00 = r0
            goto L_0x0480
        L_0x0493:
            r13.add(r1)
            goto L_0x0444
        L_0x0497:
            r5.A09 = r13
            goto L_0x00fc
        L_0x049b:
            java.lang.String r14 = "ft"
            boolean r0 = r14.equals(r1)
            if (r0 == 0) goto L_0x0505
            r16 = 0
            java.lang.Integer r1 = r9.CBO()
            r0 = 0
            if (r1 != r8) goto L_0x0501
            java.util.LinkedHashMap r12 = X.C17880vN.A13()
        L_0x04b0:
            java.lang.Integer r0 = r9.BkN()
            if (r0 == r11) goto L_0x04fc
            java.lang.String r4 = r9.CBN()
            r9.BkN()
            java.lang.Object r3 = X.C25341Ce0.A00(r9)
            X.AnonymousClass8BR.A1I(r3)
            java.lang.String r3 = (java.lang.String) r3
            X.CQy r2 = new X.CQy
            r2.<init>(r6)
            java.lang.String[] r1 = X.C17880vN.A1Z()
            r1[r16] = r14
            X.C18070vi.A0b(r4)
            r1[r19] = r4
            java.util.List r0 = r2.A03
            X.C29401cD.A0L(r0, r1)
            X.CMY r1 = new X.CMY
            r1.<init>(r13)
            X.E9O r0 = r1.A01
            r20 = r0
            java.util.List r0 = r1.A00
            X.D8I r15 = new X.D8I
            r1 = r20
            r15.<init>(r1, r0)
            X.D8J r1 = new X.D8J
            r1.<init>(r2, r15)
            r2 = -1
            X.DNu r0 = new X.DNu
            r0.<init>(r1, r3, r13, r2)
            r12.put(r4, r0)
            goto L_0x04b0
        L_0x04fc:
            X.CZq r0 = new X.CZq
            r0.<init>(r12)
        L_0x0501:
            r5.A02 = r0
            goto L_0x00fc
        L_0x0505:
            java.lang.String r12 = "templates"
            boolean r0 = r12.equals(r1)
            if (r0 == 0) goto L_0x0542
            java.lang.Integer r0 = r9.CBO()
            if (r0 != r8) goto L_0x053d
            java.util.HashMap r4 = X.C17880vN.A11()
        L_0x0517:
            java.lang.Integer r0 = r9.BkN()
            if (r0 == r11) goto L_0x053e
            java.lang.String r3 = r9.CBN()
            r9.BkN()
            X.CQy r2 = new X.CQy
            r2.<init>(r6)
            java.lang.String[] r1 = X.C17880vN.A1Z()
            X.AnonymousClass3MY.A1V(r12, r3, r1)
            java.util.List r0 = r2.A03
            X.C29401cD.A0L(r0, r1)
            X.DFL r0 = X.C25338Cdx.A01(r2, r9)
            r4.put(r3, r0)
            goto L_0x0517
        L_0x053d:
            r4 = 0
        L_0x053e:
            r5.A0F = r4
            goto L_0x00fc
        L_0x0542:
            java.lang.String r0 = "values"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x05cf
            java.lang.Integer r1 = r9.CBO()
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            if (r1 != r0) goto L_0x05cb
            java.util.ArrayList r13 = X.AnonymousClass000.A13()
        L_0x0556:
            java.lang.Integer r1 = r9.BkN()
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            if (r1 == r0) goto L_0x05cb
            X.CQM r4 = new X.CQM
            r4.<init>()
            java.lang.Integer r0 = r9.CBO()
            if (r0 == r8) goto L_0x056d
            r9.CNS()
            goto L_0x0556
        L_0x056d:
            java.lang.Integer r0 = r9.BkN()
            if (r0 == r11) goto L_0x05c7
            java.lang.String r1 = r9.CBN()
            int r0 = X.CCB.A00(r1)
            boolean r0 = X.C108975cc.A1C(r0, r10)
            r9.BkN()
            if (r0 != 0) goto L_0x0592
            java.lang.String r0 = "id"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0596
            java.lang.String r0 = X.BEB.A0c(r9)
            r4.A02 = r0
        L_0x0592:
            r9.CNS()
            goto L_0x056d
        L_0x0596:
            java.lang.String r0 = "depth"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x05ad
            X.E9m r0 = r9.CBP()
            int r0 = r0.Bdi()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.A01 = r0
            goto L_0x0592
        L_0x05ad:
            java.lang.String r0 = "expression"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0592
            X.E9m r0 = r9.CBP()
            java.lang.String r3 = r0.COi()
            r2 = 0
            r1 = -1
            X.DNu r0 = new X.DNu
            r0.<init>(r2, r3, r2, r1)
            r4.A00 = r0
            goto L_0x0592
        L_0x05c7:
            r13.add(r4)
            goto L_0x0556
        L_0x05cb:
            r5.A0E = r13
            goto L_0x00fc
        L_0x05cf:
            java.lang.String r0 = "ft_declare"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x05df
            java.lang.String r0 = A01(r9)
            r5.A04 = r0
            goto L_0x00fc
        L_0x05df:
            java.lang.String r0 = "ft_include"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00fc
            java.lang.String r0 = A01(r9)
            r5.A05 = r0
            goto L_0x00fc
        L_0x05ef:
            return r17
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25884Cnv.A00(X.CQy, X.E9W):X.ChR");
    }

    public static void A02(E9W e9w, AbstractCollection abstractCollection) {
        String COi;
        if (!e9w.CBP().Bfe() && (COi = e9w.CBP().COi()) != null) {
            abstractCollection.add(COi);
        }
    }
}
