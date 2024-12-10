package X;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class CWO {
    public C25769Clg A00;
    public C25769Clg A01 = new C25769Clg(this);
    public final ConcurrentHashMap A02;

    /* JADX WARNING: type inference failed for: r0v13, types: [X.DuB, X.Clg, java.lang.Object] */
    public C25769Clg A00(Class cls) {
        ConcurrentHashMap concurrentHashMap = this.A02;
        C25769Clg clg = (C25769Clg) concurrentHashMap.get(cls);
        if (clg != null) {
            return clg;
        }
        if (cls != null && (Map.class.isAssignableFrom(cls) || List.class.isAssignableFrom(cls))) {
            ? clg2 = new C25769Clg(this);
            clg2.A00 = cls;
            concurrentHashMap.put(cls, clg2);
            return clg2;
        } else if (cls.isArray()) {
            C28246Du7 du7 = new C28246Du7(cls, this);
            concurrentHashMap.putIfAbsent(cls, du7);
            return du7;
        } else {
            if (List.class.isAssignableFrom(cls)) {
                if (cls.isInterface()) {
                    cls = C27310Dbh.class;
                }
            } else if (Map.class.isAssignableFrom(cls) && cls.isInterface()) {
                cls = C27324Dbv.class;
            }
            C26213Cus.A01(cls);
            throw null;
        }
    }

    public CWO() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(100);
        this.A02 = concurrentHashMap;
        concurrentHashMap.put(Date.class, C22346B3x.A00);
        C25769Clg clg = C28260DuL.A0C;
        concurrentHashMap.put(int[].class, clg);
        C25769Clg clg2 = C28260DuL.A05;
        concurrentHashMap.put(Integer[].class, clg2);
        concurrentHashMap.put(short[].class, clg);
        concurrentHashMap.put(Short[].class, clg2);
        concurrentHashMap.put(long[].class, C28260DuL.A0D);
        concurrentHashMap.put(Long[].class, C28260DuL.A06);
        concurrentHashMap.put(byte[].class, C28260DuL.A08);
        concurrentHashMap.put(Byte[].class, C28260DuL.A01);
        concurrentHashMap.put(char[].class, C28260DuL.A09);
        concurrentHashMap.put(Character[].class, C28260DuL.A02);
        concurrentHashMap.put(float[].class, C28260DuL.A0B);
        concurrentHashMap.put(Float[].class, C28260DuL.A04);
        concurrentHashMap.put(double[].class, C28260DuL.A0A);
        concurrentHashMap.put(Double[].class, C28260DuL.A03);
        concurrentHashMap.put(boolean[].class, C28260DuL.A07);
        concurrentHashMap.put(Boolean[].class, C28260DuL.A00);
        C25769Clg clg3 = new C25769Clg(this);
        this.A00 = clg3;
        concurrentHashMap.put(EEG.class, clg3);
        concurrentHashMap.put(C28545E6t.class, this.A00);
        concurrentHashMap.put(C27310Dbh.class, this.A00);
        concurrentHashMap.put(C27324Dbv.class, this.A00);
    }
}
