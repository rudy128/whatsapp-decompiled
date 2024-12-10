package com.whatsapp.metaai.voice.ui;

import X.AnonymousClass1Y1;
import X.AnonymousClass3MW;
import X.AnonymousClass3MZ;
import X.AnonymousClass6RF;
import X.BHV;
import X.C18070vi;
import X.C24299Byw;
import android.content.Context;
import android.util.AttributeSet;

public final class MetaAiSpeechIndicatorView extends BHV {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MetaAiSpeechIndicatorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C18070vi.A0d(context, 1);
    }

    public final void setSpeechIndicatorState(AnonymousClass6RF r2) {
        C24299Byw byw;
        C18070vi.A0d(r2, 0);
        switch (r2.ordinal()) {
            case 0:
                byw = C24299Byw.Connecting;
                break;
            case 1:
                byw = C24299Byw.Listening;
                break;
            case 2:
                byw = C24299Byw.Thinking;
                break;
            case 3:
                byw = C24299Byw.Responding;
                break;
            case 4:
            case 5:
            case 6:
                byw = C24299Byw.Disconnected;
                break;
            default:
                throw AnonymousClass3MW.A14();
        }
        setSpeechIndicatorState(byw);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MetaAiSpeechIndicatorView(Context context) {
        super(context, (AttributeSet) null);
        C18070vi.A0d(context, 1);
    }

    public /* synthetic */ MetaAiSpeechIndicatorView(Context context, AttributeSet attributeSet, int i, AnonymousClass1Y1 r5) {
        this(context, AnonymousClass3MZ.A0C(attributeSet, i));
    }
}
