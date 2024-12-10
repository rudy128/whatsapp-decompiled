package X;

import com.whatsapp.metaai.voice.ui.Hilt_AiVoiceDisclosureBottomSheet;
import com.whatsapp.metaai.voice.ui.MetaAiVoiceInputBottomSheet;
import com.whatsapp.util.Log;

/* renamed from: X.4ZG  reason: invalid class name */
public final class AnonymousClass4ZG {
    public final AnonymousClass1KB A00;
    public final C219217x A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;

    public static final void A00(AnonymousClass1GP r3, AnonymousClass4ZG r4, Integer num, String str, int i) {
        int i2;
        if (r3.A0Q("MetaAiVoiceInputBottomSheet") != null) {
            Log.i("MetaAiUiUtil/openVoiceBottomSheet sheet already open, skipping");
            return;
        }
        C140076zu r1 = (C140076zu) r4.A03.get();
        switch (i) {
            case 18:
                i2 = 1;
                break;
            case 19:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        r1.A03(Integer.valueOf(i2));
        MetaAiVoiceInputBottomSheet metaAiVoiceInputBottomSheet = new MetaAiVoiceInputBottomSheet();
        metaAiVoiceInputBottomSheet.A0F = Integer.valueOf(i);
        metaAiVoiceInputBottomSheet.A0G = num;
        metaAiVoiceInputBottomSheet.A0H = str;
        metaAiVoiceInputBottomSheet.A2C(r3, "MetaAiVoiceInputBottomSheet");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.whatsapp.metaai.voice.ui.AiVoiceDisclosureBottomSheet, com.whatsapp.metaai.voice.ui.Hilt_AiVoiceDisclosureBottomSheet, androidx.fragment.app.DialogFragment] */
    public static final void A01(AnonymousClass1GP r3, AnonymousClass4ZG r4, C18090vk r5, int i) {
        if (C17880vN.A1W(C17880vN.A0C(((C38731rn) r4.A02.get()).A01), "meta_ai_voice_disclosure_seen")) {
            r5.invoke();
        } else if (r3.A0Q("AiVoiceDisclosureBottomSheet") == null) {
            ? hilt_AiVoiceDisclosureBottomSheet = new Hilt_AiVoiceDisclosureBottomSheet();
            hilt_AiVoiceDisclosureBottomSheet.A05 = Integer.valueOf(i);
            hilt_AiVoiceDisclosureBottomSheet.A2C(r3, "AiVoiceDisclosureBottomSheet");
            hilt_AiVoiceDisclosureBottomSheet.A06 = new C99164sN(r5, 8);
        }
    }

    public AnonymousClass4ZG(AnonymousClass1KB r1, C219217x r2, AnonymousClass00H r3, AnonymousClass00H r4) {
        C18070vi.A0s(r1, r3, r2, r4);
        this.A00 = r1;
        this.A03 = r3;
        this.A01 = r2;
        this.A02 = r4;
    }
}
