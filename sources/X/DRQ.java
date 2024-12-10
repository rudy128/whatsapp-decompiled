package X;

import java.io.File;
import java.io.FilenameFilter;

public class DRQ implements FilenameFilter {
    public final int A00;

    public DRQ(int i) {
        this.A00 = i;
    }

    public boolean accept(File file, String str) {
        String str2;
        switch (this.A00) {
            case 0:
                if (!str.startsWith("override-")) {
                    if (!str.endsWith(".log") && !str.endsWith(".zip")) {
                        str2 = ".tmp";
                        break;
                    } else {
                        return true;
                    }
                } else {
                    return false;
                }
            case 1:
                if (str.startsWith("override-")) {
                    str2 = ".log";
                    break;
                } else {
                    return false;
                }
            default:
                return str.endsWith(".log");
        }
        if (str.endsWith(str2)) {
            return true;
        }
        return false;
    }
}
