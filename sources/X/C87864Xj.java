package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.net.TrafficStats;
import android.net.Uri;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/* renamed from: X.4Xj  reason: invalid class name and case insensitive filesystem */
public class C87864Xj {
    public final AnonymousClass1DT A00 = AnonymousClass3MW.A0L();
    public final AnonymousClass11E A01;
    public final C63352sv A02;
    public final AnonymousClass4XR A03;
    public final C200710s A04;

    public C85274Mt A02() {
        AnonymousClass8BJ A012;
        C63352sv r1 = this.A02;
        C85274Mt A013 = r1.A01();
        if (A013 != null) {
            return A013;
        }
        try {
            A012 = this.A03.A01();
            if (A012 != null) {
                if (!r1.A05(A012)) {
                    A012.close();
                } else {
                    C85274Mt A022 = r1.A02();
                    C17960vV.A07(A022);
                    A012.close();
                    TrafficStats.clearThreadStatsTag();
                    return A022;
                }
            }
            TrafficStats.clearThreadStatsTag();
            return null;
        } catch (IOException unused) {
            TrafficStats.clearThreadStatsTag();
            return null;
        } catch (Throwable th) {
            TrafficStats.clearThreadStatsTag();
            throw th;
        }
        throw th;
    }

    public C87864Xj(AnonymousClass11E r2, C63352sv r3, AnonymousClass4XR r4, AnonymousClass10I r5) {
        this.A04 = C200710s.A00(r5);
        this.A03 = r4;
        this.A01 = r2;
        this.A02 = r3;
    }

    public static Bitmap A00(Context context, File file) {
        FileInputStream fileInputStream;
        Point A002 = AnonymousClass4aW.A00(context);
        try {
            fileInputStream = new FileInputStream(file);
            Bitmap A0O = C72453Mb.A0O(A002, fileInputStream, true);
            fileInputStream.close();
            return A0O;
        } catch (IOException | OutOfMemoryError e) {
            Log.e("DownloadableWallpaperManager/error when loading wallpaper resource", e);
            return null;
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
        }
        throw th;
    }

    public Uri A01(Uri uri) {
        String path = uri.getPath();
        C17960vV.A07(path);
        File A032 = this.A02.A03(new File(path).getName().split("\\.")[0]);
        if (A032 == null) {
            return Uri.EMPTY;
        }
        return Uri.fromFile(A032);
    }
}
