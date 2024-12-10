package X;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

/* renamed from: X.6yS  reason: invalid class name and case insensitive filesystem */
public final class C139226yS {
    public final int A00;
    public final int A01;
    public final int A02;
    public final AnonymousClass8B2 A03;
    public final String A04;
    public final String A05;
    public final boolean A06;

    public C139226yS(AnonymousClass8B2 r2, String str, String str2, int i, int i2, int i3, boolean z) {
        C18070vi.A0d(str2, 4);
        this.A02 = i;
        this.A01 = i2;
        this.A04 = str;
        this.A05 = str2;
        this.A03 = r2;
        this.A00 = i3;
        this.A06 = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0020, code lost:
        if (r3 >= 4) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final android.net.Uri A00(X.C139226yS r4) {
        /*
            int r3 = r4.A02
            r0 = 9
            java.lang.String r2 = "bucketId"
            if (r3 != r0) goto L_0x001e
            java.lang.String r1 = r4.A04
            if (r1 == 0) goto L_0x0022
            android.net.Uri r0 = X.AnonymousClass65c.A00
            android.net.Uri$Builder r0 = r0.buildUpon()
            android.net.Uri$Builder r0 = r0.appendQueryParameter(r2, r1)
        L_0x0016:
            android.net.Uri r1 = r0.build()
            X.C18070vi.A0X(r1)
            return r1
        L_0x001e:
            r1 = 4
            r0 = 0
            if (r3 < r1) goto L_0x0023
        L_0x0022:
            r0 = 1
        L_0x0023:
            android.net.Uri r1 = android.provider.MediaStore.Images.Media.INTERNAL_CONTENT_URI
            if (r0 == 0) goto L_0x0032
            android.net.Uri$Builder r1 = r1.buildUpon()
            java.lang.String r0 = r4.A04
            android.net.Uri$Builder r0 = r1.appendQueryParameter(r2, r0)
            goto L_0x0016
        L_0x0032:
            X.C18070vi.A0Z(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C139226yS.A00(X.6yS):android.net.Uri");
    }

    public final void A01(Activity activity, Bundle bundle, AnonymousClass1LU r35, int i) {
        boolean z;
        String str;
        String str2;
        String str3;
        boolean z2;
        boolean z3;
        String str4;
        long j;
        long j2;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        String str5;
        boolean z10;
        boolean z11;
        int i2 = i;
        C18070vi.A0d(r35, 0);
        Uri A002 = A00(this);
        Activity activity2 = activity;
        Intent intent = activity2.getIntent();
        String str6 = this.A05;
        int i3 = 7;
        switch (this.A02) {
            case 0:
            case 4:
                i3 = 1;
                break;
            case 1:
            case 5:
                i3 = 4;
                break;
            case 2:
            case 6:
                i3 = 2;
                break;
        }
        int i4 = i3 & this.A01;
        Bundle bundle2 = bundle;
        if (bundle != null) {
            z = bundle2.getBoolean("preview", true);
            j = bundle2.getLong("quoted_message_row_id", 0);
            str = bundle2.getString("quoted_group_jid");
            str2 = bundle2.getString("jid");
            str3 = bundle2.getString("android.intent.extra.TEXT");
            i2 = bundle2.getInt("max_items", i2);
            z2 = bundle2.getBoolean("skip_max_items_new_limit");
            z3 = bundle2.getBoolean("is_in_multi_select_mode_only");
            str4 = bundle2.getString("mentions");
            j2 = bundle2.getLong("picker_open_time", 0);
            z4 = bundle2.getBoolean("should_send_media", true);
            z5 = bundle2.getBoolean("should_hide_caption_view", false);
            z6 = bundle2.getBoolean("disable_shared_activity_transition_animation", false);
            z7 = bundle2.getBoolean("should_set_gallery_result", false);
        } else {
            z = true;
            str = null;
            str2 = null;
            str3 = null;
            z2 = false;
            z3 = false;
            str4 = null;
            j = 0;
            j2 = 0;
            z4 = true;
            z5 = false;
            z6 = false;
            z7 = false;
        }
        boolean z12 = this.A06;
        if (bundle != null) {
            z8 = bundle2.getBoolean("is_send_as_document", false);
            z9 = bundle2.getBoolean("send_media_preview_params_as_result", false);
            str5 = bundle2.getString("standalone_add_button_provider_key");
            z10 = bundle2.getBoolean("apply_rotation_on_not_send", false);
            z11 = bundle2.getBoolean("enable_template_tool", false);
        } else {
            z8 = false;
            z9 = false;
            str5 = null;
            z10 = false;
            z11 = false;
        }
        Intent A07 = AnonymousClass3MY.A07(A002);
        A07.setClassName(activity2.getPackageName(), "com.whatsapp.gallery.NewMediaPicker");
        A07.putExtra("window_title", str6);
        A07.putExtra("include_media", i4);
        A07.putExtra("preview", z);
        A07.putExtra("quoted_message_row_id", j);
        A07.putExtra("quoted_group_jid", str);
        A07.putExtra("jid", str2);
        A07.putExtra("android.intent.extra.TEXT", str3);
        A07.putExtra("max_items", i2);
        A07.putExtra("skip_max_items_new_limit", z2);
        A07.putExtra("is_in_multi_select_mode_only", z3);
        A07.putExtra("mentions", str4);
        A07.putExtra("picker_open_time", j2);
        A07.putExtra("should_send_media", z4);
        A07.putExtra("should_hide_caption_view", z5);
        A07.putExtra("disable_shared_activity_transition_animation", z6);
        A07.putExtra("should_set_gallery_result", z7);
        A07.putExtra("is_favorite_filter_enabled", z12);
        A07.putExtra("is_send_as_document", z8);
        A07.putExtra("send_media_preview_params_as_result", z9);
        A07.putExtra("standalone_add_button_provider_key", str5);
        A07.putExtra("apply_rotation_on_not_send", z10);
        A07.putExtra("enable_template_tool", z11);
        C18070vi.A0b(intent);
        int i5 = 1;
        if (intent.hasExtra("camera_origin")) {
            i5 = AnonymousClass6W1.A00(true, intent.getIntExtra("camera_origin", 1), false);
        } else if (bundle != null) {
            i5 = bundle2.getInt("origin", 1);
        }
        A07.putExtra("origin", i5);
        activity2.startActivityForResult(A07, 90, C1406772n.A01(activity2, new C19760yx[0]).A00.toBundle());
    }
}
