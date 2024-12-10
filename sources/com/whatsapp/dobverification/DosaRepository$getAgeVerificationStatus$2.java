package com.whatsapp.dobverification;

import X.A7K;
import X.AIj;
import X.AnonymousClass000;
import X.AnonymousClass11S;
import X.AnonymousClass1G3;
import X.AnonymousClass1OS;
import X.AnonymousClass7S8;
import X.C108975cc;
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
import X.C71053Dp;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.whatsapp.infra.graphql.generated.youth.AgeCollectionResponseImpl;
import com.whatsapp.jid.Jid;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.dobverification.DosaRepository$getAgeVerificationStatus$2", f = "DosaRepository.kt", i = {1}, l = {173, 192}, m = "invokeSuspend", n = {"result"}, s = {"L$0"})
public final class DosaRepository$getAgeVerificationStatus$2 extends C30431dv implements AnonymousClass1OS {
    public Object L$0;
    public int label;
    public final /* synthetic */ DosaRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DosaRepository$getAgeVerificationStatus$2(DosaRepository dosaRepository, C30391dr r3) {
        super(2, r3);
        this.this$0 = dosaRepository;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new DosaRepository$getAgeVerificationStatus$2(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new DosaRepository$getAgeVerificationStatus$2(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r2 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C25651Pb r9 = this.this$0.A02;
            this.label = 1;
            GraphQlCallInput graphQlCallInput = new GraphQlCallInput();
            AnonymousClass11S r1 = r9.A00;
            Jid A09 = r1.A09();
            if (!(A09 == null && (A09 = AnonymousClass11S.A00(r1)) == null)) {
                graphQlCallInput.A05("jid", A09.getRawString());
            }
            GraphQlCallInput graphQlCallInput2 = new GraphQlCallInput();
            graphQlCallInput2.A06("query_input", C18070vi.A0M(graphQlCallInput));
            A7K a7k = new A7K();
            a7k.A04(graphQlCallInput2, "input");
            C71053Dp A0k = C108975cc.A0k(this);
            r9.A01.A01(new AIj(a7k, AgeCollectionResponseImpl.class, "AgeCollection")).A04(new AnonymousClass7S8(r9, A0k, 1));
            obj = A0k.A00();
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
        C1595584z r11 = (C1595584z) obj;
        C17880vN.A1F(this.this$0.A02().edit(), "age_verification_status_fetched", true);
        if (r11 instanceof C143947Fk) {
            this.this$0.A03((C143947Fk) r11);
        } else if ((r11 instanceof C143927Fi) || C18070vi.A18(r11, C144007Fq.A00) || (r11 instanceof C143937Fj)) {
            DosaRepository.A00(this.this$0, r11);
        } else if (r11 instanceof C143967Fm) {
            C17880vN.A1F(this.this$0.A02().edit(), "dob_verified", true);
        }
        this.L$0 = r11;
        this.label = 2;
        if (((AnonymousClass1G3) this.this$0.A05.getValue()).BJt(r11, this) != r2) {
            return r11;
        }
        return r2;
    }
}
