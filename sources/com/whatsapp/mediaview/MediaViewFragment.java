package com.whatsapp.mediaview;

import X.A74;
import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass10I;
import X.AnonymousClass112;
import X.AnonymousClass118;
import X.AnonymousClass11C;
import X.AnonymousClass11P;
import X.AnonymousClass11S;
import X.AnonymousClass170;
import X.AnonymousClass18K;
import X.AnonymousClass190;
import X.AnonymousClass1BI;
import X.AnonymousClass1CJ;
import X.AnonymousClass1FO;
import X.AnonymousClass1FU;
import X.AnonymousClass1FY;
import X.AnonymousClass1GP;
import X.AnonymousClass1HB;
import X.AnonymousClass1HF;
import X.AnonymousClass1KB;
import X.AnonymousClass1KW;
import X.AnonymousClass1L4;
import X.AnonymousClass1L9;
import X.AnonymousClass1LU;
import X.AnonymousClass1M9;
import X.AnonymousClass1RU;
import X.AnonymousClass1ST;
import X.AnonymousClass1W6;
import X.AnonymousClass1WR;
import X.AnonymousClass1Y5;
import X.AnonymousClass1c4;
import X.AnonymousClass205;
import X.AnonymousClass206;
import X.AnonymousClass215;
import X.AnonymousClass21V;
import X.AnonymousClass21W;
import X.AnonymousClass21Y;
import X.AnonymousClass22W;
import X.AnonymousClass25A;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3NL;
import X.AnonymousClass3RQ;
import X.AnonymousClass3uK;
import X.AnonymousClass4PP;
import X.AnonymousClass4VQ;
import X.AnonymousClass4aU;
import X.AnonymousClass4aW;
import X.AnonymousClass689;
import X.AnonymousClass6MT;
import X.AnonymousClass6gC;
import X.AnonymousClass70T;
import X.AnonymousClass70X;
import X.AnonymousClass72Z;
import X.AnonymousClass745;
import X.AnonymousClass75R;
import X.AnonymousClass75Y;
import X.AnonymousClass787;
import X.AnonymousClass78A;
import X.AnonymousClass79U;
import X.AnonymousClass7E0;
import X.AnonymousClass7FH;
import X.AnonymousClass7JY;
import X.AnonymousClass7R0;
import X.AnonymousClass7RT;
import X.AnonymousClass87Z;
import X.AnonymousClass9Id;
import X.C107835ah;
import X.C108945cZ;
import X.C108955ca;
import X.C108965cb;
import X.C108975cc;
import X.C108985cd;
import X.C108995ce;
import X.C109375dL;
import X.C1193267r;
import X.C121606Ku;
import X.C121616Kv;
import X.C121626Kw;
import X.C122016Ml;
import X.C122076Mr;
import X.C129726iG;
import X.C130806k2;
import X.C132796nb;
import X.C133286oV;
import X.C135976t4;
import X.C136776uN;
import X.C136906ub;
import X.C137086ut;
import X.C138736xb;
import X.C139676zG;
import X.C145427Lf;
import X.C145917Nc;
import X.C145937Ne;
import X.C146807Qr;
import X.C1601987n;
import X.C160898Aj;
import X.C17880vN;
import X.C17890vO;
import X.C17900vP;
import X.C18000vb;
import X.C18010vc;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C192489oU;
import X.C19830z4;
import X.C19880zA;
import X.C20120A8f;
import X.C20947Ac1;
import X.C219217x;
import X.C221618v;
import X.C222119a;
import X.C22971Dz;
import X.C23301Fm;
import X.C23581Gv;
import X.C24671Lf;
import X.C24681Lg;
import X.C24771Lp;
import X.C24791Lr;
import X.C24921Me;
import X.C26204Cub;
import X.C26521Sl;
import X.C27066DRp;
import X.C27071Up;
import X.C28620EAs;
import X.C29781cr;
import X.C31131f4;
import X.C32021gV;
import X.C32091gc;
import X.C32211gp;
import X.C32431hB;
import X.C32571hP;
import X.C32861hs;
import X.C33251iW;
import X.C34441kU;
import X.C34531kd;
import X.C36331ni;
import X.C36341nj;
import X.C438421d;
import X.C45792Br;
import X.C62572rc;
import X.C64052u8;
import X.C70643By;
import X.C72453Mb;
import X.C72463Mc;
import X.C74873d3;
import X.C88634aG;
import X.C98834rn;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import com.facebook.msys.mci.DefaultCrypto;
import com.whatsapp.InteractiveAnnotation;
import com.whatsapp.SerializableLocation;
import com.whatsapp.conversation.conversationrow.ConversationRowVideo$RowVideoView;
import com.whatsapp.ephemeral.ViewOnceNuxBottomSheet;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.reactions.ReactionsTrayViewModel;
import com.whatsapp.ui.media.MediaCaptionTextView;
import com.whatsapp.util.Log;
import com.whatsapp.voicerecorder.VoiceNoteSeekBar;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class MediaViewFragment extends Hilt_MediaViewFragment implements C107835ah {
    public static final boolean A23 = AnonymousClass112.A02();
    public int A00;
    public int A01;
    public int A02 = 0;
    public int A03;
    public int A04 = 0;
    public int A05;
    public long A06;
    public Handler A07;
    public TextView A08;
    public DialogFragment A09;
    public DialogFragment A0A;
    public AnonymousClass7RT A0B;
    public C19880zA A0C;
    public AnonymousClass1L9 A0D;
    public AnonymousClass190 A0E;
    public AnonymousClass1KB A0F;
    public AnonymousClass11S A0G;
    public C34531kd A0H;
    public C33251iW A0I;
    public C24771Lp A0J;
    public AnonymousClass1M9 A0K;
    public C24671Lf A0L;
    public C24921Me A0M;
    public C24791Lr A0N;
    public AnonymousClass3RQ A0O;
    public C31131f4 A0P;
    public AnonymousClass11C A0Q;
    public C29781cr A0R;
    public AnonymousClass11P A0S;
    public AnonymousClass118 A0T;
    public C219217x A0U;
    public C19830z4 A0V;
    public C18000vb A0W;
    public AnonymousClass1CJ A0X;
    public AnonymousClass1ST A0Y;
    public C24681Lg A0Z;
    public C32211gp A0a;
    public C74873d3 A0b;
    public C1193267r A0c;
    public AnonymousClass1KW A0d;
    public C18030ve A0e;
    public AnonymousClass18K A0f;
    public AnonymousClass1BI A0g;
    public GroupJid A0h;
    public AnonymousClass689 A0i;
    public C32861hs A0j;
    public C32571hP A0k;
    public C32431hB A0l;
    public C160898Aj A0m;
    public MediaViewCurrentMessageViewModel A0n;
    public AnonymousClass87Z A0o;
    public C130806k2 A0p;
    public C138736xb A0q;
    public C32091gc A0r;
    public AnonymousClass1c4 A0s;
    public C34441kU A0t;
    public AnonymousClass1RU A0u;
    public C18010vc A0v;
    public C27071Up A0w;
    public AnonymousClass205 A0x;
    public AnonymousClass21V A0y;
    public AnonymousClass21V A0z;
    public AnonymousClass21V A10;
    public C139676zG A11;
    public C133286oV A12;
    public ReactionsTrayViewModel A13;
    public AnonymousClass4aW A14;
    public AnonymousClass1W6 A15;
    public MediaCaptionTextView A16;
    public C36331ni A17;
    public AnonymousClass70T A18;
    public C136776uN A19;
    public AnonymousClass1L4 A1A;
    public C26521Sl A1B;
    public C32021gV A1C;
    public AnonymousClass10I A1D;
    public AnonymousClass70X A1E = null;
    public VoiceNoteSeekBar A1F;
    public AnonymousClass00H A1G;
    public AnonymousClass00H A1H;
    public AnonymousClass00H A1I;
    public AnonymousClass00H A1J;
    public AnonymousClass00H A1K = C221618v.A00(AnonymousClass170.class);
    public AnonymousClass00H A1L;
    public AnonymousClass00H A1M;
    public AnonymousClass00H A1N;
    public AnonymousClass00H A1O;
    public AnonymousClass00H A1P;
    public AnonymousClass00H A1Q;
    public AnonymousClass00H A1R;
    public AnonymousClass00H A1S;
    public AnonymousClass00H A1T;
    public AnonymousClass00H A1U;
    public AnonymousClass00H A1V;
    public AnonymousClass00H A1W;
    public AnonymousClass00H A1X;
    public AnonymousClass00H A1Y;
    public AnonymousClass00H A1Z;
    public AnonymousClass00H A1a;
    public AnonymousClass00H A1b;
    public boolean A1c;
    public boolean A1d;
    public boolean A1e = false;
    public boolean A1f;
    public boolean A1g;
    public boolean A1h;
    public boolean A1i = true;
    public boolean A1j = true;
    public boolean A1k;
    public boolean A1l;
    public boolean A1m;
    public boolean A1n = false;
    public boolean A1o;
    public int A1p;
    public long A1q = -1;
    public View A1r;
    public ImageButton A1s;
    public C132796nb A1t;
    public boolean A1u;
    public boolean A1v;
    public final Runnable A1w = C108945cZ.A0X(this, 20);
    public final HashMap A1x = C17880vN.A11();
    public final Map A1y = C17880vN.A11();
    public final Map A1z = C17880vN.A11();
    public final C23581Gv A20 = new AnonymousClass7E0(this, 7);
    public final AnonymousClass1WR A21 = new AnonymousClass7FH(this, 2);
    public final C1601987n A22 = new C145427Lf(this, 1);

    public static int A02(int i) {
        if (i == 1) {
            return 2131890610;
        }
        if (i == 2) {
            return 2131890602;
        }
        if (i != 3) {
            if (i == 9) {
                return 2131890608;
            }
            if (i == 13) {
                return 2131890609;
            }
            if (i == 42) {
                return 2131890610;
            }
            if (i == 43) {
                return 2131890638;
            }
            return 2131890614;
        }
        return 2131890638;
    }

    public static void A0A(InteractiveAnnotation interactiveAnnotation, MediaViewFragment mediaViewFragment, PhotoView photoView) {
        PhotoView photoView2 = photoView;
        Context context = photoView.getContext();
        InteractiveAnnotation interactiveAnnotation2 = interactiveAnnotation;
        if (interactiveAnnotation.skipConfirmation) {
            A07(context, interactiveAnnotation, mediaViewFragment);
            return;
        }
        C18000vb r3 = mediaViewFragment.A0W;
        C132796nb r5 = new C132796nb(context, new AnonymousClass78A(mediaViewFragment, interactiveAnnotation, context, 14), (ViewGroup) photoView.getRootView(), r3);
        mediaViewFragment.A1t = r5;
        r5.A00((PopupWindow.OnDismissListener) null, interactiveAnnotation2, photoView2, (Float) null, (Float) null, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0B(X.C62572rc r8, com.whatsapp.mediaview.MediaViewFragment r9, X.AnonymousClass21W r10, X.C122076Mr r11, java.io.File r12) {
        /*
            r5 = r10
            X.205 r3 = r10.A0v
            X.1BI r0 = r3.A00
            boolean r0 = X.C22971Dz.A0V(r0)
            r4 = r9
            if (r0 == 0) goto L_0x0042
            X.0ve r2 = r9.A0e
            r1 = 7170(0x1c02, float:1.0047E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 != 0) goto L_0x001c
            boolean r0 = r9.A1k
            if (r0 == 0) goto L_0x0042
        L_0x001c:
            r10 = 6
        L_0x001d:
            boolean r0 = r3.A02
            r9 = 1
            if (r0 == 0) goto L_0x0023
            r9 = 3
        L_0x0023:
            X.0ve r2 = r4.A0e
            r0 = 0
            X.C18070vi.A0d(r2, r0)
            X.0vf r1 = X.C18040vf.A01
            r0 = 6649(0x19f9, float:9.317E-42)
            boolean r0 = X.C18020vd.A05(r1, r2, r0)
            r6 = r8
            r8 = r11
            r7 = r12
            if (r0 == 0) goto L_0x0044
            X.10I r0 = r4.A1D
            r11 = 1
            X.7QM r3 = new X.7QM
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            r0.CGF(r3)
            return
        L_0x0042:
            r10 = 1
            goto L_0x001d
        L_0x0044:
            r0 = r6
            r1 = r4
            r2 = r5
            r3 = r12
            r4 = r9
            r5 = r10
            X.6Ml r0 = A05(r0, r1, r2, r3, r4, r5)
            r11.A09 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.mediaview.MediaViewFragment.A0B(X.2rc, com.whatsapp.mediaview.MediaViewFragment, X.21W, X.6Mr, java.io.File):void");
    }

    public static void A0g(MediaViewFragment mediaViewFragment, AnonymousClass21V r10, int i, boolean z) {
        AnonymousClass70X r3;
        MediaViewFragment mediaViewFragment2 = mediaViewFragment;
        if (mediaViewFragment.A0B == null) {
            Log.e("MediaViewFragment/playMedia/getView() is null");
            return;
        }
        mediaViewFragment.A0P.A04();
        A74.A03((A74) mediaViewFragment.A1I.get(), mediaViewFragment.A10, 5);
        boolean z2 = mediaViewFragment.A1f;
        int i2 = r10.A0u;
        boolean A002 = AnonymousClass72Z.A00(i2);
        if (z2) {
            if ((A002 || C108985cd.A1U(i2)) && z && (r3 = mediaViewFragment.A1E) != null) {
                int i3 = mediaViewFragment.A05;
                if (r3 instanceof C122076Mr) {
                    r3.A01 = i3;
                }
                r3.A0F();
                mediaViewFragment.A1E.A0M(i);
                mediaViewFragment.A1E.A0E();
                mediaViewFragment.A1D().invalidateOptionsMenu();
                return;
            }
        } else if (A002) {
            mediaViewFragment.A0F.A07(0, 2131891797);
            AnonymousClass1KB r7 = mediaViewFragment.A0F;
            AnonymousClass190 r6 = mediaViewFragment.A0E;
            AnonymousClass10I r5 = mediaViewFragment.A1D;
            C32211gp r4 = mediaViewFragment.A0a;
            C145917Nc r32 = new C145917Nc(mediaViewFragment, 21);
            C45792Br r1 = new C45792Br(r6, r4, r10);
            r1.A0A(r32, r7.A05);
            r5.CGF(r1);
            C62572rc A003 = AnonymousClass206.A00(r10);
            if (mediaViewFragment2.A1i) {
                mediaViewFragment2.A1D.CGF(new AnonymousClass7RT(mediaViewFragment2, A003, r10, 31, z));
            }
            mediaViewFragment2.A1i = false;
            return;
        } else if (C108985cd.A1U(i2)) {
            AnonymousClass70X r0 = (AnonymousClass70X) mediaViewFragment.A1y.get(r10.A0v);
            if (r0 != null) {
                r0.A0E();
                return;
            }
            return;
        }
        if (i2 == 2) {
            A0M(mediaViewFragment, r10);
            if (mediaViewFragment.A18 != null) {
                mediaViewFragment.A19.A01();
                try {
                    mediaViewFragment.A18.A08();
                    if (i > 0) {
                        mediaViewFragment.A18.A0A(i);
                        VoiceNoteSeekBar voiceNoteSeekBar = mediaViewFragment.A1F;
                        if (voiceNoteSeekBar != null) {
                            voiceNoteSeekBar.setProgress(mediaViewFragment.A18.A02());
                        }
                    }
                    mediaViewFragment.A02 = 1;
                    Handler handler = mediaViewFragment.A07;
                    if (handler != null) {
                        handler.sendEmptyMessage(0);
                    }
                    A0F(mediaViewFragment);
                } catch (IOException e) {
                    Log.e("MediaViewFragment/playMedia failed to start", e);
                    C108995ce.A11(mediaViewFragment);
                }
            }
        } else if (i2 == 9) {
            Log.i("MediaViewFragment/playMedia trying to open document");
            mediaViewFragment.A0F.A07(0, 2131891797);
            AnonymousClass1KB r62 = mediaViewFragment.A0F;
            AnonymousClass190 r52 = mediaViewFragment.A0E;
            AnonymousClass10I r42 = mediaViewFragment.A1D;
            C32211gp r33 = mediaViewFragment.A0a;
            C145937Ne r2 = new C145937Ne(r10, mediaViewFragment, 23);
            C45792Br r12 = new C45792Br(r52, r33, r10);
            r12.A0A(r2, r62.A05);
            r42.CGF(r12);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b7, code lost:
        r2.A2C(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00ba, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00bb, code lost:
        if (r12 != 0) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00bd, code lost:
        if (r13 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00bf, code lost:
        r10.A0w.A03(r13, X.C108945cZ.A0Y(r10));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00c8, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:?, code lost:
        return;
     */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:43:0x00dd=Splitter:B:43:0x00dd, B:67:0x016f=Splitter:B:67:0x016f} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1w(int r11, int r12, android.content.Intent r13) {
        /*
            r10 = this;
            r3 = 0
            r0 = -1
            switch(r11) {
                case 0: goto L_0x0009;
                case 1: goto L_0x0033;
                case 2: goto L_0x0057;
                case 3: goto L_0x0094;
                case 4: goto L_0x00c9;
                case 5: goto L_0x0104;
                case 6: goto L_0x014c;
                default: goto L_0x0005;
            }
        L_0x0005:
            super.A1w(r11, r12, r13)
        L_0x0008:
            return
        L_0x0009:
            if (r12 != r0) goto L_0x0008
            if (r13 == 0) goto L_0x0008
            android.net.Uri r0 = r13.getData()
            if (r0 == 0) goto L_0x0008
            android.net.Uri r4 = r13.getData()
            int r0 = r10.A04
            X.21V r0 = A04(r10, r0)
            if (r0 != 0) goto L_0x002e
            r3 = 0
        L_0x0020:
            android.content.Context r2 = r10.A14()
            X.4aW r1 = r10.A14
            r0 = 1
            r1.A0D(r2, r4, r3, r0)
            X.C26511Sk.A0O(r2, r4)
            return
        L_0x002e:
            X.205 r0 = r0.A0v
            X.1BI r3 = r0.A00
            goto L_0x0020
        L_0x0033:
            if (r12 != r0) goto L_0x00bb
            X.1Up r1 = r10.A0w
            X.11S r0 = r10.A0G
            r0.A0I()
            X.1E8 r0 = r0.A0D
            X.C17960vV.A07(r0)
            boolean r0 = r1.A0F(r0)
            if (r0 == 0) goto L_0x0008
            r0 = 2131897385(0x7f122c29, float:1.9429658E38)
            com.whatsapp.dialogs.ProgressDialogFragment r2 = com.whatsapp.dialogs.ProgressDialogFragment.A00(r3, r0)
            r10.A0A = r2
            X.1GP r1 = r10.A1E()
            java.lang.String r0 = "photo_progress_fragment"
            goto L_0x00b7
        L_0x0057:
            if (r12 != r0) goto L_0x0008
            if (r13 == 0) goto L_0x0008
            java.lang.String r0 = "contact"
            java.lang.String r1 = r13.getStringExtra(r0)
            X.1nh r0 = com.whatsapp.jid.GroupJid.Companion
            com.whatsapp.jid.GroupJid r0 = r0.A03(r1)
            r10.A0h = r0
            java.lang.String r0 = "message_row_id"
            long r1 = X.C108975cc.A05(r13, r0)
            com.whatsapp.mediaview.MediaViewCurrentMessageViewModel r0 = r10.A0n
            if (r0 == 0) goto L_0x016f
            X.0ve r4 = r10.A0e
            X.C18070vi.A0d(r4, r3)
            X.0vf r3 = X.C18040vf.A01
            r0 = 6649(0x19f9, float:9.317E-42)
            boolean r0 = X.C18020vd.A05(r3, r4, r0)
            if (r0 == 0) goto L_0x016f
            com.whatsapp.mediaview.MediaViewCurrentMessageViewModel r6 = r10.A0n
            X.1OX r5 = X.C41561wd.A00(r6)
            X.0wl r4 = r6.A06
            r3 = 0
            com.whatsapp.mediaview.MediaViewCurrentMessageViewModel$requestCodePickupGroup$1 r0 = new com.whatsapp.mediaview.MediaViewCurrentMessageViewModel$requestCodePickupGroup$1
            r0.<init>(r6, r3, r1)
            X.AnonymousClass3MW.A1X(r4, r0, r5)
            return
        L_0x0094:
            if (r12 != r0) goto L_0x00bb
            com.whatsapp.jid.GroupJid r2 = r10.A0h
            if (r2 == 0) goto L_0x0008
            X.1Up r1 = r10.A0w
            X.1M9 r0 = r10.A0K
            X.1E7 r0 = r0.A0H(r2)
            boolean r0 = r1.A0F(r0)
            if (r0 == 0) goto L_0x0008
            r0 = 2131897383(0x7f122c27, float:1.9429654E38)
            com.whatsapp.dialogs.ProgressDialogFragment r2 = com.whatsapp.dialogs.ProgressDialogFragment.A00(r3, r0)
            r10.A09 = r2
            X.1GP r1 = r10.A1E()
            java.lang.String r0 = "group_progress_fragment"
        L_0x00b7:
            r2.A2C(r1, r0)
            return
        L_0x00bb:
            if (r12 != 0) goto L_0x0008
            if (r13 == 0) goto L_0x0008
            X.1Up r1 = r10.A0w
            X.1FU r0 = X.C108945cZ.A0Y(r10)
            r1.A03(r13, r0)
            return
        L_0x00c9:
            if (r12 != r0) goto L_0x0008
            if (r13 == 0) goto L_0x0008
            X.205 r1 = X.AnonymousClass4aU.A02(r13)
            int r0 = r10.A04
            X.21V r2 = A04(r10, r0)
            if (r2 == 0) goto L_0x00dd
            X.205 r0 = r2.A0v
            if (r0 == r1) goto L_0x00e7
        L_0x00dd:
            X.1W6 r0 = r10.A15     // Catch:{ all -> 0x01cd }
            X.206 r2 = X.C108945cZ.A0s(r1, r0)     // Catch:{ all -> 0x01cd }
            if (r2 != 0) goto L_0x00e7
            goto L_0x017d
        L_0x00e7:
            java.lang.String r0 = "ad_creation_tapped"
            boolean r0 = r13.getBooleanExtra(r0, r3)
            if (r0 == 0) goto L_0x018b
            X.0zA r1 = r10.A0C
            boolean r0 = r1.A07()
            if (r0 == 0) goto L_0x0008
            r1.A03()
            r10.A1D()
            java.lang.String r0 = "handleAdvertiseForwardClick"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x0104:
            if (r12 != r0) goto L_0x0008
            if (r13 == 0) goto L_0x0008
            X.1BI r0 = r10.A0g
            boolean r0 = X.C42701yb.A01(r0)
            if (r0 == 0) goto L_0x01cf
            X.00H r0 = r10.A1H
            X.1UD r0 = X.AnonymousClass3MW.A0X(r0)
            boolean r0 = r0.A0B()
            if (r0 == 0) goto L_0x01cf
            X.00H r0 = r10.A1b
            X.1LU r2 = X.C108945cZ.A0h(r0)
            android.content.Context r1 = r10.A14()
            X.1BI r0 = r10.A0g
            android.content.Intent r1 = r2.A1w(r1, r0, r3)
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            android.content.Intent r0 = r1.addFlags(r0)
            android.content.Intent r2 = r0.putExtras(r13)
            android.content.Context r1 = r10.A14()
            android.content.Intent r0 = X.C17880vN.A0A()
            android.app.PendingIntent r1 = X.C1408573i.A00(r1, r3, r0, r3)
            java.lang.String r0 = "_ci_"
            android.content.Intent r0 = r2.putExtra(r0, r1)
            r10.A1k(r0)
            return
        L_0x014c:
            if (r12 != r0) goto L_0x0008
            if (r13 == 0) goto L_0x0008
            android.net.Uri r0 = r13.getData()
            if (r0 == 0) goto L_0x0008
            android.net.Uri r4 = r13.getData()
            X.1BI r3 = X.C88594aB.A04(r13)
            android.content.Context r2 = r10.A14()
            X.4aW r1 = r10.A14
            r0 = 1
            r1.A0D(r2, r4, r3, r0)
            X.C26511Sk.A0O(r2, r4)
            r10.A2D()
            return
        L_0x016f:
            X.1W6 r0 = r10.A15     // Catch:{ all -> 0x01cd }
            X.1W2 r0 = r0.A01     // Catch:{ all -> 0x01cd }
            X.206 r0 = r0.A03(r1)     // Catch:{ all -> 0x01cd }
            X.21V r0 = (X.AnonymousClass21V) r0
            A0d(r10, r0)
            return
        L_0x017d:
            java.lang.String r0 = "MediaViewFragment/onActivityResult/forward/failed"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.1KB r1 = r10.A0F
            r0 = 2131892058(0x7f12175a, float:1.9418854E38)
            r1.A08(r0, r3)
            return
        L_0x018b:
            java.lang.Class<X.1BI> r0 = X.AnonymousClass1BI.class
            java.util.ArrayList r8 = X.C72463Mc.A0r(r13, r0)
            java.lang.String r0 = "include_captions"
            boolean r9 = r13.getBooleanExtra(r0, r3)
            java.lang.String r0 = "appended_message"
            java.lang.String r6 = r13.getStringExtra(r0)
            X.1BI r0 = X.C22971Dz.A01(r8)
            if (r0 == 0) goto L_0x01cb
            X.36j r5 = new X.36j
            r5.<init>()
            X.00H r0 = r10.A1Y
            X.727 r1 = X.C108945cZ.A0u(r0)
            android.os.Bundle r0 = r13.getExtras()
            X.C17960vV.A07(r0)
            X.77K r0 = r1.A02(r0)
            r5.A00(r0)
        L_0x01bc:
            X.1iW r3 = r10.A0I
            X.1kd r4 = r10.A0H
            java.util.List r7 = java.util.Collections.singletonList(r2)
            r3.A0N(r4, r5, r6, r7, r8, r9)
            r10.A0h(r8)
            return
        L_0x01cb:
            r5 = 0
            goto L_0x01bc
        L_0x01cd:
            r0 = move-exception
            throw r0
        L_0x01cf:
            java.lang.Class<X.1BI> r0 = X.AnonymousClass1BI.class
            java.util.ArrayList r0 = X.C72463Mc.A0r(r13, r0)
            r10.A0h(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.mediaview.MediaViewFragment.A1w(int, int, android.content.Intent):void");
    }

    public /* synthetic */ void Br5() {
    }

    public static MediaViewFragment A03(Bundle bundle, AnonymousClass1BI r4, AnonymousClass205 r5, int i, int i2, int i3, int i4, int i5, long j, boolean z, boolean z2, boolean z3, boolean z4) {
        MediaViewFragment mediaViewFragment = new MediaViewFragment();
        Bundle A0D2 = C17880vN.A0D();
        AnonymousClass4aU.A0A(A0D2, r5);
        if (r4 != null) {
            AnonymousClass3MY.A15(A0D2, r4, "jid");
        }
        A0D2.putInt("player_start_pos", i);
        A0D2.putBoolean("gallery", z);
        A0D2.putBoolean("nogallery", z2);
        A0D2.putInt("video_play_origin", i2);
        A0D2.putLong("start_t", j);
        A0D2.putBundle("animation_bundle", bundle);
        A0D2.putInt("navigator_type", i4);
        A0D2.putInt("menu_style", i3);
        A0D2.putBoolean("menu_set_wallpaper", z3);
        A0D2.putInt("message_card_index", i5);
        A0D2.putBoolean("has_high_quality_thumbnail", z4);
        mediaViewFragment.A1R(A0D2);
        return mediaViewFragment;
    }

    public static AnonymousClass21V A04(MediaViewFragment mediaViewFragment, int i) {
        C160898Aj r0 = mediaViewFragment.A0m;
        if (r0 == null) {
            return null;
        }
        return r0.BUg(i);
    }

    public static C122016Ml A05(C62572rc r21, MediaViewFragment mediaViewFragment, AnonymousClass21W r23, File file, int i, int i2) {
        MediaViewFragment mediaViewFragment2 = mediaViewFragment;
        AnonymousClass11P r8 = mediaViewFragment2.A0S;
        C18030ve r9 = mediaViewFragment2.A0e;
        AnonymousClass18K r10 = mediaViewFragment2.A0f;
        AnonymousClass21W r1 = r23;
        long j = (long) r1.A0D;
        Integer valueOf = Integer.valueOf(i2);
        long j2 = r1.A01;
        C62572rc r12 = r21;
        long j3 = j2;
        C122016Ml r7 = new C122016Ml(r8, r9, r10, valueOf, i, 2, j, 0, j3, (long) r12.A08, (long) r12.A06);
        mediaViewFragment2.A1D.CGF(new AnonymousClass7R0(mediaViewFragment2, r7, file, 28));
        return r7;
    }

    private void A06() {
        ImageButton imageButton = this.A1s;
        if (imageButton != null) {
            AnonymousClass3NL.A01(A14(), imageButton, this.A0W, 2131232220);
            C108955ca.A1J(this.A1s, this, 2131899314);
        }
        View view = this.A1r;
        if (view != null) {
            AnonymousClass1Y5.A02(view, 2131899314);
        }
    }

    public static void A07(Context context, InteractiveAnnotation interactiveAnnotation, MediaViewFragment mediaViewFragment) {
        Integer num;
        Object obj = interactiveAnnotation.data;
        Context context2 = context;
        if (obj instanceof SerializableLocation) {
            SerializableLocation serializableLocation = (SerializableLocation) obj;
            mediaViewFragment.A0i.A09(context2, serializableLocation.name, (String) null, serializableLocation.latitude, serializableLocation.longitude);
        } else if (obj instanceof C20947Ac1) {
            C20947Ac1 ac1 = (C20947Ac1) obj;
            AnonymousClass9Id r0 = ac1.A02;
            boolean z = interactiveAnnotation.skipConfirmation;
            if (r0 != null) {
                int ordinal = r0.ordinal();
                if (ordinal == 0) {
                    num = AnonymousClass00R.A0C;
                } else if (ordinal == 1) {
                    num = AnonymousClass00R.A03;
                } else if (ordinal != 2) {
                    return;
                } else {
                    if (z) {
                        num = AnonymousClass00R.A02;
                    } else {
                        num = AnonymousClass00R.A19;
                    }
                }
                ((C36341nj) mediaViewFragment.A1T.get()).A04(context2, ac1.A01, num, 0, (long) ac1.A00);
            }
        }
    }

    public static void A08(Bitmap bitmap, MediaViewFragment mediaViewFragment) {
        AnonymousClass4VQ r0;
        AnonymousClass3uK r02 = ((AnonymousClass170) mediaViewFragment.A1K.get()).A01;
        if (r02 != null && (r0 = r02.A06) != null) {
            r0.hashCode();
            ConversationRowVideo$RowVideoView conversationRowVideo$RowVideoView = r0.A0G;
            conversationRowVideo$RowVideoView.setImageDrawable(C108965cb.A05(bitmap, conversationRowVideo$RowVideoView));
        }
    }

    public static void A09(View view, MediaViewFragment mediaViewFragment, AnonymousClass206 r11, int i) {
        ReactionsTrayViewModel reactionsTrayViewModel = mediaViewFragment.A13;
        if (reactionsTrayViewModel != null) {
            int A0A2 = C72463Mc.A0A(reactionsTrayViewModel.A0F);
            ReactionsTrayViewModel reactionsTrayViewModel2 = mediaViewFragment.A13;
            if (A0A2 == 1) {
                reactionsTrayViewModel2.A0T(0);
                return;
            }
            reactionsTrayViewModel2.A0V(r11, 3);
            C18000vb r4 = mediaViewFragment.A0W;
            AnonymousClass11C r3 = mediaViewFragment.A0Q;
            View view2 = view;
            mediaViewFragment.A0O = new AnonymousClass3RQ(view2, C108945cZ.A0Y(mediaViewFragment), r3, r4, r11, mediaViewFragment.A13, (Runnable) null, true);
            mediaViewFragment.A13.A0U(i);
        }
    }

    public static void A0C(MediaViewFragment mediaViewFragment) {
        File file;
        View findViewById;
        if (mediaViewFragment.A1u) {
            Log.i("MediaViewFragment/maybeSetLastPositionPlayedForBackPressed");
            AnonymousClass70X r2 = mediaViewFragment.A1E;
            if (r2 != null && r2 == mediaViewFragment.A1z.get(mediaViewFragment.A0x)) {
                mediaViewFragment.A1E.A0B();
                C17890vO.A0z(mediaViewFragment.A0x, mediaViewFragment.A1x, mediaViewFragment.A1E.A05());
                Bitmap A082 = mediaViewFragment.A1E.A08();
                int i = mediaViewFragment.A04;
                if (A082 != null) {
                    A08(A082, mediaViewFragment);
                    AnonymousClass21V A042 = A04(mediaViewFragment, i);
                    if (A042 != null) {
                        View findViewWithTag = mediaViewFragment.A09.findViewWithTag(A042.A0v);
                        C62572rc r0 = A042.A02;
                        if (r0 != null) {
                            file = r0.A0G;
                        } else {
                            file = null;
                        }
                        if (!(findViewWithTag == null || file == null || (findViewById = findViewWithTag.findViewById(2131436135)) == null)) {
                            ((PhotoView) findViewById).A0B(new C109375dL(findViewById.getResources(), A082, A042));
                        }
                    }
                }
            }
            Intent A0A2 = C17880vN.A0A();
            A0A2.putExtra("player_start_pos", (Serializable) mediaViewFragment.A1x.get(mediaViewFragment.A0x));
            mediaViewFragment.A1D().setResult(-1, A0A2);
        }
    }

    public static void A0D(MediaViewFragment mediaViewFragment) {
        AnonymousClass70T r2 = mediaViewFragment.A18;
        if (r2 != null && mediaViewFragment.A02 != 2) {
            r2.A04();
            mediaViewFragment.A06();
            mediaViewFragment.A02 = 2;
        }
    }

    public static void A0E(MediaViewFragment mediaViewFragment) {
        AnonymousClass21V r1 = mediaViewFragment.A10;
        if (r1 != null && r1.A0w()) {
            long uptimeMillis = SystemClock.uptimeMillis();
            long min = Math.min(C17890vO.A03(r1.A0D), 3000);
            AnonymousClass21V r8 = mediaViewFragment.A10;
            if (r8.A0w() && (r8 instanceof AnonymousClass21Y)) {
                long j = mediaViewFragment.A1q;
                if (j > 0 && r8.A0D() != 16 && !r8.A0v.A02 && uptimeMillis - j > min) {
                    ((C88634aG) mediaViewFragment.A1U.get()).A04(mediaViewFragment.A10);
                }
            }
            mediaViewFragment.A1q = uptimeMillis;
        }
    }

    public static void A0F(MediaViewFragment mediaViewFragment) {
        ImageButton imageButton = mediaViewFragment.A1s;
        if (imageButton != null) {
            AnonymousClass3NL.A01(mediaViewFragment.A14(), imageButton, mediaViewFragment.A0W, 2131232165);
            C108955ca.A1J(mediaViewFragment.A1s, mediaViewFragment, 2131893587);
        }
        View view = mediaViewFragment.A1r;
        if (view != null) {
            AnonymousClass1Y5.A02(view, 2131893587);
        }
    }

    public static void A0G(MediaViewFragment mediaViewFragment) {
        AnonymousClass70T r0 = mediaViewFragment.A18;
        if (r0 != null) {
            r0.A06();
            mediaViewFragment.A18 = null;
            mediaViewFragment.A02 = 0;
        }
        VoiceNoteSeekBar voiceNoteSeekBar = mediaViewFragment.A1F;
        if (voiceNoteSeekBar != null) {
            voiceNoteSeekBar.setProgress(0);
        }
        mediaViewFragment.A06();
        TextView textView = mediaViewFragment.A08;
        if (textView != null) {
            C108975cc.A0y(textView, mediaViewFragment.A0W, 0);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
        if (r0 != false) goto L_0x0024;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x006a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0H(com.whatsapp.mediaview.MediaViewFragment r5) {
        /*
            boolean r0 = r5.A1m
            if (r0 == 0) goto L_0x0043
            boolean r0 = r5.A1d
            if (r0 == 0) goto L_0x0043
            X.0ve r0 = r5.A0e
            boolean r2 = X.C1402270m.A01(r0)
            X.21V r0 = r5.A0z
            if (r0 == 0) goto L_0x0049
            boolean r0 = r0 instanceof X.C441822l
            X.17x r1 = r5.A0U
            if (r0 == 0) goto L_0x0044
            boolean r0 = X.AnonymousClass112.A07()
            if (r0 != 0) goto L_0x0024
            boolean r0 = r1.A0G()
        L_0x0022:
            if (r0 == 0) goto L_0x0049
        L_0x0024:
            X.21V r4 = r5.A0z
            r0 = 0
            r5.A0z = r0
            if (r2 == 0) goto L_0x004c
            r3 = 1
            X.1FL r0 = r5.A1B()
            if (r0 == 0) goto L_0x0043
            boolean r0 = r0.isFinishing()
            if (r0 != 0) goto L_0x0043
            X.1KB r2 = r5.A0F
            r1 = 2
            X.7Qx r0 = new X.7Qx
            r0.<init>(r5, r4, r1, r3)
            r2.CGP(r0)
        L_0x0043:
            return
        L_0x0044:
            boolean r0 = r1.A0D()
            goto L_0x0022
        L_0x0049:
            if (r2 == 0) goto L_0x0059
            return
        L_0x004c:
            X.7Jd r1 = new X.7Jd
            r1.<init>(r5, r4)
            boolean r0 = r5.A0F
            if (r0 != 0) goto L_0x0067
            r0 = 1
            r1.C9F(r0)
        L_0x0059:
            boolean r0 = r5.A2M()
            if (r0 == 0) goto L_0x006a
            X.1FL r0 = r5.A1D()
            r0.A2Z()
            return
        L_0x0067:
            r5.A0A = r1
            goto L_0x0059
        L_0x006a:
            r5.A1M()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.mediaview.MediaViewFragment.A0H(com.whatsapp.mediaview.MediaViewFragment):void");
    }

    public static void A0J(MediaViewFragment mediaViewFragment, int i, boolean z) {
        AnonymousClass21V A042;
        C62572rc r0;
        File file;
        if (z) {
            C18030ve r1 = mediaViewFragment.A0e;
            C18040vf r2 = C18040vf.A02;
            if ((C18020vd.A05(r2, r1, 1466) || C18020vd.A05(r2, mediaViewFragment.A0e, 3773)) && (A042 = A04(mediaViewFragment, i)) != null && !mediaViewFragment.A0x.A02 && (r0 = A042.A02) != null && (file = r0.A0G) != null) {
                C26521Sl r3 = mediaViewFragment.A1B;
                AnonymousClass6MT r22 = new AnonymousClass6MT(Uri.fromFile(file), mediaViewFragment.A22, r3);
                ((C192489oU) mediaViewFragment.A1W.get()).A00("photo_received");
                C17890vO.A0u(r22, mediaViewFragment.A1D);
            }
        }
    }

    public static void A0e(MediaViewFragment mediaViewFragment, AnonymousClass21V r5) {
        String A0q2 = C108965cb.A0q(mediaViewFragment.A0S, mediaViewFragment.A0W, r5.A0I);
        if (A0i(mediaViewFragment, r5)) {
            A0q2 = mediaViewFragment.A1I(2131891188, AnonymousClass000.A1b(A0q2, 1));
        }
        TextView textView = mediaViewFragment.A05;
        if (textView != null) {
            textView.setText(A0q2);
        }
    }

    public static boolean A0i(MediaViewFragment mediaViewFragment, AnonymousClass21V r4) {
        if (!(r4 instanceof C438421d) && !(r4 instanceof AnonymousClass22W)) {
            return false;
        }
        C62572rc A002 = AnonymousClass206.A00(r4);
        C136906ub A0j2 = C108945cZ.A0j(mediaViewFragment.A1O);
        C18070vi.A0d(A002, 0);
        if (!A002.A0V || !A0j2.A01(A002, false) || !A0j2.A04(false)) {
            return false;
        }
        return true;
    }

    public void A1k(Intent intent) {
        C160898Aj r0 = this.A0m;
        if (r0 != null) {
            r0.Byw();
        }
        super.A1k(intent);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0184, code lost:
        r15 = r11.A02.A0H(r2);
        r14 = (X.C24921Me) r11.A0d.get();
        r16 = X.AnonymousClass3MX.A17(r14, r15);
        r1 = r15.A0G;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x019c, code lost:
        if (r16.isEmpty() != false) goto L_0x01c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01a0, code lost:
        if (r15.A0H != null) goto L_0x01c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01a6, code lost:
        if (r15.A0C() != false) goto L_0x01c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01a8, code lost:
        if (r1 == null) goto L_0x01b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01aa, code lost:
        r0 = r1.A08;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x01ac, code lost:
        if (r0 == null) goto L_0x01b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0039, code lost:
        if (((X.C42211xo) r11.A0Z.get()).A03(r1) == false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x01b2, code lost:
        if (r0.isEmpty() == false) goto L_0x01c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x01c3, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r14.A04, 8000) != false) goto L_0x01c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x01c5, code lost:
        r16 = X.AnonymousClass3MY.A0q(r14, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x01c9, code lost:
        r17.setTitle(X.C72473Md.A0j(r25, r16, 2131895215));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x01dd, code lost:
        if (X.AnonymousClass72Z.A00(r27) == false) goto L_0x01ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x01e3, code lost:
        if (r13.A0v.A02 != false) goto L_0x01ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x01e5, code lost:
        if (r7 == null) goto L_0x01ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x01e7, code lost:
        r14 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x01ea, code lost:
        if (r7.A0V == false) goto L_0x01ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x01ec, code lost:
        r14 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x01ed, code lost:
        if (r7 == null) goto L_0x0201;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x01f1, code lost:
        if (r7.A0f != false) goto L_0x0201;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x01f5, code lost:
        if (r7.A0V != false) goto L_0x0201;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x01f7, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x01ff, code lost:
        if (r11.A06.A01(r7, false) != false) goto L_0x0202;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0201, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0202, code lost:
        r7 = true;
        r11 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0208, code lost:
        if (X.C20120A8f.A06(r13) == false) goto L_0x0210;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x020a, code lost:
        r5 = false;
        r19 = false;
        r20 = false;
        r7 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0221, code lost:
        if (r20 == false) goto L_0x0223;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0248, code lost:
        if (r9 != false) goto L_0x024a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0041, code lost:
        if (r3 != false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x02a6, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r11.A03, 535) == false) goto L_0x02b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x02a8, code lost:
        r0 = ((X.C88174Yp) r3.get()).A03(r13);
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x02b3, code lost:
        if (r0 != false) goto L_0x016d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x02b5, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x02b8, code lost:
        r18 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0078, code lost:
        if (((X.C32911hx) r11.A0G.get()).A01(r13) == false) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007c, code lost:
        if (r5 == false) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007e, code lost:
        r8 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008b, code lost:
        if (((X.C88174Yp) r11.A0P.get()).A04(r13) != false) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x008d, code lost:
        r8 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x008e, code lost:
        r3 = r11.A0P;
        r19 = ((X.C88174Yp) r3.get()).A05(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x009a, code lost:
        if (r5 != false) goto L_0x00c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00ac, code lost:
        if (X.C42761yh.A01((X.AnonymousClass12L) r11.A0J.get(), r13.A0v.A00) != false) goto L_0x00c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00b2, code lost:
        if (r13.A0w() != false) goto L_0x00c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b8, code lost:
        if ((!(r13 instanceof X.AnonymousClass215)) == false) goto L_0x00c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00ba, code lost:
        r24 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00c0, code lost:
        if (X.C22971Dz.A0S(r1) == false) goto L_0x00c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00c2, code lost:
        r24 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00c4, code lost:
        if (r5 != false) goto L_0x00d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00c6, code lost:
        r4 = r13.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00cc, code lost:
        if (r13.A0v.A02 == false) goto L_0x02b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00ce, code lost:
        if (r4 == null) goto L_0x02b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00d2, code lost:
        if (r4.A0V != false) goto L_0x02b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00d4, code lost:
        com.whatsapp.util.Log.w("mediaViewFragment/cannot save partially uploaded message.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00d9, code lost:
        r18 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00db, code lost:
        r7 = r13.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00dd, code lost:
        if (r5 != false) goto L_0x0144;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00e1, code lost:
        if (r7 == null) goto L_0x00f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00e5, code lost:
        if ((r13 instanceof X.C438421d) == false) goto L_0x00f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00e9, code lost:
        if (r7.A0V == false) goto L_0x00f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00eb, code lost:
        r14 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00f2, code lost:
        if (r11.A06.A01(r7, false) != false) goto L_0x00f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00f4, code lost:
        r14 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00f5, code lost:
        if (r7 == null) goto L_0x010c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00f9, code lost:
        if ((r13 instanceof X.AnonymousClass21Y) == false) goto L_0x010c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0101, code lost:
        if (r11.A07.A02(r7) == false) goto L_0x010c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0103, code lost:
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x010a, code lost:
        if (X.DPW.A0V.A00() == 1) goto L_0x010d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x010c, code lost:
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x010d, code lost:
        r4 = r13.A0v;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x011d, code lost:
        if (X.C42761yh.A01((X.AnonymousClass12L) X.C18070vi.A0E(r11.A0J), r4.A00) != false) goto L_0x0144;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0123, code lost:
        if (X.C22971Dz.A0S(r1) != false) goto L_0x0144;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0129, code lost:
        if (r13.A0w() != false) goto L_0x0144;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x012d, code lost:
        if ((r13 instanceof X.AnonymousClass215) != false) goto L_0x0144;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0131, code lost:
        if (r4.A02 != false) goto L_0x0144;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0133, code lost:
        if (r6 != false) goto L_0x0137;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0135, code lost:
        if (r14 == false) goto L_0x0144;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0137, code lost:
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0142, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r11.A03, 9883) != false) goto L_0x0145;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0144, code lost:
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0145, code lost:
        if (r19 == false) goto L_0x0157;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0147, code lost:
        if (r9 != false) goto L_0x0157;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0153, code lost:
        if (((X.C88174Yp) r3.get()).A01(r13) == false) goto L_0x0157;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0155, code lost:
        r19 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0157, code lost:
        r5 = r13 instanceof X.AnonymousClass215;
        r4 = !r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x015c, code lost:
        if (r2 == 1) goto L_0x029c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x015f, code lost:
        if (r2 != 3) goto L_0x02b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0161, code lost:
        r3 = ((X.C88174Yp) r3.get()).A03(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x016b, code lost:
        if (r3 == false) goto L_0x01d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x016d, code lost:
        r2 = r13.A0I();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0171, code lost:
        if (r2 != null) goto L_0x0176;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0173, code lost:
        r2 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0174, code lost:
        if (r1 == null) goto L_0x01d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0176, code lost:
        r17 = r12.findItem(15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x017c, code lost:
        if (r17 == null) goto L_0x01d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0182, code lost:
        if (X.C22971Dz.A0V(r2) != false) goto L_0x01d9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1l(android.view.Menu r29) {
        /*
            r28 = this;
            r12 = r29
            int r0 = r12.size()
            if (r0 == 0) goto L_0x0291
            r2 = r28
            X.65h r0 = r2.A09
            if (r0 == 0) goto L_0x02e9
            r4 = 1
            int r0 = r0.getCurrentItem()
            X.21V r13 = A04(r2, r0)
        L_0x0017:
            X.6xb r11 = r2.A0q
            X.1BI r1 = r2.A0g
            X.1FL r25 = r2.A1D()
            boolean r3 = r2.A1l
            int r2 = r2.A1p
            r7 = 1
            if (r4 == 0) goto L_0x02ce
            boolean r0 = X.C22971Dz.A0e(r1)
            if (r0 == 0) goto L_0x003b
            X.00H r0 = r11.A0Z
            java.lang.Object r0 = r0.get()
            X.1xo r0 = (X.C42211xo) r0
            boolean r0 = r0.A03(r1)
            r5 = 1
            if (r0 != 0) goto L_0x003c
        L_0x003b:
            r5 = 0
        L_0x003c:
            if (r1 == 0) goto L_0x02c9
            if (r5 != 0) goto L_0x0043
            r10 = 1
            if (r3 == 0) goto L_0x0044
        L_0x0043:
            r10 = 0
        L_0x0044:
            r24 = 1
        L_0x0046:
            if (r13 == 0) goto L_0x02bc
            int r0 = r13.A0u
            r27 = r0
            boolean r23 = X.AnonymousClass000.A1T(r0, r7)
            boolean r9 = r13.A0q
            X.00H r3 = r11.A0K
            java.lang.Object r0 = r3.get()
            X.4Yi r0 = (X.C88104Yi) r0
            boolean r22 = r0.A02(r13)
            java.lang.Object r0 = r3.get()
            X.4Yi r0 = (X.C88104Yi) r0
            boolean r21 = r0.A03(r13)
            if (r5 != 0) goto L_0x007a
            X.00H r0 = r11.A0G
            java.lang.Object r0 = r0.get()
            X.1hx r0 = (X.C32911hx) r0
            boolean r0 = r0.A01(r13)
            r20 = 1
            if (r0 != 0) goto L_0x007e
        L_0x007a:
            r20 = 0
            if (r5 != 0) goto L_0x008d
        L_0x007e:
            X.00H r0 = r11.A0P
            java.lang.Object r0 = r0.get()
            X.4Yp r0 = (X.C88174Yp) r0
            boolean r0 = r0.A04(r13)
            r8 = 1
            if (r0 != 0) goto L_0x008e
        L_0x008d:
            r8 = 0
        L_0x008e:
            X.00H r3 = r11.A0P
            java.lang.Object r0 = r3.get()
            X.4Yp r0 = (X.C88174Yp) r0
            boolean r19 = r0.A05(r13)
            if (r5 != 0) goto L_0x00c2
            X.00H r0 = r11.A0J
            java.lang.Object r4 = r0.get()
            X.12L r4 = (X.AnonymousClass12L) r4
            X.205 r0 = r13.A0v
            X.1BI r0 = r0.A00
            boolean r0 = X.C42761yh.A01(r4, r0)
            if (r0 != 0) goto L_0x00c2
            boolean r0 = r13.A0w()
            if (r0 != 0) goto L_0x00c2
            boolean r0 = r13 instanceof X.AnonymousClass215
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00c2
            boolean r0 = X.C22971Dz.A0S(r1)
            r24 = 1
            if (r0 == 0) goto L_0x00c6
        L_0x00c2:
            r24 = 0
            if (r5 != 0) goto L_0x00d9
        L_0x00c6:
            X.2rc r4 = r13.A02
            X.205 r0 = r13.A0v
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x02b8
            if (r4 == 0) goto L_0x02b8
            boolean r0 = r4.A0V
            if (r0 != 0) goto L_0x02b8
            java.lang.String r0 = "mediaViewFragment/cannot save partially uploaded message."
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x00d9:
            r18 = 0
        L_0x00db:
            X.2rc r7 = r13.A02
            if (r5 != 0) goto L_0x0144
            r5 = 0
            r4 = 1
            if (r7 == 0) goto L_0x00f4
            boolean r0 = r13 instanceof X.C438421d
            if (r0 == 0) goto L_0x00f4
            boolean r0 = r7.A0V
            if (r0 == 0) goto L_0x00f4
            X.6ub r0 = r11.A06
            boolean r0 = r0.A01(r7, r5)
            r14 = 1
            if (r0 != 0) goto L_0x00f7
        L_0x00f4:
            r14 = 0
            if (r7 == 0) goto L_0x010c
        L_0x00f7:
            boolean r0 = r13 instanceof X.AnonymousClass21Y
            if (r0 == 0) goto L_0x010c
            X.6yx r0 = r11.A07
            boolean r0 = r0.A02(r7)
            if (r0 == 0) goto L_0x010c
            X.CUm r0 = X.DPW.A0V
            int r0 = r0.A00()
            r6 = 1
            if (r0 == r4) goto L_0x010d
        L_0x010c:
            r6 = 0
        L_0x010d:
            X.00H r0 = r11.A0J
            java.lang.Object r5 = X.C18070vi.A0E(r0)
            X.12L r5 = (X.AnonymousClass12L) r5
            X.205 r4 = r13.A0v
            X.1BI r0 = r4.A00
            boolean r0 = X.C42761yh.A01(r5, r0)
            if (r0 != 0) goto L_0x0144
            boolean r0 = X.C22971Dz.A0S(r1)
            if (r0 != 0) goto L_0x0144
            boolean r0 = r13.A0w()
            if (r0 != 0) goto L_0x0144
            boolean r0 = r13 instanceof X.AnonymousClass215
            if (r0 != 0) goto L_0x0144
            boolean r0 = r4.A02
            if (r0 != 0) goto L_0x0144
            if (r6 != 0) goto L_0x0137
            if (r14 == 0) goto L_0x0144
        L_0x0137:
            X.0ve r5 = r11.A03
            r4 = 9883(0x269b, float:1.3849E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r5, r4)
            r6 = 1
            if (r0 != 0) goto L_0x0145
        L_0x0144:
            r6 = 0
        L_0x0145:
            if (r19 == 0) goto L_0x0157
            if (r9 != 0) goto L_0x0157
            java.lang.Object r0 = r3.get()
            X.4Yp r0 = (X.C88174Yp) r0
            boolean r0 = r0.A01(r13)
            if (r0 == 0) goto L_0x0157
            r19 = 0
        L_0x0157:
            boolean r5 = r13 instanceof X.AnonymousClass215
            r0 = 1
            r4 = r5 ^ 1
            if (r2 == r0) goto L_0x029c
            r0 = 3
            if (r2 != r0) goto L_0x02b5
            java.lang.Object r0 = r3.get()
            X.4Yp r0 = (X.C88174Yp) r0
            boolean r3 = r0.A03(r13)
            if (r3 == 0) goto L_0x01d9
        L_0x016d:
            com.whatsapp.jid.UserJid r2 = r13.A0I()
            if (r2 != 0) goto L_0x0176
            r2 = r1
            if (r1 == 0) goto L_0x01d9
        L_0x0176:
            r0 = 15
            android.view.MenuItem r17 = r12.findItem(r0)
            if (r17 == 0) goto L_0x01d9
            boolean r0 = X.C22971Dz.A0V(r2)
            if (r0 != 0) goto L_0x01d9
            X.1M9 r0 = r11.A02
            X.1E7 r15 = r0.A0H(r2)
            X.00H r0 = r11.A0d
            java.lang.Object r14 = r0.get()
            X.1Me r14 = (X.C24921Me) r14
            java.lang.String r16 = X.AnonymousClass3MX.A17(r14, r15)
            X.1yf r1 = r15.A0G
            boolean r0 = r16.isEmpty()
            if (r0 != 0) goto L_0x01c5
            X.2lf r0 = r15.A0H
            if (r0 != 0) goto L_0x01c5
            boolean r0 = r15.A0C()
            if (r0 != 0) goto L_0x01c5
            if (r1 == 0) goto L_0x01b4
            java.lang.String r0 = r1.A08
            if (r0 == 0) goto L_0x01b4
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x01c5
        L_0x01b4:
            X.0ve r0 = r14.A04
            r26 = r0
            X.0vf r1 = X.C18040vf.A02
            r0 = 8000(0x1f40, float:1.121E-41)
            r2 = r1
            r1 = r26
            boolean r0 = X.C18020vd.A05(r2, r1, r0)
            if (r0 != 0) goto L_0x01c9
        L_0x01c5:
            java.lang.String r16 = X.AnonymousClass3MY.A0q(r14, r15)
        L_0x01c9:
            r2 = 2131895215(0x7f1223af, float:1.9425257E38)
            r1 = r25
            r0 = r16
            java.lang.String r1 = X.C72473Md.A0j(r1, r0, r2)
            r0 = r17
            r0.setTitle(r1)
        L_0x01d9:
            boolean r0 = X.AnonymousClass72Z.A00(r27)
            if (r0 == 0) goto L_0x01ec
            X.205 r0 = r13.A0v
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x01ec
            if (r7 == 0) goto L_0x01ec
            boolean r0 = r7.A0V
            r14 = 1
            if (r0 == 0) goto L_0x01ef
        L_0x01ec:
            r14 = 0
            if (r7 == 0) goto L_0x0201
        L_0x01ef:
            boolean r0 = r7.A0f
            if (r0 != 0) goto L_0x0201
            boolean r0 = r7.A0V
            if (r0 != 0) goto L_0x0201
            X.6ub r1 = r11.A06
            r0 = 0
            boolean r0 = r1.A01(r7, r0)
            r1 = 1
            if (r0 != 0) goto L_0x0202
        L_0x0201:
            r1 = 0
        L_0x0202:
            boolean r0 = X.C20120A8f.A06(r13)
            r7 = 1
            r11 = 1
            if (r0 == 0) goto L_0x0210
            r5 = 0
            r19 = 0
            r20 = 0
            r7 = 0
        L_0x0210:
            r0 = r23
            r12.setGroupVisible(r11, r0)
            r0 = 6
            X.C138736xb.A00(r12, r0, r7)
            r0 = 8
            X.C138736xb.A00(r12, r0, r8)
            if (r14 != 0) goto L_0x0223
            r2 = 1
            if (r20 != 0) goto L_0x0224
        L_0x0223:
            r2 = 0
        L_0x0224:
            r0 = 9
            X.C138736xb.A00(r12, r0, r2)
            r0 = 14
            X.C138736xb.A00(r12, r0, r5)
            r0 = 12
            X.C138736xb.A00(r12, r0, r4)
            r0 = 7
            X.C138736xb.A00(r12, r0, r10)
            r2 = 16
            r0 = r18
            X.C138736xb.A00(r12, r2, r0)
            r0 = 22
            X.C138736xb.A00(r12, r0, r6)
            r5 = 1
            r4 = 0
            if (r19 == 0) goto L_0x024a
            r2 = 1
            if (r9 == 0) goto L_0x024b
        L_0x024a:
            r2 = 0
        L_0x024b:
            r0 = 10
            X.C138736xb.A00(r12, r0, r2)
            if (r19 == 0) goto L_0x029a
            if (r9 == 0) goto L_0x029a
        L_0x0254:
            r0 = 11
            X.C138736xb.A00(r12, r0, r5)
            r0 = 17
            X.C138736xb.A00(r12, r0, r4)
            r0 = 18
            X.C138736xb.A00(r12, r0, r4)
            r4 = 10
            r2 = 0
            if (r21 == 0) goto L_0x0296
            X.C138736xb.A00(r12, r0, r11)
            X.C138736xb.A00(r12, r4, r2)
        L_0x026e:
            r0 = 17
            if (r22 == 0) goto L_0x0292
            X.C138736xb.A00(r12, r0, r11)
            X.C138736xb.A00(r12, r4, r2)
        L_0x0278:
            if (r14 != 0) goto L_0x027d
            if (r24 == 0) goto L_0x027d
            r2 = 1
        L_0x027d:
            r0 = 13
            X.C138736xb.A00(r12, r0, r2)
            r0 = 19
            X.C138736xb.A00(r12, r0, r3)
            r0 = 15
            X.C138736xb.A00(r12, r0, r3)
            r0 = 20
            X.C138736xb.A00(r12, r0, r1)
        L_0x0291:
            return
        L_0x0292:
            X.C138736xb.A00(r12, r0, r2)
            goto L_0x0278
        L_0x0296:
            X.C138736xb.A00(r12, r0, r2)
            goto L_0x026e
        L_0x029a:
            r5 = 0
            goto L_0x0254
        L_0x029c:
            X.0ve r14 = r11.A03
            r2 = 535(0x217, float:7.5E-43)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r14, r2)
            if (r0 == 0) goto L_0x02b5
            java.lang.Object r0 = r3.get()
            X.4Yp r0 = (X.C88174Yp) r0
            boolean r0 = r0.A03(r13)
            r3 = 1
            if (r0 != 0) goto L_0x016d
        L_0x02b5:
            r3 = 0
            goto L_0x01d9
        L_0x02b8:
            r18 = 1
            goto L_0x00db
        L_0x02bc:
            r4 = 0
            r5 = 0
            r6 = 0
            r22 = 0
            r21 = 0
            r19 = 0
            r8 = 0
            r14 = 0
            r11 = 1
            goto L_0x02de
        L_0x02c9:
            r10 = 0
            r24 = 0
            goto L_0x0046
        L_0x02ce:
            r24 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r22 = 0
            r21 = 0
            r19 = 0
            r8 = 0
            r7 = 0
            r14 = 0
            r11 = 1
            r10 = 0
        L_0x02de:
            r23 = 0
            r9 = 0
            r18 = 0
            r1 = 0
            r3 = 0
            r20 = 0
            goto L_0x0210
        L_0x02e9:
            r4 = 0
            r13 = 0
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.mediaview.MediaViewFragment.A1l(android.view.Menu):void");
    }

    public void A1r() {
        Log.i("MediaViewFragment/onDestroy");
        A0G(this);
        AnonymousClass7RT r1 = this.A0B;
        if (r1 != null) {
            r1.A00 = true;
            ((Thread) r1.A04).interrupt();
            this.A0B = null;
        }
        C129726iG r6 = (C129726iG) this.A1V.get();
        AnonymousClass206 r5 = r6.A00;
        if (r5 != null) {
            AnonymousClass10I r4 = r6.A04;
            StringBuilder A102 = AnonymousClass000.A10();
            A102.append(r5.A0v.A01);
            r4.CGL(new C146807Qr(r6, r5, 42), AnonymousClass000.A0y("_PaidMessagingVideoPlaybackInfoLogger", A102));
        }
        AnonymousClass70X r0 = this.A1E;
        if (r0 != null) {
            r0.A0C();
            this.A1E = null;
            AnonymousClass21V r2 = this.A10;
            if (r2 != null) {
                C32431hB.A06(this.A0l, r2, false, false, false);
            }
        }
        C130806k2 r52 = this.A0p;
        if (C18020vd.A05(C18040vf.A02, r52.A04, 9744)) {
            HashMap A112 = C17880vN.A11();
            C26204Cub.A01(r52.A03.A00, (C27066DRp) AnonymousClass3MX.A14(r52.A05.A01), C28620EAs.A00, A112).A04();
            Log.i("MediaViewPlayerMigrationUtil/maybeCleanUpAllPlayerResources/clearAllPlayers");
        }
        this.A10 = null;
        MediaViewCurrentMessageViewModel mediaViewCurrentMessageViewModel = this.A0n;
        if (mediaViewCurrentMessageViewModel != null) {
            mediaViewCurrentMessageViewModel.A0V((AnonymousClass21V) null);
        }
        this.A0L.unregisterObserver(this.A20);
        this.A0Z.unregisterObserver(this.A21);
        C160898Aj r02 = this.A0m;
        if (r02 != null) {
            r02.close();
        }
        AnonymousClass10I r22 = this.A1D;
        C29781cr r12 = this.A0R;
        r12.getClass();
        C98834rn.A01(r22, r12, 37);
        C132796nb r03 = this.A1t;
        if (r03 != null) {
            r03.A03.dismiss();
        }
        AnonymousClass3RQ r04 = this.A0O;
        if (r04 != null) {
            r04.dismiss();
        }
        this.A16 = null;
        this.A1r = null;
        this.A08 = null;
        this.A1s = null;
        super.A1r();
    }

    public void A20(Bundle bundle) {
        GroupJid groupJid = this.A0h;
        if (groupJid != null) {
            AnonymousClass3MY.A15(bundle, groupJid, "gid");
        }
        bundle.putBoolean("is_different_video", this.A1i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:73:0x022c, code lost:
        if (r1.A0P() == true) goto L_0x022e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A22(android.view.Menu r20, android.view.MenuInflater r21) {
        /*
            r19 = this;
            r2 = r19
            X.6xb r12 = r2.A0q
            X.1BI r11 = r2.A0g
            int r0 = r2.A04
            r18 = r0
            X.1FL r1 = r2.A1D()
            boolean r0 = r2.A1v
            r17 = r0
            int r10 = r2.A1p
            X.8Aj r0 = r2.A0m
            r16 = r0
            r9 = 0
            r13 = r20
            X.C18070vi.A0d(r13, r9)
            r8 = 3
            r13.clear()
            r14 = 0
            if (r11 == 0) goto L_0x0251
            X.1M9 r0 = r12.A02
            X.1E7 r7 = r0.A0H(r11)
        L_0x002b:
            if (r10 != r8) goto L_0x006e
            r3 = 1
            r2 = 2131897917(0x7f122e3d, float:1.9430737E38)
            r0 = 14
            android.view.MenuItem r4 = r13.add(r9, r0, r3, r2)
            r3 = 2131232408(0x7f080698, float:1.8080924E38)
            r2 = 2130971957(0x7f040d35, float:1.7552667E38)
            r0 = 2131103410(0x7f060eb2, float:1.7819285E38)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass4aX.A03(r1, r2, r0, r3)
            android.view.MenuItem r1 = r4.setIcon(r0)
            r0 = 2
            r1.setShowAsAction(r0)
            r1 = 6
            r0 = 2131898874(0x7f1231fa, float:1.9432678E38)
            r13.add(r9, r1, r9, r0)
        L_0x0053:
            if (r7 == 0) goto L_0x0065
            X.2kV r0 = r12.A08
            boolean r0 = r0.A01(r7)
            if (r0 == 0) goto L_0x0065
            r1 = 19
            r0 = 2131895219(0x7f1223b3, float:1.9425265E38)
            r13.add(r9, r1, r9, r0)
        L_0x0065:
            r1 = 15
            r0 = 2131895214(0x7f1223ae, float:1.9425255E38)
            r13.add(r9, r1, r9, r0)
        L_0x006d:
            return
        L_0x006e:
            boolean r0 = X.C22971Dz.A0S(r11)
            r6 = 2
            if (r0 != 0) goto L_0x009b
            r2 = 10
            r0 = 2131886509(0x7f1201ad, float:1.9407599E38)
            android.view.MenuItem r2 = r13.add(r9, r2, r9, r0)
            r0 = 2131232090(0x7f08055a, float:1.808028E38)
            android.view.MenuItem r0 = r2.setIcon(r0)
            r0.setShowAsAction(r6)
            r2 = 11
            r0 = 2131895141(0x7f122365, float:1.9425107E38)
            android.view.MenuItem r2 = r13.add(r9, r2, r9, r0)
            r0 = 2131232089(0x7f080559, float:1.8080277E38)
            android.view.MenuItem r0 = r2.setIcon(r0)
            r0.setShowAsAction(r6)
        L_0x009b:
            r2 = 17
            r0 = 2131886487(0x7f120197, float:1.9407554E38)
            android.view.MenuItem r2 = r13.add(r9, r2, r9, r0)
            r0 = 2131231723(0x7f0803eb, float:1.8079535E38)
            r3 = 2131231723(0x7f0803eb, float:1.8079535E38)
            android.view.MenuItem r0 = r2.setIcon(r0)
            r0.setShowAsAction(r6)
            r2 = 18
            r0 = 2131897302(0x7f122bd6, float:1.942949E38)
            android.view.MenuItem r0 = r13.add(r9, r2, r9, r0)
            android.view.MenuItem r0 = r0.setIcon(r3)
            r0.setShowAsAction(r6)
            r5 = 6
            if (r10 != r6) goto L_0x0236
            r0 = 2131898874(0x7f1231fa, float:1.9432678E38)
            android.view.MenuItem r2 = r13.add(r9, r5, r9, r0)
            r0 = 2131231847(0x7f080467, float:1.8079787E38)
            android.view.MenuItem r0 = r2.setIcon(r0)
            r0.setShowAsAction(r6)
        L_0x00d5:
            if (r7 == 0) goto L_0x0119
            if (r11 == 0) goto L_0x0119
            X.1PU r0 = r12.A09
            boolean r0 = r0.A01(r7, r11)
            if (r0 != 0) goto L_0x0119
            boolean r0 = X.C42701yb.A01(r11)
            if (r0 == 0) goto L_0x00f3
            X.00H r0 = r12.A0B
            X.1UD r0 = X.AnonymousClass3MW.A0X(r0)
            boolean r0 = r0.A0B()
            if (r0 == 0) goto L_0x0119
        L_0x00f3:
            r0 = 2131231875(0x7f080483, float:1.8079843E38)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass03S.A01(r1, r0)
            X.C17960vV.A07(r0)
            android.graphics.drawable.Drawable r2 = X.C27831Xu.A02(r0)
            X.C18070vi.A0X(r2)
            r0 = -1
            X.C27831Xu.A0C(r2, r0)
            r1 = 13
            r0 = 2131898930(0x7f123232, float:1.9432792E38)
            android.view.MenuItem r0 = r13.add(r9, r1, r9, r0)
            android.view.MenuItem r1 = r0.setIcon(r2)
            r0 = 1
            r1.setShowAsAction(r0)
        L_0x0119:
            r1 = 7
            r0 = 2131886644(0x7f120234, float:1.9407873E38)
            android.view.MenuItem r1 = r13.add(r9, r1, r9, r0)
            r0 = 2131231947(0x7f0804cb, float:1.807999E38)
            android.view.MenuItem r0 = r1.setIcon(r0)
            r0.setShowAsAction(r9)
            boolean r0 = X.C22971Dz.A0V(r11)
            r1 = 2131897891(0x7f122e23, float:1.9430684E38)
            if (r0 == 0) goto L_0x0137
            r1 = 2131897890(0x7f122e22, float:1.9430682E38)
        L_0x0137:
            r0 = 12
            X.C108955ca.A1G(r13, r9, r0, r1)
            boolean r0 = X.C22971Dz.A0S(r11)
            if (r0 != 0) goto L_0x014a
            r1 = 8
            r0 = 2131899418(0x7f12341a, float:1.9433781E38)
            r13.add(r9, r1, r9, r0)
        L_0x014a:
            X.6ub r4 = r12.A06
            r3 = 1
            boolean r0 = r4.A04(r9)
            if (r0 == 0) goto L_0x015b
            r1 = 20
            r0 = 2131889563(0x7f120d9b, float:1.9413793E38)
            r13.add(r9, r1, r9, r0)
        L_0x015b:
            X.0ve r2 = r12.A03
            r0 = 942(0x3ae, float:1.32E-42)
            X.0vf r1 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r1, r2, r0)
            if (r0 == 0) goto L_0x0177
            r0 = 1050(0x41a, float:1.471E-42)
            boolean r0 = X.C18020vd.A05(r1, r2, r0)
            r12.A00 = r0
            r15 = 16
            r0 = 2131895382(0x7f122456, float:1.9425595E38)
            r13.add(r9, r15, r9, r0)
        L_0x0177:
            X.4md r0 = r12.A04
            boolean r0 = r0.A01(r11)
            if (r0 != 0) goto L_0x019a
            boolean r0 = X.C22971Dz.A0S(r11)
            if (r0 != 0) goto L_0x019a
            boolean r0 = X.C42701yb.A01(r11)
            if (r0 != 0) goto L_0x019a
            r15 = 21
            r0 = 2131896422(0x7f122866, float:1.9427705E38)
            android.view.MenuItem r15 = r13.add(r3, r15, r9, r0)
            r0 = 2131233153(0x7f080981, float:1.8082435E38)
            r15.setIcon(r0)
        L_0x019a:
            if (r16 == 0) goto L_0x01bc
            r14 = r18
            r0 = r16
            X.21V r14 = r0.BUg(r14)
            if (r14 == 0) goto L_0x01bc
            X.00H r0 = r12.A0U
            java.lang.Object r0 = r0.get()
            X.4R1 r0 = (X.AnonymousClass4R1) r0
            java.util.List r0 = r0.A00(r14)
            if (r0 == 0) goto L_0x01bc
            r15 = 23
            r0 = 2131891990(0x7f121716, float:1.9418716E38)
            r13.add(r3, r15, r9, r0)
        L_0x01bc:
            r0 = 9883(0x269b, float:1.3849E-41)
            boolean r0 = X.C18020vd.A05(r1, r2, r0)
            if (r0 == 0) goto L_0x01cc
            r1 = 22
            r0 = 2131888693(0x7f120a35, float:1.9412029E38)
            r13.add(r9, r1, r9, r0)
        L_0x01cc:
            boolean r0 = r14 instanceof X.C438421d
            if (r0 == 0) goto L_0x01da
            X.2rc r0 = r14.A02
            if (r0 == 0) goto L_0x01da
            boolean r0 = r4.A01(r0, r9)
            if (r0 != 0) goto L_0x0200
        L_0x01da:
            boolean r0 = X.C22971Dz.A0S(r11)
            if (r0 != 0) goto L_0x0200
            r0 = 2131895776(0x7f1225e0, float:1.9426395E38)
            android.view.SubMenu r2 = r13.addSubMenu(r3, r9, r9, r0)
            r2.clearHeader()
            r1 = 4
            r0 = 2131895778(0x7f1225e2, float:1.9426399E38)
            r2.add(r3, r1, r9, r0)
            r1 = 5
            r0 = 2131895777(0x7f1225e1, float:1.9426397E38)
            r2.add(r3, r1, r9, r0)
            if (r17 == 0) goto L_0x0200
            r0 = 2131897667(0x7f122d43, float:1.943023E38)
            r2.add(r3, r3, r9, r0)
        L_0x0200:
            r0 = 2131897892(0x7f122e24, float:1.9430686E38)
            r13.add(r3, r6, r9, r0)
            r0 = 2131895370(0x7f12244a, float:1.9425571E38)
            r13.add(r3, r8, r9, r0)
            if (r10 == r6) goto L_0x006d
            boolean r0 = X.C22971Dz.A0V(r11)
            if (r0 == 0) goto L_0x022e
            X.00H r0 = r12.A0C
            java.lang.Object r0 = r0.get()
            X.1CJ r0 = (X.AnonymousClass1CJ) r0
            X.1ci r1 = r0.A0A(r11)
            boolean r0 = r1 instanceof X.C46162Dk
            if (r0 == 0) goto L_0x0053
            X.2Dk r1 = (X.C46162Dk) r1
            if (r1 == 0) goto L_0x0053
            boolean r0 = r1.A0P()
            if (r0 != r3) goto L_0x0053
        L_0x022e:
            r0 = 2131898874(0x7f1231fa, float:1.9432678E38)
            r13.add(r9, r5, r9, r0)
            goto L_0x0053
        L_0x0236:
            boolean r0 = X.C22971Dz.A0S(r11)
            if (r0 != 0) goto L_0x00d5
            r2 = 9
            r0 = 2131889000(0x7f120b68, float:1.9412651E38)
            android.view.MenuItem r2 = r13.add(r9, r2, r9, r0)
            r0 = 2131232086(0x7f080556, float:1.8080271E38)
            android.view.MenuItem r0 = r2.setIcon(r0)
            r0.setShowAsAction(r6)
            goto L_0x00d5
        L_0x0251:
            r7 = r14
            goto L_0x002b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.mediaview.MediaViewFragment.A22(android.view.Menu, android.view.MenuInflater):void");
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [java.lang.Object, X.1yT] */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0375, code lost:
        r2.CGF(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x017f, code lost:
        X.C20098A7b.A01(r1, A1E());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0250, code lost:
        r1 = new X.AnonymousClass7R0(r6, r14, r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0255, code lost:
        r3.CGF(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x02c2, code lost:
        startActivityForResult(r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x02e7, code lost:
        com.whatsapp.util.Log.e(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A24(android.view.MenuItem r18) {
        /*
            r17 = this;
            r2 = r17
            int r0 = r2.A04
            X.21V r14 = A04(r2, r0)
            X.6xb r6 = r2.A0q
            int r9 = r2.A1p
            r5 = 0
            r10 = r18
            X.C18070vi.A0d(r10, r5)
            r7 = 2
            if (r14 != 0) goto L_0x002b
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "MediaViewMenu/onOptionSelected/No message for selected option at "
            r1.append(r0)
            int r0 = r10.getItemId()
            java.lang.String r0 = X.C17880vN.A0t(r1, r0)
        L_0x0026:
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0029:
            r0 = 1
            return r0
        L_0x002b:
            X.1FL r0 = r2.A1B()
            if (r0 == 0) goto L_0x03af
            r3 = 1
            boolean r0 = r0.isFinishing()
            if (r0 == r3) goto L_0x03af
            X.205 r8 = r14.A0v
            X.1BI r4 = r8.A00
            int r1 = r10.getItemId()
            r10 = 0
            switch(r1) {
                case 1: goto L_0x00cd;
                case 2: goto L_0x0324;
                case 3: goto L_0x0045;
                case 4: goto L_0x00a7;
                case 5: goto L_0x02f6;
                case 6: goto L_0x037a;
                case 7: goto L_0x02ec;
                case 8: goto L_0x02ca;
                case 9: goto L_0x025a;
                case 10: goto L_0x022c;
                case 11: goto L_0x0223;
                case 12: goto L_0x0215;
                case 13: goto L_0x01f2;
                case 14: goto L_0x01df;
                case 15: goto L_0x01be;
                case 16: goto L_0x0360;
                case 17: goto L_0x018c;
                case 18: goto L_0x018c;
                case 19: goto L_0x015c;
                case 20: goto L_0x0144;
                case 21: goto L_0x007f;
                case 22: goto L_0x0135;
                case 23: goto L_0x0114;
                default: goto L_0x0044;
            }
        L_0x0044:
            goto L_0x0029
        L_0x0045:
            boolean r0 = r14 instanceof X.C438421d
            if (r0 == 0) goto L_0x0029
            X.00H r0 = r6.A0f
            X.10I r4 = X.AnonymousClass3MX.A0x(r0)
            X.21d r14 = (X.C438421d) r14
            X.00H r0 = r6.A0L
            java.lang.Object r3 = X.C18070vi.A0E(r0)
            X.1Sl r3 = (X.C26521Sl) r3
            X.00H r0 = r6.A0O
            java.lang.Object r1 = X.C18070vi.A0E(r0)
            X.1Lg r1 = (X.C24681Lg) r1
            X.00H r0 = r6.A0M
            java.lang.Object r7 = X.C18070vi.A0E(r0)
            X.1ST r7 = (X.AnonymousClass1ST) r7
            X.00H r0 = r6.A0Q
            java.lang.Object r0 = X.C18070vi.A0E(r0)
            X.1gV r0 = (X.C32021gV) r0
            X.2PY r6 = new X.2PY
            r10 = r14
            r11 = r3
            r12 = r0
            r8 = r1
            r9 = r2
            r6.<init>(r7, r8, r9, r10, r11, r12)
            X.AnonymousClass3MW.A1T(r6, r4, r5)
            goto L_0x0029
        L_0x007f:
            X.2rc r0 = r14.A02
            if (r0 == 0) goto L_0x00a1
            java.io.File r0 = r0.A0G
            if (r0 == 0) goto L_0x00a1
            android.net.Uri r3 = android.net.Uri.fromFile(r0)
        L_0x008b:
            if (r4 == 0) goto L_0x00a3
            if (r3 == 0) goto L_0x00a3
            X.00H r0 = r6.A0Y
            r0.get()
            X.1FL r1 = r2.A1D()
            r0 = 45
            X.C138046wR.A00(r1, r3, r4, r0)
            r2.A2D()
            goto L_0x0029
        L_0x00a1:
            r3 = 0
            goto L_0x008b
        L_0x00a3:
            java.lang.String r0 = "MediaViewMenu/onOptionSelected/Invalid media data or jid."
            goto L_0x02e7
        L_0x00a7:
            X.2rc r0 = r14.A02
            if (r0 == 0) goto L_0x00c9
            java.io.File r0 = r0.A0G
            if (r0 == 0) goto L_0x00c9
            android.net.Uri r0 = android.net.Uri.fromFile(r0)
            if (r0 == 0) goto L_0x00c9
            android.content.Intent r1 = X.C17880vN.A0A()
            r1.setData(r0)
            X.00H r0 = r6.A0R
            java.lang.Object r0 = r0.get()
            X.1Uo r0 = (X.C27061Uo) r0
            r0.A06(r1, r2, r3)
            goto L_0x0029
        L_0x00c9:
            java.lang.String r0 = "MediaViewMenu/onOptionSelected/No uri to set as profile photo."
            goto L_0x0026
        L_0x00cd:
            X.2rc r0 = r14.A02
            if (r0 == 0) goto L_0x0110
            java.io.File r0 = r0.A0G
            if (r0 == 0) goto L_0x0110
            android.net.Uri r7 = android.net.Uri.fromFile(r0)
            if (r7 == 0) goto L_0x0110
            if (r4 == 0) goto L_0x0110
            X.00H r0 = r6.A0e
            r0.get()
            X.1FL r1 = r2.A1D()
            X.00H r0 = r6.A0g
            java.lang.Object r0 = r0.get()
            X.4aW r0 = (X.AnonymousClass4aW) r0
            android.net.Uri r6 = r0.A0C()
            X.C18070vi.A0X(r6)
            android.content.Intent r5 = X.AnonymousClass3MZ.A07(r1, r5)
            java.lang.String r1 = r1.getPackageName()
            java.lang.String r0 = "com.whatsapp.settings.chat.wallpaper.GalleryWallpaperPreview"
            r5.setClassName(r1, r0)
            r5.setData(r7)
            java.lang.String r0 = "output"
            r5.putExtra(r0, r6)
            X.C108995ce.A0m(r5, r4, r3)
            r0 = 6
            goto L_0x02c2
        L_0x0110:
            java.lang.String r0 = "MediaViewMenu/onOptionSelected/No message to set as a wallpaper."
            goto L_0x02e7
        L_0x0114:
            X.00H r0 = r6.A0U
            java.lang.Object r0 = r0.get()
            X.4R1 r0 = (X.AnonymousClass4R1) r0
            java.util.List r3 = r0.A00(r14)
            if (r3 == 0) goto L_0x0029
            X.00H r0 = r6.A0I
            java.lang.Object r1 = r0.get()
            X.4mc r1 = (X.C95674mc) r1
            boolean r0 = r14.A0w()
            com.whatsapp.product.searchtheweb.GoogleSearchContentBottomSheet r1 = r1.A00(r3, r7, r0)
            if (r1 == 0) goto L_0x0029
            goto L_0x017f
        L_0x0135:
            X.00H r0 = r6.A0f
            X.10I r2 = X.AnonymousClass3MX.A0x(r0)
            r0 = 15
            X.3By r1 = new X.3By
            r1.<init>(r6, r14, r0)
            goto L_0x0375
        L_0x0144:
            X.00H r0 = r6.A0c
            java.lang.Object r6 = r0.get()
            X.1iW r6 = (X.C33251iW) r6
            X.1FU r7 = X.C108945cZ.A0Y(r2)
            X.C18070vi.A0X(r7)
            r8 = r14
            r9 = r10
            r10 = r5
            r11 = r3
            r6.A0M(r7, r8, r9, r10, r11)
            goto L_0x0029
        L_0x015c:
            if (r4 == 0) goto L_0x0188
            boolean r0 = X.C22971Dz.A0e(r4)
            if (r0 == 0) goto L_0x0188
            X.00H r0 = r6.A0T
            java.lang.Object r1 = r0.get()
            X.6lQ r1 = (X.C131636lQ) r1
            java.lang.String r0 = r4.getRawString()
            r1.A00(r3, r0)
            X.00H r0 = r6.A0S
            java.lang.Object r0 = r0.get()
            X.4ma r0 = (X.C95654ma) r0
            com.whatsapp.product.reporttoadmin.ReportToAdminDialogFragment r1 = r0.A00(r14)
        L_0x017f:
            X.1GP r0 = r2.A1E()
            X.C20098A7b.A01(r1, r0)
            goto L_0x0029
        L_0x0188:
            java.lang.String r0 = "MediaViewMenu/onOptionSelected/No message or no group chat."
            goto L_0x02e7
        L_0x018c:
            X.1FL r0 = r2.A1B()
            if (r0 == 0) goto L_0x01ba
            X.00H r0 = r6.A0K
            java.lang.Object r9 = r0.get()
            X.4Yi r9 = (X.C88104Yi) r9
            r0 = 17
            boolean r16 = X.AnonymousClass000.A1T(r1, r0)
            X.1FU r11 = X.C108945cZ.A0Y(r2)
            X.C18070vi.A0X(r11)
            X.00H r0 = r6.A0c
            java.lang.Object r12 = X.C18070vi.A0E(r0)
            X.1iW r12 = (X.C33251iW) r12
            X.4lN r13 = new X.4lN
            r13.<init>(r2, r3)
            r15 = 4
            r9.A01(r10, r11, r12, r13, r14, r15, r16)
            goto L_0x0029
        L_0x01ba:
            java.lang.String r0 = "MediaViewMenu/onOptionSelected/Message or activity are not available for keep or undo keep."
            goto L_0x0026
        L_0x01be:
            if (r4 == 0) goto L_0x01db
            X.00H r0 = r6.A0D
            java.lang.Object r0 = r0.get()
            X.1RK r0 = (X.AnonymousClass1RK) r0
            X.Af0 r0 = r0.A04()
            X.7Ni r8 = new X.7Ni
            r9 = r4
            r10 = r6
            r11 = r14
            r12 = r2
            r13 = r7
            r8.<init>(r9, r10, r11, r12, r13)
            r0.A09(r8)
            goto L_0x0029
        L_0x01db:
            java.lang.String r0 = "MediaViewMenu/onOptionSelected/Jid is null to report the message."
            goto L_0x02e7
        L_0x01df:
            boolean r0 = r14 instanceof X.AnonymousClass215
            if (r0 == 0) goto L_0x01ee
            X.4PP r1 = com.whatsapp.ephemeral.ViewOnceNuxBottomSheet.A0B
            X.1GP r0 = r2.A1F()
            r1.A00(r0, r14, r3)
            goto L_0x0029
        L_0x01ee:
            java.lang.String r0 = "MediaViewMenu/onOptionSelected/No view once message."
            goto L_0x0026
        L_0x01f2:
            X.0ve r0 = r6.A03
            boolean r0 = X.C1402270m.A01(r0)
            if (r0 == 0) goto L_0x01ff
            r2.A2O(r14)
            goto L_0x0029
        L_0x01ff:
            X.5cp r3 = new X.5cp
            r3.<init>(r2, r14, r7)
            android.view.ViewGroup r0 = r2.A03
            android.view.ViewPropertyAnimator r2 = X.C108985cd.A0F(r0)
            r0 = 100
            android.view.ViewPropertyAnimator r0 = r2.setDuration(r0)
            r0.setListener(r3)
            goto L_0x0029
        L_0x0215:
            X.00H r0 = r6.A0f
            X.10I r3 = X.AnonymousClass3MX.A0x(r0)
            r0 = 33
            X.7R0 r1 = new X.7R0
            r1.<init>(r14, r6, r2, r0)
            goto L_0x0255
        L_0x0223:
            X.00H r0 = r6.A0f
            X.10I r3 = X.AnonymousClass3MX.A0x(r0)
            r0 = 31
            goto L_0x0250
        L_0x022c:
            X.62T r1 = new X.62T
            r1.<init>()
            X.00H r0 = r6.A0N
            int r0 = X.C62242r5.A00(r14, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A00 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r1.A01 = r0
            X.00H r0 = r6.A0h
            X.C108965cb.A1F(r1, r0)
            X.00H r0 = r6.A0f
            X.10I r3 = X.AnonymousClass3MX.A0x(r0)
            r0 = 30
        L_0x0250:
            X.7R0 r1 = new X.7R0
            r1.<init>(r6, r14, r2, r0)
        L_0x0255:
            r3.CGF(r1)
            goto L_0x0029
        L_0x025a:
            X.00H r0 = r6.A0e
            android.content.Context r11 = X.C108955ca.A0A(r2, r0)
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r3)
            X.0zA r1 = r6.A01
            boolean r0 = r1.A07()
            if (r0 == 0) goto L_0x0276
            r1.A03()
            java.lang.String r0 = "isEligible"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x0276:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r5)
            java.util.List r7 = X.C18070vi.A0M(r8)
            java.lang.Integer[] r0 = new java.lang.Integer[r3]
            int r1 = r14.A0u
            X.C17880vN.A1T(r0, r1, r5)
            java.util.ArrayList r10 = X.AnonymousClass1ZU.A05(r0)
            r0 = 3
            if (r1 != r0) goto L_0x02c7
            int r0 = r14.A0D
            long r0 = X.C17890vO.A03(r0)
        L_0x0292:
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "com.whatsapp.contact.picker.ContactPicker"
            android.content.Intent r5 = X.C72473Md.A0B(r11, r0)
            java.lang.String r1 = "source_surface"
            r0 = 12
            r5.putExtra(r1, r0)
            X.C72483Me.A0h(r5, r4, r10, r9)
            if (r3 == 0) goto L_0x02ad
            java.lang.String r0 = "forward_video_duration"
            r5.putExtra(r0, r3)
        L_0x02ad:
            android.os.Bundle r1 = X.C17880vN.A0D()
            X.AnonymousClass4aU.A0C(r1, r7)
            java.lang.String r0 = "message_keys"
            r5.putExtra(r0, r1)
            java.lang.String r0 = "show_ad_creation"
            r5.putExtra(r0, r6)
            X.AnonymousClass4aU.A00(r5, r8)
            r0 = 4
        L_0x02c2:
            r2.startActivityForResult(r5, r0)
            goto L_0x0029
        L_0x02c7:
            r0 = 0
            goto L_0x0292
        L_0x02ca:
            X.1FL r2 = r2.A1B()
            if (r2 == 0) goto L_0x02e5
            X.00H r0 = r6.A0c
            java.lang.Object r1 = r0.get()
            X.1iW r1 = (X.C33251iW) r1
            X.00H r0 = r6.A0A
            java.lang.Object r0 = X.C18070vi.A0E(r0)
            X.1L9 r0 = (X.AnonymousClass1L9) r0
            r1.A0K(r2, r0, r14)
            goto L_0x0029
        L_0x02e5:
            java.lang.String r0 = "MediaViewMenu/handleShare/No message to share."
        L_0x02e7:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x0029
        L_0x02ec:
            java.lang.String r0 = "MediaViewMenu/onOptionSelected/Opening all media"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r2.A2F()
            goto L_0x0029
        L_0x02f6:
            X.00H r0 = r6.A0e
            android.content.Context r6 = X.C108955ca.A0A(r2, r0)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            long r0 = r14.A0x
            java.lang.Long r4 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "com.whatsapp.contact.picker.ContactPicker"
            android.content.Intent r3 = X.C72473Md.A0B(r6, r0)
            java.lang.String r1 = "source_surface"
            r0 = 12
            r3.putExtra(r1, r0)
            java.lang.String r0 = "set_group_icon"
            r3.putExtra(r0, r5)
            if (r4 == 0) goto L_0x031f
            java.lang.String r0 = "message_row_id"
            r3.putExtra(r0, r4)
        L_0x031f:
            r2.startActivityForResult(r3, r7)
            goto L_0x0029
        L_0x0324:
            X.00H r3 = r6.A0H
            X.1KB r1 = X.C108945cZ.A0a(r3)
            r0 = 2131891797(0x7f121655, float:1.9418324E38)
            r1.A07(r5, r0)
            X.1KB r8 = X.C108945cZ.A0a(r3)
            X.00H r0 = r6.A0E
            java.lang.Object r7 = r0.get()
            X.190 r7 = (X.AnonymousClass190) r7
            X.00H r0 = r6.A0f
            X.10I r5 = X.AnonymousClass3MX.A0x(r0)
            X.00H r0 = r6.A0V
            java.lang.Object r4 = r0.get()
            X.1gp r4 = (X.C32211gp) r4
            r0 = 12
            X.3AW r3 = new X.3AW
            r3.<init>(r14, r6, r2, r0)
            X.2Br r1 = new X.2Br
            r1.<init>(r7, r4, r14)
            java.util.concurrent.Executor r0 = r8.A05
            r1.A0A(r3, r0)
            r5.CGF(r1)
            goto L_0x0029
        L_0x0360:
            X.2rc r0 = r14.A02
            if (r0 == 0) goto L_0x0029
            java.io.File r3 = r0.A0G
            if (r3 == 0) goto L_0x0029
            X.00H r0 = r6.A0f
            X.10I r2 = X.AnonymousClass3MX.A0x(r0)
            r0 = 32
            X.7R0 r1 = new X.7R0
            r1.<init>(r14, r6, r3, r0)
        L_0x0375:
            r2.CGF(r1)
            goto L_0x0029
        L_0x037a:
            java.util.List r8 = X.C18070vi.A0M(r14)
            if (r9 != r7) goto L_0x03a2
            X.00H r0 = r6.A0f
            X.10I r7 = X.AnonymousClass3MX.A0x(r0)
            X.00H r0 = r6.A0M
            java.lang.Object r4 = r0.get()
            X.1ST r4 = (X.AnonymousClass1ST) r4
            X.1yT r3 = new X.1yT
            r3.<init>()
            X.4mI r1 = new X.4mI
            r1.<init>(r2, r8, r5)
            X.49C r0 = new X.49C
            r0.<init>(r3, r1, r4, r8)
            X.AnonymousClass3MW.A1T(r0, r7, r5)
            goto L_0x0029
        L_0x03a2:
            com.whatsapp.mediaview.DeleteMessagesDialogFragment r1 = com.whatsapp.mediaview.DeleteMessagesDialogFragment.A00(r4, r8)
            X.1GP r0 = r2.A1E()
            r1.A2C(r0, r10)
            goto L_0x0029
        L_0x03af:
            java.lang.String r0 = "MediaViewMenu/onOptionSelected/Activity for fragment is not available."
            goto L_0x0026
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.mediaview.MediaViewFragment.A24(android.view.MenuItem):boolean");
    }

    public void A2C() {
        View findViewWithTag;
        Log.i("MediaViewFragment/beginExitTransition");
        AnonymousClass21V A042 = A04(this, this.A04);
        if (!(A042 == null || (findViewWithTag = this.A09.findViewWithTag(A042.A0v)) == null)) {
            View findViewById = findViewWithTag.findViewById(2131436135);
            if (findViewById != null) {
                C108975cc.A0u(findViewById, 0);
            }
            C72453Mb.A1B(findViewWithTag.findViewById(2131436771));
        }
        super.A2C();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0045, code lost:
        if (X.AnonymousClass3MW.A0X(r8.A1H).A0B() == false) goto L_0x0047;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A2O(X.AnonymousClass21V r9) {
        /*
            r8 = this;
            android.view.View r0 = r8.A0B
            if (r0 == 0) goto L_0x00e8
            X.2rc r0 = X.AnonymousClass206.A00(r9)
            java.io.File r0 = r0.A0G
            if (r0 == 0) goto L_0x00e8
            android.net.Uri r7 = android.net.Uri.fromFile(r0)
            java.util.ArrayList r1 = X.C108965cb.A0s(r7)
            android.content.Context r0 = r8.A14()
            X.6yo r4 = new X.6yo
            r4.<init>(r0)
            r4.A0I = r1
            X.1BI r0 = r8.A0g
            java.lang.String r0 = X.C22971Dz.A06(r0)
            r4.A0D = r0
            r0 = 29
            r4.A01 = r0
            r5 = 1
            r4.A0P = r5
            r0 = 23
            r4.A02 = r0
            X.1BI r0 = r8.A0g
            boolean r0 = X.C42701yb.A01(r0)
            if (r0 == 0) goto L_0x0047
            X.00H r0 = r8.A1H
            X.1UD r0 = X.AnonymousClass3MW.A0X(r0)
            boolean r1 = r0.A0B()
            r0 = 1
            if (r1 != 0) goto L_0x0048
        L_0x0047:
            r0 = 0
        L_0x0048:
            r3 = 0
            if (r0 == 0) goto L_0x004f
            r4.A0S = r3
            r4.A0R = r5
        L_0x004f:
            int r1 = r9.A0u
            r2 = 5
            if (r1 == r5) goto L_0x0058
            r0 = 42
            if (r1 != r0) goto L_0x00e9
        L_0x0058:
            boolean r0 = X.AnonymousClass745.A00
            if (r0 == 0) goto L_0x00e9
            X.205 r0 = r9.A0v
            com.whatsapp.mediaview.PhotoView r0 = r8.A28(r0)
            if (r0 == 0) goto L_0x007f
            android.graphics.Bitmap r6 = r0.getPhoto()
            if (r6 == 0) goto L_0x007f
            X.1Lp r0 = r8.A0J
            X.1ga r5 = r0.A05()
            java.lang.StringBuilder r1 = X.C17890vO.A0f(r7)
            java.lang.String r0 = "-media_view"
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
            r5.A0F(r0, r6)
            r4.A06 = r7
        L_0x007f:
            java.util.ArrayList r5 = X.AnonymousClass000.A13()
            android.view.View r1 = r8.A17()
            r0 = 2131433402(0x7f0b17ba, float:1.8488589E38)
            android.view.View r1 = X.AnonymousClass1HF.A06(r1, r0)
            java.lang.String r0 = r7.toString()
            X.AnonymousClass3Ma.A1P(r1, r0, r5)
            android.view.View r1 = r8.A17()
            r0 = 2131432407(0x7f0b13d7, float:1.848657E38)
            android.view.View r1 = X.AnonymousClass1HF.A06(r1, r0)
            java.lang.String r0 = X.AnonymousClass1Xr.A02(r1)
            X.AnonymousClass3Ma.A1P(r1, r0, r5)
            android.view.View r1 = r8.A17()
            r0 = 2131432406(0x7f0b13d6, float:1.8486569E38)
            android.view.View r1 = X.AnonymousClass1HF.A06(r1, r0)
            java.lang.String r0 = X.AnonymousClass1Xr.A02(r1)
            X.AnonymousClass3Ma.A1P(r1, r0, r5)
            android.view.View r1 = r8.A17()
            r0 = 2131432408(0x7f0b13d8, float:1.8486573E38)
            android.view.View r1 = X.AnonymousClass1HF.A06(r1, r0)
            java.lang.String r0 = X.AnonymousClass1Xr.A02(r1)
            X.AnonymousClass3Ma.A1P(r1, r0, r5)
            X.1FL r1 = r8.A1D()
            X.0yx[] r0 = new X.C19760yx[r3]
            java.lang.Object[] r0 = r5.toArray(r0)
            X.0yx[] r0 = (X.C19760yx[]) r0
            X.5hM r0 = X.C1406772n.A01(r1, r0)
            android.content.Intent r1 = r4.A01()
            android.app.ActivityOptions r0 = r0.A00
            android.os.Bundle r0 = r0.toBundle()
            r8.A1P(r1, r2, r0)
        L_0x00e8:
            return
        L_0x00e9:
            android.content.Intent r0 = r4.A01()
            r8.startActivityForResult(r0, r2)
            X.1FL r1 = r8.A1D()
            r0 = 17432576(0x10a0000, float:2.5346597E-38)
            r1.overridePendingTransition(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.mediaview.MediaViewFragment.A2O(X.21V):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0I(com.whatsapp.mediaview.MediaViewFragment r5, int r6) {
        /*
            X.21V r4 = A04(r5, r6)
            if (r4 == 0) goto L_0x002b
            X.8Aj r0 = r5.A0m
            if (r0 == 0) goto L_0x000d
            r0.CQZ(r6)
        L_0x000d:
            X.205 r0 = r4.A0v
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x002c
            r0 = 2131898595(0x7f1230e3, float:1.9432112E38)
        L_0x0016:
            java.lang.String r1 = r5.A1H(r0)
        L_0x001a:
            com.whatsapp.TextEmojiLabel r0 = r5.A06
            if (r0 == 0) goto L_0x0021
            r0.setText(r1)
        L_0x0021:
            A0e(r5, r4)
            X.1FL r0 = r5.A1D()
            r0.invalidateOptionsMenu()
        L_0x002b:
            return
        L_0x002c:
            com.whatsapp.jid.UserJid r0 = r4.A0I()
            if (r0 == 0) goto L_0x003f
            X.1Me r2 = r5.A0M
            X.1M9 r1 = r5.A0K
            com.whatsapp.jid.UserJid r0 = r4.A0I()
            java.lang.String r1 = X.AnonymousClass3MY.A0p(r1, r2, r0)
            goto L_0x001a
        L_0x003f:
            X.1BI r2 = r5.A0g
            if (r2 == 0) goto L_0x004c
            X.1Me r1 = r5.A0M
            X.1M9 r0 = r5.A0K
            java.lang.String r1 = X.AnonymousClass3MY.A0p(r0, r1, r2)
            goto L_0x001a
        L_0x004c:
            java.lang.String r0 = "MediaViewFragment/setSenderAndDateTime/no sender and no jid"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.190 r3 = r5.A0E
            java.lang.String r2 = "null_jid_no_sender"
            r1 = 1
            java.lang.String r0 = "MediaViewFragment/setSenderAndDateTime"
            r3.A0G(r0, r2, r1)
            r0 = 2131897311(0x7f122bdf, float:1.9429508E38)
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.mediaview.MediaViewFragment.A0I(com.whatsapp.mediaview.MediaViewFragment, int):void");
    }

    public static void A0M(MediaViewFragment mediaViewFragment, AnonymousClass21V r7) {
        View findViewWithTag;
        StringBuilder A102 = AnonymousClass000.A10();
        A102.append("MediaViewFragment/prepareAudioPlayback/");
        AnonymousClass205 r2 = r7.A0v;
        C17890vO.A1A(A102, r2.A01);
        C219217x r1 = mediaViewFragment.A0U;
        if ((AnonymousClass112.A07() || r1.A0G()) && (findViewWithTag = mediaViewFragment.A09.findViewWithTag(r2)) != null) {
            mediaViewFragment.A08 = AnonymousClass3MW.A0J(findViewWithTag, 2131434198);
            VoiceNoteSeekBar voiceNoteSeekBar = (VoiceNoteSeekBar) AnonymousClass1HF.A06(findViewWithTag, 2131427903);
            mediaViewFragment.A1F = voiceNoteSeekBar;
            voiceNoteSeekBar.setOnSeekBarChangeListener(new AnonymousClass79U(mediaViewFragment));
            ImageButton imageButton = (ImageButton) AnonymousClass1HF.A06(findViewWithTag, 2131427890);
            mediaViewFragment.A1s = imageButton;
            AnonymousClass787 r3 = new AnonymousClass787(mediaViewFragment.A1F, mediaViewFragment, 20);
            if (imageButton != null) {
                imageButton.setOnClickListener(r3);
            }
            View A062 = AnonymousClass1HF.A06(findViewWithTag, 2131427900);
            mediaViewFragment.A1r = A062;
            if (mediaViewFragment.A0I) {
                A062.setOnClickListener(r3);
            } else {
                AnonymousClass3MZ.A1O(A062, mediaViewFragment, r3, 16);
            }
            AnonymousClass70T r0 = mediaViewFragment.A18;
            if (r0 != null) {
                r0.A06();
                mediaViewFragment.A18 = null;
            }
            try {
                File file = AnonymousClass206.A00(r7).A0G;
                if (file != null) {
                    AnonymousClass70T A002 = AnonymousClass70T.A00((AnonymousClass118) null, (C18030ve) null, (AnonymousClass6gC) null, file, 3);
                    mediaViewFragment.A18 = A002;
                    AnonymousClass75R r12 = new AnonymousClass75R(0);
                    if (!(A002 instanceof C121606Ku) && !(A002 instanceof C121616Kv)) {
                        ((C121626Kw) A002).A01.setOnErrorListener(r12);
                    }
                    mediaViewFragment.A18.A05();
                    StringBuilder A103 = AnonymousClass000.A10();
                    A103.append("MediaViewFragment/prepareAudioPlayback/audio duration:");
                    C17900vP.A0o(A103, mediaViewFragment.A18.A03());
                    mediaViewFragment.A02 = 2;
                    TextView textView = mediaViewFragment.A08;
                    if (textView != null) {
                        textView.setText(C64052u8.A0D(mediaViewFragment.A0W, (String) null, (long) (mediaViewFragment.A18.A03() / 1000)));
                    }
                    VoiceNoteSeekBar voiceNoteSeekBar2 = mediaViewFragment.A1F;
                    if (voiceNoteSeekBar2 != null) {
                        voiceNoteSeekBar2.setMax(mediaViewFragment.A18.A03());
                    }
                } else {
                    Log.e("MediaViewFragment/prepareAudioPlayback/audio file is null");
                    C108995ce.A11(mediaViewFragment);
                }
            } catch (IOException e) {
                Log.e("MediaViewFragment/prepareAudioPlayback/prepare fail", e);
                AnonymousClass70T r02 = mediaViewFragment.A18;
                if (r02 != null) {
                    r02.A06();
                    mediaViewFragment.A18 = null;
                }
                C108995ce.A11(mediaViewFragment);
            }
            VoiceNoteSeekBar voiceNoteSeekBar3 = mediaViewFragment.A1F;
            if (voiceNoteSeekBar3 != null) {
                voiceNoteSeekBar3.setProgress(0);
            }
            mediaViewFragment.A06();
        }
    }

    public static void A0d(MediaViewFragment mediaViewFragment, AnonymousClass21V r4) {
        Intent A0A2 = C17880vN.A0A();
        if (r4 != null) {
            A0A2.setData(Uri.fromFile(AnonymousClass206.A00(r4).A0G));
            mediaViewFragment.A0w.A06(A0A2, mediaViewFragment, 3);
            return;
        }
        Log.e("MediaViewFragment/onActivityResult/no-message-for-group-icon");
        mediaViewFragment.A0F.A08(2131890330, 0);
    }

    public static void A0f(MediaViewFragment mediaViewFragment, AnonymousClass21V r11) {
        Bundle bundle;
        String str;
        AnonymousClass1HB r8 = ((AnonymousClass1FO) ((C23301Fm) mediaViewFragment.A1D())).A00;
        if (mediaViewFragment.A0o == null || r11 == null) {
            StringBuilder A102 = AnonymousClass000.A10();
            A102.append("MediaViewFragment/onViewCreated/cannot find message for ");
            A102.append(mediaViewFragment.A0x);
            C17890vO.A0w(A102);
            mediaViewFragment.A2D();
            return;
        }
        int i = r11.A0u;
        if (i == 2 || AnonymousClass72Z.A00(i) || i == 9 || C108985cd.A1U(i)) {
            mediaViewFragment.A0z = r11;
        }
        StringBuilder A103 = AnonymousClass000.A10();
        A103.append("MediaViewFragment/onViewCreated/view message:");
        C17900vP.A0b(mediaViewFragment.A0x, A103);
        C160898Aj BHd = mediaViewFragment.A0o.BHd(r11);
        mediaViewFragment.A0m = BHd;
        BHd.CId(C108945cZ.A0X(mediaViewFragment, 22));
        mediaViewFragment.A2I(new AnonymousClass7JY(mediaViewFragment));
        mediaViewFragment.A2H(mediaViewFragment.A0m.BXL(mediaViewFragment.A0x), false);
        boolean z = mediaViewFragment.A1l;
        C160898Aj r1 = mediaViewFragment.A0m;
        if (!z) {
            r1.CNr();
        } else {
            A0J(mediaViewFragment, r1.BXL(mediaViewFragment.A0x), true);
        }
        A0E(mediaViewFragment);
        mediaViewFragment.A10 = r11;
        MediaViewCurrentMessageViewModel mediaViewCurrentMessageViewModel = mediaViewFragment.A0n;
        if (mediaViewCurrentMessageViewModel != null) {
            mediaViewCurrentMessageViewModel.A0V(r11);
        }
        if (i == 3 || i == 1) {
            mediaViewFragment.A1D.CGF(new C70643By(mediaViewFragment, r11, 13));
        } else if (AnonymousClass25A.A0I(i)) {
            C108965cb.A0B(mediaViewFragment).setFlags(DefaultCrypto.BUFFER_SIZE, DefaultCrypto.BUFFER_SIZE);
            C34441kU r0 = mediaViewFragment.A0t;
            AnonymousClass1GP A1F2 = mediaViewFragment.A1F();
            AnonymousClass206 r4 = (AnonymousClass206) ((AnonymousClass215) r11);
            AnonymousClass4PP r3 = ViewOnceNuxBottomSheet.A0B;
            C18070vi.A0d(r0, 0);
            if (r4 == null) {
                str = "ephemeral_view_once";
            } else {
                str = "ephemeral_view_once_receiver";
            }
            if (!r0.A00.A01((Object) null, str) && A1F2.A0Q("view_once_nux_v2") == null) {
                r3.A00(A1F2, r4, false);
            }
        }
        mediaViewFragment.A07 = new Handler(Looper.getMainLooper(), new AnonymousClass75Y(mediaViewFragment, 4));
        if (mediaViewFragment.A1c) {
            mediaViewFragment.A0z = null;
        }
        AnonymousClass21V r12 = mediaViewFragment.A0z;
        mediaViewFragment.A10 = r12;
        MediaViewCurrentMessageViewModel mediaViewCurrentMessageViewModel2 = mediaViewFragment.A0n;
        if (mediaViewCurrentMessageViewModel2 != null) {
            mediaViewCurrentMessageViewModel2.A0V(r12);
        }
        A0I(mediaViewFragment, mediaViewFragment.A04);
        if (!mediaViewFragment.A1c) {
            mediaViewFragment.A0y = r11;
            AnonymousClass745 r13 = mediaViewFragment.A0B;
            if (!(r13 == null || (bundle = mediaViewFragment.A00) == null)) {
                mediaViewFragment.A0F = true;
                r13.A0D(bundle, mediaViewFragment);
            }
        }
        C222119a r42 = r8.A01;
        r42.A06("on_fragment_view_created");
        r42.A0A("media_type", String.valueOf(i), true);
        int log10 = (int) Math.log10((double) r11.A01);
        if (log10 <= 17) {
            StringBuilder A104 = AnonymousClass000.A10();
            A104.append((long) Math.pow(10.0d, (double) log10));
            A104.append('_');
            String A0u2 = C17880vN.A0u(A104, (long) Math.pow(10.0d, (double) (log10 + 1)));
            if (A0u2 != null) {
                r42.A0A("file_size", A0u2, true);
            }
        }
        ((C23301Fm) mediaViewFragment.A1D()).ByB();
    }

    private void A0h(List list) {
        if (list.size() != 1 || C22971Dz.A0a((Jid) list.get(0))) {
            ((AnonymousClass1FY) A1D()).CPW(list, 1);
        } else {
            C137086ut.A00(C108945cZ.A0h(this.A1b).A1w(A14(), C108945cZ.A0i(list, 0), 0), this, this.A0S);
        }
    }

    public void A1j() {
        super.A1j();
        if (A23 && this.A1E != null) {
            this.A0F.A0I(this.A1w);
            this.A1E.A0F();
            this.A1E.A0H();
        }
    }

    public void A1t() {
        C160898Aj r0;
        super.A1t();
        if (!A23 && this.A1E != null) {
            this.A0F.A0I(this.A1w);
            this.A1E.A0F();
            this.A1E.A0H();
        }
        if (A1D().isFinishing() && (r0 = this.A0m) != null) {
            r0.COX();
        }
        C132796nb r02 = this.A1t;
        if (r02 != null) {
            r02.A03.dismiss();
        }
        A0E(this);
    }

    public void A1u() {
        AnonymousClass1HB r2 = ((AnonymousClass1FO) ((C23301Fm) A1D())).A00;
        r2.A01.A07("on_fragment_resume");
        super.A1u();
        AnonymousClass70X r0 = this.A1E;
        if (r0 != null) {
            r0.A0G();
            this.A1E.A0I();
        }
        r2.A01.A06("on_fragment_resume");
        this.A1q = SystemClock.uptimeMillis();
    }

    public void A1v() {
        AnonymousClass70X r0;
        AnonymousClass1HB r3 = ((AnonymousClass1FO) ((C23301Fm) A1D())).A00;
        r3.A01.A07("on_fragment_start");
        super.A1v();
        if (A23 && (r0 = this.A1E) != null) {
            r0.A0G();
            this.A1E.A0I();
        }
        this.A03.setAlpha(1.0f);
        r3.A01.A06("on_fragment_start");
    }

    public void A1z(Bundle bundle) {
        AnonymousClass1HB r4 = ((AnonymousClass1FO) ((C23301Fm) A1D())).A00;
        r4.A01.A07("on_fragment_create");
        AnonymousClass10I r2 = this.A1D;
        C29781cr r1 = this.A0R;
        r1.getClass();
        C98834rn.A01(r2, r1, 37);
        super.A1z(bundle);
        C18030ve r0 = this.A0e;
        C18070vi.A0d(r0, 0);
        this.A1f = !C108985cd.A1V(r0);
        AnonymousClass7RT r02 = new AnonymousClass7RT(this);
        this.A0B = r02;
        ((Thread) r02.A04).start();
        this.A1c = AnonymousClass000.A1W(bundle);
        A1Z(true);
        r4.A01.A06("on_fragment_create");
        C133286oV r42 = this.A12;
        AnonymousClass1FU A0Y2 = C108945cZ.A0Y(this);
        C18030ve r12 = this.A0e;
        C18040vf r22 = C18040vf.A02;
        this.A11 = r42.A00(A0Y2, (C135976t4) null, C18020vd.A05(r22, r12, 611), false);
        if (this.A0n == null) {
            this.A0n = (MediaViewCurrentMessageViewModel) AnonymousClass3MW.A0N(this).A00(MediaViewCurrentMessageViewModel.class);
        }
        this.A1k = C18020vd.A05(r22, this.A0e, 8890);
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x014f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A21(android.os.Bundle r9, android.view.View r10) {
        /*
            r8 = this;
            X.1FL r0 = r8.A1D()
            X.1Fm r0 = (X.C23301Fm) r0
            X.1FO r0 = (X.AnonymousClass1FO) r0
            X.1HB r0 = r0.A00
            java.lang.String r1 = "on_fragment_view_created"
            X.19a r0 = r0.A01
            r0.A07(r1)
            super.A21(r9, r10)
            java.lang.OutOfMemoryError r0 = r8.A0K
            r3 = 0
            if (r0 == 0) goto L_0x0079
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r0 = "MediaViewFragment/onViewCreated/oom/heap size:"
            r2.append(r0)
            long r4 = android.os.Debug.getNativeHeapAllocatedSize()
            r0 = 1024(0x400, double:5.06E-321)
            long r4 = r4 / r0
            r2.append(r4)
            java.lang.String r7 = " kB"
            X.C17890vO.A19(r2, r7)
            X.1Lr r6 = r8.A0N
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r0 = "MediaViewFragment/recycleBitmapGlobally/native heap size:"
            r2.append(r0)
            long r4 = android.os.Debug.getNativeHeapAllocatedSize()
            r0 = 1024(0x400, double:5.06E-321)
            long r4 = r4 / r0
            r2.append(r4)
            X.C17890vO.A19(r2, r7)
            X.1Lp r0 = r6.A02
            X.1ga r0 = r0.A04()
            X.1N0 r0 = r0.A02
            r0.A07(r3)
            com.whatsapp.LegacyMessageDialogFragment r4 = new com.whatsapp.LegacyMessageDialogFragment
            r4.<init>()
            r3 = 101(0x65, float:1.42E-43)
            r2 = 2131889985(0x7f120f41, float:1.941465E38)
            android.os.Bundle r1 = X.C17880vN.A0D()
            java.lang.String r0 = "id"
            r1.putInt(r0, r3)
            java.lang.String r0 = "message_res"
            r1.putInt(r0, r2)
            r4.A1R(r1)
            X.1GP r1 = r8.A1E()
            java.lang.String r0 = "oom_fragment"
            r4.A2C(r1, r0)
            return
        L_0x0079:
            android.os.Bundle r4 = r8.A15()
            X.17x r0 = r8.A0U
            boolean r0 = r0.A0D()
            if (r0 == 0) goto L_0x0112
            com.whatsapp.mediaview.MediaViewCurrentMessageViewModel r0 = r8.A0n
            if (r0 == 0) goto L_0x0094
            X.1DT r2 = r0.A01
            X.1q9 r1 = r8.A1G()
            r0 = 10
            X.AnonymousClass7AQ.A01(r1, r2, r8, r0)
        L_0x0094:
            java.lang.String r0 = ""
            X.205 r0 = X.AnonymousClass4aU.A03(r4, r0)
            X.C17960vV.A07(r0)
            r8.A0x = r0
            java.lang.String r1 = "player_start_pos"
            int r0 = r4.getInt(r1, r3)
            r8.A01 = r0
            r5 = -1
            int r0 = r4.getInt(r1, r5)
            r2 = 1
            boolean r0 = X.AnonymousClass000.A1S(r0, r5)
            r8.A1u = r0
            java.lang.String r0 = "jid"
            X.1BI r0 = X.C72463Mc.A0f(r4, r0)
            r8.A0g = r0
            java.lang.String r0 = "nogallery"
            boolean r0 = r4.getBoolean(r0, r3)
            r8.A1l = r0
            java.lang.String r6 = "start_t"
            r0 = 0
            long r0 = r4.getLong(r6, r0)
            r8.A06 = r0
            java.lang.String r0 = "gallery"
            boolean r0 = r4.getBoolean(r0, r3)
            r8.A1g = r0
            java.lang.String r0 = "video_play_origin"
            int r1 = r4.getInt(r0)
            r0 = 5
            switch(r1) {
                case 1: goto L_0x014d;
                case 2: goto L_0x014b;
                case 3: goto L_0x0149;
                case 4: goto L_0x0147;
                case 5: goto L_0x00df;
                case 6: goto L_0x0145;
                default: goto L_0x00df;
            }
        L_0x00df:
            r8.A05 = r0
            java.lang.String r0 = "navigator_type"
            int r1 = r4.getInt(r0)
            java.lang.String r0 = "menu_style"
            int r0 = r4.getInt(r0)
            r8.A1p = r0
            java.lang.String r0 = "menu_set_wallpaper"
            boolean r0 = r4.getBoolean(r0, r3)
            r8.A1v = r0
            java.lang.String r0 = "message_card_index"
            int r0 = r4.getInt(r0, r5)
            r8.A03 = r0
            java.lang.String r0 = "has_high_quality_thumbnail"
            boolean r0 = r4.getBoolean(r0, r3)
            r8.A1h = r0
            if (r1 != r2) goto L_0x011e
            X.1BI r0 = r8.A0g
            if (r0 != 0) goto L_0x0116
            java.lang.String r0 = "MediaViewFragment/onViewCreated/jid navigatorfactory with null jid"
        L_0x010f:
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0112:
            r8.A2D()
            return
        L_0x0116:
            X.7Jb r0 = new X.7Jb
            r0.<init>(r8)
            r8.A0o = r0
            goto L_0x013e
        L_0x011e:
            r0 = 2
            if (r1 != r0) goto L_0x013e
            X.1FL r0 = r8.A1D()
            boolean r0 = r0 instanceof X.C23371Ft
            if (r0 == 0) goto L_0x021d
            X.1FL r0 = r8.A1D()
            X.1Ft r0 = (X.C23371Ft) r0
            com.whatsapp.HomeActivity r0 = (com.whatsapp.HomeActivity) r0
            X.5jU r1 = r0.A0s
            r8.A0o = r1
            boolean r0 = r1 instanceof X.C218317o
            if (r0 == 0) goto L_0x013e
            X.1Fw r0 = r8.A0L
            r0.A05(r1)
        L_0x013e:
            X.87Z r0 = r8.A0o
            if (r0 != 0) goto L_0x014f
            java.lang.String r0 = "MediaViewFragment/onViewCreated/null navigatorfactory"
            goto L_0x010f
        L_0x0145:
            r0 = 6
            goto L_0x00df
        L_0x0147:
            r0 = 4
            goto L_0x00df
        L_0x0149:
            r0 = 3
            goto L_0x00df
        L_0x014b:
            r0 = 2
            goto L_0x00df
        L_0x014d:
            r0 = 1
            goto L_0x00df
        L_0x014f:
            boolean r0 = r8.A1l
            if (r0 == 0) goto L_0x015a
            android.view.View r1 = r8.A01
            r0 = 8
            r1.setVisibility(r0)
        L_0x015a:
            if (r9 == 0) goto L_0x0172
            java.lang.String r0 = "is_different_video"
            boolean r0 = r9.getBoolean(r0, r2)
            r8.A1i = r0
            java.lang.String r0 = "gid"
            java.lang.String r1 = r9.getString(r0)
            X.1nh r0 = com.whatsapp.jid.GroupJid.Companion
            com.whatsapp.jid.GroupJid r0 = r0.A03(r1)
            r8.A0h = r0
        L_0x0172:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r0 = "MediaViewFragment/onViewCreated/found-key "
            r2.append(r0)
            X.205 r0 = r8.A0x
            X.1BI r0 = r0.A00
            r2.append(r0)
            java.lang.String r0 = " me:"
            r2.append(r0)
            X.205 r1 = r8.A0x
            boolean r0 = r1.A02
            r2.append(r0)
            java.lang.String r0 = " id:"
            r2.append(r0)
            java.lang.String r0 = r1.A01
            X.C17890vO.A1A(r2, r0)
            com.whatsapp.mediaview.MediaViewCurrentMessageViewModel r0 = r8.A0n
            if (r0 == 0) goto L_0x01ef
            X.0ve r2 = r8.A0e
            X.C18070vi.A0d(r2, r3)
            X.0vf r1 = X.C18040vf.A01
            r0 = 6649(0x19f9, float:9.317E-42)
            boolean r0 = X.C18020vd.A05(r1, r2, r0)
            if (r0 == 0) goto L_0x01ef
            X.0ve r0 = r8.A0e
            boolean r0 = X.C1402270m.A01(r0)
            if (r0 != 0) goto L_0x01c0
            boolean r0 = r8.A2M()
            if (r0 == 0) goto L_0x01e7
            X.1FL r0 = r8.A1D()
            r0.A2Y()
        L_0x01c0:
            com.whatsapp.mediaview.MediaViewCurrentMessageViewModel r5 = r8.A0n
            r0 = 35
            X.7S3 r4 = new X.7S3
            r4.<init>((java.lang.Object) r8, (int) r0)
            X.1OX r3 = X.C41561wd.A00(r5)
            X.0wl r2 = r5.A06
            r1 = 0
            com.whatsapp.mediaview.MediaViewCurrentMessageViewModel$loadMessageMedia$1 r0 = new com.whatsapp.mediaview.MediaViewCurrentMessageViewModel$loadMessageMedia$1
            r0.<init>(r5, r1, r4)
            X.AnonymousClass3MW.A1X(r2, r0, r3)
        L_0x01d8:
            X.1Lf r1 = r8.A0L
            X.1Gv r0 = r8.A20
            r1.registerObserver(r0)
            X.1Lg r1 = r8.A0Z
            X.1WR r0 = r8.A21
            r1.registerObserver(r0)
            return
        L_0x01e7:
            X.1mt r1 = androidx.fragment.app.Fragment.A0K(r8)
            r0 = 1
            r1.A0E = r0
            goto L_0x01c0
        L_0x01ef:
            X.205 r1 = r8.A0x
            X.1W6 r0 = r8.A15     // Catch:{ all -> 0x021b }
            X.206 r2 = X.C108945cZ.A0s(r1, r0)     // Catch:{ all -> 0x021b }
            boolean r0 = r2 instanceof X.AnonymousClass23N
            r1 = 0
            if (r0 != 0) goto L_0x0217
            boolean r0 = r2 instanceof X.AnonymousClass21L
            if (r0 != 0) goto L_0x0209
            X.205 r1 = r8.A0x
            X.1W6 r0 = r8.A15     // Catch:{ all -> 0x021b }
            X.206 r1 = X.C108945cZ.A0s(r1, r0)     // Catch:{ all -> 0x021b }
            goto L_0x0215
        L_0x0209:
            boolean r0 = X.C20120A8f.A07(r2)
            if (r0 == 0) goto L_0x0217
            int r0 = r8.A03
            X.206 r1 = X.C20120A8f.A01(r2, r0)
        L_0x0215:
            X.21V r1 = (X.AnonymousClass21V) r1
        L_0x0217:
            A0f(r8, r1)
            goto L_0x01d8
        L_0x021b:
            r0 = move-exception
            throw r0
        L_0x021d:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            X.1FL r0 = r8.A1D()
            r1.append(r0)
            java.lang.String r0 = " should implement "
            r1.append(r0)
            java.lang.String r0 = "MediaViewHost"
            java.lang.String r1 = X.AnonymousClass000.A0y(r0, r1)
            java.lang.ClassCastException r0 = new java.lang.ClassCastException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.mediaview.MediaViewFragment.A21(android.os.Bundle, android.view.View):void");
    }

    public void A2D() {
        super.A2D();
        Map map = this.A1y;
        Iterator A0l2 = C17890vO.A0l(map);
        while (A0l2.hasNext()) {
            ((AnonymousClass70X) A0l2.next()).A0F();
        }
        map.clear();
    }

    public void A2L(boolean z, boolean z2) {
        super.A2L(z, z2);
        ReactionsTrayViewModel reactionsTrayViewModel = this.A13;
        if (reactionsTrayViewModel != null) {
            reactionsTrayViewModel.A0T(0);
        }
    }

    public void A2N(AnonymousClass206 r10, AnonymousClass206 r11) {
        long A022 = AnonymousClass25A.A02(r10);
        long A032 = AnonymousClass25A.A03(r10);
        AnonymousClass206 BWF = this.A0u.BWF(r10);
        AnonymousClass1LU A0h2 = C108945cZ.A0h(this.A1b);
        Context A142 = A14();
        AnonymousClass205 r5 = r10.A0v;
        Intent A062 = AnonymousClass3MY.A06(A142, A0h2, r5.A00);
        A062.putExtra("row_id", A022);
        A062.putExtra("sort_id", A032);
        if (BWF != null) {
            A062.putExtra("parent_row_id", BWF.A0x);
            A062.putExtra("parent_sort_id", BWF.A0y);
        }
        if (r11 != null) {
            A062.putExtra("carousel_card_idx", C20120A8f.A02(r11));
        }
        AnonymousClass4aU.A00(A062, r5);
        C137086ut.A00(A062, this, this.A0S);
    }

    public void Br8() {
        A0G(this);
        AnonymousClass70X r1 = this.A1E;
        if (!(r1 == null || this.A10 == null)) {
            r1.A0F();
            this.A1E.A0C();
            this.A1z.remove(this.A10.A0v);
            this.A1x.remove(this.A10.A0v);
            this.A1E = null;
        }
        C160898Aj r0 = this.A0m;
        if (r0 == null || r0.getCount() == 1) {
            A2D();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C132796nb r0 = this.A1t;
        if (r0 != null) {
            r0.A03.dismiss();
        }
    }
}
