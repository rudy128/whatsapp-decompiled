package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.net.Uri;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.1Nq  reason: invalid class name and case insensitive filesystem */
public class C25291Nq {
    public C200710s A00;
    public final AnonymousClass11C A01;
    public final AnonymousClass10I A02;
    public final C218617r A03;
    public final AnonymousClass1NL A04;

    public Bitmap A07(Uri uri, int i, int i2) {
        return A08(uri, i, i2, true, true);
    }

    public void A0B(File file, int i) {
        Uri uri;
        C200710s r2;
        if (i == 1) {
            uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        } else if (i == 2) {
            uri = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
        } else if (i == 3 || i == 13) {
            uri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
        } else {
            uri = null;
        }
        synchronized (this) {
            r2 = this.A00;
            if (r2 == null) {
                r2 = new C200710s(this.A02, false);
                this.A00 = r2;
            }
        }
        r2.execute(new AnonymousClass7R0(this, uri, file, 20));
    }

    public static String A01(int i) {
        if (i == 0) {
            return "manual";
        }
        if (i == 1) {
            return "full";
        }
        if (i == 3) {
            return "prefetch";
        }
        if (i == 5) {
            return "aggressive_prefetch";
        }
        if (i != 6) {
            return "unknown";
        }
        return "aggressive_prefetch_manual";
    }

    public static String A03(String str) {
        String str2;
        if (str != null) {
            switch (str.hashCode()) {
                case -1487394660:
                    if (str.equals("image/jpeg")) {
                        return "jpg";
                    }
                    break;
                case -1487018032:
                    if (str.equals("image/webp")) {
                        return "webp";
                    }
                    break;
                case -1248334925:
                    if (str.equals("application/pdf")) {
                        return "pdf";
                    }
                    break;
                case -1248332507:
                    str2 = "application/rtf";
                    break;
                case -1248328278:
                    if (str.equals("application/was")) {
                        return "was";
                    }
                    break;
                case -1248325150:
                    if (str.equals("application/zip")) {
                        return "zip";
                    }
                    break;
                case -1073633483:
                    if (str.equals("application/vnd.openxmlformats-officedocument.presentationml.presentation")) {
                        return "pptx";
                    }
                    break;
                case -1071817359:
                    if (str.equals("application/vnd.ms-powerpoint")) {
                        return "ppt";
                    }
                    break;
                case -1050893613:
                    if (str.equals("application/vnd.openxmlformats-officedocument.wordprocessingml.document")) {
                        return "docx";
                    }
                    break;
                case -1004747228:
                    if (str.equals("text/csv")) {
                        return "csv";
                    }
                    break;
                case -1004732798:
                    str2 = "text/rtf";
                    break;
                case -879258763:
                    if (str.equals("image/png")) {
                        return "png";
                    }
                    break;
                case -366307023:
                    if (str.equals("application/vnd.ms-excel")) {
                        return "xls";
                    }
                    break;
                case 817335912:
                    if (str.equals("text/plain")) {
                        return "txt";
                    }
                    break;
                case 904647503:
                    if (str.equals("application/msword")) {
                        return "doc";
                    }
                    break;
                case 1993842850:
                    if (str.equals("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet")) {
                        return "xlsx";
                    }
                    break;
            }
            if (str.equals(str2)) {
                return "rtf";
            }
            String A07 = AnonymousClass1SO.A07(str, false);
            if (TextUtils.isEmpty(A07)) {
                A07 = AnonymousClass1SO.A08(str, false);
                if (TextUtils.isEmpty(A07)) {
                    String extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(str);
                    if (extensionFromMimeType != null) {
                        return extensionFromMimeType;
                    }
                }
            }
            return A07;
        }
        return "";
    }

    public static boolean A04(C18030ve r2, int i) {
        C18040vf r1 = C18040vf.A02;
        if (C18020vd.A05(r1, r2, 9797) || !C18020vd.A05(r1, r2, i)) {
            return false;
        }
        return true;
    }

    public static boolean A05(C18030ve r2, C26551So r3) {
        if (C26551So.A0V.equals(r3) && C18020vd.A05(C18040vf.A02, r2, 11191)) {
            return true;
        }
        if (!C26551So.A0d.equals(r3) || !C18020vd.A05(C18040vf.A02, r2, 11192)) {
            return false;
        }
        return true;
    }

    public static boolean A06(C26551So r2) {
        if (r2 == C26551So.A0B || r2 == C26551So.A0m) {
            return true;
        }
        return false;
    }

    public C25291Nq(C218617r r1, AnonymousClass11C r2, AnonymousClass1NL r3, AnonymousClass10I r4) {
        this.A02 = r4;
        this.A03 = r1;
        this.A01 = r2;
        this.A04 = r3;
    }

    public static Bitmap A00(BitmapFactory.Options options, Uri uri, C25291Nq r2, boolean z) {
        InputStream A0A = r2.A0A(uri, z);
        try {
            Bitmap A06 = AnonymousClass204.A06(options, A0A);
            if (A06 == null || A06.getWidth() == 0 || A06.getHeight() == 0) {
                throw new AnonymousClass2RM();
            }
            A0A.close();
            return A06;
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
            throw th;
        }
    }

    public static String A02(int i) {
        switch (i) {
            case 1:
                return "chat_personal";
            case 2:
                return "chat_group";
            case 3:
                return "status_user";
            case 4:
                return "status_ads";
            case 5:
                return "product_catalog";
            case 6:
                return "gdpr";
            case 7:
                return "sticker_picker";
            case 8:
                return "profile_picture";
            case 9:
                return "bloks";
            case 10:
                return "p2b";
            case 11:
                return "message_history_sync";
            case 12:
                return "community";
            case 13:
                return "channel";
            case 14:
                return "broadcast";
            default:
                return "unknown";
        }
    }

    public Bitmap A08(Uri uri, int i, int i2, boolean z, boolean z2) {
        Bitmap bitmap;
        if (!TextUtils.isEmpty(uri.toString())) {
            Matrix A09 = C26511Sk.A09(uri, this.A01.A0O());
            BitmapFactory.Options A092 = A09(uri, i, z, z2);
            try {
                bitmap = C26511Sk.A07(A00(A092, uri, this, z), A09, i, i2);
            } catch (OutOfMemoryError e) {
                int i3 = A092.inSampleSize * 2;
                A092.inSampleSize = i3;
                StringBuilder sb = new StringBuilder();
                sb.append("sample_rotate_image/oom ");
                sb.append(i3);
                Log.i(sb.toString(), e);
                bitmap = C26511Sk.A07(A00(A092, uri, this, z), A09, i, i2);
            }
            bitmap.isMutable();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("sample_rotate_image/final_size:");
            sb2.append(bitmap.getWidth());
            sb2.append(" | ");
            sb2.append(bitmap.getHeight());
            Log.i(sb2.toString());
            return bitmap;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("No file ");
        sb3.append(uri);
        throw new FileNotFoundException(sb3.toString());
    }

    public BitmapFactory.Options A09(Uri uri, int i, boolean z, boolean z2) {
        int i2;
        if (!TextUtils.isEmpty(uri.toString())) {
            BitmapFactory.Options options = new BitmapFactory.Options();
            InputStream A0A = A0A(uri, z);
            try {
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeStream(A0A, (Rect) null, options);
                A0A.close();
                int i3 = options.outWidth;
                if (i3 <= 0 || (i2 = options.outHeight) <= 0) {
                    throw new AnonymousClass2RM();
                }
                options.inSampleSize = 1;
                int i4 = 1;
                int max = Math.max(i3, i2);
                while (max / 2 > (i * 8) / 10) {
                    max /= 2;
                    i4 *= 2;
                    options.inSampleSize = i4;
                }
                options.inDither = true;
                options.inJustDecodeBounds = false;
                options.inScaled = false;
                options.inPurgeable = true;
                options.inInputShareable = true;
                StringBuilder sb = new StringBuilder();
                sb.append("sample_rotate_image/width=");
                sb.append(i3);
                sb.append(" | height=");
                sb.append(i2);
                sb.append(" | sample_size=");
                sb.append(i4);
                Log.i(sb.toString());
                options.inPreferQualityOverSpeed = true;
                options.inMutable = z2;
                return options;
            } catch (Throwable th) {
                AnonymousClass0DT.A00(th, th);
                throw th;
            }
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("No file ");
            sb2.append(uri);
            throw new FileNotFoundException(sb2.toString());
        }
    }

    public InputStream A0A(Uri uri, boolean z) {
        InputStream A07;
        Uri build = uri.buildUpon().query((String) null).build();
        File A042 = C64062u9.A04(build);
        if (A042 != null) {
            A07 = new FileInputStream(A042);
        } else {
            AnonymousClass11B A0O = this.A01.A0O();
            if (A0O != null) {
                A07 = A0O.A07(build);
                if (A07 == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unable to open stream for uri=");
                    sb.append(build);
                    throw new IOException(sb.toString());
                }
            } else {
                throw new IOException("Could not get content resolver");
            }
        }
        if ((A07 instanceof FileInputStream) && z) {
            this.A04.A08((FileInputStream) A07, (String) null, (String) null);
        }
        return A07;
    }
}
