package X;

import android.os.ParcelFileDescriptor;
import android.speech.SpeechRecognizer;

/* renamed from: X.DfV  reason: case insensitive filesystem */
public final /* synthetic */ class C27444DfV extends AnonymousClass1JJ implements C18090vk {
    public final /* synthetic */ C98494rF $descriptor;
    public final /* synthetic */ C98494rF $speechRecognizer;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27444DfV(C98494rF r7, C98494rF r8) {
        super(0, AnonymousClass4I1.class, "cleanUp", "transcribe$cleanUp(Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/jvm/internal/Ref$ObjectRef;)V", 0);
        this.$descriptor = r7;
        this.$speechRecognizer = r8;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C98494rF r0 = this.$descriptor;
        C98494rF r1 = this.$speechRecognizer;
        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) r0.element;
        if (parcelFileDescriptor != null) {
            parcelFileDescriptor.close();
        }
        SpeechRecognizer speechRecognizer = (SpeechRecognizer) r1.element;
        if (speechRecognizer != null) {
            speechRecognizer.destroy();
        }
        return C27621Wu.A00;
    }
}
