package X;

/* renamed from: X.4I5  reason: invalid class name */
public abstract /* synthetic */ class AnonymousClass4I5 {
    public static final C23421Fz A00(C18560wh r3, C23421Fz r4) {
        if (r3.get(AnonymousClass1OB.A00) != null) {
            throw AnonymousClass000.A0k(AnonymousClass001.A1E(r3, "Flow context cannot contain job in it. Had ", AnonymousClass000.A10()));
        } else if (r3.equals(AnonymousClass1OR.A00)) {
            return r4;
        } else {
            if (r4 instanceof AnonymousClass1G5) {
                return ((AnonymousClass1G5) r4).BLm(r3, C25691Pg.SUSPEND, -3);
            }
            return new AnonymousClass5WR(r3, C25691Pg.SUSPEND, r4, -3);
        }
    }
}
