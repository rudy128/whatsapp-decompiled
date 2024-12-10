package com.whatsapp.calling.favorite;

import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass11P;
import X.AnonymousClass1DF;
import X.AnonymousClass1J2;
import X.AnonymousClass1M9;
import X.AnonymousClass1MZ;
import X.AnonymousClass1OB;
import X.AnonymousClass1OX;
import X.AnonymousClass1V9;
import X.AnonymousClass5MQ;
import X.C104825Pq;
import X.C107185Ys;
import X.C18070vi;
import X.C18100vl;
import X.C18460wS;
import X.C18600wl;
import X.C30391dr;
import X.C30451dy;
import X.C30511e4;
import X.C41561wd;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CancellationException;

public final class FavoritePickerViewModel extends AnonymousClass1J2 {
    public int A00;
    public int A01;
    public long A02;
    public Collection A03;
    public List A04;
    public AnonymousClass1OB A05;
    public AnonymousClass1OB A06;
    public List A07;
    public final AnonymousClass1V9 A08;
    public final AnonymousClass1M9 A09;
    public final AnonymousClass11P A0A;
    public final AnonymousClass1MZ A0B;
    public final AnonymousClass00H A0C;
    public final AnonymousClass00H A0D;
    public final C18100vl A0E;
    public final C18100vl A0F = AnonymousClass1DF.A01(C104825Pq.A00);
    public final C18600wl A0G;
    public final C18600wl A0H;

    public static final void A00(FavoritePickerViewModel favoritePickerViewModel, Collection collection, List list) {
        if (!C18070vi.A18(list, favoritePickerViewModel.A07) || !C18070vi.A18(collection, favoritePickerViewModel.A03)) {
            favoritePickerViewModel.A03 = collection;
            AnonymousClass1OX A002 = C41561wd.A00(favoritePickerViewModel);
            C30511e4 A022 = C30451dy.A02(AnonymousClass00R.A00, favoritePickerViewModel.A0G, new FavoritePickerViewModel$filterOutAddedFavorites$1(favoritePickerViewModel, collection, list, (C30391dr) null), A002);
            AnonymousClass1OB r0 = favoritePickerViewModel.A06;
            if (r0 != null) {
                r0.BEM((CancellationException) null);
            }
            favoritePickerViewModel.A06 = A022;
        }
    }

    public final void A0T(List list) {
        if (!C18070vi.A18(list, this.A07)) {
            this.A07 = list;
            AnonymousClass1OX A002 = C41561wd.A00(this);
            C30511e4 A022 = C30451dy.A02(AnonymousClass00R.A00, this.A0G, new FavoritePickerViewModel$loadFavoriteSuggestions$1(this, list, (C30391dr) null), A002);
            AnonymousClass1OB r0 = this.A05;
            if (r0 != null) {
                r0.BEM((CancellationException) null);
            }
            this.A05 = A022;
        }
    }

    public FavoritePickerViewModel(C107185Ys r2, AnonymousClass1V9 r3, AnonymousClass1M9 r4, AnonymousClass11P r5, AnonymousClass1MZ r6, AnonymousClass00H r7, AnonymousClass00H r8, C18600wl r9, C18600wl r10) {
        C18070vi.A0w(r3, r4, r7, r8, r5);
        C18070vi.A0q(r6, r2, r9);
        C18070vi.A0d(r10, 9);
        this.A08 = r3;
        this.A09 = r4;
        this.A0D = r7;
        this.A0C = r8;
        this.A0A = r5;
        this.A0B = r6;
        this.A0G = r9;
        this.A0H = r10;
        this.A0E = AnonymousClass1DF.A01(new AnonymousClass5MQ(r2, this));
        C18460wS r0 = C18460wS.A00;
        A0T(r0);
        A00(this, r0, r0);
    }
}
