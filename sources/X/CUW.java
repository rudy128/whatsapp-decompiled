package X;

import android.app.ActivityManager;
import android.content.Context;
import java.util.Set;

public final class CUW {
    public final int A00;
    public final Context A01;
    public final CTD A02;
    public final CTD A03;
    public final E4K A04;
    public final E4K A05;
    public final E4K A06;
    public final E4K A07;
    public final C28431E0x A08;
    public final C9A A09;
    public final C24661CEb A0A;
    public final E16 A0B;
    public final E16 A0C;
    public final C24662CEc A0D;
    public final C24272ByV A0E;
    public final E18 A0F;
    public final CPV A0G;
    public final C9B A0H;
    public final C9C A0I;
    public final CZI A0J;
    public final C25946CpE A0K;
    public final Integer A0L;
    public final Set A0M;
    public final Set A0N;
    public final Set A0O;
    public final boolean A0P;
    public final boolean A0Q;
    public final E4K A0R;

    /* JADX WARNING: type inference failed for: r0v5, types: [java.lang.Object, X.E16] */
    /* JADX WARNING: type inference failed for: r0v6, types: [java.lang.Object, X.E16] */
    /* JADX WARNING: type inference failed for: r0v11, types: [X.E4K, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v31, types: [X.C9C, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v40, types: [java.lang.Object, X.C9A] */
    /* JADX WARNING: type inference failed for: r1v11, types: [java.lang.Object, X.C3H] */
    /* JADX WARNING: type inference failed for: r0v43, types: [java.lang.Object, X.DBF] */
    /* JADX WARNING: type inference failed for: r0v45, types: [X.CEc, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v46, types: [X.CEb, java.lang.Object] */
    public CUW(CTF ctf) {
        C24661CEb cEb;
        C24662CEc cEc;
        CTD ctd;
        DBF dbf;
        C25946CpE cpE;
        if (C26212Cuq.A04()) {
            C26212Cuq.A03("ImagePipelineConfig()");
        }
        this.A0G = new CPV(ctf.A06);
        Context context = ctf.A05;
        Object systemService = context.getSystemService("activity");
        if (systemService != null) {
            this.A04 = new DBC((ActivityManager) systemService);
            this.A0B = new Object();
            this.A0C = new Object();
            synchronized (C24661CEb.class) {
                C24661CEb cEb2 = C24661CEb.A00;
                cEb = cEb2;
                if (cEb2 == null) {
                    ? obj = new Object();
                    C24661CEb.A00 = obj;
                    cEb = obj;
                }
            }
            this.A0A = cEb;
            this.A01 = context;
            this.A0E = ctf.A00;
            this.A06 = new Object();
            synchronized (C24662CEc.class) {
                C24662CEc cEc2 = C24662CEc.A00;
                cEc = cEc2;
                if (cEc2 == null) {
                    ? obj2 = new Object();
                    C24662CEc.A00 = obj2;
                    cEc = obj2;
                }
            }
            this.A0D = cEc;
            E4K e4k = C24697CGj.A00;
            C18070vi.A0Z(e4k);
            this.A0R = e4k;
            this.A0L = ctf.A02;
            E4K e4k2 = C24697CGj.A01;
            C18070vi.A0Z(e4k2);
            this.A07 = e4k2;
            if (!C26212Cuq.A04()) {
                ctd = new CTD(new CPJ(context));
            } else {
                C26212Cuq.A03("DiskCacheConfig.getDefaultMainDiskCacheConfig");
                try {
                    ctd = new CTD(new CPJ(context));
                } finally {
                    C26212Cuq.A01();
                }
            }
            this.A02 = ctd;
            synchronized (DBF.class) {
                DBF dbf2 = DBF.A00;
                dbf = dbf2;
                if (dbf2 == null) {
                    ? obj3 = new Object();
                    DBF.A00 = obj3;
                    dbf = obj3;
                }
            }
            this.A08 = dbf;
            this.A00 = C72463Mc.A0B(ctf.A03);
            if (!C26212Cuq.A04()) {
                cpE = new C25946CpE(30000);
            } else {
                C26212Cuq.A03("ImagePipelineConfig->mNetworkFetcher");
                cpE = new C25946CpE(30000);
                C26212Cuq.A01();
            }
            this.A0K = cpE;
            new Object();
            CZI czi = new CZI(new CTW());
            this.A0J = czi;
            this.A0I = new Object();
            C25511Om r0 = C25511Om.A00;
            this.A0O = r0;
            this.A0N = r0;
            this.A0M = r0;
            this.A0Q = true;
            this.A03 = this.A02;
            this.A0F = new C26762DCr(czi.A07.A02.A00);
            this.A0P = ctf.A04;
            this.A0H = ctf.A01;
            this.A09 = new Object();
            this.A05 = new DBA(new Object(), this);
            C26212Cuq.A00();
            return;
        }
        throw AnonymousClass000.A0n("Required value was null.");
    }
}
