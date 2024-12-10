package com.whatsapp.contactinput.contactscreen;

import X.AnonymousClass1FP;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.C111035hu;
import X.C111925ke;
import X.C149607jK;
import X.C149617jL;
import X.C155597t0;
import X.C18070vi;
import X.C18100vl;
import X.C99274sY;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collections;
import java.util.List;

public final class NativeContactActivity extends AnonymousClass1FP {
    public final C18100vl A00 = C99274sY.A00(new C149617jL(this), new C149607jK(this), new C155597t0(this), AnonymousClass3MW.A15(C111035hu.class));

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131624077);
        List emptyList = Collections.emptyList();
        C18070vi.A0X(emptyList);
        ((RecyclerView) AnonymousClass3MY.A0H(this, 2131430983)).setAdapter(new C111925ke(emptyList));
    }
}
