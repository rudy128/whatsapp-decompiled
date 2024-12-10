package X;

import android.os.Bundle;
import com.whatsapp.gallerypicker.GalleryPickerFragment;

/* renamed from: X.7lj  reason: invalid class name and case insensitive filesystem */
public final class C151087lj extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C113825np this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C151087lj(C113825np r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        GalleryPickerFragment galleryPickerFragment = new GalleryPickerFragment();
        C113825np r4 = this.this$0;
        Bundle A0D = C17880vN.A0D();
        A0D.putString("android.intent.extra.TEXT", r4.A0J);
        A0D.putInt("include", r4.A00);
        A0D.putBoolean("preview", r4.A0Q);
        A0D.putString("jid", r4.A0M);
        A0D.putString("mentions", r4.A0K);
        A0D.putString("quoted_group_jid", r4.A0L);
        A0D.putBoolean("picker_redesign", r4.A0S);
        Long l = r4.A0H;
        if (l != null) {
            A0D.putLong("quoted_message_row_id", l.longValue());
        }
        Integer num = r4.A0E;
        if (num != null) {
            A0D.putInt("max_items", num.intValue());
        }
        Boolean bool = r4.A06;
        if (bool != null) {
            A0D.putBoolean("skip_max_items_new_limit", bool.booleanValue());
        }
        Boolean bool2 = r4.A07;
        if (bool2 != null) {
            A0D.putBoolean("is_in_multi_select_mode_only", bool2.booleanValue());
        }
        Boolean bool3 = r4.A08;
        if (bool3 != null) {
            A0D.putBoolean("is_send_as_document", bool3.booleanValue());
        }
        Long l2 = r4.A0I;
        if (l2 != null) {
            A0D.putLong("picker_open_time", l2.longValue());
        }
        Boolean bool4 = r4.A0B;
        if (bool4 != null) {
            A0D.putBoolean("should_send_media", bool4.booleanValue());
        }
        Boolean bool5 = r4.A0A;
        if (bool5 != null) {
            A0D.putBoolean("should_hide_caption_view", bool5.booleanValue());
        }
        Boolean bool6 = r4.A09;
        if (bool6 != null) {
            A0D.putBoolean("disable_shared_activity_transition_animation", bool6.booleanValue());
        }
        Boolean bool7 = r4.A0D;
        if (bool7 != null) {
            A0D.putBoolean("should_set_gallery_result", bool7.booleanValue());
        }
        Integer num2 = r4.A0F;
        if (num2 != null) {
            A0D.putInt("origin", num2.intValue());
        }
        Boolean bool8 = r4.A0C;
        if (bool8 != null) {
            A0D.putBoolean("send_media_preview_params_as_result", bool8.booleanValue());
        }
        String str = r4.A0N;
        if (str != null) {
            A0D.putString("standalone_add_button_provider_key", str);
        }
        Boolean bool9 = r4.A04;
        if (bool9 != null) {
            A0D.putBoolean("apply_rotation_on_not_send", bool9.booleanValue());
        }
        Boolean bool10 = r4.A05;
        if (bool10 != null) {
            A0D.putBoolean("enable_template_tool", bool10.booleanValue());
        }
        galleryPickerFragment.A1R(A0D);
        return galleryPickerFragment;
    }
}
