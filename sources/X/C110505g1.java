package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.whatsapp.calling.lightweightcalling.viewmodel.AudioChatCallingViewModel;
import com.whatsapp.calling.views.VoipReturnToCallBanner;

/* renamed from: X.5g1  reason: invalid class name and case insensitive filesystem */
public final class C110505g1 extends FrameLayout implements AnonymousClass009, AnonymousClass3M7 {
    public AnonymousClass1F9 A00;
    public AnonymousClass3RH A01;
    public AudioChatCallingViewModel A02;
    public AnonymousClass031 A03;
    public boolean A04;
    public C1599286k A05;
    public final VoipReturnToCallBanner A06;

    public C110505g1(Context context) {
        super(context, (AttributeSet) null);
        if (!this.A04) {
            this.A04 = true;
            generatedComponent();
        }
        LayoutInflater.from(context).inflate(2131625810, this, true);
        View A062 = AnonymousClass1HF.A06(this, 2131434683);
        C18070vi.A0z(A062, "null cannot be cast to non-null type com.whatsapp.calling.views.VoipReturnToCallBanner");
        this.A06 = (VoipReturnToCallBanner) A062;
        setVisibility(8);
    }

    public void setCallLogData(C135166rl r2) {
        C18070vi.A0d(r2, 0);
        this.A06.A03 = r2;
    }

    public void setVisibilityChangeListener(C1599286k r3) {
        C143587Dz r1 = new C143587Dz(r3, this, 1);
        this.A05 = r1;
        this.A06.A04 = r1;
        AnonymousClass3RH r0 = this.A01;
        if (r0 != null) {
            r0.A01 = r1;
        }
    }

    /* access modifiers changed from: private */
    public final void setAudioChatViewModel(AudioChatCallingViewModel audioChatCallingViewModel, AnonymousClass1F9 r2) {
        this.A02 = audioChatCallingViewModel;
        this.A00 = r2;
    }

    /* access modifiers changed from: private */
    public final void setupVoiceChatBanner(boolean z) {
        String str;
        if (z && this.A01 == null) {
            Context A042 = AnonymousClass3MY.A04(this);
            AudioChatCallingViewModel audioChatCallingViewModel = this.A02;
            if (audioChatCallingViewModel == null) {
                str = "audioChatViewModel";
            } else {
                AnonymousClass1F9 r0 = this.A00;
                if (r0 == null) {
                    str = "lifeCycleOwner";
                } else {
                    AnonymousClass3RH r1 = new AnonymousClass3RH(A042);
                    r1.setViewModel(audioChatCallingViewModel, r0);
                    this.A01 = r1;
                    C1599286k r02 = this.A05;
                    if (r02 == null) {
                        str = "visibilityChangeListener";
                    } else {
                        r1.A01 = r02;
                        addView(r1);
                        return;
                    }
                }
            }
            C18070vi.A11(str);
            throw null;
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

    public int getBackgroundColorRes() {
        AnonymousClass3RH r0 = this.A01;
        if (r0 == null || r0.getVisibility() != 0) {
            return this.A06.getBackgroundColorRes();
        }
        return 2131101355;
    }

    public void setShouldHideBanner(boolean z) {
        AnonymousClass3RH r0 = this.A01;
        if (r0 != null) {
            r0.setShouldHideBanner(z);
        }
        this.A06.setShouldHideBanner(z);
    }

    public void setShouldHideCallDuration(boolean z) {
        this.A06.setShouldHideCallDuration(z);
    }

    public void setShouldShowGenericContactOrGroupName(boolean z) {
        this.A06.setShouldShowGenericContactOrGroupName(z);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        post(new C146427Pb(this, 22));
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AudioChatCallingViewModel audioChatCallingViewModel = this.A02;
        if (audioChatCallingViewModel == null) {
            C18070vi.A11("audioChatViewModel");
            throw null;
        } else {
            audioChatCallingViewModel.A0F.A0D(new AnonymousClass7AT(C108945cZ.A1K(this, 7), 20));
        }
    }

    public void onWindowFocusChanged(boolean z) {
        int i;
        super.onWindowFocusChanged(z);
        AudioChatCallingViewModel audioChatCallingViewModel = this.A02;
        if (audioChatCallingViewModel == null) {
            C18070vi.A11("audioChatViewModel");
            throw null;
        }
        if (z) {
            i = getVisibility();
        } else {
            i = 8;
        }
        audioChatCallingViewModel.A04 = Integer.valueOf(i);
        A99 a99 = audioChatCallingViewModel.A01;
        if (a99 != null) {
            a99.A0j(i);
        }
    }
}
