package X;

import android.content.Context;
import com.facebook.superpack.AssetDecompressor;
import com.whatsapp.AbstractAppShellDelegate;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* renamed from: X.19w  reason: invalid class name and case insensitive filesystem */
public class C224319w {
    public static final Integer[] A0A = {0, 1};
    public String A00;
    public boolean A01 = false;
    public String A02;
    public final C17930vS A03;
    public final AnonymousClass198 A04;
    public final AnonymousClass10I A05;
    public final Set A06 = new HashSet();
    public final C224219v A07;
    public final HashMap A08 = new HashMap();
    public final AtomicBoolean A09 = new AtomicBoolean(true);

    public static String A00(C224319w r4) {
        String str = r4.A02;
        if (str != null) {
            return str;
        }
        String[] strArr = {"arm64-v8a", "armeabi-v7a", "x86", "x86_64"};
        String str2 = strArr[AssetDecompressor.get_architecture()];
        r4.A02 = str2;
        return str2;
    }

    public static boolean A03(C17930vS r5, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("lib");
        sb.append(str);
        sb.append(".so");
        if (!new File(new File(new File(r5.A01(), "decompressed"), AbstractAppShellDelegate.COMPRESSED_LIBS_ARCHIVE_NAME), sb.toString()).exists()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("whatsappassetdecompressor/load-library-from-archive File missing: ");
            sb2.append(str);
            Log.w(sb2.toString());
            return false;
        }
        try {
            return AnonymousClass1A8.A06(str);
        } catch (UnsatisfiedLinkError e) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("whatsappassetdecompressor/load-library-from-archive error: ");
            sb3.append(str);
            Log.w(sb3.toString(), e);
            return false;
        }
    }

    public void A04(Context context, C17930vS r10) {
        boolean z = true;
        C17960vV.A0D(!"2.24.24.78".isEmpty());
        int i = AssetDecompressor.get_architecture();
        StringBuilder sb = new StringBuilder();
        sb.append("2.24.24.78");
        sb.append(":");
        sb.append(new String[]{"arm64-v8a", "armeabi-v7a", "x86", "x86_64"}[i]);
        sb.append(":");
        sb.append(new File(context.getPackageCodePath()).lastModified() / 1000);
        this.A00 = sb.toString();
        this.A01 = true;
        C224219v r3 = this.A07;
        if (!(i == 0 || i == 3)) {
            z = false;
        }
        r3.A01(z, new File(r10.A01(), "decompressed/libs.spo").getAbsolutePath());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00cf, code lost:
        if (r2.contains("libvlc.so") != false) goto L_0x00d1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A05(android.content.Context r11) {
        /*
            r10 = this;
            java.lang.String r3 = "libs.spo"
            boolean r0 = r10.A01
            X.C17960vV.A0D(r0)
            r8 = 0
            X.0vS r4 = r10.A03
            java.io.File r2 = r4.A01()
            java.lang.String r1 = "decompressed"
            java.io.File r0 = new java.io.File
            r0.<init>(r2, r1)
            java.io.File r1 = new java.io.File
            r1.<init>(r0, r3)
            A02(r4)
            boolean r0 = r1.exists()
            if (r0 != 0) goto L_0x0026
            r1.mkdir()
        L_0x0026:
            boolean r0 = r10.A06(r3)
            if (r0 != 0) goto L_0x00a5
            java.util.Set r0 = X.AnonymousClass1AN.A00
            int r9 = r0.size()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "compressed/"
            r2.append(r0)
            java.lang.String r0 = A00(r10)
            r2.append(r0)
            java.lang.String r0 = "/"
            r2.append(r0)
            r2.append(r3)
            java.lang.String r5 = r2.toString()
            java.lang.String r0 = "."
            int r0 = r3.lastIndexOf(r0)
            int r0 = r0 + 1
            java.lang.String r6 = r3.substring(r0)
            java.lang.String r0 = "whatsappassetdecompressor/initiating decompression of primary libs"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ AssetDecompressionException -> 0x009e }
            android.content.res.AssetManager r4 = r11.getAssets()     // Catch:{ AssetDecompressionException -> 0x009e }
            java.lang.String r7 = r1.getAbsolutePath()     // Catch:{ AssetDecompressionException -> 0x009e }
            java.lang.String[] r2 = com.facebook.superpack.AssetDecompressor.decompress_range(r4, r5, r6, r7, r8, r9)     // Catch:{ AssetDecompressionException -> 0x009e }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ AssetDecompressionException -> 0x009e }
            r1.<init>()     // Catch:{ AssetDecompressionException -> 0x009e }
            java.lang.String r0 = "whatsappassetdecompressor/primary libs decompressed size/"
            r1.append(r0)     // Catch:{ AssetDecompressionException -> 0x009e }
            int r0 = r2.length     // Catch:{ AssetDecompressionException -> 0x009e }
            r1.append(r0)     // Catch:{ AssetDecompressionException -> 0x009e }
            java.lang.String r0 = r1.toString()     // Catch:{ AssetDecompressionException -> 0x009e }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ AssetDecompressionException -> 0x009e }
            java.util.List r0 = java.util.Arrays.asList(r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r0)
            X.10I r1 = r10.A05     // Catch:{ all -> 0x009c }
            X.4rm r0 = new X.4rm     // Catch:{ all -> 0x009c }
            r0.<init>(r11, r10, r2, r9)     // Catch:{ all -> 0x009c }
            r1.CGN(r0)     // Catch:{ all -> 0x009c }
            java.util.Set r0 = r10.A06
            r0.add(r3)
            goto L_0x00b4
        L_0x009c:
            r0 = move-exception
            throw r0
        L_0x009e:
            r1 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x00a5:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            X.198 r1 = r10.A04
            java.util.concurrent.CountDownLatch r0 = r1.A01
            r0.countDown()
            r1.A00()
        L_0x00b4:
            java.lang.String r1 = A00(r10)
            java.lang.String r0 = "armeabi-v7a"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00d1
            java.lang.String r0 = "libwhatsapp.so"
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L_0x00d1
            java.lang.String r0 = "libvlc.so"
            boolean r0 = r2.contains(r0)
            r1 = 0
            if (r0 == 0) goto L_0x00d2
        L_0x00d1:
            r1 = 1
        L_0x00d2:
            java.lang.String r0 = "libvlc.so needs to be co-located in armv7 builds, to avoid setting off a bug on some older x86 devices"
            X.C17960vV.A0H(r1, r0)
            int r0 = r2.size()
            if (r0 <= 0) goto L_0x00de
            r8 = 1
        L_0x00de:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C224319w.A05(android.content.Context):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0086, code lost:
        if (r0 == false) goto L_0x0088;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A06(java.lang.String r8) {
        /*
            r7 = this;
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            java.util.HashMap r4 = r7.A08
            java.lang.Object r0 = r4.get(r8)
            boolean r0 = r1.equals(r0)
            r1 = 1
            if (r0 != 0) goto L_0x0019
            boolean r0 = r7.A01
            if (r0 != 0) goto L_0x001a
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r4.put(r8, r0)
            r1 = 0
        L_0x0019:
            return r1
        L_0x001a:
            java.util.Set r0 = r7.A06
            boolean r0 = r0.contains(r8)
            if (r0 == 0) goto L_0x0028
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
        L_0x0024:
            r4.put(r8, r0)
            return r1
        L_0x0028:
            X.0vS r0 = r7.A03     // Catch:{ IOException -> 0x0077 }
            java.io.File r2 = r0.A01()     // Catch:{ IOException -> 0x0077 }
            java.lang.String r1 = "decompressed"
            java.io.File r0 = new java.io.File     // Catch:{ IOException -> 0x0077 }
            r0.<init>(r2, r1)     // Catch:{ IOException -> 0x0077 }
            java.io.File r1 = new java.io.File     // Catch:{ IOException -> 0x0077 }
            r1.<init>(r0, r8)     // Catch:{ IOException -> 0x0077 }
            java.lang.String r0 = ".superpack_version"
            java.io.File r6 = new java.io.File     // Catch:{ IOException -> 0x0077 }
            r6.<init>(r1, r0)     // Catch:{ IOException -> 0x0077 }
            long r1 = r6.length()     // Catch:{ IOException -> 0x0077 }
            int r0 = (int) r1     // Catch:{ IOException -> 0x0077 }
            java.io.ByteArrayOutputStream r5 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x0077 }
            r5.<init>(r0)     // Catch:{ IOException -> 0x0077 }
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0077 }
            r3.<init>(r6)     // Catch:{ IOException -> 0x0077 }
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r2 = new byte[r0]     // Catch:{ all -> 0x006d }
        L_0x0054:
            int r1 = r3.read(r2)     // Catch:{ all -> 0x006d }
            r0 = -1
            if (r1 == r0) goto L_0x0060
            r0 = 0
            r5.write(r2, r0, r1)     // Catch:{ all -> 0x006d }
            goto L_0x0054
        L_0x0060:
            r3.close()     // Catch:{ IOException -> 0x0077 }
            byte[] r0 = r5.toByteArray()     // Catch:{ IOException -> 0x0077 }
            java.lang.String r1 = new java.lang.String     // Catch:{ IOException -> 0x0077 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x0077 }
            goto L_0x0079
        L_0x006d:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x0072 }
            goto L_0x0076
        L_0x0072:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ IOException -> 0x0077 }
        L_0x0076:
            throw r1     // Catch:{ IOException -> 0x0077 }
        L_0x0077:
            java.lang.String r1 = ""
        L_0x0079:
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0088
            java.lang.String r0 = r7.A00
            boolean r0 = r1.equals(r0)
            r1 = 1
            if (r0 != 0) goto L_0x0089
        L_0x0088:
            r1 = 0
        L_0x0089:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            goto L_0x0024
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C224319w.A06(java.lang.String):boolean");
    }

    public C224319w(C17930vS r3, C224219v r4, AnonymousClass198 r5, AnonymousClass10I r6) {
        this.A05 = r6;
        this.A07 = r4;
        this.A04 = r5;
        this.A03 = r3;
    }

    public static void A01(Context context, C224319w r12, File file, ArrayList arrayList) {
        ZipFile zipFile;
        String A002;
        FileOutputStream fileOutputStream;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AssetDecompressor.sync_file_to_disk(new File(file, (String) it.next()).getAbsolutePath());
        }
        File file2 = new File(file, ".superpack_version");
        try {
            fileOutputStream = new FileOutputStream(file2);
            fileOutputStream.write(r12.A00.getBytes());
            fileOutputStream.close();
        } catch (IOException e) {
            Log.e("Could not write decompressed asset metadata", e);
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
        }
        AssetDecompressor.sync_file_to_disk(file2.getAbsolutePath());
        File[] listFiles = file.listFiles();
        listFiles.getClass();
        for (File file3 : listFiles) {
            String name = file3.getName();
            if (!arrayList.contains(name) && !name.equals(".superpack_version")) {
                file3.delete();
            }
        }
        if (r12.A09.compareAndSet(true, false)) {
            HashSet hashSet = new HashSet();
            File file4 = new File(r12.A03.A01(), "decompressed");
            int i = 0;
            for (File file5 : file4.listFiles()) {
                if (file5.isDirectory()) {
                    String name2 = file5.getName();
                    if (!r12.A06(name2)) {
                        hashSet.add(name2);
                    }
                } else {
                    file5.delete();
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unknown file in decompressed assets directory: ");
                    sb.append(file5.getName());
                    Log.i(sb.toString());
                }
            }
            if (!hashSet.isEmpty()) {
                HashMap hashMap = new HashMap();
                Integer[] numArr = A0A;
                do {
                    int intValue = numArr[i].intValue();
                    Iterator it2 = hashSet.iterator();
                    while (it2.hasNext()) {
                        String str = (String) it2.next();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("assets/compressed/");
                        if (intValue == 0) {
                            A002 = A00(r12);
                        } else if (intValue == 1) {
                            A002 = "strings";
                        } else {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("Compressed folder not explicitly specified for assetType: ");
                            sb3.append(intValue);
                            throw new RuntimeException(sb3.toString());
                        }
                        sb2.append(A002);
                        sb2.append("/");
                        sb2.append(str);
                        hashMap.put(sb2.toString(), str);
                    }
                    i++;
                } while (i < 2);
                try {
                    zipFile = new ZipFile(context.getPackageCodePath());
                    Enumeration<? extends ZipEntry> entries = zipFile.entries();
                    while (entries.hasMoreElements()) {
                        String str2 = (String) hashMap.get(((ZipEntry) entries.nextElement()).getName());
                        if (str2 != null) {
                            hashSet.remove(str2);
                        }
                    }
                    zipFile.close();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    AnonymousClass0DT.A00(th, th2);
                }
                Iterator it3 = hashSet.iterator();
                while (it3.hasNext()) {
                    File file6 = new File(file4, (String) it3.next());
                    for (File delete : file6.listFiles()) {
                        delete.delete();
                    }
                    file6.delete();
                }
                return;
            }
            return;
        }
        return;
        throw th;
        throw th;
    }

    public static void A02(C17930vS r2) {
        File file = new File(r2.A01(), "decompressed");
        if (!file.exists() && !file.mkdir()) {
            throw new RuntimeException("Could not create decompressed assets directory");
        }
    }
}
