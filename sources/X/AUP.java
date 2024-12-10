package X;

import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import com.facebook.msys.mci.DefaultCrypto;

public final class AUP implements C22511BAs {
    public /* synthetic */ void C1A(C195629te r1, AnonymousClass8X1 r2, AnonymousClass206 r3) {
    }

    public void C1B(C193069pU r3, C166388co r4, AnonymousClass206 r5) {
        C18070vi.A0h(r4, r5);
        if ((r4.bitField0_ & EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH) != 0 && r4.multicast_) {
            r5.A0b(64);
        }
        if ((r4.bitField0_ & DefaultCrypto.BUFFER_SIZE) != 0 && r4.urlNumber_) {
            r5.A0b(4);
        }
        if ((r4.bitField0_ & ZipDecompressor.UNZIP_BUFFER_SIZE) != 0 && r4.urlText_) {
            r5.A0b(2);
        }
    }
}
