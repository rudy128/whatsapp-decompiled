package X;

/* renamed from: X.1Dc  reason: invalid class name and case insensitive filesystem */
public class C22761Dc {
    public static C22741Da A02;
    public final AnonymousClass1XD A00;
    public final AnonymousClass1XG A01;

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0139, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        r2 = r6.toString();
        r8 = r9.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0149, code lost:
        if (r8.A2b("decompression_failure_reported_timestamp", 86400000) != false) goto L_0x014b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x014b, code lost:
        r4 = new X.C46602Fe();
        r4.A01 = r7;
        r4.A02 = r2;
        r4.A00 = java.lang.Double.valueOf((double) ((X.AnonymousClass11Z) r9.A04.get()).A02());
        r9.A01.CC7(r4);
        r8.A1i("decompression_failure_reported_timestamp");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x016f, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append("Error decompressing archive ");
        r1.append(r7);
        com.whatsapp.util.Log.w(r1.toString(), r6);
        r1 = new java.io.IOException(r6.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x022d, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x022e, code lost:
        r3 = null;
        r8 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x022d A[ExcHandler: IOException | IndexOutOfBoundsException (e java.lang.Throwable), Splitter:B:1:0x0016] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass1XD A00(android.content.Context r19, android.content.res.Resources r20, java.lang.String r21, java.util.Locale r22, boolean r23) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r4 = r21
            r0.append(r4)
            java.lang.String r10 = ".pack"
            r0.append(r10)
            java.lang.String r6 = r0.toString()
            r15 = 0
            r1 = 1
            r14 = 0
            java.lang.Boolean r0 = X.C17970vW.A03     // Catch:{ IOException | IndexOutOfBoundsException -> 0x022d, all -> 0x022a }
            r0 = 0
            r2 = r23
            if (r23 != 0) goto L_0x001e
            r0 = 1
        L_0x001e:
            r8 = r19
            java.io.File r9 = r8.getFilesDir()     // Catch:{ IOException | IndexOutOfBoundsException -> 0x022d, all -> 0x022a }
            if (r0 == 0) goto L_0x018d
            java.lang.Class<X.00c> r0 = X.C000100c.class
            java.lang.Object r0 = X.AnonymousClass00E.A00(r8, r0)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x022d, all -> 0x022a }
            X.00c r0 = (X.C000100c) r0     // Catch:{ IOException | IndexOutOfBoundsException -> 0x022d, all -> 0x022a }
            X.10E r0 = (X.AnonymousClass10E) r0     // Catch:{ IOException | IndexOutOfBoundsException -> 0x022d, all -> 0x022a }
            X.10E r0 = r0.Ao8     // Catch:{ IOException | IndexOutOfBoundsException -> 0x022d, all -> 0x022a }
            X.10G r0 = r0.A00     // Catch:{ IOException | IndexOutOfBoundsException -> 0x022d, all -> 0x022a }
            X.00S r0 = r0.A5F     // Catch:{ IOException | IndexOutOfBoundsException -> 0x022d, all -> 0x022a }
            java.lang.Object r9 = r0.get()     // Catch:{ IOException | IndexOutOfBoundsException -> 0x022d, all -> 0x022a }
            X.2q1 r9 = (X.C61642q1) r9     // Catch:{ IOException | IndexOutOfBoundsException -> 0x022d, all -> 0x022a }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException | IndexOutOfBoundsException -> 0x022d, all -> 0x022a }
            r3.<init>()     // Catch:{ IOException | IndexOutOfBoundsException -> 0x022d, all -> 0x022a }
            r3.append(r4)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x022d, all -> 0x022a }
            java.lang.String r0 = ".spo"
            r3.append(r0)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x022d, all -> 0x022a }
            java.lang.String r7 = r3.toString()     // Catch:{ IOException | IndexOutOfBoundsException -> 0x022d, all -> 0x022a }
            X.0vS r0 = r9.A02     // Catch:{ IOException | IndexOutOfBoundsException -> 0x022d, all -> 0x022a }
            java.io.File r0 = r0.A01()     // Catch:{ IOException | IndexOutOfBoundsException -> 0x022d, all -> 0x022a }
            java.lang.String r11 = "decompressed"
            java.io.File r3 = new java.io.File     // Catch:{ IOException | IndexOutOfBoundsException -> 0x022d, all -> 0x022a }
            r3.<init>(r0, r11)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x022d, all -> 0x022a }
            java.io.File r0 = new java.io.File     // Catch:{ IOException | IndexOutOfBoundsException -> 0x022d, all -> 0x022a }
            r0.<init>(r3, r7)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x022d, all -> 0x022a }
            java.io.File r5 = new java.io.File     // Catch:{ IOException | IndexOutOfBoundsException -> 0x022d, all -> 0x022a }
            r5.<init>(r0, r6)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x022d, all -> 0x022a }
            boolean r0 = r5.exists()     // Catch:{ IOException | IndexOutOfBoundsException -> 0x022d, all -> 0x022a }
            if (r0 == 0) goto L_0x007b
            X.19w r0 = r9.A03     // Catch:{ IOException | IndexOutOfBoundsException -> 0x022d, all -> 0x022a }
            boolean r0 = r0.A06(r7)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x022d, all -> 0x022a }
            if (r0 == 0) goto L_0x007b
        L_0x0072:
            java.lang.String r0 = "r"
            java.io.RandomAccessFile r3 = new java.io.RandomAccessFile     // Catch:{ IOException | IndexOutOfBoundsException -> 0x022d, all -> 0x022a }
            r3.<init>(r5, r0)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x022d, all -> 0x022a }
            goto L_0x01e7
        L_0x007b:
            long r12 = android.os.SystemClock.uptimeMillis()     // Catch:{ Exception -> 0x0139, IOException | IndexOutOfBoundsException -> 0x022d }
            X.19w r10 = r9.A03     // Catch:{ Exception -> 0x0139, IOException | IndexOutOfBoundsException -> 0x022d }
            boolean r0 = r10.A01     // Catch:{ Exception -> 0x0139, IOException | IndexOutOfBoundsException -> 0x022d }
            X.C17960vV.A0D(r0)     // Catch:{ Exception -> 0x0139, IOException | IndexOutOfBoundsException -> 0x022d }
            X.0vS r4 = r10.A03     // Catch:{ Exception -> 0x0139, IOException | IndexOutOfBoundsException -> 0x022d }
            java.io.File r3 = r4.A01()     // Catch:{ Exception -> 0x0139, IOException | IndexOutOfBoundsException -> 0x022d }
            java.io.File r0 = new java.io.File     // Catch:{ Exception -> 0x0139, IOException | IndexOutOfBoundsException -> 0x022d }
            r0.<init>(r3, r11)     // Catch:{ Exception -> 0x0139, IOException | IndexOutOfBoundsException -> 0x022d }
            java.io.File r6 = new java.io.File     // Catch:{ Exception -> 0x0139, IOException | IndexOutOfBoundsException -> 0x022d }
            r6.<init>(r0, r7)     // Catch:{ Exception -> 0x0139, IOException | IndexOutOfBoundsException -> 0x022d }
            X.C224319w.A02(r4)     // Catch:{ Exception -> 0x0139, IOException | IndexOutOfBoundsException -> 0x022d }
            boolean r0 = r6.exists()     // Catch:{ Exception -> 0x0139, IOException | IndexOutOfBoundsException -> 0x022d }
            if (r0 != 0) goto L_0x00a2
            r6.mkdir()     // Catch:{ Exception -> 0x0139, IOException | IndexOutOfBoundsException -> 0x022d }
        L_0x00a2:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0139, IOException | IndexOutOfBoundsException -> 0x022d }
            r3.<init>()     // Catch:{ Exception -> 0x0139, IOException | IndexOutOfBoundsException -> 0x022d }
            java.lang.String r0 = "compressed/"
            r3.append(r0)     // Catch:{ Exception -> 0x0139, IOException | IndexOutOfBoundsException -> 0x022d }
            java.lang.String r0 = "strings"
            r3.append(r0)     // Catch:{ Exception -> 0x0139, IOException | IndexOutOfBoundsException -> 0x022d }
            java.lang.String r0 = "/"
            r3.append(r0)     // Catch:{ Exception -> 0x0139, IOException | IndexOutOfBoundsException -> 0x022d }
            r3.append(r7)     // Catch:{ Exception -> 0x0139, IOException | IndexOutOfBoundsException -> 0x022d }
            java.lang.String r11 = r3.toString()     // Catch:{ Exception -> 0x0139, IOException | IndexOutOfBoundsException -> 0x022d }
            java.lang.String r0 = "."
            int r0 = r7.lastIndexOf(r0)     // Catch:{ Exception -> 0x0139, IOException | IndexOutOfBoundsException -> 0x022d }
            int r0 = r0 + 1
            java.lang.String r4 = r7.substring(r0)     // Catch:{ Exception -> 0x0139, IOException | IndexOutOfBoundsException -> 0x022d }
            android.content.res.AssetManager r3 = r8.getAssets()     // Catch:{ AssetDecompressionException -> 0x00f8 }
            java.lang.String r0 = r6.getAbsolutePath()     // Catch:{ AssetDecompressionException -> 0x00f8 }
            java.lang.String[] r0 = com.facebook.superpack.AssetDecompressor.decompress(r3, r11, r4, r0)     // Catch:{ AssetDecompressionException -> 0x00f8 }
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch:{ Exception -> 0x0139, IOException | IndexOutOfBoundsException -> 0x022d }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ Exception -> 0x0139, IOException | IndexOutOfBoundsException -> 0x022d }
            r4.<init>(r0)     // Catch:{ Exception -> 0x0139, IOException | IndexOutOfBoundsException -> 0x022d }
            X.10I r3 = r10.A05     // Catch:{ all -> 0x00f6 }
            r21 = 21
            X.7Py r0 = new X.7Py     // Catch:{ all -> 0x00f6 }
            r19 = r6
            r20 = r4
            r17 = r10
            r18 = r8
            r16 = r0
            r16.<init>(r17, r18, r19, r20, r21)     // Catch:{ all -> 0x00f6 }
            r3.CGF(r0)     // Catch:{ all -> 0x00f6 }
            goto L_0x00ff
        L_0x00f6:
            r1 = move-exception
            goto L_0x0138
        L_0x00f8:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ Exception -> 0x0139, IOException | IndexOutOfBoundsException -> 0x022d }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0139, IOException | IndexOutOfBoundsException -> 0x022d }
            goto L_0x0138
        L_0x00ff:
            java.util.Set r0 = r10.A06     // Catch:{ Exception -> 0x0139, IOException | IndexOutOfBoundsException -> 0x022d }
            r0.add(r7)     // Catch:{ Exception -> 0x0139, IOException | IndexOutOfBoundsException -> 0x022d }
            int r0 = r4.size()     // Catch:{ Exception -> 0x0139, IOException | IndexOutOfBoundsException -> 0x022d }
            if (r0 <= 0) goto L_0x012b
            long r10 = android.os.SystemClock.uptimeMillis()     // Catch:{ Exception -> 0x0139, IOException | IndexOutOfBoundsException -> 0x022d }
            long r10 = r10 - r12
            boolean r4 = X.C22781De.A03()     // Catch:{ Exception -> 0x0139, IOException | IndexOutOfBoundsException -> 0x022d }
            X.2Ff r3 = new X.2Ff     // Catch:{ Exception -> 0x0139, IOException | IndexOutOfBoundsException -> 0x022d }
            r3.<init>()     // Catch:{ Exception -> 0x0139, IOException | IndexOutOfBoundsException -> 0x022d }
            r3.A02 = r7     // Catch:{ Exception -> 0x0139, IOException | IndexOutOfBoundsException -> 0x022d }
            java.lang.Long r0 = java.lang.Long.valueOf(r10)     // Catch:{ Exception -> 0x0139, IOException | IndexOutOfBoundsException -> 0x022d }
            r3.A01 = r0     // Catch:{ Exception -> 0x0139, IOException | IndexOutOfBoundsException -> 0x022d }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)     // Catch:{ Exception -> 0x0139, IOException | IndexOutOfBoundsException -> 0x022d }
            r3.A00 = r0     // Catch:{ Exception -> 0x0139, IOException | IndexOutOfBoundsException -> 0x022d }
            X.18K r0 = r9.A01     // Catch:{ Exception -> 0x0139, IOException | IndexOutOfBoundsException -> 0x022d }
            r0.CC7(r3)     // Catch:{ Exception -> 0x0139, IOException | IndexOutOfBoundsException -> 0x022d }
        L_0x012b:
            boolean r0 = r5.exists()     // Catch:{ Exception -> 0x0139, IOException | IndexOutOfBoundsException -> 0x022d }
            if (r0 != 0) goto L_0x0072
            java.lang.String r0 = "Decompression failed: File does not exist"
            java.io.IOException r1 = new java.io.IOException     // Catch:{ Exception -> 0x0139, IOException | IndexOutOfBoundsException -> 0x022d }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0139, IOException | IndexOutOfBoundsException -> 0x022d }
        L_0x0138:
            throw r1     // Catch:{ Exception -> 0x0139, IOException | IndexOutOfBoundsException -> 0x022d }
        L_0x0139:
            r6 = move-exception
            java.lang.String r2 = r6.toString()     // Catch:{ IOException | IndexOutOfBoundsException -> 0x022d, all -> 0x022a }
            X.0z4 r8 = r9.A00     // Catch:{ IOException | IndexOutOfBoundsException -> 0x022d, all -> 0x022a }
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            java.lang.String r5 = "decompression_failure_reported_timestamp"
            boolean r0 = r8.A2b(r5, r0)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x022d, all -> 0x022a }
            if (r0 == 0) goto L_0x016f
            X.2Fe r4 = new X.2Fe     // Catch:{ IOException | IndexOutOfBoundsException -> 0x022d, all -> 0x022a }
            r4.<init>()     // Catch:{ IOException | IndexOutOfBoundsException -> 0x022d, all -> 0x022a }
            r4.A01 = r7     // Catch:{ IOException | IndexOutOfBoundsException -> 0x022d, all -> 0x022a }
            r4.A02 = r2     // Catch:{ IOException | IndexOutOfBoundsException -> 0x022d, all -> 0x022a }
            X.00H r0 = r9.A04     // Catch:{ IOException | IndexOutOfBoundsException -> 0x022d, all -> 0x022a }
            java.lang.Object r0 = r0.get()     // Catch:{ IOException | IndexOutOfBoundsException -> 0x022d, all -> 0x022a }
            X.11Z r0 = (X.AnonymousClass11Z) r0     // Catch:{ IOException | IndexOutOfBoundsException -> 0x022d, all -> 0x022a }
            long r2 = r0.A02()     // Catch:{ IOException | IndexOutOfBoundsException -> 0x022d, all -> 0x022a }
            double r0 = (double) r2     // Catch:{ IOException | IndexOutOfBoundsException -> 0x022d, all -> 0x022a }
            java.lang.Double r0 = java.lang.Double.valueOf(r0)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x022d, all -> 0x022a }
            r4.A00 = r0     // Catch:{ IOException | IndexOutOfBoundsException -> 0x022d, all -> 0x022a }
            X.18K r0 = r9.A01     // Catch:{ IOException | IndexOutOfBoundsException -> 0x022d, all -> 0x022a }
            r0.CC7(r4)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x022d, all -> 0x022a }
            r8.A1i(r5)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x022d, all -> 0x022a }
        L_0x016f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException | IndexOutOfBoundsException -> 0x022d, all -> 0x022a }
            r1.<init>()     // Catch:{ IOException | IndexOutOfBoundsException -> 0x022d, all -> 0x022a }
            java.lang.String r0 = "Error decompressing archive "
            r1.append(r0)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x022d, all -> 0x022a }
            r1.append(r7)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x022d, all -> 0x022a }
            java.lang.String r0 = r1.toString()     // Catch:{ IOException | IndexOutOfBoundsException -> 0x022d, all -> 0x022a }
            com.whatsapp.util.Log.w(r0, r6)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x022d, all -> 0x022a }
            java.lang.String r0 = r6.getMessage()     // Catch:{ IOException | IndexOutOfBoundsException -> 0x022d, all -> 0x022a }
            java.io.IOException r1 = new java.io.IOException     // Catch:{ IOException | IndexOutOfBoundsException -> 0x022d, all -> 0x022a }
            r1.<init>(r0)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x022d, all -> 0x022a }
            goto L_0x01e6
        L_0x018d:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException | IndexOutOfBoundsException -> 0x022d, all -> 0x022a }
            r5.<init>()     // Catch:{ IOException | IndexOutOfBoundsException -> 0x022d, all -> 0x022a }
            r5.append(r4)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x022d, all -> 0x022a }
            java.lang.String r0 = "_"
            r5.append(r0)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x022d, all -> 0x022a }
            java.lang.String r3 = r8.getPackageCodePath()     // Catch:{ IOException | IndexOutOfBoundsException -> 0x022d, all -> 0x022a }
            java.io.File r0 = new java.io.File     // Catch:{ IOException | IndexOutOfBoundsException -> 0x022d, all -> 0x022a }
            r0.<init>(r3)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x022d, all -> 0x022a }
            long r7 = r0.lastModified()     // Catch:{ IOException | IndexOutOfBoundsException -> 0x022d, all -> 0x022a }
            r3 = 1000(0x3e8, double:4.94E-321)
            long r7 = r7 / r3
            r5.append(r7)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x022d, all -> 0x022a }
            r5.append(r10)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x022d, all -> 0x022a }
            java.lang.String r0 = r5.toString()     // Catch:{ IOException | IndexOutOfBoundsException -> 0x022d, all -> 0x022a }
            java.io.File r5 = new java.io.File     // Catch:{ IOException | IndexOutOfBoundsException -> 0x022d, all -> 0x022a }
            r5.<init>(r9, r0)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x022d, all -> 0x022a }
            boolean r0 = r5.exists()     // Catch:{ IOException | IndexOutOfBoundsException -> 0x022d, all -> 0x022a }
            if (r0 != 0) goto L_0x0072
            java.lang.String r0 = "extracted_pack_file.pack.tmp"
            java.io.File r4 = new java.io.File     // Catch:{ IOException | IndexOutOfBoundsException -> 0x022d, all -> 0x022a }
            r4.<init>(r9, r0)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x022d, all -> 0x022a }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ IOException | IndexOutOfBoundsException -> 0x022d, all -> 0x022a }
            r3.<init>(r4)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x022d, all -> 0x022a }
            android.content.res.AssetManager r0 = r20.getAssets()     // Catch:{ IOException | IndexOutOfBoundsException -> 0x022d, all -> 0x022a }
            java.io.InputStream r0 = r0.open(r6)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x022d, all -> 0x022a }
            X.C64062u9.A00(r0, r3)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x022d, all -> 0x022a }
            r3.close()     // Catch:{ IOException | IndexOutOfBoundsException -> 0x022d, all -> 0x022a }
            boolean r0 = r4.renameTo(r5)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x022d, all -> 0x022a }
            if (r0 != 0) goto L_0x0072
            java.lang.String r0 = "Renaming temp file failed"
            java.io.IOException r1 = new java.io.IOException     // Catch:{ IOException | IndexOutOfBoundsException -> 0x022d, all -> 0x022a }
            r1.<init>(r0)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x022d, all -> 0x022a }
        L_0x01e6:
            throw r1     // Catch:{ IOException | IndexOutOfBoundsException -> 0x022d, all -> 0x022a }
        L_0x01e7:
            java.nio.channels.FileChannel r8 = r3.getChannel()     // Catch:{ IOException | IndexOutOfBoundsException -> 0x0227, all -> 0x024e }
            java.nio.channels.FileChannel$MapMode r9 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch:{ IOException | IndexOutOfBoundsException -> 0x0225 }
            long r12 = r5.length()     // Catch:{ IOException | IndexOutOfBoundsException -> 0x0225 }
            r10 = 0
            java.nio.MappedByteBuffer r6 = r8.map(r9, r10, r12)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x0225 }
            r7 = r22
            java.util.List r5 = A01(r7, r2)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x0225 }
            boolean r0 = r5.isEmpty()     // Catch:{ IOException | IndexOutOfBoundsException -> 0x0225 }
            if (r0 == 0) goto L_0x0219
            java.util.Locale r4 = java.util.Locale.US     // Catch:{ IOException | IndexOutOfBoundsException -> 0x0225 }
            java.lang.String r2 = "translations/loadData error: locale '%s' not supported"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ IOException | IndexOutOfBoundsException -> 0x0225 }
            java.lang.String[] r0 = X.AnonymousClass1X0.A04     // Catch:{ IOException | IndexOutOfBoundsException -> 0x0225 }
            java.lang.String r0 = r7.toLanguageTag()     // Catch:{ IOException | IndexOutOfBoundsException -> 0x0225 }
            r1[r14] = r0     // Catch:{ IOException | IndexOutOfBoundsException -> 0x0225 }
            java.lang.String r0 = java.lang.String.format(r4, r2, r1)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x0225 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x0225 }
        L_0x0219:
            X.1XD r0 = new X.1XD     // Catch:{ IOException | IndexOutOfBoundsException -> 0x0225 }
            r0.<init>(r6, r5)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x0225 }
            X.AnonymousClass1EY.A02(r3)
            X.AnonymousClass1EY.A02(r8)
            return r0
        L_0x0225:
            r2 = move-exception
            goto L_0x0230
        L_0x0227:
            r2 = move-exception
            r8 = r15
            goto L_0x0230
        L_0x022a:
            r0 = move-exception
            r8 = r15
            goto L_0x0251
        L_0x022d:
            r2 = move-exception
            r3 = r15
            r8 = r15
        L_0x0230:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x024c }
            r1.<init>()     // Catch:{ all -> 0x024c }
            java.lang.String r0 = "translations/loadData error:"
            r1.append(r0)     // Catch:{ all -> 0x024c }
            r1.append(r2)     // Catch:{ all -> 0x024c }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x024c }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x024c }
            X.AnonymousClass1EY.A02(r3)
            X.AnonymousClass1EY.A02(r8)
            return r15
        L_0x024c:
            r0 = move-exception
            goto L_0x0250
        L_0x024e:
            r0 = move-exception
            r8 = r15
        L_0x0250:
            r15 = r3
        L_0x0251:
            X.AnonymousClass1EY.A02(r15)
            X.AnonymousClass1EY.A02(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22761Dc.A00(android.content.Context, android.content.res.Resources, java.lang.String, java.util.Locale, boolean):X.1XD");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.String} */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0025, code lost:
        if (r1.equals(r2) == false) goto L_0x0027;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C22761Dc(android.content.Context r5, android.content.res.Resources r6, X.AnonymousClass1XG r7, java.util.Locale r8) {
        /*
            r4 = this;
            r4.<init>()
            java.lang.String[] r0 = X.AnonymousClass1X0.A04
            java.lang.String r1 = "en"
            java.lang.String r0 = r8.getLanguage()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0027
            java.lang.String r3 = r8.getCountry()
            java.lang.String r2 = "en-US"
            r1 = r2
            X.1LB r0 = X.AnonymousClass1X1.A00     // Catch:{ IllegalArgumentException -> 0x0021 }
            java.lang.Object r0 = r0.A01(r3)     // Catch:{ IllegalArgumentException -> 0x0021 }
            if (r0 == 0) goto L_0x0021
            r2 = r0
        L_0x0021:
            boolean r0 = r1.equals(r2)
            if (r0 != 0) goto L_0x0047
        L_0x0027:
            java.lang.String r2 = X.AnonymousClass1X0.A05(r8)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0045 }
            r1.<init>()     // Catch:{ all -> 0x0045 }
            java.lang.String r0 = "strings_"
            r1.append(r0)     // Catch:{ all -> 0x0045 }
            r1.append(r2)     // Catch:{ all -> 0x0045 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0045 }
            r0 = 0
            X.1XD r0 = A00(r5, r6, r1, r8, r0)     // Catch:{ all -> 0x0045 }
            r4.A00 = r0     // Catch:{ all -> 0x0045 }
            goto L_0x0047
        L_0x0045:
            r0 = move-exception
            throw r0
        L_0x0047:
            r4.A01 = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22761Dc.<init>(android.content.Context, android.content.res.Resources, X.1XG, java.util.Locale):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x00b7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List A01(java.util.Locale r8, boolean r9) {
        /*
            java.lang.String r5 = r8.getLanguage()
            java.lang.String r0 = "he"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0040
            java.lang.String r5 = "iw"
        L_0x000e:
            java.lang.String r0 = "fil"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x0034
            java.lang.String r5 = "tl"
        L_0x0019:
            java.lang.String r4 = r8.getCountry()
            java.lang.String r2 = X.AnonymousClass1X0.A02(r8)
            r3 = 2
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r3)
            if (r9 != 0) goto L_0x0060
            java.lang.String r0 = "en"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x0060
            java.lang.String r6 = "en-US"
            goto L_0x0057
        L_0x0034:
            int r1 = r5.length()
            r0 = 3
            if (r1 != r0) goto L_0x0019
            java.util.List r0 = java.util.Collections.emptyList()
            return r0
        L_0x0040:
            java.lang.String r0 = "yi"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x004c
            java.lang.String r5 = "ji"
            goto L_0x000e
        L_0x004c:
            java.lang.String r0 = "id"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x000e
            java.lang.String r5 = "in"
            goto L_0x000e
        L_0x0057:
            X.1LB r0 = X.AnonymousClass1X1.A00     // Catch:{ IllegalArgumentException -> 0x00ae }
            java.lang.Object r0 = r0.A01(r4)     // Catch:{ IllegalArgumentException -> 0x00ae }
            if (r0 == 0) goto L_0x00ae
            goto L_0x00ad
        L_0x0060:
            java.lang.String r7 = "pt"
            boolean r0 = r7.equals(r5)
            if (r0 == 0) goto L_0x007a
            X.016 r6 = X.AnonymousClass1XF.A00
            java.lang.String r0 = r8.getCountry()
            boolean r0 = r6.contains(r0)
            if (r0 != 0) goto L_0x0076
            java.lang.String r7 = "pt-BR"
        L_0x0076:
            r1.add(r7)
            goto L_0x00b1
        L_0x007a:
            java.lang.String r0 = "zh"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x009b
            java.lang.String r0 = "Hans"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x008f
            java.lang.String r6 = "zh-CN"
            goto L_0x00ae
        L_0x008f:
            java.lang.String r0 = "Hant"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x00b1
            java.lang.String r6 = "zh-TW"
            goto L_0x00ae
        L_0x009b:
            java.util.Locale r0 = java.util.Locale.forLanguageTag(r5)
            java.lang.String r0 = X.AnonymousClass1X0.A02(r0)
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x00b1
            r1.add(r5)
            goto L_0x00b1
        L_0x00ad:
            r6 = r0
        L_0x00ae:
            r1.add(r6)
        L_0x00b1:
            int r0 = r4.length()
            if (r0 != r3) goto L_0x00ef
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r5)
            java.lang.String r0 = "-"
            r3.append(r0)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x00de
            r0 = 0
            java.lang.Object r0 = r1.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x00ef
        L_0x00de:
            java.util.Locale r0 = java.util.Locale.forLanguageTag(r3)
            java.lang.String r0 = X.AnonymousClass1X0.A02(r0)
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x00ef
            r1.add(r3)
        L_0x00ef:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22761Dc.A01(java.util.Locale, boolean):java.util.List");
    }

    public static void A02(C22741Da r0) {
        A02 = r0;
    }
}
