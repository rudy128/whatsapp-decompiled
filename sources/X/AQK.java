package X;

import android.content.Context;
import com.whatsapp.conversation.conversationrow.InteractiveMessageButton;

public final /* synthetic */ class AQK implements AnonymousClass5ZL {
    public final /* synthetic */ C19981A1r A00;
    public final /* synthetic */ InteractiveMessageButton A01;
    public final /* synthetic */ AnonymousClass206 A02;

    public final void Bn2(int i) {
        int i2;
        InteractiveMessageButton interactiveMessageButton = this.A01;
        AnonymousClass206 r4 = this.A02;
        C19981A1r a1r = this.A00;
        C86314Rd r3 = (C86314Rd) interactiveMessageButton.A0E.get();
        Context context = interactiveMessageButton.getContext();
        switch (a1r.A02.intValue()) {
            case 1:
            case 7:
                i2 = 0;
                break;
            case 2:
            case 8:
                i2 = 1;
                break;
            case 3:
                i2 = 2;
                break;
            case 4:
            case 9:
                i2 = 3;
                break;
            case 5:
                i2 = 4;
                break;
            case 6:
                i2 = 5;
                break;
            case 10:
                i2 = 10;
                break;
            case 11:
                i2 = 11;
                break;
            case 12:
                i2 = 12;
                break;
            case 13:
                i2 = 13;
                break;
            case 14:
                i2 = 14;
                break;
            default:
                i2 = 15;
                break;
        }
        r3.A01(context, (AnonymousClass5XY) null, r4, i2);
    }

    public /* synthetic */ AQK(C19981A1r a1r, InteractiveMessageButton interactiveMessageButton, AnonymousClass206 r3) {
        this.A01 = interactiveMessageButton;
        this.A02 = r3;
        this.A00 = a1r;
    }
}
