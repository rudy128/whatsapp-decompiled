package X;

import java.util.Comparator;
import java.util.Map;

public class Blk extends C23552Blf {
    public static final Blk INSTANCE = new Blk();
    public static final long serialVersionUID = 0;

    private Object readResolve() {
        return INSTANCE;
    }

    public Blk() {
        super(C201110w.of(), 0, (Comparator) null);
    }

    public /* bridge */ /* synthetic */ Map asMap() {
        return asMap();
    }
}
