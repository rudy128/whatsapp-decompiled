package com.whatsapp.calling.favorite;

import X.AnonymousClass00R;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1BI;
import X.AnonymousClass1DF;
import X.AnonymousClass1E7;
import X.AnonymousClass1FB;
import X.AnonymousClass1IX;
import X.AnonymousClass1K1;
import X.AnonymousClass1Y5;
import X.AnonymousClass3MW;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass3gf;
import X.AnonymousClass4CC;
import X.AnonymousClass4Fu;
import X.AnonymousClass4SL;
import X.AnonymousClass5DW;
import X.AnonymousClass5DY;
import X.AnonymousClass5DZ;
import X.AnonymousClass5MO;
import X.AnonymousClass5MP;
import X.C18020vd;
import X.C18040vf;
import X.C18070vi;
import X.C18100vl;
import X.C18600wl;
import X.C29431cG;
import X.C30391dr;
import X.C42141xh;
import X.C72453Mb;
import X.C72473Md;
import X.C72483Me;
import X.C74803cp;
import X.C82874Cm;
import X.C90994ey;
import X.C99274sY;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.wds.components.search.WDSSearchBar;
import com.whatsapp.wds.components.search.WDSSearchView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class FavoritePicker extends AnonymousClass3gf {
    public AnonymousClass1IX A00;
    public C18600wl A01;
    public boolean A02;
    public boolean A03;
    public final C18100vl A04;

    public FavoritePicker() {
        this(0);
        this.A04 = C99274sY.A00(new AnonymousClass5DZ(this), new AnonymousClass5DY(this), new AnonymousClass5MP(this), AnonymousClass3MW.A15(FavoritePickerViewModel.class));
    }

    public void A4y(AnonymousClass4SL r8, AnonymousClass1E7 r9) {
        boolean z;
        TextEmojiLabel textEmojiLabel;
        int i;
        boolean A17 = C18070vi.A17(r8, r9);
        super.A4y(r8, r9);
        Collection collection = AnonymousClass3MZ.A0Y(this).A03;
        if (collection != null) {
            z = C29431cG.A18(collection, AnonymousClass3MW.A0g(r9));
        } else {
            z = false;
        }
        C18100vl A002 = AnonymousClass1DF.A00(AnonymousClass00R.A0C, new AnonymousClass5MO(this, r9));
        View view = r8.A01;
        AnonymousClass1Y5.A01(view);
        if (z) {
            textEmojiLabel = r8.A03;
            i = 2131888743;
        } else if (C72453Mb.A1a(A002)) {
            textEmojiLabel = r8.A03;
            i = 2131892982;
        } else if (r9.A0F()) {
            AnonymousClass3MZ.A0H(this).A01(new FavoritePicker$updateGroupSubtitleWithMembers$1(this, r8, r9, (C30391dr) null));
            return;
        } else {
            TextEmojiLabel textEmojiLabel2 = r8.A03;
            if (TextUtils.isEmpty(textEmojiLabel2.getText())) {
                textEmojiLabel2.setVisibility(8);
                return;
            }
            return;
        }
        textEmojiLabel.setText(i);
        r8.A02.setEnabled(false);
        textEmojiLabel.setTypeface((Typeface) null, 2);
        textEmojiLabel.setVisibility(0);
        C42141xh r2 = r8.A04;
        r2.A01.setTextColor(AnonymousClass3Ma.A00(this, 2130970337, 2131101306));
        view.setOnClickListener((View.OnClickListener) null);
        view.setClickable(false);
        view.setFocusable(A17);
    }

    public void A55(ArrayList arrayList) {
        C18070vi.A0d(arrayList, 0);
        this.A06.A0n(arrayList);
        if (C18020vd.A00(C18040vf.A02, this.A0E, 10137) == 1) {
            this.A00 = C74803cp.A0Q(this.A00, this);
        }
        AnonymousClass1IX r0 = this.A00;
        if (r0 != null) {
            arrayList.addAll(r0);
        }
    }

    public void A59(List list) {
        WDSSearchView wDSSearchView;
        C18070vi.A0d(list, 0);
        super.A59(list);
        if (this.A03) {
            this.A03 = false;
            WDSSearchBar wDSSearchBar = this.A0H;
            if (wDSSearchBar != null && (wDSSearchView = wDSSearchBar.A08) != null) {
                AnonymousClass4Fu.A00(wDSSearchView, new AnonymousClass5DW(this));
            }
        }
    }

    public void A2y() {
        if (!this.A02) {
            this.A02 = true;
            AnonymousClass1K1 A0K = C72473Md.A0K(this);
            AnonymousClass10E r2 = A0K.AAQ;
            C72483Me.A0q(r2, this);
            AnonymousClass10G r1 = r2.A00;
            AnonymousClass1FB.A0K(r2, r1, this, r1.A45);
            AnonymousClass1FB.A0L(r2, r1, this, r1.A5A);
            C74803cp.A0t(A0K, r2, r1, this, A0K.A63);
            C74803cp.A0s(A0K, r2, r1, this);
            this.A01 = AnonymousClass3MZ.A1B(r2);
        }
    }

    public void A52(AnonymousClass1E7 r5, boolean z) {
        C82874Cm r1;
        super.A52(r5, z);
        FavoritePickerViewModel A0Y = AnonymousClass3MZ.A0Y(this);
        AnonymousClass1BI r2 = r5.A0J;
        if (r2 != null) {
            if (z) {
                r1 = C82874Cm.SEARCH;
            } else {
                List list = A0Y.A04;
                if (list != null && (!(list instanceof Collection) || !list.isEmpty())) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (C18070vi.A18(C72453Mb.A0l(it), r2)) {
                                r1 = C82874Cm.SUGGESTION;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                r1 = C82874Cm.ALL_CONTACTS;
            }
            AnonymousClass3MW.A12(A0Y.A0F).put(r2, r1);
        }
    }

    public void A53(AnonymousClass1E7 r3, boolean z) {
        super.A53(r3, z);
        FavoritePickerViewModel A0Y = AnonymousClass3MZ.A0Y(this);
        AnonymousClass1BI r1 = r3.A0J;
        if (r1 != null) {
            AnonymousClass3MW.A12(A0Y.A0F).remove(r1);
        }
    }

    public void onCreate(Bundle bundle) {
        WDSSearchView wDSSearchView;
        super.onCreate(bundle);
        if (bundle == null) {
            this.A03 = true;
        }
        WDSSearchBar wDSSearchBar = this.A0H;
        if (!(wDSSearchBar == null || (wDSSearchView = wDSSearchBar.A08) == null)) {
            wDSSearchView.setTrailingButtonIcon(AnonymousClass4CC.A00);
        }
        FavoritePickerViewModel A0Y = AnonymousClass3MZ.A0Y(this);
        List list = this.A0i;
        C18070vi.A0W(list);
        A0Y.A0T(list);
    }

    public FavoritePicker(int i) {
        this.A02 = false;
        C90994ey.A00(this, 30);
    }
}
