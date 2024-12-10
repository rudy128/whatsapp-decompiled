package com.whatsapp.invitelink;

import X.AnonymousClass1OS;
import X.C111115iL;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.invitelink.ContactLinkViewModel$1", f = "ContactLinkViewModel.kt", i = {0}, l = {76, 83}, m = "invokeSuspend", n = {"contact"}, s = {"L$2"})
public final class ContactLinkViewModel$1 extends C30431dv implements AnonymousClass1OS {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public final /* synthetic */ C111115iL this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContactLinkViewModel$1(C111115iL r2, C30391dr r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new ContactLinkViewModel$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new ContactLinkViewModel$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0084 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            X.1g4 r5 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r14.label
            r6 = 2
            r7 = 1
            if (r0 == 0) goto L_0x0020
            if (r0 == r7) goto L_0x0012
            if (r0 != r6) goto L_0x0085
            X.C30691eM.A01(r15)
        L_0x000f:
            X.1Wu r5 = X.C27621Wu.A00
        L_0x0011:
            return r5
        L_0x0012:
            java.lang.Object r9 = r14.L$2
            X.1E7 r9 = (X.AnonymousClass1E7) r9
            java.lang.Object r0 = r14.L$1
            X.5iL r0 = (X.C111115iL) r0
            java.lang.Object r4 = r14.L$0
            X.C30691eM.A01(r15)
            goto L_0x0055
        L_0x0020:
            X.C30691eM.A01(r15)
            X.5iL r0 = r14.this$0
            X.1M9 r1 = r0.A03
            X.1BI r0 = r0.A06
            X.1E7 r9 = r1.A0E(r0)
            if (r9 == 0) goto L_0x000f
            X.5iL r0 = r14.this$0
            X.1G4 r4 = r0.A07
            java.lang.Object r2 = r4.getValue()
            X.6zc r2 = (X.C139896zc) r2
            X.1Me r1 = r0.A04
            java.lang.String r3 = r1.A0I(r9)
            android.graphics.Bitmap r2 = r2.A00
            X.6zc r1 = new X.6zc
            r1.<init>(r2, r9, r3)
            r14.L$0 = r9
            r14.L$1 = r0
            r14.L$2 = r9
            r14.label = r7
            java.lang.Object r1 = r4.BJt(r1, r14)
            if (r1 == r5) goto L_0x0011
            r4 = r9
        L_0x0055:
            X.1Vc r7 = r0.A05
            android.content.Context r8 = r0.A02
            int r12 = r0.A01
            float r11 = r0.A00
            r13 = 0
            java.lang.String r10 = "ShareChatInviteLinkViewModel"
            android.graphics.Bitmap r8 = r7.A04(r8, r9, r10, r11, r12, r13)
            X.1G4 r7 = r0.A07
            java.lang.Object r0 = r7.getValue()
            X.6zc r0 = (X.C139896zc) r0
            r3 = 0
            X.1E7 r2 = r0.A01
            java.lang.String r1 = r0.A02
            X.6zc r0 = new X.6zc
            r0.<init>(r8, r2, r1)
            r14.L$0 = r4
            r14.L$1 = r8
            r14.L$2 = r3
            r14.label = r6
            java.lang.Object r0 = r7.BJt(r0, r14)
            if (r0 != r5) goto L_0x000f
            return r5
        L_0x0085:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.invitelink.ContactLinkViewModel$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
