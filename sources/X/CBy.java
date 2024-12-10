package X;

public abstract class CBy {
    /* JADX WARNING: type inference failed for: r6v1, types: [X.CFu, java.lang.Object] */
    public static DFL A00(DOZ doz, C23736Boh boh, DFL dfl) {
        DOZ doz2 = doz;
        C26962DNk A01 = C26272CwJ.A01(doz);
        boolean A08 = C26272CwJ.A08(doz);
        DFL dfl2 = dfl;
        if (A08) {
            return CC3.A00((E9O) null, new C23715BoM(A01.A0C, dfl, 0), dfl);
        }
        C26050CrK crK = boh.A01;
        if (crK == null) {
            crK = A01.A06();
        }
        C25011CTl A00 = C26172Ctp.A00(doz2, crK, (C25011CTl) null, dfl2, new Object(), C25416CfO.A00);
        if (!A00.A04.isEmpty()) {
            C25913CoX.A01("BloksBind", "Undefined Behavior: BloksBind::evaluate() returned controller binding operations");
        }
        return A00.A01;
    }
}
