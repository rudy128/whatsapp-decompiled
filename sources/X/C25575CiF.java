package X;

/* renamed from: X.CiF  reason: case insensitive filesystem */
public final class C25575CiF {
    public boolean A00;
    public final AnonymousClass1JD A01 = new AnonymousClass1JD();
    public final C25806CmJ A02;
    public final DVO A03 = new DVO();

    public static final C25263Cc4 A00(C25575CiF ciF, String str, C18090vk r7) {
        DVO dvo = ciF.A03;
        C25263Cc4 cc4 = (C25263Cc4) dvo.get(str);
        if (cc4 != null) {
            return cc4;
        }
        DPN dpn = (DPN) r7.invoke();
        C25806CmJ cmJ = ciF.A02;
        if (cmJ.A00 || (dpn.A00 instanceof C23958Bss)) {
            C25263Cc4 cc42 = new C25263Cc4(dpn, cmJ, (byte[]) null);
            dvo.put(str, cc42);
            return cc42;
        }
        C25263Cc4 cc43 = new C25263Cc4(dpn, cmJ, (byte[]) ciF.A01.removeFirst());
        dvo.put(str, cc43);
        return cc43;
    }

    public C25575CiF(C25806CmJ cmJ) {
        this.A02 = cmJ;
    }
}
