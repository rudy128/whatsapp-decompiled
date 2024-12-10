package X;

import android.os.Bundle;
import com.whatsapp.calling.lightweightcalling.view.AudioChatBottomSheetDialog;

/* renamed from: X.4Vk  reason: invalid class name and case insensitive filesystem */
public final class C87394Vk {
    public static final AudioChatBottomSheetDialog A00(String str) {
        C18070vi.A0d(str, 0);
        AudioChatBottomSheetDialog audioChatBottomSheetDialog = new AudioChatBottomSheetDialog();
        Bundle A0D = C17880vN.A0D();
        A0D.putString("audio_chat_call_id", str);
        audioChatBottomSheetDialog.A1R(A0D);
        return audioChatBottomSheetDialog;
    }
}
