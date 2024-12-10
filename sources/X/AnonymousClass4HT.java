package X;

import android.content.Context;
import android.content.Intent;
import com.whatsapp.ptt.language.ui.TranscriptionChooseLanguageActivity;
import java.util.List;

/* renamed from: X.4HT  reason: invalid class name */
public abstract class AnonymousClass4HT {
    public static final Intent A00(Context context, AnonymousClass1BI r4, Integer num, String str, List list) {
        Intent intent = new Intent(context, TranscriptionChooseLanguageActivity.class);
        intent.putExtra("languageSelectionKey", C87534Vy.A01(num));
        intent.putExtra("defaultLanguageKey", str);
        intent.putExtra("chatJidKey", C72463Mc.A0n(r4));
        if (list != null) {
            AnonymousClass4aU.A09(intent, list);
        }
        return intent;
    }
}
