package X;

import android.view.View;
import com.whatsapp.TextEmojiLabel;

public class DWP implements C18140vp {
    public final int A00;
    public final int A01;
    public final Object A02;

    public DWP(View view, int i, int i2) {
        this.A00 = i2;
        if (i2 != 0) {
            this.A01 = i;
            this.A02 = view;
            return;
        }
        this.A02 = view;
        this.A01 = i;
    }

    public final Object get() {
        if (this.A00 != 0) {
            return Float.valueOf(((float) this.A01) - ((float) ((View) this.A02).getTop()));
        }
        return Float.valueOf(C108945cZ.A04((View) this.A02) - (((float) this.A01) * 2.0f));
    }

    public DWP(TextEmojiLabel textEmojiLabel, int i) {
        this.A00 = 2;
        this.A01 = i;
        this.A02 = textEmojiLabel;
    }
}
