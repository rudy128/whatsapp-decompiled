package X;

import android.content.SharedPreferences;

/* renamed from: X.2jY  reason: invalid class name and case insensitive filesystem */
public final class C57732jY {
    public int A00;
    public final C19830z4 A01;
    public final boolean A02;
    public final /* synthetic */ C201611b A03;

    public synchronized void A00(int i) {
        SharedPreferences.Editor editor;
        int i2 = this.A00 - 1;
        this.A00 = i2;
        if (this.A02 && i2 == 0) {
            this.A03.A08.A02("account_sync", (Long) null);
        }
        if (i == 1) {
            editor = C19830z4.A00(this.A01).remove("account_sync_status_num_retries");
        } else if (i == 2) {
            editor = C19830z4.A00(this.A01).remove("account_sync_picture_num_retries");
        } else if (i == 3) {
            editor = C19830z4.A00(this.A01).remove("account_sync_privacy_num_retries");
        } else if (i == 4) {
            editor = C19830z4.A00(this.A01).remove("account_sync_blocklist_num_retries");
        } else if (i == 7) {
            editor = C19830z4.A00(this.A01).remove("account_sync_text_status_num_retries");
        } else if (i == 8) {
            editor = C17890vO.A09(C35781mn.A00(this.A03.A04), "account_sync_opt_out_list_num_retries");
        }
        editor.apply();
    }

    public C57732jY(C19830z4 r1, C201611b r2, int i, boolean z) {
        this.A03 = r2;
        this.A01 = r1;
        this.A00 = i;
        this.A02 = z;
    }
}
