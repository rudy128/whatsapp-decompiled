package androidx.compose.foundation.text;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass1OX;
import X.AnonymousClass3F6;
import X.C04940Pp;
import X.C04950Pq;
import X.C05070Qh;
import X.C05120Qm;
import X.C07130aQ;
import X.C07930eH;
import X.C16300s2;
import X.C23421Fz;
import X.C25147CZy;
import X.C26041Cr5;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$2", f = "CoreTextField.kt", i = {}, l = {348}, m = "invokeSuspend", n = {}, s = {})
public final class CoreTextFieldKt$CoreTextField$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C26041Cr5 $imeOptions;
    public final /* synthetic */ C05120Qm $manager;
    public final /* synthetic */ C04940Pp $state;
    public final /* synthetic */ C25147CZy $textInputService;
    public final /* synthetic */ C16300s2 $writeable$delegate;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CoreTextFieldKt$CoreTextField$2(C04940Pp r2, C05120Qm r3, C16300s2 r4, C26041Cr5 cr5, C25147CZy cZy, C30391dr r7) {
        super(2, r7);
        this.$state = r2;
        this.$writeable$delegate = r4;
        this.$textInputService = cZy;
        this.$manager = r3;
        this.$imeOptions = cr5;
    }

    /* renamed from: A00 */
    public final Object invoke(C30391dr r3, AnonymousClass1OX r4) {
        return ((CoreTextFieldKt$CoreTextField$2) create(r4, r3)).invokeSuspend(C27621Wu.A00);
    }

    public final C30391dr create(Object obj, C30391dr r9) {
        return new CoreTextFieldKt$CoreTextField$2(this.$state, this.$manager, this.$writeable$delegate, this.$imeOptions, this.$textInputService, r9);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 A03 = AnonymousClass3F6.A03();
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C23421Fz A05 = C04950Pq.A05(new C07930eH(this.$writeable$delegate));
            C07130aQ r0 = new C07130aQ(this.$state, this.$manager, this.$imeOptions, this.$textInputService);
            this.label = 1;
            if (A05.BFC(this, r0) == A03) {
                return A03;
            }
        } else if (i == 1) {
            try {
                C30691eM.A01(obj);
            } catch (Throwable th) {
                C05070Qh.A02(this.$state);
                throw th;
            }
        } else {
            throw AnonymousClass000.A0l();
        }
        C05070Qh.A02(this.$state);
        return C27621Wu.A00;
    }
}
