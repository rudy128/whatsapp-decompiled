package X;

import android.content.ContentResolver;
import android.content.Context;
import com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl;
import java.util.Set;
import java.util.concurrent.CancellationException;

public abstract class C90 {
    public static C25696CkR A00() {
        C26764DCt dCt;
        C26141Ct4 ct4 = C26141Ct4.A0G;
        C26208Cuj.A02(ct4, "ImagePipelineFactory was not initialized!");
        C25696CkR ckR = C26141Ct4.A0F;
        if (ckR != null) {
            return ckR;
        }
        CancellationException cancellationException = C25696CkR.A0F;
        C26220Cv8 cv8 = ct4.A03;
        if (cv8 == null) {
            CUW cuw = ct4.A0D;
            Context context = cuw.A01;
            ContentResolver contentResolver = context.getApplicationContext().getContentResolver();
            C25239Cba cba = ct4.A02;
            if (cba == null) {
                CPV cpv = cuw.A0G;
                CZI czi = cuw.A0J;
                BSI bsi = czi.A01;
                if (bsi == null) {
                    CTW ctw = czi.A07;
                    bsi = new BSI(ctw.A00, ctw.A04, ctw.A07);
                    czi.A01 = bsi;
                }
                E4U e4u = ct4.A04;
                if (e4u == null) {
                    C26764DCt dCt2 = null;
                    AnimatedFactoryV2Impl A00 = C26141Ct4.A00(ct4);
                    if (A00 != null) {
                        dCt2 = new C26764DCt(A00, 1);
                        dCt = new C26764DCt(A00, 0);
                    } else {
                        dCt = null;
                    }
                    C26134Csx csx = ct4.A05;
                    if (csx == null) {
                        csx = C9F.A00(czi, cpv.A02);
                        ct4.A05 = csx;
                    }
                    e4u = new C26765DCu(dCt2, dCt, csx);
                    ct4.A04 = e4u;
                }
                C9C c9c = cuw.A0I;
                C24272ByV byV = cuw.A0E;
                boolean z = cuw.A0Q;
                E18 e18 = cuw.A0F;
                C25052CVg A01 = czi.A01(cuw.A00);
                czi.A00();
                C26756DCl dCl = ct4.A01;
                if (dCl == null) {
                    dCl = new C26756DCl(ct4.A04(), new C26758DCn(cuw.A0D, 1));
                    ct4.A01 = dCl;
                }
                C26756DCl A05 = ct4.A05();
                E4K e4k = ct4.A0B;
                C24661CEb cEb = cuw.A0A;
                C25026CUc A03 = ct4.A03();
                C24777CJu cJu = ct4.A0C;
                C108985cd.A1D(c9c, byV);
                C18070vi.A0d(e18, 7);
                C18070vi.A0d(e4k, 12);
                C18070vi.A0d(cEb, 13);
                C18070vi.A0d(cJu, 19);
                cba = new C25239Cba(context, e4k, A03, cEb, dCl, A05, cJu, byV, e18, e4u, c9c, bsi, A01, z);
                ct4.A02 = cba;
            }
            C25946CpE cpE = cuw.A0K;
            boolean z2 = cuw.A0Q;
            CNH cnh = ct4.A0E;
            C24272ByV byV2 = cuw.A0E;
            boolean z3 = cuw.A0P;
            E4X e4x = ct4.A06;
            if (e4x == null) {
                e4x = new DDO(cuw.A0L);
                ct4.A06 = e4x;
            }
            cv8 = new C26220Cv8(contentResolver, byV2, cba, cpE, cnh, e4x, cuw.A0M, z2, z3);
            ct4.A03 = cv8;
        }
        CUW cuw2 = ct4.A0D;
        Set set = cuw2.A0O;
        Set set2 = cuw2.A0N;
        E4K e4k2 = cuw2.A07;
        C26756DCl dCl2 = ct4.A01;
        if (dCl2 == null) {
            dCl2 = new C26756DCl(ct4.A04(), new C26758DCn(cuw2.A0D, 1));
            ct4.A01 = dCl2;
        }
        C26756DCl A052 = ct4.A05();
        E4K e4k3 = ct4.A0B;
        C24661CEb cEb2 = cuw2.A0A;
        CNH cnh2 = ct4.A0E;
        CPV cpv2 = cuw2.A0G;
        C25696CkR ckR2 = new C25696CkR(e4k2, e4k3, cpv2.A01, cpv2.A00, cEb2, dCl2, A052, cuw2, cv8, cnh2, set, set2);
        C26141Ct4.A0F = ckR2;
        return ckR2;
    }
}
