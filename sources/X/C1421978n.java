package X;

import android.view.View;
import com.whatsapp.textstatuscomposer.bottombar.CreationModeBottomBar;

/* renamed from: X.78n  reason: invalid class name and case insensitive filesystem */
public final class C1421978n implements View.OnTouchListener {
    public final /* synthetic */ CreationModeBottomBar A00;

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0017, code lost:
        if (r1 != 3) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r10, android.view.MotionEvent r11) {
        /*
            r9 = this;
            r0 = 1
            X.C18070vi.A0d(r11, r0)
            com.whatsapp.textstatuscomposer.bottombar.CreationModeBottomBar r2 = r9.A00
            X.860 r6 = r2.A08
            r4 = 0
            if (r6 == 0) goto L_0x0019
            int r1 = r11.getAction()
            if (r1 == 0) goto L_0x0137
            if (r1 == r0) goto L_0x00a3
            r0 = 2
            if (r1 == r0) goto L_0x001a
            r0 = 3
            if (r1 == r0) goto L_0x00a3
        L_0x0019:
            return r4
        L_0x001a:
            float r7 = r11.getRawX()
            r11.getRawY()
            float r5 = X.C108945cZ.A03(r2)
            X.7J1 r6 = (X.AnonymousClass7J1) r6
            boolean r0 = r6.A0C
            if (r0 != 0) goto L_0x0019
            float r0 = r6.A02
            float r3 = r7 - r0
            X.6lX r2 = r6.A07
            java.lang.Integer r1 = r2.A00
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            if (r1 != r0) goto L_0x003c
            r6.A00 = r3
            r2.A00()
        L_0x003c:
            r6.A01 = r7
            float r0 = r6.A00
            float r3 = java.lang.Math.abs(r0)
            float r3 = r3 / r5
            X.0vb r0 = r6.A0E
            boolean r2 = X.AnonymousClass3MY.A1b(r0)
            r1 = 0
            float r0 = r6.A00
            if (r2 == 0) goto L_0x009e
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0019
        L_0x0054:
            r0 = 1041194025(0x3e0f5c29, float:0.14)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0019
            boolean r0 = r6.A0D
            if (r0 == 0) goto L_0x0019
            X.72I r1 = r6.A08
            r0 = 1
            r1.A05(r6, r0)
            r6.A0C = r0
            com.whatsapp.statuscomposer.composer.TextStatusComposerFragment r2 = r6.A06
            if (r2 == 0) goto L_0x0083
            com.whatsapp.textstatuscomposer.voice.VoiceRecordingView r0 = r2.A0p
            if (r0 == 0) goto L_0x0083
            X.7Mt r1 = r2.A0q
            if (r1 == 0) goto L_0x0083
            r0 = 1
            X.C145827Mt.A03(r1, r0)
            com.whatsapp.statuscomposer.composer.TextStatusComposerFragment.A0A(r2)
            X.886 r0 = com.whatsapp.statuscomposer.composer.TextStatusComposerFragment.A00(r2)
            if (r0 == 0) goto L_0x0083
            r0.CAO()
        L_0x0083:
            X.1hg r0 = r6.A0I
            X.2tc r2 = X.C108965cb.A0Y(r0)
            boolean r0 = X.C63742tc.A03(r2)
            if (r0 == 0) goto L_0x0019
            X.2HA r1 = X.C63742tc.A00(r2)
            r0 = 28
            X.C108995ce.A1C(r1, r0)
            X.18K r0 = r2.A01
            r0.CC7(r1)
            return r4
        L_0x009e:
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0019
            goto L_0x0054
        L_0x00a3:
            X.7J1 r6 = (X.AnonymousClass7J1) r6
            X.6lX r0 = r6.A07
            java.lang.Integer r1 = r0.A00
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            if (r1 != r0) goto L_0x00de
            boolean r0 = r6.A0B
            if (r0 == 0) goto L_0x0019
            X.72I r5 = r6.A08
            X.1zP r2 = r5.A02
            java.util.concurrent.CopyOnWriteArraySet r3 = r2.A04
            r3.clear()
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r2.A01(r0)
            r2 = 1073741824(0x40000000, float:2.0)
            r1 = 1065353216(0x3f800000, float:1.0)
            X.5qA r0 = new X.5qA
            r0.<init>(r5, r2, r1)
            r3.add(r0)
            r6.A0B = r4
            com.whatsapp.statuscomposer.composer.TextStatusComposerFragment r0 = r6.A06
            if (r0 == 0) goto L_0x0019
            com.whatsapp.statuscomposer.composer.TextStatusComposerFragment.A0F(r0)
            X.886 r0 = com.whatsapp.statuscomposer.composer.TextStatusComposerFragment.A00(r0)
            if (r0 == 0) goto L_0x0019
            r0.CAO()
            return r4
        L_0x00de:
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            if (r1 != r0) goto L_0x0019
            boolean r0 = r6.A0C
            if (r0 != 0) goto L_0x0019
            long r7 = android.os.SystemClock.elapsedRealtime()
            long r0 = r6.A04
            long r7 = r7 - r0
            r1 = 1000(0x3e8, double:4.94E-321)
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x01b2
            com.whatsapp.statuscomposer.composer.TextStatusComposerFragment r5 = r6.A06
            if (r5 == 0) goto L_0x0120
            com.whatsapp.textstatuscomposer.voice.VoiceRecordingView r0 = r5.A0p
            if (r0 == 0) goto L_0x0120
            X.7Mt r3 = r5.A0q
            if (r3 == 0) goto L_0x0120
            X.5dl r2 = r3.A06
            if (r2 == 0) goto L_0x0112
            android.os.Handler r1 = r2.A03
            if (r1 == 0) goto L_0x010f
            r0 = 1
            X.7RC r0 = X.AnonymousClass7RC.A00(r2, r0)
            r1.post(r0)
        L_0x010f:
            X.C145827Mt.A03(r3, r4)
        L_0x0112:
            X.886 r0 = com.whatsapp.statuscomposer.composer.TextStatusComposerFragment.A00(r5)
            if (r0 == 0) goto L_0x011d
            com.whatsapp.statuscomposer.ConsolidatedStatusComposerActivity r0 = (com.whatsapp.statuscomposer.ConsolidatedStatusComposerActivity) r0
            com.whatsapp.statuscomposer.ConsolidatedStatusComposerActivity.A0d(r0, r4)
        L_0x011d:
            com.whatsapp.statuscomposer.composer.TextStatusComposerFragment.A08(r5)
        L_0x0120:
            X.72I r1 = r6.A08
            r1.A02()
            X.8AJ r0 = r6.A0J
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r1.A04(r0)
            X.6Ip r0 = new X.6Ip
            r0.<init>(r6)
            r6.A07 = r0
            r0.A00()
            return r4
        L_0x0137:
            float r0 = r11.getRawX()
            r11.getRawY()
            X.7J1 r6 = (X.AnonymousClass7J1) r6
            r6.A02 = r0
            r6.A01 = r0
            X.70C r1 = r6.A0H
            X.1FU r0 = r6.A05
            boolean r0 = r1.A05(r0)
            if (r0 == 0) goto L_0x0019
            X.6lX r0 = r6.A07
            java.lang.Integer r1 = r0.A00
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            if (r1 != r0) goto L_0x0198
            X.8AJ r2 = r6.A0J
            com.whatsapp.textstatuscomposer.bottombar.CreationModeBottomBar r2 = (com.whatsapp.textstatuscomposer.bottombar.CreationModeBottomBar) r2
            X.6my r0 = r2.A0A
            if (r0 != 0) goto L_0x016c
            android.app.Activity r1 = X.AnonymousClass3Ma.A05(r2)
            X.88X r0 = r2.getVoiceNotePermissionCheckerFactory()
            X.6my r0 = r0.BGi(r1)
            r2.A0A = r0
        L_0x016c:
            boolean r1 = r0.A00()
            r0 = 1
            if (r1 != r0) goto L_0x0198
            X.72I r5 = r6.A08
            X.11C r0 = r5.A04
            if (r0 == 0) goto L_0x01d6
            X.C84094Hv.A00(r0)
            X.1zP r3 = r5.A02
            java.util.concurrent.CopyOnWriteArraySet r2 = r3.A04
            r2.clear()
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r3.A00(r0)
            r0 = 4611686018427387904(0x4000000000000000, double:2.0)
            r3.A01(r0)
            X.6Is r0 = new X.6Is
            r0.<init>(r6, r5)
            r2.add(r0)
            r0 = 1
            r6.A0B = r0
        L_0x0198:
            com.whatsapp.statuscomposer.composer.TextStatusComposerFragment r2 = r6.A06
            if (r2 == 0) goto L_0x0019
            android.view.View r1 = r2.A03
            if (r1 == 0) goto L_0x01a8
            r0 = 8
            r1.clearAnimation()
            r1.setVisibility(r0)
        L_0x01a8:
            X.1KB r1 = r2.A0K
            if (r1 == 0) goto L_0x01d2
            java.lang.Runnable r0 = r2.A1L
            r1.A0I(r0)
            return r4
        L_0x01b2:
            com.whatsapp.statuscomposer.composer.TextStatusComposerFragment r2 = r6.A06
            if (r2 == 0) goto L_0x01ce
            com.whatsapp.textstatuscomposer.voice.VoiceRecordingView r0 = r2.A0p
            if (r0 == 0) goto L_0x01ce
            X.7Mt r1 = r2.A0q
            if (r1 == 0) goto L_0x01ce
            r0 = 1
            X.C145827Mt.A03(r1, r0)
            com.whatsapp.statuscomposer.composer.TextStatusComposerFragment.A0A(r2)
            X.886 r0 = com.whatsapp.statuscomposer.composer.TextStatusComposerFragment.A00(r2)
            if (r0 == 0) goto L_0x01ce
            r0.CAO()
        L_0x01ce:
            X.AnonymousClass7J1.A01(r6)
            return r4
        L_0x01d2:
            X.AnonymousClass3MW.A1C()
            goto L_0x01d9
        L_0x01d6:
            X.AnonymousClass3MW.A1N()
        L_0x01d9:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1421978n.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public C1421978n(CreationModeBottomBar creationModeBottomBar) {
        this.A00 = creationModeBottomBar;
    }
}
