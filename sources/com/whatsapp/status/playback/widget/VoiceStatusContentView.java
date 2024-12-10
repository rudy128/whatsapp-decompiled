package com.whatsapp.status.playback.widget;

import X.AnonymousClass000;
import X.AnonymousClass009;
import X.AnonymousClass00H;
import X.AnonymousClass031;
import X.AnonymousClass10E;
import X.AnonymousClass11S;
import X.AnonymousClass1BI;
import X.AnonymousClass1E7;
import X.AnonymousClass1HF;
import X.AnonymousClass1M9;
import X.AnonymousClass1PU;
import X.AnonymousClass1VU;
import X.AnonymousClass1VW;
import X.AnonymousClass1Z2;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3Ma;
import X.AnonymousClass793;
import X.AnonymousClass7BU;
import X.AnonymousClass7E4;
import X.AnonymousClass7MG;
import X.AnonymousClass882;
import X.C000200d;
import X.C108945cZ;
import X.C124106Xb;
import X.C1411074h;
import X.C1597085o;
import X.C1597185p;
import X.C17970vW;
import X.C18000vb;
import X.C18070vi;
import X.C37451pZ;
import X.C42981z3;
import X.C441822l;
import X.C64052u8;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.whatsapp.WaImageView;
import com.whatsapp.conversation.waveforms.VoiceVisualizer;
import com.whatsapp.status.playback.content.BlurFrameLayout;
import java.util.List;

public final class VoiceStatusContentView extends ConstraintLayout implements AnonymousClass009, AnonymousClass882 {
    public ValueAnimator A00;
    public VoiceVisualizer A01;
    public AnonymousClass7E4 A02;
    public C1597085o A03;
    public VoiceStatusProfileAvatarView A04;
    public C1597185p A05;
    public AnonymousClass00H A06;
    public AnonymousClass00H A07;
    public AnonymousClass00H A08;
    public AnonymousClass00H A09;
    public AnonymousClass00H A0A;
    public AnonymousClass00H A0B;
    public AnonymousClass031 A0C;
    public TextView A0D;
    public boolean A0E;
    public final ValueAnimator.AnimatorUpdateListener A0F;
    public final List A0G;
    public final List A0H;
    public final List A0I;
    public final ViewTreeObserver.OnGlobalLayoutListener A0J;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VoiceStatusContentView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C18070vi.A0d(context, 1);
        A07();
        this.A0I = AnonymousClass000.A13();
        this.A0G = AnonymousClass000.A13();
        this.A0H = AnonymousClass000.A13();
        this.A0F = new C1411074h(this, 29);
        this.A0J = new AnonymousClass793(this, 21);
        A01(context);
    }

    public final void setContactAvatarsLazy(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A06 = r2;
    }

    public final void setContactManagerLazy(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A07 = r2;
    }

    public final void setGroupChatUtilsLazy(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A08 = r2;
    }

    public final void setMeManagerLazy(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A09 = r2;
    }

    public final void setPathDrawableHelperLazy(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A0A = r2;
    }

    public void setUiCallback(C1597185p r2) {
        C18070vi.A0d(r2, 0);
        this.A05 = r2;
    }

    public final void setWhatsAppLocaleLazy(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A0B = r2;
    }

    public static final void A02(VoiceStatusContentView voiceStatusContentView) {
        BlurFrameLayout blurFrameLayout;
        C1597085o r0 = voiceStatusContentView.A03;
        if (r0 != null && (blurFrameLayout = ((AnonymousClass7MG) r0).A00.A01) != null) {
            blurFrameLayout.A07 = true;
            blurFrameLayout.invalidate();
        }
    }

    /* access modifiers changed from: private */
    public final int getPreviewWavesSegmentsCount() {
        VoiceVisualizer voiceVisualizer = this.A01;
        if (voiceVisualizer != null) {
            float A032 = C108945cZ.A03(voiceVisualizer);
            VoiceVisualizer voiceVisualizer2 = this.A01;
            if (voiceVisualizer2 != null) {
                return (int) Math.floor((double) (A032 / voiceVisualizer2.A0B));
            }
        }
        C18070vi.A11("voiceVisualizer");
        throw null;
    }

    public void A07() {
        if (!this.A0E) {
            this.A0E = true;
            AnonymousClass10E A0O = AnonymousClass3MW.A0O(generatedComponent());
            this.A06 = C000200d.A00(A0O.A2d);
            this.A07 = C000200d.A00(A0O.A2f);
            this.A08 = C000200d.A00(A0O.A4j);
            this.A09 = C000200d.A00(A0O.A63);
            this.A0A = C000200d.A00(A0O.A7y);
            this.A0B = C000200d.A00(A0O.ABz);
        }
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A0C;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A0C = r0;
        }
        return r0.generatedComponent();
    }

    public final AnonymousClass00H getContactAvatarsLazy() {
        AnonymousClass00H r0 = this.A06;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("contactAvatarsLazy");
        throw null;
    }

    public final AnonymousClass00H getContactManagerLazy() {
        AnonymousClass00H r0 = this.A07;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("contactManagerLazy");
        throw null;
    }

    public final AnonymousClass00H getGroupChatUtilsLazy() {
        AnonymousClass00H r0 = this.A08;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("groupChatUtilsLazy");
        throw null;
    }

    public final AnonymousClass00H getMeManagerLazy() {
        AnonymousClass00H r0 = this.A09;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("meManagerLazy");
        throw null;
    }

    public final AnonymousClass00H getPathDrawableHelperLazy() {
        AnonymousClass00H r0 = this.A0A;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("pathDrawableHelperLazy");
        throw null;
    }

    public final AnonymousClass00H getWhatsAppLocaleLazy() {
        AnonymousClass00H r0 = this.A0B;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("whatsAppLocaleLazy");
        throw null;
    }

    public void setVoiceVisualizerSegments(List list) {
        Boolean bool = C17970vW.A03;
        ValueAnimator valueAnimator = this.A00;
        if (valueAnimator != null) {
            valueAnimator.end();
            valueAnimator.removeUpdateListener(this.A0F);
        }
        this.A00 = null;
        List list2 = this.A0I;
        list2.clear();
        List list3 = this.A0G;
        list2.addAll(list3);
        if (list != null) {
            list3.clear();
            for (Object A042 : list) {
                list3.add(Float.valueOf(AnonymousClass000.A04(A042) * ((float) (0.800000011920929d + (Math.random() * 0.19999998807907104d)))));
            }
        }
        float[] A1V = C108945cZ.A1V();
        // fill-array-data instruction
        A1V[0] = 0;
        A1V[1] = 1065353216;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(A1V);
        ofFloat.setStartDelay(0);
        ofFloat.setDuration(150);
        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        ofFloat.addUpdateListener(this.A0F);
        ofFloat.start();
        this.A00 = ofFloat;
        A02(this);
    }

    private final void A01(Context context) {
        View.inflate(context, 2131627474, this);
        this.A04 = (VoiceStatusProfileAvatarView) C18070vi.A05(this, 2131436929);
        this.A0D = AnonymousClass3Ma.A0E(this, 2131436873);
        this.A01 = (VoiceVisualizer) C18070vi.A05(this, 2131436934);
        setBackgroundResource(2131233583);
        AnonymousClass3MY.A14(getResources(), this, 2131168886);
    }

    private final void setBackgroundColorFromMessage(C441822l r4) {
        int A032 = AnonymousClass1Z2.A03(0.2f, C124106Xb.A00(AnonymousClass3MY.A04(this), r4), -16777216);
        AnonymousClass1HF.A0L(ColorStateList.valueOf(A032), this);
        VoiceStatusProfileAvatarView voiceStatusProfileAvatarView = this.A04;
        if (voiceStatusProfileAvatarView == null) {
            C18070vi.A11("profileAvatarView");
            throw null;
        } else {
            voiceStatusProfileAvatarView.setMicrophoneStrokeColor(A032);
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        VoiceVisualizer voiceVisualizer = this.A01;
        if (voiceVisualizer == null) {
            C18070vi.A11("voiceVisualizer");
            throw null;
        }
        ViewTreeObserver viewTreeObserver = voiceVisualizer.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.addOnGlobalLayoutListener(this.A0J);
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnonymousClass7E4 r0 = this.A02;
        if (r0 != null) {
            r0.A00.clear();
        }
        VoiceVisualizer voiceVisualizer = this.A01;
        if (voiceVisualizer == null) {
            C18070vi.A11("voiceVisualizer");
            throw null;
        }
        ViewTreeObserver viewTreeObserver = voiceVisualizer.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalLayoutListener(this.A0J);
        }
        ValueAnimator valueAnimator = this.A00;
        if (valueAnimator != null) {
            valueAnimator.end();
            valueAnimator.removeUpdateListener(this.A0F);
        }
        this.A00 = null;
    }

    public final void setDuration(int i) {
        String A0D2 = C64052u8.A0D((C18000vb) getWhatsAppLocaleLazy().get(), (String) null, (long) i);
        C18070vi.A0X(A0D2);
        TextView textView = this.A0D;
        if (textView == null) {
            C18070vi.A11("durationView");
            throw null;
        } else {
            textView.setText(A0D2);
        }
    }

    public final void setVoiceMessage(C441822l r9, C37451pZ r10) {
        AnonymousClass1E7 A0H2;
        boolean A16 = C18070vi.A16(r9, r10);
        setBackgroundColorFromMessage(r9);
        VoiceStatusProfileAvatarView voiceStatusProfileAvatarView = this.A04;
        if (voiceStatusProfileAvatarView == null) {
            C18070vi.A11("profileAvatarView");
            throw null;
        }
        WaImageView profileAvatarImageView = voiceStatusProfileAvatarView.getProfileAvatarImageView();
        AnonymousClass1VU r5 = (AnonymousClass1VU) getPathDrawableHelperLazy().get();
        profileAvatarImageView.setImageDrawable(AnonymousClass1VU.A00(AnonymousClass3Ma.A06(this), getResources(), new AnonymousClass7BU(0), r5.A00, 2131231047));
        C42981z3 r2 = new C42981z3((AnonymousClass1VW) getContactAvatarsLazy().get(), r5, (AnonymousClass1PU) getGroupChatUtilsLazy().get());
        this.A02 = new AnonymousClass7E4(r2, this);
        if (r9.A0v.A02) {
            AnonymousClass11S r0 = (AnonymousClass11S) getMeManagerLazy().get();
            r0.A0I();
            A0H2 = r0.A0D;
            if (A0H2 != null) {
                AnonymousClass7E4 r02 = this.A02;
                if (r02 != null) {
                    r02.A00.clear();
                }
            }
            setDuration(r9.A0D);
            A02(this);
        }
        AnonymousClass1BI A0H3 = r9.A0H();
        if (A0H3 != null) {
            A0H2 = ((AnonymousClass1M9) getContactManagerLazy().get()).A0H(A0H3);
        }
        setDuration(r9.A0D);
        A02(this);
        r10.A05(profileAvatarImageView, r2, A0H2, A16);
        setDuration(r9.A0D);
        A02(this);
    }

    public final void setContentUpdatedListener(C1597085o r1) {
        this.A03 = r1;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VoiceStatusContentView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        C18070vi.A0d(context, 1);
        A07();
        this.A0I = AnonymousClass000.A13();
        this.A0G = AnonymousClass000.A13();
        this.A0H = AnonymousClass000.A13();
        this.A0F = new C1411074h(this, 29);
        this.A0J = new AnonymousClass793(this, 21);
        A01(context);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VoiceStatusContentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C18070vi.A0d(context, 1);
        A07();
        this.A0I = AnonymousClass000.A13();
        this.A0G = AnonymousClass000.A13();
        this.A0H = AnonymousClass000.A13();
        this.A0F = new C1411074h(this, 29);
        this.A0J = new AnonymousClass793(this, 21);
        A01(context);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VoiceStatusContentView(Context context) {
        super(context);
        C18070vi.A0d(context, 1);
        A07();
        this.A0I = AnonymousClass000.A13();
        this.A0G = AnonymousClass000.A13();
        this.A0H = AnonymousClass000.A13();
        this.A0F = new C1411074h(this, 29);
        this.A0J = new AnonymousClass793(this, 21);
        A01(context);
    }

    public VoiceStatusContentView(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        super(context, attributeSet);
        A07();
    }
}
