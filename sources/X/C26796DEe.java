package X;

import android.media.Image;
import android.media.ImageReader;
import android.os.Handler;
import android.util.Pair;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: X.DEe  reason: case insensitive filesystem */
public class C26796DEe implements C28628EBb {
    public Image A00;
    public DEU A01;
    public C25850CnB A02;
    public ImageReader A03;
    public C25971Cpe A04;
    public boolean A05;
    public final C25132CZh A06 = new C25132CZh();
    public final Callable A07 = new C27132DVt((Object) this, 18);
    public final ImageReader.OnImageAvailableListener A08 = new C26357CyJ(this, 2);
    public final CKH A09 = new CKH(this);
    public final C25089CXa A0A = new Object();

    public boolean Bge() {
        return true;
    }

    public static void A00(C26796DEe dEe) {
        C25089CXa cXa;
        C25971Cpe cpe;
        C26796DEe dEe2 = dEe;
        C25850CnB cnB = dEe2.A02;
        if (cnB == null) {
            return;
        }
        if (!cnB.A09()) {
            throw new C27223Da2("Method tryToNotifyCpuFrame() must run on the Optic Background Thread.");
        } else if (dEe2.A00 != null && dEe2.A04 != null && dEe2.Bcg()) {
            DEU deu = dEe2.A01;
            if (deu == null || (cpe = dEe2.A04) == null || !BEA.A1X(C25971Cpe.A0U, cpe)) {
                try {
                    cXa = dEe2.A0A;
                    cXa.A00(dEe2.A00, (Pair) null, (Float) null, (Long) null, (Long) null, (float[]) null, dEe2.A05, false);
                } catch (RuntimeException unused) {
                }
            } else {
                long timestamp = dEe2.A00.getTimestamp();
                C25648Cje cje = deu.A07;
                if (cje != null) {
                    int i = 0;
                    do {
                        C25750ClK clK = cje.A01[i];
                        if (clK != null) {
                            CKL ckl = C25750ClK.A0P;
                            if (clK.A00(ckl) != null && C17880vN.A05(clK.A00(ckl)) == timestamp) {
                                cXa = dEe2.A0A;
                                Image image = dEe2.A00;
                                boolean z = dEe2.A05;
                                Pair pair = (Pair) clK.A00(C25750ClK.A0N);
                                Long l = (Long) clK.A00(C25750ClK.A0O);
                                cXa.A00(image, pair, (Float) clK.A00(C25750ClK.A0M), l, (Long) clK.A00(C25750ClK.A0K), (float[]) clK.A00(C25750ClK.A0Q), z, false);
                            }
                        }
                        i++;
                    } while (i < 3);
                    return;
                }
                return;
            }
            List list = dEe2.A06.A00;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((E4h) list.get(i2)).C1f(cXa);
            }
            C25089CXa cXa2 = dEe2.A0A;
            if (cXa2.A0B != null) {
                int i3 = 0;
                while (true) {
                    C24909CPc[] cPcArr = cXa2.A0B;
                    if (i3 >= cPcArr.length) {
                        break;
                    }
                    C24909CPc cPc = cPcArr[i3];
                    ByteBuffer byteBuffer = cPc.A02;
                    if (byteBuffer != null) {
                        byteBuffer.clear();
                        cPc.A02 = null;
                    }
                    i3++;
                }
                cXa2.A0B = null;
            }
            cXa2.A09 = null;
            cXa2.A0A = null;
            cXa2.A04 = null;
            cXa2.A07 = null;
            cXa2.A05 = null;
            cXa2.A06 = null;
            dEe2.A00.close();
            dEe2.A00 = null;
        }
    }

    public boolean BBH(E4h e4h) {
        return this.A06.A01(e4h);
    }

    public void BEv() {
        this.A06.A00();
    }

    public CKH BRz() {
        return this.A09;
    }

    public List BU3() {
        return this.A06.A00;
    }

    public Surface BZw() {
        ImageReader imageReader = this.A03;
        if (imageReader != null) {
            return imageReader.getSurface();
        }
        throw AnonymousClass000.A0n("Getting image reader surface without initialize.");
    }

    public boolean Bcg() {
        return AnonymousClass000.A1a(this.A06.A00);
    }

    public void BdB(EBS ebs, C25632CjI cjI, C25971Cpe cpe, C26132Csv csv, C25850CnB cnB) {
        int A002;
        C26132Csv csv2 = csv;
        this.A02 = cnB;
        C25632CjI cjI2 = cjI;
        this.A05 = BE9.A1T(C25632CjI.A0S, cjI2);
        C25971Cpe cpe2 = cpe;
        this.A04 = cpe2;
        int A092 = BEA.A09(C25971Cpe.A0m, cpe2);
        if (BE9.A1S(EBS.A0M, ebs)) {
            List A11 = BE6.A11(C25632CjI.A0p, cjI2);
            int i = csv2.A02;
            int i2 = csv2.A01;
            int i3 = i * i2;
            int size = A11.size();
            for (int i4 = 0; i4 < size; i4++) {
                C26132Csv csv3 = (C26132Csv) A11.get(i4);
                int i5 = csv3.A02;
                int i6 = csv3.A01;
                if (C108945cZ.A00(((float) Math.max(i5, i6)) / ((float) Math.min(i5, i6)), ((float) Math.max(i, i2)) / ((float) Math.min(i, i2))) <= 1.0E-4f && (A002 = C26132Csv.A00(csv3)) < i3 && A002 >= 180000) {
                    csv2 = csv3;
                    i3 = A002;
                }
            }
        }
        ImageReader newInstance = ImageReader.newInstance(csv2.A02, csv2.A01, A092, 1);
        this.A03 = newInstance;
        newInstance.setOnImageAvailableListener(this.A08, (Handler) null);
    }

    public boolean CEm(E4h e4h) {
        return this.A06.A02(e4h);
    }

    public void release() {
        ImageReader imageReader = this.A03;
        if (imageReader != null) {
            imageReader.setOnImageAvailableListener((ImageReader.OnImageAvailableListener) null, (Handler) null);
            this.A03.close();
            this.A03 = null;
        }
        Image image = this.A00;
        if (image != null) {
            image.close();
            this.A00 = null;
        }
        this.A02 = null;
        this.A04 = null;
        this.A01 = null;
    }

    public void BBI(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            this.A06.A01(list.get(i));
        }
    }
}
