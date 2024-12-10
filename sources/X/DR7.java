package X;

import java.util.List;
import java.util.Map;

public final class DR7 implements E8I {
    public final /* synthetic */ E8I A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ List A02;
    public final /* synthetic */ Map A03;

    public void C99(C25550Cho cho, C441822l r6, String str, List list) {
        C18070vi.A0d(str, 1);
        Map map = this.A03;
        map.put(this.A01, str);
        int size = map.size();
        List list2 = this.A02;
        if (size == list2.size()) {
            String A0h = C29431cG.A0h("\n\n", list2, new C28027Dq2(map));
            this.A00.C99(C24099BvR.A00, r6, A0h, C18460wS.A00);
        }
    }

    public DR7(E8I e8i, String str, List list, Map map) {
        this.A03 = map;
        this.A01 = str;
        this.A02 = list;
        this.A00 = e8i;
    }

    public void C98(C24122Bvo bvo, C441822l r3) {
        this.A00.C98(bvo, r3);
    }
}
