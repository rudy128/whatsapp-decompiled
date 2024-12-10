package X;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaButtonWithLoader;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.wds.components.profilephoto.WDSProfilePhoto;

/* renamed from: X.6BQ  reason: invalid class name */
public final class AnonymousClass6BQ extends C112945mI {
    public final AnonymousClass2XY A00;
    public final TextEmojiLabel A01;
    public final WaImageView A02;
    public final WaTextView A03;
    public final C37451pZ A04;
    public final AnonymousClass1c4 A05;
    public final C131616lO A06;
    public final AnonymousClass4XM A07;
    public final AnonymousClass89H A08;
    public final C28931bI A09;
    public final C28931bI A0A;
    public final C28931bI A0B;
    public final WDSProfilePhoto A0C;
    public final AnonymousClass00H A0D;
    public final ConstraintLayout A0E;
    public final ConstraintLayout A0F;
    public final C19880zA A0G;
    public final C19880zA A0H;
    public final AnonymousClass2XX A0I;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass6BQ(View view, C19880zA r5, C19880zA r6, AnonymousClass2XX r7, AnonymousClass2XY r8, C37451pZ r9, AnonymousClass1c4 r10, C131616lO r11, AnonymousClass4XM r12, AnonymousClass89H r13, AnonymousClass00H r14) {
        super(view);
        C72473Md.A1M(r9, r14, r5, 3);
        C18070vi.A0x(r11, r12, r10, r6, r7);
        C18070vi.A0d(r8, 11);
        this.A08 = r13;
        this.A04 = r9;
        this.A0D = r14;
        this.A0H = r5;
        this.A06 = r11;
        this.A07 = r12;
        this.A05 = r10;
        this.A0G = r6;
        this.A0I = r7;
        this.A00 = r8;
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) AnonymousClass3MX.A0C(view, 2131433058);
        this.A01 = textEmojiLabel;
        this.A03 = C72453Mb.A0g(view, 2131433010);
        this.A02 = (WaImageView) AnonymousClass3MX.A0C(view, 2131434283);
        C28931bI A0s = C72453Mb.A0s(view, 2131434282);
        this.A09 = A0s;
        this.A0C = (WDSProfilePhoto) AnonymousClass3MX.A0C(view, 2131433002);
        this.A0A = C72453Mb.A0s(view, 2131434285);
        this.A0E = (ConstraintLayout) AnonymousClass3MX.A0C(view, 2131433004);
        this.A0F = (ConstraintLayout) AnonymousClass3MX.A0C(view, 2131433035);
        this.A0B = C72453Mb.A0s(view, 2131433063);
        WaButtonWithLoader waButtonWithLoader = (WaButtonWithLoader) A0s.A02();
        if (r11.A00(AnonymousClass3MY.A04(waButtonWithLoader))) {
            C109005cf.A0S(textEmojiLabel, waButtonWithLoader);
        }
        if (!AnonymousClass1J8.A09((C18030ve) r14.get())) {
            C43421zm.A04(textEmojiLabel);
        }
    }
}
