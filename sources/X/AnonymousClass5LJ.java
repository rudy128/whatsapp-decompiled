package X;

import android.os.Bundle;
import com.whatsapp.ptt.language.ui.TranscriptionChooseLanguageActivity;
import java.util.ArrayList;

/* renamed from: X.5LJ  reason: invalid class name */
public final class AnonymousClass5LJ extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ TranscriptionChooseLanguageActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5LJ(TranscriptionChooseLanguageActivity transcriptionChooseLanguageActivity) {
        super(0);
        this.this$0 = transcriptionChooseLanguageActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        ArrayList A04;
        TranscriptionChooseLanguageActivity transcriptionChooseLanguageActivity = this.this$0;
        C84464Jp r4 = transcriptionChooseLanguageActivity.A00;
        if (r4 != null) {
            Integer A00 = C87534Vy.A00(C72453Mb.A0x(transcriptionChooseLanguageActivity.getIntent(), "languageSelectionKey"));
            String stringExtra = this.this$0.getIntent().getStringExtra("defaultLanguageKey");
            AnonymousClass1BI A02 = AnonymousClass1BI.A00.A02(this.this$0.getIntent().getStringExtra("chatJidKey"));
            Bundle bundleExtra = this.this$0.getIntent().getBundleExtra("fMessageKeyBundle");
            if (bundleExtra == null) {
                A04 = null;
            } else {
                A04 = AnonymousClass4aU.A04(bundleExtra);
            }
            C18070vi.A0d(A00, 1);
            return new C24071It(new C91734gA(r4, A02, A00, stringExtra, A04), transcriptionChooseLanguageActivity).A00(AnonymousClass3U1.class);
        }
        C18070vi.A11("viewModelFactory");
        throw null;
    }
}
