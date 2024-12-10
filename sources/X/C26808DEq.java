package X;

import android.graphics.Matrix;
import android.os.Handler;
import android.view.View;
import java.io.File;
import java.util.UUID;

/* renamed from: X.DEq  reason: case insensitive filesystem */
public class C26808DEq implements C28614EAk {
    public C25556Chu A00;
    public C28611EAf A01;
    public UUID A02;
    public Handler A03;
    public UUID A04;
    public final AnonymousClass86M A05 = new DEL(this, 2);
    public final C26035Cqv A06;
    public final C28614EAk A07;

    public boolean BIp(C6E c6e) {
        C26035Cqv cqv = this.A06;
        if (!cqv.A05(this.A04)) {
            if (this.A02 == null) {
                C28611EAf eAf = this.A01;
                int i = C26175Cts.A00;
                if (eAf != null) {
                    C26175Cts.A01.A02(eAf);
                }
                this.A01 = null;
                this.A02 = null;
            }
            return false;
        }
        cqv.A04(this.A05);
        this.A02 = this.A04;
        return this.A07.BIp(new C22897BUi(this, c6e, 3));
    }

    public boolean A00() {
        if (this.A04 != null) {
            C26035Cqv cqv = this.A06;
            if (!cqv.A04 || !this.A04.equals(cqv.A03)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public void BBB(CJP cjp) {
        this.A07.BBB(cjp);
    }

    public void BBF(BCw bCw) {
        this.A07.BBF(bCw);
    }

    public void BBU(E4h e4h) {
        if (A00()) {
            this.A07.BBU(e4h);
            return;
        }
        throw new C27206DZg("Cannot add OnPreviewFrameListener listener.");
    }

    public void BBV(E4i e4i) {
        this.A07.BBV(e4i);
    }

    public int BDs(int i, int i2) {
        return this.A07.BDs(i, i2);
    }

    public void BFe(C6E c6e, EBS ebs, C28611EAf eAf, C25119CYs cYs, String str, int i, int i2) {
        C26035Cqv cqv = this.A06;
        Handler handler = this.A03;
        String str2 = str;
        this.A04 = cqv.A03(handler, str2);
        cqv.A04(this.A05);
        C28611EAf eAf2 = eAf;
        this.A01 = eAf;
        int i3 = C26175Cts.A00;
        if (eAf != null) {
            C26175Cts.A01.A01(eAf);
        }
        this.A07.BFe(new C22897BUi(this, c6e, 2), ebs, eAf2, cYs, str2, i, i2);
        if (this.A04 != cqv.A03) {
            this.A04 = cqv.A03(handler, str2);
        }
    }

    public C25632CjI BOK() {
        C25556Chu chu = this.A00;
        if (chu != null) {
            return chu.A01;
        }
        throw new C27206DZg("Cannot get camera capabilities.");
    }

    public int BZ0() {
        return this.A07.BZ0();
    }

    public C25971Cpe BZ5() {
        C25556Chu chu = this.A00;
        if (chu != null) {
            return chu.A02;
        }
        throw new C27206DZg("Cannot get current camera settings.");
    }

    public boolean BcX(int i) {
        return this.A07.BcX(i);
    }

    public void BdT(Matrix matrix, int i, int i2, int i3) {
        this.A07.BdT(matrix, i, i2, i3);
    }

    public boolean Bgf() {
        return this.A07.Bgf();
    }

    public boolean Bil(float[] fArr) {
        return this.A07.Bil(fArr);
    }

    public void Bk3(C6E c6e, C25093CXe cXe) {
        if (!A01(c6e, "Cannot modify settings.")) {
            this.A07.Bk3(c6e, cXe);
        }
    }

    public void BkU() {
        this.A07.BkU();
    }

    public void Bzj(int i) {
        this.A07.Bzj(i);
    }

    public void CDk(View view, String str) {
        this.A07.CDk(view, str);
    }

    public void CEi(CJP cjp) {
        this.A07.CEi(cjp);
    }

    public void CEl(BCw bCw) {
        this.A07.CEl(bCw);
    }

    public void CEt(E4i e4i) {
        this.A07.CEt(e4i);
    }

    public void CIC(Handler handler) {
        this.A07.CIC(handler);
    }

    public void CIz(C28500E4g e4g) {
        this.A07.CIz(e4g);
    }

    public void CJQ(boolean z) {
        this.A07.CJQ(z);
    }

    public void CJh(AnonymousClass86M r2) {
        this.A07.CJh(r2);
    }

    public void CK5(C6E c6e, int i) {
        if (!A01(c6e, "Cannot set display rotation.")) {
            this.A07.CK5(c6e, i);
        }
    }

    public void CLX(C6E c6e, int i) {
        if (!A01(c6e, "Cannot set zoom level.")) {
            this.A07.CLX(c6e, i);
        }
    }

    public boolean CLb(Matrix matrix, int i, int i2, int i3, int i4, boolean z) {
        return this.A07.CLb(matrix, i, i2, i3, i4, z);
    }

    public void COR(C6E c6e, File file) {
        if (!A01(c6e, "Cannot start video recording.")) {
            this.A07.COR(c6e, file);
        }
    }

    public void COc(C6E c6e) {
        if (!A01(c6e, "Cannot stop video recording")) {
            this.A07.COc(c6e);
        }
    }

    public void COv(C6E c6e) {
        if (!A01(c6e, "Cannot switch camera.")) {
            C25556Chu chu = this.A00;
            this.A00 = null;
            this.A07.COv(new C22899BUk(c6e, chu, this, 2));
        }
    }

    public int getCameraFacing() {
        C25556Chu chu = this.A00;
        if (chu != null) {
            return chu.A00;
        }
        throw new C27206DZg("Cannot get current camera facing value.");
    }

    public int getZoomLevel() {
        return this.A07.getZoomLevel();
    }

    public C26808DEq(Handler handler, C28614EAk eAk, C26035Cqv cqv) {
        this.A03 = handler;
        this.A07 = eAk;
        this.A06 = cqv;
    }

    public boolean A01(C6E c6e, String str) {
        if (A00()) {
            return false;
        }
        if (c6e == null) {
            return true;
        }
        c6e.A00(new C27206DZg(str));
        return true;
    }

    public void BLR(int i, int i2) {
        if (A00()) {
            this.A07.BLR(i, i2);
        }
    }

    public boolean Bfx() {
        if (!isConnected() || this.A07.Bfx()) {
            return true;
        }
        return false;
    }

    public boolean Bg9() {
        if (!isConnected() || !this.A07.Bg9()) {
            return false;
        }
        return true;
    }

    public void CEs(E4h e4h) {
        if (isConnected()) {
            this.A07.CEs(e4h);
        }
    }

    public void CNU(float f) {
        if (A00()) {
            this.A07.CNU(f);
        }
    }

    public void CNa(C6E c6e, int i, int i2) {
        if (A00()) {
            this.A07.CNa(c6e, i, i2);
        }
    }

    public void CP1(E9C e9c, C25729Ckz ckz) {
        if (!A00()) {
            e9c.Bsw(new C27206DZg("Cannot take a photo."));
        } else {
            this.A07.CP1(e9c, ckz);
        }
    }

    public boolean isConnected() {
        if (!A00() || this.A00 == null || !this.A07.isConnected()) {
            return false;
        }
        return true;
    }
}
