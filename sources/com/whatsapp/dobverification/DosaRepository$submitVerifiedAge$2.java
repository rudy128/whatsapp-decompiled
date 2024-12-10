package com.whatsapp.dobverification;

import X.AnonymousClass000;
import X.AnonymousClass1G3;
import X.AnonymousClass1OS;
import X.C143927Fi;
import X.C143937Fj;
import X.C143947Fk;
import X.C143967Fm;
import X.C144007Fq;
import X.C1595584z;
import X.C17880vN;
import X.C18070vi;
import X.C25651Pb;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.dobverification.DosaRepository$submitVerifiedAge$2", f = "DosaRepository.kt", i = {1}, l = {137, 155}, m = "invokeSuspend", n = {"result"}, s = {"L$0"})
public final class DosaRepository$submitVerifiedAge$2 extends C30431dv implements AnonymousClass1OS {
    public Object L$0;
    public int label;
    public final /* synthetic */ DosaRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DosaRepository$submitVerifiedAge$2(DosaRepository dosaRepository, C30391dr r3) {
        super(2, r3);
        this.this$0 = dosaRepository;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new DosaRepository$submitVerifiedAge$2(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new DosaRepository$submitVerifiedAge$2(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r2 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            DosaRepository dosaRepository = this.this$0;
            C25651Pb r8 = dosaRepository.A02;
            int i2 = dosaRepository.A02().getInt("dob_year", 0);
            int i3 = this.this$0.A02().getInt("dob_month", 0);
            int i4 = this.this$0.A02().getInt("dob_day", 0);
            this.label = 1;
            obj = r8.A01(this, i2, i3, i4);
            if (obj == r2) {
                return r2;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else if (i == 2) {
            Object obj2 = this.L$0;
            C30691eM.A01(obj);
            return obj2;
        } else {
            throw AnonymousClass000.A0l();
        }
        DosaRepository dosaRepository2 = this.this$0;
        C1595584z r10 = (C1595584z) obj;
        if (r10 instanceof C143947Fk) {
            dosaRepository2.A03((C143947Fk) r10);
        } else if ((r10 instanceof C143927Fi) || C18070vi.A18(r10, C144007Fq.A00) || (r10 instanceof C143937Fj)) {
            DosaRepository.A00(dosaRepository2, r10);
        } else if (r10 instanceof C143967Fm) {
            C17880vN.A1F(dosaRepository2.A02().edit(), "dob_verified", true);
        }
        this.L$0 = r10;
        this.label = 2;
        if (((AnonymousClass1G3) this.this$0.A05.getValue()).BJt(r10, this) != r2) {
            return r10;
        }
        return r2;
    }
}
