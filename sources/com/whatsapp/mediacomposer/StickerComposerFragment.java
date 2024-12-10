package com.whatsapp.mediacomposer;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass1DF;
import X.AnonymousClass1FL;
import X.AnonymousClass1OR;
import X.AnonymousClass1OX;
import X.AnonymousClass20F;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass7AT;
import X.AnonymousClass7JN;
import X.AnonymousClass7JS;
import X.AnonymousClass808;
import X.AnonymousClass809;
import X.AnonymousClass80A;
import X.AnonymousClass8AQ;
import X.C108955ca;
import X.C108965cb;
import X.C1195868u;
import X.C136986uj;
import X.C151877n0;
import X.C151887n1;
import X.C151897n2;
import X.C151907n3;
import X.C151917n4;
import X.C151927n5;
import X.C156227u1;
import X.C156237u2;
import X.C156247u3;
import X.C160888Ai;
import X.C17900vP;
import X.C18070vi;
import X.C18100vl;
import X.C30391dr;
import X.C30451dy;
import X.C41561wd;
import X.C99274sY;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ProgressBar;
import com.whatsapp.media.utwonet.UTwoNetViewModel;
import com.whatsapp.media.utwonet.UTwoNetViewModel$fetch$1;
import com.whatsapp.media.utwonet.UTwoNetViewModel$startToObserveFetch$1;
import com.whatsapp.mediacomposer.doodle.ImagePreviewContentLayout;
import com.whatsapp.mediacomposer.viewmodel.StickerComposerViewModel;
import com.whatsapp.util.Log;

public final class StickerComposerFragment extends Hilt_StickerComposerFragment {
    public int A00 = -1;
    public Bitmap A01;
    public AnonymousClass00H A02;
    public boolean A03;
    public final C18100vl A04;
    public final C18100vl A05;
    public final C18100vl A06;

    public static final void A00(StickerComposerFragment stickerComposerFragment) {
        C136986uj A0U;
        ProgressBar progressBar = (ProgressBar) stickerComposerFragment.A04.getValue();
        if (progressBar != null) {
            progressBar.setVisibility(8);
            progressBar.setIndeterminate(true);
        }
        ((ImagePreviewContentLayout) AnonymousClass3MX.A14(stickerComposerFragment.A0G)).setVisibility(0);
        stickerComposerFragment.A01(true);
        C160888Ai A29 = stickerComposerFragment.A29();
        if (A29 != null && (A0U = C108955ca.A0U((MediaComposerActivity) A29)) != null) {
            A0U.A0A(true);
        }
    }

    public void A20(Bundle bundle) {
        C18070vi.A0d(bundle, 0);
        super.A20(bundle);
        bundle.putBoolean("key_already_processing_model", this.A03);
    }

    public void A21(Bundle bundle, View view) {
        int i;
        boolean z;
        Integer num;
        int intValue;
        C136986uj A0U;
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        Bundle bundle2 = this.A06;
        if (bundle2 != null) {
            i = bundle2.getInt("position");
        } else {
            i = -1;
        }
        this.A00 = i;
        if (bundle != null) {
            z = bundle.getBoolean("key_already_processing_model", false);
        } else {
            z = false;
        }
        this.A03 = z;
        DisplayMetrics A07 = C108965cb.A07();
        int i2 = A07.widthPixels;
        int i3 = A07.heightPixels;
        int max = Math.max(i2, i3);
        int min = Math.min(i2, i3);
        C18100vl r2 = this.A0G;
        ImagePreviewContentLayout imagePreviewContentLayout = (ImagePreviewContentLayout) AnonymousClass3MX.A14(r2);
        int i4 = 0;
        if (this.A00 == 0) {
            i4 = 4;
        }
        imagePreviewContentLayout.setVisibility(i4);
        imagePreviewContentLayout.setMinScale(((float) max) / ((float) min));
        imagePreviewContentLayout.setTranslateTouchPoints(2);
        imagePreviewContentLayout.setOnFlingEnabled(false);
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("StickerComposerFragment/onViewCreated/position = ");
        C17900vP.A0o(A10, this.A00);
        if (bundle == null) {
            Log.i("StickerComposerFragment/setupObservers");
            C160888Ai A29 = A29();
            if (A29 != null) {
                num = Integer.valueOf(A29.BUd());
            } else {
                num = null;
            }
            if (this.A00 != 0 || this.A03 || this.A01 == null || num == null || (intValue = num.intValue()) == 42 || intValue == 44 || intValue == 50) {
                ((ImagePreviewContentLayout) AnonymousClass3MX.A14(r2)).setVisibility(0);
            } else {
                this.A03 = true;
                Log.i("StickerComposerFragment/setupObservers/updating states");
                A01(false);
                C160888Ai A292 = A29();
                if (!(A292 == null || (A0U = C108955ca.A0U((MediaComposerActivity) A292)) == null)) {
                    A0U.A0A(false);
                }
                C18100vl r6 = this.A05;
                AnonymousClass7AT.A01(A1G(), ((StickerComposerViewModel) r6.getValue()).A02, new AnonymousClass808(this), 41);
                C18100vl r3 = this.A06;
                AnonymousClass7AT.A01(A1G(), ((StickerComposerViewModel) AnonymousClass7AT.A00(A1G(), ((UTwoNetViewModel) r3.getValue()).A02, r6, new AnonymousClass809(this), 41)).A04, new AnonymousClass80A(this), 41);
                View A0A = AnonymousClass3MW.A0A(this.A04);
                if (A0A != null) {
                    A0A.setVisibility(0);
                }
                UTwoNetViewModel uTwoNetViewModel = (UTwoNetViewModel) r3.getValue();
                uTwoNetViewModel.A02.A0F(C1195868u.A00);
                AnonymousClass1OX A002 = C41561wd.A00(uTwoNetViewModel);
                UTwoNetViewModel$startToObserveFetch$1 uTwoNetViewModel$startToObserveFetch$1 = new UTwoNetViewModel$startToObserveFetch$1(uTwoNetViewModel, (C30391dr) null);
                AnonymousClass1OR r0 = AnonymousClass1OR.A00;
                Integer num2 = AnonymousClass00R.A00;
                C30451dy.A02(num2, r0, uTwoNetViewModel$startToObserveFetch$1, A002);
                C30451dy.A02(num2, uTwoNetViewModel.A08, new UTwoNetViewModel$fetch$1(uTwoNetViewModel, (C30391dr) null), C41561wd.A00(uTwoNetViewModel));
                Log.i("StickerComposerFragment/setupObservers/fetching model");
            }
        }
        A2I();
    }

    public Bitmap A26() {
        Bitmap bitmap = this.A01;
        if (bitmap == null) {
            return super.A26();
        }
        return bitmap;
    }

    public StickerComposerFragment() {
        C18100vl A002 = AnonymousClass1DF.A00(AnonymousClass00R.A0C, new C151917n4(new C151907n3(this)));
        AnonymousClass20F A15 = AnonymousClass3MW.A15(UTwoNetViewModel.class);
        this.A06 = C99274sY.A00(new C151927n5(A002), new C156247u3(this, A002), new C156237u2(A002), A15);
        AnonymousClass20F A152 = AnonymousClass3MW.A15(StickerComposerViewModel.class);
        this.A05 = C99274sY.A00(new C151887n1(this), new C151897n2(this), new C156227u1(this), A152);
        this.A04 = AnonymousClass1DF.A01(new C151877n0(this));
    }

    private final void A01(boolean z) {
        AnonymousClass8AQ r0;
        View findViewById;
        View findViewById2;
        AnonymousClass1FL A1B = A1B();
        if (!(A1B == null || (findViewById = A1B.findViewById(2131428318)) == null || (findViewById2 = findViewById.findViewById(2131435142)) == null)) {
            findViewById2.setEnabled(z);
        }
        C160888Ai A29 = A29();
        if (A29 != null && (r0 = ((MediaComposerActivity) A29).A0c) != null) {
            r0.CIo(z);
        }
    }

    public void A2P(AnonymousClass7JS r3, AnonymousClass7JN r4, C136986uj r5) {
        View findViewById;
        C18070vi.A0n(r5, r4, r3);
        super.A2P(r3, r4, r5);
        r5.A0I.setCropToolVisibility(8);
        r4.A05();
        AnonymousClass7JN.A02(r4);
        AnonymousClass1FL A1B = A1B();
        if (A1B != null && (findViewById = A1B.findViewById(2131432380)) != null) {
            findViewById.setBackgroundResource(2131231713);
        }
    }
}
