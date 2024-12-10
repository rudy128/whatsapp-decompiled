package X;

import android.content.res.Configuration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.whatsapp.status.playback.content.BlurFrameLayout;
import com.whatsapp.status.playback.widget.VoiceStatusContentView;

/* renamed from: X.5fj  reason: invalid class name and case insensitive filesystem */
public final class C110475fj extends FrameLayout implements AnonymousClass009 {
    public C18030ve A00;
    public BlurFrameLayout A01;
    public VoiceStatusContentView A02;
    public AnonymousClass031 A03;
    public boolean A04;

    public void onConfigurationChanged(Configuration configuration) {
        C18070vi.A0d(configuration, 0);
        super.onConfigurationChanged(configuration);
        VoiceStatusContentView voiceStatusContentView = this.A02;
        if (voiceStatusContentView != null) {
            ViewGroup.MarginLayoutParams A0P = C72463Mc.A0P(voiceStatusContentView);
            int dimensionPixelOffset = AnonymousClass000.A0Y(this).getDimensionPixelOffset(2131168885);
            A0P.setMargins(dimensionPixelOffset, A0P.topMargin, dimensionPixelOffset, A0P.bottomMargin);
            VoiceStatusContentView voiceStatusContentView2 = this.A02;
            if (voiceStatusContentView2 != null) {
                voiceStatusContentView2.setLayoutParams(A0P);
                VoiceStatusContentView voiceStatusContentView3 = this.A02;
                if (voiceStatusContentView3 != null) {
                    voiceStatusContentView3.requestLayout();
                    return;
                }
            }
        }
        C18070vi.A11("voiceStatusContentView");
        throw null;
    }

    public final void setAbProps(C18030ve r2) {
        C18070vi.A0d(r2, 0);
        this.A00 = r2;
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A03;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A03 = r0;
        }
        return r0.generatedComponent();
    }

    public final C18030ve getAbProps() {
        C18030ve r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1A();
        throw null;
    }

    public final AnonymousClass882 getWavesView() {
        VoiceStatusContentView voiceStatusContentView = this.A02;
        if (voiceStatusContentView != null) {
            return voiceStatusContentView;
        }
        C18070vi.A11("voiceStatusContentView");
        throw null;
    }

    public final void setBlurEnabled(boolean z) {
        BlurFrameLayout blurFrameLayout = this.A01;
        if (blurFrameLayout != null) {
            blurFrameLayout.setBlurEnabled(z);
        }
    }

    private final void setBackgroundColorFromMessage(C441822l r3) {
        int A002 = C124106Xb.A00(AnonymousClass3MY.A04(this), r3);
        setBackgroundColor(A002);
        BlurFrameLayout blurFrameLayout = this.A01;
        if (blurFrameLayout != null) {
            blurFrameLayout.setBackgroundColor(A002);
        }
    }

    /* access modifiers changed from: private */
    public final void setMessage(C441822l r2, C37451pZ r3) {
        setBackgroundColorFromMessage(r2);
        VoiceStatusContentView voiceStatusContentView = this.A02;
        if (voiceStatusContentView == null) {
            C18070vi.A11("voiceStatusContentView");
            throw null;
        } else {
            voiceStatusContentView.setVoiceMessage(r2, r3);
        }
    }
}
