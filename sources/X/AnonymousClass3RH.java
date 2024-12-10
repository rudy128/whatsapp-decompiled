package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.widget.LinearLayout;
import com.whatsapp.WaImageButton;
import com.whatsapp.WaTextView;
import com.whatsapp.calling.callgrid.view.VoiceParticipantAudioWave;
import com.whatsapp.calling.lightweightcalling.viewmodel.AudioChatCallingViewModel;
import com.whatsapp.voipcalling.CallInfo;

/* renamed from: X.3RH  reason: invalid class name */
public final class AnonymousClass3RH extends LinearLayout implements AnonymousClass009, AnonymousClass3M7 {
    public VoiceParticipantAudioWave A00;
    public C1599286k A01;
    public C18030ve A02;
    public AnonymousClass031 A03;
    public Runnable A04;
    public boolean A05;
    public ValueAnimator A06;
    public AudioChatCallingViewModel A07;
    public final WaImageButton A08;
    public final WaImageButton A09;
    public final ViewStub A0A;
    public final WaTextView A0B;
    public final WaTextView A0C;
    public final C28931bI A0D;
    public final C18100vl A0E;

    public AnonymousClass3RH(Context context) {
        super(context, (AttributeSet) null);
        if (!this.A05) {
            this.A05 = true;
            this.A02 = AnonymousClass10E.A8r(AnonymousClass3MW.A0O(generatedComponent()));
        }
        this.A0E = AnonymousClass1DF.A01(C104865Pu.A00);
        LayoutInflater.from(context).inflate(2131624232, this, true);
        View A062 = AnonymousClass1HF.A06(this, 2131430463);
        C18070vi.A0z(A062, "null cannot be cast to non-null type com.whatsapp.WaImageButton");
        this.A08 = (WaImageButton) A062;
        View A063 = AnonymousClass1HF.A06(this, 2131430464);
        C18070vi.A0z(A063, "null cannot be cast to non-null type android.widget.FrameLayout");
        C90034dQ.A01(A063, this, 38);
        View A064 = AnonymousClass1HF.A06(this, 2131436208);
        C18070vi.A0z(A064, "null cannot be cast to non-null type com.whatsapp.WaTextView");
        this.A0C = (WaTextView) A064;
        View A065 = AnonymousClass1HF.A06(this, 2131435885);
        C18070vi.A0z(A065, "null cannot be cast to non-null type com.whatsapp.WaTextView");
        this.A0B = (WaTextView) A065;
        View A066 = AnonymousClass1HF.A06(this, 2131427911);
        C18070vi.A0z(A066, "null cannot be cast to non-null type android.view.ViewStub");
        this.A0A = (ViewStub) A066;
        this.A0D = C28931bI.A00(this, 2131430152);
        View A067 = AnonymousClass1HF.A06(this, 2131432875);
        C18070vi.A0z(A067, "null cannot be cast to non-null type com.whatsapp.WaImageButton");
        this.A09 = (WaImageButton) A067;
        View A068 = AnonymousClass1HF.A06(this, 2131432876);
        C18070vi.A0z(A068, "null cannot be cast to non-null type android.widget.FrameLayout");
        C90034dQ.A01(A068, this, 39);
        setVisibility(8);
    }

    public static final void setViewModel$lambda$3(AudioChatCallingViewModel audioChatCallingViewModel, View view) {
        C18070vi.A0d(audioChatCallingViewModel, 0);
        audioChatCallingViewModel.A0K.A00(24, 37);
        A99 a99 = audioChatCallingViewModel.A01;
        if (a99 != null) {
            A99.A0G(a99, (CallInfo) null, (String) null, 1);
        }
    }

    public final void setAbProps(C18030ve r2) {
        C18070vi.A0d(r2, 0);
        this.A02 = r2;
    }

    public void setCallLogData(C135166rl r1) {
    }

    public void setShouldHideCallDuration(boolean z) {
    }

    public void setShouldShowGenericContactOrGroupName(boolean z) {
    }

    public static final void A02(AnonymousClass3RH r7, C87274Uy r8) {
        int A002;
        Integer num = r8.A02;
        Context context = r7.getContext();
        if (num != null) {
            A002 = AnonymousClass4aR.A01(context, num.intValue(), true);
        } else {
            A002 = C19740yt.A00(context, 2131101356);
        }
        WaTextView waTextView = r7.A0C;
        AnonymousClass4ZN.A02(r7, waTextView, r8.A01);
        waTextView.setTextColor(A002);
        boolean z = r8.A05;
        if (z && r7.A00 == null) {
            View inflate = r7.A0A.inflate();
            C18070vi.A0z(inflate, "null cannot be cast to non-null type com.whatsapp.calling.callgrid.view.VoiceParticipantAudioWave");
            r7.A00 = (VoiceParticipantAudioWave) inflate;
        }
        VoiceParticipantAudioWave voiceParticipantAudioWave = r7.A00;
        if (voiceParticipantAudioWave != null) {
            voiceParticipantAudioWave.setVisibility(C72453Mb.A07(z ? 1 : 0));
        }
        VoiceParticipantAudioWave voiceParticipantAudioWave2 = r7.A00;
        if (voiceParticipantAudioWave2 != null) {
            voiceParticipantAudioWave2.setColor(A002);
        }
        AnonymousClass4ZN.A02(r7, r7.A0B, r8.A00);
        WaImageButton waImageButton = r7.A09;
        waImageButton.setSelected(r8.A03);
        C83584Fr.A00(waImageButton);
        if (r8.A04) {
            C28931bI r3 = r7.A0D;
            if (AnonymousClass3MY.A0I(r3, 0).getBackground() == null) {
                r3.A02().setBackground(r7.getAvdHolder().A00(AnonymousClass3MY.A04(r7), 2131233552, true));
                return;
            }
            return;
        }
        r7.getAvdHolder().A02();
        C28931bI r2 = r7.A0D;
        if (r2.A00 != null) {
            r2.A02().setBackground((Drawable) null);
            r2.A04(8);
        }
    }

    private final C59492mO getAvdHolder() {
        return (C59492mO) this.A0E.getValue();
    }

    /* access modifiers changed from: private */
    public final void setViewModel(AudioChatCallingViewModel audioChatCallingViewModel, AnonymousClass1F9 r5) {
        this.A07 = audioChatCallingViewModel;
        AnonymousClass3MY.A1K(r5, audioChatCallingViewModel.A0F, new AnonymousClass5R1(this), 27);
        AnonymousClass3MY.A1K(r5, audioChatCallingViewModel.A0G, AnonymousClass3MW.A16(this, 8), 27);
        AnonymousClass3MY.A1K(r5, audioChatCallingViewModel.A0E, AnonymousClass3MW.A16(this, 9), 27);
        setOnClickListener(new C89994dM(audioChatCallingViewModel, this, 42));
        C90034dQ.A01(this.A08, audioChatCallingViewModel, 40);
        C89994dM.A00(this.A09, audioChatCallingViewModel, this, 43);
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
        C18030ve r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1A();
        throw null;
    }

    public void setShouldHideBanner(boolean z) {
        AudioChatCallingViewModel audioChatCallingViewModel = this.A07;
        if (audioChatCallingViewModel != null) {
            audioChatCallingViewModel.A0B = z;
            if (z) {
                AnonymousClass3MY.A1L(audioChatCallingViewModel.A0F, false);
            } else {
                AnonymousClass3VX.A00(audioChatCallingViewModel.A0J, audioChatCallingViewModel);
            }
        }
    }

    public static final void A03(AnonymousClass3RH r5, boolean z) {
        int measuredHeight;
        ValueAnimator valueAnimator;
        if (AnonymousClass000.A1P(r5.getVisibility()) != z || ((valueAnimator = r5.A06) != null && valueAnimator.isRunning())) {
            ValueAnimator valueAnimator2 = r5.A06;
            if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                if (((C18020vd.A00(C18040vf.A02, r5.getAbProps(), 5091) >> 3) & 1) == 1) {
                    r5.setVisibility(0);
                    if (z) {
                        r5.setVisibilityInternal(true);
                    }
                    r5.measure(0, 0);
                    if (z) {
                        measuredHeight = 0;
                    } else {
                        measuredHeight = r5.getMeasuredHeight();
                    }
                    ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{measuredHeight, r5.getMeasuredHeight() - measuredHeight});
                    ofInt.addListener(new AnonymousClass3Mp(1, r5, z));
                    C88754aj.A00(ofInt, r5, 6);
                    C72473Md.A0n(ofInt, 250);
                    ofInt.start();
                    r5.A06 = ofInt;
                    return;
                }
                r5.setVisibilityInternal(z);
                return;
            }
            Runnable runnable = r5.A04;
            if (runnable != null) {
                r5.removeCallbacks(runnable);
            }
            r5.A04 = new AnonymousClass7RK(17, (Object) r5, z);
        }
    }

    public static final void setViewModel$lambda$2(AudioChatCallingViewModel audioChatCallingViewModel, AnonymousClass3RH r5, View view) {
        C18070vi.A0h(audioChatCallingViewModel, r5);
        Context A042 = AnonymousClass3MY.A04(r5);
        audioChatCallingViewModel.A0K.A00(7, 37);
        String str = audioChatCallingViewModel.A05;
        if (str != null) {
            C87394Vk.A00(str).A2C(((AnonymousClass1FL) AnonymousClass1L9.A01(A042, AnonymousClass1FY.class)).getSupportFragmentManager(), "AudioChatBottomSheetDialog");
        }
    }

    public static final void setViewModel$lambda$4(AudioChatCallingViewModel audioChatCallingViewModel, AnonymousClass3RH r5, View view) {
        boolean A16 = C18070vi.A16(audioChatCallingViewModel, r5);
        WaImageButton waImageButton = r5.A09;
        boolean z = false;
        if (waImageButton != null && waImageButton.isSelected() == A16) {
            z = true;
        }
        AnonymousClass1V9 r2 = audioChatCallingViewModel.A0K;
        int i = 1;
        if (z) {
            i = 2;
        }
        r2.A00(i, 37);
        A99 a99 = audioChatCallingViewModel.A01;
        if (a99 != null) {
            a99.A0z((Boolean) null);
        }
    }

    /* access modifiers changed from: private */
    public final void setVisibilityInternal(boolean z) {
        setVisibility(C72453Mb.A07(z ? 1 : 0));
        C1599286k r1 = this.A01;
        if (r1 != null) {
            r1.CAF(getVisibility());
        }
    }

    public void setVisibilityChangeListener(C1599286k r1) {
        this.A01 = r1;
    }

    public int getBackgroundColorRes() {
        return 2131101355;
    }
}
