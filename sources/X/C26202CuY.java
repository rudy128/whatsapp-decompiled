package X;

import android.content.res.Resources;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import java.util.concurrent.Executor;

/* renamed from: X.CuY  reason: case insensitive filesystem */
public final class C26202CuY {
    public final C96 A00;
    public final C25510Ch8 A01;
    public final Executor A02;
    public final Executor A03;
    public final C36001nB A04 = new C28224Dtk(this);
    public final C97 A05;

    public static final void A00(Resources resources, C25809CmM cmM, C22825BRd bRd) {
        C18070vi.A0d(cmM, 0);
        Drawable drawable = bRd.A0B;
        int i = bRd.A02;
        if (drawable == null) {
            if (i != 0) {
                drawable = resources.getDrawable(i);
            } else {
                drawable = null;
            }
        }
        C3F A012 = C25310CdF.A01(drawable);
        CNE cne = cmM.A09.A01;
        cmM.A01(cmM.A01, cmM.A02, cne, A012);
    }

    public static final void A01(Resources resources, C25809CmM cmM, C22825BRd bRd) {
        CNE cne;
        C18070vi.A0d(cmM, 0);
        C3F A002 = C25310CdF.A00(resources, bRd.A0C, bRd.A0P, bRd.A03);
        if (A002 == null) {
            cmM.A02(true);
            return;
        }
        EBA eba = bRd.A0G;
        if (eba != null) {
            cne = new CNE(bRd.A09, eba);
        } else {
            cne = null;
        }
        cmM.A01(cmM.A01, cmM.A02, cne, A002);
    }

    public void A05(E4Q e4q) {
        C18070vi.A0d(e4q, 0);
        if (C26212Cuq.A04()) {
            C26212Cuq.A03("KFrescoController#release");
            try {
                if (!(e4q instanceof BFG)) {
                    BEA.A1I(e4q, "Drawable not supported ");
                } else {
                    C25707Ckd.A02.A01((BFG) e4q);
                }
            } finally {
                C26212Cuq.A01();
            }
        } else if (!(e4q instanceof BFG)) {
            BEA.A1I(e4q, "Drawable not supported ");
        } else {
            C25707Ckd.A02.A01((BFG) e4q);
        }
    }

    public void A07(E4Q e4q) {
        C18070vi.A0d(e4q, 0);
        if (C26212Cuq.A04()) {
            C26212Cuq.A03("KFrescoController#releaseImmediately");
            try {
                if (!(e4q instanceof BFG)) {
                    BEA.A1I(e4q, "Drawable not supported ");
                } else {
                    C25707Ckd ckd = C25707Ckd.A02;
                    BFG bfg = (BFG) e4q;
                    C18070vi.A0d(bfg, 0);
                    bfg.A01();
                }
            } finally {
                C26212Cuq.A01();
            }
        } else if (!(e4q instanceof BFG)) {
            BEA.A1I(e4q, "Drawable not supported ");
        } else {
            BFG bfg2 = (BFG) e4q;
            C25707Ckd ckd2 = C25707Ckd.A02;
            C18070vi.A0d(bfg2, 0);
            bfg2.A01();
        }
    }

    public boolean A08(Rect rect, E12 e12, E4Q e4q, C26738DBr dBr, C28604E9v e9v, Object obj) {
        C24774CJr cJr;
        C22829BRh bRh;
        C24774CJr cJr2;
        C22829BRh bRh2;
        E4Q e4q2 = e4q;
        C26738DBr dBr2 = dBr;
        boolean A17 = C18070vi.A17(e4q2, dBr2);
        Drawable drawable = null;
        E12 e122 = e12;
        C28604E9v e9v2 = e9v;
        Object obj2 = obj;
        if (C26212Cuq.A04()) {
            C26212Cuq.A03("KFrescoController#fetch");
            try {
                if (!(e4q2 instanceof BFG)) {
                    BEA.A1I(e4q2, "Drawable not supported ");
                } else {
                    BFG bfg = (BFG) e4q2;
                    if (A03(dBr2, bfg)) {
                        C25707Ckd.A02.A00(bfg);
                        C26212Cuq.A01();
                        return A17;
                    }
                    long incrementAndGet = CEZ.A00.incrementAndGet();
                    bfg.A01();
                    bfg.A02 = dBr2;
                    bfg.A04 = obj2;
                    CPS cps = bfg.A0A;
                    cps.A01 = e9v2;
                    if (e12 != null) {
                        cJr = new C24774CJr(e122);
                    } else {
                        cJr = null;
                    }
                    cps.A00 = cJr;
                    if (cJr != null) {
                        throw AnonymousClass000.A0s("trying to set localImagePerfStateListener without a localPerfStatePublisher");
                    }
                    bfg.A00 = incrementAndGet;
                    bfg.A01 = rect;
                    C22825BRd bRd = dBr2.A01;
                    C25434Cfh.A00((DRN) null, (C26048CrF) null, bfg);
                    C28604E9v e9v3 = cps.A01;
                    if (e9v3 != null) {
                        e9v3.C7E(incrementAndGet, obj2);
                    }
                    C25809CmM cmM = bfg.A0D;
                    Resources resources = dBr2.A00;
                    A00(resources, cmM, bRd);
                    if (C26212Cuq.A04()) {
                        C26212Cuq.A03("KFrescoController#setActualImage");
                        C26212Cuq.A01();
                    }
                    C25809CmM cmM2 = bfg.A0E;
                    A01(resources, cmM2, bRd);
                    C3F c3f = cmM2.A03;
                    if ((c3f instanceof C22829BRh) && (bRh = (C22829BRh) c3f) != null) {
                        drawable = bRh.A02;
                    }
                    C28604E9v e9v4 = cps.A01;
                    if (e9v4 != null) {
                        e9v4.C0i(drawable, incrementAndGet);
                    }
                    A02(resources, bfg, bRd);
                    this.A02.execute(new AnonymousClass3CE(e4q2, this, dBr2, obj2, 0, incrementAndGet));
                    bfg.invalidateSelf();
                }
                return false;
            } finally {
                C26212Cuq.A01();
            }
        } else if (!(e4q2 instanceof BFG)) {
            BEA.A1I(e4q2, "Drawable not supported ");
            return false;
        } else {
            BFG bfg2 = (BFG) e4q2;
            if (A03(dBr2, bfg2)) {
                C25707Ckd.A02.A00(bfg2);
                return A17;
            }
            long incrementAndGet2 = CEZ.A00.incrementAndGet();
            bfg2.A01();
            bfg2.A02 = dBr2;
            bfg2.A04 = obj2;
            CPS cps2 = bfg2.A0A;
            cps2.A01 = e9v2;
            if (e12 != null) {
                cJr2 = new C24774CJr(e122);
            } else {
                cJr2 = null;
            }
            cps2.A00 = cJr2;
            if (cJr2 != null) {
                throw AnonymousClass000.A0s("trying to set localImagePerfStateListener without a localPerfStatePublisher");
            }
            bfg2.A00 = incrementAndGet2;
            bfg2.A01 = rect;
            C22825BRd bRd2 = dBr2.A01;
            C25434Cfh.A00((DRN) null, (C26048CrF) null, bfg2);
            C28604E9v e9v5 = cps2.A01;
            if (e9v5 != null) {
                e9v5.C7E(incrementAndGet2, obj2);
            }
            C25809CmM cmM3 = bfg2.A0D;
            Resources resources2 = dBr2.A00;
            A00(resources2, cmM3, bRd2);
            if (C26212Cuq.A04()) {
                C26212Cuq.A03("KFrescoController#setActualImage");
                C26212Cuq.A01();
            }
            C25809CmM cmM4 = bfg2.A0E;
            A01(resources2, cmM4, bRd2);
            C3F c3f2 = cmM4.A03;
            if ((c3f2 instanceof C22829BRh) && (bRh2 = (C22829BRh) c3f2) != null) {
                drawable = bRh2.A02;
            }
            C28604E9v e9v6 = cps2.A01;
            if (e9v6 != null) {
                e9v6.C0i(drawable, incrementAndGet2);
            }
            A02(resources2, bfg2, bRd2);
            this.A02.execute(new AnonymousClass3CE(e4q2, this, dBr2, obj2, 0, incrementAndGet2));
            bfg2.invalidateSelf();
            return false;
        }
    }

    public static final void A02(Resources resources, BFG bfg, C22825BRd bRd) {
        Drawable drawable = bRd.A0D;
        int i = bRd.A04;
        if (drawable == null && (i == 0 || (drawable = resources.getDrawable(i)) == null)) {
            C25809CmM cmM = bfg.A03;
            if (cmM != null) {
                cmM.A02(true);
            }
            bfg.A03 = null;
            return;
        }
        C25809CmM cmM2 = bfg.A03;
        if (cmM2 == null) {
            cmM2 = new C25809CmM(bfg.A0G, bfg.A0H);
            bfg.A03 = cmM2;
        }
        C98.A00(drawable, 0.0f);
        C22829BRh bRh = new C22829BRh(drawable);
        EBA eba = bRd.A0H;
        CNE cne = null;
        if (eba != null) {
            cne = new CNE((PointF) null, eba);
        }
        cmM2.A01(cmM2.A01, cmM2.A02, cne, bRh);
    }

    public C26202CuY(C96 c96, C97 c97, C25510Ch8 ch8, Executor executor, Executor executor2) {
        this.A00 = c96;
        this.A01 = ch8;
        this.A03 = executor;
        this.A02 = executor2;
        this.A05 = c97;
    }

    private final boolean A03(C26738DBr dBr, BFG bfg) {
        if (!C26212Cuq.A04()) {
            return dBr.equals(bfg.A02);
        }
        C26212Cuq.A03("KFrescoController#isAlreadyLoadingImage");
        try {
            return dBr.equals(bfg.A02);
        } finally {
            C26212Cuq.A01();
        }
    }

    public BFG A04() {
        if (!C26212Cuq.A04()) {
            return new BFG(this.A05);
        }
        C26212Cuq.A03("KFrescoController#createDrawable");
        try {
            return new BFG(this.A05);
        } finally {
            C26212Cuq.A01();
        }
    }

    public void A06(E4Q e4q) {
        if (C26212Cuq.A04()) {
            C26212Cuq.A03("KFrescoController#releaseDelayed");
            try {
                if (!(e4q instanceof BFG)) {
                    BEA.A1I(e4q, "Drawable not supported ");
                } else {
                    C25707Ckd ckd = C25707Ckd.A02;
                    BFG bfg = (BFG) e4q;
                    C18070vi.A0d(bfg, 0);
                    C25707Ckd.A00.postDelayed(bfg.A0F, 80);
                }
            } finally {
                C26212Cuq.A01();
            }
        } else if (!(e4q instanceof BFG)) {
            BEA.A1I(e4q, "Drawable not supported ");
        } else {
            BFG bfg2 = (BFG) e4q;
            C25707Ckd ckd2 = C25707Ckd.A02;
            C18070vi.A0d(bfg2, 0);
            C25707Ckd.A00.postDelayed(bfg2.A0F, 80);
        }
    }
}
