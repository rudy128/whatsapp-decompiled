package X;

import android.graphics.RectF;
import java.util.List;

public class DDn implements E98 {
    public RectF A00;
    public C26045Cr9 A01;
    public C26780DDk A02;
    public DE0 A03;
    public final C25639CjS A04;
    public final C25132CZh A05 = new C25132CZh();

    static {
        new Object();
    }

    public static EA3 A00(DDn dDn, EA3 ea3) {
        if (dDn.A00 == null) {
            return ea3;
        }
        DE0 de0 = dDn.A03;
        if (de0 == null) {
            de0 = new DE0();
            dDn.A03 = de0;
        }
        CZB texture = ea3.getTexture();
        if (texture == null) {
            return ea3;
        }
        CRH crh = texture.A02;
        int i = crh.A01;
        int i2 = crh.A00;
        de0.A00 = ea3;
        RectF rectF = dDn.A00;
        float f = (float) i;
        float f2 = (float) i2;
        de0.A00(BE6.A04(rectF.left, f), BE6.A04(rectF.top, f2), BE6.A04(rectF.width(), f), BE6.A04(dDn.A00.height(), f2));
        return dDn.A03;
    }

    public void A03(Object obj) {
        C25132CZh cZh = this.A05;
        List list = cZh.A00;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            EAK eak = (EAK) list.get(i);
            if (eak.contains(obj) || eak.equals(obj)) {
                cZh.A02(eak);
                if (eak instanceof E98) {
                    E98 e98 = (E98) eak;
                    this.A01.A04(e98);
                    e98.release();
                    return;
                }
                return;
            }
        }
    }

    public void BCi(EAJ eaj) {
        C26780DDk dDk = this.A02;
        if (dDk != null) {
            dDk.BCi(eaj);
        }
    }

    public void BIY() {
        C26780DDk dDk = this.A02;
        if (dDk != null) {
            dDk.BIY();
        }
    }

    public void release() {
        C25132CZh cZh = this.A05;
        List list = cZh.A00;
        cZh.A00();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            EAK eak = (EAK) list.get(i);
            if (eak instanceof E98) {
                ((E98) eak).release();
            }
        }
    }

    public DDn(C25639CjS cjS) {
        this.A04 = cjS;
    }

    public void A01(C26045Cr9 cr9, EAK eak) {
        Object BU8 = eak.BU8();
        C25132CZh cZh = this.A05;
        List list = cZh.A00;
        int size = list.size();
        int i = 0;
        while (i < size) {
            EAK eak2 = (EAK) list.get(i);
            if (!eak2.contains(BU8) && !eak2.equals(BU8)) {
                i++;
            } else {
                return;
            }
        }
        cZh.A01(eak);
        if (eak instanceof E98) {
            cr9.A03((E98) eak);
        }
    }

    public void A02(EA3 ea3) {
        EA3 A002 = A00(this, ea3);
        EAJ A012 = this.A01.A01();
        if (this.A02 == null) {
            C26780DDk dDk = new C26780DDk(this.A04);
            this.A02 = dDk;
            dDk.BCi(A012);
        }
        C26780DDk dDk2 = this.A02;
        List list = this.A05.A00;
        int size = list.size();
        if (size == 0) {
            dDk2.A03.A00(C0H.A0C);
            return;
        }
        for (int i = 0; i < size; i++) {
            dDk2.A00(A012, A002, (EAK) list.get(i));
        }
    }

    public void Bd8(C26045Cr9 cr9) {
        this.A01 = cr9;
    }
}
