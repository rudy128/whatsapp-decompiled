package X;

import android.view.Surface;
import com.facebook.wearable.mediastream.model.SUPToggleState;

/* renamed from: X.DWb  reason: case insensitive filesystem */
public class C27140DWb implements C18080vj, C22821Di {
    public final int A00;
    public final Object A01;

    public final Object invoke(Object obj) {
        Object obj2 = obj;
        switch (this.A00) {
            case 0:
                AnonymousClass1GV r0 = (AnonymousClass1GV) this.A01;
                C18070vi.A0h(r0, obj);
                r0.accept(obj);
                break;
            case 1:
                C26996DOs dOs = (C26996DOs) this.A01;
                Surface surface = (Surface) obj2;
                boolean A15 = C18070vi.A15(dOs, surface);
                Surface surface2 = dOs.A00;
                if (surface2 != null) {
                    surface2.release();
                }
                dOs.A00 = surface;
                C24712CGy.A01.A02("sup:SUPDelegate", "Configuring new surface");
                C26226CvH cvH = dOs.A0E;
                if (cvH.A0N) {
                    cvH.A05().A09(A15);
                    cvH.A05().A05(surface);
                    break;
                }
                break;
            case 2:
                C26996DOs dOs2 = (C26996DOs) this.A01;
                C24867CNl cNl = (C24867CNl) obj2;
                C18070vi.A0h(dOs2, cNl);
                SUPToggleState updatedStatusIndicatorAttributes = dOs2.A01.getUpdatedStatusIndicatorAttributes((Boolean) null, cNl, (Boolean) null, (Boolean) null, (Boolean) null);
                if (updatedStatusIndicatorAttributes != null) {
                    dOs2.A01 = updatedStatusIndicatorAttributes;
                    break;
                }
                break;
            case 3:
                AnonymousClass2I0 r5 = (AnonymousClass2I0) obj2;
                C18070vi.A0d(r5, 1);
                BE7.A1D(r5, C437120q.class);
                r5.A00 = ((C23868BrP) this.A01).A00;
                break;
            case 4:
                Object obj3 = this.A01;
                AnonymousClass2I3 r52 = (AnonymousClass2I3) obj2;
                C18070vi.A0d(r52, 1);
                BE9.A1A(r52, AnonymousClass4XQ.class);
                r52.A03(new C27140DWb(obj3, 3));
                break;
            case 5:
                C18070vi.A0d(obj, 1);
                ((C17330uU) this.A01).setValue(obj);
                break;
            default:
                C17330uU r3 = (C17330uU) this.A01;
                C18070vi.A0d(r3, 0);
                r3.setValue(new C26142Ct5(((C26142Ct5) obj2).A00));
                break;
        }
        return C27621Wu.A00;
    }

    public C27140DWb(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}
