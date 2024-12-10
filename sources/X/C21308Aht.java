package X;

/* renamed from: X.Aht  reason: case insensitive filesystem */
public final class C21308Aht implements C22485B9r {
    public final AnonymousClass1IX A00;

    public C21308Aht(AnonymousClass1IX r1) {
        this.A00 = r1;
    }

    public C201110w BDY() {
        C201210x builder = C201110w.builder();
        AnonymousClass1IX r1 = this.A00;
        if (r1 != null && !r1.isEmpty()) {
            StringBuilder A10 = AnonymousClass000.A10();
            AnonymousClass1IZ it = r1.iterator();
            C18070vi.A0X(it);
            while (it.hasNext()) {
                C186309dz r12 = (C186309dz) it.next();
                if (A10.length() > 0) {
                    A10.append(", ");
                }
                A10.append(r12.A00.A00);
            }
            builder.put("filterNames", A10.toString());
        }
        C201110w build = builder.build();
        C18070vi.A0X(build);
        return build;
    }
}
