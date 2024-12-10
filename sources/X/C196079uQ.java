package X;

import android.content.Context;
import android.content.DialogInterface;
import java.util.concurrent.TimeUnit;

/* renamed from: X.9uQ  reason: invalid class name and case insensitive filesystem */
public abstract class C196079uQ {
    public final int A00;
    public final AnonymousClass1L9 A01;
    public final C40751vD A02;
    public final AnonymousClass1M9 A03;
    public final C24921Me A04;
    public final AnonymousClass11P A05;
    public final C18000vb A06;
    public final C18030ve A07;
    public final AnonymousClass1R2 A08;

    public boolean A03(C198769ys r8, A03 a03) {
        if (r8 == null) {
            return false;
        }
        if (a03 != null && r8.A08.A01 == a03.A03) {
            int A002 = C18020vd.A00(C18040vf.A02, this.A07, 988);
            long abs = Math.abs(AnonymousClass11P.A01(this.A05) - a03.A02);
            if (A002 < 1 || abs < TimeUnit.HOURS.toMillis((long) A002)) {
                return false;
            }
        }
        return true;
    }

    public int A00() {
        if (this instanceof C175398ye) {
            return 2131891303;
        }
        return 2131891302;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0037, code lost:
        if (android.text.TextUtils.equals(r2, (java.lang.String) X.AnonymousClass000.A0w(r0.A00, r1)) != false) goto L_0x0039;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A01(X.AnonymousClass8pI r7, com.whatsapp.jid.UserJid r8, X.C198769ys r9) {
        /*
            r6 = this;
            X.1M9 r0 = r6.A03
            X.1E7 r0 = r0.A0H(r8)
            boolean r0 = r0.A0B()
            if (r0 == 0) goto L_0x0064
            X.9xS r3 = r9.A0A
            boolean r0 = r3.A01
            r4 = 1
            if (r0 == 0) goto L_0x0039
            r5 = 3
            if (r7 == 0) goto L_0x003a
            X.2r1 r0 = r9.A08
            long r0 = r0.A01
            java.lang.String r2 = java.lang.String.valueOf(r0)
            int r1 = r6.A00
            X.9xL r0 = r7.A01
            if (r0 != 0) goto L_0x002b
            X.9xL r0 = new X.9xL
            r0.<init>()
            r7.A01 = r0
        L_0x002b:
            java.util.Map r0 = r0.A00
            java.lang.Object r0 = X.AnonymousClass000.A0w(r0, r1)
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = android.text.TextUtils.equals(r2, r0)
            if (r0 == 0) goto L_0x003a
        L_0x0039:
            r5 = 1
        L_0x003a:
            int r3 = r3.A00
            if (r5 != r4) goto L_0x0065
            if (r3 <= 0) goto L_0x0065
            if (r7 == 0) goto L_0x0065
            X.76o r2 = r7.A02
            if (r2 == 0) goto L_0x0065
            X.2r1 r0 = r9.A08
            long r0 = r0.A01
            java.lang.String r1 = java.lang.String.valueOf(r0)
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            java.util.HashMap r0 = r2.A00
            java.lang.Object r0 = r0.get(r1)
            java.util.AbstractCollection r0 = (java.util.AbstractCollection) r0
            if (r0 == 0) goto L_0x0065
            int r0 = r0.size()
            if (r0 < r3) goto L_0x0063
            r4 = 2
        L_0x0063:
            return r4
        L_0x0064:
            r5 = 0
        L_0x0065:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C196079uQ.A01(X.8pI, com.whatsapp.jid.UserJid, X.9ys):int");
    }

    public C196079uQ(AnonymousClass1L9 r1, C40751vD r2, AnonymousClass1M9 r3, C24921Me r4, AnonymousClass11P r5, C18000vb r6, C18030ve r7, AnonymousClass1R2 r8, int i) {
        this.A05 = r5;
        this.A07 = r7;
        this.A02 = r2;
        this.A01 = r1;
        this.A08 = r8;
        this.A04 = r4;
        this.A06 = r6;
        this.A03 = r3;
        this.A00 = i;
    }

    public C010105w A02(Context context) {
        C73203Rj A002 = AnonymousClass4a6.A00(context);
        A002.A0E(2131891291);
        A002.A0D(2131891290);
        A002.A0X((DialogInterface.OnClickListener) null, 2131892995);
        C20153A9p.A00(A002, context, this, 15, 2131897387);
        return A002.create();
    }
}
