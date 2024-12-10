package X;

import android.util.SparseArray;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: X.Ctp  reason: case insensitive filesystem */
public final class C26172Ctp {
    public static final C26172Ctp A00 = new Object();

    public static final C25011CTl A00(DOZ doz, C26050CrK crK, C25011CTl cTl, DFL dfl, CFu cFu, C25416CfO cfO) {
        DFL dfl2;
        DFL dfl3 = dfl;
        C18070vi.A0d(dfl3, 1);
        CFu cFu2 = cFu;
        C25416CfO cfO2 = cfO;
        C18070vi.A0g(cFu2, 4, cfO2);
        DOZ doz2 = doz;
        C22415B6x A03 = C26272CwJ.A03(doz);
        SparseArray sparseArray = doz.A01;
        Map map = (Map) sparseArray.get(2131428161);
        if (map == null) {
            map = Collections.emptyMap();
        }
        C25011CTl cTl2 = cTl;
        C25091CXc cXc = new C25091CXc(crK, (C25062CVu) doz2.A01(2131428181), cTl2, cFu2, cfO2, A03, (String) sparseArray.get(2131428171), map);
        C24807CLa cLa = new C24807CLa(C17880vN.A12());
        HashMap A11 = C17880vN.A11();
        C26172Ctp ctp = A00;
        if (cTl != null) {
            dfl2 = cTl2.A01;
        } else {
            dfl2 = null;
        }
        DFL A01 = ctp.A01(cXc, dfl3, dfl2, cLa, A11);
        Set set = cLa.A00;
        HashMap hashMap = new HashMap(set.size());
        for (Object next : set) {
            hashMap.put(next, cXc.A00.A08.get(next));
        }
        Map map2 = cXc.A00.A08;
        Map map3 = cXc.A09;
        return new C25011CTl(cXc.A04, dfl3, A01, cXc.A06, cXc.A07, cXc.A08, map2, map3, hashMap);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: X.DFL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v6, resolved type: X.DFL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v14, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v16, resolved type: X.DFL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v17, resolved type: X.DFL} */
    /* JADX WARNING: type inference failed for: r13v6, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x028b, code lost:
        if (X.DFL.A00(r5, 153) != null) goto L_0x028d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00dd, code lost:
        if (r19 != false) goto L_0x00df;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x024f A[Catch:{ Da9 -> 0x00c2, all -> 0x0414 }] */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0254 A[Catch:{ Da9 -> 0x00c2, all -> 0x0414 }] */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x0216 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01a3 A[Catch:{ Da9 -> 0x00c2, all -> 0x0414 }] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01c9 A[Catch:{ Da9 -> 0x00c2, all -> 0x0414 }] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final X.DFL A01(X.C25091CXc r34, X.DFL r35, X.DFL r36, X.C24807CLa r37, java.util.Map r38) {
        /*
            r33 = this;
            r3 = r35
            r2 = r36
            int r0 = r3.A00
            r0 = r0 & 1
            if (r0 == 0) goto L_0x0482
            r1 = r34
            r32 = r37
            r31 = r38
            if (r36 == 0) goto L_0x0030
            X.DFL r0 = r2.A08
            if (r0 != r3) goto L_0x0030
            java.util.Set r6 = r1.A0D
            r8 = 0
            if (r6 == 0) goto L_0x0030
            X.CQH r7 = r1.A03
            android.util.SparseArray r0 = r7.A02
            int r5 = r2.A04
            java.lang.Object r9 = r0.get(r5)
            java.util.Set r9 = (java.util.Set) r9
            if (r9 != 0) goto L_0x003b
            java.lang.String r4 = "BindEvaluator"
            java.lang.String r0 = "A previously bound node has a null variable dependency map"
            X.C25913CoX.A01(r4, r0)
        L_0x0030:
            X.CfO r5 = r1.A05
            X.0J4 r0 = X.AnonymousClass0O7.A01
            boolean r23 = r0.A02()
            if (r23 == 0) goto L_0x007b
            goto L_0x0050
        L_0x003b:
            java.util.Iterator r4 = r9.iterator()
        L_0x003f:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0424
            java.lang.Object r0 = r4.next()
            boolean r0 = r6.contains(r0)
            if (r0 == 0) goto L_0x003f
            goto L_0x0030
        L_0x0050:
            java.lang.String r0 = r3.A0B()     // Catch:{ all -> 0x0414 }
            java.lang.String r4 = "Bloks Bind Subtree "
            if (r0 == 0) goto L_0x005f
            java.lang.String r0 = X.C17900vP.A0A(r4, r0)     // Catch:{ all -> 0x0414 }
            X.AnonymousClass0O7.A01(r0)     // Catch:{ all -> 0x0414 }
        L_0x005f:
            java.lang.StringBuilder r4 = X.AnonymousClass000.A11(r4)     // Catch:{ all -> 0x0414 }
            java.lang.String r0 = X.C25883Cnu.A02(r3)     // Catch:{ all -> 0x0414 }
            java.lang.String r4 = X.AnonymousClass000.A0y(r0, r4)     // Catch:{ all -> 0x0414 }
            r0 = 0
            X.C18070vi.A0d(r4, r0)     // Catch:{ all -> 0x0414 }
            X.0J4 r0 = X.AnonymousClass0O7.A01     // Catch:{ all -> 0x0414 }
            r0.A01(r4)     // Catch:{ all -> 0x0414 }
            X.0Fc r4 = X.AnonymousClass0O7.A00     // Catch:{ all -> 0x0414 }
            X.COH r0 = new X.COH     // Catch:{ all -> 0x0414 }
            r0.<init>(r4, r5)     // Catch:{ all -> 0x0414 }
        L_0x007b:
            java.util.HashSet r0 = X.C17880vN.A12()     // Catch:{ all -> 0x0414 }
            X.CLa r4 = new X.CLa     // Catch:{ all -> 0x0414 }
            r4.<init>(r0)     // Catch:{ all -> 0x0414 }
            java.util.HashMap r22 = X.C17880vN.A11()     // Catch:{ all -> 0x0414 }
            r5 = r3
            r7 = 135(0x87, float:1.89E-43)
            java.lang.Object r10 = X.DFL.A00(r3, r7)     // Catch:{ all -> 0x0414 }
            if (r10 == 0) goto L_0x027b
            boolean r0 = r10 instanceof java.util.List     // Catch:{ all -> 0x0414 }
            r6 = 1
            if (r0 == 0) goto L_0x00aa
            java.util.List r10 = (java.util.List) r10     // Catch:{ all -> 0x0414 }
            r19 = 1
        L_0x009a:
            boolean r0 = r10.isEmpty()     // Catch:{ all -> 0x0414 }
            if (r0 != 0) goto L_0x027b
            r0 = 0
            java.lang.Object r0 = r10.get(r0)     // Catch:{ all -> 0x0414 }
            boolean r0 = r0 instanceof java.lang.String     // Catch:{ all -> 0x0414 }
            if (r0 == 0) goto L_0x00df
            goto L_0x00db
        L_0x00aa:
            X.E8A r7 = X.CC0.A00(r3, r10, r7)     // Catch:{ all -> 0x0414 }
            if (r7 == 0) goto L_0x027b
            X.Boh r11 = r1.A00(r3, r4, r7)     // Catch:{ all -> 0x0414 }
            X.9zJ r0 = X.C199029zJ.A01     // Catch:{ Da9 -> 0x00c2 }
            java.lang.Object r10 = X.CCJ.A00(r0, r7, r11)     // Catch:{ Da9 -> 0x00c2 }
            if (r10 == 0) goto L_0x00bf
            java.util.List r10 = (java.util.List) r10     // Catch:{ Da9 -> 0x00c2 }
            goto L_0x00ce
        L_0x00bf:
            java.util.List r10 = java.util.Collections.EMPTY_LIST     // Catch:{ Da9 -> 0x00c2 }
            goto L_0x00ce
        L_0x00c2:
            r9 = move-exception
            java.lang.String r8 = "Exception evaluating onBind"
            X.DOZ r7 = r11.A00     // Catch:{ all -> 0x0414 }
            java.lang.String r0 = "BindEvaluator"
            X.C25913CoX.A00(r7, r0, r8, r9)     // Catch:{ all -> 0x0414 }
            java.util.List r10 = java.util.Collections.EMPTY_LIST     // Catch:{ all -> 0x0414 }
        L_0x00ce:
            r0 = 0
            r11.A01 = r0     // Catch:{ all -> 0x0414 }
            X.DNq r0 = r11.A04     // Catch:{ all -> 0x0414 }
            java.util.concurrent.CopyOnWriteArraySet r0 = r0.A00     // Catch:{ all -> 0x0414 }
            r0.clear()     // Catch:{ all -> 0x0414 }
            r19 = 0
            goto L_0x009a
        L_0x00db:
            r18 = 1
            if (r19 == 0) goto L_0x00e1
        L_0x00df:
            r18 = 0
        L_0x00e1:
            java.lang.String r9 = "BindEvaluator"
            r7 = 2
            if (r18 != 0) goto L_0x00e8
            if (r19 == 0) goto L_0x00fe
        L_0x00e8:
            int r0 = r10.size()     // Catch:{ all -> 0x0414 }
            int r0 = r0 % r7
            if (r0 != r6) goto L_0x00fe
            java.lang.StringBuilder r6 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0414 }
            java.lang.String r0 = "Encountered odd number of elements in interleaved binding array. Mode ["
            r6.append(r0)     // Catch:{ all -> 0x0414 }
            if (r19 == 0) goto L_0x0272
            java.lang.String r0 = "SPLIT_BIND"
            goto L_0x0274
        L_0x00fe:
            java.util.List r0 = r3.A0A     // Catch:{ all -> 0x0414 }
            r17 = r0
            if (r0 != 0) goto L_0x0108
            java.util.List r17 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0414 }
        L_0x0108:
            r16 = 0
            r8 = r16
            r14 = 0
        L_0x010d:
            int r0 = r10.size()     // Catch:{ all -> 0x0414 }
            if (r14 >= r0) goto L_0x0266
            if (r19 == 0) goto L_0x015b
            int r11 = r14 + 1
            java.lang.Object r7 = r10.get(r14)     // Catch:{ all -> 0x0414 }
            boolean r0 = r7 instanceof java.lang.String     // Catch:{ all -> 0x0414 }
            if (r0 == 0) goto L_0x0137
            r13 = r7
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ all -> 0x0414 }
            if (r13 == 0) goto L_0x0139
            int r7 = X.CCB.A00(r13)     // Catch:{ all -> 0x0414 }
        L_0x0128:
            java.lang.Object r0 = r10.get(r11)     // Catch:{ all -> 0x0414 }
            X.E8A r12 = X.CC0.A00(r5, r0, r7)     // Catch:{ all -> 0x0414 }
            if (r12 == 0) goto L_0x0261
            X.Boh r14 = r1.A00(r5, r4, r12)     // Catch:{ all -> 0x0414 }
            goto L_0x013e
        L_0x0137:
            r13 = r16
        L_0x0139:
            int r7 = X.BE6.A0F(r7)     // Catch:{ all -> 0x0414 }
            goto L_0x0128
        L_0x013e:
            X.9zJ r0 = X.C199029zJ.A01     // Catch:{ Da9 -> 0x0145 }
            java.lang.Object r12 = X.CCJ.A00(r0, r12, r14)     // Catch:{ Da9 -> 0x0145 }
            goto L_0x014e
        L_0x0145:
            r0 = move-exception
            java.lang.String r15 = "Exception evaluating expression"
            X.DOZ r12 = r14.A00     // Catch:{ all -> 0x0414 }
            X.C25913CoX.A00(r12, r9, r15, r0)     // Catch:{ all -> 0x0414 }
            r12 = 0
        L_0x014e:
            r0 = r16
            r14.A01 = r0     // Catch:{ all -> 0x0414 }
            X.DNq r0 = r14.A04     // Catch:{ all -> 0x0414 }
            java.util.concurrent.CopyOnWriteArraySet r0 = r0.A00     // Catch:{ all -> 0x0414 }
            r0.clear()     // Catch:{ all -> 0x0414 }
            goto L_0x025f
        L_0x015b:
            if (r18 == 0) goto L_0x016c
            int r11 = r14 + 1
            java.lang.String r13 = X.C17880vN.A0w(r10, r14)     // Catch:{ all -> 0x0414 }
            int r7 = X.CCB.A00(r13)     // Catch:{ all -> 0x0414 }
            java.lang.Object r12 = r10.get(r11)     // Catch:{ all -> 0x0414 }
            goto L_0x019e
        L_0x016c:
            java.lang.Object r11 = r10.get(r14)     // Catch:{ all -> 0x0414 }
            java.util.List r11 = (java.util.List) r11     // Catch:{ all -> 0x0414 }
            r0 = 0
            java.lang.Object r0 = r11.get(r0)     // Catch:{ all -> 0x0414 }
            java.lang.String r7 = X.CCF.A00(r0)     // Catch:{ all -> 0x0414 }
            java.lang.String r0 = r5.A0C()     // Catch:{ all -> 0x0414 }
            if (r0 == 0) goto L_0x018f
            boolean r0 = r7.equals(r0)     // Catch:{ all -> 0x0414 }
            if (r0 != 0) goto L_0x018f
            java.lang.String r0 = "Encountered binding targeted for a descendant "
            X.C25913CoX.A01(r9, r0)     // Catch:{ all -> 0x0414 }
            r11 = r14
            goto L_0x0261
        L_0x018f:
            java.lang.String r13 = X.C17880vN.A0w(r11, r6)     // Catch:{ all -> 0x0414 }
            int r7 = X.CCB.A00(r13)     // Catch:{ all -> 0x0414 }
            r15 = 2
            java.lang.Object r12 = r11.get(r15)     // Catch:{ all -> 0x0414 }
            r11 = r14
            goto L_0x019f
        L_0x019e:
            r15 = 2
        L_0x019f:
            r0 = 32
            if (r7 >= r0) goto L_0x01bb
            java.lang.Object[] r14 = X.AnonymousClass8BR.A1a()     // Catch:{ all -> 0x0414 }
            r0 = 0
            X.C17880vN.A1T(r14, r7, r0)     // Catch:{ all -> 0x0414 }
            r14[r6] = r13     // Catch:{ all -> 0x0414 }
            int r0 = r5.A05     // Catch:{ all -> 0x0414 }
            X.C17880vN.A1T(r14, r0, r15)     // Catch:{ all -> 0x0414 }
            java.lang.String r0 = "Encountered invalid minified key: %s, raw: %s for styleId: %s while unwrapping binding expression"
            java.lang.String r0 = java.lang.String.format(r0, r14)     // Catch:{ all -> 0x0414 }
            X.C25913CoX.A01(r9, r0)     // Catch:{ all -> 0x0414 }
        L_0x01bb:
            X.Cke r6 = X.C25995CqB.A01()     // Catch:{ all -> 0x0414 }
            int r0 = r5.A05     // Catch:{ all -> 0x0414 }
            int[] r14 = r6.A00(r0)     // Catch:{ all -> 0x0414 }
            int r13 = r14.length     // Catch:{ all -> 0x0414 }
            r6 = 0
        L_0x01c7:
            if (r6 >= r13) goto L_0x0216
            r0 = r14[r6]     // Catch:{ all -> 0x0414 }
            if (r0 != r7) goto L_0x01d4
            java.util.List r12 = (java.util.List) r12     // Catch:{ all -> 0x0414 }
            java.util.ArrayList r13 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x0414 }
            goto L_0x01d7
        L_0x01d4:
            int r6 = r6 + 1
            goto L_0x01c7
        L_0x01d7:
            if (r12 == 0) goto L_0x01fb
            java.util.Iterator r6 = r12.iterator()     // Catch:{ all -> 0x0414 }
        L_0x01dd:
            boolean r0 = r6.hasNext()     // Catch:{ all -> 0x0414 }
            if (r0 == 0) goto L_0x01fb
            java.lang.Object r27 = r6.next()     // Catch:{ all -> 0x0414 }
            r24 = r1
            r25 = r5
            r26 = r2
            r28 = r17
            r29 = r22
            X.DFL r0 = A02(r24, r25, r26, r27, r28, r29)     // Catch:{ all -> 0x0414 }
            if (r0 == 0) goto L_0x01dd
            r13.add(r0)     // Catch:{ all -> 0x0414 }
            goto L_0x01dd
        L_0x01fb:
            r12 = r13
            java.util.Iterator r13 = r13.iterator()     // Catch:{ all -> 0x0414 }
        L_0x0200:
            boolean r0 = r13.hasNext()     // Catch:{ all -> 0x0414 }
            if (r0 == 0) goto L_0x0249
            X.DFL r6 = X.BE6.A0d(r13)     // Catch:{ all -> 0x0414 }
            if (r8 != 0) goto L_0x0210
            android.util.SparseArray r8 = X.BE6.A0Q()     // Catch:{ all -> 0x0414 }
        L_0x0210:
            int r0 = r6.A04     // Catch:{ all -> 0x0414 }
            r8.put(r0, r6)     // Catch:{ all -> 0x0414 }
            goto L_0x0200
        L_0x0216:
            X.Cke r6 = X.C25995CqB.A01()     // Catch:{ all -> 0x0414 }
            int r0 = r5.A05     // Catch:{ all -> 0x0414 }
            int[] r14 = r6.A01(r0)     // Catch:{ all -> 0x0414 }
            int r13 = r14.length     // Catch:{ all -> 0x0414 }
            r6 = 0
        L_0x0222:
            if (r6 >= r13) goto L_0x0249
            r0 = r14[r6]     // Catch:{ all -> 0x0414 }
            if (r0 != r7) goto L_0x023b
            r24 = r1
            r25 = r5
            r26 = r2
            r27 = r12
            r28 = r17
            r29 = r22
            X.DFL r12 = A02(r24, r25, r26, r27, r28, r29)     // Catch:{ all -> 0x0414 }
            if (r12 == 0) goto L_0x0249
            goto L_0x023e
        L_0x023b:
            int r6 = r6 + 1
            goto L_0x0222
        L_0x023e:
            if (r8 != 0) goto L_0x0244
            android.util.SparseArray r8 = X.BE6.A0Q()     // Catch:{ all -> 0x0414 }
        L_0x0244:
            int r0 = r12.A04     // Catch:{ all -> 0x0414 }
            r8.put(r0, r12)     // Catch:{ all -> 0x0414 }
        L_0x0249:
            int r6 = r5.A05     // Catch:{ all -> 0x0414 }
            r0 = 13688(0x3578, float:1.9181E-41)
            if (r6 == r0) goto L_0x0254
            X.DFL r5 = X.C25883Cnu.A00(r5, r3, r12, r7)     // Catch:{ all -> 0x0414 }
            goto L_0x0261
        L_0x0254:
            java.util.List r6 = r1.A07     // Catch:{ all -> 0x0414 }
            X.CQI r0 = new X.CQI     // Catch:{ all -> 0x0414 }
            r0.<init>(r5, r12, r7)     // Catch:{ all -> 0x0414 }
            r6.add(r0)     // Catch:{ all -> 0x0414 }
            goto L_0x0261
        L_0x025f:
            if (r12 != 0) goto L_0x019e
        L_0x0261:
            int r14 = r11 + 1
            r6 = 1
            goto L_0x010d
        L_0x0266:
            X.CQH r0 = r1.A04     // Catch:{ all -> 0x0414 }
            if (r8 == 0) goto L_0x027b
            android.util.SparseArray r6 = r0.A01     // Catch:{ all -> 0x0414 }
            int r0 = r5.A04     // Catch:{ all -> 0x0414 }
            r6.put(r0, r8)     // Catch:{ all -> 0x0414 }
            goto L_0x027b
        L_0x0272:
            java.lang.String r0 = "INTERLEAVED"
        L_0x0274:
            java.lang.String r0 = X.BEA.A0m(r0, r6)     // Catch:{ all -> 0x0414 }
            X.C25913CoX.A01(r9, r0)     // Catch:{ all -> 0x0414 }
        L_0x027b:
            r0 = 135(0x87, float:1.89E-43)
            java.lang.Object r0 = X.DFL.A00(r5, r0)     // Catch:{ all -> 0x0414 }
            if (r0 != 0) goto L_0x028d
            r0 = 153(0x99, float:2.14E-43)
            java.lang.Object r0 = X.DFL.A00(r5, r0)     // Catch:{ all -> 0x0414 }
            r21 = 0
            if (r0 == 0) goto L_0x028f
        L_0x028d:
            r21 = 1
        L_0x028f:
            int r0 = r5.A00     // Catch:{ all -> 0x0414 }
            r0 = r0 & 2
            boolean r20 = X.AnonymousClass000.A1O(r0)
            java.util.HashSet r7 = X.C17880vN.A12()     // Catch:{ all -> 0x0414 }
            X.C25995CqB.A00()     // Catch:{ all -> 0x0414 }
            int r6 = r5.A05     // Catch:{ all -> 0x0414 }
            r0 = 13326(0x340e, float:1.8674E-41)
            if (r6 == r0) goto L_0x02a8
            r0 = 13336(0x3418, float:1.8688E-41)
            if (r6 != r0) goto L_0x02ad
        L_0x02a8:
            int r0 = r5.A04     // Catch:{ all -> 0x0414 }
            X.C17890vO.A1D(r7, r0)     // Catch:{ all -> 0x0414 }
        L_0x02ad:
            X.Cke r0 = X.C25995CqB.A01()     // Catch:{ all -> 0x0414 }
            int[] r11 = r0.A01(r6)     // Catch:{ all -> 0x0414 }
            X.C18070vi.A0b(r11)     // Catch:{ all -> 0x0414 }
            int r10 = r11.length     // Catch:{ all -> 0x0414 }
            r9 = 0
        L_0x02ba:
            r13 = 1
            if (r9 >= r10) goto L_0x0307
            r8 = r11[r9]     // Catch:{ all -> 0x0414 }
            X.DFL r16 = r5.A09(r8)     // Catch:{ all -> 0x0414 }
            if (r16 == 0) goto L_0x0304
            if (r36 == 0) goto L_0x02c8
            goto L_0x02ca
        L_0x02c8:
            r0 = 0
            goto L_0x02ce
        L_0x02ca:
            X.DFL r0 = r2.A09(r8)     // Catch:{ all -> 0x0414 }
        L_0x02ce:
            X.Ctp r14 = A00     // Catch:{ all -> 0x0414 }
            r15 = r1
            r17 = r0
            r18 = r4
            r19 = r22
            X.DFL r12 = r14.A01(r15, r16, r17, r18, r19)     // Catch:{ all -> 0x0414 }
            boolean r0 = X.AnonymousClass3Ma.A1Z(r12, r0)
            r21 = r21 | r0
            int r0 = r12.A00     // Catch:{ all -> 0x0414 }
            r0 = r0 & 2
            boolean r0 = X.AnonymousClass000.A1O(r0)
            r20 = r20 | r0
            java.util.Set r6 = r12.A03     // Catch:{ all -> 0x0414 }
            if (r6 != 0) goto L_0x02f3
            java.util.Set r6 = java.util.Collections.emptySet()     // Catch:{ all -> 0x0414 }
        L_0x02f3:
            X.C18070vi.A0b(r6)     // Catch:{ all -> 0x0414 }
            boolean r0 = r6.isEmpty()     // Catch:{ all -> 0x0414 }
            r13 = r13 ^ r0
            if (r13 == 0) goto L_0x0300
            r7.addAll(r6)     // Catch:{ all -> 0x0414 }
        L_0x0300:
            X.DFL r5 = X.C25883Cnu.A00(r5, r3, r12, r8)     // Catch:{ all -> 0x0414 }
        L_0x0304:
            int r9 = r9 + 1
            goto L_0x02ba
        L_0x0307:
            X.Cke r6 = X.C25995CqB.A01()     // Catch:{ all -> 0x0414 }
            int r0 = r5.A05     // Catch:{ all -> 0x0414 }
            int[] r8 = r6.A00(r0)     // Catch:{ all -> 0x0414 }
            X.C18070vi.A0b(r8)     // Catch:{ all -> 0x0414 }
            int r0 = r8.length     // Catch:{ all -> 0x0414 }
            r30 = r0
            r9 = 0
        L_0x0318:
            r0 = r30
            if (r9 >= r0) goto L_0x03d4
            r13 = r8[r9]     // Catch:{ all -> 0x0414 }
            java.util.List r12 = r5.A0F(r13)     // Catch:{ all -> 0x0414 }
            X.C18070vi.A0X(r12)     // Catch:{ all -> 0x0414 }
            if (r36 == 0) goto L_0x0328
            goto L_0x032a
        L_0x0328:
            r11 = 0
            goto L_0x032e
        L_0x032a:
            java.util.List r11 = r2.A0F(r13)     // Catch:{ all -> 0x0414 }
        L_0x032e:
            java.util.Iterator r19 = r12.iterator()     // Catch:{ all -> 0x0414 }
            r10 = r12
            r6 = 0
            r18 = 0
        L_0x0336:
            boolean r0 = r19.hasNext()     // Catch:{ all -> 0x0414 }
            if (r0 == 0) goto L_0x03b3
            java.lang.Object r14 = r19.next()     // Catch:{ all -> 0x0414 }
            int r17 = r6 + 1
            if (r6 >= 0) goto L_0x0349
            X.AnonymousClass1ZU.A0B()     // Catch:{ all -> 0x0414 }
            r0 = 0
            throw r0     // Catch:{ all -> 0x0414 }
        L_0x0349:
            X.DFL r14 = (X.DFL) r14     // Catch:{ all -> 0x0414 }
            if (r14 == 0) goto L_0x03b0
            X.DFL r0 = X.C25883Cnu.A01(r14, r11, r6)     // Catch:{ all -> 0x0414 }
            X.Ctp r24 = A00     // Catch:{ all -> 0x0414 }
            r25 = r1
            r26 = r14
            r27 = r0
            r28 = r4
            r29 = r22
            X.DFL r15 = r24.A01(r25, r26, r27, r28, r29)     // Catch:{ all -> 0x0414 }
            boolean r0 = X.AnonymousClass3Ma.A1Z(r15, r0)
            r21 = r21 | r0
            int r0 = r15.A00     // Catch:{ all -> 0x0414 }
            r0 = r0 & 2
            boolean r0 = X.AnonymousClass000.A1O(r0)
            r20 = r20 | r0
            java.util.Set r0 = r15.A03     // Catch:{ all -> 0x0414 }
            if (r0 != 0) goto L_0x0379
            java.util.Set r0 = java.util.Collections.emptySet()     // Catch:{ all -> 0x0414 }
        L_0x0379:
            X.C18070vi.A0b(r0)     // Catch:{ all -> 0x0414 }
            boolean r16 = X.C108945cZ.A1U(r0)     // Catch:{ all -> 0x0414 }
            if (r16 == 0) goto L_0x0385
            r7.addAll(r0)     // Catch:{ all -> 0x0414 }
        L_0x0385:
            if (r15 == r14) goto L_0x03b0
            if (r10 != r12) goto L_0x038d
            java.util.ArrayList r10 = X.C17880vN.A10(r12)     // Catch:{ all -> 0x0414 }
        L_0x038d:
            int r14 = r15.A05     // Catch:{ all -> 0x0414 }
            r0 = 16851(0x41d3, float:2.3613E-41)
            if (r14 != r0) goto L_0x03ab
            java.util.List r0 = r15.A0E()     // Catch:{ all -> 0x0414 }
            int r6 = r6 + r18
            r10.remove(r6)     // Catch:{ all -> 0x0414 }
            X.C18070vi.A0b(r0)     // Catch:{ all -> 0x0414 }
            r10.addAll(r6, r0)     // Catch:{ all -> 0x0414 }
            int r6 = r0.size()     // Catch:{ all -> 0x0414 }
            r0 = 1
            int r6 = r6 - r0
            int r18 = r18 + r6
            goto L_0x03b0
        L_0x03ab:
            int r6 = r6 + r18
            r10.set(r6, r15)     // Catch:{ all -> 0x0414 }
        L_0x03b0:
            r6 = r17
            goto L_0x0336
        L_0x03b3:
            if (r10 == r12) goto L_0x03b9
            X.DFL r5 = X.C25883Cnu.A00(r5, r3, r10, r13)     // Catch:{ all -> 0x0414 }
        L_0x03b9:
            if (r5 == r3) goto L_0x03d0
            int r0 = r5.A00     // Catch:{ all -> 0x0414 }
            if (r20 == 0) goto L_0x03c2
            r0 = r0 | 2
            goto L_0x03c4
        L_0x03c2:
            r0 = r0 & -3
        L_0x03c4:
            r5.A00 = r0     // Catch:{ all -> 0x0414 }
            r6 = r7
            boolean r0 = r7.isEmpty()     // Catch:{ all -> 0x0414 }
            if (r0 == 0) goto L_0x03ce
            r6 = 0
        L_0x03ce:
            r5.A03 = r6     // Catch:{ all -> 0x0414 }
        L_0x03d0:
            int r9 = r9 + 1
            goto L_0x0318
        L_0x03d4:
            if (r21 != 0) goto L_0x03d9
            if (r36 == 0) goto L_0x03d9
            goto L_0x03db
        L_0x03d9:
            r2 = r5
            goto L_0x03df
        L_0x03db:
            X.DFL r0 = r2.A08     // Catch:{ all -> 0x0414 }
            if (r0 != r3) goto L_0x03d9
        L_0x03df:
            X.CQH r6 = r1.A04     // Catch:{ all -> 0x0414 }
            boolean r0 = r22.isEmpty()     // Catch:{ all -> 0x0414 }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x03f2
            android.util.SparseArray r5 = r6.A00     // Catch:{ all -> 0x0414 }
            int r1 = r2.A04     // Catch:{ all -> 0x0414 }
            r0 = r22
            r5.put(r1, r0)     // Catch:{ all -> 0x0414 }
        L_0x03f2:
            java.util.Set r4 = r4.A00     // Catch:{ all -> 0x0414 }
            java.util.Set r0 = r22.keySet()     // Catch:{ all -> 0x0414 }
            X.C18070vi.A0X(r0)     // Catch:{ all -> 0x0414 }
            r4.removeAll(r0)     // Catch:{ all -> 0x0414 }
            android.util.SparseArray r1 = r6.A02     // Catch:{ all -> 0x0414 }
            int r0 = r2.A04     // Catch:{ all -> 0x0414 }
            r1.put(r0, r4)     // Catch:{ all -> 0x0414 }
            r0 = r32
            java.util.Set r0 = r0.A00     // Catch:{ all -> 0x0414 }
            X.C29401cD.A0J(r4, r0)     // Catch:{ all -> 0x0414 }
            r1 = r31
            r0 = r22
            r1.putAll(r0)     // Catch:{ all -> 0x0414 }
            goto L_0x0473
        L_0x0414:
            r1 = move-exception
            if (r23 == 0) goto L_0x0423
            X.AnonymousClass0O7.A00()
            java.lang.String r0 = r3.A0B()
            if (r0 == 0) goto L_0x0423
            X.AnonymousClass0O7.A00()
        L_0x0423:
            throw r1
        L_0x0424:
            r0 = r32
            java.util.Set r0 = r0.A00
            X.C29401cD.A0J(r9, r0)
            X.CQH r3 = r1.A04
            r0 = 1
            X.C18070vi.A0d(r3, r0)
            X.DNV r0 = new X.DNV
            r0.<init>(r7, r3, r8)
            X.C26081Crw.A00(r2, r0, r8)
            android.util.SparseArray r0 = r7.A00
            java.lang.Object r3 = r0.get(r5)
            java.util.Map r3 = (java.util.Map) r3
            if (r3 == 0) goto L_0x0481
            r0 = r31
            r0.putAll(r3)
            java.util.Iterator r5 = X.AnonymousClass000.A15(r3)
        L_0x044c:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0481
            java.util.Map$Entry r0 = X.AnonymousClass000.A16(r5)
            java.lang.Object r4 = r0.getKey()
            java.lang.Object r3 = r0.getValue()
            java.util.Map r0 = r1.A09
            r0.put(r4, r3)
            java.util.Map r0 = r1.A0B
            java.lang.Object r0 = r0.get(r4)
            boolean r0 = X.C25337Cdw.A00(r0, r3)
            if (r0 != 0) goto L_0x044c
            r6.add(r4)
            goto L_0x044c
        L_0x0473:
            if (r23 == 0) goto L_0x0481
            X.AnonymousClass0O7.A00()
            java.lang.String r0 = r3.A0B()
            if (r0 == 0) goto L_0x0481
            X.AnonymousClass0O7.A00()
        L_0x0481:
            return r2
        L_0x0482:
            return r35
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26172Ctp.A01(X.CXc, X.DFL, X.DFL, X.CLa, java.util.Map):X.DFL");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: X.CvV} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.DFL A02(X.C25091CXc r13, X.DFL r14, X.DFL r15, java.lang.Object r16, java.util.List r17, java.util.Map r18) {
        /*
            r6 = r16
            r2 = 0
            if (r16 != 0) goto L_0x0006
            return r2
        L_0x0006:
            boolean r0 = r6 instanceof java.util.List
            if (r0 == 0) goto L_0x00ce
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r3 = X.C108955ca.A0p(r6)
            r0 = 1
            java.lang.Object r1 = r6.get(r0)
            java.util.Map r1 = (java.util.Map) r1
            r0 = 2
            java.lang.String r0 = X.C17880vN.A0w(r6, r0)
            X.Cay r6 = new X.Cay
            r4 = r17
            r6.<init>(r3, r0, r4, r1)
        L_0x0023:
            java.lang.Object r1 = r6.A00
            boolean r0 = r1 instanceof java.lang.Number
            if (r0 == 0) goto L_0x0095
            int r5 = X.AnonymousClass000.A0M(r1)
            r0 = 143(0x8f, float:2.0E-43)
            java.util.List r4 = r14.A0F(r0)
            if (r5 < 0) goto L_0x0199
            int r0 = r4.size()
            if (r5 >= r0) goto L_0x0199
            X.DFL r3 = X.AnonymousClass8BR.A0G(r4, r5)
        L_0x003f:
            X.CVu r7 = r13.A02
            java.lang.String r5 = r6.A01
            int r8 = r7.A00(r14, r3, r5)
            java.util.List r0 = r6.A02
            java.util.LinkedList r4 = new java.util.LinkedList
            r4.<init>(r0)
            X.C17890vO.A1D(r4, r8)
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            java.lang.String r9 = X.C25339Cdy.A00(r0, r4)
            java.util.Map r0 = r6.A03
            java.util.Iterator r12 = X.AnonymousClass000.A15(r0)
        L_0x005d:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x00d6
            java.util.Map$Entry r11 = X.AnonymousClass000.A16(r12)
            java.lang.String r0 = X.C17880vN.A0x(r11)
            java.lang.String r6 = X.C25339Cdy.A01(r0, r9)
            java.lang.Object r10 = r11.getValue()
            java.util.Map r0 = r13.A09
            r0.put(r6, r10)
            java.util.Set r1 = r13.A0D
            if (r1 == 0) goto L_0x008b
            java.util.Map r0 = r13.A0B
            java.lang.Object r0 = r0.get(r6)
            boolean r0 = X.C25337Cdw.A00(r0, r10)
            if (r0 != 0) goto L_0x008b
            r1.add(r6)
        L_0x008b:
            java.lang.Object r0 = r11.getValue()
            r1 = r18
            r1.put(r6, r0)
            goto L_0x005d
        L_0x0095:
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L_0x00c3
            X.CrK r0 = r13.A00
            java.util.Map r0 = r0.A04
            java.lang.Object r0 = r0.get(r1)
            X.COE r0 = (X.COE) r0
            if (r0 == 0) goto L_0x00b7
            X.ChR r0 = r0.A00
            X.CLb r0 = r0.A00
            X.CUK r1 = r0.A00
            if (r1 == 0) goto L_0x01db
            X.CvV r0 = X.C26235CvV.A02(r1, r2)
            X.DFL r3 = r1.A00
        L_0x00b3:
            if (r3 == 0) goto L_0x01db
            r2 = r0
            goto L_0x003f
        L_0x00b7:
            X.CrK r0 = r13.A00
            java.util.Map r0 = r0.A05
            java.lang.Object r3 = r0.get(r1)
            X.DFL r3 = (X.DFL) r3
            r0 = r2
            goto L_0x00b3
        L_0x00c3:
            boolean r0 = r1 instanceof X.C26235CvV
            if (r0 == 0) goto L_0x01dc
            r2 = r1
            X.CvV r2 = (X.C26235CvV) r2
            X.DFL r3 = r2.A01
            goto L_0x003f
        L_0x00ce:
            boolean r0 = r6 instanceof X.C25205Cay
            if (r0 == 0) goto L_0x01dc
            X.Cay r6 = (X.C25205Cay) r6
            goto L_0x0023
        L_0x00d6:
            X.CQH r0 = r13.A03
            if (r15 == 0) goto L_0x00f3
            android.util.SparseArray r1 = r0.A01
            int r0 = r15.A04
            java.lang.Object r0 = r1.get(r0)
            android.util.SparseArray r0 = (android.util.SparseArray) r0
            if (r0 == 0) goto L_0x00f3
            java.lang.Object r1 = r0.get(r8)
            X.DFL r1 = (X.DFL) r1
            if (r1 == 0) goto L_0x00f3
            X.DFL r0 = r1.A08
            if (r0 != r3) goto L_0x00f3
            return r1
        L_0x00f3:
            X.DNU r1 = new X.DNU
            r1.<init>(r7, r14, r5, r4)
            r0 = 0
            X.DFL r5 = X.CC3.A00(r0, r1, r3)
            if (r2 == 0) goto L_0x0198
            X.Cip r2 = r2.A00
            X.CrK r1 = r13.A00
            java.util.Map r0 = r2.A06
            X.CrK r1 = r1.A05(r0)
            X.CZq r0 = r2.A00
            X.CrK r1 = r1.A01(r0)
            java.util.List r0 = r2.A03
            X.CrK r1 = r1.A02(r0)
            java.util.Map r0 = r2.A07
            X.CrK r1 = r1.A06(r0)
            java.util.List r0 = r2.A04
            X.CrK r0 = r1.A03(r0)
            r13.A00 = r0
            java.util.List r0 = r13.A08
            r0.add(r2)
            java.util.List r2 = r2.A05
            if (r2 == 0) goto L_0x0198
            java.util.List r1 = r5.A0A
            X.C28111Yx.A02(r1)
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            java.lang.String r4 = X.C25339Cdy.A00(r0, r1)
            java.util.Iterator r8 = r2.iterator()
        L_0x013b:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0198
            java.lang.Object r7 = r8.next()
            X.E2f r7 = (X.C28464E2f) r7
            r1 = r7
            X.DNb r1 = (X.C26953DNb) r1
            java.lang.String r0 = r1.A00
            java.lang.String r3 = X.C25339Cdy.A01(r0, r4)
            X.CrK r0 = r13.A00
            java.util.Map r0 = r0.A08
            boolean r0 = r0.containsKey(r3)
            if (r0 != 0) goto L_0x013b
            java.lang.String r6 = r1.A01
            java.util.Map r0 = r13.A0A
            java.lang.Object r2 = r0.get(r6)
            X.E89 r2 = (X.E89) r2
            if (r2 == 0) goto L_0x018d
            r0 = 0
            X.Boh r1 = r13.A00(r5, r0, r0)
            X.CrK r0 = r13.A00
            java.util.Map r0 = r0.A01
            java.lang.Object r0 = r0.get(r6)
            X.E88 r2 = r2.BSv(r7, r1, r0)
            X.CrK r1 = r13.A00
            java.lang.Object r0 = r2.BSx()
            java.util.Map r0 = java.util.Collections.singletonMap(r3, r0)
            X.CrK r0 = r1.A07(r0)
            r13.A00 = r0
            java.util.HashMap r0 = r13.A06
            r0.put(r3, r2)
            goto L_0x013b
        L_0x018d:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Missing variable module with type: "
            java.lang.RuntimeException r0 = X.BEA.A0g(r0, r6, r1)
            throw r0
        L_0x0198:
            return r5
        L_0x0199:
            java.lang.String r3 = r6.A01
            java.lang.String r0 = "["
            java.lang.StringBuilder r2 = X.BE6.A0u(r0)
            java.util.Iterator r1 = r4.iterator()
        L_0x01a5:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x01b5
            X.DFL r0 = X.BE6.A0d(r1)
            int r0 = r0.A05
            X.BE8.A1D(r2, r0)
            goto L_0x01a5
        L_0x01b5:
            java.lang.String r0 = "]"
            java.lang.StringBuilder r1 = X.AnonymousClass8BT.A0y(r0, r2)
            java.lang.String r0 = "BloksCrash: children-binding index "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = " scopeKey: "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = " out of bounds for array of size "
            X.C17890vO.A15(r0, r1, r4)
            java.lang.String r0 = " "
            java.lang.String r0 = X.BEA.A0j(r2, r0, r1)
            java.lang.IndexOutOfBoundsException r0 = X.BE6.A0l(r0)
            throw r0
        L_0x01db:
            return r2
        L_0x01dc:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26172Ctp.A02(X.CXc, X.DFL, X.DFL, java.lang.Object, java.util.List, java.util.Map):X.DFL");
    }
}
