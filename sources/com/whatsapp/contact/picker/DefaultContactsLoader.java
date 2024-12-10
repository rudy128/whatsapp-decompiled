package com.whatsapp.contact.picker;

import X.AnonymousClass00H;
import X.C107975av;
import X.C18070vi;

public final class DefaultContactsLoader implements C107975av {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v26, resolved type: java.util.Set} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v27, resolved type: java.util.Set} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v28, resolved type: java.util.Set} */
    /* JADX WARNING: type inference failed for: r0v2, types: [java.util.Set] */
    /* JADX WARNING: type inference failed for: r0v5 */
    /* JADX WARNING: type inference failed for: r0v6, types: [java.util.Set] */
    /* JADX WARNING: type inference failed for: r0v10 */
    /* JADX WARNING: type inference failed for: r0v14 */
    /* JADX WARNING: type inference failed for: r0v17, types: [java.util.Set] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object Bhk(X.AnonymousClass1EC r11, X.C30391dr r12, X.C18600wl r13) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof X.C21705AoY
            if (r0 == 0) goto L_0x0105
            r3 = r12
            X.AoY r3 = (X.C21705AoY) r3
            int r2 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0105
            int r2 = r2 - r1
            r3.label = r2
        L_0x0012:
            java.lang.Object r9 = r3.result
            X.1g4 r4 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r3.label
            r2 = 4
            r7 = 3
            r8 = 2
            r6 = 1
            if (r0 == 0) goto L_0x0035
            if (r0 == r6) goto L_0x005b
            if (r0 == r8) goto L_0x0093
            if (r0 == r7) goto L_0x00cb
            if (r0 != r2) goto L_0x010c
            java.lang.Object r0 = r3.L$1
            java.util.Set r0 = (java.util.Set) r0
            java.lang.Object r6 = r3.L$0
            X.C30691eM.A01(r9)
        L_0x002f:
            java.util.Collection r9 = (java.util.Collection) r9
            r0.addAll(r9)
            return r6
        L_0x0035:
            X.C30691eM.A01(r9)
            java.util.LinkedHashSet r5 = X.C17880vN.A14()
            X.00H r0 = r10.A01
            java.lang.Object r1 = r0.get()
            com.whatsapp.community.DirectoryContactsLoader r1 = (com.whatsapp.community.DirectoryContactsLoader) r1
            r3.L$0 = r10
            r3.L$1 = r11
            r3.L$2 = r13
            r3.L$3 = r5
            r3.L$4 = r5
            r3.label = r6
            X.1Ho r0 = X.C23761Hn.A01
            java.lang.Object r9 = r1.Bhk(r11, r3, r0)
            if (r9 == r4) goto L_0x0111
            r1 = r10
            r6 = r5
            goto L_0x0072
        L_0x005b:
            java.lang.Object r5 = r3.L$4
            java.util.Set r5 = (java.util.Set) r5
            java.lang.Object r6 = r3.L$3
            java.util.Set r6 = (java.util.Set) r6
            java.lang.Object r13 = r3.L$2
            X.0wl r13 = (X.C18600wl) r13
            java.lang.Object r11 = r3.L$1
            X.1EC r11 = (X.AnonymousClass1EC) r11
            java.lang.Object r1 = r3.L$0
            com.whatsapp.contact.picker.DefaultContactsLoader r1 = (com.whatsapp.contact.picker.DefaultContactsLoader) r1
            X.C30691eM.A01(r9)
        L_0x0072:
            java.util.Collection r9 = (java.util.Collection) r9
            r5.addAll(r9)
            X.00H r0 = r1.A00
            java.lang.Object r0 = r0.get()
            com.whatsapp.contact.picker.DeviceContactsLoader r0 = (com.whatsapp.contact.picker.DeviceContactsLoader) r0
            r3.L$0 = r1
            r3.L$1 = r11
            r3.L$2 = r13
            r3.L$3 = r6
            r3.L$4 = r6
            r3.label = r8
            java.lang.Object r9 = r0.Bhk(r11, r3, r13)
            if (r9 == r4) goto L_0x0111
            r0 = r6
            goto L_0x00aa
        L_0x0093:
            java.lang.Object r0 = r3.L$4
            java.util.Set r0 = (java.util.Set) r0
            java.lang.Object r6 = r3.L$3
            java.util.Set r6 = (java.util.Set) r6
            java.lang.Object r13 = r3.L$2
            X.0wl r13 = (X.C18600wl) r13
            java.lang.Object r11 = r3.L$1
            X.1EC r11 = (X.AnonymousClass1EC) r11
            java.lang.Object r1 = r3.L$0
            com.whatsapp.contact.picker.DefaultContactsLoader r1 = (com.whatsapp.contact.picker.DefaultContactsLoader) r1
            X.C30691eM.A01(r9)
        L_0x00aa:
            java.util.Collection r9 = (java.util.Collection) r9
            r0.addAll(r9)
            X.00H r0 = r1.A03
            java.lang.Object r0 = r0.get()
            com.whatsapp.contact.picker.RecentlyAcceptedInviteContactsLoader r0 = (com.whatsapp.contact.picker.RecentlyAcceptedInviteContactsLoader) r0
            r3.L$0 = r1
            r3.L$1 = r11
            r3.L$2 = r13
            r3.L$3 = r6
            r3.L$4 = r6
            r3.label = r7
            java.lang.Object r9 = r0.Bhk(r11, r3, r13)
            if (r9 == r4) goto L_0x0111
            r0 = r6
            goto L_0x00e2
        L_0x00cb:
            java.lang.Object r0 = r3.L$4
            java.util.Set r0 = (java.util.Set) r0
            java.lang.Object r6 = r3.L$3
            java.util.Set r6 = (java.util.Set) r6
            java.lang.Object r13 = r3.L$2
            X.0wl r13 = (X.C18600wl) r13
            java.lang.Object r11 = r3.L$1
            X.1EC r11 = (X.AnonymousClass1EC) r11
            java.lang.Object r1 = r3.L$0
            com.whatsapp.contact.picker.DefaultContactsLoader r1 = (com.whatsapp.contact.picker.DefaultContactsLoader) r1
            X.C30691eM.A01(r9)
        L_0x00e2:
            java.util.Collection r9 = (java.util.Collection) r9
            r0.addAll(r9)
            X.00H r0 = r1.A02
            java.lang.Object r1 = r0.get()
            com.whatsapp.contact.picker.NonWaContactsLoader r1 = (com.whatsapp.contact.picker.NonWaContactsLoader) r1
            r3.L$0 = r6
            r3.L$1 = r6
            r0 = 0
            r3.L$2 = r0
            r3.L$3 = r0
            r3.L$4 = r0
            r3.label = r2
            java.lang.Object r9 = r1.Bhk(r11, r3, r13)
            if (r9 == r4) goto L_0x0111
            r0 = r6
            goto L_0x002f
        L_0x0105:
            X.AoY r3 = new X.AoY
            r3.<init>(r10, r12)
            goto L_0x0012
        L_0x010c:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x0111:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.contact.picker.DefaultContactsLoader.Bhk(X.1EC, X.1dr, X.0wl):java.lang.Object");
    }

    public DefaultContactsLoader(AnonymousClass00H r1, AnonymousClass00H r2, AnonymousClass00H r3, AnonymousClass00H r4) {
        C18070vi.A0s(r1, r2, r3, r4);
        this.A00 = r1;
        this.A02 = r2;
        this.A03 = r3;
        this.A01 = r4;
    }

    public String BTj() {
        return "com.whatsapp.contact.picker.DefaultContactsLoader";
    }
}
