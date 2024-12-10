package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.util.Log;

/* renamed from: X.3uF  reason: invalid class name */
public class AnonymousClass3uF extends AnonymousClass3t1 {
    public AnonymousClass1QL A00;
    public AnonymousClass1QO A01;
    public AnonymousClass1QS A02;
    public final TextView A03 = C17880vN.A0E(this, 2131435333);

    public boolean A1b() {
        return true;
    }

    public Drawable getBackgroundDrawable() {
        return null;
    }

    private void A04() {
        TextView textView;
        int i;
        View view;
        boolean z = true;
        int i2 = 8;
        if (!this.A01.A03()) {
            Log.i("PAY: Cannot render payment invite system messages because payment is not enabled");
            AnonymousClass3MY.A1B(this, 2131430073, 8);
            this.A03.setVisibility(8);
            this.A07.A0G("ConversationRowPaymentInviteSystemMessage/fillView", "Cannot render payment invite message because payment is disabled", true);
            return;
        }
        C436420i r3 = (C436420i) this.A0I;
        int i3 = r3.A00;
        if (i3 != 40) {
            if (i3 != 41) {
                if (i3 == 64) {
                    if (!(r3 instanceof AnonymousClass2ME) || !((AnonymousClass2ME) r3).A01) {
                        z = false;
                    }
                } else if (i3 == 42 || i3 == 65 || i3 == 66) {
                    AnonymousClass3MY.A1B(this, 2131430073, 8);
                    view = this.A03;
                } else {
                    return;
                }
            }
            findViewById(2131430073).setVisibility(C72453Mb.A0J(z));
            textView = this.A03;
            if (z) {
                i2 = 0;
            }
            textView.setVisibility(i2);
            textView.setText(2131894019);
            i = 25;
            if (!this.A00.A0F()) {
                i = 24;
            }
            C90074dU.A01(textView, this, r3, i);
            return;
        } else if (this.A00.A0F()) {
            this.A03.setVisibility(8);
            view = findViewById(2131430073);
        } else {
            AnonymousClass3MY.A1B(this, 2131430073, 0);
            textView = this.A03;
            textView.setVisibility(0);
            textView.setText(2131894055);
            i = 23;
            C90074dU.A01(textView, this, r3, i);
            return;
        }
        view.setVisibility(8);
    }

    public void A2V(AnonymousClass206 r2, boolean z) {
        boolean A1Z = AnonymousClass3Ma.A1Z(r2, this.A0I);
        super.A2V(r2, z);
        if (z || A1Z) {
            A04();
        }
    }

    public AnonymousClass3uF(Context context, C108875cR r4, C436420i r5) {
        super(context, r4, r5);
        A1M();
        findViewById(2131433561).setBackground(this.A09.BQF());
        A04();
    }

    public void A1u() {
        A04();
        super.A1u();
    }

    public int getMainChildMaxWidth() {
        return AnonymousClass3MW.A01(getResources(), 2131168188) + (AnonymousClass3MW.A01(getResources(), 2131168192) * 2);
    }

    public int getCenteredLayoutId() {
        return 2131624749;
    }

    public int getIncomingLayoutId() {
        return 2131624749;
    }

    public int getOutgoingLayoutId() {
        return 2131624749;
    }
}
