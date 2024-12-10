package X;

import android.graphics.Typeface;
import android.text.Spannable;

/* renamed from: X.Dtn  reason: case insensitive filesystem */
public final class C28227Dtn extends AnonymousClass11G implements C36001nB {
    public final /* synthetic */ AnonymousClass20G $resolveTypeface;
    public final /* synthetic */ Spannable $this_setFontAttributes;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28227Dtn(Spannable spannable, AnonymousClass20G r3) {
        super(3);
        this.$this_setFontAttributes = spannable;
        this.$resolveTypeface = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        int i;
        int i2;
        C26053CrN crN = (C26053CrN) obj;
        int A0M = AnonymousClass000.A0M(obj2);
        int A0M2 = AnonymousClass000.A0M(obj3);
        Spannable spannable = this.$this_setFontAttributes;
        AnonymousClass20G r8 = this.$resolveTypeface;
        C24693CGf cGf = crN.A06;
        DSF dsf = crN.A09;
        if (dsf == null) {
            dsf = DSF.A03;
        }
        C25823Cma cma = crN.A07;
        if (cma != null) {
            i = cma.A00;
        } else {
            i = 0;
        }
        C25823Cma cma2 = new C25823Cma(i);
        C25824Cmb cmb = crN.A08;
        if (cmb != null) {
            i2 = cmb.A00;
        } else {
            i2 = 1;
        }
        spannable.setSpan(new BGf((Typeface) r8.invoke(cGf, dsf, cma2, new C25824Cmb(i2))), A0M, A0M2, 33);
        return C27621Wu.A00;
    }
}
