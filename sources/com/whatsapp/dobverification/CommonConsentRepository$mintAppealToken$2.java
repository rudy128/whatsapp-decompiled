package com.whatsapp.dobverification;

import X.AnonymousClass000;
import X.AnonymousClass00R;
import X.AnonymousClass1OS;
import X.AnonymousClass1PZ;
import X.AnonymousClass1YF;
import X.AnonymousClass6WH;
import X.AnonymousClass7G0;
import X.AnonymousClass850;
import X.C144097Fz;
import X.C17880vN;
import X.C25681Pe;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import com.whatsapp.util.Log;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.dobverification.CommonConsentRepository$mintAppealToken$2", f = "CommonConsentRepository.kt", i = {}, l = {160}, m = "invokeSuspend", n = {}, s = {})
public final class CommonConsentRepository$mintAppealToken$2 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ C25681Pe this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommonConsentRepository$mintAppealToken$2(C25681Pe r2, C30391dr r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new CommonConsentRepository$mintAppealToken$2(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new CommonConsentRepository$mintAppealToken$2(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        int i;
        String str;
        C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            C30691eM.A01(obj);
            String A0r = C17880vN.A0r(this.this$0.A02(), "idv_token");
            if (A0r == null || AnonymousClass1YF.A0T(A0r) || (i = this.this$0.A02().getInt("dob_year", 0)) < 1875) {
                return new C144097Fz(AnonymousClass00R.A0C);
            }
            int i3 = this.this$0.A02().getInt("dob_month", 0);
            int i4 = this.this$0.A02().getInt("dob_day", 0);
            AnonymousClass1PZ r1 = this.this$0.A01;
            String A00 = AnonymousClass6WH.A00(i, i3, i4);
            this.label = 1;
            obj = r1.Bk1(A0r, A00, this);
            if (obj == r5) {
                return r5;
            }
        } else if (i2 == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        C25681Pe r52 = this.this$0;
        AnonymousClass850 r12 = (AnonymousClass850) obj;
        if (r12 instanceof AnonymousClass7G0) {
            AnonymousClass7G0 r13 = (AnonymousClass7G0) r12;
            String str2 = r13.A01;
            long j = r13.A00;
            C17880vN.A1E(r52.A02().edit(), "minted_idv_token", str2);
            C17880vN.A1D(r52.A02().edit(), "minted_idvtoken_expiry_time_secs", j);
            r52.A06();
            return obj;
        }
        if (r12 instanceof C144097Fz) {
            str = "CommonConsentRepository/mintAppealToken failed";
        } else {
            str = "CommonConsentRepository/mintAppealToken else failed";
        }
        Log.e(str);
        return obj;
    }
}
