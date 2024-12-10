package com.whatsapp.calling.favorite.calllist;

import X.AnonymousClass000;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C36001nB;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.favorite.calllist.FavoriteCallListViewModel$favorites$1", f = "FavoriteCallListViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class FavoriteCallListViewModel$favorites$1 extends C30431dv implements C36001nB {
    public /* synthetic */ Object L$0;
    public /* synthetic */ boolean Z$0;
    public int label;
    public final /* synthetic */ FavoriteCallListViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FavoriteCallListViewModel$favorites$1(FavoriteCallListViewModel favoriteCallListViewModel, C30391dr r3) {
        super(3, r3);
        this.this$0 = favoriteCallListViewModel;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0074, code lost:
        if (X.C63982u1.A07(r5.A00, r10, r1, r14, r2, (com.whatsapp.jid.GroupJid) r7) != false) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x009b, code lost:
        if (X.C63982u1.A07(r5.A00, r3, r1, r14, r2, (com.whatsapp.jid.GroupJid) r7) != false) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x004c, code lost:
        if (X.C40811vJ.A0J(r2, r10, X.AnonymousClass3MW.A03(r1, (X.AnonymousClass1E9) r7), false) == false) goto L_0x004e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x007c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            r24 = this;
            r1 = r24
            int r0 = r1.label
            if (r0 != 0) goto L_0x00ba
            X.C30691eM.A01(r25)
            java.lang.Object r0 = r1.L$0
            java.util.List r0 = (java.util.List) r0
            boolean r6 = r1.Z$0
            com.whatsapp.calling.favorite.calllist.FavoriteCallListViewModel r5 = r1.this$0
            java.util.ArrayList r4 = X.C29351c6.A0D(r0)
            java.util.Iterator r12 = r0.iterator()
        L_0x0019:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x00b1
            java.lang.Object r15 = r12.next()
            X.2rT r15 = (X.C62482rT) r15
            X.1M9 r0 = r5.A03
            X.1BI r7 = r15.A03
            X.1E7 r14 = r0.A0H(r7)
            X.2Qt r9 = r15.A02
            X.2Qt r8 = X.C49512Qt.GROUP
            java.lang.String r3 = "null cannot be cast to non-null type com.whatsapp.jid.GroupJid"
            if (r9 != r8) goto L_0x004e
            X.0ve r10 = r5.A06
            X.11S r2 = r5.A01
            X.1MZ r1 = r5.A05
            X.C18070vi.A0z(r7, r3)
            r0 = r7
            X.1E9 r0 = (X.AnonymousClass1E9) r0
            int r1 = X.AnonymousClass3MW.A03(r1, r0)
            r0 = 0
            boolean r0 = X.C40811vJ.A0J(r2, r10, r1, r0)
            r16 = 1
            if (r0 != 0) goto L_0x00ae
        L_0x004e:
            r16 = 0
            X.2Qt r0 = X.C49512Qt.ONE_TO_ONE
            if (r9 == r0) goto L_0x0076
            if (r9 != r8) goto L_0x00ae
            X.C18070vi.A0z(r7, r3)
            r11 = r7
            com.whatsapp.jid.GroupJid r11 = (com.whatsapp.jid.GroupJid) r11
            X.1CJ r10 = r5.A04
            X.0ve r2 = r5.A06
            X.1MZ r1 = r5.A05
            X.0zA r0 = r5.A00
            r19 = r1
            r20 = r14
            r21 = r2
            r22 = r11
            r17 = r0
            r18 = r10
            boolean r0 = X.C63982u1.A07(r17, r18, r19, r20, r21, r22)
            if (r0 == 0) goto L_0x00ae
        L_0x0076:
            r17 = 1
        L_0x0078:
            X.2Qt r0 = X.C49512Qt.ONE_TO_ONE
            if (r9 == r0) goto L_0x009d
            if (r9 != r8) goto L_0x00ab
            X.C18070vi.A0z(r7, r3)
            com.whatsapp.jid.GroupJid r7 = (com.whatsapp.jid.GroupJid) r7
            X.1CJ r3 = r5.A04
            X.0ve r2 = r5.A06
            X.1MZ r1 = r5.A05
            X.0zA r0 = r5.A00
            r19 = r3
            r20 = r1
            r21 = r14
            r22 = r2
            r23 = r7
            r18 = r0
            boolean r0 = X.C63982u1.A07(r18, r19, r20, r21, r22, r23)
            if (r0 == 0) goto L_0x00ab
        L_0x009d:
            r18 = 1
        L_0x009f:
            X.4jB r13 = new X.4jB
            r19 = r6
            r13.<init>(r14, r15, r16, r17, r18, r19)
            r4.add(r13)
            goto L_0x0019
        L_0x00ab:
            r18 = 0
            goto L_0x009f
        L_0x00ae:
            r17 = 0
            goto L_0x0078
        L_0x00b1:
            if (r6 == 0) goto L_0x00b9
            X.4jC r0 = X.C93574jC.A00
            java.util.ArrayList r4 = X.C29431cG.A0l(r0, r4)
        L_0x00b9:
            return r4
        L_0x00ba:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.favorite.calllist.FavoriteCallListViewModel$favorites$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        boolean A1Y = AnonymousClass000.A1Y(obj2);
        FavoriteCallListViewModel$favorites$1 favoriteCallListViewModel$favorites$1 = new FavoriteCallListViewModel$favorites$1(this.this$0, (C30391dr) obj3);
        favoriteCallListViewModel$favorites$1.L$0 = obj;
        favoriteCallListViewModel$favorites$1.Z$0 = A1Y;
        return favoriteCallListViewModel$favorites$1.invokeSuspend(C27621Wu.A00);
    }
}
