package X;

import com.facebook.cdl.gltfmemorypointerholder.LiveEditingRawMemoryPointerHolder;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;

public final class D8Z implements EAU {
    public final EAU A00;
    public final C18560wh A01;

    public void BEP(String str) {
        this.A00.BEP(str);
    }

    public void BEr() {
        this.A00.BEr();
    }

    public LiveEditingRawMemoryPointerHolder BMj() {
        return this.A00.BMj();
    }

    public void CCF(Integer num, String str, List list, int i) {
        this.A00.CCF(num, str, list, i);
    }

    public void CCG(String str, Map map) {
        this.A00.CCG(str, map);
    }

    public void CDu(C28490E3u e3u) {
        this.A00.CDu(e3u);
    }

    public void CFR(C24315BzC bzC, String str, Map map) {
        this.A00.CFR(bzC, str, map);
    }

    public void CGh() {
        this.A00.CGh();
    }

    public void CQB(C28490E3u e3u) {
        this.A00.CQB(e3u);
    }

    public void CQT(String str, Map map) {
        this.A00.CQT(str, map);
    }

    public void CQU(String str, Map map) {
        this.A00.CQU(str, map);
    }

    public void CQW(String str, Map map) {
        this.A00.CQW(str, map);
    }

    public void CEo() {
        this.A00.CEo();
        C30551e8.A03((CancellationException) null, this.A01);
    }

    public D8Z(EAU eau, C18560wh r2) {
        this.A01 = r2;
        this.A00 = eau;
    }
}
