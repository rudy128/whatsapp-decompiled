package X;

import android.graphics.Bitmap;
import com.facebook.animated.webp.WebPImage;

/* renamed from: X.6iS  reason: invalid class name and case insensitive filesystem */
public class C129836iS {
    public final Bitmap A00;
    public final Bitmap A01;
    public final C139396yl A02;
    public final C26661Sz A03;
    public final C127916f9 A04;

    public C129836iS(Bitmap bitmap, WebPImage webPImage, C26661Sz r11, String str, int i, int i2) {
        this.A03 = r11;
        this.A00 = bitmap;
        this.A04 = new C127916f9(webPImage.getFrameDurations(), webPImage.getFrameCount());
        this.A02 = new C139396yl(bitmap, webPImage, str, i, i2);
        this.A01 = C108945cZ.A0H(i, i2);
    }
}
