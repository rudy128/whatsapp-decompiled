package com.whatsapp.media.transcode;

import X.C18070vi;
import android.graphics.Bitmap;
import java.io.IOException;

public final class Mozjpeg {
    private final native boolean compressToFile(Bitmap bitmap, String str, int i, boolean z, boolean z2, boolean z3);

    public final void A00(Bitmap bitmap, String str, int i, boolean z, boolean z2, boolean z3) {
        C18070vi.A0d(str, 1);
        try {
            compressToFile(bitmap, str, i, z, z2, z3);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
