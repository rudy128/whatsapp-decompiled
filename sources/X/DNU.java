package X;

import java.util.List;

public class DNU implements E87 {
    public final /* synthetic */ C25062CVu A00;
    public final /* synthetic */ DFL A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ List A03;

    public void C9d(DFL dfl) {
    }

    public DNU(C25062CVu cVu, DFL dfl, String str, List list) {
        this.A00 = cVu;
        this.A01 = dfl;
        this.A03 = list;
        this.A02 = str;
    }

    public DFL BCM(E9O e9o, DFL dfl) {
        E9O e9o2;
        C25062CVu cVu = this.A00;
        DFL dfl2 = this.A01;
        List list = this.A03;
        String str = this.A02;
        DFL dfl3 = dfl;
        E9O e9o3 = dfl.A01;
        if (e9o3 != null) {
            if (e9o == null) {
                e9o = dfl2.A01;
            }
            e9o2 = e9o3.Bie(e9o);
        } else {
            e9o2 = null;
        }
        return new DFL(e9o2, (CBw) null, dfl3, dfl, list, cVu.A00(dfl2, dfl, str));
    }
}
