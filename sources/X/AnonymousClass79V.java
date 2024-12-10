package X;

import android.widget.SeekBar;
import com.whatsapp.textstatuscomposer.voice.VoiceRecordingView;

/* renamed from: X.79V  reason: invalid class name */
public class AnonymousClass79V implements SeekBar.OnSeekBarChangeListener {
    public final int A00;
    public final Object A01;

    public AnonymousClass79V(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        int i2 = this.A00;
        Object obj = this.A01;
        if (i2 != 0) {
            AnonymousClass74M.A0F((AnonymousClass74M) obj, i, z);
            return;
        }
        VoiceRecordingView voiceRecordingView = (VoiceRecordingView) obj;
        AnonymousClass862 r1 = voiceRecordingView.A0B;
        if (r1 != null) {
            C145847Mv.A02((C145847Mv) r1, voiceRecordingView.A0D.getProgress(), z);
        }
    }

    public void onStartTrackingTouch(SeekBar seekBar) {
        if (this.A00 != 0) {
            AnonymousClass74M r5 = (AnonymousClass74M) this.A01;
            r5.A1A.A02++;
            if (r5.A0I != null) {
                r5.A0T.removeCallbacks(r5.A1J);
                r5.A04 = -1;
                return;
            }
            return;
        }
        VoiceRecordingView voiceRecordingView = (VoiceRecordingView) this.A01;
        AnonymousClass862 r3 = voiceRecordingView.A0B;
        if (r3 != null) {
            int progress = voiceRecordingView.A0D.getProgress();
            C145847Mv r32 = (C145847Mv) r3;
            AnonymousClass1DT r1 = r32.A08;
            Object A06 = r1.A06();
            if (A06 != null) {
                r32.A01 = (C123326Tz) A06;
                r1.A0F(new C121256It(r32));
                AnonymousClass70T r0 = r32.A02;
                if (r0 != null) {
                    r0.A04();
                }
                r32.A04.removeCallbacks(r32.A03);
                C145847Mv.A02(r32, progress, false);
            } else {
                throw C17890vO.A0K();
            }
        }
        voiceRecordingView.setupPreviewProgressIndicatorSizes(true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0045  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onStopTrackingTouch(android.widget.SeekBar r6) {
        /*
            r5 = this;
            int r0 = r5.A00
            if (r0 == 0) goto L_0x000c
            java.lang.Object r0 = r5.A01
            X.74M r0 = (X.AnonymousClass74M) r0
            X.AnonymousClass74M.A05(r0)
        L_0x000b:
            return
        L_0x000c:
            java.lang.Object r3 = r5.A01
            com.whatsapp.textstatuscomposer.voice.VoiceRecordingView r3 = (com.whatsapp.textstatuscomposer.voice.VoiceRecordingView) r3
            X.862 r2 = r3.A0B
            if (r2 == 0) goto L_0x000b
            com.whatsapp.voicerecorder.VoiceNoteSeekBar r0 = r3.A0D
            int r1 = r0.getProgress()
            X.7Mv r2 = (X.C145847Mv) r2
            r0 = 1
            X.C145847Mv.A02(r2, r1, r0)
            X.6Tz r1 = r2.A01
            if (r1 == 0) goto L_0x00ba
            boolean r0 = r1 instanceof X.C121256It
            if (r0 == 0) goto L_0x0093
            java.lang.String r0 = "VoiceRecordingPreviewController: previous state before dragging is dragging"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x002d:
            X.6Iv r4 = new X.6Iv
            r4.<init>(r2)
        L_0x0032:
            boolean r0 = r4 instanceof X.C121256It
            if (r0 == 0) goto L_0x0045
            java.lang.String r0 = "VoiceRecordingPreviewController: nextState is Dragging. This should never happen."
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x003b:
            X.1DT r0 = r2.A08
            r0.A0F(r4)
            r0 = 0
            r3.setupPreviewProgressIndicatorSizes(r0)
            return
        L_0x0045:
            boolean r0 = r4 instanceof X.AnonymousClass6Iu
            if (r0 != 0) goto L_0x003b
            boolean r0 = r4 instanceof X.AnonymousClass6Iv
            if (r0 == 0) goto L_0x0068
            X.70T r1 = r2.A02
            if (r1 == 0) goto L_0x0060
            X.1DT r0 = r2.A07
            java.lang.Object r0 = r0.A06()
            if (r0 == 0) goto L_0x00ab
            int r0 = X.AnonymousClass000.A0M(r0)
            r1.A0A(r0)
        L_0x0060:
            android.os.Handler r1 = r2.A04
            java.lang.Runnable r0 = r2.A03
            r1.post(r0)
            goto L_0x003b
        L_0x0068:
            boolean r0 = r4 instanceof X.AnonymousClass6Iw
            if (r0 == 0) goto L_0x003b
            android.os.Handler r1 = r2.A04
            java.lang.Runnable r0 = r2.A03
            r1.post(r0)
            X.70T r1 = r2.A02
            if (r1 == 0) goto L_0x0086
            X.1DT r0 = r2.A07
            java.lang.Object r0 = r0.A06()
            if (r0 == 0) goto L_0x00b0
            int r0 = X.AnonymousClass000.A0M(r0)
            r1.A0A(r0)
        L_0x0086:
            X.70T r0 = r2.A02
            if (r0 == 0) goto L_0x008d
            r0.A07()
        L_0x008d:
            X.6uN r0 = r2.A0I
            r0.A01()
            goto L_0x003b
        L_0x0093:
            boolean r0 = r1 instanceof X.AnonymousClass6Iu
            if (r0 == 0) goto L_0x009d
            X.6Iu r4 = new X.6Iu
            r4.<init>(r2)
            goto L_0x0032
        L_0x009d:
            boolean r0 = r1 instanceof X.AnonymousClass6Iv
            if (r0 != 0) goto L_0x002d
            boolean r0 = r1 instanceof X.AnonymousClass6Iw
            if (r0 == 0) goto L_0x00b5
            X.6Iw r4 = new X.6Iw
            r4.<init>(r2)
            goto L_0x0032
        L_0x00ab:
            java.lang.IllegalArgumentException r0 = X.C17890vO.A0K()
            throw r0
        L_0x00b0:
            java.lang.IllegalArgumentException r0 = X.C17890vO.A0K()
            throw r0
        L_0x00b5:
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        L_0x00ba:
            java.lang.IllegalArgumentException r0 = X.C17890vO.A0K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass79V.onStopTrackingTouch(android.widget.SeekBar):void");
    }
}
