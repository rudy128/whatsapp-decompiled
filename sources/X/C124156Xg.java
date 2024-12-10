package X;

import android.net.Uri;
import android.os.Bundle;
import com.whatsapp.stickers.info.bottomsheet.StickerInfoBottomSheet;

/* renamed from: X.6Xg  reason: invalid class name and case insensitive filesystem */
public abstract class C124156Xg {
    public static final StickerInfoBottomSheet A00(Uri uri, AnonymousClass205 r4, C1418377d r5, C122606Ra r6, String str, boolean z, boolean z2) {
        Bundle A0D = C17880vN.A0D();
        A0D.putBoolean("arg_from_me", z);
        A0D.putParcelable("arg_sticker", r5);
        A0D.putString("arc_raw_chat_jid", str);
        A0D.putInt("arg_launcher_origin", r6.value);
        A0D.putBoolean("arg_search_flow", z2);
        if (uri != null) {
            A0D.putParcelable("image_uri", uri);
        }
        if (r4 != null) {
            AnonymousClass4aU.A0A(A0D, r4);
        }
        StickerInfoBottomSheet stickerInfoBottomSheet = new StickerInfoBottomSheet();
        stickerInfoBottomSheet.A1R(A0D);
        return stickerInfoBottomSheet;
    }
}
