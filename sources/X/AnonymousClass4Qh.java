package X;

import android.content.Context;
import android.text.Spannable;

/* renamed from: X.4Qh  reason: invalid class name */
public final class AnonymousClass4Qh {
    public final AnonymousClass1KB A00;
    public final C36361nl A01;
    public final AnonymousClass11C A02;
    public final C36391no A03;

    public final int A00(Context context, Spannable spannable, AnonymousClass206 r18) {
        Spannable spannable2 = spannable;
        AnonymousClass206 r12 = r18;
        C18070vi.A0j(spannable2, r12);
        Object[] spans = spannable2.getSpans(0, spannable2.length(), C72673Nb.class);
        C18070vi.A0X(spans);
        for (C72673Nb r0 : (C72673Nb[]) spans) {
            spannable2.setSpan(new C74893d5(context, this.A01, this.A00, this.A02, r12, r0.A00, r0.A01), spannable2.getSpanStart(r0), spannable2.getSpanEnd(r0), spannable2.getSpanFlags(r0));
        }
        return r4;
    }

    public AnonymousClass4Qh(AnonymousClass1KB r1, C36361nl r2, AnonymousClass11C r3, C36391no r4) {
        C18070vi.A0s(r4, r1, r3, r2);
        this.A03 = r4;
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
    }
}
