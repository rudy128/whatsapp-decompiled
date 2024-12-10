package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.WaTextView;
import com.whatsapp.conversation.conversationrow.BotCodeView;

public final class BMM extends C42011xT {
    public int A00;
    public int A01;
    public int A02;
    public final Context A03;
    public final WaTextView A04;
    public final BotCodeView A05;

    public BMM(Context context) {
        super(LayoutInflater.from(context).inflate(2131626749, (ViewGroup) null));
        this.A03 = context;
        View view = this.A0H;
        this.A05 = (BotCodeView) AnonymousClass3MX.A0C(view, 2131434703);
        this.A04 = (WaTextView) AnonymousClass3MX.A0C(view, 2131434707);
        this.A02 = (int) context.getResources().getDimension(2131168489);
        this.A00 = (int) context.getResources().getDimension(2131168486);
        this.A01 = (int) context.getResources().getDimension(2131168488);
    }
}
