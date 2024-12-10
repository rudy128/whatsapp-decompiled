package com.whatsapp.favorites.picker;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass11P;
import X.AnonymousClass1DF;
import X.AnonymousClass1J2;
import X.AnonymousClass1M9;
import X.AnonymousClass1OB;
import X.AnonymousClass5QD;
import X.C102615Hd;
import X.C107185Ys;
import X.C17880vN;
import X.C18070vi;
import X.C18100vl;
import X.C18600wl;
import X.C24921Me;
import X.C41901xH;
import com.whatsapp.favorite.FavoriteManager;
import java.util.HashSet;
import java.util.List;

public final class FavoritesPickerViewModel extends AnonymousClass1J2 {
    public int A00 = 5;
    public long A01;
    public AnonymousClass00H A02;
    public AnonymousClass1OB A03;
    public final C107185Ys A04;
    public final AnonymousClass1M9 A05;
    public final C24921Me A06;
    public final AnonymousClass11P A07;
    public final C41901xH A08;
    public final FavoriteManager A09;
    public final AnonymousClass00H A0A;
    public final AnonymousClass00H A0B;
    public final HashSet A0C = C17880vN.A12();
    public final List A0D = AnonymousClass000.A13();
    public final C18100vl A0E = AnonymousClass1DF.A01(new C102615Hd(this));
    public final C18100vl A0F = AnonymousClass1DF.A01(AnonymousClass5QD.A00);
    public final C18600wl A0G;
    public final C18600wl A0H;

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.whatsapp.favorites.picker.FavoritesPickerViewModel r9, X.AnonymousClass4CZ r10, X.C30391dr r11) {
        /*
            boolean r0 = r11 instanceof X.C100884vE
            if (r0 == 0) goto L_0x0076
            r7 = r11
            X.4vE r7 = (X.C100884vE) r7
            int r2 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0076
            int r2 = r2 - r1
            r7.label = r2
        L_0x0012:
            java.lang.Object r1 = r7.result
            X.1g4 r8 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r7.label
            r6 = 1
            if (r0 == 0) goto L_0x0049
            if (r0 != r6) goto L_0x007c
            long r3 = r7.J$0
            java.lang.Object r6 = r7.L$4
            com.whatsapp.favorites.picker.FavoritesPickerViewModel r6 = (com.whatsapp.favorites.picker.FavoritesPickerViewModel) r6
            java.lang.Object r5 = r7.L$3
            X.4rF r5 = (X.C98494rF) r5
            java.lang.Object r2 = r7.L$1
            X.4rF r2 = (X.C98494rF) r2
            java.lang.Object r9 = r7.L$0
            com.whatsapp.favorites.picker.FavoritesPickerViewModel r9 = (com.whatsapp.favorites.picker.FavoritesPickerViewModel) r9
            X.C30691eM.A01(r1)
        L_0x0032:
            r5.element = r1
            long r0 = android.os.SystemClock.uptimeMillis()
            long r0 = r0 - r3
            r6.A01 = r0
            java.lang.Object r1 = r2.element
            java.util.Collection r1 = (java.util.Collection) r1
            if (r1 == 0) goto L_0x0046
            java.util.List r0 = r9.A0D
            r0.addAll(r1)
        L_0x0046:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0049:
            X.C30691eM.A01(r1)
            X.4rF r5 = X.C98494rF.A00()
            X.11P r1 = r9.A07
            long r3 = android.os.SystemClock.uptimeMillis()
            r0 = 0
            com.whatsapp.favorites.picker.FavoritesPickerViewModel$loadFavoriteSuggestions$2$1 r2 = new com.whatsapp.favorites.picker.FavoritesPickerViewModel$loadFavoriteSuggestions$2$1
            r2.<init>(r9, r10, r0)
            r7.L$0 = r9
            r7.L$1 = r5
            r7.L$2 = r1
            r7.L$3 = r5
            r7.L$4 = r9
            r7.J$0 = r3
            r7.label = r6
            r0 = 5000(0x1388, double:2.4703E-320)
            java.lang.Object r1 = X.AnonymousClass4Z5.A00(r7, r2, r0)
            if (r1 != r8) goto L_0x0073
            return r8
        L_0x0073:
            r2 = r5
            r6 = r9
            goto L_0x0032
        L_0x0076:
            X.4vE r7 = new X.4vE
            r7.<init>(r9, r11)
            goto L_0x0012
        L_0x007c:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.favorites.picker.FavoritesPickerViewModel.A00(com.whatsapp.favorites.picker.FavoritesPickerViewModel, X.4CZ, X.1dr):java.lang.Object");
    }

    public FavoritesPickerViewModel(C107185Ys r3, AnonymousClass1M9 r4, C24921Me r5, AnonymousClass11P r6, C41901xH r7, FavoriteManager favoriteManager, AnonymousClass00H r9, AnonymousClass00H r10, AnonymousClass00H r11, C18600wl r12, C18600wl r13) {
        C18070vi.A0s(r6, r4, r7, r5);
        C18070vi.A0d(favoriteManager, 5);
        C18070vi.A0x(r9, r10, r3, r11, r12);
        C18070vi.A0d(r13, 11);
        this.A07 = r6;
        this.A05 = r4;
        this.A08 = r7;
        this.A06 = r5;
        this.A09 = favoriteManager;
        this.A02 = r9;
        this.A0B = r10;
        this.A04 = r3;
        this.A0A = r11;
        this.A0G = r12;
        this.A0H = r13;
    }
}
