package X;

import android.content.Context;
import com.whatsapp.bot.home.AIHomeActivity;

/* renamed from: X.7xq  reason: invalid class name and case insensitive filesystem */
public final class C157647xq extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ AIHomeActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C157647xq(AIHomeActivity aIHomeActivity) {
        super(1);
        this.this$0 = aIHomeActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass1BI r3;
        String str;
        C143307Cw r5 = (C143307Cw) obj;
        if (!(r5 == null || (r3 = r5.A01) == null)) {
            AnonymousClass24Z r0 = (AnonymousClass24Z) C108945cZ.A0b(this.this$0.A07).A03.A06();
            if (r0 != null) {
                String str2 = r0.A01;
                C33251iW r02 = this.this$0.A00;
                if (r02 != null) {
                    r02.A0W(r3, str2);
                } else {
                    str = "userActions";
                    C18070vi.A11(str);
                    throw null;
                }
            }
            AIHomeActivity aIHomeActivity = this.this$0;
            AnonymousClass118 r03 = aIHomeActivity.A01;
            if (r03 != null) {
                Context context = r03.A00;
                AnonymousClass00H r04 = aIHomeActivity.A05;
                if (r04 != null) {
                    context.startActivity(AnonymousClass3MY.A06(this.this$0, C108945cZ.A0h(r04), r3));
                    this.this$0.setResult(-1);
                    this.this$0.finish();
                } else {
                    str = "waIntents";
                }
            } else {
                str = "waContext";
            }
            C18070vi.A11(str);
            throw null;
        }
        return C27621Wu.A00;
    }
}
