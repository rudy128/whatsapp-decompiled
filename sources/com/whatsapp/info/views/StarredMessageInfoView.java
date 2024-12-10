package com.whatsapp.info.views;

import X.AnonymousClass1FU;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.C18070vi;
import X.C38471rL;
import X.C74793cj;
import X.C74983dE;
import android.content.Context;
import android.util.AttributeSet;
import com.whatsapp.WaTextView;

public class StarredMessageInfoView extends C74983dE {
    public final AnonymousClass1FU A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StarredMessageInfoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C18070vi.A0d(context, 1);
        this.A00 = AnonymousClass3MZ.A0P(context);
        setIcon(2131232320);
        C74793cj.A01(context, this, 2131896288);
    }

    public final void setupOnClickListener(C38471rL r2) {
        C18070vi.A0d(r2, 0);
        setOnClickListener(r2);
    }

    public final void A0A(long j, boolean z) {
        if (j <= 0 || z) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        WaTextView waTextView = new WaTextView(AnonymousClass3MY.A04(this));
        waTextView.setLayoutParams(AnonymousClass3Ma.A0D());
        waTextView.setId(2131435574);
        A09(waTextView, 2131435574);
        waTextView.setText(this.A04.A0L().format(j));
    }

    public final AnonymousClass1FU getActivity() {
        return this.A00;
    }
}
