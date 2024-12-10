package com.whatsapp.calling.lightweightcalling.view;

import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass10I;
import X.AnonymousClass11S;
import X.AnonymousClass1BI;
import X.AnonymousClass1DF;
import X.AnonymousClass1FL;
import X.AnonymousClass1GP;
import X.AnonymousClass1L9;
import X.AnonymousClass1V9;
import X.AnonymousClass20F;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3VX;
import X.AnonymousClass4YS;
import X.AnonymousClass4aL;
import X.AnonymousClass5MU;
import X.AnonymousClass5MV;
import X.AnonymousClass5MW;
import X.AnonymousClass5R0;
import X.C101665Dm;
import X.C101675Dn;
import X.C101685Do;
import X.C101695Dp;
import X.C101705Dq;
import X.C101715Dr;
import X.C101725Ds;
import X.C101735Dt;
import X.C101745Du;
import X.C101755Dv;
import X.C104855Pt;
import X.C105165Qy;
import X.C105175Qz;
import X.C146427Pb;
import X.C155387sf;
import X.C155397sg;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C18100vl;
import X.C19740yt;
import X.C21431Ajy;
import X.C28931bI;
import X.C30361do;
import X.C36321nh;
import X.C39351sv;
import X.C43531zx;
import X.C72453Mb;
import X.C72463Mc;
import X.C72473Md;
import X.C84704Kn;
import X.C87394Vk;
import X.C89994dM;
import X.C90034dQ;
import X.C91374fa;
import X.C98254qp;
import X.C99274sY;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.ImageView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.WaTextView;
import com.whatsapp.calling.banner.viewmodel.MinimizedCallBannerViewModel;
import com.whatsapp.calling.callgrid.view.CallGrid;
import com.whatsapp.calling.callgrid.viewmodel.VoiceChatGridViewModel;
import com.whatsapp.calling.header.CallHeaderStateHolder;
import com.whatsapp.calling.lightweightcalling.viewmodel.AudioChatCallingViewModel;
import com.whatsapp.calling.lightweightcalling.viewmodel.VoiceChatBottomSheetViewModel;
import com.whatsapp.components.MaxHeightLinearLayout;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.util.Log;

public final class AudioChatBottomSheetDialog extends Hilt_AudioChatBottomSheetDialog {
    public static final C87394Vk A0S = new Object();
    public View A00;
    public ViewGroup A01;
    public BottomSheetBehavior A02;
    public AnonymousClass1L9 A03;
    public AnonymousClass11S A04;
    public WaTextView A05;
    public CallGrid A06;
    public AnonymousClass1V9 A07;
    public MaxHeightLinearLayout A08;
    public C18030ve A09;
    public C28931bI A0A;
    public C28931bI A0B;
    public C28931bI A0C;
    public C28931bI A0D;
    public C28931bI A0E;
    public C28931bI A0F;
    public AnonymousClass10I A0G;
    public AnonymousClass00H A0H;
    public AnonymousClass00H A0I;
    public AnonymousClass00H A0J;
    public boolean A0K;
    public final C18100vl A0L;
    public final C18100vl A0M;
    public final C18100vl A0N;
    public final C18100vl A0O;
    public final C18100vl A0P;
    public final C18100vl A0Q;
    public final int A0R = 2131624228;

    public void A21(Bundle bundle, View view) {
        String str;
        String str2;
        Integer num;
        View A0M2;
        View.OnClickListener r1;
        String str3;
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        Bundle bundle2 = this.A06;
        if (bundle2 != null) {
            str = bundle2.getString("audio_chat_call_id");
        } else {
            str = null;
        }
        C36321nh r3 = GroupJid.Companion;
        Bundle bundle3 = this.A06;
        if (bundle3 != null) {
            str2 = bundle3.getString("voice_chat_group_jid");
        } else {
            str2 = null;
        }
        GroupJid A032 = r3.A03(str2);
        Bundle bundle4 = this.A06;
        if (bundle4 != null) {
            num = Integer.valueOf(bundle4.getInt("voice_chat_call_from_ui"));
        } else {
            num = null;
        }
        if (str == null) {
            C18030ve r6 = this.A09;
            if (r6 != null) {
                if (C18020vd.A00(C18040vf.A02, r6, 5429) == 0) {
                    str3 = "AudioChatBottomSheetDialog/onViewCreated no call id argument";
                } else if (A032 == null || (num != null && num.intValue() == 0)) {
                    str3 = "AudioChatBottomSheetDialog/onViewCreated no groupJid or callFromUi argument";
                }
                Log.e(str3);
                A29();
                return;
            }
            AnonymousClass3MW.A1A();
            throw null;
        }
        ViewParent parent = view.getParent();
        C18070vi.A0z(parent, "null cannot be cast to non-null type android.view.View");
        BottomSheetBehavior A022 = BottomSheetBehavior.A02((View) parent);
        this.A02 = A022;
        if (A022 != null) {
            A022.A0Y(0, false);
        }
        BottomSheetBehavior bottomSheetBehavior = this.A02;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.A0W(3);
        }
        AnonymousClass1GP A1E = A1E();
        A1E.A0t(new C91374fa(this, 5), A1G(), "participant_list_request");
        A1E.A0t(new C91374fa(this, 6), A1G(), "more_menu_dismissed");
        ViewParent parent2 = view.getParent();
        C18070vi.A0z(parent2, "null cannot be cast to non-null type android.view.View");
        AnonymousClass3MY.A0v(view.getContext(), (View) parent2, 2131231025);
        this.A08 = (MaxHeightLinearLayout) view;
        A00();
        C18030ve r12 = this.A09;
        if (r12 != null) {
            C18040vf r62 = C18040vf.A01;
            if (C18020vd.A05(r62, r12, 7875)) {
                A0M2 = C72453Mb.A0S(view, 2131431390);
                r1 = new C89994dM(this, view, 40);
            } else {
                C89994dM.A00(C72453Mb.A0S(view, 2131431384), this, view, 41);
                this.A05 = AnonymousClass3MW.A0T(view, 2131436208);
                this.A01 = AnonymousClass3MW.A0C(view, 2131430232);
                this.A0D = C28931bI.A00(view, 2131430152);
                this.A0F = C28931bI.A00(view, 2131433434);
                View A0M3 = C72463Mc.A0M(view, 2131432761);
                C18070vi.A0X(A0M3);
                C90034dQ.A01(A0M3, this, 29);
                ImageView A0G2 = AnonymousClass3MW.A0G(A0M3, 2131432762);
                ViewGroup.LayoutParams layoutParams = A0G2.getLayoutParams();
                if (layoutParams != null) {
                    int dimensionPixelSize = A0G2.getResources().getDimensionPixelSize(2131169475);
                    layoutParams.height = dimensionPixelSize;
                    layoutParams.width = dimensionPixelSize;
                    C43531zx.A03(A0G2, new C39351sv(0, A0G2.getResources().getDimensionPixelSize(2131168786), 0, 0));
                    A0G2.setLayoutParams(layoutParams);
                    A0G2.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                    AnonymousClass3MY.A0w(A0M3.getContext(), A0M3, 2131898204);
                    A0M2 = C72463Mc.A0M(view, 2131433445);
                    C18070vi.A0X(A0M2);
                    this.A00 = A0M2;
                    r1 = new C90034dQ(this, 30);
                } else {
                    throw AnonymousClass3MY.A0k();
                }
            }
            A0M2.setOnClickListener(r1);
            this.A0B = C28931bI.A00(view, 2131429356);
            ((VoiceChatGridViewModel) this.A0O.getValue()).A00 = new C84704Kn(this);
            this.A0A = C72453Mb.A0s(view, 2131428684);
            C28931bI A002 = C28931bI.A00(view, 2131436869);
            C98254qp.A00(A002, this, 7);
            this.A0E = A002;
            this.A0C = C28931bI.A00(view, 2131429547);
            C18100vl r8 = this.A0Q;
            VoiceChatBottomSheetViewModel voiceChatBottomSheetViewModel = (VoiceChatBottomSheetViewModel) r8.getValue();
            if (str != null) {
                voiceChatBottomSheetViewModel.A04 = str;
                AnonymousClass3VX.A00(voiceChatBottomSheetViewModel.A0D, voiceChatBottomSheetViewModel);
            } else {
                voiceChatBottomSheetViewModel.A01 = A032;
                voiceChatBottomSheetViewModel.A0L.CGN(new C146427Pb(voiceChatBottomSheetViewModel, 24));
            }
            AnonymousClass3MY.A1K(A1G(), ((VoiceChatBottomSheetViewModel) r8.getValue()).A0A, AnonymousClass3MW.A16(this, 6), 26);
            AnonymousClass3MY.A1K(A1G(), ((VoiceChatBottomSheetViewModel) r8.getValue()).A0B, AnonymousClass3MW.A16(this, 7), 26);
            AnonymousClass3MY.A1K(A1G(), ((VoiceChatBottomSheetViewModel) r8.getValue()).A09, new C105165Qy(this), 26);
            C18030ve r13 = this.A09;
            if (r13 != null) {
                if (C18020vd.A05(r62, r13, 7875)) {
                    AnonymousClass00H r0 = this.A0H;
                    if (r0 != null) {
                        ((AnonymousClass4YS) ((AnonymousClass4aL) r0.get()).A0E.getValue()).A00(this, new C105175Qz(this));
                        AnonymousClass00H r02 = this.A0I;
                        if (r02 != null) {
                            ((CallHeaderStateHolder) r02.get()).A08.A00(this, new AnonymousClass5R0(this));
                            AnonymousClass00H r03 = this.A0I;
                            if (r03 != null) {
                                CallHeaderStateHolder callHeaderStateHolder = (CallHeaderStateHolder) r03.get();
                                callHeaderStateHolder.A01 = A032;
                                callHeaderStateHolder.A0C.CGN(new C21431Ajy(callHeaderStateHolder, A032, 22));
                                C28931bI r14 = this.A0B;
                                if (r14 != null) {
                                    C98254qp.A00(r14, this, 8);
                                }
                            } else {
                                C18070vi.A11("callHeaderStateHolder");
                                throw null;
                            }
                        } else {
                            C18070vi.A11("callHeaderStateHolder");
                            throw null;
                        }
                    } else {
                        C18070vi.A11("callControlStateHolder");
                        throw null;
                    }
                }
                if (C72453Mb.A1a(this.A0P)) {
                    MinimizedCallBannerViewModel minimizedCallBannerViewModel = (MinimizedCallBannerViewModel) this.A0N.getValue();
                    if (!minimizedCallBannerViewModel.A02) {
                        minimizedCallBannerViewModel.A02 = true;
                        MinimizedCallBannerViewModel.A00(minimizedCallBannerViewModel);
                    }
                } else {
                    AudioChatCallingViewModel audioChatCallingViewModel = (AudioChatCallingViewModel) this.A0L.getValue();
                    audioChatCallingViewModel.A08 = true;
                    audioChatCallingViewModel.A09 = true;
                    AnonymousClass3MY.A1L(audioChatCallingViewModel.A0F, false);
                }
                AnonymousClass00H r04 = this.A0J;
                if (r04 != null) {
                    C18100vl r05 = C30361do.A0C;
                    ((C30361do) C18070vi.A0E(r04)).A02((AnonymousClass1BI) null, 35);
                    return;
                }
                C18070vi.A11("navigationTimeSpentManager");
                throw null;
            }
            AnonymousClass3MW.A1A();
            throw null;
        }
        AnonymousClass3MW.A1A();
        throw null;
    }

    public void onConfigurationChanged(Configuration configuration) {
        C18070vi.A0d(configuration, 0);
        super.onConfigurationChanged(configuration);
        A00();
    }

    public int A2F() {
        return this.A0R;
    }

    public final AnonymousClass1V9 A2K() {
        AnonymousClass1V9 r0 = this.A07;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("callUserJourneyLogger");
        throw null;
    }

    public AudioChatBottomSheetDialog() {
        C18100vl A002 = AnonymousClass1DF.A00(AnonymousClass00R.A0C, new C101735Dt(new C101725Ds(this)));
        AnonymousClass20F A15 = AnonymousClass3MW.A15(VoiceChatBottomSheetViewModel.class);
        this.A0Q = C99274sY.A00(new C101745Du(A002), new C155397sg(this, A002), new C155387sf(A002), A15);
        AnonymousClass20F A152 = AnonymousClass3MW.A15(VoiceChatGridViewModel.class);
        this.A0O = C99274sY.A00(new C101665Dm(this), new C101675Dn(this), new AnonymousClass5MU(this), A152);
        AnonymousClass20F A153 = AnonymousClass3MW.A15(MinimizedCallBannerViewModel.class);
        this.A0N = C99274sY.A00(new C101685Do(this), new C101695Dp(this), new AnonymousClass5MV(this), A153);
        AnonymousClass20F A154 = AnonymousClass3MW.A15(AudioChatCallingViewModel.class);
        this.A0L = C99274sY.A00(new C101705Dq(this), new C101715Dr(this), new AnonymousClass5MW(this), A154);
        this.A0P = AnonymousClass1DF.A01(new C101755Dv(this));
        this.A0M = AnonymousClass1DF.A01(C104855Pt.A00);
    }

    private final void A00() {
        AnonymousClass1FL A1B = A1B();
        if (A1B != null) {
            float f = 0.85f;
            if (C72453Mb.A08(A14()) == 2) {
                f = 1.0f;
            }
            C72473Md.A0p(A1B, this.A08, f);
        }
    }

    public static final void A01(AudioChatBottomSheetDialog audioChatBottomSheetDialog) {
        audioChatBottomSheetDialog.A2K().A00(21, 35);
        BottomSheetBehavior bottomSheetBehavior = audioChatBottomSheetDialog.A02;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.A0Y(0, true);
        }
        BottomSheetBehavior bottomSheetBehavior2 = audioChatBottomSheetDialog.A02;
        if (bottomSheetBehavior2 != null) {
            bottomSheetBehavior2.A0W(4);
        }
        MaxHeightLinearLayout maxHeightLinearLayout = audioChatBottomSheetDialog.A08;
        if (maxHeightLinearLayout != null) {
            maxHeightLinearLayout.post(new C146427Pb(audioChatBottomSheetDialog, 21));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1s() {
        /*
            r5 = this;
            super.A1s()
            boolean r0 = r5.A0K
            r4 = 1
            if (r0 == 0) goto L_0x00cf
            X.1FL r0 = r5.A1B()
            r3 = 35
            if (r0 == 0) goto L_0x00c6
            boolean r0 = r0.isChangingConfigurations()
            if (r0 != 0) goto L_0x00c6
            X.0vl r0 = r5.A0Q
            java.lang.Object r2 = r0.getValue()
            com.whatsapp.calling.lightweightcalling.viewmodel.VoiceChatBottomSheetViewModel r2 = (com.whatsapp.calling.lightweightcalling.viewmodel.VoiceChatBottomSheetViewModel) r2
            java.lang.Integer r1 = r2.A03
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            if (r1 != r0) goto L_0x00c6
            X.A99 r1 = r2.A00
            if (r1 == 0) goto L_0x002c
            r0 = 0
            X.A99.A0G(r1, r0, r0, r4)
        L_0x002c:
            X.1V9 r1 = r5.A2K()
            r0 = 24
            r1.A00(r0, r3)
            r3 = 1
        L_0x0036:
            android.app.Dialog r0 = r5.A03
            if (r0 == 0) goto L_0x0045
            android.view.Window r1 = r0.getWindow()
            if (r1 == 0) goto L_0x0045
            r0 = 128(0x80, float:1.794E-43)
            r1.clearFlags(r0)
        L_0x0045:
            r2 = 0
            r5.A02 = r2
            X.0vl r0 = r5.A0P
            boolean r0 = X.C72453Mb.A1a(r0)
            if (r0 == 0) goto L_0x00b3
            X.0vl r0 = r5.A0N
            java.lang.Object r3 = r0.getValue()
            com.whatsapp.calling.banner.viewmodel.MinimizedCallBannerViewModel r3 = (com.whatsapp.calling.banner.viewmodel.MinimizedCallBannerViewModel) r3
            r1 = 0
            boolean r0 = r3.A02
            if (r0 == r1) goto L_0x0062
            r3.A02 = r1
            com.whatsapp.calling.banner.viewmodel.MinimizedCallBannerViewModel.A00(r3)
        L_0x0062:
            r5.A08 = r2
            r5.A05 = r2
            r5.A0F = r2
            X.0vl r0 = r5.A0O
            java.lang.Object r0 = r0.getValue()
            com.whatsapp.calling.callgrid.viewmodel.VoiceChatGridViewModel r0 = (com.whatsapp.calling.callgrid.viewmodel.VoiceChatGridViewModel) r0
            r0.A00 = r2
            com.whatsapp.calling.callgrid.view.CallGrid r0 = r5.A06
            if (r0 == 0) goto L_0x007f
            X.1Fv r1 = r5.getLifecycle()
            X.1GC r0 = r0.A0h
            r1.A06(r0)
        L_0x007f:
            com.whatsapp.calling.callgrid.view.CallGrid r1 = r5.A06
            if (r1 == 0) goto L_0x0092
            java.lang.String r0 = "CallGrid/clearRecyclerViewAdapter Setting adapters to null"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            androidx.recyclerview.widget.RecyclerView r0 = r1.A0l
            r0.setAdapter(r2)
            androidx.recyclerview.widget.RecyclerView r0 = r1.A0k
            r0.setAdapter(r2)
        L_0x0092:
            r5.A06 = r2
            X.1bI r1 = r5.A0E
            if (r1 == 0) goto L_0x00a6
            android.view.View r0 = r1.A00
            if (r0 == 0) goto L_0x00a6
            android.view.View r0 = r1.A02()
            com.whatsapp.calling.lightweightcalling.view.AudioChatBottomSheetFooterView r0 = (com.whatsapp.calling.lightweightcalling.view.AudioChatBottomSheetFooterView) r0
            if (r0 == 0) goto L_0x00a6
            r0.A00 = r2
        L_0x00a6:
            r5.A0E = r2
            r5.A0C = r2
            r5.A0D = r2
            r5.A00 = r2
            r5.A0B = r2
            r5.A01 = r2
            return
        L_0x00b3:
            X.0vl r0 = r5.A0L
            java.lang.Object r1 = r0.getValue()
            com.whatsapp.calling.lightweightcalling.viewmodel.AudioChatCallingViewModel r1 = (com.whatsapp.calling.lightweightcalling.viewmodel.AudioChatCallingViewModel) r1
            r0 = 0
            r1.A08 = r0
            if (r3 != 0) goto L_0x0062
            X.8yP r0 = r1.A0J
            X.AnonymousClass3VX.A00(r0, r1)
            goto L_0x0062
        L_0x00c6:
            X.1V9 r1 = r5.A2K()
            r0 = 13
            r1.A00(r0, r3)
        L_0x00cf:
            r3 = 0
            goto L_0x0036
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.lightweightcalling.view.AudioChatBottomSheetDialog.A1s():void");
    }

    public Dialog A27(Bundle bundle) {
        Dialog A27 = super.A27(bundle);
        Context A1n = A1n();
        if (A1n != null) {
            Window window = A27.getWindow();
            if (window != null) {
                window.setNavigationBarColor(C19740yt.A00(A1n, 2131101355));
            }
            Window window2 = A27.getWindow();
            if (window2 != null) {
                window2.addFlags(128);
            }
        }
        return A27;
    }
}
