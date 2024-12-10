package X;

import com.whatsapp.audioRecording.AudioRecordFactory;

/* renamed from: X.7vo  reason: invalid class name and case insensitive filesystem */
public final class C157107vo extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ AudioRecordFactory $audioRecordFactory;
    public final /* synthetic */ AnonymousClass72K this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C157107vo(AudioRecordFactory audioRecordFactory, AnonymousClass72K r3) {
        super(0);
        this.$audioRecordFactory = audioRecordFactory;
        this.this$0 = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        return this.$audioRecordFactory.createAudioRecord(44100, C72453Mb.A0I(this.this$0.A0A));
    }
}
