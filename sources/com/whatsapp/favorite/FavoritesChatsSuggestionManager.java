package com.whatsapp.favorite;

import X.AnonymousClass00H;
import X.AnonymousClass1JQ;
import X.AnonymousClass1b2;
import X.AnonymousClass5SK;
import X.AnonymousClass5SL;
import X.C106435Vv;
import X.C108925cX;
import X.C147157Sa;
import X.C18070vi;
import X.C18600wl;
import X.C29431cG;
import X.C99444sp;
import java.util.Collection;
import java.util.List;

public final class FavoritesChatsSuggestionManager {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;
    public final C18600wl A04;

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0073, code lost:
        if (r6 != r5) goto L_0x0024;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(java.util.Set r9, X.C30391dr r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof X.C100674ut
            if (r0 == 0) goto L_0x0076
            r7 = r10
            X.4ut r7 = (X.C100674ut) r7
            int r2 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0076
            int r2 = r2 - r1
            r7.label = r2
        L_0x0012:
            java.lang.Object r6 = r7.result
            X.1g4 r5 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r7.label
            r4 = 0
            r2 = 2
            r3 = 1
            if (r0 == 0) goto L_0x0046
            if (r0 == r3) goto L_0x0060
            if (r0 != r2) goto L_0x007c
            X.C30691eM.A01(r6)
        L_0x0024:
            java.util.List r6 = (java.util.List) r6
            r0 = 0
            java.lang.Object r2 = r6.get(r0)
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r1 = r6.get(r3)
            java.util.List r1 = (java.util.List) r1
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x0045
            r1.removeAll(r2)
            r2.addAll(r1)
            r0 = 8
            java.util.List r1 = X.C29431cG.A0v(r2, r0)
        L_0x0045:
            return r1
        L_0x0046:
            X.C30691eM.A01(r6)
            java.util.ArrayList r1 = X.AnonymousClass000.A13()
            com.whatsapp.favorite.FavoritesChatsSuggestionManager$getSuggestionsResult$2 r0 = new com.whatsapp.favorite.FavoritesChatsSuggestionManager$getSuggestionsResult$2
            r0.<init>(r8, r1, r9, r4)
            r7.L$0 = r8
            r7.L$1 = r1
            r7.label = r3
            java.lang.Object r0 = X.AnonymousClass1OW.A00(r7, r0)
            if (r0 == r5) goto L_0x0075
            r0 = r8
            goto L_0x0069
        L_0x0060:
            java.lang.Object r1 = r7.L$1
            java.util.Collection r1 = (java.util.Collection) r1
            java.lang.Object r0 = r7.L$0
            X.C30691eM.A01(r6)
        L_0x0069:
            r7.L$0 = r0
            r7.L$1 = r4
            r7.label = r2
            java.lang.Object r6 = X.C197009w0.A00(r1, r7)
            if (r6 != r5) goto L_0x0024
        L_0x0075:
            return r5
        L_0x0076:
            X.4ut r7 = new X.4ut
            r7.<init>(r8, r10)
            goto L_0x0012
        L_0x007c:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.favorite.FavoritesChatsSuggestionManager.A01(java.util.Set, X.1dr):java.lang.Object");
    }

    public FavoritesChatsSuggestionManager(AnonymousClass00H r1, AnonymousClass00H r2, AnonymousClass00H r3, AnonymousClass00H r4, C18600wl r5) {
        C18070vi.A0w(r1, r2, r3, r4, r5);
        this.A03 = r1;
        this.A00 = r2;
        this.A01 = r3;
        this.A02 = r4;
        this.A04 = r5;
    }

    public static final List A00(FavoritesChatsSuggestionManager favoritesChatsSuggestionManager, Collection collection, List list) {
        AnonymousClass1JQ r0;
        C147157Sa A09 = AnonymousClass1b2.A09(C106435Vv.A00, AnonymousClass1b2.A0A(new AnonymousClass5SL(favoritesChatsSuggestionManager), AnonymousClass1b2.A09(new AnonymousClass5SK(collection), C29431cG.A0V(list))));
        if (A09 instanceof C108925cX) {
            r0 = ((C108925cX) A09).COz();
        } else {
            r0 = new C99444sp(A09, 8);
        }
        return AnonymousClass1b2.A07(r0);
    }
}
