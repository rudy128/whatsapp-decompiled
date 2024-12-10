package X;

public final class A68 {
    public static final A68 A00 = new Object();

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.util.Map} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map A02(java.lang.Object r11, java.lang.String r12, java.util.Map r13, java.util.Map r14) {
        /*
            r10 = this;
            if (r13 != 0) goto L_0x0009
            if (r14 != 0) goto L_0x0008
            X.1CQ r14 = X.AnonymousClass1D7.A0I()
        L_0x0008:
            return r14
        L_0x0009:
            if (r14 == 0) goto L_0x0017
            java.lang.String r0 = "merge"
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto L_0x0018
            java.util.LinkedHashMap r13 = r10.A00(r14, r13)
        L_0x0017:
            return r13
        L_0x0018:
            java.lang.String r0 = "incremental_merge"
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto L_0x0025
            java.util.LinkedHashMap r13 = r10.A01(r14, r13)
            return r13
        L_0x0025:
            java.lang.String r0 = "wae_commerce_merge"
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto L_0x0017
            java.util.LinkedHashMap r7 = X.C17880vN.A13()
            java.util.Iterator r2 = X.AnonymousClass000.A15(r14)
        L_0x0035:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x004d
            java.util.Map$Entry r0 = X.AnonymousClass000.A16(r2)
            java.lang.Object r1 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            if (r0 == 0) goto L_0x0035
            r7.put(r1, r0)
            goto L_0x0035
        L_0x004d:
            java.util.List r0 = X.AnonymousClass9TU.A00
            java.util.Iterator r9 = r0.iterator()
        L_0x0053:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x00f9
            java.lang.Object r6 = r9.next()
            boolean r0 = r14.containsKey(r6)
            if (r0 != 0) goto L_0x0069
            boolean r0 = r13.containsKey(r6)
            if (r0 == 0) goto L_0x0053
        L_0x0069:
            java.lang.Object r5 = r14.get(r6)
            boolean r0 = r5 instanceof java.util.Map
            r4 = 0
            if (r0 == 0) goto L_0x00f6
            java.util.Map r5 = (java.util.Map) r5
        L_0x0074:
            java.lang.Object r1 = r13.get(r6)
            boolean r0 = r1 instanceof java.util.Map
            if (r0 == 0) goto L_0x007f
            r4 = r1
            java.util.Map r4 = (java.util.Map) r4
        L_0x007f:
            if (r5 == 0) goto L_0x00ed
            if (r4 == 0) goto L_0x00ed
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>(r5)
            java.util.Iterator r8 = X.AnonymousClass000.A15(r4)
        L_0x008c:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x00ba
            java.util.Map$Entry r0 = X.AnonymousClass000.A16(r8)
            java.lang.Object r2 = r0.getKey()
            java.lang.Object r1 = r0.getValue()
            java.lang.String r0 = "direct_connect"
            boolean r0 = X.C18070vi.A18(r2, r0)
            if (r0 == 0) goto L_0x00b7
            boolean r0 = r1 instanceof java.util.Map
            if (r0 == 0) goto L_0x00b7
            r0 = r1
            java.util.Map r0 = (java.util.Map) r0
            boolean r0 = X.AnonymousClass8BR.A1Y(r0)
            if (r0 == 0) goto L_0x008c
        L_0x00b3:
            r3.put(r2, r1)
            goto L_0x008c
        L_0x00b7:
            if (r1 == 0) goto L_0x008c
            goto L_0x00b3
        L_0x00ba:
            boolean r0 = r11 instanceof java.util.List
            if (r0 == 0) goto L_0x00c3
            r0 = r11
            java.util.List r0 = (java.util.List) r0
            if (r0 != 0) goto L_0x00c5
        L_0x00c3:
            X.0wS r0 = X.C18460wS.A00
        L_0x00c5:
            java.util.Iterator r2 = r0.iterator()
        L_0x00c9:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00f1
            java.lang.Object r1 = r2.next()
            boolean r0 = r5.containsKey(r1)
            if (r0 != 0) goto L_0x00df
            boolean r0 = r4.containsKey(r1)
            if (r0 == 0) goto L_0x00c9
        L_0x00df:
            java.lang.Object r0 = r4.get(r1)
            if (r0 != 0) goto L_0x00e9
            X.1CQ r0 = X.AnonymousClass1D7.A0I()
        L_0x00e9:
            r3.put(r1, r0)
            goto L_0x00c9
        L_0x00ed:
            X.1CQ r3 = X.AnonymousClass1D7.A0I()
        L_0x00f1:
            r7.put(r6, r3)
            goto L_0x0053
        L_0x00f6:
            r5 = r4
            goto L_0x0074
        L_0x00f9:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A68.A02(java.lang.Object, java.lang.String, java.util.Map, java.util.Map):java.util.Map");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0034, code lost:
        r3 = r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.LinkedHashMap A00(java.util.Map r8, java.util.Map r9) {
        /*
            r7 = this;
            java.util.LinkedHashMap r6 = X.AnonymousClass1D7.A08(r8)
            java.util.Iterator r5 = X.AnonymousClass000.A15(r9)
        L_0x0008:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x003a
            java.util.Map$Entry r0 = X.AnonymousClass000.A16(r5)
            java.lang.Object r4 = r0.getKey()
            java.lang.Object r3 = r0.getValue()
            java.lang.Object r2 = r6.get(r4)
            boolean r0 = r2 instanceof java.util.Map
            r1 = 0
            if (r0 == 0) goto L_0x0038
            java.util.Map r2 = (java.util.Map) r2
        L_0x0025:
            boolean r0 = r3 instanceof java.util.Map
            if (r0 == 0) goto L_0x002c
            r1 = r3
            java.util.Map r1 = (java.util.Map) r1
        L_0x002c:
            if (r2 == 0) goto L_0x0034
            if (r1 == 0) goto L_0x0034
            java.util.LinkedHashMap r3 = r7.A00(r2, r1)
        L_0x0034:
            r6.put(r4, r3)
            goto L_0x0008
        L_0x0038:
            r2 = r1
            goto L_0x0025
        L_0x003a:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A68.A00(java.util.Map, java.util.Map):java.util.LinkedHashMap");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.util.Map} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.LinkedHashMap A01(java.util.Map r9, java.util.Map r10) {
        /*
            r8 = this;
            java.util.LinkedHashMap r5 = X.AnonymousClass1D7.A08(r9)
            java.util.Iterator r7 = X.AnonymousClass000.A15(r10)
        L_0x0008:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x009b
            java.util.Map$Entry r0 = X.AnonymousClass000.A16(r7)
            java.lang.Object r4 = r0.getKey()
            java.lang.Object r6 = r0.getValue()
            boolean r0 = r5.containsKey(r4)
            if (r0 == 0) goto L_0x0094
            java.lang.Object r1 = r5.get(r4)
            boolean r0 = r1 instanceof java.lang.Object[]
            if (r0 == 0) goto L_0x0049
            java.lang.Object r3 = r5.get(r4)
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Array<kotlin.Any>"
            X.C18070vi.A0z(r3, r0)
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            X.C18070vi.A0z(r6, r0)
            java.lang.Object[] r6 = (java.lang.Object[]) r6
            int r2 = r6.length
            r1 = 0
        L_0x003a:
            if (r1 >= r2) goto L_0x0045
            r0 = r6[r1]
            java.lang.Object[] r3 = X.C200310o.A0D(r0, r3)
            int r1 = r1 + 1
            goto L_0x003a
        L_0x0045:
            r5.put(r4, r3)
            goto L_0x0008
        L_0x0049:
            boolean r0 = r1 instanceof java.util.List
            if (r0 == 0) goto L_0x0072
            java.lang.Object r2 = r5.get(r4)
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>"
            X.C18070vi.A0z(r2, r0)
            java.util.Collection r2 = (java.util.Collection) r2
            X.C18070vi.A0z(r6, r0)
            java.util.Iterator r1 = X.AnonymousClass8BR.A13(r6)
        L_0x005f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x006e
            java.lang.Object r0 = r1.next()
            java.util.ArrayList r2 = X.C29431cG.A0l(r0, r2)
            goto L_0x005f
        L_0x006e:
            r5.put(r4, r2)
            goto L_0x0008
        L_0x0072:
            boolean r0 = r1 instanceof java.util.Map
            if (r0 == 0) goto L_0x0094
            java.lang.Object r3 = r5.get(r4)
            boolean r0 = r3 instanceof java.util.Map
            r2 = 0
            if (r0 == 0) goto L_0x0099
            java.util.Map r3 = (java.util.Map) r3
        L_0x0081:
            java.lang.Object r1 = r10.get(r4)
            boolean r0 = r1 instanceof java.util.Map
            if (r0 == 0) goto L_0x008c
            r2 = r1
            java.util.Map r2 = (java.util.Map) r2
        L_0x008c:
            if (r3 == 0) goto L_0x0008
            if (r2 == 0) goto L_0x0008
            java.util.LinkedHashMap r6 = r8.A01(r3, r2)
        L_0x0094:
            r5.put(r4, r6)
            goto L_0x0008
        L_0x0099:
            r3 = r2
            goto L_0x0081
        L_0x009b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A68.A01(java.util.Map, java.util.Map):java.util.LinkedHashMap");
    }
}
