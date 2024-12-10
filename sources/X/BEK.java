package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Handler;
import com.whatsapp.numberkeyboard.NumberEntryKeyboard;
import java.util.Map;

public class BEK extends AnimatorListenerAdapter {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C24931CQe A01;
    public final /* synthetic */ CT2 A02;

    public BEK(C24931CQe cQe, CT2 ct2, long j) {
        this.A02 = ct2;
        this.A01 = cQe;
        this.A00 = j;
    }

    public void onAnimationEnd(Animator animator) {
        C24931CQe cQe = this.A01;
        long j = this.A00;
        NumberEntryKeyboard numberEntryKeyboard = cQe.A02;
        int i = NumberEntryKeyboard.A0J;
        Map map = numberEntryKeyboard.A0A;
        map.getClass();
        map.remove(Long.valueOf(j));
    }

    public void onAnimationStart(Animator animator) {
        C24931CQe cQe = this.A01;
        Handler handler = cQe.A00;
        if (handler == null) {
            handler = C17890vO.A0D();
            cQe.A00 = handler;
        }
        handler.post(cQe.A01);
    }
}
