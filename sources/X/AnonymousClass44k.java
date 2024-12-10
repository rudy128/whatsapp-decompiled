package X;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.privacy.checkup.Hilt_PrivacyCheckupBaseFragment;
import com.whatsapp.privacy.checkup.Hilt_PrivacyCheckupMorePrivacyFragment;
import com.whatsapp.privacy.checkup.Hilt_PrivacyCheckupMoreSecurityFragment;
import com.whatsapp.privacy.checkup.PrivacyCheckupHomeActivity;

/* renamed from: X.44k  reason: invalid class name */
public abstract class AnonymousClass44k extends C75253eF {
    public C26261Rl A00;
    public C62332rE A01;

    public void onCreate(Bundle bundle) {
        Hilt_PrivacyCheckupBaseFragment hilt_PrivacyCheckupBaseFragment;
        Bundle A0D;
        String str;
        super.onCreate(bundle);
        setContentView(2131626592);
        boolean z = this instanceof PrivacyCheckupHomeActivity;
        Intent intent = getIntent();
        if (z) {
            int intExtra = intent.getIntExtra("ENTRY_POINT", -1);
            hilt_PrivacyCheckupBaseFragment = new Hilt_PrivacyCheckupBaseFragment();
            A0D = C17880vN.A0D();
            A0D.putInt("extra_entry_point", intExtra);
        } else {
            int intExtra2 = intent.getIntExtra("ENTRY_POINT", -1);
            int intExtra3 = getIntent().getIntExtra("DETAIL_CATEGORY", 0);
            if (intExtra3 == 1) {
                hilt_PrivacyCheckupBaseFragment = new Hilt_PrivacyCheckupBaseFragment();
            } else if (intExtra3 == 2) {
                hilt_PrivacyCheckupBaseFragment = new Hilt_PrivacyCheckupBaseFragment();
            } else if (intExtra3 == 3) {
                hilt_PrivacyCheckupBaseFragment = new Hilt_PrivacyCheckupMorePrivacyFragment();
            } else if (intExtra3 != 4) {
                finish();
                return;
            } else {
                hilt_PrivacyCheckupBaseFragment = new Hilt_PrivacyCheckupMoreSecurityFragment();
            }
            A0D = C17880vN.A0D();
            A0D.putInt("extra_entry_point", intExtra2);
        }
        hilt_PrivacyCheckupBaseFragment.A1R(A0D);
        Toolbar A0G = AnonymousClass3Ma.A0G(this);
        if (A0G != null) {
            A0G.setTitle((CharSequence) getString(2131894721));
            AnonymousClass3NL.A02(getApplicationContext(), A0G, this.A00, 2131231675);
            setSupportActionBar(A0G);
        }
        C34001jj A0H = AnonymousClass3Ma.A0H(this);
        if (z) {
            str = "PrivacyCheckupHomeFragment";
        } else {
            int intExtra4 = getIntent().getIntExtra("DETAIL_CATEGORY", 0);
            if (intExtra4 == 1) {
                str = "PrivacyCheckupContactFragment";
            } else if (intExtra4 == 2) {
                str = "PrivacyCheckupAudienceFragment";
            } else if (intExtra4 == 3) {
                str = "PrivacyCheckupMorePrivacyFragment";
            } else if (intExtra4 != 4) {
                str = "";
            } else {
                str = "PrivacyCheckupMoreSecurityFragment";
            }
        }
        A0H.A0D(hilt_PrivacyCheckupBaseFragment, str, 2131434070);
        A0H.A01();
    }
}
