package X;

import android.content.Context;
import android.os.CancellationSignal;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: X.A4r  reason: case insensitive filesystem */
public final class C20048A4r {
    public final Context A00;

    public static final void A01(CancellationSignal cancellationSignal, InputStream inputStream, OutputStream outputStream, byte[] bArr) {
        C18070vi.A0o(outputStream, bArr, cancellationSignal);
        while (true) {
            int read = inputStream.read(bArr);
            if (read >= 0) {
                cancellationSignal.throwIfCanceled();
                outputStream.write(bArr, 0, read);
            } else {
                return;
            }
        }
    }

    public final String A02(String str) {
        Context context = this.A00;
        File A0e = C17880vN.A0e(context.getFilesDir(), "__relative_root_1");
        File A0e2 = C17880vN.A0e(context.getFilesDir(), "__relative_root_2");
        String A002 = A00(A0e, str);
        if (C18070vi.A18(A002, A00(A0e2, str))) {
            return A002;
        }
        throw C17880vN.A0f(AnonymousClass001.A1H("Invalid relative path: ", str, AnonymousClass000.A10()));
    }

    public C20048A4r(Context context) {
        this.A00 = context;
    }

    public static final String A00(File file, String str) {
        File canonicalFile = file.getCanonicalFile();
        File canonicalFile2 = C17880vN.A0e(canonicalFile, str).getCanonicalFile();
        String path = canonicalFile.getPath();
        String path2 = canonicalFile2.getPath();
        C18070vi.A0b(path2);
        C18070vi.A0b(path);
        if (!AnonymousClass1YE.A0A(path2, path, false)) {
            throw C17880vN.A0f(AnonymousClass001.A1H("Invalid relative path (escapes parent): ", path2, AnonymousClass000.A10()));
        } else if (!C18070vi.A18(path2, path)) {
            String A0z = C108955ca.A0z(path2, path.length() + 1);
            if (A0z.length() != 0) {
                return A0z;
            }
            throw C17880vN.A0f(C17900vP.A0A("Invalid relative path (points to root): ", path2));
        } else {
            throw C17880vN.A0f(C17900vP.A0A("Invalid relative path (points to root): ", path2));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0055, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0059, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x005c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0060, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(android.os.CancellationSignal r7, java.io.File r8, java.io.File r9, byte[] r10) {
        /*
            r6 = this;
            X.C18070vi.A0o(r9, r10, r7)
            java.io.File r5 = r8.getCanonicalFile()
            java.io.File r3 = r9.getCanonicalFile()
            boolean r0 = X.C18070vi.A18(r5, r3)
            if (r0 != 0) goto L_0x0069
            boolean r2 = X.AnonymousClass8BU.A1W(r3)
            java.io.File r0 = r3.getParentFile()
            if (r0 == 0) goto L_0x001e
            r0.mkdirs()
        L_0x001e:
            boolean r0 = r5.renameTo(r3)
            if (r0 != 0) goto L_0x0069
            java.io.File r1 = r5.getCanonicalFile()
            java.io.File r4 = r3.getCanonicalFile()
            boolean r0 = X.C18070vi.A18(r1, r4)
            if (r0 != 0) goto L_0x0066
            X.C18070vi.A0b(r4)
            X.C18070vi.A0d(r4, r2)
            java.io.File r0 = r4.getParentFile()
            if (r0 == 0) goto L_0x0041
            r0.mkdirs()
        L_0x0041:
            java.io.FileOutputStream r3 = X.C108945cZ.A19(r4)     // Catch:{ IOException -> 0x0061 }
            java.io.FileInputStream r2 = X.C108945cZ.A18(r1)     // Catch:{ all -> 0x005a }
            A01(r7, r2, r3, r10)     // Catch:{ all -> 0x0053 }
            r2.close()     // Catch:{ all -> 0x005a }
            r3.close()     // Catch:{ IOException -> 0x0061 }
            goto L_0x0066
        L_0x0053:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0055 }
        L_0x0055:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ all -> 0x005a }
            throw r0     // Catch:{ all -> 0x005a }
        L_0x005a:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x005c }
        L_0x005c:
            r0 = move-exception
            X.CDX.A00(r3, r1)     // Catch:{ IOException -> 0x0061 }
            throw r0     // Catch:{ IOException -> 0x0061 }
        L_0x0061:
            r0 = move-exception
            r4.delete()
            throw r0
        L_0x0066:
            r5.delete()
        L_0x0069:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20048A4r.A03(android.os.CancellationSignal, java.io.File, java.io.File, byte[]):void");
    }
}
