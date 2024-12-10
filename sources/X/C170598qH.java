package X;

/* renamed from: X.8qH  reason: invalid class name and case insensitive filesystem */
public abstract class C170598qH extends C20126A8l implements C72173Kx {
    public final AnonymousClass1BI A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C170598qH(C62382rJ r10, C19999A2n a2n, AnonymousClass1BI r12, String str, String str2, int i, long j, boolean z) {
        super(r10, a2n, str, str2, i, j, z);
        C18070vi.A0d(r10, 7);
        this.A00 = r12;
    }

    public C170598qH A0G(AnonymousClass1BI r12) {
        AnonymousClass1BI r3 = r12;
        if (this instanceof C170468pu) {
            C170468pu r0 = (C170468pu) this;
            String str = r0.A07;
            boolean z = r0.A00;
            return new C170468pu(r0.A00, r3, str, r0.A04, z, r0.A0D());
        } else if (this instanceof C170438pr) {
            C170438pr r02 = (C170438pr) this;
            String str2 = r02.A07;
            long j = r02.A04;
            return new C170438pr(r02.A00, r3, r02.A00, str2, j, r02.A0D());
        } else if (this instanceof C170458pt) {
            C170458pt r03 = (C170458pt) this;
            String str3 = r03.A07;
            boolean z2 = r03.A01;
            C170458pt r1 = new C170458pt(r03.A00, r3, str3, r03.A00, r03.A04, z2, r03.A0D());
            r1.A01 = r03.A01;
            return r1;
        } else if (this instanceof AnonymousClass8q2) {
            return ((AnonymousClass8q2) this).A0H(r12);
        } else {
            if (this instanceof C170498px) {
                return ((C170498px) this).A0H(r12);
            }
            C170448ps r04 = (C170448ps) this;
            return new C170448ps(r04.A00, r3, r04.A07, r04.A04, r04.A0D(), r04.A00);
        }
    }

    public AnonymousClass1BI getChatJid() {
        if (this instanceof C170498px) {
            return ((C170498px) this).A00;
        }
        return this.A00;
    }

    public boolean equals(Object obj) {
        if (!super.equals(obj) || !(obj instanceof C170598qH) || !C42171xk.A00(getChatJid(), ((C170598qH) obj).getChatJid())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(getChatJid(), super.hashCode() * 31);
    }
}
