package X;

import android.graphics.Matrix;
import android.graphics.Path;

/* renamed from: X.Doe  reason: case insensitive filesystem */
public final class C27942Doe extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ Path $this_apply;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27942Doe(Path path) {
        super(1);
        this.$this_apply = path;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Matrix matrix = (Matrix) obj;
        C18070vi.A0d(matrix, 0);
        this.$this_apply.transform(matrix);
        return C27621Wu.A00;
    }
}
