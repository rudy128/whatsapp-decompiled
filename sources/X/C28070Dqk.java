package X;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import java.util.List;

/* renamed from: X.Dqk  reason: case insensitive filesystem */
public final class C28070Dqk extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ Canvas $canvas;
    public final /* synthetic */ C25741ClB $state;
    public final /* synthetic */ C22878BTp this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28070Dqk(Canvas canvas, C25741ClB clB, C22878BTp bTp) {
        super(1);
        this.$canvas = canvas;
        this.this$0 = bTp;
        this.$state = clB;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Matrix matrix = (Matrix) obj;
        C18070vi.A0d(matrix, 0);
        Canvas canvas = this.$canvas;
        C22878BTp bTp = this.this$0;
        C25741ClB clB = this.$state;
        int save = canvas.save();
        canvas.concat(matrix);
        try {
            BU3 bu3 = bTp.A01;
            int i = 0;
            if (bu3 != null) {
                Path A00 = clB.A00(bu3, (BUD) null);
                save = canvas.save();
                canvas.clipPath(A00);
                List list = bTp.A02;
                int size = list.size();
                while (i < size) {
                    ((C28554E7f) list.get(i)).BJL(canvas, clB);
                    i++;
                }
            } else if (bTp.A03) {
                long j = bTp.A00;
                float A02 = AnonymousClass001.A02(j);
                float A01 = AnonymousClass001.A01(j);
                save = canvas.save();
                canvas.clipRect(0.0f, 0.0f, A02, A01);
                List list2 = bTp.A02;
                int size2 = list2.size();
                while (i < size2) {
                    ((C28554E7f) list2.get(i)).BJL(canvas, clB);
                    i++;
                }
            } else {
                List list3 = bTp.A02;
                int size3 = list3.size();
                while (i < size3) {
                    ((C28554E7f) list3.get(i)).BJL(canvas, clB);
                    i++;
                }
                canvas.restoreToCount(save);
                return C27621Wu.A00;
            }
            canvas.restoreToCount(save);
            canvas.restoreToCount(save);
            return C27621Wu.A00;
        } catch (Throwable th) {
            throw th;
        } finally {
        }
    }
}
