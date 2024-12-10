package X;

import android.content.Context;
import android.text.TextPaint;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.35i  reason: invalid class name and case insensitive filesystem */
public class C689535i implements C437120q {
    public final AnonymousClass1KW A00;
    public final AnonymousClass12F A01;
    public final AnonymousClass1KW A02;

    public boolean CS5() {
        return false;
    }

    public boolean Bfs(AnonymousClass206 r4) {
        C20285AEt BPK = ((AnonymousClass21K) r4).BPK();
        boolean z = false;
        if (BPK != null && BPK.A03()) {
            z = true;
        }
        return !z;
    }

    public boolean Bgn(AnonymousClass206 r4) {
        C20285AEt BPK = ((AnonymousClass21K) r4).BPK();
        boolean z = false;
        if (BPK != null && BPK.A03()) {
            z = true;
        }
        return !z;
    }

    public C689535i(AnonymousClass12F r1, AnonymousClass1KW r2) {
        C18070vi.A0j(r2, r1);
        this.A00 = r2;
        this.A02 = r2;
        this.A01 = r1;
    }

    public void CFC(C135396s8 r7, AnonymousClass206 r8) {
        C18070vi.A0h(r8, r7);
        TextEmojiLabel textEmojiLabel = r7.A02;
        AnonymousClass12F r2 = this.A01;
        Context context = textEmojiLabel.getContext();
        C18070vi.A0X(context);
        TextPaint paint = textEmojiLabel.getPaint();
        C18070vi.A0X(paint);
        CharSequence A0B = r2.A0B(context, paint, r8);
        textEmojiLabel.setText(C43251zV.A02(textEmojiLabel.getContext(), textEmojiLabel.getPaint(), new C95874mw(1, 512), this.A00, A0B));
    }
}
