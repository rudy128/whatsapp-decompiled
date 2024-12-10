package X;

import android.graphics.Color;
import android.view.Window;
import com.whatsapp.payments.ui.MessageWithLinkWebViewActivity;

/* renamed from: X.80i  reason: invalid class name and case insensitive filesystem */
public final class C1583480i extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ MessageWithLinkWebViewActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1583480i(MessageWithLinkWebViewActivity messageWithLinkWebViewActivity) {
        super(1);
        this.this$0 = messageWithLinkWebViewActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2;
        String str;
        String str2 = (String) obj;
        if (str2 != null) {
            try {
                str = AnonymousClass1YE.A07(str2, "\"", "", false);
            } catch (Throwable th) {
                obj2 = C108945cZ.A1J(th);
            }
        } else {
            str = null;
        }
        obj2 = Integer.valueOf(Color.parseColor(str));
        MessageWithLinkWebViewActivity messageWithLinkWebViewActivity = this.this$0;
        if (!(obj2 instanceof AnonymousClass1IU)) {
            int A0M = AnonymousClass000.A0M(obj2);
            messageWithLinkWebViewActivity.A09 = Integer.valueOf(A0M);
            if (messageWithLinkWebViewActivity.A0A) {
                Window window = messageWithLinkWebViewActivity.getWindow();
                C18070vi.A0X(window);
                C28271Zs.A00(window, A0M, true);
            }
        }
        MessageWithLinkWebViewActivity messageWithLinkWebViewActivity2 = this.this$0;
        if (C30671eK.A00(obj2) != null) {
            Window window2 = messageWithLinkWebViewActivity2.getWindow();
            C18070vi.A0X(window2);
            C28271Zs.A00(window2, AnonymousClass3Ma.A00(messageWithLinkWebViewActivity2, 2130970830, 2131102245), true);
        }
        return C27621Wu.A00;
    }
}
