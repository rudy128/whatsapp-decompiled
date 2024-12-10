package X;

import android.content.SharedPreferences;

/* renamed from: X.2ze  reason: invalid class name and case insensitive filesystem */
public final class C67352ze implements AnonymousClass1L0 {
    public final C19830z4 A00;
    public final AnonymousClass00H A01;

    public /* synthetic */ void Bqg() {
    }

    public /* synthetic */ void Bqi() {
    }

    public void Bqh() {
        SharedPreferences.Editor A002 = C19830z4.A00(this.A00);
        A002.remove("detect_device_tablet");
        A002.remove("dismissed_invite_member_row");
        A002.remove("fingerprint_authentication_needed");
        A002.remove("video_transcode_compliance_v5");
        A002.remove("video_transcode_saved_local_config");
        A002.apply();
        this.A01.get();
        C24521Kq r0 = C24521Kq.$redex_init_class;
    }

    public C67352ze(C19830z4 r1, AnonymousClass00H r2) {
        C18070vi.A0j(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }
}
