package androidx.compose.foundation.text;

import X.AnonymousClass000;
import X.AnonymousClass0NM;
import X.AnonymousClass0Q4;
import X.AnonymousClass1OS;
import X.AnonymousClass1OX;
import X.AnonymousClass3F6;
import X.C04940Pp;
import X.C16200rs;
import X.C26224CvE;
import X.C26227CvJ;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.EBT;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$focusModifier$1$1$1", f = "CoreTextField.kt", i = {}, l = {330}, m = "invokeSuspend", n = {}, s = {})
public final class CoreTextFieldKt$CoreTextField$focusModifier$1$1$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C16200rs $bringIntoViewRequester;
    public final /* synthetic */ AnonymousClass0NM $layoutResult;
    public final /* synthetic */ EBT $offsetMapping;
    public final /* synthetic */ C04940Pp $state;
    public final /* synthetic */ C26224CvE $value;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CoreTextFieldKt$CoreTextField$focusModifier$1$1$1(C16200rs r2, C04940Pp r3, AnonymousClass0NM r4, EBT ebt, C26224CvE cvE, C30391dr r7) {
        super(2, r7);
        this.$bringIntoViewRequester = r2;
        this.$value = cvE;
        this.$state = r3;
        this.$layoutResult = r4;
        this.$offsetMapping = ebt;
    }

    /* renamed from: A01 */
    public final Object invoke(C30391dr r3, AnonymousClass1OX r4) {
        return ((CoreTextFieldKt$CoreTextField$focusModifier$1$1$1) create(r4, r3)).invokeSuspend(C27621Wu.A00);
    }

    public final C30391dr create(Object obj, C30391dr r9) {
        return new CoreTextFieldKt$CoreTextField$focusModifier$1$1$1(this.$bringIntoViewRequester, this.$state, this.$layoutResult, this.$offsetMapping, this.$value, r9);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(X.C16200rs r4, X.AnonymousClass0Q4 r5, X.C26227CvJ r6, X.EBT r7, X.C26224CvE r8, X.C30391dr r9) {
        /*
            long r0 = r8.A01()
            int r0 = X.C26260Cw5.A01(r0)
            int r1 = r7.CB1(r0)
            X.Ccg r0 = r6.A0N()
            X.DRu r0 = r0.A03()
            int r0 = r0.length()
            if (r1 < r0) goto L_0x001e
            if (r1 == 0) goto L_0x002f
            int r1 = r1 + -1
        L_0x001e:
            X.0NU r3 = r6.A0J(r1)
        L_0x0022:
            java.lang.Object r1 = r4.BDL(r3, r9)
            X.1g4 r0 = X.AnonymousClass3F6.A03()
            if (r1 == r0) goto L_0x002e
            X.1Wu r1 = X.C27621Wu.A00
        L_0x002e:
            return r1
        L_0x002f:
            X.Cvq r2 = r5.A06()
            X.ECa r1 = r5.A08()
            X.E3V r0 = r5.A07()
            long r0 = X.C04550Nv.A01(r2, r0, r1, X.C04550Nv.A00, 1)
            int r0 = X.AnonymousClass000.A0H(r0)
            float r2 = (float) r0
            r1 = 0
            r0 = 1065353216(0x3f800000, float:1.0)
            X.0NU r3 = new X.0NU
            r3.<init>(r1, r1, r0, r2)
            goto L_0x0022
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$focusModifier$1$1$1.A00(X.0rs, X.0Q4, X.CvJ, X.EBT, X.CvE, X.1dr):java.lang.Object");
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 A03 = AnonymousClass3F6.A03();
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C16200rs r3 = this.$bringIntoViewRequester;
            C26224CvE cvE = this.$value;
            AnonymousClass0Q4 r4 = this.$state.A00;
            C26227CvJ A032 = this.$layoutResult.A03();
            EBT ebt = this.$offsetMapping;
            this.label = 1;
            if (A00(r3, r4, A032, ebt, cvE, this) == A03) {
                return A03;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }
}
