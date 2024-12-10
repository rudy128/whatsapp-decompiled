package X;

import android.view.ViewGroup;
import java.util.List;

/* renamed from: X.5kn  reason: invalid class name and case insensitive filesystem */
public final class C112015kn extends C38391rD {
    public String A00;
    public String A01;
    public final AnonymousClass1KW A02;
    public final C126626d2 A03;
    public final C126636d3 A04;
    public final C126646d4 A05;
    public final List A06 = AnonymousClass000.A13();
    public final List A07;

    public /* bridge */ /* synthetic */ C42011xT BqY(ViewGroup viewGroup, int i) {
        return new C113375mz(AnonymousClass3MX.A0B(C72463Mc.A0K(viewGroup, 0), viewGroup, 2131627183, false), this.A04, this.A05, this);
    }

    public int A0Q() {
        return this.A06.size();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x003c, code lost:
        if (X.C18070vi.A18(r4, r7.A00) == false) goto L_0x003e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void Bmc(X.C42011xT r8, int r9) {
        /*
            r7 = this;
            X.5mz r8 = (X.C113375mz) r8
            r2 = 0
            X.C18070vi.A0d(r8, r2)
            java.util.List r0 = r7.A06
            java.lang.Object r1 = r0.get(r9)
            X.6sf r1 = (X.C135726sf) r1
            com.whatsapp.TextEmojiLabel r0 = r8.A00
            java.lang.String r6 = r1.A03
            r5 = 0
            r0.A0S(r6, r5, r2, r2)
            java.lang.String r4 = r1.A02
            if (r4 == 0) goto L_0x0044
            com.whatsapp.WaImageView r2 = r8.A02
            android.content.res.Resources r1 = X.AnonymousClass3MX.A05(r0)
            X.1KW r0 = r7.A02
            android.graphics.drawable.Drawable r0 = X.AnonymousClass72Y.A00(r1, r0, r4)
            r2.setImageDrawable(r0)
            r8.A03 = r4
        L_0x002b:
            com.whatsapp.WaImageView r2 = r8.A01
            java.lang.String r0 = r7.A01
            boolean r0 = X.C18070vi.A18(r6, r0)
            if (r0 == 0) goto L_0x003e
            java.lang.String r0 = r7.A00
            boolean r1 = X.C18070vi.A18(r4, r0)
            r0 = 0
            if (r1 != 0) goto L_0x0040
        L_0x003e:
            r0 = 8
        L_0x0040:
            r2.setVisibility(r0)
            return
        L_0x0044:
            com.whatsapp.WaImageView r3 = r8.A02
            android.content.Context r2 = r3.getContext()
            r1 = 2131232116(0x7f080574, float:1.8080332E38)
            r0 = 2131101210(0x7f06061a, float:1.7814823E38)
            X.AnonymousClass4aX.A0B(r2, r3, r1, r0)
            r8.A03 = r5
            goto L_0x002b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C112015kn.Bmc(X.1xT, int):void");
    }

    public C112015kn(AnonymousClass1KW r4, C126626d2 r5, C126636d3 r6, List list) {
        C108985cd.A1D(r6, r5);
        this.A07 = list;
        this.A02 = r4;
        this.A04 = r6;
        this.A03 = r5;
        for (Object add : C29431cG.A0v(list, 5)) {
            this.A06.add(add);
        }
        this.A05 = new C126646d4(this);
    }
}
