package com.whatsapp.accountswitching.secondaryprocess;

import X.AnonymousClass01E;
import X.AnonymousClass28G;
import X.AnonymousClass7RK;
import X.C110885hR;
import X.C17880vN;
import X.C17890vO;
import X.C18070vi;
import X.C21470Akb;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import java.util.Locale;

public final class AccountSwitchingActivity extends AnonymousClass01E {
    public Handler A00;

    public static final void A00(AccountSwitchingActivity accountSwitchingActivity, boolean z) {
        Intent A0A = C17880vN.A0A();
        A0A.setClassName(accountSwitchingActivity.getPackageName(), "com.whatsapp.Main");
        A0A.putExtra("request_type", accountSwitchingActivity.getIntent().getIntExtra("request_type", 0));
        A0A.putExtra("is_success", z);
        A0A.putExtra("source", accountSwitchingActivity.getIntent().getIntExtra("source", 0));
        A0A.putExtra("inactive_account_num_pending_message_notifs", accountSwitchingActivity.getIntent().getIntExtra("inactive_account_num_pending_message_notifs", 0));
        A0A.putExtra("switching_start_time_ms", accountSwitchingActivity.getIntent().getLongExtra("switching_start_time_ms", 0));
        A0A.putExtra("device_id", accountSwitchingActivity.getIntent().getStringExtra("device_id"));
        A0A.putExtra("phone_id", accountSwitchingActivity.getIntent().getStringExtra("phone_id"));
        if (accountSwitchingActivity.getIntent().hasExtra("phone_id_timestamp")) {
            A0A.putExtra("phone_id_timestamp", accountSwitchingActivity.getIntent().getLongExtra("phone_id_timestamp", 0));
        }
        A0A.setFlags(268468224);
        if (accountSwitchingActivity.getIntent().hasExtra("number_of_accounts")) {
            A0A.putExtra("number_of_accounts", accountSwitchingActivity.getIntent().getIntExtra("number_of_accounts", 0));
            A0A.putExtra("account_language", accountSwitchingActivity.getIntent().getStringExtra("account_language"));
        }
        if (accountSwitchingActivity.getIntent().hasExtra("account_switching_sender_jid")) {
            A0A.putExtra("account_switching_sender_jid", accountSwitchingActivity.getIntent().getStringExtra("account_switching_sender_jid"));
        }
        A0A.putExtra("is_missed_call_notification", accountSwitchingActivity.getIntent().getBooleanExtra("is_missed_call_notification", false));
        A0A.putExtra("should_open_link_companion", accountSwitchingActivity.getIntent().getBooleanExtra("should_open_link_companion", false));
        A0A.putExtra("abandon_add_account_from_back_press", accountSwitchingActivity.getIntent().getBooleanExtra("abandon_add_account_from_back_press", false));
        A0A.putExtra("multi_account_priming_token", accountSwitchingActivity.getIntent().getStringExtra("multi_account_priming_token"));
        accountSwitchingActivity.getIntent().removeExtra("request_type");
        accountSwitchingActivity.startActivity(A0A);
        accountSwitchingActivity.finish();
    }

    public static final void A03(AccountSwitchingActivity accountSwitchingActivity, boolean z) {
        ContentProviderClient acquireUnstableContentProviderClient = accountSwitchingActivity.getContentResolver().acquireUnstableContentProviderClient("com.whatsapp.accountswitching.AccountSwitchingContentProvider");
        if (acquireUnstableContentProviderClient != null) {
            acquireUnstableContentProviderClient.release();
        }
        Handler handler = accountSwitchingActivity.A00;
        if (handler == null) {
            C18070vi.A11("mainThreadHandler");
            throw null;
        } else {
            handler.post(new AnonymousClass7RK(4, (Object) accountSwitchingActivity, z));
        }
    }

    public void onCreate(Bundle bundle) {
        Context baseContext;
        super.onCreate(bundle);
        if (bundle == null) {
            this.A00 = C17890vO.A0D();
            String stringExtra = getIntent().getStringExtra("account_language");
            if (stringExtra == null || stringExtra.length() == 0) {
                baseContext = getBaseContext();
            } else {
                baseContext = getBaseContext();
                C18070vi.A0X(baseContext);
                Locale forLanguageTag = Locale.forLanguageTag(stringExtra);
                if (forLanguageTag != null && !baseContext.getResources().getConfiguration().locale.equals(forLanguageTag)) {
                    if (Build.VERSION.SDK_INT < 26) {
                        Resources resources = baseContext.getResources();
                        Configuration configuration = resources.getConfiguration();
                        configuration.locale = forLanguageTag;
                        resources.updateConfiguration(configuration, resources.getDisplayMetrics());
                    } else {
                        Configuration configuration2 = new Configuration();
                        configuration2.setLocale(forLanguageTag);
                        baseContext = baseContext.createConfigurationContext(configuration2);
                    }
                }
            }
            int intExtra = getIntent().getIntExtra("request_type", 0);
            if (intExtra == 0) {
                A00(this, false);
                return;
            }
            setContentView(2131623980);
            View A0A = C110885hR.A0A(this, 2131429577);
            C18070vi.A0X(A0A);
            RecyclerView recyclerView = (RecyclerView) A0A;
            recyclerView.setLayoutManager(new AccountSwitchingActivity$showShimmerTransition$layoutManager$1(this));
            recyclerView.setAdapter(new AnonymousClass28G((int) Math.ceil(((double) getResources().getDisplayMetrics().heightPixels) / ((double) getResources().getDimensionPixelSize(2131165271)))));
            View A0A2 = C110885hR.A0A(this, 2131435408);
            C18070vi.A0z(A0A2, "null cannot be cast to non-null type com.facebook.shimmer.ShimmerFrameLayout");
            ((ShimmerFrameLayout) A0A2).A03();
            Handler handler = this.A00;
            if (handler == null) {
                C18070vi.A11("mainThreadHandler");
                throw null;
            } else {
                handler.post(new C21470Akb((Object) this, intExtra, 14, (Object) baseContext));
            }
        }
    }
}
