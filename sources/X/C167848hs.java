package X;

import com.whatsapp.util.Log;

/* renamed from: X.8hs  reason: invalid class name and case insensitive filesystem */
public final class C167848hs extends C167898hx {
    public final BAQ A00;
    public final AnonymousClass11E A01;
    public final C195469tO A02;
    public final C19949A0g A03;
    public final AnonymousClass1OZ A04;
    public final C20004A2u A05;
    public final C20114A7x A06;
    public final A6T A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C167848hs(C26911Ty r2, C20114A7x a7x, BAQ baq, A6T a6t, AnonymousClass11E r6, C195469tO r7, C19949A0g a0g, AnonymousClass1OZ r9, C20004A2u a2u) {
        super(r2, r7.A01);
        C18070vi.A0d(r9, 1);
        C72473Md.A1M(a2u, a7x, r2, 2);
        C18070vi.A0q(a6t, r6, a0g);
        this.A04 = r9;
        this.A05 = a2u;
        this.A02 = r7;
        this.A06 = a7x;
        this.A07 = a6t;
        this.A01 = r6;
        this.A03 = a0g;
        this.A00 = baq;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x002d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void C7Z(X.C29621ca r6, java.lang.String r7) {
        /*
            r5 = this;
            r0 = 1
            X.C18070vi.A0d(r6, r0)
            X.A2u r1 = r5.A05
            java.lang.String r0 = "view_product_tag"
            r1.A02(r0)
            X.A6T r4 = r5.A07
            r2 = 0
            X.AN5 r0 = r4.A02(r6)
            if (r0 == 0) goto L_0x0033
            java.util.List r1 = r0.A03
            boolean r0 = X.AnonymousClass000.A1a(r1)
            if (r0 == 0) goto L_0x0033
            java.lang.Object r3 = r1.get(r2)
            X.AEv r3 = (X.C20287AEv) r3
        L_0x0022:
            X.9tO r2 = r5.A02
            com.whatsapp.jid.UserJid r1 = r2.A01
            X.1Ty r0 = r5.A01
            r4.A05(r0, r1, r6)
            if (r3 != 0) goto L_0x0035
            java.lang.String r0 = "ProductRequestProtocolHelper/onSuccess/error: empty response"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x0033:
            r3 = 0
            goto L_0x0022
        L_0x0035:
            X.A7x r0 = r5.A06
            r0.A0I(r3, r1)
            X.BAQ r1 = r5.A00
            java.lang.String r0 = r3.A0H
            r1.BuA(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C167848hs.C7Z(X.1ca, java.lang.String):void");
    }

    public void BrD(String str) {
        Log.e("ProductRequestProtocolHelper/onDeliveryFailure");
        this.A05.A02("view_product_tag");
        this.A00.Bu8(this.A02, 0);
    }
}
