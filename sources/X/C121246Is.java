package X;

import android.os.PowerManager;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageButton;
import android.widget.TextView;
import com.whatsapp.WaTextView;
import com.whatsapp.status.widget.StatusEditText;
import com.whatsapp.statuscomposer.ConsolidatedStatusComposerActivity;
import com.whatsapp.statuscomposer.composer.TextStatusComposerFragment;
import com.whatsapp.textstatuscomposer.bottombar.CreationModeBottomBar;
import com.whatsapp.textstatuscomposer.voice.VoiceRecordingView;
import com.whatsapp.textstatuscomposer.voice.VoiceStatusRecordingVisualizer;

/* renamed from: X.6Is  reason: invalid class name and case insensitive filesystem */
public final class C121246Is extends C114105qA {
    public boolean A00;
    public final /* synthetic */ AnonymousClass7J1 A01;

    public void C65(C43191zP r15) {
        C18070vi.A0d(r15, 0);
        super.C65(r15);
        if (r15.A07.A00 >= ((double) this.A00) && !this.A00) {
            AnonymousClass7J1 r4 = this.A01;
            AnonymousClass72I r5 = r4.A08;
            C29071bZ r3 = new C29071bZ(3);
            r3.A0C(300);
            View view = r5.A07;
            r3.A0E(view);
            WaTextView waTextView = r5.A03;
            r3.A0E(waTextView);
            r3.A0D(new DecelerateInterpolator());
            r3.A0N(new C113745nf(r4, 1));
            C29191bl.A02((ViewGroup) r4.A0J, r3);
            view.setVisibility(8);
            waTextView.setVisibility(0);
            r4.A00 = 0.0f;
            r4.A0C = false;
            r4.A0D = false;
            AnonymousClass6In r0 = new AnonymousClass6In(r4);
            r4.A07 = r0;
            r0.A00();
            TextStatusComposerFragment textStatusComposerFragment = r4.A06;
            if (textStatusComposerFragment != null) {
                r4.A04 = SystemClock.elapsedRealtime();
                if (!(textStatusComposerFragment.A0p == null || textStatusComposerFragment.A0q == null)) {
                    C29191bl.A01((ViewGroup) textStatusComposerFragment.A0B);
                    C29191bl.A01(textStatusComposerFragment.A04);
                    VoiceRecordingView voiceRecordingView = textStatusComposerFragment.A0p;
                    if (voiceRecordingView != null) {
                        voiceRecordingView.setScaleX(1.0f);
                    }
                    VoiceRecordingView voiceRecordingView2 = textStatusComposerFragment.A0p;
                    if (voiceRecordingView2 != null) {
                        voiceRecordingView2.setScaleY(1.0f);
                    }
                    ViewGroup A0H = C108955ca.A0H(textStatusComposerFragment.A17());
                    VoiceRecordingView voiceRecordingView3 = textStatusComposerFragment.A0p;
                    if (voiceRecordingView3 != null) {
                        StatusEditText statusEditText = textStatusComposerFragment.A0l;
                        if (statusEditText != null) {
                            C29071bZ r02 = new C29071bZ(3);
                            r02.A0E(statusEditText);
                            r02.A0E(voiceRecordingView3);
                            r02.A01 = 0;
                            C29051bX r6 = new C29051bX();
                            r6.A01 = 200;
                            r6.A03 = true;
                            r6.A0a(r02);
                            r6.A0X(new DecelerateInterpolator());
                            r6.A0W(300);
                            C29191bl.A02(A0H, r6);
                            ViewGroup viewGroup = textStatusComposerFragment.A04;
                            if (viewGroup != null) {
                                ImageButton imageButton = textStatusComposerFragment.A06;
                                if (imageButton != null) {
                                    TextView textView = textStatusComposerFragment.A08;
                                    if (textView != null) {
                                        AnonymousClass1LI r9 = new AnonymousClass1LI();
                                        r9.A0X(5);
                                        r9.A0E(imageButton);
                                        r9.A0E(textView);
                                        r9.A01 = 0;
                                        AnonymousClass1LP r32 = new AnonymousClass1LP();
                                        r32.A00 = Float.POSITIVE_INFINITY;
                                        r9.A0P(r32);
                                        r9.A0C(1500);
                                        C29071bZ r03 = new C29071bZ(2);
                                        r03.A0E(imageButton);
                                        r03.A0E(textView);
                                        r03.A01 = 0;
                                        r03.A0C(300);
                                        C29051bX r62 = new C29051bX();
                                        r62.A03 = true;
                                        r62.A01 = 200;
                                        r62.A0a(r9);
                                        r62.A0a(r03);
                                        r62.A0X(new DecelerateInterpolator());
                                        C29191bl.A02(viewGroup, r62);
                                    }
                                    C18070vi.A11("fontButton");
                                    throw null;
                                }
                                C18070vi.A11("emojiButton");
                                throw null;
                            }
                            StatusEditText statusEditText2 = textStatusComposerFragment.A0l;
                            if (statusEditText2 != null) {
                                statusEditText2.setVisibility(8);
                                C72453Mb.A1C(textStatusComposerFragment.A0p);
                                ImageButton imageButton2 = textStatusComposerFragment.A06;
                                if (imageButton2 != null) {
                                    imageButton2.setVisibility(8);
                                    TextView textView2 = textStatusComposerFragment.A08;
                                    if (textView2 != null) {
                                        textView2.setVisibility(8);
                                        C145827Mt r7 = textStatusComposerFragment.A0q;
                                        if (r7 != null) {
                                            r7.A0J.A02();
                                            PowerManager.WakeLock wakeLock = r7.A02;
                                            if (wakeLock != null) {
                                                wakeLock.acquire(C145827Mt.A00(r7) + C145827Mt.A0N);
                                            }
                                            C1608089z r92 = r7.A0H;
                                            r92.Bc2();
                                            VoiceRecordingView voiceRecordingView4 = (VoiceRecordingView) r92;
                                            VoiceStatusRecordingVisualizer voiceStatusRecordingVisualizer = voiceRecordingView4.A0A;
                                            voiceStatusRecordingVisualizer.A0B.clear();
                                            voiceStatusRecordingVisualizer.A00 = 0;
                                            voiceStatusRecordingVisualizer.A01 = 750;
                                            voiceStatusRecordingVisualizer.A05 = false;
                                            voiceStatusRecordingVisualizer.invalidate();
                                            long j = r7.A01;
                                            if (j != -1) {
                                                C109635dl A002 = r7.A0D.A00(r7, j);
                                                r7.A06 = A002;
                                                A002.A01();
                                                AnonymousClass6Y1.A00(AnonymousClass3Ma.A05(voiceRecordingView4));
                                            }
                                            r7.A05(0);
                                            r7.A0A = true;
                                        }
                                        AnonymousClass886 A003 = TextStatusComposerFragment.A00(textStatusComposerFragment);
                                        if (A003 != null) {
                                            ConsolidatedStatusComposerActivity consolidatedStatusComposerActivity = (ConsolidatedStatusComposerActivity) A003;
                                            AnonymousClass7DZ r04 = consolidatedStatusComposerActivity.A04;
                                            if (r04 != null) {
                                                r04.setVisibility(8);
                                            }
                                            CreationModeBottomBar creationModeBottomBar = consolidatedStatusComposerActivity.A06;
                                            if (creationModeBottomBar != null) {
                                                AnonymousClass3MX.A1A(consolidatedStatusComposerActivity, creationModeBottomBar, 2131103059);
                                            }
                                        }
                                    }
                                    C18070vi.A11("fontButton");
                                    throw null;
                                }
                                C18070vi.A11("emojiButton");
                                throw null;
                            }
                        }
                        C18070vi.A11("entry");
                        throw null;
                    }
                    throw C17880vN.A0g();
                }
            }
            this.A00 = true;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C121246Is(AnonymousClass7J1 r3, AnonymousClass72I r4) {
        super(r4, 1.0f, 2.0f);
        this.A01 = r3;
    }
}
