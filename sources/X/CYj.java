package X;

import android.os.Build;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;

public class CYj {
    public int A00;
    public int A01;
    public TextDirectionHeuristic A02;
    public final TextPaint A03;

    public CYj(TextPaint textPaint) {
        this.A03 = textPaint;
        if (Build.VERSION.SDK_INT >= 23) {
            this.A00 = 1;
            this.A01 = 1;
        } else {
            this.A01 = 0;
            this.A00 = 0;
        }
        this.A02 = TextDirectionHeuristics.FIRSTSTRONG_LTR;
    }

    public void A00(int i) {
        this.A00 = i;
    }

    public void A01(int i) {
        this.A01 = i;
    }
}
