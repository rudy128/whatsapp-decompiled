package X;

import android.view.View;
import android.widget.ImageView;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.components.SelectionCheckView;

/* renamed from: X.28l  reason: invalid class name and case insensitive filesystem */
public class C453128l extends C42011xT {
    public boolean A00;
    public final ImageView A01;
    public final AnonymousClass190 A02;
    public final TextEmojiLabel A03;
    public final SelectionCheckView A04;
    public final C37451pZ A05;
    public final C19830z4 A06;
    public final C28931bI A07;
    public final C28931bI A08;

    public C453128l(View view, AnonymousClass190 r7, C37451pZ r8, C19830z4 r9) {
        super(view);
        this.A02 = r7;
        this.A05 = r8;
        this.A06 = r9;
        View view2 = this.A0H;
        this.A01 = (ImageView) AnonymousClass1HF.A06(view2, 2131429244);
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) AnonymousClass1HF.A06(view2, 2131429287);
        this.A03 = textEmojiLabel;
        this.A07 = C28931bI.A00(view2, 2131429274);
        this.A08 = C28931bI.A00(view2, 2131429295);
        this.A04 = (SelectionCheckView) AnonymousClass1HF.A06(view, 2131429280);
        AnonymousClass1Y5.A0A(view, true);
        AnonymousClass1Y5.A0B(view, new C43061zB(16, 2131888525));
        C43421zm.A04(textEmojiLabel);
    }
}
