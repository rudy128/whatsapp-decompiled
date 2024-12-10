package com.whatsapp.contact.sync;

import X.AnonymousClass1OS;
import X.AnonymousClass2EO;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.contact.sync.AbTableInit$onAfterABPropsChanged$1", f = "AbTableInit.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class AbTableInit$onAfterABPropsChanged$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ AnonymousClass2EO this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbTableInit$onAfterABPropsChanged$1(AnonymousClass2EO r2, C30391dr r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new AbTableInit$onAfterABPropsChanged$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new AbTableInit$onAfterABPropsChanged$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0089, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        X.CDX.A00(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x008d, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0090, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        X.CDX.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0094, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            int r0 = r9.label
            if (r0 != 0) goto L_0x00a7
            X.C30691eM.A01(r10)
            X.2EO r0 = r9.this$0
            X.1M9 r0 = r0.A02
            X.1M2 r0 = r0.A04
            java.util.ArrayList r0 = r0.A0L()
            java.util.ArrayList r2 = X.AnonymousClass000.A13()
            java.util.Iterator r3 = r0.iterator()
        L_0x0019:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0030
            java.lang.Object r1 = r3.next()
            r0 = r1
            X.1E7 r0 = (X.AnonymousClass1E7) r0
            boolean r0 = r0.A0B()
            if (r0 == 0) goto L_0x0019
            r2.add(r1)
            goto L_0x0019
        L_0x0030:
            X.2EO r0 = r9.this$0
            X.1Lo r0 = r0.A01
            X.00H r0 = r0.A00
            java.lang.Object r4 = r0.get()
            X.2Q6 r4 = (X.AnonymousClass2Q6) r4
            java.lang.String r8 = "wa_address_book"
            r3 = 0
            java.lang.String r0 = "AddressBookStore/initializeABTable"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x0095 }
            X.1Lt r0 = r4.A00     // Catch:{ Exception -> 0x0095 }
            X.1au r6 = r0.A06()     // Catch:{ Exception -> 0x0095 }
            X.1xA r7 = r6.BD0()     // Catch:{ all -> 0x008e }
            r0 = 0
            X.C24861Ly.A02(r6, r8, r0, r0)     // Catch:{ all -> 0x0087 }
            java.util.Iterator r5 = r2.iterator()     // Catch:{ all -> 0x0087 }
        L_0x0057:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x0087 }
            if (r0 == 0) goto L_0x0078
            X.1E7 r2 = X.C17880vN.A0O(r5)     // Catch:{ all -> 0x0087 }
            X.1BI r1 = r2.A0J     // Catch:{ all -> 0x0087 }
            boolean r0 = X.C22971Dz.A0d(r1)     // Catch:{ all -> 0x0087 }
            if (r0 == 0) goto L_0x0057
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.jid.UserJid"
            X.C18070vi.A0z(r1, r0)     // Catch:{ all -> 0x0087 }
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1     // Catch:{ all -> 0x0087 }
            android.content.ContentValues r0 = r4.A0I(r2, r1)     // Catch:{ all -> 0x0087 }
            X.C24861Ly.A00(r0, r6, r8)     // Catch:{ all -> 0x0087 }
            goto L_0x0057
        L_0x0078:
            r7.A00()     // Catch:{ all -> 0x0087 }
            r7.close()     // Catch:{ all -> 0x008e }
            r6.close()     // Catch:{ Exception -> 0x0095 }
            java.lang.String r0 = "AddressBookStore/initializeABTable success"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x0095 }
            goto L_0x00a4
        L_0x0087:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0089 }
        L_0x0089:
            r0 = move-exception
            X.CDX.A00(r7, r1)     // Catch:{ all -> 0x008e }
            throw r0     // Catch:{ all -> 0x008e }
        L_0x008e:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0090 }
        L_0x0090:
            r0 = move-exception
            X.CDX.A00(r6, r1)     // Catch:{ Exception -> 0x0095 }
            throw r0     // Catch:{ Exception -> 0x0095 }
        L_0x0095:
            r1 = move-exception
            java.lang.String r0 = "AddressBookStore/initializeABTable failed"
            com.whatsapp.util.Log.e(r0, r1)
            X.190 r2 = r4.A01
            java.lang.String r1 = "AddressBookStore"
            java.lang.String r0 = "initialize-ab-table-failure"
            r2.A0G(r0, r1, r3)
        L_0x00a4:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x00a7:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.contact.sync.AbTableInit$onAfterABPropsChanged$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
