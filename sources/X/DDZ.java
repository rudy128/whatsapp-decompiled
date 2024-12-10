package X;

import java.util.List;
import java.util.Map;

public class DDZ implements C28550E7a {
    public List A00 = AnonymousClass8BR.A14();
    public List A01 = AnonymousClass8BR.A14();
    public List A02 = AnonymousClass8BR.A14();
    public List A03 = AnonymousClass8BR.A14();
    public Map A04 = C17880vN.A11();

    public List BN0(List list, List list2, List list3) {
        if (list != null) {
            this.A01 = list2;
            this.A02 = list3;
            List list4 = this.A00;
            this.A00 = list;
            return list4;
        }
        throw AnonymousClass000.A0s("enabledEffectIds cannot be null");
    }

    public List BN1(List list) {
        List list2 = this.A03;
        this.A03 = list;
        return list2;
    }
}
