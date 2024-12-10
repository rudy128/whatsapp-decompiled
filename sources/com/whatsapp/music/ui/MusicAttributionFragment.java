package com.whatsapp.music.ui;

import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass1DF;
import X.AnonymousClass20F;
import X.AnonymousClass3C5;
import X.AnonymousClass3MW;
import X.AnonymousClass3MZ;
import X.AnonymousClass77U;
import X.AnonymousClass7AT;
import X.AnonymousClass7RU;
import X.AnonymousClass7SB;
import X.C1194668g;
import X.C139816zU;
import X.C152397nq;
import X.C152407nr;
import X.C152417ns;
import X.C156317uA;
import X.C156327uB;
import X.C17880vN;
import X.C18070vi;
import X.C18100vl;
import X.C200710s;
import X.C24141Ja;
import X.C28931bI;
import X.C48282Lw;
import X.C63042sP;
import X.C72453Mb;
import X.C90054dS;
import X.C99274sY;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.CircularProgressBar;
import com.whatsapp.WaImageView;
import com.whatsapp.music.viewmodels.MusicAttributionViewModel;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;

public final class MusicAttributionFragment extends Hilt_MusicAttributionFragment {
    public CircularProgressBar A00;
    public WaImageView A01;
    public C28931bI A02;
    public AnonymousClass00H A03;
    public AnonymousClass00H A04;
    public WeakReference A05;
    public final int A06 = 2131626120;
    public final C18100vl A07;

    public void A21(Bundle bundle, View view) {
        String str;
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        AnonymousClass77U r6 = (AnonymousClass77U) C24141Ja.A00(A15(), AnonymousClass77U.class, "embedded_music");
        View findViewById = view.findViewById(2131427871);
        if (findViewById != null) {
            C90054dS.A00(findViewById, this, 26);
        }
        View findViewById2 = view.findViewById(2131427873);
        if (r6 == null || (str = r6.A00) == null || str.length() == 0) {
            C18070vi.A0b(findViewById2);
            findViewById2.setVisibility(8);
        } else {
            AnonymousClass3MZ.A1O(findViewById2, this, r6, 31);
        }
        this.A01 = AnonymousClass3MW.A0S(view, 2131427868);
        this.A00 = (CircularProgressBar) view.findViewById(2131427870);
        this.A02 = C72453Mb.A0s(view, 2131427869);
        if (r6 != null) {
            TextView A0E = C17880vN.A0E(view, 2131427874);
            if (A0E != null) {
                A0E.setText(r6.A05);
            }
            TextView A0E2 = C17880vN.A0E(view, 2131427867);
            if (A0E2 != null) {
                A0E2.setText(r6.A02);
            }
            MusicAttributionViewModel musicAttributionViewModel = (MusicAttributionViewModel) this.A07.getValue();
            Log.i("MusicAttributionViewModel/downloadAlbumArtwork");
            String str2 = r6.A01;
            if (str2 == null || str2.length() == 0 || r6.A09 == null || r6.A07 == null || r6.A08 == null) {
                musicAttributionViewModel.A01.A0E(new C139816zU((Bitmap) null, AnonymousClass00R.A0N));
            } else {
                C48282Lw r4 = (C48282Lw) musicAttributionViewModel.A02.get();
                AnonymousClass7SB A002 = AnonymousClass7SB.A00(musicAttributionViewModel, 41);
                synchronized (r4) {
                    C63042sP.A00((C63042sP) r4.A03.get(), 501822150);
                    ((C200710s) r4.A09.getValue()).execute(new AnonymousClass3C5(r6, r4, A002, 13));
                }
            }
            if (r6.A06) {
                C72453Mb.A0s(view, 2131427872).A04(0);
            }
        }
        AnonymousClass7AT.A01(this, ((MusicAttributionViewModel) this.A07.getValue()).A00, AnonymousClass7SB.A00(this, 37), 45);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        DialogInterface.OnDismissListener onDismissListener;
        C18070vi.A0d(dialogInterface, 0);
        super.onDismiss(dialogInterface);
        WeakReference weakReference = this.A05;
        if (weakReference != null && (onDismissListener = (DialogInterface.OnDismissListener) weakReference.get()) != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
    }

    public MusicAttributionFragment() {
        C18100vl A002 = AnonymousClass1DF.A00(AnonymousClass00R.A0C, new C152407nr(new C152397nq(this)));
        AnonymousClass20F A15 = AnonymousClass3MW.A15(MusicAttributionViewModel.class);
        this.A07 = C99274sY.A00(new C152417ns(A002), new C156327uB(this, A002), new C156317uA(A002), A15);
    }

    public void A1r() {
        super.A1r();
        C48282Lw r2 = (C48282Lw) ((MusicAttributionViewModel) this.A07.getValue()).A02.get();
        synchronized (r2) {
            C1194668g r1 = r2.A00;
            if (r1 != null) {
                AnonymousClass7RU.A01(r1, false);
            }
            r2.A00 = null;
        }
    }

    public void A1s() {
        super.A1s();
        this.A01 = null;
        this.A00 = null;
        this.A02 = null;
    }
}
