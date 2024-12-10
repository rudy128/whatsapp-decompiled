package X;

import java.util.Map;

/* renamed from: X.BlX  reason: case insensitive filesystem */
public class C23544BlX extends DV5 {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23544BlX(C27301DbX dbX, int i) {
        super(dbX, (C23544BlX) null);
        this.A00 = i;
        this.A01 = dbX;
    }

    public Object getOutput(int i) {
        switch (this.A00) {
            case 0:
                return ((C27301DbX) this.A01).key(i);
            case 1:
                return getOutput(i);
            default:
                return ((C27301DbX) this.A01).value(i);
        }
    }

    /* renamed from: getOutput  reason: collision with other method in class */
    public Map.Entry m52getOutput(int i) {
        return new C23539BlS((C27301DbX) this.A01, i);
    }
}
