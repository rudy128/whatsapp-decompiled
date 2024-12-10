package X;

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.Executor;

public class DG7 implements C28511E4v {
    public Boolean A00 = null;
    public Boolean A01 = null;
    public final C25160CaB A02;
    public final E52 A03;
    public final Map A04 = BE8.A0q();
    public final Executor A05;

    public /* bridge */ /* synthetic */ void C09(C25649Cjf cjf, C24473C5o c5o, File file) {
        File file2;
        C22923BVl bVl = (C22923BVl) c5o;
        String str = bVl.A00;
        C25649Cjf cjf2 = cjf;
        if (str == null) {
            str = cjf.A00;
        }
        bVl.A00 = str;
        Map map = this.A04;
        File file3 = file;
        try {
            file2 = file.getCanonicalFile();
        } catch (IOException unused) {
            file2 = file.getAbsoluteFile();
        }
        map.put(file2, bVl);
        this.A05.execute(new C21368Aix(this, file3, cjf2, bVl, 7));
    }

    public DG7(E52 e52) {
        this.A03 = e52;
        this.A02 = ((C28513E4x) e52).BZj("eviction.v2");
        this.A05 = ((E50) e52).BRR(AnonymousClass00R.A00);
    }
}
