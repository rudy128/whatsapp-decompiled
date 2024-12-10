package com.whatsapp.music.ui;

import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass1DF;
import X.AnonymousClass20F;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass6EY;
import X.AnonymousClass6a7;
import X.AnonymousClass73N;
import X.AnonymousClass7AQ;
import X.AnonymousClass7AT;
import X.AnonymousClass7PB;
import X.AnonymousClass7S3;
import X.AnonymousClass7S8;
import X.AnonymousClass7SB;
import X.C108945cZ;
import X.C111125iM;
import X.C111155iT;
import X.C112735lx;
import X.C116765ya;
import X.C124876a8;
import X.C124886a9;
import X.C124896aA;
import X.C124906aB;
import X.C147967gg;
import X.C152427nt;
import X.C152437nu;
import X.C152447nv;
import X.C152457nw;
import X.C152467nx;
import X.C156337uC;
import X.C156347uD;
import X.C18070vi;
import X.C18100vl;
import X.C36241nZ;
import X.C38391rD;
import X.C99164sN;
import X.C99274sY;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.wds.components.search.WDSSearchView;

public final class MusicBrowseFragment extends Hilt_MusicBrowseFragment {
    public AnonymousClass6a7 A00;
    public C124876a8 A01;
    public C116765ya A02;
    public AnonymousClass00H A03;
    public AnonymousClass00H A04;
    public AnonymousClass00H A05;
    public boolean A06;
    public boolean A07;
    public boolean A08 = true;
    public RecyclerView A09;
    public final int A0A = 2131626123;
    public final C18100vl A0B = AnonymousClass7S3.A00(this, 44);
    public final C18100vl A0C;
    public final C18100vl A0D;

    public void A20(Bundle bundle) {
        C18070vi.A0d(bundle, 0);
        super.A20(bundle);
        bundle.putBoolean("is_shown_state", this.A08);
    }

    public void A21(Bundle bundle, View view) {
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        WDSSearchView wDSSearchView = (WDSSearchView) view.findViewById(2131432867);
        wDSSearchView.setBackImageDrawableRes(2131232271);
        wDSSearchView.setOnQueryTextChangeListener(new AnonymousClass7PB(this, 2));
        C124876a8 r1 = this.A01;
        if (r1 != null) {
            AnonymousClass7SB A002 = AnonymousClass7SB.A00(this, 40);
            AnonymousClass7S8 r11 = new AnonymousClass7S8(wDSSearchView, this, 7);
            AnonymousClass7S3 r8 = new AnonymousClass7S3((Object) this, 43);
            C147967gg r9 = new C147967gg(this, 5);
            C36241nZ r12 = r1.A00.A01;
            this.A02 = new C116765ya((C124886a9) r12.A1M.get(), (C124896aA) r12.A1K.get(), (C124906aB) r12.A1L.get(), r8, r9, A002, r11);
            RecyclerView A0Q = AnonymousClass3MX.A0Q(view, 2131432859);
            if (A0Q != null) {
                A0Q.setAdapter(this.A02);
                A0Q.setLayoutManager(new LinearLayoutManager(A14(), 1, false));
                A0Q.A0t(new C112735lx(this, 8));
            } else {
                A0Q = null;
            }
            this.A09 = A0Q;
            C18100vl r4 = this.A0D;
            AnonymousClass7AT.A01(A1G(), ((C111155iT) r4.getValue()).A03, AnonymousClass7SB.A00(this, 38), 46);
            C18100vl r3 = this.A0C;
            AnonymousClass7AQ.A01(A1G(), C108945cZ.A0n(r3).A02, this, 15);
            ((C111155iT) r4.getValue()).A0T((String) null, (String) null);
            AnonymousClass3MY.A1L(C108945cZ.A0n(r3).A05, true);
            return;
        }
        C18070vi.A11("recyclerAdapterFactory");
        throw null;
    }

    public void onCancel(DialogInterface dialogInterface) {
        C18070vi.A0d(dialogInterface, 0);
        AnonymousClass3MY.A1L(C108945cZ.A0n(this.A0C).A05, false);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        C18070vi.A0d(dialogInterface, 0);
        super.onDismiss(dialogInterface);
        AnonymousClass3MY.A1L(C108945cZ.A0n(this.A0C).A05, false);
    }

    public MusicBrowseFragment() {
        C99164sN r4 = new C99164sN(this, 11);
        C18100vl A002 = AnonymousClass1DF.A00(AnonymousClass00R.A0C, new C152457nw(new C152447nv(this)));
        this.A0D = C99274sY.A00(new C152467nx(A002), r4, new C156347uD(A002), AnonymousClass3MW.A15(C111155iT.class));
        AnonymousClass20F A15 = AnonymousClass3MW.A15(C111125iM.class);
        this.A0C = C99274sY.A00(new C152427nt(this), new C152437nu(this), new C156337uC(this), A15);
    }

    public void A1Q(Bundle bundle) {
        super.A1Q(bundle);
        boolean z = true;
        if (bundle != null) {
            z = bundle.getBoolean("is_shown_state", true);
        }
        this.A08 = z;
    }

    public void A1j() {
        super.A1j();
        AnonymousClass00H r0 = this.A05;
        if (r0 != null) {
            AnonymousClass73N.A02((AnonymousClass73N) r0.get(), 23);
        } else {
            C18070vi.A11("musicPlayer");
            throw null;
        }
    }

    public void A1s() {
        super.A1s();
        AnonymousClass00H r0 = this.A03;
        if (r0 != null) {
            ((AnonymousClass6EY) r0.get()).A0B();
            this.A02 = null;
            RecyclerView recyclerView = this.A09;
            if (recyclerView != null) {
                recyclerView.setAdapter((C38391rD) null);
            }
            this.A09 = null;
            return;
        }
        C18070vi.A11("artworkDownloader");
        throw null;
    }

    public void A1t() {
        super.A1t();
        AnonymousClass00H r0 = this.A05;
        if (r0 != null) {
            AnonymousClass73N.A02((AnonymousClass73N) r0.get(), 26);
        } else {
            C18070vi.A11("musicPlayer");
            throw null;
        }
    }

    public void A1v() {
        Dialog dialog;
        super.A1v();
        if (!this.A08 && (dialog = this.A03) != null) {
            dialog.hide();
        }
    }
}
