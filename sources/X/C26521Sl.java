package X;

import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import com.whatsapp.media.WamediaManager;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: X.1Sl  reason: invalid class name and case insensitive filesystem */
public class C26521Sl extends C26511Sk {
    public final C218617r A00;
    public final AnonymousClass11C A01;
    public final AnonymousClass118 A02;
    public final C18030ve A03;
    public final WamediaManager A04;
    public final AnonymousClass1NL A05;
    public final AnonymousClass190 A06;
    public final AnonymousClass1KB A07;
    public final AnonymousClass10I A08;
    public final AnonymousClass00H A09;

    public static Pair A0V(Uri uri, AnonymousClass11B r10) {
        Uri uri2;
        Cursor A032;
        Uri uri3 = uri;
        if (TextUtils.isEmpty(uri.getScheme())) {
            uri2 = uri.buildUpon().scheme("file").build();
        } else {
            uri2 = uri;
        }
        File A042 = C64062u9.A04(uri2);
        if (A042 != null) {
            return Pair.create(A042, (Object) null);
        }
        if (!"media".equals(uri.getAuthority())) {
            return Pair.create((Object) null, "not_media_store");
        }
        try {
            A032 = r10.A03(uri3, new String[]{"_data"}, (String) null, (String[]) null, (String) null);
            if (A032 == null) {
                return Pair.create((Object) null, "no_cursor");
            }
            if (!A032.moveToFirst()) {
                Pair create = Pair.create((Object) null, "empty_cursor");
                A032.close();
                return create;
            }
            String string = A032.getString(A032.getColumnIndexOrThrow("_data"));
            if (TextUtils.isEmpty(string)) {
                Pair create2 = Pair.create((Object) null, "empty");
                A032.close();
                return create2;
            }
            Pair create3 = Pair.create(new File(string), (Object) null);
            A032.close();
            return create3;
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("e=");
            sb.append(e.getClass().getName());
            return Pair.create((Object) null, sb.toString());
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
        }
        throw th;
    }

    public static AnonymousClass1D6 A0X(File file) {
        C109545dc r4;
        long j;
        try {
            r4 = new C109545dc("MediaFileUtils/getVideoDurationAndIsMuted");
            r4.A00(file);
            String extractMetadata = r4.extractMetadata(9);
            if (extractMetadata != null) {
                j = Long.parseLong(extractMetadata);
            } else {
                j = -1;
            }
            r4.release();
            AnonymousClass1D6 r0 = new AnonymousClass1D6(Long.valueOf(j), Boolean.valueOf(!"yes".equals(r4.extractMetadata(16))));
            r4.close();
            return r0;
        } catch (Exception unused) {
            return new AnonymousClass1D6(-1L, false);
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
        }
        throw th;
    }

    public static boolean A0d(C185849dF r13, C32381h6 r14, File file, File file2, OutputStream outputStream, String str, byte[] bArr, int i, int i2, int i3, long j) {
        AnonymousClass2QV r8;
        int i4 = i2;
        long j2 = j;
        try {
            FileInputStream A0J = C26511Sk.A0J(file);
            try {
                r8 = new AnonymousClass2QV(outputStream, i4);
                new C190549l8(r13, bArr, j2).A00(A0J, r8, 0, 0, (long) i);
                r8.close();
                A0J.close();
                return true;
            } catch (Throwable th) {
                A0J.close();
                throw th;
            }
            throw th;
        } catch (C26531Sm e) {
            StringBuilder sb = new StringBuilder();
            sb.append("CreateProgressiveThumbnail failed to match hash for progressive jpeg thumbnail; mediaHash=");
            sb.append(str);
            Log.e(sb.toString(), e);
            r14.A02(0L, new int[]{i2}, i3, j2, false);
            file2.delete();
            return false;
        } catch (Throwable th2) {
            AnonymousClass0DT.A00(th, th2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] A0g(java.io.File r11, int r12, int r13, boolean r14) {
        /*
            r2 = 0
            r4 = 0
            X.DRK.A04(r11)     // Catch:{ IOException -> 0x0006 }
            goto L_0x0008
        L_0x0006:
            r0 = 0
            goto L_0x0009
        L_0x0008:
            r0 = 1
        L_0x0009:
            if (r0 == 0) goto L_0x0014
            android.graphics.Bitmap r2 = X.DRK.A00(r11)     // Catch:{ IOException | IllegalArgumentException -> 0x0010, Exception -> 0x0024 }
            goto L_0x002a
        L_0x0010:
            r1 = move-exception
            java.lang.String r0 = "mediafileutils/createGifThumbnail/gif file not read "
            goto L_0x0027
        L_0x0014:
            r8 = 0
            r10 = 1
            X.6c1 r3 = new X.6c1
            r3.<init>(r11)
            r7 = r4
            r6 = r13
            r5 = r4
            android.graphics.Bitmap r2 = X.C1408873l.A00(r2, r3, r4, r5, r6, r7, r8, r10)
            goto L_0x002a
        L_0x0024:
            r1 = move-exception
            java.lang.String r0 = "mediafileutils/createGifThumbnail/unexpected gif exception "
        L_0x0027:
            com.whatsapp.util.Log.e(r0, r1)
        L_0x002a:
            if (r2 == 0) goto L_0x0032
            byte[] r0 = X.C60892om.A00(r2, r12, r14, r4)
            if (r0 != 0) goto L_0x0036
        L_0x0032:
            byte[] r0 = X.C1408873l.A04(r11)
        L_0x0036:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26521Sl.A0g(java.io.File, int, int, boolean):byte[]");
    }

    @Deprecated
    public Bitmap A0h(Uri uri, int i, int i2) {
        return A0i(uri, i, i2, true, true);
    }

    public static long A02(File file) {
        C109545dc r2;
        try {
            r2 = new C109545dc("MediaFileUtils/getVideoBitrate");
            r2.A00(file);
            String extractMetadata = r2.extractMetadata(20);
            if (extractMetadata == null) {
                r2.close();
                return 0;
            }
            long parseInt = (long) Integer.parseInt(extractMetadata);
            r2.close();
            return parseInt;
        } catch (Exception unused) {
            return 0;
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
        }
        throw th;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x001f  */
    /* JADX WARNING: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0Y(android.net.Uri.Builder r3, android.net.Uri r4, int r5) {
        /*
            java.lang.String r2 = "rotation"
            java.lang.String r0 = r4.getQueryParameter(r2)
            if (r0 == 0) goto L_0x0019
            java.lang.String r0 = r4.getQueryParameter(r2)     // Catch:{ NumberFormatException -> 0x0013 }
            if (r0 == 0) goto L_0x0026
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x0013 }
            goto L_0x001a
        L_0x0013:
            r1 = move-exception
            java.lang.String r0 = "MediaFileUtils/combineRotation/invalid rotation (ignored)"
            com.whatsapp.util.Log.w(r0, r1)
        L_0x0019:
            r0 = 0
        L_0x001a:
            int r0 = r0 + r5
            int r0 = r0 % 360
            if (r0 == 0) goto L_0x0026
            java.lang.String r0 = java.lang.Integer.toString(r0)
            r3.appendQueryParameter(r2, r0)
        L_0x0026:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26521Sl.A0Y(android.net.Uri$Builder, android.net.Uri, int):void");
    }

    public static void A0Z(Uri.Builder builder, AnonymousClass72S r4) {
        Uri uri = r4.A0X;
        A0Y(builder, uri, r4.A02());
        if (uri.getQueryParameter("flip-h") != null) {
            builder.appendQueryParameter("flip-h", uri.getQueryParameter("flip-h"));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0054, code lost:
        if (r20 == false) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0011, code lost:
        if (r18 > 0) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A0b(X.AnonymousClass190 r12, X.CXH r13, X.AnonymousClass1D6 r14, int r15, long r16, long r18, boolean r20, boolean r21) {
        /*
            boolean r0 = r13 instanceof X.C24015Bu1
            if (r0 == 0) goto L_0x00c8
            java.lang.String r5 = "Gif"
        L_0x0006:
            r2 = 0
            r11 = 1
            r4 = 0
            int r0 = (r16 > r2 ? 1 : (r16 == r2 ? 0 : -1))
            if (r0 > 0) goto L_0x0013
            int r1 = (r18 > r2 ? 1 : (r18 == r2 ? 0 : -1))
            r0 = 0
            if (r1 <= 0) goto L_0x0014
        L_0x0013:
            r0 = 1
        L_0x0014:
            long r18 = r18 - r16
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            if (r0 == 0) goto L_0x0051
            java.lang.Object r0 = r14.first
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            r8 = -1
            int r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r2 == 0) goto L_0x0051
            long r0 = r0 - r18
            long r9 = java.lang.Math.abs(r0)
            long r2 = (long) r15
            int r8 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r8 <= 0) goto L_0x0051
            java.lang.String r2 = "trimJitter="
            r7.append(r2)
            r7.append(r15)
            java.lang.String r2 = " | difference="
            r7.append(r2)
            r7.append(r0)
            java.lang.String r0 = "Trim"
            r6.append(r0)
        L_0x0051:
            if (r21 != 0) goto L_0x0056
            r1 = 1
            if (r20 != 0) goto L_0x0057
        L_0x0056:
            r1 = 0
        L_0x0057:
            java.lang.Object r0 = r14.second
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r1 == r0) goto L_0x0079
            int r0 = r7.length()
            if (r0 <= 0) goto L_0x006c
            java.lang.String r0 = " | "
            r7.append(r0)
        L_0x006c:
            java.lang.String r0 = "intendedMute="
            r7.append(r0)
            r7.append(r1)
            java.lang.String r0 = "Mute"
            r6.append(r0)
        L_0x0079:
            int r0 = r6.length()
            if (r0 <= 0) goto L_0x00c0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "MediaAccuracyCheck/"
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = "/"
            r1.append(r0)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = r7.toString()
            r12.A0G(r1, r0, r4)
            X.70S r2 = r13.A01
            java.lang.String r0 = r7.toString()
            r2.A08(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r5)
            r1.append(r6)
            java.lang.String r0 = "Fail"
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            X.64V r0 = r2.A01
            r0.A0g = r1
        L_0x00c0:
            int r0 = r6.length()
            if (r0 == 0) goto L_0x00c7
            r11 = 0
        L_0x00c7:
            return r11
        L_0x00c8:
            java.lang.String r5 = "Video"
            goto L_0x0006
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26521Sl.A0b(X.190, X.CXH, X.1D6, int, long, long, boolean, boolean):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01ea, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append("MediaFileUtils/getFileFromMediaStore/unable to open stream; uri=");
        r1.append(r5);
        com.whatsapp.util.Log.w(r1.toString(), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0203, code lost:
        throw new java.io.IOException(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01e2, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01e8, code lost:
        throw new java.io.IOException(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01e9, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b8 A[ADDED_TO_REGION, Catch:{ all -> 0x01d8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00f4 A[Catch:{ all -> 0x01d8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x018d A[Catch:{ all -> 0x01bd, all -> 0x01c2, all -> 0x01c7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0193 A[Catch:{ all -> 0x01bd, all -> 0x01c2, all -> 0x01c7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01a5 A[Catch:{ all -> 0x01bd, all -> 0x01c2, all -> 0x01c7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01b6 A[SYNTHETIC, Splitter:B:65:0x01b6] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x01e2 A[ExcHandler: SQLiteException | FileNotFoundException | NullPointerException (r0v4 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:16:0x0052] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01e9 A[ExcHandler: IllegalStateException | SecurityException | UnsupportedOperationException (r2v1 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:16:0x0052] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.io.File A0j(android.net.Uri r27, boolean r28) {
        /*
            r26 = this;
            r6 = r26
            X.1NL r3 = r6.A05
            r5 = r27
            r3.A03(r5)
            X.11C r2 = r6.A01
            X.11B r0 = r2.A0O()
            if (r0 == 0) goto L_0x0204
            java.lang.String r1 = "MediaFileUtils/getFileFromMediaStore"
            X.1Ez r8 = new X.1Ez
            r8.<init>((java.lang.String) r1)
            android.util.Pair r1 = A0V(r5, r0)
            java.lang.Object r4 = r1.first
            java.io.File r4 = (java.io.File) r4
            java.lang.Object r7 = r1.second
            java.lang.String r7 = (java.lang.String) r7
            if (r4 == 0) goto L_0x0035
            X.17r r1 = r6.A00
            boolean r1 = r1.A0m(r4)
            if (r1 == 0) goto L_0x0035
            boolean r1 = r4.exists()
            if (r1 == 0) goto L_0x0035
            return r4
        L_0x0035:
            java.lang.String r1 = "file searched"
            long r18 = r8.A03(r1)
            if (r4 == 0) goto L_0x004f
            r1 = 268435456(0x10000000, float:2.5243549E-29)
            android.os.ParcelFileDescriptor r21 = android.os.ParcelFileDescriptor.open(r4, r1)     // Catch:{ Exception -> 0x004f }
            long r24 = r21.getStatSize()     // Catch:{ Exception -> 0x004f }
            r22 = 0
            android.content.res.AssetFileDescriptor r20 = new android.content.res.AssetFileDescriptor     // Catch:{ Exception -> 0x004f }
            r20.<init>(r21, r22, r24)     // Catch:{ Exception -> 0x004f }
            goto L_0x0087
        L_0x004f:
            java.lang.String r11 = "r"
            r1 = 0
            X.C18070vi.A0d(r5, r1)     // Catch:{ IllegalStateException | SecurityException | UnsupportedOperationException -> 0x01e9, IllegalStateException | SecurityException | UnsupportedOperationException -> 0x01e9, IllegalStateException | SecurityException | UnsupportedOperationException -> 0x01e9, SQLiteException | FileNotFoundException | NullPointerException -> 0x01e2, SQLiteException | FileNotFoundException | NullPointerException -> 0x01e2, SQLiteException | FileNotFoundException | NullPointerException -> 0x01e2 }
            android.content.ContentResolver r10 = X.AnonymousClass11B.A00(r0)     // Catch:{ IllegalStateException | SecurityException | UnsupportedOperationException -> 0x01e9, IllegalStateException | SecurityException | UnsupportedOperationException -> 0x01e9, IllegalStateException | SecurityException | UnsupportedOperationException -> 0x01e9, SQLiteException | FileNotFoundException | NullPointerException -> 0x01e2, SQLiteException | FileNotFoundException | NullPointerException -> 0x01e2, SQLiteException | FileNotFoundException | NullPointerException -> 0x01e2 }
            X.00H r0 = r0.A01     // Catch:{ IllegalStateException | SecurityException | UnsupportedOperationException -> 0x01e9, IllegalStateException | SecurityException | UnsupportedOperationException -> 0x01e9, IllegalStateException | SecurityException | UnsupportedOperationException -> 0x01e9, SQLiteException | FileNotFoundException | NullPointerException -> 0x01e2, SQLiteException | FileNotFoundException | NullPointerException -> 0x01e2, SQLiteException | FileNotFoundException | NullPointerException -> 0x01e2 }
            java.lang.Object r9 = r0.get()     // Catch:{ IllegalStateException | SecurityException | UnsupportedOperationException -> 0x01e9, IllegalStateException | SecurityException | UnsupportedOperationException -> 0x01e9, IllegalStateException | SecurityException | UnsupportedOperationException -> 0x01e9, SQLiteException | FileNotFoundException | NullPointerException -> 0x01e2, SQLiteException | FileNotFoundException | NullPointerException -> 0x01e2, SQLiteException | FileNotFoundException | NullPointerException -> 0x01e2 }
            X.6xy r9 = (X.C138956xy) r9     // Catch:{ IllegalStateException | SecurityException | UnsupportedOperationException -> 0x01e9, IllegalStateException | SecurityException | UnsupportedOperationException -> 0x01e9, IllegalStateException | SecurityException | UnsupportedOperationException -> 0x01e9, SQLiteException | FileNotFoundException | NullPointerException -> 0x01e2, SQLiteException | FileNotFoundException | NullPointerException -> 0x01e2, SQLiteException | FileNotFoundException | NullPointerException -> 0x01e2 }
            java.lang.Integer r1 = X.AnonymousClass00R.A01     // Catch:{ IllegalStateException | SecurityException | UnsupportedOperationException -> 0x01e9, IllegalStateException | SecurityException | UnsupportedOperationException -> 0x01e9, IllegalStateException | SecurityException | UnsupportedOperationException -> 0x01e9, SQLiteException | FileNotFoundException | NullPointerException -> 0x01e2, SQLiteException | FileNotFoundException | NullPointerException -> 0x01e2, SQLiteException | FileNotFoundException | NullPointerException -> 0x01e2 }
            java.lang.String r0 = r5.getAuthority()     // Catch:{ IllegalStateException | SecurityException | UnsupportedOperationException -> 0x01e9, IllegalStateException | SecurityException | UnsupportedOperationException -> 0x01e9, IllegalStateException | SecurityException | UnsupportedOperationException -> 0x01e9, SQLiteException | FileNotFoundException | NullPointerException -> 0x01e2, SQLiteException | FileNotFoundException | NullPointerException -> 0x01e2, SQLiteException | FileNotFoundException | NullPointerException -> 0x01e2 }
            r9.A00(r1, r0)     // Catch:{ IllegalStateException | SecurityException | UnsupportedOperationException -> 0x01e9, IllegalStateException | SecurityException | UnsupportedOperationException -> 0x01e9, IllegalStateException | SecurityException | UnsupportedOperationException -> 0x01e9, SQLiteException | FileNotFoundException | NullPointerException -> 0x01e2, SQLiteException | FileNotFoundException | NullPointerException -> 0x01e2, SQLiteException | FileNotFoundException | NullPointerException -> 0x01e2 }
            android.content.res.AssetFileDescriptor r20 = r10.openAssetFileDescriptor(r5, r11)     // Catch:{ IllegalStateException | SecurityException | UnsupportedOperationException -> 0x01e9, IllegalStateException | SecurityException | UnsupportedOperationException -> 0x01e9, IllegalStateException | SecurityException | UnsupportedOperationException -> 0x01e9, SQLiteException | FileNotFoundException | NullPointerException -> 0x01e2, SQLiteException | FileNotFoundException | NullPointerException -> 0x01e2, SQLiteException | FileNotFoundException | NullPointerException -> 0x01e2 }
            if (r20 != 0) goto L_0x0087
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IllegalStateException | SecurityException | UnsupportedOperationException -> 0x01e9, IllegalStateException | SecurityException | UnsupportedOperationException -> 0x01e9, IllegalStateException | SecurityException | UnsupportedOperationException -> 0x01e9, SQLiteException | FileNotFoundException | NullPointerException -> 0x01e2, SQLiteException | FileNotFoundException | NullPointerException -> 0x01e2, SQLiteException | FileNotFoundException | NullPointerException -> 0x01e2 }
            r1.<init>()     // Catch:{ IllegalStateException | SecurityException | UnsupportedOperationException -> 0x01e9, IllegalStateException | SecurityException | UnsupportedOperationException -> 0x01e9, IllegalStateException | SecurityException | UnsupportedOperationException -> 0x01e9, SQLiteException | FileNotFoundException | NullPointerException -> 0x01e2, SQLiteException | FileNotFoundException | NullPointerException -> 0x01e2, SQLiteException | FileNotFoundException | NullPointerException -> 0x01e2 }
            java.lang.String r0 = "mediafileutils/getfilefrommediastore/unable to open fd; uri="
            r1.append(r0)     // Catch:{ IllegalStateException | SecurityException | UnsupportedOperationException -> 0x01e9, IllegalStateException | SecurityException | UnsupportedOperationException -> 0x01e9, IllegalStateException | SecurityException | UnsupportedOperationException -> 0x01e9, SQLiteException | FileNotFoundException | NullPointerException -> 0x01e2, SQLiteException | FileNotFoundException | NullPointerException -> 0x01e2, SQLiteException | FileNotFoundException | NullPointerException -> 0x01e2 }
            r1.append(r5)     // Catch:{ IllegalStateException | SecurityException | UnsupportedOperationException -> 0x01e9, IllegalStateException | SecurityException | UnsupportedOperationException -> 0x01e9, IllegalStateException | SecurityException | UnsupportedOperationException -> 0x01e9, SQLiteException | FileNotFoundException | NullPointerException -> 0x01e2, SQLiteException | FileNotFoundException | NullPointerException -> 0x01e2, SQLiteException | FileNotFoundException | NullPointerException -> 0x01e2 }
            java.lang.String r1 = r1.toString()     // Catch:{ IllegalStateException | SecurityException | UnsupportedOperationException -> 0x01e9, IllegalStateException | SecurityException | UnsupportedOperationException -> 0x01e9, IllegalStateException | SecurityException | UnsupportedOperationException -> 0x01e9, SQLiteException | FileNotFoundException | NullPointerException -> 0x01e2, SQLiteException | FileNotFoundException | NullPointerException -> 0x01e2, SQLiteException | FileNotFoundException | NullPointerException -> 0x01e2 }
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IllegalStateException | SecurityException | UnsupportedOperationException -> 0x01e9, IllegalStateException | SecurityException | UnsupportedOperationException -> 0x01e9, IllegalStateException | SecurityException | UnsupportedOperationException -> 0x01e9, SQLiteException | FileNotFoundException | NullPointerException -> 0x01e2, SQLiteException | FileNotFoundException | NullPointerException -> 0x01e2, SQLiteException | FileNotFoundException | NullPointerException -> 0x01e2 }
            r0.<init>(r1)     // Catch:{ IllegalStateException | SecurityException | UnsupportedOperationException -> 0x01e9, IllegalStateException | SecurityException | UnsupportedOperationException -> 0x01e9, IllegalStateException | SecurityException | UnsupportedOperationException -> 0x01e9, SQLiteException | FileNotFoundException | NullPointerException -> 0x01e2, SQLiteException | FileNotFoundException | NullPointerException -> 0x01e2, SQLiteException | FileNotFoundException | NullPointerException -> 0x01e2 }
            throw r0     // Catch:{ IllegalStateException | SecurityException | UnsupportedOperationException -> 0x01e9, IllegalStateException | SecurityException | UnsupportedOperationException -> 0x01e9, IllegalStateException | SecurityException | UnsupportedOperationException -> 0x01e9, SQLiteException | FileNotFoundException | NullPointerException -> 0x01e2, SQLiteException | FileNotFoundException | NullPointerException -> 0x01e2, SQLiteException | FileNotFoundException | NullPointerException -> 0x01e2 }
        L_0x0087:
            java.lang.String r0 = "opened"
            long r16 = r8.A03(r0)     // Catch:{ all -> 0x01d8 }
            long r0 = r20.getLength()     // Catch:{ all -> 0x01d8 }
            android.os.ParcelFileDescriptor r9 = r20.getParcelFileDescriptor()     // Catch:{ all -> 0x01d8 }
            r3.A05(r9)     // Catch:{ all -> 0x01d8 }
            java.lang.String r9 = "gif"
            if (r4 == 0) goto L_0x00aa
            java.lang.String r3 = r4.getAbsolutePath()     // Catch:{ all -> 0x01d8 }
            java.lang.String r3 = X.C64062u9.A09(r3)     // Catch:{ all -> 0x01d8 }
            boolean r3 = r3.equalsIgnoreCase(r9)     // Catch:{ all -> 0x01d8 }
            if (r3 != 0) goto L_0x00f4
        L_0x00aa:
            java.lang.String r3 = r5.toString()     // Catch:{ all -> 0x01d8 }
            java.lang.String r3 = X.C64062u9.A09(r3)     // Catch:{ all -> 0x01d8 }
            boolean r3 = r3.equalsIgnoreCase(r9)     // Catch:{ all -> 0x01d8 }
            if (r3 != 0) goto L_0x00f4
            if (r4 == 0) goto L_0x00c4
            java.lang.String r3 = r4.getAbsolutePath()     // Catch:{ all -> 0x01d8 }
            java.lang.String r9 = X.C64062u9.A09(r3)     // Catch:{ all -> 0x01d8 }
            if (r9 != 0) goto L_0x00d0
        L_0x00c4:
            X.11B r2 = r2.A0O()     // Catch:{ all -> 0x01d8 }
            java.lang.String r2 = X.C26511Sk.A0M(r5, r2)     // Catch:{ all -> 0x01d8 }
            java.lang.String r9 = X.C25291Nq.A03(r2)     // Catch:{ all -> 0x01d8 }
        L_0x00d0:
            boolean r2 = android.text.TextUtils.isEmpty(r9)     // Catch:{ all -> 0x01d8 }
            if (r2 != 0) goto L_0x00f1
            java.lang.String r2 = "zip"
            boolean r2 = r2.equals(r9)     // Catch:{ all -> 0x01d8 }
            if (r2 == 0) goto L_0x00f1
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x01d8 }
            r3.<init>()     // Catch:{ all -> 0x01d8 }
            java.lang.String r2 = "."
            r3.append(r2)     // Catch:{ all -> 0x01d8 }
            r3.append(r9)     // Catch:{ all -> 0x01d8 }
            java.lang.String r9 = r3.toString()     // Catch:{ all -> 0x01d8 }
            goto L_0x00f6
        L_0x00f1:
            java.lang.String r9 = ""
            goto L_0x00f6
        L_0x00f4:
            java.lang.String r9 = ".gif"
        L_0x00f6:
            if (r4 == 0) goto L_0x00ff
            if (r28 == 0) goto L_0x00ff
            java.lang.String r9 = r4.getName()     // Catch:{ all -> 0x01d8 }
            goto L_0x0112
        L_0x00ff:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x01d8 }
            r3.<init>()     // Catch:{ all -> 0x01d8 }
            java.lang.String r2 = X.C26511Sk.A0K()     // Catch:{ all -> 0x01d8 }
            r3.append(r2)     // Catch:{ all -> 0x01d8 }
            r3.append(r9)     // Catch:{ all -> 0x01d8 }
            java.lang.String r9 = r3.toString()     // Catch:{ all -> 0x01d8 }
        L_0x0112:
            long r2 = r20.getLength()     // Catch:{ all -> 0x01d8 }
            java.io.File r11 = r6.A0k(r9, r2)     // Catch:{ all -> 0x01d8 }
            java.io.FileInputStream r10 = r20.createInputStream()     // Catch:{ IOException -> 0x01d3 }
            java.io.FileOutputStream r9 = new java.io.FileOutputStream     // Catch:{ all -> 0x01c7 }
            r9.<init>(r11)     // Catch:{ all -> 0x01c7 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x01bd }
            r3.<init>()     // Catch:{ all -> 0x01bd }
            java.lang.String r2 = "copy/start; size="
            r3.append(r2)     // Catch:{ all -> 0x01bd }
            r3.append(r0)     // Catch:{ all -> 0x01bd }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x01bd }
            long r12 = r8.A03(r2)     // Catch:{ all -> 0x01bd }
            X.C64062u9.A00(r10, r9)     // Catch:{ all -> 0x01bd }
            java.lang.String r2 = "copy/end"
            long r2 = r8.A03(r2)     // Catch:{ all -> 0x01bd }
            r14 = 10000000(0x989680, double:4.9406565E-317)
            int r8 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r8 >= 0) goto L_0x01b1
            r14 = 10000(0x2710, double:4.9407E-320)
            int r8 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r8 <= 0) goto L_0x01b1
            X.190 r15 = r6.A06     // Catch:{ all -> 0x01bd }
            java.lang.String r8 = "MediaFileUtils/getFileFromMediaStore/slow"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x01bd }
            r6.<init>()     // Catch:{ all -> 0x01bd }
            java.lang.String r14 = "size="
            r6.append(r14)     // Catch:{ all -> 0x01bd }
            r6.append(r0)     // Catch:{ all -> 0x01bd }
            java.lang.String r0 = "; find="
            r6.append(r0)     // Catch:{ all -> 0x01bd }
            r0 = r18
            r6.append(r0)     // Catch:{ all -> 0x01bd }
            java.lang.String r0 = "; open="
            r6.append(r0)     // Catch:{ all -> 0x01bd }
            r0 = r16
            r6.append(r0)     // Catch:{ all -> 0x01bd }
            java.lang.String r0 = "; copyStart="
            r6.append(r0)     // Catch:{ all -> 0x01bd }
            r6.append(r12)     // Catch:{ all -> 0x01bd }
            java.lang.String r0 = "; copyEnd="
            r6.append(r0)     // Catch:{ all -> 0x01bd }
            r6.append(r2)     // Catch:{ all -> 0x01bd }
            java.lang.String r0 = "; found="
            r6.append(r0)     // Catch:{ all -> 0x01bd }
            r2 = 0
            r0 = 0
            if (r4 == 0) goto L_0x018e
            r0 = 1
        L_0x018e:
            r6.append(r0)     // Catch:{ all -> 0x01bd }
            if (r7 == 0) goto L_0x01a5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01bd }
            r1.<init>()     // Catch:{ all -> 0x01bd }
            java.lang.String r0 = "; reason="
            r1.append(r0)     // Catch:{ all -> 0x01bd }
            r1.append(r7)     // Catch:{ all -> 0x01bd }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x01bd }
            goto L_0x01a7
        L_0x01a5:
            java.lang.String r0 = ""
        L_0x01a7:
            r6.append(r0)     // Catch:{ all -> 0x01bd }
            java.lang.String r0 = r6.toString()     // Catch:{ all -> 0x01bd }
            r15.A0G(r8, r0, r2)     // Catch:{ all -> 0x01bd }
        L_0x01b1:
            r9.close()     // Catch:{ all -> 0x01c7 }
            if (r10 == 0) goto L_0x01b9
            r10.close()     // Catch:{ IOException -> 0x01d3 }
        L_0x01b9:
            r20.close()     // Catch:{ IllegalStateException | SecurityException | UnsupportedOperationException -> 0x01e9, IllegalStateException | SecurityException | UnsupportedOperationException -> 0x01e9, IllegalStateException | SecurityException | UnsupportedOperationException -> 0x01e9, SQLiteException | FileNotFoundException | NullPointerException -> 0x01e2, SQLiteException | FileNotFoundException | NullPointerException -> 0x01e2, SQLiteException | FileNotFoundException | NullPointerException -> 0x01e2 }
            return r11
        L_0x01bd:
            r1 = move-exception
            r9.close()     // Catch:{ all -> 0x01c2 }
            goto L_0x01c6
        L_0x01c2:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x01c7 }
        L_0x01c6:
            throw r1     // Catch:{ all -> 0x01c7 }
        L_0x01c7:
            r1 = move-exception
            if (r10 == 0) goto L_0x01d2
            r10.close()     // Catch:{ all -> 0x01ce }
            goto L_0x01d2
        L_0x01ce:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ IOException -> 0x01d3 }
        L_0x01d2:
            throw r1     // Catch:{ IOException -> 0x01d3 }
        L_0x01d3:
            r0 = move-exception
            X.C64062u9.A0Q(r11)     // Catch:{ all -> 0x01d8 }
            throw r0     // Catch:{ all -> 0x01d8 }
        L_0x01d8:
            r1 = move-exception
            r20.close()     // Catch:{ all -> 0x01dd }
            goto L_0x01e1
        L_0x01dd:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ IllegalStateException | SecurityException | UnsupportedOperationException -> 0x01e9, IllegalStateException | SecurityException | UnsupportedOperationException -> 0x01e9, IllegalStateException | SecurityException | UnsupportedOperationException -> 0x01e9, SQLiteException | FileNotFoundException | NullPointerException -> 0x01e2, SQLiteException | FileNotFoundException | NullPointerException -> 0x01e2, SQLiteException | FileNotFoundException | NullPointerException -> 0x01e2 }
        L_0x01e1:
            throw r1     // Catch:{ IllegalStateException | SecurityException | UnsupportedOperationException -> 0x01e9, IllegalStateException | SecurityException | UnsupportedOperationException -> 0x01e9, IllegalStateException | SecurityException | UnsupportedOperationException -> 0x01e9, SQLiteException | FileNotFoundException | NullPointerException -> 0x01e2, SQLiteException | FileNotFoundException | NullPointerException -> 0x01e2, SQLiteException | FileNotFoundException | NullPointerException -> 0x01e2 }
        L_0x01e2:
            r0 = move-exception
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r0)
            throw r1
        L_0x01e9:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "MediaFileUtils/getFileFromMediaStore/unable to open stream; uri="
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.w(r0, r2)
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r2)
            throw r1
        L_0x0204:
            java.lang.String r0 = "MediaFileUtils/getFileFromMediaStore/no content resolver"
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26521Sl.A0j(android.net.Uri, boolean):java.io.File");
    }

    public File A0k(String str, long j) {
        long A022 = ((AnonymousClass11Z) this.A09.get()).A02();
        if (j >= 0 && A022 - j > 104857600) {
            return this.A00.A0b(str);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("MediaFileUtils/getSharedFileForSize/returning external file; size=");
        sb.append(j);
        sb.append("; internalAvailable=");
        sb.append(A022);
        Log.w(sb.toString());
        return C218617r.A02(this.A00.A0G(), str);
    }

    public void A0l(Uri uri, AnonymousClass1FR r9, AnonymousClass3LO r10) {
        this.A08.CGD(new C49182Pm(uri, r9, this.A07, r10, this), new Void[0]);
    }

    public void A0n(File file) {
        if (file != null) {
            try {
                if (this.A00.A0m(file)) {
                    C64062u9.A0Q(file);
                }
            } catch (IOException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("MediaFileUtils/unable to delete file ");
                sb.append(file);
                Log.e(sb.toString(), e);
            }
        }
    }

    public C26521Sl(AnonymousClass190 r3, C218617r r4, AnonymousClass1KB r5, AnonymousClass11C r6, AnonymousClass118 r7, C18030ve r8, WamediaManager wamediaManager, AnonymousClass1NL r10, AnonymousClass10I r11, AnonymousClass00H r12) {
        this.A03 = r8;
        this.A02 = r7;
        this.A07 = r5;
        this.A06 = r3;
        this.A08 = r11;
        this.A00 = r4;
        this.A09 = r12;
        this.A01 = r6;
        this.A04 = wamediaManager;
        this.A05 = r10;
        r10.A02.add("com.whatsapp.provider.MigrationContentProvider");
    }

    public static int A01(AnonymousClass21V r4, AnonymousClass1Nb r5) {
        int i;
        C26551So A022 = C63972u0.A02(r4);
        AnonymousClass205 r2 = r4.A0v;
        boolean z = r2.A02;
        if (!C63972u0.A07(A022)) {
            if (z) {
                return 3;
            }
            AnonymousClass1BI r3 = r2.A00;
            C17960vV.A07(r3);
            AnonymousClass1CJ r22 = r5.A0C;
            AnonymousClass1M9 r1 = r5.A05;
            C18070vi.A0d(r22, 1);
            C18070vi.A0d(r1, 2);
            if ((r3 == null || C43391zj.A00(r1, r22, r3) <= 0) && !r22.A0S(r3) && !C42761yh.A01(r5.A0G, r3)) {
                if (C22971Dz.A0V(r3)) {
                    i = r5.A0X().A01;
                } else {
                    i = r5.A0a(r3).A01;
                    if (i == 0 && (i = r5.A0W().A01) == 0) {
                        return 1;
                    }
                }
                if (i == 2) {
                    return 1;
                }
            }
        }
        return 2;
    }

    private Bitmap A0T(BitmapFactory.Options options, Uri uri, boolean z) {
        InputStream A0W = A0W(uri, z);
        try {
            Bitmap A062 = AnonymousClass204.A06(options, A0W);
            if (A062 == null || A062.getWidth() == 0 || A062.getHeight() == 0) {
                throw new C33261iX();
            }
            A0W.close();
            return A062;
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
            throw th;
        }
    }

    public static Uri A0U(Uri uri) {
        Uri.Builder buildUpon = uri.buildUpon();
        buildUpon.clearQuery();
        ArrayList arrayList = new ArrayList(uri.getQueryParameterNames());
        Collections.sort(arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str.equals("rotation") || str.equals("flip-h") || str.equals("flip-v")) {
                buildUpon.appendQueryParameter(str, uri.getQueryParameter(str));
            }
        }
        return buildUpon.build();
    }

    private InputStream A0W(Uri uri, boolean z) {
        InputStream A072;
        Uri build = uri.buildUpon().query((String) null).build();
        File A042 = C64062u9.A04(build);
        if (A042 != null) {
            A072 = new FileInputStream(A042);
        } else {
            AnonymousClass11B A0O = this.A01.A0O();
            if (A0O != null) {
                if (C18020vd.A05(C18040vf.A02, this.A03, 9777)) {
                    this.A02.A00.grantUriPermission("com.whatsapp", build, 1);
                }
                A072 = A0O.A07(build);
                if (A072 == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unable to open stream for uri=");
                    sb.append(build);
                    throw new IOException(sb.toString());
                }
            } else {
                throw new IOException("Could not get content resolver");
            }
        }
        if ((A072 instanceof FileInputStream) && z) {
            this.A05.A08((FileInputStream) A072, (String) null, (String) null);
        }
        return A072;
    }

    public static void A0a(C26521Sl r3, Collection collection, Collection collection2) {
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            AnonymousClass72S r1 = (AnonymousClass72S) it.next();
            if (collection.contains(r1.A0C())) {
                r3.A0n(r1.A0C());
                r3.A0n(r1.A08());
            }
        }
    }

    public static boolean A0e(String str) {
        if (str.startsWith("video/") || str.startsWith("image/") || str.startsWith("audio/")) {
            return true;
        }
        return false;
    }

    public static boolean A0f(String str) {
        if ("video/mp4".equals(str) || "video/x.looping_mp4".equals(str)) {
            return true;
        }
        return false;
    }

    @Deprecated
    public Bitmap A0i(Uri uri, int i, int i2, boolean z, boolean z2) {
        int i3;
        Bitmap bitmap;
        if (!TextUtils.isEmpty(uri.toString())) {
            Matrix A092 = C26511Sk.A09(uri, this.A01.A0O());
            if (!TextUtils.isEmpty(uri.toString())) {
                BitmapFactory.Options options = new BitmapFactory.Options();
                InputStream A0W = A0W(uri, z);
                try {
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeStream(A0W, (Rect) null, options);
                    A0W.close();
                    int i4 = options.outWidth;
                    if (i4 <= 0 || (i3 = options.outHeight) <= 0) {
                        throw new C33261iX();
                    }
                    options.inSampleSize = 1;
                    int i5 = 1;
                    int max = Math.max(i4, i3);
                    while (max / 2 > (i * 8) / 10) {
                        max /= 2;
                        i5 *= 2;
                        options.inSampleSize = i5;
                    }
                    options.inDither = true;
                    options.inJustDecodeBounds = false;
                    options.inScaled = false;
                    options.inPurgeable = true;
                    options.inInputShareable = true;
                    StringBuilder sb = new StringBuilder();
                    sb.append("SampleRotateImage/width=");
                    sb.append(i4);
                    sb.append(" | height=");
                    sb.append(i3);
                    sb.append(" | sample_size=");
                    sb.append(i5);
                    Log.i(sb.toString());
                    options.inPreferQualityOverSpeed = true;
                    options.inMutable = z2;
                    try {
                        bitmap = C26511Sk.A07(A0T(options, uri, z), A092, i, i2);
                    } catch (OutOfMemoryError e) {
                        int i6 = options.inSampleSize * 2;
                        options.inSampleSize = i6;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("SampleRotateImage/oom ");
                        sb2.append(i6);
                        Log.i(sb2.toString(), e);
                        bitmap = C26511Sk.A07(A0T(options, uri, z), A092, i, i2);
                    }
                    bitmap.isMutable();
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("SampleRotateImage/final_size:");
                    sb3.append(bitmap.getWidth());
                    sb3.append(" | ");
                    sb3.append(bitmap.getHeight());
                    Log.i(sb3.toString());
                    return bitmap;
                } catch (Throwable th) {
                    AnonymousClass0DT.A00(th, th);
                    throw th;
                }
            } else {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("No file ");
                sb4.append(uri);
                throw new FileNotFoundException(sb4.toString());
            }
        } else {
            StringBuilder sb5 = new StringBuilder();
            sb5.append("No file ");
            sb5.append(uri);
            throw new FileNotFoundException(sb5.toString());
        }
    }

    public void A0m(File file) {
        if (C22781De.A03()) {
            this.A08.CGF(new AnonymousClass7RD(this, file, 37));
            return;
        }
        try {
            if (this.A00.A0n(file)) {
                this.A08.CGF(new AnonymousClass7RD(this.A02.A00, Uri.fromFile(file), 34));
            }
        } catch (IOException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("MediaFileUtils/broadcastScanMediaIntent/unable to scan file ");
            sb.append(file);
            Log.e(sb.toString(), e);
        }
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A0c(X.C218617r r11, X.C185849dF r12, X.C32381h6 r13, com.whatsapp.media.WamediaManager r14, X.C26551So r15, java.io.File r16, java.lang.String r17, java.lang.String r18, byte[] r19, int r20, int r21, long r22) {
        /*
            r10 = r21
            if (r21 <= 0) goto L_0x00c6
            r8 = r19
            if (r19 == 0) goto L_0x00c6
            boolean r0 = X.C63972u0.A07(r15)
            r2 = r12
            r3 = r13
            r4 = r16
            r7 = r17
            r1 = r18
            r9 = r20
            r12 = r22
            if (r0 == 0) goto L_0x006f
            java.io.File r5 = r11.A0g(r7, r1)
            if (r5 == 0) goto L_0x00c6
            boolean r0 = r5.exists()
            if (r0 != 0) goto L_0x00c6
            java.io.ByteArrayOutputStream r6 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x0059 }
            r6.<init>(r10)     // Catch:{ IOException -> 0x0059 }
            r11 = 16
            boolean r0 = A0d(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x004f }
            if (r0 == 0) goto L_0x004b
            byte[] r1 = r6.toByteArray()     // Catch:{ all -> 0x004f }
            java.lang.String r0 = r5.getAbsolutePath()     // Catch:{ all -> 0x004f }
            r14.createThumbnail(r1, r10, r0)     // Catch:{ all -> 0x004f }
            boolean r0 = r5.exists()     // Catch:{ all -> 0x004f }
            if (r0 == 0) goto L_0x004b
            r5.length()     // Catch:{ all -> 0x004f }
            r6.close()     // Catch:{ IOException -> 0x0059 }
            goto L_0x0098
        L_0x004b:
            r6.close()     // Catch:{ IOException -> 0x0059 }
            goto L_0x00c6
        L_0x004f:
            r1 = move-exception
            r6.close()     // Catch:{ all -> 0x0054 }
            goto L_0x0058
        L_0x0054:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ IOException -> 0x0059 }
        L_0x0058:
            throw r1     // Catch:{ IOException -> 0x0059 }
        L_0x0059:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "CreateStickerThumbnail failed; mediaHash="
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e(r0, r2)
            goto L_0x00c6
        L_0x006f:
            java.io.File r5 = r11.A0f(r7, r1)
            if (r5 == 0) goto L_0x00c6
            boolean r0 = r5.exists()
            if (r0 != 0) goto L_0x00c6
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x00b1, IOException -> 0x00a8 }
            r6.<init>(r5)     // Catch:{ FileNotFoundException -> 0x00b1, IOException -> 0x00a8 }
            r11 = 2
            boolean r0 = A0d(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x009e }
            if (r0 == 0) goto L_0x009a
            byte[] r0 = X.C26511Sk.A02     // Catch:{ all -> 0x009e }
            r6.write(r0)     // Catch:{ all -> 0x009e }
            boolean r0 = r5.exists()     // Catch:{ all -> 0x009e }
            if (r0 == 0) goto L_0x009a
            r5.length()     // Catch:{ all -> 0x009e }
            r6.close()     // Catch:{ FileNotFoundException -> 0x00b1, IOException -> 0x00a8 }
        L_0x0098:
            r0 = 1
            return r0
        L_0x009a:
            r6.close()     // Catch:{ FileNotFoundException -> 0x00b1, IOException -> 0x00a8 }
            goto L_0x00c6
        L_0x009e:
            r1 = move-exception
            r6.close()     // Catch:{ all -> 0x00a3 }
            goto L_0x00a7
        L_0x00a3:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ FileNotFoundException -> 0x00b1, IOException -> 0x00a8 }
        L_0x00a7:
            throw r1     // Catch:{ FileNotFoundException -> 0x00b1, IOException -> 0x00a8 }
        L_0x00a8:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "CreateProgressiveThumbnail failed;mediaHash="
            goto L_0x00b9
        L_0x00b1:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "CreateProgressiveThumbnail failed could not find file progressive jpeg thumbnail; mediaHash="
        L_0x00b9:
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e(r0, r2)
        L_0x00c6:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26521Sl.A0c(X.17r, X.9dF, X.1h6, com.whatsapp.media.WamediaManager, X.1So, java.io.File, java.lang.String, java.lang.String, byte[], int, int, long):boolean");
    }
}
