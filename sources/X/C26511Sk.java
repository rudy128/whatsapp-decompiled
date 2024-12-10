package X;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Pair;
import android.webkit.MimeTypeMap;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;

/* renamed from: X.1Sk  reason: invalid class name and case insensitive filesystem */
public class C26511Sk {
    public static int A00 = -1;
    public static String A01;
    public static final byte[] A02 = {-1, -39};

    public static Bitmap A07(Bitmap bitmap, Matrix matrix, int i, int i2) {
        String str;
        Matrix matrix2 = matrix;
        Bitmap bitmap2 = bitmap;
        if (matrix != null) {
            Log.i("sample_rotate_image/rotate");
            try {
                Bitmap createBitmap = Bitmap.createBitmap(bitmap2, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix2, true);
                if (bitmap2 != createBitmap) {
                    bitmap2.recycle();
                }
                bitmap2 = createBitmap;
            } catch (OutOfMemoryError e) {
                e = e;
                str = "sample_rotate_image/rotate/out-of-memory";
                Log.e(str);
                bitmap2.recycle();
                throw e;
            }
        }
        if (i2 <= 0 || (bitmap2.getWidth() <= i2 && bitmap2.getHeight() <= i2)) {
            return bitmap2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("sample_rotate_image/scale/");
        sb.append(bitmap2.getWidth());
        sb.append(" | ");
        sb.append(bitmap2.getHeight());
        Log.i(sb.toString());
        float f = (float) i;
        float max = Math.max(((float) bitmap2.getWidth()) / f, ((float) bitmap2.getHeight()) / f);
        Rect rect = new Rect(0, 0, (int) (((float) bitmap2.getWidth()) / max), (int) (((float) bitmap2.getHeight()) / max));
        rect.right = Math.max(rect.right, 1);
        rect.bottom = Math.max(rect.bottom, 1);
        Rect rect2 = new Rect(0, 0, bitmap2.getWidth(), bitmap2.getHeight());
        Bitmap.Config config = bitmap2.getConfig();
        try {
            int width = rect.width();
            int height = rect.height();
            if (config == null) {
                config = Bitmap.Config.ARGB_8888;
            }
            Bitmap createBitmap2 = Bitmap.createBitmap(width, height, config);
            Canvas canvas = new Canvas(createBitmap2);
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setFilterBitmap(true);
            paint.setDither(true);
            canvas.drawBitmap(bitmap2, rect2, rect, paint);
            bitmap2.recycle();
            return createBitmap2;
        } catch (OutOfMemoryError e2) {
            e = e2;
            str = "sample_rotate_image/scale/out-of-memory";
            Log.e(str);
            bitmap2.recycle();
            throw e;
        }
    }

    public static File A0E(C218617r r6, C18010vc r7, C26551So r8, File file, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(".");
        sb.append(C64062u9.A09(file.getAbsolutePath()));
        return A0G(r6, r7, r8, sb.toString(), i, 3);
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:210)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public static java.io.File A0G(X.C218617r r8, X.C18010vc r9, X.C26551So r10, java.lang.String r11, int r12, int r13) {
        /*
            r3 = 0
        L_0x0001:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.Class<X.1Sk> r7 = X.C26511Sk.class
            monitor-enter(r7)
            A0P(r8, r9)     // Catch:{ all -> 0x00ab }
            java.lang.String r0 = X.C19620yd.A09     // Catch:{ all -> 0x00ab }
            android.content.SharedPreferences r0 = r9.A05(r0)     // Catch:{ all -> 0x00ab }
            android.content.SharedPreferences$Editor r5 = r0.edit()     // Catch:{ all -> 0x00ab }
            java.util.Date r6 = new java.util.Date     // Catch:{ all -> 0x00ab }
            r6.<init>()     // Catch:{ all -> 0x00ab }
            java.lang.String r4 = "yyyyMMdd"
            java.util.Locale r1 = java.util.Locale.US     // Catch:{ all -> 0x00ab }
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat     // Catch:{ all -> 0x00ab }
            r0.<init>(r4, r1)     // Catch:{ all -> 0x00ab }
            java.lang.String r1 = r0.format(r6)     // Catch:{ all -> 0x00ab }
            java.lang.String r0 = A01     // Catch:{ all -> 0x00ab }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x00ab }
            if (r0 != 0) goto L_0x003b
            r0 = 0
            A00 = r0     // Catch:{ all -> 0x00ab }
            A01 = r1     // Catch:{ all -> 0x00ab }
            java.lang.String r0 = "file_date"
            r5.putString(r0, r1)     // Catch:{ all -> 0x00ab }
        L_0x003b:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ab }
            r6.<init>()     // Catch:{ all -> 0x00ab }
            java.lang.String r0 = r10.A01     // Catch:{ all -> 0x00ab }
            r6.append(r0)     // Catch:{ all -> 0x00ab }
            java.lang.String r0 = "-"
            r6.append(r0)     // Catch:{ all -> 0x00ab }
            java.lang.String r0 = A01     // Catch:{ all -> 0x00ab }
            r6.append(r0)     // Catch:{ all -> 0x00ab }
            java.lang.String r0 = "-WA"
            r6.append(r0)     // Catch:{ all -> 0x00ab }
            java.text.DecimalFormat r4 = X.AnonymousClass2WU.A01     // Catch:{ all -> 0x00ab }
            int r0 = A00     // Catch:{ all -> 0x00ab }
            long r0 = (long) r0     // Catch:{ all -> 0x00ab }
            java.lang.String r0 = r4.format(r0)     // Catch:{ all -> 0x00ab }
            r6.append(r0)     // Catch:{ all -> 0x00ab }
            java.lang.String r4 = r6.toString()     // Catch:{ all -> 0x00ab }
            int r0 = A00     // Catch:{ all -> 0x00ab }
            int r1 = r0 + 1
            A00 = r1     // Catch:{ all -> 0x00ab }
            java.lang.String r0 = "file_index"
            r5.putInt(r0, r1)     // Catch:{ all -> 0x00ab }
            r5.apply()     // Catch:{ all -> 0x00ab }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ab }
            r1.<init>()     // Catch:{ all -> 0x00ab }
            java.lang.String r0 = "BaseMediaFileUtils/readablefilename "
            r1.append(r0)     // Catch:{ all -> 0x00ab }
            r1.append(r4)     // Catch:{ all -> 0x00ab }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00ab }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00ab }
            monitor-exit(r7)
            r2.append(r4)
            r2.append(r11)
            java.lang.String r2 = r2.toString()
            int r0 = r10.A00
            java.io.File r0 = r8.A0K(r0, r12, r13)
            java.io.File r1 = new java.io.File
            r1.<init>(r0, r2)
            boolean r0 = r1.exists()
            if (r0 == 0) goto L_0x00aa
            int r3 = r3 + 1
            r0 = 100
            if (r3 >= r0) goto L_0x00aa
            goto L_0x0001
        L_0x00aa:
            return r1
        L_0x00ab:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26511Sk.A0G(X.17r, X.0vc, X.1So, java.lang.String, int, int):java.io.File");
    }

    public static FileInputStream A0J(File file) {
        boolean z = false;
        while (true) {
            try {
                return new FileInputStream(file);
            } catch (FileNotFoundException e) {
                if (!e.getMessage().contains("Permission denied") || z) {
                    throw e;
                }
                z = true;
            }
        }
        throw e;
    }

    public static int A01(Uri uri, AnonymousClass11B r2) {
        ParcelFileDescriptor A06 = r2.A06(uri, "r");
        if (A06 == null) {
            return 0;
        }
        try {
            if (A06.getFileDescriptor() == null) {
                A06.close();
                return 0;
            }
            boolean z = C26303CxM.A0M;
            int A0Z = new C26303CxM(A06.getFileDescriptor()).A0Z(1);
            A06.close();
            return A0Z;
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
            throw th;
        }
    }

    public static int A02(C218617r r8, C26551So r9, String str, int i, int i2) {
        StringBuilder sb;
        File A0K = r8.A0K(r9.A00, i, i2);
        int i3 = -1;
        int i4 = 0;
        if (A0K.exists()) {
            File[] listFiles = A0K.listFiles();
            if (listFiles != null) {
                sb.append(r9.A01);
                sb.append("-");
                sb.append(str);
                sb.append("-WA");
                String obj = sb.toString();
                int length = listFiles.length;
                while (i4 < length) {
                    String name = listFiles[i4].getName();
                    if (name.startsWith(obj) && name.length() > 19) {
                        try {
                            int parseInt = Integer.parseInt(name.substring(15, 19));
                            if (parseInt > i3) {
                                i3 = parseInt;
                            }
                        } catch (NumberFormatException e) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("mediafileutils/findlargestfileindex/nfe:");
                            sb2.append(name);
                            Log.i(sb2.toString(), e);
                        }
                    }
                    i4++;
                }
                i4 = length;
            } else {
                sb = new StringBuilder();
                sb.append("mediafileutils/findlargestfileindex/no files for mmsType:");
                sb.append(r9);
                Log.i(sb.toString());
            }
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("mediafileutils/findlargestfileindex mmsType:");
        sb3.append(r9);
        sb3.append(" fileIndex:");
        sb3.append(i3);
        sb3.append(" total:");
        sb3.append(i4);
        Log.i(sb3.toString());
        return i3;
    }

    public static int A04(String str) {
        if (str == null) {
            return -1;
        }
        if (str.startsWith("audio")) {
            return 2;
        }
        if (str.startsWith("video")) {
            return 3;
        }
        if (str.startsWith("image")) {
            return 1;
        }
        if (str.startsWith("text/x-vcard") || str.startsWith("text/vcard")) {
            return 4;
        }
        if (str.startsWith("text")) {
            return 0;
        }
        return 9;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
        if (r1 == null) goto L_0x005e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long A05(java.io.File r5) {
        /*
            r2 = 0
            if (r5 == 0) goto L_0x005e
            boolean r0 = r5.exists()
            if (r0 == 0) goto L_0x005e
            java.lang.String r1 = r5.getName()
            java.lang.String r0 = ".opus"
            boolean r0 = r1.endsWith(r0)
            if (r0 == 0) goto L_0x0032
            r1 = 0
            r0 = 3
            X.70T r1 = X.AnonymousClass70T.A00(r1, r1, r1, r5, r0)     // Catch:{ IOException -> 0x002c, all -> 0x0025 }
            r1.A05()     // Catch:{ IOException -> 0x002c, all -> 0x0025 }
            int r0 = r1.A03()     // Catch:{ IOException -> 0x002c, all -> 0x0025 }
            long r2 = (long) r0     // Catch:{ IOException -> 0x002c, all -> 0x0025 }
            goto L_0x002e
        L_0x0025:
            r0 = move-exception
            if (r1 == 0) goto L_0x002b
            r1.A06()
        L_0x002b:
            throw r0
        L_0x002c:
            if (r1 == 0) goto L_0x005e
        L_0x002e:
            r1.A06()
            return r2
        L_0x0032:
            X.DRK.A04(r5)     // Catch:{ IOException -> 0x0036 }
            return r2
        L_0x0036:
            java.lang.String r0 = "BaseMediaFileUtils/getMediaDuration"
            X.5dc r4 = new X.5dc     // Catch:{ Exception -> 0x0058 }
            r4.<init>(r0)     // Catch:{ Exception -> 0x0058 }
            r4.A00(r5)     // Catch:{ all -> 0x004e }
            r0 = 9
            java.lang.String r0 = r4.extractMetadata(r0)     // Catch:{ all -> 0x004e }
            long r0 = java.lang.Long.parseLong(r0)     // Catch:{ all -> 0x004e }
            r4.close()     // Catch:{ Exception -> 0x0058 }
            return r0
        L_0x004e:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x0053 }
            goto L_0x0057
        L_0x0053:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ Exception -> 0x0058 }
        L_0x0057:
            throw r1     // Catch:{ Exception -> 0x0058 }
        L_0x0058:
            r1 = move-exception
            java.lang.String r0 = "getmediadurationseconds"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x005e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26511Sk.A05(java.io.File):long");
    }

    public static Bitmap A06(Bitmap bitmap, float f, int i) {
        Rect rect;
        if (bitmap == null || bitmap.isRecycled()) {
            return null;
        }
        bitmap.getWidth();
        bitmap.getHeight();
        try {
            Bitmap createBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            Paint paint = new Paint();
            float f2 = (float) i;
            RectF rectF = new RectF(0.0f, 0.0f, f2, f2);
            int width = (bitmap.getWidth() - bitmap.getHeight()) / 2;
            if (width > 0) {
                rect = new Rect(width, 0, bitmap.getWidth() - width, bitmap.getHeight());
            } else {
                rect = new Rect(0, -width, bitmap.getWidth(), bitmap.getHeight() + width);
            }
            paint.setAntiAlias(true);
            paint.setDither(true);
            paint.setFilterBitmap(true);
            canvas.drawARGB(0, 0, 0, 0);
            paint.setColor(-1);
            if (f >= 0.0f) {
                canvas.drawRoundRect(rectF, f, f, paint);
            } else {
                canvas.drawArc(rectF, 0.0f, 360.0f, true, paint);
            }
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
            canvas.drawBitmap(bitmap, rect, rectF, paint);
            return createBitmap;
        } catch (OutOfMemoryError e) {
            Log.e("BaseMediaFileUtils/getRoundedCornerBitmap", e);
            return bitmap;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0045, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004d, code lost:
        r1.setRotate(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0050, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0042, code lost:
        r1.setValues(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Matrix A08(int r1) {
        /*
            r0 = 9
            switch(r1) {
                case 2: goto L_0x0007;
                case 3: goto L_0x0012;
                case 4: goto L_0x001a;
                case 5: goto L_0x0025;
                case 6: goto L_0x0030;
                case 7: goto L_0x0038;
                case 8: goto L_0x0046;
                default: goto L_0x0005;
            }
        L_0x0005:
            r1 = 0
            return r1
        L_0x0007:
            android.graphics.Matrix r1 = new android.graphics.Matrix
            r1.<init>()
            float[] r0 = new float[r0]
            r0 = {-1082130432, 0, 0, 0, 1065353216, 0, 0, 0, 1065353216} // fill-array
            goto L_0x0042
        L_0x0012:
            android.graphics.Matrix r1 = new android.graphics.Matrix
            r1.<init>()
            r0 = 1127481344(0x43340000, float:180.0)
            goto L_0x004d
        L_0x001a:
            android.graphics.Matrix r1 = new android.graphics.Matrix
            r1.<init>()
            float[] r0 = new float[r0]
            r0 = {1065353216, 0, 0, 0, -1082130432, 0, 0, 0, 1065353216} // fill-array
            goto L_0x0042
        L_0x0025:
            android.graphics.Matrix r1 = new android.graphics.Matrix
            r1.<init>()
            float[] r0 = new float[r0]
            r0 = {0, 1065353216, 0, 1065353216, 0, 0, 0, 0, 1065353216} // fill-array
            goto L_0x0042
        L_0x0030:
            android.graphics.Matrix r1 = new android.graphics.Matrix
            r1.<init>()
            r0 = 1119092736(0x42b40000, float:90.0)
            goto L_0x004d
        L_0x0038:
            android.graphics.Matrix r1 = new android.graphics.Matrix
            r1.<init>()
            float[] r0 = new float[r0]
            r0 = {0, -1082130432, 0, -1082130432, 0, 0, 0, 0, 1065353216} // fill-array
        L_0x0042:
            r1.setValues(r0)
            return r1
        L_0x0046:
            android.graphics.Matrix r1 = new android.graphics.Matrix
            r1.<init>()
            r0 = 1132920832(0x43870000, float:270.0)
        L_0x004d:
            r1.setRotate(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26511Sk.A08(int):android.graphics.Matrix");
    }

    public static Matrix A09(Uri uri, AnonymousClass11B r5) {
        int parseInt;
        if (uri == null || TextUtils.isEmpty(uri.toString())) {
            StringBuilder sb = new StringBuilder();
            sb.append("No file ");
            sb.append(uri);
            throw new FileNotFoundException(sb.toString());
        }
        Matrix A08 = A08(A00(uri, r5));
        if (uri.getQueryParameter("flip-h") != null) {
            Matrix matrix = new Matrix();
            matrix.setValues(new float[]{-1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f});
            if (A08 == null) {
                A08 = matrix;
            } else {
                A08.postConcat(matrix);
            }
        }
        if (uri.getQueryParameter("flip-v") != null) {
            Matrix matrix2 = new Matrix();
            matrix2.setValues(new float[]{1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 1.0f});
            if (A08 == null) {
                A08 = matrix2;
            } else {
                A08.postConcat(matrix2);
            }
        }
        String queryParameter = uri.getQueryParameter("rotation");
        if (!(queryParameter == null || (parseInt = Integer.parseInt(queryParameter)) == 0)) {
            if (A08 == null) {
                A08 = new Matrix();
            }
            A08.postRotate((float) parseInt);
        }
        return A08;
    }

    /* JADX INFO: finally extract failed */
    public static Pair A0A(File file) {
        int i;
        int i2;
        CVS cvs = new CVS();
        int i3 = 0;
        try {
            String absolutePath = file.getAbsolutePath();
            C18070vi.A0d(absolutePath, 0);
            MediaExtractor mediaExtractor = cvs.A00;
            mediaExtractor.setDataSource(absolutePath);
            int trackCount = mediaExtractor.getTrackCount();
            i = 0;
            i2 = 0;
            while (i3 < trackCount) {
                try {
                    MediaFormat trackFormat = mediaExtractor.getTrackFormat(i3);
                    C18070vi.A0X(trackFormat);
                    String string = trackFormat.getString("mime");
                    if (string == null || !string.startsWith("video/")) {
                        if (string != null && string.startsWith("audio/") && trackFormat.containsKey("bitrate")) {
                            i2 = trackFormat.getInteger("bitrate");
                        }
                    } else if (trackFormat.containsKey("frame-rate")) {
                        i = trackFormat.getInteger("frame-rate");
                    }
                    i3++;
                } catch (Exception e) {
                    e = e;
                    i3 = i;
                    try {
                        StringBuilder sb = new StringBuilder();
                        sb.append("BaseMediaFileUtils/getFrameRate error ");
                        sb.append(e);
                        Log.e(sb.toString());
                        cvs.A00.release();
                        i = i3;
                        return new Pair(Integer.valueOf(i), Integer.valueOf(i2));
                    } catch (Throwable th) {
                        cvs.A00.release();
                        throw th;
                    }
                }
            }
            mediaExtractor.release();
        } catch (Exception e2) {
            e = e2;
            i2 = 0;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("BaseMediaFileUtils/getFrameRate error ");
            sb2.append(e);
            Log.e(sb2.toString());
            cvs.A00.release();
            i = i3;
            return new Pair(Integer.valueOf(i), Integer.valueOf(i2));
        }
        return new Pair(Integer.valueOf(i), Integer.valueOf(i2));
    }

    public static Pair A0B(File file) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(file.getAbsolutePath(), options);
        return new Pair(Integer.valueOf(options.outHeight), Integer.valueOf(options.outWidth));
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0044  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.util.Pair A0C(java.io.File r4) {
        /*
            android.graphics.BitmapFactory$Options r3 = new android.graphics.BitmapFactory$Options
            r3.<init>()
            r0 = 1
            r3.inJustDecodeBounds = r0
            java.lang.String r0 = r4.getAbsolutePath()
            android.graphics.BitmapFactory.decodeFile(r0, r3)
            boolean r0 = r4.exists()
            if (r0 == 0) goto L_0x002a
            java.lang.String r0 = r4.getAbsolutePath()     // Catch:{ IOException -> 0x0024 }
            X.CxM r1 = new X.CxM     // Catch:{ IOException -> 0x0024 }
            r1.<init>((java.lang.String) r0)     // Catch:{ IOException -> 0x0024 }
            r0 = 1
            int r1 = r1.A0Z(r0)     // Catch:{ IOException -> 0x0024 }
            goto L_0x002b
        L_0x0024:
            r1 = move-exception
            java.lang.String r0 = "failure retrieving exif, io exception"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x002a:
            r1 = 0
        L_0x002b:
            r0 = 6
            if (r1 == r0) goto L_0x0044
            r0 = 8
            if (r1 == r0) goto L_0x0044
            int r0 = r3.outWidth
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            int r0 = r3.outHeight
        L_0x003a:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            android.util.Pair r0 = new android.util.Pair
            r0.<init>(r2, r1)
            return r0
        L_0x0044:
            int r0 = r3.outHeight
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            int r0 = r3.outWidth
            goto L_0x003a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26511Sk.A0C(java.io.File):android.util.Pair");
    }

    public static Pair A0D(File file) {
        Pair pair;
        int i;
        C109545dc r4 = new C109545dc("BaseMediaFileUtils/getVideoHeightWidth");
        int i2 = 0;
        try {
            r4.A00(file);
            String extractMetadata = r4.extractMetadata(18);
            String extractMetadata2 = r4.extractMetadata(19);
            try {
                i = Integer.parseInt(extractMetadata);
                try {
                    i2 = Integer.parseInt(extractMetadata2);
                } catch (Exception e) {
                    e = e;
                }
            } catch (Exception e2) {
                e = e2;
                i = 0;
                StringBuilder sb = new StringBuilder();
                sb.append("getVideoHeightWidth/cannot parse width (");
                sb.append(extractMetadata);
                sb.append(") or height (");
                sb.append(i2);
                sb.append(") ");
                sb.append(file.getAbsolutePath());
                Log.w(sb.toString(), e);
                pair = Pair.create(Integer.valueOf(i2), Integer.valueOf(i));
                r4.close();
                return pair;
            }
            pair = Pair.create(Integer.valueOf(i2), Integer.valueOf(i));
        } catch (Exception unused) {
            pair = Pair.create(0, 0);
        } catch (Throwable th) {
            try {
                r4.close();
                throw th;
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
                throw th;
            }
        }
        r4.close();
        return pair;
    }

    public static File A0H(C218617r r2, String str) {
        String replaceAll = str.replaceAll("[?:\\\\/*\"<>|\n\t\r]", "");
        StringBuilder sb = new StringBuilder();
        sb.append(replaceAll);
        sb.append(".doodle");
        return C218617r.A02(r2.A0G(), sb.toString());
    }

    public static File A0I(File file, String str) {
        File file2 = new File(file, str);
        if (!file2.exists()) {
            return file2;
        }
        for (int i = 1; i <= 100; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("-");
            sb.append(i);
            File file3 = new File(file, sb.toString());
            if (!file3.exists()) {
                return file3;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("-");
        sb2.append(UUID.randomUUID().toString());
        return new File(file, sb2.toString());
    }

    public static String A0M(Uri uri, AnonymousClass11B r2) {
        if (r2 == null) {
            Log.w("media-file-utils/get-media-mime cr=null");
        } else {
            C18070vi.A0d(uri, 0);
            String type = AnonymousClass11B.A00(r2).getType(uri);
            if (type != null) {
                return type;
            }
        }
        return A0N(A0L(uri));
    }

    public static String A0N(String str) {
        String str2;
        String lowerCase = str.toLowerCase(Locale.US);
        switch (lowerCase.hashCode()) {
            case 96323:
                if (lowerCase.equals("aac")) {
                    return "audio/aac";
                }
                break;
            case 96710:
                if (lowerCase.equals("amr")) {
                    return "audio/amr";
                }
                break;
            case 98822:
                if (lowerCase.equals("csv")) {
                    return "text/csv";
                }
                break;
            case 99640:
                if (lowerCase.equals("doc")) {
                    return "application/msword";
                }
                break;
            case 105441:
                str2 = "jpg";
                break;
            case 106458:
                if (lowerCase.equals("m4a")) {
                    return "audio/mp4";
                }
                break;
            case 108272:
                if (lowerCase.equals("mp3")) {
                    return "audio/mpeg";
                }
                break;
            case 108273:
                if (lowerCase.equals("mp4")) {
                    return "video/mp4";
                }
                break;
            case 110834:
                if (lowerCase.equals("pdf")) {
                    return "application/pdf";
                }
                break;
            case 111145:
                if (lowerCase.equals("png")) {
                    return "image/png";
                }
                break;
            case 111220:
                if (lowerCase.equals("ppt")) {
                    return "application/vnd.ms-powerpoint";
                }
                break;
            case 113252:
                if (lowerCase.equals("rtf")) {
                    return "application/rtf";
                }
                break;
            case 115312:
                if (lowerCase.equals("txt")) {
                    return "text/plain";
                }
                break;
            case 117484:
                if (lowerCase.equals("wav")) {
                    return "audio/x-wav";
                }
                break;
            case 117835:
                if (lowerCase.equals("wma")) {
                    return "audio/x-ms-wma";
                }
                break;
            case 118783:
                if (lowerCase.equals("xls")) {
                    return "application/vnd.ms-excel";
                }
                break;
            case 3088960:
                if (lowerCase.equals("docx")) {
                    return "application/vnd.openxmlformats-officedocument.wordprocessingml.document";
                }
                break;
            case 3268712:
                str2 = "jpeg";
                break;
            case 3418175:
                if (lowerCase.equals("opus")) {
                    return "audio/ogg; codecs=opus";
                }
                break;
            case 3447940:
                if (lowerCase.equals("pptx")) {
                    return "application/vnd.openxmlformats-officedocument.presentationml.presentation";
                }
                break;
            case 3682393:
                if (lowerCase.equals("xlsx")) {
                    return "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet";
                }
                break;
        }
        if (lowerCase.equals(str2)) {
            return "image/jpeg";
        }
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(str.toLowerCase(Locale.US));
        if (mimeTypeFromExtension == null) {
            return "application/octet-stream";
        }
        return mimeTypeFromExtension;
    }

    public static void A0O(Context context, Uri uri) {
        context.sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE").setData(uri));
    }

    public static synchronized void A0P(C218617r r13, C18010vc r14) {
        synchronized (C26511Sk.class) {
            if (A00 < 0) {
                SharedPreferences A05 = r14.A05(C19620yd.A09);
                A00 = A05.getInt("file_index", -1);
                String string = A05.getString("file_date", (String) null);
                A01 = string;
                if (A00 < 0 || TextUtils.isEmpty(string)) {
                    String format = new SimpleDateFormat("yyyyMMdd", Locale.US).format(new Date());
                    A01 = format;
                    long currentTimeMillis = System.currentTimeMillis();
                    A00 = -1;
                    C26551So r2 = C26551So.A05;
                    int max = Math.max(-1, A02(r13, r2, format, 0, 1));
                    A00 = max;
                    int max2 = Math.max(max, A02(r13, r2, A01, 0, 2));
                    A00 = max2;
                    int max3 = Math.max(max2, A02(r13, r2, A01, 0, 3));
                    A00 = max3;
                    String str = A01;
                    C26551So r22 = C26551So.A0M;
                    int max4 = Math.max(max3, A02(r13, r22, str, 1, 1));
                    A00 = max4;
                    int max5 = Math.max(max4, A02(r13, r22, A01, 1, 2));
                    A00 = max5;
                    int max6 = Math.max(max5, A02(r13, r22, A01, 1, 3));
                    A00 = max6;
                    String str2 = A01;
                    C26551So r23 = C26551So.A0q;
                    int max7 = Math.max(max6, A02(r13, r23, str2, 0, 1));
                    A00 = max7;
                    int max8 = Math.max(max7, A02(r13, r23, A01, 0, 2));
                    A00 = max8;
                    int max9 = Math.max(max8, A02(r13, r23, A01, 0, 3));
                    A00 = max9;
                    String str3 = A01;
                    C26551So r24 = C26551So.A0E;
                    int max10 = Math.max(max9, A02(r13, r24, str3, 0, 1));
                    A00 = max10;
                    int max11 = Math.max(max10, A02(r13, r24, A01, 0, 2));
                    A00 = max11;
                    int max12 = Math.max(max11, A02(r13, r24, A01, 0, 3));
                    A00 = max12;
                    String str4 = A01;
                    C26551So r25 = C26551So.A0B;
                    int max13 = Math.max(max12, A02(r13, r25, str4, 0, 1));
                    A00 = max13;
                    int max14 = Math.max(max13, A02(r13, r25, A01, 0, 2));
                    A00 = max14;
                    A00 = Math.max(max14, A02(r13, r25, A01, 0, 3)) + 1;
                    SharedPreferences.Editor edit = A05.edit();
                    edit.putInt("file_index", A00);
                    edit.putString("file_date", A01);
                    edit.apply();
                    StringBuilder sb = new StringBuilder();
                    sb.append("mediafileutils/initfilecounter file_index:");
                    sb.append(A00);
                    sb.append(" | file_date:");
                    sb.append(A01);
                    sb.append(" |  time:");
                    sb.append(System.currentTimeMillis() - currentTimeMillis);
                    Log.i(sb.toString());
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("mediafileutils/initfilecounter file_index:");
                    sb2.append(A00);
                    sb2.append(" | file_date:");
                    sb2.append(A01);
                    Log.i(sb2.toString());
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00b5, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00b9, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00d2, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00d6, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0R(java.io.File r9) {
        /*
            java.lang.String r6 = "Xmp"
            X.CxM r5 = new X.CxM     // Catch:{ IOException -> 0x00e0 }
            r5.<init>((java.io.File) r9)     // Catch:{ IOException -> 0x00e0 }
            java.lang.String r1 = r5.A0a(r6)     // Catch:{ IOException -> 0x00e0 }
            if (r1 == 0) goto L_0x00d7
            boolean r0 = r1.isEmpty()     // Catch:{ IOException -> 0x00e0 }
            if (r0 != 0) goto L_0x00d7
            java.lang.String r2 = "trainedAlgorithmicMedia"
            javax.xml.parsers.DocumentBuilderFactory r0 = javax.xml.parsers.DocumentBuilderFactory.newInstance()     // Catch:{ IOException -> 0x00e0 }
            java.io.StringReader r3 = new java.io.StringReader     // Catch:{ IOException -> 0x00e0 }
            r3.<init>(r1)     // Catch:{ IOException -> 0x00e0 }
            javax.xml.parsers.DocumentBuilder r1 = r0.newDocumentBuilder()     // Catch:{ ParserConfigurationException -> 0x00c3, SAXException -> 0x00c1, TransformerException -> 0x00ba }
            org.xml.sax.InputSource r0 = new org.xml.sax.InputSource     // Catch:{ ParserConfigurationException -> 0x00c3, SAXException -> 0x00c1, TransformerException -> 0x00ba }
            r0.<init>(r3)     // Catch:{ ParserConfigurationException -> 0x00c3, SAXException -> 0x00c1, TransformerException -> 0x00ba }
            org.w3c.dom.Document r7 = r1.parse(r0)     // Catch:{ ParserConfigurationException -> 0x00c3, SAXException -> 0x00c1, TransformerException -> 0x00ba }
            X.C18070vi.A0b(r7)     // Catch:{ ParserConfigurationException -> 0x00c3, SAXException -> 0x00c1, TransformerException -> 0x00ba }
            java.lang.String r0 = "rdf:Description"
            org.w3c.dom.Element r8 = r7.createElement(r0)     // Catch:{ ParserConfigurationException -> 0x00c3, SAXException -> 0x00c1, TransformerException -> 0x00ba }
            java.lang.String r1 = "xmlns:iptcExt"
            java.lang.String r0 = "http://iptc.org/std/Iptc4xmpExt/2008-02-29/"
            r8.setAttribute(r1, r0)     // Catch:{ ParserConfigurationException -> 0x00c3, SAXException -> 0x00c1, TransformerException -> 0x00ba }
            java.lang.String r0 = "iptcExt:DigitalSourceType"
            r8.setAttribute(r0, r2)     // Catch:{ ParserConfigurationException -> 0x00c3, SAXException -> 0x00c1, TransformerException -> 0x00ba }
            java.lang.String r9 = "rdf:RDF"
            org.w3c.dom.NodeList r1 = r7.getElementsByTagName(r9)     // Catch:{ ParserConfigurationException -> 0x00c3, SAXException -> 0x00c1, TransformerException -> 0x00ba }
            int r0 = r1.getLength()     // Catch:{ ParserConfigurationException -> 0x00c3, SAXException -> 0x00c1, TransformerException -> 0x00ba }
            r4 = 0
            r2 = 1
            if (r0 != r2) goto L_0x0061
            org.w3c.dom.Node r0 = r1.item(r4)     // Catch:{ ParserConfigurationException -> 0x00c3, SAXException -> 0x00c1, TransformerException -> 0x00ba }
            r0.appendChild(r8)     // Catch:{ ParserConfigurationException -> 0x00c3, SAXException -> 0x00c1, TransformerException -> 0x00ba }
        L_0x0057:
            javax.xml.transform.TransformerFactory r0 = javax.xml.transform.TransformerFactory.newInstance()     // Catch:{ ParserConfigurationException -> 0x00c3, SAXException -> 0x00c1, TransformerException -> 0x00ba }
            java.io.StringWriter r4 = new java.io.StringWriter     // Catch:{ ParserConfigurationException -> 0x00c3, SAXException -> 0x00c1, TransformerException -> 0x00ba }
            r4.<init>()     // Catch:{ ParserConfigurationException -> 0x00c3, SAXException -> 0x00c1, TransformerException -> 0x00ba }
            goto L_0x0085
        L_0x0061:
            java.lang.String r0 = "x:xmpmeta"
            org.w3c.dom.NodeList r1 = r7.getElementsByTagName(r0)     // Catch:{ ParserConfigurationException -> 0x00c3, SAXException -> 0x00c1, TransformerException -> 0x00ba }
            int r0 = r1.getLength()     // Catch:{ ParserConfigurationException -> 0x00c3, SAXException -> 0x00c1, TransformerException -> 0x00ba }
            if (r0 != r2) goto L_0x0057
            org.w3c.dom.Node r4 = r1.item(r4)     // Catch:{ ParserConfigurationException -> 0x00c3, SAXException -> 0x00c1, TransformerException -> 0x00ba }
            org.w3c.dom.Element r2 = r7.createElement(r9)     // Catch:{ ParserConfigurationException -> 0x00c3, SAXException -> 0x00c1, TransformerException -> 0x00ba }
            java.lang.String r1 = "xmlns:rdf"
            java.lang.String r0 = "http://www.w3.org/1999/02/22-rdf-syntax-ns#"
            r2.setAttribute(r1, r0)     // Catch:{ ParserConfigurationException -> 0x00c3, SAXException -> 0x00c1, TransformerException -> 0x00ba }
            r2.appendChild(r8)     // Catch:{ ParserConfigurationException -> 0x00c3, SAXException -> 0x00c1, TransformerException -> 0x00ba }
            r4.appendChild(r2)     // Catch:{ ParserConfigurationException -> 0x00c3, SAXException -> 0x00c1, TransformerException -> 0x00ba }
            goto L_0x0057
        L_0x0085:
            javax.xml.transform.Transformer r2 = r0.newTransformer()     // Catch:{ all -> 0x00b3 }
            X.C18070vi.A0X(r2)     // Catch:{ all -> 0x00b3 }
            java.lang.String r1 = "omit-xml-declaration"
            java.lang.String r0 = "yes"
            r2.setOutputProperty(r1, r0)     // Catch:{ all -> 0x00b3 }
            javax.xml.transform.dom.DOMSource r1 = new javax.xml.transform.dom.DOMSource     // Catch:{ all -> 0x00b3 }
            r1.<init>(r7)     // Catch:{ all -> 0x00b3 }
            javax.xml.transform.stream.StreamResult r0 = new javax.xml.transform.stream.StreamResult     // Catch:{ all -> 0x00b3 }
            r0.<init>(r4)     // Catch:{ all -> 0x00b3 }
            r2.transform(r1, r0)     // Catch:{ all -> 0x00b3 }
            java.lang.StringBuffer r0 = r4.getBuffer()     // Catch:{ all -> 0x00b3 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00b3 }
            X.C18070vi.A0X(r0)     // Catch:{ all -> 0x00b3 }
            r4.close()     // Catch:{ ParserConfigurationException -> 0x00c3, SAXException -> 0x00c1, TransformerException -> 0x00ba }
            r3.close()     // Catch:{ IOException -> 0x00e0 }
            goto L_0x00d9
        L_0x00b3:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00b5 }
        L_0x00b5:
            r0 = move-exception
            X.CDX.A00(r4, r1)     // Catch:{ ParserConfigurationException -> 0x00c3, SAXException -> 0x00c1, TransformerException -> 0x00ba }
            throw r0     // Catch:{ ParserConfigurationException -> 0x00c3, SAXException -> 0x00c1, TransformerException -> 0x00ba }
        L_0x00ba:
            r0 = move-exception
            java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x00d0 }
            r1.<init>(r0)     // Catch:{ all -> 0x00d0 }
            goto L_0x00cf
        L_0x00c1:
            r0 = move-exception
            goto L_0x00ca
        L_0x00c3:
            r0 = move-exception
            java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x00d0 }
            r1.<init>(r0)     // Catch:{ all -> 0x00d0 }
            goto L_0x00cf
        L_0x00ca:
            java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x00d0 }
            r1.<init>(r0)     // Catch:{ all -> 0x00d0 }
        L_0x00cf:
            throw r1     // Catch:{ all -> 0x00d0 }
        L_0x00d0:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00d2 }
        L_0x00d2:
            r0 = move-exception
            X.CDX.A00(r3, r1)     // Catch:{ IOException -> 0x00e0 }
            throw r0     // Catch:{ IOException -> 0x00e0 }
        L_0x00d7:
            java.lang.String r0 = "<?xpacket begin=\"\" id=\"W5M0MpCehiHzreSzNTczkc9d\"?><x:xmpmeta xmlns:x=\"adobe:ns:meta/\" x:xmptk=\"XMP Core 4.4.0-Exiv2\"><rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"><rdf:Description rdf:about=\"\" xmlns:iptcExt=\"http://iptc.org/std/Iptc4xmpExt/2008-02-29/\" iptcExt:DigitalSourceType=\"trainedAlgorithmicMedia\"/></rdf:RDF></x:xmpmeta>"
        L_0x00d9:
            r5.A0c(r6, r0)     // Catch:{ IOException -> 0x00e0 }
            r5.A0b()     // Catch:{ IOException -> 0x00e0 }
            return
        L_0x00e0:
            r1 = move-exception
            java.lang.String r0 = "BaseMediaFileUtils/addXmpDataTrainedAlgorithmicMedia Failed to add XMP Data"
            com.whatsapp.util.Log.e(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26511Sk.A0R(java.io.File):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:21|22|23|24) */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00a6, code lost:
        if (r2 != null) goto L_0x00a8;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0068 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A00(android.net.Uri r10, X.AnonymousClass11B r11) {
        /*
            java.io.File r0 = X.C64062u9.A04(r10)
            r6 = r11
            if (r0 == 0) goto L_0x001d
            int r3 = A01(r10, r11)     // Catch:{ FileNotFoundException -> 0x000d }
            goto L_0x00ba
        L_0x000d:
            java.lang.String r0 = r0.getPath()
            X.CxM r1 = new X.CxM
            r1.<init>((java.lang.String) r0)
            r0 = 1
            int r3 = r1.A0Z(r0)
            goto L_0x00ba
        L_0x001d:
            java.lang.String r1 = "content"
            java.lang.String r0 = r10.getScheme()
            boolean r0 = r1.equals(r0)
            r5 = 0
            if (r0 == 0) goto L_0x00b1
            r4 = 2
            java.lang.String[] r8 = new java.lang.String[r4]
            java.lang.String r3 = "_data"
            r8[r5] = r3
            r0 = 1
            java.lang.String r1 = "orientation"
            r8[r0] = r1
            android.net.Uri$Builder r0 = r10.buildUpon()
            r9 = 0
            android.net.Uri$Builder r0 = r0.query(r9)
            android.net.Uri r7 = r0.build()
            if (r11 == 0) goto L_0x00ac
            r11 = r9
            r10 = r9
            android.database.Cursor r2 = r6.A03(r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x00b3 }
            if (r2 == 0) goto L_0x00a5
            boolean r0 = r2.moveToFirst()     // Catch:{ all -> 0x009b }
            if (r0 == 0) goto L_0x0095
            int r0 = r2.getColumnCount()     // Catch:{ all -> 0x009b }
            if (r0 != r4) goto L_0x008f
            int r0 = r2.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x009b }
            java.lang.String r0 = r2.getString(r0)     // Catch:{ all -> 0x009b }
            if (r0 == 0) goto L_0x0073
            int r5 = A01(r7, r6)     // Catch:{ FileNotFoundException -> 0x0068 }
            goto L_0x008d
        L_0x0068:
            X.CxM r1 = new X.CxM     // Catch:{ all -> 0x009b }
            r1.<init>((java.lang.String) r0)     // Catch:{ all -> 0x009b }
            r0 = 1
            int r5 = r1.A0Z(r0)     // Catch:{ all -> 0x009b }
            goto L_0x008d
        L_0x0073:
            int r0 = r2.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x009b }
            int r1 = r2.getInt(r0)     // Catch:{ all -> 0x009b }
            r0 = 90
            if (r1 == r0) goto L_0x008c
            r0 = 180(0xb4, float:2.52E-43)
            if (r1 == r0) goto L_0x008a
            r0 = 270(0x10e, float:3.78E-43)
            if (r1 != r0) goto L_0x008d
            r5 = 8
            goto L_0x008d
        L_0x008a:
            r5 = 3
            goto L_0x008d
        L_0x008c:
            r5 = 6
        L_0x008d:
            r3 = r5
            goto L_0x00a8
        L_0x008f:
            java.lang.String r0 = "sample_rotate_image/no_orientation_info"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x009b }
            goto L_0x00a5
        L_0x0095:
            java.lang.String r0 = "sample_rotate_image/cursor_is_empty"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x009b }
            goto L_0x00a5
        L_0x009b:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x00a0 }
            goto L_0x00a4
        L_0x00a0:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ Exception -> 0x00b3 }
        L_0x00a4:
            throw r1     // Catch:{ Exception -> 0x00b3 }
        L_0x00a5:
            r3 = 0
            if (r2 == 0) goto L_0x00ba
        L_0x00a8:
            r2.close()     // Catch:{ Exception -> 0x00b3 }
            goto L_0x00ba
        L_0x00ac:
            java.lang.String r0 = "media-file-utils/get-exiff-orientation cr=null"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x00b1:
            r3 = 0
            goto L_0x00ba
        L_0x00b3:
            r1 = move-exception
            java.lang.String r0 = "sample_rotate_image/query_orientation_info"
            com.whatsapp.util.Log.w(r0, r1)
            r3 = r5
        L_0x00ba:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "sample_rotate_image/orientation "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26511Sk.A00(android.net.Uri, X.11B):int");
    }

    public static int A03(File file) {
        long A05 = A05(file);
        int i = (int) (A05 / 1000);
        if (i != 0 || A05 == 0) {
            return i;
        }
        return 1;
    }

    public static String A0K() {
        return UUID.randomUUID().toString().replace("-", "");
    }

    public static String A0L(Uri uri) {
        int lastIndexOf;
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null || (lastIndexOf = lastPathSegment.lastIndexOf(46)) == -1) {
            return "";
        }
        return lastPathSegment.substring(lastIndexOf + 1);
    }

    public static void A0Q(C62572rc r2, File file) {
        Pair A0C = A0C(file);
        r2.A08 = ((Number) A0C.first).intValue();
        r2.A06 = ((Number) A0C.second).intValue();
    }

    public static boolean A0S(AnonymousClass1NM r3, File file, File file2) {
        String str;
        StringBuilder sb;
        String str2;
        File A012 = r3.A01(file);
        if (file2.renameTo(A012)) {
            if (!file.renameTo(file2)) {
                boolean renameTo = A012.renameTo(file2);
                boolean delete = file.delete();
                if (!renameTo) {
                    if (!delete) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("failed to delete ");
                        sb2.append(file.getAbsolutePath());
                        Log.e(sb2.toString());
                    }
                    if (!A012.delete()) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("failed to delete ");
                        sb3.append(A012.getAbsolutePath());
                        Log.e(sb3.toString());
                    }
                    str = "restore input file failed";
                    Log.e(str);
                    return false;
                } else if (delete) {
                    return false;
                } else {
                    sb = new StringBuilder();
                    sb.append("failed to delete ");
                    str2 = file.getAbsolutePath();
                }
            } else if (A012.delete()) {
                return true;
            } else {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("failed to delete ");
                sb4.append(A012.getAbsolutePath());
                Log.e(sb4.toString());
                return true;
            }
        } else if (A012.delete()) {
            return false;
        } else {
            sb = new StringBuilder();
            sb.append("failed to delete ");
            str2 = A012.getAbsolutePath();
        }
        sb.append(str2);
        str = sb.toString();
        Log.e(str);
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0106, code lost:
        if (r12 == X.C26551So.A0f) goto L_0x0108;
     */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0138  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.io.File A0F(X.C218617r r10, X.C18010vc r11, X.C26551So r12, java.lang.Integer r13, java.lang.String r14, java.lang.String r15, int r16, int r17, boolean r18, boolean r19, boolean r20) {
        /*
            r2 = r15
            r3 = r14
            java.lang.String r1 = "."
            r5 = r10
            if (r18 == 0) goto L_0x002c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = A0K()
            r3.append(r0)
            r3.append(r1)
            r3.append(r15)
            java.lang.String r2 = r3.toString()
            X.2hC r0 = r10.A08()
            java.io.File r1 = r0.A0P
            r0 = 0
            X.C218617r.A07(r1, r0)
            java.io.File r2 = X.C218617r.A02(r1, r2)
        L_0x002b:
            return r2
        L_0x002c:
            if (r13 == 0) goto L_0x0061
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            if (r13 != r0) goto L_0x0042
            X.118 r0 = r10.A01
            android.content.Context r0 = r0.A00
            java.io.File r1 = r0.getFilesDir()
            java.lang.String r0 = "gdpr.zip"
        L_0x003c:
            java.io.File r2 = new java.io.File
            r2.<init>(r1, r0)
            return r2
        L_0x0042:
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            if (r13 != r0) goto L_0x0051
            X.118 r0 = r10.A01
            android.content.Context r0 = r0.A00
            java.io.File r1 = r0.getFilesDir()
            java.lang.String r0 = "channels_gdpr.zip"
            goto L_0x003c
        L_0x0051:
            java.lang.Integer r0 = X.AnonymousClass00R.A0N
            if (r13 != r0) goto L_0x0061
            X.118 r0 = r10.A01
            android.content.Context r0 = r0.A00
            java.io.File r1 = r0.getFilesDir()
            java.lang.String r0 = "wamo_gdpr.zip"
            goto L_0x003c
        L_0x0061:
            if (r19 == 0) goto L_0x0068
            java.io.File r2 = r10.A0A()
            return r2
        L_0x0068:
            X.1So r0 = X.C26551So.A0O
            r7 = r12
            if (r12 != r0) goto L_0x00a6
            X.118 r0 = r10.A01
            android.content.Context r0 = r0.A00
            java.io.File r3 = r0.getFilesDir()
            java.lang.String r0 = X.C218617r.A08
            java.io.File r4 = new java.io.File
            r4.<init>(r3, r0)
            r0 = 0
            X.C218617r.A07(r4, r0)
            java.lang.String r3 = "HIST_SYNC"
            java.lang.Boolean r0 = X.C17960vV.A01
        L_0x0084:
            java.lang.String r3 = X.C218617r.A04(r4, r3)
            boolean r0 = android.text.TextUtils.isEmpty(r15)
            if (r0 != 0) goto L_0x00a0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            r0.append(r1)
            r0.append(r15)
            java.lang.String r3 = r0.toString()
        L_0x00a0:
            java.io.File r2 = new java.io.File
            r2.<init>(r4, r3)
            return r2
        L_0x00a6:
            if (r20 == 0) goto L_0x00b6
            X.2hC r0 = r10.A08()
            java.io.File r4 = r0.A0A
            java.lang.String r3 = r12.A01
            java.lang.String r0 = "View Once media must have a filePrefix in its MmsType"
            X.C17960vV.A08(r3, r0)
            goto L_0x0084
        L_0x00b6:
            boolean r0 = X.C25291Nq.A06(r12)
            java.lang.String r8 = ""
            r6 = r8
            r4 = 0
            if (r0 == 0) goto L_0x0104
            if (r14 == 0) goto L_0x0102
            java.lang.String r0 = "[?:\\\\/*\"<>|\n\t\r]"
            java.lang.String r0 = r14.replaceAll(r0, r8)
            java.lang.String r3 = X.C64062u9.A0A(r0)
            java.lang.String r2 = X.C64062u9.A09(r0)
        L_0x00d0:
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L_0x0108
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L_0x0108
            r2 = r8
        L_0x00dd:
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x00f2
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            r0.append(r2)
            java.lang.String r8 = r0.toString()
        L_0x00f2:
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            r9 = r16
            r10 = r17
            if (r0 == 0) goto L_0x010a
            r6 = r11
            java.io.File r2 = A0G(r5, r6, r7, r8, r9, r10)
            return r2
        L_0x0102:
            r3 = r4
            goto L_0x00d0
        L_0x0104:
            X.1So r0 = X.C26551So.A0f
            if (r12 != r0) goto L_0x00dd
        L_0x0108:
            r4 = r3
            goto L_0x00dd
        L_0x010a:
            r3 = 0
        L_0x010b:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r4)
            if (r3 != 0) goto L_0x0138
            r0 = r6
        L_0x0116:
            r2.append(r0)
            r2.append(r8)
            java.lang.String r1 = r2.toString()
            int r0 = r12.A00
            java.io.File r0 = r5.A0K(r0, r9, r10)
            java.io.File r2 = new java.io.File
            r2.<init>(r0, r1)
            boolean r0 = r2.exists()
            if (r0 == 0) goto L_0x002b
            int r3 = r3 + 1
            r0 = 1000(0x3e8, float:1.401E-42)
            if (r3 >= r0) goto L_0x002b
            goto L_0x010b
        L_0x0138:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "-"
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = r1.toString()
            goto L_0x0116
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26511Sk.A0F(X.17r, X.0vc, X.1So, java.lang.Integer, java.lang.String, java.lang.String, int, int, boolean, boolean, boolean):java.io.File");
    }
}
