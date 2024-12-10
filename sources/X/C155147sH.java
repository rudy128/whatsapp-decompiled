package X;

import android.graphics.drawable.Drawable;
import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.7sH  reason: invalid class name and case insensitive filesystem */
public final class C155147sH extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C1194868i $downloader;
    public final /* synthetic */ File $resultFile;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C155147sH(C1194868i r2, File file) {
        super(0);
        this.$resultFile = file;
        this.$downloader = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        this.$resultFile.delete();
        C1409173o r2 = this.$downloader.A03().A00;
        if (r2.A03()) {
            return Drawable.createFromPath(this.$resultFile.getPath());
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("AiCreationPhotoLoader/loadPhoto failed. Status: ");
        Log.w(C17880vN.A0t(A10, r2.A01));
        return null;
    }
}
