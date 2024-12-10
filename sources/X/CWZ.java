package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Movie;
import java.util.List;

public final class CWZ {
    public int A00;
    public Movie A01;
    public DRN A02;
    public List A03;

    public DRN A00() {
        int i;
        Movie movie = this.A01;
        List list = this.A03;
        if (movie == null || list == null || list.size() <= (i = this.A00)) {
            return null;
        }
        CRQ crq = (CRQ) list.get(i);
        Bitmap A0J = BE8.A0J(crq.A03, crq.A01);
        Canvas canvas = new Canvas(A0J);
        A0J.eraseColor(0);
        movie.draw(canvas, 0.0f, 0.0f);
        return DRN.A00(new DBK(1), A0J);
    }
}
