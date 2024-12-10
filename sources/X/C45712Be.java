package X;

import android.content.Context;

/* renamed from: X.2Be  reason: invalid class name and case insensitive filesystem */
public class C45712Be extends C74703cE {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C193299pr A01;
    public final /* synthetic */ AnonymousClass1LC A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C45712Be(Context context, Context context2, AnonymousClass1L8 r9, AnonymousClass1KB r10, C193299pr r11, AnonymousClass1LC r12, AnonymousClass11C r13, String str) {
        super(context, r9, r10, r13, str);
        this.A02 = r12;
        this.A01 = r11;
        this.A00 = context2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x005c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onClick(android.view.View r5) {
        /*
            r4 = this;
            java.lang.String r3 = r4.A06
            if (r3 != 0) goto L_0x000a
            java.lang.String r0 = "WaLinkFactory/onClick anchor url is null"
        L_0x0006:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x000a:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "WaLinkFactory/onClick link = "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = " isEu = "
            r1.append(r0)
            X.9pr r2 = r4.A01
            boolean r0 = r2.A00
            r1.append(r0)
            java.lang.String r0 = " isUk = "
            r1.append(r0)
            boolean r0 = r2.A01
            X.C17900vP.A0r(r1, r0)
            java.util.Map r0 = X.AnonymousClass1LC.A05
            java.lang.String r1 = X.C17880vN.A0s(r3, r0)
            if (r1 == 0) goto L_0x009e
            java.lang.String r0 = "terms-of-service-age"
            boolean r0 = r3.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0099
            boolean r0 = r2.A01
            if (r0 == 0) goto L_0x008e
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r1)
            java.lang.String r0 = "-uk"
        L_0x0047:
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
            android.net.Uri r3 = android.net.Uri.parse(r0)
        L_0x004f:
            java.lang.String r1 = r3.getAuthority()
            java.lang.String r0 = "whatsapp"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x007a
            android.net.Uri$Builder r3 = r3.buildUpon()
            X.1LC r0 = r4.A02
            X.0vb r2 = r0.A03
            java.lang.String r1 = r2.A05()
            java.lang.String r0 = "lg"
            r3.appendQueryParameter(r0, r1)
            java.lang.String r1 = r2.A04()
            java.lang.String r0 = "lc"
            r3.appendQueryParameter(r0, r1)
            android.net.Uri r3 = r3.build()
        L_0x007a:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "WaLinkFactory/onClick targetLink = "
            X.C17900vP.A0Y(r3, r0, r1)
            X.1LC r0 = r4.A02
            X.1L9 r2 = r0.A00
            android.content.Context r1 = r4.A00
            r0 = 0
            r2.CGU(r1, r3, r0)
            return
        L_0x008e:
            boolean r0 = r2.A00
            if (r0 == 0) goto L_0x0099
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r1)
            java.lang.String r0 = "-eea"
            goto L_0x0047
        L_0x0099:
            android.net.Uri r3 = android.net.Uri.parse(r1)
            goto L_0x004f
        L_0x009e:
            java.lang.String r0 = "WaLinkFactory/onClick target url is null"
            goto L_0x0006
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45712Be.onClick(android.view.View):void");
    }
}
