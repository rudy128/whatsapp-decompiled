package X;

import com.whatsapp.jid.Jid;
import java.text.Collator;
import java.util.Comparator;

/* renamed from: X.7Rh  reason: invalid class name and case insensitive filesystem */
public final class C146967Rh implements Comparator {
    public final C24921Me A00;
    public final AnonymousClass1CJ A01;
    public final Collator A02;

    public C146967Rh(C24921Me r3, C18000vb r4, AnonymousClass1CJ r5) {
        C18070vi.A0d(r5, 1);
        C18070vi.A0k(r3, r4);
        this.A01 = r5;
        this.A00 = r3;
        Collator A0r = C108965cb.A0r(r4);
        A0r.setDecomposition(1);
        this.A02 = A0r;
    }

    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        long j;
        long j2;
        AnonymousClass1E7 r9 = (AnonymousClass1E7) obj;
        AnonymousClass1E7 r10 = (AnonymousClass1E7) obj2;
        C18070vi.A0h(r9, r10);
        Class<AnonymousClass1BI> cls = AnonymousClass1BI.class;
        Jid A06 = r9.A06(cls);
        if (A06 != null) {
            AnonymousClass1BI r3 = (AnonymousClass1BI) A06;
            Jid A062 = r10.A06(cls);
            if (A062 != null) {
                AnonymousClass1BI r2 = (AnonymousClass1BI) A062;
                AnonymousClass1CJ r1 = this.A01;
                if (r1.A0P(r3)) {
                    j = r1.A08(r3);
                } else {
                    j = 0;
                }
                if (r1.A0P(r2)) {
                    j2 = r1.A08(r2);
                } else {
                    j2 = 0;
                }
                if (j == 0 && j2 == 0) {
                    Collator collator = this.A02;
                    C24921Me r0 = this.A00;
                    return collator.compare(r0.A0I(r9), r0.A0I(r10));
                } else if (j == 0) {
                    return 1;
                } else {
                    if (j2 == 0) {
                        return -1;
                    }
                    if (j == j2) {
                        C24921Me r02 = this.A00;
                        String A0I = r02.A0I(r9);
                        if (A0I != null) {
                            String A0I2 = r02.A0I(r10);
                            if (A0I2 != null) {
                                return A0I.compareTo(A0I2);
                            }
                            throw AnonymousClass000.A0n("Required value was null.");
                        }
                        throw AnonymousClass000.A0n("Required value was null.");
                    } else if (j < j2) {
                        return 1;
                    } else {
                        return -1;
                    }
                }
            } else {
                throw AnonymousClass000.A0n("Required value was null.");
            }
        } else {
            throw AnonymousClass000.A0n("Required value was null.");
        }
    }
}
