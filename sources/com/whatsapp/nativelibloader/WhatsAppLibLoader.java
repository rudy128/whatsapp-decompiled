package com.whatsapp.nativelibloader;

import X.AnonymousClass00H;
import X.AnonymousClass0DT;
import X.AnonymousClass118;
import X.AnonymousClass190;
import X.AnonymousClass198;
import X.AnonymousClass1A3;
import X.C17930vS;
import X.C18070vi;
import X.C19830z4;
import X.C217017b;
import X.C224319w;
import X.C62912sC;
import android.content.Context;
import com.facebook.msys.mci.DefaultCrypto;
import com.facebook.superpack.AssetDecompressor;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class WhatsAppLibLoader {
    public static Map A0B;
    public Boolean A00 = null;
    public AnonymousClass1A3 A01 = AnonymousClass1A3.A01;
    public final AnonymousClass118 A02;
    public final C17930vS A03;
    public final C217017b A04;
    public final C224319w A05;
    public final AnonymousClass198 A06;
    public final AnonymousClass00H A07;
    public final AnonymousClass190 A08;
    public final C19830z4 A09;
    public final AnonymousClass00H A0A;

    public static native String getJNICodeVersion();

    public static native void testLibraryUsable(byte[] bArr);

    /* JADX WARNING: Can't wrap try/catch for region: R(4:9|10|11|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0024 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void A02(java.lang.String r16) {
        /*
            r15 = this;
            r14 = r15
            monitor-enter(r14)
            r4 = 1
            r5 = r16
            java.lang.Boolean r1 = r15.A00     // Catch:{ all -> 0x00e1 }
            if (r1 == 0) goto L_0x000e
            boolean r0 = r1.booleanValue()     // Catch:{ all -> 0x00e1 }
            goto L_0x0051
        L_0x000e:
            X.19w r1 = r15.A05     // Catch:{ all -> 0x00e1 }
            java.lang.String r0 = "libs.spo"
            boolean r1 = r1.A06(r0)     // Catch:{ all -> 0x00e1 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)     // Catch:{ all -> 0x00e1 }
            r15.A00 = r0     // Catch:{ all -> 0x00e1 }
            if (r1 == 0) goto L_0x0028
            X.198 r0 = r15.A06     // Catch:{ IOException -> 0x0024 }
            r0.A00()     // Catch:{ IOException -> 0x0024 }
            goto L_0x0028
        L_0x0024:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x00e1 }
            r15.A00 = r0     // Catch:{ all -> 0x00e1 }
        L_0x0028:
            java.lang.Boolean r0 = r15.A00     // Catch:{ all -> 0x00e1 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x00e1 }
            if (r0 != 0) goto L_0x004b
            java.lang.String r0 = "whatsappsoloader/decompression failed"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x00e1 }
            X.17b r3 = r15.A04     // Catch:{ all -> 0x00e1 }
            android.os.Looper r0 = android.os.Looper.getMainLooper()     // Catch:{ all -> 0x00e1 }
            android.os.Handler r2 = new android.os.Handler     // Catch:{ all -> 0x00e1 }
            r2.<init>(r0)     // Catch:{ all -> 0x00e1 }
            r1 = 8
            X.AkP r0 = new X.AkP     // Catch:{ all -> 0x00e1 }
            r0.<init>(r15, r3, r1)     // Catch:{ all -> 0x00e1 }
            r2.post(r0)     // Catch:{ all -> 0x00e1 }
        L_0x004b:
            java.lang.Boolean r1 = r15.A00     // Catch:{ all -> 0x00e1 }
            boolean r0 = r1.booleanValue()     // Catch:{ all -> 0x00e1 }
        L_0x0051:
            if (r0 == 0) goto L_0x01f9
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ UnsatisfiedLinkError -> 0x00f9 }
            boolean r0 = r0.equals(r1)     // Catch:{ UnsatisfiedLinkError -> 0x00f9 }
            if (r0 != 0) goto L_0x0063
            X.0vS r0 = r15.A03     // Catch:{ UnsatisfiedLinkError -> 0x00f9 }
            boolean r0 = X.C224319w.A03(r0, r5)     // Catch:{ UnsatisfiedLinkError -> 0x00f9 }
            if (r0 != 0) goto L_0x006b
        L_0x0063:
            X.00H r0 = r15.A07     // Catch:{ UnsatisfiedLinkError -> 0x00f9 }
            r0.get()     // Catch:{ UnsatisfiedLinkError -> 0x00f9 }
            r15.A01(r5)     // Catch:{ UnsatisfiedLinkError -> 0x00f9 }
        L_0x006b:
            java.lang.String r0 = "whatsapp"
            boolean r0 = r5.equals(r0)     // Catch:{ UnsatisfiedLinkError -> 0x00f9 }
            if (r0 == 0) goto L_0x01f9
            r0 = 3
            byte[] r1 = new byte[r0]     // Catch:{ UnsatisfiedLinkError -> 0x00f9 }
            testLibraryUsable(r1)     // Catch:{ UnsatisfiedLinkError -> 0x00e3 }
            byte[] r0 = new byte[r0]     // Catch:{ UnsatisfiedLinkError -> 0x00f9 }
            r0 = {31, 41, 59} // fill-array     // Catch:{ UnsatisfiedLinkError -> 0x00f9 }
            boolean r0 = java.util.Arrays.equals(r0, r1)     // Catch:{ UnsatisfiedLinkError -> 0x00f9 }
            if (r0 != 0) goto L_0x008c
            java.lang.String r0 = "whatsapplibloader/usable test array does not match"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ UnsatisfiedLinkError -> 0x00f9 }
            goto L_0x00ea
        L_0x008c:
            java.lang.String r3 = getJNICodeVersion()     // Catch:{ UnsatisfiedLinkError -> 0x00dc }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ UnsatisfiedLinkError -> 0x00dc }
            r1.<init>()     // Catch:{ UnsatisfiedLinkError -> 0x00dc }
            java.lang.String r0 = "whatsapplibloader/usable jniVersion: "
            r1.append(r0)     // Catch:{ UnsatisfiedLinkError -> 0x00dc }
            r1.append(r3)     // Catch:{ UnsatisfiedLinkError -> 0x00dc }
            java.lang.String r0 = r1.toString()     // Catch:{ UnsatisfiedLinkError -> 0x00dc }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ UnsatisfiedLinkError -> 0x00dc }
            java.lang.String r2 = "2.24.24.78"
            boolean r0 = r2.equals(r3)     // Catch:{ UnsatisfiedLinkError -> 0x00dc }
            if (r0 != 0) goto L_0x00cb
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ UnsatisfiedLinkError -> 0x00dc }
            r1.<init>()     // Catch:{ UnsatisfiedLinkError -> 0x00dc }
            java.lang.String r0 = "whatsapplibloader/usable version does not match. JAVA version: "
            r1.append(r0)     // Catch:{ UnsatisfiedLinkError -> 0x00dc }
            r1.append(r2)     // Catch:{ UnsatisfiedLinkError -> 0x00dc }
            java.lang.String r0 = ", JNI version: "
            r1.append(r0)     // Catch:{ UnsatisfiedLinkError -> 0x00dc }
            r1.append(r3)     // Catch:{ UnsatisfiedLinkError -> 0x00dc }
            java.lang.String r0 = r1.toString()     // Catch:{ UnsatisfiedLinkError -> 0x00dc }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ UnsatisfiedLinkError -> 0x00dc }
            goto L_0x00ea
        L_0x00cb:
            java.lang.String r0 = "whatsapplibloader/usable isLibraryUsable: True"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ UnsatisfiedLinkError -> 0x00f9 }
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch:{ UnsatisfiedLinkError -> 0x00f9 }
            X.1A3 r0 = new X.1A3     // Catch:{ UnsatisfiedLinkError -> 0x00f9 }
            r0.<init>(r1)     // Catch:{ UnsatisfiedLinkError -> 0x00f9 }
            r15.A01 = r0     // Catch:{ UnsatisfiedLinkError -> 0x00f9 }
            goto L_0x01f9
        L_0x00dc:
            r1 = move-exception
            java.lang.String r0 = "whatsapplibloader/usable error while testing library usability getJNICodeVersion"
            goto L_0x00e7
        L_0x00e1:
            r1 = move-exception
            goto L_0x00f8
        L_0x00e3:
            r1 = move-exception
            java.lang.String r0 = "whatsapplibloader/usable error while testing library usability testLibraryUsable"
        L_0x00e7:
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ UnsatisfiedLinkError -> 0x00f9 }
        L_0x00ea:
            java.lang.String r0 = "whatsapplibloader/load-startup-libs library usability broken; throwing to corrupt installation activity"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ UnsatisfiedLinkError -> 0x00f9 }
            java.lang.String r0 = "unable to use libraries despite successful install directly from apk"
            java.lang.UnsatisfiedLinkError r1 = new java.lang.UnsatisfiedLinkError     // Catch:{ UnsatisfiedLinkError -> 0x00f9 }
            r1.<init>(r0)     // Catch:{ UnsatisfiedLinkError -> 0x00f9 }
        L_0x00f8:
            throw r1     // Catch:{ UnsatisfiedLinkError -> 0x00f9 }
        L_0x00f9:
            r3 = move-exception
            r15.A00()     // Catch:{ all -> 0x01fd }
            java.lang.String r0 = "whatsapp"
            boolean r0 = r5.equals(r0)     // Catch:{ all -> 0x01fd }
            if (r0 == 0) goto L_0x010f
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x01fd }
            X.1A3 r0 = new X.1A3     // Catch:{ all -> 0x01fd }
            r0.<init>(r1)     // Catch:{ all -> 0x01fd }
            r15.A01 = r0     // Catch:{ all -> 0x01fd }
        L_0x010f:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x01fd }
            r2.<init>()     // Catch:{ all -> 0x01fd }
            java.lang.String r0 = "whatsapplibloader/load-startup-libs: available internal storage: "
            r2.append(r0)     // Catch:{ all -> 0x01fd }
            X.00H r0 = r15.A0A     // Catch:{ all -> 0x01fd }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x01fd }
            X.11Z r0 = (X.AnonymousClass11Z) r0     // Catch:{ all -> 0x01fd }
            long r0 = r0.A02()     // Catch:{ all -> 0x01fd }
            r2.append(r0)     // Catch:{ all -> 0x01fd }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x01fd }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x01fd }
            java.lang.String r7 = "WhatsAppLibLoader/loadStartupLibs"
            com.whatsapp.util.Log.e(r7, r3)     // Catch:{ all -> 0x01fd }
            X.0z4 r6 = r15.A09     // Catch:{ all -> 0x01fb }
            java.lang.String r5 = "corrupt_installation_reported_timestamp"
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            boolean r0 = r6.A2b(r5, r0)     // Catch:{ all -> 0x01fb }
            if (r0 == 0) goto L_0x01e4
            X.0vS r0 = r15.A03     // Catch:{ all -> 0x01fb }
            java.io.File r2 = r0.A01()     // Catch:{ all -> 0x01fb }
            java.lang.String r1 = "decompressed/libs.spo"
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x01fb }
            r0.<init>(r2, r1)     // Catch:{ all -> 0x01fb }
            java.io.File[] r9 = r0.listFiles()     // Catch:{ all -> 0x01fb }
            if (r9 != 0) goto L_0x0166
            java.lang.String r0 = "whatsapplibloader/nativeLibs/null"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x01fb }
        L_0x015b:
            X.190 r1 = r15.A08     // Catch:{ all -> 0x01fb }
            java.lang.String r0 = "native libraries are missing"
            r1.A0G(r7, r0, r4)     // Catch:{ all -> 0x01fb }
            r6.A1i(r5)     // Catch:{ all -> 0x01fb }
            goto L_0x01e4
        L_0x0166:
            int r8 = r9.length     // Catch:{ all -> 0x01fb }
            r3 = 0
        L_0x0168:
            if (r3 >= r8) goto L_0x015b
            r10 = r9[r3]     // Catch:{ all -> 0x01fb }
            java.lang.String r13 = r10.getName()     // Catch:{ all -> 0x01fb }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x01fb }
            r2.<init>()     // Catch:{ all -> 0x01fb }
            boolean r0 = r10.canRead()     // Catch:{ all -> 0x01fb }
            java.lang.String r1 = "-"
            if (r0 == 0) goto L_0x01df
            java.lang.String r0 = "r"
        L_0x017f:
            r2.append(r0)     // Catch:{ all -> 0x01fb }
            boolean r0 = r10.canWrite()     // Catch:{ all -> 0x01fb }
            if (r0 == 0) goto L_0x01dd
            java.lang.String r0 = "w"
        L_0x018b:
            r2.append(r0)     // Catch:{ all -> 0x01fb }
            boolean r0 = r10.canExecute()     // Catch:{ all -> 0x01fb }
            if (r0 == 0) goto L_0x0197
            java.lang.String r1 = "x"
        L_0x0197:
            r2.append(r1)     // Catch:{ all -> 0x01fb }
            java.lang.String r12 = r2.toString()     // Catch:{ all -> 0x01fb }
            long r0 = r10.lastModified()     // Catch:{ all -> 0x01fb }
            java.util.Date r2 = new java.util.Date     // Catch:{ all -> 0x01fb }
            r2.<init>(r0)     // Catch:{ all -> 0x01fb }
            java.lang.String r11 = r2.toString()     // Catch:{ all -> 0x01fb }
            long r1 = r10.length()     // Catch:{ all -> 0x01fb }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x01fb }
            r10.<init>()     // Catch:{ all -> 0x01fb }
            java.lang.String r0 = "whatsapplibloader/nativeLib Name: "
            r10.append(r0)     // Catch:{ all -> 0x01fb }
            r10.append(r13)     // Catch:{ all -> 0x01fb }
            java.lang.String r0 = ", Permissions: "
            r10.append(r0)     // Catch:{ all -> 0x01fb }
            r10.append(r12)     // Catch:{ all -> 0x01fb }
            java.lang.String r0 = ", Last Modified: "
            r10.append(r0)     // Catch:{ all -> 0x01fb }
            r10.append(r11)     // Catch:{ all -> 0x01fb }
            java.lang.String r0 = ", Size: "
            r10.append(r0)     // Catch:{ all -> 0x01fb }
            r10.append(r1)     // Catch:{ all -> 0x01fb }
            java.lang.String r0 = r10.toString()     // Catch:{ all -> 0x01fb }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x01fb }
            goto L_0x01e1
        L_0x01dd:
            r0 = r1
            goto L_0x018b
        L_0x01df:
            r0 = r1
            goto L_0x017f
        L_0x01e1:
            int r3 = r3 + 1
            goto L_0x0168
        L_0x01e4:
            X.17b r3 = r15.A04     // Catch:{ all -> 0x01fd }
            android.os.Looper r0 = android.os.Looper.getMainLooper()     // Catch:{ all -> 0x01fd }
            android.os.Handler r2 = new android.os.Handler     // Catch:{ all -> 0x01fd }
            r2.<init>(r0)     // Catch:{ all -> 0x01fd }
            r1 = 8
            X.AkP r0 = new X.AkP     // Catch:{ all -> 0x01fd }
            r0.<init>(r15, r3, r1)     // Catch:{ all -> 0x01fd }
            r2.post(r0)     // Catch:{ all -> 0x01fd }
        L_0x01f9:
            monitor-exit(r14)
            return
        L_0x01fb:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x01fd }
        L_0x01fd:
            r0 = move-exception
            monitor-exit(r14)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.nativelibloader.WhatsAppLibLoader.A02(java.lang.String):void");
    }

    public synchronized boolean A04() {
        AnonymousClass1A3 r1 = this.A01;
        if (r1.A00 != null) {
            return ((Boolean) r1.A00()).booleanValue();
        }
        Log.e("whatsapplibloader/isLoaded: isLoaded() was called before load was attempted");
        return false;
    }

    private void A00() {
        Context context = this.A02.A00;
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        StringBuilder sb = new StringBuilder();
        sb.append("whatsapplibloader/load-startup-libs: install source ");
        sb.append(installerPackageName);
        Log.i(sb.toString());
    }

    public void A01(String str) {
        UnsatisfiedLinkError unsatisfiedLinkError;
        String str2;
        ZipFile zipFile;
        IOException th;
        InputStream inputStream;
        FileOutputStream fileOutputStream;
        StringBuilder sb = new StringBuilder();
        sb.append("whatsapplibloader/system-load-library-with-install start, loading: ");
        sb.append(str);
        Log.i(sb.toString());
        try {
            C18070vi.A0d(str, 0);
            System.loadLibrary(str);
        } catch (UnsatisfiedLinkError e) {
            Log.w("whatsapplibloader/system-load-library-with-install error", e);
            List<Object> asList = Arrays.asList(new String[]{str});
            synchronized (this) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("whatsapplibloader/try-install start, loading: ");
                sb2.append(asList.size());
                Log.i(sb2.toString());
                String A022 = C62912sC.A02();
                if (A022.startsWith("armeabi-v7")) {
                    str2 = "armeabi-v7a";
                } else {
                    str2 = "arm64-v8a";
                    if (!A022.startsWith(str2)) {
                        str2 = "x86_64";
                        if (!A022.startsWith(str2)) {
                            str2 = "x86";
                            if (!A022.startsWith(str2)) {
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append("can not find lib folder for ABI ");
                                sb3.append(A022);
                                unsatisfiedLinkError = new UnsatisfiedLinkError(sb3.toString());
                                throw unsatisfiedLinkError;
                            }
                        }
                    }
                }
                StringBuilder sb4 = new StringBuilder();
                sb4.append("whatsapplibloader/arch resolved to ");
                sb4.append(str2);
                Log.i(sb4.toString());
                try {
                    zipFile = new ZipFile(this.A02.A00.getPackageCodePath());
                    if (A0B == null) {
                        HashMap hashMap = new HashMap(8);
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append("lib/");
                        sb5.append(str2);
                        sb5.append("/lib");
                        String obj = sb5.toString();
                        byte[] bArr = new byte[DefaultCrypto.BUFFER_SIZE];
                        File A012 = this.A03.A01();
                        Enumeration<? extends ZipEntry> entries = zipFile.entries();
                        while (entries.hasMoreElements()) {
                            ZipEntry zipEntry = (ZipEntry) entries.nextElement();
                            String name = zipEntry.getName();
                            if (name.endsWith(".so")) {
                                StringBuilder sb6 = new StringBuilder();
                                sb6.append("whatsapplibloader/extractLibs found ");
                                sb6.append(name);
                                Log.i(sb6.toString());
                                if (name.startsWith(obj)) {
                                    String[] split = name.split("/");
                                    String str3 = split[split.length - 1];
                                    File file = new File(A012, str3);
                                    if (!file.getCanonicalPath().startsWith(A012.getCanonicalPath())) {
                                        th = new IOException();
                                    } else if ("libunwindstack.so".equals(str3)) {
                                        file.delete();
                                    } else {
                                        inputStream = zipFile.getInputStream(zipEntry);
                                        fileOutputStream = new FileOutputStream(file);
                                        while (true) {
                                            int read = inputStream.read(bArr);
                                            if (read <= 0) {
                                                break;
                                            }
                                            fileOutputStream.write(bArr, 0, read);
                                        }
                                        fileOutputStream.close();
                                        inputStream.close();
                                        StringBuilder sb7 = new StringBuilder();
                                        sb7.append("whatsapplibloader/extractLibs copied ");
                                        sb7.append(file.getAbsolutePath());
                                        sb7.append(" from apk");
                                        Log.i(sb7.toString());
                                        hashMap.put(str3.substring(3, str3.length() - 3), file);
                                    }
                                } else {
                                    continue;
                                }
                            }
                        }
                        A0B = hashMap;
                    } else {
                        Log.i("whatsapplibloader/try-install No need to extract libs again");
                    }
                    Map map = A0B;
                    ArrayList arrayList = new ArrayList(asList);
                    for (String remove : map.keySet()) {
                        arrayList.remove(remove);
                    }
                    if (arrayList.isEmpty()) {
                        Map map2 = A0B;
                        LinkedList<File> linkedList = new LinkedList<>();
                        for (Object obj2 : asList) {
                            linkedList.add(map2.get(obj2));
                        }
                        for (File absolutePath : linkedList) {
                            String absolutePath2 = absolutePath.getAbsolutePath();
                            C18070vi.A0d(absolutePath2, 0);
                            System.load(absolutePath2);
                            StringBuilder sb8 = new StringBuilder();
                            sb8.append("whatsapplibloader/try-install loaded: ");
                            sb8.append(absolutePath2);
                            Log.i(sb8.toString());
                        }
                        zipFile.close();
                    } else {
                        StringBuilder sb9 = new StringBuilder();
                        sb9.append("Libraries not found: ");
                        sb9.append(arrayList.toString());
                        throw new UnsatisfiedLinkError(sb9.toString());
                    }
                } catch (IOException e2) {
                    Log.e("whatsapplibloader/try-install ioerror", e2);
                    unsatisfiedLinkError = new UnsatisfiedLinkError("IOException when install native library");
                    throw unsatisfiedLinkError;
                } catch (Throwable th2) {
                    AnonymousClass0DT.A00(th, th2);
                }
            }
        } catch (Throwable th3) {
            fileOutputStream.close();
        }
        Log.i("whatsapplibloader/system-load-library-with-install end");
        return;
        throw th3;
        throw th;
    }

    public boolean A03() {
        try {
            this.A07.get();
            A01("superpack");
            byte[] bArr = new byte[3];
            try {
                AssetDecompressor.testDecompressorLibraryUsable(bArr);
                if (!Arrays.equals(new byte[]{71, 119, 83}, bArr)) {
                    Log.w("whatsappassetdecompressor/usable compressor test array does not match");
                    return false;
                }
                Log.i("whatsappassetdecompressor/decompressor-usable isLibraryUsable: True");
                return true;
            } catch (UnsatisfiedLinkError e) {
                Log.w("whatsappassetdecompressor/decompressor-usable error while testing compressor library usability testLibraryUsable", e);
                return false;
            }
        } catch (UnsatisfiedLinkError e2) {
            StringBuilder sb = new StringBuilder();
            sb.append("whatsapplibloader/compression library is corrupt/");
            sb.append(e2);
            Log.i(sb.toString());
            A00();
            return false;
        }
    }

    public WhatsAppLibLoader(AnonymousClass190 r2, AnonymousClass118 r3, C19830z4 r4, C17930vS r5, C217017b r6, C224319w r7, AnonymousClass198 r8, AnonymousClass00H r9, AnonymousClass00H r10) {
        this.A08 = r2;
        this.A0A = r9;
        this.A06 = r8;
        this.A09 = r4;
        this.A05 = r7;
        this.A03 = r5;
        this.A04 = r6;
        this.A07 = r10;
        this.A02 = r3;
    }
}
