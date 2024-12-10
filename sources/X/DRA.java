package X;

import android.content.Context;
import android.content.Intent;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.speech.SpeechRecognizer;
import com.whatsapp.util.Log;
import java.io.File;

public final class DRA implements C28543E6r {
    public final AnonymousClass1KB A00;
    public final AnonymousClass118 A01;
    public final AnonymousClass10I A02;

    /* JADX WARNING: type inference failed for: r0v7, types: [X.Bvo, X.CM2] */
    public void CPe(C25209Cb3 cb3, E8I e8i) {
        E8I e8i2 = e8i;
        C18070vi.A0d(e8i, 1);
        Context context = this.A01.A00;
        C18070vi.A0X(context);
        C25209Cb3 cb32 = cb3;
        File file = cb3.A02;
        C441822l r2 = cb3.A01;
        C98494rF A002 = C98494rF.A00();
        C98494rF A003 = C98494rF.A00();
        try {
            A002.element = ParcelFileDescriptor.open(file, 268435456);
            Intent A0G = C108945cZ.A0G("android.speech.action.RECOGNIZE_SPEECH");
            A0G.putExtra("android.speech.extra.SEGMENTED_SESSION", "android.speech.extra.AUDIO_SOURCE");
            A0G.putExtra("android.speech.extra.AUDIO_SOURCE", (Parcelable) A002.element);
            A0G.putExtra("android.speech.extra.AUDIO_SOURCE_SAMPLING_RATE", 16000);
            A0G.putExtra("android.speech.extra.LANGUAGE_MODEL", "free_form");
            this.A00.A0J(new C21464AkV(e8i2, this, cb32, context, A0G, A003, A002, 6));
        } catch (Exception e) {
            Log.i("voicetranscription/SpeechRecognizerTranscriptionEngine/transcribe error", e);
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) A002.element;
            if (parcelFileDescriptor != null) {
                parcelFileDescriptor.close();
            }
            SpeechRecognizer speechRecognizer = (SpeechRecognizer) A003.element;
            if (speechRecognizer != null) {
                speechRecognizer.destroy();
            }
            e8i.C98(new CM2(1), r2);
        }
    }

    public DRA(AnonymousClass1KB r1, AnonymousClass118 r2, AnonymousClass10I r3) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
    }

    public static final void A00(Context context, Intent intent, C25209Cb3 cb3, E8I e8i, DRA dra, C98494rF r12, C98494rF r13) {
        C72473Md.A1I(cb3, r12);
        C72473Md.A1J(r13, intent);
        C441822l r2 = cb3.A01;
        AnonymousClass10I r3 = dra.A02;
        C27444DfV dfV = new C27444DfV(r13, r12);
        C98494rF A002 = C98494rF.A00();
        A002.element = "";
        D4F d4f = new D4F(r2, r3, e8i, dfV, A002);
        SpeechRecognizer createOnDeviceSpeechRecognizer = SpeechRecognizer.createOnDeviceSpeechRecognizer(context);
        createOnDeviceSpeechRecognizer.setRecognitionListener(d4f);
        createOnDeviceSpeechRecognizer.startListening(intent);
        r12.element = createOnDeviceSpeechRecognizer;
    }
}
