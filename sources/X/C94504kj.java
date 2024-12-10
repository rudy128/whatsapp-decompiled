package X;

import android.content.Context;

/* renamed from: X.4kj  reason: invalid class name and case insensitive filesystem */
public final class C94504kj implements AnonymousClass5ZD {
    public final C24163BwW A00;
    public final AnonymousClass5ZS A01;
    public final AnonymousClass1MZ A02;
    public final AnonymousClass1EC A03;
    public final C18100vl A04 = AnonymousClass1DF.A01(new C102445Gm(this));
    public final Context A05;
    public final AnonymousClass1EC A06;
    public final C436420i A07;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: android.view.View[]} */
    /* JADX WARNING: type inference failed for: r5v0, types: [X.4C1, android.widget.TextView, android.view.View, java.lang.Object, X.3Rk, com.whatsapp.wds.components.button.WDSButton] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List getCTAViews() {
        /*
            r9 = this;
            r0 = 2
            android.view.View[] r2 = new android.view.View[r0]
            android.content.Context r1 = r9.A05
            X.20i r6 = r9.A07
            X.1EC r4 = r9.A06
            r0 = 0
            X.4C1 r5 = new X.4C1
            r5.<init>(r1, r0)
            r5.A06()
            X.1Xz r0 = X.C27881Xz.OUTLINE
            r5.setVariant(r0)
            X.11S r1 = r5.getMeManager()
            X.1BI r0 = r6.A0H()
            boolean r1 = r1.A0O(r0)
            r0 = 2131895363(0x7f122443, float:1.9425557E38)
            if (r1 == 0) goto L_0x002b
            r0 = 2131895361(0x7f122441, float:1.9425553E38)
        L_0x002b:
            r5.setText(r0)
            if (r4 == 0) goto L_0x003b
            r8 = 12
            X.78E r3 = new X.78E
            r7 = r4
            r3.<init>(r4, r5, r6, r7, r8)
            r5.setOnClickListener(r3)
        L_0x003b:
            r0 = 0
            r2[r0] = r5
            r1 = 1
            X.BwW r0 = r9.A00
            r2[r1] = r0
            java.util.ArrayList r0 = X.AnonymousClass1ZU.A06(r2)
            java.util.List r0 = X.C29431cG.A0t(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C94504kj.getCTAViews():java.util.List");
    }

    public C94504kj(Context context, AnonymousClass5ZM r6, AnonymousClass5ZS r7, AnonymousClass1MZ r8, AnonymousClass1EC r9, AnonymousClass1EC r10, C436420i r11) {
        C18070vi.A0o(r6, r8, r7);
        this.A02 = r8;
        this.A01 = r7;
        this.A05 = context;
        this.A07 = r11;
        this.A03 = r9;
        this.A06 = r10;
        C24163BwW BGM = r6.BGM(context, r9);
        BGM.setVisibility(8);
        this.A00 = BGM;
        C91644g1.A00((AnonymousClass1FB) AnonymousClass1L9.A01(context, AnonymousClass1FY.class), ((AnonymousClass3UI) this.A04.getValue()).A00, new AnonymousClass5S3(this), 14);
    }
}
