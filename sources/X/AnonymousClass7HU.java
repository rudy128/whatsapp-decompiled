package X;

import android.content.ContentUris;
import android.graphics.Bitmap;
import android.provider.MediaStore;

/* renamed from: X.7HU  reason: invalid class name */
public class AnonymousClass7HU implements AnonymousClass891 {
    public final long A00;
    public final /* synthetic */ AnonymousClass73R A01;

    public Bitmap BhZ() {
        C109545dc r4;
        byte[] bArr = null;
        try {
            r4 = new C109545dc("AudioPickerActivity/ViewHolder/AlbumArtLoader/load");
            r4.setDataSource(this.A01.A0C.getApplicationContext(), ContentUris.withAppendedId(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, this.A00));
            bArr = r4.getEmbeddedPicture();
            r4.close();
        } catch (Exception | OutOfMemoryError unused) {
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
        }
        if (bArr == null) {
            return A5O.A07;
        }
        try {
            return C72473Md.A0E(bArr);
        } catch (OutOfMemoryError unused2) {
            return A5O.A07;
        }
        throw th;
    }

    public AnonymousClass7HU(AnonymousClass73R r1, long j) {
        this.A01 = r1;
        this.A00 = j;
    }

    public String Ba8() {
        return Long.toString(this.A00);
    }
}
