package com.whatsapp.community.mex;

import X.AnonymousClass1PY;
import X.C18070vi;

public final class TransferCommunityOwnershipGraphQlHandler {
    public final AnonymousClass1PY A00;

    public TransferCommunityOwnershipGraphQlHandler(AnonymousClass1PY r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(com.whatsapp.jid.GroupJid r10, com.whatsapp.jid.UserJid r11, X.C30391dr r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof X.C21620AnB
            if (r0 == 0) goto L_0x001e
            r3 = r12
            X.AnB r3 = (X.C21620AnB) r3
            int r2 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x001e
            int r2 = r2 - r1
            r3.label = r2
        L_0x0012:
            java.lang.Object r1 = r3.result
            X.1g4 r2 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r3.label
            r5 = 1
            if (r0 == 0) goto L_0x002d
            if (r0 != r5) goto L_0x0028
            goto L_0x0024
        L_0x001e:
            X.AnB r3 = new X.AnB
            r3.<init>(r9, r12)
            goto L_0x0012
        L_0x0024:
            X.C30691eM.A01(r1)     // Catch:{ 1Uc -> 0x0084 }
            goto L_0x0081
        L_0x0028:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x002d:
            X.C30691eM.A01(r1)
            X.1PY r6 = r9.A00     // Catch:{ 1Uc -> 0x0084 }
            X.A7K r4 = X.A7K.A00()     // Catch:{ 1Uc -> 0x0084 }
            com.whatsapp.infra.graphql.generated.groups.calls.XWA2GroupParticipantsRolesUpdateInput r8 = new com.whatsapp.infra.graphql.generated.groups.calls.XWA2GroupParticipantsRolesUpdateInput     // Catch:{ 1Uc -> 0x0084 }
            r8.<init>()     // Catch:{ 1Uc -> 0x0084 }
            java.lang.String r7 = r10.getRawString()     // Catch:{ 1Uc -> 0x0084 }
            r1 = 0
            X.C18070vi.A0d(r7, r1)     // Catch:{ 1Uc -> 0x0084 }
            java.lang.String r0 = "group_id"
            r8.A05(r0, r7)     // Catch:{ 1Uc -> 0x0084 }
            com.whatsapp.infra.graphql.generated.groups.calls.XWA2GroupParticipantRoleUpdateInput r7 = new com.whatsapp.infra.graphql.generated.groups.calls.XWA2GroupParticipantRoleUpdateInput     // Catch:{ 1Uc -> 0x0084 }
            r7.<init>()     // Catch:{ 1Uc -> 0x0084 }
            X.C18070vi.A0d(r11, r1)     // Catch:{ 1Uc -> 0x0084 }
            java.lang.String r1 = "user_jid"
            java.lang.String r0 = r11.getRawString()     // Catch:{ 1Uc -> 0x0084 }
            r7.A05(r1, r0)     // Catch:{ 1Uc -> 0x0084 }
            java.lang.String r1 = "SUPERADMIN_MEMBER"
            java.lang.String r0 = "new_role"
            r7.A05(r0, r1)     // Catch:{ 1Uc -> 0x0084 }
            java.util.List r1 = X.C18070vi.A0M(r7)     // Catch:{ 1Uc -> 0x0084 }
            java.lang.String r0 = "role_updates"
            r8.A06(r0, r1)     // Catch:{ 1Uc -> 0x0084 }
            java.lang.String r0 = "input"
            r4.A04(r8, r0)     // Catch:{ 1Uc -> 0x0084 }
            java.lang.Class<com.whatsapp.infra.graphql.generated.groups.UpdateCommunityOwnerResponseImpl> r1 = com.whatsapp.infra.graphql.generated.groups.UpdateCommunityOwnerResponseImpl.class
            java.lang.String r0 = "UpdateCommunityOwner"
            X.A2g r1 = X.AIj.A01(r4, r6, r1, r0)     // Catch:{ 1Uc -> 0x0084 }
            r3.label = r5     // Catch:{ 1Uc -> 0x0084 }
            X.B33 r0 = X.B33.A00     // Catch:{ 1Uc -> 0x0084 }
            java.lang.Object r0 = r1.A01(r3, r0)     // Catch:{ 1Uc -> 0x0084 }
            if (r0 != r2) goto L_0x0081
            return r2
        L_0x0081:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0084:
            r2 = move-exception
            X.A6Z r0 = r2.error
            int r1 = X.A6Z.A00(r0)
            X.9LM r0 = new X.9LM
            r0.<init>(r1, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.community.mex.TransferCommunityOwnershipGraphQlHandler.A00(com.whatsapp.jid.GroupJid, com.whatsapp.jid.UserJid, X.1dr):java.lang.Object");
    }
}
