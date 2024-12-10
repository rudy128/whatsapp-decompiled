package X;

public abstract class C7F {
    public static DMp A00(E3Z e3z) {
        C25113CYi cYi = new C25113CYi();
        DMp dMp = new DMp(cYi);
        cYi.A00 = dMp;
        cYi.A02 = e3z.getClass();
        try {
            cYi.A02 = e3z.BCk(cYi);
            return dMp;
        } catch (Exception e) {
            dMp.A00.A03(e);
            return dMp;
        }
    }
}
