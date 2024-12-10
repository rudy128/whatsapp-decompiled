package X;

import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.media.WamediaManager;
import com.whatsapp.stickers.WebpInfo;
import java.io.File;

/* renamed from: X.6vT  reason: invalid class name and case insensitive filesystem */
public abstract class C137446vT {
    public static void A00(WamediaManager wamediaManager, File file, Boolean bool, String str) {
        long j;
        WebpInfo verifyWebpFile = wamediaManager.verifyWebpFile(file.getAbsolutePath());
        int length = (int) (file.length() / 1024);
        if (verifyWebpFile == null) {
            throw new AnonymousClass1SE(AnonymousClass001.A1H("sticker file might be corrupted or invalid, sticker: ", str, AnonymousClass000.A10()));
        } else if (verifyWebpFile.height != 512) {
            throw new AnonymousClass1SE(AnonymousClass001.A1H("sticker height should be 512, sticker: ", str, AnonymousClass000.A10()));
        } else if (verifyWebpFile.width == 512) {
            int i = verifyWebpFile.numFrames;
            if (i > 1) {
                if (bool != null && !bool.booleanValue()) {
                    throw new AnonymousClass1SE(AnonymousClass001.A1H("pack is not marked as animated pack but contains animated stickers. sticker: ", str, AnonymousClass000.A10()));
                } else if (verifyWebpFile.minFrameDurationMS < 8) {
                    StringBuilder A10 = AnonymousClass000.A10();
                    AnonymousClass000.A1E("frame duration for any frame should exceed ", " ms. sticker: ", A10, 8);
                    throw new AnonymousClass1SE(AnonymousClass000.A0y(str, A10));
                } else if (verifyWebpFile.totalAnimationDurationMS > 10000) {
                    StringBuilder A102 = AnonymousClass000.A10();
                    AnonymousClass000.A1E("total animation duration should be under ", " ms. sticker: ", A102, SearchActionVerificationClientService.NOTIFICATION_ID);
                    throw new AnonymousClass1SE(AnonymousClass000.A0y(str, A102));
                }
            } else if (bool != null && bool.booleanValue()) {
                throw new AnonymousClass1SE(AnonymousClass001.A1H("pack is marked as animated pack but contains non animated stickers. All stickers in animated pack should be animated sticker. check sticker: ", str, AnonymousClass000.A10()));
            }
            long j2 = (long) length;
            if (i > 1) {
                j = 500;
            } else {
                j = 100;
            }
            if (j2 > j) {
                StringBuilder A103 = AnonymousClass000.A10();
                A103.append("sticker file should be less than ");
                A103.append(j);
                throw new AnonymousClass1SE(AnonymousClass001.A1H(" kB, file: ", str, A103));
            }
        } else {
            throw new AnonymousClass1SE(AnonymousClass001.A1H("sticker width should be  512, sticker: ", str, AnonymousClass000.A10()));
        }
    }

    public static boolean A01(String str, String str2) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("https://");
        A10.append(str2);
        if (!str.startsWith(AnonymousClass000.A0y("/", A10))) {
            StringBuilder A102 = AnonymousClass000.A10();
            C17890vO.A10("http://", str2, "/", A102);
            if (str.startsWith(A102.toString())) {
                return true;
            }
            return false;
        }
        return true;
    }
}
