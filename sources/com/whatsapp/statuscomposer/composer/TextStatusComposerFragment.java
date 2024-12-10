package com.whatsapp.statuscomposer.composer;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass10I;
import X.AnonymousClass11C;
import X.AnonymousClass11P;
import X.AnonymousClass18K;
import X.AnonymousClass190;
import X.AnonymousClass1BI;
import X.AnonymousClass1DF;
import X.AnonymousClass1DT;
import X.AnonymousClass1FL;
import X.AnonymousClass1FU;
import X.AnonymousClass1KB;
import X.AnonymousClass1KW;
import X.AnonymousClass1L4;
import X.AnonymousClass1LU;
import X.AnonymousClass1PU;
import X.AnonymousClass1T6;
import X.AnonymousClass1Y5;
import X.AnonymousClass1Z2;
import X.AnonymousClass206;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass3SU;
import X.AnonymousClass3TA;
import X.AnonymousClass4JA;
import X.AnonymousClass6R1;
import X.AnonymousClass6VM;
import X.AnonymousClass727;
import X.AnonymousClass72B;
import X.AnonymousClass736;
import X.AnonymousClass74F;
import X.AnonymousClass759;
import X.AnonymousClass77C;
import X.AnonymousClass77J;
import X.AnonymousClass77K;
import X.AnonymousClass78P;
import X.AnonymousClass7J1;
import X.AnonymousClass7LG;
import X.AnonymousClass7PD;
import X.AnonymousClass7RI;
import X.AnonymousClass880;
import X.AnonymousClass883;
import X.AnonymousClass885;
import X.AnonymousClass886;
import X.AnonymousClass8AT;
import X.B8E;
import X.BMV;
import X.C107845ai;
import X.C108945cZ;
import X.C108955ca;
import X.C108965cb;
import X.C108975cc;
import X.C108985cd;
import X.C108995ce;
import X.C109005cf;
import X.C109045cj;
import X.C109455dT;
import X.C117015z4;
import X.C1193267r;
import X.C124126Xd;
import X.C124856Zy;
import X.C124866Zz;
import X.C125026aN;
import X.C129496ht;
import X.C131676lU;
import X.C131706lX;
import X.C132026m3;
import X.C134206qD;
import X.C138706xY;
import X.C140126zz;
import X.C142987Bo;
import X.C143887Fe;
import X.C145827Mt;
import X.C145847Mv;
import X.C153907qH;
import X.C17880vN;
import X.C17890vO;
import X.C17960vV;
import X.C18000vb;
import X.C18010vc;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C18100vl;
import X.C19830z4;
import X.C19880zA;
import X.C21320Ai5;
import X.C218617r;
import X.C22971Dz;
import X.C24100BvS;
import X.C24127Bvt;
import X.C24661Le;
import X.C26302CxJ;
import X.C26511Sk;
import X.C29051bX;
import X.C29071bZ;
import X.C29191bl;
import X.C29671cg;
import X.C32011gU;
import X.C32741hg;
import X.C33251iW;
import X.C35511mM;
import X.C36211nW;
import X.C441822l;
import X.C56422hR;
import X.C61862qP;
import X.C62572rc;
import X.C63642tS;
import X.C63672tV;
import X.C692236j;
import X.C693536w;
import X.C72453Mb;
import X.C72463Mc;
import X.C72473Md;
import X.C80753xv;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.text.InputFilter;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageButton;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.whatsapp.KeyboardPopupLayout;
import com.whatsapp.emoji.search.EmojiSearchKeyboardContainer;
import com.whatsapp.status.posting.Hilt_FirstStatusConfirmationDialogFragment;
import com.whatsapp.status.privacy.StatusPrivacyBottomSheetDialogFragment;
import com.whatsapp.status.widget.StatusEditText;
import com.whatsapp.statuscomposer.ConsolidatedStatusComposerActivity;
import com.whatsapp.textstatuscomposer.bottombar.CreationModeBottomBar;
import com.whatsapp.textstatuscomposer.voice.VoiceRecordingView;
import com.whatsapp.util.Log;
import com.whatsapp.webpagepreview.WebPagePreviewView;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class TextStatusComposerFragment extends Hilt_TextStatusComposerFragment implements AnonymousClass8AT, C36211nW, AnonymousClass880, AnonymousClass883, B8E, AnonymousClass885 {
    public static final int[] A1Q = {2131888434, 2131888466, 2131888458, 2131888452, 2131888377, 2131888385, 2131888411, 2131888445, 2131888394, 2131888436, 2131888413, 2131888373, 2131888457, 2131888431, 2131888453, 2131888371, 2131888432, 2131888465, 2131888437, 2131888412, 2131888444};
    public static final int[] A1R = {2131890505, 2131890506, 2131890502, 2131890503, 2131890499, 2131890501, 2131890500, 2131890504};
    public int A00 = AnonymousClass74F.A00();
    public int A01;
    public DisplayMetrics A02;
    public View A03;
    public ViewGroup A04;
    public ViewGroup A05;
    public ImageButton A06;
    public ScrollView A07;
    public TextView A08;
    public CoordinatorLayout A09;
    public AnonymousClass1DT A0A = AnonymousClass3MW.A0M(AnonymousClass3MY.A0f());
    public C19880zA A0B;
    public AnonymousClass190 A0C;
    public AnonymousClass4JA A0D;
    public C61862qP A0E;
    public C56422hR A0F;
    public C124856Zy A0G;
    public C124866Zz A0H;
    public C125026aN A0I;
    public C218617r A0J;
    public AnonymousClass1KB A0K;
    public KeyboardPopupLayout A0L;
    public C33251iW A0M;
    public C143887Fe A0N;
    public AnonymousClass3TA A0O;
    public AnonymousClass11C A0P;
    public AnonymousClass11P A0Q;
    public C19830z4 A0R;
    public C18000vb A0S;
    public C24661Le A0T;
    public C1193267r A0U;
    public AnonymousClass1KW A0V;
    public EmojiSearchKeyboardContainer A0W;
    public C18030ve A0X;
    public AnonymousClass18K A0Y;
    public C134206qD A0Z;
    public C80753xv A0a;
    public AnonymousClass736 A0b;
    public C140126zz A0c;
    public AnonymousClass3SU A0d;
    public AnonymousClass1LU A0e;
    public C32011gU A0f;
    public AnonymousClass1T6 A0g;
    public C132026m3 A0h;
    public C109455dT A0i;
    public C18010vc A0j;
    public C32741hg A0k;
    public StatusEditText A0l;
    public CreationModeBottomBar A0m;
    public AnonymousClass7J1 A0n;
    public C138706xY A0o;
    public VoiceRecordingView A0p;
    public C145827Mt A0q;
    public AnonymousClass1PU A0r;
    public AnonymousClass1L4 A0s;
    public AnonymousClass10I A0t;
    public AnonymousClass72B A0u;
    public AnonymousClass6R1 A0v = AnonymousClass6R1.DISABLED;
    public WebPagePreviewView A0w;
    public C35511mM A0x;
    public AnonymousClass00H A0y;
    public AnonymousClass00H A0z;
    public AnonymousClass00H A10;
    public AnonymousClass00H A11;
    public AnonymousClass00H A12;
    public AnonymousClass00H A13;
    public AnonymousClass00H A14;
    public AnonymousClass00H A15;
    public AnonymousClass00H A16;
    public AnonymousClass00H A17;
    public String A18;
    public String A19 = "default_share";
    public boolean A1A;
    public int A1B;
    public int A1C;
    public int A1D;
    public View A1E;
    public C117015z4 A1F;
    public CreationModeBottomBar A1G;
    public boolean A1H;
    public boolean A1I;
    public final AnonymousClass1DT A1J = C108945cZ.A0S();
    public final C107845ai A1K = new C142987Bo(this, 7);
    public final Runnable A1L = AnonymousClass7RI.A00(this, 11);
    public final C18100vl A1M = AnonymousClass1DF.A01(new C153907qH(this));
    public final Handler A1N = C17890vO.A0D();
    public final View.OnClickListener A1O = new AnonymousClass78P((Object) this, 17);
    public final C131676lU A1P = new C131676lU(this);

    public static final void A07(AnonymousClass77J r14, TextStatusComposerFragment textStatusComposerFragment) {
        String str;
        AnonymousClass77C r0;
        AnonymousClass77C r02;
        TextStatusComposerFragment textStatusComposerFragment2 = textStatusComposerFragment;
        StatusEditText statusEditText = textStatusComposerFragment.A0l;
        if (statusEditText != null) {
            if (statusEditText.getText() != null) {
                StatusEditText statusEditText2 = textStatusComposerFragment2.A0l;
                if (statusEditText2 != null) {
                    String A172 = AnonymousClass3MZ.A17(statusEditText2);
                    int length = A172.length() - 1;
                    int i = 0;
                    boolean z = false;
                    while (i <= length) {
                        int i2 = length;
                        if (!z) {
                            i2 = i;
                        }
                        boolean A0u2 = C109005cf.A0u(A172, i2);
                        if (z) {
                            if (!A0u2) {
                                break;
                            }
                            length--;
                        } else if (!A0u2) {
                            z = true;
                        } else {
                            i++;
                        }
                    }
                    str = C108985cd.A0g(length, i, A172);
                }
            } else {
                str = "";
            }
            ArrayList A132 = AnonymousClass000.A13();
            A132.add(C29671cg.A00);
            AnonymousClass77C r5 = r14.A01;
            if (r5.A02 > 0) {
                r0 = r5;
            } else {
                r0 = r14.A02;
            }
            int i3 = r0.A02;
            if (r5.A00 > 0) {
                r02 = r5;
            } else {
                r02 = r14.A02;
            }
            int i4 = r02.A00;
            if (textStatusComposerFragment2.A0e != null) {
                textStatusComposerFragment2.startActivityForResult(AnonymousClass1LU.A1e(textStatusComposerFragment2.A14(), r14.A02.A03, r5.A03, r14.A03.A03, (String) null, A132, r14.A00, 22, false, true).putExtra("media_width", i3).putExtra("media_height", i4).putExtra("caption", str), 1);
                return;
            } else {
                AnonymousClass3MW.A1F();
                throw null;
            }
        }
        C18070vi.A11("entry");
        throw null;
    }

    public static final void A0M(TextStatusComposerFragment textStatusComposerFragment, int i) {
        if (i == 2) {
            int dimensionPixelSize = AnonymousClass3MZ.A09(textStatusComposerFragment).getDimensionPixelSize(2131169016);
            TextView textView = textStatusComposerFragment.A08;
            if (textView != null) {
                textView.setPadding(0, dimensionPixelSize, dimensionPixelSize, 0);
                return;
            }
        } else {
            TextView textView2 = textStatusComposerFragment.A08;
            if (textView2 != null) {
                textView2.setPadding(0, 0, 0, 0);
                return;
            }
        }
        C18070vi.A11("fontButton");
        throw null;
    }

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        AnonymousClass6VM.A00(C108965cb.A0B(this), true);
        return layoutInflater.inflate(2131627181, viewGroup, false);
    }

    public void A20(Bundle bundle) {
        C18070vi.A0d(bundle, 0);
        bundle.putInt("background_color", this.A00);
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0557, code lost:
        if (r7 == 20) goto L_0x0559;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x05fe, code lost:
        if (r6 != null) goto L_0x0600;
     */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x0607  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x01e4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A21(android.os.Bundle r45, android.view.View r46) {
        /*
            r44 = this;
            r3 = 0
            r1 = r46
            X.C18070vi.A0d(r1, r3)
            r0 = r44
            X.1FL r2 = r0.A1D()
            X.02V r4 = r2.BVe()
            X.5gw r2 = new X.5gw
            r2.<init>(r0)
            r4.A09(r2, r0)
            X.00H r2 = r0.A27()
            X.0ve r4 = X.C108955ca.A0R(r2)
            r2 = 9162(0x23ca, float:1.2839E-41)
            X.0vf r13 = X.C18040vf.A02
            boolean r2 = X.C18020vd.A05(r13, r4, r2)
            if (r2 == 0) goto L_0x0042
            r2 = 2131428018(0x7f0b02b2, float:1.8477669E38)
            android.view.View r7 = r1.findViewById(r2)
            r2 = 8
            int r6 = X.C43531zx.A00(r7, r2)
            r5 = 720(0x2d0, float:1.009E-42)
            r4 = 1280(0x500, float:1.794E-42)
            android.graphics.Matrix$ScaleToFit r2 = android.graphics.Matrix.ScaleToFit.CENTER
            X.AnonymousClass4aO.A01(r2, r7, r5, r4, r6)
            r0.A1E = r7
        L_0x0042:
            X.4JA r6 = r0.A0D
            if (r6 == 0) goto L_0x089d
            android.os.Handler r4 = r0.A1N
            r5 = 1
            X.4gF r2 = new X.4gF
            r2.<init>(r0, r6, r4, r5)
            X.1It r4 = new X.1It
            r4.<init>(r2, r0)
            java.lang.Class<X.3TA> r2 = X.AnonymousClass3TA.class
            X.1J2 r2 = r4.A00(r2)
            X.3TA r2 = (X.AnonymousClass3TA) r2
            r0.A0O = r2
            java.lang.String r22 = "webPagePreviewViewModel"
            if (r2 == 0) goto L_0x0894
            X.1DS r7 = r2.A0H
            X.1q9 r6 = r0.A1G()
            X.81H r2 = new X.81H
            r2.<init>(r0)
            r4 = 20
            X.AnonymousClass7AS.A00(r6, r7, r2, r4)
            X.3TA r2 = r0.A0O
            if (r2 == 0) goto L_0x0894
            X.1DT r7 = r2.A0L
            X.1q9 r6 = r0.A1G()
            X.81I r2 = new X.81I
            r2.<init>(r0)
            X.AnonymousClass7AS.A00(r6, r7, r2, r4)
            X.3TA r2 = r0.A0O
            if (r2 == 0) goto L_0x0894
            X.1DT r7 = r2.A0J
            X.1q9 r6 = r0.A1G()
            X.81J r2 = new X.81J
            r2.<init>(r0)
            X.AnonymousClass7AS.A00(r6, r7, r2, r4)
            X.1DT r2 = r0.A0A
            r40 = r2
            X.1q9 r7 = r0.A1G()
            X.81K r6 = new X.81K
            r6.<init>(r0)
            X.AnonymousClass7AS.A00(r7, r2, r6, r4)
            X.0ve r7 = r0.A0X
            if (r7 == 0) goto L_0x0891
            X.0vf r6 = X.C18040vf.A01
            r2 = 1874(0x752, float:2.626E-42)
            boolean r2 = X.C18020vd.A05(r6, r7, r2)
            r0.A1H = r2
            r2 = 2131436921(0x7f0b2579, float:1.8495726E38)
            android.view.View r11 = r1.findViewById(r2)
            com.whatsapp.textstatuscomposer.voice.VoiceRecordingView r11 = (com.whatsapp.textstatuscomposer.voice.VoiceRecordingView) r11
            r0.A0p = r11
            java.lang.String r2 = "null cannot be cast to non-null type com.whatsapp.DialogActivity"
            java.lang.String r20 = "Required value was null."
            if (r11 == 0) goto L_0x0119
            X.6Zz r6 = r0.A0H
            if (r6 == 0) goto L_0x088e
            X.1FL r10 = r0.A1B()
            X.C18070vi.A0z(r10, r2)
            X.1FU r10 = (X.AnonymousClass1FU) r10
            X.1na r6 = r6.A00
            X.10E r7 = r6.A02
            X.11C r27 = X.AnonymousClass3Ma.A0a(r7)
            X.0ve r28 = X.AnonymousClass10E.A8r(r7)
            X.1nZ r6 = r6.A01
            X.00S r8 = r6.A17
            java.lang.Object r9 = r8.get()
            X.6kv r9 = (X.C131336kv) r9
            X.10G r8 = r7.A00
            X.00S r8 = r8.A0G
            java.lang.Object r8 = r8.get()
            X.6uN r8 = (X.C136776uN) r8
            X.10I r32 = X.AnonymousClass10E.AL1(r7)
            X.1hg r29 = X.C108965cb.A0Z(r7)
            X.00S r6 = r6.A18
            java.lang.Object r7 = r6.get()
            X.6a0 r7 = (X.AnonymousClass6a0) r7
            X.7Mt r6 = new X.7Mt
            r23 = r6
            r24 = r9
            r25 = r7
            r26 = r10
            r30 = r11
            r31 = r8
            r23.<init>(r24, r25, r26, r27, r28, r29, r30, r31, r32)
            r0.A0q = r6
            r6.A03 = r0
            r0.A03()
        L_0x0119:
            android.content.res.Resources r6 = X.AnonymousClass3MZ.A09(r0)
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            X.C18070vi.A0X(r6)
            r0.A02 = r6
            android.content.res.Resources r7 = X.AnonymousClass3MZ.A09(r0)
            r6 = 2131168861(0x7f070e5d, float:1.7952036E38)
            int r6 = r7.getDimensionPixelSize(r6)
            r0.A1D = r6
            android.content.res.Resources r7 = X.AnonymousClass3MZ.A09(r0)
            r6 = 2131168860(0x7f070e5c, float:1.7952034E38)
            int r6 = r7.getDimensionPixelSize(r6)
            r0.A1C = r6
            android.content.res.Resources r7 = X.AnonymousClass3MZ.A09(r0)
            r6 = 2131168859(0x7f070e5b, float:1.7952032E38)
            int r6 = r7.getDimensionPixelSize(r6)
            r0.A1B = r6
            r6 = 2131429666(0x7f0b0922, float:1.8481011E38)
            android.view.View r6 = r1.findViewById(r6)
            androidx.coordinatorlayout.widget.CoordinatorLayout r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r6
            r0.A09 = r6
            r23 = r45
            if (r45 != 0) goto L_0x05e1
            A0B(r0)
        L_0x015f:
            r6 = 2131429189(0x7f0b0745, float:1.8480044E38)
            android.widget.ImageView r12 = X.C108975cc.A0B(r1, r6)
            X.AnonymousClass78P.A00(r12, r0, r4)
            r6 = 11
            X.C1421478i.A00(r12, r0, r6)
            r6 = 2131430946(0x7f0b0e22, float:1.8483607E38)
            android.widget.TextView r7 = X.C72453Mb.A0W(r1, r6)
            r0.A08 = r7
            java.lang.String r21 = "fontButton"
            if (r7 == 0) goto L_0x0898
            r6 = 21
            X.AnonymousClass78P.A00(r7, r0, r6)
            android.widget.TextView r7 = r0.A08
            if (r7 == 0) goto L_0x0898
            r6 = 12
            X.C1421478i.A00(r7, r0, r6)
            X.0zA r6 = r0.A0B
            if (r6 == 0) goto L_0x088b
            X.1DT r10 = r0.A1J
            android.content.Intent r7 = X.C108955ca.A0B(r0)
            java.lang.String r6 = "status_distribution"
            android.os.Parcelable r6 = r7.getParcelableExtra(r6)
            r10.A0F(r6)
            X.72B r6 = r0.A0u
            if (r6 == 0) goto L_0x0888
            X.6R1 r6 = r6.A02(r3)
            r0.A0v = r6
            java.lang.Object r6 = r10.A06()
            if (r6 != 0) goto L_0x0206
            X.6R1 r6 = r0.A0v
            if (r6 == 0) goto L_0x05d6
            int r7 = r6.ordinal()
            if (r7 == r5) goto L_0x05ba
            r6 = 2
            if (r7 == r6) goto L_0x05ba
            r6 = 3
            if (r7 != r6) goto L_0x05d6
            X.00H r6 = r0.A15
            if (r6 == 0) goto L_0x0882
            X.6zR r6 = X.C108985cd.A0Q(r6)
            boolean r7 = r6.A00
            boolean r6 = r6.A01
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
        L_0x01d0:
            X.1D6 r7 = X.AnonymousClass1D6.A01(r7, r6)
        L_0x01d4:
            java.lang.Object r6 = r7.first
            boolean r28 = X.AnonymousClass000.A1Y(r6)
            java.lang.Object r6 = r7.second
            boolean r29 = X.AnonymousClass000.A1Y(r6)
            X.1Le r6 = r0.A0T
            if (r6 == 0) goto L_0x087f
            java.util.ArrayList r25 = r6.A0A()
            X.1Le r6 = r0.A0T
            if (r6 == 0) goto L_0x087f
            java.util.ArrayList r26 = r6.A0B()
            X.1Le r6 = r0.A0T
            if (r6 == 0) goto L_0x087f
            int r27 = r6.A05()
            X.77K r6 = new X.77K
            r31 = r3
            r24 = r6
            r30 = r3
            r24.<init>(r25, r26, r27, r28, r29, r30, r31)
            r10.A0F(r6)
        L_0x0206:
            com.whatsapp.textstatuscomposer.bottombar.CreationModeBottomBar r6 = r0.A0m
            if (r6 != 0) goto L_0x0213
            r6 = 2131428318(0x7f0b03de, float:1.8478277E38)
            android.view.View r6 = r1.findViewById(r6)
            com.whatsapp.textstatuscomposer.bottombar.CreationModeBottomBar r6 = (com.whatsapp.textstatuscomposer.bottombar.CreationModeBottomBar) r6
        L_0x0213:
            r0.A1G = r6
            if (r6 == 0) goto L_0x021a
            r6.setVisibility(r3)
        L_0x021a:
            com.whatsapp.textstatuscomposer.bottombar.CreationModeBottomBar r7 = r0.A1G
            if (r7 == 0) goto L_0x087a
            r6 = 2131432422(0x7f0b13e6, float:1.84866E38)
            r11 = 2131432422(0x7f0b13e6, float:1.84866E38)
            android.view.View r6 = r7.findViewById(r6)
            if (r6 != 0) goto L_0x0563
            r6 = 2131432424(0x7f0b13e8, float:1.8486605E38)
            android.view.View r8 = X.C18070vi.A05(r7, r6)
            android.view.ViewStub r8 = (android.view.ViewStub) r8
            X.6m3 r7 = r0.A0h
            if (r7 == 0) goto L_0x0873
            X.0vl r9 = r0.A1M
            java.lang.Object r6 = r9.getValue()
            X.6Qq r6 = (X.C122506Qq) r6
            X.8AQ r7 = r7.A00(r8, r6, r3)
        L_0x0243:
            com.whatsapp.textstatuscomposer.bottombar.CreationModeBottomBar r8 = r0.A1G
            if (r8 == 0) goto L_0x085e
            r6 = 2131432422(0x7f0b13e6, float:1.84866E38)
            android.view.View r25 = X.C18070vi.A05(r8, r6)
            X.6aN r8 = r0.A0I
            if (r8 == 0) goto L_0x085b
            X.1FL r6 = r0.A1D()
            X.C18070vi.A0z(r6, r2)
            X.1FU r6 = (X.AnonymousClass1FU) r6
            java.lang.Object r9 = r9.getValue()
            X.6Qq r2 = X.C122506Qq.EMPTY_CHIP
            boolean r38 = X.AnonymousClass000.A1Z(r9, r2)
            com.whatsapp.textstatuscomposer.bottombar.CreationModeBottomBar r11 = r0.A1G
            if (r11 == 0) goto L_0x0856
            X.1na r2 = r8.A00
            X.10E r8 = r2.A02
            X.11P r29 = X.AnonymousClass10E.A6O(r8)
            X.0ve r32 = X.AnonymousClass10E.A8r(r8)
            X.118 r30 = X.AnonymousClass3MZ.A0l(r8)
            X.1Lc r35 = X.C108965cb.A0X(r8)
            X.0vb r31 = X.AnonymousClass10E.A6Q(r8)
            X.1hg r36 = X.C108965cb.A0Z(r8)
            X.1nZ r2 = r2.A01
            X.00S r2 = r2.A14
            java.lang.Object r9 = r2.get()
            X.6aO r9 = (X.C125036aO) r9
            X.10G r2 = r8.A00
            X.00S r2 = r2.A46
            java.lang.Object r8 = r2.get()
            X.70C r8 = (X.AnonymousClass70C) r8
            X.7J1 r2 = new X.7J1
            r24 = r2
            r26 = r10
            r27 = r9
            r28 = r6
            r33 = r7
            r34 = r8
            r37 = r11
            r24.<init>(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)
            r0.A0n = r2
            r2.A06 = r0
            X.8AQ r6 = r2.A0G
            r6.CKK(r2)
            r2 = 2131437043(0x7f0b25f3, float:1.8495974E38)
            android.view.ViewGroup r2 = X.AnonymousClass3MW.A0D(r1, r2)
            r0.A05 = r2
            r2 = 2131430490(0x7f0b0c5a, float:1.8482682E38)
            android.view.View r2 = X.AnonymousClass3MX.A0C(r1, r2)
            com.whatsapp.status.widget.StatusEditText r2 = (com.whatsapp.status.widget.StatusEditText) r2
            r0.A0l = r2
            X.1FL r7 = r0.A1D()
            X.77o r6 = new X.77o
            r6.<init>(r0, r5)
            r2 = 0
            X.CIZ r8 = new X.CIZ
            r8.<init>(r7, r6, r2)
            android.view.View r7 = r0.A0B
            if (r7 == 0) goto L_0x02ea
            r6 = 2131429144(0x7f0b0718, float:1.8479952E38)
            android.view.View r7 = r7.findViewById(r6)
            if (r7 == 0) goto L_0x02ea
            r6 = 8
            X.C1422578t.A00(r7, r8, r0, r6)
        L_0x02ea:
            r6 = 2131437041(0x7f0b25f1, float:1.849597E38)
            android.view.View r6 = r1.findViewById(r6)
            android.view.View$OnClickListener r7 = r0.A1O
            r6.setOnClickListener(r7)
            r6 = 2131429144(0x7f0b0718, float:1.8479952E38)
            android.view.View r6 = r1.findViewById(r6)
            r6.setOnClickListener(r7)
            r6 = 2131428012(0x7f0b02ac, float:1.8477656E38)
            android.widget.ImageView r11 = X.C108975cc.A0B(r1, r6)
            r6 = 16
            X.AnonymousClass78P.A00(r11, r0, r6)
            r6 = 2131434836(0x7f0b1d54, float:1.8491497E38)
            android.view.View r6 = r1.findViewById(r6)
            android.widget.ScrollView r6 = (android.widget.ScrollView) r6
            r0.A07 = r6
            android.animation.LayoutTransition r7 = new android.animation.LayoutTransition
            r7.<init>()
            r6 = 2
            r7.enableTransitionType(r6)
            r6 = 3
            r7.enableTransitionType(r6)
            android.view.ViewGroup r6 = r0.A05
            if (r6 == 0) goto L_0x032b
            r6.setLayoutTransition(r7)
        L_0x032b:
            r0.A04()
            X.6Zy r7 = r0.A0G
            if (r7 == 0) goto L_0x0853
            X.1cg r34 = X.C29671cg.A00
            android.view.ViewGroup r6 = r0.A05
            r19 = r6
            if (r6 == 0) goto L_0x084e
            com.whatsapp.status.widget.StatusEditText r6 = r0.A0l
            r18 = r6
            java.lang.String r17 = "entry"
            if (r6 == 0) goto L_0x084a
            X.6lU r6 = r0.A1P
            r41 = r6
            X.3TA r6 = r0.A0O
            r16 = r6
            if (r6 == 0) goto L_0x0894
            android.widget.ScrollView r15 = r0.A07
            if (r15 == 0) goto L_0x0845
            X.7J1 r14 = r0.A0n
            if (r14 == 0) goto L_0x0840
            X.1na r8 = r7.A00
            X.10E r6 = r8.A02
            X.0ve r33 = X.AnonymousClass10E.A8r(r6)
            X.1gU r35 = X.AnonymousClass3MY.A0d(r6)
            X.1KW r32 = X.AnonymousClass3Ma.A0f(r6)
            X.00S r7 = r6.A4O
            java.lang.Object r10 = r7.get()
            X.1hJ r10 = (X.C32511hJ) r10
            X.11C r30 = X.AnonymousClass3Ma.A0a(r6)
            X.00S r7 = r6.AAD
            java.lang.Object r9 = r7.get()
            X.2iK r9 = (X.C56972iK) r9
            X.1hg r39 = X.C108965cb.A0Z(r6)
            X.0vc r37 = X.AnonymousClass3Ma.A0r(r6)
            X.10G r7 = r6.A00
            X.00S r7 = r7.A40
            java.lang.Object r7 = r7.get()
            X.1L2 r7 = (X.AnonymousClass1L2) r7
            X.1K1 r8 = r8.A00
            X.00S r8 = r8.A0X
            X.00H r43 = X.C000200d.A00(r8)
            X.1KB r28 = X.AnonymousClass10E.A12(r6)
            X.6xY r6 = new X.6xY
            r24 = r6
            r25 = r19
            r26 = r15
            r27 = r40
            r29 = r16
            r31 = r7
            r36 = r10
            r38 = r9
            r40 = r18
            r42 = r14
            r24.<init>(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43)
            r0.A0o = r6
            X.6Id r7 = new X.6Id
            r7.<init>(r6)
            r6.A01 = r7
            com.whatsapp.status.widget.StatusEditText r9 = r6.A0K
            r9.addTextChangedListener(r7)
            android.text.InputFilter[] r8 = new android.text.InputFilter[r5]
            X.77g r7 = new X.77g
            r7.<init>(r6)
            r8[r3] = r7
            r9.setFilters(r8)
            X.00H r6 = r0.A14
            if (r6 == 0) goto L_0x083d
            boolean r6 = X.C108985cd.A1Z(r6)
            if (r6 == 0) goto L_0x0439
            android.content.Intent r7 = X.C108955ca.A0B(r0)
            X.C18070vi.A0X(r7)
            java.lang.String r6 = "entry_point"
            int r7 = r7.getIntExtra(r6, r3)
            if (r45 != 0) goto L_0x0539
            r6 = 5
            if (r7 == r6) goto L_0x03fb
            r6 = 10
            if (r7 == r6) goto L_0x03fb
            r6 = 22
            if (r7 == r6) goto L_0x03fb
            r6 = 24
            if (r7 == r6) goto L_0x03fb
            r6 = 28
            if (r7 == r6) goto L_0x03fb
            r6 = 21
            if (r7 == r6) goto L_0x03fb
            if (r7 != r4) goto L_0x0539
        L_0x03fb:
            X.1hg r10 = r0.A26()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)
            X.2tc r9 = X.C108965cb.A0Y(r10)
            boolean r4 = X.C63742tc.A03(r9)
            if (r4 == 0) goto L_0x0430
            java.lang.Integer r8 = X.C63742tc.A01(r6)
            java.lang.Integer r7 = X.C17880vN.A0i()
            X.2HA r6 = X.C63742tc.A00(r9)
            r4 = 25
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r6.A03 = r4
            r6.A02 = r8
            r6.A01 = r7
            X.6ey r4 = r9.A02
            r4.A01 = r8
            r4.A00 = r7
            X.18K r4 = r9.A01
            r4.CC7(r6)
        L_0x0430:
            X.2nU r6 = X.C108985cd.A0X(r10)
            java.lang.String r4 = "see_status_editor"
            r6.A04(r4)
        L_0x0439:
            android.content.Intent r6 = X.C108955ca.A0B(r0)
            java.lang.String r4 = "android.intent.extra.TEXT"
            java.lang.String r6 = r6.getStringExtra(r4)
            if (r6 == 0) goto L_0x0535
            int r4 = android.text.TextUtils.getTrimmedLength(r6)
            if (r4 == 0) goto L_0x0535
            r0.A1I = r3
            X.1gU r4 = r0.A0f
            if (r4 == 0) goto L_0x083a
            java.lang.String r4 = r4.A02(r6)
            com.whatsapp.status.widget.StatusEditText r7 = r0.A0l
            if (r7 == 0) goto L_0x084a
            if (r4 == 0) goto L_0x046b
            int r4 = r4.length()
            if (r4 == 0) goto L_0x046b
            java.lang.StringBuilder r6 = X.AnonymousClass000.A11(r6)
            r4 = 32
            java.lang.String r6 = X.C17890vO.A0c(r6, r4)
        L_0x046b:
            r7.setText(r6)
            com.whatsapp.status.widget.StatusEditText r6 = r0.A0l
            if (r6 == 0) goto L_0x084a
            r4 = 18
            X.C1420978d.A00(r6, r0, r4)
        L_0x0477:
            com.whatsapp.status.widget.StatusEditText r4 = r0.A0l
            if (r4 == 0) goto L_0x084a
            r4.requestFocus()
            r4 = 6
            X.79Y r6 = new X.79Y
            r6.<init>(r0, r4)
            com.whatsapp.status.widget.StatusEditText r4 = r0.A0l
            if (r4 == 0) goto L_0x084a
            r4.setOnEditorActionListener(r6)
            X.6xm r7 = new X.6xm
            r7.<init>()
            com.whatsapp.status.widget.StatusEditText r6 = r0.A0l
            if (r6 == 0) goto L_0x084a
            r8 = 2
            X.7Jh r4 = new X.7Jh
            r4.<init>(r0, r7, r8)
            r6.A0F = r4
            r4 = 2131429546(0x7f0b08aa, float:1.8480768E38)
            android.view.ViewGroup r4 = X.AnonymousClass3MW.A0D(r1, r4)
            r0.A04 = r4
            r0.A01()
            r4 = 2131430328(0x7f0b0bb8, float:1.8482354E38)
            android.view.View r4 = X.AnonymousClass3MX.A0C(r1, r4)
            android.widget.ImageButton r4 = (android.widget.ImageButton) r4
            r0.A06 = r4
            X.00H r4 = r0.A27()
            X.0ve r6 = X.C108955ca.A0R(r4)
            r4 = 7558(0x1d86, float:1.0591E-41)
            boolean r4 = X.C18020vd.A05(r13, r6, r4)
            java.lang.String r22 = "emojiButton"
            if (r4 == 0) goto L_0x04ce
            android.widget.ImageButton r6 = r0.A06
            if (r6 == 0) goto L_0x0894
            r4 = 8
            r6.setVisibility(r4)
        L_0x04ce:
            X.00H r4 = r0.A27()
            X.0ve r4 = X.C108955ca.A0R(r4)
            r9 = 8744(0x2228, float:1.2253E-41)
            boolean r4 = X.C18020vd.A05(r13, r4, r9)
            if (r4 == 0) goto L_0x064c
            X.1FL r6 = r0.A1D()
            r4 = 2131231765(0x7f080415, float:1.807962E38)
            X.5dT r14 = new X.5dT
            r14.<init>(r6, r4)
            X.1FL r7 = r0.A1D()
            r6 = 2131232116(0x7f080574, float:1.8080332E38)
            X.5dT r4 = new X.5dT
            r4.<init>(r7, r6)
            r0.A0i = r4
            X.1FL r6 = r0.A1D()
            r4 = 2131232155(0x7f08059b, float:1.8080411E38)
            X.5dT r10 = new X.5dT
            r10.<init>(r6, r4)
            X.1FL r6 = r0.A1D()
            r4 = 2131103238(0x7f060e06, float:1.7818937E38)
            int r7 = X.C19740yt.A00(r6, r4)
            r6 = 1065353216(0x3f800000, float:1.0)
            r14.A00(r7, r6)
            X.5dT r4 = r0.A0i
            if (r4 == 0) goto L_0x051b
            r4.A00(r7, r6)
        L_0x051b:
            r10.A00(r7, r6)
            X.5dT r4 = r0.A0i
            if (r4 == 0) goto L_0x0527
            r4.A03 = r2
            r4.invalidateSelf()
        L_0x0527:
            r12.setImageDrawable(r10)
            r11.setImageDrawable(r14)
            android.widget.TextView r6 = r0.A08
            if (r6 != 0) goto L_0x063a
            X.C18070vi.A11(r21)
            throw r2
        L_0x0535:
            r0.A1I = r5
            goto L_0x0477
        L_0x0539:
            X.1hg r8 = r0.A26()
            r4 = 5
            if (r7 == r4) goto L_0x0559
            r4 = 10
            if (r7 == r4) goto L_0x0559
            r4 = 22
            if (r7 == r4) goto L_0x0559
            r4 = 24
            if (r7 == r4) goto L_0x0559
            r4 = 28
            if (r7 == r4) goto L_0x0559
            r4 = 21
            if (r7 == r4) goto L_0x0559
            r4 = 20
            r6 = 0
            if (r7 != r4) goto L_0x055a
        L_0x0559:
            r6 = 1
        L_0x055a:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r6)
            r8.A0E(r4)
            goto L_0x03fb
        L_0x0563:
            X.6m3 r8 = r0.A0h
            if (r8 == 0) goto L_0x0873
            X.0vl r9 = r0.A1M
            java.lang.Object r6 = r9.getValue()
            X.6Qq r6 = (X.C122506Qq) r6
            android.view.View r11 = X.C18070vi.A05(r7, r11)
            int r7 = X.C108955ca.A04(r6, r3)
            if (r7 == r3) goto L_0x059e
            if (r7 == r5) goto L_0x0587
            r6 = 2
            if (r7 != r6) goto L_0x0863
            X.7Iy r7 = new X.7Iy
            r7.<init>()
        L_0x0583:
            X.8AQ r7 = (X.AnonymousClass8AQ) r7
            goto L_0x0243
        L_0x0587:
            X.5q4 r6 = r8.A01
            com.whatsapp.mediacomposer.bottombar.recipients.EmptyChipRecipientsView r11 = (com.whatsapp.mediacomposer.bottombar.recipients.EmptyChipRecipientsView) r11
            android.content.Context r6 = X.C72483Me.A0A(r6)
            X.7Iz r7 = new X.7Iz     // Catch:{ all -> 0x0868 }
            r7.<init>(r11)     // Catch:{ all -> 0x0868 }
            X.AnonymousClass12Q.A04()
            X.AnonymousClass114.A02(r6)
            X.C18070vi.A0b(r7)
            goto L_0x0583
        L_0x059e:
            X.6ZM r6 = r8.A00
            if (r6 == 0) goto L_0x0870
            com.whatsapp.mediacomposer.bottombar.recipients.DefaultRecipientsView r11 = (com.whatsapp.mediacomposer.bottombar.recipients.DefaultRecipientsView) r11
            X.1K2 r6 = r6.A00
            X.10E r7 = r6.A01
            X.00S r6 = r7.A34
            java.lang.Object r8 = r6.get()
            X.72B r8 = (X.AnonymousClass72B) r8
            X.1Me r6 = X.C108985cd.A0R(r7)
            X.7J0 r7 = new X.7J0
            r7.<init>(r6, r11, r8)
            goto L_0x0583
        L_0x05ba:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r5)
            X.1mM r7 = r0.A0x
            if (r7 == 0) goto L_0x0885
            java.lang.Integer r6 = X.AnonymousClass00R.A0M
            java.lang.Boolean r6 = r7.A01(r6)
            boolean r6 = r8.equals(r6)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r6)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
            goto L_0x01d0
        L_0x05d6:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
            X.1D6 r7 = new X.1D6
            r7.<init>(r6, r6)
            goto L_0x01d4
        L_0x05e1:
            java.lang.String r7 = "background_color"
            r6 = r23
            int r7 = r6.getInt(r7)
            r0.A00 = r7
            android.view.View r6 = r0.A1E
            r8 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            if (r6 == 0) goto L_0x0617
            r6.setBackgroundColor(r7)
        L_0x05f4:
            X.1FL r6 = r0.A1B()
            if (r6 == 0) goto L_0x0603
            android.view.Window r6 = r6.getWindow()
            if (r6 == 0) goto L_0x0603
        L_0x0600:
            X.AnonymousClass3Ma.A1H(r6, r8)
        L_0x0603:
            com.whatsapp.textstatuscomposer.voice.VoiceRecordingView r9 = r0.A0p
            if (r9 == 0) goto L_0x015f
            int r8 = r0.A00
            r7 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r6 = 1045220557(0x3e4ccccd, float:0.2)
            int r6 = X.AnonymousClass1Z2.A03(r6, r8, r7)
            r9.setBackgroundTint(r6)
            goto L_0x015f
        L_0x0617:
            X.00H r6 = r0.A27()
            boolean r6 = X.C108975cc.A1H(r6)
            if (r6 == 0) goto L_0x062b
            androidx.coordinatorlayout.widget.CoordinatorLayout r7 = r0.A09
            if (r7 == 0) goto L_0x05f4
            int r6 = r0.A00
            r7.setBackgroundColor(r6)
            goto L_0x05f4
        L_0x062b:
            X.1FL r6 = r0.A1B()
            if (r6 == 0) goto L_0x0603
            android.view.Window r6 = r6.getWindow()
            if (r6 == 0) goto L_0x0603
            int r8 = r0.A00
            goto L_0x0600
        L_0x063a:
            X.5dT r4 = r0.A0i
            r6.setBackground(r4)
            android.widget.ImageButton r6 = r0.A06
            if (r6 != 0) goto L_0x0647
            X.C18070vi.A11(r22)
            throw r2
        L_0x0647:
            X.5dT r4 = r0.A0i
            r6.setBackground(r4)
        L_0x064c:
            boolean r4 = A0i(r0)
            if (r4 == 0) goto L_0x0753
            android.view.View r6 = r0.A0B
            r4 = r2
            if (r6 == 0) goto L_0x0660
            r4 = 2131429666(0x7f0b0922, float:1.8481011E38)
            android.view.View r4 = r6.findViewById(r4)
            androidx.coordinatorlayout.widget.CoordinatorLayout r4 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r4
        L_0x0660:
            r0.A09 = r4
            android.view.View r6 = r0.A0B
            r4 = r2
            if (r6 == 0) goto L_0x0670
            r4 = 2131432239(0x7f0b132f, float:1.848623E38)
            android.view.View r4 = r6.findViewById(r4)
            com.whatsapp.KeyboardPopupLayout r4 = (com.whatsapp.KeyboardPopupLayout) r4
        L_0x0670:
            r0.A0L = r4
            android.view.View r6 = r0.A0B
            r4 = r2
            if (r6 == 0) goto L_0x0680
            r4 = 2131430735(0x7f0b0d4f, float:1.848318E38)
            android.view.View r4 = r6.findViewById(r4)
            com.whatsapp.emoji.search.EmojiSearchKeyboardContainer r4 = (com.whatsapp.emoji.search.EmojiSearchKeyboardContainer) r4
        L_0x0680:
            r0.A0W = r4
            androidx.coordinatorlayout.widget.CoordinatorLayout r4 = r0.A09
            if (r4 == 0) goto L_0x074e
            X.3SU r6 = new X.3SU
            r6.<init>(r4, r3, r3)
            r0.A0d = r6
            androidx.coordinatorlayout.widget.CoordinatorLayout r4 = r0.A09
            if (r4 == 0) goto L_0x0749
            X.AnonymousClass1HF.A0k(r4, r6)
            X.74J r23 = X.C108975cc.A0G(r0)
            X.1FL r25 = r0.A1D()
            androidx.coordinatorlayout.widget.CoordinatorLayout r10 = r0.A09
            if (r10 == 0) goto L_0x0744
            X.1FL r24 = r0.A1D()
            androidx.coordinatorlayout.widget.CoordinatorLayout r7 = r0.A09
            if (r7 == 0) goto L_0x073f
            android.widget.ImageButton r6 = r0.A06
            if (r6 != 0) goto L_0x06b0
            X.C18070vi.A11(r22)
            throw r2
        L_0x06b0:
            com.whatsapp.status.widget.StatusEditText r4 = r0.A0l
            if (r4 != 0) goto L_0x06b8
            X.C18070vi.A11(r17)
            throw r2
        L_0x06b8:
            com.whatsapp.KeyboardPopupLayout r15 = r0.A0L
            com.whatsapp.emoji.search.EmojiSearchKeyboardContainer r14 = r0.A0W
            X.3SU r12 = r0.A0d
            X.00H r11 = r0.A27()
            X.0ve r11 = X.C108955ca.A0R(r11)
            boolean r33 = X.C18020vd.A05(r13, r11, r9)
            r26 = r10
            r27 = r6
            r28 = r7
            r29 = r15
            r30 = r4
            r31 = r14
            r32 = r12
            r23.A0L(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            X.00H r4 = r0.A11
            if (r4 == 0) goto L_0x0739
            java.lang.Object r6 = X.C18070vi.A0E(r4)
            X.74J r6 = (X.AnonymousClass74J) r6
            int r4 = X.C109005cf.A03(r0)
            r6.A0K(r4)
            X.74J r6 = X.C108975cc.A0G(r0)
            X.5ai r4 = r0.A1K
            r6.A0N(r4)
            X.74J r7 = X.C108975cc.A0G(r0)
            r4 = 3
            X.7Hr r6 = new X.7Hr
            r6.<init>(r0, r4)
            com.whatsapp.expressionstray.ExpressionsTrayView r4 = r7.A0E
            if (r4 == 0) goto L_0x0705
            r4.A0J = r6
        L_0x0705:
            r7.A0F = r6
            X.74J r6 = X.C108975cc.A0G(r0)
            X.7GH r4 = new X.7GH
            r4.<init>(r0, r8)
            r6.A0C = r4
            X.74J r6 = X.C108975cc.A0G(r0)
            X.7GI r4 = new X.7GI
            r4.<init>(r0, r5)
            r6.A0D = r4
            android.widget.ImageButton r6 = r0.A06
            if (r6 != 0) goto L_0x0725
            X.C18070vi.A11(r22)
            throw r2
        L_0x0725:
            r4 = 18
            X.AnonymousClass78P.A00(r6, r0, r4)
            com.whatsapp.status.widget.StatusEditText r4 = r0.A0l
            if (r4 != 0) goto L_0x0732
            X.C18070vi.A11(r17)
            throw r2
        L_0x0732:
            r2 = 19
            X.AnonymousClass78P.A00(r4, r0, r2)
            goto L_0x07e2
        L_0x0739:
            java.lang.String r0 = "expressionsTrayController"
            X.C18070vi.A11(r0)
            throw r2
        L_0x073f:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r20)
            throw r0
        L_0x0744:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r20)
            throw r0
        L_0x0749:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r20)
            throw r0
        L_0x074e:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r20)
            throw r0
        L_0x0753:
            X.6qD r6 = r0.A0Z
            if (r6 == 0) goto L_0x0837
            X.1FL r2 = r0.A1D()
            r6.A00 = r2
            r2 = 2131432239(0x7f0b132f, float:1.848623E38)
            android.view.View r8 = X.AnonymousClass3MX.A0C(r1, r2)
            com.whatsapp.KeyboardPopupLayout r8 = (com.whatsapp.KeyboardPopupLayout) r8
            android.widget.ImageButton r7 = r0.A06
            if (r7 == 0) goto L_0x0894
            com.whatsapp.status.widget.StatusEditText r9 = r0.A0l
            if (r9 == 0) goto L_0x084a
            java.lang.Integer r10 = X.C17880vN.A0k()
            r2 = 5
            r11 = r2
            r6.A01(r7, r8, r9, r10, r11)
            X.00H r4 = r0.A0z
            if (r4 == 0) goto L_0x0834
            java.lang.Object r4 = r4.get()
            X.6uD r4 = (X.C136686uD) r4
            X.6in r4 = r4.A00()
            r6.A02 = r4
            X.00H r4 = r0.A0z
            if (r4 == 0) goto L_0x0834
            java.lang.Object r4 = r4.get()
            X.6uD r4 = (X.C136686uD) r4
            X.7Hs r4 = r4.A01()
            r6.A03 = r4
            X.5z4 r7 = r6.A00()
            r0.A1F = r7
            X.5ai r4 = r0.A1K
            r7.A0J(r4)
            r6 = 3
            X.79Q r4 = new X.79Q
            r4.<init>(r0, r6)
            r7.setOnDismissListener(r4)
            X.18K r9 = r0.A0Y
            if (r9 == 0) goto L_0x0831
            X.6zz r12 = r0.A0c
            if (r12 == 0) goto L_0x08a0
            r4 = 2131431135(0x7f0b0edf, float:1.848399E38)
            android.view.View r11 = X.AnonymousClass3MX.A0C(r1, r4)
            com.whatsapp.gifsearch.GifSearchContainer r11 = (com.whatsapp.gifsearch.GifSearchContainer) r11
            r4 = 2131430335(0x7f0b0bbf, float:1.8482368E38)
            android.view.View r8 = X.AnonymousClass3MX.A0C(r1, r4)
            com.whatsapp.emoji.search.EmojiSearchContainer r8 = (com.whatsapp.emoji.search.EmojiSearchContainer) r8
            X.5z4 r10 = r0.A1F
            if (r10 == 0) goto L_0x082c
            X.1FL r7 = r0.A1D()
            X.3xv r6 = new X.3xv
            r6.<init>((android.app.Activity) r7, (com.whatsapp.emoji.search.EmojiSearchContainer) r8, (X.AnonymousClass18K) r9, (X.C117015z4) r10, (com.whatsapp.gifsearch.GifSearchContainer) r11, (X.C140126zz) r12)
            r0.A0a = r6
            X.7GD r4 = new X.7GD
            r4.<init>(r0, r2)
            r6.A00 = r4
            X.7Hl r2 = new X.7Hl
            r2.<init>(r0, r5)
            r6.A00 = r2
        L_0x07e2:
            r2 = 2131436932(0x7f0b2584, float:1.8495748E38)
            android.view.View r1 = r1.findViewById(r2)
            r0.A03 = r1
            X.0z4 r1 = r0.A0R
            if (r1 == 0) goto L_0x0829
            android.content.SharedPreferences r1 = X.C17890vO.A0B(r1)
            java.lang.String r2 = "show_voice_status_tooltip"
            boolean r1 = r1.getBoolean(r2, r5)
            if (r1 == 0) goto L_0x080e
            boolean r1 = r0.A1H
            if (r1 == 0) goto L_0x080e
            A0F(r0)
            X.0z4 r0 = r0.A0R
            if (r0 == 0) goto L_0x0829
            android.content.SharedPreferences$Editor r0 = X.C19830z4.A00(r0)
            X.C17880vN.A1F(r0, r2, r3)
            return
        L_0x080e:
            android.view.View r2 = r0.A03
            if (r2 == 0) goto L_0x081a
            r1 = 8
            r2.clearAnimation()
            r2.setVisibility(r1)
        L_0x081a:
            X.1KB r1 = r0.A0K
            if (r1 == 0) goto L_0x0824
            java.lang.Runnable r0 = r0.A1L
            r1.A0I(r0)
            return
        L_0x0824:
            X.AnonymousClass3MW.A1C()
            r0 = 0
            throw r0
        L_0x0829:
            java.lang.String r0 = "waSharedPreferences"
            goto L_0x08a2
        L_0x082c:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r20)
            throw r0
        L_0x0831:
            java.lang.String r0 = "wamRuntime"
            goto L_0x08a2
        L_0x0834:
            java.lang.String r0 = "customKeyboardFactory"
            goto L_0x08a2
        L_0x0837:
            java.lang.String r0 = "emojiAndGifPopupWindowBuilder"
            goto L_0x08a2
        L_0x083a:
            java.lang.String r0 = "linkifyWeb"
            goto L_0x08a2
        L_0x083d:
            java.lang.String r0 = "statusLoggingConfig"
            goto L_0x08a2
        L_0x0840:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r20)
            throw r0
        L_0x0845:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r20)
            throw r0
        L_0x084a:
            X.C18070vi.A11(r17)
            goto L_0x089b
        L_0x084e:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r20)
            throw r0
        L_0x0853:
            java.lang.String r0 = "textComposerEntryCallbackFactory"
            goto L_0x08a2
        L_0x0856:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r20)
            throw r0
        L_0x085b:
            java.lang.String r0 = "bottomBarControllerFactory"
            goto L_0x08a2
        L_0x085e:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r20)
            throw r0
        L_0x0863:
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        L_0x0868:
            r0 = move-exception
            X.AnonymousClass12Q.A04()
            X.AnonymousClass114.A02(r6)
            throw r0
        L_0x0870:
            java.lang.String r0 = "defaultRecipientsControllerFactory"
            goto L_0x0875
        L_0x0873:
            java.lang.String r0 = "recipientsControllerFactory"
        L_0x0875:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x087a:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r20)
            throw r0
        L_0x087f:
            java.lang.String r0 = "statusStore"
            goto L_0x08a2
        L_0x0882:
            java.lang.String r0 = "wfalManager"
            goto L_0x08a2
        L_0x0885:
            java.lang.String r0 = "fbAccountManager"
            goto L_0x08a2
        L_0x0888:
            java.lang.String r0 = "crosspostMigrationManager"
            goto L_0x08a2
        L_0x088b:
            java.lang.String r0 = "textComposerExtraTools"
            goto L_0x08a2
        L_0x088e:
            java.lang.String r0 = "voiceRecordingViewControllerFactory"
            goto L_0x08a2
        L_0x0891:
            java.lang.String r0 = "abProps"
            goto L_0x08a2
        L_0x0894:
            X.C18070vi.A11(r22)
            goto L_0x089b
        L_0x0898:
            X.C18070vi.A11(r21)
        L_0x089b:
            r0 = 0
            throw r0
        L_0x089d:
            java.lang.String r0 = "webPagePreviewViewModelFactory"
            goto L_0x08a2
        L_0x08a0:
            java.lang.String r0 = "gifSearchProvider"
        L_0x08a2:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.statuscomposer.composer.TextStatusComposerFragment.A21(android.os.Bundle, android.view.View):void");
    }

    public void BvB() {
    }

    public void C2i(boolean z) {
        String str;
        this.A1A = true;
        C18030ve r2 = this.A0X;
        if (r2 == null) {
            str = "abProps";
        } else if (C18020vd.A05(C18040vf.A02, r2, 6132)) {
            boolean z2 = true;
            this.A1A = z;
            if (this.A0v == AnonymousClass6R1.DISABLED) {
                z2 = false;
            }
            StatusPrivacyBottomSheetDialogFragment A002 = C124126Xd.A00("text_status_composer", z2);
            A002.A08 = this;
            AnonymousClass00H r0 = this.A12;
            if (r0 != null) {
                C108945cZ.A0u(r0).A04(A002.A15(), (AnonymousClass77K) this.A1J.A06());
                C108985cd.A0M(this).CMl(A002);
                Dialog dialog = A002.A03;
                if (dialog != null) {
                    C17960vV.A07(dialog);
                    dialog.setOnDismissListener(new AnonymousClass759(this, 9));
                    return;
                }
                return;
            }
            str = "statusAudienceRepository";
        } else {
            A0g(z);
            return;
        }
        C18070vi.A11(str);
        throw null;
    }

    public void C6d(int i) {
        A05(i, true);
        int A0D2 = C72453Mb.A0D(this.A04);
        CreationModeBottomBar creationModeBottomBar = this.A1G;
        if (creationModeBottomBar != null) {
            creationModeBottomBar.setVisibility(A0D2);
        }
        StatusEditText statusEditText = this.A0l;
        if (statusEditText == null) {
            C18070vi.A11("entry");
            throw null;
        } else {
            statusEditText.clearFocus();
        }
    }

    public void C6f(int i) {
        A05(i, false);
    }

    public void C6j(AnonymousClass77K r3) {
        A06(r3, false);
        boolean z = this.A1A;
        A02();
        if (!z) {
            A0D(this);
            if (this.A0B == null) {
                C18070vi.A11("textComposerExtraTools");
                throw null;
            } else if (A0h()) {
                A0C(this);
            } else {
                A0E(this);
            }
        }
        this.A1A = false;
    }

    public void onConfigurationChanged(Configuration configuration) {
        C18070vi.A0d(configuration, 0);
        super.onConfigurationChanged(configuration);
        DisplayMetrics displayMetrics = AnonymousClass3MZ.A09(this).getDisplayMetrics();
        C18070vi.A0X(displayMetrics);
        this.A02 = displayMetrics;
        A04();
        Number A1C2 = C108945cZ.A1C(this.A0A);
        StatusEditText statusEditText = this.A0l;
        if (statusEditText == null) {
            C18070vi.A11("entry");
            throw null;
        }
        if (!(statusEditText.getText() == null || A1C2 == null)) {
            A0d(this, A1C2.intValue());
        }
        if (A0i(this)) {
            C108975cc.A0G(this).A00 = C109005cf.A03(this);
            C108975cc.A0G(this).A0Q(true);
        }
        A03();
    }

    private final void A01() {
        if (this.A1E == null) {
            GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
            int[] A1W = C108945cZ.A1W();
            A1W[0] = (this.A00 & 16777215) | -436207616;
            A1W[1] = 0;
            GradientDrawable gradientDrawable = new GradientDrawable(orientation, A1W);
            gradientDrawable.setCornerRadius(0.0f);
            ViewGroup viewGroup = this.A04;
            if (viewGroup != null) {
                viewGroup.setBackground(gradientDrawable);
            }
        }
    }

    private final void A02() {
        if (this.A0n != null) {
            ArrayList A132 = AnonymousClass000.A13();
            A132.add(C29671cg.A00.getRawString());
            Intent A0A2 = C17880vN.A0A();
            A0A2.putExtra("jids", A132);
            AnonymousClass7J1 r0 = this.A0n;
            if (r0 != null) {
                r0.A02(A0A2);
            }
        }
    }

    private final void A04() {
        int i;
        DisplayMetrics displayMetrics = this.A02;
        ViewGroup.LayoutParams layoutParams = null;
        if (displayMetrics == null) {
            C18070vi.A11("displayMetrics");
        } else {
            float f = ((float) displayMetrics.widthPixels) / displayMetrics.density;
            ViewGroup viewGroup = this.A05;
            if (viewGroup != null) {
                layoutParams = viewGroup.getLayoutParams();
            }
            C18070vi.A0z(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            StatusEditText statusEditText = this.A0l;
            if (statusEditText != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) C108965cb.A0A(statusEditText);
                if (f > 360.0f) {
                    i = this.A1B;
                } else {
                    i = this.A1C;
                }
                int i2 = this.A1D;
                marginLayoutParams.setMargins(i, i2, i, i2);
                marginLayoutParams2.setMargins(i, this.A1D, i, 0);
                ViewGroup viewGroup2 = this.A05;
                if (viewGroup2 != null) {
                    viewGroup2.requestLayout();
                }
                StatusEditText statusEditText2 = this.A0l;
                if (statusEditText2 != null) {
                    statusEditText2.requestLayout();
                    return;
                }
            }
            C18070vi.A11("entry");
        }
        throw null;
    }

    private final void A05(int i, boolean z) {
        CoordinatorLayout coordinatorLayout = this.A09;
        if (coordinatorLayout != null) {
            float bottom = (float) coordinatorLayout.getBottom();
            float f = 1.0f - ((bottom - ((float) i)) / bottom);
            if (f > 1.0f) {
                f = 1.0f;
            }
            CoordinatorLayout coordinatorLayout2 = this.A09;
            if (coordinatorLayout2 != null) {
                coordinatorLayout2.setPivotY(0.0f);
                coordinatorLayout2.setPivotX(C108945cZ.A02(coordinatorLayout2.getWidth()));
            }
            CoordinatorLayout coordinatorLayout3 = this.A09;
            if (z) {
                if (coordinatorLayout3 != null) {
                    coordinatorLayout3.animate().scaleX(f).scaleY(f).setDuration(200);
                    return;
                }
                throw AnonymousClass000.A0n("Required value was null.");
            } else if (coordinatorLayout3 != null) {
                coordinatorLayout3.setScaleX(f);
                coordinatorLayout3.setScaleY(f);
            } else {
                throw AnonymousClass000.A0n("Required value was null.");
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001b, code lost:
        if (r17 != false) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A06(X.AnonymousClass77K r16, boolean r17) {
        /*
            r15 = this;
            X.1DT r0 = r15.A1J
            r3 = r16
            r0.A0F(r3)
            boolean r0 = r15.A1A
            r10 = 0
            if (r0 != 0) goto L_0x001d
            X.0ve r2 = r15.A0X
            if (r2 == 0) goto L_0x0050
            X.0vf r1 = X.C18040vf.A01
            r0 = 2531(0x9e3, float:3.547E-42)
            boolean r0 = X.C18020vd.A05(r1, r2, r0)
            if (r0 == 0) goto L_0x001d
            r6 = 0
            if (r17 == 0) goto L_0x001e
        L_0x001d:
            r6 = -1
        L_0x001e:
            int r5 = r3.A00
            if (r5 != 0) goto L_0x0040
            r4 = 0
        L_0x0023:
            X.10I r1 = r15.A0t
            if (r1 == 0) goto L_0x004d
            X.2hR r2 = r15.A0F
            if (r2 == 0) goto L_0x0053
            X.1FU r3 = X.C108985cd.A0M(r15)
            r8 = 0
            r7 = 2131896392(0x7f122848, float:1.9427644E38)
            r12 = r10
            r13 = r10
            r14 = r10
            r11 = r10
            X.6M9 r0 = r2.A00(r3, r4, r5, r6, r7, r8, r10, r11, r12, r13, r14)
            X.AnonymousClass3MW.A1T(r0, r1, r10)
            return
        L_0x0040:
            r0 = 1
            if (r5 != r0) goto L_0x004a
            java.util.List r0 = r3.A01
        L_0x0045:
            java.util.ArrayList r4 = X.C17880vN.A10(r0)
            goto L_0x0023
        L_0x004a:
            java.util.List r0 = r3.A02
            goto L_0x0045
        L_0x004d:
            java.lang.String r0 = "waWorkers"
            goto L_0x0055
        L_0x0050:
            java.lang.String r0 = "abProps"
            goto L_0x0055
        L_0x0053:
            java.lang.String r0 = "statusAudienceFactory"
        L_0x0055:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.statuscomposer.composer.TextStatusComposerFragment.A06(X.77K, boolean):void");
    }

    public static final void A08(TextStatusComposerFragment textStatusComposerFragment) {
        if (textStatusComposerFragment.A0s != null) {
            StatusEditText statusEditText = textStatusComposerFragment.A0l;
            if (statusEditText != null) {
                if (AnonymousClass1L4.A00(statusEditText)) {
                    AnonymousClass1L4 r1 = textStatusComposerFragment.A0s;
                    if (r1 != null) {
                        StatusEditText statusEditText2 = textStatusComposerFragment.A0l;
                        if (statusEditText2 != null) {
                            r1.A01(statusEditText2);
                            return;
                        }
                    }
                } else {
                    return;
                }
            }
            C18070vi.A11("entry");
            throw null;
        }
        C18070vi.A11("imeUtils");
        throw null;
    }

    public static final void A09(TextStatusComposerFragment textStatusComposerFragment) {
        float f;
        ViewGroup viewGroup = textStatusComposerFragment.A05;
        if (viewGroup != null && viewGroup.getVisibility() == 0) {
            ViewGroup viewGroup2 = textStatusComposerFragment.A05;
            if (viewGroup2 != null) {
                f = C108945cZ.A04(viewGroup2);
            } else {
                f = 0.0f;
            }
            A0J(textStatusComposerFragment, 0.0f, f, 8);
        }
    }

    public static final void A0A(TextStatusComposerFragment textStatusComposerFragment) {
        if (textStatusComposerFragment.A0p != null && textStatusComposerFragment.A0q != null) {
            C29191bl.A01((ViewGroup) textStatusComposerFragment.A0B);
            ViewGroup A0H2 = C108955ca.A0H(textStatusComposerFragment.A17());
            VoiceRecordingView voiceRecordingView = textStatusComposerFragment.A0p;
            if (voiceRecordingView != null) {
                StatusEditText statusEditText = textStatusComposerFragment.A0l;
                if (statusEditText != null) {
                    C29071bZ r3 = new C29071bZ(3);
                    r3.A0E(statusEditText);
                    r3.A0E(voiceRecordingView);
                    r3.A01 = 0;
                    BMV bmv = new BMV();
                    bmv.A0E(voiceRecordingView);
                    bmv.A01 = 0;
                    C29051bX r2 = new C29051bX();
                    r2.A03 = true;
                    r2.A0a(r3);
                    r2.A0a(bmv);
                    r2.A0X(new DecelerateInterpolator());
                    r2.A0W(300);
                    C29191bl.A02(A0H2, r2);
                    C29191bl.A01(textStatusComposerFragment.A04);
                    ViewGroup viewGroup = textStatusComposerFragment.A04;
                    if (viewGroup != null) {
                        ImageButton imageButton = textStatusComposerFragment.A06;
                        if (imageButton != null) {
                            TextView textView = textStatusComposerFragment.A08;
                            if (textView != null) {
                                C29071bZ r22 = new C29071bZ(1);
                                r22.A0E(imageButton);
                                r22.A0E(textView);
                                r22.A01 = 0;
                                r22.A0C(300);
                                r22.A0D(new DecelerateInterpolator());
                                C29191bl.A02(viewGroup, r22);
                            }
                            C18070vi.A11("fontButton");
                            throw null;
                        }
                        C18070vi.A11("emojiButton");
                        throw null;
                    }
                    StatusEditText statusEditText2 = textStatusComposerFragment.A0l;
                    if (statusEditText2 != null) {
                        statusEditText2.setVisibility(0);
                        VoiceRecordingView voiceRecordingView2 = textStatusComposerFragment.A0p;
                        if (voiceRecordingView2 != null) {
                            voiceRecordingView2.setScaleX(0.0f);
                        }
                        VoiceRecordingView voiceRecordingView3 = textStatusComposerFragment.A0p;
                        if (voiceRecordingView3 != null) {
                            voiceRecordingView3.setScaleY(0.0f);
                        }
                        C108975cc.A0r(textStatusComposerFragment.A0p);
                        if (!C18020vd.A05(C18040vf.A02, C108955ca.A0R(textStatusComposerFragment.A27()), 7558)) {
                            ImageButton imageButton2 = textStatusComposerFragment.A06;
                            if (imageButton2 != null) {
                                imageButton2.setVisibility(0);
                            }
                            C18070vi.A11("emojiButton");
                            throw null;
                        }
                        TextView textView2 = textStatusComposerFragment.A08;
                        if (textView2 != null) {
                            textView2.setVisibility(0);
                            return;
                        }
                        C18070vi.A11("fontButton");
                        throw null;
                    }
                }
                C18070vi.A11("entry");
                throw null;
            }
            throw C17880vN.A0g();
        }
    }

    public static final void A0B(TextStatusComposerFragment textStatusComposerFragment) {
        int i = textStatusComposerFragment.A00;
        int[] iArr = AnonymousClass74F.A01;
        int i2 = 0;
        while (true) {
            if (iArr[i2] != i) {
                i2++;
                if (i2 >= 21) {
                    i2 = -1;
                    break;
                }
            } else {
                break;
            }
        }
        textStatusComposerFragment.A00 = iArr[(i2 + 1) % 21];
        textStatusComposerFragment.A01();
        A0G(textStatusComposerFragment);
    }

    /* JADX WARNING: type inference failed for: r7v1, types: [java.lang.Object, com.whatsapp.TextData] */
    public static final void A0C(TextStatusComposerFragment textStatusComposerFragment) {
        List singletonList;
        String str;
        String str2;
        AnonymousClass7PD r5;
        AnonymousClass10I r7;
        Runnable r6;
        TextStatusComposerFragment textStatusComposerFragment2 = textStatusComposerFragment;
        AnonymousClass7J1 r0 = textStatusComposerFragment2.A0n;
        if (r0 != null) {
            singletonList = Collections.unmodifiableList(r0.A0A);
        } else {
            singletonList = Collections.singletonList(C29671cg.A00);
        }
        C18070vi.A0X(singletonList);
        StatusEditText statusEditText = textStatusComposerFragment2.A0l;
        String str3 = "entry";
        if (statusEditText != null) {
            if (statusEditText.getText() != null) {
                StatusEditText statusEditText2 = textStatusComposerFragment2.A0l;
                if (statusEditText2 != null) {
                    String A172 = AnonymousClass3MZ.A17(statusEditText2);
                    int length = A172.length() - 1;
                    int i = 0;
                    boolean z = false;
                    while (i <= length) {
                        int i2 = length;
                        if (!z) {
                            i2 = i;
                        }
                        boolean A0u2 = C109005cf.A0u(A172, i2);
                        if (z) {
                            if (!A0u2) {
                                break;
                            }
                            length--;
                        } else if (!A0u2) {
                            z = true;
                        } else {
                            i++;
                        }
                    }
                    str = C108985cd.A0g(length, i, A172);
                }
            } else {
                str = "";
            }
            if (textStatusComposerFragment2.A0B != null) {
                AnonymousClass11C r1 = textStatusComposerFragment2.A0P;
                if (r1 != null) {
                    C18010vc r02 = textStatusComposerFragment2.A0j;
                    if (r02 == null) {
                        str2 = "sharedPreferencesFactory";
                    } else if (!C26302CxJ.A0V(r1, r02, str)) {
                        AnonymousClass1KB r12 = textStatusComposerFragment2.A0K;
                        if (r12 != null) {
                            r12.A08(2131887925, 1);
                            return;
                        } else {
                            AnonymousClass3MW.A1C();
                            throw null;
                        }
                    } else if (!textStatusComposerFragment2.A0k(singletonList)) {
                        AnonymousClass7J1 r52 = textStatusComposerFragment2.A0n;
                        if (r52 != null) {
                            C131706lX r2 = r52.A07;
                            if (r2.A00 == AnonymousClass00R.A0C) {
                                r2.A00();
                                ImageButton imageButton = ((CreationModeBottomBar) r52.A0J).A04;
                                if (imageButton == null) {
                                    str2 = "sendButton";
                                } else {
                                    imageButton.setEnabled(false);
                                }
                            }
                        }
                        C32011gU r03 = textStatusComposerFragment2.A0f;
                        if (r03 != null) {
                            boolean A092 = AnonymousClass74F.A09(textStatusComposerFragment2.A0N, AnonymousClass74F.A02(r03, str));
                            C692236j r22 = new C692236j();
                            r22.A00((AnonymousClass77K) textStatusComposerFragment2.A1J.A06());
                            C33251iW r9 = textStatusComposerFragment2.A0M;
                            if (r9 != null) {
                                AnonymousClass3TA r14 = textStatusComposerFragment2.A0O;
                                str3 = "webPagePreviewViewModel";
                                if (r14 != null) {
                                    int i3 = textStatusComposerFragment2.A00;
                                    int i4 = textStatusComposerFragment2.A01;
                                    C143887Fe r10 = textStatusComposerFragment2.A0N;
                                    Intent A0B2 = C108955ca.A0B(textStatusComposerFragment2);
                                    C18070vi.A0X(A0B2);
                                    int intExtra = A0B2.getIntExtra("entry_point", 0);
                                    ? obj = new Object();
                                    obj.backgroundColor = i3;
                                    obj.textColor = -1;
                                    obj.fontStyle = i4;
                                    C693536w r04 = r14.A05;
                                    C129496ht r13 = new C129496ht(r10);
                                    r13.A00 = r04;
                                    r13.A02 = A092;
                                    r13.A01 = true;
                                    if (r13.A03 == null) {
                                        new C21320Ai5
                                        /*  JADX ERROR: Method code generation error
                                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00fb: CONSTRUCTOR  (r5v5 ? I:X.Ai5) =  call: X.Ai5.<init>():void type: CONSTRUCTOR in method: com.whatsapp.statuscomposer.composer.TextStatusComposerFragment.A0C(com.whatsapp.statuscomposer.composer.TextStatusComposerFragment):void, dex: classes4.dex
                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                            	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                                            	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                                            	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                            	at java.util.ArrayList.forEach(ArrayList.java:1259)
                                            	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                            	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                            	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                                            	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                                            	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                                            	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                                            	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                                            	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                                            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                                            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                                            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                                            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                                            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                                            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                                            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                                            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r5v5 ?
                                            	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:189)
                                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:620)
                                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                                            	... 73 more
                                            */
                                        /*
                                            r3 = r29
                                            X.7J1 r0 = r3.A0n
                                            if (r0 == 0) goto L_0x0043
                                            java.util.List r0 = r0.A0A
                                            java.util.List r4 = java.util.Collections.unmodifiableList(r0)
                                        L_0x000c:
                                            X.C18070vi.A0X(r4)
                                            com.whatsapp.status.widget.StatusEditText r0 = r3.A0l
                                            java.lang.String r15 = "entry"
                                            if (r0 == 0) goto L_0x026f
                                            android.text.Editable r0 = r0.getText()
                                            r7 = 1
                                            if (r0 == 0) goto L_0x004a
                                            com.whatsapp.status.widget.StatusEditText r0 = r3.A0l
                                            if (r0 == 0) goto L_0x026f
                                            java.lang.String r6 = X.AnonymousClass3MZ.A17(r0)
                                            int r5 = r6.length()
                                            int r5 = r5 - r7
                                            r2 = 0
                                            r1 = 0
                                        L_0x002b:
                                            if (r2 > r5) goto L_0x004d
                                            r0 = r5
                                            if (r1 != 0) goto L_0x0031
                                            r0 = r2
                                        L_0x0031:
                                            boolean r0 = X.C109005cf.A0u(r6, r0)
                                            if (r1 != 0) goto L_0x003e
                                            if (r0 != 0) goto L_0x003b
                                            r1 = 1
                                            goto L_0x002b
                                        L_0x003b:
                                            int r2 = r2 + 1
                                            goto L_0x002b
                                        L_0x003e:
                                            if (r0 == 0) goto L_0x004d
                                            int r5 = r5 + -1
                                            goto L_0x002b
                                        L_0x0043:
                                            X.1cg r0 = X.C29671cg.A00
                                            java.util.List r4 = java.util.Collections.singletonList(r0)
                                            goto L_0x000c
                                        L_0x004a:
                                            java.lang.String r6 = ""
                                            goto L_0x0051
                                        L_0x004d:
                                            java.lang.String r6 = X.C108985cd.A0g(r5, r2, r6)
                                        L_0x0051:
                                            X.0zA r0 = r3.A0B
                                            if (r0 == 0) goto L_0x0074
                                            X.11C r1 = r3.A0P
                                            if (r1 == 0) goto L_0x0071
                                            X.0vc r0 = r3.A0j
                                            if (r0 == 0) goto L_0x006e
                                            boolean r0 = X.C26302CxJ.A0V(r1, r0, r6)
                                            if (r0 != 0) goto L_0x0077
                                            X.1KB r1 = r3.A0K
                                            if (r1 == 0) goto L_0x0265
                                            r0 = 2131887925(0x7f120735, float:1.941047E38)
                                            r1.A08(r0, r7)
                                        L_0x006d:
                                            return
                                        L_0x006e:
                                            java.lang.String r0 = "sharedPreferencesFactory"
                                            goto L_0x0096
                                        L_0x0071:
                                            java.lang.String r0 = "systemServices"
                                            goto L_0x0096
                                        L_0x0074:
                                            java.lang.String r0 = "textComposerExtraTools"
                                            goto L_0x0096
                                        L_0x0077:
                                            boolean r0 = r3.A0k(r4)
                                            if (r0 != 0) goto L_0x006d
                                            X.7J1 r5 = r3.A0n
                                            if (r5 == 0) goto L_0x009f
                                            X.6lX r2 = r5.A07
                                            java.lang.Integer r1 = r2.A00
                                            java.lang.Integer r0 = X.AnonymousClass00R.A0C
                                            if (r1 != r0) goto L_0x009f
                                            r2.A00()
                                            X.8AJ r0 = r5.A0J
                                            com.whatsapp.textstatuscomposer.bottombar.CreationModeBottomBar r0 = (com.whatsapp.textstatuscomposer.bottombar.CreationModeBottomBar) r0
                                            android.widget.ImageButton r1 = r0.A04
                                            if (r1 != 0) goto L_0x009b
                                            java.lang.String r0 = "sendButton"
                                        L_0x0096:
                                            X.C18070vi.A11(r0)
                                            goto L_0x0272
                                        L_0x009b:
                                            r0 = 0
                                            r1.setEnabled(r0)
                                        L_0x009f:
                                            X.1gU r0 = r3.A0f
                                            if (r0 == 0) goto L_0x0261
                                            int r1 = X.AnonymousClass74F.A02(r0, r6)
                                            X.7Fe r0 = r3.A0N
                                            boolean r12 = X.AnonymousClass74F.A09(r0, r1)
                                            X.36j r2 = new X.36j
                                            r2.<init>()
                                            X.1DT r0 = r3.A1J
                                            java.lang.Object r0 = r0.A06()
                                            X.77K r0 = (X.AnonymousClass77K) r0
                                            r2.A00(r0)
                                            X.1iW r9 = r3.A0M
                                            if (r9 == 0) goto L_0x025d
                                            X.3TA r14 = r3.A0O
                                            java.lang.String r15 = "webPagePreviewViewModel"
                                            if (r14 == 0) goto L_0x026f
                                            int r13 = r3.A00
                                            int r11 = r3.A01
                                            X.7Fe r10 = r3.A0N
                                            android.content.Intent r5 = X.C108955ca.A0B(r3)
                                            X.C18070vi.A0X(r5)
                                            java.lang.String r1 = "entry_point"
                                            r0 = 0
                                            int r8 = r5.getIntExtra(r1, r0)
                                            r0 = -1
                                            com.whatsapp.TextData r7 = new com.whatsapp.TextData
                                            r7.<init>()
                                            r7.backgroundColor = r13
                                            r7.textColor = r0
                                            r7.fontStyle = r11
                                            X.36w r0 = r14.A05
                                            X.6ht r1 = new X.6ht
                                            r1.<init>(r10)
                                            r1.A00 = r0
                                            r1.A02 = r12
                                            r0 = 1
                                            r1.A01 = r0
                                            X.7Fe r0 = r1.A03
                                            if (r0 != 0) goto L_0x01a8
                                            X.Ai5 r5 = new X.Ai5
                                            r5.<init>()
                                        L_0x00fe:
                                            X.1hN r1 = r9.A12
                                            X.1cg r17 = X.C29671cg.A00
                                            java.lang.String r20 = X.AnonymousClass74F.A07(r6)
                                            X.11P r0 = r9.A0K
                                            long r22 = X.AnonymousClass11P.A01(r0)
                                            r14 = 0
                                            r21 = r14
                                            r18 = r14
                                            r19 = r5
                                            r16 = r1
                                            X.210 r5 = r16.A00(r17, r18, r19, r20, r21, r22)
                                            r9.A0b(r5)
                                            r5.A18(r7)
                                            r5.A09 = r8
                                            X.C63672tV.A03(r5, r2)
                                            X.1iW r12 = r3.A0M
                                            if (r12 == 0) goto L_0x0269
                                            X.3TA r1 = r3.A0O
                                            if (r1 == 0) goto L_0x026f
                                            X.7Fe r13 = r3.A0N
                                            boolean r7 = r3.A1A
                                            java.util.List r0 = X.C18070vi.A0M(r17)
                                            boolean r0 = r4.equals(r0)
                                            r8 = r0 ^ 1
                                            X.1BI r0 = X.C22971Dz.A01(r4)
                                            if (r0 == 0) goto L_0x0180
                                            X.C33251iW.A0A(r12, r5)
                                            X.3M1 r9 = r1.A0o
                                            boolean r0 = r9.CLo()
                                            if (r0 == 0) goto L_0x019c
                                            X.C33251iW.A0A(r12, r5)
                                            X.122 r10 = r12.A0U
                                            r0 = 1
                                            r10.BBN(r5, r0)
                                            X.1hg r0 = r12.A16
                                            r0.A04 = r7
                                            r0.A05 = r8
                                            r9.ByS(r5)
                                            long r10 = r9.BaQ()
                                            r7 = 0
                                            int r0 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
                                            if (r0 <= 0) goto L_0x0180
                                            X.1KB r8 = r12.A03
                                            r20 = 27
                                            X.Aix r7 = new X.Aix
                                            r15 = r7
                                            r16 = r12
                                            r17 = r5
                                            r18 = r1
                                            r19 = r9
                                            r15.<init>(r16, r17, r18, r19, r20)
                                            long r0 = r9.BaQ()
                                            r8.A0K(r7, r0)
                                        L_0x0180:
                                            java.util.ArrayList r8 = X.AnonymousClass000.A13()
                                            java.util.Iterator r7 = r4.iterator()
                                        L_0x0188:
                                            boolean r0 = r7.hasNext()
                                            if (r0 == 0) goto L_0x01af
                                            com.whatsapp.jid.Jid r1 = X.C17880vN.A0S(r7)
                                            boolean r0 = X.C22971Dz.A0a(r1)
                                            if (r0 != 0) goto L_0x0188
                                            r8.add(r1)
                                            goto L_0x0188
                                        L_0x019c:
                                            X.122 r0 = r12.A0U
                                            r0.BBM(r5)
                                            X.1hg r0 = r12.A16
                                            r0.A04 = r7
                                            r0.A05 = r8
                                            goto L_0x0180
                                        L_0x01a8:
                                            X.7PD r5 = new X.7PD
                                            r5.<init>(r1)
                                            goto L_0x00fe
                                        L_0x01af:
                                            int r0 = r8.size()
                                            if (r0 <= 0) goto L_0x01d3
                                            r26 = 0
                                            r16 = r14
                                            r17 = r14
                                            r18 = r14
                                            r19 = r14
                                            r22 = r14
                                            r25 = r14
                                            r28 = r26
                                            r29 = r26
                                            r15 = r14
                                            r23 = r6
                                            r24 = r8
                                            r27 = r26
                                            r20 = r2
                                            r12.A0J(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
                                        L_0x01d3:
                                            X.6R1 r0 = r3.A0v
                                            if (r0 == 0) goto L_0x022b
                                            int r1 = r0.ordinal()
                                            r0 = 1
                                            if (r1 == r0) goto L_0x022f
                                            r0 = 2
                                            if (r1 == r0) goto L_0x022f
                                            r0 = 3
                                            if (r1 != r0) goto L_0x022b
                                            boolean r0 = X.C1402870s.A00(r5)
                                            if (r0 == 0) goto L_0x022b
                                            X.77K r6 = X.C63672tV.A00(r5)
                                            X.DcQ r2 = X.AnonymousClass1ZT.A01()
                                            r1 = 1
                                            if (r6 == 0) goto L_0x0207
                                            boolean r0 = r6.A05
                                            if (r0 != r1) goto L_0x01fe
                                            X.6Re r0 = X.C122646Re.FACEBOOK
                                            r2.add(r0)
                                        L_0x01fe:
                                            boolean r0 = r6.A06
                                            if (r0 != r1) goto L_0x0207
                                            X.6Re r0 = X.C122646Re.INSTAGRAM
                                            r2.add(r0)
                                        L_0x0207:
                                            X.DcQ r0 = X.AnonymousClass1ZT.A02(r2)
                                            boolean r0 = X.C17880vN.A1X(r0)
                                            if (r0 == 0) goto L_0x022b
                                            X.00H r0 = r3.A0y
                                            if (r0 == 0) goto L_0x0255
                                            java.lang.Object r2 = r0.get()
                                            X.1x5 r2 = (X.C41801x5) r2
                                            android.content.Context r1 = r3.A14()
                                            X.10I r7 = r2.A01
                                            r0 = 45
                                            X.7RO r6 = new X.7RO
                                            r6.<init>(r2, r1, r5, r0)
                                        L_0x0228:
                                            r7.CGF(r6)
                                        L_0x022b:
                                            r3.A0f(r4)
                                            return
                                        L_0x022f:
                                            X.77K r0 = X.C63672tV.A00(r5)
                                            if (r0 == 0) goto L_0x022b
                                            boolean r1 = r0.A05
                                            r0 = 1
                                            if (r1 != r0) goto L_0x022b
                                            boolean r0 = X.AnonymousClass74B.A07(r5)
                                            if (r0 == 0) goto L_0x022b
                                            X.00H r0 = r3.A16
                                            if (r0 == 0) goto L_0x0259
                                            X.1x7 r2 = X.C108945cZ.A12(r0)
                                            android.content.Context r1 = r3.A14()
                                            X.10I r7 = r2.A01
                                            r0 = 3
                                            X.7Qw r6 = new X.7Qw
                                            r6.<init>(r2, r1, r5, r0)
                                            goto L_0x0228
                                        L_0x0255:
                                            java.lang.String r0 = "crosspostManager"
                                            goto L_0x0096
                                        L_0x0259:
                                            java.lang.String r0 = "xFamilyCrosspostManager"
                                            goto L_0x0096
                                        L_0x025d:
                                            java.lang.String r0 = "userActions"
                                            goto L_0x0096
                                        L_0x0261:
                                            java.lang.String r0 = "linkifyWeb"
                                            goto L_0x0096
                                        L_0x0265:
                                            X.AnonymousClass3MW.A1C()
                                            goto L_0x0272
                                        L_0x0269:
                                            java.lang.String r0 = "userActions"
                                            X.C18070vi.A11(r0)
                                            throw r14
                                        L_0x026f:
                                            X.C18070vi.A11(r15)
                                        L_0x0272:
                                            r0 = 0
                                            throw r0
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.statuscomposer.composer.TextStatusComposerFragment.A0C(com.whatsapp.statuscomposer.composer.TextStatusComposerFragment):void");
                                    }

                                    public static final void A0E(TextStatusComposerFragment textStatusComposerFragment) {
                                        File file;
                                        List singletonList;
                                        byte[] bArr;
                                        TextStatusComposerFragment textStatusComposerFragment2 = textStatusComposerFragment;
                                        C145827Mt r1 = textStatusComposerFragment2.A0q;
                                        if (r1 != null && textStatusComposerFragment2.A0p != null && (file = r1.A08) != null) {
                                            C145847Mv r0 = r1.A07;
                                            if (r0 != null) {
                                                C145847Mv.A01(r0);
                                            }
                                            AnonymousClass7J1 r02 = textStatusComposerFragment2.A0n;
                                            if (r02 != null) {
                                                singletonList = Collections.unmodifiableList(r02.A0A);
                                            } else {
                                                singletonList = Collections.singletonList(C29671cg.A00);
                                            }
                                            C18070vi.A0X(singletonList);
                                            C692236j r03 = new C692236j();
                                            r03.A00((AnonymousClass77K) textStatusComposerFragment2.A1J.A06());
                                            if (!textStatusComposerFragment2.A0k(singletonList)) {
                                                AnonymousClass7J1 r7 = textStatusComposerFragment2.A0n;
                                                if (r7 != null) {
                                                    C131706lX r5 = r7.A07;
                                                    if (r5.A00 == AnonymousClass00R.A0N) {
                                                        r5.A00();
                                                        ImageButton imageButton = ((CreationModeBottomBar) r7.A0J).A04;
                                                        if (imageButton == null) {
                                                            C18070vi.A11("sendButton");
                                                            throw null;
                                                        }
                                                        imageButton.setEnabled(false);
                                                    }
                                                }
                                                C145827Mt r3 = textStatusComposerFragment2.A0q;
                                                if (r3 != null) {
                                                    bArr = r3.A0B;
                                                } else {
                                                    bArr = null;
                                                }
                                                int i = textStatusComposerFragment2.A00;
                                                C24127Bvt bvt = C24127Bvt.A00;
                                                C24100BvS bvS = C24100BvS.A00;
                                                AnonymousClass7LG r13 = new AnonymousClass7LG(bvS, bvS, bvt, (String) null, bArr, i, 0, false);
                                                C33251iW r52 = textStatusComposerFragment2.A0M;
                                                if (r52 != null) {
                                                    boolean z = textStatusComposerFragment2.A1A;
                                                    boolean z2 = !singletonList.equals(C18070vi.A0M(C29671cg.A00));
                                                    C62572rc r15 = new C62572rc();
                                                    r15.A0G = file;
                                                    int A032 = C26511Sk.A03(file);
                                                    ArrayList A132 = AnonymousClass000.A13();
                                                    Iterator it = singletonList.iterator();
                                                    while (it.hasNext()) {
                                                        AnonymousClass1BI A0Q2 = C17880vN.A0Q(it);
                                                        C441822l A002 = r52.A0y.A00(r15, A0Q2, (AnonymousClass206) null, file.getName(), AnonymousClass11P.A01(r52.A0K), file.length(), false);
                                                        A002.A0D = A032;
                                                        A002.A1H(r13);
                                                        if (C22971Dz.A0a(A0Q2)) {
                                                            r03.A03.getClass();
                                                            C63672tV.A03(A002, r03);
                                                        }
                                                        A132.add(A002);
                                                    }
                                                    r52.A0n(new C63642tS(A132), (byte[]) null, z, z2);
                                                    textStatusComposerFragment2.A0f(singletonList);
                                                    return;
                                                }
                                                C18070vi.A11("userActions");
                                                throw null;
                                            }
                                        }
                                    }

                                    public static final void A0F(TextStatusComposerFragment textStatusComposerFragment) {
                                        ViewPropertyAnimator animate;
                                        ViewPropertyAnimator alpha;
                                        ViewPropertyAnimator duration;
                                        View view = textStatusComposerFragment.A03;
                                        if (view != null) {
                                            view.setVisibility(0);
                                            View view2 = textStatusComposerFragment.A03;
                                            if (view2 != null) {
                                                view2.setAlpha(0.0f);
                                            }
                                            View view3 = textStatusComposerFragment.A03;
                                            if (!(view3 == null || (animate = view3.animate()) == null || (alpha = animate.alpha(1.0f)) == null || (duration = alpha.setDuration(320)) == null)) {
                                                duration.start();
                                            }
                                            AnonymousClass1KB r0 = textStatusComposerFragment.A0K;
                                            if (r0 != null) {
                                                Runnable runnable = textStatusComposerFragment.A1L;
                                                r0.A0I(runnable);
                                                AnonymousClass1KB r2 = textStatusComposerFragment.A0K;
                                                if (r2 != null) {
                                                    r2.A0K(runnable, 3500);
                                                } else {
                                                    AnonymousClass3MW.A1C();
                                                    throw null;
                                                }
                                            } else {
                                                AnonymousClass3MW.A1C();
                                                throw null;
                                            }
                                        }
                                    }

                                    public static final void A0G(TextStatusComposerFragment textStatusComposerFragment) {
                                        Window window;
                                        View view = textStatusComposerFragment.A1E;
                                        if (view != null) {
                                            view.setBackgroundColor(textStatusComposerFragment.A00);
                                            AnonymousClass1FL A1B2 = textStatusComposerFragment.A1B();
                                            if (!(A1B2 == null || (window = A1B2.getWindow()) == null)) {
                                                AnonymousClass3Ma.A1H(window, -16777216);
                                            }
                                        } else {
                                            if (C108975cc.A1H(textStatusComposerFragment.A27())) {
                                                CoordinatorLayout coordinatorLayout = textStatusComposerFragment.A09;
                                                if (coordinatorLayout != null) {
                                                    coordinatorLayout.setBackgroundColor(textStatusComposerFragment.A00);
                                                }
                                                AnonymousClass3Ma.A1H(C108965cb.A0B(textStatusComposerFragment), -16777216);
                                            } else {
                                                AnonymousClass3Ma.A1H(C108965cb.A0B(textStatusComposerFragment), textStatusComposerFragment.A00);
                                            }
                                            textStatusComposerFragment.A01();
                                        }
                                        VoiceRecordingView voiceRecordingView = textStatusComposerFragment.A0p;
                                        if (voiceRecordingView != null) {
                                            voiceRecordingView.setBackgroundTint(AnonymousClass1Z2.A03(0.2f, textStatusComposerFragment.A00, -16777216));
                                        }
                                    }

                                    public static final void A0J(TextStatusComposerFragment textStatusComposerFragment, float f, float f2, int i) {
                                        ViewPropertyAnimator animate;
                                        ViewPropertyAnimator translationY;
                                        ViewPropertyAnimator alpha;
                                        ViewPropertyAnimator duration;
                                        ViewGroup viewGroup = textStatusComposerFragment.A05;
                                        if (viewGroup != null && (animate = viewGroup.animate()) != null && (translationY = animate.translationY(f2)) != null && (alpha = translationY.alpha(f)) != null && (duration = alpha.setDuration(200)) != null) {
                                            duration.setListener(new C109045cj(textStatusComposerFragment, i, 2));
                                        }
                                    }

                                    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01c1, code lost:
                                        if (r2.A0J == null) goto L_0x01c3;
                                     */
                                    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01c4, code lost:
                                        if (r2 != null) goto L_0x01c6;
                                     */
                                    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01c6, code lost:
                                        r0 = r2.A05;
                                     */
                                    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01c8, code lost:
                                        if (r0 == null) goto L_0x01e4;
                                     */
                                    /* JADX WARNING: Code restructure failed: missing block: B:108:0x01cc, code lost:
                                        if (r0.A00 <= 0) goto L_0x01e4;
                                     */
                                    /* JADX WARNING: Code restructure failed: missing block: B:109:0x01ce, code lost:
                                        r0 = r11.A0w;
                                     */
                                    /* JADX WARNING: Code restructure failed: missing block: B:110:0x01d0, code lost:
                                        if (r0 == null) goto L_0x01d5;
                                     */
                                    /* JADX WARNING: Code restructure failed: missing block: B:111:0x01d2, code lost:
                                        r0.A0R(r6, false);
                                     */
                                    /* JADX WARNING: Code restructure failed: missing block: B:112:0x01d5, code lost:
                                        r4.setLayoutParams(r5);
                                        r1 = r11.A05;
                                     */
                                    /* JADX WARNING: Code restructure failed: missing block: B:113:0x01da, code lost:
                                        if (r1 == null) goto L_?;
                                     */
                                    /* JADX WARNING: Code restructure failed: missing block: B:114:0x01dc, code lost:
                                        X.AnonymousClass74F.A08(r11.A1D(), r1);
                                     */
                                    /* JADX WARNING: Code restructure failed: missing block: B:115:0x01e3, code lost:
                                        return;
                                     */
                                    /* JADX WARNING: Code restructure failed: missing block: B:116:0x01e4, code lost:
                                        r0 = r11.A0w;
                                     */
                                    /* JADX WARNING: Code restructure failed: missing block: B:117:0x01e6, code lost:
                                        if (r0 == null) goto L_0x01ed;
                                     */
                                    /* JADX WARNING: Code restructure failed: missing block: B:118:0x01e8, code lost:
                                        X.AnonymousClass3MW.A1R(r0.A0K);
                                     */
                                    /* JADX WARNING: Code restructure failed: missing block: B:119:0x01ed, code lost:
                                        r6 = r1;
                                     */
                                    /* JADX WARNING: Code restructure failed: missing block: B:124:?, code lost:
                                        return;
                                     */
                                    /* Code decompiled incorrectly, please refer to instructions dump. */
                                    public static final void A0d(com.whatsapp.statuscomposer.composer.TextStatusComposerFragment r11, int r12) {
                                        /*
                                            X.7Fe r0 = r11.A0N
                                            if (r0 == 0) goto L_0x01f3
                                            r8 = 0
                                            android.graphics.Bitmap r2 = r0.A0C()
                                            X.7Fe r0 = r11.A0N
                                            if (r0 == 0) goto L_0x0174
                                            android.graphics.Bitmap r5 = r0.A0C()
                                            if (r5 == 0) goto L_0x0174
                                            X.0ve r0 = r11.A0X
                                            if (r0 == 0) goto L_0x016a
                                            X.7Fe r0 = r11.A0N
                                            boolean r0 = X.AnonymousClass74F.A09(r0, r12)
                                            if (r0 == 0) goto L_0x0174
                                            android.util.DisplayMetrics r3 = r11.A02
                                            java.lang.String r4 = "displayMetrics"
                                            if (r3 == 0) goto L_0x0166
                                            int r0 = r3.heightPixels
                                            float r1 = (float) r0
                                            float r0 = r3.density
                                            float r1 = r1 / r0
                                            r0 = 1142947840(0x44200000, float:640.0)
                                            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
                                            if (r0 < 0) goto L_0x0174
                                            android.content.res.Resources r1 = X.AnonymousClass3MZ.A09(r11)
                                            r0 = 2131168865(0x7f070e61, float:1.7952044E38)
                                            int r3 = r1.getDimensionPixelSize(r0)
                                            android.widget.ScrollView r0 = r11.A07
                                            if (r0 == 0) goto L_0x0115
                                            int r1 = r0.getHeight()
                                            com.whatsapp.status.widget.StatusEditText r0 = r11.A0l
                                            if (r0 == 0) goto L_0x016d
                                            int r0 = r0.getHeight()
                                            int r1 = r1 - r0
                                        L_0x004d:
                                            com.whatsapp.webpagepreview.WebPagePreviewView r0 = r11.A0w
                                            if (r0 == 0) goto L_0x0112
                                            android.widget.LinearLayout r0 = r0.A08
                                            int r0 = r0.getHeight()
                                        L_0x0057:
                                            int r1 = r1 - r0
                                            if (r1 < r3) goto L_0x0174
                                            android.content.res.Resources r1 = X.AnonymousClass3MZ.A09(r11)
                                            r0 = 2131168866(0x7f070e62, float:1.7952046E38)
                                            float r1 = X.AnonymousClass3MW.A00(r1, r0)
                                            android.util.DisplayMetrics r0 = r11.A02
                                            if (r0 == 0) goto L_0x0166
                                            float r0 = r0.density
                                            float r1 = r1 / r0
                                            int r1 = (int) r1
                                            int r0 = r5.getWidth()
                                            if (r0 < r1) goto L_0x0174
                                            if (r2 == 0) goto L_0x0174
                                            X.3TA r0 = r11.A0O
                                            java.lang.String r4 = "webPagePreviewViewModel"
                                            if (r0 == 0) goto L_0x0166
                                            boolean r0 = r0.A0c()
                                            if (r0 == 0) goto L_0x0089
                                            X.3TA r1 = r11.A0O
                                            if (r1 == 0) goto L_0x0166
                                            r0 = 0
                                            r1.A0V(r0)
                                        L_0x0089:
                                            android.content.res.Resources r1 = X.AnonymousClass3MZ.A09(r11)
                                            r0 = 2131168866(0x7f070e62, float:1.7952046E38)
                                            int r7 = r1.getDimensionPixelSize(r0)
                                            com.whatsapp.webpagepreview.WebPagePreviewView r1 = r11.A0w
                                            if (r1 == 0) goto L_0x010f
                                            r0 = 2131428811(0x7f0b05cb, float:1.8479277E38)
                                            android.widget.ImageView r6 = X.AnonymousClass3MW.A0H(r1, r0)
                                            if (r6 == 0) goto L_0x0110
                                            android.view.ViewGroup$LayoutParams r5 = r6.getLayoutParams()
                                        L_0x00a5:
                                            java.lang.String r0 = "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams"
                                            X.C18070vi.A0z(r5, r0)
                                            android.view.ViewGroup$MarginLayoutParams r5 = (android.view.ViewGroup.MarginLayoutParams) r5
                                            com.whatsapp.webpagepreview.WebPagePreviewView r0 = r11.A0w
                                            if (r0 == 0) goto L_0x00b3
                                            r0.A0G()
                                        L_0x00b3:
                                            com.whatsapp.webpagepreview.WebPagePreviewView r0 = r11.A0w
                                            r4 = 0
                                            if (r0 == 0) goto L_0x010d
                                            android.widget.LinearLayout r0 = r0.A08
                                            int r9 = r0.getHeight()
                                        L_0x00be:
                                            int r0 = r2.getWidth()
                                            float r1 = (float) r0
                                            r0 = 1068708659(0x3fb33333, float:1.4)
                                            float r1 = r1 * r0
                                            int r10 = (int) r1
                                            int r3 = r2.getHeight()
                                            int r3 = r3 * r7
                                            int r0 = r2.getWidth()
                                            int r3 = r3 / r0
                                            android.widget.ScrollView r0 = r11.A07
                                            if (r0 == 0) goto L_0x010b
                                            int r1 = r0.getHeight()
                                            com.whatsapp.status.widget.StatusEditText r0 = r11.A0l
                                            if (r0 == 0) goto L_0x016d
                                            int r0 = r0.getHeight()
                                            int r1 = r1 - r0
                                        L_0x00e3:
                                            int r1 = r1 - r9
                                            int r0 = java.lang.Math.min(r3, r1)
                                            int r1 = java.lang.Math.min(r10, r0)
                                            int r9 = r9 + r1
                                            com.whatsapp.webpagepreview.WebPagePreviewView r0 = r11.A0w
                                            if (r0 == 0) goto L_0x00f4
                                            r0.A0M(r7, r1)
                                        L_0x00f4:
                                            android.view.ViewGroup r0 = r11.A05
                                            if (r0 == 0) goto L_0x0102
                                            android.view.ViewGroup$LayoutParams r8 = r0.getLayoutParams()
                                            if (r8 == 0) goto L_0x0102
                                            r8.width = r7
                                            r8.height = r9
                                        L_0x0102:
                                            android.view.ViewGroup r0 = r11.A05
                                            if (r0 == 0) goto L_0x0109
                                            r0.setLayoutParams(r8)
                                        L_0x0109:
                                            r0 = 1
                                            goto L_0x0118
                                        L_0x010b:
                                            r1 = -1
                                            goto L_0x00e3
                                        L_0x010d:
                                            r9 = 0
                                            goto L_0x00be
                                        L_0x010f:
                                            r6 = r8
                                        L_0x0110:
                                            r5 = r8
                                            goto L_0x00a5
                                        L_0x0112:
                                            r0 = 0
                                            goto L_0x0057
                                        L_0x0115:
                                            r1 = -1
                                            goto L_0x004d
                                        L_0x0118:
                                            android.graphics.Bitmap r1 = android.graphics.Bitmap.createScaledBitmap(r2, r7, r3, r0)     // Catch:{ OutOfMemoryError -> 0x0127 }
                                            X.C18070vi.A0X(r1)     // Catch:{ OutOfMemoryError -> 0x0127 }
                                            com.whatsapp.webpagepreview.WebPagePreviewView r0 = r11.A0w     // Catch:{ OutOfMemoryError -> 0x0127 }
                                            if (r0 == 0) goto L_0x0132
                                            r0.setImageLargeThumbWithBitmap(r1)     // Catch:{ OutOfMemoryError -> 0x0127 }
                                            goto L_0x0132
                                        L_0x0127:
                                            r0 = move-exception
                                            r0.getMessage()
                                            com.whatsapp.webpagepreview.WebPagePreviewView r0 = r11.A0w
                                            if (r0 == 0) goto L_0x0132
                                            r0.setImageLargeThumbWithBitmap(r2)
                                        L_0x0132:
                                            android.content.res.Resources r3 = X.AnonymousClass3MZ.A09(r11)
                                            android.content.Context r2 = r11.A1n()
                                            r1 = 2130971957(0x7f040d35, float:1.7552667E38)
                                            r0 = 2131103410(0x7f060eb2, float:1.7819285E38)
                                            int r0 = X.AnonymousClass3Ma.A01(r2, r3, r1, r0)
                                            r6.setColorFilter(r0)
                                            r0 = 2131233024(0x7f080900, float:1.8082174E38)
                                            r6.setBackgroundResource(r0)
                                            android.content.res.Resources r1 = X.AnonymousClass3MZ.A09(r11)
                                            r0 = 2131168867(0x7f070e63, float:1.7952048E38)
                                            int r0 = r1.getDimensionPixelSize(r0)
                                            r5.setMargins(r4, r0, r0, r4)
                                            r6.setLayoutParams(r5)
                                            android.view.ViewGroup r0 = r11.A05
                                            if (r0 == 0) goto L_0x01f3
                                            r0.requestLayout()
                                            return
                                        L_0x0166:
                                            X.C18070vi.A11(r4)
                                            goto L_0x0172
                                        L_0x016a:
                                            java.lang.String r0 = "abProps"
                                            goto L_0x016f
                                        L_0x016d:
                                            java.lang.String r0 = "entry"
                                        L_0x016f:
                                            X.C18070vi.A11(r0)
                                        L_0x0172:
                                            r0 = 0
                                            throw r0
                                        L_0x0174:
                                            com.whatsapp.webpagepreview.WebPagePreviewView r1 = r11.A0w
                                            r5 = 0
                                            if (r1 == 0) goto L_0x01f1
                                            r0 = 2131428811(0x7f0b05cb, float:1.8479277E38)
                                            android.widget.ImageView r4 = X.AnonymousClass3MW.A0H(r1, r0)
                                            if (r4 == 0) goto L_0x0186
                                            android.view.ViewGroup$LayoutParams r5 = r4.getLayoutParams()
                                        L_0x0186:
                                            java.lang.String r0 = "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams"
                                            X.C18070vi.A0z(r5, r0)
                                            android.view.ViewGroup$MarginLayoutParams r5 = (android.view.ViewGroup.MarginLayoutParams) r5
                                            android.util.TypedValue r2 = new android.util.TypedValue
                                            r2.<init>()
                                            X.1FL r0 = r11.A1D()
                                            android.content.res.Resources$Theme r1 = r0.getTheme()
                                            r0 = 16843868(0x101045c, float:2.3696686E-38)
                                            r6 = 1
                                            r1.resolveAttribute(r0, r2, r6)
                                            r4.clearColorFilter()
                                            int r0 = r2.resourceId
                                            r4.setBackgroundResource(r0)
                                            r3 = 0
                                            r5.setMargins(r3, r3, r3, r3)
                                            X.7Fe r0 = r11.A0N
                                            if (r0 == 0) goto L_0x01ef
                                            int r1 = r0.A02
                                        L_0x01b3:
                                            com.whatsapp.webpagepreview.WebPagePreviewView r0 = r11.A0w
                                            if (r0 == 0) goto L_0x01ba
                                            r0.A0L(r1)
                                        L_0x01ba:
                                            X.7Fe r2 = r11.A0N
                                            if (r2 == 0) goto L_0x01c3
                                            byte[] r0 = r2.A0J
                                            r1 = 1
                                            if (r0 != 0) goto L_0x01c6
                                        L_0x01c3:
                                            r1 = 0
                                            if (r2 == 0) goto L_0x01e4
                                        L_0x01c6:
                                            X.6g9 r0 = r2.A05
                                            if (r0 == 0) goto L_0x01e4
                                            int r0 = r0.A00
                                            if (r0 <= 0) goto L_0x01e4
                                        L_0x01ce:
                                            com.whatsapp.webpagepreview.WebPagePreviewView r0 = r11.A0w
                                            if (r0 == 0) goto L_0x01d5
                                            r0.A0R(r6, r3)
                                        L_0x01d5:
                                            r4.setLayoutParams(r5)
                                            android.view.ViewGroup r1 = r11.A05
                                            if (r1 == 0) goto L_0x01f3
                                            X.1FL r0 = r11.A1D()
                                            X.AnonymousClass74F.A08(r0, r1)
                                            return
                                        L_0x01e4:
                                            com.whatsapp.webpagepreview.WebPagePreviewView r0 = r11.A0w
                                            if (r0 == 0) goto L_0x01ed
                                            com.whatsapp.components.button.ThumbnailButton r0 = r0.A0K
                                            X.AnonymousClass3MW.A1R(r0)
                                        L_0x01ed:
                                            r6 = r1
                                            goto L_0x01ce
                                        L_0x01ef:
                                            r1 = 0
                                            goto L_0x01b3
                                        L_0x01f1:
                                            r4 = r5
                                            goto L_0x0186
                                        L_0x01f3:
                                            return
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.statuscomposer.composer.TextStatusComposerFragment.A0d(com.whatsapp.statuscomposer.composer.TextStatusComposerFragment, int):void");
                                    }

                                    private final void A0g(boolean z) {
                                        String str;
                                        List singletonList;
                                        if (this.A0e != null) {
                                            Context A142 = A14();
                                            Boolean A0i2 = AnonymousClass000.A0i();
                                            AnonymousClass7J1 r0 = this.A0n;
                                            if (r0 != null) {
                                                singletonList = Collections.unmodifiableList(r0.A0A);
                                            } else {
                                                singletonList = Collections.singletonList(C29671cg.A00);
                                            }
                                            C18070vi.A0X(singletonList);
                                            ArrayList A102 = C17880vN.A10(C18070vi.A0P(AnonymousClass3MY.A0f()));
                                            Boolean valueOf = Boolean.valueOf(z);
                                            Intent A0B2 = C72473Md.A0B(A142, "com.whatsapp.contact.picker.ContactPicker");
                                            A0B2.putExtra("source_surface", 34);
                                            C108995ce.A0n(A0B2, A0i2, A102);
                                            C108965cb.A10(A0B2, singletonList);
                                            if (valueOf != null) {
                                                A0B2.putExtra("status_chip_clicked", valueOf);
                                            }
                                            AnonymousClass00H r02 = this.A12;
                                            if (r02 != null) {
                                                AnonymousClass727 A0u2 = C108945cZ.A0u(r02);
                                                Object A062 = this.A1J.A06();
                                                A062.getClass();
                                                A0u2.A03(A0B2, (AnonymousClass77K) A062);
                                                startActivityForResult(A0B2, 2);
                                                return;
                                            }
                                            str = "statusAudienceRepository";
                                        } else {
                                            str = "waIntents";
                                        }
                                        C18070vi.A11(str);
                                        throw null;
                                    }

                                    private final boolean A0h() {
                                        VoiceRecordingView voiceRecordingView = this.A0p;
                                        if (voiceRecordingView == null || this.A0q == null || !this.A1H || voiceRecordingView.getVisibility() == 4) {
                                            return true;
                                        }
                                        VoiceRecordingView voiceRecordingView2 = this.A0p;
                                        if (voiceRecordingView2 == null) {
                                            throw AnonymousClass000.A0n("Required value was null.");
                                        } else if (voiceRecordingView2.getVisibility() != 8) {
                                            return false;
                                        } else {
                                            return true;
                                        }
                                    }

                                    public static final boolean A0i(TextStatusComposerFragment textStatusComposerFragment) {
                                        C18030ve r2 = textStatusComposerFragment.A0X;
                                        if (r2 != null) {
                                            return C18020vd.A05(C18040vf.A02, r2, 3792);
                                        }
                                        AnonymousClass3MW.A1A();
                                        throw null;
                                    }

                                    /* JADX WARNING: type inference failed for: r2v2, types: [androidx.fragment.app.Fragment, com.whatsapp.textstatuscomposer.DiscardWarningDialogFragment, com.whatsapp.textstatuscomposer.Hilt_DiscardWarningDialogFragment, androidx.fragment.app.DialogFragment] */
                                    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001b, code lost:
                                        if (r1 == 0) goto L_0x001d;
                                     */
                                    /* Code decompiled incorrectly, please refer to instructions dump. */
                                    public static final boolean A0j(com.whatsapp.statuscomposer.composer.TextStatusComposerFragment r4, boolean r5) {
                                        /*
                                            com.whatsapp.status.widget.StatusEditText r0 = r4.A0l
                                            java.lang.String r1 = "entry"
                                            if (r0 == 0) goto L_0x0060
                                            android.text.Editable r0 = r0.getText()
                                            if (r0 == 0) goto L_0x001d
                                            com.whatsapp.status.widget.StatusEditText r0 = r4.A0l
                                            if (r0 == 0) goto L_0x0060
                                            android.text.Editable r0 = r0.getText()
                                            if (r0 == 0) goto L_0x001d
                                            int r1 = r0.length()
                                            r0 = 1
                                            if (r1 != 0) goto L_0x001e
                                        L_0x001d:
                                            r0 = 0
                                        L_0x001e:
                                            r3 = 1
                                            if (r0 != 0) goto L_0x0056
                                            X.7Mt r0 = r4.A0q
                                            if (r0 == 0) goto L_0x0058
                                            java.io.File r0 = r0.A08
                                            if (r0 == 0) goto L_0x0058
                                            r2 = 2
                                        L_0x002a:
                                            android.os.Bundle r1 = X.C17880vN.A0D()
                                            java.lang.String r0 = "content"
                                            r1.putInt(r0, r2)
                                            java.lang.String r0 = "back_button_pressed"
                                            r1.putBoolean(r0, r5)
                                            com.whatsapp.textstatuscomposer.DiscardWarningDialogFragment r2 = new com.whatsapp.textstatuscomposer.DiscardWarningDialogFragment
                                            r2.<init>()
                                            r2.A1R(r1)
                                            r2.A00 = r4
                                            X.1FU r1 = X.C108985cd.A0M(r4)
                                            r0 = 0
                                            r1.CMk(r2, r0)
                                            X.7Mt r0 = r4.A0q
                                            if (r0 == 0) goto L_0x0055
                                            X.7Mv r0 = r0.A07
                                            if (r0 == 0) goto L_0x0055
                                            X.C145847Mv.A00(r0)
                                        L_0x0055:
                                            return r3
                                        L_0x0056:
                                            r2 = 1
                                            goto L_0x002a
                                        L_0x0058:
                                            if (r5 == 0) goto L_0x005c
                                            r3 = 0
                                            return r3
                                        L_0x005c:
                                            X.C72463Mc.A1A(r4)
                                            return r3
                                        L_0x0060:
                                            X.C18070vi.A11(r1)
                                            r0 = 0
                                            throw r0
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.statuscomposer.composer.TextStatusComposerFragment.A0j(com.whatsapp.statuscomposer.composer.TextStatusComposerFragment, boolean):boolean");
                                    }

                                    public final C32741hg A26() {
                                        C32741hg r0 = this.A0k;
                                        if (r0 != null) {
                                            return r0;
                                        }
                                        C18070vi.A11("statusesStatsManager");
                                        throw null;
                                    }

                                    public final AnonymousClass00H A27() {
                                        AnonymousClass00H r0 = this.A13;
                                        if (r0 != null) {
                                            return r0;
                                        }
                                        C18070vi.A11("statusConfig");
                                        throw null;
                                    }

                                    /* JADX WARNING: Removed duplicated region for block: B:33:0x009a  */
                                    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a1  */
                                    /* JADX WARNING: Removed duplicated region for block: B:72:0x012e  */
                                    /* Code decompiled incorrectly, please refer to instructions dump. */
                                    public final void A28(X.C143887Fe r11, int r12) {
                                        /*
                                            r10 = this;
                                            X.3TA r0 = r10.A0O
                                            java.lang.String r2 = "webPagePreviewViewModel"
                                            r6 = 0
                                            if (r0 == 0) goto L_0x018b
                                            r0.A0X(r11)
                                            if (r11 == 0) goto L_0x0185
                                            java.lang.String r1 = r11.A0S
                                            java.lang.String r0 = r10.A18
                                            boolean r0 = X.C18070vi.A18(r1, r0)
                                            if (r0 != 0) goto L_0x0185
                                            boolean r0 = r11.A0K()
                                            if (r0 == 0) goto L_0x0185
                                            X.3TA r0 = r10.A0O
                                            if (r0 == 0) goto L_0x018b
                                            java.lang.String r0 = r0.A0A
                                            boolean r0 = android.text.TextUtils.equals(r0, r1)
                                            if (r0 == 0) goto L_0x0185
                                            r10.A0N = r11
                                            java.lang.String r0 = "textstatus/showlinkpreview"
                                            com.whatsapp.util.Log.i((java.lang.String) r0)
                                            X.7Fe r0 = r10.A0N
                                            r3 = 0
                                            if (r0 == 0) goto L_0x00a7
                                            int r1 = r0.A03
                                            r0 = 4
                                            if (r1 != r0) goto L_0x00a7
                                            android.view.ViewGroup r0 = r10.A05
                                            if (r0 == 0) goto L_0x00a7
                                            X.0ve r2 = r10.A0X
                                            if (r2 == 0) goto L_0x0177
                                            r1 = 11377(0x2c71, float:1.5943E-41)
                                            X.0vf r0 = X.C18040vf.A02
                                            boolean r0 = X.C18020vd.A05(r0, r2, r1)
                                            if (r0 == 0) goto L_0x00a7
                                            android.view.ViewGroup r2 = r10.A05
                                            if (r2 == 0) goto L_0x0096
                                            android.content.res.Resources r1 = r2.getResources()
                                            r0 = 2131168872(0x7f070e68, float:1.7952058E38)
                                            int r4 = r1.getDimensionPixelSize(r0)
                                            android.content.res.Resources r1 = r2.getResources()
                                            r0 = 2131168870(0x7f070e66, float:1.7952054E38)
                                            int r9 = r1.getDimensionPixelSize(r0)
                                            android.graphics.Bitmap r5 = X.C108945cZ.A0H(r4, r9)
                                            X.C18070vi.A0X(r5)
                                            X.1FL r4 = r10.A1D()
                                            X.18K r1 = r10.A0Y
                                            if (r1 == 0) goto L_0x0174
                                            X.CTy r0 = new X.CTy
                                            r0.<init>(r1)
                                            X.BwF r7 = X.C109005cf.A0C(r4, r2, r0)
                                            X.2qP r4 = r10.A0E
                                            if (r4 == 0) goto L_0x017a
                                            X.7Fe r0 = r10.A0N
                                            if (r0 == 0) goto L_0x016f
                                            java.lang.String r8 = r0.A0S
                                            X.6Ms r1 = r4.A01(r5, r6, r7, r8, r9)
                                            android.view.ViewGroup r0 = r1.A0B
                                            r2.addView(r0)
                                            r2.setVisibility(r3)
                                            r1.A0E()
                                        L_0x0096:
                                            com.whatsapp.webpagepreview.WebPagePreviewView r0 = r10.A0w
                                            if (r0 == 0) goto L_0x009d
                                            r0.A0P(r11, r6, r3)
                                        L_0x009d:
                                            com.whatsapp.status.widget.StatusEditText r0 = r10.A0l
                                            if (r0 != 0) goto L_0x012e
                                            java.lang.String r0 = "entry"
                                            X.C18070vi.A11(r0)
                                            throw r6
                                        L_0x00a7:
                                            com.whatsapp.webpagepreview.WebPagePreviewView r0 = r10.A0w
                                            if (r0 != 0) goto L_0x0096
                                            X.1FL r1 = r10.A1D()
                                            com.whatsapp.webpagepreview.WebPagePreviewView r0 = new com.whatsapp.webpagepreview.WebPagePreviewView
                                            r0.<init>(r1)
                                            r10.A0w = r0
                                            r4 = 0
                                            r0.setForeground(r6)
                                            com.whatsapp.webpagepreview.WebPagePreviewView r0 = r10.A0w
                                            if (r0 == 0) goto L_0x00c1
                                            r0.setImageContentBackgroundResource(r3)
                                        L_0x00c1:
                                            android.view.ViewGroup r1 = r10.A05
                                            if (r1 == 0) goto L_0x00ca
                                            com.whatsapp.webpagepreview.WebPagePreviewView r0 = r10.A0w
                                            r1.addView(r0)
                                        L_0x00ca:
                                            com.whatsapp.webpagepreview.WebPagePreviewView r1 = r10.A0w
                                            if (r1 == 0) goto L_0x00e9
                                            r0 = 2131436208(0x7f0b22b0, float:1.849428E38)
                                            android.view.View r5 = r1.findViewById(r0)
                                            if (r5 == 0) goto L_0x00e9
                                            X.0vb r2 = r10.A0S
                                            if (r2 == 0) goto L_0x0181
                                            android.content.res.Resources r1 = X.AnonymousClass3MZ.A09(r10)
                                            r0 = 2131169005(0x7f070eed, float:1.7952328E38)
                                            int r0 = r1.getDimensionPixelSize(r0)
                                            X.C27641Ww.A05(r5, r2, r3, r0)
                                        L_0x00e9:
                                            com.whatsapp.webpagepreview.WebPagePreviewView r0 = r10.A0w
                                            if (r0 == 0) goto L_0x00f0
                                            r0.setImageProgressBarVisibility(r3)
                                        L_0x00f0:
                                            com.whatsapp.webpagepreview.WebPagePreviewView r1 = r10.A0w
                                            if (r1 == 0) goto L_0x0105
                                            r0 = 2131428811(0x7f0b05cb, float:1.8479277E38)
                                            android.view.View r1 = r1.findViewById(r0)
                                            if (r1 == 0) goto L_0x0105
                                            r1.setVisibility(r3)
                                            r0 = 27
                                            X.AnonymousClass6LG.A00(r1, r10, r0)
                                        L_0x0105:
                                            com.whatsapp.webpagepreview.WebPagePreviewView r1 = r10.A0w
                                            if (r1 == 0) goto L_0x0110
                                            r0 = 2131436123(0x7f0b225b, float:1.8494108E38)
                                            android.view.View r4 = r1.findViewById(r0)
                                        L_0x0110:
                                            r0 = 31
                                            X.6LF r2 = new X.6LF
                                            r2.<init>(r4, r10, r0)
                                            if (r4 == 0) goto L_0x011c
                                            r4.setOnClickListener(r2)
                                        L_0x011c:
                                            com.whatsapp.webpagepreview.WebPagePreviewView r1 = r10.A0w
                                            if (r1 == 0) goto L_0x0096
                                            r0 = 2131437036(0x7f0b25ec, float:1.849596E38)
                                            android.view.View r0 = r1.findViewById(r0)
                                            if (r0 == 0) goto L_0x0096
                                            r0.setOnClickListener(r2)
                                            goto L_0x0096
                                        L_0x012e:
                                            android.text.Editable r0 = r0.getText()
                                            if (r0 == 0) goto L_0x0145
                                            com.whatsapp.webpagepreview.WebPagePreviewView r0 = r10.A0w
                                            if (r0 == 0) goto L_0x0145
                                            com.whatsapp.WaTextView r2 = r0.A0G
                                            if (r2 == 0) goto L_0x0145
                                            r1 = 1
                                            X.4dg r0 = new X.4dg
                                            r0.<init>(r10, r12, r1)
                                            r2.addOnLayoutChangeListener(r0)
                                        L_0x0145:
                                            android.view.ViewGroup r0 = r10.A05
                                            if (r0 == 0) goto L_0x0150
                                            int r0 = r0.getVisibility()
                                            if (r0 != 0) goto L_0x0150
                                            return
                                        L_0x0150:
                                            android.view.ViewGroup r0 = r10.A05
                                            if (r0 == 0) goto L_0x0157
                                            r0.setVisibility(r3)
                                        L_0x0157:
                                            android.view.ViewGroup r1 = r10.A05
                                            if (r1 == 0) goto L_0x015f
                                            r0 = 0
                                            r1.setAlpha(r0)
                                        L_0x015f:
                                            android.view.ViewGroup r0 = r10.A05
                                            if (r0 == 0) goto L_0x018a
                                            android.view.ViewTreeObserver r1 = r0.getViewTreeObserver()
                                            if (r1 == 0) goto L_0x018a
                                            r0 = 22
                                            X.AnonymousClass793.A00(r1, r10, r0)
                                            return
                                        L_0x016f:
                                            java.lang.IllegalArgumentException r0 = X.C17890vO.A0K()
                                            throw r0
                                        L_0x0174:
                                            java.lang.String r0 = "wamRuntime"
                                            goto L_0x017c
                                        L_0x0177:
                                            java.lang.String r0 = "abProps"
                                            goto L_0x017c
                                        L_0x017a:
                                            java.lang.String r0 = "inlineYoutubeVideoPlayerFactory"
                                        L_0x017c:
                                            X.C18070vi.A11(r0)
                                            r0 = 0
                                            throw r0
                                        L_0x0181:
                                            X.AnonymousClass3MW.A1M()
                                            throw r6
                                        L_0x0185:
                                            r10.A0N = r6
                                            A09(r10)
                                        L_0x018a:
                                            return
                                        L_0x018b:
                                            X.C18070vi.A11(r2)
                                            throw r6
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.statuscomposer.composer.TextStatusComposerFragment.A28(X.7Fe, int):void");
                                    }

                                    public boolean Bm9() {
                                        if (this.A0X == null) {
                                            Log.i("TextStatusComposerFragment/abProps not initialized");
                                            return false;
                                        } else if (!A0i(this) || !C108975cc.A0G(this).A0U()) {
                                            C80753xv r0 = this.A0a;
                                            if (r0 == null || !r0.A02()) {
                                                return A0j(this, true);
                                            }
                                            return true;
                                        } else {
                                            C108975cc.A0G(this).A0D();
                                            return true;
                                        }
                                    }

                                    public void BvC() {
                                        AnonymousClass10I r1 = this.A0t;
                                        if (r1 != null) {
                                            AnonymousClass7RI.A01(r1, this, 12);
                                        } else {
                                            AnonymousClass3MW.A1G();
                                            throw null;
                                        }
                                    }

                                    public void C6b() {
                                        CoordinatorLayout coordinatorLayout = this.A09;
                                        if (coordinatorLayout != null) {
                                            coordinatorLayout.animate().scaleX(1.0f).scaleY(1.0f).setDuration(200);
                                            ViewGroup viewGroup = this.A04;
                                            if (viewGroup != null) {
                                                viewGroup.setVisibility(0);
                                            }
                                            CreationModeBottomBar creationModeBottomBar = this.A1G;
                                            if (creationModeBottomBar != null) {
                                                creationModeBottomBar.setVisibility(0);
                                            }
                                            StatusEditText statusEditText = this.A0l;
                                            if (statusEditText == null) {
                                                C18070vi.A11("entry");
                                                throw null;
                                            } else {
                                                statusEditText.requestFocus();
                                            }
                                        } else {
                                            throw AnonymousClass000.A0n("Required value was null.");
                                        }
                                    }

                                    public void C6c(AnonymousClass77K r2) {
                                        if (this.A1J.A06() != r2) {
                                            A06(r2, true);
                                            A02();
                                        }
                                    }

                                    public void C6e() {
                                        this.A19 = "share_sheet_share_button";
                                        C32741hg A26 = A26();
                                        int i = 2;
                                        if (A0h()) {
                                            i = 0;
                                        }
                                        A26.A0G(Integer.valueOf(i), this.A19);
                                        A0D(this);
                                        if (A0h()) {
                                            A0C(this);
                                        } else {
                                            A0E(this);
                                        }
                                    }

                                    public static final AnonymousClass886 A00(TextStatusComposerFragment textStatusComposerFragment) {
                                        AnonymousClass1FL A1C2 = textStatusComposerFragment.A1C();
                                        if (A1C2 instanceof AnonymousClass886) {
                                            return (AnonymousClass886) A1C2;
                                        }
                                        return null;
                                    }

                                    private final void A03() {
                                        ViewGroup.LayoutParams layoutParams;
                                        int dimensionPixelSize = AnonymousClass3MZ.A09(this).getDimensionPixelSize(2131168885);
                                        VoiceRecordingView voiceRecordingView = this.A0p;
                                        ViewGroup.MarginLayoutParams marginLayoutParams = null;
                                        if (voiceRecordingView != null) {
                                            layoutParams = voiceRecordingView.getLayoutParams();
                                        } else {
                                            layoutParams = null;
                                        }
                                        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                                            marginLayoutParams.setMargins(dimensionPixelSize, marginLayoutParams.topMargin, dimensionPixelSize, marginLayoutParams.bottomMargin);
                                        }
                                        VoiceRecordingView voiceRecordingView2 = this.A0p;
                                        if (voiceRecordingView2 != null) {
                                            voiceRecordingView2.setLayoutParams(marginLayoutParams);
                                        }
                                    }

                                    public static final void A0D(TextStatusComposerFragment textStatusComposerFragment) {
                                        Intent A0B2 = C108955ca.A0B(textStatusComposerFragment);
                                        C18070vi.A0X(A0B2);
                                        int intExtra = A0B2.getIntExtra("entry_point", 0);
                                        AnonymousClass00H r0 = textStatusComposerFragment.A14;
                                        if (r0 == null) {
                                            C18070vi.A11("statusLoggingConfig");
                                            throw null;
                                        } else if (C108985cd.A1Z(r0)) {
                                            C32741hg A26 = textStatusComposerFragment.A26();
                                            Integer valueOf = Integer.valueOf(intExtra);
                                            textStatusComposerFragment.A26();
                                            A26.A0F(0, valueOf, C32741hg.A02(intExtra));
                                        }
                                    }

                                    public static final void A0H(TextStatusComposerFragment textStatusComposerFragment) {
                                        if (C18020vd.A05(C18040vf.A02, C108955ca.A0R(textStatusComposerFragment.A27()), 8744)) {
                                            ImageButton imageButton = textStatusComposerFragment.A06;
                                            if (imageButton != null) {
                                                imageButton.setBackground(textStatusComposerFragment.A0i);
                                            }
                                            C18070vi.A11("emojiButton");
                                            throw null;
                                        }
                                        ImageButton imageButton2 = textStatusComposerFragment.A06;
                                        if (imageButton2 != null) {
                                            imageButton2.setImageResource(2131232116);
                                            ImageButton imageButton3 = textStatusComposerFragment.A06;
                                            if (imageButton3 != null) {
                                                C108955ca.A1J(imageButton3, textStatusComposerFragment, 2131898950);
                                                return;
                                            }
                                        }
                                        C18070vi.A11("emojiButton");
                                        throw null;
                                    }

                                    public static final void A0I(TextStatusComposerFragment textStatusComposerFragment) {
                                        String str;
                                        Typeface A042 = AnonymousClass74F.A04(textStatusComposerFragment.A14(), textStatusComposerFragment.A01);
                                        TextView textView = textStatusComposerFragment.A08;
                                        if (textView == null) {
                                            str = "fontButton";
                                        } else {
                                            textView.setTypeface(A042);
                                            StatusEditText statusEditText = textStatusComposerFragment.A0l;
                                            if (statusEditText == null) {
                                                str = "entry";
                                            } else {
                                                statusEditText.setTypeface(A042);
                                                return;
                                            }
                                        }
                                        C18070vi.A11(str);
                                        throw null;
                                    }

                                    public static final void A0e(TextStatusComposerFragment textStatusComposerFragment, String str) {
                                        Context A142 = textStatusComposerFragment.A14();
                                        AnonymousClass11C r0 = textStatusComposerFragment.A0P;
                                        if (r0 != null) {
                                            AnonymousClass1Y5.A00(A142, r0, str);
                                        } else {
                                            AnonymousClass3MW.A1N();
                                            throw null;
                                        }
                                    }

                                    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0065, code lost:
                                        if (r2 == false) goto L_0x0067;
                                     */
                                    /* Code decompiled incorrectly, please refer to instructions dump. */
                                    private final void A0f(java.util.List r5) {
                                        /*
                                            r4 = this;
                                            android.view.Window r1 = X.C108965cb.A0B(r4)
                                            r0 = 3
                                            r1.setSoftInputMode(r0)
                                            A08(r4)
                                            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
                                            java.lang.String r0 = "TextStatusComposerFragment/status attempt message statusDistributionInfo: "
                                            r1.append(r0)
                                            X.1DT r0 = r4.A1J
                                            java.lang.Object r0 = r0.A06()
                                            X.C17900vP.A0b(r0, r1)
                                            X.1BI r0 = X.C22971Dz.A01(r5)
                                            r2 = 0
                                            if (r0 == 0) goto L_0x0025
                                            r2 = 1
                                        L_0x0025:
                                            int r0 = r5.size()
                                            r1 = 1
                                            if (r0 != r1) goto L_0x0065
                                            if (r2 == 0) goto L_0x0067
                                            android.content.Intent r2 = X.C108955ca.A0B(r4)
                                            X.C18070vi.A0X(r2)
                                            java.lang.String r1 = "entry_point"
                                            r0 = 0
                                            int r1 = r2.getIntExtra(r1, r0)
                                            r0 = 32
                                            if (r1 == r0) goto L_0x0044
                                            r0 = 33
                                            if (r1 != r0) goto L_0x0059
                                        L_0x0044:
                                            X.1LU r0 = r4.A0e
                                            if (r0 == 0) goto L_0x009b
                                            X.1FL r0 = r4.A1D()
                                            android.content.Intent r1 = X.AnonymousClass1LU.A02(r0)
                                            java.lang.String r0 = X.C28901bF.A05
                                            android.content.Intent r2 = r1.setAction(r0)
                                        L_0x0056:
                                            r4.A1k(r2)
                                        L_0x0059:
                                            X.1FL r1 = r4.A1D()
                                            r0 = -1
                                            r1.setResult(r0)
                                            X.C108955ca.A1M(r4)
                                            return
                                        L_0x0065:
                                            if (r2 != 0) goto L_0x008b
                                        L_0x0067:
                                            int r0 = r5.size()
                                            if (r0 != r1) goto L_0x008b
                                            X.1LU r3 = r4.A0e
                                            if (r3 == 0) goto L_0x009b
                                            android.content.Context r2 = r4.A14()
                                            r1 = 0
                                            X.1BI r0 = X.C108945cZ.A0i(r5, r1)
                                            android.content.Intent r2 = r3.A1w(r2, r0, r1)
                                            X.C18070vi.A0X(r2)
                                            java.lang.String r1 = "TextStatusComposerFragment:sendEntry"
                                            X.11P r0 = r4.A0Q
                                            if (r0 == 0) goto L_0x009e
                                            X.C60442o2.A00(r2, r0, r1)
                                            goto L_0x0056
                                        L_0x008b:
                                            X.1LU r0 = r4.A0e
                                            if (r0 == 0) goto L_0x009b
                                            X.1FL r0 = r4.A1D()
                                            android.content.Intent r2 = X.C108985cd.A0B(r0)
                                            X.C18070vi.A0b(r2)
                                            goto L_0x0056
                                        L_0x009b:
                                            java.lang.String r0 = "waIntents"
                                            goto L_0x00a0
                                        L_0x009e:
                                            java.lang.String r0 = "time"
                                        L_0x00a0:
                                            X.C18070vi.A11(r0)
                                            r0 = 0
                                            throw r0
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.statuscomposer.composer.TextStatusComposerFragment.A0f(java.util.List):void");
                                    }

                                    /* JADX WARNING: type inference failed for: r0v5, types: [com.whatsapp.status.posting.FirstStatusConfirmationDialogFragment, com.whatsapp.status.posting.Hilt_FirstStatusConfirmationDialogFragment, androidx.fragment.app.DialogFragment] */
                                    private final boolean A0k(List list) {
                                        if (list.isEmpty()) {
                                            A0g(false);
                                            return true;
                                        }
                                        C24661Le r0 = this.A0T;
                                        if (r0 != null) {
                                            if (r0.A0I()) {
                                                C24661Le r02 = this.A0T;
                                                if (r02 != null) {
                                                    if (!r02.A0H()) {
                                                        return false;
                                                    }
                                                }
                                            }
                                            AnonymousClass1FU A0M2 = C108985cd.A0M(this);
                                            ? hilt_FirstStatusConfirmationDialogFragment = new Hilt_FirstStatusConfirmationDialogFragment();
                                            hilt_FirstStatusConfirmationDialogFragment.A03 = this;
                                            A0M2.CMl(hilt_FirstStatusConfirmationDialogFragment);
                                            return true;
                                        }
                                        C18070vi.A11("statusStore");
                                        throw null;
                                    }

                                    public void A1r() {
                                        super.A1r();
                                        C117015z4 r0 = this.A1F;
                                        if (r0 != null) {
                                            r0.A0M();
                                        }
                                        EmojiSearchKeyboardContainer emojiSearchKeyboardContainer = this.A0W;
                                        if (emojiSearchKeyboardContainer != null) {
                                            emojiSearchKeyboardContainer.setOnTouchListener((View.OnTouchListener) null);
                                            emojiSearchKeyboardContainer.A09 = null;
                                        }
                                        if (A0i(this)) {
                                            C108975cc.A0G(this).A0G();
                                        }
                                        this.A0d = null;
                                        C138706xY r2 = this.A0o;
                                        if (r2 == null) {
                                            C18070vi.A11("entryCallbacks");
                                            throw null;
                                        }
                                        StatusEditText statusEditText = r2.A0K;
                                        statusEditText.removeTextChangedListener(r2.A01);
                                        statusEditText.setFilters(new InputFilter[0]);
                                        r2.A01 = null;
                                        AnonymousClass1KB r1 = this.A0K;
                                        if (r1 != null) {
                                            r1.A0I(this.A1L);
                                        } else {
                                            AnonymousClass3MW.A1C();
                                            throw null;
                                        }
                                    }

                                    public void A1v() {
                                        boolean isShowing;
                                        super.A1v();
                                        if ((!this.A1H || C72453Mb.A08(A14()) != 2) && this.A1I) {
                                            int i = 2;
                                            if (A0i(this)) {
                                                Window A0B2 = C108965cb.A0B(this);
                                                if (!C108975cc.A0G(this).A0U()) {
                                                    i = 4;
                                                }
                                                A0B2.setSoftInputMode(i | 1);
                                                isShowing = C108975cc.A0G(this).A0U();
                                            } else if (this.A1F != null) {
                                                Window A0B3 = C108965cb.A0B(this);
                                                C117015z4 r0 = this.A1F;
                                                if (r0 == null || !r0.isShowing()) {
                                                    i = 4;
                                                }
                                                A0B3.setSoftInputMode(i | 1);
                                                C117015z4 r02 = this.A1F;
                                                if (r02 != null) {
                                                    isShowing = r02.isShowing();
                                                } else {
                                                    return;
                                                }
                                            } else {
                                                return;
                                            }
                                            if (!isShowing) {
                                                StatusEditText statusEditText = this.A0l;
                                                if (statusEditText == null) {
                                                    C18070vi.A11("entry");
                                                    throw null;
                                                } else {
                                                    statusEditText.A0I(true);
                                                }
                                            }
                                        }
                                    }

                                    public void A1w(int i, int i2, Intent intent) {
                                        super.A1w(i, i2, intent);
                                        if (i != 1) {
                                            AnonymousClass77K r2 = null;
                                            if (i == 2) {
                                                C17960vV.A07(intent);
                                                Bundle extras = intent.getExtras();
                                                if (extras != null) {
                                                    AnonymousClass00H r0 = this.A12;
                                                    if (r0 != null) {
                                                        r2 = AnonymousClass727.A00(extras, r0);
                                                    }
                                                }
                                                AnonymousClass1DT r02 = this.A1J;
                                                if (r2 != null) {
                                                    r02.A0F(r2);
                                                    AnonymousClass7J1 r03 = this.A0n;
                                                    if (r03 != null) {
                                                        r03.A02(intent);
                                                    }
                                                    if (i2 == -1) {
                                                        A0D(this);
                                                        if (this.A0B == null) {
                                                            C18070vi.A11("textComposerExtraTools");
                                                            throw null;
                                                        } else if (A0h()) {
                                                            A0C(this);
                                                            return;
                                                        } else {
                                                            A0E(this);
                                                            return;
                                                        }
                                                    } else {
                                                        return;
                                                    }
                                                } else {
                                                    throw AnonymousClass000.A0n("Required value was null.");
                                                }
                                            } else if (i != 3) {
                                                AnonymousClass1FL A1B2 = A1B();
                                                if ((A1B2 instanceof ConsolidatedStatusComposerActivity) && A1B2 != null && this.A0B == null) {
                                                    C18070vi.A11("textComposerExtraTools");
                                                    throw null;
                                                }
                                                return;
                                            } else if (i2 != -1) {
                                                return;
                                            } else {
                                                if (intent != null) {
                                                    Bundle extras2 = intent.getExtras();
                                                    AnonymousClass00H r04 = this.A12;
                                                    if (r04 != null) {
                                                        AnonymousClass727 A0u2 = C108945cZ.A0u(r04);
                                                        if (extras2 != null) {
                                                            AnonymousClass77K A022 = A0u2.A02(extras2);
                                                            if (A022 != null) {
                                                                A06(A022, false);
                                                                A02();
                                                                return;
                                                            }
                                                            throw AnonymousClass000.A0n("Required value was null.");
                                                        }
                                                        throw AnonymousClass000.A0n("Required value was null.");
                                                    }
                                                } else {
                                                    throw AnonymousClass000.A0n("Required value was null.");
                                                }
                                            }
                                            C18070vi.A11("statusAudienceRepository");
                                            throw null;
                                        } else if (i2 == -1) {
                                            C72463Mc.A1A(this);
                                        }
                                    }

                                    public void C6k() {
                                        A0D(this);
                                        if (A0h()) {
                                            A0C(this);
                                        } else {
                                            A0E(this);
                                        }
                                    }
                                }
