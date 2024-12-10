package X;

import android.graphics.BitmapFactory;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.Trace;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;

/* renamed from: X.DGu  reason: case insensitive filesystem */
public class C26863DGu implements E7q {
    public C25092CXd BKv(Uri uri) {
        int i;
        String str;
        String str2;
        Trace.beginSection("ImageMetadataExtractor.extract");
        String path = uri.getPath();
        if (path != null) {
            File A17 = C108945cZ.A17(path);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(A17.getPath(), options);
            int i2 = options.outHeight;
            int i3 = options.outWidth;
            try {
                i = 0;
                int attributeInt = new ExifInterface(A17.getPath()).getAttributeInt("Orientation", 0);
                if (attributeInt == 3) {
                    i = 180;
                } else if (attributeInt == 6) {
                    i = 90;
                } else if (attributeInt == 8) {
                    i = 270;
                }
            } catch (IOException | RuntimeException unused) {
                i = 0;
            }
            try {
                str = new ExifInterface(A17.getPath()).getAttribute("Copyright");
            } catch (IOException e) {
                C26294Cx6.A09("ImageMetadataExtractor", C17900vP.A0C("Failed to fetch ExifInterface.TAG_COPYRIGHT: ", AnonymousClass000.A10(), e), e);
                str = null;
            }
            try {
                str2 = new ExifInterface(A17.getPath()).getAttribute("Model");
            } catch (IOException e2) {
                Object[] A1b = AnonymousClass3MW.A1b();
                AnonymousClass8BS.A1B(e2.getMessage(), e2, A1b);
                C26294Cx6.A0F("ImageMetadataExtractor", "Failed to fetch ExifInterface.TAG_MODEL: %s", A1b);
                str2 = null;
            }
            int i4 = i3;
            C25092CXd cXd = new C25092CXd((C26543D3e) null, str, str2, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, "PHOTO", (HashMap) null, i4, i2, i, 0, 0, -1, -1, -1, A17.length(), false);
            Trace.endSection();
            return cXd;
        }
        Trace.endSection();
        throw C17880vN.A0f("uri.getPath() is null");
    }

    public C25092CXd BKw(URL url) {
        throw AnonymousClass000.A0k("do not call extractMediaMetadata on url for image");
    }
}
