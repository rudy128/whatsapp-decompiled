package com.whatsapp.areffects.data.graphql;

public abstract class ArEffectsGraphqlRepository {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.Throwable} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(X.C138506xC r4, java.lang.String r5) {
        /*
            r3 = this;
            r0 = 0
            X.C18070vi.A0d(r4, r0)
            X.161 r2 = r4.A03
            X.C18070vi.A0X(r2)
            X.163 r1 = r4.A04
            X.C18070vi.A0X(r1)
            int r0 = r4.A00
            if (r0 == 0) goto L_0x002d
            r2 = 0
            java.lang.Object r1 = r1.A00()
            boolean r0 = r1 instanceof X.C147357Sv
            if (r0 == 0) goto L_0x001e
            r2 = r1
            java.lang.Throwable r2 = (java.lang.Throwable) r2
        L_0x001e:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r5)
            java.lang.String r0 = " Error response: "
            X.C17900vP.A0X(r2, r0, r1)
            X.3hg r1 = new X.3hg
            r1.<init>(r2)
            throw r1
        L_0x002d:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r5)
            java.lang.String r0 = " Success"
            X.C17890vO.A1A(r1, r0)
            java.lang.Object r0 = r2.A00
            if (r0 == 0) goto L_0x003b
            return r0
        L_0x003b:
            java.lang.String r1 = "Null data received"
            X.5td r0 = new X.5td
            r0.<init>(r1)
            X.3hg r1 = new X.3hg
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.areffects.data.graphql.ArEffectsGraphqlRepository.A01(X.6xC, java.lang.String):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.AnonymousClass8AB r6, java.lang.String r7, X.C30391dr r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof X.AnonymousClass7UI
            if (r0 == 0) goto L_0x0022
            r4 = r8
            X.7UI r4 = (X.AnonymousClass7UI) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0022
            int r2 = r2 - r1
            r4.label = r2
        L_0x0012:
            java.lang.Object r3 = r4.result
            X.1g4 r2 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L_0x0031
            if (r0 != r1) goto L_0x002c
            java.lang.Object r7 = r4.L$1
            java.lang.String r7 = (java.lang.String) r7
            goto L_0x0028
        L_0x0022:
            X.7UI r4 = new X.7UI
            r4.<init>(r5, r8)
            goto L_0x0012
        L_0x0028:
            X.C30691eM.A01(r3)     // Catch:{ CancellationException -> 0x005b, Exception -> 0x0046 }
            return r3
        L_0x002c:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x0031:
            X.C30691eM.A01(r3)
            X.0wh r0 = r4.getContext()     // Catch:{ CancellationException -> 0x005b, Exception -> 0x0046 }
            r4.L$0 = r5     // Catch:{ CancellationException -> 0x005b, Exception -> 0x0046 }
            r4.L$1 = r7     // Catch:{ CancellationException -> 0x005b, Exception -> 0x0046 }
            r4.label = r1     // Catch:{ CancellationException -> 0x005b, Exception -> 0x0046 }
            java.lang.Object r3 = r6.CBx(r4, r0)     // Catch:{ CancellationException -> 0x005b, Exception -> 0x0046 }
            if (r3 != r2) goto L_0x0045
            return r2
        L_0x0045:
            return r3
        L_0x0046:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r7)
            java.lang.String r0 = " Exception in postRequest: "
            X.C17900vP.A0X(r2, r0, r1)
            X.5tb r1 = new X.5tb
            r1.<init>(r2)
            X.3hg r0 = new X.3hg
            r0.<init>(r1)
            throw r0
        L_0x005b:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r7)
            java.lang.String r0 = " Request canceled"
            X.C17890vO.A1A(r1, r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.areffects.data.graphql.ArEffectsGraphqlRepository.A00(X.8AB, java.lang.String, X.1dr):java.lang.Object");
    }
}
