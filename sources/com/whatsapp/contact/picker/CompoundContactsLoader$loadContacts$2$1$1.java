package com.whatsapp.contact.picker;

import X.AnonymousClass1EC;
import X.AnonymousClass1OS;
import X.C107975av;
import X.C18600wl;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.contact.picker.CompoundContactsLoader$loadContacts$2$1$1", f = "CompoundContactsLoader.kt", i = {}, l = {43, 43}, m = "invokeSuspend", n = {}, s = {})
public final class CompoundContactsLoader$loadContacts$2$1$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C18600wl $dispatcher;
    public final /* synthetic */ AnonymousClass1EC $groupJid;
    public final /* synthetic */ C107975av $loader;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CompoundContactsLoader$loadContacts$2$1$1(C107975av r2, AnonymousClass1EC r3, C30391dr r4, C18600wl r5) {
        super(2, r4);
        this.$loader = r2;
        this.$groupJid = r3;
        this.$dispatcher = r5;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        CompoundContactsLoader$loadContacts$2$1$1 compoundContactsLoader$loadContacts$2$1$1 = new CompoundContactsLoader$loadContacts$2$1$1(this.$loader, this.$groupJid, r6, this.$dispatcher);
        compoundContactsLoader$loadContacts$2$1$1.L$0 = obj;
        return compoundContactsLoader$loadContacts$2$1$1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x004a A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            X.1g4 r7 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r8.label
            r6 = 2
            r5 = 1
            if (r0 == 0) goto L_0x0012
            if (r0 == r5) goto L_0x0030
            if (r0 != r6) goto L_0x004b
            X.C30691eM.A01(r9)
        L_0x000f:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0012:
            X.C30691eM.A01(r9)
            java.lang.Object r4 = r8.L$0
            X.1G2 r4 = (X.AnonymousClass1G2) r4
            X.5av r3 = r8.$loader
            java.lang.String r2 = r3.BTj()
            X.1EC r1 = r8.$groupJid
            X.0wl r0 = r8.$dispatcher
            r8.L$0 = r4
            r8.L$1 = r2
            r8.label = r5
            java.lang.Object r9 = r3.Bhk(r1, r8, r0)
            if (r9 != r7) goto L_0x0039
            return r7
        L_0x0030:
            java.lang.Object r2 = r8.L$1
            java.lang.Object r4 = r8.L$0
            X.1G2 r4 = (X.AnonymousClass1G2) r4
            X.C30691eM.A01(r9)
        L_0x0039:
            X.1D6 r1 = X.AnonymousClass1D6.A01(r2, r9)
            r0 = 0
            r8.L$0 = r0
            r8.L$1 = r0
            r8.label = r6
            java.lang.Object r0 = r4.BJt(r1, r8)
            if (r0 != r7) goto L_0x000f
            return r7
        L_0x004b:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.contact.picker.CompoundContactsLoader$loadContacts$2$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((CompoundContactsLoader$loadContacts$2$1$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
