package X;

import com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl;
import java.lang.reflect.Constructor;

/* renamed from: X.Ct4  reason: case insensitive filesystem */
public class C26141Ct4 {
    public static C25696CkR A0F;
    public static C26141Ct4 A0G;
    public C28658ECt A00;
    public C26756DCl A01;
    public C25239Cba A02;
    public C26220Cv8 A03;
    public E4U A04;
    public C26134Csx A05;
    public E4X A06;
    public AnimatedFactoryV2Impl A07;
    public C25026CUc A08;
    public C28658ECt A09;
    public C26756DCl A0A;
    public final E4K A0B;
    public final C24777CJu A0C;
    public final CUW A0D;
    public final CNH A0E;

    public static AnimatedFactoryV2Impl A00(C26141Ct4 ct4) {
        C26141Ct4 ct42 = ct4;
        AnimatedFactoryV2Impl animatedFactoryV2Impl = ct42.A07;
        if (animatedFactoryV2Impl != null) {
            return animatedFactoryV2Impl;
        }
        C25026CUc A032 = ct42.A03();
        E18 e18 = ct42.A0D.A0F;
        C28658ECt A042 = ct42.A04();
        if (!C24455C4v.A01) {
            try {
                Class<?> cls = Class.forName("com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl");
                Class[] clsArr = new Class[8];
                clsArr[0] = C25026CUc.class;
                clsArr[1] = E18.class;
                clsArr[2] = C28658ECt.class;
                Class cls2 = Boolean.TYPE;
                clsArr[3] = cls2;
                clsArr[4] = cls2;
                Class cls3 = Integer.TYPE;
                clsArr[5] = cls3;
                clsArr[6] = cls3;
                Constructor A0w = BE6.A0w(cls, EEB.class, clsArr, 7);
                Object[] A1a = C108945cZ.A1a(A032, e18, 8, 1);
                A1a[2] = A042;
                A1a[3] = false;
                A1a[4] = false;
                BEA.A1V(A1a, 30, 5, 1000, 6);
                A1a[7] = null;
                Object newInstance = A0w.newInstance(A1a);
                C18070vi.A0z(newInstance, "null cannot be cast to non-null type com.facebook.imagepipeline.animated.factory.AnimatedFactory");
                C24455C4v.A00 = (AnimatedFactoryV2Impl) newInstance;
            } catch (Throwable unused) {
            }
            if (C24455C4v.A00 != null) {
                C24455C4v.A01 = true;
            }
        }
        AnimatedFactoryV2Impl animatedFactoryV2Impl2 = C24455C4v.A00;
        ct42.A07 = animatedFactoryV2Impl2;
        return animatedFactoryV2Impl2;
    }

    public static synchronized void A01(CUW cuw) {
        Class<C26141Ct4> cls = C26141Ct4.class;
        synchronized (cls) {
            if (A0G != null) {
                EAY eay = C26265CwA.A00;
                if (eay.BfN(5)) {
                    eay.CRu(cls.getSimpleName(), "ImagePipelineFactory has already been initialized! `ImagePipelineFactory.initialize(...)` should only be called once to avoid unexpected behavior.");
                }
            }
            A0G = new C26141Ct4(cuw);
        }
    }

    public static synchronized boolean A02() {
        boolean A1W;
        synchronized (C26141Ct4.class) {
            A1W = AnonymousClass000.A1W(A0G);
        }
        return A1W;
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [X.BSH, X.DBG] */
    public C25026CUc A03() {
        C25026CUc cUc = this.A08;
        if (cUc != null) {
            return cUc;
        }
        CUW cuw = this.A0D;
        CZI czi = cuw.A0J;
        if (this.A05 == null) {
            this.A05 = C9F.A00(czi, cuw.A0G.A02);
        }
        C24777CJu cJu = this.A0C;
        C18070vi.A0i(czi, cJu);
        BSH bsh = czi.A00;
        BSH bsh2 = bsh;
        if (bsh == null) {
            CTW ctw = czi.A07;
            ? dbg = new DBG(ctw.A00, ctw.A01, ctw.A05);
            czi.A00 = dbg;
            bsh2 = dbg;
        }
        BSB bsb = new BSB(cJu, bsh2);
        this.A08 = bsb;
        return bsb;
    }

    public C28658ECt A04() {
        C28658ECt eCt = this.A09;
        if (eCt != null) {
            return eCt;
        }
        CUW cuw = this.A0D;
        C26757DCm dCm = new C26757DCm(cuw.A04, cuw.A0B, new C26760DCp(cuw.A09));
        this.A09 = dCm;
        return dCm;
    }

    public C26756DCl A05() {
        C26756DCl dCl = this.A0A;
        if (dCl != null) {
            return dCl;
        }
        CUW cuw = this.A0D;
        C28658ECt eCt = this.A00;
        if (eCt == null) {
            eCt = new C26757DCm(cuw.A06, cuw.A0C, new C26759DCo());
            this.A00 = eCt;
        }
        C26756DCl dCl2 = new C26756DCl(eCt, new C26758DCn(cuw.A0D, 0));
        this.A0A = dCl2;
        return dCl2;
    }

    public C26141Ct4(CUW cuw) {
        if (C26212Cuq.A04()) {
            C26212Cuq.A03("ImagePipelineConfig()");
        }
        this.A0D = cuw;
        this.A0E = new CNH(((C26762DCr) cuw.A0F).A03);
        this.A0C = new C24777CJu(cuw.A0H);
        C26212Cuq.A00();
        this.A0B = cuw.A05;
    }
}
