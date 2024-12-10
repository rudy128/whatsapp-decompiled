package com.whatsapp.contact.picker.viewmodels;

import X.AnonymousClass00H;
import X.AnonymousClass11E;
import X.AnonymousClass1G3;
import X.AnonymousClass1J2;
import X.C18030ve;
import X.C18070vi;
import X.C18600wl;
import X.C25691Pg;
import X.C62922sD;

public final class ContactPickerViewModel extends AnonymousClass1J2 {
    public final AnonymousClass11E A00;
    public final C18030ve A01;
    public final AnonymousClass00H A02;
    public final C18600wl A03;
    public final AnonymousClass1G3 A04 = C62922sD.A01(C25691Pg.SUSPEND, 1, 0);
    public final AnonymousClass00H A05;

    public ContactPickerViewModel(AnonymousClass11E r4, C18030ve r5, AnonymousClass00H r6, AnonymousClass00H r7, C18600wl r8) {
        C18070vi.A0d(r5, 1);
        C18070vi.A0p(r6, r7, r4);
        C18070vi.A0d(r8, 5);
        this.A01 = r5;
        this.A05 = r6;
        this.A02 = r7;
        this.A00 = r4;
        this.A03 = r8;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.whatsapp.contact.picker.viewmodels.ContactPickerViewModel r6, com.whatsapp.jid.UserJid r7, X.C30391dr r8) {
        /*
            boolean r0 = r8 instanceof X.AnonymousClass7TL
            if (r0 == 0) goto L_0x0035
            r5 = r8
            X.7TL r5 = (X.AnonymousClass7TL) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0035
            int r2 = r2 - r1
            r5.label = r2
        L_0x0012:
            java.lang.Object r1 = r5.result
            X.1g4 r4 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L_0x0021
            if (r0 != r3) goto L_0x003b
            X.C30691eM.A01(r1)
        L_0x0020:
            return r1
        L_0x0021:
            X.C30691eM.A01(r1)
            X.0wl r2 = r6.A03
            r1 = 0
            com.whatsapp.contact.picker.viewmodels.ContactPickerViewModel$checkBotProfile$2 r0 = new com.whatsapp.contact.picker.viewmodels.ContactPickerViewModel$checkBotProfile$2
            r0.<init>(r6, r7, r1)
            r5.label = r3
            java.lang.Object r1 = X.C30451dy.A00(r5, r2, r0)
            if (r1 != r4) goto L_0x0020
            return r4
        L_0x0035:
            X.7TL r5 = new X.7TL
            r5.<init>(r6, r8)
            goto L_0x0012
        L_0x003b:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.contact.picker.viewmodels.ContactPickerViewModel.A00(com.whatsapp.contact.picker.viewmodels.ContactPickerViewModel, com.whatsapp.jid.UserJid, X.1dr):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A03(com.whatsapp.contact.picker.viewmodels.ContactPickerViewModel r6, com.whatsapp.jid.UserJid r7, X.C30391dr r8) {
        /*
            boolean r0 = r8 instanceof X.AnonymousClass7TM
            if (r0 == 0) goto L_0x0042
            r5 = r8
            X.7TM r5 = (X.AnonymousClass7TM) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0042
            int r2 = r2 - r1
            r5.label = r2
        L_0x0012:
            java.lang.Object r1 = r5.result
            X.1g4 r4 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L_0x0021
            if (r0 != r3) goto L_0x0048
            X.C30691eM.A01(r1)
        L_0x0020:
            return r1
        L_0x0021:
            X.C30691eM.A01(r1)
            X.00H r0 = r6.A05
            java.lang.Object r2 = r0.get()
            X.24f r2 = (X.C446424f) r2
            java.util.List r1 = X.C18070vi.A0M(r7)
            X.2iZ r0 = new X.2iZ
            r0.<init>(r2)
            X.Af0 r0 = r0.A00(r1)
            r5.label = r3
            java.lang.Object r1 = com.whatsapp.async.AsyncFutureCoroutineKt.A00(r0, r5)
            if (r1 != r4) goto L_0x0020
            return r4
        L_0x0042:
            X.7TM r5 = new X.7TM
            r5.<init>(r6, r8)
            goto L_0x0012
        L_0x0048:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.contact.picker.viewmodels.ContactPickerViewModel.A03(com.whatsapp.contact.picker.viewmodels.ContactPickerViewModel, com.whatsapp.jid.UserJid, X.1dr):java.lang.Object");
    }
}
