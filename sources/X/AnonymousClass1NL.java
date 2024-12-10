package X;

import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.whatsapp.util.Log;
import com.whatsapp.util.NativeUtils;
import com.whatsapp.util.StatResult;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.1NL  reason: invalid class name */
public class AnonymousClass1NL {
    public final AnonymousClass00H A00 = new C18150vq((Object) null, new C70943Dc(this, 20));
    public final AnonymousClass00H A01;
    public final Set A02 = new HashSet();
    public final AnonymousClass190 A03;
    public volatile Set A04 = new HashSet();

    public static String A00(String str) {
        int i;
        if (str.contains(File.separator)) {
            i = str.lastIndexOf(File.separator);
        } else {
            i = 0;
        }
        return str.substring(0, i);
    }

    public static List A01(File[] fileArr, int i) {
        if (fileArr == null || i == 0) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(r5);
        for (File file : fileArr) {
            try {
                StatResult lstatOpenFile = StatResult.lstatOpenFile(file.getPath());
                if (!lstatOpenFile.A05) {
                    if (file.isDirectory()) {
                        arrayList.addAll(A01(file.listFiles(), i - 1));
                    } else if (lstatOpenFile.A01 == 1) {
                        arrayList.add(Long.valueOf(lstatOpenFile.A04));
                    }
                }
            } catch (Exception e) {
                throw new IOException(e);
            } catch (IOException e2) {
                StringBuilder sb = new StringBuilder();
                sb.append("externalfilevalidator/file read error: ");
                sb.append(file);
                Log.e(sb.toString(), e2);
            }
        }
        return arrayList;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:16|17|18|(2:20|21)) */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005a, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append("externalfilevalidator/getProcDeviceId/proc file not found: ");
        r1.append(r2);
        com.whatsapp.util.Log.e(r1.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006f, code lost:
        if (r6 != null) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0075, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0076, code lost:
        r0 = new java.lang.StringBuilder();
        r0.append("externalfilevalidator/getProcDeviceId/close failed: ");
        r0.append(r1);
        com.whatsapp.util.Log.e(r0.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0140, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0141, code lost:
        if (r6 != null) goto L_0x0143;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0146, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0147, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0148, code lost:
        r0 = new java.lang.StringBuilder();
        r0.append("externalfilevalidator/getProcDeviceId/close failed: ");
        r0.append(r1);
        com.whatsapp.util.Log.e(r0.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x015a, code lost:
        throw r2;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A02(com.whatsapp.util.StatResult r10, java.lang.String r11) {
        /*
            r9 = this;
            java.lang.String r5 = "externalfilevalidator/getProcDeviceId/close failed: "
            java.lang.String r0 = "/proc/self"
            java.io.File r1 = new java.io.File
            r1.<init>(r0)
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r6 = 0
            android.os.ParcelFileDescriptor r6 = android.os.ParcelFileDescriptor.open(r1, r0)     // Catch:{ FileNotFoundException -> 0x005a, all -> 0x0058 }
            java.io.FileDescriptor r0 = r6.getFileDescriptor()     // Catch:{ FileNotFoundException -> 0x005a }
            int r0 = com.whatsapp.util.NativeUtils.getFileDescriptorForFileDescriptor(r0)     // Catch:{ FileNotFoundException -> 0x005a }
            com.whatsapp.util.StatResult r0 = com.whatsapp.util.StatResult.statOpenFile(r0)     // Catch:{ FileNotFoundException -> 0x005a }
            long r3 = r0.A03     // Catch:{ FileNotFoundException -> 0x005a }
            java.lang.Long r2 = java.lang.Long.valueOf(r3)     // Catch:{ FileNotFoundException -> 0x005a }
            r6.close()     // Catch:{ IOException -> 0x0026 }
            goto L_0x0039
        L_0x0026:
            r1 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0039:
            if (r2 == 0) goto L_0x0088
            long r1 = r10.A03
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0088
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "file is on the proc filesystem; not permitting nefarious file share operation; "
            r1.append(r0)
            r1.append(r11)
            java.lang.String r1 = r1.toString()
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r1)
            throw r0
        L_0x0058:
            r2 = move-exception
            throw r2
        L_0x005a:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0140 }
            r1.<init>()     // Catch:{ all -> 0x0140 }
            java.lang.String r0 = "externalfilevalidator/getProcDeviceId/proc file not found: "
            r1.append(r0)     // Catch:{ all -> 0x0140 }
            r1.append(r2)     // Catch:{ all -> 0x0140 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0140 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0140 }
            if (r6 == 0) goto L_0x0088
            r6.close()     // Catch:{ IOException -> 0x0075 }
            goto L_0x0088
        L_0x0075:
            r1 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0088:
            int r0 = android.os.Process.myUid()
            int r2 = r10.A02
            if (r0 != r2) goto L_0x00c7
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00c8 }
            r1.<init>()     // Catch:{ IOException -> 0x00c8 }
            java.io.File r0 = android.os.Environment.getExternalStorageDirectory()     // Catch:{ IOException -> 0x00c8 }
            java.lang.String r0 = r0.getCanonicalPath()     // Catch:{ IOException -> 0x00c8 }
            r1.append(r0)     // Catch:{ IOException -> 0x00c8 }
            java.lang.String r0 = "/."
            r1.append(r0)     // Catch:{ IOException -> 0x00c8 }
            java.lang.String r0 = r1.toString()     // Catch:{ IOException -> 0x00c8 }
            com.whatsapp.util.StatResult r0 = com.whatsapp.util.StatResult.lstatOpenFile(r0)     // Catch:{ Exception -> 0x00b6 }
            int r1 = r0.A00     // Catch:{ IOException -> 0x00c8 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)     // Catch:{ IOException -> 0x00c8 }
            if (r0 == 0) goto L_0x00ce
            goto L_0x00bd
        L_0x00b6:
            r1 = move-exception
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x00c8 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x00c8 }
            throw r0     // Catch:{ IOException -> 0x00c8 }
        L_0x00bd:
            if (r1 == r2) goto L_0x00ce
            int r0 = r10.A00
            if (r1 != r0) goto L_0x00ce
            boolean r0 = r10.A05
            if (r0 != 0) goto L_0x00ce
        L_0x00c7:
            return
        L_0x00c8:
            r1 = move-exception
            java.lang.String r0 = "externalfilevalidator/getExternalStorageGid/unable to read external storage dir"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x00ce:
            java.util.Set r2 = r9.A04
            long r0 = r10.A04
            java.lang.Long r8 = java.lang.Long.valueOf(r0)
            boolean r0 = r2.contains(r8)
            r7 = 1
            if (r0 != 0) goto L_0x00c7
            java.lang.String r0 = "externalfilevalidator/update allowlist"
            X.1Ez r6 = new X.1Ez
            r6.<init>((java.lang.String) r0)
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>()
            X.00H r0 = r9.A00
            java.lang.Object r0 = r0.get()
            java.util.Set r0 = (java.util.Set) r0
            java.util.Iterator r4 = r0.iterator()
        L_0x00f5:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x011e
            java.lang.Object r3 = r4.next()
            java.io.File r3 = (java.io.File) r3
            boolean r0 = r3.isFile()
            r2 = 3
            if (r0 == 0) goto L_0x0115
            java.io.File[] r1 = new java.io.File[r7]
            r0 = 0
            r1[r0] = r3
            java.util.List r0 = A01(r1, r2)
        L_0x0111:
            r5.addAll(r0)
            goto L_0x00f5
        L_0x0115:
            java.io.File[] r0 = r3.listFiles()
            java.util.List r0 = A01(r0, r2)
            goto L_0x0111
        L_0x011e:
            r9.A04 = r5
            r6.A02()
            boolean r0 = r5.contains(r8)
            if (r0 != 0) goto L_0x00c7
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "file is owned by our application; not permitting nefarious file share operation; "
            r1.append(r0)
            r1.append(r11)
            java.lang.String r1 = r1.toString()
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r1)
            throw r0
        L_0x0140:
            r2 = move-exception
            if (r6 == 0) goto L_0x015a
            r6.close()     // Catch:{ IOException -> 0x0147 }
            throw r2
        L_0x0147:
            r1 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x015a:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1NL.A02(com.whatsapp.util.StatResult, java.lang.String):void");
    }

    public void A03(Uri uri) {
        if (this.A02.contains(uri.getAuthority())) {
            StringBuilder sb = new StringBuilder();
            sb.append("externalfilevalidator/don't allow sharing ");
            sb.append(uri);
            throw new IOException(sb.toString());
        }
    }

    public void A04(Uri uri, AnonymousClass11B r6, boolean z) {
        if (z) {
            this.A03.A0G("EXTERNAL_FILE_URI_ALLOW_LIST_CRITICAL_EVENT", A00(uri.toString()), true);
        }
        A03(uri);
        ParcelFileDescriptor A06 = r6.A06(uri, "r");
        C17960vV.A07(A06);
        try {
            A05(A06);
            if (A06 != null) {
                A06.close();
            }
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
            throw th;
        }
    }

    public AnonymousClass1NL(AnonymousClass190 r4, AnonymousClass00H r5) {
        AnonymousClass00H A002 = C219117w.A00((C219117w) r5.get(), C218617r.class);
        C18070vi.A0z(A002, "null cannot be cast to non-null type dagger.Lazy<T of com.whatsapp.dependencybridge.DependencyBridgeRegistry.getBridgeLazy>");
        this.A01 = A002;
        this.A03 = r4;
    }

    public void A05(ParcelFileDescriptor parcelFileDescriptor) {
        StatResult statOpenFile = StatResult.statOpenFile(NativeUtils.getFileDescriptorForFileDescriptor(parcelFileDescriptor.getFileDescriptor()));
        StringBuilder sb = new StringBuilder();
        sb.append("parcelFileDescriptor=");
        sb.append(parcelFileDescriptor);
        A02(statOpenFile, sb.toString());
    }

    public void A06(File file) {
        String canonicalPath = file.getCanonicalPath();
        try {
            StatResult lstatOpenFile = StatResult.lstatOpenFile(canonicalPath);
            StringBuilder sb = new StringBuilder();
            sb.append("canonicalFilePath=");
            sb.append(canonicalPath);
            A02(lstatOpenFile, sb.toString());
        } catch (Exception e) {
            throw new IOException(e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:?, code lost:
        r0 = r4.getCanonicalPath();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0009, code lost:
        r0 = r4.getAbsolutePath();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000d, code lost:
        r3.A03.A0G(r5, A00(r0), true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0017, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0004 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A07(java.io.File r4, java.lang.String r5) {
        /*
            r3 = this;
            r3.A06(r4)     // Catch:{ IOException -> 0x0004 }
            return
        L_0x0004:
            java.lang.String r0 = r4.getCanonicalPath()     // Catch:{ Exception -> 0x0009 }
            goto L_0x000d
        L_0x0009:
            java.lang.String r0 = r4.getAbsolutePath()
        L_0x000d:
            X.190 r2 = r3.A03
            java.lang.String r1 = A00(r0)
            r0 = 1
            r2.A0G(r5, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1NL.A07(java.io.File, java.lang.String):void");
    }

    public void A08(FileInputStream fileInputStream, String str, String str2) {
        try {
            StatResult statOpenFile = StatResult.statOpenFile(NativeUtils.getFileDescriptorForFileDescriptor(fileInputStream.getFD()));
            StringBuilder sb = new StringBuilder();
            sb.append("fileInputStream=");
            sb.append(fileInputStream);
            A02(statOpenFile, sb.toString());
        } catch (IOException e) {
            if (!(str == null || str2 == null)) {
                this.A03.A0G(str, A00(str2), true);
            }
            throw e;
        }
    }
}
