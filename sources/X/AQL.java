package X;

import androidx.fragment.app.DialogFragment;
import com.whatsapp.conversation.conversationrow.InteractiveMessageButton;
import java.util.Collections;
import java.util.List;

public class AQL implements AnonymousClass5ZL {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;

    public AQL(Object obj, Object obj2, String str, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
        this.A03 = str;
    }

    public final void Bn2(int i) {
        switch (this.A00) {
            case 0:
                ((DialogFragment) this.A01).A2C((AnonymousClass1GP) this.A02, this.A03);
                return;
            case 1:
            case 2:
                InteractiveMessageButton interactiveMessageButton = (InteractiveMessageButton) this.A01;
                AnonymousClass206 r3 = (AnonymousClass206) this.A02;
                String str = this.A03;
                AnonymousClass1BI r0 = r3.A0v.A00;
                if (r0 != null) {
                    interactiveMessageButton.A01.A0O((C143887Fe) null, r3, (C692236j) null, str, Collections.singletonList(r0), (List) null, false, false);
                    return;
                }
                return;
            default:
                return;
        }
    }
}
