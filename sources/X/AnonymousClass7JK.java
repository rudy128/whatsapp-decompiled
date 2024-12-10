package X;

import com.whatsapp.mediacomposer.MediaComposerActivity;
import com.whatsapp.mediacomposer.MediaComposerFragment;
import com.whatsapp.mediacomposer.doodle.ColorPickerComponent;

/* renamed from: X.7JK  reason: invalid class name */
public class AnonymousClass7JK implements AnonymousClass89A {
    public final int A00;
    public final Object A01;

    public AnonymousClass7JK(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void BwM(C133706pM r5) {
        MediaComposerFragment mediaComposerFragment;
        C136986uj A0U;
        C109205cz r0;
        C139616z9 r1;
        int i;
        if (this.A00 != 0) {
            if (r5 instanceof C1197569s) {
                C109205cz r12 = (C109205cz) this.A01;
                AnonymousClass6UC r02 = r12.A0I;
                int i2 = ((C1197569s) r5).A00;
                r02.A00 = i2;
                C139616z9 r13 = r12.A08;
                if (r13 != null) {
                    r13.A01(r13.A01, i2);
                    return;
                }
            } else if (r5 instanceof C1197869v) {
                int i3 = ((C1197869v) r5).A02;
                int i4 = 1;
                if (i3 != 1) {
                    i4 = 2;
                    if (i3 != 2) {
                        i4 = 3;
                        C109205cz r03 = (C109205cz) this.A01;
                        if (i3 != 3) {
                            C139616z9 r2 = r03.A08;
                            if (r2 != null) {
                                if (!r2.A02) {
                                    C133396og r14 = r2.A0A;
                                    r14.A00(4);
                                    r2.A03 = true;
                                    r14.A01(r2.A07);
                                    r2.A01 = r2.A06;
                                    return;
                                }
                                return;
                            }
                        } else {
                            r1 = r03.A08;
                            if (r1 != null) {
                                i = r03.A0E;
                            }
                        }
                    } else {
                        C109205cz r04 = (C109205cz) this.A01;
                        r1 = r04.A08;
                        if (r1 != null) {
                            i = r04.A0D;
                        }
                    }
                } else {
                    C109205cz r05 = (C109205cz) this.A01;
                    r1 = r05.A08;
                    if (r1 != null) {
                        i = r05.A0F;
                    }
                }
                r1.A02(i4, i);
                return;
            } else if (r5 instanceof C1197669t) {
                AnonymousClass7JF r22 = ((C109205cz) this.A01).A0J;
                C109205cz r06 = r22.A03;
                if (!(r06 == null || !r06.isShowing() || (r0 = r22.A03) == null)) {
                    r0.hide();
                }
                mediaComposerFragment = r22.A0J.A00;
                mediaComposerFragment.A00 = 1;
            } else {
                return;
            }
            C18070vi.A11("penDialogController");
            throw null;
        }
        int i5 = r5.A02;
        if (i5 == 1) {
            ColorPickerComponent.A02((ColorPickerComponent) this.A01);
            return;
        } else if (i5 == 3) {
            ColorPickerComponent colorPickerComponent = (ColorPickerComponent) this.A01;
            colorPickerComponent.A05(false);
            AnonymousClass87O r15 = colorPickerComponent.A00;
            if (r15 != null) {
                AnonymousClass7J4 r16 = (AnonymousClass7J4) r15;
                if (r16.A00 == 0) {
                    mediaComposerFragment = ((AnonymousClass7JF) r16.A01).A0J.A00;
                    mediaComposerFragment.A00 = 2;
                    C160888Ai A29 = mediaComposerFragment.A29();
                    if (!(A29 == null || (A0U = C108955ca.A0U((MediaComposerActivity) A29)) == null)) {
                        A0U.A02();
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        } else {
            return;
        }
        C1422878w r07 = mediaComposerFragment.A0K;
        if (r07 != null) {
            r07.A05();
        }
    }

    public void C8q(int i) {
    }
}
