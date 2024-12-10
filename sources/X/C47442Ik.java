package X;

/* renamed from: X.2Ik  reason: invalid class name and case insensitive filesystem */
public class C47442Ik extends C47452Il {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47442Ik(C18030ve r2) {
        super(r2);
        C18070vi.A0d(r2, 1);
    }

    public boolean Bes(AnonymousClass206 r5) {
        C42341y1 r0;
        if (this instanceof C47432Ij) {
            C47432Ij r2 = (C47432Ij) this;
            C18070vi.A0d(r5, 0);
            Class<C438521e> cls = C438521e.class;
            if (!(r5 instanceof C438521e)) {
                String A0U = C17890vO.A0U(r5);
                String name = cls.getName();
                String str = "".toString();
                throw AnonymousClass206.A02(r5, name, A0U, C17890vO.A0W(str), str);
            }
            r0 = r2.A00;
        } else if (!(this instanceof C47422Ii)) {
            return true;
        } else {
            C47422Ii r22 = (C47422Ii) this;
            if (r22 instanceof AnonymousClass2CZ) {
                AnonymousClass2CZ r23 = (AnonymousClass2CZ) r22;
                C18070vi.A0d(r5, 0);
                Class<C445323u> cls2 = C445323u.class;
                if (!(r5 instanceof C445323u)) {
                    String A0U2 = C17890vO.A0U(r5);
                    String name2 = cls2.getName();
                    String str2 = "".toString();
                    throw AnonymousClass206.A02(r5, name2, A0U2, C17890vO.A0W(str2), str2);
                }
                r0 = r23.A00;
            } else {
                C18070vi.A0d(r5, 0);
                Class<AnonymousClass22Q> cls3 = AnonymousClass22Q.class;
                if (r5 instanceof AnonymousClass22Q) {
                    return AnonymousClass000.A1W(((AnonymousClass22Q) r5).A01);
                }
                String A0U3 = C17890vO.A0U(r5);
                String name3 = cls3.getName();
                String str3 = "".toString();
                throw AnonymousClass206.A02(r5, name3, A0U3, C17890vO.A0W(str3), str3);
            }
        }
        C20083A6j A01 = r0.A01((AnonymousClass21K) r5);
        if (A01 == null || !A01.A0J()) {
            return false;
        }
        return true;
    }

    public void A02(C59652mf r1, AnonymousClass21V r2, AnonymousClass21V r3) {
        C18070vi.A0n(r2, r3, r1);
        super.A02(r1, r2, r3);
        AnonymousClass32S.A00(r1, r3);
    }
}
