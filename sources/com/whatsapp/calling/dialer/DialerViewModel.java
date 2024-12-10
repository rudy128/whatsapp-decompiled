package com.whatsapp.calling.dialer;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass11S;
import X.AnonymousClass1D6;
import X.AnonymousClass1DF;
import X.AnonymousClass1DS;
import X.AnonymousClass1E7;
import X.AnonymousClass1G1;
import X.AnonymousClass1G4;
import X.AnonymousClass1G7;
import X.AnonymousClass1J2;
import X.AnonymousClass1OS;
import X.AnonymousClass1OX;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass4I6;
import X.AnonymousClass4Z6;
import X.AnonymousClass4Z7;
import X.AnonymousClass4ZC;
import X.AnonymousClass5AH;
import X.AnonymousClass5DV;
import X.AnonymousClass5UU;
import X.AnonymousClass5WQ;
import X.C106325Vk;
import X.C108705cA;
import X.C18070vi;
import X.C18100vl;
import X.C18600wl;
import X.C23421Fz;
import X.C25585CiP;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C34081jt;
import X.C41561wd;
import X.C41731wy;
import X.C72473Md;
import X.C88084Yg;
import X.C99454sq;
import X.C99464sr;
import android.graphics.drawable.Drawable;
import kotlin.coroutines.jvm.internal.DebugMetadata;

public final class DialerViewModel extends AnonymousClass1J2 {
    public final AnonymousClass1DS A00;
    public final AnonymousClass1DS A01;
    public final AnonymousClass1DS A02;
    public final AnonymousClass11S A03;
    public final DialerHelper A04;
    public final C25585CiP A05;
    public final DialerRepository A06;
    public final AnonymousClass00H A07;
    public final AnonymousClass00H A08;
    public final AnonymousClass00H A09;
    public final AnonymousClass00H A0A;
    public final AnonymousClass00H A0B;
    public final StringBuilder A0C = AnonymousClass000.A10();
    public final C18100vl A0D;
    public final C18600wl A0E;
    public final C23421Fz A0F;
    public final C23421Fz A0G;
    public final AnonymousClass1G4 A0H;
    public final AnonymousClass1G1 A0I;
    public final AnonymousClass1G1 A0J;
    public final AnonymousClass1G1 A0K;
    public final C41731wy A0L;
    public final C41731wy A0M;
    public final C41731wy A0N;

    @DebugMetadata(c = "com.whatsapp.calling.dialer.DialerViewModel$1", f = "DialerViewModel.kt", i = {}, l = {94}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.calling.dialer.DialerViewModel$1  reason: invalid class name */
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
                C99454sq A00 = AnonymousClass4I6.A00(new AnonymousClass5UU(1000), DialerViewModel.this.A0H);
                final DialerViewModel dialerViewModel = DialerViewModel.this;
                AnonymousClass1 r0 = new AnonymousClass1OS((C30391dr) null) {
                    public /* synthetic */ Object L$0;
                    public int label;

                    public final C30391dr create(Object obj, C30391dr r4) {
                        AnonymousClass1 r0 = 

                        public DialerViewModel(AnonymousClass11S r18, DialerHelper dialerHelper, C25585CiP ciP, DialerRepository dialerRepository, AnonymousClass00H r22, AnonymousClass00H r23, AnonymousClass00H r24, AnonymousClass00H r25, AnonymousClass00H r26, C18600wl r27) {
                            DialerHelper dialerHelper2 = dialerHelper;
                            AnonymousClass00H r7 = r22;
                            AnonymousClass00H r6 = r23;
                            AnonymousClass00H r4 = r24;
                            AnonymousClass00H r2 = r25;
                            C18070vi.A0w(r7, r6, r4, dialerHelper2, r2);
                            AnonymousClass00H r1 = r26;
                            DialerRepository dialerRepository2 = dialerRepository;
                            C18070vi.A0l(r1, dialerRepository2);
                            C18600wl r0 = r27;
                            AnonymousClass11S r9 = r18;
                            C72473Md.A1K(r9, r0);
                            this.A07 = r7;
                            this.A09 = r6;
                            this.A08 = r4;
                            this.A04 = dialerHelper2;
                            this.A0A = r2;
                            this.A0B = r1;
                            this.A06 = dialerRepository2;
                            this.A05 = ciP;
                            this.A03 = r9;
                            this.A0E = r0;
                            AnonymousClass1G7 A18 = AnonymousClass3MW.A18("");
                            this.A0H = A18;
                            this.A0D = AnonymousClass1DF.A01(new AnonymousClass5DV(this));
                            DialerViewModel$formattedPhoneNumber$1 dialerViewModel$formattedPhoneNumber$1 = new DialerViewModel$formattedPhoneNumber$1(this, (C30391dr) null);
                            AnonymousClass4Z6 r02 = AnonymousClass4Z6.$redex_init_class;
                            AnonymousClass5WQ A002 = AnonymousClass4Z6.A00(new AnonymousClass5AH((C30391dr) null, dialerViewModel$formattedPhoneNumber$1), A18);
                            AnonymousClass1OX A003 = C41561wd.A00(this);
                            C108705cA r42 = AnonymousClass4ZC.A00;
                            C34081jt A012 = AnonymousClass4Z7.A01("", A003, A002, r42);
                            this.A0J = A012;
                            this.A0F = AnonymousClass4Z6.A00(new AnonymousClass5AH((C30391dr) null, new DialerViewModel$clearButtonVisibility$1((C30391dr) null)), A012);
                            AnonymousClass5WQ A004 = AnonymousClass4Z6.A00(new AnonymousClass5AH((C30391dr) null, new DialerViewModel$phonebookContact$1(this, (C30391dr) null)), A18);
                            this.A0G = A004;
                            AnonymousClass5WQ A005 = AnonymousClass4Z6.A00(new AnonymousClass5AH((C30391dr) null, new DialerViewModel$addContactButtonVisibility$1(this, (C30391dr) null)), A004);
                            this.A0I = AnonymousClass4Z7.A01(AnonymousClass000.A0h(), C41561wd.A00(this), A005, r42);
                            C41731wy A0o = AnonymousClass3MW.A0o();
                            this.A0N = A0o;
                            this.A02 = A0o;
                            C41731wy A0o2 = AnonymousClass3MW.A0o();
                            this.A0M = A0o2;
                            this.A01 = A0o2;
                            C41731wy A0o3 = AnonymousClass3MW.A0o();
                            this.A0L = A0o3;
                            this.A00 = A0o3;
                            C99454sq A006 = AnonymousClass4I6.A00(C106325Vk.A00, new C99454sq(new C99464sr(this, dialerRepository2.A02, 3), 13));
                            this.A0K = AnonymousClass4Z7.A01(new C88084Yg((Drawable) null, (AnonymousClass1E7) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (AnonymousClass1D6) null, false, false), C41561wd.A00(this), A006, r42);
                            AnonymousClass3MX.A1Q(new AnonymousClass1((C30391dr) null), C41561wd.A00(this));
                        }

                        /* JADX WARNING: Removed duplicated region for block: B:11:0x0027  */
                        /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
                        /* Code decompiled incorrectly, please refer to instructions dump. */
                        public static final java.lang.Object A00(com.whatsapp.calling.dialer.DialerViewModel r6, java.lang.String r7, X.C30391dr r8) {
                            /*
                                boolean r0 = r8 instanceof X.C100294uH
                                if (r0 == 0) goto L_0x0041
                                r5 = r8
                                X.4uH r5 = (X.C100294uH) r5
                                int r2 = r5.label
                                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                                r0 = r2 & r1
                                if (r0 == 0) goto L_0x0041
                                int r2 = r2 - r1
                                r5.label = r2
                            L_0x0012:
                                java.lang.Object r2 = r5.result
                                X.1g4 r4 = X.C31751g4.COROUTINE_SUSPENDED
                                int r0 = r5.label
                                r1 = 1
                                if (r0 == 0) goto L_0x0027
                                if (r0 != r1) goto L_0x0047
                                java.lang.Object r7 = r5.L$0
                                X.C30691eM.A01(r2)
                            L_0x0022:
                                X.1D6 r0 = X.AnonymousClass1D6.A01(r7, r2)
                                return r0
                            L_0x0027:
                                X.C30691eM.A01(r2)
                                com.whatsapp.calling.dialer.DialerRepository r0 = r6.A06
                                r5.L$0 = r7
                                r5.label = r1
                                com.whatsapp.calling.dialer.DialerDataSourceLocal r3 = r0.A00
                                X.0wl r2 = r3.A01
                                r1 = 0
                                com.whatsapp.calling.dialer.DialerDataSourceLocal$getContactFromPhonebook$2 r0 = new com.whatsapp.calling.dialer.DialerDataSourceLocal$getContactFromPhonebook$2
                                r0.<init>(r3, r7, r1)
                                java.lang.Object r2 = X.C30451dy.A00(r5, r2, r0)
                                if (r2 != r4) goto L_0x0022
                                return r4
                            L_0x0041:
                                X.4uH r5 = new X.4uH
                                r5.<init>(r6, r8)
                                goto L_0x0012
                            L_0x0047:
                                java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
                                throw r0
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.dialer.DialerViewModel.A00(com.whatsapp.calling.dialer.DialerViewModel, java.lang.String, X.1dr):java.lang.Object");
                        }

                        public static final void A03(DialerViewModel dialerViewModel) {
                            dialerViewModel.A0H.setValue(C18070vi.A0H(dialerViewModel.A0C));
                        }

                        /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
                        /* JADX WARNING: Removed duplicated region for block: B:15:0x0033  */
                        /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
                        /* Code decompiled incorrectly, please refer to instructions dump. */
                        public final java.lang.Object A0T(android.content.Context r7, X.C30391dr r8) {
                            /*
                                r6 = this;
                                boolean r0 = r8 instanceof X.C100304uI
                                if (r0 == 0) goto L_0x007d
                                r4 = r8
                                X.4uI r4 = (X.C100304uI) r4
                                int r2 = r4.label
                                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                                r0 = r2 & r1
                                if (r0 == 0) goto L_0x007d
                                int r2 = r2 - r1
                                r4.label = r2
                            L_0x0012:
                                java.lang.Object r2 = r4.result
                                X.1g4 r5 = X.C31751g4.COROUTINE_SUSPENDED
                                int r0 = r4.label
                                r3 = 1
                                if (r0 == 0) goto L_0x0033
                                if (r0 != r3) goto L_0x0083
                                java.lang.Object r1 = r4.L$0
                                com.whatsapp.calling.dialer.DialerViewModel r1 = (com.whatsapp.calling.dialer.DialerViewModel) r1
                                X.C30691eM.A01(r2)
                            L_0x0024:
                                boolean r0 = X.AnonymousClass000.A1Y(r2)
                                if (r0 == 0) goto L_0x0030
                                X.1wy r1 = r1.A0L
                            L_0x002c:
                                r0 = 0
                                r1.A0F(r0)
                            L_0x0030:
                                X.1Wu r0 = X.C27621Wu.A00
                                return r0
                            L_0x0033:
                                X.C30691eM.A01(r2)
                                X.1G4 r0 = r6.A0H
                                java.lang.Object r1 = r0.getValue()
                                java.lang.String r1 = (java.lang.String) r1
                                X.1G1 r0 = r6.A0K
                                java.lang.Object r0 = r0.getValue()
                                X.4Yg r0 = (X.C88084Yg) r0
                                X.1E7 r0 = r0.A01
                                if (r0 == 0) goto L_0x0072
                                X.1BI r2 = r0.A0J
                                if (r2 == 0) goto L_0x0072
                                boolean r0 = X.C42701yb.A01(r2)
                                if (r0 == 0) goto L_0x0057
                                X.1wy r1 = r6.A0M
                                goto L_0x002c
                            L_0x0057:
                                boolean r0 = X.C22971Dz.A0d(r2)
                                if (r0 == 0) goto L_0x0030
                                com.whatsapp.calling.dialer.DialerHelper r1 = r6.A04
                                com.whatsapp.jid.UserJid r0 = X.C22941Dw.A00(r2)
                                if (r0 == 0) goto L_0x0088
                                r4.L$0 = r6
                                r4.label = r3
                                java.lang.Object r2 = r1.A04(r7, r0, r4)
                                if (r2 != r5) goto L_0x0070
                                return r5
                            L_0x0070:
                                r1 = r6
                                goto L_0x0024
                            L_0x0072:
                                boolean r0 = X.AnonymousClass1YF.A0T(r1)
                                r0 = r0 ^ 1
                                if (r0 == 0) goto L_0x0030
                                X.1wy r1 = r6.A0N
                                goto L_0x002c
                            L_0x007d:
                                X.4uI r4 = new X.4uI
                                r4.<init>(r6, r8)
                                goto L_0x0012
                            L_0x0083:
                                java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
                                throw r0
                            L_0x0088:
                                java.lang.IllegalArgumentException r0 = X.C17890vO.A0K()
                                throw r0
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.dialer.DialerViewModel.A0T(android.content.Context, X.1dr):java.lang.Object");
                        }
                    }
