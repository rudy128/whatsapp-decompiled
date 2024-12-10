package X;

import android.graphics.Matrix;
import android.graphics.Path;

/* renamed from: X.Dqh  reason: case insensitive filesystem */
public final class C28067Dqh extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ int $end;
    public final /* synthetic */ C17040te $path;
    public final /* synthetic */ int $start;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28067Dqh(C17040te r2, int i, int i2) {
        super(1);
        this.$path = r2;
        this.$start = i;
        this.$end = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C25227CbO cbO = (C25227CbO) obj;
        C17040te r6 = this.$path;
        int i = this.$start;
        int i2 = this.$end;
        EA0 ea0 = cbO.A06;
        int i3 = cbO.A05;
        int i4 = cbO.A04;
        int A07 = BE6.A07(i, i3, i4);
        int A072 = BE6.A07(i2, i3, i4);
        C26594D5i d5i = (C26594D5i) ea0;
        if (A07 < 0 || A07 > A072 || A072 > d5i.A03.length()) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("start(");
            A10.append(A07);
            A10.append(") or end(");
            A10.append(A072);
            A10.append(") is out of range [0..");
            A10.append(d5i.A03.length());
            throw AnonymousClass001.A12("], or start > end!", A10);
        }
        Path A0L = C108945cZ.A0L();
        C26043Cr7 cr7 = d5i.A01;
        cr7.A08.getSelectionPath(A07, A072, A0L);
        int i5 = cr7.A05;
        if (i5 != 0 && !A0L.isEmpty()) {
            A0L.offset(0.0f, (float) i5);
        }
        AnonymousClass0WS r7 = new AnonymousClass0WS(A0L);
        long A0p = AnonymousClass001.A0p(0.0f, cbO.A01);
        long j = AnonymousClass0QY.A03;
        Matrix matrix = r7.A00;
        if (matrix == null) {
            r7.A00 = C108945cZ.A0J();
        } else {
            matrix.reset();
        }
        Matrix matrix2 = r7.A00;
        C18070vi.A0b(matrix2);
        matrix2.setTranslate(AnonymousClass0QY.A01(A0p), AnonymousClass0QY.A02(A0p));
        Path path = r7.A03;
        Matrix matrix3 = r7.A00;
        C18070vi.A0b(matrix3);
        path.transform(matrix3);
        long j2 = AnonymousClass0QY.A03;
        ((AnonymousClass0WS) r6).A03.addPath(path, AnonymousClass0QY.A01(j2), AnonymousClass0QY.A02(j2));
        return C27621Wu.A00;
    }
}
