package com.whatsapp.conversationslist;

import X.AnonymousClass00H;
import X.AnonymousClass1DT;
import X.AnonymousClass1J2;
import X.AnonymousClass1OS;
import X.AnonymousClass3MX;
import X.C108945cZ;
import X.C18000vb;
import X.C18070vi;
import X.C18600wl;
import X.C25161Nd;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C41561wd;
import kotlin.coroutines.jvm.internal.DebugMetadata;

public final class InteropViewModel extends AnonymousClass1J2 {
    public int A00;
    public final AnonymousClass1DT A01 = C108945cZ.A0S();
    public final C25161Nd A02;
    public final C18000vb A03;
    public final AnonymousClass00H A04;
    public final C18600wl A05;

    @DebugMetadata(c = "com.whatsapp.conversationslist.InteropViewModel$1", f = "InteropViewModel.kt", i = {}, l = {34}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.conversationslist.InteropViewModel$1  reason: invalid class name */
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
                final InteropViewModel interopViewModel = InteropViewModel.this;
                C18600wl r2 = interopViewModel.A05;
                AnonymousClass1 r0 = new AnonymousClass1OS((C30391dr) null) {
                    public int label;

                    public final C30391dr create(Object obj, C30391dr r4) {
                        return 

                        public final void A0T() {
                            String format;
                            AnonymousClass1DT r3 = this.A01;
                            int A042 = this.A02.A04();
                            this.A00 = A042;
                            if (A042 <= 0) {
                                format = null;
                            } else {
                                format = this.A03.A0L().format((long) this.A00);
                            }
                            r3.A0F(format);
                        }

                        public InteropViewModel(C25161Nd r4, C18000vb r5, AnonymousClass00H r6, C18600wl r7) {
                            C18070vi.A0s(r5, r4, r6, r7);
                            this.A03 = r5;
                            this.A02 = r4;
                            this.A04 = r6;
                            this.A05 = r7;
                            AnonymousClass3MX.A1Q(new AnonymousClass1((C30391dr) null), C41561wd.A00(this));
                        }
                    }
