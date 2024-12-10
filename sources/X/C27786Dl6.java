package X;

import com.whatsapp.voicetranscription.scheduler.TranscriptionMLProcessor;

/* renamed from: X.Dl6  reason: case insensitive filesystem */
public final class C27786Dl6 extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ TranscriptionMLProcessor this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27786Dl6(TranscriptionMLProcessor transcriptionMLProcessor) {
        super(0);
        this.this$0 = transcriptionMLProcessor;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        return C17880vN.A0e(this.this$0.A01.A00.getCacheDir(), "transcription_tmp");
    }
}
