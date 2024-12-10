package X;

import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.2P3  reason: invalid class name */
public abstract class AnonymousClass2P3 extends C24741Lm {
    public final AnonymousClass00H A00;

    public void C9L(C122516Qr r1, boolean z) {
    }

    public final File A0A() {
        File A0e = C17880vN.A0e(((C218617r) this.A00.get()).A01.A00.getCacheDir(), "music_album_artwork");
        C218617r.A07(A0e, false);
        if (!A0e.mkdirs() && !A0e.isDirectory()) {
            Log.e("AlbumArtworkDownloader/error creating cache dir");
        }
        return A0e;
    }

    public AnonymousClass2P3(C24571Kv r1, AnonymousClass00H r2) {
        super(r1);
        this.A00 = r2;
    }

    public String BZc() {
        return "";
    }
}
