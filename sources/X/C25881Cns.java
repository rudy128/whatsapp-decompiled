package X;

/* renamed from: X.Cns  reason: case insensitive filesystem */
public abstract class C25881Cns {
    public static C26050CrK A00(C23736Boh boh) {
        DOZ doz;
        C26050CrK crK = boh.A01;
        if (crK != null || ((doz = boh.A00) != null && (crK = C26272CwJ.A01(doz).A06()) != null)) {
            return crK;
        }
        throw AnonymousClass000.A0s("No tree resources available in the Scripting Environment. This is an infra error that you should post in the Bloks Q&A group about.");
    }

    public static C26972DNu A01(C23736Boh boh, String str) {
        C25140CZq cZq = A00(boh).A00;
        C18070vi.A0d(str, 1);
        C26972DNu dNu = (C26972DNu) cZq.A00.get(str);
        if (dNu != null) {
            C26972DNu A00 = dNu.A00(boh.A02, boh.A06);
            if (A00 instanceof C28669EDl) {
                A00.BKO();
            }
            return A00;
        }
        throw AnonymousClass001.A12("\n\nYou are running parseEmbedded without the parent Bloks Context needed to process the data manifests. If you are implementing a new feature, check to makesure you're not calling evaluateWithoutTreeDANGEROUSLY on your signature. Otherwise, this is an infra error that you should post in the Bloks Q&A group about.", AnonymousClass000.A11("Expression for Script ID not found!"));
    }

    public static Object A02(C23736Boh boh, String str) {
        Object obj = A00(boh).A08.get(str);
        C24807CLa cLa = boh.A02;
        if (cLa != null) {
            C18070vi.A0d(str, 0);
            cLa.A00.add(str);
        }
        return obj;
    }
}
