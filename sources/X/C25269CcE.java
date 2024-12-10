package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.CcE  reason: case insensitive filesystem */
public abstract class C25269CcE {
    public final C18100vl A00 = AnonymousClass1DF.A01(new C27520Dgn(this));

    public int A00() {
        C22948BWu bWu = (C22948BWu) this;
        if (2 - bWu.A00 != 0) {
            return 0;
        }
        return C18020vd.A00(C18040vf.A02, ((C24820CLn) bWu.A01).A00, 6897);
    }

    public Integer A04() {
        C22948BWu bWu = (C22948BWu) this;
        if (2 - bWu.A00 != 0) {
            return ((C25625Cj5) bWu.A01).A03.A06;
        }
        try {
            String A0v = C108955ca.A0v(((C24820CLn) bWu.A01).A00, 6901);
            if (A0v.equals("H264")) {
                return AnonymousClass00R.A00;
            }
            if (A0v.equals("H265")) {
                return AnonymousClass00R.A01;
            }
            throw AnonymousClass000.A0k(A0v);
        } catch (IllegalArgumentException unused) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("sup:GlassesConfigDelegate.kt Failed to parse AB Prop for Video Codec ");
            C17890vO.A19(A10, ((C24820CLn) bWu.A01).A00.A0I(6901));
            return AnonymousClass00R.A01;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0021, code lost:
        if (r1 == null) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0023, code lost:
        r1 = X.C29431cG.A0d(X.AnonymousClass3MW.A11(r4));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A01(int r6) {
        /*
            r5 = this;
            X.0vl r4 = r5.A00
            java.util.List r3 = X.AnonymousClass3MW.A11(r4)
            java.lang.Object r0 = r4.getValue()
            java.util.Iterator r2 = X.AnonymousClass8BR.A13(r0)
        L_0x000e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0023
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.BTa r0 = (X.C22866BTa) r0
            X.1Oc r0 = r0.A06
            int r0 = r0.A00
            if (r0 > r6) goto L_0x000e
            if (r1 != 0) goto L_0x002b
        L_0x0023:
            java.util.List r0 = X.AnonymousClass3MW.A11(r4)
            java.lang.Object r1 = X.C29431cG.A0d(r0)
        L_0x002b:
            int r0 = r3.indexOf(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25269CcE.A01(int):int");
    }

    public BTZ A03() {
        C22866BTa bTa = (C22866BTa) C108955ca.A0p(AnonymousClass3MW.A11(this.A00));
        return C24593CAo.A00(bTa, A04(), bTa.A06.A01);
    }

    public List A05(boolean z) {
        String str;
        int i;
        int i2;
        String A0I;
        String A0I2;
        if (!z) {
            C22948BWu bWu = (C22948BWu) this;
            int i3 = bWu.A00;
            Object obj = bWu.A01;
            switch (i3) {
                case 0:
                    str = ((C25625Cj5) obj).A0I;
                    break;
                case 1:
                    str = ((C25625Cj5) obj).A0J;
                    break;
                default:
                    str = C108955ca.A0v(((C24820CLn) obj).A00, 6900);
                    break;
            }
        } else {
            str = "720,1280,1000000-1000000,30|504,896,500000-1000000,30|432,768,270000-500000,30|360,640,200000-270000,30";
        }
        C25845Cn1 cn1 = C24712CGy.A01;
        cn1.A03("sup:BaseBitrateLadderProvider", AnonymousClass001.A1H("Parsing bitrate ladder string: ", str, AnonymousClass000.A10()));
        try {
            int i4 = 0;
            List A0S = AnonymousClass1YF.A0S(str, new String[]{"|"}, 0);
            ArrayList A0D = C29351c6.A0D(A0S);
            int i5 = 0;
            for (Object next : A0S) {
                i4++;
                if (i5 < 0) {
                    AnonymousClass1ZU.A0B();
                    throw null;
                }
                List A0S2 = AnonymousClass1YF.A0S((String) next, new String[]{","}, 0);
                List A0S3 = AnonymousClass1YF.A0S((CharSequence) A0S2.get(2), new String[]{"-"}, 0);
                Integer num = AnonymousClass00R.A00(4)[i5];
                int parseInt = Integer.parseInt(AnonymousClass1YF.A0I(C17880vN.A0w(A0S2, 0)));
                int parseInt2 = Integer.parseInt(AnonymousClass1YF.A0I(C17880vN.A0w(A0S2, 1)));
                int parseInt3 = Integer.parseInt(AnonymousClass1YF.A0I(C17880vN.A0w(A0S2, 3)));
                C25411Oc r0 = new C25411Oc(Integer.parseInt(AnonymousClass1YF.A0I(C17880vN.A0w(A0S3, 0))), Integer.parseInt(AnonymousClass1YF.A0I(C17880vN.A0w(A0S3, 1))));
                String str2 = (String) C29431cG.A0f(A0S2, 4);
                if (str2 == null || (A0I2 = AnonymousClass1YF.A0I(str2)) == null) {
                    i = 0;
                } else {
                    i = Integer.parseInt(A0I2);
                }
                String str3 = (String) C29431cG.A0f(A0S2, 5);
                if (str3 == null || (A0I = AnonymousClass1YF.A0I(str3)) == null) {
                    i2 = 3;
                } else {
                    i2 = Integer.parseInt(A0I);
                }
                C22866BTa bTa = new C22866BTa(num, r0, parseInt, parseInt2, parseInt3, i, i2);
                cn1.A03("sup:BaseBitrateLadderProvider", AnonymousClass001.A1E(bTa, "Adding Bitrate Rung To Ladder: ", AnonymousClass000.A10()));
                A0D.add(bTa);
                i5 = i4;
            }
            return A0D;
        } catch (IndexOutOfBoundsException e) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Exception parsing ladder config ");
            A10.append(str);
            cn1.A04("sup:BaseBitrateLadderProvider", AnonymousClass000.A0y(". Attempt with fallback", A10), e);
            if (!z) {
                return A05(true);
            }
            cn1.A04("sup:BaseBitrateLadderProvider", "Failed to parse ladder config AND Default Value Format(??) - Returning empty list", (Throwable) null);
            return AnonymousClass000.A13();
        }
    }

    public BTZ A02() {
        if (A00() <= 0 || A00() > A03().A00) {
            return A03();
        }
        return C24593CAo.A00((C22866BTa) C108955ca.A0p(AnonymousClass3MW.A11(this.A00)), A04(), A00());
    }
}
