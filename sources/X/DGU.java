package X;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.net.Uri;
import android.opengl.GLES20;
import android.opengl.GLUtils;

public class DGU implements EDQ {
    public int A00;
    public int A01;
    public Bitmap.Config A02;
    public Uri A03;
    public DRN A04;
    public CZB A05;
    public C24861CNe A06 = null;
    public C28559E7l A07;
    public C24249By7 A08;
    public CYF A09;
    public boolean A0A;
    public boolean A0B = false;
    public C25739Cl9 A0C;
    public C25739Cl9 A0D;
    public final RectF A0E = new RectF(0.0f, 0.0f, 1.0f, 1.0f);
    public final CPT A0F;
    public final C25523ChL A0G;
    public final float[] A0H;
    public volatile CVG A0I;

    public static void A00(DGU dgu, boolean z) {
        CZB czb;
        dgu.A0A = true;
        if (z && (czb = dgu.A05) != null) {
            czb.A01();
            dgu.A05 = null;
        }
        DRN drn = dgu.A04;
        if (drn != null) {
            drn.close();
        }
        dgu.A04 = null;
        dgu.A08 = null;
    }

    public boolean Bfc() {
        return true;
    }

    public void C84(C25998CqE cqE) {
        A00(this, true);
        this.A0D = C25998CqE.A00(cqE, 2132017197, 2132017193);
        try {
            int[] A1X = BE6.A1X();
            A1X[0] = 2132017179;
            String A012 = C25998CqE.A01(cqE, 2132017214);
            String A013 = C25998CqE.A01(cqE, 2132017213);
            StringBuilder A0u = BE6.A0u(A012);
            StringBuilder A0u2 = BE6.A0u(A013);
            String A014 = C25998CqE.A01(cqE, A1X[0]);
            A0u.append("\n");
            A0u.append(A014);
            this.A0C = cqE.A03(AnonymousClass001.A1H("\n", A014, A0u2), A0u.toString(), false);
        } catch (RuntimeException e) {
            C26294Cx6.A0A("LiteOverlayRenderer", "Could not compile HDR shader", e);
        }
    }

    public void C85() {
        A00(this, true);
        C25739Cl9 cl9 = this.A0D;
        if (cl9 != null) {
            cl9.A02();
            this.A0D = null;
        }
        C25739Cl9 cl92 = this.A0C;
        if (cl92 != null) {
            cl92.A02();
            this.A0C = null;
        }
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.CYF, java.lang.Object] */
    public DGU(Uri uri, C28559E7l e7l) {
        ? obj = new Object();
        obj.A00 = uri;
        obj.A01 = new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};
        float[] fArr = new float[16];
        this.A0H = fArr;
        this.A07 = e7l;
        this.A09 = obj;
        float[] fArr2 = obj.A01;
        C26159CtX.A01(fArr2);
        C25523ChL chL = new C25523ChL(fArr2);
        this.A0G = chL;
        this.A0F = C25523ChL.A00(C25555Cht.A00(chL, fArr), new float[]{0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f});
        this.A03 = uri;
        this.A0A = true;
    }

    public String BY8() {
        return "LiteOverlayRenderer";
    }

    public boolean BsM(C25599Cie cie, long j) {
        C25739Cl9 cl9;
        C24861CNe cNe = this.A06;
        if (cNe != null && cNe.A01 == AnonymousClass00R.A01) {
            return true;
        }
        CZB czb = cie.A01;
        if (czb != null) {
            if (!czb.A02.A02 || (cl9 = this.A0C) == null) {
                cl9 = this.A0D;
            } else {
                this.A0B = true;
            }
            C28111Yx.A02(cl9);
            if (cl9 == null) {
                CVG cvg = this.A0I;
                if (cvg != null) {
                    cvg.A00();
                }
                throw AnonymousClass000.A0k("Null program provided to overlay");
            }
            if (this.A0A) {
                CYF cyf = this.A09;
                if (cyf.A00 != null) {
                    A00(this, true);
                    Uri uri = cyf.A00;
                    if (uri != null) {
                        C28559E7l e7l = this.A07;
                        C28111Yx.A02(e7l);
                        DRN Bhn = e7l.Bhn(uri);
                        C24249By7 by7 = C24249By7.StaticImage;
                        this.A08 = by7;
                        if (Bhn != null) {
                            this.A04 = Bhn;
                            Bitmap bitmap = (Bitmap) Bhn.A05();
                            if (this.A05 == null || bitmap.getWidth() != this.A01 || bitmap.getHeight() != this.A00 || bitmap.getConfig() != this.A02 || this.A05.A02.A02 != this.A0B) {
                                CZB czb2 = this.A05;
                                if (czb2 != null) {
                                    czb2.A01();
                                }
                                C25008CTi cTi = new C25008CTi("LiteOverlayRenderer");
                                BEB.A0p(cTi.A08);
                                cTi.A04 = bitmap;
                                cTi.A07 = this.A0B;
                                this.A05 = new CZB(cTi);
                                this.A01 = bitmap.getWidth();
                                this.A00 = bitmap.getHeight();
                                this.A02 = bitmap.getConfig();
                            } else if (!bitmap.isRecycled()) {
                                GLES20.glBindTexture(3553, this.A05.A00);
                                GLUtils.texImage2D(3553, 0, bitmap, 0);
                                GLES20.glBindTexture(3553, 0);
                            } else {
                                throw AnonymousClass8BR.A0w("bitmap is recycled");
                            }
                            if (this.A08 == by7) {
                                this.A0A = false;
                            }
                        } else {
                            throw BEA.A0c(uri, "Fail to load image for ", AnonymousClass000.A10());
                        }
                    }
                }
            }
            if (this.A05 != null) {
                GLES20.glEnable(3042);
                C26058CrU.A01("GL_BLEND");
                GLES20.glBlendFunc(1, 771);
                GLES20.glBlendEquation(32774);
                C26058CrU.A01("blendFunc");
                C25710Ckg A012 = cl9.A01();
                A012.A02("uSceneMatrix", cie.A03);
                A012.A02("uRotationMatrix", this.A0H);
                A012.A01(this.A05, "sOverlay");
                C25739Cl9.A00(this.A0F, A012.A00);
                DRN drn = this.A04;
                if (drn == null) {
                    return true;
                }
                drn.close();
                this.A04 = null;
                return true;
            }
            CVG cvg2 = this.A0I;
            if (cvg2 == null) {
                return false;
            }
            cvg2.A00();
            return false;
        }
        throw AnonymousClass000.A0n("MutableVideoFrame not initialized, missing rgbTexture");
    }

    public boolean isEnabled() {
        return AnonymousClass000.A1W(this.A09.A00);
    }

    public void CHu(CVG cvg) {
        this.A0I = cvg;
    }

    public void CIi(C24861CNe cNe) {
        this.A06 = cNe;
    }

    public void C83(int i, int i2) {
    }
}
