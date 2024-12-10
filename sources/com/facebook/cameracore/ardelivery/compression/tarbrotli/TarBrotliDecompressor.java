package com.facebook.cameracore.ardelivery.compression.tarbrotli;

import X.AnonymousClass000;
import X.AnonymousClass1A8;
import X.AnonymousClass8BS;
import X.AnonymousClass9N9;
import X.C108945cZ;
import X.C22406B6j;
import com.facebook.cameracore.common.exception.EffectsFrameworkException;
import com.facebook.jni.HybridData;
import java.io.File;

public class TarBrotliDecompressor implements C22406B6j {
    public final HybridData mHybridData = initHybrid();

    public static native HybridData initHybrid();

    private native int unarchiveFile(String str, String str2);

    static {
        AnonymousClass1A8.A06("tar-brotli-archive-native");
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.9N9, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v3, types: [X.9N9, java.lang.Object] */
    public AnonymousClass9N9 decompress(String str, String str2) {
        StringBuilder sb;
        try {
            int unarchiveFile = unarchiveFile(str, str2);
            if (unarchiveFile == 0) {
                File A17 = C108945cZ.A17(str2);
                ? obj = new Object();
                obj.A00 = A17;
                return obj;
            }
            sb = AnonymousClass000.A10();
            sb.append("Failed to decompress tar brotli, result code=");
            sb.append(unarchiveFile);
            String obj2 = sb.toString();
            ? obj3 = new Object();
            obj3.A01 = obj2;
            return obj3;
        } catch (EffectsFrameworkException | RuntimeException e) {
            sb = AnonymousClass000.A10();
            sb.append("Failed to decompress tar brotli: ");
            AnonymousClass8BS.A1I(sb, e);
        }
    }
}
