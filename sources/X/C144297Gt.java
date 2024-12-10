package X;

/* renamed from: X.7Gt  reason: invalid class name and case insensitive filesystem */
public abstract class C144297Gt implements AnonymousClass20p {
    public final AnonymousClass206 BHO(C59652mf r5, AnonymousClass206 r6) {
        boolean A16 = C18070vi.A16(r6, r5);
        Class<AnonymousClass218> cls = AnonymousClass218.class;
        if (!(r6 instanceof AnonymousClass218)) {
            String A0U = C17890vO.A0U(r6);
            String name = cls.getName();
            String str = "".toString();
            throw AnonymousClass206.A02(r6, name, A0U, C17890vO.A0W(str), str);
        }
        AnonymousClass68G r2 = (AnonymousClass68G) this;
        Class<AnonymousClass21B> cls2 = AnonymousClass21B.class;
        if (!(r6 instanceof AnonymousClass21B)) {
            String A0U2 = C17890vO.A0U(r6);
            String name2 = cls2.getName();
            String str2 = "".toString();
            throw AnonymousClass206.A02(r6, name2, A0U2, C17890vO.A0W(str2), str2);
        }
        AnonymousClass21B A00 = r2.A00(r5, r6);
        AnonymousClass21B r1 = (AnonymousClass21B) r6;
        A00.A01 = r1.A01;
        A00.A00 = r1.A00;
        A00.A02 = r1.A02;
        A00.A02 = A16 ? 1 : 0;
        AnonymousClass218 r62 = (AnonymousClass218) r6;
        A00.A00 = r62.A00;
        A00.A01 = r62.A01;
        A00.A02 = r62.A02;
        return A00;
    }
}
