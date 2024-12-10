package com.whatsapp.wabloks.base;

import X.A2V;
import X.A2X;
import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass1DF;
import X.AnonymousClass3MW;
import X.AnonymousClass79D;
import X.AnonymousClass7NI;
import X.AnonymousClass7NW;
import X.AnonymousClass86V;
import X.AnonymousClass86X;
import X.C108945cZ;
import X.C108955ca;
import X.C128046fM;
import X.C1420577z;
import X.C146787Qp;
import X.C154777rg;
import X.C154787rh;
import X.C154797ri;
import X.C18070vi;
import X.C18100vl;
import X.C187029f9;
import X.C195329tA;
import X.C21455AkM;
import X.C217517g;
import X.C26235CvV;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public final class BkFcsPreloadingScreenFragment extends Hilt_BkFcsPreloadingScreenFragment {
    public AnonymousClass86V A00;
    public A2X A01;
    public A2V A02;
    public C195329tA A03;
    public Map A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final AnonymousClass00H A08 = C217517g.A00(32851);
    public final Queue A09 = new LinkedList();
    public final C18100vl A0A = AnonymousClass1DF.A01(new C154777rg(this));
    public final C18100vl A0B = AnonymousClass1DF.A01(new C154787rh(this));
    public final C18100vl A0C = AnonymousClass1DF.A01(new C154797ri(this));

    public void A21(Bundle bundle, View view) {
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        Fragment.A0K(this).A0E = true;
        C1420577z.A00(view, new C146787Qp(this, 29));
    }

    public static final void A00(BkFcsPreloadingScreenFragment bkFcsPreloadingScreenFragment, AnonymousClass7NW r7) {
        Map map = bkFcsPreloadingScreenFragment.A04;
        if (map != null) {
            ArrayList A13 = AnonymousClass000.A13();
            A13.add("");
            String str = r7.A00;
            if ("onLoadingFailure".equals(str)) {
                A13.add(r7.A02);
            }
            AnonymousClass86X r1 = (AnonymousClass86X) map.get(str);
            AnonymousClass86V r0 = bkFcsPreloadingScreenFragment.A00;
            if (r1 != null && r0 != null) {
                bkFcsPreloadingScreenFragment.A04.A00(new C21455AkM(r0.BM1(), r1.BM3(), A13, 46));
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.B5z] */
    public void A2D() {
        A2X a2x = this.A01;
        if (a2x != null) {
            a2x.A02(new Object());
        }
        super.A2D();
    }

    public Animation A18(int i, boolean z) {
        if (i != 2130772012) {
            return null;
        }
        Animation loadAnimation = AnimationUtils.loadAnimation(A1B(), i);
        if (loadAnimation != null && z) {
            ((C128046fM) this.A08.get()).A00 = true;
            loadAnimation.setAnimationListener(new AnonymousClass79D(this, 1));
        }
        return loadAnimation;
    }

    public void A1r() {
        super.A1r();
        A2X a2x = this.A01;
        if (a2x != null) {
            a2x.A04(this);
        }
        this.A01 = null;
    }

    public void A1t() {
        super.A1t();
        this.A06 = false;
    }

    public void A1u() {
        super.A1u();
        this.A06 = true;
        while (true) {
            Queue queue = this.A09;
            if (!queue.isEmpty()) {
                C108945cZ.A1P(queue.remove());
            } else {
                return;
            }
        }
    }

    public void A1z(Bundle bundle) {
        String str;
        C26235CvV cvV;
        String A0s = C108955ca.A0s(A15(), "fds_manager_id");
        C18070vi.A0X(A0s);
        C195329tA r3 = this.A03;
        if (r3 != null) {
            C187029f9 A002 = r3.A00(AnonymousClass3MW.A0y(this.A0C), A0s, A15().getString("screen_params"));
            if (!(A002 == null || (cvV = A002.A01) == null)) {
                this.A02 = cvV;
                this.A06 = null;
            }
            super.A1z(bundle);
            A2V a2v = this.A02;
            if (a2v != null) {
                A2X A022 = a2v.A02(AnonymousClass3MW.A0y(this.A0B));
                AnonymousClass7NI.A00(A022, AnonymousClass7NW.class, this, 3);
                this.A01 = A022;
                return;
            }
            str = "uiObserversLazy";
        } else {
            str = "cacheHelper";
        }
        C18070vi.A11(str);
        throw null;
    }

    public void A28() {
        super.A28();
        this.A05 = true;
        if (!this.A07) {
            A1M();
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.B5z] */
    public void A2C() {
        super.A2C();
        A2X a2x = this.A01;
        if (a2x != null) {
            a2x.A02(new Object());
        }
    }
}
