package X;

import com.whatsapp.media.WamediaManager;
import com.whatsapp.stickers.WebpInfo;
import java.io.File;

/* renamed from: X.6HI  reason: invalid class name */
public final class AnonymousClass6HI extends C136706uF {
    public final WamediaManager A00;
    public final C26611Su A01;
    public final WebpInfo A02;
    public final File A03;
    public final C18100vl A04 = AnonymousClass1DF.A01(new C153967qN(this));

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass6HI(WamediaManager wamediaManager, C26611Su r3, File file) {
        super(file);
        C18070vi.A0j(wamediaManager, r3);
        this.A00 = wamediaManager;
        this.A01 = r3;
        this.A03 = file;
        this.A02 = wamediaManager.verifyWebpFile(file.getAbsolutePath());
    }
}
