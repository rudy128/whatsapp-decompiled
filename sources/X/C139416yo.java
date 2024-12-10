package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import java.io.Serializable;
import java.util.ArrayList;

/* renamed from: X.6yo  reason: invalid class name and case insensitive filesystem */
public final class C139416yo {
    public int A00;
    public int A01;
    public int A02;
    public long A03 = -1;
    public long A04;
    public long A05;
    public Uri A06;
    public Uri A07;
    public Bundle A08;
    public AnonymousClass77K A09;
    public Integer A0A;
    public Integer A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public ArrayList A0H;
    public ArrayList A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S = true;
    public boolean A0T;
    public boolean A0U;
    public final Context A0V;

    public C139416yo(Context context) {
        C18070vi.A0d(context, 1);
        this.A0V = context;
    }

    public static void A00(AnonymousClass73D r1, C139416yo r2) {
        Bundle bundle = new Bundle();
        AnonymousClass73D.A01(bundle, r1);
        r2.A08 = bundle;
    }

    public final Intent A01() {
        long j;
        Intent A0A2 = C17880vN.A0A();
        A0A2.setClassName(this.A0V.getPackageName(), "com.whatsapp.mediacomposer.MediaComposerActivity");
        A0A2.putExtra("android.intent.extra.STREAM", this.A0I);
        A0A2.putExtra("android.intent.extra.TEXT", this.A0G);
        A0A2.putExtra("first_caption", this.A0C);
        A0A2.putExtra("jid", this.A0D);
        A0A2.putExtra("jids", this.A0H);
        A0A2.putExtra("max_items", this.A00);
        A0A2.putExtra("skip_max_items_new_limit", this.A0T);
        A0A2.putExtra("origin", this.A01);
        long j2 = this.A04;
        if (j2 <= 0) {
            j2 = SystemClock.elapsedRealtime();
        }
        A0A2.putExtra("picker_open_time", j2);
        A0A2.putExtra("send", this.A0P);
        A0A2.putExtra("disable_tools_for_newsletter_forward", this.A0K);
        A0A2.putExtra("quoted_message_row_id", this.A05);
        A0A2.putExtra("quoted_group_jid", this.A0E);
        A0A2.putExtra("number_from_url", this.A0N);
        A0A2.putExtra("media_preview_params", this.A08);
        A0A2.putExtra("smb_quick_reply", false);
        A0A2.putExtra("should_send_media", this.A0S);
        A0A2.putExtra("should_hide_caption_view", this.A0R);
        A0A2.putExtra("start_home", this.A0U);
        A0A2.putExtra("auto_play_video", false);
        A0A2.putExtra("animate_uri", this.A06);
        A0A2.putExtra("preselected_image_uri", this.A07);
        A0A2.putExtra("scan_for_qr", this.A0O);
        A0A2.putExtra("is_new_content", false);
        A0A2.putExtra("status_distribution", this.A09);
        int i = this.A01;
        if (i == 1 || i == 11 || i == 14 || i == 17 || i == 57 || i == 59 || i == 20 || i == 21) {
            j = this.A03;
        } else {
            j = -1;
        }
        A0A2.putExtra("gallery_duration_ms", j);
        A0A2.putExtra("preview_top_margin", -1);
        A0A2.putExtra("preview_bottom_margin", -1);
        A0A2.putExtra("is_editing_allowed", true);
        A0A2.putExtra("should_finish_task_on_send_or_close", false);
        Integer num = this.A0A;
        if (num != null) {
            A0A2.putExtra("media_quality_selection", num);
        }
        Integer num2 = this.A0B;
        if (num2 != null) {
            A0A2.putExtra("view_once_selection", num2);
        }
        A0A2.putExtra("show_delete_thumbnail_for_single_media", false);
        A0A2.putExtra("set_result_when_last_media_deleted", false);
        A0A2.putExtra("disable_converting_video_to_gif_option", false);
        A0A2.putExtra("media_sharing_user_journey_origin", this.A02);
        A0A2.putExtra("parent_handles_redirect", false);
        A0A2.putExtra("is_media_ptv", false);
        A0A2.putExtra("captured_with_old_camera_controller", false);
        A0A2.putExtra("handle_redirect", this.A0M);
        A0A2.putExtra("camera_capture_direction", (Serializable) null);
        A0A2.putExtra("recording_stopped_automatic", false);
        A0A2.putExtra("camera_ready_time", 0);
        A0A2.putExtra("camera_switch_count", 0);
        A0A2.putExtra("send_media_preview_params_as_result", this.A0Q);
        A0A2.putExtra("show_try_templates_tooltip", false);
        A0A2.putExtra("standalone_add_button_provider_key", this.A0F);
        A0A2.putExtra("apply_rotation_on_not_send", this.A0J);
        A0A2.putExtra("enable_template_tool", this.A0L);
        A0A2.putExtra("extra_status_source_attribution_url", (String) null);
        return A0A2;
    }
}
