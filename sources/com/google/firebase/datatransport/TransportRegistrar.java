package com.google.firebase.datatransport;

import X.C18330wD;
import X.C18340wE;
import X.C18490wW;
import X.C18520wb;
import X.C18550wf;
import X.C65512wc;
import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;

public class TransportRegistrar implements ComponentRegistrar {
    public static final String LIBRARY_NAME = "fire-transport";

    public List getComponents() {
        C18340wE r5 = new C18340wE(C18550wf.class, new Class[0]);
        r5.A03 = LIBRARY_NAME;
        r5.A01(new C18490wW(Context.class, 1, 0));
        r5.A02 = new C65512wc(4);
        return Arrays.asList(new C18330wD[]{r5.A00(), C18520wb.A00(LIBRARY_NAME, "18.1.7")});
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002e, code lost:
        if (r8.A01 != null) goto L_0x0030;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ X.C18550wf lambda$getComponents$0(X.C18400wL r8) {
        /*
            java.lang.Class<android.content.Context> r0 = android.content.Context.class
            java.lang.Object r0 = r8.BMD(r0)
            android.content.Context r0 = (android.content.Context) r0
            X.C18860xH.A00(r0)
            X.0xI r0 = X.C18860xH.A04
            if (r0 == 0) goto L_0x006f
            X.0vp r0 = r0.A09
            java.lang.Object r2 = r0.get()
            X.0xH r2 = (X.C18860xH) r2
            X.0yC r8 = X.C19430yC.A02
            boolean r0 = r8 instanceof X.C19420yB
            if (r0 == 0) goto L_0x0063
            java.util.Set r0 = X.C19430yC.A04
            java.util.Set r4 = java.util.Collections.unmodifiableSet(r0)
        L_0x0023:
            X.0xz r6 = X.C19300xz.DEFAULT
            java.lang.String r5 = "cct"
            java.lang.String r7 = r8.A00
            if (r7 != 0) goto L_0x0030
            java.lang.String r1 = r8.A01
            r0 = 0
            if (r1 == 0) goto L_0x0059
        L_0x0030:
            r0 = 4
            java.lang.Object[] r3 = new java.lang.Object[r0]
            r1 = 0
            java.lang.String r0 = "1$"
            r3[r1] = r0
            r1 = 1
            java.lang.String r0 = r8.A01
            r3[r1] = r0
            r1 = 2
            java.lang.String r0 = "\\"
            r3[r1] = r0
            if (r7 != 0) goto L_0x0046
            java.lang.String r7 = ""
        L_0x0046:
            r0 = 3
            r3[r0] = r7
            java.lang.String r0 = "%s%s%s%s"
            java.lang.String r1 = java.lang.String.format(r0, r3)
            java.lang.String r0 = "UTF-8"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            byte[] r0 = r1.getBytes(r0)
        L_0x0059:
            X.0yF r1 = X.C19440yD.A00(r6, r5, r0)
            X.0yG r0 = new X.0yG
            r0.<init>(r1, r2, r4)
            return r0
        L_0x0063:
            java.lang.String r1 = "proto"
            X.0xy r0 = new X.0xy
            r0.<init>(r1)
            java.util.Set r4 = java.util.Collections.singleton(r0)
            goto L_0x0023
        L_0x006f:
            java.lang.String r1 = "Not initialized!"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.datatransport.TransportRegistrar.lambda$getComponents$0(X.0wL):X.0wf");
    }
}
