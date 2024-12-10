package com.whatsapp.mediacomposer;

import X.AnonymousClass000;
import X.AnonymousClass1DF;
import X.AnonymousClass1FL;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass4aO;
import X.AnonymousClass70X;
import X.AnonymousClass795;
import X.AnonymousClass7JN;
import X.AnonymousClass7JS;
import X.AnonymousClass7JT;
import X.AnonymousClass8AG;
import X.C136246tV;
import X.C136986uj;
import X.C151857my;
import X.C151867mz;
import X.C1607889x;
import X.C17900vP;
import X.C18070vi;
import X.C18100vl;
import X.C72453Mb;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView;
import com.whatsapp.pushtorecordmedia.MediaProgressRing;
import com.whatsapp.pushtorecordmedia.MediaTimeDisplay;
import com.whatsapp.util.Log;

public final class PtvComposerFragment extends Hilt_PtvComposerFragment {
    public final C18100vl A00 = AnonymousClass1DF.A01(new C151857my(this));
    public final C18100vl A01 = AnonymousClass1DF.A01(new C151867mz(this));

    public void A21(Bundle bundle, View view) {
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PtvComposerFragment/onViewCreated - capturedWithOldCameraController: ");
        C17900vP.A0r(A10, this.A0l);
    }

    public void A2Z(AnonymousClass70X r2) {
        super.A2Z(r2);
        r2.A0M(0);
        r2.A0B();
    }

    public static final void A00(FrameLayout frameLayout, PtvComposerFragment ptvComposerFragment) {
        View findViewById;
        float measuredWidth;
        int measuredHeight;
        View A17 = ptvComposerFragment.A17();
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PtvComposerFragment/applyCircularMask rootView measuredWith=");
        A10.append(A17.getMeasuredWidth());
        A10.append(", measuredHeight=");
        C17900vP.A0o(A10, A17.getMeasuredHeight());
        View A05 = C18070vi.A05(A17, 2131436765);
        View A052 = C18070vi.A05(A17, 2131436763);
        View A053 = C18070vi.A05(A17, 2131436762);
        int min = Math.min(A17.getMeasuredWidth(), A17.getMeasuredHeight());
        ViewGroup.LayoutParams layoutParams = A05.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = min;
            layoutParams.height = min;
            if (layoutParams instanceof FrameLayout.LayoutParams) {
                ((FrameLayout.LayoutParams) layoutParams).gravity = 17;
            }
            A05.setLayoutParams(layoutParams);
            AnonymousClass3MY.A14(AnonymousClass3MZ.A09(ptvComposerFragment), A05, 2131168384);
            AnonymousClass3MY.A14(AnonymousClass3MZ.A09(ptvComposerFragment), A052, 2131168383);
            if (ptvComposerFragment.A0l && (findViewById = A053.findViewById(2131436751)) != null) {
                if (A17.getMeasuredHeight() > A17.getMeasuredWidth()) {
                    measuredWidth = (float) A17.getMeasuredHeight();
                    measuredHeight = A17.getMeasuredWidth();
                } else {
                    measuredWidth = (float) A17.getMeasuredWidth();
                    measuredHeight = A17.getMeasuredHeight();
                }
                float f = measuredWidth / ((float) measuredHeight);
                findViewById.setScaleX(f);
                findViewById.setScaleY(f);
            }
            AnonymousClass1FL A1B = ptvComposerFragment.A1B();
            if (A1B != null) {
                MediaProgressRing mediaProgressRing = (MediaProgressRing) ptvComposerFragment.A0s.getValue();
                mediaProgressRing.A02(A1B, (C1607889x) ptvComposerFragment.A00.getValue());
                mediaProgressRing.setVisibility(0);
            }
            AnonymousClass4aO.A02(frameLayout);
            return;
        }
        throw AnonymousClass3MY.A0k();
    }

    public void A2K() {
        super.A2K();
        C136246tV r4 = this.A0P;
        if (r4 != null) {
            r4.A02++;
        }
    }

    public void A2P(AnonymousClass7JS r5, AnonymousClass7JN r6, C136986uj r7) {
        C18070vi.A0n(r7, r6, r5);
        super.A2P(r5, r6, r7);
        Log.i("PtvComposerFragment/onActivated");
        AnonymousClass7JN.A02(r6);
        FrameLayout frameLayout = this.A0E;
        if (frameLayout != null) {
            if (frameLayout.getMeasuredWidth() <= 0 || frameLayout.getMeasuredHeight() <= 0) {
                AnonymousClass795.A00(frameLayout.getViewTreeObserver(), frameLayout, this, 4);
            } else {
                A00(frameLayout, this);
            }
        }
        C72453Mb.A1D(this.A0D);
        AnonymousClass1FL A1B = A1B();
        if (A1B != null) {
            TitleBarView titleBarView = r7.A0I;
            MediaTimeDisplay mediaTimeDisplay = titleBarView.A0V;
            if (mediaTimeDisplay != null) {
                mediaTimeDisplay.setVisibility(0);
                AnonymousClass8AG r1 = (AnonymousClass8AG) this.A01.getValue();
                C18070vi.A0d(r1, 1);
                MediaTimeDisplay mediaTimeDisplay2 = titleBarView.A0V;
                if (mediaTimeDisplay2 != null) {
                    mediaTimeDisplay2.A03(A1B, r1);
                    return;
                }
            }
            C18070vi.A11("playbackTimeDisplay");
            throw null;
        }
    }

    public void A2Y(Uri uri, AnonymousClass7JT r3, long j) {
        super.A2Y(uri, r3, j);
        C72453Mb.A1D(this.A0D);
    }
}
