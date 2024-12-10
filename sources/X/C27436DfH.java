package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "nl.dionsegijn.konfetti.compose.KonfettiViewKt$KonfettiView$1", f = "KonfettiView.kt", i = {}, l = {45}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: X.DfH  reason: case insensitive filesystem */
public final class C27436DfH extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C17330uU $drawArea;
    public final /* synthetic */ C17330uU $frameTime;
    public final /* synthetic */ C17330uU $particles;
    public final /* synthetic */ List $parties;
    public final /* synthetic */ C98494rF $partySystems;
    public final /* synthetic */ E33 $updateListener = null;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27436DfH(C17330uU r2, C17330uU r3, C17330uU r4, List list, C30391dr r6, C98494rF r7) {
        super(2, r6);
        this.$partySystems = r7;
        this.$parties = list;
        this.$frameTime = r2;
        this.$particles = r3;
        this.$drawArea = r4;
    }

    public final C30391dr create(Object obj, C30391dr r9) {
        C98494rF r6 = this.$partySystems;
        return new C27436DfH(this.$frameTime, this.$particles, this.$drawArea, this.$parties, r9, r6);
    }

    public final Object invokeSuspend(Object obj) {
        C28091Dr5 dr5;
        C31751g4 r6 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C98494rF r4 = this.$partySystems;
            List<C25226CbN> list = this.$parties;
            ArrayList A0D = C29351c6.A0D(list);
            for (C25226CbN cRv : list) {
                A0D.add(new C24971CRv(cRv));
            }
            r4.element = A0D;
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        do {
            dr5 = new C28091Dr5(this.$frameTime, this.$particles, this.$drawArea, this.$partySystems);
            this.label = 1;
        } while (C04460Nm.A01(this, dr5) != r6);
        return r6;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C27436DfH) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
