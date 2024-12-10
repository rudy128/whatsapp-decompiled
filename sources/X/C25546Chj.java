package X;

import com.facebook.profilo.core.TriggerRegistry;
import java.util.ArrayList;

/* renamed from: X.Chj  reason: case insensitive filesystem */
public class C25546Chj {
    public static final int A02 = TriggerRegistry.A00.A02("WhatsApp");
    public final ArrayList A00;
    public final boolean A01;

    public C25546Chj() {
        String[] strArr = new String[5];
        boolean z = false;
        strArr[0] = "stack_trace";
        strArr[1] = "native_stack_trace";
        strArr[2] = "qpl";
        strArr[3] = "system_counters";
        ArrayList A10 = C17880vN.A10(AnonymousClass8BR.A15("high_freq_main_thread_counters", strArr, 4));
        this.A00 = A10;
        if (!"x86_64".equals(C62912sC.A02())) {
            A10.add("atrace");
        }
        z = Math.random() < 0.5d ? true : z;
        this.A01 = z;
        if (z) {
            A10.add("wall_time_stack_trace");
        }
    }
}
