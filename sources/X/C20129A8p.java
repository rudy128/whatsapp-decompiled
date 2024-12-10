package X;

import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.A8p  reason: case insensitive filesystem */
public final class C20129A8p {
    public int A00;
    public C187379fi A01;
    public A6G A02;
    public C192289o7 A03;
    public C184829ba A04;
    public C192819p2 A05;
    public Integer A06;
    public String A07;
    public List A08;
    public Map A09;
    public boolean A0A;
    public B5V A0B;
    public String A0C;
    public Map A0D;
    public boolean A0E;
    public final AnonymousClass1KB A0F;
    public final C176198zw A0G;
    public final AnonymousClass9YC A0H;
    public final C52452aw A0I;
    public final A2X A0J;
    public final AnonymousClass00H A0K;
    public final Runnable A0L;
    public final String A0M;
    public final String A0N;
    public final C24401Ke A0O;
    public final AnonymousClass195 A0P;
    public final C51452Yi A0Q;
    public final C189309is A0R;
    public final C51512Yo A0S;
    public final AnonymousClass9RC A0T = ((AnonymousClass9RC) C221618v.A01(49487));
    public final AnonymousClass9YB A0U;
    public final C189529jO A0V;
    public final C189539jP A0W;
    public final C192089nm A0X = ((C192089nm) C221618v.A01(49488));
    public final A2V A0Y;
    public final String A0Z;
    public final String A0a;
    public final String A0b;
    public final String A0c;

    /* JADX WARNING: type inference failed for: r5v3, types: [java.lang.Object, X.C5x] */
    public static final void A04(C20129A8p a8p, C19980A1q a1q, String str, Map map, Map map2, boolean z) {
        C36001nB b3m;
        Map map3;
        LinkedHashMap linkedHashMap;
        Integer num;
        Object obj;
        String str2;
        JSONObject jSONObject;
        C20129A8p a8p2 = a8p;
        AnonymousClass9YC r0 = a8p.A0H;
        C18070vi.A0d(str, 0);
        C184829ba r10 = (C184829ba) ((Map) AnonymousClass8BT.A0s(r0.A00)).get(str);
        if (r10 != null) {
            a8p.A0F.A0I(a8p.A0L);
            if (r10 instanceof AnonymousClass90L) {
                A03(a8p, r10, map);
                b3m = new C22334B3l(a8p);
            } else {
                String str3 = null;
                if (r10 instanceof AnonymousClass90N) {
                    if (!(map == null || map2 == null)) {
                        str3 = ((AnonymousClass90N) r10).A02;
                    }
                    AnonymousClass90N r102 = (AnonymousClass90N) r10;
                    Map A022 = A68.A00.A02(r102.A01, r102.A02, map, map2);
                    if (z) {
                        num = AnonymousClass00R.A01;
                    } else {
                        num = AnonymousClass00R.A00;
                    }
                    A02(a8p2, r102, a1q, num, str3, A022);
                    return;
                } else if ((r10 instanceof AnonymousClass90K) || (r10 instanceof AnonymousClass90M)) {
                    A03(a8p, r10, map);
                    b3m = new C22335B3m(a8p);
                } else if (r10 instanceof AnonymousClass90O) {
                    A03(a8p, r10, map);
                    AnonymousClass90O r103 = (AnonymousClass90O) r10;
                    if (z) {
                        C189539jP r2 = a8p.A0W;
                        C18070vi.A0d(r2, 2);
                        C17960vV.A0C(C18070vi.A18(r103.A04, "embedded"));
                        AnonymousClass90O.A00(r2, r103, a1q, r103.A00, map);
                        r103.A00 = null;
                        return;
                    }
                    C187379fi r02 = a8p.A01;
                    if (r02 == null) {
                        C18070vi.A11("flowManager");
                        throw null;
                    }
                    String str4 = (String) AnonymousClass8BT.A0s(r02.A03);
                    C189539jP r9 = a8p.A0W;
                    C18070vi.A0e(str4, 0, r9);
                    if (map == null) {
                        map3 = AnonymousClass1D7.A0I();
                    } else {
                        map3 = map;
                    }
                    Map A032 = C26065Crf.A03(map3, r103.A06);
                    String A0f = AnonymousClass8BW.A0f("state", A032);
                    String A0f2 = AnonymousClass8BW.A0f("error_map_type", A032);
                    Map A0v = AnonymousClass8BW.A0v("server_parameters", A032);
                    String str5 = r103.A05;
                    if (A0v != null) {
                        linkedHashMap = new LinkedHashMap(A0v);
                    } else {
                        linkedHashMap = null;
                    }
                    C194579rx r22 = new C194579rx(str5, A0f, linkedHashMap);
                    Map A0v2 = AnonymousClass8BW.A0v("state_machine_parameters", A032);
                    if (C18070vi.A18(r103.A04, "embedded")) {
                        r103.A00 = map;
                        C20130A8q A002 = r103.A02.A00(r103.A03);
                        C17960vV.A07(A002);
                        C18070vi.A0X(A002);
                        A002.A0A(new AZN(r9, r103, A002, A0f2, A0v2, map), r22, AnonymousClass00R.A00, str4);
                        return;
                    }
                    r103.A01.A00((C193199ph) null).A0B((B9G) null, new C20905AbL(r9, map, r103, 3), r22, "", A0f2, A0v2);
                    return;
                } else {
                    throw AnonymousClass000.A0k("Unsupported Type");
                }
            }
            C36001nB r3 = b3m;
            if (r10 instanceof AnonymousClass90K) {
                String str6 = r10.A00;
                if (map == null) {
                    map = AnonymousClass1D7.A0I();
                }
                r3.invoke(str6, map, (Object) null);
            } else if (r10 instanceof AnonymousClass90O) {
                throw C17880vN.A0y();
            } else if (r10 instanceof AnonymousClass90N) {
                throw C17880vN.A0y();
            } else if (r10 instanceof AnonymousClass90M) {
                AnonymousClass90M r104 = (AnonymousClass90M) r10;
                if (map == null) {
                    map = AnonymousClass1D7.A0I();
                }
                r3.invoke(r104.A00, C26065Crf.A01(r104.A00, C26065Crf.A02(map, r104.A01), C26065Crf.A03(map, r104.A02)), (Object) null);
            } else {
                AnonymousClass90L r105 = (AnonymousClass90L) r10;
                Object obj2 = null;
                if (map != null) {
                    jSONObject = new JSONObject(map);
                } else {
                    try {
                        jSONObject = C17880vN.A15();
                    } catch (Exception e) {
                        Log.e("FcsStateMachine", e);
                        if (e instanceof UnsupportedOperationException) {
                            str2 = "unsupportedComparisonTypes";
                        } else if (e instanceof ClassCastException) {
                            str2 = "comparingValuesWithDifferentTypes";
                        } else {
                            str2 = "genericChoiceStateError";
                        }
                        Object a1q2 = new C19980A1q((Integer) null, str2, e.getMessage());
                        C198949zB r03 = r105.A00;
                        if (r03 != null) {
                            obj2 = r03.A00(str2);
                        }
                        obj = obj2;
                        obj2 = a1q2;
                    }
                }
                List list = r105.A02;
                obj = r105.A01;
                C18070vi.A0d(list, 0);
                try {
                    ArrayList A13 = AnonymousClass000.A13();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        JSONObject A16 = C17880vN.A16(C17880vN.A0v(it));
                        if (A16.has("next")) {
                            String string = A16.getString("next");
                            EBR A003 = CDF.A00(A16);
                            if (A003 != null) {
                                C18070vi.A0b(string);
                                A13.add(new C184819bZ(A003, string));
                            }
                        }
                    }
                    C17960vV.A0F(C17880vN.A1X(A13), "expected at least 1 choice");
                    String A0H2 = C18070vi.A0H(jSONObject);
                    ? obj3 = new Object();
                    obj3.A00 = A0H2;
                    Iterator it2 = A13.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        C184819bZ r1 = (C184819bZ) it2.next();
                        if (r1.A00.BKb(obj3)) {
                            obj = r1.A01;
                            break;
                        }
                    }
                } catch (JSONException unused) {
                    obj = null;
                }
                r3.invoke(obj, map, obj2);
            }
        } else {
            throw AnonymousClass8BR.A0v(AnonymousClass001.A1H("state not found for name: ", str, AnonymousClass000.A10()));
        }
    }

    public static final void A05(C20129A8p a8p, C19980A1q a1q, String str, Map map, short s) {
        String str2;
        String str3;
        C20129A8p a8p2 = a8p;
        C192819p2 r1 = a8p.A05;
        if (r1 != null) {
            r1.A01 = false;
        }
        if (a8p.A0E) {
            return;
        }
        if (a8p.A09()) {
            A06(a8p2, (C19980A1q) null, (Map) null);
            return;
        }
        C176198zw r0 = a8p2.A0G;
        r0.A01.A04(a8p2.A00, s);
        C19980A1q a1q2 = a1q;
        String str4 = str;
        Map map2 = map;
        if (str == null) {
            C187379fi r4 = a8p2.A01;
            if (r4 == null) {
                str3 = "flowManager";
            } else {
                Stack stack = r4.A04;
                String str5 = (String) ((Deque) AnonymousClass8BT.A0s(stack)).pollFirst();
                if (str5 != null) {
                    r4.A00.A00(str5, map, false);
                    return;
                } else if (stack.size() > 1) {
                    stack.pop();
                    String str6 = (String) r4.A03.pop();
                    C189529jO r42 = r4.A00;
                    C72453Mb.A1R(str6);
                    C20129A8p a8p3 = r42.A00;
                    a8p3.A0H.A00.pop();
                    A6G a6g = a8p3.A02;
                    if (a6g == null) {
                        str3 = "backNavManager";
                    } else {
                        StringBuilder A10 = AnonymousClass000.A10();
                        C108975cc.A14(A10, str6);
                        String obj = A10.toString();
                        C194539rt r2 = a6g.A03;
                        ArrayList A0k = C29431cG.A0k(C17880vN.A10(r2.A02), C17880vN.A10(r2.A01));
                        ArrayList A13 = AnonymousClass000.A13();
                        ArrayList A132 = AnonymousClass000.A13();
                        Iterator it = A0k.iterator();
                        while (true) {
                            str2 = null;
                            if (!it.hasNext()) {
                                break;
                            }
                            Object next = it.next();
                            if (!AnonymousClass1YE.A0A(((C193989qz) next).A01, obj, false)) {
                                A13.add(next);
                            } else {
                                A132.add(next);
                            }
                        }
                        C193989qz r02 = (C193989qz) C29431cG.A0e(A13);
                        if (r02 != null) {
                            str2 = r02.A01;
                        }
                        A6G.A00(a6g, str2);
                        Object pollFirst = ((Deque) AnonymousClass8BT.A0s(stack)).pollFirst();
                        C17960vV.A07(pollFirst);
                        C18070vi.A0X(pollFirst);
                        r42.A00((String) pollFirst, map, true);
                        return;
                    }
                } else {
                    A06(a8p2, a1q, map);
                    return;
                }
            }
            C18070vi.A11(str3);
            throw null;
        }
        A04(a8p2, a1q2, str4, map2, (Map) null, false);
    }

    public C22383B5m A0A(String str) {
        C195919u9 r1;
        C18070vi.A0d(str, 0);
        C190729lQ r0 = (C190729lQ) this.A0I.A00.get(str);
        if (r0 != null) {
            r1 = r0.A00();
        } else {
            r1 = null;
        }
        if (r1 instanceof C22383B5m) {
            return (C22383B5m) r1;
        }
        return null;
    }

    public C20129A8p(AnonymousClass195 r5, C51452Yi r6, C189309is r7, C51512Yo r8, AnonymousClass1KB r9, C176198zw r10, AnonymousClass9YC r11, C52452aw r12, A2V a2v, AnonymousClass00H r14, String str, String str2, String str3, String str4, String str5) {
        String str6 = str5;
        int A0G2 = C72453Mb.A0G(r9, a2v, 1);
        C72473Md.A1M(r6, r12, r8, 3);
        C18070vi.A0q(r5, r10, r14);
        String str7 = str3;
        C108975cc.A10(r7, 9, str7);
        C18070vi.A0d(r11, 15);
        this.A0F = r9;
        this.A0Y = a2v;
        this.A0Q = r6;
        this.A0I = r12;
        this.A0S = r8;
        this.A0P = r5;
        this.A0G = r10;
        this.A0K = r14;
        this.A0R = r7;
        this.A0a = str;
        this.A0c = str2;
        this.A0M = str7;
        this.A0b = str4;
        this.A0Z = str6;
        this.A0H = r11;
        str6 = str5 == null ? C108985cd.A0f() : str6;
        this.A0N = str6;
        this.A0J = a2v.A02(str6);
        this.A0L = new C21426Ajt(this, A0G2);
        this.A0O = new ALY(this, 1);
        this.A0U = new AnonymousClass9YB(this);
        this.A0V = new C189529jO(this);
        this.A0W = new C189539jP(this);
    }

    public static final void A00(C20129A8p a8p) {
        C176198zw r3 = a8p.A0G;
        r3.A01(a8p.A00, "session_id", a8p.A0c);
        String str = a8p.A0C;
        if (str != null) {
            r3.A01(a8p.A00, "product_session_id", str);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: X.8zs} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: java.util.Map} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: X.8zs} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: X.8zr} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: X.8zs} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: X.8zs} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v10, resolved type: X.8zs} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v11, resolved type: X.8zs} */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a5, code lost:
        if (r2 != false) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01be, code lost:
        if (r0 != false) goto L_0x01c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0224, code lost:
        if (r0 != false) goto L_0x01c0;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00f6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.C20129A8p r27, X.C195919u9 r28, X.AnonymousClass90N r29, X.C19980A1q r30, java.lang.Integer r31, java.lang.Integer r32, java.lang.String r33, java.util.Map r34) {
        /*
            r7 = r28
            java.lang.String r0 = "resource_id"
            java.lang.String r15 = r7.A03()
            r8 = r27
            A08(r8, r0, r15)
            r1 = 0
            r6 = r34
            if (r34 == 0) goto L_0x02ee
            java.lang.String r0 = "error"
            java.lang.Object r4 = r6.get(r0)
        L_0x0018:
            java.util.List r3 = r8.A08
            r2 = r6
            if (r34 != 0) goto L_0x0021
            X.1CQ r2 = X.AnonymousClass1D7.A0I()
        L_0x0021:
            r0 = r29
            java.util.Map r0 = r0.A04
            java.util.Map r2 = X.C26065Crf.A03(r2, r0)
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, kotlin.Any?>"
            X.C18070vi.A0z(r2, r0)
            java.util.Map r5 = X.C41681wt.A03(r2)
            if (r4 == 0) goto L_0x0039
            java.lang.String r0 = "error"
            r5.put(r0, r4)
        L_0x0039:
            if (r3 == 0) goto L_0x0040
            java.lang.String r0 = "entry_screens"
            r5.put(r0, r3)
        L_0x0040:
            boolean r0 = r7 instanceof X.C22578BDy
            r13 = 1
            r12 = 0
            if (r0 == 0) goto L_0x004e
            r8.A0A = r13
            java.lang.String r0 = r29.A00()
            r8.A07 = r0
        L_0x004e:
            java.lang.String r0 = "context"
            java.lang.String r27 = X.AnonymousClass8BW.A0f(r0, r5)
            boolean r0 = r7 instanceof X.AnonymousClass909
            java.lang.String r17 = "initialStateMachineInput"
            java.lang.String r16 = "backNavManager"
            if (r0 == 0) goto L_0x00e9
            X.9fi r2 = r8.A01
            if (r2 != 0) goto L_0x0067
            java.lang.String r0 = "flowManager"
            X.C18070vi.A11(r0)
        L_0x0065:
            r0 = 0
            throw r0
        L_0x0067:
            java.util.Stack r2 = r2.A03
            java.lang.Object r3 = X.AnonymousClass8BT.A0s(r2)
            java.lang.String r3 = (java.lang.String) r3
            java.util.Map r10 = r8.A0D
            if (r10 == 0) goto L_0x02e4
            X.A6G r9 = r8.A02
            if (r9 == 0) goto L_0x02e9
            int r4 = r31.intValue()
            r11 = 1
            if (r4 == r13) goto L_0x00d6
            r2 = 2
            if (r4 == r2) goto L_0x00d6
            X.9rt r2 = r9.A03
            java.util.Stack r2 = r2.A01
            int r2 = r2.size()
            if (r2 == 0) goto L_0x008c
            r11 = 0
        L_0x008c:
            X.A6G r2 = r8.A02
            if (r2 == 0) goto L_0x02e9
            boolean r4 = r2.A01
            if (r4 != 0) goto L_0x00a7
            X.9rt r4 = r2.A03
            java.util.Stack r2 = r4.A01
            int r2 = r2.size()
            if (r2 == 0) goto L_0x00a7
            X.9qz r2 = r4.A00()
            boolean r2 = r2.A00
            r4 = 1
            if (r2 == 0) goto L_0x00a8
        L_0x00a7:
            r4 = 0
        L_0x00a8:
            X.9p2 r9 = r8.A05
            X.C18070vi.A0d(r3, r12)
            if (r11 == 0) goto L_0x00ca
            java.lang.String r11 = "overwrite_first_screen_presentation"
            java.lang.Object r2 = r10.get(r11)
            boolean r2 = r2 instanceof java.util.Map
            if (r2 == 0) goto L_0x00ca
            java.lang.Object r10 = r10.get(r11)
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>"
            X.C18070vi.A0z(r10, r2)
        L_0x00c2:
            java.util.Map r10 = (java.util.Map) r10
        L_0x00c4:
            X.9fj r11 = new X.9fj
            r11.<init>(r9, r3, r10, r4)
            goto L_0x00ea
        L_0x00ca:
            java.lang.String r2 = "presentation"
            java.lang.Object r10 = r5.get(r2)
            boolean r2 = r10 instanceof java.util.Map
            if (r2 != 0) goto L_0x00c2
            r10 = 0
            goto L_0x00c4
        L_0x00d6:
            boolean r4 = r9.A01
            X.9rt r2 = r9.A03
            if (r4 == 0) goto L_0x00e6
            java.util.Stack r2 = r2.A02
        L_0x00de:
            int r2 = r2.size()
            if (r2 == r13) goto L_0x008c
            r11 = 0
            goto L_0x008c
        L_0x00e6:
            java.util.Stack r2 = r2.A01
            goto L_0x00de
        L_0x00e9:
            r11 = r1
        L_0x00ea:
            java.lang.String r21 = r29.A00()
            int r14 = r8.A00
            java.lang.String r10 = r8.A0M
            X.A6G r2 = r8.A02
            if (r2 == 0) goto L_0x02e9
            boolean r9 = r2.A01
            java.util.Map r3 = r8.A0D
            if (r3 == 0) goto L_0x02e4
            X.9p2 r2 = r8.A05
            X.9tf r4 = new X.9tf
            r20 = r32
            r23 = r33
            r22 = r10
            r24 = r3
            r25 = r14
            r26 = r9
            r17 = r4
            r18 = r11
            r19 = r2
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26)
            X.AZJ r3 = new X.AZJ
            r22 = r3
            r23 = r8
            r24 = r7
            r25 = r29
            r26 = r15
            r28 = r6
            r22.<init>(r23, r24, r25, r26, r27, r28)
            int r10 = r31.intValue()
            java.lang.String r17 = "fcsLoadingEventManager"
            r9 = r30
            if (r10 == r12) goto L_0x025e
            r11 = 2
            X.9o7 r2 = r8.A03
            if (r10 == r11) goto L_0x02ca
            if (r2 == 0) goto L_0x02e4
            java.lang.Integer r20 = X.AnonymousClass00R.A01
            java.lang.String r22 = r29.A00()
            r24 = r1
            r18 = r2
            r19 = r1
            r21 = r15
            r23 = r27
            r18.A00(r19, r20, r21, r22, r23, r24)
            if (r0 == 0) goto L_0x023d
            X.909 r7 = (X.AnonymousClass909) r7
            if (r7 == 0) goto L_0x023d
            java.lang.String r11 = r8.A0N
            boolean r0 = r7 instanceof X.AnonymousClass90J
            if (r0 == 0) goto L_0x0184
            X.90J r7 = (X.AnonymousClass90J) r7
            X.00H r0 = r7.A02
            X.A2X r2 = X.C108985cd.A0c(r0, r11)
            java.lang.String r1 = r4.A03
            X.C17960vV.A07(r1)
            X.7NO r0 = new X.7NO
            r0.<init>(r1)
            r2.A02(r0)
        L_0x016b:
            X.A6G r0 = r8.A02
            if (r0 == 0) goto L_0x02e9
            X.9rt r1 = r0.A03
            X.9r0 r2 = new X.9r0
            r0 = r29
            r2.<init>(r0, r6)
            java.util.Map r1 = r1.A00
            X.90N r0 = r2.A00
            java.lang.String r0 = r0.A00()
            r1.put(r0, r2)
            return
        L_0x0184:
            boolean r0 = r7 instanceof X.C176148zr
            if (r0 == 0) goto L_0x01ee
            X.8zr r7 = (X.C176148zr) r7
            java.lang.String r0 = r4.A04
            r7.A00 = r0
            java.lang.String r10 = r4.A03
            X.1D6 r2 = X.AnonymousClass1D6.A01(r0, r10)
            X.7Kk r0 = r7.A01
            r0.A00 = r2
            X.00H r0 = r7.A02
            java.lang.Object r0 = r0.get()
            X.9ot r0 = (X.C192729ot) r0
            r0.A01(r4, r3, r5, r2)
            X.00H r0 = r7.A03
            X.A2X r2 = X.C108985cd.A0c(r0, r11)
            X.C17960vV.A07(r10)
            X.7NO r0 = new X.7NO
            r0.<init>(r10)
            r2.A02(r0)
            boolean r0 = r4.A06
            X.9fj r2 = r4.A01
            X.C17960vV.A07(r2)
            X.C18070vi.A0X(r2)
            if (r0 == 0) goto L_0x01d8
        L_0x01c0:
            X.9zi r0 = r7.A00
            if (r0 == 0) goto L_0x02f5
            X.A2X r11 = r0.A01
            java.lang.String r4 = r2.A04
            java.lang.Integer r0 = r2.A02
            java.lang.String r3 = X.C199269zi.A00(r0)
            java.lang.String r2 = r2.A00
            X.7NV r0 = new X.7NV
            r0.<init>(r4, r3, r2)
            r11.A02(r0)
        L_0x01d8:
            java.lang.String r4 = "error"
            java.lang.Object r0 = r5.get(r4)
            r3 = 0
            if (r0 != 0) goto L_0x0227
            if (r30 != 0) goto L_0x0227
            X.9o7 r2 = r7.A00
            if (r2 == 0) goto L_0x02f1
            java.lang.String r0 = "onLoadingCompletion"
            r2.A01(r1, r0, r10, r1)
            goto L_0x016b
        L_0x01ee:
            X.8zs r7 = (X.C176158zs) r7
            java.lang.String r0 = r4.A04
            r7.A00 = r0
            java.lang.String r10 = r4.A03
            X.1D6 r2 = X.AnonymousClass1D6.A01(r0, r10)
            X.7Kk r0 = r7.A01
            r0.A00 = r2
            X.00H r0 = r7.A02
            java.lang.Object r0 = r0.get()
            X.9ot r0 = (X.C192729ot) r0
            r0.A01(r4, r3, r5, r2)
            X.00H r0 = r7.A03
            X.A2X r2 = X.C108985cd.A0c(r0, r11)
            X.C17960vV.A07(r10)
            X.7NO r0 = new X.7NO
            r0.<init>(r10)
            r2.A02(r0)
            boolean r0 = r4.A06
            X.9fj r2 = r4.A01
            X.C17960vV.A07(r2)
            X.C18070vi.A0X(r2)
            if (r0 == 0) goto L_0x01d8
            goto L_0x01c0
        L_0x0227:
            X.9o7 r2 = r7.A00
            if (r2 == 0) goto L_0x02f1
            java.lang.Object r1 = r5.get(r4)
            boolean r0 = r1 instanceof java.util.Map
            if (r0 == 0) goto L_0x0236
            r3 = r1
            java.util.Map r3 = (java.util.Map) r3
        L_0x0236:
            java.lang.String r0 = "onLoadingFailure"
            r2.A01(r9, r0, r10, r3)
            goto L_0x016b
        L_0x023d:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Failed to resume "
            r2.append(r0)
            r2.append(r15)
            java.lang.String r0 = ". Resume is only supported for UI resource states."
            java.lang.String r3 = X.AnonymousClass000.A0y(r0, r2)
            com.whatsapp.util.Log.e((java.lang.String) r3)
            java.lang.String r2 = "FailToResume"
            X.A1q r0 = new X.A1q
            r0.<init>(r1, r2, r3)
            A06(r8, r0, r1)
            goto L_0x016b
        L_0x025e:
            if (r0 == 0) goto L_0x02b5
            X.A6G r14 = r8.A02
            if (r14 == 0) goto L_0x02e9
            X.C17960vV.A07(r11)
            X.C18070vi.A0X(r11)
            java.lang.String r10 = r29.A00()
            org.json.JSONObject r2 = X.C17880vN.A15()
            java.lang.String r1 = "isModalOnScreen"
            boolean r0 = r14.A01
            org.json.JSONObject r1 = r2.put(r1, r0)
            java.lang.String r0 = "presentationType"
            X.9Hp r2 = r11.A01
            org.json.JSONObject r1 = r1.put(r0, r2)
            java.lang.String r0 = "backstack_input"
            org.json.JSONObject r0 = r1.put(r0, r6)
            X.C18070vi.A0X(r0)
            java.lang.Integer r0 = r11.A02
            r14.A00 = r0
            X.9Hp r0 = X.C179349Hp.MODAL
            if (r2 != r0) goto L_0x02bc
            X.9rt r2 = r14.A03
            java.util.Stack r1 = r2.A02
            int r0 = r1.size()
            if (r0 != 0) goto L_0x02bc
            X.C18070vi.A0d(r10, r12)
            X.9qz r0 = new X.9qz
            r0.<init>(r10, r13)
            r1.add(r0)
        L_0x02a8:
            X.C18070vi.A0d(r10, r12)
            java.util.Stack r1 = r2.A01
        L_0x02ad:
            X.9qz r0 = new X.9qz
            r0.<init>(r10, r13)
            r1.add(r0)
        L_0x02b5:
            X.9o7 r2 = r8.A03
            if (r2 == 0) goto L_0x02e4
            java.lang.Integer r19 = X.AnonymousClass00R.A00
            goto L_0x02ce
        L_0x02bc:
            X.9rt r2 = r14.A03
            java.util.Stack r1 = r2.A02
            int r0 = r1.size()
            if (r0 == 0) goto L_0x02a8
            X.C18070vi.A0d(r10, r12)
            goto L_0x02ad
        L_0x02ca:
            if (r2 == 0) goto L_0x02e4
            java.lang.Integer r19 = X.AnonymousClass00R.A0C
        L_0x02ce:
            java.lang.String r21 = r29.A00()
            r18 = 0
            r20 = r15
            r22 = r27
            r23 = r18
            r17 = r2
            r17.A00(r18, r19, r20, r21, r22, r23)
            r7.A06(r4, r3, r9, r5)
            goto L_0x016b
        L_0x02e4:
            X.C18070vi.A11(r17)
            goto L_0x0065
        L_0x02e9:
            X.C18070vi.A11(r16)
            goto L_0x0065
        L_0x02ee:
            r4 = r1
            goto L_0x0018
        L_0x02f1:
            X.C18070vi.A11(r17)
            throw r1
        L_0x02f5:
            java.lang.String r0 = "screenOpener"
            X.C18070vi.A11(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20129A8p.A01(X.A8p, X.9u9, X.90N, X.A1q, java.lang.Integer, java.lang.Integer, java.lang.String, java.util.Map):void");
    }

    public static final void A02(C20129A8p a8p, AnonymousClass90N r17, C19980A1q a1q, Integer num, String str, Map map) {
        C195919u9 A002;
        String str2;
        C20129A8p a8p2 = a8p;
        C52452aw r0 = a8p2.A0I;
        AnonymousClass90N r9 = r17;
        String str3 = r9.A03;
        C190729lQ r02 = (C190729lQ) r0.A00.get(str3);
        if (r02 == null || (A002 = r02.A00()) == null) {
            String A1H = AnonymousClass001.A1H("Resource not found: ", str3, AnonymousClass000.A10());
            Log.e(A1H);
            A06(a8p2, new C19980A1q((Integer) null, "ResourceNotFound", A1H), (Map) null);
            return;
        }
        Integer num2 = num;
        int intValue = num2.intValue();
        if (!A002.A00) {
            if (A002 instanceof BE0) {
                ((BE0) A002).BCf(a8p2.A0N);
            }
            A002.A04();
        }
        C19980A1q a1q2 = a1q;
        Map map2 = map;
        if (intValue != 0) {
            A03(a8p2, r9, map2);
            A01(a8p2, A002, r9, a1q2, num2, a8p2.A06, str, map2);
        } else {
            if (A002 instanceof AnonymousClass909) {
                A6G a6g = a8p2.A02;
                if (a6g != null) {
                    Integer num3 = a8p2.A06;
                    String A003 = r9.A00();
                    C194539rt r03 = a6g.A03;
                    boolean A012 = r03.A01(A003);
                    boolean A022 = r03.A02(A003);
                    if (A012 || A022) {
                        if (num3 == null) {
                            num3 = AnonymousClass00R.A01;
                        }
                        a6g.A03(a1q2, num3, A003, (String) null, map2);
                        C176198zw r04 = a8p2.A0G;
                        r04.A01.A04(a8p2.A00, 4);
                        return;
                    }
                }
                str2 = "backNavManager";
                C18070vi.A11(str2);
                throw null;
            }
            if (A002 instanceof C22578BDy) {
                A6G a6g2 = a8p2.A02;
                if (a6g2 != null) {
                    if (a6g2.A03.A01.size() != 0 && a8p2.A0A) {
                        String str4 = a8p2.A07;
                        C17960vV.A07(str4);
                        C18070vi.A0X(str4);
                        C192289o7 r1 = a8p2.A03;
                        if (r1 == null) {
                            str2 = "fcsLoadingEventManager";
                            C18070vi.A11(str2);
                            throw null;
                        }
                        r1.A01((C19980A1q) null, "onStartLoading", str4, (Map) null);
                        Map A032 = C26065Crf.A03(map2, r9.A04);
                        C18070vi.A0z(A032, "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, kotlin.Any?>");
                        Map A033 = C41681wt.A03(A032);
                        int i = a8p2.A00;
                        ((C22578BDy) A002).CCI(new C191549mm(a8p, A002, r9, a1q2, str4, map), a8p2.A0M, A033, i);
                    }
                }
                str2 = "backNavManager";
                C18070vi.A11(str2);
                throw null;
            }
            A03(a8p2, r9, map2);
            A01(a8p2, A002, r9, a1q2, AnonymousClass00R.A00, (Integer) null, (String) null, map2);
        }
        if (A002 instanceof AnonymousClass909) {
            a8p2.A06 = null;
        }
    }

    public static final void A03(C20129A8p a8p, C184829ba r6, Map map) {
        C195919u9 A002;
        Stack stack;
        a8p.A04 = r6;
        int hashCode = r6.hashCode();
        a8p.A00 = hashCode;
        C176198zw r1 = a8p.A0G;
        C187379fi r0 = a8p.A01;
        if (r0 == null) {
            C18070vi.A11("flowManager");
        } else {
            r1.A00(hashCode, (String) AnonymousClass8BT.A0s(r0.A03));
            String str = r6.A01;
            A08(a8p, "state_name", str);
            C187379fi r02 = a8p.A01;
            if (r02 != null) {
                A08(a8p, "config_name", (String) AnonymousClass8BT.A0s(r02.A03));
                C18070vi.A0X(C17880vN.A15().put("input", map));
                C192819p2 r3 = a8p.A05;
                if (r3 != null) {
                    C187379fi r03 = a8p.A01;
                    if (r03 != null) {
                        String str2 = (String) AnonymousClass8BT.A0s(r03.A03);
                        C18070vi.A0d(str2, 0);
                        C195649tg r62 = r3.A03;
                        if (str2.equals(r62.A01)) {
                            C184829ba r12 = (C184829ba) r62.A07.get(str);
                            if (r12 != null) {
                                HashMap A11 = C17880vN.A11();
                                if (r12 instanceof AnonymousClass90N) {
                                    C52452aw r04 = r3.A02;
                                    String str3 = ((AnonymousClass90N) r12).A03;
                                    C190729lQ r05 = (C190729lQ) r04.A00.get(str3);
                                    if (r05 == null || (A002 = r05.A00()) == null) {
                                        throw AnonymousClass000.A0s(AnonymousClass000.A0y(" is not in the resource registry", AnonymousClass000.A11(str3)));
                                    } else if (A002 instanceof AnonymousClass909) {
                                        Set set = r3.A05;
                                        if (set.contains(str)) {
                                            while (true) {
                                                stack = r3.A06;
                                                if (C18070vi.A18(str, ((C195039sh) stack.peek()).A01)) {
                                                    break;
                                                }
                                                String str4 = ((C195039sh) stack.pop()).A01;
                                                if (set.contains(str4)) {
                                                    set.remove(str4);
                                                    r62.A08.pop();
                                                }
                                            }
                                            set.remove(str);
                                            r62.A08.pop();
                                            Object pop = stack.pop();
                                            C18070vi.A0X(pop);
                                            A11.putAll(((C195039sh) pop).A03);
                                        }
                                        set.add(str);
                                        r62.A08.push(str);
                                    }
                                }
                                r3.A06.push(new C195039sh(AnonymousClass00R.A01, str, map, A11));
                                r3.A00 = System.currentTimeMillis();
                                return;
                            }
                            throw AnonymousClass000.A0s(AnonymousClass000.A0y(" is not part of the state registry", AnonymousClass000.A11(str)));
                        }
                        return;
                    }
                } else {
                    return;
                }
            }
            C18070vi.A11("flowManager");
        }
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b1, code lost:
        if ((r8.A03.A07.get(((X.C195039sh) r7.peek()).A01) instanceof X.AnonymousClass90K) == false) goto L_0x00b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00c9, code lost:
        if (r1.containsKey("error") != false) goto L_0x00cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00cb, code lost:
        r3.A01(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00dd, code lost:
        if (r0 != null) goto L_0x0123;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0118, code lost:
        if (r0 != null) goto L_0x0109;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A06(X.C20129A8p r9, X.C19980A1q r10, java.util.Map r11) {
        /*
            boolean r0 = r9.A0E
            if (r0 != 0) goto L_0x0128
            r0 = 1
            r9.A0E = r0
            X.1KB r1 = r9.A0F
            java.lang.Runnable r0 = r9.A0L
            r1.A0I(r0)
            X.2aw r0 = r9.A0I
            java.util.Map r0 = r0.A00
            java.util.Iterator r2 = X.C17890vO.A0l(r0)
        L_0x0016:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0032
            java.lang.Object r1 = r2.next()
            X.9lQ r1 = (X.C190729lQ) r1
            boolean r0 = r1.A00
            if (r0 == 0) goto L_0x0016
            X.9u9 r1 = r1.A00()
            boolean r0 = r1.A00
            if (r0 == 0) goto L_0x0016
            r1.A05()
            goto L_0x0016
        L_0x0032:
            X.9fi r1 = r9.A01
            r4 = 0
            if (r1 != 0) goto L_0x003d
            java.lang.String r0 = "flowManager"
        L_0x0039:
            X.C18070vi.A11(r0)
            throw r4
        L_0x003d:
            X.A2X r0 = r1.A01
            r0.A04(r1)
            X.A6G r3 = r9.A02
            if (r3 != 0) goto L_0x0049
            java.lang.String r0 = "backNavManager"
            goto L_0x0039
        L_0x0049:
            X.9rt r1 = r3.A03
            java.util.Stack r0 = r1.A01
            r0.clear()
            java.util.Stack r0 = r1.A02
            r0.clear()
            X.A2X r2 = r3.A04
            X.0wS r1 = X.C18460wS.A00
            X.AeV r0 = new X.AeV
            r0.<init>(r1)
            r2.A02(r0)
            r2.A04(r3)
            X.195 r1 = r9.A0P
            X.1Ke r0 = r9.A0O
            r1.unregisterObserver(r0)
            X.A2V r1 = r9.A0Y
            java.lang.String r0 = r9.A0N
            r1.A03(r0)
            r9.A04 = r4
            if (r10 != 0) goto L_0x00e0
            X.B5V r5 = r9.A0B
            if (r5 == 0) goto L_0x0126
            X.AZI r5 = (X.AZI) r5
            int r0 = r5.A00
            if (r0 == 0) goto L_0x00d2
            java.lang.Object r6 = r5.A02
            X.A8q r6 = (X.C20130A8q) r6
            X.9ph r0 = r6.A0F
            if (r0 == 0) goto L_0x011c
            X.9nm r3 = r6.A0E
            java.lang.String r2 = r0.A00
            monitor-enter(r3)
            java.util.Map r0 = r3.A00     // Catch:{ all -> 0x00cf }
            java.lang.Object r8 = r0.get(r2)     // Catch:{ all -> 0x00cf }
            X.9p2 r8 = (X.C192819p2) r8     // Catch:{ all -> 0x00cf }
            if (r8 == 0) goto L_0x011b
            java.util.Stack r7 = r8.A06     // Catch:{ all -> 0x00cf }
            boolean r0 = r7.isEmpty()     // Catch:{ all -> 0x00cf }
            if (r0 != 0) goto L_0x00b3
            java.lang.Object r0 = r7.peek()     // Catch:{ all -> 0x00cf }
            X.9sh r0 = (X.C195039sh) r0     // Catch:{ all -> 0x00cf }
            java.lang.String r1 = r0.A01     // Catch:{ all -> 0x00cf }
            X.9tg r0 = r8.A03     // Catch:{ all -> 0x00cf }
            java.util.Map r0 = r0.A07     // Catch:{ all -> 0x00cf }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ all -> 0x00cf }
            boolean r0 = r0 instanceof X.AnonymousClass90K     // Catch:{ all -> 0x00cf }
            if (r0 != 0) goto L_0x00cb
        L_0x00b3:
            boolean r0 = r7.isEmpty()     // Catch:{ all -> 0x00cf }
            if (r0 != 0) goto L_0x011b
            java.lang.Object r0 = r7.peek()     // Catch:{ all -> 0x00cf }
            X.9sh r0 = (X.C195039sh) r0     // Catch:{ all -> 0x00cf }
            java.util.Map r1 = r0.A02     // Catch:{ all -> 0x00cf }
            if (r1 == 0) goto L_0x011b
            java.lang.String r0 = "error"
            boolean r0 = r1.containsKey(r0)     // Catch:{ all -> 0x00cf }
            if (r0 == 0) goto L_0x011b
        L_0x00cb:
            r3.A01(r2)     // Catch:{ all -> 0x00cf }
            goto L_0x011b
        L_0x00cf:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x00d2:
            java.lang.Object r0 = r5.A02
            X.A8q r0 = (X.C20130A8q) r0
            X.C20130A8q.A04(r0)
            java.lang.Object r0 = r5.A01
            X.BBe r0 = (X.C22521BBe) r0
            if (r0 == 0) goto L_0x0126
            goto L_0x0123
        L_0x00e0:
            X.B5V r3 = r9.A0B
            if (r3 == 0) goto L_0x0126
            X.AZI r3 = (X.AZI) r3
            int r2 = r3.A00
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "FDSManage/FcsStateMachine Terminated with error: "
            X.C17900vP.A0X(r10, r0, r1)
            if (r2 == 0) goto L_0x010d
            java.lang.Object r2 = r3.A02
            X.A8q r2 = (X.C20130A8q) r2
            X.9ph r0 = r2.A0F
            if (r0 == 0) goto L_0x0102
            X.9nm r1 = r2.A0E
            java.lang.String r0 = r0.A00
            r1.A01(r0)
        L_0x0102:
            X.C20130A8q.A04(r2)
            java.lang.Object r0 = r3.A01
            X.BBe r0 = (X.C22521BBe) r0
        L_0x0109:
            r0.Btu(r10, r11)
            goto L_0x0126
        L_0x010d:
            java.lang.Object r0 = r3.A02
            X.A8q r0 = (X.C20130A8q) r0
            X.C20130A8q.A04(r0)
            java.lang.Object r0 = r3.A01
            X.BBe r0 = (X.C22521BBe) r0
            if (r0 == 0) goto L_0x0126
            goto L_0x0109
        L_0x011b:
            monitor-exit(r3)
        L_0x011c:
            X.C20130A8q.A04(r6)
            java.lang.Object r0 = r5.A01
            X.BBe r0 = (X.C22521BBe) r0
        L_0x0123:
            r0.C7V(r11)
        L_0x0126:
            r9.A0B = r4
        L_0x0128:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20129A8p.A06(X.A8p, X.A1q, java.util.Map):void");
    }

    public static final void A07(C20129A8p a8p, String str) {
        C176198zw r0 = a8p.A0G;
        r0.A01.A03(a8p.A00, str);
    }

    public static final void A08(C20129A8p a8p, String str, String str2) {
        a8p.A0G.A01(a8p.A00, str, str2);
        A00(a8p);
    }

    private final boolean A09() {
        Boolean bool;
        String str = this.A0Z;
        if (str == null) {
            return false;
        }
        synchronized (this.A0Y) {
            bool = (Boolean) A2V.A01.get(str);
        }
        if (C18070vi.A19(bool, true)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v33, types: [java.lang.Object, X.B5z] */
    public final void A0B(B5V b5v, String str, Map map, Map map2, boolean z) {
        boolean z2;
        C195919u9 r0;
        Boolean bool;
        this.A0P.registerObserver(this.A0O);
        this.A0B = b5v;
        String str2 = this.A0b;
        if (str2 != null) {
            this.A05 = this.A0X.A00(str2);
        }
        Map map3 = map;
        Map A0F2 = AnonymousClass1D7.A0F(map3);
        this.A0D = A0F2;
        this.A0C = AnonymousClass8BW.A0f("product_qpl_session_id", A0F2);
        Object obj = map3.get("is_modal_on_screen");
        if (!(obj instanceof Boolean) || (bool = (Boolean) obj) == null) {
            z2 = false;
        } else {
            z2 = bool.booleanValue();
        }
        C51512Yo r02 = this.A0S;
        String str3 = this.A0N;
        A6G a6g = new A6G(this.A0U, (A2V) r02.A00.A00.AB2.get(), str3, z2);
        this.A02 = a6g;
        A2X a2x = a6g.A04;
        A2X.A00(a2x, C21106Aea.class, a6g, 8);
        A2X.A00(a2x, C21096AeQ.class, a6g, 9);
        A2X.A00(a2x, C21098AeS.class, a6g, 10);
        C51452Yi r03 = this.A0Q;
        String str4 = this.A0a;
        C187379fi r3 = new C187379fi(this.A0V, (A2V) r03.A00.A00.AB2.get(), str4, str3);
        this.A01 = r3;
        r3.A04.add(AnonymousClass8BR.A14());
        r3.A03.add(r3.A02);
        A2X.A00(r3.A01, C21100AeU.class, r3, 5);
        this.A03 = this.A0R.A00(str3);
        C192819p2 r32 = this.A05;
        if (r32 != null && !r32.A06.isEmpty()) {
            for (C195039sh r9 : r32.A06) {
                Map map4 = r32.A03.A07;
                String str5 = r9.A01;
                if (map4.get(str5) instanceof AnonymousClass90N) {
                    Object obj2 = map4.get(str5);
                    C18070vi.A0z(obj2, "null cannot be cast to non-null type com.whatsapp.payments.phoenix.flowconfigurationservice.state.FcsResourceState");
                    AnonymousClass90N r6 = (AnonymousClass90N) obj2;
                    C190729lQ r04 = (C190729lQ) this.A0I.A00.get(r6.A03);
                    if (r04 != null) {
                        r0 = r04.A00();
                    } else {
                        r0 = null;
                    }
                    if ((r0 instanceof AnonymousClass909) && r9.A00 == AnonymousClass00R.A00) {
                        A6G a6g2 = this.A02;
                        if (a6g2 != null) {
                            String A002 = r6.A00();
                            C18070vi.A0d(A002, 0);
                            C194539rt r2 = a6g2.A03;
                            Stack stack = r2.A01;
                            if (stack.size() == 0) {
                                stack.add(new C193989qz(A002, false));
                            }
                            r2.A02.add(new C193989qz(A002, false));
                            A6G a6g3 = this.A02;
                            if (a6g3 != null) {
                                Map map5 = r9.A02;
                                C194539rt r05 = a6g3.A03;
                                C193999r0 r22 = new C193999r0(r6, map5);
                                r05.A00.put(r22.A00.A00(), r22);
                            }
                        }
                        C18070vi.A11("backNavManager");
                        throw null;
                    }
                }
            }
        }
        String str6 = this.A0c;
        Object obj3 = map3.get(C179599Ip.REFERRAL.key);
        JSONObject A12 = AnonymousClass8BU.A12("config", str4);
        A12.put("isStartingState", true);
        A12.put("sessionId", str6);
        A12.put("referral", obj3);
        if (A09()) {
            A06(this, (C19980A1q) null, (Map) null);
            return;
        }
        C192819p2 r06 = this.A05;
        boolean z3 = z;
        if (r06 != null) {
            r06.A01 = z3;
        }
        A2X a2x2 = this.A0J;
        a2x2.A02(new Object());
        String str7 = str;
        if (z) {
            A04(this, (C19980A1q) null, str7, map2, (Map) null, false);
        } else {
            A04(this, (C19980A1q) null, str7, map3, (Map) null, false);
        }
        A2X.A00(a2x2, C21097AeR.class, this, 6);
    }
}
