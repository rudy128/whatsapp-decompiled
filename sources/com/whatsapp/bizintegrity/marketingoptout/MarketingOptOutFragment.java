package com.whatsapp.bizintegrity.marketingoptout;

import X.C35751mk;
import X.C55892gX;
import android.content.Context;
import android.content.DialogInterface;
import com.whatsapp.bizintegrity.utils.BizIntegrityFragment;
import com.whatsapp.jid.UserJid;

public class MarketingOptOutFragment extends BizIntegrityFragment {
    public Context A00;
    public C55892gX A01;
    public C35751mk A02;
    public UserJid A03;
    public String A04;

    public void onDismiss(DialogInterface dialogInterface) {
        C35751mk r2 = this.A02;
        if (r2 != null) {
            r2.A01(this.A03, "quick_action");
        }
        super.onDismiss(dialogInterface);
    }
}
