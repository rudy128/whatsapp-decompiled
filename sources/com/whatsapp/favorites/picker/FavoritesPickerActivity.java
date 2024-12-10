package com.whatsapp.favorites.picker;

import X.AnonymousClass00R;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1BI;
import X.AnonymousClass1E7;
import X.AnonymousClass1FB;
import X.AnonymousClass1IX;
import X.AnonymousClass1K1;
import X.AnonymousClass1OX;
import X.AnonymousClass1Y5;
import X.AnonymousClass3MW;
import X.AnonymousClass3MZ;
import X.AnonymousClass3gf;
import X.AnonymousClass4CZ;
import X.AnonymousClass4SL;
import X.AnonymousClass5SM;
import X.AnonymousClass5SN;
import X.AnonymousClass5SO;
import X.C102595Hb;
import X.C102605Hc;
import X.C104195Nf;
import X.C17880vN;
import X.C18020vd;
import X.C18040vf;
import X.C18070vi;
import X.C18100vl;
import X.C29401cD;
import X.C29431cG;
import X.C30391dr;
import X.C30451dy;
import X.C72453Mb;
import X.C72473Md;
import X.C72483Me;
import X.C74803cp;
import X.C82964Cv;
import X.C91014f0;
import X.C99274sY;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

public final class FavoritesPickerActivity extends AnonymousClass3gf {
    public AnonymousClass1IX A00;
    public boolean A01;
    public final C18100vl A02;

    public FavoritesPickerActivity() {
        this(0);
        this.A02 = C99274sY.A00(new C102605Hc(this), new C102595Hb(this), new C104195Nf(this), AnonymousClass3MW.A15(FavoritesPickerViewModel.class));
    }

    public void A55(ArrayList arrayList) {
        C18070vi.A0d(arrayList, 0);
        this.A06.A0n(arrayList);
        C18100vl r2 = this.A02;
        FavoritesPickerViewModel favoritesPickerViewModel = (FavoritesPickerViewModel) r2.getValue();
        if (C17880vN.A1X(arrayList)) {
            C29401cD.A0N(arrayList, new AnonymousClass5SN(C29431cG.A12((CopyOnWriteArraySet) favoritesPickerViewModel.A09.A07.getValue())));
        }
        FavoritesPickerViewModel favoritesPickerViewModel2 = (FavoritesPickerViewModel) r2.getValue();
        if (C17880vN.A1X(arrayList)) {
            C29401cD.A0N(arrayList, new AnonymousClass5SO(favoritesPickerViewModel2));
        }
        FavoritesPickerViewModel favoritesPickerViewModel3 = (FavoritesPickerViewModel) r2.getValue();
        if (C17880vN.A1X(arrayList)) {
            C29401cD.A0N(arrayList, new AnonymousClass5SM(favoritesPickerViewModel3));
        }
        AnonymousClass1IX A0y = A0y(this);
        if (A0y != null) {
            arrayList.addAll(A0y);
        }
    }

    public void A59(List list) {
        C18070vi.A0d(list, 0);
        super.A59(list);
    }

    public void onCreate(Bundle bundle) {
        AnonymousClass4CZ r4;
        this.A0Z = false;
        super.onCreate(bundle);
        C18100vl r6 = this.A02;
        FavoritesPickerViewModel favoritesPickerViewModel = (FavoritesPickerViewModel) r6.getValue();
        String stringExtra = getIntent().getStringExtra("suggestion_mode");
        if (stringExtra == null || stringExtra.length() == 0) {
            r4 = AnonymousClass4CZ.CHATS;
        } else {
            r4 = AnonymousClass4CZ.valueOf(stringExtra);
        }
        AnonymousClass1OX A12 = C72453Mb.A12(favoritesPickerViewModel, r4);
        favoritesPickerViewModel.A03 = C30451dy.A02(AnonymousClass00R.A00, favoritesPickerViewModel.A0G, new FavoritesPickerViewModel$loadData$1(favoritesPickerViewModel, r4, (C30391dr) null), A12);
        ((FavoritesPickerViewModel) r6.getValue()).A00 = getIntent().getIntExtra("ENTRY_POINT", 5);
    }

    public static final AnonymousClass1IX A0y(FavoritesPickerActivity favoritesPickerActivity) {
        if (C18020vd.A00(C18040vf.A02, favoritesPickerActivity.A0E, 10137) == 1) {
            favoritesPickerActivity.A00 = C74803cp.A0Q(favoritesPickerActivity.A00, favoritesPickerActivity);
        }
        return favoritesPickerActivity.A00;
    }

    public void A2y() {
        if (!this.A01) {
            this.A01 = true;
            AnonymousClass1K1 A0K = C72473Md.A0K(this);
            AnonymousClass10E r2 = A0K.AAQ;
            C72483Me.A0q(r2, this);
            AnonymousClass10G r1 = r2.A00;
            AnonymousClass1FB.A0K(r2, r1, this, r1.A45);
            AnonymousClass1FB.A0L(r2, r1, this, r1.A5A);
            C74803cp.A0t(A0K, r2, r1, this, A0K.A63);
            C74803cp.A0s(A0K, r2, r1, this);
        }
    }

    public void A4y(AnonymousClass4SL r4, AnonymousClass1E7 r5) {
        C18070vi.A0h(r4, r5);
        super.A4y(r4, r5);
        AnonymousClass1Y5.A01(r4.A01);
        r4.A03.setVisibility(8);
        if (r5.A0F()) {
            AnonymousClass3MZ.A0H(this).A01(new FavoritesPickerActivity$updateGroupSubtitleWithMembers$1(r4, r5, this, (C30391dr) null));
        }
    }

    public void A52(AnonymousClass1E7 r5, boolean z) {
        C82964Cv r1;
        super.A52(r5, z);
        FavoritesPickerViewModel favoritesPickerViewModel = (FavoritesPickerViewModel) this.A02.getValue();
        AnonymousClass1BI r2 = r5.A0J;
        if (r2 != null) {
            if (z) {
                r1 = C82964Cv.SEARCH;
            } else {
                List list = favoritesPickerViewModel.A0D;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (C18070vi.A18(C72453Mb.A0l(it), r2)) {
                                r1 = C82964Cv.SUGGESTION;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                r1 = C82964Cv.ALL_CONTACTS;
            }
            AnonymousClass3MW.A12(favoritesPickerViewModel.A0F).put(r5, r1);
        }
    }

    public void A53(AnonymousClass1E7 r2, boolean z) {
        super.A53(r2, z);
        AnonymousClass3MW.A12(((FavoritesPickerViewModel) this.A02.getValue()).A0F).remove(r2);
    }

    public FavoritesPickerActivity(int i) {
        this.A01 = false;
        C91014f0.A00(this, 8);
    }
}
