package com.whatsapp.dobverification;

import X.AnonymousClass000;
import X.AnonymousClass1CM;
import X.AnonymousClass1OS;
import X.AnonymousClass6WH;
import X.C108995ce;
import X.C125846bm;
import X.C143907Fg;
import X.C143927Fi;
import X.C143937Fj;
import X.C143947Fk;
import X.C143957Fl;
import X.C143967Fm;
import X.C144007Fq;
import X.C144057Fv;
import X.C144067Fw;
import X.C1595584z;
import X.C17880vN;
import X.C18070vi;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.dobverification.WaConsentRepository$verifyDob$2", f = "WaConsentRepository.kt", i = {}, l = {61}, m = "invokeSuspend", n = {}, s = {})
public final class WaConsentRepository$verifyDob$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ int $day;
    public final /* synthetic */ int $month;
    public final /* synthetic */ int $year;
    public int label;
    public final /* synthetic */ WaConsentRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WaConsentRepository$verifyDob$2(WaConsentRepository waConsentRepository, C30391dr r3, int i, int i2, int i3) {
        super(2, r3);
        this.this$0 = waConsentRepository;
        this.$year = i;
        this.$month = i2;
        this.$day = i3;
    }

    public final C30391dr create(Object obj, C30391dr r8) {
        return new WaConsentRepository$verifyDob$2(this.this$0, r8, this.$year, this.$month, this.$day);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass1CM r1;
        int i;
        String str;
        int i2;
        C31751g4 r4 = C31751g4.COROUTINE_SUSPENDED;
        int i3 = this.label;
        if (i3 == 0) {
            C30691eM.A01(obj);
            if (this.this$0.A03.A00(false) == 25) {
                C125846bm r3 = this.this$0.A00;
                String A00 = AnonymousClass6WH.A00(this.$year, this.$month, this.$day);
                C18070vi.A0d(A00, 0);
                C17880vN.A1E(C108995ce.A0E(r3.A00), "age_collection_dob_string", A00);
            }
            C143907Fg r32 = this.this$0.A02;
            int i4 = this.$year;
            int i5 = this.$month;
            int i6 = this.$day;
            this.label = 1;
            obj = r32.A00(AnonymousClass6WH.A00(i4, i5, i6));
            if (obj == r4) {
                return r4;
            }
        } else if (i3 == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        WaConsentRepository waConsentRepository = this.this$0;
        C1595584z r12 = (C1595584z) obj;
        waConsentRepository.A04.CPw(r12);
        if (r12 instanceof C143927Fi) {
            str = ((C143927Fi) r12).A00;
            i2 = 28;
        } else if (r12 instanceof C143937Fj) {
            str = ((C143937Fj) r12).A00;
            i2 = 29;
        } else if (C18070vi.A18(r12, C144007Fq.A00)) {
            str = null;
            i2 = 27;
        } else if (r12 instanceof C143967Fm) {
            WaConsentRepository.A00(waConsentRepository, (C143967Fm) r12);
            return obj;
        } else {
            if (r12 instanceof C143947Fk) {
                waConsentRepository.A03((C143947Fk) r12);
                r1 = waConsentRepository.A01.A08;
                i = 26;
            } else if (r12 instanceof C143957Fl) {
                r1 = waConsentRepository.A01.A08;
                i = 30;
            } else if (C18070vi.A18(r12, C144057Fv.A00)) {
                r1 = waConsentRepository.A01.A08;
                i = 25;
            } else {
                if (C18070vi.A18(r12, C144067Fw.A00)) {
                    r1 = waConsentRepository.A01.A08;
                    i = 7;
                }
                return obj;
            }
            r1.A01(i);
            return obj;
        }
        WaConsentRepository.A01(waConsentRepository, str, i2);
        return obj;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((WaConsentRepository$verifyDob$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
