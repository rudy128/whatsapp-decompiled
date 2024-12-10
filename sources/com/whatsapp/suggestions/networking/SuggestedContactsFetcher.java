package com.whatsapp.suggestions.networking;

import X.AnonymousClass00H;
import X.C18030ve;
import X.C18070vi;

public final class SuggestedContactsFetcher {
    public final C18030ve A00;
    public final AnonymousClass00H A01;

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0098 A[Catch:{ Exception -> 0x0107 }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x009b A[Catch:{ Exception -> 0x0107 }] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(com.whatsapp.infra.graphql.generated.suggestedcontacts.calls.XWA2GrowthSuggestedContactsInput r10, X.C30391dr r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof X.C100534uf
            if (r0 == 0) goto L_0x001e
            r5 = r11
            X.4uf r5 = (X.C100534uf) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x001e
            int r2 = r2 - r1
            r5.label = r2
        L_0x0012:
            java.lang.Object r2 = r5.result
            X.1g4 r6 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r5.label
            r7 = 1
            if (r0 == 0) goto L_0x0029
            if (r0 != r7) goto L_0x0024
            goto L_0x006f
        L_0x001e:
            X.4uf r5 = new X.4uf
            r5.<init>(r9, r11)
            goto L_0x0012
        L_0x0024:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x0029:
            X.C30691eM.A01(r2)
            X.00H r0 = r9.A01     // Catch:{ Exception -> 0x0107 }
            java.lang.Object r4 = r0.get()     // Catch:{ Exception -> 0x0107 }
            X.1PY r4 = (X.AnonymousClass1PY) r4     // Catch:{ Exception -> 0x0107 }
            X.A7K r3 = new X.A7K     // Catch:{ Exception -> 0x0107 }
            r3.<init>()     // Catch:{ Exception -> 0x0107 }
            r0 = 0
            X.C18070vi.A0d(r10, r0)     // Catch:{ Exception -> 0x0107 }
            java.lang.String r0 = "input"
            r3.A04(r10, r0)     // Catch:{ Exception -> 0x0107 }
            java.lang.Class<com.whatsapp.infra.graphql.generated.suggestedcontacts.GetSuggestedContactsResponseImpl> r2 = com.whatsapp.infra.graphql.generated.suggestedcontacts.GetSuggestedContactsResponseImpl.class
            java.lang.String r1 = "GetSuggestedContacts"
            X.AIj r0 = new X.AIj     // Catch:{ Exception -> 0x0107 }
            r0.<init>(r3, r2, r1)     // Catch:{ Exception -> 0x0107 }
            X.A2g r4 = r4.A01(r0)     // Catch:{ Exception -> 0x0107 }
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ Exception -> 0x0107 }
            X.0ve r2 = r9.A00     // Catch:{ Exception -> 0x0107 }
            r1 = 5652(0x1614, float:7.92E-42)
            X.0vf r0 = X.C18040vf.A02     // Catch:{ Exception -> 0x0107 }
            int r0 = X.C18020vd.A00(r0, r2, r1)     // Catch:{ Exception -> 0x0107 }
            long r0 = (long) r0     // Catch:{ Exception -> 0x0107 }
            long r0 = r3.toMillis(r0)     // Catch:{ Exception -> 0x0107 }
            r4.A00 = r0     // Catch:{ Exception -> 0x0107 }
            r5.L$0 = r9     // Catch:{ Exception -> 0x0107 }
            r5.label = r7     // Catch:{ Exception -> 0x0107 }
            X.B33 r0 = X.B33.A00     // Catch:{ Exception -> 0x0107 }
            java.lang.Object r2 = r4.A01(r5, r0)     // Catch:{ Exception -> 0x0107 }
            if (r2 != r6) goto L_0x0072
            return r6
        L_0x006f:
            X.C30691eM.A01(r2)     // Catch:{ Exception -> 0x0107 }
        L_0x0072:
            com.whatsapp.infra.graphql.generated.suggestedcontacts.GetSuggestedContactsResponseImpl r2 = (com.whatsapp.infra.graphql.generated.suggestedcontacts.GetSuggestedContactsResponseImpl) r2     // Catch:{ Exception -> 0x0107 }
            java.lang.String r1 = "xwa2_growth_suggested_contacts"
            java.lang.Class<com.whatsapp.infra.graphql.generated.suggestedcontacts.GetSuggestedContactsResponseImpl$Xwa2GrowthSuggestedContacts> r0 = com.whatsapp.infra.graphql.generated.suggestedcontacts.GetSuggestedContactsResponseImpl.Xwa2GrowthSuggestedContacts.class
            X.A8k r2 = r2.A09(r0, r1)     // Catch:{ Exception -> 0x0107 }
            X.C199610h.A04(r2)     // Catch:{ Exception -> 0x0107 }
            X.C18070vi.A0X(r2)     // Catch:{ Exception -> 0x0107 }
            com.whatsapp.infra.graphql.generated.suggestedcontacts.GetSuggestedContactsResponseImpl$Xwa2GrowthSuggestedContacts r2 = (com.whatsapp.infra.graphql.generated.suggestedcontacts.GetSuggestedContactsResponseImpl.Xwa2GrowthSuggestedContacts) r2     // Catch:{ Exception -> 0x0107 }
            java.lang.String r1 = "signals"
            java.lang.Class<com.whatsapp.infra.graphql.generated.suggestedcontacts.GetSuggestedContactsResponseImpl$Xwa2GrowthSuggestedContacts$Signals> r0 = com.whatsapp.infra.graphql.generated.suggestedcontacts.GetSuggestedContactsResponseImpl.Xwa2GrowthSuggestedContacts.Signals.class
            X.1IX r1 = r2.A0A(r0, r1)     // Catch:{ Exception -> 0x0107 }
            X.C199610h.A04(r1)     // Catch:{ Exception -> 0x0107 }
            X.C18070vi.A0X(r1)     // Catch:{ Exception -> 0x0107 }
            boolean r0 = r1.isEmpty()     // Catch:{ Exception -> 0x0107 }
            if (r0 == 0) goto L_0x009b
            X.0wS r6 = X.C18460wS.A00     // Catch:{ Exception -> 0x0107 }
            return r6
        L_0x009b:
            java.util.ArrayList r6 = X.AnonymousClass000.A13()     // Catch:{ Exception -> 0x0107 }
            java.util.Iterator r8 = r1.iterator()     // Catch:{ Exception -> 0x0107 }
        L_0x00a3:
            boolean r0 = r8.hasNext()     // Catch:{ Exception -> 0x0107 }
            if (r0 == 0) goto L_0x0109
            java.lang.Object r2 = r8.next()     // Catch:{ Exception -> 0x0107 }
            com.whatsapp.infra.graphql.generated.suggestedcontacts.GetSuggestedContactsResponseImpl$Xwa2GrowthSuggestedContacts$Signals r2 = (com.whatsapp.infra.graphql.generated.suggestedcontacts.GetSuggestedContactsResponseImpl.Xwa2GrowthSuggestedContacts.Signals) r2     // Catch:{ Exception -> 0x0107 }
            if (r2 == 0) goto L_0x00a3
            com.whatsapp.infra.graphql.generated.suggestedcontacts.enums.GraphQLXWA2SuggestedContactsSignalType r7 = com.whatsapp.infra.graphql.generated.suggestedcontacts.enums.GraphQLXWA2SuggestedContactsSignalType.UNSET_OR_UNRECOGNIZED_ENUM_VALUE     // Catch:{ Exception -> 0x0107 }
            java.lang.String r0 = "name"
            java.lang.Enum r5 = r2.A0D(r7, r0)     // Catch:{ Exception -> 0x0107 }
            X.C18070vi.A0X(r5)     // Catch:{ Exception -> 0x0107 }
            com.whatsapp.infra.graphql.generated.suggestedcontacts.enums.GraphQLXWA2SuggestedContactsSignalType r5 = (com.whatsapp.infra.graphql.generated.suggestedcontacts.enums.GraphQLXWA2SuggestedContactsSignalType) r5     // Catch:{ Exception -> 0x0107 }
            java.util.ArrayList r4 = X.AnonymousClass000.A13()     // Catch:{ Exception -> 0x0107 }
            java.lang.String r1 = "contacts"
            java.lang.Class<com.whatsapp.infra.graphql.generated.suggestedcontacts.GetSuggestedContactsResponseImpl$Xwa2GrowthSuggestedContacts$Signals$Contacts> r0 = com.whatsapp.infra.graphql.generated.suggestedcontacts.GetSuggestedContactsResponseImpl.Xwa2GrowthSuggestedContacts.Signals.Contacts.class
            X.1IX r0 = r2.A0A(r0, r1)     // Catch:{ Exception -> 0x0107 }
            X.C199610h.A04(r0)     // Catch:{ Exception -> 0x0107 }
            X.C18070vi.A0X(r0)     // Catch:{ Exception -> 0x0107 }
            java.util.Iterator r3 = r0.iterator()     // Catch:{ Exception -> 0x0107 }
        L_0x00d4:
            boolean r0 = r3.hasNext()     // Catch:{ Exception -> 0x0107 }
            if (r0 == 0) goto L_0x00fc
            java.lang.Object r1 = r3.next()     // Catch:{ Exception -> 0x0107 }
            com.whatsapp.infra.graphql.generated.suggestedcontacts.GetSuggestedContactsResponseImpl$Xwa2GrowthSuggestedContacts$Signals$Contacts r1 = (com.whatsapp.infra.graphql.generated.suggestedcontacts.GetSuggestedContactsResponseImpl.Xwa2GrowthSuggestedContacts.Signals.Contacts) r1     // Catch:{ Exception -> 0x0107 }
            if (r1 == 0) goto L_0x00d4
            java.lang.String r0 = "jid"
            org.json.JSONObject r1 = r1.A00     // Catch:{ Exception -> 0x0107 }
            java.lang.String r2 = r1.optString(r0)     // Catch:{ Exception -> 0x0107 }
            X.C18070vi.A0X(r2)     // Catch:{ Exception -> 0x0107 }
            java.lang.String r0 = "rank"
            int r1 = r1.optInt(r0)     // Catch:{ Exception -> 0x0107 }
            X.2ls r0 = new X.2ls     // Catch:{ Exception -> 0x0107 }
            r0.<init>(r2, r1)     // Catch:{ Exception -> 0x0107 }
            r4.add(r0)     // Catch:{ Exception -> 0x0107 }
            goto L_0x00d4
        L_0x00fc:
            if (r5 == r7) goto L_0x00a3
            X.2lt r0 = new X.2lt     // Catch:{ Exception -> 0x0107 }
            r0.<init>(r5, r4)     // Catch:{ Exception -> 0x0107 }
            r6.add(r0)     // Catch:{ Exception -> 0x0107 }
            goto L_0x00a3
        L_0x0107:
            X.0wS r6 = X.C18460wS.A00
        L_0x0109:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.suggestions.networking.SuggestedContactsFetcher.A00(com.whatsapp.infra.graphql.generated.suggestedcontacts.calls.XWA2GrowthSuggestedContactsInput, X.1dr):java.lang.Object");
    }

    public SuggestedContactsFetcher(C18030ve r1, AnonymousClass00H r2) {
        C18070vi.A0j(r2, r1);
        this.A01 = r2;
        this.A00 = r1;
    }
}
