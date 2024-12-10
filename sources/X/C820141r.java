package X;

import com.whatsapp.bot.metaai.imagineme.ImagineMeOnboardingViewModel;
import com.whatsapp.infra.graphql.BaseMexCallback;

/* renamed from: X.41r  reason: invalid class name and case insensitive filesystem */
public class C820141r extends BaseMexCallback {
    public final int A00;
    public final Object A01;

    public C820141r(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(String str, C30391dr r2) {
        r2.resumeWith(new C30671eK(C30691eM.A00(new Exception(str))));
    }

    /* JADX WARNING: type inference failed for: r8v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void A02(X.C20125A8k r10) {
        /*
            r9 = this;
            int r1 = r9.A00
            r0 = 0
            switch(r1) {
                case 0: goto L_0x0145;
                case 1: goto L_0x010d;
                case 2: goto L_0x009a;
                case 3: goto L_0x005c;
                default: goto L_0x0006;
            }
        L_0x0006:
            X.C18070vi.A0d(r10, r0)
            java.lang.String r6 = "xwa2_bots_delete_self_memu_pic"
            java.lang.Class<com.whatsapp.infra.graphql.generated.bots.DeleteImagineMeOnboardingResponseImpl$Xwa2BotsDeleteSelfMemuPic> r5 = com.whatsapp.infra.graphql.generated.bots.DeleteImagineMeOnboardingResponseImpl.Xwa2BotsDeleteSelfMemuPic.class
            X.A8k r2 = r10.A09(r5, r6)
            r4 = 0
            if (r2 == 0) goto L_0x0039
            com.whatsapp.infra.graphql.generated.bots.enums.GraphQLXWA2BotsDeleteSelfMemuPicResult r1 = com.whatsapp.infra.graphql.generated.bots.enums.GraphQLXWA2BotsDeleteSelfMemuPicResult.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r0 = "result"
            java.lang.Enum r0 = r2.A0D(r1, r0)
            X.C18070vi.A0X(r0)
            com.whatsapp.infra.graphql.generated.bots.enums.GraphQLXWA2BotsDeleteSelfMemuPicResult r0 = (com.whatsapp.infra.graphql.generated.bots.enums.GraphQLXWA2BotsDeleteSelfMemuPicResult) r0
            if (r0 == 0) goto L_0x0039
            int r1 = r0.ordinal()
            r0 = 1
            if (r1 != r0) goto L_0x0039
            java.lang.Object r3 = r9.A01
            X.1dr r3 = (X.C30391dr) r3
            X.1Wu r1 = X.C27621Wu.A00
        L_0x0030:
            X.1eK r0 = new X.1eK
            r0.<init>(r1)
            r3.resumeWith(r0)
            return
        L_0x0039:
            java.lang.Object r3 = r9.A01
            X.1dr r3 = (X.C30391dr) r3
            X.A8k r2 = r10.A09(r5, r6)
            if (r2 == 0) goto L_0x0052
            com.whatsapp.infra.graphql.generated.bots.enums.GraphQLXWA2BotsDeleteSelfMemuPicResult r1 = com.whatsapp.infra.graphql.generated.bots.enums.GraphQLXWA2BotsDeleteSelfMemuPicResult.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r0 = "result"
            java.lang.Enum r0 = r2.A0D(r1, r0)
            X.C18070vi.A0X(r0)
            java.lang.String r4 = r0.toString()
        L_0x0052:
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>(r4)
            X.1IU r1 = X.C30691eM.A00(r0)
            goto L_0x0030
        L_0x005c:
            X.C18070vi.A0d(r10, r0)
            java.lang.String r1 = "xwa2_fetch_wa_users"
            java.lang.Class<com.whatsapp.infra.graphql.generated.bots.GetImagineMeOnboardedResponseImpl$Xwa2FetchWaUsers> r0 = com.whatsapp.infra.graphql.generated.bots.GetImagineMeOnboardedResponseImpl.Xwa2FetchWaUsers.class
            X.1IX r0 = r10.A0A(r0, r1)
            if (r0 == 0) goto L_0x0098
            java.lang.Object r0 = X.C29431cG.A0c(r0)
            com.whatsapp.infra.graphql.generated.bots.GetImagineMeOnboardedResponseImpl$Xwa2FetchWaUsers r0 = (com.whatsapp.infra.graphql.generated.bots.GetImagineMeOnboardedResponseImpl.Xwa2FetchWaUsers) r0
            if (r0 == 0) goto L_0x0098
            com.whatsapp.infra.graphql.generated.bots.ImagineMeFieldsImpl r1 = r0.A0H()
            if (r1 == 0) goto L_0x0098
            java.lang.String r0 = "memu_onboarded"
            boolean r0 = r1.A0G(r0)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
        L_0x0081:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "ImagineMeOnboardingViewModel/onData success="
            X.C17900vP.A0Y(r2, r0, r1)
            java.lang.Object r0 = r9.A01
            com.whatsapp.bot.metaai.imagineme.ImagineMeOnboardingViewModel r0 = (com.whatsapp.bot.metaai.imagineme.ImagineMeOnboardingViewModel) r0
            X.1Dg r1 = r0.A04
            boolean r0 = X.C72463Mc.A1Y(r2)
            X.AnonymousClass3MY.A1M(r1, r0)
            return
        L_0x0098:
            r2 = 0
            goto L_0x0081
        L_0x009a:
            X.C18070vi.A0d(r10, r0)
            java.lang.String r1 = "xfb_gen_ai_wa_manage_memory_query"
            java.lang.Class<com.whatsapp.infra.graphql.generated.aimemory.MetaAIMemoryQueryResponseImpl$XfbGenAiWaManageMemoryQuery> r0 = com.whatsapp.infra.graphql.generated.aimemory.MetaAIMemoryQueryResponseImpl.XfbGenAiWaManageMemoryQuery.class
            X.A8k r2 = r10.A09(r0, r1)
            if (r2 == 0) goto L_0x0101
            java.lang.String r1 = "edges"
            java.lang.Class<com.whatsapp.infra.graphql.generated.aimemory.MetaAIMemoryQueryResponseImpl$XfbGenAiWaManageMemoryQuery$Edges> r0 = com.whatsapp.infra.graphql.generated.aimemory.MetaAIMemoryQueryResponseImpl.XfbGenAiWaManageMemoryQuery.Edges.class
            X.1IX r0 = r2.A0A(r0, r1)
            X.C199610h.A04(r0)
            X.C18070vi.A0X(r0)
            java.util.ArrayList r8 = X.AnonymousClass000.A13()
            java.util.Iterator r7 = r0.iterator()
        L_0x00bd:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0103
            java.lang.Object r6 = r7.next()
            X.A8k r6 = (X.C20125A8k) r6
            java.lang.String r5 = "node"
            java.lang.Class<com.whatsapp.infra.graphql.generated.aimemory.MetaAIMemoryQueryResponseImpl$XfbGenAiWaManageMemoryQuery$Edges$Node> r4 = com.whatsapp.infra.graphql.generated.aimemory.MetaAIMemoryQueryResponseImpl.XfbGenAiWaManageMemoryQuery.Edges.Node.class
            X.A8k r1 = r6.A09(r4, r5)
            r3 = 0
            if (r1 == 0) goto L_0x00ff
            java.lang.String r0 = "id"
            java.lang.String r2 = r1.A0F(r0)
        L_0x00da:
            X.A8k r1 = r6.A09(r4, r5)
            if (r1 == 0) goto L_0x00e6
            java.lang.String r0 = "text"
            java.lang.String r3 = r1.A0F(r0)
        L_0x00e6:
            if (r2 == 0) goto L_0x00bd
            boolean r0 = X.AnonymousClass1YF.A0T(r2)
            if (r0 != 0) goto L_0x00bd
            if (r3 == 0) goto L_0x00bd
            boolean r0 = X.AnonymousClass1YF.A0T(r3)
            if (r0 != 0) goto L_0x00bd
            X.6qf r0 = new X.6qf
            r0.<init>(r2, r3)
            r8.add(r0)
            goto L_0x00bd
        L_0x00ff:
            r2 = r3
            goto L_0x00da
        L_0x0101:
            X.0wS r8 = X.C18460wS.A00
        L_0x0103:
            java.lang.Object r2 = r9.A01
            X.1dr r2 = (X.C30391dr) r2
            X.1eK r0 = new X.1eK
            r0.<init>(r8)
            goto L_0x015b
        L_0x010d:
            X.C18070vi.A0d(r10, r0)
            java.lang.String r1 = "xfb_bulk_delete_facts"
            java.lang.Class<com.whatsapp.infra.graphql.generated.aimemory.MetaAIMemoryDeleteResponseImpl$XfbBulkDeleteFacts> r0 = com.whatsapp.infra.graphql.generated.aimemory.MetaAIMemoryDeleteResponseImpl.XfbBulkDeleteFacts.class
            X.A8k r1 = r10.A09(r0, r1)
            if (r1 == 0) goto L_0x013c
            java.lang.String r0 = "deleted_fact_ids"
            X.1IX r1 = r1.A0C(r0)
            X.C199610h.A04(r1)
            X.C18070vi.A0X(r1)
        L_0x0126:
            boolean r0 = r1.isEmpty()
            java.lang.Object r2 = r9.A01
            X.1dr r2 = (X.C30391dr) r2
            if (r0 == 0) goto L_0x013f
            java.lang.String r1 = "No memory ids deleted"
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>(r1)
            X.1IU r1 = X.C30691eM.A00(r0)
            goto L_0x0156
        L_0x013c:
            X.0wS r1 = X.C18460wS.A00
            goto L_0x0126
        L_0x013f:
            X.1eK r0 = new X.1eK
            r0.<init>(r1)
            goto L_0x015b
        L_0x0145:
            X.C18070vi.A0d(r10, r0)
            java.lang.String r0 = "xfb_delete_all_facts"
            boolean r0 = r10.A0G(r0)
            java.lang.Object r2 = r9.A01
            X.1dr r2 = (X.C30391dr) r2
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
        L_0x0156:
            X.1eK r0 = new X.1eK
            r0.<init>(r1)
        L_0x015b:
            r2.resumeWith(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C820141r.A02(X.A8k):void");
    }

    public boolean A05(A6Z a6z) {
        switch (this.A00) {
            case 0:
                C17900vP.A0X(a6z, "MemoryRemoteDataSource/deleteAllMemories/onError: ", C18070vi.A0K(a6z));
                A00(a6z.A03(), (C30391dr) this.A01);
                return false;
            case 1:
                C17900vP.A0X(a6z, "MemoryRemoteDataSource/deleteMemories/onError: ", C18070vi.A0K(a6z));
                A00(a6z.A03(), (C30391dr) this.A01);
                return false;
            case 2:
                C17900vP.A0X(a6z, "MemoryRemoteDataSource/fetchMemories/onError: ", C18070vi.A0K(a6z));
                A00(a6z.A03(), (C30391dr) this.A01);
                return false;
            case 3:
                C17900vP.A0Y(a6z, "ImagineMeOnboardingViewModel/onError error=", AnonymousClass3MZ.A19(a6z, 0));
                AnonymousClass3MY.A1M(((ImagineMeOnboardingViewModel) this.A01).A04, false);
                return false;
            default:
                C18070vi.A0d(a6z, 0);
                A00(a6z.toString(), (C30391dr) this.A01);
                return false;
        }
    }
}
