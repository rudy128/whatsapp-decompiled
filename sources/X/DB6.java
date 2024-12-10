package X;

import java.io.File;
import java.util.List;

public class DB6 implements C28575E8i {
    public final List A00 = AnonymousClass000.A13();
    public final /* synthetic */ DAO A01;

    public void CC5(File file) {
    }

    public void CCC(File file) {
    }

    public DB6(DAO dao) {
        this.A01 = dao;
    }

    public void CRt(File file) {
        DAO dao = this.A01;
        String name = file.getName();
        int lastIndexOf = name.lastIndexOf(46);
        if (lastIndexOf > 0) {
            String substring = name.substring(lastIndexOf);
            String str = ".cnt";
            String str2 = str;
            if (!str.equals(substring)) {
                str = ".tmp";
                if (!str.equals(substring)) {
                    return;
                }
            }
            String substring2 = name.substring(0, lastIndexOf);
            if (str.equals(".tmp")) {
                int lastIndexOf2 = substring2.lastIndexOf(46);
                if (lastIndexOf2 > 0) {
                    substring2 = substring2.substring(0, lastIndexOf2);
                } else {
                    return;
                }
            }
            if (DAO.A00(dao, substring2).equals(file.getParentFile()) && str == str2) {
                this.A00.add(new CWT(substring2, file));
            }
        }
    }
}
