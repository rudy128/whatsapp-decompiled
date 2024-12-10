package X;

import android.content.Context;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.conversation.conversationrow.InteractiveMessageButton;

/* renamed from: X.4kv  reason: invalid class name and case insensitive filesystem */
public class C94624kv implements AnonymousClass5ZL {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C94624kv(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public final void Bn2(int i) {
        AnonymousClass206 r4;
        C86314Rd A0V;
        Context context;
        int i2;
        int i3 = this.A00;
        Object obj = this.A01;
        switch (i3) {
            case 0:
                ((C85524Ns) obj).A01.Bn2(i);
                ((DialogFragment) this.A02).A28();
                return;
            case 1:
            case 11:
            case 16:
                InteractiveMessageButton interactiveMessageButton = (InteractiveMessageButton) obj;
                r4 = (AnonymousClass206) this.A02;
                A0V = AnonymousClass3Ma.A0V(interactiveMessageButton);
                context = interactiveMessageButton.getContext();
                i2 = 0;
                break;
            case 2:
            case 6:
            case 9:
                InteractiveMessageButton interactiveMessageButton2 = (InteractiveMessageButton) obj;
                r4 = (AnonymousClass206) this.A02;
                A0V = AnonymousClass3Ma.A0V(interactiveMessageButton2);
                context = interactiveMessageButton2.getContext();
                i2 = 1;
                break;
            case 4:
                InteractiveMessageButton interactiveMessageButton3 = (InteractiveMessageButton) obj;
                r4 = (AnonymousClass206) this.A02;
                A0V = AnonymousClass3Ma.A0V(interactiveMessageButton3);
                context = interactiveMessageButton3.getContext();
                i2 = 12;
                break;
            case 5:
                InteractiveMessageButton interactiveMessageButton4 = (InteractiveMessageButton) obj;
                r4 = (AnonymousClass206) this.A02;
                A0V = AnonymousClass3Ma.A0V(interactiveMessageButton4);
                context = interactiveMessageButton4.getContext();
                i2 = 3;
                break;
            case 7:
                InteractiveMessageButton interactiveMessageButton5 = (InteractiveMessageButton) obj;
                r4 = (AnonymousClass206) this.A02;
                A0V = AnonymousClass3Ma.A0V(interactiveMessageButton5);
                context = interactiveMessageButton5.getContext();
                i2 = 13;
                break;
            case 8:
                InteractiveMessageButton interactiveMessageButton6 = (InteractiveMessageButton) obj;
                r4 = (AnonymousClass206) this.A02;
                A0V = AnonymousClass3Ma.A0V(interactiveMessageButton6);
                context = interactiveMessageButton6.getContext();
                i2 = 15;
                break;
            case 10:
                InteractiveMessageButton interactiveMessageButton7 = (InteractiveMessageButton) obj;
                r4 = (AnonymousClass206) this.A02;
                A0V = AnonymousClass3Ma.A0V(interactiveMessageButton7);
                context = interactiveMessageButton7.getContext();
                i2 = 2;
                break;
            case 14:
                InteractiveMessageButton interactiveMessageButton8 = (InteractiveMessageButton) obj;
                r4 = (AnonymousClass206) this.A02;
                A0V = AnonymousClass3Ma.A0V(interactiveMessageButton8);
                context = interactiveMessageButton8.getContext();
                i2 = 10;
                break;
            default:
                InteractiveMessageButton interactiveMessageButton9 = (InteractiveMessageButton) obj;
                r4 = (AnonymousClass206) this.A02;
                A0V = AnonymousClass3Ma.A0V(interactiveMessageButton9);
                context = interactiveMessageButton9.getContext();
                i2 = 11;
                break;
        }
        A0V.A01(context, (AnonymousClass5XY) null, r4, i2);
    }
}
