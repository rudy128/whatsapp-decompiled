package com.whatsapp.search.views.itemviews;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass009;
import X.AnonymousClass031;
import X.AnonymousClass10E;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass4IZ;
import X.AnonymousClass79X;
import X.C108975cc;
import X.C145907Nb;
import X.C17890vO;
import X.C18000vb;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C24261Jm;
import X.C27641Ww;
import X.C28931bI;
import X.C64052u8;
import X.C72463Mc;
import X.C74743cP;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import com.whatsapp.conversation.waveforms.VoiceVisualizer;
import com.whatsapp.voicerecorder.VoiceNoteSeekBar;
import java.util.List;

public final class AudioPlayerView extends LinearLayout implements AnonymousClass009 {
    public int A00;
    public C18000vb A01;
    public C18030ve A02;
    public C28931bI A03;
    public C28931bI A04;
    public AnonymousClass031 A05;
    public int A06;
    public ImageButton A07;
    public VoiceNoteSeekBar A08;
    public boolean A09;

    public final void setAbProps(C18030ve r2) {
        C18070vi.A0d(r2, 0);
        this.A02 = r2;
    }

    public final void setWhatsAppLocale(C18000vb r2) {
        C18070vi.A0d(r2, 0);
        this.A01 = r2;
    }

    public void A01() {
        if (!this.A09) {
            this.A09 = true;
            AnonymousClass10E A0O = AnonymousClass3MW.A0O(generatedComponent());
            this.A02 = AnonymousClass10E.A8r(A0O);
            this.A01 = AnonymousClass10E.A6Q(A0O);
        }
    }

    public final void A02() {
        View A022;
        C28931bI r1 = this.A04;
        if (r1 == null) {
            C18070vi.A11("voiceVisualizerViewStubHolder");
            throw null;
        }
        if (r1.A00 == null) {
            r1 = null;
        }
        if (!(r1 == null || (A022 = r1.A02()) == null)) {
            A022.setVisibility(8);
            A022.setEnabled(false);
        }
        VoiceNoteSeekBar voiceNoteSeekBar = this.A08;
        if (voiceNoteSeekBar == null) {
            C18070vi.A11("seekBar");
            throw null;
        }
        voiceNoteSeekBar.setVisibility(0);
        voiceNoteSeekBar.setProgress(voiceNoteSeekBar.getProgress());
        voiceNoteSeekBar.A03 = false;
        voiceNoteSeekBar.invalidate();
    }

    public final void A03(List list) {
        String str;
        C28931bI r0 = this.A04;
        if (r0 == null) {
            str = "voiceVisualizerViewStubHolder";
        } else {
            VoiceVisualizer voiceVisualizer = (VoiceVisualizer) r0.A02();
            voiceVisualizer.setEnabled(true);
            voiceVisualizer.setVisibility(0);
            voiceVisualizer.A03(list, (((float) this.A06) * 1.0f) / ((float) this.A00));
            VoiceNoteSeekBar voiceNoteSeekBar = this.A08;
            if (voiceNoteSeekBar == null) {
                str = "seekBar";
            } else {
                voiceNoteSeekBar.A03 = true;
                voiceNoteSeekBar.invalidate();
                return;
            }
        }
        C18070vi.A11(str);
        throw null;
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A05;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A05 = r0;
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

    public final C28931bI getProgressBar() {
        C28931bI r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("progressBarViewStubHolder");
        throw null;
    }

    public final int getSeekbarProgress() {
        VoiceNoteSeekBar voiceNoteSeekBar = this.A08;
        if (voiceNoteSeekBar != null) {
            return voiceNoteSeekBar.getProgress();
        }
        C18070vi.A11("seekBar");
        throw null;
    }

    public final C18000vb getWhatsAppLocale() {
        C18000vb r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1M();
        throw null;
    }

    public final void setOnControlButtonClickListener(View.OnClickListener onClickListener) {
        ImageButton imageButton = this.A07;
        if (imageButton == null) {
            C18070vi.A11("audioPlayerControlButton");
            throw null;
        } else {
            imageButton.setOnClickListener(onClickListener);
        }
    }

    public final void setOnControlButtonLongClickListener(View.OnLongClickListener onLongClickListener) {
        ImageButton imageButton = this.A07;
        if (imageButton == null) {
            C18070vi.A11("audioPlayerControlButton");
            throw null;
        } else {
            imageButton.setOnLongClickListener(onLongClickListener);
        }
    }

    public final void setPlayButtonState(int i) {
        ImageButton imageButton;
        Context context;
        int i2;
        if (i == 0) {
            Drawable A002 = C24261Jm.A00(getContext(), 2131232494);
            if (!C18020vd.A05(C18040vf.A02, getAbProps(), 1117)) {
                A002 = new C74743cP(A002, getWhatsAppLocale());
            }
            imageButton = this.A07;
            if (imageButton != null) {
                imageButton.setImageDrawable(A002);
                context = imageButton.getContext();
                i2 = 2131899314;
            }
            C18070vi.A11("audioPlayerControlButton");
            throw null;
        } else if (i == 1) {
            imageButton = this.A07;
            if (imageButton != null) {
                imageButton.setImageResource(2131232493);
                context = imageButton.getContext();
                i2 = 2131893587;
            }
            C18070vi.A11("audioPlayerControlButton");
            throw null;
        } else if (i == 2) {
            imageButton = this.A07;
            if (imageButton != null) {
                imageButton.setImageResource(2131232380);
                context = imageButton.getContext();
                i2 = 2131887596;
            }
            C18070vi.A11("audioPlayerControlButton");
            throw null;
        } else if (i == 3) {
            imageButton = this.A07;
            if (imageButton != null) {
                imageButton.setImageResource(2131231866);
                context = imageButton.getContext();
                i2 = 2131887592;
            }
            C18070vi.A11("audioPlayerControlButton");
            throw null;
        } else if (i == 4) {
            imageButton = this.A07;
            if (imageButton != null) {
                imageButton.setImageResource(2131232492);
                context = imageButton.getContext();
                i2 = 2131898766;
            }
            C18070vi.A11("audioPlayerControlButton");
            throw null;
        } else {
            throw AnonymousClass000.A0n(AnonymousClass001.A1I("setPlayButtonState: Did not handle playstate: ", AnonymousClass000.A10(), i));
        }
        AnonymousClass3MY.A0w(context, imageButton, i2);
    }

    public final void setPlaybackListener(AnonymousClass79X r2) {
        VoiceNoteSeekBar voiceNoteSeekBar = this.A08;
        if (voiceNoteSeekBar == null) {
            C18070vi.A11("seekBar");
            throw null;
        } else {
            voiceNoteSeekBar.setOnSeekBarChangeListener(r2);
        }
    }

    public final void setSeekbarColor(int i) {
        VoiceNoteSeekBar voiceNoteSeekBar = this.A08;
        if (voiceNoteSeekBar == null) {
            C18070vi.A11("seekBar");
            throw null;
        } else {
            voiceNoteSeekBar.setProgressColor(i);
        }
    }

    public final void setSeekbarContentDescription(long j) {
        VoiceNoteSeekBar voiceNoteSeekBar = this.A08;
        if (voiceNoteSeekBar == null) {
            C18070vi.A11("seekBar");
            throw null;
        }
        C18000vb whatsAppLocale = getWhatsAppLocale();
        Context A042 = AnonymousClass3MY.A04(this);
        boolean A1J = C108975cc.A1J(whatsAppLocale);
        String A072 = C64052u8.A07(whatsAppLocale, j);
        C18070vi.A0X(A072);
        voiceNoteSeekBar.setContentDescription(C17890vO.A0R(A042, A072, 1, A1J ? 1 : 0, 2131898071));
    }

    public final void setSeekbarLongClickListener(View.OnLongClickListener onLongClickListener) {
        VoiceNoteSeekBar voiceNoteSeekBar = this.A08;
        if (voiceNoteSeekBar == null) {
            C18070vi.A11("seekBar");
            throw null;
        } else {
            voiceNoteSeekBar.setOnLongClickListener(onLongClickListener);
        }
    }

    public final void setSeekbarMax(int i) {
        VoiceNoteSeekBar voiceNoteSeekBar = this.A08;
        if (voiceNoteSeekBar == null) {
            C18070vi.A11("seekBar");
            throw null;
        }
        voiceNoteSeekBar.setMax(i);
        this.A00 = i;
    }

    public final void setSeekbarProgress(int i) {
        this.A06 = i;
        VoiceNoteSeekBar voiceNoteSeekBar = this.A08;
        if (voiceNoteSeekBar == null) {
            C18070vi.A11("seekBar");
            throw null;
        } else {
            voiceNoteSeekBar.setProgress(i);
        }
    }

    public AudioPlayerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        A01();
    }

    private final void A00(Context context, AttributeSet attributeSet) {
        String str;
        Context context2 = context;
        View.inflate(context2, 2131626024, this);
        setOrientation(0);
        setGravity(17);
        setClipChildren(false);
        setClipToPadding(false);
        this.A07 = (ImageButton) C18070vi.A05(this, 2131429541);
        this.A08 = (VoiceNoteSeekBar) C18070vi.A05(this, 2131427903);
        this.A04 = C28931bI.A00(this, 2131427909);
        if (!C18020vd.A05(C18040vf.A02, getAbProps(), 12499)) {
            C28931bI r0 = this.A04;
            if (r0 == null) {
                str = "voiceVisualizerViewStubHolder";
                C18070vi.A11(str);
                throw null;
            }
            C72463Mc.A1G(r0);
        }
        C28931bI A002 = C28931bI.A00(this, 2131434181);
        this.A03 = A002;
        C145907Nb.A00(A002, context2, 4);
        AttributeSet attributeSet2 = attributeSet;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet2, AnonymousClass4IZ.A00);
            C18070vi.A0X(obtainStyledAttributes);
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(5, 0);
            int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(6, 0);
            int dimensionPixelSize3 = obtainStyledAttributes.getDimensionPixelSize(3, 0);
            int dimensionPixelSize4 = obtainStyledAttributes.getDimensionPixelSize(4, 0);
            int dimensionPixelSize5 = obtainStyledAttributes.getDimensionPixelSize(1, 0);
            int dimensionPixelSize6 = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            int dimensionPixelSize7 = obtainStyledAttributes.getDimensionPixelSize(2, 0);
            View A052 = C18070vi.A05(this, 2131429546);
            C27641Ww.A07(A052, getWhatsAppLocale(), A052.getPaddingLeft(), A052.getPaddingTop(), dimensionPixelSize3, A052.getPaddingBottom());
            View A053 = C18070vi.A05(this, 2131427903);
            A053.setPadding(A053.getPaddingLeft(), dimensionPixelSize2, A053.getPaddingRight(), dimensionPixelSize);
            if (dimensionPixelSize4 > 0) {
                ViewGroup.LayoutParams layoutParams = A053.getLayoutParams();
                C18070vi.A0z(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                getWhatsAppLocale();
                C27641Ww.A03(A053, dimensionPixelSize4, ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin);
            }
            View A054 = C18070vi.A05(this, 2131429543);
            if (dimensionPixelSize5 > 0) {
                ViewGroup.LayoutParams layoutParams2 = A054.getLayoutParams();
                layoutParams2.height = dimensionPixelSize5;
                layoutParams2.width = dimensionPixelSize5;
                A054.setLayoutParams(layoutParams2);
            }
            if (dimensionPixelSize6 > 0) {
                ViewGroup.LayoutParams layoutParams3 = A054.getLayoutParams();
                C18070vi.A0z(layoutParams3, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams3;
                getWhatsAppLocale();
                C27641Ww.A03(A054, dimensionPixelSize6, marginLayoutParams.rightMargin);
                A054.setLayoutParams(marginLayoutParams);
            }
            if (dimensionPixelSize7 > 0) {
                C28931bI r1 = this.A03;
                str = "progressBarViewStubHolder";
                if (r1 != null) {
                    ViewGroup.LayoutParams A032 = r1.A03();
                    A032.height = dimensionPixelSize7;
                    A032.width = dimensionPixelSize7;
                    r1.A06(A032);
                }
                C18070vi.A11(str);
                throw null;
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AudioPlayerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C18070vi.A0d(context, 1);
        A01();
        A00(context, attributeSet);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AudioPlayerView(Context context) {
        super(context);
        C18070vi.A0d(context, 1);
        A01();
        A00(context, (AttributeSet) null);
    }
}
