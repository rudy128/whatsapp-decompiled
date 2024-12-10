package X;

import java.io.File;
import java.io.IOException;

/* renamed from: X.Cnf  reason: case insensitive filesystem */
public abstract class C25871Cnf {
    public static long A00(File file) {
        int length;
        long j = 0;
        if (file.exists()) {
            if (file.isFile()) {
                return file.length();
            }
            if (file.isDirectory()) {
                try {
                    File[] listFiles = file.listFiles();
                    if (!(listFiles == null || (length = listFiles.length) == 0)) {
                        int i = 0;
                        do {
                            j += A00(listFiles[i]);
                            i++;
                        } while (i < length);
                    }
                } catch (Exception unused) {
                }
            }
        }
        return j;
    }

    public static C24915CPi A01(File file) {
        int length;
        if (file.exists()) {
            File file2 = file;
            try {
                if (file.getParent() != null) {
                    file2 = C17880vN.A0e(file.getParentFile().getCanonicalFile(), file.getName());
                }
                if (!file2.getCanonicalFile().equals(file2.getAbsoluteFile())) {
                }
            } catch (IOException unused) {
            }
            if (!file.isDirectory()) {
                return A02(file, false);
            }
            C24915CPi A02 = A02(file, true);
            if (!file.isDirectory()) {
                return A02;
            }
            try {
                File[] listFiles = file.listFiles();
                if (listFiles == null || (length = listFiles.length) == 0) {
                    return A02;
                }
                long j = A02.A00;
                long j2 = A02.A02;
                long j3 = A02.A01;
                int i = 0;
                do {
                    C24915CPi A01 = A01(listFiles[i]);
                    j += A01.A00;
                    j2 += A01.A02;
                    j3 += A01.A01;
                    i++;
                } while (i < length);
                return new C24915CPi(j, j2, j3);
            } catch (Exception unused2) {
                return A02;
            }
        }
        return new C24915CPi(0, 0, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0042, code lost:
        if (r8 == 0) goto L_0x0054;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002b */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[ExcHandler: ErrnoException | NoSuchMethodError (unused java.lang.Throwable), SYNTHETIC, Splitter:B:11:0x002b] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0056  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C24915CPi A02(java.io.File r12, boolean r13) {
        /*
            long r8 = r12.length()
            r4 = 0
            int r0 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0013
            r8 = 1
            X.CPi r3 = new X.CPi
            r6 = r4
            r3.<init>(r4, r6, r8)
            return r3
        L_0x0013:
            r6 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r0 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x0024
            r10 = 1
            X.CPi r3 = new X.CPi
            r5 = r3
            r8 = r6
            r5.<init>(r6, r8, r10)
            return r3
        L_0x0024:
            r2 = -1
            java.lang.String r0 = r12.getCanonicalPath()     // Catch:{ IOException -> 0x002b }
            goto L_0x002f
        L_0x002b:
            java.lang.String r0 = r12.getAbsolutePath()     // Catch:{ ErrnoException | NoSuchMethodError -> 0x0044, ErrnoException | NoSuchMethodError -> 0x0044 }
        L_0x002f:
            android.system.StructStat r0 = android.system.Os.lstat(r0)     // Catch:{ ErrnoException | NoSuchMethodError -> 0x0044, ErrnoException | NoSuchMethodError -> 0x0044 }
            long r10 = r0.st_blocks     // Catch:{ ErrnoException | NoSuchMethodError -> 0x0044, ErrnoException | NoSuchMethodError -> 0x0044 }
            r0 = 512(0x200, double:2.53E-321)
            long r10 = r10 * r0
            int r0 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x0044
            int r0 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x0054
            int r0 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0054
        L_0x0044:
            r0 = 1065353216(0x3f800000, float:1.0)
            float r1 = (float) r8
            float r1 = r1 * r0
            r0 = 1166016512(0x45800000, float:4096.0)
            float r1 = r1 / r0
            double r0 = (double) r1
            double r0 = java.lang.Math.ceil(r0)
            long r10 = (long) r0
            r0 = 4096(0x1000, double:2.0237E-320)
            long r10 = r10 * r0
        L_0x0054:
            if (r13 == 0) goto L_0x0058
            r8 = 0
        L_0x0058:
            r12 = 1
            X.CPi r3 = new X.CPi
            r7 = r3
            r7.<init>(r8, r10, r12)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25871Cnf.A02(java.io.File, boolean):X.CPi");
    }
}
