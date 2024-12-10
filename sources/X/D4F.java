package X;

import android.os.Bundle;
import android.speech.RecognitionListener;
import java.util.ArrayList;

public final class D4F implements RecognitionListener {
    public final /* synthetic */ C441822l A00;
    public final /* synthetic */ AnonymousClass10I A01;
    public final /* synthetic */ E8I A02;
    public final /* synthetic */ C18090vk A03;
    public final /* synthetic */ C98494rF A04;

    public void onBeginningOfSpeech() {
    }

    public void onBufferReceived(byte[] bArr) {
    }

    public void onEndOfSpeech() {
    }

    public void onEvent(int i, Bundle bundle) {
    }

    public void onPartialResults(Bundle bundle) {
    }

    public void onReadyForSpeech(Bundle bundle) {
    }

    public void onResults(Bundle bundle) {
        C18070vi.A0d(bundle, 0);
        C98494rF r5 = this.A04;
        A00(bundle, r5);
        C18090vk r0 = this.A03;
        AnonymousClass10I r4 = this.A01;
        E8I e8i = this.A02;
        C441822l r2 = this.A00;
        r0.invoke();
        r4.CGF(new AnonymousClass7RO(e8i, r2, r5, 36));
    }

    public void onRmsChanged(float f) {
    }

    public void onSegmentResults(Bundle bundle) {
        C18070vi.A0d(bundle, 0);
        A00(bundle, this.A04);
    }

    public D4F(C441822l r1, AnonymousClass10I r2, E8I e8i, C18090vk r4, C98494rF r5) {
        this.A04 = r5;
        this.A03 = r4;
        this.A01 = r2;
        this.A02 = e8i;
        this.A00 = r1;
    }

    public void onEndOfSegmentedSession() {
        C18090vk r0 = this.A03;
        AnonymousClass10I r5 = this.A01;
        E8I e8i = this.A02;
        C441822l r3 = this.A00;
        C98494rF r2 = this.A04;
        r0.invoke();
        r5.CGF(new AnonymousClass7RO(e8i, r3, r2, 36));
    }

    public static final void A00(Bundle bundle, C98494rF r3) {
        String str;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append((String) r3.element);
        ArrayList<String> stringArrayList = bundle.getStringArrayList("results_recognition");
        if (stringArrayList == null || (str = (String) C29431cG.A0c(stringArrayList)) == null) {
            str = "";
        }
        r3.element = AnonymousClass000.A0y(str, A10);
    }

    public void onError(int i) {
        Object obj;
        C17900vP.A0j("voicetranscription/SpeechRecognizerTranscriptionEngine/onError error=", AnonymousClass000.A10(), i);
        this.A03.invoke();
        if (i == 3) {
            obj = C24102BvU.A00;
        } else if (i == 9) {
            obj = C24103BvV.A00;
        } else if (i != 12) {
            obj = new CM2(1);
        } else {
            obj = C24105BvX.A00;
        }
        this.A01.CGF(new AnonymousClass7RO(this.A02, this.A00, obj, 37));
    }
}
