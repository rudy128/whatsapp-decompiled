package X;

import com.whatsapp.HomeActivity;
import com.whatsapp.chatinfo.view.custom.ChatInfoLayoutV2;

/* renamed from: X.4k5  reason: invalid class name and case insensitive filesystem */
public class C94124k5 implements C1599286k {
    public final int A00;
    public final Object A01;

    public C94124k5(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void CAF(int i) {
        switch (this.A00) {
            case 0:
                HomeActivity.A1B((HomeActivity) this.A01);
                return;
            case 1:
                ChatInfoLayoutV2 chatInfoLayoutV2 = (ChatInfoLayoutV2) ((AnonymousClass01E) this.A01).findViewById(2131429510);
                if (chatInfoLayoutV2 != null) {
                    chatInfoLayoutV2.A0I();
                    return;
                }
                return;
            default:
                AnonymousClass4aY r1 = (AnonymousClass4aY) this.A01;
                if (AnonymousClass3MW.A0Q(r1) != null) {
                    r1.A00 = i;
                    AnonymousClass4aY.A1N(r1, i);
                    return;
                }
                return;
        }
    }
}
