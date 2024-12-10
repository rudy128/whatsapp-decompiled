package com.whatsapp.community;

import X.AnonymousClass1BI;
import X.AnonymousClass1OS;
import X.AnonymousClass4Xp;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.community.AggregateCommunityObserver$conversationObserver$1$onConversationDeleted$1", f = "AggregateCommunityObserver.kt", i = {}, l = {185, 186}, m = "invokeSuspend", n = {}, s = {})
public final class AggregateCommunityObserver$conversationObserver$1$onConversationDeleted$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass1BI $chatJid;
    public Object L$0;
    public int label;
    public final /* synthetic */ AnonymousClass4Xp this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AggregateCommunityObserver$conversationObserver$1$onConversationDeleted$1(AnonymousClass4Xp r2, AnonymousClass1BI r3, C30391dr r4) {
        super(2, r4);
        this.$chatJid = r3;
        this.this$0 = r2;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new AggregateCommunityObserver$conversationObserver$1$onConversationDeleted$1(this.this$0, this.$chatJid, r5);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0066  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            X.1g4 r5 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r6.label
            r4 = 2
            r2 = 1
            if (r0 == 0) goto L_0x0039
            if (r0 == r2) goto L_0x0057
            if (r0 != r4) goto L_0x007b
            X.C30691eM.A01(r7)
        L_0x000f:
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            X.1BI r0 = r6.$chatJid
            boolean r0 = X.C29431cG.A18(r7, r0)
            if (r0 == 0) goto L_0x0080
            X.4Xp r0 = r6.this$0
            java.util.Iterator r3 = X.AnonymousClass4Xp.A00(r0)
        L_0x001f:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0080
            X.4jh r2 = X.AnonymousClass3MY.A0M(r3)
            int r0 = r2.A00
            if (r0 != 0) goto L_0x001f
            java.lang.Object r0 = r2.A01
            X.3Uc r0 = (X.AnonymousClass3Uc) r0
            X.10s r1 = r0.A10
            r0 = 28
            X.C98754rf.A00(r1, r2, r0)
            goto L_0x001f
        L_0x0039:
            X.C30691eM.A01(r7)
            X.1nh r0 = com.whatsapp.jid.GroupJid.Companion
            X.1BI r0 = r6.$chatJid
            com.whatsapp.jid.GroupJid r0 = X.C36321nh.A00(r0)
            if (r0 == 0) goto L_0x0080
            X.4Xp r1 = r6.this$0
            X.1xo r0 = r1.A0H
            X.EEF r1 = r1.A0L
            r6.L$0 = r0
            r6.label = r2
            java.lang.Object r7 = r1.BCp(r6)
            if (r7 != r5) goto L_0x005e
            return r5
        L_0x0057:
            java.lang.Object r0 = r6.L$0
            X.1xo r0 = (X.C42211xo) r0
            X.C30691eM.A01(r7)
        L_0x005e:
            X.1E7 r7 = (X.AnonymousClass1E7) r7
            boolean r0 = r0.A00(r7)
            if (r0 == 0) goto L_0x0080
            X.4Xp r3 = r6.this$0
            r2 = 0
            r6.L$0 = r2
            r6.label = r4
            X.0wl r1 = r3.A0J
            com.whatsapp.community.AggregateCommunityObserver$getCommunitySubgroupsMeParticipating$2 r0 = new com.whatsapp.community.AggregateCommunityObserver$getCommunitySubgroupsMeParticipating$2
            r0.<init>(r3, r2)
            java.lang.Object r7 = X.C30451dy.A00(r6, r1, r0)
            if (r7 != r5) goto L_0x000f
            return r5
        L_0x007b:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x0080:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.community.AggregateCommunityObserver$conversationObserver$1$onConversationDeleted$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AggregateCommunityObserver$conversationObserver$1$onConversationDeleted$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
