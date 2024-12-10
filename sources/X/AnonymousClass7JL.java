package X;

import com.whatsapp.mediacomposer.MediaComposerFragment;
import com.whatsapp.mediacomposer.doodle.textentry.DoodleEditText;
import com.whatsapp.mediacomposer.doodle.textentry.TextEntryView;

/* renamed from: X.7JL  reason: invalid class name */
public final class AnonymousClass7JL implements AnonymousClass89A {
    public final /* synthetic */ AnonymousClass8BD A00;
    public final /* synthetic */ C130396jM A01;
    public final /* synthetic */ TextEntryView A02;

    public AnonymousClass7JL(AnonymousClass8BD r1, C130396jM r2, TextEntryView textEntryView) {
        this.A02 = textEntryView;
        this.A01 = r2;
        this.A00 = r1;
    }

    public void BwM(C133706pM r4) {
        if (r4 instanceof C1197769u) {
            AnonymousClass8BD r1 = this.A02.A06;
            if (r1 != null) {
                r1.CQh(((C1197769u) r4).A00);
                return;
            }
            C18070vi.A11("listener");
        } else if (r4 instanceof C1197569s) {
            C130396jM r0 = this.A01;
            int i = ((C1197569s) r4).A00;
            AnonymousClass6pZ r12 = r0.A06;
            r12.A03 = i;
            r12.A01(i, r12.A02);
            DoodleEditText doodleEditText = this.A02.A05;
            if (doodleEditText == null) {
                C18070vi.A11("doodleEditText");
            } else {
                doodleEditText.A0L(i);
                return;
            }
        } else if (r4 instanceof C1197669t) {
            AnonymousClass8BD r02 = this.A02.A06;
            if (r02 != null) {
                AnonymousClass7JF r13 = ((AnonymousClass7JH) r02).A03;
                C109225d1 r03 = r13.A04;
                if (r03 != null) {
                    r03.hide();
                }
                MediaComposerFragment mediaComposerFragment = r13.A0J.A00;
                mediaComposerFragment.A00 = 0;
                C1422878w r04 = mediaComposerFragment.A0K;
                if (r04 != null) {
                    r04.A05();
                    return;
                }
                return;
            }
            C18070vi.A11("listener");
        } else {
            return;
        }
        throw null;
    }

    public void C8q(int i) {
        ((AnonymousClass7JH) this.A00).A00 = i;
    }
}
