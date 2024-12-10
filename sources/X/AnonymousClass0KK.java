package X;

import java.util.Map;

/* renamed from: X.0KK  reason: invalid class name */
public abstract class AnonymousClass0KK {
    public static final AnonymousClass0KK A00 = new AnonymousClass072(new AnonymousClass0OX((AnonymousClass0JC) null, (AnonymousClass0JX) null, (Map) null, 63, false));

    public final AnonymousClass072 A00(AnonymousClass0KK r8) {
        AnonymousClass0OX r1 = ((AnonymousClass072) this).A00;
        AnonymousClass0JC r2 = r1.A00;
        if (r2 == null) {
            r2 = ((AnonymousClass072) r8).A00.A00;
        }
        AnonymousClass0JX r3 = r1.A01;
        if (r3 == null) {
            r3 = ((AnonymousClass072) r8).A00.A01;
        }
        return new AnonymousClass072(new AnonymousClass0OX(r2, r3, AnonymousClass1D7.A09(r1.A02, ((AnonymousClass072) r8).A00.A02), 16, false));
    }

    public int hashCode() {
        return ((AnonymousClass072) this).A00.hashCode();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass0KK) || !C18070vi.A18(((AnonymousClass072) ((AnonymousClass0KK) obj)).A00, ((AnonymousClass072) this).A00)) {
            return false;
        }
        return true;
    }

    public String toString() {
        String str;
        if (equals(A00)) {
            return "EnterTransition.None";
        }
        AnonymousClass0OX r3 = ((AnonymousClass072) this).A00;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("EnterTransition: \nFade - ");
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
        return AnonymousClass000.A0y(str2, A10);
    }
}
