package X;

import android.content.SharedPreferences;

/* renamed from: X.2zN  reason: invalid class name and case insensitive filesystem */
public final class C67182zN implements AnonymousClass1L0 {
    public final AnonymousClass18O A00;

    public C67182zN(AnonymousClass18O r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public /* synthetic */ void Bqg() {
    }

    public /* synthetic */ void Bqi() {
    }

    public void Bqh() {
        SharedPreferences.Editor edit = this.A00.A00.edit();
        edit.remove("multi_share_file_preview");
        edit.remove("storage_migration_enabled");
        edit.remove("community_nux");
        edit.remove("about_community_nux");
        edit.remove("privatestats_upload_jitter_secs");
        edit.remove("group_call_callee_ring_duration");
        edit.remove("group_call_max_participants");
        edit.remove("linked_devices_ui_enabled");
        edit.remove("linked_devices_title_enabled");
        edit.remove("linked_devices_max_count");
        edit.apply();
    }
}
