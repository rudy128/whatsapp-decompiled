package X;

import android.os.ParcelFileDescriptor;
import android.util.JsonReader;

/* renamed from: X.8vN  reason: invalid class name and case insensitive filesystem */
public class C173618vN extends C21332AiH {
    public final C20048A4r A00;
    public final ParcelFileDescriptor A01;

    public C173618vN(ParcelFileDescriptor parcelFileDescriptor, JsonReader jsonReader, C20048A4r a4r) {
        super(jsonReader);
        this.A01 = parcelFileDescriptor;
        this.A00 = a4r;
    }

    public void close() {
        super.close();
        this.A01.close();
    }
}
