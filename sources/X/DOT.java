package X;

import java.util.Map;

public final class DOT implements E6N {
    public C23769BpE A00;
    public final C25812CmP A01;

    public boolean Bj7(Object obj) {
        C25670Ck0 ck0 = this.A01.A01;
        EBZ ebz = ck0.A00;
        if (!(obj instanceof Map)) {
            return false;
        }
        C23769BpE bpE = this.A00;
        if (!bpE.A07() || (bpE.A01 == null && ck0.A03.contains(C24287Byk.DEFAULT_PATH_LEAF_TO_NULL))) {
            return true;
        }
        return ebz.BXg(obj).containsAll(bpE.A01);
    }

    public DOT(C25812CmP cmP, C25278Cca cca) {
        this.A01 = cmP;
        this.A00 = (C23769BpE) cca;
    }
}
