package X;

import com.whatsapp.collections.AutoFitGridLayoutManager;
import com.whatsapp.conversation.waveforms.VoiceVisualizer;
import com.whatsapp.textstatuscomposer.voice.VoiceRecordingView;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.79u  reason: invalid class name and case insensitive filesystem */
public class C1425279u implements AnonymousClass1GV {
    public final int A00;
    public final Object A01;

    public C1425279u(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [X.6Xl, java.lang.Object] */
    public final void accept(Object obj) {
        switch (this.A00) {
            case 0:
                AutoFitGridLayoutManager autoFitGridLayoutManager = (AutoFitGridLayoutManager) this.A01;
                autoFitGridLayoutManager.A02 = true;
                autoFitGridLayoutManager.A0Q();
                return;
            case 1:
                C145827Mt r1 = (C145827Mt) this.A01;
                List list = (List) obj;
                C18070vi.A0d(list, 1);
                r1.A05 = null;
                VoiceVisualizer voiceVisualizer = ((VoiceRecordingView) r1.A0H).A07;
                if (voiceVisualizer == null) {
                    C18070vi.A11("previewVoiceVisualizer");
                    throw null;
                }
                voiceVisualizer.A03(list, 0.0f);
                C145827Mt.A01(r1);
                File file = r1.A08;
                if (file != null) {
                    AnonymousClass6a0 r0 = r1.A0E;
                    AnonymousClass88G r10 = r1.A0I;
                    AnonymousClass10E r3 = r0.A00.A02;
                    AnonymousClass118 A0l = AnonymousClass3MZ.A0l(r3);
                    C18030ve A8r = AnonymousClass10E.A8r(r3);
                    AnonymousClass1KB A12 = AnonymousClass10E.A12(r3);
                    AnonymousClass190 A0N = AnonymousClass3MY.A0N(r3);
                    ? obj2 = new Object();
                    AnonymousClass10G r2 = r3.A00;
                    C145847Mv r32 = new C145847Mv(A0N, A12, A0l, A8r, C108965cb.A0Z(r3), obj2, r10, (C136776uN) r2.A0G.get(), C000200d.A00(r2.A2V), file);
                    r1.A07 = r32;
                    r32.A00 = r1;
                    return;
                }
                return;
            default:
                C145827Mt r4 = (C145827Mt) this.A01;
                List<Object> list2 = (List) obj;
                C18070vi.A0d(list2, 1);
                ArrayList A0D = C29351c6.A0D(list2);
                for (Object A04 : list2) {
                    A0D.add(Byte.valueOf((byte) ((int) (AnonymousClass000.A04(A04) * 100.0f))));
                }
                r4.A0B = C29431cG.A1A(A0D);
                return;
        }
    }
}
