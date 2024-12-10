package X;

import android.net.Uri;
import android.util.SparseIntArray;
import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.A7j  reason: case insensitive filesystem */
public class C20105A7j {
    public final AnonymousClass195 A00;
    public final C218617r A01;
    public final AnonymousClass1L7 A02;
    public final AnonymousClass11C A03;
    public final C219217x A04;
    public final C19830z4 A05;
    public final AnonymousClass196 A06;
    public final AnonymousClass1CM A07;
    public final AtomicBoolean A08 = C108965cb.A0w();
    public final AnonymousClass190 A09;
    public final AnonymousClass1NM A0A;
    public final AnonymousClass11P A0B;
    public final AnonymousClass118 A0C;
    public final C18030ve A0D;
    public final AnonymousClass18K A0E;

    public static void A03(SparseIntArray sparseIntArray, C20105A7j a7j, int i) {
        if (sparseIntArray != null) {
            int i2 = sparseIntArray.get(i, 0);
            sparseIntArray.put(i, i2 + 1);
            if (i2 != 0) {
                return;
            }
        }
        if (i == 2 || i == 3 || i == 4 || i == 6) {
            AnonymousClass190 r3 = a7j.A09;
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("result=");
            r3.A0G("externaldirmigration/failed", AnonymousClass000.A0y(C17900vP.A08(Integer.valueOf(i)), A10), true);
        }
        C171068r7 r4 = new C171068r7();
        r4.A00 = Integer.valueOf(i);
        AnonymousClass00H r6 = a7j.A05.A00;
        r4.A01 = C108965cb.A0l(C17880vN.A0B(r6), "external_dir_migration_attempt_n", -1);
        r4.A04 = C108965cb.A0l(C17880vN.A0B(r6), "ext_dir_migration_rescan_time", -1);
        r4.A03 = C108965cb.A0l(C17880vN.A0B(r6), "ext_dir_migration_move_time", -1);
        r4.A02 = C108945cZ.A1B(System.currentTimeMillis(), C17890vO.A05(C17880vN.A0B(r6), "ext_dir_migration_start_time"));
        a7j.A0E.CC0(r4, (C18180vt) null, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004c, code lost:
        if ((!X.C17880vN.A0e(r24, ".nomedia").exists()) == false) goto L_0x004e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0129 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A00(android.util.SparseIntArray r25, X.C186419eA r26, X.C20105A7j r27, java.io.File r28, java.io.File r29, boolean r30) {
        /*
            r11 = r28
            boolean r0 = r11.exists()
            r1 = 0
            if (r0 == 0) goto L_0x002d
            java.lang.String r0 = ".migrated"
            java.io.File r17 = X.C17880vN.A0e(r11, r0)
            boolean r0 = r17.exists()
            r1 = 1
            if (r0 != 0) goto L_0x002d
            r24 = r29
            boolean r0 = r24.exists()
            r1 = 2
            r14 = r25
            r12 = r27
            if (r0 != 0) goto L_0x002e
            boolean r0 = r24.mkdir()
            if (r0 != 0) goto L_0x002e
            r0 = 3
            A03(r14, r12, r0)
        L_0x002d:
            return r1
        L_0x002e:
            java.lang.String r15 = " to="
            java.lang.String r1 = ".nomedia"
            java.io.File r0 = X.C17880vN.A0e(r11, r1)
            boolean r0 = r0.exists()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x004e
            r0 = r24
            java.io.File r0 = X.C17880vN.A0e(r0, r1)
            boolean r0 = r0.exists()
            r0 = r0 ^ 1
            r16 = 1
            if (r0 != 0) goto L_0x0050
        L_0x004e:
            r16 = 0
        L_0x0050:
            java.io.File[] r10 = r11.listFiles()
            java.lang.String r9 = "externaldirmigration/move/can't delete from="
            r23 = r30
            if (r10 == 0) goto L_0x0155
            int r8 = r10.length
            r7 = 0
            r6 = 0
        L_0x005d:
            if (r6 >= r8) goto L_0x012d
            r5 = r10[r6]
            java.lang.String r1 = r5.getName()
            r0 = r24
            java.io.File r4 = X.C17880vN.A0e(r0, r1)
            com.whatsapp.util.StatResult r1 = com.whatsapp.ExternalDirMigration$Utils.lstatOpenFile(r5)     // Catch:{ IOException -> 0x011d }
            if (r1 == 0) goto L_0x0129
            boolean r0 = r1.A05     // Catch:{ IOException -> 0x011d }
            r13 = r26
            if (r0 != 0) goto L_0x00af
            boolean r0 = r5.isDirectory()     // Catch:{ IOException -> 0x011d }
            if (r0 == 0) goto L_0x0090
            r19 = r13
            r21 = r5
            r22 = r4
            r18 = r14
            r20 = r12
            int r0 = A00(r18, r19, r20, r21, r22, r23)     // Catch:{ IOException -> 0x011d }
            if (r0 <= r7) goto L_0x0129
            r7 = r0
            goto L_0x0129
        L_0x0090:
            int r1 = r1.A01     // Catch:{ IOException -> 0x011d }
            r0 = 1
            if (r1 <= r0) goto L_0x00af
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ IOException -> 0x011d }
            java.lang.String r0 = "externaldirmigration/can't migrate "
            r2.append(r0)     // Catch:{ IOException -> 0x011d }
            r2.append(r5)     // Catch:{ IOException -> 0x011d }
            java.lang.String r0 = "(too many hard links: "
            r2.append(r0)     // Catch:{ IOException -> 0x011d }
            r2.append(r1)     // Catch:{ IOException -> 0x011d }
            java.lang.String r0 = ")"
            X.C17890vO.A19(r2, r0)     // Catch:{ IOException -> 0x011d }
            goto L_0x0125
        L_0x00af:
            boolean r0 = r4.exists()     // Catch:{ IOException -> 0x011d }
            if (r0 == 0) goto L_0x00cc
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ IOException -> 0x011d }
            java.lang.String r0 = "externaldirmigration/file already exists, to="
            X.C17900vP.A0Z(r4, r0, r1)     // Catch:{ IOException -> 0x011d }
            boolean r0 = r5.delete()     // Catch:{ IOException -> 0x011d }
            if (r0 != 0) goto L_0x0129
            java.lang.StringBuilder r0 = X.AnonymousClass000.A10()     // Catch:{ IOException -> 0x011d }
            X.C17900vP.A0Z(r5, r9, r0)     // Catch:{ IOException -> 0x011d }
            goto L_0x0125
        L_0x00cc:
            X.1NM r3 = r12.A0A     // Catch:{ IOException -> 0x011d }
            X.0ve r2 = r12.A0D     // Catch:{ IOException -> 0x011d }
            r1 = 11097(0x2b59, float:1.555E-41)
            X.0vf r0 = X.C18040vf.A02     // Catch:{ IOException -> 0x011d }
            boolean r0 = X.C18020vd.A05(r0, r2, r1)     // Catch:{ IOException -> 0x011d }
            boolean r0 = X.C64062u9.A0O(r3, r5, r4, r0)     // Catch:{ IOException -> 0x011d }
            if (r0 == 0) goto L_0x0101
            X.A7j r2 = r13.A00     // Catch:{ IOException -> 0x011d }
            java.util.List r3 = r13.A01     // Catch:{ IOException -> 0x011d }
            boolean r0 = r13.A03     // Catch:{ IOException -> 0x011d }
            java.util.concurrent.atomic.AtomicBoolean r5 = r13.A02     // Catch:{ IOException -> 0x011d }
            java.lang.String r1 = "scoped"
            if (r16 == 0) goto L_0x00ed
            r3.add(r4)     // Catch:{ IOException -> 0x011d }
        L_0x00ed:
            if (r0 == 0) goto L_0x0129
            boolean r0 = X.AnonymousClass8BV.A1Z(r5)     // Catch:{ IOException -> 0x011d }
            if (r0 == 0) goto L_0x0129
            X.1L7 r0 = r2.A02     // Catch:{ IOException -> 0x011d }
            r0.A0B(r1)     // Catch:{ IOException -> 0x011d }
            X.0z4 r1 = r2.A05     // Catch:{ IOException -> 0x011d }
            r0 = 2
            r1.A1C(r0)     // Catch:{ IOException -> 0x011d }
            goto L_0x0129
        L_0x0101:
            boolean r0 = r5.exists()     // Catch:{ IOException -> 0x011d }
            if (r0 == 0) goto L_0x0129
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ IOException -> 0x011d }
            java.lang.String r0 = "externaldirmigration/can't rename from="
            r1.append(r0)     // Catch:{ IOException -> 0x011d }
            r1.append(r5)     // Catch:{ IOException -> 0x011d }
            X.C17900vP.A0X(r4, r15, r1)     // Catch:{ IOException -> 0x011d }
            if (r30 != 0) goto L_0x0123
            r0 = 4
            A03(r14, r12, r0)     // Catch:{ IOException -> 0x011d }
            goto L_0x0123
        L_0x011d:
            r1 = move-exception
            java.lang.String r0 = "Failed to read a file"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0123:
            r7 = 2
            goto L_0x0129
        L_0x0125:
            r0 = 1
            if (r7 >= r0) goto L_0x0129
            r7 = 1
        L_0x0129:
            int r6 = r6 + 1
            goto L_0x005d
        L_0x012d:
            if (r7 == 0) goto L_0x0155
            r1 = 1
            r4 = 2
            if (r7 != r1) goto L_0x0154
            X.1L7 r0 = r12.A02
            boolean r0 = r0.A0C()
            if (r0 == 0) goto L_0x0154
            boolean r0 = r17.exists()     // Catch:{ IOException -> 0x0148 }
            if (r0 != 0) goto L_0x002d
            boolean r0 = r17.createNewFile()     // Catch:{ IOException -> 0x0148 }
            if (r0 == 0) goto L_0x0154
            return r1
        L_0x0148:
            r3 = move-exception
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r1 = "externaldirmigration/ensureFileExists failed to create "
            r0 = r17
            X.C108995ce.A1J(r0, r1, r2, r3)
        L_0x0154:
            return r4
        L_0x0155:
            boolean r0 = r11.delete()
            if (r0 != 0) goto L_0x016a
            java.lang.StringBuilder r0 = X.AnonymousClass000.A10()
            X.C17900vP.A0X(r11, r9, r0)
            if (r30 != 0) goto L_0x0168
            r0 = 6
            A03(r14, r12, r0)
        L_0x0168:
            r4 = 2
            return r4
        L_0x016a:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20105A7j.A00(android.util.SparseIntArray, X.9eA, X.A7j, java.io.File, java.io.File, boolean):int");
    }

    public static int A01(C20105A7j a7j) {
        int A002 = C17890vO.A00(C17890vO.A0B(a7j.A05), "external_dir_migration_stage");
        if (A002 >= 0 && A002 <= 5) {
            return A002;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("externaldirmigration/unexpected stage (");
        A10.append(A002);
        C17890vO.A19(A10, ") resetting to not started");
        return 0;
    }

    public C20105A7j(AnonymousClass195 r2, AnonymousClass190 r3, C218617r r4, AnonymousClass1L7 r5, AnonymousClass1NM r6, AnonymousClass11C r7, AnonymousClass11P r8, AnonymousClass118 r9, C219217x r10, C19830z4 r11, AnonymousClass196 r12, C18030ve r13, AnonymousClass18K r14, AnonymousClass1CM r15) {
        this.A0C = r9;
        this.A0B = r8;
        this.A0D = r13;
        this.A09 = r3;
        this.A01 = r4;
        this.A0E = r14;
        this.A02 = r5;
        this.A03 = r7;
        this.A06 = r12;
        this.A0A = r6;
        this.A04 = r10;
        this.A05 = r11;
        this.A07 = r15;
        this.A00 = r2;
    }

    public static void A02(Uri uri, AnonymousClass11C r6, File file) {
        try {
            AnonymousClass11B A0O = r6.A0O();
            C17960vV.A07(A0O);
            String[] A1Y = C17880vN.A1Y();
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append(file.getAbsolutePath());
            A1Y[0] = C17890vO.A0c(A10, '%');
            A0O.A01(uri, "_data LIKE ?", A1Y);
        } catch (RuntimeException e) {
            C108995ce.A1J(file, "externaldirmigration/unscan failed for ", AnonymousClass000.A10(), e);
        }
    }

    public static void A04(C20105A7j a7j, File file, List list, Set set) {
        File[] listFiles;
        if (file.exists() && (listFiles = file.listFiles()) != null) {
            boolean z = !C17880vN.A0e(file, ".nomedia").exists();
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    if (set.add(file2)) {
                        A04(a7j, file2, list, set);
                    }
                } else if (z) {
                    list.add(file2);
                }
            }
        }
    }
}
