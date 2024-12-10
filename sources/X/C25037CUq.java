package X;

import com.google.protobuf.UnsafeUtil;
import java.util.List;

/* renamed from: X.CUq  reason: case insensitive filesystem */
public abstract class C25037CUq {
    public static final C25037CUq A00 = new Object();
    public static final C25037CUq A01 = new Object();

    public List A01(Object obj, long j) {
        if (!(this instanceof C23660BnT)) {
            return C23661BnU.A00(obj, j, 10);
        }
        EE9 ee9 = (EE9) C25856CnK.A00(obj, j);
        if (((C27296DbR) ee9).A00) {
            return ee9;
        }
        int size = ee9.size();
        int i = size * 2;
        if (size == 0) {
            i = 10;
        }
        EE9 Bk8 = ee9.Bk8(i);
        UnsafeUtil.A05(obj, j, Bk8);
        return Bk8;
    }
}
