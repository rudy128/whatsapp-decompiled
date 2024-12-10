package com.whatsapp.conversation.conversationrow.audio;

import X.AnonymousClass000;
import X.AnonymousClass01E;
import X.AnonymousClass1BI;
import X.AnonymousClass1FL;
import X.AnonymousClass1OS;
import X.AnonymousClass205;
import X.AnonymousClass3Ma;
import X.C127126dq;
import X.C18070vi;
import X.C18600wl;
import X.C20098A7b;
import X.C24100BvS;
import X.C25550Cho;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import android.app.Activity;
import com.whatsapp.ptt.language.Hilt_TranscriptionChooseLanguagePerChatBottomSheetFragment;
import com.whatsapp.util.Log;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.conversation.conversationrow.audio.TranscriptionStatusView$showTranscriptUnavailableDialog$1", f = "TranscriptionStatusView.kt", i = {}, l = {307}, m = "invokeSuspend", n = {}, s = {})
public final class TranscriptionStatusView$showTranscriptUnavailableDialog$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass1BI $chatJid;
    public final /* synthetic */ AnonymousClass205 $messageKey;
    public int label;
    public final /* synthetic */ TranscriptionStatusView this$0;

    @DebugMetadata(c = "com.whatsapp.conversation.conversationrow.audio.TranscriptionStatusView$showTranscriptUnavailableDialog$1$1", f = "TranscriptionStatusView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.conversation.conversationrow.audio.TranscriptionStatusView$showTranscriptUnavailableDialog$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public int label;

        public final C30391dr create(Object obj, C30391dr r6) {
            return new AnonymousClass1(transcriptionStatusView, r2, str, r6);
        }

        /* JADX WARNING: type inference failed for: r2v1, types: [com.whatsapp.ptt.language.TranscriptionChooseLanguagePerChatBottomSheetFragment, com.whatsapp.ptt.language.Hilt_TranscriptionChooseLanguagePerChatBottomSheetFragment, androidx.fragment.app.DialogFragment] */
        public final Object invokeSuspend(Object obj) {
            AnonymousClass1FL r1;
            if (this.label == 0) {
                C30691eM.A01(obj);
                String str = str;
                C127126dq r12 = new C127126dq(transcriptionStatusView, r2);
                C18070vi.A0d(str, 0);
                ? hilt_TranscriptionChooseLanguagePerChatBottomSheetFragment = new Hilt_TranscriptionChooseLanguagePerChatBottomSheetFragment();
                hilt_TranscriptionChooseLanguagePerChatBottomSheetFragment.A04 = str;
                hilt_TranscriptionChooseLanguagePerChatBottomSheetFragment.A01 = r12;
                Activity A05 = AnonymousClass3Ma.A05(transcriptionStatusView);
                if (!(A05 instanceof AnonymousClass01E) || (r1 = (AnonymousClass1FL) A05) == null) {
                    Log.e("TranscriptionStatusView/showTranscriptUnavailableDialog no AppCompatActivity found");
                } else {
                    C20098A7b.A01(hilt_TranscriptionChooseLanguagePerChatBottomSheetFragment, r1.getSupportFragmentManager());
                }
                return C27621Wu.A00;
            }
            throw AnonymousClass000.A0l();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TranscriptionStatusView$showTranscriptUnavailableDialog$1(TranscriptionStatusView transcriptionStatusView, AnonymousClass1BI r3, AnonymousClass205 r4, C30391dr r5) {
        super(2, r5);
        this.this$0 = transcriptionStatusView;
        this.$chatJid = r3;
        this.$messageKey = r4;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new TranscriptionStatusView$showTranscriptUnavailableDialog$1(this.this$0, this.$chatJid, this.$messageKey, r6);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r6 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C25550Cho cho = this.this$0.getChatSettingsStore().A0a(this.$chatJid).A0B;
            if (cho == null) {
                cho = C24100BvS.A00;
            }
            final String str = cho.A01;
            if (str == null && (str = (String) this.this$0.getPttTranscriptionConfig().A05.getValue()) == null) {
                str = "";
            }
            C18600wl mainDispatcher = this.this$0.getMainDispatcher();
            final TranscriptionStatusView transcriptionStatusView = this.this$0;
            final AnonymousClass205 r2 = this.$messageKey;
            AnonymousClass1 r0 = new AnonymousClass1((C30391dr) null);
            this.label = 1;
            if (C30451dy.A00(this, mainDispatcher, r0) == r6) {
                return r6;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((TranscriptionStatusView$showTranscriptUnavailableDialog$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
