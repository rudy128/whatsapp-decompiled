package com.whatsapp.bot.metaai.voice;

import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass118;
import X.AnonymousClass181;
import X.AnonymousClass1D9;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass3MW;
import X.AnonymousClass3MZ;
import X.AnonymousClass79Z;
import X.C108955ca;
import X.C108965cb;
import X.C109005cf;
import X.C112245lA;
import X.C1407472v;
import X.C148777hz;
import X.C148787i0;
import X.C155267sT;
import X.C18070vi;
import X.C18100vl;
import X.C20125A8k;
import X.C21446AkD;
import X.C29431cG;
import X.C72463Mc;
import X.C99274sY;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.collections.centeredrecyclerview.CenteredSelectionRecyclerView;

public final class MetaAiVoiceSettingActivity extends AnonymousClass1FY {
    public AnonymousClass181 A00;
    public WaImageView A01;
    public WaImageView A02;
    public WaTextView A03;
    public WaTextView A04;
    public WaTextView A05;
    public C112245lA A06;
    public CenteredSelectionRecyclerView A07;
    public AnonymousClass118 A08;
    public AnonymousClass1D9 A09;
    public C1407472v A0A;
    public boolean A0B;
    public final C18100vl A0C;

    public static final void A03(MetaAiVoiceSettingActivity metaAiVoiceSettingActivity) {
        String str;
        String str2;
        WaTextView waTextView = metaAiVoiceSettingActivity.A05;
        if (waTextView == null) {
            str2 = "voiceOptionTitle";
        } else {
            C18100vl r1 = metaAiVoiceSettingActivity.A0C;
            waTextView.setText(((MetaAiVoiceSettingViewModel) r1.getValue()).A02.A00());
            WaTextView waTextView2 = metaAiVoiceSettingActivity.A03;
            if (waTextView2 == null) {
                str2 = "voiceOptionDescription";
            } else {
                MetaAiVoiceSettingViewModel metaAiVoiceSettingViewModel = (MetaAiVoiceSettingViewModel) r1.getValue();
                C20125A8k a8k = (C20125A8k) C29431cG.A0f(AnonymousClass3MW.A10(metaAiVoiceSettingViewModel.A03), C72463Mc.A0A(metaAiVoiceSettingViewModel.A04));
                if (a8k == null || (str = a8k.A0F("subtitle")) == null) {
                    str = "";
                }
                waTextView2.setText(str);
                return;
            }
        }
        C18070vi.A11(str2);
        throw null;
    }

    public void A2y() {
        if (!this.A0B) {
            this.A0B = true;
            AnonymousClass10E A0A2 = C109005cf.A0A(C108955ca.A0K(this), this);
            AnonymousClass1FB.A0M(A0A2, this);
            AnonymousClass10G r1 = A0A2.A00;
            C109005cf.A0c(A0A2, r1, r1, this);
            C109005cf.A0e(A0A2, r1, this, r1.A5A);
            this.A00 = C108965cb.A0H(A0A2);
            this.A08 = AnonymousClass3MZ.A0l(A0A2);
            this.A09 = (AnonymousClass1D9) A0A2.A0n.get();
        }
    }

    public MetaAiVoiceSettingActivity(int i) {
        this.A0B = false;
        AnonymousClass79Z.A00(this, 26);
    }

    /* JADX WARNING: type inference failed for: r3v5, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r13) {
        /*
            r12 = this;
            super.onCreate(r13)
            r0 = 2131624075(0x7f0e008b, float:1.887532E38)
            r12.setContentView((int) r0)
            r0 = 2131436270(0x7f0b22ee, float:1.8494406E38)
            android.view.View r2 = X.AnonymousClass3MY.A0C(r12, r0)
            androidx.appcompat.widget.Toolbar r2 = (androidx.appcompat.widget.Toolbar) r2
            X.0vb r1 = r12.A00
            r0 = 2131231675(0x7f0803bb, float:1.8079438E38)
            X.AnonymousClass3NL.A02(r12, r2, r1, r0)
            r0 = 2131899180(0x7f12332c, float:1.9433299E38)
            java.lang.String r0 = r12.getString(r0)
            r2.setTitle((java.lang.CharSequence) r0)
            android.content.Context r0 = X.AnonymousClass3MY.A04(r2)
            int r0 = X.C108955ca.A02(r0)
            r2.setBackgroundResource(r0)
            r1 = 45
            X.782 r0 = new X.782
            r0.<init>(r12, r1)
            r2.setNavigationOnClickListener(r0)
            r0 = 2132083960(0x7f1504f8, float:1.9808077E38)
            r2.A0Q(r12, r0)
            r12.setSupportActionBar(r2)
            r0 = 2131432744(0x7f0b1528, float:1.8487254E38)
            android.view.View r2 = X.C110885hR.A0A(r12, r0)
            com.airbnb.lottie.LottieAnimationView r2 = (com.airbnb.lottie.LottieAnimationView) r2
            X.7wl r1 = X.C157337wl.A00
            X.72v r0 = new X.72v
            r0.<init>(r2, r1)
            r12.A0A = r0
            r0 = 2131436913(0x7f0b2571, float:1.849571E38)
            android.view.View r0 = X.AnonymousClass3MY.A0C(r12, r0)
            com.whatsapp.WaTextView r0 = (com.whatsapp.WaTextView) r0
            r12.A05 = r0
            r0 = 2131436908(0x7f0b256c, float:1.84957E38)
            android.view.View r0 = X.AnonymousClass3MY.A0C(r12, r0)
            com.whatsapp.WaTextView r0 = (com.whatsapp.WaTextView) r0
            r12.A03 = r0
            r0 = 2131436922(0x7f0b257a, float:1.8495728E38)
            android.view.View r0 = X.AnonymousClass3MY.A0C(r12, r0)
            com.whatsapp.collections.centeredrecyclerview.CenteredSelectionRecyclerView r0 = (com.whatsapp.collections.centeredrecyclerview.CenteredSelectionRecyclerView) r0
            r12.A07 = r0
            X.1KB r2 = r12.A05
            r1 = 49
            X.AkC r0 = new X.AkC
            r0.<init>(r12, r1)
            r2.A0J(r0)
            com.whatsapp.collections.centeredrecyclerview.CenteredSelectionRecyclerView r0 = r12.A07
            java.lang.String r4 = "voiceSelectionRecyclerview"
            r2 = 0
            if (r0 != 0) goto L_0x008c
            X.C18070vi.A11(r4)
            throw r2
        L_0x008c:
            r0.setItemAnimator(r2)
            X.10I r9 = r12.A05
            X.1KB r6 = r12.A05
            X.181 r7 = r12.A00
            if (r7 == 0) goto L_0x01cf
            X.1D9 r8 = r12.A09
            if (r8 == 0) goto L_0x01c9
            X.118 r0 = r12.A08
            if (r0 == 0) goto L_0x01c3
            java.io.File r1 = X.C108945cZ.A16(r0)
            java.lang.String r0 = "voice_setting_thumb_cache"
            java.io.File r10 = X.C17880vN.A0e(r1, r0)
            java.lang.String r11 = "voice-setting-thumb"
            X.4Ra r5 = new X.4Ra
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r0 = 16777216(0x1000000, double:8.289046E-317)
            r5.A01 = r0
            r0 = 1
            r5.A05 = r0
            X.4VT r3 = r5.A00()
            X.0vl r5 = r12.A0C
            java.lang.Object r0 = r5.getValue()
            com.whatsapp.bot.metaai.voice.MetaAiVoiceSettingViewModel r0 = (com.whatsapp.bot.metaai.voice.MetaAiVoiceSettingViewModel) r0
            X.5lA r1 = new X.5lA
            r1.<init>(r12, r0, r3)
            r12.A06 = r1
            com.whatsapp.collections.centeredrecyclerview.CenteredSelectionRecyclerView r0 = r12.A07
            if (r0 != 0) goto L_0x00d3
            X.C18070vi.A11(r4)
            throw r2
        L_0x00d3:
            r0.setAdapter(r1)
            com.whatsapp.collections.centeredrecyclerview.CenteredSelectionRecyclerView r1 = r12.A07
            if (r1 != 0) goto L_0x00de
            X.C18070vi.A11(r4)
            throw r2
        L_0x00de:
            X.7Da r0 = new X.7Da
            r0.<init>(r12)
            r1.setCenteredSelectionListener(r0)
            r0 = 2131434053(0x7f0b1a45, float:1.848991E38)
            android.view.View r1 = X.AnonymousClass3MY.A0C(r12, r0)
            com.whatsapp.WaImageView r1 = (com.whatsapp.WaImageView) r1
            r12.A02 = r1
            if (r1 != 0) goto L_0x00f9
            java.lang.String r0 = "voiceOptionPrevButton"
            X.C18070vi.A11(r0)
            throw r2
        L_0x00f9:
            r0 = 46
            X.AnonymousClass3MZ.A1H(r1, r12, r0)
            r0 = 2131433123(0x7f0b16a3, float:1.8488023E38)
            android.view.View r1 = X.AnonymousClass3MY.A0C(r12, r0)
            com.whatsapp.WaImageView r1 = (com.whatsapp.WaImageView) r1
            r12.A01 = r1
            if (r1 != 0) goto L_0x0111
            java.lang.String r0 = "voiceOptionNextButton"
            X.C18070vi.A11(r0)
            throw r2
        L_0x0111:
            r0 = 47
            X.AnonymousClass3MZ.A1H(r1, r12, r0)
            r0 = 2131436912(0x7f0b2570, float:1.8495708E38)
            android.view.View r0 = X.AnonymousClass3MY.A0C(r12, r0)
            com.whatsapp.WaTextView r0 = (com.whatsapp.WaTextView) r0
            r12.A04 = r0
            java.lang.Object r4 = r5.getValue()
            com.whatsapp.bot.metaai.voice.MetaAiVoiceSettingViewModel r4 = (com.whatsapp.bot.metaai.voice.MetaAiVoiceSettingViewModel) r4
            X.1vp r6 = r4.A03
            X.6pw r0 = r4.A02
            X.00H r0 = r0.A03
            android.content.SharedPreferences r1 = X.C108995ce.A0G(r0)
            java.lang.String r0 = "meta_ai_voice_options"
            java.lang.String r1 = X.C17880vN.A0r(r1, r0)
            if (r1 != 0) goto L_0x013b
            java.lang.String r1 = ""
        L_0x013b:
            int r0 = r1.length()
            if (r0 <= 0) goto L_0x016d
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch:{ Exception -> 0x0167 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x0167 }
            java.util.ArrayList r3 = X.AnonymousClass000.A13()     // Catch:{ Exception -> 0x0167 }
            X.Akx r2 = X.A6n.A04(r0)     // Catch:{ Exception -> 0x0167 }
        L_0x014e:
            boolean r0 = r2.hasNext()     // Catch:{ Exception -> 0x0167 }
            if (r0 == 0) goto L_0x016f
            java.lang.Object r1 = r2.next()     // Catch:{ Exception -> 0x0167 }
            org.json.JSONObject r1 = (org.json.JSONObject) r1     // Catch:{ Exception -> 0x0167 }
            r0 = 0
            X.C18070vi.A0d(r1, r0)     // Catch:{ Exception -> 0x0167 }
            com.whatsapp.infra.graphql.generated.aivoice.AiVoiceOptionImpl r0 = new com.whatsapp.infra.graphql.generated.aivoice.AiVoiceOptionImpl     // Catch:{ Exception -> 0x0167 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x0167 }
            r3.add(r0)     // Catch:{ Exception -> 0x0167 }
            goto L_0x014e
        L_0x0167:
            r1 = move-exception
            java.lang.String r0 = "MetaAiVoiceSettingManager: fail to get AiVoiceOptions from shared prefs"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x016d:
            X.0wS r3 = X.C18460wS.A00
        L_0x016f:
            r6.A0F(r3)
            r0 = 0
            com.whatsapp.bot.metaai.voice.MetaAiVoiceSettingViewModel.A03(r4, r0)
            java.lang.Object r0 = r5.getValue()
            com.whatsapp.bot.metaai.voice.MetaAiVoiceSettingViewModel r0 = (com.whatsapp.bot.metaai.voice.MetaAiVoiceSettingViewModel) r0
            X.1vp r1 = r0.A04
            X.7yf r0 = new X.7yf
            r0.<init>(r12)
            r4 = 15
            java.lang.Object r3 = X.AnonymousClass7AT.A00(r12, r1, r5, r0, r4)
            com.whatsapp.bot.metaai.voice.MetaAiVoiceSettingViewModel r3 = (com.whatsapp.bot.metaai.voice.MetaAiVoiceSettingViewModel) r3
            X.1OX r2 = X.C41561wd.A00(r3)
            r1 = 0
            com.whatsapp.bot.metaai.voice.MetaAiVoiceSettingViewModel$loadMetaAiVoiceOptionList$1 r0 = new com.whatsapp.bot.metaai.voice.MetaAiVoiceSettingViewModel$loadMetaAiVoiceOptionList$1
            r0.<init>(r3, r1)
            X.AnonymousClass3MX.A1Q(r0, r2)
            java.lang.Object r0 = r5.getValue()
            com.whatsapp.bot.metaai.voice.MetaAiVoiceSettingViewModel r0 = (com.whatsapp.bot.metaai.voice.MetaAiVoiceSettingViewModel) r0
            X.1wy r1 = r0.A06
            X.7yg r0 = new X.7yg
            r0.<init>(r12)
            java.lang.Object r0 = X.AnonymousClass7AT.A00(r12, r1, r5, r0, r4)
            com.whatsapp.bot.metaai.voice.MetaAiVoiceSettingViewModel r0 = (com.whatsapp.bot.metaai.voice.MetaAiVoiceSettingViewModel) r0
            X.1wy r1 = r0.A07
            X.7yh r0 = new X.7yh
            r0.<init>(r12)
            java.lang.Object r0 = X.AnonymousClass7AT.A00(r12, r1, r5, r0, r4)
            com.whatsapp.bot.metaai.voice.MetaAiVoiceSettingViewModel r0 = (com.whatsapp.bot.metaai.voice.MetaAiVoiceSettingViewModel) r0
            X.1vp r1 = r0.A03
            X.7yi r0 = new X.7yi
            r0.<init>(r12)
            X.AnonymousClass7AT.A01(r12, r1, r0, r4)
            return
        L_0x01c3:
            java.lang.String r0 = "waContext"
            X.C18070vi.A11(r0)
            throw r2
        L_0x01c9:
            java.lang.String r0 = "waHttpClient"
            X.C18070vi.A11(r0)
            throw r2
        L_0x01cf:
            java.lang.String r0 = "statistics"
            X.C18070vi.A11(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.bot.metaai.voice.MetaAiVoiceSettingActivity.onCreate(android.os.Bundle):void");
    }

    public void onPause() {
        super.onPause();
        MetaAiVoiceSettingViewModel metaAiVoiceSettingViewModel = (MetaAiVoiceSettingViewModel) this.A0C.getValue();
        metaAiVoiceSettingViewModel.A05.execute(new C21446AkD(metaAiVoiceSettingViewModel, 1));
    }

    public MetaAiVoiceSettingActivity() {
        this(0);
        this.A0C = C99274sY.A00(new C148787i0(this), new C148777hz(this), new C155267sT(this), AnonymousClass3MW.A15(MetaAiVoiceSettingViewModel.class));
    }
}
