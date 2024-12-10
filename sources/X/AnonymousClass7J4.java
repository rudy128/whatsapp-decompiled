package X;

import com.whatsapp.mediacomposer.doodle.ColorPickerComponent;
import com.whatsapp.mediacomposer.doodle.ColorPickerView;

/* renamed from: X.7J4  reason: invalid class name */
public class AnonymousClass7J4 implements AnonymousClass87O {
    public final int A00;
    public final Object A01;

    public AnonymousClass7J4(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void C9Z() {
        boolean z;
        boolean z2;
        if (this.A00 != 0) {
            C109205cz r5 = (C109205cz) this.A01;
            AnonymousClass6UC r1 = r5.A0I;
            ColorPickerComponent colorPickerComponent = r5.A07;
            if (colorPickerComponent != null) {
                r1.A00 = colorPickerComponent.getSelectedColor();
                C139616z9 r3 = r5.A08;
                if (r3 == null) {
                    C18070vi.A11("penDialogController");
                } else {
                    ColorPickerComponent colorPickerComponent2 = r5.A07;
                    if (colorPickerComponent2 != null) {
                        r3.A01((int) colorPickerComponent2.getSelectedStrokeSize(), colorPickerComponent2.getSelectedColor());
                        C109455dT r32 = r5.A09;
                        if (r32 != null) {
                            ColorPickerComponent colorPickerComponent3 = r5.A07;
                            if (colorPickerComponent3 != null) {
                                r32.A00(colorPickerComponent3.getSelectedColor(), colorPickerComponent3.getSelectedStrokeSize());
                                C109455dT r12 = r5.A09;
                                if (r12 != null) {
                                    ColorPickerComponent colorPickerComponent4 = r5.A07;
                                    if (colorPickerComponent4 != null) {
                                        ColorPickerView colorPickerView = colorPickerComponent4.A01;
                                        if (colorPickerView != null) {
                                            z2 = colorPickerView.A06;
                                        } else {
                                            z2 = false;
                                        }
                                        r12.A05 = z2;
                                        return;
                                    }
                                }
                            }
                        }
                        C18070vi.A11("penButtonBackground");
                    }
                }
                throw null;
            }
            C18070vi.A11("colorPicker");
            throw null;
        }
        AnonymousClass7JF r7 = (AnonymousClass7JF) this.A01;
        AnonymousClass6UC r6 = r7.A0M;
        ColorPickerComponent colorPickerComponent5 = r7.A0L;
        r6.A00 = colorPickerComponent5.getSelectedColor();
        AnonymousClass7JF.A05(r7);
        C136986uj r4 = r7.A0W;
        float selectedStrokeSize = colorPickerComponent5.getSelectedStrokeSize();
        int i = r6.A00;
        ColorPickerView colorPickerView2 = colorPickerComponent5.A01;
        if (colorPickerView2 != null) {
            z = colorPickerView2.A06;
        } else {
            z = false;
        }
        r4.A06(selectedStrokeSize, i, z, false);
        C109005cf.A0m(colorPickerComponent5, r6, r7);
    }
}
