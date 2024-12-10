package X;

import android.media.AudioRecord;

/* renamed from: X.7xP  reason: invalid class name */
public final class AnonymousClass7xP extends AnonymousClass11G implements C18090vk {
    public static final AnonymousClass7xP A00 = new AnonymousClass7xP();

    public AnonymousClass7xP() {
        super(0);
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        return Integer.valueOf(AudioRecord.getMinBufferSize(44100, 16, 2));
    }
}
