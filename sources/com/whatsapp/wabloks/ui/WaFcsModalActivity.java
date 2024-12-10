package com.whatsapp.wabloks.ui;

import X.A2X;
import X.AnonymousClass7NI;
import X.AnonymousClass7NV;
import X.C108945cZ;
import X.C122166Nj;
import android.os.Bundle;
import com.whatsapp.wabloks.base.FdsContentFragmentManager;
import java.util.Queue;

public class WaFcsModalActivity extends C122166Nj {
    public FdsContentFragmentManager A00;

    public void A2a() {
        FdsContentFragmentManager fdsContentFragmentManager = this.A00;
        if (fdsContentFragmentManager != null) {
            fdsContentFragmentManager.A01 = true;
            while (true) {
                Queue queue = fdsContentFragmentManager.A03;
                if (queue.isEmpty()) {
                    break;
                }
                C108945cZ.A1P(queue.remove());
            }
        }
        super.A2a();
    }

    public void onPause() {
        FdsContentFragmentManager fdsContentFragmentManager = this.A00;
        if (fdsContentFragmentManager != null) {
            fdsContentFragmentManager.A01 = false;
        }
        super.onPause();
    }

    public void onSaveInstanceState(Bundle bundle) {
        FdsContentFragmentManager fdsContentFragmentManager = this.A00;
        if (fdsContentFragmentManager != null) {
            fdsContentFragmentManager.A01 = false;
        }
        super.onSaveInstanceState(bundle);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        A2X a2x = this.A00;
        if (a2x != null) {
            AnonymousClass7NI.A00(a2x, AnonymousClass7NV.class, this, 18);
        }
    }
}
