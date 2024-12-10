package X;

import android.content.Intent;
import com.whatsapp.settings.chat.theme.ChatThemeActivity;

/* renamed from: X.5UA  reason: invalid class name */
public final class AnonymousClass5UA extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ ChatThemeActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5UA(ChatThemeActivity chatThemeActivity) {
        super(1);
        this.this$0 = chatThemeActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass1D6 r4 = (AnonymousClass1D6) obj;
        Intent intent = (Intent) r4.first;
        Number number = (Number) r4.second;
        if (number != null) {
            intent.putExtra("request_code", number.intValue());
            AnonymousClass02n r0 = this.this$0.A00;
            if (r0 != null) {
                r0.A03(intent);
            } else {
                C18070vi.A11("intentLauncher");
                throw null;
            }
        } else {
            this.this$0.startActivity(intent);
        }
        return C27621Wu.A00;
    }
}
