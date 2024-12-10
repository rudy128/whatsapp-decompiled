package X;

import java.util.Map;

/* renamed from: X.0KL  reason: invalid class name */
public abstract class AnonymousClass0KL {
    public static final AnonymousClass0KL A00 = new AnonymousClass073(new AnonymousClass0OX((AnonymousClass0JC) null, (AnonymousClass0JX) null, (Map) null, 63, false));
    public static final AnonymousClass0KL A01 = new AnonymousClass073(new AnonymousClass0OX((AnonymousClass0JC) null, (AnonymousClass0JX) null, (Map) null, 47, true));

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0027, code lost:
        if (((X.AnonymousClass073) r6).A00.A03 != false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass073 A00(X.AnonymousClass0KL r6) {
        /*
            r5 = this;
            r0 = r5
            X.073 r0 = (X.AnonymousClass073) r0
            X.0OX r1 = r0.A00
            X.0JC r4 = r1.A00
            if (r4 != 0) goto L_0x0010
            r0 = r6
            X.073 r0 = (X.AnonymousClass073) r0
            X.0OX r0 = r0.A00
            X.0JC r4 = r0.A00
        L_0x0010:
            X.0JX r3 = r1.A01
            if (r3 != 0) goto L_0x001b
            r0 = r6
            X.073 r0 = (X.AnonymousClass073) r0
            X.0OX r0 = r0.A00
            X.0JX r3 = r0.A01
        L_0x001b:
            boolean r0 = r1.A03
            if (r0 != 0) goto L_0x0029
            r0 = r6
            X.073 r0 = (X.AnonymousClass073) r0
            X.0OX r0 = r0.A00
            boolean r0 = r0.A03
            r2 = 0
            if (r0 == 0) goto L_0x002a
        L_0x0029:
            r2 = 1
        L_0x002a:
            java.util.Map r1 = r1.A02
            X.073 r6 = (X.AnonymousClass073) r6
            X.0OX r0 = r6.A00
            java.util.Map r0 = r0.A02
            java.util.LinkedHashMap r0 = X.AnonymousClass1D7.A09(r1, r0)
            X.0OX r1 = new X.0OX
            r1.<init>(r4, r3, r0, r2)
            X.073 r0 = new X.073
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0KL.A00(X.0KL):X.073");
    }

    public int hashCode() {
        return ((AnonymousClass073) this).A00.hashCode();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass0KL) || !C18070vi.A18(((AnonymousClass073) ((AnonymousClass0KL) obj)).A00, ((AnonymousClass073) this).A00)) {
            return false;
        }
        return true;
    }

    public String toString() {
        String str;
        if (equals(A00)) {
            return "ExitTransition.None";
        }
        if (equals(A01)) {
            return "ExitTransition.KeepUntilTransitionsFinished";
        }
        AnonymousClass0OX r3 = ((AnonymousClass073) this).A00;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ExitTransition: \nFade - ");
        AnonymousClass0JC r0 = r3.A00;
        String str2 = null;
        if (r0 != null) {
            str = r0.toString();
        } else {
            str = null;
        }
        A10.append(str);
        A10.append(",\nSlide - ");
        A10.append((String) null);
        A10.append(",\nShrink - ");
        A10.append((String) null);
        A10.append(",\nScale - ");
        AnonymousClass0JX r02 = r3.A01;
        if (r02 != null) {
            str2 = r02.toString();
        }
        A10.append(str2);
        A10.append(",\nKeepUntilTransitionsFinished - ");
        A10.append(r3.A03);
        return A10.toString();
    }
}
