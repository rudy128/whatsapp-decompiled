package X;

import com.whatsapp.media.WamediaManager;
import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.6xt  reason: invalid class name and case insensitive filesystem */
public final class C138906xt {
    public final AnonymousClass6aV A00;
    public final C125146ab A01;

    public final C136706uF A01(File file, String str) {
        if (file == null) {
            return null;
        }
        if (C18070vi.A18(str, "application/was")) {
            AnonymousClass10E r0 = this.A00.A00.A00;
            return new AnonymousClass6HJ(AnonymousClass3Ma.A0g(r0), (AnonymousClass72L) r0.A5v.get(), AnonymousClass10E.AKB(r0), file);
        }
        if (!C18070vi.A18(str, "image/webp")) {
            if (str == null) {
                Log.w("StickerHandlerFactory/getHandler null mimetype, defaulting to webp handler");
            } else {
                C17900vP.A0g("StickerHandlerFactory/getHandler Unable to create handler for ", str, AnonymousClass000.A10());
                return null;
            }
        }
        AnonymousClass10E r2 = this.A01.A00.A00;
        return new AnonymousClass6HI((WamediaManager) r2.ABs.get(), (C26611Su) r2.ABt.get(), file);
    }

    public C138906xt(AnonymousClass6aV r1, C125146ab r2) {
        C18070vi.A0j(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }

    public static C136706uF A00(C1418377d r0, AnonymousClass00H r1, File file) {
        return ((C138906xt) r1.get()).A01(file, r0.A0E);
    }
}
