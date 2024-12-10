package X;

import android.icu.text.DisplayContext;
import android.icu.text.SimpleDateFormat;
import java.text.Format;

/* renamed from: X.7En  reason: invalid class name and case insensitive filesystem */
public final class C143717En implements C1600686z {
    public Format BRx(C18000vb r4) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("LLLL yyyy", r4.A0N());
        simpleDateFormat.setContext(DisplayContext.CAPITALIZATION_FOR_BEGINNING_OF_SENTENCE);
        return simpleDateFormat;
    }
}
