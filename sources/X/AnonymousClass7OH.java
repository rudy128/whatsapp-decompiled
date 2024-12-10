package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.conversation.waveforms.VoiceVisualizer;
import com.whatsapp.voicerecorder.VoiceNoteSeekBar;
import java.io.File;
import java.util.List;

/* renamed from: X.7OH  reason: invalid class name */
public class AnonymousClass7OH implements AnonymousClass89T {
    public View A00;
    public View A01;
    public Animation A02;
    public VoiceVisualizer A03;
    public C130456jS A04;
    public VoiceNoteSeekBar A05;
    public final Context A06;
    public final View A07;
    public final View A08;
    public final View A09;
    public final View A0A;
    public final View A0B;
    public final ViewGroup A0C;
    public final ViewGroup A0D;
    public final ViewGroup A0E;
    public final ViewGroup A0F;
    public final AnonymousClass1KB A0G;
    public final VoiceVisualizer A0H;
    public final C18000vb A0I;
    public final AnonymousClass1DC A0J;
    public final C28931bI A0K;
    public final AnonymousClass10I A0L;
    public final List A0M = AnonymousClass000.A13();
    public final boolean A0N;

    public AnonymousClass7OH(Context context, View view, AnonymousClass1KB r18, C18000vb r19, C18030ve r20, AnonymousClass1DC r21, AnonymousClass10I r22, C143857Fb r23) {
        View view2 = view;
        C18070vi.A0d(view2, 0);
        C143857Fb r0 = r23;
        C130456jS r12 = new C130456jS(view2, r0.A00, r0.A01);
        boolean A052 = C18020vd.A05(C18040vf.A02, r20, 1139);
        View A062 = AnonymousClass1HF.A06(view2, 2131436892);
        View A063 = AnonymousClass1HF.A06(view2, 2131436882);
        ViewGroup A0C2 = AnonymousClass3MW.A0C(view2, 2131436886);
        ViewGroup A0C3 = AnonymousClass3MW.A0C(view2, 2131436894);
        C28931bI A002 = C28931bI.A00(view2, 2131436890);
        ViewGroup A0C4 = AnonymousClass3MW.A0C(view2, 2131434298);
        ViewGroup A0C5 = AnonymousClass3MW.A0C(view2, 2131430162);
        View A064 = AnonymousClass1HF.A06(view2, 2131430163);
        View A065 = AnonymousClass1HF.A06(view2, 2131436895);
        View A066 = AnonymousClass1HF.A06(view2, 2131436907);
        this.A06 = context;
        this.A0G = r18;
        this.A0L = r22;
        AnonymousClass1DC r14 = r21;
        this.A0J = r14;
        this.A0I = r19;
        this.A04 = r12;
        this.A0N = A052;
        this.A0B = A062;
        this.A09 = A063;
        this.A0F = A0C2;
        this.A0E = A0C3;
        this.A0K = A002;
        A002.A07(new C145897Na(r14, this, r12));
        this.A0D = A0C4;
        this.A0C = A0C5;
        this.A08 = A064;
        this.A0H = (VoiceVisualizer) AnonymousClass1HF.A06(view2, 2131436884);
        this.A07 = A065;
        this.A01 = A066;
        this.A0A = A066;
    }

    public void A02() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(250);
        C114545r0.A00(alphaAnimation, this, 15);
        this.A0B.startAnimation(alphaAnimation);
        AlphaAnimation alphaAnimation3 = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation3.setDuration(250);
        C114545r0.A00(alphaAnimation3, this, 14);
        this.A09.startAnimation(alphaAnimation3);
        alphaAnimation2.setDuration(250);
        C114545r0.A00(alphaAnimation2, this, 16);
        this.A0C.startAnimation(alphaAnimation2);
    }

    private void A01(boolean z, boolean z2) {
        if (!z) {
            this.A0E.setVisibility(4);
            if (!z2) {
                this.A0B.setVisibility(8);
            }
            this.A0K.A04(0);
            return;
        }
        AnimationSet A002 = AnonymousClass6Y2.A00(false);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(150);
        C114545r0.A00(alphaAnimation, this, 18);
        this.A0E.startAnimation(alphaAnimation);
        AnimationSet A003 = AnonymousClass6Y2.A00(true);
        A002.setAnimationListener(new C114535qz(A003, this, true));
        C114545r0.A00(A003, this, 17);
        this.A0B.startAnimation(A002);
        alphaAnimation2.setDuration(250);
        C114545r0.A00(alphaAnimation2, this, 19);
        this.A0K.A02().startAnimation(alphaAnimation2);
    }

    public void A03(int i) {
        View view = this.A0B;
        C18000vb r0 = this.A0I;
        Context context = this.A06;
        ((ImageView) view).setImageDrawable(AnonymousClass3NL.A00(context, r0, i));
        int i2 = 2131898082;
        if (2131232100 == i) {
            i2 = 2131898084;
        }
        AnonymousClass3MY.A0w(context, view, i2);
    }

    public void A04(long j) {
        C130456jS r4 = this.A04;
        String A0D2 = C64052u8.A0D(r4.A06, (String) null, C17880vN.A04(j));
        C18070vi.A0X(A0D2);
        TextView textView = r4.A01;
        if (textView != null) {
            textView.setText(A0D2);
        }
    }

    public void A05(AnonymousClass70T r3, File file, boolean z, boolean z2) {
        List list = this.A0M;
        if (!list.isEmpty()) {
            A00(r3, this, list);
            A01(z, z2);
            return;
        }
        A01(z, z2);
        this.A0K.A02().getViewTreeObserver().addOnGlobalLayoutListener(new AnonymousClass791(r3, this, file));
    }

    public void BIs() {
        this.A0K.A02();
        VoiceVisualizer voiceVisualizer = this.A03;
        C17960vV.A05(voiceVisualizer);
        voiceVisualizer.setVisibility(0);
        this.A0H.setVisibility(0);
        this.A07.setVisibility(8);
        Animation animation = this.A02;
        if (animation != null) {
            animation.cancel();
            this.A02 = null;
        }
    }

    public void CMs() {
        if (this.A02 == null) {
            AlphaAnimation A0Q = C72463Mc.A0Q();
            this.A02 = A0Q;
            A0Q.setDuration(1000);
            this.A02.setRepeatMode(2);
            this.A02.setRepeatCount(-1);
        }
        VoiceVisualizer voiceVisualizer = this.A03;
        if (voiceVisualizer != null) {
            voiceVisualizer.setVisibility(8);
        }
        this.A0H.setVisibility(8);
        View view = this.A07;
        view.setVisibility(0);
        view.startAnimation(this.A02);
    }

    public static void A00(AnonymousClass70T r1, AnonymousClass7OH r2, List list) {
        int i;
        View view;
        int i2;
        if (list.isEmpty()) {
            if (r1 != null) {
                i2 = r1.A03();
            } else {
                i2 = 0;
            }
            r2.A05.setMax(i2);
            r2.A05.setProgress(0);
            if (r2.A0N) {
                r2.A05.setVisibility(0);
            }
            i = 8;
            view = r2.A03;
        } else {
            r2.A03.setPlaybackPercentage(0.0f);
            r2.A03.A03(list, 0.0f);
            r2.A03.setVisibility(0);
            i = 8;
            view = r2.A05;
        }
        view.setVisibility(i);
    }
}
