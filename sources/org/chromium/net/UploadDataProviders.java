package org.chromium.net;

import X.C28263DwM;
import X.C28264DwN;
import X.DYO;
import android.os.ParcelFileDescriptor;
import java.io.File;
import java.nio.ByteBuffer;

public final class UploadDataProviders {
    public static UploadDataProvider create(byte[] bArr, int i, int i2) {
        return new C28263DwM(ByteBuffer.wrap(bArr, i, i2).slice(), (DYO) null);
    }

    public static UploadDataProvider create(ParcelFileDescriptor parcelFileDescriptor) {
        return new C28264DwN(new DYO(parcelFileDescriptor, 1), (DYO) null);
    }

    public static UploadDataProvider create(byte[] bArr) {
        return create(bArr, 0, bArr.length);
    }

    public static UploadDataProvider create(File file) {
        return new C28264DwN(new DYO(file, 0), (DYO) null);
    }

    public static UploadDataProvider create(ByteBuffer byteBuffer) {
        return new C28263DwM(byteBuffer.slice(), (DYO) null);
    }
}
