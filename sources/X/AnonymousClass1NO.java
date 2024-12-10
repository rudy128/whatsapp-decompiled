package X;

import java.io.File;

/* renamed from: X.1NO  reason: invalid class name */
public final class AnonymousClass1NO {
    public final AnonymousClass118 A00;

    public AnonymousClass1NO(AnonymousClass118 r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        X.CDX.A00(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0062, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C59282m3 A00() {
        /*
            r9 = this;
            java.lang.String r6 = "encb/EncBackupLocalStorage/failed to load password data"
            X.118 r0 = r9.A00
            android.content.Context r0 = r0.A00
            java.io.File r2 = r0.getFilesDir()
            java.lang.String r0 = "password_data.key"
            java.io.File r1 = new java.io.File
            r1.<init>(r2, r0)
            boolean r0 = r1.exists()
            r8 = 0
            if (r0 == 0) goto L_0x0067
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ IOException | ClassNotFoundException -> 0x0063 }
            r0.<init>(r1)     // Catch:{ IOException | ClassNotFoundException -> 0x0063 }
            java.io.ObjectInputStream r7 = new java.io.ObjectInputStream     // Catch:{ IOException | ClassNotFoundException -> 0x0063 }
            r7.<init>(r0)     // Catch:{ IOException | ClassNotFoundException -> 0x0063 }
            int r1 = r7.readInt()     // Catch:{ all -> 0x005c }
            r0 = 1
            if (r0 != r1) goto L_0x0058
            java.lang.Object r5 = r7.readObject()     // Catch:{ all -> 0x005c }
            byte[] r5 = (byte[]) r5     // Catch:{ all -> 0x005c }
            if (r5 == 0) goto L_0x0058
            int r0 = r5.length     // Catch:{ all -> 0x005c }
            r1 = 64
            if (r1 != r0) goto L_0x0058
            java.lang.Object r4 = r7.readObject()     // Catch:{ all -> 0x005c }
            byte[] r4 = (byte[]) r4     // Catch:{ all -> 0x005c }
            if (r4 == 0) goto L_0x0058
            int r0 = r4.length     // Catch:{ all -> 0x005c }
            if (r1 != r0) goto L_0x0058
            int r3 = r7.readInt()     // Catch:{ all -> 0x005c }
            X.9pc r2 = new X.9pc     // Catch:{ all -> 0x005c }
            r2.<init>(r5)     // Catch:{ all -> 0x005c }
            X.9pc r1 = new X.9pc     // Catch:{ all -> 0x005c }
            r1.<init>(r4)     // Catch:{ all -> 0x005c }
            X.2m3 r0 = new X.2m3     // Catch:{ all -> 0x005c }
            r0.<init>(r2, r1, r3)     // Catch:{ all -> 0x005c }
            r7.close()     // Catch:{ IOException | ClassNotFoundException -> 0x0063 }
            return r0
        L_0x0058:
            r7.close()     // Catch:{ IOException | ClassNotFoundException -> 0x0063 }
            return r8
        L_0x005c:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x005e }
        L_0x005e:
            r0 = move-exception
            X.CDX.A00(r7, r1)     // Catch:{ IOException | ClassNotFoundException -> 0x0063 }
            throw r0     // Catch:{ IOException | ClassNotFoundException -> 0x0063 }
        L_0x0063:
            r0 = move-exception
            com.whatsapp.util.Log.e(r6, r0)
        L_0x0067:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1NO.A00():X.2m3");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004f, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0052, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0053, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0056, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(X.C59282m3 r8) {
        /*
            r7 = this;
            X.9pc r0 = r8.A01
            byte[] r6 = r0.A00
            int r3 = r6.length
            r2 = 0
            r5 = 1
            r1 = 64
            r0 = 0
            if (r3 != r1) goto L_0x000d
            r0 = 1
        L_0x000d:
            X.C17960vV.A0C(r0)
            X.9pc r0 = r8.A02
            byte[] r4 = r0.A00
            int r0 = r4.length
            if (r0 != r1) goto L_0x0018
            r2 = 1
        L_0x0018:
            X.C17960vV.A0C(r2)
            X.118 r0 = r7.A00
            android.content.Context r0 = r0.A00
            java.io.File r2 = r0.getFilesDir()
            java.lang.String r1 = "password_data.key"
            java.io.File r0 = new java.io.File
            r0.<init>(r2, r1)
            java.io.FileOutputStream r3 = new java.io.FileOutputStream
            r3.<init>(r0)
            java.io.ObjectOutputStream r2 = new java.io.ObjectOutputStream     // Catch:{ all -> 0x0050 }
            r2.<init>(r3)     // Catch:{ all -> 0x0050 }
            r2.writeInt(r5)     // Catch:{ all -> 0x0049 }
            r2.writeObject(r6)     // Catch:{ all -> 0x0049 }
            r2.writeObject(r4)     // Catch:{ all -> 0x0049 }
            int r0 = r8.A00     // Catch:{ all -> 0x0049 }
            r2.writeInt(r0)     // Catch:{ all -> 0x0049 }
            r2.close()     // Catch:{ all -> 0x0050 }
            r3.close()
            return
        L_0x0049:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x004b }
        L_0x004b:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ all -> 0x0050 }
            throw r0     // Catch:{ all -> 0x0050 }
        L_0x0050:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0052 }
        L_0x0052:
            r0 = move-exception
            X.CDX.A00(r3, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1NO.A01(X.2m3):void");
    }

    public final void A02(C193149pc r5) {
        byte[] bArr = r5.A00;
        boolean z = false;
        if (bArr.length == 32) {
            z = true;
        }
        C17960vV.A0C(z);
        C17970vW.A0A(new File(this.A00.A00.getFilesDir(), "encrypted_backup.key"), bArr);
    }

    public final byte[] A03() {
        byte[] A0K = C17970vW.A0K(new File(this.A00.A00.getFilesDir(), "encrypted_backup.key"));
        if (A0K == null) {
            return null;
        }
        boolean z = false;
        if (A0K.length == 32) {
            z = true;
        }
        C17960vV.A0C(z);
        return A0K;
    }
}
