package com.whatsapp.suggestions;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass11P;
import X.AnonymousClass1BI;
import X.AnonymousClass1J2;
import X.AnonymousClass1OB;
import X.AnonymousClass1OX;
import X.AnonymousClass3Ma;
import X.AnonymousClass713;
import X.C108965cb;
import X.C108975cc;
import X.C143077Bx;
import X.C17880vN;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C18560wh;
import X.C22821Di;
import X.C25511Om;
import X.C29431cG;
import X.C30391dr;
import X.C30451dy;
import X.C41561wd;
import X.C57002iN;
import X.C72453Mb;
import X.C72473Md;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public final class NewChatSuggestedContactsPrefetchViewModel extends AnonymousClass1J2 {
    public C143077Bx A00 = new C143077Bx(this, 2);
    public AnonymousClass1OB A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass11P A05;
    public final C18030ve A06;
    public final C57002iN A07;
    public final AnonymousClass00H A08;

    public NewChatSuggestedContactsPrefetchViewModel(AnonymousClass11P r3, C18030ve r4, C57002iN r5, AnonymousClass00H r6, AnonymousClass00H r7, AnonymousClass00H r8, AnonymousClass00H r9) {
        C18070vi.A0d(r3, 1);
        C72473Md.A1M(r4, r6, r7, 2);
        C18070vi.A0l(r8, r9);
        this.A05 = r3;
        this.A06 = r4;
        this.A07 = r5;
        this.A04 = r6;
        this.A08 = r7;
        this.A02 = r8;
        this.A03 = r9;
    }

    private final long A03(long j) {
        return (j + TimeUnit.SECONDS.toMillis((long) C18020vd.A00(C18040vf.A02, ((SuggestionsEngine) this.A08.get()).A04, 8001))) - System.currentTimeMillis();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A04(com.whatsapp.suggestions.NewChatSuggestedContactsPrefetchViewModel r7, X.C30391dr r8) {
        /*
            boolean r0 = r8 instanceof X.C147867Uu
            if (r0 == 0) goto L_0x00ae
            r6 = r8
            X.7Uu r6 = (X.C147867Uu) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00ae
            int r2 = r2 - r1
            r6.label = r2
        L_0x0012:
            java.lang.Object r1 = r6.result
            X.1g4 r5 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r6.label
            r4 = 1
            if (r0 == 0) goto L_0x0078
            if (r0 != r4) goto L_0x00b5
            java.lang.Object r3 = r6.L$1
            X.713 r3 = (X.AnonymousClass713) r3
            java.lang.Object r7 = r6.L$0
            com.whatsapp.suggestions.NewChatSuggestedContactsPrefetchViewModel r7 = (com.whatsapp.suggestions.NewChatSuggestedContactsPrefetchViewModel) r7
            X.C30691eM.A01(r1)
        L_0x0028:
            java.util.List r1 = (java.util.List) r1
            java.lang.String r2 = A09(r1)
            X.0vl r0 = r3.A00
            android.content.SharedPreferences r0 = X.C18070vi.A03(r0)
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = "new_chat_new_user_suggestions"
            X.C17880vN.A1E(r1, r0, r2)
            X.00H r0 = r7.A03
            java.lang.Object r0 = r0.get()
            X.713 r0 = (X.AnonymousClass713) r0
            long r1 = java.lang.System.currentTimeMillis()
            X.0vl r0 = r0.A00
            android.content.SharedPreferences r0 = X.C18070vi.A03(r0)
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r3 = "new_chat_new_user_suggestions_last_fetch_time"
            X.C17880vN.A1D(r0, r3, r1)
        L_0x0058:
            X.0ve r2 = r7.A06
            r1 = 9138(0x23b2, float:1.2805E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0075
            X.00H r0 = r7.A03
            android.content.SharedPreferences r0 = X.AnonymousClass713.A01(r0)
            long r0 = X.C17890vO.A05(r0, r3)
            long r0 = r7.A03(r0)
            r7.A0D(r0)
        L_0x0075:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0078:
            X.C30691eM.A01(r1)
            X.00H r2 = r7.A03
            android.content.SharedPreferences r0 = X.AnonymousClass713.A01(r2)
            java.lang.String r3 = "new_chat_new_user_suggestions_last_fetch_time"
            long r0 = X.C17890vO.A05(r0, r3)
            boolean r0 = r7.A0E(r0)
            if (r0 == 0) goto L_0x0058
            java.lang.Object r3 = r2.get()
            X.713 r3 = (X.AnonymousClass713) r3
            X.00H r0 = r7.A08
            java.lang.Object r1 = r0.get()
            com.whatsapp.suggestions.SuggestionsEngine r1 = (com.whatsapp.suggestions.SuggestionsEngine) r1
            java.util.Set r0 = r7.A0A()
            r6.L$0 = r7
            r6.L$1 = r3
            r6.L$2 = r7
            r6.label = r4
            java.lang.Object r1 = r1.A05(r0, r6)
            if (r1 != r5) goto L_0x0028
            return r5
        L_0x00ae:
            X.7Uu r6 = new X.7Uu
            r6.<init>(r7, r8)
            goto L_0x0012
        L_0x00b5:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.suggestions.NewChatSuggestedContactsPrefetchViewModel.A04(com.whatsapp.suggestions.NewChatSuggestedContactsPrefetchViewModel, X.1dr):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A05(com.whatsapp.suggestions.NewChatSuggestedContactsPrefetchViewModel r7, X.C30391dr r8) {
        /*
            boolean r0 = r8 instanceof X.C147877Uv
            if (r0 == 0) goto L_0x00ae
            r6 = r8
            X.7Uv r6 = (X.C147877Uv) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00ae
            int r2 = r2 - r1
            r6.label = r2
        L_0x0012:
            java.lang.Object r1 = r6.result
            X.1g4 r5 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r6.label
            r4 = 1
            if (r0 == 0) goto L_0x0078
            if (r0 != r4) goto L_0x00b5
            java.lang.Object r3 = r6.L$1
            X.713 r3 = (X.AnonymousClass713) r3
            java.lang.Object r7 = r6.L$0
            com.whatsapp.suggestions.NewChatSuggestedContactsPrefetchViewModel r7 = (com.whatsapp.suggestions.NewChatSuggestedContactsPrefetchViewModel) r7
            X.C30691eM.A01(r1)
        L_0x0028:
            java.util.List r1 = (java.util.List) r1
            java.lang.String r2 = A09(r1)
            X.0vl r0 = r3.A00
            android.content.SharedPreferences r0 = X.C18070vi.A03(r0)
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = "new_chat_recently_seen_tenured_users_only_suggestions"
            X.C17880vN.A1E(r1, r0, r2)
            X.00H r0 = r7.A03
            java.lang.Object r0 = r0.get()
            X.713 r0 = (X.AnonymousClass713) r0
            long r1 = java.lang.System.currentTimeMillis()
            X.0vl r0 = r0.A00
            android.content.SharedPreferences r0 = X.C18070vi.A03(r0)
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r3 = "new_chat_recently_seen_tenured_users_only_suggestions_last_fetch_time"
            X.C17880vN.A1D(r0, r3, r1)
        L_0x0058:
            X.0ve r2 = r7.A06
            r1 = 9138(0x23b2, float:1.2805E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0075
            X.00H r0 = r7.A03
            android.content.SharedPreferences r0 = X.AnonymousClass713.A01(r0)
            long r0 = X.C17890vO.A05(r0, r3)
            long r0 = r7.A03(r0)
            r7.A0D(r0)
        L_0x0075:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0078:
            X.C30691eM.A01(r1)
            X.00H r2 = r7.A03
            android.content.SharedPreferences r0 = X.AnonymousClass713.A01(r2)
            java.lang.String r3 = "new_chat_recently_seen_tenured_users_only_suggestions_last_fetch_time"
            long r0 = X.C17890vO.A05(r0, r3)
            boolean r0 = r7.A0E(r0)
            if (r0 == 0) goto L_0x0058
            java.lang.Object r3 = r2.get()
            X.713 r3 = (X.AnonymousClass713) r3
            X.00H r0 = r7.A08
            java.lang.Object r1 = r0.get()
            com.whatsapp.suggestions.SuggestionsEngine r1 = (com.whatsapp.suggestions.SuggestionsEngine) r1
            java.util.Set r0 = r7.A0A()
            r6.L$0 = r7
            r6.L$1 = r3
            r6.L$2 = r7
            r6.label = r4
            java.lang.Object r1 = r1.A06(r0, r6)
            if (r1 != r5) goto L_0x0028
            return r5
        L_0x00ae:
            X.7Uv r6 = new X.7Uv
            r6.<init>(r7, r8)
            goto L_0x0012
        L_0x00b5:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.suggestions.NewChatSuggestedContactsPrefetchViewModel.A05(com.whatsapp.suggestions.NewChatSuggestedContactsPrefetchViewModel, X.1dr):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A06(com.whatsapp.suggestions.NewChatSuggestedContactsPrefetchViewModel r8, X.C30391dr r9) {
        /*
            boolean r0 = r9 instanceof X.C147887Uw
            if (r0 == 0) goto L_0x00b4
            r6 = r9
            X.7Uw r6 = (X.C147887Uw) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00b4
            int r2 = r2 - r1
            r6.label = r2
        L_0x0012:
            java.lang.Object r1 = r6.result
            X.1g4 r7 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r6.label
            r5 = 1
            if (r0 == 0) goto L_0x0078
            if (r0 != r5) goto L_0x00bb
            java.lang.Object r4 = r6.L$1
            X.713 r4 = (X.AnonymousClass713) r4
            java.lang.Object r8 = r6.L$0
            com.whatsapp.suggestions.NewChatSuggestedContactsPrefetchViewModel r8 = (com.whatsapp.suggestions.NewChatSuggestedContactsPrefetchViewModel) r8
            X.C30691eM.A01(r1)
        L_0x0028:
            java.util.List r1 = (java.util.List) r1
            java.lang.String r2 = A09(r1)
            X.0vl r0 = r4.A00
            android.content.SharedPreferences r0 = X.C18070vi.A03(r0)
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = "new_chat_recently_seen_suggestions"
            X.C17880vN.A1E(r1, r0, r2)
            X.00H r0 = r8.A03
            java.lang.Object r0 = r0.get()
            X.713 r0 = (X.AnonymousClass713) r0
            long r1 = java.lang.System.currentTimeMillis()
            X.0vl r0 = r0.A00
            android.content.SharedPreferences r0 = X.C18070vi.A03(r0)
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r3 = "new_chat_recently_seen_suggestions_last_fetch_time"
            X.C17880vN.A1D(r0, r3, r1)
        L_0x0058:
            X.0ve r2 = r8.A06
            r1 = 9138(0x23b2, float:1.2805E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0075
            X.00H r0 = r8.A03
            android.content.SharedPreferences r0 = X.AnonymousClass713.A01(r0)
            long r0 = X.C17890vO.A05(r0, r3)
            long r0 = r8.A03(r0)
            r8.A0D(r0)
        L_0x0075:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0078:
            X.C30691eM.A01(r1)
            X.00H r2 = r8.A03
            android.content.SharedPreferences r0 = X.AnonymousClass713.A01(r2)
            java.lang.String r3 = "new_chat_recently_seen_suggestions_last_fetch_time"
            long r0 = X.C17890vO.A05(r0, r3)
            boolean r0 = r8.A0E(r0)
            if (r0 == 0) goto L_0x0058
            java.lang.Object r4 = r2.get()
            X.713 r4 = (X.AnonymousClass713) r4
            X.00H r0 = r8.A08
            java.lang.Object r3 = r0.get()
            com.whatsapp.suggestions.SuggestionsEngine r3 = (com.whatsapp.suggestions.SuggestionsEngine) r3
            java.util.Set r2 = r8.A0A()
            r6.L$0 = r8
            r6.L$1 = r4
            r6.L$2 = r8
            r6.label = r5
            r1 = 0
            com.whatsapp.suggestions.SuggestionsEngine$getNewChatRecentlySeenContacts$2 r0 = new com.whatsapp.suggestions.SuggestionsEngine$getNewChatRecentlySeenContacts$2
            r0.<init>(r3, r2, r1)
            java.lang.Object r1 = X.AnonymousClass1OW.A00(r6, r0)
            if (r1 != r7) goto L_0x0028
            return r7
        L_0x00b4:
            X.7Uw r6 = new X.7Uw
            r6.<init>(r8, r9)
            goto L_0x0012
        L_0x00bb:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.suggestions.NewChatSuggestedContactsPrefetchViewModel.A06(com.whatsapp.suggestions.NewChatSuggestedContactsPrefetchViewModel, X.1dr):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a7 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A07(com.whatsapp.suggestions.NewChatSuggestedContactsPrefetchViewModel r10, X.C30391dr r11) {
        /*
            boolean r0 = r11 instanceof X.AnonymousClass7UD
            if (r0 == 0) goto L_0x002b
            r5 = r11
            X.7UD r5 = (X.AnonymousClass7UD) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x002b
            int r2 = r2 - r1
            r5.label = r2
        L_0x0012:
            java.lang.Object r1 = r5.result
            X.1g4 r4 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r5.label
            r7 = 4
            r6 = 3
            r9 = 2
            r8 = 1
            if (r0 == 0) goto L_0x0031
            if (r0 == r8) goto L_0x0095
            if (r0 == r9) goto L_0x00b2
            if (r0 == r6) goto L_0x00b2
            if (r0 == r7) goto L_0x00b2
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x002b:
            X.7UD r5 = new X.7UD
            r5.<init>(r10, r11)
            goto L_0x0012
        L_0x0031:
            X.C30691eM.A01(r1)
            X.00H r3 = r10.A08
            java.lang.Object r0 = r3.get()
            com.whatsapp.suggestions.SuggestionsEngine r0 = (com.whatsapp.suggestions.SuggestionsEngine) r0
            X.0ve r2 = r0.A04
            r1 = 9906(0x26b2, float:1.3881E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0056
            r10.A0B()
            r5.L$0 = r10
            r5.label = r8
            java.lang.Object r0 = A04(r10, r5)
            if (r0 != r4) goto L_0x009c
            return r4
        L_0x0056:
            int r0 = A00(r3)
            if (r0 != r8) goto L_0x0069
            r10.A0B()
            r10.A0C()
            r5.label = r6
            java.lang.Object r0 = A04(r10, r5)
            goto L_0x00a5
        L_0x0069:
            int r3 = A00(r3)
            X.00H r2 = r10.A03
            android.content.SharedPreferences r0 = X.AnonymousClass713.A01(r2)
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = "new_chat_new_user_suggestions"
            X.C17880vN.A1B(r1, r0)
            android.content.SharedPreferences r0 = X.AnonymousClass713.A01(r2)
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = "new_chat_new_user_suggestions_last_fetch_time"
            if (r3 != r6) goto L_0x00a8
            X.C17880vN.A1B(r1, r0)
            r10.A0C()
            r5.label = r7
            java.lang.Object r0 = A06(r10, r5)
            goto L_0x00a5
        L_0x0095:
            java.lang.Object r10 = r5.L$0
            com.whatsapp.suggestions.NewChatSuggestedContactsPrefetchViewModel r10 = (com.whatsapp.suggestions.NewChatSuggestedContactsPrefetchViewModel) r10
            X.C30691eM.A01(r1)
        L_0x009c:
            r0 = 0
            r5.L$0 = r0
            r5.label = r9
            java.lang.Object r0 = A05(r10, r5)
        L_0x00a5:
            if (r0 != r4) goto L_0x00b5
            return r4
        L_0x00a8:
            X.C17880vN.A1B(r1, r0)
            r10.A0B()
            r10.A0C()
            goto L_0x00b5
        L_0x00b2:
            X.C30691eM.A01(r1)
        L_0x00b5:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.suggestions.NewChatSuggestedContactsPrefetchViewModel.A07(com.whatsapp.suggestions.NewChatSuggestedContactsPrefetchViewModel, X.1dr):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0020, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, ((com.whatsapp.suggestions.SuggestionsEngine) r2.get()).A04, 9906) != false) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A08(com.whatsapp.suggestions.NewChatSuggestedContactsPrefetchViewModel r3, X.C30391dr r4) {
        /*
            X.00H r2 = r3.A08
            int r1 = A00(r2)
            r0 = 1
            if (r1 == r0) goto L_0x0022
            int r1 = A00(r2)
            r0 = 3
            if (r1 == r0) goto L_0x0022
            java.lang.Object r0 = r2.get()
            com.whatsapp.suggestions.SuggestionsEngine r0 = (com.whatsapp.suggestions.SuggestionsEngine) r0
            X.0ve r2 = r0.A04
            r1 = 9906(0x26b2, float:1.3881E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0040
        L_0x0022:
            X.00H r1 = r3.A04
            java.lang.Object r0 = r1.get()
            X.1Hc r0 = (X.C23651Hc) r0
            boolean r0 = r0.A07
            if (r0 == 0) goto L_0x0037
            java.lang.Object r1 = A07(r3, r4)
            X.1g4 r0 = X.C31751g4.COROUTINE_SUSPENDED
            if (r1 != r0) goto L_0x0040
            return r1
        L_0x0037:
            X.10T r1 = X.C17880vN.A0V(r1)
            X.7Bx r0 = r3.A00
            r1.registerObserver(r0)
        L_0x0040:
            X.1Wu r1 = X.C27621Wu.A00
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.suggestions.NewChatSuggestedContactsPrefetchViewModel.A08(com.whatsapp.suggestions.NewChatSuggestedContactsPrefetchViewModel, X.1dr):java.lang.Object");
    }

    private final Set A0A() {
        C18030ve r2 = this.A06;
        if (C18020vd.A05(C18040vf.A02, r2, 10122)) {
            return this.A07.A00(C108965cb.A0k(r2, 10427));
        }
        return C25511Om.A00;
    }

    private final void A0B() {
        AnonymousClass00H r2 = this.A03;
        C17880vN.A1B(AnonymousClass713.A01(r2).edit(), "new_chat_recently_seen_suggestions");
        C17880vN.A1B(AnonymousClass713.A01(r2).edit(), "new_chat_recently_seen_suggestions_last_fetch_time");
    }

    private final void A0C() {
        AnonymousClass00H r2 = this.A03;
        C17880vN.A1B(AnonymousClass713.A01(r2).edit(), "new_chat_recently_seen_tenured_users_only_suggestions");
        C17880vN.A1B(AnonymousClass713.A01(r2).edit(), "new_chat_recently_seen_tenured_users_only_suggestions_last_fetch_time");
    }

    private final void A0D(long j) {
        C30391dr A0j = C108975cc.A0j(this.A01);
        AnonymousClass1OX A002 = C41561wd.A00(this);
        NewChatSuggestedContactsPrefetchViewModel$scheduleFetchAgainIfAppIsRunning$1 newChatSuggestedContactsPrefetchViewModel$scheduleFetchAgainIfAppIsRunning$1 = new NewChatSuggestedContactsPrefetchViewModel$scheduleFetchAgainIfAppIsRunning$1(this, A0j, j);
        this.A01 = C30451dy.A02(AnonymousClass00R.A00, (C18560wh) C18070vi.A0E(this.A02), newChatSuggestedContactsPrefetchViewModel$scheduleFetchAgainIfAppIsRunning$1, A002);
    }

    public void A0S() {
        AnonymousClass3Ma.A1R(this.A01);
        C17880vN.A0V(this.A04).unregisterObserver(this.A00);
    }

    public static int A00(AnonymousClass00H r2) {
        return C18020vd.A00(C18040vf.A02, ((SuggestionsEngine) r2.get()).A04, 7746);
    }

    public static final String A09(List list) {
        String rawString;
        ArrayList A13 = AnonymousClass000.A13();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass1BI A0l = C72453Mb.A0l(it);
            if (!(A0l == null || (rawString = A0l.getRawString()) == null)) {
                A13.add(rawString);
            }
        }
        return C29431cG.A0h(", ", A13, (C22821Di) null);
    }

    private final boolean A0E(long j) {
        return C108975cc.A1A((j > (System.currentTimeMillis() - TimeUnit.SECONDS.toMillis((long) C18020vd.A00(C18040vf.A02, ((SuggestionsEngine) this.A08.get()).A04, 8001))) ? 1 : (j == (System.currentTimeMillis() - TimeUnit.SECONDS.toMillis((long) C18020vd.A00(C18040vf.A02, ((SuggestionsEngine) this.A08.get()).A04, 8001))) ? 0 : -1)));
    }
}
