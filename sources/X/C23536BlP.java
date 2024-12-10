package X;

/* renamed from: X.BlP  reason: case insensitive filesystem */
public class C23536BlP extends DV3 {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23536BlP(C23543BlW blW, int i) {
        super(blW);
        this.A00 = i;
        this.A01 = blW;
    }

    /* renamed from: result  reason: collision with other method in class */
    public Object m51result(int i) {
        if (this.A00 != 0) {
            return result(i);
        }
        return ((C23543BlW) this.A01).backingMap.getKey(i);
    }

    public C25259Cby result(int i) {
        return ((C23543BlW) this.A01).backingMap.getEntry(i);
    }
}
