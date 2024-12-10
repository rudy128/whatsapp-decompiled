package com.whatsapp.calling.banner.viewmodel;

import X.A99;
import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass1BI;
import X.AnonymousClass1F9;
import X.AnonymousClass1G4;
import X.AnonymousClass1G7;
import X.AnonymousClass1GC;
import X.AnonymousClass1HS;
import X.AnonymousClass1J2;
import X.AnonymousClass1OS;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass4Ck;
import X.AnonymousClass4I4;
import X.AnonymousClass4I5;
import X.AnonymousClass4Z8;
import X.AnonymousClass5Ac;
import X.C18070vi;
import X.C18600wl;
import X.C23421Fz;
import X.C26092CsA;
import X.C27183DXs;
import X.C27581Wq;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C36001nB;
import X.C41561wd;
import X.C85914Pf;
import X.C93634jI;
import X.C99454sq;
import X.C99464sr;
import com.whatsapp.calling.calldatasource.CallRepository$getParticipantAudioLevels$1;
import kotlin.coroutines.jvm.internal.DebugMetadata;

public final class MinimizedCallBannerViewModel extends AnonymousClass1J2 implements AnonymousClass1GC {
    public AnonymousClass1BI A00;
    public boolean A01;
    public boolean A02;
    public final AnonymousClass1HS A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass00H A05;
    public final C23421Fz A06;
    public final C23421Fz A07;
    public final AnonymousClass1G4 A08;
    public final AnonymousClass1G4 A09;
    public final C18600wl A0A;
    public final C23421Fz A0B;
    public final C23421Fz A0C;
    public final AnonymousClass1G4 A0D;
    public final AnonymousClass1G4 A0E;

    @DebugMetadata(c = "com.whatsapp.calling.banner.viewmodel.MinimizedCallBannerViewModel$1", f = "MinimizedCallBannerViewModel.kt", i = {}, l = {145}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.calling.banner.viewmodel.MinimizedCallBannerViewModel$1  reason: invalid class name */
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
                final MinimizedCallBannerViewModel minimizedCallBannerViewModel = MinimizedCallBannerViewModel.this;
                C27183DXs dXs = new C27183DXs((Object) minimizedCallBannerViewModel.A06, (Object) new C36001nB((C30391dr) null) {
                    public int label;

                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                        return 

                        public MinimizedCallBannerViewModel(AnonymousClass1HS r6, AnonymousClass00H r7, AnonymousClass00H r8, AnonymousClass00H r9, C18600wl r10) {
                            C18070vi.A0d(r7, 1);
                            C18070vi.A0p(r6, r8, r9);
                            C18070vi.A0d(r10, 5);
                            this.A03 = r6;
                            this.A05 = r8;
                            this.A04 = r9;
                            this.A0A = r10;
                            AnonymousClass1G7 A18 = AnonymousClass3MW.A18(AnonymousClass000.A0h());
                            this.A09 = A18;
                            AnonymousClass1G7 A182 = AnonymousClass3MW.A18(AnonymousClass4Ck.None);
                            this.A0D = A182;
                            C99464sr A012 = AnonymousClass4Z8.A01(new MinimizedCallBannerViewModel$viewState$1(this, (C30391dr) null), A182, A18, ((C85914Pf) r7.get()).A00(true));
                            this.A0C = A012;
                            C27183DXs A0L = AnonymousClass3MZ.A0L(new MinimizedCallBannerViewModelKt$emitNullOnStart$2((C30391dr) null), new C99454sq(AnonymousClass4I4.A00(new CallRepository$getParticipantAudioLevels$1((C85914Pf) r7.get(), (C30391dr) null)), 11));
                            this.A0B = A0L;
                            this.A07 = new C27183DXs((Object) AnonymousClass4I5.A00(r10, C26092CsA.A02(AnonymousClass4Z8.A00(new AnonymousClass5Ac(this, 0), A0L, A012))), (Object) new MinimizedCallBannerViewModel$uiState$2(this, (C30391dr) null), 5);
                            AnonymousClass1G7 A183 = AnonymousClass3MW.A18(C27581Wq.ON_STOP);
                            this.A0E = A183;
                            AnonymousClass1G7 A184 = AnonymousClass3MW.A18(AnonymousClass3MY.A0g());
                            this.A08 = A184;
                            this.A06 = C26092CsA.A02(AnonymousClass4Z8.A00(new MinimizedCallBannerViewModel$effectiveVisibilityState$1((C30391dr) null), A184, A183));
                            AnonymousClass3MX.A1Q(new AnonymousClass1((C30391dr) null), C41561wd.A00(this));
                        }

                        public void C6U(C27581Wq r2, AnonymousClass1F9 r3) {
                            C18070vi.A0d(r2, 1);
                            this.A0E.setValue(r2);
                        }

                        public static final void A00(MinimizedCallBannerViewModel minimizedCallBannerViewModel) {
                            AnonymousClass1G4 r3 = minimizedCallBannerViewModel.A0D;
                            Object value = r3.getValue();
                            AnonymousClass4Ck r2 = AnonymousClass4Ck.VoiceChatUi;
                            if (value == r2 && !minimizedCallBannerViewModel.A02) {
                                ((MinimizedCallBannerUseCase) minimizedCallBannerViewModel.A04.get()).A01 = true;
                            }
                            if (minimizedCallBannerViewModel.A01) {
                                r2 = AnonymousClass4Ck.ActionMode;
                            } else if (!minimizedCallBannerViewModel.A02) {
                                r2 = AnonymousClass4Ck.None;
                            }
                            r3.setValue(r2);
                        }

                        public void A0S() {
                            C93634jI.A00(MinimizedCallBannerUseCase.A00(this.A04), (A99) null);
                        }
                    }
