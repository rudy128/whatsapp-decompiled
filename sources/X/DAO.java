package X;

import java.io.File;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

public class DAO implements C28590E9f {
    public static final long A05 = TimeUnit.MINUTES.toMillis(30);
    public final E4N A00;
    public final File A01;
    public final File A02;
    public final CET A03;
    public final boolean A04;

    public File A02(String str) {
        String valueOf = String.valueOf(Math.abs(str.hashCode() % 100));
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(this.A02);
        String str2 = File.separator;
        return C108945cZ.A17(AnonymousClass000.A0y(".cnt", C17900vP.A0H(AnonymousClass001.A1H(str2, valueOf, A10), str2, str)));
    }

    public /* bridge */ /* synthetic */ Collection BRL() {
        DB6 db6 = new DB6(this);
        A01(db6, this.A02);
        return Collections.unmodifiableList(db6.A00);
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.CPI BdZ(java.lang.Object r5, java.lang.String r6) {
        /*
            r4 = this;
            java.lang.String r3 = ".tmp"
            java.io.File r2 = A00(r4, r6)
            boolean r0 = r2.exists()
            if (r0 != 0) goto L_0x000f
            X.C24544C8p.A00(r2)     // Catch:{ BxI -> 0x0023 }
        L_0x000f:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r6)     // Catch:{  }
            java.lang.String r0 = "."
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{  }
            java.io.File r1 = java.io.File.createTempFile(r0, r3, r2)     // Catch:{  }
            X.CPI r0 = new X.CPI     // Catch:{  }
            r0.<init>(r4, r1, r6)     // Catch:{  }
            return r0
        L_0x0023:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DAO.BdZ(java.lang.Object, java.lang.String):X.CPI");
    }

    public void CCy() {
        A01(new DB7(this), this.A01);
    }

    public long CEU(CWT cwt) {
        File file = cwt.A02.A00;
        if (!file.exists()) {
            return 0;
        }
        long length = file.length();
        if (!file.delete()) {
            return -1;
        }
        return length;
    }

    public boolean isExternal() {
        return this.A04;
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public DAO(X.CET r6, java.io.File r7) {
        /*
            r5 = this;
            r5.<init>()
            r5.A01 = r7
            r2 = 0
            java.io.File r0 = android.os.Environment.getExternalStorageDirectory()     // Catch:{  }
            if (r0 == 0) goto L_0x0018
            java.lang.String r1 = r0.toString()     // Catch:{  }
            java.lang.String r0 = r7.getCanonicalPath()     // Catch:{ Exception -> 0x0018 }
            boolean r2 = r0.contains(r1)     // Catch:{ Exception -> 0x0018 }
        L_0x0018:
            r5.A04 = r2
            r4 = 1
            r3 = 0
            java.lang.Object[] r2 = X.AnonymousClass8BR.A1a()
            r1 = 0
            java.lang.String r0 = "v2"
            r2[r1] = r0
            r0 = 100
            X.C17880vN.A1T(r2, r0, r4)
            X.BE8.A1M(r2, r4)
            java.lang.String r0 = "%s.ols%d.%d"
            java.lang.String r0 = java.lang.String.format(r3, r0, r2)
            java.io.File r0 = X.C17880vN.A0e(r7, r0)
            r5.A02 = r0
            r5.A03 = r6
            java.io.File r1 = r5.A01
            boolean r0 = r1.exists()
            if (r0 == 0) goto L_0x004e
            java.io.File r0 = r5.A02
            boolean r0 = r0.exists()
            if (r0 != 0) goto L_0x0053
            X.C24543C8o.A00(r1)
        L_0x004e:
            java.io.File r0 = r5.A02     // Catch:{ BxI -> 0x0053 }
            X.C24544C8p.A00(r0)     // Catch:{ BxI -> 0x0053 }
        L_0x0053:
            X.DBM r0 = X.DBM.A00
            r5.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DAO.<init>(X.CET, java.io.File):void");
    }

    public static File A00(DAO dao, String str) {
        String valueOf = String.valueOf(Math.abs(str.hashCode() % 100));
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(dao.A02);
        return C108945cZ.A17(AnonymousClass001.A1H(File.separator, valueOf, A10));
    }

    public static void A01(C28575E8i e8i, File file) {
        e8i.CCC(file);
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    A01(e8i, file2);
                } else {
                    e8i.CRt(file2);
                }
            }
        }
        e8i.CC5(file);
    }

    public C25100CXt BYI(Object obj, String str) {
        File A022 = A02(str);
        if (!A022.exists()) {
            return null;
        }
        A022.setLastModified(this.A00.now());
        return new C25100CXt(A022);
    }
}
