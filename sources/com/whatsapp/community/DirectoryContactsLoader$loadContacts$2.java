package com.whatsapp.community;

import X.AnonymousClass1EC;
import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.community.DirectoryContactsLoader$loadContacts$2", f = "DirectoryContactsLoader.kt", i = {}, l = {55}, m = "invokeSuspend", n = {}, s = {})
public final class DirectoryContactsLoader$loadContacts$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass1EC $groupJid;
    public Object L$0;
    public int label;
    public final /* synthetic */ DirectoryContactsLoader this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DirectoryContactsLoader$loadContacts$2(DirectoryContactsLoader directoryContactsLoader, AnonymousClass1EC r3, C30391dr r4) {
        super(2, r4);
        this.this$0 = directoryContactsLoader;
        this.$groupJid = r3;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new DirectoryContactsLoader$loadContacts$2(this.this$0, this.$groupJid, r5);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0060  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            X.1g4 r3 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r6.label
            r2 = 1
            if (r0 == 0) goto L_0x0035
            if (r0 != r2) goto L_0x008c
            java.lang.Object r4 = r6.L$0
            com.whatsapp.community.DirectoryContactsLoader r4 = (com.whatsapp.community.DirectoryContactsLoader) r4
            X.C30691eM.A01(r7)
        L_0x0010:
            java.util.Map r7 = (java.util.Map) r7
            java.util.Set r0 = r7.keySet()
            java.util.ArrayList r5 = X.AnonymousClass000.A13()
            java.util.Iterator r3 = r0.iterator()
        L_0x001e:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x006f
            java.lang.Object r2 = r3.next()
            r1 = r2
            X.1BI r1 = (X.AnonymousClass1BI) r1
            X.11S r0 = r4.A00
            boolean r0 = r0.A0O(r1)
            X.AnonymousClass3MZ.A1V(r2, r5, r0)
            goto L_0x001e
        L_0x0035:
            X.C30691eM.A01(r7)
            com.whatsapp.community.DirectoryContactsLoader r0 = r6.this$0
            X.1CJ r1 = r0.A03
            X.1EC r0 = r6.$groupJid
            int r1 = r1.A06(r0)
            if (r1 == r2) goto L_0x004d
            r0 = 2
            if (r1 == r0) goto L_0x0050
            r0 = 6
            if (r1 == r0) goto L_0x0050
        L_0x004a:
            X.1Om r0 = X.C25511Om.A00
            return r0
        L_0x004d:
            X.1EC r1 = r6.$groupJid
            goto L_0x005e
        L_0x0050:
            com.whatsapp.community.DirectoryContactsLoader r0 = r6.this$0
            X.00H r0 = r0.A04
            X.1kb r1 = X.AnonymousClass3MW.A0Z(r0)
            X.1EC r0 = r6.$groupJid
            X.1EC r1 = r1.A05(r0)
        L_0x005e:
            if (r1 == 0) goto L_0x004a
            com.whatsapp.community.DirectoryContactsLoader r4 = r6.this$0
            X.1gd r0 = r4.A01
            r6.L$0 = r4
            r6.label = r2
            java.lang.Object r7 = r0.BOz(r1, r6)
            if (r7 != r3) goto L_0x0010
            return r3
        L_0x006f:
            java.util.ArrayList r3 = X.C29351c6.A0D(r5)
            java.util.Iterator r2 = r5.iterator()
        L_0x0077:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0087
            X.1BI r1 = X.C17880vN.A0Q(r2)
            X.1M9 r0 = r4.A02
            X.AnonymousClass3MY.A1O(r0, r1, r3)
            goto L_0x0077
        L_0x0087:
            java.util.Set r0 = X.C29431cG.A12(r3)
            return r0
        L_0x008c:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.community.DirectoryContactsLoader$loadContacts$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((DirectoryContactsLoader$loadContacts$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
