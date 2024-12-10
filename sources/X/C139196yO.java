package X;

import com.whatsapp.stickers.avatars.AvatarStickerOnDemandInstaller$installAvatarStickerSync$1;
import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.6yO  reason: invalid class name and case insensitive filesystem */
public final class C139196yO {
    public final C25311Ns A00;
    public final C136816uS A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;
    public final C18600wl A05;

    public final C1418377d A01(C1418377d r4) {
        C18070vi.A0d(r4, 0);
        return (C1418377d) AnonymousClass4GT.A00(this.A05, new AvatarStickerOnDemandInstaller$installAvatarStickerSync$1(r4, this, (C30391dr) null));
    }

    public static final void A00(C1418377d r6, C139196yO r7) {
        String str;
        String str2 = r6.A07;
        if (str2 != null) {
            C136816uS r5 = r7.A01;
            File A002 = r5.A00(new C139726zL(str2), r6.A0R);
            if (C18070vi.A18(A002.getAbsolutePath(), r6.A0B) && A002.exists()) {
                String str3 = r6.A0B;
                if (str3 != null) {
                    File A17 = C108945cZ.A17(str3);
                    if (A17.exists() && (str = r6.A0F) != null) {
                        File A042 = r5.A01.A04(str, r6.A0E);
                        try {
                            r5.A00.A0j(A17, A042);
                            C108945cZ.A1O(r6, A042);
                        } catch (Exception e) {
                            Log.e("AvatarOnDemandStickerFileHandler/moveStickerFileToPermanentStorage", e);
                            C108945cZ.A0p(r5.A03).A02(2, "AvatarOnDemandStickerFileHandler/moveStickerFileToPermanentStorage", AnonymousClass001.A1E(e, "Exception = ", AnonymousClass000.A10()));
                        }
                    }
                }
                if (!r6.A0M) {
                    ((C136886uZ) r7.A04.get()).A04(C18070vi.A0M(r6));
                }
            }
        }
    }

    public C139196yO(C25311Ns r2, C136816uS r3, AnonymousClass00H r4, AnonymousClass00H r5, AnonymousClass00H r6, C18600wl r7) {
        C18070vi.A0w(r4, r5, r6, r2, r3);
        C18070vi.A0d(r7, 6);
        this.A02 = r4;
        this.A04 = r5;
        this.A03 = r6;
        this.A00 = r2;
        this.A01 = r3;
        this.A05 = r7;
    }
}
