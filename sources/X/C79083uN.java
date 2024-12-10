package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.3uN  reason: invalid class name and case insensitive filesystem */
public class C79083uN extends C78183sN {
    public final TextEmojiLabel A00 = AnonymousClass3MX.A0W(this, 2131432683);

    public int getUserNameInGroupLayoutOption() {
        return 1;
    }

    public void A2i() {
        TextEmojiLabel textEmojiLabel = this.A00;
        textEmojiLabel.setText(getMessageString());
        textEmojiLabel.setLongClickable(C72483Me.A1A(textEmojiLabel, this.A0F));
        if (this.A0l.Bew(getFMessage())) {
            View view = this.A0j;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.width = -1;
            view.setLayoutParams(layoutParams);
        }
    }

    public C79083uN(Context context, C108875cR r3, AnonymousClass23N r4) {
        super(context, r3, r4);
        A1M();
        A2i();
    }

    public int A1k(int i) {
        if (!C79103uS.A1I(this)) {
            return 0;
        }
        return 2131232640;
    }

    public int A1l(int i) {
        if (!C79103uS.A1I(this)) {
            return 0;
        }
        return AnonymousClass1YL.A00(getContext(), 2130971964, 2131101888);
    }

    public void A2V(AnonymousClass206 r2, boolean z) {
        boolean A1Z = AnonymousClass3Ma.A1Z(r2, getFMessage());
        super.A2V(r2, z);
        if (z || A1Z) {
            A2i();
        }
    }

    public String getMessageString() {
        int i;
        boolean A0V = C22971Dz.A0V(C79103uS.A1C(this));
        if (C79103uS.A1I(this)) {
            i = 2131895353;
            if (A0V) {
                i = 2131895354;
            }
        } else {
            i = 2131895351;
            if (A0V) {
                i = 2131895352;
            }
        }
        return AnonymousClass3Ma.A11(this, i);
    }

    public int getCenteredLayoutId() {
        return 2131624919;
    }

    public int getIncomingLayoutId() {
        return 2131624919;
    }

    public int getOutgoingLayoutId() {
        return 2131624920;
    }
}
