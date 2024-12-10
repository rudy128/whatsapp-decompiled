package com.whatsapp.areffects.util;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass1DF;
import X.AnonymousClass4D9;
import X.AnonymousClass4DE;
import X.AnonymousClass5Az;
import X.AnonymousClass5B0;
import X.AnonymousClass5B1;
import X.C17880vN;
import X.C17890vO;
import X.C17900vP;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C18100vl;
import X.C25511Om;
import X.C87484Vt;
import com.whatsapp.util.Log;
import java.util.LinkedHashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;

public final class ArEffectsGatingUtil {
    public final C18030ve A00;
    public final C18100vl A01;
    public final C18100vl A02;
    public final C18100vl A03;
    public final AnonymousClass00H A04;

    public final String A02(AnonymousClass4D9 r3) {
        C18030ve r1;
        int i;
        C18070vi.A0d(r3, 0);
        int ordinal = r3.ordinal();
        if (ordinal == 0) {
            r1 = this.A00;
            i = 9333;
        } else if (ordinal != 1) {
            return "";
        } else {
            r1 = this.A00;
            i = 11500;
        }
        String A0I = r1.A0I(i);
        C18070vi.A0X(A0I);
        return A0I;
    }

    public final boolean A03(AnonymousClass4DE r4, AnonymousClass4D9 r5) {
        C18100vl r0;
        boolean A17 = C18070vi.A17(r4, r5);
        int ordinal = r5.ordinal();
        if (ordinal == 0) {
            r0 = this.A01;
        } else if (ordinal == A17) {
            r0 = this.A03;
        } else if (ordinal == 2) {
            r0 = this.A02;
        } else {
            throw new UnsupportedOperationException(AnonymousClass000.A0y(" is not a supported surface", C17890vO.A0f(this)));
        }
        return ((Set) r0.getValue()).contains(r4);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(X.AnonymousClass4D9 r7, X.C30391dr r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C100144u2
            if (r0 == 0) goto L_0x0072
            r5 = r8
            X.4u2 r5 = (X.C100144u2) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0072
            int r2 = r2 - r1
            r5.label = r2
        L_0x0012:
            java.lang.Object r2 = r5.result
            X.1g4 r4 = X.C31751g4.COROUTINE_SUSPENDED
            int r1 = r5.label
            r3 = 1
            r0 = 0
            if (r1 == 0) goto L_0x0036
            if (r1 != r3) goto L_0x0078
            java.lang.Object r0 = r5.L$0
            com.whatsapp.areffects.util.ArEffectsGatingUtil r0 = (com.whatsapp.areffects.util.ArEffectsGatingUtil) r0
            X.C30691eM.A01(r2)
        L_0x0025:
            X.00H r0 = r0.A04
            java.lang.Object r0 = r0.get()
            com.whatsapp.areffects.arclass.ArClassManager r0 = (com.whatsapp.areffects.arclass.ArClassManager) r0
            int r0 = r0.A00()
            java.lang.Integer r1 = X.AnonymousClass3MW.A0v(r0)
        L_0x0035:
            return r1
        L_0x0036:
            X.C30691eM.A01(r2)
            int r1 = r7.ordinal()
            if (r1 == r0) goto L_0x006b
            if (r1 == r3) goto L_0x0066
            r0 = 2
            if (r1 != r0) goto L_0x007d
            X.0ve r2 = r6.A00
            r1 = 9408(0x24c0, float:1.3183E-41)
        L_0x0048:
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            r1 = 0
            if (r0 == 0) goto L_0x0035
            X.00H r0 = r6.A04
            java.lang.Object r1 = X.C18070vi.A0E(r0)
            com.whatsapp.areffects.arclass.ArClassManager r1 = (com.whatsapp.areffects.arclass.ArClassManager) r1
            r5.L$0 = r6
            r5.label = r3
            X.1Ho r0 = X.C23761Hn.A01
            java.lang.Object r0 = r1.A01(r5, r0)
            if (r0 != r4) goto L_0x0070
            return r4
        L_0x0066:
            X.0ve r2 = r6.A00
            r1 = 9409(0x24c1, float:1.3185E-41)
            goto L_0x0048
        L_0x006b:
            X.0ve r2 = r6.A00
            r1 = 9366(0x2496, float:1.3125E-41)
            goto L_0x0048
        L_0x0070:
            r0 = r6
            goto L_0x0025
        L_0x0072:
            X.4u2 r5 = new X.4u2
            r5.<init>(r6, r8)
            goto L_0x0012
        L_0x0078:
            java.lang.IllegalStateException r1 = X.AnonymousClass000.A0l()
            throw r1
        L_0x007d:
            java.lang.StringBuilder r1 = X.C17890vO.A0f(r6)
            java.lang.String r0 = " is not a supported surface"
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.areffects.util.ArEffectsGatingUtil.A01(X.4D9, X.1dr):java.lang.Object");
    }

    public ArEffectsGatingUtil(C18030ve r3, AnonymousClass00H r4) {
        C18070vi.A0j(r3, r4);
        this.A00 = r3;
        this.A04 = r4;
        Integer A002 = C87484Vt.A00(r3);
        this.A01 = AnonymousClass1DF.A00(A002, new AnonymousClass5Az(this));
        this.A03 = AnonymousClass1DF.A00(A002, new AnonymousClass5B1(this));
        this.A02 = AnonymousClass1DF.A00(A002, new AnonymousClass5B0(this));
    }

    public static final Set A00(ArEffectsGatingUtil arEffectsGatingUtil, String str, int i) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ArEffectsGatingUtil/parseJsonValue/");
        A10.append(str);
        C17890vO.A1A(A10, "/start");
        try {
            JSONArray jSONArray = C18020vd.A02(C18040vf.A02, arEffectsGatingUtil.A00, i).getJSONArray("categories");
            LinkedHashSet A14 = C17880vN.A14();
            int length = jSONArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                String string = jSONArray.getString(i2);
                try {
                    C18070vi.A0b(string);
                    A14.add(AnonymousClass4DE.valueOf(string));
                } catch (IllegalArgumentException e) {
                    StringBuilder A11 = AnonymousClass000.A11("ArEffectsGatingUtil/parseJsonValue/");
                    A11.append(str);
                    C17900vP.A0h("/error parsing ", string, A11, e);
                }
            }
            StringBuilder A112 = AnonymousClass000.A11("ArEffectsGatingUtil/parseJsonValue/");
            A112.append(str);
            C17890vO.A1A(A112, "/success");
            return A14;
        } catch (JSONException e2) {
            StringBuilder A113 = AnonymousClass000.A11("ArEffectsGatingUtil/parseJsonValue/");
            A113.append(str);
            Log.e(AnonymousClass000.A0y("/error", A113), e2);
            return C25511Om.A00;
        }
    }
}
