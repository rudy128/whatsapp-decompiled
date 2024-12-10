package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.CvV  reason: case insensitive filesystem */
public class C26235CvV {
    public final C25609Cip A00;
    public final DFL A01;
    public final String A02;

    public static C26235CvV A00(C23736Boh boh, DFL dfl) {
        Object obj;
        DFL dfl2 = dfl;
        if (boh == null || dfl.A05 != 13901) {
            List list = Collections.EMPTY_LIST;
            Map map = Collections.EMPTY_MAP;
            return new C26235CvV(dfl2, CCE.A00(map), (String) null, list, list, list, list, (List) null, map, (Map) null);
        }
        E8A A0A = dfl.A0A(35);
        if (A0A != null) {
            try {
                obj = CCJ.A00(C199029zJ.A01, A0A, boh);
            } catch (C27230Da9 e) {
                C25913CoX.A00(boh.A00, "BloksParseResult", "Exception executing Parse Embedded expression", e);
                obj = A01(new DFL(13320));
            }
            return (C26235CvV) obj;
        }
        throw AnonymousClass000.A0k("ParseResultWrapper doesn't have a parse result!");
    }

    @Deprecated
    public static C26235CvV A01(DFL dfl) {
        List list = Collections.EMPTY_LIST;
        Map map = Collections.EMPTY_MAP;
        return new C26235CvV(dfl, CCE.A00(map), (String) null, list, list, list, list, (List) null, map, (Map) null);
    }

    public static C26235CvV A02(CUK cuk, List list) {
        String str = null;
        Map A04 = A04(cuk.A08);
        DFL dfl = cuk.A00;
        dfl.getClass();
        List list2 = cuk.A07;
        ArrayList A13 = AnonymousClass000.A13();
        if (list2 != null) {
            A13.addAll(list2);
        }
        if (list != null) {
            A13.addAll(list);
        }
        List list3 = cuk.A06;
        List list4 = cuk.A09;
        if (list4 == null) {
            list4 = Collections.EMPTY_LIST;
        }
        C25140CZq cZq = cuk.A02;
        if (cZq == null) {
            cZq = CCE.A00(Collections.EMPTY_MAP);
        }
        List list5 = cuk.A0A;
        if (list5 == null) {
            list5 = Collections.emptyList();
        }
        Map map = cuk.A0F;
        List list6 = cuk.A0E;
        COF cof = cuk.A01;
        if (cof != null) {
            str = cof.A00;
        }
        return new C26235CvV(dfl, cZq, str, A13, list3, list4, list5, list6, A04, map);
    }

    public static Map A04(List list) {
        if (list == null) {
            return Collections.EMPTY_MAP;
        }
        HashMap hashMap = new HashMap(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            COE coe = (COE) it.next();
            hashMap.put(coe.A01, coe);
        }
        return hashMap;
    }

    public C26235CvV(C25609Cip cip, DFL dfl, String str) {
        this.A00 = cip;
        this.A01 = dfl;
        this.A02 = str;
    }

    public static HashMap A03(List list, Map map) {
        HashMap A11 = C17880vN.A11();
        HashMap A10 = BE6.A10(map);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            COD cod = (COD) it.next();
            if (map.containsKey(cod.A01)) {
                A11.put(cod.A00, A10.remove(cod.A01));
            }
        }
        A11.putAll(A10);
        return A11;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C26235CvV(X.DFL r22, X.C25140CZq r23, java.lang.String r24, java.util.List r25, java.util.List r26, java.util.List r27, java.util.List r28, java.util.List r29, java.util.Map r30, java.util.Map r31) {
        /*
            r21 = this;
            r0 = 0
            r3 = r22
            X.C18070vi.A0d(r3, r0)
            if (r26 == 0) goto L_0x00b6
            java.util.ArrayList r4 = X.C29351c6.A0D(r26)
            java.util.Iterator r10 = r26.iterator()
        L_0x0010:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x00b7
            java.lang.Object r6 = r10.next()
            X.CTm r6 = (X.C25012CTm) r6
            java.util.HashMap r1 = r6.A07
            if (r1 == 0) goto L_0x006c
            int r0 = r1.size()
            int r0 = X.C200610r.A03(r0)
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r5.<init>(r0)
            java.util.Iterator r9 = X.C17890vO.A0i(r1)
        L_0x0031:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x006d
            java.util.Map$Entry r0 = X.AnonymousClass000.A16(r9)
            java.lang.Object r8 = r0.getKey()
            java.lang.String r0 = X.AnonymousClass8BR.A10(r0)
            X.DNn r1 = new X.DNn
            r1.<init>(r0)
            r0 = 2
            X.DFL r0 = X.DNW.A00(r3, r1, r0)
            if (r0 == 0) goto L_0x00a1
            java.lang.String r7 = r0.A0C()
            X.C18070vi.A0b(r7)
            int r2 = r0.A04
            java.util.List r0 = r0.A0A
            if (r0 == 0) goto L_0x0069
            java.util.List r1 = X.C29431cG.A0t(r0)
        L_0x0060:
            X.Caf r0 = new X.Caf
            r0.<init>(r1, r2, r7)
            r5.put(r8, r0)
            goto L_0x0031
        L_0x0069:
            X.0wS r1 = X.C18460wS.A00
            goto L_0x0060
        L_0x006c:
            r5 = 0
        L_0x006d:
            java.lang.String r2 = r6.A06
            X.C18070vi.A0X(r2)
            X.E8A r12 = r6.A00
            X.C18070vi.A0X(r12)
            X.E8A r13 = r6.A03
            X.E8A r14 = r6.A02
            java.util.Set r1 = r6.A08
            X.E8A r15 = r6.A01
            java.lang.Boolean r0 = r6.A04
            X.C18070vi.A0X(r0)
            boolean r19 = r0.booleanValue()
            java.lang.Boolean r0 = r6.A05
            X.C18070vi.A0X(r0)
            boolean r20 = r0.booleanValue()
            X.CbU r11 = new X.CbU
            r17 = r5
            r18 = r1
            r16 = r2
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r4.add(r11)
            goto L_0x0010
        L_0x00a1:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Failed to find async component container for "
            r1.append(r0)
            java.lang.String r0 = r6.A06
            java.lang.String r1 = X.AnonymousClass000.A0y(r0, r1)
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>(r1)
            throw r0
        L_0x00b6:
            r4 = 0
        L_0x00b7:
            X.Cip r1 = new X.Cip
            r6 = r23
            r7 = r25
            r10 = r27
            r8 = r28
            r11 = r29
            r12 = r30
            r13 = r31
            r5 = r1
            r9 = r4
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            r0 = r21
            r2 = r24
            r0.<init>(r1, r3, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26235CvV.<init>(X.DFL, X.CZq, java.lang.String, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.Map, java.util.Map):void");
    }
}
