package X;

import com.whatsapp.calling.areffects.CallArEffectsViewModel;
import com.whatsapp.util.Log;

/* renamed from: X.4hW  reason: invalid class name and case insensitive filesystem */
public class C92554hW implements C107085Yi {
    public final int A00;
    public final Object A01;

    public C92554hW(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void BIg(C92364hB r5) {
        int i = this.A00;
        Object obj = this.A01;
        if (i != 0) {
            C75603ho r1 = (C75603ho) obj;
            C18070vi.A0h(r1, r5);
            Log.i("CameraArEffectsViewModel/Disabling effect");
            C160978Av r0 = r1.A07.A0K;
            if (r0 == null) {
                C18070vi.A11("camera");
                throw null;
            } else {
                r0.BIe(r5);
            }
        } else {
            CallArEffectsViewModel callArEffectsViewModel = (CallArEffectsViewModel) obj;
            boolean A15 = C18070vi.A15(callArEffectsViewModel, r5);
            Log.i("CallArEffectsViewModel/Disabling effect");
            C28596E9n A002 = ((AnonymousClass4RN) callArEffectsViewModel.A08.get()).A00();
            if (A002 != null) {
                C26983DOf dOf = (C26983DOf) A002;
                synchronized (dOf) {
                    ((C195109so) dOf.A0C.getValue()).A02(r5);
                    if (r5.A00 == AnonymousClass4DE.LOW_LIGHT) {
                        ((DDm) dOf.A0G.getValue()).A04 = A15;
                    }
                }
            }
        }
    }
}
