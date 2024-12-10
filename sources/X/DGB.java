package X;

import java.io.File;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class DGB implements E9V {
    public final E52 A00;
    public final File A01;

    public void Bgr(String str) {
    }

    public Collection BMs() {
        String[] list = this.A01.list();
        if (list == null) {
            return Collections.emptyList();
        }
        return Arrays.asList(list);
    }

    public long Bh7(String str) {
        return C17880vN.A0e(this.A01, str).lastModified();
    }

    public long Bh8(String str) {
        return C25871Cnf.A00(C17880vN.A0e(this.A01, str));
    }

    public boolean remove(String str) {
        return this.A00.BIM(C17880vN.A0e(this.A01, str));
    }

    public DGB(E52 e52, File file) {
        this.A00 = e52;
        this.A01 = file;
    }
}
