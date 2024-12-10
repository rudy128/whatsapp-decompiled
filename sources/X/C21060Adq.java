package X;

import android.app.Activity;
import com.whatsapp.support.DescribeProblemActivity;
import com.whatsapp.support.faq.SearchFAQActivity;
import java.util.Map;

/* renamed from: X.Adq  reason: case insensitive filesystem */
public final class C21060Adq implements C72413Lv {
    public /* synthetic */ void Bi5(String str) {
    }

    public void BiC(C186289dx r6) {
        int i;
        int i2;
        Object valueOf;
        C18070vi.A0d(r6, 0);
        Activity A00 = C18050vg.A00(r6.A00);
        if (A00 instanceof SearchFAQActivity) {
            i = ((SearchFAQActivity) A00).A00;
            i2 = i;
            if (i == -1) {
                return;
            }
        } else if (A00 instanceof DescribeProblemActivity) {
            i = 0;
            i2 = -1;
        } else {
            return;
        }
        Integer valueOf2 = Integer.valueOf(i);
        Map map = r6.A01;
        map.put("FAQ Results Returned", valueOf2);
        if (i == 0) {
            valueOf = "n/a";
        } else {
            valueOf = Integer.valueOf(i2);
        }
        map.put("FAQ Results Read", valueOf);
    }

    public /* synthetic */ void BiY(String str) {
    }
}
