package X;

import android.content.Intent;
import com.whatsapp.status.audienceselector.StatusPrivacyActivity;

/* renamed from: X.6lR  reason: invalid class name and case insensitive filesystem */
public final class C131646lR {
    public final /* synthetic */ StatusPrivacyActivity A00;

    public C131646lR(StatusPrivacyActivity statusPrivacyActivity) {
        this.A00 = statusPrivacyActivity;
    }

    public void A00(boolean z) {
        StatusPrivacyActivity statusPrivacyActivity = this.A00;
        Intent A0A = C17880vN.A0A();
        A0A.setClassName(statusPrivacyActivity.getPackageName(), "com.whatsapp.status.audienceselector.StatusRecipientsActivity");
        A0A.putExtra("is_black_list", z);
        statusPrivacyActivity.startActivityForResult(A0A, 0);
    }
}
