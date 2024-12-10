package com.whatsapp.textstatuscomposer.voice;

import X.AnonymousClass000;
import X.AnonymousClass009;
import X.AnonymousClass00H;
import X.AnonymousClass031;
import X.AnonymousClass10E;
import X.AnonymousClass11S;
import X.AnonymousClass1DC;
import X.AnonymousClass1E8;
import X.AnonymousClass1HF;
import X.AnonymousClass1VU;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass6LS;
import X.AnonymousClass784;
import X.AnonymousClass78P;
import X.AnonymousClass793;
import X.AnonymousClass79V;
import X.AnonymousClass7BU;
import X.AnonymousClass861;
import X.AnonymousClass862;
import X.AnonymousClass88G;
import X.C000200d;
import X.C108945cZ;
import X.C108975cc;
import X.C109635dl;
import X.C145827Mt;
import X.C145837Mu;
import X.C145847Mv;
import X.C1608089z;
import X.C17890vO;
import X.C18000vb;
import X.C18070vi;
import X.C27201Vd;
import X.C29071bZ;
import X.C29191bl;
import X.C37451pZ;
import X.C64052u8;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.whatsapp.WaImageButton;
import com.whatsapp.WaImageView;
import com.whatsapp.conversation.waveforms.VoiceVisualizer;
import com.whatsapp.status.playback.widget.VoiceStatusProfileAvatarView;
import com.whatsapp.voicerecorder.VoiceNoteSeekBar;

public final class VoiceRecordingView extends ConstraintLayout implements AnonymousClass009, C1608089z, AnonymousClass88G {
    public View A00;
    public View A01;
    public Animation A02;
    public TextView A03;
    public AnonymousClass11S A04;
    public WaImageButton A05;
    public C27201Vd A06;
    public VoiceVisualizer A07;
    public AnonymousClass1VU A08;
    public AnonymousClass861 A09;
    public VoiceStatusRecordingVisualizer A0A;
    public AnonymousClass862 A0B;
    public AnonymousClass1DC A0C;
    public VoiceNoteSeekBar A0D;
    public AnonymousClass00H A0E;
    public AnonymousClass00H A0F;
    public AnonymousClass031 A0G;
    public C37451pZ A0H;
    public VoiceStatusProfileAvatarView A0I;
    public boolean A0J;
    public final ViewTreeObserver.OnGlobalLayoutListener A0K;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VoiceRecordingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C18070vi.A0d(context, 1);
        A07();
        this.A0K = new AnonymousClass793(this, 26);
        View.inflate(getContext(), 2131627476, this);
        View A062 = AnonymousClass1HF.A06(this, 2131436929);
        C18070vi.A0X(A062);
        this.A0I = (VoiceStatusProfileAvatarView) A062;
        View A063 = AnonymousClass1HF.A06(this, 2131436925);
        C18070vi.A0X(A063);
        this.A01 = A063;
        View A064 = AnonymousClass1HF.A06(this, 2131436931);
        C18070vi.A0X(A064);
        this.A03 = (TextView) A064;
        View A065 = AnonymousClass1HF.A06(this, 2131436926);
        C18070vi.A0X(A065);
        this.A05 = (WaImageButton) A065;
        View A066 = AnonymousClass1HF.A06(this, 2131436924);
        C18070vi.A0X(A066);
        this.A00 = A066;
        View A067 = AnonymousClass1HF.A06(this, 2131436928);
        C18070vi.A0X(A067);
        this.A07 = (VoiceVisualizer) A067;
        View A068 = AnonymousClass1HF.A06(this, 2131436930);
        C18070vi.A0X(A068);
        this.A0A = (VoiceStatusRecordingVisualizer) A068;
        View A069 = AnonymousClass1HF.A06(this, 2131436927);
        C18070vi.A0X(A069);
        VoiceNoteSeekBar voiceNoteSeekBar = (VoiceNoteSeekBar) A069;
        voiceNoteSeekBar.A03 = true;
        voiceNoteSeekBar.setMax(1000);
        this.A0D = voiceNoteSeekBar;
        setBackgroundResource(2131233583);
        int dimensionPixelSize = getResources().getDimensionPixelSize(2131168886);
        setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        this.A0H = getContactPhotos().A06(getContext(), "voice-recording-view");
        A01();
        this.A0A.setListener(new C145837Mu(this));
        this.A05.setOnClickListener(new AnonymousClass78P((Object) this, 49));
        this.A01.setOnClickListener(new AnonymousClass784(this, 0));
        setupPreviewProgressIndicatorSizes(false);
        this.A0D.setOnSeekBarChangeListener(new AnonymousClass79V(this, 0));
    }

    public final void setContactPhotos(C27201Vd r2) {
        C18070vi.A0d(r2, 0);
        this.A06 = r2;
    }

    public final void setMeManager(AnonymousClass11S r2) {
        C18070vi.A0d(r2, 0);
        this.A04 = r2;
    }

    public final void setPathDrawableHelper(AnonymousClass1VU r2) {
        C18070vi.A0d(r2, 0);
        this.A08 = r2;
    }

    public final void setSystemFeatures(AnonymousClass1DC r2) {
        C18070vi.A0d(r2, 0);
        this.A0C = r2;
    }

    public final void setSystemServicesLazy(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A0E = r2;
    }

    public void setUICallback(AnonymousClass861 r2) {
        C18070vi.A0d(r2, 0);
        this.A09 = r2;
    }

    public void setUICallbacks(AnonymousClass862 r2) {
        C18070vi.A0d(r2, 0);
        this.A0B = r2;
    }

    public final void setWhatsAppLocaleLazy(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A0F = r2;
    }

    private final void A01() {
        WaImageView profileAvatarImageView = this.A0I.getProfileAvatarImageView();
        AnonymousClass1VU pathDrawableHelper = getPathDrawableHelper();
        profileAvatarImageView.setImageDrawable(AnonymousClass1VU.A00(AnonymousClass3Ma.A06(this), getResources(), new AnonymousClass7BU(1), pathDrawableHelper.A00, 2131231047));
        AnonymousClass11S meManager = getMeManager();
        meManager.A0I();
        AnonymousClass1E8 r1 = meManager.A0D;
        if (r1 != null) {
            this.A0H.A0C(profileAvatarImageView, r1, true);
        }
    }

    /* access modifiers changed from: private */
    public final int getPreviewSegmentsCount() {
        VoiceVisualizer voiceVisualizer = this.A07;
        if (voiceVisualizer != null) {
            return (int) Math.floor((double) (C108945cZ.A03(voiceVisualizer) / voiceVisualizer.A0B));
        }
        C18070vi.A11("previewVoiceVisualizer");
        throw null;
    }

    public void A07() {
        if (!this.A0J) {
            this.A0J = true;
            AnonymousClass10E A0O = AnonymousClass3MW.A0O(generatedComponent());
            this.A06 = AnonymousClass3MZ.A0i(A0O);
            this.A04 = AnonymousClass10E.A17(A0O);
            this.A08 = (AnonymousClass1VU) A0O.A7y.get();
            this.A0C = AnonymousClass3MZ.A13(A0O);
            this.A0E = C000200d.A00(A0O.AAp);
            this.A0F = C000200d.A00(A0O.ABz);
        }
    }

    public void Bc1() {
        this.A00.setVisibility(8);
        Animation animation = this.A02;
        if (animation != null) {
            animation.cancel();
        }
        this.A02 = null;
        C29071bZ r3 = new C29071bZ(3);
        r3.A0C(200);
        r3.A01 = 0;
        r3.A0D(new DecelerateInterpolator());
        C29191bl.A02(this, r3);
        this.A03.setVisibility(4);
        this.A0A.setVisibility(4);
        this.A01.setVisibility(0);
        this.A05.setVisibility(0);
        VoiceVisualizer voiceVisualizer = this.A07;
        if (voiceVisualizer == null) {
            C18070vi.A11("previewVoiceVisualizer");
            throw null;
        }
        voiceVisualizer.setVisibility(0);
        this.A0D.setVisibility(0);
        setSeekbarContentDescription(0);
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A0G;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A0G = r0;
        }
        return r0.generatedComponent();
    }

    public final C27201Vd getContactPhotos() {
        C27201Vd r0 = this.A06;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("contactPhotos");
        throw null;
    }

    public final AnonymousClass11S getMeManager() {
        AnonymousClass11S r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("meManager");
        throw null;
    }

    public final AnonymousClass1VU getPathDrawableHelper() {
        AnonymousClass1VU r0 = this.A08;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("pathDrawableHelper");
        throw null;
    }

    public final AnonymousClass1DC getSystemFeatures() {
        AnonymousClass1DC r0 = this.A0C;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("systemFeatures");
        throw null;
    }

    public final AnonymousClass00H getSystemServicesLazy() {
        AnonymousClass00H r0 = this.A0E;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("systemServicesLazy");
        throw null;
    }

    public final AnonymousClass00H getWhatsAppLocaleLazy() {
        AnonymousClass00H r0 = this.A0F;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("whatsAppLocaleLazy");
        throw null;
    }

    public void setSeekbarContentDescription(long j) {
        VoiceNoteSeekBar voiceNoteSeekBar = this.A0D;
        C18000vb r0 = (C18000vb) C18070vi.A0E(getWhatsAppLocaleLazy());
        Context A042 = AnonymousClass3MY.A04(this);
        C18070vi.A0e(voiceNoteSeekBar, 0, r0);
        String A072 = C64052u8.A07(r0, j);
        C18070vi.A0X(A072);
        voiceNoteSeekBar.setContentDescription(C17890vO.A0R(A042, A072, 1, 0, 2131898071));
    }

    /* access modifiers changed from: private */
    public final void setupPreviewProgressIndicatorSizes(boolean z) {
        Resources A0Y = AnonymousClass000.A0Y(this);
        int i = 2131168891;
        if (z) {
            i = 2131168892;
        }
        int dimensionPixelSize = A0Y.getDimensionPixelSize(i);
        Resources A0Y2 = AnonymousClass000.A0Y(this);
        int i2 = 2131168893;
        if (z) {
            i2 = 2131168894;
        }
        int dimensionPixelSize2 = A0Y2.getDimensionPixelSize(i2);
        VoiceVisualizer voiceVisualizer = this.A07;
        if (voiceVisualizer == null) {
            C18070vi.A11("previewVoiceVisualizer");
            throw null;
        }
        voiceVisualizer.setProgressBubbleRadius((float) dimensionPixelSize);
        voiceVisualizer.setProgressBubbleStokeWidth((float) dimensionPixelSize2);
    }

    public void Bc2() {
        getSystemFeatures();
        this.A00.setVisibility(8);
        Animation animation = this.A02;
        if (animation != null) {
            animation.cancel();
        }
        this.A02 = null;
        this.A03.setVisibility(0);
        this.A0A.setVisibility(0);
        VoiceVisualizer voiceVisualizer = this.A07;
        if (voiceVisualizer == null) {
            C18070vi.A11("previewVoiceVisualizer");
            throw null;
        }
        voiceVisualizer.setVisibility(4);
        this.A05.setVisibility(4);
        this.A01.setVisibility(4);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        VoiceVisualizer voiceVisualizer = this.A07;
        if (voiceVisualizer == null) {
            C18070vi.A11("previewVoiceVisualizer");
            throw null;
        }
        ViewTreeObserver viewTreeObserver = voiceVisualizer.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.addOnGlobalLayoutListener(this.A0K);
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A0H.A02();
        AnonymousClass861 r3 = this.A09;
        if (r3 != null) {
            C145827Mt r32 = (C145827Mt) r3;
            C109635dl r0 = r32.A06;
            if (r0 != null) {
                r0.A09.clear();
            }
            C145827Mt.A03(r32, false);
            AnonymousClass6LS r02 = r32.A05;
            if (r02 != null) {
                r02.A00.clear();
            }
            boolean A1G = C108975cc.A1G(r32.A05);
            r32.A05 = null;
            AnonymousClass6LS r03 = r32.A04;
            if (r03 != null) {
                r03.A00.clear();
            }
            AnonymousClass6LS r04 = r32.A04;
            if (r04 != null) {
                r04.A0B(A1G);
            }
            r32.A04 = null;
            C145847Mv r05 = r32.A07;
            if (r05 != null) {
                r05.A00 = null;
            }
            C145827Mt.A02(r32, r32.A09);
            r32.A09 = null;
        }
        AnonymousClass862 r2 = this.A0B;
        if (r2 != null) {
            C145847Mv r22 = (C145847Mv) r2;
            r22.A08.A0D(r22.A09);
            r22.A05.A0D(r22.A0A);
            r22.A04.removeCallbacks(r22.A03);
            C145847Mv.A01(r22);
        }
        VoiceVisualizer voiceVisualizer = this.A07;
        if (voiceVisualizer == null) {
            C18070vi.A11("previewVoiceVisualizer");
            throw null;
        }
        ViewTreeObserver viewTreeObserver = voiceVisualizer.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalLayoutListener(this.A0K);
        }
    }

    public final void setBackgroundTint(int i) {
        AnonymousClass1HF.A0L(ColorStateList.valueOf(i), this);
        this.A0I.setMicrophoneStrokeColor(i);
    }

    public void setRemainingSeconds(int i) {
        String A0D2 = C64052u8.A0D((C18000vb) getWhatsAppLocaleLazy().get(), (String) null, (long) i);
        C18070vi.A0X(A0D2);
        this.A03.setText(A0D2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VoiceRecordingView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        C18070vi.A0d(context, 1);
        A07();
        this.A0K = new AnonymousClass793(this, 26);
        View.inflate(getContext(), 2131627476, this);
        View A062 = AnonymousClass1HF.A06(this, 2131436929);
        C18070vi.A0X(A062);
        this.A0I = (VoiceStatusProfileAvatarView) A062;
        View A063 = AnonymousClass1HF.A06(this, 2131436925);
        C18070vi.A0X(A063);
        this.A01 = A063;
        View A064 = AnonymousClass1HF.A06(this, 2131436931);
        C18070vi.A0X(A064);
        this.A03 = (TextView) A064;
        View A065 = AnonymousClass1HF.A06(this, 2131436926);
        C18070vi.A0X(A065);
        this.A05 = (WaImageButton) A065;
        View A066 = AnonymousClass1HF.A06(this, 2131436924);
        C18070vi.A0X(A066);
        this.A00 = A066;
        View A067 = AnonymousClass1HF.A06(this, 2131436928);
        C18070vi.A0X(A067);
        this.A07 = (VoiceVisualizer) A067;
        View A068 = AnonymousClass1HF.A06(this, 2131436930);
        C18070vi.A0X(A068);
        this.A0A = (VoiceStatusRecordingVisualizer) A068;
        View A069 = AnonymousClass1HF.A06(this, 2131436927);
        C18070vi.A0X(A069);
        VoiceNoteSeekBar voiceNoteSeekBar = (VoiceNoteSeekBar) A069;
        voiceNoteSeekBar.A03 = true;
        voiceNoteSeekBar.setMax(1000);
        this.A0D = voiceNoteSeekBar;
        setBackgroundResource(2131233583);
        int dimensionPixelSize = getResources().getDimensionPixelSize(2131168886);
        setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        this.A0H = getContactPhotos().A06(getContext(), "voice-recording-view");
        A01();
        this.A0A.setListener(new C145837Mu(this));
        this.A05.setOnClickListener(new AnonymousClass78P((Object) this, 49));
        this.A01.setOnClickListener(new AnonymousClass784(this, 0));
        setupPreviewProgressIndicatorSizes(false);
        this.A0D.setOnSeekBarChangeListener(new AnonymousClass79V(this, 0));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VoiceRecordingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C18070vi.A0d(context, 1);
        A07();
        this.A0K = new AnonymousClass793(this, 26);
        View.inflate(getContext(), 2131627476, this);
        View A062 = AnonymousClass1HF.A06(this, 2131436929);
        C18070vi.A0X(A062);
        this.A0I = (VoiceStatusProfileAvatarView) A062;
        View A063 = AnonymousClass1HF.A06(this, 2131436925);
        C18070vi.A0X(A063);
        this.A01 = A063;
        View A064 = AnonymousClass1HF.A06(this, 2131436931);
        C18070vi.A0X(A064);
        this.A03 = (TextView) A064;
        View A065 = AnonymousClass1HF.A06(this, 2131436926);
        C18070vi.A0X(A065);
        this.A05 = (WaImageButton) A065;
        View A066 = AnonymousClass1HF.A06(this, 2131436924);
        C18070vi.A0X(A066);
        this.A00 = A066;
        View A067 = AnonymousClass1HF.A06(this, 2131436928);
        C18070vi.A0X(A067);
        this.A07 = (VoiceVisualizer) A067;
        View A068 = AnonymousClass1HF.A06(this, 2131436930);
        C18070vi.A0X(A068);
        this.A0A = (VoiceStatusRecordingVisualizer) A068;
        View A069 = AnonymousClass1HF.A06(this, 2131436927);
        C18070vi.A0X(A069);
        VoiceNoteSeekBar voiceNoteSeekBar = (VoiceNoteSeekBar) A069;
        voiceNoteSeekBar.A03 = true;
        voiceNoteSeekBar.setMax(1000);
        this.A0D = voiceNoteSeekBar;
        setBackgroundResource(2131233583);
        int dimensionPixelSize = getResources().getDimensionPixelSize(2131168886);
        setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        this.A0H = getContactPhotos().A06(getContext(), "voice-recording-view");
        A01();
        this.A0A.setListener(new C145837Mu(this));
        this.A05.setOnClickListener(new AnonymousClass78P((Object) this, 49));
        this.A01.setOnClickListener(new AnonymousClass784(this, 0));
        setupPreviewProgressIndicatorSizes(false);
        this.A0D.setOnSeekBarChangeListener(new AnonymousClass79V(this, 0));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VoiceRecordingView(Context context) {
        super(context);
        C18070vi.A0d(context, 1);
        A07();
        this.A0K = new AnonymousClass793(this, 26);
        View.inflate(getContext(), 2131627476, this);
        View A062 = AnonymousClass1HF.A06(this, 2131436929);
        C18070vi.A0X(A062);
        this.A0I = (VoiceStatusProfileAvatarView) A062;
        View A063 = AnonymousClass1HF.A06(this, 2131436925);
        C18070vi.A0X(A063);
        this.A01 = A063;
        View A064 = AnonymousClass1HF.A06(this, 2131436931);
        C18070vi.A0X(A064);
        this.A03 = (TextView) A064;
        View A065 = AnonymousClass1HF.A06(this, 2131436926);
        C18070vi.A0X(A065);
        this.A05 = (WaImageButton) A065;
        View A066 = AnonymousClass1HF.A06(this, 2131436924);
        C18070vi.A0X(A066);
        this.A00 = A066;
        View A067 = AnonymousClass1HF.A06(this, 2131436928);
        C18070vi.A0X(A067);
        this.A07 = (VoiceVisualizer) A067;
        View A068 = AnonymousClass1HF.A06(this, 2131436930);
        C18070vi.A0X(A068);
        this.A0A = (VoiceStatusRecordingVisualizer) A068;
        View A069 = AnonymousClass1HF.A06(this, 2131436927);
        C18070vi.A0X(A069);
        VoiceNoteSeekBar voiceNoteSeekBar = (VoiceNoteSeekBar) A069;
        voiceNoteSeekBar.A03 = true;
        voiceNoteSeekBar.setMax(1000);
        this.A0D = voiceNoteSeekBar;
        setBackgroundResource(2131233583);
        int dimensionPixelSize = getResources().getDimensionPixelSize(2131168886);
        setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        this.A0H = getContactPhotos().A06(getContext(), "voice-recording-view");
        A01();
        this.A0A.setListener(new C145837Mu(this));
        this.A05.setOnClickListener(new AnonymousClass78P((Object) this, 49));
        this.A01.setOnClickListener(new AnonymousClass784(this, 0));
        setupPreviewProgressIndicatorSizes(false);
        this.A0D.setOnSeekBarChangeListener(new AnonymousClass79V(this, 0));
    }

    public VoiceRecordingView(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        super(context, attributeSet);
        A07();
    }
}
