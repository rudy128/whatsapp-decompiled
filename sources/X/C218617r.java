package X;

import android.media.MediaScannerConnection;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.17r  reason: invalid class name and case insensitive filesystem */
public class C218617r implements C218517q, C201511a {
    public static SimpleDateFormat A07 = new SimpleDateFormat("yyyyww", Locale.US);
    public static final String A08;
    public static final String A09;
    public static final String A0A;
    public static final String A0B;
    public static final String A0C;
    public static final String A0D;
    public static final String A0E;
    public static final String A0F;
    public static final String A0G;
    public static final String A0H;
    public static final String A0I;
    public static final String A0J;
    public static final String A0K;
    public C56272hC A00;
    public final AnonymousClass118 A01;
    public final C18030ve A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass00H A05;
    public final Object A06 = new Object();

    public File A0M(C26551So r5, Integer num, String str, String str2, String str3, boolean z) {
        File A0G2;
        File filesDir;
        String str4;
        File A012 = A01(this, num, true);
        if (A012 != null) {
            return A012;
        }
        if (z) {
            filesDir = this.A01.A00.getFilesDir();
            str4 = "business_activity_report.zip.enc.tmp";
        } else if (C26551So.A0f == r5) {
            filesDir = this.A01.A00.getFilesDir();
            str4 = "payment_background_img.enc.tmp";
        } else {
            if (C26551So.A0O == r5) {
                A0G2 = new File(this.A01.A00.getFilesDir(), A08);
                A07(A0G2, false);
            } else {
                A0G2 = A0G();
                if (str != null) {
                    return A03(A0G2, str, str3, ".enc.tmp");
                }
            }
            return A03(A0G2, str2, str3, ".enc.tmp");
        }
        return new File(filesDir, str4);
    }

    public File A0N(C26551So r7, Integer num, String str, String str2, boolean z, boolean z2) {
        File A0G2;
        File filesDir;
        String str3;
        File A012 = A01(this, num, false);
        if (A012 != null) {
            return A012;
        }
        if (z) {
            filesDir = this.A01.A00.getFilesDir();
            str3 = "business_activity_report.zip.tmp";
        } else {
            if (C26551So.A0O == r7) {
                A0G2 = new File(this.A01.A00.getFilesDir(), A08);
                A07(A0G2, false);
            } else if (C26551So.A0f == r7) {
                filesDir = this.A01.A00.getFilesDir();
                str3 = "payment_background_img.tmp";
            } else if (z2) {
                String l = Long.toString(System.currentTimeMillis(), 36);
                File file = A08().A0B;
                StringBuilder sb = new StringBuilder();
                String str4 = r7.A02;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str4);
                sb2.append("-");
                sb2.append(l);
                sb.append(sb2.toString());
                sb.append(".tmp");
                return new File(file, sb.toString());
            } else {
                A0G2 = A0G();
            }
            return A03(A0G2, str, str2, ".tmp");
        }
        return new File(filesDir, str3);
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append("WhatsApp");
        sb.append(" Audio");
        A0A = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("WhatsApp");
        sb2.append(" Animated Gifs");
        A09 = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append("WhatsApp");
        sb3.append(" Voice Notes");
        A0K = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        sb4.append("WhatsApp");
        sb4.append(" Video Notes");
        A0G = sb4.toString();
        StringBuilder sb5 = new StringBuilder();
        sb5.append("WhatsApp");
        sb5.append(" Video");
        A0J = sb5.toString();
        StringBuilder sb6 = new StringBuilder();
        sb6.append("WhatsApp");
        sb6.append(" Images");
        A0E = sb6.toString();
        StringBuilder sb7 = new StringBuilder();
        sb7.append("WhatsApp");
        sb7.append(" Documents");
        A0D = sb7.toString();
        StringBuilder sb8 = new StringBuilder();
        sb8.append("WhatsApp");
        sb8.append(" Profile Photos");
        A0F = sb8.toString();
        StringBuilder sb9 = new StringBuilder();
        sb9.append("WhatsApp");
        sb9.append(" Calls");
        A0C = sb9.toString();
        StringBuilder sb10 = new StringBuilder();
        sb10.append("WhatsApp");
        sb10.append(" Stickers");
        A0H = sb10.toString();
        StringBuilder sb11 = new StringBuilder();
        sb11.append("WhatsApp");
        sb11.append(" Backup Excluded Stickers");
        A0B = sb11.toString();
        StringBuilder sb12 = new StringBuilder();
        sb12.append("WhatsApp");
        sb12.append(" Sticker Packs");
        A0I = sb12.toString();
        StringBuilder sb13 = new StringBuilder();
        sb13.append("WhatsApp");
        sb13.append(" History Sync");
        A08 = sb13.toString();
    }

    public static File A01(C218617r r4, Integer num, boolean z) {
        String str;
        File filesDir;
        StringBuilder sb;
        String str2;
        StringBuilder sb2 = new StringBuilder();
        if (z) {
            str = ".enc";
        } else {
            str = "";
        }
        sb2.append(str);
        sb2.append(".tmp");
        String obj = sb2.toString();
        if (num == AnonymousClass00R.A01) {
            filesDir = r4.A01.A00.getFilesDir();
            sb = new StringBuilder();
            str2 = "gdpr.zip";
        } else if (num == AnonymousClass00R.A0C) {
            filesDir = r4.A01.A00.getFilesDir();
            sb = new StringBuilder();
            str2 = "channels_gdpr.zip";
        } else if (num != AnonymousClass00R.A0N) {
            return null;
        } else {
            filesDir = r4.A01.A00.getFilesDir();
            sb = new StringBuilder();
            str2 = "wamo_gdpr.zip";
        }
        sb.append(str2);
        sb.append(obj);
        return new File(filesDir, sb.toString());
    }

    public static File A03(File file, String str, String str2, String str3) {
        String name;
        if (str != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str.replace('/', '-'));
            sb.append(str3);
            name = sb.toString();
        } else if (str2 != null) {
            name = new File(str2).getName();
        } else {
            Log.e("fmessageio/getDownloadFile/no_url");
            return null;
        }
        return A02(file, name);
    }

    public static synchronized String A04(File file, String str) {
        String obj;
        boolean z;
        synchronized (C218617r.class) {
            String l = Long.toString(System.currentTimeMillis(), 36);
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("-");
            sb.append(l);
            obj = sb.toString();
            File[] listFiles = file.listFiles(new AnonymousClass3BV(obj, 0));
            if (listFiles != null) {
                do {
                    z = false;
                    for (File name : listFiles) {
                        if (name.getName().equals(obj)) {
                            StringBuilder sb2 = new StringBuilder();
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(str);
                            sb3.append("-");
                            sb3.append(l);
                            sb2.append(sb3.toString());
                            sb2.append(UUID.randomUUID().toString());
                            obj = sb2.toString();
                            z = true;
                        }
                    }
                } while (z);
            }
        }
        return obj;
    }

    public static void A05(C218617r r2, File file) {
        File[] listFiles;
        File file2 = new File(file, ".nomedia");
        if (file2.exists() && file2.delete() && (listFiles = file.listFiles()) != null) {
            r2.A0k((Runnable) null, Arrays.asList(listFiles));
        }
    }

    public static void A06(File file) {
        File file2 = new File(file, ".nomedia");
        if (!file2.exists()) {
            try {
                file2.createNewFile();
            } catch (IOException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("fmessageio/prepareFolder ");
                sb.append(file);
                Log.e(sb.toString(), e);
            }
        }
    }

    public C56272hC A08() {
        C56272hC r0;
        synchronized (this.A06) {
            if (this.A00 == null) {
                Log.i("fmessageio/media-dirs-null");
                A0h();
            }
            r0 = this.A00;
            C17960vV.A07(r0);
        }
        return r0;
    }

    public File A09() {
        File file = new File(this.A01.A00.getCacheDir(), "avatar_image");
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    public File A0A() {
        return new File(this.A01.A00.getFilesDir(), "business_activity_report.zip");
    }

    public File A0B() {
        File file = new File(this.A01.A00.getCacheDir(), "export_chat_folder");
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    public File A0C() {
        File file = new File(this.A01.A00.getCacheDir(), "export_chats");
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    public File A0D() {
        File file = new File(this.A01.A00.getCacheDir(), "flows_responses");
        if (!file.exists() && !file.mkdir()) {
            StringBuilder sb = new StringBuilder();
            sb.append("FMessageIO/getExportFlowsResponsesCsvDirectory/mkdirs failed ");
            sb.append(file.getAbsolutePath());
            Log.e(sb.toString());
        }
        return file;
    }

    public File A0E() {
        File file = new File(this.A01.A00.getCacheDir(), "export_business_activity");
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    public File A0F() {
        File file = new File(this.A01.A00.getCacheDir(), "export_gdpr");
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    public File A0H() {
        File file = new File(this.A01.A00.getFilesDir(), "Payment Backgrounds");
        A07(file, false);
        return file;
    }

    public File A0I() {
        File file = new File(this.A01.A00.getFilesDir(), "Stickers");
        A07(file, false);
        return file;
    }

    public File A0L(C693536w r2) {
        String str;
        String str2 = r2.A05;
        if (str2 == null || AnonymousClass1EG.A0H(str2)) {
            String str3 = r2.A06;
            if (str3 == null || AnonymousClass1EG.A0H(str3)) {
                String str4 = r2.A08;
                if (str4 != null) {
                    return A0c(str4);
                }
                return null;
            }
            str = r2.A06;
        } else {
            str = r2.A05;
        }
        return A0d(str);
    }

    public File A0O(AnonymousClass21V r5) {
        if (!C22971Dz.A0R(r5.A0v.A00) || r5.A19() == null) {
            return A03(A0G(), r5.A05, r5.A07, ".tmp");
        }
        File filesDir = this.A01.A00.getFilesDir();
        StringBuilder sb = new StringBuilder();
        sb.append(r5.A19());
        sb.append(".tmp");
        return new File(filesDir, sb.toString());
    }

    public File A0P(File file) {
        StringBuilder sb = new StringBuilder();
        sb.append(file.getName());
        sb.append(".chck");
        return A02(A0G(), sb.toString());
    }

    public File A0Q(String str) {
        StringBuilder sb = new StringBuilder();
        String A042 = C17970vW.A04(str);
        C17960vV.A07(A042);
        sb.append(A042);
        sb.append("-profilephoto");
        return A02(A0G(), sb.toString());
    }

    public File A0R(String str) {
        StringBuilder sb = new StringBuilder();
        String A042 = C17970vW.A04(str);
        C17960vV.A07(A042);
        sb.append(A042);
        sb.append("-hqthumb");
        return A02(A0G(), sb.toString());
    }

    public File A0S(String str) {
        String str2;
        File filesDir = this.A01.A00.getFilesDir();
        if ("personal".equals(str)) {
            str2 = "dyi.zip";
        } else {
            str2 = "business_dyi.zip";
        }
        return new File(filesDir, str2);
    }

    public File A0X(String str) {
        String str2;
        File cacheDir = this.A01.A00.getCacheDir();
        if ("personal".equals(str)) {
            str2 = "export_personal_dyi";
        } else {
            str2 = "export_business_dyi";
        }
        File file = new File(cacheDir, str2);
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    public File A0Z(String str) {
        File file = new File(this.A01.A00.getCacheDir(), "support");
        if (!file.exists()) {
            file.mkdir();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".zip");
        return new File(file, sb.toString().replaceAll("[?:\\\\/*\"<>|\n\t\r]", ""));
    }

    public File A0f(String str, String str2) {
        return A03(((AnonymousClass1L7) this.A03.get()).A08(".Thumbs"), str, str2, ".prog.thumb.jpg");
    }

    public File A0g(String str, String str2) {
        File A082 = ((AnonymousClass1L7) this.A03.get()).A08(".StickerThumbs");
        A07(A082, false);
        return A03(A082, str, str2, ".thumb.webp");
    }

    public void A0h() {
        synchronized (this.A06) {
            Log.i("fmessageio/initExternalStorageDirectory");
            this.A00 = new C56272hC(this);
        }
    }

    public void A0i(File file, File file2) {
        C64062u9.A0E((AnonymousClass1NL) this.A04.get(), file, file2);
    }

    public void A0j(File file, File file2) {
        C64062u9.A0F((AnonymousClass1NL) this.A04.get(), file, file2, C18020vd.A05(C18040vf.A02, this.A02, 11097));
    }

    public C218617r(AnonymousClass118 r2, C18030ve r3, AnonymousClass00H r4, AnonymousClass00H r5, AnonymousClass00H r6) {
        this.A02 = r3;
        this.A01 = r2;
        this.A03 = r4;
        this.A05 = r5;
        this.A04 = r6;
    }

    public static File A00(C218617r r3, File file, String str) {
        if (AnonymousClass112.A07()) {
            if (C18020vd.A05(C18040vf.A02, r3.A02, 7735)) {
                return C60302nm.A00(r3.A01.A00, str);
            }
        }
        file.getAbsolutePath();
        A07(file, true);
        return file;
    }

    public static File A02(File file, String str) {
        if (file.exists()) {
            if (file.isFile()) {
                file.delete();
            } else if (file.isDirectory()) {
                return new File(file, str);
            }
        }
        if (!file.mkdirs()) {
            Log.e("app/extsharedfile/folder/created/false");
        }
        return new File(file, str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
        if (r2.isDirectory() != false) goto L_0x0030;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A07(java.io.File r2, boolean r3) {
        /*
            boolean r0 = r2.exists()     // Catch:{ all -> 0x0036 }
            if (r0 == 0) goto L_0x000f
            boolean r0 = r2.isFile()     // Catch:{ all -> 0x0036 }
            if (r0 == 0) goto L_0x002a
            r2.delete()     // Catch:{ all -> 0x0036 }
        L_0x000f:
            boolean r0 = r2.mkdirs()     // Catch:{ all -> 0x0036 }
            if (r0 != 0) goto L_0x0030
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0036 }
            r1.<init>()     // Catch:{ all -> 0x0036 }
            java.lang.String r0 = "fmessageio/prepareFolder/mkdirs failed: "
            r1.append(r0)     // Catch:{ all -> 0x0036 }
            r1.append(r2)     // Catch:{ all -> 0x0036 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0036 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0036 }
            goto L_0x0030
        L_0x002a:
            boolean r0 = r2.isDirectory()     // Catch:{ all -> 0x0036 }
            if (r0 == 0) goto L_0x000f
        L_0x0030:
            if (r3 == 0) goto L_0x0035
            A06(r2)     // Catch:{ all -> 0x0036 }
        L_0x0035:
            return
        L_0x0036:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C218617r.A07(java.io.File, boolean):void");
    }

    public File A0G() {
        File file = A08().A04;
        A07(file, true);
        return file;
    }

    public File A0J() {
        File file = A08().A0C;
        A07(file, false);
        return file;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0054, code lost:
        if (r9 != 3) goto L_0x00d2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0054  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.io.File A0K(int r7, int r8, int r9) {
        /*
            r6 = this;
            X.2hC r1 = r6.A08()
            r2 = 4
            r5 = 3
            r4 = 2
            r3 = 1
            if (r7 == r3) goto L_0x00bc
            if (r7 == r4) goto L_0x0095
            if (r7 == r5) goto L_0x0081
            r0 = 9
            if (r7 == r0) goto L_0x0072
            r0 = 13
            if (r7 == r0) goto L_0x0063
            r0 = 20
            if (r7 == r0) goto L_0x0060
            r0 = 23
            if (r7 == r0) goto L_0x00bc
            r0 = 37
            if (r7 == r0) goto L_0x00bc
            r0 = 65
            if (r7 == r0) goto L_0x00d4
            r0 = 81
            if (r7 == r0) goto L_0x009a
            r0 = 105(0x69, float:1.47E-43)
            if (r7 == r0) goto L_0x005d
            r0 = 25
            if (r7 == r0) goto L_0x00bc
            r0 = 26
            if (r7 == r0) goto L_0x0072
            r0 = 28
            if (r7 == r0) goto L_0x0081
            r0 = 29
            if (r7 == r0) goto L_0x0063
            r0 = 42
            if (r7 == r0) goto L_0x005a
            r0 = 43
            if (r7 == r0) goto L_0x005a
        L_0x0046:
            X.00H r0 = r6.A03
            java.lang.Object r0 = r0.get()
            X.1L7 r0 = (X.AnonymousClass1L7) r0
            java.io.File r1 = r0.A05()
        L_0x0052:
            if (r9 == r4) goto L_0x0056
            if (r9 != r5) goto L_0x00d2
        L_0x0056:
            A07(r1, r3)
            return r1
        L_0x005a:
            java.io.File r1 = r1.A0A
            goto L_0x0052
        L_0x005d:
            java.io.File r1 = r1.A06
            goto L_0x0052
        L_0x0060:
            java.io.File r1 = r1.A05
            goto L_0x0052
        L_0x0063:
            if (r9 == r3) goto L_0x006f
            if (r9 == r4) goto L_0x006c
            if (r9 != r5) goto L_0x0046
            java.io.File r1 = r1.A0K
            goto L_0x0056
        L_0x006c:
            java.io.File r1 = r1.A0D
            goto L_0x0056
        L_0x006f:
            java.io.File r1 = r1.A00
            goto L_0x00d2
        L_0x0072:
            r0 = 7
            if (r8 == r0) goto L_0x007e
            if (r9 == r3) goto L_0x00d0
            if (r9 == r4) goto L_0x007e
            if (r9 != r5) goto L_0x0046
            java.io.File r1 = r1.A0M
            goto L_0x0056
        L_0x007e:
            java.io.File r1 = r1.A0F
            goto L_0x0052
        L_0x0081:
            if (r9 == r3) goto L_0x0092
            if (r9 == r4) goto L_0x008f
            if (r9 == r5) goto L_0x008c
            if (r9 != r2) goto L_0x0046
            java.io.File r1 = r1.A09
            goto L_0x00d2
        L_0x008c:
            java.io.File r1 = r1.A0O
            goto L_0x0056
        L_0x008f:
            java.io.File r1 = r1.A0H
            goto L_0x0056
        L_0x0092:
            java.io.File r1 = r1.A0Q
            goto L_0x00d2
        L_0x0095:
            if (r8 != r3) goto L_0x00ad
            java.io.File r2 = r1.A0R
            goto L_0x009c
        L_0x009a:
            java.io.File r2 = r1.A0J
        L_0x009c:
            java.text.SimpleDateFormat r1 = A07
            java.util.Date r0 = new java.util.Date
            r0.<init>()
            java.lang.String r0 = r1.format(r0)
            java.io.File r1 = new java.io.File
            r1.<init>(r2, r0)
            goto L_0x0052
        L_0x00ad:
            if (r9 == r3) goto L_0x00b9
            if (r9 == r4) goto L_0x00b6
            if (r9 != r5) goto L_0x0046
            java.io.File r1 = r1.A0L
            goto L_0x0056
        L_0x00b6:
            java.io.File r1 = r1.A0E
            goto L_0x0056
        L_0x00b9:
            java.io.File r1 = r1.A01
            goto L_0x00d2
        L_0x00bc:
            if (r9 == r3) goto L_0x00cd
            if (r9 == r4) goto L_0x00ca
            if (r9 == r5) goto L_0x00c7
            if (r9 != r2) goto L_0x0046
            java.io.File r1 = r1.A08
            goto L_0x00d2
        L_0x00c7:
            java.io.File r1 = r1.A0N
            goto L_0x0056
        L_0x00ca:
            java.io.File r1 = r1.A0G
            goto L_0x0056
        L_0x00cd:
            java.io.File r1 = r1.A07
            goto L_0x00d2
        L_0x00d0:
            java.io.File r1 = r1.A03
        L_0x00d2:
            r3 = 0
            goto L_0x0056
        L_0x00d4:
            java.io.File r1 = r6.A0H()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C218617r.A0K(int, int, int):java.io.File");
    }

    public File A0T(String str) {
        File A0B2 = A0B();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".zip");
        return new File(A0B2, sb.toString().replaceAll("[?:\\\\/*\"<>|\n\t\r]", ""));
    }

    public File A0U(String str) {
        File A0C2 = A0C();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".txt");
        return new File(A0C2, sb.toString().replaceAll("[?:\\\\/*\"<>|\n\t\r]", ""));
    }

    public File A0V(String str) {
        File A0D2 = A0D();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".csv");
        return new File(A0D2, sb.toString().replaceAll("[?:\\\\/*\"<>|\n\t\r]", ""));
    }

    public File A0W(String str) {
        File A0E2 = A0E();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".zip");
        return new File(A0E2, sb.toString().replaceAll("[?:\\\\/*\"<>|\n\t\r]", ""));
    }

    public File A0Y(String str) {
        File A0F2 = A0F();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".zip");
        return new File(A0F2, sb.toString().replaceAll("[?:\\\\/*\"<>|\n\t\r]", ""));
    }

    public File A0a(String str) {
        return A02(A0G(), str);
    }

    public File A0b(String str) {
        File file = A08().A0B;
        A07(file, false);
        return A02(file, str);
    }

    public File A0c(String str) {
        File file = A08().A0U;
        A07(file, false);
        C17960vV.A07(str);
        return A02(file, str);
    }

    public File A0d(String str) {
        String A042 = C17970vW.A04(str);
        File file = A08().A0U;
        A07(file, false);
        C17960vV.A07(A042);
        return A02(file, A042);
    }

    public File A0e(String str, String str2) {
        File A0X = A0X(str2);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".zip");
        return new File(A0X, sb.toString().replaceAll("[?:\\\\/*\"<>|\n\t\r]", ""));
    }

    public void A0k(Runnable runnable, List list) {
        int size = list.size();
        String[] strArr = new String[list.size()];
        for (int i = 0; i < size; i++) {
            strArr[i] = ((File) list.get(i)).getAbsolutePath();
        }
        MediaScannerConnection.scanFile(this.A01.A00, strArr, (String[]) null, new C64272uV(runnable, new AtomicInteger(size)));
    }

    public boolean A0l(File file) {
        return file.getCanonicalPath().startsWith(A08().A0C.getCanonicalPath());
    }

    public boolean A0m(File file) {
        if (file.getCanonicalPath().startsWith(A08().A04.getCanonicalPath()) || file.getCanonicalPath().startsWith(A08().A0B.getCanonicalPath())) {
            return true;
        }
        return false;
    }

    public boolean A0n(File file) {
        if (!A0l(file)) {
            return false;
        }
        String canonicalPath = file.getCanonicalPath();
        C56272hC A082 = A08();
        if (canonicalPath.startsWith(A082.A0K.getCanonicalPath()) || canonicalPath.startsWith(A082.A0L.getCanonicalPath()) || canonicalPath.startsWith(A082.A0M.getCanonicalPath()) || canonicalPath.startsWith(A082.A0N.getCanonicalPath()) || canonicalPath.startsWith(A082.A0O.getCanonicalPath()) || canonicalPath.startsWith(A082.A0P.getCanonicalPath()) || canonicalPath.startsWith(A082.A0D.getCanonicalPath()) || canonicalPath.startsWith(A082.A0E.getCanonicalPath()) || canonicalPath.startsWith(A082.A0F.getCanonicalPath()) || canonicalPath.startsWith(A082.A0G.getCanonicalPath()) || canonicalPath.startsWith(A082.A0H.getCanonicalPath()) || canonicalPath.startsWith(A082.A05.getCanonicalPath()) || canonicalPath.startsWith(A082.A02.getCanonicalPath()) || canonicalPath.startsWith(A082.A06.getCanonicalPath()) || canonicalPath.startsWith(A082.A0J.getCanonicalPath()) || canonicalPath.startsWith(A082.A0R.getCanonicalPath()) || canonicalPath.startsWith(A082.A0T.getCanonicalPath())) {
            return false;
        }
        return true;
    }
}
