package com.whatsapp.calling.callgrid.viewmodel;

import X.AnonymousClass000;
import X.AnonymousClass10I;
import X.AnonymousClass118;
import X.AnonymousClass1DT;
import X.AnonymousClass1J2;
import X.AnonymousClass1VE;
import X.C108945cZ;
import X.C109785e0;
import X.C146427Pb;
import X.C17900vP;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18140vp;
import X.C22781De;
import X.C42171xk;
import X.C72463Mc;
import android.hardware.display.DisplayManager;
import java.util.concurrent.atomic.AtomicInteger;

public class OrientationViewModel extends AnonymousClass1J2 {
    public DisplayManager.DisplayListener A00;
    public C109785e0 A01;
    public AtomicInteger A02 = new AtomicInteger();
    public boolean A03;
    public Integer A04;
    public final int A05;
    public final int A06;
    public final AnonymousClass1DT A07 = C108945cZ.A0S();
    public final AnonymousClass118 A08;
    public final C18030ve A09;
    public final AnonymousClass10I A0A;
    public final C18140vp A0B;
    public final C18140vp A0C;

    public static void A00(OrientationViewModel orientationViewModel) {
        Integer num;
        if (C72463Mc.A1Z(orientationViewModel.A0B)) {
            A03(orientationViewModel, orientationViewModel.A0T(), false);
        } else if (C72463Mc.A1Z(orientationViewModel.A0C)) {
            Number A1C = C108945cZ.A1C(orientationViewModel.A07);
            if (C18020vd.A05(C18040vf.A02, orientationViewModel.A09, 9746)) {
                int A0T = orientationViewModel.A0T();
                if (!(A1C == null || (num = orientationViewModel.A04) == null || num.equals(Integer.valueOf(A0T)))) {
                    A03(orientationViewModel, A1C.intValue(), true);
                }
                orientationViewModel.A04 = Integer.valueOf(A0T);
            } else if (A1C != null) {
                A03(orientationViewModel, A1C.intValue(), true);
            }
        }
    }

    public static void A03(OrientationViewModel orientationViewModel, int i, boolean z) {
        AnonymousClass1DT r3 = orientationViewModel.A07;
        Object A062 = r3.A06();
        Integer valueOf = Integer.valueOf(i);
        if (!C42171xk.A00(A062, valueOf) || z) {
            C17900vP.A0j("voip/OrientationViewModel/setOrientation ", AnonymousClass000.A10(), i);
            if (C22781De.A03()) {
                r3.A0F(valueOf);
            } else {
                r3.A0E(valueOf);
            }
        }
    }

    public int A0T() {
        int rotation = ((DisplayManager) this.A08.A00.getSystemService("display")).getDisplay(0).getRotation();
        if ((C18020vd.A00(C18040vf.A02, this.A09, 11857) & 2) != 0) {
            this.A02.set(rotation);
        }
        return (4 - rotation) % 4;
    }

    public OrientationViewModel(AnonymousClass1VE r5, AnonymousClass118 r6, C18030ve r7, AnonymousClass10I r8, C18140vp r9, C18140vp r10) {
        this.A09 = r7;
        this.A08 = r6;
        this.A0A = r8;
        this.A0B = r9;
        this.A0C = r10;
        int i = AnonymousClass1VE.A00(r5).getInt("portrait_mode_threshold", 30);
        this.A06 = i;
        int i2 = AnonymousClass1VE.A00(r5).getInt("landscape_mode_threshold", 30);
        this.A05 = i2;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("OrientationViewModel/ctor portraitModeThreshold = ");
        A10.append(i);
        C17900vP.A0j(" landscapeModeThreshold = ", A10, i2);
        C18040vf r2 = C18040vf.A02;
        if ((C18020vd.A00(r2, r7, 11857) & 1) == 0) {
            C146427Pb r1 = new C146427Pb(this, 11);
            if ((C18020vd.A00(r2, this.A09, 11857) & 2) != 0) {
                this.A0A.CGF(r1);
            } else {
                r1.run();
            }
        }
    }
}
