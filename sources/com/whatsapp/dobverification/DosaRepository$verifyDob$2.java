package com.whatsapp.dobverification;

import X.AnonymousClass000;
import X.AnonymousClass1G3;
import X.AnonymousClass1OS;
import X.C108985cd;
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
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.dobverification.DosaRepository$verifyDob$2", f = "DosaRepository.kt", i = {1}, l = {61, 80}, m = "invokeSuspend", n = {"result"}, s = {"L$0"})
public final class DosaRepository$verifyDob$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ int $day;
    public final /* synthetic */ int $month;
    public final /* synthetic */ int $year;
    public Object L$0;
    public int label;
    public final /* synthetic */ DosaRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DosaRepository$verifyDob$2(DosaRepository dosaRepository, C30391dr r3, int i, int i2, int i3) {
        super(2, r3);
        this.this$0 = dosaRepository;
        this.$year = i;
        this.$month = i2;
        this.$day = i3;
    }

    public final C30391dr create(Object obj, C30391dr r8) {
        return new DosaRepository$verifyDob$2(this.this$0, r8, this.$year, this.$month, this.$day);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r6 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C25651Pb r3 = this.this$0.A02;
            int i2 = this.$year;
            int i3 = this.$month;
            int i4 = this.$day;
            this.label = 1;
            obj = r3.A01(this, i2, i3, i4);
            if (obj == r6) {
                return r6;
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
        DosaRepository dosaRepository = this.this$0;
        C1595584z r9 = (C1595584z) obj;
        if (r9 instanceof C143947Fk) {
            dosaRepository.A03((C143947Fk) r9);
        } else if ((r9 instanceof C143927Fi) || C18070vi.A18(r9, C144007Fq.A00) || (r9 instanceof C143937Fj)) {
            DosaRepository.A00(dosaRepository, r9);
        } else if (r9 instanceof C143967Fm) {
            C108985cd.A17(dosaRepository.A03, C17880vN.A0j(), 10, 5);
            C17880vN.A1F(dosaRepository.A02().edit(), "dob_verified", true);
        }
        this.L$0 = r9;
        this.label = 2;
        if (((AnonymousClass1G3) this.this$0.A05.getValue()).BJt(r9, this) != r6) {
            return r9;
        }
        return r6;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((DosaRepository$verifyDob$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
