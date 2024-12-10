package X;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.Crf  reason: case insensitive filesystem */
public abstract class C26065Crf {
    /* JADX WARNING: type inference failed for: r2v8, types: [X.DSB, java.lang.Object] */
    public static final Map A01(String str, Map map, Map map2) {
        C18070vi.A0d(map, 0);
        if (str == null) {
            return map;
        }
        if (str.equals("$")) {
            return map2;
        }
        if (str.equals("#")) {
            if (map2 == null) {
                map2 = AnonymousClass1D7.A0I();
            }
            return AnonymousClass1D7.A09(map, map2);
        } else if (!AnonymousClass1YE.A0A(str, "$.", false)) {
            throw AnonymousClass8BR.A0v("FcsStateIoUtils/createPath/path should start with '$.'");
        } else if (!AnonymousClass1YF.A0Y(str, "[", false)) {
            Map linkedHashMap = new LinkedHashMap(map);
            String A0J = AnonymousClass1YF.A0J("$.", str);
            String[] A1Y = C17880vN.A1Y();
            A1Y[0] = ".";
            Map map3 = linkedHashMap;
            for (Object next : AnonymousClass1YF.A0S(A0J, A1Y, 0)) {
                if (!map3.containsKey(next) || !(map3.get(next) instanceof Map)) {
                    map3.put(next, C17880vN.A13());
                }
                Object obj = map3.get(next);
                C18070vi.A0z(obj, "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, kotlin.Any?>");
                map3 = C41681wt.A03(obj);
            }
            C25654Cjk cjk = new C25654Cjk(C25670Ck0.A00(), linkedHashMap);
            C25489Cgk A00 = C25654Cjk.A00(str, new E6J[0]);
            Object obj2 = cjk.A01;
            C25670Ck0 ck0 = cjk.A00;
            C24287Byk byk = C24287Byk.AS_PATH_LIST;
            Class<C24287Byk> cls = C24287Byk.class;
            EnumSet<E> noneOf = EnumSet.noneOf(cls);
            noneOf.addAll(ck0.A03);
            noneOf.addAll(Arrays.asList(new C24287Byk[]{byk}));
            EnumSet<E> noneOf2 = EnumSet.noneOf(cls);
            EBZ ebz = ck0.A00;
            C25975Cpl cpl = ck0.A01;
            noneOf2.addAll(noneOf);
            Collection collection = ck0.A02;
            if (collection == null) {
                collection = Collections.emptyList();
            }
            if (ebz == null || cpl == null) {
                C25508Ch6 ch6 = C25508Ch6.A01;
                if (ebz == null) {
                    ebz = new DOV();
                }
                if (cpl == null) {
                    cpl = ch6.A00;
                }
            }
            C25670Ck0 ck02 = new C25670Ck0(ebz, cpl, collection, noneOf2);
            if (obj2 != null) {
                CYQ cyq = A00.A00;
                C25812CmP cmP = new C25812CmP(ck02, cyq, obj2, true);
                try {
                    ? obj3 = new Object();
                    obj3.A00 = obj2;
                    cyq.A00.A03(obj3, cmP, obj2, "");
                } catch (C27220DZz unused) {
                }
                if (cmP.A01().isEmpty()) {
                    C24287Byk byk2 = C24287Byk.SUPPRESS_EXCEPTIONS;
                    Set set = ck02.A03;
                    if (set.contains(byk2)) {
                        boolean contains = set.contains(byk);
                        boolean contains2 = set.contains(C24287Byk.ALWAYS_RETURN_LIST);
                        if (contains || contains2 || !cyq.A00.A06()) {
                            ((DOV) ck02.A00).A00.A01();
                        }
                    } else {
                        throw new C23737Boi();
                    }
                } else {
                    List list = cmP.A06;
                    Collections.sort(list);
                    for (DSB dsb : Collections.unmodifiableCollection(list)) {
                        if (dsb instanceof C23742Bon) {
                            throw new C23738Boj();
                        } else if (dsb instanceof C23745Boq) {
                            C23745Boq boq = (C23745Boq) dsb;
                            ck02.A00.CKG(boq.A00, boq.A00, map2);
                        } else if (dsb instanceof C23744Bop) {
                            C23744Bop bop = (C23744Bop) dsb;
                            for (Object CKG : bop.A00) {
                                ck02.A00.CKG(bop.A00, CKG, map2);
                            }
                        } else if (dsb instanceof C23743Boo) {
                            C23743Boo boo = (C23743Boo) dsb;
                            ck02.A00.CHv(boo.A00, boo.A00, map2);
                        }
                    }
                    if (ck02.A03.contains(byk)) {
                        cmP.A01();
                    }
                }
                return (Map) cjk.A01("$", new E6J[0]);
            }
            throw AnonymousClass000.A0k("json can not be null");
        } else {
            throw AnonymousClass8BR.A0v("FcsStateIoUtils/createPath/currently lacking support for arrays, filters, or multiple targets");
        }
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [java.util.LinkedHashMap, java.util.Map] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(X.C25066CVy r7, java.lang.Object r8) {
        /*
            boolean r0 = r8 instanceof java.util.Map
            if (r0 == 0) goto L_0x00b6
            java.util.LinkedHashMap r3 = X.C17880vN.A13()
            java.util.Map r8 = (java.util.Map) r8
            java.util.Iterator r6 = X.AnonymousClass000.A15(r8)
        L_0x000e:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x00d0
            java.util.Map$Entry r5 = X.AnonymousClass000.A16(r6)
            java.lang.Object r0 = r5.getKey()
            boolean r0 = r0 instanceof java.lang.String
            if (r0 == 0) goto L_0x00af
            java.lang.Object r0 = r5.getKey()
            java.lang.String r4 = "null cannot be cast to non-null type kotlin.String"
            X.C18070vi.A0z(r0, r4)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r2 = ".$"
            r1 = 0
            X.C18070vi.A0d(r0, r1)
            boolean r0 = r0.endsWith(r2)
            if (r0 == 0) goto L_0x0066
            java.lang.Object r0 = r5.getValue()
            X.C18070vi.A0z(r0, r4)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r1 = r7.A00(r0)
            if (r1 != 0) goto L_0x0089
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "FcsStateIoUtils/evaluate/required path failed to evaluate. Found a null value for '"
            r1.append(r0)
            java.lang.Object r0 = r5.getKey()
            X.C18070vi.A0z(r0, r4)
            java.lang.String r0 = (java.lang.String) r0
            r1.append(r0)
            java.lang.String r0 = "'."
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
            java.lang.AssertionError r0 = X.AnonymousClass8BR.A0v(r0)
            throw r0
        L_0x0066:
            java.lang.Object r0 = r5.getKey()
            X.C18070vi.A0z(r0, r4)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r2 = ".$?"
            X.C18070vi.A0d(r0, r1)
            boolean r0 = r0.endsWith(r2)
            if (r0 == 0) goto L_0x009b
            java.lang.Object r0 = r5.getValue()
            X.C18070vi.A0z(r0, r4)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r1 = r7.A00(r0)
            if (r1 == 0) goto L_0x000e
        L_0x0089:
            java.lang.Object r0 = r5.getKey()
            X.C18070vi.A0z(r0, r4)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = X.AnonymousClass1YF.A0K(r2, r0)
            r3.put(r0, r1)
            goto L_0x000e
        L_0x009b:
            java.lang.Object r1 = r5.getKey()
            X.C18070vi.A0z(r1, r4)
            java.lang.Object r0 = r5.getValue()
            java.lang.Object r0 = A00(r7, r0)
            r3.put(r1, r0)
            goto L_0x000e
        L_0x00af:
            java.lang.String r0 = "FcsStateIoUtils/evaluate/key in map is not string"
            java.lang.AssertionError r0 = X.AnonymousClass8BR.A0v(r0)
            throw r0
        L_0x00b6:
            boolean r0 = r8 instanceof java.lang.Object[]
            if (r0 == 0) goto L_0x00d1
            java.util.ArrayList r3 = X.AnonymousClass000.A13()
            java.lang.Object[] r8 = (java.lang.Object[]) r8
            int r2 = r8.length
            r1 = 0
        L_0x00c2:
            if (r1 >= r2) goto L_0x00d0
            r0 = r8[r1]
            java.lang.Object r0 = A00(r7, r0)
            r3.add(r0)
            int r1 = r1 + 1
            goto L_0x00c2
        L_0x00d0:
            return r3
        L_0x00d1:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26065Crf.A00(X.CVy, java.lang.Object):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
        if (r1 == null) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.Map A02(java.util.Map r3, java.util.Map r4) {
        /*
            X.CVy r2 = new X.CVy
            r2.<init>(r3)
            if (r4 == 0) goto L_0x0012
            java.lang.Object r1 = A00(r2, r4)
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Any"
            X.C18070vi.A0z(r1, r0)
            if (r1 != 0) goto L_0x0014
        L_0x0012:
            java.util.Map r1 = r2.A01
        L_0x0014:
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>"
            X.C18070vi.A0z(r1, r0)
            java.util.Map r1 = (java.util.Map) r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26065Crf.A02(java.util.Map, java.util.Map):java.util.Map");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
        if (r1 == null) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.Map A03(java.util.Map r3, java.util.Map r4) {
        /*
            X.CVy r2 = new X.CVy
            r2.<init>(r3)
            if (r4 == 0) goto L_0x0012
            java.lang.Object r1 = A00(r2, r4)
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Any"
            X.C18070vi.A0z(r1, r0)
            if (r1 != 0) goto L_0x0014
        L_0x0012:
            java.util.Map r1 = r2.A01
        L_0x0014:
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>"
            X.C18070vi.A0z(r1, r0)
            java.util.Map r1 = (java.util.Map) r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26065Crf.A03(java.util.Map, java.util.Map):java.util.Map");
    }
}
