package com.whatsapp.calling.incallnotifbanner.viewmodel;

import X.A99;
import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass1DF;
import X.AnonymousClass1G4;
import X.AnonymousClass1G7;
import X.AnonymousClass1OS;
import X.AnonymousClass1OX;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3VX;
import X.AnonymousClass4Z8;
import X.AnonymousClass4ZN;
import X.AnonymousClass7C7;
import X.C122636Rd;
import X.C136336te;
import X.C147277Sn;
import X.C149057iR;
import X.C149067iS;
import X.C157377wp;
import X.C157387wq;
import X.C157397wr;
import X.C157407ws;
import X.C157417wt;
import X.C157927ys;
import X.C160968Au;
import X.C175258yP;
import X.C18070vi;
import X.C18100vl;
import X.C18140vp;
import X.C18600wl;
import X.C23421Fz;
import X.C26092CsA;
import X.C27581Wq;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C41561wd;
import X.C41731wy;
import X.C72453Mb;
import X.C72463Mc;
import X.C72473Md;
import X.C86534Sa;
import android.graphics.Bitmap;
import android.view.View;
import com.whatsapp.actionfeedback.priorityqueue.ActionFeedbackPriorityQueue;
import com.whatsapp.jid.UserJid;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

public final class InCallBannerViewModelV2 extends AnonymousClass3VX implements C160968Au {
    public AnonymousClass7C7 A00;
    public A99 A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass00H A05;
    public final AnonymousClass00H A06;
    public final AnonymousClass00H A07;
    public final AnonymousClass00H A08;
    public final AnonymousClass00H A09;
    public final AnonymousClass00H A0A;
    public final AnonymousClass00H A0B;
    public final AnonymousClass00H A0C;
    public final AnonymousClass00H A0D;
    public final AnonymousClass00H A0E;
    public final AnonymousClass00H A0F;
    public final AnonymousClass00H A0G;
    public final C18140vp A0H;
    public final C18100vl A0I = AnonymousClass1DF.A01(new C149057iR(this));
    public final C18100vl A0J;
    public final C18600wl A0K;
    public final C23421Fz A0L;
    public final C175258yP A0M;
    public final C18100vl A0N;
    public final C18100vl A0O;
    public final C18100vl A0P;
    public final C18100vl A0Q;
    public final C18100vl A0R;
    public final AnonymousClass1G4 A0S;
    public final AnonymousClass1G4 A0T;
    public final AnonymousClass1G4 A0U;

    @DebugMetadata(c = "com.whatsapp.calling.incallnotifbanner.viewmodel.InCallBannerViewModelV2$1", f = "InCallBannerViewModelV2.kt", i = {}, l = {161}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.calling.incallnotifbanner.viewmodel.InCallBannerViewModelV2$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public int label;

        public final C30391dr create(Object obj, C30391dr r4) {
            return new AnonymousClass1(r4);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return new AnonymousClass1((C30391dr) obj2).invokeSuspend(C27621Wu.A00);
        }

        public final Object invokeSuspend(Object obj) {
            C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                C30691eM.A01(obj);
                InCallBannerViewModelV2 inCallBannerViewModelV2 = InCallBannerViewModelV2.this;
                C23421Fz r2 = inCallBannerViewModelV2.A0L;
                C147277Sn r0 = new C147277Sn(inCallBannerViewModelV2, 9);
                this.label = 1;
                if (r2.BFC(this, r0) == r5) {
                    return r5;
                }
            } else if (i == 1) {
                C30691eM.A01(obj);
            } else {
                throw AnonymousClass000.A0l();
            }
            return C27621Wu.A00;
        }
    }

    public void BnL(C86534Sa r5) {
        C18070vi.A0d(r5, 0);
        if (C72463Mc.A1Z(this.A0H)) {
            AnonymousClass3MW.A1X(this.A0K, new InCallBannerViewModelV2$maybeShowCallOnHold$1(r5, this, (C30391dr) null), C41561wd.A00(this));
        }
    }

    public void Bz3(C136336te r5, boolean z) {
        C18070vi.A0d(r5, 1);
        AnonymousClass3MW.A1X(this.A0K, new InCallBannerViewModelV2$onNetworkHealthChanged$1(this, r5, (C30391dr) null, z), C41561wd.A00(this));
    }

    public void C33(UserJid userJid, boolean z, boolean z2) {
        C18070vi.A0d(userJid, 1);
        AnonymousClass1OX A002 = C41561wd.A00(this);
        AnonymousClass3MW.A1X(this.A0K, new InCallBannerViewModelV2$onRemoveUserFailed$1(this, userJid, (C30391dr) null, z, z2), A002);
    }

    public void C36(UserJid userJid, boolean z, boolean z2) {
        AnonymousClass3MW.A1X(this.A0K, new InCallBannerViewModelV2$onRemovingUser$1(this, userJid, (C30391dr) null, z2, z), C72453Mb.A12(this, userJid));
    }

    public void C6T(C27581Wq r6) {
        C18070vi.A0d(r6, 0);
        if (C72473Md.A1Z(this.A0H)) {
            C86534Sa A072 = this.A0M.A07();
            AnonymousClass3MW.A1X(this.A0K, new InCallBannerViewModelV2$maybeShowCallOnHold$1(A072, this, (C30391dr) null), C41561wd.A00(this));
        }
    }

    public void CMc(View.OnClickListener onClickListener, AnonymousClass4ZN r11, AnonymousClass4ZN r12, boolean z) {
        AnonymousClass3MW.A1X(this.A0K, new InCallBannerViewModelV2$showArEffectsBanner$1(onClickListener, this, r11, r12, (C30391dr) null, z), C72453Mb.A12(this, r11));
    }

    public void CMt(Bitmap bitmap, AnonymousClass4ZN r11, AnonymousClass4ZN r12, Integer num) {
        AnonymousClass3MW.A1X(this.A0K, new InCallBannerViewModelV2$showGlassesStatusIndicator$1(bitmap, this, r11, r12, num, (C30391dr) null), C41561wd.A00(this));
    }

    public void CN2(List list, boolean z) {
        C18070vi.A0d(list, 0);
        if (!list.isEmpty()) {
            AnonymousClass3MW.A1X(this.A0K, new InCallBannerViewModelV2$showParticipantJoinedBanner$1(this, list, (C30391dr) null, z), C41561wd.A00(this));
        }
    }

    public static ActionFeedbackPriorityQueue A03(InCallBannerViewModelV2 inCallBannerViewModelV2) {
        return (ActionFeedbackPriorityQueue) inCallBannerViewModelV2.A0I.getValue();
    }

    public void A0S() {
        this.A0M.unregisterObserver(this);
    }

    public C41731wy BSA() {
        return (C41731wy) this.A0N.getValue();
    }

    public C41731wy BST() {
        return (C41731wy) this.A0O.getValue();
    }

    public C41731wy BVK() {
        return (C41731wy) this.A0P.getValue();
    }

    public C41731wy BWL() {
        return (C41731wy) this.A0Q.getValue();
    }

    public C41731wy BYL() {
        return (C41731wy) this.A0R.getValue();
    }

    public void C0b(int i) {
        AnonymousClass3MY.A1Y(this.A0T, AnonymousClass000.A1S(i, 3));
    }

    public void CJD(boolean z) {
        AnonymousClass3MY.A1Y(this.A0S, z);
    }

    public void CJG(boolean z) {
        AnonymousClass3MY.A1Y(this.A0U, z);
    }

    public void CLR(A99 a99) {
        this.A01 = a99;
        if (a99 != null) {
            AnonymousClass3VX.A00(this.A0M, this);
        }
    }

    public static final Object A04(C122636Rd r2, InCallBannerViewModelV2 inCallBannerViewModelV2, C30391dr r4) {
        return AnonymousClass3MX.A13(A03(inCallBannerViewModelV2).A03(r4, new C157927ys(r2)));
    }

    public void BIq(boolean z) {
        AnonymousClass3MW.A1X(this.A0K, new InCallBannerViewModelV2$dismissArEffectsBanner$1(this, (C30391dr) null, z), C41561wd.A00(this));
    }

    public void Bvf(boolean z) {
        AnonymousClass3MW.A1X(this.A0K, new InCallBannerViewModelV2$onHighDataUsageDetected$1(this, (C30391dr) null, z), C41561wd.A00(this));
    }

    public void Byq(UserJid userJid, boolean z) {
        AnonymousClass3MW.A1X(this.A0K, new InCallBannerViewModelV2$onMuteRequestFailed$1(this, userJid, (C30391dr) null, z), C72453Mb.A12(this, userJid));
    }

    public void Byr(UserJid userJid, boolean z) {
        AnonymousClass3MW.A1X(this.A0K, new InCallBannerViewModelV2$onMutedByOthers$1(this, userJid, (C30391dr) null, z), C72453Mb.A12(this, userJid));
    }

    public void C4Y(UserJid userJid, boolean z, boolean z2) {
        AnonymousClass3MW.A1X(this.A0K, new InCallBannerViewModelV2$onScreenShareStateChanged$1(this, userJid, (C30391dr) null, z), C72453Mb.A12(this, userJid));
    }

    public void C9p(UserJid userJid, boolean z) {
        AnonymousClass3MW.A1X(this.A0K, new InCallBannerViewModelV2$onUserRemovedSuccessfully$1(this, userJid, (C30391dr) null, z), C72453Mb.A12(this, userJid));
    }

    public void CA5(int i) {
        AnonymousClass3MW.A1X(this.A0K, new InCallBannerViewModelV2$onVideoUpgradeRequestFailed$1(this, (C30391dr) null, i), C41561wd.A00(this));
    }

    public void CMy(AnonymousClass4ZN r5) {
        AnonymousClass3MW.A1X(this.A0K, new InCallBannerViewModelV2$showMuteStatus$1(this, r5, (C30391dr) null), C41561wd.A00(this));
    }

    public void CN1(UserJid userJid, boolean z) {
        AnonymousClass3MW.A1X(this.A0K, new InCallBannerViewModelV2$showParticipantAddedBanner$1(this, userJid, (C30391dr) null, z), C41561wd.A00(this));
    }

    public void CRd(UserJid userJid, boolean z) {
        AnonymousClass3MW.A1X(this.A0K, new InCallBannerViewModelV2$userBlockFailed$1(this, userJid, (C30391dr) null, z), C72453Mb.A12(this, userJid));
    }

    public void CRe(UserJid userJid, boolean z) {
        AnonymousClass3MW.A1X(this.A0K, new InCallBannerViewModelV2$userBlockedSuccessfully$1(this, userJid, (C30391dr) null, z), C72453Mb.A12(this, userJid));
    }

    public InCallBannerViewModelV2(C175258yP r22, AnonymousClass00H r23, AnonymousClass00H r24, AnonymousClass00H r25, AnonymousClass00H r26, AnonymousClass00H r27, AnonymousClass00H r28, AnonymousClass00H r29, AnonymousClass00H r30, AnonymousClass00H r31, AnonymousClass00H r32, AnonymousClass00H r33, AnonymousClass00H r34, AnonymousClass00H r35, AnonymousClass00H r36, AnonymousClass00H r37, C18140vp r38, C18600wl r39) {
        AnonymousClass00H r20 = r23;
        C18070vi.A0d(r20, 1);
        AnonymousClass00H r18 = r25;
        C175258yP r14 = r22;
        AnonymousClass00H r19 = r24;
        C18070vi.A0p(r19, r14, r18);
        AnonymousClass00H r17 = r26;
        C18070vi.A0d(r17, 5);
        AnonymousClass00H r12 = r30;
        AnonymousClass00H r11 = r31;
        AnonymousClass00H r16 = r27;
        AnonymousClass00H r15 = r28;
        AnonymousClass00H r13 = r29;
        C18070vi.A0x(r16, r15, r13, r12, r11);
        AnonymousClass00H r10 = r32;
        AnonymousClass00H r9 = r33;
        AnonymousClass00H r8 = r34;
        AnonymousClass00H r7 = r35;
        AnonymousClass00H r6 = r36;
        C18070vi.A0y(r10, r9, r8, r7, r6);
        AnonymousClass00H r5 = r37;
        C18140vp r4 = r38;
        C18070vi.A0m(r5, r4);
        C18600wl r3 = r39;
        C18070vi.A0d(r3, 18);
        this.A02 = r20;
        this.A05 = r19;
        this.A0M = r14;
        this.A07 = r18;
        this.A04 = r17;
        this.A0G = r16;
        this.A03 = r15;
        this.A0A = r13;
        this.A0C = r12;
        this.A0E = r11;
        this.A08 = r10;
        this.A0F = r9;
        this.A0B = r8;
        this.A0D = r7;
        this.A06 = r6;
        this.A09 = r5;
        this.A0H = r4;
        this.A0K = r3;
        Boolean A0h = AnonymousClass000.A0h();
        AnonymousClass1G7 A18 = AnonymousClass3MW.A18(A0h);
        this.A0T = A18;
        AnonymousClass1G7 A182 = AnonymousClass3MW.A18(A0h);
        this.A0S = A182;
        AnonymousClass1G7 A183 = AnonymousClass3MW.A18(true);
        this.A0U = A183;
        this.A0L = C26092CsA.A02(AnonymousClass4Z8.A02(new InCallBannerViewModelV2$viewState$1((C30391dr) null), A18, A182, A183, (C23421Fz) A03(this).A00.getValue()));
        this.A0J = AnonymousClass1DF.A01(new C149067iS(this));
        this.A0R = AnonymousClass1DF.A01(C157417wt.A00);
        this.A0N = AnonymousClass1DF.A01(C157377wp.A00);
        this.A0O = AnonymousClass1DF.A01(C157387wq.A00);
        this.A0Q = AnonymousClass1DF.A01(C157407ws.A00);
        this.A0P = AnonymousClass1DF.A01(C157397wr.A00);
        r14.registerObserver(this);
        AnonymousClass3MX.A1Q(new AnonymousClass1((C30391dr) null), C41561wd.A00(this));
    }
}
