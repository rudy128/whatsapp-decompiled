package com.whatsapp.dobverification;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C108995ce;
import X.C125846bm;
import X.C129656i9;
import X.C143927Fi;
import X.C143937Fj;
import X.C1595584z;
import X.C17880vN;
import X.C18070vi;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import android.content.SharedPreferences;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.dobverification.AgeAppealTokenManager$doRefreshIdvToken$2", f = "AgeAppealTokenManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class AgeAppealTokenManager$doRefreshIdvToken$2 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ C129656i9 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AgeAppealTokenManager$doRefreshIdvToken$2(C129656i9 r2, C30391dr r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new AgeAppealTokenManager$doRefreshIdvToken$2(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new AgeAppealTokenManager$doRefreshIdvToken$2(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C125846bm r3;
        String str;
        SharedPreferences.Editor remove;
        if (this.label == 0) {
            C30691eM.A01(obj);
            String A0r = C17880vN.A0r(C18070vi.A03(this.this$0.A01.A00), "age_collection_dob_string");
            if (A0r != null) {
                C1595584z A00 = this.this$0.A02.A00(A0r);
                C129656i9 r1 = this.this$0;
                if (A00 instanceof C143927Fi) {
                    r3 = r1.A01;
                    str = ((C143927Fi) A00).A00;
                } else if (A00 instanceof C143937Fj) {
                    r3 = r1.A01;
                    str = ((C143937Fj) A00).A00;
                }
                if (str == null || str.length() == 0) {
                    remove = C108995ce.A0E(r3.A00).remove("idv_token");
                } else {
                    remove = C108995ce.A0E(r3.A00).putString("idv_token", str);
                }
                remove.apply();
            }
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }
}
