package X;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.AJj  reason: case insensitive filesystem */
public final class C20396AJj implements C22413B6v {
    public static final BDh A04 = new AJV(0);
    public static final BDi A05 = new AJW(1);
    public static final BDi A06 = new AJW(0);
    public static final C20392AJf A07 = new Object();
    public BDh A00;
    public boolean A01;
    public final Map A02 = C17880vN.A11();
    public final Map A03;

    public /* bridge */ /* synthetic */ void CDv(BDh bDh, Class cls) {
        this.A02.put(cls, bDh);
        this.A03.remove(cls);
    }

    public C20396AJj() {
        HashMap A11 = C17880vN.A11();
        this.A03 = A11;
        this.A00 = A04;
        this.A01 = false;
        Class<String> cls = String.class;
        A11.put(cls, A06);
        this.A02.remove(cls);
        Class<Boolean> cls2 = Boolean.class;
        this.A03.put(cls2, A05);
        this.A02.remove(cls2);
        Class<Date> cls3 = Date.class;
        this.A03.put(cls3, A07);
        this.A02.remove(cls3);
    }
}
