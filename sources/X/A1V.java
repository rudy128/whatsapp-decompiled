package X;

import android.content.Context;
import java.io.File;

public final class A1V {
    public final AnonymousClass118 A00;
    public final AnonymousClass00H A01;

    public static final File[] A00(AnonymousClass118 r7) {
        File[] fileArr;
        C18070vi.A0d(r7, 0);
        File A0e = C17880vN.A0e(C108945cZ.A16(r7), "traces");
        if (!A0e.exists() || (fileArr = A0e.listFiles(new C21335AiL(1))) == null) {
            fileArr = new File[0];
        }
        if (fileArr.length != 0) {
            return fileArr;
        }
        String[] A1Z = C17880vN.A1Z();
        A1Z[0] = "traces.txt";
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("traces_");
        A10.append("com.whatsapp");
        A1Z[1] = AnonymousClass000.A0y(".txt", A10);
        int i = 0;
        do {
            File A0u = AnonymousClass8BR.A0u("/data/anr/", A1Z[i]);
            if (A0u.exists()) {
                return new File[]{A0u};
            }
            i++;
        } while (i < 2);
        return new File[0];
    }

    public final File A02(String str, String str2, String str3) {
        String A012;
        C18070vi.A0d(str2, 1);
        StringBuilder sb = new StringBuilder(str2);
        Context context = this.A00.A00;
        if (C17980vY.A02(context) && (A012 = C17980vY.A01(context)) != null) {
            sb.append("_");
            sb.append(A012);
        }
        String A0y = AnonymousClass000.A0y(".stacktrace", sb);
        C18070vi.A0X(A0y);
        File A013 = A01(str, A0y);
        if (str3 != null) {
            ((C190029kG) this.A01.get()).A00(C223919s.A00, str3);
        }
        return A013;
    }

    public A1V(AnonymousClass118 r1, AnonymousClass00H r2) {
        C18070vi.A0j(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0043, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0040, code lost:
        X.CDX.A00(r2, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.io.File A01(java.lang.String r5, java.lang.String r6) {
        /*
            r4 = this;
            X.C18070vi.A0h(r5, r6)
            X.118 r1 = r4.A00
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            java.io.File r1 = X.C108945cZ.A16(r1)
            java.lang.String r0 = "traces"
            java.io.File r0 = X.C17880vN.A0e(r1, r0)
            X.AnonymousClass8BV.A1H(r0)
            java.io.File r3 = X.C17880vN.A0e(r0, r6)
            java.io.FileOutputStream r0 = X.C108945cZ.A19(r3)
            java.io.PrintWriter r2 = new java.io.PrintWriter
            r2.<init>(r0)
            r2.write(r5)     // Catch:{ all -> 0x003d }
            r2.flush()     // Catch:{ all -> 0x003d }
            r2.close()
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "anr-helper/stored anr report: "
            r1.append(r0)
            java.lang.String r0 = r3.getName()
            X.C17890vO.A1A(r1, r0)
            return r3
        L_0x003d:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x003f }
        L_0x003f:
            r0 = move-exception
            X.CDX.A00(r2, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A1V.A01(java.lang.String, java.lang.String):java.io.File");
    }

    public final void A03(File file) {
        StringBuilder A0K = C18070vi.A0K(file);
        A0K.append("anr-helper/discarding anr report: ");
        C17890vO.A1A(A0K, file.getName());
        file.delete();
        String A002 = AnonymousClass9P5.A00(AnonymousClass8BS.A0i(file));
        if (A002 != null) {
            C17880vN.A1B(C17890vO.A0A(((C190029kG) this.A01.get()).A01), AnonymousClass001.A1H("running_tasks_", A002, AnonymousClass000.A10()));
        }
    }
}
