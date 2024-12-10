package com.whatsapp.spamreport;

import X.AnonymousClass1E7;
import X.AnonymousClass1EC;
import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.spamreport.ReportSpamDialogFragment$shouldHideCheckBoxContainer$2", f = "ReportSpamDialogFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ReportSpamDialogFragment$shouldHideCheckBoxContainer$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass1E7 $contact;
    public final /* synthetic */ AnonymousClass1EC $contactGroupJid;
    public int label;
    public final /* synthetic */ ReportSpamDialogFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReportSpamDialogFragment$shouldHideCheckBoxContainer$2(AnonymousClass1E7 r2, AnonymousClass1EC r3, ReportSpamDialogFragment reportSpamDialogFragment, C30391dr r5) {
        super(2, r5);
        this.this$0 = reportSpamDialogFragment;
        this.$contactGroupJid = r3;
        this.$contact = r2;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        ReportSpamDialogFragment reportSpamDialogFragment = this.this$0;
        return new ReportSpamDialogFragment$shouldHideCheckBoxContainer$2(this.$contact, this.$contactGroupJid, reportSpamDialogFragment, r6);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006c, code lost:
        if (r0 != false) goto L_0x006e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.label
            if (r0 != 0) goto L_0x009d
            X.C30691eM.A01(r7)
            com.whatsapp.spamreport.ReportSpamDialogFragment r0 = r6.this$0
            X.1CJ r1 = r0.A09
            if (r1 == 0) goto L_0x0093
            X.1EC r0 = r6.$contactGroupJid
            int r2 = r1.A06(r0)
            r1 = 3
            r5 = 0
            r4 = 1
            com.whatsapp.spamreport.ReportSpamDialogFragment r0 = r6.this$0
            if (r2 != r1) goto L_0x0074
            X.00H r0 = r0.A0G
            if (r0 == 0) goto L_0x008d
            X.1kb r1 = X.AnonymousClass3MW.A0Z(r0)
            X.1EC r0 = r6.$contactGroupJid
            X.1EC r3 = r1.A05(r0)
            if (r3 != 0) goto L_0x0052
            X.1E7 r0 = r6.$contact
            int r0 = r0.A05
            if (r0 == r4) goto L_0x0052
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "ReportSpamDialogFragment/nullParent/"
            r1.append(r0)
            X.1EC r0 = r6.$contactGroupJid
            r1.append(r0)
            X.C17890vO.A0w(r1)
            com.whatsapp.spamreport.ReportSpamDialogFragment r0 = r6.this$0
            X.190 r2 = r0.A00
            if (r2 == 0) goto L_0x0096
            X.0vl r0 = r0.A0T
            java.lang.String r1 = X.AnonymousClass3MW.A0y(r0)
            java.lang.String r0 = "ReportSpamDialogFragment/nullParent"
            r2.A0G(r0, r1, r4)
        L_0x0052:
            com.whatsapp.spamreport.ReportSpamDialogFragment r0 = r6.this$0
            X.1MZ r1 = r0.A0A
            if (r1 == 0) goto L_0x0090
            X.1EC r0 = r6.$contactGroupJid
            boolean r0 = r1.A0K(r0)
            if (r0 != 0) goto L_0x006e
            if (r3 == 0) goto L_0x006f
            com.whatsapp.spamreport.ReportSpamDialogFragment r0 = r6.this$0
            X.1MZ r0 = r0.A0A
            if (r0 == 0) goto L_0x0090
            boolean r0 = r0.A0K(r3)
        L_0x006c:
            if (r0 == 0) goto L_0x006f
        L_0x006e:
            r5 = 1
        L_0x006f:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            return r0
        L_0x0074:
            X.1MZ r1 = r0.A0A
            if (r1 == 0) goto L_0x0090
            X.1EC r0 = r6.$contactGroupJid
            boolean r0 = r1.A0P(r0)
            if (r0 == 0) goto L_0x006f
            com.whatsapp.spamreport.ReportSpamDialogFragment r0 = r6.this$0
            X.1CJ r1 = r0.A09
            if (r1 == 0) goto L_0x0093
            X.1EC r0 = r6.$contactGroupJid
            boolean r0 = r1.A0U(r0)
            goto L_0x006c
        L_0x008d:
            java.lang.String r0 = "communityChatManager"
            goto L_0x0098
        L_0x0090:
            java.lang.String r0 = "groupParticipantsManager"
            goto L_0x0098
        L_0x0093:
            java.lang.String r0 = "chatsCache"
            goto L_0x0098
        L_0x0096:
            java.lang.String r0 = "crashLogs"
        L_0x0098:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x009d:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.spamreport.ReportSpamDialogFragment$shouldHideCheckBoxContainer$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ReportSpamDialogFragment$shouldHideCheckBoxContainer$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
