package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.graphics.Rect;
import android.os.Build;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: X.Crr  reason: case insensitive filesystem */
public abstract class C26077Crr {
    public static final C18100vl A00 = AnonymousClass1DF.A01(C27865Dn2.A00);

    public static final int A00(Bitmap.Config config) {
        switch (BE6.A0E(config, C24666CEg.A00)) {
            case 1:
            case 6:
            case 7:
                return 4;
            case 2:
                return 1;
            case 3:
            case 4:
                return 2;
            case 5:
                return 8;
            default:
                throw BE6.A0v("The provided Bitmap.Config is not supported");
        }
    }

    public static final int A01(Bitmap.Config config, int i, int i2) {
        if (i <= 0) {
            throw AnonymousClass001.A13("width must be > 0, width is: ", AnonymousClass000.A10(), i);
        } else if (i2 > 0) {
            int A002 = A00(config);
            int i3 = i * i2 * A002;
            if (i3 > 0) {
                return i3;
            }
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("size must be > 0: size: ");
            A10.append(i3);
            A10.append(", width: ");
            A10.append(i);
            A10.append(", height: ");
            A10.append(i2);
            throw AnonymousClass8BX.A0W(", pixelSize: ", A10, A002);
        } else {
            throw AnonymousClass001.A13("height must be > 0, height is: ", AnonymousClass000.A10(), i2);
        }
    }

    public static final C25053CVh A02(InputStream inputStream) {
        if (inputStream != null) {
            C18100vl r6 = A00;
            ByteBuffer byteBuffer = (ByteBuffer) ((C29021bS) r6.getValue()).BAf();
            if (byteBuffer == null) {
                byteBuffer = ByteBuffer.allocate(16384);
                C18070vi.A0X(byteBuffer);
            }
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            try {
                options.inTempStorage = byteBuffer.array();
                ColorSpace colorSpace = null;
                BitmapFactory.decodeStream(inputStream, (Rect) null, options);
                if (Build.VERSION.SDK_INT >= 26) {
                    colorSpace = options.outColorSpace;
                }
                return new C25053CVh(colorSpace, options.outWidth, options.outHeight);
            } finally {
                ((C29021bS) r6.getValue()).CEF(byteBuffer);
            }
        } else {
            throw C17880vN.A0g();
        }
    }
}
