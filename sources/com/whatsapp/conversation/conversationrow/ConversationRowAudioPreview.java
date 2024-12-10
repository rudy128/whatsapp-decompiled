package com.whatsapp.conversation.conversationrow;

import X.AnonymousClass009;
import X.AnonymousClass031;
import X.AnonymousClass033;
import X.AnonymousClass10E;
import X.AnonymousClass1HF;
import X.AnonymousClass3MW;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C27691Xc;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.whatsapp.WaTextView;

public class ConversationRowAudioPreview extends FrameLayout implements AnonymousClass009 {
    public ImageView A00;
    public WaveformVisualizerView A01;
    public C18030ve A02;
    public AnonymousClass031 A03;
    public ImageView A04;
    public WaTextView A05;
    public boolean A06;

    public void A01() {
        this.A01.setVisibility(8);
        this.A00.setVisibility(0);
    }

    public void A02() {
        if (!this.A06) {
            this.A06 = true;
            this.A02 = AnonymousClass10E.A8q(((C27691Xc) ((AnonymousClass033) generatedComponent())).A10);
        }
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A03;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A03 = r0;
        }
        return r0.generatedComponent();
    }

    public void setDuration(String str) {
        this.A05.setText(str);
    }

    public ConversationRowAudioPreview(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A02();
        A00(context);
    }

    private void A00(Context context) {
        WaTextView waTextView;
        float f;
        View.inflate(context, 2131624770, this);
        this.A04 = AnonymousClass3MW.A0G(this, 2131433831);
        this.A01 = (WaveformVisualizerView) AnonymousClass1HF.A06(this, 2131436850);
        this.A00 = AnonymousClass3MW.A0G(this, 2131431496);
        this.A05 = (WaTextView) AnonymousClass1HF.A06(this, 2131430189);
        boolean A052 = C18020vd.A05(C18040vf.A02, this.A02, 1040);
        ImageView imageView = this.A04;
        if (A052) {
            imageView.setImageResource(2131231027);
            this.A05.A0L();
            waTextView = this.A05;
            f = 10.0f;
        } else {
            imageView.setImageResource(2131231028);
            this.A05.A0J();
            waTextView = this.A05;
            f = 12.0f;
        }
        waTextView.setTextSize(2, f);
    }

    public ConversationRowAudioPreview(Context context) {
        super(context);
        A02();
        A00(context);
    }

    public ConversationRowAudioPreview(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A02();
        A00(context);
    }

    public ConversationRowAudioPreview(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        A02();
    }
}
