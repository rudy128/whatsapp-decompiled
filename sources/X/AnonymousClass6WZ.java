package X;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;

/* renamed from: X.6WZ  reason: invalid class name */
public abstract class AnonymousClass6WZ {
    public static Intent A00(Context context, AnonymousClass77F r4, AnonymousClass1BI r5, AnonymousClass205 r6, int i, int i2, int i3, int i4, int i5, int i6, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        Intent A0A = C17880vN.A0A();
        A0A.setClassName(context.getPackageName(), "com.whatsapp.mediaview.MediaViewActivity");
        A0A.putExtra("start_t", SystemClock.uptimeMillis());
        A0A.putExtra("video_play_origin", i6);
        A0A.putExtra("nogallery", z4);
        A0A.putExtra("gallery", z);
        A0A.putExtra("menu_style", i2);
        A0A.putExtra("menu_set_wallpaper", z3);
        A0A.putExtra("origin", i);
        A0A.putExtra("has_high_quality_thumbnail", z5);
        A0A.putExtra("navigation_source", i4);
        if (z2 && r4 != null) {
            A0A.putExtra("is_premium_message_insight", true);
            A0A.putExtra("temp_fmessage_media_info", r4);
        }
        if (r6 != null) {
            AnonymousClass4aU.A00(A0A, r6);
            if (i3 >= 0) {
                A0A.putExtra("message_card_index", i3);
            }
            if (i5 != -1) {
                A0A.putExtra("player_start_pos", i5);
            }
        }
        if (r5 != null) {
            AnonymousClass3MY.A12(A0A, r5, "jid");
        }
        return A0A;
    }
}
