package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import org.json.JSONObject;

/* renamed from: X.A8q  reason: case insensitive filesystem */
public final class C20130A8q {
    public C20129A8p A00;
    public final C182799Vt A01;
    public final C56592hi A02;
    public final C51522Yp A03;
    public final AnonymousClass1KB A04;
    public final AnonymousClass11P A05;
    public final C18030ve A06;
    public final C197679x5 A07;
    public final C176168zt A08;
    public final C176178zu A09;
    public final AnonymousClass9YC A0A;
    public final C53682cv A0B;
    public final C189549jQ A0C;
    public final C189559jR A0D = ((C189559jR) AnonymousClass12Q.A01(49490));
    public final C192089nm A0E;
    public final C193199ph A0F;
    public final C190349kn A0G;
    public final String A0H;
    public final Map A0I;
    public final Map A0J;
    public final Map A0K;
    public final Map A0L;
    public final AnonymousClass1OZ A0M;
    public final AnonymousClass9RC A0N = ((AnonymousClass9RC) C221618v.A01(49487));
    public final AnonymousClass00H A0O;

    private final C178759Ei A00() {
        AnonymousClass1D6[] r2 = new AnonymousClass1D6[2];
        C72463Mc.A1H("session-id", this.A0D.A00(), r2);
        C108985cd.A1G("bloks-versioning-id", "4a8a6a30659ce032132e4419bd9a779d6c626ff94a5d708eb753e8e100bbd3eb", r2);
        LinkedHashMap A0B2 = AnonymousClass1D7.A0B(r2);
        C18070vi.A0z(A0B2, "null cannot be cast to non-null type kotlin.collections.Map<*, *>");
        return new C178759Ei(AnonymousClass8BW.A0m(A0B2), 10);
    }

    public static final LinkedHashMap A02(List list) {
        AbstractCollection abstractCollection;
        if (list == null) {
            return null;
        }
        LinkedHashMap A13 = C17880vN.A13();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Map map = (Map) it.next();
            if (!map.containsKey("is_entry_screen") || C18070vi.A19(map.get("is_entry_screen"), false)) {
                Object obj = map.get("sources");
                if ((obj instanceof ArrayList) && (abstractCollection = (AbstractCollection) obj) != null) {
                    Iterator it2 = abstractCollection.iterator();
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        Set set = (Set) A13.get(next);
                        if (set == null) {
                            set = C17880vN.A14();
                            A13.put(next, set);
                        }
                        set.add(new C193979qy(AnonymousClass8BW.A0g("app_id", map), AnonymousClass8BS.A0u("bloks_server_params", map)));
                    }
                }
            }
        }
        return A13;
    }

    public final void A0A(BBN bbn, C194579rx r25, Integer num, String str) {
        String str2;
        AnonymousClass90P r16;
        int i;
        C29621ca r3;
        String str3;
        String str4;
        C194579rx r2 = r25;
        int hashCode = r2.hashCode();
        String str5 = r2.A00;
        C176168zt r10 = this.A08;
        r10.A00(hashCode, str5);
        r10.A01(hashCode, "config_name", str5);
        AnonymousClass1OZ r0 = this.A0M;
        String A0B2 = r0.A0B();
        int hashCode2 = r2.hashCode();
        int intValue = num.intValue();
        switch (intValue) {
            case 1:
                str2 = "SET";
                break;
            default:
                str2 = "GET";
                break;
        }
        r10.A01.A03(hashCode2, "iqRequest");
        r10.A01(hashCode2, "iq_type", str2);
        r10.A01(hashCode2, "session_id", this.A0D.A00());
        BBN bbn2 = bbn;
        String str6 = str;
        if (intValue == 0) {
            Map map = r2.A02;
            if (map != null) {
                C17960vV.A07(map);
                LinkedHashMap A13 = C17880vN.A13();
                Iterator A15 = AnonymousClass000.A15(map);
                while (A15.hasNext()) {
                    Map.Entry A16 = AnonymousClass000.A16(A15);
                    if (A16.getValue() != null) {
                        C108985cd.A1R(A13, A16);
                    }
                }
                str3 = AnonymousClass8BU.A0s(A13);
            } else {
                str3 = null;
            }
            AnonymousClass9F6 r102 = new AnonymousClass9F6(new C178709Ed(A00()), A0B2, str5, r2.A01, str3, 17);
            r3 = (C29621ca) r102.A00;
            r16 = new AnonymousClass90P(bbn2, this, r2, r102, str6, 0);
            i = 302;
        } else if (intValue == 1) {
            Map map2 = r2.A02;
            if (map2 != null) {
                C17960vV.A07(map2);
                LinkedHashMap A132 = C17880vN.A13();
                Iterator A152 = AnonymousClass000.A15(map2);
                while (A152.hasNext()) {
                    Map.Entry A162 = AnonymousClass000.A16(A152);
                    if (A162.getValue() != null) {
                        C108985cd.A1R(A132, A162);
                    }
                }
                str4 = AnonymousClass8BU.A0s(A132);
            } else {
                str4 = null;
            }
            AnonymousClass9F6 r103 = new AnonymousClass9F6(new C178709Ed(A00()), A0B2, str5, r2.A01, str4, 18);
            r3 = (C29621ca) r103.A00;
            r16 = new AnonymousClass90P(bbn2, this, r2, r103, str6, 1);
            i = 303;
        } else {
            return;
        }
        r0.A0I(r16, r3, A0B2, i, 32000);
    }

    public void A0B(B9G b9g, C22521BBe bBe, C194579rx r19, String str, String str2, Map map) {
        C194579rx r4 = r19;
        String str3 = r4.A00;
        String str4 = str2;
        if (str2 != null) {
            this.A0J.put(str3, str4);
        }
        int hashCode = hashCode();
        C176178zu r5 = this.A09;
        r5.A00(hashCode, str3);
        r5.A01(hashCode, "config_name", str3);
        C189559jR r6 = this.A0D;
        r6.A00 = null;
        String A002 = r6.A00();
        JSONObject A12 = AnonymousClass8BU.A12("config", str3);
        A12.put("isStartingState", true);
        A12.put("sessionId", A002);
        String str5 = str;
        A12.put("referral", str5);
        this.A0I.put(C179599Ip.SESSION_ID.key, r6.A00());
        r6.A00();
        C189549jQ r2 = this.A0C;
        String str6 = this.A0H;
        synchronized (r2) {
            C18070vi.A0d(str6, 0);
            r2.A00.put(str6, this);
        }
        r5.A01.A03(hashCode, "iqRequest");
        r5.A01(hashCode, "iq_type", "GET");
        r5.A01(hashCode, "session_id", r6.A00());
        A0A(new AZO(this, b9g, bBe, str3, str5, map, hashCode), r4, AnonymousClass00R.A00, str3);
    }

    public final void A0D(C178369Cv r10) {
        C18070vi.A0d(r10, 0);
        int hashCode = hashCode();
        String str = this.A0H;
        C18070vi.A0d(str, 2);
        C195329tA r2 = ((C190199kX) this.A0O.get()).A00;
        String str2 = r10.A01;
        String A002 = C19943A0a.A00(Integer.valueOf(hashCode));
        if (A002 == null) {
            A002 = "";
        }
        r2.A01((C191549mm) null, AnonymousClass000.A0i(), str2, A002, str, "");
    }

    public final void A0E(String str, String str2) {
        List list;
        String str3 = str2;
        C18070vi.A0d(str3, 1);
        C197679x5 r9 = this.A07;
        Map map = this.A0I;
        String str4 = this.A0H;
        C18070vi.A0k(map, str4);
        HashMap A012 = A3M.A01(str3);
        if (!A012.isEmpty()) {
            LinkedHashMap A13 = C17880vN.A13();
            Object obj = A012.get("states");
            C18070vi.A0z(obj, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
            Iterator A15 = AnonymousClass000.A15((Map) obj);
            while (A15.hasNext()) {
                Map.Entry A16 = AnonymousClass000.A16(A15);
                String A0x = C17880vN.A0x(A16);
                Object value = A16.getValue();
                C18070vi.A0z(value, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
                C184829ba A002 = C197679x5.A00(r9, A0x, str, str4, (Map) value, map);
                if (A002 != null) {
                    A13.put(A16.getKey(), A002);
                }
            }
            Object obj2 = A012.get("next_screens");
            if (obj2 instanceof List) {
                list = (List) obj2;
            } else {
                list = null;
            }
            Object obj3 = A012.get("start_at");
            AnonymousClass8BR.A1I(obj3);
            C18070vi.A0d(obj3, 1);
            A07(this, (ADL) null, list, false);
            return;
        }
        throw AnonymousClass000.A0n("PslJsonParser/parseStatesFromPsl Invalid JSON is passed");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: X.90O} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: X.90M} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: X.9ba} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: X.90L} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v5, resolved type: X.90N} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v6, resolved type: X.90N} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v7, resolved type: X.90N} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v8, resolved type: X.90N} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: X.90N} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.LinkedHashMap A01(X.C20130A8q r23, X.AnonymousClass9DH r24, java.lang.String r25) {
        /*
            r0 = r24
            java.lang.Object r1 = r0.A01
            java.util.List r1 = (java.util.List) r1
            java.util.ArrayList r0 = X.AnonymousClass000.A13()
            java.util.Iterator r9 = r1.iterator()
        L_0x000e:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L_0x017f
            java.lang.Object r1 = r9.next()
            X.9DO r1 = (X.AnonymousClass9DO) r1
            java.lang.Object r1 = r1.A00
            X.B6I r1 = (X.B6I) r1
            boolean r2 = r1 instanceof X.C178619Du
            r12 = 0
            r6 = r23
            if (r2 == 0) goto L_0x0097
            X.9Du r1 = (X.C178619Du) r1
            X.9Cy r7 = r1.A00
            java.lang.String r5 = r7.A01
            java.lang.String r4 = r1.A02
            java.lang.String r2 = r7.A00
            java.util.Map r20 = X.AnonymousClass9RE.A00(r2)
            java.lang.String r2 = r1.A05
            java.util.Map r8 = X.AnonymousClass9RE.A00(r2)
            if (r8 == 0) goto L_0x0094
            X.9Ip r2 = X.C179599Ip.ADDITIONAL_PARAMS
            java.lang.String r3 = r2.key
            java.util.Map r2 = r6.A0I
            X.1D6 r2 = X.AnonymousClass1D6.A01(r3, r2)
            java.util.Map r21 = X.AnonymousClass1D7.A0G(r8, r2)
        L_0x0049:
            java.lang.String r2 = r7.A04
            java.util.Map r22 = X.AnonymousClass9RE.A00(r2)
            java.lang.String r2 = r7.A03
            if (r2 != 0) goto L_0x008f
            java.lang.String r17 = "$"
        L_0x0055:
            java.lang.String r6 = r7.A02
            java.lang.String r3 = r1.A03
            if (r3 != 0) goto L_0x005d
            java.lang.String r3 = "replace"
        L_0x005d:
            java.lang.String r7 = r1.A04
            if (r7 == 0) goto L_0x008d
            org.json.JSONTokener r2 = new org.json.JSONTokener
            r2.<init>(r7)
            java.lang.Object r2 = r2.nextValue()
            X.C18070vi.A0b(r2)
            java.lang.Object r13 = X.C20064A5n.A00(r2)
        L_0x0071:
            java.lang.String r1 = r1.A01
            if (r1 == 0) goto L_0x007a
            X.9zB r12 = new X.9zB
            r12.<init>(r1)
        L_0x007a:
            X.90N r10 = new X.90N
            r14 = r25
            r11 = r10
            r15 = r5
            r16 = r4
            r18 = r6
            r19 = r3
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
        L_0x0089:
            r0.add(r10)
            goto L_0x000e
        L_0x008d:
            r13 = r12
            goto L_0x0071
        L_0x008f:
            java.lang.String r17 = X.AnonymousClass8BW.A0h(r2)
            goto L_0x0055
        L_0x0094:
            r21 = r12
            goto L_0x0049
        L_0x0097:
            boolean r2 = r1 instanceof X.C178599Ds
            if (r2 == 0) goto L_0x00e8
            X.9Ds r1 = (X.C178599Ds) r1
            X.9Cy r2 = r1.A00
            java.lang.String r6 = r2.A01
            java.lang.String r5 = r1.A02
            java.util.List r2 = r1.A03
            java.util.ArrayList r7 = X.C29351c6.A0E(r2)
            java.util.Iterator r3 = r2.iterator()
        L_0x00ad:
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto L_0x00bf
            java.lang.Object r2 = r3.next()
            X.9DN r2 = (X.AnonymousClass9DN) r2
            java.lang.Object r2 = r2.A00
            r7.add(r2)
            goto L_0x00ad
        L_0x00bf:
            java.util.ArrayList r4 = X.C29351c6.A0E(r7)
            java.util.Iterator r3 = r7.iterator()
        L_0x00c7:
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto L_0x00d9
            java.lang.Object r2 = r3.next()
            X.9CY r2 = (X.AnonymousClass9CY) r2
            java.lang.String r2 = r2.A01
            r4.add(r2)
            goto L_0x00c7
        L_0x00d9:
            java.lang.String r1 = r1.A01
            if (r1 == 0) goto L_0x00e2
            X.9zB r12 = new X.9zB
            r12.<init>(r1)
        L_0x00e2:
            X.90L r10 = new X.90L
            r10.<init>(r12, r6, r5, r4)
            goto L_0x0089
        L_0x00e8:
            boolean r2 = r1 instanceof X.C178569Dp
            if (r2 == 0) goto L_0x00fc
            X.9Dp r1 = (X.C178569Dp) r1
            X.9Cy r1 = r1.A00
            java.lang.String r2 = r1.A01
            r1 = 1
            X.C18070vi.A0d(r2, r1)
            X.90K r10 = new X.90K
            r10.<init>(r2, r12)
            goto L_0x0089
        L_0x00fc:
            boolean r2 = r1 instanceof X.C178579Dq
            if (r2 == 0) goto L_0x0126
            X.9Dq r1 = (X.C178579Dq) r1
            X.9Cy r3 = r1.A00
            java.lang.String r11 = r3.A01
            java.lang.String r2 = r3.A00
            java.util.Map r14 = X.AnonymousClass9RE.A00(r2)
            java.lang.String r1 = r1.A01
            java.util.Map r15 = X.AnonymousClass9RE.A00(r1)
            java.lang.String r1 = r3.A03
            if (r1 != 0) goto L_0x0121
            java.lang.String r12 = "$"
        L_0x0118:
            java.lang.String r13 = r3.A02
            X.90M r10 = new X.90M
            r10.<init>(r11, r12, r13, r14, r15)
            goto L_0x0089
        L_0x0121:
            java.lang.String r12 = X.AnonymousClass8BW.A0h(r1)
            goto L_0x0118
        L_0x0126:
            boolean r2 = r1 instanceof X.C178609Dt
            if (r2 == 0) goto L_0x000e
            X.9Vt r5 = r6.A01
            X.9Dt r1 = (X.C178609Dt) r1
            X.9Cy r3 = r1.A00
            java.lang.String r14 = r3.A01
            java.lang.String r2 = r3.A00
            java.util.Map r20 = X.AnonymousClass9RE.A00(r2)
            java.lang.String r2 = r1.A04
            java.util.Map r21 = X.AnonymousClass9RE.A00(r2)
            java.lang.String r2 = r3.A04
            java.util.Map r22 = X.AnonymousClass9RE.A00(r2)
            java.lang.String r2 = r3.A03
            if (r2 != 0) goto L_0x017a
            java.lang.String r16 = "$"
        L_0x014a:
            java.lang.String r2 = r1.A01
            if (r2 == 0) goto L_0x0153
            X.9zB r12 = new X.9zB
            r12.<init>(r2)
        L_0x0153:
            java.lang.String r15 = r3.A02
            java.lang.String r3 = r1.A03
            java.lang.String r4 = r1.A02
            java.lang.String r2 = r6.A0H
            X.10F r1 = r5.A00
            X.10E r1 = r1.A00
            X.9jQ r13 = X.AnonymousClass8BV.A0H(r1)
            X.00S r1 = r1.AS6
            java.lang.Object r11 = r1.get()
            X.2hh r11 = (X.C56582hh) r11
            X.90O r10 = new X.90O
            r17 = r3
            r18 = r4
            r19 = r2
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            goto L_0x0089
        L_0x017a:
            java.lang.String r16 = X.AnonymousClass8BW.A0h(r2)
            goto L_0x014a
        L_0x017f:
            int r1 = X.C200510q.A00(r0)
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>(r1)
            java.util.Iterator r2 = r0.iterator()
        L_0x018c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x019f
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.9ba r0 = (X.C184829ba) r0
            java.lang.String r0 = r0.A01
            r3.put(r0, r1)
            goto L_0x018c
        L_0x019f:
            java.util.Iterator r1 = X.AnonymousClass000.A15(r3)
        L_0x01a3:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x01b1
            java.util.Map$Entry r0 = X.AnonymousClass000.A16(r1)
            r0.getValue()
            goto L_0x01a3
        L_0x01b1:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20130A8q.A01(X.A8q, X.9DH, java.lang.String):java.util.LinkedHashMap");
    }

    public static final void A03(C192689oo r6, C20130A8q a8q, Long l, String str, String str2, int i) {
        C222119a r0 = r6.A01;
        int i2 = i;
        r0.A03(i, str);
        if (l != null) {
            r0.A09(str2, i2, l.longValue(), true);
        }
        r6.A01(i, "session_id", a8q.A0D.A00());
    }

    public static final void A04(C20130A8q a8q) {
        C190349kn r2 = a8q.A0G;
        String str = a8q.A0H;
        synchronized (r2) {
            C18070vi.A0d(str, 0);
            r2.A00.remove(str);
        }
        C189549jQ r22 = a8q.A0C;
        synchronized (r22) {
            r22.A00.remove(str);
        }
        Stack stack = a8q.A0A.A00;
        stack.clear();
        stack.add(C17880vN.A11());
        a8q.A00 = null;
    }

    public static final void A05(C20130A8q a8q, B9G b9g, C22521BBe bBe, ADL adl, String str, String str2, String str3, String str4, List list, Map map, Map map2, Map map3, Map map4, int i, boolean z, boolean z2) {
        String str5;
        Map map5 = map2;
        C56592hi r3 = a8q.A02;
        String str6 = a8q.A0H;
        C193199ph r0 = a8q.A0F;
        if (r0 != null) {
            str5 = r0.A00;
        } else {
            str5 = null;
        }
        C20129A8p A002 = r3.A00(a8q.A0A, str, str2, str6, str5, str4);
        a8q.A00 = A002;
        A002.A09 = map4;
        A002.A08 = list;
        C189549jQ r4 = a8q.A0C;
        synchronized (r4) {
            C18070vi.A0d(str6, 0);
            r4.A00.put(str6, a8q);
        }
        b9g.Bul(A002.A0N);
        Map map6 = map;
        A09(a8q, map6);
        if (z2) {
            C190349kn r42 = a8q.A0G;
            synchronized (r42) {
                r42.A00.put(str6, adl);
            }
        }
        Map A0h = C108975cc.A0h(C179599Ip.REFERRAL.key, PublicKeyCredentialControllerUtility.JSON_KEY_EXTENSTIONS);
        if (map2 == null) {
            map5 = AnonymousClass1D7.A0I();
        }
        A002.A0B(new AZI(a8q, bBe, 1), str3, AnonymousClass1D7.A09(A0h, map5), map3, z);
        Long A0n = C17880vN.A0n(map6.size());
        C176178zu r11 = a8q.A09;
        int i2 = i;
        A03(r11, a8q, A0n, "initializeStateMachine", "num_states", i2);
        r11.A01.A04(i2, 467);
    }

    public static final void A07(C20130A8q a8q, ADL adl, List list, boolean z) {
        if (z) {
            C190349kn r2 = a8q.A0G;
            String str = a8q.A0H;
            synchronized (r2) {
                C18070vi.A0d(str, 0);
                r2.A00.put(str, adl);
            }
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Map map = (Map) it.next();
                if (C72463Mc.A1Y(map.get("is_entry_screen"))) {
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("FdsManager:fetchEntryScreenForPslConfig prefetch ");
                    C17900vP.A0b(map.get("app_id"), A10);
                    ((C190199kX) a8q.A0O.get()).A00(AnonymousClass8BW.A0g("app_id", map), a8q.A0H, AnonymousClass8BS.A0u("bloks_server_params", map), a8q.hashCode());
                }
            }
        }
    }

    public static final void A08(C20130A8q a8q, AnonymousClass9DH r2) {
        B9H b9h = (B9H) a8q.A0L.get(r2.A02);
        if (b9h != null) {
            b9h.CCh(r2.A03());
        }
    }

    public static final void A09(C20130A8q a8q, Map map) {
        ((Map) AnonymousClass8BT.A0s(a8q.A0A.A00)).putAll(map);
        Iterator A15 = AnonymousClass000.A15(map);
        while (A15.hasNext()) {
            AnonymousClass000.A16(A15).getValue();
        }
    }

    public final void A0C(B9G b9g, C22521BBe bBe, ADL adl, String str, String str2, String str3, Map map, boolean z) {
        String str4;
        List list;
        Object obj;
        Map map2;
        String str5 = str2;
        C18070vi.A0d(str5, 1);
        int hashCode = hashCode();
        C176178zu r1 = this.A09;
        String str6 = str;
        r1.A00(hashCode, str6);
        r1.A01(hashCode, "config_name", str6);
        C192089nm r12 = this.A0E;
        C193199ph r0 = this.A0F;
        if (r0 != null) {
            str4 = r0.A00;
        } else {
            str4 = null;
        }
        C192819p2 A002 = r12.A00(str4);
        B9G b9g2 = b9g;
        C22521BBe bBe2 = bBe;
        ADL adl2 = adl;
        String str7 = str3;
        Map map3 = map;
        boolean z2 = z;
        if (A002 == null || A002.A00() == null) {
            C197679x5 r11 = this.A07;
            Map map4 = this.A0I;
            String str8 = this.A0H;
            AnonymousClass3Ma.A1O(map4, 2, str8);
            HashMap A012 = A3M.A01(str5);
            if (!A012.isEmpty()) {
                LinkedHashMap A13 = C17880vN.A13();
                Object obj2 = A012.get("states");
                C18070vi.A0z(obj2, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
                Iterator A15 = AnonymousClass000.A15((Map) obj2);
                while (A15.hasNext()) {
                    Map.Entry A16 = AnonymousClass000.A16(A15);
                    String A0x = C17880vN.A0x(A16);
                    Object value = A16.getValue();
                    C18070vi.A0z(value, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
                    C184829ba A003 = C197679x5.A00(r11, A0x, str6, str8, (Map) value, map4);
                    if (A003 != null) {
                        A13.put(A16.getKey(), A003);
                    }
                }
                Object obj3 = A012.get("next_screens");
                if (obj3 instanceof List) {
                    list = (List) obj3;
                } else {
                    list = null;
                }
                Object obj4 = A012.get("start_at");
                AnonymousClass8BR.A1I(obj4);
                String str9 = (String) obj4;
                C18070vi.A0d(str9, 1);
                A06(this, b9g2, bBe2, adl2, str6, str9, str7, list, map3, A13, hashCode, z2);
                return;
            }
            throw AnonymousClass000.A0n("PslJsonParser/parseStatesFromPsl Invalid JSON is passed");
        }
        C195649tg r5 = A002.A03;
        List list2 = r5.A05;
        LinkedHashMap A022 = A02(list2);
        Map map5 = r5.A06;
        String A004 = A002.A00();
        if (A004 != null) {
            AnonymousClass1D6[] r13 = new AnonymousClass1D6[2];
            C72463Mc.A1H(C179599Ip.REFERRAL.key, PublicKeyCredentialControllerUtility.JSON_KEY_EXTENSTIONS, r13);
            r13[1] = AnonymousClass1D6.A01("overwrite_first_screen_presentation", map5);
            LinkedHashMap A0B2 = AnonymousClass1D7.A0B(r13);
            ListIterator A18 = C108955ca.A18(A002.A06);
            do {
                obj = null;
                if (!A18.hasPrevious()) {
                    break;
                }
                obj = A18.previous();
            } while (!C18070vi.A18(((C195039sh) obj).A01, A004));
            C195039sh r14 = (C195039sh) obj;
            if (r14 == null || (map2 = r14.A02) == null) {
                map2 = AnonymousClass1D7.A0I();
            }
            LinkedHashMap A092 = AnonymousClass1D7.A09(A0B2, map2);
            A05(this, b9g2, bBe2, adl2, str6, r5.A03, A004, str7, (List) null, r5.A07, map3, A092, A022, hashCode, true, z2);
            return;
        }
        A06(this, b9g2, bBe2, adl2, str6, r5.A04, str7, list2, map3, r5.A07, hashCode, z2);
    }

    public C20130A8q(C182799Vt r6, C56592hi r7, C51522Yp r8, AnonymousClass1KB r9, AnonymousClass11P r10, C18030ve r11, AnonymousClass1OZ r12, C197679x5 r13, C176168zt r14, C176178zu r15, AnonymousClass9YC r16, C53682cv r17, C189549jQ r18, C193199ph r19, C190349kn r20, AnonymousClass00H r21, Map map) {
        String A0Q;
        C192819p2 A002;
        C18070vi.A0s(r10, r11, r9, r12);
        C189549jQ r3 = r18;
        C18070vi.A0d(r3, 7);
        C72473Md.A1K(r6, r14);
        C190349kn r4 = r20;
        AnonymousClass00H r2 = r21;
        Map map2 = map;
        C18070vi.A0y(r7, r8, r4, r2, map2);
        C18070vi.A0d(r15, 16);
        this.A05 = r10;
        this.A06 = r11;
        this.A04 = r9;
        this.A0M = r12;
        this.A07 = r13;
        this.A0A = r16;
        this.A0C = r3;
        this.A0B = r17;
        this.A01 = r6;
        this.A08 = r14;
        this.A02 = r7;
        this.A03 = r8;
        this.A0G = r4;
        this.A0O = r2;
        this.A0K = map2;
        this.A09 = r15;
        C193199ph r22 = r19;
        this.A0F = r22;
        C192089nm r1 = (C192089nm) C221618v.A01(49488);
        this.A0E = r1;
        if (r19 == null || (A002 = r1.A00(r22.A00)) == null || A002.A00() == null) {
            A0Q = C17890vO.A0Q();
            C18070vi.A0b(A0Q);
        } else {
            A0Q = A002.A03.A02;
        }
        this.A0H = A0Q;
        this.A0L = C17880vN.A13();
        this.A0I = C17880vN.A13();
        this.A0J = C17880vN.A11();
    }

    public void A0F(Map map) {
        if (AnonymousClass8BR.A1Y(map)) {
            this.A0I.putAll(map);
        }
    }

    /* JADX WARNING: type inference failed for: r35v0, types: [X.9pE, java.lang.Object] */
    public static final void A06(C20130A8q a8q, B9G b9g, C22521BBe bBe, ADL adl, String str, String str2, String str3, List list, Map map, Map map2, int i, boolean z) {
        Map map3;
        Object obj;
        String str4;
        Map map4 = map;
        C20130A8q a8q2 = a8q;
        String A002 = a8q2.A0D.A00();
        ADL adl2 = adl;
        List<Map> list2 = list;
        boolean z2 = z;
        A07(a8q2, adl2, list2, z2);
        LinkedHashMap A022 = A02(list2);
        ArrayList A13 = AnonymousClass000.A13();
        ArrayList arrayList = null;
        if (list != null) {
            for (Map map5 : list2) {
                Object obj2 = map5.get("is_entry_screen");
                if (!(obj2 instanceof Boolean)) {
                    obj2 = null;
                }
                if (C72463Mc.A1Y(obj2)) {
                    Map A0u = AnonymousClass8BS.A0u("bloks_server_params", map5);
                    if (A0u != null) {
                        obj = A0u.get("screen_id");
                    } else {
                        obj = null;
                    }
                    if (!(!(obj instanceof String) || (str4 = (String) obj) == null || str4.length() == 0)) {
                        A13.add(str4);
                    }
                }
            }
        }
        if (!A13.isEmpty()) {
            arrayList = A13;
        }
        Map A0h = C108975cc.A0h(C179599Ip.REFERRAL.key, PublicKeyCredentialControllerUtility.JSON_KEY_EXTENSTIONS);
        if (map == null) {
            map4 = AnonymousClass1D7.A0I();
        }
        LinkedHashMap A092 = AnonymousClass1D7.A09(A0h, map4);
        C193199ph r3 = a8q2.A0F;
        String str5 = str;
        String str6 = str2;
        Map map6 = map2;
        if (r3 != null) {
            if (C18020vd.A05(C18040vf.A02, a8q2.A06, 3374)) {
                C192089nm r6 = a8q2.A0E;
                String str7 = r3.A00;
                if (r6.A00(str7) == null) {
                    Map map7 = (Map) A092.get("overwrite_first_screen_presentation");
                    C51522Yp r2 = a8q2.A03;
                    ? obj3 = new Object();
                    String str8 = a8q2.A0H;
                    if (map7 != null) {
                        map3 = AnonymousClass1D7.A0F(map7);
                    } else {
                        map3 = null;
                    }
                    C195649tg r27 = new C195649tg(str5, A002, str8, str6, list2, map3, map6);
                    System.currentTimeMillis();
                    AnonymousClass10E r0 = r2.A00.A00;
                    C192819p2 r32 = new C192819p2(AnonymousClass10E.A6O(r0), AnonymousClass10E.AGi(r0), obj3, r27, str7);
                    synchronized (r6) {
                        Map map8 = r6.A00;
                        if (map8.size() >= 3) {
                            Iterator A0x = AnonymousClass8BU.A0x(map8);
                            if (A0x.hasNext()) {
                                Object next = A0x.next();
                                while (A0x.hasNext()) {
                                    Object A0v = C17880vN.A0v(A0x);
                                    next = (String) next;
                                    C192819p2 r1 = (C192819p2) map8.get(next);
                                    C192819p2 r02 = (C192819p2) map8.get(A0v);
                                    if (!(r1 == null || r02 == null || r1.A00 < r02.A00)) {
                                        next = A0v;
                                    }
                                }
                                map8.remove(next);
                            } else {
                                throw new UnsupportedOperationException("Empty collection can't be reduced.");
                            }
                        }
                        map8.put(r32.A04, r32);
                    }
                }
            }
        }
        A05(a8q2, b9g, bBe, adl2, str5, A002, str6, str3, arrayList, map6, A092, (Map) null, A022, i, false, z2);
    }
}
