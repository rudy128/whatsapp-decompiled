package com.whatsapp.consent.common;

import X.AnonymousClass000;
import X.AnonymousClass1G0;
import X.AnonymousClass1OS;
import X.C108495bn;
import X.C108955ca;
import X.C143427Dj;
import X.C143527Dt;
import X.C143997Fp;
import X.C144017Fr;
import X.C144027Fs;
import X.C144037Ft;
import X.C144047Fu;
import X.C147207Sf;
import X.C147277Sn;
import X.C18070vi;
import X.C27183DXs;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.consent.common.CommonAgeCollector$observeConsentData$3", f = "CommonAgeCollector.kt", i = {}, l = {117}, m = "invokeSuspend", n = {}, s = {})
public final class CommonAgeCollector$observeConsentData$3 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ C143427Dj this$0;

    @DebugMetadata(c = "com.whatsapp.consent.common.CommonAgeCollector$observeConsentData$3$1", f = "CommonAgeCollector.kt", i = {}, l = {111}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.consent.common.CommonAgeCollector$observeConsentData$3$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public /* synthetic */ Object L$0;
        public int label;

        public final C30391dr create(Object obj, C30391dr r4) {
            AnonymousClass1 r0 = new AnonymousClass1(r4);
            r0.L$0 = obj;
            return r0;
        }

        public final Object invokeSuspend(Object obj) {
            C31751g4 r2 = C31751g4.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                C30691eM.A01(obj);
                Object obj2 = this.L$0;
                if (C18070vi.A18(obj2, C144047Fu.A00) || C18070vi.A18(obj2, C144037Ft.A00) || C18070vi.A18(obj2, C143997Fp.A00) || C18070vi.A18(obj2, C144027Fs.A00) || C18070vi.A18(obj2, C144017Fr.A00)) {
                    C143527Dt r0 = C143527Dt.A00;
                    this.label = 1;
                    if (((C108495bn) C143427Dj.this.A0D.getValue()).CHH(r0, this) == r2) {
                        return r2;
                    }
                }
            } else if (i == 1) {
                C30691eM.A01(obj);
            } else {
                throw AnonymousClass000.A0l();
            }
            return C27621Wu.A00;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommonAgeCollector$observeConsentData$3(C143427Dj r2, C30391dr r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new CommonAgeCollector$observeConsentData$3(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new CommonAgeCollector$observeConsentData$3(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            AnonymousClass1G0 BQm = this.this$0.A08.BQm();
            final C143427Dj r2 = this.this$0;
            C27183DXs A0I = C108955ca.A0I(new AnonymousClass1((C30391dr) null), BQm);
            C143427Dj r3 = this.this$0;
            C147207Sf r22 = new C147207Sf(r3, A0I, 2);
            C147277Sn r0 = new C147277Sn(r3, 12);
            this.label = 1;
            if (r22.BFC(this, r0) == r5) {
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
