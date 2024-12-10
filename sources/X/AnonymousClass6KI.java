package X;

import android.view.View;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaButtonWithLoader;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.updates.ui.UpdatesFragment;
import com.whatsapp.wds.components.profilephoto.WDSProfilePhoto;

/* renamed from: X.6KI  reason: invalid class name */
public final class AnonymousClass6KI extends C113585nK {
    public C121336Jg A00;
    public final AnonymousClass6l4 A01;
    public final TextEmojiLabel A02;
    public final C42141xh A03;
    public final WaImageView A04;
    public final WaTextView A05;
    public final C37451pZ A06;
    public final AnonymousClass1c4 A07;
    public final C131616lO A08;
    public final AnonymousClass4XM A09;
    public final UpdatesFragment A0A;
    public final C28931bI A0B;
    public final C28931bI A0C;
    public final WDSProfilePhoto A0D;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass6KI(View view, AnonymousClass6l4 r7, C72043Kk r8, C37451pZ r9, AnonymousClass1c4 r10, C131616lO r11, AnonymousClass4XM r12, UpdatesFragment updatesFragment) {
        super(view);
        C18070vi.A0g(r11, 4, r10);
        C18070vi.A0q(r12, r7, r8);
        this.A0A = updatesFragment;
        this.A06 = r9;
        this.A08 = r11;
        this.A07 = r10;
        this.A09 = r12;
        this.A01 = r7;
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) AnonymousClass3MX.A0C(view, 2131433058);
        this.A02 = textEmojiLabel;
        this.A05 = C72453Mb.A0g(view, 2131433010);
        WaImageView waImageView = (WaImageView) AnonymousClass3MX.A0C(view, 2131434283);
        this.A04 = waImageView;
        C28931bI A0s = C72453Mb.A0s(view, 2131434282);
        this.A0B = A0s;
        this.A0D = (WDSProfilePhoto) AnonymousClass3MX.A0C(view, 2131433002);
        this.A0C = C72453Mb.A0s(view, 2131434285);
        this.A03 = C42141xh.A01(view, r8, 2131433058);
        AnonymousClass3Ma.A1E(view, this, 49);
        AnonymousClass78L.A00(waImageView, this, 0);
        WaButtonWithLoader waButtonWithLoader = (WaButtonWithLoader) A0s.A02();
        if (r11.A00(AnonymousClass3MY.A04(waButtonWithLoader))) {
            C109005cf.A0S(textEmojiLabel, waButtonWithLoader);
            waButtonWithLoader.A00 = new AnonymousClass78L(this, 1);
        }
        if (!C113585nK.A00(view)) {
            C43421zm.A04(textEmojiLabel);
        }
    }
}
