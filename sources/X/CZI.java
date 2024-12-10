package X;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class CZI {
    public BSH A00;
    public BSI A01;
    public BSG A02;
    public BSG A03;
    public BSG A04;
    public CV5 A05;
    public C25052CVg A06;
    public final CTW A07;

    public CV5 A00() {
        CV5 cv5 = this.A05;
        if (cv5 != null) {
            return cv5;
        }
        BSI bsi = this.A01;
        if (bsi == null) {
            CTW ctw = this.A07;
            bsi = new BSI(ctw.A00, ctw.A04, ctw.A07);
            this.A01 = bsi;
        }
        CV5 cv52 = new CV5(bsi);
        this.A05 = cv52;
        return cv52;
    }

    public C25052CVg A01(int i) {
        BSG bsg;
        BSG bsg2;
        C25052CVg cVg = this.A06;
        if (cVg != null) {
            return cVg;
        }
        if (i == 0) {
            bsg = this.A04;
            if (bsg == null) {
                bsg = null;
                try {
                    Class<?> cls = Class.forName("com.facebook.imagepipeline.memory.NativeMemoryChunkPool");
                    Class[] clsArr = new Class[3];
                    clsArr[0] = C28431E0x.class;
                    clsArr[1] = CRL.class;
                    Constructor A0w = BE6.A0w(cls, C28619EAr.class, clsArr, 2);
                    CTW ctw = this.A07;
                    bsg2 = (BSG) A0w.newInstance(new Object[]{ctw.A00, ctw.A03, ctw.A06});
                    this.A04 = bsg2;
                } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
                    C26265CwA.A05("PoolFactory", "", e);
                    this.A04 = null;
                }
            }
            C26208Cuj.A02(bsg, AnonymousClass001.A1I("failed to get pool for chunk type: ", AnonymousClass000.A10(), i));
            C25052CVg cVg2 = new C25052CVg(A00(), bsg);
            this.A06 = cVg2;
            return cVg2;
        } else if (i == 1) {
            bsg = this.A03;
            if (bsg == null) {
                bsg = null;
                try {
                    Class<?> cls2 = Class.forName("com.facebook.imagepipeline.memory.BufferMemoryChunkPool");
                    Class[] clsArr2 = new Class[3];
                    clsArr2[0] = C28431E0x.class;
                    clsArr2[1] = CRL.class;
                    Constructor A0w2 = BE6.A0w(cls2, C28619EAr.class, clsArr2, 2);
                    CTW ctw2 = this.A07;
                    bsg2 = (BSG) A0w2.newInstance(new Object[]{ctw2.A00, ctw2.A03, ctw2.A06});
                    this.A03 = bsg2;
                } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
                    this.A03 = null;
                }
            }
            C26208Cuj.A02(bsg, AnonymousClass001.A1I("failed to get pool for chunk type: ", AnonymousClass000.A10(), i));
            C25052CVg cVg22 = new C25052CVg(A00(), bsg);
            this.A06 = cVg22;
            return cVg22;
        } else if (i == 2) {
            bsg = this.A02;
            if (bsg == null) {
                bsg = null;
                try {
                    Class<?> cls3 = Class.forName("com.facebook.imagepipeline.memory.AshmemMemoryChunkPool");
                    Class[] clsArr3 = new Class[3];
                    clsArr3[0] = C28431E0x.class;
                    clsArr3[1] = CRL.class;
                    Constructor A0w3 = BE6.A0w(cls3, C28619EAr.class, clsArr3, 2);
                    CTW ctw3 = this.A07;
                    bsg2 = (BSG) A0w3.newInstance(new Object[]{ctw3.A00, ctw3.A03, ctw3.A06});
                    this.A02 = bsg2;
                } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused2) {
                    this.A02 = null;
                }
            }
            C26208Cuj.A02(bsg, AnonymousClass001.A1I("failed to get pool for chunk type: ", AnonymousClass000.A10(), i));
            C25052CVg cVg222 = new C25052CVg(A00(), bsg);
            this.A06 = cVg222;
            return cVg222;
        } else {
            throw AnonymousClass000.A0k("Invalid MemoryChunkType");
        }
        bsg = bsg2;
        C26208Cuj.A02(bsg, AnonymousClass001.A1I("failed to get pool for chunk type: ", AnonymousClass000.A10(), i));
        C25052CVg cVg2222 = new C25052CVg(A00(), bsg);
        this.A06 = cVg2222;
        return cVg2222;
    }

    public CZI(CTW ctw) {
        this.A07 = ctw;
    }
}
