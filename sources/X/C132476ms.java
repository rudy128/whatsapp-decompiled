package X;

import android.app.Activity;
import android.content.Intent;

/* renamed from: X.6ms  reason: invalid class name and case insensitive filesystem */
public final class C132476ms {
    public final C18030ve A00;
    public final AnonymousClass1LU A01;
    public final C24641Lc A02;

    public final void A00(Activity activity, int i, int i2, int i3, int i4) {
        int i5 = i;
        int A002 = AnonymousClass6W1.A00(false, i5, true);
        C18030ve r1 = this.A02.A01;
        C18040vf r0 = C18040vf.A02;
        int A003 = C18020vd.A00(r0, r1, 12105);
        if (A003 <= 0) {
            A003 = C18020vd.A00(r0, this.A00, 2693);
        }
        Activity activity2 = activity;
        Intent A0d = AnonymousClass1LU.A0d(activity2, C29671cg.A00, (AnonymousClass1EC) null, C17880vN.A0k(), 1, "", C18460wS.A00, A003, A002, i2, 0, false, false, false, true);
        A0d.putExtra("default_tab", 0);
        A0d.putExtra("include_media", 7);
        A0d.putExtra("should_hide_caption_view", false);
        A0d.putExtra("force_non_hd_toggle", true);
        A0d.putExtra("camera_picker_origin", i5);
        A0d.putExtra("status_creation_entrypoint", i3);
        A0d.putExtra("message_media_origin", i4);
        A0d.putExtra("force_non_caption_layout", true);
        A0d.putExtra("force_non_multitype_by_default", C18020vd.A05(r0, r1, 12582));
        A0d.putExtra("maintain_selection_state_on_cancel", true);
        A0d.putExtra("disable_shared_activity_transition_animation", true);
        activity2.startActivityForResult(A0d, 22);
    }

    public C132476ms(C18030ve r1, AnonymousClass1LU r2, C24641Lc r3) {
        C18070vi.A0o(r2, r3, r1);
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }
}
