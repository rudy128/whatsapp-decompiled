package X;

import android.text.Spannable;
import java.util.List;

/* renamed from: X.2sf  reason: invalid class name and case insensitive filesystem */
public final class C63192sf {
    public final C18030ve A00;
    public final AnonymousClass11S A01;
    public final AnonymousClass1M9 A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;

    public final void A02(Spannable spannable, AnonymousClass206 r5) {
        AnonymousClass1BI A0I;
        AnonymousClass205 r1 = r5.A0v;
        if (r1.A02) {
            A0I = AnonymousClass11S.A00(this.A01);
        } else {
            A0I = r5.A0I();
        }
        AnonymousClass1BI r0 = r1.A00;
        if (r0 != null) {
            A00(spannable, r0, A0I);
        }
        List<C70503Bi> list = r5.A0h;
        if (list != null) {
            for (C70503Bi r02 : list) {
                A00(spannable, r02.A00, A0I);
            }
        }
    }

    public C63192sf(AnonymousClass11S r1, AnonymousClass1M9 r2, C18030ve r3, AnonymousClass00H r4, AnonymousClass00H r5) {
        C18070vi.A0w(r3, r1, r2, r4, r5);
        this.A00 = r3;
        this.A01 = r1;
        this.A02 = r2;
        this.A03 = r4;
        this.A04 = r5;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A00(android.text.Spannable r6, X.AnonymousClass1BI r7, X.AnonymousClass1BI r8) {
        /*
            r5 = this;
            boolean r0 = X.C42701yb.A01(r8)
            if (r0 != 0) goto L_0x001a
            boolean r0 = r5.A01(r8)
            if (r0 != 0) goto L_0x001a
            if (r8 == 0) goto L_0x001b
            X.1M9 r0 = r5.A02
            X.1E7 r0 = r0.A0H(r8)
            boolean r0 = r0.A0C()
            if (r0 == 0) goto L_0x001b
        L_0x001a:
            return
        L_0x001b:
            X.1M9 r0 = r5.A02
            X.1E7 r0 = r0.A0H(r7)
            boolean r4 = r5.A01(r7)
            boolean r3 = r0.A0C()
            if (r4 != 0) goto L_0x003d
            X.0ve r2 = r5.A00
            r1 = 5811(0x16b3, float:8.143E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0089
            boolean r0 = X.C42701yb.A01(r7)
            if (r0 == 0) goto L_0x0089
        L_0x003d:
            X.00H r0 = r5.A03
            java.lang.Object r3 = r0.get()
            X.6yK r3 = (X.C139166yK) r3
            com.whatsapp.jid.UserJid r7 = (com.whatsapp.jid.UserJid) r7
            if (r7 == 0) goto L_0x001a
            if (r4 == 0) goto L_0x0067
            X.1Ty r0 = r3.A00
            X.AEW r0 = r0.A08(r7)
            if (r0 == 0) goto L_0x001a
            java.util.List r0 = r0.A0Q
            java.util.ArrayList r2 = X.C29351c6.A0E(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x005d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x009b
            X.C139166yK.A00(r3, r7, r2, r1)
            goto L_0x005d
        L_0x0067:
            X.00H r0 = r3.A05
            java.lang.Object r0 = r0.get()
            X.1Pl r0 = (X.C25741Pl) r0
            X.24e r0 = r0.A00(r7)
            if (r0 == 0) goto L_0x001a
            java.util.List r0 = r0.A0G
            java.util.ArrayList r2 = X.C29351c6.A0E(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x007f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x009b
            X.C139166yK.A00(r3, r7, r2, r1)
            goto L_0x007f
        L_0x0089:
            if (r3 == 0) goto L_0x001a
            X.00H r0 = r5.A03
            java.lang.Object r0 = r0.get()
            X.6yK r0 = (X.C139166yK) r0
            com.whatsapp.jid.UserJid r7 = (com.whatsapp.jid.UserJid) r7
            java.util.List r2 = r0.A01(r7)
            if (r2 == 0) goto L_0x001a
        L_0x009b:
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x001a
            java.util.List r0 = X.C29431cG.A0q(r2)
            java.util.Iterator r4 = r0.iterator()
        L_0x00a9:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x001a
            java.lang.Object r0 = r4.next()
            X.24c r0 = (X.C446124c) r0
            java.lang.String r2 = r0.A02
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            r0 = 47
            java.lang.String r1 = X.C17890vO.A0Z(r2, r1, r0)
            r0 = 0
            int r3 = X.AnonymousClass1YF.A0F(r6, r1, r0, r0)
            int r2 = r1.length()
            int r2 = r2 + r3
            r0 = -1
            if (r3 == r0) goto L_0x00a9
            int r0 = r6.length()
            if (r2 >= r0) goto L_0x00dd
            char r1 = r6.charAt(r2)
            r0 = 32
            if (r1 == r0) goto L_0x00dd
            goto L_0x00a9
        L_0x00dd:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "commands"
            r1.append(r0)
            java.lang.CharSequence r0 = r6.subSequence(r3, r2)
            java.lang.String r0 = X.C17890vO.A0V(r0, r1)
            android.text.style.URLSpan r1 = new android.text.style.URLSpan
            r1.<init>(r0)
            r0 = 0
            r6.setSpan(r1, r3, r2, r0)
            goto L_0x00a9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63192sf.A00(android.text.Spannable, X.1BI, X.1BI):void");
    }

    private final boolean A01(AnonymousClass1BI r3) {
        if (C22971Dz.A0d(r3) && C84104Hw.A00(this.A00)) {
            C53052bu r0 = (C53052bu) this.A04.get();
            if (r3 == null || !r0.A00.A01(r3).A0E()) {
                return false;
            }
            return true;
        }
        return false;
    }
}
