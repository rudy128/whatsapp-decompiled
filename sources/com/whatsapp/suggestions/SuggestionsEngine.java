package com.whatsapp.suggestions;

import X.AnonymousClass00H;
import X.AnonymousClass1BI;
import X.AnonymousClass1D6;
import X.AnonymousClass1E7;
import X.AnonymousClass1M9;
import X.AnonymousClass1b2;
import X.AnonymousClass4D0;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C22971Dz;
import X.C25511Om;
import X.C26051Qq;
import X.C29351c6;
import X.C29391cC;
import X.C29431cG;
import X.C36471nw;
import X.C36481nx;
import X.C37501pe;
import X.C37551pj;
import X.C59172ls;
import X.C59182lt;
import X.C59672mh;
import X.C71033Dn;
import X.C98974s1;
import X.C99254sW;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.whatsapp.infra.graphql.generated.suggestedcontacts.calls.XWA2GrowthSuggestedContactsInput;
import com.whatsapp.infra.graphql.generated.suggestedcontacts.enums.GraphQLXWA2SuggestedContactsSignalType;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class SuggestionsEngine {
    public Set A00;
    public int A01;
    public Set A02;
    public final AnonymousClass1M9 A03;
    public final C18030ve A04;
    public final C36481nx A05;
    public final AnonymousClass00H A06;
    public final AnonymousClass00H A07;
    public final AnonymousClass00H A08;
    public final AnonymousClass00H A09;
    public final AnonymousClass00H A0A;
    public final AnonymousClass00H A0B;

    public SuggestionsEngine(AnonymousClass1M9 r2, C18030ve r3, C36481nx r4, AnonymousClass00H r5, AnonymousClass00H r6, AnonymousClass00H r7, AnonymousClass00H r8, AnonymousClass00H r9, AnonymousClass00H r10) {
        C18070vi.A0d(r3, 1);
        C18070vi.A0d(r2, 2);
        C18070vi.A0d(r5, 3);
        C18070vi.A0d(r6, 4);
        C18070vi.A0d(r7, 5);
        C18070vi.A0d(r8, 6);
        C18070vi.A0d(r9, 8);
        C18070vi.A0d(r10, 9);
        this.A04 = r3;
        this.A03 = r2;
        this.A0A = r5;
        this.A06 = r6;
        this.A09 = r7;
        this.A0B = r8;
        this.A05 = r4;
        this.A08 = r9;
        this.A07 = r10;
        C25511Om r0 = C25511Om.A00;
        this.A00 = r0;
        this.A02 = r0;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.facebook.graphql.calls.GraphQlCallInput, com.whatsapp.infra.graphql.generated.suggestedcontacts.calls.XWA2GrowthSuggestedContactsInput] */
    public static final XWA2GrowthSuggestedContactsInput A00(SuggestionsEngine suggestionsEngine, String str, Set set, boolean z) {
        ? graphQlCallInput = new GraphQlCallInput();
        C18070vi.A0d(str, 0);
        graphQlCallInput.A05("context", str);
        GraphQlCallInput graphQlCallInput2 = new GraphQlCallInput();
        if (set != null && !set.isEmpty()) {
            graphQlCallInput2.A06("exclude_jids", C29431cG.A0t(set));
            graphQlCallInput.A02().A06(graphQlCallInput2.A02(), "metadata");
        }
        if (z) {
            List<Jid> A012 = suggestionsEngine.A01();
            ArrayList arrayList = new ArrayList(C29351c6.A0C(A012, 10));
            for (Jid rawString : A012) {
                arrayList.add(rawString.getRawString());
            }
            graphQlCallInput2.A06("priority_jids", C29431cG.A0t(C29431cG.A0v(arrayList, 5)));
            graphQlCallInput.A02().A06(graphQlCallInput2.A02(), "metadata");
        }
        return graphQlCallInput;
    }

    private final List A01() {
        return AnonymousClass1b2.A06(AnonymousClass1b2.A09(new C99254sW((Object) this, 16), AnonymousClass1b2.A09(new C99254sW((Object) this, 15), AnonymousClass1b2.A0B(C29431cG.A0V(((C26051Qq) this.A0B.get()).A01(true, false))))));
    }

    public static final List A02(SuggestionsEngine suggestionsEngine) {
        int A002 = C18020vd.A00(C18040vf.A02, suggestionsEngine.A04, 8241);
        List<AnonymousClass1BI> A012 = suggestionsEngine.A01();
        ArrayList arrayList = new ArrayList();
        for (AnonymousClass1BI A0E : A012) {
            AnonymousClass1E7 A0E2 = suggestionsEngine.A03.A0E(A0E);
            if (A0E2 != null) {
                arrayList.add(A0E2);
            }
        }
        return C29431cG.A0t(C29431cG.A0v(arrayList, A002));
    }

    private final boolean A03(AnonymousClass1E7 r4, Set set) {
        String str;
        Jid A062;
        Set set2 = this.A02;
        AnonymousClass1BI r0 = r4.A0J;
        if (r0 != null) {
            str = r0.getRawString();
        } else {
            str = null;
        }
        if (C29431cG.A18(set2, str) || (A062 = r4.A06(UserJid.class)) == null || C22971Dz.A0T(r4.A0J) || C22971Dz.A0S(A062) || this.A00.contains(A062) || set.contains(r4)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A04(X.C36471nw r21, java.lang.String r22, java.util.Set r23, X.C30391dr r24, int r25) {
        /*
            r20 = this;
            r4 = r24
            r15 = r23
            r11 = r21
            r3 = r25
            boolean r0 = r4 instanceof X.C71383Fb
            r10 = r20
            if (r0 == 0) goto L_0x00f6
            r5 = r4
            X.3Fb r5 = (X.C71383Fb) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00f6
            int r2 = r2 - r1
            r5.label = r2
        L_0x001c:
            java.lang.Object r13 = r5.result
            X.1g4 r4 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r5.label
            r2 = 1
            if (r0 == 0) goto L_0x0060
            if (r0 != r2) goto L_0x00fd
            int r3 = r5.I$0
            java.lang.Object r6 = r5.L$4
            java.lang.Object r14 = r5.L$3
            java.util.ArrayList r14 = (java.util.ArrayList) r14
            java.lang.Object r11 = r5.L$2
            X.1nw r11 = (X.C36471nw) r11
            java.lang.Object r15 = r5.L$1
            java.util.Set r15 = (java.util.Set) r15
            java.lang.Object r10 = r5.L$0
            com.whatsapp.suggestions.SuggestionsEngine r10 = (com.whatsapp.suggestions.SuggestionsEngine) r10
            X.C30691eM.A01(r13)
        L_0x003e:
            java.util.List r13 = (java.util.List) r13
            X.4D0 r1 = X.AnonymousClass4D0.FAVORITES
            X.1D6 r0 = new X.1D6
            r0.<init>(r1, r6)
            java.util.List r12 = java.util.Collections.singletonList(r0)
            X.C18070vi.A0X(r12)
            X.1Om r16 = X.C25511Om.A00
            r17 = r16
            r18 = r3
            r19 = r2
            java.util.ArrayList r0 = r10.A07(r11, r12, r13, r14, r15, r16, r17, r18, r19)
            X.1D6 r2 = new X.1D6
            r2.<init>(r0, r14)
            return r2
        L_0x0060:
            X.C30691eM.A01(r13)
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            X.1M9 r8 = r10.A03
            r8.A0m(r14)
            boolean r0 = r14.isEmpty()
            if (r0 == 0) goto L_0x0083
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            X.1D6 r2 = new X.1D6
            r2.<init>(r1, r0)
            return r2
        L_0x0083:
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            java.util.Iterator r9 = r14.iterator()
        L_0x008c:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x00a9
            java.lang.Object r6 = r9.next()
            X.1E7 r6 = (X.AnonymousClass1E7) r6
            X.2lf r0 = r6.A0H
            if (r0 != 0) goto L_0x00a6
            r0 = 0
        L_0x009e:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r7.put(r0, r6)
            goto L_0x008c
        L_0x00a6:
            long r0 = r0.A00
            goto L_0x009e
        L_0x00a9:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r8.A0o(r0)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r1 = r0.iterator()
        L_0x00ba:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00d2
            java.lang.Object r0 = r1.next()
            java.lang.Object r0 = r7.get(r0)
            X.1E7 r0 = (X.AnonymousClass1E7) r0
            if (r0 == 0) goto L_0x00ba
            r6.add(r0)
            r0.A0l = r2
            goto L_0x00ba
        L_0x00d2:
            X.00H r0 = r10.A08
            java.lang.Object r1 = r0.get()
            com.whatsapp.suggestions.networking.SuggestedContactsFetcher r1 = (com.whatsapp.suggestions.networking.SuggestedContactsFetcher) r1
            r0 = 0
            r7 = r22
            com.whatsapp.infra.graphql.generated.suggestedcontacts.calls.XWA2GrowthSuggestedContactsInput r0 = A00(r10, r7, r15, r0)
            r5.L$0 = r10
            r5.L$1 = r15
            r5.L$2 = r11
            r5.L$3 = r14
            r5.L$4 = r6
            r5.I$0 = r3
            r5.label = r2
            java.lang.Object r13 = r1.A00(r0, r5)
            if (r13 != r4) goto L_0x003e
            return r4
        L_0x00f6:
            X.3Fb r5 = new X.3Fb
            r5.<init>(r10, r4)
            goto L_0x001c
        L_0x00fd:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.suggestions.SuggestionsEngine.A04(X.1nw, java.lang.String, java.util.Set, X.1dr, int):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A05(java.util.Set r15, X.C30391dr r16) {
        /*
            r14 = this;
            r3 = r16
            r9 = r15
            boolean r0 = r3 instanceof X.AnonymousClass3FY
            if (r0 == 0) goto L_0x00a7
            r6 = r3
            X.3FY r6 = (X.AnonymousClass3FY) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00a7
            int r2 = r2 - r1
            r6.label = r2
        L_0x0015:
            java.lang.Object r7 = r6.result
            X.1g4 r5 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r6.label
            r4 = 1
            if (r0 == 0) goto L_0x004d
            if (r0 != r4) goto L_0x00ae
            java.lang.Object r3 = r6.L$3
            java.lang.Object r8 = r6.L$2
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            java.lang.Object r9 = r6.L$1
            java.util.Set r9 = (java.util.Set) r9
            java.lang.Object r4 = r6.L$0
            com.whatsapp.suggestions.SuggestionsEngine r4 = (com.whatsapp.suggestions.SuggestionsEngine) r4
            X.C30691eM.A01(r7)
        L_0x0031:
            java.util.List r7 = (java.util.List) r7
            X.4D0 r1 = X.AnonymousClass4D0.RECENTLY_ACCEPTED_INVITES
            X.1D6 r0 = new X.1D6
            r0.<init>(r1, r3)
            java.util.List r6 = java.util.Collections.singletonList(r0)
            X.C18070vi.A0X(r6)
            X.1nx r5 = r4.A05
            r12 = 3
            X.1Om r10 = X.C25511Om.A00
            r13 = 0
            r11 = r10
            java.util.ArrayList r0 = r4.A07(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r0
        L_0x004d:
            X.C30691eM.A01(r7)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            X.1M9 r2 = r14.A03
            r2.A0m(r8)
            X.00H r0 = r14.A07
            java.lang.Object r0 = r0.get()
            X.2kd r0 = (X.C58402kd) r0
            java.util.ArrayList r0 = r0.A00()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r1 = r0.iterator()
        L_0x006f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0085
            java.lang.Object r0 = r1.next()
            X.1BI r0 = (X.AnonymousClass1BI) r0
            X.1E7 r0 = r2.A0E(r0)
            if (r0 == 0) goto L_0x006f
            r3.add(r0)
            goto L_0x006f
        L_0x0085:
            X.00H r0 = r14.A08
            java.lang.Object r2 = r0.get()
            com.whatsapp.suggestions.networking.SuggestedContactsFetcher r2 = (com.whatsapp.suggestions.networking.SuggestedContactsFetcher) r2
            java.lang.String r1 = "NEW_CHAT_CONTACT_SCREEN_NEW_TO_WHATSAPP"
            r0 = 0
            com.whatsapp.infra.graphql.generated.suggestedcontacts.calls.XWA2GrowthSuggestedContactsInput r0 = A00(r14, r1, r15, r0)
            r6.L$0 = r14
            r6.L$1 = r15
            r6.L$2 = r8
            r6.L$3 = r3
            r6.label = r4
            java.lang.Object r7 = r2.A00(r0, r6)
            if (r7 != r5) goto L_0x00a5
            return r5
        L_0x00a5:
            r4 = r14
            goto L_0x0031
        L_0x00a7:
            X.3FY r6 = new X.3FY
            r6.<init>(r14, r3)
            goto L_0x0015
        L_0x00ae:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.suggestions.SuggestionsEngine.A05(java.util.Set, X.1dr):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A06(java.util.Set r16, X.C30391dr r17) {
        /*
            r15 = this;
            r3 = r17
            r10 = r16
            boolean r0 = r3 instanceof X.AnonymousClass3FQ
            if (r0 == 0) goto L_0x0095
            r7 = r3
            X.3FQ r7 = (X.AnonymousClass3FQ) r7
            int r2 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0095
            int r2 = r2 - r1
            r7.label = r2
        L_0x0016:
            java.lang.Object r8 = r7.result
            X.1g4 r6 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r7.label
            r5 = 1
            if (r0 == 0) goto L_0x006b
            if (r0 != r5) goto L_0x009c
            java.lang.Object r10 = r7.L$1
            java.util.Set r10 = (java.util.Set) r10
            java.lang.Object r5 = r7.L$0
            com.whatsapp.suggestions.SuggestionsEngine r5 = (com.whatsapp.suggestions.SuggestionsEngine) r5
            X.C30691eM.A01(r8)
        L_0x002c:
            java.util.List r8 = (java.util.List) r8
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            X.1M9 r0 = r5.A03
            r0.A0m(r9)
            java.util.List r2 = A02(r5)
            X.4D0 r1 = X.AnonymousClass4D0.FREQUENTLY_CONTACTED
            X.1D6 r0 = new X.1D6
            r0.<init>(r1, r2)
            java.util.List r7 = java.util.Collections.singletonList(r0)
            X.C18070vi.A0X(r7)
            X.1nx r6 = r5.A05
            X.0ve r2 = r5.A04
            r1 = 10035(0x2733, float:1.4062E-41)
            X.0vf r0 = X.C18040vf.A02
            int r0 = X.C18020vd.A00(r0, r2, r1)
            r14 = 0
            int r13 = java.lang.Math.max(r14, r0)
            com.whatsapp.infra.graphql.generated.suggestedcontacts.enums.GraphQLXWA2SuggestedContactsSignalType r0 = com.whatsapp.infra.graphql.generated.suggestedcontacts.enums.GraphQLXWA2SuggestedContactsSignalType.PRESENCE
            java.util.Set r12 = java.util.Collections.singleton(r0)
            X.C18070vi.A0X(r12)
            X.1Om r11 = X.C25511Om.A00
            java.util.ArrayList r0 = r5.A07(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r0
        L_0x006b:
            X.C30691eM.A01(r8)
            X.00H r0 = r15.A08
            java.lang.Object r4 = r0.get()
            com.whatsapp.suggestions.networking.SuggestedContactsFetcher r4 = (com.whatsapp.suggestions.networking.SuggestedContactsFetcher) r4
            java.lang.String r3 = "NEW_CHAT_CONTACT_SCREEN_RECENTLY_ONLINE"
            X.0ve r2 = r15.A04
            r1 = 10914(0x2aa2, float:1.5294E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            com.whatsapp.infra.graphql.generated.suggestedcontacts.calls.XWA2GrowthSuggestedContactsInput r0 = A00(r15, r3, r10, r0)
            r7.L$0 = r15
            r7.L$1 = r10
            r7.label = r5
            java.lang.Object r8 = r4.A00(r0, r7)
            if (r8 != r6) goto L_0x0093
            return r6
        L_0x0093:
            r5 = r15
            goto L_0x002c
        L_0x0095:
            X.3FQ r7 = new X.3FQ
            r7.<init>(r15, r3)
            goto L_0x0016
        L_0x009c:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.suggestions.SuggestionsEngine.A06(java.util.Set, X.1dr):java.lang.Object");
    }

    public final ArrayList A07(C36471nw r18, List list, List list2, List list3, Set set, Set set2, Set set3, int i, boolean z) {
        Set A0I;
        Jid A062;
        List<C59182lt> list4 = list2;
        C18070vi.A0d(list4, 1);
        C36471nw r14 = r18;
        C18070vi.A0d(r14, 2);
        List<AnonymousClass1E7> list5 = list3;
        C18070vi.A0d(list5, 3);
        Set set4 = set;
        C18070vi.A0d(set4, 5);
        Set set5 = set2;
        C18070vi.A0d(set5, 6);
        int i2 = i;
        if (i <= 0) {
            return new ArrayList();
        }
        AnonymousClass00H r1 = this.A09;
        if (((C37551pj) r1.get()).A0M.get()) {
            A0I = ((C37551pj) r1.get()).A0A();
        } else {
            A0I = ((C37501pe) this.A0A.get()).A0I();
        }
        this.A00 = A0I;
        this.A02 = set4;
        this.A01 = i2;
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (AnonymousClass1E7 r12 : list5) {
            if (!(r12 == null || (A062 = r12.A06(UserJid.class)) == null)) {
                linkedHashMap.put(A062.getRawString(), r12);
            }
        }
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass1D6 r4 = (AnonymousClass1D6) it.next();
            AnonymousClass4D0 r3 = (AnonymousClass4D0) r4.first;
            List list6 = (List) r4.second;
            float BOl = r14.BOl(r3);
            if (BOl > 0.0f) {
                for (Object next : list6) {
                    C59672mh r0 = (C59672mh) hashMap.get(next);
                    if (r0 != null) {
                        r0.A03.add(r4.first);
                    }
                    C59672mh r13 = (C59672mh) hashMap.get(next);
                    if (r13 != null) {
                        r13.A00 += BOl;
                        r13.A03.add(r3);
                    } else {
                        hashMap.put(next, new C59672mh((GraphQLXWA2SuggestedContactsSignalType) null, r3, BOl));
                    }
                    BOl -= 0.001f;
                }
            }
        }
        for (C59182lt r15 : list4) {
            GraphQLXWA2SuggestedContactsSignalType graphQLXWA2SuggestedContactsSignalType = r15.A00;
            float BZ2 = r14.BZ2(graphQLXWA2SuggestedContactsSignalType);
            if (BZ2 > 0.0f) {
                List list7 = r15.A01;
                int size = list7.size();
                for (int i3 = 0; i3 < size; i3++) {
                    AnonymousClass1E7 r32 = (AnonymousClass1E7) linkedHashMap.get(((C59172ls) list7.get(i3)).A01);
                    if (r32 != null) {
                        C59672mh r16 = (C59672mh) hashMap.get(r32);
                        if (r16 != null) {
                            r16.A00 += BZ2;
                            r16.A04.add(graphQLXWA2SuggestedContactsSignalType);
                        } else {
                            hashMap.put(r32, new C59672mh(graphQLXWA2SuggestedContactsSignalType, (AnonymousClass4D0) null, BZ2));
                        }
                        if (i3 < list7.size() - 1 && ((C59172ls) list7.get(i3)).A00 != ((C59172ls) list7.get(i3 + 1)).A00) {
                            BZ2 -= 0.001f;
                        }
                        if (graphQLXWA2SuggestedContactsSignalType == GraphQLXWA2SuggestedContactsSignalType.PRESENCE) {
                            r32.A0p = true;
                        }
                        if (graphQLXWA2SuggestedContactsSignalType == GraphQLXWA2SuggestedContactsSignalType.PROFILE_PICTURE) {
                            r32.A0h = true;
                        }
                    }
                }
            }
        }
        ArrayList A0m = C29431cG.A0m(hashMap.entrySet());
        C29391cC.A0H(A0m, new C98974s1((Object) new C71033Dn(1), 15));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it2 = A0m.iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            if (arrayList.size() >= this.A01) {
                break;
            } else if (A03((AnonymousClass1E7) entry.getKey(), linkedHashSet)) {
                C59672mh r33 = (C59672mh) entry.getValue();
                if (set5.isEmpty() || (!C29431cG.A13(set5, r33.A03).isEmpty())) {
                    Set set6 = set3;
                    if (set6.isEmpty() || (!C29431cG.A13(set6, r33.A04).isEmpty())) {
                        arrayList.add(entry.getKey());
                        linkedHashSet.add(entry.getKey());
                    }
                }
            }
        }
        if (z) {
            for (AnonymousClass1E7 r34 : list5) {
                if (r34 != null) {
                    if (arrayList.size() >= this.A01) {
                        break;
                    } else if (A03(r34, linkedHashSet)) {
                        arrayList.add(r34);
                    }
                }
            }
        }
        return arrayList;
    }
}
