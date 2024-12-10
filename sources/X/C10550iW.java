package X;

import android.widget.EdgeEffect;
import androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect;

/* renamed from: X.0iW  reason: invalid class name and case insensitive filesystem */
public final class C10550iW extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ AndroidEdgeEffectOverscrollEffect this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10550iW(AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect) {
        super(1);
        this.this$0 = androidEdgeEffectOverscrollEffect;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        A00(((C26142Ct5) obj).A03());
        return C27621Wu.A00;
    }

    public final void A00(long j) {
        long A01 = C25293Ccv.A01(j);
        AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect = this.this$0;
        long j2 = androidEdgeEffectOverscrollEffect.A00;
        long j3 = AnonymousClass0QG.A02;
        boolean z = !AnonymousClass000.A1P((A01 > j2 ? 1 : (A01 == j2 ? 0 : -1)));
        androidEdgeEffectOverscrollEffect.A00 = C25293Ccv.A01(j);
        if (z) {
            EdgeEffect edgeEffect = androidEdgeEffectOverscrollEffect.A0B;
            int A0G = AnonymousClass000.A0G(j);
            int A0H = AnonymousClass000.A0H(j);
            edgeEffect.setSize(A0G, A0H);
            this.this$0.A05.setSize(A0G, A0H);
            this.this$0.A07.setSize(A0H, A0G);
            this.this$0.A09.setSize(A0H, A0G);
            this.this$0.A0C.setSize(A0G, A0H);
            this.this$0.A06.setSize(A0G, A0H);
            this.this$0.A08.setSize(A0H, A0G);
            this.this$0.A0A.setSize(A0H, A0G);
            AndroidEdgeEffectOverscrollEffect.A0A(this.this$0);
            AndroidEdgeEffectOverscrollEffect.A09(this.this$0);
        }
    }
}
