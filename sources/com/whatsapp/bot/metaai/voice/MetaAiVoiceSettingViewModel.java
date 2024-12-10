package com.whatsapp.bot.metaai.voice;

import X.AnonymousClass10I;
import X.AnonymousClass1J2;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.C134056pw;
import X.C17880vN;
import X.C17890vO;
import X.C18070vi;
import X.C18460wS;
import X.C200710s;
import X.C20125A8k;
import X.C21446AkD;
import X.C21452AkJ;
import X.C27621Wu;
import X.C29431cG;
import X.C38731rn;
import X.C41111vp;
import X.C41731wy;
import X.C72463Mc;
import android.media.MediaPlayer;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

public final class MetaAiVoiceSettingViewModel extends AnonymousClass1J2 {
    public MediaPlayer A00 = new MediaPlayer();
    public Integer A01;
    public final C134056pw A02;
    public final C41111vp A03 = AnonymousClass3MW.A0n(C18460wS.A00);
    public final C41111vp A04 = AnonymousClass3MW.A0n(AnonymousClass3MY.A0f());
    public final C200710s A05;
    public final C41731wy A06;
    public final C41731wy A07;
    public final C38731rn A08;

    public MetaAiVoiceSettingViewModel(C38731rn r3, C134056pw r4, AnonymousClass10I r5) {
        C18070vi.A0d(r3, 1);
        C18070vi.A0k(r4, r5);
        this.A08 = r3;
        this.A02 = r4;
        this.A05 = new C200710s(r5, true);
        C27621Wu r1 = C27621Wu.A00;
        this.A06 = new C41731wy(r1);
        this.A07 = new C41731wy(r1);
    }

    public static final void A00(MetaAiVoiceSettingViewModel metaAiVoiceSettingViewModel) {
        try {
            MediaPlayer mediaPlayer = metaAiVoiceSettingViewModel.A00;
            if (mediaPlayer != null) {
                mediaPlayer.reset();
            }
            MediaPlayer mediaPlayer2 = metaAiVoiceSettingViewModel.A00;
            if (mediaPlayer2 != null) {
                mediaPlayer2.release();
            }
            metaAiVoiceSettingViewModel.A00 = null;
        } catch (Exception unused) {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0045, code lost:
        if (r2.hasNext() == false) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0055, code lost:
        if (X.C18070vi.A18(X.C108945cZ.A0V(r2).A0F("identifier"), r10) != false) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0057, code lost:
        r5 = r5 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005d, code lost:
        if (r5 == -1) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005f, code lost:
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0060, code lost:
        r9.A0U(r5, false);
        r9.A0T();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0066, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0036, code lost:
        if (r5 == -1) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0038, code lost:
        r2 = X.AnonymousClass3MW.A10(r7).iterator();
        r5 = 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A03(com.whatsapp.bot.metaai.voice.MetaAiVoiceSettingViewModel r9, java.lang.String r10) {
        /*
            X.1vp r7 = r9.A03
            java.util.List r0 = X.AnonymousClass3MW.A10(r7)
            java.util.Iterator r8 = r0.iterator()
            r4 = 0
            r5 = 0
        L_0x000c:
            boolean r0 = r8.hasNext()
            r3 = -1
            if (r0 == 0) goto L_0x0038
            X.A8k r1 = X.C108945cZ.A0V(r8)
            java.lang.String r0 = "identifier"
            java.lang.String r6 = r1.A0F(r0)
            X.1rn r0 = r9.A08
            X.0vl r0 = r0.A01
            android.content.SharedPreferences r2 = X.C17880vN.A0C(r0)
            java.lang.String r0 = "meta_ai_voice_option_selection_identifier"
            java.lang.String r1 = ""
            java.lang.String r0 = r2.getString(r0, r1)
            if (r0 == 0) goto L_0x0030
            r1 = r0
        L_0x0030:
            boolean r0 = X.C18070vi.A18(r6, r1)
            if (r0 == 0) goto L_0x005a
            if (r5 != r3) goto L_0x005d
        L_0x0038:
            java.util.List r0 = X.AnonymousClass3MW.A10(r7)
            java.util.Iterator r2 = r0.iterator()
            r5 = 0
        L_0x0041:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x005f
            X.A8k r1 = X.C108945cZ.A0V(r2)
            java.lang.String r0 = "identifier"
            java.lang.String r0 = r1.A0F(r0)
            boolean r0 = X.C18070vi.A18(r0, r10)
            if (r0 != 0) goto L_0x005d
            int r5 = r5 + 1
            goto L_0x0041
        L_0x005a:
            int r5 = r5 + 1
            goto L_0x000c
        L_0x005d:
            if (r5 != r3) goto L_0x0060
        L_0x005f:
            r5 = 0
        L_0x0060:
            r9.A0U(r5, r4)
            r9.A0T()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.bot.metaai.voice.MetaAiVoiceSettingViewModel.A03(com.whatsapp.bot.metaai.voice.MetaAiVoiceSettingViewModel, java.lang.String):void");
    }

    public void A0S() {
        this.A05.execute(new C21446AkD(this, 1));
    }

    public final void A0T() {
        C20125A8k a8k;
        String A0F;
        if (this.A02.A01() && (a8k = (C20125A8k) C29431cG.A0f(AnonymousClass3MW.A10(this.A03), C72463Mc.A0A(this.A04))) != null && (A0F = a8k.A0F("sample_audio_url")) != null) {
            C200710s r2 = this.A05;
            r2.A03();
            r2.execute(new C21452AkJ(34, A0F, this));
        }
    }

    public final void A0U(int i, boolean z) {
        if (z) {
            this.A01 = (Integer) this.A04.A06();
        }
        C20125A8k a8k = (C20125A8k) C29431cG.A0f(AnonymousClass3MW.A10(this.A03), i);
        if (a8k != null) {
            C38731rn r1 = this.A08;
            String A0F = a8k.A0F("identifier");
            String str = "";
            if (A0F == null) {
                A0F = str;
            }
            C17880vN.A1E(C17890vO.A0A(r1.A01), "meta_ai_voice_option_selection_identifier", A0F);
            C134056pw r12 = this.A02;
            String A0F2 = a8k.A0F(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
            if (A0F2 != null) {
                str = A0F2;
            }
            r12.A01 = str;
            C17880vN.A1E(C17890vO.A0A(((C38731rn) r12.A03.get()).A01), "meta_ai_voice_option_selection_name", str);
            AnonymousClass3MX.A1J(this.A04, i);
        }
    }
}
