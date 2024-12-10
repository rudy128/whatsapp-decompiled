package X;

import android.content.SharedPreferences;
import java.util.HashMap;

/* renamed from: X.1L1  reason: invalid class name */
public final class AnonymousClass1L1 implements AnonymousClass1L0 {
    public final SharedPreferences A00;
    public final C19830z4 A01;

    public AnonymousClass1L1(C19830z4 r2, C18010vc r3) {
        C18070vi.A0d(r3, 1);
        C18070vi.A0d(r2, 2);
        SharedPreferences A05 = r3.A05("ptt_prefs");
        C18070vi.A0X(A05);
        this.A00 = A05;
        this.A01 = r2;
    }

    public final synchronized void A00(C19830z4 r8) {
        AnonymousClass00H r6 = r8.A00;
        if (((SharedPreferences) r6.get()) != null) {
            SharedPreferences sharedPreferences = this.A00;
            if (sharedPreferences.getInt("ptt_migrated_version", 0) < 1) {
                HashMap hashMap = new HashMap();
                Class<Integer> cls = Integer.class;
                hashMap.put("ptt_waveform_conversation_bar_count", cls);
                hashMap.put("ptt_waveform_conversation_samples_per_bar", cls);
                hashMap.put("ptt_waveform_timer_interval_ms", cls);
                hashMap.put("ptt_reply_nux_shown", Boolean.class);
                Class<Long> cls2 = Long.class;
                hashMap.put("ptt_cancel_broadcast", cls2);
                hashMap.put("ptt_cancel_group", cls2);
                hashMap.put("ptt_cancel_individual", cls2);
                hashMap.put("ptt_cancel_interop", cls2);
                hashMap.put("ptt_draft_review_broadcast", cls2);
                hashMap.put("ptt_draft_review_group", cls2);
                hashMap.put("ptt_draft_review_individual", cls2);
                hashMap.put("ptt_draft_review_interop", cls2);
                hashMap.put("ptt_fast_playback_broadcast", cls2);
                hashMap.put("ptt_fast_playback_group", cls2);
                hashMap.put("ptt_fast_playback_individual", cls2);
                hashMap.put("ptt_fast_playback_interop", cls2);
                hashMap.put("ptt_lock_broadcast", cls2);
                hashMap.put("ptt_lock_group", cls2);
                hashMap.put("ptt_lock_individual", cls2);
                hashMap.put("ptt_lock_interop", cls2);
                hashMap.put("ptt_playback_broadcast", cls2);
                hashMap.put("ptt_playback_group", cls2);
                hashMap.put("ptt_playback_individual", cls2);
                hashMap.put("ptt_playback_interop", cls2);
                hashMap.put("ptt_record_broadcast", cls2);
                hashMap.put("ptt_record_group", cls2);
                hashMap.put("ptt_record_individual", cls2);
                hashMap.put("ptt_record_interop", cls2);
                hashMap.put("ptt_send_broadcast", cls2);
                hashMap.put("ptt_send_group", cls2);
                hashMap.put("ptt_send_individual", cls2);
                hashMap.put("ptt_send_interop", cls2);
                hashMap.put("ptt_pause_tap_broadcast", cls2);
                hashMap.put("ptt_pause_tap_group", cls2);
                hashMap.put("ptt_pause_tap_individual", cls2);
                hashMap.put("ptt_pause_tap_interop", cls2);
                hashMap.put("ptt_out_of_chat_individual", cls2);
                hashMap.put("ptt_out_of_chat_interop", cls2);
                hashMap.put("ptt_out_of_chat_broadcast", cls2);
                hashMap.put("ptt_out_of_chat_group", cls2);
                AnonymousClass2UQ.A00((SharedPreferences) r6.get(), sharedPreferences, hashMap);
                SharedPreferences.Editor edit = sharedPreferences.edit();
                C18070vi.A0X(edit);
                edit.putInt("ptt_migrated_version", 1).apply();
            }
        }
    }

    public /* synthetic */ void Bqg() {
    }

    public /* synthetic */ void Bqi() {
    }

    public void Bqh() {
        A00(this.A01);
    }
}
