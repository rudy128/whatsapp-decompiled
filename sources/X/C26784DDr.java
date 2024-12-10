package X;

import java.util.List;

/* renamed from: X.DDr  reason: case insensitive filesystem */
public final class C26784DDr implements E98, E1C {
    public float A00 = 1.0f;
    public C26045Cr9 A01;
    public boolean A02;
    public DE4 A03;
    public DE4 A04;
    public final C25639CjS A05;
    public final C25132CZh A06 = new C25132CZh();

    public synchronized void A01(int i) {
        Integer num;
        Integer num2;
        List list = this.A06.A00;
        int A08 = BE7.A08(list);
        for (int i2 = 0; i2 < A08; i2++) {
            C26785DDs dDs = (C26785DDs) list.get(i2);
            if (dDs instanceof E1C) {
                C24861CNe cNe = dDs.A07;
                if (i == 1) {
                    num = AnonymousClass00R.A0C;
                } else if (i == 2) {
                    num = AnonymousClass00R.A0N;
                } else if (i == 3) {
                    num = AnonymousClass00R.A0Y;
                } else if (i != 4) {
                    num = AnonymousClass00R.A01;
                } else {
                    num = AnonymousClass00R.A0j;
                }
                cNe.A01 = num;
                switch (num.intValue()) {
                    case 1:
                        num2 = AnonymousClass00R.A01;
                        break;
                    case 2:
                        num2 = AnonymousClass00R.A0C;
                        break;
                    case 3:
                        num2 = AnonymousClass00R.A0N;
                        break;
                    case 4:
                        num2 = AnonymousClass00R.A0Y;
                        break;
                    default:
                        num2 = AnonymousClass00R.A0j;
                        break;
                }
                cNe.A00 = num2;
            }
        }
    }

    public synchronized boolean A02() {
        List list = this.A06.A00;
        int A08 = BE7.A08(list);
        for (int i = 0; i < A08; i++) {
            C26785DDs dDs = (C26785DDs) list.get(i);
            if (dDs instanceof E1C) {
                C28607E9y e9y = dDs.A03;
                if (e9y instanceof EDQ) {
                    C18070vi.A0z(e9y, "null cannot be cast to non-null type com.facebook.videocodec.effects.common.OutputAwareGLRenderer");
                    if (((EDQ) e9y).Bfc()) {
                        return true;
                    }
                } else {
                    continue;
                }
            }
        }
        return false;
    }

    public void BCi(EAJ eaj) {
    }

    public void BIY() {
    }

    public void Bd8(C26045Cr9 cr9) {
        C18070vi.A0d(cr9, 0);
        this.A01 = cr9;
    }

    public synchronized void release() {
        this.A03 = null;
        this.A04 = null;
    }

    public static final DE4 A00(C26784DDr dDr) {
        C26045Cr9 cr9 = dDr.A01;
        if (cr9 == null) {
            throw AnonymousClass000.A0n("GlRenderChain.init() must be called before getFrameBuffer()");
        } else if (dDr.A02) {
            DE4 de4 = dDr.A03;
            if (de4 != null) {
                return de4;
            }
            DE4 A002 = DE4.A00(dDr.A05, true);
            cr9.A03(A002);
            dDr.A03 = A002;
            return A002;
        } else {
            DE4 de42 = dDr.A04;
            if (de42 != null) {
                return de42;
            }
            DE4 A003 = DE4.A00(dDr.A05, true);
            cr9.A03(A003);
            dDr.A04 = A003;
            return A003;
        }
    }

    public C26784DDr(C25639CjS cjS) {
        this.A05 = cjS;
    }
}
