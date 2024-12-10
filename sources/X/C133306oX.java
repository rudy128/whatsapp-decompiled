package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;

/* renamed from: X.6oX  reason: invalid class name and case insensitive filesystem */
public final class C133306oX {
    public final Bitmap A00(Bitmap bitmap, Bitmap bitmap2) {
        Integer num;
        Bitmap.Config config = bitmap.getConfig();
        if (config != null) {
            Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), config);
            Canvas A0E = C108955ca.A0E(createBitmap);
            A0E.drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
            A0E.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
            if (createBitmap.getWidth() < 196) {
                StringBuilder A10 = AnonymousClass000.A10();
                C108975cc.A0o(createBitmap, "AvatarProfilePhotoGenerator/bitmap width too low (", A10);
                C17890vO.A1A(A10, "), will be scaled up.");
                num = 196;
            } else {
                num = null;
            }
            if (createBitmap.getWidth() > 640) {
                StringBuilder A102 = AnonymousClass000.A10();
                C108975cc.A0o(createBitmap, "AvatarProfilePhotoGenerator/bitmap width too high (", A102);
                C17890vO.A1A(A102, "), will be scaled down.");
                num = 640;
            } else if (num == null) {
                return createBitmap;
            }
            int intValue = num.intValue();
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(createBitmap, intValue, intValue, false);
            C18070vi.A0X(createScaledBitmap);
            return createScaledBitmap;
        }
        throw C17880vN.A0g();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001c, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0018, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0019, code lost:
        X.CDX.A00(r2, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] A01(android.graphics.Bitmap r4) {
        /*
            r3 = this;
            java.io.ByteArrayOutputStream r2 = X.C108945cZ.A15()
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ all -> 0x0016 }
            r0 = 100
            r4.compress(r1, r0, r2)     // Catch:{ all -> 0x0016 }
            r2.close()
            byte[] r0 = r2.toByteArray()
            X.C18070vi.A0X(r0)
            return r0
        L_0x0016:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0018 }
        L_0x0018:
            r0 = move-exception
            X.CDX.A00(r2, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C133306oX.A01(android.graphics.Bitmap):byte[]");
    }
}
